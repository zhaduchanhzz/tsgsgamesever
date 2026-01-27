package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
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
   file = "countryWarFlagBasic"
)
public class CountryWarFlagBasicModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "quality"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "lv"
   )
   private int lv;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2,
      comment = "战旗属性"
   )
   private List<PropertyModel> property = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public List<PropertyModel> getProperty() {
      return this.property;
   }

   public void setProperty(List<PropertyModel> property) {
      this.checkModify();
      this.property = property;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, CountryWarFlagBasicModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         CountryWarFlagBasicModel model = (CountryWarFlagBasicModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.quality, (v) -> new HashMap())).put(model.lv, model);
      }

      pool.putMap("customCountryWarFlagBasic", tempHashMap);
   }
}
