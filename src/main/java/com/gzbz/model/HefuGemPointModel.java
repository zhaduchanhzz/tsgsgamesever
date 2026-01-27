package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "HefuGemPoint"
)
public class HefuGemPointModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "宝石类型"
   )
   private int gemType;
   @ModelColumnAnno(
      comment = "宝石品质"
   )
   private int gemQuality;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "积分"
   )
   private int point;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, HefuGemPointModel> gemType_model = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         HefuGemPointModel value = (HefuGemPointModel)entry.getValue();
         gemType_model.put(value.getGemType(), value);
      }

      pool.putMap("HefuGemPoint", gemType_model);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGemType() {
      return this.gemType;
   }

   public void setGemType(int gemType) {
      this.checkModify();
      this.gemType = gemType;
   }

   public int getGemQuality() {
      return this.gemQuality;
   }

   public void setGemQuality(int gemQuality) {
      this.checkModify();
      this.gemQuality = gemQuality;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getPoint() {
      return this.point;
   }

   public void setPoint(int point) {
      this.checkModify();
      this.point = point;
   }
}
