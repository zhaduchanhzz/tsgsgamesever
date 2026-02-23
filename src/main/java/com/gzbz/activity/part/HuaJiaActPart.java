package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.lang.WeightRandom;
import cn.hutool.core.util.RandomUtil;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.bean.BeautyTreasureRecord;
import com.gzbz.db.GiftDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.bean.ActivityTongQueRotateData;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.worldBean.ActivityData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.HuaJiaActivityRewardNewModel;
import com.gzbz.model.HuaJiaActivityTableNewModel;
import com.gzbz.model.HuaJiaActivityTaskGroupNewModel;
import com.gzbz.model.HuaJiaActivityTaskNewModel;
import com.gzbz.model.HuaJiaBeautyConnectGroupNewModel;
import com.gzbz.model.HuaJiaBeautyConnectNewModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HuaJiaActMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.HuaJiaActTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.Collections;
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
public class HuaJiaActPart extends AbstractActivityPart {
   @Autowired
   ConfigManager configManager;
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private WorldMgr worldMgr;
   public static final int INFINITY = -1;
   private static final int[][] CHESS_PRIZE_POS_ARR = new int[8][3];

   @MsgHandlerAnno
   public void C2S_TongQueParkMain_24401(HuaJiaActMsg.C2S_TongQueParkMain_24401 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_TongQueParkOpen_24403(HuaJiaActMsg.C2S_TongQueParkOpen_24403 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         int pos = msg.getPos();
         if (pos >= 1 && pos <= 9) {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            long chessValue = (Long)MapUtil.getOrDefault(playerActivityDao.activityHuaJiaData.newChessMap, pos, 0L);
            if (chessValue == 0L) {
               this.player.failure(0);
            } else if (playerActivityDao.activityHuaJiaData.chessIsOpen(pos)) {
               this.player.failure(8008);
            } else {
               List<Integer> actFeeArr = this.getTableModel().getTongQueOverturnCost();
               if (!this.player.checkResourceNum((Integer)actFeeArr.get(0), (Integer)actFeeArr.get(1), (Integer)actFeeArr.get(2))) {
                  this.player.failure(8009);
               } else {
                  this.player.delResource((Integer)actFeeArr.get(0), (Integer)actFeeArr.get(1), (long)(Integer)actFeeArr.get(2), 143, 14302, pos, 0, "");
                  int icon = playerActivityDao.activityHuaJiaData.chessIcon(pos);
                  playerActivityDao.activityHuaJiaData.newChessMap.put(pos, MiscUtil.comboInteger(1, icon));
                  HuaJiaActMsg.S2C_TongQueParkOpen_24404.Builder resp = HuaJiaActMsg.S2C_TongQueParkOpen_24404.newBuilder();
                  HuaJiaActMsg.ChessData.Builder builder = HuaJiaActMsg.ChessData.newBuilder();
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
   public void C2S_TongQueParkOneKeyOpen_24405(HuaJiaActMsg.C2S_TongQueParkOneKeyOpen_24405 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         HuaJiaActMsg.S2C_TongQueParkOneKeyOpen_24406.Builder resp = HuaJiaActMsg.S2C_TongQueParkOneKeyOpen_24406.newBuilder();
         int lessCount = 9 - playerActivityDao.activityHuaJiaData.alreadyOpenChess().size();
         List<Integer> actFeeArr = this.getTableModel().getTongQueOverturnCost();
         if (lessCount > 0) {
            if (!this.player.checkResourceNum((Integer)actFeeArr.get(0), (Integer)actFeeArr.get(1), (Integer)actFeeArr.get(2) * lessCount)) {
               this.player.failure(8009);
               return;
            }

            this.player.delResource((Integer)actFeeArr.get(0), (Integer)actFeeArr.get(1), (long)((Integer)actFeeArr.get(2) * lessCount), 143, 14303, 0, 0, "");

            for(Map.Entry<Integer, Long> entry : playerActivityDao.activityHuaJiaData.newChessMap.entrySet()) {
               if (!playerActivityDao.activityHuaJiaData.chessIsOpen((Integer)entry.getKey())) {
                  entry.setValue(MiscUtil.comboInteger(1, playerActivityDao.activityHuaJiaData.chessIcon((Integer)entry.getKey())));
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
   public void C2S_TongQueParkFlush_24407(HuaJiaActMsg.C2S_TongQueParkFlush_24407 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         int flushMaxCount = this.getTableModel().getTongQueBeautyRefreshLimit();
         if (playerActivityDao.activityHuaJiaData.flush >= flushMaxCount) {
            this.player.failure(8010);
         } else {
            List<Integer> fee = this.getTableModel().getTongQueBeautyRefreshCost();
            if (!this.player.checkResourceNum((Integer)fee.get(0), (Integer)fee.get(1), (Integer)fee.get(2))) {
               this.player.failure(31);
            } else {
               this.player.delResource((Integer)fee.get(0), (Integer)fee.get(1), (long)(Integer)fee.get(2), 143, 14305, 0, 0, "");
               ++playerActivityDao.activityHuaJiaData.flush;
               playerActivityDao.activityHuaJiaData.newChessMap.clear();
               playerActivityDao.updateOp();
               this.flushChess();
               HuaJiaActMsg.S2C_TongQueParkFlush_24408.Builder resp = HuaJiaActMsg.S2C_TongQueParkFlush_24408.newBuilder();
               resp.setFlushCount(playerActivityDao.activityHuaJiaData.flush);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ChessList_24417(HuaJiaActMsg.C2S_ChessList_24417 msg, String source) {
      this.sendChessList();
   }

   private Set<Integer> prize() {
      Map<Integer, HuaJiaBeautyConnectNewModel> allActivityModelMap = ApplicationContextProvider.<Integer, HuaJiaBeautyConnectNewModel>getModelPoolMap("HuaJiaBeautyConnectNew");
      Map<Integer, HuaJiaBeautyConnectNewModel> prizeModelMap = new HashMap();

      for(HuaJiaBeautyConnectNewModel model : allActivityModelMap.values()) {
         if (model.getDateEnd() == -1) {
            if (this.getActivityOpenDay() >= model.getDateStart() && model.getActivityId() == this.getPlayerActivityId()) {
               prizeModelMap.put(model.getId(), model);
            }
         } else if (this.getActivityOpenDay() >= model.getDateStart() && this.getActivityOpenDay() <= model.getDateEnd() && model.getActivityId() == this.getPlayerActivityId()) {
            prizeModelMap.put(model.getId(), model);
         }
      }

      Set<Integer> prizeList = new HashSet();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());

      for(int[] prizePosGroup : CHESS_PRIZE_POS_ARR) {
         List<Integer> openIconList = new ArrayList();

         for(int prizePos : prizePosGroup) {
            if (!playerActivityDao.activityHuaJiaData.chessIsOpen(prizePos)) {
               break;
            }

            int icon = playerActivityDao.activityHuaJiaData.chessIcon(prizePos);
            if (icon <= 0) {
               break;
            }

            openIconList.add(icon);
         }

         if (openIconList.size() == 3) {
            for(HuaJiaBeautyConnectNewModel prizeModel : prizeModelMap.values()) {
               if (prizeModel.getGroup().size() != 3) {
                  this.logger.error("奖项{}中奖组合大小不为3", prizeModel.getId());
               } else if (!playerActivityDao.activityHuaJiaData.prizeSet.contains(prizeModel.getId())) {
                  int prizeCount = 0;

                  for(int index = 0; index < prizeModel.getGroup().size() && ((Integer)openIconList.get(index)).equals(prizeModel.getGroup().get(index)); ++index) {
                     ++prizeCount;
                  }

                  if (prizeCount == 3) {
                     playerActivityDao.activityHuaJiaData.prizeSet.add(prizeModel.getId());
                     playerActivityDao.updateOp();
                     this.player.addResource(prizeModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 143, 14304, prizeModel.getId(), 1, "");
                     prizeList.add(prizeModel.getId());
                     this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "新美人活动玲珑绘琪", prizeModel.getTypeName(), prizeModel.getTypeName(), 0, 0, 1);
                  }
               }
            }
         }
      }

      return prizeList;
   }

   private void sendChessList() {
      HuaJiaActMsg.S2C_ChessList_24418.Builder resp = HuaJiaActMsg.S2C_ChessList_24418.newBuilder();
      resp.addAllChessList(this.buildChessDataList());
      this.player.sendMsg(resp.build());
   }

   private List<HuaJiaActMsg.ChessData> buildChessDataList() {
      List<HuaJiaActMsg.ChessData> msgList = new ArrayList();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());

      for(int pos : playerActivityDao.activityHuaJiaData.alreadyOpenChess()) {
         HuaJiaActMsg.ChessData.Builder builder = HuaJiaActMsg.ChessData.newBuilder();
         builder.setPos(pos);
         builder.setIconId(playerActivityDao.activityHuaJiaData.chessIcon(pos));
         msgList.add(builder.build());
      }

      return msgList;
   }

   private void flushChess() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.activityHuaJiaData.newChessMap.isEmpty() || playerActivityDao.activityHuaJiaData.alreadyOpenChess().size() >= 9) {
         playerActivityDao.activityHuaJiaData.newChessMap.clear();
         playerActivityDao.activityHuaJiaData.prizeSet.clear();
         playerActivityDao.updateOp();
         Map<Integer, HuaJiaBeautyConnectGroupNewModel> modelMap = ApplicationContextProvider.<Integer, HuaJiaBeautyConnectGroupNewModel>getModelPoolMap("HuaJiaBeautyConnectGroupNew");
         List<HuaJiaBeautyConnectGroupNewModel> tongQueBeautyConnectGroupModels = new ArrayList();

         for(HuaJiaBeautyConnectGroupNewModel model : modelMap.values()) {
            if (model.getDateEnd() == -1) {
               if (this.getActivityOpenDay() >= model.getDateStart() && model.getActivityId() == this.getPlayerActivityId()) {
                  tongQueBeautyConnectGroupModels.add(model);
               }
            } else if (this.getActivityOpenDay() >= model.getDateStart() && this.getActivityOpenDay() <= model.getDateEnd()) {
               tongQueBeautyConnectGroupModels.add(model);
            }
         }

         Iterator<HuaJiaBeautyConnectGroupNewModel> iterator = tongQueBeautyConnectGroupModels.iterator();

         while(iterator.hasNext()) {
            HuaJiaBeautyConnectGroupNewModel tongQueBeautyConnectGroupModel = (HuaJiaBeautyConnectGroupNewModel)iterator.next();
            if (tongQueBeautyConnectGroupModel.getMaxTimes() > 0 && tongQueBeautyConnectGroupModel.getMaxTimes() <= (Integer)MapUtil.getOrDefault(playerActivityDao.activityHuaJiaData.connect, tongQueBeautyConnectGroupModel.getId(), 0)) {
               iterator.remove();
            }
         }

         if (tongQueBeautyConnectGroupModels.size() != 0) {
            List<WeightRandom.WeightObj<Integer>> weightList = new ArrayList();

            for(int index = 0; index < tongQueBeautyConnectGroupModels.size(); ++index) {
               weightList.add(new WeightRandom.WeightObj(index, (double)((HuaJiaBeautyConnectGroupNewModel)tongQueBeautyConnectGroupModels.get(index)).getWeight()));
            }

            WeightRandom<Integer> weightRandom = RandomUtil.weightRandom(weightList);
            HuaJiaBeautyConnectGroupNewModel randomModel = (HuaJiaBeautyConnectGroupNewModel)tongQueBeautyConnectGroupModels.get((Integer)weightRandom.next());
            List<Integer> iconList = randomModel.getPos();

            for(int i = 0; i < iconList.size(); ++i) {
               playerActivityDao.activityHuaJiaData.newChessMap.put(i + 1, MiscUtil.comboInteger(0, (Integer)iconList.get(i)));
            }

            if (randomModel.getMaxTimes() > 0) {
               playerActivityDao.activityHuaJiaData.connect.put(randomModel.getId(), (Integer)MapUtil.getOrDefault(playerActivityDao.activityHuaJiaData.connect, randomModel.getId(), 0) + 1);
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
         HuaJiaActMsg.S2C_TongQueParkMain_24402.Builder msg = HuaJiaActMsg.S2C_TongQueParkMain_24402.newBuilder();
         msg.setEndTime(activityInfo.end);
         msg.setFlyGoldCount(playerActivityDao.activityHuaJiaData.goldFly);
         msg.setFlushCount(playerActivityDao.activityHuaJiaData.flush);

         for(int pos : playerActivityDao.activityHuaJiaData.alreadyOpenChess()) {
            HuaJiaActMsg.ChessData.Builder builder = HuaJiaActMsg.ChessData.newBuilder();
            builder.setPos(pos);
            builder.setIconId(playerActivityDao.activityHuaJiaData.chessIcon(pos));
            msg.addChessList(builder);
         }

         HuaJiaActTaskPart tongQueParkTaskPart = (HuaJiaActTaskPart)this.player.getMgrPart(HuaJiaActTaskPart.class);
         msg.addAllTaskList(tongQueParkTaskPart.getTaskListMsg());
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
         Map<Integer, GiftDao> giftDaoMap = giftPart.getBuyGifts(24);
         Map<Integer, List<ShopLimitModel>> allShopLimitMap = ApplicationContextProvider.<Integer, List<ShopLimitModel>>getModelPoolMap("customActivityShopLimit");

         for(ShopLimitModel shopLimitModel : (List)MapUtil.getOrDefault(allShopLimitMap, activityInfo.id, ArrayList.class)) {
            HuaJiaActMsg.GiftData.Builder giftData = HuaJiaActMsg.GiftData.newBuilder();
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

         msg.setActivityStartDay(this.getActivityOpenDay());
         this.player.sendMsg(msg.build());
      }
   }

   public void resetDaily() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityHuaJiaData.reset();
      playerActivityDao.updateOp();
      if (!this.isServerActivityInvalid()) {
         if (this.getSeverActivityDay() != 1) {
            HuaJiaActTaskPart HuaJiaActTaskPart = (HuaJiaActTaskPart)this.player.getMgrPart(HuaJiaActTaskPart.class);

            for(TaskData taskData : HuaJiaActTaskPart.getTasksMap().values()) {
               taskData.delete();
            }

            Map<Integer, HuaJiaActivityTaskGroupNewModel> allTaskModelMap = ApplicationContextProvider.<Integer, HuaJiaActivityTaskGroupNewModel>getModelPoolMap("HuaJiaActivityTaskGroupNew");
            ConcurrentHashMap<Integer, TreeMap<Integer, Set<Integer>>> tempHashMap = new ConcurrentHashMap();

            for(Map.Entry<Integer, HuaJiaActivityTaskGroupNewModel> entry : allTaskModelMap.entrySet()) {
               HuaJiaActivityTaskGroupNewModel model = (HuaJiaActivityTaskGroupNewModel)entry.getValue();
               if (model.getDateEnd() == -1) {
                  if (this.getActivityOpenDay() >= model.getDateStart() && model.getActivityId() == this.getPlayerActivityId()) {
                     ((Set)((TreeMap)tempHashMap.computeIfAbsent(model.getActivityId(), (v) -> new TreeMap())).computeIfAbsent(model.getTaskGroup(), (v) -> new HashSet())).add(model.getIncludeTaskId());
                  }
               } else if (this.getActivityOpenDay() >= model.getDateStart() && this.getActivityOpenDay() <= model.getDateEnd()) {
                  ((Set)((TreeMap)tempHashMap.computeIfAbsent(model.getActivityId(), (v) -> new TreeMap())).computeIfAbsent(model.getTaskGroup(), (v) -> new HashSet())).add(model.getIncludeTaskId());
               }
            }

            TreeMap<Integer, Set<Integer>> groupTasksModelMap = MapUtil.getOrDefault(tempHashMap, this.getServerActivityInfo().id, TreeMap.class);
            if (!groupTasksModelMap.isEmpty()) {
               int curGroup = playerActivityDao.activityHuaJiaData.taskGroup;
               playerActivityDao.activityHuaJiaData.taskGroup = curGroup >= (Integer)groupTasksModelMap.lastKey() ? (Integer)groupTasksModelMap.firstKey() : curGroup + 1;
               playerActivityDao.updateOp();
            }

            HuaJiaActTaskPart.trigger();
            this.sendInfo();
         }
      }
   }

   public void rotateReset(int oldActivityId) {
      this.clearActivityGift(24);
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityHuaJiaData.resetAll();
      HuaJiaActTaskPart tongQueParkTaskPart = (HuaJiaActTaskPart)this.player.getMgrPart(HuaJiaActTaskPart.class);

      for(TaskData taskData : tongQueParkTaskPart.getTasksMap().values()) {
         taskData.delete();
      }

      Map<Integer, HuaJiaActivityTaskGroupNewModel> allTaskModelMap = ApplicationContextProvider.<Integer, HuaJiaActivityTaskGroupNewModel>getModelPoolMap("HuaJiaActivityTaskGroupNew");
      ConcurrentHashMap<Integer, TreeMap<Integer, Set<Integer>>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<Integer, HuaJiaActivityTaskGroupNewModel> entry : allTaskModelMap.entrySet()) {
         HuaJiaActivityTaskGroupNewModel model = (HuaJiaActivityTaskGroupNewModel)entry.getValue();
         if (model.getDateEnd() == -1) {
            if (this.getActivityOpenDay() >= model.getDateStart() && model.getActivityId() == this.getPlayerActivityId()) {
               ((Set)((TreeMap)tempHashMap.computeIfAbsent(model.getActivityId(), (v) -> new TreeMap())).computeIfAbsent(model.getTaskGroup(), (v) -> new HashSet())).add(model.getIncludeTaskId());
            }
         } else if (this.getActivityOpenDay() >= model.getDateStart() && this.getActivityOpenDay() <= model.getDateEnd()) {
            ((Set)((TreeMap)tempHashMap.computeIfAbsent(model.getActivityId(), (v) -> new TreeMap())).computeIfAbsent(model.getTaskGroup(), (v) -> new HashSet())).add(model.getIncludeTaskId());
         }
      }

      TreeMap<Integer, Set<Integer>> groupTasksModelMap = MapUtil.getOrDefault(tempHashMap, this.getServerActivityInfo().id, TreeMap.class);
      if (!groupTasksModelMap.isEmpty()) {
         playerActivityDao.activityHuaJiaData.taskGroup = (Integer)groupTasksModelMap.firstKey();
         tongQueParkTaskPart.trigger();
      }

      playerActivityDao.updateOp();
      ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
      shopPart.resetShopById(52);
   }

   public void activityEnd(int oldActivityId) {
      String sellItem = this.getTableModel().getSellItem();
      String[] sells = sellItem.split("\\|");

      for(int i = 0; i < sells.length; ++i) {
         long itemNum = this.player.getResourceNum(2, Integer.parseInt(sells[i]));
         if (itemNum > 0L) {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", Integer.parseInt(sells[i]));
            if (itemModel != null && !itemModel.getSell().isEmpty()) {
               this.player.addResource((Integer)itemModel.getSell().get(0), (Integer)itemModel.getSell().get(1), (Integer)itemModel.getSell().get(2) * (int)itemNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 14308, 14310, 0, 0, "");
               this.player.delResource(2, Integer.parseInt(sells[i]), itemNum, 143, 14308, 0, 0, "");
            }
         }
      }

   }

   public int getActivityType() {
      return 104;
   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
      if (!mainOpen) {
         List<ResourceModel> resourceModels = new ArrayList();
         HuaJiaActTaskPart tongQueParkTaskPart = (HuaJiaActTaskPart)this.player.getMgrPart(HuaJiaActTaskPart.class);

         for(TaskData taskData : tongQueParkTaskPart.getTasksMap().values()) {
            if (taskData.state == 2) {
               HuaJiaActivityTaskNewModel tongQueActivityTaskModel = (HuaJiaActivityTaskNewModel)ApplicationContextProvider.getModelPoolEntity("HuaJiaActivityTaskNew", taskData.id);
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

   @MsgHandlerAnno
   public void C2S_RecruitResult_24425(HuaJiaActMsg.C2S_RecruitResult_24425 msg, String source) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      HuaJiaActMsg.S2C_RecruitResult_24426.Builder builder = HuaJiaActMsg.S2C_RecruitResult_24426.newBuilder();

      for(BeautyTreasureRecord treasureRecord : playerActivityDao.activityHuaJiaData.recordList) {
         HuaJiaActMsg.RecruitRecord.Builder record = HuaJiaActMsg.RecruitRecord.newBuilder();
         record.setPlayerName(this.player.getPublicDao().playerName);
         record.setPlayerId(this.player.getPlayerId());
         record.setServerId(this.player.getServerId());
         record.setAwardId(treasureRecord.awardId);
         builder.addMyRecord(record);
      }

      for(Map.Entry<Integer, Integer> entry : playerActivityDao.activityHuaJiaData.receiveRecord.entrySet()) {
         CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
         mapData.setKey((Integer)entry.getKey());
         mapData.setValue((Integer)entry.getValue());
         builder.addAwardList(mapData);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_RecruitTongQueTreasure_24421(HuaJiaActMsg.C2S_RecruitTongQueTreasure_24421 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         HuaJiaActMsg.S2C_RecruitTongQueTreasure_24422.Builder builder = HuaJiaActMsg.S2C_RecruitTongQueTreasure_24422.newBuilder();
         ActivityTongQueRotateData data = playerActivityDao.activityHuaJiaData;
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
            this.logger.error("美人活动排期抽奖抽取次数错误：" + num);
         } else {
            HuaJiaActivityTableNewModel treasureModel = this.getTableModel();
            if (treasureModel != null) {
               if (treasureModel.getActType() != this.getActivityType()) {
                  this.logger.error("抽奖id活动类型不一致！");
               } else if (!ResourceModel.checkTotalNumError((Integer)treasureModel.getSpend().get(2), num)) {
                  PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
                  if (!this.player.checkResourceNum((Integer)treasureModel.getSpend().get(0), (Integer)treasureModel.getSpend().get(1), (Integer)treasureModel.getSpend().get(2) * num)) {
                     this.player.failure(76048);
                  } else {
                     int maxNum = this.configManager.getIntDefault("LotteryLimit", 99999);
                     int commonNum = (Integer)playerResetCustomCache.getDailyNum(54, 0);
                     if (commonNum + num > maxNum) {
                        this.player.failure(51);
                     } else {
                        int awardGroup = treasureModel.getGroup1();
                        Map<Integer, HuaJiaActivityRewardNewModel> modelMap = this.player.getGameModelPool().getMap("HuaJiaActivityRewardNew");
                        List<HuaJiaActivityRewardNewModel> lotteryModelList = this.getLotteryModelList(awardGroup);
                        if (lotteryModelList.isEmpty()) {
                           this.logger.error("未获取到新美人活动抽奖奖励列表，请检查配置！");
                        } else {
                           List<Integer> targetList = new ArrayList();

                           for(int i = 0; i < num; ++i) {
                              for(HuaJiaActivityRewardNewModel model : lotteryModelList) {
                                 MapUtil.mapPlusInt(data.historyRecord, model.getForm(), 1);
                              }

                              int targetId = this.recruitOneAward(lotteryModelList, data);
                              if (targetId != 0) {
                                 MapUtil.mapPlusInt(data.receiveRecord, targetId, 1);
                                 if (((HuaJiaActivityRewardNewModel)modelMap.get(targetId)).getTrue3() > 0) {
                                    BeautyTreasureRecord record = new BeautyTreasureRecord();
                                    record.awardId = targetId;
                                    data.recordList.add(record);
                                    if (data.recordList.size() > treasureModel.getCodeTimes()) {
                                       data.recordList.remove(0);
                                    }
                                 }

                                 targetList.add(targetId);
                                 if (data.historyRecord.containsKey(((HuaJiaActivityRewardNewModel)modelMap.get(targetId)).getForm())) {
                                    data.historyRecord.put(((HuaJiaActivityRewardNewModel)modelMap.get(targetId)).getForm(), 0);
                                 }
                              }
                           }

                           List<Integer> formList = new ArrayList();

                           for(HuaJiaActivityRewardNewModel model : lotteryModelList) {
                              formList.add(model.getForm());
                           }

                           Collections.sort(formList);
                           List<ResourceModel> awardList = new ArrayList();
                           List<Integer> broadcastList = new ArrayList();

                           for(Integer form : formList) {
                              for(Integer targetId : targetList) {
                                 if (!modelMap.containsKey(targetId)) {
                                    this.logger.error("新美人活动排期抽奖奖励id错误：" + targetId);
                                 } else if (((HuaJiaActivityRewardNewModel)modelMap.get(targetId)).getForm() == form) {
                                    builder.addResultList(targetId);

                                    for(ResourceModel reward : ((HuaJiaActivityRewardNewModel)modelMap.get(targetId)).getRewards()) {
                                       awardList.add(new ResourceModel(reward.getType(), reward.getId(), reward.getValue()));
                                    }

                                    if (((HuaJiaActivityRewardNewModel)modelMap.get(targetId)).getTrue3() > 0) {
                                       broadcastList.add(targetId);
                                    }
                                 }
                              }
                           }

                           playerActivityDao.updateOp();
                           playerResetCustomCache.addDailyReset(54, num);
                           this.player.delResource((Integer)treasureModel.getSpend().get(0), (Integer)treasureModel.getSpend().get(1), (long)((Integer)treasureModel.getSpend().get(2) * num), 143, 14309, 0, 0, "");
                           this.player.addResource(awardList, PlayerMsg.ShowType.SHOW_BEAUTY_TREASURE, 143, 14310, 0, 0, "");
                           int highNum = (Integer)playerResetCustomCache.getDailyNum(54, 0);
                           builder.setDrawNum(highNum);
                           this.player.sendMsg(builder.build());
                           this.player.triggerTask(637, 0, (long)num, 1);
                           if (!broadcastList.isEmpty()) {
                              HuaJiaActMsg.S2S_RecruitRecord_24427.Builder crossBuilder = HuaJiaActMsg.S2S_RecruitRecord_24427.newBuilder();

                              for(Integer id : broadcastList) {
                                 if (modelMap.containsKey(id)) {
                                    HuaJiaActMsg.RecruitRecord.Builder recordBuilder = HuaJiaActMsg.RecruitRecord.newBuilder();
                                    recordBuilder.setAwardId(id);
                                    recordBuilder.setServerId(this.player.getServerId());
                                    recordBuilder.setPlayerId(this.player.getPlayerId());
                                    recordBuilder.setPlayerName(this.player.getPublicDao().playerName);
                                    crossBuilder.addRecord(recordBuilder);
                                 }
                              }

                              this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), crossBuilder.build());
                           }

                           int itemId = (Integer)treasureModel.getSpend().get(1);
                           int realNum = (Integer)treasureModel.getSpend().get(2) * num;

                           for(ResourceModel resourceModel : awardList) {
                              String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                              this.player.getOperationMgr().addExtraLog(this.player, 198, "新美人活动排期抽奖", itemId + "", realNum + "", strings[0], strings[2], strings[1], "0");
                           }

                        }
                     }
                  }
               }
            }
         }
      }
   }

   public HuaJiaActivityTableNewModel getTableModel() {
      Map<Integer, HuaJiaActivityTableNewModel> treasureMap = this.player.getGameModelPool().getMap("HuaJiaActivityTableNew");

      for(HuaJiaActivityTableNewModel model : treasureMap.values()) {
         if (model.getDateEnd() == -1) {
            if (this.getActivityOpenDay() >= model.getDateStart() && model.getActId() == this.getPlayerActivityId()) {
               return model;
            }
         } else if (this.getActivityOpenDay() >= model.getDateStart() && this.getActivityOpenDay() <= model.getDateEnd() && model.getActId() == this.getPlayerActivityId()) {
            return model;
         }
      }

      this.logger.error("花嫁活动未获取到消耗表：{}", this.getActivityOpenDay());
      return (HuaJiaActivityTableNewModel)treasureMap.get(1);
   }

   public int recruitOneAward(List<HuaJiaActivityRewardNewModel> modelList, ActivityTongQueRotateData data) {
      List<KeyValFun> funList = new ArrayList();

      for(HuaJiaActivityRewardNewModel model : modelList) {
         int recruitNum = 0;
         int receiveNum = 0;
         if (data.historyRecord.containsKey(model.getForm())) {
            recruitNum = (Integer)data.historyRecord.get(model.getForm());
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
         this.logger.error("美人活动排期抽奖未获取到数据!!!!!");
         return 0;
      } else {
         int targetId = GamePlayer.countRate(funList);
         return targetId;
      }
   }

   public List<HuaJiaActivityRewardNewModel> getLotteryModelList(int awardGroup) {
      List<HuaJiaActivityRewardNewModel> modelList = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      Map<Integer, HuaJiaActivityRewardNewModel> allMap = this.player.getGameModelPool().getMap("HuaJiaActivityRewardNew");
      if (allMap != null && allMap.size() > 0) {
         for(HuaJiaActivityRewardNewModel model : allMap.values()) {
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

   @MsgHandlerAnno
   public void C2S_TongQueTreasureInfo_24419(HuaJiaActMsg.C2S_TongQueTreasureInfo_24419 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         HuaJiaActMsg.S2C_TongQueTreasureInfo_24420.Builder builder = HuaJiaActMsg.S2C_TongQueTreasureInfo_24420.newBuilder();
         WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);

         for(BeautyTreasureRecord treasureRecord : ((ActivityData)worldDao.jsonData).huaJiaLotteryRecord) {
            HuaJiaActMsg.RecruitRecord.Builder record = HuaJiaActMsg.RecruitRecord.newBuilder();
            record.setPlayerName(treasureRecord.playerName);
            record.setPlayerId(treasureRecord.playerId);
            record.setServerId(treasureRecord.serverId);
            record.setAwardId(treasureRecord.awardId);
            builder.addAllRecord(record);
         }

         for(BeautyTreasureRecord treasureRecord : playerActivityDao.activityHuaJiaData.recordList) {
            HuaJiaActMsg.RecruitRecord.Builder record = HuaJiaActMsg.RecruitRecord.newBuilder();
            record.setPlayerName(this.player.getPublicDao().playerName);
            record.setPlayerId(this.player.getPlayerId());
            record.setServerId(this.player.getServerId());
            record.setAwardId(treasureRecord.awardId);
            builder.addMyRecord(record);
         }

         for(Map.Entry<Integer, Integer> entry : playerActivityDao.activityHuaJiaData.receiveRecord.entrySet()) {
            CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
            mapData.setKey((Integer)entry.getKey());
            mapData.setValue((Integer)entry.getValue());
            builder.addAwardList(mapData);
         }

         builder.setSpecialRecruitNum((Integer)playerActivityDao.activityHuaJiaData.historyRecord.getOrDefault(1, 0));
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int commonNum = (Integer)playerResetCustomCache.getDailyNum(54, 0);
         builder.setDrawNum(commonNum);
         this.player.sendMsg(builder.build());
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
