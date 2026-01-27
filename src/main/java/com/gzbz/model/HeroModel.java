package com.gzbz.model;

import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "hero"
)
public class HeroModel extends BaseModel {
   public static final int MAX_LIMIT = 200;
   public static final byte ATK_TYPE_PHYSICAL = 1;
   public static final byte ATK_TYPE_MAGIC = 2;
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "英雄id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "showOpen",
      comment = "是否显示进阶天坛"
   )
   private int showOpen;
   @ModelColumnAnno(
      columnName = "monsterType",
      comment = "武将类型"
   )
   private int monsterType;
   @ModelColumnAnno(
      columnName = "name",
      comment = "英雄名字"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "nation",
      comment = "阵营"
   )
   private int nation;
   @ModelColumnAnno(
      columnName = "quality",
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      columnName = "star",
      comment = "星级"
   )
   private int star;
   @ModelColumnAnno(
      columnName = "sex",
      comment = "性别"
   )
   private int sex;
   @ModelColumnAnno(
      columnName = "atkType",
      comment = "攻击类型"
   )
   private int atkType;
   @ModelColumnAnno(
      columnName = "type",
      comment = "职业类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "recTactics",
      comment = "推荐战法id"
   )
   private int recTactics;
   @ModelColumnAnno(
      columnName = "chipId",
      comment = "武将将符"
   )
   private int chipId;
   @ModelColumnAnno(
      columnName = "upStarId",
      comment = "升星参数ID"
   )
   private int upStarId;
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "skills",
      subCls = Integer.class,
      count = 4,
      comment = "主动技能"
   )
   private Map<Integer, Integer> skills = new TreeMap();
   @ModelColumnAnno(
      columnName = "deadSound",
      comment = "死亡语音"
   )
   private String deadSound;
   @ModelColumnAnno(
      columnName = "ardersound",
      comment = "休闲语音"
   )
   private String ardersound;
   @ModelColumnAnno(
      columnName = "bodyIcon",
      comment = "半身像ID"
   )
   private int bodyIcon;
   @ModelColumnAnno(
      columnName = "headIcon",
      comment = "角色头像ID"
   )
   private int headIcon;
   @ModelColumnAnno(
      columnName = "armature",
      comment = "动画ID"
   )
   private int armature;
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "property",
      subCls = Long.class,
      count = 21,
      comment = "属性"
   )
   private HashMap<Integer, Long> property = new HashMap();
   @ModelColumnAnno(
      columnName = "heroDesc",
      comment = "英雄描述"
   )
   private String heroDesc;
   @ModelColumnAnno(
      columnName = "heroTalent",
      comment = "武将天赋组"
   )
   private int heroTalent;
   @ModelColumnAnno(
      columnName = "heroSpType",
      comment = "特殊类型"
   )
   private int heroSpType;
   @ModelColumnAnno(
      columnName = "palaceSkill",
      comment = "是否可以作为君主技能"
   )
   private int palaceSkill;
   @ModelColumnAnno(
      columnName = "fieldSkillSlotId",
      comment = "领域技所在槽位"
   )
   private int fieldSkillSlotId;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getMonsterType() {
      return this.monsterType;
   }

   public void setMonsterType(int monsterType) {
      this.checkModify();
      this.monsterType = monsterType;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getNation() {
      return this.nation;
   }

   public void setNation(int nation) {
      this.checkModify();
      this.nation = nation;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getSex() {
      return this.sex;
   }

   public void setSex(int sex) {
      this.checkModify();
      this.sex = sex;
   }

   public int getAtkType() {
      return this.atkType;
   }

   public void setAtkType(int atkType) {
      this.checkModify();
      this.atkType = atkType;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getRecTactics() {
      return this.recTactics;
   }

   public void setRecTactics(int recTactics) {
      this.checkModify();
      this.recTactics = recTactics;
   }

   public int getChipId() {
      return this.chipId;
   }

   public void setChipId(int chipId) {
      this.checkModify();
      this.chipId = chipId;
   }

   public int getUpStarId() {
      return this.upStarId;
   }

   public void setUpStarId(int upStarId) {
      this.checkModify();
      this.upStarId = upStarId;
   }

   public String getDeadSound() {
      return this.deadSound;
   }

   public void setDeadSound(String deadSound) {
      this.checkModify();
      this.deadSound = deadSound;
   }

   public String getArdersound() {
      return this.ardersound;
   }

   public void setArdersound(String ardersound) {
      this.checkModify();
      this.ardersound = ardersound;
   }

   public int getBodyIcon() {
      return this.bodyIcon;
   }

   public void setBodyIcon(int bodyIcon) {
      this.checkModify();
      this.bodyIcon = bodyIcon;
   }

   public int getHeadIcon() {
      return this.headIcon;
   }

   public void setHeadIcon(int headIcon) {
      this.checkModify();
      this.headIcon = headIcon;
   }

   public int getArmature() {
      return this.armature;
   }

   public void setArmature(int armature) {
      this.checkModify();
      this.armature = armature;
   }

   public String getHeroDesc() {
      return this.heroDesc;
   }

   public void setHeroDesc(String heroDesc) {
      this.checkModify();
      this.heroDesc = heroDesc;
   }

   public Map<Integer, Integer> getSkills() {
      return this.skills;
   }

   public void setSkills(Map<Integer, Integer> skills) {
      this.checkModify();
      this.skills = skills;
   }

   public HashMap<Integer, Long> getProperty() {
      return this.property;
   }

   public void setProperty(HashMap<Integer, Long> property) {
      this.checkModify();
      this.property = property;
   }

   public int getShowOpen() {
      return this.showOpen;
   }

   public int getHeroTalent() {
      return this.heroTalent;
   }

   public void setHeroTalent(int heroTalent) {
      this.checkModify();
      this.heroTalent = heroTalent;
   }

   public int getHeroSpType() {
      return this.heroSpType;
   }

   public void setHeroSpType(int heroSpType) {
      this.checkModify();
      this.heroSpType = heroSpType;
   }

   public int getPalaceSkill() {
      return this.palaceSkill;
   }

   public void setPalaceSkill(int palaceSkill) {
      this.checkModify();
      this.palaceSkill = palaceSkill;
   }

   public int getFieldSkillSlotId() {
      return this.fieldSkillSlotId;
   }

   public void setFieldSkillSlotId(int fieldSkillSlotId) {
      this.checkModify();
      this.fieldSkillSlotId = fieldSkillSlotId;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      HeroDefine.HERO_JOB.clear();
      ConcurrentHashMap<Integer, HeroModel> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         HeroModel model = (HeroModel)entry.getValue();
         HeroDefine.HERO_JOB.add(model.getType());
         if (model.getHeroSpType() == HeroDefine.HERO_SP_TYPE_PALACE) {
            tempHashMap.put(model.id, model);
         }
      }

      pool.putMap("customPalaceHero", tempHashMap);
   }

   public static boolean isReplacementHero(int heroId) {
      HeroModel model = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroId);
      return model != null && model.getMonsterType() == HeroDefine.MONSTER_TYPE_CONSUME;
   }
}
