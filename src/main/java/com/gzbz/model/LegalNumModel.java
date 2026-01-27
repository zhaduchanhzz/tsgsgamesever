package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "legalNum"
)
public class LegalNumModel extends BaseModel {
   @ModelColumnAnno(
      comment = "序号",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "物品id"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "单次最大合理数量"
   )
   private int num;
   @ModelColumnAnno(
      comment = "当天获得最大合理数"
   )
   private int totalNum;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String desc;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }

   public int getNum() {
      return this.num;
   }

   public void setNum(int num) {
      this.checkModify();
      this.num = num;
   }

   public int getTotalNum() {
      return this.totalNum;
   }

   public void setTotalNum(int totalNum) {
      this.checkModify();
      this.totalNum = totalNum;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, HashMap<Integer, LegalNumModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         LegalNumModel model = (LegalNumModel)entry.getValue();
         ((HashMap)tempHashMap.computeIfAbsent(model.type, (v) -> new HashMap())).put(model.itemId, model);
      }

      pool.putMap("customLegalNum", tempHashMap);
   }
}
