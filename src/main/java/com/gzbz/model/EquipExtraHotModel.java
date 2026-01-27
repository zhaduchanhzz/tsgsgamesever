package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "equipExtraHot"
)
public class EquipExtraHotModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "名字"
   )
   private String name;
   @ModelColumnAnno(
      comment = "激活目标",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> hotTarget;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "激活所需道具"
   )
   private List<ResourceModel> hotItem = new ArrayList();
   @ModelColumnAnno(
      comment = "激活所需指定道具id",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> hotSpItem;
   @ModelColumnAnno(
      comment = "激活所需指定道具数量"
   )
   private int hotSpItemNum;

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

   public List<Integer> getHotTarget() {
      return this.hotTarget;
   }

   public void setHotTarget(List<Integer> hotTarget) {
      this.checkModify();
      this.hotTarget = hotTarget;
   }

   public List<ResourceModel> getHotItem() {
      return this.hotItem;
   }

   public void setHotItem(List<ResourceModel> hotItem) {
      this.checkModify();
      this.hotItem = hotItem;
   }

   public List<Integer> getHotSpItem() {
      return this.hotSpItem;
   }

   public void setHotSpItem(List<Integer> hotSpItem) {
      this.checkModify();
      this.hotSpItem = hotSpItem;
   }

   public int getHotSpItemNum() {
      return this.hotSpItemNum;
   }

   public void setHotSpItemNum(int hotSpItemNum) {
      this.checkModify();
      this.hotSpItemNum = hotSpItemNum;
   }
}
