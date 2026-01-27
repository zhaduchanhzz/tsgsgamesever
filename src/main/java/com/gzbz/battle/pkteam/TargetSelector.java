package com.gzbz.battle.pkteam;

import com.google.common.base.Splitter;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.model.HeroModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import misc.MapUtil;
import org.apache.commons.collections4.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TargetSelector implements Serializable {
   static Logger logger = LoggerFactory.getLogger(TargetSelector.class);
   private BattlePKTeam team;
   private BattleScene scene;

   public TargetSelector(BattlePKTeam team, BattleScene scene) {
      this.team = team;
      this.scene = scene;
   }

   public List<Entity> getTargets(Action action, Entity sourceEntity, short type, int num, String param) {
      List<Entity> list = new ArrayList();
      switch (type) {
         case 1:
            this.selectSingle(list);
            break;
         case 2:
            this.selectFrontSingle(list);
            break;
         case 3:
            this.selectBackSingle(list);
            break;
         case 4:
            this.selectAll(list);
            break;
         case 5:
            this.selectRand(list, num);
            break;
         case 6:
            this.selectFront(list);
            break;
         case 7:
            this.selectBack(list);
         case 8:
         case 14:
         case 15:
         case 16:
         case 17:
         case 33:
         case 34:
         case 35:
         case 36:
         case 43:
         case 52:
         case 53:
         case 54:
         default:
            break;
         case 9:
            this.sortProperty(sourceEntity, list, num, new PropertyComparator(Integer.parseInt(param), false), false);
            break;
         case 10:
            this.sortProperty(sourceEntity, list, num, new PropertyComparator(Integer.parseInt(param), true), false);
            break;
         case 11:
            list.add(sourceEntity);
            break;
         case 12:
            this.sortProperty(sourceEntity, list, num, new PropertyComparator(Integer.parseInt(param), false), true);
            break;
         case 13:
            this.sortProperty(sourceEntity, list, num, new PropertyComparator(Integer.parseInt(param), true), true);
            break;
         case 18:
            this.selectDead(list, num);
            break;
         case 19:
            this.selectFrontFirst(list, num);
            break;
         case 20:
            this.selectBackFirst(list, num);
            break;
         case 21:
            this.selectBuffType(list, num, param);
            break;
         case 22:
            this.selectHeroJobOrPower(list, num, param);
            break;
         case 23:
            this.selectFrontRand(list, num);
            break;
         case 24:
            this.selectBackRand(list, num);
            break;
         case 25:
            this.selectEX_Self_All(sourceEntity, list, num);
            break;
         case 26:
            this.selectHeroJob(list, num, param);
            break;
         case 27:
            this.selectExincludeMain(action, list, num);
            break;
         case 28:
            Entity blackBroad = (Entity)action.getBlackboard().getSkillParam(1, (Object)null);
            if (blackBroad != null && blackBroad.isAlive()) {
               list.add(blackBroad);
            }
            break;
         case 29:
            this.selectRepeated(list, num, param);
            break;
         case 30:
            this.selectLifeMaxRow(list);
            break;
         case 31:
            List<Entity> lastEntity = (List)action.getBlackboard().getSkillParam(22, (Object)null);
            ArrayList<Entity> tmpList = new ArrayList();

            for(Entity value : this.team.entityMap.values()) {
               if (isSelect(value) && (lastEntity == null || lastEntity != null && !lastEntity.contains(value))) {
                  tmpList.add(value);
               }
            }

            Collections.shuffle(tmpList);
            if (num >= tmpList.size()) {
               list.addAll(tmpList);
            } else if (tmpList.size() > 0) {
               list.addAll(tmpList.subList(0, num));
            }
            break;
         case 32:
            this.selectNoBuffType(list, num, param);
            break;
         case 37:
            this.selectNation(list, num, param);
            break;
         case 38:
            this.selectDebuff(list, num, param);
            break;
         case 39:
            this.selectBuffOrHp(list, num, param);
            break;
         case 40:
            this.selectRandNum(list, num, param);
            break;
         case 41:
            this.selectFrontLower(list, num, param);
            break;
         case 42:
            this.selectBackLower(list, num, param);
            break;
         case 44:
            this.selectMainPosFront(action, list, num);
            break;
         case 45:
            this.selectLastRand(action, list, num, param);
            if (list.size() == 0) {
               this.selectRandNum(list, num, param);
            }
            break;
         case 46:
            this.selectHeroJobEx(list, num, param);
            break;
         case 47:
            this.selectMainLine(action, list, num);
            break;
         case 48:
            this.selectMoreBuff(action, list, num, param);
            break;
         case 49:
            this.selectSelfRow(action, list, num, param);
            break;
         case 50:
            this.selectMainRandom(action, list, num, param);
            break;
         case 51:
            this.selectHpValueLower(action, list, num, param);
            break;
         case 55:
            this.selectRandExProperty(list, num, new PropertyComparator(Integer.parseInt(param), false));
            break;
         case 56:
            this.selectRandExProperty(list, num, new PropertyComparator(Integer.parseInt(param), true));
            break;
         case 57:
            this.sortPropertyExFirst(sourceEntity, list, num, new PropertyComparator(Integer.parseInt(param), false), true);
            break;
         case 58:
            this.selectRandExHurtTimes(action, list, num, param);
            break;
         case 59:
            this.selectPassiveUseSkill(action, list);
            break;
         case 60:
            this.sortPropertyFinalMe(sourceEntity, list, num, new PropertyComparator(Integer.parseInt(param), false), true);
            break;
         case 61:
            this.selectNations(list, num, param);
            break;
         case 62:
            this.selectHeroId(list, num, param);
            break;
         case 63:
            this.sortPropertyExMain(action, list, num, new PropertyComparator(Integer.parseInt(param), false));
            break;
         case 64:
            this.selectPropertyLowerRandom(action, list, num, param);
            break;
         case 65:
            this.selectRandNumExMain(action, list, num);
            break;
         case 66:
            this.selectSelfBuffId(sourceEntity, list, num, param);
            break;
         case 67:
            this.selectFrontHigher(list, num, param);
            break;
         case 68:
            this.selectBuffId(sourceEntity, list, num, param);
            break;
         case 69:
            String[] str = param.split("\\|");
            if (str.length >= 2) {
               this.sortPropertyNoBuffId(sourceEntity, list, num, Integer.parseInt(str[1]), new PropertyComparator(Integer.parseInt(str[0]), false), true);
            }
            break;
         case 70:
            this.selectMainAndLine(action, list, num);
            break;
         case 71:
            this.selectSex(list, num, param);
      }

      return list;
   }

   private void selectLifeMaxRow(List<Entity> list) {
      int lifeNum1 = 0;
      int lifeNum2 = 0;

      for(byte pos : BattleMisc.getLine((byte)0)) {
         Entity entity = this.team.getEntity(pos);
         if (entity != null && !entity.isDead()) {
            ++lifeNum1;
         }
      }

      for(byte pos : BattleMisc.getLine((byte)1)) {
         Entity entity = this.team.getEntity(pos);
         if (entity != null && !entity.isDead()) {
            ++lifeNum2;
         }
      }

      byte row = (byte)(lifeNum1 >= lifeNum2 ? 0 : 1);

      for(byte pos : BattleMisc.getLine(row)) {
         Entity entity = this.team.getEntity(pos);
         if (entity != null && !entity.isDead()) {
            list.add(entity);
         }
      }

   }

   private void selectRepeated(List<Entity> list, int num, String param) {
      ArrayList<Entity> entities = new ArrayList();
      int maxNum = Integer.parseInt(param);

      for(Entity entity : this.team.getEntityMap().values()) {
         if (!entity.isDead()) {
            for(int i = 0; i < maxNum; ++i) {
               entities.add(entity);
            }
         }
      }

      if (entities.size() <= num) {
         list.addAll(entities);
      } else {
         Collections.shuffle(entities);
         list.addAll(entities.subList(0, num));
      }

   }

   public static boolean isSelect(Entity entity) {
      if (entity == null) {
         return false;
      } else if (entity.isDead()) {
         return false;
      } else {
         return entity.getBattlePos() < BattleMisc.FORCE_BATTLE_POS_MAX && entity.getBattlePos() >= 0;
      }
   }

   public void trivalEntity(List<Entity> list, byte state, byte end, int num) {
      for(byte i = state; i <= end; ++i) {
         Entity entity = this.team.getEntity(i);
         if (isSelect(entity)) {
            list.add(entity);
            if (list.size() >= num) {
               break;
            }
         }
      }

   }

   public void selectSingle(List<Entity> list) {
      this.trivalEntity(list, (byte)0, (byte)4, 1);
   }

   public void selectFrontSingle(List<Entity> list) {
      this.trivalEntity(list, (byte)0, (byte)1, 1);
      if (list.size() == 0) {
         this.trivalEntity(list, (byte)2, (byte)4, 1);
      }

   }

   public void selectBackSingle(List<Entity> list) {
      this.trivalEntity(list, (byte)2, (byte)4, 1);
      if (list.size() == 0) {
         this.trivalEntity(list, (byte)0, (byte)1, 1);
      }

   }

   public void selectAll(List<Entity> list) {
      this.trivalEntity(list, (byte)0, (byte)4, 5);
   }

   public void selectRand(List<Entity> list, int randNum) {
      HashMap<Byte, Entity> entityHashMap = this.team.getEntityMap();
      ArrayList<Entity> allList = new ArrayList();

      for(Entity v : entityHashMap.values()) {
         if (isSelect(v)) {
            allList.add(v);
         }
      }

      if (allList.size() <= randNum) {
         list.addAll(allList);
      } else {
         Collections.shuffle(allList);
         list.addAll(allList.subList(0, randNum));
      }
   }

   public void selectFront(List<Entity> list) {
      this.trivalEntity(list, (byte)0, (byte)1, 2);
      if (list.size() == 0) {
         this.trivalEntity(list, (byte)2, (byte)4, 3);
      }

   }

   public void selectBack(List<Entity> list) {
      this.trivalEntity(list, (byte)2, (byte)4, 3);
      if (list.size() == 0) {
         this.trivalEntity(list, (byte)0, (byte)1, 2);
      }

   }

   private void sortProperty(Entity sourceEntity, List<Entity> list, int num, Comparator<Entity> comparator, boolean exMe) {
      if (this.team.getEntityMap().size() != 0) {
         ArrayList<Entity> sortList = new ArrayList();

         for(Entity entity : this.team.getEntityMap().values()) {
            if ((!exMe || sourceEntity == null || entity != sourceEntity) && isSelect(entity)) {
               sortList.add(entity);
            }
         }

         Collections.sort(sortList, comparator);
         if (num > sortList.size()) {
            list.addAll(sortList);
         } else {
            List tmpList = Arrays.asList(sortList.toArray()).subList(0, num);
            list.addAll(tmpList);
         }
      }
   }

   private void sortPropertyExFirst(Entity sourceEntity, List<Entity> list, int num, Comparator<Entity> comparator, boolean exMe) {
      if (this.team.getEntityMap().size() != 0) {
         ArrayList<Entity> sortList = new ArrayList();

         for(Entity entity : this.team.getEntityMap().values()) {
            if ((!exMe || sourceEntity == null || entity != sourceEntity) && isSelect(entity)) {
               sortList.add(entity);
            }
         }

         Collections.sort(sortList, comparator);
         if (sortList.size() >= 1) {
            sortList.remove(0);
         }

         if (num > sortList.size()) {
            list.addAll(sortList);
         } else {
            list.addAll(sortList.subList(0, num));
         }
      }
   }

   private void selectDead(List<Entity> list, int num) {
      LinkedList<Entity> linkedList = new LinkedList();

      for(Entity entity : this.team.getEntityMap().values()) {
         if ((entity.isDead() || entity.getStateManager().checkState((short)21)) && !entity.getStateManager().checkState((short)9)) {
            linkedList.add(entity);
         }
      }

      if (num > linkedList.size()) {
         list.addAll(linkedList);
      } else {
         Collections.shuffle(linkedList);
         list.addAll(linkedList.subList(0, num));
      }
   }

   private void selectFrontFirst(List<Entity> list, int num) {
      for(byte line = 0; line < 2; ++line) {
         List<Byte> rand = BattleMisc.getLine(line);
         Collections.shuffle(rand);

         for(byte pos : rand) {
            Entity entity = this.team.getEntity(pos);
            if (isSelect(entity)) {
               list.add(entity);
               if (list.size() >= num) {
                  return;
               }
            }
         }
      }

   }

   private void selectBackFirst(List<Entity> list, int num) {
      for(byte line = 1; line >= 0; --line) {
         List<Byte> rand = BattleMisc.getLine(line);
         Collections.shuffle(rand);

         for(byte pos : rand) {
            Entity entity = this.team.getEntity(pos);
            if (isSelect(entity)) {
               list.add(entity);
               if (list.size() >= num) {
                  return;
               }
            }
         }
      }

   }

   private void selectBuffType(List<Entity> list, int num, String param) {
      ArrayList<Entity> tmpList = new ArrayList();
      String[] str = param.split("\\|");
      HashSet<Short> buffSet = new HashSet();

      for(String strType : str) {
         buffSet.add(Short.parseShort(strType));
      }

      for(Entity entity : this.team.getEntityMap().values()) {
         for(short type : buffSet) {
            if (entity.isAlive() && entity.getBuffManager().isExistSubType(type)) {
               tmpList.add(entity);
            }
         }
      }

      if (num > tmpList.size()) {
         for(Entity entity : this.team.getEntityMap().values()) {
            if (entity.isAlive() && !tmpList.contains(entity)) {
               tmpList.add(entity);
            }

            if (tmpList.size() >= num) {
               break;
            }
         }

         list.addAll(tmpList);
      } else if (tmpList.size() > num) {
         Collections.shuffle(tmpList);
         list.addAll(tmpList.subList(0, num));
      } else {
         list.addAll(tmpList);
      }

   }

   private void selectNoBuffType(List<Entity> list, int num, String param) {
      String[] str = param.split("\\|");
      HashSet<Short> buffSet = new HashSet();

      for(String strType : str) {
         buffSet.add(Short.parseShort(strType));
      }

      ArrayList<Entity> tmpList = new ArrayList();

      for(Entity entity : this.team.getEntityMap().values()) {
         if (!entity.isDead()) {
            boolean isExist = false;

            for(short type : buffSet) {
               if (entity.getBuffManager().isExistSubType(type)) {
                  isExist = true;
                  break;
               }
            }

            if (!isExist) {
               tmpList.add(entity);
            }
         }
      }

      if (tmpList.size() <= num) {
         list.addAll(tmpList);
      } else {
         Collections.shuffle(tmpList);
         list.addAll(tmpList.subList(0, num));
      }

   }

   private void selectNation(List<Entity> list, int num, String param) {
      ArrayList<Entity> tmpList = new ArrayList();
      int nation = Integer.parseInt(param);

      for(Entity entity : this.team.getEntityMap().values()) {
         if (!entity.isDead()) {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
            int realNation = heroModel.getNation();
            if (heroModel.getNation() == 10) {
               realNation = entity.inheritNation;
            }

            if (heroModel != null && realNation == nation) {
               tmpList.add(entity);
            }
         }
      }

      if (tmpList.size() <= num) {
         list.addAll(tmpList);
      } else {
         Collections.shuffle(tmpList);
         list.addAll(tmpList.subList(0, num));
      }

   }

   public void selectDebuff(List<Entity> list, int num, String param) {
      ArrayList<Entity> tmpList = new ArrayList();

      for(Entity entity : this.team.getEntityMap().values()) {
         Map<Integer, TreeMap<Integer, Buff>> dispelEx = entity.getBuffManager().getDispelEx((byte)2);
         if (!MapUtils.isEmpty(dispelEx)) {
            tmpList.add(entity);
         }
      }

      if (tmpList.size() <= num) {
         list.addAll(tmpList);
      } else {
         Collections.shuffle(tmpList);
         list.addAll(tmpList.subList(0, num));
      }

   }

   private void selectBuffOrHp(List<Entity> list, int num, String param) {
      short type = Short.parseShort(param);
      ArrayList<Entity> tmpList = new ArrayList();
      Entity lower = null;

      for(Entity entity : this.team.getEntityMap().values()) {
         Set<Integer> subSet = entity.getBuffManager().getSubBuff(type);
         if (subSet != null && subSet.size() != 0) {
            if (lower == null || lower.getBaseProperty(99) > entity.getBaseProperty(99)) {
               lower = entity;
            }

            tmpList.add(entity);
         }
      }

      if (tmpList.size() == 0) {
         tmpList.add(lower);
      } else {
         list.addAll(tmpList.subList(0, num));
      }

   }

   private void selectHeroJobOrPower(List<Entity> list, int num, String param) {
      LinkedList<Entity> linkedList = new LinkedList();
      String[] str = param.split("\\|");
      HashSet<Integer> jobSet = new HashSet();

      for(String strJob : str) {
         jobSet.add(Integer.parseInt(strJob));
      }

      for(Entity entity : this.team.getEntityMap().values()) {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
         if (jobSet.contains(heroModel.getType())) {
            linkedList.add(entity);
         }
      }

      if (linkedList.size() == 0) {
         this.sortProperty((Entity)null, list, num, new PropertyComparator(2, true), false);
      } else if (linkedList.size() > num) {
         list.addAll(linkedList.subList(0, num));
      } else {
         list.addAll(linkedList);
      }

   }

   private void selectFrontRand(List<Entity> list, int num) {
      this.selectFront(list);
      if (list.size() == 0) {
         this.selectBack(list);
      }

      if (list.size() > num) {
         ArrayList<Entity> tmp = new ArrayList(list);
         list.clear();
         Collections.shuffle(tmp);
         list.addAll(tmp.subList(0, num));
      }

   }

   private void selectBackRand(List<Entity> list, int num) {
      this.selectBack(list);
      if (list.size() == 0) {
         this.selectFront(list);
      }

      if (list.size() > num) {
         ArrayList<Entity> tmp = new ArrayList(list);
         list.clear();
         Collections.shuffle(tmp);
         list.addAll(tmp.subList(0, num));
      }

   }

   private void selectEX_Self_All(Entity sourceEntity, List<Entity> list, int num) {
      this.selectAll(list);
      list.remove(sourceEntity);
      if (list.size() >= num) {
         ArrayList<Entity> entities = new ArrayList(list);
         Collections.shuffle(entities);
         list.clear();
         list.addAll(entities.subList(0, num));
      }
   }

   private void selectHeroJob(List<Entity> list, int num, String param) {
      String[] str = param.split("\\|");
      HashSet<Integer> jobSet = new HashSet();
      ArrayList tmpList = new ArrayList();

      for(String strJob : str) {
         jobSet.add(Integer.parseInt(strJob));
      }

      for(Entity entity : this.team.getEntityMap().values()) {
         if (!entity.isDead()) {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
            if (jobSet.contains(heroModel.getType())) {
               tmpList.add(entity);
            }
         }
      }

      if (tmpList.size() < num) {
         for(byte i = 0; i <= 4; ++i) {
            Entity entity = this.team.getEntity(i);
            if (isSelect(entity) && !tmpList.contains(entity)) {
               tmpList.add(entity);
               if (tmpList.size() >= num) {
                  break;
               }
            }
         }

         list.addAll(tmpList);
      } else if (tmpList.size() > num) {
         Collections.sort(tmpList, new BattlePosComparator());
         list.addAll(tmpList.subList(0, num));
      } else {
         list.addAll(tmpList);
      }

   }

   private void selectHeroJobEx(List<Entity> list, int num, String param) {
      String[] str = param.split("\\|");
      HashSet<Integer> jobSet = new HashSet();
      ArrayList tmpList = new ArrayList();

      for(String strJob : str) {
         jobSet.add(Integer.parseInt(strJob));
      }

      for(Entity entity : this.team.getEntityMap().values()) {
         if (!entity.isDead()) {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
            if (jobSet.contains(heroModel.getType())) {
               tmpList.add(entity);
            }
         }
      }

      if (tmpList.size() > num) {
         Collections.sort(tmpList, new BattlePosComparator());
         list.addAll(tmpList.subList(0, num));
      } else {
         list.addAll(tmpList);
      }

   }

   private void selectExincludeMain(Action action, List<Entity> list, int num) {
      List<Entity> mainList = (List)action.getBlackboard().getSkillParam(10, (Object)null);
      HashSet<Entity> entitySet = new HashSet();
      if (mainList != null) {
         entitySet.addAll(mainList);
      }

      for(Entity entity : this.team.getEntityMap().values()) {
         if (!entitySet.contains(entity) && isSelect(entity)) {
            list.add(entity);
         }

         if (list.size() >= num) {
            break;
         }
      }

   }

   private void selectRandNum(List<Entity> list, int num, String param) {
      if (num != 0) {
         int randNum = (int)(Math.random() * (double)num);
         this.selectRand(list, Math.max(1, randNum));
      }
   }

   private void selectFrontLower(List<Entity> list, int num, String param) {
      ArrayList<Entity> tmpList = new ArrayList();
      this.selectFront(tmpList);
      if (tmpList.size() > 0) {
         Collections.sort(tmpList, new PropertyComparator(Integer.parseInt(param), true));
         list.addAll(tmpList.subList(0, num));
      }

   }

   private void selectBackLower(List<Entity> list, int num, String param) {
      ArrayList<Entity> tmpList = new ArrayList();
      this.selectBack(tmpList);
      if (tmpList.size() > 0) {
         Collections.sort(tmpList, new PropertyComparator(Integer.parseInt(param), true));
         list.addAll(tmpList.subList(0, num));
      }

   }

   private void selectMainPosFront(Action action, List<Entity> list, int num) {
      List<Entity> lastSlotTargets = (List)action.getBlackboard().getSkillParam(10);
      if (lastSlotTargets != null && lastSlotTargets.size() != 0) {
         TreeMap<Byte, Entity> orderPosMap = new TreeMap();

         for(Entity entity : lastSlotTargets) {
            if (entity.getForce() == this.team.getForce()) {
               orderPosMap.put(entity.getTeamPos(), entity);
            }
         }

         if (orderPosMap.isEmpty()) {
            Set<Entity> set = (Set)action.getBlackboard().getSkillParam(23);
            if (set != null && set.size() != 0) {
               ArrayList<Entity> targetList = new ArrayList(set);
               Collections.sort(targetList, new Comparator<Entity>() {
                  public int compare(Entity o1, Entity o2) {
                     return o1.getTeamPos() - o2.getTeamPos();
                  }
               });
               if (targetList.size() <= num) {
                  list.addAll(targetList);
               } else {
                  list.addAll(targetList.subList(0, num));
               }

            }
         } else {
            for(int i = 0; i < num; ++i) {
               Map.Entry<Byte, Entity> entry = orderPosMap.pollFirstEntry();
               if (entry == null) {
                  break;
               }

               list.add(entry.getValue());
            }

         }
      }
   }

   private void selectLastRand(Action action, List<Entity> list, int num, String param) {
      Entity lastTarget = (Entity)action.getBlackboard().getSkillParam(30);
      if (lastTarget != null) {
         int randNum = Integer.parseInt(param);
         if (Math.random() * (double)10000.0F < (double)randNum) {
            list.add(lastTarget);
         }
      }

   }

   private void selectMainLine(Action action, List<Entity> list, int num) {
      List<Entity> lastSlotTargets = (List)action.getBlackboard().getSkillParam(10);
      if (lastSlotTargets != null && lastSlotTargets.size() != 0) {
         Entity mainTarget = (Entity)lastSlotTargets.get(0);
         Byte[] linePos = null;
         if (mainTarget.getTeamPos() < 2) {
            linePos = BattleMisc.BATTLE_LINE[0];
         } else {
            linePos = BattleMisc.BATTLE_LINE[1];
         }

         Byte[] var7 = linePos;
         int var8 = linePos.length;

         for(int var9 = 0; var9 < var8; ++var9) {
            byte teamPos = var7[var9];
            Entity tempEntity = (Entity)this.team.getEntityMap().get(teamPos);
            if (tempEntity != null && !lastSlotTargets.contains(tempEntity) && isSelect(tempEntity)) {
               list.add(tempEntity);
            }
         }

      }
   }

   private void selectMoreBuff(Action action, List<Entity> list, int num, String param) {
      List<Entity> tmpList = new ArrayList();

      for(byte i = 0; i <= 4; ++i) {
         Entity entity = this.team.getEntity(i);
         if (isSelect(entity)) {
            tmpList.add(entity);
         }
      }

      byte buffType = Byte.parseByte(param);
      tmpList.sort(new BuffNumComparator(buffType));
      if (tmpList.size() > num) {
         list.addAll(tmpList.subList(0, num));
      } else {
         list.addAll(tmpList);
      }

   }

   private void selectSelfRow(Action action, List<Entity> list, int num, String param) {
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1, (Object)null);
      HashMap<Byte, HashSet<Byte>> rowMap = (HashMap)BattleMisc.ROW_SET.get(this.team.getForce());
      if (!MapUtil.isEmpty(rowMap)) {
         byte isSelf = Byte.parseByte(param);
         ArrayList<Entity> tmpList = new ArrayList();

         for(HashSet<Byte> row : rowMap.values()) {
            if (row.contains(attacker.getBattlePos())) {
               for(byte battlePos : row) {
                  Entity target = (Entity)this.team.getScene().getPosEntity().get(battlePos);
                  if ((isSelf != 1 || target != attacker) && isSelect(target)) {
                     tmpList.add(target);
                  }
               }
            }
         }

         if (tmpList.size() > num) {
            Collections.shuffle(tmpList);
            list.addAll(tmpList.subList(0, num));
         } else {
            list.addAll(tmpList);
         }

      }
   }

   public void selectMainRandom(Action action, List<Entity> list, int num, String param) {
      List<Entity> mainTargets = (List)action.getBlackboard().getSkillParam(10);
      if (mainTargets != null && mainTargets.size() != 0) {
         if (mainTargets.size() < num) {
            list.addAll(mainTargets);
         } else {
            Collections.shuffle(mainTargets);
            list.addAll(mainTargets.subList(0, num));
         }

      }
   }

   public void selectHpValueLower(Action action, List<Entity> list, int num, String param) {
      ArrayList<Entity> tmpList = new ArrayList();
      this.sortProperty((Entity)null, tmpList, num, new PropertyComparator(99, true, false), false);
      if (list.size() < num) {
         list.addAll(tmpList);
      } else {
         list.addAll(tmpList.subList(0, num));
      }

   }

   public void selectRandExProperty(List<Entity> list, int num, Comparator<Entity> comparator) {
      if (this.team.getEntityMap().size() != 0) {
         ArrayList<Entity> sortList = new ArrayList();

         for(Entity entity : this.team.getEntityMap().values()) {
            if (isSelect(entity)) {
               sortList.add(entity);
            }
         }

         if (!sortList.isEmpty() && sortList.size() != 1) {
            Collections.sort(sortList, comparator);
            List<Entity> subList = sortList.subList(1, sortList.size());
            if (subList.size() <= num) {
               list.addAll(subList);
            } else {
               Collections.shuffle(subList);
               list.addAll(subList.subList(0, num));
            }
         } else {
            list.addAll(sortList);
         }
      }
   }

   public void selectRandExHurtTimes(Action action, List<Entity> list, int randNum, String param) {
      int times = Integer.parseInt(param);
      ArrayList<Entity> exHurtTargetList = new ArrayList();
      Set<Entity> set = (Set)action.getBlackboard().getSkillParam(23);
      if (Objects.nonNull(set)) {
         for(Entity e : set) {
            if (e.getHurtTimes() >= times) {
               exHurtTargetList.add(e);
            }
         }
      }

      HashMap<Byte, Entity> entityHashMap = this.team.getEntityMap();
      ArrayList<Entity> allList = new ArrayList();

      for(Entity v : entityHashMap.values()) {
         if (isSelect(v) && !exHurtTargetList.contains(v)) {
            allList.add(v);
         }
      }

      if (allList.size() <= randNum) {
         list.addAll(allList);
      } else {
         Collections.shuffle(allList);
         list.addAll(allList.subList(0, randNum));
      }
   }

   public void selectPassiveUseSkill(Action action, List<Entity> list) {
      Entity target = (Entity)action.getBlackboard().getSkillParam(43);
      if (target != null) {
         list.add(target);
      }

   }

   private void sortPropertyFinalMe(Entity sourceEntity, List<Entity> list, int num, Comparator<Entity> comparator, boolean exMe) {
      if (this.team.getEntityMap().size() != 0) {
         ArrayList<Entity> sortList = new ArrayList();

         for(Entity entity : this.team.getEntityMap().values()) {
            if ((!exMe || sourceEntity == null || entity != sourceEntity) && isSelect(entity)) {
               sortList.add(entity);
            }
         }

         Collections.sort(sortList, comparator);
         if (sortList.size() == 0 && exMe && isSelect(sourceEntity)) {
            sortList.add(sourceEntity);
         }

         if (num > sortList.size()) {
            list.addAll(sortList);
         } else {
            List tmpList = Arrays.asList(sortList.toArray()).subList(0, num);
            list.addAll(tmpList);
         }
      }
   }

   private void selectNations(List<Entity> list, int num, String param) {
      ArrayList<Entity> tmpList = new ArrayList();
      List<String> params = Splitter.on("|").trimResults().splitToList(param);
      List<Integer> nations = new ArrayList();

      for(String p : params) {
         nations.add(Integer.parseInt(p));
      }

      for(Entity entity : this.team.getEntityMap().values()) {
         if (!entity.isDead()) {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
            int realNation = heroModel.getNation();
            if (heroModel.getNation() == 10) {
               realNation = entity.inheritNation;
            }

            if (heroModel != null && nations.contains(realNation)) {
               tmpList.add(entity);
            }
         }
      }

      if (tmpList.size() <= num) {
         list.addAll(tmpList);
      } else {
         Collections.shuffle(tmpList);
         list.addAll(tmpList.subList(0, num));
      }

   }

   private void selectHeroId(List<Entity> list, int num, String param) {
      ArrayList<Entity> tmpList = new ArrayList();
      List<String> params = Splitter.on("|").trimResults().splitToList(param);
      List<Integer> heros = new ArrayList();

      for(String p : params) {
         heros.add(Integer.parseInt(p));
      }

      for(Entity entity : this.team.getEntityMap().values()) {
         if (!entity.isDead()) {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
            if (heroModel != null && heros.contains(heroModel.getId())) {
               tmpList.add(entity);
            }
         }
      }

      if (tmpList.size() <= num) {
         list.addAll(tmpList);
      } else {
         Collections.shuffle(tmpList);
         list.addAll(tmpList.subList(0, num));
      }

   }

   private void sortPropertyExMain(Action action, List<Entity> list, int num, Comparator<Entity> comparator) {
      ArrayList<Entity> sortList = new ArrayList();
      this.selectExincludeMain(action, sortList, 5);
      Collections.sort(sortList, comparator);
      if (num > sortList.size()) {
         list.addAll(sortList);
      } else {
         list.addAll(sortList.subList(0, num));
      }
   }

   public void selectPropertyLowerRandom(Action action, List<Entity> list, int randNum, String param) {
      Set<Entity> entitySet = (Set)action.getBlackboard().getSkillParam(46);
      if (Objects.isNull(entitySet) || entitySet.size() == 0) {
         entitySet = new HashSet();
         List<Entity> entitys = new ArrayList();

         for(Entity entity : this.team.getEntityMap().values()) {
            if (!entity.isDead()) {
               entitys.add(entity);
            }
         }

         if (entitys.size() > 0) {
            int heroNum = 3;
            Collections.sort(entitys, new PropertyComparator(99, true));
            entitySet.addAll(entitys.subList(0, Math.min(entitys.size(), heroNum)));
            action.getBlackboard().addSkillParam(46, entitySet);
         }
      }

      if (entitySet.size() != 0) {
         int hurtTimes = Integer.parseInt(param);
         ArrayList<Entity> exHurtTargetList = new ArrayList();
         Set<Entity> set = (Set)action.getBlackboard().getSkillParam(23);
         if (Objects.nonNull(set)) {
            for(Entity e : set) {
               if (e.getHurtTimes() >= hurtTimes) {
                  exHurtTargetList.add(e);
               }
            }
         }

         ArrayList<Entity> allList = new ArrayList();

         for(Entity v : entitySet) {
            if (isSelect(v) && !exHurtTargetList.contains(v)) {
               allList.add(v);
            }
         }

         if (allList.size() <= randNum) {
            list.addAll(allList);
         } else {
            Collections.shuffle(allList);
            list.addAll(allList.subList(0, randNum));
         }
      }
   }

   private void selectRandNumExMain(Action action, List<Entity> list, int num) {
      if (num != 0) {
         ArrayList<Entity> allList = new ArrayList();
         List<Entity> mainList = (List)action.getBlackboard().getSkillParam(10, (Object)null);
         HashSet<Entity> entitySet = new HashSet();
         if (mainList != null) {
            entitySet.addAll(mainList);
         }

         for(Entity entity : this.team.getEntityMap().values()) {
            if (!entitySet.contains(entity) && isSelect(entity)) {
               allList.add(entity);
            }
         }

         int randNum = (int)(Math.random() * (double)num);
         randNum = Math.max(1, randNum);
         if (allList.size() <= randNum) {
            list.addAll(allList);
         } else {
            Collections.shuffle(allList);
            list.addAll(allList.subList(0, randNum));
         }
      }
   }

   private void selectSelfBuffId(Entity sourceEntity, List<Entity> list, int num, String param) {
      List<Entity> tmpList = new ArrayList();
      String[] str = param.split("\\|");
      HashSet<Integer> buffSet = new HashSet();

      for(String buffId : str) {
         buffSet.add(Integer.parseInt(buffId));
      }

      for(Entity entity : this.team.getEntityMap().values()) {
         if (entity != sourceEntity) {
            for(int buffId : buffSet) {
               if (entity.isAlive() && entity.getBuffManager().isExistId(buffId)) {
                  tmpList.add(entity);
                  break;
               }
            }
         }
      }

      if (tmpList.size() > 0 && !tmpList.contains(sourceEntity)) {
         tmpList.add(sourceEntity);
      }

      if (tmpList.size() <= num) {
         list.addAll(tmpList);
      } else {
         Collections.shuffle(tmpList);
         list.addAll(tmpList.subList(0, num));
      }
   }

   private void selectFrontHigher(List<Entity> list, int num, String param) {
      ArrayList<Entity> tmpList = new ArrayList();
      this.selectFront(tmpList);
      if (tmpList.size() > 0) {
         Collections.sort(tmpList, new PropertyComparator(Integer.parseInt(param), false));
         list.addAll(tmpList.subList(0, num));
      }

   }

   private void selectBuffId(Entity sourceEntity, List<Entity> list, int num, String param) {
      List<Entity> tmpList = new ArrayList();
      String[] str = param.split("\\|");
      HashSet<Integer> buffSet = new HashSet();

      for(String buffId : str) {
         buffSet.add(Integer.parseInt(buffId));
      }

      for(Entity entity : this.team.getEntityMap().values()) {
         if (entity != sourceEntity) {
            for(int buffId : buffSet) {
               if (entity.isAlive() && entity.getBuffManager().isExistId(buffId)) {
                  tmpList.add(entity);
                  break;
               }
            }
         }
      }

      if (tmpList.size() <= num) {
         list.addAll(tmpList);
      } else {
         Collections.shuffle(tmpList);
         list.addAll(tmpList.subList(0, num));
      }
   }

   private void sortPropertyNoBuffId(Entity sourceEntity, List<Entity> list, int num, int buffId, Comparator<Entity> comparator, boolean exMe) {
      if (this.team.getEntityMap().size() != 0) {
         ArrayList<Entity> sortList = new ArrayList();

         for(Entity entity : this.team.getEntityMap().values()) {
            if ((!exMe || sourceEntity == null || entity != sourceEntity) && isSelect(entity) && !entity.getBuffManager().isExistId(buffId)) {
               sortList.add(entity);
            }
         }

         Collections.sort(sortList, comparator);
         if (num > sortList.size()) {
            list.addAll(sortList);
         } else {
            list.addAll(sortList.subList(0, num));
         }
      }
   }

   private void selectMainAndLine(Action action, List<Entity> list, int num) {
      List<Entity> lastSlotTargets = (List)action.getBlackboard().getSkillParam(10);
      if (lastSlotTargets != null && lastSlotTargets.size() != 0) {
         Entity mainTarget = (Entity)lastSlotTargets.get(0);
         Byte[] linePos = null;
         if (mainTarget.getTeamPos() < 2) {
            linePos = BattleMisc.BATTLE_LINE[0];
         } else {
            linePos = BattleMisc.BATTLE_LINE[1];
         }

         Byte[] var7 = linePos;
         int var8 = linePos.length;

         for(int var9 = 0; var9 < var8; ++var9) {
            byte teamPos = var7[var9];
            Entity tempEntity = (Entity)this.team.getEntityMap().get(teamPos);
            if (tempEntity != null && isSelect(tempEntity)) {
               list.add(tempEntity);
            }
         }

      }
   }

   private void selectSex(List<Entity> list, int num, String param) {
      ArrayList<Entity> tmpList = new ArrayList();
      int sex = Integer.parseInt(param);

      for(Entity entity : this.team.getEntityMap().values()) {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
         if (isSelect(entity) && heroModel != null && heroModel.getSex() == sex) {
            tmpList.add(entity);
         }
      }

      if (tmpList.size() <= num) {
         list.addAll(tmpList);
      } else {
         Collections.shuffle(tmpList);
         list.addAll(tmpList.subList(0, num));
      }

   }

   public void destroy() {
      this.team = null;
      this.scene = null;
   }
}
