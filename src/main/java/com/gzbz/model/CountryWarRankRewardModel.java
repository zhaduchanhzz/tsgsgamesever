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
   file = "countryWarRankreward"
)
public class CountryWarRankRewardModel extends BaseModel {
   public static int REWARD_TYPE_COUNTRY = 1;
   public static int REWARD_TYPE_OCCUPY = 2;
   public static int REWARD_TYPE_KILL = 3;
   public static int REWARD_TYPE_DAMAGE = 4;
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "奖励类型"
   )
   private int rewardtype;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "排名"
   )
   private List<Integer> rank = new ArrayList();
   @ModelColumnAnno(
      comment = "大标题"
   )
   private String title;
   @ModelColumnAnno(
      comment = "小标题"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "奖励道具",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5
   )
   private List<ResourceModel> rankreward = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, CountryWarRankRewardModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         CountryWarRankRewardModel model = (CountryWarRankRewardModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.rewardtype, (v) -> new ConcurrentHashMap())).put(model.id, model);
      }

      pool.putMap("coustomCountryWarRankreward", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getRewardtype() {
      return this.rewardtype;
   }

   public void setRewardtype(int rewardtype) {
      this.checkModify();
      this.rewardtype = rewardtype;
   }

   public List<Integer> getRank() {
      return this.rank;
   }

   public void setRank(List<Integer> rank) {
      this.checkModify();
      this.rank = rank;
   }

   public List<ResourceModel> getRankreward() {
      return this.rankreward;
   }

   public void setRankreward(List<ResourceModel> rankreward) {
      this.checkModify();
      this.rankreward = rankreward;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String title) {
      this.checkModify();
      this.title = title;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
