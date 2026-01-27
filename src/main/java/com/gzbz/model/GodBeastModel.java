package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GodBeast"
)
public class GodBeastModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "神兽主id"
   )
   private int godBeastID;
   @ModelColumnAnno(
      comment = "神兽名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "神兽类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "品质名称"
   )
   private String qualityName;
   @ModelColumnAnno(
      comment = "专属技能id"
   )
   private int exclusiveSkillId;
   @ModelColumnAnno(
      comment = "被动技能槽位"
   )
   private int passiveSkill;
   @ModelColumnAnno(
      comment = "升星参数"
   )
   private int upStarID;
   @ModelColumnAnno(
      comment = "是否可置换"
   )
   private int changeIf;
   @ModelColumnAnno(
      columnName = "changeCost",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "置换消耗"
   )
   private List<ResourceModel> changeCost = new ArrayList();
   @ModelColumnAnno(
      comment = "获得时是否锁定"
   )
   private int isLock;

   public int getGodBeastID() {
      return this.godBeastID;
   }

   public void setGodBeastID(int godBeastID) {
      this.checkModify();
      this.godBeastID = godBeastID;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
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

   public int getPassiveSkill() {
      return this.passiveSkill;
   }

   public void setPassiveSkill(int passiveSkill) {
      this.checkModify();
      this.passiveSkill = passiveSkill;
   }

   public int getUpStarID() {
      return this.upStarID;
   }

   public void setUpStarID(int upStarID) {
      this.checkModify();
      this.upStarID = upStarID;
   }

   public int getChangeIf() {
      return this.changeIf;
   }

   public void setChangeIf(int changeIf) {
      this.checkModify();
      this.changeIf = changeIf;
   }

   public List<ResourceModel> getChangeCost() {
      return this.changeCost;
   }

   public void setChangeCost(List<ResourceModel> changeCost) {
      this.checkModify();
      this.changeCost = changeCost;
   }

   public int getIsLock() {
      return this.isLock;
   }

   public void setIsLock(int isLock) {
      this.checkModify();
      this.isLock = isLock;
   }
}
