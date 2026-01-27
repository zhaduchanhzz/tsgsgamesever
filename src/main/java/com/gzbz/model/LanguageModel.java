package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "language"
)
public class LanguageModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "key",
      isPrimaty = true,
      comment = "名称"
   )
   private String key;
   @ModelColumnAnno(
      columnName = "value",
      comment = "语言"
   )
   private String value;

   public String getKey() {
      return this.key;
   }

   public void setKey(String key) {
      this.checkModify();
      this.key = key;
   }

   public String getValue() {
      return this.value;
   }

   public void setValue(String value) {
      this.checkModify();
      this.value = value;
   }
}
