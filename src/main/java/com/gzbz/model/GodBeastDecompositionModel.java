package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
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
   file = "GodBeastDecomposition"
)
public class GodBeastDecompositionModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "灵兽id"
   )
   private int godBeastId;
   @ModelColumnAnno(
      comment = "灵兽资质评级"
   )
   private int qualificationScore;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "分解获得"
   )
   private List<ResourceModel> decomposeGet = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, GodBeastDecompositionModel> allMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         GodBeastDecompositionModel value = (GodBeastDecompositionModel)entry.getValue();
         String key = value.getGodBeastId() + "_" + value.getQualificationScore();
         allMap.put(key, value);
      }

      pool.putMap("customGodBeastDecomposition", allMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGodBeastId() {
      return this.godBeastId;
   }

   public void setGodBeastId(int godBeastId) {
      this.checkModify();
      this.godBeastId = godBeastId;
   }

   public int getQualificationScore() {
      return this.qualificationScore;
   }

   public void setQualificationScore(int qualificationScore) {
      this.checkModify();
      this.qualificationScore = qualificationScore;
   }

   public List<ResourceModel> getDecomposeGet() {
      return this.decomposeGet;
   }

   public void setDecomposeGet(List<ResourceModel> decomposeGet) {
      this.checkModify();
      this.decomposeGet = decomposeGet;
   }
}
