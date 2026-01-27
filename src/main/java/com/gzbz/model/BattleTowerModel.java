package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "battleTower"
)
public class BattleTowerModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id，难度"
   )
   private int id;
   @ModelColumnAnno(
      comment = "名字"
   )
   private String name;
   @ModelColumnAnno(
      comment = "怪物组"
   )
   private int battle;
   @ModelColumnAnno(
      comment = "战斗场景id"
   )
   private int battleScene;
   @ModelColumnAnno(
      comment = "形象英雄id"
   )
   private int heroId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "首通奖励"
   )
   private List<ResourceModel> firstRewards = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "通关奖励"
   )
   private List<ResourceModel> passRewards = new ArrayList();
   protected long suggestPower;

   public long getSuggesPower() {
      return this.suggestPower;
   }

   public void setSuggesPower(long suggestPower) {
      this.suggestPower = suggestPower;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getBattle() {
      return this.battle;
   }

   public void setBattle(int battle) {
      this.checkModify();
      this.battle = battle;
   }

   public int getBattleScene() {
      return this.battleScene;
   }

   public void setBattleScene(int battleScene) {
      this.checkModify();
      this.battleScene = battleScene;
   }

   public int getHeroId() {
      return this.heroId;
   }

   public void setHeroId(int heroId) {
      this.checkModify();
      this.heroId = heroId;
   }

   public List<ResourceModel> getFirstRewards() {
      return this.firstRewards;
   }

   public void setFirstRewards(List<ResourceModel> firstRewards) {
      this.checkModify();
      this.firstRewards = firstRewards;
   }

   public List<ResourceModel> getPassRewards() {
      return this.passRewards;
   }

   public void setPassRewards(List<ResourceModel> passRewards) {
      this.checkModify();
      this.passRewards = passRewards;
   }
}
