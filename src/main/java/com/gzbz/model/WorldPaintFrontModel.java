package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "WorldPaintFront"
)
public class WorldPaintFrontModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "绘卷类型"
   )
   private int id;
   @ModelColumnAnno(
      comment = "前置绘卷"
   )
   private int frontPaint;
   @ModelColumnAnno(
      comment = "前置绘卷阶级"
   )
   private int frontPaintGrade;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getFrontPaint() {
      return this.frontPaint;
   }

   public void setFrontPaint(int frontPaint) {
      this.checkModify();
      this.frontPaint = frontPaint;
   }

   public int getFrontPaintGrade() {
      return this.frontPaintGrade;
   }

   public void setFrontPaintGrade(int frontPaintGrade) {
      this.checkModify();
      this.frontPaintGrade = frontPaintGrade;
   }
}
