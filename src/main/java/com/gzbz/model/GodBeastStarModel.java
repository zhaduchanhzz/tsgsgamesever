package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GodBeastStar"
)
public class GodBeastStarModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "升星参数"
   )
   private int upStarID;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "当前星级"
   )
   private int star;
   @ModelColumnAnno(
      comment = "下一星级参数"
   )
   private int nextStarID;
   @ModelColumnAnno(
      comment = "前置星级"
   )
   private int preStarID;
   @ModelColumnAnno(
      comment = "升星进度"
   )
   private int progress;
   @ModelColumnAnno(
      comment = "专属天赋技能"
   )
   private int talentSkill;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "星级属性"
   )
   private ArrayList<PropertyModel> upStar = new ArrayList();

   public int getUpStarID() {
      return this.upStarID;
   }

   public void setUpStarID(int upStarID) {
      this.checkModify();
      this.upStarID = upStarID;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getNextStarID() {
      return this.nextStarID;
   }

   public void setNextStarID(int nextStarID) {
      this.checkModify();
      this.nextStarID = nextStarID;
   }

   public int getPreStarID() {
      return this.preStarID;
   }

   public void setPreStarID(int preStarID) {
      this.checkModify();
      this.preStarID = preStarID;
   }

   public int getProgress() {
      return this.progress;
   }

   public void setProgress(int progress) {
      this.checkModify();
      this.progress = progress;
   }

   public int getTalentSkill() {
      return this.talentSkill;
   }

   public void setTalentSkill(int talentSkill) {
      this.checkModify();
      this.talentSkill = talentSkill;
   }

   public ArrayList<PropertyModel> getUpStar() {
      return this.upStar;
   }

   public void setUpStar(ArrayList<PropertyModel> upStar) {
      this.checkModify();
      this.upStar = upStar;
   }
}
