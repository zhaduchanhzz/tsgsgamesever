package com.gzbz.gameDefine;

import com.gzbz.model.WarriorSignetModel;
import com.gzbz.model.WarriorSignetPropertyModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WarriorSignetDefine {
   private static Logger logger = LoggerFactory.getLogger(WarriorSignetDefine.class);

   public static WarriorSignetModel getWarriorSignetModel(int id) {
      WarriorSignetModel warriorSignetModel = (WarriorSignetModel)ApplicationContextProvider.getModelPoolEntity("warriorSignet", id);
      if (warriorSignetModel == null && id > 0) {
         logger.error("WarriorSignet 配置有误 id:{}", id);
      }

      return warriorSignetModel;
   }

   public static WarriorSignetPropertyModel getWarriorSignetPropertyModel(int id) {
      WarriorSignetPropertyModel warriorSignetPropertyModel = (WarriorSignetPropertyModel)ApplicationContextProvider.getModelPoolEntity("warriorSignetProperty", id);
      if (null == warriorSignetPropertyModel && id > 0) {
         logger.error("warriorSignetProperty 配置有误 id:{}", id);
      }

      return warriorSignetPropertyModel;
   }

   public static List<PropertyModel> getBaseAttr(int warriorSignetId) {
      List<PropertyModel> propertyModelList = new ArrayList();
      WarriorSignetModel warriorSignetModel = getWarriorSignetModel(warriorSignetId);
      if (null != warriorSignetModel && !warriorSignetModel.getBaseAttr().isEmpty()) {
         for(Integer proId : warriorSignetModel.getBaseAttr()) {
            WarriorSignetPropertyModel wsp = getWarriorSignetPropertyModel(proId);
            if (null != wsp) {
               propertyModelList.add(new PropertyModel(wsp.getPropertyId(), wsp.getPropertyWay(), (long)wsp.getPropertyValue()));
            }
         }

         return propertyModelList;
      } else {
         return propertyModelList;
      }
   }

   public static List<PropertyModel> getExclusiveAttr(int warriorSignetId) {
      List<PropertyModel> propertyModelList = new ArrayList();
      WarriorSignetModel warriorSignetModel = getWarriorSignetModel(warriorSignetId);
      if (null != warriorSignetModel && !warriorSignetModel.getZhuanshuAttr().isEmpty()) {
         for(Integer proId : warriorSignetModel.getZhuanshuAttr()) {
            WarriorSignetPropertyModel wsp = getWarriorSignetPropertyModel(proId);
            if (null != wsp) {
               propertyModelList.add(new PropertyModel(wsp.getPropertyId(), wsp.getPropertyWay(), (long)wsp.getPropertyValue()));
            }
         }

         return propertyModelList;
      } else {
         return propertyModelList;
      }
   }

   public static List<Integer> getSkillIdList(int warriorSignetId) {
      List<Integer> skillIdList = new ArrayList();
      WarriorSignetModel warriorSignetModel = getWarriorSignetModel(warriorSignetId);
      if (null == warriorSignetModel) {
         return skillIdList;
      } else {
         skillIdList.addAll(warriorSignetModel.getSkillId());
         return skillIdList;
      }
   }

   public static void addExclusiveAttrAndSkill(int warriorSignetId, CommonMsg.HeroWarriorSignetInfo.Builder warriorSignetBuilder) {
      for(PropertyModel basePro : getBaseAttr(warriorSignetId)) {
         warriorSignetBuilder.addProperty(basePro.builder());
      }

      for(PropertyModel exclusivePro : getExclusiveAttr(warriorSignetId)) {
         warriorSignetBuilder.addExclusiveAttr(exclusivePro.builder());
      }

      List<Integer> skillIdList = getSkillIdList(warriorSignetId);
      warriorSignetBuilder.addAllSkills(skillIdList);
   }
}
