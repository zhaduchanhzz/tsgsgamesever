package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.spring.ApplicationContextProvider;
import com.yy.decisiveBattleMgr.CrossDecisiveRankData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import misc.ComparatorUtil;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DecisiveBattleRankReward"
)
public class DecisiveBattleRankRewardModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "开服天数组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "开服天数组末尾"
   )
   private int dateEnd;
   @ModelColumnAnno(
      comment = "排名区间下限"
   )
   private int rankItervallow;
   @ModelColumnAnno(
      comment = "排名区间上限"
   )
   private int rankItervalhigh;
   @ModelColumnAnno(
      comment = "排名显示"
   )
   private String rankShow;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "奖励"
   )
   private List<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      comment = "区间排名限制"
   )
   private int peopleNumLimitSum;

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

   public int getRankItervallow() {
      return this.rankItervallow;
   }

   public void setRankItervallow(int rankItervallow) {
      this.checkModify();
      this.rankItervallow = rankItervallow;
   }

   public int getRankItervalhigh() {
      return this.rankItervalhigh;
   }

   public void setRankItervalhigh(int rankItervalhigh) {
      this.checkModify();
      this.rankItervalhigh = rankItervalhigh;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public String getRankShow() {
      return this.rankShow;
   }

   public void setRankShow(String rankShow) {
      this.checkModify();
      this.rankShow = rankShow;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public void setDateEnd(int dateEnd) {
      this.checkModify();
      this.dateEnd = dateEnd;
   }

   public int getPeopleNumLimitSum() {
      return this.peopleNumLimitSum;
   }

   public void setPeopleNumLimitSum(int peopleNumLimitSum) {
      this.checkModify();
      this.peopleNumLimitSum = peopleNumLimitSum;
   }

   public static DecisiveBattleRankRewardModel getRankTargetId(int openServerDay, int rank) {
      List<DecisiveBattleRankRewardModel> tempList = new ArrayList();
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      Map<Integer, DecisiveBattleRankRewardModel> modelMap = gameModelPool.getMap("DecisiveBattleRankReward");

      for(DecisiveBattleRankRewardModel model : modelMap.values()) {
         if (openServerDay >= model.getDateStart() && (openServerDay <= model.getDateEnd() || model.getDateEnd() == -1)) {
            tempList.add(model);
         }
      }

      List<CrossDecisiveRankData> sortList = new ArrayList();

      for(DecisiveBattleRankRewardModel rewardModel : tempList) {
         CrossDecisiveRankData data = new CrossDecisiveRankData();
         data.id = rewardModel.id;
         data.point = rewardModel.getRankItervalhigh();
         sortList.add(data);
      }

      sortList.sort(ComparatorUtil.createComparatorByFiled(CrossDecisiveRankData.class, "point"));
      int tempSum = 0;

      for(CrossDecisiveRankData data : sortList) {
         DecisiveBattleRankRewardModel model = (DecisiveBattleRankRewardModel)modelMap.get(data.id);
         if (model.getPeopleNumLimitSum() == -1) {
            return model;
         }

         tempSum = model.getPeopleNumLimitSum();
         if (rank <= tempSum) {
            return model;
         }
      }

      return (DecisiveBattleRankRewardModel)modelMap.get(8);
   }
}
