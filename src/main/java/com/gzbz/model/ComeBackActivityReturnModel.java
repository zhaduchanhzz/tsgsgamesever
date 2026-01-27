package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "comeBackActivityReturn"
)
public class ComeBackActivityReturnModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "抽奖次数"
   )
   private int time;
   @ModelColumnAnno(
      comment = "范围类型"
   )
   private int areaType;
   @ModelColumnAnno(
      comment = "获得道具类型"
   )
   private int itemType;
   @ModelColumnAnno(
      comment = "获得道具id"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "最低可得元宝"
   )
   private int floorGet;
   @ModelColumnAnno(
      comment = "最多可得元宝"
   )
   private int maxGet;
   @ModelColumnAnno(
      comment = "总元宝奖池数量"
   )
   private int allGet;
   @ModelColumnAnno(
      comment = "消耗列表",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> useItem = new ArrayList();

   public int getTime() {
      return this.time;
   }

   public void setTime(int time) {
      this.checkModify();
      this.time = time;
   }

   public int getAreaType() {
      return this.areaType;
   }

   public void setAreaType(int areaType) {
      this.checkModify();
      this.areaType = areaType;
   }

   public int getItemType() {
      return this.itemType;
   }

   public void setItemType(int itemType) {
      this.checkModify();
      this.itemType = itemType;
   }

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }

   public int getFloorGet() {
      return this.floorGet;
   }

   public void setFloorGet(int floorGet) {
      this.checkModify();
      this.floorGet = floorGet;
   }

   public int getMaxGet() {
      return this.maxGet;
   }

   public void setMaxGet(int maxGet) {
      this.checkModify();
      this.maxGet = maxGet;
   }

   public int getAllGet() {
      return this.allGet;
   }

   public void setAllGet(int allGet) {
      this.checkModify();
      this.allGet = allGet;
   }

   public List<ResourceModel> getUseItem() {
      return this.useItem;
   }

   public void setUseItem(List<ResourceModel> useItem) {
      this.checkModify();
      this.useItem = useItem;
   }
}
