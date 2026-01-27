package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "CargoQuality"
)
public class CargoQualityModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "RefreshTime",
      comment = "刷新次数"
   )
   private int refreshTime;
   @ModelColumnAnno(
      columnName = "weights",
      columnConvertType = 4,
      subCls = Integer.class,
      comment = "品质几率",
      count = 6
   )
   private List<Integer> weights = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getRefreshTime() {
      return this.refreshTime;
   }

   public void setRefreshTime(int refreshTime) {
      this.checkModify();
      this.refreshTime = refreshTime;
   }

   public List<Integer> getWeights() {
      return this.weights;
   }

   public void setWeights(List<Integer> weights) {
      this.checkModify();
      this.weights = weights;
   }
}
