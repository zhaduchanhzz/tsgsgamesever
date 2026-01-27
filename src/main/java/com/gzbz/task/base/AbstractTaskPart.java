package com.gzbz.task.base;

import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.db.ArtifactDao;
import com.gzbz.db.BattleChapterDao;
import com.gzbz.db.BattleCutHeroDao;
import com.gzbz.db.BattleTowerDao;
import com.gzbz.db.DivineGeneralsDao;
import com.gzbz.db.FriendDao;
import com.gzbz.db.HeroCardDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.WarHLDao;
import com.gzbz.db.bean.MonthlyCardData;
import com.gzbz.db.bean.TaskData;
import com.gzbz.dragon.DragonDiscipleExtend;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.battle.UnderPalacePart;
import com.gzbz.gamePlayer.playerBag.ArtifactPart;
import com.gzbz.gamePlayer.pvp.PvpSeasonMgr;
import com.gzbz.godBeast.part.GodBeastPart;
import com.gzbz.model.ArcherySignAwardModel;
import com.gzbz.model.ArcheryTaskModel;
import com.gzbz.model.ArtifactDressTaskModel;
import com.gzbz.model.ArtifactTaskModel;
import com.gzbz.model.ChapterTaskModel;
import com.gzbz.model.ChapterUpStarTaskModel;
import com.gzbz.model.ChatBubbleModel;
import com.gzbz.model.ChiBiTaskModel;
import com.gzbz.model.DemonStrikesTaskModel;
import com.gzbz.model.DragonBoatTaskModel;
import com.gzbz.model.EastWarTaskModel;
import com.gzbz.model.EventHeroCallTaskModel;
import com.gzbz.model.GreenPlumTaskModel;
import com.gzbz.model.HandBookTaskModel;
import com.gzbz.model.HeroIntroduceTaskModel;
import com.gzbz.model.HeroMailTaskModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.LuckyDrawModel;
import com.gzbz.model.MagicTaskModel;
import com.gzbz.model.PrestigeTaskModel;
import com.gzbz.model.RecommendModel;
import com.gzbz.model.SevenDaysActivityModel;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.SkinActivityTaskModel;
import com.gzbz.model.SpringPrayersModel;
import com.gzbz.model.TaskModel;
import com.gzbz.model.TongQueActivityTaskModel;
import com.gzbz.model.TongQueActivityTaskNewModel;
import com.gzbz.model.UnionTaskModel;
import com.gzbz.model.UnionWarTaskModel;
import com.gzbz.model.WarriorSignetSkillModel;
import com.gzbz.model.WuDaoTaskModel;
import com.gzbz.model.ZhuHouEquipModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import org.springframework.util.StringUtils;

public abstract class AbstractTaskPart extends PlayerPart {
   public abstract void trigger();

   public abstract void commit(int taskId);

   public abstract void sendTaskList(List<TaskData> taskDataList);

   protected abstract GeneratedMessageV3 buildTask(TaskData taskData);

   public abstract TaskDefine.TaskModule getModule();

   protected abstract void sendCommitTaskResult(int taskId, long completeTime);

   public abstract TaskTargetItem getTargetItem(int taskId);

   public TaskData getTask(int taskId) {
      return this.player.getTask(this.getModule(), taskId);
   }

   public Map<Integer, TaskData> getTasksMap() {
      return this.player.getTasksMap(this.getModule());
   }

