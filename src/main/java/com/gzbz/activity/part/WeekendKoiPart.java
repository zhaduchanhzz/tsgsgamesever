package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.lang.WeightRandom;
import cn.hutool.core.util.RandomUtil;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.GiftDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gift.GiftPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ItemModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.PrizePoolModel;
import com.gzbz.model.QualityColorModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.ActivityExtendMsg;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
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
public class WeekendKoiPart extends AbstractActivityPart {
   @Autowired
   private WorldMgr worldMgr;

   @MsgHandlerAnno
   public void C2S_WeekendKoiInfo_6735(ActivityMsg.C2S_WeekendKoiInfo_6735 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_WeekendKoiBlessing_6737(ActivityMsg.C2S_WeekendKoiBlessing_6737 msg, String source) {
      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(7);
      if (activityInfo != null && activityInfo.end >= DateUtil.getIntTime(System.currentTimeMillis())) {
         int blessingCount = msg.getBlessingCount();
         if (blessingCount > 0) {
            int resType;
            int resId;
            int maxBlessing;
            try {
               String[] feeRes = this.getConfigManager().getStr("BlessingConsumption").split("\\|");
               resType = Integer.parseInt(feeRes[0]);
               resId = Integer.parseInt(feeRes[1]);
               maxBlessing = Integer.parseInt(feeRes[2]);
            } catch (Exception e) {
               this.logger.error("周末锦鲤赐福异常:" + e.getMessage());
               this.player.failure(0);
               return;
            }

            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            if (playerActivityDao.weekendKoiBlessing + blessingCount > maxBlessing) {
               this.player.failure(8006);
            } else if (!this.player.checkResourceNum(resType, resId, blessingCount)) {
               this.player.failure(8005);
            } else {
               Map<Integer, PrizePoolModel> finalPrizePoolModels = PrizePoolModel.getPrizePoolByServerOpenTime(this.worldMgr.getOpenServerDays());
               if (finalPrizePoolModels != null && !finalPrizePoolModels.isEmpty()) {
                  List<PrizePoolModel> prizePoolModels = new ArrayList(finalPrizePoolModels.values());
                  List<WeightRandom.WeightObj<Integer>> weightList = new ArrayList();

                  for(PrizePoolModel prizePoolModel : prizePoolModels) {
                     weightList.add(new WeightRandom.WeightObj(prizePoolModel.getId(), (double)prizePoolModel.getOdds()));
                  }

                  WeightRandom<Integer> weightRandom = RandomUtil.weightRandom(weightList);
                  PrizePoolModel prizeModel = (PrizePoolModel)finalPrizePoolModels.get(weightRandom.next());
                  if (prizeModel == null) {
                     this.player.failure(0);
                  } else {
                     this.player.delResource(resType, resId, (long)blessingCount, 8, 808, prizeModel.getId(), 0, "");
                     playerActivityDao.weekendKoiBlessing += blessingCount;
                     playerActivityDao.updateOp();
                     this.player.addResource(prizeModel.getItemType(), prizeModel.getItemId(), prizeModel.getItemNum(), PlayerMsg.ShowType.SHOW_TYPE_WEEKEND_KOI, 8, 808, prizeModel.getId(), 0, "");
                     ActivityMsg.S2C_WeekendKoiBlessingResult_6738.Builder resp = ActivityMsg.S2C_WeekendKoiBlessingResult_6738.newBuilder();
                     resp.setBlessingCount(blessingCount);
                     resp.setBlessingPrize(prizeModel.getId());
                     this.player.sendMsg(resp.build());
                     LogOperationMgr.getLeftNum(this.player, resType, resId);
                     String[] rewardsInfo = LogOperationMgr.toRewardsInfo(new ResourceModel(prizeModel.getItemType(), prizeModel.getItemId(), prizeModel.getItemNum()));
                     this.player.getOperationMgr().addExtraLog(this.player, 198, "周末锦鲤", resId + "", blessingCount + "", rewardsInfo[0], rewardsInfo[2], rewardsInfo[1]);
                     PlayerDao playerDao = this.player.getPlayerDao();
                     if (prizeModel.getIsRecord() > 0) {
                        CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
                        CrossMsg.S2CR_UploadKoiRecord_4222.Builder builder = CrossMsg.S2CR_UploadKoiRecord_4222.newBuilder();
                        builder.setLabel(prizeModel.getLabel());
                        builder.setPlayerName(playerDao.playerName);
                        crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
                     }

                     if (prizeModel.getIsRadio() > 0 && prizeModel.getItemType() == 2) {
                        LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "JinliRadio");
                        if (languageModel != null) {
                           ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", prizeModel.getItemId());
                           if (itemModel != null) {
                              QualityColorModel qualityColorModel = (QualityColorModel)ApplicationContextProvider.getModelPoolEntity("qualityColor", itemModel.getQuality());
                              if (qualityColorModel != null) {
                                 String format = MessageFormat.format(languageModel.getValue(), playerDao.playerName, qualityColorModel.getColor(), itemModel.getName() + "x" + prizeModel.getItemNum());
                                 ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
                                 chatMgr.pushTaskEx("sendSystem", new Object[]{4, 2, this.player.getPlayerId(), playerDao.playerName, format});
                                 chatMgr.pushTaskEx("sendSystem", new Object[]{4, 5, this.player.getPlayerId(), playerDao.playerName, format});
                              }
                           }
                        }
                     }

                  }
               } else {
                  this.player.failure(0);
               }
            }
         }
      } else {
         this.player.failure(8007);
      }
   }

