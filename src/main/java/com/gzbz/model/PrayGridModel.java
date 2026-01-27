package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "prayGrid"
)
public class PrayGridModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "祈福类型id"
   )
   private int prayId;
   @ModelColumnAnno(
      comment = "名称描述"
   )
   private String name;
   @ModelColumnAnno(
      comment = "格子位置序号"
   )
   private int pos;
   @ModelColumnAnno(
      comment = "可获得次数，0无限"
   )
   private int count;
   @ModelColumnAnno(
      comment = "格子比重"
   )
   private int pro;
   @ModelColumnAnno(
      comment = "奖品刷新组"
   )
   private int groupId;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getPrayId() {
      return this.prayId;
   }

   public void setPrayId(int prayId) {
      this.checkModify();
      this.prayId = prayId;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getPos() {
      return this.pos;
   }

   public void setPos(int pos) {
      this.checkModify();
      this.pos = pos;
   }

   public int getCount() {
      return this.count;
   }

   public void setCount(int count) {
      this.checkModify();
      this.count = count;
   }

   public int getPro() {
      return this.pro;
   }

   public void setPro(int pro) {
      this.checkModify();
      this.pro = pro;
   }

   public int getGroupId() {
      return this.groupId;
   }

   public void setGroupId(int groupId) {
      this.checkModify();
      this.groupId = groupId;
   }
}
