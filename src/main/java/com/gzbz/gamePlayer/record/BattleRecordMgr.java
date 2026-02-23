package com.gzbz.gamePlayer.record;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import cache.CacheHashMap;
import com.gzbz.db.BattleRecordDao;
import com.gzbz.db.BattleRecordExtendDao;
import com.gzbz.db.BattleTempleDao;
import com.gzbz.db.GameDBPool;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.SuggestPowerDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.bean.ExpeditionBuffAddtionData;
import com.gzbz.db.bean.ExpeditionRecordData;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.db.bean.TempleData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.Ladder.LadderPart;
import com.gzbz.gamePlayer.battle.BattleTempleMgr;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.peak.PeakBattlePart;
import com.gzbz.log.ErrorRecordLog;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.BattleTempleModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.LevelPromoteModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleDailyMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.BattleRecordMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.DBServerMsg;
import com.gzbz.protobuf.ExpeditionMsg;
import com.gzbz.protobuf.LadderMsg;
import com.gzbz.protobuf.LevelPromoteMsg;
import com.gzbz.protobuf.PeakBattleMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.redis.GameRedisTool;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.transport.part.WaterTransportPart;
import com.gzbz.udp.DBNettyClient;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import db.DBTableNode;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import misc.DateUtil;
import misc.MapUtil;
import net.CrossSubscribeMsg;
import org.redisson.api.RMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component
@MgrAnno
public class BattleRecordMgr extends GameMgr {
   Logger logger = LoggerFactory.getLogger(BattleRecordMgr.class);
   @Autowired
   private GameDBPool dbPool;
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private DBNettyClient dbNettyClient;
   @Autowired
   private OnLineMgr onLineMgr;
   @Autowired
   private LogOperationMgr logOperationMgr;
   public static final int DELAY_TIME = 300000;
   public static final long SHARE_DEL_TIME = 604800000L;
   public static final long MODEL_DEL_TIME = 172800000L;
   private LinkedList hotList = new LinkedList();
   private List<Integer> fivePvpList = new ArrayList();
   private static String QUERY_BATTLE_RECORD = "SELECT id,model,creatTime,enableTime FROM tb_battle_record WHERE playerId= ? AND model not in (2000,2040,2041,2042,1500)  ORDER BY id DESC LIMIT 30,100;";
   private static String DEL_BATTLERECORD_BY_MODEL_ALL = "DELETE  FROM tb_battle_record WHERE model = ? ";
   private static String DEL_BATTLERECORD_BY_MODEL = "DELETE a FROM tb_battle_record a LEFT JOIN tb_battle_record_extend b ON a.id=b.id   WHERE  a.model = ?  AND  b.collectList IS NULL; ";
   private static String DEL_BATTLERECORD_EXTEND_BY_MODEL_ALL = "DELETE  FROM tb_battle_record_extend WHERE model = ? ";
   private static String DEL_BATTLERECORD_EXTEND_BY_MODEL = "DELETE a FROM tb_battle_record_extend a  LEFT JOIN tb_battle_record b ON a.id=b.id WHERE a.model=? AND  b.id IS NULL; ";
   private static String DEL_ONE_RECORD = "DELETE  FROM tb_battle_record WHERE id = ? ";
   public static Comparator<BattleRecordDao> valDescComparator = (r1, r2) -> {
      if (r1.creatTime.getTime() > r2.creatTime.getTime()) {
         return 1;
      } else if (r1.creatTime.getTime() < r2.creatTime.getTime()) {
         return -1;
      } else {
         return r1.playerId - r2.playerId > 0 ? 1 : -1;
      }
   };

   protected void init() {
      super.gameCachePool.setOpenCheckExpire(true);
      super.gameCachePool.addUnCacheTable("tb_battle_record");
      super.gameCachePool.setExpire_time(180000L);
      this.schedule(300000L, this::hotRecord);
   }

   public void hotRecord() {
      if (!this.fivePvpList.isEmpty()) {
         List<Integer> tempList = new ArrayList();
         tempList.addAll(this.fivePvpList);
         this.fivePvpList.clear();
         if (tempList.size() <= 5) {
            for(Integer recordId : tempList) {
               this.hotList.addFirst(recordId);
            }
         } else {
            Collections.shuffle(tempList);

            for(int i = 0; i < 5; ++i) {
               this.hotList.addFirst(tempList.get(i));
            }
         }

         int needNum = this.hotList.size() - 20;
         if (needNum > 0) {
            for(int i = 0; i < needNum; ++i) {
               this.hotList.removeLast();
            }
         }
      }

      this.schedule(300000L, this::hotRecord);
   }

   @TaskMethod
   public void checkPlayerBattleRecord(int playerId) {
      GameDBPool dbPool = (GameDBPool)ApplicationContextProvider.getContext().getBean(GameDBPool.class);
      List<BattleRecordDao> battleRecordDaoList = new ArrayList();
      List<Integer> recordIdList = new ArrayList();

      try {
         dbPool.query(QUERY_BATTLE_RECORD, (resultSet) -> {
            try {
               while(resultSet.next()) {
                  BattleRecordDao battleRecordDao = new BattleRecordDao();
                  battleRecordDao.id = resultSet.getInt("id");
                  battleRecordDao.model = resultSet.getInt("model");
                  battleRecordDao.creatTime = resultSet.getTimestamp("creatTime");
                  battleRecordDao.enableTime = (long)resultSet.getInt("enableTime");
                  battleRecordDaoList.add(battleRecordDao);
                  recordIdList.add(battleRecordDao.id);
               }
            } catch (Exception e) {
               e.printStackTrace();
            }

         }, new Object[]{playerId});
      } catch (Throwable t) {
         t.printStackTrace();
      }

      List<BattleRecordDao> forDelList = new ArrayList();
      if (!recordIdList.isEmpty()) {
         this.getBattleRecordExtendDao(recordIdList, (map) -> {
            for(BattleRecordDao dao : battleRecordDaoList) {
               BattleRecordExtendDao battleRecordExtendDao = (BattleRecordExtendDao)map.get(dao.id);
               if (this.isEnableDelRecordOrExtend(battleRecordExtendDao) && this.isEnableDelRecord(dao)) {
                  forDelList.add(dao);
               }
            }

            if (!forDelList.isEmpty()) {
               List<Integer> delIdList = new ArrayList();
               StringBuffer sb = new StringBuffer();
               sb.append("DELETE  FROM tb_battle_record WHERE  id in(");
               int tempNum = 0;

               for(BattleRecordDao dao : forDelList) {
                  ++tempNum;
                  sb.append("?");
                  delIdList.add(dao.id);
                  if (tempNum != forDelList.size()) {
                     sb.append(",");
                  }
               }

               sb.append(");");

               try {
                  dbPool.delBySql(sb.toString(), delIdList.toArray());
               } catch (Throwable t) {
                  t.printStackTrace();
               }

               for(BattleRecordDao dao : forDelList) {
                  BattleRecordExtendDao battleRecordExtendDao = (BattleRecordExtendDao)map.get(dao.id);
                  if (battleRecordExtendDao != null) {
                     this.gameCachePool.deleteDao(battleRecordExtendDao, false);
                  }
               }

               GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
               if (gamePlayer != null) {
                  gamePlayer.pushTask(() -> {
                     WaterTransportPart waterTransportPart = (WaterTransportPart)gamePlayer.getMgrPart(WaterTransportPart.class);
                     waterTransportPart.delRecord(forDelList);
                  });
               }

            }
         });
      }
   }

