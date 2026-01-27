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
   file = "GodBeastNeiDanGroup"
)
public class GodBeastNeiDanGroupModel extends BaseModel {
   @ModelColumnAnno(
      comment = "id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "种类构成"
   )
   private List<Integer> types = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "阶级技能效果"
   )
   private List<Integer> stageSkill = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom1(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, List<GodBeastNeiDanGroupModel>> mainTypeId_list = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         GodBeastNeiDanGroupModel groupModel = (GodBeastNeiDanGroupModel)entry.getValue();
         List<Integer> types = groupModel.getTypes();
         if (types.size() >= 2) {
            String key = groupModel.getTypes().get(0) + "_" + groupModel.getTypes().get(1);
            ((List)mainTypeId_list.computeIfAbsent(key, (k) -> new ArrayList())).add(groupModel);
         }
      }

      pool.putMap("customGodBeastNeiDanGroup", mainTypeId_list);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<Integer> getTypes() {
      return this.types;
   }

   public void setTypes(List<Integer> types) {
      this.checkModify();
      this.types = types;
   }

   public List<Integer> getStageSkill() {
      return this.stageSkill;
   }

   public void setStageSkill(List<Integer> stageSkill) {
      this.checkModify();
      this.stageSkill = stageSkill;
   }
}
