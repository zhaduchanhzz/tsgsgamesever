package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "wudaoCentreAwardid"
)
public class WuDaoCentreAwardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "开启赛季"
   )
   private int season;
   @ModelColumnAnno(
      comment = "最小排名"
   )
   private int minRank;
   @ModelColumnAnno(
      comment = "最大排名"
   )
   private int maxRank;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 2,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> item = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getSeason() {
      return this.season;
   }

   public void setSeason(int season) {
      this.checkModify();
      this.season = season;
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

   public List<ResourceModel> getItem() {
      return this.item;
   }

   public void setItem(List<ResourceModel> item) {
      this.checkModify();
      this.item = item;
   }
}
