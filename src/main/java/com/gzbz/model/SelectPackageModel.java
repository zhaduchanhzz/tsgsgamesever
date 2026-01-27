package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "selectPackage"
)
public class SelectPackageModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "组"
   )
   private int group;
   @ModelColumnAnno(
      comment = "自选类型"
   )
   private String showType;
   @ModelColumnAnno(
      comment = "物品类型",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private ArrayList<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "世界等级"
   )
   private int worldlvLimit;
   @ModelColumnAnno(
      comment = "开启等级"
   )
   private int lvLimit;
   @ModelColumnAnno(
      comment = "强制开启等级"
   )
   private int lvLimitEx;
   @ModelColumnAnno(
      comment = "自选升星武将星级"
   )
   private int star;
   @ModelColumnAnno(
      comment = "开服天数开始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "开服天数结束"
   )
   private int dateEnd;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.checkModify();
      this.group = group;
   }

   public String getShowType() {
      return this.showType;
   }

   public void setShowType(String showType) {
      this.checkModify();
      this.showType = showType;
   }

   public ArrayList<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(ArrayList<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getWorldlvLimit() {
      return this.worldlvLimit;
   }

   public void setWorldlvLimit(int worldlvLimit) {
      this.checkModify();
      this.worldlvLimit = worldlvLimit;
   }

   public int getLvLimit() {
      return this.lvLimit;
   }

   public void setLvLimit(int lvLimit) {
      this.checkModify();
      this.lvLimit = lvLimit;
   }

   public int getLvLimitEx() {
      return this.lvLimitEx;
   }

   public void setLvLimitEx(int lvLimitEx) {
      this.checkModify();
      this.lvLimitEx = lvLimitEx;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
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
}
