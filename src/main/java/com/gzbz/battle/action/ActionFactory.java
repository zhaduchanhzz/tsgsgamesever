package com.gzbz.battle.action;

import com.gzbz.battle.scene.BattleScene;
import com.gzbz.scan.GameServerScan;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.Serializable;
import java.util.Objects;

public class ActionFactory implements Serializable {
   public static Action getAction(BattleScene scene, byte type) {
      GameServerScan scan = ApplicationContextProvider.getGameScan();
      Class cls = (Class)scan.actionMap.get(type);
      if (Objects.isNull(cls)) {
         return null;
      } else {
         Action actionObj = null;

         try {
            actionObj = (Action)cls.newInstance();
         } catch (Exception e) {
            e.printStackTrace();
         }

         actionObj.init(type, scene);
         return actionObj;
      }
   }
}
