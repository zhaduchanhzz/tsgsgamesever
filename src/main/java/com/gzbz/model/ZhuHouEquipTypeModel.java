package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "heroGameEquipType"
)
public class ZhuHouEquipTypeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "类型Id"
   )
   private int type;
   @ModelColumnAnno(
      comment = "类型名称"
   )
   private String typeName;
   @ModelColumnAnno(
      comment = "类型权重"
   )
   private int weight;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, List<KeyValFun>> tempMap = new ConcurrentHashMap();
      List<KeyValFun> tempList = new ArrayList();
      map.forEach((key, value) -> {
         ZhuHouEquipTypeModel model = (ZhuHouEquipTypeModel)value;
         KeyValFun keyValFun = new KeyValFun(model.type, model.weight);
         tempList.add(keyValFun);
      });
      tempMap.put("customHeroGameEquipType", tempList);
      pool.putMap("customHeroGameEquipType", tempMap);
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.type = type;
   }

   public String getTypeName() {
      return this.typeName;
   }

   public void setTypeName(String typeName) {
      this.typeName = typeName;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }
}
