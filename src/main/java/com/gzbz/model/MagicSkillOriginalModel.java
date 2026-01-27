package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "MysticSkillOriginal"
)
public class MagicSkillOriginalModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "道具id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "名称"
   )
   private String name;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "奇谋概率展示",
      columnName = "rateshow"
   )
   private List<Integer> rateShow = new ArrayList();
   @ModelColumnAnno(
      columnName = "extranote",
      comment = "额外说明"
   )
   private String extraNote;
   @ModelColumnAnno(
      comment = "鉴定进度"
   )
   private int identifyNum;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "售卖价格",
      columnName = "price"
   )
   private List<Integer> price = new ArrayList();
   @ModelColumnAnno(
      comment = "每日售卖上限"
   )
   private int limit;
   @ModelColumnAnno(
      comment = "保底史诗奇谋所需次数"
   )
   private int rareSkillTime;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "保底奇谋"
   )
   private List<Integer> rareMystic = new ArrayList();

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

   public List<Integer> getRateShow() {
      return this.rateShow;
   }

   public void setRateShow(List<Integer> rateShow) {
      this.checkModify();
      this.rateShow = rateShow;
   }

   public String getExtraNote() {
      return this.extraNote;
   }

   public void setExtraNote(String extraNote) {
      this.checkModify();
      this.extraNote = extraNote;
   }

   public int getIdentifyNum() {
      return this.identifyNum;
   }

   public void setIdentifyNum(int identifyNum) {
      this.checkModify();
      this.identifyNum = identifyNum;
   }

   public List<Integer> getPrice() {
      return this.price;
   }

   public void setPrice(List<Integer> price) {
      this.checkModify();
      this.price = price;
   }

   public int getLimit() {
      return this.limit;
   }

   public void setLimit(int limit) {
      this.checkModify();
      this.limit = limit;
   }

   public int getRareSkillTime() {
      return this.rareSkillTime;
   }

   public void setRareSkillTime(int rareSkillTime) {
      this.checkModify();
      this.rareSkillTime = rareSkillTime;
   }

   public List<Integer> getRareMystic() {
      return this.rareMystic;
   }

   public void setRareMystic(List<Integer> rareMystic) {
      this.checkModify();
      this.rareMystic = rareMystic;
   }
}