   @TaskMethod
   public void delBattleRecordDao(int recordId) {
      this.getBattleRecordExtendDao(recordId, (map) -> {
         BattleRecordExtendDao battleRecordExtendDao = (BattleRecordExtendDao)map.get(recordId);
         if (battleRecordExtendDao != null) {
            this.gameCachePool.deleteDao(battleRecordExtendDao, false);
         }

      });

      try {
         this.dbPool.delBySql(DEL_ONE_RECORD, new Object[]{recordId});
      } catch (Throwable throwable) {
         throwable.printStackTrace();
      }

   }

   public BattleMsg.S2C_BattleResult_6102.Builder addBattleRecord(int modelId, int chapterId, int attackPlayerId, int defPlayerId, BattleMsg.S2C_BattleResult_6102.Builder fightMsg) {
      if (fightMsg != null && fightMsg.getResult() != null) {
         boolean isSaveToMyServer = isSaveRecordToMyServer(modelId);
         List<BattleMsg.S2C_Battle_Round> roundList = null;
         if (!isSaveToMyServer) {
            roundList = fightMsg.getRoundsList();
         }

         BattleRecordDao battleRecordDao = new BattleRecordDao();
         battleRecordDao.playerId = attackPlayerId;
         battleRecordDao.defPlayerId = defPlayerId;
         battleRecordDao.model = modelId;
         battleRecordDao.chapterId = chapterId;
         if (!isSaveToMyServer) {
            fightMsg.clearRounds();
         }

         battleRecordDao.stream = fightMsg.build().toByteArray();
         battleRecordDao.win = fightMsg.getResult().getResult();
         battleRecordDao.creatTime = new Timestamp(Long.valueOf((long)fightMsg.getStartTime()) * 1000L);
         if (this.isNeedFightEnd(modelId)) {
            battleRecordDao.enableTime = System.currentTimeMillis() + (long)(fightMsg.getCostTime() * 1000);
         }

         this.getGameCachePool().insertDao(battleRecordDao, true);
         BattleMsg.S2C_Battle_Result.Builder result = fightMsg.getResult().toBuilder();
         result.setRecordId(battleRecordDao.id);
         this.getPvpOrPve(modelId);
         if (modelId == 1040 && fightMsg.getResult().getResult() == 0) {
            int battleReportFightPower = this.configManager.getIntDefault("battleReportFightPower", 1000);
            BattleMsg.S2C_Battle_PKTeam left = fightMsg.getTeams(0);
            BattleMsg.S2C_Battle_PKTeam right = fightMsg.getTeams(1);
            long deltPower = left.getCombatPower() - right.getCombatPower();
            long maxPower = right.getCombatPower();
            if (deltPower > 0L) {
               maxPower = left.getCombatPower();
            }

            if (maxPower > 0L) {
               long per = Math.abs(deltPower * 10000L) / maxPower;
               if (per < (long)battleReportFightPower) {
                  this.fivePvpList.add(battleRecordDao.id);
               }
            }
         }

         fightMsg.setResult(result);
         if (!isSaveToMyServer) {
            fightMsg.addAllRounds(roundList);
            this.sendRecordToRecordServer(fightMsg, attackPlayerId);
         }

         this.calcHeroWinRate(fightMsg, modelId);
         return fightMsg;
      } else {
         throw new RuntimeException("没有战斗");
      }
   }

   public void calcHeroWinRate(BattleMsg.S2C_BattleResult_6102.Builder fightMsg, int modelId) {
      Map<Integer, HeroModel> heroModelMap = ApplicationContextProvider.getModelPool().getMap("hero");
      BattleMsg.S2C_Battle_PKTeam left = fightMsg.getTeams(0);

      for(BattleMsg.S2C_Battle_Entity s2C_battle_entity : left.getEntitesList()) {
         if (s2C_battle_entity.getType() == BattleMsg.EntityType.EntityType_Hero || s2C_battle_entity.getType() == BattleMsg.EntityType.EntityType_Friend) {
            int isWin = 1;
            if (fightMsg.getResult().getResult() == 0) {
               isWin = 0;
            }

            if (heroModelMap.containsKey(s2C_battle_entity.getHeroId())) {
               String heroName = ((HeroModel)heroModelMap.get(s2C_battle_entity.getHeroId())).getName();
               this.logOperationMgr.addHeroWinRate(heroName, s2C_battle_entity.getHeroInfo().getStar(), s2C_battle_entity.getHeroLv(), s2C_battle_entity.getHeroInfo().getCombatPower(), modelId, isWin);
            }
         }
      }

      BattleMsg.S2C_Battle_PKTeam right = fightMsg.getTeams(1);

      for(BattleMsg.S2C_Battle_Entity s2C_battle_entity : right.getEntitesList()) {
         if (s2C_battle_entity.getType() == BattleMsg.EntityType.EntityType_Hero || s2C_battle_entity.getType() == BattleMsg.EntityType.EntityType_Friend) {
            int isWin = 0;
            if (fightMsg.getResult().getResult() == 0) {
               isWin = 1;
            }

            if (heroModelMap.containsKey(s2C_battle_entity.getHeroId())) {
               String heroName = ((HeroModel)heroModelMap.get(s2C_battle_entity.getHeroId())).getName();
               this.logOperationMgr.addHeroWinRate(heroName, s2C_battle_entity.getHeroInfo().getStar(), s2C_battle_entity.getHeroLv(), s2C_battle_entity.getHeroInfo().getCombatPower(), modelId, isWin);
            }
         }
      }

   }

