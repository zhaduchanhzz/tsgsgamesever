package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "armyArray"
)
public class ArmyArrayModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "军阵id"
   )
   private int arrayId;
   @ModelColumnAnno(
      comment = "军阵名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "阵眼被动效果"
   )
   private int effect;
   @ModelColumnAnno(
      comment = "阵眼武将类型",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> eyeType = new ArrayList();
   @ModelColumnAnno(
      comment = "护卫道具",
      columnConvertType = 4,
      subCls = String.class,
      count = 3
   )
   private List<String> campProtect = new ArrayList();
   @ModelColumnAnno(
      comment = "护卫道具类型",
      columnConvertType = 4,
      subCls = Integer.class,
      count = 3
   )
   private List<Integer> dressType = new ArrayList();

   public int getArrayId() {
      return this.arrayId;
   }

   public void setArrayId(int arrayId) {
      this.checkModify();
      this.arrayId = arrayId;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getEffect() {
      return this.effect;
   }

   public void setEffect(int effect) {
      this.checkModify();
      this.effect = effect;
   }

   public List<Integer> getEyeType() {
      return this.eyeType;
   }

   public void setEyeType(List<Integer> eyeType) {
      this.checkModify();
      this.eyeType = eyeType;
   }

   public List<String> getCampProtect() {
      return this.campProtect;
   }

   public void setCampProtect(List<String> campProtect) {
      this.checkModify();
      this.campProtect = campProtect;
   }

   public List<Integer> getDressType() {
      return this.dressType;
   }

   public void setDressType(List<Integer> dressType) {
      this.checkModify();
      this.dressType = dressType;
   }
}
