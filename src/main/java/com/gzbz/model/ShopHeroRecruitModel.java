package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroRecruitShop"
)
public class ShopHeroRecruitModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "编号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "日期组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "日期组结束"
   )
   private int dateEnd;
   @ModelColumnAnno(
      columnName = "faction",
      comment = "阵营"
   )
   private int faction;
   @ModelColumnAnno(
      columnName = "gains",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "获得"
   )
   private List<ResourceModel> gains = new ArrayList();
   @ModelColumnAnno(
      columnName = "consumes",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "消耗"
   )
   private List<ResourceModel> consumes = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public void setDateStart(int dateStart) {
      this.checkModify();
      this.dateStart = dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public void setDateEnd(int dateEnd) {
      this.checkModify();
      this.dateEnd = dateEnd;
   }

   public int getFaction() {
      return this.faction;
   }

   public void setFaction(int faction) {
      this.checkModify();
      this.faction = faction;
   }

   public List<ResourceModel> getGains() {
      return this.gains;
   }

   public void setGains(List<ResourceModel> gains) {
      this.checkModify();
      this.gains = gains;
   }

   public List<ResourceModel> getConsumes() {
      return this.consumes;
   }

   public void setConsumes(List<ResourceModel> consumes) {
      this.checkModify();
      this.consumes = consumes;
   }
}
