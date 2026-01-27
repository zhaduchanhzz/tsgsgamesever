package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.BeautyTreasureData;
import com.gzbz.activity.bean.BeautyTreasureRecord;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.worldBean.ActivityData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.BeautyMainModel;
import com.gzbz.model.BeautyTreasureModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BeautyTreasureRotateMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
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
public class BeautyTreasureRotatePart extends AbstractActivityPart {
   static Logger logger = LoggerFactory.getLogger(BeautyTreasureRotatePart.class);
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private ConfigManager configManager;
   public static final int BEAUTY_TREASURE_HIGH = 3;
   public static final int BEAUTY_TREASURE_COMMON = 4;
   public static final int BEAUTY_TREASURE_STAGE_1 = 1;
   public static final int BEAUTY_TREASURE_STAGE_2 = 2;
   public static final int BEAUTY_TREASURE_STAGE_3 = 3;
   public static final String BEAUTY_CHAT_1 = "beautyChat1";
   public static final String BEAUTY_CHAT_2 = "beautyChat2";

   @MsgHandlerAnno
   public void C2S_BeautyTreasureInfo_9901(BeautyTreasureRotateMsg.C2S_BeautyTreasureInfo_9901 msg, String source) {
      this.sendInfo();
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         this.checkStage(playerActivityDao);
         BeautyTreasureRotateMsg.S2C_BeautyTreasureInfo_9902.Builder builder = BeautyTreasureRotateMsg.S2C_BeautyTreasureInfo_9902.newBuilder();
         builder.setStage(playerActivityDao.beautyTreasureRotate.stage);
         WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);

         for(BeautyTreasureRecord treasureRecord : ((ActivityData)worldDao.jsonData).beautyTreasureRotateRecord) {
            BeautyTreasureRotateMsg.RecruitRecord.Builder record = BeautyTreasureRotateMsg.RecruitRecord.newBuilder();
            record.setRecruitType(treasureRecord.recruitType);
            record.setPlayerName(treasureRecord.playerName);
            record.setPlayerId(treasureRecord.playerId);
            record.setServerId(treasureRecord.serverId);
            record.setAwardId(treasureRecord.awardId);
            record.setBroadcast(false);
            builder.addAllRecord(record);
         }

         for(BeautyTreasureRecord treasureRecord : playerActivityDao.beautyTreasureRotate.recordList) {
            BeautyTreasureRotateMsg.RecruitRecord.Builder record = BeautyTreasureRotateMsg.RecruitRecord.newBuilder();
            record.setRecruitType(treasureRecord.recruitType);
            record.setPlayerName(this.player.getPublicDao().playerName);
            record.setPlayerId(this.player.getPlayerId());
            record.setServerId(this.player.getServerId());
            record.setAwardId(treasureRecord.awardId);
            record.setBroadcast(false);
            builder.addMyRecord(record);
         }

         for(Map.Entry<Integer, Integer> entry : playerActivityDao.beautyTreasureRotate.receiveRecord.entrySet()) {
            CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
            mapData.setKey((Integer)entry.getKey());
            mapData.setValue((Integer)entry.getValue());
            builder.addAwardList(mapData);
         }

         builder.setCommonRecruitNum(0);
         builder.setHighRecruitNum(0);
         if (playerActivityDao.beautyTreasureRotate.historyRecord.containsKey(3) && ((Map)playerActivityDao.beautyTreasureRotate.historyRecord.get(3)).containsKey(1)) {
            builder.setHighRecruitNum((Integer)((Map)playerActivityDao.beautyTreasureRotate.historyRecord.get(3)).get(1));
         }

         if (playerActivityDao.beautyTreasureRotate.historyRecord.containsKey(4) && ((Map)playerActivityDao.beautyTreasureRotate.historyRecord.get(4)).containsKey(1)) {
            builder.setCommonRecruitNum((Integer)((Map)playerActivityDao.beautyTreasureRotate.historyRecord.get(4)).get(1));
         }

         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int commonNum = (Integer)playerResetCustomCache.getDailyNum(22, 0);
         int highNum = (Integer)playerResetCustomCache.getDailyNum(23, 0);
         builder.setCommonDrawNum(commonNum);
         builder.setHighDrawNum(highNum);
         int freeTimes = (Integer)playerResetCustomCache.getDailyNum(543, 0);
         builder.setFreeRecruit(freeTimes);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_RecruitResult_9906(BeautyTreasureRotateMsg.C2S_RecruitResult_9906 msg, String source) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      BeautyTreasureRotateMsg.S2C_RecruitResult_9907.Builder builder = BeautyTreasureRotateMsg.S2C_RecruitResult_9907.newBuilder();

