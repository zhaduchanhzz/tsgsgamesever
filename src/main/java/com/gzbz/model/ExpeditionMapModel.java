package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "expeditionMap"
)
public class ExpeditionMapModel extends BaseModel {
   @ModelColumnAnno(
      comment = "序号",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "关卡id"
   )
   private int chapterId;
   @ModelColumnAnno(
      comment = "格子id"
   )
   private int gridId;
   @ModelColumnAnno(
      comment = "坐标x"
   )
   private int gridx;
   @ModelColumnAnno(
      comment = "坐标y"
   )
   private int gridy;
   @ModelColumnAnno(
      comment = "格子类型"
   )
   private int gridType;
   @ModelColumnAnno(
      comment = "格子图标"
   )
   private int gridIcon;
   @ModelColumnAnno(
      comment = "格子事件"
   )
   private int gridEventId;
   @ModelColumnAnno(
      comment = "转换后格子事件"
   )
   private int changeEventId;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, ExpeditionMapModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ExpeditionMapModel model = (ExpeditionMapModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.chapterId, (v) -> new TreeMap())).put(model.gridId, model);
      }

      pool.putMap("customExpeditionMap", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getChapterId() {
      return this.chapterId;
   }

   public void setChapterId(int chapterId) {
      this.checkModify();
      this.chapterId = chapterId;
   }

   public int getGridId() {
      return this.gridId;
   }

   public void setGridId(int gridId) {
      this.checkModify();
      this.gridId = gridId;
   }

   public int getGridx() {
      return this.gridx;
   }

   public void setGridx(int gridx) {
      this.checkModify();
      this.gridx = gridx;
   }

   public int getGridy() {
      return this.gridy;
   }

   public void setGridy(int gridy) {
      this.checkModify();
      this.gridy = gridy;
   }

   public int getGridType() {
      return this.gridType;
   }

   public void setGridType(int gridType) {
      this.checkModify();
      this.gridType = gridType;
   }

   public int getGridIcon() {
      return this.gridIcon;
   }

   public void setGridIcon(int gridIcon) {
      this.checkModify();
      this.gridIcon = gridIcon;
   }

   public int getGridEventId() {
      return this.gridEventId;
   }

   public void setGridEventId(int gridEventId) {
      this.gridEventId = gridEventId;
   }

   public int getChangeEventId() {
      return this.changeEventId;
   }

   public void setChangeEventId(int changeEventId) {
      this.changeEventId = changeEventId;
   }
}
