package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "aidechange"
)
public class AideChangeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "quailty",
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "星级"
   )
   private int star;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "转换需要材料"
   )
   private final List<ResourceModel> item = new ArrayList();

   public int getId() {
      return this.id;
   }

   public int getQuality() {
      return this.quality;
   }

   public int getStar() {
      return this.star;
   }

   public List<ResourceModel> getItem() {
      return this.item;
   }
}
