package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "stoneCircleBuff"
)
public class StoneCircleBuffModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "groupId"
   )
   private int groupId;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "适用阵营"
   )
   private int camp;
   @ModelColumnAnno(
      columnName = "buffs",
      columnConvertType = 1,
      count = 3,
      subCls = PropertyModel.class,
      comment = "buff"
   )
   private List<PropertyModel> buffs = new ArrayList();
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;

   public int getGroupId() {
      return this.groupId;
   }

   public void setGroupId(int groupId) {
      this.checkModify();
      this.groupId = groupId;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getCamp() {
      return this.camp;
   }

   public void setCamp(int camp) {
      this.checkModify();
      this.camp = camp;
   }

   public List<PropertyModel> getBuffs() {
      return this.buffs;
   }

   public void setBuffs(List<PropertyModel> buffs) {
      this.checkModify();
      this.buffs = buffs;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }
}
