package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "DragonVeinAttrScore"
)
public class DragonVeinAttrScoreModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "排序"
   )
   private int id;
   @ModelColumnAnno(
      comment = "枭雄属性id"
   )
   private int attrId;
   @ModelColumnAnno(
      comment = "计算方式"
   )
   private int attrWay;
   @ModelColumnAnno(
      comment = "评分倍数"
   )
   private String score;
   @ModelColumnAnno(
      comment = "修正值"
   )
   private int offsetValue;
   @ModelColumnAnno(
      comment = "修正类型"
   )
   private int offsetType;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, DragonVeinAttrScoreModel> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         DragonVeinAttrScoreModel model = (DragonVeinAttrScoreModel)entry.getValue();
         String key = model.getAttrId() + "_" + model.getAttrWay();
         tempMap.put(key, model);
      }

      pool.putMap("customDragonVeinAttrScore", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getAttrId() {
      return this.attrId;
   }

   public void setAttrId(int attrId) {
      this.attrId = attrId;
   }

   public int getAttrWay() {
      return this.attrWay;
   }

   public void setAttrWay(int attrWay) {
      this.attrWay = attrWay;
   }

   public String getScore() {
      return this.score;
   }

   public void setScore(String score) {
      this.score = score;
   }

   public int getOffsetValue() {
      return this.offsetValue;
   }

   public void setOffsetValue(int offsetValue) {
      this.offsetValue = offsetValue;
   }

   public int getOffsetType() {
      return this.offsetType;
   }

   public void setOffsetType(int offsetType) {
      this.offsetType = offsetType;
   }
}
