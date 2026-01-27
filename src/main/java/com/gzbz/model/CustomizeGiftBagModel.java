package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "customizeGiftBag"
)
public class CustomizeGiftBagModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "礼包名称"
   )
   private String giftName;
   @ModelColumnAnno(
      comment = "特定道具类型"
   )
   private int specificPropsType;
   @ModelColumnAnno(
      comment = "特定道具id"
   )
   private int specificPropsId;
   @ModelColumnAnno(
      comment = "特定道具数量"
   )
   private int specificPropsNum;
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "group",
      subCls = Integer.class,
      count = 3,
      comment = "定制组"
   )
   private Map<Integer, Integer> group = new LinkedHashMap();
   @ModelColumnAnno(
      comment = "固定组"
   )
   private int regular;
   @ModelColumnAnno(
      comment = "系统id"
   )
   private int systemid;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public String getGiftName() {
      return this.giftName;
   }

   public void setGiftName(String giftName) {
      this.checkModify();
      this.giftName = giftName;
   }

   public int getSpecificPropsType() {
      return this.specificPropsType;
   }

   public void setSpecificPropsType(int specificPropsType) {
      this.checkModify();
      this.specificPropsType = specificPropsType;
   }

   public int getSpecificPropsId() {
      return this.specificPropsId;
   }

   public void setSpecificPropsId(int specificPropsId) {
      this.checkModify();
      this.specificPropsId = specificPropsId;
   }

   public int getSpecificPropsNum() {
      return this.specificPropsNum;
   }

   public void setSpecificPropsNum(int specificPropsNum) {
      this.checkModify();
      this.specificPropsNum = specificPropsNum;
   }

   public Map<Integer, Integer> getGroup() {
      return this.group;
   }

   public void setGroup(Map<Integer, Integer> group) {
      this.checkModify();
      this.group = group;
   }

   public int getRegular() {
      return this.regular;
   }

   public void setRegular(int regular) {
      this.checkModify();
      this.regular = regular;
   }

   public int getSystemid() {
      return this.systemid;
   }

   public void setSystemid(int systemid) {
      this.checkModify();
      this.systemid = systemid;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, CustomizeGiftBagModel>> tempHashMap = new ConcurrentHashMap();
      ConcurrentHashMap<Integer, Map<Integer, CustomizeGiftBagModel>> systemId_tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         CustomizeGiftBagModel customizeGiftBagModel = (CustomizeGiftBagModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(customizeGiftBagModel.activityId, (v) -> new TreeMap())).put(customizeGiftBagModel.id, customizeGiftBagModel);
         ((Map)systemId_tempHashMap.computeIfAbsent(customizeGiftBagModel.systemid, (v) -> new TreeMap())).put(customizeGiftBagModel.id, customizeGiftBagModel);
      }

      pool.putMap("customCustomizeGiftBag", tempHashMap);
      pool.putMap("custom2CustomizeGiftBag", systemId_tempHashMap);
   }
}
