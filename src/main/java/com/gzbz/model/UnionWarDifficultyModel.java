package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "unionWarDifficulty"
)
public class UnionWarDifficultyModel extends BaseModel {
   @ModelColumnAnno(
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "星数"
   )
   private int star;
   @ModelColumnAnno(
      comment = "难度"
   )
   private String tips;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 3,
      comment = "属性"
   )
   private List<PropertyModel> properties = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public String getTips() {
      return this.tips;
   }

   public void setTips(String tips) {
      this.checkModify();
      this.tips = tips;
   }

   public List<PropertyModel> getProperties() {
      return this.properties;
   }

   public void setProperties(List<PropertyModel> properties) {
      this.checkModify();
      this.properties = properties;
   }
}
