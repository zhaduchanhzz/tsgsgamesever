package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DecisiveWarriorsProperty"
)
public class DecisiveWarriorsPropertyModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "属性"
   )
   private String properties;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "属性评分"
   )
   private List<Integer> propertiesScore = new ArrayList();
   @ModelColumnAnno(
      comment = "百分比属性"
   )
   private String percentProperties;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "百分比属性评分"
   )
   private List<Integer> percentPropertiesScore = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getProperties() {
      return this.properties;
   }

   public void setProperties(String properties) {
      this.checkModify();
      this.properties = properties;
   }

   public String getPercentProperties() {
      return this.percentProperties;
   }

   public void setPercentProperties(String percentProperties) {
      this.checkModify();
      this.percentProperties = percentProperties;
   }

   public List<Integer> getPropertiesScore() {
      return this.propertiesScore;
   }

   public void setPropertiesScore(List<Integer> propertiesScore) {
      this.checkModify();
      this.propertiesScore = propertiesScore;
   }

   public List<Integer> getPercentPropertiesScore() {
      return this.percentPropertiesScore;
   }

   public void setPercentPropertiesScore(List<Integer> percentPropertiesScore) {
      this.checkModify();
      this.percentPropertiesScore = percentPropertiesScore;
   }
}
