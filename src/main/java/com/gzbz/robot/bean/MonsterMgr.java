package com.gzbz.robot.bean;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.battle.entity.Monster;
import com.gzbz.db.GameDBPool;
import com.gzbz.db.MonsterTeamDao;
import com.gzbz.db.MonsterTeamPowerDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.arraying.FriendArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.db.bean.MonsterData;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.model.GeneralAvatarModel;
import com.gzbz.model.MonarchImageModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.robot.MonsterManager;
import com.gzbz.robot.RobotData;
import com.gzbz.spring.ApplicationContextProvider;
import com.yy.db.CrossMonsterTeamDao;
import com.yy.db.CrossMonsterTeamPowerDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@MgrAnno
public class MonsterMgr extends GameMgr {
   static Logger logger = LoggerFactory.getLogger(MonsterMgr.class);
   @Autowired
   private GameDBPool dbPool;
   @Autowired
   MonsterManager monsterManager;

   protected void init() throws Exception {
   }

   public void initBaseRobot() throws Exception {
      Map<Integer, MonsterTeamPowerDao> heroDaoMap = this.getMonsterTeamPowerMap();
      if (heroDaoMap == null || heroDaoMap.isEmpty()) {
         (new Exception("游戏服机器人初始化失败,请导入机器人SQL文件！")).printStackTrace();
         System.exit(0);
      }

   }

   public void delMonsterTable() {
      try {
         this.dbPool.delBySql("DELETE  FROM tb_monster_team;", new Object[0]);
         this.dbPool.delBySql("DELETE  FROM tb_monster_team_power;", new Object[0]);
         this.dbPool.delBySql("DELETE  FROM tb_cross_monster_team;", new Object[0]);
         this.dbPool.delBySql("DELETE  FROM tb_cross_monster_team_power;", new Object[0]);
      } catch (Throwable t) {
         t.printStackTrace();
      }

   }

   public Map<Integer, MonsterTeamPowerDao> getMonsterTeamPowerMap() {
      return this.gameCachePool.getAllTableByMap("tb_monster_team_power");
   }

   public MonsterTeamDao getMonsterTeamDao(int code) {
      return (MonsterTeamDao)this.gameCachePool.getDataNoInsert("tb_monster_team", new Object[]{code});
   }

   public RobotData getRobotData(long minPower, long maxPower, int worldLv) {
      return this.getRobotData(minPower, maxPower, worldLv, 1);
   }

