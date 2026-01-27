package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "RuneMain"
)
public class RuneMainModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "名字"
   )
   private String name;
   @ModelColumnAnno(
      comment = "图标id"
   )
   private int icon;
   @ModelColumnAnno(
      comment = "所属套装id"
   )
   private int suitId;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "是否可分解"
   )
   private int breakIf;
   @ModelColumnAnno(
      comment = "位置"
   )
   private int seat;
   @ModelColumnAnno(
      comment = "星级"
   )
   private int starLevel;
   @ModelColumnAnno(
      comment = "强化等级上限"
   )
   private int levelTop;
   @ModelColumnAnno(
      columnName = "pro",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "基础属性"
   )
   private ArrayList<PropertyModel> pro = new ArrayList();
   @ModelColumnAnno(
      comment = "星级属性组id"
   )
   private int starNatureId;
   @ModelColumnAnno(
      comment = "是否可被合成"
   )
   private int beFusionIf;
   @ModelColumnAnno(
      comment = "是否可合成"
   )
   private int fusionIf;
   @ModelColumnAnno(
      comment = "合成所需符文品质"
   )
   private int fusionNeedQuality;
   @ModelColumnAnno(
      comment = "合成所需符文数量"
   )
   private int fusionNeedNum;
   @ModelColumnAnno(
      columnName = "fusionCost",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "合成额外消耗"
   )
   private ArrayList<ResourceModel> fusionCost = new ArrayList();
   @ModelColumnAnno(
      comment = "是否可升品"
   )
   private int upQualityIf;
   @ModelColumnAnno(
      comment = "升品后id"
   )
   private int afterUpQualityId;
   @ModelColumnAnno(
      columnName = "upQCost",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "升品消耗"
   )
   private ArrayList<ResourceModel> upQCost = new ArrayList();
   @ModelColumnAnno(
      comment = "是否可置换"
   )
   private int changeIf;
   @ModelColumnAnno(
      columnName = "changeCost",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "置换消耗"
   )
   private ArrayList<ResourceModel> changeCost = new ArrayList();
   @ModelColumnAnno(
      comment = "是否可被吞噬"
   )
   private int beConsumedIf;
   @ModelColumnAnno(
      comment = "吞噬提供经验"
   )
   private int proEX;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getIcon() {
      return this.icon;
   }

   public void setIcon(int icon) {
      this.checkModify();
      this.icon = icon;
   }

   public int getSuitId() {
      return this.suitId;
   }

   public void setSuitId(int suitId) {
      this.checkModify();
      this.suitId = suitId;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getBreakIf() {
      return this.breakIf;
   }

   public void setBreakIf(int breakIf) {
      this.checkModify();
      this.breakIf = breakIf;
   }

   public int getSeat() {
      return this.seat;
   }

   public void setSeat(int seat) {
      this.checkModify();
      this.seat = seat;
   }

   public int getStarLevel() {
      return this.starLevel;
   }

   public void setStarLevel(int starLevel) {
      this.checkModify();
      this.starLevel = starLevel;
   }

   public int getLevelTop() {
      return this.levelTop;
   }

   public void setLevelTop(int levelTop) {
      this.checkModify();
      this.levelTop = levelTop;
   }

   public ArrayList<PropertyModel> getPro() {
      return this.pro;
   }

   public void setPro(ArrayList<PropertyModel> pro) {
      this.checkModify();
      this.pro = pro;
   }

   public int getStarNatureId() {
      return this.starNatureId;
   }

   public void setStarNatureId(int starNatureId) {
      this.checkModify();
      this.starNatureId = starNatureId;
   }

   public int getBeFusionIf() {
      return this.beFusionIf;
   }

   public void setBeFusionIf(int beFusionIf) {
      this.checkModify();
      this.beFusionIf = beFusionIf;
   }

   public int getFusionIf() {
      return this.fusionIf;
   }

   public void setFusionIf(int fusionIf) {
      this.checkModify();
      this.fusionIf = fusionIf;
   }

   public int getFusionNeedQuality() {
      return this.fusionNeedQuality;
   }

   public void setFusionNeedQuality(int fusionNeedQuality) {
      this.checkModify();
      this.fusionNeedQuality = fusionNeedQuality;
   }

   public int getFusionNeedNum() {
      return this.fusionNeedNum;
   }

   public void setFusionNeedNum(int fusionNeedNum) {
      this.checkModify();
      this.fusionNeedNum = fusionNeedNum;
   }

   public ArrayList<ResourceModel> getFusionCost() {
      return this.fusionCost;
   }

   public void setFusionCost(ArrayList<ResourceModel> fusionCost) {
      this.checkModify();
      this.fusionCost = fusionCost;
   }

   public int getUpQualityIf() {
      return this.upQualityIf;
   }

   public void setUpQualityIf(int upQualityIf) {
      this.checkModify();
      this.upQualityIf = upQualityIf;
   }

   public int getAfterUpQualityId() {
      return this.afterUpQualityId;
   }

   public void setAfterUpQualityId(int afterUpQualityId) {
      this.checkModify();
      this.afterUpQualityId = afterUpQualityId;
   }

   public ArrayList<ResourceModel> getUpQCost() {
      return this.upQCost;
   }

   public void setUpQCost(ArrayList<ResourceModel> upQCost) {
      this.checkModify();
      this.upQCost = upQCost;
   }

   public int getChangeIf() {
      return this.changeIf;
   }

   public void setChangeIf(int changeIf) {
      this.checkModify();
      this.changeIf = changeIf;
   }

   public ArrayList<ResourceModel> getChangeCost() {
      return this.changeCost;
   }

   public void setChangeCost(ArrayList<ResourceModel> changeCost) {
      this.checkModify();
      this.changeCost = changeCost;
   }

   public int getBeConsumedIf() {
      return this.beConsumedIf;
   }

   public void setBeConsumedIf(int beConsumedIf) {
      this.checkModify();
      this.beConsumedIf = beConsumedIf;
   }

   public int getProEX() {
      return this.proEX;
   }

   public void setProEX(int proEX) {
      this.checkModify();
      this.proEX = proEX;
   }
}
