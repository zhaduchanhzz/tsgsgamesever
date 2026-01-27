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
   file = "personExtraReward"
)
public class GeneralWelfareRewardModel extends BaseModel {
   public static final int TYPE_TOWER = 1;
   public static final int TYPE_TRAIL = 2;
   public static final int TYPE_UNDER_PALACE = 3;
   public static final int TYPE_GROW = 4;
   public static final int TYPE_LEVEL = 5;
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "全服购买次数"
   )
   private int buyNum;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "rewards1",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "奖励"
   )
   private List<ResourceModel> rewards1 = new ArrayList();
   @ModelColumnAnno(
      columnName = "buyItemId",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> buyItemId = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Integer> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         GeneralWelfareRewardModel model = (GeneralWelfareRewardModel)entry.getValue();
         if (model.buyItemId != null && !model.buyItemId.isEmpty()) {
            for(Integer trigger : model.buyItemId) {
               tempMap.put(trigger, model.type);
            }
         }
      }

      pool.putMap("customPersonExtraReward", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public int getType() {
      return this.type;
   }

   public int getBuyNum() {
      return this.buyNum;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public List<ResourceModel> getRewards1() {
      return this.rewards1;
   }

   public List<Integer> getBuyItemId() {
      return this.buyItemId;
   }
}