   public RobotData getRobotData(long minPower, long maxPower, int worldLv, int teamNum) {
      boolean isShowLimitlv = true;
      RobotData enemyData = new RobotData();
      enemyData.player = 0;
      int minLv = worldLv - 10;
      minLv = minLv < 1 ? 1 : minLv;
      enemyData.lv = RandomUtil.randInt(minLv, worldLv);
      enemyData.sex = RandomUtil.randInt(2);
      enemyData.headFrame = 30001;
      if (enemyData.sex == 0) {
         enemyData.head = 1;
         enemyData.monarchId = 1;
      } else {
         enemyData.head = 2;
         enemyData.monarchId = 2;
      }

      Map<Integer, MonarchImageModel> monarchMap = ApplicationContextProvider.<Integer, MonarchImageModel>getModelPoolMap("MonarchImage");
      List<MonarchImageModel> tempMonarchList = new ArrayList();

      for(MonarchImageModel monarchImageModel : monarchMap.values()) {
         if (monarchImageModel.getMonsterShow() == 1) {
            tempMonarchList.add(monarchImageModel);
         }
      }

      if (!tempMonarchList.isEmpty()) {
         int r = RandomUtil.randInt(tempMonarchList.size());
         MonarchImageModel key = (MonarchImageModel)tempMonarchList.get(r);
         enemyData.monarchId = key.getSkinId();
      }

      Map<Integer, GeneralAvatarModel> headMap = ApplicationContextProvider.<Integer, GeneralAvatarModel>getModelPoolMap("GeneralAvatar");
      List<GeneralAvatarModel> tempGeneralModel = new ArrayList();

      for(GeneralAvatarModel generalAvatarModel : headMap.values()) {
         if (generalAvatarModel.getMonsterShow() == 1) {
            tempGeneralModel.add(generalAvatarModel);
         }
      }

      if (!tempGeneralModel.isEmpty()) {
         int r = RandomUtil.randInt(tempGeneralModel.size());
         GeneralAvatarModel key = (GeneralAvatarModel)tempGeneralModel.get(r);
         enemyData.head = key.getId();
      }

      enemyData.name = this.monsterManager.getMonsterName(enemyData.sex);
      enemyData.pass = false;
      boolean isFirstTeam = true;

      for(int i = 0; i < teamNum; ++i) {
         ArrayingMirror arrayingMirror = this.getArrayingMirror(minPower, maxPower);
         if (arrayingMirror == null) {
            arrayingMirror = new ArrayingMirror(1);
            arrayingMirror.power = 1000L;
         }

         if (isShowLimitlv) {
            for(Map.Entry<Byte, ArrayingEntity> entry : arrayingMirror.arrayingElementsMap.entrySet()) {
               if (((ArrayingEntity)entry.getValue()).entityType() == CommonMsg.CodeType.CODE_HERO) {
                  HeroArrayingEntity heroArrayingEntity = (HeroArrayingEntity)entry.getValue();
                  heroArrayingEntity.mirror.lv = heroArrayingEntity.mirror.limitLv;
               } else if (((ArrayingEntity)entry.getValue()).entityType() == CommonMsg.CodeType.CODE_FRIEND) {
                  FriendArrayingEntity friendArrayingEntity = (FriendArrayingEntity)entry.getValue();
                  friendArrayingEntity.mirror.lv = friendArrayingEntity.mirror.limitLv;
               }
            }
         }

         enemyData.arrayingMirrorList.add(arrayingMirror.toByteArray());
         if (isFirstTeam) {
            isFirstTeam = false;
            enemyData.power = (int)arrayingMirror.power;
         }
      }

      return enemyData;
   }

   public HeroMirror getRobotHero(int minPower, int maxPower) {
      int totalMinPower = minPower * 5;
      int totalMaxPower = maxPower * 5;
      List<Integer> enableCodes = new ArrayList();
      MonsterTeamPowerDao nearDao = null;
      long middPower = (long)((totalMinPower + totalMaxPower) / 2);
      boolean isHave = false;
      int loop = 1;
      Map<Integer, MonsterTeamPowerDao> heroDaoMap = this.getMonsterTeamPowerMap();

      for(MonsterTeamPowerDao dao : heroDaoMap.values()) {
         if (dao.power >= (long)totalMinPower && dao.power <= (long)totalMaxPower) {
            enableCodes.add(dao.code);
            isHave = true;
            if (enableCodes.size() >= 5) {
               break;
            }
         }

         if (!isHave) {
            if (nearDao == null) {
               nearDao = dao;
            } else if (Math.abs(dao.power - middPower) < Math.abs(nearDao.power - middPower)) {
               nearDao = dao;
            }
         }

         ++loop;
      }

      int code = 0;
      if (!isHave) {
         logger.error("不能找到战力={}-{}的机器人,使用战力最接近的机器人={}", new Object[]{totalMinPower, totalMaxPower, nearDao.code});
         code = nearDao.code;
      } else {
         int r = RandomUtil.randInt(enableCodes.size());
         code = (Integer)enableCodes.get(r);
      }

      MonsterTeamDao monsterTeamDao = this.getMonsterTeamDao(code);
      MonsterWear monsterWear = null;

      for(MonsterWear hero : monsterTeamDao.heros) {
         if (hero.power >= (long)minPower && hero.power <= (long)maxPower) {
            monsterWear = hero;
            break;
         }
      }

      if (monsterWear == null) {
         int r = RandomUtil.randInt(monsterTeamDao.heros.size());
         monsterWear = (MonsterWear)monsterTeamDao.heros.get(r);
      }

      if (monsterWear == null) {
         logger.error("获取机器人出错");
         return null;
      } else {
         Monster monster = new Monster(monsterWear);
         return HeroMirror.fromMonster(monster);
      }
   }

