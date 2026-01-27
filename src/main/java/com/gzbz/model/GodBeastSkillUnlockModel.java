package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GodBeastSkillUnlock"
)
public class GodBeastSkillUnlockModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "解锁需求星级"
   )
   private int needStar;
   @ModelColumnAnno(
      comment = "解锁需求品质"
   )
   private int needQuality;

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

   public int getNeedStar() {
      return this.needStar;
   }

   public void setNeedStar(int needStar) {
      this.checkModify();
      this.needStar = needStar;
   }

   public int getNeedQuality() {
      return this.needQuality;
   }

   public void setNeedQuality(int needQuality) {
      this.checkModify();
      this.needQuality = needQuality;
   }
}
