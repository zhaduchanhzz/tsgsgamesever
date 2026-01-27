package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "guoqingMusic"
)
public class NationalDayMusicModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "ID"
   )
   private int id;
   @ModelColumnAnno(
      comment = "时长"
   )
   private int timeLong;
   @ModelColumnAnno(
      comment = "时间间隔"
   )
   private int timeInterval;
   @ModelColumnAnno(
      comment = "曲目总分"
   )
   private int allScore;
   @ModelColumnAnno(
      columnConvertType = 4,
      subCls = Integer.class,
      count = 4
   )
   private List<Integer> score = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getTimeLong() {
      return this.timeLong;
   }

   public void setTimeLong(int timeLong) {
      this.checkModify();
      this.timeLong = timeLong;
   }

   public int getTimeInterval() {
      return this.timeInterval;
   }

   public void setTimeInterval(int timeInterval) {
      this.checkModify();
      this.timeInterval = timeInterval;
   }

   public int getAllScore() {
      return this.allScore;
   }

   public void setAllScore(int allScore) {
      this.checkModify();
      this.allScore = allScore;
   }

   public List<Integer> getScore() {
      return this.score;
   }

   public void setScore(List<Integer> score) {
      this.checkModify();
      this.score = score;
   }
}
