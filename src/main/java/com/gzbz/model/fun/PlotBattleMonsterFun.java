package com.gzbz.model.fun;

import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class PlotBattleMonsterFun extends BattleMonsterFun {
   public static final short APPEARANCE_EVENT_INIT = 0;
   @ModelColumnAnno(
      columnName = "event",
      comment = "事件"
   )
   private byte event;
   @ModelColumnAnno(
      columnName = "param",
      comment = "参数"
   )
   private int param;
   @ModelColumnAnno(
      columnName = "talk",
      comment = "对话"
   )
   private int talk;
   @ModelColumnAnno(
      columnName = "skilltalk",
      comment = "对话"
   )
   private int skilltalk;
   @ModelColumnAnno(
      columnName = "deadtalk",
      comment = "对话"
   )
   private int deadtalk;

   public byte getEvent() {
      return this.event;
   }

   public void setEvent(byte event) {
      this.checkModify();
      this.event = event;
   }

   public int getParam() {
      return this.param;
   }

   public void setParam(int param) {
      this.checkModify();
      this.param = param;
   }

   public int getTalk() {
      return this.talk;
   }

   public void setTalk(int talk) {
      this.checkModify();
      this.talk = talk;
   }

   public int getSkilltalk() {
      return this.skilltalk;
   }

   public void setSkilltalk(int skilltalk) {
      this.checkModify();
      this.skilltalk = skilltalk;
   }

   public int getDeadtalk() {
      return this.deadtalk;
   }

   public void setDeadtalk(int deadtalk) {
      this.checkModify();
      this.deadtalk = deadtalk;
   }
}
