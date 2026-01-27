package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "chapterAdventureConfig"
)
public class ChapterAdventureConfigModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "类型id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "freeTimes",
      comment = "免费刷新次数（0点重置）"
   )
   private int freeTimes;
   @ModelColumnAnno(
      columnName = "costs",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "消耗道具"
   )
   private ArrayList<ResourceModel> costs = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "默认任务id"
   )
   private List<Integer> defaultList;
   @ModelColumnAnno(
      columnName = "accelerateCost",
      comment = "每小时需元宝"
   )
   private int accelerateCost;
   @ModelColumnAnno(
      columnName = "accelerateCostMix",
      comment = "加速消耗元宝最小值"
   )
   private int accelerateCostMin;
   @ModelColumnAnno(
      columnName = "accelerateCostMax",
      comment = "加速消耗元宝最大值"
   )
   private int accelerateCostMax;
   @ModelColumnAnno(
      columnName = "flushNumMap",
      columnConvertType = 1,
      subCls = KeyValFun.class,
      count = 2,
      comment = "刷新"
   )
   private Map<Integer, KeyValFun> flushNumMap = new HashMap();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getFreeTimes() {
      return this.freeTimes;
   }

   public void setFreeTimes(int freeTimes) {
      this.checkModify();
      this.freeTimes = freeTimes;
   }

   public ArrayList<ResourceModel> getCosts() {
      return this.costs;
   }

   public void setCosts(ArrayList<ResourceModel> costs) {
      this.checkModify();
      this.costs = costs;
   }

   public List<Integer> getDefaultList() {
      return this.defaultList;
   }

   public void setDefaultList(List<Integer> defaultList) {
      this.checkModify();
      this.defaultList = defaultList;
   }

   public int getAccelerateCost() {
      return this.accelerateCost;
   }

   public void setAccelerateCost(int accelerateCost) {
      this.checkModify();
      this.accelerateCost = accelerateCost;
   }

   public int getAccelerateCostMin() {
      return this.accelerateCostMin;
   }

   public void setAccelerateCostMin(int accelerateCostMin) {
      this.checkModify();
      this.accelerateCostMin = accelerateCostMin;
   }

   public int getAccelerateCostMax() {
      return this.accelerateCostMax;
   }

   public void setAccelerateCostMax(int accelerateCostMax) {
      this.checkModify();
      this.accelerateCostMax = accelerateCostMax;
   }

   public Map<Integer, KeyValFun> getFlushNumMap() {
      return this.flushNumMap;
   }

   public void setFlushNumMap(Map<Integer, KeyValFun> flushNumMap) {
      this.checkModify();
      this.flushNumMap = flushNumMap;
   }
}
