package com.gzbz.gamePlayer.littleGame;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.LittleGameDao;
import com.gzbz.db.LittleGameNewDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.bean.BubbleGameData;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.CatapultGameChapterModel;
import com.gzbz.model.CatapultGameChapterNewModel;
import com.gzbz.model.CatapultGameLevelModel;
import com.gzbz.model.CatapultGameLevelNewModel;
import com.gzbz.model.CleansingTowerChapterModel;
import com.gzbz.model.CleansingTowerChapterNewModel;
import com.gzbz.model.CleansingTowerLevelModel;
import com.gzbz.model.CleansingTowerLevelNewModel;
import com.gzbz.model.fun.CleansingTowerBoxRewardItem;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.LittleGameMsg;
import com.gzbz.protobuf.PlayerMsg;
import java.util.List;
import java.util.Map;
import misc.MiscUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class LittleGamePart extends PlayerPart {
   @MsgHandlerAnno
   public void C2S_CleansingTowerInfo_20801(LittleGameMsg.C2S_CleansingTowerInfo_20801 msg, String source) {
      this.sendCleansingTowerInfo(LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REQ);
   }

   @MsgHandlerAnno
   public void C2S_CleansingTowerFinish_20803(LittleGameMsg.C2S_CleansingTowerFinish_20803 msg, String source) {
      LittleGameDao dao = (LittleGameDao)this.player.getData("tb_little_game", this.player.getPlayerId());
      if (dao.towerlevel == 0) {
         CleansingTowerChapterModel firstChapterModel = (CleansingTowerChapterModel)this.player.getGameModelPool().getEntity("cleansingTowerChapter", 1);
         if (null == firstChapterModel) {
            return;
         }

         if (msg.getLevel() != (Integer)firstChapterModel.getlevelList().get(0)) {
            this.logger.info("请求通关第{}关错误！当前关卡id为{}", msg.getLevel(), dao.towerlevel);
            return;
         }
      }

      CleansingTowerLevelModel curLevelModel = (CleansingTowerLevelModel)this.player.getGameModelPool().getEntity("cleansingTowerLevel", dao.towerlevel);
      if (null != curLevelModel) {
         if (0 != curLevelModel.getNextLevel()) {
            if (msg.getLevel() != curLevelModel.getNextLevel()) {
               this.logger.info("请求通关第{}关错误！当前关卡id为{}", msg.getLevel(), dao.towerlevel);
               return;
            }
         } else {
            CleansingTowerChapterModel nextChapterModel = (CleansingTowerChapterModel)this.player.getGameModelPool().getEntity("cleansingTowerChapter", dao.towerChapter + 1);
            if (null == nextChapterModel) {
               this.logger.info("请求通关第{}关错误！所有关卡已全部通关！", msg.getLevel());
               return;
            }

            if (msg.getLevel() != (Integer)nextChapterModel.getlevelList().get(0)) {
               this.logger.info("请求通关第{}关错误！当前关卡id为{}", msg.getLevel(), dao.towerlevel);
               return;
            }
         }
      }

      CleansingTowerLevelModel levelModel = (CleansingTowerLevelModel)this.player.getGameModelPool().getEntity("cleansingTowerLevel", msg.getLevel());
      if (null != levelModel) {
         PlayerPublicDao playerPublicDao = this.player.getPublicDao();
         if (playerPublicDao.lv < levelModel.getUnLockLv()) {
            this.logger.info("请求通关第{}关错误！玩家等级{}，解锁等级{}", new Object[]{msg.getLevel(), playerPublicDao.lv, levelModel.getUnLockLv()});
         } else {
            CleansingTowerChapterModel chapterModel = (CleansingTowerChapterModel)this.player.getGameModelPool().getEntity("cleansingTowerChapter", msg.getChapter());
            if (null != chapterModel) {
               boolean isContain = false;

               for(int level : chapterModel.getlevelList()) {
                  if (level == msg.getLevel()) {
                     isContain = true;
                     break;
                  }
               }

               if (!isContain) {
                  this.logger.info("请求通关第{}章第{}关错误！当前章节{}，当前关卡{}", new Object[]{msg.getChapter(), msg.getLevel(), dao.towerChapter, dao.towerlevel});
               } else {
                  dao.towerChapter = chapterModel.getChapter();
                  dao.towerlevel = levelModel.getLevel();
                  dao.updateOp();
                  this.sendCleansingTowerInfo(LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_PASS);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_CleansingTowerGetBoxReward_20804(LittleGameMsg.C2S_CleansingTowerGetBoxReward_20804 msg, String source) {
      CleansingTowerChapterModel chapterModel = (CleansingTowerChapterModel)this.player.getGameModelPool().getEntity("cleansingTowerChapter", msg.getChapter());
      if (null != chapterModel) {
         LittleGameDao dao = (LittleGameDao)this.player.getData("tb_little_game", this.player.getPlayerId());
         int starNum = 0;

         for(int level : chapterModel.getlevelList()) {
            if (dao.towerlevel >= level) {
               ++starNum;
            }
         }

         List<CleansingTowerBoxRewardItem> boxRewardsModel = chapterModel.getBoxRewards();
         if (msg.getBoxRewardIndex() >= 0 && msg.getBoxRewardIndex() < boxRewardsModel.size()) {
            CleansingTowerBoxRewardItem modelItem = (CleansingTowerBoxRewardItem)chapterModel.getBoxRewards().get(msg.getBoxRewardIndex());
            if (null != modelItem) {
               if (starNum < modelItem.getStar()) {
                  this.logger.info("请求领取第{}章第{}个箱子错误！当前章节通关数量为{}", new Object[]{msg.getChapter(), msg.getBoxRewardIndex(), starNum});
               } else {
                  Integer rewardFlag = (Integer)dao.towerRewardFlag.get(msg.getChapter());
                  if (null != rewardFlag) {
                     if (MiscUtil.existBit((long)rewardFlag, msg.getBoxRewardIndex())) {
                        this.logger.info("请求领取第{}章第{}个箱子错误！该箱子奖励已被领取", msg.getChapter(), msg.getBoxRewardIndex());
                        return;
                     }
                  } else {
                     rewardFlag = 0;
                  }

                  rewardFlag = MiscUtil.setBit(rewardFlag, msg.getBoxRewardIndex());
                  dao.towerRewardFlag.put(chapterModel.getChapter(), rewardFlag);
                  dao.updateOp();
                  this.sendCleansingTowerInfo(LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REWARD);
               }
            }
         } else {
            this.logger.info("请求领取第{}章第{}个箱子错误！箱子最大索引为{}", new Object[]{msg.getChapter(), msg.getBoxRewardIndex(), boxRewardsModel.size() - 1});
         }
      }
   }

   public void sendCleansingTowerInfo(LittleGameMsg.CleansingTowerNotifyReason notifyReason) {
      LittleGameDao dao = (LittleGameDao)this.player.getData("tb_little_game", this.player.getPlayerId());
      LittleGameMsg.S2C_CleansingTowerInfo_20802.Builder msg = LittleGameMsg.S2C_CleansingTowerInfo_20802.newBuilder();
      msg.setNotifyReason(notifyReason);
      msg.setChapter(dao.towerChapter);
      msg.setLevel(dao.towerlevel);

      for(Map.Entry<Integer, Integer> entry : dao.towerRewardFlag.entrySet()) {
         LittleGameMsg.CleansingTowerChapterInfo.Builder info = LittleGameMsg.CleansingTowerChapterInfo.newBuilder();
         info.setChapter((Integer)entry.getKey());
         info.setBoxRewardFlag((Integer)entry.getValue());
         msg.addChapterInfo(info);
      }

      this.player.sendMsg(msg.build());
   }

   @MsgHandlerAnno
   public void C2S_CleansingTowerInfo_20805(LittleGameMsg.C2S_CleansingTowerInfo_20805 msg, String source) {
      this.sendCleansingTowerInfo(LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REQ, (Object)null);
   }

   @MsgHandlerAnno
   public void C2S_CleansingTowerFinish_20807(LittleGameMsg.C2S_CleansingTowerFinish_20807 msg, String source) {
      LittleGameNewDao dao = (LittleGameNewDao)this.player.getData("tb_little_game_new", this.player.getPlayerId());
      if (dao.towerlevel == 0) {
         CleansingTowerChapterNewModel firstChapterModel = (CleansingTowerChapterNewModel)this.player.getGameModelPool().getEntity("cleansingTowerChapterNew", 1);
         if (null == firstChapterModel) {
            return;
         }

         if (msg.getLevel() != (Integer)firstChapterModel.getlevelList().get(0)) {
            this.logger.info("请求通关第{}关错误！当前关卡id为{}", msg.getLevel(), dao.towerlevel);
            return;
         }
      }

      CleansingTowerLevelNewModel curLevelModel = (CleansingTowerLevelNewModel)this.player.getGameModelPool().getEntity("cleansingTowerLevelNew", dao.towerlevel);
      if (null != curLevelModel) {
         if (0 != curLevelModel.getNextLevel()) {
            if (msg.getLevel() != curLevelModel.getNextLevel()) {
               this.logger.info("请求通关第{}关错误！当前关卡id为{}", msg.getLevel(), dao.towerlevel);
               return;
            }
         } else {
            CleansingTowerChapterNewModel nextChapterModel = (CleansingTowerChapterNewModel)this.player.getGameModelPool().getEntity("cleansingTowerChapterNew", dao.towerChapter + 1);
            if (null == nextChapterModel) {
               this.logger.info("请求通关第{}关错误！所有关卡已全部通关！", msg.getLevel());
               return;
            }

            if (msg.getLevel() != (Integer)nextChapterModel.getlevelList().get(0)) {
               this.logger.info("请求通关第{}关错误！当前关卡id为{}", msg.getLevel(), dao.towerlevel);
               return;
            }
         }
      }

      CleansingTowerLevelNewModel levelModel = (CleansingTowerLevelNewModel)this.player.getGameModelPool().getEntity("cleansingTowerLevelNew", msg.getLevel());
      if (null != levelModel) {
         PlayerPublicDao playerPublicDao = this.player.getPublicDao();
         if (playerPublicDao.lv < levelModel.getUnLockLv()) {
            this.logger.info("请求通关第{}关错误！玩家等级{}，解锁等级{}", new Object[]{msg.getLevel(), playerPublicDao.lv, levelModel.getUnLockLv()});
         } else {
            CleansingTowerChapterNewModel chapterModel = (CleansingTowerChapterNewModel)this.player.getGameModelPool().getEntity("cleansingTowerChapterNew", msg.getChapter());
            if (null != chapterModel) {
               boolean isContain = false;

               for(int level : chapterModel.getlevelList()) {
                  if (level == msg.getLevel()) {
                     isContain = true;
                     break;
                  }
               }

               if (!isContain) {
                  this.logger.info("请求通关第{}章第{}关错误！当前章节{}，当前关卡{}", new Object[]{msg.getChapter(), msg.getLevel(), dao.towerChapter, dao.towerlevel});
               } else {
                  dao.towerChapter = chapterModel.getChapter();
                  dao.towerlevel = levelModel.getLevel();
                  dao.updateOp();
                  List<ResourceModel> rewards = ResourceModel.buildResources(levelModel.getRewards());
                  this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 105, 10501, 0, 0, "");
                  this.sendCleansingTowerInfo(LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_PASS, (Object)null);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_CleansingTowerGetBoxReward_20808(LittleGameMsg.C2S_CleansingTowerGetBoxReward_20808 msg, String source) {
      CleansingTowerChapterNewModel chapterModel = (CleansingTowerChapterNewModel)this.player.getGameModelPool().getEntity("cleansingTowerChapterNew", msg.getChapter());
      if (null != chapterModel) {
         LittleGameNewDao dao = (LittleGameNewDao)this.player.getData("tb_little_game_new", this.player.getPlayerId());
         int starNum = 0;

         for(int level : chapterModel.getlevelList()) {
            if (dao.towerlevel >= level) {
               ++starNum;
            }
         }

         List<CleansingTowerBoxRewardItem> boxRewardsModel = chapterModel.getBoxRewards();
         if (msg.getBoxRewardIndex() >= 0 && msg.getBoxRewardIndex() < boxRewardsModel.size()) {
            CleansingTowerBoxRewardItem modelItem = (CleansingTowerBoxRewardItem)chapterModel.getBoxRewards().get(msg.getBoxRewardIndex());
            if (null != modelItem) {
               if (starNum < modelItem.getStar()) {
                  this.logger.info("请求领取第{}章第{}个箱子错误！当前章节通关数量为{}", new Object[]{msg.getChapter(), msg.getBoxRewardIndex(), starNum});
               } else {
                  Integer rewardFlag = (Integer)dao.towerRewardFlag.get(msg.getChapter());
                  if (null != rewardFlag) {
                     if (MiscUtil.existBit((long)rewardFlag, msg.getBoxRewardIndex())) {
                        this.logger.info("请求领取第{}章第{}个箱子错误！该箱子奖励已被领取", msg.getChapter(), msg.getBoxRewardIndex());
                        return;
                     }
                  } else {
                     rewardFlag = 0;
                  }

                  rewardFlag = MiscUtil.setBit(rewardFlag, msg.getBoxRewardIndex());
                  dao.towerRewardFlag.put(chapterModel.getChapter(), rewardFlag);
                  dao.updateOp();
                  List<ResourceModel> rewards = ResourceModel.buildResources(modelItem.getRewards());
                  this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 105, 10502, 0, 0, "");
                  this.sendCleansingTowerInfo(LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REWARD, (Object)null);
               }
            }
         } else {
            this.logger.info("请求领取第{}章第{}个箱子错误！箱子最大索引为{}", new Object[]{msg.getChapter(), msg.getBoxRewardIndex(), boxRewardsModel.size() - 1});
         }
      }
   }

   public void sendCleansingTowerInfo(LittleGameMsg.CleansingTowerNotifyReason notifyReason, Object object) {
      LittleGameNewDao dao = (LittleGameNewDao)this.player.getData("tb_little_game_new", this.player.getPlayerId());
      LittleGameMsg.S2C_CleansingTowerInfo_20806.Builder msg = LittleGameMsg.S2C_CleansingTowerInfo_20806.newBuilder();
      msg.setNotifyReason(notifyReason);
      msg.setChapter(dao.towerChapter);
      msg.setLevel(dao.towerlevel);

      for(Map.Entry<Integer, Integer> entry : dao.towerRewardFlag.entrySet()) {
         LittleGameMsg.CleansingTowerChapterInfo.Builder info = LittleGameMsg.CleansingTowerChapterInfo.newBuilder();
         info.setChapter((Integer)entry.getKey());
         info.setBoxRewardFlag((Integer)entry.getValue());
         msg.addChapterInfo(info);
      }

      this.player.sendMsg(msg.build());
   }

   @MsgHandlerAnno
   public void C2S_CleansingTowerInfo_20811(LittleGameMsg.C2S_CleansingTowerInfo_20811 msg, String source) {
      this.sendBubbleGameInfo(LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REQ);
   }

   @MsgHandlerAnno
   public void C2S_CleansingTowerFinish_20813(LittleGameMsg.C2S_CleansingTowerFinish_20813 msg, String source) {
      BubbleGameData gameData = this.getBubbleData();
      if (gameData.towerlevel == 0) {
         CatapultGameChapterModel firstChapterModel = (CatapultGameChapterModel)this.player.getGameModelPool().getEntity("catapultGameChapter", 1);
         if (null == firstChapterModel) {
            return;
         }

         if (msg.getLevel() != (Integer)firstChapterModel.getLevel().get(0)) {
            this.logger.info("请求通关第{}关错误！当前关卡id为{}", msg.getLevel(), gameData.towerlevel);
            return;
         }
      }

      CatapultGameLevelModel curLevelModel = (CatapultGameLevelModel)this.player.getGameModelPool().getEntity("catapultGameLevel", gameData.towerlevel);
      if (null != curLevelModel) {
         if (0 != curLevelModel.getNextLevel()) {
            if (msg.getLevel() != curLevelModel.getNextLevel()) {
               this.logger.info("请求通关第{}关错误！当前关卡id为{}", msg.getLevel(), gameData.towerlevel);
               return;
            }
         } else {
            CatapultGameChapterModel nextChapterModel = (CatapultGameChapterModel)this.player.getGameModelPool().getEntity("catapultGameChapter", gameData.towerChapter + 1);
            if (null == nextChapterModel) {
               this.logger.info("请求通关第{}关错误！所有关卡已全部通关！", msg.getLevel());
               return;
            }

            if (msg.getLevel() != (Integer)nextChapterModel.getLevel().get(0)) {
               this.logger.info("请求通关第{}关错误！当前关卡id为{}", msg.getLevel(), gameData.towerlevel);
               return;
            }
         }
      }

      CatapultGameLevelModel levelModel = (CatapultGameLevelModel)this.player.getGameModelPool().getEntity("catapultGameLevel", msg.getLevel());
      if (null != levelModel) {
         PlayerPublicDao playerPublicDao = this.player.getPublicDao();
         if (playerPublicDao.lv < levelModel.getUnLockLv()) {
            this.logger.info("请求通关第{}关错误！玩家等级{}，解锁等级{}", new Object[]{msg.getLevel(), playerPublicDao.lv, levelModel.getUnLockLv()});
         } else {
            CatapultGameChapterModel chapterModel = (CatapultGameChapterModel)this.player.getGameModelPool().getEntity("catapultGameChapter", msg.getChapter());
            if (null != chapterModel) {
               boolean isContain = false;

               for(int level : chapterModel.getLevel()) {
                  if (level == msg.getLevel()) {
                     isContain = true;
                     break;
                  }
               }

               if (!isContain) {
                  this.logger.info("请求通关第{}章第{}关错误！当前章节{}，当前关卡{}", new Object[]{msg.getChapter(), msg.getLevel(), gameData.towerChapter, gameData.towerlevel});
               } else {
                  gameData.towerChapter = chapterModel.getId();
                  gameData.towerlevel = levelModel.getId();
                  this.updateDao();
                  this.sendBubbleGameInfo(LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_PASS);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_CleansingTowerGetBoxReward_20814(LittleGameMsg.C2S_CleansingTowerGetBoxReward_20814 msg, String source) {
      CatapultGameChapterModel chapterModel = (CatapultGameChapterModel)this.player.getGameModelPool().getEntity("catapultGameChapter", msg.getChapter());
      if (null != chapterModel) {
         BubbleGameData gameData = this.getBubbleData();
         int starNum = 0;

         for(int level : chapterModel.getLevel()) {
            if (gameData.towerlevel >= level) {
               ++starNum;
            }
         }

         List<CleansingTowerBoxRewardItem> boxRewardsModel = chapterModel.getBoxReward();
         if (msg.getBoxRewardIndex() >= 0 && msg.getBoxRewardIndex() < boxRewardsModel.size()) {
            CleansingTowerBoxRewardItem modelItem = (CleansingTowerBoxRewardItem)chapterModel.getBoxReward().get(msg.getBoxRewardIndex());
            if (null != modelItem) {
               if (starNum < modelItem.getStar()) {
                  this.logger.info("请求领取第{}章第{}个箱子错误！当前章节通关数量为{}", new Object[]{msg.getChapter(), msg.getBoxRewardIndex(), starNum});
               } else {
                  Integer rewardFlag = (Integer)gameData.towerRewardFlag.get(msg.getChapter());
                  if (null != rewardFlag) {
                     if (MiscUtil.existBit((long)rewardFlag, msg.getBoxRewardIndex())) {
                        this.logger.info("请求领取第{}章第{}个箱子错误！该箱子奖励已被领取", msg.getChapter(), msg.getBoxRewardIndex());
                        return;
                     }
                  } else {
                     rewardFlag = 0;
                  }

                  rewardFlag = MiscUtil.setBit(rewardFlag, msg.getBoxRewardIndex());
                  gameData.towerRewardFlag.put(chapterModel.getId(), rewardFlag);
                  this.updateDao();
                  List<ResourceModel> rewards = ResourceModel.buildResources(modelItem.getRewards());
                  this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 105, 10502, 0, 0, "");
                  this.sendBubbleGameInfo(LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REWARD);
               }
            }
         } else {
            this.logger.info("请求领取第{}章第{}个箱子错误！箱子最大索引为{}", new Object[]{msg.getChapter(), msg.getBoxRewardIndex(), boxRewardsModel.size() - 1});
         }
      }
   }

   public void sendBubbleGameInfo(LittleGameMsg.CleansingTowerNotifyReason notifyReason) {
      BubbleGameData gameData = this.getBubbleData();
      LittleGameMsg.S2C_CleansingTowerInfo_20812.Builder msg = LittleGameMsg.S2C_CleansingTowerInfo_20812.newBuilder();
      msg.setNotifyReason(notifyReason);
      msg.setChapter(gameData.towerChapter);
      msg.setLevel(gameData.towerlevel);

      for(Map.Entry<Integer, Integer> entry : gameData.towerRewardFlag.entrySet()) {
         LittleGameMsg.CleansingTowerChapterInfo.Builder info = LittleGameMsg.CleansingTowerChapterInfo.newBuilder();
         info.setChapter((Integer)entry.getKey());
         info.setBoxRewardFlag((Integer)entry.getValue());
         msg.addChapterInfo(info);
      }

      this.player.sendMsg(msg.build());
   }

   public BubbleGameData getBubbleData() {
      LittleGameDao dao = (LittleGameDao)this.player.getData("tb_little_game", this.player.getPlayerId());
      return dao.bubbleGameData;
   }

   public void updateDao() {
      LittleGameDao dao = (LittleGameDao)this.player.getData("tb_little_game", this.player.getPlayerId());
      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_CleansingTowerInfo_20815(LittleGameMsg.C2S_CleansingTowerInfo_20815 msg, String source) {
      this.sendBubbleGameInfo2(LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REQ);
   }

   @MsgHandlerAnno
   public void C2S_CleansingTowerFinish_20817(LittleGameMsg.C2S_CleansingTowerFinish_20817 msg, String source) {
      BubbleGameData gameData = this.getBubbleData2();
      if (gameData.towerlevel == 0) {
         CatapultGameChapterNewModel firstChapterModel = (CatapultGameChapterNewModel)this.player.getGameModelPool().getEntity("catapultGameChapter11", 1);
         if (null == firstChapterModel) {
            return;
         }

         if (msg.getLevel() != (Integer)firstChapterModel.getLevel().get(0)) {
            this.logger.info("请求通关第{}关错误！当前关卡id为{}", msg.getLevel(), gameData.towerlevel);
            return;
         }
      }

      CatapultGameLevelNewModel curLevelModel = (CatapultGameLevelNewModel)this.player.getGameModelPool().getEntity("catapultGameLevel11", gameData.towerlevel);
      if (null != curLevelModel) {
         if (0 != curLevelModel.getNextLevel()) {
            if (msg.getLevel() != curLevelModel.getNextLevel()) {
               this.logger.info("请求通关第{}关错误！当前关卡id为{}", msg.getLevel(), gameData.towerlevel);
               return;
            }
         } else {
            CatapultGameChapterNewModel nextChapterModel = (CatapultGameChapterNewModel)this.player.getGameModelPool().getEntity("catapultGameChapter11", gameData.towerChapter + 1);
            if (null == nextChapterModel) {
               this.logger.info("请求通关第{}关错误！所有关卡已全部通关！", msg.getLevel());
               return;
            }

            if (msg.getLevel() != (Integer)nextChapterModel.getLevel().get(0)) {
               this.logger.info("请求通关第{}关错误！当前关卡id为{}", msg.getLevel(), gameData.towerlevel);
               return;
            }
         }
      }

      CatapultGameLevelNewModel levelModel = (CatapultGameLevelNewModel)this.player.getGameModelPool().getEntity("catapultGameLevel11", msg.getLevel());
      if (null != levelModel) {
         PlayerPublicDao playerPublicDao = this.player.getPublicDao();
         if (playerPublicDao.lv < levelModel.getUnLockLv()) {
            this.logger.info("请求通关第{}关错误！玩家等级{}，解锁等级{}", new Object[]{msg.getLevel(), playerPublicDao.lv, levelModel.getUnLockLv()});
         } else {
            CatapultGameChapterNewModel chapterModel = (CatapultGameChapterNewModel)this.player.getGameModelPool().getEntity("catapultGameChapter11", msg.getChapter());
            if (null != chapterModel) {
               boolean isContain = false;

               for(int level : chapterModel.getLevel()) {
                  if (level == msg.getLevel()) {
                     isContain = true;
                     break;
                  }
               }

               if (!isContain) {
                  this.logger.info("请求通关第{}章第{}关错误！当前章节{}，当前关卡{}", new Object[]{msg.getChapter(), msg.getLevel(), gameData.towerChapter, gameData.towerlevel});
               } else {
                  gameData.towerChapter = chapterModel.getId();
                  gameData.towerlevel = levelModel.getId();
                  this.updateDao2();
                  List<ResourceModel> rewards = ResourceModel.buildResources(levelModel.getRewards());
                  this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 105, 10501, 0, 0, "");
                  this.sendBubbleGameInfo2(LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_PASS);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_CleansingTowerGetBoxReward_20818(LittleGameMsg.C2S_CleansingTowerGetBoxReward_20818 msg, String source) {
      CatapultGameChapterNewModel chapterModel = (CatapultGameChapterNewModel)this.player.getGameModelPool().getEntity("catapultGameChapter11", msg.getChapter());
      if (null != chapterModel) {
         BubbleGameData gameData = this.getBubbleData2();
         int starNum = 0;

         for(int level : chapterModel.getLevel()) {
            if (gameData.towerlevel >= level) {
               ++starNum;
            }
         }

         List<CleansingTowerBoxRewardItem> boxRewardsModel = chapterModel.getBoxReward();
         if (msg.getBoxRewardIndex() >= 0 && msg.getBoxRewardIndex() < boxRewardsModel.size()) {
            CleansingTowerBoxRewardItem modelItem = (CleansingTowerBoxRewardItem)chapterModel.getBoxReward().get(msg.getBoxRewardIndex());
            if (null != modelItem) {
               if (starNum < modelItem.getStar()) {
                  this.logger.info("请求领取第{}章第{}个箱子错误！当前章节通关数量为{}", new Object[]{msg.getChapter(), msg.getBoxRewardIndex(), starNum});
               } else {
                  Integer rewardFlag = (Integer)gameData.towerRewardFlag.get(msg.getChapter());
                  if (null != rewardFlag) {
                     if (MiscUtil.existBit((long)rewardFlag, msg.getBoxRewardIndex())) {
                        this.logger.info("请求领取第{}章第{}个箱子错误！该箱子奖励已被领取", msg.getChapter(), msg.getBoxRewardIndex());
                        return;
                     }
                  } else {
                     rewardFlag = 0;
                  }

                  rewardFlag = MiscUtil.setBit(rewardFlag, msg.getBoxRewardIndex());
                  gameData.towerRewardFlag.put(chapterModel.getId(), rewardFlag);
                  this.updateDao2();
                  List<ResourceModel> rewards = ResourceModel.buildResources(modelItem.getRewards());
                  this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 105, 10502, 0, 0, "");
                  this.sendBubbleGameInfo2(LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REWARD);
               }
            }
         } else {
            this.logger.info("请求领取第{}章第{}个箱子错误！箱子最大索引为{}", new Object[]{msg.getChapter(), msg.getBoxRewardIndex(), boxRewardsModel.size() - 1});
         }
      }
   }

   public void sendBubbleGameInfo2(LittleGameMsg.CleansingTowerNotifyReason notifyReason) {
      BubbleGameData gameData = this.getBubbleData2();
      LittleGameMsg.S2C_CleansingTowerInfo_20816.Builder msg = LittleGameMsg.S2C_CleansingTowerInfo_20816.newBuilder();
      msg.setNotifyReason(notifyReason);
      msg.setChapter(gameData.towerChapter);
      msg.setLevel(gameData.towerlevel);

      for(Map.Entry<Integer, Integer> entry : gameData.towerRewardFlag.entrySet()) {
         LittleGameMsg.CleansingTowerChapterInfo.Builder info = LittleGameMsg.CleansingTowerChapterInfo.newBuilder();
         info.setChapter((Integer)entry.getKey());
         info.setBoxRewardFlag((Integer)entry.getValue());
         msg.addChapterInfo(info);
      }

      this.player.sendMsg(msg.build());
   }

   public BubbleGameData getBubbleData2() {
      LittleGameNewDao dao = (LittleGameNewDao)this.player.getData("tb_little_game_new", this.player.getPlayerId());
      return dao.bubbleGameData;
   }

   public void updateDao2() {
      LittleGameNewDao dao = (LittleGameNewDao)this.player.getData("tb_little_game_new", this.player.getPlayerId());
      dao.updateOp();
   }
}
