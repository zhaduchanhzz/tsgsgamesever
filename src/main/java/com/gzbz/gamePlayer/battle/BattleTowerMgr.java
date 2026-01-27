package com.gzbz.gamePlayer.battle;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.BattleTowerRecordDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.TrailTowerOwnerDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.bean.TowerWaveData;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.BattleTowerMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.TrailTowerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@MgrAnno
public class BattleTowerMgr extends GameMgr {
   Logger logger = LoggerFactory.getLogger(BattleTowerMgr.class);
   @Autowired
   private HeroRankMgr heroRankMgr;
   public static final int RECORD_FAST = 1;
   public static final int RECORD_POWER = 2;
   public static final int RECORD_SELF = 3;
   public static final int TYPE_BATTLE_TOWER = 1;
   public static final int TYPE_TRAIL_TOWER = 2;

   protected void init() {
   }

   @TaskMethod
   public void addTwoWaveRecord(GamePlayer player, int type, int towerId, List<TowerWaveData> towerWaveDataList) {
      if (towerWaveDataList != null && !towerWaveDataList.isEmpty()) {
         this.gameCachePool.getMap("tb_battle_tower_record", new Object[]{type, towerId});
         TowerWaveData towerWaveData = (TowerWaveData)towerWaveDataList.get(0);
         BattleTowerRecordDao recordDao = new BattleTowerRecordDao();
         recordDao.type = type;
         recordDao.towerId = towerId;
         recordDao.playerId = player.getPlayerId();
         recordDao.crossPower = towerWaveData.getCrossPower();
         recordDao.crossTime = towerWaveData.getCrossTime();
         recordDao.recordId = towerWaveData.getRecordId();
         recordDao.startTime = towerWaveData.getStartTime();
         recordDao.heroArrayState = towerWaveData.getHeroArrayState();
         if (towerWaveDataList.size() > 1) {
            TowerWaveData towerWaveData2 = (TowerWaveData)towerWaveDataList.get(1);
            recordDao.crossPower2 = towerWaveData2.getCrossPower();
            recordDao.crossTime2 = towerWaveData2.getCrossTime();
            recordDao.recordId2 = towerWaveData2.getRecordId();
            recordDao.startTime2 = towerWaveData2.getStartTime();
            recordDao.heroArrayState2 = towerWaveData2.getHeroArrayState();
         }

         this.gameCachePool.insertDao(recordDao, true);
      } else {
         this.logger.error("towerWaveDataList 信息为空 playerId:{},type:{},towerId:{}", new Object[]{player.getPlayerId(), type, towerId});
      }
   }

   @TaskMethod
   public void addOneWaveRecord(int towerId, int type, GamePlayer player, int costTime, long power, int recordId, int startTime, int heroArrayState) {
      this.gameCachePool.getMap("tb_battle_tower_record", new Object[]{type, towerId});
      BattleTowerRecordDao recordDao = new BattleTowerRecordDao();
      recordDao.type = type;
      recordDao.towerId = towerId;
      recordDao.playerId = player.getPlayerId();
      recordDao.crossPower = power;
      recordDao.crossTime = costTime;
      recordDao.recordId = recordId;
      recordDao.startTime = startTime;
      recordDao.heroArrayState = heroArrayState;
      this.gameCachePool.insertDao(recordDao, true);
   }

   public List<BattleTowerMsg.RecordInfo> getRecord(int towerId, int type, int playerId) {
      BattleTowerRecordDao fastDao = null;
      BattleTowerRecordDao minimumPowerDao = null;
      BattleTowerRecordDao selfDao = null;
      Map<Integer, BattleTowerRecordDao> map = this.gameCachePool.getMap("tb_battle_tower_record", new Object[]{type, towerId});

      for(BattleTowerRecordDao recordDao : map.values()) {
         if (fastDao != null) {
            fastDao = recordDao.crossTime + recordDao.crossTime2 < fastDao.crossTime + fastDao.crossTime2 ? recordDao : fastDao;
         } else {
            fastDao = recordDao;
         }

         if (minimumPowerDao != null) {
            minimumPowerDao = recordDao.crossPower + recordDao.crossPower2 < minimumPowerDao.crossPower + minimumPowerDao.crossPower2 ? recordDao : minimumPowerDao;
         } else {
            minimumPowerDao = recordDao;
         }

         if (recordDao.playerId == playerId) {
            selfDao = recordDao;
         }
      }

      List<BattleTowerMsg.RecordInfo> reportList = new ArrayList();
      if (fastDao != null) {
         reportList.add(this.packRepordMsg(fastDao, 1));
      }

      if (minimumPowerDao != null) {
         reportList.add(this.packRepordMsg(minimumPowerDao, 2));
      }

      if (selfDao != null) {
         reportList.add(this.packRepordMsg(selfDao, 3));
      }

      return reportList;
   }

