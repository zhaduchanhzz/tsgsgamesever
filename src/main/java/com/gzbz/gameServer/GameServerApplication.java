package com.gzbz.gameServer;

import com.gzbz.spring.ApplicationRunnerImpl;
import debug.AppArgs;
import debug.Debug;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import scan.ScanAnnotation;

@ComponentScan({"com.gzbz"})
@SpringBootApplication
@EnableScheduling
public class GameServerApplication {
   static ConfigurableApplicationContext context;
   static Logger logger = LoggerFactory.getLogger(ScanAnnotation.class);

   public static void main(final String[] args) {
      if (args.length > 0) {
         String debug = args[0];
         if (debug.equals("debug")) {
            Debug.isDebug = true;
         }
      } else {
         Debug.isDebug = false;
      }

      AppArgs.ParseArgs(args);

      try {
         if (!Debug.isDebug) {
            long delayTime = (long)(Math.random() * (double)30000.0F);
            logger.info("延迟启动时间:{}毫秒", delayTime);
            Debug.sleep(delayTime);
         }

         ApplicationRunnerImpl.mgrName = "worldMgr";
         ApplicationRunnerImpl.mgrMethod = "updateCenterInfo";
      } catch (Exception e) {
         e.printStackTrace();
      }

      context = SpringApplication.run(GameServerApplication.class, args);
   }
}
