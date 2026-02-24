package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.ActivityAnniversaryCelebrationDao;
import com.gzbz.db.ActivityEventHeroDao;
import com.gzbz.db.ActivityGuoQingDao;
import com.gzbz.db.ActivityLaborDayDao;
import com.gzbz.db.ActivitySplendidCityDao;
import com.gzbz.db.ActivityZongQingDao;
import com.gzbz.db.FlowerFireDao;
import com.gzbz.db.MonarchDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.mergeActivity.MergeActivityMgr;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.ActivityRuleModel;
import com.gzbz.model.ActivityShopModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.LiYuRewardModel;
import com.gzbz.model.PlayerProperty;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.ShopMsg;
import com.gzbz.protobuf.ThemeActivityMsg;
import com.gzbz.shop.ShopHelper;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
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
import misc.ComparatorUtil;
import misc.DateUtil;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ActivityPart extends PlayerPart {
   private final ActivityMgr activityMgr;
   private final WorldMgr worldMgr;
   private final Set<Integer> updateActivities = new HashSet();
   private Map<Integer, AbstractActivityPart> activityPartMap = new HashMap();

   public ActivityPart(ActivityMgr activityMgr, WorldMgr worldMgr) {
      this.activityMgr = activityMgr;
      this.worldMgr = worldMgr;
   }

   public void initActivityPart() {
      if (this.activityPartMap.isEmpty()) {
         for(AbstractActivityPart activityPart : this.player.getMgrParts(AbstractActivityPart.class)) {
            if (activityPart.getActivityType() > 0) {
               this.activityPartMap.put(activityPart.getActivityType(), activityPart);
            }
         }
      }

   }

   @MsgHandlerAnno
   public void C2S_ActivityShopInfo_6725(ActivityMsg.C2S_ActivityShopInfo_6725 msg, String source) {
      PlayerActivityDao playerActivityDao = null;
      int endTime = 0;
      int activityId = 0;
      if (msg.getActivityType() == 8002) {
         MergeActivityMgr mergeActivityMgr = (MergeActivityMgr)ApplicationContextProvider.getContext().getBean(MergeActivityMgr.class);
         if (!mergeActivityMgr.isMergeActivityOpening()) {
            return;
         }

         playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         endTime = (int)(mergeActivityMgr.getMergeActivityEndTime() / 1000L);
         activityId = 3350;
      } else {
         playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         ActivityInfo activityInfo = (ActivityInfo)MapUtil.getOrDefault(playerActivityDao.activities, msg.getActivityType(), ActivityInfo.class);
         if (activityInfo == null || activityInfo.id == 0 || !activityInfo.open) {
            return;
         }

         endTime = activityInfo.end;
         activityId = activityInfo.id;
      }

      ActivityMsg.S2C_ActivityShopResult_6726.Builder resp = ActivityMsg.S2C_ActivityShopResult_6726.newBuilder();

      for(Map.Entry<Integer, Integer> entry : playerActivityDao.shopItems.entrySet()) {
         Integer buyId = (Integer)entry.getKey();
         Integer num = (Integer)entry.getValue();
         ActivityShopModel activityShopModel = (ActivityShopModel)ApplicationContextProvider.getModelPoolEntity("activityShop", buyId);
         if (activityShopModel != null && activityShopModel.getActivityId() == activityId) {
            resp.addBuyItems(ShopHelper.builder(buyId, num));
         }
      }

      this.checkHaveHead(msg.getActivityType(), playerActivityDao, resp);
      resp.setActivityType(msg.getActivityType());
      resp.setEndTime(endTime);
      resp.setActivityId(activityId);
      this.player.sendMsg(resp.build());
   }

   public void checkHaveHead(int activityType, PlayerActivityDao playerActivityDao, ActivityMsg.S2C_ActivityShopResult_6726.Builder resp) {
      if (activityType == 24 || activityType == 44) {
         MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
         Map<Integer, ActivityShopModel> modelMap = this.player.getGameModelPool().getMap("activityShop");

         for(ActivityShopModel model : modelMap.values()) {
            if (model.getRepeatPurchase() == 1 && model.getActivityType() == activityType && !playerActivityDao.shopItems.containsKey(model.getId()) && monarchDao.heads.contains(model.getItemId())) {
               resp.addBuyItems(ShopHelper.builder(model.getId(), 1));
            }

            if (model.getRepeatPurchase() == 2 && model.getActivityType() == activityType && !playerActivityDao.shopItems.containsKey(model.getId()) && monarchDao.headFrames.containsKey(model.getItemId())) {
               resp.addBuyItems(ShopHelper.builder(model.getId(), 1));
            }
         }
      }

   }

   @MsgHandlerAnno
   public void C2S_ActivityShopBuy_6727(ActivityMsg.C2S_ActivityShopBuy_6727 msg, String source) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      int activityId;
      if (msg.getActivityType() == 8002) {
         MergeActivityMgr mergeActivityMgr = (MergeActivityMgr)ApplicationContextProvider.getContext().getBean(MergeActivityMgr.class);
         if (!mergeActivityMgr.isMergeActivityOpening()) {
            return;
         }

         activityId = 3350;
      } else {
         ActivityInfo activityInfo = (ActivityInfo)MapUtil.getOrDefault(playerActivityDao.activities, msg.getActivityType(), ActivityInfo.class);
         if (activityInfo == null || activityInfo.id == 0 || !activityInfo.open) {
            this.player.failure(8007);
            return;
         }

         activityId = activityInfo.id;
      }

      ShopMsg.BuyItem buyItem = msg.getBuyItem();
      ActivityShopModel activityShopModel = (ActivityShopModel)ApplicationContextProvider.getModelPoolEntity("activityShop", buyItem.getBuyId());
      if (activityShopModel == null) {
         this.player.failure(0);
      } else {
         if (activityShopModel.getOpenTime() != 0 && activityShopModel.getEndTime() != 0) {
            int openServerDays = this.worldMgr.getOpenServerDays();
            if (msg.getActivityType() == 108 || msg.getActivityType() == 34) {
               AbstractActivityPart abstractActivityPart = (AbstractActivityPart)this.getActivityPartMap().get(msg.getActivityType());
               openServerDays = abstractActivityPart.getCrossActOpenDay();
               if (openServerDays < 0) {
                  this.player.failure(76502);
                  return;
               }
            }

            boolean min = openServerDays >= activityShopModel.getOpenTime();
            boolean max = activityShopModel.getEndTime() == -1 || openServerDays <= activityShopModel.getEndTime();
            if (!min || !max) {
               this.player.failure(76502);
               return;
            }
         }

         if (msg.getActivityType() == 82) {
            ActivityEventHeroDao eventHeroDao = (ActivityEventHeroDao)this.player.getData("tb_activity_event_hero", this.player.getPlayerId());
            if (eventHeroDao.mainId != activityShopModel.getShopType()) {
               this.player.failure(8007);
               return;
            }
         }

         if (buyItem.getBuyNum() <= 0) {
            this.player.failure(4);
         } else {
            int alreadyBuy = (Integer)MapUtil.getOrDefault(playerActivityDao.shopItems, buyItem.getBuyId(), 0);
            if (activityShopModel.getQuota() != 0 && alreadyBuy + buyItem.getBuyNum() > activityShopModel.getQuota()) {
               this.player.failure(25);
            } else if (!ResourceModel.checkTotalNumError(activityShopModel.getExchangeNum(), buyItem.getBuyNum())) {
               List<ResourceModel> feeResourceList = new ArrayList();
               feeResourceList.add(new ResourceModel(activityShopModel.getExchangeType(), activityShopModel.getExchangeId(), activityShopModel.getExchangeNum() * buyItem.getBuyNum()));
               if (activityShopModel.getExchangeType1() > 0 && activityShopModel.getExchangeId1() > 0 && activityShopModel.getExchangeNum1() > 0) {
                  if (ResourceModel.checkTotalNumError(activityShopModel.getExchangeNum1(), buyItem.getBuyNum())) {
                     return;
                  }

                  feeResourceList.add(new ResourceModel(activityShopModel.getExchangeType1(), activityShopModel.getExchangeId1(), activityShopModel.getExchangeNum1() * buyItem.getBuyNum()));
               }

               if (!this.player.checkResourceNum(feeResourceList)) {
                  this.player.failure(34);
               } else {
                  this.player.delResource((List)feeResourceList, 8, 806, buyItem.getBuyId(), buyItem.getBuyNum(), activityId + "");
                  playerActivityDao.shopItems.put(buyItem.getBuyId(), alreadyBuy + buyItem.getBuyNum());
                  playerActivityDao.updateOp();
                  this.player.addResource(activityShopModel.getItemType(), activityShopModel.getItemId(), activityShopModel.getItemNum() * buyItem.getBuyNum(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 806, buyItem.getBuyId(), buyItem.getBuyNum(), activityId + "");
                  ActivityMsg.S2C_ActivityShopBuyResult_6728.Builder resp = ActivityMsg.S2C_ActivityShopBuyResult_6728.newBuilder();
                  resp.setBuyItem(buyItem);
                  resp.setActivityType(msg.getActivityType());
                  this.player.sendMsg(resp.build());
                  ActivityRuleModel activityRuleModel = (ActivityRuleModel)ApplicationContextProvider.getModelPoolEntity("activityRule", msg.getActivityType());
                  String buyName = "未知";
                  StringBuilder exchangeName = new StringBuilder();
                  StringBuilder fee = new StringBuilder();
                  if (activityShopModel.getItemType() == 1) {
                     PlayerProperty playerProperty = (PlayerProperty)ApplicationContextProvider.getModelPoolEntity("playerProperty", activityShopModel.getItemId());
                     if (playerProperty != null) {
                        buyName = playerProperty.getName();
                     }
                  } else if (activityShopModel.getItemType() == 2) {
                     ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", activityShopModel.getItemId());
                     if (itemModel != null) {
                        buyName = itemModel.getName();
                     }
                  }

                  for(ResourceModel resourceModel : feeResourceList) {
                     if (resourceModel.getType() == 1) {
                        PlayerProperty playerProperty = (PlayerProperty)ApplicationContextProvider.getModelPoolEntity("playerProperty", resourceModel.getId());
                        if (playerProperty != null) {
                           exchangeName.append(playerProperty.getName()).append(",");
                        }
                     } else if (resourceModel.getType() == 2) {
                        ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", resourceModel.getId());
                        if (itemModel != null) {
                           exchangeName.append(itemModel.getName()).append(",");
                        }
                     }

                     fee.append(resourceModel.getValue()).append(",");
                  }

                  if (exchangeName.length() > 0 && fee.length() > 0) {
                     exchangeName.deleteCharAt(exchangeName.length() - 1);
                     fee.deleteCharAt(fee.length() - 1);
                     this.player.getOperationMgr().addExtraLog(this.player, 193, activityRuleModel.getName() + "兑换商店", String.valueOf(buyItem.getBuyId()), buyName, String.valueOf(buyItem.getBuyNum() * activityShopModel.getItemNum()), exchangeName.toString(), fee.toString(), String.valueOf(this.player.getResourceNum(activityShopModel.getExchangeType(), activityShopModel.getExchangeId())));
                  } else {
                     this.logger.error("无法获取玩家{}兑换日志,兑换id:{},兑换数量:{}", new Object[]{this.player.getPlayerId(), msg.getBuyItem().getBuyId(), msg.getBuyItem().getBuyNum()});
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_LiYuInfo_12931(ThemeActivityMsg.C2S_LiYuInfo_12931 msg, String source) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      ActivityInfo activityInfo = (ActivityInfo)MapUtil.getOrDefault(playerActivityDao.activities, msg.getActivityType(), ActivityInfo.class);
      if (activityInfo != null && activityInfo.id != 0) {
         ThemeActivityMsg.S2C_LiYuInfo_12932.Builder resp = ThemeActivityMsg.S2C_LiYuInfo_12932.newBuilder();
         resp.setLastReward((Integer)MapUtil.getOrDefault(playerActivityDao.liYuReward, msg.getActivityType(), 0));
         resp.setActivityId(activityInfo.id);
         this.player.sendMsg(resp.build());
      } else {
         this.player.failure(8007);
      }
   }

   @MsgHandlerAnno
   public void C2S_LiYuReward_12933(ThemeActivityMsg.C2S_LiYuReward_12933 msg, String source) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      ActivityInfo activityInfo = (ActivityInfo)playerActivityDao.activities.get(msg.getActivityType());
      if (activityInfo != null && activityInfo.id != 0) {
         if (!this.liYuReward(activityInfo.id, false, true)) {
            this.player.failure(0);
         } else {
            ThemeActivityMsg.S2C_LiYuReward_12934.Builder resp = ThemeActivityMsg.S2C_LiYuReward_12934.newBuilder();
            resp.setLastReward((Integer)MapUtil.getOrDefault(playerActivityDao.liYuReward, msg.getActivityType(), 0));
            resp.setActivityId(activityInfo.id);
            this.player.sendMsg(resp.build());
         }
      } else {
         this.player.failure(8007);
      }
   }

   @MsgHandlerAnno
   public void C2S_LiYuBuyPoint_12935(ThemeActivityMsg.C2S_LiYuBuyPoint_12935 msg, String source) {
      if (msg.getNum() <= 0) {
         this.player.failure(4);
      } else {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         ActivityInfo activityInfo = (ActivityInfo)MapUtil.getOrDefault(playerActivityDao.activities, msg.getActivityType(), ActivityInfo.class);
         if (activityInfo != null && activityInfo.id != 0) {
            TreeMap<Integer, LiYuRewardModel> liYuRewardModelMap = (TreeMap)ApplicationContextProvider.getModelPoolEntity("customLiyuReward", activityInfo.id);
            if (liYuRewardModelMap == null) {
               this.player.failure(0);
            } else if (!DateUtil.isSameDay((long)activityInfo.end * 1000L)) {
               this.player.failure(0);
            } else {
               String liYuPointStr = ApplicationContextProvider.getConfigString("liyuPoint", "");
               List<ResourceModel> resourceModels = ResourceModel.buildResources(liYuPointStr);
               ResourceModel pointResourceModel = (ResourceModel)resourceModels.get(0);
               ResourceModel feeResourceModel = (ResourceModel)resourceModels.get(1);
               int curPoint = (int)this.player.getResourceNum(pointResourceModel.getType(), pointResourceModel.getId());
               if (msg.getNum() > ((LiYuRewardModel)liYuRewardModelMap.lastEntry().getValue()).getPointValue() - curPoint) {
                  this.player.failure(25);
               } else {
                  feeResourceModel.setValue(feeResourceModel.getValue() * msg.getNum());
                  if (!this.player.checkResourceNum(feeResourceModel)) {
                     this.player.failure(31);
                  } else {
                     this.player.delResource(feeResourceModel, 8, 866, msg.getActivityType(), msg.getNum(), "");
                     pointResourceModel.setValue(msg.getNum());
                     this.player.addResource(pointResourceModel, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 8, 866, msg.getActivityType(), msg.getNum(), "");
                     ThemeActivityMsg.S2C_LiYuBuyPoint_12936.Builder resp = ThemeActivityMsg.S2C_LiYuBuyPoint_12936.newBuilder();
                     resp.setActivityId(activityInfo.id);
                     resp.setNum(msg.getNum());
                     this.player.sendMsg(resp.build());
                  }
               }
            }
         } else {
            this.player.failure(8007);
         }
      }
   }

   public boolean liYuReward(int activityId, boolean isMail, boolean checkPoint) {
      ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityId);
      if (activityOpenTimeModel == null) {
         return false;
      } else {
         TreeMap<Integer, LiYuRewardModel> liYuRewardModelMap = (TreeMap)ApplicationContextProvider.getModelPoolEntity("customLiyuReward", activityId);
         if (liYuRewardModelMap == null) {
            return false;
         } else {
            GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
            boolean isSuper = !giftPart.getBuyGifts(26, activityId).isEmpty();
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            int curId = (Integer)MapUtil.getOrDefault(playerActivityDao.liYuReward, activityOpenTimeModel.getActivityType(), 0);
            List<ResourceModel> resourceModels = null;
            StringBuilder stringBuilder = new StringBuilder();

            for(LiYuRewardModel liYuRewardModel : liYuRewardModelMap.values()) {
               if (curId < liYuRewardModel.getId()) {
                  if (checkPoint && !this.player.checkResourceNum(liYuRewardModel.getPointType(), liYuRewardModel.getPointId(), liYuRewardModel.getPointValue())) {
                     break;
                  }

                  if (resourceModels == null) {
                     resourceModels = new ArrayList();
                  }

                  stringBuilder.setLength(0);

                  for(ResourceModel resourceModel : liYuRewardModel.getReward()) {
                     resourceModel.addResourceToList(resourceModels);
                     stringBuilder.append(resourceModel.getId()).append(":").append(resourceModel.getValue()).append(",");
                  }

                  if (stringBuilder.length() > 0) {
                     this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, activityId, "宴请礼盒", "精英礼盒-" + liYuRewardModel.getPointValue(), stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString(), 0, 0, 0);
                  }

                  if (isSuper) {
                     stringBuilder.setLength(0);

                     for(ResourceModel resourceModel : liYuRewardModel.getUnloadReward()) {
                        resourceModel.addResourceToList(resourceModels);
                        stringBuilder.append(resourceModel.getId()).append(":").append(resourceModel.getValue()).append(",");
                     }

                     if (stringBuilder.length() > 0) {
                        this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, activityId, "宴请礼盒", "至尊礼遇-" + liYuRewardModel.getPointValue(), stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString(), 0, 0, 0);
                     }
                  }

                  curId = liYuRewardModel.getId();
               }
            }

            if (resourceModels != null && !resourceModels.isEmpty()) {
               if (isMail) {
                  Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
                  TreeMap<Integer, CentreAwardModel> liYuMailMap = (TreeMap)allAwardModelMap.get(CentreAwardModel.LI_YU);
                  MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, ((CentreAwardModel)liYuMailMap.firstEntry().getValue()).getTitle(), ((CentreAwardModel)liYuMailMap.firstEntry().getValue()).getDesc(), resourceModels, 604800000L, 8, 865);
               } else {
                  this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 865, (Integer)MapUtil.getOrDefault(playerActivityDao.liYuReward, activityOpenTimeModel.getActivityType(), 0), curId, "");
               }

               playerActivityDao.liYuReward.put(activityOpenTimeModel.getActivityType(), curId);
               playerActivityDao.updateOp();
            }

            return true;
         }
      }
   }

   public void buyLiYuGift(ShopLimitModel shopLimitModel, List<ResourceModel> resourceModels) {
      ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", shopLimitModel.getActivityId());
      if (activityOpenTimeModel == null) {
         this.logger.error("玩家:{}至尊礼遇礼包发放奖励失败,活动{}配置不存在", this.player.getPlayerId(), shopLimitModel.getActivityId());
      } else {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         int activityId = ((ActivityInfo)MapUtil.getOrDefault(playerActivityDao.activities, activityOpenTimeModel.getActivityType(), ActivityInfo.class)).id;
         if (activityId != activityOpenTimeModel.getActivityId()) {
            this.logger.error("玩家:{}至尊礼遇礼包发放奖励失败,活动类型{}当前开启活动{}跟配置活动{}不一致", new Object[]{this.player.getPlayerId(), activityOpenTimeModel.getActivityType(), activityId, activityOpenTimeModel.getActivityId()});
         } else {
            GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
            if (giftPart.getBuyGifts(26, activityId).isEmpty()) {
               this.logger.error("玩家:{}至尊礼遇礼包发放奖励失败,未购买至尊礼遇礼包", this.player.getPlayerId());
            } else {
               TreeMap<Integer, LiYuRewardModel> liYuRewardModelMap = (TreeMap)ApplicationContextProvider.getModelPoolEntity("customLiyuReward", activityId);
               if (liYuRewardModelMap != null && !liYuRewardModelMap.isEmpty()) {
                  int lastReward = (Integer)MapUtil.getOrDefault(playerActivityDao.liYuReward, activityOpenTimeModel.getActivityType(), 0);
                  if (lastReward > 0) {
                     StringBuilder stringBuilder = new StringBuilder();

                     for(LiYuRewardModel liYuRewardModel : liYuRewardModelMap.values()) {
                        stringBuilder.setLength(0);

                        for(ResourceModel resourceModel : liYuRewardModel.getUnloadReward()) {
                           resourceModel.addResourceToList(resourceModels);
                           stringBuilder.append(resourceModel.getId()).append(":").append(resourceModel.getValue()).append(",");
                        }

                        if (stringBuilder.length() > 0) {
                           this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, activityId, "宴请礼盒", "至尊礼遇-" + liYuRewardModel.getPointValue(), stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString(), 0, 0, 0);
                        }

                        if (lastReward <= liYuRewardModel.getId()) {
                           break;
                        }
                     }

                     playerActivityDao.updateOp();
                  }
               } else {
                  this.logger.error("玩家:{}至尊礼遇礼包发放奖励失败,活动{}礼遇奖励配置不存在", this.player.getPlayerId(), activityId);
               }
            }
         }
      }
   }

   public List<ResourceModel> activityDrop(int minute) {
      List<ResourceModel> dropResourceList = new ArrayList();

      for(AbstractActivityPart activityPart : this.player.getMgrParts(AbstractActivityPart.class)) {
         ResourceModel dropResource = activityPart.activityDrop(minute);
         if (dropResource != null) {
            dropResourceList.add(dropResource);
         }
      }

      return dropResourceList;
   }

   public void loginHandle() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());

      for(int activityType : playerActivityDao.activities.keySet()) {
         ActivityInfo activityInfo = (ActivityInfo)playerActivityDao.activities.get(activityType);
         if (activityInfo != null && activityInfo.id == 0) {
            playerActivityDao.activities.remove(activityType);
            playerActivityDao.updateOp();
         }
      }

      this.timeRotateReset(true);
      this.sendActivityIds();
   }

   public boolean loginHandleAsync() {
      return true;
   }

   public void resetDaily() {
      this.timeRotateReset(false);
   }

   @TaskMethod
   public void timeRotateReset(boolean isLogin) {
      this.updateActivities.clear();
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      Map<Integer, TreeMap<Integer, ActivityOpenTimeModel>> activityAllMap = ApplicationContextProvider.<Integer, TreeMap<Integer, ActivityOpenTimeModel>>getModelPoolMap("customActivityOpenTime");
      Map<Integer, ActivityRuleModel> activityRuleModelMap = ApplicationContextProvider.<Integer, ActivityRuleModel>getModelPoolMap("activityRule");
      Map<Integer, Integer> existActivityMap = new HashMap();

      for(ActivityInfo activityInfo : playerActivityDao.activities.values()) {
         if (activityInfo.id > 0) {
            ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityInfo.id);
            if (activityOpenTimeModel != null && activityOpenTimeModel.getSameTypeActivity() > 0 && activityInfo.end > curTime && activityInfo.open) {
               existActivityMap.put(activityOpenTimeModel.getSameTypeActivity(), activityInfo.id);
            }
         }
      }

      for(ActivityRuleModel activityRuleModel : activityRuleModelMap.values()) {
         try {
            TreeMap<Integer, ActivityOpenTimeModel> activityMap = MapUtil.getOrDefault(activityAllMap, activityRuleModel.getActivityType(), TreeMap.class);
            if (activityMap != null && !activityMap.isEmpty()) {
               ActivityInfo playerActivity = (ActivityInfo)playerActivityDao.activities.get(activityRuleModel.getActivityType());
               if (playerActivity != null && playerActivity.id == 0) {
                  playerActivityDao.activities.remove(activityRuleModel.getActivityType());
                  playerActivity = null;
                  playerActivityDao.updateOp();
               }

               ActivityOpenTimeModel oldModel = null;
               if (playerActivity != null) {
                  if (!activityMap.containsKey(playerActivity.id)) {
                     this.activityInvalid(activityRuleModel.getActivityType(), playerActivityDao.activities);
                  } else {
                     oldModel = (ActivityOpenTimeModel)activityMap.get(playerActivity.id);
                  }
               }

               if (activityRuleModel.getRotationRule() == 2) {
                  this.checkActivityByServer(activityRuleModel, oldModel, existActivityMap);
               } else {
                  this.checkActivityByPlayer(activityRuleModel, oldModel, existActivityMap);
               }
            } else {
               this.activityInvalid(activityRuleModel.getActivityType(), playerActivityDao.activities);
            }
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

      if (!this.updateActivities.isEmpty()) {
         playerActivityDao.updateOp();
         if (!isLogin) {
            this.sendActivityIds();

            for(int activityType : this.updateActivities) {
               this.sendInfo(activityType);
            }
         }
      }

   }

   @TaskMethod
   public void activityEndOfflineHandle(Set<Integer> activities) {
      if (!this.player.isLogin()) {
         if (activities != null && !activities.isEmpty()) {
            for(int activityId : activities) {
               try {
                  ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityId);
                  if (activityOpenTimeModel != null && ActivityMgr.NEED_OFFLINE_HANDLE_ACTIVITY.contains(activityOpenTimeModel.getActivityType())) {
                     ActivityRuleModel activityRuleModel = (ActivityRuleModel)ApplicationContextProvider.getModelPoolEntity("activityRule", activityOpenTimeModel.getActivityType());
                     if (activityRuleModel != null && activityRuleModel.getRotationRule() == 2) {
                        AbstractActivityPart activityPart = (AbstractActivityPart)this.getActivityPartMap().get(activityRuleModel.getActivityType());
                        if (activityPart != null) {
                           PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
                           ActivityInfo playerActivity = (ActivityInfo)playerActivityDao.activities.get(activityRuleModel.getActivityType());
                           if (playerActivity != null && playerActivity.id != 0 && playerActivity.open) {
                              playerActivity.open = false;
                              activityPart.activityEnd(activityOpenTimeModel.getActivityId());
                              this.liYuReward(activityOpenTimeModel.getActivityId(), true, true);
                              playerActivityDao.updateOp();
                              this.logger.info("玩家{},参加全服活动【{}】已结束", this.player.getPlayerId(), activityOpenTimeModel.getTips());
                           }
                        }
                     }
                  }
               } catch (Exception e) {
                  e.printStackTrace();
               }
            }

         }
      }
   }

   public void rotateReset(ActivityRuleModel activityRuleModel, int oldActivityId) {
      AbstractActivityPart activityPart = (AbstractActivityPart)this.getActivityPartMap().get(activityRuleModel.getActivityType());
      if (activityPart != null) {
         int activityId = activityPart.getPlayerActivityId();
         ActivityOpenTimeModel curActivityModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityId);
         if (curActivityModel == null) {
            this.logger.error("活动【{}】配置不存在", activityId);
         } else {
            PlayerDao playerDao = this.player.getPlayerDao();
            if (playerDao.lv > 1 && curActivityModel.getSystemid() > 0) {
               int systemId = curActivityModel.getSystemid();
               String activityName = curActivityModel.getTips();
               if (activityRuleModel.getActivityType() == 5) {
                  systemId = 2200;
                  activityName = activityName.split("-")[0];
               }

               this.player.getOperationMgr().addActivityLog(this.player, systemId, activityName);
            }

            activityPart.rotateReset(oldActivityId);
            if (activityPart.getShopId() > 0) {
               ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
               shopPart.resetShop(5, activityPart.getShopId());
            }

            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            Iterator<Map.Entry<Integer, Integer>> iterator = playerActivityDao.shopItems.entrySet().iterator();

            while(iterator.hasNext()) {
               Map.Entry<Integer, Integer> buyItem = (Map.Entry)iterator.next();
               ActivityShopModel activityShopModel = (ActivityShopModel)ApplicationContextProvider.getModelPoolEntity("activityShop", (Integer)buyItem.getKey());
               if (activityShopModel == null || activityShopModel.getActivityType() == activityRuleModel.getActivityType()) {
                  iterator.remove();
                  playerActivityDao.updateOp();
               }
            }

            if (playerActivityDao.liYuReward.containsKey(activityRuleModel.getActivityType())) {
               playerActivityDao.liYuReward.remove(activityRuleModel.getActivityType());
               playerActivityDao.updateOp();
            }

            GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
            giftPart.removeGiftsByActivityType(26, activityRuleModel.getActivityType());
            Map<Integer, ActivityOpenTimeModel> activityOpenTimeModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customActivityOpenTime", activityRuleModel.getActivityType());
            if (activityOpenTimeModelMap != null) {
               for(ActivityOpenTimeModel activityOpenTimeModel : activityOpenTimeModelMap.values()) {
                  TreeMap<Integer, LiYuRewardModel> liYuRewardModelTreeMap = (TreeMap)ApplicationContextProvider.getModelPoolEntity("customLiyuReward", activityOpenTimeModel.getActivityId());
                  if (liYuRewardModelTreeMap != null && !liYuRewardModelTreeMap.isEmpty()) {
                     LiYuRewardModel liYuRewardModel = (LiYuRewardModel)liYuRewardModelTreeMap.firstEntry().getValue();
                     long num = this.player.getResourceNum(liYuRewardModel.getPointType(), liYuRewardModel.getPointId());
                     if (num > 0L) {
                        this.player.delResource(liYuRewardModel.getPointType(), liYuRewardModel.getPointId(), num, 8, 867, liYuRewardModel.getActivityId(), 0, "");
                     }
                  }
               }
            }

         }
      }
   }

   private void activityEnd(ActivityOpenTimeModel activityOpenTimeModel, ActivityInfo playerActivity) {
      playerActivity.open = false;
      this.updateActivities.add(activityOpenTimeModel.getActivityType());
      AbstractActivityPart activityPart = (AbstractActivityPart)this.getActivityPartMap().get(activityOpenTimeModel.getActivityType());
      if (activityPart != null) {
         activityPart.activityEnd(activityOpenTimeModel.getActivityId());
         this.liYuReward(activityOpenTimeModel.getActivityId(), true, true);
      }
   }

   private void activityInvalid(int activityType, Map<Integer, ActivityInfo> activities) {
      activities.remove(activityType);
      this.updateActivities.add(activityType);
   }

   public void sendActivityIds() {
      ActivityMsg.S2C_ActivityListNotify_6800.Builder msg = ActivityMsg.S2C_ActivityListNotify_6800.newBuilder();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      PlayerDao playerDao = this.player.getPlayerDao();

      for(ActivityInfo activityInfo : playerActivityDao.activities.values()) {
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityInfo.id);
         if (activityOpenTimeModel != null && playerDao.lv >= activityOpenTimeModel.getNeedLevel() && activityInfo.open && activityInfo.start <= curTime && activityInfo.end > curTime) {
            CommonMsg.ActivityData.Builder activityData = CommonMsg.ActivityData.newBuilder();
            activityData.setActivityId(activityInfo.id);
            activityData.setDropTime(activityInfo.drop);
            activityData.setEndTime(activityInfo.end);
            activityData.setStartTime(activityInfo.start);
            activityData.setTimes(Math.max(1, activityInfo.times));
            msg.addActivity(activityData);
         }
      }

      this.player.sendMsg(msg.build());
   }

   private void playerJoinServerActivity(ActivityOpenTimeModel activityOpenTimeModel) {
      ActivityRuleModel activityRuleModel = (ActivityRuleModel)ApplicationContextProvider.getModelPoolEntity("activityRule", activityOpenTimeModel.getActivityType());
      if (activityRuleModel != null && activityRuleModel.getRotationRule() == 2) {
         if (ActivityMgr.NEED_OFFLINE_HANDLE_ACTIVITY.contains(activityOpenTimeModel.getActivityType())) {
            this.activityMgr.pushTaskEx("playerJoinActivity", new Object[]{activityOpenTimeModel.getActivityId(), this.player.getPlayerId()});
         }
      }
   }

   public void sendInfo(int activityType) {
      AbstractActivityPart activityPart = (AbstractActivityPart)this.getActivityPartMap().get(activityType);
      if (activityPart != null) {
         activityPart.sendInfo();
      }
   }

   public void setActivityInfo(ActivityRuleModel activityRuleModel, int activityId, ActivityInfo activityInfo) {
      activityInfo.id = activityId;
      activityInfo.start = DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(System.currentTimeMillis()));
      activityInfo.drop = activityInfo.start + activityRuleModel.getDropTime() - 1;
      activityInfo.end = activityInfo.start + activityRuleModel.getDuration() - 1;
      activityInfo.open = true;
      activityInfo.dropping = true;
      activityInfo.drop = activityInfo.drop < activityInfo.start ? activityInfo.end : activityInfo.drop;
   }

   public void setActivityInfo(ActivityInfo activityInfo, ActivityInfo playerActivity) {
      playerActivity.id = activityInfo.id;
      playerActivity.drop = activityInfo.drop;
      playerActivity.end = activityInfo.end;
      playerActivity.start = activityInfo.start;
      playerActivity.forceClose = activityInfo.forceClose;
      playerActivity.dropping = activityInfo.dropping;
      playerActivity.open = activityInfo.open;
      playerActivity.times = activityInfo.times;
   }

   @TaskMethod
   public void activityArtifactFlagNotify() {
      this.player.notifyPlayerData(PlayerDefine.ACT_ARTIFACT_FLAG, 1);
   }

   private void checkActivityByServer(ActivityRuleModel activityRuleModel, ActivityOpenTimeModel oldModel, Map<Integer, Integer> existActivityMap) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      ActivityInfo activityInfo = this.activityMgr.getActivityInfo(activityRuleModel.getActivityType());
      ActivityInfo playerActivity = (ActivityInfo)playerActivityDao.activities.get(activityRuleModel.getActivityType());
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      if (activityInfo == null) {
         if (playerActivity != null) {
            this.activityInvalid(activityRuleModel.getActivityType(), playerActivityDao.activities);
            this.logger.warn("玩家{},全服活动【{}】当前没有开启,移除活动", this.player.getPlayerId(), activityRuleModel.getName());
         }

      } else {
         ActivityOpenTimeModel serverActivityModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityInfo.id);
         if (serverActivityModel == null) {
            this.logger.error("玩家{}检查全服活动{}配置不存在", this.player.getPlayerId(), activityInfo.id);
         } else {
            if (playerActivity != null) {
               if (oldModel != null) {
                  if (playerActivity.id == activityInfo.id && activityInfo.start == playerActivity.start) {
                     if (!activityInfo.open && playerActivity.open) {
                        this.activityEnd(oldModel, playerActivity);
                        this.logger.info("玩家{},参加全服活动【{}】已结束", this.player.getPlayerId(), oldModel.getTips());
                        playerActivity.forceClose = activityInfo.forceClose;
                     } else if (!playerActivity.open && activityInfo.open && !playerActivity.forceClose) {
                        return;
                     }
                  } else if (playerActivity.open) {
                     this.activityEnd(oldModel, playerActivity);
                     this.logger.info("玩家{},参加全服活动【{}】已结束", this.player.getPlayerId(), oldModel.getTips());
                  }
               } else {
                  this.logger.info("玩家{},参加全服活动【{}】已失效,原活动配置不存在", this.player.getPlayerId(), playerActivity.id);
                  this.activityInvalid(activityRuleModel.getActivityType(), playerActivityDao.activities);
                  playerActivity = null;
               }
            }

            if (playerActivity == null || !playerActivity.open) {
               PlayerDao playerDao = this.player.getPlayerDao();
               if (serverActivityModel.getNeedLevel() <= playerDao.lv) {
                  if (activityInfo.open && curTime >= activityInfo.start && curTime <= activityInfo.end) {
                     playerActivity = (ActivityInfo)MapUtil.computeIfAbsent(playerActivityDao.activities, activityRuleModel.getActivityType(), ActivityInfo.class);
                     this.setActivityInfo(activityInfo, playerActivity);
                     if (existActivityMap.containsKey(serverActivityModel.getSameTypeActivity())) {
                        playerActivity.open = false;
                        playerActivity.dropping = false;
                     } else {
                        this.rotateReset(activityRuleModel, oldModel == null ? 0 : oldModel.getActivityId());
                        this.updateActivities.add(activityRuleModel.getActivityType());
                        this.logger.info("玩家{},参加全服活动【{}】,开始时间:{},掉落结束时间:{},活动结束时间:{},下一轮开启时间:{}", new Object[]{this.player.getPlayerId(), serverActivityModel.getTips(), DateUtil.transferLongToDate((long)playerActivity.start * 1000L), DateUtil.transferLongToDate((long)playerActivity.drop * 1000L), DateUtil.transferLongToDate((long)playerActivity.end * 1000L), DateUtil.transferLongToDate((long)playerActivity.nextTime(activityRuleModel) * 1000L)});
                        this.playerJoinServerActivity(serverActivityModel);
                        if (serverActivityModel.getSameTypeActivity() > 0) {
                           existActivityMap.put(serverActivityModel.getSameTypeActivity(), serverActivityModel.getActivityId());
                        }

                     }
                  }
               }
            }
         }
      }
   }

   private void checkActivityByPlayer(ActivityRuleModel activityRuleModel, ActivityOpenTimeModel oldModel, Map<Integer, Integer> existActivityMap) {
      if (DateUtil.checkTime(this.worldMgr.getOpenServerTime(), activityRuleModel.getOpenTime())) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         List<ActivityOpenTimeModel> openActivityModels = new ArrayList();
         PlayerDao playerDao = this.player.getPlayerDao();
         Map<Integer, TreeMap<Integer, ActivityOpenTimeModel>> activityAllMap = ApplicationContextProvider.<Integer, TreeMap<Integer, ActivityOpenTimeModel>>getModelPoolMap("customActivityOpenTime");
         TreeMap<Integer, ActivityOpenTimeModel> activityMap = MapUtil.getOrDefault(activityAllMap, activityRuleModel.getActivityType(), TreeMap.class);

         for(ActivityOpenTimeModel checkModel : activityMap.values()) {
            if (checkModel.getIsClose() == 0 && playerDao.lv >= checkModel.getNeedLevel() && !this.activityMgr.checkOpenTimeLimit(checkModel.getTips(), checkModel.getLimitTime())) {
               openActivityModels.add(checkModel);
            }
         }

         Collections.sort(openActivityModels, ComparatorUtil.createComparatorByMethod(ActivityOpenTimeModel.class, "getSort"));
         ActivityInfo playerActivity = (ActivityInfo)playerActivityDao.activities.get(activityRuleModel.getActivityType());
         if (playerActivity == null) {
            if (activityRuleModel.getOpenTime() < 0 || openActivityModels.isEmpty()) {
               return;
            }

            if (this.activityMgr.checkOpenTimeLimit(activityRuleModel.getName(), activityRuleModel.getLimitTime())) {
               return;
            }

            ActivityOpenTimeModel firstModel = (ActivityOpenTimeModel)openActivityModels.get(0);
            playerActivity = (ActivityInfo)MapUtil.computeIfAbsent(playerActivityDao.activities, activityRuleModel.getActivityType(), ActivityInfo.class);
            if (!this.checkAndSetActivityInfo(0, activityRuleModel, firstModel, playerActivity, existActivityMap)) {
               playerActivityDao.updateOp();
               return;
            }

            this.logger.info("玩家{},首次参加活动【{}】,开始时间:{},掉落结束时间:{},活动结束时间:{},下一轮开启时间:{}", new Object[]{this.player.getPlayerId(), firstModel.getTips(), DateUtil.transferLongToDate((long)playerActivity.start * 1000L), DateUtil.transferLongToDate((long)playerActivity.drop * 1000L), DateUtil.transferLongToDate((long)playerActivity.end * 1000L), DateUtil.transferLongToDate((long)playerActivity.nextTime(activityRuleModel) * 1000L)});
         } else {
            if (activityRuleModel.getRotateType() == 3) {
               return;
            }

            int activityId = oldModel == null ? 0 : oldModel.getActivityId();
            if (oldModel == null) {
               if (activityRuleModel.getOpenTime() >= 0 && !openActivityModels.isEmpty()) {
                  ActivityOpenTimeModel firstModel = (ActivityOpenTimeModel)openActivityModels.get(0);
                  if (!this.checkAndSetActivityInfo(activityId, activityRuleModel, firstModel, playerActivity, existActivityMap)) {
                     playerActivityDao.updateOp();
                     return;
                  }

                  this.logger.info("玩家{},首次参加的活动{}配置不存在,重新开启新活动【{}】,开始时间:{},掉落结束时间:{},活动结束时间:{},下一轮开启时间:{}", new Object[]{this.player.getPlayerId(), activityId, firstModel.getTips(), DateUtil.transferLongToDate((long)playerActivity.start * 1000L), DateUtil.transferLongToDate((long)playerActivity.drop * 1000L), DateUtil.transferLongToDate((long)playerActivity.end * 1000L), DateUtil.transferLongToDate((long)playerActivity.nextTime(activityRuleModel) * 1000L)});
                  return;
               }

               this.activityInvalid(activityRuleModel.getActivityType(), playerActivityDao.activities);
               return;
            }

            int curTime = DateUtil.getIntTime(System.currentTimeMillis());
            if (playerActivity.open && playerActivity.end <= curTime) {
               this.activityEnd(oldModel, playerActivity);
               this.logger.info("玩家{},参加的活动【{}】已结束", this.player.getPlayerId(), oldModel.getTips());
            }

            if (playerActivity.nextTime(activityRuleModel) <= curTime) {
               if (activityRuleModel.getOpenTime() < 0 || openActivityModels.isEmpty()) {
                  this.activityInvalid(activityRuleModel.getActivityType(), playerActivityDao.activities);
                  return;
               }

               ActivityOpenTimeModel currentOpenActivityModel = null;
               if (activityRuleModel.getRotateType() == 1) {
                  currentOpenActivityModel = (ActivityOpenTimeModel)openActivityModels.get(0);
               }

               for(ActivityOpenTimeModel activityOpenTimeModel : openActivityModels) {
                  if (activityOpenTimeModel.getSort() > oldModel.getSort()) {
                     currentOpenActivityModel = activityOpenTimeModel;
                     break;
                  }
               }

               if (currentOpenActivityModel == null) {
                  return;
               }

               if (!this.checkAndSetActivityInfo(activityId, activityRuleModel, currentOpenActivityModel, playerActivity, existActivityMap)) {
                  playerActivityDao.updateOp();
                  return;
               }

               this.logger.info("玩家{},参与的活动【{}】轮换,开启活动【{}】,开始时间:{},掉落结束时间:{},活动结束时间:{},下一轮开启时间:{}", new Object[]{this.player.getPlayerId(), oldModel.getTips(), currentOpenActivityModel.getTips(), DateUtil.transferLongToDate((long)playerActivity.start * 1000L), DateUtil.transferLongToDate((long)playerActivity.drop * 1000L), DateUtil.transferLongToDate((long)playerActivity.end * 1000L), DateUtil.transferLongToDate((long)playerActivity.nextTime(activityRuleModel) * 1000L)});
            }
         }

      }
   }

   private boolean checkAndSetActivityInfo(int oldActivityId, ActivityRuleModel activityRuleModel, ActivityOpenTimeModel activityOpenTimeModel, ActivityInfo playerActivity, Map<Integer, Integer> existActivityMap) {
      this.setActivityInfo(activityRuleModel, activityOpenTimeModel.getActivityId(), playerActivity);
      if (existActivityMap.containsKey(activityOpenTimeModel.getSameTypeActivity())) {
         playerActivity.open = false;
         playerActivity.dropping = false;
         return false;
      } else {
         this.rotateReset(activityRuleModel, oldActivityId);
         this.updateActivities.add(activityRuleModel.getActivityType());
         if (activityOpenTimeModel.getSameTypeActivity() > 0) {
            existActivityMap.put(activityOpenTimeModel.getSameTypeActivity(), activityOpenTimeModel.getActivityId());
         }

         return true;
      }
   }

   public void levelUp(int preLv, int newLv) {
      this.timeRotateReset(false);
   }

   public Map<Integer, AbstractActivityPart> getActivityPartMap() {
      this.initActivityPart();
      return this.activityPartMap;
   }

   @TaskMethod
   public void resetPersonRankData(int reason) {
      switch (reason) {
         case 8211:
            ActivitySplendidCityDao activitySplendidCityDao = (ActivitySplendidCityDao)this.player.getData("tb_splendid_city", this.player.getPlayerId());
            activitySplendidCityDao.point = 0;
            activitySplendidCityDao.updateOp();
            break;
         case 8311:
            FlowerFireDao flowerFireDao = (FlowerFireDao)this.player.getData("tb_flower_fire", this.player.getPlayerId());
            flowerFireDao.maxDamage = 0L;
            flowerFireDao.updateOp();
            break;
         case 9810:
            ActivityLaborDayDao activityLaborDayDao = (ActivityLaborDayDao)this.player.getData("tb_activity_labor_day", this.player.getPlayerId());
            activityLaborDayDao.point = 0;
            activityLaborDayDao.updateOp();
            break;
         case 10110:
            ActivityZongQingDao activityZongQingDao = (ActivityZongQingDao)this.player.getData("tb_activity_zong_qing", this.player.getPlayerId());
            activityZongQingDao.point = 0;
            activityZongQingDao.updateOp();
            break;
         case 12510:
            ActivityGuoQingDao activityGuoQingDao = (ActivityGuoQingDao)this.player.getData("tb_activity_guo_qing", this.player.getPlayerId());
            activityGuoQingDao.point = 0;
            activityGuoQingDao.updateOp();
            break;
         case 12639:
            ActivityAnniversaryCelebrationDao activityAnniversaryCelebrationDao = (ActivityAnniversaryCelebrationDao)this.player.getData("tb_activity_anniversary_celebration", this.player.getPlayerId());
            activityAnniversaryCelebrationDao.point = 0;
            activityAnniversaryCelebrationDao.updateOp();
      }

   }
}
