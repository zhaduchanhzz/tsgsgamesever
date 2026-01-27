package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "TongQueBase"
)
public class TongqueTerraceModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "美人id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "name",
      comment = "美人名字"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "美人描述"
   )
   private String desc;
   @ModelColumnAnno(
      columnName = "state",
      comment = "状态"
   )
   private int state;
   @ModelColumnAnno(
      columnName = "voiceRes",
      comment = "美人语音资源"
   )
   private String voiceRes;
   @ModelColumnAnno(
      columnName = "bg_res",
      comment = "美人底板资源名称"
   )
   private String bg_res;
   @ModelColumnAnno(
      columnName = "txt",
      comment = "美人悬浮文字"
   )
   private String txt;
   @ModelColumnAnno(
      columnName = "armature",
      comment = "美人动画id"
   )
   private int armature;
   @ModelColumnAnno(
      columnName = "beautyType",
      comment = "美人类型"
   )
   private int beautyType;
   @ModelColumnAnno(
      columnName = "upType",
      comment = "升级类型"
   )
   private int upType;
   @ModelColumnAnno(
      columnName = "bestowConsume",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "赏赐消耗"
   )
   private List<ResourceModel> bestowConsume = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2,
      comment = "赏赐属性增加"
   )
   private List<PropertyModel> bestowProperties = new ArrayList();
   @ModelColumnAnno(
      columnName = "bestowTimes",
      comment = "赏赐次数上限"
   )
   private int bestowTimes;
   @ModelColumnAnno(
      columnName = "unlockCondition",
      comment = "解锁需要前置美人的赏赐条件"
   )
   private String unlockCondition;
   @ModelColumnAnno(
      columnName = "openday",
      comment = "美人开启天数"
   )
   private int openday;

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

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getState() {
      return this.state;
   }

   public void setState(int state) {
      this.checkModify();
      this.state = state;
   }

   public String getVoiceRes() {
      return this.voiceRes;
   }

   public void setVoiceRes(String voiceRes) {
      this.checkModify();
      this.voiceRes = voiceRes;
   }

   public String getBg_res() {
      return this.bg_res;
   }

   public void setBg_res(String bg_res) {
      this.checkModify();
      this.bg_res = bg_res;
   }

   public String getTxt() {
      return this.txt;
   }

   public void setTxt(String txt) {
      this.checkModify();
      this.txt = txt;
   }

   public int getArmature() {
      return this.armature;
   }

   public void setArmature(int armature) {
      this.checkModify();
      this.armature = armature;
   }

   public List<ResourceModel> getBestowConsume() {
      return this.bestowConsume;
   }

   public void setBestowConsume(List<ResourceModel> bestowConsume) {
      this.checkModify();
      this.bestowConsume = bestowConsume;
   }

   public List<PropertyModel> getBestowProperties() {
      return this.bestowProperties;
   }

   public void setBestowProperties(List<PropertyModel> bestowProperties) {
      this.checkModify();
      this.bestowProperties = bestowProperties;
   }

   public int getBestowTimes() {
      return this.bestowTimes;
   }

   public void setBestowTimes(int bestowTimes) {
      this.checkModify();
      this.bestowTimes = bestowTimes;
   }

   public String getUnlockCondition() {
      return this.unlockCondition;
   }

   public void setUnlockCondition(String unlockCondition) {
      this.checkModify();
      this.unlockCondition = unlockCondition;
   }

   public int getBeautyType() {
      return this.beautyType;
   }

   public void setBeautyType(int beautyType) {
      this.checkModify();
      this.beautyType = beautyType;
   }

   public int getUpType() {
      return this.upType;
   }

   public void setUpType(int upType) {
      this.checkModify();
      this.upType = upType;
   }

   public int getOpenday() {
      return this.openday;
   }

   public void setOpenday(int openday) {
      this.checkModify();
      this.openday = openday;
   }
}
