package com.gzbz.share.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.db.BattleTowerDao;
import com.gzbz.db.SVipDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.mini.MiniProgramPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.DailyInvitationRewardModel;
import com.gzbz.model.FocusRewardsModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.SVipMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import misc.DateUtil;
import misc.MiscUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class SVipPart extends PlayerPart {
   @Autowired
   ConfigManager configManager;

   public void resetDaily() {
      SVipDao dao = this.getDao();
      dao.dailyInviteNum = 0;
      dao.updateOp();
      this.sendTotalInfo();
   }

   public void levelUp(int preLv, int newLv) {
      this.checkBeInvite();
   }

   public SVipDao getDao() {
      SVipDao sVipDao = (SVipDao)this.player.getData("tb_s_vip", this.player.getPlayerId());
      return sVipDao;
   }

   @MsgHandlerAnno
   public void C2S_TotalInfo_21501(SVipMsg.C2S_TotalInfo_21501 msg, String source) {
      this.sendTotalInfo();
   }

   public void sendTotalInfo() {
      SVipDao dao = this.getDao();
      RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
      rankMgr.pushTask(() -> {
         SVipMsg.S2C_TotalInfo_21502.Builder resp = SVipMsg.S2C_TotalInfo_21502.newBuilder();
         resp.setFocusState(dao.focusState);
         resp.setFocusReceiveType(dao.focusReceiveType);
         resp.setDailyInviteNum(dao.dailyInviteNum);
         resp.setTotalInviteNum((int)rankMgr.getScore(RankDefine.RankModule.S_VIP_INVITE, this.player.getPlayerId()));
         resp.addAllInviteReceiveId(dao.inviteReceiveId);
         this.player.sendMsg(resp.build());
      });
   }

   @MsgHandlerAnno
   public boolean C2S_FocusReceive_21503(SVipMsg.C2S_FocusReceive_21503 msg, String source) {
      if (!this.player.isSystemOpen(5910)) {
         return this.player.failure(8007);
      } else {
         SVipDao dao = this.getDao();
         if (dao.focusState == 1) {
            return this.player.failure(76030);
         } else {
            if (msg.getFocusReceiveType() <= 0) {
               Map<Integer, FocusRewardsModel> focusModelMap = ApplicationContextProvider.<Integer, FocusRewardsModel>getModelPoolMap("focusRewards");
               if (focusModelMap == null || focusModelMap.isEmpty()) {
                  return this.player.failure(37);
               }

               Optional<FocusRewardsModel> first = focusModelMap.values().stream().findFirst();
               if (null == first || null == first.get()) {
                  return this.player.failure(37);
               }

               FocusRewardsModel focusModel = (FocusRewardsModel)first.get();
               this.player.addResource(focusModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 120, 12001, 0, 0, "");
               dao.focusState = 1;
               dao.focusReceiveType = 1;
            } else {
               CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_FOCUS_REWARD_MAIL);
               if (null == centreAwardModel) {
                  return this.player.failure(37);
               }

               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), 604800000L, 120, 12001);
               dao.focusState = 1;
               dao.focusReceiveType = 2;
            }

            dao.updateOp();
            SVipMsg.S2C_FocusReceive_21504.Builder resp = SVipMsg.S2C_FocusReceive_21504.newBuilder();
            resp.setFocusState(dao.focusState);
            resp.setFocusReceiveType(dao.focusReceiveType);
            this.player.sendMsg(resp.build());
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Invite_21505(SVipMsg.C2S_Invite_21505 msg, String source) {
      String[] dailyConfig = ApplicationContextProvider.getConfigString("DailyInvitationFriendReward", "2|1003|1,2|1001|200,1|8|500000").split(",");
      int dailyCount = this.configManager.getIntDefault("DailyInvitationFriendNumLimit", 2);
      SVipDao dao = this.getDao();
      if (dao.dailyInviteNum >= dailyCount) {
         return this.player.failure(76030);
      } else {
         ++dao.dailyInviteNum;
         if (dao.dailyInviteNum == dailyCount) {
            List<ResourceModel> rewards = new ArrayList();

            for(int i = 0; i < dailyConfig.length; ++i) {
               rewards.add(ResourceModel.buildResource(dailyConfig[i]));
            }

            this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 120, 12002, 0, 0, "");
         }

         dao.updateOp();
         RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
         rankMgr.pushTask(() -> {
            SVipMsg.S2C_Invite_21506.Builder resp = SVipMsg.S2C_Invite_21506.newBuilder();
            resp.setDailyInviteNum(dao.dailyInviteNum);
            resp.setTotalInviteNum((int)rankMgr.getScore(RankDefine.RankModule.S_VIP_INVITE, this.player.getPlayerId()));
            resp.addAllInviteReceiveId(dao.inviteReceiveId);
            this.player.sendMsg(resp.build());
         });
         return true;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_AddUpInviteReceive_21507(SVipMsg.C2S_AddUpInviteReceive_21507 msg, String source) {
      DailyInvitationRewardModel model = (DailyInvitationRewardModel)ApplicationContextProvider.getModelPoolEntity("dailyInvitationReward", msg.getId());
      if (null == model) {
         return this.player.failure(6);
      } else {
         SVipDao dao = this.getDao();
         if (dao.inviteReceiveId.contains(model.getId())) {
            return this.player.failure(76030);
         } else {
            RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
            rankMgr.pushTask(() -> {
               if (rankMgr.getScore(RankDefine.RankModule.S_VIP_INVITE, this.player.getPlayerId()) < (long)model.getPeople()) {
                  this.player.failure(76031);
               } else {
                  this.player.addResource(model.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 120, 12003, 0, 0, "");
                  dao.inviteReceiveId.add(model.getId());
                  dao.updateOp();
                  SVipMsg.S2C_AddUpInviteReceive_21508.Builder resp = SVipMsg.S2C_AddUpInviteReceive_21508.newBuilder();
                  resp.setTotalInviteNum((int)rankMgr.getScore(RankDefine.RankModule.S_VIP_INVITE, this.player.getPlayerId()));
                  resp.addAllInviteReceiveId(dao.inviteReceiveId);
                  this.player.sendMsg(resp.build());
               }
            });
            return true;
         }
      }
   }

   @TaskMethod
   public void invitePlayer(String beInvite) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      if (DateUtil.difftimeDay(new Timestamp(worldMgr.getOpenServerTime())) < 3) {
         GamePlayer beInvitePlayer = worldMgr.getGamePlayerByAccount(beInvite, worldMgr.GAME_SERVER_ID);
         if (beInvitePlayer != null) {
            SVipDao dao = this.getDao();
            if (!dao.invitePlayer.contains(beInvite)) {
               dao.invitePlayer.add(beInvite);
               dao.updateOp();
               beInvitePlayer.pushPartTaskEx(MiniProgramPart.class, "beInviteRank", new Object[]{this.player.getPlayerId()});
            }
         }
      }
   }

   @TaskMethod
   public void beInviteRank(int invitePlayer) {
      SVipDao dao = this.getDao();
      if (dao.invitePlayerId <= 0L) {
         dao.invitePlayerId = MiscUtil.comboInteger(0, invitePlayer);
         dao.updateOp();
      }
   }

   @TaskMethod
   public void updateInviteRank() {
      RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
      rankMgr.pushTask(() -> {
         int oldScore = (int)rankMgr.getScore(RankDefine.RankModule.S_VIP_INVITE, this.player.getPlayerId());
         rankMgr.updateRank(RankDefine.RankModule.S_VIP_INVITE, (long)(oldScore + 1), this.player.getPlayerId());
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "6kw专服-邀请奖励", String.valueOf(oldScore + 1), "-", 0, 0, 0);
      });
   }

   public void checkBeInvite() {
      SVipDao dao = this.getDao();
      if (dao.invitePlayerId > 0L) {
         boolean isFinish = MiscUtil.getHiParam(dao.invitePlayerId) == 1;
         if (!isFinish) {
            String[] conditions = ApplicationContextProvider.getConfigString("fenXiangLiYuYaoQiu", "20|80").split("\\|");
            int lv = Integer.parseInt(conditions[0]);
            int tower = Integer.parseInt(conditions[1]);
            if (this.player.getPublicDao().lv >= lv) {
               BattleTowerDao towerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
               if (towerDao.towerId >= tower) {
                  int invitePlayerId = MiscUtil.getLowParam(dao.invitePlayerId);
                  dao.invitePlayerId = MiscUtil.comboInteger(1, invitePlayerId);
                  dao.updateOp();
                  this.logger.info("被邀请人【{}】已满足活跃条件,增加邀请人【{}】邀请人数", this.player.getPlayerId(), invitePlayerId);
                  WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
                  GamePlayer invitePlayer = worldMgr.getPlayerById(invitePlayerId);
                  if (invitePlayer != null) {
                     invitePlayer.pushPartTaskEx(MiniProgramPart.class, "updateInviteRank", new Object[0]);
                  }
               }
            }
         }
      }
   }
}
