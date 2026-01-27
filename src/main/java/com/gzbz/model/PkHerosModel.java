package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.TreeMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "pkHeros"
)
public class PkHerosModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "leftHeros",
      subCls = Integer.class,
      count = 6,
      comment = "左"
   )
   private Map<Integer, Integer> leftHeros = new TreeMap();
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "rightHeros",
      subCls = Integer.class,
      count = 6,
      comment = "右"
   )
   private Map<Integer, Integer> rightHeros = new TreeMap();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public Map<Integer, Integer> getLeftHeros() {
      return this.leftHeros;
   }

   public void setLeftHeros(Map<Integer, Integer> leftHeros) {
      this.checkModify();
      this.leftHeros = leftHeros;
   }

   public Map<Integer, Integer> getRightHeros() {
      return this.rightHeros;
   }

   public void setRightHeros(Map<Integer, Integer> rightHeros) {
      this.checkModify();
      this.rightHeros = rightHeros;
   }
}