   public void sendRecordToRecordServer(BattleMsg.S2C_BattleResult_6102.Builder fightMsg, int attackPlayerId) {
      int id = fightMsg.getResult().getRecordId();
      int time = fightMsg.getStartTime();
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(attackPlayerId);
      int serverId = this.worldMgr.GAME_SERVER_ID;
      if (gamePlayer != null) {
         serverId = gamePlayer.getServerId();
      }

      BattleMsg.S2C_BattleResult_6102 build = fightMsg.build();
      this.dbNettyClient.sendBattleMsg(build, serverId, id, time);
      if (isSpecialRecord(build)) {
         this.dbNettyClient.sendSpecialRecord(build, time);
      }

   }

   @TaskMethod
   public void getRecordFromRecordServer(int serverId, int playerId, int recordId, int startTime, int type) {
      this.logger.info("获取DB录像，serverId={},playerId={},recordId={},startTime={},type={}", new Object[]{serverId, playerId, recordId, startTime, type});
      if (startTime > 0) {
         DBServerMsg.S2DB_RequireLog_14503.Builder require = DBServerMsg.S2DB_RequireLog_14503.newBuilder();
         require.setId(recordId);
         require.setTime((long)startTime);
         this.dbNettyClient.sendMsg(require.build(), playerId, serverId, this.dbNettyClient.PLATFORM_NAME, (byte)type);
      }
   }

   @TaskMethod
   public void playRecord(GamePlayer gamePlayer, int recordId) {
      BattleRecordDao battleRecordDao = this.getBattleRecordDao(recordId);
      if (battleRecordDao == null) {
         this.logger.info("战斗记录为空，ID={}", recordId);
         gamePlayer.failure(55009);
      } else {
         try {
            BattleMsg.S2C_BattleResult_6102.Builder builder = battleRecordDao.toS2C_BattleResult_6102();
            gamePlayer.sendMsg(builder.build());
         } catch (Exception var5) {
            this.delBattleRecordDao(battleRecordDao.id);
         }

      }
   }

   @TaskMethod
   public void C2S_BattleRecordData_6115(GamePlayer gamePlayer, int recordId) {
      BattleRecordDao battleRecordDao = this.getBattleRecordDao(recordId);
      if (battleRecordDao == null) {
         this.logger.info("战斗记录为空，ID={}", recordId);
      } else {
         try {
            BattleMsg.S2C_BattleRecordData_6116.Builder builder = BattleMsg.S2C_BattleRecordData_6116.newBuilder();
            builder.setResult(battleRecordDao.toS2C_BattleResult_6102());
            gamePlayer.sendMsg(builder.build());
         } catch (Exception var5) {
            this.delBattleRecordDao(battleRecordDao.id);
         }

      }
   }

   private int getPvpOrPve(int modelId) {
      int battle_type = 0;
      switch (modelId) {
         case 1014:
         case 1130:
         case 1240:
         case 1250:
         case 1260:
         case 1270:
         case 1470:
         case 1650:
         case 1960:
         case 1970:
         case 1980:
         case 1990:
         case 2130:
            battle_type = 1;
         default:
            return battle_type;
      }
   }

   @TaskMethod
   public void delRecord(List<Integer> needDelList) {
      if (!needDelList.isEmpty()) {
         this.getBattleRecordExtendDao(needDelList, (map) -> {
            List<Integer> enableDelList = new ArrayList();

            for(Integer recordId : needDelList) {
               BattleRecordExtendDao battleRecordExtendDao = (BattleRecordExtendDao)map.get(recordId);
               if (battleRecordExtendDao == null || battleRecordExtendDao.collectList.isEmpty()) {
                  enableDelList.add(recordId);
               }
            }

            StringBuffer sb = new StringBuffer();
            sb.append("DELETE  FROM tb_battle_record WHERE id in (");
            int tempNum = 0;

            for(Integer id : enableDelList) {
               ++tempNum;
               sb.append("?");
               if (tempNum != enableDelList.size()) {
                  sb.append(",");
               }
            }

            sb.append(");");

            try {
               this.dbPool.delBySql(sb.toString(), enableDelList.toArray());
            } catch (Throwable t) {
               t.printStackTrace();
            }

            for(Integer id : enableDelList) {
               BattleRecordExtendDao battleRecordExtendDao = (BattleRecordExtendDao)map.get(id);
               if (battleRecordExtendDao != null) {
                  this.gameCachePool.deleteDao(battleRecordExtendDao, false);
                  battleRecordExtendDao.updateOp();
               }
            }

         });
      }
   }

   public void delRecordOfRetainNeed(int model) {
      try {
         this.dbPool.delBySql(DEL_BATTLERECORD_BY_MODEL, new Object[]{model});
         this.dbPool.delBySql(DEL_BATTLERECORD_EXTEND_BY_MODEL, new Object[]{model});
      } catch (Throwable t) {
         t.printStackTrace();
      }

   }

   public void delRecordOfAllModel(int model) {
      try {
         this.dbPool.delBySql(DEL_BATTLERECORD_BY_MODEL_ALL, new Object[]{model});
         this.dbPool.delBySql(DEL_BATTLERECORD_EXTEND_BY_MODEL_ALL, new Object[]{model});
      } catch (Throwable t) {
         t.printStackTrace();
      }

   }

   public BattleRecordMsg.BattleRecordInfo.Builder toBattleRecordInfo(GamePlayer gamePlayer, BattleRecordDao battleRecordDao, BattleRecordExtendDao battleRecordExtendDao) {
      BattleRecordMsg.BattleRecordInfo.Builder infoBuilder = BattleRecordMsg.BattleRecordInfo.newBuilder();
      infoBuilder.setRecordId(battleRecordDao.id);
      GamePlayer attackPlayer = this.worldMgr.getPlayerById(battleRecordDao.playerId);
      if (attackPlayer != null) {
         infoBuilder.setServerId(attackPlayer.getServerId());
      }

      if (battleRecordExtendDao != null) {
         infoBuilder.setWatchNum(battleRecordExtendDao.beWatchNum);
         infoBuilder.setShareNum(battleRecordExtendDao.beShareNum);
         infoBuilder.setThumbsUpNum(battleRecordExtendDao.beThumbsUpNum);
         infoBuilder.setIsThumbsUp(battleRecordExtendDao.thumbsUpList.contains(gamePlayer.getPlayerId()));
         infoBuilder.setIsCollect(battleRecordExtendDao.collectList.contains(gamePlayer.getPlayerId()));
      } else {
         infoBuilder.setWatchNum(0);
         infoBuilder.setShareNum(0);
         infoBuilder.setThumbsUpNum(0);
         infoBuilder.setIsThumbsUp(false);
         infoBuilder.setIsCollect(false);
      }

      try {
         BattleMsg.S2C_BattleResult_6102.Builder recordBuilder = battleRecordDao.toS2C_BattleResult_6102();
         recordBuilder.clearRounds();
         infoBuilder.setResult(recordBuilder);
         return infoBuilder;
      } catch (Exception var7) {
         this.logger.error("战斗回放处理错误");
         this.pushTaskEx("delBattleRecordDao", new Object[]{battleRecordDao.id});
         return null;
      }
   }

