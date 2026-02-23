package com.gzbz.model;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.MapUtil;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "multiplePackages"
)
public class MultiplePackagesModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "名字"
   )
   private String name;
   @ModelColumnAnno(
      comment = "使用类型"
   )
   private int useFuncId;
   @ModelColumnAnno(
      comment = "标签页名字"
   )
   private String showType;
   @ModelColumnAnno(
      comment = "相对应表的物品id"
   )
   private int relativeId;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String desc;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, MultiplePackagesModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         MultiplePackagesModel model = (MultiplePackagesModel)entry.getValue();
         (MapUtil.computeIfAbsent(tempHashMap, model.getUseFuncId(), TreeMap.class)).put(model.getId(), model);
      }

      pool.putMap("customMultiplePackages", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getUseFuncId() {
      return this.useFuncId;
   }

   public void setUseFuncId(int useFuncId) {
      this.useFuncId = useFuncId;
   }

   public String getShowType() {
      return this.showType;
   }

   public void setShowType(String showType) {
      this.showType = showType;
   }

   public int getRelativeId() {
      return this.relativeId;
   }

   public void setRelativeId(int relativeId) {
      this.relativeId = relativeId;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.desc = desc;
   }
}
