package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroReplace"
)
public class HeroReplaceModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "heroId",
      isPrimaty = true,
      comment = "武将id"
   )
   private int heroId;
   @ModelColumnAnno(
      columnName = "ReplaceId",
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "替身武将id"
   )
   private List<Integer> replaceIds = new ArrayList();
   @ModelColumnAnno(
      columnName = "areanShow",
      columnConvertType = 2,
      subCls = String.class,
      comment = "地区限制"
   )
   private List<String> areanShow = new ArrayList();

   public int getHeroId() {
      return this.heroId;
   }

   public List<Integer> getReplaceIds() {
      return this.replaceIds;
   }

   public List<String> getAreanShow() {
      return this.areanShow;
   }
}
