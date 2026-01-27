package com.gzbz.model.manager;

import com.gzbz.spring.ApplicationContextProvider;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;
import org.apache.commons.lang3.StringUtils;

public abstract class ActivityOpenServerTimeBaseModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "日期组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "日期组末尾"
   )
   private int dateEnd;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      String customExcelName = "";
      ConcurrentHashMap<String, TreeMap<Integer, ActivityOpenServerTimeBaseModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ActivityOpenServerTimeBaseModel model = (ActivityOpenServerTimeBaseModel)entry.getValue();
         if (StringUtils.isEmpty(model.getCustomExcelName())) {
            return;
         }

         if (StringUtils.isEmpty(customExcelName)) {
            customExcelName = model.getCustomExcelName();
         }

         ((TreeMap)tempHashMap.computeIfAbsent(model.formatStartEnd(), (v) -> new TreeMap())).put(model.getId(), model);
      }

      if (!StringUtils.isEmpty(customExcelName)) {
         pool.putMap(customExcelName, tempHashMap);
      }
   }

   public static <V> TreeMap<Integer, V> getModelMap(String customName, int day) {
      Map<String, TreeMap<Integer, V>> map = ApplicationContextProvider.<String, TreeMap<Integer, V>>getModelPoolMap(customName);

      for(Map.Entry<String, TreeMap<Integer, V>> entry : map.entrySet()) {
         String[] split = ((String)entry.getKey()).split("-");
         if (day >= Integer.parseInt(split[0]) && day <= Integer.parseInt(split[1])) {
            return (TreeMap)entry.getValue();
         }
      }

      return new TreeMap();
   }

   public abstract String getCustomExcelName();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public void setDateStart(int dateStart) {
      this.checkModify();
      this.dateStart = dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd <= 0 ? 999999 : this.dateEnd;
   }

   public void setDateEnd(int dateEnd) {
      this.checkModify();
      this.dateEnd = dateEnd;
   }

   public String formatStartEnd() {
      return String.format("%d-%d", this.getDateStart(), this.getDateEnd());
   }
}
