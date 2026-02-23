package com.gzbz.activity.part;

import com.alibaba.fastjson.JSON;
import com.gzbz.db.DrawActData;
import com.gzbz.model.AbstractDrawItemModel;
import com.gzbz.model.BroodLimitModel;
import com.gzbz.model.BroodRewardModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import misc.MapUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DrawCommon {
   protected Logger logger = LoggerFactory.getLogger(this.getClass());
   protected GameModelPool gameModelPool;
   private String excelName;

   public DrawCommon(String excelName) {
      this.excelName = excelName;
   }

   public static DrawCommon create(String excelName) {
      return new DrawCommon(excelName);
   }

   public Map<Integer, AbstractDrawItemModel> getDrawItemMap() {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      return (Map)gameModelPool.getMap(this.excelName).entrySet().stream().collect(Collectors.toMap((e) -> (Integer)e.getKey(), (e) -> (AbstractDrawItemModel)e.getValue()));
   }

   public Map<Integer, AbstractDrawItemModel> getDrawItemMap(int activityOpenDay, int activityDay, int type) {
      Map<Integer, AbstractDrawItemModel> itemModelMap = this.getDrawItemMap();
      return (Map)itemModelMap.values().stream().filter((model) -> {
         if (model.getDateEnd() == -1) {
            return model.getDateStart() <= activityOpenDay;
         } else {
            boolean isOpenDay = model.getDateStart() <= activityOpenDay && activityOpenDay <= model.getDateEnd();
            boolean isStageDay = model.getStageStart() <= activityDay && activityDay <= model.getStageEnd();
            return isOpenDay && isStageDay;
         }
      }).filter((model) -> {
         BroodRewardModel broodRewardModel = (BroodRewardModel)model;
         return broodRewardModel.getRewardSlot() == type;
      }).collect(Collectors.toMap((model) -> model.getId(), (model) -> model));
   }

   public BroodLimitModel getBroodLimitModel(int activityOpenDay, int activityDay, int type) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      Map<Integer, BroodLimitModel> broodLimitModels = gameModelPool.getMap("broodLimit");
      return (BroodLimitModel)broodLimitModels.values().stream().filter((model) -> {
         if (model.getDateEnd() == -1) {
            return model.getDateStart() <= activityOpenDay;
         } else {
            boolean isOpenDay = model.getDateStart() <= activityOpenDay && activityOpenDay <= model.getDateEnd();
            boolean isStageDay = model.getStageStart() <= activityDay && activityDay <= model.getStageEnd();
            return isOpenDay && isStageDay;
         }
      }).filter((model) -> model.getRewardSlot() == type).findAny().orElse(null);
   }

   public AbstractDrawItemModel drawItem(DrawActData dao, Map<Integer, AbstractDrawItemModel> itemModelMap) {
      Map<Integer, AbstractDrawItemModel> firterMap = new TreeMap();

      for(Map.Entry<Integer, AbstractDrawItemModel> entry : itemModelMap.entrySet()) {
         int drawItemNum = (Integer)MapUtil.getOrDefault(dao.drawHitNums, ((AbstractDrawItemModel)entry.getValue()).getId(), 0);
         if (((AbstractDrawItemModel)entry.getValue()).getSurplusNum() <= 0 || drawItemNum < ((AbstractDrawItemModel)entry.getValue()).getSurplusNum()) {
            int drawGroupNum = (Integer)MapUtil.getOrDefault(dao.drawAddNums, ((AbstractDrawItemModel)entry.getValue()).getId(), 0);
            if (((AbstractDrawItemModel)entry.getValue()).getPreposeNum() <= 0 || drawGroupNum >= ((AbstractDrawItemModel)entry.getValue()).getPreposeNum()) {
               firterMap.put(entry.getKey(), entry.getValue());
            }
         }
      }

      Map<Integer, AbstractDrawItemModel> limitMap = new HashMap();
      Map<Integer, AbstractDrawItemModel> noLimitMap = new HashMap();

      for(Map.Entry<Integer, AbstractDrawItemModel> entry : firterMap.entrySet()) {
         int drawGroupNum = (Integer)MapUtil.getOrDefault(dao.drawAddNums, ((AbstractDrawItemModel)entry.getValue()).getId(), 0);
         if (((AbstractDrawItemModel)entry.getValue()).getMustNum() > 0 && drawGroupNum >= ((AbstractDrawItemModel)entry.getValue()).getMustNum()) {
            limitMap.put(entry.getKey(), entry.getValue());
         } else {
            noLimitMap.put(entry.getKey(), entry.getValue());
         }
      }

      if (!limitMap.isEmpty()) {
         return (AbstractDrawItemModel)limitMap.values().stream().max((m1, m2) -> m2.getMustNum()).get();
      } else {
         if (!noLimitMap.isEmpty()) {
            int totalOdds = noLimitMap.values().stream().mapToInt((modelx) -> modelx.getRealOdd()).sum();
            int r = RandomUtil.randInt(totalOdds);
            int loop = 0;

            for(AbstractDrawItemModel model : noLimitMap.values()) {
               if (r < loop + model.getRealOdd()) {
                  return model;
               }

               loop += model.getRealOdd();
            }
         }

         return null;
      }
   }

   public List<AbstractDrawItemModel> drawItems(int drawTimes, DrawActData dao, Map<Integer, AbstractDrawItemModel> itemModelMap) {
      List<AbstractDrawItemModel> drawModels = new ArrayList();

      for(int i = 0; i < drawTimes; ++i) {
         AbstractDrawItemModel itemModel = this.drawItem(dao, itemModelMap);
         if (itemModel != null) {
            MapUtil.mapPlusInt(dao.drawHitNums, itemModel.getId(), 1);

            for(AbstractDrawItemModel drawModel : itemModelMap.values()) {
               if (drawModel.getId() == itemModel.getId()) {
                  dao.drawAddNums.put(drawModel.getId(), 0);
               } else {
                  MapUtil.mapPlusInt(dao.drawAddNums, drawModel.getId(), 1);
               }
            }

            drawModels.add(itemModel);
         }
      }

      this.logger.info("跨服孵蛋活动=>抽中次数" + JSON.toJSONString(dao.drawHitNums, true));
      this.logger.info("跨服孵蛋活动=>累计次数" + JSON.toJSONString(dao.drawAddNums, true));
      return drawModels;
   }
}
