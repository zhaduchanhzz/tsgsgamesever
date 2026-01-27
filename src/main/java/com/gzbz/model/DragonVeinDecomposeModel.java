package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DragonVeinDecompose"
)
public class DragonVeinDecomposeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "等级区间下限"
   )
   private int levelDown;
   @ModelColumnAnno(
      comment = "等级区间上限"
   )
   private int levelUP;
   @ModelColumnAnno(
      comment = "分解获得的经验"
   )
   private int exp;
   @ModelColumnAnno(
      comment = "分解奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> resolve = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getLevelDown() {
      return this.levelDown;
   }

   public void setLevelDown(int levelDown) {
      this.levelDown = levelDown;
   }

   public int getLevelUP() {
      return this.levelUP;
   }

   public void setLevelUP(int levelUP) {
      this.levelUP = levelUP;
   }

   public int getExp() {
      return this.exp;
   }

   public void setExp(int exp) {
      this.exp = exp;
   }

   public List<ResourceModel> getResolve() {
      return this.resolve;
   }

   public void setResolve(List<ResourceModel> resolve) {
      this.resolve = resolve;
   }
}
