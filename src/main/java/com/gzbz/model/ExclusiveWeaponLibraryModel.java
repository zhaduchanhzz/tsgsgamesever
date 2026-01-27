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
   file = "ExclusiveWeaponLibrary"
)
public class ExclusiveWeaponLibraryModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "下一级序号id"
   )
   private int nextId;
   @ModelColumnAnno(
      comment = "幻武id"
   )
   private int weaponId;
   @ModelColumnAnno(
      comment = "幻武名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "幻武星级"
   )
   private int star;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "额外属性"
   )
   private ArrayList<PropertyModel> extraAtt = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "特殊属性"
   )
   private ArrayList<PropertyModel> specialAtt = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, ExclusiveWeaponLibraryModel>> allMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ExclusiveWeaponLibraryModel model = (ExclusiveWeaponLibraryModel)entry.getValue();
         ((ConcurrentHashMap)allMap.computeIfAbsent(model.getWeaponId(), (v) -> new ConcurrentHashMap())).put(model.getStar(), model);
      }

      pool.putMap("customExclusiveWeaponLibrary", allMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
   }

   public int getWeaponId() {
      return this.weaponId;
   }

   public void setWeaponId(int weaponId) {
      this.checkModify();
      this.weaponId = weaponId;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public ArrayList<PropertyModel> getExtraAtt() {
      return this.extraAtt;
   }

   public void setExtraAtt(ArrayList<PropertyModel> extraAtt) {
      this.checkModify();
      this.extraAtt = extraAtt;
   }

   public ArrayList<PropertyModel> getSpecialAtt() {
      return this.specialAtt;
   }

   public void setSpecialAtt(ArrayList<PropertyModel> specialAtt) {
      this.checkModify();
      this.specialAtt = specialAtt;
   }
}
