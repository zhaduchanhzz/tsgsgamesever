package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warHLEventLib"
)
public class WarHLEventLibModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "事件组id"
   )
   private int id;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = KeyValFun.class,
      count = 6,
      comment = "组与概率"
   )
   private List<KeyValFun> eventLibs = new ArrayList();
   @ModelColumnAnno(
      comment = "描述备注"
   )
   private String desc;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<KeyValFun> getEventLibs() {
      return this.eventLibs;
   }

   public void setEventLibs(List<KeyValFun> eventLibs) {
      this.checkModify();
      this.eventLibs = eventLibs;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