   @MsgHandlerAnno
   public void C2S_WeekendKoiBuy_6739(ActivityMsg.C2S_WeekendKoiBuy_6739 msg, String source) {
      int buyId = msg.getBuyId();
      int result = this.checkAndBuy(buyId, 809);
      if (result != 1) {
         this.player.failure(result);
      } else {
         this.sendBuyResult(buyId);
      }
   }

   @MsgHandlerAnno
   public void C2S_KoiRecordList_19905(ActivityExtendMsg.C2S_KoiRecordList_19905 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      if (!crossNettyClient.isLogin()) {
         this.player.failure(76022);
      } else {
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
      }
   }

   public void afterBuy(int buyId) {
      ActivityMgr activityMgr = this.getActivityMgr();
      activityMgr.pushTaskEx("weekendKoiBuy", new Object[]{this.player.getPlayerId()});
      this.sendBuyResult(buyId);
   }

   public int buyCount() {
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      Map<Integer, GiftDao> giftDaoMap = giftPart.getBuyGifts(6);
      return giftDaoMap == null ? 0 : giftDaoMap.size();
   }

   public void sendInfo() {
      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
      if (activityInfo != null && activityInfo.id != 0 && activityInfo.end > DateUtil.getIntTime(System.currentTimeMillis())) {
         ActivityMsg.S2C_WeekendKoiResult_6736.Builder resp = ActivityMsg.S2C_WeekendKoiResult_6736.newBuilder();
         resp.setActivityId(0);
         resp.setBuyCount(0);
         resp.setPlayerName(this.getActivityMgr().getWeekendKoiWinner());
         resp.setBuyEndTime(activityInfo.drop - ApplicationContextProvider.getConfigInt("fishFinishTime", 1800));
         resp.setEndTime(activityInfo.end);
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         resp.setBlessingCount(playerActivityDao.weekendKoiBlessing);
         this.player.sendMsg(resp.build());
      }
   }

   public int getActivityType() {
      return 7;
   }

   public void rotateReset(int oldActivityId) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.weekendKoiBlessing > 0) {
         playerActivityDao.weekendKoiBlessing = 0;
         playerActivityDao.updateOp();
      }

      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      giftPart.clearGifts(6);
   }

   public void resetWeekendKoiBlessing() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.weekendKoiBlessing = 0;
      playerActivityDao.updateOp();
      this.sendInfo();
   }

   public List<ResourceModel> buy() {
      return ResourceModel.buildResources(ApplicationContextProvider.getConfigString("Blessing", ""));
   }

   private void sendBuyResult(int buyId) {
      ActivityMsg.S2C_WeekendKoiBuyResult_6740.Builder resp = ActivityMsg.S2C_WeekendKoiBuyResult_6740.newBuilder();
      resp.setBuyId(buyId);
      this.player.sendMsg(resp.build());
      this.player.getOperationMgr().addActivityLog(this.player, 1377, "周末锦鲤");
   }
}
