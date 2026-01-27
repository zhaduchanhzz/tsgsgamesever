package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "chapterOnlineGift"
)
public class ChapterOnlineGiftModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "奖励id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "times",
      comment = "在线累计时长"
   )
   private int times;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "消耗道具"
   )
   private ArrayList<ResourceModel> rewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getTimes() {
      return this.times;
   }

   public void setTimes(int times) {
      this.checkModify();
      this.times = times;
   }

   public ArrayList<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(ArrayList<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
