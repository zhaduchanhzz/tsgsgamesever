package com.gzbz.union.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.model.UnionActiveModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.UnionMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.UnionTaskPart;
import com.gzbz.union.UnionMgr;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class UnionActivePart extends UnionPart {
   @MsgHandlerAnno
   public void C2S_UnionActiveTaskReward_6939(UnionMsg.C2S_UnionActiveTaskReward_6939 msg, String source) {
      if (!this.checkJoin()) {
         this.player.failure(23);
      } else {
         UnionTaskPart unionTaskPart = (UnionTaskPart)this.player.getMgrPart(UnionTaskPart.class);
         unionTaskPart.commit(msg.getTaskId());
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionActiveUpgrade_6945(UnionMsg.C2S_UnionActiveUpgrade_6945 msg, String source) {
      if (!this.checkJoin()) {
         this.player.failure(23);
      } else {
         PlayerDao playerDao = this.player.getPlayerDao();
         TreeMap<Integer, UnionActiveModel> unionActiveModelMap = new TreeMap(ApplicationContextProvider.getModelPoolMap("unionActive"));
         if (playerDao.union_active_lv >= (Integer)unionActiveModelMap.lastKey()) {
            this.player.failure(26);
         } else {
            UnionActiveModel unionActiveModel = (UnionActiveModel)unionActiveModelMap.get(playerDao.union_active_lv);
            if (unionActiveModel == null) {
               this.player.failure(0);
            } else if (playerDao.union_active < unionActiveModel.getNeedNum()) {
               this.player.failure(27);
            } else {
               this.player.delResource(1, PlayerDefine.PLAYER_UNION_ACTIVE, (long)unionActiveModel.getNeedNum(), 9, 914, PlayerDefine.PLAYER_UNION_ACTIVE, unionActiveModel.getNeedNum(), "");
               this.player.addResource(1, PlayerDefine.PLAYER_UNION_ACTIVE_LV, 1, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 9, 914, PlayerDefine.PLAYER_UNION_ACTIVE_LV, 1, "");
               this.player.addResource(unionActiveModel.getUpgradeRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 9, 914, playerDao.union_active_lv, 0, "");
               PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
               playerResetCustomCache.setForever(9, playerDao.union_active_lv);
               UnionMsg.S2C_UnionActiveUpgrade_6946.Builder resp = UnionMsg.S2C_UnionActiveUpgrade_6946.newBuilder();
               resp.setLevel(playerDao.union_active_lv);
               resp.setExp(playerDao.union_active);
               this.player.sendMsg(resp.build());
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.setProperty_union_activity(this.getActivePropertyAdditions());
               heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_UNION_ACTIVITY);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionActiveInfo_6941(UnionMsg.C2S_UnionActiveInfo_6941 msg, String source) {
      UnionMgr unionMgr = super.getUnionMgr();
      if (unionMgr != null) {
         this.sendUnionActiveInfo();
      }
   }

   public List<PropertyModel> getActivePropertyAdditions() {
      List<PropertyModel> propertyModels = new ArrayList();
      PlayerDao playerDao = this.player.getPlayerDao();
      UnionActiveModel unionActiveModel = (UnionActiveModel)ApplicationContextProvider.getModelPoolEntity("unionActive", playerDao.union_active_lv);
      if (unionActiveModel == null) {
         return propertyModels;
      } else {
         for(PropertyModel propertyModel : unionActiveModel.getProperties()) {
            propertyModels.add(propertyModel.clone());
         }

         return propertyModels;
      }
   }

   private void sendUnionActiveInfo() {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      PlayerDao playerDao = this.player.getPlayerDao();
      UnionMsg.S2C_UnionActiveInfo_6942.Builder resp = UnionMsg.S2C_UnionActiveInfo_6942.newBuilder();
      resp.setLv(playerDao.union_active_lv);
      resp.setExp(playerDao.union_active);
      resp.setToday((Integer)playerResetCustomCache.getDailyNum(4, 0));
      resp.setWeek((Integer)playerResetCustomCache.getWeekNum(4, 0));
      resp.setRewardLv((Integer)playerResetCustomCache.getForeverNum(9, 0));
      UnionTaskPart unionTaskPart = (UnionTaskPart)this.player.getMgrPart(UnionTaskPart.class);
      resp.addAllUnionTask(unionTaskPart.getUnionTasksMsg());
      resp.setOpType(1);
      this.player.sendMsg(resp.build());
   }
}
