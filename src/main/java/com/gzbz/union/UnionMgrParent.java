package com.gzbz.union;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.UnionApplyDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.UnionLog;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.db.UnionWarAttackLogDao;
import com.gzbz.db.WorldDao;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.UnionCopyModel;
import com.gzbz.model.UnionWarDifficultyModel;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CrossUnionWarMsg;
import com.gzbz.protobuf.UnionMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.redis.GameRedisTool;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.bean.UnionWarAgainstData;
import com.gzbz.union.bean.UnionWarStrongholdData;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import misc.DateUtil;
import net.CrossSubscribeMsg;
import org.redisson.api.RMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import proto.SerializingUtil;

@MgrAnno
@Component
public class UnionMgrParent extends GameMgr {
   private static final Logger logger = LoggerFactory.getLogger(UnionMgrParent.class);
   private final WorldMgr worldMgr;
   private final CrossNettyClient crossNettyClient;
   private final Map<Integer, UnionMgr> unionMgrMap = new ConcurrentHashMap();
   public int warStatus = 0;
   public int warUpdateTime = 0;
   public long warBoxEndTime = 0L;
   public Map<Integer, UnionWarAgainstData> unionWarAgainstDataMap = new ConcurrentHashMap();
   private ScheduledFuture<?> unionWarJob;

   public UnionMgrParent(WorldMgr worldMgr, CrossNettyClient crossNettyClient) {
      this.worldMgr = worldMgr;
      this.crossNettyClient = crossNettyClient;
   }

