package com.gzbz.model;

import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.task.base.GlobalTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "chatBubble"
)
public class ChatBubbleModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno
   private int targetType;
   @ModelColumnAnno(
      columnName = "targetID"
   )
   private int targetId;
   @ModelColumnAnno
   private int targetValue;
   @ModelColumnAnno(
      columnName = "ActivatioCondition"
   )
   private String condition;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "获得道具"
   )
   private List<Integer> convert = new ArrayList();

   public void reloadTaskTrigger() {
      if (this.getTargetType() > 0 && this.getTargetValue() > 0) {
         ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(TaskDefine.TaskModule.MODULE_CHAT_BUBBLE.moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetType(), (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetId(), (v) -> new ConcurrentHashSet())).add(this.getId());
      }
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getTargetType() {
      return this.targetType;
   }

   public void setTargetType(int targetType) {
      this.checkModify();
      this.targetType = targetType;
   }

   public int getTargetId() {
      return this.targetId;
   }

   public void setTargetId(int targetId) {
      this.checkModify();
      this.targetId = targetId;
   }

   public int getTargetValue() {
      return this.targetValue;
   }

   public void setTargetValue(int targetValue) {
      this.checkModify();
      this.targetValue = targetValue;
   }

   public String getCondition() {
      return this.condition;
   }

   public void setCondition(String condition) {
      this.checkModify();
      this.condition = condition;
   }

   public List<Integer> getConvert() {
      return this.convert;
   }

   public void setConvert(List<Integer> convert) {
      this.checkModify();
      this.convert = convert;
   }
}
