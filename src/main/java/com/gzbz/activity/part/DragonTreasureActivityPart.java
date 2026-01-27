package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.ThemeActivityDao;
import com.gzbz.db.bean.DragonTreasureAwardData;
import com.gzbz.db.bean.DragonTreasureData;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.DragonTreasureAwardModel;
import com.gzbz.model.DragonTreasureConfortModel;
import com.gzbz.model.DragonTreasureFormModel;
import com.gzbz.model.DragonTreasureModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.DragonTreasureMsg;
import com.gzbz.protobuf.PlayerMsg;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
import misc.MapUtil;
import net.CrossSubscribeMsg;
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
public class DragonTreasureActivityPart extends AbstractActivityPart {
   static Logger logger = LoggerFactory.getLogger(DragonTreasureActivityPart.class);
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private ConfigManager configManager;

   @MsgHandlerAnno
   public void C2S_DragonTreasureInfo_4901(DragonTreasureMsg.C2S_DragonTreasureInfo_4901 msg, String source) {
      this.sendInfo();
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         DragonTreasureData data = this.getDragonTreasureData();
         if (data.awardPool == null || data.awardPool.isEmpty()) {
            this.initData(data);
            this.updateThemeDao();
         }

         DragonTreasureMsg.S2C_DragonTreasureInfo_4902.Builder builder = DragonTreasureMsg.S2C_DragonTreasureInfo_4902.newBuilder();

         for(DragonTreasureAwardData awardData : data.awardPool.values()) {
            DragonTreasureMsg.AwardPool.Builder pool = DragonTreasureMsg.AwardPool.newBuilder();
            pool.setAwardId(awardData.awardId);
            pool.setEnd(awardData.end);
            pool.setPosition(awardData.position);
            builder.addAwardPool(pool);
         }

         builder.setLuckyPoint(data.luckyPoint);
         builder.setAddMoney(data.addMoney);
         builder.setGoldNum(data.goldNum);
         builder.setPropNum(data.propNum);
         builder.setRefreshNum(data.refreshNum);

         for(Integer awardId : data.awardRecord) {
            DragonTreasureMsg.RecruitRecord.Builder record = DragonTreasureMsg.RecruitRecord.newBuilder();
            record.setAwardId(awardId);
            record.setServerId(this.player.getServerId());
            record.setPlayerId(this.player.getPlayerId());
            record.setPlayerName(this.player.getPublicDao().playerName);
            builder.addMyRecord(record);
         }

         for(Map.Entry<Integer, Integer> entry : data.awardMap.entrySet()) {
            CommonMsg.MapDataII.Builder mapBuilder = CommonMsg.MapDataII.newBuilder();
            mapBuilder.setKey((Integer)entry.getKey());
            mapBuilder.setValue((Integer)entry.getValue());
            builder.addAwardList(mapBuilder);
         }

         builder.setActivityId(this.getActivityId());
         builder.setActivityType(this.getActivityType());
         builder.setEndTime(this.getServerActivityInfo().end);
         builder.setAheadTime(this.getServerActivityInfo().drop);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_RecruitAward_4903(DragonTreasureMsg.C2S_RecruitAward_4903 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         ActivityInfo activityInfo = this.getServerActivityInfo();
         if (activityInfo.dropping && activityInfo.drop <= curTime) {
            this.player.failure(61132);
         } else {
            DragonTreasureModel dragonTreasureModel = (DragonTreasureModel)this.player.getGameModelPool().getEntity("dragonTreasure", this.getActivityId());
            if (dragonTreasureModel != null) {
               List<Integer> resultList = new ArrayList();
               List<Integer> broadcast = new ArrayList();
               boolean flag = false;
               DragonTreasureData data = this.getDragonTreasureData();
               int oldPoint = data.point;
               int type = msg.getRecruitType();
               if (type == 1) {
                  if (data.goldNum >= dragonTreasureModel.getFreeChance()) {
                     this.player.failure(61135);
                     return;
                  }

                  if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, (Integer)dragonTreasureModel.getChanceSpend().get(data.goldNum))) {
                     this.player.failure(61133);
                     return;
                  }

                  flag = this.createAward(data, dragonTreasureModel, type, resultList, broadcast);
                  this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)(Integer)dragonTreasureModel.getChanceSpend().get(data.goldNum), 73, 7301, 0, 1, "");
               } else if (type == 2) {
                  String consume = this.configManager.getStrByDefault("dragonTreasureitem", "2|1167|1");
                  String[] item = consume.split("\\|");
                  if (!this.player.checkResourceNum(Integer.parseInt(item[0]), Integer.parseInt(item[1]), Integer.parseInt(item[2]))) {
                     this.player.failure(61134);
                     return;
                  }

                  flag = this.createAward(data, dragonTreasureModel, type, resultList, broadcast);
                  this.player.delResource(Integer.parseInt(item[0]), Integer.parseInt(item[1]), (long)Integer.parseInt(item[2]), 73, 7301, 0, 1, "");
               } else {
                  String consume = this.configManager.getStrByDefault("dragonTreasureitem", "2|1167|1");
                  String[] item = consume.split("\\|");
                  if (!this.player.checkResourceNum(Integer.parseInt(item[0]), Integer.parseInt(item[1]), Integer.parseInt(item[2]) * 10)) {
                     this.player.failure(61134);
                     return;
                  }

                  for(int i = 0; i < 10; ++i) {
                     boolean tempFlag = this.createAward(data, dragonTreasureModel, type, resultList, broadcast);
                     if (tempFlag) {
                        flag = true;
                     }
                  }

                  this.player.delResource(Integer.parseInt(item[0]), Integer.parseInt(item[1]), (long)(Integer.parseInt(item[2]) * 10), 73, 7301, 0, 10, "");
               }

