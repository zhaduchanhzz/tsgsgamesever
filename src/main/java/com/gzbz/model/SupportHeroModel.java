package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "supportHero"
)
public class SupportHeroModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "职业"
   )
   private int type;
   @ModelColumnAnno(
      comment = "星级"
   )
   private int star;
   @ModelColumnAnno(
      comment = "加成属性"
   )
   private int addpro;
   @ModelColumnAnno(
      comment = "计算方式"
   )
   private int addway;
   @ModelColumnAnno(
      comment = "加成比例"
   )
   private int addper;
   @ModelColumnAnno(
      comment = "加成buff"
   )
   private int buff;

   public int getId() {
      return this.id;
   }

   public int getType() {
      return this.type;
   }

   public int getStar() {
      return this.star;
   }

   public int getBuff() {
      return this.buff;
   }

   public int getAddpro() {
      return this.addpro;
   }

   public int getAddway() {
      return this.addway;
   }

   public int getAddper() {
      return this.addper;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public void setAddpro(int addpro) {
      this.checkModify();
      this.addpro = addpro;
   }

   public void setAddway(int addway) {
      this.checkModify();
      this.addway = addway;
   }

   public void setAddper(int addper) {
      this.checkModify();
      this.addper = addper;
   }

   public void setBuff(int buff) {
      this.checkModify();
      this.buff = buff;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, HashMap<Integer, SupportHeroModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         SupportHeroModel supportHeroModel = (SupportHeroModel)entry.getValue();
         ((HashMap)tempHashMap.computeIfAbsent(supportHeroModel.type, (v) -> new HashMap())).put(supportHeroModel.star, supportHeroModel);
      }

      pool.putMap("supportHeroMap", tempHashMap);
   }
}
