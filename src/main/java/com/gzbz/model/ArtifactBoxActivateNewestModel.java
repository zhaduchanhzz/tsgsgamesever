package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ActivityOpenServerTimeBaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ArtifactboxactivateNewest"
)
public class ArtifactBoxActivateNewestModel extends ActivityOpenServerTimeBaseModel {
   @ModelColumnAnno(
      columnName = "activatetime",
      comment = "激活次数"
   )
   private int activateTime;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "宝箱奖励",
      columnName = "boxreward"
   )
   private List<ResourceModel> rewards = new ArrayList();

   public String getCustomExcelName() {
      return "customArtifactboxactivateNewest";
   }

   public int getActivateTime() {
      return this.activateTime;
   }

   public void setActivateTime(int activateTime) {
      this.checkModify();
      this.activateTime = activateTime;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
