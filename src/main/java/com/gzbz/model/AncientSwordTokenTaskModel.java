package com.gzbz.model;

import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.model.manager.BaseTaskModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "AncientSwordTokenTask"
)
public class AncientSwordTokenTaskModel extends BaseTaskModel {
   @ModelColumnAnno(
      comment = "类型（1每日 2每周 3每四周）"
   )
   private int type;

   protected TaskDefine.TaskModule module() {
      return TaskDefine.TaskModule.MODULE_ANCIENT_SWORD_TOKEN;
   }

   public int getType() {
      return this.type;
   }
}
