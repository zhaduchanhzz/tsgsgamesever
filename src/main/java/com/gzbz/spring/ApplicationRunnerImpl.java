package com.gzbz.spring;

import allMgr.MgrParent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerImpl implements ApplicationRunner {
   static Logger logger = LoggerFactory.getLogger(ApplicationRunnerImpl.class);
   public static String mgrName;
   public static String mgrMethod;
   @Autowired
   private Environment env;

   public void run(ApplicationArguments args) throws Exception {
      if (mgrName != null && mgrMethod != null) {
         if (ApplicationContextProvider.getContext().containsBean(mgrName)) {
            MgrParent mgr = (MgrParent)ApplicationContextProvider.getContext().getBean(mgrName);
            if (mgr != null) {
               mgr.scheduleEx(5000L, mgrMethod, new Object[0]);
            }
         }

      }
   }
}
