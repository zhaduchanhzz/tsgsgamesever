package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "offerhero"
)
public class OfferHeroModel extends BaseModel {
   @ModelColumnAnno(
      comment = "序号",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "怪物生成组"
   )
   private int heroGroup;
   @ModelColumnAnno(
      comment = "生成概率"
   )
   private int heroOdd;
   @ModelColumnAnno(
      comment = "怪物悬赏名"
   )
   private String heroName;
   @ModelColumnAnno(
      comment = "属性加成",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 4
   )
   private List<PropertyModel> property = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<OfferHeroModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         OfferHeroModel model = (OfferHeroModel)entry.getValue();
         ((List)tempMap.computeIfAbsent(model.getHeroGroup(), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customOfferHero", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getHeroGroup() {
      return this.heroGroup;
   }

   public void setHeroGroup(int heroGroup) {
      this.checkModify();
      this.heroGroup = heroGroup;
   }

   public int getHeroOdd() {
      return this.heroOdd;
   }

   public void setHeroOdd(int heroOdd) {
      this.checkModify();
      this.heroOdd = heroOdd;
   }

   public String getHeroName() {
      return this.heroName;
   }

   public void setHeroName(String heroName) {
      this.checkModify();
      this.heroName = heroName;
   }

   public List<PropertyModel> getProperty() {
      return this.property;
   }

   public void setProperty(List<PropertyModel> property) {
      this.checkModify();
      this.property = property;
   }
}
