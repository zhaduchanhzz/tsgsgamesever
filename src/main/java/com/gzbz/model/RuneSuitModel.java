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
   file = "RuneSuit"
)
public class RuneSuitModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "套装id"
   )
   private int suitId;
   @ModelColumnAnno(
      comment = "套装名称"
   )
   private String suitName;
   @ModelColumnAnno(
      comment = "2件套属性生效符文品质"
   )
   private int suitSkill2RuneQuality;
   @ModelColumnAnno(
      columnName = "suitSkill2",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "2件套加成属性"
   )
   private ArrayList<PropertyModel> suitSkill2 = new ArrayList();
   @ModelColumnAnno(
      comment = "4件套装生效的符文最低品质"
   )
   private int minRuneQuality;
   @ModelColumnAnno(
      comment = "4件套技能id"
   )
   private int suitSkill4;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, RuneSuitModel>> nature2AllMap = new ConcurrentHashMap();
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, RuneSuitModel>> skill4AllMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         RuneSuitModel value = (RuneSuitModel)entry.getValue();
         ((ConcurrentHashMap)nature2AllMap.computeIfAbsent(value.getSuitId(), (k) -> new ConcurrentHashMap())).put(value.getSuitSkill2RuneQuality(), value);
         ((ConcurrentHashMap)skill4AllMap.computeIfAbsent(value.getSuitId(), (k) -> new ConcurrentHashMap())).put(value.getMinRuneQuality(), value);
      }

      pool.putMap("customRuneSuitNature2", nature2AllMap);
      pool.putMap("customRuneSuitSkill4", skill4AllMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getSuitId() {
      return this.suitId;
   }

   public void setSuitId(int suitId) {
      this.checkModify();
      this.suitId = suitId;
   }

   public String getSuitName() {
      return this.suitName;
   }

   public void setSuitName(String suitName) {
      this.checkModify();
      this.suitName = suitName;
   }

   public int getSuitSkill2RuneQuality() {
      return this.suitSkill2RuneQuality;
   }

   public void setSuitSkill2RuneQuality(int suitSkill2RuneQuality) {
      this.checkModify();
      this.suitSkill2RuneQuality = suitSkill2RuneQuality;
   }

   public ArrayList<PropertyModel> getSuitSkill2() {
      return this.suitSkill2;
   }

   public void setSuitSkill2(ArrayList<PropertyModel> suitSkill2) {
      this.checkModify();
      this.suitSkill2 = suitSkill2;
   }

   public int getMinRuneQuality() {
      return this.minRuneQuality;
   }

   public void setMinRuneQuality(int minRuneQuality) {
      this.checkModify();
      this.minRuneQuality = minRuneQuality;
   }

   public int getSuitSkill4() {
      return this.suitSkill4;
   }

   public void setSuitSkill4(int suitSkill4) {
      this.checkModify();
      this.suitSkill4 = suitSkill4;
   }
}
