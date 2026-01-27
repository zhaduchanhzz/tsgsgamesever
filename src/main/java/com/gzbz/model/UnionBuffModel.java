package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "unionBuff"
)
public class UnionBuffModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "buffLevel",
      isPrimaty = true,
      comment = "联盟敌将buff等级"
   )
   private int buffLevel;
   @ModelColumnAnno(
      columnName = "upgrade",
      comment = "升级消耗元宝"
   )
   private int upgrade;
   @ModelColumnAnno(
      columnName = "properties",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1,
      comment = "属性加成"
   )
   private List<PropertyModel> properties = new ArrayList();
   @ModelColumnAnno(
      columnName = "addTime",
      comment = "延迟buff时间"
   )
   private int addTime;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getBuffLevel() {
      return this.buffLevel;
   }

   public void setBuffLevel(int buffLevel) {
      this.checkModify();
      this.buffLevel = buffLevel;
   }

   public int getUpgrade() {
      return this.upgrade;
   }

   public void setUpgrade(int upgrade) {
      this.checkModify();
      this.upgrade = upgrade;
   }

   public List<PropertyModel> getProperties() {
      return this.properties;
   }

   public void setProperties(List<PropertyModel> properties) {
      this.checkModify();
      this.properties = properties;
   }

   public int getAddTime() {
      return this.addTime;
   }

   public void setAddTime(int addTime) {
      this.checkModify();
      this.addTime = addTime;
   }
}
