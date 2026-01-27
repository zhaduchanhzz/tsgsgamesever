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
   file = "GeneralAvatar"
)
public class GeneralAvatarModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "name",
      comment = "君主形象名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "avatarId",
      comment = "武将头像id"
   )
   private int avatarId;
   @ModelColumnAnno(
      columnName = "have",
      comment = "是否拥有"
   )
   private int have;
   @ModelColumnAnno(
      columnName = "unlockCondition1",
      comment = "解锁条件"
   )
   private String unlockCondition1;
   @ModelColumnAnno(
      columnName = "unlockType",
      comment = "头像类型"
   )
   private int unlockType;
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
   @ModelColumnAnno(
      columnName = "trendsCondition1",
      comment = "动态头像解锁条件"
   )
   private String trendsCondition1;
   @ModelColumnAnno(
      columnName = "trendsId",
      comment = "动态头像"
   )
   private int trendsId;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<Integer>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         GeneralAvatarModel model = (GeneralAvatarModel)entry.getValue();
         if (model.getMonsterShow() == 1) {
            ((List)tempHashMap.computeIfAbsent(model.unlockType, (v) -> new ArrayList())).add(model.id);
         }
      }

      pool.putMap("customGeneralAvatar", tempHashMap);
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

   public int getAvatarId() {
      return this.avatarId;
   }

   public void setAvatarId(int avatarId) {
      this.checkModify();
      this.avatarId = avatarId;
   }

   public int getHave() {
      return this.have;
   }

   public void setHave(int have) {
      this.checkModify();
      this.have = have;
   }

   public String getUnlockCondition1() {
      return this.unlockCondition1;
   }

   public void setUnlockCondition1(String unlockCondition1) {
      this.checkModify();
      this.unlockCondition1 = unlockCondition1;
   }

   public int getUnlockType() {
      return this.unlockType;
   }

   public void setUnlockType(int unlockType) {
      this.checkModify();
      this.unlockType = unlockType;
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

   public String getTrendsCondition1() {
      return this.trendsCondition1;
   }

   public void setTrendsCondition1(String trendsCondition1) {
      this.checkModify();
      this.trendsCondition1 = trendsCondition1;
   }

   public int getTrendsId() {
      return this.trendsId;
   }

   public void setTrendsId(int trendsId) {
      this.checkModify();
      this.trendsId = trendsId;
   }
}
