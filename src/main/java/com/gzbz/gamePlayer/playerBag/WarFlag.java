package com.gzbz.gamePlayer.playerBag;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.ItemModel;
import com.gzbz.model.WarFlagLvupCostModel;
import com.gzbz.model.WarFlagModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class WarFlag extends ItemBase {
   private Logger logger = LoggerFactory.getLogger(this.getClass());
   public int strongLv;
   public List<PropertyModel> strongProperties = new ArrayList();
   public int recastNum;
   public List<PropertyModel> recastProperties = new ArrayList();
   public int highRecastNum;

   public WarFlag() {
   }

   public WarFlag(int code, WarFlag warFlag) {
      this.code = code;
      this.id = warFlag.id;
      this.num = 1;
      this.strongLv = warFlag.strongLv;
      this.strongProperties.addAll(warFlag.strongProperties);
      this.recastNum = warFlag.recastNum;
      this.recastProperties.addAll(warFlag.recastProperties);
      this.highRecastNum = warFlag.highRecastNum;
   }

   public WarFlag(CommonMsg.WarFlagInfo info) {
      this.code = 0;
      this.id = info.getId();
      this.num = 1;
      this.strongLv = info.getStrongLv();
      this.recastNum = info.getRecastNum();
      this.highRecastNum = info.getHighRecastNum();

      for(CommonMsg.PropertyInfo propertyInfo : info.getStrongProsList()) {
         if (propertyInfo.getValue() > (double)0.0F) {
            this.strongProperties.add(new PropertyModel(propertyInfo.getId(), propertyInfo.getWay(), (long)((int)propertyInfo.getValue())));
         }
      }

      for(CommonMsg.PropertyInfo propertyInfo : info.getRecastProsList()) {
         if (propertyInfo.getValue() > (double)0.0F) {
            this.recastProperties.add(new PropertyModel(propertyInfo.getId(), propertyInfo.getWay(), (long)((int)propertyInfo.getValue())));
         }
      }

   }

   public WarFlag(int code, ItemModel newItemModel, WarFlag oldWarFlag) {
      this.code = code;
      this.id = newItemModel.getId();
      this.num = 1;
      this.strongLv = oldWarFlag.strongLv;
      this.strongProperties.addAll(oldWarFlag.strongProperties);
      this.recastNum = oldWarFlag.recastNum;
      this.highRecastNum = oldWarFlag.highRecastNum;
      this.recastProperties.addAll(oldWarFlag.recastProperties);
   }

   public void init(int code, int num, ItemModel itemModel, GamePlayer gamePlayer) {
      if (num > 1) {
         this.logger.info("战旗一次只能增加一个");
      } else {
         super.init(code, 1, itemModel, gamePlayer);
         this.strongLv = 1;
         this.initBaseProperty(itemModel);
      }
   }

   public void initBaseProperty(ItemModel itemModel) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      WarFlagModel warFlagModel = (WarFlagModel)gameModelPool.getEntity("countryWarFlag", itemModel.getId());
      WarFlagLvupCostModel warFlagLvupCostModel = (WarFlagLvupCostModel)gameModelPool.getEntity("countryWarFlagLvupCost", this.strongLv);
      if (warFlagLvupCostModel.getHotRandomPropertyNum() > 0) {
         for(int i = 0; i < warFlagLvupCostModel.getHotRandomPropertyNum(); ++i) {
            if (warFlagModel.getRandomPropertyMinNum() > 0) {
               int propertyType = warFlagModel.getPropertyType();
               this.strongProperties.add(new PropertyModel(propertyType, 0, (long)warFlagModel.getRandomPropertyMinNum()));
            }
         }
      }

   }

   public void lvUp() {
      ++this.strongLv;
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      WarFlagLvupCostModel warFlagLvupCostModel = (WarFlagLvupCostModel)gameModelPool.getEntity("countryWarFlagLvupCost", this.strongLv);
      WarFlagModel warFlagModel = (WarFlagModel)gameModelPool.getEntity("countryWarFlag", this.id);
      if (warFlagLvupCostModel.getHotRandomPropertyNum() > this.strongProperties.size()) {
         int enablePropertyNum = Math.min(warFlagLvupCostModel.getHotRandomPropertyNum(), warFlagModel.getRandomPropertyCount());
         int deltNum = enablePropertyNum - this.strongProperties.size();
         if (deltNum > 0) {
            for(int i = 0; i < deltNum; ++i) {
               if (warFlagModel.getRandomPropertyMinNum() > 0) {
                  int propertyType = warFlagModel.getPropertyType();
                  this.strongProperties.add(new PropertyModel(propertyType, 0, (long)warFlagModel.getRandomPropertyMinNum()));
               }
            }
         }
      }

   }

   public void recast() {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      WarFlagModel warFlagModel = (WarFlagModel)gameModelPool.getEntity("countryWarFlag", this.id);
      if (warFlagModel.getQuality() == 7) {
         ++this.highRecastNum;
      } else {
         ++this.recastNum;
      }

      int maxValue = warFlagModel.getRandomPropertyMaxNum();
      if (this.recastProperties.isEmpty()) {
         this.recastProperties.addAll(this.strongProperties);
      }

      if (this.recastProperties.size() < this.strongProperties.size()) {
         int addNum = this.strongProperties.size() - this.recastProperties.size();
         int oldSize = this.recastProperties.size();

         for(int i = 0; i < addNum; ++i) {
            int index = oldSize + i;
            this.recastProperties.add(this.strongProperties.get(index));
         }
      }

      List<PropertyModel> tempList = new ArrayList();
      int totalWeight = 0;

      for(Integer weight : warFlagModel.getRandomPropertyweight()) {
         totalWeight += weight;
      }

      for(PropertyModel recastProperty : this.recastProperties) {
         int defaultType = 22;
         int r = RandomUtil.randInt(totalWeight);
         if (r < (Integer)warFlagModel.getRandomPropertyweight().get(0)) {
            defaultType = 21;
         }

         if (recastProperty.getValue() >= (long)maxValue) {
            tempList.add(new PropertyModel(defaultType, recastProperty.getWay(), recastProperty.getValue()));
         } else {
            int addValue = this.randomRecastValue(warFlagModel);
            int newValue = (int)recastProperty.getValue() + addValue;
            if (newValue > maxValue) {
               newValue = maxValue;
            }

            tempList.add(new PropertyModel(defaultType, recastProperty.getWay(), (long)newValue));
         }
      }

      this.recastProperties = tempList;
   }

   public int randomRecastValue(WarFlagModel warFlagModel) {
      int totalWeight = 0;

      for(Integer weight : warFlagModel.getRandomPropertyRiseWeight()) {
         totalWeight += weight;
      }

      int r = RandomUtil.randInt(totalWeight);
      int index = 0;
      int tempWeight = 0;

      for(Integer weight : warFlagModel.getRandomPropertyRiseWeight()) {
         tempWeight += weight;
         if (tempWeight > r) {
            break;
         }

         ++index;
      }

      return (Integer)warFlagModel.getRandomPropertyRise().get(index);
   }

   public List<ResourceModel> sellReturnResource(boolean isSell) {
      List<ResourceModel> resultList = new ArrayList();
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      if (isSell) {
         ItemModel itemModel = (ItemModel)gameModelPool.getEntity("item", this.id);
         List<Integer> sell = itemModel.getSell();
         if (sell.size() % 3 != 0) {
            this.logger.warn("物品出售配置有误 itemId:{}", this.id);
            return resultList;
         }

         int count = sell.size() / 2;

         for(int i = 0; i < count; ++i) {
            int idx = i * 3;
            resultList.add(new ResourceModel((Integer)sell.get(idx), (Integer)sell.get(idx + 1), (Integer)sell.get(idx + 2)));
         }
      }

      if (this.strongLv > 1) {
         for(int i = 1; i < this.strongLv; ++i) {
            WarFlagLvupCostModel warFlagLvupCostModel = (WarFlagLvupCostModel)gameModelPool.getEntity("countryWarFlagLvupCost", i);
            if (warFlagLvupCostModel != null) {
               warFlagLvupCostModel.getLvUpCost().forEach((data) -> ResourceModel.addResourceToList(resultList, data));
            }
         }
      }

      WarFlagModel warFlagModel = (WarFlagModel)gameModelPool.getEntity("countryWarFlag", this.id);
      if (warFlagModel != null) {
         if (warFlagModel.getQuality() == 7) {
            if (this.recastNum > 0) {
               int redWarFlagId = ApplicationContextProvider.getConfigInt("redWarFlagId", 6010);
               WarFlagModel redWarFlagModel = (WarFlagModel)gameModelPool.getEntity("countryWarFlag", redWarFlagId);
               if (redWarFlagModel != null) {
                  for(int i = 0; i < this.recastNum; ++i) {
                     ResourceModel.addResourceToListPlus(resultList, redWarFlagModel.getRefreshCost());
                  }
               }
            }

            for(int i = 0; i < this.highRecastNum; ++i) {
               ResourceModel.addResourceToListPlus(resultList, warFlagModel.getRefreshCost());
            }
         } else {
            for(int i = 0; i < this.recastNum; ++i) {
               ResourceModel.addResourceToListPlus(resultList, warFlagModel.getRefreshCost());
            }
         }
      }

      return resultList;
   }

   public void reset() {
      this.strongLv = 1;
      this.strongProperties.clear();
      this.recastNum = 0;
      this.highRecastNum = 0;
      this.recastProperties.clear();
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      ItemModel itemModel = (ItemModel)gameModelPool.getEntity("item", this.id);
      if (itemModel != null) {
         this.initBaseProperty(itemModel);
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
         this.strongLv = Integer.parseInt(baseStrs[4]);
         this.recastNum = Integer.parseInt(baseStrs[5]);
         if (baseStrs.length > 6) {
            this.highRecastNum = Integer.parseInt(baseStrs[6]);
         }

         WarFlagModel warFlagModel = (WarFlagModel)ApplicationContextProvider.getModelPoolEntity("countryWarFlag", this.id);
         if (warFlagModel != null && warFlagModel.getQuality() == 7 && this.recastNum > 0 && this.highRecastNum == 0) {
            this.highRecastNum = this.recastNum;
            this.recastNum = 0;
         }
      }

      this.strongProperties.clear();
      if (!StringUtils.isEmpty(strs[1])) {
         String[] strArr = strs[1].split(",");

         for(String property : strArr) {
            String[] cell = property.split("_");
            if (cell.length != 3) {
               (new Exception("解析强化属性出错 " + cell)).printStackTrace();
            } else {
               PropertyModel propertyModel = new PropertyModel(Integer.parseInt(cell[0]), Integer.parseInt(cell[1]), (long)Integer.parseInt(cell[2]));
               this.strongProperties.add(propertyModel);
            }
         }
      }

      this.recastProperties.clear();
      if (!StringUtils.isEmpty(strs[2])) {
         String[] strArr = strs[1].split(",");

         for(String property : strArr) {
            String[] cell = property.split("_");
            if (cell.length != 3) {
               (new Exception("解析洗练属性出错 " + cell)).printStackTrace();
            } else {
               PropertyModel propertyModel = new PropertyModel(Integer.parseInt(cell[0]), Integer.parseInt(cell[1]), (long)Integer.parseInt(cell[2]));
               this.recastProperties.add(propertyModel);
            }
         }
      }

   }

   public String encode() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.code);
      stringBuilder.append(",");
      stringBuilder.append(this.id);
      stringBuilder.append(",");
      stringBuilder.append(this.num);
      stringBuilder.append(",");
      stringBuilder.append(this.enableTime);
      stringBuilder.append(",");
      stringBuilder.append(this.strongLv);
      stringBuilder.append(",");
      stringBuilder.append(this.recastNum);
      stringBuilder.append(",");
      stringBuilder.append(this.highRecastNum);
      stringBuilder.append(";");
      if (this.strongProperties.size() > 0) {
         for(PropertyModel propertyModel : this.strongProperties) {
            stringBuilder.append(propertyModel.getType() + "_" + propertyModel.getWay() + "_" + propertyModel.getValue());
            stringBuilder.append(",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      stringBuilder.append(";");
      if (this.recastProperties.size() > 0) {
         for(PropertyModel propertyModel : this.recastProperties) {
            stringBuilder.append(propertyModel.getType() + "_" + propertyModel.getWay() + "_" + propertyModel.getValue());
            stringBuilder.append(",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
