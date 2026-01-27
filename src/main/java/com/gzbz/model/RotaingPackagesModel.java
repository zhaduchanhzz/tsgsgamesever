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
   file = "rotaingPackages"
)
public class RotaingPackagesModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "活动类型"
   )
   private int activityType;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String tips;
   @ModelColumnAnno(
      comment = "需求最低世界等级"
   )
   private int minLevel;
   @ModelColumnAnno(
      comment = "需求最高世界等级"
   )
   private int maxLevel;
   @ModelColumnAnno(
      comment = "初始开服天数"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "末尾开服天数"
   )
   private int dateEnd;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<RotaingPackagesModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         RotaingPackagesModel model = (RotaingPackagesModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.activityType, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customRotaingPackages", tempHashMap);
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public int getActivityType() {
      return this.activityType;
   }

   public void setActivityType(int activityType) {
      this.checkModify();
      this.activityType = activityType;
   }

   public String getTips() {
      return this.tips;
   }

   public void setTips(String tips) {
      this.checkModify();
      this.tips = tips;
   }

   public int getMinLevel() {
      return this.minLevel;
   }

   public void setMinLevel(int minLevel) {
      this.checkModify();
      this.minLevel = minLevel;
   }

   public int getMaxLevel() {
      return this.maxLevel;
   }

   public void setMaxLevel(int maxLevel) {
      this.checkModify();
      this.maxLevel = maxLevel;
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
}
