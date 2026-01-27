package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "divineGeneralsLevel"
)
public class DivineGeneralsLevelModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "组"
   )
   private int groupId;
   @ModelColumnAnno(
      comment = "等级"
   )
   private int lv;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 6,
      comment = "属性加成"
   )
   private List<PropertyModel> properties = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "消耗材料"
   )
   private List<ResourceModel> materials = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "新消耗材料"
   )
   private List<ResourceModel> newMaterials = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroupId() {
      return this.groupId;
   }

   public void setGroupId(int groupId) {
      this.checkModify();
      this.groupId = groupId;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public List<PropertyModel> getProperties() {
      return this.properties;
   }

   public void setProperties(List<PropertyModel> properties) {
      this.checkModify();
      this.properties = properties;
   }

   public List<ResourceModel> getMaterials() {
      return this.materials;
   }

   public void setMaterials(List<ResourceModel> materials) {
      this.checkModify();
      this.materials = materials;
   }

   public List<ResourceModel> getNewMaterials() {
      return this.newMaterials;
   }

   public void setNewMaterials(List<ResourceModel> newMaterials) {
      this.checkModify();
      this.newMaterials = newMaterials;
   }
}
