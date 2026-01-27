package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "headframe"
)
public class HeadFrameModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "头像id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "name",
      comment = "头像名字"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "time",
      comment = "使用期限-1条件使用 0永久 大于0秒为单位"
   )
   private int time;
   @ModelColumnAnno(
      columnName = "iconid",
      comment = "图标序号"
   )
   private int iconid;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 4,
      comment = "属性修正"
   )
   private List<PropertyModel> addPro = new ArrayList();
   @ModelColumnAnno(
      columnName = "ActivatioCondition",
      comment = "激活条件"
   )
   private String activatioCondition;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "获得道具"
   )
   private List<Integer> convert = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = String.class,
      comment = "使用限制"
   )
   private List<String> useLimit = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getTime() {
      return this.time;
   }

   public void setTime(int time) {
      this.checkModify();
      this.time = time;
   }

   public int getIconid() {
      return this.iconid;
   }

   public void setIconid(int iconid) {
      this.checkModify();
      this.iconid = iconid;
   }

   public List<PropertyModel> getAddPro() {
      return this.addPro;
   }

   public void setAddPro(List<PropertyModel> addPro) {
      this.checkModify();
      this.addPro = addPro;
   }

   public String getActivatioCondition() {
      return this.activatioCondition;
   }

   public void setActivatioCondition(String activatioCondition) {
      this.checkModify();
      this.activatioCondition = activatioCondition;
   }

   public List<Integer> getConvert() {
      return this.convert;
   }

   public void setConvert(List<Integer> convert) {
      this.checkModify();
      this.convert = convert;
   }

   public List<String> getUseLimit() {
      return this.useLimit;
   }

   public void setUseLimit(List<String> useLimit) {
      this.checkModify();
      this.useLimit = useLimit;
   }
}
