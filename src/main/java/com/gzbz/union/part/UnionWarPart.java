package com.gzbz.union.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.BattleDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.model.ItemModel;
import com.gzbz.model.UnionWarBuffModel;
import com.gzbz.model.UnionWarDifficultyModel;
import com.gzbz.model.UnionWarRecordModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossUnionWarMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.UnionWarMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.bean.UnionWarAgainstData;
import com.gzbz.union.bean.UnionWarStrongholdData;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.CrossSubscribeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class UnionWarPart extends UnionPart {
   @Autowired
   private ChatMgr chatMgr;
   @Autowired
   private HeroRankMgr heroRankMgr;

   @MsgHandlerAnno
   public void C2S_WarAgainstList_9701(UnionWarMsg.C2S_WarAgainstList_9701 msg, String source) {
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else {
            UnionWarMsg.S2C_WarAgainstList_9702.Builder resp = UnionWarMsg.S2C_WarAgainstList_9702.newBuilder();
            if (this.unionMgrParent.warStatus < 2) {
               this.player.sendMsg(resp.build());
            } else {
               UnionMgr unionMgr = super.getUnionMgr();
               UnionWarAgainstData left = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(unionMgr.getUnion().unionId);
               if (left == null) {
                  this.player.sendMsg(resp.build());
               } else {
                  Set<Integer> pushIds = new HashSet();
                  pushIds.add(left.getId());
                  pushIds.add(left.getEnemy());

                  for(UnionWarAgainstData againstData : this.unionMgrParent.unionWarAgainstDataMap.values()) {
                     if (!pushIds.contains(againstData.getId()) && !pushIds.contains(againstData.getEnemy()) && againstData.getEnemy() > 0) {
                        UnionWarAgainstData right = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(againstData.getEnemy());
                        if (right != null) {
                           UnionWarMsg.WarAgainstData.Builder builder = UnionWarMsg.WarAgainstData.newBuilder();
                           builder.setLeft(unionMgr.buildWarAgainstUnionData(againstData, right.getStar()));
                           builder.setRight(unionMgr.buildWarAgainstUnionData(right, againstData.getStar()));
                           resp.addAgainstList(builder);
                           pushIds.add(againstData.getId());
                           pushIds.add(againstData.getEnemy());
                        }
                     }
                  }

                  this.player.sendMsg(resp.build());
               }
            }
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_WarInfo_9703(UnionWarMsg.C2S_WarInfo_9703 msg, String source) {
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else {
            UnionWarMsg.S2C_WarInfo_9704.Builder resp = UnionWarMsg.S2C_WarInfo_9704.newBuilder();
            if (this.unionMgrParent.warStatus == 0) {
               resp.setStatus(0);
               resp.setBuffLv(0);
               this.player.sendMsg(resp.build());
            } else {
               UnionMgr unionMgr = super.getUnionMgr();
               if (!unionMgr.warIsMatch) {
                  resp.setStatus(-1);
                  resp.setBuffLv(0);
                  this.player.sendMsg(resp.build());
               } else {
                  resp.setStatus(this.unionMgrParent.warStatus);
                  UnionDao unionDao = unionMgr.getUnion();
                  UnionWarAgainstData left = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(unionDao.unionId);
                  if (left != null && left.getEnemy() > 0) {
                     UnionWarAgainstData right = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(left.getEnemy());
                     if (right == null) {
                        resp.setStatus(-1);
                        resp.setBuffLv(0);
                        this.player.sendMsg(resp.build());
                     } else {
                        UnionWarMsg.WarAgainstData.Builder builder = UnionWarMsg.WarAgainstData.newBuilder();
                        builder.setLeft(unionMgr.buildWarAgainstUnionData(left, unionDao.getWarStrongholdCurrentStar()));
                        int enemyStar = left.getStrongholdDataMap().values().stream().mapToInt(UnionWarStrongholdData::getMaxStar).sum();
                        builder.setRight(unionMgr.buildWarAgainstUnionData(right, enemyStar));
                        resp.setOurAgainstData(builder);
                        resp.setBuffLv(unionDao.warBuffLv);
                        right.getStrongholdDataMap().forEach((key, value) -> resp.addMyStrongholdList(unionMgr.buildWarStrongholdData(key, value, false)));
                        this.player.sendMsg(resp.build());
                     }
                  } else {
                     resp.setStatus(-1);
                     resp.setBuffLv(0);
                     this.player.sendMsg(resp.build());
                  }
               }
            }
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_WarStrongholdList_9705(UnionWarMsg.C2S_WarStrongholdList_9705 msg, String source) {
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else {
            int size = msg.getSize();
            UnionWarMsg.S2C_WarStrongholdList_9706.Builder resp = UnionWarMsg.S2C_WarStrongholdList_9706.newBuilder();
            resp.setSize(size);
            UnionMgr unionMgr = super.getUnionMgr();
            UnionWarAgainstData left = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(unionMgr.getUnion().unionId);
            if (left == null) {
               this.player.sendMsg(resp.build());
            } else {
               if (size == 1) {
                  left.getStrongholdDataMap().forEach((key, value) -> resp.addInfoList(unionMgr.buildWarStrongholdData(key, value, true)));
               } else if (size == 2) {
                  UnionWarAgainstData right = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(left.getEnemy());
                  if (right == null) {
                     this.player.sendMsg(resp.build());
                     return;
                  }

                  right.getStrongholdDataMap().forEach((key, value) -> resp.addInfoList(unionMgr.buildWarStrongholdData(key, value, false)));
               }

               this.player.sendMsg(resp.build());
            }
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_WarAttackLogs_9707(UnionWarMsg.C2S_WarAttackLogs_9707 msg, String source) {
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else {
            UnionMgr unionMgr = super.getUnionMgr();
            unionMgr.sendWarAttackLogs(this.player);
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_WarBox_9709(UnionWarMsg.C2S_WarBox_9709 msg, String source) {
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else {
            UnionMgr unionMgr = super.getUnionMgr();
            this.player.sendMsg(unionMgr.buildWarBoxListMsg());
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_WarGetBox_9711(UnionWarMsg.C2S_WarGetBox_9711 msg, String source) {
      int boxPosition = msg.getBoxPosition();
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else if (this.unionMgrParent.warStatus != 4) {
            this.player.failure(0);
         } else {
            UnionMgr unionMgr = super.getUnionMgr();
            if (unionMgr.getWarBoxId() > 0 && unionMgr.getWarBoxSize() > 0) {
               UnionDao unionDao = unionMgr.getUnion();
               UnionWarAgainstData myData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(unionDao.unionId);
               if (myData == null) {
                  this.player.failure(9026);
               } else if (myData.getStrongholdDataMap().values().stream().noneMatch((warStrongholdData) -> warStrongholdData.getId() == this.player.getPlayerId())) {
                  this.player.failure(9029);
               } else if (unionDao.warBoxes.containsKey(this.player.getPlayerId())) {
                  this.player.failure(24);
               } else if (unionDao.warBoxes.values().stream().anyMatch((value) -> value == boxPosition)) {
                  this.player.failure(9030);
               } else if (boxPosition >= 1 && boxPosition <= unionMgr.getWarBoxSize()) {
                  unionDao.warBoxes.put(this.player.getPlayerId(), boxPosition);
                  unionDao.updateOp();
                  ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", unionMgr.getWarBoxId());
                  ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                  List<ResourceModel> resourceModelList = itemBagPart.getResourcesByUseFun(itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue(), 1);
                  this.player.pushTask(() -> this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 9, 930, unionMgr.getWarBoxId(), 1, ""));
                  this.getUnionMember().warBox.clear();
                  this.getUnionMember().warBox.addAll(resourceModelList);
                  this.getUnionMember().updateOp();
                  UnionWarMsg.S2C_WarGetBox_9712.Builder resp = UnionWarMsg.S2C_WarGetBox_9712.newBuilder();
                  resp.setBox(unionMgr.buildWarBoxData(this.player.getPlayerId(), boxPosition));
                  this.player.sendMsg(resp.build());
                  unionMgr.broadcastWarBox();
               } else {
                  this.player.failure(0);
               }
            } else {
               this.player.failure(6);
            }
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_WarRankList_9713(UnionWarMsg.C2S_WarRankList_9713 msg, String source) {
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else {
            UnionMgr unionMgr = super.getUnionMgr();
            UnionWarMsg.S2C_WarRankList_9714.Builder resp = UnionWarMsg.S2C_WarRankList_9714.newBuilder();
            if (this.unionMgrParent.warStatus < 3) {
               this.player.sendMsg(resp.build());
            } else {
               unionMgr.warRank.values().forEach((unionWarRank) -> resp.addRanks(unionMgr.buildWarRank(unionWarRank)));
               this.player.sendMsg(resp.build());
            }
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_WarBattleRecordList_9719(UnionWarMsg.C2S_WarBattleRecordList_9719 msg, String source) {
      int size = msg.getSize();
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else {
            super.getUnionMgr().sendAttackRecords(size, this.player);
         }
      });
   }

   @MsgHandlerAnno
   public void CR2S_UnionWarBattle_10113(CrossUnionWarMsg.CR2S_UnionWarBattle_10113 msg, CrossSubscribeMsg crossSubscribeMsg) {
      BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
      BattleDao battleDao = battlePart.getBattleDao(1450);
      if (battleDao != null) {
         BattleMsg.S2C_BattleResult_6102 battleMsg = msg.getBattleMsg();
         battleDao.stream = battleMsg.toByteArray();
         battleDao.updateOp();
         battleDao.scene.setBattleMsg(battleMsg.toBuilder());
         this.player.sendMsg(battleMsg);
      }
   }

   public int enterBattle(BattleDao battleDao) {
      BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
      UnionMgr unionMgr = super.getUnionMgr();
      if (battleDao.params.size() != 2) {
         return 0;
      } else {
         int position = (Integer)battleDao.params.get(0);
         int star = (Integer)battleDao.params.get(1);
         Map<Integer, UnionWarDifficultyModel> unionWarDifficultyModelMap = ApplicationContextProvider.<Integer, UnionWarDifficultyModel>getModelPoolMap("unionWarDifficulty");
         if (star > unionWarDifficultyModelMap.size()) {
            return 0;
         } else {
            UnionWarRecordModel unionWarRecordModel = (UnionWarRecordModel)ApplicationContextProvider.getModelPoolEntity("unionWarRecord", position);
            if (unionWarRecordModel == null) {
               return 0;
            } else {
               this.unionMgrParent.pushTask(() -> {
                  if (!this.checkJoin()) {
                     battlePart.pushTaskEx("sendBattleResult", new Object[]{battleDao.type, true, 23});
                  } else if (this.unionMgrParent.warStatus != 3) {
                     battlePart.pushTaskEx("sendBattleResult", new Object[]{battleDao.type, true, 9024});
                  } else {
                     UnionMemberDao unionMemberDao = super.getUnionMember();
                     int freeCount = ApplicationContextProvider.getConfigInt("unionWarFreeTimes", 0);
                     if (unionMemberDao.warChallengeCount >= freeCount) {
                        battlePart.pushTaskEx("sendBattleResult", new Object[]{battleDao.type, true, 41});
                     } else {
                        UnionDao unionDao = unionMgr.getUnion();
                        UnionWarAgainstData myData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(unionDao.unionId);
                        if (myData == null) {
                           battlePart.pushTaskEx("sendBattleResult", new Object[]{battleDao.type, true, 9026});
                        } else {
                           UnionWarAgainstData enemyData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(myData.getEnemy());
                           if (enemyData == null) {
                              battlePart.pushTaskEx("sendBattleResult", new Object[]{battleDao.type, true, 0});
                           } else if (myData.getStrongholdDataMap().values().stream().noneMatch((warStrongholdDatax) -> warStrongholdDatax.getId() == this.player.getPlayerId())) {
                              battlePart.pushTaskEx("sendBattleResult", new Object[]{battleDao.type, true, 9031});
                           } else {
                              UnionWarStrongholdData warStrongholdData = (UnionWarStrongholdData)enemyData.getStrongholdDataMap().get(position);
                              if (warStrongholdData == null) {
                                 battlePart.pushTaskEx("sendBattleResult", new Object[]{battleDao.type, true, 9033});
                              } else {
                                 if (star == 0) {
                                    if (unionDao.getWarStrongholdCurrentStar(position) != unionWarDifficultyModelMap.size()) {
                                       battlePart.pushTaskEx("sendBattleResult", new Object[]{battleDao.type, true, 0});
                                       return;
                                    }

                                    int challengeCount = ApplicationContextProvider.getConfigInt("unionWarChallengeTimes", 0);
                                    if (unionDao.getWarStrongholdChallengeCount(position) >= challengeCount) {
                                       battlePart.pushTaskEx("sendBattleResult", new Object[]{battleDao.type, true, 9034});
                                       return;
                                    }
                                 } else {
                                    if (star <= 0) {
                                       battlePart.pushTaskEx("sendBattleResult", new Object[]{battleDao.type, true, 0});
                                       return;
                                    }

                                    if (unionDao.getWarStrongholdCurrentStar(position) + star > unionWarDifficultyModelMap.size()) {
                                       battlePart.pushTaskEx("sendBattleResult", new Object[]{battleDao.type, true, 9032});
                                       return;
                                    }
                                 }

                                 if (unionDao.warStrongholdFighting.containsKey(position)) {
                                    if ((Integer)unionDao.warStrongholdFighting.get(position) == this.player.getPlayerId()) {
                                       this.logger.error("战斗-->{}进入【军团争霸】,据点【{}】-【{}星】正被自己挑战中", new Object[]{this.player.getPlayerId(), warStrongholdData.getName(), star > 0 ? star : "废墟"});
                                       this.player.failure(45);
                                    } else {
                                       this.logger.error("战斗-->{}进入【军团争霸】,据点【{}】-【{}星】正被【{}】挑战中", new Object[]{this.player.getPlayerId(), warStrongholdData.getName(), star > 0 ? star : "废墟", unionDao.warStrongholdFighting.get(position)});
                                       battlePart.pushTaskEx("sendBattleResult", new Object[]{battleDao.type, true, 9036});
                                    }

                                 } else {
                                    this.logger.info("战斗-->{}进入【军团争霸】战斗,挑战据点【{}】-【{}星】", new Object[]{this.player.getPlayerId(), warStrongholdData.getName(), star > 0 ? star : "废墟"});
                                    UnionWarBuffModel unionWarBuffModel = null;
                                    if (unionDao.warBuffLv > 0) {
                                       unionWarBuffModel = (UnionWarBuffModel)ApplicationContextProvider.getModelPoolEntity("unionWarBuff", unionDao.warBuffLv + 1);
                                    }

                                    unionMgr.warStrongholdFight(position, this.player.getPlayerId());
                                    ++unionMemberDao.warChallengeCount;
                                    unionMemberDao.updateOp();
                                    unionMgr.sendMember(this.player);
                                    this.player.pushTask(() -> {
                                       try {
                                          this.warFight(battleDao, star, position, unionWarBuffModel, enemyData, unionWarRecordModel);
                                       } catch (Exception e) {
                                          e.printStackTrace();
                                       } finally {
                                          this.unionMgrParent.pushTask(() -> unionMgr.warStrongholdNoFight(position, this.player.getPlayerId()));
                                       }

                                    });
                                 }
                              }
                           }
                        }
                     }
                  }
               });
               return 1;
            }
         }
      }
   }

   public void warFight(BattleDao battleDao, int star, int position, UnionWarBuffModel unionWarBuffModel, UnionWarAgainstData enemyData, UnionWarRecordModel unionWarRecordModel) {
      UnionMgr unionMgr = super.getUnionMgr();
      BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
      Map<Integer, UnionWarDifficultyModel> unionWarDifficultyModelMap = ApplicationContextProvider.<Integer, UnionWarDifficultyModel>getModelPoolMap("unionWarDifficulty");
      battleDao.scene.setMaxRound((byte)33);
      if (unionWarBuffModel != null) {
         battleDao.scene.getPKTeam((byte)0).getEntityMap().values().forEach((entity) -> entity.modifyBaseProperty(unionWarBuffModel.getProperties()));
      }

      UnionWarStrongholdData warStrongholdData = (UnionWarStrongholdData)enemyData.getStrongholdDataMap().get(position);
      ArrayingMirror rightArrayingMirror = ArrayingMirror.toArrayingMirror(warStrongholdData.getArrayingData());
      BattlePKTeam right = new BattlePKTeam(warStrongholdData.getId(), warStrongholdData.getName(), rightArrayingMirror, warStrongholdData.getLv(), 0, 0, this.heroRankMgr.getHeroRankCompensate(rightArrayingMirror, false));
      battleDao.scene.addPKTeam((byte)1, right);
      if (star != 2 && star != 0) {
         UnionWarDifficultyModel unionWarDifficultyModel = (UnionWarDifficultyModel)unionWarDifficultyModelMap.get(star);
         if (unionWarDifficultyModel != null) {
            battleDao.scene.getPKTeam((byte)1).getEntityMap().values().forEach((entity) -> entity.modifyBaseProperty(unionWarDifficultyModel.getProperties()));
         }
      }

      if (!battlePart.beginBattle(battleDao)) {
         this.unionMgrParent.pushTask(() -> {
            if (this.getUnionMember().warChallengeCount > 0) {
               --this.getUnionMember().warChallengeCount;
               this.getUnionMember().updateOp();
               unionMgr.sendMember(this.player);
            }

         });
      } else {
         byte winForce = battleDao.scene.getWinForce();
         int record = 0;
         if (star == 0) {
            record = unionWarRecordModel.getAshe();
         }

         List<ResourceModel> resourceModels;
         if (winForce == 0) {
            resourceModels = unionWarRecordModel.getAwards();
            this.player.triggerTask(313, 0, 1L, 1);
            if (star != 0) {
               record = (Integer)unionWarRecordModel.getRecords().get(star - 1);
            }
         } else {
            resourceModels = unionWarRecordModel.getFailAward();
            if (star != 0) {
               record = unionWarRecordModel.getDefeatRecords();
            }
         }

         battleDao.rewards.clear();
         battleDao.rewards.addAll(resourceModels);
         battleDao.updateOp();
         this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 9, 932, position, star, "");
         BattleScene battleScene = battleDao.scene;
         this.unionMgrParent.pushTask(() -> unionMgr.warFightSettle(position, star, enemyData, record, this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_UNION_WAR), battleScene, this.player.getServerId()));
      }

   }

   public void endBattle(BattleDao battleDao) {
      if (battleDao != null && !battleDao.autoSettle && !battleDao.rewards.isEmpty()) {
         PlayerMsg.S2C_ItemList_2005.Builder addBuilder = PlayerMsg.S2C_ItemList_2005.newBuilder();
         addBuilder.setOldLv(this.player.getPublicDao().lv);
         addBuilder.setBillNo("");
         addBuilder.setShowType(PlayerMsg.ShowType.SHOW_TYPE_COMMON);

         for(ResourceModel reward : battleDao.rewards) {
            addBuilder.addItems(reward.builder());
         }

         this.player.sendMsg(addBuilder.build());
      }

   }
}
