package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "dragonMysticBook"
)
public class DragonMysticBookModel extends BaseModel {
   @ModelColumnAnno(
      comment = "点亮次数",
      isPrimaty = true
   )
   private int lightenNum;
   @ModelColumnAnno(
      comment = "奇书加成-基础奇书",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1
   )
   private List<PropertyModel> mysticbook = new ArrayList();

   public int getLightenNum() {
      return this.lightenNum;
   }

   public void setLightenNum(int lightenNum) {
      this.checkModify();
      this.lightenNum = lightenNum;
   }

   public List<PropertyModel> getMysticbook() {
      return this.mysticbook;
   }

   public void setMysticbook(List<PropertyModel> mysticbook) {
      this.checkModify();
      this.mysticbook = mysticbook;
   }
}
