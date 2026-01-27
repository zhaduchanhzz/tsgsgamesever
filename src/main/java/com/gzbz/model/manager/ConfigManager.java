package com.gzbz.model.manager;

import com.gzbz.model.ConfigModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn({"gameModelPool"})
public class ConfigManager {
   Logger logger = LoggerFactory.getLogger(ConfigManager.class);
   @Autowired
   private GameModelPool gameModelPool;
   private Map<String, ConfigModel> map = new ConcurrentHashMap();

   public void setMap() {
      this.map = this.gameModelPool.getMap("config");
   }

   public String getStr(String key) {
      this.setMap();
      return !this.map.containsKey(key) ? "" : ((ConfigModel)this.map.get(key)).getValue().trim();
   }

   public String getStrByDefault(String key, String defaultStr) {
      this.setMap();
      return !this.map.containsKey(key) ? defaultStr : ((ConfigModel)this.map.get(key)).getValue().trim();
   }

   public byte getByte(String key) {
      this.setMap();
      if (this.map.get(key) == null) {
         return 0;
      } else {
         Byte value = Byte.parseByte(((ConfigModel)this.map.get(key)).getValue());
         return value == null ? 0 : value;
      }
   }

   public short getShort(String key) {
      this.setMap();
      if (this.map.get(key) == null) {
         return 0;
      } else {
         Short value = Short.parseShort(((ConfigModel)this.map.get(key)).getValue());
         return value == null ? 0 : value;
      }
   }

   public short getShortByDefault(String key, short defaultValue) {
      this.setMap();
      if (this.map.get(key) == null) {
         return defaultValue;
      } else {
         Short value = Short.parseShort(((ConfigModel)this.map.get(key)).getValue());
         return value == null ? defaultValue : value;
      }
   }

   public long getLongByDefault(String key, long defaultValue) {
      this.setMap();
      if (this.map.get(key) == null) {
         return defaultValue;
      } else {
         Long value = Long.parseLong(((ConfigModel)this.map.get(key)).getValue());
         return value == null ? defaultValue : value;
      }
   }

   public int getInt(String key) {
      this.setMap();
      if (this.map.get(key) != null && ((ConfigModel)this.map.get(key)).getValue() != "") {
         Integer value = Integer.parseInt(((ConfigModel)this.map.get(key)).getValue());
         return value == null ? 0 : value;
      } else {
         return 0;
      }
   }

   public ArrayList<Integer> getIntList(String key) {
      this.setMap();
      ArrayList<Integer> list = new ArrayList();
      if (this.map.get(key) != null && ((ConfigModel)this.map.get(key)).getValue() != "") {
         String[] strArray = ((ConfigModel)this.map.get(key)).getValue().split("\\|");

         for(String str : strArray) {
            list.add(Integer.parseInt(str));
         }
      }

      return list;
   }

   public List<ResourceModel> getResourceModelList(String key, String defaultStr) {
      this.setMap();
      List<ResourceModel> resourceModelList = new ArrayList();
      String oneLevelStr = this.getStrByDefault(key, defaultStr);
      String[] oneLevelArray = oneLevelStr.split(",");

      for(String twoLevelStr : oneLevelArray) {
         String[] twoLevelArray = twoLevelStr.split("\\|");
         if (twoLevelArray.length < 3) {
            this.logger.info("不能转换成资源对象,str={}", twoLevelStr);
         } else {
            resourceModelList.add(new ResourceModel(Integer.valueOf(twoLevelArray[0]), Integer.valueOf(twoLevelArray[1]), Integer.valueOf(twoLevelArray[2])));
         }
      }

      return resourceModelList;
   }