   public void initData() {
      List<UnionDao> unionDaoList = new ArrayList(this.getUnionDaoMap().values());
      if (!unionDaoList.isEmpty()) {
         unionDaoList.sort((o1, o2) -> o2.unionId - o1.unionId);
         unionDaoList.forEach((unionDao) -> {
            UnionMgr unionMgr = (UnionMgr)super.context.getBean(UnionMgr.class);
            unionMgr.setUnionDao(unionDao);
            this.unionMgrMap.put(unionDao.unionId, unionMgr);
            this.pushTask(unionMgr::initData);
         });
         this.worldMgr.getWorldDao(GameDefine.WorldModule.WORLD_DAO_UNION_COPY);
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionList_6901(UnionMsg.C2S_UnionList_6901 msg, String source) {
      int playerId = msg.getPlayerId();
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
      this.sendUnionList(gamePlayer);
   }

   @MsgHandlerAnno
   public void CR2S_UnionWarAgainstList_10103(CrossUnionWarMsg.CR2S_UnionWarAgainstList_10103 msg, CrossSubscribeMsg crossSubscribeMsg) {
      logger.info("收到跨服发来军团争霸对阵列表");
      this.unionWarAgainstDataMap.clear();
      msg.getAgainstListList().forEach((bytes) -> {
         UnionWarAgainstData warAgainstData = (UnionWarAgainstData)SerializingUtil.deserialize(bytes.toByteArray(), UnionWarAgainstData.class);
         this.unionWarAgainstDataMap.put(warAgainstData.getId(), warAgainstData);
      });
      this.unionWarAgainstDataMap.values().forEach((leftData) -> {
         if (leftData.getEnemy() > 0) {
            UnionWarAgainstData rightData = (UnionWarAgainstData)this.unionWarAgainstDataMap.get(leftData.getEnemy());
            if (rightData != null) {
               logger.info("{}-{}-{} VS {}-{}-{}", new Object[]{leftData.getId(), leftData.getName(), rightData.getStar(), rightData.getId(), rightData.getName(), leftData.getStar()});
            }
         }

      });
   }

   @MsgHandlerAnno
   public void CR2S_UnionWarStrongholdList_10105(CrossUnionWarMsg.CR2S_UnionWarStrongholdList_10105 msg, CrossSubscribeMsg crossSubscribeMsg) {
      UnionWarAgainstData unionWarAgainstData = (UnionWarAgainstData)this.unionWarAgainstDataMap.get(msg.getUnionId());
      if (unionWarAgainstData == null) {
         logger.error("军团争霸,军团【{}】对阵信息不存在,重新创建", msg.getUnionId());
         unionWarAgainstData = new UnionWarAgainstData();
         this.unionWarAgainstDataMap.put(msg.getUnionId(), unionWarAgainstData);
      }

      logger.info("收到军团【{}】战略点信息", unionWarAgainstData.getName());

      for(CrossUnionWarMsg.WarStrongholdData strongholdData : msg.getStrongholdListList()) {
         UnionWarStrongholdData unionWarStrongholdData = (UnionWarStrongholdData)SerializingUtil.deserialize(strongholdData.getStronghold().toByteArray(), UnionWarStrongholdData.class);
         unionWarAgainstData.getStrongholdDataMap().put(strongholdData.getPosition(), unionWarStrongholdData);
      }

   }

   @MsgHandlerAnno
   public void CR2S_UnionWarStatusChange_10107(CrossUnionWarMsg.CR2S_UnionWarStatusChange_10107 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int oldStatus = this.warStatus;
      this.warStatus = msg.getStatus();
      this.warUpdateTime = msg.getUpdateTime();
      if (this.warStatus == 0) {
         this.unionWarClose();
      } else if (this.warStatus == 1) {
         if (oldStatus != this.warStatus) {
            this.unionWarSign();
         }

      } else {
         if (this.warStatus == 2) {
            this.unionWarOpen();
         } else if (this.warStatus == 3) {
            this.unionWarFight();
         } else if (this.warStatus == 4) {
            this.unionWarSettle();
         }

         if (this.warStatus >= 2) {
            for(UnionMgr unionMgr : this.unionMgrMap.values()) {
               this.pushTask(() -> {
                  unionMgr.broadcastWarAgainstData();
                  unionMgr.broadcastWarInfo();
               });
            }
         }

      }
   }

   @MsgHandlerAnno
   public void CR2S_UnionWarAttackLogNotify_10109(CrossUnionWarMsg.CR2S_UnionWarAttackLogNotify_10109 msg, CrossSubscribeMsg crossSubscribeMsg) {
      UnionMgr unionMgr = (UnionMgr)this.unionMgrMap.get(msg.getUnionId());
      if (unionMgr != null) {
         UnionWarAttackLogDao warAttackLogData = (UnionWarAttackLogDao)SerializingUtil.deserialize(msg.getLogData().toByteArray(), UnionWarAttackLogDao.class);
         warAttackLogData.unionId = msg.getUnionId();
         warAttackLogData.size = 2;
         unionMgr.addWarHoldLog(warAttackLogData);
      }

   }

   @MsgHandlerAnno
   public void CR2S_UnionWarStarChange_10115(CrossUnionWarMsg.CR2S_UnionWarStarChange_10115 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (this.unionWarAgainstDataMap.containsKey(msg.getUnionId())) {
         UnionWarAgainstData againstData = (UnionWarAgainstData)this.unionWarAgainstDataMap.get(msg.getUnionId());
         againstData.setStar(msg.getTotalStar());
         UnionWarStrongholdData unionWarStrongholdData = (UnionWarStrongholdData)againstData.getStrongholdDataMap().get(msg.getHoldPos());
         if (unionWarStrongholdData != null) {
            Map<Integer, UnionWarDifficultyModel> unionWarDifficultyModelMap = ApplicationContextProvider.<Integer, UnionWarDifficultyModel>getModelPoolMap("unionWarDifficulty");
            unionWarStrongholdData.setMaxStar(Math.min(msg.getMaxStar(), unionWarDifficultyModelMap.size()));
            UnionMgr unionMgr = (UnionMgr)this.unionMgrMap.get(msg.getUnionId());
            if (unionMgr != null) {
               unionMgr.broadcastOurAgainstData();
               unionMgr.broadcastWarStrongholdData(msg.getUnionId(), msg.getHoldPos());
            }
         }
      }

   }

   @MsgHandlerAnno
   public void CR2S_UnionWarServerMove_10114(CrossUnionWarMsg.CR2S_UnionWarServerMove_10114 msg, CrossSubscribeMsg crossSubscribeMsg) {
      logger.info("【军团争霸】将游戏服【{}】从跨服分区中移除,结算军团【{}】", msg.getServerId(), msg.getUnionId());
      UnionMgr unionMgr = (UnionMgr)this.unionMgrMap.get(msg.getUnionId());
      if (unionMgr != null) {
         if (!msg.getIsMerge() && DateUtil.isSameDay(System.currentTimeMillis(), this.worldMgr.getMergeServerTime())) {
            RMap<String, String> map = this.worldMgr.getServerInfoFromRedis(this.worldMgr.GAME_SERVER_ID);
            if (null != map && map.containsKey("waitMergeSlaveServerIds")) {
               String slaveServerIds = (String)map.get("waitMergeSlaveServerIds");
               if (!StringUtils.isEmpty(slaveServerIds)) {
                  HashSet<String> slaveServerSet = new HashSet(Arrays.asList(slaveServerIds.split(";")));
                  if (slaveServerSet.contains(String.valueOf(unionMgr.getUnion().serverId))) {
                     logger.info("调整该服分区与合服为同一天,不结算军团【{}】", msg.getUnionId());
                     return;
                  }
               }
            }
         }

         unionMgr.unionWarServerMove(msg.getMemberIdList(), msg.getIsMerge());
      }
   }

   @TaskMethod
   public void unionWarCrossDisconnect() {
      if (this.warStatus != 0) {
         logger.info("军团争霸关闭");
         this.warStatus = 0;
         this.warUpdateTime = 0;
         this.warBoxEndTime = 0L;
         if (this.unionWarJob != null) {
            this.unionWarJob.cancel(false);
            this.unionWarJob = null;
         }

         for(UnionMgr unionMgr : this.getUnionMgrMap().values()) {
            this.pushTask(unionMgr::broadcastWarStatus);
         }

      }
   }

   public void unionWarStatusChange(int status) {
      CrossUnionWarMsg.S2CR_UnionWarStatusChange_10106.Builder msg = CrossUnionWarMsg.S2CR_UnionWarStatusChange_10106.newBuilder();
      msg.setStatus(status);
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, msg.build());
   }

   public void requestCrossData() {
      this.pushTask(() -> {
         CrossUnionWarMsg.S2CR_UnionWarServerInit_10102.Builder msg = CrossUnionWarMsg.S2CR_UnionWarServerInit_10102.newBuilder();
         this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, msg.build());
      });
   }

