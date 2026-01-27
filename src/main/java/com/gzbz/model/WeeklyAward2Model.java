package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "weeklyAward2"
)
public class WeeklyAward2Model extends BaseModel {
   @ModelColumnAnno(
      comment = "序号",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "周卡id"
   )
   private int GiftId;
   @ModelColumnAnno(
      comment = "天数"
   )
   private int day;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> item = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, WeeklyAward2Model>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         WeeklyAward2Model model = (WeeklyAward2Model)entry.getValue();
         ((Map)tempMap.computeIfAbsent(model.getGiftId(), (v) -> new HashMap())).put(model.getDay(), model);
      }

      pool.putMap("customWeeklyAward2", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGiftId() {
      return this.GiftId;
   }

   public void setGiftId(int giftId) {
      this.checkModify();
      this.GiftId = giftId;
   }

   public int getDay() {
      return this.day;
   }

   public void setDay(int day) {
      this.checkModify();
      this.day = day;
   }

   public List<ResourceModel> getItem() {
      return this.item;
   }

   public void setItem(List<ResourceModel> item) {
      this.checkModify();
      this.item = item;
   }
}
