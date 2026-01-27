package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "cdkey"
)
public class CdKeyModel extends BaseModel {
   @ModelColumnAnno(
      comment = "礼包序号"
   )
   private int id;
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "通用礼包码"
   )
   private String cdKey;
   @ModelColumnAnno(
      comment = "开始时间"
   )
   private String startTime;
   @ModelColumnAnno(
      comment = "使用期限"
   )
   private String endTime;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 15,
      comment = "物品"
   )
   private List<ResourceModel> items = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getCdKey() {
      return this.cdKey;
   }

   public void setCdKey(String cdKey) {
      this.checkModify();
      this.cdKey = cdKey;
   }

   public String getStartTime() {
      return this.startTime;
   }

   public void setStartTime(String startTime) {
      this.checkModify();
      this.startTime = startTime;
   }

   public String getEndTime() {
      return this.endTime;
   }

   public void setEndTime(String endTime) {
      this.checkModify();
      this.endTime = endTime;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }
}
