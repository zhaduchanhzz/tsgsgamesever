package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FirstYearTowerChapter"
)
public class FirstYearTowerChapterModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "关卡id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "关卡首通赠送挑战次数"
   )
   private int num;
   @ModelColumnAnno(
      comment = "首通奖励",
      columnConvertType = 3,
      loadFun = "setFirstReward"
   )
   private List<ResourceModel> firstReward;
   @ModelColumnAnno(
      comment = "通关奖励",
      columnConvertType = 3,
      loadFun = "setPassReward"
   )
   private List<ResourceModel> passReward;

   public int getNum() {
      return this.num;
   }

   public List<ResourceModel> getFirstReward() {
      return this.firstReward;
   }

   public void setFirstReward(String firstReward) {
      this.firstReward = ResourceModel.buildResources(firstReward);
   }

   public List<ResourceModel> getPassReward() {
      return this.passReward;
   }

   public void setPassReward(String passReward) {
      this.passReward = ResourceModel.buildResources(passReward);
   }
}
