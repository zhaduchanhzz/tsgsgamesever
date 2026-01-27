package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "formationGemSet"
)
public class FormationGemSetModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "职业"
   )
   private int job;
   @ModelColumnAnno(
      comment = "效果名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "激活技能",
      columnName = "hotSkill",
      columnConvertType = 4,
      subCls = KeyValFun.class,
      count = 3
   )
   private List<KeyValFun> hotSkill = new ArrayList();
   @ModelColumnAnno(
      comment = "激活等级"
   )
   private int hotLv;
   @ModelColumnAnno(
      comment = "开启槽位等级"
   )
   private int siteLv;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getJob() {
      return this.job;
   }

   public void setJob(int job) {
      this.checkModify();
      this.job = job;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public List<KeyValFun> getHotSkill() {
      return this.hotSkill;
   }

   public void setHotSkill(List<KeyValFun> hotSkill) {
      this.checkModify();
      this.hotSkill = hotSkill;
   }

   public int getHotLv() {
      return this.hotLv;
   }

   public void setHotLv(int hotLv) {
      this.checkModify();
      this.hotLv = hotLv;
   }

   public int getSiteLv() {
      return this.siteLv;
   }

   public void setSiteLv(int siteLv) {
      this.checkModify();
      this.siteLv = siteLv;
   }
}
