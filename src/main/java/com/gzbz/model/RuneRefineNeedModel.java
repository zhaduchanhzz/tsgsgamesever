package com.gzbz.model;

import com.gzbz.model.fun.RefineSpCostModel;
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
   file = "RuneRefineNeed"
)
public class RuneRefineNeedModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "洗炼等级"
   )
   private int refineLv;
   @ModelColumnAnno(
      comment = "锁定数"
   )
   private int lockValue;
   @ModelColumnAnno(
      comment = "可选择特殊道具种类数量最大值"
   )
   private int specialNeedMaxKind;
   @ModelColumnAnno(
      columnName = "refineCost",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "洗练普通消耗"
   )
   private List<ResourceModel> refineCost = new ArrayList();
   @ModelColumnAnno(
      columnName = "refineSpCost",
      columnConvertType = 1,
      subCls = RefineSpCostModel.class,
      comment = "洗练品质特殊消耗"
   )
   private Map<Integer, RefineSpCostModel> refineSpCost = new HashMap();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, RuneRefineNeedModel>> allMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         RuneRefineNeedModel value = (RuneRefineNeedModel)entry.getValue();
         Map<Integer, RefineSpCostModel> refineSpCostMap = value.getRefineSpCost();
         Map<Integer, RefineSpCostModel> itemId_modelMap = new HashMap();

         for(Map.Entry<Integer, RefineSpCostModel> id_model : refineSpCostMap.entrySet()) {
            RefineSpCostModel refineSpCostModel = (RefineSpCostModel)id_model.getValue();
            itemId_modelMap.put(refineSpCostModel.getId(), refineSpCostModel);
         }

         value.refineSpCost.clear();
         value.refineSpCost.putAll(itemId_modelMap);
         ((ConcurrentHashMap)allMap.computeIfAbsent(value.getRefineLv(), (k) -> new ConcurrentHashMap())).put(value.getLockValue(), value);
      }

      pool.putMap("customRuneRefineNeed", allMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getRefineLv() {
      return this.refineLv;
   }

   public void setRefineLv(int refineLv) {
      this.checkModify();
      this.refineLv = refineLv;
   }

   public int getLockValue() {
      return this.lockValue;
   }

   public void setLockValue(int lockValue) {
      this.checkModify();
      this.lockValue = lockValue;
   }

   public int getSpecialNeedMaxKind() {
      return this.specialNeedMaxKind;
   }

   public void setSpecialNeedMaxKind(int specialNeedMaxKind) {
      this.checkModify();
      this.specialNeedMaxKind = specialNeedMaxKind;
   }

   public List<ResourceModel> getRefineCost() {
      return this.refineCost;
   }

   public void setRefineCost(List<ResourceModel> refineCost) {
      this.checkModify();
      this.refineCost = refineCost;
   }

   public Map<Integer, RefineSpCostModel> getRefineSpCost() {
      return this.refineSpCost;
   }

   public void setRefineSpCost(Map<Integer, RefineSpCostModel> refineSpCost) {
      this.checkModify();
      this.refineSpCost = refineSpCost;
   }
}
