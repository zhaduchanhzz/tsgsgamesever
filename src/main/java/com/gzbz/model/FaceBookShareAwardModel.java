package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FaceBookShareAward"
)
public class FaceBookShareAwardModel extends BaseModel {
   public static final int LIKES = 1;
   public static final int SHARE = 2;
   public static final int INVITE = 3;
   public static final int BINDING = 4;
   public static final int H5_GUIDE = 7;
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "刷新类型"
   )
   private int resetType;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "奖励列表",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "邀请人数"
   )
   private int targetValue;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getResetType() {
      return this.resetType;
   }

   public void setResetType(int resetType) {
      this.checkModify();
      this.resetType = resetType;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getTargetValue() {
      return this.targetValue;
   }

   public void setTargetValue(int targetValue) {
      this.checkModify();
      this.targetValue = targetValue;
   }
}