   public List<PropertyModel> getPropertyModelList(String key, String defaultStr) {
      this.setMap();
      List<PropertyModel> propertyModelList = new ArrayList();
      String oneLevelStr = this.getStrByDefault(key, defaultStr);
      String[] oneLevelArray = oneLevelStr.split(",");

      for(String twoLevelStr : oneLevelArray) {
         String[] twoLevelArray = twoLevelStr.split("\\|");
         if (twoLevelArray.length < 3) {
            this.logger.info("不能转换成属性对象,str={}", twoLevelStr);
         } else {
            propertyModelList.add(new PropertyModel(Integer.valueOf(twoLevelArray[0]), Integer.valueOf(twoLevelArray[1]), (long)Integer.valueOf(twoLevelArray[2])));
         }
      }

      return propertyModelList;
   }

   public HashMap<Integer, Integer> getIntMap(String key) {
      this.setMap();
      if (this.map.get(key) != null && ((ConfigModel)this.map.get(key)).getValue() != "") {
         HashMap<Integer, Integer> mapValue = new HashMap();
         String[] strArray = ((ConfigModel)this.map.get(key)).getValue().split("\\|");

         for(String str : strArray) {
            String[] cell = str.split(":");
            mapValue.put(Integer.parseInt(cell[0]), Integer.parseInt(cell[1]));
         }

         return mapValue;
      } else {
         return null;
      }
   }

   public TreeMap<Integer, Integer> getIntTreeMap(String key) {
      this.setMap();
      if (this.map.get(key) != null && ((ConfigModel)this.map.get(key)).getValue() != "") {
         TreeMap<Integer, Integer> mapValue = new TreeMap();
         String[] strArray = ((ConfigModel)this.map.get(key)).getValue().split("\\|");

         for(String str : strArray) {
            String[] cell = str.split(":");
            mapValue.put(Integer.parseInt(cell[0]), Integer.parseInt(cell[1]));
         }

         return mapValue;
      } else {
         return null;
      }
   }

   public int getIntDefault(String key, int defaultValue) {
      this.setMap();
      if (this.map.get(key) != null && ((ConfigModel)this.map.get(key)).getValue() != "") {
         Integer value = Integer.parseInt(((ConfigModel)this.map.get(key)).getValue());
         return value == null ? 0 : value;
      } else {
         return defaultValue;
      }
   }

   public byte getByteDefault(String key, byte defaultValue) {
      this.setMap();
      ConfigModel configModel = (ConfigModel)this.map.get(key);
      Byte b = null;
      if (configModel != null && !configModel.getValue().isEmpty()) {
         b = Byte.parseByte(((ConfigModel)this.map.get(key)).getValue());
      }

      return b == null ? defaultValue : b;
   }

   public long getLong(String key) {
      this.setMap();
      if (this.map.get(key) == null) {
         return 0L;
      } else {
         Long value = Long.parseLong(((ConfigModel)this.map.get(key)).getValue());
         return value == null ? 0L : value;
      }
   }

   public double getDouble(String key) {
      this.setMap();
      if (this.map.get(key) == null) {
         return (double)0.0F;
      } else {
         Double value = Double.parseDouble(((ConfigModel)this.map.get(key)).getValue());
         return value == null ? (double)0.0F : value;
      }
   }

   public float getFloat(String key) {
      this.setMap();
      if (this.map.get(key) == null) {
         return 0.0F;
      } else {
         Float value = Float.parseFloat(((ConfigModel)this.map.get(key)).getValue());
         return value == null ? 0.0F : value;
      }
   }

   public float getFloatDefault(String key, float defaultValue) {
      this.setMap();
      if (this.map.get(key) == null) {
         return defaultValue;
      } else {
         Float value = Float.parseFloat(((ConfigModel)this.map.get(key)).getValue());
         return value == null ? defaultValue : value;
      }
   }

   public String parseValue(String key, int index, String split) {
      this.setMap();
      String _str = ((ConfigModel)this.map.get(key)).getValue();
      if (_str != null && _str.length() > 0) {
         String[] _strs = _str.split(split);
         return index >= _strs.length ? null : _strs[index];
      } else {
         return null;
      }
   }
}
