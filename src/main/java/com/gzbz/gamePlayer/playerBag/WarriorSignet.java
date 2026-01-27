package com.gzbz.gamePlayer.playerBag;

import cn.hutool.core.convert.Convert;
import com.gzbz.gameDefine.WarriorSignetDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.ItemModel;
import com.gzbz.model.WarriorSigentFixModel;
import com.gzbz.model.WarriorSignetModel;
import com.gzbz.model.WarriorSignetPropertyLibModel;
import com.gzbz.model.WarriorSignetPropertyModel;
import com.gzbz.model.WarriorSignetSkillLibModel;
import com.gzbz.model.WarriorSignetSkillModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.WarriorsModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class WarriorSignet extends ItemBase {
   private static Logger logger = LoggerFactory.getLogger(WarriorSignet.class);
   public int score;
   public List<PropertyModel> properties = new ArrayList();
   public List<Integer> skills = new ArrayList();
   public List<PropertyModel> recastPros = new ArrayList();
   public List<Integer> recastSkills = new ArrayList();

   public WarriorSignet() {
   }

   public WarriorSignet(int code, WarriorSignet warriorSignet) {
      this.code = code;
      this.id = warriorSignet.id;
      this.num = 1;
      this.score = warriorSignet.score;
      this.properties = warriorSignet.properties;
      this.skills = warriorSignet.skills;
      this.recastPros = warriorSignet.recastPros;
      this.recastSkills = warriorSignet.recastSkills;
   }

   public WarriorSignet(int code, int id, int score, List<PropertyModel> properties, List<Integer> skills) {
      this.code = code;
      this.id = id;
      this.score = score;
      this.properties = properties;
      this.skills = skills;
   }

   public void init(int code, int num, ItemModel itemModel, GamePlayer gamePlayer) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      if (itemModel.getWarriorSignet() > 0) {
         WarriorSigentFixModel warriorSigentFixModel = (WarriorSigentFixModel)gameModelPool.getEntity("warriorSignetfix", itemModel.getId());
         if (warriorSigentFixModel != null && warriorSigentFixModel.getWarriors() != null && !warriorSigentFixModel.getWarriors().isEmpty()) {
            ItemModel newItemModel = (ItemModel)gameModelPool.getEntity("item", ((WarriorsModel)warriorSigentFixModel.getWarriors().get(0)).getId());
            if (newItemModel != null) {
               super.init(code, num, newItemModel, gamePlayer);
               WarriorSignet warriorSignet = ((WarriorsModel)warriorSigentFixModel.getWarriors().get(0)).toWarriorSignet();
               this.score = warriorSigentFixModel.getScore();
               this.properties.addAll(warriorSignet.properties);
               this.skills.addAll(warriorSignet.skills);
            }
         } else {
            WarriorSignetModel signetModel = (WarriorSignetModel)gameModelPool.getEntity("warriorSignet", itemModel.getId());
            if (signetModel != null) {
               super.init(code, num, itemModel, gamePlayer);
               this.initProperty(gameModelPool, signetModel, false, (Map)null, (List)null, false);
               this.initSkill(gameModelPool, signetModel, false);
            }
         }
      } else {
         super.init(code, num, itemModel, gamePlayer);
         WarriorSignetModel signetModel = (WarriorSignetModel)gameModelPool.getEntity("warriorSignet", itemModel.getId());
         this.initProperty(gameModelPool, signetModel, false, (Map)null, (List)null, false);
         this.initSkill(gameModelPool, signetModel, false);
      }

   }

   public void initByRecast(boolean isLuck, ItemModel itemModel, Map<Integer, Integer> skillLockMap, Map<Integer, PropertyModel> propertyMap, GamePlayer gamePlayer, List<PropertyModel> otherPropertyList, List<Integer> otherBaseSkillIdList) {
      super.init(0, 1, itemModel, gamePlayer);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      WarriorSignetModel signetModel = (WarriorSignetModel)gameModelPool.getEntity("warriorSignet", itemModel.getId());
      this.initProperty(gameModelPool, signetModel, false, propertyMap, otherPropertyList, true);
      if (skillLockMap != null && !skillLockMap.isEmpty()) {
         this.initSkillByLock(gameModelPool, signetModel, skillLockMap, otherBaseSkillIdList);
      } else {
         this.initSkill(gameModelPool, signetModel, isLuck);
      }

   }

   public void initByCompound(ItemModel itemModel, Map<Integer, PropertyModel> propertyLockMap, Map<Integer, Integer> skillLockMap, GamePlayer gamePlayer) {
      super.init(0, 1, itemModel, gamePlayer);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      WarriorSignetModel signetModel = (WarriorSignetModel)gameModelPool.getEntity("warriorSignet", itemModel.getId());
      this.initProperty(gameModelPool, signetModel, true, propertyLockMap, (List)null, false);
      if (skillLockMap != null && !skillLockMap.isEmpty()) {
         this.initSkillByUpdate(gameModelPool, signetModel, skillLockMap);
      } else {
         this.initSkill(gameModelPool, signetModel, false);
      }

   }

   public boolean refineWarriorSignet(int newItemId) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      boolean result = false;
      switch (newItemId) {
         case 4051:
            PropertyModel propertyModel = (PropertyModel)this.properties.get(0);
            WarriorSignetModel oldSignetModel = (WarriorSignetModel)gameModelPool.getEntity("warriorSignet", this.id);
            if (oldSignetModel == null) {
               return false;
            }

            this.id = newItemId;
            this.properties.set(0, new PropertyModel(propertyModel.getType(), propertyModel.getWay(), propertyModel.getValue() * 2L));
            List<Integer> libGroupIdList_4051 = oldSignetModel.getPropertyLib();
            WarriorSignetPropertyModel warriorSignetPropertyModel = this.findWarriorSignetPropertyModel(gameModelPool, (Integer)libGroupIdList_4051.get(0), propertyModel, false);
            this.score += warriorSignetPropertyModel.getScore1();
            result = true;
            break;
         case 4052:
            WarriorSignetModel newSignetModel = (WarriorSignetModel)gameModelPool.getEntity("warriorSignet", newItemId);
            if (newSignetModel == null) {
               return false;
            }

            List<Integer> libGroupIdList_4052 = newSignetModel.getPropertyLib();
            if (libGroupIdList_4052.size() > 2) {
               this.id = newItemId;
               int libGroupId = (Integer)libGroupIdList_4052.get(2);
               Map<Integer, WarriorSignetPropertyLibModel> map = gameModelPool.getMap("warriorSignetPropertyLib");
               List<KeyValFun> rateList = new ArrayList();

               for(WarriorSignetPropertyLibModel warriorSignetPropertyLibModel : map.values()) {
                  if (warriorSignetPropertyLibModel.getGroupId() == libGroupId) {
                     rateList.add(new KeyValFun(warriorSignetPropertyLibModel.getPropertyId(), warriorSignetPropertyLibModel.getWeight()));
                  }
               }

               WarriorSignetPropertyModel warriorSignetPropertyModel_4052 = null;

               do {
                  int newPropertyId = GamePlayer.countRate(rateList);
                  warriorSignetPropertyModel_4052 = (WarriorSignetPropertyModel)gameModelPool.getEntity("warriorSignetProperty", newPropertyId);
                  if (warriorSignetPropertyModel_4052 == null) {
                     logger.error("初始化将印属性出错，找不到对应的属性加成配置！！ libGroupId:{}  propertyId:{}", libGroupId, this.id);
                     return false;
                  }
               } while(this.sameProperty(this.properties, warriorSignetPropertyModel_4052.getPropertyId(), warriorSignetPropertyModel_4052.getPropertyWay()));

               this.properties.add(new PropertyModel(warriorSignetPropertyModel_4052.getPropertyId(), warriorSignetPropertyModel_4052.getPropertyWay(), (long)warriorSignetPropertyModel_4052.getPropertyValue()));
               this.score += warriorSignetPropertyModel_4052.getScore1();
               result = true;
            }
            break;
         case 4060:
            this.id = newItemId;

            for(int i = 0; i < this.skills.size(); ++i) {
               WarriorSignetSkillModel warriorSignetSkillModel = (WarriorSignetSkillModel)gameModelPool.getEntity("warriorSignetSkill", this.skills.get(i));
               if (warriorSignetSkillModel != null && warriorSignetSkillModel.getNextId() > 0) {
                  WarriorSignetSkillModel newWarriorSignetSkillModel = (WarriorSignetSkillModel)gameModelPool.getEntity("warriorSignetSkill", warriorSignetSkillModel.getNextId());
                  if (newWarriorSignetSkillModel != null) {
                     this.score -= warriorSignetSkillModel.getPower();
                     this.skills.set(i, newWarriorSignetSkillModel.getId());
                     this.score += newWarriorSignetSkillModel.getPower();
                     result = true;
                  }
               }
            }
      }

      return result;
   }

   private void initProperty(GameModelPool gameModelPool, WarriorSignetModel signetModel, boolean isUpgrade, Map<Integer, PropertyModel> propertyLockMap, List<PropertyModel> otherPropertyList, boolean isSameValue) {
      if (signetModel.getBaseAttr().size() > 0) {
         for(Integer proId : signetModel.getBaseAttr()) {
            WarriorSignetPropertyModel warriorSignetPropertyModel = WarriorSignetDefine.getWarriorSignetPropertyModel(proId);
            if (null != warriorSignetPropertyModel) {
               this.score += warriorSignetPropertyModel.getScore1();
            }
         }
      }

      if (signetModel.getZhuanshuAttr().size() > 0) {
         for(Integer proId : signetModel.getZhuanshuAttr()) {
            WarriorSignetPropertyModel warriorSignetPropertyModel = WarriorSignetDefine.getWarriorSignetPropertyModel(proId);
            if (null != warriorSignetPropertyModel) {
               this.score += warriorSignetPropertyModel.getScore1();
            }
         }
      }

      if (signetModel.getPropertyLib() != null) {
         List<Integer> libGroupIdList = signetModel.getPropertyLib();
         Map<Integer, PropertyModel> propertyModelMap = new HashMap();
         if (propertyLockMap != null && !propertyLockMap.isEmpty()) {
            for(Map.Entry<Integer, PropertyModel> entry : propertyLockMap.entrySet()) {
               if (libGroupIdList.size() > (Integer)entry.getKey()) {
                  WarriorSignetPropertyModel model = this.findWarriorSignetPropertyModel(gameModelPool, (Integer)libGroupIdList.get((Integer)entry.getKey()), (PropertyModel)entry.getValue(), isSameValue);
                  PropertyModel propertyModel = new PropertyModel(model.getPropertyId(), model.getPropertyWay(), (long)model.getPropertyValue());
                  propertyModelMap.put(entry.getKey(), propertyModel);
                  this.score += model.getScore1();
               }
            }
         }

         for(int i = 0; i < libGroupIdList.size(); ++i) {
            if (propertyLockMap == null || propertyLockMap.get(i) == null) {
               int libGroupId = (Integer)libGroupIdList.get(i);
               Map<Integer, WarriorSignetPropertyLibModel> map = gameModelPool.getMap("warriorSignetPropertyLib");
               List<KeyValFun> rateList = new ArrayList();

               for(WarriorSignetPropertyLibModel model : map.values()) {
                  if (model.getGroupId() == libGroupId) {
                     rateList.add(new KeyValFun(model.getPropertyId(), model.getWeight()));
                  }
               }

               WarriorSignetPropertyModel model = null;

               do {
                  int id = GamePlayer.countRate(rateList);
                  model = (WarriorSignetPropertyModel)gameModelPool.getEntity("warriorSignetProperty", id);
                  if (model == null) {
                     logger.error("初始化将印属性出错，找不到对应的属性加成配置！！ libGroupId:{}  propertyId:{}", libGroupId, id);
                     return;
                  }
               } while(this.sameProperty(propertyModelMap, model.getPropertyId(), model.getPropertyWay(), model.getPropertyValue(), otherPropertyList));

               PropertyModel propertyModel = new PropertyModel(model.getPropertyId(), model.getPropertyWay(), (long)model.getPropertyValue());
               propertyModelMap.put(i, propertyModel);
               this.score += model.getScore1();
            }
         }

         for(Map.Entry<Integer, PropertyModel> entry : propertyModelMap.entrySet()) {
            this.properties.add(entry.getValue());
         }

      }
   }

   private void initSkill(GameModelPool gameModelPool, WarriorSignetModel signetModel, boolean isLuck) {
      if (signetModel.getSkillId().size() > 0) {
         for(Integer skillId : signetModel.getSkillId()) {
            WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)ApplicationContextProvider.getModelPoolEntity("warriorSignetSkill", skillId);
            if (null != skillModel) {
               this.score += skillModel.getPower();
            }
         }
      }

      if (signetModel.getSkillNum() != null && !signetModel.getSkillNum().isEmpty()) {
         int skillNum = GamePlayer.countRate(signetModel.getSkillNum());
         int tempScore = this.score;
         if (skillNum == 2) {
            int loop = 0;

            do {
               this.skills.clear();
               this.score = tempScore;
               if (isLuck) {
                  this.addSkillRandom(gameModelPool, signetModel.getLuckSkill2_1());
                  this.addSkillRandom(gameModelPool, signetModel.getLuckSkill2_2());
               } else {
                  this.addSkillRandom(gameModelPool, signetModel.getSkill2_1());
                  this.addSkillRandom(gameModelPool, signetModel.getSkill2_2());
               }

               ++loop;
            } while(this.sameTypeSkill() && loop < 10);

            if (this.sameTypeSkill() && loop >= 10) {
               logger.error("循环技能出错，技能1={}，技能2={}，loop={}", new Object[]{this.skills.get(0), this.skills.get(1), loop});
            }
         } else if (isLuck) {
            this.addSkillRandom(gameModelPool, signetModel.getLuckSkill1_1());
         } else {
            this.addSkillRandom(gameModelPool, signetModel.getSkill1_1());
         }

      }
   }

   private void initSkillByUpdate(GameModelPool gameModelPool, WarriorSignetModel signetModel, Map<Integer, Integer> skillMap) {
      if (signetModel.getSkillNum() != null && !signetModel.getSkillNum().isEmpty()) {
         if (skillMap.size() == 2) {
            this.addSkillUpgrade(gameModelPool, (Integer)skillMap.get(0));
            this.addSkillUpgrade(gameModelPool, (Integer)skillMap.get(1));
         } else if (skillMap.get(1) != null) {
            do {
               this.skills.clear();
               this.addSkillRandom(gameModelPool, signetModel.getSkill2_1());
               this.addSkillUpgrade(gameModelPool, (Integer)skillMap.get(1));
            } while(this.sameTypeSkill());
         } else if (skillMap.get(0) != null) {
            do {
               this.skills.clear();
               this.addSkillUpgrade(gameModelPool, (Integer)skillMap.get(0));
               this.addSkillRandom(gameModelPool, signetModel.getSkill2_2());
            } while(this.sameTypeSkill());
         }

      }
   }

   private void initSkillByLock(GameModelPool gameModelPool, WarriorSignetModel signetModel, Map<Integer, Integer> skillMap, List<Integer> otherBaseSkillIdList) {
      if (signetModel.getSkillNum() != null && !signetModel.getSkillNum().isEmpty()) {
         if (skillMap.size() == 2) {
            this.addSkillLock(gameModelPool, (Integer)skillMap.get(0));
            this.addSkillLock(gameModelPool, (Integer)skillMap.get(1));
         } else if (skillMap.get(1) != null) {
            int loop = 0;

            do {
               this.skills.clear();
               this.addSkillRandom(gameModelPool, signetModel.getSkill2_1());
               this.addSkillLock(gameModelPool, (Integer)skillMap.get(1));
               ++loop;
            } while(this.sameTypeSkill(otherBaseSkillIdList) && loop < 100);

            if (loop >= 100) {
               logger.error("重铸将印锁定技能100次没有符合要求，id={},最终技能={}，锁定技能={}", new Object[]{this.id, Convert.toStr(this.skills), Convert.toStr(skillMap)});
            }
         } else if (skillMap.get(0) != null) {
            int loop = 0;

            do {
               ++loop;
               this.skills.clear();
               this.addSkillLock(gameModelPool, (Integer)skillMap.get(0));
               this.addSkillRandom(gameModelPool, signetModel.getSkill2_2());
               if (loop > 200) {
                  logger.error("将印={}，重铸将印失败={}", this.id, this.skills);
                  break;
               }
            } while(this.sameTypeSkill(otherBaseSkillIdList));
         }

      }
   }

   private void addSkillRandom(GameModelPool gameModelPool, int groupId) {
      Map<Integer, WarriorSignetSkillLibModel> map = gameModelPool.getMap("warriorSignetSkillLib");
      List<KeyValFun> rateList = new ArrayList();

      for(WarriorSignetSkillLibModel model : map.values()) {
         if (model.getGroupId() == groupId) {
            rateList.add(new KeyValFun(model.getSkillId(), model.getWeight()));
         }
      }

      if (!rateList.isEmpty()) {
         int skillId = GamePlayer.countRate(rateList);
         WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)gameModelPool.getEntity("warriorSignetSkill", skillId);
         if (skillModel == null) {
            logger.error("将印技能库配置的将印技能不存在  libId:{}  skillId:{}", groupId, skillId);
            return;
         }

         this.score += skillModel.getPower();
         this.skills.add(skillId);
      }

   }

   private void addSkillLock(GameModelPool gameModelPool, int skill) {
      WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)gameModelPool.getEntity("warriorSignetSkill", skill);
      if (skillModel == null) {
         logger.error("将印技能库配置的将印技能不存在  skillId:{}", skill);
      } else {
         this.score += skillModel.getPower();
         this.skills.add(skillModel.getId());
      }
   }

   private void addSkillUpgrade(GameModelPool gameModelPool, int skill) {
      WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)gameModelPool.getEntity("warriorSignetSkill", skill);
      if (skillModel == null) {
         logger.error("将印技能库配置的将印技能不存在  skillId:{}", skill);
      } else {
         WarriorSignetSkillModel newSkillModel = (WarriorSignetSkillModel)gameModelPool.getEntity("warriorSignetSkill", skillModel.getNextId());
         if (skillModel == null) {
            logger.error("没有下一级将印 skillId:{}", newSkillModel.getNextId());
         } else {
            this.score += newSkillModel.getPower();
            this.skills.add(newSkillModel.getId());
         }
      }
   }

   public boolean sameProperty(Map<Integer, PropertyModel> propertyModelMap, int type, int way, int val, List<PropertyModel> otherPropertyList) {
      for(Map.Entry<Integer, PropertyModel> entry : propertyModelMap.entrySet()) {
         if (((PropertyModel)entry.getValue()).getWay() == way && ((PropertyModel)entry.getValue()).getType() == type && ((PropertyModel)entry.getValue()).getValue() == (long)val) {
            return true;
         }
      }

      if (otherPropertyList != null && !otherPropertyList.isEmpty()) {
         for(PropertyModel propertyModel : otherPropertyList) {
            if (propertyModel.getWay() == way && propertyModel.getType() == type && propertyModel.getValue() == (long)val) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean sameProperty(List<PropertyModel> propertyModeList, int type, int way) {
      for(PropertyModel model : propertyModeList) {
         if (model.getWay() == way && model.getType() == type) {
            return true;
         }
      }

      return false;
   }

   public boolean sameTypeSkill(List<Integer> otherBaseSkillIdList) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      WarriorSignetSkillModel skillModel_1 = (WarriorSignetSkillModel)gameModelPool.getEntity("warriorSignetSkill", this.skills.get(0));
      WarriorSignetSkillModel skillModel_2 = (WarriorSignetSkillModel)gameModelPool.getEntity("warriorSignetSkill", this.skills.get(1));
      if (skillModel_1 != null && skillModel_2 != null) {
         if (skillModel_1.getBaseSkill() == skillModel_2.getBaseSkill()) {
            return true;
         } else {
            if (otherBaseSkillIdList != null && !otherBaseSkillIdList.isEmpty()) {
               if (otherBaseSkillIdList.contains(skillModel_1.getBaseSkill())) {
                  return true;
               }

               if (otherBaseSkillIdList.contains(skillModel_2.getBaseSkill())) {
                  return true;
               }
            }

            return false;
         }
      } else {
         logger.info("有技能没有模板");
         return true;
      }
   }

   public boolean sameTypeSkill() {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      WarriorSignetSkillModel skillModel_1 = (WarriorSignetSkillModel)gameModelPool.getEntity("warriorSignetSkill", this.skills.get(0));
      WarriorSignetSkillModel skillModel_2 = (WarriorSignetSkillModel)gameModelPool.getEntity("warriorSignetSkill", this.skills.get(1));
      if (skillModel_1 != null && skillModel_2 != null) {
         return skillModel_1.getBaseSkill() == skillModel_2.getBaseSkill();
      } else {
         logger.info("有技能没有模板");
         return true;
      }
   }

   public WarriorSignetPropertyModel findWarriorSignetPropertyModel(GameModelPool gameModelPool, int groupId, PropertyModel propertyModel, boolean isSameValue) {
      Map<Integer, WarriorSignetPropertyLibModel> map = gameModelPool.getMap("warriorSignetPropertyLib");
      if (map != null) {
         for(Map.Entry<Integer, WarriorSignetPropertyLibModel> entry : map.entrySet()) {
            if (((WarriorSignetPropertyLibModel)entry.getValue()).getGroupId() == groupId) {
               WarriorSignetPropertyModel model = (WarriorSignetPropertyModel)gameModelPool.getEntity("warriorSignetProperty", ((WarriorSignetPropertyLibModel)entry.getValue()).getPropertyId());
               if (isSameValue) {
                  if (model.getPropertyId() == propertyModel.getType() && model.getPropertyWay() == propertyModel.getWay() && (long)model.getPropertyValue() == propertyModel.getValue()) {
                     return model;
                  }
               } else if (model.getPropertyId() == propertyModel.getType() && model.getPropertyWay() == propertyModel.getWay()) {
                  return model;
               }
            }
         }
      }

      return null;
   }

   public void decode(String data) {
      String[] strs = data.split(";", -1);
      if (!StringUtils.isEmpty(strs[0])) {
         String[] baseStrs = strs[0].split(",");
         this.code = Integer.parseInt(baseStrs[0]);
         this.id = Integer.parseInt(baseStrs[1]);
         this.num = Integer.parseInt(baseStrs[2]);
         this.enableTime = Integer.parseInt(baseStrs[3]);
         this.score = Integer.parseInt(baseStrs[4]);
      }

      this.properties.clear();
      if (!StringUtils.isEmpty(strs[1])) {
         String[] strArr = strs[1].split(",");

         for(String property : strArr) {
            String[] cell = property.split("_");
            if (cell.length != 3) {
               (new Exception("解析将印出错 " + cell)).printStackTrace();
            } else {
               PropertyModel propertyModel = new PropertyModel(Integer.parseInt(cell[0]), Integer.parseInt(cell[1]), (long)Integer.parseInt(cell[2]));
               this.properties.add(propertyModel);
            }
         }
      }

      this.skills.clear();
      if (!StringUtils.isEmpty(strs[2])) {
         String[] strArr = strs[2].split(",");

         for(String skill : strArr) {
            this.skills.add(Integer.parseInt(skill));
         }
      }

      this.recastPros.clear();
      if (!StringUtils.isEmpty(strs[3])) {
         String[] strArr = strs[3].split(",");

         for(String property : strArr) {
            String[] cell = property.split("_");
            if (cell.length != 3) {
               (new Exception("解析将印重铸属性出错 " + cell)).printStackTrace();
            } else {
               PropertyModel propertyModel = new PropertyModel(Integer.parseInt(cell[0]), Integer.parseInt(cell[1]), (long)Integer.parseInt(cell[2]));
               this.recastPros.add(propertyModel);
            }
         }
      }

      this.recastSkills.clear();
      if (!StringUtils.isEmpty(strs[4])) {
         String[] strArr = strs[4].split(",");

         for(String skill : strArr) {
            this.recastSkills.add(Integer.parseInt(skill));
         }
      }

   }

   public String encode() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.code);
      stringBuilder.append(",");
      stringBuilder.append(this.id);
      stringBuilder.append(",");
      stringBuilder.append(this.num);
      stringBuilder.append(",");
      stringBuilder.append(this.enableTime);
      stringBuilder.append(",");
      stringBuilder.append(this.score);
      stringBuilder.append(";");
      if (this.properties.size() > 0) {
         for(PropertyModel propertyModel : this.properties) {
            stringBuilder.append(propertyModel.getType() + "_" + propertyModel.getWay() + "_" + propertyModel.getValue());
            stringBuilder.append(",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      stringBuilder.append(";");
      if (this.skills.size() > 0) {
         for(int skill : this.skills) {
            stringBuilder.append(skill);
            stringBuilder.append(",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      stringBuilder.append(";");
      if (this.recastPros.size() > 0) {
         for(PropertyModel propertyModel : this.recastPros) {
            stringBuilder.append(propertyModel.getType() + "_" + propertyModel.getWay() + "_" + propertyModel.getValue());
            stringBuilder.append(",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      stringBuilder.append(";");
      if (this.recastSkills.size() > 0) {
         for(int skill : this.recastSkills) {
            stringBuilder.append(skill);
            stringBuilder.append(",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
