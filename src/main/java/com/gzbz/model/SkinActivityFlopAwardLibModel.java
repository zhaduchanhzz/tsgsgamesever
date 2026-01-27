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
   file = "skinActivityFlopAwardLib"
)
public class SkinActivityFlopAwardLibModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "libId",
      comment = "奖励库Id"
   )
   private int libId;
   @ModelColumnAnno(
      columnName = "award",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "奖励道具"
   )
   private List<ResourceModel> award = new ArrayList();
   @ModelColumnAnno(
      columnName = "weight",
      comment = "权重"
   )
   private int weight;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getLibId() {
      return this.libId;
   }

   public void setLibId(int libId) {
      this.checkModify();
      this.libId = libId;
   }

   public List<ResourceModel> getAward() {
      return this.award;
   }

   public void setAward(List<ResourceModel> award) {
      this.checkModify();
      this.award = award;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<SkinActivityFlopAwardLibModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         SkinActivityFlopAwardLibModel model = (SkinActivityFlopAwardLibModel)entry.getValue();
         if (tempMap.containsKey(model.getLibId())) {
            ((List)tempMap.get(model.getLibId())).add(model);
         } else {
            List<SkinActivityFlopAwardLibModel> list = new ArrayList();
            list.add(model);
            tempMap.put(model.getLibId(), list);
         }
      }

      pool.putMap("customSkinActivityFlopAwardLib", tempMap);
   }
}
