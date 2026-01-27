package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "unionActive"
)
public class UnionActiveModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "level",
      isPrimaty = true,
      comment = "军团活跃等级"
   )
   private int level;
   @ModelColumnAnno(
      columnName = "itemId",
      comment = "消耗物品id"
   )
   private int itemId;
   @ModelColumnAnno(
      columnName = "needNum",
      comment = "消耗物品数量"
   )
   private int needNum;
   @ModelColumnAnno(
      columnName = "upgradeRewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "升级奖励物品"
   )
   private List<ResourceModel> upgradeRewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "properties",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2,
      comment = "属性加成"
   )
   private List<PropertyModel> properties = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }

   public int getNeedNum() {
      return this.needNum;
   }

   public void setNeedNum(int needNum) {
      this.checkModify();
      this.needNum = needNum;
   }

   public List<ResourceModel> getUpgradeRewards() {
      return this.upgradeRewards;
   }

   public void setUpgradeRewards(List<ResourceModel> upgradeRewards) {
      this.checkModify();
      this.upgradeRewards = upgradeRewards;
   }

   public List<PropertyModel> getProperties() {
      return this.properties;
   }

   public void setProperties(List<PropertyModel> properties) {
      this.checkModify();
      this.properties = properties;
   }
}
