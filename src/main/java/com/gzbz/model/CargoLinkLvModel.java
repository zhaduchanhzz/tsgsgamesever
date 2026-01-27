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
   file = "cargoLinkLv"
)
public class CargoLinkLvModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "等级"
   )
   private int level;
   @ModelColumnAnno(
      columnName = "101",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "快速小艇护卫奖励"
   )
   private List<ResourceModel> rewards101 = new ArrayList();
   @ModelColumnAnno(
      columnName = "201",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "载货快艇护卫奖励"
   )
   private List<ResourceModel> rewards201 = new ArrayList();
   @ModelColumnAnno(
      columnName = "301",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "单帆商船护卫奖励"
   )
   private List<ResourceModel> rewards301 = new ArrayList();
   @ModelColumnAnno(
      columnName = "401",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "豪华商船护卫奖励"
   )
   private List<ResourceModel> rewards401 = new ArrayList();
   @ModelColumnAnno(
      columnName = "501",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "豪华楼船护卫奖励"
   )
   private List<ResourceModel> rewards501 = new ArrayList();
   @ModelColumnAnno(
      columnName = "601",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "龙船护卫奖励"
   )
   private List<ResourceModel> rewards601 = new ArrayList();

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public List<ResourceModel> getRewards101() {
      return this.rewards101;
   }

   public void setRewards101(List<ResourceModel> rewards101) {
      this.checkModify();
      this.rewards101 = rewards101;
   }

   public List<ResourceModel> getRewards201() {
      return this.rewards201;
   }

   public void setRewards201(List<ResourceModel> rewards201) {
      this.checkModify();
      this.rewards201 = rewards201;
   }

   public List<ResourceModel> getRewards301() {
      return this.rewards301;
   }

   public void setRewards301(List<ResourceModel> rewards301) {
      this.checkModify();
      this.rewards301 = rewards301;
   }

   public List<ResourceModel> getRewards401() {
      return this.rewards401;
   }

   public void setRewards401(List<ResourceModel> rewards401) {
      this.checkModify();
      this.rewards401 = rewards401;
   }

   public List<ResourceModel> getRewards501() {
      return this.rewards501;
   }

   public void setRewards501(List<ResourceModel> rewards501) {
      this.checkModify();
      this.rewards501 = rewards501;
   }

   public List<ResourceModel> getRewards601() {
      return this.rewards601;
   }

   public void setRewards601(List<ResourceModel> rewards601) {
      this.rewards601 = rewards601;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, List<ResourceModel>>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         CargoLinkLvModel model = (CargoLinkLvModel)entry.getValue();
         ((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.level, (v) -> new ConcurrentHashMap())).put(101, model.getRewards101());
         ((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.level, (v) -> new ConcurrentHashMap())).put(201, model.getRewards201());
         ((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.level, (v) -> new ConcurrentHashMap())).put(301, model.getRewards301());
         ((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.level, (v) -> new ConcurrentHashMap())).put(401, model.getRewards401());
         ((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.level, (v) -> new ConcurrentHashMap())).put(501, model.getRewards501());
         ((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.level, (v) -> new ConcurrentHashMap())).put(601, model.getRewards601());
      }

      pool.putMap("customCargoLinkLv", tempHashMap);
   }
}
