package com.gzbz.util;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import misc.DateUtil;
import misc.JsonUtil;
import misc.RandomUtil;
import org.springframework.util.CollectionUtils;

public class TempUtil {
   public static <T> T getOneForCollection(Collection<T> collection) {
      if (CollectionUtils.isEmpty(collection)) {
         return null;
      } else {
         ArrayList<T> resultList = new ArrayList(collection);
         int index = (new Random()).nextInt(collection.size());
         return (T)resultList.get(index);
      }
   }

   public static <T> List<T> getLotForCollection(Collection<T> collection, int count, boolean repeat) {
      ArrayList<T> resultList = new ArrayList();
      ArrayList<T> cloneList = new ArrayList(collection);

      for(int i = 0; i < count; ++i) {
         if (CollectionUtils.isEmpty(cloneList)) {
            return resultList;
         }

         T one = (T)getOneForCollection(cloneList);
         resultList.add(one);
         if (!repeat) {
            cloneList.remove(one);
         }
      }

      return resultList;
   }

   public static <T> T getOneForMap(Map<T, Integer> randomMap) {
      if (CollectionUtils.isEmpty(randomMap)) {
         return null;
      } else {
         int totalRatio = 0;

         for(Integer value : randomMap.values()) {
            totalRatio += value;
         }

         int interval = 0;
         int ratio = (new Random()).nextInt(totalRatio + 1);

         for(Map.Entry<T, Integer> entry : randomMap.entrySet()) {
            interval += (Integer)entry.getValue();
            if (ratio <= interval) {
               return (T)entry.getKey();
            }
         }

         return (T)getOneForCollection(randomMap.keySet());
      }
   }

   public static <T> List<T> getLotForMap(Map<T, Integer> randomMap, int count, boolean repeat) {
      ArrayList<T> resultList = new ArrayList();
      HashMap<T, Integer> cloneMap = new HashMap(randomMap);

      for(int i = 0; i < count; ++i) {
         if (CollectionUtils.isEmpty(cloneMap)) {
            return resultList;
         }

         T one = (T)getOneForMap(cloneMap);
         resultList.add(one);
         if (!repeat) {
            cloneMap.remove(one);
         }
      }

      return resultList;
   }

   public static boolean judgeWeight(int weight, int... limit) {
      return RandomUtil.randInt(limit.length > 0 ? limit[0] : 100) <= weight;
   }

   public static Map<Integer, List<Integer>> strToIntMapList(String data) {
      Map<Integer, List<Integer>> map = new HashMap();
      Map<Integer, String> jsonToMap = JsonUtil.jsonToMap(data, Integer.class, String.class, HashMap.class);

      for(Map.Entry<Integer, String> entry : jsonToMap.entrySet()) {
         List<Integer> list = JsonUtil.jsonToList((String)entry.getValue(), Integer.class);
         if (list != null) {
            map.put(entry.getKey(), list);
         }
      }

      return map;
   }

   public static int getIntervalDay(int sometime) {
      int interval = DateUtil.difftimeDay(new Timestamp(DateUtil.getSomeDayBeginTime((long)sometime * 1000L))) + 1;
      return interval < 0 ? -interval : interval;
   }

   public static String fixNameForMessageFormat(String nameToFix) {
      String name = nameToFix;
      if (nameToFix.contains("{")) {
         name = nameToFix.replace('{', '(');
      }

      if (name.contains("}")) {
         name = name.replace('}', ')');
      }

      return name;
   }
}
