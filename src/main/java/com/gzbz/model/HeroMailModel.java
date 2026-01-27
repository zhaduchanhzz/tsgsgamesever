package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heromail"
)
public class HeroMailModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "信封序号"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "type",
      comment = "解锁类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "specificTime",
      comment = "规定时间"
   )
   private String specificTime;
   @ModelColumnAnno(
      columnName = "openTime",
      comment = "开服时间"
   )
   private int openTime;
   @ModelColumnAnno(
      columnName = "createTime",
      comment = "创角时间"
   )
   private int createTime;
   @ModelColumnAnno(
      columnName = "mailtask",
      comment = "解锁任务"
   )
   private int mailtask;
   @ModelColumnAnno(
      columnName = "isSpokes",
      comment = "是否渠道代言"
   )
   public int isSpokes;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = " 奖励道具"
   )
   private ArrayList<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      columnName = "area",
      comment = "地区"
   )
   private String area;

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

   public String getSpecificTime() {
      return this.specificTime;
   }

   public void setSpecificTime(String specificTime) {
      this.checkModify();
      this.specificTime = specificTime;
   }

   public int getOpenTime() {
      return this.openTime;
   }

   public void setOpenTime(int openTime) {
      this.checkModify();
      this.openTime = openTime;
   }

   public int getCreateTime() {
      return this.createTime;
   }

   public void setCreateTime(int createTime) {
      this.checkModify();
      this.createTime = createTime;
   }

   public int getMailtask() {
      return this.mailtask;
   }

   public void setMailtask(int mailtask) {
      this.checkModify();
      this.mailtask = mailtask;
   }

   public ArrayList<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(ArrayList<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public String getArea() {
      return this.area;
   }

   public void setArea(String area) {
      this.checkModify();
      this.area = area;
   }

   public int getIsSpokes() {
      return this.isSpokes;
   }

   public void setIsSpokes(int isSpokes) {
      this.checkModify();
      this.isSpokes = isSpokes;
   }
}
