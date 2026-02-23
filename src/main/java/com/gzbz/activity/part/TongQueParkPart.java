package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.lang.WeightRandom;
import cn.hutool.core.util.RandomUtil;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.GiftDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.TongqueTerraceDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.tongque.TongqueTerracePart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.TongQueActivityFloorModel;
import com.gzbz.model.TongQueActivityTaskModel;
import com.gzbz.model.TongQueBeautyConnectGroupModel;
import com.gzbz.model.TongQueBeautyConnectModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.ResourceWeightModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.TongQueParkMsg;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.TongQueParkTaskPart;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.MapUtil;
import misc.MiscUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class TongQueParkPart extends AbstractActivityPart {
   @Autowired
   ConfigManager configManager;
   private static final int[][] CHESS_PRIZE_POS_ARR = new int[8][3];

   @MsgHandlerAnno
   public void C2S_TongQueParkMain_12101(TongQueParkMsg.C2S_TongQueParkMain_12101 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_TongQueParkOpen_12103(TongQueParkMsg.C2S_TongQueParkOpen_12103 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         int pos = msg.getPos();
         if (pos >= 1 && pos <= 9) {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            long chessValue = (Long)MapUtil.getOrDefault(playerActivityDao.activityTongQueParkData.newChessMap, pos, 0L);
            if (chessValue == 0L) {
               this.player.failure(0);
            } else if (playerActivityDao.activityTongQueParkData.chessIsOpen(pos)) {
               this.player.failure(8008);
            } else {
               String[] feeArr = ApplicationContextProvider.getConfigString("TongQueOverturnCost", "2000|2|1100|1,2002|2|1132|1").split(",");
               ResourceModel resourceModel = null;

               for(String feeStr : feeArr) {
                  String[] actFeeArr = feeStr.split("\\|");
                  if (actFeeArr[0].equals(String.valueOf(this.getServerActivityInfo().id))) {
                     resourceModel = new ResourceModel(Integer.parseInt(actFeeArr[1]), Integer.parseInt(actFeeArr[2]), Integer.parseInt(actFeeArr[3]));
                     break;
                  }
               }

               if (resourceModel == null) {
                  this.player.failure(0);
               } else if (!this.player.checkResourceNum(resourceModel)) {
                  this.player.failure(8009);
               } else {
                  this.player.delResource(resourceModel, 8, 822, pos, 0, "");
                  int icon = playerActivityDao.activityTongQueParkData.chessIcon(pos);
                  playerActivityDao.activityTongQueParkData.newChessMap.put(pos, MiscUtil.comboInteger(1, icon));
                  TongQueParkMsg.S2C_TongQueParkOpen_12104.Builder resp = TongQueParkMsg.S2C_TongQueParkOpen_12104.newBuilder();
                  TongQueParkMsg.ChessData.Builder builder = TongQueParkMsg.ChessData.newBuilder();
                  builder.setIconId(icon);
                  builder.setPos(pos);
                  resp.setChess(builder);
                  resp.addAllPrizeIds(this.prize());
                  this.player.sendMsg(resp.build());
                  this.flushChess();
                  playerActivityDao.updateOp();
               }
            }
         } else {
            this.player.failure(0);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TongQueParkOneKeyOpen_12105(TongQueParkMsg.C2S_TongQueParkOneKeyOpen_12105 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         Map<Integer, Map<Integer, TongQueBeautyConnectModel>> allActivityModelMap = ApplicationContextProvider.<Integer, Map<Integer, TongQueBeautyConnectModel>>getModelPoolMap("customTongQueBeautyConnect");
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         TongQueParkMsg.S2C_TongQueParkOneKeyOpen_12106.Builder resp = TongQueParkMsg.S2C_TongQueParkOneKeyOpen_12106.newBuilder();
         int lessCount = 9 - playerActivityDao.activityTongQueParkData.alreadyOpenChess().size();
         if (lessCount > 0) {
            String[] feeArr = ApplicationContextProvider.getConfigString("TongQueOverturnCost", "2000|2|1100|1,2002|2|1132|1").split(",");
            ResourceModel resourceModel = null;

            for(String feeStr : feeArr) {
               String[] actFeeArr = feeStr.split("\\|");
               if (actFeeArr[0].equals(String.valueOf(this.getServerActivityInfo().id))) {
                  resourceModel = new ResourceModel(Integer.parseInt(actFeeArr[1]), Integer.parseInt(actFeeArr[2]), Integer.parseInt(actFeeArr[3]));
                  break;
               }
            }

            if (resourceModel == null) {
               this.player.failure(0);
               return;
            }

            resourceModel.setValue(resourceModel.getValue() * lessCount);
            if (!this.player.checkResourceNum(resourceModel)) {
               this.player.failure(8009);
               return;
            }

            this.player.delResource(resourceModel, 8, 824, 0, 0, "");

            for(Map.Entry<Integer, Long> entry : playerActivityDao.activityTongQueParkData.newChessMap.entrySet()) {
               if (!playerActivityDao.activityTongQueParkData.chessIsOpen((Integer)entry.getKey())) {
                  entry.setValue(MiscUtil.comboInteger(1, playerActivityDao.activityTongQueParkData.chessIcon((Integer)entry.getKey())));
               }
            }
         }

         resp.addAllPrizeIds(this.prize());
         resp.addAllChessList(this.buildChessDataList());
         this.player.sendMsg(resp.build());
         this.flushChess();
         playerActivityDao.updateOp();
      }
   }

   @MsgHandlerAnno
   public void C2S_TongQueParkFlush_12107(TongQueParkMsg.C2S_TongQueParkFlush_12107 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         int flushMaxCount = ApplicationContextProvider.getConfigInt("TongQueBeautyRefreshLimit", 0);
         if (playerActivityDao.activityTongQueParkData.flush >= flushMaxCount) {
            this.player.failure(8010);
         } else {
            String[] feeArr = ApplicationContextProvider.getConfigString("TongQueBeautyRefreshCost", "1|9|50").split("\\|");
            int feeType = Integer.parseInt(feeArr[0]);
            int feeId = Integer.parseInt(feeArr[1]);
            int feeValue = Integer.parseInt(feeArr[2]);
            if (!this.player.checkResourceNum(feeType, feeId, feeValue)) {
               this.player.failure(31);
            } else {
               this.player.delResource(feeType, feeId, (long)feeValue, 8, 826, 0, 0, "");
               ++playerActivityDao.activityTongQueParkData.flush;
               playerActivityDao.activityTongQueParkData.newChessMap.clear();
               playerActivityDao.updateOp();
               this.flushChess();
               TongQueParkMsg.S2C_TongQueParkFlush_12108.Builder resp = TongQueParkMsg.S2C_TongQueParkFlush_12108.newBuilder();
               resp.setFlushCount(playerActivityDao.activityTongQueParkData.flush);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TongQueParkFly_12109(TongQueParkMsg.C2S_TongQueParkFly_12109 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         Map<Integer, TreeMap<Integer, TongQueActivityFloorModel>> allActivityFloorMap = ApplicationContextProvider.<Integer, TreeMap<Integer, TongQueActivityFloorModel>>getModelPoolMap("customTongQueActivityFloor");
         TreeMap<Integer, TongQueActivityFloorModel> floorModelMap = MapUtil.getOrDefault(allActivityFloorMap, this.getServerActivityInfo().id, TreeMap.class);
         TongQueActivityFloorModel floorModel = (TongQueActivityFloorModel)floorModelMap.get(playerActivityDao.activityTongQueParkData.floor);
         if (floorModel == null) {
            this.player.failure(0);
         } else {
            ResourceModel resourceModel = null;
            String[] itemFeeArr = ApplicationContextProvider.getConfigString("TongQueChuanShuCost", "2000|2|1101|1,2002|2|1133|1").split(",");

            for(String itemFeeStr : itemFeeArr) {
               String[] itemActFeeArr = itemFeeStr.split("\\|");
               if (itemActFeeArr[0].equals(String.valueOf(this.getServerActivityInfo().id))) {
                  resourceModel = new ResourceModel(Integer.parseInt(itemActFeeArr[1]), Integer.parseInt(itemActFeeArr[2]), Integer.parseInt(itemActFeeArr[3]));
                  break;
               }
            }

            if (resourceModel == null) {
               this.player.failure(0);
            } else {
               int randomCount;
               switch (msg.getType()) {
                  case 0:
                     int limitCount = ApplicationContextProvider.getConfigInt("TongQueChuanShulimit", 0);
                     if (playerActivityDao.activityTongQueParkData.goldFly >= limitCount) {
                        this.player.failure(25);
                        return;
                     }

                     String[] goldFeeArr = ApplicationContextProvider.getConfigString("TongQueChuanShuCost2", "1,9,200").split(",");
                     resourceModel.setType(Integer.parseInt(goldFeeArr[0]));
                     resourceModel.setId(Integer.parseInt(goldFeeArr[1]));
                     resourceModel.setValue(Integer.parseInt(goldFeeArr[2]));
                     randomCount = 1;
                     break;
                  case 1:
                     randomCount = 1;
                     break;
                  case 2:
                     randomCount = ApplicationContextProvider.getConfigInt("tongQueFlyCount", 5);
                     resourceModel.setValue(resourceModel.getValue() * randomCount);
                     break;
                  default:
                     this.player.failure(0);
                     return;
               }

               PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
               int dailyNum = (Integer)playerResetCustomCache.getDailyNum(28, 0);
               int newDailyNum = dailyNum + randomCount;
               int lotteryLimit = this.configManager.getIntDefault("LotteryLimit", 99999);
               if (newDailyNum > lotteryLimit) {
                  this.player.failure(51);
               } else if (!this.player.checkResourceNum(resourceModel)) {
                  this.player.failure(4);
               } else {
                  Map<Long, WeightRandom.WeightObj<Long>> weightMap = new HashMap();

                  for(TongQueActivityFloorModel loopModel : floorModelMap.values()) {
                     for(int i = 0; i < loopModel.getGoods().size(); ++i) {
                        ResourceWeightModel resourceWeightModel = (ResourceWeightModel)loopModel.getGoods().get(i);
                        if (i != loopModel.getGoods().size() - 1) {
                           long rewardValue = MiscUtil.comboInteger(loopModel.getStepId(), i);
                           weightMap.put(rewardValue, new WeightRandom.WeightObj(rewardValue, (double)resourceWeightModel.getWeight()));
                        }
                     }

                     if (loopModel.getStepId() >= floorModel.getStepId()) {
                        break;
                     }
                  }

                  List<ResourceModel> finalRewardList = new ArrayList();
                  List<Long> rewardValueList = new ArrayList();

                  for(int randomIndex = 0; randomIndex < randomCount; ++randomIndex) {
                     WeightRandom<Long> weightRandom = RandomUtil.weightRandom(weightMap.values());
                     Long rewardValue = (Long)weightRandom.next();
                     if (rewardValue != null) {
                        int rewardFloor = MiscUtil.getHiParam(rewardValue);
                        int rewardIndex = MiscUtil.getLowParam(rewardValue);
                        TongQueActivityFloorModel rewardFloorModel = (TongQueActivityFloorModel)floorModelMap.get(rewardFloor);
                        if (rewardFloorModel == null) {
                           this.logger.error("随机到的楼层{}配置不存在", rewardFloor);
                        } else {
                           ResourceWeightModel finalRewardModel = (ResourceWeightModel)rewardFloorModel.getGoods().get(rewardIndex);
                           if (finalRewardModel == null) {
                              this.logger.error("随机到的下标{}奖励配置不存在", rewardIndex);
                           } else {
                              ++playerActivityDao.activityTongQueParkData.floorCount;
                              ResourceModel rewardResource = new ResourceModel(finalRewardModel.getType(), finalRewardModel.getId(), finalRewardModel.getValue());
                              if (playerActivityDao.activityTongQueParkData.floorCount >= floorModel.getSureTimes()) {
                                 rewardValue = MiscUtil.comboInteger(floorModel.getStepId(), floorModel.getGoods().size() - 1);
                                 ResourceWeightModel unlockResModel = (ResourceWeightModel)floorModel.getGoods().get(floorModel.getGoods().size() - 1);
                                 rewardResource.setType(unlockResModel.getType());
                                 rewardResource.setId(unlockResModel.getId());
                                 rewardResource.setValue(unlockResModel.getValue());
                                 int stepId;
                                 if (floorModel.getStepId() == (Integer)floorModelMap.lastKey()) {
                                    stepId = 1;
                                 } else {
                                    TongQueActivityFloorModel nextFloorModel = (TongQueActivityFloorModel)floorModelMap.get(floorModel.getStepId() + 1);
                                    if (nextFloorModel == null) {
                                       this.logger.info("楼层{}配置不存在", floorModel.getStepId() + 1);
                                       continue;
                                    }

                                    stepId = nextFloorModel.getStepId();
                                 }

                                 playerActivityDao.activityTongQueParkData.floor = stepId;
                                 playerActivityDao.activityTongQueParkData.floorCount = 0;
                                 playerActivityDao.updateOp();
                              }

                              if (rewardValue != 0L) {
                                 finalRewardList.add(rewardResource);
                                 rewardValueList.add(rewardValue);
                              }
                           }
                        }
                     }
                  }

                  if (rewardValueList.size() < randomCount) {
                     this.logger.error("玩家{}传书出现错误,随机道具存在空值,随机数量:{},随机到物品:{}", new Object[]{this.player.getPlayerId(), randomCount, finalRewardList});
                  }

                  if (msg.getType() == 0) {
                     ++playerActivityDao.activityTongQueParkData.goldFly;
                  }

                  this.player.delResource(resourceModel, 8, 828, msg.getType(), 0, "");
                  playerActivityDao.updateOp();
                  this.player.addResource(finalRewardList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 8, 828, msg.getType(), 0, "");
                  TongQueParkMsg.S2C_TongQueParkFly_12110.Builder resp = TongQueParkMsg.S2C_TongQueParkFly_12110.newBuilder();
                  resp.setType(msg.getType());
                  resp.setFlyGoldCount(playerActivityDao.activityTongQueParkData.goldFly);
                  resp.setFloorId(playerActivityDao.activityTongQueParkData.floor);

                  for(long rewardValue : rewardValueList) {
                     int rewardFloor = MiscUtil.getHiParam(rewardValue);
                     int rewardIndex = MiscUtil.getLowParam(rewardValue);
                     TongQueParkMsg.FloorRewardData.Builder builder = TongQueParkMsg.FloorRewardData.newBuilder();
                     builder.setFloor(rewardFloor);
                     builder.setRewardIndex(rewardIndex);
                     resp.addRewards(builder);
                  }

                  resp.setIsRewardBeauty(this.hasActivityBeauty());
                  playerResetCustomCache.setDailyReset(28, newDailyNum);
                  resp.setDailyDrawNum(newDailyNum);
                  this.player.sendMsg(resp.build());
                  this.player.triggerTask(539, 0, (long)randomCount, 1);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TongQueParkBuyItem_12111(TongQueParkMsg.C2S_TongQueParkBuyItem_12111 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         String[] goldFeeArr = ApplicationContextProvider.getConfigString("TongQueChuanShuCost3", "1,9,200").split(",");
         if (!this.player.checkResourceNum(Integer.parseInt(goldFeeArr[0]), Integer.parseInt(goldFeeArr[1]), Integer.parseInt(goldFeeArr[2]))) {
            this.player.failure(31);
         } else {
            this.player.delResource(Integer.parseInt(goldFeeArr[0]), Integer.parseInt(goldFeeArr[1]), (long)Integer.parseInt(goldFeeArr[2]), 8, 827, 0, 0, "");
            String[] itemArr = ApplicationContextProvider.getConfigString("TongQueChuanShuCost3", "1,9,200").split(",");
            this.player.addResource(Integer.parseInt(itemArr[0]), Integer.parseInt(itemArr[1]), Integer.parseInt(itemArr[2]), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 827, 0, 0, "");
            TongQueParkMsg.S2C_TongQueParkBuyItem_12112.Builder resp = TongQueParkMsg.S2C_TongQueParkBuyItem_12112.newBuilder();
            this.player.sendMsg(resp.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ChessList_12117(TongQueParkMsg.C2S_ChessList_12117 msg, String source) {
      this.sendChessList();
   }

   private Set<Integer> prize() {
      Map<Integer, Map<Integer, TongQueBeautyConnectModel>> allActivityModelMap = ApplicationContextProvider.<Integer, Map<Integer, TongQueBeautyConnectModel>>getModelPoolMap("customTongQueBeautyConnect");
      Map<Integer, TongQueBeautyConnectModel> prizeModelMap = (Map)MapUtil.getOrDefault(allActivityModelMap, this.getServerActivityInfo().id, ConcurrentHashMap.class);
      Set<Integer> prizeList = new HashSet();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());

      for(int[] prizePosGroup : CHESS_PRIZE_POS_ARR) {
         List<Integer> openIconList = new ArrayList();

         for(int prizePos : prizePosGroup) {
            if (!playerActivityDao.activityTongQueParkData.chessIsOpen(prizePos)) {
               break;
            }

            int icon = playerActivityDao.activityTongQueParkData.chessIcon(prizePos);
            if (icon <= 0) {
               break;
            }

            openIconList.add(icon);
         }

         if (openIconList.size() == 3) {
            for(TongQueBeautyConnectModel prizeModel : prizeModelMap.values()) {
               if (prizeModel.getGroup().size() != 3) {
                  this.logger.error("奖项{}中奖组合大小不为3", prizeModel.getId());
               } else if (!playerActivityDao.activityTongQueParkData.prizeSet.contains(prizeModel.getId())) {
                  int prizeCount = 0;

                  for(int index = 0; index < prizeModel.getGroup().size() && ((Integer)openIconList.get(index)).equals(prizeModel.getGroup().get(index)); ++index) {
                     ++prizeCount;
                  }

                  if (prizeCount == 3) {
                     playerActivityDao.activityTongQueParkData.prizeSet.add(prizeModel.getId());
                     playerActivityDao.updateOp();
                     this.player.addResource(prizeModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 8, 825, prizeModel.getId(), 1, "");
                     prizeList.add(prizeModel.getId());
                     this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "玲珑绘琪", prizeModel.getTypeName(), prizeModel.getTypeName(), 0, 0, 1);
                  }
               }
            }
         }
      }

      return prizeList;
   }

   private void sendChessList() {
      TongQueParkMsg.S2C_ChessList_12118.Builder resp = TongQueParkMsg.S2C_ChessList_12118.newBuilder();
      resp.addAllChessList(this.buildChessDataList());
      this.player.sendMsg(resp.build());
   }

   private List<TongQueParkMsg.ChessData> buildChessDataList() {
      List<TongQueParkMsg.ChessData> msgList = new ArrayList();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());

      for(int pos : playerActivityDao.activityTongQueParkData.alreadyOpenChess()) {
         TongQueParkMsg.ChessData.Builder builder = TongQueParkMsg.ChessData.newBuilder();
         builder.setPos(pos);
         builder.setIconId(playerActivityDao.activityTongQueParkData.chessIcon(pos));
         msgList.add(builder.build());
      }

      return msgList;
   }

   private void flushChess() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.activityTongQueParkData.newChessMap.isEmpty() || playerActivityDao.activityTongQueParkData.alreadyOpenChess().size() >= 9) {
         playerActivityDao.activityTongQueParkData.newChessMap.clear();
         playerActivityDao.activityTongQueParkData.prizeSet.clear();
         playerActivityDao.updateOp();
         Map<Integer, Map<Integer, TongQueBeautyConnectGroupModel>> allActivityGroupModelMap = ApplicationContextProvider.<Integer, Map<Integer, TongQueBeautyConnectGroupModel>>getModelPoolMap("customTongQueBeautyConnectGroup");
         List<TongQueBeautyConnectGroupModel> tongQueBeautyConnectGroupModels = new ArrayList(((Map)MapUtil.getOrDefault(allActivityGroupModelMap, this.getServerActivityInfo().id, ConcurrentHashMap.class)).values());
         Iterator<TongQueBeautyConnectGroupModel> iterator = tongQueBeautyConnectGroupModels.iterator();

         while(iterator.hasNext()) {
            TongQueBeautyConnectGroupModel tongQueBeautyConnectGroupModel = (TongQueBeautyConnectGroupModel)iterator.next();
            if (tongQueBeautyConnectGroupModel.getMaxTimes() > 0 && tongQueBeautyConnectGroupModel.getMaxTimes() <= (Integer)MapUtil.getOrDefault(playerActivityDao.activityTongQueParkData.connect, tongQueBeautyConnectGroupModel.getId(), 0)) {
               iterator.remove();
            }
         }

         if (tongQueBeautyConnectGroupModels.size() != 0) {
            List<WeightRandom.WeightObj<Integer>> weightList = new ArrayList();

            for(int index = 0; index < tongQueBeautyConnectGroupModels.size(); ++index) {
               weightList.add(new WeightRandom.WeightObj(index, (double)((TongQueBeautyConnectGroupModel)tongQueBeautyConnectGroupModels.get(index)).getWeight()));
            }

            WeightRandom<Integer> weightRandom = RandomUtil.weightRandom(weightList);
            TongQueBeautyConnectGroupModel randomModel = (TongQueBeautyConnectGroupModel)tongQueBeautyConnectGroupModels.get((Integer)weightRandom.next());
            List<Integer> iconList = randomModel.getPos();

            for(int i = 0; i < iconList.size(); ++i) {
               playerActivityDao.activityTongQueParkData.newChessMap.put(i + 1, MiscUtil.comboInteger(0, (Integer)iconList.get(i)));
            }

            if (randomModel.getMaxTimes() > 0) {
               playerActivityDao.activityTongQueParkData.connect.put(randomModel.getId(), (Integer)MapUtil.getOrDefault(playerActivityDao.activityTongQueParkData.connect, randomModel.getId(), 0) + 1);
            }

            playerActivityDao.updateOp();
         }
      }
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         ActivityInfo activityInfo = this.getServerActivityInfo();
         this.flushChess();
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         TongQueParkMsg.S2C_TongQueParkMain_12102.Builder msg = TongQueParkMsg.S2C_TongQueParkMain_12102.newBuilder();
         msg.setEndTime(activityInfo.end);
         msg.setFloorId(playerActivityDao.activityTongQueParkData.floor);
         msg.setFlyGoldCount(playerActivityDao.activityTongQueParkData.goldFly);
         msg.setFlushCount(playerActivityDao.activityTongQueParkData.flush);

         for(int pos : playerActivityDao.activityTongQueParkData.alreadyOpenChess()) {
            TongQueParkMsg.ChessData.Builder builder = TongQueParkMsg.ChessData.newBuilder();
            builder.setPos(pos);
            builder.setIconId(playerActivityDao.activityTongQueParkData.chessIcon(pos));
            msg.addChessList(builder);
         }

         TongQueParkTaskPart tongQueParkTaskPart = (TongQueParkTaskPart)this.player.getMgrPart(TongQueParkTaskPart.class);
         msg.addAllTaskList(tongQueParkTaskPart.getTaskListMsg());
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
         Map<Integer, GiftDao> giftDaoMap = giftPart.getBuyGifts(16);
         Map<Integer, List<ShopLimitModel>> allShopLimitMap = ApplicationContextProvider.<Integer, List<ShopLimitModel>>getModelPoolMap("customActivityShopLimit");

         for(ShopLimitModel shopLimitModel : MapUtil.getOrDefault(allShopLimitMap, activityInfo.id, ArrayList.class)) {
            TongQueParkMsg.GiftData.Builder giftData = TongQueParkMsg.GiftData.newBuilder();
            giftData.setId(shopLimitModel.getId());
            ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", shopLimitModel.getItemId());
            if (itemModel != null) {
               for(ResourceModel resourceModel : itemBagPart.getResourcesByUseFun(itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue(), 1)) {
                  giftData.addRewards(resourceModel.builder());
               }
            }

            giftData.setIsBuy(giftDaoMap.containsKey(shopLimitModel.getId()));
            msg.addGiftList(giftData);
         }

         msg.setIsRewardBeauty(this.hasActivityBeauty());
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(28, 0);
         msg.setDailyDrawNum(dailyDrawNum);
         this.player.sendMsg(msg.build());
      }
   }

   public void resetDaily() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityTongQueParkData.reset();
      playerActivityDao.updateOp();
      if (!this.isServerActivityInvalid()) {
         if (this.getSeverActivityDay() != 1) {
            TongQueParkTaskPart tongQueParkTaskPart = (TongQueParkTaskPart)this.player.getMgrPart(TongQueParkTaskPart.class);

            for(TaskData taskData : tongQueParkTaskPart.getTasksMap().values()) {
               taskData.delete();
            }

            Map<Integer, TreeMap<Integer, Set<Integer>>> allTaskModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, Set<Integer>>>getModelPoolMap("customTongQueActivityTaskGroup");
            TreeMap<Integer, Set<Integer>> groupTasksModelMap = MapUtil.getOrDefault(allTaskModelMap, this.getServerActivityInfo().id, TreeMap.class);
            if (!groupTasksModelMap.isEmpty()) {
               int curGroup = playerActivityDao.activityTongQueParkData.taskGroup;
               playerActivityDao.activityTongQueParkData.taskGroup = curGroup >= (Integer)groupTasksModelMap.lastKey() ? (Integer)groupTasksModelMap.firstKey() : curGroup + 1;
               playerActivityDao.updateOp();
            }

            tongQueParkTaskPart.trigger();
            this.sendInfo();
         }
      }
   }

   public void rotateReset(int oldActivityId) {
      String[] itemFeeArr = ApplicationContextProvider.getConfigString("TongQueChuanShuCost", "2000|2|1101|1,2002|2|1133|1").split(",");

      for(String itemFeeStr : itemFeeArr) {
         String[] itemActFeeArr = itemFeeStr.split("\\|");
         long itemNum = this.player.getResourceNum(Integer.parseInt(itemActFeeArr[1]), Integer.parseInt(itemActFeeArr[2]));
         if (itemNum > 0L) {
            this.player.delResource(Integer.parseInt(itemActFeeArr[1]), Integer.parseInt(itemActFeeArr[2]), itemNum, 8, 855, 0, 0, "");
         }
      }

      itemFeeArr = ApplicationContextProvider.getConfigString("TongQueOverturnCost", "2000|2|1100|1,2002|2|1132|1").split(",");

      for(String itemFeeStr : itemFeeArr) {
         String[] itemActFeeArr = itemFeeStr.split("\\|");
         long itemNum = this.player.getResourceNum(Integer.parseInt(itemActFeeArr[1]), Integer.parseInt(itemActFeeArr[2]));
         if (itemNum > 0L) {
            this.player.delResource(Integer.parseInt(itemActFeeArr[1]), Integer.parseInt(itemActFeeArr[2]), itemNum, 8, 855, 0, 0, "");
         }
      }

      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      giftPart.clearGifts(16);
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityTongQueParkData.resetAll();
      TongQueParkTaskPart tongQueParkTaskPart = (TongQueParkTaskPart)this.player.getMgrPart(TongQueParkTaskPart.class);

      for(TaskData taskData : tongQueParkTaskPart.getTasksMap().values()) {
         taskData.delete();
      }

      Map<Integer, TreeMap<Integer, Set<Integer>>> allTaskModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, Set<Integer>>>getModelPoolMap("customTongQueActivityTaskGroup");
      TreeMap<Integer, Set<Integer>> groupTasksModelMap = MapUtil.getOrDefault(allTaskModelMap, this.getServerActivityInfo().id, TreeMap.class);
      if (!groupTasksModelMap.isEmpty()) {
         playerActivityDao.activityTongQueParkData.taskGroup = (Integer)groupTasksModelMap.firstKey();
         tongQueParkTaskPart.trigger();
      }

      playerActivityDao.updateOp();
      ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
      shopPart.resetShopById(22);
   }

   public int getActivityType() {
      return 13;
   }

   public void gmFloorReset() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityTongQueParkData.goldFly = 0;
      playerActivityDao.activityTongQueParkData.floor = 1;
      playerActivityDao.updateOp();
      this.sendInfo();
   }

   public boolean hasActivityBeauty() {
      int activityId = this.getPlayerActivityId();
      if (activityId <= 0) {
         return true;
      } else {
         Map<Integer, TreeMap<Integer, TongQueActivityFloorModel>> allActivityFloorMap = ApplicationContextProvider.<Integer, TreeMap<Integer, TongQueActivityFloorModel>>getModelPoolMap("customTongQueActivityFloor");
         TreeMap<Integer, TongQueActivityFloorModel> floorModelMap = MapUtil.getOrDefault(allActivityFloorMap, activityId, TreeMap.class);
         TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)this.player.getMgrPart(TongqueTerracePart.class);

         for(ResourceWeightModel resourceWeightModel : ((TongQueActivityFloorModel)floorModelMap.lastEntry().getValue()).getGoods()) {
            if (resourceWeightModel.getType() == 2) {
               ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", resourceWeightModel.getId());
               if (itemModel != null && itemModel.getUseFuncType() == 18) {
                  TongqueTerraceDao tongqueTerraceDao = tongqueTerracePart.getTongqueTerraceDao(itemModel.getUseFuncId());
                  return tongqueTerraceDao != null && tongqueTerraceDao.state >= 2;
               }
            }
         }

         return false;
      }
   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
      if (!mainOpen) {
         List<ResourceModel> resourceModels = new ArrayList();
         TongQueParkTaskPart tongQueParkTaskPart = (TongQueParkTaskPart)this.player.getMgrPart(TongQueParkTaskPart.class);

         for(TaskData taskData : tongQueParkTaskPart.getTasksMap().values()) {
            if (taskData.state == 2) {
               TongQueActivityTaskModel tongQueActivityTaskModel = (TongQueActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("TongQueActivityTask", taskData.id);
               if (tongQueActivityTaskModel != null) {
                  for(ResourceModel reward : tongQueActivityTaskModel.getRewards()) {
                     if (reward.getType() != 2) {
                        reward.addResourceToList(resourceModels);
                     }
                  }

                  taskData.finish();
               }
            }
         }

         this.sendMergeMail(CentreAwardModel.TYPE_MERGE_ACT_NOT_GOT_REWARD, resourceModels);
      }
   }

   static {
      CHESS_PRIZE_POS_ARR[0] = new int[]{1, 2, 3};
      CHESS_PRIZE_POS_ARR[1] = new int[]{4, 5, 6};
      CHESS_PRIZE_POS_ARR[2] = new int[]{7, 8, 9};
      CHESS_PRIZE_POS_ARR[3] = new int[]{1, 4, 7};
      CHESS_PRIZE_POS_ARR[4] = new int[]{2, 5, 8};
      CHESS_PRIZE_POS_ARR[5] = new int[]{3, 6, 9};
      CHESS_PRIZE_POS_ARR[6] = new int[]{1, 5, 9};
      CHESS_PRIZE_POS_ARR[7] = new int[]{3, 5, 7};
   }
}
