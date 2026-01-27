package com.gzbz.qqBigPlayer.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.db.MonarchDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.QqBigPlayerDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.monarch.MonarchPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.WanKaLevelModel;
import com.gzbz.model.WanKaPackageModel;
import com.gzbz.model.WanKaPrivilegeModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.QqBigPlayerMsg;
import com.gzbz.qqBigPlayer.QqBigPlayerDefine;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class QqBigPlayerPart extends PlayerPart {
   @Autowired
   private WorldMgr worldMgr;

   public QqBigPlayerDao getDao() {
      QqBigPlayerDao dao = (QqBigPlayerDao)this.player.getData("tb_qq_big_player", this.player.getPlayerId());
      return dao;
   }

   public void dailyReset() {
      QqBigPlayerDao dao = this.getDao();
      dao.isRecDailyActGift = 0;
      dao.updateOp();
      this.sendInfoMsg();
   }

   public void resetWeek() {
      QqBigPlayerDao dao = this.getDao();
      int wanKaLv = this.recWanKaLv(true);
      Set<Integer> tempRecWeekGifts = new HashSet();

      for(Integer recWeekGiftLv : dao.recWeekGifts) {
         if (recWeekGiftLv < wanKaLv) {
            tempRecWeekGifts.add(recWeekGiftLv);
         }
      }

      dao.recWeekGifts.clear();
      dao.recWeekGifts.addAll(tempRecWeekGifts);
      this.sendInfoMsg();
   }

   public void checkFramePrestigeExpire(int wanKaLv) {
      Map<Integer, WanKaLevelModel> wanKaLevelModelMap = ApplicationContextProvider.<Integer, WanKaLevelModel>getModelPoolMap("wankaLevel");
      QqBigPlayerDao wanKaDao = this.getDao();
      MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
      MonarchPart monarchPart = (MonarchPart)this.player.getMgrPart(MonarchPart.class);
      Map<Integer, Integer> headFrame_wanKaLv = new HashMap();
      Map<Integer, Integer> prestige_wanKaLv = new HashMap();
      int canUseMaxLv = 0;

      for(int level : wanKaDao.recWanKaLvBox) {
         WanKaLevelModel wanKaLevelModel = (WanKaLevelModel)wanKaLevelModelMap.get(level);
         int headFrame = wanKaLevelModel.getHeadFrame();
         int prestige = wanKaLevelModel.getPrestige();
         if (headFrame > 0) {
            headFrame_wanKaLv.put(headFrame, level);
         }

         if (prestige > 0) {
            prestige_wanKaLv.put(prestige, level);
         }

         if (wanKaLv >= level) {
            if (headFrame > 0 && !monarchDao.headFrames.containsKey(headFrame)) {
               monarchPart.addMonarch(20, headFrame);
            }

            if (prestige > 0 && !monarchDao.prestiges.containsKey(prestige)) {
               monarchPart.addMonarch(19, prestige);
            }

            if (canUseMaxLv < level) {
               canUseMaxLv = level;
            }
         } else {
            if (headFrame > 0 && monarchDao.headFrames.containsKey(headFrame)) {
               monarchDao.headFrames.remove(headFrame);
            }

            if (prestige > 0 && monarchDao.prestiges.containsKey(prestige)) {
               monarchDao.prestiges.remove(prestige);
            }

            monarchDao.updateOp();
         }
      }

      PlayerDao playerDao = this.player.getPlayerDao();
      if (headFrame_wanKaLv.containsKey(playerDao.headFrame)) {
         Integer useWanKaLv = (Integer)headFrame_wanKaLv.get(playerDao.headFrame);
         if (useWanKaLv > canUseMaxLv) {
            WanKaLevelModel wanKaLevelModel = (WanKaLevelModel)wanKaLevelModelMap.get(canUseMaxLv);
            int headFrame = wanKaLevelModel != null && wanKaLevelModel.getHeadFrame() > 0 ? wanKaLevelModel.getHeadFrame() : 30001;
            playerDao.headFrame = headFrame;
            playerDao.updateOp();
            this.player.notifyPlayerData(PlayerDefine.PLAYER_HEADFRAME, playerDao.headFrame);
         }
      }

      if (prestige_wanKaLv.containsKey(playerDao.prestige)) {
         Integer useWanKaLv = (Integer)prestige_wanKaLv.get(playerDao.prestige);
         if (useWanKaLv > canUseMaxLv) {
            WanKaLevelModel wanKaLevelModel = (WanKaLevelModel)wanKaLevelModelMap.get(canUseMaxLv);
            int prestige = wanKaLevelModel == null ? 0 : wanKaLevelModel.getPrestige();
            playerDao.prestige = prestige;
            playerDao.updateOp();
            this.player.notifyPlayerData(PlayerDefine.PLAYER_PRESTIGE, playerDao.prestige);
         }
      }

      if (prestige_wanKaLv.containsKey(playerDao.secondTitle)) {
         Integer useWanKaLv = (Integer)prestige_wanKaLv.get(playerDao.secondTitle);
         if (useWanKaLv > canUseMaxLv) {
            WanKaLevelModel wanKaLevelModel = (WanKaLevelModel)wanKaLevelModelMap.get(canUseMaxLv);
            int secondTitle = wanKaLevelModel == null ? 0 : wanKaLevelModel.getPrestige();
            playerDao.secondTitle = secondTitle;
            playerDao.updateOp();
            this.player.notifyPlayerData(PlayerDefine.PLAYER_SECOND_TITLE, playerDao.secondTitle);
         }
      }

   }

   public void notifyWanKaPlayerData(int wanKaLv) {
      this.player.notifyPlayerData(PlayerDefine.QQ_WAN_KA_LV, wanKaLv);
      this.player.notifyPlayerData(PlayerDefine.QQ_WAN_KA_LOGO, this.recWanKaLogo(wanKaLv, true));
   }

   public void rechargeHandle(int money, int ingots, int type) {
      if (this.isPlatFormOpen() && money >= 0) {
         if (type == 2 || type == 3 || type == 4 || type == 5 || type == 10 || type == 11 || type == 12 || type == 13) {
            ingots = money * 10;
         }

         this.sendRechargeExtraMail(ingots);
      }
   }

   @TaskMethod
   public void updateWanKaInfo(Long score, Integer level, Boolean binding, Integer discount, Integer payReturnCount, Boolean isUsingCard, Integer realLevel, Long cardExpireTs) {
      PlayerDao playerDao = this.player.getPlayerDao();
      playerDao.qqWanKaLv = level == null ? playerDao.qqWanKaLv : level;
      playerDao.realWanKaLv = realLevel == null ? playerDao.realWanKaLv : realLevel;
      playerDao.updateOp();
      QqBigPlayerDao dao = this.getDao();
      dao.score = score == null ? dao.score : score;
      dao.binding = binding == null ? dao.binding : binding;
      dao.discount = discount == null ? dao.discount : discount;
      dao.payReturnCount = payReturnCount == null ? dao.payReturnCount : payReturnCount;
      dao.isUsingCard = isUsingCard == null ? dao.isUsingCard : isUsingCard;
      dao.cardExpireTs = cardExpireTs == null ? dao.cardExpireTs : cardExpireTs;
      dao.updateOp();
      this.sendInfoMsg();
      int wanKaLv = this.recWanKaLv(true);
      this.notifyWanKaPlayerData(wanKaLv);
      this.checkFramePrestigeExpire(wanKaLv);
      this.player.uploadCrossPlayer();
   }

   @TaskMethod
   public void updatePayReturnCount(Integer payReturnCount) {
      QqBigPlayerDao dao = this.getDao();
      dao.payReturnCount = payReturnCount;
      dao.updateOp();
      this.sendInfoMsg();
   }

   public void sendRechargeExtraMail(int ingots) {
      QqBigPlayerDao dao = this.getDao();
      if (dao.binding || dao.payReturnCount == -1 || dao.payReturnCount > 0) {
         if (dao.discount > 0) {
            int mul = ingots * dao.discount;
            BigDecimal member = new BigDecimal(mul + "");
            BigDecimal extra = member.divide(new BigDecimal("100"), 3, 4);
            int extraInt = extra.setScale(0, 1).intValue();
            if (extraInt > 0) {
               List<ResourceModel> extraIngot = new ArrayList();
               extraIngot.add(new ResourceModel(1, PlayerDefine.PLAYER_GOLD, extraInt));
               CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_WAN_KA_RECHARGE_EXTRA);
               if (null != centreAwardModel) {
                  MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), extraIngot, 604800000L, this.getModule(), 14205);
               } else {
                  this.logger.error("CentreAward缺少邮件id:{}", CentreAwardModel.ID_WAN_KA_RECHARGE_EXTRA);
               }
            }

         }
      }
   }

   public int getModule() {
      return 142;
   }

   public boolean isPlatFormOpen() {
      return QqBigPlayerDefine.isPlatformOpen();
   }

   public int recWanKaLv(boolean highOrder) {
      PlayerDao playerDao = this.player.getPlayerDao();
      QqBigPlayerDao dao = this.getDao();
      long currentTimeMillis = System.currentTimeMillis();
      long nowSecond = currentTimeMillis / 1000L;
      if (dao.isUsingCard && nowSecond >= dao.cardExpireTs) {
         playerDao.qqWanKaLv = playerDao.realWanKaLv;
         dao.isUsingCard = false;
         playerDao.updateOp();
         dao.updateOp();
         this.notifyWanKaPlayerData(playerDao.qqWanKaLv);
         this.checkFramePrestigeExpire(playerDao.qqWanKaLv);
         this.player.uploadCrossPlayer();
      }

      if (highOrder) {
         return playerDao.qqWanKaLv;
      } else {
         return dao.isUsingCard ? playerDao.realWanKaLv : playerDao.qqWanKaLv;
      }
   }

   public String recWanKaLogo(int wanKaLv, boolean updatePlayerDao) {
      String wanKaLogo = this.calWanKaLogo(wanKaLv);
      if (updatePlayerDao) {
         this.checkPlayerDaoWanKaLogoChange(wanKaLogo);
      }

      return wanKaLogo;
   }

   public String calWanKaLogo(int wanKaLv) {
      if (!this.isPlatFormOpen()) {
         return "";
      } else {
         QqBigPlayerDao dao = this.getDao();
         if (wanKaLv <= 0 && dao.hasShowLogo > 0) {
            WanKaLevelModel wanKaLevelModel = QqBigPlayerDefine.getWanKaLevelModel(1);
            return wanKaLevelModel.getIcon1();
         } else {
            for(int i = wanKaLv; i >= 1; --i) {
               WanKaLevelModel wanKaLevelModel = QqBigPlayerDefine.getWanKaLevelModel(i);
               if (null != wanKaLevelModel && dao.recWanKaLvBox.contains(i)) {
                  dao.hasShowLogo = 1;
                  dao.updateOp();
                  return wanKaLevelModel.getIcon();
               }
            }

            return "";
         }
      }
   }

   public void checkPlayerDaoWanKaLogoChange(String wanKaLogo) {
      PlayerDao playerDao = this.player.getPlayerDao();
      if (!Objects.equals(playerDao.qqLogo, wanKaLogo)) {
         playerDao.qqLogo = wanKaLogo;
         playerDao.updateOp();
      }

   }

   @MsgHandlerAnno
   public void C2S_Info_24101(QqBigPlayerMsg.C2S_Info_24101 msg, String source) {
      this.sendInfoMsg();
   }

   public void sendInfoMsg() {
      QqBigPlayerDao dao = this.getDao();
      QqBigPlayerMsg.S2C_Info_24102.Builder builder = QqBigPlayerMsg.S2C_Info_24102.newBuilder();
      int wanKaLv = this.recWanKaLv(true);
      int realWanKaLv = this.recWanKaLv(false);
      builder.setIsSysOpen(this.isPlatFormOpen());
      builder.setValCount(dao.score);
      builder.setLv(wanKaLv);
      builder.setIsRecRegGift(dao.isRecRegGift > 0);
      builder.setIsRecDailyActGift(dao.isRecDailyActGift > 0);
      builder.addAllRecLevelGift(dao.recLevelGifts);
      builder.addAllRecWanKaLvBox(dao.recWanKaLvBox);
      builder.setNoHighOrderLv(realWanKaLv);
      builder.addAllRecWeekGift(dao.recWeekGifts);
      builder.setPayReturnCount(dao.payReturnCount);
      Map<Integer, Integer> weekGiftStateMap = this.getWeekGiftStateMap(wanKaLv);

      for(Map.Entry<Integer, Integer> entry : weekGiftStateMap.entrySet()) {
         Integer lv = (Integer)entry.getKey();
         Integer state = (Integer)entry.getValue();
         QqBigPlayerMsg.WeekGiftInfo.Builder weekGiftInfo = QqBigPlayerMsg.WeekGiftInfo.newBuilder();
         weekGiftInfo.setWanKaLv(lv);
         weekGiftInfo.setState(state);
         builder.addWeekGiftInfo(weekGiftInfo);
      }

      builder.setDiscount(dao.discount);
      this.player.sendMsg(builder.build());
   }

   public Map<Integer, Integer> getWeekGiftStateMap(int curWanKaLv) {
      Map<Integer, Integer> stateMap = new HashMap();
      ConcurrentHashMap<Integer, WanKaPrivilegeModel> level_model = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customWanKaPrivilege", 2);
      if (null != level_model && !level_model.isEmpty()) {
         QqBigPlayerDao dao = this.getDao();

         for(Map.Entry<Integer, WanKaPrivilegeModel> entry : level_model.entrySet()) {
            WanKaPrivilegeModel model = (WanKaPrivilegeModel)entry.getValue();
            if (!dao.recWeekGifts.contains(model.getLevel()) && model.getLevel() <= curWanKaLv) {
               stateMap.put(model.getLevel(), 0);
            } else if (dao.recWeekGifts.contains(model.getLevel())) {
               stateMap.put(model.getLevel(), 1);
            } else if (model.getLevel() > curWanKaLv) {
               stateMap.put(model.getLevel(), 2);
            }
         }

         return stateMap;
      } else {
         return stateMap;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_RecGift_24103(QqBigPlayerMsg.C2S_RecGift_24103 msg, String source) {
      if (!this.isPlatFormOpen()) {
         return this.player.failure(21);
      } else {
         QqBigPlayerDao dao = this.getDao();
         if (msg.getGiftType() == 1) {
            if (dao.isRecRegGift > 0) {
               return this.player.failure(76030);
            }

            List<ResourceModel> regGiftRewards = QqBigPlayerDefine.getRegGiftRewards();
            if (null == regGiftRewards || regGiftRewards.isEmpty()) {
               return this.player.failure(37);
            }

            this.player.addResource(regGiftRewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getModule(), 14201, 0, 0, "");
            dao.isRecRegGift = 1;
            dao.updateOp();
         } else if (msg.getGiftType() == 2) {
            if (dao.isRecDailyActGift > 0) {
               return this.player.failure(76030);
            }

            long curAct = this.player.getResourceNum(1, PlayerDefine.PLAYER_ACTIVE);
            if (!QqBigPlayerDefine.checkActGiftRec(curAct)) {
               return this.player.failure(76031);
            }

            List<ResourceModel> actGiftRewards = QqBigPlayerDefine.getActGiftRewards();
            if (null == actGiftRewards || actGiftRewards.isEmpty()) {
               return this.player.failure(37);
            }

            this.player.addResource(actGiftRewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getModule(), 14202, 0, 0, "");
            dao.isRecDailyActGift = 1;
            dao.updateOp();
         } else if (msg.getGiftType() == 3) {
            if (dao.recLevelGifts.contains(msg.getParam())) {
               return this.player.failure(76030);
            }

            if (this.player.getPlayerDao().lv < msg.getParam()) {
               return this.player.failure(76031);
            }

            WanKaPackageModel wankaPackageModel = QqBigPlayerDefine.getWanKaPackageModel(msg.getParam());
            if (null == wankaPackageModel) {
               return this.player.failure(37);
            }

            this.player.addResource(wankaPackageModel.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getModule(), 14203, 0, 0, "");
            dao.recLevelGifts.add(msg.getParam());
            dao.updateOp();
         }

         QqBigPlayerMsg.S2C_RecGift_24104.Builder resp = QqBigPlayerMsg.S2C_RecGift_24104.newBuilder();
         this.player.sendMsg(resp.build());
         this.sendInfoMsg();
         return true;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_RecWanKaLvBox_24105(QqBigPlayerMsg.C2S_RecWanKaLvBox_24105 msg, String source) {
      if (!this.isPlatFormOpen()) {
         return this.player.failure(21);
      } else {
         WanKaPrivilegeModel wanKaPrivilegeModel = QqBigPlayerDefine.getWanKaPrivilegeModel(5, msg.getLv());
         if (null != wanKaPrivilegeModel && wanKaPrivilegeModel.getParam() > 0) {
            int realWanKaLv = this.recWanKaLv(false);
            if (realWanKaLv < wanKaPrivilegeModel.getLevel()) {
               return this.player.failure(76031);
            } else {
               QqBigPlayerDao dao = this.getDao();
               if (dao.recWanKaLvBox.contains(msg.getLv())) {
                  return this.player.failure(76030);
               } else {
                  dao.recWanKaLvBox.add(msg.getLv());
                  dao.updateOp();
                  ResourceModel reward = new ResourceModel(2, wanKaPrivilegeModel.getParam(), 1);
                  this.player.addResource(reward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getModule(), 14204, 0, 0, "");
                  int wanKaLv = this.recWanKaLv(true);
                  this.notifyWanKaPlayerData(wanKaLv);
                  QqBigPlayerMsg.S2C_RecWanKaLvBox_24106.Builder resp = QqBigPlayerMsg.S2C_RecWanKaLvBox_24106.newBuilder();
                  this.player.sendMsg(resp.build());
                  this.sendInfoMsg();
                  return true;
               }
            }
         } else {
            return this.player.failure(37);
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_RecWeekGift_24107(QqBigPlayerMsg.C2S_RecWeekGift_24107 msg, String source) {
      if (!this.isPlatFormOpen()) {
         return this.player.failure(21);
      } else {
         WanKaPrivilegeModel wanKaPrivilegeModel = QqBigPlayerDefine.getWanKaPrivilegeModel(2, msg.getLv());
         if (null != wanKaPrivilegeModel && wanKaPrivilegeModel.getParam() > 0) {
            int wanKaLv = this.recWanKaLv(true);
            Map<Integer, Integer> weekGiftStateMap = this.getWeekGiftStateMap(wanKaLv);
            Integer state = (Integer)weekGiftStateMap.get(msg.getLv());
            if (null == state) {
               return this.player.failure(37);
            } else if (state == 1) {
               return this.player.failure(76030);
            } else if (state == 2) {
               return this.player.failure(76031);
            } else {
               QqBigPlayerDao dao = this.getDao();
               dao.recWeekGifts.add(msg.getLv());
               dao.updateOp();
               ResourceModel reward = new ResourceModel(2, wanKaPrivilegeModel.getParam(), 1);
               this.player.addResource(reward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getModule(), 14206, 0, 0, "");
               QqBigPlayerMsg.S2C_RecWeekGift_24108.Builder resp = QqBigPlayerMsg.S2C_RecWeekGift_24108.newBuilder();
               this.player.sendMsg(resp.build());
               this.sendInfoMsg();
               return true;
            }
         } else {
            return this.player.failure(37);
         }
      }
   }

   @TaskMethod
   public void addHighOrder(int day) {
      if (day <= 0) {
         this.logger.error("addHighOrder 有误，day:{}", day);
      } else {
         int realWanKaLv = this.recWanKaLv(false);
         if (realWanKaLv <= 0) {
            this.logger.error("addHighOrder 有误，真实玩咖等级为:{}", realWanKaLv);
         } else {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.add(7, day + 1);
            long timeInMillis = calendar.getTimeInMillis();
            long timeSecond = timeInMillis / 1000L;
            QqBigPlayerDao dao = this.getDao();
            dao.isUsingCard = true;
            dao.cardExpireTs = timeSecond;
            dao.updateOp();
            int wanKaLv = this.recWanKaLv(true);
            this.notifyWanKaPlayerData(wanKaLv);
            this.player.uploadCrossPlayer();
            this.sendInfoMsg();
         }
      }
   }
}
