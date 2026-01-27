package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "systemFunction"
)
public class SystemFunctionModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "系统id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "图标"
   )
   private int icon;
   @ModelColumnAnno(
      comment = "图示路径"
   )
   private String path;
   @ModelColumnAnno(
      comment = "背景音乐"
   )
   private String Uisound;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String tips;
   @ModelColumnAnno(
      comment = "界面名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "描述"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "功能开启等级"
   )
   private int appearLevel;
   @ModelColumnAnno(
      comment = "开启等级"
   )
   private int openLevel;
   @ModelColumnAnno(
      comment = "强制开启等级"
   )
   private int lvLimitEx;
   @ModelColumnAnno(
      comment = "世界等级"
   )
   private int worldLevel;
   @ModelColumnAnno(
      comment = "武将星级要求"
   )
   private int heroStarLevel;
   @ModelColumnAnno(
      comment = "武将等级要求"
   )
   private int heroLvRequest;
   @ModelColumnAnno(
      comment = "征战通关章节"
   )
   private int chapterId;
   @ModelColumnAnno(
      comment = "VIP等级要求"
   )
   private int needVipLv;
   @ModelColumnAnno(
      comment = "ui名称"
   )
   private String openUI;
   @ModelColumnAnno(
      comment = "子标签"
   )
   private int subSheetUIId;
   @ModelColumnAnno(
      comment = "界面页签屏蔽功能"
   )
   private int isShield;
   @ModelColumnAnno(
      comment = "是否合服后开启 1:合服后开启"
   )
   private int afterMergeVersionsOpen;
   @ModelColumnAnno(
      comment = "开服天数限制"
   )
   private int openDay;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getIcon() {
      return this.icon;
   }

   public void setIcon(int icon) {
      this.checkModify();
      this.icon = icon;
   }

   public String getPath() {
      return this.path;
   }

   public void setPath(String path) {
      this.checkModify();
      this.path = path;
   }

   public String getUisound() {
      return this.Uisound;
   }

   public void setUisound(String Uisound) {
      this.checkModify();
      this.Uisound = Uisound;
   }

   public String getTips() {
      return this.tips;
   }

   public void setTips(String tips) {
      this.checkModify();
      this.tips = tips;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getAppearLevel() {
      return this.appearLevel;
   }

   public void setAppearLevel(int appearLevel) {
      this.checkModify();
      this.appearLevel = appearLevel;
   }

   public int getOpenLevel() {
      return this.openLevel;
   }

   public void setOpenLevel(int openLevel) {
      this.checkModify();
      this.openLevel = openLevel;
   }

   public int getLvLimitEx() {
      return this.lvLimitEx;
   }

   public void setLvLimitEx(int lvLimitEx) {
      this.checkModify();
      this.lvLimitEx = lvLimitEx;
   }

   public int getWorldLevel() {
      return this.worldLevel;
   }

   public void setWorldLevel(int worldLevel) {
      this.checkModify();
      this.worldLevel = worldLevel;
   }

   public int getHeroStarLevel() {
      return this.heroStarLevel;
   }

   public void setHeroStarLevel(int heroStarLevel) {
      this.checkModify();
      this.heroStarLevel = heroStarLevel;
   }

   public int getHeroLvRequest() {
      return this.heroLvRequest;
   }

   public void setHeroLvRequest(int heroLvRequest) {
      this.checkModify();
      this.heroLvRequest = heroLvRequest;
   }

   public int getChapterId() {
      return this.chapterId;
   }

   public void setChapterId(int chapterId) {
      this.checkModify();
      this.chapterId = chapterId;
   }

   public int getNeedVipLv() {
      return this.needVipLv;
   }

   public void setNeedVipLv(int needVipLv) {
      this.checkModify();
      this.needVipLv = needVipLv;
   }

   public String getOpenUI() {
      return this.openUI;
   }

   public void setOpenUI(String openUI) {
      this.checkModify();
      this.openUI = openUI;
   }

   public int getSubSheetUIId() {
      return this.subSheetUIId;
   }

   public void setSubSheetUIId(int subSheetUIId) {
      this.checkModify();
      this.subSheetUIId = subSheetUIId;
   }

   public int getIsShield() {
      return this.isShield;
   }

   public void setIsShield(int isShield) {
      this.checkModify();
      this.isShield = isShield;
   }

   public int getAfterMergeVersionsOpen() {
      return this.afterMergeVersionsOpen;
   }

   public void setAfterMergeVersionsOpen(int afterMergeVersionsOpen) {
      this.checkModify();
      this.afterMergeVersionsOpen = afterMergeVersionsOpen;
   }

   public int getOpenDay() {
      return this.openDay;
   }

   public void setOpenDay(int openDay) {
      this.checkModify();
      this.openDay = openDay;
   }
}
