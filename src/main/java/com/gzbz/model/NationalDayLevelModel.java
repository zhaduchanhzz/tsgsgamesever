package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "guoqingTask"
)
public class NationalDayLevelModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "musicID"
   )
   private int musicId;
   @ModelColumnAnno(
      columnName = "Point"
   )
   private int point;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 4
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getPoint() {
      return this.point;
   }

   public void setPoint(int point) {
      this.checkModify();
      this.point = point;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setReward(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getMusicId() {
      return this.musicId;
   }

   public void setMusicId(int musicId) {
      this.checkModify();
      this.musicId = musicId;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.rewards = rewards;
   }
}
