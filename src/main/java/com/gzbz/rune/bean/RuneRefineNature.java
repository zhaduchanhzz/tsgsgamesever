package com.gzbz.rune.bean;

import com.gzbz.model.fun.PropertyModel;
import java.io.Serializable;

public class RuneRefineNature implements Serializable {
   private int id;
   private PropertyModel propertyModel;

   public RuneRefineNature() {
   }

   public RuneRefineNature(int id, PropertyModel propertyModel) {
      this.id = id;
      this.propertyModel = propertyModel;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public PropertyModel getPropertyModel() {
      return this.propertyModel;
   }

   public void setPropertyModel(PropertyModel propertyModel) {
      this.propertyModel = propertyModel;
   }
}
