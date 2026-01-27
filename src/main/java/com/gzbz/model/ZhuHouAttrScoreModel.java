package com.gzbz.model;

import cn.hutool.core.util.StrUtil;
import com.gzbz.model.manager.BaseModel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "heroGameAttrScore"
)
public class ZhuHouAttrScoreModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "排序"
   )
   private int id;
   @ModelColumnAnno(
      comment = "属性id"
   )
   private int attrId;
   @ModelColumnAnno(
      comment = "评分倍数"
   )
   private int score;
   @ModelColumnAnno(
      comment = "计算方式"
   )
   private int way;
   @ModelColumnAnno(
      comment = "修正值"
   )
   private int offsetValue;
   @ModelColumnAnno(
      comment = "修正类型"
   )
   private int offsetType;
   public static Map<String, ZhuHouAttrScoreModel> attrTypeMap = new HashMap();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      Map<String, ZhuHouAttrScoreModel> temp = new HashMap();
      map.forEach((key, value) -> {
         ZhuHouAttrScoreModel model = (ZhuHouAttrScoreModel)value;
         temp.put(StrUtil.format("{}_{}", new Object[]{model.getAttrId(), model.getWay()}), model);
      });
      attrTypeMap = Collections.unmodifiableMap(temp);
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

   public int getScore() {
      return this.score;
   }

   public void setScore(int score) {
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

   public int getWay() {
      return this.way;
   }

   public void setWay(int way) {
      this.way = way;
   }
}
