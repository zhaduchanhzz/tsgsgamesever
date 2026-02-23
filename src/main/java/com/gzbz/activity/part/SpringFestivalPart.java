package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.util.RandomUtil;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.SpringFestivalBlessDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gift.GiftPart;
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
import com.gzbz.protobuf.SpringFestivalMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.SpringFestivalTaskPart;
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
public class SpringFestivalPart extends AbstractActivityPart {
   @MsgHandlerAnno
   public void C2S_EnvelopeMain_12401(SpringFestivalMsg.C2S_EnvelopeMain_12401 msg, String source) {
      this.sendMain();
   }

   @MsgHandlerAnno
   public void C2S_EnvelopeBlessList_12403(SpringFestivalMsg.C2S_EnvelopeBlessList_12403 msg, String source) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      SpringFestivalMsg.S2C_EnvelopeBlessList_12404.Builder resp = SpringFestivalMsg.S2C_EnvelopeBlessList_12404.newBuilder();
      resp.setBlessCount(playerActivityDao.activitySpringFestivalData.bless);
      List<SpringFestivalBlessDao> springFestivalBlessDaoList = new ArrayList(this.getActivityMgr().getSpringFestivalBlessMap().values());
      if (!springFestivalBlessDaoList.isEmpty()) {
         int maxCount = ApplicationContextProvider.getConfigInt("playTheScreenShow", 20);

         for(int i = springFestivalBlessDaoList.size() - 1; i > -1; --i) {
            SpringFestivalBlessDao springFestivalBlessDao = (SpringFestivalBlessDao)springFestivalBlessDaoList.get(i);
            SpringFestivalMsg.BlessData.Builder builder = SpringFestivalMsg.BlessData.newBuilder();
            builder.setContent(springFestivalBlessDao.content);
            builder.setPlayerId(springFestivalBlessDao.playerId);
            resp.addBlessData(builder);
            if (resp.getBlessDataCount() >= maxCount) {
               break;
            }
         }
      }

      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_EnvelopeBless_12405(SpringFestivalMsg.C2S_EnvelopeBless_12405 msg, String source) {
      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
      if (activityInfo != null && activityInfo.open) {
         ActivityMgr activityMgr = this.getActivityMgr();
         activityMgr.pushTaskEx("addSpringFestivalBless", new Object[]{msg.getContent(), this.player.getPlayerId()});
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         ++playerActivityDao.activitySpringFestivalData.bless;
         playerActivityDao.updateOp();
         if (playerActivityDao.activitySpringFestivalData.bless == 1) {
            String firstBlessReward = ApplicationContextProvider.getConfigString("newYearBlessings", "");
            this.player.addResource(ResourceModel.buildResources(firstBlessReward), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 831, 0, 0, "");
         }

         SpringFestivalMsg.S2C_EnvelopeBless_12406.Builder resp = SpringFestivalMsg.S2C_EnvelopeBless_12406.newBuilder();
         resp.setContent(msg.getContent());
         this.player.sendMsg(resp.build());
      } else {
         this.player.failure(8007);
      }
   }

   @MsgHandlerAnno
   public void C2S_LuckMain_12409(SpringFestivalMsg.C2S_LuckMain_12409 msg, String source) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      SpringFestivalMsg.S2C_LuckMain_12410.Builder resp = SpringFestivalMsg.S2C_LuckMain_12410.newBuilder();

