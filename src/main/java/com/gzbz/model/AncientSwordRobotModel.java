package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "AncientSwordRobot"
)
public class AncientSwordRobotModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "机器人组号"
   )
   private int robotGroup;
   @ModelColumnAnno(
      comment = "battle表id"
   )
   private int battleId;
   @ModelColumnAnno(
      comment = "显示战力"
   )
   private int powerShow;
   @ModelColumnAnno(
      comment = "机器人名称"
   )
   private String name;

   public int getBattleId() {
      return this.battleId;
   }

   public int getPowerShow() {
      return this.powerShow;
   }

   public String getName() {
      return this.name;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<AncientSwordRobotModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         AncientSwordRobotModel value = (AncientSwordRobotModel)entry.getValue();
         ((List)tempMap.computeIfAbsent(value.robotGroup, (k) -> new ArrayList())).add(value);
      }

      pool.putMap("cAncientSwordRobot", tempMap);
   }
}
