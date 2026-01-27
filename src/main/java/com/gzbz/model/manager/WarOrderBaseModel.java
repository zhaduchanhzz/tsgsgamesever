package com.gzbz.model.manager;

import com.gzbz.model.fun.ResourceModel;
import java.util.List;
import model.ModelColumnAnno;

public abstract class WarOrderBaseModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "阶段类型/需要购买礼包"
   )
   private int stageType;

   public abstract List<ResourceModel> rewards();

   public abstract List<ResourceModel> rewards1();

   public int getId() {
      return this.id;
   }

   public int getStageType() {
      return this.stageType;
   }
}
