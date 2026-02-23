package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.util.RandomUtil;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.model.ActivityDropModel;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.ActivityPointRewardModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.CustomizeGiftBagModel;
import com.gzbz.model.DicePlateModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.SpecificGroupModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.RotateActivityMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.LiYuTaskPart;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
import misc.MapUtil;
import misc.MiscUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class LiYuActivityPart extends AbstractActivityPart {
   @MsgHandlerAnno
   public void C2S_LuckMain_16101(RotateActivityMsg.C2S_LuckMain_16101 msg, String source) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      RotateActivityMsg.S2C_LuckMain_16102.Builder resp = RotateActivityMsg.S2C_LuckMain_16102.newBuilder();

      for(Map.Entry<Byte, Byte> entry : playerActivityDao.activityLiYuData.dicePlates.entrySet()) {
         RotateActivityMsg.DicePlateData.Builder builder = RotateActivityMsg.DicePlateData.newBuilder();
         builder.setId((Byte)entry.getKey());
         builder.setCount((Byte)entry.getValue());
         resp.addDicePlate(builder);
      }

      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_LuckRollDice_16103(RotateActivityMsg.C2S_LuckRollDice_16103 msg, String source) {
      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
      if (activityInfo != null && activityInfo.open) {
         DicePlateModel dicePlateModel = (DicePlateModel)ApplicationContextProvider.getModelPoolEntity("Diceplate", msg.getDicePlateId());
         if (dicePlateModel == null) {
            this.player.failure(0);
         } else {
            PlayerDao playerDao = this.player.getPlayerDao();
            if (playerDao.active < dicePlateModel.getTargetNum()) {
               this.player.failure(27);
            } else {
               PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
               String[] throwTimeArr = ApplicationContextProvider.getConfigString("throwTime", "").split("\\|");
               byte dicePlateCount = (Byte)MapUtil.getOrDefault(playerActivityDao.activityLiYuData.dicePlates, (byte)msg.getDicePlateId(), (byte)0);
               if (dicePlateCount >= Integer.parseInt(throwTimeArr[1])) {
                  this.player.failure(8013);
               } else {
                  int todayCount = 0;

                  for(byte value : playerActivityDao.activityLiYuData.dicePlates.values()) {
                     todayCount += value;
                  }

                  if (todayCount >= Integer.parseInt(throwTimeArr[0])) {
                     this.player.failure(8012);
                  } else {
                     ResourceModel auspiciousResource = ResourceModel.buildResource(ApplicationContextProvider.getConfigString("AuspiciousNum", ""));
                     RotateActivityMsg.S2C_LuckRollDice_16104.Builder resp = RotateActivityMsg.S2C_LuckRollDice_16104.newBuilder();
                     resp.setDicePlateId(msg.getDicePlateId());
                     int totalNum = 0;

                     for(int index = 0; index < dicePlateModel.getDiceNum(); ++index) {
                        RotateActivityMsg.DiceData.Builder diceData = RotateActivityMsg.DiceData.newBuilder();
                        diceData.setIndex(index);
                        diceData.setNum(RandomUtil.randomInt(1, 7));
                        resp.addDice(diceData);
                        totalNum += diceData.getNum();
                     }

                     auspiciousResource.setValue(auspiciousResource.getValue() * totalNum);
                     this.player.addResource(auspiciousResource, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 8, 832, dicePlateModel.getId(), totalNum, "");
                     this.player.sendMsg(resp.build());
                     playerActivityDao.activityLiYuData.dicePlates.put((byte)msg.getDicePlateId(), (byte)(dicePlateCount + 1));
                     playerActivityDao.updateOp();
                     RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
                     int curNum = (int)rankPart.getScore(RankDefine.RankModule.ACTIVITY_POINT, this.getActivityType() + ":" + activityInfo.id);
                     rankPart.updateRank(RankDefine.RankModule.ACTIVITY_POINT, (long)(curNum + auspiciousResource.getValue()), false, this.getActivityType() + ":" + activityInfo.id);
                  }
               }
            }
         }
      } else {
         this.player.failure(8007);
      }
   }

   @MsgHandlerAnno
   public void C2S_PrayMain_16105(RotateActivityMsg.C2S_PrayMain_16105 msg, String source) {
      this.sendPrayMain();
   }

   @MsgHandlerAnno
   public void C2S_PrayItemList_16107(RotateActivityMsg.C2S_PrayItemList_16107 msg, String source) {
      RotateActivityMsg.S2C_PrayItemList_16108.Builder resp = RotateActivityMsg.S2C_PrayItemList_16108.newBuilder();
      resp.setCustomId(msg.getCustomId());
      CustomizeGiftBagModel customizeGiftBagModel = (CustomizeGiftBagModel)ApplicationContextProvider.getModelPoolEntity("customizeGiftBag", msg.getCustomId());
      if (customizeGiftBagModel != null && customizeGiftBagModel.getGroup().get(1) != null) {
         SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", (Integer)customizeGiftBagModel.getGroup().get(1));
         if (specificGroupModel != null) {
            for(ResourceModel resourceModel : specificGroupModel.getRewards()) {
               resp.addItem(resourceModel.builder());
            }
         }
      }

      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_Pray_16109(RotateActivityMsg.C2S_Pray_16109 msg, String source) {
      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
      if (activityInfo != null && activityInfo.open) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         if (!playerActivityDao.activityLiYuData.prays.isEmpty()) {
            this.player.failure(8014);
         } else {
            Map<Integer, Map<Integer, CustomizeGiftBagModel>> allModelMap = ApplicationContextProvider.<Integer, Map<Integer, CustomizeGiftBagModel>>getModelPoolMap("customCustomizeGiftBag");
            if (allModelMap != null && allModelMap.containsKey(activityInfo.id)) {
               Map<Integer, CustomizeGiftBagModel> activityGiftMap = (Map)allModelMap.get(activityInfo.id);
               if (msg.getPrayDataCount() != activityGiftMap.size()) {
                  this.player.failure(8015);
               } else {
                  RotateActivityMsg.S2C_Pray_16110.Builder resp = RotateActivityMsg.S2C_Pray_16110.newBuilder();
                  Map<Integer, Long> chooseMap = new HashMap();

                  for(RotateActivityMsg.PrayData prayData : msg.getPrayDataList()) {
                     CustomizeGiftBagModel customizeGiftBagModel = (CustomizeGiftBagModel)activityGiftMap.get(prayData.getCustomId());
                     if (customizeGiftBagModel != null && customizeGiftBagModel.getGroup().get(1) != null) {
                        SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", (Integer)customizeGiftBagModel.getGroup().get(1));
                        if (specificGroupModel == null) {
                           this.player.failure(0);
                           return;
                        }

                        List<ResourceModel> resourceModelList = specificGroupModel.getRewards();
                        if (resourceModelList != null && resourceModelList.size() > prayData.getItemIndex()) {
                           chooseMap.put(prayData.getCustomId(), MiscUtil.comboInteger(0, prayData.getItemIndex()));
                           resp.addPrayData(prayData.toBuilder().setItem(((ResourceModel)resourceModelList.get(prayData.getItemIndex())).builder()).setIsGot(false));
                           continue;
                        }

                        this.player.failure(0);
                        return;
                     }

                     this.player.failure(0);
                     return;
                  }

                  playerActivityDao.activityLiYuData.prays = chooseMap;
                  playerActivityDao.updateOp();
                  this.player.sendMsg(resp.build());
               }
            } else {
               this.player.failure(0);
            }
         }
      } else {
         this.player.failure(8007);
      }
   }

   @MsgHandlerAnno
   public void C2S_PrayReward_16111(RotateActivityMsg.C2S_PrayReward_16111 msg, String source) {
      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
      if (activityInfo != null && activityInfo.open) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         Long value = (Long)playerActivityDao.activityLiYuData.prays.get(msg.getCustomId());
         if (value == null) {
            this.player.failure(8016);
         } else {
            int itemIndex = MiscUtil.getLowParam(value);
            boolean isGot = MiscUtil.getHiParam(value) == 1;
            if (isGot) {
               this.player.failure(24);
            } else {
               ActivityPointRewardModel activityPointRewardModel = (ActivityPointRewardModel)ApplicationContextProvider.getModelPoolEntity("ActivityPointReward", msg.getCustomId());
               if (activityPointRewardModel == null) {
                  this.player.failure(0);
               } else if (!this.player.checkResourceNum(activityPointRewardModel.getPointType(), activityPointRewardModel.getPointId(), activityPointRewardModel.getPointNum())) {
                  this.player.failure(8017);
               } else {
                  CustomizeGiftBagModel customizeGiftBagModel = (CustomizeGiftBagModel)ApplicationContextProvider.getModelPoolEntity("customizeGiftBag", msg.getCustomId());
                  if (customizeGiftBagModel != null && customizeGiftBagModel.getGroup().get(1) != null && customizeGiftBagModel.getActivityId() == activityInfo.id) {
                     SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", (Integer)customizeGiftBagModel.getGroup().get(1));
                     if (specificGroupModel == null) {
                        this.player.failure(0);
                     } else {
                        List<ResourceModel> resourceModelList = specificGroupModel.getRewards();
                        if (resourceModelList != null && resourceModelList.size() > itemIndex) {
                           ResourceModel resourceModel = (ResourceModel)resourceModelList.get(itemIndex);
                           this.player.addResource(resourceModel, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 835, msg.getCustomId(), itemIndex, "");
                           playerActivityDao.activityLiYuData.prays.put(msg.getCustomId(), MiscUtil.comboInteger(1, itemIndex));
                           playerActivityDao.updateOp();
                           RotateActivityMsg.S2C_PrayReward_16112.Builder resp = RotateActivityMsg.S2C_PrayReward_16112.newBuilder();
                           resp.setCustomId(msg.getCustomId());
                           this.player.sendMsg(resp.build());
                           ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityInfo.id);
                           if (activityOpenTimeModel != null) {
                              this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, activityInfo.id, activityOpenTimeModel.getTips(), resourceModel.getType() + "-" + resourceModel.getId() + "-" + resourceModel.getValue(), "-", 0, 0, 1);
                           }

                        } else {
                           this.player.failure(0);
                        }
                     }
                  } else {
                     this.player.failure(0);
                  }
               }
            }
         }
      } else {
         this.player.failure(8007);
      }
   }

   @MsgHandlerAnno
   public void C2S_PrayStarBuy_16113(RotateActivityMsg.C2S_PrayStarBuy_16113 msg, String source) {
      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
      if (activityInfo == null) {
         this.player.failure(8007);
      } else if (!DateUtil.isSameDay((long)activityInfo.end * 1000L, System.currentTimeMillis())) {
         this.player.failure(0);
      } else {
         String[] feeArr = ApplicationContextProvider.getConfigString("starGames", "").split(",");
         ResourceModel resourceModel = ResourceModel.buildResource(feeArr[1]);
         if (!ResourceModel.checkTotalNumError(resourceModel.getValue(), msg.getBuyNum())) {
            resourceModel.setValue(resourceModel.getValue() * msg.getBuyNum());
            if (!this.player.checkResourceNum(resourceModel)) {
               this.player.failure(31);
            } else {
               this.player.delResource(resourceModel, 8, 836, 0, msg.getBuyNum(), "");
               resourceModel = new ResourceModel(2, Integer.parseInt(feeArr[0]), msg.getBuyNum());
               this.player.addResource(resourceModel, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 836, 0, msg.getBuyNum(), "");
               RotateActivityMsg.S2C_PrayStarBuy_16114.Builder resp = RotateActivityMsg.S2C_PrayStarBuy_16114.newBuilder();
               resp.setBuyNum(msg.getBuyNum());
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   public void rotateReset(int oldActivityId) {
      ResourceModel auspiciousResource = ResourceModel.buildResource(ApplicationContextProvider.getConfigString("AuspiciousNum", ""));
      long num = this.player.getResourceNum(auspiciousResource.getType(), auspiciousResource.getId());
      if (num > 0L) {
         this.player.delResource(auspiciousResource.getType(), auspiciousResource.getId(), num, 8, 838, 0, 0, "");
      }

      String[] feeArr = ApplicationContextProvider.getConfigString("starGames", "").split(",");
      int starItemId = Integer.parseInt(feeArr[0]);
      num = this.player.getResourceNum(2, starItemId);
      if (num > 0L) {
         this.player.delResource(2, starItemId, num, 8, 838, 0, 0, "");
      }

      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityLiYuData.dailyReset();
      playerActivityDao.activityLiYuData.prays.clear();
      playerActivityDao.activityLiYuData.superBox.clear();
      playerActivityDao.updateOp();
      this.clearActivityGift(24);
      LiYuTaskPart liYuTaskPart = (LiYuTaskPart)this.player.getMgrPart(LiYuTaskPart.class);
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(liYuTaskPart.getModule());
      liYuTaskPart.trigger();
      this.clearActivityGift(24);
   }

   public void activityEnd(int oldActivityId) {
      List<ResourceModel> exchangeResources = ResourceModel.buildResources(ApplicationContextProvider.getConfigString("newYearEndExchange", ""));
      ResourceModel auspiciousResource = ResourceModel.buildResource(ApplicationContextProvider.getConfigString("AuspiciousNum", ""));
      long num = this.player.getResourceNum(auspiciousResource.getType(), auspiciousResource.getId());
      if (num > 0L) {
         this.player.addResource(((ResourceModel)exchangeResources.get(0)).getType(), ((ResourceModel)exchangeResources.get(0)).getId(), (int)num, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 8, 838, 0, 0, "");
         this.player.delResource(auspiciousResource.getType(), auspiciousResource.getId(), num, 8, 838, 0, 0, "");
      }

      String[] feeArr = ApplicationContextProvider.getConfigString("starGames", "").split(",");
      int starItemId = Integer.parseInt(feeArr[0]);
      num = this.player.getResourceNum(2, starItemId);
      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
      if (activityInfo != null) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         int centreAwardType = CentreAwardModel.TYPE_SPRING_FESTIVAL_BLESS_FORGOT_REWARD;
         List<ResourceModel> rewardList = new ArrayList();
         if (playerActivityDao.activityLiYuData.prays.isEmpty()) {
            Map<Integer, Map<Integer, CustomizeGiftBagModel>> allModelMap = ApplicationContextProvider.<Integer, Map<Integer, CustomizeGiftBagModel>>getModelPoolMap("customCustomizeGiftBag");

            for(CustomizeGiftBagModel customizeGiftBagModel : (MapUtil.getOrDefault(allModelMap, activityInfo.id, TreeMap.class)).values()) {
               SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", (Integer)customizeGiftBagModel.getGroup().get(1));
               if (specificGroupModel != null && specificGroupModel.getRewards() != null && !specificGroupModel.getRewards().isEmpty()) {
                  playerActivityDao.activityLiYuData.prays.put(customizeGiftBagModel.getId(), MiscUtil.comboInteger(0, 0));
                  playerActivityDao.updateOp();
               }
            }

            centreAwardType = CentreAwardModel.TYPE_SPRING_FESTIVAL_BLESS_REWARD;
         }

         if (num > 0L) {
            int delStar = 0;

            for(Map.Entry<Integer, Long> entry : playerActivityDao.activityLiYuData.prays.entrySet()) {
               CustomizeGiftBagModel customizeGiftBagModel = (CustomizeGiftBagModel)ApplicationContextProvider.getModelPoolEntity("customizeGiftBag", (Integer)entry.getKey());
               if (customizeGiftBagModel != null) {
                  SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", (Integer)customizeGiftBagModel.getGroup().get(1));
                  ActivityPointRewardModel activityPointRewardModel = (ActivityPointRewardModel)ApplicationContextProvider.getModelPoolEntity("ActivityPointReward", customizeGiftBagModel.getId());
                  if (specificGroupModel != null && specificGroupModel.getRewards() != null && !specificGroupModel.getRewards().isEmpty() && (long)activityPointRewardModel.getPointNum() <= num) {
                     long value = (Long)entry.getValue();
                     int index = MiscUtil.getLowParam(value);
                     boolean isGot = MiscUtil.getHiParam(value) == 1;
                     if (!isGot) {
                        rewardList.add(specificGroupModel.getRewards().get(index));
                        entry.setValue(MiscUtil.comboInteger(1, index));
                     }

                     delStar = Math.max(delStar, activityPointRewardModel.getPointNum());
                  }
               }
            }

            if (num - (long)delStar > 0L) {
               this.player.addResource(((ResourceModel)exchangeResources.get(1)).getType(), ((ResourceModel)exchangeResources.get(1)).getId(), (int)(num - (long)delStar), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 8, 838, 0, 0, "");
            }

            this.player.delResource(2, starItemId, num, 8, 838, 0, 0, "");
            if (!rewardList.isEmpty()) {
               Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> blessRewardMap = (TreeMap)allAwardModelMap.get(centreAwardType);
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, ((CentreAwardModel)blessRewardMap.firstEntry().getValue()).getTitle(), ((CentreAwardModel)blessRewardMap.firstEntry().getValue()).getDesc(), rewardList, 604800000L, 8, 839);
            }

            playerActivityDao.updateOp();
         }
      }
   }

   public void resetDaily() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityLiYuData.dailyReset();
      playerActivityDao.updateOp();
      if (!this.isServerActivityInvalid()) {
         if (this.getSeverActivityDay() != 1) {
            LiYuTaskPart liYuTaskPart = (LiYuTaskPart)this.player.getMgrPart(LiYuTaskPart.class);
            liYuTaskPart.trigger();
            this.sendInfo();
         }
      }
   }

   public void sendInfo() {
      LiYuTaskPart liYuTaskPart = (LiYuTaskPart)this.player.getMgrPart(LiYuTaskPart.class);
      liYuTaskPart.sendInfo();
      this.sendPrayMain();
   }

   public ResourceModel activityDrop(int minute) {
      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
      if (activityInfo != null && activityInfo.id > 0 && activityInfo.end >= DateUtil.getIntTime(System.currentTimeMillis())) {
         ActivityDropModel activityDropModel = (ActivityDropModel)ApplicationContextProvider.getModelPoolEntity("activityDrop", activityInfo.id);
         int dropNum = minute * 60 / activityDropModel.getDropTime();
         return dropNum <= 0 ? null : new ResourceModel(activityDropModel.getPropertyPropsType(), activityDropModel.getPropertyPropsId(), dropNum);
      } else {
         return null;
      }
   }

   private void sendPrayMain() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      RotateActivityMsg.S2C_PrayMain_16106.Builder resp = RotateActivityMsg.S2C_PrayMain_16106.newBuilder();

      for(Map.Entry<Integer, Long> entry : playerActivityDao.activityLiYuData.prays.entrySet()) {
         int itemIndex = MiscUtil.getLowParam((Long)entry.getValue());
         boolean isGot = MiscUtil.getHiParam((Long)entry.getValue()) == 1;
         RotateActivityMsg.PrayData.Builder prayData = RotateActivityMsg.PrayData.newBuilder();
         prayData.setItemIndex(MiscUtil.getLowParam((long)itemIndex));
         prayData.setCustomId((Integer)entry.getKey());
         prayData.setIsGot(isGot);
         CustomizeGiftBagModel customizeGiftBagModel = (CustomizeGiftBagModel)ApplicationContextProvider.getModelPoolEntity("customizeGiftBag", (Integer)entry.getKey());
         if (customizeGiftBagModel != null && customizeGiftBagModel.getGroup().get(1) != null) {
            SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", (Integer)customizeGiftBagModel.getGroup().get(1));
            if (specificGroupModel != null) {
               List<ResourceModel> resourceModelList = specificGroupModel.getRewards();
               if (resourceModelList != null && resourceModelList.size() > itemIndex) {
                  prayData.setItem(((ResourceModel)resourceModelList.get(itemIndex)).builder());
               }
            }
         }

         resp.addPrayData(prayData);
      }

      this.player.sendMsg(resp.build());
   }

   public int getActivityType() {
      return 45;
   }

   public void buyGift(ShopLimitModel shopLimitModel) {
      if (shopLimitModel != null) {
         if (!this.isServerActivityInvalid()) {
            ActivityInfo activityInfo = this.getServerActivityInfo();
            if (shopLimitModel.getItemType() == 2) {
               ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", shopLimitModel.getItemId());
               if (itemModel != null) {
                  ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                  RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
                  int curNum = (int)rankPart.getScore(RankDefine.RankModule.ACTIVITY_POINT, this.getActivityType() + ":" + activityInfo.id);
                  ResourceModel auspiciousResource = ResourceModel.buildResource(ApplicationContextProvider.getConfigString("AuspiciousNum", ""));

                  for(ResourceModel resourceModel : itemBagPart.getResourcesByUseFun(itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue(), 1)) {
                     if (resourceModel.getType() == auspiciousResource.getType() && resourceModel.getId() == auspiciousResource.getId()) {
                        rankPart.updateRank(RankDefine.RankModule.ACTIVITY_POINT, (long)(curNum + resourceModel.getValue()), false, this.getActivityType() + ":" + activityInfo.id);
                     }
                  }
               }
            }

         }
      }
   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
      this.clearActivityGift(24);
      if (!mainOpen) {
         List<ResourceModel> exchangeResources = ResourceModel.buildResources(ApplicationContextProvider.getConfigString("newYearEndExchange", ""));
         ResourceModel auspiciousResource = ResourceModel.buildResource(ApplicationContextProvider.getConfigString("AuspiciousNum", ""));
         long num = this.player.getResourceNum(auspiciousResource.getType(), auspiciousResource.getId());
         if (num > 0L) {
            this.player.addResource(((ResourceModel)exchangeResources.get(0)).getType(), ((ResourceModel)exchangeResources.get(0)).getId(), (int)num, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 8, 838, 0, 0, "");
            this.player.delResource(auspiciousResource.getType(), auspiciousResource.getId(), num, 8, 838, 0, 0, "");
         }

         String[] feeArr = ApplicationContextProvider.getConfigString("starGames", "").split(",");
         int starItemId = Integer.parseInt(feeArr[0]);
         num = this.player.getResourceNum(2, starItemId);
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         ActivityInfo activityInfo = (ActivityInfo)playerActivityDao.activities.get(this.getActivityType());
         if (activityInfo != null && activityInfo.open) {
            int centreAwardType = CentreAwardModel.TYPE_SPRING_FESTIVAL_BLESS_FORGOT_REWARD;
            List<ResourceModel> rewardList = new ArrayList();
            if (playerActivityDao.activityLiYuData.prays.isEmpty()) {
               Map<Integer, Map<Integer, CustomizeGiftBagModel>> allModelMap = ApplicationContextProvider.<Integer, Map<Integer, CustomizeGiftBagModel>>getModelPoolMap("customCustomizeGiftBag");

               for(CustomizeGiftBagModel customizeGiftBagModel : (MapUtil.getOrDefault(allModelMap, activityInfo.id, TreeMap.class)).values()) {
                  SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", (Integer)customizeGiftBagModel.getGroup().get(1));
                  if (specificGroupModel != null && specificGroupModel.getRewards() != null && !specificGroupModel.getRewards().isEmpty()) {
                     playerActivityDao.activityLiYuData.prays.put(customizeGiftBagModel.getId(), MiscUtil.comboInteger(0, 0));
                     playerActivityDao.updateOp();
                  }
               }

               centreAwardType = CentreAwardModel.TYPE_SPRING_FESTIVAL_BLESS_REWARD;
            }

            for(Map.Entry<Integer, Long> entry : playerActivityDao.activityLiYuData.prays.entrySet()) {
               CustomizeGiftBagModel customizeGiftBagModel = (CustomizeGiftBagModel)ApplicationContextProvider.getModelPoolEntity("customizeGiftBag", (Integer)entry.getKey());
               if (customizeGiftBagModel != null) {
                  SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", (Integer)customizeGiftBagModel.getGroup().get(1));
                  if (specificGroupModel != null && specificGroupModel.getRewards() != null && !specificGroupModel.getRewards().isEmpty()) {
                     long value = (Long)entry.getValue();
                     int index = MiscUtil.getLowParam(value);
                     boolean isGot = MiscUtil.getHiParam(value) == 1;
                     if (!isGot) {
                        rewardList.add(specificGroupModel.getRewards().get(index));
                        entry.setValue(MiscUtil.comboInteger(1, index));
                     }
                  }
               }
            }

            this.player.delResource(2, starItemId, num, 8, 838, 0, 0, "");
            if (!rewardList.isEmpty()) {
               Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> blessRewardMap = (TreeMap)allAwardModelMap.get(centreAwardType);
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, ((CentreAwardModel)blessRewardMap.firstEntry().getValue()).getTitle(), ((CentreAwardModel)blessRewardMap.firstEntry().getValue()).getDesc(), rewardList, 604800000L, 8, 839);
            }

            TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
            taskCustomCache.delete(TaskDefine.TaskModule.MODULE_LI_YU_ROTATE);
            ActivityPart activityPart = (ActivityPart)this.player.getMgrPart(ActivityPart.class);
            activityPart.liYuReward(activityInfo.id, true, false);
            playerActivityDao.activities.remove(this.getActivityType());
            playerActivityDao.updateOp();
         }
      }
   }
}
