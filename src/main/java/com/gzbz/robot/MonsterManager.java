package com.gzbz.robot;

import com.gzbz.battle.entity.Monster;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.arraying.FriendArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.db.bean.MonsterData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.EquipItem;
import com.gzbz.gamePlayer.playerBag.ExclusiveTreasure;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.model.BattleModel;
import com.gzbz.model.ExclusiveTreasureStoneModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HeroBreachModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.HeroUpStarModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.MonsterTeamModel;
import com.gzbz.model.PlayerNameModel;
import com.gzbz.model.RobotWearModel;
import com.gzbz.model.WarriorSignetSkillLibModel;
import com.gzbz.model.WarriorSignetSkillModel;
import com.gzbz.model.fun.BattleMonsterFun;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.robot.bean.MonsterWarrior;
import com.gzbz.robot.bean.MonsterWear;
import com.gzbz.spring.ApplicationContextProvider;
import debug.Debug;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import misc.DateUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MonsterManager {
   static Logger logger = LoggerFactory.getLogger(MonsterManager.class);
   public static int[] maxLvByStar = new int[]{30, 40, 50, 60, 80, 100, 145, 165, 185, 205, 255, 285, 310, 350, 390};
   public boolean isTest = false;
   @Autowired
   GameModelPool gameModelPool;

   public Map<Long, MonsterData> initBaseRobot() {
      long startTime = System.currentTimeMillis();
      logger.info("初始化基础机器人！开始时间={}", DateUtil.transferLongToDate(startTime));
      Map<Long, MonsterData> robotPowerMap = new HashMap();

      try {
         Map<Integer, MonsterTeamModel> monsterTeamModelMap = this.gameModelPool.getMap("monsterTeam");

         for(Map.Entry<Integer, MonsterTeamModel> entry : monsterTeamModelMap.entrySet()) {
            long start = System.currentTimeMillis();

            try {
               for(int i = 1; i <= 2000; ++i) {
                  boolean isInit = false;
                  if (i < 350) {
                     isInit = true;
                  } else if (i < 500) {
                     if (i % 2 == 0) {
                        isInit = true;
                     }
                  } else if (i < 1000) {
                     if (i % 5 == 0) {
                        isInit = true;
                     }
                  } else if (i < 1500) {
                     if (i % 10 == 0) {
                        isInit = true;
                     }
                  } else if (i <= 2000 && i % 20 == 0) {
                     isInit = true;
                  }

                  if (isInit) {
                     MonsterData monsterIdsAndLv = this.initArrayingMirror((MonsterTeamModel)entry.getValue(), i);
                     robotPowerMap.put(monsterIdsAndLv.power, monsterIdsAndLv);
                  }

                  Debug.sleep(3L);
               }

               this.initArrayingMirrorFor101((MonsterTeamModel)entry.getValue(), robotPowerMap);
            } catch (Exception e) {
               logger.error(String.format("初始化机器人出错！！！:%s", entry.getKey()));
               e.printStackTrace();
            } finally {
               logger.info("加载机器人阵型:{} 耗时：{}ms", ((MonsterTeamModel)entry.getValue()).getHeros().values(), System.currentTimeMillis() - start);
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      logger.info("机器人数量={},耗时={}毫秒", robotPowerMap.size(), System.currentTimeMillis() - startTime);
      if (this.isTest) {
         this.printRobotMap(robotPowerMap);
      }

      return robotPowerMap;
   }

   public void printRobotMap(Map<Long, MonsterData> robotPowerMap) {
      logger.info("打印机器人");
      StringBuffer sb = new StringBuffer();
      new TreeSet();
      sb.append("=====机器人队伍初始化=====").append("\n").append("\n");
      sb.append("总战力排行榜:");
      sb.append("\n");
      TreeMap<Long, MonsterData> tempRobotPowerMap = new TreeMap(robotPowerMap);

      for(Long power : tempRobotPowerMap.keySet()) {
         String pow = String.valueOf(power);
         sb.append(pow);
         sb.append("\t");
         sb.append("[");

         for(MonsterWear hero : ((MonsterData)robotPowerMap.get(power)).heros) {
            sb.append("(");
            sb.append(hero.id);
            sb.append("-");
            sb.append(hero.lv);
            sb.append(")");
            sb.append("\t");
         }

         sb.append("]");
         sb.append("\n");
      }

      this.print(sb, "test/monster.txt");
      logger.info("打印完成");
   }

   public void print(StringBuffer stringBuffer, String fileName) {
      try {
         File file = new File(fileName);
         if (!file.exists()) {
            file.createNewFile();
         }

         FileWriter fileWriter = new FileWriter(fileName, false);
         BufferedWriter bw = new BufferedWriter(fileWriter);
         bw.write(stringBuffer.toString());
         bw.close();
         fileWriter.close();
         StringBuffer var7 = null;
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public void initArrayingMirrorFor101(MonsterTeamModel monsterTeamModel, Map<Long, MonsterData> robotPowerMap) {
      for(int i = 0; i < 4; ++i) {
         Map<Integer, Integer> map = new HashMap();

         for(int j = 0; j < 6; ++j) {
            if (j <= i) {
               map.put(j, 101);
            } else {
               map.put(j, 100);
            }
         }

         MonsterData monsterIdsAndLv = this.getArrayingMirrorByLvMap(monsterTeamModel, map);
         robotPowerMap.put(monsterIdsAndLv.power, monsterIdsAndLv);
      }

   }

   public MonsterData initArrayingMirror(MonsterTeamModel monsterTeamModel, int lv) {
      Map<Integer, Integer> map = new HashMap();

      for(int i = 0; i < 6; ++i) {
         map.put(i, lv);
      }

      return this.getArrayingMirrorByLvMap(monsterTeamModel, map);
   }

   public MonsterData getArrayingMirrorByLvMap(MonsterTeamModel monsterTeamModel, Map<Integer, Integer> lvMap) {
      MonsterData monsterIdsAndLv = new MonsterData();
      int totalPower = 0;

      for(Map.Entry<Integer, Integer> entry : monsterTeamModel.getHeros().entrySet()) {
         Monster monster = new Monster((Integer)entry.getValue(), (Integer)lvMap.get((Integer)entry.getKey() - 1), 0, 0, true, (BattleMonsterFun)null, (List)null);
         totalPower = (int)((long)totalPower + monster.totalCombatPower);
         MonsterWear monsterWear = new MonsterWear();
         monsterWear.pos = (byte)((Integer)entry.getKey() - 1);
         monsterWear.lv = monster.lv;
         monsterWear.id = monster.id;
         monsterWear.power = monster.totalCombatPower;

         for(Map.Entry<Integer, WarriorSignet> signetEntry : monster.warriors.entrySet()) {
            MonsterWarrior monsterWarrior = new MonsterWarrior();
            monsterWarrior.id = ((WarriorSignet)signetEntry.getValue()).id;
            monsterWarrior.score = ((WarriorSignet)signetEntry.getValue()).score;
            monsterWarrior.pro = ((WarriorSignet)signetEntry.getValue()).properties;
            monsterWarrior.skills = ((WarriorSignet)signetEntry.getValue()).skills;
            monsterWear.warriors.add(monsterWarrior);
         }

         for(Map.Entry<Integer, EquipItem> itemEntry : monster.equips.entrySet()) {
            monsterWear.equips.add(((EquipItem)itemEntry.getValue()).id);
         }

         monsterWear.warcrafts.addAll(monster.warcrafts.values());
         if (monster.exTreasure != null && monster.exTreasure.stoneMap != null && !monster.exTreasure.stoneMap.isEmpty()) {
            monsterWear.stone.addAll(monster.exTreasure.stoneMap.values());
         }

         monsterIdsAndLv.heros.add(monsterWear);
      }

      monsterIdsAndLv.power = (long)totalPower;
      return monsterIdsAndLv;
   }

   public ArrayingMirror initArrayingMirror(List<MonsterWear> heros) {
      Map<Byte, ArrayingEntity> arrayingElementsMap = new HashMap();
      int totalPower = 0;

      for(MonsterWear hero : heros) {
         Monster monster = new Monster(hero);
         if (hero.pos < 5) {
            HeroArrayingEntity heroArrayingEntity = new HeroArrayingEntity(hero.pos, HeroMirror.fromMonster(monster));
            totalPower = (int)((long)totalPower + monster.totalCombatPower);
            arrayingElementsMap.put(hero.pos, heroArrayingEntity);
         } else if (hero.pos == 5) {
            HeroMirror heroMirror = HeroMirror.fromMonster(monster);
            FriendArrayingEntity friendArrayingEntity = new FriendArrayingEntity(hero.pos, heroMirror);
            totalPower = (int)((long)totalPower + monster.totalCombatPower);
            arrayingElementsMap.put(hero.pos, friendArrayingEntity);
         }
      }

      ArrayingMirror arrayingMirror = new ArrayingMirror((long)totalPower, arrayingElementsMap);
      arrayingMirror.power = (long)totalPower;
      return arrayingMirror;
   }

   public Set<Integer> getSkillOfRemoveChild(Set<Integer> allSkills) {
      List<WarriorSignetSkillModel> resultModelList = new ArrayList();

      for(Integer skill : allSkills) {
         WarriorSignetSkillModel model = (WarriorSignetSkillModel)this.gameModelPool.getEntity("warriorSignetSkill", skill);
         if (model != null) {
            if (resultModelList.size() <= 0) {
               resultModelList.add(model);
            } else {
               boolean isSameBase = false;

               for(int i = 0; i < resultModelList.size(); ++i) {
                  if (((WarriorSignetSkillModel)resultModelList.get(i)).getBaseSkill() == model.getBaseSkill()) {
                     isSameBase = true;
                     if (model.getId() > ((WarriorSignetSkillModel)resultModelList.get(i)).getId()) {
                        resultModelList.set(i, model);
                        break;
                     }
                  }
               }

               if (!isSameBase) {
                  resultModelList.add(model);
               }
            }
         }
      }

      return resultModelList.stream().map((modelx) -> modelx.getId()).collect(Collectors.toSet());
   }

   public boolean isSameBaseSkill(int sourceSkill, int targetSkill) {
      WarriorSignetSkillModel source = (WarriorSignetSkillModel)this.gameModelPool.getEntity("warriorSignetSkill", sourceSkill);
      if (source == null) {
         return false;
      } else {
         WarriorSignetSkillModel target = (WarriorSignetSkillModel)this.gameModelPool.getEntity("warriorSignetSkill", targetSkill);
         if (target == null) {
            return false;
         } else {
            return source.getBaseSkill() == target.getBaseSkill();
         }
      }
   }

   public int getBreachLvByLv(int maxStar, int heroLv) {
      Map<Integer, HeroBreachModel> map = this.gameModelPool.getMap("heroBreach");

      for(Map.Entry<Integer, HeroBreachModel> entry : map.entrySet()) {
         HeroBreachModel model = (HeroBreachModel)entry.getValue();
         if (model.getHeroStar() >= maxStar || model.getHeroLevel() >= heroLv) {
            return model.getLevel();
         }
      }

      return ((HeroBreachModel)map.get(map.size() - 1)).getLevel();
   }

   public int getStarByLv(int heroId, int heroLv) {
      HeroModel heroModel = (HeroModel)this.gameModelPool.getEntity("hero", heroId);
      if (maxLvByStar[heroModel.getStar()] >= heroLv) {
         return heroModel.getStar();
      } else {
         int star = 0;

         for(int i = 0; i < maxLvByStar.length; ++i) {
            star = i;
            if (maxLvByStar[i] >= heroLv) {
               break;
            }
         }

         return star;
      }
   }

   public int getMaxStarOfHero(int heroId) {
      HeroModel heroModel = (HeroModel)this.gameModelPool.getEntity("hero", heroId);
      int nextId = heroModel.getUpStarId();
      int maxStar = heroModel.getStar();

      while(nextId > 0) {
         HeroUpStarModel heroUpStarModel = (HeroUpStarModel)this.gameModelPool.getEntity("heroUpStar", nextId);
         if (heroUpStarModel != null) {
            nextId = heroUpStarModel.getNext();
            maxStar = heroUpStarModel.getStarLevel();
         } else {
            nextId = 0;
         }
      }

      return maxStar;
   }

   public RobotWearModel getRobotWearModel(int heroLv) {
      Map<Integer, RobotWearModel> map = this.gameModelPool.getMap("robotwear");

      for(Map.Entry<Integer, RobotWearModel> entry : map.entrySet()) {
         if (((RobotWearModel)entry.getValue()).getHeroLv() > heroLv) {
            return (RobotWearModel)entry.getValue();
         }
      }

      return (RobotWearModel)map.get(map.size() - 1);
   }

   public Map<Integer, EquipItem> getHeroEquip(RobotWearModel robotWearModel) {
      Map<Integer, EquipItem> equips = new HashMap();
      if (robotWearModel == null) {
         return equips;
      } else {
         for(Map.Entry<Integer, Integer> entry : robotWearModel.getEquips().entrySet()) {
            EquipItem equipItem = new EquipItem();
            ItemModel itemModel = (ItemModel)this.gameModelPool.getEntity("item", entry.getValue());
            equipItem.init(0, 1, itemModel, (GamePlayer)null);
            equips.put(entry.getKey(), equipItem);
         }

         return equips;
      }
   }

   public Map<Integer, WarriorSignet> getHeroWarriors(RobotWearModel robotWearModel) {
      Map<Integer, WarriorSignet> warriors = new HashMap();
      if (robotWearModel == null) {
         return warriors;
      } else {
         for(Map.Entry<Integer, Integer> entry : robotWearModel.getWarriors().entrySet()) {
            WarriorSignet warriorSignet = new WarriorSignet();
            ItemModel model = (ItemModel)this.gameModelPool.getEntity("item", entry.getValue());
            warriorSignet.init(0, 1, model, (GamePlayer)null);
            warriors.put(entry.getKey(), warriorSignet);
         }

         return warriors;
      }
   }

   public Map<Integer, Integer> getHeroWarcrafts(RobotWearModel robotWearModel) {
      Map<Integer, Integer> warcrafts = new HashMap();
      if (robotWearModel == null) {
         return warcrafts;
      } else {
         List<Integer> baseIdList = new ArrayList();

         for(Map.Entry<Integer, Integer> entry : robotWearModel.getWarcrafts().entrySet()) {
            List<WarriorSignetSkillLibModel> lib = (List)ApplicationContextProvider.getModelPoolEntity("customWarriorSignetSkillLib", (Integer)entry.getValue());
            if (lib != null && !lib.isEmpty()) {
               WarriorSignetSkillLibModel model = null;
               WarriorSignetSkillModel skillModel = null;
               int loop = 0;

               do {
                  int r = RandomUtil.randInt(lib.size());
                  model = (WarriorSignetSkillLibModel)lib.get(r);
                  skillModel = (WarriorSignetSkillModel)ApplicationContextProvider.getModelPoolEntity("warriorSignetSkill", model.getSkillId());
                  ++loop;
               } while(loop > 100 && baseIdList.contains(skillModel.getBaseSkill()));

               if (loop > 100) {
                  logger.error("循环100次，没有找到合适的兵法,lib={}", entry.getValue());
               }

               warcrafts.put(entry.getKey(), model.getSkillId());
               baseIdList.add(skillModel.getBaseSkill());
            }
         }

         return warcrafts;
      }
   }

   public ExclusiveTreasure getHeroExclusiveTreasure(RobotWearModel robotWearModel) {
      if (robotWearModel != null && robotWearModel.getStones() != null && !robotWearModel.getStones().isEmpty()) {
         ExclusiveTreasure exclusiveTreasure = new ExclusiveTreasure();
         List<ExclusiveTreasureStoneModel> baseList = new ArrayList();

         for(Map.Entry<Integer, Integer> entry : robotWearModel.getStones().entrySet()) {
            List<ExclusiveTreasureStoneModel> list = (List)ApplicationContextProvider.getModelPoolEntity("customExclusiveTreasureStone", (Integer)entry.getValue());
            if (list != null && !list.isEmpty()) {
               int loop = 0;
               ExclusiveTreasureStoneModel model = null;

               do {
                  int r = RandomUtil.randInt(list.size());
                  model = (ExclusiveTreasureStoneModel)list.get(r);
                  ++loop;
               } while(loop <= 100 && this.isSameStone(model, baseList));

               if (loop >= 100) {
                  logger.info("机器人宝石添加，loop={}", loop);
               }

               ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", model.getId());
               if (itemModel != null) {
                  exclusiveTreasure.stoneMap.put(CommonMsg.StonePosition.forNumber((Integer)entry.getKey()), itemModel.getId());
                  baseList.add(model);
               }
            }
         }

         return exclusiveTreasure;
      } else {
         return null;
      }
   }

   public boolean isSameStone(ExclusiveTreasureStoneModel model, List<ExclusiveTreasureStoneModel> list) {
      for(ExclusiveTreasureStoneModel exclusiveTreasureStoneModel : list) {
         if (model.getProType() == exclusiveTreasureStoneModel.getProType() && model.getProWay() == exclusiveTreasureStoneModel.getProWay()) {
            return true;
         }
      }

      return false;
   }

   public HeroModel getHeroModelByStarAndNataionAndType(int star, int nation, int type) {
      List<HeroModel> enableList = new ArrayList();
      Map<Integer, HeroModel> map = this.gameModelPool.getMap("hero");

      for(Map.Entry<Integer, HeroModel> entry : map.entrySet()) {
         HeroModel model = (HeroModel)entry.getValue();
         if (model.getStar() == star && model.getNation() == nation && model.getType() == type) {
            enableList.add(model);
         }
      }

      if (!enableList.isEmpty()) {
         Collections.shuffle(enableList);
         return (HeroModel)enableList.get(0);
      } else {
         return null;
      }
   }

   public static int getLvByStar(int star) {
      return maxLvByStar[star];
   }

   public String getMonsterName(int sex) {
      StringBuilder sb = new StringBuilder();
      sb.append(PlayerNameModel.randomNameByType(1));
      if (sex == 0) {
         sb.append(PlayerNameModel.randomNameByType(3));
      } else {
         sb.append(PlayerNameModel.randomNameByType(4));
      }

      return sb.toString();
   }

   public long getTotalPowerByBattleId(int battleId) {
      long totalPower = 0L;
      BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", battleId);
      if (battleModel == null) {
         return totalPower;
      } else {
         Monster monster = null;

         for(BattleMonsterFun fun : battleModel.getMonsters()) {
            GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
            HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", fun.getId());
            if (Objects.isNull(heroModel)) {
               logger.error("生成怪物时无法找到怪物id:" + fun.getId());
            } else {
               monster = new Monster(fun.getId(), fun.getLv(), fun.getStar(), fun.getOffset(), false, (BattleMonsterFun)null, BattlePKTeam.getWarriorSignetByLv(fun.getId(), fun.getLv(), battleModel.getShield()));
               totalPower += monster.totalCombatPower;
            }
         }

         monster = null;
         return totalPower;
      }
   }

   public void printBattlePower() {
      Map<Integer, BattleModel> battleModelMap = this.gameModelPool.getMap("battle");
      TreeMap<Integer, Map<Integer, Long>> powerMap = new TreeMap();

      for(Map.Entry<Integer, BattleModel> entry : battleModelMap.entrySet()) {
         Map<Integer, Long> tempMap = new HashMap();

         for(BattleMonsterFun fun : ((BattleModel)entry.getValue()).getMonsters()) {
            if (fun.getPos() < 5) {
               Monster monster = new Monster(fun.getId(), fun.getLv(), fun.getStar(), fun.getOffset(), false, fun, BattlePKTeam.getWarriorSignetByLv(fun.getId(), fun.getLv(), ((BattleModel)entry.getValue()).getShield()));
               tempMap.put(Integer.valueOf(fun.getPos()), monster.totalCombatPower);
            } else if (fun.getPos() == 5) {
               Monster monster = new Monster(fun.getId(), fun.getLv(), fun.getStar(), fun.getOffset(), false, fun, BattlePKTeam.getWarriorSignetByLv(fun.getId(), fun.getLv(), ((BattleModel)entry.getValue()).getShield()));
               tempMap.put(Integer.valueOf(fun.getPos()), monster.totalCombatPower);
            }
         }

         powerMap.put(entry.getKey(), tempMap);
      }

      try {
         File file = new File("battlePower.txt");
         if (!file.exists()) {
            file.createNewFile();
         }

         FileWriter fileWriter = new FileWriter("battlePower.txt", false);
         BufferedWriter bw = new BufferedWriter(fileWriter);
         int loop = 0;

         for(Map.Entry<Integer, Map<Integer, Long>> entry : powerMap.entrySet()) {
            bw.write(String.format("id：%d--[", entry.getKey()));
            long totalPower = 0L;

            for(Map.Entry<Integer, Long> integerLongEntry : (entry.getValue()).entrySet()) {
               bw.write(String.format("%d:%d,", integerLongEntry.getKey(), integerLongEntry.getValue()));
               totalPower += (Long)integerLongEntry.getValue();
            }

            bw.write(String.format("],total：%d", totalPower));
            bw.newLine();
            ++loop;
         }

         logger.info("总数量={}", loop);
         bw.close();
         fileWriter.close();
      } catch (Exception e) {
         e.printStackTrace();
      }

   }
}
