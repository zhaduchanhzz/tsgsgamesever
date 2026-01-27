package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "dragonWarFirstAward"
)
public class DragonWarFirstAwardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "奖励"
   )
   private List<ResourceModel> firstRwards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<ResourceModel> getFirstREwards() {
      return this.firstRwards;
   }

   public void setFirstREwards(List<ResourceModel> firstREwards) {
      this.checkModify();
      this.firstRwards = firstREwards;
   }
}
