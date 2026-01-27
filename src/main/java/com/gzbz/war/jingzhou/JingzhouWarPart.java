package com.gzbz.war.jingzhou;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.WarJZDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.bean.WarJZData;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.model.BattleModel;
import com.gzbz.model.WarOfJingZhouModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.WarJZMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import misc.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class JingzhouWarPart extends PlayerPart {
   private Logger logger = LoggerFactory.getLogger(JingzhouWarPart.class);
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private RankMgr rankMgr;

   public void loginHandle() {
      WarJZDao warJZDao = this.getWarJZDao();
      int fightNum = this.configManager.getInt("warOfJingZhouFightNum");
      int leftWarNum = fightNum + warJZDao.buyNum - warJZDao.warNum;
      if (leftWarNum > 0) {
         this.sendJZInfo(warJZDao);
      }

   }

   @MsgHandlerAnno
   public void getWarJZInfo(WarJZMsg.C2S_GetWarJZInfo_9101 msg, String channelId) {
      WarJZDao warJZDao = this.getWarJZDao();
      this.sendJZInfo(warJZDao);
   }

   public int getDayByNation(int nation) {
      int today = 0;
      String str = this.configManager.getStr("warOfJingZhouNameAndDesc");
      String[] arr = str.split(":");

      for(int i = 0; i < arr.length; ++i) {
         String[] realStr = arr[i].split("\\|");
         if (Integer.parseInt(realStr[1]) == nation) {
            today = Integer.parseInt(realStr[0]);
            return today;
         }
      }

      return today;
   }

   public int enterBattle(BattleDao battleDao) {
      int id = battleDao.modelId;
      WarOfJingZhouModel model = (WarOfJingZhouModel)this.player.getGameModelPool().getEntity("warOfJingZhou", id);
      if (Objects.isNull(model)) {
         this.logger.error("荆州之战挑战的关卡id：" + id);
         return 0;
      } else {
         int today = this.getDayByNation(model.getFaction());
         if (DateUtil.todayOfWeek() != 1 && DateUtil.todayOfWeek() != 7 && today != DateUtil.todayOfWeek() - 1) {
            return 28000;
         } else {
            WarJZDao warJZDao = this.getWarJZDao();
            if (((WarJZData)warJZDao.warDataMap.get(today)).passStatus == 2 && !battleDao.isSkip) {
               return 0;
            } else if (!battleDao.isSkip && ((WarJZData)warJZDao.warDataMap.get(today)).layerId != model.getLayerId()) {
               return 0;
            } else {
               int fightNum = this.configManager.getInt("warOfJingZhouFightNum");
               int leftWarNum = 0;
               boolean isPrivilege = false;
               PlayerDao playerDao = this.player.getPlayerDao();
               isPrivilege = playerDao.privilege_chi_bi > 0;
               if (isPrivilege) {
                  String teQuan = this.configManager.getStr("warOfJingZhouTeQuan");
                  leftWarNum = Integer.parseInt(teQuan.split("\\|")[0]) + fightNum + warJZDao.buyNum - warJZDao.warNum;
               } else {
                  leftWarNum = fightNum + warJZDao.buyNum - warJZDao.warNum;
               }

               if (leftWarNum <= 0) {
                  return 28002;
               } else {
                  WorldDao<JingZhouData> worldDao = this.worldMgr.<JingZhouData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WAR_JZ_HERO);
                  int modelId = Integer.parseInt(model.getBattleId().split("\\|")[((JingZhouData)worldDao.jsonData).round - 1]);
                  BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", modelId);
                  if (battleModel == null) {
                     return 0;
                  } else {
                     this.player.getOperationMgr().addCopyLog(this.player, battleModel.getId(), "荆州之战");
                     String addProperty = this.configManager.getStr("warOfJingZhouExtHurt");
                     String[] add = addProperty.split("\\|");
                     HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);

                     for(Entity entity : battleDao.scene.getPKTeam((byte)0).getEntityMap().values()) {
                        int nation = heroBagPart.getHeroNation(entity.getHeroCode());
                        if (nation == 1 && model.getFaction() == 2) {
                           this.addProperty(entity, Integer.parseInt(add[0]), Integer.parseInt(add[1]), Long.parseLong(add[2]));
                        } else if (nation == 2 && model.getFaction() == 3) {
                           this.addProperty(entity, Integer.parseInt(add[0]), Integer.parseInt(add[1]), Long.parseLong(add[2]));
                        } else if (nation == 3 && model.getFaction() == 1) {
                           this.addProperty(entity, Integer.parseInt(add[0]), Integer.parseInt(add[1]), Long.parseLong(add[2]));
                        } else if (nation == 4 && model.getFaction() == 5) {
                           this.addProperty(entity, Integer.parseInt(add[0]), Integer.parseInt(add[1]), Long.parseLong(add[2]));
                        } else if (nation == 5 && model.getFaction() == 4) {
                           this.addProperty(entity, Integer.parseInt(add[0]), Integer.parseInt(add[1]), Long.parseLong(add[2]));
                        }

                        entity.setBaseProperty(99, entity.getBaseProperty(1));
                     }

                     BattlePKTeam rightTeam = new BattlePKTeam(modelId);
                     battleDao.scene.addPKTeam((byte)1, rightTeam);
                     battleDao.scene.setMaxRound((byte)20);
                     return 1;
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

   public void afterFight(BattleDao battleDao) {
      int id = battleDao.modelId;
      WarOfJingZhouModel model = (WarOfJingZhouModel)this.player.getGameModelPool().getEntity("warOfJingZhou", id);
      int today = this.getDayByNation(model.getFaction());
      WarJZDao warJZDao = this.getWarJZDao();
      WarJZData data = (WarJZData)warJZDao.warDataMap.get(today);
      this.player.triggerTask(515, 0, 1L, 1);
      if (battleDao.isSkip) {
         ++warJZDao.warNum;
         warJZDao.updateOp();
      } else {
         if (battleDao.scene.getWinForce() == 1) {
            return;
         }

         ++warJZDao.warNum;
         if (model.getNextLayerId() == 0) {
            data.passStatus = 2;
            if (!warJZDao.passMap.containsKey(today)) {
               warJZDao.passMap.put(today, true);
            }
         } else {
            data.layerId = model.getNextLayerId();
         }

         ++warJZDao.allPass;
         warJZDao.updateOp();
         RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();

         for(ResourceModel resource : model.getFirstRewards()) {
            int type = resource.getType();
            int resourceId = resource.getId();
            int value = resource.getValue();
            result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(type).setId(resourceId).setNum(value));
         }

         battleDao.scene.getBattleMsg().setResult(result);
         rankPart.updateRank(RankDefine.RankModule.WAR_JZ_PASS, (long)warJZDao.allPass, true);
         this.player.triggerTask(318, 0, (long)model.getLayerId(), 0);
         this.player.triggerTask(522, 0, 1L, 1);
         this.player.getOperationMgr().addExtraLog(this.player, 189, "荆州之战", model.getFaction() + "", battleDao.modelId + "", "-", "是");
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "荆州之战", "过关奖励-" + id, "过关奖励-" + id, 0, 0, 1);
      }

   }

   public void endBattle(BattleDao battleDao) {
      int id = battleDao.modelId;
      WarOfJingZhouModel model = (WarOfJingZhouModel)this.player.getGameModelPool().getEntity("warOfJingZhou", id);
      if (battleDao.isSkip) {
         this.player.addResource(model.getSweepRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 28, 518, id, 0, String.valueOf(this.player.getPlayerId()));
      } else {
         if (battleDao.scene.getWinForce() == 1) {
            return;
         }

         this.player.addResource(model.getFirstRewards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 28, 518, id, 0, String.valueOf(this.player.getPlayerId()));
      }

      battleDao.rewards.clear();
      WarJZDao warJZDao = this.getWarJZDao();
      this.sendJZInfo(warJZDao);
   }

   @MsgHandlerAnno
   public void C2S_WarJZSweep_9109(WarJZMsg.C2S_WarJZSweep_9109 msg, String channelId) {
      int id = msg.getId();
      WarOfJingZhouModel model = (WarOfJingZhouModel)this.player.getGameModelPool().getEntity("warOfJingZhou", id);
      if (Objects.isNull(model)) {
         this.logger.error("荆州之战挑战的关卡id：" + id);
         this.player.failure(0);
      } else {
         int today = this.getDayByNation(model.getFaction());
         if (DateUtil.todayOfWeek() != 1 && DateUtil.todayOfWeek() != 7 && today != DateUtil.todayOfWeek() - 1) {
            this.player.failure(28000);
         } else {
            WarJZDao warJZDao = this.getWarJZDao();
            int fightNum = this.configManager.getInt("warOfJingZhouFightNum");
            int leftWarNum = 0;
            boolean isPrivilege = false;
            PlayerDao playerDao = this.player.getPlayerDao();
            isPrivilege = playerDao.privilege_chi_bi > 0;
            if (isPrivilege) {
               String teQuan = this.configManager.getStr("warOfJingZhouTeQuan");
               leftWarNum = Integer.parseInt(teQuan.split("\\|")[0]) + fightNum + warJZDao.buyNum - warJZDao.warNum;
            } else {
               leftWarNum = fightNum + warJZDao.buyNum - warJZDao.warNum;
            }

            if (leftWarNum <= 0) {
               this.player.failure(28002);
            } else {
               ++warJZDao.warNum;
               warJZDao.updateOp();
               this.player.addResource(model.getSweepRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 28, 518, id, 0, String.valueOf(this.player.getPlayerId()));
               this.player.triggerTask(515, 0, 1L, 1);
               this.sendJZInfo(warJZDao);
            }
         }
      }
   }

   private void sendJZInfo(WarJZDao warJZDao) {
      int today = DateUtil.todayOfWeek() - 1;
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      WorldDao<JingZhouData> worldDao = worldMgr.<JingZhouData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WAR_JZ_HERO);
      WarJZMsg.S2C_GetWarJZInfo_9102.Builder builder = WarJZMsg.S2C_GetWarJZInfo_9102.newBuilder();
      int fightNum = this.configManager.getInt("warOfJingZhouFightNum");
      int buyNum = this.configManager.getInt("warOfJingZhouBuyNum");
      int leftWarNum = 0;
      int leftBuyNum = 0;
      boolean isPrivilege = false;
      PlayerDao playerDao = this.player.getPlayerDao();
      isPrivilege = playerDao.privilege_chi_bi > 0;
      if (isPrivilege) {
         String teQuan = this.configManager.getStr("warOfJingZhouTeQuan");
         leftWarNum = Integer.parseInt(teQuan.split("\\|")[0]) + fightNum + warJZDao.buyNum - warJZDao.warNum;
         leftBuyNum = Integer.parseInt(teQuan.split("\\|")[1]) + buyNum - warJZDao.buyNum;
      } else {
         leftWarNum = fightNum + warJZDao.buyNum - warJZDao.warNum;
         leftBuyNum = buyNum - warJZDao.buyNum;
      }

      builder.setBattleNum(leftWarNum);
      builder.setBuyNum(leftBuyNum);
      builder.setBuySpecialBag(false);
      String str = this.configManager.getStr("warOfJingZhouNameAndDesc");
      String[] arr = str.split(":");
      if (today != 6 && today != 0) {
         int nation = 0;

         for(int i = 0; i < arr.length; ++i) {
            String[] realStr = arr[i].split("\\|");
            if (Integer.parseInt(realStr[0]) == today) {
               nation = Integer.parseInt(realStr[1]);
               break;
            }
         }

         WarJZMsg.JZInfo.Builder info = WarJZMsg.JZInfo.newBuilder();
         info.setHeroId((Integer)((JingZhouData)worldDao.jsonData).map.get(nation));
         info.setNation(nation);
         info.setLayerId(((WarJZData)warJZDao.warDataMap.get(today)).layerId);
         if (((WarJZData)warJZDao.warDataMap.get(today)).passStatus == 0) {
            info.setPassStatus(WarJZMsg.Status.NOT_OPEN);
         } else if (((WarJZData)warJZDao.warDataMap.get(today)).passStatus == 1) {
            info.setPassStatus(WarJZMsg.Status.OPEN);
         } else {
            info.setPassStatus(WarJZMsg.Status.CLOSE);
         }

         if (warJZDao.passMap.containsKey(today)) {
            info.setIsLock(true);
         } else {
            info.setIsLock(false);
         }

         builder.addInfo(info);
      } else {
         for(WarJZData v : warJZDao.warDataMap.values()) {
            WarJZMsg.JZInfo.Builder info = WarJZMsg.JZInfo.newBuilder();
            info.setHeroId((Integer)((JingZhouData)worldDao.jsonData).map.get(v.nation));
            info.setNation(v.nation);
            info.setLayerId(v.layerId);
            if (v.passStatus == 0) {
               info.setPassStatus(WarJZMsg.Status.NOT_OPEN);
            } else if (v.passStatus == 1) {
               info.setPassStatus(WarJZMsg.Status.OPEN);
            } else {
               info.setPassStatus(WarJZMsg.Status.CLOSE);
            }

            if (warJZDao.passMap.containsKey(this.getDayByNation(v.nation))) {
               info.setIsLock(true);
            } else {
               info.setIsLock(false);
            }

            builder.addInfo(info);
         }
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void buyWarJZNum(WarJZMsg.C2S_WarJZBuy_9105 msg, String channelId) {
      WarJZDao warJZDao = this.getWarJZDao();
      int buyNum = this.configManager.getInt("warOfJingZhouBuyNum");
      int fightNum = this.configManager.getInt("warOfJingZhouFightNum");
      String consume = this.configManager.getStr("warOfJingZhouBuyConsume");
      String[] resource = consume.split(",");
      boolean isPrivilege = false;
      PlayerDao playerDao = this.player.getPlayerDao();
      isPrivilege = playerDao.privilege_chi_bi > 0;
      int teQuanNum = 0;
      if (isPrivilege) {
         String teQuan = this.configManager.getStr("warOfJingZhouTeQuan");
         teQuanNum = Integer.parseInt(teQuan.split("\\|")[1]);
      }

      if (warJZDao.buyNum >= buyNum + teQuanNum) {
         this.player.failure(28004);
      } else {
         if (warJZDao.buyNum >= 1) {
            String[] need = resource[1].split("\\|");
            if (!this.player.checkResourceNum(Integer.parseInt(need[0]), Integer.parseInt(need[1]), Integer.parseInt(need[2]))) {
               this.logger.info("金币不够");
               this.player.failure(28005);
               return;
            }

            this.player.delResource(Integer.parseInt(need[0]), Integer.parseInt(need[1]), (long)Integer.parseInt(need[2]), 28, 2105, 0, 0, "");
         } else {
            String[] need = resource[0].split("\\|");
            if (!this.player.checkResourceNum(Integer.parseInt(need[0]), Integer.parseInt(need[1]), Integer.parseInt(need[2]))) {
               this.logger.info("金币不够");
               this.player.failure(28005);
               return;
            }

            this.player.delResource(Integer.parseInt(need[0]), Integer.parseInt(need[1]), (long)Integer.parseInt(need[2]), 28, 2105, 0, 0, "");
         }

         ++warJZDao.buyNum;
         warJZDao.updateOp();
         WarJZMsg.S2C_WarJZBuy_9106.Builder builder = WarJZMsg.S2C_WarJZBuy_9106.newBuilder();
         int teQuanBuyNum = 0;
         if (isPrivilege) {
            String teQuan = this.configManager.getStr("warOfJingZhouTeQuan");
            teQuanBuyNum = Integer.parseInt(teQuan.split("\\|")[0]);
         }

         int leftWarNum = teQuanBuyNum + fightNum + warJZDao.buyNum - warJZDao.warNum;
         int leftBuyNum = buyNum - warJZDao.buyNum + teQuanNum;
         builder.setBattleNum(leftWarNum);
         builder.setBuyNum(leftBuyNum);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_GetWarJZInfo_9101(WarJZMsg.C2S_WarJZRank_9107 msg, String channelId) {
      RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
      RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
      int myRank = rankPart.getRank(RankDefine.RankModule.WAR_JZ_PASS);
      int score = (int)rankPart.getScore(RankDefine.RankModule.WAR_JZ_PASS);
      WarJZMsg.S2C_WarJZRank_9108.Builder builder = WarJZMsg.S2C_WarJZRank_9108.newBuilder();
      WarJZMsg.RankInfo.Builder myInfo = WarJZMsg.RankInfo.newBuilder();
      PlayerDao playerDao = this.player.getPlayerDao();
      myInfo.setRank(myRank);
      myInfo.setPlayerId(this.player.getPlayerId());
      myInfo.setLv(playerDao.lv);
      myInfo.setName(playerDao.playerName);
      myInfo.setHead(playerDao.head);
      myInfo.setHeadFrame(playerDao.headFrame);
      myInfo.setFightVal(this.player.getPlayerCombatPower());
      myInfo.setServerId(this.player.getServerId());
      myInfo.setPassSum(score);
      builder.setMy(myInfo);
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);

      for(RankData data : rankMgr.getRanks(RankDefine.RankModule.WAR_JZ_PASS, 100)) {
         GamePlayer rankPlayer = worldMgr.getPlayerById(data.value);
         if (rankPlayer != null) {
            PlayerDao rankPlayerDao = (PlayerDao)rankPlayer.getData("tb_player", data.value);
            WarJZMsg.RankInfo.Builder info_builder = WarJZMsg.RankInfo.newBuilder();
            info_builder.setRank(data.rank);
            info_builder.setPlayerId(data.value);
            info_builder.setLv(rankPlayerDao.lv);
            info_builder.setName(rankPlayerDao.playerName);
            info_builder.setHead(rankPlayerDao.head);
            info_builder.setHeadFrame(rankPlayerDao.headFrame);
            info_builder.setFightVal(rankPlayer.getPlayerCombatPower());
            info_builder.setServerId(rankPlayer.getServerId());
            info_builder.setPassSum((int)data.score);
            builder.addInfos(info_builder);
         }
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_AllSweep_9110(WarJZMsg.C2S_AllSweep_9110 msg, String channelId) {
      int nation = msg.getNation();
      int day = this.getDayByNation(nation);
      WarJZDao warJZDao = this.getWarJZDao();
      if (!warJZDao.passMap.containsKey(day)) {
         this.player.failure(28006);
      } else {
         int today = DateUtil.todayOfWeek() - 1;
         if (today != 6 && today != 0 && day != today) {
            this.player.failure(28008);
         } else {
            int battleNum = 0;
            int sweepNum = 0;
            int teQuanNum = 0;
            boolean isPrivilege = false;
            PlayerDao playerDao = this.player.getPlayerDao();
            isPrivilege = playerDao.privilege_chi_bi > 0;
            if (isPrivilege) {
               String teQuan = this.configManager.getStr("warOfJingZhouTeQuan");
               teQuanNum = Integer.parseInt(teQuan.split("\\|")[0]);
            }

            int fightNum = this.configManager.getInt("warOfJingZhouFightNum");
            int leftWarNum = 0;
            leftWarNum = teQuanNum + fightNum + warJZDao.buyNum - warJZDao.warNum;
            if (leftWarNum <= 0) {
               this.player.failure(28007);
            } else {
               if (warJZDao.warDataMap.containsKey(day)) {
                  if (((WarJZData)warJZDao.warDataMap.get(day)).passStatus == 2 && ((WarJZData)warJZDao.warDataMap.get(day)).layerId == 10) {
                     sweepNum = leftWarNum;
                  } else {
                     int left = 10 - ((WarJZData)warJZDao.warDataMap.get(day)).layerId + 1;
                     if (leftWarNum < left) {
                        battleNum = leftWarNum;
                     } else {
                        battleNum = left;
                        sweepNum = leftWarNum - left;
                     }
                  }
               }

               List<ResourceModel> realList = new ArrayList();
               Map<Integer, WarOfJingZhouModel> modelMap = this.player.getGameModelPool().getMap("warOfJingZhou");
               List<WarOfJingZhouModel> modelList = new ArrayList();

               for(WarOfJingZhouModel data : modelMap.values()) {
                  if (data.getFaction() == nation) {
                     modelList.add(data);
                  }
               }

               if (battleNum > 0) {
                  if (((WarJZData)warJZDao.warDataMap.get(day)).passStatus == 2 && ((WarJZData)warJZDao.warDataMap.get(day)).layerId == 10) {
                     if (sweepNum > 0) {
                        for(int i = 0; i < modelList.size(); ++i) {
                           WarOfJingZhouModel model = (WarOfJingZhouModel)modelList.get(i);
                           if (model.getLayerId() == 10) {
                              for(int j = 0; j < sweepNum; ++j) {
                                 realList.addAll(model.getSweepRewards());
                              }
                              break;
                           }
                        }
                     }
                  } else {
                     int lastLayerId = 0;
                     List<Integer> layerList = new ArrayList();

                     for(int i = ((WarJZData)warJZDao.warDataMap.get(day)).layerId; i <= 10 && layerList.size() < battleNum; ++i) {
                        layerList.add(i);
                     }

                     for(int i = 0; i < layerList.size(); ++i) {
                        int layerId = (Integer)layerList.get(i);

                        for(int j = 0; j < modelList.size(); ++j) {
                           WarOfJingZhouModel model = (WarOfJingZhouModel)modelList.get(j);
                           if (model.getLayerId() == layerId) {
                              realList.addAll(model.getFirstRewards());
                              break;
                           }
                        }

                        lastLayerId = (Integer)layerList.get(i);
                     }

                     if (lastLayerId >= 10) {
                        ((WarJZData)warJZDao.warDataMap.get(day)).layerId = 10;
                        ((WarJZData)warJZDao.warDataMap.get(day)).passStatus = 2;
                     } else {
                        ((WarJZData)warJZDao.warDataMap.get(day)).layerId = lastLayerId + 1;
                        ((WarJZData)warJZDao.warDataMap.get(day)).passStatus = 1;
                     }

                     warJZDao.allPass += battleNum;
                     if (sweepNum > 0) {
                        for(int i = 0; i < modelList.size(); ++i) {
                           WarOfJingZhouModel model = (WarOfJingZhouModel)modelList.get(i);
                           if (model.getLayerId() == 10) {
                              for(int j = 0; j < sweepNum; ++j) {
                                 realList.addAll(model.getSweepRewards());
                              }
                              break;
                           }
                        }
                     }
                  }
               } else if (sweepNum > 0) {
                  for(int i = 0; i < modelList.size(); ++i) {
                     WarOfJingZhouModel model = (WarOfJingZhouModel)modelList.get(i);
                     if (model.getLayerId() == 10) {
                        for(int j = 0; j < sweepNum; ++j) {
                           realList.addAll(model.getSweepRewards());
                        }
                        break;
                     }
                  }
               }

               warJZDao.warNum += leftWarNum;
               warJZDao.updateOp();
               this.player.addResource(realList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 28, 518, 0, 0, String.valueOf(this.player.getPlayerId()));
               this.sendJZInfo(warJZDao);

               for(int i = 0; i < leftWarNum; ++i) {
                  this.player.triggerTask(515, 0, 1L, 1);
               }

               RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
               rankPart.updateRank(RankDefine.RankModule.WAR_JZ_PASS, (long)warJZDao.allPass, true);
               if (battleNum > 0) {
                  this.player.triggerTask(522, 0, (long)battleNum, 1);
               }

            }
         }
      }
   }

   private WarJZDao getWarJZDao() {
      WarJZDao warJZDao = (WarJZDao)this.player.getData("tb_war_jz", this.player.getPlayerId());
      if (warJZDao.warDataMap.isEmpty()) {
         String str = this.configManager.getStr("warOfJingZhouNameAndDesc");
         String[] arr = str.split(":");

         for(int i = 0; i < arr.length; ++i) {
            String[] realStr = arr[i].split("\\|");
            warJZDao.warDataMap.put(Integer.parseInt(realStr[0]), new WarJZData(Integer.parseInt(realStr[1]), 1, 1));
         }

         warJZDao.updateOp();
      }

      return warJZDao;
   }

   public void resetDaily() {
      this.getWarJZDao().resetDaily();
      if (DateUtil.todayOfWeek() == 7) {
         this.resetSaturday();
      }

      if (DateUtil.todayOfWeek() == 1 && !this.getWarJZDao().isRefresh) {
         this.resetSaturday();
      }

   }

   public void resetSaturday() {
      WarJZDao warJZDao = this.getWarJZDao();
      int maxPassId = 0;

      for(WarJZData warJZData : warJZDao.warDataMap.values()) {
         int lassId = warJZData.passStatus == 2 ? (warJZData.layerId >= 10 ? 10 : warJZData.layerId - 1) : warJZData.layerId - 1;
         maxPassId = Math.max(maxPassId, lassId);
      }

      this.player.triggerTask(339, 0, (long)maxPassId, 0);
      warJZDao.resetSaturday();
      warJZDao.isRefresh = true;
      warJZDao.updateOp();
   }

   public void resetWeek() {
      this.logger.info("荆州之战每周重置！！！");
      WarJZDao warJZDao = this.getWarJZDao();
      int maxPassId = 0;

      for(WarJZData warJZData : warJZDao.warDataMap.values()) {
         int lassId = warJZData.passStatus == 2 ? (warJZData.layerId >= 10 ? 10 : warJZData.layerId - 1) : warJZData.layerId - 1;
         maxPassId = Math.max(maxPassId, lassId);
      }

      this.player.triggerTask(339, 0, (long)maxPassId, 0);
      warJZDao.resetWeek();
   }

   @TaskMethod
   public void clearWeekPass() {
      WarJZDao warJZDao = this.getWarJZDao();
      warJZDao.allPass = 0;
      warJZDao.updateOp();
   }

   public int getallPass() {
      WarJZDao warJZDao = this.getWarJZDao();
      return warJZDao.allPass;
   }

   public void gmReset() {
      this.logger.info("gm发送荆州之战排名奖励！！！");
      this.resetWeek();
      this.getWarJZDao().resetDaily();
      this.rankMgr.sendWarRankAward();
   }
}
