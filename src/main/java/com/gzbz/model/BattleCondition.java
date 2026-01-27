package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "battleCondition"
)
public class BattleCondition extends BaseModel {
   public static final int CONDITION_1 = 1;
   public static final int CONDITION_2 = 2;
   public static final int CONDITION_3 = 3;
   public static final int CONDITION_4 = 4;
   public static final int CONDITION_5 = 5;
   public static final int CONDITION_6 = 6;
   public static final int CONDITION_7 = 7;
   public static final int CONDITION_8 = 8;
   public static final int CONDITION_9 = 9;
   public static final int CONDITION_10 = 10;
   public static final int CONDITION_11 = 11;
   public static final int CONDITION_12 = 12;
   public static final int CONDITION_13 = 13;
   public static final int CONDITION_14 = 14;
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "条件id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "条件类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "条件结果"
   )
   private int value;
   @ModelColumnAnno(
      comment = "额外参数"
   )
   private int extra;
   @ModelColumnAnno(
      comment = "描述"
   )
   private String desc;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getValue() {
      return this.value;
   }

   public void setValue(int value) {
      this.checkModify();
      this.value = value;
   }

   public int getExtra() {
      return this.extra;
   }

   public void setExtra(int extra) {
      this.checkModify();
      this.extra = extra;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
