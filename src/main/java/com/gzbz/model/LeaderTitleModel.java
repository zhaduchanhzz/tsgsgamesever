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
   file = "leaderTitle"
)
public class LeaderTitleModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "阶级"
   )
   private int breach;
   @ModelColumnAnno(
      comment = "等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "下一级"
   )
   private int next;
   @ModelColumnAnno(
      comment = "学习所需玩家战力"
   )
   private int needPower;
   @ModelColumnAnno(
      comment = "学习所需玩家等级"
   )
   private int needPlayerLv;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "学习消耗"
   )
   private List<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      columnName = "addPro",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1,
      comment = "装备加成"
   )
   private List<PropertyModel> addPro = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, LeaderTitleModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         LeaderTitleModel model = (LeaderTitleModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.getBreach(), (v) -> new TreeMap())).put(model.getId(), model);
      }

      pool.putMap("customLeaderTitle", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getBreach() {
      return this.breach;
   }

   public void setBreach(int breach) {
      this.checkModify();
      this.breach = breach;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getNext() {
      return this.next;
   }

   public void setNext(int next) {
      this.checkModify();
      this.next = next;
   }

   public int getNeedPower() {
      return this.needPower;
   }

   public void setNeedPower(int needPower) {
      this.checkModify();
      this.needPower = needPower;
   }

   public int getNeedPlayerLv() {
      return this.needPlayerLv;
   }

   public void setNeedPlayerLv(int needPlayerLv) {
      this.checkModify();
      this.needPlayerLv = needPlayerLv;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public List<PropertyModel> getAddPro() {
      return this.addPro;
   }

   public void setAddPro(List<PropertyModel> addPro) {
      this.checkModify();
      this.addPro = addPro;
   }
}
