package com.gzbz.gameMgr;

import allMgr.AllMgr;
import allMgr.MgrParent;
import allMgr.PartParent;
import com.gzbz.gameCache.GameCachePool;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import scan.ScanAnnotation;

public abstract class GameMgr extends MgrParent {
   private static final int SAVE_TIME = 600000;
   public static Logger logger = LoggerFactory.getLogger(GameMgr.class);
   @Autowired
   protected ConfigurableApplicationContext context;
   @Autowired
   protected GameCachePool gameCachePool;
   private ScheduledFuture<?> saveFuture;

   @PostConstruct
   public void start() throws Exception {
      MgrParent.scanAnnotation = (ScanAnnotation)this.context.getBean("gameServerScan");
      super.allMgr = (AllMgr)this.context.getBean("gameAllMgr");
      super.allMgr.addMgr(this);
      this.wriedPart();

      try {
         this.init();
      } catch (Exception e) {
         this.allMgr.shutdown();
         e.printStackTrace();
         throw e;
      }

      this.startAutoSave();
   }

   public void startAutoSave() {
      if (Objects.isNull(this.saveFuture)) {
         this.saveFuture = this.schedule((long)((double)300000.0F + (double)300000.0F * Math.random()), 600000L, this::save);
      }

   }

   public void stopAutoSave() {
      if (!Objects.isNull(this.saveFuture)) {
         this.saveFuture.cancel(false);
         this.saveFuture = null;
      }
   }

   public synchronized void save() {
      if (!Objects.isNull(this.gameCachePool)) {
         this.gameCachePool.save();
      }
   }

   public void wriedPart() {
      List<Class<?>> listPart = (List)scanAnnotation.partMap.get(this.getClass());
      if (listPart != null) {
         for(Class cls : listPart) {
            try {
               PartParent _part = (PartParent)this.context.getBean(cls);
               if (_part == null) {
                  logger.warn(String.format("%s没有声明成Component"));
               } else {
                  _part.init(this);
                  this._cls2Parts.put(cls, _part);
               }
            } catch (Exception e) {
               logger.error("错误发part:" + cls.getName());
               e.printStackTrace();
            }
         }
      }

   }

   public GameCachePool getGameCachePool() {
      return this.gameCachePool;
   }

   protected abstract void init() throws Exception;

   public void _mainServerMergeBegin() throws Exception {
   }

   public void _slaveServerMergeBegin(int mainServerId) throws Exception {
   }

   public void _mainServerMergeFinish(HashSet<Integer> slaveServerSet) throws Exception {
   }

   public void error(Throwable r) {
   }
}
