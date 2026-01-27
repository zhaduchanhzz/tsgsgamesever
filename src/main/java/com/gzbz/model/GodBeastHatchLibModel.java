package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "GodBeastHatchLib"
)
public class GodBeastHatchLibModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "随机库id组"
   )
   private int libId;
   @ModelColumnAnno(
      comment = "神兽id"
   )
   private int godBeastID;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int odds;
   @ModelColumnAnno(
      comment = "红色神兽前置次数"
   )
   private int lockNum;
   @ModelColumnAnno(
      comment = "资质随机库"
   )
   private int aptitude;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ArrayList<GodBeastHatchLibModel>> allMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         GodBeastHatchLibModel value = (GodBeastHatchLibModel)entry.getValue();
         ((ArrayList)allMap.computeIfAbsent(value.getLibId(), (k) -> new ArrayList())).add(value);
      }

      pool.putMap("customGodBeastHatchLib", allMap);
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

   public int getGodBeastID() {
      return this.godBeastID;
   }

   public void setGodBeastID(int godBeastID) {
      this.checkModify();
      this.godBeastID = godBeastID;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getOdds() {
      return this.odds;
   }

   public void setOdds(int odds) {
      this.checkModify();
      this.odds = odds;
   }

   public int getLockNum() {
      return this.lockNum;
   }

   public void setLockNum(int lockNum) {
      this.checkModify();
      this.lockNum = lockNum;
   }

   public int getAptitude() {
      return this.aptitude;
   }

   public void setAptitude(int aptitude) {
      this.checkModify();
      this.aptitude = aptitude;
   }
}
