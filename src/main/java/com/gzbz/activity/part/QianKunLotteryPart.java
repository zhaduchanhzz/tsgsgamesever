package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.BeautyTreasureData;
import com.gzbz.activity.bean.BeautyTreasureRecord;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.worldBean.ActivityData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.QianKunRewardNewModel;
import com.gzbz.model.QianKunSumTableNewModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.QianKunLotteryMsg;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.MapUtil;
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
public class QianKunLotteryPart extends AbstractActivityPart {
   static Logger logger = LoggerFactory.getLogger(QianKunLotteryPart.class);
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private ConfigManager configManager;
   public static final int BEAUTY_TREASURE_HIGH = 1;
   public static final int BEAUTY_TREASURE_COMMON = 2;
   public static final int INFINITY = -1;

   @MsgHandlerAnno
   public void C2S_QianKunLotteryInfo_19801(QianKunLotteryMsg.C2S_QianKunLotteryInfo_19801 msg, String source) {
      this.sendInfo();
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         QianKunLotteryMsg.S2C_QianKunLotteryInfo_19802.Builder builder = QianKunLotteryMsg.S2C_QianKunLotteryInfo_19802.newBuilder();
         builder.setStage(1);
         WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);

         for(BeautyTreasureRecord treasureRecord : ((ActivityData)worldDao.jsonData).qianKunLotteryHighRecord) {
            QianKunLotteryMsg.RecruitRecord.Builder record = QianKunLotteryMsg.RecruitRecord.newBuilder();
            record.setRecruitType(treasureRecord.recruitType);
            record.setPlayerName(treasureRecord.playerName);
            record.setPlayerId(treasureRecord.playerId);
            record.setServerId(treasureRecord.serverId);
            record.setAwardId(treasureRecord.awardId);
            record.setBroadcast(false);
            builder.addAllRecord(record);
         }

         for(BeautyTreasureRecord treasureRecord : ((ActivityData)worldDao.jsonData).qianKunLotteryCommonRecord) {
            QianKunLotteryMsg.RecruitRecord.Builder record = QianKunLotteryMsg.RecruitRecord.newBuilder();
            record.setRecruitType(treasureRecord.recruitType);
            record.setPlayerName(treasureRecord.playerName);
            record.setPlayerId(treasureRecord.playerId);
            record.setServerId(treasureRecord.serverId);
            record.setAwardId(treasureRecord.awardId);
            record.setBroadcast(false);
            builder.addAllRecord(record);
         }

         for(BeautyTreasureRecord treasureRecord : playerActivityDao.qianKunLottery.recordList) {
            QianKunLotteryMsg.RecruitRecord.Builder record = QianKunLotteryMsg.RecruitRecord.newBuilder();
            record.setRecruitType(treasureRecord.recruitType);
            record.setPlayerName(this.player.getPublicDao().playerName);
            record.setPlayerId(this.player.getPlayerId());
            record.setServerId(this.player.getServerId());
            record.setAwardId(treasureRecord.awardId);
            record.setBroadcast(false);
            builder.addMyRecord(record);
         }

         for(Map.Entry<Integer, Integer> entry : playerActivityDao.qianKunLottery.receiveRecord.entrySet()) {
            CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
            mapData.setKey((Integer)entry.getKey());
            mapData.setValue((Integer)entry.getValue());
            builder.addAwardList(mapData);
         }

         builder.setCommonRecruitNum(0);
         builder.setHighRecruitNum(0);
         if (playerActivityDao.qianKunLottery.historyRecord.containsKey(1) && ((Map)playerActivityDao.qianKunLottery.historyRecord.get(1)).containsKey(1)) {
            builder.setHighRecruitNum((Integer)((Map)playerActivityDao.qianKunLottery.historyRecord.get(1)).get(1));
         }

