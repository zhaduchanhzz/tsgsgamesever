package com.gzbz.model;

import cn.hutool.core.util.StrUtil;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "heroGame"
)
public class ZhuHouEquipModel extends BaseModel {
   @ModelColumnAnno(
      comment = "装备id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "装备类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "装备品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "装备名字"
   )
   private String name;
   private List<ResourceModel> resolve;
   public static Set<Integer> qualitySet = new HashSet();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      qualitySet.clear();
      ConcurrentHashMap<String, ZhuHouEquipModel> tempList = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ZhuHouEquipModel model = (ZhuHouEquipModel)entry.getValue();
         tempList.put(StrUtil.format("{}_{}", new Object[]{model.type, model.quality}), model);
         qualitySet.add(model.quality);
      }

      pool.putMap("customHeroGame", tempList);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.type = type;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.quality = quality;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<ResourceModel> getResolve() {
      return this.resolve;
   }

   public void setResolve(List<ResourceModel> resolve) {
      this.resolve = resolve;
   }
}
