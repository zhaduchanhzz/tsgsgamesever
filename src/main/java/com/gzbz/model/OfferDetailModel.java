package com.gzbz.model;

import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.model.fun.ThreeFieldModel;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashMap;
import java.util.Map;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "offerDetail"
)
public class OfferDetailModel extends BaseModel {
   @ModelColumnAnno(
      comment = "id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "战斗id"
   )
   private int battleid;
   @ModelColumnAnno(
      comment = "基础赏金"
   )
   private int offerMoney;
   @ModelColumnAnno(
      comment = "怪物生成组",
      columnConvertType = 1,
      subCls = ThreeFieldModel.class,
      count = 4
   )
   private Map<Integer, ThreeFieldModel> hero = new HashMap();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getBattleid() {
      return this.battleid;
   }

   public void setBattleid(int battleid) {
      this.checkModify();
      this.battleid = battleid;
   }

   public int getOfferMoney() {
      return this.offerMoney;
   }

   public void setOfferMoney(int offerMoney) {
      this.checkModify();
      this.offerMoney = offerMoney;
   }

   public Map<Integer, ThreeFieldModel> getHero() {
      return this.hero;
   }

   public void setHero(Map<Integer, ThreeFieldModel> hero) {
      this.checkModify();
      this.hero = hero;
   }

   public long getMasterHp() {
      BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", this.getBattleid());
      if (battleModel == null) {
         return 0L;
      } else {
         long hp = 0L;
         BattlePKTeam pkTeam = new BattlePKTeam(this.getBattleid());

         for(Entity entity : pkTeam.getEntityMap().values()) {
            hp += entity.getBaseProperty(1);
         }

         return hp;
      }
   }
}
