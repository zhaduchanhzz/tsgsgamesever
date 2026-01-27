package com.gzbz.spring;

import allMgr.MgrParent;
import allMgr.PartParent;
import com.gzbz.model.ConfigModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.scan.GameServerScan;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider implements ApplicationContextAware {
   private static ApplicationContext applicationContext;
   static Logger logger = LoggerFactory.getLogger(ApplicationContextProvider.class);

   @PostConstruct
   public void init() {
      logger.info("启动-------ApplicationContextProvider");
   }

   public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
      ApplicationContextProvider.applicationContext = applicationContext;
   }

   public static ApplicationContext getContext() {
      return applicationContext;
   }

   public static MgrParent getMgr(Class<MgrParent> mgr) {
      return (MgrParent)getContext().getBean(mgr);
   }

   public static PartParent getPart(Class<MgrParent> mgr, Class<PartParent> part) {
      MgrParent mgrObj = getMgr(mgr);
      return mgrObj == null ? null : (PartParent)mgrObj.getMgrPart(part);
   }

   public static GameModelPool getModelPool() {
      return (GameModelPool)getContext().getBean(GameModelPool.class);
   }

   public static <K, V> V getModelPoolEntity(String modelName, int id) {
      return (V)getModelPool().getEntity(modelName, id);
   }

   public static <K, V> V getModelPoolEntity(String modelName, String id) {
      return (V)getModelPool().getEntity(modelName, id);
   }

   public static <K, V> Map<K, V> getModelPoolMap(String modelName) {
      return getModelPool().getMap(modelName);
   }

   public static GameServerScan getGameScan() {
      return (GameServerScan)getContext().getBean(GameServerScan.class);
   }

   public static int getConfigInt(String key, int defaultValue) {
      ConfigModel configModel = (ConfigModel)getModelPool().getEntity("config", key);
      return configModel == null ? defaultValue : Integer.parseInt(configModel.getValue());
   }

   public static float getConfigFloat(String key, float defaultValue) {
      ConfigModel configModel = (ConfigModel)getModelPool().getEntity("config", key);
      return configModel == null ? defaultValue : Float.parseFloat(configModel.getValue());
   }

   public static long getConfigLong(String key, long defaultValue) {
      ConfigModel configModel = (ConfigModel)getModelPool().getEntity("config", key);
      return configModel == null ? defaultValue : Long.parseLong(configModel.getValue());
   }

   public static String getConfigString(String key, String defaultValue) {
      ConfigModel configModel = (ConfigModel)getModelPool().getEntity("config", key);
      return configModel == null ? defaultValue : configModel.getValue();
   }
}
