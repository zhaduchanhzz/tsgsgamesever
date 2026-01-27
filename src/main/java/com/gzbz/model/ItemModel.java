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
   file = "item"
)
public class ItemModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "物品id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "subclass",
      comment = "物品子类型"
   )
   private byte subclass;
   @ModelColumnAnno(
      columnName = "targetclass",
      comment = "自定类型"
   )
   private byte targetclass;
   @ModelColumnAnno(
      columnName = "name",
      comment = "物品名字"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "quality",
      comment = "品质"
   )
   private byte quality;
   @ModelColumnAnno(
      columnName = "star",
      comment = "星级"
   )
   private byte star;
   @ModelColumnAnno(
      columnName = "seat",
      comment = "穿戴位置"
   )
   private byte seat;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "出售"
   )
   private List<Integer> sell = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "转换价格"
   )
   private List<Integer> exchange = new ArrayList();
   @ModelColumnAnno(
      columnName = "combine",
      comment = "叠加"
   )
   private byte combine;
   @ModelColumnAnno(
      columnName = "iconId",
      comment = "物品图标"
   )
   private int iconId;
   @ModelColumnAnno(
      comment = "将印扩展id"
   )
   private int warriorSignet;
   @ModelColumnAnno(
      comment = "使用方法类型"
   )
   private int useFuncType;
   @ModelColumnAnno(
      comment = "使用方法id"
   )
   private int useFuncId;
   @ModelColumnAnno(
      comment = "使用方法数量"
   )
   private int useFuncValue;
   @ModelColumnAnno(
      columnName = "timeOut",
      comment = "使用时限"
   )
   private int timeOut;
   @ModelColumnAnno(
      columnName = "useToSystem",
      comment = "前往系统"
   )
   private int useToSystem;
   @ModelColumnAnno(
      columnName = "boxUseSystemId",
      comment = "宝箱使用系统ID"
   )
   private int boxUseSystemId;
   @ModelColumnAnno(
      columnName = "useDesc",
      comment = "使用说明"
   )
   private String useDesc;
   @ModelColumnAnno(
      columnName = "pathwayId",
      comment = "获取途径"
   )
   private int pathwayId;
   @ModelColumnAnno(
      columnName = "suit",
      comment = "套装"
   )
   private int suit;
   @ModelColumnAnno(
      columnName = "property",
      comment = "属性"
   )
   private int property;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "描述"
   )
   private String desc;
   @ModelColumnAnno(
      columnName = "camp",
      comment = "阵营"
   )
   private int camp;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ArrayList<ItemModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ItemModel model = (ItemModel)entry.getValue();
         ((ArrayList)tempMap.computeIfAbsent(Integer.valueOf(model.getTargetclass()), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customTargetClassItem", tempMap);
   }

   public boolean canUse() {
      if (this.useFuncType == 0) {
         return false;
      } else if ((this.useFuncType <= 3 || this.useFuncType == 88 || this.useFuncType == 87 || this.useFuncType == 86) && this.useFuncId > 0 && this.useFuncValue > 0) {
         return true;
      } else {
         return this.useFuncType == 21 || this.useFuncType == 25 || this.useFuncType == 90;
      }
   }

   public boolean canSell() {
      return this.sell.size() > 0 || this.exchange.size() > 0;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public byte getSubclass() {
      return this.subclass;
   }

   public void setSubclass(byte subclass) {
      this.checkModify();
      this.subclass = subclass;
   }

   public byte getTargetclass() {
      return this.targetclass;
   }

   public void setTargetclass(byte targetclass) {
      this.checkModify();
      this.targetclass = targetclass;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public byte getQuality() {
      return this.quality;
   }

   public void setQuality(byte quality) {
      this.checkModify();
      this.quality = quality;
   }

   public byte getStar() {
      return this.star;
   }

   public void setStar(byte star) {
      this.checkModify();
      this.star = star;
   }

   public byte getSeat() {
      return this.seat;
   }

   public void setSeat(byte seat) {
      this.checkModify();
      this.seat = seat;
   }

   public List<Integer> getSell() {
      return this.sell;
   }

   public void setSell(List<Integer> sell) {
      this.checkModify();
      this.sell = sell;
   }

   public List<Integer> getExchange() {
      return this.exchange;
   }

   public void setExchange(List<Integer> exchange) {
      this.checkModify();
      this.exchange = exchange;
   }

   public byte getCombine() {
      return this.combine;
   }

   public void setCombine(byte combine) {
      this.checkModify();
      this.combine = combine;
   }

   public int getIconId() {
      return this.iconId;
   }

   public void setIconId(int iconId) {
      this.checkModify();
      this.iconId = iconId;
   }

   public int getWarriorSignet() {
      return this.warriorSignet;
   }

   public void setWarriorSignet(int warriorSignet) {
      this.checkModify();
      this.warriorSignet = warriorSignet;
   }

   public int getUseFuncType() {
      return this.useFuncType;
   }

   public void setUseFuncType(int useFuncType) {
      this.useFuncType = useFuncType;
   }

   public int getUseFuncId() {
      return this.useFuncId;
   }

   public void setUseFuncId(int useFuncId) {
      this.useFuncId = useFuncId;
   }

   public int getUseFuncValue() {
      return this.useFuncValue;
   }

   public void setUseFuncValue(int useFuncValue) {
      this.useFuncValue = useFuncValue;
   }

   public int getTimeOut() {
      return this.timeOut;
   }

   public void setTimeOut(int timeOut) {
      this.checkModify();
      this.timeOut = timeOut;
   }

   public int getUseToSystem() {
      return this.useToSystem;
   }

   public void setUseToSystem(int useToSystem) {
      this.checkModify();
      this.useToSystem = useToSystem;
   }

   public int getBoxUseSystemId() {
      return this.boxUseSystemId;
   }

   public void setBoxUseSystemId(int boxUseSystemId) {
      this.checkModify();
      this.boxUseSystemId = boxUseSystemId;
   }

   public String getUseDesc() {
      return this.useDesc;
   }

   public void setUseDesc(String useDesc) {
      this.checkModify();
      this.useDesc = useDesc;
   }

   public int getPathwayId() {
      return this.pathwayId;
   }

   public void setPathwayId(int pathwayId) {
      this.checkModify();
      this.pathwayId = pathwayId;
   }

   public int getSuit() {
      return this.suit;
   }

   public void setSuit(int suit) {
      this.checkModify();
      this.suit = suit;
   }

   public int getProperty() {
      return this.property;
   }

   public void setProperty(int property) {
      this.checkModify();
      this.property = property;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getCamp() {
      return this.camp;
   }

   public void setCamp(int camp) {
      this.checkModify();
      this.camp = camp;
   }
}
