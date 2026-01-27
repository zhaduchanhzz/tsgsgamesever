package com.gzbz.mine.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import cn.hutool.core.collection.ConcurrentHashSet;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.BattleDao;
import com.gzbz.db.FriendDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.HeroSupportDao;
import com.gzbz.db.MinePersonDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.mine.MineMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.MineModel;
import com.gzbz.model.MineVeinModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMineMsg;
import com.gzbz.protobuf.MineMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import com.gzbz.worldMgr.WorldMgrPushTaskPart;
import debug.Debug;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
import net.CrossSubscribeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MinePart extends PlayerPart {
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private MineMgr mineMgr;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   ConfigManager configManager;
   public static Set<Integer> IN_MINE_PLAYERS = new ConcurrentHashSet();

   public void loginHandle() {
      super.loginHandle();
      this.checkRedDotState();
   }

   @MsgHandlerAnno
   public void C2S_PlayerEnter_12201(MineMsg.C2S_PlayerEnter_12201 msg, String source) {
      if (!this.player.isSystemOpen(2001)) {
         if (msg.getState() == 1) {
            this.player.failure(21);
         }

      } else if (!this.mineMgr.connectCrossMgr) {
         if (msg.getState() == 1) {
            this.player.failure(58102);
         }

      } else if (this.mineMgr.getState() == 2) {
         if (msg.getState() == 1) {
            int mineSettlementTime = this.configManager.getIntDefault("MineSettlementTime", 21);
            int mineClearMinute = this.configManager.getIntDefault("MineClearMinute", 5);
            int openTime = DateUtil.getIntTime(DateUtil.getDayStartTimeStamp()) + mineSettlementTime * 3600 + mineClearMinute * 60;
            MineMsg.S2C_ActiveTime_12256.Builder builder = MineMsg.S2C_ActiveTime_12256.newBuilder();
            builder.setOpenTime(openTime);
            this.player.sendMsg(builder.build());
         }

      } else {
         this.checkEnergyRecover();
         if (msg.getState() == 1) {
            this.checkInitArraying();
         }

         this.mineMgr.uploadCrossPlayer(this.player);
         if (msg.getState() == 1) {
            IN_MINE_PLAYERS.add(this.player.getPlayerId());
            MinePersonDao minePersonDao = this.getMinePersonDao();
            if (minePersonDao.loseTime == 0 || DateUtil.checkTime((long)minePersonDao.loseTime * 1000L, 1)) {
               minePersonDao.revengeId = 0;
               minePersonDao.loseTime = 0;
               minePersonDao.updateOp();
            }

            CrossMineMsg.S2CR_PlayerEnter_12301.Builder builder = CrossMineMsg.S2CR_PlayerEnter_12301.newBuilder();
            builder.setUseEnergy(minePersonDao.useEnergy);
            builder.setResumeTime(minePersonDao.resumeTime);
            builder.setBuyTime(minePersonDao.buyTime);
            builder.setMyHillId(minePersonDao.hillId);
            builder.setMyVeinId(minePersonDao.veinId);
            builder.setFallNum(minePersonDao.fallNum);
            builder.setRevengeId(minePersonDao.revengeId);
            builder.setAtkHeroPos(minePersonDao.atkPos);
            builder.setDurationTime(minePersonDao.durationTime);
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            long lastAtkTime = (Long)playerResetCustomCache.getForeverNum(521, 0L);
            builder.setFightCollTime(DateUtil.getIntTime(lastAtkTime));
            if (minePersonDao.friendCode > 0) {
               WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
               HeroSupportDao friendHeroSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.MINE, minePersonDao.friendCode);
               if (friendHeroSupportDao != null) {
                  MineMsg.FriendSupportHero.Builder heroInfo = MineMsg.FriendSupportHero.newBuilder();
                  heroInfo.setFriendCode(minePersonDao.friendCode);
                  heroInfo.setHero(friendHeroSupportDao.heroSupport.toBuilder());
                  builder.setSupportHero(heroInfo);
               }
            }

            PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
            builder.setHigestOccupyMineType(playerExtend.higestMineType);
            builder.setEmployNunOfWeek(minePersonDao.employNum);
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         } else {
            IN_MINE_PLAYERS.remove(this.player.getPlayerId());
         }

      }
   }

   public void checkEnergyRecover() {
      MinePersonDao minePersonDao = this.getMinePersonDao();
      if (minePersonDao.useEnergy > 0) {
         int mineEnergyMax = this.configManager.getIntDefault("MineEnergyMax", 5);
         if (minePersonDao.useEnergy > mineEnergyMax && this.player.getPublicDao().privilege_mine <= 0) {
            minePersonDao.useEnergy = (byte)mineEnergyMax;
         }

         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         int recoverTime = this.configManager.getIntDefault("MineEnergyRecovery", 21600);
         if (minePersonDao.resumeTime == 0) {
            minePersonDao.resumeTime = curTime + recoverTime;
         } else {
            while(minePersonDao.resumeTime < curTime && minePersonDao.useEnergy > 0) {
               minePersonDao.resumeTime += recoverTime;
               --minePersonDao.useEnergy;
            }

            if (minePersonDao.useEnergy <= 0) {
               minePersonDao.resumeTime = 0;
            }
         }

         minePersonDao.updateOp();
      }

   }

   private void checkInitArraying() {
      ArrayingMirror atkHeroArrayingData = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_MINE_ATK);
      if (atkHeroArrayingData != null && atkHeroArrayingData.arrayingIsEmpty()) {
         this.logger.info("玩家 {} 矿场进攻阵容为空，进行初始化", this.player.getPlayerId());
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         heroArrayingPart.copyHeroArraying(CommonMsg.HeroState.HERO_STATE_MINE_ATK, CommonMsg.HeroState.HERO_STATE_ARRAYING);
      }

      ArrayingMirror defHeroArrayingData = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_MINE_DEF);
      if (defHeroArrayingData != null && defHeroArrayingData.arrayingIsEmpty()) {
         this.logger.info("玩家 {} 矿场防守阵容为空，进行初始化", this.player.getPlayerId());
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         heroArrayingPart.copyHeroArraying(CommonMsg.HeroState.HERO_STATE_MINE_DEF, CommonMsg.HeroState.HERO_STATE_MINE_ATK);
      }

   }

   @MsgHandlerAnno
   public void C2S_MineInfo_12203(MineMsg.C2S_MineInfo_12203 msg, String source) {
      if (msg.getLine() <= 0) {
         this.collectError(2, "C2S_MineInfo_12203 line:" + msg.getLine());
      } else {
         CrossMineMsg.S2CR_MineInfo_12303.Builder builder = CrossMineMsg.S2CR_MineInfo_12303.newBuilder();
         builder.setLine(msg.getLine());
         builder.setHillId(msg.getHillId());
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_SetSupportHero_12207(MineMsg.C2S_SetSupportHero_12207 msg, String source) {
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      if (msg.getIsDispatch()) {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
         if (heroDao == null) {
            this.player.failure(4100);
            return;
         }

         heroBagPart.heroBagFlushProperties(heroDao);
         worldMgrPushTaskPart.pushTaskEx("addHeroSupport", new Object[]{HeroSupportDao.SupportModule.MINE, heroDao, this, "dispatchHero"});
      } else {
         MinePersonDao minePersonDao = this.getMinePersonDao();
         int friendCode = msg.getFriendCode();
         if (friendCode > 0) {
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int employNumofDay = (Integer)playerResetCustomCache.getDailyNum(544, 0);
            int employNumLimit = ApplicationContextProvider.getConfigInt("MineSelectHeroNumOfWeek", 4);
            if (employNumLimit > 0 && (employNumofDay <= 0 && minePersonDao.employNum >= employNumLimit || employNumofDay > 0 && minePersonDao.employNum > employNumLimit)) {
               this.player.failure(76137);
               return;
            }

            if (minePersonDao.friendCode == friendCode) {
               this.logger.info("已选择该好友的武将 friendCode:{}", friendCode);
               this.player.failure(55014);
               return;
            }

            FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
            if (!friendDao.friends.contains(friendCode)) {
               this.player.failure(6006);
               return;
            }

            worldMgrPushTaskPart.pushTaskEx("choiceHeroSupport", new Object[]{HeroSupportDao.SupportModule.MINE, friendCode, this, "choiceSupport"});
         }
      }

   }

   @TaskMethod
   public void dispatchHero(HeroSupportDao.SupportModule supportModule) {
      int propertyId = Integer.parseInt(this.configManager.parseValue("MineSupportAward", 0, "\\|"));
      int num = Integer.parseInt(this.configManager.parseValue("MineSupportAward", 1, "\\|"));
      this.player.addResource(1, propertyId, num, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 55, 5502, 0, 0, "");
      this.sendSetSupportResult(true);
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      guanJiaPart.checkState(2001, (List)null);
   }

   @TaskMethod
   public void choiceSupport(HeroSupportDao heroSupportDao) {
      if (heroSupportDao != null && heroSupportDao.heroSupport != null) {
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         if (heroArrayingPart.isHaveSameHeroId(CommonMsg.HeroState.HERO_STATE_MINE_DEF, heroSupportDao.heroSupport.id)) {
            this.player.failure(58109);
            return;
         }
      }

      MinePersonDao minePersonDao = this.getMinePersonDao();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int selectNum = (Integer)playerResetCustomCache.getDailyNum(544, 0);
      if (selectNum == 0 || minePersonDao.employNum == 0) {
         ++minePersonDao.employNum;
      }

      playerResetCustomCache.addDailyReset(544, 1);
      minePersonDao.atkPos = -1;
      minePersonDao.defPos = -1;
      minePersonDao.friendCode = heroSupportDao.playerId;
      minePersonDao.updateOp();
      this.sendSetSupportResult(false);
      CrossMineMsg.S2CR_UpdateDefPos_12373.Builder updateBuilder = CrossMineMsg.S2CR_UpdateDefPos_12373.newBuilder();
      updateBuilder.setHeroPos(-1);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), updateBuilder.build());
   }

   private void sendSetSupportResult(boolean isDispatch) {
      MineMsg.S2C_SetSupportHero_12208.Builder builder = MineMsg.S2C_SetSupportHero_12208.newBuilder();
      builder.setIsDispatch(isDispatch);
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      HeroSupportDao heroSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.MINE, this.player.getPlayerId());
      if (heroSupportDao != null) {
         builder.setMySupportHero(heroSupportDao.heroSupport.toBuilder());
      }

      MinePersonDao minePersonDao = this.getMinePersonDao();
      builder.setFriendCode(minePersonDao.friendCode);
      builder.setEmployNunOfWeek(minePersonDao.employNum);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_RewardPreview_12209(MineMsg.C2S_RewardPreview_12209 msg, String source) {
      MinePersonDao minePersonDao = this.getMinePersonDao();
      if (minePersonDao.hillId != 0 && minePersonDao.veinId != 0) {
         if (minePersonDao.having) {
            CrossMineMsg.S2CR_RewardPreview_12309.Builder builder = CrossMineMsg.S2CR_RewardPreview_12309.newBuilder();
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         } else {
            MineMsg.S2C_RewardPreview_12210.Builder builder = MineMsg.S2C_RewardPreview_12210.newBuilder();

            for(ResourceModel resourceModel : minePersonDao.rewards) {
               builder.addRewards(resourceModel.builder());
            }

            this.player.sendMsg(builder.build());
         }

      } else {
         this.player.failure(55004);
      }
   }

   @MsgHandlerAnno
   public void C2S_GetMineRewards_12211(MineMsg.C2S_GetMineRewards_12211 msg, String source) {
      MinePersonDao minePersonDao = this.getMinePersonDao();
      if (minePersonDao.hillId != 0 && minePersonDao.veinId != 0) {
         if (minePersonDao.having) {
            CrossMineMsg.S2CR_GetMineRewards_12311.Builder crossBuilder = CrossMineMsg.S2CR_GetMineRewards_12311.newBuilder();
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), crossBuilder.build());
         } else if (minePersonDao.rewards.size() > 0) {
            MineMsg.S2C_GetMineRewards_12212.Builder builder = MineMsg.S2C_GetMineRewards_12212.newBuilder();
            List<ResourceModel> list = new ArrayList();

            for(ResourceModel resourceModel : minePersonDao.rewards) {
               list.add(resourceModel.clone());
               builder.addRewards(resourceModel.builder());
            }

            builder.setDurationTime(minePersonDao.durationTime);
            minePersonDao.rewards.clear();
            minePersonDao.fallNum = 0;
            minePersonDao.durationTime = 0;
            minePersonDao.updateOp();
            this.player.addResource(list, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 55, 5503, minePersonDao.hillId, minePersonDao.veinId, "领取矿洞奖励");
            this.player.sendMsg(builder.build());
         } else {
            this.player.failure(55005);
         }

      } else {
         this.player.failure(55004);
      }
   }

   @MsgHandlerAnno
   public void CR2S_GetMineRewards_12312(CrossMineMsg.CR2S_GetMineRewards_12312 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MineMsg.S2C_GetMineRewards_12212.Builder builder = MineMsg.S2C_GetMineRewards_12212.newBuilder();
      List<ResourceModel> list = new ArrayList();

      for(CommonMsg.ItemInfo itemInfo : msg.getRewardsList()) {
         list.add(new ResourceModel(itemInfo.getType(), itemInfo.getId(), itemInfo.getNum()));
         builder.addRewards(itemInfo);
      }

      builder.setDurationTime(msg.getDurationTime());
      MinePersonDao minePersonDao = this.getMinePersonDao();
      minePersonDao.rewards.clear();
      minePersonDao.fallNum = 0;
      minePersonDao.durationTime = 0;
      minePersonDao.updateOp();
      this.player.addResource(list, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 55, 5503, minePersonDao.hillId, minePersonDao.veinId, "领取矿洞奖励");
      this.player.sendMsg(builder.build());
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      guanJiaPart.checkState(2001, (List)null);
   }

   @MsgHandlerAnno
   public void C2S_BuyEnergy_12213(MineMsg.C2S_BuyEnergy_12213 msg, String source) {
      int buyLimit = Integer.parseInt(this.configManager.parseValue("MineEnergyCost", 0, "\\|"));
      MinePersonDao minePersonDao = this.getMinePersonDao();
      if (minePersonDao.buyTime >= buyLimit) {
         this.player.failure(55001);
      } else if (minePersonDao.useEnergy <= 0) {
         minePersonDao.resumeTime = 0;
         this.player.failure(55002);
      } else {
         int cost = Integer.parseInt(this.configManager.parseValue("MineEnergyCost", 1, "\\|"));
         if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, cost)) {
            this.player.failure(18);
         } else {
            this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)cost, 55, 5501, 0, 0, "");
            --minePersonDao.useEnergy;
            ++minePersonDao.buyTime;
            if (minePersonDao.useEnergy == 0) {
               minePersonDao.resumeTime = 0;
            }

            minePersonDao.updateOp();
            MineMsg.S2C_BuyEnergy_12214.Builder builder = MineMsg.S2C_BuyEnergy_12214.newBuilder();
            builder.setUseEnergy(minePersonDao.useEnergy);
            builder.setBuyTime(minePersonDao.buyTime);
            builder.setResumeTime(minePersonDao.resumeTime);
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_MyMineInfo_12215(MineMsg.C2S_MyMineInfo_12215 msg, String source) {
      MinePersonDao minePersonDao = this.getMinePersonDao();
      if (minePersonDao.hillId == 0 && minePersonDao.startTime == 0) {
         this.player.failure(55004);
      } else {
         CrossMineMsg.S2CR_MyMineInfo_12315.Builder builder = CrossMineMsg.S2CR_MyMineInfo_12315.newBuilder();
         builder.setLine(minePersonDao.line);
         builder.setHillId(minePersonDao.hillId);
         builder.setVeinId(minePersonDao.veinId);
         builder.setFallNum(minePersonDao.fallNum);
         builder.setRevengeId(minePersonDao.revengeId);
         builder.setDurationTime(minePersonDao.durationTime);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_GetSupport_12217(MineMsg.C2S_GetSupport_12217 msg, String source) {
      MineMsg.S2C_GetSupport_12218.Builder builder = MineMsg.S2C_GetSupport_12218.newBuilder();
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      HeroSupportDao heroSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.MINE, this.player.getPlayerId());
      if (heroSupportDao != null) {
         builder.setMySupportHero(heroSupportDao.heroSupport.toBuilder());
      }

      float ratio = this.configManager.getFloatDefault("ratioOfMineSupport", 1.5F);
      long var10000 = (long)((float)this.player.getHeroOfMaxCombatPower().combatPower * ratio);
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());

      for(int friendCode : friendDao.friends) {
         GamePlayer friendPlayer = this.worldMgr.getPlayerById(friendCode);
         if (friendPlayer != null) {
            HeroSupportDao friendHeroSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.MINE, friendCode);
            if (friendHeroSupportDao != null) {
               MineMsg.FriendSupportHero.Builder heroInfo = MineMsg.FriendSupportHero.newBuilder();
               heroInfo.setFriendCode(friendCode);
               heroInfo.setHero(friendHeroSupportDao.heroSupport.toBuilder());
               builder.addHeroes(heroInfo);
            }
         }
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_MineDetail_12219(MineMsg.C2S_MineDetail_12219 msg, String source) {
      if (msg.getLine() <= 0) {
         this.collectError(2, "C2S_MineDetail_12219 line:" + msg.getLine() + " hillId:" + msg.getHillId() + " veinId:" + msg.getVeinId());
      } else {
         MineModel mineModel = (MineModel)ApplicationContextProvider.getModelPool().getEntity("mine", msg.getHillId());
         if (mineModel == null) {
            this.player.failure(6);
         } else {
            MineVeinModel mineVeinModel = (MineVeinModel)ApplicationContextProvider.getModelPool().getEntity("mineVein", msg.getVeinId());
            if (mineVeinModel == null) {
               this.player.failure(6);
            } else {
               CrossMineMsg.S2CR_MineDetail_12319.Builder builder = CrossMineMsg.S2CR_MineDetail_12319.newBuilder();
               builder.setLine(msg.getLine());
               builder.setHillId(msg.getHillId());
               builder.setVeinId(msg.getVeinId());
               builder.setFight(mineVeinModel.getSuggesPower());
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            }
         }
      }
   }

   public int enterBattle(BattleDao battleDao) {
      int state = this.mineMgr.getState();
      if (state == 2) {
         return 61227;
      } else if (state != 1) {
         return 8007;
      } else if (!battleDao.params.isEmpty() && battleDao.params.size() >= 4) {
         int atkType = (Integer)battleDao.params.get(0);
         MinePersonDao minePersonDao = this.getMinePersonDao();
         if (minePersonDao.fallNum <= 0 && minePersonDao.rewards.size() <= 0) {
            if (atkType == 3) {
               MineVeinModel mineVeinModel = (MineVeinModel)ApplicationContextProvider.getModelPool().getEntity("mineVein", battleDao.params.get(3));
               if (mineVeinModel == null) {
                  this.logger.info("上传的矿洞id：{}错误", battleDao.params.get(3));
                  return 6;
               }
            } else if (atkType == 2 && (minePersonDao.revengeId == 0 || System.currentTimeMillis() > (long)minePersonDao.loseTime * 1000L + 86400000L)) {
               return 55013;
            }

            boolean isPrivilegeMine = this.player.getPlayerDao().privilege_mine > 0;
            int extraEnergy = isPrivilegeMine ? this.configManager.getIntDefault("mineTQAddNum", 2) : 0;
            int mineEnergyMax = this.configManager.getIntDefault("MineEnergyMax", 5);
            int curEnergy = mineEnergyMax + extraEnergy - minePersonDao.useEnergy;
            if (atkType == 2 && curEnergy <= 0) {
               return 55003;
            } else if (minePersonDao.having && curEnergy <= 0) {
               return 55003;
            } else {
               PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
               long lastAtkTime = (Long)playerResetCustomCache.getForeverNum(521, 0L);
               if (System.currentTimeMillis() < lastAtkTime) {
                  return 55007;
               } else {
                  ArrayingMirror heroArrayingData = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_MINE_ATK);
                  if (heroArrayingData == null || heroArrayingData.arrayingElementsMap.isEmpty()) {
                     HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
                     heroArrayingPart.saveHeroArrayingSameCommon(CommonMsg.HeroState.HERO_STATE_MINE_ATK);
                  }

                  heroArrayingData = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_MINE_ATK);
                  if (heroArrayingData != null && !heroArrayingData.arrayingElementsMap.isEmpty()) {
                     HeroMirror tempHeroMirror = null;
                     int tempHeroPos = -1;
                     PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
                     minePersonDao.atkPos = (byte)tempHeroPos;
                     minePersonDao.updateOp();
                     this.logger.info("战斗-->{}进入【矿场争夺】战斗", this.player.getPlayerId());
                     int mineAtkWithEmployNum = (Integer)playerResetCustomCache.getDailyNum(536, 0);
                     this.mineMgr.pushTaskEx("atkMineVein", new Object[]{this.player, heroArrayingData, battleDao.params, tempHeroMirror, tempHeroPos, minePersonDao.revengeId, curEnergy, playerExtend.higestMineType, mineAtkWithEmployNum});
                     return 1;
                  } else {
                     return 21000;
                  }
               }
            }
         } else {
            return 58003;
         }
      } else {
         return 6;
      }
   }

   @MsgHandlerAnno
   public void CR2S_ATK_12322(CrossMineMsg.CR2S_ATK_12322 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.getIsAtkPlayer()) {
         MinePersonDao minePersonDao = this.getMinePersonDao();
         if (minePersonDao.atkPos >= 0 && minePersonDao.atkPos <= 5) {
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            playerResetCustomCache.addDailyReset(536, 1);
         }
      }

      Map<Integer, BattleDao> battleDaoMap = this.player.<Integer, BattleDao>getMap("tb_battle", this.player.getPlayerId());
      BattleDao battleDao = (BattleDao)battleDaoMap.get(2001);
      if (battleDao == null) {
         this.logger.info("矿场争夺战斗数据找不到 playerId:{}", this.player.getPlayerId());
      } else {
         battleDao.stream = msg.getBattleMsg().toByteArray();

         try {
            battleDao.scene = new BattleScene(BattleMsg.S2C_BattleResult_6102.parseFrom(battleDao.stream));
         } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
         }

         battleDao.status = 0;
         battleDao.totalTime = (long)battleDao.scene.getCostTime();
         battleDao.updateOp();
         List<ResourceModel> resourceModelList = new ArrayList();

         for(CommonMsg.ItemInfo itemInfo : msg.getBattleMsg().getResult().getAwardItemsList()) {
            if (itemInfo.getType() > 0 && itemInfo.getId() > 0 && itemInfo.getNum() > 0) {
               resourceModelList.add(new ResourceModel(itemInfo.getType(), itemInfo.getId(), itemInfo.getNum()));
            }
         }

         if (resourceModelList.size() > 0) {
            this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 55, 1213, battleDao.modelId, 0, "");
         }

         BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
         BattleMsg.S2C_BattleResult_6102 battleMsg = msg.getBattleMsg();
         this.player.sendMsg(battleRecordMgr.addBattleRecord(battleMsg.getType(), battleMsg.getSetId(), this.player.getPlayerId(), battleMsg.getTeams(1).getBeloogId(), battleMsg.toBuilder()).build());
      }
   }

   @MsgHandlerAnno
   public void CR2S_MailResource_12326(CrossMineMsg.CR2S_MailResource_12326 msg, CrossSubscribeMsg crossSubscribeMsg) {
      List<ResourceModel> list = new ArrayList();
      MinePersonDao minePersonDao = this.getMinePersonDao();
      if (minePersonDao.rewards.size() > 0) {
         for(ResourceModel resourceModel : minePersonDao.rewards) {
            ResourceModel.addResourceToList(list, resourceModel.clone());
         }
      }

      if (minePersonDao.fallNum > 0) {
         list.add(new ResourceModel(1, PlayerDefine.PLAYER_STONE_MATERIAL, minePersonDao.fallNum));
      }

      minePersonDao.rewards.clear();
      minePersonDao.fallNum = 0;
      minePersonDao.updateOp();

      for(CommonMsg.ItemInfo itemInfo : msg.getItemsList()) {
         ResourceModel.addResourceToList(list, new ResourceModel(itemInfo.getType(), itemInfo.getId(), itemInfo.getNum()));
      }

      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      int mineRewardCentreId = this.configManager.getIntDefault("mineRewardCentreId", 300);
      CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPool().getEntity("centreAward", mineRewardCentreId);
      mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), list, 604800000L, 55, 5503);
   }

   @MsgHandlerAnno
   public void CR2S_UpdatePerson_12324(CrossMineMsg.CR2S_UpdatePerson_12324 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MinePersonDao minePersonDao = this.getMinePersonDao();
      this.logger.info("{}获得了一个矿洞 {}, 原来的矿洞id:{}", new Object[]{this.player.getPlayerId(), msg.getVeinId(), minePersonDao.veinId});
      if (msg.getVeinId() > 0 && minePersonDao.veinId != msg.getVeinId()) {
         this.player.triggerTask(350, 0, 1L, 1);
         MineVeinModel mineVeinModel = (MineVeinModel)this.player.getGameModelPool().getEntity("mineVein", msg.getVeinId());
         if (mineVeinModel != null && msg.getHitMonster()) {
            int limitCount = this.configManager.getIntDefault("mineRecordLimit", 30);
            List<Integer> playerIds = this.mineMgr.getMineRecord(this.player.getServerId(), mineVeinModel.getType());
            if (playerIds.size() < limitCount && !playerIds.contains(this.player.getPlayerId())) {
               this.player.triggerTask(397, mineVeinModel.getType(), (long)(playerIds.size() + 1), -1);
               this.mineMgr.pushTaskEx("updateMineRecord", new Object[]{this.player.getServerId(), mineVeinModel.getType(), this.player.getPlayerId()});
            }
         }
      }

      minePersonDao.line = msg.getLine();
      minePersonDao.hillId = msg.getHillId();
      minePersonDao.veinId = msg.getVeinId();
      minePersonDao.startTime = msg.getStartTime();
      minePersonDao.having = msg.getHaving();
      minePersonDao.durationTime = 0;
      minePersonDao.updateOp();
      this.changeDefArraying(minePersonDao.defPos, false);
      List<Integer> eventIdList = msg.getEventIdList();
      this.sendMyEasyData(minePersonDao.line, minePersonDao.hillId, minePersonDao.veinId, true, 0, minePersonDao.revengeId, eventIdList, 0);
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      playerResetCustomCache.addForever(522, 1);
      MineModel mineModel = (MineModel)ApplicationContextProvider.getModelPoolEntity("mine", msg.getHillId());
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (mineModel != null && mineModel.getType() > playerExtend.higestMineType) {
         playerExtend.higestMineType = mineModel.getType();
         this.player.updatePlayerExtend(13);
      }

   }

   @MsgHandlerAnno
   public void C2S_MineNote_12231(MineMsg.C2S_MineNote_12231 msg, String source) {
      CrossMineMsg.S2CR_MineNote_12331.Builder builder = CrossMineMsg.S2CR_MineNote_12331.newBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_MyEasyData_12233(MineMsg.C2S_MyEasyData_12233 msg, String source) {
      MinePersonDao minePersonDao = this.getMinePersonDao();
      if (minePersonDao.having) {
         PlayerDao playerDao = this.player.getPlayerDao();
         CrossMineMsg.S2CR_HillEvent_12369.Builder builder = CrossMineMsg.S2CR_HillEvent_12369.newBuilder();
         builder.setLine(minePersonDao.line);
         builder.setHillId(minePersonDao.hillId);
         builder.setUnionId(playerDao.unionId);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      } else {
         List<Integer> eventList = new ArrayList();
         this.sendMyEasyData(minePersonDao.line, minePersonDao.hillId, minePersonDao.veinId, false, minePersonDao.fallNum, minePersonDao.revengeId, eventList, minePersonDao.durationTime);
      }

   }

   @MsgHandlerAnno
   public void C2S_EnergyInfo_12235(MineMsg.C2S_EnergyInfo_12235 msg, String source) {
      this.checkEnergyRecover();
      this.sendEnergyInfo();
   }

   @MsgHandlerAnno
   public void CR2S_LoseMineVein_12336(CrossMineMsg.CR2S_LoseMineVein_12336 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MinePersonDao minePersonDao = this.getMinePersonDao();
      if (msg.getSpecial()) {
         minePersonDao.line = 0;
         minePersonDao.hillId = 0;
         minePersonDao.veinId = 0;
         minePersonDao.revengeId = 0;
         minePersonDao.loseTime = 0;
         minePersonDao.having = false;
         minePersonDao.fallNum = 0;
         minePersonDao.durationTime = 0;
         minePersonDao.useEnergy = 0;
         minePersonDao.resumeTime = 0;
         minePersonDao.buyTime = 0;
         minePersonDao.startTime = 0;
         minePersonDao.rewards.clear();
         if (msg.getFallNum() > 0) {
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            int centreAwardId = this.configManager.getIntDefault("mineSpecialMailId", 309);
            CentreAwardModel centreAwardModel = (CentreAwardModel)this.player.getGameModelPool().getEntity("centreAward", centreAwardId);
            List<ResourceModel> resourceModelList = new ArrayList();
            resourceModelList.add(new ResourceModel(1, PlayerDefine.PLAYER_STONE_MATERIAL, msg.getFallNum()));
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModelList, 604800000L, 55, 5505);
         }
      } else {
         minePersonDao.revengeId = msg.getRevengeId();
         minePersonDao.loseTime = msg.getLoseTime();
         minePersonDao.having = false;
         minePersonDao.fallNum = msg.getFallNum();
         minePersonDao.durationTime = msg.getDurationTime();

         for(CommonMsg.ItemInfo itemInfo : msg.getRewardsList()) {
            ResourceModel.addResourceToList(minePersonDao.rewards, new ResourceModel(itemInfo.getType(), itemInfo.getId(), itemInfo.getNum()));
         }
      }

      minePersonDao.updateOp();
      List<Integer> eventList = new ArrayList();
      this.sendMyEasyData(minePersonDao.line, minePersonDao.hillId, minePersonDao.veinId, false, minePersonDao.fallNum, minePersonDao.revengeId, eventList, minePersonDao.durationTime);
   }

   @MsgHandlerAnno
   public void CR2S_UseEnergy_12338(CrossMineMsg.CR2S_UseEnergy_12338 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MinePersonDao minePersonDao = this.getMinePersonDao();
      if (!msg.getBFree()) {
         ++minePersonDao.useEnergy;
      }

      minePersonDao.updateOp();
      this.checkEnergyRecover();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      long attackCD = (long)this.configManager.getIntDefault("MineAttackCd", 300) * 1000L;
      playerResetCustomCache.setForever(521, System.currentTimeMillis() + attackCD);
      this.sendEnergyInfo();
      this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "矿场争夺", "1");
   }

   @MsgHandlerAnno
   public void CR2S_ClearRevenge_12340(CrossMineMsg.CR2S_ClearRevenge_12340 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MinePersonDao minePersonDao = this.getMinePersonDao();
      minePersonDao.revengeId = 0;
      minePersonDao.loseTime = 0;
      minePersonDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_MineRank_12241(MineMsg.C2S_MineRank_12241 msg, String source) {
      CrossMineMsg.S2CR_MineRank_12341.Builder builder = CrossMineMsg.S2CR_MineRank_12341.newBuilder();
      builder.setType(msg.getType());
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_DefArraying_12245(MineMsg.C2S_DefArraying_12245 msg, String source) {
      int heroPos = msg.getHeroPos();
      this.changeDefArraying(heroPos, true);
   }

   private void changeDefArraying(int heroPos, boolean notify) {
      boolean result = true;
      ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_MINE_DEF);
      if (arrayingMirror == null || arrayingMirror.arrayingElementsMap == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
         this.logger.info("矿场争夺 - 防守阵型不能为空");
         result = false;
      }

      if (arrayingMirror != null && arrayingMirror.arrayingElementsMap.containsKey((byte)heroPos)) {
         this.logger.info("矿场争夺 {} 雇佣武将站位和自己阵型站位重叠 pos:{}", this.player.getPlayerId(), heroPos);
         result = false;
      }

      if (heroPos < -1 || heroPos > 5) {
         this.logger.info("矿场争夺 - 站位设置错误 playerId:{}, heroPos:{}", this.player.getPlayerId(), heroPos);
         result = false;
      }

      MinePersonDao minePersonDao = this.getMinePersonDao();
      if (!minePersonDao.having) {
         this.logger.info("当前没有占有矿洞");
         result = false;
      }

      HeroMirror heroMirror = null;
      if (result && minePersonDao.friendCode > 0) {
         GamePlayer friendPlayer = this.worldMgr.getPlayerById(minePersonDao.friendCode);
         if (friendPlayer != null) {
            WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
            HeroSupportDao friendHeroSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.MINE, minePersonDao.friendCode);
            if (friendHeroSupportDao == null) {
               result = false;
            } else {
               heroMirror = friendHeroSupportDao.heroSupport;
            }
         }
      }

      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      if (heroMirror != null && heroPos != -1 && heroArrayingPart.isHaveSameHeroId(CommonMsg.HeroState.HERO_STATE_MINE_DEF, heroMirror.id)) {
         result = false;
      }

      if (!result) {
         if (notify) {
            this.notifyDefArraying(0, heroPos);
         }

      } else {
         minePersonDao.defPos = heroPos;
         minePersonDao.updateOp();
         if (notify) {
            this.notifyDefArraying(1, heroPos);
         }

         CrossMineMsg.S2CR_DefArraying_12345.Builder crossMsgBuilder = CrossMineMsg.S2CR_DefArraying_12345.newBuilder();
         crossMsgBuilder.setHeroArrayingData(ByteString.copyFrom(arrayingMirror.toByteArray()));
         if (heroMirror != null) {
            crossMsgBuilder.setHeroMirror(ByteString.copyFrom(heroMirror.toByteArray()));
            crossMsgBuilder.setHeroPos(heroPos);
         } else {
            crossMsgBuilder.setHeroPos(-1);
         }

         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), crossMsgBuilder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_ChangeLine_12249(MineMsg.C2S_ChangeLine_12249 msg, String source) {
      if (msg.getLine() > 0) {
         CrossMineMsg.S2CR_ChangeLine_12349.Builder builder = CrossMineMsg.S2CR_ChangeLine_12349.newBuilder();
         builder.setLine(msg.getLine());
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_RedDotState_12253(MineMsg.C2S_RedDotState_12253 msg, String source) {
      this.checkRedDotState();
   }

   @MsgHandlerAnno
   public void C2S_SpecialRedState_12261(MineMsg.C2S_SpecialRedState_12261 msg, String source) {
      CrossMineMsg.S2CR_SpecialRedState_12375.Builder builder = CrossMineMsg.S2CR_SpecialRedState_12375.newBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void CR2S_LogOperate_12366(CrossMineMsg.CR2S_LogOperate_12366 msg, String source) {
      this.player.getOperationMgr().addExtraLog(this.player, 190, this.player.getPlayerDao().lv + "", msg.getFight() + "", msg.getUnionName(), msg.getVeinId() + "", msg.getAtkType() + "", Boolean.toString(msg.getResult()));
   }

   @MsgHandlerAnno
   public void CR2S_DefArraying_12346(CrossMineMsg.CR2S_DefArraying_12346 msg, String source) {
   }

   public void notifyDefArraying(int result, int herPos) {
      MineMsg.S2C_DefArraying_12246.Builder builder = MineMsg.S2C_DefArraying_12246.newBuilder();
      builder.setResult(result);
      builder.setHeroPos(herPos);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void CR2S_HillEvent_12370(CrossMineMsg.CR2S_HillEvent_12370 msg, String source) {
      MinePersonDao minePersonDao = this.getMinePersonDao();
      if (minePersonDao.line == msg.getLine() && minePersonDao.hillId == msg.getHillId()) {
         this.sendMyEasyData(minePersonDao.line, minePersonDao.hillId, minePersonDao.veinId, true, 0, minePersonDao.revengeId, msg.getEventIdList(), msg.getDurationTime());
      }
   }

   public void resetDaily() {
      MinePersonDao minePersonDao = this.getMinePersonDao();
      minePersonDao.buyTime = 0;
      minePersonDao.friendCode = 0;
      minePersonDao.atkPos = -1;
      minePersonDao.defPos = -1;
      minePersonDao.updateOp();
      this.changeDefArraying(-1, false);
   }

   public void sendEnergyInfo() {
      MinePersonDao minePersonDao = this.getMinePersonDao();
      MineMsg.S2C_EnergyInfo_12236.Builder builder = MineMsg.S2C_EnergyInfo_12236.newBuilder();
      builder.setUseEnergy(minePersonDao.useEnergy);
      builder.setResumeTime(minePersonDao.resumeTime);
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      long lastAtkTime = (Long)playerResetCustomCache.getForeverNum(521, 0L);
      builder.setFightCollTime(DateUtil.getIntTime(lastAtkTime));
      this.player.sendMsg(builder.build());
   }

   public void sendMyEasyData(int line, int hillId, int veinId, boolean having, int fallNum, int revengeId, List<Integer> eventList, int durationTime) {
      MineMsg.S2C_MyEasyData_12234.Builder builder = MineMsg.S2C_MyEasyData_12234.newBuilder();
      builder.setMyLine(line);
      builder.setHillId(hillId);
      builder.setVeinId(veinId);
      builder.setHaving(having);
      builder.setFallNum(fallNum);
      builder.setRevengeId(revengeId);
      builder.addAllEventId(eventList);
      builder.setDurationTime(durationTime);
      this.player.sendMsg(builder.build());
   }

   public MinePersonDao getMinePersonDao() {
      return (MinePersonDao)this.mineMgr.getGameCachePool().getData("tb_mine_person", new Object[]{this.player.getPlayerId()});
   }

   private void checkRedDotState() {
      if (this.player.isSystemOpen(2001)) {
         CrossMineMsg.S2CR_RedDotState_12353.Builder builder = CrossMineMsg.S2CR_RedDotState_12353.newBuilder();
         WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
         HeroSupportDao heroSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.MINE, this.player.getPlayerId());
         if (heroSupportDao == null) {
            builder.addRedState(MineMsg.RedState.SUPPORT);
         }

         MinePersonDao minePersonDao = this.getMinePersonDao();
         if (!minePersonDao.having && minePersonDao.veinId > 0 && minePersonDao.fallNum > 0) {
            builder.addRedState(MineMsg.RedState.REWARD);
         }

         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         if (minePersonDao.hillId > 0) {
            MineModel mineModel = (MineModel)ApplicationContextProvider.getModelPoolEntity("mine", minePersonDao.hillId);
            if (mineModel != null && mineModel.getType() > playerExtend.higestMineType) {
               playerExtend.higestMineType = mineModel.getType();
               this.player.updatePlayerExtend(13);
            }
         }

         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   public void gmClearEnergy() {
      MinePersonDao minePersonDao = this.getMinePersonDao();
      minePersonDao.useEnergy = 0;
      minePersonDao.buyTime = 0;
      minePersonDao.updateOp();
      MineMsg.S2C_BuyEnergy_12214.Builder builder = MineMsg.S2C_BuyEnergy_12214.newBuilder();
      builder.setUseEnergy(minePersonDao.useEnergy);
      builder.setBuyTime(minePersonDao.buyTime);
      builder.setResumeTime(minePersonDao.resumeTime);
      this.player.sendMsg(builder.build());
   }

   public void gmSetEnergy(int energy) {
      int mineEnergyMax = this.configManager.getIntDefault("MineEnergyMax", 5);
      MinePersonDao minePersonDao = this.getMinePersonDao();
      minePersonDao.useEnergy = (byte)Math.max(0, mineEnergyMax - energy);
      minePersonDao.updateOp();
      MineMsg.S2C_BuyEnergy_12214.Builder builder = MineMsg.S2C_BuyEnergy_12214.newBuilder();
      builder.setUseEnergy(minePersonDao.useEnergy);
      builder.setBuyTime(minePersonDao.buyTime);
      builder.setResumeTime(minePersonDao.resumeTime);
      this.player.sendMsg(builder.build());
   }

   public void gmSetDefNum(int defNum) {
      CrossMineMsg.S2CR_SetDefNum_12371.Builder builder = CrossMineMsg.S2CR_SetDefNum_12371.newBuilder();
      builder.setDefNum(defNum);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public void gmClearCDTime() {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      playerResetCustomCache.setForever(521, 0L);
      this.sendEnergyInfo();
   }

   public void gmSetMineState(String[] strArr) {
      if (strArr.length != 2) {
         this.logger.info("矿场争夺 - 设置状态参数错误");
      } else {
         CrossMineMsg.S2CR_SetMineState_12361.Builder builder = CrossMineMsg.S2CR_SetMineState_12361.newBuilder();
         builder.setState(Integer.parseInt(strArr[1]));
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   public void gmAddLine(int offValue) {
      CrossMineMsg.S2CR_UpdateLine_12363.Builder builder = CrossMineMsg.S2CR_UpdateLine_12363.newBuilder();
      builder.setOffValue(offValue);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public void gmCheckVein(String[] strArr) {
      if (Debug.isDebug) {
         if (strArr.length != 3) {
            this.logger.info("矿场争夺 - 设置状态参数错误");
         } else {
            CrossMineMsg.S2CR_CheckEmptyVein_12367.Builder builder = CrossMineMsg.S2CR_CheckEmptyVein_12367.newBuilder();
            builder.setLine(Integer.parseInt(strArr[1]));
            builder.setHillId(Integer.parseInt(strArr[2]));
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         }
      }
   }

   public void gmSetHigestMineType(int higest) {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      playerExtend.higestMineType = higest;
      this.player.updatePlayerExtend(13);
   }

   public void gmMine(String params) {
      String[] strArr = params.split(",");
      switch (strArr[0].toLowerCase()) {
         case "getreward":
            MineMsg.C2S_GetMineRewards_12211.Builder getRewardBuilder = MineMsg.C2S_GetMineRewards_12211.newBuilder();
            this.C2S_GetMineRewards_12211(getRewardBuilder.build(), (String)null);
            break;
         case "buyenergy":
            MineMsg.C2S_BuyEnergy_12213.Builder buyEnergyBuilder = MineMsg.C2S_BuyEnergy_12213.newBuilder();
            this.C2S_BuyEnergy_12213(buyEnergyBuilder.build(), (String)null);
            break;
         case "clearenergy":
            this.gmClearEnergy();
            break;
         case "clearcd":
            this.gmClearCDTime();
            break;
         case "state":
            this.gmSetMineState(strArr);
            break;
         case "addline":
            this.gmAddLine(1);
            break;
         case "checkvein":
            this.gmCheckVein(strArr);
            break;
         case "setenergy":
            this.gmSetEnergy(Integer.parseInt(strArr[1]));
            break;
         case "setdefnum":
            this.gmSetDefNum(Integer.parseInt(strArr[1]));
            break;
         case "HigestMineType":
            this.gmSetHigestMineType(Integer.parseInt(strArr[1]));
            break;
         case "getmine":
            this.gmGetMine(Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]), Integer.parseInt(strArr[3]));
      }

   }

   private void gmGetMine(int force, int line, int hillId) {
      CrossMineMsg.S2CR_GetMineVein_12377.Builder builder = CrossMineMsg.S2CR_GetMineVein_12377.newBuilder();
      builder.setForce(force);
      builder.setLine(line);
      builder.setHillId(hillId);
      ArrayingMirror heroArrayingData = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_MINE_ATK);
      builder.setHeroArrayingData(ByteString.copyFrom(heroArrayingData.toByteArray()));
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public void guanJiaOperate(int systemId) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      HeroSupportDao heroSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.MINE, this.player.getPlayerId());
      if (heroSupportDao == null) {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getMaxPower();
         if (heroDao == null) {
            guanJiaPart.checkState(systemId, (List)null);
            return;
         }

         heroBagPart.heroBagFlushProperties(heroDao);
         heroSupportDao = new HeroSupportDao(this.player.getPlayerId(), HeroSupportDao.SupportModule.MINE, HeroMirror.fromHeroBean(heroDao));
         this.worldMgr.getGameCachePool().insertDao(heroSupportDao, false);
         int propertyId = Integer.parseInt(this.configManager.parseValue("MineSupportAward", 0, "\\|"));
         int num = Integer.parseInt(this.configManager.parseValue("MineSupportAward", 1, "\\|"));
         this.player.addResource(1, propertyId, num, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 55, 5502, 0, 0, "");
         MineMsg.S2C_SetSupportHero_12208.Builder builder = MineMsg.S2C_SetSupportHero_12208.newBuilder();
         builder.setIsDispatch(true);
         builder.setMySupportHero(heroSupportDao.heroSupport.toBuilder());
         builder.setFriendCode(0);
         MinePersonDao minePersonDao = this.getMinePersonDao();
         builder.setEmployNunOfWeek(minePersonDao.employNum);
         this.player.sendMsg(builder.build());
      }

      CrossMineMsg.S2CR_GuanJiaOperate_12379.Builder crossBuilder = CrossMineMsg.S2CR_GuanJiaOperate_12379.newBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), crossBuilder.build());
   }

   @MsgHandlerAnno
   public void CR2S_GuanJiaOperate_12380(CrossMineMsg.CR2S_GuanJiaOperate_12380 msg, CrossSubscribeMsg crossSubscribeMsg) {
      List<ResourceModel> list = new ArrayList();

      for(CommonMsg.ItemInfo itemInfo : msg.getRewardsList()) {
         list.add(new ResourceModel(itemInfo.getType(), itemInfo.getId(), itemInfo.getNum()));
      }

      MinePersonDao minePersonDao = this.getMinePersonDao();
      minePersonDao.rewards.clear();
      minePersonDao.fallNum = 0;
      minePersonDao.durationTime = 0;
      minePersonDao.updateOp();
      this.player.addResource(list, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 55, 5503, minePersonDao.hillId, minePersonDao.veinId, "管家 - 领取矿洞奖励");
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      guanJiaPart.checkState(2001, list);
   }

   @MsgHandlerAnno
   public void C2S_CollectErrer_12263(MineMsg.C2S_CollectErrer_12263 msg, String source) {
      this.collectError(1, String.valueOf(msg.getErrorCode()));
   }

   public void collectError(int fromType, String error) {
      (new Exception("矿场错误 fromType:" + fromType + " 收到错误信息 playerId:" + this.player.getPlayerId() + " errorCode:" + error)).printStackTrace();
   }

   @MsgHandlerAnno
   public void C2S_AtkFriendHeroPos_12265(MineMsg.C2S_AtkFriendHeroPos_12265 msg, String source) {
   }

   protected void notifyAtkArrayingResult(int result, int heroPos) {
      MineMsg.S2C_AtkFriendHeroPos_12266.Builder builder = MineMsg.S2C_AtkFriendHeroPos_12266.newBuilder();
      builder.setResult(result);
      builder.setHeroPos(heroPos);
      this.player.sendMsg(builder.build());
   }
}
