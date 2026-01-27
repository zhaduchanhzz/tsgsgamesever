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
import com.gzbz.model.QianKunRewardModel;
import com.gzbz.model.QianKunSumTableModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.QianKunTreasureMsg;
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
public class QianKunTreasurePart extends AbstractActivityPart {
   static Logger logger = LoggerFactory.getLogger(QianKunTreasurePart.class);
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private ConfigManager configManager;
   public static final int BEAUTY_TREASURE_HIGH = 1;
   public static final int BEAUTY_TREASURE_COMMON = 2;
   public static final String BEAUTY_CHAT_1 = "beautyChat1";
   public static final String BEAUTY_CHAT_2 = "beautyChat2";

   @MsgHandlerAnno
   public void C2S_QianKunTreasureInfo_17701(QianKunTreasureMsg.C2S_QianKunTreasureInfo_17701 msg, String source) {
      this.sendInfo();
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         QianKunTreasureMsg.S2C_QianKunTreasureInfo_17702.Builder builder = QianKunTreasureMsg.S2C_QianKunTreasureInfo_17702.newBuilder();
         builder.setStage(1);
         WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);

         for(BeautyTreasureRecord treasureRecord : ((ActivityData)worldDao.jsonData).qianKunTreasureHighRecord) {
            QianKunTreasureMsg.RecruitRecord.Builder record = QianKunTreasureMsg.RecruitRecord.newBuilder();
            record.setRecruitType(treasureRecord.recruitType);
            record.setPlayerName(treasureRecord.playerName);
            record.setPlayerId(treasureRecord.playerId);
            record.setServerId(treasureRecord.serverId);
            record.setAwardId(treasureRecord.awardId);
            record.setBroadcast(false);
            builder.addAllRecord(record);
         }

         for(BeautyTreasureRecord treasureRecord : ((ActivityData)worldDao.jsonData).qianKunTreasureCommonRecord) {
            QianKunTreasureMsg.RecruitRecord.Builder record = QianKunTreasureMsg.RecruitRecord.newBuilder();
            record.setRecruitType(treasureRecord.recruitType);
            record.setPlayerName(treasureRecord.playerName);
            record.setPlayerId(treasureRecord.playerId);
            record.setServerId(treasureRecord.serverId);
            record.setAwardId(treasureRecord.awardId);
            record.setBroadcast(false);
            builder.addAllRecord(record);
         }

         for(BeautyTreasureRecord treasureRecord : playerActivityDao.qianKunTreasure.recordList) {
            QianKunTreasureMsg.RecruitRecord.Builder record = QianKunTreasureMsg.RecruitRecord.newBuilder();
            record.setRecruitType(treasureRecord.recruitType);
            record.setPlayerName(this.player.getPublicDao().playerName);
            record.setPlayerId(this.player.getPlayerId());
            record.setServerId(this.player.getServerId());
            record.setAwardId(treasureRecord.awardId);
            record.setBroadcast(false);
            builder.addMyRecord(record);
         }

         for(Map.Entry<Integer, Integer> entry : playerActivityDao.qianKunTreasure.receiveRecord.entrySet()) {
            CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
            mapData.setKey((Integer)entry.getKey());
            mapData.setValue((Integer)entry.getValue());
            builder.addAwardList(mapData);
         }

         builder.setCommonRecruitNum(0);
         builder.setHighRecruitNum(0);
         if (playerActivityDao.qianKunTreasure.historyRecord.containsKey(1) && ((Map)playerActivityDao.qianKunTreasure.historyRecord.get(1)).containsKey(1)) {
            builder.setHighRecruitNum((Integer)((Map)playerActivityDao.qianKunTreasure.historyRecord.get(1)).get(1));
         }

         if (playerActivityDao.qianKunTreasure.historyRecord.containsKey(2) && ((Map)playerActivityDao.qianKunTreasure.historyRecord.get(2)).containsKey(1)) {
            builder.setCommonRecruitNum((Integer)((Map)playerActivityDao.qianKunTreasure.historyRecord.get(2)).get(1));
         }

         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int commonNum = (Integer)playerResetCustomCache.getDailyNum(24, 0);
         int highNum = (Integer)playerResetCustomCache.getDailyNum(25, 0);
         builder.setCommonDrawNum(commonNum);
         builder.setHighDrawNum(highNum);
         int freeTimes = (Integer)playerResetCustomCache.getDailyNum(540, 0);
         builder.setFreeRecruit(freeTimes);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_RecruitResult_17706(QianKunTreasureMsg.C2S_RecruitResult_17706 msg, String source) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      QianKunTreasureMsg.S2C_RecruitResult_17707.Builder builder = QianKunTreasureMsg.S2C_RecruitResult_17707.newBuilder();

