package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "wudaoHuafen"
)
public class WuDaoGroupModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "渠道"
   )
   private String qudao;
   @ModelColumnAnno(
      comment = "战区最大数量"
   )
   private int maxZhanqu;
   @ModelColumnAnno(
      comment = "战区最少数量"
   )
   private int minZhanqu;
   @ModelColumnAnno(
      comment = "期望人数"
   )
   private int num;

   public String getQudao() {
      return this.qudao;
   }

   public void setQudao(String qudao) {
      this.checkModify();
      this.qudao = qudao;
   }

   public int getMaxZhanqu() {
      return this.maxZhanqu;
   }

   public void setMaxZhanqu(int maxZhanqu) {
      this.checkModify();
      this.maxZhanqu = maxZhanqu;
   }

   public int getMinZhanqu() {
      return this.minZhanqu;
   }

   public void setMinZhanqu(int minZhanqu) {
      this.checkModify();
      this.minZhanqu = minZhanqu;
   }

   public int getNum() {
      return this.num;
   }

   public void setNum(int num) {
      this.checkModify();
      this.num = num;
   }
}
