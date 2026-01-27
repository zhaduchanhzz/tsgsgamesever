package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import misc.RandomUtil;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "warHorseBase"
)
public class WarHorseBaseModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "holyBeastId",
      isPrimaty = true,
      comment = "神兽id"
   )
   private int holyBeastId;
   @ModelColumnAnno(
      columnName = "type",
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "name",
      comment = "神兽名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "quality",
      comment = "神兽品质"
   )
   private int quality;
   @ModelColumnAnno(
      columnName = "qualityName",
      comment = "品质名称"
   )
   private String qualityName;
   @ModelColumnAnno(
      columnName = "isWakeUp",
      comment = "是否能觉醒0否1是"
   )
   private String isWakeUp;
   @ModelColumnAnno(
      columnName = "exclusiveSkillId",
      comment = "专属技能id"
   )
   private int exclusiveSkillId;
   @ModelColumnAnno(
      columnName = "wakeUpSkillId",
      comment = "觉醒后专属技能ID"
   )
   private int wakeUpSkillId;
   @ModelColumnAnno(
      columnName = "wakeUpNeedItem",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "觉醒消耗道具类型"
   )
   private List<ResourceModel> wakeUpNeedItem = new ArrayList();
   @ModelColumnAnno(
      columnName = "refineValue",
      comment = "提供的炼化值"
   )
   private int refineValue;
   @ModelColumnAnno(
      columnName = "maxRefinedValue",
      comment = "最大可被炼化值"
   )
   private int maxRefinedValue;
   @ModelColumnAnno(
      columnName = "refineAttGroupId",
      comment = "炼化值提供的属性组"
   )
   private int refineAttGroupId;
   @ModelColumnAnno(
      columnName = "initSkillNum",
      comment = "初始技能数量"
   )
   private String initSkillNum;
   @ModelColumnAnno(
      columnName = "skillMinType",
      comment = "初始技能类型下限"
   )
   private int skillMinType;
   @ModelColumnAnno(
      columnName = "skillMaxType",
      comment = "初始技能类型上限"
   )
   private int skillMaxType;
   @ModelColumnAnno(
      columnName = "skillMinQuality",
      comment = "初始技能品质下限"
   )
   private int skillMinQuality;
   @ModelColumnAnno(
      columnName = "skillMaxQuality",
      comment = "初始技能品质上限"
   )
   private int skillMaxQuality;
   @ModelColumnAnno(
      columnName = "skillMinLv",
      comment = "初始技能等级上限"
   )
   private int skillMinLv;
   @ModelColumnAnno(
      columnName = "skillMaxLv",
      comment = "初始技能等级下限"
   )
   private int skillMaxLv;
   @ModelColumnAnno(
      columnName = "weight",
      comment = "神兽孵化获得权重"
   )
   private int weight;
   @ModelColumnAnno(
      columnName = "armatureId",
      comment = "神兽模型资源"
   )
   private int armatureId;
   @ModelColumnAnno(
      columnName = "armatureName",
      comment = "神兽模型名"
   )
   private String armatureName;
   @ModelColumnAnno(
      columnName = "skinId",
      comment = "神兽皮肤id"
   )
   private String skinId;
   @ModelColumnAnno(
      columnName = "unlockSkillQuality",
      comment = "解锁专属需要的技能品质"
   )
   private int unlockSkillQuality;
   @ModelColumnAnno(
      columnName = "unlockSkillNum",
      comment = "解锁专属需要的技能数量"
   )
   private int unlockSkillNum;
   @ModelColumnAnno(
      columnName = "baseAtt",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 4,
      comment = "基础属性"
   )
   private List<PropertyModel> baseAtt = new ArrayList();
   @ModelColumnAnno(
      columnName = "wakeBaseAtt",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 4,
      comment = "觉醒属性"
   )
   private List<PropertyModel> wakeBaseAtt = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "默认每级增加的属性"
   )
   private List<Integer> perGradeAtt = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "觉醒默认每级增加的属性"
   )
   private List<Integer> wakePerGradeAtt = new ArrayList();
   @ModelColumnAnno(
      columnName = "wakeUpQuality",
      comment = "觉醒品质"
   )
   private int wakeUpQuality;
   @ModelColumnAnno(
      columnName = "wakeUpAddSkillNum",
      comment = "额外技能槽"
   )
   private int wakeUpAddSkillNum;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "可选技能"
   )
   private List<Integer> hunjvSkillId = new ArrayList();

   public int getHolyBeastId() {
      return this.holyBeastId;
   }

   public void setHolyBeastId(int holyBeastId) {
      this.checkModify();
      this.holyBeastId = holyBeastId;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public String getQualityName() {
      return this.qualityName;
   }

   public void setQualityName(String qualityName) {
      this.checkModify();
      this.qualityName = qualityName;
   }

   public int getExclusiveSkillId() {
      return this.exclusiveSkillId;
   }

   public void setExclusiveSkillId(int exclusiveSkillId) {
      this.checkModify();
      this.exclusiveSkillId = exclusiveSkillId;
   }

   public int getRefineValue() {
      return this.refineValue;
   }

   public void setRefineValue(int refineValue) {
      this.checkModify();
      this.refineValue = refineValue;
   }

   public String getInitSkillNum() {
      return this.initSkillNum;
   }

   public void setInitSkillNum(String initSkillNum) {
      this.checkModify();
      this.initSkillNum = initSkillNum;
   }

   public int getSkillMinType() {
      return this.skillMinType;
   }

   public void setSkillMinType(int skillMinType) {
      this.checkModify();
      this.skillMinType = skillMinType;
   }

   public int getSkillMaxType() {
      return this.skillMaxType;
   }

   public void setSkillMaxType(int skillMaxType) {
      this.checkModify();
      this.skillMaxType = skillMaxType;
   }

   public int getSkillMinQuality() {
      return this.skillMinQuality;
   }

   public void setSkillMinQuality(int skillMinQuality) {
      this.checkModify();
      this.skillMinQuality = skillMinQuality;
   }

   public int getSkillMaxQuality() {
      return this.skillMaxQuality;
   }

   public void setSkillMaxQuality(int skillMaxQuality) {
      this.checkModify();
      this.skillMaxQuality = skillMaxQuality;
   }

   public int getSkillMinLv() {
      return this.skillMinLv;
   }

   public void setSkillMinLv(int skillMinLv) {
      this.checkModify();
      this.skillMinLv = skillMinLv;
   }

   public int getSkillMaxLv() {
      return this.skillMaxLv;
   }

   public void setSkillMaxLv(int skillMaxLv) {
      this.checkModify();
      this.skillMaxLv = skillMaxLv;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public int getArmatureId() {
      return this.armatureId;
   }

   public void setArmatureId(int armatureId) {
      this.checkModify();
      this.armatureId = armatureId;
   }

   public String getArmatureName() {
      return this.armatureName;
   }

   public void setArmatureName(String armatureName) {
      this.checkModify();
      this.armatureName = armatureName;
   }

   public String getSkinId() {
      return this.skinId;
   }

   public void setSkinId(String skinId) {
      this.checkModify();
      this.skinId = skinId;
   }

   public int getMaxRefinedValue() {
      return this.maxRefinedValue;
   }

   public void setMaxRefinedValue(int maxRefinedValue) {
      this.checkModify();
      this.maxRefinedValue = maxRefinedValue;
   }

   public List<PropertyModel> getBaseAtt() {
      return this.baseAtt;
   }

   public void setBaseAtt(List<PropertyModel> baseAtt) {
      this.checkModify();
      this.baseAtt = baseAtt;
   }

   public List<Integer> getPerGradeAtt() {
      return this.perGradeAtt;
   }

   public void setPerGradeAtt(List<Integer> perGradeAtt) {
      this.checkModify();
      this.perGradeAtt = perGradeAtt;
   }

   public int getRefineAttGroupId() {
      return this.refineAttGroupId;
   }

   public void setRefineAttGroupId(int refineAttGroupId) {
      this.refineAttGroupId = refineAttGroupId;
   }

   public int getUnlockSkillQuality() {
      return this.unlockSkillQuality;
   }

   public void setUnlockSkillQuality(int unlockSkillQuality) {
      this.checkModify();
      this.unlockSkillQuality = unlockSkillQuality;
   }

   public int getUnlockSkillNum() {
      return this.unlockSkillNum;
   }

   public void setUnlockSkillNum(int unlockSkillNum) {
      this.checkModify();
      this.unlockSkillNum = unlockSkillNum;
   }

   public String getIsWakeUp() {
      return this.isWakeUp;
   }

   public void setIsWakeUp(String isWakeUp) {
      this.checkModify();
      this.isWakeUp = isWakeUp;
   }

   public int getWakeUpSkillId() {
      return this.wakeUpSkillId;
   }

   public void setWakeUpSkillId(int wakeUpSkillId) {
      this.checkModify();
      this.wakeUpSkillId = wakeUpSkillId;
   }

   public List<ResourceModel> getWakeUpNeedItem() {
      return this.wakeUpNeedItem;
   }

   public void setWakeUpNeedItem(List<ResourceModel> wakeUpNeedItem) {
      this.checkModify();
      this.wakeUpNeedItem = wakeUpNeedItem;
   }

   public List<PropertyModel> getWakeBaseAtt() {
      return this.wakeBaseAtt;
   }

   public void setWakeBaseAtt(List<PropertyModel> wakeBaseAtt) {
      this.checkModify();
      this.wakeBaseAtt = wakeBaseAtt;
   }

   public List<Integer> getWakePerGradeAtt() {
      return this.wakePerGradeAtt;
   }

   public void setWakePerGradeAtt(List<Integer> wakePerGradeAtt) {
      this.checkModify();
      this.wakePerGradeAtt = wakePerGradeAtt;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getWakeUpQuality() {
      return this.wakeUpQuality;
   }

   public void setWakeUpQuality(int wakeUpQuality) {
      this.checkModify();
      this.wakeUpQuality = wakeUpQuality;
   }

   public int getWakeUpAddSkillNum() {
      return this.wakeUpAddSkillNum;
   }

   public void setWakeUpAddSkillNum(int wakeUpAddSkillNum) {
      this.checkModify();
      this.wakeUpAddSkillNum = wakeUpAddSkillNum;
   }

   public List<Integer> getHunjvSkillId() {
      return this.hunjvSkillId;
   }

   public void setHunjvSkillId(List<Integer> hunjvSkillId) {
      this.checkModify();
      this.hunjvSkillId = hunjvSkillId;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<WarHorseBaseModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         WarHorseBaseModel model = (WarHorseBaseModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.quality, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customWarHorseBase", tempHashMap);
   }

   public int getSkillNum() {
      if (this.getInitSkillNum() != null && !this.getInitSkillNum().isEmpty()) {
         String[] array = this.getInitSkillNum().split("\\|");
         if (array.length <= 0) {
            return 0;
         } else {
            int totalWeight = 0;
            Map<Integer, Integer> map = new HashMap();

            for(String s : array) {
               String[] temp = s.split(",");
               if (temp.length >= 2) {
                  int num = Integer.parseInt(temp[0]);
                  int weight = Integer.valueOf(temp[1]);
                  if (num > 0 && !map.containsKey(num)) {
                     map.put(num, weight);
                     totalWeight += weight;
                  }
               }
            }

            int r = RandomUtil.randInt(totalWeight);
            int tempWeight = 0;

            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
               tempWeight += (Integer)entry.getValue();
               if (tempWeight > r) {
                  return (Integer)entry.getKey();
               }
            }

            return 0;
         }
      } else {
         return 0;
      }
   }
}
