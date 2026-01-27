package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "SanGuoBiAddUpRecharge"
)
public class CoinAddRechargeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "渠道"
   )
   private String channel;
   @ModelColumnAnno(
      comment = "累充金额"
   )
   private int rechargeNum;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 2,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> items = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, Map<Integer, CoinAddRechargeModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         CoinAddRechargeModel model = (CoinAddRechargeModel)entry.getValue();
         ((Map)tempMap.computeIfAbsent(model.getChannel(), (v) -> new TreeMap())).put(model.getRechargeNum(), model);
      }

      pool.putMap("customSanGuoBiAddUpRecharge", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public String getChannel() {
      return this.channel;
   }

   public int getRechargeNum() {
      return this.rechargeNum;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }
}
