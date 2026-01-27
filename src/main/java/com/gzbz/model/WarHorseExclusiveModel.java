package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warHorseExclusive"
)
public class WarHorseExclusiveModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "战马id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "heroId",
      comment = "对应英雄"
   )
   private int heroId;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "定制技能id"
   )
   private List<Integer> horseSkillId = new ArrayList();
   @ModelColumnAnno(
      columnName = "extraAtt",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2,
      comment = "额外属性"
   )
   private List<PropertyModel> extraAtt = new ArrayList();
   @ModelColumnAnno(
      columnName = "wakenExtraAtt",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2,
      comment = "觉醒额外属性"
   )
   private List<PropertyModel> wakenExtraAtt = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "回溯道具"
   )
   private List<Integer> rebackItem = new ArrayList();

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

   public List<Integer> getHorseSkillId() {
      return this.horseSkillId;
   }

   public void setHorseSkillId(List<Integer> horseSkillId) {
      this.checkModify();
      this.horseSkillId = horseSkillId;
   }

   public List<PropertyModel> getExtraAtt() {
      return this.extraAtt;
   }

   public void setExtraAtt(List<PropertyModel> extraAtt) {
      this.checkModify();
      this.extraAtt = extraAtt;
   }

   public List<PropertyModel> getWakenExtraAtt() {
      return this.wakenExtraAtt;
   }

   public void setWakenExtraAtt(List<PropertyModel> wakenExtraAtt) {
      this.checkModify();
      this.wakenExtraAtt = wakenExtraAtt;
   }

   public List<Integer> getRebackItem() {
      return this.rebackItem;
   }

   public void setRebackItem(List<Integer> rebackItem) {
      this.checkModify();
      this.rebackItem = rebackItem;
   }
}
