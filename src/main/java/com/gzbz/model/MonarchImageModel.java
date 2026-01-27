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
   file = "MonarchImage"
)
public class MonarchImageModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "useType",
      comment = "使用类型"
   )
   private int useType;
   @ModelColumnAnno(
      columnName = "unlockCondition1",
      comment = "解锁条件1"
   )
   private String unlockCondition1;
   @ModelColumnAnno(
      columnName = "skinId",
      comment = "君主形象图标id"
   )
   private int skinId;
   @ModelColumnAnno(
      columnName = "boostAttack",
      comment = "提升攻击"
   )
   private int boostAttack;
   @ModelColumnAnno(
      columnName = "enhanceLife",
      comment = "提升生命"
   )
   private int enhanceLife;
   @ModelColumnAnno(
      columnName = "antiknock",
      comment = "提升暴击"
   )
   private int antiknock;
   @ModelColumnAnno(
      columnName = "promoteSpeed",
      comment = "提升速度"
   )
   private int promoteSpeed;
   @ModelColumnAnno(
      columnName = "itemType",
      comment = "主类型1"
   )
   private int itemType;
   @ModelColumnAnno(
      columnName = "itemID",
      comment = "主id1"
   )
   private int itemID;
   @ModelColumnAnno(
      columnName = "combineNum",
      comment = "数量1"
   )
   private int combineNum;
   @ModelColumnAnno(
      columnName = "itemType1",
      comment = "主类型2"
   )
   private int itemType1;
   @ModelColumnAnno(
      columnName = "itemid1",
      comment = "主id2"
   )
   private int itemid1;
   @ModelColumnAnno(
      columnName = "combineNum2",
      comment = "数量2"
   )
   private int combineNum2;
   @ModelColumnAnno(
      columnName = "hide",
      comment = "是否隐藏"
   )
   private int hide;
   @ModelColumnAnno(
      columnName = "remarks",
      comment = "备注"
   )
   private String remarks;
   @ModelColumnAnno(
      columnName = "monsterShow",
      comment = "是否机器人可用"
   )
   private int monsterShow;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "获得道具"
   )
   private List<Integer> convert = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<Integer>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         MonarchImageModel model = (MonarchImageModel)entry.getValue();
         if (model.getMonsterShow() == 1) {
            ((List)tempHashMap.computeIfAbsent(model.useType, (v) -> new ArrayList())).add(model.id);
         }
      }

      pool.putMap("customMonarchImage", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getUnlockCondition1() {
      return this.unlockCondition1;
   }

   public void setUnlockCondition1(String unlockCondition1) {
      this.checkModify();
      this.unlockCondition1 = unlockCondition1;
   }

   public int getBoostAttack() {
      return this.boostAttack;
   }

   public void setBoostAttack(int boostAttack) {
      this.checkModify();
      this.boostAttack = boostAttack;
   }

   public int getEnhanceLife() {
      return this.enhanceLife;
   }

   public void setEnhanceLife(int enhanceLife) {
      this.checkModify();
      this.enhanceLife = enhanceLife;
   }

   public int getAntiknock() {
      return this.antiknock;
   }

   public void setAntiknock(int antiknock) {
      this.checkModify();
      this.antiknock = antiknock;
   }

   public int getPromoteSpeed() {
      return this.promoteSpeed;
   }

   public void setPromoteSpeed(int promoteSpeed) {
      this.checkModify();
      this.promoteSpeed = promoteSpeed;
   }

   public int getItemType() {
      return this.itemType;
   }

   public void setItemType(int itemType) {
      this.checkModify();
      this.itemType = itemType;
   }

   public int getItemID() {
      return this.itemID;
   }

   public void setItemID(int itemID) {
      this.checkModify();
      this.itemID = itemID;
   }

   public int getCombineNum() {
      return this.combineNum;
   }

   public void setCombineNum(int combineNum) {
      this.checkModify();
      this.combineNum = combineNum;
   }

   public int getItemType1() {
      return this.itemType1;
   }

   public void setItemType1(int itemType1) {
      this.checkModify();
      this.itemType1 = itemType1;
   }

   public int getItemid1() {
      return this.itemid1;
   }

   public void setItemid1(int itemid1) {
      this.checkModify();
      this.itemid1 = itemid1;
   }

   public int getCombineNum2() {
      return this.combineNum2;
   }

   public void setCombineNum2(int combineNum2) {
      this.checkModify();
      this.combineNum2 = combineNum2;
   }

   public int getHide() {
      return this.hide;
   }

   public void setHide(int hide) {
      this.checkModify();
      this.hide = hide;
   }

   public String getRemarks() {
      return this.remarks;
   }

   public void setRemarks(String remarks) {
      this.checkModify();
      this.remarks = remarks;
   }

   public int getSkinId() {
      return this.skinId;
   }

   public void setSkinId(int skinId) {
      this.checkModify();
      this.skinId = skinId;
   }

   public int getUseType() {
      return this.useType;
   }

   public void setUseType(int useType) {
      this.checkModify();
      this.useType = useType;
   }

   public int getMonsterShow() {
      return this.monsterShow;
   }

   public void setMonsterShow(int monsterShow) {
      this.checkModify();
      this.monsterShow = monsterShow;
   }

   public List<Integer> getConvert() {
      return this.convert;
   }

   public void setConvert(List<Integer> convert) {
      this.checkModify();
      this.convert = convert;
   }
}
