package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.HashMap;
import java.util.Map;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "talentLevel"
)
public class TalentLevelModel extends BaseModel {
   @ModelColumnAnno(
      comment = "位置ID(ID不能改)",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "所需武将星级"
   )
   private int star;
   @ModelColumnAnno(
      comment = "所需武将等级"
   )
   private int level;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5,
      comment = "消耗"
   )
   private Map<Integer, ResourceModel> consume = new HashMap();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public Map<Integer, ResourceModel> getConsume() {
      return this.consume;
   }

   public void setConsume(Map<Integer, ResourceModel> consume) {
      this.checkModify();
      this.consume = consume;
   }
}
