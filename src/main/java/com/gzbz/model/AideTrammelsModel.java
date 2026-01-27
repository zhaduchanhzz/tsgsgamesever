package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "aideTrammels"
)
public class AideTrammelsModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "羁绊效果"
   )
   private int id;
   @ModelColumnAnno(
      comment = "归属阵营"
   )
   private int camp;
   @ModelColumnAnno(
      comment = "羁绊关联（同种效果羁绊，高低级之分）"
   )
   private int effect;
   @ModelColumnAnno(
      columnName = "effectQuailty",
      comment = "羁绊品质（1三星低级 2五星高级）"
   )
   private int effectQuality;
   @ModelColumnAnno(
      comment = "解锁条件1"
   )
   private int unlock1;
   @ModelColumnAnno(
      comment = "解锁条件2"
   )
   private int unlock2;
   @ModelColumnAnno(
      comment = "技能id"
   )
   private int skillId;

   public int getId() {
      return this.id;
   }

   public int getCamp() {
      return this.camp;
   }

   public int getUnlock1() {
      return this.unlock1;
   }

   public int getUnlock2() {
      return this.unlock2;
   }

   public int getSkillId() {
      return this.skillId;
   }

   public int getEffect() {
      return this.effect;
   }

   public int getEffectQuality() {
      return this.effectQuality;
   }
}
