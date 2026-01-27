package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.HashMap;
import java.util.Map;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroNationAddition"
)
public class HeroNationAdditionModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "序号"
   )
   private String id;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "描述"
   )
   private String desc;
   @ModelColumnAnno(
      columnName = "nation",
      comment = "阵营"
   )
   private int nation;
   @ModelColumnAnno(
      columnName = "heroNum",
      comment = "武将数量"
   )
   private int heroNum;
   @ModelColumnAnno(
      columnConvertType = 1,
      columnName = "addProperties",
      subCls = PropertyModel.class,
      count = 7,
      comment = "属性加成"
   )
   private Map<Integer, PropertyModel> addProperties = new HashMap();

   public String getId() {
      return this.id;
   }

   public void setId(String id) {
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

   public int getNation() {
      return this.nation;
   }

   public void setNation(int nation) {
      this.checkModify();
      this.nation = nation;
   }

   public int getHeroNum() {
      return this.heroNum;
   }

   public void setHeroNum(int heroNum) {
      this.checkModify();
      this.heroNum = heroNum;
   }

   public Map<Integer, PropertyModel> getAddProperties() {
      return this.addProperties;
   }

   public void setAddProperties(Map<Integer, PropertyModel> addProperties) {
      this.checkModify();
      this.addProperties = addProperties;
   }
}