   public TaskData createTask(int taskId) {
      PlayerDao playerDao = this.player.getPlayerDao();
      if (!PlayerDefine.ACCOUNT_TYPE_PLAYER_LIST.contains(playerDao.type)) {
         return null;
      } else {
         TaskTargetItem taskTargetItem = this.getTargetItem(taskId);
         if (this.getModule() != null && taskId > 0 && taskTargetItem != null && taskTargetItem.getTargetType() != 0 && taskTargetItem.getTargetValue() != 0) {
            if (this.getTasksMap().containsKey(taskId)) {
               return null;
            } else {
               TaskData taskData = new TaskData();
               taskData.id = taskId;
               taskData.tVal = 0;
               taskData.module = this.getModule().moduleId;
               taskData.player = this.player.getPlayerId();
               taskData.create();
               if (playerDao.lv > 1) {
               }

               this.initTaskProcess(taskData);
               return taskData;
            }
         } else {
            this.logger.error("{}创建{}模块{}任务失败,任务目标type:{},目标id:{},目标val:{}", new Object[]{this.player.getPlayerId(), this.getModule(), taskId, taskTargetItem == null ? 0 : taskTargetItem.getTargetType(), taskTargetItem == null ? 0 : taskTargetItem.getTargetId(), taskTargetItem == null ? 0 : taskTargetItem.getTargetValue()});
            return null;
         }
      }
   }

   public void resetTask(TaskData taskData) {
      taskData.state = (byte)CommonMsg.TaskState.STATE_DOING.getNumber();
      taskData.tVal = 0;
      taskData.updateOp();
      this.initTaskProcess(taskData);
   }

   public boolean checkComplete(TaskData taskData) {
      TaskTargetItem target = this.getTargetItem(taskData.id);
      if (target == null) {
         return false;
      } else if (taskData.tVal < target.getTargetValue()) {
         return false;
      } else {
         taskData.complete();
         if (taskData.module == TaskDefine.TaskModule.MODULE_PRESTIGET.moduleId) {
            this.commit(taskData.id);
         } else if (target.getTargetType() != 526 && target.getTargetType() != 605) {
            if (target.getTargetType() == 520) {
               this.commit(taskData.id);
            }
         } else {
            taskData.finish();
            this.addTaskLog(1203, taskData.id);
         }

         return true;
      }
   }

   public boolean checkCommit(int taskId) {
      TaskData taskData = this.getTask(taskId);
      if (taskData == null) {
         this.logger.error("任务模块{},提交任务{}数据不存在", this.getModule(), taskId);
         return false;
      } else {
         int state = taskData.state;
         if (state != CommonMsg.TaskState.STATE_COMPLETE.getNumber()) {
            this.logger.error("任务模块{},提交任务{}状态错误,当前状态:{}", new Object[]{this.getModule(), taskId, state});
            return false;
         } else {
            this.addTaskLog(1203, taskData.id);
            return true;
         }
      }
   }

