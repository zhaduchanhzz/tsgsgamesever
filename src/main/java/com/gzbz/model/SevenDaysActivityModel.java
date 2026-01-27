package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "sevenDaysActivity"
)
public class SevenDaysActivityModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "第几天"
   )
   private int id;
   @ModelColumnAnno(
      comment = "图标1"
   )
   private int icon1;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 4,
      comment = "登录奖励"
   )
   private List<ResourceModel> loginItems = new ArrayList();
   @ModelColumnAnno(
      comment = "提示"
   )
   private String tips;
   @ModelColumnAnno(
      comment = "显示物品名称 "
   )
   private String DisplayItem;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getIcon1() {
      return this.icon1;
   }

   public void setIcon1(int icon1) {
      this.checkModify();
      this.icon1 = icon1;
   }

   public List<ResourceModel> getLoginItems() {
      return this.loginItems;
   }

   public void setLoginItems(List<ResourceModel> loginItems) {
      this.checkModify();
      this.loginItems = loginItems;
   }

   public String getTips() {
      return this.tips;
   }

   public void setTips(String tips) {
      this.checkModify();
      this.tips = tips;
   }

   public String getDisplayItem() {
      return this.DisplayItem;
   }

   public void setDisplayItem(String DisplayItem) {
      this.checkModify();
      this.DisplayItem = DisplayItem;
   }
}
