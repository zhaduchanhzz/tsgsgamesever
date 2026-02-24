package com.gzbz.gamePlayer.levelPromote;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.model.LevelPromoteModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.LevelPromoteMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class LevelPromotePart extends PlayerPart {
   private final short TOTAL_WAVE = 3;
   private final WorldMgr worldMgr;
   private final BattleRecordMgr battleRecordMgr;

   public LevelPromotePart(WorldMgr worldMgr, BattleRecordMgr battleRecordMgr) {
      this.worldMgr = worldMgr;
      this.battleRecordMgr = battleRecordMgr;
   }

   @MsgHandlerAnno
   public void C2S_PromoteInfo_17901(LevelPromoteMsg.C2S_PromoteInfo_17901 msg, String source) {
      this.sendPromoteInfo();
   }

   public void sendPromoteInfo() {
      LevelPromoteMsg.S2C_PromoteInfo_17902.Builder builder = LevelPromoteMsg.S2C_PromoteInfo_17902.newBuilder();
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      builder.setPromoteId(playerExtend.levelPromoteId);
      WorldDao<HashMap<Integer, ArrayList<String>>> worldDao = this.worldMgr.<HashMap<Integer, ArrayList<String>>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_LEVEL_PROMOTE_RECORD);

      for(Map.Entry<Integer, ArrayList<String>> entry : (worldDao.jsonData).entrySet()) {
         LevelPromoteMsg.RankInfo.Builder rankInfo = LevelPromoteMsg.RankInfo.newBuilder();
         rankInfo.setModelId((Integer)entry.getKey());

         for(String info : entry.getValue()) {
            String[] arr = info.split("\\|");
            GamePlayer othwerPlayer = this.worldMgr.getPlayerById(Integer.parseInt(arr[0]));
            if (othwerPlayer != null) {
               CommonMsg.PlayerInfo.Builder playerInfo = othwerPlayer.toPlayerInfo();
               rankInfo.addPlayerInfo(playerInfo);
            }
         }

         builder.addRankInfo(rankInfo);
      }

      this.player.sendMsg(builder.build());
   }

   public int enterBattle(BattleDao battleDao) {
      if (!this.player.isSystemOpen(3900)) {
         return 21;
      } else {
         LevelPromoteModel levelPromoteModel = (LevelPromoteModel)ApplicationContextProvider.getModelPoolEntity("levelPromote", battleDao.modelId);
         if (levelPromoteModel == null) {
            return 6;
         } else {
            PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
            if (playerExtend.levelPromoteId >= levelPromoteModel.getId()) {
               return 76023;
            } else if (playerExtend.levelPromoteId + 1 != battleDao.modelId) {
               return 76024;
            } else {
               PlayerDao playerDao = this.player.getPlayerDao();
               if (playerDao.lv < levelPromoteModel.getNeedLv()) {
                  return 76025;
               } else if (!this.checkArraying(levelPromoteModel)) {
                  return 76026;
               } else {
                  int curWave = battleDao.scene.getWave();
                  ArrayingMirror arrayingMirror = this.player.getPlayerArraying((CommonMsg.HeroState)((List)HeroArrayingPart.MULTIPLE_ARRAYING.get(3900)).get(curWave));
                  BattlePKTeam leftPKTeam = new BattlePKTeam(playerDao.playerId, playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, (Map)null);
                  BattlePKTeam rigthPKTeam = new BattlePKTeam((Integer)levelPromoteModel.getBattle().get(curWave));
                  battleDao.scene.addPKTeam(leftPKTeam, rigthPKTeam);
                  battleDao.scene.setBattleId((Integer)levelPromoteModel.getBattle().get(curWave));
                  battleDao.scene.setWave((short)(curWave + 1), (short)3);
                  battleDao.scene.setMaxRound((byte)17);
                  return 1;
               }
            }
         }
      }
   }

   public void endBattle(BattleDao battleDao) {
      if (battleDao.rewards.size() > 0) {
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         playerExtend.levelPromoteId = battleDao.modelId;
         this.player.updatePlayerExtend(13);
         this.sendPromoteInfo();
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 87, 8701, battleDao.modelId, 0, "");
         this.battleRecordMgr.pushTaskEx("levelPromoteRecord", new Object[]{battleDao.modelId, this.player});
      }

   }

   public void afterFight(BattleDao battleDao) {
      battleDao.scene.getBattleMsg().setIsNextWave(battleDao.scene.getBattleMsg().getWave() > 1);
      if (battleDao.scene.getWinForce() == 0) {
         battleDao.params.add(1);
         battleDao.updateOp();
      }

      if (battleDao.scene.getBattleMsg().getWave() == 3) {
         battleDao.status = 0;
         battleDao.updateOp();
         battleDao.scene.getBattleMsg().setIsEnd(true);
         LevelPromoteModel levelPromoteModel = (LevelPromoteModel)ApplicationContextProvider.getModelPoolEntity("levelPromote", battleDao.modelId);
         BattleMsg.S2C_Battle_Result.Builder resultBuild = battleDao.scene.getBattleMsg().getResult().toBuilder();
         if (battleDao.params.size() >= levelPromoteModel.getWinTimes()) {
            resultBuild.setResult(0);
            battleDao.rewards.addAll(levelPromoteModel.getRewards());
            battleDao.updateOp();

            for(ResourceModel reward : battleDao.rewards) {
               resultBuild.addAwardItems(reward.builder());
            }
         } else {
            resultBuild.setResult(1);
         }

         battleDao.scene.getBattleMsg().setResult(resultBuild);
      }

   }

   private boolean checkArraying(LevelPromoteModel levelPromoteModel) {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      boolean isHaveArraying_1 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_LEVEL_PROMOTE_1);
      boolean isHaveArraying_2 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_LEVEL_PROMOTE_2);
      boolean isHaveArraying_3 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_LEVEL_PROMOTE_3);
      if (isHaveArraying_1 && isHaveArraying_2 && isHaveArraying_3) {
         if (heroArrayingPart.multipleArrayingHadSameHero(3900)) {
            return false;
         } else {
            List<Integer> arrayCondition = levelPromoteModel.getArrayCondition();
            return heroArrayingPart.satisfiedConditions(arrayCondition, (List)HeroArrayingPart.MULTIPLE_ARRAYING.get(3900)) == arrayCondition.size();
         }
      } else {
         return false;
      }
   }

   public void gmTest(String string) {
      String[] arr = string.split(",");
      switch (arr[0]) {
         case "reset":
            this.gmReset();
            break;
         case "removerecord":
            this.gmRemoveRecord(Integer.parseInt(arr[1]));
            break;
         case "promote":
            int levelPromoteId = Integer.parseInt(arr[1]);
            LevelPromoteModel levelPromoteModel = (LevelPromoteModel)ApplicationContextProvider.getModelPoolEntity("levelPromote", levelPromoteId);
            if (levelPromoteModel != null) {
               PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
               playerExtend.levelPromoteId = levelPromoteId;
               this.player.updatePlayerExtend(13);
            }

            this.battleRecordMgr.pushTaskEx("levelPromoteRecord", new Object[]{levelPromoteId, this.player});
      }

   }

   private void gmReset() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      playerExtend.levelPromoteId = 0;
      this.player.updatePlayerExtend(13);
   }

   private void gmRemoveRecord(int modelId) {
      WorldDao<HashMap<Integer, ArrayList<String>>> worldDao = this.worldMgr.<HashMap<Integer, ArrayList<String>>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_LEVEL_PROMOTE_RECORD);
      if (modelId <= 0) {
         ((HashMap)worldDao.jsonData).clear();
      } else {
         ((HashMap)worldDao.jsonData).remove(modelId);
      }

      worldDao.updateOp();
      this.sendPromoteInfo();
   }
}