   public void unionWarSign() {
      logger.info("军团争霸报名");
      this.cancelUnionWarJob();
      this.unionMgrMap.values().forEach((unionMgr) -> this.pushTask(unionMgr::checkUnionWarMatch));
   }

   public void unionWarOpen() {
      logger.info("军团争霸开启");
      this.cancelUnionWarJob();
      this.unionMgrMap.values().forEach((unionMgr) -> this.pushTask(unionMgr::unionWarOpen));
   }

   public void unionWarFight() {
      logger.info("军团争霸开战");

      for(UnionMgr unionMgr : this.unionMgrMap.values()) {
         unionMgr.unionWarFight();
      }

   }

   public void unionWarSettle() {
      logger.info("军团争霸结算");
      this.cancelUnionWarJob();
      String[] unionWarAgainstTime = ApplicationContextProvider.getConfigString("unionWarAgainstTime", "12:00|20:00").split("\\|");
      String[] unionWarSettleTime = unionWarAgainstTime[1].split(":");
      Calendar calendar = Calendar.getInstance();
      calendar.set(11, Integer.parseInt(unionWarSettleTime[0]));
      this.warBoxEndTime = calendar.getTimeInMillis() + 28800000L;
      this.unionMgrMap.values().forEach((unionMgr) -> this.pushTask(unionMgr::unionWarSettle));
   }

   public void unionWarClose() {
      logger.info("军团争霸关闭");
      this.cancelUnionWarJob();
      this.unionMgrMap.values().forEach((unionMgr) -> this.pushTask(unionMgr::warClose));
      this.pushTask(() -> {
         this.unionWarAgainstDataMap.clear();
         this.gameCachePool.deleteAll("tb_union_war_attack_log");
      });
   }

   private void cancelUnionWarJob() {
      if (this.unionWarJob != null) {
         this.unionWarJob.cancel(false);
         this.unionWarJob = null;
      }

   }

