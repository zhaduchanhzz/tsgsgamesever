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
   file = "prayRewardLib"
)
public class PrayRewardLibModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "组id"
   )
   private int groupId;
   @ModelColumnAnno(
      comment = "描述"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "物资类型，用于去重"
   )
   private int type;
   @ModelColumnAnno(
      comment = "奖励类型"
   )
   private int rewardType;
   @ModelColumnAnno(
      comment = "奖励id"
   )
   private int rewardId;
   @ModelColumnAnno(
      comment = "奖励数量"
   )
   private int rewardNum;
   @ModelColumnAnno(
      comment = "组内比重"
   )
   private int pro;
   @ModelColumnAnno(
      comment = "N次保底刷新必出"
   )
   private int limitNum;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<PrayRewardLibModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         PrayRewardLibModel model = (PrayRewardLibModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.getGroupId(), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("curtomPrayRewardLib", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroupId() {
      return this.groupId;
   }

   public void setGroupId(int groupId) {
      this.checkModify();
      this.groupId = groupId;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getRewardType() {
      return this.rewardType;
   }

   public void setRewardType(int rewardType) {
      this.checkModify();
      this.rewardType = rewardType;
   }

   public int getRewardId() {
      return this.rewardId;
   }

   public void setRewardId(int rewardId) {
      this.checkModify();
      this.rewardId = rewardId;
   }

   public int getRewardNum() {
      return this.rewardNum;
   }

   public void setRewardNum(int rewardNum) {
      this.checkModify();
      this.rewardNum = rewardNum;
   }

   public int getPro() {
      return this.pro;
   }

   public void setPro(int pro) {
      this.checkModify();
      this.pro = pro;
   }

   public int getLimitNum() {
      return this.limitNum;
   }

   public void setLimitNum(int limitNum) {
      this.checkModify();
      this.limitNum = limitNum;
   }
}
