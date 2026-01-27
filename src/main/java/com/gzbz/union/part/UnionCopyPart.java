package com.gzbz.union.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import cn.hutool.core.util.NumberUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.BattleDao;
import com.gzbz.db.HouseKeeperDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.HouseKeeperData;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.UnionBuffModel;
import com.gzbz.model.UnionCopyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.UnionMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.bean.PlayerUnionExtend;
import com.gzbz.unionOffer.OfferMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class UnionCopyPart extends UnionPart {
   @Autowired
   private OfferMgr offerMgr;
   @Autowired
   private WorldMgr worldMgr;
   private final List<ResourceModel> guanJiaTaskRewards = new ArrayList();

   @MsgHandlerAnno
   public void C2S_UnionUpgradeBuff_6951(UnionMsg.C2S_UnionUpgradeBuff_6951 msg, String source) {
      PlayerDao playerDao = this.player.getPlayerDao();
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else {
            UnionMgr unionMgr = super.getUnionMgr();
            UnionDao unionDao = unionMgr.getUnion();
            UnionBuffModel currentLevelModel = (UnionBuffModel)ApplicationContextProvider.getModelPoolEntity("unionBuff", unionDao.copyBuffLv);
            if (currentLevelModel == null) {
               this.sendUpgradeBuffResult(0, unionDao.copyBuffLv, "提升buff等级失败,buff配置不存在,玩家{}", this.player.getPlayerId());
            } else {
               long currentTime = System.currentTimeMillis();
               if (unionDao.copyBuffTime <= currentTime) {
                  unionDao.copyBuffLv = 0;
                  unionDao.copyBuffTime = currentTime;
                  unionDao.updateOp();
               }

               UnionBuffModel nextLevelModel = (UnionBuffModel)ApplicationContextProvider.getModelPoolEntity("unionBuff", unionDao.copyBuffLv + 1);
               if (nextLevelModel == null) {
                  this.sendUpgradeBuffResult(26, unionDao.copyBuffLv, "提升buff等级失败,玩家{}buff已达最高级", this.player.getPlayerId());
               } else {
                  this.player.pushTask(() -> {
                     if ((long)currentLevelModel.getUpgrade() > playerDao.gold) {
                        this.sendUpgradeBuffResult(31, unionDao.copyBuffLv, "提升buff等级失败,玩家{}元宝不足{}", this.player.getPlayerId(), currentLevelModel.getUpgrade());
                     } else {
                        this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)currentLevelModel.getUpgrade(), 9, 916, PlayerDefine.PLAYER_GOLD, currentLevelModel.getUpgrade(), "");
                        GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
                        guanJiaPart.checkState(1471, (List)null);
                        this.unionMgrParent.pushTask(() -> {
                           long copyBuffTime = unionDao.copyBuffTime;
                           int finalCopyBuffLv = unionDao.copyBuffLv;
                           if (copyBuffTime <= currentTime) {
                              finalCopyBuffLv = 0;
                              copyBuffTime = currentTime;
                           }

                           ++finalCopyBuffLv;
                           UnionBuffModel finalLevelModel = (UnionBuffModel)ApplicationContextProvider.getModelPoolEntity("unionBuff", finalCopyBuffLv);
                           if (finalLevelModel != null) {
                              long addTime = (long)(finalLevelModel.getAddTime() * 60 * 60 * 1000);
                              unionDao.copyBuffTime = copyBuffTime + addTime;
                              unionDao.copyBuffLv = finalCopyBuffLv;
                              unionDao.updateOp();
                              unionMgr.sendUnionCopyInfo();
                           }

                           unionMgr.addLog(playerDao.unionId, 7, playerDao.playerName);
                           this.sendUpgradeBuffResult(1, unionDao.copyBuffLv, (String)null);
                        });
                        this.finishActivateTaskForAllMember();
                     }
                  });
               }
            }
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_UnionCopyInfo_6981(UnionMsg.C2S_UnionCopyInfo_6981 msg, String source) {
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else {
            this.player.sendMsg(super.getUnionMgr().buildUnionCopyMsg().build());
         }
      });
   }

   public int enterBattle(BattleDao battleDao) {
      BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
      if (!this.checkJoin()) {
         return 23;
      } else {
         UnionMgr unionMgr = super.getUnionMgr();
         UnionMemberDao unionMemberDao = super.getUnionMember();
         if (battleDao.isSkip && !unionMemberDao.copyDamage.containsKey(battleDao.modelId)) {
            return 9021;
         } else {
            PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);
            int copyFreeCount = ApplicationContextProvider.getConfigInt("unionCopyFreeChallenge", 0);
            if (playerUnionExtend.copyChallengeCount >= copyFreeCount + playerUnionExtend.copyChallengeBuyCount) {
               return 9016;
            } else {
               this.unionMgrParent.pushTask(() -> {
                  UnionDao unionDao = unionMgr.getUnion();
                  if (unionDao.copyId != battleDao.modelId) {
                     battlePart.pushTaskEx("sendBattleResult", new Object[]{battleDao.type, true, 9011});
                  } else {
                     UnionCopyModel challengeCopyModel = (UnionCopyModel)ApplicationContextProvider.getModelPoolEntity("unionCopy", battleDao.modelId);
                     UnionBuffModel buffModel = null;
                     if (unionDao.copyBuffTime > System.currentTimeMillis()) {
                        buffModel = (UnionBuffModel)ApplicationContextProvider.getModelPoolEntity("unionBuff", unionDao.copyBuffLv);
                     }

                     if (buffModel != null) {
                        battleDao.scene.getPKTeam((byte)0).getEntityMap().values().forEach((entityx) -> entityx.modifyBaseProperty(buffModel.getProperties()));
                     }

                     BattlePKTeam right = new BattlePKTeam(challengeCopyModel.getBattle());

                     for(Entity entity : right.getEntityMap().values()) {
                        entity.setBaseProperty(99, unionDao.masterHp);
                     }

                     battleDao.scene.setBattleId(challengeCopyModel.getBattle());
                     battleDao.scene.addPKTeam((byte)1, right);
                     battleDao.scene.setMaxRound((byte)challengeCopyModel.getRounds());
                     battleDao.beforeHp = unionDao.masterHp;
                     battleDao.updateOp();
                     this.player.pushTask(() -> battlePart.beginBattle(battleDao));
                     this.player.getOperationMgr().addCopyLog(this.player, challengeCopyModel.getId(), "军团副本");
                  }
               });
               return 1;
            }
         }
      }
   }

   public int afterFight(BattleDao battleDao) {
      if (!this.checkJoin()) {
         return 23;
      } else {
         PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);
         int copyFreeCount = ApplicationContextProvider.getConfigInt("unionCopyFreeChallenge", 0);
         if (playerUnionExtend.copyChallengeCount >= copyFreeCount + playerUnionExtend.copyChallengeBuyCount) {
            return 9016;
         } else {
            GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
            guanJiaPart.checkState(1470, (List)null);
            UnionMgr unionMgr = super.getUnionMgr();
            UnionMemberDao unionMemberDao = super.getUnionMember();
            int copyId = battleDao.modelId;
            UnionCopyModel challengeCopyModel = (UnionCopyModel)ApplicationContextProvider.getModelPoolEntity("unionCopy", copyId);
            long currentCopyDamage = (Long)unionMemberDao.copyDamage.getOrDefault(copyId, 0L);
            BattleMsg.S2C_Battle_Result.Builder result;
            if (battleDao.isSkip && unionMemberDao.lastCopyBattle != null) {
               result = unionMemberDao.getLastCopyBattle().toBuilder();
            } else {
               result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
               result.setResult(0);
               BattlePKTeam rightTeam = battleDao.scene.getPKTeam((byte)1);
               unionMemberDao.lastCopyBattle = result.build().toByteArray();
               unionMemberDao.copyLastDamage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
               this.player.triggerTask(312, 0, unionMemberDao.copyLastDamage, 0);
               long curHp = 0L;

               for(Entity entity : rightTeam.getEntityMap().values()) {
                  curHp += entity.getBaseProperty(99);
               }

               unionMemberDao.copyLastAttackHp = Math.max(0L, battleDao.beforeHp - curHp);
            }

            List<ResourceModel> rewardList = new ArrayList();
            ResourceModel.addResourceToList(rewardList, new ResourceModel(1, PlayerDefine.PLAYER_UNION_CONTRIBUTION, challengeCopyModel.getAttContribution()));
            ResourceModel.addResourceToList(rewardList, new ResourceModel(1, PlayerDefine.PLAYER_COPPER, challengeCopyModel.getAttCopper()));
            battleDao.rewards.addAll(rewardList);
            battleDao.updateOp();
            rewardList.forEach((r) -> result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(r.getType()).setId(r.getId()).setNum(r.getValue())));
            battleDao.scene.getBattleMsg().setResult(result);
            ++playerUnionExtend.copyChallengeCount;
            this.player.updatePlayerExtend(9);
            this.player.triggerTask(107, 0, 1L, 1);
            currentCopyDamage += unionMemberDao.copyLastDamage;
            if (currentCopyDamage > 0L) {
               RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
               rankPart.updateRank(RankDefine.RankModule.UNION_COPY, currentCopyDamage, false, String.valueOf(unionMemberDao.unionId), String.valueOf(copyId));
            }

            unionMemberDao.copyDamage.put(copyId, currentCopyDamage);
            unionMemberDao.updateOp();
            unionMgr.sendMember(this.player);
            this.player.notifyPlayerData(PlayerDefine.UNION_COPY_CHALLENGE, playerUnionExtend.copyChallengeCount);
            String copyDamageText = this.numberFormat(currentCopyDamage);
            long finalCopyLastDamage = unionMemberDao.copyLastDamage;
            this.unionMgrParent.pushTask(() -> {
               WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
               WorldDao<HashSet<Integer>> worldDao = worldMgr.<HashSet<Integer>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_UNION_COPY);
               if (!((HashSet)worldDao.jsonData).contains(this.player.getPlayerId())) {
                  ((HashSet)worldDao.jsonData).add(this.player.getPlayerId());
                  worldDao.updateOp();
               }

               UnionDao unionDao = unionMgr.getUnion();
               ++unionDao.todayCopyChallenge;
               unionDao.copyChallenge.put(this.player.getPlayerId(), (Integer)unionDao.copyChallenge.getOrDefault(this.player.getPlayerId(), 0) + 1);
               unionDao.updateOp();
               PlayerDao playerDao = this.player.getPlayerDao();
               if (!battleDao.isSkip) {
                  unionMgr.addLog(playerDao.unionId, 6, playerDao.playerName, challengeCopyModel.getSectionId(), unionDao.copyChallenge.getOrDefault(this.player.getPlayerId(), 0), copyDamageText);
               } else {
                  unionMgr.addLog(playerDao.unionId, 8, playerDao.playerName, copyDamageText);
               }

               boolean isPass = false;
               if (unionDao.copyId == copyId) {
                  unionDao.masterHp = Math.max(0L, unionDao.masterHp - unionMemberDao.copyLastAttackHp);
                  unionDao.updateOp();
                  if (unionDao.masterHp <= 0L || battleDao.scene.getWinForce() == 0) {
                     unionMgr.addLog(playerDao.unionId, 9, playerDao.playerName, challengeCopyModel.getSectionId());
                     isPass = true;
                     unionMgr.copyPass(challengeCopyModel);
                     unionMgr.copyDamageRankReward(challengeCopyModel);
                     unionMgr.sendUnion((GamePlayer)null);
                     unionMgr.broadcastMembers();
                     this.player.pushTask(() -> {
                        Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
                        TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_UNION_COPY_KILL);
                        CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
                        MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
                        List<ResourceModel> killRewards = new ArrayList();
                        killRewards.add(new ResourceModel(1, PlayerDefine.PLAYER_UNION_CONTRIBUTION, challengeCopyModel.getKillContribution()));
                        mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), killRewards, 604800000L, 9, 919);
                        unionMemberDao.lastCopyBattle = null;
                        unionMemberDao.updateOp();
                        this.player.triggerTask(214, 0, 1L, 1);
                     });
                  }

                  unionMgr.sendUnionCopyInfo();
               }

               this.sendChallengeResult(1, copyId, unionDao.masterHp < 0L ? 0L : unionDao.masterHp, isPass, (String)null);
               this.player.getOperationMgr().addExtraLog(this.player, 113, unionDao.unionName, String.valueOf(copyId), String.valueOf(finalCopyLastDamage));
            });
            this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "军团敌将", "1");
            return 1;
         }
      }
   }

   private String numberFormat(long number) {
      BigDecimal bigDecimal1 = NumberUtil.pow(10, 4);
      if (bigDecimal1.longValue() > number) {
         return String.valueOf(number);
      } else {
         BigDecimal bigDecimal2 = NumberUtil.pow(10, 8);
         if (bigDecimal2.longValue() > number) {
            LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "UnionHarmlog1");
            return number / bigDecimal1.longValue() + (languageModel == null ? "万" : languageModel.getValue());
         } else {
            BigDecimal bigDecimal3 = NumberUtil.pow(10, 12);
            if (bigDecimal3.longValue() > number) {
               LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "UnionHarmlog2");
               return number / bigDecimal2.longValue() + (languageModel == null ? "亿" : languageModel.getValue());
            } else {
               LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "UnionHarmlog3");
               return number / bigDecimal3.longValue() + (languageModel == null ? "万亿" : languageModel.getValue());
            }
         }
      }
   }

   public void endBattle(BattleDao battleDao) {
      this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 9, 918, battleDao.modelId, 0, "");
      battleDao.rewards.clear();
   }

   @MsgHandlerAnno
   public void C2S_UnionChallengeBuy_6955(UnionMsg.C2S_UnionChallengeBuy_6955 msg, String source) {
      int copyId = msg.getCopyId();
      if (!this.checkJoin()) {
         this.player.failure(23);
      } else {
         PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);
         String unionCopyBuyChallenge = ApplicationContextProvider.getConfigString("unionCopyBuyChallenge", "");
         String[] countArr = unionCopyBuyChallenge.split("\\|");
         Map<Integer, Integer> buyChallengeMap = new HashMap();

         for(String countStr : countArr) {
            String[] feeArr = countStr.split(":");
            if (feeArr.length == 2) {
               buyChallengeMap.put(Integer.parseInt(feeArr[0]), Integer.parseInt(feeArr[1]));
            }
         }

         int copyFreeCount = ApplicationContextProvider.getConfigInt("unionCopyFreeChallenge", 0);
         if (playerUnionExtend.copyChallengeBuyCount >= buyChallengeMap.size()) {
            this.player.failure(9016);
         } else if (playerUnionExtend.copyChallengeCount < copyFreeCount + playerUnionExtend.copyChallengeBuyCount) {
            this.player.failure(42);
         } else {
            PlayerDao playerDao = this.player.getPlayerDao();
            int needFeeNum = playerUnionExtend.copyChallengeBuyCount + 1;
            Integer needFee = (Integer)buyChallengeMap.get(needFeeNum);
            if ((long)needFee > playerDao.gold) {
               this.player.failure(31);
            } else {
               this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)needFee, 9, 917, PlayerDefine.PLAYER_GOLD, needFee, "");
               ++playerUnionExtend.copyChallengeBuyCount;
               this.player.updatePlayerExtend(9);
               this.player.notifyPlayerData(PlayerDefine.UNION_COPY_BUY, playerUnionExtend.copyChallengeBuyCount);
               this.sendChallengeBuyResult(1, copyId, (String)null);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionCopyMass_6971(UnionMsg.C2S_UnionCopyMass_6971 msg, String source) {
      int copyId = msg.getCopyId();
      PlayerDao playerDao = this.player.getPlayerDao();
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else {
            UnionMgr unionMgr = super.getUnionMgr();
            UnionDao unionDao = unionMgr.getUnion();
            if (unionDao.copyId != copyId) {
               this.player.failure(9011);
            } else {
               int cdTime = ApplicationContextProvider.getConfigInt("unionAssembleCD", Integer.MAX_VALUE);
               unionDao.massCDTime = (long)(cdTime * 60 * 60 * 1000) + System.currentTimeMillis();
               unionDao.updateOp();
               unionMgr.sendUnionCopyInfo();
               UnionMsg.S2C_UnionCopyMass_6972.Builder resp = UnionMsg.S2C_UnionCopyMass_6972.newBuilder();
               resp.setCopyId(copyId);
               this.player.sendMsg(resp.build());
               ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
               LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "UnionCopyAssembly");
               String content = MessageFormat.format(languageModel.getValue(), playerDao.playerName);
               chatMgr.sendUnionSystem(unionDao.unionId, content, 3);
            }
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_UnionCopyRankWorshipInfo_6983(UnionMsg.C2S_UnionCopyRankWorshipInfo_6983 msg, String source) {
      if (!this.checkJoin()) {
         this.player.failure(23);
      } else {
         UnionMsg.S2C_UnionCopyRankWorshipInfo_6984.Builder resp = UnionMsg.S2C_UnionCopyRankWorshipInfo_6984.newBuilder();
         super.getUnionMember().worships.forEach(resp::addMemberId);
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionCopyRankWorship_6985(UnionMsg.C2S_UnionCopyRankWorship_6985 msg, String source) {
      int memberId = msg.getMemberId();
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else {
            UnionMgr unionMgr = super.getUnionMgr();
            UnionMemberDao unionMemberDao = super.getUnionMember();
            if (unionMgr.getUnionMember(memberId) == null) {
               this.player.failure(9035);
            } else {
               int maxCount = ApplicationContextProvider.getConfigInt("unionCopyHurtRankLikeNum", 3);
               if (unionMemberDao.worships.size() >= maxCount) {
                  this.player.failure(9022);
               } else if (unionMemberDao.worships.contains(memberId)) {
                  this.player.failure(9023);
               } else {
                  unionMemberDao.worships.add(memberId);
                  unionMemberDao.updateOp();
                  String[] rewardArr = ApplicationContextProvider.getConfigString("unionCopyHurtRankLikeReward", "").split("\\|");
                  this.player.addResource(Integer.parseInt(rewardArr[0]), Integer.parseInt(rewardArr[1]), Integer.parseInt(rewardArr[2]), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 9, 926, memberId, 0, "");
                  UnionMsg.S2C_UnionCopyRankWorship_6986.Builder resp = UnionMsg.S2C_UnionCopyRankWorship_6986.newBuilder();
                  resp.setMemberId(memberId);
                  this.player.sendMsg(resp.build());
                  unionMgr.sendWorshipList((GamePlayer)null);
               }
            }
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_UnionCopyRankWorshipList_6987(UnionMsg.C2S_UnionCopyRankWorshipList_6987 msg, String source) {
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else {
            super.getUnionMgr().sendWorshipList(this.player);
         }
      });
   }

   private void sendUpgradeBuffResult(int code, int level, String message, Object... args) {
      if (code != 1) {
      }

      UnionMsg.S2C_UnionUpgradeBuff_6952.Builder msg = UnionMsg.S2C_UnionUpgradeBuff_6952.newBuilder();
      msg.setResult(code);
      msg.setLevel(level);
      this.player.sendMsg(msg.build());
   }

   private void sendChallengeResult(int code, int copyId, long hp, boolean isPass, String message, Object... args) {
      if (code != 1) {
      }

      UnionMsg.S2C_UnionChallenge_6954.Builder msg = UnionMsg.S2C_UnionChallenge_6954.newBuilder();
      msg.setResult(code);
      msg.setHp(hp);
      msg.setCopyId(copyId);
      msg.setIsPass(isPass);
      this.player.sendMsg(msg.build());
   }

   private void sendChallengeBuyResult(int code, int copyId, String message, Object... args) {
      if (code != 1) {
      }

      UnionMsg.S2C_UnionChallengeBuy_6956.Builder msg = UnionMsg.S2C_UnionChallengeBuy_6956.newBuilder();
      msg.setResult(code);
      msg.setCopyId(copyId);
      this.player.sendMsg(msg.build());
   }

   @TaskMethod
   public void guanJiaOperate(int systemId, int challengeCount) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_UNION_COPY);
      if (arrayingMirror == null) {
         guanJiaPart.checkState(systemId, (List)null);
      } else {
         int copyFreeCount = ApplicationContextProvider.getConfigInt("unionCopyFreeChallenge", 0);
         this.unionMgrParent.pushTask(() -> {
            if (!this.checkJoin()) {
               guanJiaPart.checkState(systemId, (List)null);
            } else {
               this.player.pushTask(() -> {
                  String unionCopyBuyChallenge = ApplicationContextProvider.getConfigString("unionCopyBuyChallenge", "");
                  String[] countArr = unionCopyBuyChallenge.split("\\|");
                  Map<Integer, Integer> buyChallengeMap = new HashMap();

                  for(String countStr : countArr) {
                     String[] feeArr = countStr.split(":");
                     if (feeArr.length == 2) {
                        buyChallengeMap.put(Integer.parseInt(feeArr[0]), Integer.parseInt(feeArr[1]));
                     }
                  }

                  PlayerDao playerDao = this.player.getPlayerDao();
                  PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);
                  if (playerUnionExtend.copyChallengeCount > 0) {
                     guanJiaPart.checkState(systemId, (List)null);
                  } else if (challengeCount >= 1 && challengeCount <= buyChallengeMap.size() + copyFreeCount) {
                     BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
                     BattleDao battleDao = battlePart.getBattleDao(1470);
                     if (battleDao != null && battleDao.stream != null && battleDao.stream.length > 0) {
                        guanJiaPart.checkState(systemId, (List)null);
                     } else {
                        int feeCount = challengeCount - copyFreeCount;
                        if (feeCount > 0) {
                           int totalFee = 0;

                           for(int buyCount = 1; buyCount <= feeCount; ++buyCount) {
                              totalFee += (Integer)buyChallengeMap.get(buyCount);
                           }

                           if ((long)totalFee > playerDao.gold) {
                              guanJiaPart.checkState(systemId, (List)null);
                              return;
                           }

                           this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)totalFee, 9, 917, feeCount, 0, "");
                           playerUnionExtend.copyChallengeBuyCount += feeCount;
                        }

                        playerUnionExtend.copyChallengeCount += challengeCount;
                        this.player.updatePlayerExtend(9);
                        this.player.notifyPlayerData(PlayerDefine.UNION_COPY_CHALLENGE, playerUnionExtend.copyChallengeCount);
                        this.player.notifyPlayerData(PlayerDefine.UNION_COPY_BUY, playerUnionExtend.copyChallengeBuyCount);
                        super.getUnionMgr().sendMember(this.player);
                        HeroRankMgr heroRankMgr = (HeroRankMgr)ApplicationContextProvider.getContext().getBean(HeroRankMgr.class);
                        BattlePKTeam leftTeam = new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, heroRankMgr.getHeroRankCompensate(arrayingMirror, this.player.isRobot()));
                        if (this.getUnion().copyBuffTime > System.currentTimeMillis()) {
                           UnionBuffModel buffModel = (UnionBuffModel)ApplicationContextProvider.getModelPoolEntity("unionBuff", this.getUnion().copyBuffLv);
                           if (buffModel != null) {
                              leftTeam.getEntityMap().values().forEach((entity) -> entity.modifyBaseProperty(buffModel.getProperties()));
                           }
                        }

                        for(int i = 0; i < challengeCount; ++i) {
                           this.unionMgrParent.pushTask(() -> {
                              UnionDao unionDao = this.getUnion();
                              long beforeHp = unionDao.masterHp;
                              int copyId = unionDao.copyId;
                              UnionMgr unionMgr = super.getUnionMgr();
                              UnionMemberDao unionMemberDao = super.getUnionMember();
                              UnionCopyModel challengeCopyModel = (UnionCopyModel)ApplicationContextProvider.getModelPoolEntity("unionCopy", copyId);
                              if (unionMemberDao.lastCopyBattle == null || unionMemberDao.copyLastDamage == 0L) {
                                 BattleScene battleScene = new BattleScene(1470, copyId);
                                 BattlePKTeam rightTeam = new BattlePKTeam(challengeCopyModel.getBattle());

                                 for(Entity entity : rightTeam.getEntityMap().values()) {
                                    entity.setBaseProperty(99, beforeHp);
                                 }

                                 battleScene.setBattleId(challengeCopyModel.getBattle());
                                 battleScene.addPKTeam(leftTeam, rightTeam);
                                 battleScene.setMaxRound((byte)challengeCopyModel.getRounds());
                                 battleScene.fight();
                                 int defPlayerId = battleScene.getBattleMsg().getTeams(1).getBeloogId();
                                 BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
                                 battleRecordMgr.addBattleRecord(1470, 0, this.player.getPlayerId(), defPlayerId, battleScene.getBattleMsg());
                                 unionMemberDao.lastCopyBattle = battleScene.getBattleMsg().getResult().toBuilder().setResult(0).build().toByteArray();
                                 unionMemberDao.copyLastDamage = battleScene.getPKTeam((byte)1).getDamageValue();
                                 long curHp = 0L;

                                 for(Entity entity : rightTeam.getEntityMap().values()) {
                                    curHp += entity.getBaseProperty(99);
                                 }

                                 unionMemberDao.copyLastAttackHp = Math.max(0L, beforeHp - curHp);
                              }

                              long currentCopyDamage = (Long)unionMemberDao.copyDamage.getOrDefault(challengeCopyModel.getId(), 0L);
                              currentCopyDamage += unionMemberDao.copyLastDamage;
                              if (currentCopyDamage > 0L) {
                                 RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
                                 rankPart.updateRank(RankDefine.RankModule.UNION_COPY, currentCopyDamage, false, String.valueOf(unionMemberDao.unionId), String.valueOf(copyId));
                              }

                              unionMemberDao.copyDamage.put(challengeCopyModel.getId(), currentCopyDamage);
                              unionMemberDao.updateOp();
                              unionMgr.sendMember(this.player);
                              String copyDamageText = this.numberFormat(currentCopyDamage);
                              ++unionDao.todayCopyChallenge;
                              unionDao.copyChallenge.put(this.player.getPlayerId(), (Integer)unionDao.copyChallenge.getOrDefault(this.player.getPlayerId(), 0) + 1);
                              unionDao.updateOp();
                              unionMgr.addLog(playerDao.unionId, 6, playerDao.playerName, challengeCopyModel.getSectionId(), unionDao.copyChallenge.getOrDefault(this.player.getPlayerId(), 0), copyDamageText);
                              boolean isPass = false;
                              boolean isKill = false;
                              if (unionDao.copyId == challengeCopyModel.getId()) {
                                 unionDao.masterHp = Math.max(0L, unionDao.masterHp - unionMemberDao.copyLastAttackHp);
                                 unionDao.updateOp();
                                 isKill = unionDao.masterHp <= 0L;
                                 if (isKill) {
                                    unionMgr.addLog(playerDao.unionId, 9, playerDao.playerName, challengeCopyModel.getSectionId());
                                    isPass = true;
                                    unionMemberDao.copyLastDamage = 0L;
                                    unionMemberDao.copyLastAttackHp = 0L;
                                    unionMemberDao.lastCopyBattle = null;
                                    unionMemberDao.updateOp();
                                    unionMgr.copyPass(challengeCopyModel);
                                    unionMgr.copyDamageRankReward(challengeCopyModel);
                                    unionMgr.sendUnion((GamePlayer)null);
                                 }

                                 unionMgr.sendUnionCopyInfo();
                              }

                              long finalLastDamage = unionMemberDao.copyLastDamage;
                              this.sendChallengeResult(1, challengeCopyModel.getId(), unionDao.masterHp < 0L ? 0L : unionDao.masterHp, isPass, (String)null);
                              this.player.pushTask(() -> {
                                 this.player.triggerTask(107, 0, 1L, 1);
                                 this.player.triggerTask(312, 0, finalLastDamage, 0);
                                 this.guanJiaTaskRewards.add(new ResourceModel(1, PlayerDefine.PLAYER_UNION_CONTRIBUTION, challengeCopyModel.getAttContribution()));
                                 this.guanJiaTaskRewards.add(new ResourceModel(1, PlayerDefine.PLAYER_COPPER, challengeCopyModel.getAttCopper()));
                                 this.player.addResource(1, PlayerDefine.PLAYER_UNION_CONTRIBUTION, challengeCopyModel.getAttContribution(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 9, 918, copyId, 0, "");
                                 this.player.addResource(1, PlayerDefine.PLAYER_COPPER, challengeCopyModel.getAttCopper(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 9, 918, challengeCopyModel.getId(), 0, "");
                                 if (this.guanJiaTaskRewards.size() >= 2 * challengeCount) {
                                    List<ResourceModel> rewards = new ArrayList();

                                    for(ResourceModel guanJiaTaskReward : this.guanJiaTaskRewards) {
                                       guanJiaTaskReward.addResourceToList(rewards);
                                    }

                                    guanJiaPart.checkState(systemId, rewards);
                                    this.guanJiaTaskRewards.clear();
                                 }

                                 HouseKeeperDao houseKeeperDao = (HouseKeeperDao)this.player.getData("tb_house_keeper", this.player.getPlayerId());
                                 HouseKeeperData houseKeeperData = (HouseKeeperData)houseKeeperDao.houseKeeperDatas.get(systemId);
                                 if (houseKeeperData != null) {
                                    houseKeeperData.hurtValue += finalLastDamage;
                                 }

                                 houseKeeperDao.updateOp();
                                 this.player.getOperationMgr().addExtraLog(this.player, 113, unionDao.unionName, String.valueOf(copyId), String.valueOf(finalLastDamage));
                                 this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "军团敌将", "1");
                                 this.player.getOperationMgr().addCopyLog(this.player, copyId, "军团副本");
                                 if (isKill) {
                                    Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
                                    TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_UNION_COPY_KILL);
                                    CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
                                    MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
                                    List<ResourceModel> killRewards = new ArrayList();
                                    killRewards.add(new ResourceModel(1, PlayerDefine.PLAYER_UNION_CONTRIBUTION, challengeCopyModel.getKillContribution()));
                                    mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), killRewards, 604800000L, 9, 919);
                                    this.player.triggerTask(214, 0, 1L, 1);
                                 }

                              });
                           });
                        }

                     }
                  } else {
                     guanJiaPart.checkState(systemId, (List)null);
                  }
               });
            }
         });
      }
   }

   public void loginHandle() {
      this.guanJiaTaskRewards.clear();
   }

   public void guanJiaOperateBuff(int systemId, int count) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      PlayerDao playerDao = this.player.getPlayerDao();
      Map<Integer, UnionBuffModel> unionBuffModelMap = ApplicationContextProvider.<Integer, UnionBuffModel>getModelPoolMap("unionBuff");
      this.unionMgrParent.pushTask(() -> {
         if (this.checkJoin() && count > 0) {
            UnionMgr unionMgr = super.getUnionMgr();
            UnionDao unionDao = unionMgr.getUnion();
            long currentTime = System.currentTimeMillis();
            if (unionDao.copyBuffTime <= currentTime) {
               unionDao.copyBuffLv = 0;
               unionDao.copyBuffTime = currentTime;
               unionDao.updateOp();
            }

            int copyBuffLv = unionDao.copyBuffLv;
            TreeSet<Integer> buffIds = new TreeSet(unionBuffModelMap.keySet());
            int feeGold = 0;
            int realUp = 0;

            for(int i = 0; i < count && copyBuffLv < (Integer)buffIds.last(); ++i) {
               UnionBuffModel currentLevelModel = (UnionBuffModel)unionBuffModelMap.get(copyBuffLv);
               if (currentLevelModel == null) {
                  guanJiaPart.checkState(systemId, (List)null);
                  return;
               }

               feeGold += currentLevelModel.getUpgrade();
               ++copyBuffLv;
               ++realUp;
            }

            this.player.pushTask(() -> {
               if (realUp <= 0) {
                  guanJiaPart.checkState(systemId, (List)null);
               } else if ((long)feeGold > playerDao.gold) {
                  guanJiaPart.checkState(systemId, (List)null);
               } else {
                  this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)feeGold, 9, 916, 0, 0, "guanJia");
                  String rewardStr = ApplicationContextProvider.getConfigString("unionBuffReward", "1|17|100");
                  List<ResourceModel> rewards = ResourceModel.buildResources(rewardStr);
                  this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 9, 916, 0, 0, "guanJia");
                  guanJiaPart.checkState(systemId, rewards);
                  this.unionMgrParent.pushTask(() -> {
                     int finalCopyBuffLv = unionDao.copyBuffLv;
                     long copyBuffTime = unionDao.copyBuffTime;
                     if (unionDao.copyBuffTime <= currentTime) {
                        finalCopyBuffLv = 0;
                        copyBuffTime = currentTime;
                     }

                     for(int i = 1; i <= realUp; ++i) {
                        UnionBuffModel nextLevelModel = (UnionBuffModel)ApplicationContextProvider.getModelPoolEntity("unionBuff", finalCopyBuffLv + 1);
                        if (nextLevelModel == null) {
                           break;
                        }

                        ++finalCopyBuffLv;
                        copyBuffTime += (long)(nextLevelModel.getAddTime() * 60 * 60 * 1000);
                        unionMgr.addLog(playerDao.unionId, 7, playerDao.playerName);
                     }

                     unionDao.copyBuffLv = finalCopyBuffLv;
                     unionDao.copyBuffTime = copyBuffTime;
                     unionDao.updateOp();
                     unionMgr.sendUnionCopyInfo();
                     this.sendUpgradeBuffResult(1, unionDao.copyBuffLv, (String)null);
                  });
                  this.finishActivateTaskForAllMember();
               }
            });
         } else {
            guanJiaPart.checkState(systemId, (List)null);
         }
      });
   }

   private void finishActivateTaskForAllMember() {
      if (!this.getUnionMgr().getUnion().finishActivate) {
         this.getUnionMgr().getUnion().finishActivate = true;
         this.getUnionMgr().getUnion().updateOp();
         HashSet<GamePlayer> players = new HashSet();

         for(Integer playerId : super.getUnionMgr().getUnionMembers().keySet()) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
            if (gamePlayer != null) {
               players.add(gamePlayer);
            }
         }

         for(GamePlayer gamePlayer : players) {
            gamePlayer.pushTask(() -> gamePlayer.triggerTask(707, 0, 1L, 1));
         }

      }
   }
}
