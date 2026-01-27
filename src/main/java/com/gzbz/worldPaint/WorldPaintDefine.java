package com.gzbz.worldPaint;

import com.gzbz.model.WorldPaintFrontModel;
import com.gzbz.model.WorldPaintLevelModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorldPaintDefine {
   private static Logger logger = LoggerFactory.getLogger(WorldPaintDefine.class);
   public static final int INIT_GRADE = 0;
   public static final int INIT_LV = 0;

   public static WorldPaintFrontModel getWorldPaintFrontModel(int type) {
      WorldPaintFrontModel model = (WorldPaintFrontModel)ApplicationContextProvider.getModelPoolEntity("WorldPaintFront", type);
      if (type > 0 && null == model) {
         logger.error("WorldPaintFront配置异常 type:{}", type);
      }

      return model;
   }

   public static WorldPaintLevelModel getWorldPaintLevelModel(int id) {
      WorldPaintLevelModel model = (WorldPaintLevelModel)ApplicationContextProvider.getModelPoolEntity("WorldPaintLevel", id);
      if (null == model && id > 0) {
         logger.error("WorldPaintLevel 配置异常 id:{}", id);
      }

      return model;
   }

   public static WorldPaintLevelModel getWorldPaintLevelModel(int type, int grade, int lv) {
      String key = type + "_" + grade + "_" + lv;
      WorldPaintLevelModel model = (WorldPaintLevelModel)ApplicationContextProvider.getModelPoolEntity("customWorldPaintLevel", key);
      return model;
   }

   public static List<PropertyModel> getAllProList(WorldPaintExtend worldPaintExtend) {
      List<PropertyModel> proList = new ArrayList();
      return null == worldPaintExtend ? proList : getAllProList(worldPaintExtend.worldPaintInfoMap);
   }

   public static List<PropertyModel> getAllProList(Map<Integer, WorldPaintInfo> worldPaintInfoMap) {
      List<PropertyModel> proList = new ArrayList();
      if (null != worldPaintInfoMap && !worldPaintInfoMap.isEmpty()) {
         Map<Integer, WorldPaintInfo> infoMap = new HashMap(worldPaintInfoMap);

         for(Map.Entry<Integer, WorldPaintInfo> entry : infoMap.entrySet()) {
            WorldPaintInfo value = (WorldPaintInfo)entry.getValue();
            WorldPaintLevelModel worldPaintLevelModel = getWorldPaintLevelModel(value.getType(), value.getGrade(), value.getLv());
            if (null != worldPaintLevelModel) {
               proList.addAll(worldPaintLevelModel.getProperties());
               proList.addAll(worldPaintLevelModel.getTopProperties());
            }
         }

         return proList;
      } else {
         return proList;
      }
   }

   public static List<Integer> getWorldPaintUnEffectSys() {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      ArrayList<Integer> worldPaintUneffect = configManager.getIntList("worldPaintUneffect");
      return worldPaintUneffect;
   }
}
