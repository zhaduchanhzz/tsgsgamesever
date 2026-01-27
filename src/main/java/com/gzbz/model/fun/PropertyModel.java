package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import com.gzbz.protobuf.CommonMsg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class PropertyModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "type",
      comment = "基础属性"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "way",
      comment = "初始计算方式"
   )
   private int way;
   @ModelColumnAnno(
      columnName = "value",
      comment = "初始值"
   )
   private long value;

   public PropertyModel() {
   }

   public PropertyModel(int type, int way, long value) {
      this.type = type;
      this.way = way;
      this.value = value;
   }

   public CommonMsg.PropertyInfo builder() {
      CommonMsg.PropertyInfo.Builder builder = CommonMsg.PropertyInfo.newBuilder();
      builder.setId(this.type);
      builder.setWay(this.way);
      builder.setValue((double)this.value);
      return builder.build();
   }

   public static void addLvProtities(List<PropertyModel> list, PropertyModel model) {
      if (list == null) {
         list = new ArrayList();
      }

      boolean isSame = false;

      for(PropertyModel propertyModel : list) {
         if (propertyModel.type == model.type && propertyModel.way == model.way) {
            PropertyModel existProperty = propertyModel.clone();
            propertyModel.setValue(existProperty.getValue() + model.value);
            isSame = true;
            break;
         }
      }

      if (!isSame) {
         list.add(model.clone());
      }

   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getWay() {
      return this.way;
   }

   public void setWay(int way) {
      this.checkModify();
      this.way = way;
   }

   public long getValue() {
      return this.value;
   }

   public void setValue(long value) {
      this.checkModify();
      this.value = value;
   }

   public PropertyModel clone() {
      PropertyModel propertyModel = new PropertyModel(this.type, this.way, this.value);
      return propertyModel;
   }

   public CommonMsg.PropertyInfo.Builder recPropertyBuilder() {
      CommonMsg.PropertyInfo.Builder builder = CommonMsg.PropertyInfo.newBuilder();
      builder.setId(this.type);
      builder.setWay(this.way);
      builder.setValue((double)this.value);
      return builder;
   }

   public void add2TypeWayMap(Map<String, Long> typeWay_val) {
      if (null == typeWay_val) {
         typeWay_val = new HashMap();
      }

      String key = this.getType() + "_" + this.getWay();
      Long oldVal = (Long)typeWay_val.getOrDefault(key, 0L);
      typeWay_val.put(key, oldVal + this.getValue());
   }
}
