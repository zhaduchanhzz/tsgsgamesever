package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "starMapType"
)
public class StarMapTypeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "武将Id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "星图类型"
   )
   private int starMapId;
   @ModelColumnAnno(
      comment = "无双技能1",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> skill = new ArrayList();
   @ModelColumnAnno(
      comment = "无双技能2",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> skill2 = new ArrayList();
   @ModelColumnAnno(
      comment = "无双技能3",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> skill3 = new ArrayList();
   @ModelColumnAnno(
      comment = "职业"
   )
   private int type;
   @ModelColumnAnno(
      comment = "阵营"
   )
   private int camp;
   @ModelColumnAnno(
      comment = "星图系统解锁开放的英雄星级"
   )
   private int star;
   @ModelColumnAnno(
      comment = "阵营分类"
   )
   private int classify;
   @ModelColumnAnno(
      comment = "无双技能1和2的解锁等级,无双技能3不看该字段"
   )
   private int needlevel;
   @ModelColumnAnno(
      comment = "是否投放"
   )
   private int isRelease;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getStarMapId() {
      return this.starMapId;
   }

   public void setStarMapId(int starMapId) {
      this.checkModify();
      this.starMapId = starMapId;
   }

   public List<Integer> getSkill() {
      return this.skill;
   }

   public void setSkill(List<Integer> skill) {
      this.checkModify();
      this.skill = skill;
   }

   public List<Integer> getSkill2() {
      return this.skill2;
   }

   public void setSkill2(List<Integer> skill2) {
      this.checkModify();
      this.skill2 = skill2;
   }

   public List<Integer> getSkill3() {
      return this.skill3;
   }

   public void setSkill3(List<Integer> skill3) {
      this.checkModify();
      this.skill3 = skill3;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getClassify() {
      return this.classify;
   }

   public void setClassify(int classify) {
      this.checkModify();
      this.classify = classify;
   }

   public int getNeedlevel() {
      return this.needlevel;
   }

   public void setNeedlevel(int needlevel) {
      this.checkModify();
      this.needlevel = needlevel;
   }

   public int getIsRelease() {
      return this.isRelease;
   }

   public void setIsRelease(int isRelease) {
      this.checkModify();
      this.isRelease = isRelease;
   }
}
