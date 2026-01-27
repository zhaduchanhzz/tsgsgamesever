package com.gzbz.model;

import com.gzbz.model.fun.PropertyExtModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "CargoShipAdd"
)
public class CargoShipAddModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "祭坛编号"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "iconid",
      comment = "祭祀buff图标"
   )
   private int iconId;
   @ModelColumnAnno(
      columnName = "level",
      comment = "等级"
   )
   private int level;
   @ModelColumnAnno(
      columnName = "name",
      comment = "祭坛名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "WindType",
      comment = "风的类型"
   )
   private int windType;
   @ModelColumnAnno(
      columnName = "exp",
      comment = "对应经验"
   )
   private int exp;
   @ModelColumnAnno(
      columnName = "buffs",
      columnConvertType = 1,
      subCls = PropertyExtModel.class,
      comment = "祭祀buff",
      count = 1
   )
   private List<PropertyExtModel> buffs = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, CargoShipAddModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         CargoShipAddModel model = (CargoShipAddModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.windType, (v) -> new TreeMap())).put(model.id, model);
      }

      pool.putMap("customCargoShipAdd", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getIconId() {
      return this.iconId;
   }

   public void setIconId(int iconId) {
      this.checkModify();
      this.iconId = iconId;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getWindType() {
      return this.windType;
   }

   public void setWindType(int windType) {
      this.checkModify();
      this.windType = windType;
   }

   public int getExp() {
      return this.exp;
   }

   public void setExp(int exp) {
      this.checkModify();
      this.exp = exp;
   }

   public List<PropertyExtModel> getBuffs() {
      return this.buffs;
   }

   public void setBuffs(List<PropertyExtModel> buffs) {
      this.checkModify();
      this.buffs = buffs;
   }
}
