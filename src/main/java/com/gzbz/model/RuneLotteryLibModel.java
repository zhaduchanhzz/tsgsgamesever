package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "RuneLotteryLib"
)
public class RuneLotteryLibModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "抽奖库ID"
   )
   private int libId;
   @ModelColumnAnno(
      comment = "道具类型"
   )
   private int itemType;
   @ModelColumnAnno(
      comment = "道具ID"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "道具数量"
   )
   private int itemNum;
   @ModelColumnAnno(
      comment = "概率（万分比）"
   )
   private int rate;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String desc;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, RuneLotteryLibModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         RuneLotteryLibModel model = (RuneLotteryLibModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.libId, (v) -> new ConcurrentHashMap())).put(model.id, model);
      }

      pool.putMap("customRuneLotteryLib", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getLibId() {
      return this.libId;
   }

   public void setLibId(int libId) {
      this.checkModify();
      this.libId = libId;
   }

   public int getItemType() {
      return this.itemType;
   }

   public void setItemType(int itemType) {
      this.checkModify();
      this.itemType = itemType;
   }

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }

   public int getItemNum() {
      return this.itemNum;
   }

   public void setItemNum(int itemNum) {
      this.checkModify();
      this.itemNum = itemNum;
   }

   public int getRate() {
      return this.rate;
   }

   public void setRate(int rate) {
      this.checkModify();
      this.rate = rate;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
