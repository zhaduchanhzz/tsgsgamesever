package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "MysticSpeedUp"
)
public class MagicSpeedUpModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "加速价格类型"
   )
   private int speedupType;
   @ModelColumnAnno(
      comment = "加速价格id"
   )
   private int speedupId;
   @ModelColumnAnno(
      comment = "加速价格数量"
   )
   private int speedupNum;
   @ModelColumnAnno(
      comment = "加速进度"
   )
   private int speedupRate;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getSpeedupType() {
      return this.speedupType;
   }

   public void setSpeedupType(int speedupType) {
      this.checkModify();
      this.speedupType = speedupType;
   }

   public int getSpeedupId() {
      return this.speedupId;
   }

   public void setSpeedupId(int speedupId) {
      this.checkModify();
      this.speedupId = speedupId;
   }

   public int getSpeedupNum() {
      return this.speedupNum;
   }

   public void setSpeedupNum(int speedupNum) {
      this.checkModify();
      this.speedupNum = speedupNum;
   }

   public int getSpeedupRate() {
      return this.speedupRate;
   }

   public void setSpeedupRate(int speedupRate) {
      this.checkModify();
      this.speedupRate = speedupRate;
   }
}
