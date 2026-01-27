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
   file = "savageInvade"
)
public class SavageInvadeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "伤害最小值"
   )
   private int minHurt;
   @ModelColumnAnno(
      comment = "伤害最大值"
   )
   private int maxHurt;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, SavageInvadeModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         SavageInvadeModel model = (SavageInvadeModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.type, (v) -> new TreeMap())).put(model.id, model);
      }

      pool.putMap("customSavageInvade", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getMinHurt() {
      return this.minHurt;
   }

   public void setMinHurt(int minHurt) {
      this.checkModify();
      this.minHurt = minHurt;
   }

   public int getMaxHurt() {
      return this.maxHurt;
   }

   public void setMaxHurt(int maxHurt) {
      this.checkModify();
      this.maxHurt = maxHurt;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
