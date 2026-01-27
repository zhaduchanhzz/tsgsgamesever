package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GodBeastNeiDanLevel"
)
public class GodBeastNeiDanLevelModel extends BaseModel {
   @ModelColumnAnno(
      comment = "等级",
      isPrimaty = true
   )
   private int lv;
   @ModelColumnAnno(
      comment = "升到下一级需要的经验"
   )
   private int exp;
   @ModelColumnAnno(
      comment = "等级对应的已获得经验"
   )
   private int getEX;
   @ModelColumnAnno(
      comment = "当前解锁的副内丹槽位"
   )
   private int deputySlot;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "每提升一级基础属性"
   )
   private List<PropertyModel> baseAttAdd = new ArrayList();

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

   public int getGetEX() {
      return this.getEX;
   }

   public void setGetEX(int getEX) {
      this.checkModify();
      this.getEX = getEX;
   }

   public int getDeputySlot() {
      return this.deputySlot;
   }

   public void setDeputySlot(int deputySlot) {
      this.checkModify();
      this.deputySlot = deputySlot;
   }

   public List<PropertyModel> getBaseAttAdd() {
      return this.baseAttAdd;
   }

   public void setBaseAttAdd(List<PropertyModel> baseAttAdd) {
      this.checkModify();
      this.baseAttAdd = baseAttAdd;
   }
}
