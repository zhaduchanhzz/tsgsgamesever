package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warHLLuckyReward"
)
public class WarHLLuckyRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "描述备注"
   )
   private String desc;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "资源要求"
   )
   private List<ResourceModel> need = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = KeyValFun.class,
      count = 3,
      comment = "倍率与概率"
   )
   private List<KeyValFun> mul = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public List<ResourceModel> getNeed() {
      return this.need;
   }

   public void setNeed(List<ResourceModel> need) {
      this.checkModify();
      this.need = need;
   }

   public List<KeyValFun> getMul() {
      return this.mul;
   }

   public void setMul(List<KeyValFun> mul) {
      this.checkModify();
      this.mul = mul;
   }
}
