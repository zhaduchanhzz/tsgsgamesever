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
   file = "cityName"
)
public class CityNameModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "地区名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "归属省份id"
   )
   private int provinceId;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<CityNameModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         CityNameModel cityNameModel = (CityNameModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(cityNameModel.provinceId, (v) -> new ArrayList())).add(cityNameModel);
      }

      pool.putMap("customCityName", tempHashMap);
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

   public int getProvinceId() {
      return this.provinceId;
   }

   public void setProvinceId(int provinceId) {
      this.checkModify();
      this.provinceId = provinceId;
   }
}
