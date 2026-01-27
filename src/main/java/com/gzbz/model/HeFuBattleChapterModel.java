package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "HefuBattleChapters"
)
public class HeFuBattleChapterModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "章节id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "地图宽"
   )
   private int mapw;
   @ModelColumnAnno(
      comment = "地图高"
   )
   private int maph;
   @ModelColumnAnno(
      comment = "初始军团站位"
   )
   private String bornPoint;
   @ModelColumnAnno(
      comment = "守军军团站位点"
   )
   private String defPoint;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getMapw() {
      return this.mapw;
   }

   public void setMapw(int mapw) {
      this.checkModify();
      this.mapw = mapw;
   }

   public int getMaph() {
      return this.maph;
   }

   public void setMaph(int maph) {
      this.checkModify();
      this.maph = maph;
   }

   public String getBornPoint() {
      return this.bornPoint;
   }

   public void setBornPoint(String bornPoint) {
      this.checkModify();
      this.bornPoint = bornPoint;
   }

   public String getDefPoint() {
      return this.defPoint;
   }

   public void setDefPoint(String defPoint) {
      this.checkModify();
      this.defPoint = defPoint;
   }
}
