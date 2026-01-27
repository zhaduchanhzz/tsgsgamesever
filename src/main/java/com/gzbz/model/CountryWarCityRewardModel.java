package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "countryWarCityReward"
)
public class CountryWarCityRewardModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "奖励ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "type",
      comment = "奖励类型（是否需要？）"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "lasttime",
      comment = "持续时间"
   )
   private int lasttime;
   @ModelColumnAnno(
      columnName = "receivedtime",
      comment = "占领满时间（小时）"
   )
   private int receivedtime;
   @ModelColumnAnno(
      columnName = "gains",
      columnConvertType = 1,
      count = 1,
      subCls = ResourceModel.class,
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

   public int getLasttime() {
      return this.lasttime;
   }

   public void setLasttime(int lasttime) {
      this.checkModify();
      this.lasttime = lasttime;
   }

   public int getReceivedtime() {
      return this.receivedtime;
   }

   public void setReceivedtime(int receivedtime) {
      this.checkModify();
      this.receivedtime = receivedtime;
   }

   public List<ResourceModel> getGains() {
      return this.gains;
   }

   public void setGains(List<ResourceModel> gains) {
      this.checkModify();
      this.gains = gains;
      if (this.gains == null) {
         this.gains = new ArrayList();
      }

   }
}
