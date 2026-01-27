package com.gzbz.util;

import allMgr.MgrParent;
import com.gzbz.model.GameModelPool;
import com.gzbz.spring.ApplicationContextProvider;
import com.pp.game.common.hotswap.HotSwapManager;
import com.pp.game.common.hotswap.HotUpdateResult;
import java.io.File;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import misc.ClazzUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HotSwapUtil {
   private static final Logger logger = LoggerFactory.getLogger(HotSwapUtil.class);
   public static final AtomicBoolean UPDATING = new AtomicBoolean(true);
   private static final LinkedBlockingQueue<File> list = new LinkedBlockingQueue();
   private static volatile ScheduledFuture<?> sf;

   public static void hotUpdateCheck(MgrParent mgr, String hotSwapClassPath, String hotSwapJarPath, boolean isOpenServer) {
      if (!isOpenServer && UPDATING.get()) {
         logger.info("热更新初始化中,稍后继续检查...");
      } else if (hotSwapClassPath != null && !"".equals(hotSwapClassPath)) {
         if (hotSwapClassPath.lastIndexOf(File.separator) == hotSwapClassPath.length() - 1) {
            hotSwapClassPath = hotSwapClassPath.substring(0, hotSwapClassPath.length() - 1);
         }

         String hotSwapClassCopyPath = hotSwapClassPath + "Copy";
         if (isOpenServer) {
            hotSwapClassPath = hotSwapClassCopyPath;
         }

         File file = Paths.get(hotSwapClassPath).toFile();
         if (file.exists() && file.isDirectory()) {
            if (((File[])Objects.requireNonNull(file.listFiles())).length != 0) {
               ClazzUtils.trailClassFile(file, list);
               if (!list.isEmpty() && sf == null) {
                  sf = mgr.schedule(0L, 1000L, () -> {
                     File clzFile = (File)list.poll();
                     if (clzFile == null) {
                        if (sf != null) {
                           sf.cancel(true);
                           sf = null;
                           GameModelPool gameModelPool = ApplicationContextProvider.getModelPool();
                           gameModelPool.systemOperationLog("全部热更完毕:", System.currentTimeMillis());
                        }
                     } else if (clzFile.exists()) {
                        try {
                           HotUpdateResult hotUpdateResult = HotSwapManager.getInstance(hotSwapJarPath, hotSwapClassCopyPath).checkHotSwapClasses(clzFile, isOpenServer);
                           logger.info("热更结果:{}", hotUpdateResult.toString());
                           GameModelPool gameModelPool = ApplicationContextProvider.getModelPool();
                           gameModelPool.systemOperationLog("热更结果:" + hotUpdateResult.toString(), System.currentTimeMillis());
                        } catch (Exception e) {
                           e.printStackTrace();
                        }

                     }
                  });
               }
            }
         } else if (!isOpenServer) {
            logger.error("class文件目录找不到");
         }
      } else {
         logger.error("class文件目录路径为空");
      }
   }
}
