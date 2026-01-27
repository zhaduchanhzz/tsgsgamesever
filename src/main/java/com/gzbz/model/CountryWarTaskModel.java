package com.gzbz.model;

import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.task.base.GlobalTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "countryWarTask"
)
public class CountryWarTaskModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "任务id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "mapId",
      comment = "所属地图"
   )
   private int mapId;
   @ModelColumnAnno(
      columnName = "type",
      comment = "任务类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "subType",
      comment = "子类型"
   )
   private int subType;
   @ModelColumnAnno(
      columnName = "targets",
      columnConvertType = 1,
      subCls = TaskTargetItem.class,
      count = 1,
      comment = "目标"
   )
   private List<TaskTargetItem> targets = new ArrayList();
   @ModelColumnAnno(
      columnName = "targetX",
      comment = "目标数量"
   )
   private int targetX;
   @ModelColumnAnno(
      columnName = "targetY",
      comment = "目标额外条件"
   )
   private int targetY;
   @ModelColumnAnno(
      columnName = "ToSystemFunId",
      comment = "前往系统id"
   )
   private int ToSystemFunId;
   @ModelColumnAnno(
      columnName = "taskDesc",
      comment = "任务描述"
   )
   private String taskDesc;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "score",
      comment = "完成积分"
   )
   private int score;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<CountryWarTaskModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         CountryWarTaskModel model = (CountryWarTaskModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.type, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customCountryWarTask", tempHashMap);
   }

   public void reloadTaskTrigger() {
      ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(TaskDefine.TaskModule.MODULE_COUNTRY_WAR.moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(((TaskTargetItem)this.getTargets().get(0)).getTargetType(), (v) -> new ConcurrentHashMap())).computeIfAbsent(((TaskTargetItem)this.getTargets().get(0)).getTargetId(), (v) -> new ConcurrentHashSet())).add(this.getId());
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getMapId() {
      return this.mapId;
   }

   public void setMapId(int mapId) {
      this.checkModify();
      this.mapId = mapId;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getSubType() {
      return this.subType;
   }

   public void setSubType(int subType) {
      this.checkModify();
      this.subType = subType;
   }

   public List<TaskTargetItem> getTargets() {
      return this.targets;
   }

   public void setTargets(List<TaskTargetItem> targets) {
      this.checkModify();
      this.targets = targets;
   }

   public int getTargetX() {
      return this.targetX;
   }

   public void setTargetX(int targetX) {
      this.checkModify();
      this.targetX = targetX;
   }

   public int getTargetY() {
      return this.targetY;
   }

   public void setTargetY(int targetY) {
      this.checkModify();
      this.targetY = targetY;
   }

   public int getToSystemFunId() {
      return this.ToSystemFunId;
   }

   public void setToSystemFunId(int ToSystemFunId) {
      this.checkModify();
      this.ToSystemFunId = ToSystemFunId;
   }

   public String getTaskDesc() {
      return this.taskDesc;
   }

   public void setTaskDesc(String taskDesc) {
      this.checkModify();
      this.taskDesc = taskDesc;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getScore() {
      return this.score;
   }

   public void setScore(int score) {
      this.checkModify();
      this.score = score;
   }
}
