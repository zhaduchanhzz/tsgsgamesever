package com.gzbz.model;

import com.gzbz.model.fun.CleansingTowerBoxRewardItem;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "catapultGameChapter"
)
public class CatapultGameChapterModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "id",
      comment = "章节id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "level",
      comment = "包含关卡",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> level = new ArrayList();
   @ModelColumnAnno(
      columnName = "boxReward",
      comment = "进度奖励列表",
      columnConvertType = 1,
      subCls = CleansingTowerBoxRewardItem.class,
      count = 3
   )
   private List<CleansingTowerBoxRewardItem> boxReward = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<Integer> getLevel() {
      return this.level;
   }

   public void setLevel(List<Integer> level) {
      this.checkModify();
      this.level = level;
   }

   public List<CleansingTowerBoxRewardItem> getBoxReward() {
      return this.boxReward;
   }

   public void setBoxReward(List<CleansingTowerBoxRewardItem> boxReward) {
      this.checkModify();
      this.boxReward = boxReward;
   }
}
