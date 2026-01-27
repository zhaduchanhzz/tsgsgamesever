package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "armyArrayLock"
)
public class ArmyArrayLockModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "格子序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "解锁类型",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> unlock = new ArrayList();
   @ModelColumnAnno(
      comment = "玩家等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "需要激活军阵数量"
   )
   private int activeNum;
   @ModelColumnAnno(
      comment = "解锁材料",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3
   )
   private List<ResourceModel> unlockItem = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<Integer> getUnlock() {
      return this.unlock;
   }

   public void setUnlock(List<Integer> unlock) {
      this.checkModify();
      this.unlock = unlock;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getActiveNum() {
      return this.activeNum;
   }

   public void setActiveNum(int activeNum) {
      this.checkModify();
      this.activeNum = activeNum;
   }

   public List<ResourceModel> getUnlockItem() {
      return this.unlockItem;
   }

   public void setUnlockItem(List<ResourceModel> unlockItem) {
      this.checkModify();
      this.unlockItem = unlockItem;
   }
}