   private BattleTowerMsg.RecordInfo packRepordMsg(BattleTowerRecordDao recordDao, int type) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer gamePlayer = worldMgr.getPlayerById(recordDao.playerId);
      PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
      BattleTowerMsg.RecordInfo.Builder builder = BattleTowerMsg.RecordInfo.newBuilder();
      builder.setPlayerId(playerPublicDao.playerId);
      builder.setPlayerName(playerPublicDao.playerName);
      builder.setType(type);
      builder.setHead(playerPublicDao.head);
      builder.setHeadFrame(playerPublicDao.headFrame);
      BattleTowerMsg.WaveInfo.Builder waveBuilder = BattleTowerMsg.WaveInfo.newBuilder();
      waveBuilder.setRecordId(recordDao.recordId);
      waveBuilder.setCrossPower(recordDao.crossPower);
      waveBuilder.setCrossTime(recordDao.crossTime / 1000);
      waveBuilder.setStartTime(recordDao.startTime);
      waveBuilder.setHeroArrayState(recordDao.heroArrayState);
      builder.addWaveInfo(waveBuilder);
      if (recordDao.recordId2 > 0) {
         BattleTowerMsg.WaveInfo.Builder waveBuilder2 = BattleTowerMsg.WaveInfo.newBuilder();
         waveBuilder2.setRecordId(recordDao.recordId2);
         waveBuilder2.setCrossPower(recordDao.crossPower2);
         waveBuilder2.setCrossTime(recordDao.crossTime2 / 1000);
         waveBuilder2.setStartTime(recordDao.startTime2);
         waveBuilder2.setHeroArrayState(recordDao.heroArrayState2);
         builder.addWaveInfo(waveBuilder2);
      }

