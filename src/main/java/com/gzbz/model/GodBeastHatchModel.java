package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GodBeastHatch"
)
public class GodBeastHatchModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "类型描述"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "孵化次数"
   )
   private int num;
   @ModelColumnAnno(
      comment = "孵化消耗类型"
   )
   private int consumeType;
   @ModelColumnAnno(
      comment = "孵化消耗ID"
   )
   private int consumeId;
   @ModelColumnAnno(
      comment = "孵化消耗数量"
   )
   private int consumeValue;
   @ModelColumnAnno(
      comment = "替换货币id"
   )
   private int replaceId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = KeyValFun.class,
      comment = "神兽随机"
   )
   private List<KeyValFun> GBLib1 = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "招募额外获得"
   )
   private List<ResourceModel> extraGet = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getNum() {
      return this.num;
   }

   public void setNum(int num) {
      this.checkModify();
      this.num = num;
   }

   public int getConsumeType() {
      return this.consumeType;
   }

   public void setConsumeType(int consumeType) {
      this.checkModify();
      this.consumeType = consumeType;
   }

   public int getConsumeId() {
      return this.consumeId;
   }

   public void setConsumeId(int consumeId) {
      this.checkModify();
      this.consumeId = consumeId;
   }

   public int getConsumeValue() {
      return this.consumeValue;
   }

   public void setConsumeValue(int consumeValue) {
      this.checkModify();
      this.consumeValue = consumeValue;
   }

   public int getReplaceId() {
      return this.replaceId;
   }

   public void setReplaceId(int replaceId) {
      this.checkModify();
      this.replaceId = replaceId;
   }

   public List<KeyValFun> getGBLib1() {
      return this.GBLib1;
   }

   public void setGBLib1(List<KeyValFun> GBLib1) {
      this.checkModify();
      this.GBLib1 = GBLib1;
   }

   public List<ResourceModel> getExtraGet() {
      return this.extraGet;
   }

   public void setExtraGet(List<ResourceModel> extraGet) {
      this.checkModify();
      this.extraGet = extraGet;
   }
}
