package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "config"
)
public class ConfigModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "name",
      isPrimaty = true,
      comment = "名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "value",
      comment = "对应值"
   )
   private String value;
   @ModelColumnAnno(
      columnName = "tips",
      comment = "描述"
   )
   private String tips;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "系统备注"
   )
   private String desc;

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public String getValue() {
      return this.value;
   }

   public void setValue(String value) {
      this.checkModify();
      this.value = value;
   }

   public String getTips() {
      return this.tips;
   }

   public void setTips(String tips) {
      this.checkModify();
      this.tips = tips;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
