package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "MysticSkillPos"
)
public class MagicSkillPosModel extends BaseModel {
   @ModelColumnAnno(
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "阶级"
   )
   private int stage;
   @ModelColumnAnno(
      comment = "可镶嵌奇谋数量"
   )
   private int skillNum;
   @ModelColumnAnno(
      columnConvertType = 4,
      subCls = Integer.class,
      comment = "技能插槽位置",
      count = 4
   )
   private List<Integer> skillPos = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getStage() {
      return this.stage;
   }

   public void setStage(int stage) {
      this.checkModify();
      this.stage = stage;
   }

   public int getSkillNum() {
      return this.skillNum;
   }

   public void setSkillNum(int skillNum) {
      this.checkModify();
      this.skillNum = skillNum;
   }

   public List<Integer> getSkillPos() {
      return this.skillPos;
   }

   public void setSkillPos(List<Integer> skillPos) {
      this.checkModify();
      this.skillPos = skillPos;
   }
}
