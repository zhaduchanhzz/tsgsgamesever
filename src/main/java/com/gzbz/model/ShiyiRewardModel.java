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
   file = "shiyiReward"
)
public class ShiyiRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "定制组"
   )
   private int group;
   @ModelColumnAnno(
      comment = "物品列表",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> item = new ArrayList();
   @ModelColumnAnno(
      comment = "购买消耗列表",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> buyArticle = new ArrayList();
   @ModelColumnAnno(
      comment = "vip限制"
   )
   private int vip;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<ShiyiRewardModel>> group_shiyiRewardModel = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ShiyiRewardModel value = (ShiyiRewardModel)entry.getValue();
         ((List)group_shiyiRewardModel.computeIfAbsent(value.getGroup(), (k) -> new ArrayList())).add(value);
      }

      pool.putMap("shiyiRewardCustom", group_shiyiRewardModel);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.checkModify();
      this.group = group;
   }

   public List<ResourceModel> getItem() {
      return this.item;
   }

   public void setItem(List<ResourceModel> item) {
      this.checkModify();
      this.item = item;
   }

   public List<ResourceModel> getBuyArticle() {
      return this.buyArticle;
   }

   public void setBuyArticle(List<ResourceModel> buyArticle) {
      this.checkModify();
      this.buyArticle = buyArticle;
   }

   public int getVip() {
      return this.vip;
   }

   public void setVip(int vip) {
      this.checkModify();
      this.vip = vip;
   }
}
