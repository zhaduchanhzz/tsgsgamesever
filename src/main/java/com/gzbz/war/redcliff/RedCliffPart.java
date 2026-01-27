package com.gzbz.war.redcliff;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.google.protobuf.ByteString;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.RedCliffDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.ChiBiCoinCidenceModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.RedCliffMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ChiBiTaskPart;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import misc.DateUtil;
import net.CrossSubscribeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class RedCliffPart extends PlayerPart {
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private ChibiMgr chibiMgr;
   private int gmStatus = 0;
   public static final int RED_CLIFF_SIGN_UP = 1;
   public static final int RED_CLIFF_MATCHING = 2;
   public static final int RED_CLIFF_PREPARE = 3;
   public static final int RED_CLIFF_GOING = 4;
   public static final int RED_CLIFF_BATTLING = 5;
   public static final int RED_CLIFF_ENDING = 6;

   @MsgHandlerAnno
   public void C2S_RedPoint_4346(RedCliffMsg.C2S_RedPoint_4346 msg, String channelId) {
      RedCliffMsg.S2C_RedPoint_4347.Builder builder = RedCliffMsg.S2C_RedPoint_4347.newBuilder();
      int status = this.getStatus();
      builder.setIsReceive(false);
      if (status == 4) {
         builder.setIsStatus(true);
      } else {
         builder.setIsStatus(false);
      }

      RedCliffDao redCliffDao = (RedCliffDao)this.player.getData("tb_red_cliff", this.player.getPlayerId());
      if (redCliffDao.status > 0) {
         builder.setIsSign(true);
      } else {
         builder.setIsSign(false);
      }

      if (builder.getIsSign() && builder.getIsStatus()) {
         this.refreshEvent(redCliffDao);

         for(RedCliffEvent event : redCliffDao.event.values()) {
            if (!event.receive) {
               builder.setIsReceive(true);
               break;
            }
         }
      }

      if (status == 1) {
         builder.setStatus(RedCliffMsg.RedCliffState.STATE_SIGN_UP);
      } else if (status == 2) {
         builder.setStatus(RedCliffMsg.RedCliffState.STATE_MATCHING);
      } else if (status == 3) {
         builder.setStatus(RedCliffMsg.RedCliffState.STATE_PREPARE);
      } else if (status == 4) {
         builder.setStatus(RedCliffMsg.RedCliffState.STATE_GOING);
      } else if (status == 5) {
         builder.setStatus(RedCliffMsg.RedCliffState.STATE_BATTLING);
      } else if (status == 6) {
         builder.setStatus(RedCliffMsg.RedCliffState.STATE_BATTLE_END);
      } else {
         builder.setStatus(RedCliffMsg.RedCliffState.STATE_CLOSE);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_RedCliff_Info_4303(RedCliffMsg.C2S_Info_4303 msg, String channelId) {
      ChiBiTaskPart chiBiTaskPart = (ChiBiTaskPart)this.player.getMgrPart(ChiBiTaskPart.class);
      chiBiTaskPart.trigger();
      RedCliffMsg.C2S_Info_4303.Builder builder = RedCliffMsg.C2S_Info_4303.newBuilder();
      PlayerPublicDao playerDao = this.player.getPublicDao();
      builder.setServerId(playerDao.serverId);
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
      builder.setVipLev(playerDao.vip_lv);
      if (playerDao.unionId > 0) {
         UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
         UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerDao.unionId);
         if (!Objects.isNull(unionMgr)) {
            UnionDao unionDao = unionMgr.getUnion();
            builder.setUnionName(unionDao.unionName);
         }
      }

      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "联盟对阵", "1");
   }

   @MsgHandlerAnno
   public void C2S_SignUp_4330(RedCliffMsg.C2S_SignUp_4330 msg, String channelId) {
      RedCliffDao redCliffDao = (RedCliffDao)this.player.getData("tb_red_cliff", this.player.getPlayerId());
      if (redCliffDao.status > 0) {
         this.logger.info("已经报名");
      }

      redCliffDao.status = 1;
      redCliffDao.updateOp();
      RedCliffMsg.C2S_SignUp_4330.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      this.sendArrayingToCross(true);
      this.player.triggerTask(357, 0, 1L, 1);
   }

   @MsgHandlerAnno
   public void C2S_SelectNation_4307(RedCliffMsg.C2S_SelectNation_4307 msg, String channelId) {
      if (msg.getNation() > 0) {
         RedCliffDao redCliffDao = (RedCliffDao)this.player.getData("tb_red_cliff", this.player.getPlayerId());
         if (redCliffDao.status <= 0) {
            this.player.failure(46002);
         } else {
            ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_RED_CLIFF);
            if (arrayingMirror != null && arrayingMirror.arrayingElementsMap != null && !arrayingMirror.arrayingElementsMap.isEmpty()) {
               this.sendArrayingToCross(true);
               redCliffDao.status = 2;
               redCliffDao.updateOp();
               RedCliffMsg.C2S_SelectNation_4307.Builder builder = msg.toBuilder();
               builder.setNation(msg.getNation());
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            } else {
               this.logger.info("请先布阵！！！！！！");
               this.player.failure(46007);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HistoryFightInfo_4338(RedCliffMsg.C2S_HistoryFightInfo_4338 msg, String channelId) {
      RedCliffMsg.C2S_HistoryFightInfo_4338.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_NationInfo_4305(RedCliffMsg.C2S_NationInfo_4305 msg, String channelId) {
      RedCliffMsg.C2S_NationInfo_4305.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_NationFight_4309(RedCliffMsg.C2S_NationFight_4309 msg, String channelId) {
      if (msg.getNation() > 0) {
         RedCliffMsg.C2S_NationFight_4309.Builder builder = msg.toBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_GuessInfo_4311(RedCliffMsg.C2S_GuessInfo_4311 msg, String channelId) {
      PlayerDao playerDao = this.player.getPlayerDao();
      RedCliffMsg.C2S_GuessInfo_4311.Builder builder = msg.toBuilder();
      builder.setMyChip(playerDao.chibi_chip);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_MyGuess_4336(RedCliffMsg.C2S_MyGuess_4336 msg, String channelId) {
      RedCliffMsg.C2S_MyGuess_4336.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_BattleResult_4313(RedCliffMsg.C2S_BattleResult_4313 msg, String channelId) {
      RedCliffMsg.C2S_BattleResult_4313.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void getEventInfo(RedCliffMsg.C2S_Event_4315 msg, String channelId) {
      if (DateUtil.isDayOfWeek(1) && DateUtil.cHour() < 20) {
         RedCliffDao redCliffDao = (RedCliffDao)this.player.getData("tb_red_cliff", this.player.getPlayerId());
         if (redCliffDao.status == 2) {
            this.refreshEvent(redCliffDao);
         }

         RedCliffMsg.S2C_Event_4316.Builder down = RedCliffMsg.S2C_Event_4316.newBuilder();

         for(RedCliffEvent v : redCliffDao.event.values()) {
            RedCliffMsg.Event.Builder event = RedCliffMsg.Event.newBuilder();
            event.setEventId(v.id);
            event.setTime(v.time);
            event.setReceive(v.receive);
            down.addEvents(event);
         }

         this.player.sendMsg(down.build());
         redCliffDao.updateOp();
      } else {
         this.player.failure(46004);
      }
   }

   public void refreshEvent(RedCliffDao redCliffDao) {
      List<RedCliffEvent> list = new ArrayList();

      for(RedCliffEvent value : redCliffDao.event.values()) {
         list.add(value);
      }

      int time = 0;
      int tempTime = 0;

      for(RedCliffEvent redCliffEvent : list) {
         if (redCliffEvent.time > tempTime) {
            tempTime = redCliffEvent.time;
         }
      }

      if (tempTime > 0) {
         time = tempTime;
      }

      int startTime = DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(System.currentTimeMillis()));
      int endTime = DateUtil.getIntTime(System.currentTimeMillis());
      int oneTime = ApplicationContextProvider.getConfigInt("chibiCoincidenceTims", 300);
      int maxTime = startTime + oneTime;
      if (time > 0) {
         maxTime = time + oneTime;
      }

      for(int i = maxTime; i <= endTime; i += oneTime) {
         int id = this.getOneEvent(redCliffDao);
         if (id == 0) {
            break;
         }

         if (!redCliffDao.event.containsKey(id)) {
            redCliffDao.event.put(id, new RedCliffEvent(id, i));
         }
      }

      redCliffDao.updateOp();
   }

   @MsgHandlerAnno
   public void getEventAward(RedCliffMsg.C2S_EventReward_4317 msg, String channelId) {
      if (DateUtil.isDayOfWeek(1) && DateUtil.cHour() < 20) {
         RedCliffDao redCliffDao = (RedCliffDao)this.player.getData("tb_red_cliff", this.player.getPlayerId());
         RedCliffMsg.S2C_EventReward_4318.Builder down = RedCliffMsg.S2C_EventReward_4318.newBuilder();
         this.refreshEvent(redCliffDao);
         List<ResourceModel> awardList = new ArrayList();
         Map<Integer, ChiBiCoinCidenceModel> modelMap = this.player.getGameModelPool().getMap("ChiBiCoincidence");

         for(RedCliffEvent event : redCliffDao.event.values()) {
            if (!event.receive && modelMap.containsKey(event.id)) {
               ChiBiCoinCidenceModel model = (ChiBiCoinCidenceModel)modelMap.get(event.id);
               awardList.addAll(model.getItems());
               event.receive = true;
            }
         }

         this.player.addResource(awardList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 46, 4601, 0, 0, "");

         for(RedCliffEvent v : redCliffDao.event.values()) {
            RedCliffMsg.Event.Builder event = RedCliffMsg.Event.newBuilder();
            event.setEventId(v.id);
            event.setTime(v.time);
            event.setReceive(v.receive);
            down.addEvents(event);
            if (!v.receive) {
               v.receive = true;
            }
         }

         this.player.sendMsg(down.build());
         redCliffDao.updateOp();
      } else {
         this.player.failure(46004);
      }
   }

   @MsgHandlerAnno
   public void S2S_SendChip_4321(RedCliffMsg.S2S_SendChip_4321 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.getWinNum() > 0) {
         this.player.addResource(1, PlayerDefine.PLAYER_CHIBI_CHIP, msg.getWinNum(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 46, 4602, 0, 0, "");
      } else if (msg.getRound() == 1) {
         int chibiFirstRoundChip = this.configManager.getIntDefault("chibiFirstRoundChip", 120);
         this.player.addResource(1, PlayerDefine.PLAYER_CHIBI_CHIP, chibiFirstRoundChip, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 46, 4602, 0, 0, "");
      } else {
         int heroRivalChipGive = ApplicationContextProvider.getConfigInt("heroRivalChipGive", 60);
         this.player.addResource(1, PlayerDefine.PLAYER_CHIBI_CHIP, heroRivalChipGive, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 46, 4602, 0, 0, "");
      }

   }

   @MsgHandlerAnno
   public void C2S_Guess_4322(RedCliffMsg.C2S_Guess_4322 msg, String channelId) {
      if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_CHIBI_CHIP, msg.getPourChip())) {
         this.player.failure(46006);
      } else {
         PlayerDao playerDao = this.player.getPlayerDao();
         RedCliffMsg.C2S_Guess_4322.Builder builder = msg.toBuilder();
         builder.setMyChip(playerDao.chibi_chip);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void S2S_DelChip_4324(RedCliffMsg.S2S_DelChip_4324 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.player.delResource(1, PlayerDefine.PLAYER_CHIBI_CHIP, (long)msg.getPourChip(), 46, 4603, 0, 0, "");
   }

   @MsgHandlerAnno
   public void C2S_LeaveUI_4335(RedCliffMsg.C2S_LeaveUI_4335 msg, String channelId) {
      RedCliffMsg.C2S_LeaveUI_4335.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_RobotInfo_4359(RedCliffMsg.C2S_RobotInfo_4359 msg, String channelId) {
      RedCliffMsg.C2S_RobotInfo_4359.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void S2S_SendReward_4325(RedCliffMsg.S2S_SendReward_4325 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      CentreAwardModel rewardModel = null;
      String reward = "";
      List<ResourceModel> rewardList = new ArrayList();
      int logReason = 4604;
      if (msg.getSendType() == 1) {
         int kills = msg.getKills();
         reward = this.configManager.getStr("chibiKillNumReward");
         if (kills <= 0) {
            return;
         }

         rewardModel = this.getCentreAwardModel(6, 1L);
         String[] rewards = reward.split(",");

         for(int i = 0; i < rewards.length; ++i) {
            String[] realReward = rewards[i].split("\\|");
            rewardList.add(new ResourceModel(Integer.parseInt(realReward[0]), Integer.parseInt(realReward[1]), Integer.parseInt(realReward[2]) * kills));
         }

         String content = MessageFormat.format(rewardModel.getDesc(), kills);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), content, rewardList, 604800000L, 46, logReason);
         this.player.triggerTask(341, 0, (long)kills, 1);
      } else if (msg.getSendType() == 2) {
         int winNum = msg.getKills();
         int loseNum = 3 - msg.getKills();
         rewardModel = this.getCentreAwardModel(6, 2L);
         if (winNum > 0) {
            reward = this.configManager.getStr("chibiVictoryReward");
            String[] realReward = reward.split("\\|");
            rewardList.add(new ResourceModel(Integer.parseInt(realReward[0]), Integer.parseInt(realReward[1]), Integer.parseInt(realReward[2]) * winNum));
         }

         if (loseNum > 0) {
            reward = this.configManager.getStr("chibiFailureReward");
            String[] realReward = reward.split("\\|");
            rewardList.add(new ResourceModel(Integer.parseInt(realReward[0]), Integer.parseInt(realReward[1]), Integer.parseInt(realReward[2]) * loseNum));
         }

         String content = MessageFormat.format(rewardModel.getDesc(), winNum, loseNum);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), content, rewardList, 604800000L, 46, logReason);
         if (winNum > 0) {
            this.player.triggerTask(342, 0, (long)winNum, 1);
         }
      } else if (msg.getSendType() == 3) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (playerDao.chibi_chip > 0) {
            int num = playerDao.chibi_chip;
            playerDao.chibi_chip = 0;
            playerDao.updateOp();
            this.player.notifyPlayerData(PlayerDefine.PLAYER_CHIBI_CHIP, 0);
            rewardModel = this.getCentreAwardModel(6, 3L);
            logReason = 4605;
            rewardList.add(new ResourceModel(1, PlayerDefine.PLAYER_CONQUE_COIN, num));
            String content = MessageFormat.format(rewardModel.getDesc(), num);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), content, rewardList, 604800000L, 46, logReason);
         }
      } else if (msg.getSendType() == 4 && this.player.isLogin()) {
         PlayerDao playerDao = this.player.getPlayerDao();
         playerDao.chibi_chip = 0;
         playerDao.updateOp();
      }

   }

   public int getOneEvent(RedCliffDao redCliffDao) {
      List<KeyValFun> list = new ArrayList();
      Map<Integer, ChiBiCoinCidenceModel> modelMap = this.player.getGameModelPool().getMap("ChiBiCoincidence");

      for(ChiBiCoinCidenceModel model : modelMap.values()) {
         if (!redCliffDao.event.containsKey(model.getId())) {
            list.add(new KeyValFun(model.getId(), model.getRate()));
         }
      }

      if (!list.isEmpty()) {
         return GamePlayer.countRate(list);
      } else {
         this.logger.info("没有奇遇事件了");
         return 0;
      }
   }

   public int getStatus() {
      int status = 0;
      if (DateUtil.isDayOfWeek(6)) {
         status = 1;
      } else if (DateUtil.isDayOfWeek(7) && DateUtil.cHour() < 6) {
         status = 2;
      } else if (DateUtil.isDayOfWeek(7) && DateUtil.cHour() >= 6) {
         status = 3;
      } else if (DateUtil.isDayOfWeek(1) && DateUtil.cHour() < 20) {
         status = 4;
      } else if (DateUtil.isDayOfWeek(1) && DateUtil.cHour() >= 20) {
         status = 5;
      }

      return status == 0 && this.gmStatus > 0 ? this.gmStatus : status;
   }

   public void sendArrayingToCross(boolean isAllSend) {
      if (isAllSend) {
         RedCliffMsg.S2S_PlayerArraying_4320.Builder builder = RedCliffMsg.S2S_PlayerArraying_4320.newBuilder();
         ArrayingMirror arrayingMirror = null;
         arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_RED_CLIFF);
         if (arrayingMirror != null && arrayingMirror.arrayingElementsMap != null && !arrayingMirror.arrayingElementsMap.isEmpty()) {
            if (!this.chibiMgr.checkHadHero(arrayingMirror)) {
               arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
            }
         } else {
            arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         }

         if (arrayingMirror == null || arrayingMirror.arrayingElementsMap == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
            this.logger.error("赤壁之战发送阵容给跨服的时候 阵容为空");
            return;
         }

         byte[] bytes = arrayingMirror.toByteArray();
         if (bytes == null) {
            this.logger.error("赤壁之战发送阵容给跨服的时候 阵容为空!!!");
         }

         builder.setArraying(ByteString.copyFrom(bytes));
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         this.logger.info("赤壁之战发送阵营到跨服");
      }

   }

   @MsgHandlerAnno
   public void S2S_NotifyTerminationAward_4362(RedCliffMsg.S2S_NotifyTerminationAward_4362 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      if (msg.getType() == 1) {
         CentreAwardModel rewardModel = this.getCentreAwardModel(CentreAwardModel.TYPE_MERGE_CHIBI_CANCEL_SIGN_REWARD, 0L);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), rewardModel.getDesc(), rewardModel.getItems(), 604800000L, 46, 4607);
      } else {
         CentreAwardModel rewardModel = this.getCentreAwardModel(CentreAwardModel.TYPE_MERGE_CHANGE_CHIBI_CANCEL_SIGN_REWARD, 0L);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), rewardModel.getDesc(), rewardModel.getItems(), 604800000L, 46, 4607);
      }

      this.logger.info("S2S_NotifyTerminationAward_4362 联盟对阵取消报名 并发送补偿 playerId: {},{}", this.player.getPlayerId(), msg.getType());
      this.resetWeek();
   }

   @MsgHandlerAnno
   public void S2S_NotifyCancelSign_4363(RedCliffMsg.S2S_NotifyCancelSign_4363 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.logger.info("S2S_NotifyCancelSign_4363 联盟对阵取消报名", this.player.getPlayerId());
      this.resetWeek();
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

   public void gmOp(int status) {
      this.logger.info("赤壁之战执行gm命令：" + status);
      if (status == 0) {
         this.gmStatus = status;
      } else if (status == 1) {
         this.gmStatus = status;
      } else if (status == 2) {
         this.gmStatus = status;
      } else if (status == 3) {
         this.gmStatus = status;
      } else if (status == 4) {
         this.gmStatus = status;
      } else if (status == 5) {
         this.gmStatus = status;
      } else if (status == 11) {
         RedCliffMsg.C2S_Info_4303.Builder builder = RedCliffMsg.C2S_Info_4303.newBuilder();
         this.C2S_RedCliff_Info_4303(builder.build(), "");
      } else if (status == 12) {
         RedCliffMsg.C2S_SignUp_4330.Builder builder = RedCliffMsg.C2S_SignUp_4330.newBuilder();
         this.C2S_SignUp_4330(builder.build(), "");
      } else if (status == 13) {
         RedCliffMsg.C2S_SelectNation_4307.Builder builder = RedCliffMsg.C2S_SelectNation_4307.newBuilder();
         builder.setNation(1);
         this.C2S_SelectNation_4307(builder.build(), "");
      } else if (status == 99) {
         this.clearChip();
         this.resetWeek();
      }

      RedCliffMsg.S2S_GM_4332.Builder builder = RedCliffMsg.S2S_GM_4332.newBuilder();
      builder.setOp(status);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public void clearChip() {
      PlayerDao playerDao = this.player.getPlayerDao();
      playerDao.chibi_chip = 0;
      playerDao.updateOp();
   }

   public void resetWeek() {
      RedCliffDao redCliffDao = (RedCliffDao)this.player.getData("tb_red_cliff", this.player.getPlayerId());
      redCliffDao.status = 0;
      redCliffDao.event.clear();
      redCliffDao.updateOp();
   }

   @TaskMethod
   public void autoUpdate() {
      RedCliffDao redCliffDao = (RedCliffDao)this.player.getData("tb_red_cliff", this.player.getPlayerId());
      redCliffDao.status = 2;
      redCliffDao.updateOp();
   }

   public void loginHandle() {
      LocalTime time = LocalTime.now();
      if (DateUtil.todayOfWeek() != 1 || time.getHour() != 20) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (playerDao.chibi_chip > 0) {
            playerDao.chibi_chip = 0;
            playerDao.updateOp();
         }
      }

   }
}
