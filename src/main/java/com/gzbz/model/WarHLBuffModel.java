package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warHLBuff"
)
public class WarHLBuffModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id序号"
   )
   private int id;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1,
      comment = "buff"
   )
   private ArrayList<PropertyModel> buffs = new ArrayList();
   @ModelColumnAnno(
      comment = "buff描述"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int pro;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public ArrayList<PropertyModel> getBuffs() {
      return this.buffs;
   }

   public void setBuffs(ArrayList<PropertyModel> buffs) {
      this.checkModify();
      this.buffs = buffs;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getPro() {
      return this.pro;
   }

   public void setPro(int pro) {
      this.checkModify();
      this.pro = pro;
   }
}
