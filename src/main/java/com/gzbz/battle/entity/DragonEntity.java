package com.gzbz.battle.entity;

import com.gzbz.model.MagicBookModel;
import com.gzbz.model.MagicSkillModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DragonEntity extends Entity {
   public DragonEntity(BattleMsg.EntityType type, int modelId, List<Integer> skillIds, Map<Integer, PropertyModel> dragonStrengthen) {
      this.entityType = 3;
      MagicBookModel magicBookModel = (MagicBookModel)ApplicationContextProvider.getModelPoolEntity("MysticBook", modelId);
      if (magicBookModel == null) {
         throw new RuntimeException("神龙配置:" + modelId + "不存在");
      } else {
         this.type = type;
         this.id = modelId;
         this.level = magicBookModel.getLevel();
         List<PropertyModel> propertyModels = new ArrayList();

         for(PropertyModel property : magicBookModel.getProperties()) {
            PropertyModel.addLvProtities(propertyModels, property);
         }

         int index = 0;

         for(Integer skillId : skillIds) {
            if (skillId > 0) {
               MagicSkillModel magicSkillModel = (MagicSkillModel)ApplicationContextProvider.getModelPoolEntity("MysticSkill", skillId);

               for(PropertyModel propertyModel : magicSkillModel.getProperties()) {
                  PropertyModel.addLvProtities(propertyModels, propertyModel);
               }
            }
         }

         for(PropertyModel propertyModel : propertyModels) {
            long value = propertyModel.getValue();
            if (dragonStrengthen.containsKey(propertyModel.getType())) {
               PropertyModel addition = (PropertyModel)dragonStrengthen.get(propertyModel.getType());
               if (addition.getWay() == 0) {
                  value += addition.getValue();
               } else if (addition.getWay() == 1) {
                  value = (long)((float)value + (float)addition.getValue() / 10000.0F);
               }
            }

            if (propertyModel.getType() == 1) {
               this.baseProperties.put(99, (Long)this.baseProperties.getOrDefault(99, 0L) + value);
            }

            this.baseProperties.put(propertyModel.getType(), (Long)this.baseProperties.getOrDefault(propertyModel.getType(), 0L) + value);
         }

         this.baseProperties.put(8, 999999L);
         this.heroSkills.addAll(skillIds);
      }
   }

   public boolean isAlive() {
      return true;
   }

   public boolean isDead() {
      return false;
   }
}
