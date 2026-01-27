package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "HefuBattleBlock"
)
public class HeFuBattleBlockModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "地块类型"
   )
   private int blockType;
   @ModelColumnAnno(
      comment = "格子状态"
   )
   private int stage;
   @ModelColumnAnno(
      comment = "移动cd"
   )
   private int moveCd;
   @ModelColumnAnno(
      comment = "是否可走"
   )
   private int isWalk;
   @ModelColumnAnno(
      comment = "地块事件"
   )
   private int blockEvent;

   public int getBlockType() {
      return this.blockType;
   }

   public void setBlockType(int blockType) {
      this.checkModify();
      this.blockType = blockType;
   }

   public int getStage() {
      return this.stage;
   }

   public void setStage(int stage) {
      this.checkModify();
      this.stage = stage;
   }

   public int getMoveCd() {
      return this.moveCd;
   }

   public void setMoveCd(int moveCd) {
      this.checkModify();
      this.moveCd = moveCd;
   }

   public int getIsWalk() {
      return this.isWalk;
   }

   public void setIsWalk(int isWalk) {
      this.checkModify();
      this.isWalk = isWalk;
   }

   public int getBlockEvent() {
      return this.blockEvent;
   }

   public void setBlockEvent(int blockEvent) {
      this.checkModify();
      this.blockEvent = blockEvent;
   }
}
