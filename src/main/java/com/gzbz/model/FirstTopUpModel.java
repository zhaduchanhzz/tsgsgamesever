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
   file = "firstTopUp"
)
public class FirstTopUpModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "礼包ID"
   )
   private int firstTopUpId;
   @ModelColumnAnno(
      comment = "礼包类型"
   )
   private int firstTopUpType;
   @ModelColumnAnno(
      comment = "需要充值金额"
   )
   private int needTopUp;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "开放领取时间"
   )
   private int datetime;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, FirstTopUpModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         FirstTopUpModel model = (FirstTopUpModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.firstTopUpType, (v) -> new TreeMap())).put(model.datetime, model);
      }

      pool.putMap("customFirstTopUp", tempHashMap);
   }

   public int getFirstTopUpId() {
      return this.firstTopUpId;
   }

   public void setFirstTopUpId(int firstTopUpId) {
      this.checkModify();
      this.firstTopUpId = firstTopUpId;
   }

   public int getFirstTopUpType() {
      return this.firstTopUpType;
   }

   public void setFirstTopUpType(int firstTopUpType) {
      this.checkModify();
      this.firstTopUpType = firstTopUpType;
   }

   public int getNeedTopUp() {
      return this.needTopUp;
   }

   public void setNeedTopUp(int needTopUp) {
      this.checkModify();
      this.needTopUp = needTopUp;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getDatetime() {
      return this.datetime;
   }

   public void setDatetime(int datetime) {
      this.checkModify();
      this.datetime = datetime;
   }
}
