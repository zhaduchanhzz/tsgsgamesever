package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.google.protobuf.ByteString;
import com.gzbz.activity.bean.decisiveBattle.DecisiveArraying;
import com.gzbz.activity.bean.decisiveBattle.DecisiveBattleRecord;
import com.gzbz.activity.bean.decisiveBattle.DecisiveBattleResult;
import com.gzbz.activity.bean.decisiveBattle.DecisiveHeroInfo;
import com.gzbz.activity.bean.decisiveBattle.DecisiveMatchData;
import com.gzbz.activity.bean.decisiveBattle.DecisivePlayerData;
import com.gzbz.activity.bean.decisiveBattle.DecisiveRecordData;
import com.gzbz.activity.bean.decisiveBattle.DecisiveWarriorSinet;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.BattleDao;
import com.gzbz.db.DecisiveBattleDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.arraying.ArtifactArrayingEntity;
import com.gzbz.db.arraying.AssistantBeauty;
import com.gzbz.db.arraying.BeautyArrayingEntity;
import com.gzbz.db.arraying.DragonArrayingEntity;
import com.gzbz.db.arraying.FriendArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.OrnamentItem;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.model.ArtifactModel;
import com.gzbz.model.ArtifactRefineModel;
import com.gzbz.model.ArtifactSkillModel;
import com.gzbz.model.ArtifactStrongModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.DecisiveBattlRobotArrayModel;
import com.gzbz.model.DecisiveBattleBuffModel;
import com.gzbz.model.DecisiveBattleFirstRewardModel;
import com.gzbz.model.DecisiveBattleHeroModel;
import com.gzbz.model.DecisiveBattleIntegralModel;
import com.gzbz.model.DecisiveBattleMainModel;
import com.gzbz.model.DecisiveBattleRankRewardModel;
import com.gzbz.model.DecisiveBattleRewardModel;
import com.gzbz.model.DecisiveBattleTaskRewardModel;
import com.gzbz.model.DecisiveDefaultWarriorsModel;
import com.gzbz.model.DecisiveStampModel;
import com.gzbz.model.DecisiveWarriorsPropertyModel;
import com.gzbz.model.GeneralAvatarModel;
import com.gzbz.model.HeadFrameModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.MagicBookModel;
import com.gzbz.model.MagicSkillModel;
import com.gzbz.model.MonarchImageModel;
import com.gzbz.model.StampBasicPropertyModel;
import com.gzbz.model.StampModel;
import com.gzbz.model.StarWithMaxLvModel;
import com.gzbz.model.SupportHeroModel;
import com.gzbz.model.TalentLevelModel;
import com.gzbz.model.TongQueSkillModel;
import com.gzbz.model.WarriorSignetModel;
import com.gzbz.model.WarriorSignetSkillLibModel;
import com.gzbz.model.WarriorSignetSkillModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.WarriorsExtraModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.DecisiveBattleMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ActivityDecisiveBattleTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ScheduledFuture;
import misc.DateUtil;
import misc.MapUtil;
import misc.RandomUtil;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class DecisiveBattlePart extends AbstractActivityPart {
   private static Logger logger = LoggerFactory.getLogger(DecisiveBattlePart.class);
   public static final int ARRAYING_ARTIFACT = 1;
   public static final int ARRAYING_BEAUTY = 2;
   public static final int ARRAYING_FRIEND_NATION = 3;
   public static final int ARRAYING_FRIEND_JOB = 4;
   public static final int ARRAYING_FRIEND_STATE = 5;
   public static final int BATTLE_RECORD_ATTACK = 1;
   public static final int BATTLE_RECORD_DEFEND = 2;
   public static final int BATTLE_BUFF_EXTRA_TYPE = 1;
   public static final int BATTLE_BUFF_RAND_TYPE = 2;
   public static final int INITIAL_STEP = 1;
   private List<PropertyModel> property_artifact_refine = new ArrayList();
   private List<PropertyModel> property_artifact_refine_add = new ArrayList();
   private List<PropertyModel> property_artifact_strong = new ArrayList();
   private Map<CommonMsg.HeroState, Map<Integer, Map<Integer, List<PropertyModel>>>> friendProperty = new HashMap();
   private ScheduledFuture future;
   public static final int DEFAULT_RANK_LIMIT = 800;
   @Autowired
   ConfigManager configManager;
   @Autowired
   CrossNettyClient crossNettyClient;
   @Autowired
   BattleRecordMgr battleRecordMgr;
   @Autowired
   RankMgr rankMgr;
   @Autowired
   WorldMgr worldMgr;

   public void sendInfo() {
   }

   public int getActivityType() {
      return 84;
   }

   public DecisiveBattleDao getDecisiveDao() {
      DecisiveBattleDao decisiveBattleDao = (DecisiveBattleDao)this.player.getData("tb_decisive_battle", this.player.getPlayerId());
      if (decisiveBattleDao.myData.point == 0) {
         DecisiveBattleMainModel mainModel = this.getMainModel(1);
         decisiveBattleDao.myData.point = mainModel.getRankintegrallow();
         decisiveBattleDao.updateOp();
      }

      return decisiveBattleDao;
   }

   @MsgHandlerAnno
   public void C2S_DecisiveInfo_21801(DecisiveBattleMsg.C2S_DecisiveInfo_21801 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.player.uploadCrossPlayer();
         DecisiveBattleDao decisiveDao = this.getDecisiveDao();
         if (this.property_artifact_refine.isEmpty() || this.property_artifact_refine_add.isEmpty() || this.property_artifact_strong.isEmpty()) {
            this.initOtherProperty();
         }

         this.sycDataToCross(false);
         DecisiveBattleMsg.S2C_DecisiveInfo_21802.Builder builder = DecisiveBattleMsg.S2C_DecisiveInfo_21802.newBuilder();
         if (decisiveDao.myData.matchData != null) {
            int limitTime = this.configManager.getIntDefault("DecisiveBattleCountdown", 180);
            if (decisiveDao.myData.matchData.matchTime + limitTime < DateUtil.getIntTime(System.currentTimeMillis())) {
               decisiveDao.myData.matchData = null;
            } else {
               builder.setMatchData(this.buildPlayerInfo(decisiveDao.myData.matchData, 0));
            }
         }

         builder.setOpenDay(this.getActivityOpenDay());
         builder.setActivityDay(this.getSeverActivityDay());
         builder.setData(this.buildMyData(decisiveDao));
         decisiveDao.updateOp();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         if (!msg.hasFlag() || !msg.getFlag()) {
            this.updateLastData(true);
         }

      }
   }

   @MsgHandlerAnno
   public void S2S_NotifyTargetBuffNation_21871(DecisiveBattleMsg.S2S_NotifyTargetBuffNation_21871 msg, CrossSubscribeMsg crossSubscribeMsg) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      if (decisiveDao.targetBuffNationId != msg.getTargetBuffNationId()) {
         decisiveDao.targetBuffNationId = msg.getTargetBuffNationId();
         decisiveDao.updateOp();
      }

   }

   public DecisiveBattleMsg.MyData.Builder buildMyData(DecisiveBattleDao decisiveDao) {
      DecisiveBattleMsg.MyData.Builder myBuilder = DecisiveBattleMsg.MyData.newBuilder();
      myBuilder.setStep(decisiveDao.myData.step);
      myBuilder.setBuyFightTimes(decisiveDao.myData.buyFightTimes);
      myBuilder.setFightTimes(decisiveDao.myData.fightTimes);
      myBuilder.setPoint(decisiveDao.myData.point);
      myBuilder.addAllStepAward(decisiveDao.myData.receiveStepAward);
      myBuilder.setMaxStep(decisiveDao.myData.maxStep);
      myBuilder.setLastPoint(decisiveDao.myData.lastPoint);
      myBuilder.setLastStep(decisiveDao.myData.lastStep);
      return myBuilder;
   }

   public DecisiveBattleMsg.PlayerData.Builder buildPlayerInfo(DecisiveMatchData matchData, int changePoint) {
      DecisiveBattleMsg.PlayerData.Builder matchBuilder = DecisiveBattleMsg.PlayerData.newBuilder();
      if (matchData == null) {
         DecisiveBattleDao decisiveBattleDao = this.getDecisiveDao();
         matchBuilder.setStep(decisiveBattleDao.myData.step);
         matchBuilder.setPoint(decisiveBattleDao.myData.point);
         matchBuilder.setPlayerName(this.player.getPublicDao().playerName);
         matchBuilder.setHeadFrame(this.player.getPublicDao().headFrame);
         matchBuilder.setPlayerId(this.player.getPlayerId());
         matchBuilder.setHeadId(this.player.getPublicDao().head);
         matchBuilder.setLv(this.player.getPublicDao().lv);
         matchBuilder.setServerId(this.player.getServerId());
         matchBuilder.setChangePoint(changePoint);
         matchBuilder.setMonarchId(this.player.getPublicDao().monarchId);
         matchBuilder.setMaxStep(decisiveBattleDao.myData.maxStep);
      } else {
         matchBuilder.setMaxStep(matchData.maxStep);
         matchBuilder.setServerId(matchData.serverId);
         matchBuilder.setPlayerId(matchData.playerId);
         matchBuilder.setHeadId(matchData.headId);
         matchBuilder.setHeadFrame(matchData.headFrame);
         matchBuilder.setPlayerName(matchData.playerName);
         matchBuilder.setStep(matchData.step);
         matchBuilder.setPoint(matchData.point);
         matchBuilder.setAgainMatchNum(matchData.againMatchNum);
         matchBuilder.setMatchTime(matchData.matchTime);
         matchBuilder.setMonarchId(matchData.monarchId);
         matchBuilder.setLv(matchData.lv);

         for(Map.Entry<CommonMsg.HeroState, byte[]> entry : matchData.arrayingMap.entrySet()) {
            ArrayingMirror mirror = ArrayingMirror.toArrayingMirror((byte[])entry.getValue());
            mirror.arrayingType = ((CommonMsg.HeroState)entry.getKey()).getNumber();
            matchBuilder.addArraying(mirror.toPlayerArrayingInfo());
         }
      }

      matchBuilder.setChangePoint(changePoint);
      return matchBuilder;
   }

   @MsgHandlerAnno
   public void C2S_TopHeroInfo_21850(DecisiveBattleMsg.C2S_TopHeroInfo_21850 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_TopPlayerInfo_21852(DecisiveBattleMsg.C2S_TopPlayerInfo_21852 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_SaveArraying_21803(DecisiveBattleMsg.C2S_SaveArraying_21803 msg, String source) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      if (this.checkCanSaveArraying(msg, decisiveDao)) {
         DecisiveBattleMainModel mainModel = this.getMainModel(decisiveDao.myData.step);
         if (msg.getArrayingList().size() != mainModel.getSupportType()) {
            logger.error("保存阵容数量不对：{}---{}", msg.getArrayingList().size(), decisiveDao.myData.step);
         } else {
            for(DecisiveBattleMsg.ArrayingInfo arrayingInfo : msg.getArrayingList()) {
               if (arrayingInfo.getHeroList().size() == 1 && ((DecisiveBattleMsg.HeroPos)arrayingInfo.getHeroList().get(0)).getPos() == 5) {
                  return;
               }

               for(DecisiveBattleMsg.HeroPos hero : arrayingInfo.getHeroList()) {
                  DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(hero.getCode(), true);
                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroInfo.heroId);
                  if (heroModel == null) {
                     this.player.failure(0);
                     return;
                  }

                  if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_LINK) {
                     this.player.failure(76505);
                     return;
                  }

                  if (heroModel.getNation() == 10 && heroInfo.inheritNation <= 0) {
                     this.player.failure(76414);
                     return;
                  }
               }
            }

            for(DecisiveBattleMsg.ArrayingInfo arrayingInfo : msg.getArrayingList()) {
               DecisiveArraying arraying;
               if (decisiveDao.myData.arrayingMap.containsKey(arrayingInfo.getArrayingType())) {
                  arraying = (DecisiveArraying)decisiveDao.myData.arrayingMap.get(arrayingInfo.getArrayingType());
               } else {
                  arraying = new DecisiveArraying();
               }

               arraying.heroMap.clear();

               for(DecisiveBattleMsg.HeroPos hero : arrayingInfo.getHeroList()) {
                  arraying.heroMap.put(hero.getPos(), hero.getCode());
               }

               arraying.friendJob = arrayingInfo.getFriendJob();
               arraying.friendState = arrayingInfo.getFriendState();
               arraying.friendNation = arrayingInfo.getFriendNation();
               decisiveDao.myData.arrayingMap.put(arrayingInfo.getArrayingType(), arraying);
            }

            decisiveDao.updateOp();
            this.flushFriendHero();
            this.checkArrayingByStep();
            this.sendArraying();
            this.sycDataToCross(false);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroInherit_21867(DecisiveBattleMsg.C2S_HeroInherit_21867 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(msg.getCode(), true);
         HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroInfo.heroId);
         if (heroModel != null && heroModel.getNation() == 10) {
            if (heroInfo.inheritNation != msg.getNation()) {
               int oldNation = heroInfo.inheritNation;
               heroInfo.inheritNation = msg.getNation();
               this.getDecisiveDao().updateOp();
               this.notifyHeroInfo(msg.getCode(), DecisiveBattleMsg.NotifyReason.WARCRAFT_CUSTOM);
               this.sycDataToCross(false);
               DecisiveBattleMsg.S2C_HeroInherit_21868.Builder builder = DecisiveBattleMsg.S2C_HeroInherit_21868.newBuilder();
               builder.setCode(msg.getCode());
               builder.setNation(msg.getNation());
               builder.setOldNation(oldNation);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SelectSoulHero_21869(DecisiveBattleMsg.C2S_SelectSoulHero_21869 msg, String source) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      if (decisiveDao.myData.arrayingMap.containsKey(msg.getArrayingType())) {
         DecisiveArraying arraying = (DecisiveArraying)decisiveDao.myData.arrayingMap.get(msg.getArrayingType());
         if (arraying.heroMap.values().contains(msg.getHeroCode())) {
            DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(msg.getHeroCode(), true);
            int limitStar = this.configManager.getIntDefault("SoulHeroLimitStar", 9);
            int star = this.getStarMax(heroInfo.code, decisiveDao.myData.step);
            if (star >= limitStar) {
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroInfo.heroId);
               if (heroModel != null && heroModel.getNation() == 10) {
                  if (arraying.heroMap.containsKey((byte)5) && (Integer)arraying.heroMap.get((byte)5) == msg.getHeroCode() && arraying.friendState == 1) {
                     logger.error("所选择的魂武将在援军位切不出站：{}", msg.getHeroCode());
                  } else {
                     arraying.soulHeroCode = msg.getHeroCode();
                     decisiveDao.updateOp();
                     DecisiveBattleMsg.S2C_SelectSoulHero_21870.Builder builder = DecisiveBattleMsg.S2C_SelectSoulHero_21870.newBuilder();
                     builder.setArrayingType(msg.getArrayingType());
                     builder.setHeroCode(msg.getHeroCode());
                     this.player.sendMsg(builder.build());
                     this.flushFriendHero();
                     this.checkArrayingByStep();
                     this.sendArraying();
                     this.sycDataToCross(false);
                  }
               }
            }
         }
      }
   }

   public void sendArraying() {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      List<Integer> codeList = new ArrayList();
      DecisiveBattleMsg.S2C_SaveArraying_21804.Builder builder = DecisiveBattleMsg.S2C_SaveArraying_21804.newBuilder();

      for(Map.Entry<CommonMsg.HeroState, DecisiveArraying> entry : decisiveDao.myData.arrayingMap.entrySet()) {
         for(Integer code : ((DecisiveArraying)entry.getValue()).heroMap.values()) {
            codeList.add(code);
         }

         ArrayingMirror mirror = this.getArrayingMirror((DecisiveArraying)entry.getValue());
         mirror.arrayingType = ((CommonMsg.HeroState)entry.getKey()).getNumber();
         mirror.soulHeroCode = ((DecisiveArraying)entry.getValue()).soulHeroCode;
         builder.addArraying(mirror.toPlayerArrayingInfo());
      }

      this.player.sendMsg(builder.build());
      if (!codeList.isEmpty()) {
         this.notifyHeroInfo(codeList, DecisiveBattleMsg.NotifyReason.WARCRAFT_CUSTOM);
      }

   }

   public Boolean checkCanSaveArraying(DecisiveBattleMsg.C2S_SaveArraying_21803 msg, DecisiveBattleDao decisiveDao) {
      Set<Integer> heroSet = new HashSet();
      Map<Integer, DecisiveBattleHeroModel> heroModelMap = this.player.getGameModelPool().getMap("DecisiveBattleHero");

      for(DecisiveBattleMsg.ArrayingInfo arrayingInfo : msg.getArrayingList()) {
         Set<Integer> posSet = new HashSet();

         for(DecisiveBattleMsg.HeroPos hero : arrayingInfo.getHeroList()) {
            int code = hero.getCode();
            int pos = hero.getPos();
            DecisiveBattleHeroModel decisiveBattleHeroModel = (DecisiveBattleHeroModel)this.player.getGameModelPool().getEntity("DecisiveBattleHero", code);
            if (!heroModelMap.containsKey(code)) {
               return false;
            }

            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", decisiveBattleHeroModel.getHeroId());
            if (heroModel == null) {
               return false;
            }

            if (heroSet.contains(decisiveBattleHeroModel.getHeroId()) || posSet.contains(pos) || pos > 5 || pos < 0) {
               return false;
            }

            posSet.add(pos);
            heroSet.add(decisiveBattleHeroModel.getHeroId());
         }
      }

      return true;
   }

   @MsgHandlerAnno
   public void C2S_BuyFightTimes_21821(DecisiveBattleMsg.C2S_BuyFightTimes_21821 msg, String source) {
      if (msg.getBuyNum() > 0) {
         String limitMatchTime = this.configManager.getStrByDefault("DecisiveBattleOpenTime", "8|22");
         String[] matchTime = limitMatchTime.split("\\|");
         LocalDateTime nowDateTime = LocalDateTime.now();
         if (nowDateTime.getHour() >= Integer.parseInt(matchTime[0]) && nowDateTime.getHour() < Integer.parseInt(matchTime[1])) {
            DecisiveBattleDao decisiveDao = this.getDecisiveDao();
            int limitBuyNum = this.configManager.getIntDefault("DecisiveBattlebuy", 15);
            if (msg.getBuyNum() + decisiveDao.myData.buyFightTimes > limitBuyNum) {
               this.player.failure(76172);
            } else {
               String buyCost = this.configManager.getStrByDefault("DecisiveBattlespend", "1|9|20,1|9|20,1|9|30,1|9|30,1|9|40,1|9|40,1|9|50,1|9|50,1|9|60,1|9|60,1|9|70,1|9|70,1|9|80,1|9|80,1|9|90");
               String[] costStr = buyCost.split(",");
               List<ResourceModel> allCost = new ArrayList();

               for(int i = 0; i < costStr.length; ++i) {
                  if (i >= decisiveDao.myData.buyFightTimes && i < decisiveDao.myData.buyFightTimes + msg.getBuyNum()) {
                     String[] cost = costStr[i].split("\\|");
                     ResourceModel.addResourceToList(allCost, new ResourceModel(Integer.parseInt(cost[0]), Integer.parseInt(cost[1]), Integer.parseInt(cost[2])));
                  }
               }

               if (!this.player.checkResourceNum(allCost)) {
                  this.player.failure(76171);
               } else {
                  this.player.delResource((List)allCost, 127, 12702, 0, 0, "");
                  DecisivePlayerData var10000 = decisiveDao.myData;
                  var10000.buyFightTimes += msg.getBuyNum();
                  decisiveDao.updateOp();
                  DecisiveBattleMsg.S2C_BuyFightTimes_21822.Builder builder = DecisiveBattleMsg.S2C_BuyFightTimes_21822.newBuilder();
                  builder.setBuyFightTimes(decisiveDao.myData.buyFightTimes);
                  builder.setType(msg.getType());
                  this.player.sendMsg(builder.build());
               }
            }
         } else {
            this.player.failure(76176);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ReceiveStepAward_21811(DecisiveBattleMsg.C2S_ReceiveStepAward_21811 msg, String source) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      if (msg.getStep() <= decisiveDao.myData.maxStep) {
         if (decisiveDao.myData.receiveStepAward.contains(msg.getStep())) {
            this.player.failure(76173);
         } else if (this.getFirstRewardModel().containsKey(msg.getStep())) {
            DecisiveBattleFirstRewardModel rewardModel = (DecisiveBattleFirstRewardModel)this.getFirstRewardModel().get(msg.getStep());
            this.player.addResource(rewardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 127, 12703, 0, 0, "");
            decisiveDao.myData.receiveStepAward.add(msg.getStep());
            decisiveDao.updateOp();
            DecisiveBattleMsg.S2C_ReceiveStepAward_21812.Builder builder = DecisiveBattleMsg.S2C_ReceiveStepAward_21812.newBuilder();
            builder.addAllStepAward(decisiveDao.myData.receiveStepAward);
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroInfo_21813(DecisiveBattleMsg.C2S_HeroInfo_21813 msg, String source) {
      this.notifyHeroInfo(msg.getCodeList(), DecisiveBattleMsg.NotifyReason.HERO_INFO_REQ);
   }

   @MsgHandlerAnno
   public void C2S_MyArrayingInfo_21815(DecisiveBattleMsg.C2S_MyArrayingInfo_21815 msg, String source) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveBattleMsg.S2C_MyArrayingInfo_21816.Builder builder = DecisiveBattleMsg.S2C_MyArrayingInfo_21816.newBuilder();
      builder.setStep(decisiveDao.myData.step);
      int limitStar = this.configManager.getIntDefault("SoulHeroLimitStar", 9);

      for(Map.Entry<CommonMsg.HeroState, DecisiveArraying> entry : decisiveDao.myData.arrayingMap.entrySet()) {
         ArrayingMirror mirror = this.getArrayingMirror((DecisiveArraying)entry.getValue());
         mirror.arrayingType = ((CommonMsg.HeroState)entry.getKey()).getNumber();
         mirror.soulHeroCode = ((DecisiveArraying)entry.getValue()).soulHeroCode;
         if (((DecisiveArraying)entry.getValue()).soulHeroCode > 0) {
            DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(((DecisiveArraying)entry.getValue()).soulHeroCode, false);
            int star = this.getStarMax(heroInfo.code, decisiveDao.myData.step);
            if (star >= limitStar) {
               mirror.soulHeroId = heroInfo.heroId;
            }
         }

         builder.addArraying(mirror.toPlayerArrayingInfo());
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_SelectExtraArraying_21823(DecisiveBattleMsg.C2S_SelectExtraArraying_21823 msg, String source) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      int opValue = msg.getOpValue();
      if (opValue == 0) {
         if (!decisiveDao.myData.arrayingMap.containsKey(msg.getArrayingType())) {
            return;
         }

         if (msg.getOpType() == 1) {
            ((DecisiveArraying)decisiveDao.myData.arrayingMap.get(msg.getArrayingType())).artifactId = opValue;
         } else if (msg.getOpType() == 2) {
            ((DecisiveArraying)decisiveDao.myData.arrayingMap.get(msg.getArrayingType())).beautyId = opValue;
         } else if (msg.getOpType() == 3) {
            ((DecisiveArraying)decisiveDao.myData.arrayingMap.get(msg.getArrayingType())).friendNation = opValue;
         } else if (msg.getOpType() == 4) {
            ((DecisiveArraying)decisiveDao.myData.arrayingMap.get(msg.getArrayingType())).friendJob = opValue;
         } else {
            if (msg.getOpType() != 5) {
               return;
            }

            ((DecisiveArraying)decisiveDao.myData.arrayingMap.get(msg.getArrayingType())).friendState = opValue;
         }
      } else {
         if (msg.getOpType() == 1) {
            ArtifactModel artifactModel = (ArtifactModel)this.player.getGameModelPool().getEntity("artifact", opValue);
            if (artifactModel == null) {
               return;
            }
         } else if (msg.getOpType() == 2) {
            DecisiveBattleMainModel mainModel = this.getMainModel(decisiveDao.myData.maxStep);
            if (!mainModel.getTongQueId().contains(msg.getOpValue())) {
               return;
            }

            if (decisiveDao.myData.cooperateBeauty.contains(msg.getOpValue()) && (Integer)decisiveDao.myData.cooperateBeauty.get(0) != msg.getOpValue()) {
               logger.error("该美人已在同心策中：{}", msg.getOpValue());
               return;
            }
         } else if (msg.getOpType() == 4) {
            if (opValue < 1 || opValue > 5) {
               return;
            }
         } else if (msg.getOpType() == 3 && (opValue > 5 || opValue < 0)) {
            return;
         }

         for(Map.Entry<CommonMsg.HeroState, DecisiveArraying> entry : decisiveDao.myData.arrayingMap.entrySet()) {
            if (entry.getKey() != msg.getArrayingType() && msg.getOpType() == 1 && ((DecisiveArraying)entry.getValue()).artifactId == opValue) {
               logger.error("该神兵已在其他阵容上");
               return;
            }
         }

         DecisiveArraying arraying;
         if (decisiveDao.myData.arrayingMap.containsKey(msg.getArrayingType())) {
            arraying = (DecisiveArraying)decisiveDao.myData.arrayingMap.get(msg.getArrayingType());
         } else {
            arraying = new DecisiveArraying();
            decisiveDao.myData.arrayingMap.put(msg.getArrayingType(), arraying);
         }

         if (msg.getOpType() == 1) {
            arraying.artifactId = opValue;
         } else if (msg.getOpType() == 2) {
            arraying.beautyId = opValue;
         } else if (msg.getOpType() == 3) {
            arraying.friendNation = opValue;
         } else if (msg.getOpType() == 4) {
            arraying.friendJob = opValue;
         } else {
            if (msg.getOpType() != 5) {
               return;
            }

            arraying.friendState = opValue;
         }
      }

      decisiveDao.updateOp();
      DecisiveBattleMsg.S2C_SelectExtraArraying_21824.Builder builder = DecisiveBattleMsg.S2C_SelectExtraArraying_21824.newBuilder();
      builder.setArrayingType(msg.getArrayingType());
      builder.setOpType(msg.getOpType());
      builder.setOpValue(msg.getOpValue());
      this.player.sendMsg(builder.build());
      if (msg.getOpType() == 4 || msg.getOpType() == 3) {
         this.initOtherProperty();
         List<Integer> codeList = new ArrayList();
         if (decisiveDao.myData.arrayingMap.containsKey(msg.getArrayingType())) {
            for(Integer code : ((DecisiveArraying)decisiveDao.myData.arrayingMap.get(msg.getArrayingType())).heroMap.values()) {
               codeList.add(code);
            }
         }

         if (!codeList.isEmpty()) {
            this.notifyHeroInfo(codeList, DecisiveBattleMsg.NotifyReason.WARCRAFT_CUSTOM);
         }
      }

      this.sycDataToCross(false);
   }

   public DecisiveBattleMainModel getMainModel(int step) {
      DecisiveBattleMainModel mainModel = (DecisiveBattleMainModel)this.player.getGameModelPool().getEntity("DecisiveBattleMain", step);
      if (mainModel == null) {
         logger.error("获取DecisiveBattleMainModel错误：{}", step);
         return (DecisiveBattleMainModel)this.player.getGameModelPool().getEntity("DecisiveBattleMain", 1);
      } else {
         return mainModel;
      }
   }

   @MsgHandlerAnno
   public void C2S_SaveMagicBook_21825(DecisiveBattleMsg.C2S_SaveMagicBook_21825 msg, String source) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveBattleMainModel mainModel = this.getMainModel(decisiveDao.myData.maxStep);
      MagicBookModel magicBookModel = (MagicBookModel)this.player.getGameModelPool().getEntity("MysticBook", mainModel.getMysticBookId());
      if (magicBookModel != null) {
         if (msg.getMagicsList().size() <= magicBookModel.getStage()) {
            List<Integer> tempList = new ArrayList();
            List<Integer> posList = new ArrayList();

            for(CommonMsg.MagicInfo magicInfo : msg.getMagicsList()) {
               if (magicInfo.getPosition() < 1) {
                  return;
               }

               MagicSkillModel skillModel = (MagicSkillModel)this.player.getGameModelPool().getEntity("MysticSkill", magicInfo.getSkillId());
               if (skillModel == null) {
                  return;
               }

               if (!mainModel.getMysticBookClass().contains(magicInfo.getSkillId())) {
                  logger.error("当前段位未解锁该技能：{}", magicInfo.getSkillId());
                  return;
               }

               if (posList.contains(magicInfo.getPosition())) {
                  return;
               }

               if (tempList.contains(magicInfo.getSkillId())) {
                  return;
               }

               posList.add(magicInfo.getPosition());
               tempList.add(magicInfo.getSkillId());
            }

            decisiveDao.myData.magicBook.clear();

            for(CommonMsg.MagicInfo info : msg.getMagicsList()) {
               decisiveDao.myData.magicBook.put(info.getPosition(), info.getSkillId());
            }

            decisiveDao.updateOp();
            this.sendMagicBookInfo();
            this.sycDataToCross(false);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_MagicBookInfo_21809(DecisiveBattleMsg.C2S_MagicBookInfo_21809 msg, String source) {
      this.sendMagicBookInfo();
   }

   public void sendMagicBookInfo() {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveBattleMsg.S2C_MagicBookInfo_21810.Builder builder = DecisiveBattleMsg.S2C_MagicBookInfo_21810.newBuilder();

      for(Map.Entry<Integer, Integer> entry : decisiveDao.myData.magicBook.entrySet()) {
         CommonMsg.MagicInfo.Builder info = CommonMsg.MagicInfo.newBuilder();
         info.setPosition((Integer)entry.getKey());
         info.setSkillId((Integer)entry.getValue());
         builder.addMagics(info);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_WearWarriorSignet_21827(DecisiveBattleMsg.C2S_WearWarriorSignet_21827 msg, String source) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveBattleHeroModel decisiveBattleHeroModel = (DecisiveBattleHeroModel)this.player.getGameModelPool().getEntity("DecisiveBattleHero", msg.getCode());
      if (decisiveBattleHeroModel != null) {
         HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", decisiveBattleHeroModel.getHeroId());
         if (heroModel != null) {
            DecisiveBattleMainModel mainModel = this.getMainModel(decisiveDao.myData.step);
            if (mainModel.getHeroStarLimit() >= this.configManager.getInt("soulSlotUnlock2") || msg.getWarriorInfo().getPosition().getNumber() != 6) {
               int warriorId = msg.getWarriorInfo().getId();
               if (mainModel.getWarriorSignetLimit() != warriorId) {
                  logger.error("所定制的将印id错误：{}", warriorId);
               } else {
                  DecisiveWarriorsPropertyModel warriorsPropertyModel = (DecisiveWarriorsPropertyModel)this.player.getGameModelPool().getEntity("DecisiveWarriorsProperty", warriorId);
                  if (warriorsPropertyModel != null) {
                     String[] commonProList = warriorsPropertyModel.getProperties().split(",");
                     List<PropertyModel> tempList = new ArrayList();
                     int numFlag = 0;

                     for(CommonMsg.PropertyInfo proInfo : msg.getWarriorInfo().getPropertyList()) {
                        for(int i = 0; i < tempList.size(); ++i) {
                           if (proInfo.getId() == ((PropertyModel)tempList.get(i)).getType() && proInfo.getWay() == ((PropertyModel)tempList.get(i)).getWay()) {
                              logger.error("定制的将印有相同属性：{}--{}--{}", new Object[]{proInfo.getId(), proInfo.getWay(), (long)proInfo.getValue()});
                              return;
                           }
                        }

                        ++numFlag;
                        if (numFlag == 1) {
                           Boolean flag = false;

                           for(int i = 0; i < commonProList.length; ++i) {
                              String[] commonPro = commonProList[i].split("\\|");
                              if (proInfo.getId() == Integer.parseInt(commonPro[0]) && proInfo.getWay() == Integer.parseInt(commonPro[1]) && (long)proInfo.getValue() == Long.parseLong(commonPro[2])) {
                                 flag = true;
                                 break;
                              }
                           }

                           if (!flag) {
                              logger.error("定制的属性错误：{}--{}--{}", new Object[]{proInfo.getId(), proInfo.getWay(), (long)proInfo.getValue()});
                              return;
                           }

                           tempList.add(new PropertyModel(proInfo.getId(), proInfo.getWay(), (long)proInfo.getValue()));
                        } else if (numFlag == 2 && warriorsPropertyModel.getPercentProperties() != null && !warriorsPropertyModel.getPercentProperties().isEmpty()) {
                           int flag = 0;
                           String[] persentProList = warriorsPropertyModel.getPercentProperties().split(",");

                           for(int i = 0; i < persentProList.length; ++i) {
                              PropertyModel pro = this.getProModelByString(persentProList[i]);
                              if (proInfo.getId() == pro.getType() && proInfo.getWay() == pro.getWay() && (long)proInfo.getValue() == pro.getValue()) {
                                 ++flag;
                              }
                           }

                           if (flag != 1) {
                              logger.error("将印定制百分比属性有问题：{}--{}--{}", new Object[]{proInfo.getId(), proInfo.getWay(), proInfo.getValue()});
                              return;
                           }
                        }
                     }

                     if (msg.getWarriorInfo().getSkillsList().size() == 2) {
                        WarriorSignetModel signetModel = (WarriorSignetModel)this.player.getGameModelPool().getEntity("warriorSignet", msg.getWarriorInfo().getId());
                        Map<Integer, WarriorSignetSkillLibModel> modelMap = this.player.getGameModelPool().getMap("warriorSignetSkillLib");
                        if (signetModel != null) {
                           List<Integer> skillList1 = new ArrayList();
                           List<Integer> skillList2 = new ArrayList();

                           for(WarriorSignetSkillLibModel libModel : modelMap.values()) {
                              if (signetModel.getSkill2_1() == libModel.getGroupId()) {
                                 skillList1.add(libModel.getSkillId());
                              } else if (signetModel.getSkill2_2() == libModel.getGroupId()) {
                                 skillList2.add(libModel.getSkillId());
                              }
                           }

                           if (skillList1.contains(msg.getWarriorInfo().getSkillsList().get(0)) && skillList2.contains(msg.getWarriorInfo().getSkillsList().get(1))) {
                              DecisiveWarriorSinet signet = new DecisiveWarriorSinet();
                              signet.id = msg.getWarriorInfo().getId();

                              for(CommonMsg.PropertyInfo info : msg.getWarriorInfo().getPropertyList()) {
                                 signet.properties.add(new PropertyModel(info.getId(), info.getWay(), (long)info.getValue()));
                              }

                              signet.skills.addAll(msg.getWarriorInfo().getSkillsList());
                              signet.score = this.getWarriorScore(signet, mainModel);
                              DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(msg.getCode(), true);
                              heroInfo.warriorSignetMap.put(msg.getWarriorInfo().getPosition(), signet);
                              decisiveDao.updateOp();
                              DecisiveBattleMsg.S2C_WearWarriorSignet_21828.Builder builder = DecisiveBattleMsg.S2C_WearWarriorSignet_21828.newBuilder();
                              builder.setCode(msg.getCode());
                              this.player.sendMsg(builder.build());
                              List<Integer> flushList = new ArrayList();
                              flushList.add(msg.getCode());
                              this.notifyHeroInfo(flushList, DecisiveBattleMsg.NotifyReason.WARRIOR_SIGNET_CUSTOM);
                           } else {
                              logger.error("将印定制技能有问题：{}---{}", msg.getWarriorInfo().getSkillsList().get(0), msg.getWarriorInfo().getSkillsList().get(1));
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void checkDefaultWarrior(DecisiveHeroInfo heroInfo, int step) {
      int limitWarriorNum = 1;
      DecisiveBattleMainModel mainModel = this.getMainModel(step);
      if (mainModel.getHeroStarLimit() >= this.configManager.getInt("soulSlotUnlock2")) {
         limitWarriorNum = 2;
      }

      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroInfo.heroId);
      if (heroModel != null) {
         DecisiveDefaultWarriorsModel model = this.getDefaultWarriorModel(step, heroModel.getType());
         if (model != null) {
            if (heroInfo.warriorSignetMap.get(CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_1) == null) {
               heroInfo.warriorSignetMap.remove(CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_1);
            }

            if (heroInfo.warriorSignetMap.get(CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_2) == null) {
               heroInfo.warriorSignetMap.remove(CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_2);
            }

            if (limitWarriorNum == 1) {
               this.calcWarrior(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_1, model, mainModel);
               if (heroInfo.warriorSignetMap.containsKey(CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_2)) {
                  heroInfo.warriorSignetMap.remove(CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_2);
               }
            } else {
               this.calcWarrior(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_1, model, mainModel);
               this.calcWarrior(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_2, model, mainModel);
            }

         }
      }
   }

   public void calcWarrior(DecisiveHeroInfo heroInfo, CommonMsg.WearPosition pos, DecisiveDefaultWarriorsModel model, DecisiveBattleMainModel mainModel) {
      if (!heroInfo.warriorSignetMap.containsKey(pos)) {
         this.addOneWarrior(pos, model, heroInfo, mainModel);
      } else if (heroInfo.warriorSignetMap.get(pos) == null) {
         heroInfo.warriorSignetMap.remove(pos);
         this.addOneWarrior(pos, model, heroInfo, mainModel);
      } else {
         this.calcWarriorByStep(mainModel, (DecisiveWarriorSinet)heroInfo.warriorSignetMap.get(pos));
      }

   }

   public void calcWarriorByStep(DecisiveBattleMainModel mainModel, DecisiveWarriorSinet signet) {
      if (signet.id != mainModel.getWarriorSignetLimit()) {
         DecisiveWarriorsPropertyModel propertyModel = (DecisiveWarriorsPropertyModel)this.player.getGameModelPool().getEntity("DecisiveWarriorsProperty", mainModel.getWarriorSignetLimit());
         if (propertyModel == null) {
            return;
         }

         String[] commonProList = propertyModel.getProperties().split(",");
         List<PropertyModel> tempList = new ArrayList();

         for(PropertyModel property : signet.properties) {
            for(int i = 0; i < commonProList.length; ++i) {
               PropertyModel pro = this.getProModelByString(commonProList[i]);
               if (property.getWay() == pro.getWay() && property.getType() == pro.getType()) {
                  tempList.add(pro);
                  break;
               }
            }
         }

         if (propertyModel.getPercentProperties() != null && !propertyModel.getPercentProperties().isEmpty()) {
            String[] persentProList = propertyModel.getPercentProperties().split(",");
            PropertyModel pro = this.getProModelByString(persentProList[RandomUtil.randInt(0, persentProList.length)]);
            tempList.add(new PropertyModel(pro.getType(), pro.getWay(), pro.getValue()));
         }

         signet.properties.clear();
         signet.properties.addAll(tempList);
         List<Integer> tempSkill = new ArrayList();

         for(Integer skill : signet.skills) {
            WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", skill);
            if (skillModel != null) {
               if (signet.id > mainModel.getWarriorSignetLimit()) {
                  if (skillModel.getLastId() > 0) {
                     tempSkill.add(skillModel.getLastId());
                  } else {
                     logger.error("将印技能变换有问题：{}--{}----{}", new Object[]{signet.id, mainModel.getWarriorSignetLimit(), skillModel.getId()});
                     tempSkill.add(skill);
                  }
               } else if (skillModel.getNextId() > 0) {
                  tempSkill.add(skillModel.getNextId());
               } else {
                  logger.error("将印技能变换有问题：{}--{}----{}", new Object[]{signet.id, mainModel.getWarriorSignetLimit(), skillModel.getId()});
                  tempSkill.add(skill);
               }
            }
         }

         signet.skills.clear();
         signet.skills.addAll(tempSkill);
         signet.id = mainModel.getWarriorSignetLimit();
         int score = this.getWarriorScore(signet, mainModel);
         signet.score = score;
      }

   }

   public void addOneWarrior(CommonMsg.WearPosition pos, DecisiveDefaultWarriorsModel model, DecisiveHeroInfo heroInfo, DecisiveBattleMainModel mainModel) {
      DecisiveWarriorSinet signet = this.getOneWarriorSignet(model, pos);
      if (signet != null) {
         int score = this.getWarriorScore(signet, mainModel);
         signet.score = score;
         heroInfo.warriorSignetMap.put(pos, signet);
      }
   }

   public DecisiveWarriorSinet getOneWarriorSignet(DecisiveDefaultWarriorsModel warriorsModel, CommonMsg.WearPosition wearPosition) {
      DecisiveWarriorSinet signet = new DecisiveWarriorSinet();
      if (warriorsModel.getWarriors().size() != 2) {
         logger.error("对决之巅将印配置有问题:{}", warriorsModel.getClass().getSimpleName());
         return null;
      } else {
         WarriorsExtraModel model;
         if (wearPosition == CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_1) {
            model = (WarriorsExtraModel)warriorsModel.getWarriors().get(0);
         } else {
            model = (WarriorsExtraModel)warriorsModel.getWarriors().get(1);
         }

         signet.id = model.getId();
         this.addWarriorOnePro(signet, model, false);
         this.addWarriorOnePro(signet, model, true);
         String[] skill = model.getSkills().split("\\|");

         for(int i = 0; i < skill.length; ++i) {
            signet.skills.add(Integer.parseInt(skill[i]));
         }

         return signet;
      }
   }

   public void addWarriorOnePro(DecisiveWarriorSinet signet, WarriorsExtraModel model, Boolean isPercent) {
      if (isPercent) {
         if (model.getPercentproperties() != null) {
            signet.properties.add(this.getProModelByString(model.getPercentproperties()));
         }
      } else {
         signet.properties.add(this.getProModelByString(model.getProperties()));
      }

   }

   public PropertyModel getProModelByString(String proStr) {
      String[] pro = proStr.split("\\|");
      PropertyModel model = new PropertyModel(Integer.parseInt(pro[0]), Integer.parseInt(pro[1]), (long)Integer.parseInt(pro[2]));
      return model;
   }

   public int getWarriorScore(DecisiveWarriorSinet signet, DecisiveBattleMainModel mainModel) {
      int score = 0;
      DecisiveWarriorsPropertyModel model = (DecisiveWarriorsPropertyModel)this.player.getGameModelPool().getEntity("DecisiveWarriorsProperty", signet.id);
      if (model == null) {
         logger.error("获取将印评分有问题：{}", signet);
         return 0;
      } else {
         score += this.getWarriorProScore(model, signet.properties);

         for(Integer skillId : signet.skills) {
            WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", skillId);
            if (skillModel != null) {
               score += skillModel.getPower();
            }
         }

         return score;
      }
   }

   public int getWarriorProScore(DecisiveWarriorsPropertyModel model, List<PropertyModel> signetProList) {
      int score = 0;
      String[] commonList = model.getProperties().split(",");
      int flag = 0;

      for(PropertyModel pro : signetProList) {
         ++flag;
         if (flag == 1) {
            for(int i = 0; i < commonList.length; ++i) {
               String[] realPro = commonList[i].split("\\|");
               if (pro.getType() == Integer.parseInt(realPro[0]) && pro.getWay() == Integer.parseInt(realPro[1]) && pro.getValue() == (long)Integer.parseInt(realPro[2]) && model.getPropertiesScore().size() > i) {
                  score += (Integer)model.getPropertiesScore().get(i);
                  break;
               }
            }
         } else if (flag == 2 && model.getPercentProperties() != null && model.getPercentPropertiesScore() != null) {
            String[] percentList = model.getPercentProperties().split(",");

            for(int i = 0; i < percentList.length; ++i) {
               String[] realPro = percentList[i].split("\\|");
               if (pro.getType() == Integer.parseInt(realPro[0]) && pro.getWay() == Integer.parseInt(realPro[1]) && pro.getValue() == (long)Integer.parseInt(realPro[2]) && model.getPercentPropertiesScore().size() > i) {
                  score += (Integer)model.getPercentPropertiesScore().get(i);
                  break;
               }
            }
         }
      }

      return score;
   }

   public DecisiveDefaultWarriorsModel getDefaultWarriorModel(int step, int type) {
      Map<Integer, DecisiveDefaultWarriorsModel> modelMap = this.player.getGameModelPool().getMap("DecisiveDefaultWarriors");

      for(DecisiveDefaultWarriorsModel model : modelMap.values()) {
         if (model.getRankId() == step && model.getType() == type) {
            return model;
         }
      }

      return null;
   }

   @MsgHandlerAnno
   public void C2S_SelectTalentSkill_21854(DecisiveBattleMsg.C2S_SelectTalentSkill_21854 msg, String source) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(msg.getHeroCode(), false);
      TalentLevelModel talentLevelModel = (TalentLevelModel)this.player.getGameModelPool().getEntity("talentLevel", msg.getPosition().getNumber());
      if (talentLevelModel == null) {
         logger.info("武将天赋配置表为空，id={}", msg.getPosition());
      } else {
         int limitStar = this.getStarMax(heroInfo.code, decisiveDao.myData.step);
         if (limitStar < talentLevelModel.getStar()) {
            logger.info("替换天赋星级不足：{}--{}", limitStar, msg.getPosition());
         } else if (msg.getIndex() >= 0 && msg.getIndex() <= 2) {
            heroInfo.talent.put(msg.getPosition().getNumber(), msg.getIndex());
            decisiveDao.updateOp();
            this.notifyHeroInfo(msg.getHeroCode(), DecisiveBattleMsg.NotifyReason.WARCRAFT_CUSTOM);
            DecisiveBattleMsg.S2C_SelectTalentSkill_21855.Builder builder = DecisiveBattleMsg.S2C_SelectTalentSkill_21855.newBuilder();
            builder.setHeroCode(msg.getHeroCode());
            builder.setIndex(msg.getIndex());
            builder.setPosition(msg.getPosition());
            this.player.sendMsg(builder.build());
            this.sycDataToCross(false);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OrnamentExchange_21856(DecisiveBattleMsg.C2S_OrnamentExchange_21856 msg, String source) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(msg.getHeroCode(), false);
      StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", msg.getExchangeId());
      if (stampModel != null) {
         DecisiveBattleMainModel mainModel = this.getMainModel(decisiveDao.myData.maxStep);
         if (stampModel.getStar() <= mainModel.getStampStar() && stampModel.getQuality() == mainModel.getStampQuality()) {
            StampBasicPropertyModel basicPropertyModel = (StampBasicPropertyModel)this.player.getGameModelPool().getEntity("StampBasicProperty", stampModel.getBasicPropertyType());
            if (basicPropertyModel.getStampType() != 1 || msg.getPosition() == CommonMsg.WearPosition.WEARPOSITION_ORANMENT_1) {
               if (basicPropertyModel.getStampType() != 2 || msg.getPosition() == CommonMsg.WearPosition.WEARPOSITION_ORANMENT_2) {
                  if (basicPropertyModel.getStampType() != 3 || msg.getPosition() == CommonMsg.WearPosition.WEARPOSITION_ORANMENT_3) {
                     if (basicPropertyModel.getStampType() != 4 || msg.getPosition() == CommonMsg.WearPosition.WEARPOSITION_ORANMENT_4) {
                        OrnamentItem ornamentItem = this.createOrnamentById(stampModel.getId());
                        heroInfo.ornament.put(msg.getPosition().getNumber(), ornamentItem);
                        decisiveDao.updateOp();
                        this.notifyHeroInfo(msg.getHeroCode(), DecisiveBattleMsg.NotifyReason.WARCRAFT_CUSTOM);
                        DecisiveBattleMsg.S2C_OrnamentExchange_21857.Builder builder = DecisiveBattleMsg.S2C_OrnamentExchange_21857.newBuilder();
                        builder.setExchangeId(msg.getExchangeId());
                        builder.setHeroCode(msg.getHeroCode());
                        builder.setPosition(msg.getPosition());
                        int star = this.getStarMax(msg.getHeroCode(), this.getDecisiveDao().myData.step);
                        HeroDao heroDao = heroInfo.getHeroDao(msg.getHeroCode(), this.getHeroLv(star), star, this.player.getPlayerId());
                        if (!heroDao.getOrnametProperty().isEmpty()) {
                           for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
                              if (heroDao.getOrnametProperty().get(i) != null) {
                                 builder.addProAll(((Long)heroDao.getOrnametProperty().get(i)).intValue());
                              } else {
                                 builder.addProAll(0);
                              }
                           }
                        }

                        this.player.sendMsg(builder.build());
                        this.sycDataToCross(false);
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WearWarcraft_21829(DecisiveBattleMsg.C2S_WearWarcraft_21829 msg, String source) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveBattleMainModel mainModel = this.getMainModel(decisiveDao.myData.step);
      int heroStar = this.getStarMax(msg.getCode(), decisiveDao.myData.step);
      int limitStar = 0;
      if (msg.getWarcraft().getPosition() == CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_1) {
         limitStar = this.configManager.getInt("tacticsSlotUnlock1");
      } else if (msg.getWarcraft().getPosition() == CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_2) {
         limitStar = this.configManager.getInt("tacticsSlotUnlock2");
      } else if (msg.getWarcraft().getPosition() == CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_3) {
         limitStar = this.configManager.getIntDefault("tacticsSlotUnlock3", 13);
      } else {
         if (msg.getWarcraft().getPosition() != CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_4) {
            logger.error("定制兵法位置错误：{}", msg.getWarcraft().getPosition());
            return;
         }

         limitStar = this.configManager.getIntDefault("tacticsSlotUnlock4", 14);
      }

      if (heroStar < limitStar) {
         logger.error("该武将未解锁兵书空位：{}---{}---{}", new Object[]{msg.getCode(), msg.getWarcraft().getPosition(), heroStar});
      } else {
         Map<Integer, WarriorSignetSkillModel> modelMap = this.player.getGameModelPool().getMap("warriorSignetSkill");
         List<Integer> tempList = new ArrayList();

         for(WarriorSignetSkillModel skillModel : modelMap.values()) {
            if (skillModel.getLv() == mainModel.getWarcraftLimit()) {
               tempList.add(skillModel.getId());
            }
         }

         if (!tempList.isEmpty() && tempList.contains(msg.getWarcraft().getId())) {
            DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(msg.getCode(), true);

            for(Map.Entry<CommonMsg.WearPosition, Integer> entry : heroInfo.warcraftMap.entrySet()) {
               if (this.isSameBaseSkill((Integer)entry.getValue(), msg.getWarcraft().getId())) {
                  logger.error("已有相同技能兵法：{}---{}", entry.getKey(), entry.getValue());
                  return;
               }
            }

            heroInfo.warcraftMap.put(msg.getWarcraft().getPosition(), msg.getWarcraft().getId());
            decisiveDao.updateOp();
            DecisiveBattleMsg.S2C_WearWarcraft_21830.Builder builder = DecisiveBattleMsg.S2C_WearWarcraft_21830.newBuilder();
            builder.setCode(msg.getCode());
            this.player.sendMsg(builder.build());
            List<Integer> flushList = new ArrayList();
            flushList.add(msg.getCode());
            this.notifyHeroInfo(flushList, DecisiveBattleMsg.NotifyReason.WARRIOR_SIGNET_CUSTOM);
            this.sycDataToCross(false);
         } else {
            logger.error("兵法定制技能错误：{}--{}", msg.getWarcraft().getPosition());
         }
      }
   }

   public void checkDefaultWarcraft(DecisiveHeroInfo heroInfo) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      int step = decisiveDao.myData.step;
      int heroStar = this.getStarMax(heroInfo.code, step);
      if (heroStar >= this.configManager.getInt("tacticsSlotUnlock1")) {
         this.clacWarcraftSkill(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_1, step);
      } else {
         this.removeWarcraftByPos(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_1);
      }

      if (heroStar >= this.configManager.getInt("tacticsSlotUnlock2")) {
         this.clacWarcraftSkill(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_2, step);
      } else {
         this.removeWarcraftByPos(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_2);
      }

      if (heroStar >= this.configManager.getIntDefault("tacticsSlotUnlock3", 13)) {
         this.clacWarcraftSkill(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_3, step);
      } else {
         this.removeWarcraftByPos(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_3);
      }

      if (heroStar >= this.configManager.getIntDefault("tacticsSlotUnlock4", 14)) {
         this.clacWarcraftSkill(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_4, step);
      } else {
         this.removeWarcraftByPos(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_4);
      }

      decisiveDao.updateOp();
   }

   public void clacWarcraftSkill(DecisiveHeroInfo heroInfo, CommonMsg.WearPosition position, int step) {
      DecisiveBattleMainModel mainModel = this.getMainModel(step);
      if (heroInfo.warcraftMap.containsKey(position)) {
         int skillId = (Integer)heroInfo.warcraftMap.get(position);
         WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", skillId);
         if (skillModel == null) {
            logger.error("获取兵法技能有问题：{}", skillId);
            return;
         }

         if (mainModel.getWarcraftLimit() > skillModel.getLv() && skillModel.getNextId() > 0) {
            skillId = skillModel.getNextId();
         } else if (mainModel.getWarcraftLimit() < skillModel.getLv() && skillModel.getLastId() > 0) {
            skillId = skillModel.getLastId();
         }

         heroInfo.warcraftMap.put(position, skillId);
      } else {
         int skillId = this.getDefaultWarcraftSkillId(heroInfo, mainModel);
         if (skillId > 0) {
            heroInfo.warcraftMap.put(position, skillId);
         }
      }

   }

   public void removeWarcraftByPos(DecisiveHeroInfo heroInfo, CommonMsg.WearPosition position) {
      if (heroInfo.warcraftMap.containsKey(position)) {
         heroInfo.warcraftMap.remove(position);
      }

   }

   public int getDefaultWarcraftSkillId(DecisiveHeroInfo heroInfo, DecisiveBattleMainModel mainModel) {
      List<Integer> skillList = new ArrayList();

      for(Map.Entry<CommonMsg.WearPosition, Integer> entry : heroInfo.warcraftMap.entrySet()) {
         skillList.add(entry.getValue());
      }

      List<Integer> tempList = new ArrayList();
      Map<Integer, WarriorSignetSkillModel> modelMap = this.player.getGameModelPool().getMap("warriorSignetSkill");

      for(WarriorSignetSkillModel model : modelMap.values()) {
         if (mainModel.getWarcraftLimit() == model.getLv()) {
            Boolean flag = true;

            for(Integer sourceSkill : skillList) {
               if (this.isSameBaseSkill(sourceSkill, model.getId())) {
                  flag = false;
                  break;
               }
            }

            if (flag) {
               tempList.add(model.getId());
            }
         }
      }

      if (!tempList.isEmpty()) {
         Collections.shuffle(tempList);
         return (Integer)tempList.get(0);
      } else {
         logger.error("未获取到兵法技能！！！");
         return 0;
      }
   }

   public boolean isSameBaseSkill(int sourceSkill, int targetSkill) {
      WarriorSignetSkillModel source = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", sourceSkill);
      if (source == null) {
         return false;
      } else {
         WarriorSignetSkillModel target = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", targetSkill);
         if (target == null) {
            return false;
         } else {
            return source.getBaseSkill() == target.getBaseSkill();
         }
      }
   }

   public int getStarMax(int code, int step) {
      DecisiveBattleMainModel mainModel = this.getMainModel(step);
      DecisiveBattleHeroModel heroModel = (DecisiveBattleHeroModel)this.player.getGameModelPool().getEntity("DecisiveBattleHero", code);
      if (mainModel != null && heroModel != null) {
         return mainModel.getHeroStarLimit() > heroModel.getMaxStar() ? heroModel.getMaxStar() : mainModel.getHeroStarLimit();
      } else {
         return 5;
      }
   }

   public DecisiveHeroInfo getHeroInfoByCode(int code, Boolean isFlush) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveBattleHeroModel decisiveBattleHeroModel = (DecisiveBattleHeroModel)this.player.getGameModelPool().getEntity("DecisiveBattleHero", code);
      if (decisiveBattleHeroModel == null) {
         logger.error("获取英雄有问题：{}", code);
      }

      if (!decisiveDao.heroMap.containsKey(code)) {
         DecisiveHeroInfo heroInfo = new DecisiveHeroInfo();
         heroInfo.code = code;
         heroInfo.heroId = decisiveBattleHeroModel.getHeroId();
         decisiveDao.heroMap.put(code, heroInfo);
         decisiveDao.updateOp();
      }

      DecisiveHeroInfo heroInfo = (DecisiveHeroInfo)decisiveDao.heroMap.get(code);
      this.checkDefaultWarrior(heroInfo, decisiveDao.myData.step);
      this.checkDefaultWarcraft(heroInfo);
      this.checkDefaultOrnament(heroInfo, decisiveDao);
      this.checkDefaultTalent(heroInfo, decisiveDao);
      decisiveDao.updateOp();
      return heroInfo;
   }

   public void checkDefaultTalent(DecisiveHeroInfo heroInfo, DecisiveBattleDao decisiveDao) {
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroInfo.heroId);
      if (heroModel != null) {
         int limitStar = this.getStarMax(heroInfo.code, decisiveDao.myData.step);
         Map<Integer, TalentLevelModel> modelMap = this.player.getGameModelPool().getMap("talentLevel");

         for(TalentLevelModel model : modelMap.values()) {
            if (limitStar >= model.getStar() && !heroInfo.talent.containsKey(model.getId())) {
               if (heroModel.getType() == HeroDefine.HERO_JOB_DEFEND) {
                  heroInfo.talent.put(model.getId(), 1);
               } else if (heroModel.getType() == HeroDefine.HERO_JOB_SUPPORT) {
                  heroInfo.talent.put(model.getId(), 2);
               } else {
                  heroInfo.talent.put(model.getId(), 0);
               }
            } else if (limitStar < model.getStar() && heroInfo.talent.containsKey(model.getId())) {
               heroInfo.talent.remove(model.getId());
            }
         }

      }
   }

   public void checkDefaultOrnament(DecisiveHeroInfo heroInfo, DecisiveBattleDao decisiveDao) {
      DecisiveBattleMainModel mainModel = (DecisiveBattleMainModel)this.player.getGameModelPool().getEntity("DecisiveBattleMain", decisiveDao.myData.maxStep);
      if (heroInfo.ornament.size() != 4) {
         this.addDefaultOrnament(heroInfo);
      }

      Map<Integer, OrnamentItem> tempMap = new HashMap();

      for(Map.Entry<Integer, OrnamentItem> entry : heroInfo.ornament.entrySet()) {
         StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ((OrnamentItem)entry.getValue()).id);
         if (stampModel.getStar() < mainModel.getStampStar()) {
            int stampId = this.getStarOrnament(stampModel, mainModel.getStampStar());
            OrnamentItem newOrnament = this.createOrnamentById(stampId);
            tempMap.put(entry.getKey(), newOrnament);
         }
      }

      if (!tempMap.isEmpty()) {
         heroInfo.ornament.putAll(tempMap);
      }

   }

   public void addDefaultOrnament(DecisiveHeroInfo heroInfo) {
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroInfo.heroId);
      Map<Integer, DecisiveStampModel> modelMap = this.player.getGameModelPool().getMap("DecisiveStamp");

      for(DecisiveStampModel model : modelMap.values()) {
         if (model.getType() == heroModel.getType()) {
            for(Integer stampId : model.getStampId()) {
               OrnamentItem newOrnament = this.createOrnamentById(stampId);
               StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", stampId);
               StampBasicPropertyModel basicPropertyModel = (StampBasicPropertyModel)this.player.getGameModelPool().getEntity("StampBasicProperty", stampModel.getBasicPropertyType());
               int pos = CommonMsg.WearPosition.WEARPOSITION_ORANMENT_1.getNumber();
               if (basicPropertyModel.getStampType() == 2) {
                  pos = CommonMsg.WearPosition.WEARPOSITION_ORANMENT_2.getNumber();
               } else if (basicPropertyModel.getStampType() == 3) {
                  pos = CommonMsg.WearPosition.WEARPOSITION_ORANMENT_3.getNumber();
               } else if (basicPropertyModel.getStampType() == 4) {
                  pos = CommonMsg.WearPosition.WEARPOSITION_ORANMENT_4.getNumber();
               }

               heroInfo.ornament.put(pos, newOrnament);
            }
         }
      }

   }

   public OrnamentItem createOrnamentById(int stampId) {
      OrnamentItem item = new OrnamentItem();
      item.id = stampId;
      item.code = 0;
      item.lev = 0;
      return item;
   }

   public int getStarOrnament(StampModel stampModel, int targetStar) {
      int curStar = stampModel.getStar();
      int curId = stampModel.getId();
      int flag = 0;

      while(true) {
         if (curStar < targetStar && flag < 10) {
            StampModel curModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", curId);
            if (curModel.getStar() != targetStar && curModel.getTargetStamp() != 0) {
               curId = curModel.getTargetStamp();
               ++flag;
               continue;
            }

            return curModel.getId();
         }

         return stampModel.getId();
      }
   }

   public int getHeroLv(int star) {
      int lv = 100;
      StarWithMaxLvModel lvModel = (StarWithMaxLvModel)this.player.getGameModelPool().getEntity("StarWithMaxLv", star);
      if (lvModel != null) {
         lv = lvModel.getMaxLv();
      }

      return lv;
   }

   public void notifyHeroInfo(int heroCode, DecisiveBattleMsg.NotifyReason reason) {
      DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(heroCode, false);
      int star = this.getStarMax(heroCode, this.getDecisiveDao().myData.step);
      HeroDao heroDao = heroInfo.getHeroDao(heroCode, this.getHeroLv(star), star, this.player.getPlayerId());
      if (heroDao != null) {
         DecisiveBattleMsg.S2C_HeroInfo_21814.Builder builder = DecisiveBattleMsg.S2C_HeroInfo_21814.newBuilder();
         builder.setPlayerId(this.player.getPlayerId());
         builder.addHeroInfo(heroDao.toHeroInfoForDecisive());
         builder.setReason(reason);
         this.player.sendMsg(builder.build());
      }
   }

   public void notifyHeroInfo(List<Integer> heroList, DecisiveBattleMsg.NotifyReason reason) {
      DecisiveBattleMsg.S2C_HeroInfo_21814.Builder builder = DecisiveBattleMsg.S2C_HeroInfo_21814.newBuilder();
      builder.setPlayerId(this.player.getPlayerId());

      for(Integer code : heroList) {
         DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(code, false);
         int star = this.getStarMax(code, this.getDecisiveDao().myData.step);
         HeroDao heroDao = heroInfo.getHeroDao(code, this.getHeroLv(star), star, this.player.getPlayerId());
         if (heroDao != null) {
            builder.addHeroInfo(heroDao.toHeroInfoForDecisive());
         }
      }

      builder.setReason(reason);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_MatchPlayer_21805(DecisiveBattleMsg.C2S_MatchPlayer_21805 msg, String source) {
      String limitMatchTime = this.configManager.getStrByDefault("DecisiveBattleOpenTime", "8|22");
      String[] matchTime = limitMatchTime.split("\\|");
      LocalDateTime nowDateTime = LocalDateTime.now();
      if (nowDateTime.getHour() >= Integer.parseInt(matchTime[0]) && nowDateTime.getHour() < Integer.parseInt(matchTime[1])) {
         DecisiveBattleDao decisiveDao = this.getDecisiveDao();
         if (!this.checkCanMatch(decisiveDao)) {
            this.player.failure(76181);
         } else {
            int limitTime = this.configManager.getIntDefault("DecisiveBattleCountdown", 180);
            int limitReMatch = this.configManager.getIntDefault("DecisiveBattleRematch", 2);
            if (decisiveDao.myData.matchData != null) {
               if (DateUtil.getIntTime(System.currentTimeMillis()) - decisiveDao.myData.matchData.matchTime > limitTime) {
                  decisiveDao.myData.matchData = null;
               } else if (decisiveDao.myData.matchData.againMatchNum >= limitReMatch) {
                  logger.error("超过本次最大匹配次数");
                  return;
               }
            } else {
               int curTime = DateUtil.getIntTime(System.currentTimeMillis());
               if (decisiveDao.myData.curMatchTime > 0 && curTime - decisiveDao.myData.curMatchTime < 5) {
                  return;
               }

               int freeNum = this.configManager.getIntDefault("DecisiveBattleFreeTimes", 5);
               if (decisiveDao.myData.fightTimes >= freeNum + decisiveDao.myData.buyFightTimes) {
                  this.player.failure(76174);
                  return;
               }

               decisiveDao.myData.curMatchTime = curTime;
               decisiveDao.updateOp();
            }

            DecisiveBattleMainModel mainModel = this.getMainModel(decisiveDao.myData.step);
            if (mainModel.getMaintainFractionMatch().size() == 2 && (Integer)mainModel.getMaintainFractionMatch().get(0) != 0 && decisiveDao.myData.defeatMap.containsKey(decisiveDao.myData.step) && (Integer)decisiveDao.myData.defeatMap.get(decisiveDao.myData.step) >= (Integer)mainModel.getMaintainFractionMatch().get(1)) {
               this.matchDefeatRobot(decisiveDao);
            } else {
               DecisiveBattleMsg.C2S_MatchPlayer_21805.Builder builder = msg.toBuilder();
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            }
         }
      } else {
         this.player.failure(76176);
      }
   }

   public void matchDefeatRobot(DecisiveBattleDao decisiveDao) {
      DecisiveMatchData data = new DecisiveMatchData();
      this.initRobotData(decisiveDao.myData.step, data, false, true);
      int againMatchNum = 0;
      if (decisiveDao.myData.matchData != null) {
         againMatchNum = decisiveDao.myData.matchData.againMatchNum + 1;
      } else {
         ++decisiveDao.myData.fightTimes;
      }

      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      data.againMatchNum = againMatchNum;
      data.matchTime = curTime;
      decisiveDao.myData.matchData = data;
      decisiveDao.myData.curMatchTime = 0;
      decisiveDao.updateOp();
      this.notifyCrossUpdateMatchTime(curTime);
      this.sendMatchResult(decisiveDao.myData.fightTimes, decisiveDao.myData.buyFightTimes, data);
   }

   public Boolean checkCanMatch(DecisiveBattleDao decisiveBattleDao) {
      DecisiveBattleMainModel mainModel = this.getMainModel(decisiveBattleDao.myData.step);
      if (mainModel.getSupportType() == 1) {
         if (!this.checkHaveArraying(decisiveBattleDao, CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_1)) {
            return false;
         }
      } else if (mainModel.getSupportType() == 2) {
         if (!this.checkHaveArraying(decisiveBattleDao, CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_1) || !this.checkHaveArraying(decisiveBattleDao, CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_2)) {
            return false;
         }
      } else if (!this.checkHaveArraying(decisiveBattleDao, CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_1) || !this.checkHaveArraying(decisiveBattleDao, CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_2) || !this.checkHaveArraying(decisiveBattleDao, CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_3)) {
         return false;
      }

      return true;
   }

   public Boolean checkHaveArraying(DecisiveBattleDao decisiveBattleDao, CommonMsg.HeroState state) {
      if (!decisiveBattleDao.myData.arrayingMap.containsKey(state)) {
         return false;
      } else {
         DecisiveArraying arraying = (DecisiveArraying)decisiveBattleDao.myData.arrayingMap.get(state);
         return arraying.heroMap.keySet().size() == 1 && arraying.heroMap.keySet().contains(5) ? false : true;
      }
   }

   @MsgHandlerAnno
   public void S2S_MatchResult_21861(DecisiveBattleMsg.S2S_MatchResult_21861 msg, CrossSubscribeMsg crossSubscribeMsg) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveMatchData data = new DecisiveMatchData();
      if (msg.hasMatchData() && !msg.getRobot()) {
         data.playerId = msg.getMatchData().getPlayerId();
         data.serverId = msg.getMatchData().getServerId();
         data.playerName = msg.getMatchData().getPlayerName();
         data.headId = msg.getMatchData().getHeadId();
         data.headFrame = msg.getMatchData().getHeadFrame();
         data.step = msg.getMatchData().getStep();
         data.point = msg.getMatchData().getPoint();
         data.lv = msg.getMatchData().getLv();
         data.monarchId = msg.getMatchData().getMonarchId();
         data.maxStep = msg.getMatchData().getMaxStep();

         for(DecisiveBattleMsg.DecisiveArraying arraying : msg.getMatchData().getArrayingInfoList()) {
            data.arrayingMap.put(arraying.getArrayingType(), arraying.getArraying().toByteArray());
         }
      } else {
         if (!msg.hasRobotStep() || msg.getRobotStep() <= 0) {
            this.notifyNotMatchPlayer();
            return;
         }

         DecisiveBattlRobotArrayModel robotModel = (DecisiveBattlRobotArrayModel)this.player.getGameModelPool().getEntity("DecisiveBattleRobotArray", msg.getRobotStep());
         if (robotModel == null) {
            DecisiveBattlRobotArrayModel nextRobotModel = (DecisiveBattlRobotArrayModel)this.player.getGameModelPool().getEntity("DecisiveBattleRobotArray", decisiveDao.myData.step);
            if (nextRobotModel == null) {
               this.notifyNotMatchPlayer();
               return;
            }
         }

         if (msg.hasRobotStep() && msg.getRobotStep() > 0) {
            this.initRobotData(msg.getRobotStep(), data, false, false);
         } else {
            this.initRobotData(decisiveDao.myData.step, data, false, false);
         }
      }

      int againMatchNum = 0;
      if (decisiveDao.myData.matchData != null) {
         againMatchNum = decisiveDao.myData.matchData.againMatchNum + 1;
      } else {
         ++decisiveDao.myData.fightTimes;
      }

      data.againMatchNum = againMatchNum;
      data.matchTime = DateUtil.getIntTime(System.currentTimeMillis());
      decisiveDao.myData.matchData = data;
      decisiveDao.myData.curMatchTime = 0;
      decisiveDao.updateOp();
      this.sendMatchResult(decisiveDao.myData.fightTimes, decisiveDao.myData.buyFightTimes, data);
   }

   public void notifyNotMatchPlayer() {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      if (decisiveDao.myData.matchData != null) {
         decisiveDao.myData.matchData = null;
         if (decisiveDao.myData.fightTimes > 0) {
            --decisiveDao.myData.fightTimes;
         }
      }

      decisiveDao.myData.curMatchTime = 0;
      decisiveDao.updateOp();
      this.sendMatchResult(decisiveDao.myData.fightTimes, decisiveDao.myData.buyFightTimes, (DecisiveMatchData)null);
      this.notifyCrossUpdateMatchTime(0);
   }

   public void sendMatchResult(int fightTimes, int buyFightTimes, DecisiveMatchData data) {
      DecisiveBattleMsg.S2C_MatchPlayer_21806.Builder builder = DecisiveBattleMsg.S2C_MatchPlayer_21806.newBuilder();
      builder.setFightTimes(fightTimes);
      builder.setBufFightTimes(buyFightTimes);
      if (data != null) {
         builder.setMatchData(this.buildPlayerInfo(data, 0));
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_BeginFight_21817(DecisiveBattleMsg.C2S_BeginFight_21817 msg, String source) {
   }

   @MsgHandlerAnno
   public void C2S_CooperateBeauty_21819(DecisiveBattleMsg.C2S_CooperateBeauty_21819 msg, String source) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveBattleMainModel mainModel = this.getMainModel(decisiveDao.myData.maxStep);
      List<Integer> tempList = new ArrayList();

      for(Integer beautyId : msg.getBeautyIdListList()) {
         if (beautyId != 0) {
            if (!mainModel.getTongQueId().contains(beautyId)) {
               logger.error("未解锁该美人ID:{}----{}", beautyId, decisiveDao.myData.maxStep);
               return;
            }

            if (tempList.contains(beautyId)) {
               logger.error("同心策上有一样的美人：{}", beautyId);
               return;
            }

            tempList.add(beautyId);
         }
      }

      if (tempList.size() > mainModel.getTongQueNum()) {
         logger.error("美人同心策数量和段位不一致：{}----{}", msg.getBeautyIdListList(), decisiveDao.myData.maxStep);
      } else {
         for(DecisiveArraying arraying : decisiveDao.myData.arrayingMap.values()) {
            if (msg.getBeautyIdListList().contains(arraying.beautyId) && (Integer)msg.getBeautyIdListList().get(0) != arraying.beautyId) {
               arraying.beautyId = 0;
            }
         }

         if (tempList.isEmpty()) {
            for(DecisiveArraying arraying : decisiveDao.myData.arrayingMap.values()) {
               if (arraying.beautyId != 0 && decisiveDao.myData.cooperateBeauty.contains(arraying.beautyId)) {
                  arraying.beautyId = 0;
               }
            }
         }

         decisiveDao.myData.cooperateBeauty.clear();
         decisiveDao.myData.cooperateBeauty.addAll(msg.getBeautyIdListList());
         decisiveDao.updateOp();
         this.sendCooperateBeautyInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_CooperateBeautyInfo_21840(DecisiveBattleMsg.C2S_CooperateBeautyInfo_21840 msg, String source) {
      this.sendCooperateBeautyInfo();
   }

   public void sendCooperateBeautyInfo() {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveBattleMsg.S2C_CooperateBeauty_21820.Builder builder = DecisiveBattleMsg.S2C_CooperateBeauty_21820.newBuilder();
      builder.addAllBeautyIdList(decisiveDao.myData.cooperateBeauty);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ArtifactPropertyInfo_21842(DecisiveBattleMsg.C2S_ArtifactPropertyInfo_21842 msg, String source) {
      DecisiveBattleMsg.S2C_ArtifactPropertyInfo_21843.Builder builder = DecisiveBattleMsg.S2C_ArtifactPropertyInfo_21843.newBuilder();
      if (this.property_artifact_refine.isEmpty() || this.property_artifact_refine_add.isEmpty() || this.property_artifact_strong.isEmpty()) {
         this.initOtherProperty();
      }

      for(PropertyModel model : this.property_artifact_refine) {
         builder.addRefine(model.builder());
      }

      for(PropertyModel model : this.property_artifact_refine_add) {
         builder.addRefineExtra(model.builder());
      }

      for(PropertyModel model : this.property_artifact_strong) {
         builder.addStrong(model.builder());
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_MyPointRank_21831(DecisiveBattleMsg.C2S_MyPointRank_21831 msg, String source) {
      DecisiveBattleMsg.C2S_MyPointRank_21831.Builder builder = msg.toBuilder();
      builder.setOpenServerDay(this.getActivityOpenDay());
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_SkipFight_21848(DecisiveBattleMsg.C2S_SkipFight_21848 msg, String source) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      int result = this.fight(false);
      if (result != 1) {
         this.player.failure(result);
      } else if (!decisiveDao.myData.battleList.isEmpty()) {
         DecisiveBattleMsg.S2C_SkipFight_21849.Builder builder = DecisiveBattleMsg.S2C_SkipFight_21849.newBuilder();

         for(byte[] bytes : decisiveDao.myData.battleList) {
            try {
               BattleMsg.S2C_BattleResult_6102.Builder battleMsg = BattleMsg.S2C_BattleResult_6102.parseFrom(bytes).toBuilder();
               builder.addBattleMsg(battleMsg);
            } catch (Exception var9) {
               logger.error("决战之巅战斗数据没有解析出来!");
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_BattleRecord_21807(DecisiveBattleMsg.C2S_BattleRecord_21807 msg, String source) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveBattleMsg.S2C_BattleRecord_21808.Builder builder = DecisiveBattleMsg.S2C_BattleRecord_21808.newBuilder();

      for(Map.Entry<Integer, List<DecisiveBattleRecord>> entry : decisiveDao.record.entrySet()) {
         if ((Integer)entry.getKey() == msg.getType()) {
            for(DecisiveBattleRecord record : entry.getValue()) {
               builder.addRecordList(this.buildBattleRecordInfo(record));
            }
         }
      }

      builder.setType(msg.getType());
      this.player.sendMsg(builder.build());
   }

   public DecisiveBattleMsg.BattleRecord.Builder buildBattleRecordInfo(DecisiveBattleRecord record) {
      DecisiveBattleMsg.BattleRecord.Builder recordBuilder = DecisiveBattleMsg.BattleRecord.newBuilder();
      recordBuilder.setLeftPlayer(this.buildPlayerInfo(record.leftData, record.leftData.changePoint));
      recordBuilder.setRightPlayer(this.buildPlayerInfo(record.rightData, record.rightData.changePoint));
      recordBuilder.setWin(record.win);

      for(DecisiveBattleResult result : record.result) {
         DecisiveBattleMsg.RecordResult.Builder resultBuilder = DecisiveBattleMsg.RecordResult.newBuilder();
         resultBuilder.setFightTime(result.battleTime);
         resultBuilder.setRecordId(result.recordId);
         resultBuilder.setWin(result.win);
         ArrayingMirror leftMirror = ArrayingMirror.toArrayingMirror(result.leftArraying);
         resultBuilder.setLeftArraying(leftMirror.toPlayerArrayingInfo());
         ArrayingMirror rightMirror = ArrayingMirror.toArrayingMirror(result.rightArraying);
         resultBuilder.setRightArraying(rightMirror.toPlayerArrayingInfo());
         recordBuilder.addResult(resultBuilder);
      }

      return recordBuilder;
   }

   public void initRobotData(int step, DecisiveMatchData data, Boolean isPractice, Boolean defeatRobot) {
      data.isRobot = true;
      DecisiveBattlRobotArrayModel robotModel = (DecisiveBattlRobotArrayModel)this.player.getGameModelPool().getEntity("DecisiveBattleRobotArray", step);
      if (robotModel == null) {
         logger.error("未找到机器人：{}", step);
      } else {
         List<Integer> tempList = new ArrayList();
         if (isPractice) {
            tempList.addAll(robotModel.getPractiseId());
         } else {
            String[] battleList = robotModel.getBattleId().split("\\|");
            if (defeatRobot) {
               battleList = robotModel.getDeffeatedId().split("\\|");
            }

            String battleStr = battleList[RandomUtil.randInt(0, battleList.length)];
            String[] battleId = battleStr.split(",");

            for(int i = 0; i < battleId.length; ++i) {
               tempList.add(Integer.parseInt(battleId[i]));
            }
         }

         for(int i = 0; i < tempList.size(); ++i) {
            List<PropertyModel> proList = this.getRobotArtifactAdd();
            ArrayingMirror mirror = new ArrayingMirror(step, (Integer)tempList.get(i), proList, robotModel);
            DecisiveBattleMainModel mainModel = this.getMainModel(step);
            this.addArtifactEntityToMirror(mirror, mainModel, (Integer)robotModel.getArtifactId().get(i));
            this.addBeautyEntityToMirror(mirror, mainModel, (Integer)robotModel.getTongQueId().get(0), robotModel.getTongQueId());
            Map<Integer, Integer> tempMap = new HashMap();

            for(int pos = 1; pos <= robotModel.getMysticSkillId().size(); ++pos) {
               tempMap.put(pos, robotModel.getMysticSkillId().get(pos - 1));
            }

            this.addMagicEntityToMirror(mirror, mainModel, tempMap);
            if (i == 0) {
               BattlePKTeam robotTeam = new BattlePKTeam((Integer)tempList.get(i));
               data.monarchId = this.getRobotMonarchId();
               data.lv = this.player.getPublicDao().lv;
               data.playerId = 0;
               data.serverId = this.player.getServerId();
               data.playerName = robotTeam.getBelongName();
               data.headId = this.getRobotHerdId();
               data.headFrame = this.getRobotHerdFrameId();
               data.step = step;
               data.point = mainModel.getRankintegrallow();
               data.maxStep = step;
               data.arrayingMap.put(CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_1, mirror.toByteArray());
            } else if (i == 1) {
               data.arrayingMap.put(CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_2, mirror.toByteArray());
            } else if (i == 2) {
               data.arrayingMap.put(CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_3, mirror.toByteArray());
            }
         }

      }
   }

   public List<PropertyModel> getRobotArtifactAdd() {
      List<PropertyModel> tempList = new ArrayList();

      for(PropertyModel model : this.property_artifact_refine) {
         tempList.add(new PropertyModel(model.getType(), model.getWay(), model.getValue()));
      }

      for(PropertyModel model : this.property_artifact_refine_add) {
         tempList.add(new PropertyModel(model.getType(), model.getWay(), model.getValue()));
      }

      for(PropertyModel model : this.property_artifact_strong) {
         tempList.add(new PropertyModel(model.getType(), model.getWay(), model.getValue()));
      }

      return tempList;
   }

   public int getRobotMonarchId() {
      Map<Integer, MonarchImageModel> monarchMap = this.player.getGameModelPool().getMap("MonarchImage");
      List<MonarchImageModel> tempMonarchList = new ArrayList();

      for(MonarchImageModel monarchImageModel : monarchMap.values()) {
         if (monarchImageModel.getMonsterShow() == 1) {
            tempMonarchList.add(monarchImageModel);
         }
      }

      if (!tempMonarchList.isEmpty()) {
         int r = RandomUtil.randInt(tempMonarchList.size());
         MonarchImageModel key = (MonarchImageModel)tempMonarchList.get(r);
         return key.getSkinId();
      } else {
         return 21404;
      }
   }

   public int getRobotHerdId() {
      Map<Integer, GeneralAvatarModel> headMap = ApplicationContextProvider.<Integer, GeneralAvatarModel>getModelPoolMap("GeneralAvatar");
      List<GeneralAvatarModel> tempGeneralModel = new ArrayList();

      for(GeneralAvatarModel generalAvatarModel : headMap.values()) {
         if (generalAvatarModel.getMonsterShow() == 1) {
            tempGeneralModel.add(generalAvatarModel);
         }
      }

      if (!tempGeneralModel.isEmpty()) {
         int r = RandomUtil.randInt(tempGeneralModel.size());
         GeneralAvatarModel key = (GeneralAvatarModel)tempGeneralModel.get(r);
         return key.getId();
      } else {
         return 1;
      }
   }

   public int getRobotHerdFrameId() {
      Map<Integer, HeadFrameModel> headMap = ApplicationContextProvider.<Integer, HeadFrameModel>getModelPoolMap("headframe");
      List<HeadFrameModel> headFrameModelList = new ArrayList();

      for(HeadFrameModel headFrameModel : headMap.values()) {
         headFrameModelList.add(headFrameModel);
      }

      if (!headFrameModelList.isEmpty()) {
         int r = RandomUtil.randInt(headFrameModelList.size());
         HeadFrameModel key = (HeadFrameModel)headFrameModelList.get(r);
         return key.getId();
      } else {
         return 30001;
      }
   }

   @TaskMethod
   public void sycDataToCross(Boolean isBattleEnd) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveBattleMsg.S2S_SycPlayerData_21860.Builder builder = DecisiveBattleMsg.S2S_SycPlayerData_21860.newBuilder();
      builder.setPoint(decisiveDao.myData.point);
      builder.setStep(decisiveDao.myData.step);
      builder.setBattleEnd(isBattleEnd);
      builder.setMaxStep(decisiveDao.myData.maxStep);

      for(Map.Entry<CommonMsg.HeroState, DecisiveArraying> entry : decisiveDao.myData.arrayingMap.entrySet()) {
         try {
            DecisiveBattleMsg.DecisiveArraying.Builder info = DecisiveBattleMsg.DecisiveArraying.newBuilder();
            info.setArrayingType((CommonMsg.HeroState)entry.getKey());
            ArrayingMirror mirror = this.getArrayingMirror((DecisiveArraying)entry.getValue());
            info.setArraying(ByteString.copyFrom(mirror.toByteArray()));
            builder.addArraying(info);
         } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getLocalizedMessage());
         }
      }

      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public ArrayingMirror getArrayingMirror(DecisiveArraying arraying) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      int step = decisiveDao.myData.step;
      ArrayingMirror arrayingMirror = new ArrayingMirror();

      for(Map.Entry<Integer, Integer> entry : arraying.heroMap.entrySet()) {
         DecisiveHeroInfo heroInfo = this.getHeroInfoByCode((Integer)entry.getValue(), false);
         int star = this.getStarMax((Integer)entry.getValue(), this.getDecisiveDao().myData.step);
         int lv = this.getHeroLv(star);
         HeroDao heroDao = heroInfo.getHeroDao((Integer)entry.getValue(), lv, star, this.player.getPlayerId());
         if (heroDao != null) {
            HeroMirror mirror = HeroMirror.fromHeroByDecisive(heroDao);
            if ((Integer)entry.getKey() < 5) {
               HeroArrayingEntity heroArrayingEntity = new HeroArrayingEntity();
               heroArrayingEntity.mirror = mirror;
               heroArrayingEntity.positon = (Integer)entry.getKey();
               heroArrayingEntity.code = heroDao.code;
               arrayingMirror.arrayingElementsMap.put(((Integer)entry.getKey()).byteValue(), heroArrayingEntity);
            } else if ((Integer)entry.getKey() == 5) {
               FriendArrayingEntity friendArrayingEntity = new FriendArrayingEntity();
               friendArrayingEntity.code = heroDao.code;
               friendArrayingEntity.mirror = mirror;
               friendArrayingEntity.positon = (Integer)entry.getKey();
               arrayingMirror.arrayingElementsMap.put(((Integer)entry.getKey()).byteValue(), friendArrayingEntity);
            }
         }
      }

      arrayingMirror.friendJob = arraying.friendJob;
      arrayingMirror.friendState = arraying.friendState;
      arrayingMirror.friendNation = arraying.friendNation;
      DecisiveBattleMainModel mainModel = this.getMainModel(step);
      if (arraying.artifactId > 0) {
         this.addArtifactEntityToMirror(arrayingMirror, mainModel, arraying.artifactId);
      }

      if (arraying.beautyId > 0) {
         DecisiveBattleMainModel maxMainModel = this.getMainModel(decisiveDao.myData.maxStep);
         this.addBeautyEntityToMirror(arrayingMirror, maxMainModel, arraying.beautyId, decisiveDao.myData.cooperateBeauty);
      }

      if (!decisiveDao.myData.magicBook.isEmpty()) {
         this.addMagicEntityToMirror(arrayingMirror, mainModel, decisiveDao.myData.magicBook);
      }

      arrayingMirror.soulHeroCode = arraying.soulHeroCode;
      if (arraying.soulHeroCode > 0) {
         DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(arraying.soulHeroCode, false);
         int limitStar = this.configManager.getIntDefault("SoulHeroLimitStar", 9);
         int star = this.getStarMax(heroInfo.code, decisiveDao.myData.step);
         if (star >= limitStar) {
            arrayingMirror.soulHeroId = heroInfo.heroId;
         }
      }

      return arrayingMirror;
   }

   public void addBeautyEntityToMirror(ArrayingMirror mirror, DecisiveBattleMainModel mainModel, int beautyId, List<Integer> cooperateList) {
      BeautyArrayingEntity beautyArrayingEntity = new BeautyArrayingEntity();
      beautyArrayingEntity.positon = 7;
      beautyArrayingEntity.code = beautyId;
      beautyArrayingEntity.skillId = this.getBeautySkill(mainModel, beautyId);
      if (cooperateList != null && !cooperateList.isEmpty()) {
         AssistantBeauty assistantBeauty = new AssistantBeauty();
         int mainBeautyId = (Integer)cooperateList.get(0);
         if (mainBeautyId == 0 || mainBeautyId != beautyId) {
            mirror.arrayingElementsMap.put((byte)7, beautyArrayingEntity);
            return;
         }

         for(Integer coopId : cooperateList) {
            assistantBeauty.beautyList.add(coopId);
            if (coopId != 0 && beautyId != coopId) {
               assistantBeauty.assistantList.add(coopId);
               int skillId = this.getBeautySkill(mainModel, coopId);
               TongQueSkillModel tongQueSkillModel = (TongQueSkillModel)this.player.getGameModelPool().getEntity("TongQueSkill", skillId);
               if (tongQueSkillModel != null) {
                  assistantBeauty.assistantSkillList.add(tongQueSkillModel.getAssistantSkill());
                  assistantBeauty.beautySkillList.add(tongQueSkillModel.getAssistantSkill());
               }
            } else if (coopId != 0) {
               assistantBeauty.beautySkillList.add(this.getBeautySkill(mainModel, coopId));
            } else {
               assistantBeauty.beautySkillList.add(0);
            }
         }

         beautyArrayingEntity.assistantBeauty = assistantBeauty;
      }

      mirror.arrayingElementsMap.put((byte)7, beautyArrayingEntity);
   }

   public void addMagicEntityToMirror(ArrayingMirror mirror, DecisiveBattleMainModel mainModel, Map<Integer, Integer> skillMap) {
      DragonArrayingEntity dragonArrayingEntity = new DragonArrayingEntity();
      dragonArrayingEntity.positon = 8;
      dragonArrayingEntity.code = mainModel.getMysticBookId();

      for(int i = 1; i <= 4; ++i) {
         if (skillMap.containsKey(i)) {
            dragonArrayingEntity.skillIds.put(i, skillMap.get(i));
         } else {
            dragonArrayingEntity.skillIds.put(i, 0);
         }
      }

      mirror.arrayingElementsMap.put((byte)8, dragonArrayingEntity);
   }

   public void addArtifactEntityToMirror(ArrayingMirror mirror, DecisiveBattleMainModel mainModel, int artifactId) {
      ArtifactArrayingEntity artifactArrayingEntity = new ArtifactArrayingEntity();
      artifactArrayingEntity.positon = 6;
      artifactArrayingEntity.code = artifactId;
      artifactArrayingEntity.skillId = this.getArtifactSkill(mainModel, artifactId);
      artifactArrayingEntity.level = mainModel.getArtifactSkillLevel();
      mirror.arrayingElementsMap.put((byte)6, artifactArrayingEntity);
   }

   public int getArtifactSkill(DecisiveBattleMainModel mainModel, int artifactId) {
      ArtifactModel model = (ArtifactModel)this.player.getGameModelPool().getEntity("artifact", artifactId);
      ArtifactSkillModel skillModel = (ArtifactSkillModel)this.player.getGameModelPool().getEntity("artifactSkill", mainModel.getArtifactSkillLevel());
      if (model != null && skillModel != null) {
         return (Integer)skillModel.getSkills().get(model.getSkillKey());
      } else {
         logger.error("未获取到神兵技能：{}---{}", mainModel.getArtifactSkillLevel(), artifactId);
         return 0;
      }
   }

   public int getBeautySkill(DecisiveBattleMainModel mainModel, int beautyId) {
      Map<Integer, TongQueSkillModel> modelMap = this.player.getGameModelPool().getMap("TongQueSkill");

      for(TongQueSkillModel model : modelMap.values()) {
         if (model.getLv() == mainModel.getTongQueSkillLevel() && model.getBeautyId() == beautyId) {
            return model.getSkillId();
         }
      }

      logger.error("未获取到美人技能：{}---{}", mainModel.getTongQueSkillLevel(), beautyId);
      return 0;
   }

   public BattlePKTeam creatMyPkTeam(int fightNum) {
      ArrayingMirror arrayingMirror = this.createFightMirror(fightNum);
      BattlePKTeam pkTeam = new BattlePKTeam(this.player.getPlayerId(), this.player.getPublicDao().playerName, arrayingMirror, this.player.getPublicDao().lv, this.player.getPublicDao().head, this.player.getPublicDao().headFrame, (Map)null);
      return pkTeam;
   }

   public ArrayingMirror createFightMirror(int fightNum) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveArraying arraying;
      if (fightNum == 1 && decisiveDao.myData.arrayingMap.containsKey(CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_2)) {
         arraying = (DecisiveArraying)decisiveDao.myData.arrayingMap.get(CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_2);
      } else if (fightNum == 2 && decisiveDao.myData.arrayingMap.containsKey(CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_3)) {
         arraying = (DecisiveArraying)decisiveDao.myData.arrayingMap.get(CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_3);
      } else {
         arraying = (DecisiveArraying)decisiveDao.myData.arrayingMap.get(CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_1);
      }

      ArrayingMirror arrayingMirror = this.getArrayingMirror(arraying);
      return arrayingMirror;
   }

   public BattlePKTeam createEnemyPkTeam(DecisiveMatchData matchData, int fightNum) {
      byte[] bytes = this.getMatchDataArrayingByte(matchData, fightNum);

      try {
         ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror(bytes);
         if (arrayingMirror == null) {
            return null;
         } else {
            BattlePKTeam pkTeam = new BattlePKTeam(matchData.playerId, matchData.playerName, arrayingMirror, matchData.lv, matchData.headId, matchData.headFrame, (Map)null);
            return pkTeam;
         }
      } catch (Exception e) {
         e.printStackTrace();
         logger.error(e.getMessage());
         return null;
      }
   }

   public byte[] getMatchDataArrayingByte(DecisiveMatchData matchData, int fightNum) {
      byte[] bytes;
      if (fightNum == 2 && matchData.arrayingMap.containsKey(CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_3)) {
         bytes = (byte[])matchData.arrayingMap.get(CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_3);
      } else if (fightNum == 1 && matchData.arrayingMap.containsKey(CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_2)) {
         bytes = (byte[])matchData.arrayingMap.get(CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_2);
      } else {
         bytes = (byte[])matchData.arrayingMap.get(CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_1);
      }

      return bytes;
   }

   public int fight(Boolean isPractice) {
      Boolean isWin = false;
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();

      try {
         if (decisiveDao.myData.matchData == null) {
            return 76175;
         }

         DecisiveMatchData matchData = decisiveDao.myData.matchData;
         matchData.isBattle = true;
         DecisiveBattleMainModel mainModel = this.getMainModel(decisiveDao.myData.step);
         Set<Integer> rightLose = new HashSet();
         BattleScene battleScene = new BattleScene(5950, 0);
         List<BattleMsg.S2C_BattleResult_6102.Builder> battleMsgList = new ArrayList();
         List<DecisiveBattleResult> resultList = new ArrayList();

         for(int fightNum = 0; fightNum < mainModel.getSupportType(); ++fightNum) {
            BattlePKTeam leftPkTeam = this.creatMyPkTeam(fightNum);
            battleScene.addPKTeam((byte)0, leftPkTeam);
            this.addBuff(battleScene.getPKTeam((byte)0));

            for(int rightNum = 0; rightNum < mainModel.getSupportType(); ++rightNum) {
               if (!rightLose.contains(rightNum)) {
                  if (battleScene.getPKTeam((byte)1) == null) {
                     BattlePKTeam rightTeam = this.createEnemyPkTeam(matchData, rightNum);
                     if (rightTeam == null) {
                        continue;
                     }

                     battleScene.addPKTeam((byte)1, rightTeam);
                     this.addBuff(battleScene.getPKTeam((byte)1));
                  }

                  BattleMsg.S2C_BattleResult_6102.Builder battleMsg = battleScene.fight((byte)mainModel.getRoundLimit());
                  resultList.add(this.saveBattleResult(matchData, rightNum, fightNum));
                  battleMsgList.add(battleMsg);
                  if (battleScene.getWinForce() == 1) {
                     battleScene.getPKTeam((byte)0).destroy();
                     battleScene.getPkTeams()[0] = null;
                     break;
                  }

                  rightLose.add(rightNum);
                  battleScene.getPKTeam((byte)1).destroy();
                  battleScene.getPkTeams()[1] = null;
               }
            }
         }

         int allWin = ((BattleMsg.S2C_BattleResult_6102.Builder)battleMsgList.get(battleMsgList.size() - 1)).getResult().getResult();
         int leftChangPoint = 0;
         int rightChangePoint = 0;
         String decisiveBattleMatchLowRank = this.configManager.getStrByDefault("DecisiveBattleMatchLowRank", "20|30|40|50");
         String[] matchLowRank = decisiveBattleMatchLowRank.split("\\|");
         if (allWin == 0) {
            isWin = true;
            leftChangPoint = mainModel.getWinget();
            DecisiveBattleMainModel matchModel = this.getMainModel(matchData.step);
            if (matchModel.getLosereduce() > 0) {
               rightChangePoint = mainModel.getLosedecrease() * -1;
            }

            if (decisiveDao.myData.step > matchData.step) {
               leftChangPoint = leftChangPoint * Integer.parseInt(matchLowRank[0]) / 100;
               rightChangePoint = rightChangePoint * Integer.parseInt(matchLowRank[3]) / 100;
            } else if (decisiveDao.myData.step < matchData.step) {
               leftChangPoint = leftChangPoint * Integer.parseInt(matchLowRank[2]) / 100;
               rightChangePoint = rightChangePoint * Integer.parseInt(matchLowRank[1]) / 100;
            }
         } else {
            if (mainModel.getLosereduce() > 0) {
               leftChangPoint = mainModel.getLosedecrease() * -1;
            }

            rightChangePoint = mainModel.getWinget();
            if (decisiveDao.myData.step > matchData.step) {
               leftChangPoint = leftChangPoint * Integer.parseInt(matchLowRank[1]) / 100;
               rightChangePoint = rightChangePoint * Integer.parseInt(matchLowRank[2]) / 100;
            } else if (decisiveDao.myData.step < matchData.step) {
               leftChangPoint = leftChangPoint * Integer.parseInt(matchLowRank[3]) / 100;
               rightChangePoint = rightChangePoint * Integer.parseInt(matchLowRank[0]) / 100;
            }
         }

         if (leftChangPoint < 0 && mainModel.getLowestscore() > 0) {
            if (decisiveDao.myData.point + leftChangPoint < mainModel.getLowestscore()) {
               leftChangPoint = mainModel.getLowestscore() - decisiveDao.myData.point;
            }

            if (leftChangPoint > 0) {
               leftChangPoint = 0;
            }
         }

         int oldStep = decisiveDao.myData.step;
         if (!isPractice) {
            this.checkPointFightResult(leftChangPoint, true);
         }

         List<ResourceModel> rewardList = new ArrayList();
         int nextRecordId = 0;

         for(int wave = battleMsgList.size(); wave >= 1; --wave) {
            BattleMsg.S2C_BattleResult_6102.Builder battleMsg = (BattleMsg.S2C_BattleResult_6102.Builder)battleMsgList.get(wave - 1);
            battleMsg.setWave(wave);
            battleMsg.setTotalWave(battleMsgList.size());
            battleMsg.setIsNextWave(battleMsg.getWave() != 1);
            battleMsg.setIsEnd(battleMsg.getWave() == battleMsg.getTotalWave());
            battleMsg.setResult(battleMsg.getResult().toBuilder().setNextRecordId(nextRecordId));
            if (wave == battleMsgList.size()) {
               int newStep = decisiveDao.myData.step;
               int newPoint = decisiveDao.myData.point;
               BattleMsg.S2C_Battle_Result.Builder battleResult = battleMsg.getResult().toBuilder();
               if (!isPractice) {
                  battleResult.addSettleInfo((long)oldStep).addSettleInfo((long)newStep).addSettleInfo((long)newPoint).addSettleInfo((long)leftChangPoint);

                  for(ResourceModel reward : this.getBattleReward(decisiveDao.myData.step, allWin)) {
                     battleResult.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(reward.getType()).setId(reward.getId()).setNum(reward.getValue()));
                     rewardList.add(new ResourceModel(reward.getType(), reward.getId(), reward.getValue()));
                  }
               }

               battleResult.setResult(allWin);
               battleMsg.setResult(battleResult);
            }

            this.battleRecordMgr.addBattleRecord(5950, battleMsg.getSetId(), this.player.getPlayerId(), battleMsg.getTeams(1).getBeloogId(), battleMsg);
            if (wave != battleMsgList.size()) {
               BattleMsg.S2C_BattleResult_6102.Builder preBattleMsg = (BattleMsg.S2C_BattleResult_6102.Builder)battleMsgList.get(wave);
               BattleMsg.S2C_Battle_Result.Builder battleMsgResult = battleMsg.getResult().toBuilder();
               battleMsg.setResult(battleMsgResult.setNextRecordId(preBattleMsg.getResult().getRecordId()));
            }

            nextRecordId = battleMsg.getResult().getRecordId();
         }

         if (!isPractice) {
            for(int i = 0; i < resultList.size(); ++i) {
               DecisiveBattleResult result = (DecisiveBattleResult)resultList.get(i);
               BattleMsg.S2C_BattleResult_6102.Builder fightMsg = (BattleMsg.S2C_BattleResult_6102.Builder)battleMsgList.get(i);
               if (fightMsg.getResult().getResult() == 1) {
                  result.win = 1;
               }

               result.recordId = fightMsg.getResult().getRecordId();
               result.battleTime = fightMsg.getStartTime();
            }

            this.saveBattleAttackRecord(resultList, allWin, matchData, leftChangPoint, rightChangePoint);
            if (!rewardList.isEmpty()) {
               this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 127, 12704, 0, 0, "");
            }
         }

         if (!matchData.isRobot) {
            this.sendBattleResultToEnemy(resultList, leftChangPoint, rightChangePoint, matchData, battleMsgList, allWin);
            this.addHeroRecord(decisiveDao, allWin == 0, oldStep);
         }

         if (!isPractice) {
            this.sendHeroRateToCross(decisiveDao, allWin == 0);
         }

         decisiveDao.myData.battleList.clear();

         for(BattleMsg.S2C_BattleResult_6102.Builder builder : battleMsgList) {
            decisiveDao.myData.battleList.add(builder.build().toByteArray());
         }

         if (allWin == 0) {
            decisiveDao.myData.defeatMap.put(decisiveDao.myData.step, 0);
         } else {
            MapUtil.mapPlusInt(decisiveDao.myData.defeatMap, decisiveDao.myData.step, 1);
         }
      } catch (Exception e) {
         e.printStackTrace();
         logger.error("决战之巅战斗有问题：{}", this.player.getPlayerId());
         decisiveDao.myData.matchData = null;
         decisiveDao.updateOp();
         return 0;
      }

      decisiveDao.myData.matchData = null;
      decisiveDao.updateOp();
      if (!isPractice) {
         this.player.triggerTask(709, 0, 1L, 1);
         if (isWin) {
            this.player.triggerTask(710, 0, 1L, 1);
         }
      }

      return 1;
   }

   public void addBuff(BattlePKTeam battlePKTeam) {
      if (battlePKTeam != null) {
         for(Map.Entry<Byte, Entity> entry : battlePKTeam.getEntityMap().entrySet()) {
            if ((Byte)entry.getKey() <= 5 && (Byte)entry.getKey() >= 0) {
               Entity entity = (Entity)entry.getValue();
               Set<Integer> skillSet = this.getNationBuffSkill(entity);
               if (!skillSet.isEmpty()) {
                  entity.addExtraSkill(skillSet);
               }
            }
         }

         Entity friendEntity = battlePKTeam.getFriendEntity();
         if (friendEntity != null) {
            Set<Integer> skillSet = this.getNationBuffSkill(friendEntity);
            if (!skillSet.isEmpty()) {
               friendEntity.addExtraSkill(skillSet);
            }
         }

      }
   }

   public Set<Integer> getNationBuffSkill(Entity entity) {
      Set<Integer> skillSet = new HashSet();
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", entity.getId());
      if (heroModel == null) {
         return skillSet;
      } else {
         int realNation = heroModel.getNation();
         if (realNation == 10) {
            realNation = entity.inheritNation;
         }

         DecisiveBattleDao decisiveBattleDao = this.getDecisiveDao();
         Map<Integer, DecisiveBattleBuffModel> modelMap = this.player.getGameModelPool().getMap("DecisiveBattleBuff");

         for(DecisiveBattleBuffModel buffModel : modelMap.values()) {
            if (buffModel.getBuffType() == 1 && (realNation == 1 || realNation == 2 || realNation == 3)) {
               skillSet.add(buffModel.getSkiiId());
            }
         }

         if (modelMap.containsKey(decisiveBattleDao.targetBuffNationId) && realNation == ((DecisiveBattleBuffModel)modelMap.get(decisiveBattleDao.targetBuffNationId)).getNation()) {
            skillSet.add(((DecisiveBattleBuffModel)modelMap.get(decisiveBattleDao.targetBuffNationId)).getSkiiId());
         }

         return skillSet;
      }
   }

   public void sendHeroRateToCross(DecisiveBattleDao decisiveBattleDao, Boolean isWin) {
      DecisiveBattleMsg.S2S_UpdateTopHero_21865.Builder builder = DecisiveBattleMsg.S2S_UpdateTopHero_21865.newBuilder();
      builder.setIsWin(isWin);

      for(DecisiveArraying arraying : decisiveBattleDao.myData.arrayingMap.values()) {
         for(Integer code : arraying.heroMap.values()) {
            DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(code, false);
            builder.addHeroList(heroInfo.heroId);
         }
      }

      if (!builder.getHeroListList().isEmpty()) {
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   public List<ResourceModel> getBattleReward(int step, int win) {
      DecisiveBattleRewardModel rewardModel = (DecisiveBattleRewardModel)this.player.getGameModelPool().getEntity("DecisiveBattleReward", step);
      if (rewardModel == null) {
         return new ArrayList();
      } else {
         return win == 0 ? rewardModel.getWinrewards() : rewardModel.getLoserewards();
      }
   }

   public void createPracticeRobot(DecisiveBattleDao decisiveDao) {
      DecisiveMatchData data = new DecisiveMatchData();
      this.initRobotData(decisiveDao.myData.step, data, true, false);
      decisiveDao.myData.matchData = data;
      decisiveDao.updateOp();
   }

   public int enterBattle(BattleDao battleDao) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      if (battleDao.scene.getWave() == 0) {
         Boolean isPractice = false;
         if (battleDao.params.size() > 0 && (Integer)battleDao.params.get(0) == 1 && decisiveDao.myData.matchData == null) {
            this.createPracticeRobot(decisiveDao);
            isPractice = true;
         }

         int result = this.fight(isPractice);
         if (result != 1) {
            return result;
         }
      }

      BattleMsg.S2C_BattleResult_6102.Builder battleMsg = null;

      try {
         if (decisiveDao.myData.battleList.size() <= battleDao.scene.getWave()) {
            return 0;
         }

         battleMsg = BattleMsg.S2C_BattleResult_6102.parseFrom((byte[])decisiveDao.myData.battleList.get(battleDao.scene.getWave())).toBuilder();
      } catch (Exception e) {
         e.printStackTrace();
         logger.info(e.getMessage());
         return 0;
      }

      if (battleMsg == null) {
         return 0;
      } else {
         battleDao.stream = (byte[])decisiveDao.myData.battleList.get(battleDao.scene.getWave());
         battleDao.scene = new BattleScene(battleMsg.build());
         battleDao.totalTime += (long)battleDao.scene.getCostTime();
         battleDao.scene.getBattleMsg().setIsSkip(battleDao.isSkip);
         this.player.sendMsg(battleMsg.build());
         if (battleDao.scene.getWave() == decisiveDao.myData.battleList.size()) {
            battleDao.status = 0;
         }

         battleDao.updateOp();
         if (battleDao.isSkip) {
            logger.info("战斗-->{}跳过【决战之巅】战斗,我方【{}】VS敌方【{}】", new Object[]{battleDao.playerId, battleMsg.build().getTeams(0).getBeloogName(), battleMsg.build().getTeams(1).getBeloogName()});
         } else {
            logger.info("战斗-->{}进入【决战之巅】第{}波战斗,我方【{}】VS敌方【{}】", new Object[]{battleDao.playerId, battleMsg.build().getWave(), battleMsg.build().getTeams(0).getBeloogName(), battleMsg.build().getTeams(1).getBeloogName()});
         }

         return 1;
      }
   }

   public void endBattle(BattleDao battleDao) {
      DecisiveBattleDao decisiveBattleDao = this.getDecisiveDao();
      if (!decisiveBattleDao.myData.battleList.isEmpty()) {
         decisiveBattleDao.myData.battleList.clear();
         decisiveBattleDao.updateOp();
      }

   }

   public void sendBattleResultToEnemy(List<DecisiveBattleResult> resultList, int leftChangPoint, int rightChangePoint, DecisiveMatchData matchData, List<BattleMsg.S2C_BattleResult_6102.Builder> battleList, int allWin) {
      DecisiveBattleMsg.S2S_ResultToEnemy_21862.Builder builder = DecisiveBattleMsg.S2S_ResultToEnemy_21862.newBuilder();
      builder.setAllWin(allWin);
      builder.setLeftData(this.buildPlayerInfo((DecisiveMatchData)null, leftChangPoint));
      builder.setRightData(this.buildPlayerInfo(matchData, rightChangePoint));
      int pos = 0;

      for(DecisiveBattleResult result : resultList) {
         DecisiveBattleMsg.RecordInfo.Builder info = DecisiveBattleMsg.RecordInfo.newBuilder();
         info.setRecordId(result.recordId);
         info.setTime(result.battleTime);
         info.setLeftArraying(ByteString.copyFrom(result.leftArraying));
         info.setRightArraying(ByteString.copyFrom(result.rightArraying));
         info.setWin(result.win);
         info.setBattleMsg(((BattleMsg.S2C_BattleResult_6102.Builder)battleList.get(pos)).build());
         builder.addResult(info);
         ++pos;
      }

      this.crossNettyClient.send2Server(this.player.getServerId(), this.player.getPlayerId(), matchData.serverId, matchData.playerId, builder.build());
   }

   @MsgHandlerAnno
   public void S2S_ResultToEnemy_21862(DecisiveBattleMsg.S2S_ResultToEnemy_21862 msg, CrossSubscribeMsg crossSubscribeMsg) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveBattleRecord record = new DecisiveBattleRecord();
      DecisiveMatchData leftData = this.createResultData(msg.getLeftData());
      record.leftData = leftData;
      DecisiveMatchData rightData = this.createResultData(msg.getRightData());
      record.rightData = rightData;
      record.win = msg.getAllWin();

      for(DecisiveBattleMsg.RecordInfo info : msg.getResultList()) {
         BattleMsg.S2C_BattleResult_6102.Builder battleMsg = info.getBattleMsg().toBuilder();
         this.battleRecordMgr.addBattleRecord(5950, battleMsg.getSetId(), this.player.getPlayerId(), battleMsg.getTeams(0).getBeloogId(), battleMsg);
         DecisiveBattleResult result = new DecisiveBattleResult();
         result.leftArraying = info.getLeftArraying().toByteArray();
         result.rightArraying = info.getRightArraying().toByteArray();
         result.battleTime = info.getTime();
         result.recordId = battleMsg.getResult().getRecordId();
         result.win = info.getWin();
         record.result.add(result);
      }

      this.addOneRecord(decisiveDao, record, 2);
      this.checkPointFightResult(msg.getRightData().getChangePoint(), false);
      decisiveDao.updateOp();
   }

   public DecisiveMatchData createResultData(DecisiveBattleMsg.PlayerData playerData) {
      DecisiveMatchData data = new DecisiveMatchData();
      data.point = playerData.getPoint();
      data.step = playerData.getStep();
      data.playerName = playerData.getPlayerName();
      data.playerId = playerData.getPlayerId();
      data.headFrame = playerData.getHeadFrame();
      data.headId = playerData.getHeadId();
      data.lv = playerData.getLv();
      data.serverId = playerData.getServerId();
      data.changePoint = playerData.getChangePoint();
      data.monarchId = playerData.getMonarchId();
      return data;
   }

   public int getMaxPoint() {
      int maxPoint = 0;
      Map<Integer, DecisiveBattleMainModel> modelMap = this.player.getGameModelPool().getMap("DecisiveBattleMain");

      for(DecisiveBattleMainModel model : modelMap.values()) {
         if (model.getRankintegralhigh() > maxPoint) {
            maxPoint = model.getRankintegralhigh();
         }
      }

      return maxPoint;
   }

   public void checkPointFightResult(int changPoint, Boolean attack) {
      Map<Integer, DecisiveBattleMainModel> modelMap = this.player.getGameModelPool().getMap("DecisiveBattleMain");
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      if (changPoint != 0) {
         if (!attack && changPoint < 0) {
            DecisiveBattleMainModel mainModel = (DecisiveBattleMainModel)modelMap.get(decisiveDao.myData.step);
            if (mainModel.getLowestscore() > 0 && decisiveDao.myData.point + changPoint < mainModel.getLowestscore()) {
               changPoint = mainModel.getLowestscore() - decisiveDao.myData.point;
               if (changPoint > 0) {
                  changPoint = 0;
               }
            }
         }

         int realPoint = decisiveDao.myData.point + changPoint;
         int oldStep = decisiveDao.myData.step;
         if (realPoint > this.getMaxPoint()) {
            decisiveDao.myData.point = this.getMaxPoint();
            realPoint = this.getMaxPoint();
         }

         for(DecisiveBattleMainModel battleMainModel : modelMap.values()) {
            if (realPoint >= battleMainModel.getRankintegrallow() && realPoint <= battleMainModel.getRankintegralhigh()) {
               decisiveDao.myData.step = battleMainModel.getId();
               decisiveDao.myData.point = realPoint;
               break;
            }
         }

         if (decisiveDao.myData.step > decisiveDao.myData.maxStep) {
            decisiveDao.myData.maxStep = decisiveDao.myData.step;
         }

         if (oldStep != decisiveDao.myData.step && attack && this.player.isLogin() && !decisiveDao.myData.receiveStepAward.contains(decisiveDao.myData.step)) {
            decisiveDao.myData.receiveStepAward.add(decisiveDao.myData.step);
            DecisiveBattleFirstRewardModel rewardModel = (DecisiveBattleFirstRewardModel)this.getFirstRewardModel().get(decisiveDao.myData.step);
            if (rewardModel != null) {
               this.player.addResource(rewardModel.getRewards(), PlayerMsg.ShowType.SHOW_DECISIVE_BATTLE_STEP_AWARD, 127, 12703, 0, 0, "");
            }
         }

         decisiveDao.updateOp();
         if (oldStep != decisiveDao.myData.step) {
            this.checkArrayingByStep();
         }

         Boolean flag = false;
         if (!attack && oldStep != decisiveDao.myData.step) {
            flag = this.checkDefendChangeStep(oldStep, decisiveDao);
         }

         boolean sendArraying = this.checkSaveArraying(decisiveDao, oldStep, decisiveDao.myData.step);
         this.notifySepChange(true, oldStep != decisiveDao.myData.step, flag, attack, sendArraying);
      } else if (attack) {
         this.notifyCrossUpdateMatchTime(0);
      }

   }

   public void notifyCrossUpdateMatchTime(int time) {
      DecisiveBattleMsg.S2S_NotifyUpdateMatchTime_21864.Builder builder = DecisiveBattleMsg.S2S_NotifyUpdateMatchTime_21864.newBuilder();
      builder.setMatchTime(time);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public Boolean checkDefendChangeStep(int oldStep, DecisiveBattleDao decisiveDao) {
      Boolean flag = false;
      DecisiveBattleMainModel mainModel = this.getMainModel(decisiveDao.myData.step);
      DecisiveBattleMainModel oldModel = this.getMainModel(oldStep);
      if (oldModel.getSupportType() != mainModel.getSupportType() && decisiveDao.myData.matchData != null && !decisiveDao.myData.matchData.isBattle) {
         logger.info("玩家段位被迫改变，阵容个数改变，返回次数，清空匹配:{}", this.player.getPublicDao().playerName);
         decisiveDao.myData.matchData = null;
         if (decisiveDao.myData.fightTimes > 0) {
            --decisiveDao.myData.fightTimes;
         }

         decisiveDao.updateOp();
         flag = true;
      }

      return flag;
   }

   public void checkArrayingByStep() {
      int limitStar = this.configManager.getIntDefault("SoulHeroLimitStar", 9);
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveBattleMainModel mainModel = this.getMainModel(decisiveDao.myData.step);
      if (mainModel.getSupportType() == 1) {
         this.removeArraying(decisiveDao, CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_2);
         this.removeArraying(decisiveDao, CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_3);
      } else if (mainModel.getSupportType() == 2) {
         this.removeArraying(decisiveDao, CommonMsg.HeroState.HERO_STATE_DECISIVE_BATTLE_3);
      }

      for(Map.Entry<CommonMsg.HeroState, DecisiveArraying> entry : decisiveDao.myData.arrayingMap.entrySet()) {
         Boolean flag = false;

         for(Map.Entry<Integer, Integer> heroEntry : ((DecisiveArraying)entry.getValue()).heroMap.entrySet()) {
            if ((Integer)heroEntry.getKey() == 5 && ((DecisiveArraying)entry.getValue()).friendState == 0 || (Integer)heroEntry.getKey() != 5) {
               DecisiveHeroInfo heroInfo = this.getHeroInfoByCode((Integer)heroEntry.getValue(), false);
               int star = this.getStarMax(heroInfo.code, decisiveDao.myData.step);
               if ((Integer)heroEntry.getValue() == ((DecisiveArraying)entry.getValue()).soulHeroCode && star >= limitStar) {
                  flag = true;
               }
            }
         }

         if (!flag) {
            ((DecisiveArraying)entry.getValue()).soulHeroCode = 0;
         }
      }

      for(Map.Entry<CommonMsg.HeroState, DecisiveArraying> entry : decisiveDao.myData.arrayingMap.entrySet()) {
         int tempPos = 0;
         int targetSoulCode = 0;

         for(Map.Entry<Integer, Integer> heroEntry : ((DecisiveArraying)entry.getValue()).heroMap.entrySet()) {
            DecisiveHeroInfo heroInfo = this.getHeroInfoByCode((Integer)heroEntry.getValue(), false);
            int star = this.getStarMax(heroInfo.code, decisiveDao.myData.step);
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroInfo.heroId);
            if (heroModel.getNation() == 10 && star >= limitStar && (tempPos == 0 || tempPos > (Integer)heroEntry.getKey())) {
               tempPos = (Integer)heroEntry.getKey();
               targetSoulCode = (Integer)heroEntry.getValue();
            }
         }

         if (((DecisiveArraying)entry.getValue()).soulHeroCode > 0 && targetSoulCode == 0) {
            ((DecisiveArraying)entry.getValue()).soulHeroCode = 0;
         } else if (((DecisiveArraying)entry.getValue()).soulHeroCode == 0 && targetSoulCode > 0) {
            ((DecisiveArraying)entry.getValue()).soulHeroCode = targetSoulCode;
         }
      }

      decisiveDao.updateOp();
   }

   public void removeArraying(DecisiveBattleDao decisiveDao, CommonMsg.HeroState state) {
      if (decisiveDao.myData.arrayingMap.containsKey(state)) {
         decisiveDao.myData.arrayingMap.remove(state);
      }

   }

   public DecisiveBattleIntegralModel getPointModel(int leftPoint, int rightPoint) {
      int dPoint = Math.abs(leftPoint - rightPoint);
      Map<Integer, DecisiveBattleIntegralModel> modelMap = this.player.getGameModelPool().getMap("DecisiveBattleIntegral");

      for(DecisiveBattleIntegralModel model : modelMap.values()) {
         if (dPoint >= model.getIntegrallow() && dPoint <= model.getIntegralhigh()) {
            return model;
         }
      }

      return (DecisiveBattleIntegralModel)modelMap.get(1);
   }

   public void saveBattleAttackRecord(List<DecisiveBattleResult> resultList, int allWin, DecisiveMatchData matchData, int leftChangPoint, int rightChangePoint) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveBattleRecord record = new DecisiveBattleRecord();
      DecisiveMatchData leftData = new DecisiveMatchData();
      leftData.point = decisiveDao.myData.point;
      leftData.step = decisiveDao.myData.step;
      leftData.playerName = this.player.getPublicDao().playerName;
      leftData.playerId = this.player.getPlayerId();
      leftData.headFrame = this.player.getPublicDao().headFrame;
      leftData.headId = this.player.getPublicDao().head;
      leftData.lv = this.player.getPublicDao().lv;
      leftData.serverId = this.player.getServerId();
      leftData.changePoint = leftChangPoint;
      DecisiveMatchData rightData = new DecisiveMatchData();
      rightData.point = matchData.point;
      rightData.step = matchData.step;
      rightData.playerName = matchData.playerName;
      rightData.playerId = matchData.playerId;
      rightData.headFrame = matchData.headFrame;
      rightData.headId = matchData.headId;
      rightData.lv = matchData.lv;
      rightData.serverId = matchData.serverId;
      rightData.changePoint = rightChangePoint;
      record.leftData = leftData;
      record.rightData = rightData;
      record.win = allWin;
      record.result.addAll(resultList);
      this.addOneRecord(decisiveDao, record, 1);
      decisiveDao.updateOp();
   }

   public void addOneRecord(DecisiveBattleDao decisiveDao, DecisiveBattleRecord record, int recordType) {
      int limitRecord = this.configManager.getIntDefault("DecisiveLimitRecord", 20);
      if (decisiveDao.record.containsKey(recordType)) {
         ((List)decisiveDao.record.get(recordType)).add(record);
         if (((List)decisiveDao.record.get(recordType)).size() > limitRecord) {
            DecisiveBattleRecord delRecord = (DecisiveBattleRecord)((List)decisiveDao.record.get(recordType)).remove(0);

            for(DecisiveBattleResult result : delRecord.result) {
               this.battleRecordMgr.pushTaskEx("delBattleRecordDao", new Object[]{result.recordId});
            }
         }
      } else {
         List<DecisiveBattleRecord> tempList = new ArrayList();
         tempList.add(record);
         decisiveDao.record.put(recordType, tempList);
      }

   }

   public DecisiveBattleResult saveBattleResult(DecisiveMatchData matchData, int rightFightNum, int leftFightNum) {
      DecisiveBattleResult result = new DecisiveBattleResult();
      result.rightArraying = this.getMatchDataArrayingByte(matchData, rightFightNum);
      result.leftArraying = this.createFightMirror(leftFightNum).toByteArray();
      return result;
   }

   public Map<Integer, DecisiveBattleFirstRewardModel> getFirstRewardModel() {
      int activityOpenDay = this.getActivityOpenDay();
      Map<Integer, DecisiveBattleFirstRewardModel> modelMap = new HashMap();
      Map<Integer, DecisiveBattleFirstRewardModel> allModel = this.player.getGameModelPool().getMap("DecisiveBattleFirstReward");
      if (allModel != null && !allModel.isEmpty()) {
         for(Map.Entry<Integer, DecisiveBattleFirstRewardModel> entry : allModel.entrySet()) {
            DecisiveBattleFirstRewardModel model = (DecisiveBattleFirstRewardModel)entry.getValue();
            if (model.getDateEnd() == -1) {
               if (activityOpenDay >= model.getDateStart()) {
                  modelMap.put(model.getRankId(), model);
               }
            } else if (activityOpenDay >= model.getDateStart() && activityOpenDay <= model.getDateEnd()) {
               modelMap.put(model.getRankId(), model);
            }
         }

         return modelMap;
      } else {
         return modelMap;
      }
   }

   @MsgHandlerAnno
   public void C2S_LeaveUI_21838(DecisiveBattleMsg.C2S_LeaveUI_21838 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.updateLastData(false);
      }
   }

   @MsgHandlerAnno
   public void S2S_SendRankAward_21863(DecisiveBattleMsg.S2S_SendRankAward_21863 msg, String source) {
      int rank = msg.getRank();
      int rankSum = msg.getRankSum();
      if (msg.hasIsMergeServer() && msg.getIsMergeServer()) {
         this.resetData();
      }

      int limitSum = 800;
      DecisiveBattleRankRewardModel rewardModel = null;
      if (rankSum >= limitSum) {
         rewardModel = DecisiveBattleRankRewardModel.getRankTargetId(this.getActivityOpenDay(), rank);
      } else {
         int targetRank = this.getTargetRank(rank, rankSum);
         Map<Integer, DecisiveBattleRankRewardModel> modelMap = this.player.getGameModelPool().getMap("DecisiveBattleRankReward");

         for(DecisiveBattleRankRewardModel model : modelMap.values()) {
            if (this.getActivityOpenDay() >= model.getDateStart() && (this.getActivityOpenDay() <= model.getDateEnd() || model.getDateEnd() == -1) && targetRank >= model.getRankItervallow() && targetRank <= model.getRankItervalhigh()) {
               rewardModel = model;
               break;
            }
         }
      }

      if (rewardModel == null) {
         logger.info("决战之巅排行榜结算有问题：{}---{}", rank, this.player.getPublicDao().playerName);
      } else {
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         CentreAwardModel awardModel;
         if (msg.hasIsMergeServer() && msg.getIsMergeServer()) {
            awardModel = this.getCentreAwardModel(CentreAwardModel.TYPE_DECISIVE_BATTLE_MERGE_REWARD, 0L);
         } else {
            awardModel = this.getCentreAwardModel(CentreAwardModel.TYPE_DECISIVE_BATTLE_RANK_REWARD, 0L);
         }

         String content = MessageFormat.format(awardModel.getDesc(), rewardModel.getRankShow());
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, awardModel.getTitle(), content, rewardModel.getItems(), 604800000L, 127, 12705);
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "决战之巅", "排行奖励-" + content, "排行奖励-" + content, 0, 0, 1);
         logger.info("发送决战之巅排行榜奖励：{}--{}--{}--{}", new Object[]{msg.getRank(), msg.getRankSum(), this.player.getPlayerId(), rewardModel.getId()});
      }
   }

   public int getTargetRank(int rank, int rankSum) {
      if (rankSum < 100) {
         rankSum = 100;
      }

      int calRank = rank * 100;
      int tempRank = calRank / rankSum;
      if (calRank % rankSum > 0) {
         ++tempRank;
      }

      if (tempRank == 0) {
         tempRank = 1;
      } else if (tempRank > 100) {
         tempRank = 100;
      }

      return tempRank;
   }

   private CentreAwardModel getCentreAwardModel(int type, long rank) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = this.player.getGameModelPool().getMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> rewardMap = (TreeMap)centreAwardModelMap.get(type);
      CentreAwardModel rewardModel = null;

      for(CentreAwardModel awardModel : rewardMap.values()) {
         if ((long)awardModel.getMinRank() <= rank && (long)awardModel.getMaxRank() >= rank) {
            rewardModel = awardModel;
            break;
         }
      }

      if (rewardModel == null) {
         rewardModel = (CentreAwardModel)rewardMap.lastEntry().getValue();
      }

      return rewardModel;
   }

   public void sendStepAward() {
      List<ResourceModel> rewardList = new ArrayList();
      DecisiveBattleDao battleDao = this.getDecisiveDao();

      for(int step = 1; step <= battleDao.myData.maxStep; ++step) {
         if (!battleDao.myData.receiveStepAward.contains(step) && this.getFirstRewardModel().containsKey(step)) {
            for(ResourceModel reward : ((DecisiveBattleFirstRewardModel)this.getFirstRewardModel().get(step)).getRewards()) {
               reward.addResourceToList(rewardList);
            }
         }
      }

      if (!rewardList.isEmpty()) {
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         CentreAwardModel awardModel = this.getCentreAwardModel(CentreAwardModel.TYPE_DECISIVE_BATTLE_STEP_REWARD, 0L);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, awardModel.getTitle(), awardModel.getDesc(), rewardList, 604800000L, 127, 12703);
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "决战之巅", "未领取段位首达奖励-" + awardModel.getDesc(), "段位首达奖励-" + awardModel.getDesc(), 0, 0, 1);
      }

   }

   public void sendTaskAward() {
      List<ResourceModel> rewardList = new ArrayList();
      ActivityDecisiveBattleTaskPart decisiveBattleTaskPart = (ActivityDecisiveBattleTaskPart)this.player.getMgrPart(ActivityDecisiveBattleTaskPart.class);

      for(TaskData taskData : decisiveBattleTaskPart.getTasksMap().values()) {
         if (taskData != null && taskData.state == 2) {
            DecisiveBattleTaskRewardModel taskModel = (DecisiveBattleTaskRewardModel)ApplicationContextProvider.getModelPoolEntity("DecisiveBattleTaskReward", taskData.id);
            if (taskModel != null) {
               for(ResourceModel reward : taskModel.getRewards()) {
                  reward.addResourceToList(rewardList);
               }
            }
         }
      }

      if (!rewardList.isEmpty()) {
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         CentreAwardModel awardModel = this.getCentreAwardModel(CentreAwardModel.TYPE_DECISIVE_BATTLE_TASK_REWARD, 0L);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, awardModel.getTitle(), awardModel.getDesc(), rewardList, 604800000L, 127, 12701);
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "决战之巅", "未领取任务奖励-" + awardModel.getDesc(), "任务奖励-" + awardModel.getDesc(), 0, 0, 1);
      }

   }

   public void resetHour() {
      if (!this.isServerActivityInvalid()) {
         String limitMatchTime = this.configManager.getStrByDefault("DecisiveBattleOpenTime", "8|22");
         String[] matchTime = limitMatchTime.split("\\|");
         LocalDateTime nowDateTime = LocalDateTime.now();
         if (nowDateTime.getHour() == Integer.parseInt(matchTime[0]) || nowDateTime.getHour() == Integer.parseInt(matchTime[1])) {
            DecisiveBattleMsg.S2C_NotifyOpenRed_21847.Builder builder = DecisiveBattleMsg.S2C_NotifyOpenRed_21847.newBuilder();
            builder.setHour(nowDateTime.getHour());
            this.player.sendMsg(builder.build());
         }

      }
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         DecisiveBattleDao decisiveBattleDao = this.getDecisiveDao();
         if (decisiveBattleDao.myData.buyFightTimes != 0 || decisiveBattleDao.myData.fightTimes != 0) {
            decisiveBattleDao.myData.buyFightTimes = 0;
            decisiveBattleDao.myData.fightTimes = 0;
            decisiveBattleDao.updateOp();
         }

         if (this.getSeverActivityDay() != 1) {
            this.sendTaskAward();
            TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
            taskCustomCache.delete(TaskDefine.TaskModule.MODULE_DECISIVE_BATTLE_ACTIVITY);
            ActivityDecisiveBattleTaskPart decisiveBattleTaskPart = (ActivityDecisiveBattleTaskPart)this.player.getMgrPart(ActivityDecisiveBattleTaskPart.class);
            decisiveBattleTaskPart.trigger();
         }
      }
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         if (this.property_artifact_refine.isEmpty() || this.property_artifact_refine_add.isEmpty() || this.property_artifact_strong.isEmpty()) {
            this.initOtherProperty();
         }

         this.cancelBattleJob();
      }
   }

   public void logoutHandle() {
      if (!this.isServerActivityInvalid()) {
         this.checkAutoBattle();
         this.updateLastData(false);
      }
   }

   public void updateLastData(Boolean isClear) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      if (isClear) {
         decisiveDao.myData.lastPoint = 0;
         decisiveDao.myData.lastStep = 0;
      } else {
         decisiveDao.myData.lastPoint = decisiveDao.myData.point;
         decisiveDao.myData.lastStep = decisiveDao.myData.step;
      }

      decisiveDao.updateOp();
   }

   public void checkAutoBattle() {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      if (decisiveDao.myData.matchData != null) {
         int limitTime = this.configManager.getIntDefault("DecisiveBattleCountdown", 180);
         int leftTime = decisiveDao.myData.matchData.matchTime + limitTime - DateUtil.getIntTime(System.currentTimeMillis());
         if (leftTime > 0 && leftTime <= limitTime) {
            this.future = this.scheduleEx((long)(leftTime * 1000), "autoBattleJob", new Object[0]);
         } else {
            decisiveDao.myData.matchData = null;
         }
      }

   }

   @TaskMethod
   public void autoBattleJob() {
      if (this.player.isLogin()) {
         this.cancelBattleJob();
      } else {
         DecisiveBattleDao decisiveDao = this.getDecisiveDao();
         if (decisiveDao.myData.matchData == null) {
            this.cancelBattleJob();
         } else {
            logger.info("决战之巅离线自动战斗:{}", this.player.getPublicDao().playerId);
            this.cancelBattleJob();
            this.fight(false);
         }
      }
   }

   private void cancelBattleJob() {
      if (this.future != null) {
         this.future.cancel(false);
         this.future = null;
      }
   }

   public void resetData() {
      DecisiveBattleDao decisiveBattleDao = this.getDecisiveDao();
      decisiveBattleDao.heroMap.clear();
      decisiveBattleDao.tempHeroMap.clear();
      decisiveBattleDao.myData = new DecisivePlayerData();
      DecisiveBattleMainModel mainModel = this.getMainModel(1);
      if (mainModel != null) {
         decisiveBattleDao.myData.point = mainModel.getRankintegrallow();
      }

      decisiveBattleDao.record.clear();
      decisiveBattleDao.updateOp();
      this.property_artifact_refine.clear();
      this.property_artifact_refine_add.clear();
      this.property_artifact_strong.clear();
      this.friendProperty.clear();
   }

   public void rotateReset(int oldActivityId) {
      this.resetData();
      ActivityDecisiveBattleTaskPart decisiveBattleTaskPart = (ActivityDecisiveBattleTaskPart)this.player.getMgrPart(ActivityDecisiveBattleTaskPart.class);
      decisiveBattleTaskPart.trigger();
   }

   public void activityEnd(int oldActivityId) {
      this.sendTaskAward();
      ActivityDecisiveBattleTaskPart decisiveBattleTaskPart = (ActivityDecisiveBattleTaskPart)this.player.getMgrPart(ActivityDecisiveBattleTaskPart.class);

      for(TaskData taskData : decisiveBattleTaskPart.getTasksMap().values()) {
         taskData.delete();
      }

      this.sendStepAward();
   }

   public void addHeroRecord(DecisiveBattleDao decisiveDao, Boolean isWin, int step) {
      List<DecisiveRecordData> list = new ArrayList();

      for(DecisiveArraying decisiveArraying : decisiveDao.myData.arrayingMap.values()) {
         for(Integer heroCode : decisiveArraying.heroMap.values()) {
            DecisiveBattleHeroModel heroModel = (DecisiveBattleHeroModel)this.player.getGameModelPool().getEntity("DecisiveBattleHero", heroCode);
            DecisiveRecordData data = new DecisiveRecordData();
            data.heroId = heroModel.getHeroId();
            if (isWin) {
               data.winNum = 1L;
            } else {
               data.loseNum = 1L;
            }

            data.fightNum = 1L;
            list.add(data);
         }
      }

      if (!list.isEmpty()) {
         this.worldMgr.pushTaskEx("addDecisiveRecord", new Object[]{step, list});
      }

   }

   public void gm(String param) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      int op = Integer.parseInt(param.split(",")[0]);
      int value = Integer.parseInt(param.split(",")[1]);
      if (op == 1) {
         decisiveDao.myData.point = value;
         Map<Integer, DecisiveBattleMainModel> modelMap = this.player.getGameModelPool().getMap("DecisiveBattleMain");

         for(DecisiveBattleMainModel model : modelMap.values()) {
            if (model.getRankintegrallow() <= value && model.getRankintegralhigh() >= value) {
               decisiveDao.myData.step = model.getId();
               if (decisiveDao.myData.maxStep < decisiveDao.myData.step) {
                  decisiveDao.myData.maxStep = decisiveDao.myData.step;
               }
            }
         }

         this.checkArrayingByStep();
         this.notifySepChange(false, true, false, true, true);
         this.sycDataToCross(false);
      } else if (op == 2) {
         decisiveDao.saveHeroData();
         decisiveDao.myData.fightTimes = 0;
         decisiveDao.myData.buyFightTimes = 0;
         decisiveDao.updateOp();
      } else if (op == 3) {
         for(RankData rankData : this.rankMgr.getRanks(RankDefine.RankModule.COMBAT_POWER, value)) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankData.value);
            if (gamePlayer != null) {
               gamePlayer.pushPartTaskEx(DecisiveBattlePart.class, "sycDataToCross", new Object[]{false});
            }
         }
      } else if (op >= 4 && op <= 6) {
         DecisiveBattleMsg.S2S_GM_21899.Builder gm = DecisiveBattleMsg.S2S_GM_21899.newBuilder();
         gm.setOp(op);
         gm.setValue(value);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), gm.build());
      } else if (op == 13) {
         if (decisiveDao.myData.matchData != null) {
         }
      } else if (op == 14) {
         decisiveDao.heroMap.clear();
      } else if (op == 15) {
         this.resetData();
      } else if (op >= 999) {
         DecisiveBattleMsg.S2S_GM_21899.Builder gm = DecisiveBattleMsg.S2S_GM_21899.newBuilder();
         gm.setOp(op);
         gm.setValue(value);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), gm.build());
      }

      decisiveDao.updateOp();
   }

   public boolean checkSaveArraying(DecisiveBattleDao decisiveDao, int oldStep, int newStep) {
      int specialStep = this.configManager.getIntDefault("decisiveSpecialStep", 8);
      if (newStep == specialStep && oldStep < newStep) {
         this.changeTempArraying(decisiveDao);
         return true;
      } else {
         if (oldStep == specialStep && newStep < oldStep) {
            this.saveTempArraying(decisiveDao);
         }

         return false;
      }
   }

   public void saveTempArraying(DecisiveBattleDao decisiveDao) {
      decisiveDao.myData.tempArrayingMap.clear();
      decisiveDao.tempHeroMap.clear();

      for(Map.Entry<CommonMsg.HeroState, DecisiveArraying> entry : decisiveDao.myData.arrayingMap.entrySet()) {
         Map<Integer, Integer> heroMap = new HashMap();

         for(Map.Entry<Integer, Integer> heroEntry : ((DecisiveArraying)entry.getValue()).heroMap.entrySet()) {
            heroMap.put(heroEntry.getKey(), heroEntry.getValue());
            if (decisiveDao.heroMap.containsKey(heroEntry.getValue())) {
               DecisiveHeroInfo heroInfo = (DecisiveHeroInfo)decisiveDao.heroMap.get(heroEntry.getValue());
               DecisiveHeroInfo saveInfo = new DecisiveHeroInfo();

               for(Map.Entry<CommonMsg.WearPosition, Integer> warcraft : heroInfo.warcraftMap.entrySet()) {
                  saveInfo.warcraftMap.put(warcraft.getKey(), warcraft.getValue());
               }

               for(Map.Entry<Integer, Integer> talent : heroInfo.talent.entrySet()) {
                  saveInfo.talent.put(talent.getKey(), talent.getValue());
               }

               for(Map.Entry<CommonMsg.WearPosition, DecisiveWarriorSinet> signet : heroInfo.warriorSignetMap.entrySet()) {
                  DecisiveWarriorSinet warriorSinet = new DecisiveWarriorSinet();
                  warriorSinet.id = ((DecisiveWarriorSinet)signet.getValue()).id;
                  warriorSinet.properties.addAll(((DecisiveWarriorSinet)signet.getValue()).properties);
                  warriorSinet.score = ((DecisiveWarriorSinet)signet.getValue()).score;
                  warriorSinet.skills.addAll(((DecisiveWarriorSinet)signet.getValue()).skills);
                  saveInfo.warriorSignetMap.put(signet.getKey(), warriorSinet);
               }

               decisiveDao.tempHeroMap.put(heroEntry.getValue(), saveInfo);
            }
         }

         decisiveDao.myData.tempArrayingMap.put(entry.getKey(), heroMap);
      }

      decisiveDao.updateOp();
   }

   public void changeTempArraying(DecisiveBattleDao decisiveDao) {
      for(Map.Entry<Integer, DecisiveHeroInfo> entry : decisiveDao.tempHeroMap.entrySet()) {
         if (decisiveDao.heroMap.containsKey(entry.getKey())) {
            DecisiveHeroInfo heroInfo = (DecisiveHeroInfo)decisiveDao.heroMap.get(entry.getKey());
            heroInfo.talent.clear();
            heroInfo.talent.putAll(((DecisiveHeroInfo)entry.getValue()).talent);
            heroInfo.warcraftMap.clear();
            heroInfo.warcraftMap.putAll(((DecisiveHeroInfo)entry.getValue()).warcraftMap);
            heroInfo.warriorSignetMap.clear();
            heroInfo.warriorSignetMap.putAll(((DecisiveHeroInfo)entry.getValue()).warriorSignetMap);
         }
      }

      for(Map.Entry<CommonMsg.HeroState, Map<Integer, Integer>> entry : decisiveDao.myData.tempArrayingMap.entrySet()) {
         if (decisiveDao.myData.arrayingMap.containsKey(entry.getKey()) && !((Map)entry.getValue()).isEmpty()) {
            DecisiveArraying arraying = (DecisiveArraying)decisiveDao.myData.arrayingMap.get(entry.getKey());
            arraying.heroMap.clear();
            arraying.heroMap.putAll((Map)entry.getValue());
         }
      }

      decisiveDao.updateOp();
   }

   public void notifySepChange(Boolean isBattleEnd, Boolean stepChange, Boolean flag, Boolean attack, boolean sendArraying) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      if (this.property_artifact_refine.isEmpty() || this.property_artifact_refine_add.isEmpty() || this.property_artifact_strong.isEmpty()) {
         this.initOtherProperty();
      }

      if (stepChange) {
         this.initOtherProperty();
         decisiveDao.updateOp();
      }

      this.sycDataToCross(isBattleEnd);
      if (this.player.isLogin()) {
         DecisiveBattleMsg.S2C_NotifyStepChange_21839.Builder builder = DecisiveBattleMsg.S2C_NotifyStepChange_21839.newBuilder();
         builder.setStep(decisiveDao.myData.step);
         builder.setPoint(decisiveDao.myData.point);
         builder.addAllStepAward(decisiveDao.myData.receiveStepAward);
         builder.setIsAttack(attack);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         if (flag) {
            DecisiveBattleMsg.S2C_NotifyClearMatchData_21845.Builder notifyBuilder = DecisiveBattleMsg.S2C_NotifyClearMatchData_21845.newBuilder();
            notifyBuilder.setFightTimes(decisiveDao.myData.fightTimes);
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), notifyBuilder.build());
         }

         if (sendArraying) {
            this.sendArraying();
         }
      }

   }

   public void initOtherProperty() {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      DecisiveBattleMainModel mainModel = this.getMainModel(decisiveDao.myData.step);
      if (mainModel != null) {
         this.property_artifact_refine = (List)this.getRefineProperties(mainModel.getArtifactRefineLevel()).get(1);
         this.property_artifact_refine_add = (List)this.getRefineProperties(mainModel.getArtifactRefineLevel()).get(2);
         this.property_artifact_strong = this.getArtifactLvProperties(mainModel.getArtifactLevel());
         this.flushFriendHero();
      }
   }

   public void flushFriendHero() {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      this.friendProperty.clear();

      for(Map.Entry<CommonMsg.HeroState, DecisiveArraying> entry : decisiveDao.myData.arrayingMap.entrySet()) {
         Map<Integer, Map<Integer, List<PropertyModel>>> temp_property = new HashMap();

         for(Map.Entry<Integer, Integer> heroEntry : ((DecisiveArraying)entry.getValue()).heroMap.entrySet()) {
            if ((Integer)heroEntry.getKey() == 5) {
               DecisiveHeroInfo heroInfo = this.getHeroInfoByCode((Integer)heroEntry.getValue(), false);
               int star = this.getStarMax((Integer)heroEntry.getValue(), this.getDecisiveDao().myData.step);
               HeroDao friendDao = heroInfo.getHeroDao((Integer)heroEntry.getValue(), this.getHeroLv(star), star, this.player.getPlayerId());
               if (friendDao != null) {
                  friendDao.doFlushTotalPropertiesForDecisiveBattle((Integer)heroEntry.getValue());
                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", friendDao.id);
                  if (heroModel == null) {
                     break;
                  }

                  int friendJob = heroModel.getType();
                  if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING && ((DecisiveArraying)entry.getValue()).friendJob > 0) {
                     friendJob = ((DecisiveArraying)entry.getValue()).friendJob;
                  }

                  int key = friendJob * 100 + friendDao.getStar();
                  SupportHeroModel supportHeroModel = (SupportHeroModel)this.player.getGameModelPool().getEntity("supportHero", key);
                  if (supportHeroModel == null || !friendDao.totalFightProperties.containsKey(supportHeroModel.getAddpro())) {
                     break;
                  }

                  long val = (Long)friendDao.totalFightProperties.get(supportHeroModel.getAddpro()) * (long)supportHeroModel.getAddper() / 10000L;

                  for(int i = 1; i <= 5; ++i) {
                     Map<Integer, List<PropertyModel>> tempMap = new HashMap();

                     for(int j = 1; j <= 4; ++j) {
                        List<PropertyModel> list = new ArrayList();
                        list.add(new PropertyModel(supportHeroModel.getAddpro(), 0, val));
                        tempMap.put(j, list);
                     }

                     temp_property.put(i, tempMap);
                  }
                  break;
               }
            }
         }

         this.friendProperty.put(entry.getKey(), temp_property);
      }

   }

   public List<PropertyModel> getProperty_friend(int nation, int type, int code) {
      DecisiveBattleDao decisiveDao = this.getDecisiveDao();
      if (nation == 10 && decisiveDao.heroMap.containsKey(code)) {
         nation = ((DecisiveHeroInfo)decisiveDao.heroMap.get(code)).inheritNation;
      }

      List<PropertyModel> tempList = new ArrayList();
      Boolean flag = false;
      CommonMsg.HeroState arrayingType = null;

      for(Map.Entry<CommonMsg.HeroState, DecisiveArraying> entry : decisiveDao.myData.arrayingMap.entrySet()) {
         for(Map.Entry<Integer, Integer> heroEntry : ((DecisiveArraying)entry.getValue()).heroMap.entrySet()) {
            if ((Integer)heroEntry.getKey() < 5 && (Integer)heroEntry.getValue() == code) {
               arrayingType = (CommonMsg.HeroState)entry.getKey();
               flag = true;
               break;
            }
         }
      }

      if (flag && arrayingType != null && this.friendProperty.containsKey(arrayingType) && ((Map)this.friendProperty.get(arrayingType)).containsKey(nation)) {
         Map<Integer, List<PropertyModel>> map = (Map)((Map)this.friendProperty.get(arrayingType)).get(nation);
         if (map != null && map.containsKey(type)) {
            tempList = (List)map.get(type);
            return tempList;
         }
      }

      return tempList;
   }

   public Map<Integer, List<PropertyModel>> getRefineProperties(int refineLv) {
      Map<Integer, List<PropertyModel>> resultMap = new HashMap();
      List<PropertyModel> commonList = new ArrayList();
      List<PropertyModel> addList = new ArrayList();

      for(int i = 0; i < refineLv; ++i) {
         ArtifactRefineModel artifactRefineModel = (ArtifactRefineModel)this.player.getGameModelPool().getEntity("artifactRefine", i);
         if (artifactRefineModel != null) {
            for(PropertyModel property : artifactRefineModel.getPropertys()) {
               PropertyModel propertyModel = new PropertyModel(property.getType(), property.getWay(), property.getValue());
               PropertyModel.addLvProtities(commonList, propertyModel);
            }

            for(PropertyModel addProperty : artifactRefineModel.getAddPropertys()) {
               PropertyModel propertyModel = new PropertyModel(addProperty.getType(), addProperty.getWay(), addProperty.getValue());
               PropertyModel.addLvProtities(addList, propertyModel);
            }
         }
      }

      resultMap.put(1, commonList);
      resultMap.put(2, addList);
      return resultMap;
   }

   public List<PropertyModel> getArtifactLvProperties(int strongLv) {
      List<PropertyModel> resultList = new ArrayList();
      int baseHp = this.configManager.getInt("artifactBaseHp");
      int baseAttack = this.configManager.getInt("artifactBaseAttack");
      float totalAtt = (float)baseAttack;
      float totalHp = (float)baseHp;

      for(int i = 0; i < strongLv; ++i) {
         ArtifactStrongModel artifactStrongModel = (ArtifactStrongModel)this.player.getGameModelPool().getEntity("artifactStrong", i);
         if (artifactStrongModel == null) {
            logger.error("神兵强化等级错误：{}", i);
         } else {
            totalAtt += (float)artifactStrongModel.getExp() * artifactStrongModel.getExpAtk();
            totalHp += (float)artifactStrongModel.getExp() * artifactStrongModel.getExpHp();
            totalAtt += (float)artifactStrongModel.getRewardAtk();
            totalHp += (float)artifactStrongModel.getRewardHp();
         }
      }

      PropertyModel attPropertyModel = new PropertyModel(2, 0, (long)Float.valueOf(totalAtt).intValue());
      PropertyModel hpPropertyModel = new PropertyModel(1, 0, (long)Float.valueOf(totalHp).intValue());
      resultList.add(attPropertyModel);
      resultList.add(hpPropertyModel);
      return resultList;
   }

   public List<PropertyModel> getProperty_artifact_strong() {
      return this.property_artifact_strong;
   }

   public List<PropertyModel> getProperty_artifact_refine() {
      return this.property_artifact_refine;
   }

   public List<PropertyModel> getProperty_artifact_refine_add() {
      return this.property_artifact_refine_add;
   }
}
