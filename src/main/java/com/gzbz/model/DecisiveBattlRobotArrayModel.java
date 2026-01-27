package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DecisiveBattleRobotArray"
)
public class DecisiveBattlRobotArrayModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "战斗id"
   )
   private String battleId;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "奇书id"
   )
   private List<Integer> mysticSkillId = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "神兵id"
   )
   private List<Integer> artifactId = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "美人id"
   )
   private List<Integer> tongQueId = new ArrayList();
   @ModelColumnAnno(
      comment = "战法槽位数"
   )
   private int warcraftNum;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "战法id"
   )
   private List<Integer> warcraftId = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "演练机器人"
   )
   private List<Integer> practiseId = new ArrayList();
   @ModelColumnAnno(
      comment = "连败id"
   )
   private String deffeatedId;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<Integer> getTongQueId() {
      return this.tongQueId;
   }

   public void setTongQueId(List<Integer> tongQueId) {
      this.checkModify();
      this.tongQueId = tongQueId;
   }

   public String getBattleId() {
      return this.battleId;
   }

   public void setBattleId(String battleId) {
      this.checkModify();
      this.battleId = battleId;
   }

   public List<Integer> getMysticSkillId() {
      return this.mysticSkillId;
   }

   public void setMysticSkillId(List<Integer> mysticSkillId) {
      this.checkModify();
      this.mysticSkillId = mysticSkillId;
   }

   public List<Integer> getArtifactId() {
      return this.artifactId;
   }

   public void setArtifactId(List<Integer> artifactId) {
      this.checkModify();
      this.artifactId = artifactId;
   }

   public int getWarcraftNum() {
      return this.warcraftNum;
   }

   public void setWarcraftNum(int warcraftNum) {
      this.checkModify();
      this.warcraftNum = warcraftNum;
   }

   public List<Integer> getWarcraftId() {
      return this.warcraftId;
   }

   public void setWarcraftId(List<Integer> warcraftId) {
      this.checkModify();
      this.warcraftId = warcraftId;
   }

   public List<Integer> getPractiseId() {
      return this.practiseId;
   }

   public void setPractiseId(List<Integer> practiseId) {
      this.checkModify();
      this.practiseId = practiseId;
   }

   public String getDeffeatedId() {
      return this.deffeatedId;
   }

   public void setDeffeatedId(String deffeatedId) {
      this.checkModify();
      this.deffeatedId = deffeatedId;
   }
}