      for(BeautyTreasureRecord treasureRecord : playerActivityDao.qianKunTreasure.recordList) {
         QianKunTreasureMsg.RecruitRecord.Builder record = QianKunTreasureMsg.RecruitRecord.newBuilder();
         record.setRecruitType(treasureRecord.recruitType);
         record.setPlayerName(this.player.getPublicDao().playerName);
         record.setPlayerId(this.player.getPlayerId());
         record.setServerId(this.player.getServerId());
         record.setAwardId(treasureRecord.awardId);
         record.setBroadcast(false);
         builder.addMyRecord(record);
      }

      for(Map.Entry<Integer, Integer> entry : playerActivityDao.qianKunTreasure.receiveRecord.entrySet()) {
         CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
         mapData.setKey((Integer)entry.getKey());
         mapData.setValue((Integer)entry.getValue());
         builder.addAwardList(mapData);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_RecruitQianKunTreasure_17703(QianKunTreasureMsg.C2S_RecruitQianKunTreasure_17703 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         QianKunTreasureMsg.S2C_RecruitQianKunTreasure_17704.Builder builder = QianKunTreasureMsg.S2C_RecruitQianKunTreasure_17704.newBuilder();
         BeautyTreasureData data = playerActivityDao.qianKunTreasure;
         int num = msg.getRecruitNum();
         String beautyTreasureTime = this.configManager.getStrByDefault("beautyTreasureTime", "1|10|50");
         String[] timesStr = beautyTreasureTime.split("\\|");
         if (num != Integer.parseInt(timesStr[0]) && num != Integer.parseInt(timesStr[1]) && num != Integer.parseInt(timesStr[2])) {
            logger.error("红颜探宝抽取次数错误：" + num);
         } else {
            QianKunSumTableModel treasureModel = null;
            Map<Integer, QianKunSumTableModel> treasureMap = this.player.getGameModelPool().getMap("qianKunSumTable");

            for(QianKunSumTableModel model : treasureMap.values()) {
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
                     int freeTimes = (Integer)playerResetCustomCache.getDailyNum(540, 0);
                     if ((type != 2 || freeTimes != 0 || num != 1) && !this.player.checkResourceNum((Integer)treasureModel.getSpend().get(0), (Integer)treasureModel.getSpend().get(1), (Integer)treasureModel.getSpend().get(2) * num)) {
                        if (type == 1) {
                           this.player.failure(76018);
                        } else {
                           this.player.failure(76019);
                        }

                     } else {
                        int maxNum = this.configManager.getIntDefault("LotteryLimit", 99999);
                        if (type == 1) {
                           int highNum = (Integer)playerResetCustomCache.getDailyNum(25, 0);
                           if (highNum + num > maxNum) {
                              this.player.failure(51);
                              return;
                           }
                        } else {
                           int commonNum = (Integer)playerResetCustomCache.getDailyNum(24, 0);
                           if (commonNum + num > maxNum) {
                              this.player.failure(51);
                              return;
                           }
                        }

                        int awardGroup = treasureModel.getGroup1();
                        Map<Integer, QianKunRewardModel> modelMap = this.player.getGameModelPool().getMap("qianKunReward");
                        List<QianKunRewardModel> modelList = new ArrayList();

                        for(QianKunRewardModel model : modelMap.values()) {
                           if (model.getGroup() == awardGroup) {
                              modelList.add(model);
                           }
                        }

                        if (modelList.isEmpty()) {
                           logger.error("未取到红颜探宝数据！！！！");
                        } else {
                           List<Integer> targetList = new ArrayList();

                           for(int i = 0; i < num; ++i) {
                              for(QianKunRewardModel model : modelList) {
                                 if (data.historyRecord.containsKey(type)) {
                                    MapUtil.mapPlusInt((Map)data.historyRecord.get(type), model.getForm(), 1);
                                 } else {
                                    Map<Integer, Integer> tempMap = new HashMap();
                                    data.historyRecord.put(type, tempMap);
                                    MapUtil.mapPlusInt((Map)data.historyRecord.get(type), model.getForm(), 1);
                                 }
                              }

                              int targetId = this.recruitOneAward(modelList, data, type);
                              if (targetId != 0) {
                                 MapUtil.mapPlusInt(data.receiveRecord, targetId, 1);
                                 if (((QianKunRewardModel)modelMap.get(targetId)).getTrue3() > 0) {
                                    BeautyTreasureRecord record = new BeautyTreasureRecord();
                                    record.recruitType = type;
                                    record.awardId = targetId;
                                    data.recordList.add(record);
                                    if (data.recordList.size() > treasureModel.getCodeTimes()) {
                                       data.recordList.remove(0);
                                    }
                                 }

                                 targetList.add(targetId);
                                 if (data.historyRecord.containsKey(type) && ((Map)data.historyRecord.get(type)).containsKey(((QianKunRewardModel)modelMap.get(targetId)).getForm())) {
                                    ((Map)data.historyRecord.get(type)).put(((QianKunRewardModel)modelMap.get(targetId)).getForm(), 0);
                                 }
                              }
                           }

                           List<Integer> formList = new ArrayList();

                           for(QianKunRewardModel model : modelList) {
                              formList.add(model.getForm());
                           }

                           Collections.sort(formList);
                           List<ResourceModel> awardList = new ArrayList();
                           List<Integer> broadcastList = new ArrayList();

                           for(Integer form : formList) {
                              for(Integer targetId : targetList) {
                                 if (!modelMap.containsKey(targetId)) {
                                    logger.error("红颜探宝奖励id错误：" + targetId);
                                 } else if (((QianKunRewardModel)modelMap.get(targetId)).getForm() == form) {
                                    builder.addResultList(targetId);

                                    for(ResourceModel reward : ((QianKunRewardModel)modelMap.get(targetId)).getRewards()) {
                                       awardList.add(new ResourceModel(reward.getType(), reward.getId(), reward.getValue()));
                                    }

                                    if (((QianKunRewardModel)modelMap.get(targetId)).getTrue3() > 0) {
                                       broadcastList.add(targetId);
                                    }

                                    if (((QianKunRewardModel)modelMap.get(targetId)).getTrue4() > 0) {
                                    }
                                 }
                              }
                           }

                           playerActivityDao.updateOp();
                           if (type == 1) {
                              playerResetCustomCache.addDailyReset(25, num);
                           } else {
                              playerResetCustomCache.addDailyReset(24, num);
                           }

                           this.player.addResource(awardList, PlayerMsg.ShowType.SHOW_BEAUTY_TREASURE, 8, 8217, 0, 0, "");
                           if (type == 2 && freeTimes == 0 && num == 1) {
                              playerResetCustomCache.addDailyReset(540, 1);
                           } else {
                              this.player.delResource((Integer)treasureModel.getSpend().get(0), (Integer)treasureModel.getSpend().get(1), (long)((Integer)treasureModel.getSpend().get(2) * num), 8, 8218, 0, 0, "");
                           }

                           builder.setStage(data.stage);
                           int commonNum = (Integer)playerResetCustomCache.getDailyNum(24, 0);
                           int highNum = (Integer)playerResetCustomCache.getDailyNum(25, 0);
                           builder.setCommonDrawNum(commonNum);
                           builder.setHighDrawNum(highNum);
                           int freeFlag = (Integer)playerResetCustomCache.getDailyNum(540, 0);
                           builder.setFreeRecruit(freeFlag);
                           this.player.sendMsg(builder.build());
                           if (!broadcastList.isEmpty()) {
                              QianKunTreasureMsg.S2S_RecruitRecord_17708.Builder crossBuilder = QianKunTreasureMsg.S2S_RecruitRecord_17708.newBuilder();

                              for(Integer id : broadcastList) {
                                 if (modelMap.containsKey(id)) {
                                    QianKunRewardModel model = (QianKunRewardModel)modelMap.get(id);
                                    QianKunTreasureMsg.RecruitRecord.Builder recordBuilder = QianKunTreasureMsg.RecruitRecord.newBuilder();
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
                              this.player.getOperationMgr().addExtraLog(this.player, 198, "乾坤探宝", itemId + "", realNum + "", strings[0], strings[2], strings[1], "0");
                           }

                        }
                     }
                  }
               }
            }
         }
      }
   }

