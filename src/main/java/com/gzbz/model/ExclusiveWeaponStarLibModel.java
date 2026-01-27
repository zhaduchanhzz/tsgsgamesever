package com.gzbz.model;

import com.gzbz.model.fun.NeedItemsFun2;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ExclusiveWeaponStarLib"
)
public class ExclusiveWeaponStarLibModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "材料组id"
   )
   private int libId;
   @ModelColumnAnno(
      columnName = "needItemsFun",
      columnConvertType = 1,
      subCls = NeedItemsFun2.class,
      comment = "特殊材料"
   )
   private ArrayList<NeedItemsFun2> needItemsFun = new ArrayList();

   public int getLibId() {
      return this.libId;
   }

   public void setLibId(int libId) {
      this.checkModify();
      this.libId = libId;
   }

   public ArrayList<NeedItemsFun2> getNeedItemsFun() {
      return this.needItemsFun;
   }

   public void setNeedItemsFun(ArrayList<NeedItemsFun2> needItemsFun) {
      this.checkModify();
      this.needItemsFun = needItemsFun;
   }
}
