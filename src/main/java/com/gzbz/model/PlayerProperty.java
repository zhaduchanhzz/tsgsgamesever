package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "playerProperty"
)
public class PlayerProperty extends BaseModel {
   @ModelColumnAnno(
      columnName = "subclass",
      isPrimaty = true,
      comment = "属性类型"
   )
   private int subclass;
   @ModelColumnAnno(
      columnName = "name",
      comment = "属性名字"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "quality",
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      columnName = "iconId",
      comment = "物品图标"
   )
   private int iconId;
   @ModelColumnAnno(
      columnName = "itemUseFun",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "使用函数"
   )
   private ArrayList<ResourceModel> useFuns = new ArrayList();
   @ModelColumnAnno(
      columnName = "useToSystem",
      comment = "前往系统"
   )
   private int useToSystem;
   @ModelColumnAnno(
      columnName = "useDesc",
      comment = "使用说明"
   )
   private String useDesc;
   @ModelColumnAnno(
      columnName = "pathwayId",
      comment = "获取途径"
   )
   private int pathwayId;
   @ModelColumnAnno(
      columnName = "vipRight",
      comment = "是否特权"
   )
   private int vipRight;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "描述"
   )
   private String desc;

   public int getSubclass() {
      return this.subclass;
   }

   public void setSubclass(int subclass) {
      this.checkModify();
      this.subclass = subclass;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getIconId() {
      return this.iconId;
   }

   public void setIconId(int iconId) {
      this.checkModify();
      this.iconId = iconId;
   }

   public ArrayList<ResourceModel> getUseFuns() {
      return this.useFuns;
   }

   public void setUseFuns(ArrayList<ResourceModel> useFuns) {
      this.checkModify();
      this.useFuns = useFuns;
   }

   public int getUseToSystem() {
      return this.useToSystem;
   }

   public void setUseToSystem(int useToSystem) {
      this.checkModify();
      this.useToSystem = useToSystem;
   }

   public String getUseDesc() {
      return this.useDesc;
   }

   public void setUseDesc(String useDesc) {
      this.checkModify();
      this.useDesc = useDesc;
   }

   public int getPathwayId() {
      return this.pathwayId;
   }

   public void setPathwayId(int pathwayId) {
      this.checkModify();
      this.pathwayId = pathwayId;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getVipRight() {
      return this.vipRight;
   }

   public void setVipRight(int vipRight) {
      this.checkModify();
      this.vipRight = vipRight;
   }
}
