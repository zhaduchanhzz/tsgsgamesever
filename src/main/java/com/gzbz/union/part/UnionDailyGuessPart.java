package com.gzbz.union.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.lang.WeightRandom;
import cn.hutool.core.util.RandomUtil;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.BattleDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerUnionDailyGuessDao;
import com.gzbz.db.UnionDailyGuessDao;
import com.gzbz.db.UnionDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.BattleModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.UnionDailyGuessChapterModel;
import com.gzbz.model.UnionDailyGuessEventModel;
import com.gzbz.model.UnionDailyGuessGridEventModel;
import com.gzbz.model.UnionDailyGuessMapModel;
import com.gzbz.model.UnionGateModel;
import com.gzbz.model.UnionGateRewardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.UnionDailyGuessEventFun;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.UnionDailyGuessMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionDailyGuessGridMgr;
import com.gzbz.union.UnionDailyGuessMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.union.bean.UnionDailyGuessChapterInfo;
import com.gzbz.union.bean.UnionDailyGuessGridInfo;
import com.gzbz.union.bean.UnionGateBattleRecordInfo;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.DateUtil;
import org.apache.commons.lang3.StringUtils;
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
public class UnionDailyGuessPart extends PlayerPart {
   private UnionDailyGuessGridMgr unionDailyGuessGridMgr = new UnionDailyGuessGridMgr();
   private List<Integer> _unlockSeeGridList = new ArrayList();
   @Autowired
   private UnionDailyGuessMgr unionDailyGuessMgr;
   @Autowired
   private UnionMgrParent unionMgrParent;
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private ChatMgr chatMgr;
   @Autowired
   private WorldMgr worldMgr;
   Logger logger = LoggerFactory.getLogger(UnionDailyGuessPart.class);

