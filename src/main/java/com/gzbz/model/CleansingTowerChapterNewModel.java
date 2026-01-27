package com.gzbz.model;

import com.gzbz.model.fun.CleansingTowerBoxRewardItem;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "cleansingTowerChapterNew"
)
public class CleansingTowerChapterNewModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "id",
      comment = "章节id"
   )
   private int chapter;
   @ModelColumnAnno(
      columnName = "level",
      comment = "包含关卡",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> levelList = new ArrayList();
   @ModelColumnAnno(
      columnName = "boxReward",
      comment = "进度奖励列表",
      columnConvertType = 1,
      subCls = CleansingTowerBoxRewardItem.class,
      count = 3
   )
   private List<CleansingTowerBoxRewardItem> boxRewards = new ArrayList();

   public int getChapter() {
      return this.chapter;
   }

   public void setChapter(int chapter) {
      this.checkModify();
      this.chapter = chapter;
   }

   public List<Integer> getlevelList() {
      return this.levelList;
   }

   public void setlevelList(List<Integer> levelList) {
      this.checkModify();
      this.levelList = levelList;
   }

   public List<CleansingTowerBoxRewardItem> getBoxRewards() {
      return this.boxRewards;
   }

   public void setBoxRewards(List<CleansingTowerBoxRewardItem> boxRewards) {
      this.checkModify();
      this.boxRewards = boxRewards;
   }
}
