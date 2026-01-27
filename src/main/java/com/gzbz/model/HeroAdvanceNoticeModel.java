package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroAdvanceNotice"
)
public class HeroAdvanceNoticeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "开启时间"
   )
   private String opentime;
   @ModelColumnAnno(
      comment = "持续时间"
   )
   private int duration;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getOpentime() {
      return this.opentime;
   }

   public void setOpentime(String opentime) {
      this.checkModify();
      this.opentime = opentime;
   }

   public int getDuration() {
      return this.duration;
   }

   public void setDuration(int duration) {
      this.checkModify();
      this.duration = duration;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
