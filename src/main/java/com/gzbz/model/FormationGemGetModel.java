package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "formationGemGet"
)
public class FormationGemGetModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "免费次数"
   )
   private int freeTime;
   @ModelColumnAnno(
      comment = "免费cd"
   )
   private int freeCd;
   @ModelColumnAnno(
      comment = "消耗道具类型"
   )
   private int getItemType;
   @ModelColumnAnno(
      comment = "消耗道具数量"
   )
   private int getItemNum;
   @ModelColumnAnno(
      comment = "消耗道具id"
   )
   private int getItemId;
   @ModelColumnAnno(
      comment = "符石随机概率",
      columnName = "gemRandom",
      columnConvertType = 4,
      subCls = KeyValFun.class,
      count = 4
   )
   private List<KeyValFun> runeRandom = new ArrayList();
   @ModelColumnAnno(
      comment = "10连保底概率"
   )
   private int tenTimeRandom;
   @ModelColumnAnno(
      comment = "10连保底概值"
   )
   private int tenTimeRandomValue;
   @ModelColumnAnno(
      comment = "10连保底概率2"
   )
   private int tenTimeRandomForP;
   @ModelColumnAnno(
      comment = "10连保底概值2"
   )
   private int tenTimeRandomValueForP;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getFreeTime() {
      return this.freeTime;
   }

   public void setFreeTime(int freeTime) {
      this.checkModify();
      this.freeTime = freeTime;
   }

   public int getFreeCd() {
      return this.freeCd;
   }

   public void setFreeCd(int freeCd) {
      this.checkModify();
      this.freeCd = freeCd;
   }

   public int getGetItemType() {
      return this.getItemType;
   }

   public void setGetItemType(int getItemType) {
      this.checkModify();
      this.getItemType = getItemType;
   }

   public int getGetItemNum() {
      return this.getItemNum;
   }

   public void setGetItemNum(int getItemNum) {
      this.checkModify();
      this.getItemNum = getItemNum;
   }

   public int getGetItemId() {
      return this.getItemId;
   }

   public void setGetItemId(int getItemId) {
      this.checkModify();
      this.getItemId = getItemId;
   }

   public List<KeyValFun> getRuneRandom() {
      return this.runeRandom;
   }

   public void setRuneRandom(List<KeyValFun> runeRandom) {
      this.checkModify();
      this.runeRandom = runeRandom;
   }

   public int getTenTimeRandom() {
      return this.tenTimeRandom;
   }

   public void setTenTimeRandom(int tenTimeRandom) {
      this.checkModify();
      this.tenTimeRandom = tenTimeRandom;
   }

   public int getTenTimeRandomValue() {
      return this.tenTimeRandomValue;
   }

   public void setTenTimeRandomValue(int tenTimeRandomValue) {
      this.checkModify();
      this.tenTimeRandomValue = tenTimeRandomValue;
   }

   public int getTenTimeRandomForP() {
      return this.tenTimeRandomForP;
   }

   public void setTenTimeRandomForP(int tenTimeRandomForP) {
      this.tenTimeRandomForP = tenTimeRandomForP;
   }

   public int getTenTimeRandomValueForP() {
      return this.tenTimeRandomValueForP;
   }

   public void setTenTimeRandomValueForP(int tenTimeRandomValueForP) {
      this.tenTimeRandomValueForP = tenTimeRandomValueForP;
   }
}
