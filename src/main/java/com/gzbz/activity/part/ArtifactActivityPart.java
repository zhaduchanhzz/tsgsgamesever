package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.util.RandomUtil;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.ThemeActivityDao;
import com.gzbz.db.bean.ActivityArtifactData;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ArtifactActivateModel;
import com.gzbz.model.ArtifactBoxActivateModel;
import com.gzbz.model.ArtifactBoxRewardModel;
import com.gzbz.model.ArtifactGridModel;
import com.gzbz.model.ArtifactGridTaskModel;
import com.gzbz.model.ArtifactPrizeModel;
import com.gzbz.model.ArtifactTreasureModel;
import com.gzbz.model.BattleModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ArtifactActivityMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ActivityArtifactTaskPart;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.DateUtil;
import misc.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ArtifactActivityPart extends AbstractActivityPart {
   @Autowired
   ConfigManager configManager;
   public static final String ARTIFACT_TREASURE_COST = "artifactTreasureCost";
   public static final String ARTIFACT_TREASURE = "artifactTreasure";

   @MsgHandlerAnno
   public void C2S_ArtifactInfo_13301(ArtifactActivityMsg.C2S_ArtifactInfo_13301 msg, String source) {
      this.sendArtifactInfo();
   }

   private void sendArtifactInfo() {
      if (!this.isServerActivityInvalid()) {
         ArtifactActivityMsg.S2C_ArtifactInfo_13302.Builder builder = ArtifactActivityMsg.S2C_ArtifactInfo_13302.newBuilder();
         ActivityInfo activityInfo = this.getServerActivityInfo();
         builder.setStartTime(activityInfo.start);
         builder.setEndTime(activityInfo.end);
         int tokenId = this.getArtifactToken();
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         int num = (Integer)playerExtend.cumulatives.getOrDefault(tokenId, 0);
         ActivityArtifactData artifactData = this.getArtifactData();
         builder.addAllWeaponBoxs(artifactData.weaponBoxs);
         builder.setToken(num);
         this.player.sendMsg(builder.build());
      }
   }

   private int getArtifactToken() {
      Map<Integer, ArtifactActivateModel> modelMap = ApplicationContextProvider.<Integer, ArtifactActivateModel>getModelPoolMap("artifactActivate");
      TreeMap<Integer, ArtifactActivateModel> treeMap = new TreeMap(modelMap);
      if (treeMap.size() > 0) {
         return ((ArtifactActivateModel)treeMap.firstEntry().getValue()).getExchangeId();
      } else {
         this.logger.error("神兵谱配置表错误 artifactActivate");
         return 0;
      }
   }

   private void clearArtifactToken() {
      int tokenId = this.getArtifactToken();
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      playerExtend.cumulatives.put(tokenId, 0);
      this.player.updatePlayerExtend(13);
   }

   @MsgHandlerAnno
   public void C2S_OpenWeaponBox_13303(ArtifactActivityMsg.C2S_OpenWeaponBox_13303 msg, String source) {
      int boxId = msg.getBoxId();
      if (boxId > 0) {
         ActivityArtifactData artifactData = this.getArtifactData();
         if (!artifactData.weaponBoxs.contains(boxId)) {
            ArtifactActivateModel model = (ArtifactActivateModel)ApplicationContextProvider.getModelPoolEntity("artifactActivate", boxId);
            if (model != null) {
               int tokenId = this.getArtifactToken();
               PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
               int cumulativeNum = (Integer)playerExtend.cumulatives.getOrDefault(tokenId, 0);
               if (model.getExchangeId() != tokenId) {
                  this.logger.warn("神兵皮肤活动 - 神兵谱领取宝箱配置错误 itemId:{}", model.getExchangeId());
               } else if (cumulativeNum < model.getExchangeNum()) {
                  this.player.failure(61014);
               } else {
                  artifactData.weaponBoxs.add(boxId);
                  this.updateArtifactData();
                  this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 64, 6401, boxId, 0, "");
                  ArtifactActivityMsg.S2C_OpenWeaponBox_13304.Builder builder = ArtifactActivityMsg.S2C_OpenWeaponBox_13304.newBuilder();
                  builder.setBoxId(boxId);
                  this.player.sendMsg(builder.build());
                  this.recordLog(model.getRewards(), "神兵谱宝箱");
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_LootInfo_13305(ArtifactActivityMsg.C2S_LootInfo_13305 msg, String source) {
      this.sendLootInfo();
   }

   private void sendLootInfo() {
      if (!this.isServerActivityInvalid()) {
         ActivityArtifactData artifactData = this.getArtifactData();
         ArtifactActivityMsg.S2C_LootInfo_13306.Builder builder = ArtifactActivityMsg.S2C_LootInfo_13306.newBuilder();
         builder.setEnjoyId(artifactData.enjoyId);
         builder.setResetTimes(artifactData.resetNum);
         Map<Integer, ArtifactTreasureModel> modelMap = ApplicationContextProvider.<Integer, ArtifactTreasureModel>getModelPoolMap("artifacttreasure");

         for(Map.Entry<Integer, ArtifactTreasureModel> modelEntry : modelMap.entrySet()) {
            ArtifactTreasureModel model = (ArtifactTreasureModel)modelEntry.getValue();
            if (model.getRound() == artifactData.round && !artifactData.hadLoots.contains(model.getId())) {
               builder.addRewardId(model.getId());
            }
         }

         builder.setHadGetEnjoy(artifactData.hadGetEnjoy);
         builder.setCurLootNum(artifactData.curLootNum);

         for(Map.Entry<Integer, Integer> entry : artifactData.chooseMap.entrySet()) {
            CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
            mapData.setKey((Integer)entry.getKey());
            mapData.setValue((Integer)entry.getValue());
            builder.addChooseTimes(mapData);
         }

         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(27, 0);
         builder.setDailyDrawNum(dailyDrawNum);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_LootReward_13307(ArtifactActivityMsg.C2S_LootReward_13307 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityArtifactData artifactData = this.getArtifactData();
         List<ArtifactTreasureModel> list = (List<ArtifactTreasureModel>)this.player.getGameModelPool().getEntity("customArtifactTreasure", artifactData.round);
         if (!CollectionUtils.isEmpty(list)) {
            if (0 == artifactData.enjoyId) {
               this.player.failure(61010);
            } else {
               int num = msg.getNum();
               if (num < 1) {
                  this.player.failure(61044);
               } else {
                  PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
                  int dailyNum = (Integer)playerResetCustomCache.getDailyNum(27, 0);
                  int newDailyNum = dailyNum + num;
                  int lotteryLimit = this.configManager.getIntDefault("LotteryLimit", 99999);
                  if (newDailyNum > lotteryLimit) {
                     this.player.failure(51);
                  } else {
                     List<Integer> costList = this.configManager.getIntList("artifactTreasureCost");
                     if (!ResourceModel.checkTotalNumError((Integer)costList.get(2), num)) {
                        if (!this.player.checkResourceNum((Integer)costList.get(0), (Integer)costList.get(1), (Integer)costList.get(2) * num)) {
                           this.player.failure(3);
                        } else {
                           int rewardNum = list.size() - artifactData.hadLoots.size() + (artifactData.hadGetEnjoy ? 0 : 1);
                           if (num > rewardNum) {
                              this.player.failure(61043);
                           } else {
                              ArtifactPrizeModel artifactPrizeModel = (ArtifactPrizeModel)this.player.getGameModelPool().getEntity("artifactPrize", artifactData.enjoyId);
                              if (artifactPrizeModel == null) {
                                 this.logger.info("选取的心仪奖励不存在 playerId:{}, enjoyId:{}", this.player.getPlayerId(), artifactData.enjoyId);
                              } else {
                                 int tempEnjoyId = 96900;
                                 boolean bMustEnjoy = !artifactData.hadGetEnjoy && artifactData.hadLoots.size() + num >= list.size();
                                 Set<Integer> rewardIdSet = new HashSet();
                                 if (bMustEnjoy) {
                                    rewardIdSet.add(tempEnjoyId);
                                    artifactData.hadGetEnjoy = true;
                                 }

                                 int drawNum = num - rewardIdSet.size();

                                 for(int i = 0; i < drawNum; ++i) {
                                    List<KeyValFun> weightList = new ArrayList();

                                    for(ArtifactTreasureModel model : list) {
                                       if (!artifactData.hadLoots.contains(model.getId())) {
                                          weightList.add(new KeyValFun(model.getId(), model.getWeight()));
                                       }
                                    }

                                    if (!artifactData.hadGetEnjoy && artifactData.hadLoots.size() >= artifactPrizeModel.getFloorNum()) {
                                       weightList.add(new KeyValFun(tempEnjoyId, artifactPrizeModel.getWeight()));
                                    }

                                    int rewardId = GamePlayer.countRate(weightList);
                                    rewardIdSet.add(rewardId);
                                    if (rewardId == tempEnjoyId) {
                                       artifactData.hadGetEnjoy = true;
                                    } else {
                                       artifactData.hadLoots.add(rewardId);
                                    }
                                 }

                                 if (rewardIdSet.size() != num) {
                                    this.logger.info("神兵夺宝发生错误 playerId:{} 夺宝{}次,获得{}个奖励", new Object[]{this.player.getPlayerId(), num, rewardIdSet.size()});
                                 } else {
                                    this.player.delResource((Integer)costList.get(0), (Integer)costList.get(1), (long)((Integer)costList.get(2) * num), 64, 6407, 0, num, "");
                                    List<ResourceModel> resourceModelList = new ArrayList();

                                    for(Integer rewardId : rewardIdSet) {
                                       if (rewardId == tempEnjoyId) {
                                          resourceModelList.addAll(artifactPrizeModel.getItems());
                                       } else {
                                          ArtifactTreasureModel tempModel = (ArtifactTreasureModel)this.player.getGameModelPool().getEntity("artifacttreasure", rewardId);
                                          resourceModelList.addAll(tempModel.getItems());
                                       }
                                    }

                                    this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 64, 6401, 0, 0, "");
                                    artifactData.curLootNum += num;
                                    artifactData.totalLootNum += num;
                                    boolean bGetEnjoy = rewardIdSet.contains(tempEnjoyId);
                                    if (bGetEnjoy) {
                                       int chooseNum = (Integer)MapUtil.getOrDefault(artifactData.chooseMap, artifactData.enjoyId, 0);
                                       artifactData.chooseMap.put(artifactData.enjoyId, chooseNum + 1);
                                       StringBuilder desc = new StringBuilder();

                                       for(ResourceModel resourceModel : artifactPrizeModel.getItems()) {
                                          desc.append(resourceModel.getType()).append("|").append(resourceModel.getId()).append("|").append(resourceModel.getValue()).append(",");
                                       }

                                       desc.deleteCharAt(desc.length() - 1);
                                       this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getServerActivityInfo().id, "神兵活动-心仪奖励", String.valueOf(artifactData.enjoyId), desc.toString(), 0, 0, 0);
                                    }

                                    if (artifactData.hadGetEnjoy && artifactData.hadLoots.size() == list.size()) {
                                       artifactData.enjoyId = 0;
                                       artifactData.curLootNum = 0;
                                       artifactData.hadLoots.clear();
                                       artifactData.hadGetEnjoy = false;
                                       Map<Integer, List<ArtifactTreasureModel>> map = this.player.getGameModelPool().getMap("customArtifactTreasure");
                                       int nextRound = artifactData.round + 1;
                                       if (map.containsKey(nextRound)) {
                                          artifactData.round = nextRound;
                                       } else {
                                          artifactData.round = 1;
                                       }
                                    }

                                    this.updateArtifactData();
                                    ArtifactActivityMsg.S2C_LootReward_13308.Builder builder = ArtifactActivityMsg.S2C_LootReward_13308.newBuilder();

                                    for(Integer rewardId : rewardIdSet) {
                                       if (rewardId != tempEnjoyId) {
                                          builder.addRewardId(rewardId);
                                       }
                                    }

                                    builder.setIsEnjoy(bGetEnjoy);
                                    builder.setCurLootNum(artifactData.curLootNum);
                                    this.player.sendMsg(builder.build());
                                    playerResetCustomCache.setDailyReset(27, newDailyNum);
                                    this.sendLootInfo();
                                    this.recordLog(resourceModelList, "神兵夺宝");
                                    int enjoyId = artifactPrizeModel.getItems().size() > 0 ? ((ResourceModel)artifactPrizeModel.getItems().get(0)).getId() : 0;

                                    for(ResourceModel resourceModel : resourceModelList) {
                                       String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                                       this.player.getOperationMgr().addExtraLog(this.player, 198, "神兵夺宝", costList.get(2) + "", num + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                                    }

                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_LootReset_13309(ArtifactActivityMsg.C2S_LootReset_13309 msg, String source) {
      ActivityArtifactData artifactData = this.getArtifactData();
      String artifacttreasure = this.configManager.getStrByDefault("artifactTreasure", "1,9,150|1,9,300|1,9,450");
      String[] costArr = artifacttreasure.split("\\|");
      if (artifactData.resetNum >= costArr.length) {
         this.player.failure(25);
      } else {
         String[] resource = costArr[artifactData.resetNum].split(",");
         if (Integer.parseInt(resource[2]) > 0 && !this.player.checkResourceNum(Integer.parseInt(resource[0]), Integer.parseInt(resource[1]), Integer.parseInt(resource[2]))) {
            this.player.failure(18);
         } else {
            this.player.delResource(Integer.parseInt(resource[0]), Integer.parseInt(resource[1]), (long)Integer.parseInt(resource[2]), 64, 6402, 0, 0, "");
            Map<Integer, List<ArtifactTreasureModel>> map = this.player.getGameModelPool().getMap("customArtifactTreasure");
            int nextRound = artifactData.round + 1;
            if (map.containsKey(nextRound)) {
               artifactData.round = nextRound;
            } else {
               artifactData.round = 1;
            }

            artifactData.hadGetEnjoy = false;
            ++artifactData.resetNum;
            artifactData.enjoyId = 0;
            artifactData.hadLoots.clear();
            artifactData.curLootNum = 0;
            this.updateArtifactData();
            this.sendLootInfo();
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_LootEnjoy_13311(ArtifactActivityMsg.C2S_LootEnjoy_13311 msg, String source) {
      ActivityArtifactData artifactData = this.getArtifactData();
      if (artifactData.enjoyId > 0) {
         this.player.failure(61008);
      } else {
         ArtifactPrizeModel prizeModel = (ArtifactPrizeModel)this.player.getGameModelPool().getEntity("artifactPrize", msg.getId());
         if (prizeModel == null) {
            this.player.failure(6);
         } else {
            Integer chooseNum = (Integer)MapUtil.getOrDefault(artifactData.chooseMap, msg.getId(), 0);
            if (chooseNum >= prizeModel.getChooseMax()) {
               this.player.failure(61009);
            } else {
               artifactData.enjoyId = msg.getId();
               this.updateArtifactData();
               ArtifactActivityMsg.S2C_LootEnjoy_13312.Builder builder = ArtifactActivityMsg.S2C_LootEnjoy_13312.newBuilder();
               builder.setId(msg.getId());
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TreasureMain_13451(ArtifactActivityMsg.C2S_TreasureMain_13451 msg, String source) {
      this.sendTreasureMain();
   }

   private ActivityArtifactData getArtifactData() {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      return themeActivityDao.artifactData;
   }

   private void updateArtifactData() {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      themeActivityDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_TreasureRollDice_13453(ArtifactActivityMsg.C2S_TreasureRollDice_13453 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
         if (themeActivityDao.artifactData.rollNum > 0) {
            this.sendRoll(msg.getType(), themeActivityDao.artifactData.rollNum);
         } else {
            int num;
            if (msg.getType() == 1) {
               if (themeActivityDao.artifactData.random <= 0) {
                  this.player.failure(51);
                  return;
               }

               --themeActivityDao.artifactData.random;
               num = RandomUtil.randomInt(1, 7);
            } else {
               if (msg.getType() != 2) {
                  this.player.failure(0);
                  return;
               }

               if (!msg.hasNum() || msg.getNum() == 0) {
                  this.player.failure(0);
                  return;
               }

               if (themeActivityDao.artifactData.appoint <= 0) {
                  this.player.failure(51);
                  return;
               }

               --themeActivityDao.artifactData.appoint;
               num = msg.getNum();
            }

            themeActivityDao.artifactData.rollNum = num;
            themeActivityDao.updateOp();
            this.checkRandomFreeCountRecover();
            this.sendRoll(msg.getType(), themeActivityDao.artifactData.rollNum);
            this.player.triggerTask(610, 0, 1L, 1);
            int gridId = this.treasureMoveGrid(num);
            ArtifactGridModel artifactGridModel = (ArtifactGridModel)ApplicationContextProvider.getModelPoolEntity("artifactgrid", gridId);
            if (artifactGridModel != null) {
               StringBuilder desc = new StringBuilder();
               if (artifactGridModel.getBattleId() > 0) {
                  desc.append(artifactGridModel.getGridId());
               } else if (artifactGridModel.getRewards() != null && !artifactGridModel.getRewards().isEmpty()) {
                  for(ResourceModel resourceModel : artifactGridModel.getRewards()) {
                     desc.append(resourceModel.getType()).append("|").append(resourceModel.getId()).append("|").append(resourceModel.getValue()).append(",");
                  }

                  desc.deleteCharAt(desc.length() - 1);
               }

               this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getServerActivityInfo().id, "兵无常势", (msg.getType() == 1 ? "普通骰子" : "金骰子") + "-" + num, desc.toString(), 0, 0, 0);
            }

         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TreasureMove_13455(ArtifactActivityMsg.C2S_TreasureMove_13455 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         if (!this.treasureMove()) {
            this.sendMove((Integer)null);
         } else {
            Integer battle = null;
            ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
            ArtifactGridModel artifactGridModel = (ArtifactGridModel)ApplicationContextProvider.getModelPoolEntity("artifactgrid", themeActivityDao.artifactData.grid);
            if (artifactGridModel == null) {
               this.player.failure(0);
            } else {
               if (artifactGridModel.getBattleId() > 0) {
                  battle = artifactGridModel.getBattleId();
               } else {
                  this.player.addResource(artifactGridModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 64, 6403, themeActivityDao.artifactData.grid, 0, "");
               }

               this.sendMove(battle);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_LineMain_13457(ArtifactActivityMsg.C2S_LineMain_13457 msg, String source) {
      this.sendLineMain();
   }

   @MsgHandlerAnno
   public void C2S_LineBoxReward_13459(ArtifactActivityMsg.C2S_LineBoxReward_13459 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ArtifactBoxRewardModel artifactBoxRewardModel = (ArtifactBoxRewardModel)ApplicationContextProvider.getModelPoolEntity("artifactboxrewards", msg.getBox());
         if (artifactBoxRewardModel == null) {
            this.player.failure(0);
         } else {
            ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
            if (themeActivityDao.artifactData.lineBoxes.contains(artifactBoxRewardModel.getId())) {
               this.player.failure(24);
            } else {
               int rewardResult = this.checkTaskBoxReward(artifactBoxRewardModel);
               if (rewardResult != 1) {
                  this.player.failure(rewardResult);
               } else {
                  themeActivityDao.artifactData.lineBoxes.add(msg.getBox());
                  themeActivityDao.updateOp();
                  this.player.addResource(artifactBoxRewardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 64, 6405, msg.getBox(), 0, "");
                  this.sendLineBoxReward(msg.getBox());
                  this.recordLog(artifactBoxRewardModel.getRewards(), "五魂之阵");
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_FinalBoxReward_13465(ArtifactActivityMsg.C2S_FinalBoxReward_13465 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
         if (themeActivityDao.artifactData.finalBoxes.contains(msg.getBox())) {
            this.player.failure(24);
         } else {
            ArtifactBoxActivateModel artifactBoxActivateModel = (ArtifactBoxActivateModel)ApplicationContextProvider.getModelPoolEntity("artifactboxactivate", msg.getBox());
            if (artifactBoxActivateModel == null) {
               this.player.failure(0);
            } else if (artifactBoxActivateModel.getActivateTime() > this.getTotalActiveBox()) {
               this.player.failure(51);
            } else {
               themeActivityDao.artifactData.finalBoxes.add(msg.getBox());
               themeActivityDao.updateOp();
               this.player.addResource(artifactBoxActivateModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 64, 6406, msg.getBox(), 0, "");
               this.sendFinalBoxReward(msg.getBox());
               this.recordLog(artifactBoxActivateModel.getRewards(), "五魂之阵宝箱");
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_LineTaskReward_13463(ArtifactActivityMsg.C2S_LineTaskReward_13463 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityArtifactTaskPart activityArtifactTaskPart = (ActivityArtifactTaskPart)this.player.getMgrPart(ActivityArtifactTaskPart.class);
         activityArtifactTaskPart.commit(msg.getTask());
      }
   }

   @MsgHandlerAnno
   public void C2S_TreasureAddRandom_13467(ArtifactActivityMsg.C2S_TreasureAddRandom_13467 msg, String source) {
      this.checkRandomFreeCountRecover();
      this.sendAddRandomCount();
   }

   @MsgHandlerAnno
   public void C2S_TreasureAppointBuy_13469(ArtifactActivityMsg.C2S_TreasureAppointBuy_13469 msg, String source) {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      List<ResourceModel> resourceModels = this.configManager.getResourceModelList("appointDice", "1,9,0|1,9,150|1,9,300|1,9,450");
      int freeCount = this.getAppointFree();
      if (themeActivityDao.artifactData.appointBuy >= resourceModels.size() - freeCount) {
         this.player.failure(51);
      } else {
         ResourceModel feeRes = (ResourceModel)resourceModels.get(themeActivityDao.artifactData.appointBuy + freeCount);
         if (!this.player.checkResourceNum(feeRes)) {
            this.player.failure(31);
         } else {
            this.player.delResource(feeRes, 64, 6408, themeActivityDao.artifactData.appointBuy + 1, 0, "");
            ++themeActivityDao.artifactData.appointBuy;
            ++themeActivityDao.artifactData.appoint;
            themeActivityDao.updateOp();
            this.sendAppointCountBuy();
         }
      }
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         if (this.getSeverActivityDay() != 1) {
            this.taskBoxesReward();
            ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
            themeActivityDao.artifactData.appoint = this.getAppointFree();
            themeActivityDao.artifactData.appointBuy = 0;
            themeActivityDao.artifactData.lineBoxes.clear();
            themeActivityDao.artifactData.resetNum = 0;
            themeActivityDao.artifactData.totalLineBoxes = this.getTotalActiveBox();
            themeActivityDao.updateOp();
            TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
            taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ARTIFACT_ACTIVITY);
            ActivityArtifactTaskPart activityArtifactTaskPart = (ActivityArtifactTaskPart)this.player.getMgrPart(ActivityArtifactTaskPart.class);
            activityArtifactTaskPart.trigger();
            this.sendInfo();
            this.sendLootInfo();
         }
      }
   }

   public void rotateReset(int oldActivityId) {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      themeActivityDao.artifactData.reset();
      themeActivityDao.updateOp();
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ARTIFACT_ACTIVITY);
      ActivityArtifactTaskPart activityArtifactTaskPart = (ActivityArtifactTaskPart)this.player.getMgrPart(ActivityArtifactTaskPart.class);
      activityArtifactTaskPart.trigger();
      this.clearActivityGift(24);
      this.clearArtifactToken();
   }

   public void activityEnd(int oldActivityId) {
      this.taskBoxesReward();
      this.finalBoxesReward();
      this.clearArtifactToken();
   }

   public void sendInfo() {
      this.sendArtifactInfo();
      this.sendTreasureMain();
      this.sendLineMain();
   }

   public int getActivityType() {
      return 21;
   }

   public int enterBattle(BattleDao battleDao) {
      if (this.isServerActivityInvalid()) {
         return 8007;
      } else {
         ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
         ArtifactGridModel artifactGridModel = (ArtifactGridModel)ApplicationContextProvider.getModelPoolEntity("artifactgrid", battleDao.modelId);
         if (artifactGridModel != null && artifactGridModel.getBattleId() == (Integer)battleDao.params.get(0)) {
            if (artifactGridModel.getGridType() == 2) {
               if (themeActivityDao.artifactData.gotGrids.contains(battleDao.modelId)) {
                  return 0;
               }

               Map<Integer, ArtifactGridModel> artifactGridModelMap = ApplicationContextProvider.<Integer, ArtifactGridModel>getModelPoolMap("artifactgrid");

               for(ArtifactGridModel loopModel : artifactGridModelMap.values()) {
                  if (loopModel.getGridId() != battleDao.modelId && loopModel.getBattleId() > 0 && !themeActivityDao.artifactData.gotGrids.contains(loopModel.getGridId())) {
                     return 61011;
                  }
               }
            } else if (battleDao.modelId != themeActivityDao.artifactData.grid || themeActivityDao.artifactData.lastBattle >= artifactGridModel.getGridId()) {
               return 0;
            }

            BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", artifactGridModel.getBattleId());
            if (battleModel == null) {
               this.logger.info("battle表中没有配置该战斗 battleId = {}", artifactGridModel.getBattleId());
               return 6;
            } else {
               BattlePKTeam battlePKTeam = new BattlePKTeam(artifactGridModel.getBattleId());
               battleDao.scene.addPKTeam((byte)1, battlePKTeam);
               battleDao.scene.setMaxRound((byte)17);
               return 1;
            }
         } else {
            return 0;
         }
      }
   }

   public void afterFight(BattleDao battleDao) {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      ArtifactGridModel artifactGridModel = (ArtifactGridModel)ApplicationContextProvider.getModelPoolEntity("artifactgrid", battleDao.modelId);
      if (artifactGridModel != null) {
         if (artifactGridModel.getGridType() != 2) {
            themeActivityDao.artifactData.lastBattle = battleDao.modelId;
         }

         if (battleDao.scene.getWinForce() == 0) {
            BattleMsg.S2C_BattleResult_6102.Builder battleMsg = battleDao.scene.getBattleMsg();
            BattleMsg.S2C_Battle_Result.Builder battleResult = battleMsg.getResult().toBuilder();
            if (!themeActivityDao.artifactData.gotGrids.contains(battleDao.modelId)) {
               if (artifactGridModel.getRewards() != null) {
                  for(ResourceModel resourceModel : artifactGridModel.getRewards()) {
                     battleResult.addAwardItems(resourceModel.builder());
                     battleDao.rewards.add(resourceModel);
                  }
               }
            } else if (artifactGridModel.getStrikeReward() != null) {
               for(ResourceModel resourceModel : artifactGridModel.getStrikeReward()) {
                  battleResult.addAwardItems(resourceModel.builder());
                  battleDao.rewards.add(resourceModel);
               }
            }

            battleMsg.setResult(battleResult);
            battleDao.updateOp();
            themeActivityDao.artifactData.gotGrids.add(battleDao.modelId);
            this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 64, 6403, battleDao.modelId, 0, "");
            this.recordLog(battleDao.rewards, "兵无常势");
         }

         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getServerActivityInfo().id, "兵无常势", String.valueOf(artifactGridModel.getGridId()), battleDao.scene.getWinForce() == 0 ? "是" : "否", 0, 0, 0);
      }

      themeActivityDao.updateOp();
      this.sendTreasureMain();
      this.player.triggerTask(611, 0, 1L, 1);
   }

   public void endBattle(BattleDao battleDao) {
   }

   private void sendTreasureMain() {
      if (!this.isServerActivityInvalid()) {
         ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
         ArtifactGridModel artifactGridModel = (ArtifactGridModel)ApplicationContextProvider.getModelPoolEntity("artifactgrid", themeActivityDao.artifactData.grid);
         if (this.treasureMove()) {
            artifactGridModel = (ArtifactGridModel)ApplicationContextProvider.getModelPoolEntity("artifactgrid", themeActivityDao.artifactData.grid);
            if (artifactGridModel != null && artifactGridModel.getBattleId() == 0) {
               this.player.addResource(artifactGridModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 64, 6403, themeActivityDao.artifactData.grid, 1, "");
            }
         }

         if (artifactGridModel == null) {
            themeActivityDao.artifactData.grid = 1;
            themeActivityDao.artifactData.rollNum = 0;
            themeActivityDao.updateOp();
            artifactGridModel = (ArtifactGridModel)ApplicationContextProvider.getModelPoolEntity("artifactgrid", themeActivityDao.artifactData.grid);
         }

         this.checkRandomFreeCountRecover();
         if (themeActivityDao.artifactData.appoint < 0) {
            themeActivityDao.artifactData.appoint = this.getAppointFree();
            themeActivityDao.artifactData.appointBuy = 0;
            themeActivityDao.updateOp();
         }

         ArtifactActivityMsg.S2C_TreasureMain_13452.Builder msg = ArtifactActivityMsg.S2C_TreasureMain_13452.newBuilder();
         msg.setAppointCount(themeActivityDao.artifactData.appoint);
         msg.setGrid(themeActivityDao.artifactData.grid);
         msg.setRandomCount(themeActivityDao.artifactData.random);
         msg.addAllGotGrid(themeActivityDao.artifactData.gotGrids);
         msg.setRandomRecoverTime(themeActivityDao.artifactData.randomRecoverTime);
         msg.setAppointCountBuy(themeActivityDao.artifactData.appointBuy);
         msg.setNeedBattle(artifactGridModel.getBattleId() > 0 && themeActivityDao.artifactData.lastBattle < artifactGridModel.getGridId());
         this.player.sendMsg(msg.build());
      }
   }

   private void sendRoll(int type, int num) {
      ArtifactActivityMsg.S2C_TreasureRollDice_13454.Builder msg = ArtifactActivityMsg.S2C_TreasureRollDice_13454.newBuilder();
      msg.setType(type);
      msg.setNum(num);
      msg.setGrid(this.treasureMoveGrid(num));
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      if (type == 1) {
         msg.setCount(themeActivityDao.artifactData.random);
      } else {
         msg.setCount(themeActivityDao.artifactData.appoint);
      }

      msg.setRandomRecoverTime(themeActivityDao.artifactData.randomRecoverTime);
      this.player.sendMsg(msg.build());
   }

   private void sendMove(Integer battle) {
      ArtifactActivityMsg.S2C_TreasureMove_13456.Builder msg = ArtifactActivityMsg.S2C_TreasureMove_13456.newBuilder();
      if (battle != null) {
         msg.setBattle(battle);
      }

      this.player.sendMsg(msg.build());
   }

   private void sendLineMain() {
      if (!this.isServerActivityInvalid()) {
         ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
         ArtifactActivityMsg.S2C_LineMain_13458.Builder msg = ArtifactActivityMsg.S2C_LineMain_13458.newBuilder();
         msg.setLineBoxCount(themeActivityDao.artifactData.totalLineBoxes);
         msg.addAllGotLineBox(themeActivityDao.artifactData.lineBoxes);
         msg.addAllGotFinalBox(themeActivityDao.artifactData.finalBoxes);
         ActivityArtifactTaskPart activityArtifactTaskPart = (ActivityArtifactTaskPart)this.player.getMgrPart(ActivityArtifactTaskPart.class);
         Map<Integer, TaskData> taskDataMap = activityArtifactTaskPart.getTasksMap();
         int day = this.getSeverActivityDay();
         Map<Integer, TreeMap<Integer, ArtifactGridTaskModel>> taskModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customArtifactGridTask", this.getPlayerActivityId());
         if (taskModelMap != null && !taskModelMap.isEmpty() && taskModelMap.containsKey(day)) {
            for(ArtifactGridTaskModel artifactGridTaskModel : (taskModelMap.get(day)).values()) {
               ArtifactActivityMsg.GridTaskData.Builder builder = ArtifactActivityMsg.GridTaskData.newBuilder();
               builder.setGrid(artifactGridTaskModel.getGridNum());
               TaskData taskData = (TaskData)taskDataMap.get(artifactGridTaskModel.getTaskId());
               if (taskData != null) {
                  builder.setTask(activityArtifactTaskPart.buildTask(taskData));
               }

               msg.addGridTask(builder);
            }
         }

         this.player.sendMsg(msg.build());
      }
   }

   private void sendLineBoxReward(int box) {
      ArtifactActivityMsg.S2C_LineBoxReward_13460.Builder msg = ArtifactActivityMsg.S2C_LineBoxReward_13460.newBuilder();
      msg.setBox(box);
      this.player.sendMsg(msg.build());
   }

   private void sendFinalBoxReward(int box) {
      ArtifactActivityMsg.S2C_FinalBoxReward_13466.Builder msg = ArtifactActivityMsg.S2C_FinalBoxReward_13466.newBuilder();
      msg.setBox(box);
      this.player.sendMsg(msg.build());
   }

   private void sendAddRandomCount() {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      ArtifactActivityMsg.S2C_TreasureAddRandom_13468.Builder msg = ArtifactActivityMsg.S2C_TreasureAddRandom_13468.newBuilder();
      msg.setRandomCount(themeActivityDao.artifactData.random);
      msg.setRandomRecoverTime(themeActivityDao.artifactData.randomRecoverTime);
      this.player.sendMsg(msg.build());
   }

   private void sendAppointCountBuy() {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      ArtifactActivityMsg.S2C_TreasureAppointBuy_13470.Builder msg = ArtifactActivityMsg.S2C_TreasureAppointBuy_13470.newBuilder();
      msg.setAppointCountBuy(themeActivityDao.artifactData.appointBuy);
      msg.setAppointCount(themeActivityDao.artifactData.appoint);
      this.player.sendMsg(msg.build());
   }

   private void checkRandomFreeCountRecover() {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      String[] freeCount = ApplicationContextProvider.getConfigString("freeDice", "0|10800").split("\\|");
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      int initCount = Integer.parseInt(freeCount[0]);
      int recoverTime = Integer.parseInt(freeCount[1]);
      if (themeActivityDao.artifactData.random == -1) {
         themeActivityDao.artifactData.random = initCount;
         themeActivityDao.artifactData.randomRecoverTime = 0;
         themeActivityDao.updateOp();
      } else {
         if (themeActivityDao.artifactData.random < initCount) {
            if (themeActivityDao.artifactData.randomRecoverTime == 0) {
               themeActivityDao.artifactData.randomRecoverTime = curTime + recoverTime;
               themeActivityDao.updateOp();
            } else {
               while(themeActivityDao.artifactData.randomRecoverTime < curTime && themeActivityDao.artifactData.random < initCount) {
                  ActivityArtifactData var10000 = themeActivityDao.artifactData;
                  var10000.randomRecoverTime += recoverTime;
                  ++themeActivityDao.artifactData.random;
                  themeActivityDao.updateOp();
               }
            }
         }

         if (themeActivityDao.artifactData.random >= initCount) {
            themeActivityDao.artifactData.randomRecoverTime = 0;
            themeActivityDao.updateOp();
         }

      }
   }

   private boolean treasureMove() {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      if (themeActivityDao.artifactData.rollNum <= 0) {
         return false;
      } else {
         themeActivityDao.artifactData.grid = this.treasureMoveGrid(themeActivityDao.artifactData.rollNum);
         themeActivityDao.artifactData.rollNum = 0;
         themeActivityDao.updateOp();
         return true;
      }
   }

   private int treasureMoveGrid(int num) {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      int curGrid = themeActivityDao.artifactData.grid;
      int moveNum = num;
      Map<Integer, ArtifactGridModel> artifactGridModelMap = ApplicationContextProvider.<Integer, ArtifactGridModel>getModelPoolMap("artifactgrid");
      TreeMap<Integer, ArtifactGridModel> artifactGridModelTreeMap = new TreeMap(artifactGridModelMap);
      int loopCounter = 0;

      do {
         ++curGrid;
         ArtifactGridModel artifactGridModel = (ArtifactGridModel)artifactGridModelTreeMap.get(curGrid);
         if (artifactGridModel == null) {
            themeActivityDao.artifactData.lastBattle = 0;
            themeActivityDao.updateOp();
            curGrid = (Integer)artifactGridModelTreeMap.firstKey();
            artifactGridModel = (ArtifactGridModel)artifactGridModelTreeMap.firstEntry().getValue();
         }

         if (artifactGridModel.getGridType() == 1) {
            --moveNum;
         }

         ++loopCounter;
         if (loopCounter > 100) {
            (new RuntimeException("ArtifactActivityPart.treasureMoveGrid死循环了！！！！！！！")).printStackTrace();
            return 0;
         }
      } while(moveNum > 0);

      return curGrid;
   }

   private int checkTaskBoxReward(ArtifactBoxRewardModel artifactBoxRewardModel) {
      Map<Integer, TreeMap<Integer, ArtifactGridTaskModel>> taskModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customArtifactGridTask", this.getPlayerActivityId());
      if (taskModelMap != null && taskModelMap.containsKey(artifactBoxRewardModel.getDays()) && !((TreeMap)taskModelMap.get(artifactBoxRewardModel.getDays())).isEmpty()) {
         ActivityArtifactTaskPart activityArtifactTaskPart = (ActivityArtifactTaskPart)this.player.getMgrPart(ActivityArtifactTaskPart.class);

         for(Integer grid : artifactBoxRewardModel.getGridId()) {
            ArtifactGridTaskModel artifactGridTaskModel = (ArtifactGridTaskModel)((TreeMap)taskModelMap.get(artifactBoxRewardModel.getDays())).get(grid);
            if (artifactGridTaskModel == null) {
               return 0;
            }

            TaskData taskData = activityArtifactTaskPart.getTask(artifactGridTaskModel.getTaskId());
            if (taskData == null || taskData.state < 2) {
               return 3000;
            }
         }

         return 1;
      } else {
         return 0;
      }
   }

   private int getTotalActiveBox() {
      int totalActiveBox = 0;
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      totalActiveBox += themeActivityDao.artifactData.totalLineBoxes;
      Map<Integer, TreeMap<Integer, ArtifactBoxRewardModel>> boxModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, ArtifactBoxRewardModel>>getModelPoolMap("customArtifactBoxReward");

      for(ArtifactBoxRewardModel artifactBoxRewardModel : (MapUtil.getOrDefault(boxModelMap, themeActivityDao.artifactData.actDay, TreeMap.class)).values()) {
         if (this.checkTaskBoxReward(artifactBoxRewardModel) == 1) {
            ++totalActiveBox;
         }
      }

      return totalActiveBox;
   }

   private void taskBoxesReward() {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      List<ResourceModel> rewardList = new ArrayList();
      Map<Integer, TreeMap<Integer, ArtifactBoxRewardModel>> boxModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, ArtifactBoxRewardModel>>getModelPoolMap("customArtifactBoxReward");

      for(ArtifactBoxRewardModel artifactBoxRewardModel : (MapUtil.getOrDefault(boxModelMap, themeActivityDao.artifactData.actDay, TreeMap.class)).values()) {
         if (!themeActivityDao.artifactData.lineBoxes.contains(artifactBoxRewardModel.getId()) && this.checkTaskBoxReward(artifactBoxRewardModel) == 1) {
            rewardList.addAll(artifactBoxRewardModel.getRewards());
            themeActivityDao.artifactData.lineBoxes.add(artifactBoxRewardModel.getId());
         }
      }

      themeActivityDao.updateOp();
      if (!rewardList.isEmpty()) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> rewardMailMap = (TreeMap)allAwardModelMap.get(CentreAwardModel.TYPE_ARTIFACT_ACT_TASK_BOX);
         if (rewardMailMap == null) {
            return;
         }

         CentreAwardModel centreAwardModel = (CentreAwardModel)rewardMailMap.firstEntry().getValue();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), rewardList, 604800000L, 64, 6405);
      }

   }

   private void finalBoxesReward() {
      Map<Integer, ArtifactBoxActivateModel> artifactBoxActivateModelMap = ApplicationContextProvider.<Integer, ArtifactBoxActivateModel>getModelPoolMap("artifactboxactivate");
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      List<ResourceModel> rewardList = new ArrayList();
      int totalActiveBox = this.getTotalActiveBox();

      for(ArtifactBoxActivateModel artifactBoxActivateModel : artifactBoxActivateModelMap.values()) {
         if (!themeActivityDao.artifactData.finalBoxes.contains(artifactBoxActivateModel.getId()) && artifactBoxActivateModel.getActivateTime() <= totalActiveBox) {
            rewardList.addAll(artifactBoxActivateModel.getRewards());
            themeActivityDao.artifactData.finalBoxes.add(artifactBoxActivateModel.getId());
         }
      }

      themeActivityDao.updateOp();
      if (!rewardList.isEmpty()) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> rewardMailMap = (TreeMap)allAwardModelMap.get(CentreAwardModel.TYPE_ARTIFACT_ACT_FINAL_BOX);
         if (rewardMailMap == null) {
            return;
         }

         CentreAwardModel centreAwardModel = (CentreAwardModel)rewardMailMap.firstEntry().getValue();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), rewardList, 604800000L, 64, 6406);
      }

   }

   private int getAppointFree() {
      List<ResourceModel> resourceModels = this.configManager.getResourceModelList("appointDice", "1,9,0|1,9,150|1,9,300|1,9,450");
      int freeCount = 0;

      for(ResourceModel resourceModel : resourceModels) {
         if (resourceModel.getValue() == 0) {
            ++freeCount;
         }
      }

      return freeCount;
   }

   public void gmResetActivityData() {
      ActivityArtifactData artifactData = this.getArtifactData();
      artifactData.reset();
      this.updateArtifactData();
      this.sendInfo();
   }

   private void recordLog(List<ResourceModel> resourceModelList, String desc) {
      int tokenId = this.getArtifactToken();
      int num = 0;

      for(ResourceModel resourceModel : resourceModelList) {
         if (resourceModel.getId() == tokenId) {
            num += resourceModel.getValue();
         }
      }

      if (num != 0) {
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getServerActivityInfo().id, "神兵活动", tokenId + "-" + num, desc, 0, 0, 0);
      }
   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
      int day = this.getSeverActivityDay();
      List<ResourceModel> rewardList = new ArrayList();
      Map<Integer, TreeMap<Integer, ArtifactGridTaskModel>> taskModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customArtifactGridTask", this.getPlayerActivityId());
      if (taskModelMap != null && !taskModelMap.isEmpty() && taskModelMap.containsKey(day)) {
         ActivityArtifactTaskPart activityArtifactTaskPart = (ActivityArtifactTaskPart)this.player.getMgrPart(ActivityArtifactTaskPart.class);

         for(ArtifactGridTaskModel artifactGridTaskModel : (taskModelMap.get(day)).values()) {
            TaskData taskData = activityArtifactTaskPart.getTask(artifactGridTaskModel.getTaskId());
            if (taskData != null && taskData.state != 3) {
               SevenDaysTaskModel sevenDaysTaskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", artifactGridTaskModel.getTaskId());
               if (sevenDaysTaskModel != null) {
                  for(ResourceModel reward : sevenDaysTaskModel.getRewards()) {
                     reward.addResourceToList(rewardList);
                  }

                  taskData.finish();
               }
            }
         }
      }

      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      Map<Integer, TreeMap<Integer, ArtifactBoxRewardModel>> boxModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, ArtifactBoxRewardModel>>getModelPoolMap("customArtifactBoxReward");
      if (boxModelMap != null) {
         for(ArtifactBoxRewardModel artifactBoxRewardModel : (MapUtil.getOrDefault(boxModelMap, day, TreeMap.class)).values()) {
            if (!themeActivityDao.artifactData.lineBoxes.contains(artifactBoxRewardModel.getId())) {
               for(ResourceModel reward : artifactBoxRewardModel.getRewards()) {
                  reward.addResourceToList(rewardList);
               }

               themeActivityDao.artifactData.lineBoxes.add(artifactBoxRewardModel.getId());
            }
         }
      }

      Map<Integer, ArtifactBoxActivateModel> artifactBoxActivateModelMap = ApplicationContextProvider.<Integer, ArtifactBoxActivateModel>getModelPoolMap("artifactboxactivate");
      if (artifactBoxActivateModelMap != null) {
         for(ArtifactBoxActivateModel artifactBoxActivateModel : artifactBoxActivateModelMap.values()) {
            if (!themeActivityDao.artifactData.finalBoxes.contains(artifactBoxActivateModel.getId())) {
               for(ResourceModel reward : artifactBoxActivateModel.getRewards()) {
                  reward.addResourceToList(rewardList);
               }

               themeActivityDao.artifactData.finalBoxes.add(artifactBoxActivateModel.getId());
            }
         }
      }

      if (!mainOpen) {
         Map<Integer, ArtifactActivateModel> artifactActivateModelMap = ApplicationContextProvider.<Integer, ArtifactActivateModel>getModelPoolMap("artifactActivate");
         if (artifactActivateModelMap != null) {
            for(ArtifactActivateModel artifactActivateModel : artifactActivateModelMap.values()) {
               if (!themeActivityDao.artifactData.weaponBoxs.contains(artifactActivateModel.getId())) {
                  for(ResourceModel reward : artifactActivateModel.getRewards()) {
                     reward.addResourceToList(rewardList);
                  }

                  themeActivityDao.artifactData.weaponBoxs.add(artifactActivateModel.getId());
               }
            }
         }
      } else {
         TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
         taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ARTIFACT_ACTIVITY);
         themeActivityDao.artifactData.actDay = 0;
         themeActivityDao.artifactData.lineBoxes.clear();
         themeActivityDao.artifactData.finalBoxes.clear();
         themeActivityDao.artifactData.totalLineBoxes = 0;
      }

      themeActivityDao.updateOp();
      this.sendMergeMail(CentreAwardModel.TYPE_MERGE_ACT_NOT_FINISH_REWARD, rewardList);
   }
}