   public int recruitOneAward(List<QianKunRewardModel> modelList, BeautyTreasureData data, int type) {
      List<KeyValFun> funList = new ArrayList();

      for(QianKunRewardModel model : modelList) {
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
         logger.error("红颜夺宝未获取到数据!!!!!");
         return 0;
      } else {
         int targetId = GamePlayer.countRate(funList);
         return targetId;
      }
   }

   public int getActivityType() {
      return 61;
   }

   public void rotateReset(int oldActivityId) {
      this.resetData();
      ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
      shopPart.resetShopById(38);
      this.clearActivityGift(24);
   }

   public void resetData() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.qianKunTreasure.recordList.clear();
      playerActivityDao.qianKunTreasure.receiveRecord.clear();
      playerActivityDao.qianKunTreasure.historyRecord.clear();
      playerActivityDao.qianKunTreasure.stage = 1;
      playerActivityDao.updateOp();
   }

   public void gmOp(int op) {
      if (op == 99) {
         this.test();
      } else {
         this.resetData();
      }

   }

   public void test() {
      QianKunTreasureMsg.C2S_RecruitQianKunTreasure_17703.Builder aa = QianKunTreasureMsg.C2S_RecruitQianKunTreasure_17703.newBuilder();
      aa.setStage(2);
      aa.setRecruitType(1);
      aa.setRecruitNum(10);
      this.C2S_RecruitQianKunTreasure_17703(aa.build(), "");
   }
}
