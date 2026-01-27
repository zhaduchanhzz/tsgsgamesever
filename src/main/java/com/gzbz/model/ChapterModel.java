package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "chapter"
)
public class ChapterModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "关卡id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "adventureMax",
      comment = "情报上限标准值"
   )
   private int adventureMax;
   @ModelColumnAnno(
      columnName = "level",
      comment = "挑战所需玩家等级"
   )
   private int level;
   @ModelColumnAnno(
      columnName = "minDrops",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 4,
      comment = "每分钟掉落"
   )
   private ArrayList<ResourceModel> minDrops = new ArrayList();
   @ModelColumnAnno(
      columnName = "itemDrop",
      comment = "每分钟随机道具掉落ID"
   )
   private int itemDrop;
   @ModelColumnAnno(
      columnName = "passAwards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5,
      comment = "首通奖励"
   )
   private ArrayList<ResourceModel> passAwards = new ArrayList();
   @ModelColumnAnno(
      columnName = "battle",
      comment = "战斗id"
   )
   private int battle;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getAdventureMax() {
      return this.adventureMax;
   }

   public void setAdventureMax(int adventureMax) {
      this.checkModify();
      this.adventureMax = adventureMax;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public ArrayList<ResourceModel> getMinDrops() {
      return this.minDrops;
   }

   public void setMinDrops(ArrayList<ResourceModel> minDrops) {
      this.checkModify();
      this.minDrops = minDrops;
   }

   public int getItemDrop() {
      return this.itemDrop;
   }

   public void setItemDrop(int itemDrop) {
      this.checkModify();
      this.itemDrop = itemDrop;
   }

   public ArrayList<ResourceModel> getPassAwards() {
      return this.passAwards;
   }

   public void setPassAwards(ArrayList<ResourceModel> passAwards) {
      this.checkModify();
      this.passAwards = passAwards;
   }

   public int getBattle() {
      return this.battle;
   }

   public void setBattle(int battle) {
      this.checkModify();
      this.battle = battle;
   }
}
