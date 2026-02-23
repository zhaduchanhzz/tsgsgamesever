package com.gzbz.supremePvp;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import com.gzbz.gameDefine.LogDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.SupremePvpGradeModel;
import com.gzbz.model.SupremePvpRewardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.SupremePvpMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.supremePvp.part.SupremePvpPart;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.RandomUtil;
import net.CrossSubscribeMsg;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class SupremePvpMgr extends GameMgr {
   private final WorldMgr worldMgr;
   private final MailWorldMgr mailWorldMgr;
   private final OnLineMgr onLineMgr;

   public SupremePvpMgr(MailWorldMgr mailWorldMgr, WorldMgr worldMgr, OnLineMgr onLineMgr) {
      this.mailWorldMgr = mailWorldMgr;
      this.worldMgr = worldMgr;
      this.onLineMgr = onLineMgr;
   }

   protected void init() throws Exception {
   }

   @MsgHandlerAnno
   public void CR2S_UpdateDefArray_28534(SupremePvpMsg.CR2S_UpdateDefArray_28534 msg, CrossSubscribeMsg crossSubscribeMsg) {
      for(int i = 0; i < msg.getPlayerIdCount(); ++i) {
         int playerId = msg.getPlayerId(i);
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
         if (gamePlayer != null) {
            gamePlayer.schedule((long)RandomUtil.randInt(5, 100), () -> {
               SupremePvpPart supremePvpPart = (SupremePvpPart)gamePlayer.getMgrPart(SupremePvpPart.class);
               supremePvpPart.uploadArraying();
            });
         }
      }

   }

   @MsgHandlerAnno
   public void CR2S_Settle_28535(SupremePvpMsg.CR2S_Settle_28535 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (!msg.getSettleInfoList().isEmpty()) {
         String excelName;
         int reason;
         CentreAwardModel centreAwardModel;
         if (msg.getType() == 1) {
            excelName = "customJiuZhouDailyReward";
            reason = 15703;
            centreAwardModel = CentreAwardModel.getByType(CentreAwardModel.TYPE_SUPREME_PVP_DAILY_REWARD);
         } else if (msg.getType() == 2) {
            excelName = "customJiuZhouRankReward";
            reason = 15704;
            centreAwardModel = CentreAwardModel.getByType(CentreAwardModel.TYPE_SUPREME_PVP_RANK_REWARD);
         } else {
            if (msg.getType() != 3) {
               return;
            }

            excelName = "customJiuZhouRankReward";
            reason = 15710;
            centreAwardModel = CentreAwardModel.getByType(CentreAwardModel.TYPE_SUPREME_PVP_RANK_REWARD);
         }

         logger.info("【九州至尊PVP】{}奖励,段位={}", LogDefine.REASON_DEC_MAP.get(reason), msg.getGrade());
         if (centreAwardModel == null) {
            logger.error("【九州至尊PVP】结算奖励,找不到邮件配置");
         } else {
            SupremePvpGradeModel supremePvpGradeModel = (SupremePvpGradeModel)ApplicationContextProvider.getModelPoolEntity("JiuZhouRankDivide", msg.getGrade());
            if (supremePvpGradeModel == null) {
               logger.error("【九州至尊PVP】结算奖励,找不到段位{}配置", msg.getGrade());
            } else {
               Map<Integer, TreeMap<Integer, SupremePvpRewardModel>> map = ApplicationContextProvider.<Integer, TreeMap<Integer, SupremePvpRewardModel>>getModelPoolMap(excelName);
               if (!map.containsKey(msg.getGrade())) {
                  logger.error("【九州至尊PVP】结算奖励,找不到段位排行奖励配置");
               } else {
                  for(SupremePvpRewardModel pvpRewardModel : (map.get(msg.getGrade())).values()) {
                     Map<Integer, String> needPlayerRank = new HashMap();

                     for(SupremePvpMsg.SettleInfo settleInfo : msg.getSettleInfoList()) {
                        if (settleInfo.getRank() >= pvpRewardModel.getMinRank() && settleInfo.getRank() <= pvpRewardModel.getMaxRank()) {
                           GamePlayer gamePlayer = this.worldMgr.getPlayerById(settleInfo.getPlayerId());
                           if (gamePlayer != null && !gamePlayer.isRobot()) {
                              if (msg.getType() != 1) {
                                 logger.info("【九州至尊PVP】玩家={},段位={},排行={},积分={}", new Object[]{settleInfo.getPlayerId(), msg.getGrade(), settleInfo.getRank(), settleInfo.getScore()});
                                 gamePlayer.getOperationMgr().addExtraLog(gamePlayer, 235, String.valueOf(msg.getGrade()), String.valueOf(settleInfo.getScore()), String.valueOf(settleInfo.getTeamId()), String.valueOf(settleInfo.getRank()), String.valueOf(settleInfo.getNewGrade()));
                              }

                              if (gamePlayer.isLogin()) {
                                 String format = MessageFormat.format(centreAwardModel.getDesc(), supremePvpGradeModel.getName(), settleInfo.getScore(), settleInfo.getRank());
                                 gamePlayer.pushPartTaskEx(MailPart.class, "addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), format, pvpRewardModel.getRewards(), 604800000L, 157, reason});
                                 gamePlayer.getOperationMgr().addReceiveAwardNewLog(gamePlayer, 17, 0, centreAwardModel.getTitle(), pvpRewardModel.getMinRank() + "-" + pvpRewardModel.getMaxRank(), pvpRewardModel.getMinRank() + "-" + pvpRewardModel.getMaxRank(), 0, 0, 0);
                              } else {
                                 needPlayerRank.put(settleInfo.getPlayerId(), supremePvpGradeModel.getName() + "@" + settleInfo.getScore() + "@" + settleInfo.getRank());
                              }
                           }
                        }
                     }

                     if (needPlayerRank.size() > 0) {
                        this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), pvpRewardModel.getRewards(), needPlayerRank, 604800000L, 157, reason, 0);
                     }
                  }

               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void CR2S_PrestigeReward_28543(SupremePvpMsg.CR2S_PrestigeReward_28543 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int grade = msg.getGrade();
      logger.info("【九州至尊PVP】段位={}称号发放", grade);
      CentreAwardModel centreAwardModel = CentreAwardModel.getByType(CentreAwardModel.TYPE_SUPREME_PVP_PRESTIGE);
      if (centreAwardModel == null) {
         logger.error("【九州至尊PVP】段位={}称号发放,找不到邮件配置", grade);
      } else {
         SupremePvpGradeModel supremePvpGradeModel = (SupremePvpGradeModel)ApplicationContextProvider.getModelPoolEntity("JiuZhouRankDivide", grade);
         if (supremePvpGradeModel == null) {
            logger.error("【九州至尊PVP】段位={}称号发放,找不到段位配置", grade);
         } else {
            List<ResourceModel> rewards = new ArrayList();
            rewards.add(new ResourceModel(2, supremePvpGradeModel.getPrestige(), 1));
            Map<Integer, String> needPlayerRank = new HashMap();

            for(Integer playerId : msg.getPlayerIdList()) {
               GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
               if (gamePlayer != null) {
                  logger.info("【九州至尊PVP】段位={}称号发放,玩家={}", msg.getGrade(), playerId);
                  if (gamePlayer.isLogin()) {
                     String format = MessageFormat.format(centreAwardModel.getDesc(), supremePvpGradeModel.getName());
                     gamePlayer.pushPartTaskEx(MailPart.class, "addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), format, rewards, 604800000L, 157, 15709});
                  } else {
                     needPlayerRank.put(playerId, supremePvpGradeModel.getName());
                  }
               }
            }

            if (needPlayerRank.size() > 0) {
               this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), rewards, needPlayerRank, 604800000L, 157, 15709, 0);
            }

         }
      }
   }

   @MsgHandlerAnno
   public void S2C_CloseUi_28520(SupremePvpMsg.S2C_CloseUi_28520 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.closeUi(msg);
   }

   @TaskMethod
   public void disConnect() {
      this.closeUi(SupremePvpMsg.S2C_CloseUi_28520.newBuilder().setResult(SupremePvpMsg.CloseUiResult.CROSS_DISCONNECT).build());
   }

   public void closeUi(SupremePvpMsg.S2C_CloseUi_28520 msg) {
      this.onLineMgr.pushTask(() -> this.onLineMgr.onlineBroadcast(msg));
   }
}