   private String getTaskName(int taskId) {
      String taskName = "-";

      try {
         switch (this.getModule()) {
            case MODULE_ARTIFACT:
               ArtifactTaskModel artifactTaskModel = (ArtifactTaskModel)ApplicationContextProvider.getModelPoolEntity("artifactTask", taskId);
               taskName = artifactTaskModel.getTaskDesc();
               break;
            case MODULE_DRESS:
               ArtifactDressTaskModel artifactDressTaskModel = (ArtifactDressTaskModel)ApplicationContextProvider.getModelPoolEntity("artifactDressTask", taskId);
               taskName = artifactDressTaskModel.getTaskDesc();
               break;
            case MODULE_UNION:
               UnionTaskModel unionTaskModel = (UnionTaskModel)ApplicationContextProvider.getModelPoolEntity("unionTask", taskId);
               taskName = unionTaskModel.getTaskDesc();
               break;
            case MODULE_ACTIVITY_SEVEN:
            case MODULE_SPRING_FESTIVAL:
            case MODULE_ARTIFACT_ACTIVITY:
            case MODULE_WO_LONG:
            case MODULE_MID_AUTUMN:
            case MODULE_ACTIVITY_SPECIAL:
            case MODULE_SPRING_ENJOY_ILLUSTRATION:
            case MODULE_ZZRZ:
            case MODULE_XDMZ:
            case MODULE_QRYW:
            case MODULE_KITTY_ILLUSTRATION:
            case MODULE_LI_YU_ROTATE:
            case MODULE_ACT_THANKSGIVING:
            case MODULE_ARTIFACT_ROTATE_ACTIVITY:
            case MODULE_ARTIFACT_SKIN_ACTIVITY:
               SevenDaysTaskModel sevenDaysTaskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskId);
               taskName = sevenDaysTaskModel.getTaskDesc();
               break;
            case MODULE_UNION_WAR:
               UnionWarTaskModel unionWarTaskModel = (UnionWarTaskModel)ApplicationContextProvider.getModelPoolEntity("unionWarTask", taskId);
               taskName = unionWarTaskModel.getTaskDesc();
               break;
            case MODULE_COMMON:
            case MODULE_ACTIVITY_HERO_RAISE:
               TaskModel taskModel = (TaskModel)ApplicationContextProvider.getModelPoolEntity("task", taskId);
               taskName = taskModel.getTaskDesc();
               break;
            case MODULE_RECOMMEND:
               RecommendModel recommendModel = (RecommendModel)ApplicationContextProvider.getModelPoolEntity("recommend", taskId);
               taskName = recommendModel.getTaskDesc();
               break;
            case MODULE_MAGIC:
               MagicTaskModel magicTaskModel = (MagicTaskModel)ApplicationContextProvider.getModelPoolEntity("Mystictask", taskId);
               taskName = magicTaskModel.getTaskDesc();
               break;
            case MODULE_CHAPTER_UP_STAR:
               ChapterUpStarTaskModel chapterUpStarTaskModel = (ChapterUpStarTaskModel)ApplicationContextProvider.getModelPoolEntity("chapterUpStarTask", taskId);
               taskName = chapterUpStarTaskModel.getTaskDesc();
               break;
            case MODULE_TONG_QUE_PARK:
               TongQueActivityTaskModel tongQueActivityTaskModel = (TongQueActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("TongQueActivityTask", taskId);
               taskName = tongQueActivityTaskModel.getTaskDesc();
               break;
            case MODULE_TONG_QUE_ROTATE:
               TongQueActivityTaskNewModel tongQueActivityTaskNewModel = (TongQueActivityTaskNewModel)ApplicationContextProvider.getModelPoolEntity("TongQueActivityTaskNew", taskId);
               taskName = tongQueActivityTaskNewModel.getTaskDesc();
               break;
            case MODULE_CHI_BI:
               ChiBiTaskModel chiBiTaskModel = (ChiBiTaskModel)ApplicationContextProvider.getModelPoolEntity("chiBiTask", taskId);
               taskName = chiBiTaskModel.getTaskDesc();
               break;
            case MODULE_HAND_BOOK:
               HandBookTaskModel handBookTaskModel = (HandBookTaskModel)ApplicationContextProvider.getModelPoolEntity("handbooktask", taskId);
               taskName = handBookTaskModel.getTaskdesc();
               break;
            case MODULE_CHAPTER_SECTION:
               ChapterTaskModel chapterTaskModel = (ChapterTaskModel)ApplicationContextProvider.getModelPoolEntity("chaptertask", taskId);
               taskName = chapterTaskModel.getTaskdesc();
               break;
            case MODULE_LUCK_DRAW:
               LuckyDrawModel luckyDrawModel = (LuckyDrawModel)ApplicationContextProvider.getModelPoolEntity("luckyDraw", taskId);
               taskName = luckyDrawModel.getTaskName();
               break;
            case MODULE_SPRING_ENJOY_PRAY:
            case MODULE_DRAGON_BOAT_PRAY_TASK:
            case MODULE_KITTY_PRAY:
               SpringPrayersModel springPrayersModel = (SpringPrayersModel)ApplicationContextProvider.getModelPoolEntity("springprayers", taskId);
               taskName = springPrayersModel.getTaskName();
               break;
            case MODULE_HERO_THEME:
               EventHeroCallTaskModel eventHeroCallTaskModel = (EventHeroCallTaskModel)ApplicationContextProvider.getModelPoolEntity("eventHeroCallTask", taskId);
               taskName = eventHeroCallTaskModel.getTaskDesc();
               break;
            case MODULE_PRESTIGET:
               PrestigeTaskModel prestigeTaskModel = (PrestigeTaskModel)ApplicationContextProvider.getModelPoolEntity("prestigetask", taskId);
               taskName = prestigeTaskModel.getTaskDesc();
               break;
            case MODULE_GREEN_PLUM_ACTIVITY:
               GreenPlumTaskModel greenPlumTaskModel = (GreenPlumTaskModel)ApplicationContextProvider.getModelPoolEntity("greenPlumTask", taskId);
               taskName = greenPlumTaskModel.getTaskDesc();
               break;
            case MODULE_SKIN_ACTIVITY_TASK:
               SkinActivityTaskModel skinActivityTaskModel = (SkinActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("skinActivityTask", taskId);
               taskName = skinActivityTaskModel.getTaskDesc();
               break;
            case MODULE_HERO_MAIL_TASK:
               HeroMailTaskModel heroMailTaskModel = (HeroMailTaskModel)ApplicationContextProvider.getModelPoolEntity("heromailtask", taskId);
               taskName = heroMailTaskModel.getTaskDesc();
               break;
            case MODULE_DRAGON_BOAT_TASK:
               DragonBoatTaskModel dragonBoatTaskModel = (DragonBoatTaskModel)ApplicationContextProvider.getModelPoolEntity("dragonBoatTask", taskId);
               taskName = dragonBoatTaskModel.getTaskDesc();
               break;
            case MODULE_DEMON_STRIKES:
               DemonStrikesTaskModel demonStrikesTaskModel = (DemonStrikesTaskModel)ApplicationContextProvider.getModelPoolEntity("demonWarTask", taskId);
               taskName = demonStrikesTaskModel.getTaskDesc();
               break;
            case MODULE_HERO_INTRODUCE_TASK:
               HeroIntroduceTaskModel heroIntroduceTaskModel = (HeroIntroduceTaskModel)ApplicationContextProvider.getModelPoolEntity("herointroducetask", taskId);
               taskName = heroIntroduceTaskModel.getTaskDesc();
               break;
            case MODULE_TONG_QUE_ARCHERY_DAILY:
               ArcheryTaskModel archeryTaskModel = (ArcheryTaskModel)ApplicationContextProvider.getModelPoolEntity("archeryTask", taskId);
               taskName = archeryTaskModel.getTaskDesc();
               break;
            case MODULE_TONG_QUE_ARCHERY_PRAY:
               ArcherySignAwardModel archerySignAwardModel = (ArcherySignAwardModel)ApplicationContextProvider.getModelPoolEntity("archerySignAward", taskId);
               taskName = archerySignAwardModel.getTaskName();
               break;
            case MODULE_CHAT_BUBBLE:
               ChatBubbleModel chatBubbleModel = (ChatBubbleModel)ApplicationContextProvider.getModelPoolEntity("chatBubble", taskId);
               taskName = chatBubbleModel.getCondition();
               break;
            case MODULE_EAST_WAR:
               EastWarTaskModel eastWarTaskModel = (EastWarTaskModel)ApplicationContextProvider.getModelPoolEntity("eastWarTask", taskId);
               taskName = eastWarTaskModel.getTaskDesc();
               break;
            case MODULE_DUEL:
               WuDaoTaskModel wuDaoTaskModel = (WuDaoTaskModel)ApplicationContextProvider.getModelPoolEntity("wudaoTask", taskId);
               taskName = wuDaoTaskModel.getTaskDesc();
         }
      } catch (Exception var32) {
         this.logger.error("获取模块【{}】任务【{}】描述错误", this.getModule().moduleName, taskId);
      }

      if (StringUtils.isEmpty(taskName)) {
         taskName = "-";
      }

      return taskName;
   }

   protected void addTaskLog(int logId, int taskId) {
      String taskName = this.getTaskName(taskId);
      this.player.getOperationMgr().addTaskNewLog(this.player, logId, taskId, this.getModule().moduleName, taskName, "-", "-");
   }

   public void initTaskProcess(TaskData taskData) {
      TaskTargetItem taskTargetItem = this.getTargetItem(taskData.id);
      PlayerDao playerDao = this.player.getPlayerDao();
      if (taskTargetItem != null) {
         long opValue = -1L;
         int opType = 0;
         switch (taskTargetItem.getTargetType()) {
            case 101:
               if (taskData.tVal == 0) {
                  opValue = 1L;
               }
               break;
            case 201:
               opValue = (long)playerDao.lv;
               break;
            case 202:
               if (playerDao.unionId > 0) {
                  opValue = 1L;
               }
               break;
            case 204:
               Map<Integer, HeroDao> heroDaoMap204 = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
               opValue = 0L;

               for(HeroDao heroDao : heroDaoMap204.values()) {
                  if (heroDao.type != HeroDefine.HERO_SP_TYPE_LINK && heroDao.invalidTime <= 0 && heroDao.getLv() >= taskTargetItem.getTargetId()) {
                     ++opValue;
                  }
               }
               break;
            case 206:
               BattleCutHeroDao battleCutHeroDao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
               int lastPassId = battleCutHeroDao.getLastPassId();
               if (lastPassId > 0) {
                  opValue = (long)(battleCutHeroDao.getLastPassId() % 100);
               }
               break;
            case 208:
               PvpSeasonMgr pvpSeasonMgr = (PvpSeasonMgr)ApplicationContextProvider.getContext().getBean(PvpSeasonMgr.class);
               opValue = (long)pvpSeasonMgr.getPvpScore(this.player.getPlayerId());
               break;
            case 216:
               opValue = this.player.getPlayerCombatPower();
               break;
            case 217:
               RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
               opValue = (long)rankPart.getRank(RankDefine.RankModule.PVP);
               opType = -1;
               break;
            case 308:
               BattleTowerDao towerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
               opValue = (long)towerDao.towerId;
               break;
            case 316:
               WarHLDao warHLDao = (WarHLDao)this.player.getData("tb_war_hl", this.player.getPlayerId());
               opValue = (long)warHLDao.curFloor;
               break;
            case 325:
               int value325 = 0;
               Map<Integer, HeroDao> heroDaoMap325 = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());

               for(HeroDao heroDao : heroDaoMap325.values()) {
                  for(Integer warcraft : heroDao.warcrafts.values()) {
                     WarriorSignetSkillModel model = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", warcraft);
                     if (model != null && model.getLv() == taskTargetItem.getTargetId()) {
                        ++value325;
                     }
                  }
               }

               if (value325 > taskData.tVal) {
                  opValue = (long)value325;
               }
               break;
            case 332:
               PlayerRechargeDao playerRechargeDao332 = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
               opValue = playerRechargeDao332.totalRechargeGold;
               break;
            case 334:
               Map<Integer, HeroDao> heroDaoMap334 = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
               opValue = 0L;

               for(HeroDao heroDao : heroDaoMap334.values()) {
                  if (heroDao.type != HeroDefine.HERO_SP_TYPE_PALACE && heroDao.type != HeroDefine.HERO_SP_TYPE_LINK && heroDao.invalidTime <= 0) {
                     HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
                     if (heroModel != null && heroDao.getStar() >= taskTargetItem.getTargetId() && heroModel.getNation() == 5) {
                        ++opValue;
                     }
                  }
               }
               break;
            case 335:
               Map<Integer, HeroDao> heroDaoMap335 = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
               opValue = 0L;

               for(HeroDao heroDao : heroDaoMap335.values()) {
                  if (heroDao.type != HeroDefine.HERO_SP_TYPE_PALACE && heroDao.type != HeroDefine.HERO_SP_TYPE_LINK && heroDao.invalidTime <= 0) {
                     HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
                     if (heroModel != null && heroDao.getStar() >= taskTargetItem.getTargetId() && heroModel.getNation() == 4) {
                        ++opValue;
                     }
                  }
               }
               break;
            case 336:
               Map<Integer, HeroDao> heroDaoMap336 = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
               opValue = 0L;

               for(HeroDao heroDao : heroDaoMap336.values()) {
                  if (heroDao.type != HeroDefine.HERO_SP_TYPE_PALACE && heroDao.type != HeroDefine.HERO_SP_TYPE_LINK && heroDao.invalidTime <= 0) {
                     HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
                     if (heroModel != null && heroDao.getStar() >= taskTargetItem.getTargetId() && heroModel.getNation() == 1) {
                        ++opValue;
                     }
                  }
               }
               break;
            case 337:
               Map<Integer, HeroDao> heroDaoMap337 = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
               opValue = 0L;

               for(HeroDao heroDao : heroDaoMap337.values()) {
                  if (heroDao.type != HeroDefine.HERO_SP_TYPE_PALACE && heroDao.type != HeroDefine.HERO_SP_TYPE_LINK && heroDao.invalidTime <= 0) {
                     HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
                     if (heroModel != null && heroDao.getStar() >= taskTargetItem.getTargetId() && heroModel.getNation() == 2) {
                        ++opValue;
                     }
                  }
               }
               break;
            case 338:
               Map<Integer, HeroDao> heroDaoMap338 = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
               opValue = 0L;

               for(HeroDao heroDao : heroDaoMap338.values()) {
                  if (heroDao.type != HeroDefine.HERO_SP_TYPE_PALACE && heroDao.type != HeroDefine.HERO_SP_TYPE_LINK && heroDao.invalidTime <= 0) {
                     HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
                     if (heroModel != null && heroDao.getStar() >= taskTargetItem.getTargetId() && heroModel.getNation() == 3) {
                        ++opValue;
                     }
                  }
               }
               break;
            case 340:
               Map<Integer, HeroDao> heroDaoMap340 = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
               opValue = 0L;

               for(HeroDao heroDao : heroDaoMap340.values()) {
                  if (heroDao.type != HeroDefine.HERO_SP_TYPE_PALACE && heroDao.type != HeroDefine.HERO_SP_TYPE_LINK && heroDao.invalidTime <= 0 && heroDao.getStar() >= taskTargetItem.getTargetId()) {
                     ++opValue;
                  }
               }
               break;
            case 343:
               FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
               opValue = (long)friendDao.friends.size();
               break;
            case 364:
               DivineGeneralsDao generalsDao = (DivineGeneralsDao)this.player.getData("tb_divine_generals", this.player.getPlayerId());
               opValue = (long)generalsDao.infoMap.size();
               break;
            case 377:
               if (taskData.tVal == 0) {
                  opValue = (long)playerDao.active;
               }
               break;
            case 401:
               BattleChapterDao chapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
               opValue = (long)chapterDao.chapterId;
               break;
            case 510:
               if (DateUtil.isSameDay(playerDao.updateTime)) {
                  PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
                  opValue = (long)playerRechargeDao.dailyRecharge;
               }
               break;
            case 525:
               PlayerRechargeDao playerRechargeDao525 = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
               opValue = (long)playerRechargeDao525.totalRecharge;
               break;
            case 526:
               PlayerActivityDao playerActivityDao526 = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
               if (!playerActivityDao526.sevenDaysRewards().isEmpty()) {
                  label287:
                  for(int day : playerActivityDao526.sevenDaysRewards()) {
                     SevenDaysActivityModel model = (SevenDaysActivityModel)this.player.getGameModelPool().getEntity("sevenDaysActivity", day);
                     if (!model.getLoginItems().isEmpty()) {
                        for(ResourceModel resourceModel : model.getLoginItems()) {
                           if (resourceModel.getType() == 2 && resourceModel.getId() == taskTargetItem.getTargetId()) {
                              opValue = 1L;
                              break label287;
                           }
                        }
                     }
                  }
               }
               break;
            case 527:
               PlayerRechargeDao playerRechargeDao527 = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
               if (!playerRechargeDao527.monthlyCard.isEmpty()) {
                  for(MonthlyCardData cardData : playerRechargeDao527.monthlyCard.values()) {
                     if (cardData.type == 2 && cardData.isActivate) {
                        opValue = 1L;
                        break;
                     }
                  }
               }
               break;
            case 529:
               ArtifactPart artifactPart = (ArtifactPart)this.player.getMgrPart(ArtifactPart.class);
               ArtifactDao artifactDao = artifactPart.getArtifactDao();
               if (artifactDao != null) {
                  opValue = (long)artifactDao.strongLv;
               }
               break;
            case 540:
               Map<Integer, HeroDao> heroDaoMap540 = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
               opValue = 0L;

               for(HeroDao heroDao : heroDaoMap540.values()) {
                  if (heroDao.type != HeroDefine.HERO_SP_TYPE_LINK && heroDao.invalidTime <= 0 && heroDao.id == taskTargetItem.getTargetId() && heroDao.getStar() >= taskTargetItem.getTargetValue()) {
                     ++opValue;
                  }
               }
               break;
            case 541:
               DragonDiscipleExtend dragonDiscipleExtend541 = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
               opValue = (long)dragonDiscipleExtend541.breachLv;
               break;
            case 542:
               DragonDiscipleExtend dragonDiscipleExtend542 = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
               if (dragonDiscipleExtend542.breachLv > 0) {
                  if (dragonDiscipleExtend542.passed) {
                     opValue = (long)dragonDiscipleExtend542.breachLv;
                  } else {
                     opValue = (long)(dragonDiscipleExtend542.breachLv - 1);
                  }
               }
               break;
            case 616:
               UnderPalacePart underPalacePart = (UnderPalacePart)this.player.getMgrPart(UnderPalacePart.class);
               opValue = (long)underPalacePart.getStageSum();
               break;
            case 733:
               GodBeastPart godBeastPart = (GodBeastPart)this.player.getMgrPart(GodBeastPart.class);
               if (godBeastPart.checkNoticeAllUnlock()) {
                  opValue = 1L;
               }
               break;
            case 761:
               HeroCardDao heroCardDao1 = (HeroCardDao)this.player.getData("tb_hero_card", this.player.getPlayerId());
               opValue = (long)heroCardDao1.getCurBoxLv();
               break;
            case 762:
               HeroCardDao heroCardDao2 = (HeroCardDao)this.player.getData("tb_hero_card", this.player.getPlayerId());
               opValue = 0L;

               for(HeroCardDao.EquipData equipData : heroCardDao2.equips.values()) {
                  if (equipData.enable) {
                     ZhuHouEquipModel equipModel = (ZhuHouEquipModel)ApplicationContextProvider.getModelPoolEntity("heroGame", equipData.equipId);
                     if (null != equipModel && taskTargetItem.getTargetId() <= equipModel.getQuality()) {
                        ++opValue;
                     }
                  }
               }
               break;
            case 764:
               if (this.player.isSystemOpen(6850)) {
                  opValue = 1L;
               }
               break;
            case 767:
               HeroCardDao heroCardDao3 = (HeroCardDao)this.player.getData("tb_hero_card", this.player.getPlayerId());
               opValue = (long)heroCardDao3.curLevel;
               break;
            case 888:
               PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
               opValue = (long)playerRechargeDao.totalCoin;
         }

         if (opValue != -1L) {
            GlobalTaskPart globalTaskPart = (GlobalTaskPart)this.player.getMgrPart(GlobalTaskPart.class);
            if (globalTaskPart.handleTaskProcess(this, taskData, opType, opValue) && this.getModule() == TaskDefine.TaskModule.MODULE_COMMON) {
               List<TaskData> notifyModuleTasks = new ArrayList();
               notifyModuleTasks.add(taskData);
               if (!notifyModuleTasks.isEmpty()) {
                  this.sendTaskList(notifyModuleTasks);
               }
            }
         }

      }
   }
}
