package com.gzbz.union.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.UnionDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.model.UnionDonateModel;
import com.gzbz.model.UnionDonatePointsBoxModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.UnionMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class UnionDonatePart extends UnionPart {
   @MsgHandlerAnno
   public void C2S_UnionDonateInfo_6979(UnionMsg.C2S_UnionDonateInfo_6979 msg, String source) {
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else {
            UnionMsg.S2C_UnionDonateInfo_6980.Builder resp = UnionMsg.S2C_UnionDonateInfo_6980.newBuilder();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            resp.setDonateId((Integer)playerResetCustomCache.getDailyNum(5, 0));
            resp.setDonateProgress(super.getUnion().donateProgress);
            Map<Integer, UnionDonatePointsBoxModel> unionDonatePointsBoxModelMap = ApplicationContextProvider.<Integer, UnionDonatePointsBoxModel>getModelPoolMap("unionDonate");

            for(Integer boxId : unionDonatePointsBoxModelMap.keySet()) {
               if ((Integer)playerResetCustomCache.getDailyNum(600 + boxId, 0) > 0) {
                  resp.addBoxId(boxId);
               }
            }

            this.player.sendMsg(resp.build());
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_UnionDonate_6947(UnionMsg.C2S_UnionDonate_6947 msg, String source) {
      this.unionDonate(msg.getDonateId(), false);
   }

   public void unionDonate(int donateId, boolean isGuanJia) {
      PlayerMsg.ShowType showType = isGuanJia ? PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW : PlayerMsg.ShowType.SHOW_TYPE_COMMON;
      PlayerDao playerDao = this.player.getPlayerDao();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      if ((Integer)playerResetCustomCache.getDailyNum(5, 0) > 0) {
         this.sendDonateResult(9013, donateId, "捐献失败,玩家{}今日已经捐献过", this.player.getPlayerId());
      } else {
         UnionDonateModel unionDonateModel = (UnionDonateModel)ApplicationContextProvider.getModelPoolEntity("unionDonate", donateId);
         if (unionDonateModel == null) {
            this.sendDonateResult(0, donateId, "捐赠失败,{}配置不存在", donateId);
         } else if (unionDonateModel.getLevel() > playerDao.lv) {
            this.sendDonateResult(20, donateId, "捐献失败,玩家{}等级未达到{}", this.player.getPlayerId(), unionDonateModel.getLevel());
         } else if (unionDonateModel.getVipLevel() > playerDao.vip_lv) {
            this.sendDonateResult(19, donateId, "捐献失败,玩家{}vip等级未达到{}", this.player.getPlayerId(), unionDonateModel.getVipLevel());
         } else if ((long)unionDonateModel.getCopper() > playerDao.copper) {
            this.sendDonateResult(32, donateId, "捐献失败,玩家{}铜钱不足{}", this.player.getPlayerId(), unionDonateModel.getCopper());
         } else if ((long)unionDonateModel.getGold() > playerDao.gold) {
            this.sendDonateResult(31, donateId, "捐献失败,玩家{}元宝不足{}", this.player.getPlayerId(), unionDonateModel.getCopper());
         } else {
            this.unionMgrParent.pushTask(() -> {
               if (!this.checkJoin()) {
                  this.sendDonateResult(23, donateId, "捐献失败,玩家{}未加入军团", this.player.getPlayerId());
               } else {
                  UnionMgr unionMgr = super.getUnionMgr();
                  if (unionDonateModel.getCopper() > 0) {
                     this.player.pushTask(() -> this.player.delResource(1, PlayerDefine.PLAYER_COPPER, (long)unionDonateModel.getCopper(), 9, 915, PlayerDefine.PLAYER_COPPER, unionDonateModel.getCopper(), ""));
                     unionMgr.addLog(playerDao.unionId, 5, playerDao.playerName, unionDonateModel.getDesc());
                  }

                  if (unionDonateModel.getGold() > 0) {
                     this.player.pushTask(() -> {
                        this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)unionDonateModel.getGold(), 9, 915, PlayerDefine.PLAYER_GOLD, unionDonateModel.getGold(), "");
                        this.player.triggerTask(329, 0, (long)unionDonateModel.getGold(), 1);
                     });
                     unionMgr.addLog(playerDao.unionId, 5, playerDao.playerName, unionDonateModel.getDesc());
                  }

                  ResourceModel reward = new ResourceModel(1, PlayerDefine.PLAYER_UNION_CONTRIBUTION, unionDonateModel.getDonate());
                  this.player.pushTask(() -> {
                     this.player.triggerTask(108, 0, 1L, 1);
                     this.player.triggerTask(504, donateId, 1L, 1);
                     this.player.addResource(reward, showType, 9, 915, PlayerDefine.PLAYER_UNION_CONTRIBUTION, unionDonateModel.getDonate(), "");
                     playerResetCustomCache.addDailyReset(5, donateId);
                  });
                  UnionDao unionDao = unionMgr.getUnion();
                  unionDao.donateProgress += unionDonateModel.getProgress();
                  unionDao.updateOp();
                  unionMgr.addExp(unionDonateModel.getUnionExp());
                  unionMgr.sendUnionDonateProgress();
                  unionMgr.sendUnion((GamePlayer)null);
                  this.sendDonateResult(1, donateId, (String)null);
                  this.player.getOperationMgr().addExtraLog(this.player, 112, unionDao.unionName, String.valueOf(unionDonateModel.getCopper()), String.valueOf(unionDonateModel.getGold()));
                  GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
                  List<ResourceModel> rewardList = new ArrayList();
                  rewardList.add(reward);
                  guanJiaPart.checkState(1460, rewardList);
               }
            });
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionDonateBox_6949(UnionMsg.C2S_UnionDonateBox_6949 msg, String source) {
      int boxId = msg.getBoxId();
      PlayerDao playerDao = this.player.getPlayerDao();
      UnionDonatePointsBoxModel unionDonateBox = (UnionDonatePointsBoxModel)ApplicationContextProvider.getModelPoolEntity("unionDonatePointsBox", boxId);
      if (unionDonateBox == null) {
         this.sendDonateRewardResult(0, boxId, "领取捐献宝箱失败,宝箱不存在,玩家{}", this.player.getPlayerId());
      } else {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         if ((Integer)playerResetCustomCache.getDailyNum(600 + msg.getBoxId(), 0) > 0) {
            this.player.failure(24);
         } else {
            this.unionMgrParent.pushTask(() -> {
               if (!this.checkJoin()) {
                  this.sendDonateRewardResult(23, boxId, "领取捐献宝箱失败,军团{}不存在或玩家{}未加入军团", playerDao.unionId, this.player.getPlayerId());
               } else {
                  UnionMgr unionMgr = super.getUnionMgr();
                  UnionDao unionDao = unionMgr.getUnion();
                  if (unionDonateBox.getNeedPonits() > unionDao.donateProgress) {
                     this.sendDonateRewardResult(9020, boxId, "领取捐献宝箱失败,玩家{}所在军团捐献进度不足{}", this.player.getPlayerId(), unionDonateBox.getNeedPonits());
                  } else {
                     this.player.pushTask(() -> {
                        playerResetCustomCache.setDailyReset(600 + msg.getBoxId(), 1);
                        this.player.addResource(unionDonateBox.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 9, 929, boxId, 0, "");
                        this.sendDonateRewardResult(1, boxId, (String)null);
                     });
                  }
               }
            });
         }
      }
   }

   private void sendDonateResult(int code, int donateId, String message, Object... args) {
      if (code != 1) {
      }

      UnionMsg.S2C_UnionDonate_6948.Builder msg = UnionMsg.S2C_UnionDonate_6948.newBuilder();
      msg.setResult(code);
      msg.setDonateId(donateId);
      this.player.sendMsg(msg.build());
   }

   private void sendDonateRewardResult(int code, int boxId, String message, Object... args) {
      if (code != 1) {
      }

      UnionMsg.S2C_UnionDonateBox_6950.Builder msg = UnionMsg.S2C_UnionDonateBox_6950.newBuilder();
      msg.setResult(code);
      msg.setBoxId(boxId);
      this.player.sendMsg(msg.build());
   }

   @TaskMethod
   public void guanJiaOperate(int systemId, int donateId) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);

      try {
         this.unionDonate(donateId, true);
      } catch (Exception var5) {
         guanJiaPart.checkState(systemId, (List)null);
      }

   }
}
