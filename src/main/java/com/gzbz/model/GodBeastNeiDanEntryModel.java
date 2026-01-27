package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "GodBeastNeiDanEntry"
)
public class GodBeastNeiDanEntryModel extends BaseModel {
   @ModelColumnAnno(
      comment = "词条id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "词条类别"
   )
   private int attrUpId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "词条属性"
   )
   private ArrayList<PropertyModel> baseAtt = new ArrayList();
   @ModelColumnAnno(
      comment = "抽取权重"
   )
   private int weight;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, GodBeastNeiDanEntryModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         GodBeastNeiDanEntryModel value = (GodBeastNeiDanEntryModel)entry.getValue();
         ((ConcurrentHashMap)tempMap.computeIfAbsent(value.getAttrUpId(), (k) -> new ConcurrentHashMap())).put(value.getId(), value);
      }

      pool.putMap("customGodBeastNeiDanEntry", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getAttrUpId() {
      return this.attrUpId;
   }

   public void setAttrUpId(int attrUpId) {
      this.checkModify();
      this.attrUpId = attrUpId;
   }

   public ArrayList<PropertyModel> getBaseAtt() {
      return this.baseAtt;
   }

   public void setBaseAtt(ArrayList<PropertyModel> baseAtt) {
      this.checkModify();
      this.baseAtt = baseAtt;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }
}
