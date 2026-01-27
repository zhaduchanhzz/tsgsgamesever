package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "specialAward"
)
public class SpecialAwardModel extends BaseModel {
   @ModelColumnAnno(
      comment = "id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "名字"
   )
   private String name;
   @ModelColumnAnno(
      comment = "物品",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 10
   )
   private List<ResourceModel> resource = new ArrayList();

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

   public List<ResourceModel> getResource() {
      return this.resource;
   }

   public void setResource(List<ResourceModel> resource) {
      this.checkModify();
      this.resource = resource;
   }
}
