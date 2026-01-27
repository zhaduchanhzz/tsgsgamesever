package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DecisiveBattleMain"
)
public class DecisiveBattleMainModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "积分下限"
   )
   private int rankintegrallow;
   @ModelColumnAnno(
      comment = "积分上限"
   )
   private int rankintegralhigh;
   @ModelColumnAnno(
      comment = "是否失败扣分"
   )
   private int losereduce;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "匹配段位优先级"
   )
   private List<Integer> rankmatch = new ArrayList();
   @ModelColumnAnno(
      comment = "是否配置机器人"
   )
   private int robotchoose;
   @ModelColumnAnno(
      comment = "保护积分"
   )
   private int lowestscore;
   @ModelColumnAnno(
      comment = "战斗场景"
   )
   private int battkeScene;
   @ModelColumnAnno(
      comment = "助阵类型"
   )
   private int supportType;
   @ModelColumnAnno(
      comment = "回合上限"
   )
   private int roundLimit;
   @ModelColumnAnno(
      comment = "星级上限"
   )
   private int heroStarLimit;
   @ModelColumnAnno(
      comment = "奇书阶级id"
   )
   private int mysticBookId;
   @ModelColumnAnno(
      comment = "战法品质上限"
   )
   private int WarcraftLimit;
   @ModelColumnAnno(
      comment = "将印品质上限"
   )
   private int warriorSignetLimit;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "奇书技能id"
   )
   private List<Integer> mysticBookClass = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "美人上阵Id"
   )
   private List<Integer> tongQueId = new ArrayList();
   @ModelColumnAnno(
      comment = "美人上阵数量"
   )
   private int tongQueNum;
   @ModelColumnAnno(
      comment = "美人幽会等级上限"
   )
   private int tongQueUpLevel;
   @ModelColumnAnno(
      comment = "美人赏赐等级上限"
   )
   private int tongQuebestowlevel;
   @ModelColumnAnno(
      comment = "美人技能等级上限"
   )
   private int tongQueSkillLevel;
   @ModelColumnAnno(
      comment = "神兵等级上限"
   )
   private int artifactLevel;
   @ModelColumnAnno(
      comment = "神兵技能等级上限"
   )
   private int artifactSkillLevel;
   @ModelColumnAnno(
      comment = "神兵精炼等级上限"
   )
   private int artifactRefineLevel;
   @ModelColumnAnno(
      comment = "是否连续匹配"
   )
   private int matchPlayer;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "连败匹配机器人"
   )
   private List<Integer> maintainFractionMatch = new ArrayList();
   @ModelColumnAnno(
      comment = "配饰星级"
   )
   private int stampStar;
   @ModelColumnAnno(
      comment = "配饰品质"
   )
   private int stampQuality;
   @ModelColumnAnno(
      comment = "胜利获得积分"
   )
   private int winget;
   @ModelColumnAnno(
      comment = "失败减少积分"
   )
   private int losedecrease;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getRankintegrallow() {
      return this.rankintegrallow;
   }

   public void setRankintegrallow(int rankintegrallow) {
      this.checkModify();
      this.rankintegrallow = rankintegrallow;
   }

   public int getRankintegralhigh() {
      return this.rankintegralhigh;
   }

   public void setRankintegralhigh(int rankintegralhigh) {
      this.checkModify();
      this.rankintegralhigh = rankintegralhigh;
   }

   public int getLosereduce() {
      return this.losereduce;
   }

   public void setLosereduce(int losereduce) {
      this.checkModify();
      this.losereduce = losereduce;
   }

   public int getBattkeScene() {
      return this.battkeScene;
   }

   public void setBattkeScene(int battkeScene) {
      this.checkModify();
      this.battkeScene = battkeScene;
   }

   public int getSupportType() {
      return this.supportType;
   }

   public void setSupportType(int supportType) {
      this.checkModify();
      this.supportType = supportType;
   }

   public int getRoundLimit() {
      return this.roundLimit;
   }

   public void setRoundLimit(int roundLimit) {
      this.checkModify();
      this.roundLimit = roundLimit;
   }

   public int getHeroStarLimit() {
      return this.heroStarLimit;
   }

   public void setHeroStarLimit(int heroStarLimit) {
      this.checkModify();
      this.heroStarLimit = heroStarLimit;
   }

   public int getTongQueUpLevel() {
      return this.tongQueUpLevel;
   }

   public void setTongQueUpLevel(int tongQueUpLevel) {
      this.checkModify();
      this.tongQueUpLevel = tongQueUpLevel;
   }

   public int getTongQuebestowlevel() {
      return this.tongQuebestowlevel;
   }

   public void setTongQuebestowlevel(int tongQuebestowlevel) {
      this.checkModify();
      this.tongQuebestowlevel = tongQuebestowlevel;
   }

   public int getTongQueSkillLevel() {
      return this.tongQueSkillLevel;
   }

   public void setTongQueSkillLevel(int tongQueSkillLevel) {
      this.checkModify();
      this.tongQueSkillLevel = tongQueSkillLevel;
   }

   public int getArtifactSkillLevel() {
      return this.artifactSkillLevel;
   }

   public void setArtifactSkillLevel(int artifactSkillLevel) {
      this.checkModify();
      this.artifactSkillLevel = artifactSkillLevel;
   }

   public int getArtifactRefineLevel() {
      return this.artifactRefineLevel;
   }

   public void setArtifactRefineLevel(int artifactRefineLevel) {
      this.checkModify();
      this.artifactRefineLevel = artifactRefineLevel;
   }

   public int getMysticBookId() {
      return this.mysticBookId;
   }

   public void setMysticBookId(int mysticBookId) {
      this.checkModify();
      this.mysticBookId = mysticBookId;
   }

   public List<Integer> getMysticBookClass() {
      return this.mysticBookClass;
   }

   public void setMysticBookClass(List<Integer> mysticBookClass) {
      this.checkModify();
      this.mysticBookClass = mysticBookClass;
   }

   public int getWarriorSignetLimit() {
      return this.warriorSignetLimit;
   }

   public void setWarriorSignetLimit(int warriorSignetLimit) {
      this.checkModify();
      this.warriorSignetLimit = warriorSignetLimit;
   }

   public int getWarcraftLimit() {
      return this.WarcraftLimit;
   }

   public void setWarcraftLimit(int warcraftLimit) {
      this.checkModify();
      this.WarcraftLimit = warcraftLimit;
   }

   public int getArtifactLevel() {
      return this.artifactLevel;
   }

   public void setArtifactLevel(int artifactLevel) {
      this.checkModify();
      this.artifactLevel = artifactLevel;
   }

   public List<Integer> getTongQueId() {
      return this.tongQueId;
   }

   public void setTongQueId(List<Integer> tongQueId) {
      this.checkModify();
      this.tongQueId = tongQueId;
   }

   public int getTongQueNum() {
      return this.tongQueNum;
   }

   public void setTongQueNum(int tongQueNum) {
      this.checkModify();
      this.tongQueNum = tongQueNum;
   }

   public List<Integer> getRankmatch() {
      return this.rankmatch;
   }

   public void setRankmatch(List<Integer> rankmatch) {
      this.checkModify();
      this.rankmatch = rankmatch;
   }

   public int getRobotchoose() {
      return this.robotchoose;
   }

   public void setRobotchoose(int robotchoose) {
      this.checkModify();
      this.robotchoose = robotchoose;
   }

   public int getLowestscore() {
      return this.lowestscore;
   }

   public void setLowestscore(int lowestscore) {
      this.checkModify();
      this.lowestscore = lowestscore;
   }

   public int getMatchPlayer() {
      return this.matchPlayer;
   }

   public void setMatchPlayer(int matchPlayer) {
      this.checkModify();
      this.matchPlayer = matchPlayer;
   }

   public List<Integer> getMaintainFractionMatch() {
      return this.maintainFractionMatch;
   }

   public void setMaintainFractionMatch(List<Integer> maintainFractionMatch) {
      this.checkModify();
      this.maintainFractionMatch = maintainFractionMatch;
   }

   public int getStampStar() {
      return this.stampStar;
   }

   public void setStampStar(int stampStar) {
      this.checkModify();
      this.stampStar = stampStar;
   }

   public int getStampQuality() {
      return this.stampQuality;
   }

   public void setStampQuality(int stampQuality) {
      this.checkModify();
      this.stampQuality = stampQuality;
   }

   public int getWinget() {
      return this.winget;
   }

   public void setWinget(int winget) {
      this.checkModify();
      this.winget = winget;
   }

   public int getLosedecrease() {
      return this.losedecrease;
   }

   public void setLosedecrease(int losedecrease) {
      this.checkModify();
      this.losedecrease = losedecrease;
   }
}