   public List<BattleRecordDao> getListByModel(int model, boolean winRecord) {
      String sql;
      if (winRecord) {
         sql = "SELECT * FROM tb_battle_record WHERE model= ? and win=0 order by id desc limit 30;";
      } else {
         sql = "SELECT * FROM tb_battle_record WHERE model= ? order by id desc limit 30;";
      }

      return this.getBattleRecordDaoBySql(sql, model);
   }

   public List<BattleRecordDao> getRecordList(List<Integer> recordList) {
      if (recordList.isEmpty()) {
         return new ArrayList();
      } else {
         StringBuffer sb = new StringBuffer();
         sb.append("SELECT * FROM tb_battle_record WHERE id in ( ");
         int tempNum = 0;

         for(Integer recordId : recordList) {
            ++tempNum;
            sb.append("?");
            if (tempNum != recordList.size()) {
               sb.append(",");
            }
         }

         sb.append(") ORDER BY id desc LIMIT 30;");
         return this.getBattleRecordDaoBySql(sb.toString(), recordList.toArray());
      }
   }

   public List<BattleRecordDao> getHotRecord() {
      return this.getRecordList(this.hotList);
   }

   public List<BattleRecordDao> getDaoByTypeAndPlayerId(int playerId) {
      String sql = "SELECT * FROM tb_battle_record WHERE playerId= ? order by id desc LIMIT 30;";
      return this.getBattleRecordDaoBySql(sql, playerId);
   }

   private List<BattleRecordDao> getBattleRecordDaoBySql(String sql, Object... params) {
      List<BattleRecordDao> battleRecordDaoList = new ArrayList();

      try {
         this.dbPool.query(sql, (resultSet) -> {
            try {
               while(resultSet.next()) {
                  BattleRecordDao battleRecordDao = this.toBattleRecordDao(resultSet);
                  if (battleRecordDao != null) {
                     battleRecordDaoList.add(battleRecordDao);
                  }
               }
            } catch (Exception e) {
               e.printStackTrace();
            }

         }, params);
      } catch (Throwable t) {
         t.printStackTrace();
      }

      return battleRecordDaoList;
   }

   public BattleRecordDao toBattleRecordDao(ResultSet resultSet) {
      try {
         BattleRecordDao battleRecordDao = new BattleRecordDao();
         battleRecordDao.id = resultSet.getInt("id");
         battleRecordDao.playerId = resultSet.getInt("playerId");
         battleRecordDao.model = resultSet.getInt("model");
         battleRecordDao.defPlayerId = resultSet.getInt("defPlayerId");
         battleRecordDao.chapterId = resultSet.getInt("chapterId");
         battleRecordDao.creatTime = resultSet.getTimestamp("creatTime");
         battleRecordDao.enableTime = resultSet.getLong("enableTime");
         battleRecordDao.stream = resultSet.getBytes("stream");
         return battleRecordDao;
      } catch (Exception e) {
         e.printStackTrace();
         return null;
      }
   }

   public void shareRecord(GamePlayer gamePlayer, int recordId, int model, int sourceModel) {
      this.getBattleRecordExtendDao(recordId, (map) -> {
         BattleRecordExtendDao battleRecordExtendDao = (BattleRecordExtendDao)map.get(recordId);
         if (battleRecordExtendDao == null) {
            battleRecordExtendDao = new BattleRecordExtendDao();
            battleRecordExtendDao.model = (long)sourceModel;
            battleRecordExtendDao.id = recordId;
            battleRecordExtendDao.beShareNum = 1;
            battleRecordExtendDao.lastShareTime = System.currentTimeMillis();
            this.gameCachePool.insertDao(battleRecordExtendDao, false);
         } else {
            ++battleRecordExtendDao.beShareNum;
            battleRecordExtendDao.lastShareTime = System.currentTimeMillis();
            battleRecordExtendDao.updateOp();
         }

         BattleRecordMsg.S2C_ShareRecordResult_8410.Builder builder = BattleRecordMsg.S2C_ShareRecordResult_8410.newBuilder();
         builder.setRecordId(recordId);
         builder.setShareNum(battleRecordExtendDao.beShareNum);
         builder.setModel(model);
         gamePlayer.sendMsg(builder.build());
      });
   }

   public void collectRecord(GamePlayer gamePlayer, int recordId, int model, int operation, int sourceModel) {
      this.getBattleRecordExtendDao(recordId, (map) -> {
         BattleRecordExtendDao battleRecordExtendDao = (BattleRecordExtendDao)map.get(recordId);
         if (battleRecordExtendDao == null) {
            battleRecordExtendDao = new BattleRecordExtendDao();
            battleRecordExtendDao.model = (long)sourceModel;
            battleRecordExtendDao.id = recordId;
            battleRecordExtendDao.beCollectNum = 1;
            battleRecordExtendDao.collectList.add(gamePlayer.getPlayerId());
            this.gameCachePool.insertDao(battleRecordExtendDao, false);
         } else {
            ++battleRecordExtendDao.beCollectNum;
            battleRecordExtendDao.collectList.add(gamePlayer.getPlayerId());
            battleRecordExtendDao.updateOp();
         }

         BattleRecordMsg.S2C_CollectRecordResult_8412.Builder builder = BattleRecordMsg.S2C_CollectRecordResult_8412.newBuilder();
         builder.setRecordId(recordId);
         builder.setOperation(operation);
         builder.setModel(model);
         builder.setIsCollect(battleRecordExtendDao.collectList.contains(gamePlayer.getPlayerId()));
         builder.setCollectNum(battleRecordExtendDao.collectList.size());
         gamePlayer.sendMsg(builder.build());
      });
   }

   public void cancelCollectRecord(GamePlayer gamePlayer, int recordId, int model, int operation) {
      this.getBattleRecordExtendDao(recordId, (map) -> {
         BattleRecordExtendDao battleRecordExtendDao = (BattleRecordExtendDao)map.get(recordId);
         if (battleRecordExtendDao == null) {
            this.logger.info("没有记录，不能取消");
         } else {
            --battleRecordExtendDao.beCollectNum;
            battleRecordExtendDao.collectList.remove(gamePlayer.getPlayerId());
            if (battleRecordExtendDao.collectList.isEmpty()) {
               battleRecordExtendDao.deleteOp();
            } else {
               battleRecordExtendDao.updateOp();
            }

            BattleRecordMsg.S2C_CollectRecordResult_8412.Builder builder = BattleRecordMsg.S2C_CollectRecordResult_8412.newBuilder();
            builder.setRecordId(recordId);
            builder.setOperation(operation);
            builder.setModel(model);
            builder.setIsCollect(battleRecordExtendDao.collectList.contains(gamePlayer.getPlayerId()));
            builder.setCollectNum(battleRecordExtendDao.collectList.size());
            gamePlayer.sendMsg(builder.build());
         }
      });
   }

