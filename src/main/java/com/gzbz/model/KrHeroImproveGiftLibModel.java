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
   file = "heroImproveGiftLibKr"
)
public class KrHeroImproveGiftLibModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "武将id"
   )
   private int heroId;
   @ModelColumnAnno(
      comment = "武将星级要求"
   )
   private int heroStar;
   @ModelColumnAnno(
      comment = "免费奖励",
      columnConvertType = 2,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> freeReward = new ArrayList();
   @ModelColumnAnno(
      comment = "直购礼包奖励"
   )
   private int giftId;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, KrHeroImproveGiftLibModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         KrHeroImproveGiftLibModel model = (KrHeroImproveGiftLibModel)entry.getValue();
         ((ConcurrentHashMap)tempMap.computeIfAbsent(model.getHeroId(), (k) -> new ConcurrentHashMap())).put(model.getHeroStar(), model);
      }

      pool.putMap("customHeroImproveGiftLibKr", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getHeroId() {
      return this.heroId;
   }

   public void setHeroId(int heroId) {
      this.checkModify();
      this.heroId = heroId;
   }

   public int getHeroStar() {
      return this.heroStar;
   }

   public void setHeroStar(int heroStar) {
      this.checkModify();
      this.heroStar = heroStar;
   }

   public List<ResourceModel> getFreeReward() {
      return this.freeReward;
   }

   public void setFreeReward(List<ResourceModel> freeReward) {
      this.checkModify();
      this.freeReward = freeReward;
   }

   public int getGiftId() {
      return this.giftId;
   }

   public void setGiftId(int giftId) {
      this.checkModify();
      this.giftId = giftId;
   }
}
