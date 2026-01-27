package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "shrineReturn"
)
public class ShrineReturnModel extends BaseModel {
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
      comment = "星数"
   )
   private int star;
   @ModelColumnAnno(
      comment = "本体碎片数量"
   )
   private int selfChipNum;
   @ModelColumnAnno(
      comment = "同阵营碎片数量"
   )
   private int nationChipNum;
   @ModelColumnAnno(
      comment = "礼盒数量"
   )
   private int giftBoxNum;
   @ModelColumnAnno(
      comment = "英魂数量"
   )
   private int materialHeroNum;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, ShrineReturnModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ShrineReturnModel model = (ShrineReturnModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.getType(), (v) -> new TreeMap())).put(model.getStar(), model);
      }

      pool.putMap("customShrineReturn", tempHashMap);
   }

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

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getSelfChipNum() {
      return this.selfChipNum;
   }

   public void setSelfChipNum(int selfChipNum) {
      this.checkModify();
      this.selfChipNum = selfChipNum;
   }

   public int getNationChipNum() {
      return this.nationChipNum;
   }

   public void setNationChipNum(int nationChipNum) {
      this.checkModify();
      this.nationChipNum = nationChipNum;
   }

   public int getGiftBoxNum() {
      return this.giftBoxNum;
   }

   public void setGiftBoxNum(int giftBoxNum) {
      this.checkModify();
      this.giftBoxNum = giftBoxNum;
   }

   public int getMaterialHeroNum() {
      return this.materialHeroNum;
   }

   public void setMaterialHeroNum(int materialHeroNum) {
      this.checkModify();
      this.materialHeroNum = materialHeroNum;
   }
}
