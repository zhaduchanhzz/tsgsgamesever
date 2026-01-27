package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroDao;
import com.gzbz.db.KrActHeroImproveDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.KrHeroImproveGiftLibModel;
import com.gzbz.model.KrHeroImproveGiftModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.KrActHeroImproveMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class KrActHeroImprovePart extends AbstractActivityPart {
   public void sendInfo() {
      this.sendActivityInfo();
   }

   public int getActivityType() {
      return 103;
   }

   public void rotateReset(int oldActivityId) {
      KrActHeroImproveDao dao = this.getDao();
      dao.selectHeroId = 0;
      dao.heroMaxStar = 0;
      dao.recStarRewards.clear();
      dao.updateOp();
      this.clearActivityGift(24);
   }

   public void activityEnd(int oldActivityId) {
      this.sendHeroStarEmail();
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         KrActHeroImproveDao dao = this.getDao();
         if (dao.selectHeroId > 0) {
            this.checkHeroMaxStarChange(dao.selectHeroId);
         }

      }
   }

   public void sendHeroStarEmail() {
      KrActHeroImproveDao dao = this.getDao();
      if (dao.selectHeroId > 0) {
         Set<Integer> noRecStars = new HashSet();
         List<ResourceModel> noRecRewards = new ArrayList();
         ConcurrentHashMap<Integer, KrHeroImproveGiftLibModel> heroStar_model = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customHeroImproveGiftLibKr", dao.selectHeroId);
         if (null == heroStar_model) {
            this.logger.error("HeroImproveGiftLibKr 未找到对应数据 heroId:{}", dao.selectHeroId);
         } else {
            for(Map.Entry<Integer, KrHeroImproveGiftLibModel> entry : heroStar_model.entrySet()) {
               KrHeroImproveGiftLibModel model = (KrHeroImproveGiftLibModel)entry.getValue();
               if (!dao.recStarRewards.contains(model.getHeroStar()) && dao.heroMaxStar >= model.getHeroStar()) {
                  noRecStars.add(model.getHeroStar());

                  for(ResourceModel resourceModel : model.getFreeReward()) {
                     resourceModel.addResourceToList(noRecRewards);
                  }
               }
            }

            if (!noRecRewards.isEmpty()) {
               CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_KR_ACT_HERO_IMPROVE_STAR_REWARD);
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), noRecRewards, 604800000L, 138, 13802);
               dao.recStarRewards.addAll(noRecStars);
               dao.updateOp();
            }
         }
      }
   }

   public KrActHeroImproveDao getDao() {
      KrActHeroImproveDao dao = (KrActHeroImproveDao)this.player.getData("tb_kr_act_hero_improve", this.player.getPlayerId());
      return dao;
   }

   public KrHeroImproveGiftLibModel getHeroImproveGiftLibModel(int heroId, int heroStar) {
      ConcurrentHashMap<Integer, KrHeroImproveGiftLibModel> heroStar_model = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customHeroImproveGiftLibKr", heroId);
      if (null == heroStar_model) {
         this.logger.error("HeroImproveGiftLibKr 未找到对应数据 heroId:{}", heroId);
         return null;
      } else {
         KrHeroImproveGiftLibModel heroImproveGiftLibModel = (KrHeroImproveGiftLibModel)heroStar_model.get(heroStar);
         if (null == heroImproveGiftLibModel) {
            this.logger.error("HeroImproveGiftLibKr 未找到对应数据 heroId:{} heroStar:{}", heroId, heroStar);
            return null;
         } else {
            return heroImproveGiftLibModel;
         }
      }
   }

   public List<Integer> getCanSelectHeroIdList() {
      List<Integer> canSelectHeroIdList = new ArrayList();
      Map<Integer, KrHeroImproveGiftModel> modelMap = ApplicationContextProvider.<Integer, KrHeroImproveGiftModel>getModelPoolMap("heroImproveGiftKr");
      if (modelMap.isEmpty()) {
         return canSelectHeroIdList;
      } else {
         int activityOpenDay = this.getActivityOpenDay();

         for(Map.Entry<Integer, KrHeroImproveGiftModel> entry : modelMap.entrySet()) {
            KrHeroImproveGiftModel value = (KrHeroImproveGiftModel)entry.getValue();
            if (activityOpenDay >= value.getDateStart() && activityOpenDay <= value.getDateEnd()) {
               canSelectHeroIdList.add(value.getHeroId());
            }
         }

         return canSelectHeroIdList;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ActivityInfo_24301(KrActHeroImproveMsg.C2S_ActivityInfo_24301 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         this.sendActivityInfo();
         return true;
      }
   }

   public void sendActivityInfo() {
      KrActHeroImproveDao dao = this.getDao();
      KrActHeroImproveMsg.S2C_ActivityInfo_24302.Builder resp = KrActHeroImproveMsg.S2C_ActivityInfo_24302.newBuilder();
      resp.setOpenDay(this.getActivityOpenDay());
      resp.setSelectHeroId(dao.selectHeroId);
      resp.addAllHasSelectHeroIds(dao.hasSelectHeroIds);
      resp.addAllRecStarRewards(dao.recStarRewards);
      resp.addAllCanSelectHeroIds(this.getCanSelectHeroIdList());
      resp.setHeroMaxStar(dao.heroMaxStar);
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public boolean C2S_ChooseHero_24303(KrActHeroImproveMsg.C2S_ChooseHero_24303 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         KrActHeroImproveDao dao = this.getDao();
         if (dao.selectHeroId > 0) {
            return this.player.failure(761221);
         } else {
            List<Integer> canSelectHeroIdList = this.getCanSelectHeroIdList();
            canSelectHeroIdList.removeAll(dao.hasSelectHeroIds);
            if (!canSelectHeroIdList.contains(msg.getHeroId())) {
               return this.player.failure(761220);
            } else {
               dao.selectHeroId = msg.getHeroId();
               dao.hasSelectHeroIds.add(msg.getHeroId());
               dao.heroMaxStar = this.getHeroMaxStar();
               dao.updateOp();
               this.sendActivityInfo();
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_RecHeroStarReward_24305(KrActHeroImproveMsg.C2S_RecHeroStarReward_24305 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         KrActHeroImproveDao dao = this.getDao();
         if (dao.recStarRewards.contains(msg.getHeroStar())) {
            return this.player.failure(76030);
         } else if (!this.isHeroStarUnlock(msg.getHeroStar())) {
            return this.player.failure(76031);
         } else {
            KrHeroImproveGiftLibModel heroImproveGiftLibModel = this.getHeroImproveGiftLibModel(dao.selectHeroId, msg.getHeroStar());
            if (null == heroImproveGiftLibModel) {
               return this.player.failure(37);
            } else {
               this.player.addResource(heroImproveGiftLibModel.getFreeReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 138, 13802, 0, 0, "");
               dao.recStarRewards.add(msg.getHeroStar());
               dao.updateOp();
               KrActHeroImproveMsg.S2C_RecHeroStarReward_24306.Builder resp = KrActHeroImproveMsg.S2C_RecHeroStarReward_24306.newBuilder();
               resp.addAllRecStarRewards(dao.recStarRewards);
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }

   public boolean isHeroStarUnlock(int heroStar) {
      KrActHeroImproveDao dao = this.getDao();
      if (dao.selectHeroId <= 0) {
         return false;
      } else {
         return dao.heroMaxStar >= heroStar;
      }
   }

   public int getHeroMaxStar() {
      KrActHeroImproveDao dao = this.getDao();
      if (dao.selectHeroId <= 0) {
         return 0;
      } else {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         List<HeroDao> heroDaoList = heroBagPart.getHeroById(dao.selectHeroId);
         int maxStar = 0;

         for(HeroDao heroDao : heroDaoList) {
            if (heroDao.getStar() > maxStar) {
               maxStar = heroDao.getStar();
            }
         }

         return maxStar;
      }
   }

   public void checkHeroMaxStarChange(int heroId) {
      if (!this.isServerActivityInvalid()) {
         KrActHeroImproveDao dao = this.getDao();
         if (dao.selectHeroId > 0 && heroId == dao.selectHeroId) {
            int heroMaxStar = this.getHeroMaxStar();
            if (dao.heroMaxStar < heroMaxStar) {
               dao.heroMaxStar = heroMaxStar;
               dao.updateOp();
               this.sendActivityInfo();
            }

         }
      }
   }

   public boolean gmTest(String gm) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         switch (gm) {
            case "resethero":
               KrActHeroImproveDao dao = this.getDao();
               dao.selectHeroId = 0;
               dao.heroMaxStar = 0;
               dao.recStarRewards.clear();
               dao.updateOp();
               this.sendActivityInfo();
               return true;
            default:
               return this.player.failure(6);
         }
      }
   }
}
