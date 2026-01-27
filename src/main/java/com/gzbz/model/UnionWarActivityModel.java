package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "unionWarActivity"
)
public class UnionWarActivityModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "开服时间",
      columnConvertType = 2,
      subCls = Integer.class,
      count = 2
   )
   private List<Integer> activityTime = new ArrayList();
   @ModelColumnAnno(
      comment = "参与匹配的活跃人数限制"
   )
   private int activityMember;
   @ModelColumnAnno(
      comment = "军团争霸计算活跃玩家离线时间（单位：小时）"
   )
   private int unionWarActiveCondition;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, UnionWarActivityModel>> tempHashMap = new ConcurrentHashMap();
      TreeSet<?> idSet = new TreeSet(map.keySet());
      TreeMap<Integer, UnionWarActivityModel> modelTreeMap = new TreeMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         UnionWarActivityModel model = (UnionWarActivityModel)entry.getValue();
         if (idSet.last().equals(entry.getKey())) {
            modelTreeMap.put(model.activityTime.get(0), model);
         } else {
            for(int serverDay = (Integer)model.activityTime.get(0); serverDay <= (Integer)model.activityTime.get(1); ++serverDay) {
               modelTreeMap.put(serverDay, model);
            }
         }
      }

      tempHashMap.put(0, modelTreeMap);
      pool.putMap("customUnionWarActivity", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public List<Integer> getActivityTime() {
      return this.activityTime;
   }

   public void setActivityTime(List<Integer> activityTime) {
      this.activityTime = activityTime;
   }

   public int getActivityMember() {
      return this.activityMember;
   }

   public void setActivityMember(int activityMember) {
      this.activityMember = activityMember;
   }

   public int getUnionWarActiveCondition() {
      return this.unionWarActiveCondition;
   }

   public void setUnionWarActiveCondition(int unionWarActiveCondition) {
      this.unionWarActiveCondition = unionWarActiveCondition;
   }
}
