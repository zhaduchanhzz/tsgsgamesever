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
   file = "unionGateEvent"
)
public class UnionDailyGuessEventModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "事件类型"
   )
   private int eventType;
   @ModelColumnAnno(
      comment = "事件id"
   )
   private int eventId;
   @ModelColumnAnno(
      comment = "事件名称"
   )
   private String eventName;
   @ModelColumnAnno(
      comment = "图片名称"
   )
   private String iconPath;
   @ModelColumnAnno(
      comment = "参数",
      columnConvertType = 4,
      subCls = Integer.class,
      count = 5
   )
   private List<Integer> param = new ArrayList();
   @ModelColumnAnno(
      comment = "参数"
   )
   private String args;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String desc;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, UnionDailyGuessEventModel> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         UnionDailyGuessEventModel unionDailyGuessEventModel = (UnionDailyGuessEventModel)entry.getValue();
         String key = String.format("%d_%d", unionDailyGuessEventModel.eventType, unionDailyGuessEventModel.eventId);
         tempHashMap.putIfAbsent(key, unionDailyGuessEventModel);
      }

      pool.putMap("customUnionGateEvent", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getEventType() {
      return this.eventType;
   }

   public void setEventType(int eventType) {
      this.checkModify();
      this.eventType = eventType;
   }

   public int getEventId() {
      return this.eventId;
   }

   public void setEventId(int eventId) {
      this.checkModify();
      this.eventId = eventId;
   }

   public String getEventName() {
      return this.eventName;
   }

   public void setEventName(String eventName) {
      this.checkModify();
      this.eventName = eventName;
   }

   public String getIconPath() {
      return this.iconPath;
   }

   public void setIconPath(String iconPath) {
      this.checkModify();
      this.iconPath = iconPath;
   }

   public List<Integer> getParam() {
      return this.param;
   }

   public void setParam(List<Integer> param) {
      this.checkModify();
      this.param = param;
   }

   public String getArgs() {
      return this.args;
   }

   public void setArgs(String args) {
      this.checkModify();
      this.args = args;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
