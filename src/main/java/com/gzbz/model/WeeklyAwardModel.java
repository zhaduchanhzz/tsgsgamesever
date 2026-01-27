package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "weeklyAward"
)
public class WeeklyAwardModel extends BaseModel {
   @ModelColumnAnno(
      comment = "周卡id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "多奖励"
   )
   private int moreAward;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 7
   )
   private List<ResourceModel> item = new ArrayList();
   @ModelColumnAnno(
      comment = "大标题"
   )
   private String title;
   @ModelColumnAnno(
      comment = "奖励描述"
   )
   private String desc;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getMoreAward() {
      return this.moreAward;
   }

   public void setMoreAward(int moreAward) {
      this.checkModify();
      this.moreAward = moreAward;
   }

   public List<ResourceModel> getItem() {
      return this.item;
   }

   public void setItem(List<ResourceModel> item) {
      this.checkModify();
      this.item = item;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String title) {
      this.checkModify();
      this.title = title;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
