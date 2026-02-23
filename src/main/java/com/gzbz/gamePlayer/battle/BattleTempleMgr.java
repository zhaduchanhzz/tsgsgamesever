package com.gzbz.gamePlayer.battle;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.BattleTempleDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.TempleData;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.monarch.MonarchPart;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.model.BattleModel;
import com.gzbz.model.BattleTempleModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.ItemModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.PrestigeModel;
import com.gzbz.protobuf.BattleDailyMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.robot.RobotData;
import com.gzbz.robot.bean.MonsterMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import misc.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@MgrAnno
public class BattleTempleMgr extends GameMgr {
   Logger logger = LoggerFactory.getLogger(BattleTempleMgr.class);
   public static final String LANGUAGE_TEMPLEOFWAR = "TempleOfWar";
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private MonsterMgr monsterMgr;
   @Autowired
   private HeroRankMgr heroRankMgr;
   @Autowired
   protected GameModelPool gameModelPool;

   protected void init() {
   }

   @TaskMethod
   public void enterTemple(PlayerDao playerDao, final BattleTempleModel battleTempleModel, final int addLevel) {
      BattleTempleDao templeDao = (BattleTempleDao)this.getGameCachePool().getData("tb_battle_temple", new Object[]{battleTempleModel.getId()});
      GamePlayer player = this.worldMgr.getPlayerById(playerDao.playerId);
      int time = DateUtil.getIntTime(System.currentTimeMillis());
      if (time < templeDao.stats) {
         player.failure(5028);
      } else if (templeDao.playerCode == playerDao.playerId) {
         player.failure(5027);
      } else {
         ArrayingMirror arrayingMirror = player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         BattlePKTeam battlePKTeam1 = new BattlePKTeam(playerDao.playerId, playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, player.isRobot()));
         long minPower = player.getPlayerCombatPower() / 10L * 7L;
         long maxPower = player.getPlayerCombatPower() / 100L * 75L;
         RobotData robot = this.monsterMgr.getRobotData(minPower, maxPower, this.worldMgr.getWorldLv());
         BattleModel battleModel = (BattleModel)player.getGameModelPool().getEntity("battle", battleTempleModel.getMonster());
         if (battleModel != null) {
            robot.name = battleModel.getName();
         }

         BattlePKTeam battlePKTeam3 = null;
         if (battleTempleModel.getCopyType() == 1) {
            battlePKTeam3 = new BattlePKTeam(battleTempleModel.getMonster());
         } else {
            battlePKTeam3 = new BattlePKTeam(robot.player, robot.name, ArrayingMirror.toArrayingMirror((byte[])robot.arrayingMirrorList.get(0)), robot.lv, robot.head, robot.headFrame, this.heroRankMgr.getHeroRankCompensate(ArrayingMirror.toArrayingMirror((byte[])robot.arrayingMirrorList.get(0)), true));
         }

         for(Entity enemy : battlePKTeam3.getEntityMap().values()) {
            enemy.setBaseProperty(1, (long)((double)enemy.getBaseProperty(1) * (double)1.5F));
            enemy.setBaseProperty(99, enemy.getBaseProperty(1));
         }

         BattleScene battleScene = new BattleScene(1270, battleTempleModel.getId());
         battleScene.addPKTeam((byte)0, battlePKTeam1);
         battleScene.addPKTeam((byte)1, battlePKTeam3);
         BattleMsg.S2C_BattleResult_6102.Builder fight = battleScene.fight(battleTempleModel.getBoutCount());
         if (fight.getResult().getResult() == 0) {
            this.logger.info("战神殿获得称号：" + battleTempleModel.getTitleId());
            ItemModel itemModel = (ItemModel)player.getGameModelPool().getEntity("item", battleTempleModel.getTitleId());
            CommonMsg.ItemInfo.Builder item = CommonMsg.ItemInfo.newBuilder();
            item.setType(itemModel.getSubclass());
            item.setNum(1);
            item.setId(battleTempleModel.getTitleId());
            BattleMsg.S2C_Battle_Result.Builder result = fight.getResult().toBuilder();
            result.addAwardItems(item);
            fight.setResult(result).build();
            player.triggerTask(345, 0, 1L, 1);
         }

         player.sendMsg(fight.build());
         BattleDailyMsg.S2C_EnterTemple_6640.Builder down = BattleDailyMsg.S2C_EnterTemple_6640.newBuilder();
         if (fight.getStartTime() + fight.getCostTime() > time + 600) {
            this.logger.error("战斗时间过长！！！！" + fight.getStartTime() + "----" + fight.getCostTime());
            templeDao.stats = time + 600;
         } else {
            templeDao.stats = fight.getStartTime() + fight.getCostTime();
         }

         down.setOldTempleId(0);
         if (fight.getResult().getResult() == 0) {
            if (templeDao.playerCode > 0) {
               GamePlayer oldPlayer = this.worldMgr.getPlayerById(templeDao.playerCode);
               oldPlayer.pushPartTaskEx(MonarchPart.class, "delMonarchTitle", new Object[]{battleTempleModel.getTitleId(), 4});
            }

            int templeId = this.checkTemple(player, battleTempleModel.getId());
            if (templeId != 0) {
               this.logger.info("丢弃已经占有的神像");
               BattleTempleDao oldTemple = (BattleTempleDao)this.getGameCachePool().getData("tb_battle_temple", new Object[]{templeId});
               oldTemple.playerCode = 0;
               oldTemple.updateOp();
               down.setOldTempleId(templeId);
               BattleTempleModel model = (BattleTempleModel)player.getGameModelPool().getEntity("battleTemple", templeId);
               player.pushPartTaskEx(MonarchPart.class, "delMonarchTitle", new Object[]{model.getTitleId(), 4});
            }

            player.pushPartTaskEx(MonarchPart.class, "newUpdateMonarchType", new Object[]{battleTempleModel.getTitleId(), 4, 1});
            BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
            battleRecordMgr.pushTaskEx("saveBattleTempleRecord", new Object[]{fight, player, templeDao, addLevel, down, battleTempleModel});
         } else {
            player.pushPartTaskEx(BattleTemplePart.class, "updateDefeat", new Object[]{down, battleTempleModel});
         }

         player.getOperationMgr().addCopyLog(player, battleTempleModel.getId(), "武神殿");
      }
   }

   @TaskMethod
   public void saveRecord(BattleTempleDao templeDao, int addLevel, int recordId, GamePlayer player, BattleDailyMsg.S2C_EnterTemple_6640.Builder down, BattleTempleModel battleTempleModel, int startTime) {
      PlayerDao playerDao = player.getPlayerDao();
      templeDao.level += addLevel;
      List<TempleData> list = templeDao.addRecord(addLevel, recordId, playerDao.playerName, startTime);
      templeDao.playerCode = playerDao.playerId;
      templeDao.updateOp();
      down.setDefeatTime(0);
      down.setId(battleTempleModel.getId());
      Map<Integer, BattleTempleModel> map = player.getGameModelPool().getMap("battleTemple");

      for(Integer id : map.keySet()) {
         BattleTempleModel model = (BattleTempleModel)map.get(id);
         BattleTempleDao dao = (BattleTempleDao)this.gameCachePool.getData("tb_battle_temple", new Object[]{model.getId()});
         down.addInfo(this.packTempleInfo(dao));
      }

      down.setPrestigeId(battleTempleModel.getTitleId());
      player.sendMsg(down.build());
      if (list.size() > 0) {
         List<Integer> delList = new ArrayList();

         for(TempleData templeData : list) {
            delList.add(templeData.recordId);
         }

         BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
         battleRecordMgr.pushTaskEx("delRecord", new Object[]{delList});
      }

   }

   public int checkTemple(GamePlayer player, int id) {
      Map<Integer, BattleTempleModel> map = player.getGameModelPool().getMap("battleTemple");

      for(BattleTempleModel model : map.values()) {
         BattleTempleDao templeDao = (BattleTempleDao)this.getGameCachePool().getData("tb_battle_temple", new Object[]{model.getId()});
         if (templeDao.id != id && templeDao.playerCode == player.getPlayerId()) {
            return templeDao.id;
         }
      }

      return 0;
   }

   public boolean checkExist(GamePlayer player, int id) {
      boolean flag = false;
      Map<Integer, BattleTempleModel> map = player.getGameModelPool().getMap("battleTemple");

      for(BattleTempleModel model : map.values()) {
         BattleTempleDao templeDao = (BattleTempleDao)this.getGameCachePool().getData("tb_battle_temple", new Object[]{model.getId()});
         if (model.getTitleId() == id && templeDao.playerCode == player.getPlayerId()) {
            flag = true;
         }
      }

      return flag;
   }

   @TaskMethod
   public void sendTempleInfo(GamePlayer player, long time) {
      BattleDailyMsg.S2C_GetTempleInfo_6638.Builder down = BattleDailyMsg.S2C_GetTempleInfo_6638.newBuilder();
      Map<Integer, BattleTempleModel> map = player.getGameModelPool().getMap("battleTemple");

      for(Integer id : map.keySet()) {
         BattleTempleModel model = (BattleTempleModel)map.get(id);
         BattleTempleDao dao = (BattleTempleDao)this.gameCachePool.getData("tb_battle_temple", new Object[]{model.getId()});
         down.addInfo(this.packTempleInfo(dao));
      }

      down.setDefeatTime(DateUtil.getIntTime(time));
      RankPart rankPart = (RankPart)player.getMgrPart(RankPart.class);
      int rank = rankPart.getRank(RankDefine.RankModule.PVP);
      down.setMyRank(rank);
      player.sendMsg(down.build());
   }

   public BattleDailyMsg.TempleInfo.Builder packTempleInfo(BattleTempleDao templeDao) {
      BattleDailyMsg.TempleInfo.Builder info = BattleDailyMsg.TempleInfo.newBuilder();
      info.setId(templeDao.id);
      info.setLevel(templeDao.level);
      info.setPlayerCode(templeDao.playerCode);
      info.setPlayerName("");
      info.setPlayerLevel(1);
      info.setPlayerIcon(1);
      info.setPlayerHead(1);
      if (templeDao.playerCode != 0) {
         GamePlayer templePlayer = this.worldMgr.getPlayerById(templeDao.playerCode);
         PlayerDao playerDao = templePlayer.getPlayerDao();
         if (playerDao != null) {
            info.setPlayerName(playerDao.playerName);
            info.setPlayerLevel(playerDao.lv);
            info.setPlayerIcon(playerDao.monarchId);
            info.setPlayerHead(playerDao.head);
         }
      }

      return info;
   }

   @TaskMethod
   public void sendBattleRecord(int templeId, GamePlayer player) {
      BattleTempleDao templeDao = (BattleTempleDao)this.gameCachePool.getData("tb_battle_temple", new Object[]{templeId});
      BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
      battleRecordMgr.pushTaskEx("sendBattleRecord", new Object[]{templeId, player, templeDao});
   }

   @TaskMethod
   public void templeBattleEnd(GamePlayer player, int id, BattleTempleModel model) {
      PlayerDao playerDao = player.getPlayerDao();
      BattleTempleDao templeDao = (BattleTempleDao)this.gameCachePool.getData("tb_battle_temple", new Object[]{id});
      templeDao.stats = 0;
      templeDao.updateOp();
      if (templeDao.playerCode == player.getPlayerId()) {
         PrestigeModel prestigeModel = (PrestigeModel)player.getGameModelPool().getEntity("prestige", model.getTitleId());
         LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "TempleOfWar");
         String format = MessageFormat.format(languageModel.getValue(), playerDao.playerName, prestigeModel.getName(), playerDao.playerName);
         ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
         chatMgr.pushTaskEx("sendBattleTemple", new Object[]{player, format});
      }

      HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
      heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_TITLE);
   }

   public void _slaveServerMergeBegin(int mainServerId) throws Exception {
      Map<Integer, BattleTempleModel> map = this.gameModelPool.getMap("battleTemple");

      for(Integer id : map.keySet()) {
         BattleTempleDao dao = (BattleTempleDao)this.gameCachePool.getData("tb_battle_temple", new Object[]{id});
         if (dao.playerCode > 0) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(dao.playerCode);
            if (gamePlayer != null) {
               gamePlayer.pushPartTaskEx(MonarchPart.class, "mergeServerDelPrestige", new Object[]{((BattleTempleModel)map.get(id)).getTitleId()});
            }
         }
      }

   }
}
