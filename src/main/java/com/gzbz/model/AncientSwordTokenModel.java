package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "AncientSwordToken"
)
public class AncientSwordTokenModel extends BaseModel {
   @ModelColumnAnno(
      comment = "等级",
      isPrimaty = true
   )
   private int lv;
   @ModelColumnAnno(
      comment = "升到下一级所需积分"
   )
   private int num;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "奖励"
   )
   private final List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "奖励"
   )
   private final List<ResourceModel> lockRewards = new ArrayList();

   public int getLv() {
      return this.lv;
   }

   public int getNum() {
      return this.num;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public List<ResourceModel> getLockRewards() {
      return this.lockRewards;
   }
}
