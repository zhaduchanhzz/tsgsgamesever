package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "spGuanJia"
)
public class GuanJiaModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "系统id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "选择项"
   )
   private int choiceAble;
   @ModelColumnAnno(
      comment = "任务选项",
      columnConvertType = 4,
      subCls = Integer.class,
      count = 5
   )
   private List<Integer> taskCommon = new ArrayList();
   @ModelColumnAnno(
      comment = "条目出现等级"
   )
   private int showLvRequest;
   @ModelColumnAnno(
      comment = "条目出现开服天数"
   )
   private int showDaysRequest;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getChoiceAble() {
      return this.choiceAble;
   }

   public void setChoiceAble(int choiceAble) {
      this.checkModify();
      this.choiceAble = choiceAble;
   }

   public List<Integer> getTaskCommon() {
      return this.taskCommon;
   }

   public void setTaskCommon(List<Integer> taskCommon) {
      this.checkModify();
      this.taskCommon = taskCommon;
   }

   public int getShowLvRequest() {
      return this.showLvRequest;
   }

   public void setShowLvRequest(int showLvRequest) {
      this.checkModify();
      this.showLvRequest = showLvRequest;
   }

   public int getShowDaysRequest() {
      return this.showDaysRequest;
   }

   public void setShowDaysRequest(int showDaysRequest) {
      this.checkModify();
      this.showDaysRequest = showDaysRequest;
   }
}