   public PlayerUnionDailyGuessDao getPlayerUnionDailyGuessDao(boolean sendErrorMsg) {
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.unionId <= 0) {
         if (sendErrorMsg) {
            this.player.failure(23);
         }

         return null;
      } else {
         UnionDailyGuessDao unionDailyGuessDao = this.unionDailyGuessMgr.getUnionDailyGuessDao(playerDao.unionId);
         if (null == unionDailyGuessDao) {
            if (sendErrorMsg) {
               this.player.failure(61196);
            }

            return null;
         } else {
            PlayerUnionDailyGuessDao dao = (PlayerUnionDailyGuessDao)this.player.getDataNoInsert("tb_player_union_daily_guess", this.player.getPlayerId());
            if (null == dao) {
               dao = new PlayerUnionDailyGuessDao();
               dao.playerId = this.player.getPlayerId();
               dao.unionId = playerDao.unionId;
               dao.resetTime = unionDailyGuessDao.resetTime;
               this.player.insertDao(dao, false);
            }

            return dao;
         }
      }
   }

   public boolean checkResetPlayerUnionDailyGuess(boolean sendErrorMsg, boolean checkEnd) {
      if (this.unionDailyGuessMgr.isResetting()) {
         if (sendErrorMsg) {
            this.player.failure(61194);
         }

         return false;
      } else {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (playerDao.unionId <= 0) {
            if (sendErrorMsg) {
               this.player.failure(23);
            }

            return false;
         } else {
            UnionDailyGuessDao unionDailyGuessDao = this.unionDailyGuessMgr.getUnionDailyGuessDao(playerDao.unionId);
            if (null == unionDailyGuessDao) {
               if (sendErrorMsg) {
                  this.player.failure(61196);
               }

               return false;
            } else {
               UnionDao unionDao = (UnionDao)this.unionMgrParent.getUnionDaoMap().get(unionDailyGuessDao.unionId);
               int unionGateLvRequire = ApplicationContextProvider.getConfigInt("unionGateLvRequire", 0);
               if (unionDao.level < unionGateLvRequire) {
                  if (sendErrorMsg) {
                     this.player.failure(61195);
                  }

                  return false;
               } else if (unionDailyGuessDao.unionLv < unionGateLvRequire) {
                  if (sendErrorMsg) {
                     this.player.failure(61196);
                  }

                  return false;
               } else {
                  PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(sendErrorMsg);
                  if (null == playerUnionDailyGuessDao) {
                     return false;
                  } else {
                     if (!DateUtil.isSameDay(unionDailyGuessDao.resetTime, playerUnionDailyGuessDao.resetTime)) {
                        this.sendRandomBoxEmail(unionDailyGuessDao.unionLv, playerUnionDailyGuessDao.currentChapter);
                        this.resetPlayerUnionDailyGuessDao(unionDailyGuessDao.resetTime);
                        this.sendChapterInfo(false);
                     }

                     if (playerDao.unionId != playerUnionDailyGuessDao.unionId) {
                        return sendErrorMsg ? this.player.failure(76020) : false;
                     } else if (checkEnd && playerUnionDailyGuessDao.allPassState != 0) {
                        return sendErrorMsg ? this.player.failure(61201) : false;
                     } else {
                        return true;
                     }
                  }
               }
            }
         }
      }
   }

   public UnionGateModel sendRandomBox(int unionLv) {
      PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(false);
      if (null == playerUnionDailyGuessDao) {
         return null;
      } else {
         UnionGateModel randomBox = this.getRandomUnionGateByUnionLv(unionLv);
         if (null == randomBox) {
            this.logger.info("UnionGate表 随机奖励为空 unionLv:{}", unionLv);
            return null;
         } else {
            this.player.addResource(randomBox.getReward(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 9, 938, 0, 0, "");
            playerUnionDailyGuessDao.rewardList.addAll(randomBox.getReward());
            playerUnionDailyGuessDao.updateOp();
            return randomBox;
         }
      }
   }

   public void sendRandomBoxEmail(int unionLv, int currentChapter) {
      PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(false);
      if (null != playerUnionDailyGuessDao) {
         if (currentChapter > 0 && playerUnionDailyGuessDao.allPassState == 0 && playerUnionDailyGuessDao.state == 2) {
            UnionGateModel unionGateModel = this.getRandomUnionGateByUnionLv(unionLv);
            if (null != unionGateModel) {
               Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_UNION_DAILY_GUESS_CHAPTER);
               CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               String desc = MessageFormat.format(centreAwardModel.getDesc(), this.getPassChapterCount(currentChapter));
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), desc, unionGateModel.getReward(), 604800000L, 9, 938);
            }
         }

      }
   }

   public UnionGateModel getRandomUnionGateByUnionLv(int unionLv) {
      String unionGateLvRewardStr = ApplicationContextProvider.getConfigString("unionGateLvReward", "");
      if (StringUtils.isBlank(unionGateLvRewardStr)) {
         this.logger.info("config表没有配置unionGateLvReward");
         return null;
      } else {
         String[] unionLv_poorId_array = unionGateLvRewardStr.split(",");
         int poorId = 0;

         for(String unionLv_poorId_str : unionLv_poorId_array) {
            String[] unionLv_poorId = unionLv_poorId_str.split("\\|");
            if (unionLv_poorId.length >= 2) {
               int lv = Integer.parseInt(unionLv_poorId[0]);
               int id = Integer.parseInt(unionLv_poorId[1]);
               if (unionLv <= lv) {
                  poorId = id;
                  break;
               }
            }
         }

         if (poorId <= 0) {
            String unionLv_poorId_str = unionLv_poorId_array[unionLv_poorId_array.length - 1];
            String[] unionLv_poorId = unionLv_poorId_str.split("\\|");
            poorId = Integer.parseInt(unionLv_poorId[1]);
         }

         TreeMap<Integer, UnionGateModel> unionGateModelMap = (TreeMap)ApplicationContextProvider.getModelPoolEntity("customUnionGate", poorId);
         if (null != unionGateModelMap && !unionGateModelMap.isEmpty()) {
            Collection<UnionGateModel> unionGateModelColl = unionGateModelMap.values();
            List<WeightRandom.WeightObj<UnionGateModel>> weightObjList = new ArrayList();

            for(UnionGateModel ugm : unionGateModelColl) {
               weightObjList.add(new WeightRandom.WeightObj(ugm, (double)ugm.getWeight()));
            }

            WeightRandom<UnionGateModel> unionGateModelWeightRandom = RandomUtil.weightRandom(weightObjList);
            if (null == unionGateModelWeightRandom) {
               return (UnionGateModel)unionGateModelMap.firstEntry().getValue();
            } else {
               UnionGateModel unionGateModel = (UnionGateModel)unionGateModelWeightRandom.next();
               return null == unionGateModel ? (UnionGateModel)unionGateModelMap.firstEntry().getValue() : unionGateModel;
            }
         } else {
            this.logger.info("随机获取UnionGate为空 poorId:" + poorId);
            return null;
         }
      }
   }

   public int getPassChapterCount(int currentChapterId) {
      if (currentChapterId <= 0) {
         return 0;
      } else {
         UnionDailyGuessChapterModel unionDailyGuessChapterModel = (UnionDailyGuessChapterModel)this.player.getGameModelPool().getEntity("unionGateChapter", currentChapterId);
         return null == unionDailyGuessChapterModel ? 0 : unionDailyGuessChapterModel.getOrderNum();
      }
   }

   public void resetPlayerUnionDailyGuessDao(long resetTime) {
      PlayerUnionDailyGuessDao dao = this.getPlayerUnionDailyGuessDao(true);
      if (null != dao) {
         dao.unionId = this.player.getPlayerDao().unionId;
         dao.currentChapter = 0;
         dao.version = 0;
         dao.curGrid = 0;
         dao.state = 0;
         dao.seeGridSet.clear();
         dao.gridInfoMap.clear();
         dao.enemyDataMap.clear();
         dao.allPassState = 0;
         dao.resetTime = resetTime;
         dao.passOrderMap.clear();
         dao.shareState = 0;
         dao.rewardList.clear();
         dao.updateOp();
      }
   }

   public int enterBattle(BattleDao battleDao) {
      if (!this.checkResetPlayerUnionDailyGuess(true, false)) {
         return 0;
      } else {
         List<Integer> params = battleDao.params;
         if (params != null && params.size() >= 1) {
            int grid = (Integer)params.get(0);
            if (!this.checkEventLegal(grid, 1)) {
               return 61197;
            } else {
               PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(true);
               if (playerUnionDailyGuessDao == null) {
                  this.logger.info("找不到军团猜门数据 currentChapter:{}", playerUnionDailyGuessDao.currentChapter);
                  return 23;
               } else if (!playerUnionDailyGuessDao.gridInfoMap.containsKey(grid)) {
                  this.logger.info("军团猜门 - 该格子没有事件，不可攻打 grid:{}", grid);
                  return 6;
               } else {
                  UnionDailyGuessGridInfo unionDailyGuessGridInfo = (UnionDailyGuessGridInfo)playerUnionDailyGuessDao.gridInfoMap.get(grid);
                  UnionDailyGuessEventFun eventFun = unionDailyGuessGridInfo.curEventFunc();
                  if (null == eventFun) {
                     return 61200;
                  } else {
                     UnionDailyGuessEventModel eventModel = (UnionDailyGuessEventModel)this.player.getGameModelPool().getEntity("customUnionGateEvent", String.format("%d_%d", eventFun.getType(), eventFun.getId()));
                     if (eventModel != null && (Integer)eventModel.getParam().get(1) == battleDao.modelId) {
                        BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", battleDao.modelId);
                        if (battleModel == null) {
                           return 6;
                        } else {
                           BattlePKTeam myPKTeam = battleDao.scene.getPKTeam((byte)0);
                           if (myPKTeam.getEntityMap().size() == 0) {
                              return 4125;
                           } else {
                              BattlePKTeam enemyPKTeam = new BattlePKTeam(battleDao.modelId);
                              battleDao.scene.addPKTeam((byte)1, enemyPKTeam);
                              int unionGateFightTurn = this.configManager.getIntDefault("unionGateFightTurn", 17);
                              battleDao.scene.setMaxRound((byte)unionGateFightTurn);
                              this.unionDailyGuessMgr.pushTask(() -> this.unionDailyGuessMgr.addIntoChapterPlayerIds(this.player.getPlayerDao().unionId, this.player.getPlayerId()));
                              return 1;
                           }
                        }
                     } else {
                        return 6;
                     }
                  }
               }
            }
         } else {
            return 0;
         }
      }
   }

   public void afterFight(BattleDao battleDao) {
      List<Integer> params = battleDao.params;
      int grid = (Integer)params.get(0);
      PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(false);
      if (playerUnionDailyGuessDao != null) {
         if (battleDao.scene.getWinForce() == 0) {
            this.checkAndSetNextEvent(grid);
            this.fightPassed(grid);
         }

         battleDao.scene.getBattleMsg().addAllExParams(params);
      }
   }

   public void fightPassed(int grid) {
      PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(false);
      if (null != playerUnionDailyGuessDao) {
         Integer passed = (Integer)playerUnionDailyGuessDao.enemyDataMap.get(grid);
         if (null != passed && passed == 0) {
            playerUnionDailyGuessDao.enemyDataMap.put(grid, 1);
         }

         Collection<Integer> passedList = playerUnionDailyGuessDao.enemyDataMap.values();
         boolean isComplete = true;

         for(Integer passState : passedList) {
            if (passState == 0) {
               isComplete = false;
               break;
            }
         }

         if (isComplete) {
            playerUnionDailyGuessDao.state = 2;
            PlayerDao playerDao = this.player.getPlayerDao();
            this.unionDailyGuessMgr.pushTask(() -> this.unionDailyGuessMgr.setChapterCanPassBattle(playerDao.unionId, playerUnionDailyGuessDao.currentChapter));
         }

         playerUnionDailyGuessDao.updateOp();
      }
   }

   public boolean checkCanPassBattle(int grid) {
      int unionId = this.player.getPlayerDao().unionId;
      if (unionId <= 0) {
         return false;
      } else {
         PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(false);
         UnionDailyGuessDao unionDailyGuessDao = this.unionDailyGuessMgr.getUnionDailyGuessDao(unionId);
         if (null != playerUnionDailyGuessDao && null != unionDailyGuessDao) {
            if (!playerUnionDailyGuessDao.enemyDataMap.containsKey(grid)) {
               return false;
            } else {
               UnionDailyGuessChapterInfo unionDailyGuessChapterInfo = (UnionDailyGuessChapterInfo)unionDailyGuessDao.chapterInfo.get(playerUnionDailyGuessDao.currentChapter);
               if (null == unionDailyGuessChapterInfo) {
                  return false;
               } else {
                  Integer passState = (Integer)playerUnionDailyGuessDao.enemyDataMap.get(grid);
                  int canPassBattle = unionDailyGuessChapterInfo.getCanPassBattle();
                  return passState == 1 || canPassBattle == 1;
               }
            }
         } else {
            return false;
         }
      }
   }

   private void checkAndSetNextEvent(int grid) {
      PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(false);
      if (null != playerUnionDailyGuessDao) {
         if (playerUnionDailyGuessDao.gridInfoMap.containsKey(grid)) {
            UnionDailyGuessGridInfo unionDailyGuessGridInfo = (UnionDailyGuessGridInfo)playerUnionDailyGuessDao.gridInfoMap.get(grid);
            if (unionDailyGuessGridInfo.getEventIdx() != 0) {
               UnionDailyGuessMapModel mapModel = this.getMapModel(grid);
               if (null != mapModel) {
                  int nextIdx = unionDailyGuessGridInfo.getEventIdx() + 1;
                  List<UnionDailyGuessEventFun> eventFunList = unionDailyGuessGridInfo.getEventFunList();
                  List<Integer> gridIdList = new ArrayList();
                  gridIdList.add(grid);
                  if (eventFunList.size() >= nextIdx) {
                     for(int idx = nextIdx - 1; idx < eventFunList.size(); ++idx) {
                        UnionDailyGuessEventFun eventFun = (UnionDailyGuessEventFun)eventFunList.get(nextIdx - 1);
                        if (eventFun.getType() == 5) {
                           List<Integer> changeList = this.changeGrid(eventFun.getType(), eventFun.getId());
                           gridIdList.addAll(changeList);
                           this._unlockSeeGridList.addAll(changeList);
                           ++nextIdx;
                        } else {
                           if (eventFun.getType() != 3) {
                              break;
                           }

                           ++nextIdx;
                        }
                     }
                  }

                  if (nextIdx > eventFunList.size()) {
                     nextIdx = 0;
                  }

                  unionDailyGuessGridInfo.setEventIdx(nextIdx);
                  playerUnionDailyGuessDao.updateOp();
                  this.notifyUnlockSeeGrids();
                  this.noticeUpdateGridInfo(gridIdList);
               }
            }
         }
      }
   }

   public void sendRandomBoxAndFinish(UnionDailyGuessDao unionDailyGuessDao, PlayerUnionDailyGuessDao playerUnionDailyGuessDao) {
      playerUnionDailyGuessDao.state = 2;
      UnionDailyGuessChapterInfo chapterInfo = (UnionDailyGuessChapterInfo)unionDailyGuessDao.chapterInfo.get(playerUnionDailyGuessDao.currentChapter);
      if (null != chapterInfo) {
         if (chapterInfo.getNextChapterGrid() != -1) {
            playerUnionDailyGuessDao.allPassState = -1;
            this.sendRandomBox(unionDailyGuessDao.unionLv);
            this.sendShowResult_16022(0, playerUnionDailyGuessDao.rewardList);
         } else {
            playerUnionDailyGuessDao.allPassState = 1;
            this.unionDailyGuessMgr.pushTask(() -> {
               this.unionDailyGuessMgr.addCompletePlayerIds(unionDailyGuessDao.unionId, this.player.getPlayerId());
               boolean addSuccess = this.unionDailyGuessMgr.setFirstPassPlayerId(unionDailyGuessDao.unionId, this.player.getPlayerId());
               if (addSuccess) {
                  this.player.pushTask(() -> {
                     this.sendFirstPassReward(unionDailyGuessDao.unionLv);
                     this.sendShowResult_16022(1, playerUnionDailyGuessDao.rewardList);
                  });
               } else {
                  this.player.pushTask(() -> {
                     this.sendRandomBox(unionDailyGuessDao.unionLv);
                     this.sendShowResult_16022(1, playerUnionDailyGuessDao.rewardList);
                  });
               }

            });
            this.addBattleRecord(playerUnionDailyGuessDao.currentChapter);
         }

         playerUnionDailyGuessDao.updateOp();
      }
   }

   public void addBattleRecord(int chapterId) {
      PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(false);
      if (null != playerUnionDailyGuessDao) {
         this.unionDailyGuessMgr.pushTask(() -> {
            UnionGateBattleRecordInfo recordInfo = new UnionGateBattleRecordInfo(chapterId, this.player.getPlayerId(), System.currentTimeMillis(), 1);
            this.unionDailyGuessMgr.addBattleRecord(playerUnionDailyGuessDao.unionId, recordInfo);
         });
      }
   }

   public void sendFirstPassReward(int unionLv) {
      PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(false);
      if (null != playerUnionDailyGuessDao) {
         UnionGateRewardModel rewardModel = (UnionGateRewardModel)ApplicationContextProvider.getModelPoolEntity("unionGateReward", unionLv);
         if (null == rewardModel) {
            this.logger.info("军团等级:{} UnionGateReward为空", unionLv);
         } else {
            this.player.addResource(rewardModel.getFirstClearReward(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 9, 936, 0, 0, "");
            playerUnionDailyGuessDao.rewardList.addAll(rewardModel.getFirstClearReward());
            playerUnionDailyGuessDao.updateOp();
         }
      }
   }

   private void noticeUpdateGridInfo(List<Integer> gridIdList) {
      if (gridIdList != null && gridIdList.size() != 0) {
         PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(false);
         UnionDailyGuessMsg.S2C_UpdateGridInfo_16006.Builder builder = UnionDailyGuessMsg.S2C_UpdateGridInfo_16006.newBuilder();

         for(Integer tempGridId : gridIdList) {
            UnionDailyGuessMsg.S2C_GridInfo_16004.Builder gridInfoBuilder = UnionDailyGuessMsg.S2C_GridInfo_16004.newBuilder();
            gridInfoBuilder.setGrid(tempGridId);
            UnionDailyGuessGridInfo unionDailyGuessGridInfo = (UnionDailyGuessGridInfo)playerUnionDailyGuessDao.gridInfoMap.get(tempGridId);
            if (unionDailyGuessGridInfo != null) {
               gridInfoBuilder.setEventIdx(unionDailyGuessGridInfo.getEventIdx());
               gridInfoBuilder.setState(unionDailyGuessGridInfo.state);
            } else {
               gridInfoBuilder.setEventIdx(0);
               gridInfoBuilder.setState(0);
            }

            builder.addInfo(gridInfoBuilder);
         }

         this.player.sendMsg(builder.build());
      }
   }

   private List<Integer> changeGrid(int eventType, int eventId) {
      List<Integer> gridIdList = new ArrayList();
      PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(false);
      if (playerUnionDailyGuessDao == null) {
         return gridIdList;
      } else if (eventType != 5) {
         return gridIdList;
      } else {
         UnionDailyGuessEventModel eventModel = (UnionDailyGuessEventModel)this.player.getGameModelPool().getEntity("customUnionGateEvent", String.format("%d_%d", eventType, eventId));
         if (eventModel != null && !StringUtils.isBlank(eventModel.getArgs())) {
            String[] strings = eventModel.getArgs().split(",");

            for(int i = 0; i < strings.length; ++i) {
               String[] arr = strings[i].split("\\|");
               int grid = Integer.parseInt(arr[0]);
               UnionDailyGuessMapModel mapModel = this.getMapModel(grid);
               if (mapModel != null) {
                  UnionDailyGuessGridInfo gridInfo = (UnionDailyGuessGridInfo)playerUnionDailyGuessDao.gridInfoMap.get(grid);
                  if (null == gridInfo) {
                     gridInfo = new UnionDailyGuessGridInfo();
                     gridInfo.gridId = grid;
                     gridInfo.state = 1;
                     playerUnionDailyGuessDao.gridInfoMap.put(grid, gridInfo);
                  }

                  UnionDailyGuessGridEventModel gridEventModel = (UnionDailyGuessGridEventModel)this.player.getGameModelPool().getEntity("unionGateGridEvent", mapModel.getChangeEventId());
                  List<UnionDailyGuessEventFun> eventFuns = (List<UnionDailyGuessEventFun>)(gridEventModel != null ? gridEventModel.getEvent() : new ArrayList());
                  gridInfo.changeGrid(eventFuns);
                  gridInfo.state = 2;
                  gridIdList.add(grid);
                  if (playerUnionDailyGuessDao.enemyDataMap.containsKey(grid)) {
                     playerUnionDailyGuessDao.enemyDataMap.remove(grid);
                  }
               } else {
                  this.logger.info("军团猜门更改格子状态 - grid:{}配置错误", grid);
               }
            }

            playerUnionDailyGuessDao.updateOp();
            return gridIdList;
         } else {
            return gridIdList;
         }
      }
   }

   private void notifyUnlockSeeGrids() {
      if (!this._unlockSeeGridList.isEmpty()) {
         UnionDailyGuessMsg.S2C_UnlockSeeGrids_16005.Builder builder = UnionDailyGuessMsg.S2C_UnlockSeeGrids_16005.newBuilder();
         builder.addAllGrid(this._unlockSeeGridList);
         this.player.sendMsg(builder.build());
         this._unlockSeeGridList.clear();
      }
   }

   private boolean checkEventLegal(int grid, int eventType) {
      PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(true);
      if (playerUnionDailyGuessDao != null && playerUnionDailyGuessDao.seeGridSet.contains(grid)) {
         if (!playerUnionDailyGuessDao.gridInfoMap.containsKey(grid)) {
            return this.player.failure(61199);
         } else {
            UnionDailyGuessGridInfo unionDailyGuessGridInfo = (UnionDailyGuessGridInfo)playerUnionDailyGuessDao.gridInfoMap.get(grid);
            int eventIdx = unionDailyGuessGridInfo.getEventIdx();
            if (eventIdx == 0) {
               return this.player.failure(61200);
            } else {
               UnionDailyGuessEventFun eventFun = unionDailyGuessGridInfo.curEventFunc();
               return eventFun != null && eventFun.getType() != eventType ? this.player.failure(61199) : true;
            }
         }
      } else {
         return this.player.failure(61198);
      }
   }

   private boolean checkMoveLegal(List<Integer> passGrids) {
      PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(true);
      if (null == playerUnionDailyGuessDao) {
         return false;
      } else {
         int lastGrid = 0;

         for(int i = 0; i < passGrids.size(); ++i) {
            int grid = (Integer)passGrids.get(i);
            if (!playerUnionDailyGuessDao.seeGridSet.contains(grid)) {
               return false;
            }

            UnionDailyGuessGridInfo unionDailyGuessGridInfo = (UnionDailyGuessGridInfo)playerUnionDailyGuessDao.gridInfoMap.get(grid);
            if (unionDailyGuessGridInfo != null && unionDailyGuessGridInfo.getEventIdx() != 0) {
               return false;
            }

            Set<Integer> near = this.unionDailyGuessGridMgr.getNear(grid);
            if (lastGrid != 0 && !near.contains(lastGrid)) {
               this.logger.info("格子序号{} 和 {}不相邻，不能移动", lastGrid, grid);
               return false;
            }

            lastGrid = grid;
         }

         return true;
      }
   }

   public void loginHandle() {
      this.checkResetPlayerUnionDailyGuess(false, false);
      this.checkChapterVersion();
      this.getChapterOrderNumber(1, 12);
   }

   private void checkChapterVersion() {
      PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(false);
      if (null != playerUnionDailyGuessDao) {
         if (playerUnionDailyGuessDao.currentChapter > 0) {
            UnionDailyGuessChapterModel unionDailyGuessChapterModel = (UnionDailyGuessChapterModel)this.player.getGameModelPool().getEntity("unionGateChapter", playerUnionDailyGuessDao.currentChapter);
            if (null != unionDailyGuessChapterModel) {
               if (unionDailyGuessChapterModel.getVersion() != playerUnionDailyGuessDao.version) {
                  this.unionDailyGuessMgr.pushTask(() -> {
                     this.unionDailyGuessMgr.checkChapterInfoChange(playerUnionDailyGuessDao.currentChapter, this.player.getPlayerDao().unionId);
                     this.player.pushTask(() -> this.initPlayerUnionDailyGuessChapter(playerUnionDailyGuessDao, playerUnionDailyGuessDao.currentChapter));
                  });
               }

            }
         }
      }
   }

   public int getFirstChapterId() {
      Map<Integer, UnionDailyGuessChapterModel> unionDailyGuessChapterModelMap = this.player.getGameModelPool().getMap("unionGateChapter");

      for(UnionDailyGuessChapterModel value : unionDailyGuessChapterModelMap.values()) {
         if (value.getPreChapterId() <= 0) {
            return value.getId();
         }
      }

      return 0;
   }

   public boolean initPlayerUnionDailyGuessChapter(PlayerUnionDailyGuessDao dao, int chapterId) {
      if (dao == null) {
         return this.player.failure(61202);
      } else {
         UnionDailyGuessChapterModel unionDailyGuessChapterModel = (UnionDailyGuessChapterModel)this.player.getGameModelPool().getEntity("unionGateChapter", chapterId);
         if (null == unionDailyGuessChapterModel) {
            return this.player.failure(61203);
         } else {
            Map<Integer, UnionDailyGuessMapModel> treeMap = this.player.getGameModelPool().getMap("unionGateMap");
            if (null != treeMap && !treeMap.isEmpty()) {
               UnionDailyGuessDao unionDailyGuessDao = this.unionDailyGuessMgr.getUnionDailyGuessDao(this.player.getPlayerDao().unionId);
               if (null == unionDailyGuessDao) {
                  return this.player.failure(61196);
               } else {
                  UnionDailyGuessChapterInfo unionDailyGuessChapterInfo = (UnionDailyGuessChapterInfo)unionDailyGuessDao.chapterInfo.get(chapterId);
                  if (null == unionDailyGuessChapterInfo) {
                     return this.player.failure(61203);
                  } else {
                     dao.currentChapter = chapterId;
                     dao.version = unionDailyGuessChapterModel.getVersion();
                     dao.curGrid = unionDailyGuessChapterModel.getInitGrid();
                     dao.state = 1;
                     dao.seeGridSet.clear();
                     dao.gridInfoMap.clear();
                     dao.allPassState = 0;
                     dao.enemyDataMap.clear();
                     dao.seeGridSet.addAll(unionDailyGuessChapterModel.getSeeGrids());

                     for(Map.Entry<Integer, UnionDailyGuessMapModel> entry : treeMap.entrySet()) {
                        Integer gridId = (Integer)entry.getKey();
                        UnionDailyGuessMapModel mapModel = (UnionDailyGuessMapModel)entry.getValue();
                        UnionDailyGuessGridInfo unionDailyGuessGridInfo = new UnionDailyGuessGridInfo();
                        unionDailyGuessGridInfo.gridId = gridId;
                        unionDailyGuessGridInfo.state = unionDailyGuessChapterModel.getSeeGrids().contains(gridId) ? 1 : 0;
                        if (mapModel.getGridEventId() > 0) {
                           UnionDailyGuessGridEventModel gridEventModel = (UnionDailyGuessGridEventModel)this.player.getGameModelPool().getEntity("unionGateGridEvent", mapModel.getGridEventId());
                           if (gridEventModel != null && gridEventModel.getEvent().size() > 0) {
                              unionDailyGuessGridInfo.changeGrid(gridEventModel.getEvent());
                           } else {
                              this.logger.info("军团猜门格子事件配置错误 grid:{} gridEventId:{}", gridId, mapModel.getGridEventId());
                           }
                        }

                        if (mapModel.getGridEventId() > 0 || mapModel.getChangeEventId() > 0) {
                           dao.gridInfoMap.put(gridId, unionDailyGuessGridInfo);
                        }
                     }

                     dao.updateOp();
                     return true;
                  }
               }
            } else {
               return this.player.failure(61203);
            }
         }
      }
   }

   public UnionDailyGuessChapterModel getNextChapter(int chapterId) {
      if (chapterId <= 0) {
         chapterId = this.getFirstChapterId();
      }

      UnionDailyGuessChapterModel unionDailyGuessChapterModel = (UnionDailyGuessChapterModel)this.player.getGameModelPool().getEntity("unionGateChapter", chapterId);
      if (null == unionDailyGuessChapterModel) {
         return null;
      } else {
         int postChapterId = unionDailyGuessChapterModel.getPostChapterId();
         if (postChapterId <= 0) {
            return null;
         } else {
            UnionDailyGuessChapterModel chapterModel = (UnionDailyGuessChapterModel)this.player.getGameModelPool().getEntity("unionGateChapter", postChapterId);
            return chapterModel;
         }
      }
   }

   private UnionDailyGuessMapModel getMapModel(int grid) {
      Map<Integer, UnionDailyGuessMapModel> mapModelMap = this.player.getGameModelPool().getMap("unionGateMap");
      return null != mapModelMap ? (UnionDailyGuessMapModel)mapModelMap.get(grid) : null;
   }

   @MsgHandlerAnno
   public void C2S_EnterChapter_16002(UnionDailyGuessMsg.C2S_EnterChapter_16002 msg, String source) {
      PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(true);
      if (null != playerUnionDailyGuessDao) {
         if (this.player.getPlayerDao().unionId != playerUnionDailyGuessDao.unionId) {
            this.player.failure(76020);
         } else {
            if (playerUnionDailyGuessDao.allPassState == 0) {
               this.sendChapterInfo(true);
            } else if (playerUnionDailyGuessDao.allPassState == -1) {
               this.sendShowResult_16022(0, playerUnionDailyGuessDao.rewardList);
            } else {
               this.sendShowResult_16022(1, playerUnionDailyGuessDao.rewardList);
            }

         }
      }
   }

   public boolean sendChapterInfo(boolean isRequest) {
      if (!this.checkResetPlayerUnionDailyGuess(true, false)) {
         return false;
      } else {
         PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(true);
         if (null == playerUnionDailyGuessDao) {
            return false;
         } else if (playerUnionDailyGuessDao.allPassState == 0 && playerUnionDailyGuessDao.currentChapter == 0 && !this.initPlayerUnionDailyGuessChapter(playerUnionDailyGuessDao, this.getFirstChapterId())) {
            return false;
         } else {
            UnionDailyGuessChapterModel unionDailyGuessChapterModel = (UnionDailyGuessChapterModel)this.player.getGameModelPool().getEntity("unionGateChapter", playerUnionDailyGuessDao.currentChapter);
            PlayerDao playerDao = this.player.getPlayerDao();
            UnionDailyGuessDao unionDailyGuessDao = this.unionDailyGuessMgr.getUnionDailyGuessDao(playerDao.unionId);
            if (null == unionDailyGuessDao) {
               return this.player.failure(61196);
            } else {
               UnionDailyGuessChapterInfo unionDailyGuessChapterInfo = (UnionDailyGuessChapterInfo)unionDailyGuessDao.chapterInfo.get(playerUnionDailyGuessDao.currentChapter);
               if (null == unionDailyGuessChapterInfo) {
                  return this.player.failure(61203);
               } else {
                  UnionDailyGuessMsg.S2C_EnterChapter_16003.Builder respondBuilder = UnionDailyGuessMsg.S2C_EnterChapter_16003.newBuilder();
                  respondBuilder.setCurrentChapter(playerUnionDailyGuessDao.currentChapter);
                  respondBuilder.setCurGrid(playerUnionDailyGuessDao.curGrid);
                  respondBuilder.setHeroId(unionDailyGuessChapterModel.getHeroId());
                  respondBuilder.setMapGroup(unionDailyGuessChapterInfo.getMapGroup());
                  if (isRequest) {
                     respondBuilder.setType(1);
                  } else {
                     respondBuilder.setType(2);
                  }

                  respondBuilder.setUnionLevel(unionDailyGuessDao.unionLv);

                  for(int gridId : playerUnionDailyGuessDao.seeGridSet) {
                     UnionDailyGuessGridInfo unionDailyGuessGridInfo = (UnionDailyGuessGridInfo)playerUnionDailyGuessDao.gridInfoMap.get(gridId);
                     UnionDailyGuessMsg.S2C_GridInfo_16004.Builder gridInfoBuilder = UnionDailyGuessMsg.S2C_GridInfo_16004.newBuilder();
                     gridInfoBuilder.setGrid(gridId);
                     int eventIdx = unionDailyGuessGridInfo != null ? unionDailyGuessGridInfo.getEventIdx() : 0;
                     gridInfoBuilder.setEventIdx(eventIdx);
                     if (unionDailyGuessGridInfo != null) {
                        gridInfoBuilder.setEventIdx(unionDailyGuessGridInfo.getEventIdx());
                        gridInfoBuilder.setState(unionDailyGuessGridInfo.state);
                     } else {
                        gridInfoBuilder.setEventIdx(0);
                        gridInfoBuilder.setState(0);
                     }

                     respondBuilder.addGridInfo(gridInfoBuilder);
                  }

                  this.player.sendMsg(respondBuilder.build());
                  this.unionDailyGuessGridMgr.init(unionDailyGuessChapterModel.getMapH(), unionDailyGuessChapterModel.getMapW());
                  return true;
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_SkipBattle_16007(UnionDailyGuessMsg.C2S_SkipBattle_16007 msg, String source) {
      if (!this.checkResetPlayerUnionDailyGuess(true, true)) {
         return false;
      } else {
         PlayerDao playerDao = this.player.getPlayerDao();
         PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(true);
         if (null == playerUnionDailyGuessDao) {
            return false;
         } else {
            UnionDailyGuessDao unionDailyGuessDao = this.unionDailyGuessMgr.getUnionDailyGuessDao(playerDao.unionId);
            if (null == unionDailyGuessDao) {
               return this.player.failure(61196);
            } else {
               int gridId = msg.getGridId();
               if (!this.checkCanPassBattle(gridId)) {
                  return this.player.failure(61204);
               } else {
                  this.checkAndSetNextEvent(gridId);
                  this.fightPassed(gridId);
                  playerUnionDailyGuessDao.updateOp();
                  UnionDailyGuessMsg.S2C_SkipBattle_16008.Builder builder = UnionDailyGuessMsg.S2C_SkipBattle_16008.newBuilder();
                  this.player.sendMsg(builder.build());
                  this.unionDailyGuessMgr.pushTask(() -> this.unionDailyGuessMgr.addIntoChapterPlayerIds(this.player.getPlayerDao().unionId, this.player.getPlayerId()));
                  return true;
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Move_16009(UnionDailyGuessMsg.C2S_Move_16009 msg, String source) {
      if (!this.checkResetPlayerUnionDailyGuess(true, true)) {
         return false;
      } else {
         int oriGrid = msg.getOriGrid();
         int destGrid = msg.getDestGrid();
         List<Integer> passGridList = msg.getPassGridList();
         PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(true);
         if (null == playerUnionDailyGuessDao) {
            return false;
         } else if (!passGridList.contains(destGrid)) {
            return this.player.failure(61205);
         } else {
            UnionDailyGuessMsg.S2C_Move_16010.Builder builder = UnionDailyGuessMsg.S2C_Move_16010.newBuilder();
            if (this.checkMoveLegal(passGridList)) {
               playerUnionDailyGuessDao.curGrid = destGrid;
               playerUnionDailyGuessDao.updateOp();
               builder.setResult(1);
               builder.setDestGrid(destGrid);
            } else {
               builder.setResult(0);
               builder.setDestGrid(oriGrid);
            }

            this.player.sendMsg(builder.build());
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_SelectRandomBox_16012(UnionDailyGuessMsg.C2S_SelectRandomBox_16012 msg, String source) {
      if (!this.checkResetPlayerUnionDailyGuess(true, true)) {
         return false;
      } else {
         int grid = msg.getGrid();
         PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(true);
         if (null == playerUnionDailyGuessDao) {
            return false;
         } else if (playerUnionDailyGuessDao.state != 2) {
            return this.player.failure(61208);
         } else {
            UnionDailyGuessGridInfo unionDailyGuessGridInfo = (UnionDailyGuessGridInfo)playerUnionDailyGuessDao.gridInfoMap.get(grid);
            if (null == unionDailyGuessGridInfo) {
               return this.player.failure(61197);
            } else if (unionDailyGuessGridInfo.getEventIdx() == 0) {
               return this.player.failure(61200);
            } else {
               UnionDailyGuessEventFun eventFun = unionDailyGuessGridInfo.curEventFunc();
               if (eventFun.getType() != 2) {
                  return this.player.failure(61199);
               } else {
                  UnionDailyGuessDao unionDailyGuessDao = this.unionDailyGuessMgr.getUnionDailyGuessDao(this.player.getPlayerDao().unionId);
                  if (null == unionDailyGuessDao) {
                     return this.player.failure(61196);
                  } else {
                     UnionDailyGuessChapterInfo unionDailyGuessChapterInfo = (UnionDailyGuessChapterInfo)unionDailyGuessDao.chapterInfo.get(playerUnionDailyGuessDao.currentChapter);
                     if (null == unionDailyGuessChapterInfo) {
                        return this.player.failure(61203);
                     } else {
                        UnionDailyGuessChapterModel nextChapter = this.getNextChapter(playerUnionDailyGuessDao.currentChapter);
                        UnionDailyGuessMsg.S2C_SelectRandomBox_16013.Builder builder = UnionDailyGuessMsg.S2C_SelectRandomBox_16013.newBuilder();
                        playerUnionDailyGuessDao.passOrderMap.put(unionDailyGuessChapterInfo.getChapterId(), this.getChapterOrderNumber(unionDailyGuessChapterInfo.getChapterId(), grid));
                        if (null != nextChapter && unionDailyGuessChapterInfo.getNextChapterGrid() == grid) {
                           this.addBattleRecord(playerUnionDailyGuessDao.currentChapter);
                           this.initPlayerUnionDailyGuessChapter(playerUnionDailyGuessDao, nextChapter.getId());
                           builder.setResult(1);
                           this.sendChapterInfo(false);
                        } else {
                           this.sendRandomBoxAndFinish(unionDailyGuessDao, playerUnionDailyGuessDao);
                           unionDailyGuessGridInfo.setEventIdx(0);
                           playerUnionDailyGuessDao.updateOp();
                           builder.setResult(0);
                        }

                        this.player.sendMsg(builder.build());
                        return true;
                     }
                  }
               }
            }
         }
      }
   }

   public void sendShowResult_16022(int endType, List<ResourceModel> resourceModelList) {
      UnionDailyGuessMsg.S2C_ShowResult_16022.Builder builder = UnionDailyGuessMsg.S2C_ShowResult_16022.newBuilder();
      UnionDailyGuessDao unionDailyGuessDao = this.unionDailyGuessMgr.getUnionDailyGuessDao(this.player.getPlayerDao().unionId);
      if (null != unionDailyGuessDao) {
         builder.setUnionLv(unionDailyGuessDao.unionLv);
         builder.setType(endType);
         PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(true);
         if (null != playerUnionDailyGuessDao) {
            builder.setShare(playerUnionDailyGuessDao.shareState);
            builder.setChapterId(playerUnionDailyGuessDao.currentChapter);
         }

         builder.addAllPassOrders(this.getPassOrders());
         if (resourceModelList != null && resourceModelList.size() > 0) {
            for(ResourceModel resourceModel : resourceModelList) {
               CommonMsg.ItemInfo.Builder itemInfo = CommonMsg.ItemInfo.newBuilder();
               itemInfo.setType(resourceModel.getType());
               itemInfo.setId(resourceModel.getId());
               itemInfo.setNum(resourceModel.getValue());
               builder.addReward(itemInfo);
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   public List<Integer> getPassOrders() {
      PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(true);
      List<Integer> passOrders = new ArrayList();
      TreeMap<Integer, Integer> passOrderMap = playerUnionDailyGuessDao.passOrderMap;
      if (passOrderMap.isEmpty()) {
         return passOrders;
      } else {
         for(Map.Entry<Integer, Integer> entry : passOrderMap.entrySet()) {
            passOrders.add(entry.getValue());
         }

         return passOrders;
      }
   }

   public int getChapterOrderNumber(int chapterId, int grid) {
      UnionDailyGuessChapterModel chapterModel = (UnionDailyGuessChapterModel)this.player.getGameModelPool().getEntity("unionGateChapter", chapterId);
      if (null == chapterModel) {
         return 1;
      } else {
         List<Integer> randomBoxGrids = chapterModel.getRandomBoxGrids();
         if (null != randomBoxGrids && randomBoxGrids.size() > 0) {
            for(int i = 0; i < randomBoxGrids.size(); ++i) {
               Integer gridDefine = (Integer)randomBoxGrids.get(i);
               if (gridDefine == grid) {
                  return i + 1;
               }
            }

            return 1;
         } else {
            return 1;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_EnemyData_16014(UnionDailyGuessMsg.C2S_EnemyData_16014 msg, String source) {
      if (!this.checkResetPlayerUnionDailyGuess(true, true)) {
         return false;
      } else {
         int grid = msg.getGrid();
         if (!this.checkEventLegal(grid, 1)) {
            return this.player.failure(61197);
         } else {
            PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(true);
            if (null == playerUnionDailyGuessDao) {
               return false;
            } else {
               UnionDailyGuessDao unionDailyGuessDao = this.unionDailyGuessMgr.getUnionDailyGuessDao(this.player.getPlayerDao().unionId);
               if (null == unionDailyGuessDao) {
                  return this.player.failure(61196);
               } else {
                  UnionDailyGuessChapterInfo unionDailyGuessChapterInfo = (UnionDailyGuessChapterInfo)unionDailyGuessDao.chapterInfo.get(playerUnionDailyGuessDao.currentChapter);
                  if (null == unionDailyGuessChapterInfo) {
                     return this.player.failure(61203);
                  } else {
                     if (!playerUnionDailyGuessDao.enemyDataMap.containsKey(grid)) {
                        if (!playerUnionDailyGuessDao.gridInfoMap.containsKey(grid)) {
                           return this.player.failure(6);
                        }

                        UnionDailyGuessGridInfo unionDailyGuessGridInfo = (UnionDailyGuessGridInfo)playerUnionDailyGuessDao.gridInfoMap.get(grid);
                        UnionDailyGuessEventFun eventFun = unionDailyGuessGridInfo.curEventFunc();
                        UnionDailyGuessEventModel eventModel = (UnionDailyGuessEventModel)this.player.getGameModelPool().getEntity("customUnionGateEvent", String.format("%d_%d", eventFun.getType(), eventFun.getId()));
                        if (null == eventModel) {
                           return this.player.failure(61218);
                        }

                        playerUnionDailyGuessDao.enemyDataMap.put(grid, 0);
                        playerUnionDailyGuessDao.updateOp();
                     }

                     UnionDailyGuessMsg.S2C_EnemyData_16015.Builder builder = UnionDailyGuessMsg.S2C_EnemyData_16015.newBuilder();
                     builder.setGrid(grid);
                     builder.setCanPassBattle(this.checkCanPassBattle(grid));
                     this.player.sendMsg(builder.build());
                     return true;
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_OtherEvent_16016(UnionDailyGuessMsg.C2S_OtherEvent_16016 msg, String source) {
      if (!this.checkResetPlayerUnionDailyGuess(true, true)) {
         return false;
      } else {
         int grid = msg.getGrid();
         PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(true);
         if (!playerUnionDailyGuessDao.gridInfoMap.containsKey(grid)) {
            return this.player.failure(6);
         } else {
            UnionDailyGuessGridInfo unionDailyGuessGridInfo = (UnionDailyGuessGridInfo)playerUnionDailyGuessDao.gridInfoMap.get(grid);
            if (unionDailyGuessGridInfo.getEventIdx() == 0) {
               return this.player.failure(61200);
            } else {
               UnionDailyGuessEventFun eventFun = unionDailyGuessGridInfo.curEventFunc();
               UnionDailyGuessEventModel eventModel = (UnionDailyGuessEventModel)this.player.getGameModelPool().getEntity("customUnionGateEvent", String.format("%d_%d", eventFun.getType(), eventFun.getId()));
               if (eventModel == null) {
                  return this.player.failure(61199);
               } else {
                  boolean success = true;
                  switch (eventModel.getEventType()) {
                     default:
                        this.logger.info("没有此事件：" + eventModel.getEventType());
                        success = this.player.failure(61199);
                     case 4:
                        if (!success) {
                           return false;
                        } else {
                           this.checkAndSetNextEvent(grid);
                           UnionDailyGuessMsg.S2C_OtherEvent_16017.Builder builder = UnionDailyGuessMsg.S2C_OtherEvent_16017.newBuilder();
                           builder.setGrid(grid);
                           this.player.sendMsg(builder.build());
                           return true;
                        }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_PlayerUnionDailyGuessInfo_16018(UnionDailyGuessMsg.C2S_PlayerUnionDailyGuessInfo_16018 msg, String source) {
      UnionDailyGuessMsg.S2C_PlayerUnionDailyGuessInfo_16019.Builder builder = UnionDailyGuessMsg.S2C_PlayerUnionDailyGuessInfo_16019.newBuilder();
      if (!this.checkResetPlayerUnionDailyGuess(false, false)) {
         builder.setState(-1);
      } else {
         PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(false);
         if (playerUnionDailyGuessDao.allPassState == 0) {
            builder.setState(0);
         } else {
            builder.setState(1);
         }
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public boolean C2S_BattleRecord_16020(UnionDailyGuessMsg.C2S_BattleRecord_16020 msg, String source) {
      if (!this.checkResetPlayerUnionDailyGuess(true, false)) {
         return false;
      } else {
         UnionDailyGuessMsg.S2C_BattleRecord_16021.Builder builder = UnionDailyGuessMsg.S2C_BattleRecord_16021.newBuilder();
         UnionDailyGuessDao unionDailyGuessDao = this.unionDailyGuessMgr.getUnionDailyGuessDao(this.player.getPlayerDao().unionId);
         builder.setUnionLevel(unionDailyGuessDao.unionLv);
         ConcurrentHashMap<Integer, UnionGateBattleRecordInfo> battleRecord = unionDailyGuessDao.battleRecord;
         if (null != battleRecord && battleRecord.size() > 0) {
            for(Map.Entry<Integer, UnionGateBattleRecordInfo> battleRecordInfoEntry : battleRecord.entrySet()) {
               UnionGateBattleRecordInfo value = (UnionGateBattleRecordInfo)battleRecordInfoEntry.getValue();
               GamePlayer otherPlayer = this.worldMgr.getPlayerById(value.getPlayerId());
               if (null != otherPlayer) {
                  UnionDailyGuessMsg.BattleRecordInfo.Builder infoBuilder = UnionDailyGuessMsg.BattleRecordInfo.newBuilder();
                  infoBuilder.setChapterId(value.getChapterId());
                  infoBuilder.setPlayerInfo(otherPlayer.toPlayerInfo());
                  infoBuilder.setPassTime(value.getPassTime());
                  infoBuilder.setType(value.getType());
                  builder.addBattleRecordInfo(infoBuilder);
               }
            }
         }

         this.player.sendMsg(builder.build());
         return true;
      }
   }

   @MsgHandlerAnno
   public void C2S_QuickPass_16023(UnionDailyGuessMsg.C2S_QuickPass_16023 msg, String source) {
      this.quickPass();
   }

   private void quickPass() {
      if (this.checkResetPlayerUnionDailyGuess(true, true)) {
         this.unionDailyGuessMgr.pushTask(() -> {
            UnionDailyGuessDao unionDailyGuessDao = this.unionDailyGuessMgr.getUnionDailyGuessDao(this.player.getPlayerDao().unionId);
            if (null == unionDailyGuessDao) {
               this.player.failure(61196);
            } else {
               int destChapterId = 0;

               for(Integer chapterId : unionDailyGuessDao.battleRecord.keySet()) {
                  destChapterId = Math.max(chapterId, destChapterId);
               }

               if (destChapterId != 0) {
                  if (unionDailyGuessDao.chapterInfo.containsKey(destChapterId + 1)) {
                     ++destChapterId;
                  }

                  this.unionDailyGuessMgr.addIntoChapterPlayerIds(this.player.getPlayerDao().unionId, this.player.getPlayerId());
                  this.unionDailyGuessMgr.addCompletePlayerIds(this.player.getPlayerDao().unionId, this.player.getPlayerId());
                  PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(false);
                  if (playerUnionDailyGuessDao != null) {
                     for(int i = 0; i < destChapterId; ++i) {
                        UnionDailyGuessChapterInfo chapterInfo = (UnionDailyGuessChapterInfo)unionDailyGuessDao.chapterInfo.get(i);
                        if (chapterInfo != null) {
                           playerUnionDailyGuessDao.passOrderMap.put(chapterInfo.getChapterId(), this.getChapterOrderNumber(chapterInfo.getChapterId(), chapterInfo.getNextChapterGrid()));
                        }
                     }

                     playerUnionDailyGuessDao.updateOp();
                     this.initPlayerUnionDailyGuessChapter(playerUnionDailyGuessDao, destChapterId);
                  }

                  this.sendChapterInfo(false);
               }
            }
         });
      }
   }

   private void notifyPassNum() {
      PlayerDao playerDao = this.player.getPlayerDao();
      UnionDailyGuessDao unionDailyGuessDao = this.unionDailyGuessMgr.getUnionDailyGuessDao(playerDao.unionId);
      if (unionDailyGuessDao != null) {
         UnionDailyGuessMsg.S2C_UpdatePassNum_16026.Builder builder = UnionDailyGuessMsg.S2C_UpdatePassNum_16026.newBuilder();
         builder.setPassNum(unionDailyGuessDao.battleRecord.size());
         this.player.sendMsg(builder.build());
      }

   }

   public void gmTest(String subOrder) {
      UnionDailyGuessDao unionDailyGuessDao = this.unionDailyGuessMgr.getUnionDailyGuessDaoForAdd(this.player.getPlayerDao().unionId);
      if (null == unionDailyGuessDao) {
         this.player.failure(9017);
      }

      ConcurrentHashMap<Integer, UnionDailyGuessChapterInfo> chapterInfo = unionDailyGuessDao.chapterInfo;
      switch (subOrder) {
         case "nextchapter":
            if (null == unionDailyGuessDao || unionDailyGuessDao.chapterInfo == null) {
               return;
            }

            PlayerUnionDailyGuessDao playerUnionDailyGuessDao = this.getPlayerUnionDailyGuessDao(true);
            if (null == playerUnionDailyGuessDao) {
               return;
            }

            if (((UnionDailyGuessChapterInfo)chapterInfo.get(playerUnionDailyGuessDao.currentChapter)).getNextChapterGrid() == -1) {
               this.sendRandomBoxAndFinish(unionDailyGuessDao, playerUnionDailyGuessDao);
            } else {
               UnionDailyGuessChapterModel nextChapter = this.getNextChapter(playerUnionDailyGuessDao.currentChapter);
               if (nextChapter == null) {
                  return;
               }

               this.initPlayerUnionDailyGuessChapter(playerUnionDailyGuessDao, nextChapter.getId());
               this.sendChapterInfo(false);
            }
            break;
         case "getchapterinfo":
            for(UnionDailyGuessChapterInfo value : chapterInfo.values()) {
               UnionDailyGuessChapterModel chapterModel = (UnionDailyGuessChapterModel)this.player.getGameModelPool().getEntity("unionGateChapter", value.getChapterId());
               this.logger.info("军团猜仙门 关卡id {}，关卡名称{}，通往下一关的格子{}", new Object[]{value.getChapterId(), chapterModel.getName(), value.getNextChapterGrid()});
               String content = MessageFormat.format("军团猜仙门 关卡id {0}，关卡名称{1}，通往下一关的格子{2}", value.getChapterId(), chapterModel.getName(), value.getNextChapterGrid());
               this.chatMgr.sendUnionSystem(unionDailyGuessDao.unionId, content, 3);
            }
            break;
         case "resetchapter":
            UnionDao unionDao = (UnionDao)this.unionMgrParent.getUnionDaoMap().get(unionDailyGuessDao.unionId);
            this.unionDailyGuessMgr.pushTask(() -> {
               unionDailyGuessDao.unionLv = unionDao.level;
               unionDailyGuessDao.chapterInfo = this.unionDailyGuessMgr.getInitChapterInfo(unionDao.level);
               unionDailyGuessDao.intoChapterPlayerIds.clear();
               unionDailyGuessDao.firstPassPlayerId = 0;
               unionDailyGuessDao.completePlayerIds.clear();
               unionDailyGuessDao.resetTime = System.currentTimeMillis();
               unionDailyGuessDao.battleRecord.clear();
               unionDailyGuessDao.updateOp();
               this.player.pushTask(() -> {
                  this.resetPlayerUnionDailyGuessDao(unionDailyGuessDao.resetTime);
                  this.sendChapterInfo(false);
               });
            });
            break;
         case "resettingNum":
            this.unionDailyGuessMgr.gmResettingNum();
            break;
         case "quickpass":
            this.quickPass();
      }

   }
}
