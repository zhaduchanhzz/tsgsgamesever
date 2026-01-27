package com.gzbz.gamePlayer.record;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.BattleRecordDao;
import com.gzbz.db.BattleRecordExtendDao;
import com.gzbz.db.GameDBPool;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.GameModelPool;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.BattleRecordMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import debug.Debug;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import misc.DateUtil;
import misc.Pagination;
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
public class BattleRecordPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(BattleRecordPart.class);
   @Autowired
   BattleRecordMgr battleRecordMgr;
   @Autowired
   GameModelPool gameModelPool;
   @Autowired
   WorldMgr worldMgr;
   private long lastPlayTime = 0L;

   public void logoutHandle() {
      WorldMgr var10000 = this.worldMgr;
      if (WorldMgr.serverState.get() != 2) {
         this.battleRecordMgr.pushTaskEx("checkPlayerBattleRecord", new Object[]{this.player.getPlayerId()});
      }
   }

   @MsgHandlerAnno
   public void C2S_BattleRecordFight_6105(BattleMsg.C2S_BattleRecordFight_6105 msg, String source) {
      long currentTime = System.currentTimeMillis();
      if (currentTime - this.lastPlayTime < 500L) {
         this.logger.info("玩家={}，播放录像请求间隔不足，systemid={}，serverId={}，shareType={}，recordId={}，startTime={}，isCross={}", new Object[]{this.player.getPlayerId(), msg.getSystemid(), msg.getServerId(), msg.getShareType(), msg.getRecordId(), msg.getStartTime(), msg.getIsCross()});
      } else {
         this.lastPlayTime = currentTime;
         boolean isSaveMyServer = BattleRecordMgr.isSaveRecordToMyServer(msg.getSystemid());
         if (msg.getShareType() == 1) {
            if (!isSaveMyServer) {
               this.battleRecordMgr.pushTaskEx("getRecordFromRecordServer", new Object[]{msg.getServerId(), this.player.getPlayerId(), msg.getRecordId(), msg.getStartTime(), 1});
            } else if (this.player.getServerId() == msg.getServerId()) {
               this.battleRecordMgr.pushTaskEx("playRecord", new Object[]{this.player, msg.getRecordId()});
            } else {
               this.battleRecordMgr.pushTaskEx("playCrossRecord", new Object[]{this.player, msg.getRecordId(), msg.getSystemid(), msg.getServerId(), 1, msg.getStartTime()});
            }
         } else {
            if (msg.getIsCross()) {
               this.battleRecordMgr.pushTaskEx("playCrossRecord", new Object[]{this.player, msg.getRecordId(), msg.getSystemid(), msg.getServerId(), 0, msg.getStartTime()});
            } else {
               boolean isCrossRecord = false;
               int type = 1;
               switch (msg.getSystemid()) {
                  case 2010:
                  case 2020:
                  case 2030:
                  case 3103:
                  case 3180:
                     isCrossRecord = true;
                     type = 2;
                  default:
                     if (isCrossRecord) {
                        this.battleRecordMgr.pushTaskEx("playCrossRecord", new Object[]{this.player, msg.getRecordId(), msg.getSystemid(), msg.getServerId(), 0, msg.getStartTime()});
                     } else if (isSaveMyServer) {
                        this.battleRecordMgr.pushTaskEx("playRecord", new Object[]{this.player, msg.getRecordId()});
                     } else {
                        this.battleRecordMgr.pushTaskEx("getRecordFromRecordServer", new Object[]{msg.getServerId(), this.player.getPlayerId(), msg.getRecordId(), msg.getStartTime(), type});
                     }
               }
            }

            if (msg.getSystemid() == 3190) {
               this.player.triggerTask(636, 0, 1L, 1);
            }
         }

         this.player.triggerTask(375, 0, 1L, 1);
      }
   }

   @MsgHandlerAnno
   public void C2S_BattleRecordData_6115(BattleMsg.C2S_BattleRecordData_6115 msg, String source) {
      this.battleRecordMgr.pushTaskEx("C2S_BattleRecordData_6115", new Object[]{this.player, msg.getRecordId()});
   }

   @MsgHandlerAnno
   public void C2S_BattleRecord_8403(BattleRecordMsg.C2S_BattleRecord_8403 msg, String source) {
      switch (msg.getModel()) {
         case 2800:
            this.hotRecordList(msg.getModel());
            break;
         case 2810:
            this.hotRecordList(msg.getModel());
            break;
         case 2820:
            this.playerPvpRecordList(msg.getModel());
            break;
         case 2830:
            this.playerCollectList(msg.getModel());
            break;
         default:
            this.commonRecordList(msg.getModel(), false);
      }

   }

   public void commonRecordList(int model, boolean winRecord) {
      this.battleRecordMgr.pushTask(() -> {
         long currentTime = System.currentTimeMillis();
         List<BattleRecordDao> battleRecordDaoList = this.battleRecordMgr.getListByModel(model, winRecord);
         long currentTime_query = System.currentTimeMillis();
         long queryTime = currentTime_query - currentTime;
         List<Integer> recordIdList = new ArrayList();
         List<BattleRecordDao> recordDaoList = new ArrayList();

         for(BattleRecordDao dao : battleRecordDaoList) {
            if (dao.enableTime <= currentTime) {
               recordIdList.add(dao.id);
               recordDaoList.add(dao);
            }
         }

         this.battleRecordMgr.getBattleRecordExtendDao(recordIdList, (map) -> {
            BattleRecordMsg.S2C_BattleRecordResult_8404.Builder builder = BattleRecordMsg.S2C_BattleRecordResult_8404.newBuilder();

            for(BattleRecordDao battleRecordDao : recordDaoList) {
               BattleRecordMsg.BattleRecordInfo.Builder infoBuilder = this.battleRecordMgr.toBattleRecordInfo(this.player, battleRecordDao, (BattleRecordExtendDao)map.get(battleRecordDao.id));
               if (infoBuilder != null) {
                  builder.addInfos(infoBuilder);
               }
            }

            this.player.pushTask(() -> {
               PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
               int usedNum = (Integer)playerResetCustomCache.getDailyNum(371, 0);
               builder.setEnableNum(3 - usedNum);
               builder.setModel(model);
               PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
               builder.setCollectNum(playerExtend.collectRecords.size());
               this.logger.info("获取{}模块记录,查询数据time={},组装数据time={}", new Object[]{model, queryTime, System.currentTimeMillis() - currentTime_query});
               this.player.sendMsg(builder.build());
            });
         });
      });
   }

   public void hotRecordList(int model) {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int usedNum = (Integer)playerResetCustomCache.getDailyNum(371, 0);
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      this.battleRecordMgr.pushTask(() -> {
         long currentTime = System.currentTimeMillis();
         List<BattleRecordDao> battleRecordDaoList = this.battleRecordMgr.getHotRecord();
         long currentTime_query = System.currentTimeMillis();
         long queryTime = currentTime_query - currentTime;
         List<Integer> recordIdList = new ArrayList();
         List<BattleRecordDao> recordDaoList = new ArrayList();

         for(BattleRecordDao dao : battleRecordDaoList) {
            if (dao.enableTime <= currentTime) {
               recordIdList.add(dao.id);
               recordDaoList.add(dao);
            }
         }

         Collections.reverse(recordIdList);
         this.battleRecordMgr.getBattleRecordExtendDao(recordIdList, (map) -> {
            BattleRecordMsg.S2C_BattleRecordResult_8404.Builder builder = BattleRecordMsg.S2C_BattleRecordResult_8404.newBuilder();
            recordDaoList.forEach((dao) -> {
               BattleRecordMsg.BattleRecordInfo.Builder infoBuilder = this.battleRecordMgr.toBattleRecordInfo(this.player, dao, (BattleRecordExtendDao)map.get(dao.id));
               if (infoBuilder != null) {
                  builder.addInfos(infoBuilder);
               }

            });
            builder.setEnableNum(3 - usedNum);
            builder.setModel(model);
            builder.setCollectNum(playerExtend.collectRecords.size());
            this.logger.info("获取个人记录,查询时间={}，组装数据时间={}", queryTime, System.currentTimeMillis() - currentTime_query);
            this.player.sendMsg(builder.build());
         });
      });
   }

   public void playerPvpRecordList(int model) {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int usedNum = (Integer)playerResetCustomCache.getDailyNum(371, 0);
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      this.battleRecordMgr.pushTask(() -> {
         long currentTime = System.currentTimeMillis();
         List<BattleRecordDao> battleRecordDaoList = this.battleRecordMgr.getDaoByTypeAndPlayerId(this.player.getPlayerId());
         long currentTime_query = System.currentTimeMillis();
         long queryTime = currentTime_query - currentTime;
         List<Integer> recordIdList = new ArrayList();
         List<BattleRecordDao> recordDaoList = new ArrayList();

         for(BattleRecordDao dao : battleRecordDaoList) {
            if (dao.enableTime <= currentTime) {
               recordIdList.add(dao.id);
               recordDaoList.add(dao);
            }
         }

         this.battleRecordMgr.getBattleRecordExtendDao(recordIdList, (map) -> {
            BattleRecordMsg.S2C_BattleRecordResult_8404.Builder builder = BattleRecordMsg.S2C_BattleRecordResult_8404.newBuilder();
            recordDaoList.forEach((dao) -> {
               BattleRecordMsg.BattleRecordInfo.Builder infoBuilder = this.battleRecordMgr.toBattleRecordInfo(this.player, dao, (BattleRecordExtendDao)map.get(dao.id));
               if (infoBuilder != null) {
                  builder.addInfos(infoBuilder);
               }

            });
            builder.setEnableNum(3 - usedNum);
            builder.setModel(model);
            builder.setCollectNum(playerExtend.collectRecords.size());
            this.logger.info("获取个人记录,查询时间={}，组装数据时间={}", queryTime, System.currentTimeMillis() - currentTime_query);
            this.player.sendMsg(builder.build());
         });
      });
   }

   public void playerCollectList(int model) {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int usedNum = (Integer)playerResetCustomCache.getDailyNum(371, 0);
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      this.battleRecordMgr.pushTask(() -> {
         long currentTime = System.currentTimeMillis();
         List<BattleRecordDao> battleRecordDaoList = this.battleRecordMgr.getRecordList(playerExtend.collectRecords);
         long currentTime_query = System.currentTimeMillis();
         long qureyTime = currentTime_query - currentTime;
         List<Integer> recordIdList = new ArrayList();
         List<BattleRecordDao> recordDaoList = new ArrayList();

         for(BattleRecordDao dao : battleRecordDaoList) {
            if (dao.enableTime <= currentTime) {
               recordIdList.add(dao.id);
               recordDaoList.add(dao);
            }
         }

         this.battleRecordMgr.getBattleRecordExtendDao(recordIdList, (map) -> {
            BattleRecordMsg.S2C_BattleRecordResult_8404.Builder builder = BattleRecordMsg.S2C_BattleRecordResult_8404.newBuilder();
            List<Integer> newCollectList = new ArrayList();
            recordDaoList.forEach((dao) -> {
               BattleRecordMsg.BattleRecordInfo.Builder infoBuilder = this.battleRecordMgr.toBattleRecordInfo(this.player, dao, (BattleRecordExtendDao)map.get(dao.id));
               if (infoBuilder != null) {
                  builder.addInfos(infoBuilder);
                  newCollectList.add(dao.id);
               }

            });
            builder.setEnableNum(3 - usedNum);
            builder.setModel(model);
            builder.setCollectNum(newCollectList.size());
            this.logger.info("获取玩家的收藏，查询数据time={},组装数据：time={}", qureyTime, System.currentTimeMillis() - currentTime_query);
            this.player.sendMsg(builder.build());
            this.player.pushTask(() -> {
               playerExtend.collectRecords = newCollectList;
               this.player.updatePlayerExtend(13);
            });
         });
      });
   }

   @MsgHandlerAnno
   public void C2S_ShareRecord_8409(BattleRecordMsg.C2S_ShareRecord_8409 msg, String source) {
      int modelId = this.isHaveRecord(msg.getRecordId());
      if (modelId <= 0) {
         this.logger.info("战斗记录为空。ID={}", msg.getRecordId());
      } else {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int shareCoolTime = (Integer)playerResetCustomCache.getDailyNum(539, 0);
         int coolTime = ApplicationContextProvider.getConfigInt("battleShareCoolTime", 600);
         if (shareCoolTime + coolTime <= DateUtil.getIntTime(System.currentTimeMillis())) {
            this.battleRecordMgr.pushTask(() -> this.battleRecordMgr.shareRecord(this.player, msg.getRecordId(), msg.getModel(), modelId));
            this.player.triggerTask(376, 0, 1L, 1);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_CollectRecord_8411(BattleRecordMsg.C2S_CollectRecord_8411 msg, String source) {
      int modelId = this.isHaveRecord(msg.getRecordId());
      if (modelId <= 0) {
         this.logger.info("战斗记录为空。ID={}", msg.getRecordId());
      } else {
         if (msg.getOperation() == 0) {
            PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
            if (playerExtend.collectRecords.size() >= 20) {
               this.player.failure(76183);
               return;
            }

            if (!playerExtend.collectRecords.contains(msg.getRecordId())) {
               playerExtend.collectRecords.add(msg.getRecordId());
               this.player.updatePlayerExtend(13);
            }

            this.battleRecordMgr.pushTask(() -> this.battleRecordMgr.collectRecord(this.player, msg.getRecordId(), msg.getModel(), msg.getOperation(), modelId));
         } else {
            PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
            if (playerExtend.collectRecords.contains(msg.getRecordId())) {
               playerExtend.collectRecords.remove(msg.getRecordId());
               this.player.updatePlayerExtend(13);
            }

            this.battleRecordMgr.pushTask(() -> this.battleRecordMgr.cancelCollectRecord(this.player, msg.getRecordId(), msg.getModel(), msg.getOperation()));
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_ThumbsUpRecord_8413(BattleRecordMsg.C2S_ThumbsUpRecord_8413 msg, String source) {
      int modelId = this.isHaveRecord(msg.getRecordId());
      if (modelId <= 0) {
         this.logger.info("战斗记录为空。ID={}", msg.getRecordId());
      } else {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int usedNum = (Integer)playerResetCustomCache.getDailyNum(371, 0);
         if (usedNum >= 3) {
            this.logger.info("玩家点赞数量达到最大，NUM={}", usedNum);
         } else {
            this.battleRecordMgr.pushTask(() -> this.battleRecordMgr.C2S_ThumbsUpRecord_8413(this.player, msg.getRecordId(), usedNum, msg.getModel(), playerResetCustomCache, modelId));
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WatchRecord_8415(BattleRecordMsg.C2S_WatchRecord_8415 msg, String source) {
      int modelId = this.isHaveRecord(msg.getRecordId());
      if (modelId <= 0) {
         this.logger.info("战斗记录为空。ID={}", msg.getRecordId());
      } else {
         this.battleRecordMgr.pushTaskEx("watchRecord", new Object[]{this.player, msg.getRecordId(), msg.getModel(), modelId});
      }
   }

   @MsgHandlerAnno
   public void C2S_SpecialRecordList_8417(BattleRecordMsg.C2S_SpecialRecordList_8417 msg, String source) {
      int page = Math.max(1, msg.getPage());
      int pageSize = Math.min(30, Math.max(1, msg.getPageSize()));
      this.sendSpecialRecords(page, pageSize, msg.getNationList());
   }

   @MsgHandlerAnno
   public void C2S_WatchSpecialRecord_8419(BattleRecordMsg.C2S_WatchSpecialRecord_8419 msg, String source) {
      this.watchSpecialRecord(msg.getRecordId());
   }

   public int isHaveRecord(int recordId) {
      GameDBPool dbPool = (GameDBPool)ApplicationContextProvider.getContext().getBean(GameDBPool.class);
      AtomicInteger model = new AtomicInteger(0);
      String sql = "SELECT model FROM tb_battle_record WHERE id= ? ;";

      try {
         dbPool.query(sql, (resultSet) -> {
            try {
               while(resultSet.next()) {
                  model.set(resultSet.getInt(1));
               }
            } catch (Exception e) {
               e.printStackTrace();
            }

         }, new Object[]{recordId});
      } catch (Throwable t) {
         t.printStackTrace();
      }

      return model.get();
   }

   public void gmTestPlay(String params) {
      String[] strArr = params.split(",");
      if (strArr.length < 2) {
         int recordId = Integer.parseInt(strArr[0]);
         this.battleRecordMgr.pushTaskEx("playRecord", new Object[]{this.player, recordId});
      } else {
         int recordId = Integer.parseInt(strArr[0]);
         int startTime = Integer.parseInt(strArr[1]);
         this.battleRecordMgr.pushTaskEx("getRecordFromRecordServer", new Object[]{this.player.getServerId(), this.player.getPlayerId(), recordId, startTime, 1});
      }

   }

   public void sendSpecialRecords(int page, int pageSize, List<Integer> nationList) {
      if (Debug.isDebug) {
         SpecialRecordMgr specialRecordMgr = (SpecialRecordMgr)ApplicationContextProvider.getContext().getBean(SpecialRecordMgr.class);
         List<Long> recordIds = new ArrayList();
         if (!nationList.isEmpty() && !nationList.contains(0)) {
            LinkedHashSet<Long> tempRecordIds = new LinkedHashSet();

            for(Integer nation : nationList) {
               tempRecordIds.addAll(specialRecordMgr.getNationRecordIds(nation));
            }

            recordIds.addAll(tempRecordIds);
         } else {
            recordIds.addAll(specialRecordMgr.getNationRecordIds(0));
         }

         Pagination pagination = new Pagination(page, pageSize, recordIds.size());
         BattleRecordMsg.S2C_SpecialRecordList_8418.Builder resp = BattleRecordMsg.S2C_SpecialRecordList_8418.newBuilder();
         if (!recordIds.isEmpty()) {
            resp.addAllRecord(specialRecordMgr.getSpecialRecords(recordIds.subList(pagination.getStartIndex(), pagination.getEndIndex() + 1)));
         }

         resp.addAllNation(nationList);
         resp.setPageInfo(CommonMsg.PageInfo.newBuilder().setPageSize(pagination.getPageSize()).setPageNo(pagination.getPageNo()).setPageTotal(pagination.getPageTotal()).build());
         this.player.sendMsg(resp.build());
      }
   }

   public void watchSpecialRecord(long recordId) {
      if (Debug.isDebug) {
         SpecialRecordMgr specialRecordMgr = (SpecialRecordMgr)ApplicationContextProvider.getContext().getBean(SpecialRecordMgr.class);
         BattleMsg.S2C_BattleResult_6102 specialRecord = specialRecordMgr.getSpecialRecord(recordId);
         if (specialRecord == null) {
            this.player.failure(0);
         } else {
            this.player.sendMsg(specialRecord);
         }
      }
   }
}
