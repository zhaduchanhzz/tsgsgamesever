package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "YuanxiaoLotteryItem"
)
public class YuanxiaoLotteryItemModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "日期组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "日期组末尾"
   )
   private int dateEnd;
   @ModelColumnAnno(
      comment = "阶段起始天数"
   )
   private int stageStart;
   @ModelColumnAnno(
      comment = "阶段结尾天数"
   )
   private int stageEnd;
   @ModelColumnAnno(
      comment = "后端用阶段数"
   )
   private int stage;
   @ModelColumnAnno(
      comment = "道具组"
   )
   private int itemGroup;
   @ModelColumnAnno(
      comment = "心仪道具序号"
   )
   private int belovedItemID;
   @ModelColumnAnno(
      comment = "显示抽奖记录"
   )
   private int isShowRecord;
   @ModelColumnAnno(
      comment = "记录抽奖数据"
   )
   private int isRecord;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 2,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "前置次数"
   )
   private int preposeNum;
   @ModelColumnAnno(
      comment = "保底次数"
   )
   private int mustNum;
   @ModelColumnAnno(
      comment = "真实概率"
   )
   private int realOdd;
   @ModelColumnAnno(
      comment = "剩余数量"
   )
   private int surplusNum;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, YuanxiaoLotteryItemModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         YuanxiaoLotteryItemModel model = (YuanxiaoLotteryItemModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.getDateStart(), (v) -> new HashMap())).put(model.getId(), model);
      }

      pool.putMap("customYuanxiaoLotteryItem", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
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

   public int getStageStart() {
      return this.stageStart;
   }

   public void setStageStart(int stageStart) {
      this.checkModify();
      this.stageStart = stageStart;
   }

   public int getStageEnd() {
      return this.stageEnd;
   }

   public void setStageEnd(int stageEnd) {
      this.checkModify();
      this.stageEnd = stageEnd;
   }

   public int getStage() {
      return this.stage;
   }

   public void setStage(int stage) {
      this.checkModify();
      this.stage = stage;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getPreposeNum() {
      return this.preposeNum;
   }

   public void setPreposeNum(int preposeNum) {
      this.checkModify();
      this.preposeNum = preposeNum;
   }

   public int getMustNum() {
      return this.mustNum;
   }

   public void setMustNum(int mustNum) {
      this.checkModify();
      this.mustNum = mustNum;
   }

   public int getRealOdd() {
      return this.realOdd;
   }

   public void setRealOdd(int realOdd) {
      this.checkModify();
      this.realOdd = realOdd;
   }

   public int getItemGroup() {
      return this.itemGroup;
   }

   public void setItemGroup(int itemGroup) {
      this.checkModify();
      this.itemGroup = itemGroup;
   }

   public int getBelovedItemID() {
      return this.belovedItemID;
   }

   public void setBelovedItemID(int belovedItemID) {
      this.checkModify();
      this.belovedItemID = belovedItemID;
   }

   public int getIsShowRecord() {
      return this.isShowRecord;
   }

   public void setIsShowRecord(int isShowRecord) {
      this.checkModify();
      this.isShowRecord = isShowRecord;
   }

   public int getIsRecord() {
      return this.isRecord;
   }

   public void setIsRecord(int isRecord) {
      this.checkModify();
      this.isRecord = isRecord;
   }

   public int getSurplusNum() {
      return this.surplusNum;
   }

   public void setSurplusNum(int surplusNum) {
      this.checkModify();
      this.surplusNum = surplusNum;
   }
}
