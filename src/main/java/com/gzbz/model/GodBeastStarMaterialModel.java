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
   file = "GodBeastStarMaterial"
)
public class GodBeastStarMaterialModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "材料id"
   )
   private int materialId;
   @ModelColumnAnno(
      comment = "神兽资质评级"
   )
   private int qualificationScore;
   @ModelColumnAnno(
      comment = "提供的升星进度"
   )
   private int programNum;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, GodBeastStarMaterialModel> allMap = new ConcurrentHashMap();
      ConcurrentHashMap<Integer, List<GodBeastStarMaterialModel>> type_listMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         GodBeastStarMaterialModel value = (GodBeastStarMaterialModel)entry.getValue();
         allMap.put(value.getMaterialId() + "_" + value.getQualificationScore(), value);
         ((List)type_listMap.computeIfAbsent(value.getType(), (k) -> new ArrayList())).add(value);
      }

      pool.putMap("customGodBeastStarMaterial", allMap);
      pool.putMap("customTypeGodBeastStarMaterial", type_listMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getMaterialId() {
      return this.materialId;
   }

   public void setMaterialId(int materialId) {
      this.checkModify();
      this.materialId = materialId;
   }

   public int getQualificationScore() {
      return this.qualificationScore;
   }

   public void setQualificationScore(int qualificationScore) {
      this.checkModify();
      this.qualificationScore = qualificationScore;
   }

   public int getProgramNum() {
      return this.programNum;
   }

   public void setProgramNum(int programNum) {
      this.checkModify();
      this.programNum = programNum;
   }
}
