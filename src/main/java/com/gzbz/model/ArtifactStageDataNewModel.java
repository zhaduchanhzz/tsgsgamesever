package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "NewArtifactStageData"
)
public class ArtifactStageDataNewModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "活动id",
      columnName = "id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "抽奖消耗道具",
      columnConvertType = 2,
      subCls = Integer.class,
      count = 3
   )
   private List<Integer> lotteryCost = new ArrayList();

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public List<Integer> getLotteryCost() {
      return this.lotteryCost;
   }

   public void setLotteryCost(List<Integer> lotteryCost) {
      this.checkModify();
      this.lotteryCost = lotteryCost;
   }
}
