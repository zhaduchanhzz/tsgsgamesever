package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "expeditionChapter"
)
public class ExpeditionChapterModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "关卡id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "版本号"
   )
   private int version;
   @ModelColumnAnno(
      comment = "关卡类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "关卡名字"
   )
   private String name;
   @ModelColumnAnno(
      comment = "关卡描述"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "关卡列表界面底图"
   )
   private String smallBgRes;
   @ModelColumnAnno(
      comment = "关卡地图界面背景"
   )
   private String bigBgRes;
   @ModelColumnAnno(
      comment = "解锁主线条件"
   )
   private int missionId;
   @ModelColumnAnno(
      comment = "使用的主角武将id"
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
      comment = "初始解锁格子",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> seeGrids = new ArrayList();
   @ModelColumnAnno(
      comment = "加成属性",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1
   )
   private ArrayList<PropertyModel> propertys = new ArrayList();
   @ModelColumnAnno(
      comment = "加成上限"
   )
   private int chapterBuffMax;
   @ModelColumnAnno(
      comment = "前置章节"
   )
   private int lastId;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getVersion() {
      return this.version;
   }

   public void setVersion(int version) {
      this.checkModify();
      this.version = version;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
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

   public String getSmallBgRes() {
      return this.smallBgRes;
   }

   public void setSmallBgRes(String smallBgRes) {
      this.checkModify();
      this.smallBgRes = smallBgRes;
   }

   public String getBigBgRes() {
      return this.bigBgRes;
   }

   public void setBigBgRes(String bigBgRes) {
      this.checkModify();
      this.bigBgRes = bigBgRes;
   }

   public int getMissionId() {
      return this.missionId;
   }

   public void setMissionId(int missionId) {
      this.checkModify();
      this.missionId = missionId;
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

   public List<Integer> getSeeGrids() {
      return this.seeGrids;
   }

   public void setSeeGrids(List<Integer> seeGrids) {
      this.checkModify();
      this.seeGrids = seeGrids;
   }

   public ArrayList<PropertyModel> getPropertys() {
      return this.propertys;
   }

   public void setPropertys(ArrayList<PropertyModel> propertys) {
      this.checkModify();
      this.propertys = propertys;
   }

   public int getChapterBuffMax() {
      return this.chapterBuffMax;
   }

   public void setChapterBuffMax(int chapterBuffMax) {
      this.checkModify();
      this.chapterBuffMax = chapterBuffMax;
   }

   public int getLastId() {
      return this.lastId;
   }

   public void setLastId(int lastId) {
      this.checkModify();
      this.lastId = lastId;
   }
}
