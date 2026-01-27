package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "unionGateChapter"
)
public class UnionDailyGuessChapterModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "关卡id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "关卡序号"
   )
   private int orderNum;
   @ModelColumnAnno(
      comment = "版本号"
   )
   private int version;
   @ModelColumnAnno(
      comment = "关卡名字"
   )
   private String name;
   @ModelColumnAnno(
      comment = "前置关卡"
   )
   private int preChapterId;
   @ModelColumnAnno(
      comment = "后置关卡"
   )
   private int postChapterId;
   @ModelColumnAnno(
      comment = "需求军团等级"
   )
   private int unlockUnionLv;
   @ModelColumnAnno(
      comment = "使用武将"
   )
   private int heroId;
   @ModelColumnAnno(
      comment = "出生格子"
   )
   private int initGrid;
   @ModelColumnAnno(
      comment = "map宽"
   )
   private int mapW;
   @ModelColumnAnno(
      comment = "map高"
   )
   private int mapH;
   @ModelColumnAnno(
      comment = "随机宝箱格子",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> randomBoxGrids = new ArrayList();
   @ModelColumnAnno(
      comment = "初始解锁格子",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> seeGrids = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getOrderNum() {
      return this.orderNum;
   }

   public void setOrderNum(int orderNum) {
      this.checkModify();
      this.orderNum = orderNum;
   }

   public int getVersion() {
      return this.version;
   }

   public void setVersion(int version) {
      this.checkModify();
      this.version = version;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getPreChapterId() {
      return this.preChapterId;
   }

   public void setPreChapterId(int preChapterId) {
      this.checkModify();
      this.preChapterId = preChapterId;
   }

   public int getPostChapterId() {
      return this.postChapterId;
   }

   public void setPostChapterId(int postChapterId) {
      this.checkModify();
      this.postChapterId = postChapterId;
   }

   public int getUnlockUnionLv() {
      return this.unlockUnionLv;
   }

   public void setUnlockUnionLv(int unlockUnionLv) {
      this.checkModify();
      this.unlockUnionLv = unlockUnionLv;
   }

   public int getHeroId() {
      return this.heroId;
   }

   public void setHeroId(int heroId) {
      this.checkModify();
      this.heroId = heroId;
   }

   public int getInitGrid() {
      return this.initGrid;
   }

   public void setInitGrid(int initGrid) {
      this.checkModify();
      this.initGrid = initGrid;
   }

   public int getMapW() {
      return this.mapW;
   }

   public void setMapW(int mapW) {
      this.checkModify();
      this.mapW = mapW;
   }

   public int getMapH() {
      return this.mapH;
   }

   public void setMapH(int mapH) {
      this.checkModify();
      this.mapH = mapH;
   }

   public List<Integer> getRandomBoxGrids() {
      return this.randomBoxGrids;
   }

   public void setRandomBoxGrids(List<Integer> randomBoxGrids) {
      this.checkModify();
      this.randomBoxGrids = randomBoxGrids;
   }

   public List<Integer> getSeeGrids() {
      return this.seeGrids;
   }

   public void setSeeGrids(List<Integer> seeGrids) {
      this.checkModify();
      this.seeGrids = seeGrids;
   }
}
