package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "EquipConsumes"
)
public class EquipConsumesModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "refineLevel"
   )
   private int refineLevel;
   @ModelColumnAnno(
      comment = "消耗材料",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> consumes = new ArrayList();

   public int getRefineLevel() {
      return this.refineLevel;
   }

   public void setRefineLevel(int refineLevel) {
      this.checkModify();
      this.refineLevel = refineLevel;
   }

   public List<ResourceModel> getConsumes() {
      return this.consumes;
   }

   public void setConsumes(List<ResourceModel> consumes) {
      this.checkModify();
      this.consumes = consumes;
   }
}
