package com.gzbz.gamePlayer.pray;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPrayDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.PlayerProperty;
import com.gzbz.model.PrayGridModel;
import com.gzbz.model.PrayLuckyRewardModel;
import com.gzbz.model.PrayModel;
import com.gzbz.model.PrayRewardLibModel;
import com.gzbz.model.QualityColorModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.PrayMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
public class PrayPart extends PlayerPart {
   public static final String PRAY_VIP_LEVEL = "prayVIPLevel";
   public static final String LUCKY_TREASURE = "LuckyTreasure";
   public static final String LUCKY_HIGH_TREASURE = "LuckyHighTreasure";
   public static final String LANG_PRAY_1 = "pray1";
   public static final String LANG_PRAY_2 = "pray2";
   public static final int PRAY_NORMAL = 1;
   public static final int PRAY_GOLD = 2;
   public static final String SURE_RENOVATE = "prayGridSureRenovate";
   public static final String PRAY_GRID_NEVER_GET_NUM = "prayGridNeverGetNum";
   public static final String PRAY_GRID_SURE_GET_NUM = "prayGridSureGetNum";
   public static final String PRAY_GRID_SURE_GET_NUM2 = "prayGridSureGetNum2";
   @Autowired
   ConfigManager configManager;

   @MsgHandlerAnno
   public void GetPrayInfo(PrayMsg.C2S_GetPrayInfo_7501 msg, String channelId) {
      PrayMsg.S2C_GetPrayInfo_7502.Builder down = PrayMsg.S2C_GetPrayInfo_7502.newBuilder();
      Map<Integer, PrayModel> prayModelMap = this.player.getGameModelPool().getMap("pray");

      for(PrayModel pray : prayModelMap.values()) {
         down.addPrayInfo(this.prayInfo(pray));
         down.addLuckyInfo(this.luckRewardInfo(pray.getId()));
      }

      this.player.sendMsg(down.build());
   }

   @MsgHandlerAnno
   public void pray(PrayMsg.C2S_Pray_7503 msg, String channelId) {
      int prayId = msg.getPrayId();
      int prayIndex = msg.getPrayTimesIndex();
      this.handlePray(prayId, prayIndex);
   }

