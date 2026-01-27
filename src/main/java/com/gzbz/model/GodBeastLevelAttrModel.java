package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GodBeastLevelAttr"
)
public class GodBeastLevelAttrModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "总评级id"
   )
   private int id;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "基础属性"
   )
   private ArrayList<PropertyModel> baseAtt = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "基础属性"
   )
   private ArrayList<PropertyModel> lvAtt = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "星级对应的等级上限,星级为集合下标"
   )
   private List<Integer> lvLimit = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public ArrayList<PropertyModel> getBaseAtt() {
      return this.baseAtt;
   }

   public void setBaseAtt(ArrayList<PropertyModel> baseAtt) {
      this.checkModify();
      this.baseAtt = baseAtt;
   }

   public ArrayList<PropertyModel> getLvAtt() {
      return this.lvAtt;
   }

   public void setLvAtt(ArrayList<PropertyModel> lvAtt) {
      this.checkModify();
      this.lvAtt = lvAtt;
   }

   public List<Integer> getLvLimit() {
      return this.lvLimit;
   }

   public void setLvLimit(List<Integer> lvLimit) {
      this.checkModify();
      this.lvLimit = lvLimit;
   }
}
