package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "CargoShipSacrifices"
)
public class CargoShipSacrificesModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "祭坛编号"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "type",
      comment = "祭品类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "name",
      comment = "祭品名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "iconid",
      comment = "图标id"
   )
   private int iconId;
   @ModelColumnAnno(
      columnName = "sacrifices",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "祭品",
      count = 1
   )
   private List<ResourceModel> sacrifices = new ArrayList();
   @ModelColumnAnno(
      columnName = "ExpReward",
      comment = "经验增加"
   )
   private int expReward;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "物品",
      count = 2
   )
   private List<ResourceModel> items = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getIconId() {
      return this.iconId;
   }

   public void setIconId(int iconId) {
      this.checkModify();
      this.iconId = iconId;
   }

   public List<ResourceModel> getSacrifices() {
      return this.sacrifices;
   }

   public void setSacrifices(List<ResourceModel> sacrifices) {
      this.checkModify();
      this.sacrifices = sacrifices;
   }

   public int getExpReward() {
      return this.expReward;
   }

   public void setExpReward(int expReward) {
      this.checkModify();
      this.expReward = expReward;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }
}
