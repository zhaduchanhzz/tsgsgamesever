package com.gzbz.model;

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
   file = "heroExchangeLib"
)
public class HeroExchangeLibModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "日期组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "日期组末尾"
   )
   private int dateEnd;
   @ModelColumnAnno(
      columnName = "excLibId",
      comment = "随机库ID"
   )
   private int excLibId;
   @ModelColumnAnno(
      columnName = "excHeroId",
      comment = "武将ID"
   )
   private int excHeroId;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      columnName = "probability",
      comment = "概率（千分比）"
   )
   private int probability;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<HeroExchangeLibModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         HeroExchangeLibModel model = (HeroExchangeLibModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.excLibId, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("custom_heroExchangeLib", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public void setDateStart(int dateStart) {
      this.checkModify();
      this.dateStart = dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public void setDateEnd(int dateEnd) {
      this.checkModify();
      this.dateEnd = dateEnd;
   }

   public int getExcLibId() {
      return this.excLibId;
   }

   public void setExcLibId(int excLibId) {
      this.checkModify();
      this.excLibId = excLibId;
   }

   public int getExcHeroId() {
      return this.excHeroId;
   }

   public void setExcHeroId(int excHeroId) {
      this.checkModify();
      this.excHeroId = excHeroId;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getProbability() {
      return this.probability;
   }

   public void setProbability(int probability) {
      this.checkModify();
      this.probability = probability;
   }
}
