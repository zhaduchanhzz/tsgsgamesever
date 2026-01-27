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
   file = "leaderTacticsDestiny"
)
public class LeaderTacticsDestinyModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "额外技能id"
   )
   private int extraSkill;
   @ModelColumnAnno(
      comment = "系别"
   )
   private int type;
   @ModelColumnAnno(
      comment = "阶级"
   )
   private int breach;
   @ModelColumnAnno(
      comment = "等级"
   )
   private int lv;
   @ModelColumnAnno(
      comment = "下一级"
   )
   private int next;
   @ModelColumnAnno(
      columnName = "addPro",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1,
      comment = "装备加成"
   )
   private List<PropertyModel> addPro = new ArrayList();
   @ModelColumnAnno(
      columnName = "addAllPro",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1,
      comment = "全体加成"
   )
   private List<PropertyModel> addAllPro = new ArrayList();
   @ModelColumnAnno(
      comment = "额外技能ID"
   )
   private int skillId;
   @ModelColumnAnno(
      comment = "学习所需天命技总等级"
   )
   private int needDestinySumLv;
   @ModelColumnAnno(
      comment = "学习所需前置天命技ID"
   )
   private int needDestinyId;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "学习消耗"
   )
   private List<ResourceModel> items = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, TreeMap<Integer, LeaderTacticsDestinyModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         LeaderTacticsDestinyModel model = (LeaderTacticsDestinyModel)entry.getValue();
         String key = model.getType() + "_" + model.getBreach();
         ((TreeMap)tempHashMap.computeIfAbsent(key, (v) -> new TreeMap())).put(model.getId(), model);
      }

      pool.putMap("customLeaderTacticsDestiny", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getExtraSkill() {
      return this.extraSkill;
   }

   public void setExtraSkill(int extraSkill) {
      this.checkModify();
      this.extraSkill = extraSkill;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getBreach() {
      return this.breach;
   }

   public void setBreach(int breach) {
      this.checkModify();
      this.breach = breach;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getNext() {
      return this.next;
   }

   public void setNext(int next) {
      this.checkModify();
      this.next = next;
   }

   public List<PropertyModel> getAddPro() {
      return this.addPro;
   }

   public void setAddPro(List<PropertyModel> addPro) {
      this.checkModify();
      this.addPro = addPro;
   }

   public List<PropertyModel> getAddAllPro() {
      return this.addAllPro;
   }

   public void setAddAllPro(List<PropertyModel> addAllPro) {
      this.checkModify();
      this.addAllPro = addAllPro;
   }

   public int getSkillId() {
      return this.skillId;
   }

   public void setSkillId(int skillId) {
      this.checkModify();
      this.skillId = skillId;
   }

   public int getNeedDestinySumLv() {
      return this.needDestinySumLv;
   }

   public void setNeedDestinySumLv(int needDestinySumLv) {
      this.checkModify();
      this.needDestinySumLv = needDestinySumLv;
   }

   public int getNeedDestinyId() {
      return this.needDestinyId;
   }

   public void setNeedDestinyId(int needDestinyId) {
      this.checkModify();
      this.needDestinyId = needDestinyId;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }
}