   public void C2S_ThumbsUpRecord_8413(GamePlayer gamePlayer, int recordId, int usedNum, int model, PlayerResetCustomCache playerResetCustomCache, int sourceModel) {
      this.getBattleRecordExtendDao(recordId, (map) -> {
         BattleRecordExtendDao battleRecordExtendDao = (BattleRecordExtendDao)map.get(recordId);
         if (battleRecordExtendDao == null) {
            battleRecordExtendDao = new BattleRecordExtendDao();
            battleRecordExtendDao.model = (long)sourceModel;
            battleRecordExtendDao.id = recordId;
            battleRecordExtendDao.beThumbsUpNum = 1;
            battleRecordExtendDao.thumbsUpList.add(gamePlayer.getPlayerId());
            this.gameCachePool.insertDao(battleRecordExtendDao, false);
         } else {
            if (battleRecordExtendDao.thumbsUpList.contains(gamePlayer.getPlayerId())) {
               this.logger.info("已经点过赞了,ID={}", recordId);
               gamePlayer.failure(10004);
               return;
            }

            ++battleRecordExtendDao.beThumbsUpNum;
            battleRecordExtendDao.thumbsUpList.add(gamePlayer.getPlayerId());
            battleRecordExtendDao.updateOp();
         }

         int beThumbsUpNum = battleRecordExtendDao.beThumbsUpNum;
         boolean isThumbsUpList = battleRecordExtendDao.thumbsUpList.contains(gamePlayer.getPlayerId());
         gamePlayer.pushTask(() -> {
            int newUsedNum = usedNum + 1;
            playerResetCustomCache.addDailyReset(371, 1);
            ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
            int battleReportLikeGold = configManager.getIntDefault("battleReportLikeGold", 30000);
            gamePlayer.addResource(1, PlayerDefine.PLAYER_COPPER, battleReportLikeGold, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 37, 3701, 0, 0, "");
            BattleRecordMsg.S2C_ThumbsUpRecordResult_8414.Builder builder = BattleRecordMsg.S2C_ThumbsUpRecordResult_8414.newBuilder();
            builder.setRecordId(recordId);
            builder.setEnableNum(3 - newUsedNum);
            builder.setThumbsUpNum(beThumbsUpNum);
            builder.setModel(model);
            builder.setIsThumbsUp(isThumbsUpList);
            gamePlayer.sendMsg(builder.build());
         });
      });
   }

   @TaskMethod
   public void watchRecord(GamePlayer gamePlayer, int recordId, int model, int sourceModel) {
      this.getBattleRecordExtendDao(recordId, (map) -> {
         BattleRecordExtendDao battleRecordExtendDao = (BattleRecordExtendDao)map.get(recordId);
         if (battleRecordExtendDao == null) {
            battleRecordExtendDao = new BattleRecordExtendDao();
            battleRecordExtendDao.model = (long)sourceModel;
            battleRecordExtendDao.id = recordId;
            battleRecordExtendDao.beWatchNum = 1;
            this.gameCachePool.insertDao(battleRecordExtendDao, false);
         } else {
            ++battleRecordExtendDao.beWatchNum;
            battleRecordExtendDao.updateOp();
         }

         BattleRecordMsg.S2C_WatchRecordResult_8416.Builder builder = BattleRecordMsg.S2C_WatchRecordResult_8416.newBuilder();
         builder.setModel(model);
         builder.setRecordId(recordId);
         builder.setWatchNum(battleRecordExtendDao.beWatchNum);
         gamePlayer.sendMsg(builder.build());
      });
   }

   @MsgHandlerAnno
   public void CR2S_BattleRecord_4206(CrossMsg.CR2S_BattleRecord_4206 msg, CrossSubscribeMsg crossSubscribeMsg) {
      for(BattleMsg.S2C_BattleResult_6102 result : msg.getFightResultList()) {
         if (msg.getIsdef()) {
            this.addBattleRecord(result.getType(), result.getSetId(), result.getTeams(1).getBeloogId(), result.getTeams(0).getBeloogId(), result.toBuilder());
         } else {
            this.addBattleRecord(result.getType(), result.getSetId(), result.getTeams(0).getBeloogId(), result.getTeams(1).getBeloogId(), result.toBuilder());
         }
      }

   }

   @MsgHandlerAnno
   public void CR2S_DelRecordByModel_4215(CrossMsg.CR2S_DelRecordByModel_4215 msg, CrossSubscribeMsg crossSubscribeMsg) {
   }

   @MsgHandlerAnno
   public void CR2S_PlayBattleRecord_4208(CrossMsg.CR2S_PlayBattleRecord_4208 msg, CrossSubscribeMsg crossSubscribeMsg) {
      BattleRecordDao battleRecordDao = this.getBattleRecordDao(msg.getRecordId());
      if (battleRecordDao == null) {
         this.logger.info("战斗记录为空，ID={}", msg.getRecordId());
      } else {
         try {
            CrossMsg.CR2S_OhterServerBattleRecord_4211.Builder builder = CrossMsg.CR2S_OhterServerBattleRecord_4211.newBuilder();
            builder.setPlayServierId(msg.getPlayServierId());
            builder.setPlayPlayerId(msg.getPlayPlayerId());
            builder.setFightResult(battleRecordDao.toS2C_BattleResult_6102());
            this.crossNettyClient.sendCross(0, 0, builder.build());
         } catch (Exception var5) {
            this.logger.error("战斗回放处理错误");
         }

      }
   }

   @TaskMethod
   public void playCrossRecord(GamePlayer gamePlayer, int recordId, int systemId, int serverId, int recordType, int startTime) {
      CrossMsg.S2CR_PlayBattleRecord_4207.Builder builder = CrossMsg.S2CR_PlayBattleRecord_4207.newBuilder();
      builder.setRecordId(recordId);
      builder.setSystemid(systemId);
      builder.setServerId(serverId);
      builder.setRecordType(recordType);
      builder.setStartTime(startTime);
      this.crossNettyClient.sendCross(gamePlayer.getServerId(), gamePlayer.getPlayerId(), builder.build());
   }

