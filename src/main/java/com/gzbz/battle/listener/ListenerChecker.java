package com.gzbz.battle.listener;

import com.gzbz.battle.entity.Entity;
import com.gzbz.model.HeroModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.Serializable;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ListenerChecker implements Serializable {
   protected Logger logger = LoggerFactory.getLogger(this.getClass());

   abstract boolean check(Event event, ListenerContext context);

   protected boolean checkPhysical(Event event) {
      Entity source = (Entity)event.getParam(2);
      if (Objects.isNull(source)) {
         return false;
      } else {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", source.getId());
         if (Objects.isNull(heroModel)) {
            return false;
         } else {
            return heroModel.getAtkType() == 1;
         }
      }
   }

   protected boolean checkMagic(Event event) {
      Entity source = (Entity)event.getParam(2);
      if (Objects.isNull(source)) {
         return false;
      } else {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", source.getId());
         if (Objects.isNull(heroModel)) {
            return false;
         } else {
            return heroModel.getAtkType() == 2;
         }
      }
   }
}
