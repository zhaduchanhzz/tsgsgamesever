package com.gzbz.gameMgr;

import allMgr.AllMgr;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class GameAllMgr extends AllMgr {
   @Autowired
   private Environment env;

   @PostConstruct
   public void start() {
      int core = Integer.parseInt(this.env.getProperty("ManagerCorePoolSize"));
      super.start(core);
   }

   public void error(Exception e) {
   }
}
