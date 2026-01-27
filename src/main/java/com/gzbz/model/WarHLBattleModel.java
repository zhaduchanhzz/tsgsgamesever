package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warHLBattle"
)
public class WarHLBattleModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "层id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "关卡名字"
   )
   private String name;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "守关怪物组配置"
   )
   private List<Integer> enemies = new ArrayList();
   @ModelColumnAnno(
      comment = "战斗场景"
   )
   private int battleScene;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "关卡事件配置组"
   )
   private List<Integer> events = new ArrayList();
   @ModelColumnAnno(
      comment = "关卡描述与备注"
   )
   private String desc;

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

   public List<Integer> getEnemies() {
      return this.enemies;
   }

   public void setEnemies(List<Integer> enemies) {
      this.checkModify();
      this.enemies = enemies;
   }

   public int getBattleScene() {
      return this.battleScene;
   }

   public void setBattleScene(int battleScene) {
      this.checkModify();
      this.battleScene = battleScene;
   }

   public List<Integer> getEvents() {
      return this.events;
   }

   public void setEvents(List<Integer> events) {
      this.checkModify();
      this.events = events;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