   public void getBattleRecordExtendDao(int id, BattleRecordFunc func) {
      List<Integer> recordList = new ArrayList();
      recordList.add(id);
      this.getBattleRecordExtendDao(recordList, func);
   }

   public void getBattleRecordExtendDao(List<Integer> recordList, BattleRecordFunc func) {
      ConcurrentHashMap<Object, Object> allObj1 = this.gameCachePool.getPoolTable("tb_battle_record_extend");
      ConcurrentHashMap<Object, Object> allObj2 = (ConcurrentHashMap)allObj1.computeIfAbsent("all-map", (k) -> new CacheHashMap());
      ArrayList<Integer> params = new ArrayList();

      for(Integer id : recordList) {
         if (!allObj2.containsKey(id)) {
            params.add(id);
         }
      }

      if (params.isEmpty()) {
         func.run(allObj2);
      } else {
         long curTime = System.currentTimeMillis();
         StringBuffer sb = new StringBuffer();
         sb.append("select *  FROM tb_battle_record_extend WHERE id in (");
         int tempNum = 0;

         for(Integer id : params) {
            ++tempNum;
            sb.append("?");
            if (tempNum != params.size()) {
               sb.append(",");
            }
         }

         sb.append(");");
         String sql = sb.toString();
         this.dbPool.queryAsync(sql, (resultSet) -> {
            Map<Object, BattleRecordExtendDao> map = null;

            try {
               DBTableNode dbTableNode = this.gameCachePool.getDBTableNode("tb_battle_record_extend");
               map = this.dbPool.parseAllResultMap(resultSet, dbTableNode);
            } catch (Exception e) {
               e.printStackTrace();
            }

            if (Objects.nonNull(map)) {
               this.pushTask(() -> {
                  for(Map.Entry<Object, BattleRecordExtendDao> entry : map.entrySet()) {
                     ((BattleRecordExtendDao)entry.getValue()).setOpTime();
                     allObj2.put(entry.getKey(), entry.getValue());
                  }

                  func.run(allObj2);
               });
            }

         }, params.toArray());
      }

   }

   @TaskMethod
   public void battleRecordError(GamePlayer player, BattleMsg.S2C_BattleResult_6102 record) {
      if (record != null) {
         this.logErrorRecord(player.getPlayerId(), record.getResult().getRecordId(), record.toByteArray(), 5, record.getType(), 0, 0, "");
      }

   }

   public void logErrorRecord(int playerId, int code, byte[] stream, int module, int reason, int misc1, int misc2, String misc3) {
      ErrorRecordLog log = new ErrorRecordLog();
      log.playerId = playerId;
      log.code = code;
      log.stream = stream;
      log.module = module;
      log.reason = reason;
      log.misc1 = misc1;
      log.misc2 = misc2;
      log.misc3 = misc3;
      log.createTime = new Timestamp(System.currentTimeMillis());
   }

   public synchronized void save() {
      if (!Objects.isNull(this.gameCachePool)) {
         this.gameCachePool.save();
      }
   }

   public void updateShareExtend(List<Integer> recordList) {
      this.getBattleRecordExtendDao(recordList, (map) -> {
         for(Integer recordId : recordList) {
            BattleRecordExtendDao battleRecordExtendDao = (BattleRecordExtendDao)map.get(recordId);
            if (battleRecordExtendDao != null) {
               battleRecordExtendDao.lastShareTime = System.currentTimeMillis();
               battleRecordExtendDao.updateOp();
            }
         }

      });
   }

   @TaskMethod
   public void sendBattleRecord(int templeId, GamePlayer player, BattleTempleDao templeDao) {
      BattleDailyMsg.S2C_GetTempleBattleRecord_6642.Builder down = BattleDailyMsg.S2C_GetTempleBattleRecord_6642.newBuilder();

      for(TempleData data : templeDao.record) {
         BattleRecordDao battleRecordDao = this.getBattleRecordDao(data.recordId);
         if (!Objects.isNull(battleRecordDao)) {
            try {
               BattleDailyMsg.TempleLog.Builder info = BattleDailyMsg.TempleLog.newBuilder();
               info.setBattleId(data.recordId);
               info.setTime(data.time);
               info.setAddLevel(data.addLevel);
               info.setName(data.name);
               BattleMsg.S2C_Battle_PKTeam s2C_battle_pkTeam = battleRecordDao.toS2C_BattleResult_6102().getTeams(0);
               info.setTeams(s2C_battle_pkTeam);
               if (data.time + 604800 > DateUtil.getIntTime(System.currentTimeMillis())) {
                  down.addRecord(info);
               }
            } catch (Exception var10) {
               this.logger.error("获取战绩错误");
            }
         }
      }

      player.sendMsg(down.build());
   }

   @TaskMethod
   public void saveBattleTempleRecord(BattleMsg.S2C_BattleResult_6102.Builder battleMsg, GamePlayer player, BattleTempleDao templeDao, int addLevel, BattleDailyMsg.S2C_EnterTemple_6640.Builder down, BattleTempleModel battleTempleModel) {
      BattleMsg.S2C_BattleResult_6102.Builder result = this.addBattleRecord(1270, 0, player.getPlayerId(), 0, battleMsg);
      int recordId = result.getResult().getRecordId();
      BattleTempleMgr battleTempleMgr = (BattleTempleMgr)ApplicationContextProvider.getContext().getBean(BattleTempleMgr.class);
      battleTempleMgr.pushTaskEx("saveRecord", new Object[]{templeDao, addLevel, recordId, player, down, battleTempleModel, result.getStartTime()});
   }

   @TaskMethod
   public void saveDragonRecord(BattleMsg.S2C_BattleResult_6102.Builder battleMsg, GamePlayer player) {
      this.addBattleRecord(3070, 0, player.getPlayerId(), 0, battleMsg);
   }

   @TaskMethod
   public void savePeakBattle(boolean isWin, PeakBattleMsg.S2S_LadderFightResult_4450.Builder msg, GamePlayer player) {
      BattleMsg.S2C_BattleResult_6102.Builder battleMsg = msg.getResult().toBuilder();
      BattleMsg.S2C_BattleResult_6102.Builder result = this.addBattleRecord(2041, 0, player.getPlayerId(), 0, battleMsg);
      int recordId = result.getResult().getRecordId();
      player.pushPartTaskEx(PeakBattlePart.class, "_saveRecord", new Object[]{isWin, msg, recordId, result.getStartTime()});
   }

