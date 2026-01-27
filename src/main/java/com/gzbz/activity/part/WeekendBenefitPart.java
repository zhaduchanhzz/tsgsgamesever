package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.DateUtil;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class WeekendBenefitPart extends AbstractActivityPart {
   @MsgHandlerAnno
   public void C2S_WeekendBenefitInfo_6731(ActivityMsg.C2S_WeekendBenefitInfo_6731 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_WeekendBenefitReward_6733(ActivityMsg.C2S_WeekendBenefitReward_6733 msg, String source) {
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo.id == 0) {
         this.player.failure(0);
      } else {
         int id = msg.getId();
         GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
         TreeMap<Integer, ShopLimitModel> curActivityGiftMap = giftPart.getShopLimits(9, activityInfo.id);
         ShopLimitModel shopLimitModel = (ShopLimitModel)curActivityGiftMap.get(id);
         if (shopLimitModel == null) {
            this.player.failure(0);
         } else {
            int dayInWeek = DateUtil.todayOfWeek();
            if (dayInWeek > 2 && dayInWeek < 7) {
               this.player.failure(6);
            } else {
               int giftIndex = -1;

               for(int giftId : curActivityGiftMap.keySet()) {
                  ++giftIndex;
                  if (id == giftId) {
                     break;
                  }
               }

               switch (giftIndex) {
                  case 0:
                     if (dayInWeek != 7) {
                        this.player.failure(8003);
                        return;
                     }
                     break;
                  case 1:
                     if (dayInWeek == 7) {
                        this.player.failure(8004);
                        return;
                     }

                     if (dayInWeek == 2) {
                        this.player.failure(8003);
                        return;
                     }
                     break;
                  case 2:
                     if (dayInWeek != 2) {
                        this.player.failure(8004);
                        return;
                     }
                     break;
                  default:
                     this.player.failure(0);
                     return;
               }

               PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
               if (playerActivityDao.isGotWeekendBenefitGifts(giftIndex)) {
                  this.player.failure(24);
               } else {
                  playerActivityDao.addWeekendBenefitGifts(giftIndex);
                  playerActivityDao.updateOp();
                  this.player.addResource(shopLimitModel.getItemType(), shopLimitModel.getItemId(), shopLimitModel.getItemNum(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 807, 0, 0, "");
                  this.sendRewardResult(id);
                  SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 1378);
                  if (systemFunctionModel != null) {
                     this.player.getOperationMgr().addActivityLog(this.player, systemFunctionModel.getId(), systemFunctionModel.getName());
                     this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 16, systemFunctionModel.getId(), systemFunctionModel.getName(), "-", "-", 0, id, 1);
                  }

               }
            }
         }
      }
   }

   public void sendInfo() {
      ActivityMsg.S2C_WeekendBenefitResult_6732.Builder resp = ActivityMsg.S2C_WeekendBenefitResult_6732.newBuilder();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      Map<Integer, Map<Integer, TreeMap<Integer, ShopLimitModel>>> allShopLimitMap = ApplicationContextProvider.<Integer, Map<Integer, TreeMap<Integer, ShopLimitModel>>>getModelPoolMap("customShopLimit");
      Map<Integer, TreeMap<Integer, ShopLimitModel>> allWeekendGiftMap = (Map)MapUtil.getOrDefault(allShopLimitMap, 9, ConcurrentHashMap.class);
      TreeMap<Integer, ShopLimitModel> curActivityGiftMap = (TreeMap)MapUtil.getOrDefault(allWeekendGiftMap, this.getPlayerActivityId(), TreeMap.class);
      List<Integer> modelIds = new ArrayList(curActivityGiftMap.keySet());

      for(Integer giftIndex : playerActivityDao.weekendBenefitGifts()) {
         if (giftIndex <= modelIds.size() - 1) {
            resp.addGotIds((Integer)modelIds.get(giftIndex));
         }
      }

      this.player.sendMsg(resp.build());
   }

   public int getActivityType() {
      return 6;
   }

   public void rotateReset(int oldActivityId) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.weekendBenefitGifts().size() > 0) {
         playerActivityDao.weekendBenefitGifts = 0;
         playerActivityDao.updateOp();
      }

   }

   private void sendRewardResult(int id) {
      ActivityMsg.S2C_WeekendBenefitRewardResult_6734.Builder msg = ActivityMsg.S2C_WeekendBenefitRewardResult_6734.newBuilder();
      msg.setId(id);
      this.player.sendMsg(msg.build());
   }
}
