package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroExchange"
)
public class HeroExchangeModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "排序ID"
   )
   private String id;
   @ModelColumnAnno(
      columnName = "heroFaction",
      comment = "被转换武将阵营"
   )
   private int heroFaction;
   @ModelColumnAnno(
      columnName = "heroStar",
      comment = "被转换武将星级"
   )
   private int heroStar;
   @ModelColumnAnno(
      columnName = "consumeItems",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "消耗道具"
   )
   private ArrayList<ResourceModel> consumeItems = new ArrayList();

   public String getId() {
      return this.id;
   }

   public void setId(String id) {
      this.checkModify();
      this.id = id;
   }

   public int getHeroFaction() {
      return this.heroFaction;
   }

   public void setHeroFaction(int heroFaction) {
      this.checkModify();
      this.heroFaction = heroFaction;
   }

   public int getHeroStar() {
      return this.heroStar;
   }

   public void setHeroStar(int heroStar) {
      this.checkModify();
      this.heroStar = heroStar;
   }

   public ArrayList<ResourceModel> getConsumeItems() {
      return this.consumeItems;
   }

   public void setConsumeItems(ArrayList<ResourceModel> consumeItems) {
      this.checkModify();
      this.consumeItems = consumeItems;
   }
}
