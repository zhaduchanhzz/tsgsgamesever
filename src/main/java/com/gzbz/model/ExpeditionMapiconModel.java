package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "expeditionMapicon"
)
public class ExpeditionMapiconModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "类型"
   )
   private int id;
   @ModelColumnAnno(
      comment = "图片名字"
   )
   private String icon;
   @ModelColumnAnno(
      comment = "iconId"
   )
   private int iconId;
   @ModelColumnAnno(
      comment = "描述"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "是否可行走（0不可 1可）"
   )
   private int isLock;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ExpeditionMapiconModel> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ExpeditionMapiconModel model = (ExpeditionMapiconModel)entry.getValue();
         tempMap.put(model.getIconId(), model);
      }

      pool.putMap("customExpeditionMapicon", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getIcon() {
      return this.icon;
   }

   public void setIcon(String icon) {
      this.checkModify();
      this.icon = icon;
   }

   public int getIconId() {
      return this.iconId;
   }

   public void setIconId(int iconId) {
      this.checkModify();
      this.iconId = iconId;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getIsLock() {
      return this.isLock;
   }

   public void setIsLock(int isLock) {
      this.checkModify();
      this.isLock = isLock;
   }
}
