package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.YuanDanFireWorkDao;
import com.gzbz.db.bean.ChatData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.monarch.MonarchPart;
import com.gzbz.gamePlayer.playerChat.PlayerChatPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.medal.MedalPart;
import com.gzbz.model.YuanDanFireWorkDetailAwardModel;
import com.gzbz.model.YuanDanFireWorkDetailModel;
import com.gzbz.protobuf.BagMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.YuanDanFireWorkMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class YuanDanFireWorkPart extends AbstractActivityPart {
   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         this.C2S_Main_22701(YuanDanFireWorkMsg.C2S_Main_22701.newBuilder().build(), "");
      }

   }

   public void loginHandle() {
   }

   public void activityEnd(int oldActivityId) {
      YuanDanFireWorkDao dao = (YuanDanFireWorkDao)this.player.getData("tb_activity_fire_work", this.player.getPlayerId());
      dao.hadGotRewards.clear();
      dao.updateOp();
   }

   public int getActivityType() {
      return 93;
   }

   @MsgHandlerAnno
   public void C2S_Main_22701(YuanDanFireWorkMsg.C2S_Main_22701 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         YuanDanFireWorkDao dao = (YuanDanFireWorkDao)this.player.getData("tb_activity_fire_work", this.player.getPlayerId());
         YuanDanFireWorkMsg.S2C_Main_22702.Builder resp = YuanDanFireWorkMsg.S2C_Main_22702.newBuilder();
         resp.setFireWorkThemeType(this.getFireWorkInfos()[0]);
         resp.setActivityTime(this.getFireWorkInfos()[1]);
         resp.setServerOpenDay(this.getPlayerActivityOpenDay());
         resp.addAllHadGotRewards(dao.hadGotRewards);
         this.player.sendMsg(resp.build());
      } else {
         this.player.failure(8007);
      }

   }

   @MsgHandlerAnno
   public void C2S_FireWorkAward_22703(YuanDanFireWorkMsg.C2S_FireWorkAward_22703 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         if (this.checkResource(msg.getId())) {
            YuanDanFireWorkDao dao = (YuanDanFireWorkDao)this.player.getData("tb_activity_fire_work", this.player.getPlayerId());
            dao.hadGotRewards.add(msg.getId());
            dao.updateOp();
            YuanDanFireWorkDetailAwardModel model = (YuanDanFireWorkDetailAwardModel)ApplicationContextProvider.getModelPoolEntity("YuanDanFireWorkDetailAward", msg.getId());
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 130, 12912, 0, 0, "");
            this.sendMessage();
            YuanDanFireWorkMsg.S2C_FireWorkAward_22704.Builder builder = YuanDanFireWorkMsg.S2C_FireWorkAward_22704.newBuilder();
            builder.setId(msg.getId());
            this.player.sendMsg(builder.build());
         }
      } else {
         this.player.failure(8007);
      }

   }

   private void sendMessage() {
      YuanDanFireWorkDetailModel model = (YuanDanFireWorkDetailModel)ApplicationContextProvider.getModelPoolEntity("YuanDanFireWorkDetail", this.getFireWorkInfos()[2]);
      if (!ObjectUtils.isEmpty(model)) {
         ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
         MedalPart medalPart = (MedalPart)this.player.getMgrPart(MedalPart.class);
         MonarchPart monarchPart = (MonarchPart)this.player.getMgrPart(MonarchPart.class);
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         PlayerChatPart playerChatPart = (PlayerChatPart)this.player.getMgrPart(PlayerChatPart.class);
         String format = model.getChatWish();
         Set<Integer> medals = medalPart.getMedals();
         List<CommonMsg.MapDataIS> customPrestiges = monarchPart.getCustomPrestiges();
         playerChatPart.handlePersonalSender(2, this.player.getPlayerId(), format, 0, (CommonMsg.HeroInfo)null, (BagMsg.Item_Info)null, "", playerExtend.bubble, medals, customPrestiges);
         ChatData chatData = new ChatData(this.player.getServerId(), this.player.getPlayerId(), 2, format, 0, (CommonMsg.HeroInfo)null, 0, (BagMsg.Item_Info)null, "", playerExtend.bubble, medals, customPrestiges);
         chatMgr.handleMsg(chatData);
      }

   }

   private boolean checkResource(int id) {
      YuanDanFireWorkDetailAwardModel model = (YuanDanFireWorkDetailAwardModel)ApplicationContextProvider.getModelPoolEntity("YuanDanFireWorkDetailAward", id);
      if (ObjectUtils.isEmpty(model)) {
         return false;
      } else {
         int day = this.getPlayerActivityOpenDay();
         if (day >= model.getDateStart() && day <= model.getDateEnd() || day >= model.getDateStart() && model.getDateEnd() == -1) {
            YuanDanFireWorkDao dao = (YuanDanFireWorkDao)this.player.getData("tb_activity_fire_work", this.player.getPlayerId());
            return !dao.hadGotRewards.contains(id);
         } else {
            return false;
         }
      }
   }

   private int[] getFireWorkInfos() {
      Map<Integer, YuanDanFireWorkDetailModel> detailModel = ApplicationContextProvider.<Integer, YuanDanFireWorkDetailModel>getModelPoolMap("YuanDanFireWorkDetail");
      if (!ObjectUtils.isEmpty(detailModel)) {
         int id = 0;
         int min = Integer.MAX_VALUE;
         int activityOpenTime = 0;
         int openTime = this.getServerActivityInfo().start;

         for(YuanDanFireWorkDetailModel model : detailModel.values()) {
            int temp = DateUtil.getIntTime(DateUtil.getLongTime(model.getOpenTime(), "yyyy-MM-dd")) - openTime;
            if (temp >= 0 && temp <= min) {
               min = temp;
               id = model.getId();
               activityOpenTime = temp + openTime;
            }
         }

         return new int[]{((YuanDanFireWorkDetailModel)detailModel.get(id)).getFireWorkThemeType(), activityOpenTime, id};
      } else {
         return new int[3];
      }
   }
}
