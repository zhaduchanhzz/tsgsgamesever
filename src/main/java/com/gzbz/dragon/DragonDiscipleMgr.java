package com.gzbz.dragon;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import cn.hutool.core.collection.ConcurrentHashSet;
import com.google.protobuf.InvalidProtocolBufferException;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.DragonTeamDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.arraying.FriendArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.DragonPlayerData;
import com.gzbz.db.bean.DragonTeamData;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.db.worldBean.WorldData;
import com.gzbz.dragon.part.DragonStrengthenPart;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.model.DragonStrengthenBattleModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossDragonTeamMsg;
import com.gzbz.protobuf.DragonDiscipleMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import misc.DateUtil;
import misc.MapUtil;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@MgrAnno
@Component
public class DragonDiscipleMgr extends GameMgr {
   static final Logger logger = LoggerFactory.getLogger(DragonDiscipleMgr.class);
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private BattleRecordMgr battleRecordMgr;
   @Autowired
   private HeroRankMgr heroRankMgr;
   @Autowired
   private RankMgr rankMgr;
   @Autowired
   private CrossNettyClient crossNettyClient;
   public final Map<Integer, Integer> playerTeamMap = new ConcurrentHashMap();
   public final Map<Integer, Set<Integer>> playerInviteTeamMap = new ConcurrentHashMap();
   public final Map<Integer, Set<Integer>> playerApplyTeamMap = new ConcurrentHashMap();
   public boolean openCross = true;

   protected void init() throws Exception {
   }

   private Map<Integer, DragonTeamDao> getDragonTeamMap() {
      return this.gameCachePool.getAllTableByMap("tb_dragon_team");
   }

   public void initData() {
      Map<Integer, DragonTeamDao> dragonTeamDaoMap = this.getDragonTeamMap();

      for(DragonTeamDao dragonTeamDao : dragonTeamDaoMap.values()) {
         if (!dragonTeamDao.players.isEmpty()) {
            for(Integer playerId : dragonTeamDao.players.keySet()) {
               this.playerTeamMap.put(playerId, dragonTeamDao.teamId);
            }

            for(Integer playerId : dragonTeamDao.invitePlayers) {
               if (this.playerInviteTeamMap.containsKey(playerId)) {
                  (this.playerInviteTeamMap.get(playerId)).add(dragonTeamDao.teamId);
               } else {
                  Set<Integer> set = new ConcurrentHashSet();
                  set.add(dragonTeamDao.teamId);
                  this.playerInviteTeamMap.put(playerId, set);
               }
            }

            for(Integer playerId : dragonTeamDao.applyPlayers) {
               if (this.playerApplyTeamMap.containsKey(playerId)) {
                  (this.playerApplyTeamMap.get(playerId)).add(dragonTeamDao.teamId);
               } else {
                  Set<Integer> set = new ConcurrentHashSet();
                  set.add(dragonTeamDao.teamId);
                  this.playerApplyTeamMap.put(playerId, set);
               }
            }
         }
      }

      WorldDao<WorldData> worldDao = this.worldMgr.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
      if (worldDao != null) {
         WorldData worldData = (WorldData)worldDao.jsonData;
         this.openCross = worldData.openCrossDragon;
      }
   }

   public DragonTeamDao createTeam(GamePlayer captainPlayer, long powerLimit, int levelLimit, boolean verify, int dragonStage) {
      DragonTeamDao dragonTeamDao = new DragonTeamDao();
      dragonTeamDao.captain = captainPlayer.getPlayerId();
      dragonTeamDao.minPower = powerLimit;
      dragonTeamDao.minLevel = levelLimit;
      dragonTeamDao.needVerify = verify;
      dragonTeamDao.dragonStage = dragonStage;
      dragonTeamDao.createTime = DateUtil.getIntTime(System.currentTimeMillis());
      this.gameCachePool.insertDao(dragonTeamDao, true);
      this.joinTeam(captainPlayer, dragonTeamDao);
      return dragonTeamDao;
   }

   public boolean joinTeam(GamePlayer joinPlayer, DragonTeamDao dragonTeamDao) {
      this.playerInviteTeamMap.remove(joinPlayer.getPlayerId());
      this.playerTeamMap.put(joinPlayer.getPlayerId(), dragonTeamDao.teamId);
      this.playerApplyTeamMap.remove(joinPlayer.getPlayerId());
      DragonPlayerData data = new DragonPlayerData();
      data.playerId = joinPlayer.getPlayerId();
      if (dragonTeamDao.captain == joinPlayer.getPlayerId()) {
         data.isReady = true;
      }

      dragonTeamDao.players.put(joinPlayer.getPlayerId(), data);
      if (dragonTeamDao.players.size() >= 3) {
         dragonTeamDao.invitePlayers.clear();
         dragonTeamDao.applyPlayers.clear();
      }

      dragonTeamDao.createTime = DateUtil.getIntTime(System.currentTimeMillis());
      dragonTeamDao.updateOp();

      for(DragonTeamDao team : this.getDragonTeamMap().values()) {
         boolean updateFlag = false;
         if (team.applyPlayers.contains(joinPlayer.getPlayerId())) {
            team.applyPlayers.remove(joinPlayer.getPlayerId());
            updateFlag = true;
         }

         if (team.invitePlayers.contains(joinPlayer.getPlayerId())) {
            team.invitePlayers.remove(joinPlayer.getPlayerId());
            updateFlag = true;
         }

         if (updateFlag) {
            team.updateOp();
         }
      }

      for(Integer playerId : dragonTeamDao.players.keySet()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
         if (gamePlayer != null) {
            this.sendMyTeamInfo(gamePlayer);
         }
      }

      return true;
   }

   public List<DragonTeamDao> getTeamsByStage(int stage) {
      Map<Integer, DragonTeamDao> dragonTeamMap = this.getDragonTeamMap();
      if (stage > 0) {
         List<DragonTeamDao> list = new ArrayList();

         for(DragonTeamDao dragonTeamDao : dragonTeamMap.values()) {
            if (dragonTeamDao.dragonStage == stage) {
               list.add(dragonTeamDao);
            }
         }

         return list;
      } else {
         return new ArrayList(dragonTeamMap.values());
      }
   }

   public DragonTeamDao getTeamById(int teamId) {
      Map<Integer, DragonTeamDao> dragonTeamMap = this.getDragonTeamMap();
      return (DragonTeamDao)dragonTeamMap.get(teamId);
   }

   public boolean checkAllTeamIsExit(int checkTeamId) {
      Map<Integer, DragonTeamDao> dragonTeamMap = this.getDragonTeamMap();
      if (dragonTeamMap.isEmpty()) {
         return false;
      } else {
         for(DragonTeamDao dao : dragonTeamMap.values()) {
            if (dao.teamId == checkTeamId) {
               return true;
            }
         }

         return false;
      }
   }

