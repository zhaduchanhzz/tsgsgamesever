package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "zhangFeiReward"
)
public class ZhangFeiRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "物品",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;
   @ModelColumnAnno(
      comment = "必出指定次数"
   )
   private int appearNum;
   @ModelColumnAnno(
      comment = "前置抽取需求次数"
   )
   private int floorNum;
   @ModelColumnAnno(
      comment = "转换序号"
   )
   private int swapId;
   @ModelColumnAnno(
      comment = "开服天数"
   )
   private int openDays;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<ZhangFeiRewardModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ZhangFeiRewardModel model = (ZhangFeiRewardModel)entry.getValue();
         if (model.getType() == 1 && model.getOpenDays() > 0) {
            ((List)tempHashMap.computeIfAbsent(model.getOpenDays(), (v) -> new ArrayList())).add(model);
         }
      }

      pool.putMap("customZhangFeiReward", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getAppearNum() {
      return this.appearNum;
   }

   public void setAppearNum(int appearNum) {
      this.checkModify();
      this.appearNum = appearNum;
   }

   public int getFloorNum() {
      return this.floorNum;
   }

   public void setFloorNum(int floorNum) {
      this.checkModify();
      this.floorNum = floorNum;
   }

   public int getSwapId() {
      return this.swapId;
   }

   public void setSwapId(int swapId) {
      this.checkModify();
      this.swapId = swapId;
   }

   public int getOpenDays() {
      return this.openDays;
   }

   public void setOpenDays(int openDays) {
      this.checkModify();
      this.openDays = openDays;
   }
}
