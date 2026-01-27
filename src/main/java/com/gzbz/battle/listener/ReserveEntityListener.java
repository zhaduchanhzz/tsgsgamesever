package com.gzbz.battle.listener;

import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.protobuf.BattleMsg;
import java.util.ArrayList;
import java.util.Map;
import misc.MiscUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReserveEntityListener implements Listener {
   static Logger logger = LoggerFactory.getLogger(ReserveEntityListener.class);
   protected int round;
   protected BattlePKTeam battlePKTeam;

   public void listen(Event event, ListenerContext context) {
      byte round = (Byte)event.getParam(8);
      ArrayList<Long> tmpList = new ArrayList();

      for(Map.Entry<Long, Entity> entityEntry : this.battlePKTeam.getReserveEntity().entrySet()) {
         long k = (Long)entityEntry.getKey();
         Entity v = (Entity)entityEntry.getValue();
         int _index = MiscUtil.getHiParam(k);
         int _round = MiscUtil.getLowParam(k);
         if (round != _round - 1) {
            return;
         }

         tmpList.add(k);
      }

      for(Long key : tmpList) {
         Entity reserveEntity = (Entity)this.battlePKTeam.getReserveEntity().remove(key);
         reserveEntity.init(this.battlePKTeam.getScene(), reserveEntity.getTeamPos(), BattleMisc.convertBattlePos(reserveEntity.getForce(), reserveEntity.getTeamPos()), reserveEntity.getPkTeam(), reserveEntity.getForce());
         this.battlePKTeam.getScene().putPosEntity(reserveEntity.getBattlePos(), reserveEntity);
         this.battlePKTeam.getEntityMap().put(reserveEntity.getTeamPos(), reserveEntity);
         BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
         effectBuilder.setEffectType(14);
         effectBuilder.setEffectValue((long)reserveEntity.getForce());
         effectBuilder.setTargetBattlePos(reserveEntity.getBattlePos());
         effectBuilder.setFinalValue((long)reserveEntity.getPlotIndex());
         event.getAction().getBlackboard().addBattleEffect(effectBuilder);
      }

   }

   public void setBattlePKTeam(BattlePKTeam battlePKTeam) {
      this.battlePKTeam = battlePKTeam;
   }
}