         if (playerActivityDao.qianKunLottery.historyRecord.containsKey(2) && ((Map)playerActivityDao.qianKunLottery.historyRecord.get(2)).containsKey(1)) {
            builder.setCommonRecruitNum((Integer)((Map)playerActivityDao.qianKunLottery.historyRecord.get(2)).get(1));
         }

         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int commonNum = (Integer)playerResetCustomCache.getDailyNum(36, 0);
         int highNum = (Integer)playerResetCustomCache.getDailyNum(37, 0);
         builder.setCommonDrawNum(commonNum);
         builder.setHighDrawNum(highNum);
         builder.setActivityStartDay(this.getActivityOpenDay());
         int freeTimes = (Integer)playerResetCustomCache.getDailyNum(541, 0);
         builder.setFreeRecruit(freeTimes);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_RecruitResult_19806(QianKunLotteryMsg.C2S_RecruitResult_19806 msg, String source) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      QianKunLotteryMsg.S2C_RecruitResult_19807.Builder builder = QianKunLotteryMsg.S2C_RecruitResult_19807.newBuilder();

      for(BeautyTreasureRecord treasureRecord : playerActivityDao.qianKunLottery.recordList) {
         QianKunLotteryMsg.RecruitRecord.Builder record = QianKunLotteryMsg.RecruitRecord.newBuilder();
         record.setRecruitType(treasureRecord.recruitType);
         record.setPlayerName(this.player.getPublicDao().playerName);
         record.setPlayerId(this.player.getPlayerId());
         record.setServerId(this.player.getServerId());
         record.setAwardId(treasureRecord.awardId);
         record.setBroadcast(false);
         builder.addMyRecord(record);
      }

