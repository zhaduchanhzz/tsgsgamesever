package com.gzbz.mini;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.db.BattleChapterDao;
import com.gzbz.db.BattleTowerDao;
import com.gzbz.db.PlayerWeChatDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.FriendsPackageModel;
import com.gzbz.model.WechatRankRewardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.GmMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
import misc.MiscUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MiniProgramPart extends PlayerPart {
   public static final int INVITE_TASK_TARGET_LV = 1;
   public static final int INVITE_TASK_TARGET_VIP = 2;
   public static final int INVITE_TASK_TARGET_LOGIN = 3;

   @MsgHandlerAnno
   public void C2S_WeChatRewardInfo_2031(PlayerMsg.C2S_WeChatRewardInfo_2031 msg, String source) {
      PlayerMsg.S2C_WeChatRewardInfo_2032.Builder resp = PlayerMsg.S2C_WeChatRewardInfo_2032.newBuilder();
      PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
      PlayerMsg.ShareReward.Builder builder = PlayerMsg.ShareReward.newBuilder();
      builder.setNextReward(0);
      builder.setRewardCount(playerWeChatDao.friendShare);
      builder.setShareType(PlayerMsg.ShareType.WECHAT_FRIEND);
      resp.addShareData(builder);
      builder = PlayerMsg.ShareReward.newBuilder();
      builder.setNextReward(playerWeChatDao.momentsNextShare);
      builder.setRewardCount(playerWeChatDao.momentsShare);
      builder.setShareType(PlayerMsg.ShareType.WECHAT_MOMENTS);
      resp.addShareData(builder);
      builder = PlayerMsg.ShareReward.newBuilder();
      builder.setNextReward(DateUtil.getIntTime(System.currentTimeMillis()));
      builder.setRewardCount(playerWeChatDao.todayFriendShare);
      builder.setShareType(PlayerMsg.ShareType.WECHAT_FRIEND_DAILY);
      resp.addShareData(builder);
      resp.setIsGotLittleProgram(playerWeChatDao.isGotLittleProgram);
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_Share_2033(PlayerMsg.C2S_Share_2033 msg, String source) {
      switch (msg.getShareType()) {
         case WECHAT_FRIEND:
            this.weChatFriendShare();
            break;
         case WECHAT_MOMENTS:
            this.weChatMomentShare();
            break;
         case WECHAT_FRIEND_DAILY:
            this.weChatFriendDailyShare();
      }

   }

   private void weChatFriendShare() {
      PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
      if (playerWeChatDao.friendShare > 0) {
         this.player.failure(24);
      } else {
         PlayerMsg.S2C_Share_2034.Builder resp = PlayerMsg.S2C_Share_2034.newBuilder();
         PlayerMsg.ShareReward.Builder builder = PlayerMsg.ShareReward.newBuilder();
         builder.setShareType(PlayerMsg.ShareType.WECHAT_FRIEND);
         ++playerWeChatDao.friendShare;
         playerWeChatDao.updateOp();
         Map<Integer, CentreAwardModel> mailModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customCentreAward", CentreAwardModel.TYPE_WECHAT_FRIEND_AWARD);
         if (mailModelMap != null) {
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);

            for(Map.Entry<Integer, CentreAwardModel> entry : mailModelMap.entrySet()) {
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, ((CentreAwardModel)entry.getValue()).getTitle(), ((CentreAwardModel)entry.getValue()).getDesc(), ((CentreAwardModel)entry.getValue()).getItems(), 604800000L, 13, 1307);
            }
         }

         builder.setRewardCount(playerWeChatDao.friendShare);
         builder.setNextReward(0);
         resp.setShareData(builder);
         this.player.sendMsg(resp.build());
      }
   }

   private void weChatMomentShare() {
      PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
      String[] dailyConfig = ApplicationContextProvider.getConfigString("weChatShareTime", "3|30").split("\\|");
      int dailyCount = Integer.parseInt(dailyConfig[0]);
      PlayerMsg.S2C_Share_2034.Builder resp = PlayerMsg.S2C_Share_2034.newBuilder();
      PlayerMsg.ShareReward.Builder builder = PlayerMsg.ShareReward.newBuilder();
      builder.setShareType(PlayerMsg.ShareType.WECHAT_MOMENTS);
      if (playerWeChatDao.momentsShare < dailyCount) {
         int nextCd = Integer.parseInt(dailyConfig[1]) * 60;
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         if (playerWeChatDao.momentsNextShare <= curTime) {
            ++playerWeChatDao.momentsShare;
            playerWeChatDao.momentsNextShare = curTime + nextCd;
            playerWeChatDao.updateOp();
            String rewardConfigStr = ApplicationContextProvider.getConfigString("weChatDayToShare", "");
            List<ResourceModel> rewards = ResourceModel.buildResources(rewardConfigStr);
            this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 13, 1307, 0, 0, PlayerMsg.ShareType.WECHAT_MOMENTS.name());
         }
      }

      builder.setRewardCount(playerWeChatDao.momentsShare);
      builder.setNextReward(playerWeChatDao.momentsNextShare);
      resp.setShareData(builder);
      this.player.sendMsg(resp.build());
   }

   private void weChatFriendDailyShare() {
      PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
      String[] dailyConfig = ApplicationContextProvider.getConfigString("FengxiangDyaReward", "2|1003|1,2|1001|100,1|8|500000,2").split(",");
      int dailyCount = Integer.parseInt(dailyConfig[dailyConfig.length - 1]);
      PlayerMsg.S2C_Share_2034.Builder resp = PlayerMsg.S2C_Share_2034.newBuilder();
      PlayerMsg.ShareReward.Builder builder = PlayerMsg.ShareReward.newBuilder();
      builder.setShareType(PlayerMsg.ShareType.WECHAT_FRIEND_DAILY);
      if (playerWeChatDao.todayFriendShare < dailyCount) {
         ++playerWeChatDao.todayFriendShare;
         if (playerWeChatDao.todayFriendShare == dailyCount) {
            List<ResourceModel> rewards = new ArrayList();

            for(int i = 0; i < dailyConfig.length - 1; ++i) {
               rewards.add(ResourceModel.buildResource(dailyConfig[i]));
            }

            this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 13, 1307, 0, 0, PlayerMsg.ShareType.WECHAT_FRIEND_DAILY.name());
         }

         playerWeChatDao.updateOp();
      }

      builder.setRewardCount(playerWeChatDao.todayFriendShare);
      builder.setNextReward(DateUtil.getIntTime(System.currentTimeMillis()));
      resp.setShareData(builder);
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_LittleProgramReward_2035(PlayerMsg.C2S_LittleProgramReward_2035 msg, String source) {
      PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
      if (playerWeChatDao.isGotLittleProgram) {
         this.player.failure(24);
      } else {
         playerWeChatDao.isGotLittleProgram = true;
         playerWeChatDao.updateOp();
         String rewardStr = ApplicationContextProvider.getConfigString("programReward", "");
         this.player.addResource(ResourceModel.buildResources(rewardStr), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 13, 1309, 0, 0, "");
         PlayerMsg.S2C_LittleProgramReward_2036.Builder resp = PlayerMsg.S2C_LittleProgramReward_2036.newBuilder();
         resp.setIsGotLittleProgram(playerWeChatDao.isGotLittleProgram);
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_InviteInfo_2037(PlayerMsg.C2S_InviteInfo_2037 msg, String source) {
      this.sendInviteInfo();
   }

   @MsgHandlerAnno
   public void C2S_InviteReward_2039(PlayerMsg.C2S_InviteReward_2039 msg, String source) {
      PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
      WechatRankRewardModel wechatRankRewardModel = (WechatRankRewardModel)ApplicationContextProvider.getModelPoolEntity("WechatRankReward", msg.getGotReward());
      if (wechatRankRewardModel == null) {
         this.player.failure(0);
      } else {
         RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
         rankMgr.pushTask(() -> {
            if ((long)wechatRankRewardModel.getPeople() > rankMgr.getScore(RankDefine.RankModule.WECHAT_INVITE, this.player.getPlayerId())) {
               this.player.failure(51);
            } else {
               this.player.pushTask(() -> {
                  if (playerWeChatDao.invitePlayerReward.contains(msg.getGotReward())) {
                     this.player.failure(24);
                  } else {
                     playerWeChatDao.invitePlayerReward.add(msg.getGotReward());
                     playerWeChatDao.updateOp();
                     this.player.addResource(wechatRankRewardModel.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 13, 1310, msg.getGotReward(), 0, "");
                     PlayerMsg.S2C_InviteReward_2040.Builder resp = PlayerMsg.S2C_InviteReward_2040.newBuilder();
                     resp.setGotReward(msg.getGotReward());
                     this.player.sendMsg(resp.build());
                     this.player.getOperationMgr().addExtraLog(this.player, 16, "小程序", "", "", "", "", "", "", "", "小程序邀请活动", "", "", wechatRankRewardModel.getTaskName());
                  }
               });
            }
         });
      }
   }

   @MsgHandlerAnno
   public void C2S_FriendGift_2041(PlayerMsg.C2S_FriendGift_2041 msg, String source) {
      this.sendFriendGiftData();
   }

   @MsgHandlerAnno
   public void C2S_FriendGiftReward_2043(PlayerMsg.C2S_FriendGiftReward_2043 msg, String source) {
      if (!this.isNotOpenFriendPackage()) {
         Map<Integer, FriendsPackageModel> models = this.getModelMap();
         if (models == null) {
            this.player.failure(0);
         } else {
            FriendsPackageModel friendsPackageModel = (FriendsPackageModel)models.get(msg.getId());
            if (friendsPackageModel == null) {
               this.player.failure(0);
            } else {
               PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
               int curPlayerNum = (Integer)playerWeChatDao.inviteTargetData.getOrDefault(String.format("%d-%d", friendsPackageModel.getTaskType(), friendsPackageModel.getTaskNum()), 0);
               if (playerWeChatDao.inviteTargetReward.contains(msg.getId())) {
                  this.player.failure(24);
               } else if (friendsPackageModel.getPlayerNum() > curPlayerNum) {
                  this.player.failure(51);
               } else {
                  playerWeChatDao.inviteTargetReward.add(msg.getId());
                  playerWeChatDao.updateOp();
                  this.player.addResource(friendsPackageModel.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 13, 1312, msg.getId(), 0, "");
                  PlayerMsg.S2C_FriendGiftReward_2044.Builder resp = PlayerMsg.S2C_FriendGiftReward_2044.newBuilder();
                  resp.setId(msg.getId());
                  this.player.sendMsg(resp.build());
                  this.player.getOperationMgr().addExtraLog(this.player, 16, "小程序", "", "", "", "", "", "", "", "小程序邀请活动", "", "", friendsPackageModel.getTaskName());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_QQSaveDesktopReward_2045(PlayerMsg.C2S_QQSaveDesktopReward_2045 msg, String source) {
      PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
      if (playerWeChatDao.isGotLittleProgram) {
         this.player.failure(24);
      } else {
         playerWeChatDao.isGotLittleProgram = true;
         playerWeChatDao.updateOp();
         String rewardStr = ApplicationContextProvider.getConfigString("QQSaveDesktop", "");
         this.player.addResource(ResourceModel.buildResources(rewardStr), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 13, 1313, 0, 0, "");
         PlayerMsg.S2C_QQSaveDesktopReward_2046.Builder resp = PlayerMsg.S2C_QQSaveDesktopReward_2046.newBuilder();
         resp.setIsGotLittleProgram(true);
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_TikTokShareRecord_2053(PlayerMsg.C2S_TikTokShareRecord_2053 msg, String source) {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      int shareChapterId = battleChapterDao.chapterId;
      if (shareChapterId > 0) {
         PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
         if (!playerWeChatDao.tiktokSharedRecordIDSet.contains(shareChapterId)) {
            playerWeChatDao.tiktokSharedRecordIDSet.add(shareChapterId);
            playerWeChatDao.updateOp();
            String rewardConfigStr = ApplicationContextProvider.getConfigString("douyinShareReward", "");
            List<ResourceModel> rewards = ResourceModel.buildResources(rewardConfigStr);
            this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 13, 1314, 0, 0, "");
         }
      }
   }

   private void sendInviteInfo() {
      PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
      RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
      rankMgr.pushTask(() -> {
         PlayerMsg.S2C_InviteInfo_2038.Builder resp = PlayerMsg.S2C_InviteInfo_2038.newBuilder();
         resp.setInviteCount((int)rankMgr.getScore(RankDefine.RankModule.WECHAT_INVITE, this.player.getPlayerId()));
         resp.addAllGotReward(playerWeChatDao.invitePlayerReward);
         this.player.sendMsg(resp.build());
      });
   }

   private void sendFriendGiftData() {
      if (!this.isNotOpenFriendPackage()) {
         Map<Integer, FriendsPackageModel> models = this.getModelMap();
         if (models != null) {
            PlayerMsg.S2C_FriendGift_2042.Builder resp = PlayerMsg.S2C_FriendGift_2042.newBuilder();
            PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());

            for(FriendsPackageModel friendsPackageModel : models.values()) {
               PlayerMsg.FriendGiftData.Builder builder = PlayerMsg.FriendGiftData.newBuilder();
               builder.setId(friendsPackageModel.getId());
               int playerNum = (Integer)playerWeChatDao.inviteTargetData.getOrDefault(String.format("%d-%d", friendsPackageModel.getTaskType(), friendsPackageModel.getTaskNum()), 0);
               builder.setValue(Math.min(playerNum, friendsPackageModel.getPlayerNum()));
               builder.setIsGot(playerWeChatDao.inviteTargetReward.contains(friendsPackageModel.getId()));
               resp.addData(builder);
            }

            this.player.sendMsg(resp.build());
         }
      }
   }

   @TaskMethod
   public void invitePlayer(String beInvite) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer beInvitePlayer = worldMgr.getGamePlayerByAccount(beInvite, worldMgr.GAME_SERVER_ID);
      if (beInvitePlayer != null) {
         PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
         if (!playerWeChatDao.invitePlayer.contains(beInvite)) {
            playerWeChatDao.invitePlayer.add(beInvite);
            playerWeChatDao.updateOp();
            beInvitePlayer.pushPartTaskEx(MiniProgramPart.class, "beInviteRank", new Object[]{this.player.getPlayerId()});
            if (!this.isNotOpenFriendPackage()) {
               beInvitePlayer.pushPartTaskEx(MiniProgramPart.class, "beInvite", new Object[]{this.player.getPlayerId()});
            }
         }
      }
   }

   @TaskMethod
   public void beInvite(int invitePlayer) {
      PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
      if (playerWeChatDao.invite <= 0) {
         playerWeChatDao.invite = invitePlayer;
         playerWeChatDao.updateOp();
      }
   }

   @TaskMethod
   public void beInviteRank(int invitePlayer) {
      PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
      if (playerWeChatDao.invitePlayerId <= 0L) {
         playerWeChatDao.invitePlayerId = MiscUtil.comboInteger(0, invitePlayer);
         playerWeChatDao.updateOp();
      }
   }

   @TaskMethod
   public void updateInviteRank() {
      RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
      rankMgr.pushTask(() -> {
         int oldScore = (int)rankMgr.getScore(RankDefine.RankModule.WECHAT_INVITE, this.player.getPlayerId());
         rankMgr.updateRank(RankDefine.RankModule.WECHAT_INVITE, (long)(oldScore + 1), this.player.getPlayerId());
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "小程序-邀请奖励", String.valueOf(oldScore + 1), "-", 0, 0, 0);
      });
   }

   public void checkBeInvite() {
      PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
      if (playerWeChatDao.invitePlayerId > 0L) {
         boolean isFinish = MiscUtil.getHiParam(playerWeChatDao.invitePlayerId) == 1;
         if (!isFinish) {
            String[] conditions = ApplicationContextProvider.getConfigString("fenXiangLiYuYaoQiu", "20|80").split("\\|");
            int lv = Integer.parseInt(conditions[0]);
            int tower = Integer.parseInt(conditions[1]);
            if (this.player.getPublicDao().lv >= lv) {
               BattleTowerDao towerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
               if (towerDao.towerId >= tower) {
                  int invitePlayerId = MiscUtil.getLowParam(playerWeChatDao.invitePlayerId);
                  playerWeChatDao.invitePlayerId = MiscUtil.comboInteger(1, invitePlayerId);
                  playerWeChatDao.updateOp();
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

   public void shareOutBonus(int money) {
      if (!this.isNotOpenFriendPackage()) {
         GamePlayer invitePlayer = this.getInvitePlayer();
         if (invitePlayer != null) {
            invitePlayer.pushPartTaskEx(MiniProgramPart.class, "beShareOutBonus", new Object[]{money});
         }
      }
   }

   @TaskMethod
   public void beShareOutBonus(int money) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> mailModelMap = (TreeMap)centreAwardMap.get(CentreAwardModel.TYPE_INVITE_SHARE_OUT_BONUS);
      if (mailModelMap != null) {
         CentreAwardModel centreAwardModel = (CentreAwardModel)mailModelMap.firstEntry().getValue();
         int shareRate = ApplicationContextProvider.getConfigInt("QqFriendsRed", 15);
         int gold = (int)((float)(money * 10) * ((float)shareRate / 100.0F));
         List<ResourceModel> resourceModels = new ArrayList();
         resourceModels.add(new ResourceModel(1, PlayerDefine.PLAYER_GOLD, gold));
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModels, 604800000L, 13, 1311);
      }
   }

   public void loginHandle() {
      GmMgr gmMgr = (GmMgr)ApplicationContextProvider.getContext().getBean(GmMgr.class);
      gmMgr.pushTaskEx("sendWeChatGiftInfo", new Object[]{this.player});
   }

   public void resetDaily() {
      PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
      if (playerWeChatDao.momentsShare > 0) {
         playerWeChatDao.momentsShare = 0;
         playerWeChatDao.updateOp();
      }

      if (playerWeChatDao.todayFriendShare > 0) {
         playerWeChatDao.todayFriendShare = 0;
         playerWeChatDao.updateOp();
      }

      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      this.checkBeInviteTask(3, (Integer)playerResetCustomCache.getForeverNum(1, 0));
   }

   public void resetWeek() {
      PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
      if (!playerWeChatDao.invitePlayerReward.isEmpty()) {
         playerWeChatDao.invitePlayerReward.clear();
         playerWeChatDao.updateOp();
         this.sendInviteInfo();
      }

   }

   public void levelUp(int preLv, int newLv) {
      GmMgr gmMgr = (GmMgr)ApplicationContextProvider.getContext().getBean(GmMgr.class);
      gmMgr.pushTaskEx("sendWeChatGiftInfo", new Object[]{this.player});
      this.checkBeInviteTask(1, newLv);
      this.checkBeInvite();
   }

   public void checkBeInviteTask(int taskType, int value) {
      if (!this.isNotOpenFriendPackage()) {
         GamePlayer invitePlayer = this.getInvitePlayer();
         if (invitePlayer != null) {
            List<FriendsPackageModel> beInviteModels = this.getBeInviteModels(taskType);
            if (beInviteModels == null) {
               return;
            }

            PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());

            for(FriendsPackageModel friendsPackageModel : beInviteModels) {
               String key = String.format("%d-%d", friendsPackageModel.getTaskType(), friendsPackageModel.getTaskNum());
               if (!playerWeChatDao.beInviteTargetData.contains(key) && friendsPackageModel.getTaskNum() <= value) {
                  invitePlayer.pushPartTaskEx(MiniProgramPart.class, "beInviteTaskFinish", new Object[]{key});
                  playerWeChatDao.beInviteTargetData.add(key);
                  playerWeChatDao.updateOp();
               }
            }
         }

      }
   }

   @TaskMethod
   public void beInviteTaskFinish(String taskKey) {
      PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
      playerWeChatDao.inviteTargetData.put(taskKey, (Integer)playerWeChatDao.inviteTargetData.getOrDefault(taskKey, 0) + 1);
      playerWeChatDao.updateOp();
      this.sendFriendGiftData();
   }

   private boolean isNotOpenFriendPackage() {
      return this.getModelMap() == null;
   }

   private Map<Integer, FriendsPackageModel> getModelMap() {
      Map<String, Map<Integer, FriendsPackageModel>> modelMap = ApplicationContextProvider.<String, Map<Integer, FriendsPackageModel>>getModelPoolMap("customFriendsPackage");
      if (modelMap == null) {
         return null;
      } else {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         return (Map)modelMap.get(worldMgr.PLATFORM_NAME);
      }
   }

   private List<FriendsPackageModel> getBeInviteModels(int taskType) {
      Map<String, Map<Integer, List<FriendsPackageModel>>> modelMap = ApplicationContextProvider.<String, Map<Integer, List<FriendsPackageModel>>>getModelPoolMap("customFriendsPackageBeInvite");
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      if (modelMap != null && modelMap.containsKey(worldMgr.PLATFORM_NAME)) {
         Map<Integer, List<FriendsPackageModel>> platformModelMap = (Map)modelMap.get(worldMgr.PLATFORM_NAME);
         return (List)platformModelMap.get(taskType);
      } else {
         return null;
      }
   }

   private GamePlayer getInvitePlayer() {
      PlayerWeChatDao playerWeChatDao = (PlayerWeChatDao)this.player.getData("tb_player_wechat", this.player.getPlayerId());
      if (playerWeChatDao.invite <= 0) {
         return null;
      } else {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         return worldMgr.getPlayerById(playerWeChatDao.invite);
      }
   }
}
