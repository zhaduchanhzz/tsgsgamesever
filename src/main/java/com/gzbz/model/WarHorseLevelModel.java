package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warHorseLevel"
)
public class WarHorseLevelModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "lv",
      isPrimaty = true,
      comment = "等级"
   )
   private int lv;
   @ModelColumnAnno(
      columnName = "exp",
      comment = "升到下一级需要的经验"
   )
   private int exp;
   @ModelColumnAnno(
      columnName = "material",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "升级所需进阶材料"
   )
   private List<ResourceModel> material = new ArrayList();

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getExp() {
      return this.exp;
   }

   public void setExp(int exp) {
      this.checkModify();
      this.exp = exp;
   }

   public List<ResourceModel> getMaterial() {
      return this.material;
   }

   public void setMaterial(List<ResourceModel> material) {
      this.material = material;
   }
}
