package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "mineVein"
)
public class MineVeinModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "矿洞id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "矿洞名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "矿洞类型"
   )
   private int subclass;
   @ModelColumnAnno(
      comment = "矿脉品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "破防值"
   )
   private int defNum;
   @ModelColumnAnno(
      comment = "每分钟固定收益数量"
   )
   private int fixFallNum;
   @ModelColumnAnno(
      comment = "每日时间额外数量提升"
   )
   private int eventUp;
   @ModelColumnAnno(
      comment = "公会buff额外提升数量"
   )
   private int unionUp;
   @ModelColumnAnno(
      comment = "巨型矿洞buff额外收益"
   )
   private int spUp;
   @ModelColumnAnno(
      comment = "周末矿场狂欢提升"
   )
   private int weekendUp;
   @ModelColumnAnno(
      comment = "固定收益上限"
   )
   private int fallMax;
   @ModelColumnAnno(
      comment = "每分钟额外掉落组"
   )
   private int dropOutId;
   @ModelColumnAnno(
      comment = "战斗id"
   )
   private int battleId;
   @ModelColumnAnno(
      comment = "收益飘字显示"
   )
   private int floatShow;
   @ModelColumnAnno(
      comment = "矿脉图标"
   )
   private int iconId;
   @ModelColumnAnno(
      comment = "攻打成功获得奖励"
   )
   private int successAward;
   @ModelColumnAnno(
      comment = "攻打失败获得奖励"
   )
   private int failAward;
   protected long suggestPower;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<MineVeinModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         MineVeinModel model = (MineVeinModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.type, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customMineVein", tempHashMap);
   }

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

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getSubclass() {
      return this.subclass;
   }

   public void setSubclass(int subclass) {
      this.checkModify();
      this.subclass = subclass;
   }

   public int getDefNum() {
      return this.defNum;
   }

   public void setDefNum(int defNum) {
      this.checkModify();
      this.defNum = defNum;
   }

   public int getFixFallNum() {
      return this.fixFallNum;
   }

   public void setFixFallNum(int fixFallNum) {
      this.checkModify();
      this.fixFallNum = fixFallNum;
   }

   public int getEventUp() {
      return this.eventUp;
   }

   public void setEventUp(int eventUp) {
      this.checkModify();
      this.eventUp = eventUp;
   }

   public int getUnionUp() {
      return this.unionUp;
   }

   public void setUnionUp(int unionUp) {
      this.checkModify();
      this.unionUp = unionUp;
   }

   public int getSpUp() {
      return this.spUp;
   }

   public void setSpUp(int spUp) {
      this.checkModify();
      this.spUp = spUp;
   }

   public long getSuggestPower() {
      return this.suggestPower;
   }

   public void setSuggestPower(long suggestPower) {
      this.suggestPower = suggestPower;
   }

   public int getWeekendUp() {
      return this.weekendUp;
   }

   public void setWeekendUp(int weekendUp) {
      this.checkModify();
      this.weekendUp = weekendUp;
   }

   public int getDropOutId() {
      return this.dropOutId;
   }

   public void setDropOutId(int dropOutId) {
      this.checkModify();
      this.dropOutId = dropOutId;
   }

   public int getBattleId() {
      return this.battleId;
   }

   public void setBattleId(int battleId) {
      this.checkModify();
      this.battleId = battleId;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getFallMax() {
      return this.fallMax;
   }

   public void setFallMax(int fallMax) {
      this.checkModify();
      this.fallMax = fallMax;
   }

   public int getFloatShow() {
      return this.floatShow;
   }

   public void setFloatShow(int floatShow) {
      this.checkModify();
      this.floatShow = floatShow;
   }

   public int getIconId() {
      return this.iconId;
   }

   public void setIconId(int iconId) {
      this.checkModify();
      this.iconId = iconId;
   }

   public int getSuccessAward() {
      return this.successAward;
   }

   public void setSuccessAward(int successAward) {
      this.checkModify();
      this.successAward = successAward;
   }

   public int getFailAward() {
      return this.failAward;
   }

   public void setFailAward(int failAward) {
      this.checkModify();
      this.failAward = failAward;
   }
}
