package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "demonWarCityReward"
)
public class DemonStrikesCityRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno
   private int type;
   @ModelColumnAnno(
      columnName = "receivedtime"
   )
   private int receivedTime;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "占领收益"
   )
   private List<ResourceModel> gains = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getReceivedTime() {
      return this.receivedTime * 3600;
   }

   public void setReceivedTime(int receivedTime) {
      this.checkModify();
      this.receivedTime = receivedTime;
   }

   public List<ResourceModel> getGains() {
      return this.gains;
   }

   public void setGains(List<ResourceModel> gains) {
      this.checkModify();
      this.gains = gains;
   }
}
