package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "TongQueChongXing"
)
public class TongqueChongxingModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "level",
      isPrimaty = true,
      comment = "宠幸等级"
   )
   private int level;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1,
      comment = "属性增加"
   )
   private List<PropertyModel> strong = new ArrayList();
   @ModelColumnAnno(
      columnName = "consts",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "消耗"
   )
   private List<ResourceModel> consts = new ArrayList();
   @ModelColumnAnno(
      columnName = "lvLimit",
      comment = "幽会等级限制"
   )
   private int lvLimit;

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public List<PropertyModel> getStrong() {
      return this.strong;
   }

   public void setStrong(List<PropertyModel> strong) {
      this.checkModify();
      this.strong = strong;
   }

   public List<ResourceModel> getConsts() {
      return this.consts;
   }

   public void setConsts(List<ResourceModel> consts) {
      this.checkModify();
      this.consts = consts;
   }

   public int getLvLimit() {
      return this.lvLimit;
   }

   public void setLvLimit(int lvLimit) {
      this.checkModify();
      this.lvLimit = lvLimit;
   }
}
