package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "stonehengeReward"
)
public class StonehengeRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "副本类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "事件类型"
   )
   private int event;
   @ModelColumnAnno(
      comment = "额外事件类型"
   )
   private int event1;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private final List<ResourceModel> reward = new ArrayList();

   public int getId() {
      return this.id;
   }

   public int getType() {
      return this.type;
   }

   public int getEvent() {
      return this.event;
   }

   public List<ResourceModel> getRewards() {
      return this.reward;
   }

   public boolean checkCon(int hard, int event, int event1) {
      return this.type == hard && this.event == event && (event1 == 0 || this.event1 == event1);
   }
}
