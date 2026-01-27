package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "unionGate"
)
public class UnionGateModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "奖励池Id"
   )
   private int poorId;
   @ModelColumnAnno(
      columnName = "reward",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "奖励"
   )
   private ArrayList<ResourceModel> reward = new ArrayList();
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, UnionGateModel>> poorId_id_unionGate = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         UnionGateModel value = (UnionGateModel)entry.getValue();
         ((TreeMap)poorId_id_unionGate.computeIfAbsent(value.getPoorId(), (k) -> new TreeMap())).put(value.getId(), value);
      }

      pool.putMap("customUnionGate", poorId_id_unionGate);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getPoorId() {
      return this.poorId;
   }

   public void setPoorId(int poorId) {
      this.checkModify();
      this.poorId = poorId;
   }

   public ArrayList<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(ArrayList<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }
}
