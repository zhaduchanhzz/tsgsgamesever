package com.gzbz.gamePlayer.expedition;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.util.NumberUtil;
import com.google.common.base.Splitter;
import com.gzbz.activity.part.ActivityEventHeroPart;
import com.gzbz.activity.part.ActivityKrEventHeroPart;
import com.gzbz.activity.part.HeroSkinActivityPart;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.Monster;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.BattleChapterDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.ExpeditionDao;
import com.gzbz.db.FriendDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.HeroSupportDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.ExpeditionBuffAddtionData;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.BattleModel;
import com.gzbz.model.BoxModel;
import com.gzbz.model.ExpeditionChapterModel;
import com.gzbz.model.ExpeditionEventModel;
import com.gzbz.model.ExpeditionGridEventModel;
import com.gzbz.model.ExpeditionHeroModel;
import com.gzbz.model.ExpeditionMapModel;
import com.gzbz.model.ExpeditionSpoilsWarModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.BattleMonsterFun;
import com.gzbz.model.fun.ExpeditionEventFun;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.ExpeditionMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.robot.bean.MonsterMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import com.gzbz.worldMgr.WorldMgrPushTaskPart;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.CalculateUtil;
import misc.MapUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ExpeditionPart extends PlayerPart {
   public static final int CHAPTER_STATE_LOCK = 0;
   public static final int CHAPTER_STATE_NORMAL = 1;
   public static final int CHAPTER_STATE_FIGHTING = 2;
   public static final int EVENT_COMPLETE = 0;
   Logger logger = LoggerFactory.getLogger(ExpeditionPart.class);
   private int curChapterId = 0;
   private GridMgr gridMgr = new GridMgr();
   private List<Integer> _unlockSeeGridList = new ArrayList();
   @Autowired
   private ConfigManager configManager;
   @Autowired
   BattleRecordMgr battleRecordMgr;
   @Autowired
   private WorldMgr worldMgr;
   private boolean bCheckChapter = false;

   @MsgHandlerAnno
   public void C2S_Chapters_10301(ExpeditionMsg.C2S_Chapters_10301 msg, String source) {
      if (!this.bCheckChapter) {
         this.bCheckChapter = true;
         this.checkUnlockChapter(0);
      }

      this.sendChapterInfos();
   }

   @MsgHandlerAnno
   public boolean C2S_EnterChapter_10303(ExpeditionMsg.C2S_EnterChapter_10303 msg, String source) {
      int chapterId = msg.getChapterId();
      Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      ExpeditionDao expeditionDao = (ExpeditionDao)expeditionDaoMap.get(chapterId);
      if (expeditionDao == null) {
         return this.player.failure(43001);
      } else if (!this.checkUnlockExtra(chapterId)) {
         return this.player.failure(43001);
      } else {
         ExpeditionChapterModel chapterModel = (ExpeditionChapterModel)this.player.getGameModelPool().getEntity("expeditionChapter", chapterId);
         int heroIdleId = this.getHeroIdleId();
         if (expeditionDao.state != 2) {
            for(Map.Entry<Integer, ExpeditionDao> entry : expeditionDaoMap.entrySet()) {
               ExpeditionDao tempDao = (ExpeditionDao)entry.getValue();
               if (tempDao.state == 2) {
                  this.resumeChapterInfo(tempDao);
               }
            }

            expeditionDao.state = 2;
            expeditionDao.updateOp();
            heroIdleId = chapterModel.getHeroId();
            this.setHeroIdleId(heroIdleId);
         }

         expeditionDao.activityId = msg.getActivityId();
         expeditionDao.updateOp();
         if (heroIdleId == 0) {
            heroIdleId = chapterModel.getHeroId();
            this.setHeroIdleId(heroIdleId);
         }

         ExpeditionMsg.S2C_EnterChapter_10304.Builder builder = ExpeditionMsg.S2C_EnterChapter_10304.newBuilder();
         builder.setChapterId(chapterId);
         builder.setCurGrid(expeditionDao.curGrid);
         builder.setHeroId(heroIdleId);
         this.curChapterId = chapterId;

         for(int gridId : expeditionDao.seeGridSet) {
            ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)expeditionDao.gridInfoMap.get(gridId);
            ExpeditionMsg.S2C_GridInfo_10314.Builder infoBuilder = ExpeditionMsg.S2C_GridInfo_10314.newBuilder();
            infoBuilder.setGrid(gridId);
            int eventIdx = expeditionGridInfo != null ? expeditionGridInfo.getEventIdx() : 0;
            infoBuilder.setEventIdx(eventIdx);
            if (expeditionGridInfo != null && expeditionGridInfo.state == 2) {
               infoBuilder.setGridType(expeditionGridInfo.gridType);
               infoBuilder.setGridIcon(expeditionGridInfo.gridIcon);
            }

            builder.addGridInfo(infoBuilder);
         }

         for(int buff : expeditionDao.buffs) {
            builder.addBuffs(buff);
         }

         for(Map.Entry<Integer, ResourceModel> entry : expeditionDao.tempProps.entrySet()) {
            ResourceModel resourceModel = (ResourceModel)entry.getValue();
            builder.addTempProps(resourceModel.builder());
         }

         this.player.sendMsg(builder.build());
         this.gridMgr.init(chapterModel.getMapH(), chapterModel.getMapW());
         HeroSkinActivityPart heroSkinActivityPart = (HeroSkinActivityPart)this.player.getMgrPart(HeroSkinActivityPart.class);
         if (!heroSkinActivityPart.isServerActivityInvalid()) {
            ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", heroSkinActivityPart.getPlayerActivityId());
            if (activityOpenTimeModel != null && activityOpenTimeModel.getExpeditionId() == chapterId) {
               this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "鬼神传说", "开始冒险", "", 0, 0, 0);
            }
         }

         return true;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ExitChapter_10305(ExpeditionMsg.C2S_ExitChapter_10305 msg, String source) {
      int chapterId = msg.getChapterId();
      Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      ExpeditionDao expeditionDao = (ExpeditionDao)expeditionDaoMap.get(chapterId);
      if (expeditionDao == null) {
         return this.player.failure(43001);
      } else if (expeditionDao.state != 2) {
         return this.player.failure(43002);
      } else {
         this.resumeChapterInfo(expeditionDao);
         this.curChapterId = 0;
         ExpeditionMsg.S2C_ExitChapter_10306.Builder builder = ExpeditionMsg.S2C_ExitChapter_10306.newBuilder();
         builder.setChapterId(chapterId);
         this.player.sendMsg(builder.build());
         HeroSkinActivityPart heroSkinActivityPart = (HeroSkinActivityPart)this.player.getMgrPart(HeroSkinActivityPart.class);
         if (!heroSkinActivityPart.isServerActivityInvalid()) {
            ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", heroSkinActivityPart.getPlayerActivityId());
            if (activityOpenTimeModel != null && activityOpenTimeModel.getExpeditionId() == chapterId) {
               this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "鬼神传说", "重置冒险", "", 0, 0, 0);
            }
         }

         return true;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Move_10307(ExpeditionMsg.C2S_Move_10307 msg, String source) {
      int oriGrid = msg.getOriGrid();
      int destGrid = msg.getDestGrid();
      List<Integer> passGridList = msg.getPassGridList();
      Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      ExpeditionDao expeditionDao = (ExpeditionDao)expeditionDaoMap.get(this.curChapterId);
      if (expeditionDao == null) {
         return this.player.failure(43001);
      } else if (!passGridList.contains(destGrid)) {
         return this.player.failure(43009);
      } else {
         ExpeditionMsg.S2C_Move_10308.Builder builder = ExpeditionMsg.S2C_Move_10308.newBuilder();
         if (this.checkMoveLegal(passGridList)) {
            expeditionDao.curGrid = destGrid;
            expeditionDao.updateOp();
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

   @MsgHandlerAnno
   public boolean C2S_SelectBuff_10309(ExpeditionMsg.C2S_SelectBuff_10309 msg, String source) {
      int grid = msg.getGrid();
      int buffId = msg.getBuffId();
      ExpeditionMapModel mapModel = this.getMapModel(grid);
      if (mapModel == null) {
         return this.player.failure(6);
      } else {
         Map<Integer, ExpeditionDao> daoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
         ExpeditionDao expeditionDao = (ExpeditionDao)daoMap.get(this.curChapterId);
         if (expeditionDao == null) {
            return this.player.failure(6);
         } else if (!expeditionDao.gridInfoMap.containsKey(grid)) {
            return this.player.failure(6);
         } else {
            ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)expeditionDao.gridInfoMap.get(grid);
            ExpeditionEventFun eventFun = expeditionGridInfo.curEventFunc();
            if (eventFun != null && eventFun.getType() == 1) {
               this.checkAndSetNextEvent(this.curChapterId, grid);
               expeditionDao.buffs.add(buffId);
               ExpeditionMsg.S2C_SelectBuff_10310.Builder builder = ExpeditionMsg.S2C_SelectBuff_10310.newBuilder();
               builder.setGrid(grid);
               builder.setBuffId(buffId);
               this.player.sendMsg(builder.build());
               return true;
            } else {
               return this.player.failure(43006);
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_BuffList_10315(ExpeditionMsg.C2S_BuffList_10315 msg, String source) {
      int grid = msg.getGrid();
      if (!this.checkEventLegal(grid, 1)) {
         return false;
      } else {
         Map<Integer, ExpeditionDao> daoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
         ExpeditionDao expeditionDao = (ExpeditionDao)daoMap.get(this.curChapterId);
         if (expeditionDao == null) {
            return this.player.failure(6);
         } else if (!expeditionDao.gridInfoMap.containsKey(grid)) {
            return this.player.failure(6);
         } else {
            ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)expeditionDao.gridInfoMap.get(grid);
            ExpeditionEventFun eventFun = expeditionGridInfo.curEventFunc();
            if (eventFun == null) {
               this.logger.info("格子事件错误 grid:{}, eventIdx:{}", grid, expeditionGridInfo.curEventFunc());
               return false;
            } else {
               Set<Integer> buffs = new HashSet();
               if (!expeditionDao.gridBuffs.containsKey(grid)) {
                  ExpeditionEventModel eventModel = (ExpeditionEventModel)this.player.getGameModelPool().getEntity("customExpeditionEvent", String.format("%d_%d", eventFun.getType(), eventFun.getId()));
                  if (eventModel == null) {
                     this.logger.info("事件类型发生错误 grid:{}, eventIdx:{}, eventType:{}, eventId:{}", new Object[]{grid, expeditionGridInfo.getEventIdx() - 1, eventFun.getType(), eventFun.getId()});
                     return false;
                  }

                  Set<Integer> tempSet = new HashSet();

                  for(int groupId : eventModel.getParam()) {
                     Map<Integer, List<ExpeditionSpoilsWarModel>> map = this.player.getGameModelPool().getMap("customExpeditionSpoilsOfWar");
                     List<ExpeditionSpoilsWarModel> list = (List)map.get(groupId);
                     List<KeyValFun> rateList = new ArrayList();

                     for(ExpeditionSpoilsWarModel expeditionSpoilsWarModel : list) {
                        rateList.add(new KeyValFun(expeditionSpoilsWarModel.getId(), expeditionSpoilsWarModel.getWeight()));
                     }

                     int id = GamePlayer.countRate(rateList);
                     tempSet.add(id);
                  }

                  buffs.addAll(tempSet);
                  expeditionDao.gridBuffs.put(grid, buffs);
                  expeditionDao.updateOp();
               } else {
                  buffs = (Set)expeditionDao.gridBuffs.get(grid);
               }

               ExpeditionMsg.S2C_BuffList_10316.Builder builder = ExpeditionMsg.S2C_BuffList_10316.newBuilder();
               builder.setGrid(grid);
               builder.addAllBuffList(buffs);
               this.player.sendMsg(builder.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_OtherBuff_10317(ExpeditionMsg.C2S_OtherBuff_10317 msg, String source) {
      int grid = msg.getGrid();
      Map<Integer, ExpeditionDao> daoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      ExpeditionDao expeditionDao = (ExpeditionDao)daoMap.get(this.curChapterId);
      if (expeditionDao == null) {
         return this.player.failure(0);
      } else if (!expeditionDao.gridInfoMap.containsKey(grid)) {
         return this.player.failure(6);
      } else {
         ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)expeditionDao.gridInfoMap.get(grid);
         if (expeditionGridInfo.getEventIdx() == 0) {
            return this.player.failure(43005);
         } else {
            ExpeditionEventFun eventFun = expeditionGridInfo.curEventFunc();
            ExpeditionEventModel eventModel = (ExpeditionEventModel)this.player.getGameModelPool().getEntity("customExpeditionEvent", String.format("%d_%d", eventFun.getType(), eventFun.getId()));
            if (eventModel == null) {
               return this.player.failure(43006);
            } else {
               boolean success = false;
               boolean bCheckNext = true;
               switch (eventModel.getEventType()) {
                  case 2:
                     success = this.heroHeal(expeditionDao);
                     if (!success) {
                        this.player.failure(43013);
                     }
                     break;
                  case 3:
                     success = this.rebirth(expeditionDao);
                     if (!success) {
                        this.player.failure(43012);
                     }
                     break;
                  case 4:
                  case 6:
                  case 7:
                  case 9:
                  case 12:
                  case 13:
                  case 18:
                  default:
                     this.logger.info("没有此事件：" + eventModel.getEventType());
                     this.player.failure(43006);
                     break;
                  case 5:
                     success = this.openBox(grid, (Integer)eventModel.getParam().get(0), expeditionDao);
                     break;
                  case 8:
                  case 10:
                  case 11:
                  case 14:
                  case 16:
                     success = true;
                     break;
                  case 15:
                     success = this.transmit(grid, eventModel.getParam(), expeditionDao);
                     break;
                  case 17:
                     bCheckNext = this.resetGridEvent(this.curChapterId, grid, eventModel.getArgs(), expeditionDao);
                     success = true;
                     break;
                  case 19:
                     success = this.getTempProps(grid, eventModel.getArgs(), expeditionDao);
               }

               if (!success) {
                  return false;
               } else {
                  if (bCheckNext) {
                     this.checkAndSetNextEvent(this.curChapterId, grid);
                  }

                  ExpeditionMsg.S2C_OtherBuff_10318.Builder builder = ExpeditionMsg.S2C_OtherBuff_10318.newBuilder();
                  builder.setGrid(grid);
                  this.player.sendMsg(builder.build());
                  return true;
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RecruitHeroList_10319(ExpeditionMsg.C2S_RecruitHeroList_10319 msg, String source) {
      int grid = msg.getGrid();
      Map<Integer, ExpeditionDao> daoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      ExpeditionDao expeditionDao = (ExpeditionDao)daoMap.get(this.curChapterId);
      if (expeditionDao != null) {
         ExpeditionMapModel mapModel = this.getMapModel(grid);
         if (mapModel == null) {
            this.logger.info("mapModel为空，grid={}", grid);
         } else if (expeditionDao.gridInfoMap.containsKey(grid)) {
            ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)expeditionDao.gridInfoMap.get(grid);
            ExpeditionEventFun eventFun = expeditionGridInfo.curEventFunc();
            ExpeditionEventModel eventModel = (ExpeditionEventModel)this.player.getGameModelPool().getEntity("customExpeditionEvent", String.format("%d_%d", eventFun.getType(), eventFun.getId()));
            if (eventModel == null) {
               this.player.failure(43006);
            } else {
               ExpeditionMsg.S2C_RecruitHeroList_10320.Builder builder = ExpeditionMsg.S2C_RecruitHeroList_10320.newBuilder();
               builder.setGird(grid);
               List<HeroMirror> heroMirrorList = (List)expeditionDao.gridMonster.get(grid);
               if (heroMirrorList == null) {
                  HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                  List<Long> power_level = heroBagPart.getPowerAVG(5);
                  MonsterMgr monsterMgr = (MonsterMgr)ApplicationContextProvider.getContext().getBean(MonsterMgr.class);
                  ArrayingMirror arrayingMirror = monsterMgr.getArrayingMirror((Long)power_level.get(0) * 5L, (long)((double)(Long)power_level.get(0) * (double)5.5F));
                  int level = 0;
                  int monsterStar = 0;

                  for(Map.Entry<Byte, ArrayingEntity> entry : arrayingMirror.arrayingElementsMap.entrySet()) {
                     if (((ArrayingEntity)entry.getValue()).entityType() == CommonMsg.CodeType.CODE_HERO) {
                        HeroArrayingEntity heroArrayingEntity = (HeroArrayingEntity)entry.getValue();
                        level = heroArrayingEntity.mirror.lv;
                        monsterStar = heroArrayingEntity.mirror.star;
                        break;
                     }
                  }

                  int star = heroBagPart.getMaxStars();
                  heroMirrorList = new ArrayList();
                  Set<Integer> heroIdSet = new HashSet();

                  for(int i = 0; i < eventModel.getParam().size(); ++i) {
                     int groupId = (Integer)eventModel.getParam().get(i);
                     List<ExpeditionHeroModel> list = (List)this.player.getGameModelPool().getEntity("customExpeditonHero", groupId);
                     List<KeyValFun> rateList = new ArrayList();

                     for(ExpeditionHeroModel expeditionHeroModel : list) {
                        rateList.add(new KeyValFun(expeditionHeroModel.getHeroId(), expeditionHeroModel.getWeight()));
                     }

                     int heroId = GamePlayer.countRate(rateList);
                     int tempCount = 0;

                     while(heroIdSet.contains(heroId) && tempCount < 100) {
                        heroId = GamePlayer.countRate(rateList);
                        ++tempCount;
                        if (tempCount > list.size() * 3) {
                           this.logger.info("将军远征, 玩家{} 兵营随到重复武将 grid:{} heroId:{}", new Object[]{this.player.getPlayerId(), grid, heroId});
                           break;
                        }
                     }

                     heroIdSet.add(heroId);
                     Monster monster = new Monster(heroId, level, monsterStar, 0, true, (BattleMonsterFun)null, (List)null);
                     monster.star = star;
                     monster.lv = ((Long)power_level.get(1)).intValue();
                     HeroMirror heroMirror = HeroMirror.fromMonster(monster);
                     heroMirror.code = this.getDispatchCode();
                     CommonMsg.HeroInfo.Builder heroInfo = heroMirror.toBuilder();
                     builder.addHero(heroInfo);
                     heroMirrorList.add(heroMirror);
                  }

                  expeditionDao.gridMonster.put(grid, heroMirrorList);
                  expeditionDao.updateOp();
               } else {
                  for(int i = 0; i < heroMirrorList.size(); ++i) {
                     builder.addHero(((HeroMirror)heroMirrorList.get(i)).toBuilder());
                  }
               }

               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RecruitHero_10321(ExpeditionMsg.C2S_RecruitHero_10321 msg, String source) {
      int grid = msg.getGrid();
      int codeId = msg.getCodeId();
      if (this.checkEventLegal(grid, 4)) {
         Map<Integer, ExpeditionDao> daoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
         ExpeditionDao expeditionDao = (ExpeditionDao)daoMap.get(this.curChapterId);
         if (expeditionDao != null) {
            List<HeroMirror> heroMirrorList = (List)expeditionDao.gridMonster.get(grid);
            HeroMirror selectHeroMirror = null;

            for(HeroMirror heroMirror : heroMirrorList) {
               if (heroMirror.code == codeId) {
                  selectHeroMirror = heroMirror;
                  break;
               }
            }

            if (expeditionDao.monsters.containsKey(codeId)) {
               this.player.failure(43010);
            } else {
               if (selectHeroMirror != null) {
                  expeditionDao.monsters.put(selectHeroMirror.code, selectHeroMirror);
                  this.checkAndSetNextEvent(this.curChapterId, grid);
                  expeditionDao.updateOp();
                  ExpeditionMsg.S2C_RecruitHero_10322.Builder builder = ExpeditionMsg.S2C_RecruitHero_10322.newBuilder();
                  builder.setGrid(grid);
                  builder.setCodeId(codeId);
                  this.player.sendMsg(builder.build());
               } else {
                  this.player.failure(43008);
               }

            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_EnemyData_10323(ExpeditionMsg.C2S_EnemyData_10323 msg, String source) {
      int grid = msg.getGrid();
      if (!this.checkEventLegal(grid, 7)) {
         return this.player.failure(43003);
      } else {
         Map<Integer, ExpeditionDao> map = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
         ExpeditionDao expeditionDao = (ExpeditionDao)map.get(this.curChapterId);
         if (expeditionDao == null) {
            return false;
         } else {
            ExpeditionDao.EnemyData enemyData;
            if (!expeditionDao.enemyDatas.containsKey(grid)) {
               if (!expeditionDao.gridInfoMap.containsKey(grid)) {
                  return this.player.failure(6);
               }

               ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)expeditionDao.gridInfoMap.get(grid);
               ExpeditionEventFun eventFun = expeditionGridInfo.curEventFunc();
               ExpeditionEventModel eventModel = (ExpeditionEventModel)this.player.getGameModelPool().getEntity("customExpeditionEvent", String.format("%d_%d", eventFun.getType(), eventFun.getId()));
               if (eventModel == null) {
                  return this.player.failure(43011);
               }

               enemyData = this.buildEnemy((Integer)eventModel.getParam().get(1));
               if (enemyData == null) {
                  return this.player.failure(43011);
               }

               expeditionDao.enemyDatas.put(grid, enemyData);
               expeditionDao.updateOp();
            } else {
               enemyData = (ExpeditionDao.EnemyData)expeditionDao.enemyDatas.get(grid);
            }

            ExpeditionMsg.S2C_EnemyData_10324.Builder builder = ExpeditionMsg.S2C_EnemyData_10324.newBuilder();
            builder.setGrid(grid);
            builder.setPassed(enemyData.passed);

            for(Map.Entry<Integer, ExpeditionDao.HpData> entry : enemyData.hpDataMap.entrySet()) {
               ExpeditionDao.HpData hpData = (ExpeditionDao.HpData)entry.getValue();
               ExpeditionMsg.HpData.Builder hpDataBuilder = ExpeditionMsg.HpData.newBuilder();
               hpDataBuilder.setCode((Integer)entry.getKey());
               hpDataBuilder.setHp(hpData.hpPercent);
               builder.addHpData(hpDataBuilder);
            }

            this.player.sendMsg(builder.build());
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RecruitHeroData_10325(ExpeditionMsg.C2S_RecruitHeroData_10325 msg, String source) {
      Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      ExpeditionDao expeditionDao = (ExpeditionDao)expeditionDaoMap.get(this.curChapterId);
      if (expeditionDao != null) {
         ExpeditionMsg.S2C_RecruitHeroData_10326.Builder builder = ExpeditionMsg.S2C_RecruitHeroData_10326.newBuilder();

         for(Map.Entry<Integer, HeroMirror> entry : expeditionDao.monsters.entrySet()) {
            CommonMsg.HeroInfo.Builder heroInfo = ((HeroMirror)entry.getValue()).toBuilder();
            builder.addHero(heroInfo);
         }

         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroHpData_10327(ExpeditionMsg.C2S_HeroHpData_10327 msg, String source) {
      Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      ExpeditionDao expeditionDao = (ExpeditionDao)expeditionDaoMap.get(this.curChapterId);
      if (expeditionDao != null) {
         ExpeditionMsg.S2C_HeroHpData_10328.Builder builder = ExpeditionMsg.S2C_HeroHpData_10328.newBuilder();

         for(Map.Entry<Integer, ExpeditionDao.HpData> entry : expeditionDao.heroHp.entrySet()) {
            ExpeditionMsg.HpData.Builder hpDataBuilder = ExpeditionMsg.HpData.newBuilder();
            ExpeditionDao.HpData hpData = (ExpeditionDao.HpData)entry.getValue();
            hpDataBuilder.setCode((Integer)entry.getKey());
            hpDataBuilder.setHp(hpData.hpPercent);
            builder.addHpData(hpDataBuilder);
         }

         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_BattleRecord_10333(ExpeditionMsg.C2S_BattleRecord_10333 msg, String source) {
      List<ExpeditionMsg.RecordInfo> expeditionRecord = this.battleRecordMgr.getExpeditionRecord(msg.getChapterId());
      ExpeditionMsg.S2C_BattleRecord_10334.Builder builder = ExpeditionMsg.S2C_BattleRecord_10334.newBuilder();
      builder.setChapterId(msg.getChapterId());
      builder.addAllRecords(expeditionRecord);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_DispatchHero_10337(ExpeditionMsg.C2S_DispatchHero_10337 msg, String source) {
      HeroSupportDao heroSupportDao = this.getExpeditionSupportDao(this.player.getPlayerId());
      if (heroSupportDao != null) {
         Map<Integer, Integer> argsMap = this.getHeroSupportArgs(heroSupportDao.args);
         int heroCode = (Integer)MapUtil.getOrDefault(argsMap, 1, 0);
         if (heroCode == msg.getHeroCode()) {
            this.player.failure(61060);
            return;
         }
      }

      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.player.failure(4100);
      } else if (!HeroModel.isReplacementHero(heroDao.id)) {
         if (heroDao.type == HeroDefine.HERO_SP_TYPE_PALACE) {
            this.player.failure(76042);
         } else if (heroDao.type == HeroDefine.HERO_SP_TYPE_LINK && heroDao.linkCode <= 0) {
            this.player.failure(76509);
         } else if (heroDao.invalidTime > 0) {
            this.player.failure(76512);
         } else {
            int uniqueCode = this.getDispatchCode();
            heroBagPart.heroBagFlushProperties(heroDao);
            HeroMirror heroMirror = HeroMirror.fromHeroBean(heroDao);
            heroMirror.code = uniqueCode;
            heroSupportDao.heroSupport = heroMirror;
            heroSupportDao.args = this.packHeroSupportArgs(msg.getHeroCode(), uniqueCode);
            heroSupportDao.updateOp();
            ExpeditionMsg.S2C_DispatchHero_10338.Builder builder = ExpeditionMsg.S2C_DispatchHero_10338.newBuilder();
            builder.setHeroCode(msg.getHeroCode());
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_EmployHero_10339(ExpeditionMsg.C2S_EmployHero_10339 msg, String source) {
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      if (!friendDao.friends.contains(msg.getPlayerId())) {
         this.player.failure(6006);
      } else {
         Map<Integer, ExpeditionDao> daoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
         ExpeditionDao expeditionDao = (ExpeditionDao)daoMap.get(this.curChapterId);
         if (expeditionDao != null) {
            if (expeditionDao.chooseFriend.contains(msg.getPlayerId())) {
               this.player.failure(61056);
            } else {
               GamePlayer other = this.worldMgr.getPlayerById(msg.getPlayerId());
               HeroSupportDao otherSupportDao = this.getExpeditionSupportDao(other.getPlayerId());
               if (otherSupportDao != null && otherSupportDao.heroSupport != null) {
                  int expMercenaryNum = this.configManager.getIntDefault("expMercenaryNum", 3);
                  if (expeditionDao.chooseFriend.size() >= expMercenaryNum) {
                     this.player.failure(61058);
                  } else if (otherSupportDao.heroSupport.code != msg.getDispatchCode()) {
                     this.player.failure(61059);
                  } else {
                     try {
                        HeroMirror tempHeroMirror = otherSupportDao.heroSupport.clone();
                        int uniqueCode = this.getDispatchCode();
                        tempHeroMirror.code = uniqueCode;
                        expeditionDao.monsters.put(uniqueCode, tempHeroMirror);
                        expeditionDao.chooseFriend.add(msg.getPlayerId());
                        HeroSupportDao heroSupportDao = this.getExpeditionSupportDao(this.player.getPlayerId());
                        Map<Integer, Integer> argsMap = this.getHeroSupportArgs(heroSupportDao.args);
                        heroSupportDao.args = this.packHeroSupportArgs((Integer)MapUtil.getOrDefault(argsMap, 1, 0), uniqueCode);
                        heroSupportDao.updateOp();
                     } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                     }

                     expeditionDao.updateOp();
                     ExpeditionMsg.S2C_EmployHero_10340.Builder builder = ExpeditionMsg.S2C_EmployHero_10340.newBuilder();
                     builder.setPlayerId(msg.getPlayerId());
                     builder.setDispatchCode(msg.getDispatchCode());
                     this.player.sendMsg(builder.build());
                  }
               } else {
                  this.player.failure(61057);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DispatchList_10341(ExpeditionMsg.C2S_DispatchList_10341 msg, String source) {
      Map<Integer, ExpeditionDao> map = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      ExpeditionDao expeditionDao = (ExpeditionDao)map.get(this.curChapterId);
      if (expeditionDao == null) {
         this.logger.info("获取不到当前远征章节数据 playerId:{}, chapterId:{}", this.player.getPlayerId(), this.curChapterId);
      } else {
         ExpeditionMsg.S2C_DispatchList_10342.Builder builder = ExpeditionMsg.S2C_DispatchList_10342.newBuilder();

         for(Map.Entry<Integer, HeroMirror> entry : expeditionDao.monsters.entrySet()) {
            HeroMirror heroMirror = (HeroMirror)entry.getValue();
            if (expeditionDao.chooseFriend.contains(heroMirror.playerId)) {
               ExpeditionMsg.MercenaryInfo.Builder mercenaryInfo = ExpeditionMsg.MercenaryInfo.newBuilder();
               mercenaryInfo.setPlayerId(heroMirror.playerId);
               mercenaryInfo.setHeroInfo(heroMirror.toBuilder());
               mercenaryInfo.setBEmploy(true);
               builder.addMercenaryInfo(mercenaryInfo);
            }
         }

         FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
         int expMercenaryFight = this.configManager.getIntDefault("expMercenaryFight", 15000);

         for(Integer friendId : friendDao.friends) {
            if (!expeditionDao.chooseFriend.contains(friendId)) {
               GamePlayer other = this.worldMgr.getPlayerById(friendId);
               if (other != null) {
                  HeroSupportDao otherSupportDao = this.getExpeditionSupportDao(friendId);
                  if (otherSupportDao != null && otherSupportDao.heroSupport != null && !((float)this.player.getHeroOfMaxCombatPower().combatPower * ((float)expMercenaryFight / 10000.0F) < (float)otherSupportDao.heroSupport.combatPower)) {
                     ExpeditionMsg.MercenaryInfo.Builder mercenaryInfo = ExpeditionMsg.MercenaryInfo.newBuilder();
                     mercenaryInfo.setPlayerId(friendId);
                     mercenaryInfo.setHeroInfo(otherSupportDao.heroSupport.toBuilder());
                     mercenaryInfo.setBEmploy(false);
                     builder.addMercenaryInfo(mercenaryInfo);
                  }
               }
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   public void sendChapterInfos() {
      ExpeditionMsg.S2C_Chapters_10302.Builder builder = ExpeditionMsg.S2C_Chapters_10302.newBuilder();
      HeroSupportDao heroSupportDao = this.getExpeditionSupportDao(this.player.getPlayerId());
      Map<Integer, Integer> argsMap = this.getHeroSupportArgs(heroSupportDao.args);
      builder.setHeroCode((Integer)MapUtil.getOrDefault(argsMap, 1, 0));
      Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      Map<Integer, ExpeditionChapterModel> map = this.player.getGameModelPool().getMap("expeditionChapter");
      WorldDao<ExpeditionBuffAddtionData> worldDao = this.worldMgr.<ExpeditionBuffAddtionData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_EXPEDITION_BUFF_ADDITION);

      for(ExpeditionChapterModel chapterModel : map.values()) {
         ExpeditionMsg.ChapterInfo.Builder chapterInfo = ExpeditionMsg.ChapterInfo.newBuilder();
         chapterInfo.setChapterId(chapterModel.getId());
         if (!expeditionDaoMap.containsKey(chapterModel.getId())) {
            chapterInfo.setState(0);
            chapterInfo.setCompleteNum(0);
         } else {
            ExpeditionDao expeditionDao = (ExpeditionDao)expeditionDaoMap.get(chapterModel.getId());
            chapterInfo.setState(expeditionDao.state);
            chapterInfo.setCompleteNum(expeditionDao.openedBoxNum);
            if (expeditionDao.state == 2) {
               this.curChapterId = chapterModel.getId();
            }

            for(Map.Entry<Integer, Integer> entry : expeditionDao.box.entrySet()) {
               CommonMsg.MapDataII.Builder boxData = CommonMsg.MapDataII.newBuilder();
               boxData.setKey((Integer)entry.getKey());
               boxData.setValue((Integer)entry.getValue());
               chapterInfo.addBox(boxData);
            }

            if (((ExpeditionBuffAddtionData)worldDao.jsonData).firstPassMap.containsKey(chapterModel.getId())) {
               GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)((ExpeditionBuffAddtionData)worldDao.jsonData).firstPassMap.get(chapterModel.getId()));
               if (gamePlayer != null) {
                  PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
                  chapterInfo.setFirstPlayerId(playerPublicDao.playerId);
                  chapterInfo.setFirstPlayerName(playerPublicDao.playerName);
               }
            }

            if (((ExpeditionBuffAddtionData)worldDao.jsonData).passInfoMap.containsKey(chapterModel.getId())) {
               int passCount = (Integer)MapUtil.getOrDefault(((ExpeditionBuffAddtionData)worldDao.jsonData).passInfoMap, chapterModel.getId(), 0);
               chapterInfo.setPassNum(passCount);
            }
         }

         builder.addChapterInfo(chapterInfo);
      }

      this.player.sendMsg(builder.build());
   }

   private ExpeditionDao.EnemyData buildEnemy(int battleId) {
      BattlePKTeam enemyPKTeam = new BattlePKTeam(battleId);
      if (enemyPKTeam == null) {
         return null;
      } else {
         ExpeditionDao.EnemyData enemyData = new ExpeditionDao.EnemyData();
         enemyData.passed = false;
         HashMap<Byte, Entity> entityMap = enemyPKTeam.getEntityMap();

         for(Map.Entry<Byte, Entity> entry : entityMap.entrySet()) {
            Entity entity = (Entity)entry.getValue();
            byte pos = (Byte)entry.getKey();
            ExpeditionDao.HpData hpData = new ExpeditionDao.HpData();
            hpData.hp = entity.getBaseProperty(99);
            hpData.hpPercent = 100;
            enemyData.hpDataMap.put(Integer.valueOf(pos), hpData);
         }

         return enemyData;
      }
   }

   private boolean checkMoveLegal(List<Integer> passGrids) {
      Map<Integer, ExpeditionDao> map = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      ExpeditionDao expeditionDao = (ExpeditionDao)map.get(this.curChapterId);
      if (expeditionDao == null) {
         return false;
      } else {
         int lastGrid = 0;

         for(int i = 0; i < passGrids.size(); ++i) {
            int grid = (Integer)passGrids.get(i);
            if (!expeditionDao.seeGridSet.contains(grid)) {
               return false;
            }

            ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)expeditionDao.gridInfoMap.get(grid);
            if (expeditionGridInfo != null) {
               ExpeditionEventFun eventFun = expeditionGridInfo.curEventFunc();
               boolean isTransmitEvent = eventFun != null && eventFun.getType() == 15;
               if (!isTransmitEvent && expeditionGridInfo.getEventIdx() != 0) {
                  return false;
               }
            }

            Set<Integer> set = this.gridMgr.getNear(grid);
            if (lastGrid != 0 && !set.contains(lastGrid)) {
               this.logger.info("格子序号{} 和 {}不相邻，不能移动", lastGrid, grid);
               return false;
            }

            lastGrid = grid;
         }

         return true;
      }
   }

   public void unlockChapter(int chapterId, boolean bInit) {
      ExpeditionChapterModel chapterModel = (ExpeditionChapterModel)this.player.getGameModelPool().getEntity("expeditionChapter", chapterId);
      if (chapterModel != null) {
         Map<Integer, ExpeditionDao> daoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
         ExpeditionDao expeditionDao = (ExpeditionDao)daoMap.get(chapterId);
         if (expeditionDao == null) {
            TreeMap<Integer, ExpeditionMapModel> treeMap = (TreeMap)this.player.getGameModelPool().getEntity("customExpeditionMap", chapterId);
            if (treeMap != null) {
               expeditionDao = new ExpeditionDao();
               expeditionDao.playerId = this.player.getPlayerId();
               expeditionDao.chapterId = chapterId;
               expeditionDao.version = chapterModel.getVersion();
               expeditionDao.curGrid = chapterModel.getInitGrid();
               expeditionDao.plot = 0;
               expeditionDao.beat = 0;
               expeditionDao.state = 1;
               expeditionDao.passed = false;
               expeditionDao.buffs.clear();
               expeditionDao.createFrontEventMap();
               expeditionDao.seeGridSet.clear();
               expeditionDao.box.clear();
               expeditionDao.totalBoxNum = 0;
               this.player.insertDao(expeditionDao, true);
               expeditionDao.seeGridSet.addAll(chapterModel.getSeeGrids());

               for(Map.Entry<Integer, ExpeditionMapModel> entry : treeMap.entrySet()) {
                  int gridId = (Integer)entry.getKey();
                  ExpeditionMapModel mapModel = (ExpeditionMapModel)entry.getValue();
                  ExpeditionGridInfo expeditionGridInfo = new ExpeditionGridInfo();
                  expeditionGridInfo.gridId = gridId;
                  expeditionGridInfo.state = chapterModel.getSeeGrids().contains(gridId) ? 1 : 0;
                  expeditionGridInfo.bOnce = false;
                  if (mapModel.getGridEventId() > 0) {
                     ExpeditionGridEventModel gridEventModel = (ExpeditionGridEventModel)ApplicationContextProvider.getModelPoolEntity("expeditionGridEvent", mapModel.getGridEventId());
                     if (gridEventModel != null && gridEventModel.getEvent().size() > 0) {
                        expeditionGridInfo.changeGrid(0, 0, gridEventModel.getEvent());

                        for(ExpeditionEventFun expeditionEventFun : gridEventModel.getEvent()) {
                           if (expeditionEventFun.getType() == 5) {
                              ++expeditionDao.totalBoxNum;
                              ExpeditionEventModel eventModel = (ExpeditionEventModel)this.player.getGameModelPool().getEntity("customExpeditionEvent", String.format("%d_%d", expeditionEventFun.getType(), expeditionEventFun.getId()));
                              if (eventModel != null && eventModel.getParam().size() > 0) {
                                 int boxId = (Integer)eventModel.getParam().get(0);
                                 expeditionDao.box.put(boxId, 0);
                              }
                           }
                        }
                     } else {
                        this.logger.info("远征格子事件配置错误 grid:{} gridEventId:{}", gridId, mapModel.getGridEventId());
                     }
                  }

                  if (mapModel.getChangeEventId() > 0) {
                     ExpeditionGridEventModel gridEventModel = (ExpeditionGridEventModel)ApplicationContextProvider.getModelPoolEntity("expeditionGridEvent", mapModel.getChangeEventId());
                     if (gridEventModel != null && gridEventModel.getEvent().size() > 0) {
                        for(ExpeditionEventFun expeditionEventFun : gridEventModel.getEvent()) {
                           if (expeditionEventFun.getType() == 5) {
                              this.logger.error("【远征】不可以在可转换事件中配置一次性宝箱 chapter:{} grid:{}", chapterId, mapModel.getGridId());
                              ++expeditionDao.totalBoxNum;
                              ExpeditionEventModel eventModel = (ExpeditionEventModel)this.player.getGameModelPool().getEntity("customExpeditionEvent", String.format("%d_%d", expeditionEventFun.getType(), expeditionEventFun.getId()));
                              if (eventModel != null && eventModel.getParam().size() > 0) {
                                 int boxId = (Integer)eventModel.getParam().get(0);
                                 expeditionDao.box.put(boxId, 0);
                              }
                           }
                        }
                     }
                  }

                  if (mapModel.getGridEventId() > 0 || mapModel.getChangeEventId() > 0) {
                     expeditionDao.gridInfoMap.put(gridId, expeditionGridInfo);
                  }
               }

               if (expeditionDao.totalBoxNum <= 0) {
                  this.logger.info("远征章节 chapterId:{} 配置数据错误，没有配置一次性宝箱", chapterId);
               }

               expeditionDao.updateOp();
               this.sendChapterInfos();
            }
         }
      }
   }

   private boolean checkEventLegal(int grid, int eventType) {
      Map<Integer, ExpeditionDao> daoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      ExpeditionDao expeditionDao = (ExpeditionDao)daoMap.get(this.curChapterId);
      if (expeditionDao != null && expeditionDao.seeGridSet.contains(grid)) {
         if (!expeditionDao.gridInfoMap.containsKey(grid)) {
            return this.player.failure(43006);
         } else {
            ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)expeditionDao.gridInfoMap.get(grid);
            int eventIdx = expeditionGridInfo.getEventIdx();
            if (eventIdx == 0) {
               return this.player.failure(43005);
            } else {
               ExpeditionEventFun eventFun = expeditionGridInfo.curEventFunc();
               return eventFun.getType() != eventType ? this.player.failure(43006) : true;
            }
         }
      } else {
         return this.player.failure(43007);
      }
   }

   private void checkAndSetNextEvent(int chapterId, int grid) {
      Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      ExpeditionDao expeditionDao = (ExpeditionDao)expeditionDaoMap.get(chapterId);
      if (expeditionDao != null) {
         if (expeditionDao.gridInfoMap.containsKey(grid)) {
            ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)expeditionDao.gridInfoMap.get(grid);
            if (expeditionGridInfo.getEventIdx() != 0) {
               ExpeditionMapModel mapModel = this.getMapModel(grid);
               if (mapModel != null) {
                  int nextIdx = expeditionGridInfo.getEventIdx() + 1;
                  List<ExpeditionEventFun> eventFunList = expeditionGridInfo.getEventFunList();
                  List<Integer> gridIdList = new ArrayList();
                  gridIdList.add(grid);
                  ExpeditionEventFun curEventFunc = expeditionGridInfo.curEventFunc();
                  if (curEventFunc != null && curEventFunc.getType() == 15) {
                     ExpeditionEventModel eventModel = (ExpeditionEventModel)this.player.getGameModelPool().getEntity("customExpeditionEvent", String.format("%d_%d", curEventFunc.getType(), curEventFunc.getId()));
                     if (eventModel != null) {
                        if (eventModel.getParam().size() >= 2 && (Integer)eventModel.getParam().get(1) == 1) {
                           nextIdx = expeditionGridInfo.getEventIdx();
                        }

                        this.checkFrontConditionMap(chapterId, curEventFunc.getId());
                     }
                  } else if (eventFunList.size() >= nextIdx) {
                     for(int idx = nextIdx - 1; idx < eventFunList.size(); ++idx) {
                        ExpeditionEventFun eventFun = (ExpeditionEventFun)eventFunList.get(nextIdx - 1);
                        if (eventFun.getType() == 9) {
                           List<Integer> unlockSeeGridList = this.unlockSeeGrid(chapterId, eventFun.getType(), eventFun.getId());
                           gridIdList.addAll(unlockSeeGridList);
                           ++nextIdx;
                        } else if (eventFun.getType() == 13) {
                           List<Integer> changeList = this.changeGrid(chapterId, eventFun.getType(), eventFun.getId());
                           gridIdList.addAll(changeList);
                           this._unlockSeeGridList.addAll(changeList);
                           ++nextIdx;
                        } else if (eventFun.getType() == 12) {
                           ++nextIdx;
                        } else if (eventFun.getType() == 5) {
                           if (expeditionGridInfo.bOnce) {
                              ++nextIdx;
                           }
                        } else if (eventFun.getType() == 7) {
                           if (expeditionDao.enemyDatas.containsKey(grid)) {
                              ExpeditionDao.EnemyData enemyData = (ExpeditionDao.EnemyData)expeditionDao.enemyDatas.get(grid);
                              enemyData.passed = false;
                              enemyData.hpDataMap.clear();
                           }
                        } else if (eventFun.getType() == 18) {
                           this.changeHeroIdle(eventFun.getType(), eventFun.getId());
                           ++nextIdx;
                        } else {
                           if (eventFun.getType() != 21) {
                              break;
                           }

                           Map<Integer, List<Integer>> frontEventMap = expeditionDao.frontEventMap;
                           if (CollectionUtils.isEmpty((Collection)frontEventMap.get(grid))) {
                              frontEventMap.remove(grid);
                              ++nextIdx;
                           }
                        }

                        this.checkFrontConditionMap(chapterId, eventFun.getId());
                     }
                  }

                  if (curEventFunc != null) {
                     this.checkFrontConditionMap(chapterId, curEventFunc.getId());
                  }

                  if (nextIdx > eventFunList.size()) {
                     nextIdx = 0;
                  }

                  expeditionGridInfo.setEventIdx(nextIdx);
                  expeditionDao.updateOp();
                  this.notifyUnlockSeeGrids();
                  this.noticeUpdateGridInfo(chapterId, gridIdList);
               }
            }
         }
      }
   }

   private void checkFrontConditionMap(int chapterId, int eventId) {
      Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      ExpeditionDao expeditionDao = (ExpeditionDao)expeditionDaoMap.get(chapterId);
      if (expeditionDao != null && !CollectionUtils.isEmpty(expeditionDao.frontEventMap)) {
         for(Map.Entry<Integer, List<Integer>> entry : expeditionDao.frontEventMap.entrySet()) {
            List<Integer> list = (List)entry.getValue();
            if (list.contains(eventId)) {
               list.remove(new Integer(eventId));
               if (CollectionUtils.isEmpty(list)) {
                  this.checkAndSetNextEvent(chapterId, (Integer)entry.getKey());
               }
            }
         }

      }
   }

   private void resumeChapterInfo(ExpeditionDao expeditionDao) {
      ExpeditionChapterModel chapterModel = (ExpeditionChapterModel)this.player.getGameModelPool().getEntity("expeditionChapter", expeditionDao.chapterId);
      if (chapterModel == null) {
         this.logger.info("远征 - 恢复的章节数据不存在 playerId:{}, chapterId:{}", this.player.getPlayerId(), expeditionDao.chapterId);
      } else {
         expeditionDao.curGrid = chapterModel.getInitGrid();
         expeditionDao.beat = 0;
         expeditionDao.state = 1;
         expeditionDao.buffs.clear();
         expeditionDao.createFrontEventMap();
         expeditionDao.gridBuffs.clear();
         expeditionDao.gridMonster.clear();
         expeditionDao.monsters.clear();
         expeditionDao.heroHp.clear();
         expeditionDao.chooseFriend.clear();
         expeditionDao.tempProps.clear();

         for(Map.Entry<Integer, ExpeditionGridInfo> entry : expeditionDao.gridInfoMap.entrySet()) {
            ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)entry.getValue();
            if (!expeditionGridInfo.bOnce) {
               ExpeditionMapModel expeditionMapModel = this.getMapModel(expeditionGridInfo.gridId);
               if (expeditionMapModel != null) {
                  if (expeditionMapModel.getGridEventId() > 0) {
                     ExpeditionGridEventModel gridEventModel = (ExpeditionGridEventModel)ApplicationContextProvider.getModelPoolEntity("expeditionGridEvent", expeditionMapModel.getGridEventId());
                     List<ExpeditionEventFun> eventFunList = (List<ExpeditionEventFun>)(gridEventModel != null ? gridEventModel.getEvent() : new ArrayList());
                     expeditionGridInfo.changeGrid(0, 0, eventFunList);
                  } else {
                     expeditionGridInfo.changeGrid(0, 0, new ArrayList());
                  }
               } else {
                  this.logger.info("远征 - 初始化格子事件时出错了");
               }
            }
         }

         for(Map.Entry<Integer, ExpeditionDao.EnemyData> entry : expeditionDao.enemyDatas.entrySet()) {
            ((ExpeditionDao.EnemyData)entry.getValue()).hpDataMap.clear();
         }

         expeditionDao.updateOp();
      }
   }

   private ExpeditionMapModel getMapModel(int grid) {
      Map<Integer, ExpeditionMapModel> mapModelMap = (Map)this.player.getGameModelPool().getEntity("customExpeditionMap", this.curChapterId);
      return mapModelMap != null ? (ExpeditionMapModel)mapModelMap.get(grid) : null;
   }

   private boolean openBox(int grid, int boxId, ExpeditionDao expeditionDao) {
      if (!expeditionDao.gridInfoMap.containsKey(grid)) {
         return this.player.failure(6);
      } else {
         ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)expeditionDao.gridInfoMap.get(grid);
         if (expeditionGridInfo.bOnce) {
            this.logger.info("开启宝箱为一次性事件，该宝箱已被开启");
            return this.player.failure(6);
         } else {
            BoxModel boxModel = (BoxModel)this.player.getGameModelPool().getEntity("box", boxId);
            if (boxModel == null) {
               this.logger.info("没有此宝箱对应的配置数据 boxId:" + boxId);
               return false;
            } else {
               expeditionGridInfo.bOnce = true;
               ++expeditionDao.openedBoxNum;
               expeditionDao.box.put(boxId, 1);
               if (expeditionDao.totalBoxNum == expeditionDao.openedBoxNum) {
                  expeditionDao.passed = true;
                  this.logger.info("已领取所有宝箱，恭喜通关");
                  this.player.triggerTask(354, 0, (long)expeditionDao.chapterId, 0);
                  if (expeditionDao.activityId == 5800) {
                     ActivityKrEventHeroPart activityKrEventHeroPart = (ActivityKrEventHeroPart)this.player.getMgrPart(ActivityKrEventHeroPart.class);
                     activityKrEventHeroPart.completeChapterHandle(expeditionDao.chapterId);
                  } else {
                     ActivityEventHeroPart activityEventHeroPart = (ActivityEventHeroPart)this.player.getMgrPart(ActivityEventHeroPart.class);
                     activityEventHeroPart.completeChapterHandle(expeditionDao.chapterId);
                  }

                  this.battleRecordMgr.pushTaskEx("updateExpeditionRecord", new Object[]{expeditionDao.chapterId, this.player.getPlayerId(), expeditionDao.heroMirrors});
                  this.checkUnlockChapter(0);
               }

               expeditionDao.updateOp();
               List<ResourceModel> resourceModelList = new ArrayList();
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

               for(ResourceModel resourceModel : boxModel.getItem()) {
                  boolean bAdd = true;
                  if (resourceModel.getType() == 2) {
                     ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", resourceModel.getId());
                     if (itemModel != null && itemModel.getSubclass() == 7) {
                        int totalNum = itemBagPart.getItemNum(resourceModel.getId());
                        if (totalNum > 0) {
                           this.logger.info("背包中已拥有该图腾，不需要再添加 playerId:{}, itemId:{}", this.player.getPlayerId(), resourceModel.getId());
                           bAdd = false;
                        }
                     }
                  }

                  if (bAdd) {
                     resourceModelList.add(resourceModel);
                     HeroSkinActivityPart heroSkinActivityPart = (HeroSkinActivityPart)this.player.getMgrPart(HeroSkinActivityPart.class);
                     if (!heroSkinActivityPart.isServerActivityInvalid()) {
                        ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", heroSkinActivityPart.getPlayerActivityId());
                        if (activityOpenTimeModel != null && activityOpenTimeModel.getExpeditionId() == this.curChapterId) {
                           this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "鬼神传说", resourceModel.getType() + "-" + resourceModel.getId() + "-" + resourceModel.getValue(), "", 0, 0, 0);
                        }
                     }
                  }
               }

               if (resourceModelList.size() > 0) {
                  String desc = String.format("chapterId:%d, grid:%d, boxId:%d", this.curChapterId, grid, boxId);
                  this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 43, 4301, 0, 0, desc);
               }

               this.sendChapterInfos();
               ExpeditionChapterModel chapterModel = (ExpeditionChapterModel)ApplicationContextProvider.getModelPoolEntity("expeditionChapter", expeditionDao.chapterId);
               if (chapterModel != null) {
                  int persent = expeditionDao.openedBoxNum * 100 / expeditionDao.totalBoxNum;
                  String desc = "远征-" + chapterModel.getName() + persent + "%";
                  this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", desc, "1");
               }

               return true;
            }
         }
      }
   }

   private boolean transmit(int grid, List<Integer> params, ExpeditionDao expeditionDao) {
      if (!expeditionDao.gridInfoMap.containsKey(grid)) {
         return this.player.failure(6);
      } else if (params.size() < 2) {
         return false;
      } else {
         expeditionDao.curGrid = (Integer)params.get(0);
         expeditionDao.updateOp();
         ExpeditionMsg.S2C_UpdateHeroPos_10332.Builder builder = ExpeditionMsg.S2C_UpdateHeroPos_10332.newBuilder();
         builder.setCurGrid((Integer)params.get(0));
         this.player.sendMsg(builder.build());
         return true;
      }
   }

   private boolean heroHeal(ExpeditionDao expeditionDao) {
      List<ExpeditionMsg.HpData.Builder> list = new ArrayList();

      for(Map.Entry<Integer, ExpeditionDao.HpData> entry : expeditionDao.heroHp.entrySet()) {
         ExpeditionDao.HpData hpData = (ExpeditionDao.HpData)entry.getValue();
         if (hpData.hpPercent > 0 && hpData.hpPercent < 100) {
            long maxHp = hpData.hp / (long)hpData.hpPercent * 100L;
            hpData.hpPercent = hpData.hpPercent + 50 > 100 ? 100 : hpData.hpPercent + 50;
            hpData.hp = maxHp * (long)hpData.hpPercent / 100L;
            ExpeditionMsg.HpData.Builder builder = ExpeditionMsg.HpData.newBuilder();
            builder.setCode((Integer)entry.getKey());
            builder.setHp(hpData.hpPercent);
            list.add(builder);
         }
      }

      if (list.size() > 0) {
         expeditionDao.updateOp();
         this.sendHeroHpData(list);
         return true;
      } else {
         return false;
      }
   }

   private boolean rebirth(ExpeditionDao expeditionDao) {
      List<Integer> codeList = new ArrayList();

      for(Map.Entry<Integer, ExpeditionDao.HpData> entry : expeditionDao.heroHp.entrySet()) {
         ExpeditionDao.HpData hpData = (ExpeditionDao.HpData)entry.getValue();
         if (hpData.hpPercent <= 0) {
            codeList.add(entry.getKey());
         }
      }

      if (codeList.size() == 0) {
         return false;
      } else {
         int randInt = RandomUtil.randInt(codeList.size());
         int code = (Integer)codeList.get(randInt);
         expeditionDao.heroHp.remove(code);
         expeditionDao.updateOp();
         List<ExpeditionMsg.HpData.Builder> list = new ArrayList();
         ExpeditionMsg.HpData.Builder builder = ExpeditionMsg.HpData.newBuilder();
         builder.setCode(code);
         builder.setHp(100);
         list.add(builder);
         this.sendHeroHpData(list);
         return true;
      }
   }

   public int enterBattle(BattleDao battleDao) {
      List<Integer> params = battleDao.params;
      if (params != null && params.size() >= 1) {
         int grid = (Integer)params.get(0);
         if (!this.checkEventLegal(grid, 7)) {
            return 43003;
         } else {
            Map<Integer, ExpeditionDao> daoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
            ExpeditionDao expeditionDao = (ExpeditionDao)daoMap.get(this.curChapterId);
            if (expeditionDao == null) {
               this.logger.info("找不到远征章节数据 chapterId:{}", this.curChapterId);
               return 6;
            } else if (!this.checkUnlockExtra(this.curChapterId)) {
               return 43001;
            } else if (!expeditionDao.gridInfoMap.containsKey(grid)) {
               this.logger.info("远征 - 该格子没有事件，不可攻打 grid;{}", grid);
               return 6;
            } else {
               ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)expeditionDao.gridInfoMap.get(grid);
               ExpeditionEventFun eventFun = expeditionGridInfo.curEventFunc();
               ExpeditionEventModel eventModel = (ExpeditionEventModel)this.player.getGameModelPool().getEntity("customExpeditionEvent", String.format("%d_%d", eventFun.getType(), eventFun.getId()));
               if (eventModel != null && (Integer)eventModel.getParam().get(1) == battleDao.modelId) {
                  BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", battleDao.modelId);
                  if (battleModel == null) {
                     return 6;
                  } else {
                     this.addEmployee(params, expeditionDao, battleDao.scene);
                     BattlePKTeam myPKTeam = battleDao.scene.getPKTeam((byte)0);
                     if (myPKTeam.getEntityMap().size() == 0) {
                        return 4125;
                     } else {
                        if (!expeditionDao.heroHp.isEmpty()) {
                           for(Map.Entry<Byte, Entity> entry : myPKTeam.getEntityMap().entrySet()) {
                              int heroCode = ((Entity)entry.getValue()).getHeroCode();
                              if (expeditionDao.heroHp.containsKey(heroCode)) {
                                 ExpeditionDao.HpData hpData = (ExpeditionDao.HpData)expeditionDao.heroHp.get(heroCode);
                                 ((Entity)entry.getValue()).setBaseProperty(99, hpData.hp);
                              }
                           }
                        }

                        Entity friendEntity = myPKTeam.getFriendEntity();
                        if (friendEntity != null && expeditionDao.heroHp.containsKey(friendEntity.getHeroCode())) {
                           ExpeditionDao.HpData hpData = (ExpeditionDao.HpData)expeditionDao.heroHp.get(friendEntity.getHeroCode());
                           friendEntity.setBaseProperty(99, hpData.hp);
                        }

                        boolean isAllDead = true;

                        for(Entity entity : myPKTeam.getEntityMap().values()) {
                           if (entity.getTeamPos() <= 5 && entity.getBaseProperty(99) > 0L) {
                              isAllDead = false;
                              break;
                           }
                        }

                        if (isAllDead) {
                           return 43014;
                        } else {
                           for(Entity entity : myPKTeam.getEntityMap().values()) {
                              for(int id : expeditionDao.buffs) {
                                 ExpeditionSpoilsWarModel model = (ExpeditionSpoilsWarModel)this.player.getGameModelPool().getEntity("expeditionSpoilsOfWar", id);
                                 if (model != null) {
                                    for(PropertyModel buff : model.getBuffs()) {
                                       this.addProperty(entity, buff.getType(), buff.getWay(), buff.getValue());
                                    }
                                 }
                              }

                              WorldDao<ExpeditionBuffAddtionData> worldDao = this.worldMgr.<ExpeditionBuffAddtionData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_EXPEDITION_BUFF_ADDITION);
                              if (((ExpeditionBuffAddtionData)worldDao.jsonData).passInfoMap.containsKey(expeditionDao.chapterId)) {
                                 int count = (Integer)MapUtil.getOrDefault(((ExpeditionBuffAddtionData)worldDao.jsonData).passInfoMap, expeditionDao.chapterId, 0);
                                 ExpeditionChapterModel expeditionChapterModel = (ExpeditionChapterModel)ApplicationContextProvider.getModelPoolEntity("expeditionChapter", expeditionDao.chapterId);

                                 for(PropertyModel buff : expeditionChapterModel.getPropertys()) {
                                    int addtionValue = Math.min((int)buff.getValue() * count, expeditionChapterModel.getChapterBuffMax());
                                    this.addProperty(entity, buff.getType(), buff.getWay(), (long)addtionValue);
                                 }
                              }
                           }

                           BattlePKTeam enemyPKTeam = new BattlePKTeam(battleDao.modelId);
                           battleDao.scene.addPKTeam((byte)1, enemyPKTeam);
                           if (!expeditionDao.enemyDatas.isEmpty()) {
                              ExpeditionDao.EnemyData enemyData = (ExpeditionDao.EnemyData)expeditionDao.enemyDatas.get(grid);
                              Map<Byte, Entity> entityMap = battleDao.scene.getPKTeam((byte)1).getEntityMap();

                              for(Map.Entry<Byte, Entity> entry : entityMap.entrySet()) {
                                 int pos = ((Entity)entry.getValue()).getTeamPos();
                                 if (enemyData.hpDataMap.containsKey(pos)) {
                                    ExpeditionDao.HpData hpData = (ExpeditionDao.HpData)enemyData.hpDataMap.get(pos);
                                    ((Entity)entry.getValue()).setBaseProperty(99, hpData.hp);
                                 }
                              }
                           }

                           int expeditionMaxRound = this.configManager.getIntDefault("expeditionMaxRound", 17);
                           battleDao.scene.setMaxRound((byte)expeditionMaxRound);
                           return 1;
                        }
                     }
                  }
               } else {
                  return 6;
               }
            }
         }
      } else {
         return 0;
      }
   }

   public void afterFight(BattleDao battleDao) {
      List<Integer> params = battleDao.params;
      int grid = (Integer)params.get(0);
      Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      ExpeditionDao expeditionDao = (ExpeditionDao)expeditionDaoMap.get(this.curChapterId);
      if (expeditionDao != null) {
         List<ExpeditionMsg.HpData.Builder> list = new ArrayList();
         long totalFight = 0L;
         List<HeroMirror> tempHeroMirror = new ArrayList();
         BattlePKTeam leftPkTeam = battleDao.scene.getPKTeam((byte)0);
         HashMap<Byte, Entity> myEntityMap = leftPkTeam.getEntityMap();

         for(Map.Entry<Byte, Entity> entry : myEntityMap.entrySet()) {
            if ((Byte)entry.getKey() <= 5) {
               Entity entity = (Entity)entry.getValue();
               this.recordHpData(entity, expeditionDao.heroHp);
               ExpeditionMsg.HpData.Builder hpDataBuilder = ExpeditionMsg.HpData.newBuilder();
               hpDataBuilder.setCode(entity.getHeroCode());
               ExpeditionDao.HpData hpData = (ExpeditionDao.HpData)expeditionDao.heroHp.get(entity.getHeroCode());
               hpDataBuilder.setHp(hpData.hpPercent);
               list.add(hpDataBuilder);
               totalFight += entity.getCombatPower();
               tempHeroMirror.add(entity.getHeroMirror());
            }
         }

         Entity friendEntity = leftPkTeam.getFriendEntity();
         if (friendEntity != null && friendEntity.getTeamPos() <= 5) {
            this.recordHpData(friendEntity, expeditionDao.heroHp);
            ExpeditionMsg.HpData.Builder hpDataBuilder = ExpeditionMsg.HpData.newBuilder();
            hpDataBuilder.setCode(friendEntity.getHeroCode());
            ExpeditionDao.HpData hpData = (ExpeditionDao.HpData)MapUtil.computeIfAbsent(expeditionDao.heroHp, friendEntity.getHeroCode(), ExpeditionDao.HpData.class);
            hpDataBuilder.setHp(hpData.hpPercent);
            list.add(hpDataBuilder);
            totalFight += friendEntity.getCombatPower();
            tempHeroMirror.add(friendEntity.getHeroMirror());
         }

         long recordFight = 0L;

         for(HeroMirror heroMirror : expeditionDao.heroMirrors) {
            recordFight += heroMirror.combatPower;
         }

         if (totalFight > recordFight) {
            expeditionDao.heroMirrors.clear();
            expeditionDao.heroMirrors.addAll(tempHeroMirror);
         }

         this.sendHeroHpData(list);
         HashMap<Byte, Entity> enemyEntityMap = battleDao.scene.getPKTeam((byte)1).getEntityMap();
         ExpeditionDao.EnemyData enemyData = (ExpeditionDao.EnemyData)expeditionDao.enemyDatas.get(grid);
         if (enemyData != null) {
            for(Map.Entry<Byte, Entity> enemyEntry : enemyEntityMap.entrySet()) {
               byte pos = (Byte)enemyEntry.getKey();
               if (pos <= 5) {
                  Entity entity = (Entity)enemyEntry.getValue();
                  long curHp = entity.getBaseProperty(99);
                  long maxHp = entity.getBaseProperty(1);
                  ExpeditionDao.HpData hpData = (ExpeditionDao.HpData)MapUtil.computeIfAbsent(enemyData.hpDataMap, Integer.valueOf(pos), ExpeditionDao.HpData.class);
                  hpData.hp = curHp;
                  hpData.hpPercent = CalculateUtil.calPercent(curHp, maxHp);
               }
            }
         }

         if (battleDao.scene.getWinForce() == 0) {
            this.checkAndSetNextEvent(this.curChapterId, grid);
            if (enemyData != null && !enemyData.passed) {
               enemyData.passed = true;
               ++expeditionDao.beat;
            }
         }

         expeditionDao.updateOp();
         this.notifyUnlockSeeGrids();
         battleDao.scene.getBattleMsg().addAllExParams(params);
         HeroSkinActivityPart heroSkinActivityPart = (HeroSkinActivityPart)this.player.getMgrPart(HeroSkinActivityPart.class);
         if (!heroSkinActivityPart.isServerActivityInvalid()) {
            ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", heroSkinActivityPart.getPlayerActivityId());
            if (activityOpenTimeModel != null && activityOpenTimeModel.getExpeditionId() == this.curChapterId) {
               this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "鬼神传说", grid + "", battleDao.scene.getWinForce() == 0 ? "成功" : "失败", 0, 0, 0);
            }
         }

      }
   }

   private void recordHpData(Entity entity, Map<Integer, ExpeditionDao.HpData> hpMap) {
      if (entity != null && entity.getTeamPos() <= 5) {
         long curHp = entity.getBaseProperty(99);
         long maxHp = entity.getBaseProperty(1);
         ExpeditionDao.HpData hpData = (ExpeditionDao.HpData)MapUtil.computeIfAbsent(hpMap, entity.getHeroCode(), ExpeditionDao.HpData.class);
         hpData.hp = curHp;
         hpData.hpPercent = CalculateUtil.calPercent(curHp, maxHp);
      }

   }

   private void addEmployee(List<Integer> params, ExpeditionDao expeditionDao, BattleScene scene) {
      if (params.size() >= 2 && params.size() % 2 == 0) {
         int heroNum = params.size() / 2 - 1;

         for(int i = 1; i <= heroNum; ++i) {
            byte pos = ((Integer)params.get(i * 2)).byteValue();
            int heroCode = (Integer)params.get(i * 2 + 1);
            HeroMirror heroMirror = (HeroMirror)expeditionDao.monsters.get(heroCode);
            ExpeditionDao.HpData hpData = (ExpeditionDao.HpData)expeditionDao.heroHp.get(heroCode);
            if ((hpData == null || hpData.hpPercent > 0) && heroMirror != null && pos > -1 && scene.getPKTeam((byte)0).getEntity(pos) == null) {
               HeroRankMgr heroRankMgr = (HeroRankMgr)ApplicationContextProvider.getContext().getBean(HeroRankMgr.class);
               scene.addHero((byte)0, pos, heroMirror, heroRankMgr.getHeroCompensate(heroMirror.id));
            }
         }

      }
   }

   private List<Integer> unlockSeeGrid(int chapterId, int eventType, int eventId) {
      List<Integer> gridIdList = new ArrayList();
      if (eventType != 9) {
         return gridIdList;
      } else {
         ExpeditionEventModel eventModel = (ExpeditionEventModel)this.player.getGameModelPool().getEntity("customExpeditionEvent", String.format("%d_%d", eventType, eventId));
         if (eventModel == null) {
            return gridIdList;
         } else {
            Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
            ExpeditionDao expeditionDao = (ExpeditionDao)expeditionDaoMap.get(chapterId);
            if (expeditionDao == null) {
               return gridIdList;
            } else {
               List<String> list = Splitter.on("|").splitToList(eventModel.getArgs());

               for(int i = 0; i < list.size(); ++i) {
                  int gridId = Integer.parseInt((String)list.get(i));
                  if (!expeditionDao.seeGridSet.contains(gridId)) {
                     expeditionDao.seeGridSet.add(gridId);
                     ExpeditionMapModel mapModel = this.getMapModel(gridId);
                     if (mapModel != null) {
                        ExpeditionGridInfo expeditionGridInfo = new ExpeditionGridInfo();
                        expeditionGridInfo.gridId = gridId;
                        expeditionGridInfo.state = 1;
                        if (mapModel.getGridEventId() > 0) {
                           ExpeditionGridEventModel gridEventModel = (ExpeditionGridEventModel)ApplicationContextProvider.getModelPoolEntity("expeditionGridEvent", mapModel.getGridEventId());
                           if (gridEventModel != null) {
                              expeditionGridInfo.changeGrid(0, 0, gridEventModel.getEvent());
                           } else {
                              this.logger.info("远征格子事件配置错误 grid:{} gridEventId:{}", gridId, mapModel.getGridEventId());
                           }
                        }

                        gridIdList.add(gridId);
                     }
                  }
               }

               expeditionDao.updateOp();
               return gridIdList;
            }
         }
      }
   }

   private List<Integer> changeGrid(int chapterId, int eventType, int eventId) {
      List<Integer> gridIdList = new ArrayList();
      Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      ExpeditionDao expeditionDao = (ExpeditionDao)expeditionDaoMap.get(chapterId);
      if (expeditionDao == null) {
         return gridIdList;
      } else if (eventType != 13) {
         return gridIdList;
      } else {
         ExpeditionEventModel eventModel = (ExpeditionEventModel)this.player.getGameModelPool().getEntity("customExpeditionEvent", String.format("%d_%d", eventType, eventId));
         if (eventModel == null) {
            return gridIdList;
         } else {
            String[] strings = eventModel.getArgs().split(",");

            for(int i = 0; i < strings.length; ++i) {
               String[] arr = strings[i].split("\\|");
               int grid = Integer.parseInt(arr[0]);
               ExpeditionMapModel expeditionMapModel = this.getMapModel(grid);
               if (expeditionMapModel != null) {
                  ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)expeditionDao.gridInfoMap.get(grid);
                  if (expeditionGridInfo == null) {
                     expeditionGridInfo = new ExpeditionGridInfo();
                     expeditionGridInfo.gridId = grid;
                     expeditionGridInfo.state = 1;
                     expeditionGridInfo.bOnce = false;
                     expeditionDao.gridInfoMap.put(grid, expeditionGridInfo);
                     expeditionDao.updateOp();
                  }

                  ExpeditionGridEventModel gridEventModel = (ExpeditionGridEventModel)ApplicationContextProvider.getModelPoolEntity("expeditionGridEvent", expeditionMapModel.getChangeEventId());
                  List<ExpeditionEventFun> eventFuns = (List<ExpeditionEventFun>)(gridEventModel != null ? gridEventModel.getEvent() : new ArrayList());
                  expeditionGridInfo.changeGrid(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), eventFuns);
                  expeditionGridInfo.state = 2;
                  gridIdList.add(grid);
                  if (eventFuns.size() > 0 && ((ExpeditionEventFun)eventFuns.get(0)).getType() == 5 && expeditionGridInfo.bOnce) {
                     int eventIdx = eventFuns.size() > 1 ? 2 : 0;
                     expeditionGridInfo.setEventIdx(eventIdx);
                  }

                  if (expeditionDao.enemyDatas.containsKey(grid)) {
                     expeditionDao.enemyDatas.remove(grid);
                  }
               } else {
                  this.logger.info("更改格子状态 - grid:{}配置错误", grid);
               }
            }

            return gridIdList;
         }
      }
   }

   private void sendHeroHpData(List<ExpeditionMsg.HpData.Builder> list) {
      if (list.size() != 0) {
         ExpeditionMsg.S2C_HeroHpData_10328.Builder builder = ExpeditionMsg.S2C_HeroHpData_10328.newBuilder();

         for(ExpeditionMsg.HpData.Builder hpData : list) {
            builder.addHpData(hpData);
         }

         this.player.sendMsg(builder.build());
      }
   }

   public void addProperty(Entity entity, int type, int way, long value) {
      if (way == 0) {
         entity.modifyBaseProperty(type, value);
      } else if (way == 1) {
         double addValue = NumberUtil.div((float)value, 10000.0F, 2);
         entity.modifyBaseProperty(type, (long)NumberUtil.mul(BigDecimal.valueOf(entity.getBaseProperty(type)), BigDecimal.valueOf(addValue)).intValue());
      }

   }

   public void checkUnlockChapter(int id) {
      if (id == 0) {
         BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
         id = battleChapterDao.chapterId;
      }

      Map<Integer, ExpeditionChapterModel> map = this.player.getGameModelPool().getMap("expeditionChapter");

      for(Map.Entry<Integer, ExpeditionChapterModel> entry : map.entrySet()) {
         ExpeditionChapterModel chapterModel = (ExpeditionChapterModel)entry.getValue();
         if (chapterModel.getType() != 3 && id >= chapterModel.getMissionId()) {
            this.unlockChapter(((ExpeditionChapterModel)entry.getValue()).getId(), false);
         }
      }

   }

   private void noticeUpdateGridInfo(int chapterId, List<Integer> gridIdList) {
      if (gridIdList != null && gridIdList.size() != 0) {
         Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
         ExpeditionDao expeditionDao = (ExpeditionDao)expeditionDaoMap.get(chapterId);
         ExpeditionMsg.S2C_UpdateGridInfo_10312.Builder builder = ExpeditionMsg.S2C_UpdateGridInfo_10312.newBuilder();

         for(Integer tempGridId : gridIdList) {
            ExpeditionMsg.S2C_GridInfo_10314.Builder gridInfoBuilder = ExpeditionMsg.S2C_GridInfo_10314.newBuilder();
            gridInfoBuilder.setGrid(tempGridId);
            ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)expeditionDao.gridInfoMap.get(tempGridId);
            if (expeditionGridInfo != null) {
               gridInfoBuilder.setEventIdx(expeditionGridInfo.getEventIdx());
               if (expeditionGridInfo.state == 2) {
                  gridInfoBuilder.setGridType(expeditionGridInfo.gridType);
                  gridInfoBuilder.setGridIcon(expeditionGridInfo.gridIcon);
               }
            } else {
               gridInfoBuilder.setEventIdx(0);
            }

            builder.addInfo(gridInfoBuilder);
         }

         this.player.sendMsg(builder.build());
      }
   }

   private void notifyUnlockSeeGrids() {
      if (!this._unlockSeeGridList.isEmpty()) {
         ExpeditionMsg.S2C_UnlockSeeGrids_10330.Builder builder = ExpeditionMsg.S2C_UnlockSeeGrids_10330.newBuilder();
         builder.addAllGrid(this._unlockSeeGridList);
         this.player.sendMsg(builder.build());
         this._unlockSeeGridList.clear();
      }
   }

   public void loginHandle() {
      this.checkChapterVersion();
      this.updateSupportHero();
   }

   private void checkChapterVersion() {
      Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());

      for(ExpeditionDao expeditionDao : expeditionDaoMap.values()) {
         ExpeditionChapterModel chapterModel = (ExpeditionChapterModel)ApplicationContextProvider.getModelPoolEntity("expeditionChapter", expeditionDao.chapterId);
         if (chapterModel != null && expeditionDao.version < chapterModel.getVersion()) {
            this.resetChatpter(expeditionDao.chapterId);
         }
      }

   }

   public void resetChatpter(int chapterId) {
      Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      if (expeditionDaoMap.containsKey(chapterId)) {
         ExpeditionDao expeditionDao = (ExpeditionDao)expeditionDaoMap.get(chapterId);
         this.player.deleteDao(expeditionDao, true);
      }

      this.logger.info("重置第{}章远征数据", chapterId);
      this.unlockChapter(chapterId, true);
   }

   public void clearChapter(int chapterId) {
      Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
      if (expeditionDaoMap.containsKey(chapterId)) {
         ExpeditionDao expeditionDao = (ExpeditionDao)expeditionDaoMap.get(chapterId);
         this.player.deleteDao(expeditionDao, true);
      }

   }

   private int getDispatchCode() {
      HeroSupportDao heroSupportDao = this.getExpeditionSupportDao(this.player.getPlayerId());
      Map<Integer, Integer> argsMap = this.getHeroSupportArgs(heroSupportDao.args);
      int uniqueCode = (Integer)MapUtil.getOrDefault(argsMap, 2, 800000);
      if (uniqueCode >= 810000 || uniqueCode <= 0) {
         uniqueCode = 800000;
      }

      ++uniqueCode;
      heroSupportDao.args = this.packHeroSupportArgs((Integer)MapUtil.getOrDefault(argsMap, 1, 0), uniqueCode);
      heroSupportDao.updateOp();
      return uniqueCode;
   }

   private boolean resetGridEvent(int chapterId, int grid, String args, ExpeditionDao expeditionDao) {
      boolean bIncludeSelf = false;
      Set<Integer> gridIdSet = new HashSet();
      String[] strings = args.split(",");

      for(int i = 0; i < strings.length; ++i) {
         String[] arr = strings[i].split("\\|");
         int changeGrid = Integer.parseInt(arr[0]);
         ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)expeditionDao.gridInfoMap.get(changeGrid);
         if (expeditionGridInfo == null) {
            expeditionGridInfo = new ExpeditionGridInfo();
            expeditionGridInfo.gridId = changeGrid;
            expeditionGridInfo.state = 1;
            expeditionGridInfo.bOnce = false;
            expeditionDao.gridInfoMap.put(changeGrid, expeditionGridInfo);
            expeditionDao.updateOp();
         }

         ExpeditionMapModel expeditionMapModel = this.getMapModel(changeGrid);
         if (expeditionMapModel != null) {
            int eventId = Integer.parseInt(arr[1]) == 2 ? expeditionMapModel.getChangeEventId() : expeditionMapModel.getGridEventId();
            ExpeditionGridEventModel gridEventModel = (ExpeditionGridEventModel)ApplicationContextProvider.getModelPoolEntity("expeditionGridEvent", eventId);
            List<ExpeditionEventFun> eventFuns = (List<ExpeditionEventFun>)(gridEventModel != null ? gridEventModel.getEvent() : new ArrayList());
            expeditionGridInfo.changeGrid(Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), eventFuns);
            expeditionGridInfo.state = Integer.parseInt(arr[1]);
            if (eventFuns.size() > 0 && ((ExpeditionEventFun)eventFuns.get(0)).getType() == 5 && expeditionGridInfo.bOnce) {
               int eventIdx = eventFuns.size() > 1 ? 2 : 0;
               expeditionGridInfo.setEventIdx(eventIdx);
            }

            if (expeditionDao.enemyDatas.containsKey(changeGrid)) {
               expeditionDao.enemyDatas.remove(changeGrid);
            }

            gridIdSet.add(grid);
            gridIdSet.add(changeGrid);
            bIncludeSelf = bIncludeSelf || grid == changeGrid;
         }
      }

      List<Integer> gridList = new ArrayList(gridIdSet);
      this.noticeUpdateGridInfo(chapterId, gridList);
      this._unlockSeeGridList.addAll(gridList);
      return !bIncludeSelf;
   }

   private void changeHeroIdle(int eventType, int eventId) {
      ExpeditionEventModel eventModel = (ExpeditionEventModel)this.player.getGameModelPool().getEntity("customExpeditionEvent", String.format("%d_%d", eventType, eventId));
      if (eventModel != null) {
         int heroId = (Integer)eventModel.getParam().get(0);
         if (heroId != 0) {
            this.setHeroIdleId(heroId);
            ExpeditionMsg.S2C_ChangeHeroIdle_10344.Builder builder = ExpeditionMsg.S2C_ChangeHeroIdle_10344.newBuilder();
            builder.setHeroId(heroId);
            this.player.sendMsg(builder.build());
         }
      }
   }

   private void setHeroIdleId(int heroId) {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      playerExtend.expeditionHeroId = heroId;
      this.player.updatePlayerExtend(13);
   }

   private int getHeroIdleId() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      return playerExtend.expeditionHeroId;
   }

   private boolean getTempProps(int grid, String args, ExpeditionDao expeditionDao) {
      if (!expeditionDao.gridInfoMap.containsKey(grid)) {
         return this.player.failure(6);
      } else {
         List<ResourceModel> resourceModels = ResourceModel.buildResources(args);
         if (resourceModels.size() == 0) {
            this.logger.info("远征 没有配置临时物品 grid:{}", grid);
            return false;
         } else {
            List<ResourceModel> changeList = new ArrayList();

            for(ResourceModel resourceModel : resourceModels) {
               if (expeditionDao.tempProps.containsKey(resourceModel.getId())) {
                  ResourceModel exitResource = (ResourceModel)expeditionDao.tempProps.get(resourceModel.getId());
                  exitResource.setValue(exitResource.getValue() + resourceModel.getValue());
               } else {
                  expeditionDao.tempProps.put(resourceModel.getId(), resourceModel);
               }

               changeList.add(expeditionDao.tempProps.get(resourceModel.getId()));
            }

            expeditionDao.updateOp();
            ExpeditionMsg.S2C_TempProps_10346.Builder builder = ExpeditionMsg.S2C_TempProps_10346.newBuilder();

            for(ResourceModel resourceModel : changeList) {
               builder.addTempProps(resourceModel.builder());
            }

            this.player.sendMsg(builder.build());
            return true;
         }
      }
   }

   private void updateTempPros(ExpeditionDao expeditionDao, ResourceModel resourceModel) {
      if (expeditionDao.tempProps.containsKey(resourceModel.getId())) {
         ResourceModel model = (ResourceModel)expeditionDao.tempProps.get(resourceModel.getId());
         if (model.getType() == resourceModel.getType()) {
            model.setValue(Math.max(0, model.getValue() - resourceModel.getValue()));
            expeditionDao.updateOp();
         }
      }

   }

   private HeroSupportDao createHeroSupportDao() {
      HeroSupportDao heroSupportDao = new HeroSupportDao(this.player.getPlayerId(), HeroSupportDao.SupportModule.EXPEDITION, (HeroMirror)null);
      heroSupportDao.args = this.packHeroSupportArgs(0, 800000);
      this.worldMgr.getGameCachePool().insertDao(heroSupportDao, true);
      return heroSupportDao;
   }

   private HeroSupportDao getExpeditionSupportDao(int playerId) {
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      HeroSupportDao heroSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.EXPEDITION, playerId);
      if (heroSupportDao == null && this.player.getPlayerId() == playerId) {
         heroSupportDao = this.createHeroSupportDao();
      }

      return heroSupportDao;
   }

   private Map<Integer, Integer> getHeroSupportArgs(String args) {
      Map<Integer, Integer> map = new HashMap();
      if (args != null && args != "") {
         for(String s : args.split("\\|")) {
            String[] arr = s.split("=");
            map.put(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
         }

         return map;
      } else {
         return map;
      }
   }

   private String packHeroSupportArgs(int heroCode, int uniqueCode) {
      return "1=" + heroCode + "|" + 2 + "=" + uniqueCode;
   }

   public void updateSupportHero() {
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      HeroSupportDao heroSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.EXPEDITION, this.player.getPlayerId());
      if (heroSupportDao != null) {
         Map<Integer, Integer> argsMap = this.getHeroSupportArgs(heroSupportDao.args);
         int heroCode = (Integer)MapUtil.getOrDefault(argsMap, 1, 0);
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
         if (heroDao != null) {
            heroBagPart.heroBagFlushProperties(heroDao);
            int uniqueCode = (Integer)MapUtil.getOrDefault(argsMap, 2, 0);
            HeroMirror heroMirror = HeroMirror.fromHeroBean(heroDao);
            heroMirror.code = uniqueCode;
            heroSupportDao.heroSupport = heroMirror;
            heroSupportDao.updateOp();
         }
      }

   }

   private boolean checkUnlockExtra(int chapterId) {
      ExpeditionChapterModel chapterModel = (ExpeditionChapterModel)ApplicationContextProvider.getModelPoolEntity("expeditionChapter", chapterId);
      if (chapterModel == null) {
         return false;
      } else {
         if (chapterModel.getLastId() > 0) {
            Map<Integer, ExpeditionDao> expeditionDaoMap = this.player.<Integer, ExpeditionDao>getMap("tb_expedition", this.player.getPlayerId());
            ExpeditionDao lastExpeditionDao = (ExpeditionDao)expeditionDaoMap.get(chapterModel.getLastId());
            if (lastExpeditionDao == null || !lastExpeditionDao.passed) {
               return false;
            }
         }

         return true;
      }
   }
}
