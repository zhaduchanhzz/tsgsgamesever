package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "stoneCircleMap"
)
public class StoneCircleMapModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "格子",
      columnConvertType = 4,
      subCls = Integer.class,
      count = 12
   )
   private List<Integer> block = new ArrayList();
   @ModelColumnAnno(
      comment = "boss格子"
   )
   private String bossBlock;
   @ModelColumnAnno(
      comment = "出生格子"
   )
   private int startBlock;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<Integer> getBlock() {
      return this.block;
   }

   public void setBlock(List<Integer> block) {
      this.checkModify();
      this.block = block;
   }

   public int getStartBlock() {
      return this.startBlock;
   }

   public void setStartBlock(int startBlock) {
      this.checkModify();
      this.startBlock = startBlock;
   }

   public String getBossBlock() {
      return this.bossBlock;
   }

   public void setBossBlock(String bossBlock) {
      this.checkModify();
      this.bossBlock = bossBlock;
   }
}