      for(BeautyTreasureRecord treasureRecord : playerActivityDao.beautyTreasureRotate.recordList) {
         BeautyTreasureRotateMsg.RecruitRecord.Builder record = BeautyTreasureRotateMsg.RecruitRecord.newBuilder();
         record.setRecruitType(treasureRecord.recruitType);
         record.setPlayerName(this.player.getPublicDao().playerName);
         record.setPlayerId(this.player.getPlayerId());
         record.setServerId(this.player.getServerId());
         record.setAwardId(treasureRecord.awardId);
         record.setBroadcast(false);
         builder.addMyRecord(record);
      }

      for(Map.Entry<Integer, Integer> entry : playerActivityDao.beautyTreasureRotate.receiveRecord.entrySet()) {
         CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
         mapData.setKey((Integer)entry.getKey());
         mapData.setValue((Integer)entry.getValue());
         builder.addAwardList(mapData);
      }

      this.player.sendMsg(builder.build());
   }

   public void checkStage(PlayerActivityDao playerActivityDao) {
      BeautyMainModel beautyMainModel = (BeautyMainModel)this.player.getGameModelPool().getEntity("beautyMain", 3);
      if (playerActivityDao.beautyTreasureRotate.stage == 1) {
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         if (curTime >= this.getPlayerActivityInfo().start + (Integer)beautyMainModel.getTimes().get(0)) {
            playerActivityDao.beautyTreasureRotate.stage = 2;
            playerActivityDao.updateOp();
         }

         if (curTime >= this.getPlayerActivityInfo().start + (Integer)beautyMainModel.getTimes().get(0) + (Integer)beautyMainModel.getTimes().get(1)) {
            playerActivityDao.beautyTreasureRotate.stage = 3;
            playerActivityDao.updateOp();
         }
      } else if (playerActivityDao.beautyTreasureRotate.stage == 0) {
         playerActivityDao.beautyTreasureRotate.stage = 1;
         playerActivityDao.updateOp();
      } else if (playerActivityDao.beautyTreasureRotate.stage == 2) {
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         if (curTime >= this.getPlayerActivityInfo().start + (Integer)beautyMainModel.getTimes().get(0) + (Integer)beautyMainModel.getTimes().get(1)) {
            playerActivityDao.beautyTreasureRotate.stage = 3;
            playerActivityDao.updateOp();
         }
      }

   }

   @MsgHandlerAnno
   public void C2S_RecruitBeautyTreasure_9903(BeautyTreasureRotateMsg.C2S_RecruitBeautyTreasure_9903 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         this.checkStage(playerActivityDao);
         BeautyTreasureRotateMsg.S2C_RecruitBeautyTreasure_9904.Builder builder = BeautyTreasureRotateMsg.S2C_RecruitBeautyTreasure_9904.newBuilder();
         BeautyTreasureData data = playerActivityDao.beautyTreasureRotate;
         if (data.stage == 3) {
            this.player.failure(61183);
         } else if (data.stage != msg.getStage()) {
            logger.info("客户端与服务器阶段不一致，请刷新界面！");
            builder.setStage(data.stage);
            this.player.sendMsg(builder.build());
         } else {
            int type = msg.getRecruitType();
            int num = msg.getRecruitNum();
            BeautyMainModel beautyMainModel = (BeautyMainModel)this.player.getGameModelPool().getEntity("beautyMain", type);
            if (beautyMainModel != null) {
               if (beautyMainModel.getActType() != this.getActivityType()) {
                  logger.error("抽奖id活动类型不一致！");
               } else {
                  String beautyTreasureTime = this.configManager.getStrByDefault("beautyTreasureTime", "1|10|50");
                  String[] timesStr = beautyTreasureTime.split("\\|");
                  if (num != Integer.parseInt(timesStr[0]) && num != Integer.parseInt(timesStr[1]) && num != Integer.parseInt(timesStr[2])) {
                     logger.error("红颜探宝抽取次数错误：" + num);
                  } else if (!ResourceModel.checkTotalNumError((Integer)beautyMainModel.getSpend().get(2), num)) {
                     PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
                     int freeTimes = (Integer)playerResetCustomCache.getDailyNum(543, 0);
                     if ((type != 4 || freeTimes != 0 || num != 1) && !this.player.checkResourceNum((Integer)beautyMainModel.getSpend().get(0), (Integer)beautyMainModel.getSpend().get(1), (Integer)beautyMainModel.getSpend().get(2) * num)) {
                        if (type == 3) {
                           this.player.failure(61184);
                        } else {
                           this.player.failure(61185);
                        }

                     } else {
                        int maxNum = this.configManager.getIntDefault("LotteryLimit", 99999);
                        if (type == 3) {
                           int highNum = (Integer)playerResetCustomCache.getDailyNum(23, 0);
                           if (highNum + num > maxNum) {
                              this.player.failure(51);
                              return;
                           }
                        } else {
                           int commonNum = (Integer)playerResetCustomCache.getDailyNum(22, 0);
                           if (commonNum + num > maxNum) {
                              this.player.failure(51);
                              return;
                           }
                        }

                        int awardGroup = 0;
                        if (data.stage == 1) {
                           awardGroup = (Integer)beautyMainModel.getGroup1().get(0);
                        } else {
                           awardGroup = (Integer)beautyMainModel.getGroup1().get(1);
                        }

                        Map<Integer, BeautyTreasureModel> modelMap = this.player.getGameModelPool().getMap("beautyTreasure");
                        List<BeautyTreasureModel> modelList = new ArrayList();

                        for(BeautyTreasureModel model : modelMap.values()) {
                           if (model.getGroup() == awardGroup) {
                              modelList.add(model);
                           }
                        }

                        if (modelList.isEmpty()) {
                           logger.error("未取到红颜探宝数据！！！！");
                        } else {
                           List<Integer> targetList = new ArrayList();

                           for(int i = 0; i < num; ++i) {
                              for(BeautyTreasureModel model : modelList) {
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
                                 if (((BeautyTreasureModel)modelMap.get(targetId)).getTrue3() > 0) {
                                    BeautyTreasureRecord record = new BeautyTreasureRecord();
                                    record.recruitType = msg.getRecruitType();
                                    record.awardId = targetId;
                                    data.recordList.add(record);
                                    if (data.recordList.size() > beautyMainModel.getCodeTimes()) {
                                       data.recordList.remove(0);
                                    }
                                 }

                                 targetList.add(targetId);
                                 if (data.historyRecord.containsKey(type) && ((Map)data.historyRecord.get(type)).containsKey(((BeautyTreasureModel)modelMap.get(targetId)).getForm())) {
                                    ((Map)data.historyRecord.get(type)).put(((BeautyTreasureModel)modelMap.get(targetId)).getForm(), 0);
                                 }
                              }
                           }

                           List<Integer> formList = new ArrayList();

                           for(BeautyTreasureModel model : modelList) {
                              formList.add(model.getForm());
                           }

                           Collections.sort(formList);
                           List<ResourceModel> awardList = new ArrayList();
                           List<Integer> broadcastList = new ArrayList();

                           for(Integer form : formList) {
                              for(Integer targetId : targetList) {
                                 if (!modelMap.containsKey(targetId)) {
                                    logger.error("红颜探宝奖励id错误：" + targetId);
                                 } else if (((BeautyTreasureModel)modelMap.get(targetId)).getForm() == form) {
                                    builder.addResultList(targetId);

                                    for(ResourceModel reward : ((BeautyTreasureModel)modelMap.get(targetId)).getRewards()) {
                                       awardList.add(new ResourceModel(reward.getType(), reward.getId(), reward.getValue()));
                                    }

                                    if (((BeautyTreasureModel)modelMap.get(targetId)).getTrue3() > 0) {
                                       broadcastList.add(targetId);
                                    }

                                    if (((BeautyTreasureModel)modelMap.get(targetId)).getTrue4() > 0) {
                                    }
                                 }
                              }
                           }

                           playerActivityDao.updateOp();
                           if (type == 3) {
                              playerResetCustomCache.addDailyReset(23, num);
                           } else {
                              playerResetCustomCache.addDailyReset(22, num);
                           }

                           this.player.addResource(awardList, PlayerMsg.ShowType.SHOW_BEAUTY_TREASURE, 8, 886, 0, 0, "");
                           if (type == 4 && freeTimes == 0 && num == 1) {
                              playerResetCustomCache.addDailyReset(543, 1);
                           } else {
                              this.player.delResource((Integer)beautyMainModel.getSpend().get(0), (Integer)beautyMainModel.getSpend().get(1), (long)((Integer)beautyMainModel.getSpend().get(2) * num), 8, 887, 0, 0, "");
                           }

                           builder.setStage(data.stage);
                           int commonNum = (Integer)playerResetCustomCache.getDailyNum(22, 0);
                           int highNum = (Integer)playerResetCustomCache.getDailyNum(23, 0);
                           builder.setCommonDrawNum(commonNum);
                           builder.setHighDrawNum(highNum);
                           int freeFlag = (Integer)playerResetCustomCache.getDailyNum(543, 0);
                           builder.setFreeRecruit(freeFlag);
                           this.player.sendMsg(builder.build());
                           if (!broadcastList.isEmpty()) {
                              BeautyTreasureRotateMsg.S2S_RecruitRecord_9920.Builder crossBuilder = BeautyTreasureRotateMsg.S2S_RecruitRecord_9920.newBuilder();

                              for(Integer id : broadcastList) {
                                 if (modelMap.containsKey(id)) {
                                    BeautyTreasureModel model = (BeautyTreasureModel)modelMap.get(id);
                                    BeautyTreasureRotateMsg.RecruitRecord.Builder recordBuilder = BeautyTreasureRotateMsg.RecruitRecord.newBuilder();
                                    recordBuilder.setAwardId(id);
                                    if (model.getTrue4() > 0) {
                                       recordBuilder.setBroadcast(true);
                                    } else {
                                       recordBuilder.setBroadcast(false);
                                    }

                                    recordBuilder.setServerId(this.player.getServerId());
                                    recordBuilder.setPlayerId(this.player.getPlayerId());
                                    recordBuilder.setPlayerName(this.player.getPublicDao().playerName);
                                    recordBuilder.setRecruitType(msg.getRecruitType());
                                    crossBuilder.addRecord(recordBuilder);
                                 }
                              }

                              this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), crossBuilder.build());
                           }

                           int itemId = (Integer)beautyMainModel.getSpend().get(1);
                           int realNum = (Integer)beautyMainModel.getSpend().get(2) * num;
                           LogOperationMgr.getLeftNum(this.player, 2, itemId);

                           for(ResourceModel resourceModel : awardList) {
                              String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                              this.player.getOperationMgr().addExtraLog(this.player, 198, "红颜探宝轮换活动", itemId + "", realNum + "", strings[0], strings[2], strings[1], "0");
                           }

                        }
                     }
                  }
               }
            }
         }
      }
   }

   public int recruitOneAward(List<BeautyTreasureModel> modelList, BeautyTreasureData data, int type) {
      List<KeyValFun> funList = new ArrayList();

      for(BeautyTreasureModel model : modelList) {
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

   public void sendChat(int recruitType, int awardId) {
      String beautyChat = "";
      if (recruitType == 3) {
         beautyChat = "beautyChat1";
      } else {
         beautyChat = "beautyChat2";
      }

      LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", beautyChat);
      if (languageModel != null) {
         BeautyTreasureModel model = (BeautyTreasureModel)this.player.getGameModelPool().getEntity("beautyTreasure", awardId);
         if (model != null) {
            int itemId = ((ResourceModel)model.getRewards().get(0)).getId();
            int itemNum = ((ResourceModel)model.getRewards().get(0)).getValue();
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemId);
            if (itemModel != null) {
               String desc = itemModel.getName() + "*" + itemNum;
               String format = MessageFormat.format(languageModel.getValue(), desc);
               ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
               PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
            }
         }
      }
   }

   public int getActivityType() {
      return 54;
   }

   public void rotateReset(int oldActivityId) {
      this.resetData();
      ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
      shopPart.resetShopById(36);
      this.clearActivityGift(24);
   }

   public void resetData() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.beautyTreasureRotate.recordList.clear();
      playerActivityDao.beautyTreasureRotate.receiveRecord.clear();
      playerActivityDao.beautyTreasureRotate.historyRecord.clear();
      playerActivityDao.beautyTreasureRotate.stage = 1;
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
      BeautyTreasureRotateMsg.C2S_RecruitBeautyTreasure_9903.Builder aa = BeautyTreasureRotateMsg.C2S_RecruitBeautyTreasure_9903.newBuilder();
      aa.setStage(2);
      aa.setRecruitType(1);
      aa.setRecruitNum(10);
      this.C2S_RecruitBeautyTreasure_9903(aa.build(), "");
   }
}