   public DragonDiscipleMsg.TeamInfo buildTeamMsg(DragonTeamDao dragonTeamDao) {
      if (dragonTeamDao == null) {
         return null;
      } else {
         DragonDiscipleMsg.TeamInfo.Builder teamBuilder = DragonDiscipleMsg.TeamInfo.newBuilder();
         teamBuilder.setCaptain(dragonTeamDao.captain);
         teamBuilder.setDragonStage(dragonTeamDao.dragonStage);
         teamBuilder.setPowerLimit(dragonTeamDao.minPower);
         teamBuilder.setDragonLimit(dragonTeamDao.minLevel);
         teamBuilder.setVerify(dragonTeamDao.needVerify);
         long totalPower = 0L;

         for(Map.Entry<Integer, DragonPlayerData> entry : dragonTeamDao.players.entrySet()) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)entry.getKey());
            if (gamePlayer != null) {
               PlayerDao playerDao = gamePlayer.getPlayerDao();
               DragonDiscipleMsg.TeamPlayerInfo.Builder playerInfo = DragonDiscipleMsg.TeamPlayerInfo.newBuilder();
               playerInfo.setPlayerId(playerDao.playerId);
               playerInfo.setPlayerName(playerDao.playerName);
               playerInfo.setLevel(playerDao.lv);
               playerInfo.setHead(playerDao.head);
               playerInfo.setPower(gamePlayer.getPlayerCombatPower());
               playerInfo.setHeadFrame(playerDao.headFrame);
               playerInfo.setMonarchId(playerDao.monarchId);
               playerInfo.setIsReady(((DragonPlayerData)entry.getValue()).isReady);
               playerInfo.setVipLv(playerDao.vip_lv);
               playerInfo.setShowVip(playerDao.isShowVip);
               playerInfo.setServerId(playerDao.serverId);
               teamBuilder.addPlayerList(playerInfo);
            }
         }

         try {
            for(Map.Entry<Integer, DragonTeamData> entry : dragonTeamDao.arraying.entrySet()) {
               DragonDiscipleMsg.PlayerArraying.Builder heroBuilder = DragonDiscipleMsg.PlayerArraying.newBuilder();
               HeroMirror mirror = HeroMirror.toHeroMirror(((DragonTeamData)entry.getValue()).hero);
               heroBuilder.setHeroInfo(mirror.toBuilder());
               heroBuilder.setPlayerId(((DragonTeamData)entry.getValue()).playerId);
               heroBuilder.setPos((Integer)entry.getKey());
               teamBuilder.addArraying(heroBuilder);
               totalPower += mirror.combatPower;
            }
         } catch (Exception var11) {
            dragonTeamDao.arraying.clear();
            dragonTeamDao.updateOp();
         }

         teamBuilder.setPower(totalPower);
         teamBuilder.setTeamId(dragonTeamDao.teamId);
         if (dragonTeamDao.battleMsg != null && dragonTeamDao.battleMsg.length > 0) {
            try {
               BattleMsg.S2C_BattleResult_6102 builder = BattleMsg.S2C_BattleResult_6102.parseFrom(dragonTeamDao.battleMsg);
               teamBuilder.setResult(builder);
            } catch (InvalidProtocolBufferException e) {
               e.printStackTrace();
            }
         }

         return teamBuilder.build();
      }
   }

   public DragonDiscipleMsg.TeamInfo buildTeamMsg(DragonTeamDao dragonTeamDao, GamePlayer player) {
      if (dragonTeamDao == null) {
         return null;
      } else {
         DragonDiscipleMsg.TeamInfo.Builder teamBuilder = DragonDiscipleMsg.TeamInfo.newBuilder();
         teamBuilder.setCaptain(dragonTeamDao.captain);
         teamBuilder.setDragonStage(dragonTeamDao.dragonStage);
         teamBuilder.setPowerLimit(dragonTeamDao.minPower);
         teamBuilder.setDragonLimit(dragonTeamDao.minLevel);
         teamBuilder.setVerify(dragonTeamDao.needVerify);
         long totalPower = 0L;

         for(Map.Entry<Integer, DragonPlayerData> entry : dragonTeamDao.players.entrySet()) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)entry.getKey());
            if (gamePlayer != null) {
               PlayerDao playerDao = gamePlayer.getPlayerDao();
               DragonDiscipleMsg.TeamPlayerInfo.Builder playerInfo = DragonDiscipleMsg.TeamPlayerInfo.newBuilder();
               playerInfo.setPlayerId(playerDao.playerId);
               playerInfo.setPlayerName(playerDao.playerName);
               playerInfo.setLevel(playerDao.lv);
               playerInfo.setHead(playerDao.head);
               playerInfo.setPower(gamePlayer.getPlayerCombatPower());
               playerInfo.setHeadFrame(playerDao.headFrame);
               playerInfo.setMonarchId(playerDao.monarchId);
               playerInfo.setIsReady(((DragonPlayerData)entry.getValue()).isReady);
               playerInfo.setVipLv(playerDao.vip_lv);
               playerInfo.setShowVip(playerDao.isShowVip);
               playerInfo.setServerId(playerDao.serverId);
               teamBuilder.addPlayerList(playerInfo);
            }
         }

         try {
            for(Map.Entry<Integer, DragonTeamData> entry : dragonTeamDao.arraying.entrySet()) {
               DragonDiscipleMsg.PlayerArraying.Builder heroBuilder = DragonDiscipleMsg.PlayerArraying.newBuilder();
               HeroMirror mirror = HeroMirror.toHeroMirror(((DragonTeamData)entry.getValue()).hero);
               heroBuilder.setHeroInfo(mirror.toBuilder());
               heroBuilder.setPlayerId(((DragonTeamData)entry.getValue()).playerId);
               heroBuilder.setPos((Integer)entry.getKey());
               teamBuilder.addArraying(heroBuilder);
               totalPower += mirror.combatPower;
            }
         } catch (Exception var12) {
            dragonTeamDao.arraying.clear();
            dragonTeamDao.updateOp();
         }

         teamBuilder.setPower(totalPower);
         teamBuilder.setTeamId(dragonTeamDao.teamId);
         if (dragonTeamDao.players.containsKey(player.getPlayerId())) {
            DragonPlayerData data = (DragonPlayerData)dragonTeamDao.players.get(player.getPlayerId());
            if (data.battleEndTime > 0 && DateUtil.getIntTime(System.currentTimeMillis()) < data.battleEndTime) {
               if (dragonTeamDao.battleMsg != null && dragonTeamDao.battleMsg.length > 0) {
                  try {
                     BattleMsg.S2C_BattleResult_6102 builder = BattleMsg.S2C_BattleResult_6102.parseFrom(dragonTeamDao.battleMsg);
                     teamBuilder.setResult(builder);
                  } catch (InvalidProtocolBufferException e) {
                     e.printStackTrace();
                  }
               }
            } else if (data.battleEndTime > 0 && DateUtil.getIntTime(System.currentTimeMillis()) >= data.battleEndTime + 30) {
               this.dismissTeam(dragonTeamDao, false, 0);
            }
         }

         return teamBuilder.build();
      }
   }

   public DragonDiscipleMsg.TeamInfo buildTeamMsg(int teamId) {
      return this.buildTeamMsg(this.getTeamById(teamId));
   }

   public boolean modifyTeam(DragonTeamDao dragonTeamDao, long powerLimit, int levelLimit, boolean verify) {
      dragonTeamDao.minPower = powerLimit;
      dragonTeamDao.minLevel = levelLimit;
      dragonTeamDao.needVerify = verify;
      dragonTeamDao.updateOp();
      return true;
   }

   public boolean handleApply(boolean isAgree, GamePlayer captainPlayer, GamePlayer applyPlayer, DragonTeamDao dragonTeamDao) {
      if (isAgree) {
         this.joinTeam(applyPlayer, dragonTeamDao);
      } else {
         if (dragonTeamDao.applyPlayers.contains(applyPlayer.getPlayerId())) {
            dragonTeamDao.applyPlayers.remove(applyPlayer.getPlayerId());
         }

         if (dragonTeamDao.invitePlayers.contains(applyPlayer.getPlayerId())) {
            dragonTeamDao.invitePlayers.remove(applyPlayer.getPlayerId());
         }

         if (this.playerApplyTeamMap.containsKey(applyPlayer.getPlayerId()) && (this.playerApplyTeamMap.get(applyPlayer.getPlayerId())).contains(dragonTeamDao.teamId)) {
            (this.playerApplyTeamMap.get(applyPlayer.getPlayerId())).remove(dragonTeamDao.teamId);
         }

         dragonTeamDao.updateOp();
      }

      return true;
   }

   public boolean invite(GamePlayer captainPlayer, GamePlayer invitePlayer, DragonTeamDao dragonTeamDao) {
      if (this.playerInviteTeamMap.containsKey(invitePlayer.getPlayerId())) {
         (this.playerInviteTeamMap.get(invitePlayer.getPlayerId())).add(dragonTeamDao.teamId);
      } else {
         Set<Integer> set = new ConcurrentHashSet();
         set.add(dragonTeamDao.teamId);
         this.playerInviteTeamMap.put(invitePlayer.getPlayerId(), set);
      }

      dragonTeamDao.invitePlayers.add(invitePlayer.getPlayerId());
      dragonTeamDao.updateOp();
      if (invitePlayer.isLogin()) {
         DragonDiscipleMsg.S2C_TeamInviteNotify_13435.Builder notifyMsg = DragonDiscipleMsg.S2C_TeamInviteNotify_13435.newBuilder();
         notifyMsg.setInviteTeam(this.buildTeamMsg(dragonTeamDao));
         invitePlayer.sendMsg(notifyMsg.build());
      }

      return true;
   }

   public boolean apply(GamePlayer applyPlayer, DragonTeamDao dragonTeamDao, boolean chatJoin) {
      if (dragonTeamDao.needVerify && !chatJoin) {
         dragonTeamDao.applyPlayers.add(applyPlayer.getPlayerId());
         if (this.playerApplyTeamMap.containsKey(applyPlayer.getPlayerId())) {
            (this.playerApplyTeamMap.get(applyPlayer.getPlayerId())).add(dragonTeamDao.teamId);
         } else {
            Set<Integer> set = new ConcurrentHashSet();
            set.add(dragonTeamDao.teamId);
            this.playerApplyTeamMap.put(applyPlayer.getPlayerId(), set);
         }

         GamePlayer captainPlayer = this.worldMgr.getOnlinePlayer(dragonTeamDao.captain);
         if (captainPlayer != null) {
            DragonDiscipleMsg.S2C_TeamApplyNotify_13434.Builder notifyMsg = DragonDiscipleMsg.S2C_TeamApplyNotify_13434.newBuilder();
            notifyMsg.setApplyPlayer(applyPlayer.toPlayerInfo(CommonMsg.HeroState.HERO_STATE_ARRAYING));
            captainPlayer.sendMsg(notifyMsg.build());
         }
      } else {
         this.joinTeam(applyPlayer, dragonTeamDao);
      }

      dragonTeamDao.updateOp();
      return true;
   }
