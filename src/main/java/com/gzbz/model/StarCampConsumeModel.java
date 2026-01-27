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
   file = "starCampConsume"
)
public class StarCampConsumeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "阵营"
   )
   private int camp;
   @ModelColumnAnno(
      comment = "武将类型"
   )
   private int heroType;
   @ModelColumnAnno(
      comment = "星点等级"
   )
   private int level;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "消耗材料"
   )
   private List<ResourceModel> consumes = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "消耗返还"
   )
   private List<ResourceModel> PayBack = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, StarCampConsumeModel>>> allMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         StarCampConsumeModel value = (StarCampConsumeModel)entry.getValue();
         ((ConcurrentHashMap)((ConcurrentHashMap)allMap.computeIfAbsent(value.getHeroType(), (k) -> new ConcurrentHashMap())).computeIfAbsent(value.getCamp(), (k) -> new ConcurrentHashMap())).put(value.getLevel(), value);
      }

      pool.putMap("customStarCampConsume", allMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getCamp() {
      return this.camp;
   }

   public void setCamp(int camp) {
      this.checkModify();
      this.camp = camp;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public List<ResourceModel> getConsumes() {
      return this.consumes;
   }

   public void setConsumes(List<ResourceModel> consumes) {
      this.checkModify();
      this.consumes = consumes;
   }

   public int getHeroType() {
      return this.heroType;
   }

   public void setHeroType(int heroType) {
      this.checkModify();
      this.heroType = heroType;
   }

   public List<ResourceModel> getPayBack() {
      return this.PayBack;
   }

   public void setPayBack(List<ResourceModel> payBack) {
      this.checkModify();
      this.PayBack = payBack;
   }
}
