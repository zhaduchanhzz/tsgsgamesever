package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "wanKaPrivilege"
)
public class WanKaPrivilegeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "特权内容类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "特权等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "特权标题 "
   )
   private String title;
   @ModelColumnAnno(
      comment = "特权图标"
   )
   private String icon;
   @ModelColumnAnno(
      comment = "特权参数"
   )
   private int param;
   @ModelColumnAnno(
      comment = "特权参数2"
   )
   private int param2;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, WanKaPrivilegeModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         WanKaPrivilegeModel model = (WanKaPrivilegeModel)entry.getValue();
         ((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.getType(), (v) -> new ConcurrentHashMap())).put(model.getLevel(), model);
      }

      pool.putMap("customWanKaPrivilege", tempHashMap);
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

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String title) {
      this.checkModify();
      this.title = title;
   }

   public String getIcon() {
      return this.icon;
   }

   public void setIcon(String icon) {
      this.checkModify();
      this.icon = icon;
   }

   public int getParam() {
      return this.param;
   }

   public void setParam(int param) {
      this.checkModify();
      this.param = param;
   }

   public int getParam2() {
      return this.param2;
   }

   public void setParam2(int param2) {
      this.checkModify();
      this.param2 = param2;
   }
}
