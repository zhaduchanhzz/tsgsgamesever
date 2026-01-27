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
   file = "WishstarAstrolabeItem"
)
public class WishstarAstrolabelItemModel extends BaseModel {
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
      comment = "奖励",
      columnConvertType = 2,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "数量上限"
   )
   private int upperLimit;
   @ModelColumnAnno(
      comment = "前置次数"
   )
   private int preposeNum;
   @ModelColumnAnno(
      comment = "对应替换"
   )
   private int replaceItem;
   @ModelColumnAnno(
      comment = "保底次数"
   )
   private int mustNum;
   @ModelColumnAnno(
      comment = "真实概率"
   )
   private int realOdd;
   @ModelColumnAnno(
      comment = "低保组"
   )
   private int dibaoGroup;
   @ModelColumnAnno(
      comment = "低保权重"
   )
   private int dibaoOdd;
   @ModelColumnAnno(
      comment = "是否全服记录"
   )
   private int isWholeServer;
   @ModelColumnAnno(
      comment = "获得N次物品后，恢复正常概率"
   )
   private int resumeNum;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, WishstarAstrolabelItemModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         WishstarAstrolabelItemModel model = (WishstarAstrolabelItemModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.getDateStart(), (v) -> new HashMap())).put(model.getId(), model);
      }

      pool.putMap("CustomWishstarAstrolabeItem", tempHashMap);
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

   public int getUpperLimit() {
      return this.upperLimit;
   }

   public void setUpperLimit(int upperLimit) {
      this.checkModify();
      this.upperLimit = upperLimit;
   }

   public int getPreposeNum() {
      return this.preposeNum;
   }

   public void setPreposeNum(int preposeNum) {
      this.checkModify();
      this.preposeNum = preposeNum;
   }

   public int getReplaceItem() {
      return this.replaceItem;
   }

   public void setReplaceItem(int replaceItem) {
      this.checkModify();
      this.replaceItem = replaceItem;
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

   public int getDibaoGroup() {
      return this.dibaoGroup;
   }

   public void setDibaoGroup(int dibaoGroup) {
      this.checkModify();
      this.dibaoGroup = dibaoGroup;
   }

   public int getDibaoOdd() {
      return this.dibaoOdd;
   }

   public void setDibaoOdd(int dibaoOdd) {
      this.checkModify();
      this.dibaoOdd = dibaoOdd;
   }

   public int getIsWholeServer() {
      return this.isWholeServer;
   }

   public void setIsWholeServer(int isWholeServer) {
      this.checkModify();
      this.isWholeServer = isWholeServer;
   }

   public int getResumeNum() {
      return this.resumeNum;
   }

   public void setResumeNum(int resumeNum) {
      this.checkModify();
      this.resumeNum = resumeNum;
   }
}
