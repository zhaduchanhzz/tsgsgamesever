package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "HefuBattleConfig"
)
public class HeFuBattleConfigModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "章节id"
   )
   private int chapterId;
   @ModelColumnAnno(
      comment = "玩家行动力"
   )
   private int playerActive;
   @ModelColumnAnno(
      comment = "挑战消耗行动力"
   )
   private int challenge;
   @ModelColumnAnno(
      comment = "被挑战消耗行动力"
   )
   private int beChallenge;
   @ModelColumnAnno(
      comment = "失败额外消耗行动力"
   )
   private int lose;
   @ModelColumnAnno(
      comment = "挑战冷却时间"
   )
   private int challengeCd;
   @ModelColumnAnno(
      comment = "被挑战冷却时间"
   )
   private int beChallengeCd;
   @ModelColumnAnno(
      comment = "大本营冷却时间"
   )
   private int campCd;
   @ModelColumnAnno(
      comment = "重置倒计时"
   )
   private int resetting;
   @ModelColumnAnno(
      comment = "破防保底积分"
   )
   private int defensePoint;
   @ModelColumnAnno(
      comment = "连胜积分"
   )
   private String winningStreakPoint;
   @ModelColumnAnno(
      comment = "军团积分排行奖励",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> pointGroup = new ArrayList();
   @ModelColumnAnno(
      comment = "龙柱战斗"
   )
   private int defenceBossId;
   @ModelColumnAnno(
      comment = "集结点个数"
   )
   private int assembiyPonint;
   @ModelColumnAnno(
      comment = "占领龙柱时长，强行结束"
   )
   private int occupyTime;
   @ModelColumnAnno(
      comment = "连胜场次弹窗",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> winningStreakNum = new ArrayList();
   @ModelColumnAnno(
      comment = "格子上人数上限",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> mergeWarGamePerMove = new ArrayList();

   public int getChapterId() {
      return this.chapterId;
   }

   public void setChapterId(int chapterId) {
      this.checkModify();
      this.chapterId = chapterId;
   }

   public int getPlayerActive() {
      return this.playerActive;
   }

   public void setPlayerActive(int playerActive) {
      this.checkModify();
      this.playerActive = playerActive;
   }

   public int getChallenge() {
      return this.challenge;
   }

   public void setChallenge(int challenge) {
      this.checkModify();
      this.challenge = challenge;
   }

   public int getBeChallenge() {
      return this.beChallenge;
   }

   public void setBeChallenge(int beChallenge) {
      this.checkModify();
      this.beChallenge = beChallenge;
   }

   public int getLose() {
      return this.lose;
   }

   public void setLose(int lose) {
      this.checkModify();
      this.lose = lose;
   }

   public int getChallengeCd() {
      return this.challengeCd;
   }

   public void setChallengeCd(int challengeCd) {
      this.checkModify();
      this.challengeCd = challengeCd;
   }

   public int getBeChallengeCd() {
      return this.beChallengeCd;
   }

   public void setBeChallengeCd(int beChallengeCd) {
      this.checkModify();
      this.beChallengeCd = beChallengeCd;
   }

   public int getCampCd() {
      return this.campCd;
   }

   public void setCampCd(int campCd) {
      this.checkModify();
      this.campCd = campCd;
   }

   public int getAssembiyPonint() {
      return this.assembiyPonint;
   }

   public void setAssembiyPonint(int assembiyPonint) {
      this.checkModify();
      this.assembiyPonint = assembiyPonint;
   }

   public int getOccupyTime() {
      return this.occupyTime;
   }

   public void setOccupyTime(int occupyTime) {
      this.checkModify();
      this.occupyTime = occupyTime;
   }

   public int getDefenceBossId() {
      return this.defenceBossId;
   }

   public void setDefenceBossId(int defenceBossId) {
      this.checkModify();
      this.defenceBossId = defenceBossId;
   }

   public List<Integer> getPointGroup() {
      return this.pointGroup;
   }

   public void setPointGroup(List<Integer> pointGroup) {
      this.checkModify();
      this.pointGroup = pointGroup;
   }

   public int getResetting() {
      return this.resetting;
   }

   public void setResetting(int resetting) {
      this.checkModify();
      this.resetting = resetting;
   }

   public int getDefensePoint() {
      return this.defensePoint;
   }

   public void setDefensePoint(int defensePoint) {
      this.checkModify();
      this.defensePoint = defensePoint;
   }

   public String getWinningStreakPoint() {
      return this.winningStreakPoint;
   }

   public void setWinningStreakPoint(String winningStreakPoint) {
      this.checkModify();
      this.winningStreakPoint = winningStreakPoint;
   }

   public List<Integer> getWinningStreakNum() {
      return this.winningStreakNum;
   }

   public void setWinningStreakNum(List<Integer> winningStreakNum) {
      this.checkModify();
      this.winningStreakNum = winningStreakNum;
   }

   public List<Integer> getMergeWarGamePerMove() {
      return this.mergeWarGamePerMove;
   }

   public void setMergeWarGamePerMove(List<Integer> mergeWarGamePerMove) {
      this.checkModify();
      this.mergeWarGamePerMove = mergeWarGamePerMove;
   }
}
