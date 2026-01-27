package com.gzbz.util;

import com.gzbz.model.GameModelPool;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import misc.DateUtil;
import org.springframework.util.StringUtils;

public class HolidaysLoader {
   private static final List<String> HOLIDAYS = new ArrayList();

   public static boolean isHolidayToday() {
      String today = DateUtil.format(Calendar.getInstance().getTime(), "yyyy-MM-dd");
      return HOLIDAYS.stream().anyMatch((holidayToday) -> holidayToday.trim().equals(today));
   }

   public static void load(String path) {
      HOLIDAYS.clear();
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);

      try {
         FileInputStream is = new FileInputStream(path);
         BufferedReader reader = new BufferedReader(new InputStreamReader(is, "utf-8"));

         String line;
         while((line = reader.readLine()) != null) {
            if (!StringUtils.isEmpty(line)) {
               HOLIDAYS.add(line);
            }
         }

         reader.close();
         is.close();
         gameModelPool.systemOperationLog("节假日配置加载成功!", System.currentTimeMillis());
      } catch (Exception e) {
         e.printStackTrace();
         gameModelPool.systemOperationLog("节假日配置加载失败!", System.currentTimeMillis());
      }

   }
}
