package com.gzbz.model;

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
   file = "GodBeastNeiDanBase"
)
public class GodBeastNeiDanBaseModel extends BaseModel {
   @ModelColumnAnno(
      comment = "内丹id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "内丹名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "内丹品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "内丹种类"
   )
   private int typeId;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "词条种类组合"
   )
   private List<Integer> entryId = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom1(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, GodBeastNeiDanBaseModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         GodBeastNeiDanBaseModel value = (GodBeastNeiDanBaseModel)entry.getValue();
         ((ConcurrentHashMap)tempMap.computeIfAbsent(value.getQuality(), (k) -> new ConcurrentHashMap())).put(value.getTypeId(), value);
      }

      pool.putMap("customGodBeastNeiDanBase", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getTypeId() {
      return this.typeId;
   }

   public void setTypeId(int typeId) {
      this.checkModify();
      this.typeId = typeId;
   }

   public List<Integer> getEntryId() {
      return this.entryId;
   }

   public void setEntryId(List<Integer> entryId) {
      this.checkModify();
      this.entryId = entryId;
   }
}
