package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "AncientSwordBuff"
)
public class AncientSwordBuffModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "基础属性加成",
      columnConvertType = 1,
      subCls = PropertyModel.class
   )
   private final List<PropertyModel> buffs = new ArrayList();

   public int getId() {
      return this.id;
   }

   public List<PropertyModel> getBuffs() {
      return this.buffs;
   }
}
