package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Calendar;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "wudaoDate"
)
public class WuDaoDateModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "id",
      comment = "天数"
   )
   private int day;
   @ModelColumnAnno
   private int stage;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeSet<Integer>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         WuDaoDateModel model = (WuDaoDateModel)entry.getValue();
         ((TreeSet)tempHashMap.computeIfAbsent(model.stage, (v) -> new TreeSet())).add(model.day);
      }

      pool.putMap("customWudaoDate", tempHashMap);
   }

   public int getDay() {
      return this.day;
   }

   public void setDay(int day) {
      this.checkModify();
      this.day = day;
   }

   public int getStage() {
      return this.stage;
   }

   public void setStage(int stage) {
      this.checkModify();
      this.stage = stage;
   }

   public static TreeSet<Integer> getStageDays(int stage) {
      Map<Integer, TreeSet<Integer>> stageDayMap = ApplicationContextProvider.<Integer, TreeSet<Integer>>getModelPoolMap("customWudaoDate");
      return stageDayMap != null && !stageDayMap.isEmpty() && stageDayMap.containsKey(stage) ? (TreeSet)stageDayMap.get(stage) : new TreeSet();
   }

   public static long getNextSeasonSettleTime() {
      Calendar calendar = Calendar.getInstance();
      calendar.setFirstDayOfWeek(2);
      calendar.add(2, 1);
      calendar.set(5, 1);
      int week = calendar.get(7);
      if (week != 2) {
         calendar.add(5, 7);
         calendar.set(7, 2);
      }

      String[] timeConfigArr = ApplicationContextProvider.getConfigString("biwutaotaisaitime", "").split("\\|");
      String[] endTimeConfigArr = timeConfigArr[1].split(":");
      calendar.add(5, (Integer)getStageDays(6).last() - 1);
      calendar.set(11, Integer.parseInt(endTimeConfigArr[0]));
      calendar.set(12, Integer.parseInt(endTimeConfigArr[1]));
      calendar.add(12, -1);
      calendar.set(13, 59);
      return calendar.getTimeInMillis();
   }
}
