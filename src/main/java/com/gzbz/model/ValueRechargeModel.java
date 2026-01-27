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
   file = "ValueRecharge"
)
public class ValueRechargeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "第几天"
   )
   private int day;
   @ModelColumnAnno(
      comment = "需要充值的数量"
   )
   private int rechargeQuantity;
   @ModelColumnAnno(
      columnName = "loginItems",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 4,
      comment = "登录奖励"
   )
   private List<ResourceModel> loginItems = new ArrayList();
   @ModelColumnAnno(
      comment = "不同版本额外奖励"
   )
   private String areanItem;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, ValueRechargeModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ValueRechargeModel model = (ValueRechargeModel)entry.getValue();
         ((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.rechargeQuantity, (v) -> new ConcurrentHashMap())).put(model.day, model);
      }

      pool.putMap("customValueRecharge", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getDay() {
      return this.day;
   }

   public void setDay(int day) {
      this.checkModify();
      this.day = day;
   }

   public int getRechargeQuantity() {
      return this.rechargeQuantity;
   }

   public void setRechargeQuantity(int rechargeQuantity) {
      this.checkModify();
      this.rechargeQuantity = rechargeQuantity;
   }

   public List<ResourceModel> getLoginItems() {
      return this.loginItems;
   }

   public void setLoginItems(List<ResourceModel> loginItems) {
      this.checkModify();
      this.loginItems = loginItems;
   }

   public String getAreanItem() {
      return this.areanItem;
   }

   public void setAreanItem(String areanItem) {
      this.checkModify();
      this.areanItem = areanItem;
   }
}
