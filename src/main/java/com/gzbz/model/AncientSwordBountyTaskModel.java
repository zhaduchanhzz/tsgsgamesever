package com.gzbz.model;

import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.model.manager.BaseTaskModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "AncientSwordBountyTask"
)
public class AncientSwordBountyTaskModel extends BaseTaskModel {
   @ModelColumnAnno(
      comment = "战斗的buff"
   )
   private int buffId;
   @ModelColumnAnno(
      comment = "完成任务获得的活跃度"
   )
   private int active;

   protected TaskDefine.TaskModule module() {
      return TaskDefine.TaskModule.MODULE_ANCIENT_SWORD_BOUNTY;
   }

   public int getBuffId() {
      return this.buffId;
   }

   public int getActive() {
      return this.active;
   }
}
