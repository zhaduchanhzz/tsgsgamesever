package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DragonVeinQuality"
)
public class DragonVeinQualityModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "龙魂值下限"
   )
   private int soulDown;
   @ModelColumnAnno(
      comment = "龙魂值上限"
   )
   private int soulUp;
   @ModelColumnAnno(
      comment = "品质初始权重",
      columnConvertType = 4,
      subCls = Integer.class
   )
   private List<Integer> weight = new ArrayList();
   @ModelColumnAnno(
      comment = "品质权重变化",
      columnConvertType = 4,
      subCls = Integer.class
   )
   private List<Integer> change = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getSoulDown() {
      return this.soulDown;
   }

   public void setSoulDown(int soulDown) {
      this.soulDown = soulDown;
   }

   public int getSoulUp() {
      return this.soulUp;
   }

   public void setSoulUp(int soulUp) {
      this.soulUp = soulUp;
   }

   public List<Integer> getWeight() {
      return this.weight;
   }

   public void setWeight(List<Integer> weight) {
      this.weight = weight;
   }

   public List<Integer> getChange() {
      return this.change;
   }

   public void setChange(List<Integer> change) {
      this.change = change;
   }
}
