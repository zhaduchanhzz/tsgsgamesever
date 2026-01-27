package com.gzbz.gamePlayer.playerBag;

import cn.hutool.core.util.NumberUtil;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.ItemModel;
import com.gzbz.model.StampExtraPropertyModel;
import com.gzbz.model.StampModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class OrnamentItem extends ItemBase {
   static Logger logger = LoggerFactory.getLogger(OrnamentItem.class);
   public int lev;
   public int clearNum1;
   public int clearNum2;
   public int clearNum3;
   public int clearNum4;
   public Map<Integer, PropertyModel> proMap = new LinkedHashMap();
   public Map<Integer, PropertyModel> clearProMap = new LinkedHashMap();
   public List<Integer> lockList = new ArrayList();
   public List<Integer> posList = new ArrayList();
   public List<Integer> clearPosList = new ArrayList();
   public List<Integer> proColour = new ArrayList();
   public List<Integer> clearProColour = new ArrayList();
   public List<Integer> groupList = new ArrayList();
   public int clearRound = 0;
   public int clearNum5;

   public OrnamentItem() {
   }

   public OrnamentItem(int code, OrnamentItem data) {
      this.code = code;
      this.id = data.id;
      this.num = 1;
      this.clearNum1 = data.clearNum1;
      this.clearNum2 = data.clearNum2;
      this.clearNum3 = data.clearNum3;
      this.clearNum4 = data.clearNum4;
      this.clearNum5 = data.clearNum5;
      this.lev = data.lev;
      this.proMap = data.proMap;
      this.clearProMap = data.clearProMap;
      this.lockList.clear();
      this.lockList.addAll(data.lockList);
      this.proColour.clear();
      this.proColour.addAll(data.proColour);
      this.clearProColour.clear();
      this.clearProColour.addAll(data.clearProColour);
      this.groupList.addAll(data.groupList);
      this.clearRound = data.clearRound;

      for(Integer id : this.proMap.keySet()) {
         this.posList.add(id);
      }

      for(Integer id : this.clearProMap.keySet()) {
         this.clearPosList.add(id);
      }

   }

   public OrnamentItem(int code, int id) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      ItemModel itemModel = (ItemModel)gameModelPool.getEntity("item", id);
      this.init(code, 1, itemModel, (GamePlayer)null);
   }

   public OrnamentItem(CommonMsg.OrnamentWear info) {
      this.code = 0;
      this.id = info.getId();
      this.lev = info.getLev();
      if (!info.getClearNumList().isEmpty() && info.getClearNumList().size() >= 5) {
         this.clearNum1 = info.getClearNum(0);
         this.clearNum2 = info.getClearNum(1);
         this.clearNum3 = info.getClearNum(2);
         this.clearNum4 = info.getClearNum(3);
         this.clearNum5 = info.getClearNum(4);
      } else {
         this.clearNum1 = info.getClearNum1();
         this.clearNum2 = info.getClearNum2();
         this.clearNum3 = info.getClearNum3();
         this.clearNum4 = info.getClearNum4();
         this.clearNum5 = info.getClearNum5();
      }

      int position = 1;

      for(CommonMsg.PropertyInfo propertyInfo : info.getExtraProList()) {
         this.proMap.put(position, new PropertyModel(propertyInfo.getId(), propertyInfo.getWay(), (long)((int)propertyInfo.getValue())));
         ++position;
      }

      position = 0;

      for(CommonMsg.PropertyInfo propertyInfo : info.getClearExtraProList()) {
         this.clearProMap.put(position, new PropertyModel(propertyInfo.getId(), propertyInfo.getWay(), (long)((int)propertyInfo.getValue())));
         ++position;
      }

      for(Integer id : info.getLockProList()) {
         this.lockList.add(id);
      }

   }

   public void init(int code, int num, ItemModel itemModel, GamePlayer gamePlayer) {
      super.init(code, num, itemModel, gamePlayer);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      StampModel stampModel = (StampModel)gameModelPool.getEntity("Stamp", this.id);

      for(int i = 0; i < stampModel.getExtraPropertyNum(); ++i) {
         this.initProperty(gameModelPool, stampModel);
      }

      this.lev = 0;
      this.clearProMap.clear();
      this.clearProColour.clear();
      this.calColour();
   }

   public void initProperty(GameModelPool gameModelPool, StampModel stampModel) {
      Map<Integer, StampExtraPropertyModel> extraMap = gameModelPool.getMap("StampExtraProperty");
      List<StampExtraPropertyModel> list = new ArrayList();

      for(StampExtraPropertyModel model : extraMap.values()) {
         if (model.getGroupId() == stampModel.getExtraPropertyType()) {
            list.add(model);
         }
      }

      ArrayList<KeyValFun> funList = new ArrayList();

      for(StampExtraPropertyModel v : list) {
         boolean flag = true;

         for(PropertyModel model : this.proMap.values()) {
            if (model.getType() == v.getPropertyId()) {
               flag = false;
               break;
            }
         }

         if (flag) {
            funList.add(new KeyValFun(v.getId(), v.getWeight()));
         }
      }

      int properId = 0;
      if (funList.isEmpty()) {
         properId = ((StampExtraPropertyModel)list.get(0)).getId();
         logger.info("生成配饰属性出现问题！！！！！");
      } else {
         properId = GamePlayer.countRate(funList);
      }

      int value = ((StampExtraPropertyModel)extraMap.get(properId)).getPropertyValueMin();
      this.proMap.put(properId, new PropertyModel(((StampExtraPropertyModel)extraMap.get(properId)).getPropertyId(), ((StampExtraPropertyModel)extraMap.get(properId)).getPropertyWay(), (long)value));
      this.posList.add(properId);
   }

   public void exchangePro(GameModelPool gameModelPool, StampModel stampModel) {
      Map<Integer, StampExtraPropertyModel> extraMap = gameModelPool.getMap("StampExtraProperty");
      List<StampExtraPropertyModel> list = new ArrayList();

      for(StampExtraPropertyModel model : extraMap.values()) {
         if (model.getGroupId() == stampModel.getExtraPropertyType()) {
            list.add(model);
         }
      }

      ArrayList<KeyValFun> funList = new ArrayList();

      for(StampExtraPropertyModel v : list) {
         boolean flag = true;

         for(PropertyModel model : this.proMap.values()) {
            if (model.getType() == v.getPropertyId()) {
               flag = false;
               break;
            }
         }

         if (flag) {
            funList.add(new KeyValFun(v.getId(), v.getWeight()));
         }
      }

      int properId = 0;
      if (funList.isEmpty()) {
         properId = ((StampExtraPropertyModel)list.get(0)).getId();
         logger.info("配饰转换出现问题！！！！！");
      } else {
         properId = GamePlayer.countRate(funList);
      }

      int minValue = ((StampExtraPropertyModel)extraMap.get(properId)).getPropertyValueMin();
      String[] upStr = ((StampExtraPropertyModel)extraMap.get(properId)).getClearNum().split("\\|");
      int realUp = Integer.parseInt(upStr[2]);
      int clearNum = this.clearNum1 + this.clearNum2 + this.clearNum3 + this.clearNum4 + this.clearNum5;
      realUp *= clearNum;
      int realValue = realUp + minValue;
      if (realValue > ((StampExtraPropertyModel)extraMap.get(properId)).getPropertyValueMax()) {
         realValue = ((StampExtraPropertyModel)extraMap.get(properId)).getPropertyValueMax();
      }

      this.proMap.put(properId, new PropertyModel(((StampExtraPropertyModel)extraMap.get(properId)).getPropertyId(), ((StampExtraPropertyModel)extraMap.get(properId)).getPropertyWay(), (long)realValue));
      this.posList.add(properId);
   }

   public CommonMsg.PropertyInfo toBuilder(PropertyModel model) {
      CommonMsg.PropertyInfo.Builder builder = CommonMsg.PropertyInfo.newBuilder();
      builder.setId(model.getType());
      builder.setWay(model.getWay());
      builder.setValue((double)model.getValue());
      return builder.build();
   }

   public void calColour() {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      Map<Integer, StampExtraPropertyModel> extraMap = gameModelPool.getMap("StampExtraProperty");
      if (this.proColour.isEmpty() && !this.proMap.isEmpty()) {
         for(Map.Entry<Integer, PropertyModel> entry : this.proMap.entrySet()) {
            if (extraMap.containsKey(entry.getKey())) {
               StampExtraPropertyModel model = (StampExtraPropertyModel)extraMap.get(entry.getKey());
               int maxNum = model.getPropertyValueMax();
               double temp = NumberUtil.div((float)((PropertyModel)entry.getValue()).getValue(), (float)maxNum);
               int colour = 1;
               if (temp >= (double)0.5F) {
                  colour = 5;
               } else {
                  colour = 4;
               }

               this.proColour.add(colour);
            }
         }
      }

      int flag = 0;
      if (this.clearProColour.isEmpty() && !this.clearProMap.isEmpty()) {
         for(Map.Entry<Integer, PropertyModel> entry : this.clearProMap.entrySet()) {
            if (extraMap.containsKey(entry.getKey())) {
               StampExtraPropertyModel model = (StampExtraPropertyModel)extraMap.get(entry.getKey());
               int maxNum = model.getPropertyValueMax();
               double temp = NumberUtil.div((float)((PropertyModel)entry.getValue()).getValue(), (float)maxNum);
               int colour = 1;
               if (temp >= (double)0.5F) {
                  colour = 5;
               } else {
                  colour = 4;
               }

               if (this.proColour.size() > flag && (Integer)this.proColour.get(flag) > colour) {
                  this.clearProColour.add(this.proColour.get(flag));
               } else {
                  this.clearProColour.add(colour);
               }

               ++flag;
            }
         }
      }

   }

   public void packColour(CommonMsg.OrnamentWear.Builder builder) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      Map<Integer, StampExtraPropertyModel> extraMap = gameModelPool.getMap("StampExtraProperty");
      if (this.proColour.isEmpty() && !this.proMap.isEmpty()) {
         for(Map.Entry<Integer, PropertyModel> entry : this.proMap.entrySet()) {
            if (extraMap.containsKey(entry.getKey())) {
               StampExtraPropertyModel model = (StampExtraPropertyModel)extraMap.get(entry.getKey());
               int num = model.getPropertyValueMax() - model.getPropertyValueMin();
               double temp = (double)(num / (int)((PropertyModel)entry.getValue()).getValue() * 3);
               int colour = 1;
               if (temp >= (double)2.0F) {
                  colour = 3;
               } else if (temp >= (double)1.0F && temp < (double)2.0F) {
                  colour = 2;
               }

               this.proColour.add(colour);
            }
         }
      }

      if (this.clearProColour.isEmpty() && !this.clearProMap.isEmpty()) {
         for(Map.Entry<Integer, PropertyModel> entry : this.clearProMap.entrySet()) {
            if (extraMap.containsKey(entry.getKey())) {
               StampExtraPropertyModel model = (StampExtraPropertyModel)extraMap.get(entry.getKey());
               int num = model.getPropertyValueMax() - model.getPropertyValueMin();
               double temp = (double)(num / (int)((PropertyModel)entry.getValue()).getValue() * 3);
               int colour = 1;
               if (temp >= (double)2.0F) {
                  colour = 3;
               } else if (temp >= (double)1.0F && temp < (double)2.0F) {
                  colour = 2;
               }

               this.clearProColour.add(colour);
            }
         }
      }

      if (!this.proColour.isEmpty()) {
         builder.addAllProColour(this.proColour);
      }

      if (!this.clearProColour.isEmpty()) {
         builder.addAllExtraProColour(this.clearProColour);
      }

   }

   public void calClearColour(List<Integer> tempList) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      Map<Integer, StampExtraPropertyModel> extraMap = gameModelPool.getMap("StampExtraProperty");
      if (this.proColour.isEmpty() && !this.proMap.isEmpty()) {
         for(Map.Entry<Integer, PropertyModel> entry : this.proMap.entrySet()) {
            if (extraMap.containsKey(entry.getKey())) {
               StampExtraPropertyModel model = (StampExtraPropertyModel)extraMap.get(entry.getKey());
               int maxNum = model.getPropertyValueMax();
               double temp = NumberUtil.div((float)((PropertyModel)entry.getValue()).getValue(), (float)maxNum);
               int colour = 1;
               if (temp >= (double)0.5F) {
                  colour = 5;
               } else {
                  colour = 4;
               }

               this.proColour.add(colour);
            }
         }
      }

      int flag = 0;
      if (this.clearProColour.isEmpty() && !this.clearProMap.isEmpty()) {
         for(Map.Entry<Integer, PropertyModel> entry : this.clearProMap.entrySet()) {
            if (extraMap.containsKey(entry.getKey())) {
               StampExtraPropertyModel model = (StampExtraPropertyModel)extraMap.get(entry.getKey());
               int maxNum = model.getPropertyValueMax();
               double temp = NumberUtil.div((float)((PropertyModel)entry.getValue()).getValue(), (float)maxNum);
               int colour = 1;
               if (temp >= (double)0.5F) {
                  colour = 5;
               } else {
                  colour = 4;
               }

               if (this.proColour.size() > flag && (Integer)this.proColour.get(flag) > colour) {
                  if (!tempList.isEmpty()) {
                     if (tempList.size() > flag && (Integer)tempList.get(flag) > (Integer)this.proColour.get(flag)) {
                        this.clearProColour.add(tempList.get(flag));
                     } else {
                        this.clearProColour.add(this.proColour.get(flag));
                     }
                  } else {
                     this.clearProColour.add(this.proColour.get(flag));
                  }
               } else if (!tempList.isEmpty()) {
                  if (tempList.size() > flag && (Integer)tempList.get(flag) > colour) {
                     this.clearProColour.add(tempList.get(flag));
                  } else {
                     this.clearProColour.add(colour);
                  }
               } else {
                  this.clearProColour.add(colour);
               }

               ++flag;
            }
         }
      }

   }

   public void decode(String data) {
      String[] strs = data.split(";", -1);
      if (!StringUtils.isEmpty(strs[0])) {
         String[] baseStrs = strs[0].split(",");
         this.code = Integer.parseInt(baseStrs[0]);
         this.id = Integer.parseInt(baseStrs[1]);
         this.num = Integer.parseInt(baseStrs[2]);
         this.enableTime = Integer.parseInt(baseStrs[3]);
         this.lev = Integer.parseInt(baseStrs[4]);
         this.clearNum1 = Integer.parseInt(baseStrs[5]);
         this.clearNum2 = Integer.parseInt(baseStrs[6]);
         this.clearNum3 = Integer.parseInt(baseStrs[7]);
         this.clearNum4 = Integer.parseInt(baseStrs[8]);
         this.clearRound = Integer.parseInt(baseStrs[9]);
      }

      this.decodeProperty(this.proMap, strs[1]);
      this.decodeProperty(this.clearProMap, strs[2]);
      this.decodeList(this.lockList, strs[3]);
      this.decodeList(this.posList, strs[4]);
      this.decodeList(this.clearPosList, strs[5]);
      this.decodeList(this.proColour, strs[6]);
      this.decodeList(this.clearProColour, strs[7]);
      this.decodeList(this.groupList, strs[8]);
      if (strs.length > 9) {
         this.clearNum5 = Integer.parseInt(strs[9]);
      }

      if (this.posList.size() == 0) {
         for(Integer id : this.proMap.keySet()) {
            this.posList.add(id);
         }
      }

      if (this.clearPosList.size() == 0) {
         for(Integer id : this.clearProMap.keySet()) {
            this.clearPosList.add(id);
         }
      }

   }

   private void decodeProperty(Map<Integer, PropertyModel> map, String string) {
      map.clear();
      if (!StringUtils.isEmpty(string)) {
         String[] strArr = string.split(",");

         for(String property : strArr) {
            String[] cell = property.split("_");
            if (cell.length != 4) {
               (new Exception("解析配饰出错 " + cell)).printStackTrace();
            } else {
               PropertyModel propertyModel = new PropertyModel(Integer.parseInt(cell[1]), Integer.parseInt(cell[2]), (long)Integer.parseInt(cell[3]));
               map.put(Integer.parseInt(cell[0]), propertyModel);
            }
         }
      }

   }

   private void decodeList(List<Integer> list, String string) {
      list.clear();
      if (!StringUtils.isEmpty(string)) {
         String[] strArr = string.split(",");

         for(String skill : strArr) {
            list.add(Integer.parseInt(skill));
         }
      }

   }

   public String encode() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.code).append(",");
      stringBuilder.append(this.id).append(",");
      stringBuilder.append(this.num).append(",");
      stringBuilder.append(this.enableTime).append(",");
      stringBuilder.append(this.lev).append(",");
      stringBuilder.append(this.clearNum1).append(",");
      stringBuilder.append(this.clearNum2).append(",");
      stringBuilder.append(this.clearNum3).append(",");
      stringBuilder.append(this.clearNum4).append(",");
      stringBuilder.append(this.clearRound);
      stringBuilder.append(";");
      if (this.proMap.size() > 0) {
         for(Map.Entry<Integer, PropertyModel> entry : this.proMap.entrySet()) {
            PropertyModel propertyModel = (PropertyModel)entry.getValue();
            stringBuilder.append(entry.getKey() + "_" + propertyModel.getType() + "_" + propertyModel.getWay() + "_" + propertyModel.getValue());
            stringBuilder.append(",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      stringBuilder.append(";");
      if (this.clearProMap.size() > 0) {
         for(Map.Entry<Integer, PropertyModel> entry : this.clearProMap.entrySet()) {
            PropertyModel propertyModel = (PropertyModel)entry.getValue();
            stringBuilder.append(entry.getKey() + "_" + propertyModel.getType() + "_" + propertyModel.getWay() + "_" + propertyModel.getValue());
            stringBuilder.append(",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      stringBuilder.append(this.encodeList(this.lockList));
      stringBuilder.append(this.encodeList(this.posList));
      stringBuilder.append(this.encodeList(this.clearPosList));
      stringBuilder.append(this.encodeList(this.proColour));
      stringBuilder.append(this.encodeList(this.clearProColour));
      stringBuilder.append(this.encodeList(this.groupList));
      stringBuilder.append(";");
      stringBuilder.append(this.clearNum5);
      return stringBuilder.toString();
   }

   private String encodeList(List<Integer> list) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(";");
      if (list.size() > 0) {
         for(int value : list) {
            stringBuilder.append(value);
            stringBuilder.append(",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
