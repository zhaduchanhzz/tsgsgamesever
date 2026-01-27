package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
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
   file = "starAspectrum"
)
public class StarAspectRumModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "星图id"
   )
   private int starMapId;
   @ModelColumnAnno(
      comment = "星点id"
   )
   private int starId;
   @ModelColumnAnno(
      comment = "解锁星点",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> unlockStarId = new ArrayList();
   @ModelColumnAnno(
      comment = "下一级id"
   )
   private int nextId;
   @ModelColumnAnno(
      comment = "升级星点需要的星图总等级"
   )
   private int needAllLevel;
   @ModelColumnAnno(
      comment = "解锁类型"
   )
   private int unlockType;
   @ModelColumnAnno(
      comment = "星点类型"
   )
   private int starType;
   @ModelColumnAnno(
      comment = "星点等级"
   )
   private int level;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "基础属性"
   )
   private ArrayList<PropertyModel> base = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, StarAspectRumModel>>> allMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         StarAspectRumModel value = (StarAspectRumModel)entry.getValue();
         ((ConcurrentHashMap)((ConcurrentHashMap)allMap.computeIfAbsent(value.getStarMapId(), (k) -> new ConcurrentHashMap())).computeIfAbsent(value.getStarId(), (k) -> new ConcurrentHashMap())).put(value.getLevel(), value);
      }

      pool.putMap("customStarAspectrum", allMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getStarMapId() {
      return this.starMapId;
   }

   public void setStarMapId(int starMapId) {
      this.checkModify();
      this.starMapId = starMapId;
   }

   public int getStarId() {
      return this.starId;
   }

   public void setStarId(int starId) {
      this.checkModify();
      this.starId = starId;
   }

   public List<Integer> getUnlockStarId() {
      return this.unlockStarId;
   }

   public void setUnlockStarId(List<Integer> unlockStarId) {
      this.checkModify();
      this.unlockStarId = unlockStarId;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
   }

   public int getNeedAllLevel() {
      return this.needAllLevel;
   }

   public void setNeedAllLevel(int needAllLevel) {
      this.checkModify();
      this.needAllLevel = needAllLevel;
   }

   public int getUnlockType() {
      return this.unlockType;
   }

   public void setUnlockType(int unlockType) {
      this.checkModify();
      this.unlockType = unlockType;
   }

   public int getStarType() {
      return this.starType;
   }

   public void setStarType(int starType) {
      this.checkModify();
      this.starType = starType;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public ArrayList<PropertyModel> getBase() {
      return this.base;
   }

   public void setBase(ArrayList<PropertyModel> base) {
      this.checkModify();
      this.base = base;
   }
}
