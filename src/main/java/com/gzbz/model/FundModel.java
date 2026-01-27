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
   file = "fund"
)
public class FundModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "需求成长等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "基金类型"
   )
   private int fundType;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "物品"
   )
   private List<ResourceModel> items = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<FundModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         FundModel model = (FundModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.fundType, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customFund", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getFundType() {
      return this.fundType;
   }

   public void setFundType(int fundType) {
      this.checkModify();
      this.fundType = fundType;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }
}