      for(Map.Entry<Byte, Byte> entry : playerActivityDao.activitySpringFestivalData.dicePlates.entrySet()) {
         SpringFestivalMsg.DicePlateData.Builder builder = SpringFestivalMsg.DicePlateData.newBuilder();
         builder.setId((Byte)entry.getKey());
         builder.setCount((Byte)entry.getValue());
         resp.addDicePlate(builder);
      }

      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_LuckRollDice_12411(SpringFestivalMsg.C2S_LuckRollDice_12411 msg, String source) {
      ActivityMgr activityMgr = this.getActivityMgr();
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
               byte dicePlateCount = (Byte)MapUtil.getOrDefault(playerActivityDao.activitySpringFestivalData.dicePlates, (byte)msg.getDicePlateId(), (byte)0);
               if (dicePlateCount >= Integer.parseInt(throwTimeArr[1])) {
                  this.player.failure(8013);
               } else {
                  int todayCount = 0;

                  for(byte value : playerActivityDao.activitySpringFestivalData.dicePlates.values()) {
                     todayCount += value;
                  }

                  if (todayCount >= Integer.parseInt(throwTimeArr[0])) {
                     this.player.failure(8012);
                  } else {
                     ResourceModel auspiciousResource = ResourceModel.buildResource(ApplicationContextProvider.getConfigString("AuspiciousNum", ""));
                     SpringFestivalMsg.S2C_LuckRollDice_12412.Builder resp = SpringFestivalMsg.S2C_LuckRollDice_12412.newBuilder();
                     resp.setDicePlateId(msg.getDicePlateId());
                     int totalNum = 0;

                     for(int index = 0; index < dicePlateModel.getDiceNum(); ++index) {
                        SpringFestivalMsg.DiceData.Builder diceData = SpringFestivalMsg.DiceData.newBuilder();
                        diceData.setIndex(index);
                        diceData.setNum(RandomUtil.randomInt(1, 7));
                        resp.addDice(diceData);
                        totalNum += diceData.getNum();
                     }

                     auspiciousResource.setValue(auspiciousResource.getValue() * totalNum);
                     this.player.addResource(auspiciousResource, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 8, 832, dicePlateModel.getId(), totalNum, "");
                     this.player.sendMsg(resp.build());
                     playerActivityDao.activitySpringFestivalData.dicePlates.put((byte)msg.getDicePlateId(), (byte)(dicePlateCount + 1));
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
   public void C2S_GiftBoxMain_12413(SpringFestivalMsg.C2S_GiftBoxMain_12413 msg, String source) {
      this.sendGiftBoxMain();
   }

   @MsgHandlerAnno
   public void C2S_PrayMain_12419(SpringFestivalMsg.C2S_PrayMain_12419 msg, String source) {
      this.sendPrayMain();
   }

   @MsgHandlerAnno
   public void C2S_PrayItemList_12421(SpringFestivalMsg.C2S_PrayItemList_12421 msg, String source) {
      SpringFestivalMsg.S2C_PrayItemList_12422.Builder resp = SpringFestivalMsg.S2C_PrayItemList_12422.newBuilder();
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
   public void C2S_Pray_12423(SpringFestivalMsg.C2S_Pray_12423 msg, String source) {
      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
      if (activityInfo != null && activityInfo.open) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         if (!playerActivityDao.activitySpringFestivalData.prays.isEmpty()) {
            this.player.failure(8014);
         } else {
            Map<Integer, Map<Integer, CustomizeGiftBagModel>> allModelMap = ApplicationContextProvider.<Integer, Map<Integer, CustomizeGiftBagModel>>getModelPoolMap("customCustomizeGiftBag");
            if (allModelMap != null && allModelMap.containsKey(activityInfo.id)) {
               Map<Integer, CustomizeGiftBagModel> activityGiftMap = (Map)allModelMap.get(activityInfo.id);
               if (msg.getPrayDataCount() != activityGiftMap.size()) {
                  this.player.failure(8015);
               } else {
                  SpringFestivalMsg.S2C_Pray_12424.Builder resp = SpringFestivalMsg.S2C_Pray_12424.newBuilder();
                  Map<Integer, Long> chooseMap = new HashMap();

                  for(SpringFestivalMsg.PrayData prayData : msg.getPrayDataList()) {
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

                  playerActivityDao.activitySpringFestivalData.prays = chooseMap;
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
   public void C2S_PrayReward_12425(SpringFestivalMsg.C2S_PrayReward_12425 msg, String source) {
      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
      if (activityInfo != null && activityInfo.open) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         Long value = (Long)playerActivityDao.activitySpringFestivalData.prays.get(msg.getCustomId());
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
                           playerActivityDao.activitySpringFestivalData.prays.put(msg.getCustomId(), MiscUtil.comboInteger(1, itemIndex));
                           playerActivityDao.updateOp();
                           SpringFestivalMsg.S2C_PrayReward_12426.Builder resp = SpringFestivalMsg.S2C_PrayReward_12426.newBuilder();
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
   public void C2S_PrayStarBuy_12427(SpringFestivalMsg.C2S_PrayStarBuy_12427 msg, String source) {
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
               SpringFestivalMsg.S2C_PrayStarBuy_12428.Builder resp = SpringFestivalMsg.S2C_PrayStarBuy_12428.newBuilder();
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
      playerActivityDao.activitySpringFestivalData.dailyReset();
      playerActivityDao.activitySpringFestivalData.prays.clear();
      playerActivityDao.activitySpringFestivalData.superBox.clear();
      playerActivityDao.updateOp();
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      giftPart.clearGifts(19);
      giftPart.clearGifts(21);
      this.clearActivityGift(5);
      SpringFestivalTaskPart springFestivalTaskPart = (SpringFestivalTaskPart)this.player.getMgrPart(SpringFestivalTaskPart.class);
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(springFestivalTaskPart.getModule());
      springFestivalTaskPart.trigger();
      this.clearActivityGift(24);
   }

   public void activityEnd(int oldActivityId) {
      SpringFestivalTaskPart springFestivalTaskPart = (SpringFestivalTaskPart)this.player.getMgrPart(SpringFestivalTaskPart.class);
      springFestivalTaskPart.giftReward();
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
         if (playerActivityDao.activitySpringFestivalData.prays.isEmpty()) {
            Map<Integer, Map<Integer, CustomizeGiftBagModel>> allModelMap = ApplicationContextProvider.<Integer, Map<Integer, CustomizeGiftBagModel>>getModelPoolMap("customCustomizeGiftBag");

            for(CustomizeGiftBagModel customizeGiftBagModel : ((Map)MapUtil.getOrDefault(allModelMap, activityInfo.id, TreeMap.class)).values()) {
               SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", (Integer)customizeGiftBagModel.getGroup().get(1));
               if (specificGroupModel != null && specificGroupModel.getRewards() != null && !specificGroupModel.getRewards().isEmpty()) {
                  playerActivityDao.activitySpringFestivalData.prays.put(customizeGiftBagModel.getId(), MiscUtil.comboInteger(0, 0));
                  playerActivityDao.updateOp();
               }
            }

            centreAwardType = CentreAwardModel.TYPE_SPRING_FESTIVAL_BLESS_REWARD;
         }

         if (num > 0L) {
            int delStar = 0;

            for(Map.Entry<Integer, Long> entry : playerActivityDao.activitySpringFestivalData.prays.entrySet()) {
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
      playerActivityDao.activitySpringFestivalData.dailyReset();
      playerActivityDao.updateOp();
      if (!this.isServerActivityInvalid()) {
         if (this.getSeverActivityDay() != 1) {
            SpringFestivalTaskPart springFestivalTaskPart = (SpringFestivalTaskPart)this.player.getMgrPart(SpringFestivalTaskPart.class);
            springFestivalTaskPart.trigger();
            this.sendInfo();
         }
      }
   }

   public void sendInfo() {
      this.sendMain();
      this.sendGiftBoxMain();
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

   public List<ResourceModel> getEndSaleResourceList(int activityId) {
      List<ResourceModel> resourceModelList = new ArrayList();
      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
      if (activityInfo != null && activityInfo.end <= DateUtil.getIntTime(System.currentTimeMillis()) && activityId == activityInfo.id) {
         Map<Integer, TreeMap<Integer, CustomizeGiftBagModel>> allModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CustomizeGiftBagModel>>getModelPoolMap("customCustomizeGiftBag");
         TreeMap<Integer, CustomizeGiftBagModel> springFestivalModelMap = MapUtil.getOrDefault(allModelMap, activityId, TreeMap.class);
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         int blessingGiftBag = ApplicationContextProvider.getConfigInt("blessingGiftBag", 0);

         for(Map.Entry<Integer, Long> entry : playerActivityDao.activitySpringFestivalData.prays.entrySet()) {
            int customId = (Integer)entry.getKey();
            if (customId != (Integer)springFestivalModelMap.lastKey()) {
               long value = (Long)entry.getValue();
               CustomizeGiftBagModel customizeGiftBagModel = (CustomizeGiftBagModel)springFestivalModelMap.get(customId);
               if (customizeGiftBagModel != null) {
                  SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", (Integer)customizeGiftBagModel.getGroup().get(1));
                  if (specificGroupModel != null) {
                     int itemIndex = 0;
                     if (MiscUtil.getHiParam(value) == 1) {
                        itemIndex = MiscUtil.getLowParam(value);
                     }

                     if (specificGroupModel.getRewards() != null && specificGroupModel.getRewards().size() > itemIndex) {
                        ResourceModel resourceModel = ((ResourceModel)specificGroupModel.getRewards().get(itemIndex)).clone();
                        resourceModel.setValue(resourceModel.getValue() * blessingGiftBag);
                        resourceModelList.add(resourceModel);
                     }
                  }
               }
            }
         }

         return resourceModelList;
      } else {
         return resourceModelList;
      }
   }

   private void sendGiftBoxMain() {
      SpringFestivalTaskPart springFestivalTaskPart = (SpringFestivalTaskPart)this.player.getMgrPart(SpringFestivalTaskPart.class);
      SpringFestivalMsg.S2C_GiftBoxMain_12414.Builder resp = SpringFestivalMsg.S2C_GiftBoxMain_12414.newBuilder();
      resp.setGotGiftBox(springFestivalTaskPart.getGotGiftCount());

      for(TaskData taskData : springFestivalTaskPart.getTasksMap().values()) {
         resp.addTask(springFestivalTaskPart.buildTask(taskData));
      }

      this.player.sendMsg(resp.build());
   }

   private void sendPrayMain() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      SpringFestivalMsg.S2C_PrayMain_12420.Builder resp = SpringFestivalMsg.S2C_PrayMain_12420.newBuilder();

      for(Map.Entry<Integer, Long> entry : playerActivityDao.activitySpringFestivalData.prays.entrySet()) {
         int itemIndex = MiscUtil.getLowParam((Long)entry.getValue());
         boolean isGot = MiscUtil.getHiParam((Long)entry.getValue()) == 1;
         SpringFestivalMsg.PrayData.Builder prayData = SpringFestivalMsg.PrayData.newBuilder();
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

   private void sendMain() {
      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
      SpringFestivalMsg.S2C_EnvelopeMain_12402.Builder msg = SpringFestivalMsg.S2C_EnvelopeMain_12402.newBuilder();
      msg.setEndTime(activityInfo == null ? 0 : activityInfo.end);
      this.player.sendMsg(msg.build());
   }

   public int getActivityType() {
      return 14;
   }

   public void buySupperGift(List<ResourceModel> resourceModels) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      if (!playerActivityDao.activitySpringFestivalData.superBox.isEmpty() && !giftPart.getBuyGifts(21).isEmpty()) {
         resourceModels.addAll(playerActivityDao.activitySpringFestivalData.superBox);
         playerActivityDao.activitySpringFestivalData.superBox.clear();
         playerActivityDao.updateOp();
      }

      this.sendGiftBoxMain();
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
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      giftPart.clearGifts(19);
      giftPart.clearGifts(21);
      this.clearActivityGift(5);
      this.clearActivityGift(24);
      if (!mainOpen) {
         SpringFestivalTaskPart springFestivalTaskPart = (SpringFestivalTaskPart)this.player.getMgrPart(SpringFestivalTaskPart.class);
         springFestivalTaskPart.giftReward();
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
            if (playerActivityDao.activitySpringFestivalData.prays.isEmpty()) {
               Map<Integer, Map<Integer, CustomizeGiftBagModel>> allModelMap = ApplicationContextProvider.<Integer, Map<Integer, CustomizeGiftBagModel>>getModelPoolMap("customCustomizeGiftBag");

               for(CustomizeGiftBagModel customizeGiftBagModel : ((Map)MapUtil.getOrDefault(allModelMap, activityInfo.id, TreeMap.class)).values()) {
                  SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", (Integer)customizeGiftBagModel.getGroup().get(1));
                  if (specificGroupModel != null && specificGroupModel.getRewards() != null && !specificGroupModel.getRewards().isEmpty()) {
                     playerActivityDao.activitySpringFestivalData.prays.put(customizeGiftBagModel.getId(), MiscUtil.comboInteger(0, 0));
                     playerActivityDao.updateOp();
                  }
               }

               centreAwardType = CentreAwardModel.TYPE_SPRING_FESTIVAL_BLESS_REWARD;
            }

            for(Map.Entry<Integer, Long> entry : playerActivityDao.activitySpringFestivalData.prays.entrySet()) {
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
            taskCustomCache.delete(springFestivalTaskPart.getModule());
            ActivityPart activityPart = (ActivityPart)this.player.getMgrPart(ActivityPart.class);
            activityPart.liYuReward(activityInfo.id, true, false);
            playerActivityDao.activities.remove(this.getActivityType());
            playerActivityDao.updateOp();
         }
      }
   }
}