   public List<ResourceModel> handlePray(int prayId, int prayIndex) {
      List<ResourceModel> resourceModelList = new ArrayList();
      PrayModel prayModel = (PrayModel)this.player.getGameModelPool().getEntity("pray", prayId);
      if (prayModel == null) {
         this.player.failure(6);
         return resourceModelList;
      } else if (prayIndex >= 0 && prayIndex < prayModel.getPrayTimes().size()) {
         int times = (Integer)prayModel.getPrayTimes().get(prayIndex);
         ResourceModel cost = (ResourceModel)prayModel.getCost().get(prayIndex);
         if (!this.player.checkResourceNum(cost)) {
            this.player.failure(6);
            return resourceModelList;
         } else if (!this.checkVipLevel(prayId, times)) {
            this.player.failure(19);
            return resourceModelList;
         } else {
            this.player.delResource(cost, 16, 1601, prayId, times, String.valueOf(this.player.getPlayerId()));
            PlayerPrayDao playerPrayDao = this.getPlayerPrayDao(prayId);
            Map<Integer, Integer> gotGrid = playerPrayDao.prayInfo.gotGrid;
            Map<KeyValFun, ResourceModel> rewards = playerPrayDao.prayInfo.rewards;
            List<ResourceModel> rewardList = new ArrayList();
            PrayMsg.S2C_Pray_7504.Builder down = PrayMsg.S2C_Pray_7504.newBuilder();
            PlayerDao playerDao = this.player.getPlayerDao();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int luckNum = 0;
            int surePos = 2;
            int sureNum = 30;
            if (prayId == 1) {
               luckNum = (Integer)playerResetCustomCache.getForeverNum(511, 0);
               surePos = Integer.parseInt(this.configManager.parseValue("prayGridSureGetNum", 0, "\\|"));
               sureNum = Integer.parseInt(this.configManager.parseValue("prayGridSureGetNum", 1, "\\|"));
               this.updatePlayerDrawCount(prayId, luckNum + times);
            } else if (prayId == 2) {
               luckNum = (Integer)playerResetCustomCache.getForeverNum(512, 0);
               surePos = Integer.parseInt(this.configManager.parseValue("prayGridSureGetNum2", 0, "\\|"));
               sureNum = Integer.parseInt(this.configManager.parseValue("prayGridSureGetNum2", 1, "\\|"));
               this.updatePlayerDrawCount(prayId, luckNum + times);
            }

            int neverPos = Integer.parseInt(this.configManager.parseValue("prayGridNeverGetNum", 0, "\\|"));
            int neverNum = Integer.parseInt(this.configManager.parseValue("prayGridNeverGetNum", 1, "\\|"));
            boolean bNever = luckNum + times < neverNum;
            int tempCount = (Integer)gotGrid.getOrDefault(surePos, 0);
            boolean bSure = tempCount > 0 && luckNum + times >= sureNum;

            for(int i = 0; i < times; ++i) {
               List<KeyValFun> rateList = new ArrayList();
               Map<Integer, KeyValFun> posMap = new HashMap();

               for(KeyValFun fun : rewards.keySet()) {
                  Integer count = (Integer)gotGrid.get(fun.getKey());
                  if ((count == null || count > 0) && (prayId != 1 || fun.getKey() != neverPos || !bNever)) {
                     posMap.put(fun.getKey(), fun);
                     rateList.add(fun);
                  }
               }

               int pos = GamePlayer.countRate(rateList);
               if (bSure) {
                  pos = surePos;
                  bSure = false;
               }

               if (gotGrid.containsKey(pos)) {
                  gotGrid.put(pos, (Integer)gotGrid.get(pos) - 1);
               }

               if (!posMap.containsKey(pos)) {
                  this.logger.warn("夺宝抽取物品发生错误 playerId:{}", this.player.getPlayerId());
                  return resourceModelList;
               }

               rewardList.add(rewards.get(posMap.get(pos)));
               down.addPos(pos);
               if (gotGrid.containsKey(pos)) {
                  this.appendPrayRecord(prayId, playerDao.playerName, (ResourceModel)rewards.get(posMap.get(pos)));
                  resourceModelList.add(rewards.get(posMap.get(pos)));
               }

               if (pos == surePos) {
                  this.updatePlayerDrawCount(prayId, 0);
               }
            }

            playerPrayDao.luckyPoint += times * prayModel.getLuckPoint();
            playerPrayDao.updateOp();
            down.setLuckyPoint(playerPrayDao.luckyPoint);
            rewardList.add(new ResourceModel(1, PlayerDefine.PLAYER_PRAY_SCORE, prayModel.getPrayScore() * times));
            this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_PRAY, 16, 1601, prayId, times, String.valueOf(this.player.getPlayerId()));
            if (resourceModelList.size() > 0) {
               for(ResourceModel resourceModel : resourceModelList) {
                  PrayMsg.Pray_RecordData.Builder recordData = PrayMsg.Pray_RecordData.newBuilder();
                  recordData.setPlayerName(playerDao.playerName);
                  CommonMsg.ItemInfo.Builder itemInfo = CommonMsg.ItemInfo.newBuilder();
                  itemInfo.setType(resourceModel.getType());
                  itemInfo.setId(resourceModel.getId());
                  itemInfo.setNum(resourceModel.getValue());
                  recordData.setReward(itemInfo);
                  down.addData(recordData);
               }

               this.showRewards(prayId, resourceModelList);
            }

            this.player.sendMsg(down.build());
            this.player.triggerTask(513, 0, (long)times, 1);
            this.player.triggerTask(344, prayId, (long)times, 1);
            return resourceModelList;
         }
      } else {
         this.player.failure(6);
         return resourceModelList;
      }
   }

   private boolean checkVipLevel(int prayId, int times) {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      String str = configManager.getStr("prayVIPLevel");
      String[] split = str.split("\\|");

      for(String s : split) {
         String[] temp = s.split(",");
         if (Integer.parseInt(temp[0]) == prayId && Integer.parseInt(temp[1]) == times) {
            PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
            if (playerDao.vip_lv < Integer.parseInt(temp[2])) {
               return false;
            }
         }
      }

      return true;
   }

   @MsgHandlerAnno
   public void refreshPrayReward(PrayMsg.C2S_RefreshPrayReward_7505 msg, String channelId) {
      int prayId = msg.getPrayId();
      this.refreshPrayReward(prayId);
   }

   public void refreshPrayReward(int prayId) {
      PrayModel model = (PrayModel)this.player.getGameModelPool().getEntity("pray", prayId);
      if (model == null) {
         this.player.failure(6);
      } else {
         int interval = 3600000 * model.getFreeRefreshTime();
         PlayerPrayDao playerPrayDao = this.getPlayerPrayDao(prayId);
         boolean free = false;
         if (playerPrayDao.refreshTimes.getTime() + (long)interval > System.currentTimeMillis()) {
            if (!this.player.checkResourceNum(model.getRefreshCost())) {
               this.player.failure(6);
               return;
            }

            this.player.delResource((List)model.getRefreshCost(), 16, 1602, prayId, 0, String.valueOf(this.player.getPlayerId()));
         } else {
            free = true;
         }

         playerPrayDao.refreshPrayInfo(this.createNewPrayInfo(prayId, true), free);
         this.player.sendMsg(this.prayInfo(model).build());
         this.updatePlayerDrawCount(prayId, 0);
      }
   }

   @MsgHandlerAnno
   public void getLuckReward(PrayMsg.C2S_GetLuckyReward_7507 msg, String channelId) {
      int prayId = msg.getPrayId();
      int rewardId = msg.getRewardId();
      PrayLuckyRewardModel model = (PrayLuckyRewardModel)this.player.getGameModelPool().getEntity("prayLuckyReward", rewardId);
      if (model == null) {
         this.player.failure(6);
      } else {
         PlayerPrayDao playerPrayDao = this.getPlayerPrayDao(prayId);
         if (playerPrayDao.luckyReward.contains(rewardId)) {
            this.player.failure(24);
         } else if (playerPrayDao.luckyPoint < model.getLuckyPoint()) {
            this.player.failure(6);
         } else {
            playerPrayDao.luckyReward.add(model.getId());
            Map<Integer, PrayLuckyRewardModel> map = this.player.getGameModelPool().getMap("prayLuckyReward");
            int boxCount = 0;
            int maxLuckPoint = 0;

            for(PrayLuckyRewardModel m : map.values()) {
               maxLuckPoint = Math.max(maxLuckPoint, m.getLuckyPoint());
               if (m.getPrayId() == prayId) {
                  ++boxCount;
               }
            }

            if (playerPrayDao.luckyReward.size() == boxCount) {
               playerPrayDao.luckyReward.clear();
               playerPrayDao.luckyPoint -= maxLuckPoint;
            }

            playerPrayDao.updateOp();
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 16, 1602, prayId, model.getLuckyPoint(), String.valueOf(this.player.getPlayerId()));
            PrayMsg.S2C_GetLuckyReward_7508.Builder builder = this.luckRewardInfo(prayId);
            this.player.sendMsg(builder.build());
            LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
            logOperationMgr.pushTask(() -> logOperationMgr.addReceiveAwardNewLog(this.player, 16, model.getLuckyPoint(), model.getLuckyPoint() + "", "-", "-", 0, 0, 1));
         }
      }
   }

   public PrayMsg.S2C_GetLuckyReward_7508.Builder luckRewardInfo(int prayId) {
      PrayMsg.S2C_GetLuckyReward_7508.Builder builder = PrayMsg.S2C_GetLuckyReward_7508.newBuilder();
      PlayerPrayDao playerPrayDao = this.getPlayerPrayDao(prayId);
      builder.setPrayId(prayId);
      builder.setLuckyPoint(playerPrayDao.luckyPoint);
      builder.addAllRewardId(playerPrayDao.luckyReward);
      return builder;
   }

   private PrayMsg.S2C_RefreshPrayReward_7506.Builder prayInfo(PrayModel prayModel) {
      PlayerPrayDao playerPrayDao = this.getPlayerPrayDao(prayModel.getId());
      if (playerPrayDao.prayInfo == null) {
         playerPrayDao.refreshPrayInfo(this.createNewPrayInfo(prayModel.getId(), false), false);
      }

      PlayerPrayDao.PrayInfo prayInfo = playerPrayDao.prayInfo;
      PrayMsg.S2C_RefreshPrayReward_7506.Builder info = PrayMsg.S2C_RefreshPrayReward_7506.newBuilder();
      info.setPrayId(prayModel.getId());
      info.addAllGrid(prayInfo.buildInfos());
      info.setRefreshTimes((int)(playerPrayDao.refreshTimes.getTime() / 1000L));
      return info;
   }

   private PlayerPrayDao getPlayerPrayDao(Integer prayId) {
      PlayerPrayDao playerPrayDao = (PlayerPrayDao)this.player.getData("tb_player_pray", this.player.getPlayerId(), prayId);
      if (playerPrayDao == null) {
         playerPrayDao = new PlayerPrayDao();
         playerPrayDao.id = this.player.getPlayerId();
         playerPrayDao.prayId = prayId;
         playerPrayDao.refreshTimes = new Timestamp(System.currentTimeMillis() - 10800000L);
         playerPrayDao.insertOp();
         this.player.insertDao(playerPrayDao);
      }

      return playerPrayDao;
   }

   private PlayerPrayDao.PrayInfo createNewPrayInfo(Integer prayId, boolean bCalcCount) {
      PlayerPrayDao playerPrayDao = this.getPlayerPrayDao(prayId);
      PlayerPrayDao.PrayInfo prayInfo = new PlayerPrayDao.PrayInfo();
      GameModelPool gameModelPool = this.player.getGameModelPool();
      Map<Integer, PrayGridModel> gridModelMap = gameModelPool.getMap("prayGrid");
      Map<Integer, PrayRewardLibModel> rewardLibModelMap = gameModelPool.getMap("prayRewardLib");
      Map<Integer, Set<Integer>> filterMap = new HashMap();

      for(PrayGridModel gridModel : gridModelMap.values()) {
         List<KeyValFun> rateList = new ArrayList();
         if (gridModel.getPrayId() == prayId) {
            for(PrayRewardLibModel libModel : (List)ApplicationContextProvider.getModelPoolEntity("curtomPrayRewardLib", gridModel.getGroupId())) {
               if (bCalcCount && libModel.getLimitNum() > 0) {
                  int count = (Integer)MapUtil.computeIfAbsent(playerPrayDao.refreshLimit, libModel.getId(), 0);
                  if (count >= libModel.getLimitNum() - 1) {
                     rateList.clear();
                     rateList.add(new KeyValFun(libModel.getId(), libModel.getPro()));
                     break;
                  }
               }

               filterMap.computeIfAbsent(libModel.getGroupId(), (v) -> new HashSet());
               if (!((Set)filterMap.get(libModel.getGroupId())).contains(libModel.getType())) {
                  rateList.add(new KeyValFun(libModel.getId(), libModel.getPro()));
               }
            }

            if (!CollectionUtils.isEmpty(rateList)) {
               PrayRewardLibModel prayRewardLibModel = (PrayRewardLibModel)rewardLibModelMap.get(GamePlayer.countRate(rateList));
               ((Set)filterMap.computeIfAbsent(prayRewardLibModel.getGroupId(), (v) -> new HashSet())).add(prayRewardLibModel.getType());
               if (gridModel.getCount() > 0) {
                  prayInfo.gotGrid.put(gridModel.getPos(), gridModel.getCount());
               }

               prayInfo.rewards.put(new KeyValFun(gridModel.getPos(), gridModel.getPro()), new ResourceModel(prayRewardLibModel.getRewardType(), prayRewardLibModel.getRewardId(), prayRewardLibModel.getRewardNum()));
               if (prayRewardLibModel.getLimitNum() > 0) {
                  this.logger.info("刷到指定次数物品，重置次数 id:{}, limit:{}", prayRewardLibModel.getId(), prayRewardLibModel.getLimitNum());
                  playerPrayDao.refreshLimit.put(prayRewardLibModel.getId(), -1);
               }
            } else {
               this.logger.info("祈福商城随不到物品 prayId:" + prayId + " 默认给一个突破石");
               prayInfo.rewards.put(new KeyValFun(gridModel.getPos(), gridModel.getPro()), new ResourceModel(2, 1001, 1));
            }
         }
      }

      if (bCalcCount) {
         for(Map.Entry<Integer, Integer> entry : playerPrayDao.refreshLimit.entrySet()) {
            entry.setValue((Integer)entry.getValue() + 1);
         }

         playerPrayDao.updateOp();
      }

      return prayInfo;
   }

   @MsgHandlerAnno
   public void getPlayerAwardInfo(PrayMsg.C2S_PlayerAwardInfo_7509 msg, String source) {
      int prayId = msg.getPrayId();
      ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
      activityMgr.pushTaskEx("sendPrayRecord", new Object[]{this.player, prayId});
   }

   private void appendPrayRecord(int prayId, String playerName, ResourceModel resourceModel) {
      ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
      activityMgr.pushTaskEx("addPrayRecord", new Object[]{prayId, playerName, resourceModel});
   }

   private void showRewards(int prayId, List<ResourceModel> resourceModelList) {
      PlayerDao playerDao = this.player.getPlayerDao();
      LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "LuckyTreasure");
      LanguageModel languageModel_deep = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "LuckyHighTreasure");
      LanguageModel lang_pray_1 = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "pray1");
      LanguageModel lang_pray_2 = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "pray2");
      String content = prayId == 2 ? languageModel_deep.getValue() : languageModel.getValue();
      String activeName = prayId == 2 ? lang_pray_2.getValue() : lang_pray_1.getValue();

      for(ResourceModel resourceModel : resourceModelList) {
         String name = "";
         int quality = 0;
         switch (resourceModel.getType()) {
            case 1:
               PlayerProperty playerPropertyModel = (PlayerProperty)this.player.getGameModelPool().getEntity("playerProperty", resourceModel.getId());
               name = playerPropertyModel.getName();
               quality = playerPropertyModel.getQuality();
               break;
            case 2:
               ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", resourceModel.getId());
               name = itemModel.getName();
               quality = itemModel.getQuality();
               break;
            case 3:
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", resourceModel.getId());
               name = heroModel.getName();
               quality = heroModel.getQuality();
         }

         if (!"".equals(name)) {
            QualityColorModel qualityColorModel = (QualityColorModel)this.player.getGameModelPool().getEntity("qualityColor", quality);
            String format = MessageFormat.format(content, playerDao.playerName, activeName, qualityColorModel.getColor(), name + "x" + resourceModel.getValue());
            ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
            chatMgr.pushTask(() -> {
               chatMgr.sendSystem((byte)4, (byte)2, this.player.getPlayerId(), playerDao.playerName, format);
               chatMgr.sendSystem((byte)4, (byte)5, this.player.getPlayerId(), playerDao.playerName, format);
            });
         }
      }

   }

   public void resetDaily() {
      boolean surprise = DateUtil.cDay() % 2 == 0;
      this.logger.info("是否需要刷指定物品 surprise:" + surprise);
      Map<Integer, PrayModel> prayModelMap = ApplicationContextProvider.<Integer, PrayModel>getModelPoolMap("pray");

      for(Map.Entry<Integer, PrayModel> entry : prayModelMap.entrySet()) {
         PrayModel prayModel = (PrayModel)entry.getValue();
         PlayerPrayDao playerPrayDao = this.getPlayerPrayDao(prayModel.getId());
         PlayerPrayDao.PrayInfo prayInfo = this.createNewPrayInfo(prayModel.getId(), false);
         if (prayModel.getId() == 1 && surprise) {
            int pos = Integer.parseInt(this.configManager.parseValue("prayGridSureRenovate", 0, "\\|"));
            int lib = Integer.parseInt(this.configManager.parseValue("prayGridSureRenovate", 1, "\\|"));
            ResourceModel resourceModel = this.getSpecialResource(lib);
            if (resourceModel != null) {
               for(Map.Entry<KeyValFun, ResourceModel> rewardEntry : prayInfo.rewards.entrySet()) {
                  KeyValFun keyValFun = (KeyValFun)rewardEntry.getKey();
                  if (keyValFun.getKey() == pos) {
                     this.logger.info("替换指定的奖励");
                     rewardEntry.setValue(resourceModel);
                     break;
                  }
               }
            }
         }

         playerPrayDao.refreshPrayInfo(prayInfo, false);
         this.player.sendMsg(this.prayInfo(prayModel).build());
      }

   }

   private ResourceModel getSpecialResource(int lib) {
      List<KeyValFun> rateList = new ArrayList();
      Map<Integer, PrayRewardLibModel> rewardLibModelMap = ApplicationContextProvider.<Integer, PrayRewardLibModel>getModelPoolMap("prayRewardLib");

      for(PrayRewardLibModel libModel : rewardLibModelMap.values()) {
         if (libModel.getGroupId() == lib) {
            rateList.add(new KeyValFun(libModel.getId(), libModel.getPro()));
         }
      }

      if (!CollectionUtils.isEmpty(rateList)) {
         PrayRewardLibModel prayRewardLibModel = (PrayRewardLibModel)rewardLibModelMap.get(GamePlayer.countRate(rateList));
         return new ResourceModel(prayRewardLibModel.getRewardType(), prayRewardLibModel.getRewardId(), prayRewardLibModel.getRewardNum());
      } else {
         this.logger.info("prayRewardLib 指定的库不存在 lib:{}", lib);
         return null;
      }
   }

   private void updatePlayerDrawCount(int prayId, int num) {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      if (prayId == 1) {
         playerResetCustomCache.setForever(511, num);
      } else if (prayId == 2) {
         playerResetCustomCache.setForever(512, num);
      }

   }
}
