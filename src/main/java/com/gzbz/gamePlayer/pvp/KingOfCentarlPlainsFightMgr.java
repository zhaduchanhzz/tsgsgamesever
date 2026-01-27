package com.gzbz.gamePlayer.pvp;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.FightData;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.worldMgr.WorldMgr;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@MgrAnno
@Scope("prototype")
@Component
public class KingOfCentarlPlainsFightMgr extends GameMgr {
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   BattleRecordMgr battleRecordMgr;
   @Autowired
   private HeroRankMgr heroRankMgr;
   private ScheduledFuture future;
   private int index = 0;
   private List<FightData> fightDataList;
   private FightData guessFightData;
   private int round;
   private int winScore;
   private boolean isTest;
   private KingOfCentralPlainsMgr kingOfCentralPlainsMgr;

   protected void init() throws Exception {
   }

   @TaskMethod
   public void doFight() {
      if (this.index >= this.fightDataList.size()) {
         this.future.cancel(true);
      } else {
         FightData fightData = (FightData)this.fightDataList.get(this.index);
         boolean isGuessFight = false;
         if (this.guessFightData.lId == fightData.lId) {
            isGuessFight = true;
         }

         this.playerFight(this.round, this.winScore, fightData, isGuessFight);
         ++this.index;
      }
   }

   @TaskMethod
   public void fight(List<FightData> fightDataList, FightData guessFightData, int round, int winScore, boolean isTest, KingOfCentralPlainsMgr kingOfCentralPlainsMgr) {
      this.index = 0;
      this.fightDataList = fightDataList;
      this.guessFightData = guessFightData;
      this.round = round;
      this.winScore = winScore;
      this.isTest = isTest;
      this.kingOfCentralPlainsMgr = kingOfCentralPlainsMgr;
      int time = 900;
      if (isTest) {
         time = 10;
      }

      logger.info("第{}轮战斗，测试={},时间={}", new Object[]{round, isTest, time});
      this.future = this.scheduleEx(0L, (long)time, "doFight", new Object[0]);
   }

   public void playerFight(int round, int winScore, FightData fightData, boolean isGuessFight) {
      GamePlayer leftPlayer = this.worldMgr.getPlayerById(fightData.lId);
      GamePlayer rightPlayer = this.worldMgr.getPlayerById(fightData.rId);
      PlayerPublicDao leftPlayerDao = leftPlayer.getPublicDao();
      PlayerPublicDao rightPlayerDao = rightPlayer.getPublicDao();
      if (!isGuessFight && round <= 6 && leftPlayer.isRobot() && rightPlayer.isRobot()) {
         fightData.win = 0;
         fightData.winScore = winScore;
         if (leftPlayerDao.combat_power < rightPlayerDao.combat_power) {
            fightData.win = 1;
         }
      } else {
         ArrayingMirror leftArrayingMirror = this.kingOfCentralPlainsMgr.getArrayingMirror(leftPlayer.getPlayerId());
         ArrayingMirror rightArrayingMirror = this.kingOfCentralPlainsMgr.getArrayingMirror(rightPlayer.getPlayerId());
         if (leftArrayingMirror == null) {
            logger.error("获取阵型为空,玩家ID={}", leftPlayer.getPlayerId());
            return;
         }

         if (rightArrayingMirror == null) {
            logger.error("获取阵型为空,玩家ID={}", rightPlayer.getPlayerId());
            return;
         }

         BattlePKTeam leftTeam = new BattlePKTeam(leftPlayerDao.playerId, leftPlayerDao.playerName, leftArrayingMirror, leftPlayerDao.lv, leftPlayerDao.head, leftPlayerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(leftArrayingMirror, leftPlayer.isRobot()));
         BattlePKTeam rightTeam = new BattlePKTeam(rightPlayerDao.playerId, rightPlayerDao.playerName, rightArrayingMirror, rightPlayerDao.lv, rightPlayerDao.head, rightPlayerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(rightArrayingMirror, rightPlayer.isRobot()));
         BattleScene scene = new BattleScene(1500, 1);
         scene.addPKTeam(leftTeam, rightTeam);
         boolean isError = false;

         try {
            scene.fight((byte)20);
         } catch (Exception e) {
            logger.error("战斗报错，左方玩家={}，战力={}，右方玩家={}，战力={}", new Object[]{fightData.lId, leftArrayingMirror.power, fightData.rId, rightArrayingMirror.power});
            e.printStackTrace();
            isError = true;
         }

         BattleMsg.S2C_BattleResult_6102.Builder result = this.battleRecordMgr.addBattleRecord(1500, 0, leftPlayer.getPlayerId(), rightPlayer.getPlayerId(), scene.getBattleMsg());
         if (isError) {
            if (leftArrayingMirror.power >= rightArrayingMirror.power) {
               fightData.win = 0;
            } else {
               fightData.win = 1;
            }
         } else {
            fightData.win = scene.getWinForce();
         }

         fightData.record = result.getResult().getRecordId();
         fightData.winScore = winScore;
      }

   }
}
