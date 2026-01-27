package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ZhongqiuMoonCake"
)
public class MidAutumnMoonCakeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      columnName = "moncake",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "月饼"
   )
   private List<ResourceModel> moonCake = new ArrayList();
   @ModelColumnAnno(
      columnName = "mateerialId",
      columnConvertType = 4,
      subCls = Integer.class,
      count = 4,
      comment = "材料"
   )
   private List<Integer> resIds = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<ResourceModel> getMoonCake() {
      return this.moonCake;
   }

   public void setMoonCake(List<ResourceModel> moonCake) {
      this.checkModify();
      this.moonCake = moonCake;
   }

   public List<Integer> getResIds() {
      return this.resIds;
   }

   public void setResIds(List<Integer> resIds) {
      this.checkModify();
      this.resIds = resIds;
   }
}
