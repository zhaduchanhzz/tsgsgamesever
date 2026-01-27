package com.gzbz.gameServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
   Logger logger = LoggerFactory.getLogger(AppConfig.class);

   public AppConfig() {
      this.logger.info("BEAN加载器启动");
   }
}
