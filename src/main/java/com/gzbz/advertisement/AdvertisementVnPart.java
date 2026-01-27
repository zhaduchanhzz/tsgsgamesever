package com.gzbz.advertisement;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.AdvertisementDao;
import com.gzbz.db.bean.AdvertisementVnData;
import com.gzbz.freeWelfare.part.FreeWelfarePart;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattleChapterPart;
import com.gzbz.gamePlayer.battle.BattleDailyPart;
import com.gzbz.gamePlayer.clickGold.ClickGoldPart;
import com.gzbz.gamePlayer.heroPart.HeroRecruitmentPart;
import com.gzbz.model.AdvertiseLiquidationTimeVNModel;
import com.gzbz.model.FreeWelfareModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.AdvertisementMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class AdvertisementVnPart extends PlayerPart {
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private ConfigManager configManager;

   @MsgHandlerAnno
   public void reqMain(AdvertisementMsg.C2S_VNMain_21701 msg, String source) {
      this.sendMain();
   }

   @MsgHandlerAnno
   public boolean reqReward(AdvertisementMsg.C2S_VNReward_21703 msg, String source) {
      if (!this.worldMgr.country.equals("vn") && !this.worldMgr.country.equals("id") && !this.worldMgr.country.equals("en")) {
         return this.player.failure(21);
      } else {
         int id = msg.getId();
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         AdvertiseLiquidationTimeVNModel advertisementModel = (AdvertiseLiquidationTimeVNModel)gameModelPool.getEntity("advertiseLiquidationTimeVN", id);
         if (advertisementModel == null) {
            return this.player.failure(6);
         } else {
            AdvertisementDao advertisementDao = (AdvertisementDao)this.player.getData("tb_advertisement", this.player.getPlayerId());
            AdvertisementVnData advertisementVnData = (AdvertisementVnData)advertisementDao.vnData.getOrDefault(msg.getId(), new AdvertisementVnData());
            int nowTime = (int)(System.currentTimeMillis() / 1000L);
            if (advertisementVnData.time != 0 && nowTime - advertisementVnData.time < 30) {
               return this.player.failure(0);
            } else {
               int num = advertisementVnData.num;
               if (advertisementModel.getSystemId() == 6810) {
                  FreeWelfareModel freeWelfareModel = (FreeWelfareModel)ApplicationContextProvider.getModelPoolEntity("FreeWelfare", id);
                  if (null == freeWelfareModel) {
                     return this.player.failure(37);
                  }

                  if (num >= freeWelfareModel.getNum()) {
                     return this.player.failure(51);
                  }
               } else if (num >= advertisementModel.getTimeNumber()) {
                  return this.player.failure(51);
               }

               ++num;
               advertisementVnData.num = num;
               advertisementVnData.time = nowTime;
               advertisementDao.vnData.put(id, advertisementVnData);
               advertisementDao.updateOp();
               switch (advertisementModel.getSystemId()) {
                  case 1012:
                     ClickGoldPart clickGoldPart = (ClickGoldPart)this.player.getMgrPart(ClickGoldPart.class);
                     clickGoldPart.advertisementVnClickGold();
                     break;
                  case 1242:
                     BattleDailyPart battleDailyPart = (BattleDailyPart)this.player.getMgrPart(BattleDailyPart.class);
                     battleDailyPart.advertisementVnExpCopy();
                     break;
                  case 1640:
                     HeroRecruitmentPart heroRecruitmentPart = (HeroRecruitmentPart)this.player.getMgrPart(HeroRecruitmentPart.class);
                     heroRecruitmentPart.advertisementVnRecruitment();
                     break;
                  case 1910:
                     List<ResourceModel> advertiseRechargeReward = this.configManager.getResourceModelList("advertiseRechargeReward", "");
                     if (advertiseRechargeReward == null || advertiseRechargeReward.isEmpty()) {
                        this.logger.error("config表找不到advertiseRechargeReward配置");
                        return this.player.failure(37);
                     }

                     this.player.addResource(advertiseRechargeReward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 122, 12201);
                     break;
                  case 2092:
                     BattleChapterPart battleChapterPart = (BattleChapterPart)this.player.getMgrPart(BattleChapterPart.class);
                     battleChapterPart.advertisementVnFastBattle();
                     break;
                  case 6810:
                     FreeWelfarePart freeWelfarePart = (FreeWelfarePart)this.player.getMgrPart(FreeWelfarePart.class);
                     int tips = freeWelfarePart.recAdvReward(advertisementModel.getFreeWelfareId());
                     if (tips != 1) {
                        return this.player.failure(tips);
                     }
                  default:
                     return this.player.failure(0);
               }

               this.sendRewardResult(id);
               return true;
            }
         }
      }
   }

   private void sendMain() {
      if (this.worldMgr.country.equals("vn") || this.worldMgr.country.equals("id")) {
         AdvertisementMsg.S2C_VNMain_21702.Builder resp = AdvertisementMsg.S2C_VNMain_21702.newBuilder();
         AdvertisementDao advertisementDao = (AdvertisementDao)this.player.getData("tb_advertisement", this.player.getPlayerId());

         for(Map.Entry<Integer, AdvertisementVnData> entry : advertisementDao.vnData.entrySet()) {
            AdvertisementMsg.VN.Builder builder = AdvertisementMsg.VN.newBuilder();
            builder.setNum(((AdvertisementVnData)entry.getValue()).num);
            builder.setTime(((AdvertisementVnData)entry.getValue()).time);
            builder.setId((Integer)entry.getKey());
            resp.addData(builder);
         }

         this.player.sendMsg(resp.build());
      }
   }

   private void sendRewardResult(int id) {
      AdvertisementMsg.S2C_VNReward_21704.Builder resp = AdvertisementMsg.S2C_VNReward_21704.newBuilder();
      AdvertisementDao advertisementDao = (AdvertisementDao)this.player.getData("tb_advertisement", this.player.getPlayerId());
      AdvertisementVnData advertisementVnData = (AdvertisementVnData)advertisementDao.vnData.get(id);
      AdvertisementMsg.VN.Builder vnData = AdvertisementMsg.VN.newBuilder();
      vnData.setId(id);
      vnData.setNum(advertisementVnData.num);
      vnData.setTime(advertisementVnData.time);
      resp.setData(vnData);
      this.player.sendMsg(resp.build());
   }

   public void resetHour() {
      super.resetHour();
   }

   public void resetDaily() {
      AdvertisementDao advertisementDao = (AdvertisementDao)this.player.getData("tb_advertisement", this.player.getPlayerId());
      advertisementDao.vnData.clear();
      advertisementDao.updateOp();
      this.sendMain();
   }

   public void resetWeek() {
      super.resetWeek();
   }

   public void resetMonth() {
      super.resetMonth();
   }

   public void loginHandle() {
      super.loginHandle();
   }

   public void logoutHandle() {
      super.logoutHandle();
   }

   public void levelUp(int preLv, int newLv) {
      super.levelUp(preLv, newLv);
   }
}
