package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import misc.MapUtil;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "popupPackage"
)
public class PopupPackageModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "礼包属性"
   )
   private int type;
   @ModelColumnAnno(
      comment = "礼包名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "礼包数量"
   )
   private int num;
   @ModelColumnAnno(
      comment = "剩余时间"
   )
   private int timeLeft;
   @ModelColumnAnno(
      comment = "触发限制"
   )
   private int triggerLimit;
   @ModelColumnAnno(
      columnName = "istrigger",
      comment = "是否触发"
   )
   private int isTrigger;
   @ModelColumnAnno(
      comment = "触发次数"
   )
   private int numberOfTriggers;
   @ModelColumnAnno(
      comment = "全部购买后当日触发限制次数"
   )
   private int buyAllTriggerTimes;
   @ModelColumnAnno(
      comment = "礼包类型"
   )
   private int giftType;
   @ModelColumnAnno(
      comment = "触发条件",
      columnConvertType = 1,
      subCls = KeyValFun.class,
      count = 6
   )
   private List<KeyValFun> conditions = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Integer> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         PopupPackageModel model = (PopupPackageModel)entry.getValue();

         for(KeyValFun condition : model.getConditions()) {
            int maxCount = (Integer)MapUtil.getOrDefault(tempHashMap, condition.getKey(), 0);
            if (condition.getVal() > maxCount) {
               tempHashMap.put(condition.getKey(), condition.getVal());
            }
         }
      }

      pool.putMap("customPopupPackageConditionMax", tempHashMap);
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getNum() {
      return this.num;
   }

   public void setNum(int num) {
      this.checkModify();
      this.num = num;
   }

   public int getTimeLeft() {
      return this.timeLeft;
   }

   public void setTimeLeft(int timeLeft) {
      this.checkModify();
      this.timeLeft = timeLeft;
   }

   public int getTriggerLimit() {
      return this.triggerLimit;
   }

   public void setTriggerLimit(int triggerLimit) {
      this.checkModify();
      this.triggerLimit = triggerLimit;
   }

   public int getNumberOfTriggers() {
      return this.numberOfTriggers;
   }

   public void setNumberOfTriggers(int numberOfTriggers) {
      this.checkModify();
      this.numberOfTriggers = numberOfTriggers;
   }

   public int getGiftType() {
      return this.giftType;
   }

   public void setGiftType(int giftType) {
      this.checkModify();
      this.giftType = giftType;
   }

   public int getBuyAllTriggerTimes() {
      return this.buyAllTriggerTimes;
   }

   public void setBuyAllTriggerTimes(int buyAllTriggerTimes) {
      this.checkModify();
      this.buyAllTriggerTimes = buyAllTriggerTimes;
   }

   public List<KeyValFun> getConditions() {
      return this.conditions;
   }

   public void setConditions(List<KeyValFun> conditions) {
      this.checkModify();
      this.conditions = conditions;
   }

   public int getIsTrigger() {
      return this.isTrigger;
   }

   public void setIsTrigger(int isTrigger) {
      this.checkModify();
      this.isTrigger = isTrigger;
   }
}
