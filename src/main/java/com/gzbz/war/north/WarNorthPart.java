package com.gzbz.war.north;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.WarNorthDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.model.ItemModel;
import com.gzbz.model.NorthChapterBoxModel;
import com.gzbz.model.NorthCopyModel;
import com.gzbz.model.NorthSectionModel;
import com.gzbz.model.SacrificeBoxModel;
import com.gzbz.model.SacrificeLibModel;
import com.gzbz.model.SacrificeModel;
import com.gzbz.model.StampModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.WarNorthMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.robot.MonsterManager;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import misc.RandomUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class WarNorthPart extends PlayerPart {
   private final WarNorthMgr warNorthMgr;
   private final MonsterManager monsterManager;

   public WarNorthPart(WarNorthMgr warNorthMgr, MonsterManager monsterManager) {
      this.warNorthMgr = warNorthMgr;
      this.monsterManager = monsterManager;
   }

   @MsgHandlerAnno
   public void C2S_WarNorthMainInfo_11001(WarNorthMsg.C2S_WarNorthMainInfo_11001 msg, String source) {
      this.sendMainInfo();
   }

   @MsgHandlerAnno
   public void C2S_WarNorthSectionTargetReward_11003(WarNorthMsg.C2S_WarNorthSectionTargetReward_11003 msg, String source) {
      int target = msg.getTarget();
      NorthChapterBoxModel northChapterBoxModel = (NorthChapterBoxModel)ApplicationContextProvider.getModelPoolEntity("northChapterBox", target);
      if (northChapterBoxModel == null) {
         this.player.failure(0);
      } else {
         WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
         Map<Integer, Set<Integer>> copies = (Map)warNorthDao.copies.getOrDefault(northChapterBoxModel.getSectionId(), new HashMap());
         int currentStar = copies.values().stream().mapToInt(Set::size).sum();
         if (currentStar < northChapterBoxModel.getStar()) {
            this.player.failure(21014);
         } else {
            Set<Integer> targetGotIds = (Set)warNorthDao.sectionTargets.getOrDefault(northChapterBoxModel.getSectionId(), new HashSet());
            if (targetGotIds.contains(target)) {
               this.player.failure(24);
            } else {
               ((Set)warNorthDao.sectionTargets.computeIfAbsent(northChapterBoxModel.getSectionId(), (v) -> new HashSet())).add(target);
               warNorthDao.updateOp();
               this.player.addResource(northChapterBoxModel.getBoxRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 21, 2114, northChapterBoxModel.getSectionId(), target, "");
               WarNorthMsg.S2C_WarNorthSectionTargetReward_11004.Builder resp = WarNorthMsg.S2C_WarNorthSectionTargetReward_11004.newBuilder();
               resp.setTarget(target);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WarNorthSectionInfo_11005(WarNorthMsg.C2S_WarNorthSectionInfo_11005 msg, String source) {
      int section = msg.getSection();
      WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
      if (!warNorthDao.copies.containsKey(section)) {
         this.player.failure(21018);
      } else {
         this.sendSectionInfo(section);
      }
   }

   @MsgHandlerAnno
   public void C2S_WarNorthSectionBoxReward_11009(WarNorthMsg.C2S_WarNorthSectionBoxReward_11009 msg, String source) {
   }

   @MsgHandlerAnno
   public void C2S_WarNorthSacrificeInfo_11011(WarNorthMsg.C2S_WarNorthSacrificeInfo_11011 msg, String source) {
      this.sendSacrificeInfo();
   }

   @MsgHandlerAnno
   public void C2S_WarNorthDoSacrifice_11013(WarNorthMsg.C2S_WarNorthDoSacrifice_11013 msg, String source) {
      int type = msg.getType();
      SacrificeModel sacrificeModel = (SacrificeModel)ApplicationContextProvider.getModelPoolEntity("sacrifice", type);
      if (sacrificeModel == null) {
         this.player.failure(0);
      } else {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int dailyCount = (Integer)playerResetCustomCache.getDailyNum(17, 0);
         if ((float)(dailyCount + sacrificeModel.getTimes()) > ApplicationContextProvider.getConfigFloat("LotteryLimit", 99999.0F)) {
            this.player.failure(76029);
         } else {
            PlayerDao playerDao = this.player.getPlayerDao();
            SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 1990);
            WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
            if (!warNorthDao.firstGot && playerDao.lv > systemFunctionModel.getLvLimitEx()) {
               warNorthDao.firstGot = true;
               warNorthDao.updateOp();
            }

            int freeCount = ApplicationContextProvider.getConfigInt("sacrificeFreeNum", 0);
            long feeItem = 0L;
            long feeGold = 0L;
            if (sacrificeModel.getTimes() == 1 && warNorthDao.sacrificeFreeCount < freeCount) {
               ++warNorthDao.sacrificeFreeCount;
            } else {
               ResourceModel sacrificeItemResource = new ResourceModel((Integer)sacrificeModel.getFirstItem().get(0), (Integer)sacrificeModel.getFirstItem().get(1), (Integer)sacrificeModel.getFirstItem().get(2));
               ResourceModel sacrificeGoldResource = new ResourceModel((Integer)sacrificeModel.getReplaceItem().get(0), (Integer)sacrificeModel.getReplaceItem().get(1), (Integer)sacrificeModel.getReplaceItem().get(2));
               long itemRes = this.player.getResourceNum(sacrificeItemResource.getType(), sacrificeItemResource.getId());
               long needItemRes = (long)(Integer)sacrificeModel.getFirstItem().get(2) - itemRes;
               if (needItemRes > 0L) {
                  feeGold = (long)(sacrificeGoldResource.getValue() / sacrificeModel.getTimes()) * needItemRes;
                  if (!this.player.checkResourceNum(sacrificeGoldResource.getType(), sacrificeGoldResource.getId(), (int)feeGold)) {
                     this.player.failure(31);
                     return;
                  }

                  feeItem = itemRes;
               } else {
                  feeItem = (long)(Integer)sacrificeModel.getFirstItem().get(2);
               }
            }

            List<ResourceModel> prizeList = new ArrayList();
            int sacrificeCount = this.sacrifice(prizeList, sacrificeModel, warNorthDao.sacrificeCount, warNorthDao.firstGot);
            if (feeItem > 0L) {
               this.player.delResource((Integer)sacrificeModel.getFirstItem().get(0), (Integer)sacrificeModel.getFirstItem().get(1), feeItem, 21, 2115, type, 0, "");
               this.player.getOperationMgr().addExtraLog(this.player, 135, String.valueOf(feeItem), String.valueOf(0));
            }

            if (feeGold > 0L) {
               this.player.delResource((Integer)sacrificeModel.getReplaceItem().get(0), (Integer)sacrificeModel.getReplaceItem().get(1), feeGold, 21, 2115, type, 0, "");
               this.player.getOperationMgr().addExtraLog(this.player, 135, String.valueOf(0), String.valueOf(feeGold));
            }

            warNorthDao.firstGot = true;
            warNorthDao.sacrificePoint += sacrificeModel.getExReward();
            warNorthDao.sacrificeCount = sacrificeCount;
            warNorthDao.updateOp();
            playerResetCustomCache.setDailyReset(17, dailyCount + sacrificeModel.getTimes());
            List<ResourceModel> sacrificeLogResources = new ArrayList(prizeList);
            this.warNorthMgr.pushTask(() -> this.warNorthMgr.addSacrificeRecords(sacrificeLogResources, playerDao.playerId, playerDao.playerName));
            prizeList.addAll(sacrificeModel.getRewards());
            this.player.triggerTask(359, 0, (long)sacrificeModel.getTimes(), 1);
            this.player.addResource(prizeList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 21, 2115, type, 0, "");
            WarNorthMsg.S2C_WarNorthDoSacrifice_11014.Builder resp = WarNorthMsg.S2C_WarNorthDoSacrifice_11014.newBuilder();
            resp.setType(type);
            resp.setSacrificeCount(warNorthDao.sacrificeCount);
            resp.setDailySacrificeCount((Integer)playerResetCustomCache.getDailyNum(17, 0));
            this.player.sendMsg(resp.build());

            for(ResourceModel resourceModel : prizeList) {
               if (resourceModel.getType() == 2) {
                  ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", resourceModel.getId());
                  if (itemModel != null) {
                     this.player.getOperationMgr().addExtraLog(this.player, 136, String.valueOf(itemModel.getId()), itemModel.getName(), String.valueOf(resourceModel.getValue()));
                  }
               }
            }

            GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
            guanJiaPart.checkState(1191, (List)null);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WarNorthSacrificeBoxReward_11015(WarNorthMsg.C2S_WarNorthSacrificeBoxReward_11015 msg, String source) {
      int id = msg.getId();
      Map<Integer, SacrificeBoxModel> sacrificeBoxModelMap = ApplicationContextProvider.<Integer, SacrificeBoxModel>getModelPoolMap("sacrificeBox");
      SacrificeBoxModel sacrificeBoxModel = (SacrificeBoxModel)sacrificeBoxModelMap.get(id);
      if (sacrificeBoxModel == null) {
         this.player.failure(0);
      } else {
         WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
         if (warNorthDao.sacrificePoint >= sacrificeBoxModel.getNeedPoint() && warNorthDao.sacrificePoint >= sacrificeBoxModel.getConsumePoint()) {
            if (warNorthDao.sacrificeBoxes.contains(id)) {
               this.player.failure(24);
            } else {
               warNorthDao.sacrificeBoxes.add(id);
               if (warNorthDao.sacrificeBoxes.size() >= sacrificeBoxModelMap.size()) {
                  int maxId = sacrificeBoxModelMap.keySet().stream().mapToInt((value) -> value).max().orElse(999);
                  warNorthDao.sacrificePoint -= ((SacrificeBoxModel)sacrificeBoxModelMap.getOrDefault(maxId, new SacrificeBoxModel())).getConsumePoint();
                  warNorthDao.sacrificeBoxes.clear();
               }

               warNorthDao.updateOp();
               this.player.addResource(2, sacrificeBoxModel.getBoxId(), 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 21, 2116, sacrificeBoxModel.getId(), 1, "");
               WarNorthMsg.S2C_WarNorthSacrificeBoxReward_11016.Builder resp = WarNorthMsg.S2C_WarNorthSacrificeBoxReward_11016.newBuilder();
               resp.setId(id);
               resp.setSacrificePoint(warNorthDao.sacrificePoint);
               this.player.sendMsg(resp.build());
            }
         } else {
            this.player.failure(36);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WarNorthSacrificeRecordList_11017(WarNorthMsg.C2S_WarNorthSacrificeRecordList_11017 msg, String source) {
      this.player.sendMsg(this.warNorthMgr.buildSacrificeRecordListMsg(msg.getType(), this.player.getPlayerId()));
   }

   @MsgHandlerAnno
   public void C2S_WarNorthBuyChallengeCount_11021(WarNorthMsg.C2S_WarNorthBuyChallengeCount_11021 msg, String source) {
      WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
      int maxBuyCount = ApplicationContextProvider.getConfigInt("northCopyPurchaseChallengeNum", 2);
      if (warNorthDao.buyCount >= maxBuyCount) {
         this.player.failure(25);
      } else {
         String[] buyFeeArr = ApplicationContextProvider.getConfigString("northCopyChallengeNumPrice", "").split("\\|");
         ResourceModel resourceModel = new ResourceModel(Integer.parseInt(buyFeeArr[0]), Integer.parseInt(buyFeeArr[1]), Integer.parseInt(buyFeeArr[2]));
         if (!this.player.checkResourceNum(resourceModel)) {
            this.player.failure(31);
         } else {
            this.player.delResource(resourceModel, 21, 2117, 0, 0, "");
            ++warNorthDao.buyCount;
            warNorthDao.updateOp();
            WarNorthMsg.S2C_WarNorthBuyChallengeCount_11022.Builder resp = WarNorthMsg.S2C_WarNorthBuyChallengeCount_11022.newBuilder();
            resp.setBuyCount(warNorthDao.buyCount);
            this.player.sendMsg(resp.build());
         }
      }
   }

   public int enterBattle(BattleDao battleDao) {
      if (battleDao.status == 0) {
         return 44;
      } else {
         NorthCopyModel northCopyModel = (NorthCopyModel)ApplicationContextProvider.getModelPoolEntity("northCopy", battleDao.modelId);
         if (northCopyModel == null) {
            return 0;
         } else {
            WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
            int freeChallengeCount = ApplicationContextProvider.getConfigInt("northCopyFreeChallengeNum", 0);
            if (warNorthDao.challengeCount >= freeChallengeCount + warNorthDao.buyCount) {
               return 41;
            } else {
               int checkResult = this.checkCopy(battleDao.modelId);
               if (checkResult != 1) {
                  return checkResult;
               } else {
                  Map<Integer, Set<Integer>> currentSectionCopyMap = (Map)warNorthDao.copies.getOrDefault(northCopyModel.getSectionId(), new HashMap());
                  if (((Set)currentSectionCopyMap.getOrDefault(northCopyModel.getId(), new HashSet())).size() >= northCopyModel.getStars().size()) {
                     battleDao.isSkip = true;
                  }

                  battleDao.scene.setMaxRound((byte)northCopyModel.getBoutCount());
                  int wave = northCopyModel.getBattles().size();
                  if (wave > 1) {
                     battleDao.scene.setWave((short)1, (short)wave);
                  }

                  battleDao.scene.setBattleId((Integer)northCopyModel.getBattles().get(0));
                  battleDao.scene.setSetId(northCopyModel.getId());
                  battleDao.scene.addPKTeam((byte)1, new BattlePKTeam((Integer)northCopyModel.getBattles().get(0)));
                  this.player.getOperationMgr().addCopyLog(this.player, northCopyModel.getId(), "北伐中原");
                  return 1;
               }
            }
         }
      }
   }

   public int nextBattle(BattleDao battleDao) {
      int checkResult = this.checkCopy(battleDao.modelId);
      if (checkResult != 1) {
         return checkResult;
      } else if (battleDao.scene.getWave() != 1) {
         return 6;
      } else if (battleDao.scene.getWinForce() != 1 && battleDao.scene.getWave() <= battleDao.scene.getTotalWave()) {
         NorthCopyModel northCopyModel = (NorthCopyModel)ApplicationContextProvider.getModelPoolEntity("northCopy", battleDao.modelId);
         battleDao.scene.setWave((short)2);
         battleDao.scene.setBattleId((Integer)northCopyModel.getBattles().get(1));
         battleDao.scene.addPKTeam((byte)1, new BattlePKTeam((Integer)northCopyModel.getBattles().get(1)));
         return 1;
      } else {
         return 44;
      }
   }

   public void afterFight(BattleDao battleDao) {
      NorthCopyModel northCopyModel = (NorthCopyModel)ApplicationContextProvider.getModelPoolEntity("northCopy", battleDao.modelId);
      BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
      List<Integer> satisfiedConditions = battlePart.satisfiedConditions(battleDao, northCopyModel.getStars());
      int curWave = battleDao.scene.getWave();
      battleDao.scene.getBattleMsg().setIsNextWave(curWave > 1);
      boolean isLastWave = curWave == 0 || curWave == battleDao.scene.getTotalWave();
      if (isLastWave && battleDao.scene.getWinForce() == 0 && !satisfiedConditions.isEmpty() || battleDao.isSkip) {
         NorthSectionModel northSectionModel = (NorthSectionModel)ApplicationContextProvider.getModelPoolEntity("northSection", northCopyModel.getSectionId());
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
         result.setResult(0);
         WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
         ++warNorthDao.challengeCount;
         Map<Integer, Set<Integer>> sectionCopies = (Map)warNorthDao.copies.computeIfAbsent(northCopyModel.getSectionId(), (v) -> new HashMap());
         Set<Integer> copyConditions = (Set)sectionCopies.computeIfAbsent(northCopyModel.getId(), (v) -> new HashSet());
         if (copyConditions.isEmpty()) {
            northCopyModel.getFirstRewards().forEach((resourceModel) -> resourceModel.addResourceToList(battleDao.rewards));
            NorthCopyModel nextCopyModel = (NorthCopyModel)ApplicationContextProvider.getModelPoolEntity("northCopy", northCopyModel.getNextId());
            if (nextCopyModel != null) {
               sectionCopies.computeIfAbsent(northCopyModel.getNextId(), (v) -> new HashSet());
            } else {
               Map<Integer, Map<Integer, NorthCopyModel>> modelMap = ApplicationContextProvider.<Integer, Map<Integer, NorthCopyModel>>getModelPoolMap("customNorthCopy");
               if (sectionCopies.size() >= ((Map)modelMap.get(northCopyModel.getSectionId())).size()) {
                  this.unlockSectionFirstCopy(northSectionModel.getOpenSectionId());
               }
            }
         } else {
            northCopyModel.getRewards().forEach((resourceModel) -> resourceModel.addResourceToList(battleDao.rewards));
         }

         battleDao.rewards.forEach((r) -> result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(r.getType()).setId(r.getId()).setNum(r.getValue())));
         battleDao.status = 0;
         battleDao.scene.getBattleMsg().setResult(result);
         battleDao.scene.getBattleMsg().setIsEnd(true);
         if (battleDao.isSkip) {
            battleDao.scene.getBattleMsg().addAllExParams(copyConditions);
         } else {
            copyConditions.addAll(satisfiedConditions);
            int totalStar = 0;

            for(Map.Entry<Integer, Map<Integer, Set<Integer>>> entry : warNorthDao.copies.entrySet()) {
               totalStar += (entry.getValue()).values().stream().mapToInt(Set::size).sum();
            }

            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            rankPart.updateRank(RankDefine.RankModule.WAR_NORTH, (long)totalStar, false);
            if (northSectionModel.getCopyNumber() * 3 <= sectionCopies.values().stream().mapToInt(Set::size).sum()) {
               this.player.triggerTask(320, northSectionModel.getId(), 1L, 3);
            }

            battleDao.scene.getBattleMsg().addAllExParams(satisfiedConditions);
            this.sendSectionInfo(northCopyModel.getSectionId());
         }

         warNorthDao.updateOp();
         this.player.triggerTask(358, 0, 1L, 1);
         this.sendMainInfo();
         this.player.getOperationMgr().addExtraLog(this.player, 189, "北伐中原" + (battleDao.isSkip ? "-扫荡" : ""), northSectionModel.getName(), northCopyModel.getName(), String.valueOf(copyConditions.size()), "过关");
      }

   }

   public void endBattle(BattleDao battleDao) {
      this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 21, 2118, battleDao.modelId, 0, "");
   }

   private int checkCopy(int modelId) {
      NorthCopyModel northCopyModel = (NorthCopyModel)ApplicationContextProvider.getModelPoolEntity("northCopy", modelId);
      if (northCopyModel == null) {
         return 0;
      } else {
         WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
         Map<Integer, TreeMap<Integer, NorthCopyModel>> allCopyModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, NorthCopyModel>>getModelPoolMap("customNorthCopy");
         Map<Integer, NorthSectionModel> northSectionModelMap = ApplicationContextProvider.<Integer, NorthSectionModel>getModelPoolMap("northSection");
         Optional<NorthSectionModel> sectionModelOptional = northSectionModelMap.values().stream().filter((northSectionModel) -> northSectionModel.getOpenSectionId() == northCopyModel.getSectionId()).findFirst();
         NorthSectionModel prevSection = null;
         if (sectionModelOptional.isPresent()) {
            prevSection = (NorthSectionModel)sectionModelOptional.get();
         }

         if (prevSection != null) {
            Map<Integer, Set<Integer>> preSectionCopyMap = (Map)warNorthDao.copies.getOrDefault(prevSection.getId(), new HashMap());
            if (preSectionCopyMap.size() < ((TreeMap)allCopyModelMap.get(prevSection.getId())).size()) {
               return 21018;
            }
         }

         TreeMap<Integer, NorthCopyModel> sectionCopyMap = (TreeMap)allCopyModelMap.get(northCopyModel.getSectionId());
         Optional<NorthCopyModel> copyModelOptional = sectionCopyMap.values().stream().filter((copyModel) -> copyModel.getNextId() == northCopyModel.getId()).findFirst();
         NorthCopyModel prevCopy = null;
         if (copyModelOptional.isPresent()) {
            prevCopy = (NorthCopyModel)copyModelOptional.get();
         }

         Map<Integer, Set<Integer>> currentSectionCopyMap = (Map)warNorthDao.copies.getOrDefault(northCopyModel.getSectionId(), new HashMap());
         return prevCopy != null && !currentSectionCopyMap.containsKey(prevCopy.getId()) ? 21019 : 1;
      }
   }

   private void sendMainInfo() {
      WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
      WarNorthMsg.S2C_WarNorthMainInfo_11002.Builder resp = WarNorthMsg.S2C_WarNorthMainInfo_11002.newBuilder();
      resp.setChallengeCount(warNorthDao.challengeCount);
      resp.setBuyCount(warNorthDao.buyCount);
      if (warNorthDao.copies.isEmpty()) {
         this.unlockSectionFirstCopy(1);
      }

      for(Map.Entry<Integer, Map<Integer, Set<Integer>>> entry : warNorthDao.copies.entrySet()) {
         WarNorthMsg.SectionData.Builder sectionBuilder = WarNorthMsg.SectionData.newBuilder();
         sectionBuilder.setId((Integer)entry.getKey());
         int totalStar = (entry.getValue()).values().stream().mapToInt(Set::size).sum();
         sectionBuilder.setStar(totalStar);
         sectionBuilder.addAllGotRewardIds((Iterable)warNorthDao.sectionTargets.getOrDefault(entry.getKey(), new HashSet()));
         resp.addSectionList(sectionBuilder);
      }

      this.player.sendMsg(resp.build());
   }

   private void sendSacrificeInfo() {
      WarNorthMsg.S2C_WarNorthSacrificeInfo_11012.Builder resp = WarNorthMsg.S2C_WarNorthSacrificeInfo_11012.newBuilder();
      WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
      resp.setSacrificePoint(warNorthDao.sacrificePoint);
      resp.setSacrificeCount(warNorthDao.sacrificeCount);
      resp.addAllGotBoxes(warNorthDao.sacrificeBoxes);
      resp.setSacrificeFreeCount(warNorthDao.sacrificeFreeCount);
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      resp.setDailySacrificeCount((Integer)playerResetCustomCache.getDailyNum(17, 0));
      this.player.sendMsg(resp.build());
   }

   private void sendSectionInfo(int section) {
      WarNorthMsg.S2C_WarNorthSectionInfo_11006.Builder resp = WarNorthMsg.S2C_WarNorthSectionInfo_11006.newBuilder();
      resp.setSection(section);
      WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
      ((Map)warNorthDao.copies.getOrDefault(section, new HashMap())).forEach((key, value) -> {
         WarNorthMsg.CopyData.Builder copyBuilder = WarNorthMsg.CopyData.newBuilder();
         copyBuilder.setCopyId((Integer) key);
         copyBuilder.addAllSatisfiedConditions((Iterable<? extends Integer>) value);
         long power = 0L;
         NorthCopyModel northCopyModel = (NorthCopyModel)ApplicationContextProvider.getModelPoolEntity("northCopy", (Integer) key);
         if (northCopyModel != null) {
            for(Integer battleId : northCopyModel.getBattles()) {
               power += this.monsterManager.getTotalPowerByBattleId(battleId);
            }
         }

         copyBuilder.setPower(power);
         resp.addCopies(copyBuilder);
      });
      this.player.sendMsg(resp.build());
   }

   private void unlockSectionFirstCopy(int section) {
      Map<Integer, TreeMap<Integer, NorthCopyModel>> modelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, NorthCopyModel>>getModelPoolMap("customNorthCopy");
      TreeMap<Integer, NorthCopyModel> sectionCopyMap = (TreeMap)modelMap.getOrDefault(section, new TreeMap());
      if (!sectionCopyMap.isEmpty()) {
         WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
         ((Map)warNorthDao.copies.computeIfAbsent(section, (v) -> new HashMap())).computeIfAbsent(sectionCopyMap.firstKey(), (v) -> new HashSet());
         warNorthDao.updateOp();
      }

   }

   public void resetDaily() {
      WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
      warNorthDao.reset();
      this.sendMainInfo();
   }

   public void gmWarNorth(String gm) {
      String[] strArr = gm.split("\\|");
      switch (strArr[0]) {
         case "unlockcopy":
            int copyId = Integer.parseInt(strArr[1]);
            Map<Integer, NorthCopyModel> northCopyModelMap = ApplicationContextProvider.<Integer, NorthCopyModel>getModelPoolMap("northCopy");
            if (northCopyModelMap.containsKey(copyId)) {
               TreeMap<Integer, NorthCopyModel> northCopyModelTreeMap = new TreeMap(northCopyModelMap);
               WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());

               for(NorthCopyModel northCopyModel : northCopyModelTreeMap.values()) {
                  Map<Integer, Set<Integer>> copyMap = (Map)warNorthDao.copies.computeIfAbsent(northCopyModel.getSectionId(), (v) -> new HashMap());
                  Set<Integer> copyStars = (Set)copyMap.computeIfAbsent(northCopyModel.getId(), (v) -> new HashSet());
                  if (copyStars.isEmpty()) {
                     if (northCopyModel.getId() >= copyId) {
                        break;
                     }

                     copyStars.addAll(northCopyModel.getStars());
                  }
               }

               warNorthDao.updateOp();
            }
         default:
      }
   }

   public int sacrifice(List<ResourceModel> prizeList, SacrificeModel sacrificeModel, int curSacrificeCount, boolean firstGot) {
      int finalSacrificeCount = curSacrificeCount;
      String[] floorNumArr = ApplicationContextProvider.getConfigString("sacrificeFloorNum", "15").split("\\|");
      int floorNum = Integer.parseInt(floorNumArr[0]);
      Map<Integer, Map<Integer, SacrificeLibModel>> allSacrificeLibModelMap = ApplicationContextProvider.<Integer, Map<Integer, SacrificeLibModel>>getModelPoolMap("customSacrificeLib");

      for(int sacrificeCount = 1; sacrificeCount <= sacrificeModel.getTimes(); ++sacrificeCount) {
         ++finalSacrificeCount;
         int floorLibId = sacrificeModel.getOrdinaryLib();
         if (finalSacrificeCount >= floorNum) {
            floorLibId = sacrificeModel.getFloorLib();
            finalSacrificeCount = 0;
         } else if (!firstGot) {
            firstGot = true;
            int stampFirstGet = ApplicationContextProvider.getConfigInt("stampFirstGet", 1791);
            prizeList.add(new ResourceModel(2, stampFirstGet, 1));
            continue;
         }

         Map<Integer, SacrificeLibModel> sacrificeLibModelMap = (Map)allSacrificeLibModelMap.get(floorLibId);
         int totalRate = sacrificeLibModelMap.values().stream().mapToInt(SacrificeLibModel::getRate).sum();
         int randomInt = RandomUtil.randInt(totalRate);
         int curRate = 0;
         SacrificeLibModel prizeModel = null;

         for(SacrificeLibModel sacrificeLibModel : sacrificeLibModelMap.values()) {
            curRate += sacrificeLibModel.getRate();
            if (curRate > randomInt) {
               prizeModel = sacrificeLibModel;
               break;
            }
         }

         if (prizeModel != null) {
            StampModel stampModel = (StampModel)ApplicationContextProvider.getModelPoolEntity("Stamp", prizeModel.getItemId());
            if (stampModel != null && stampModel.getQuality() >= 5) {
               finalSacrificeCount = 0;
            }

            prizeList.add(new ResourceModel(prizeModel.getItemType(), prizeModel.getItemId(), prizeModel.getItemNum()));
         }
      }

      return finalSacrificeCount;
   }

   public int getTotalStar() {
      WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
      int totalStar = 0;

      for(Map.Entry<Integer, Map<Integer, Set<Integer>>> entry : warNorthDao.copies.entrySet()) {
         totalStar += (entry.getValue()).values().stream().mapToInt(Set::size).sum();
      }

      return totalStar;
   }
}
