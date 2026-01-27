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
   file = "HefuSignAward"
)
public class HefuSignAwardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "签到类型 1:每天登录的奖励  2:累计登录N天的奖励(对应day字段)"
   )
   private int signType;
   @ModelColumnAnno(
      comment = "天数"
   )
   private int day;
   @ModelColumnAnno(
      comment = "奖励列表",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 4
   )
   private List<ResourceModel> rewards = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, HefuSignAwardModel>> signType_day_model = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         HefuSignAwardModel value = (HefuSignAwardModel)entry.getValue();
         ((ConcurrentHashMap)signType_day_model.computeIfAbsent(value.getSignType(), (k) -> new ConcurrentHashMap())).computeIfAbsent(value.getDay(), (v) -> value);
      }

      pool.putMap("CustomHefuSignAward", signType_day_model);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getSignType() {
      return this.signType;
   }

   public void setSignType(int signType) {
      this.checkModify();
      this.signType = signType;
   }

   public int getDay() {
      return this.day;
   }

   public void setDay(int day) {
      this.checkModify();
      this.day = day;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