      for(Map.Entry<Integer, Integer> entry : playerActivityDao.qianKunLottery.receiveRecord.entrySet()) {
         CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
         mapData.setKey((Integer)entry.getKey());
         mapData.setValue((Integer)entry.getValue());
         builder.addAwardList(mapData);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_RecruitQianKunLottery_19803(QianKunLotteryMsg.C2S_RecruitQianKunLottery_19803 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         QianKunLotteryMsg.S2C_RecruitQianKunLottery_19804.Builder builder = QianKunLotteryMsg.S2C_RecruitQianKunLottery_19804.newBuilder();
         BeautyTreasureData data = playerActivityDao.qianKunLottery;
         int num = msg.getRecruitNum();
         String beautyTreasureTime = this.configManager.getStrByDefault("beautyTreasureTime", "1|10|50");
         String[] timesStr = beautyTreasureTime.split("\\|");
         boolean timesFlag = false;

         for(int i = 0; i < timesStr.length; ++i) {
            if (num == Integer.parseInt(timesStr[i])) {
               timesFlag = true;
               break;
            }
         }

         if (!timesFlag) {
            logger.error("乾坤排期抽奖抽取次数错误：" + num);
         } else {
            QianKunSumTableNewModel treasureModel = null;
            Map<Integer, QianKunSumTableNewModel> treasureMap = this.player.getGameModelPool().getMap("qianKunSumTableNew");

            for(QianKunSumTableNewModel model : treasureMap.values()) {
               if (model.getId() == msg.getRecruitType() && model.getActId() == this.getPlayerActivityId()) {
                  treasureModel = model;
                  break;
               }
            }

            if (treasureModel != null) {
               if (treasureModel.getActType() != this.getActivityType()) {
                  logger.error("抽奖id活动类型不一致！");
               } else {
                  int type = treasureModel.getShowType();
                  if (!ResourceModel.checkTotalNumError((Integer)treasureModel.getSpend().get(2), num)) {
                     PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
                     int freeTimes = (Integer)playerResetCustomCache.getDailyNum(541, 0);
                     if ((type != 2 || freeTimes != 0 || num != 1) && !this.player.checkResourceNum((Integer)treasureModel.getSpend().get(0), (Integer)treasureModel.getSpend().get(1), (Integer)treasureModel.getSpend().get(2) * num)) {
                        if (type == 1) {
                           this.player.failure(76018);
                        } else {
                           this.player.failure(76019);
                        }

                     } else {
                        int maxNum = this.configManager.getIntDefault("LotteryLimit", 99999);
                        if (type == 1) {
                           int highNum = (Integer)playerResetCustomCache.getDailyNum(37, 0);
                           if (highNum + num > maxNum) {
                              this.player.failure(51);
                              return;
                           }
                        } else {
                           int commonNum = (Integer)playerResetCustomCache.getDailyNum(36, 0);
                           if (commonNum + num > maxNum) {
                              this.player.failure(51);
                              return;
                           }
                        }

                        int awardGroup = treasureModel.getGroup1();
                        Map<Integer, QianKunRewardNewModel> modelMap = this.player.getGameModelPool().getMap("qianKunRewardNew");
                        List<QianKunRewardNewModel> lotteryModelList = this.getLotteryModelList(awardGroup);
                        if (lotteryModelList.isEmpty()) {
                           logger.error("未获取到乾坤抽奖奖励列表，请检查配置！");
                        } else {
                           List<Integer> targetList = new ArrayList();

                           for(int i = 0; i < num; ++i) {
                              for(QianKunRewardNewModel model : lotteryModelList) {
                                 if (data.historyRecord.containsKey(type)) {
                                    MapUtil.mapPlusInt((Map)data.historyRecord.get(type), model.getForm(), 1);
                                 } else {
                                    Map<Integer, Integer> tempMap = new HashMap();
                                    data.historyRecord.put(type, tempMap);
                                    MapUtil.mapPlusInt((Map)data.historyRecord.get(type), model.getForm(), 1);
                                 }
                              }

                              int targetId = this.recruitOneAward(lotteryModelList, data, type);
                              if (targetId != 0) {
                                 MapUtil.mapPlusInt(data.receiveRecord, targetId, 1);
                                 if (((QianKunRewardNewModel)modelMap.get(targetId)).getTrue3() > 0) {
                                    BeautyTreasureRecord record = new BeautyTreasureRecord();
                                    record.recruitType = type;
                                    record.awardId = targetId;
                                    data.recordList.add(record);
                                    if (data.recordList.size() > treasureModel.getCodeTimes()) {
                                       data.recordList.remove(0);
                                    }
                                 }

                                 targetList.add(targetId);
                                 if (data.historyRecord.containsKey(type) && ((Map)data.historyRecord.get(type)).containsKey(((QianKunRewardNewModel)modelMap.get(targetId)).getForm())) {
                                    ((Map)data.historyRecord.get(type)).put(((QianKunRewardNewModel)modelMap.get(targetId)).getForm(), 0);
                                 }
                              }
                           }

                           List<Integer> formList = new ArrayList();

                           for(QianKunRewardNewModel model : lotteryModelList) {
                              formList.add(model.getForm());
                           }

                           Collections.sort(formList);
                           List<ResourceModel> awardList = new ArrayList();
                           List<Integer> broadcastList = new ArrayList();

                           for(Integer form : formList) {
                              for(Integer targetId : targetList) {
                                 if (!modelMap.containsKey(targetId)) {
                                    logger.error("新乾坤排期抽奖奖励id错误：" + targetId);
                                 } else if (((QianKunRewardNewModel)modelMap.get(targetId)).getForm() == form) {
                                    builder.addResultList(targetId);

                                    for(ResourceModel reward : ((QianKunRewardNewModel)modelMap.get(targetId)).getRewards()) {
                                       awardList.add(new ResourceModel(reward.getType(), reward.getId(), reward.getValue()));
                                    }

                                    if (((QianKunRewardNewModel)modelMap.get(targetId)).getTrue3() > 0) {
                                       broadcastList.add(targetId);
                                    }
                                 }
                              }
                           }

                           playerActivityDao.updateOp();
                           if (type == 1) {
                              playerResetCustomCache.addDailyReset(37, num);
                           } else {
                              playerResetCustomCache.addDailyReset(36, num);
                           }

                           if (type == 2 && freeTimes == 0 && num == 1) {
                              playerResetCustomCache.addDailyReset(541, 1);
                           } else {
                              this.player.delResource((Integer)treasureModel.getSpend().get(0), (Integer)treasureModel.getSpend().get(1), (long)((Integer)treasureModel.getSpend().get(2) * num), 8, 8228, 0, 0, "");
                           }

                           this.player.addResource(awardList, PlayerMsg.ShowType.SHOW_BEAUTY_TREASURE, 8, 8227, 0, 0, "");
                           builder.setStage(data.stage);
                           int commonNum = (Integer)playerResetCustomCache.getDailyNum(36, 0);
                           int highNum = (Integer)playerResetCustomCache.getDailyNum(37, 0);
                           int freeFlag = (Integer)playerResetCustomCache.getDailyNum(541, 0);
                           builder.setCommonDrawNum(commonNum);
                           builder.setHighDrawNum(highNum);
                           builder.setFreeRecruit(freeFlag);
                           this.player.sendMsg(builder.build());
                           if (!broadcastList.isEmpty()) {
                              QianKunLotteryMsg.S2S_RecruitRecord_19808.Builder crossBuilder = QianKunLotteryMsg.S2S_RecruitRecord_19808.newBuilder();

                              for(Integer id : broadcastList) {
                                 if (modelMap.containsKey(id)) {
                                    QianKunRewardNewModel model = (QianKunRewardNewModel)modelMap.get(id);
                                    QianKunLotteryMsg.RecruitRecord.Builder recordBuilder = QianKunLotteryMsg.RecruitRecord.newBuilder();
                                    recordBuilder.setAwardId(id);
                                    if (model.getTrue4() > 0) {
                                       recordBuilder.setBroadcast(true);
                                    } else {
                                       recordBuilder.setBroadcast(false);
                                    }

                                    recordBuilder.setServerId(this.player.getServerId());
                                    recordBuilder.setPlayerId(this.player.getPlayerId());
                                    recordBuilder.setPlayerName(this.player.getPublicDao().playerName);
                                    recordBuilder.setRecruitType(type);
                                    crossBuilder.addRecord(recordBuilder);
                                 }
                              }

                              this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), crossBuilder.build());
                           }

                           int itemId = (Integer)treasureModel.getSpend().get(1);
                           int realNum = (Integer)treasureModel.getSpend().get(2) * num;

                           for(ResourceModel resourceModel : awardList) {
                              String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                              this.player.getOperationMgr().addExtraLog(this.player, 198, "新乾坤排期抽奖", itemId + "", realNum + "", strings[0], strings[2], strings[1], "0");
                           }

                        }
                     }
                  }
               }
            }
         }
      }
   }

   public int recruitOneAward(List<QianKunRewardNewModel> modelList, BeautyTreasureData data, int type) {
      List<KeyValFun> funList = new ArrayList();

      for(QianKunRewardNewModel model : modelList) {
         int recruitNum = 0;
         int receiveNum = 0;
         if (data.historyRecord.containsKey(type) && ((Map)data.historyRecord.get(type)).containsKey(model.getForm())) {
            recruitNum = (Integer)((Map)data.historyRecord.get(type)).get(model.getForm());
         }

         if (data.receiveRecord.containsKey(model.getId())) {
            receiveNum = (Integer)data.receiveRecord.get(model.getId());
         }

         if (model.getTimes3() <= 0 || receiveNum < model.getTimes3()) {
            if (model.getTrue1() > 0 && recruitNum >= model.getTimes1()) {
               if (model.getTrue2() > 0 && model.getTimes2() > 0 && recruitNum >= model.getTimes2()) {
                  funList.clear();
                  funList.add(new KeyValFun(model.getId(), model.getOdd2()));
                  break;
               }

               funList.add(new KeyValFun(model.getId(), model.getOdd2()));
            } else if (model.getTrue1() == 0) {
               funList.add(new KeyValFun(model.getId(), model.getOdd2()));
            }
         }
      }

      if (funList.isEmpty()) {
         logger.error("新乾坤排期抽奖未获取到数据!!!!!");
         return 0;
      } else {
         int targetId = GamePlayer.countRate(funList);
         return targetId;
      }
   }

   public int getActivityType() {
      return 74;
   }

   public void rotateReset(int oldActivityId) {
      this.resetData();
      ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
      shopPart.resetShopById(39);
      this.clearActivityGift(24);
   }

   public void resetData() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.qianKunLottery.recordList.clear();
      playerActivityDao.qianKunLottery.receiveRecord.clear();
      playerActivityDao.qianKunLottery.historyRecord.clear();
      playerActivityDao.qianKunLottery.stage = 1;
      playerActivityDao.updateOp();
   }

   public List<QianKunRewardNewModel> getLotteryModelList(int awardGroup) {
      List<QianKunRewardNewModel> modelList = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      Map<Integer, QianKunRewardNewModel> allMap = this.player.getGameModelPool().getMap("qianKunRewardNew");
      if (allMap != null && allMap.size() > 0) {
         for(QianKunRewardNewModel model : allMap.values()) {
            if (model.getDateEnd() == -1) {
               if (activityStartDay >= model.getDateStart() && model.getGroup() == awardGroup) {
                  modelList.add(model);
               }
            } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd() && model.getGroup() == awardGroup) {
               modelList.add(model);
            }
         }

         return modelList;
      } else {
         return modelList;
      }
   }
}
