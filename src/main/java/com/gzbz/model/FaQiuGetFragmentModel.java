package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FaQiuGetFragment"
)
public class FaQiuGetFragmentModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      columnName = "haveNum",
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "已获得破解格子碎片数量"
   )
   private final List<Integer> haveNumArray = new ArrayList();
   @ModelColumnAnno(
      comment = "获得未解锁的碎片概率"
   )
   private int weight;

   public int getWeight() {
      return this.weight;
   }

   public boolean numInRegion(int haveNum) {
      return haveNum == 0 && this.haveNumArray.size() == 1 && (Integer)this.haveNumArray.get(0) == 0 || this.haveNumArray.size() == 2 && haveNum >= (Integer)this.haveNumArray.get(0) && haveNum <= (Integer)this.haveNumArray.get(1);
   }
}
