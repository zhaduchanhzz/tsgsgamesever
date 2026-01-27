package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "artifactexchange"
)
public class ArtifactExchangeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "物品ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "exchange",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "转化物品"
   )
   private List<ResourceModel> exchange = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<ResourceModel> getExchange() {
      return this.exchange;
   }

   public void setExchange(List<ResourceModel> exchange) {
      this.checkModify();
      this.exchange = exchange;
   }
}
