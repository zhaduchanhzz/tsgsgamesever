package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "itemProperty"
)
public class ItemPropertyModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "tips",
      comment = "备注"
   )
   private String tips;
   @ModelColumnAnno(
      columnName = "tips2",
      comment = "备注"
   )
   private String tips2;
   @ModelColumnAnno(
      columnName = "point",
      comment = "评分"
   )
   private int point;
   @ModelColumnAnno(
      columnName = "properties",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2,
      comment = "基础属性"
   )
   private List<PropertyModel> properties = new ArrayList();
   @ModelColumnAnno(
      columnName = "suitProperty",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2,
      comment = "套装属性"
   )
   private List<PropertyModel> suitProperty = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getTips() {
      return this.tips;
   }

   public void setTips(String tips) {
      this.checkModify();
      this.tips = tips;
   }

   public String getTips2() {
      return this.tips2;
   }

   public void setTips2(String tips2) {
      this.checkModify();
      this.tips2 = tips2;
   }

   public int getPoint() {
      return this.point;
   }

   public void setPoint(int point) {
      this.checkModify();
      this.point = point;
   }

   public List<PropertyModel> getProperties() {
      return this.properties;
   }

   public void setProperties(List<PropertyModel> properties) {
      this.checkModify();
      this.properties = properties;
   }

   public List<PropertyModel> getSuitProperty() {
      return this.suitProperty;
   }

   public void setSuitProperty(List<PropertyModel> suitProperty) {
      this.checkModify();
      this.suitProperty = suitProperty;
   }
}
