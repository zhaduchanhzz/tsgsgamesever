package com.gzbz.gamePlayer.playerBag;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.FormationGemLvUpModel;
import com.gzbz.model.FormationGemModel;
import com.gzbz.model.FormationGemRangeModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuneStoneItem extends ItemBase {
   static Logger logger = LoggerFactory.getLogger(RuneStoneItem.class);
   public Map<Integer, PropertyModel> proMap = new HashMap();
   public boolean isLock = false;
   public int strengthen = 0;

   public void init(int code, int num, ItemModel itemModel, GamePlayer gamePlayer) {
      super.init(code, num, itemModel, gamePlayer);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      FormationGemModel gemModel = (FormationGemModel)gameModelPool.getEntity("formationGem", this.id);
      Map<Integer, FormationGemRangeModel> rangeModelMap = gameModelPool.getMap("formationGemRange");
      if (gemModel != null) {
         this.proMap.put(0, new PropertyModel(gemModel.getFixQualityId(), gemModel.getFixQualityWay(), (long)gemModel.getFixQualityValue()));

         for(int i = 0; i < gemModel.getRandomQuality().size(); ++i) {
            int randomProperty = (Integer)gemModel.getRandomQuality().get(i);
            List<Integer> libList = new ArrayList();

            for(Map.Entry<Integer, PropertyModel> entry : this.proMap.entrySet()) {
               if ((Integer)entry.getKey() > 0) {
                  libList.add(((FormationGemRangeModel)rangeModelMap.get(entry.getKey())).getRandamcage());
               }
            }

            List<FormationGemRangeModel> list = new ArrayList();

            for(FormationGemRangeModel value : rangeModelMap.values()) {
               if (value.getQuality() == randomProperty && !libList.contains(value.getRandamcage())) {
                  list.add(value);
               }
            }

            if (list.isEmpty()) {
               logger.error("掉落符石随机资质出错！！！！");
               break;
            }

            List<KeyValFun> funList = new ArrayList();

            for(FormationGemRangeModel formationGemRangeModel : list) {
               funList.add(new KeyValFun(formationGemRangeModel.getId(), formationGemRangeModel.getWeight()));
            }

            int realId = GamePlayer.countRate(funList);
            FormationGemRangeModel rangeModel = (FormationGemRangeModel)rangeModelMap.get(realId);
            int value = 0;
            value = RandomUtil.randInt(Integer.parseInt(rangeModel.getRandomQualityValueRange().split("\\|")[0]), Integer.parseInt(rangeModel.getRandomQualityValueRange().split("\\|")[1]));
            if (rangeModel.getPefectweight() > 0 && rangeModel.getPefectweight() > RandomUtil.randInt(0, 10000)) {
               value = Integer.parseInt(rangeModel.getRandomQualityValueRange().split("\\|")[1]);
            }

            this.proMap.put(rangeModel.getId(), new PropertyModel(rangeModel.getRandomQualityId(), rangeModel.getRandomQualityWay(), (long)value));
         }

      }
   }

   public RuneStoneItem(int code, int id, List<Integer> propertyList) {
      this.code = code;
      this.id = id;
      this.num = 1;
      this.isLock = false;
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      FormationGemLvUpModel lvModel = (FormationGemLvUpModel)gameModelPool.getEntity("formationGemLvup", id);
      this.proMap.put(0, new PropertyModel(lvModel.getFixQualityId(), lvModel.getFixQualityWay(), (long)lvModel.getFixQualityValue()));

      for(int i = 0; i < propertyList.size(); ++i) {
         Map<Integer, FormationGemRangeModel> rangeModelMap = gameModelPool.getMap("formationGemRange");
         if (rangeModelMap.containsKey(propertyList.get(i))) {
            FormationGemRangeModel rangeModel = (FormationGemRangeModel)rangeModelMap.get(propertyList.get(i));
            int value = Integer.parseInt(rangeModel.getRandomQualityValueRange().split("\\|")[1]);
            this.proMap.put(rangeModel.getId(), new PropertyModel(rangeModel.getRandomQualityId(), rangeModel.getRandomQualityWay(), (long)value));
         }
      }

      FormationGemModel gemModel = (FormationGemModel)gameModelPool.getEntity("formationGem", id);
      Map<Integer, FormationGemRangeModel> rangeModelMap = gameModelPool.getMap("formationGemRange");

      for(int i = 0; i < gemModel.getRandomQuality().size() - propertyList.size(); ++i) {
         int randomProperty = (Integer)gemModel.getRandomQuality().get(i);
         List<Integer> libList = new ArrayList();

         for(Map.Entry<Integer, PropertyModel> entry : this.proMap.entrySet()) {
            if ((Integer)entry.getKey() > 0) {
               libList.add(((FormationGemRangeModel)rangeModelMap.get(entry.getKey())).getRandamcage());
            }
         }

         List<FormationGemRangeModel> list = new ArrayList();

         for(FormationGemRangeModel value : rangeModelMap.values()) {
            if (value.getQuality() == randomProperty && !libList.contains(value.getRandamcage())) {
               list.add(value);
            }
         }

         if (list.isEmpty()) {
            logger.error("掉落符石随机资质出错！！！！");
            break;
         }

         List<KeyValFun> funList = new ArrayList();

         for(FormationGemRangeModel formationGemRangeModel : list) {
            funList.add(new KeyValFun(formationGemRangeModel.getId(), formationGemRangeModel.getWeight()));
         }

         int realId = GamePlayer.countRate(funList);
         FormationGemRangeModel rangeModel = (FormationGemRangeModel)rangeModelMap.get(realId);
         int value = 0;
         value = RandomUtil.randInt(Integer.parseInt(rangeModel.getRandomQualityValueRange().split("\\|")[0]), Integer.parseInt(rangeModel.getRandomQualityValueRange().split("\\|")[1]));
         if (rangeModel.getPefectweight() > 0 && rangeModel.getPefectweight() > RandomUtil.randInt(0, 10000)) {
            value = Integer.parseInt(rangeModel.getRandomQualityValueRange().split("\\|")[1]);
         }

         this.proMap.put(rangeModel.getId(), new PropertyModel(rangeModel.getRandomQualityId(), rangeModel.getRandomQualityWay(), (long)value));
      }

   }

   public RuneStoneItem() {
   }

   public RuneStoneItem(int code, RuneStoneItem runeItem) {
      this.code = code;
      this.id = runeItem.id;
      this.num = 1;
      this.proMap = runeItem.proMap;
      this.isLock = runeItem.isLock;
      this.strengthen = runeItem.strengthen;
   }

   public RuneStoneItem(CommonMsg.RuneStoneWear runeStoneWear) {
      this.code = 0;
      this.id = runeStoneWear.getId();
      this.num = 1;
      this.strengthen = runeStoneWear.getStrengthen();

      for(CommonMsg.RuneStonePro runeStonePro : runeStoneWear.getProList()) {
         this.proMap.put(runeStonePro.getProKey(), new PropertyModel(runeStonePro.getInfo().getId(), runeStonePro.getInfo().getWay(), (long)((int)runeStonePro.getInfo().getValue())));
      }

      this.isLock = runeStoneWear.getIsLock();
   }

   public CommonMsg.RuneStonePro toBuilder(int key, PropertyModel model, int strengthen) {
      CommonMsg.PropertyInfo.Builder builder = CommonMsg.PropertyInfo.newBuilder();
      builder.setId(model.getType());
      builder.setWay(model.getWay());
      builder.setValue((double)model.getValue());
      if (key == 0 && strengthen > 0) {
         String formationStrength = ApplicationContextProvider.getConfigString("formationGemStrength", "2000|4000");
         String[] gemStrength = formationStrength.split("\\|");
         int addNum = 0;
         if (gemStrength.length >= strengthen) {
            addNum = Integer.parseInt(gemStrength[strengthen - 1]);
         } else {
            addNum = Integer.parseInt(gemStrength[0]);
         }

         long realValue = model.getValue() * (long)(10000 + addNum) / 10000L;
         builder.setValue((double)realValue);
      }

      CommonMsg.RuneStonePro.Builder proBuilder = CommonMsg.RuneStonePro.newBuilder();
      proBuilder.setProKey(key);
      proBuilder.setInfo(builder);
      return proBuilder.build();
   }

   public CommonMsg.RuneStonePro toHeroBuilder(int key, PropertyModel model, int strengthen) {
      CommonMsg.PropertyInfo.Builder builder = CommonMsg.PropertyInfo.newBuilder();
      builder.setId(model.getType());
      builder.setWay(model.getWay());
      builder.setValue((double)model.getValue());
      if (key == 0 && strengthen > 0) {
         String formationStrength = ApplicationContextProvider.getConfigString("formationGemStrength", "2000|4000");
         String[] gemStrength = formationStrength.split("\\|");
         int addNum = 0;
         if (gemStrength.length >= strengthen) {
            addNum = Integer.parseInt(gemStrength[strengthen - 1]);
         } else {
            addNum = Integer.parseInt(gemStrength[0]);
         }

         long realValue = model.getValue() * (long)(10000 + addNum) / 10000L;
         builder.setValue((double)realValue);
      }

      CommonMsg.RuneStonePro.Builder proBuilder = CommonMsg.RuneStonePro.newBuilder();
      proBuilder.setProKey(key);
      proBuilder.setInfo(builder);
      return proBuilder.build();
   }

   public void decode(String data) {
      String[] arrs = data.split(";");
      String[] baseStrs = arrs[0].split(",");
      this.code = Integer.parseInt(baseStrs[0]);
      this.id = Integer.parseInt(baseStrs[1]);
      this.num = Integer.parseInt(baseStrs[2]);
      this.enableTime = Integer.parseInt(baseStrs[3]);
      this.isLock = Integer.parseInt(baseStrs[4]) == 1;
      if (baseStrs.length > 5) {
         this.strengthen = Integer.parseInt(baseStrs[5]);
      }

      this.proMap.clear();
      if (arrs.length >= 2) {
         String[] proStrs = arrs[1].split(",");

         for(String proStr : proStrs) {
            String[] cell = proStr.split("_");
            if (cell.length != 4) {
               (new Exception("解析符石出错")).printStackTrace();
            } else {
               PropertyModel propertyModel = new PropertyModel(Integer.parseInt(cell[1]), Integer.parseInt(cell[2]), (long)Integer.parseInt(cell[3]));
               this.proMap.put(Integer.parseInt(cell[0]), propertyModel);
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
      stringBuilder.append(this.isLock ? 1 : 0);
      stringBuilder.append(",");
      stringBuilder.append(this.strengthen);
      stringBuilder.append(";");
      if (this.proMap.size() > 0) {
         for(Map.Entry<Integer, PropertyModel> entry : this.proMap.entrySet()) {
            PropertyModel propertyModel = (PropertyModel)entry.getValue();
            stringBuilder.append(entry.getKey() + "_" + propertyModel.getType() + "_" + propertyModel.getWay() + "_" + propertyModel.getValue());
            stringBuilder.append(",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
