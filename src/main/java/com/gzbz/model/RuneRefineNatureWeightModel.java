package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "RuneRefineNatureWeight"
)
public class RuneRefineNatureWeightModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "洗炼等级"
   )
   private int refineLv;
   @ModelColumnAnno(
      columnName = "refineWeight",
      columnConvertType = 1,
      subCls = KeyValFun.class,
      comment = "品质权重"
   )
   private List<KeyValFun> refineWeight = new ArrayList();

   public int getRefineLv() {
      return this.refineLv;
   }

   public void setRefineLv(int refineLv) {
      this.checkModify();
      this.refineLv = refineLv;
   }

   public List<KeyValFun> getRefineWeight() {
      return this.refineWeight;
   }

   public void setRefineWeight(List<KeyValFun> refineWeight) {
      this.checkModify();
      this.refineWeight = refineWeight;
   }
}
