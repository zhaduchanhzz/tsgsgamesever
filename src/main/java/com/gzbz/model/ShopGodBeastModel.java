package com.gzbz.model;

import com.gzbz.model.fun.ProbabilityFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import misc.RandomUtil;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "shopGodBeast"
)
public class ShopGodBeastModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "odds",
      columnConvertType = 1,
      subCls = ProbabilityFun.class,
      count = 4,
      comment = "随机"
   )
   private ArrayList<ProbabilityFun> odds = new ArrayList();
   @ModelColumnAnno(
      columnName = "sort",
      comment = "排序"
   )
   private int sort;

   public int getGroupId() {
      int libId = 0;
      int totalProbability = this.odds.stream().mapToInt((probabilityFunx) -> probabilityFunx.getProbability()).sum();
      int tempVal = 0;
      int r = RandomUtil.randInt(totalProbability);

      for(ProbabilityFun probabilityFun : this.odds) {
         tempVal += probabilityFun.getProbability();
         if (tempVal > r) {
            libId = probabilityFun.getVal();
            break;
         }
      }

      return libId;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public ArrayList<ProbabilityFun> getOdds() {
      return this.odds;
   }

   public void setOdds(ArrayList<ProbabilityFun> odds) {
      this.checkModify();
      this.odds = odds;
   }

   public int getSort() {
      return this.sort;
   }

   public void setSort(int sort) {
      this.checkModify();
      this.sort = sort;
   }
}
