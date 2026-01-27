package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "northChapterBox"
)
public class NorthChapterBoxModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "宝箱描述"
   )
   private String name;
   @ModelColumnAnno(
      comment = "章节id"
   )
   private int sectionId;
   @ModelColumnAnno(
      comment = "目标星数"
   )
   private int star;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "宝箱奖励"
   )
   private List<ResourceModel> boxRewards = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, NorthChapterBoxModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         NorthChapterBoxModel model = (NorthChapterBoxModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.sectionId, (v) -> new TreeMap())).put(model.id, model);
      }

      pool.putMap("customNorthChapterBox", tempHashMap);
   }

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

   public int getSectionId() {
      return this.sectionId;
   }

   public void setSectionId(int sectionId) {
      this.checkModify();
      this.sectionId = sectionId;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public List<ResourceModel> getBoxRewards() {
      return this.boxRewards;
   }

   public void setBoxRewards(List<ResourceModel> boxRewards) {
      this.checkModify();
      this.boxRewards = boxRewards;
   }
}
