package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "CargoShipRandomTime"
)
public class CargoShipRandomTimeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "减少时间"
   )
   private int speedUpTime;
   @ModelColumnAnno(
      comment = "效果描述"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getSpeedUpTime() {
      return this.speedUpTime;
   }

   public void setSpeedUpTime(int speedUpTime) {
      this.checkModify();
      this.speedUpTime = speedUpTime;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }
}
