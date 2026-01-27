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
   file = "ProFusion"
)
public class ProFusionModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "类型1:主服奖励  类型2:比主服开服时间晚的从服的奖励  类型3:比主服开服时间早的从服的奖励"
   )
   private int type;
   @ModelColumnAnno(
      comment = "起始开服天数差"
   )
   private int openStartDay;
   @ModelColumnAnno(
      comment = "结束开服天数差"
   )
   private int openEndDay;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 2,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> rewards = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<ProFusionModel>> type_list = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ProFusionModel value = (ProFusionModel)entry.getValue();
         ((List)type_list.computeIfAbsent(value.getType(), (k) -> new ArrayList())).add(value);
      }

      pool.putMap("customProFusion", type_list);
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

   public int getOpenStartDay() {
      return this.openStartDay;
   }

   public void setOpenStartDay(int openStartDay) {
      this.checkModify();
      this.openStartDay = openStartDay;
   }

   public int getOpenEndDay() {
      return this.openEndDay;
   }

   public void setOpenEndDay(int openEndDay) {
      this.checkModify();
      this.openEndDay = openEndDay;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