   public ArrayingMirror getArrayingMirror(long minPower, long maxPower) {
      if (maxPower < 100000L) {
         maxPower = 100000L;
      }

      List<Integer> enableCodes = new ArrayList();
      MonsterTeamPowerDao nearDao = null;
      long middPower = (minPower + maxPower) / 2L;
      boolean isHave = false;
      Map<Integer, MonsterTeamPowerDao> robotPowerMap = this.getMonsterTeamPowerMap();

      for(Map.Entry<Integer, MonsterTeamPowerDao> entry : robotPowerMap.entrySet()) {
         if (((MonsterTeamPowerDao)entry.getValue()).power >= minPower && ((MonsterTeamPowerDao)entry.getValue()).power <= maxPower) {
            enableCodes.add(entry.getKey());
            isHave = true;
         } else if (!isHave) {
            if (nearDao == null) {
               nearDao = (MonsterTeamPowerDao)entry.getValue();
            } else if (Math.abs(((MonsterTeamPowerDao)entry.getValue()).power - middPower) < Math.abs(nearDao.power - middPower)) {
               nearDao = (MonsterTeamPowerDao)entry.getValue();
            }
         }
      }

      if (!isHave) {
         logger.error("不能找到战力={}-{}的机器人,使用战力最接近的机器人={}", new Object[]{minPower, maxPower, nearDao.power});
         MonsterTeamDao monsterDao = this.getMonsterTeamDao(nearDao.code);
         return this.monsterManager.initArrayingMirror(monsterDao.heros);
      } else {
         Collections.shuffle(enableCodes);
         MonsterTeamDao monsterDao = this.getMonsterTeamDao((Integer)enableCodes.get(0));
         if (monsterDao == null) {
            logger.error("机器人不存在，code={}", enableCodes.get(0));
            return null;
         } else {
            return this.monsterManager.initArrayingMirror(monsterDao.heros);
         }
      }
   }

   @TaskMethod
   public void gmReset() {
      this.delMonsterTable();
      Map<Integer, MonsterTeamPowerDao> map = this.getMonsterTeamPowerMap();
      map.clear();
      Map<Long, MonsterData> robotPowerMap = this.monsterManager.initBaseRobot();
      if (robotPowerMap == null || robotPowerMap.isEmpty()) {
         logger.error("游戏服机器人初始化失败！");
      }

      int code = 0;

      for(Map.Entry<Long, MonsterData> entry : robotPowerMap.entrySet()) {
         ++code;
         MonsterTeamPowerDao monsterPowerDao = new MonsterTeamPowerDao();
         monsterPowerDao.code = code;
         monsterPowerDao.power = (Long)entry.getKey();
         this.gameCachePool.insertDao(monsterPowerDao, true);
         MonsterTeamDao monsterDao = new MonsterTeamDao();
         monsterDao.code = code;
         monsterDao.power = (Long)entry.getKey();
         monsterDao.heros = ((MonsterData)entry.getValue()).heros;
         this.gameCachePool.insertDao(monsterDao, true);
         CrossMonsterTeamPowerDao crossMonsterTeamPowerDao = new CrossMonsterTeamPowerDao();
         crossMonsterTeamPowerDao.code = code;
         crossMonsterTeamPowerDao.power = (Long)entry.getKey();
         this.gameCachePool.insertDao(crossMonsterTeamPowerDao, true);
         CrossMonsterTeamDao crossMonsterTeamDao = new CrossMonsterTeamDao();
         crossMonsterTeamDao.code = code;
         crossMonsterTeamDao.power = (Long)entry.getKey();
         crossMonsterTeamDao.heros = ((MonsterData)entry.getValue()).heros;
         this.gameCachePool.insertDao(crossMonsterTeamDao, true);
      }

      logger.info("插入数据库完成！");
   }
}
