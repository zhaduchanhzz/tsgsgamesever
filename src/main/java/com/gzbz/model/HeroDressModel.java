package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroDress"
)
public class HeroDressModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "时装id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "dressType",
      comment = "时装类型"
   )
   private int dressType;
   @ModelColumnAnno(
      columnName = "itemId",
      comment = "物品ID"
   )
   private int itemId;
   @ModelColumnAnno(
      columnName = "heroId",
      comment = "对应英雄ID"
   )
   private int heroId;
   @ModelColumnAnno(
      columnName = "changedHeroId",
      comment = "更改后英雄id"
   )
   private int changedHeroId;
   @ModelColumnAnno(
      columnName = "name",
      comment = "武将名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "tips",
      comment = "备注"
   )
   private String tips;
   @ModelColumnAnno(
      columnName = "addPros",
      columnConvertType = 1,
      count = 4,
      subCls = PropertyModel.class,
      comment = "增加属性"
   )
   private List<PropertyModel> addPros = new ArrayList();
   @ModelColumnAnno(
      columnName = "addHp",
      comment = "图鉴基础生命"
   )
   private int addHp;
   @ModelColumnAnno(
      columnName = "addAtk",
      comment = "图鉴基础攻击"
   )
   private int addAtk;
   @ModelColumnAnno(
      columnName = "addAllPros",
      columnConvertType = 1,
      count = 2,
      subCls = PropertyModel.class,
      comment = "典藏皮肤增加属性"
   )
   private List<PropertyModel> addAllPros = new ArrayList();
   @ModelColumnAnno(
      columnName = "recovery",
      columnConvertType = 1,
      count = 2,
      subCls = ResourceModel.class,
      comment = "增加属性"
   )
   private List<ResourceModel> recovery = new ArrayList();
   @ModelColumnAnno(
      columnName = "desc",
      comment = "描述"
   )
   private String desc;
   @ModelColumnAnno(
      columnName = "force",
      columnConvertType = 1,
      count = 1,
      subCls = ResourceModel.class,
      comment = "有效期内返还"
   )
   private List<ResourceModel> force = new ArrayList();
   @ModelColumnAnno(
      columnName = "feeType",
      comment = "购买花费类型"
   )
   private int feeType;
   @ModelColumnAnno(
      columnName = "feeId",
      comment = "购买花费ID"
   )
   private int feeId;
   @ModelColumnAnno(
      columnName = "feeVal",
      comment = "购买花费数量"
   )
   private int feeVal;
   @ModelColumnAnno(
      columnName = "frontDressId",
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "前置皮肤id"
   )
   private List<Integer> frontDressId = new ArrayList();

   public List<Integer> getFrontDressId() {
      return this.frontDressId;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getHeroId() {
      return this.heroId;
   }

   public void setHeroId(int heroId) {
      this.checkModify();
      this.heroId = heroId;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public String getTips() {
      return this.tips;
   }

   public void setTips(String tips) {
      this.checkModify();
      this.tips = tips;
   }

   public List<PropertyModel> getAddPros() {
      return this.addPros;
   }

   public void setAddPros(List<PropertyModel> addPros) {
      this.checkModify();
      this.addPros = addPros;
   }

   public List<ResourceModel> getRecovery() {
      return this.recovery;
   }

   public void setRecovery(List<ResourceModel> recovery) {
      this.checkModify();
      this.recovery = recovery;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public List<ResourceModel> getForce() {
      return this.force;
   }

   public void setForce(List<ResourceModel> force) {
      this.checkModify();
      this.force = force;
   }

   public int getChangedHeroId() {
      return this.changedHeroId;
   }

   public void setChangedHeroId(int changedHeroId) {
      this.checkModify();
      this.changedHeroId = changedHeroId;
   }

   public int getDressType() {
      return this.dressType;
   }

   public void setDressType(int dressType) {
      this.checkModify();
      this.dressType = dressType;
   }

   public int getAddHp() {
      return this.addHp;
   }

   public void setAddHp(int addHp) {
      this.checkModify();
      this.addHp = addHp;
   }

   public int getAddAtk() {
      return this.addAtk;
   }

   public void setAddAtk(int addAtk) {
      this.checkModify();
      this.addAtk = addAtk;
   }

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }

   public int getFeeType() {
      return this.feeType;
   }

   public void setFeeType(int feeType) {
      this.checkModify();
      this.feeType = feeType;
   }

   public int getFeeId() {
      return this.feeId;
   }

   public void setFeeId(int feeId) {
      this.checkModify();
      this.feeId = feeId;
   }

   public int getFeeVal() {
      return this.feeVal;
   }

   public void setFeeVal(int feeVal) {
      this.checkModify();
      this.feeVal = feeVal;
   }

   public List<PropertyModel> getAddAllPros() {
      return this.addAllPros;
   }

   public void setAddAllPros(List<PropertyModel> addAllPros) {
      this.checkModify();
      this.addAllPros = addAllPros;
   }
}
