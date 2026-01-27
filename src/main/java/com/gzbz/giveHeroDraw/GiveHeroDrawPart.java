package com.gzbz.giveHeroDraw;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.GiveHeroDrawDao;
import com.gzbz.db.HeroDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRecruitmentPart;
import com.gzbz.model.HeroEmployeeModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.HundredStrokesJPModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.GiveHeroDrawMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class GiveHeroDrawPart extends PlayerPart {
   @Autowired
   ConfigManager configManager;
   @Autowired
   private WorldMgr worldMgr;
   String HERO_DRAW_OPEN_AREA = "heroDrawOpenArea";

   public boolean checkOpen() {
      String openAreaListStr = this.configManager.getStrByDefault(this.HERO_DRAW_OPEN_AREA, "jp");
      String[] openAreaArr = openAreaListStr.split("\\|");
      if (openAreaArr.length < 1) {
         return false;
      } else {
         boolean isThisArea = false;

         for(String openArea : openAreaArr) {
            if (Objects.equals(openArea, this.worldMgr.country)) {
               isThisArea = true;
               break;
            }
         }

         if (!isThisArea) {
            return false;
         } else if (!this.player.isSystemOpen(5800)) {
            return false;
         } else {
            Map<Integer, HundredStrokesJPModel> allMap = ApplicationContextProvider.<Integer, HundredStrokesJPModel>getModelPoolMap("onehundredStrokesJP");
            if (null != allMap && !allMap.isEmpty()) {
               Set<Integer> allDrawUseIds = allMap.keySet();
               GiveHeroDrawDao dao = this.getDao();
               return !dao.tenDrawUseIds.containsAll(allDrawUseIds);
            } else {
               return false;
            }
         }
      }
   }

   public void loginHandle() {
      GiveHeroDrawDao dao = this.getDao();
      dao.lastCalTime = System.currentTimeMillis();
      dao.loginState = 1;
      dao.updateOp();
      if (this.checkOpen()) {
         this.sendGiveHeroDrawInfo();
      }

   }

   public void logout() {
      GiveHeroDrawDao dao = this.getDao();
      dao.loginState = 0;
      dao.updateOp();
   }

   public GiveHeroDrawDao getDao() {
      GiveHeroDrawDao dao = (GiveHeroDrawDao)this.player.getData("tb_give_hero_draw", this.player.getPlayerId());
      return dao;
   }

   @MsgHandlerAnno
   public void C2S_GiveHeroDrawData_21301(GiveHeroDrawMsg.C2S_GiveHeroDrawData_21301 msg, String source) {
      this.sendGiveHeroDrawInfo();
   }

   public void sendGiveHeroDrawInfo() {
      GiveHeroDrawDao dao = this.getDao();
      GiveHeroDrawMsg.S2C_GiveHeroDrawData_21302.Builder resp = GiveHeroDrawMsg.S2C_GiveHeroDrawData_21302.newBuilder();
      resp.setActTotalOnlineTime(this.getActTotalOnlineSecond());
      resp.addAllTenDrawUseIds(dao.tenDrawUseIds);
      this.player.sendMsg(resp.build());
   }

   public HundredStrokesJPModel getCanUseTenDrawModel() {
      Set<Integer> tempAllUnlockTenDrawIds = this.getUnlockTenDrawIds();
      if (null != tempAllUnlockTenDrawIds && !tempAllUnlockTenDrawIds.isEmpty()) {
         GiveHeroDrawDao dao = this.getDao();
         Set<Integer> tempTenDrawUseIds = new HashSet();
         tempTenDrawUseIds.addAll(dao.tenDrawUseIds);
         if (tempTenDrawUseIds.containsAll(tempAllUnlockTenDrawIds)) {
            return null;
         } else {
            tempAllUnlockTenDrawIds.removeAll(tempTenDrawUseIds);
            return tempAllUnlockTenDrawIds.size() <= 0 ? null : this.getMinOnlineTimeTenDraw(tempAllUnlockTenDrawIds);
         }
      } else {
         return null;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_TenDraw_21303(GiveHeroDrawMsg.C2S_TenDraw_21303 msg, String source) {
      if (!this.checkOpen()) {
         return this.player.failure(8007);
      } else {
         HundredStrokesJPModel canUseHundredStrokesJPModel = this.getCanUseTenDrawModel();
         if (null == canUseHundredStrokesJPModel) {
            return this.player.failure(76031);
         } else {
            HeroRecruitmentPart heroRecruitmentPart = (HeroRecruitmentPart)this.player.getMgrPart(HeroRecruitmentPart.class);
            HeroEmployeeModel heroEmployeeModel = (HeroEmployeeModel)this.player.getGameModelPool().getEntity("heroEmployee", 10);
            List<HeroModel> heroModelList = heroRecruitmentPart.getHeroList(HeroMsg.RecruitmentType.INTEGRAL, HeroMsg.NumType.TEN_TIMES, 10, -1, heroEmployeeModel);
            if (null != heroModelList && !heroModelList.isEmpty()) {
               List<Integer> heroIdList = new ArrayList();

               for(HeroModel heroModel : heroModelList) {
                  heroIdList.add(heroModel.getId());
               }

               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               List<HeroDao> heroDaoList = heroBagPart.addHero(heroIdList, true, 109, 10901, 0, 0, "");
               GiveHeroDrawDao dao = this.getDao();
               dao.tenDrawUseIds.add(canUseHundredStrokesJPModel.getId());
               dao.updateOp();
               GiveHeroDrawMsg.S2C_TenDraw_21304.Builder resp = GiveHeroDrawMsg.S2C_TenDraw_21304.newBuilder();
               resp.addAllTenDrawUseIds(dao.tenDrawUseIds);

               for(HeroDao heroDao : heroDaoList) {
                  CommonMsg.ItemInfo.Builder heroInfoBuilder = CommonMsg.ItemInfo.newBuilder();
                  heroInfoBuilder.setType(3);
                  heroInfoBuilder.setId(heroDao.id);
                  heroInfoBuilder.setNum(1);
                  heroInfoBuilder.setCode(heroDao.code);
                  heroInfoBuilder.setStar(heroDao.getStar());
                  heroInfoBuilder.setHeroCode(heroDao.code);
                  heroInfoBuilder.setLevel(heroDao.getLv());
                  resp.addHeroInfo(heroInfoBuilder);
               }

               this.player.sendMsg(resp.build());
               return true;
            } else {
               this.logger.error("回归活动十连抽 没有抽到一个英雄？？？");
               return this.player.failure(37);
            }
         }
      }
   }

   public Set<Integer> getUnlockTenDrawIds() {
      Set<Integer> allUnlockTenDrawIds = new HashSet();
      Map<Integer, HundredStrokesJPModel> tenDrawModelMap = ApplicationContextProvider.<Integer, HundredStrokesJPModel>getModelPoolMap("onehundredStrokesJP");
      long actTotalOnlineMin = this.getActTotalOnlineMin();

      for(Map.Entry<Integer, HundredStrokesJPModel> entry : tenDrawModelMap.entrySet()) {
         HundredStrokesJPModel model = (HundredStrokesJPModel)entry.getValue();
         if (actTotalOnlineMin >= (long)model.getOnlineTime()) {
            allUnlockTenDrawIds.add(model.getId());
         }
      }

      return allUnlockTenDrawIds;
   }

   public HundredStrokesJPModel getMinOnlineTimeTenDraw(Set<Integer> tenDrawIds) {
      if (null != tenDrawIds && tenDrawIds.size() > 0) {
         HundredStrokesJPModel tenDrawModel = null;

         for(Integer tempAllUnlockTenDrawId : tenDrawIds) {
            HundredStrokesJPModel modelPoolEntity = (HundredStrokesJPModel)ApplicationContextProvider.getModelPoolEntity("onehundredStrokesJP", tempAllUnlockTenDrawId);
            if (null == tenDrawModel) {
               tenDrawModel = modelPoolEntity;
            } else if (tenDrawModel.getOnlineTime() > modelPoolEntity.getOnlineTime()) {
               tenDrawModel = modelPoolEntity;
            }
         }

         return tenDrawModel;
      } else {
         return null;
      }
   }

   public long getActTotalOnlineSecond() {
      this.calActTotalOnlineTime(System.currentTimeMillis());
      GiveHeroDrawDao dao = this.getDao();
      return dao.actTotalOnlineTime;
   }

   public long getActTotalOnlineMin() {
      long actTotalOnlineSecond = this.getActTotalOnlineSecond();
      return actTotalOnlineSecond / 60L;
   }

   public void calActTotalOnlineTime(long calTime) {
      GiveHeroDrawDao dao = this.getDao();
      if (dao.loginState != 0) {
         long curOnlineSecond = (calTime - dao.lastCalTime) / 1000L;
         dao.actTotalOnlineTime += curOnlineSecond;
         dao.lastCalTime = calTime;
         long maxTotalOnlineSecond = this.getMaxTotalOnlineSecond();
         if (dao.actTotalOnlineTime >= maxTotalOnlineSecond) {
            dao.actTotalOnlineTime = maxTotalOnlineSecond;
         }

         dao.updateOp();
      }
   }

   public long getMaxTotalOnlineSecond() {
      Map<Integer, HundredStrokesJPModel> allMap = ApplicationContextProvider.<Integer, HundredStrokesJPModel>getModelPoolMap("onehundredStrokesJP");
      if (null != allMap && !allMap.isEmpty()) {
         int maxTotalOnlineMin = 0;

         for(Map.Entry<Integer, HundredStrokesJPModel> entry : allMap.entrySet()) {
            HundredStrokesJPModel model = (HundredStrokesJPModel)entry.getValue();
            if (maxTotalOnlineMin < model.getOnlineTime()) {
               maxTotalOnlineMin = model.getOnlineTime();
            }
         }

         long maxTotalOnlineSecond = (long)maxTotalOnlineMin * 60L;
         return maxTotalOnlineSecond;
      } else {
         return 0L;
      }
   }
}
