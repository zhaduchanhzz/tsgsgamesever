package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.MiscUtil;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "PrizePool"
)
public class PrizePoolModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "日期组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "日期组末尾"
   )
   private int dateEnd;
   @ModelColumnAnno(
      comment = "物品类型"
   )
   private int itemType;
   @ModelColumnAnno(
      comment = "物品id"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "物品数量"
   )
   private int itemNum;
   @ModelColumnAnno(
      comment = "出现概率"
   )
   private int odds;
   @ModelColumnAnno(
      comment = "标签"
   )
   private int label;
   @ModelColumnAnno(
      comment = "赐福记录"
   )
   private int isRecord;
   @ModelColumnAnno(
      comment = "赐福广播"
   )
   private int isRadio;
   @ModelColumnAnno(
      comment = "锦鲤物品类型"
   )
   private int carpItemType;
   @ModelColumnAnno(
      comment = "锦鲤物品id"
   )
   private int carpItemId;
   @ModelColumnAnno(
      comment = "锦鲤物品数量"
   )
   private int carItemNum;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Long, TreeMap<Integer, PrizePoolModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         PrizePoolModel model = (PrizePoolModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(MiscUtil.comboInteger(model.dateStart, model.dateEnd), (v) -> new TreeMap())).put(model.id, model);
      }

      pool.putMap("customPrizePool", tempHashMap);
   }

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

   public int getItemType() {
      return this.itemType;
   }

   public void setItemType(int itemType) {
      this.checkModify();
      this.itemType = itemType;
   }

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }

   public int getItemNum() {
      return this.itemNum;
   }

   public void setItemNum(int itemNum) {
      this.checkModify();
      this.itemNum = itemNum;
   }

   public int getOdds() {
      return this.odds;
   }

   public void setOdds(int odds) {
      this.checkModify();
      this.odds = odds;
   }

   public int getLabel() {
      return this.label;
   }

   public void setLabel(int label) {
      this.checkModify();
      this.label = label;
   }

   public int getCarpItemType() {
      return this.carpItemType;
   }

   public void setCarpItemType(int carpItemType) {
      this.checkModify();
      this.carpItemType = carpItemType;
   }

   public int getCarpItemId() {
      return this.carpItemId;
   }

   public void setCarpItemId(int carpItemId) {
      this.checkModify();
      this.carpItemId = carpItemId;
   }

   public int getCarItemNum() {
      return this.carItemNum;
   }

   public void setCarItemNum(int carItemNum) {
      this.checkModify();
      this.carItemNum = carItemNum;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public void setDateStart(int dateStart) {
      this.checkModify();
      this.dateStart = dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public void setDateEnd(int dateEnd) {
      this.checkModify();
      this.dateEnd = dateEnd;
   }

   public int getIsRecord() {
      return this.isRecord;
   }

   public void setIsRecord(int isRecord) {
      this.checkModify();
      this.isRecord = isRecord;
   }

   public int getIsRadio() {
      return this.isRadio;
   }

   public void setIsRadio(int isRadio) {
      this.checkModify();
      this.isRadio = isRadio;
   }

   public static TreeMap<Integer, PrizePoolModel> getPrizePoolByServerOpenTime(int serverOpenDay) {
      Map<Long, TreeMap<Integer, PrizePoolModel>> allPrizePoolMap = ApplicationContextProvider.<Long, TreeMap<Integer, PrizePoolModel>>getModelPoolMap("customPrizePool");

      for(Map.Entry<Long, TreeMap<Integer, PrizePoolModel>> entry : allPrizePoolMap.entrySet()) {
         int dateStart = MiscUtil.getHiParam((Long)entry.getKey());
         int dateEnd = MiscUtil.getLowParam((Long)entry.getKey());
         if (dateStart <= serverOpenDay && dateEnd >= serverOpenDay) {
            return (TreeMap)entry.getValue();
         }
      }

      return new TreeMap();
   }
}
