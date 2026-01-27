package com.gzbz.gamePlayer.battle;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.GiftDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.UnderPalaceDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.UnderPalaceData;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.UnderPalaceBuffModel;
import com.gzbz.model.UnderPalaceModel;
import com.gzbz.model.UnderPalaceRewardModel;
import com.gzbz.model.UnderPalaceTenModel;
import com.gzbz.model.UnderPalaceZiWeiRewardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.model.manager.WarOrderBaseModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.UnderPalaceMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.warOrder.inf.WarOrderInf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class UnderPalacePart extends PlayerPart implements WarOrderInf {
   @Autowired
   ConfigManager configManager;
   @Autowired
   RankMgr rankMgr;
   @Autowired
   ActivityMgr activityMgr;

   @MsgHandlerAnno
   public void C2S_UnderPalaceInfo_5701(UnderPalaceMsg.C2S_UnderPalaceInfo_5701 msg, String channelId) {
      UnderPalaceDao underDao = this.getUnderDao();
      UnderPalaceMsg.S2C_UnderPalaceInfo_5702.Builder builder = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.newBuilder();
      if (underDao.palaceInfo.containsKey(1)) {
         UnderPalaceData data = (UnderPalaceData)underDao.palaceInfo.get(1);
         UnderPalaceModel model = (UnderPalaceModel)this.player.getGameModelPool().getEntity("underPalace", data.stageId);
         if (model == null) {
            data.stageId = 1001;
            model = (UnderPalaceModel)this.player.getGameModelPool().getEntity("underPalace", data.stageId);
         }

         if (data.passState == 2 && model.getNextStageID() > 0) {
            data.passState = 1;
            underDao.updateOp();
         }

         UnderPalaceMsg.PalaceInfo.Builder infoBuilder = UnderPalaceMsg.PalaceInfo.newBuilder();
         infoBuilder.setPassState(data.passState);
         infoBuilder.setStageType(data.stageType);
         infoBuilder.setStageId(data.stageId);
         builder.addInfo(infoBuilder);
      }

      builder.addAllCommonAward(underDao.commonAward);
      builder.setPassSum(this.getStageSum());
      builder.addAllReceiveExtra(underDao.extraAward);
      builder.setSweepNum(underDao.sweepNum);
      builder.addAllRecZiWeiAward(underDao.recZiWeiAward);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ReceiveCommonAward_5703(UnderPalaceMsg.C2S_ReceiveCommonAward_5703 msg, String channelId) {
      int stageSum = msg.getStageSum();
      UnderPalaceDao underDao = this.getUnderDao();
      if (this.getStageSum() < stageSum) {
         this.player.failure(57005);
      } else {
         Map<Integer, UnderPalaceTenModel> modelMap = this.player.getGameModelPool().getMap("underPalaceTenReward");
         if (!modelMap.containsKey(stageSum)) {
            this.player.failure(57006);
         } else {
            UnderPalaceTenModel awardModel = (UnderPalaceTenModel)modelMap.get(stageSum);
            if (awardModel != null) {
               if (awardModel.getAllPassAwards().isEmpty()) {
                  this.player.failure(57006);
               } else if (underDao.commonAward.contains(stageSum)) {
                  this.player.failure(57007);
               } else {
                  this.player.addResource(awardModel.getAllPassAwards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 57, 5703, 0, 0, "");
                  underDao.commonAward.add(stageSum);
                  underDao.updateOp();
                  UnderPalaceMsg.S2C_ReceiveCommonAward_5704.Builder builder = UnderPalaceMsg.S2C_ReceiveCommonAward_5704.newBuilder();
                  builder.setStageSum(stageSum);
                  builder.addAllReceiveAward(underDao.commonAward);
                  builder.setResult(1);
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }

   public int getStageSum() {
      UnderPalaceDao underDao = this.getUnderDao();
      int passSum = 0;
      if (underDao.palaceInfo.containsKey(1)) {
         UnderPalaceData data = (UnderPalaceData)underDao.palaceInfo.get(1);
         UnderPalaceModel model = (UnderPalaceModel)this.player.getGameModelPool().getEntity("underPalace", data.stageId);
         if (model != null) {
            if (data.passState == 2) {
               passSum = model.getStageNum();
            } else {
               passSum = model.getStageNum() - 1;
            }
         }
      }

      return passSum;
   }

   @MsgHandlerAnno
   public void C2S_ReceiveExtraAward_5705(UnderPalaceMsg.C2S_ReceiveExtraAward_5705 msg, String channelId) {
      int stageSum = msg.getStageSum();
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      Map<Integer, GiftDao> giftDaoMap = giftPart.getBuyGifts(10);
      if (!giftDaoMap.containsKey(1758)) {
         this.player.failure(57009);
      } else {
         UnderPalaceDao underDao = this.getUnderDao();
         int passSum = 0;

         for(Map.Entry<Integer, UnderPalaceData> entry : underDao.palaceInfo.entrySet()) {
            UnderPalaceModel model = (UnderPalaceModel)this.player.getGameModelPool().getEntity("underPalace", ((UnderPalaceData)entry.getValue()).stageId);
            if (model != null) {
               if (((UnderPalaceData)entry.getValue()).passState == 2) {
                  passSum += model.getStageNum();
               } else {
                  passSum += model.getStageNum() - 1;
               }
            }
         }

         if (stageSum > passSum) {
            this.player.failure(57010);
         } else {
            UnderPalaceRewardModel model = (UnderPalaceRewardModel)this.player.getGameModelPool().getEntity("underPalaceReward", stageSum);
            if (model == null) {
               this.player.failure(57011);
            } else if (underDao.extraAward.contains(stageSum)) {
               this.player.failure(57012);
            } else {
               underDao.extraAward.add(stageSum);
               underDao.updateOp();
               this.player.addResource(model.getAllPassAwards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 57, 5704, 0, 0, "");
               UnderPalaceMsg.S2C_ReceiveExtraAward_5706.Builder builder = UnderPalaceMsg.S2C_ReceiveExtraAward_5706.newBuilder();
               builder.addAllReceiveExtra(underDao.extraAward);
               builder.setResult(1);
               builder.setStageSum(stageSum);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_RecZiWeiAward_5712(UnderPalaceMsg.C2S_RecZiWeiAward_5712 msg, String source) {
      int underPalaceZiWeiReward = this.configManager.getIntDefault("underPalaceZiWeiReward", 1689);
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      Map<Integer, GiftDao> giftDaoMap = giftPart.getBuyGifts(10);
      if (!giftDaoMap.containsKey(underPalaceZiWeiReward)) {
         return this.player.failure(76031);
      } else {
         int stageSum = msg.getStageSum();
         UnderPalaceDao underDao = this.getUnderDao();
         if (this.getStageSum() < stageSum) {
            return this.player.failure(57005);
         } else {
            UnderPalaceZiWeiRewardModel ziWeiRewardModel = (UnderPalaceZiWeiRewardModel)ApplicationContextProvider.getModelPoolEntity("underPalaceZiWeiReward", stageSum);
            if (null == ziWeiRewardModel) {
               return this.player.failure(57006);
            } else if (underDao.recZiWeiAward.contains(stageSum)) {
               return this.player.failure(57007);
            } else {
               this.player.addResource(ziWeiRewardModel.getAllPassAwards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 57, 5706);
               underDao.recZiWeiAward.add(stageSum);
               underDao.updateOp();
               UnderPalaceMsg.S2C_RecZiWeiAward_5713.Builder resp = UnderPalaceMsg.S2C_RecZiWeiAward_5713.newBuilder();
               resp.setStageSum(stageSum);
               resp.addAllRecZiWeiAward(underDao.recZiWeiAward);
               resp.setResult(1);
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RefreshBuff_5707(UnderPalaceMsg.C2S_RefreshBuff_5707 msg, String channelId) {
      int stageType = msg.getStageType();
      int stageId = msg.getStageId();
      UnderPalaceDao underDao = this.getUnderDao();
      if (underDao.palaceInfo.containsKey(stageType)) {
         UnderPalaceModel model = (UnderPalaceModel)this.player.getGameModelPool().getEntity("underPalace", stageId);
         if (model.getBuffLab() > 0 && model.getBuffNum() > 0) {
            String consume = this.configManager.getStr("underPalaceBuffRefresh");
            String[] cost = consume.split("\\|");
            if (!this.player.checkResourceNum(Integer.parseInt(cost[0]), Integer.parseInt(cost[1]), Integer.parseInt(cost[2]))) {
               this.player.failure(57002);
            } else {
               this.player.delResource(Integer.parseInt(cost[0]), Integer.parseInt(cost[1]), (long)Integer.parseInt(cost[2]), 57, 5701, 0, 0, "");
               Map<Integer, UnderPalaceBuffModel> buffModelMap = this.player.getGameModelPool().getMap("underPalaceBuff");
               List<UnderPalaceBuffModel> buffList = new ArrayList();

               for(UnderPalaceBuffModel buffModel : buffModelMap.values()) {
                  if (buffModel.getLabId() == model.getBuffLab()) {
                     buffList.add(buffModel);
                  }
               }

               Collections.shuffle(buffList);
               ((UnderPalaceData)underDao.palaceInfo.get(stageType)).buffs.clear();

               for(int i = 0; i < 5 && i <= buffList.size(); ++i) {
                  ((UnderPalaceData)underDao.palaceInfo.get(stageType)).buffs.add(((UnderPalaceBuffModel)buffList.get(i)).getId());
               }

               underDao.updateOp();
               UnderPalaceMsg.S2C_RefreshBuff_5708.Builder builder = UnderPalaceMsg.S2C_RefreshBuff_5708.newBuilder();
               builder.setStageId(stageId);
               builder.setStageType(stageType);
               builder.addAllBuffs(((UnderPalaceData)underDao.palaceInfo.get(stageType)).buffs);
               this.player.sendMsg(builder.build());
            }
         } else {
            this.player.failure(57001);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SweepStage_5710(UnderPalaceMsg.C2S_SweepStage_5710 msg, String channelId) {
      int stageId = 0;
      UnderPalaceDao underDao = this.getUnderDao();
      int limitSweepNum = this.configManager.getIntDefault("underPalaceOutNum", 5);
      if (underDao.sweepNum >= limitSweepNum) {
         this.player.failure(57014);
      } else if (underDao.palaceInfo.containsKey(1)) {
         if (((UnderPalaceData)underDao.palaceInfo.get(1)).passState == 2) {
            stageId = ((UnderPalaceData)underDao.palaceInfo.get(1)).stageId;
         } else {
            stageId = ((UnderPalaceData)underDao.palaceInfo.get(1)).stageId - 1;
         }

         UnderPalaceModel model = (UnderPalaceModel)this.player.getGameModelPool().getEntity("underPalace", stageId);
         if (model != null) {
            this.player.addResource(model.getPassAwards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 57, 5705, 0, 0, "");
            ++underDao.sweepNum;
            underDao.updateOp();
            UnderPalaceMsg.S2C_SweepStage_5711.Builder builder = UnderPalaceMsg.S2C_SweepStage_5711.newBuilder();
            builder.setStageId(msg.getStageId());
            builder.setSweepNum(underDao.sweepNum);
            this.player.sendMsg(builder.build());
            GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
            guanJiaPart.checkState(2880, (List)null);
         }
      } else {
         this.player.failure(57015);
      }
   }

   public UnderPalaceDao getUnderDao() {
      UnderPalaceDao dao = (UnderPalaceDao)this.player.getData("tb_player_under_Palace", this.player.getPlayerId());
      if (dao.palaceInfo.isEmpty()) {
         Map<Integer, UnderPalaceModel> modelMap = this.player.getGameModelPool().getMap("underPalace");
         List<UnderPalaceModel> list = new ArrayList();

         for(UnderPalaceModel value : modelMap.values()) {
            if (value.getType() == 1 && value.getStageNum() == 1) {
               list.add(value);
            }
         }

         if (list.isEmpty()) {
            this.logger.error("摸金校蔚数据出错");
         }

         UnderPalaceData data = new UnderPalaceData();
         data.stageType = 1;
         data.stageId = ((UnderPalaceModel)list.get(0)).getId();
         dao.palaceInfo.put(1, data);
         dao.updateOp();
      }

      return dao;
   }

   public int battle(BattleDao battleDao, int wave) {
      int id = battleDao.modelId;
      UnderPalaceDao underPalaceDao = this.getUnderDao();
      UnderPalaceModel model = (UnderPalaceModel)this.player.getGameModelPool().getEntity("underPalace", id);
      if (underPalaceDao.palaceInfo.containsKey(model.getType())) {
         if (((UnderPalaceData)underPalaceDao.palaceInfo.get(model.getType())).stageId != id) {
            this.logger.info("摸金校尉当前战斗id不对：" + id + "------" + ((UnderPalaceData)underPalaceDao.palaceInfo.get(model.getType())).stageId);
            return 57004;
         }

         if (((UnderPalaceData)underPalaceDao.palaceInfo.get(model.getType())).stageId == id && ((UnderPalaceData)underPalaceDao.palaceInfo.get(model.getType())).passState == 2) {
            return 57013;
         }
      } else {
         if (model.getStageNum() != 1) {
            return 0;
         }

         if (model.getType() > 1) {
            if (!underPalaceDao.palaceInfo.containsKey(model.getType() - 1)) {
               return 57008;
            }

            if (((UnderPalaceData)underPalaceDao.palaceInfo.get(model.getType() - 1)).stageId < model.getHotStage()) {
               return 57008;
            }
         }
      }

      if (battleDao.params.size() > model.getBuffNum()) {
         this.logger.info("所选buff数量不对");
         return 57003;
      } else {
         CommonMsg.HeroState heroState = CommonMsg.HeroState.HERO_STATE_UNDER_PALACE;
         int battleId = model.getBattleId();
         if (wave == 1) {
            if (model.getBattleId2() > 0) {
               heroState = CommonMsg.HeroState.HERO_STATE_UNDER_PALACE_1;
               battleDao.scene.setWave((short)((byte)wave), (short)2);
               ArrayingMirror arrayingMirror2 = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_UNDER_PALACE_2);
               if (null == arrayingMirror2) {
                  return 4125;
               }
            } else {
               battleDao.scene.setWave((short)1, (short)1);
            }
         } else {
            if (model.getBattleId2() <= 0) {
               this.logger.error("摸金校尉 选择了第二波 但是配置中没有第二波怪 UnderPalaceId:{}", id);
               return 37;
            }

            if (battleDao.scene.getWave() != 1) {
               return 6;
            }

            if (battleDao.scene.getWinForce() == 1 || battleDao.scene.getWave() > battleDao.scene.getTotalWave()) {
               return 44;
            }

            battleId = model.getBattleId2();
            heroState = CommonMsg.HeroState.HERO_STATE_UNDER_PALACE_2;
            battleDao.scene.setWave((short)((byte)wave), (short)2);
         }

         ArrayingMirror arrayingMirror = this.player.getPlayerArraying(heroState);
         if (null == arrayingMirror) {
            return 4125;
         } else {
            PlayerDao playerDao = this.player.getPlayerDao();
            BattlePKTeam leftTeam = new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, (Map)null);
            BattlePKTeam rightTeam = new BattlePKTeam(battleId);
            battleDao.scene.addPKTeam(leftTeam, rightTeam);
            Set<Integer> skillSet = new HashSet();
            if (!battleDao.params.isEmpty()) {
               for(int i = 0; i < battleDao.params.size(); ++i) {
                  UnderPalaceBuffModel buffModel = (UnderPalaceBuffModel)this.player.getGameModelPool().getEntity("underPalaceBuff", battleDao.params.get(i));
                  if (buffModel != null) {
                     skillSet.addAll(buffModel.getSkilleffectId());
                  }
               }

               for(Entity entity : battleDao.scene.getPKTeam((byte)1).getEntityMap().values()) {
                  entity.addUnderPalaceEffect(skillSet);
               }
            }

            battleDao.scene.setMaxRound((byte)20);
            this.player.getOperationMgr().addCopyLog(this.player, id, "摸金校尉");
            return 1;
         }
      }
   }

   public int enterBattle(BattleDao battleDao) {
      return this.battle(battleDao, 1);
   }

   public int nextBattle(BattleDao battleDao) {
      return this.battle(battleDao, 2);
   }

   public void afterFight(BattleDao battleDao) {
      if (battleDao.scene.getWinForce() != 1 && battleDao.scene.getWave() == battleDao.scene.getTotalWave()) {
         int id = battleDao.modelId;
         UnderPalaceModel model = (UnderPalaceModel)this.player.getGameModelPool().getEntity("underPalace", id);
         BattleMsg.S2C_BattleResult_6102.Builder battleMsg = battleDao.scene.getBattleMsg();
         BattleMsg.S2C_Battle_Result.Builder result = battleMsg.build().getResult().toBuilder();

         for(ResourceModel resource : model.getPassAwards()) {
            int type = resource.getType();
            int resourceId = resource.getId();
            int value = resource.getValue();
            result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(type).setId(resourceId).setNum(value));
         }

         battleDao.status = 0;
         battleMsg.setIsEnd(true);
         battleMsg.setResult(result);
         battleMsg.setIsNextWave(battleDao.scene.getWave() > 1);
         battleMsg.addExParams(model.getStageNum());
         battleMsg.addExParams(model.getNextStageID());
         battleDao.scene.setBattleMsg(battleMsg);
         this.player.getOperationMgr().addExtraLog(this.player, 188, battleDao.modelId + "", "是", battleDao.modelId + "");
      }
   }

   public void endBattle(BattleDao battleDao) {
      if (battleDao.scene.getWinForce() == 0) {
         int id = battleDao.modelId;
         UnderPalaceModel model = (UnderPalaceModel)this.player.getGameModelPool().getEntity("underPalace", id);
         this.player.addResource(model.getPassAwards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 57, 5702, 0, 0, "");
         UnderPalaceDao underPalaceDao = this.getUnderDao();
         UnderPalaceData underPalaceData = (UnderPalaceData)underPalaceDao.palaceInfo.get(model.getType());
         if (underPalaceDao.palaceInfo.containsKey(model.getType())) {
            if (model.getNextStageID() <= 0) {
               ((UnderPalaceData)underPalaceDao.palaceInfo.get(model.getType())).passState = 2;
            } else {
               ((UnderPalaceData)underPalaceDao.palaceInfo.get(model.getType())).stageId = model.getNextStageID();
               ((UnderPalaceData)underPalaceDao.palaceInfo.get(model.getType())).buffs.clear();
               UnderPalaceModel nextModel = (UnderPalaceModel)this.player.getGameModelPool().getEntity("underPalace", model.getNextStageID());
               if (nextModel.getBuffLab() > 0 && nextModel.getBuffNum() > 0) {
                  Map<Integer, UnderPalaceBuffModel> buffModelMap = this.player.getGameModelPool().getMap("underPalaceBuff");
                  List<UnderPalaceBuffModel> buffList = new ArrayList();

                  for(UnderPalaceBuffModel buffModel : buffModelMap.values()) {
                     if (buffModel.getLabId() == nextModel.getBuffLab()) {
                        buffList.add(buffModel);
                     }
                  }

                  Collections.shuffle(buffList);
                  ((UnderPalaceData)underPalaceDao.palaceInfo.get(model.getType())).buffs.clear();

                  for(int i = 0; i < 5; ++i) {
                     ((UnderPalaceData)underPalaceDao.palaceInfo.get(model.getType())).buffs.add(((UnderPalaceBuffModel)buffList.get(i)).getId());
                  }
               } else {
                  ((UnderPalaceData)underPalaceDao.palaceInfo.get(model.getType())).buffs.clear();
               }
            }
         } else {
            UnderPalaceData data = new UnderPalaceData();
            data.stageId = model.getNextStageID();
            data.passState = 1;
            data.stageType = model.getType();
            underPalaceDao.palaceInfo.put(model.getType(), data);
            UnderPalaceModel nextModel = (UnderPalaceModel)this.player.getGameModelPool().getEntity("underPalace", model.getNextStageID());
            if (nextModel.getBuffLab() > 0 && nextModel.getBuffNum() > 0) {
               Map<Integer, UnderPalaceBuffModel> buffModelMap = this.player.getGameModelPool().getMap("underPalaceBuff");
               List<UnderPalaceBuffModel> buffList = new ArrayList();

               for(UnderPalaceBuffModel buffModel : buffModelMap.values()) {
                  if (buffModel.getLabId() == nextModel.getBuffLab()) {
                     buffList.add(buffModel);
                  }
               }

               Collections.shuffle(buffList);
               ((UnderPalaceData)underPalaceDao.palaceInfo.get(model.getType())).buffs.clear();

               for(int i = 0; i < 5; ++i) {
                  ((UnderPalaceData)underPalaceDao.palaceInfo.get(model.getType())).buffs.add(((UnderPalaceBuffModel)buffList.get(i)).getId());
               }
            } else {
               ((UnderPalaceData)underPalaceDao.palaceInfo.get(model.getType())).buffs.clear();
            }
         }

         underPalaceDao.updateOp();
         UnderPalaceMsg.S2C_BattleEnd_5709.Builder builder = UnderPalaceMsg.S2C_BattleEnd_5709.newBuilder();
         builder.setStageId(underPalaceData.stageId);
         builder.setPassState(underPalaceData.passState);
         builder.setStageType(underPalaceData.stageType);
         builder.addAllBuffs(underPalaceData.buffs);
         this.player.sendMsg(builder.build());
         this.rankMgr.pushTaskEx("updateRankHigherEx", new Object[]{RankDefine.RankModule.UNDER_PALACE, this.getStageSum(), this.player.getPlayerId()});
         this.player.triggerTask(616, 0, (long)this.getStageSum(), 0);
         this.rankMgr.pushTaskEx("checkRankReward", new Object[]{this.player.getPlayerId(), 4, this.getStageSum()});
         RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
         if (this.activityMgr.checkOpenServerRankTime(RankDefine.RankModule.OPEN_SERVER_UNDER_PALACE) > 0) {
            rankPart.updateRank(RankDefine.RankModule.OPEN_SERVER_UNDER_PALACE, (long)this.getStageSum(), false);
         }
      }

      battleDao.rewards.clear();
   }

   public void loginHandle() {
      if (this.activityMgr.checkOpenServerRankTime(RankDefine.RankModule.OPEN_SERVER_UNDER_PALACE) > 0) {
         int stageSum = (int)this.rankMgr.getScore(RankDefine.RankModule.UNDER_PALACE, this.player.getPlayerId());
         if (stageSum > 0) {
            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            rankPart.updateRank(RankDefine.RankModule.OPEN_SERVER_UNDER_PALACE, (long)stageSum, false);
         }
      }

   }

   public void gmOp(int stageType, int stageId) {
      UnderPalaceDao underPalaceDao = this.getUnderDao();
      if (underPalaceDao.palaceInfo.containsKey(stageType)) {
         ((UnderPalaceData)underPalaceDao.palaceInfo.get(stageType)).stageId = stageId;
      } else {
         UnderPalaceData data = new UnderPalaceData();
         data.stageType = stageType;
         data.stageId = stageId;
         underPalaceDao.palaceInfo.put(stageType, data);
      }

      underPalaceDao.updateOp();
   }

   public void resetDaily() {
      UnderPalaceDao underPalaceDao = this.getUnderDao();
      underPalaceDao.sweepNum = 0;
      underPalaceDao.updateOp();
   }

   public void guanJiaOperate(int systemId) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      int stageId = 0;
      UnderPalaceDao underDao = this.getUnderDao();
      if (underDao.sweepNum > 0) {
         guanJiaPart.checkState(systemId, (List)null);
      } else {
         int limitSweepNum = this.configManager.getIntDefault("underPalaceOutNum", 5);
         if (!underDao.palaceInfo.containsKey(1)) {
            guanJiaPart.checkState(systemId, (List)null);
         } else {
            if (((UnderPalaceData)underDao.palaceInfo.get(1)).passState == 2) {
               stageId = ((UnderPalaceData)underDao.palaceInfo.get(1)).stageId;
            } else {
               stageId = ((UnderPalaceData)underDao.palaceInfo.get(1)).stageId - 1;
            }

            UnderPalaceModel model = (UnderPalaceModel)this.player.getGameModelPool().getEntity("underPalace", stageId);
            if (model == null) {
               guanJiaPart.checkState(systemId, (List)null);
            } else {
               List<ResourceModel> rewardList = new ArrayList();

               for(ResourceModel resourceModel : model.getPassAwards()) {
                  rewardList.add(new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * limitSweepNum));
               }

               this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 57, 5705, 0, 0, "管家");
               underDao.sweepNum += limitSweepNum;
               underDao.updateOp();
               UnderPalaceMsg.S2C_SweepStage_5711.Builder builder = UnderPalaceMsg.S2C_SweepStage_5711.newBuilder();
               builder.setStageId(stageId);
               builder.setSweepNum(underDao.sweepNum);
               this.player.sendMsg(builder.build());
               guanJiaPart.checkState(systemId, rewardList);
            }
         }
      }
   }

   public int system() {
      return 2880;
   }

   public String excel() {
      return "underPalaceReward";
   }

   public boolean check(WarOrderBaseModel warOrderBaseModel) {
      UnderPalaceRewardModel underPalaceRewardModel = (UnderPalaceRewardModel)warOrderBaseModel;
      UnderPalaceDao underDao = this.getUnderDao();
      int passSum = 0;

      for(Map.Entry<Integer, UnderPalaceData> entry : underDao.palaceInfo.entrySet()) {
         UnderPalaceModel underPalaceModel = (UnderPalaceModel)this.player.getGameModelPool().getEntity("underPalace", ((UnderPalaceData)entry.getValue()).stageId);
         if (underPalaceModel != null) {
            if (((UnderPalaceData)entry.getValue()).passState == 2) {
               passSum += underPalaceModel.getStageNum();
            } else {
               passSum += underPalaceModel.getStageNum() - 1;
            }
         }
      }

      return underPalaceRewardModel.getId() <= passSum;
   }

   public boolean isBuy(WarOrderBaseModel warOrderBaseModel) {
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      return giftPart.getBuyGifts(10).containsKey(1758) || giftPart.getBuyGifts(29).containsKey(warOrderBaseModel.getStageType());
   }
}
