package com.gzbz.rank.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.part.BroodPart;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.RankRewardDao;
import com.gzbz.db.UnionDao;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.RankRewardModel;
import com.gzbz.model.UnionCopyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.RankMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.HeroRankData;
import com.gzbz.rank.bean.PlayerRankExtend;
import com.gzbz.rank.bean.RankData;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.transport.WaterTransportMgr;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.MiscUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class RankPart extends PlayerPart {
   private final RankMgr rankMgr;
   private final WorldMgr worldMgr;
   private final UnionMgrParent unionMgrParent;
   private final ActivityMgr activityMgr;
   private final ConfigManager configManager;

   public RankPart(RankMgr rankMgr, WorldMgr worldMgr, UnionMgrParent unionMgrParent, ActivityMgr activityMgr, ConfigManager configManager) {
      this.rankMgr = rankMgr;
      this.worldMgr = worldMgr;
      this.unionMgrParent = unionMgrParent;
      this.activityMgr = activityMgr;
      this.configManager = configManager;
   }

   @MsgHandlerAnno
   public void C2S_UnionCopyRank_8801(RankMsg.C2S_UnionCopyRank_8801 msg, String source) {
      int copyId = msg.getCopyId();
      PlayerPublicDao playerDao = this.player.getPublicDao();
      RankMsg.S2C_UnionCopyRank_8802.Builder resp = RankMsg.S2C_UnionCopyRank_8802.newBuilder();
      if (playerDao.unionId <= 0) {
         this.player.sendMsg(resp.build());
      } else {
         UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(playerDao.unionId);
         if (unionMgr == null) {
            this.player.sendMsg(resp.build());
         } else {
            this.rankMgr.pushTask(() -> {
               resp.setMyRank(this.buildPlayerRankDataMsg(new RankData(this.getScore(RankDefine.RankModule.UNION_COPY, String.valueOf(playerDao.unionId), String.valueOf(copyId)), this.getRank(RankDefine.RankModule.UNION_COPY, String.valueOf(playerDao.unionId), String.valueOf(copyId)), this.player.getPlayerId())));
               resp.addAllRanks(this.buildRankListDataMsg(RankDefine.RankModule.UNION_COPY, unionMgr.getUnionMembers().size(), String.valueOf(playerDao.unionId), String.valueOf(copyId)));
               resp.setCopyId(copyId);
               TreeMap<Integer, UnionCopyModel> copyModels = (TreeMap)ApplicationContextProvider.getModelPoolMap("customUnionCopy").get(0);
               if (copyId == (Integer)copyModels.lastKey()) {
                  resp.addAllPreRanks(this.buildRankListDataMsg(RankDefine.RankModule.UNION_COPY, unionMgr.getUnionMembers().size(), String.valueOf(playerDao.unionId), String.valueOf(copyId), "prev"));
               }

               this.player.sendMsg(resp.build());
            });
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TrainingRank_8803(RankMsg.C2S_TrainingRank_8803 msg, String source) {
      RankMsg.S2C_TrainingRank_8804.Builder resp = RankMsg.S2C_TrainingRank_8804.newBuilder();
      resp.addAllRanks(this.buildRankListDataMsg(RankDefine.RankModule.HERO_TRAINING, 100));
      resp.setMyRank(this.buildPlayerRankDataMsg(new RankData(this.getScore(RankDefine.RankModule.HERO_TRAINING), this.player.getPlayerId())));
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_KindsOfRank_8807(RankMsg.C2S_KindsOfRank_8807 msg, String source) {
      List<RankDefine.RankModule> typeList = new ArrayList();
      typeList.add(RankDefine.RankModule.COMBAT_POWER);
      typeList.add(RankDefine.RankModule.BATTLE_CHAPTER_CROSS);
      typeList.add(RankDefine.RankModule.PVP);
      typeList.add(RankDefine.RankModule.UNION_COMBAT_POWER);
      typeList.add(RankDefine.RankModule.BATTLE_TOWER);
      typeList.add(RankDefine.RankModule.UNDER_PALACE);
      typeList.add(RankDefine.RankModule.HERO_NATION_SHU);
      typeList.add(RankDefine.RankModule.HERO_NATION_WEI);
      typeList.add(RankDefine.RankModule.HERO_NATION_WU);
      typeList.add(RankDefine.RankModule.HERO_NATION_GOD);
      typeList.add(RankDefine.RankModule.HERO_NATION_DEVIL);
      UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
      unionMgrParent.updateCombatPower();
      RankMsg.S2C_KindsOfRank_8808.Builder resp = RankMsg.S2C_KindsOfRank_8808.newBuilder();
      resp.setUnionHead(0);
      resp.setUnionName("");
      this.rankMgr.pushTask(() -> {
         for(RankDefine.RankModule rankModule : typeList) {
            RankMsg.TypeRanks.Builder typeRanksBuilder = RankMsg.TypeRanks.newBuilder();
            typeRanksBuilder.setModuleId(rankModule.id);
            typeRanksBuilder.setType(rankModule.subType);
            if (rankModule.subType == RankMsg.SubType.PROGRESS) {
               this.progressTypeRanks(rankModule, typeRanksBuilder, resp);
            } else {
               this.cultivationTypeRanks(rankModule, typeRanksBuilder);
            }

            resp.addTypeRanks(typeRanksBuilder);
         }

         this.player.sendMsg(resp.build());
      });
   }

   private void progressTypeRanks(RankDefine.RankModule rankModule, RankMsg.TypeRanks.Builder typeRanksBuilder, RankMsg.S2C_KindsOfRank_8808.Builder resp) {
      for(RankData rankData : this.rankMgr.getRanks(rankModule, 1)) {
         if (rankModule == RankDefine.RankModule.UNION_COMBAT_POWER) {
            UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(rankData.value);
            if (unionMgr == null) {
               continue;
            }

            UnionDao unionDao = unionMgr.getUnion();
            if (unionDao == null) {
               continue;
            }

            rankData.value = unionDao.leaderId;
            if (rankData.rank == 1) {
               resp.setUnionHead(MiscUtil.getHiParam(unionDao.head));
               resp.setUnionName(unionDao.unionName);
            }
         }

         RankMsg.RankData rankMsg = this.buildPlayerRankDataMsg(rankData);
         if (rankMsg != null) {
            typeRanksBuilder.addRands(rankMsg);
         }
      }

   }

   private void cultivationTypeRanks(RankDefine.RankModule rankModule, RankMsg.TypeRanks.Builder typeRanksBuilder) {
      List<HeroRankData> nationHeroRanks = this.rankMgr.getNationHeroRanks(rankModule.id - 60, 1);
      if (!nationHeroRanks.isEmpty()) {
         RankMsg.RankData rankMsg = this.buildPlayerRankDataMsg((RankData)nationHeroRanks.get(0));
         if (rankMsg == null) {
            return;
         }

         typeRanksBuilder.addRands(rankMsg.toBuilder().setRank(1));
      }

   }

   @MsgHandlerAnno
   public void C2S_RankModule_8809(RankMsg.C2S_RankModule_8809 msg, String source) {
      int moduleId = msg.getModuleId();
      int limitCount = msg.hasLimit() ? Math.min(msg.getLimit(), 100) : 100;
      RankDefine.RankModule module = RankDefine.getRankModule(moduleId);
      if (module == null) {
         this.logger.info("找不到排行榜模块，moduleId={}", moduleId);
      } else {
         RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
         rankMgr.pushTask(() -> {
            if (module.isCross) {
               if (module == RankDefine.RankModule.GOLD_SHIP) {
                  WaterTransportMgr waterTransportMgr = (WaterTransportMgr)ApplicationContextProvider.getContext().getBean(WaterTransportMgr.class);
                  waterTransportMgr.requestGoldDamageRank(limitCount, this.player);
               } else if (module == RankDefine.RankModule.ACTIVITY_BROOD_RANK) {
                  BroodPart broodPart = (BroodPart)this.player.getMgrPart(BroodPart.class);
                  broodPart.requestBroodRank(this.player, module, limitCount);
               } else if (module.isPlayer) {
                  CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
                  crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
               }
            } else {
               RankMsg.S2C_RankModule_8810.Builder builder = RankMsg.S2C_RankModule_8810.newBuilder();
               builder.setModuleId(moduleId);
               builder.addAllParams(msg.getParamsList());
               if (module != RankDefine.RankModule.UNION_COMBAT_POWER && module != RankDefine.RankModule.MERGE_WAR_BOSS_UNION_DAMAGE) {
                  if (module != RankDefine.RankModule.RECRUIT_RUSH && module != RankDefine.RankModule.RECRUITMENT_RUSH && module != RankDefine.RankModule.STONE_RUSH) {
                     if (module.subType == RankMsg.SubType.CULTIVATION) {
                        RankMsg.RankData myRankMsg = null;
                        List<HeroRankData> ranks = rankMgr.getNationHeroRanks(module.id - 60, limitCount);
                        int rank = 0;

                        for(HeroRankData data : ranks) {
                           RankMsg.RankData rankMsg = this.buildHeroRankDataMsg(data);
                           if (rankMsg != null) {
                              RankMsg.RankData.Builder toBuilder = rankMsg.toBuilder();
                              ++rank;
                              toBuilder.setRank(rank);
                              builder.addRanks(toBuilder);
                              if (data.value == this.player.getPlayerId()) {
                                 myRankMsg = toBuilder.build();
                              }
                           }
                        }

                        if (myRankMsg == null) {
                           myRankMsg = this.buildHeroRankDataMsg(new HeroRankData(0L, 0, this.player.getPlayerId()));
                        }

                        builder.setMyRank(myRankMsg);
                     } else {
                        List<String> params = msg.getParamsList();
                        String[] keysAppend;
                        if (module == RankDefine.RankModule.ACTIVITY_POINT) {
                           PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
                           keysAppend = new String[params.size() + 1];
                           keysAppend[0] = (String)params.get(0);
                           keysAppend[1] = String.valueOf(((ActivityInfo)playerActivityDao.activities.getOrDefault(Integer.parseInt((String)params.get(0)), new ActivityInfo())).id);

                           for(int i = 1; i < params.size(); ++i) {
                              keysAppend[i + 1] = (String)params.get(i);
                           }
                        } else {
                           keysAppend = (String[])params.toArray(new String[0]);
                        }

                        int myRank = rankMgr.getRank(module, this.player.getPlayerId(), keysAppend);
                        RankData myRankData = new RankData(rankMgr.getScore(module, this.player.getPlayerId(), keysAppend), myRank, this.player.getPlayerId());
                        builder.setMyRank(this.buildPlayerRankDataMsg(myRankData, module));

                        for(RankData data : rankMgr.getRanks(module, limitCount, keysAppend)) {
                           RankMsg.RankData rankMsg = this.buildPlayerRankDataMsg(data, module);
                           if (rankMsg != null) {
                              builder.addRanks(rankMsg);
                           }
                        }
                     }
                  } else {
                     this.mergeRushRankHandle(module, 9999, builder);
                  }
               } else {
                  PlayerPublicDao playerDao = this.player.getPublicDao();
                  int myUnionRank = rankMgr.getRank(module, playerDao.unionId);
                  RankMsg.RankUnionData rankUnionData = this.buildUnionRankDataMsg(new RankData(rankMgr.getScore(module, playerDao.unionId), myUnionRank, playerDao.unionId));
                  if (rankUnionData != null) {
                     builder.setMyUnionRank(rankUnionData);
                  }

                  List<RankData> ranks = rankMgr.getRanks(module, limitCount);
                  ranks.forEach((datax) -> {
                     RankMsg.RankUnionData thisRankUnionData = this.buildUnionRankDataMsg(datax);
                     if (thisRankUnionData != null) {
                        builder.addUnionRanks(thisRankUnionData);
                     }

                  });
               }

               this.player.sendMsg(builder.build());
            }

         });
      }
   }

   public void mergeRushRankHandle(RankDefine.RankModule module, int limitCount, RankMsg.S2C_RankModule_8810.Builder builder) {
      List<RankData> ranks = this.rankMgr.getMergeRushRanks(module, limitCount);
      boolean hasMine = false;

      for(RankData data : ranks) {
         if (data.value == this.player.getPlayerId()) {
            builder.setMyRank(this.buildPlayerRankDataMsg(data, module));
            hasMine = true;
         }

         RankMsg.RankData rankMsg = this.buildPlayerRankDataMsg(data, module);
         if (rankMsg != null) {
            builder.addRanks(rankMsg);
         }
      }

      if (!hasMine) {
         RankData myRankData = new RankData(0L, 0, this.player.getPlayerId());
         builder.setMyRank(this.buildPlayerRankDataMsg(myRankData, module));
      }

   }

   @MsgHandlerAnno
   public void C2S_RankRewardInfo_8811(RankMsg.C2S_RankRewardInfo_8811 msg, String source) {
      int type = msg.getType();
      Map<Integer, Map<Integer, RankRewardModel>> allRankRewardMap = ApplicationContextProvider.<Integer, Map<Integer, RankRewardModel>>getModelPoolMap("customRankReward");
      if (!allRankRewardMap.containsKey(type)) {
         this.logger.error("找不到排行奖励类型:{}", type);
      } else {
         this.rankMgr.pushTask(() -> this.rankMgr.sendRankRewardInfo(this.player, type));
      }
   }

   @MsgHandlerAnno
   public void C2S_RankReward_8813(RankMsg.C2S_RankReward_8813 msg, String source) {
      int id = msg.getId();
      RankRewardModel rankRewardModel = (RankRewardModel)ApplicationContextProvider.getModelPoolEntity("rankRewards", id);
      if (rankRewardModel == null) {
         this.player.failure(0);
      } else {
         PlayerRankExtend playerRankExtend = (PlayerRankExtend)this.player.getPlayerExtend(44);
         if (playerRankExtend.rankReward.contains(id)) {
            this.player.failure(24);
         } else {
            this.rankMgr.pushTask(() -> {
               if (!this.rankMgr.isRewardFinish(rankRewardModel.getTaskType(), id)) {
                  this.player.failure(44001);
               } else {
                  this.player.pushTask(() -> {
                     playerRankExtend.rankReward.add(id);
                     this.player.updatePlayerExtend(44);
                     this.player.addResource(rankRewardModel.rewardResource(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 44, 4401, rankRewardModel.getTaskType(), rankRewardModel.getId(), "");
                     RankMsg.S2C_RankReward_8814.Builder resp = RankMsg.S2C_RankReward_8814.newBuilder();
                     resp.setId(id);
                     this.player.sendMsg(resp.build());
                  });
               }
            });
         }
      }
   }

   public void updateRank(RankDefine.RankModule module, long score, boolean higher, String... keyAppends) {
      this.rankMgr.pushTask(() -> {
         if (higher) {
            this.rankMgr.updateRankHigher(module, score, this.player.getPlayerId(), keyAppends);
         } else {
            this.rankMgr.updateRank(module, score, this.player.getPlayerId(), keyAppends);
         }

         if (!this.player.isRobot() && module == RankDefine.RankModule.PVP) {
            int rank = this.rankMgr.getRank(RankDefine.RankModule.PVP, this.player.getPlayerId());
            this.player.triggerTask(217, 0, (long)rank, -1);
         }

      });
   }

   public int getRank(RankDefine.RankModule module, String... keyAppends) {
      return this.rankMgr.getRank(module, this.player.getPlayerId(), keyAppends);
   }

   public long getScore(RankDefine.RankModule module, String... keyAppends) {
      return this.rankMgr.getScore(module, this.player.getPlayerId(), keyAppends);
   }

   public void removeRank(RankDefine.RankModule module, String... keyAppends) {
      this.rankMgr.pushTask(() -> this.rankMgr.removeRank(module, this.player.getPlayerId(), keyAppends));
   }

   public List<RankMsg.RankData> buildRankListDataMsg(RankDefine.RankModule module, int limit, String... keysAppend) {
      List<RankMsg.RankData> rankList = new ArrayList();

      for(RankData rankData : this.rankMgr.getRanks(module, limit, keysAppend)) {
         RankMsg.RankData rankMsg = this.buildPlayerRankDataMsg(rankData, module);
         if (rankMsg != null) {
            rankList.add(rankMsg);
         }
      }

      return rankList;
   }

   public RankMsg.RankData buildPlayerRankDataMsg(RankData rankData) {
      return this.buildPlayerRankDataMsg(rankData, (RankDefine.RankModule)null);
   }

   public RankMsg.RankData buildPlayerRankDataMsg(RankData rankData, RankDefine.RankModule rankModule) {
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankData.value);
      if (gamePlayer == null) {
         return null;
      } else {
         PlayerPublicDao playerDao = gamePlayer.getPublicDao();
         RankMsg.RankData.Builder randMsg = RankMsg.RankData.newBuilder();
         randMsg.setRank(rankData.rank);
         randMsg.setLevel(playerDao.lv);
         randMsg.setHead(playerDao.head);
         randMsg.setHeadFrame(playerDao.headFrame);
         if (rankModule == RankDefine.RankModule.TRAIL_TOWER) {
            randMsg.setScore((long)MiscUtil.getIntHiParam((int)rankData.score));
         } else {
            randMsg.setScore(rankData.score);
         }

         randMsg.setPlayerName(playerDao.playerName);
         randMsg.setPower(playerDao.combat_power);
         randMsg.setMonarchId(playerDao.monarchId);
         randMsg.addPlayerInfos(gamePlayer.toPropertyCellForInt64(PlayerDefine.PLAYER_COMBAT_POWER_101, playerDao.combat_power));
         randMsg.addPlayerInfos(gamePlayer.toPropertyCellForInt32(PlayerDefine.PLAYER_MONARCHID, playerDao.monarchId));
         randMsg.setPlayerId(rankData.value);
         randMsg.setServerId(gamePlayer.getServerId());
         if (playerDao.unionId > 0) {
            UnionDao unionDao = (UnionDao)this.unionMgrParent.getUnionDaoMap().get(playerDao.unionId);
            if (unionDao != null) {
               randMsg.setUnionName(unionDao.unionName);
               randMsg.setUnionId(playerDao.unionId);
            }
         }

         return randMsg.build();
      }
   }

   public RankMsg.RankData buildHeroRankDataMsg(HeroRankData rankData) {
      RankMsg.RankData randMsg = this.buildPlayerRankDataMsg(rankData);
      if (randMsg == null) {
         return null;
      } else {
         RankMsg.RankData.Builder builder = randMsg.toBuilder();
         CommonMsg.HeroInfo.Builder heroInfo = CommonMsg.HeroInfo.newBuilder();
         heroInfo.setCode(rankData.code);
         heroInfo.setStar(rankData.star);
         heroInfo.setLv(rankData.lv);
         heroInfo.setId(rankData.id);
         heroInfo.setQuality(0);
         heroInfo.setBreachLv(0);
         heroInfo.setCombatPower(rankData.score);
         heroInfo.setStarMapTotalLv(rankData.starMapTotalLv);
         builder.setHeroInfo(heroInfo);
         return builder.build();
      }
   }

   public RankMsg.RankUnionData buildUnionRankDataMsg(RankData rankData) {
      UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
      UnionMgr unionMgr = unionMgrParent.getUnionMgr(rankData.value);
      if (unionMgr != null) {
         RankMsg.RankUnionData.Builder randMsg = RankMsg.RankUnionData.newBuilder();
         randMsg.setRank(rankData.rank);
         randMsg.setScore(rankData.score);
         UnionDao unionDao = unionMgr.getUnion();
         randMsg.setUnionName(unionDao.unionName);
         randMsg.setCount(unionMgr.getUnionMembers().size());
         randMsg.setLevel(unionDao.level);
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(unionDao.leaderId);
         PlayerPublicDao playerDao = gamePlayer.getPublicDao();
         randMsg.setLeaderName(playerDao.playerName);
         randMsg.setLeaderId(unionDao.leaderId);
         if (rankData.rank > 0 && rankData.rank < 4) {
            randMsg.setHead(playerDao.head);
            randMsg.setHeadFrame(playerDao.headFrame);
         }

         randMsg.setUnionId(rankData.value);
         randMsg.setUnionHead(MiscUtil.getHiParam(unionDao.head));
         randMsg.setCurUnionAddNumberId(unionDao.curUnionAddNumberId);
         return randMsg.build();
      } else {
         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_OpenServerRank_8815(RankMsg.C2S_OpenServerRank_8815 msg, String source) {
      RankDefine.RankModule module = RankDefine.RankModule.OPEN_SERVER_POWER;
      if (msg.getModuleId() == RankDefine.RankModule.OPEN_SERVER_POWER.id) {
         module = RankDefine.RankModule.OPEN_SERVER_POWER;
      } else if (msg.getModuleId() == RankDefine.RankModule.OPEN_SERVER_LEV.id) {
         module = RankDefine.RankModule.OPEN_SERVER_LEV;
      } else if (msg.getModuleId() == RankDefine.RankModule.OPEN_SERVER_RECRUIT.id) {
         module = RankDefine.RankModule.OPEN_SERVER_RECRUIT;
      } else if (msg.getModuleId() == RankDefine.RankModule.OPEN_SERVER_ASSEMBLE.id) {
         module = RankDefine.RankModule.OPEN_SERVER_ASSEMBLE;
      } else if (msg.getModuleId() == RankDefine.RankModule.OPEN_SERVER_TOWER.id) {
         module = RankDefine.RankModule.OPEN_SERVER_TOWER;
      } else if (msg.getModuleId() == RankDefine.RankModule.OPEN_SERVER_UNDER_PALACE.id) {
         module = RankDefine.RankModule.OPEN_SERVER_UNDER_PALACE;
      } else if (msg.getModuleId() == RankDefine.RankModule.OPEN_SERVER_HERO_LEV.id) {
         module = RankDefine.RankModule.OPEN_SERVER_HERO_LEV;
      }

      RankMsg.S2C_OpenServerRank_8816.Builder resp = RankMsg.S2C_OpenServerRank_8816.newBuilder();
      resp.addAllRanks(this.buildOpenServerRankMsg(module));
      resp.setMyRank(this.buildPlayerOpenServerRankMsg(msg.getModuleId(), new RankData(this.getScore(module), this.getRank(module), this.player.getPlayerId())));
      if (module.id == RankDefine.RankModule.OPEN_SERVER_ASSEMBLE.id) {
         resp.setTime(this.activityMgr.checkLaborOpenServerRankTime(module));
      } else {
         resp.setTime(this.activityMgr.checkOpenServerRankTime(module));
      }

      resp.setModuleId(msg.getModuleId());
      this.player.sendMsg(resp.build());
   }

   public RankMsg.RankData buildPlayerOpenServerRankMsg(int moduleId, RankData rankData) {
      int limitNum = this.configManager.getIntDefault("rankMemberNum", 20);
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankData.value);
      if (gamePlayer == null) {
         return null;
      } else {
         PlayerPublicDao playerDao = gamePlayer.getPublicDao();
         RankMsg.RankData.Builder randMsg = RankMsg.RankData.newBuilder();
         if (rankData.rank > limitNum) {
            randMsg.setRank(0);
         } else {
            randMsg.setRank(rankData.rank);
         }

         if (moduleId == RankDefine.RankModule.OPEN_SERVER_POWER.id) {
            int limitScore = this.configManager.getIntDefault("powerRankCondition", 50000);
            if (rankData.score < (long)limitScore) {
               randMsg.setRank(0);
            }
         } else if (moduleId == RankDefine.RankModule.OPEN_SERVER_LEV.id) {
            int limitScore = this.configManager.getIntDefault("levelRankCondition", 20);
            if (rankData.score < (long)limitScore) {
               randMsg.setRank(0);
            }
         } else if (moduleId == RankDefine.RankModule.OPEN_SERVER_RECRUIT.id) {
            int limitScore = this.configManager.getIntDefault("employeeRankCondition", 10);
            if (rankData.score < (long)limitScore) {
               randMsg.setRank(0);
            }
         } else if (moduleId == RankDefine.RankModule.OPEN_SERVER_ASSEMBLE.id) {
            int limitScore = this.configManager.getIntDefault("recruitRankCondition", 10);
            if (rankData.score < (long)limitScore) {
               randMsg.setRank(0);
            }
         } else if (moduleId == RankDefine.RankModule.OPEN_SERVER_TOWER.id) {
            int limitScore = this.configManager.getIntDefault("towerRankCondition", 10);
            if (rankData.score < (long)limitScore) {
               randMsg.setRank(0);
            }
         } else if (moduleId == RankDefine.RankModule.OPEN_SERVER_HERO_LEV.id) {
            int limitScore = this.configManager.getIntDefault("heroLevelRankCondition", 30);
            if (rankData.score < (long)limitScore) {
               randMsg.setRank(0);
            }
         } else if (moduleId == RankDefine.RankModule.OPEN_SERVER_UNDER_PALACE.id) {
            int limitScore = this.configManager.getIntDefault("underPalaceRankCondition", 10);
            if (rankData.score < (long)limitScore) {
               randMsg.setRank(0);
            }
         }

         randMsg.setLevel(playerDao.lv);
         randMsg.setHead(playerDao.head);
         randMsg.setHeadFrame(playerDao.headFrame);
         randMsg.setScore(rankData.score);
         randMsg.setPlayerName(playerDao.playerName);
         randMsg.setPower(playerDao.combat_power);
         randMsg.setMonarchId(playerDao.monarchId);
         randMsg.addPlayerInfos(gamePlayer.toPropertyCellForInt64(PlayerDefine.PLAYER_COMBAT_POWER_101, playerDao.combat_power));
         randMsg.addPlayerInfos(gamePlayer.toPropertyCellForInt32(PlayerDefine.PLAYER_MONARCHID, playerDao.monarchId));
         randMsg.setPlayerId(rankData.value);
         randMsg.setServerId(gamePlayer.getServerId());
         return randMsg.build();
      }
   }

   public List<RankMsg.RankData> buildOpenServerRankMsg(RankDefine.RankModule module, String... keysAppend) {
      int limitNum = 3;
      List<RankMsg.RankData> rankList = new ArrayList();
      if (module.id == RankDefine.RankModule.OPEN_SERVER_POWER.id) {
         int limitScore = this.configManager.getIntDefault("powerRankCondition", 50000);

         for(RankData rankData : this.rankMgr.getRanks(module, limitNum, keysAppend)) {
            if (rankData.score >= (long)limitScore) {
               RankMsg.RankData rankMsg = this.buildPlayerRankDataMsg(rankData, module);
               if (rankMsg != null) {
                  rankList.add(rankMsg);
               }
            }
         }
      } else if (module.id == RankDefine.RankModule.OPEN_SERVER_LEV.id) {
         int limitScore = this.configManager.getIntDefault("levelRankCondition", 20);

         for(RankData rankData : this.rankMgr.getRanks(module, limitNum, keysAppend)) {
            if (rankData.score >= (long)limitScore) {
               RankMsg.RankData rankMsg = this.buildPlayerRankDataMsg(rankData, module);
               if (rankMsg != null) {
                  rankList.add(rankMsg);
               }
            }
         }
      } else if (module.id == RankDefine.RankModule.OPEN_SERVER_RECRUIT.id) {
         int limitScore = this.configManager.getIntDefault("employeeRankCondition", 10);

         for(RankData rankData : this.rankMgr.getRanks(module, limitNum, keysAppend)) {
            if (rankData.score >= (long)limitScore) {
               RankMsg.RankData rankMsg = this.buildPlayerRankDataMsg(rankData, module);
               if (rankMsg != null) {
                  rankList.add(rankMsg);
               }
            }
         }
      } else if (module.id == RankDefine.RankModule.OPEN_SERVER_ASSEMBLE.id) {
         int limitScore = this.configManager.getIntDefault("recruitRankCondition", 10);

         for(RankData rankData : this.rankMgr.getRanks(module, limitNum, keysAppend)) {
            if (rankData.score >= (long)limitScore) {
               RankMsg.RankData rankMsg = this.buildPlayerRankDataMsg(rankData, module);
               if (rankMsg != null) {
                  rankList.add(rankMsg);
               }
            }
         }
      } else if (module.id == RankDefine.RankModule.OPEN_SERVER_TOWER.id) {
         int limitScore = this.configManager.getIntDefault("towerRankCondition", 10);

         for(RankData rankData : this.rankMgr.getRanks(module, limitNum, keysAppend)) {
            if (rankData.score >= (long)limitScore) {
               RankMsg.RankData rankMsg = this.buildPlayerRankDataMsg(rankData, module);
               if (rankMsg != null) {
                  rankList.add(rankMsg);
               }
            }
         }
      } else if (module.id == RankDefine.RankModule.OPEN_SERVER_HERO_LEV.id) {
         int limitScore = this.configManager.getIntDefault("heroLevelRankCondition", 30);

         for(RankData rankData : this.rankMgr.getRanks(module, limitNum, keysAppend)) {
            if (rankData.score >= (long)limitScore) {
               RankMsg.RankData rankMsg = this.buildPlayerRankDataMsg(rankData, module);
               if (rankMsg != null) {
                  rankList.add(rankMsg);
               }
            }
         }
      } else if (module.id == RankDefine.RankModule.OPEN_SERVER_UNDER_PALACE.id) {
         int limitScore = this.configManager.getIntDefault("underPalaceRankCondition", 10);

         for(RankData rankData : this.rankMgr.getRanks(module, limitNum, keysAppend)) {
            if (rankData.score >= (long)limitScore) {
               RankMsg.RankData rankMsg = this.buildPlayerRankDataMsg(rankData, module);
               if (rankMsg != null) {
                  rankList.add(rankMsg);
               }
            }
         }
      }

      return rankList;
   }

   @MsgHandlerAnno
   public void C2S_RankRewardOneKey_8817(RankMsg.C2S_RankRewardOneKey_8817 msg, String source) {
      this.rankMgr.pushTask(() -> {
         Map<Integer, RankRewardDao> rewardDaoMap = this.rankMgr.getGameCachePool().getMap("tb_rank_reward", new Object[]{msg.getType()});
         if (rewardDaoMap != null && !rewardDaoMap.isEmpty()) {
            Set<RankRewardModel> rankRewardModels = new HashSet();

            for(RankRewardDao rankRewardDao : rewardDaoMap.values()) {
               if (!rankRewardDao.finishDataList.isEmpty()) {
                  RankRewardModel rankRewardModel = (RankRewardModel)ApplicationContextProvider.getModelPoolEntity("rankRewards", rankRewardDao.modelId);
                  if (rankRewardModel != null) {
                     rankRewardModels.add(rankRewardModel);
                  }
               }
            }

            if (!rankRewardModels.isEmpty()) {
               this.player.pushTask(() -> {
                  PlayerRankExtend playerRankExtend = (PlayerRankExtend)this.player.getPlayerExtend(44);
                  List<ResourceModel> rewards = new ArrayList();
                  Set<Integer> getRewards = new HashSet();

                  for(RankRewardModel rankRewardModel : rankRewardModels) {
                     if (!playerRankExtend.rankReward.contains(rankRewardModel.getId())) {
                        getRewards.add(rankRewardModel.getId());
                        rewards.add(rankRewardModel.rewardResource());
                     }
                  }

                  if (!getRewards.isEmpty()) {
                     playerRankExtend.rankReward.addAll(getRewards);
                     this.player.updatePlayerExtend(44);
                     this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 44, 4401, msg.getType(), 0, "oneKey");
                  }

                  RankMsg.S2C_RankRewardOneKey_8818.Builder resp = RankMsg.S2C_RankRewardOneKey_8818.newBuilder();
                  resp.addAllId(getRewards);
                  resp.setType(msg.getType());
                  this.player.sendMsg(resp.build());
               });
            }

         }
      });
   }

   public void levelUp(int preLv, int newLv) {
      this.updateRank(RankDefine.RankModule.PLAYER_LV, (long)newLv, false);
      ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
      if (activityMgr.checkOpenServerRankTime(RankDefine.RankModule.OPEN_SERVER_LEV) > 0) {
         this.updateRank(RankDefine.RankModule.OPEN_SERVER_LEV, (long)newLv, false);
      }

   }
}
