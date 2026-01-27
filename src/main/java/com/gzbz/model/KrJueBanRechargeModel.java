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
   file = "krJueBanRecharge"
)
public class KrJueBanRechargeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "系统id"
   )
   private int systemId;
   @ModelColumnAnno(
      comment = "第几天"
   )
   private int day;
   @ModelColumnAnno(
      comment = "充值类型"
   )
   private int rechargeType;
   @ModelColumnAnno(
      comment = "购买后激活"
   )
   private int activation;
   @ModelColumnAnno(
      comment = "礼包id"
   )
   private int giftId;
   @ModelColumnAnno(
      columnName = "loginItems",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 4,
      comment = "登录奖励"
   )
   private final List<ResourceModel> loginItems = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<KrJueBanRechargeModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         KrJueBanRechargeModel model = (KrJueBanRechargeModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.systemId, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customKrJueBanRecharge", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public int getSystemId() {
      return this.systemId;
   }

   public int getDay() {
      return this.day;
   }

   public int getRechargeType() {
      return this.rechargeType;
   }

   public int getGiftId() {
      return this.giftId;
   }

   public List<ResourceModel> getLoginItems() {
      return this.loginItems;
   }

   public int getActivation() {
      return this.activation;
   }
}
