package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "krTurntableDraw"
)
public class TurntableRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      columnName = "Wheel",
      comment = "轮次"
   )
   private int wheel;
   @ModelColumnAnno(
      comment = "1不重复抽 2可重复抽"
   )
   private int type;
   @ModelColumnAnno(
      comment = "前置次数"
   )
   private int time;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "奖励"
   )
   private final List<ResourceModel> item = new ArrayList();
   @ModelColumnAnno(
      comment = "地区限制"
   )
   private String areanShow;
   @ModelColumnAnno(
      comment = "旧序号"
   )
   private int oldId;

   public int getId() {
      return this.id;
   }

   public int getWheel() {
      return this.wheel;
   }

   public int getType() {
      return this.type;
   }

   public int getWeight() {
      return this.weight;
   }

   public int getTime() {
      return this.time;
   }

   public List<ResourceModel> getItem() {
      return this.item;
   }

   public String getAreanShow() {
      return this.areanShow;
   }

   public int getOldId() {
      return this.oldId;
   }

   public void setId(int id) {
      this.id = id;
   }
}
