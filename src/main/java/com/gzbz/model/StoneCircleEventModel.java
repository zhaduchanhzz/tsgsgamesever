package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "stoneCycleEvent"
)
public class StoneCircleEventModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "事件类型"
   )
   private int eventType;
   @ModelColumnAnno(
      comment = "事件出现层数"
   )
   private String appearBlock;
   @ModelColumnAnno(
      comment = "事件权重"
   )
   private int unitWeight;
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
      comment = "额外参数"
   )
   private String extra;

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

   public String getAppearBlock() {
      return this.appearBlock;
   }

   public void setAppearBlock(String appearBlock) {
      this.checkModify();
      this.appearBlock = appearBlock;
   }

   public int getUnitWeight() {
      return this.unitWeight;
   }

   public void setUnitWeight(int unitWeight) {
      this.checkModify();
      this.unitWeight = unitWeight;
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

   public String getExtra() {
      return this.extra;
   }

   public void setExtra(String extra) {
      this.checkModify();
      this.extra = extra;
   }
}
