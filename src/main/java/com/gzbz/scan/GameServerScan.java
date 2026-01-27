package com.gzbz.scan;

import com.gzbz.battle.buff.BuffFunc;
import com.gzbz.battle.buff.BuffFuncProcessor;
import com.gzbz.battle.condition.ConditionFunc;
import com.gzbz.battle.condition.ConditionProcessor;
import com.gzbz.battle.effectFunc.EffectFunc;
import com.gzbz.battle.effectFunc.EffectFuncProcessor;
import com.gzbz.battle.listener.CheckerFactory;
import com.gzbz.battle.listener.ListenerChecker;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import scan.ScanAnnotation;

@Component
public class GameServerScan extends ScanAnnotation {
   static Logger logger = LoggerFactory.getLogger(GameServerScan.class);
   @Value("${package.scan}")
   protected String packageName;

   public String getPackage() {
      return this.packageName;
   }

   public void finishScan() {
      this.effectMap.forEach((keyx, clsx) -> {
         try {
            EffectFunc func = (EffectFunc)clsx.newInstance();
            EffectFuncProcessor.funcMap.put(keyx, func);
         } catch (Exception e) {
            e.printStackTrace();
         }

      });

      try {
         for(Map.Entry<Short, Class> shortClassEntry : this.buffMap.entrySet()) {
            short key = (Short)shortClassEntry.getKey();
            Class cls = (Class)shortClassEntry.getValue();
            BuffFuncProcessor.funcMap.put(key, (BuffFunc)cls.newInstance());
         }

         for(Map.Entry<Short, Class> shortClassEntry : this.conditionMap.entrySet()) {
            short key = (Short)shortClassEntry.getKey();
            Class cls = (Class)shortClassEntry.getValue();
            ConditionProcessor.conditionMap.put(key, (ConditionFunc)cls.newInstance());
         }

         this.checkerMap.forEach((type, clsx) -> {
            try {
               CheckerFactory.checkerMap.put(type, (ListenerChecker)clsx.newInstance());
            } catch (Exception e) {
               e.printStackTrace();
            }

         });
      } catch (Exception e) {
         e.printStackTrace();
      }

      logger.info("------------------------------扫描注解完成------------------------------");
   }
}
