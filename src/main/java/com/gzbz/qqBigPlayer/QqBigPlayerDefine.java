package com.gzbz.qqBigPlayer;

import com.gzbz.model.WanKaLevelModel;
import com.gzbz.model.WanKaPackageModel;
import com.gzbz.model.WanKaPrivilegeModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QqBigPlayerDefine {
   private static Logger logger = LoggerFactory.getLogger(QqBigPlayerDefine.class);
   public static final int GIFT_TYPE_REG = 1;
   public static final int GIFT_TYPE_ACT = 2;
   public static final int GIFT_TYPE_LV = 3;
   public static final int PRIVILEGE_TYPE_1 = 1;
   public static final int PRIVILEGE_TYPE_2 = 2;
   public static final int PRIVILEGE_TYPE_3 = 3;
   public static final int PRIVILEGE_TYPE_4 = 4;
   public static final int PRIVILEGE_TYPE_5 = 5;
   public static final int PRIVILEGE_TYPE_6 = 6;
   public static final int PRIVILEGE_TYPE_7 = 7;
   public static final int PRIVILEGE_TYPE_8 = 8;
   public static final int RECHARGE_EXTRA_NO_LIMIT = -1;
   public static final int WEEK_GIFT_CAN = 0;
   public static final int WEEK_GIFT_HAS = 1;
   public static final int WEEK_GIFT_LOCK = 2;
   public static final Map<Integer, Integer> WAN_KA_LV_DEFINE = new ConcurrentHashMap();

   public static List<ResourceModel> getRegGiftRewards() {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      return configManager.getResourceModelList("wanKaRegGiftReward", "");
   }

   public static boolean checkActGiftRec(long curAct) {
      int wanKaActGiftLimit = ApplicationContextProvider.getConfigInt("wanKaActGiftLimit", 999);
      return curAct >= (long)wanKaActGiftLimit;
   }

   public static List<ResourceModel> getActGiftRewards() {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      return configManager.getResourceModelList("wanKaActGiftReward", "");
   }

   public static boolean isPlatformOpen() {
      String openPlatformStr = ApplicationContextProvider.getConfigString("wanKaOpenPlatform", "");
      if (StringUtils.isBlank(openPlatformStr)) {
         return true;
      } else {
         String[] openPlatforms = openPlatformStr.split("\\|");
         if (openPlatforms.length <= 0) {
            return true;
         } else {
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);

            for(String openPlatform : openPlatforms) {
               if (Objects.equals(worldMgr.PLATFORM_NAME, openPlatform)) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public static WanKaPackageModel getWanKaPackageModel(int level) {
      WanKaPackageModel wankaPackageModel = (WanKaPackageModel)ApplicationContextProvider.getModelPoolEntity("wankaPackage", level);
      if (null == wankaPackageModel) {
         logger.error("WankaPackage 配置为空 level:{}", level);
      }

      return wankaPackageModel;
   }

   public static WanKaPrivilegeModel getWanKaPrivilegeModel(int type, int level) {
      ConcurrentHashMap<Integer, WanKaPrivilegeModel> level_model = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customWanKaPrivilege", type);
      if (null == level_model) {
         logger.error("WanKaPrivilege 配置有误 type:{}", type);
         return null;
      } else {
         WanKaPrivilegeModel wanKaPrivilegeModel = (WanKaPrivilegeModel)level_model.get(level);
         if (null == wanKaPrivilegeModel) {
            logger.error("WanKaPrivilege 配置有误 type:{} level:{}", type, level);
         }

         return wanKaPrivilegeModel;
      }
   }

   public static WanKaLevelModel getWanKaLevelModel(int level) {
      WanKaLevelModel wanKaLevelModel = (WanKaLevelModel)ApplicationContextProvider.getModelPoolEntity("wankaLevel", level);
      if (null == wanKaLevelModel && level > 0) {
         logger.error("WanKaLevel 有误 level:{}", level);
      }

      return wanKaLevelModel;
   }

   public static int getWanKaActTime() {
      int wanKaActTime = ApplicationContextProvider.getConfigInt("wankaActTime", 365);
      return wanKaActTime;
   }

   static {
      WAN_KA_LV_DEFINE.put(0, 0);
      WAN_KA_LV_DEFINE.put(3, 1);
      WAN_KA_LV_DEFINE.put(4, 2);
      WAN_KA_LV_DEFINE.put(1, 3);
      WAN_KA_LV_DEFINE.put(2, 4);
   }
}
