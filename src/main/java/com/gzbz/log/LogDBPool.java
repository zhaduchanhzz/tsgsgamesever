package com.gzbz.log;

import com.gzbz.scan.GameServerScan;
import db.DBPool;
import java.util.concurrent.ExecutorService;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import scan.ScanAnnotation;

public class LogDBPool extends DBPool {
   @Value("${DBLogPath}")
   private String filePath;
   @Value("${DBLogSize}")
   private int DBCorePoolSize;
   @Value("${DBLogMaximumSize}")
   private int DBMaximumPoolSize;
   @Value("${logBackFilePath}")
   public String backFilePath;
   @Autowired
   private GameServerScan gameServerScan;
   private ExecutorService executor;

   protected ExecutorService getService() {
      return this.executor;
   }

   protected String getFilePath() {
      return this.filePath;
   }

   public ScanAnnotation getScanAnnotation() {
      return this.gameServerScan;
   }

   protected String getBackPath() {
      return this.backFilePath;
   }

   public void error(Throwable r) {
   }

   @PostConstruct
   public void start() {
   }

   @PreDestroy
   public void destroy() {
      super.destroy();
   }

   public void finishTask(String tbName, byte type) {
   }
}
