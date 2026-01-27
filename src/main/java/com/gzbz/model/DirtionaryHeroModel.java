package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "dictionaryHero"
)
public class DirtionaryHeroModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "heroId",
      isPrimaty = true,
      comment = "武将id"
   )
   private int heroId;
   @ModelColumnAnno(
      comment = "优先级"
   )
   private int priority;
   @ModelColumnAnno(
      columnConvertType = 2,
      comment = "额外星级"
   )
   private List<Integer> exStar;
   @ModelColumnAnno(
      comment = "是否在图鉴中展示"
   )
   private int isShow;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "列传描述"
   )
   private String desc;

   public int getHeroId() {
      return this.heroId;
   }

   public void setHeroId(int heroId) {
      this.checkModify();
      this.heroId = heroId;
   }

   public int getPriority() {
      return this.priority;
   }

   public void setPriority(int priority) {
      this.checkModify();
      this.priority = priority;
   }

   public List<Integer> getExStar() {
      return this.exStar;
   }

   public void setExStar(List<Integer> exStar) {
      this.checkModify();
      this.exStar = exStar;
   }

   public int getIsShow() {
      return this.isShow;
   }

   public void setIsShow(int isShow) {
      this.checkModify();
      this.isShow = isShow;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
