package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "artifactRefine"
)
public class ArtifactRefineModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "level",
      isPrimaty = true,
      comment = "等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "等级限制"
   )
   private int levelLimit;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "精练道具"
   )
   private ArrayList<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      columnName = "propertys",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1,
      comment = "精练加成"
   )
   private ArrayList<PropertyModel> propertys = new ArrayList();
   @ModelColumnAnno(
      columnName = "addPropertys",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1,
      comment = "额外加成"
   )
   private ArrayList<PropertyModel> addPropertys = new ArrayList();

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getLevelLimit() {
      return this.levelLimit;
   }

   public ArrayList<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(ArrayList<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public ArrayList<PropertyModel> getPropertys() {
      return this.propertys;
   }

   public void setPropertys(ArrayList<PropertyModel> propertys) {
      this.checkModify();
      this.propertys = propertys;
   }

   public ArrayList<PropertyModel> getAddPropertys() {
      return this.addPropertys;
   }

   public void setAddPropertys(ArrayList<PropertyModel> addPropertys) {
      this.checkModify();
      this.addPropertys = addPropertys;
   }
}
