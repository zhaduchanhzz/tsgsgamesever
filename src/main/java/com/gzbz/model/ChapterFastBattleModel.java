package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "chapterFastBattle"
)
public class ChapterFastBattleModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "类型"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "freeNum",
      comment = "每日免费次数"
   )
   private int freeNum;
   @ModelColumnAnno(
      columnName = "vipLv",
      comment = "VIP等级"
   )
   private int vipLv;
   @ModelColumnAnno(
      columnName = "worldLevel",
      comment = "与世界等级差距百分比"
   )
   private int worldLevel;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "可购买次数及元宝消耗"
   )
   private List<Integer> costs;
   @ModelColumnAnno(
      columnName = "accelerate",
      comment = "快速作战加速时长"
   )
   private int accelerate;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getFreeNum() {
      return this.freeNum;
   }

   public void setFreeNum(int freeNum) {
      this.checkModify();
      this.freeNum = freeNum;
   }

   public List<Integer> getCosts() {
      return this.costs;
   }

   public void setCosts(List<Integer> costs) {
      this.checkModify();
      this.costs = costs;
   }

   public int getAccelerate() {
      return this.accelerate;
   }

   public void setAccelerate(int accelerate) {
      this.checkModify();
      this.accelerate = accelerate;
   }

   public int getVipLv() {
      return this.vipLv;
   }

   public void setVipLv(int vipLv) {
      this.checkModify();
      this.vipLv = vipLv;
   }

   public int getWorldLevel() {
      return this.worldLevel;
   }

   public void setWorldLevel(int worldLevel) {
      this.checkModify();
      this.worldLevel = worldLevel;
   }
}