   @TaskMethod
   public void saveLadder(BattleMsg.S2C_BattleResult_6102.Builder fight, boolean isWin, LadderMsg.S2S_LadderFightResult_4108 msg, GamePlayer player) {
      BattleMsg.S2C_BattleResult_6102.Builder result = this.addBattleRecord(2000, 0, player.getPlayerId(), 0, fight);
      int recordId = result.getResult().getRecordId();
      player.pushPartTaskEx(LadderPart.class, "_saveLadderRecord", new Object[]{fight, msg, recordId, fight.getStartTime()});
   }

   @TaskMethod
   public void saveFairyLandBattle(BattleMsg.S2C_BattleResult_6102.Builder msg, GamePlayer player) {
      this.addBattleRecord(3005, 0, player.getPlayerId(), 0, msg);
   }

   @TaskMethod
   public void updateExpeditionRecord(int chapterId, int playerId, List<HeroMirror> heroMirrorList) {
      if (chapterId > 0 && !CollectionUtils.isEmpty(heroMirrorList)) {
         long totalFight = 0L;

         for(HeroMirror heroMirror : heroMirrorList) {
            totalFight += heroMirror.combatPower;
         }

         WorldDao<HashMap<Integer, ExpeditionRecordData>> worldDao = this.worldMgr.<HashMap<Integer, ExpeditionRecordData>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_EXPEDITION_RECORD_NEAREST);
         ExpeditionRecordData recordData = new ExpeditionRecordData();
         recordData.type = 2;
         recordData.playerId = playerId;
         recordData.heroMirrorList = heroMirrorList;
         recordData.fight = totalFight;
         recordData.recordTime = DateUtil.getIntTime(System.currentTimeMillis());
         ((HashMap)worldDao.jsonData).put(chapterId, recordData);
         worldDao.updateOp();
         WorldDao<HashMap<Integer, ExpeditionRecordData>> worldDaoLowest = this.worldMgr.<HashMap<Integer, ExpeditionRecordData>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_EXPEDITION_RECORD_LOWEST);
         ExpeditionRecordData recordDataLowest = (ExpeditionRecordData)((HashMap)worldDaoLowest.jsonData).getOrDefault(chapterId, new ExpeditionRecordData());
         if (recordDataLowest.playerId == 0 || recordDataLowest.fight > totalFight) {
            recordDataLowest.type = 1;
            recordDataLowest.playerId = playerId;
            recordDataLowest.heroMirrorList = heroMirrorList;
            recordDataLowest.fight = totalFight;
            recordDataLowest.recordTime = DateUtil.getIntTime(System.currentTimeMillis());
            ((HashMap)worldDaoLowest.jsonData).put(chapterId, recordDataLowest);
            worldDaoLowest.updateOp();
         }

