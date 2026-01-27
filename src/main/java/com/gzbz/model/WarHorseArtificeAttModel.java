package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warHorseArtificeAtt"
)
public class WarHorseArtificeAttModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "property",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 4,
      comment = "属性加成"
   )
   private List<PropertyModel> property = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<PropertyModel> getProperty() {
      return this.property;
   }

   public void setProperty(List<PropertyModel> property) {
      this.checkModify();
      this.property = property;
   }
}
