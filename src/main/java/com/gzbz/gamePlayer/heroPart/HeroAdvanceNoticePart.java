package com.gzbz.gamePlayer.heroPart;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroAdvanceNoticedDao;
import com.gzbz.db.bean.HeroAdvanceNoticeData;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.HeroAdvanceNoticeModel;
import com.gzbz.protobuf.HeroAdvanceNoticeMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroAdvanceNoticePart extends PlayerPart {
   public void resetDaily() {
      this.checkOpen();
   }

   public void loginHandle() {
      this.checkOpen();
   }

   @MsgHandlerAnno
   public void C2S_Info_22201(HeroAdvanceNoticeMsg.C2S_Info_22201 msg, String source) {
      this.checkOpen();
   }

   @MsgHandlerAnno
   public void C2S_Reward_22203(HeroAdvanceNoticeMsg.C2S_Reward_22203 msg, String source) {
      HeroAdvanceNoticedDao dao = (HeroAdvanceNoticedDao)this.player.getData("tb_hero_advance_notice", this.player.getPlayerId());
      HeroAdvanceNoticeData heroAdvanceNoticeData = (HeroAdvanceNoticeData)dao.advanceNoticeDataMap.get(msg.getId());
      if (heroAdvanceNoticeData == null) {
         this.logger.info("活动未开启 id:{} playerId:{}", msg.getId(), this.player.getPlayerId());
      } else {
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         if (curTime >= heroAdvanceNoticeData.startTime && curTime <= heroAdvanceNoticeData.endTime) {
            int day = DateUtil.difftimeDay(new Timestamp((long)heroAdvanceNoticeData.startTime * 1000L)) + 1;
            if (heroAdvanceNoticeData.rewards.contains(day)) {
               this.logger.info("已领取当天奖励");
            } else {
               HeroAdvanceNoticeModel model = (HeroAdvanceNoticeModel)ApplicationContextProvider.getModelPoolEntity("heroAdvanceNotice", msg.getId());
               if (model != null) {
                  heroAdvanceNoticeData.rewards.add(day);
                  dao.updateOp();
                  this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 4, 453, msg.getId(), 0, "day:" + day);
                  HeroAdvanceNoticeMsg.S2C_Reward_22204.Builder builder = HeroAdvanceNoticeMsg.S2C_Reward_22204.newBuilder();
                  builder.setId(msg.getId());
                  builder.addAllGotReward(heroAdvanceNoticeData.rewards);
                  this.player.sendMsg(builder.build());
               }
            }
         } else {
            this.logger.info("不在活动期间，不可领取");
         }
      }
   }

   private void checkOpen() {
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      Set<Integer> invalidSet = new HashSet();
      HeroAdvanceNoticedDao dao = (HeroAdvanceNoticedDao)this.player.getData("tb_hero_advance_notice", this.player.getPlayerId());

      for(HeroAdvanceNoticeData data : dao.advanceNoticeDataMap.values()) {
         if (curTime >= data.endTime) {
            invalidSet.add(data.id);
         }
      }

      for(int id : invalidSet) {
         dao.advanceNoticeDataMap.remove(id);
      }

      Map<Integer, HeroAdvanceNoticeModel> modelMap = ApplicationContextProvider.<Integer, HeroAdvanceNoticeModel>getModelPoolMap("heroAdvanceNotice");

      for(HeroAdvanceNoticeModel model : modelMap.values()) {
         if (!dao.advanceNoticeDataMap.containsKey(model.getId())) {
            int openTime = DateUtil.getIntTime(DateUtil.getLongTime(model.getOpentime(), "yyyy-MM-dd"));
            if (curTime >= openTime && curTime < openTime + model.getDuration()) {
               HeroAdvanceNoticeData data = new HeroAdvanceNoticeData();
               data.id = model.getId();
               data.startTime = openTime;
               data.endTime = openTime + model.getDuration() - 1;
               dao.advanceNoticeDataMap.put(data.id, data);
            }
         }
      }

      dao.updateOp();
      this.sendInfo();
   }

   private void sendInfo() {
      HeroAdvanceNoticeMsg.S2C_Info_22202.Builder builder = HeroAdvanceNoticeMsg.S2C_Info_22202.newBuilder();
      HeroAdvanceNoticedDao dao = (HeroAdvanceNoticedDao)this.player.getData("tb_hero_advance_notice", this.player.getPlayerId());

      for(HeroAdvanceNoticeData data : dao.advanceNoticeDataMap.values()) {
         HeroAdvanceNoticeMsg.InfoDetail.Builder infoMsg = HeroAdvanceNoticeMsg.InfoDetail.newBuilder();
         infoMsg.setId(data.id);
         infoMsg.setStartTime(data.startTime);
         infoMsg.setEndTime(data.endTime);
         infoMsg.addAllGotReward(data.rewards);
         builder.addInfoDetail(infoMsg);
      }

      this.player.sendMsg(builder.build());
   }
}
