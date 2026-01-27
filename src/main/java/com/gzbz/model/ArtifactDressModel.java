package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "artifactDress"
)
public class ArtifactDressModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "时装id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "open",
      comment = "是否开放"
   )
   private int open;
   @ModelColumnAnno(
      columnName = "unlockType",
      comment = "解锁类型"
   )
   private int unlockType;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "时装解锁道具"
   )
   private List<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      columnName = "name",
      comment = "时装名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "describe",
      comment = "时装描述"
   )
   private String describe;
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "tasks",
      subCls = Integer.class,
      count = 4,
      comment = "时装任务"
   )
   private Map<Integer, Integer> tasks = new TreeMap();
   @ModelColumnAnno(
      columnName = "time",
      comment = "有效时间"
   )
   private int time;
   @ModelColumnAnno(
      columnName = "activityItems",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "活动激活道具"
   )
   private List<ResourceModel> activityItems = new ArrayList();
   @ModelColumnAnno(
      columnName = "openTime",
      comment = "展示开服时间"
   )
   private int openTime;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getOpen() {
      return this.open;
   }

   public void setOpen(int open) {
      this.checkModify();
      this.open = open;
   }

   public int getUnlockType() {
      return this.unlockType;
   }

   public void setUnlockType(int unlockType) {
      this.checkModify();
      this.unlockType = unlockType;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public String getDescribe() {
      return this.describe;
   }

   public void setDescribe(String describe) {
      this.checkModify();
      this.describe = describe;
   }

   public int getTime() {
      return this.time;
   }

   public void setTime(int time) {
      this.checkModify();
      this.time = time;
   }

   public Map<Integer, Integer> getTasks() {
      return this.tasks;
   }

   public void setTasks(Map<Integer, Integer> tasks) {
      this.checkModify();
      this.tasks = tasks;
   }

   public List<ResourceModel> getActivityItems() {
      return this.activityItems;
   }

   public void setActivityItems(List<ResourceModel> activityItems) {
      this.checkModify();
      this.activityItems = activityItems;
   }

   public int getOpenTime() {
      return this.openTime;
   }

   public void setOpenTime(int openTime) {
      this.checkModify();
      this.openTime = openTime;
   }
}
