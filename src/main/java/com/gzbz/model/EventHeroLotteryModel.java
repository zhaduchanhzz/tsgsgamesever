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
   file = "eventHeroLottery"
)
public class EventHeroLotteryModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "主题id"
   )
   private int mainId;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 2,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      comment = "前置次数"
   )
   private int preposeNum;
   @ModelColumnAnno(
      comment = "必得次数"
   )
   private int mustNum;
   @ModelColumnAnno(
      comment = "物品剩余次数"
   )
   private int surplusNum;
   @ModelColumnAnno(
      comment = "实际权重"
   )
   private int weight;
   @ModelColumnAnno(
      comment = "替换奖品"
   )
   private int swapId;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<EventHeroLotteryModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         EventHeroLotteryModel model = (EventHeroLotteryModel)entry.getValue();
         ((List)tempMap.computeIfAbsent(model.getMainId(), (k) -> new ArrayList())).add(model);
      }

      pool.putMap("customEventHeroLottery", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getMainId() {
      return this.mainId;
   }

   public void setMainId(int mainId) {
      this.checkModify();
      this.mainId = mainId;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public int getPreposeNum() {
      return this.preposeNum;
   }

   public void setPreposeNum(int preposeNum) {
      this.checkModify();
      this.preposeNum = preposeNum;
   }

   public int getMustNum() {
      return this.mustNum;
   }

   public void setMustNum(int mustNum) {
      this.checkModify();
      this.mustNum = mustNum;
   }

   public int getSurplusNum() {
      return this.surplusNum;
   }

   public void setSurplusNum(int surplusNum) {
      this.checkModify();
      this.surplusNum = surplusNum;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public int getSwapId() {
      return this.swapId;
   }

   public void setSwapId(int swapId) {
      this.checkModify();
      this.swapId = swapId;
   }
}