   private void checkFightingStronghold() {
      if (this.unionWarJob != null) {
         this.unionMgrMap.values().forEach((unionMgr) -> this.pushTask(unionMgr::checkFightingStronghold));
      }
   }

   public void broadcast(int unionId, GeneratedMessageV3 messageV3, List<Integer> excludePlayers) {
      UnionMgr unionMgr = this.getUnionMgr(unionId);
      if (unionMgr != null) {
         this.pushTask(() -> unionMgr.broadcast(messageV3, excludePlayers));
      }
   }

   public void hourReset() {
      this.unionMgrMap.values().forEach((unionMgr) -> this.pushTask(unionMgr::hourReset));
   }

   public void dailyReset() {
      WorldDao<HashSet<Integer>> worldDao = this.worldMgr.<HashSet<Integer>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_UNION_COPY);
      ((HashSet)worldDao.jsonData).clear();
      worldDao.updateOp();
      this.unionMgrMap.values().forEach(UnionMgr::dailyReset);
   }

   public void updateCombatPower() {
      this.unionMgrMap.values().forEach(UnionMgr::updateCombatPower);
   }

   public void createUnion(UnionDao dao) {
      dao.level = 1;
      dao.createTime = System.currentTimeMillis();
      TreeMap<Integer, UnionCopyModel> copyModels = (TreeMap)ApplicationContextProvider.getModelPoolMap("customUnionCopy").get(0);
      dao.copyId = (Integer)copyModels.firstEntry().getKey();
      dao.masterHp = ((UnionCopyModel)copyModels.firstEntry().getValue()).getCopyMasterHp();
      this.gameCachePool.insertDao(dao, true);
      UnionMgr unionMgr = this.createUnionMgr(dao);
      unionMgr.initData();
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(dao.leaderId);
      if (gamePlayer != null) {
         unionMgr.joinUnion(gamePlayer, true);
      }

      unionMgr.uploadToCross(false, false);
   }

   private UnionMgr createUnionMgr(UnionDao dao) {
      UnionMgr unionMgr = (UnionMgr)super.context.getBean(UnionMgr.class);
      unionMgr.setUnionDao(dao);
      this.unionMgrMap.put(dao.unionId, unionMgr);
      return unionMgr;
   }

   public UnionMgr getUnionMgr(int unionId) {
      return (UnionMgr)this.unionMgrMap.get(unionId);
   }

   public void dismissUnion(int unionId) {
      UnionMgr unionMgr = this.getUnionMgr(unionId);
      UnionDao unionDao = unionMgr.getUnion();
      unionMgr.clearMembers();
      unionMgr.getUnionRedPackets().values().forEach(unionMgr::removeGiveRedPacket);

      for(UnionLog unionLog : unionMgr.getUnionLogList()) {
         unionMgr.removeUnionLog(unionLog);
      }

      for(UnionWarAttackLogDao unionWarAttackLogDao : unionMgr.getAttackLogs()) {
         this.getGameCachePool().deleteDao(unionWarAttackLogDao, false);
      }

      for(UnionApplyDao unionApplyDao : unionMgr.getUnionAllApply().values()) {
         this.getGameCachePool().deleteDao(unionApplyDao, false);
      }

      unionMgr.uploadToCross(false, true);
      this.getGameCachePool().deleteDao(unionDao, true);
      this.unionMgrMap.remove(unionId);
   }

   public void sendUnionList(GamePlayer player) {
      if (player != null) {
         Set<Integer> applyIds = new HashSet();
         UnionMsg.S2C_UnionList_6902.Builder builder = UnionMsg.S2C_UnionList_6902.newBuilder();
         this.unionMgrMap.values().forEach((unionMgr) -> {
            UnionMsg.UnionData unionData = unionMgr.buildUnionData();
            if (unionData != null) {
               builder.addUnion(unionData);
               if (unionMgr.getUnionApply(player.getPlayerId()) != null) {
                  applyIds.add(unionMgr.getUnion().unionId);
               }
            }

         });
         builder.addAllApplyUnionId(applyIds);
         player.sendMsg(builder.build());
      }
   }

   public boolean checkUnionName(String unionName, int unionId) {
      UnionDao dao = this.getUnion(unionName);
      if (dao == null) {
         return true;
      } else {
         return unionId > 0 && dao.unionId == unionId;
      }
   }

   private UnionDao getUnion(String unionName) {
      Optional<UnionMgr> optional = this.getUnionMgrMap().values().stream().filter((unionMgr) -> unionMgr.getUnion().unionName.equals(unionName)).findFirst();
      return (UnionDao)optional.map(UnionMgr::getUnion).orElse(null);
   }

   public Map<Integer, UnionMgr> getUnionMgrMap() {
      return this.unionMgrMap;
   }

   public Map<Integer, UnionDao> getUnionDaoMap() {
      return this.gameCachePool.getAllTableByMap("tb_union");
   }

   protected void init() {
   }

   @TaskMethod
   public void sendUnion(int unionId, GamePlayer gamePlayer) {
      UnionMgr unionMgr = (UnionMgr)this.getUnionMgrMap().get(unionId);
      if (unionMgr != null) {
         unionMgr.sendUnion(gamePlayer);
      }
   }

   public void _slaveServerMergeBegin(int mainServerId) throws Exception {
      GameRedisTool gameRedisTool = (GameRedisTool)ApplicationContextProvider.getContext().getBean(GameRedisTool.class);
      RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);

      for(String unionCopyKey : gameRedisTool.getClient().getKeys().getKeysByPattern(this.worldMgr.PLATFORM_NAME + ":server_" + this.worldMgr.GAME_SERVER_ID + ":rank:union_copy:*")) {
         String[] split = unionCopyKey.split(":");
         if (split[split.length - 1].equals("prev")) {
            rankMgr.mergeInSlaveRankToMain(mainServerId, 9999, RankDefine.RankModule.UNION_COPY, split[split.length - 3], split[split.length - 2], split[split.length - 1]);
         } else {
            rankMgr.mergeInSlaveRankToMain(mainServerId, 9999, RankDefine.RankModule.UNION_COPY, split[split.length - 2], split[split.length - 1]);
         }
      }

   }

   public void _mainServerMergeFinish(HashSet<Integer> slaveServerSet) throws Exception {
      Set<String> curServerUnionNameSet = new HashSet();
      List<UnionDao> slaveServerUnions = new ArrayList();

      for(UnionMgr unionMgr : this.getUnionMgrMap().values()) {
         UnionDao unionDao = unionMgr.getUnion();
         if (!slaveServerSet.contains(unionDao.serverId)) {
            curServerUnionNameSet.add(unionDao.unionName);
         } else {
            slaveServerUnions.add(unionDao);
         }
      }

      for(UnionDao unionDao : slaveServerUnions) {
         if (curServerUnionNameSet.contains(unionDao.unionName)) {
            unionDao.unionName = "s" + unionDao.serverId + "_" + unionDao.unionName;
            unionDao.updateOp();
            curServerUnionNameSet.add(unionDao.unionName);
            GamePlayer leaderPlayer = this.worldMgr.getPlayerById(unionDao.leaderId);
            if (leaderPlayer != null) {
               leaderPlayer.pushTask(() -> {
                  Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
                  TreeMap<Integer, CentreAwardModel> blessRewardMap = (TreeMap)allAwardModelMap.get(CentreAwardModel.TYPE_COMBINE_REPEAT_U_NAME_CONTENT);
                  if (null != blessRewardMap) {
                     CentreAwardModel awardModel = (CentreAwardModel)blessRewardMap.firstEntry().getValue();
                     MailPart mailPart = (MailPart)leaderPlayer.getMgrPart(MailPart.class);
                     int logReason = 9202;
                     mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_SYSTEM, awardModel.getTitle(), awardModel.getDesc(), awardModel.getItems(), MailPart.FOREVER, -1, logReason);
                  }

               });
            }

            UnionMgr unionMgr = (UnionMgr)this.getUnionMgrMap().get(unionDao.unionId);
            if (unionMgr != null) {
               unionMgr.uploadToCross(false, false);
            }
         }
      }

   }

   @TaskMethod
   public void unionRemoveMemberBatch(Set<Integer> memberList, PlayerPart playerPart) {
      Set<Integer> removeList = new HashSet();
      Set<Integer> failList = new HashSet();
      PlayerDao playerDao = playerPart.getPlayer().getPlayerDao();
      UnionMgr unionMgr = this.getUnionMgr(playerDao.unionId);
      if (unionMgr == null) {
         this.sendRemoveMemberResult(playerPart, 23, "移除军团成员失败,执行移除的玩家没有加入军团", failList, memberList);
      } else {
         UnionMemberDao opUnionMemberDao = unionMgr.getUnionMember(playerDao.playerId);
         if (opUnionMemberDao == null) {
            this.sendRemoveMemberResult(playerPart, 23, "移除军团成员失败,执行移除的玩家没有加入军团", failList, memberList);
         } else if (this.warStatus > 0 && unionMgr.warIsMatch) {
            this.sendRemoveMemberResult(playerPart, 9025, "退出军团请求失败,军团争霸期间禁止退出军团", failList, memberList);
         } else {
            for(int memberId : memberList) {
               GamePlayer memberPlayer = this.worldMgr.getPlayerById(memberId);
               if (memberPlayer == null) {
                  failList.add(memberId);
                  logger.info("移除军团成员失败,被移除的玩家{}不存在", memberId);
               } else {
                  UnionMemberDao memberDao = unionMgr.getUnionMember(memberId);
                  if (memberDao == null) {
                     failList.add(memberId);
                     logger.info("移除军团成员失败，玩家{}未加入军团", memberId);
                  } else if (!this.checkPermission(opUnionMemberDao.position, memberDao.position)) {
                     logger.info("移除军团成员失败,权限不足,执行的玩家{} 职位{} 被移除成员{} 职位{}", new Object[]{playerDao.playerId, opUnionMemberDao.position, memberId, memberDao.position});
                     failList.add(memberId);
                  } else {
                     removeList.add(memberId);
                     unionMgr.exitUnion(memberId);
                     UnionDao unionDao = unionMgr.getUnion();
                     PlayerPublicDao memberPlayerDao = memberPlayer.getPublicDao();
                     unionMgr.addLog(playerDao.unionId, 12, playerDao.playerName, memberPlayerDao.playerName);
                     LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "KickOutOfTheLeague");
                     String content = MessageFormat.format(languageModel.getValue(), memberPlayerDao.playerName);
                     ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
                     chatMgr.sendUnionSystem(unionDao.unionId, content, 3);
                     String positionDesc = "";
                     switch (opUnionMemberDao.position) {
                        case 1:
                           positionDesc = "团长";
                           break;
                        case 2:
                           positionDesc = "副团长";
                     }

                     unionMgr.sendMail(memberId, CentreAwardModel.TYPE_UNION_BE_MOVE, positionDesc, playerPart.getPlayer().getPlayerDao().playerName);
                  }
               }
            }

            this.sendRemoveMemberResult(playerPart, 1, "批量删除军团成员", removeList, failList);
         }
      }
   }

   private void sendRemoveMemberResult(PlayerPart playerPart, int code, String message, Set<Integer> removeList, Set<Integer> failList) {
      logger.info("批量删除军团成员 操作者:{} 成功删除:{} 失败:{}", new Object[]{playerPart.getPlayer().getPlayerId(), removeList, failList});
      if (code != 1) {
         logger.info(message);
         playerPart.getPlayer().failure(code);
      } else {
         UnionMsg.S2C_UnionRemoveMemberBatch_6994.Builder builder = UnionMsg.S2C_UnionRemoveMemberBatch_6994.newBuilder();
         builder.addAllMembers(removeList);
         builder.addAllFail(failList);
         builder.setResult(code);
         playerPart.getPlayer().sendMsg(builder.build());
         UnionMgr unionMgr = this.getUnionMgr(playerPart.getPlayer().getPlayerDao().unionId);
         unionMgr.sendMemberLeavl(removeList);
      }
   }

   public boolean checkPermission(int positions, int removePositions) {
      switch (removePositions) {
         case 1:
            return false;
         case 2:
            return positions == 1;
         case 3:
            return positions == 1 || positions == 2;
         default:
            return false;
      }
   }
}
