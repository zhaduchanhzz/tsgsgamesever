package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warHLEvent"
)
public class WarHLEventsModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "事件组号"
   )
   private int groupId;
   @ModelColumnAnno(
      comment = "事件类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "描述"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int pro;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 4,
      comment = "一级资源"
   )
   private List<ResourceModel> reward1 = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "二级资源"
   )
   private List<ResourceModel> reward2 = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroupId() {
      return this.groupId;
   }

   public void setGroupId(int groupId) {
      this.checkModify();
      this.groupId = groupId;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getPro() {
      return this.pro;
   }

   public void setPro(int pro) {
      this.checkModify();
      this.pro = pro;
   }

   public List<ResourceModel> getReward1() {
      return this.reward1;
   }

   public void setReward1(List<ResourceModel> reward1) {
      this.checkModify();
      this.reward1 = reward1;
   }

   public List<ResourceModel> getReward2() {
      return this.reward2;
   }

   public void setReward2(List<ResourceModel> reward2) {
      this.checkModify();
      this.reward2 = reward2;
   }
}
