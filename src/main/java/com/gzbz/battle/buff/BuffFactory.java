package com.gzbz.battle.buff;

import com.gzbz.battle.entity.Entity;
import com.gzbz.model.BuffModel;
import com.gzbz.scan.GameServerScan;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.Serializable;
import java.util.Objects;
import java.util.logging.Logger;

public class BuffFactory implements Serializable {
   public static Buff getBuff(BuffModel buffModel, Entity entity, Entity caster, BuffManager buffManager) {
      if (buffModel.getCombine() == -5 && entity.getBuffManager().checkSubBuff(buffModel.getSubCls())) {
         return null;
      } else {
         GameServerScan gameServerScan = (GameServerScan)ApplicationContextProvider.getContext().getBean(GameServerScan.class);
         Class subBuffCls = (Class)gameServerScan.subBuffMap.get(buffModel.getSubCls());
         Buff buff = null;
         if (Objects.nonNull(subBuffCls)) {
            try {
               buff = (Buff)subBuffCls.newInstance();
            } catch (Exception e) {
               e.printStackTrace();
            }

            if (Objects.isNull(buff)) {
               Logger.getLogger(BuffFactory.class.getName()).info("无法找到buff小类型{}对应的类" + buffModel.getSubCls());
               return null;
            }
         } else {
            buff = new Buff();
         }

         buff.init(entity, caster, buffModel, buffManager);
         return buff;
      }
   }
}