      return builder.build();
   }

   public void recordTowerWinner(int towerId, int playerId) {
      Map<Integer, TrailTowerOwnerDao> ownerDaoMap = this.gameCachePool.getAllTableByMap("tb_trail_tower_owner");
      if (!ownerDaoMap.containsKey(towerId)) {
         TrailTowerOwnerDao trailTowerOwnerDao = new TrailTowerOwnerDao();
         trailTowerOwnerDao.towerId = towerId;
         trailTowerOwnerDao.playerId = playerId;
         trailTowerOwnerDao.insertOp();
         this.gameCachePool.insertDao(trailTowerOwnerDao, true);
         this.notifyOwnerChange(towerId, playerId);
      }
   }

   private void notifyOwnerChange(int towerId, int playerId) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer owner = worldMgr.getPlayerById(playerId);
      if (owner != null) {
         PlayerDao ownerDao = owner.getPlayerDao();
         OnLineMgr onLineMgr = (OnLineMgr)ApplicationContextProvider.getContext().getBean(OnLineMgr.class);
         onLineMgr.pushTask(() -> onLineMgr.onlineBroadcast(this.updateTowerOwnerInfo(towerId, playerId, ownerDao.playerName, ownerDao.head, ownerDao.headFrame)));
      }
   }

   public void sendTowerOwnerInfo(GamePlayer player) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      worldMgr.pushTask(() -> {
         Map<Integer, TrailTowerOwnerDao> ownerDaoMap = this.gameCachePool.getAllTableByMap("tb_trail_tower_owner");
         TrailTowerMsg.S2C_UpdateTowerOwner_10414.Builder builder = TrailTowerMsg.S2C_UpdateTowerOwner_10414.newBuilder();

         for(TrailTowerOwnerDao ownerDao : ownerDaoMap.values()) {
            TrailTowerMsg.TowerOwner_Info.Builder ownerInfo = TrailTowerMsg.TowerOwner_Info.newBuilder();
            ownerInfo.setTowerId(ownerDao.towerId);
            ownerInfo.setPlayerId(ownerDao.playerId);
            GamePlayer otherPlayer = worldMgr.getPlayerById(ownerDao.playerId);
            if (otherPlayer != null) {
               PlayerPublicDao playerPublicDao = otherPlayer.getPublicDao();
               ownerInfo.setPlayerName(playerPublicDao.playerName);
               ownerInfo.setHead(playerPublicDao.head);
               ownerInfo.setHeadFrame(playerPublicDao.headFrame);
               builder.addOwnerInfo(ownerInfo);
            }
         }

         player.sendMsg(builder.build());
      });
   }

   public void challengeOwner(GamePlayer player, int towerId, int ownerId) {
      Map<Integer, TrailTowerOwnerDao> ownerDaoMap = this.gameCachePool.getAllTableByMap("tb_trail_tower_owner");
      TrailTowerOwnerDao trailTowerOwnerDao = (TrailTowerOwnerDao)ownerDaoMap.get(towerId);
      if (trailTowerOwnerDao == null) {
         player.failure(5033);
      } else if (trailTowerOwnerDao.playerId == player.getPlayerId()) {
         player.failure(5030);
      } else if (trailTowerOwnerDao.playerId != ownerId) {
         player.failure(5032);
      } else {
         this.fightTowerWinner(player.getPlayerId(), towerId, ownerId);
      }
   }

   public TrailTowerMsg.S2C_UpdateTowerOwner_10414 updateTowerOwnerInfo(int towerId, int playerId, String playerName, int head, int headFrame) {
      TrailTowerMsg.S2C_UpdateTowerOwner_10414.Builder builder = TrailTowerMsg.S2C_UpdateTowerOwner_10414.newBuilder();
      TrailTowerMsg.TowerOwner_Info.Builder ownerInfo = TrailTowerMsg.TowerOwner_Info.newBuilder();
      ownerInfo.setTowerId(towerId);
      ownerInfo.setPlayerId(playerId);
      ownerInfo.setPlayerName(playerName);
      ownerInfo.setHead(head);
      ownerInfo.setHeadFrame(headFrame);
      builder.addOwnerInfo(ownerInfo);
      return builder.build();
   }

   private void fightTowerWinner(int playerId, int towerId, int winnerId) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer player = worldMgr.getPlayerById(playerId);
      if (player != null) {
         Map<Integer, TrailTowerOwnerDao> ownerDaoMap = this.gameCachePool.getAllTableByMap("tb_trail_tower_owner");
         if (!ownerDaoMap.containsKey(towerId)) {
            player.failure(5033);
         } else {
            TrailTowerOwnerDao ownerDao = (TrailTowerOwnerDao)ownerDaoMap.get(towerId);
            if (ownerDao.playerId != winnerId) {
               player.failure(5032);
            } else {
               GamePlayer leftPlayer = worldMgr.getPlayerById(playerId);
               GamePlayer rightPlayer = worldMgr.getPlayerById(winnerId);
               PlayerDao leftPlayerDao = leftPlayer.getPlayerDao();
               PlayerDao rightPlayerDao = rightPlayer.getPlayerDao();
               ArrayingMirror leftArrayingDao = ((HeroArrayingPart)leftPlayer.getMgrPart(HeroArrayingPart.class)).getArrayingMirrorByType(CommonMsg.HeroState.HERO_STATE_BATTLE_TOWER);
               ArrayingMirror rightArrayingDao = ((HeroArrayingPart)rightPlayer.getMgrPart(HeroArrayingPart.class)).getArrayingMirrorByType(CommonMsg.HeroState.HERO_STATE_BATTLE_TOWER);
               BattleScene battleScene = new BattleScene(2131, 0);
               BattlePKTeam leftTeam = new BattlePKTeam(playerId, leftPlayerDao.playerName, leftArrayingDao, leftPlayerDao.lv, leftPlayerDao.head, leftPlayerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(leftArrayingDao, leftPlayer.isRobot()));
               BattlePKTeam rightTeam = new BattlePKTeam(playerId, rightPlayerDao.playerName, rightArrayingDao, rightPlayerDao.lv, rightPlayerDao.head, rightPlayerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(rightArrayingDao, rightPlayer.isRobot()));
               battleScene.addPKTeam(leftTeam, rightTeam);
               BattleMsg.S2C_BattleResult_6102.Builder fight = battleScene.fight((byte)17);
               player.sendMsg(fight.build());
               if (battleScene.getWinForce() == 0) {
                  ownerDao.playerId = playerId;
                  this.gameCachePool.updateDao(ownerDao, true);
                  this.notifyOwnerChange(towerId, playerId);
               } else {
                  this.logger.info("擂主获得胜利");
               }

            }
         }
      }
   }
}