               Map<Integer, DragonTreasureAwardModel> awardModelMap = this.player.getGameModelPool().getMap("dragonTreasureAward");
               List<ResourceModel> resourceModelList = new ArrayList();

               for(Integer awardId : resultList) {
                  if (awardModelMap.containsKey(awardId)) {
                     DragonTreasureAwardModel awardModel = (DragonTreasureAwardModel)awardModelMap.get(awardId);

                     for(ResourceModel resourceModel : awardModel.getRewards()) {
                        resourceModelList.add(new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue()));
                     }
                  }
               }

               if (flag) {
                  int realValue = dragonTreasureModel.getMoney() + data.addMoney;
                  resourceModelList.add(new ResourceModel(1, PlayerDefine.PLAYER_GOLD, realValue));
               }

               this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 73, 7302, 0, 0, "");
               int realPoint = data.point - oldPoint;
               if (realPoint > 0) {
                  logger.info("本次抽奖掉落共获取积分：" + realPoint);
                  this.player.addResource(2, dragonTreasureModel.getPoint(), realPoint, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 73, 7302, 0, 0, "");
               }

               for(Integer awardId : broadcast) {
                  data.addRecord(awardId);
               }

               if (flag) {
                  this.initData(data);
                  data.addMoney = 0;
               }

               this.updateThemeDao();
               DragonTreasureMsg.S2C_RecruitAward_4904.Builder builder = DragonTreasureMsg.S2C_RecruitAward_4904.newBuilder();
               builder.setRecruitType(type);
               this.player.sendMsg(builder.build());
               this.sendInfo();
               this.updatePoint(realPoint);
               this.updateRecord(broadcast);
            }
         }
      }
   }

   public void updatePoint(int addPoint) {
      ActivityInfo activityInfo = this.getServerActivityInfo();
      DragonTreasureMsg.S2S_UpdatePoint_4931.Builder builder = DragonTreasureMsg.S2S_UpdatePoint_4931.newBuilder();
      builder.setActivityId(activityInfo.id);
      builder.setActivityType(this.getActivityType());
      builder.setEndTime(activityInfo.end);
      builder.setAddPoint(addPoint);
      this.player.sendMsg(builder.build());
   }

   public void updateRecord(List<Integer> awardList) {
      DragonTreasureMsg.S2S_UpdateRecord_4930.Builder builder = DragonTreasureMsg.S2S_UpdateRecord_4930.newBuilder();
      builder.setActivityId(this.getServerActivityInfo().id);
      builder.addAllAwardList(awardList);
      this.player.sendMsg(builder.build());
   }

   public boolean createAward(DragonTreasureData data, DragonTreasureModel dragonTreasureModel, int type, List<Integer> resultList, List<Integer> broadcast) {
      boolean flag = false;
      DragonTreasureFormModel formModel = this.getRecruitForm(data, dragonTreasureModel, type);
      int awardId = ((DragonTreasureAwardData)data.awardPool.get(formModel.getForm())).awardId;
      MapUtil.mapPlusInt(data.awardMap, awardId, 1);
      if (formModel.getRepeat() == 0) {
         ((DragonTreasureAwardData)data.awardPool.get(formModel.getForm())).end = true;
      }

      data.addMoney += dragonTreasureModel.getAddmoney();
      data.point += formModel.getMark();
      if (formModel.getForm() == 1) {
         flag = true;
         ((DragonTreasureAwardData)data.awardPool.get(formModel.getForm())).end = true;
      } else {
         resultList.add(awardId);
      }

      if (formModel.getHeadlines() == 1) {
         broadcast.add(awardId);
      }

      if (type == 1) {
         ++data.goldNum;
      } else {
         ++data.propNum;
      }

      int addLuck = this.configManager.getIntDefault("dragonTreasureluck", 1);
      data.luckyPoint += addLuck;
      return flag;
   }

   public DragonTreasureFormModel getRecruitForm(DragonTreasureData data, DragonTreasureModel dragonTreasureModel, int type) {
      Map<Integer, DragonTreasureFormModel> formModelMap = this.player.getGameModelPool().getMap("dragonTreasureForm");
      List<KeyValFun> funList = new ArrayList();

      for(DragonTreasureAwardData awardData : data.awardPool.values()) {
         if (!awardData.end) {
            DragonTreasureAwardModel awardModel = (DragonTreasureAwardModel)this.player.getGameModelPool().getEntity("dragonTreasureAward", awardData.awardId);

            for(DragonTreasureFormModel value : formModelMap.values()) {
               if (dragonTreasureModel.getGroup() == value.getGroup() && awardData.position == value.getForm() && (awardModel.getAwardTimes() <= 0 || !data.awardMap.containsKey(awardData.awardId) || (Integer)data.awardMap.get(awardData.awardId) < awardModel.getAwardTimes())) {
                  if (type != 1) {
                     funList.add(new KeyValFun(value.getId(), value.getOdd2()));
                     break;
                  }

                  if (value.getSureornot() == 1 && data.awardMap.containsKey(awardData.awardId) && (Integer)data.awardMap.get(awardData.awardId) >= value.getSuretimes() && value.getSuretimes() != 0) {
                     return value;
                  }

                  if ((value.getSureornot() != 1 || data.awardMap.containsKey(awardData.awardId) || value.getNotimes() == 0) && (value.getSureornot() != 1 || !data.awardMap.containsKey(awardData.awardId) || (Integer)data.awardMap.get(awardData.awardId) >= value.getNotimes())) {
                     funList.add(new KeyValFun(value.getId(), value.getOdd1()));
                     break;
                  }
               }
            }
         }
      }

      if (funList.isEmpty()) {
         return null;
      } else {
         int id = GamePlayer.countRate(funList);
         return (DragonTreasureFormModel)formModelMap.get(id);
      }
   }

   @MsgHandlerAnno
   public void C2S_RefreshPool_4905(DragonTreasureMsg.C2S_RefreshPool_4905 msg, String source) {
      DragonTreasureData data = this.getDragonTreasureData();
      this.initData(data);
      ++data.refreshNum;
      this.updateThemeDao();
      DragonTreasureMsg.S2C_RefreshPool_4906.Builder builder = DragonTreasureMsg.S2C_RefreshPool_4906.newBuilder();

      for(DragonTreasureAwardData awardData : data.awardPool.values()) {
         DragonTreasureMsg.AwardPool.Builder pool = DragonTreasureMsg.AwardPool.newBuilder();
         pool.setAwardId(awardData.awardId);
         pool.setEnd(awardData.end);
         pool.setPosition(awardData.position);
         builder.addAwardPool(pool);
      }

      builder.setRefreshNum(data.refreshNum);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ReceiveBoxAward_4909(DragonTreasureMsg.C2S_ReceiveBoxAward_4909 msg, String source) {
      DragonTreasureData data = this.getDragonTreasureData();
      if (data.receiveBos.contains(msg.getLuckPoint())) {
         logger.info("已经领取该幸运值奖励");
      } else if (msg.getLuckPoint() < data.luckyPoint) {
         logger.info("当前幸运值不足");
      } else {
         Map<Integer, DragonTreasureConfortModel> modelMap = this.player.getGameModelPool().getMap("dragonTreasureConfort");
         Map<Integer, Integer> tempMap = new HashMap();

         for(DragonTreasureConfortModel value : modelMap.values()) {
            if (value.getConfortGroup() == this.getActivityId()) {
               tempMap.put(value.getLuckPoint(), value.getId());
            }
         }

         if (tempMap.containsKey(msg.getLuckPoint())) {
            int realId = (Integer)tempMap.get(msg.getLuckPoint());
            DragonTreasureConfortModel model = (DragonTreasureConfortModel)modelMap.get(realId);
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 73, 7303, 0, 0, "");
            data.receiveBos.add(msg.getLuckPoint());
            this.updateThemeDao();
            DragonTreasureMsg.S2C_ReceiveBoxAward_4910.Builder builder = DragonTreasureMsg.S2C_ReceiveBoxAward_4910.newBuilder();
            builder.addAllReceiveBox(data.receiveBos);
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_PointRank_4907(DragonTreasureMsg.C2S_PointRank_4907 msg, String source) {
      DragonTreasureMsg.C2S_PointRank_4907.Builder builder = msg.toBuilder();
      builder.setActivityId(this.getActivityId());
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void S2S_NotifySendAward_4911(DragonTreasureMsg.S2S_NotifySendAward_4932 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int rank = msg.getRank();
      DragonTreasureModel model = (DragonTreasureModel)this.player.getGameModelPool().getEntity("dragonTreasure", this.getActivityId());
      if (model == null) {
         logger.info("未找到活动配置：" + this.getActivityId());
      } else {
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         CentreAwardModel rewardModel = this.getCentreAwardModel(model.getCentreAward(), (long)rank);
         int logReason = 7304;
         String content = MessageFormat.format(rewardModel.getDesc(), rank);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), content, rewardModel.getItems(), 604800000L, 73, logReason);
      }
   }

   public int getActivityId() {
      ActivityInfo activityInfo = this.getServerActivityInfo();
      return activityInfo.id;
   }

   public void initData(DragonTreasureData data) {
      DragonTreasureModel dragonTreasureModel = (DragonTreasureModel)this.player.getGameModelPool().getEntity("dragonTreasure", this.getActivityId());
      if (dragonTreasureModel != null) {
         Map<Integer, DragonTreasureFormModel> formModelMap = this.player.getGameModelPool().getMap("dragonTreasureForm");
         List<DragonTreasureFormModel> groulList = new ArrayList();

         for(DragonTreasureFormModel value : formModelMap.values()) {
            if (value.getGroup() == dragonTreasureModel.getGroup()) {
               groulList.add(value);
            }
         }

         data.awardPool.clear();

         for(DragonTreasureFormModel formModel : groulList) {
            Map<Integer, DragonTreasureAwardModel> awardModelMap = this.player.getGameModelPool().getMap("dragonTreasureAward");
            List<DragonTreasureAwardModel> awardList = new ArrayList();

            for(DragonTreasureAwardModel value : awardModelMap.values()) {
               if (value.getAwardGroup() == formModel.getAwardGroup()) {
                  awardList.add(value);
               }
            }

            List<KeyValFun> funList = new ArrayList();

            for(DragonTreasureAwardModel awardModel : awardList) {
               if (!data.awardMap.containsKey(awardModel.getId()) || (Integer)data.awardMap.get(awardModel.getId()) < awardModel.getAwardTimes() || awardModel.getAwardTimes() <= 0) {
                  funList.add(new KeyValFun(awardModel.getId(), awardModel.getAwardodd()));
               }
            }

            int awardId = GamePlayer.countRate(funList);
            DragonTreasureAwardData awardData = new DragonTreasureAwardData();
            awardData.awardId = awardId;
            awardData.position = formModel.getForm();
            awardData.end = false;
            data.awardPool.put(formModel.getForm(), awardData);
         }

         for(Map.Entry<Integer, DragonTreasureAwardData> entry : data.awardPool.entrySet()) {
            logger.info("本次随机出的奖池：" + entry.getKey() + "---" + ((DragonTreasureAwardData)entry.getValue()).awardId);
         }

      }
   }

   public DragonTreasureData getDragonTreasureData() {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      return themeActivityDao.dragonTreasureData;
   }

   public void updateThemeDao() {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      themeActivityDao.updateOp();
   }

   public int getActivityType() {
      return 30;
   }

   private CentreAwardModel getCentreAwardModel(int type, long rank) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = this.player.getGameModelPool().getMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> rewardMap = (TreeMap)centreAwardModelMap.get(type);
      CentreAwardModel rewardModel = null;

      for(CentreAwardModel value : rewardMap.values()) {
         if ((long)value.getMinRank() <= rank && (long)value.getMaxRank() >= rank) {
            rewardModel = value;
         }
      }

      if (rewardModel == null) {
         rewardModel = (CentreAwardModel)rewardMap.lastEntry().getValue();
      }

      return rewardModel;
   }
}
