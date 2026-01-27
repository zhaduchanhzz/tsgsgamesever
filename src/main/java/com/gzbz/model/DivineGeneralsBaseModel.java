package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "divineGeneralsBase"
)
public class DivineGeneralsBaseModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "组"
   )
   private int groupId;
   @ModelColumnAnno(
      comment = "神将录名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "阵营"
   )
   private int camp;
   @ModelColumnAnno(
      comment = "武将id",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5
   )
   private List<ResourceModel> resourceList = new ArrayList();
   @ModelColumnAnno(
      comment = "贴图"
   )
   private String imgPath;

   public int getGroupId() {
      return this.groupId;
   }

   public void setGroupId(int groupId) {
      this.checkModify();
      this.groupId = groupId;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getCamp() {
      return this.camp;
   }

   public void setCamp(int camp) {
      this.checkModify();
      this.camp = camp;
   }

   public List<ResourceModel> getResourceList() {
      return this.resourceList;
   }

   public void setResourceList(List<ResourceModel> resourceList) {
      this.checkModify();
      this.resourceList = resourceList;
   }

   public String getImgPath() {
      return this.imgPath;
   }

   public void setImgPath(String imgPath) {
      this.checkModify();
      this.imgPath = imgPath;
   }
}
