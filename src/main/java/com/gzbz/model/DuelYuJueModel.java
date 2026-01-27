package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "wudaoYujue"
)
public class DuelYuJueModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "玉珏类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "玉珏品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "消耗道具类型"
   )
   private int itemType;
   @ModelColumnAnno(
      comment = "消耗道具Id"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "消耗道具数量"
   )
   private int value;
   @ModelColumnAnno(
      comment = "赛季"
   )
   private int season;
   @ModelColumnAnno(
      columnName = "pro",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 4,
      comment = "永久属性加成"
   )
   private List<PropertyModel> pro = new ArrayList();
   @ModelColumnAnno(
      columnName = "limitPro",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2,
      comment = "限时属性加成"
   )
   private List<PropertyModel> limitPro = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getItemType() {
      return this.itemType;
   }

   public void setItemType(int itemType) {
      this.checkModify();
      this.itemType = itemType;
   }

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }

   public int getValue() {
      return this.value;
   }

   public void setValue(int value) {
      this.checkModify();
      this.value = value;
   }

   public int getSeason() {
      return this.season;
   }

   public void setSeason(int season) {
      this.checkModify();
      this.season = season;
   }

   public List<PropertyModel> getPro() {
      return this.pro;
   }

   public void setPro(List<PropertyModel> pro) {
      this.checkModify();
      this.pro = pro;
   }

   public List<PropertyModel> getLimitPro() {
      return this.limitPro;
   }

   public void setLimitPro(List<PropertyModel> limitPro) {
      this.checkModify();
      this.limitPro = limitPro;
   }
}
