package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.FlowerActDao;
import com.gzbz.db.FriendDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.FlowerBuyModel;
import com.gzbz.model.FlowerGiveRewardModel;
import com.gzbz.model.FlowerTaskModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.FlowerMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.FlowerTaskPart;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class FlowerPart extends AbstractActivityPart {
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private UnionMgrParent unionMgrParent;
   public static final int GIVE_REWARD_TYPE_ONE_TIMES = 1;
   public static final int GIVE_REWARD_TYPE_MANY_TIMES = 2;
   public static final int SEND_FLOWER_RANK_TYPE = 1;
   public static final int GET_FLOWER_RANK_TYPE = 2;

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         this.sendTaskNoRecMail();
         this.initTask();
         this.sendActivityInfo();
      }
   }

   public void activityEnd(int oldActivityId) {
      this.sendTaskNoRecMail();
      this.sendFlowerGiveNoRecMail();
   }

   public void sendTaskNoRecMail() {
      CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_FLOWER_ACT_TASK_NO_REC);
      if (null == centreAwardModel) {
         this.logger.error("CentreAward 配置缺失 id:{}", CentreAwardModel.ID_FLOWER_ACT_TASK_NO_REC);
      } else {
         Map<Integer, FlowerTaskModel> allTaskMap = ApplicationContextProvider.<Integer, FlowerTaskModel>getModelPoolMap("flowerTask");
         FlowerTaskPart flowerTaskPart = (FlowerTaskPart)this.player.getMgrPart(FlowerTaskPart.class);
         List<ResourceModel> noRecRewardList = new ArrayList();

         for(Map.Entry<Integer, FlowerTaskModel> entry : allTaskMap.entrySet()) {
            Integer taskId = (Integer)entry.getKey();
            FlowerTaskModel taskModel = (FlowerTaskModel)entry.getValue();
            TaskData taskData = flowerTaskPart.getTask(taskId);
            if (null != taskData && !DateUtil.isSameDay((long)taskData.ctTime * 1000L, System.currentTimeMillis()) && flowerTaskPart.checkCommit(taskId)) {
               for(ResourceModel item : taskModel.getItems()) {
                  item.addResourceToList(noRecRewardList);
               }

               taskData.finish();
            }
         }

         if (noRecRewardList.size() > 0) {
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), noRecRewardList, 604800000L, 145, 14501);
         }

      }
   }

   public void sendFlowerGiveNoRecMail() {
      CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_FLOWER_ACT_SEND_FLOWER_NO_REC);
      if (null == centreAwardModel) {
         this.logger.error("CentreAward 配置缺失 id:{}", CentreAwardModel.ID_FLOWER_ACT_SEND_FLOWER_NO_REC);
      } else {
         Map<Integer, FlowerGiveRewardModel> allMap = ApplicationContextProvider.<Integer, FlowerGiveRewardModel>getModelPoolMap("flowerGiveReward");
         FlowerActDao dao = this.getDao();
         int sendFlowerScore = this.getSendFlowerScore();
         List<ResourceModel> noRecList = new ArrayList();

         for(Map.Entry<Integer, FlowerGiveRewardModel> entry : allMap.entrySet()) {
            Integer id = (Integer)entry.getKey();
            FlowerGiveRewardModel model = (FlowerGiveRewardModel)entry.getValue();
            Integer num = (Integer)dao.scoreIdNum.getOrDefault(id, 0);
            if (model.getType() == 1) {
               if (num <= 0 && sendFlowerScore >= model.getScore()) {
                  for(ResourceModel item : model.getItems()) {
                     item.addResourceToList(noRecList);
                  }

                  dao.scoreIdNum.put(id, num + 1);
               }
            } else if (model.getType() == 2 && num < model.getMaxGet()) {
               int giveRewardMaxScore = this.getGiveRewardMaxScore();

               int i;
               for(i = num + 1; i <= model.getMaxGet(); ++i) {
                  int scoreLimit = model.getScore() * i + giveRewardMaxScore;
                  if (sendFlowerScore < scoreLimit) {
                     break;
                  }

                  for(ResourceModel item : model.getItems()) {
                     item.addResourceToList(noRecList);
                  }
               }

               dao.scoreIdNum.put(id, i);
            }
         }

         dao.updateOp();
         if (noRecList.size() > 0) {
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), noRecList, 604800000L, 145, 14504);
         }

      }
   }

   public void rotateReset(int oldActivityId) {
      this.initTask();
      PlayerDao playerDao = this.player.getPlayerDao();
      if (DateUtil.isSameDay(playerDao.updateTime)) {
         this.initTask();
      }

      int serverActStart = this.getServerActivityInfo().start;
      FlowerActDao dao = this.getDao();
      dao.sendFlowerNum = 0;
      if (dao.start != serverActStart) {
         dao.getFlowerNum = 0;
         dao.start = serverActStart;
      }

      dao.flowerBuy.clear();
      dao.scoreIdNum.clear();
      dao.updateOp();
      this.clearActivityGift(24);
   }

   public void initTask() {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACT_FLOWER);
      FlowerTaskPart flowerTaskPart = (FlowerTaskPart)this.player.getMgrPart(FlowerTaskPart.class);
      flowerTaskPart.trigger();
   }

   public int getSendFlowerScore() {
      ArrayList<Integer> flowerGiveScore = this.getConfigManager().getIntList("flowerGiveScore");
      FlowerActDao dao = this.getDao();
      if (flowerGiveScore.size() < 2) {
         return dao.sendFlowerNum;
      } else {
         int ratio = (Integer)flowerGiveScore.get(1);
         return dao.sendFlowerNum * ratio;
      }
   }

   public int getGetFlowerScore() {
      ArrayList<Integer> flowerGetScore = this.getConfigManager().getIntList("flowerGetScore");
      int curRoundGetFlowerNum = this.getCurRoundGetFlowerNum();
      if (flowerGetScore.size() < 2) {
         return curRoundGetFlowerNum;
      } else {
         int ratio = (Integer)flowerGetScore.get(1);
         return curRoundGetFlowerNum * ratio;
      }
   }

   public int getFlowerItemId() {
      ArrayList<Integer> flowerGiveScore = this.getConfigManager().getIntList("flowerGiveScore");
      if (flowerGiveScore.size() < 1) {
         this.logger.error("config.xls 配置 flowerGiveScore有误");
         return 0;
      } else {
         return (Integer)flowerGiveScore.get(0);
      }
   }

   public void sendInfo() {
      this.sendActivityInfo();
   }

   public int getActivityType() {
      return 105;
   }

   public int getShopId() {
      return 53;
   }

   public FlowerActDao getDao() {
      FlowerActDao dao = (FlowerActDao)this.player.getData("tb_act_flower", this.player.getPlayerId());
      return dao;
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_24701(FlowerMsg.C2S_ActivityInfo_24701 msg, String source) {
      this.sendActivityInfo();
   }

   public int getCrossActOpenDay() {
      ActivityInfo serverActivityInfo = this.getServerActivityInfo();
      return serverActivityInfo != null && serverActivityInfo.crossActOpenDay > 0 ? serverActivityInfo.crossActOpenDay : -1;
   }

   public void updateScoreRank(int rankType) {
      if (!this.isServerActivityInvalid()) {
         ActivityInfo activityInfo = this.getServerActivityInfo();
         if (activityInfo.drop > DateUtil.getIntTime(System.currentTimeMillis())) {
            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            if (rankType == 1) {
               int sendFlowerScore = this.getSendFlowerScore();
               rankPart.updateRank(RankDefine.RankModule.ACTIVITY_SEND_FLOWER, (long)sendFlowerScore, false);
            } else {
               int getFlowerScore = this.getGetFlowerScore();
               rankPart.updateRank(RankDefine.RankModule.ACTIVITY_GET_FLOWER, (long)getFlowerScore, false);
            }

         }
      }
   }

   public void sendActivityInfo() {
      FlowerTaskPart flowerTaskPart = (FlowerTaskPart)this.player.getMgrPart(FlowerTaskPart.class);
      FlowerActDao dao = this.getDao();
      FlowerMsg.S2C_ActivityInfo_24702.Builder msg = FlowerMsg.S2C_ActivityInfo_24702.newBuilder();
      msg.setOpenDay(this.getCrossActOpenDay());
      msg.setSendFlowerNum(dao.sendFlowerNum);
      msg.setGetFlowerNum(dao.getFlowerNum);
      msg.setTotalScore(this.getSendFlowerScore() + this.getGetFlowerScore());
      msg.addAllTaskList(flowerTaskPart.getTaskListMsg());

      for(Map.Entry<Integer, Integer> entry : dao.flowerBuy.entrySet()) {
         Integer buyId = (Integer)entry.getKey();
         Integer buyNum = (Integer)entry.getValue();
         CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
         mapData.setKey(buyId);
         mapData.setValue(buyNum);
         msg.addFlowerBuyIdNum(mapData);
      }

      for(Map.Entry<Integer, Integer> entry : dao.scoreIdNum.entrySet()) {
         Integer id = (Integer)entry.getKey();
         Integer num = (Integer)entry.getValue();
         CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
         mapData.setKey(id);
         mapData.setValue(num);
         msg.addScoreIdNum(mapData);
      }

      this.player.sendMsg(msg.build());
   }

   @MsgHandlerAnno
   public boolean C2S_FlowerBuy_24706(FlowerMsg.C2S_FlowerBuy_24706 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else if (this.getCrossActOpenDay() < 0) {
         return this.player.failure(76416);
      } else if (msg.getNum() < 1) {
         return this.player.failure(6);
      } else {
         FlowerBuyModel flowerBuyModel = (FlowerBuyModel)ApplicationContextProvider.getModelPoolEntity("flowerBuy", msg.getId());
         if (null == flowerBuyModel) {
            return this.player.failure(6);
         } else {
            FlowerActDao dao = this.getDao();
            if (flowerBuyModel.getPreId() > 0) {
               FlowerBuyModel preModel = (FlowerBuyModel)ApplicationContextProvider.getModelPoolEntity("flowerBuy", flowerBuyModel.getPreId());
               if (null == preModel) {
                  return this.player.failure(37);
               }

               Integer preIdBuyNum = (Integer)dao.flowerBuy.getOrDefault(preModel.getId(), 0);
               if (preIdBuyNum < preModel.getQuota()) {
                  return this.player.failure(76031);
               }
            }

            Integer buyNum = (Integer)dao.flowerBuy.getOrDefault(msg.getId(), 0);
            if (buyNum + msg.getNum() > flowerBuyModel.getQuota()) {
               return this.player.failure(25);
            } else {
               ResourceModel cost = new ResourceModel(flowerBuyModel.getExchangeType(), flowerBuyModel.getExchangeId(), flowerBuyModel.getExchangeNum() * msg.getNum());
               if (!this.player.checkResourceNum(cost)) {
                  return this.player.failure(76135);
               } else {
                  this.player.delResource(cost, 145, 14503, 0, 0, "");
                  this.player.addResource(flowerBuyModel.getItemType(), flowerBuyModel.getItemId(), flowerBuyModel.getItemNum() * msg.getNum(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 145, 14502, 0, 0, "");
                  dao.flowerBuy.put(msg.getId(), buyNum + msg.getNum());
                  dao.updateOp();
                  FlowerMsg.S2C_FlowerBuy_24707.Builder resp = FlowerMsg.S2C_FlowerBuy_24707.newBuilder();

                  for(Map.Entry<Integer, Integer> entry : dao.flowerBuy.entrySet()) {
                     Integer id = (Integer)entry.getKey();
                     Integer num = (Integer)entry.getValue();
                     CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
                     mapData.setKey(id);
                     mapData.setValue(num);
                     resp.addFlowerBuyIdNum(mapData);
                  }

                  this.player.sendMsg(resp.build());
                  return true;
               }
            }
         }
      }
   }

   public int getGiveRewardMaxScore() {
      Map<Integer, FlowerGiveRewardModel> allMap = ApplicationContextProvider.<Integer, FlowerGiveRewardModel>getModelPoolMap("flowerGiveReward");
      if (allMap != null && !allMap.isEmpty()) {
         int maxScore = 0;

         for(Map.Entry<Integer, FlowerGiveRewardModel> entry : allMap.entrySet()) {
            FlowerGiveRewardModel model = (FlowerGiveRewardModel)entry.getValue();
            if (model.getType() == 1 && model.getScore() > maxScore) {
               maxScore = model.getScore();
            }
         }

         return maxScore;
      } else {
         return 0;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_RecScoreReward_24708(FlowerMsg.C2S_RecScoreReward_24708 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else if (this.getCrossActOpenDay() < 0) {
         return this.player.failure(76416);
      } else {
         FlowerGiveRewardModel giveRewardModel = (FlowerGiveRewardModel)ApplicationContextProvider.getModelPoolEntity("flowerGiveReward", msg.getId());
         if (null == giveRewardModel) {
            return this.player.failure(6);
         } else {
            FlowerActDao dao = this.getDao();
            Integer num = (Integer)dao.scoreIdNum.getOrDefault(giveRewardModel.getId(), 0);
            int sendFlowerScore = this.getSendFlowerScore();
            if (giveRewardModel.getType() == 1) {
               if (num > 0) {
                  return this.player.failure(76030);
               }

               if (sendFlowerScore < giveRewardModel.getScore()) {
                  return this.player.failure(76031);
               }
            } else {
               int giveRewardMaxScore = this.getGiveRewardMaxScore();
               if (num >= giveRewardModel.getMaxGet()) {
                  return this.player.failure(76030);
               }

               int scoreLimit = giveRewardModel.getScore() * (num + 1) + giveRewardMaxScore;
               if (sendFlowerScore < scoreLimit) {
                  return this.player.failure(76031);
               }
            }

            this.player.addResource(giveRewardModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 145, 14504, 0, 0, "");
            dao.scoreIdNum.put(msg.getId(), num + 1);
            dao.updateOp();
            FlowerMsg.S2C_RecScoreReward_24709.Builder resp = FlowerMsg.S2C_RecScoreReward_24709.newBuilder();

            for(Map.Entry<Integer, Integer> entry : dao.scoreIdNum.entrySet()) {
               Integer id = (Integer)entry.getKey();
               Integer recNum = (Integer)entry.getValue();
               CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
               mapData.setKey(id);
               mapData.setValue(recNum);
               resp.addScoreIdNum(mapData);
            }

            this.player.sendMsg(resp.build());
            return true;
         }
      }
   }

   public boolean canSendFlower(int otherPlayerId) {
      GamePlayer otherPlayer = this.worldMgr.getPlayerById(otherPlayerId);
      if (null == otherPlayer) {
         return false;
      } else {
         SystemFunctionModel sysModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 6510);
         if (this.player.getPlayerDao().lv >= sysModel.getOpenLevel() && otherPlayer.getPlayerDao().lv >= sysModel.getOpenLevel()) {
            FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
            if (friendDao.friends.contains(otherPlayerId)) {
               return true;
            } else {
               int unionId = this.player.getPlayerDao().unionId;
               if (unionId <= 0) {
                  return false;
               } else {
                  UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(unionId);
                  Map<Integer, UnionMemberDao> unionMembers = unionMgr.getUnionMembers();
                  return unionMembers.containsKey(otherPlayerId);
               }
            }
         } else {
            return false;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_GiveFlower_24710(FlowerMsg.C2S_GiveFlower_24710 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else if (this.getCrossActOpenDay() < 0) {
         return this.player.failure(76416);
      } else if (!this.canSendFlower(msg.getPlayerId())) {
         return this.player.failure(6);
      } else {
         int flowerItemId = this.getFlowerItemId();
         if (flowerItemId <= 0) {
            return this.player.failure(37);
         } else {
            long surplus = this.player.getResourceNum(2, flowerItemId);
            int flowerNum = msg.getFlowerNum();
            if (surplus < (long)flowerNum) {
               return this.player.failure(76135);
            } else {
               CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
               if (!crossNettyClient.isLogin()) {
                  return this.player.failure(76022);
               } else {
                  ResourceModel flowerResource = new ResourceModel(2, flowerItemId, flowerNum);
                  GamePlayer otherPlayer = this.worldMgr.getPlayerById(msg.getPlayerId());
                  int start = this.getServerActivityInfo().start;
                  otherPlayer.pushTask(() -> {
                     FlowerPart otherFlowerPart = (FlowerPart)otherPlayer.getMgrPart(FlowerPart.class);
                     FlowerActDao otherFlowerDao = otherFlowerPart.getDao();
                     otherFlowerDao.getFlowerNum = otherFlowerPart.getCurRoundGetFlowerNum() + flowerNum;
                     otherFlowerDao.start = start;
                     otherFlowerDao.updateOp();
                     otherFlowerPart.uploadCrossGetFlowerData(this.player.getPlayerId(), flowerNum);
                     otherFlowerPart.updateScoreRank(2);
                     this.player.pushTask(() -> {
                        FlowerActDao dao = this.getDao();
                        dao.sendFlowerNum += flowerNum;
                        dao.updateOp();
                        this.player.delResource(flowerResource, 145, 14505, 0, 0, "");
                        this.updateScoreRank(1);
                        FlowerMsg.S2C_GiveFlower_24711.Builder resp = FlowerMsg.S2C_GiveFlower_24711.newBuilder();
                        resp.setSendFlowerNum(dao.sendFlowerNum);
                        this.player.sendMsg(resp.build());
                     });
                  });
                  return true;
               }
            }
         }
      }
   }

   public void uploadCrossGetFlowerData(int sendPlayerId, int sendFlowerNum) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      if (!crossNettyClient.isLogin()) {
         this.logger.error("服务器serverId:{},未连接到跨服,上报玩家跨服收花数据失败", this.player.getServerId());
      } else {
         CrossMsg.S2CR_UploadGetFlowerData_4262.Builder uploadCrossGetFlowerBuilder = CrossMsg.S2CR_UploadGetFlowerData_4262.newBuilder();
         uploadCrossGetFlowerBuilder.setSendPlayerId(sendPlayerId);
         uploadCrossGetFlowerBuilder.setSendFlowerNum(sendFlowerNum);
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), uploadCrossGetFlowerBuilder.build());
      }
   }

   @MsgHandlerAnno
   public boolean C2S_GetOtherPlayerFlowerNum_24712(FlowerMsg.C2S_GetOtherPlayerFlowerNum_24712 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else if (this.getCrossActOpenDay() < 0) {
         return this.player.failure(76416);
      } else if (!this.canSendFlower(msg.getPlayerId())) {
         return this.player.failure(6);
      } else {
         GamePlayer otherPlayer = this.worldMgr.getPlayerById(msg.getPlayerId());
         otherPlayer.pushTask(() -> {
            FlowerPart otherFlowerPart = (FlowerPart)otherPlayer.getMgrPart(FlowerPart.class);
            int curRoundGetFlowerNum = otherFlowerPart.getCurRoundGetFlowerNum();
            this.player.pushTask(() -> {
               FlowerMsg.S2C_GetOtherPlayerFlowerNum_24713.Builder resp = FlowerMsg.S2C_GetOtherPlayerFlowerNum_24713.newBuilder();
               resp.setGetFlowerNum(curRoundGetFlowerNum);
               this.player.sendMsg(resp.build());
            });
         });
         return true;
      }
   }

   @MsgHandlerAnno
   public void C2S_GetFlowerRankDetail_24715(FlowerMsg.C2S_GetFlowerRankDetail_24715 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public int getCurRoundGetFlowerNum() {
      FlowerActDao dao = this.getDao();
      if (dao.getFlowerNum == 0) {
         return 0;
      } else {
         ActivityInfo activityInfo = this.getServerActivityInfo();
         if (null == activityInfo) {
            return 0;
         } else {
            return dao.start != activityInfo.start ? 0 : dao.getFlowerNum;
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_FriendGetFlowerNum_24717(FlowerMsg.C2S_FriendGetFlowerNum_24717 msg, String source) {
      FlowerMsg.S2C_FriendGetFlowerNum_24718.Builder resp = FlowerMsg.S2C_FriendGetFlowerNum_24718.newBuilder();
      if (msg.getType() == 1) {
         FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());

         for(Integer friendPlayerId : friendDao.friends) {
            GamePlayer friendPlayer = this.worldMgr.getPlayerById(friendPlayerId);
            if (null != friendPlayer) {
               PlayerDao friendPlayerDao = friendPlayer.getPlayerDao();
               FlowerMsg.FriendGetFlowerData.Builder dataBuilder = FlowerMsg.FriendGetFlowerData.newBuilder();
               dataBuilder.setPlayerId(friendPlayerId);
               dataBuilder.setPlayerName(friendPlayerDao.playerName);
               dataBuilder.setHead(friendPlayerDao.head);
               dataBuilder.setHeadFrame(friendPlayerDao.headFrame);
               FlowerPart flowerPart = (FlowerPart)friendPlayer.getMgrPart(FlowerPart.class);
               if (null == flowerPart) {
                  dataBuilder.setGetFlowerNum(0);
               } else {
                  dataBuilder.setGetFlowerNum(flowerPart.getCurRoundGetFlowerNum());
               }

               resp.addFriendGetFlowerData(dataBuilder);
            }
         }
      } else {
         int unionId = this.player.getPlayerDao().unionId;
         if (unionId > 0) {
            UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(unionId);
            if (null != unionMgr) {
               Map<Integer, UnionMemberDao> unionMemberDaoMap = unionMgr.getUnionMembers();

               for(Integer unionPlayerId : unionMemberDaoMap.keySet()) {
                  GamePlayer unionPlayer = this.worldMgr.getPlayerById(unionPlayerId);
                  if (null != unionPlayer) {
                     PlayerDao unionPlayerDao = unionPlayer.getPlayerDao();
                     FlowerMsg.FriendGetFlowerData.Builder dataBuilder = FlowerMsg.FriendGetFlowerData.newBuilder();
                     dataBuilder.setPlayerId(unionPlayerId);
                     dataBuilder.setPlayerName(unionPlayerDao.playerName);
                     dataBuilder.setHead(unionPlayerDao.head);
                     dataBuilder.setHeadFrame(unionPlayerDao.headFrame);
                     FlowerPart flowerPart = (FlowerPart)unionPlayer.getMgrPart(FlowerPart.class);
                     if (null == flowerPart) {
                        dataBuilder.setGetFlowerNum(0);
                     } else {
                        dataBuilder.setGetFlowerNum(flowerPart.getCurRoundGetFlowerNum());
                     }

                     resp.addFriendGetFlowerData(dataBuilder);
                  }
               }
            }
         }
      }

      this.player.sendMsg(resp.build());
   }

   @TaskMethod
   public void noticeCrossActOpenDay(int crossActOpenDay) {
      FlowerMsg.S2C_CrossActOpenDay_24714.Builder resp = FlowerMsg.S2C_CrossActOpenDay_24714.newBuilder();
      resp.setOpenDay(crossActOpenDay);
      this.player.sendMsg(resp.build());
   }
}
