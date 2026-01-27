package com.gzbz.model;

import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "unionCopy"
)
public class UnionCopyModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "关卡id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "name",
      comment = "章节名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "sceneId",
      comment = "场景id"
   )
   private int sceneId;
   @ModelColumnAnno(
      comment = "悬赏序号"
   )
   private int offerid;
   @ModelColumnAnno(
      columnName = "sectionId",
      comment = "章节编号"
   )
   private int sectionId;
   @ModelColumnAnno(
      columnName = "nextId",
      comment = "下个副本ID"
   )
   private int nextId;
   @ModelColumnAnno(
      columnName = "battle",
      comment = "战斗"
   )
   private int battle;
   @ModelColumnAnno(
      columnName = "rounds",
      comment = "战斗回合数"
   )
   private int rounds;
   @ModelColumnAnno(
      columnName = "iconPath",
      comment = "图示路径"
   )
   private int iconPath;
   @ModelColumnAnno(
      columnName = "mapPositionX",
      comment = "在地图上的X轴位置"
   )
   private int mapPositionX;
   @ModelColumnAnno(
      columnName = "mapPositionY",
      comment = "在地图上的Y轴位置"
   )
   private int mapPositionY;
   @ModelColumnAnno(
      columnName = "attContribution",
      comment = "伤害奖励贡献"
   )
   private int attContribution;
   @ModelColumnAnno(
      columnName = "attCopper",
      comment = "伤害奖励铜钱数"
   )
   private int attCopper;
   @ModelColumnAnno(
      columnName = "killContribution",
      comment = "击杀贡献奖励"
   )
   private int killContribution;
   @ModelColumnAnno(
      columnName = "killUnionExp",
      comment = "击杀经验奖励"
   )
   private int killUnionExp;
   @ModelColumnAnno(
      columnName = "rankLayer",
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "伤害奖励分级"
   )
   private List<Integer> rankLayer;
   @ModelColumnAnno(
      columnName = "rankCopper",
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "伤害排名奖励铜钱数量"
   )
   private List<Integer> rankCopper;
   @ModelColumnAnno(
      columnName = "rankContribution",
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "伤害排名奖励联盟贡献数量"
   )
   private List<Integer> rankContribution;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, UnionCopyModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         UnionCopyModel model = (UnionCopyModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(0, (v) -> new TreeMap())).put(model.id, model);
      }

      pool.putMap("customUnionCopy", tempHashMap);
   }

   public long getCopyMasterHp() {
      BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", this.battle);
      if (battleModel == null) {
         return 0L;
      } else {
         long hp = 0L;
         BattlePKTeam right = new BattlePKTeam(this.getBattle());

         for(Entity entity : right.getEntityMap().values()) {
            hp += entity.getBaseProperty(1);
         }

         return hp;
      }
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

   public int getSceneId() {
      return this.sceneId;
   }

   public void setSceneId(int sceneId) {
      this.checkModify();
      this.sceneId = sceneId;
   }

   public int getOfferid() {
      return this.offerid;
   }

   public void setOfferid(int offerid) {
      this.checkModify();
      this.offerid = offerid;
   }

   public int getSectionId() {
      return this.sectionId;
   }

   public void setSectionId(int sectionId) {
      this.checkModify();
      this.sectionId = sectionId;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
   }

   public int getBattle() {
      return this.battle;
   }

   public void setBattle(int battle) {
      this.checkModify();
      this.battle = battle;
   }

   public int getRounds() {
      return this.rounds;
   }

   public void setRounds(int rounds) {
      this.checkModify();
      this.rounds = rounds;
   }

   public int getIconPath() {
      return this.iconPath;
   }

   public void setIconPath(int iconPath) {
      this.checkModify();
      this.iconPath = iconPath;
   }

   public int getMapPositionX() {
      return this.mapPositionX;
   }

   public void setMapPositionX(int mapPositionX) {
      this.checkModify();
      this.mapPositionX = mapPositionX;
   }

   public int getMapPositionY() {
      return this.mapPositionY;
   }

   public void setMapPositionY(int mapPositionY) {
      this.checkModify();
      this.mapPositionY = mapPositionY;
   }

   public int getAttContribution() {
      return this.attContribution;
   }

   public void setAttContribution(int attContribution) {
      this.checkModify();
      this.attContribution = attContribution;
   }

   public int getAttCopper() {
      return this.attCopper;
   }

   public void setAttCopper(int attCopper) {
      this.checkModify();
      this.attCopper = attCopper;
   }

   public int getKillContribution() {
      return this.killContribution;
   }

   public void setKillContribution(int killContribution) {
      this.checkModify();
      this.killContribution = killContribution;
   }

   public int getKillUnionExp() {
      return this.killUnionExp;
   }

   public void setKillUnionExp(int killUnionExp) {
      this.checkModify();
      this.killUnionExp = killUnionExp;
   }

   public List<Integer> getRankLayer() {
      return this.rankLayer;
   }

   public void setRankLayer(List<Integer> rankLayer) {
      this.checkModify();
      this.rankLayer = rankLayer;
   }

   public List<Integer> getRankCopper() {
      return this.rankCopper;
   }

   public void setRankCopper(List<Integer> rankCopper) {
      this.checkModify();
      this.rankCopper = rankCopper;
   }

   public List<Integer> getRankContribution() {
      return this.rankContribution;
   }

   public void setRankContribution(List<Integer> rankContribution) {
      this.checkModify();
      this.rankContribution = rankContribution;
   }
}
