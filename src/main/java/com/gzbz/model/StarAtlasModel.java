package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "starAtlas"
)
public class StarAtlasModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "starMapId",
      comment = "星图类型Id"
   )
   private int starMapId;
   @ModelColumnAnno(
      columnName = "starPos",
      comment = "星位Id"
   )
   private int starPos;
   @ModelColumnAnno(
      columnName = "preStarPos",
      comment = "前置星位Id"
   )
   private int preStarPos;
   @ModelColumnAnno(
      comment = "星位组",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> starPosGroup = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 4,
      comment = "属性"
   )
   private ArrayList<PropertyModel> base = new ArrayList();
   @ModelColumnAnno(
      comment = "消耗",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2
   )
   private List<ResourceModel> consumes = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getStarMapId() {
      return this.starMapId;
   }

   public void setStarMapId(int starMapId) {
      this.checkModify();
      this.starMapId = starMapId;
   }

   public int getStarPos() {
      return this.starPos;
   }

   public void setStarPos(int starPos) {
      this.checkModify();
      this.starPos = starPos;
   }

   public List<Integer> getStarPosGroup() {
      return this.starPosGroup;
   }

   public void setStarPosGroup(List<Integer> starPosGroup) {
      this.checkModify();
      this.starPosGroup = starPosGroup;
   }

   public int getPreStarPos() {
      return this.preStarPos;
   }

   public void setPreStarPos(int preStarPos) {
      this.checkModify();
      this.preStarPos = preStarPos;
   }

   public ArrayList<PropertyModel> getBase() {
      return this.base;
   }

   public void setBase(ArrayList<PropertyModel> base) {
      this.checkModify();
      this.base = base;
   }

   public List<ResourceModel> getConsumes() {
      return this.consumes;
   }

   public void setConsumes(List<ResourceModel> consumes) {
      this.checkModify();
      this.consumes = consumes;
   }
}