         WorldDao<ExpeditionBuffAddtionData> expetidionAddtionDao = this.worldMgr.<ExpeditionBuffAddtionData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_EXPEDITION_BUFF_ADDITION);
         MapUtil.computeIfAbsent(((ExpeditionBuffAddtionData)expetidionAddtionDao.jsonData).firstPassMap, chapterId, playerId);
         int passCount = (Integer)MapUtil.getOrDefault(((ExpeditionBuffAddtionData)expetidionAddtionDao.jsonData).passInfoMap, chapterId, 0);
         ((ExpeditionBuffAddtionData)expetidionAddtionDao.jsonData).passInfoMap.put(chapterId, passCount + 1);
         expetidionAddtionDao.updateOp();
         ExpeditionMsg.S2C_UpdatePassNum_10348.Builder notify = ExpeditionMsg.S2C_UpdatePassNum_10348.newBuilder();
         notify.setChapterId(chapterId);
         notify.setPassNum(passCount + 1);
         GamePlayer firstPassPlayer = this.worldMgr.getPlayerById((Integer)((ExpeditionBuffAddtionData)expetidionAddtionDao.jsonData).firstPassMap.get(chapterId));
         if (firstPassPlayer != null) {
            PlayerPublicDao playerDao = firstPassPlayer.getPublicDao();
            notify.setFirstPlayerName(playerDao.playerName);
         }

         this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{notify.build()});
      }
   }

   public List<ExpeditionMsg.RecordInfo> getExpeditionRecord(int chapterId) {
      List<ExpeditionMsg.RecordInfo> list = new ArrayList();
      List<GameDefine.WorldModule> recordTypes = new ArrayList();
      recordTypes.add(GameDefine.WorldModule.WORLD_DAO_EXPEDITION_RECORD_NEAREST);
      recordTypes.add(GameDefine.WorldModule.WORLD_DAO_EXPEDITION_RECORD_LOWEST);

      for(GameDefine.WorldModule type : recordTypes) {
         WorldDao<HashMap<Integer, ExpeditionRecordData>> worldDao = this.worldMgr.<HashMap<Integer, ExpeditionRecordData>>getWorldDao(type);
         Map<Integer, ExpeditionRecordData> recordDataMap = (Map)worldDao.jsonData;
         if (recordDataMap.containsKey(chapterId)) {
            ExpeditionRecordData recordData = (ExpeditionRecordData)recordDataMap.get(chapterId);
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(recordData.playerId);
            if (gamePlayer != null) {
               PlayerPublicDao publicDao = gamePlayer.getPublicDao();
               ExpeditionMsg.RecordInfo.Builder builder = ExpeditionMsg.RecordInfo.newBuilder();
               builder.setPlayerId(recordData.playerId);
               builder.setPlayerName(publicDao.playerName);
               builder.setType(recordData.type);
               builder.setCrossPower(recordData.fight);
               builder.setCrossTime(recordData.recordTime);
               builder.setHead(publicDao.head);
               builder.setHeadFrame(publicDao.headFrame);

               for(HeroMirror heroMirror : recordData.heroMirrorList) {
                  builder.addHeroInfos(heroMirror.toBuilder());
               }

               list.add(builder.build());
            }
         }
      }

      return list;
   }

   public long getSuggestPower(int systemId, int code) {
      Map<Integer, SuggestPowerDao> map = this.gameCachePool.getMap("tb_suggest_power", new Object[]{systemId});
      if (map.containsKey(code)) {
         SuggestPowerDao suggestPowerDao = (SuggestPowerDao)map.get(code);
         return suggestPowerDao.power;
      } else {
         return 0L;
      }
   }

   @TaskMethod
   public void updateSuggestPower(int systemId, int code, long power, boolean bFormal) {
      Map<Integer, SuggestPowerDao> map = this.gameCachePool.getMap("tb_suggest_power", new Object[]{systemId});
      SuggestPowerDao suggestPowerDao = (SuggestPowerDao)map.get(code);
      if (suggestPowerDao == null || !suggestPowerDao.bFormal) {
         if (suggestPowerDao == null) {
            suggestPowerDao = new SuggestPowerDao();
            suggestPowerDao.systemId = systemId;
            suggestPowerDao.code = code;
            suggestPowerDao.power = power;
            suggestPowerDao.bFormal = bFormal;
            this.gameCachePool.insertDao(suggestPowerDao);
         } else {
            suggestPowerDao.power = power;
            suggestPowerDao.bFormal = bFormal;
            this.gameCachePool.updateDao(suggestPowerDao, true);
         }

      }
   }

   public boolean isEnableDelRecord(BattleRecordDao dao) {
      switch (dao.model) {
         case 2020:
         case 3070:
            if (System.currentTimeMillis() < dao.creatTime.getTime() + 172800000L) {
               return false;
            }
         default:
            return true;
      }
   }

   public static boolean isSaveRecordToMyServer(int model) {
      boolean isSave = false;
      switch (model) {
         case 1500:
         case 2010:
         case 2030:
         case 2042:
         case 3180:
            isSave = true;
         default:
            return isSave;
      }
   }

   public boolean isNeedFightEnd(int modelId) {
      switch (modelId) {
         case 1500:
         case 3180:
            return true;
         default:
            return false;
      }
   }

   public boolean isEnableDelRecordOrExtend(BattleRecordExtendDao dao) {
      if (dao != null) {
         if (!dao.collectList.isEmpty()) {
            return false;
         }

         if (dao.lastShareTime > 0L) {
            long deltTime = System.currentTimeMillis() - dao.lastShareTime;
            if (deltTime < 604800000L) {
               this.logger.info("分享时间不足一周，记录={},时间={}小时    ", dao.id, (System.currentTimeMillis() - dao.lastShareTime) / 3600000L);
               return false;
            }
         }
      }

      return true;
   }

   public BattleRecordDao getBattleRecordDao(int recordId) {
      return (BattleRecordDao)this.gameCachePool.getDataNoInsert("tb_battle_record", new Object[]{recordId});
   }

   @TaskMethod
   public void levelPromoteRecord(int modelId, GamePlayer gamePlayer) {
      WorldDao<HashMap<Integer, ArrayList<String>>> worldDao = this.worldMgr.<HashMap<Integer, ArrayList<String>>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_LEVEL_PROMOTE_RECORD);
      ArrayList<String> list = (ArrayList)MapUtil.computeIfAbsent(worldDao.jsonData, modelId, ArrayList.class);
      int levelPromoteRecordNum = ApplicationContextProvider.getConfigInt("LevelPromoteRecordNum", 3);
      if (list.size() < levelPromoteRecordNum) {
         list.add(gamePlayer.getPlayerId() + "|" + DateUtil.getIntTime(System.currentTimeMillis()));
         worldDao.updateOp();
         LevelPromoteModel levelPromoteModel = (LevelPromoteModel)ApplicationContextProvider.getModelPoolEntity("levelPromote", modelId);
         if (levelPromoteModel.getExtraRewards().size() > 0) {
            gamePlayer.pushTask(() -> {
               int mailId = ApplicationContextProvider.getConfigInt("levelPromoveMail", 1822);
               CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", mailId);
               if (centreAwardModel != null) {
                  MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), levelPromoteModel.getExtraRewards(), 604800000L, 87, 8702);
               }
            });
         }

         LevelPromoteMsg.S2C_RecordInfo_17904.Builder builder = LevelPromoteMsg.S2C_RecordInfo_17904.newBuilder();
         LevelPromoteMsg.RankInfo.Builder rankInfo = LevelPromoteMsg.RankInfo.newBuilder();
         rankInfo.setModelId(modelId);

         for(String info : list) {
            String[] arr = info.split("\\|");
            GamePlayer othwerPlayer = this.worldMgr.getPlayerById(Integer.parseInt(arr[0]));
            if (othwerPlayer != null) {
               CommonMsg.PlayerInfo.Builder playerInfo = othwerPlayer.toPlayerInfo();
               rankInfo.addPlayerInfo(playerInfo);
            }
         }

         builder.setRankInfo(rankInfo);
         this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
      }
   }

   public static boolean isSpecialRecord(BattleMsg.S2C_BattleResult_6102 battleMsg) {
      if (battleMsg.getType() != 1110 && battleMsg.getType() != 1040 && battleMsg.getType() != 1500 && battleMsg.getType() != 3180) {
         return false;
      } else {
         int winForce = battleMsg.getResult().getResult();
         long winPower = battleMsg.getTeams(winForce).getCombatPower();
         long losePower = battleMsg.getTeams(1 - winForce).getCombatPower();
         if (winPower >= losePower) {
            return false;
         } else {
            long minPower = ApplicationContextProvider.getConfigLong("specialRecordMinPower", 10000000L);
            if (winPower <= minPower) {
               return false;
            } else {
               float powerPercent = ApplicationContextProvider.getConfigFloat("specialRecordPowerPer", 0.2F);
               return (float)(losePower - winPower) > powerPercent * (float)winPower;
            }
         }
      }
   }

   public void _mainServerMergeFinish(HashSet<Integer> slaveServerSet) throws Exception {
      int levelPromoteRecordNum = ApplicationContextProvider.getConfigInt("LevelPromoteRecordNum", 3);
      WorldDao<HashMap<Integer, ArrayList<String>>> worldDao = this.worldMgr.<HashMap<Integer, ArrayList<String>>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_LEVEL_PROMOTE_RECORD);
      GameRedisTool gameRedisTool = (GameRedisTool)ApplicationContextProvider.getContext().getBean(GameRedisTool.class);

      for(int slaveServer : slaveServerSet) {
         String key = this.worldMgr.getServerInfoRedisKey(slaveServer);
         RMap<String, String> map = gameRedisTool.getClient().getMap(key);
         if (null != map && !map.isEmpty()) {
            String strLevelPromote = (String)map.get("levelPromote");
            if (!StringUtils.isEmpty(strLevelPromote)) {
               String[] sectionArr = strLevelPromote.split(";");

               for(String sectionInfo : sectionArr) {
                  String[] arr = sectionInfo.split("_");
                  int modelId = Integer.parseInt(arr[0]);
                  ArrayList<String> list = (ArrayList)MapUtil.computeIfAbsent(worldDao.jsonData, modelId, ArrayList.class);
                  if (list.size() < levelPromoteRecordNum) {
                     int addNum = levelPromoteRecordNum - list.size();
                     String[] records = arr[1].split(",");

                     for(String record : records) {
                        list.add(record);
                        --addNum;
                        if (addNum <= 0) {
                           break;
                        }
                     }
                  }
               }
            }

            map.remove("levelPromote");
         }
      }

      worldDao.updateOp();
   }
}
