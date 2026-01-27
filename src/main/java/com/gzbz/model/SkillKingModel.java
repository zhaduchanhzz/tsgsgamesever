package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "skillKing"
)
public class SkillKingModel extends BaseModel {
   @ModelColumnAnno(
      comment = "君主id",
      isPrimaty = true
   )
   private int heroId;
   @ModelColumnAnno(
      comment = "nation"
   )
   private int nation;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 3,
      comment = "开场buff"
   )
   private ArrayList<PropertyModel> buffs = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 3,
      comment = "开场buff"
   )
   private ArrayList<PropertyModel> addBuffs = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 4,
      comment = "职业buff"
   )
   private HashMap<Integer, PropertyModel> occuBuffs = new HashMap();

   public int getHeroId() {
      return this.heroId;
   }

   public void setHeroId(int heroId) {
      this.checkModify();
      this.heroId = heroId;
   }

   public int getNation() {
      return this.nation;
   }

   public void setNation(int nation) {
      this.checkModify();
      this.nation = nation;
   }

   public ArrayList<PropertyModel> getBuffs() {
      return this.buffs;
   }

   public void setBuffs(ArrayList<PropertyModel> buffs) {
      this.checkModify();
      this.buffs = buffs;
   }

   public ArrayList<PropertyModel> getAddBuffs() {
      return this.addBuffs;
   }

   public void setAddBuffs(ArrayList<PropertyModel> addBuffs) {
      this.checkModify();
      this.addBuffs = addBuffs;
   }

   public HashMap<Integer, PropertyModel> getOccuBuffs() {
      return this.occuBuffs;
   }

   public void setOccuBuffs(HashMap<Integer, PropertyModel> occuBuffs) {
      this.checkModify();
      this.occuBuffs = occuBuffs;
   }
}
