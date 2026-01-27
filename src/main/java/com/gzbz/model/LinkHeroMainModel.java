package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "linkHeroMain"
)
public class LinkHeroMainModel extends BaseModel {
   public static final int TYPE_POINT = 1;
   public static final int TYPE_NATION = 2;
   @ModelColumnAnno(
      columnName = "linkHeroId",
      comment = "联动武将id",
      isPrimaty = true
   )
   private int linkHeroId;
   @ModelColumnAnno(
      columnName = "linkType",
      comment = "连接方式"
   )
   private int linkType;
   @ModelColumnAnno(
      columnName = "linkHeroArray",
      comment = "连接对象",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> linkHeroArray = new ArrayList();

   public int getLinkHeroId() {
      return this.linkHeroId;
   }

   public int getLinkType() {
      return this.linkType;
   }

   public List<Integer> getLinkHeroArray() {
      return this.linkHeroArray;
   }
}