//
//   public boolean exitTeam(GamePlayer exitPlayer, DragonTeamDao dragonTeamDao) {
//      new LinkedHashMap(dragonTeamDao.players);
//      this.playerTeamMap.remove(exitPlayer.getPlayerId());
//      dragonTeamDao.players.remove(exitPlayer.getPlayerId());
//      Iterator<DragonTeamData> itt = dragonTeamDao.arraying.values().iterator();
//
//      while(itt.hasNext()) {
//         DragonTeamData data = (DragonTeamData)itt.next();
//         if (data.playerId == exitPlayer.getPlayerId()) {
//            itt.remove();
//         }
//      }
//
//      dragonTeamDao.updateOp();
//      if (exitPlayer.getPlayerId() == dragonTeamDao.captain) {
//         if (dragonTeamDao.players.isEmpty()) {
//            Iterator<Map.Entry<Integer, Set<Integer>>> iterator = this.playerInviteTeamMap.entrySet().iterator();
//
//            while(iterator.hasNext()) {
//               Map.Entry<Integer, Set<Integer>> entry = (Map.Entry)iterator.next();
//               (entry.getValue()).remove(dragonTeamDao.teamId);
//               if ((entry.getValue()).isEmpty()) {
//                  iterator.remove();
//               }
//            }
//
//            this.gameCachePool.deleteDao(dragonTeamDao, true);
//         } else if (dragonTeamDao.players.size() == 1) {
//            Iterator<DragonTeamData> it = dragonTeamDao.players.keySet().iterator();
//            if (it.hasNext()) {
//               int playerId = (Integer)it.next();
//               dragonTeamDao.captain = playerId;
//               ((DragonPlayerData)dragonTeamDao.players.get(dragonTeamDao.captain)).isReady = true;
//               dragonTeamDao.updateOp();
//            }
//
//            it = dragonTeamDao.arraying.values().iterator();
//
//            while(it.hasNext()) {
//               DragonTeamData data = (DragonTeamData)it.next();
//               if (data.playerId == exitPlayer.getPlayerId()) {
//                  it.remove();
//               }
//            }
//
//            dragonTeamDao.updateOp();
//         } else {
//            int playerId = 0;
//            long tempPower = 0L;
//
//            for(DragonPlayerData data : dragonTeamDao.players.values()) {
//               GamePlayer player = this.worldMgr.getPlayerById(data.playerId);
//               if (player.getPlayerCombatPower() > tempPower) {
//                  playerId = player.getPlayerId();
//                  tempPower = player.getPlayerCombatPower();
//               }
//            }
//
//            dragonTeamDao.captain = playerId;
//            ((DragonPlayerData)dragonTeamDao.players.get(dragonTeamDao.captain)).isReady = true;
//            Iterator<DragonTeamData> it = dragonTeamDao.arraying.values().iterator();
//
//            while(it.hasNext()) {
//               DragonTeamData data = (DragonTeamData)it.next();
//               if (data.playerId == exitPlayer.getPlayerId()) {
//                  it.remove();
//               }
//            }
//
//            dragonTeamDao.updateOp();
//         }
//      }
//
//      return true;
//   }
public boolean exitTeam(GamePlayer exitPlayer, DragonTeamDao dragonTeamDao) {

    int exitPlayerId = exitPlayer.getPlayerId();

    // Remove player from team maps
    playerTeamMap.remove(exitPlayerId);
    dragonTeamDao.players.remove(exitPlayerId);

    // Remove from arraying
    Iterator<DragonTeamData> arrayIterator =
            dragonTeamDao.arraying.values().iterator();

    while (arrayIterator.hasNext()) {
        DragonTeamData data = arrayIterator.next();
        if (data.playerId == exitPlayerId) {
            arrayIterator.remove();
        }
    }

    dragonTeamDao.updateOp();

    // If exiting player is not captain → done
    if (exitPlayerId != dragonTeamDao.captain) {
        return true;
    }

    // Captain is leaving

    // Case 1: No players left → delete team
    if (dragonTeamDao.players.isEmpty()) {

        Iterator<Map.Entry<Integer, Set<Integer>>> inviteIterator =
                playerInviteTeamMap.entrySet().iterator();

        while (inviteIterator.hasNext()) {
            Map.Entry<Integer, Set<Integer>> entry = inviteIterator.next();
            Set<Integer> teamSet = entry.getValue();

            teamSet.remove(dragonTeamDao.teamId);

            if (teamSet.isEmpty()) {
                inviteIterator.remove();
            }
        }

        gameCachePool.deleteDao(dragonTeamDao, true);
        return true;
    }

    // Case 2: Only one player left → auto assign captain
    if (dragonTeamDao.players.size() == 1) {

        Integer newCaptainId =
                dragonTeamDao.players.keySet().iterator().next();

        dragonTeamDao.captain = newCaptainId;

        DragonPlayerData captainData =
                dragonTeamDao.players.get(newCaptainId);

        if (captainData != null) {
            captainData.isReady = true;
        }

        dragonTeamDao.updateOp();
        return true;
    }

    // Case 3: Multiple players left → assign highest combat power as captain
    int newCaptainId = 0;
    long maxPower = 0L;

    for (DragonPlayerData data : dragonTeamDao.players.values()) {

        GamePlayer player = worldMgr.getPlayerById(data.playerId);
        if (player == null) {
            continue;
        }

        long power = player.getPlayerCombatPower();
        if (power > maxPower) {
            maxPower = power;
            newCaptainId = player.getPlayerId();
        }
    }

    if (newCaptainId > 0) {
        dragonTeamDao.captain = newCaptainId;

        DragonPlayerData captainData =
                dragonTeamDao.players.get(newCaptainId);

        if (captainData != null) {
            captainData.isReady = true;
        }
    }

    dragonTeamDao.updateOp();

    return true;
}
   public boolean kickOut(GamePlayer captainPlayer, GamePlayer beKickOutPlayer, DragonTeamDao dragonTeamDao) {
      return this.exitTeam(beKickOutPlayer, dragonTeamDao);
   }

   public DragonDiscipleMsg.S2C_SendTeamInfo_13431 sendTeamInfo(DragonTeamDao dragonTeamDao) {
      DragonDiscipleMsg.S2C_SendTeamInfo_13431.Builder builder = DragonDiscipleMsg.S2C_SendTeamInfo_13431.newBuilder();
      builder.setCaptain(dragonTeamDao.captain);

      for(Map.Entry<Integer, DragonPlayerData> entry : dragonTeamDao.players.entrySet()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)entry.getKey());
         if (gamePlayer != null) {
            PlayerDao playerDao = gamePlayer.getPlayerDao();
            DragonDiscipleMsg.TeamPlayerInfo.Builder playerInfo = DragonDiscipleMsg.TeamPlayerInfo.newBuilder();
            playerInfo.setPlayerId(playerDao.playerId);
            playerInfo.setPlayerName(playerDao.playerName);
            playerInfo.setLevel(playerDao.lv);
            playerInfo.setHead(playerDao.head);
            playerInfo.setHeadFrame(playerDao.headFrame);
            playerInfo.setVipLv(playerDao.vip_lv);
            playerInfo.setShowVip(playerDao.isShowVip);
            playerInfo.setIsReady(((DragonPlayerData)entry.getValue()).isReady);
            playerInfo.setServerId(playerDao.serverId);
            builder.addPlayerList(playerInfo);
         }
      }

      try {
         for(Map.Entry<Integer, DragonTeamData> entry : dragonTeamDao.arraying.entrySet()) {
            DragonDiscipleMsg.PlayerArraying.Builder heroBuilder = DragonDiscipleMsg.PlayerArraying.newBuilder();
            HeroMirror mirror = HeroMirror.toHeroMirror(((DragonTeamData)entry.getValue()).hero);
            heroBuilder.setHeroInfo(mirror.toBuilder());
            heroBuilder.setPlayerId(((DragonTeamData)entry.getValue()).playerId);
            heroBuilder.setPos((Integer)entry.getKey());
            builder.addArraying(heroBuilder);
         }
      } catch (Exception var8) {
         dragonTeamDao.arraying.clear();
         dragonTeamDao.updateOp();
      }

      for(Integer playerId : dragonTeamDao.players.keySet()) {
         GamePlayer gamePlayer = this.worldMgr.getOnlinePlayer(playerId);
         if (gamePlayer != null) {
            gamePlayer.sendMsg(builder.build());
         }
      }

      return builder.build();
   }

   public void notifyPlayerReady(GamePlayer player, boolean isReady, int playerId) {
      DragonDiscipleMsg.S2C_NotifyReadyState_13449.Builder builder = DragonDiscipleMsg.S2C_NotifyReadyState_13449.newBuilder();
      builder.setPlayerId(playerId);
      builder.setIsReady(isReady);
      player.sendMsg(builder.build());
   }

   @TaskMethod
   public void C2S_CreateTeam_13405(GamePlayer player, DragonDiscipleMsg.C2S_CreateTeam_13405 msg) {
      if (this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61020);
      } else {
         DragonTeamDao dragonTeamDao = this.createTeam(player, msg.getPowerLimit(), msg.getDragonLimit(), msg.getVerify(), msg.getDragonStage());
         if (dragonTeamDao != null) {
            DragonDiscipleMsg.S2C_CreateTeam_13406.Builder resp = DragonDiscipleMsg.S2C_CreateTeam_13406.newBuilder();
            resp.setMyTeam(this.buildTeamMsg(dragonTeamDao));
            player.sendMsg(resp.build());
         }
      }
   }

   @TaskMethod
   public void C2S_ModifyTeam_13407(GamePlayer player, DragonDiscipleMsg.C2S_ModifyTeam_13407 msg) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61022);
      } else {
         DragonTeamDao dragonTeamDao = this.getTeamById((Integer)this.playerTeamMap.get(player.getPlayerId()));
         if (dragonTeamDao == null) {
            player.failure(61022);
         } else if (dragonTeamDao.captain != player.getPlayerId()) {
            player.failure(61023);
         } else if (this.checkAllTeamIsExit(dragonTeamDao.teamId)) {
            if (this.modifyTeam(dragonTeamDao, msg.getPowerLimit(), msg.getDragonLimit(), msg.getVerify())) {
               DragonDiscipleMsg.S2C_ModifyTeam_13408.Builder resp = DragonDiscipleMsg.S2C_ModifyTeam_13408.newBuilder();
               resp.setPowerLimit(msg.getPowerLimit());
               resp.setDragonLimit(msg.getDragonLimit());
               resp.setVerify(msg.getVerify());
               player.sendMsg(resp.build());
            }
         }
      }
   }

   @TaskMethod
   public void C2S_TeamInvitePlayerList_13411(GamePlayer player, DragonDiscipleMsg.C2S_TeamInvitePlayerList_13411 msg) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61022);
      } else {
         DragonTeamDao dragonTeamDao = this.getTeamById((Integer)this.playerTeamMap.get(player.getPlayerId()));
         if (dragonTeamDao == null) {
            player.failure(61022);
         } else if (dragonTeamDao.captain != player.getPlayerId()) {
            player.failure(61023);
         } else {
            DragonDiscipleMsg.S2C_TeamInvitePlayerList_13412.Builder resp = DragonDiscipleMsg.S2C_TeamInvitePlayerList_13412.newBuilder();

            for(RankData rankData : this.rankMgr.getRanks(RankDefine.RankModule.COMBAT_POWER, 100)) {
               GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankData.value);
               if (gamePlayer != null) {
                  PlayerPublicDao publicDao = gamePlayer.getPublicDao();
                  if (!StringUtils.isEmpty(publicDao.playerName) && !this.playerTeamMap.containsKey(gamePlayer.getPlayerId())) {
                     DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)gamePlayer.getPlayerExtend(65);
                     if (dragonDiscipleExtend.breachLv >= dragonTeamDao.dragonStage) {
                        int battleNum = this.configManager.getIntDefault("drangonBattleTime", 5);
                        if (dragonDiscipleExtend.battleNum < battleNum) {
                           resp.addInvitePlayerList(gamePlayer.toPlayerInfo(CommonMsg.HeroState.HERO_STATE_ARRAYING));
                           if (resp.getInvitePlayerListList().size() >= 20) {
                              break;
                           }
                        }
                     }
                  }
               }
            }

            resp.addAllInvitedPlayerIds(dragonTeamDao.invitePlayers);
            player.sendMsg(resp.build());
         }
      }
   }

   @TaskMethod
   public void C2S_TeamApplyList_13409(GamePlayer player, DragonDiscipleMsg.C2S_TeamApplyList_13409 msg) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61022);
      } else {
         DragonTeamDao dragonTeamDao = this.getTeamById((Integer)this.playerTeamMap.get(player.getPlayerId()));
         if (dragonTeamDao == null) {
            player.failure(61022);
         } else if (dragonTeamDao.captain != player.getPlayerId()) {
            player.failure(61023);
         } else {
            DragonDiscipleMsg.S2C_TeamApplyList_13410.Builder resp = DragonDiscipleMsg.S2C_TeamApplyList_13410.newBuilder();

            for(Integer playerId : dragonTeamDao.applyPlayers) {
               GamePlayer applyPlayer = this.worldMgr.getPlayerById(playerId);
               if (applyPlayer != null) {
                  resp.addApplyPlayerList(applyPlayer.toPlayerInfo(CommonMsg.HeroState.HERO_STATE_ARRAYING));
               }
            }

            player.sendMsg(resp.build());
         }
      }
   }

   @TaskMethod
   public void C2S_CaptainApplyOp_13413(GamePlayer player, DragonDiscipleMsg.C2S_CaptainApplyOp_13413 msg) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61022);
      } else {
         DragonTeamDao dragonTeamDao = this.getTeamById((Integer)this.playerTeamMap.get(player.getPlayerId()));
         if (dragonTeamDao == null) {
            player.failure(61022);
         } else if (dragonTeamDao.captain != player.getPlayerId()) {
            player.failure(61023);
         } else if (dragonTeamDao.players.size() >= 3) {
            dragonTeamDao.invitePlayers.clear();
            dragonTeamDao.applyPlayers.clear();
            dragonTeamDao.updateOp();
            player.failure(61024);
         } else {
            GamePlayer applyPlayer = this.worldMgr.getPlayerById(msg.getApplyId());
            if (applyPlayer != null) {
               if (msg.getIsAgree() && this.playerTeamMap.containsKey(applyPlayer.getPlayerId())) {
                  player.failure(61033);
               } else {
                  DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)applyPlayer.getPlayerExtend(65);
                  if (dragonDiscipleExtend.breachLv < dragonTeamDao.dragonStage) {
                     player.failure(61039);
                  } else {
                     int battleNum = this.configManager.getIntDefault("drangonBattleTime", 5);
                     if (dragonDiscipleExtend.battleNum >= battleNum) {
                        player.failure(61051);
                     } else if (this.handleApply(msg.getIsAgree(), player, applyPlayer, dragonTeamDao)) {
                        this.sendTeamInfo(dragonTeamDao);
                        DragonDiscipleMsg.S2C_CaptainApplyOp_13414.Builder resp = DragonDiscipleMsg.S2C_CaptainApplyOp_13414.newBuilder();
                        resp.setIsAgree(msg.getIsAgree());
                        resp.setApplyId(applyPlayer.getPlayerId());
                        player.sendMsg(resp.build());
                     }
                  }
               }
            }
         }
      }
   }

   @TaskMethod
   public void C2S_CaptainInvite_13415(GamePlayer player, DragonDiscipleMsg.C2S_CaptainInvite_13415 msg) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61022);
      } else {
         DragonTeamDao dragonTeamDao = this.getTeamById((Integer)this.playerTeamMap.get(player.getPlayerId()));
         if (dragonTeamDao == null) {
            player.failure(61022);
         } else if (dragonTeamDao.captain != player.getPlayerId()) {
            player.failure(61023);
         } else {
            GamePlayer invitePlayer = this.worldMgr.getPlayerById(msg.getInviteId());
            if (invitePlayer == null) {
               player.failure(17);
            } else if (!invitePlayer.isSystemOpen(3070)) {
               player.failure(61038);
            } else {
               DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)invitePlayer.getPlayerExtend(65);
               if (dragonDiscipleExtend.breachLv < dragonTeamDao.dragonStage) {
                  player.failure(61039);
               } else {
                  int battleNum = this.configManager.getIntDefault("drangonBattleTime", 5);
                  if (dragonDiscipleExtend.battleNum >= battleNum) {
                     player.failure(61051);
                  } else if (this.playerTeamMap.containsKey(invitePlayer.getPlayerId())) {
                     player.failure(61033);
                  } else if (this.invite(player, invitePlayer, dragonTeamDao)) {
                     DragonDiscipleMsg.S2C_CaptainInvite_13416.Builder resp = DragonDiscipleMsg.S2C_CaptainInvite_13416.newBuilder();
                     resp.setInviteId(msg.getInviteId());
                     player.sendMsg(resp.build());
                  }
               }
            }
         }
      }
   }

   @TaskMethod
   public void C2S_TeamApply_13417(GamePlayer player, DragonDiscipleMsg.C2S_TeamApply_13417 msg) {
      PlayerDao playerDao = player.getPlayerDao();
      if (this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61020);
      } else {
         DragonTeamDao dragonTeamDao = this.getTeamById(msg.getTeamId());
         if (dragonTeamDao == null) {
            player.failure(61025);
         } else {
            DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)player.getPlayerExtend(65);
            int battleNum = this.configManager.getIntDefault("drangonBattleTime", 5);
            if (dragonDiscipleExtend.battleNum >= battleNum) {
               player.failure(61051);
            } else if (dragonTeamDao.players.size() >= 3) {
               player.failure(61024);
            } else if (dragonDiscipleExtend.breachLv < dragonTeamDao.minLevel) {
               player.failure(61034);
            } else if (playerDao.combat_power < dragonTeamDao.minPower) {
               player.failure(61035);
            } else {
               boolean flag = false;
               if (msg.hasChatJoin() && msg.getChatJoin()) {
                  flag = true;
               }

               this.apply(player, dragonTeamDao, flag);
               DragonDiscipleMsg.S2C_TeamApply_13418.Builder resp = DragonDiscipleMsg.S2C_TeamApply_13418.newBuilder();
               resp.setTeamId(msg.getTeamId());
               resp.setResult(1);
               player.sendMsg(resp.build());
            }
         }
      }
   }

   @TaskMethod
   public void C2S_AgreeInvite_13419(GamePlayer player, DragonDiscipleMsg.C2S_AgreeInvite_13419 msg) {
      DragonTeamDao dragonTeamDao = this.getTeamById(msg.getTeamId());
      if (dragonTeamDao == null) {
         player.failure(61025);
      } else {
         if (!msg.getIsAgree()) {
            dragonTeamDao.applyPlayers.remove(player.getPlayerId());
            dragonTeamDao.invitePlayers.remove(player.getPlayerId());
            if (this.playerInviteTeamMap.containsKey(player.getPlayerId()) && (this.playerInviteTeamMap.get(player.getPlayerId())).contains(dragonTeamDao.teamId)) {
               (this.playerInviteTeamMap.get(player.getPlayerId())).remove(dragonTeamDao.teamId);
            }

            if (this.playerApplyTeamMap.containsKey(player.getPlayerId()) && (this.playerApplyTeamMap.get(player.getPlayerId())).contains(dragonTeamDao.teamId)) {
               (this.playerApplyTeamMap.get(player.getPlayerId())).remove(dragonTeamDao.teamId);
            }

            dragonTeamDao.updateOp();
         } else {
            if (this.playerTeamMap.containsKey(player.getPlayerId())) {
               player.failure(61026);
               return;
            }

            if (dragonTeamDao.players.size() >= 3) {
               player.failure(61024);
               return;
            }

            DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)player.getPlayerExtend(65);
            int battleNum = this.configManager.getIntDefault("drangonBattleTime", 5);
            if (dragonDiscipleExtend.battleNum >= battleNum) {
               player.failure(61051);
               return;
            }

            if (dragonTeamDao.battleMsg != null && dragonTeamDao.battleMsg.length > 0) {
               player.failure(61053);
               return;
            }

            if (!this.joinTeam(player, dragonTeamDao)) {
               return;
            }
         }

         DragonDiscipleMsg.S2C_AgreeInvite_13420.Builder resp = DragonDiscipleMsg.S2C_AgreeInvite_13420.newBuilder();
         resp.setTeamId(msg.getTeamId());
         resp.setIsAgree(msg.getIsAgree());
         player.sendMsg(resp.build());
      }
   }

   @TaskMethod
   public void C2S_TeamExit_13421(GamePlayer player, DragonDiscipleMsg.C2S_TeamExit_13421 msg) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61022);
      } else {
         int teamId = (Integer)this.playerTeamMap.get(player.getPlayerId());
         DragonTeamDao dragonTeamDao = this.getTeamById(teamId);
         if (dragonTeamDao == null) {
            player.failure(61025);
         } else if (this.exitTeam(player, dragonTeamDao)) {
            this.sendTeamInfo(dragonTeamDao);
            DragonDiscipleMsg.S2C_TeamExit_13422.Builder resp = DragonDiscipleMsg.S2C_TeamExit_13422.newBuilder();
            resp.setTeamId(teamId);
            player.sendMsg(resp.build());
         }
      }
   }

   @TaskMethod
   public void C2S_TeamKickOut_13423(GamePlayer player, DragonDiscipleMsg.C2S_TeamKickOut_13423 msg) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61022);
      } else {
         DragonTeamDao dragonTeamDao = this.getTeamById((Integer)this.playerTeamMap.get(player.getPlayerId()));
         if (dragonTeamDao == null) {
            player.failure(61022);
         } else if (dragonTeamDao.captain != player.getPlayerId()) {
            player.failure(61023);
         } else {
            GamePlayer beKickOutPlayer = this.worldMgr.getPlayerById(msg.getKickId());
            if (beKickOutPlayer == null) {
               player.failure(61027);
            } else if (!dragonTeamDao.players.containsKey(beKickOutPlayer.getPlayerId())) {
               player.failure(61027);
            } else if (this.kickOut(player, beKickOutPlayer, dragonTeamDao)) {
               this.sendTeamInfo(dragonTeamDao);
               beKickOutPlayer.failure(61040);
               DragonDiscipleMsg.S2C_TeamKickOut_13424.Builder resp = DragonDiscipleMsg.S2C_TeamKickOut_13424.newBuilder();
               resp.setKickId(msg.getKickId());
               player.sendMsg(resp.build());
               this.sendMyTeamInfo(beKickOutPlayer);
            }
         }
      }
   }

   @TaskMethod
   public void C2S_PickHero_13425(GamePlayer player, DragonDiscipleMsg.C2S_PickHero_13425 msg, HeroMirror heroMirror) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61022);
      } else {
         DragonTeamDao dragonTeamDao = this.getTeamById((Integer)this.playerTeamMap.get(player.getPlayerId()));
         if (dragonTeamDao == null) {
            player.failure(61022);
         } else if (dragonTeamDao.arraying.containsKey(msg.getHeroPos()) && ((DragonTeamData)dragonTeamDao.arraying.get(msg.getHeroPos())).playerId != player.getPlayerId()) {
            player.failure(61028);
         } else {
            int pickPos = 0;

            for(Map.Entry<Integer, DragonTeamData> entry : dragonTeamDao.arraying.entrySet()) {
               if ((Integer)entry.getKey() != msg.getHeroPos() && ((DragonTeamData)entry.getValue()).playerId == player.getPlayerId() && ((DragonTeamData)entry.getValue()).heroCode == heroMirror.code) {
                  pickPos = (Integer)entry.getKey();
                  break;
               }
            }

            if (dragonTeamDao.arraying.containsKey(msg.getHeroPos()) && ((DragonTeamData)dragonTeamDao.arraying.get(msg.getHeroPos())).playerId == player.getPlayerId()) {
               if (pickPos > 0) {
                  HeroMirror oldMirror = HeroMirror.toHeroMirror(((DragonTeamData)dragonTeamDao.arraying.get(msg.getHeroPos())).hero);
                  DragonTeamData data = new DragonTeamData();
                  data.heroCode = oldMirror.code;
                  data.heroId = oldMirror.id;
                  data.playerId = player.getPlayerId();
                  data.hero = oldMirror.toByteArray();
                  dragonTeamDao.arraying.put(pickPos, data);
               }

               DragonTeamData data = new DragonTeamData();
               data.heroCode = heroMirror.code;
               data.heroId = heroMirror.id;
               data.playerId = player.getPlayerId();
               data.hero = heroMirror.toByteArray();
               dragonTeamDao.arraying.put(msg.getHeroPos(), data);
            } else if (!dragonTeamDao.arraying.containsKey(msg.getHeroPos())) {
               if (pickPos > 0) {
                  dragonTeamDao.arraying.remove(pickPos);
               }

               DragonTeamData data = new DragonTeamData();
               data.heroCode = heroMirror.code;
               data.heroId = heroMirror.id;
               data.playerId = player.getPlayerId();
               data.hero = heroMirror.toByteArray();
               dragonTeamDao.arraying.put(msg.getHeroPos(), data);
            }

            dragonTeamDao.createTime = DateUtil.getIntTime(System.currentTimeMillis());
            dragonTeamDao.updateOp();
            this.sendTeamInfo(dragonTeamDao);
            DragonDiscipleMsg.S2C_PickHero_13426.Builder builder = DragonDiscipleMsg.S2C_PickHero_13426.newBuilder();
            builder.setHeroCode(heroMirror.code);
            builder.setHeroPos(msg.getHeroPos());
            player.sendMsg(builder.build());
         }
      }
   }

   @TaskMethod
   public void C2S_DownHero_13427(GamePlayer player, DragonDiscipleMsg.C2S_DownHero_13427 msg) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61022);
      } else {
         DragonTeamDao dragonTeamDao = this.getTeamById((Integer)this.playerTeamMap.get(player.getPlayerId()));
         if (dragonTeamDao == null) {
            player.failure(61022);
         } else if (dragonTeamDao.captain != player.getPlayerId() && dragonTeamDao.arraying.containsKey(msg.getHeroPos()) && ((DragonTeamData)dragonTeamDao.arraying.get(msg.getHeroPos())).playerId != player.getPlayerId()) {
            player.failure(61030);
         } else if (!dragonTeamDao.arraying.containsKey(msg.getHeroPos())) {
            player.failure(61031);
         } else if (dragonTeamDao.captain != player.getPlayerId() && ((DragonPlayerData)dragonTeamDao.players.get(player.getPlayerId())).isReady) {
            player.failure(61036);
         } else {
            dragonTeamDao.arraying.remove(msg.getHeroPos());
            dragonTeamDao.createTime = DateUtil.getIntTime(System.currentTimeMillis());
            dragonTeamDao.updateOp();
            this.sendTeamInfo(dragonTeamDao);
            DragonDiscipleMsg.S2C_DownHero_13428.Builder builder = DragonDiscipleMsg.S2C_DownHero_13428.newBuilder();
            builder.setHeroPos(msg.getHeroPos());
            player.sendMsg(builder.build());
         }
      }
   }

   @TaskMethod
   public void C2S_SaveArraying_13429(GamePlayer player, DragonDiscipleMsg.C2S_SaveArraying_13429 msg) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61022);
      } else {
         DragonTeamDao dragonTeamDao = this.getTeamById((Integer)this.playerTeamMap.get(player.getPlayerId()));
         if (dragonTeamDao == null) {
            player.failure(61022);
         } else if (dragonTeamDao.captain != player.getPlayerId()) {
            player.failure(61023);
         } else {
            for(DragonPlayerData data : dragonTeamDao.players.values()) {
               if (!data.isReady) {
                  player.failure(61037);
                  return;
               }
            }

            List<Integer> realList = new ArrayList();

            for(DragonTeamData data : dragonTeamDao.arraying.values()) {
               realList.add(data.heroId);
            }

            List<Integer> heroList = new ArrayList();
            Set<Integer> posList = new HashSet();

            for(CommonMsg.MapDataII mapData : msg.getArrayingList()) {
               heroList.add(mapData.getValue());
               posList.add(mapData.getKey());
            }

            if (posList.size() == realList.size() && realList.size() == heroList.size() && realList.containsAll(heroList)) {
               Map<Integer, DragonTeamData> realMap = new HashMap();

               for(CommonMsg.MapDataII mapData : msg.getArrayingList()) {
                  for(DragonTeamData data : dragonTeamDao.arraying.values()) {
                     if (data.heroId == mapData.getValue()) {
                        realMap.put(mapData.getKey(), data);
                        break;
                     }
                  }
               }

               dragonTeamDao.arraying.clear();
               dragonTeamDao.arraying.putAll(realMap);
               dragonTeamDao.updateOp();
               this.sendTeamInfo(dragonTeamDao);
               DragonDiscipleMsg.S2C_SaveArraying_13430.Builder builder = DragonDiscipleMsg.S2C_SaveArraying_13430.newBuilder();
               builder.setResult(1);
               player.sendMsg(builder.build());
            }
         }
      }
   }

   @TaskMethod
   public void C2S_PlayerReady_13432(GamePlayer player, DragonDiscipleMsg.C2S_PlayerReady_13432 msg) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61022);
      } else {
         DragonTeamDao dragonTeamDao = this.getTeamById((Integer)this.playerTeamMap.get(player.getPlayerId()));
         if (dragonTeamDao == null) {
            player.failure(61022);
         } else if (!dragonTeamDao.players.containsKey(player.getPlayerId())) {
            player.failure(61022);
         } else {
            int num = 0;

            for(DragonTeamData data : dragonTeamDao.arraying.values()) {
               if (data.playerId == player.getPlayerId()) {
                  ++num;
               }
            }

            if (num != 2) {
               player.failure(61032);
            } else {
               ((DragonPlayerData)dragonTeamDao.players.get(player.getPlayerId())).isReady = true;
               ((DragonPlayerData)dragonTeamDao.players.get(player.getPlayerId())).isMain = true;
               dragonTeamDao.createTime = DateUtil.getIntTime(System.currentTimeMillis());
               dragonTeamDao.updateOp();
               DragonDiscipleMsg.S2C_PlayerReady_13433.Builder builder = DragonDiscipleMsg.S2C_PlayerReady_13433.newBuilder();
               builder.setResult(1);
               player.sendMsg(builder.build());

               for(DragonPlayerData data : dragonTeamDao.players.values()) {
                  GamePlayer gamePlayer = this.worldMgr.getOnlinePlayer(data.playerId);
                  if (gamePlayer != null) {
                     this.notifyPlayerReady(gamePlayer, ((DragonPlayerData)dragonTeamDao.players.get(player.getPlayerId())).isReady, player.getPlayerId());
                  }
               }

            }
         }
      }
   }

   @TaskMethod
   public void S2C_CancelReady_13444(GamePlayer player) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61022);
      } else {
         DragonTeamDao dragonTeamDao = this.getTeamById((Integer)this.playerTeamMap.get(player.getPlayerId()));
         if (dragonTeamDao == null) {
            player.failure(61022);
         } else if (!dragonTeamDao.players.containsKey(player.getPlayerId())) {
            player.failure(61022);
         } else if (dragonTeamDao.captain == player.getPlayerId()) {
            logger.info("队长不需要取消准备状态！！！");
         } else {
            ((DragonPlayerData)dragonTeamDao.players.get(player.getPlayerId())).isReady = false;
            dragonTeamDao.createTime = DateUtil.getIntTime(System.currentTimeMillis());
            dragonTeamDao.updateOp();

            for(DragonPlayerData data : dragonTeamDao.players.values()) {
               GamePlayer gamePlayer = this.worldMgr.getOnlinePlayer(data.playerId);
               if (gamePlayer != null) {
                  this.notifyPlayerReady(gamePlayer, ((DragonPlayerData)dragonTeamDao.players.get(player.getPlayerId())).isReady, player.getPlayerId());
               }
            }

         }
      }
   }

   @TaskMethod
   public void C2S_LeaveTeamUI_13475(GamePlayer player) {
      if (this.playerTeamMap.containsKey(player.getPlayerId())) {
         DragonTeamDao dragonTeamDao = this.getTeamById((Integer)this.playerTeamMap.get(player.getPlayerId()));
         if (dragonTeamDao != null) {
            if (dragonTeamDao.players.containsKey(player.getPlayerId())) {
               if (dragonTeamDao.captain != player.getPlayerId()) {
                  ((DragonPlayerData)dragonTeamDao.players.get(player.getPlayerId())).isMain = false;
                  dragonTeamDao.updateOp();
               }
            }
         }
      }
   }

   @TaskMethod
   public void C2S_TeamInviteClear_13437(GamePlayer player, DragonDiscipleMsg.C2S_TeamInviteClear_13437 msg) {
      if (this.playerInviteTeamMap.containsKey(player.getPlayerId())) {
         for(Integer teamId : this.playerInviteTeamMap.get(player.getPlayerId())) {
            DragonTeamDao dragonTeamDao = this.getTeamById(teamId);
            if (dragonTeamDao != null) {
               dragonTeamDao.invitePlayers.remove(player.getPlayerId());
               dragonTeamDao.updateOp();
            }
         }
      }

      this.playerInviteTeamMap.remove(player.getPlayerId());
      DragonDiscipleMsg.S2C_TeamInviteClear_13438.Builder resp = DragonDiscipleMsg.S2C_TeamInviteClear_13438.newBuilder();
      player.sendMsg(resp.build());
   }

   @TaskMethod
   public void C2S_TeamApplyClear_13439(GamePlayer player, DragonDiscipleMsg.C2S_TeamApplyClear_13439 msg) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61022);
      } else {
         int teamId = (Integer)this.playerTeamMap.get(player.getPlayerId());
         DragonTeamDao dragonTeamDao = this.getTeamById(teamId);
         if (dragonTeamDao == null) {
            player.failure(61022);
         } else if (dragonTeamDao.captain != player.getPlayerId()) {
            player.failure(61023);
         } else {
            dragonTeamDao.applyPlayers.clear();
            dragonTeamDao.updateOp();

            for(Set<Integer> applyTeams : this.playerApplyTeamMap.values()) {
               applyTeams.remove(dragonTeamDao.teamId);
            }

            DragonDiscipleMsg.S2C_TeamApplyClear_13440.Builder resp = DragonDiscipleMsg.S2C_TeamApplyClear_13440.newBuilder();
            player.sendMsg(resp.build());
         }
      }
   }

   @TaskMethod
   public void C2S_BeginBattle_13441(GamePlayer player) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61022);
      } else {
         int teamId = (Integer)this.playerTeamMap.get(player.getPlayerId());
         DragonTeamDao dragonTeamDao = this.getTeamById(teamId);
         if (dragonTeamDao == null) {
            player.failure(61022);
         } else {
            int battleNum = this.configManager.getIntDefault("drangonBattleTime", 5);

            for(DragonPlayerData data : dragonTeamDao.players.values()) {
               if (!data.isReady) {
                  return;
               }

               GamePlayer gamePlayer = this.worldMgr.getPlayerById(data.playerId);
               DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)gamePlayer.getPlayerExtend(65);
               if (dragonDiscipleExtend.battleNum >= battleNum) {
                  player.failure(61048);
                  return;
               }
            }

            if (dragonTeamDao.arraying.size() != dragonTeamDao.players.size() * 2) {
               player.failure(61032);
            } else if (dragonTeamDao.battleMsg == null || dragonTeamDao.battleMsg.length <= 0) {
               boolean flag = false;
               boolean isDownHero = false;
               Iterator<DragonTeamData> it = dragonTeamDao.arraying.values().iterator();

               while(it.hasNext()) {
                  DragonTeamData data = (DragonTeamData)it.next();
                  GamePlayer gamePlayer = this.worldMgr.getPlayerById(data.playerId);
                  if (gamePlayer != null) {
                     HeroBagPart heroBagPart = (HeroBagPart)gamePlayer.getMgrPart(HeroBagPart.class);
                     HeroDao heroDao = heroBagPart.getHeroByCode(data.heroCode);
                     if (heroDao == null) {
                        isDownHero = true;
                        it.remove();
                     } else {
                        heroBagPart.heroBagFlushProperties(heroDao);
                        HeroMirror heroMirror = HeroMirror.fromHeroBean(heroDao);
                        data.hero = heroMirror.toByteArray();
                        flag = true;
                     }
                  }
               }

               if (isDownHero) {
                  for(DragonPlayerData playerData : dragonTeamDao.players.values()) {
                     if (playerData.playerId != dragonTeamDao.captain) {
                        int num = 0;

                        for(DragonTeamData data : dragonTeamDao.arraying.values()) {
                           if (data.playerId == playerData.playerId) {
                              ++num;
                           }
                        }

                        if (num < 2 && (playerData.isReady = true)) {
                           playerData.isReady = false;

                           for(DragonPlayerData data : dragonTeamDao.players.values()) {
                              GamePlayer gamePlayer = this.worldMgr.getOnlinePlayer(data.playerId);
                              if (gamePlayer != null) {
                                 this.notifyPlayerReady(gamePlayer, false, playerData.playerId);
                              }
                           }
                        }
                     }
                  }

                  dragonTeamDao.updateOp();
                  this.sendTeamInfo(dragonTeamDao);
                  this.sendMyTeamInfo(player);
               } else if (flag) {
                  dragonTeamDao.updateOp();
               }

               if (dragonTeamDao.arraying.size() != dragonTeamDao.players.size() * 2) {
                  player.failure(61032);
               } else {
                  PlayerDao playerDao = player.getPlayerDao();
                  ArrayingMirror arrayingMirror = new ArrayingMirror();

                  for(Map.Entry<Integer, DragonTeamData> entry : dragonTeamDao.arraying.entrySet()) {
                     HeroMirror heroMirror = HeroMirror.toHeroMirror(((DragonTeamData)entry.getValue()).hero);
                     if ((Integer)entry.getKey() == 5) {
                        FriendArrayingEntity friendArrayingEntity = new FriendArrayingEntity((Integer)entry.getKey(), heroMirror);
                        arrayingMirror.arrayingElementsMap.put(((Integer)entry.getKey()).byteValue(), friendArrayingEntity);
                     } else {
                        HeroArrayingEntity heroArrayingEntity = new HeroArrayingEntity((Integer)entry.getKey(), heroMirror);
                        arrayingMirror.arrayingElementsMap.put(((Integer)entry.getKey()).byteValue(), heroArrayingEntity);
                     }
                  }

                  BattlePKTeam leftTeam = new BattlePKTeam(player.getPlayerId(), playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, false));
                  BattleScene battleScene = new BattleScene(3070, 1);
                  battleScene.addPKTeam((byte)0, leftTeam);
                  String addPro = "";
                  if (dragonTeamDao.players.size() == 1) {
                     addPro = this.configManager.getStr("drangonTeamSingle");
                  } else if (dragonTeamDao.players.size() == 2) {
                     addPro = this.configManager.getStr("drangonTeamDouble");
                  } else {
                     addPro = this.configManager.getStr("drangonTeamTrible");
                  }

                  String[] pro = addPro.split(",");

                  for(Entity entity : battleScene.getPKTeam((byte)0).getEntityMap().values()) {
                     for(int i = 0; i < pro.length; ++i) {
                        String[] add = pro[i].split("\\|");
                        this.addProperty(entity, Integer.parseInt(add[0]), Integer.parseInt(add[1]), Long.parseLong(add[2]));
                        entity.setBaseProperty(99, entity.getBaseProperty(1));
                     }
                  }

                  DragonStrengthenBattleModel model = (DragonStrengthenBattleModel)player.getGameModelPool().getEntity("dragonStrengthenBattle", dragonTeamDao.dragonStage);
                  if (model == null) {
                     logger.error("龙脉挑战id错误：" + dragonTeamDao.dragonStage);
                  } else {
                     BattlePKTeam rightTeam = new BattlePKTeam(model.getBattleId());
                     battleScene.addPKTeam((byte)1, rightTeam);
                     BattleMsg.S2C_BattleResult_6102.Builder fight = battleScene.fight((byte)15);
                     BattleMsg.S2C_Battle_Result.Builder battleResult = fight.getResult().toBuilder();
                     battleResult.setPlayerExp(dragonTeamDao.dragonStage);
                     fight.setResult(battleResult).build();

                     for(Map.Entry<Integer, DragonPlayerData> entry : dragonTeamDao.players.entrySet()) {
                        if (((DragonPlayerData)entry.getValue()).playerId == player.getPlayerId()) {
                           ((DragonPlayerData)entry.getValue()).displaceCaptain = true;
                        }

                        GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)entry.getKey());
                        if (gamePlayer != null) {
                           gamePlayer.getOperationMgr().addExtraLog(gamePlayer, 207, gamePlayer.getPublicDao().vip_lv + "", "天命挑战", "1");
                           if (dragonTeamDao.captain != gamePlayer.getPlayerId()) {
                              if (!((DragonPlayerData)entry.getValue()).isMain) {
                                 fight.setIsSkip(true);
                              } else {
                                 fight.setIsSkip(false);
                              }
                           } else {
                              fight.setIsSkip(false);
                              BattleMsg.S2C_Battle_Result.Builder result = fight.build().getResult().toBuilder();
                              result.addSettleInfo((long)dragonTeamDao.captain);
                              fight.setResult(result);
                           }

                           ((DragonPlayerData)entry.getValue()).battleEndTime = DateUtil.getIntTime(System.currentTimeMillis()) + fight.getCostTime();
                           DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)gamePlayer.getPlayerExtend(65);
                           if (dragonDiscipleExtend.breachLv == dragonTeamDao.dragonStage && !dragonDiscipleExtend.passed) {
                              fight.addExParams(gamePlayer.getPlayerId()).build();
                           } else if (battleScene.getWinForce() == 0) {
                              ++dragonDiscipleExtend.battleNum;
                              gamePlayer.updatePlayerExtend(65);
                           }

                           if (battleScene.getWinForce() == 0) {
                              ((DragonPlayerData)entry.getValue()).isWin = true;
                           }

                           DragonDiscipleMsg.S2C_BeginBattleNotify_13436.Builder builder = DragonDiscipleMsg.S2C_BeginBattleNotify_13436.newBuilder();
                           builder.setResult(fight);
                           builder.setBattleNum(dragonDiscipleExtend.battleNum);
                           gamePlayer.sendMsg(builder.build());
                        }
                     }

                     fight.setIsSkip(false);
                     dragonTeamDao.battleMsg = fight.build().toByteArray();
                     dragonTeamDao.createTime = DateUtil.getIntTime(System.currentTimeMillis());
                     dragonTeamDao.updateOp();
                  }
               }
            }
         }
      }
   }

   public void addProperty(Entity entity, int type, int way, long value) {
      if (way == 0) {
         entity.modifyBaseProperty(type, value);
      } else if (way == 1) {
         long oldValue = entity.getBaseProperty(type);
         long addValue = Double.valueOf((double)(oldValue * value) / (double)10000.0F).longValue();
         entity.modifyBaseProperty(type, addValue);
      }

   }

   @TaskMethod
   public void C2S_MyTeamInfo_13442(GamePlayer player, boolean loginSend) {
      DragonTeamDao dragonTeamDao = null;
      if (this.playerTeamMap.containsKey(player.getPlayerId())) {
         int teamId = (Integer)this.playerTeamMap.get(player.getPlayerId());
         dragonTeamDao = this.getTeamById(teamId);
         if (!loginSend) {
            ((DragonPlayerData)dragonTeamDao.players.get(player.getPlayerId())).isMain = true;
         } else {
            ((DragonPlayerData)dragonTeamDao.players.get(player.getPlayerId())).isMain = false;
         }

         HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
         boolean flag = false;
         boolean isDownHero = false;
         Iterator<DragonTeamData> it = dragonTeamDao.arraying.values().iterator();

         while(it.hasNext()) {
            DragonTeamData data = (DragonTeamData)it.next();
            if (data.playerId == player.getPlayerId()) {
               HeroDao heroDao = heroBagPart.getHeroByCode(data.heroCode);
               if (heroDao == null) {
                  isDownHero = true;
                  it.remove();
               } else {
                  heroBagPart.heroBagFlushProperties(heroDao);
                  HeroMirror heroMirror = HeroMirror.fromHeroBean(heroDao);
                  data.hero = heroMirror.toByteArray();
                  flag = true;
               }
            }
         }

         if (isDownHero) {
            if (player.getPlayerId() != dragonTeamDao.captain) {
               ((DragonPlayerData)dragonTeamDao.players.get(player.getPlayerId())).isReady = false;

               for(DragonPlayerData data : dragonTeamDao.players.values()) {
                  GamePlayer gamePlayer = this.worldMgr.getOnlinePlayer(data.playerId);
                  if (gamePlayer != null) {
                     this.notifyPlayerReady(gamePlayer, ((DragonPlayerData)dragonTeamDao.players.get(player.getPlayerId())).isReady, player.getPlayerId());
                  }
               }
            }

            dragonTeamDao.updateOp();
            this.sendTeamInfo(dragonTeamDao);
         } else if (flag) {
            dragonTeamDao.updateOp();
            this.sendTeamInfo(dragonTeamDao);
         }
      }

      this.sendMyTeamInfo(player);
   }

   public void sendMyTeamInfo(GamePlayer player) {
      DragonTeamDao dragonTeamDao = null;
      if (this.playerTeamMap.containsKey(player.getPlayerId())) {
         int teamId = (Integer)this.playerTeamMap.get(player.getPlayerId());
         dragonTeamDao = this.getTeamById(teamId);
      }

      DragonDiscipleMsg.S2C_MyTeamInfo_13443.Builder builder = DragonDiscipleMsg.S2C_MyTeamInfo_13443.newBuilder();
      DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)player.getPlayerExtend(65);
      builder.setBattleNum(dragonDiscipleExtend.battleNum);
      builder.setDragonStage(dragonDiscipleExtend.breachLv);
      builder.setIsPass(dragonDiscipleExtend.passed);
      if (dragonTeamDao != null) {
         builder.setMyTeam(this.buildTeamMsg(dragonTeamDao, player));
      }

      builder.setCrossDragon(false);
      player.sendMsg(builder.build());
   }

   @TaskMethod
   public void C2S_TeamHall_13401(GamePlayer player, DragonDiscipleMsg.C2S_TeamHall_13401 msg) {
      DragonDiscipleMsg.S2C_TeamHall_13402.Builder resp = DragonDiscipleMsg.S2C_TeamHall_13402.newBuilder();
      int dragonStage = 0;
      if (msg.hasDragonStage()) {
         dragonStage = msg.getDragonStage();
      }

      for(DragonTeamDao dragonTeamDao : this.getTeamsByStage(dragonStage)) {
         if (!dragonTeamDao.players.isEmpty()) {
            resp.addTeamList(this.buildTeamMsg(dragonTeamDao));
         }
      }

      resp.addAllApplyTeams((Iterable)MapUtil.getOrDefault(this.playerApplyTeamMap, player.getPlayerId(), new ConcurrentHashSet()));
      player.sendMsg(resp.build());
   }

   @TaskMethod
   public void C2S_ChangeHeroPos_13447(GamePlayer player, DragonDiscipleMsg.C2S_ChangeHeroPos_13447 msg) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61022);
      } else {
         DragonTeamDao dragonTeamDao = this.getTeamById((Integer)this.playerTeamMap.get(player.getPlayerId()));
         if (dragonTeamDao == null) {
            player.failure(61022);
         } else if (!dragonTeamDao.arraying.containsKey(msg.getStartPos())) {
            logger.info("该位置上没有英雄：" + msg.getStartPos());
         } else {
            DragonTeamData startData = (DragonTeamData)dragonTeamDao.arraying.get(msg.getStartPos());
            HeroMirror oldMirror = HeroMirror.toHeroMirror(startData.hero);
            DragonTeamData oldData = new DragonTeamData();
            oldData.heroCode = oldMirror.code;
            oldData.heroId = oldMirror.id;
            oldData.playerId = startData.playerId;
            oldData.hero = oldMirror.toByteArray();
            if (dragonTeamDao.arraying.containsKey(msg.getTargetPos())) {
               DragonTeamData targetData = (DragonTeamData)dragonTeamDao.arraying.get(msg.getTargetPos());
               HeroMirror targetMirror = HeroMirror.toHeroMirror(targetData.hero);
               DragonTeamData newData = new DragonTeamData();
               newData.heroCode = targetMirror.code;
               newData.heroId = targetMirror.id;
               newData.playerId = targetData.playerId;
               newData.hero = targetMirror.toByteArray();
               dragonTeamDao.arraying.put(msg.getStartPos(), newData);
            } else {
               dragonTeamDao.arraying.remove(msg.getStartPos());
            }

            dragonTeamDao.arraying.put(msg.getTargetPos(), oldData);
            dragonTeamDao.createTime = DateUtil.getIntTime(System.currentTimeMillis());
            dragonTeamDao.updateOp();
            this.sendTeamInfo(dragonTeamDao);
            DragonDiscipleMsg.S2C_ChangeHeroPos_13448.Builder builder = DragonDiscipleMsg.S2C_ChangeHeroPos_13448.newBuilder();
            builder.setResult(1);
            player.sendMsg(builder.build());
         }
      }
   }

   @TaskMethod
   public void C2S_WatchBattleEnd_13450(GamePlayer player) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(61055);
      } else {
         DragonTeamDao dragonTeamDao = this.getTeamById((Integer)this.playerTeamMap.get(player.getPlayerId()));
         if (dragonTeamDao == null) {
            player.failure(61055);
         } else if (dragonTeamDao.players.containsKey(player.getPlayerId())) {
            int time = 0;
            if (dragonTeamDao.battleMsg != null && dragonTeamDao.battleMsg.length > 0) {
               try {
                  BattleMsg.S2C_BattleResult_6102 builder = BattleMsg.S2C_BattleResult_6102.parseFrom(dragonTeamDao.battleMsg);
                  time = builder.getCostTime();
               } catch (InvalidProtocolBufferException e) {
                  e.printStackTrace();
               }
            }

            if (player.getPlayerId() == dragonTeamDao.captain) {
               this.dismissTeam(dragonTeamDao, true, time);
            } else {
               DragonPlayerData data = (DragonPlayerData)dragonTeamDao.players.get(player.getPlayerId());
               if (data.displaceCaptain) {
                  this.dismissTeam(dragonTeamDao, true, time);
               } else {
                  data.recordId = 0;
                  data.battleEndTime = 0;
                  if (data.isWin) {
                     if (data.isSettle) {
                        dragonTeamDao.updateOp();
                        return;
                     }

                     int dragonStage = dragonTeamDao.dragonStage;
                     data.isSettle = true;
                     this.settle(player, dragonStage, time);
                  }

                  dragonTeamDao.updateOp();
               }
            }

         }
      }
   }

   public void settle(GamePlayer gamePlayer, int dragonStage, int time) {
      DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)gamePlayer.getPlayerExtend(65);
      if (dragonDiscipleExtend.breachLv == dragonStage && !dragonDiscipleExtend.passed) {
         dragonDiscipleExtend.passed = true;
         gamePlayer.updatePlayerExtend(65);
         DragonStrengthenBattleModel model = (DragonStrengthenBattleModel)gamePlayer.getGameModelPool().getEntity("dragonStrengthenBattle", dragonStage);
         if (model != null) {
            gamePlayer.addResource(model.getReward(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 65, 6503, 0, 0, "");
            gamePlayer.pushPartTaskEx(DragonStrengthenPart.class, "addRecord", new Object[]{model.getReward(), dragonStage, time});
         }

         gamePlayer.triggerTask(542, 0, (long)dragonDiscipleExtend.breachLv, 0);
      } else {
         String awards = this.configManager.getStr("drangonBattleReward");
         String[] award = awards.split("\\|");
         gamePlayer.addResource(Integer.parseInt(award[0]), Integer.parseInt(award[1]), Integer.parseInt(award[2]), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 65, 6503, 0, 0, "");
      }

   }

   public void dismissTeam(DragonTeamDao dragonTeamDao, boolean isCaptain, int time) {
      boolean isWin = false;
      byte[] scream = dragonTeamDao.battleMsg;
      List<GamePlayer> playerList = new ArrayList();

      for(DragonPlayerData data : dragonTeamDao.players.values()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(data.playerId);
         if (gamePlayer != null) {
            playerList.add(gamePlayer);
            if (data.isWin) {
               isWin = true;
               if (data.isSettle) {
                  if (isCaptain) {
                     gamePlayer.failure(61055);
                  }
               } else {
                  int dragonStage = dragonTeamDao.dragonStage;
                  data.isSettle = true;
                  this.settle(gamePlayer, dragonStage, time);
               }
            }
         }
      }

      if (!isWin) {
         if (scream != null && scream.length > 0) {
            for(GamePlayer gamePlayer : playerList) {
               this.saveRecord(scream, gamePlayer);
            }
         }

         for(DragonPlayerData data : dragonTeamDao.players.values()) {
            data.displaceCaptain = false;
         }

         dragonTeamDao.battleMsg = null;
         dragonTeamDao.updateOp();
      } else {
         Iterator<Map.Entry<Integer, Set<Integer>>> iterator = this.playerInviteTeamMap.entrySet().iterator();

         while(iterator.hasNext()) {
            Map.Entry<Integer, Set<Integer>> entry = (Map.Entry)iterator.next();
            if ((entry.getValue()).contains(dragonTeamDao.teamId)) {
               (entry.getValue()).remove(dragonTeamDao.teamId);
            }

            if ((entry.getValue()).isEmpty()) {
               iterator.remove();
            }
         }

         if (isCaptain) {
            GamePlayer captain = this.worldMgr.getPlayerById(dragonTeamDao.captain);
            captain.failure(61055);
         }

         this.gameCachePool.deleteDao(dragonTeamDao, true);

         for(GamePlayer gamePlayer : playerList) {
            if (this.playerTeamMap.containsKey(gamePlayer.getPlayerId())) {
               this.playerTeamMap.remove(gamePlayer.getPlayerId());
            }

            this.sendMyTeamInfo(gamePlayer);
         }

         if (scream != null && scream.length > 0) {
            for(GamePlayer gamePlayer : playerList) {
               this.saveRecord(scream, gamePlayer);
            }
         }

      }
   }

   public void saveRecord(byte[] scream, GamePlayer gamePlayer) {
      try {
         PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
         BattleMsg.S2C_BattleResult_6102.Builder fight = BattleMsg.S2C_BattleResult_6102.parseFrom(scream).toBuilder();
         BattleMsg.S2C_Battle_PKTeam.Builder teamBuilder = fight.getTeams(0).toBuilder();
         teamBuilder.setBeloogId(gamePlayer.getPlayerId());
         teamBuilder.setBeloogName(playerPublicDao.playerName);
         PlayerMsg.PropertyCell.Builder lv_builder = PlayerMsg.PropertyCell.newBuilder();
         lv_builder.setProperty(PlayerDefine.PLAYER_LV);
         lv_builder.setValue(String.valueOf(playerPublicDao.lv));
         teamBuilder.addPlayerInfos(lv_builder);
         PlayerMsg.PropertyCell.Builder head_builder = PlayerMsg.PropertyCell.newBuilder();
         head_builder.setProperty(PlayerDefine.PLAYER_HEAD);
         head_builder.setValue(String.valueOf(playerPublicDao.head));
         teamBuilder.addPlayerInfos(head_builder);
         PlayerMsg.PropertyCell.Builder headFrame_builder = PlayerMsg.PropertyCell.newBuilder();
         headFrame_builder.setProperty(PlayerDefine.PLAYER_HEADFRAME);
         headFrame_builder.setValue(String.valueOf(playerPublicDao.headFrame));
         teamBuilder.addPlayerInfos(headFrame_builder);
         fight.setTeams(0, (BattleMsg.S2C_Battle_PKTeam.Builder)teamBuilder);
         this.battleRecordMgr.pushTaskEx("saveDragonRecord", new Object[]{fight, gamePlayer});
      } catch (InvalidProtocolBufferException e) {
         e.printStackTrace();
      }

   }

   public void timeOut(DragonTeamDao dragonTeamDao) {
      int time = DateUtil.getIntTime(System.currentTimeMillis());
      if (time >= dragonTeamDao.createTime + 'ꣀ') {
         if (dragonTeamDao.battleMsg != null && dragonTeamDao.battleMsg.length > 0) {
            int costTime = 0;

            try {
               BattleMsg.S2C_BattleResult_6102 builder = BattleMsg.S2C_BattleResult_6102.parseFrom(dragonTeamDao.battleMsg);
               costTime = builder.getCostTime();
            } catch (InvalidProtocolBufferException e) {
               e.printStackTrace();
            }

            this.dismissTeam(dragonTeamDao, false, costTime);
         } else {
            List<GamePlayer> playerList = new ArrayList();

            for(DragonPlayerData data : dragonTeamDao.players.values()) {
               GamePlayer gamePlayer = this.worldMgr.getPlayerById(data.playerId);
               if (gamePlayer != null) {
                  playerList.add(gamePlayer);
               }
            }

            Iterator<Map.Entry<Integer, Set<Integer>>> iterator = this.playerInviteTeamMap.entrySet().iterator();

            while(iterator.hasNext()) {
               Map.Entry<Integer, Set<Integer>> entry = (Map.Entry)iterator.next();
               if ((entry.getValue()).contains(dragonTeamDao.teamId)) {
                  (entry.getValue()).remove(dragonTeamDao.teamId);
               }

               if ((entry.getValue()).isEmpty()) {
                  iterator.remove();
               }
            }

            this.gameCachePool.deleteDao(dragonTeamDao, true);

            for(GamePlayer gamePlayer : playerList) {
               if (this.playerTeamMap.containsKey(gamePlayer.getPlayerId())) {
                  this.playerTeamMap.remove(gamePlayer.getPlayerId());
               }

               this.sendMyTeamInfo(gamePlayer);
               gamePlayer.failure(61054);
            }
         }
      }

   }

   @TaskMethod
   public void checkTeamTime() {
      if (!this.getDragonTeamMap().isEmpty()) {
         for(DragonTeamDao dragonTeamDao : this.getDragonTeamMap().values()) {
            this.timeOut(dragonTeamDao);
         }
      }

      this.checkOpenCross();
   }

   public void checkOpenCross() {
      WorldDao<WorldData> worldDao = this.worldMgr.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
      if (worldDao != null) {
         WorldData worldData = (WorldData)worldDao.jsonData;
         if (!worldData.openCrossDragon && this.checkServerDay()) {
            CrossDragonTeamMsg.S2S_AskOpenCross_19120.Builder builder = CrossDragonTeamMsg.S2S_AskOpenCross_19120.newBuilder();
            this.crossNettyClient.sendCrossNoDest(builder.build(), this.worldMgr.GAME_SERVER_ID);
         }

      }
   }

   public boolean checkServerDay() {
      int day = this.configManager.getIntDefault("dragonTeamOpenCrossDay", 30);
      long dayStartTime = DateUtil.getSomeDayBeginTime(this.worldMgr.getOpenServerTime());
      int realDay = DateUtil.difftimeDay(new Timestamp(dayStartTime)) + 1;
      return realDay >= day;
   }

   @MsgHandlerAnno
   public void S2S_NotifyOpenCross_19107(CrossDragonTeamMsg.S2S_NotifyOpenCross_19107 msg, CrossSubscribeMsg crossSubscribeMsg) {
      WorldDao<WorldData> worldDao = this.worldMgr.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
      if (worldDao != null) {
         CrossDragonTeamMsg.S2S_ResponseOpenCross_19108.Builder builder = CrossDragonTeamMsg.S2S_ResponseOpenCross_19108.newBuilder();
         WorldData worldData = (WorldData)worldDao.jsonData;
         if (worldData.openCrossDragon != msg.getOpenCross()) {
            worldData.openCrossDragon = msg.getOpenCross();
            worldDao.updateOp();
         }

         this.openCross = msg.getOpenCross();
         this.crossNettyClient.sendCrossNoDest(builder.build(), this.worldMgr.GAME_SERVER_ID);
         logger.info("收到跨服发过来的跨服天命状态：{}", msg.getOpenCross());
         if (msg.getOpenCross()) {
            for(DragonTeamDao dragonTeamDao : this.getDragonTeamMap().values()) {
               dragonTeamDao.createTime = 0;
               dragonTeamDao.updateOp();
               this.timeOut(dragonTeamDao);
            }
         }

      }
   }
}
