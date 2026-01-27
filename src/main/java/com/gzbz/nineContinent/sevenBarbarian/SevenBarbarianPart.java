package com.gzbz.nineContinent.sevenBarbarian;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.google.protobuf.ByteString;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.SevenBarbarianDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.BarbarianBaseModel;
import com.gzbz.model.BarbarianHurtStandardModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.SevenBarbarianMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
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
public class SevenBarbarianPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(SevenBarbarianPart.class);
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private WorldMgr worldMgr;

   @MsgHandlerAnno
   public void C2S_BarbarianInfo_4601(SevenBarbarianMsg.C2S_BarbarianInfo_4601 msg, String channelId) {
      this.sendInfo();
   }

   public void sendInfo() {
      SevenBarbarianDao barbarianDao = (SevenBarbarianDao)this.player.getData("tb_seven_barbarian", this.player.getPlayerId());
      SevenBarbarianMsg.S2C_BarbarianInfo_4602.Builder builder = SevenBarbarianMsg.S2C_BarbarianInfo_4602.newBuilder();
      builder.setBuyTimes(barbarianDao.buyTimes);
      builder.setBattleTimes(barbarianDao.battleTimes);
      int day = DateUtil.todayOfWeek() - 1;
      day = day == 0 ? 7 : day;
      if (barbarianDao.data.containsKey(day)) {
         builder.setMaxHurt((Long)barbarianDao.data.get(day));
      } else {
         builder.setMaxHurt(0L);
      }

      builder.setId(day);
      this.player.sendMsg(builder.build());
   }

   public int enterBattle(BattleDao battleDao) {
      if (DateUtil.cHour() < 22 && DateUtil.cHour() > 5) {
         BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
         int day = DateUtil.todayOfWeek() - 1;
         day = day == 0 ? 7 : day;
         BarbarianBaseModel baseModel = (BarbarianBaseModel)this.player.getGameModelPool().getEntity("barbarianBase", day);
         if (baseModel == null) {
            battlePart.removeBattle(2410);
            return 0;
         } else {
            SevenBarbarianDao barbarianDao = (SevenBarbarianDao)this.player.getData("tb_seven_barbarian", this.player.getPlayerId());
            if (baseModel.getFreeChallenge() + barbarianDao.buyTimes <= barbarianDao.battleTimes) {
               this.player.failure(56001);
               battlePart.removeBattle(2410);
               return 0;
            } else {
               ++barbarianDao.battleTimes;
               barbarianDao.updateOp();
               BattlePKTeam rightTeam = new BattlePKTeam(baseModel.getBattle());
               battleDao.scene.addPKTeam((byte)1, rightTeam);
               battleDao.scene.setMaxRound((byte)baseModel.getRounds());
               this.player.getOperationMgr().addCopyLog(this.player, baseModel.getId(), "七蛮之战");
               return 1;
            }
         }
      } else {
         this.player.failure(56000);
         return 0;
      }
   }

   @MsgHandlerAnno
   public void C2S_RankInfo_4605(SevenBarbarianMsg.C2S_RankInfo_4605 msg, String channelId) {
      SevenBarbarianMsg.C2S_RankInfo_4605.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public void afterFight(BattleDao battleDao) {
      int day = DateUtil.todayOfWeek() - 1;
      day = day == 0 ? 7 : day;
      BarbarianBaseModel var10000 = (BarbarianBaseModel)this.player.getGameModelPool().getEntity("barbarianBase", day);
      int copyId = battleDao.modelId;
      BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
      result.setResult(0);
      List<ResourceModel> rewardList = new ArrayList();
      long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
      SevenBarbarianDao barbarianDao = (SevenBarbarianDao)this.player.getData("tb_seven_barbarian", this.player.getPlayerId());
      if (barbarianDao.data.containsKey(day)) {
         Map<Integer, BarbarianHurtStandardModel> hurtMap = ApplicationContextProvider.<Integer, BarbarianHurtStandardModel>getModelPoolMap("barbarianHurtStandard");
         List<BarbarianHurtStandardModel> list = new ArrayList();

         for(BarbarianHurtStandardModel v : hurtMap.values()) {
            if (v.getType() == 1 && (long)v.getLowerLimit() <= damage && damage <= (long)v.getHigherLimit()) {
               list.add(v);
            }
         }

         if (!list.isEmpty()) {
            BarbarianHurtStandardModel hurtModel = (BarbarianHurtStandardModel)list.get(0);
            rewardList.addAll(hurtModel.getAward());
         }

         battleDao.rewards.addAll(rewardList);
         battleDao.updateOp();
         barbarianDao.data.put(day, damage);
         barbarianDao.updateOp();
      } else {
         Map<Integer, BarbarianHurtStandardModel> hurtMap = ApplicationContextProvider.<Integer, BarbarianHurtStandardModel>getModelPoolMap("barbarianHurtStandard");
         List<BarbarianHurtStandardModel> list = new ArrayList();

         for(BarbarianHurtStandardModel v : hurtMap.values()) {
            if (v.getType() == 1 && (long)v.getLowerLimit() <= damage && damage <= (long)v.getHigherLimit()) {
               list.add(v);
            }
         }

         if (!list.isEmpty()) {
            BarbarianHurtStandardModel hurtModel = (BarbarianHurtStandardModel)list.get(0);
            rewardList.addAll(hurtModel.getAward());
         }

         battleDao.rewards.addAll(rewardList);
         battleDao.updateOp();
         barbarianDao.data.put(day, damage);
         barbarianDao.updateOp();
      }

      for(ResourceModel r : rewardList) {
         result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(r.getType()).setId(r.getId()).setNum(r.getValue()));
      }

      SevenBarbarianMsg.S2S_BattleInfo_4609.Builder builder = this.packInfo(damage);
      builder.setId(day);

      for(ResourceModel r : rewardList) {
         builder.addItem(CommonMsg.ItemInfo.newBuilder().setType(r.getType()).setId(r.getId()).setNum(r.getValue()));
      }

      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      this.sendInfo();
   }

   public void endBattle(BattleDao battleDao) {
      this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 59, 5901, battleDao.modelId, 0, "");
      battleDao.rewards.clear();
      this.player.triggerTask(367, 0, 1L, 1);
   }

   @MsgHandlerAnno
   public void C2S_BarbarianInfo_4607(SevenBarbarianMsg.C2S_BarbarianInfo_4607 msg, String channelId) {
      int day = DateUtil.todayOfWeek() - 1;
      day = day == 0 ? 7 : day;
      BarbarianBaseModel model = (BarbarianBaseModel)this.player.getGameModelPool().getEntity("barbarianBase", day);
      SevenBarbarianDao barbarianDao = (SevenBarbarianDao)this.player.getData("tb_seven_barbarian", this.player.getPlayerId());
      if (barbarianDao.buyTimes >= model.getBuyChallenge()) {
         this.player.failure(56002);
      } else {
         ++barbarianDao.buyTimes;
         barbarianDao.updateOp();
         SevenBarbarianMsg.S2C_BarbarianInfo_4608.Builder builder = SevenBarbarianMsg.S2C_BarbarianInfo_4608.newBuilder();
         builder.setBattleTimes(barbarianDao.battleTimes);
         builder.setBuyTimes(barbarianDao.buyTimes);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_FamousInfo_4603(SevenBarbarianMsg.C2S_FamousInfo_4603 msg, String channelId) {
      SevenBarbarianMsg.C2S_FamousInfo_4603.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public SevenBarbarianMsg.S2S_BattleInfo_4609.Builder packInfo(long damage) {
      PlayerDao playerDao = this.player.getPlayerDao();
      SevenBarbarianMsg.S2S_BattleInfo_4609.Builder builder = SevenBarbarianMsg.S2S_BattleInfo_4609.newBuilder();
      builder.setServerId(this.player.getServerId());
      builder.setPlayerId(this.player.getPlayerId());
      builder.setPlayerName(playerDao.playerName);
      builder.setSex(playerDao.sex);
      builder.setLv(playerDao.lv);
      builder.setCombatPower(this.player.getPlayerCombatPower());
      builder.setHeadId(playerDao.head);
      builder.setHeadFrame(playerDao.headFrame);
      builder.setPrestige(playerDao.prestige);
      builder.setMonarchId(playerDao.monarchId);
      builder.setUnionId(playerDao.unionId);
      builder.setUnionName("");
      if (playerDao.unionId > 0) {
         UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
         UnionDao unionDao = unionMgrParent.getUnionMgr(playerDao.unionId).getUnion();
         builder.setUnionName(unionDao.unionName);
      }

      builder.setVipLev(playerDao.vip_lv);
      builder.setHurt(damage);
      builder.setCity(this.player.getIpCity());
      builder.setProvince(this.player.getIpProvince());
      builder.setStepId(playerDao.peak_lv);
      builder.setSecondTitle(playerDao.secondTitle);
      builder.setPlayerId(this.player.getPlayerId());
      ArrayingMirror playerArraying = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_SEVEN_BARBARIAN);
      byte[] bytes = playerArraying.toByteArray();
      builder.setArraying(ByteString.copyFrom(bytes));
      return builder;
   }

   @MsgHandlerAnno
   public void S2S_SendMail_4610(SevenBarbarianMsg.S2S_SendMail_4610 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.getRank() > 0 && msg.getRank() <= 100) {
         int day = DateUtil.todayOfWeek() - 1;
         day = day == 0 ? 7 : day;
         BarbarianBaseModel model = (BarbarianBaseModel)this.player.getGameModelPool().getEntity("barbarianBase", day);
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         CentreAwardModel rewardModel = this.getCentreAwardModel(16, (long)msg.getRank());
         if (rewardModel != null) {
            int logReason = 5902;
            String content = MessageFormat.format(rewardModel.getDesc(), model.getBossName(), msg.getCountHurt(), msg.getRank());
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), content, rewardModel.getItems(), 604800000L, 59, logReason);
         }
      }
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

   public void resetDaily() {
      SevenBarbarianDao barbarianDao = (SevenBarbarianDao)this.player.getData("tb_seven_barbarian", this.player.getPlayerId());
      barbarianDao.battleTimes = 0;
      barbarianDao.buyTimes = 0;
      barbarianDao.updateOp();
   }

   public void resetWeek() {
      SevenBarbarianDao barbarianDao = (SevenBarbarianDao)this.player.getData("tb_seven_barbarian", this.player.getPlayerId());
      barbarianDao.data.clear();
      barbarianDao.updateOp();
   }
}
