package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "battleHeroTrainingBuff"
)
public class BattleHeroTrainingBuffModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "buff类型"
   )
   private int buffType;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 3,
      comment = "开场buff"
   )
   private ArrayList<PropertyModel> buffs = new ArrayList();
   @ModelColumnAnno(
      comment = "buff描述"
   )
   private String desc;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getBuffType() {
      return this.buffType;
   }

   public void setBuffType(int buffType) {
      this.checkModify();
      this.buffType = buffType;
   }

   public ArrayList<PropertyModel> getBuffs() {
      return this.buffs;
   }

   public void setBuffs(ArrayList<PropertyModel> buffs) {
      this.checkModify();
      this.buffs = buffs;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
