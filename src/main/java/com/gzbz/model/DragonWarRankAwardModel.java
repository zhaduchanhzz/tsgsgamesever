package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "dragonWarRankAward"
)
public class DragonWarRankAwardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "层"
   )
   private int floor;
   @ModelColumnAnno(
      comment = "最小排名"
   )
   private int minRank;
   @ModelColumnAnno(
      comment = "最大排名"
   )
   private int maxRank;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "奖励"
   )
   private List<ResourceModel> items = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getFloor() {
      return this.floor;
   }

   public void setFloor(int floor) {
      this.checkModify();
      this.floor = floor;
   }

   public int getMinRank() {
      return this.minRank;
   }

   public void setMinRank(int minRank) {
      this.checkModify();
      this.minRank = minRank;
   }

   public int getMaxRank() {
      return this.maxRank;
   }

   public void setMaxRank(int maxRank) {
      this.checkModify();
      this.maxRank = maxRank;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }
}
