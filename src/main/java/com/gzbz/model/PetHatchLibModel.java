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
   file = "petHatchLib"
)
public class PetHatchLibModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "eggLibId",
      comment = "关联神兽蛋id组"
   )
   private int eggLibId;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      columnName = "petId",
      comment = "神兽id"
   )
   private int petId;
   @ModelColumnAnno(
      columnName = "odds",
      comment = "概率"
   )
   private int odds;
   @ModelColumnAnno(
      columnName = "footNum",
      comment = "保底次数"
   )
   private int footNum;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getEggLibId() {
      return this.eggLibId;
   }

   public void setEggLibId(int eggLibId) {
      this.checkModify();
      this.eggLibId = eggLibId;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getPetId() {
      return this.petId;
   }

   public void setPetId(int petId) {
      this.checkModify();
      this.petId = petId;
   }

   public int getOdds() {
      return this.odds;
   }

   public void setOdds(int odds) {
      this.checkModify();
      this.odds = odds;
   }

   public int getFootNum() {
      return this.footNum;
   }

   public void setFootNum(int footNum) {
      this.checkModify();
      this.footNum = footNum;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<PetHatchLibModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         PetHatchLibModel model = (PetHatchLibModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.eggLibId, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customPetHatchLib", tempHashMap);
   }
}
