package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "JiuZhouRankReward"
)
public class SupremePvpRankRewardModel extends SupremePvpRewardModel {
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 2,
      subCls = ResourceModel.class,
      columnName = "items"
   )
   private List<ResourceModel> rewards = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      loadCustom(pool, map, "customJiuZhouRankReward");
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }
}
