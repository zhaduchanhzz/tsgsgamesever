package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "playername"
)
public class PlayerNameModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "type",
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "name",
      comment = "文本"
   )
   private String name;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<PlayerNameModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         PlayerNameModel model = (PlayerNameModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.type, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customPlayername", tempHashMap);
   }

   public static String randomName(int sex) {
      StringBuilder sb = new StringBuilder();
      sb.append(randomNameByType(1));
      if (sex == 0) {
         sb.append(randomNameByType(3));
      } else {
         sb.append(randomNameByType(4));
      }

      return sb.toString();
   }

   public static String randomNameByType(int type) {
      Map<Integer, List<PlayerNameModel>> map = ApplicationContextProvider.<Integer, List<PlayerNameModel>>getModelPoolMap("customPlayername");
      List<PlayerNameModel> list = (List)map.get(type);
      if (list == null) {
         return "";
      } else {
         Collections.shuffle(list);
         return ((PlayerNameModel)list.get(0)).getName();
      }
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }
}
