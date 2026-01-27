package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ActivityPrizeModel;
import com.gzbz.model.BoxAwardModel;
import com.gzbz.model.ChongyangSignModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ChongYangMsg;
import com.gzbz.protobuf.PlayerMsg;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import misc.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ChongYangPart extends AbstractActivityPart {
   @Autowired
   ConfigManager configManager;

   public void sendInfo() {
   }

   public int getActivityType() {
      return 41;
   }

   public void resetDaily() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.chongYangData.freeFind = 0;
      playerActivityDao.updateOp();
   }

   public void rotateReset(int oldActivityId) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.chongYangData.freeFind = 0;
      playerActivityDao.chongYangData.roundNum = 0;
      playerActivityDao.chongYangData.luckNum = 0;
      playerActivityDao.chongYangData.signDays.clear();
      playerActivityDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_OpenUi_15801(ChongYangMsg.C2S_OpenUi_15801 msg, String source) {
      this.openUi();
   }

   @MsgHandlerAnno
   public void C2S_Sign_15813(ChongYangMsg.C2S_Sign_15813 msg, String source) {
      this.sign(msg.getDay());
   }

   @MsgHandlerAnno
   public void C2S_FindTreasure_15823(ChongYangMsg.C2S_FindTreasure_15823 msg, String source) {
      this.findTreasure(msg.getNum());
   }

   public void openUi() {
      ChongYangMsg.S2C_OpenUi_15802.Builder builder = ChongYangMsg.S2C_OpenUi_15802.newBuilder();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (!playerActivityDao.chongYangData.signDays.isEmpty()) {
         for(Map.Entry<Integer, Integer> entry : playerActivityDao.chongYangData.signDays.entrySet()) {
            ChongYangMsg.SignInfo.Builder info = ChongYangMsg.SignInfo.newBuilder();
            info.setDay((Integer)entry.getKey());
            info.setState((Integer)entry.getValue());
            builder.addInfos(info);
         }
      }

      builder.setTakedFreeNum(playerActivityDao.chongYangData.freeFind);
      builder.setRoundNum(playerActivityDao.chongYangData.roundNum);
      ActivityInfo activityInfo = this.getServerActivityInfo();
      int currendDay = DateUtil.difftimeDay(new Timestamp(1000L * (long)activityInfo.start)) + 1;
      builder.setDay(currendDay);
      this.player.sendMsg(builder.build());
   }

   public void sign(int day) {
      if (!this.isServerActivityInvalid()) {
         if (day < 1) {
            this.logger.error("玩家={}，重阳节签到活动天数错误={}", this.player.getPlayerId(), day);
         } else {
            ActivityInfo activityInfo = this.getServerActivityInfo();
            int currentDay = DateUtil.difftimeDay(new Timestamp(1000L * (long)activityInfo.start)) + 1;
            if (day > currentDay) {
               this.logger.error("玩家={}，领取天数错误，当前第{}天，领取={}天", new Object[]{this.player.getPlayerId(), currentDay, day});
            } else {
               PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
               if (!playerActivityDao.chongYangData.signDays.containsKey(day)) {
                  Map<Integer, ChongyangSignModel> chongyangSignModelMap = (Map)this.player.getGameModelPool().getEntity("customChongyangSign", activityInfo.id);
                  if (chongyangSignModelMap != null) {
                     ChongyangSignModel chongyangSignModel = (ChongyangSignModel)chongyangSignModelMap.get(day);
                     if (chongyangSignModel != null) {
                        int state = 1;
                        List<ResourceModel> needResourceList = null;
                        if (currentDay != day) {
                           needResourceList = this.configManager.getResourceModelList("ChongyangSign", "1|9|50");
                           if (needResourceList == null || needResourceList.isEmpty()) {
                              return;
                           }

                           if (!this.player.checkResourceNum(needResourceList)) {
                              return;
                           }

                           this.player.delResource((List)needResourceList, 8, 893, 0, 0, day + "");
                           state = 2;
                        }

                        this.player.addResource(chongyangSignModel.getItem(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 893, 0, 0, day + "");
                        playerActivityDao.chongYangData.signDays.put(day, state);
                        playerActivityDao.updateOp();
                        ChongYangMsg.S2C_SignInfo_15814.Builder builder = ChongYangMsg.S2C_SignInfo_15814.newBuilder();
                        builder.setResult(1);

                        for(Map.Entry<Integer, Integer> entry : playerActivityDao.chongYangData.signDays.entrySet()) {
                           ChongYangMsg.SignInfo.Builder info = ChongYangMsg.SignInfo.newBuilder();
                           info.setDay((Integer)entry.getKey());
                           info.setState((Integer)entry.getValue());
                           builder.addInfos(info);
                        }

                        this.player.sendMsg(builder.build());
                        int itemId = 0;
                        int itemNum = 0;
                        if (needResourceList != null) {
                           for(ResourceModel resourceModel : needResourceList) {
                              itemId = resourceModel.getId();
                              itemNum = resourceModel.getValue();
                           }
                        }

                        for(ResourceModel resourceModel : chongyangSignModel.getItem()) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "重九辞青-签到", itemId + "", itemNum + "", strings[0], strings[2], strings[1], "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public void findTreasure(int findNum) {
      if (findNum == 1 || findNum == 10) {
         if (!this.isServerActivityInvalid()) {
            ActivityInfo activityInfo = this.getServerActivityInfo();
            Map<Integer, ActivityPrizeModel> activityPrizeModelMap = (Map)this.player.getGameModelPool().getEntity("customActivityPrize", activityInfo.id);
            if (activityPrizeModelMap != null) {
               PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
               int chongyangTime = this.configManager.getIntDefault("ChongyangTime", 2);
               boolean isFree = true;
               List<ResourceModel> needList = new ArrayList();
               if (playerActivityDao.chongYangData.freeFind >= chongyangTime) {
                  isFree = false;
                  List<ResourceModel> resourceModels = this.configManager.getResourceModelList("ChongyangMould", "2|1186|1");
                  if (resourceModels.isEmpty()) {
                     return;
                  }

                  for(ResourceModel resourceModel : resourceModels) {
                     needList.add(new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * findNum));
                  }

                  if (!this.player.checkResourceNum(needList)) {
                     this.player.failure(61193);
                     return;
                  }
               } else if (findNum != 1) {
                  return;
               }

               List<Integer> awardList = this.configManager.getIntList("ChongyangGroup");
               if (!awardList.isEmpty()) {
                  List<ResourceModel> addList = new ArrayList();
                  List<Integer> chongyangTreasure = this.configManager.getIntList("ChongyangTreasure");
                  if (chongyangTreasure.size() >= 2) {
                     for(int i = 0; i < findNum; ++i) {
                        int awardGroupId = 0;
                        boolean isRoundAward = false;
                        boolean isLuck = false;
                        if (playerActivityDao.chongYangData.luckNum + 1 >= (Integer)chongyangTreasure.get(1)) {
                           awardGroupId = (Integer)chongyangTreasure.get(0);
                           isLuck = true;
                        } else {
                           ActivityPrizeModel activityPrizeModel = (ActivityPrizeModel)activityPrizeModelMap.get(playerActivityDao.chongYangData.roundNum + 1);
                           if (activityPrizeModel == null) {
                              return;
                           }

                           if (awardList.size() != activityPrizeModel.getProgressValue().size()) {
                              return;
                           }

                           int totalVal = 0;

                           for(Integer val : activityPrizeModel.getProgressValue()) {
                              totalVal += val;
                           }

                           int groupRandom = RandomUtil.randInt(totalVal);
                           int temp_val = 0;

                           for(int j = 0; j < activityPrizeModel.getProgressValue().size(); ++j) {
                              temp_val += (Integer)activityPrizeModel.getProgressValue().get(j);
                              if (temp_val > groupRandom) {
                                 awardGroupId = (Integer)awardList.get(j);
                                 if (j == activityPrizeModel.getProgressValue().size() - 1) {
                                    isRoundAward = true;
                                 }
                                 break;
                              }
                           }
                        }

                        Map<Integer, BoxAwardModel> boxAwardModelMap = (Map)this.player.getGameModelPool().getEntity("customBoxAward", awardGroupId);
                        if (boxAwardModelMap == null) {
                           return;
                        }

                        int totalWeight = 0;

                        for(Map.Entry<Integer, BoxAwardModel> entry : boxAwardModelMap.entrySet()) {
                           totalWeight += ((BoxAwardModel)entry.getValue()).getWeight();
                        }

                        int itemIdRandom = RandomUtil.randInt(totalWeight);
                        int itemIdTemp = 0;
                        BoxAwardModel boxAwardModel = null;

                        for(Map.Entry<Integer, BoxAwardModel> entry : boxAwardModelMap.entrySet()) {
                           itemIdTemp += ((BoxAwardModel)entry.getValue()).getWeight();
                           if (itemIdTemp > itemIdRandom) {
                              boxAwardModel = (BoxAwardModel)entry.getValue();
                              break;
                           }
                        }

                        if (boxAwardModel == null) {
                           return;
                        }

                        int num = RandomUtil.randInt(boxAwardModel.getMin(), boxAwardModel.getMax() + 1);
                        if (num <= 0) {
                           return;
                        }

                        ResourceModel addResource = new ResourceModel(boxAwardModel.getResourceType(), boxAwardModel.getResourceId(), num);
                        addList.add(addResource);
                        if (isLuck) {
                           playerActivityDao.chongYangData.roundNum = 0;
                           playerActivityDao.chongYangData.luckNum = 0;
                        } else if (isRoundAward) {
                           playerActivityDao.chongYangData.roundNum = 0;
                           ++playerActivityDao.chongYangData.luckNum;
                        } else {
                           ++playerActivityDao.chongYangData.roundNum;
                           ++playerActivityDao.chongYangData.luckNum;
                        }

                        playerActivityDao.updateOp();
                     }

                     if (isFree) {
                        ++playerActivityDao.chongYangData.freeFind;
                        playerActivityDao.updateOp();
                     } else {
                        this.player.delResource((List)needList, 8, 894, 0, 0, "");
                     }

                     this.player.addResource(addList, PlayerMsg.ShowType.SHOW_CHONG_YANG, 8, 894, 0, 0, findNum + "");
                     ChongYangMsg.S2C_FindTreasure_15824.Builder builder = ChongYangMsg.S2C_FindTreasure_15824.newBuilder();
                     builder.setResult(1);
                     builder.setTakedFreeNum(playerActivityDao.chongYangData.freeFind);
                     builder.setRoundNum(playerActivityDao.chongYangData.roundNum);
                     this.player.sendMsg(builder.build());
                     int itemId = 0;
                     int itemNum = 0;

                     for(ResourceModel resourceModel : needList) {
                        itemId = resourceModel.getId();
                        itemNum = resourceModel.getValue();
                     }

                     for(ResourceModel resourceModel : addList) {
                        String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                        this.player.getOperationMgr().addExtraLog(this.player, 198, "重九辞青-探宝", itemId + "", itemNum + "", strings[0], strings[2], strings[1], "0");
                     }

                  }
               }
            }
         }
      }
   }

   public void gmTest(String orderStr) {
      String[] orders = orderStr.split(",");
      if (orders.length < 1) {
         this.logger.info("GM命令参数错误，oder={}", orderStr);
      } else {
         String cmd = orders[0];
         cmd = cmd.toLowerCase();
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         switch (cmd) {
            case "clear":
               playerActivityDao.chongYangData.roundNum = 0;
               playerActivityDao.chongYangData.signDays.clear();
               playerActivityDao.chongYangData.freeFind = 0;
               playerActivityDao.chongYangData.luckNum = 0;
               playerActivityDao.updateOp();
               this.openUi();
            default:
         }
      }
   }
}
