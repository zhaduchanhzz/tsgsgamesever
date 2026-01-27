package com.gzbz.test;

import allMgr.PartAnnotation;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.ItemModel;
import com.gzbz.model.WarriorSignetModel;
import com.gzbz.model.WarriorSignetPropertyModel;
import com.gzbz.model.WarriorSignetSkillModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class WarriorSignetRecastTestPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(WarriorSignetRecastTestPart.class);
   private static List<ResourceModel> totalNeedList = new ArrayList();
   private int property_1;
   private List<Integer> property_2 = new ArrayList();
   private List<Integer> skillIds = new ArrayList();

   public void resetData() {
      totalNeedList.clear();
      this.property_2.clear();
      this.skillIds.clear();
   }

   public void gmTest() {
      this.resetData();
      this.initByType(1);
      logger.info("需求目标，固定值={}", this.property_1);
      logger.info("百分比属性={}", this.property_2);
      logger.info("技能属性={}", this.skillIds);
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      List<ItemBase> itemBaseList = itemBagPart.getItemBaseById(4060);
      logger.info("背包有粉色将印4060个数={}", itemBaseList.size());

      for(ItemBase itemBase : itemBaseList) {
         int loop = 0;
         int recastNum = 0;
         int noLockNum = 0;

         while(this.isNeedRecast(itemBase)) {
            WarriorSignet warriorSignet = (WarriorSignet)itemBase;
            List<Integer> lockSkillProperty = new ArrayList();

            for(int i = 0; i < warriorSignet.skills.size(); ++i) {
               if (this.skillIds.contains(warriorSignet.skills.get(i))) {
                  lockSkillProperty.add(i + 1);
               }
            }

            if (lockSkillProperty.size() <= 0) {
               this.recastBagWarrior(itemBase, new ArrayList(), new ArrayList());
               ++noLockNum;
            } else {
               List<Integer> lockIndexProperty = new ArrayList();

               for(int i = 0; i < warriorSignet.properties.size(); ++i) {
                  int id = this.getId((PropertyModel)warriorSignet.properties.get(i));
                  if (i == 0) {
                     if (id == this.property_1) {
                        lockIndexProperty.add(i + 1);
                     }
                  } else if (this.property_2.contains(id)) {
                     lockIndexProperty.add(i + 1);
                  }
               }

               recastNum += lockIndexProperty.size();
               recastNum += lockSkillProperty.size();
               this.recastBagWarrior(itemBase, lockIndexProperty, lockSkillProperty);
            }

            ++loop;
            if (loop > 1000) {
               logger.error("重铸次数大于1000次");
               break;
            }
         }

         logger.info("重铸次数,不锁定次数,锁定次数={}\t{}\t{}", new Object[]{loop, noLockNum, recastNum});
         this.player.additemUpdateBuilder(itemBase);
         this.player.senditemUpdateMsg();
      }

      itemBagPart.updateOp();
   }

   public void gmTestOld() {
      this.resetData();
      this.initByType(1);
      logger.info("需求目标，固定值={}", this.property_1);
      logger.info("百分比属性={}", this.property_2);
      logger.info("技能属性={}", this.skillIds);
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      List<ItemBase> itemBaseList = itemBagPart.getItemBaseById(4060);
      logger.info("背包有粉色将印4060个数={}", itemBaseList.size());

      for(ItemBase itemBase : itemBaseList) {
         int loop = 0;
         int recastNum = 0;

         while(this.isNeedRecast(itemBase)) {
            WarriorSignet warriorSignet = (WarriorSignet)itemBase;
            List<Integer> lockIndexProperty = new ArrayList();
            List<Integer> lockSkillProperty = new ArrayList();

            for(int i = 0; i < warriorSignet.properties.size(); ++i) {
               int id = this.getId((PropertyModel)warriorSignet.properties.get(i));
               if (i == 0) {
                  if (id == this.property_1) {
                     lockIndexProperty.add(i + 1);
                  }
               } else if (this.property_2.contains(id)) {
                  lockIndexProperty.add(i + 1);
               }
            }

            for(int i = 0; i < warriorSignet.skills.size(); ++i) {
               if (this.skillIds.contains(warriorSignet.skills.get(i))) {
                  lockSkillProperty.add(i + 1);
               }
            }

            recastNum += lockIndexProperty.size();
            recastNum += lockSkillProperty.size();
            this.recastBagWarrior(itemBase, lockIndexProperty, lockSkillProperty);
            ++loop;
            if (loop > 1000) {
               logger.error("重铸次数大于1000次");
               break;
            }
         }

         logger.info("重铸次数,锁定次数={}\t{}", loop, recastNum);
         this.player.additemUpdateBuilder(itemBase);
         this.player.senditemUpdateMsg();
      }

      itemBagPart.updateOp();
      logger.info("=====总消耗=====");

      for(ResourceModel resourceModel : totalNeedList) {
         logger.info("{},{},{}", new Object[]{resourceModel.getType(), resourceModel.getId(), resourceModel.getValue()});
      }

   }

   public void initByType(int type) {
      switch (type) {
         case 1:
            this.property_1 = 60005;
            this.property_2.add(70006);
            this.property_2.add(70001);
            this.property_2.add(70007);
            this.skillIds.add(4503);
            this.skillIds.add(4542);
            this.skillIds.add(4533);
            this.skillIds.add(4508);
            break;
         case 2:
            this.property_1 = 60005;
            this.property_2.add(70006);
            this.property_2.add(70001);
            this.property_2.add(70007);
            this.skillIds.add(4502);
            this.skillIds.add(4508);
            this.skillIds.add(4540);
            this.skillIds.add(4533);
            this.skillIds.add(4506);
            this.skillIds.add(4507);
            break;
         case 3:
            this.property_1 = 60006;
            this.property_2.add(70002);
            this.property_2.add(70009);
            this.property_2.add(70003);
            this.skillIds.add(4523);
            this.skillIds.add(4540);
            this.skillIds.add(4536);
            this.skillIds.add(4535);
            this.skillIds.add(4528);
            this.skillIds.add(4526);
      }

   }

   public boolean isNeedRecast(ItemBase itemBase) {
      WarriorSignet warriorSignet = (WarriorSignet)itemBase;
      if (this.property_1 != this.getId((PropertyModel)warriorSignet.properties.get(0))) {
         return true;
      } else {
         for(int i = 1; i < warriorSignet.properties.size(); ++i) {
            if (!this.property_2.contains(this.getId((PropertyModel)warriorSignet.properties.get(i)))) {
               return true;
            }
         }

         for(Integer skill : warriorSignet.skills) {
            if (!this.skillIds.contains(skill)) {
               return true;
            }
         }

         return false;
      }
   }

   private int getId(PropertyModel resModel) {
      Map<Integer, WarriorSignetPropertyModel> map = this.player.getGameModelPool().getMap("warriorSignetProperty");

      for(Map.Entry<Integer, WarriorSignetPropertyModel> entry : map.entrySet()) {
         if (resModel.getType() == ((WarriorSignetPropertyModel)entry.getValue()).getPropertyId() && resModel.getWay() == ((WarriorSignetPropertyModel)entry.getValue()).getPropertyWay() && resModel.getValue() == (long)((WarriorSignetPropertyModel)entry.getValue()).getPropertyValue()) {
            return (Integer)entry.getKey();
         }
      }

      return -1;
   }

   private boolean isSameModel(PropertyModel resModel, PropertyModel desModel) {
      return resModel.getType() == desModel.getType() && resModel.getWay() == desModel.getWay() && (long)resModel.getWay() == desModel.getValue();
   }

   public void recastBagWarrior(ItemBase itemBase, List<Integer> propertyPositionList, List<Integer> skillPositionList) {
      WarriorSignet warriorSignet = (WarriorSignet)itemBase;
      WarriorSignetModel warriorSignetModel = (WarriorSignetModel)this.player.getGameModelPool().getEntity("warriorSignet", warriorSignet.id);
      if (warriorSignetModel == null) {
         logger.info("没有资源模板信息，id={}", warriorSignet.id);
      } else if (warriorSignetModel.getRecastCost().isEmpty()) {
         logger.info("资源消耗为空，说明该将印不能重铸，id={}", warriorSignet.id);
      } else {
         List<ResourceModel> needList = new ArrayList();
         boolean isLock = false;
         if (propertyPositionList.size() > 0 || skillPositionList.size() > 0) {
            isLock = true;
         }

         for(int i = 0; i < warriorSignetModel.getRecastCost().size(); ++i) {
            ResourceModel resourceModel = (ResourceModel)warriorSignetModel.getRecastCost().get(i);
            if (!isLock || resourceModel.getType() != 1 || resourceModel.getId() != PlayerDefine.PLAYER_COPPER) {
               ResourceModel.addResourceToList(needList, resourceModel);
            }
         }

         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", warriorSignet.id);
         if (itemModel == null) {
            logger.info("没有物品模板信息，id={}", warriorSignet.id);
         } else {
            WarriorSignet newWarriorSignet = new WarriorSignet();
            boolean isLuck = false;
            PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
            int recastNum = (Integer)MapUtil.getOrDefault(playerExtend.warriorRecastNum, warriorSignet.id, 0);
            if (skillPositionList.size() <= 0 && warriorSignetModel.getLuckRecastCost() > 0 && recastNum >= warriorSignetModel.getLuckRecastCost()) {
               isLuck = true;
            }

            Map<Integer, Integer> skillMap = new HashMap();
            Map<Integer, PropertyModel> propertyMap = new HashMap();
            List<PropertyModel> otherPropertyTypeList = new ArrayList();
            List<Integer> otherBaseSkillIdList = new ArrayList();
            if (skillPositionList.size() > 0) {
               for(int i = 0; i < warriorSignet.skills.size(); ++i) {
                  int index = i + 1;
                  if (skillPositionList.contains(index)) {
                     skillMap.put(i, warriorSignet.skills.get(i));
                  } else {
                     WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", warriorSignet.skills.get(i));
                     if (skillModel != null) {
                        otherBaseSkillIdList.add(skillModel.getBaseSkill());
                     }
                  }
               }

               for(Integer skillPos : skillPositionList) {
                  if (warriorSignetModel.getSkillRecastLock().get(skillPos) == null) {
                     logger.info("属性锁定消耗资源配置错误");
                     return;
                  }

                  ResourceModel.addResourceToList(needList, (ResourceModel)warriorSignetModel.getSkillRecastLock().get(skillPos));
               }
            } else if (isLock) {
               for(int i = 0; i < warriorSignet.skills.size(); ++i) {
                  WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", warriorSignet.skills.get(i));
                  if (skillModel != null) {
                     otherBaseSkillIdList.add(skillModel.getBaseSkill());
                  }
               }
            }

            if (propertyPositionList.size() > 0) {
               for(int i = 0; i < warriorSignet.properties.size(); ++i) {
                  int index = i + 1;
                  if (propertyPositionList.contains(index)) {
                     propertyMap.put(i, ((PropertyModel)warriorSignet.properties.get(i)).clone());
                  } else {
                     otherPropertyTypeList.add(((PropertyModel)warriorSignet.properties.get(i)).clone());
                  }
               }

               for(Integer position : propertyPositionList) {
                  if (warriorSignetModel.getPropertyRecastlock().get(position) == null) {
                     logger.info("属性锁定消耗资源配置错误");
                     return;
                  }

                  ResourceModel.addResourceToList(needList, (ResourceModel)warriorSignetModel.getPropertyRecastlock().get(position));
               }
            } else if (isLock) {
               for(int i = 0; i < warriorSignet.properties.size(); ++i) {
                  otherPropertyTypeList.add(((PropertyModel)warriorSignet.properties.get(i)).clone());
               }
            }

            newWarriorSignet.initByRecast(isLuck, itemModel, skillMap, propertyMap, this.player, otherPropertyTypeList, otherBaseSkillIdList);
            warriorSignet.properties = newWarriorSignet.properties;
            warriorSignet.skills = newWarriorSignet.skills;
            if (isLuck) {
               playerExtend.warriorRecastNum.put(warriorSignet.id, 0);
            } else {
               playerExtend.warriorRecastNum.put(warriorSignet.id, recastNum + 1);
            }

            this.player.updatePlayerExtend(13);

            for(ResourceModel resourceModel : needList) {
               ResourceModel.addResourceToList(totalNeedList, resourceModel);
            }

         }
      }
   }
}
