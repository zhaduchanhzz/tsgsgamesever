package com.gzbz.worldMgr;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.spring.ApplicationContextProvider;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.ScheduledFuture;
import misc.DateUtil;
import org.springframework.stereotype.Component;

@Component
@MgrAnno
public class GcMgr extends GameMgr {
   private long lastGcTime;
   private ScheduledFuture sf;
   private static final int SCHEDULE_PERIOD_MINUTE = 60000;

   protected void init() throws Exception {
   }

   public static void doFullGc() {
      System.gc();
   }

   public void initData() {
      if (this.sf == null) {
         this.sf = this.scheduleEx(60000L, 60000L, "minuteJob", new Object[0]);
      }
   }

   @TaskMethod
   public void minuteJob() {
      long total = Runtime.getRuntime().totalMemory() / 1024L / 1024L;
      long limit = 2048L;
      long curTime = System.currentTimeMillis();
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      long serverOpenTime = worldMgr.getOpenServerTime();
      int diffDay = DateUtil.difftimeDay(new Timestamp(serverOpenTime));
      int week = diffDay / 7;
      switch (week) {
         case 0:
            limit = (long)ApplicationContextProvider.getConfigInt("FirstWeekMem", 2048);
            break;
         case 1:
            limit = (long)ApplicationContextProvider.getConfigInt("SecondWeekMem", 1536);
            break;
         default:
            limit = (long)ApplicationContextProvider.getConfigInt("ThirdWeekMem", 1024);
      }

      CenterServerPart centerServerPart = (CenterServerPart)worldMgr.getMgrPart(CenterServerPart.class);
      if (centerServerPart != null && centerServerPart.getCurAlivePlayerNum() != 0L && diffDay > 2) {
         long curAliveLimit = (long)ApplicationContextProvider.getConfigInt("BaseActivityMem", 300) + centerServerPart.getCurAlivePlayerNum() * (long)ApplicationContextProvider.getConfigInt("PlayerMem", 2);
         if (curAliveLimit > limit) {
            limit = curAliveLimit;
         }
      }

      if (total >= limit) {
         if (curTime - this.lastGcTime < 600000L) {
            return;
         }

         logger.info("当前整堆大小:{}", total);
         Calendar calendar = Calendar.getInstance();
         calendar.setTimeZone(TimeZone.getDefault());
         calendar.setTimeInMillis(curTime);
         if (calendar.get(11) == 0 && calendar.get(12) < 10) {
            return;
         }

         System.gc();
         this.lastGcTime = System.currentTimeMillis();
         long lastHeap = Runtime.getRuntime().totalMemory() / 1024L / 1024L;
         logger.info("主动执行full gc:{}", lastHeap);
      }

   }
}
