package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ZongqingGameDrop"
)
public class ZongQingGameDropModel extends BaseModel {
   @ModelColumnAnno(
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "掉落类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "获得积分"
   )
   private int point;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;
   @ModelColumnAnno(
      columnName = "stageLine",
      comment = "阶段各有多少行",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> stageLine = new ArrayList();
   @ModelColumnAnno(
      columnName = "upperLimit",
      comment = "阶段最大掉落数量",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> stageDropLimit = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getPoint() {
      return this.point;
   }

   public void setPoint(int point) {
      this.checkModify();
      this.point = point;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public List<Integer> getStageLine() {
      return this.stageLine;
   }

   public void setStageLine(List<Integer> stageLine) {
      this.checkModify();
      this.stageLine = stageLine;
   }

   public List<Integer> getStageDropLimit() {
      return this.stageDropLimit;
   }

   public void setStageDropLimit(List<Integer> stageDropLimit) {
      this.checkModify();
      this.stageDropLimit = stageDropLimit;
   }
}
