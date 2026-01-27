package com.gzbz.benefit;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.benefit.bean.PlayerBenefitExtend;
import com.gzbz.db.PlayerDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.RecommendModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.BenefitMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.RecommendTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.List;
import misc.MiscUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class RecommendPart extends PlayerPart {
   private Logger logger = LoggerFactory.getLogger(RecommendPart.class);

   @MsgHandlerAnno
   public void C2S_RecommendInfo_8122(BenefitMsg.C2S_RecommendInfo_8122 msg, String source) {
      this.sendRecommendInfo();
   }

   @MsgHandlerAnno
   public void C2S_RecommendReward_8124(BenefitMsg.C2S_RecommendReward_8124 msg, String source) {
      int taskId = msg.getTaskId();
      RecommendModel recommendModel = (RecommendModel)ApplicationContextProvider.getModelPoolEntity("recommend", taskId);
      if (recommendModel == null) {
         this.sendRewardResult(6, taskId, "玩家{}领取{}推荐奖励失败,配置不存在", this.player.getPlayerId(), taskId);
      } else {
         PlayerBenefitExtend playerBenefitExtend = (PlayerBenefitExtend)this.player.getPlayerExtend(20);
         long value = (Long)playerBenefitExtend.taskCompletion.getOrDefault(taskId, 0L);
         int completeCount = MiscUtil.getHiParam(value);
         int rewardCount = MiscUtil.getLowParam(value);
         if (rewardCount >= recommendModel.getLimitCount()) {
            this.sendRewardResult(20008, taskId, "玩家{}领取{}推荐奖励失败,领取次数已达上限", this.player.getPlayerId(), taskId);
         } else if (rewardCount >= completeCount) {
            this.sendRewardResult(33, taskId, "玩家{}领取{}推荐奖励失败,任务未达成", this.player.getPlayerId(), taskId);
         } else {
            int resourceCount = completeCount - rewardCount;
            playerBenefitExtend.taskCompletion.put(taskId, MiscUtil.comboInteger(completeCount, rewardCount + resourceCount));
            this.player.updatePlayerExtend(20);
            if (resourceCount > 1) {
               List<ResourceModel> rewardList = new ArrayList();
               recommendModel.getItems().forEach((resourceModel) -> {
                  ResourceModel rewardResource = resourceModel.clone();
                  rewardResource.setValue(rewardResource.getValue() * resourceCount);
                  rewardResource.addResourceToList(rewardList);
               });
               this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 20, 2007, 0, 0, "");
            } else {
               this.player.addResource(recommendModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 20, 2007, 0, 0, "");
            }

            this.sendRewardResult(1, taskId, (String)null);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RecommendActive_8128(BenefitMsg.C2S_RecommendActive_8128 msg, String source) {
      int recommendCode = msg.getCode();
      if (!this.invited(recommendCode)) {
         this.player.failure(20007);
      } else {
         BenefitMsg.S2C_RecommendActive_8129.Builder resp = BenefitMsg.S2C_RecommendActive_8129.newBuilder();
         resp.setCode(recommendCode);
         this.sendRecommendInfo();
      }
   }

   public boolean filterRecommend(int recommendCode) {
      if (recommendCode <= 0) {
         return false;
      } else if (recommendCode == this.buildRecommendCode(this.player.getPlayerId())) {
         return false;
      } else {
         PlayerBenefitExtend playerBenefitExtend = (PlayerBenefitExtend)this.player.getPlayerExtend(20);
         if (playerBenefitExtend.recommendPlayer > 0) {
            return false;
         } else {
            int recommendPlayerId = this.getPlayerIdByRecommendCode(recommendCode);
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            GamePlayer recommendPlayer = worldMgr.getPlayerById(recommendPlayerId);
            return recommendPlayer != null;
         }
      }
   }

   public boolean invited(int recommendCode) {
      if (recommendCode <= 0) {
         return false;
      } else if (recommendCode == this.buildRecommendCode(this.player.getPlayerId())) {
         return false;
      } else {
         PlayerBenefitExtend playerBenefitExtend = (PlayerBenefitExtend)this.player.getPlayerExtend(20);
         if (playerBenefitExtend.recommendPlayer > 0) {
            return false;
         } else {
            int recommendPlayerId = this.getPlayerIdByRecommendCode(recommendCode);
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            GamePlayer recommendPlayer = worldMgr.getPlayerById(recommendPlayerId);
            if (recommendPlayer == null) {
               return false;
            } else {
               playerBenefitExtend.recommendPlayer = recommendPlayerId;
               this.player.updatePlayerExtend(20);
               String rewardConfigStr = ApplicationContextProvider.getConfigString("ReferralCodeReward", "");
               if (!StringUtils.isEmpty(rewardConfigStr)) {
                  String[] rewardArr = rewardConfigStr.split(",");
                  List<ResourceModel> rewardList = new ArrayList();

                  for(String rewardStr : rewardArr) {
                     String[] itemArr = rewardStr.split("\\|");
                     ResourceModel.addResourceToList(rewardList, new ResourceModel(Integer.parseInt(itemArr[0]), Integer.parseInt(itemArr[1]), Integer.parseInt(itemArr[2])));
                  }

                  this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 20, 2009, recommendCode, 0, "");
               }

               recommendPlayer.pushTask(() -> {
                  RecommendPart recommendPart = (RecommendPart)recommendPlayer.getMgrPart(RecommendPart.class);
                  if (recommendPart.recommend(this.player.getPlayerId())) {
                     this.player.pushTask(() -> {
                        RecommendTaskPart recommendTaskPart = (RecommendTaskPart)this.player.getMgrPart(RecommendTaskPart.class);
                        recommendTaskPart.trigger();
                     });
                  }

               });
               return true;
            }
         }
      }
   }

   public boolean recommend(int invited) {
      PlayerBenefitExtend playerBenefitExtend = (PlayerBenefitExtend)this.player.getPlayerExtend(20);
      if (playerBenefitExtend.invitedPlayers.size() >= 20) {
         return false;
      } else {
         playerBenefitExtend.invitedPlayers.add(invited);
         this.player.updatePlayerExtend(20);
         this.sendRecommendInfo();
         return true;
      }
   }

   public void invitedPlayerComplete(int taskId) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      PlayerBenefitExtend playerBenefitExtend = (PlayerBenefitExtend)this.player.getPlayerExtend(20);
      int recommendPlayerId = playerBenefitExtend.recommendPlayer;
      GamePlayer recommendPlayer = worldMgr.getPlayerById(recommendPlayerId);
      if (recommendPlayer != null) {
         recommendPlayer.pushTask(() -> {
            RecommendPart recommendPart = (RecommendPart)recommendPlayer.getMgrPart(RecommendPart.class);
            recommendPart.recommendPlayerComplete(taskId);
         });
      }

   }

   public void recommendPlayerComplete(int taskId) {
      PlayerBenefitExtend playerBenefitExtend = (PlayerBenefitExtend)this.player.getPlayerExtend(20);
      long value = (Long)playerBenefitExtend.taskCompletion.getOrDefault(taskId, 0L);
      int completeCount = MiscUtil.getHiParam(value);
      int rewardCount = MiscUtil.getLowParam(value);
      if (completeCount < 20) {
         playerBenefitExtend.taskCompletion.put(taskId, MiscUtil.comboInteger(completeCount + 1, rewardCount));
         this.player.updatePlayerExtend(20);
         this.sendRecommendInfo();
      }
   }

   private int buildRecommendCode(int playerId) {
      return playerId * 10;
   }

   private int getPlayerIdByRecommendCode(int recommendCode) {
      return recommendCode / 10;
   }

   private void sendRecommendInfo() {
      if (this.player.isLogin()) {
         PlayerBenefitExtend playerBenefitExtend = (PlayerBenefitExtend)this.player.getPlayerExtend(20);
         BenefitMsg.S2C_RecommendResult_8123.Builder resp = BenefitMsg.S2C_RecommendResult_8123.newBuilder();
         resp.setRecommendCode(this.buildRecommendCode(this.player.getPlayerId()));
         playerBenefitExtend.taskCompletion.entrySet().forEach((entry) -> {
            long value = (Long)entry.getValue();
            BenefitMsg.RecommendTask.Builder taskBuilder = BenefitMsg.RecommendTask.newBuilder();
            taskBuilder.setTaskId((Integer)entry.getKey());
            taskBuilder.setFinishCount(MiscUtil.getHiParam(value));
            taskBuilder.setRewardCount(MiscUtil.getLowParam(value));
            resp.addTasks(taskBuilder);
         });
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         playerBenefitExtend.invitedPlayers.forEach((playerId) -> {
            GamePlayer invitedPlayer = worldMgr.getPlayerById(playerId);
            if (invitedPlayer != null) {
               PlayerDao invitedPlayerDao = invitedPlayer.getPlayerDao();
               BenefitMsg.RecommendPlayer.Builder playerBuilder = BenefitMsg.RecommendPlayer.newBuilder();
               playerBuilder.setCombatPower(invitedPlayer.getPlayerCombatPower());
               playerBuilder.setHead(invitedPlayerDao.head);
               playerBuilder.setLevel(invitedPlayerDao.lv);
               playerBuilder.setPlayerName(invitedPlayerDao.playerName);
               playerBuilder.setVipLv((long)invitedPlayerDao.vip_lv);
               resp.addRecommendPlayer(playerBuilder);
            }

         });
         resp.setBeRecommendCode(this.buildRecommendCode(playerBenefitExtend.recommendPlayer));
         this.player.sendMsg(resp.build());
      }
   }

   private void sendRewardResult(int code, int taskId, String message, Object... args) {
      if (code != 1 && !StringUtils.isEmpty(message)) {
      }

      BenefitMsg.S2C_RecommendRewardResult_8125.Builder msg = BenefitMsg.S2C_RecommendRewardResult_8125.newBuilder();
      msg.setResult(code);
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }
}
