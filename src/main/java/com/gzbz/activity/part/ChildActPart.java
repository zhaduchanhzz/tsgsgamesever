package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.ActivityChildDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.ChildAddUpReturnModel;
import com.gzbz.model.ChildGameDropModel;
import com.gzbz.model.ChildGamePointAwardModel;
import com.gzbz.model.ChildLotteryItemModel;
import com.gzbz.model.ChildShopAddUpModel;
import com.gzbz.model.ChildSignAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.ChildActMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.DateUtil;
import misc.MapUtil;
import misc.MiscUtil;
import misc.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ChildActPart extends AddUpAndConRechargeActivityPart {
   private String CHILD_TICKET_NUM = "childTicketNum";
   private String CHILD_GAME_BUY = "childGameBuy";
   private String CHILD_GAME_TIME = "childGameTime";
   private String CHILD_GAME_LINE_LIMIT = "childGameLineLimit";
   private Integer GMAE_OFFSET_SECONDS = 2;
   private int CAN_NOT_BUY_TICKET = -1;
   @Autowired
   private ConfigManager configManager;

   public ActivityChildDao getDao() {
      ActivityChildDao dao = (ActivityChildDao)this.player.getData("tb_act_child", this.player.getPlayerId());
      return dao;
   }

   public int getActivityLogModule() {
      return 148;
   }

   public int getAddUpLogReason() {
      return 14801;
   }

   public int getAddUpMail() {
      return CentreAwardModel.TYPE_CHILD_ADD_UP_RECHARGE;
   }

   public String getAddUpExcelName() {
      return "ChildAddupRecharge";
   }

   public int getConLogReason() {
      return 0;
   }

   public int getConMail() {
      return 0;
   }

   public String getConExcelName() {
      return null;
   }

   public int getActivityType() {
      return 107;
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         super.sendInfo();
         this.sendActivityInfo();
         this.shopAddUpRechargeHandle(true);
         this.sendPickUpInfo();
         this.sendSignTotalInfo();
      }
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         super.resetDaily();
         this.drawResetDaily();
         this.shopAddUpReset();
         this.sendShopAddUpInfo();
         this.pickUpResetDaily();
         this.sendPickUpInfo();
         this.sendSignTotalInfo();
         this.sendActivityInfo();
      }
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         super.loginHandle();
      }
   }

   public void activityEnd(int oldActivityId) {
      super.activityEnd(oldActivityId);
      this.shopAddUpReset();
      this.signEnd();
      this.pickUpEnd();
      this.drawEnd();
   }

   public void rotateReset(int oldActivityId) {
      ActivityChildDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      dao.lotteryStage = lotteryStage;
      dao.fancyRewardId = 0;
      dao.eggs.clear();
      dao.smashEggNum = 0;
      dao.roundSmashNum.clear();
      dao.takedLuck.clear();
      dao.seniorRewards.clear();
      dao.updateOp();
      this.shopAddUpReset();
      this.pickUpEnd();
      this.pickUpResetDaily();
      this.clearActivityGift(24);
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_24901(ChildActMsg.C2S_ActivityInfo_24901 msg, String source) {
      this.sendActivityInfo();
   }

   public void sendActivityInfo() {
      ChildActMsg.S2C_ActivityInfo_24902.Builder builder = ChildActMsg.S2C_ActivityInfo_24902.newBuilder();
      builder.setOpenDay(this.getActivityOpenDay());
      builder.setActivityDay(this.getSeverActivityDay());
      builder.setSmashEggStage(this.getSmashEggStage());
      this.player.sendMsg(builder.build());
   }

   public void activityRecharge(int money) {
      super.activityRecharge(money);
      this.shopAddUpRechargeHandle(true);
   }

   public void shopAddUpRechargeHandle(boolean sendMsg) {
      if (!this.isServerActivityInvalid()) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            ActivityChildDao dao = this.getDao();
            PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
            dao.dailyRecharge = playerRechargeDao.dailyRecharge;
            dao.updateOp();
         }

         if (sendMsg) {
            this.sendShopAddUpInfo();
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_ShopAddUpInfo_24903(ChildActMsg.C2S_ShopAddUpInfo_24903 msg, String source) {
      this.shopAddUpRechargeHandle(true);
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveShopAddUpReward_24905(ChildActMsg.C2S_ReceiveShopAddUpReward_24905 msg, String source) {
      int id = msg.getId();
      ActivityChildDao dao = this.getDao();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();
      if (shopAddUpGotRewards.contains(id)) {
         return this.player.failure(76030);
      } else if (!this.checkShopAddUpUnlock(id, true)) {
         return false;
      } else {
         ChildShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
         this.player.addResource(shopAddUpModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 14802, 0, 0, "");
         dao.shopAddUpGotRechargeNum.add(shopAddUpModel.getRechargeNum());
         dao.updateOp();
         this.sendShopAddUpInfo();
         return true;
      }
   }

   public void sendShopAddUpInfo() {
      ChildActMsg.S2C_ShopAddUpInfo_24904.Builder builder = ChildActMsg.S2C_ShopAddUpInfo_24904.newBuilder();
      ActivityChildDao dao = this.getDao();
      builder.setDailyRecharge(dao.dailyRecharge);
      builder.addAllGotRewards(this.getShopAddUpGotRewards());
      this.player.sendMsg(builder.build());
   }

   public Set<Integer> getShopAddUpGotRewards() {
      ActivityChildDao dao = this.getDao();
      Set<Integer> rewardIds = new HashSet();
      if (dao.shopAddUpGotRechargeNum.size() > 0) {
         Map<Integer, ChildShopAddUpModel> nowShopAddUpMap = this.getNowShopAddUpMap();

         for(int rechargeNum : dao.shopAddUpGotRechargeNum) {
            ChildShopAddUpModel model = (ChildShopAddUpModel)nowShopAddUpMap.get(rechargeNum);
            if (null != model) {
               rewardIds.add(model.getId());
            }
         }
      }

      return rewardIds;
   }

   public void shopAddUpReset() {
      ActivityChildDao dao = this.getDao();
      Map<Integer, ChildShopAddUpModel> shopAddUpModelMap = this.getNowShopAddUpMap();
      List<ResourceModel> notReceiveRewards = new ArrayList();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();

      for(ChildShopAddUpModel model : shopAddUpModelMap.values()) {
         if (this.checkShopAddUpUnlock(model.getId(), false) && !shopAddUpGotRewards.contains(model.getId())) {
            notReceiveRewards.addAll(model.getRewards());
         }
      }

      if (notReceiveRewards.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_CHILD_SHOP_ADD_UP);
         if (null != centreAwardMap && centreAwardMap.size() > 0) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewards, 604800000L, this.getActivityLogModule(), 14802);
         }
      }

      dao.shopAddUpGotRechargeNum.clear();
      dao.dailyRecharge = 0;
      dao.updateOp();
   }

   public boolean checkShopAddUpUnlock(int id, boolean sendMsg) {
      ChildShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
      if (null == shopAddUpModel) {
         return sendMsg ? this.player.failure(6) : false;
      } else {
         ActivityChildDao dao = this.getDao();
         if (dao.dailyRecharge < shopAddUpModel.getRechargeNum()) {
            return sendMsg ? this.player.failure(76031) : false;
         } else {
            return true;
         }
      }
   }

   public ChildShopAddUpModel getShopAddUpModel(int id) {
      ChildShopAddUpModel model = (ChildShopAddUpModel)this.player.getGameModelPool().getEntity("ChildShopAddup", id);
      return model;
   }

   public Map<Integer, ChildShopAddUpModel> getNowShopAddUpMap() {
      int activityOpenDay = this.getActivityOpenDay();
      Map<Integer, ChildShopAddUpModel> modelMap = new HashMap();
      Map<Integer, ChildShopAddUpModel> allModel = this.player.getGameModelPool().getMap("ChildShopAddup");
      if (allModel != null && !allModel.isEmpty()) {
         for(Map.Entry<Integer, ChildShopAddUpModel> entry : allModel.entrySet()) {
            ChildShopAddUpModel model = (ChildShopAddUpModel)entry.getValue();
            if (model.getDateEnd() == -1) {
               if (activityOpenDay >= model.getDateStart()) {
                  modelMap.put(model.getRechargeNum(), model);
               }
            } else if (activityOpenDay >= model.getDateStart() && activityOpenDay <= model.getDateEnd()) {
               modelMap.put(model.getRechargeNum(), model);
            }
         }

         return modelMap;
      } else {
         return modelMap;
      }
   }

   @MsgHandlerAnno
   public void C2S_SignTotalInfo_24906(ChildActMsg.C2S_SignTotalInfo_24906 msg, String source) {
      this.sendSignTotalInfo();
   }

   public void sendSignTotalInfo() {
      ChildActMsg.S2C_SignTotalInfo_24907.Builder builder = ChildActMsg.S2C_SignTotalInfo_24907.newBuilder();
      ActivityChildDao dao = this.getDao();
      builder.setActivityDay(this.getSeverActivityDay());
      builder.addAllSignGotRewards(dao.signGotRewards);
      this.player.sendMsg(builder.build());
   }

   public boolean checkSignUnlock(int day, boolean sendMsg) {
      ChildSignAwardModel model = (ChildSignAwardModel)this.player.getGameModelPool().getEntity("ChildSignAward", day);
      if (null == model) {
         return sendMsg ? this.player.failure(6) : false;
      } else if (day > this.getSeverActivityDay()) {
         return sendMsg ? this.player.failure(76009) : false;
      } else {
         ActivityChildDao dao = this.getDao();
         if (dao.signGotRewards.contains(day)) {
            return sendMsg ? this.player.failure(76010) : false;
         } else {
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Sign_24908(ChildActMsg.C2S_Sign_24908 msg, String source) {
      int day = msg.getDay();
      if (!this.checkSignUnlock(day, true)) {
         return false;
      } else {
         ChildSignAwardModel model = (ChildSignAwardModel)this.player.getGameModelPool().getEntity("ChildSignAward", day);
         this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 14803, 0, 0, "");
         ActivityChildDao dao = this.getDao();
         dao.signGotRewards.add(day);
         dao.updateOp();
         this.sendSignTotalInfo();
         return true;
      }
   }

   public void signEnd() {
      ActivityChildDao dao = this.getDao();
      dao.signGotRewards.clear();
      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_PickUpInfo_24909(ChildActMsg.C2S_PickUpInfo_24909 msg, String source) {
      this.sendPickUpInfo();
   }

   public void sendPickUpInfo() {
      ActivityChildDao dao = this.getDao();
      ChildActMsg.S2C_PickUpInfo_24910.Builder builder = ChildActMsg.S2C_PickUpInfo_24910.newBuilder();
      builder.setPoint(dao.point);
      builder.setTicketBuyTimes(dao.ticketBuyTimes);
      builder.setTicketBuyCost(this.getTicketBuyCost());
      builder.setGameStartTime(dao.gameStartTime);

      for(Map.Entry<Integer, Integer> entry : dao.gameObjectUniqueIds.entrySet()) {
         ChildActMsg.PickUpGameObjInfo.Builder info = ChildActMsg.PickUpGameObjInfo.newBuilder();
         info.setId((Integer)entry.getKey());
         info.setLineAndType((Integer)entry.getValue());
         builder.addGameObjLineInfo(info.build());
      }

      this.player.sendMsg(builder.build());
   }

   public void sendPickUpRoundInfo() {
      ActivityChildDao dao = this.getDao();
      ChildActMsg.S2C_PickUpShoot_24912.Builder builder = ChildActMsg.S2C_PickUpShoot_24912.newBuilder();
      builder.setCurPoint(dao.curPoint);

      for(int type = 1; type <= 3; ++type) {
         Integer count = (Integer)dao.gameRoundResult.get(type);
         count = count == null ? 0 : count;
         builder.addPickUpObjectTypeCount(count);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public boolean C2S_PickUpShoot_24911(ChildActMsg.C2S_PickUpShoot_24911 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         ActivityChildDao dao = this.getDao();
         if (dao.gameStartTime <= 0) {
            return false;
         } else {
            int gameTime = this.configManager.getIntDefault(this.CHILD_GAME_TIME, 30);
            int nowTime = DateUtil.getIntTime(System.currentTimeMillis());
            if (nowTime >= dao.gameStartTime + gameTime + this.GMAE_OFFSET_SECONDS) {
               this.pickUpGameEnd();
               return false;
            } else {
               int shootId = msg.getShootId();
               if (!dao.gameObjectUniqueIds.containsKey(shootId)) {
                  return false;
               } else {
                  Integer lineAndType = (Integer)dao.gameObjectUniqueIds.get(shootId);
                  int shootType = MiscUtil.getIntLowParam(lineAndType);
                  ChildGameDropModel gameDropModel = (ChildGameDropModel)ApplicationContextProvider.getModelPoolEntity("ChildGameDrop", shootType);
                  if (null == gameDropModel) {
                     return false;
                  } else {
                     Integer shootCount = (Integer)dao.gameRoundResult.get(shootType);
                     if (null == shootCount) {
                        shootCount = 0;
                     }

                     dao.gameRoundResult.put(shootType, shootCount + 1);
                     int oldCurPoint = dao.curPoint;
                     dao.curPoint += gameDropModel.getPoint();
                     if (dao.curPoint < 0) {
                        dao.curPoint = 0;
                     }

                     dao.point += dao.curPoint - oldCurPoint;
                     dao.gameObjectUniqueIds.remove(shootId);
                     dao.updateOp();
                     this.sendPickUpRoundInfo();
                     return true;
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_PickUpGameControl_24926(ChildActMsg.C2S_PickUpGameControl_24926 msg, String source) {
      boolean ret = true;
      int switchOn = msg.getSwitchOn();
      switch (switchOn) {
         case 0:
            ret = this.pickUpGameEnd();
            break;
         case 1:
            ret = this.pickUpGameStart();
      }

      return ret;
   }

   public boolean pickUpGameStart() {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         if (!crossNettyClient.isLogin()) {
            return this.player.failure(76022);
         } else {
            ActivityChildDao dao = this.getDao();
            if (dao.gameStartTime > 0) {
               return this.player.failure(76077);
            } else {
               ResourceModel resourceModel = new ResourceModel();
               resourceModel.setType(2);
               resourceModel.setId(6494);
               resourceModel.setValue(1);
               if (!this.player.checkResourceNum(resourceModel)) {
                  return this.player.failure(76076);
               } else {
                  this.player.delResource(resourceModel, this.getActivityLogModule(), 14809, 0, 0, "");
                  ArrayList<Integer> childGameEveryDrop = this.configManager.getIntList("childGameEveryDrop");
                  if (childGameEveryDrop.size() >= 2 && (Integer)childGameEveryDrop.get(0) <= (Integer)childGameEveryDrop.get(1)) {
                     int gameLineLimit = this.configManager.getIntDefault(this.CHILD_GAME_LINE_LIMIT, 50);
                     dao.gameObjectUniqueIds.clear();
                     Short curLine = Short.valueOf((short)0);
                     Integer lineObjNum = 0;
                     Integer lineObjIndex = 0;
                     Map<Integer, Map<Integer, Integer>> typeCountMap = new HashMap();
                     int i = 0;

                     while(true) {
                        label97: {
                           if (i < 1000) {
                              if (0 == lineObjNum) {
                                 curLine = (short)(curLine + 1);
                                 lineObjNum = RandomUtil.randInt((Integer)childGameEveryDrop.get(0), (Integer)childGameEveryDrop.get(1) + 1);
                              }

                              Integer id = 0;

                              do {
                                 id = RandomUtil.randInt(0, 32767);
                              } while(dao.gameObjectUniqueIds.containsKey(id));

                              int randomType = this.randomGameObjectType();
                              if (randomType <= 0) {
                                 break label97;
                              }

                              Map<Integer, Integer> countMap = (Map)typeCountMap.get(randomType);
                              if (null == countMap) {
                                 countMap = new HashMap();
                                 typeCountMap.put(randomType, countMap);
                              }

                              int stage = this.getStageByCurLine(curLine, randomType);
                              if (stage < 0) {
                                 return false;
                              }

                              Integer count = (Integer)countMap.get(stage);
                              count = null == count ? 0 : count;
                              ChildGameDropModel gameDropModel = (ChildGameDropModel)ApplicationContextProvider.getModelPoolEntity("ChildGameDrop", randomType);
                              if (null != gameDropModel && !gameDropModel.getStageDropLimit().isEmpty()) {
                                 if (stage < gameDropModel.getStageDropLimit().size() && count >= (Integer)gameDropModel.getStageDropLimit().get(stage)) {
                                    break label97;
                                 }

                                 countMap.put(stage, count + 1);
                              }

                              Integer lineAndType = MiscUtil.comboShort(curLine, MiscUtil.getIntLowParam(randomType));
                              dao.gameObjectUniqueIds.put(id, lineAndType);
                              lineObjIndex = lineObjIndex + 1;
                              if (lineObjIndex < lineObjNum) {
                                 break label97;
                              }

                              lineObjNum = 0;
                              lineObjIndex = 0;
                              if (curLine < gameLineLimit) {
                                 break label97;
                              }
                           }

                           dao.gameStartTime = DateUtil.getIntTime(System.currentTimeMillis());
                           dao.updateOp();
                           this.sendPickUpInfo();
                           return true;
                        }

                        ++i;
                     }
                  } else {
                     return false;
                  }
               }
            }
         }
      }
   }

   public int getStageByCurLine(int curLine, int randomType) {
      ChildGameDropModel gameDropModel = (ChildGameDropModel)ApplicationContextProvider.getModelPoolEntity("ChildGameDrop", randomType);
      if (null == gameDropModel) {
         return -1;
      } else {
         List<Integer> stageLine = gameDropModel.getStageLine();
         int totalLine = 0;
         int stage = stageLine.size() - 1;

         for(int i = 0; i < stageLine.size(); ++i) {
            totalLine += (Integer)stageLine.get(i);
            if (curLine <= totalLine) {
               stage = i;
               break;
            }
         }

         return stage;
      }
   }

   public Integer randomGameObjectType() {
      Map<Integer, ChildGameDropModel> dropModelMap = ApplicationContextProvider.<Integer, ChildGameDropModel>getModelPoolMap("ChildGameDrop");
      int totalWeight = 0;

      for(Map.Entry<Integer, ChildGameDropModel> entry : dropModelMap.entrySet()) {
         totalWeight += ((ChildGameDropModel)entry.getValue()).getWeight();
      }

      int random = cn.hutool.core.util.RandomUtil.randomInt(totalWeight);
      int tempLoop = 0;

      for(Map.Entry<Integer, ChildGameDropModel> entry : dropModelMap.entrySet()) {
         tempLoop += ((ChildGameDropModel)entry.getValue()).getWeight();
         if (tempLoop > random) {
            return ((ChildGameDropModel)entry.getValue()).getType();
         }
      }

      return 0;
   }

   public boolean pickUpGameEnd() {
      ActivityChildDao dao = this.getDao();
      if (dao.gameStartTime <= 0) {
         return false;
      } else {
         Map<Integer, ChildGamePointAwardModel> rewardMap = this.player.getGameModelPool().getMap("ChildGamePointAward");
         if (null == rewardMap) {
            return false;
         } else {
            for(Map.Entry<Integer, ChildGamePointAwardModel> entry : rewardMap.entrySet()) {
               ChildGamePointAwardModel model = (ChildGamePointAwardModel)entry.getValue();
               if (dao.curPoint >= model.getPointStart() && dao.curPoint <= model.getPointEnd()) {
                  this.sendPickUpRoundInfo();
                  this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_CHILD_PICK_UP, this.getActivityLogModule(), 14807, 0, 0, "");
                  break;
               }
            }

            dao.gameObjectUniqueIds.clear();
            dao.gameRoundResult.clear();
            dao.gameStartTime = 0;
            dao.curPoint = 0;
            dao.updateOp();
            this.sendPickUpInfo();
            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            rankPart.updateRank(RankDefine.RankModule.ACTIVITY_CHILD_PICK, (long)dao.point, false);
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_BuyTicket_24925(ChildActMsg.C2S_BuyTicket_24925 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         int ticketBuyCost = this.getTicketBuyCost();
         if (this.getSurplusBuyTimes() > 0 && ticketBuyCost != this.CAN_NOT_BUY_TICKET) {
            if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, ticketBuyCost)) {
               return this.player.failure(31);
            } else {
               this.player.addResource(2, 6494, 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 14811, 0, 0, "");
               this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)ticketBuyCost, this.getActivityLogModule(), 14812, 0, 0, "");
               ActivityChildDao dao = this.getDao();
               ++dao.ticketBuyTimes;
               dao.updateOp();
               this.sendPickUpInfo();
               return true;
            }
         } else {
            return this.player.failure(61164);
         }
      }
   }

   public int getSurplusBuyTimes() {
      ActivityChildDao dao = this.getDao();
      int ticketBuyTimes = dao.ticketBuyTimes;
      String zongQingTicketBuyStr = this.configManager.getStrByDefault(this.CHILD_GAME_BUY, "50|100|150|200");
      String[] zongQingTicketBuyStrArr = zongQingTicketBuyStr.split("\\|");
      return zongQingTicketBuyStrArr.length - ticketBuyTimes > 0 ? zongQingTicketBuyStrArr.length - ticketBuyTimes : 0;
   }

   public int getTicketBuyCost() {
      ActivityChildDao dao = this.getDao();
      String zongQingTicketBuyStr = this.configManager.getStrByDefault(this.CHILD_GAME_BUY, "50|100|150|200");
      String[] zongQingTicketBuyStrArr = zongQingTicketBuyStr.split("\\|");
      int ticketBuyTimes = dao.ticketBuyTimes;
      if (ticketBuyTimes >= zongQingTicketBuyStrArr.length) {
         return this.CAN_NOT_BUY_TICKET;
      } else {
         int buyCost = Integer.parseInt(zongQingTicketBuyStrArr[ticketBuyTimes]);
         return buyCost;
      }
   }

   public void pickUpResetDaily() {
      ActivityChildDao dao = this.getDao();
      int severActivityDay = this.getSeverActivityDay();
      if (!dao.giveTicketDays.contains(severActivityDay)) {
         int zongQingTicketNum = this.configManager.getIntDefault(this.CHILD_TICKET_NUM, 7);
         this.player.addResource(2, 6494, zongQingTicketNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, this.getActivityLogModule(), 14808, 0, 0, "");
         dao.ticketBuyTimes = 0;
         dao.giveTicketDays.add(severActivityDay);
         dao.updateOp();
      }
   }

   public void pickUpEnd() {
      this.pickUpGameEnd();
      ActivityChildDao dao = this.getDao();
      dao.point = 0;
      dao.curPoint = 0;
      dao.gameObjectUniqueIds.clear();
      dao.gameRoundResult.clear();
      dao.gameStartTime = 0;
      dao.ticketBuyTimes = 0;
      dao.giveTicketDays.clear();
      dao.updateOp();
      this.player.delResourceAllNum(2, 6494, this.getActivityLogModule(), 14813, 0, 0, "");
   }

   public void drawEnd() {
      ActivityChildDao dao = this.getDao();
      dao.fancyRewardId = 0;
      dao.eggs.clear();
      dao.smashEggNum = 0;
      dao.roundSmashNum.clear();
      dao.takedLuck.clear();
      dao.seniorRewards.clear();
      dao.updateOp();
   }

   public void drawResetDaily() {
      ActivityChildDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      if (lotteryStage != dao.lotteryStage) {
         dao.lotteryStage = lotteryStage;
         dao.fancyRewardId = 0;
      }

      dao.updateOp();
   }

   public int getSmashEggStage() {
      Map<Integer, ChildLotteryItemModel> allMap = this.player.getGameModelPool().getMap("ChildLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(ChildLotteryItemModel model : allMap.values()) {
            if (model.getDateEnd() == -1) {
               if (activityStartDay >= model.getDateStart() && severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
                  return model.getStage();
               }
            } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd() && severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
               return model.getStage();
            }
         }
      }

      return 1;
   }

   @MsgHandlerAnno
   public void C2S_OpenEggUi_24915(ChildActMsg.C2S_OpenEggUi_24915 msg, String source) {
      ActivityChildDao dao = this.getDao();
      ChildActMsg.S2C_OpenEggUi_24916.Builder builder = ChildActMsg.S2C_OpenEggUi_24916.newBuilder();
      builder.setFancyId(dao.fancyRewardId);
      builder.setSmashEggNum(dao.smashEggNum);
      builder.addAllTakedLuck(dao.takedLuck);

      for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
         CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
         info.setKey((Integer)entry.getKey());
         info.setValue((Integer)entry.getValue());
         builder.addSeniorRewards(info);
      }

      for(Map.Entry<Integer, Integer> entry : dao.eggs.entrySet()) {
         CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
         info.setKey((Integer)entry.getKey());
         info.setValue((Integer)entry.getValue());
         builder.addEggs(info);
      }

      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(55, 0);
      builder.setRecruitNum(recruitNum);
      builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_24913(ChildActMsg.C2S_FancyReward_24913 msg, String source) {
      ActivityChildDao dao = this.getDao();
      ChildLotteryItemModel cityLotteryItemModel = (ChildLotteryItemModel)this.player.getGameModelPool().getEntity("ChildLotteryItem", msg.getItemIndex());
      if (cityLotteryItemModel != null) {
         int openDay = this.getActivityOpenDay();
         if (cityLotteryItemModel.getDateEnd() == -1) {
            if (cityLotteryItemModel.getDateStart() > openDay) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), cityLotteryItemModel.getId(), openDay});
               return;
            }
         } else if (openDay < cityLotteryItemModel.getDateStart() || openDay > cityLotteryItemModel.getDateEnd()) {
            this.player.failure(0);
            this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), cityLotteryItemModel.getId(), openDay});
            return;
         }

         int activityDay = this.getSeverActivityDay();
         if (activityDay >= cityLotteryItemModel.getStageStart() && activityDay <= cityLotteryItemModel.getStageEnd()) {
            if (cityLotteryItemModel.getItemGroup() != 1) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，group={}", new Object[]{this.player.getPlayerId(), cityLotteryItemModel.getId(), cityLotteryItemModel.getItemGroup()});
            } else if (cityLotteryItemModel.getSurplusNum() > 0 && dao.seniorRewards.containsKey(cityLotteryItemModel.getId()) && (Integer)dao.seniorRewards.get(cityLotteryItemModel.getId()) >= cityLotteryItemModel.getSurplusNum()) {
               this.logger.error("心仪奖励已经达到最大次数，已经获取={}，最大次数={}", dao.seniorRewards.get(cityLotteryItemModel.getId()), cityLotteryItemModel.getSurplusNum());
            } else {
               dao.fancyRewardId = msg.getItemIndex();
               dao.updateOp();
               ChildActMsg.S2C_FancyReward_24914.Builder builder = ChildActMsg.S2C_FancyReward_24914.newBuilder();
               builder.setResult(1);
               builder.setItemIndex(msg.getItemIndex());
               this.player.sendMsg(builder.build());
            }
         } else {
            this.player.failure(0);
            this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前activityDay={}", new Object[]{this.player.getPlayerId(), cityLotteryItemModel.getId(), activityDay});
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SmashEgg_24917(ChildActMsg.C2S_SmashEgg_24917 msg, String source) {
      if (msg.getNum() <= 0) {
         this.player.failure(0);
      } else {
         ActivityChildDao dao = this.getDao();
         if (dao.fancyRewardId <= 0) {
            this.player.failure(76014);
         } else {
            int childAllEggNum = this.configManager.getIntDefault("childAllEggNum", 30);
            if (dao.eggs.size() >= childAllEggNum) {
               this.logger.error(" 抽奖数量错误，size={}", dao.eggs.size());
            } else if (msg.getNum() > childAllEggNum - dao.eggs.size()) {
               this.logger.error("抽奖次数不够，size={}", dao.eggs.size());
            } else {
               PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
               int lotteryLimit = this.configManager.getIntDefault("LotteryLimit", 99999);
               int recruitNum = (Integer)playerResetCustomCache.getDailyNum(55, 0);
               int newRecRuiNum = recruitNum + msg.getNum();
               if (newRecRuiNum > lotteryLimit) {
                  this.player.failure(51);
               } else {
                  int childLotteryCost = this.configManager.getIntDefault("childLotteryCost", 6495);
                  ResourceModel needModel = new ResourceModel(2, childLotteryCost, msg.getNum());
                  if (this.player.checkResourceNum(needModel)) {
                     if (msg.getIndex() > 0 && dao.eggs.containsKey(msg.getIndex())) {
                        this.logger.error("指定的蛋已经砸过了,指定ID={}，已砸出的物品顺序={}", msg.getIndex(), dao.eggs.get(msg.getIndex()));
                        this.player.failure(0);
                     } else {
                        int openDay = this.getActivityOpenDay();
                        int activityDay = this.getSeverActivityDay();
                        Map<Integer, ChildLotteryItemModel> itemModelMap = this.getLotteryItemMap(openDay, activityDay);
                        if (itemModelMap != null && !itemModelMap.isEmpty()) {
                           ChildLotteryItemModel enjoyModel = (ChildLotteryItemModel)this.player.getGameModelPool().getEntity("ChildLotteryItem", dao.fancyRewardId);
                           Map<Integer, Integer> resultMap = new HashMap();
                           List<ResourceModel> addList = new ArrayList();
                           boolean isHaveFancy = false;
                           List<ResourceModel> resourceModels = new ArrayList();

                           for(int i = 0; i < msg.getNum(); ++i) {
                              int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                              dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                              int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                              dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                              ChildLotteryItemModel itemModel = this.smashEgg(dao, itemModelMap);
                              if (itemModel == null) {
                                 return;
                              }

                              this.recordServer(itemModel);
                              resourceModels.addAll(itemModel.getRewards());
                              if (itemModel.getItemGroup() == 1) {
                                 isHaveFancy = true;
                                 dao.fancyRewardId = 0;
                                 dao.roundSmashNum.put(itemModel.getItemGroup(), 0);
                                 int oldNum = (Integer)MapUtil.getOrDefault(dao.seniorRewards, itemModel.getId(), 0);
                                 dao.seniorRewards.put(itemModel.getId(), oldNum + 1);
                              } else if (itemModel.getItemGroup() == 2) {
                                 if (itemModel.getPreposeNum() > 0 || itemModel.getMustNum() > 0) {
                                    dao.roundSmashNum.put(itemModel.getItemGroup(), 0);
                                 }

                                 int oldNum = (Integer)MapUtil.getOrDefault(dao.seniorRewards, itemModel.getId(), 0);
                                 dao.seniorRewards.put(itemModel.getId(), oldNum + 1);
                              } else {
                                 int oldSmashNum = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, itemModel.getItemGroup(), 0);
                                 dao.roundSmashNum.put(itemModel.getItemGroup(), oldSmashNum + 1);
                              }

                              ++dao.smashEggNum;
                              if (resultMap.isEmpty() && msg.getIndex() >= 0) {
                                 resultMap.put(msg.getIndex(), itemModel.getId());
                                 dao.eggs.put(msg.getIndex(), itemModel.getId());
                              } else {
                                 int index = this.getRandomIndex(childAllEggNum, dao);
                                 resultMap.put(index, itemModel.getId());
                                 dao.eggs.put(index, itemModel.getId());
                              }

                              for(ResourceModel resourceModel : itemModel.getRewards()) {
                                 addList.add(resourceModel);
                              }
                           }

                           dao.updateOp();
                           boolean isRest = false;
                           if (dao.eggs.size() >= childAllEggNum) {
                              isRest = true;
                              dao.eggs.clear();
                              dao.updateOp();
                           }

                           int createTime = DateUtil.getIntTime(System.currentTimeMillis());

                           for(ResourceModel resourceModel : resourceModels) {
                              ActivityChildDao.RecordInfo recordInfo = new ActivityChildDao.RecordInfo(createTime, resourceModel);
                              dao.addRecordInfo(recordInfo);
                           }

                           dao.updateOp();
                           this.player.delResource(needModel, 82, 14805, 0, 0, "");
                           this.player.addResource(addList, PlayerMsg.ShowType.SHOW_CHILD_DRAW_ACTIVITY, 82, 14804, 0, 0, "");
                           playerResetCustomCache.setDailyReset(55, newRecRuiNum);
                           ChildActMsg.S2C_SmashEgg_24918.Builder builder = ChildActMsg.S2C_SmashEgg_24918.newBuilder();
                           builder.setResult(1);
                           builder.setIndex(msg.getIndex());
                           builder.setIsReset(isRest);
                           builder.setIsHaveFancy(isHaveFancy);
                           builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));

                           for(Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
                              CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                              info.setKey((Integer)entry.getKey());
                              info.setValue((Integer)entry.getValue());
                              builder.addIndexs(info);
                           }

                           for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                              CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                              info.setKey((Integer)entry.getKey());
                              info.setValue((Integer)entry.getValue());
                              builder.addSeniorNum(info);
                           }

                           builder.setSmashEggNum(dao.smashEggNum);
                           builder.setRecruitNum(newRecRuiNum);
                           this.player.sendMsg(builder.build());
                           int itemId = 0;
                           int itemNum = 0;

                           for(ResourceModel resourceModel : addList) {
                              itemId = resourceModel.getId();
                              itemNum = resourceModel.getValue();
                           }

                           int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                           for(ResourceModel resourceModel : addList) {
                              String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                              this.player.getOperationMgr().addExtraLog(this.player, 198, "儿童节活动-抽奖", itemId + "", itemNum + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                           }

                        }
                     }
                  }
               }
            }
         }
      }
   }

   public int getRandomIndex(int childAllEggNum, ActivityChildDao dao) {
      List<Integer> list = new ArrayList();

      for(int i = 0; i < childAllEggNum; ++i) {
         if (!dao.eggs.containsKey(i)) {
            list.add(i);
         }
      }

      int index = RandomUtil.randInt(list.size());
      return (Integer)list.get(index);
   }

   public Map<Integer, ChildLotteryItemModel> getLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, ChildLotteryItemModel> itemModelMap = this.player.getGameModelPool().getMap("ChildLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, ChildLotteryItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, ChildLotteryItemModel> entry : itemModelMap.entrySet()) {
            if (((ChildLotteryItemModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((ChildLotteryItemModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((ChildLotteryItemModel)entry.getValue()).getDateStart() || openDay > ((ChildLotteryItemModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((ChildLotteryItemModel)entry.getValue()).getStageStart() && activityDay <= ((ChildLotteryItemModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   public ChildLotteryItemModel smashEgg(ActivityChildDao dao, Map<Integer, ChildLotteryItemModel> itemModelMap) {
      Map<Integer, ChildLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(Map.Entry<Integer, ChildLotteryItemModel> entry : itemModelMap.entrySet()) {
         if (!dao.seniorRewards.containsKey(entry.getKey()) || ((ChildLotteryItemModel)entry.getValue()).getSurplusNum() <= 0 || (Integer)dao.seniorRewards.get(entry.getKey()) <= ((ChildLotteryItemModel)entry.getValue()).getSurplusNum()) {
            int roundSmashNum = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, ((ChildLotteryItemModel)entry.getValue()).getItemGroup(), 0);
            if (((ChildLotteryItemModel)entry.getValue()).getPreposeNum() <= 0 || roundSmashNum >= ((ChildLotteryItemModel)entry.getValue()).getPreposeNum()) {
               if (((ChildLotteryItemModel)entry.getValue()).getItemGroup() == 1) {
                  if (dao.fancyRewardId > 0 && dao.fancyRewardId == (Integer)entry.getKey()) {
                     if (((ChildLotteryItemModel)entry.getValue()).getMustNum() > 0 && roundSmashNum >= ((ChildLotteryItemModel)entry.getValue()).getMustNum()) {
                        return (ChildLotteryItemModel)entry.getValue();
                     }

                     tempMap.put(entry.getKey(), entry.getValue());
                     totalOdds += ((ChildLotteryItemModel)entry.getValue()).getRealOdd();
                  }
               } else {
                  if (((ChildLotteryItemModel)entry.getValue()).getMustNum() > 0 && roundSmashNum >= ((ChildLotteryItemModel)entry.getValue()).getMustNum()) {
                     return (ChildLotteryItemModel)entry.getValue();
                  }

                  tempMap.put(entry.getKey(), entry.getValue());
                  totalOdds += ((ChildLotteryItemModel)entry.getValue()).getRealOdd();
               }
            }
         }
      }

      if (totalOdds <= 0) {
         this.logger.error("没有符合条件的物品");
         return null;
      } else {
         int r = RandomUtil.randInt(totalOdds);
         int loop = 0;

         for(Map.Entry<Integer, ChildLotteryItemModel> entry : tempMap.entrySet()) {
            loop += ((ChildLotteryItemModel)entry.getValue()).getRealOdd();
            if (loop > r) {
               return (ChildLotteryItemModel)entry.getValue();
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_TakeLuckReward_24919(ChildActMsg.C2S_TakeLuckReward_24919 msg, String source) {
      ActivityChildDao dao = this.getDao();
      if (!dao.takedLuck.contains(msg.getRewardId())) {
         ChildAddUpReturnModel model = (ChildAddUpReturnModel)this.player.getGameModelPool().getEntity("ChildAddupReturnAward", msg.getRewardId());
         if (model != null) {
            if (dao.smashEggNum >= model.getAddupNum()) {
               int openDay = this.getActivityOpenDay();
               if (model.getDateEnd() == -1) {
                  if (openDay < model.getDateStart()) {
                     return;
                  }
               } else if (openDay < model.getDateStart() || openDay > model.getDateEnd()) {
                  return;
               }

               dao.takedLuck.add(msg.getRewardId());
               dao.updateOp();
               this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, 14806, 0, 0, "");
               ChildActMsg.S2C_TakeLuckReward_24920.Builder builder = ChildActMsg.S2C_TakeLuckReward_24920.newBuilder();
               builder.setResult(1);
               builder.addAllTakedId(dao.takedLuck);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   private void recordServer(ChildLotteryItemModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadChildRecord_4261.Builder builder = CrossMsg.S2CR_UploadChildRecord_4261.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         builder.setStage(this.getSmashEggStage());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_DrawRecord_24921(ChildActMsg.C2S_DrawRecord_24921 msg, String source) {
      ChildActMsg.S2C_DrawRecord_24922.Builder builder = ChildActMsg.S2C_DrawRecord_24922.newBuilder();
      ActivityChildDao dao = this.getDao();

      for(String record : dao.recordList) {
         String[] arr = record.split(":");
         ChildActMsg.MyDrawRecord.Builder drawRecord = ChildActMsg.MyDrawRecord.newBuilder();
         drawRecord.setCreateTime(Integer.parseInt(arr[0]));
         String[] split = arr[1].split("_");
         CommonMsg.ItemInfo.Builder itemInfo = CommonMsg.ItemInfo.newBuilder();
         itemInfo.setType(Integer.parseInt(split[0]));
         itemInfo.setId(Integer.parseInt(split[1]));
         itemInfo.setNum(Integer.parseInt(split[2]));
         drawRecord.addItemInfo(itemInfo);
         builder.addMyRecord(drawRecord);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ServerDrawRecord_24923(ChildActMsg.C2S_ServerDrawRecord_24923 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public boolean drawView(int lotteryId, int round) {
      ChildLotteryItemModel model = (ChildLotteryItemModel)this.player.getGameModelPool().getEntity("ChildLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, ChildLotteryItemModel> lotteryItemMap = this.getLotteryItemMap(model.getDateStart(), model.getStageStart());
         Map<Integer, DrawViewLogInfo> drawViewLogInfoMap = new HashMap();
         int n = 1;

         while(true) {
            int endNum = n * 50;
            int startNum = endNum - 49;
            int getFancyNum = 0;

            for(int i = startNum; i <= endNum; ++i) {
               int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, 1, 0);
               drawViewData.roundSmashNum.put(1, oldSmashNum_1 + 1);
               int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, 2, 0);
               drawViewData.roundSmashNum.put(2, oldSmashNum_2 + 1);
               ChildLotteryItemModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
               if (lotteryItemModel.getItemGroup() == 1) {
                  drawViewData.roundSmashNum.put(lotteryItemModel.getItemGroup(), 0);
               } else if (lotteryItemModel.getItemGroup() == 2) {
                  if (lotteryItemModel.getPreposeNum() > 0 || lotteryItemModel.getMustNum() > 0) {
                     drawViewData.roundSmashNum.put(lotteryItemModel.getItemGroup(), 0);
                  }
               } else {
                  int oldSmashNum = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, lotteryItemModel.getItemGroup(), 0);
                  drawViewData.roundSmashNum.put(lotteryItemModel.getItemGroup(), oldSmashNum + 1);
               }

               if (lotteryItemModel != null && lotteryItemModel.getId() == lotteryId) {
                  ++getFancyNum;
                  ++initRound;
                  break;
               }
            }

            if (getFancyNum > 0) {
               n = 0;
            }

            DrawViewLogInfo logInfo = (DrawViewLogInfo)drawViewLogInfoMap.get(startNum);
            if (null == logInfo) {
               logInfo = new DrawViewLogInfo(startNum, endNum, getFancyNum);
            } else {
               int oldGetFancyNum = logInfo.getGetFancyNum();
               logInfo.setGetFancyNum(oldGetFancyNum + getFancyNum);
            }

            drawViewLogInfoMap.put(startNum, logInfo);
            if (initRound >= round) {
               if (!drawViewLogInfoMap.isEmpty()) {
                  String infoStr = "{0}~{1}次抽中目标奖励，{2}次，占比{3}%";

                  for(Map.Entry<Integer, DrawViewLogInfo> entry : drawViewLogInfoMap.entrySet()) {
                     DrawViewLogInfo logInfo = (DrawViewLogInfo)entry.getValue();
                     double proportion = (double)logInfo.getGetFancyNum() / (double)round * (double)100.0F;
                     String format = MessageFormat.format(infoStr, logInfo.getStartNum(), logInfo.getEndNum(), logInfo.getGetFancyNum(), proportion);
                     this.logger.info(format);
                  }
               }

               return true;
            }

            ++n;
         }
      }
   }

   private ChildLotteryItemModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, ChildLotteryItemModel> itemModelMap) {
      Map<Integer, ChildLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(ChildLotteryItemModel lotteryItemModel : itemModelMap.values()) {
         int roundSmashNum = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, lotteryItemModel.getItemGroup(), 0);
         if (lotteryItemModel.getPreposeNum() <= 0 || roundSmashNum >= lotteryItemModel.getPreposeNum()) {
            if (lotteryItemModel.getItemGroup() == 1) {
               if (drawViewData.fancyRewardId > 0 && drawViewData.fancyRewardId == lotteryItemModel.getId()) {
                  if (lotteryItemModel.getMustNum() > 0 && roundSmashNum >= lotteryItemModel.getMustNum()) {
                     return lotteryItemModel;
                  }

                  tempMap.put(lotteryItemModel.getId(), lotteryItemModel);
                  totalOdds += lotteryItemModel.getRealOdd();
               }
            } else {
               if (lotteryItemModel.getMustNum() > 0 && roundSmashNum >= lotteryItemModel.getMustNum()) {
                  return lotteryItemModel;
               }

               tempMap.put(lotteryItemModel.getId(), lotteryItemModel);
               totalOdds += lotteryItemModel.getRealOdd();
            }
         }
      }

      if (totalOdds <= 0) {
         this.logger.error("没有符合条件的物品");
         return null;
      } else {
         int r = RandomUtil.randInt(totalOdds);
         int loop = 0;

         for(ChildLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }
}
