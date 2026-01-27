package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
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
   file = "heroDressStrong"
)
public class HeroDressStrongModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "type",
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "skinId",
      comment = "皮肤ID"
   )
   private int skinId;
   @ModelColumnAnno(
      columnName = "name",
      comment = "皮肤名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "lv",
      comment = "时装等级"
   )
   private int lv;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "类型2回退"
   )
   private List<ResourceModel> backoff = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "强化消耗"
   )
   private List<ResourceModel> consumes = new ArrayList();
   @ModelColumnAnno(
      columnName = "StrongFun",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 3,
      comment = "强化"
   )
   private ArrayList<PropertyModel> properties = new ArrayList();
   @ModelColumnAnno(
      columnName = "StrongAllFun",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2,
      comment = "典藏皮肤强化"
   )
   private ArrayList<PropertyModel> StrongAllFun = new ArrayList();
   @ModelColumnAnno(
      columnName = "StrongHpfull",
      comment = "全队属性加成生命"
   )
   private int StrongHpfull;
   @ModelColumnAnno(
      columnName = "StrongAtkfull",
      comment = "全队属性加成攻击"
   )
   private int StrongAtkfull;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, HeroDressStrongModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         HeroDressStrongModel model = (HeroDressStrongModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.skinId, (v) -> new TreeMap())).put(model.lv, model);
      }

      pool.putMap("customHeroDressStrong", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getSkinId() {
      return this.skinId;
   }

   public void setSkinId(int skinId) {
      this.checkModify();
      this.skinId = skinId;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public List<ResourceModel> getConsumes() {
      return this.consumes;
   }

   public void setConsumes(List<ResourceModel> consumes) {
      this.checkModify();
      this.consumes = consumes;
   }

   public ArrayList<PropertyModel> getProperties() {
      return this.properties;
   }

   public void setProperties(ArrayList<PropertyModel> properties) {
      this.checkModify();
      this.properties = properties;
   }

   public int getStrongHpfull() {
      return this.StrongHpfull;
   }

   public void setStrongHpfull(int strongHpfull) {
      this.checkModify();
      this.StrongHpfull = strongHpfull;
   }

   public int getStrongAtkfull() {
      return this.StrongAtkfull;
   }

   public void setStrongAtkfull(int strongAtkfull) {
      this.checkModify();
      this.StrongAtkfull = strongAtkfull;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public List<ResourceModel> getBackoff() {
      return this.backoff;
   }

   public void setBackoff(List<ResourceModel> backoff) {
      this.checkModify();
      this.backoff = backoff;
   }

   public ArrayList<PropertyModel> getStrongAllFun() {
      return this.StrongAllFun;
   }

   public void setStrongAllFun(ArrayList<PropertyModel> strongAllFun) {
      this.checkModify();
      this.StrongAllFun = strongAllFun;
   }
}
