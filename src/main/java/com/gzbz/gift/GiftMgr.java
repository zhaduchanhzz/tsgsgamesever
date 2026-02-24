package com.gzbz.gift;

import allMgr.MgrAnno;
import com.gzbz.db.WorldDao;
import com.gzbz.db.worldBean.GeneralWelfareData;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.GeneralWelfareModel;
import com.gzbz.model.GeneralWelfareRewardModel;
import com.gzbz.protobuf.GiftMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.warOrder.WarOrderPart;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import misc.DateUtil;
import misc.MiscUtil;
import misc.RandomUtil;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class GiftMgr extends GameMgr {
   private final WorldMgr worldMgr;
   private final OnLineMgr onLineMgr;

   public GiftMgr(WorldMgr worldMgr, OnLineMgr onLineMgr) {
      this.worldMgr = worldMgr;
      this.onLineMgr = onLineMgr;
   }

   protected void init() throws Exception {
   }

   public void checkGeneralWelfare() {
      Map<Integer, TreeMap<Integer, GeneralWelfareModel>> allModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GeneralWelfareModel>>getModelPoolMap("customBuyNumTime");
      if (allModelMap != null && !allModelMap.isEmpty()) {
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         int minutes = (curTime - DateUtil.getIntTime(this.worldMgr.getOpenServerTime())) / 60;
         int configMinute = ApplicationContextProvider.getConfigInt("buyNumTimeMinute", 30);
         WorldDao<GeneralWelfareData> worldDao = this.worldMgr.<GeneralWelfareData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_GENERAL_WELFARE);

         for(Map.Entry<Integer, TreeMap<Integer, GeneralWelfareModel>> entry : allModelMap.entrySet()) {
            Optional<GeneralWelfareModel> result = (entry.getValue()).values().stream().filter((modelx) -> modelx.getTime() < minutes).max(Comparator.comparingInt(GeneralWelfareModel::getTime));
            if (result.isPresent()) {
               GeneralWelfareModel model = (GeneralWelfareModel)result.get();
               if (!((GeneralWelfareData)worldDao.jsonData).random.containsKey(model.getId()) || (Integer)((GeneralWelfareData)worldDao.jsonData).random.get(model.getId()) < model.getMin() || (Integer)((GeneralWelfareData)worldDao.jsonData).random.get(model.getId()) > model.getMax()) {
                  ((GeneralWelfareData)worldDao.jsonData).random.put(model.getId(), RandomUtil.randInt(model.getMin(), model.getMax() + 1));
                  worldDao.updateOp();
               }

               int random = (Integer)((GeneralWelfareData)worldDao.jsonData).random.get(model.getId());
               long value = (Long)((GeneralWelfareData)worldDao.jsonData).counter.getOrDefault(entry.getKey(), 0L);
               int counter = MiscUtil.getHiParam(value);
               if (counter < random) {
                  int lastUpdateTime = MiscUtil.getLowParam(value);
                  if (lastUpdateTime <= 0 || curTime - lastUpdateTime > configMinute * 60) {
                     ((GeneralWelfareData)worldDao.jsonData).counter.put(entry.getKey(), MiscUtil.comboInteger(counter + 1, curTime));
                     worldDao.updateOp();
                     this.broadcastGeneralWelfare((Integer)entry.getKey());
                  }
               }
            }
         }

      }
   }

   public void sendGeneralWelfare(GamePlayer player, int type, Set<Integer> rewardC, Set<Integer> rewardS) {
      WorldDao<GeneralWelfareData> worldDao = this.worldMgr.<GeneralWelfareData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_GENERAL_WELFARE);
      GiftMsg.S2C_GeneralWelfare_8624.Builder builder = GiftMsg.S2C_GeneralWelfare_8624.newBuilder();
      builder.addAllRewardCommon(rewardC);
      builder.addAllRewardSuper(rewardS);
      builder.setType(type);
      builder.setCount(MiscUtil.getHiParam((Long)((GeneralWelfareData)worldDao.jsonData).counter.getOrDefault(type, 0L)));
      player.sendMsg(builder.build());
   }

   public void generalWelfareCounter(int giftId) {
      Map<Integer, Integer> gift2RewardType = ApplicationContextProvider.<Integer, Integer>getModelPoolMap("customPersonExtraReward");
      if (gift2RewardType != null && gift2RewardType.containsKey(giftId)) {
         int rewardType = (Integer)gift2RewardType.get(giftId);
         this.generalWelfareCounter(rewardType, 1);
      }
   }

   public void generalWelfareCounter(int rewardType, int addCount) {
      WorldDao<GeneralWelfareData> worldDao = this.worldMgr.<GeneralWelfareData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_GENERAL_WELFARE);
      long value = (Long)((GeneralWelfareData)worldDao.jsonData).counter.getOrDefault(rewardType, 0L);
      int counter = MiscUtil.getHiParam(value);
      int lastUpdateTime = MiscUtil.getLowParam(value);
      ((GeneralWelfareData)worldDao.jsonData).counter.put(rewardType, MiscUtil.comboInteger(counter + addCount, lastUpdateTime));
      worldDao.updateOp();
      this.broadcastGeneralWelfare(rewardType);
   }

   public void generalWelfareReward(GamePlayer player, GeneralWelfareRewardModel rewardModel, boolean isBuy) {
      WorldDao<GeneralWelfareData> worldDao = this.worldMgr.<GeneralWelfareData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_GENERAL_WELFARE);
      long value = (Long)((GeneralWelfareData)worldDao.jsonData).counter.getOrDefault(rewardModel.getType(), 0L);
      int counter = MiscUtil.getHiParam(value);
      if (counter < rewardModel.getBuyNum()) {
         player.failure(51);
      } else {
         player.pushTask(() -> {
            WarOrderPart warOrderPart = (WarOrderPart)player.getMgrPart(WarOrderPart.class);
            warOrderPart.generalWelfareReward(rewardModel, isBuy);
         });
      }
   }

   private void broadcastGeneralWelfare(int type) {
      WorldDao<GeneralWelfareData> worldDao = this.worldMgr.<GeneralWelfareData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_GENERAL_WELFARE);
      GiftMsg.S2C_GeneralWelfareNotify_8628.Builder builder = GiftMsg.S2C_GeneralWelfareNotify_8628.newBuilder();
      builder.setCount(MiscUtil.getHiParam((Long)((GeneralWelfareData)worldDao.jsonData).counter.get(type)));
      builder.setType(type);
      this.onLineMgr.pushTask(() -> this.onLineMgr.onlineBroadcast(builder.build()));
   }
}
