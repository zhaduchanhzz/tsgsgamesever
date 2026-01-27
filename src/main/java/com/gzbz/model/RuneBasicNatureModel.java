package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "RuneBasicNature"
)
public class RuneBasicNatureModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "强化等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "对应部位"
   )
   private int seat;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "升级所需经验"
   )
   private int levelUpNeedEX;
   @ModelColumnAnno(
      comment = "吞噬提供经验"
   )
   private int proEX;
   @ModelColumnAnno(
      columnName = "pro",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "基础属性"
   )
   private ArrayList<PropertyModel> pro = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, RuneBasicNatureModel> level_seat_quality_model = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         RuneBasicNatureModel model = (RuneBasicNatureModel)entry.getValue();
         String mapKey = model.getLevel() + "_" + model.getSeat() + "_" + model.getQuality();
         level_seat_quality_model.put(mapKey, model);
      }

      pool.putMap("customRuneBasicNature", level_seat_quality_model);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getSeat() {
      return this.seat;
   }

   public void setSeat(int seat) {
      this.checkModify();
      this.seat = seat;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getLevelUpNeedEX() {
      return this.levelUpNeedEX;
   }

   public void setLevelUpNeedEX(int levelUpNeedEX) {
      this.checkModify();
      this.levelUpNeedEX = levelUpNeedEX;
   }

   public int getProEX() {
      return this.proEX;
   }

   public void setProEX(int proEX) {
      this.checkModify();
      this.proEX = proEX;
   }

   public ArrayList<PropertyModel> getPro() {
      return this.pro;
   }

   public void setPro(ArrayList<PropertyModel> pro) {
      this.checkModify();
      this.pro = pro;
   }
}
