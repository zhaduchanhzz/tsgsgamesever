package com.gzbz.rune.bean;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.model.ItemModel;
import com.gzbz.model.RuneRefineLvNatureModel;
import com.gzbz.model.RuneRefineNatureModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.RuneRefineRangeModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuneRefineInheritItem extends ItemBase {
   public int breakUpTime;
   public Map<Integer, PropertyModel> refinePro = new HashMap();
   public Set<Integer> lockNatureIds = new HashSet();
   private Map<Integer, Integer> proSeat = new HashMap();
   private Logger logger = LoggerFactory.getLogger(this.getClass());

   public RuneRefineInheritItem() {
   }

   public RuneRefineInheritItem(int code, RuneRefineInheritItem data) {
      this.code = code;
      this.id = data.id;
      this.num = 1;
      this.enableTime = data.enableTime;
      this.breakUpTime = data.breakUpTime;
      this.refinePro.clear();
      this.refinePro.putAll(data.refinePro);
   }

   public void init(int code, int num, ItemModel itemModel, GamePlayer gamePlayer) {
      super.init(code, 1, itemModel, gamePlayer);
      this.breakUpTime = 0;
      this.refinePro.clear();
   }

   public RuneRefineLvNatureModel getRuneRefineLvNatureModel(int seat, int breakUpTime) {
      ConcurrentHashMap<Integer, RuneRefineLvNatureModel> breakUpTime_model = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customRuneRefinelvNature", seat);
      if (null == breakUpTime_model) {
         this.logger.error("RuneRefineLvNature缺少配置 seat:{},breakUpTime:{}", seat, breakUpTime);
         return null;
      } else {
         RuneRefineLvNatureModel model = (RuneRefineLvNatureModel)breakUpTime_model.get(breakUpTime);
         if (null == model) {
            this.logger.error("RuneRefineLvNature缺少配置 seat:{},breakUpTime:{}", seat, breakUpTime);
         }

         return model;
      }
   }

   public List<RuneRefineNatureModel> getRuneRefineNatureModelList(int seat, int breakUpTime) {
      RuneRefineLvNatureModel runeRefineLvNatureModel = this.getRuneRefineLvNatureModel(seat, breakUpTime);
      if (null == runeRefineLvNatureModel) {
         return null;
      } else {
         List<RuneRefineNatureModel> modelList = (List)ApplicationContextProvider.getModelPoolEntity("customRuneRefineNature", runeRefineLvNatureModel.getRefineLv() + "_" + seat);
         if (null == modelList || modelList.size() <= 0) {
            this.logger.error("RuneRefineNature 配置出错 refineLv:{},seat:{}", runeRefineLvNatureModel.getRefineLv(), seat);
         }

         return modelList;
      }
   }

   public int calQuality(int id) {
      RuneRefineNatureModel model = (RuneRefineNatureModel)ApplicationContextProvider.getModelPoolEntity("RuneRefineNature", id);
      if (null == model) {
         this.logger.error("RuneRefineNature 配置有误 id:{}", id);
         return 0;
      } else {
         List<RuneRefineNatureModel> runeRefineNatureModelList = this.getRuneRefineNatureModelList(model.getSeat(), this.breakUpTime);
         if (null != runeRefineNatureModelList && runeRefineNatureModelList.size() > 0) {
            PropertyModel propertyModel = (PropertyModel)this.refinePro.get(id);
            int type = propertyModel.getType();
            int way = propertyModel.getWay();
            long value = propertyModel.getValue();

            for(RuneRefineNatureModel runeRefineNatureModel : runeRefineNatureModelList) {
               if (runeRefineNatureModel.getNatureType() == type && runeRefineNatureModel.getNatureWay() == way) {
                  Map<Integer, RuneRefineRangeModel> refineRange = runeRefineNatureModel.getRefineRange();

                  for(Map.Entry<Integer, RuneRefineRangeModel> entry : refineRange.entrySet()) {
                     RuneRefineRangeModel rangeModel = (RuneRefineRangeModel)entry.getValue();
                     if (value >= (long)rangeModel.getMin() && value <= (long)rangeModel.getMax()) {
                        return rangeModel.getQuality();
                     }
                  }
               }
            }

            return 0;
         } else {
            return 0;
         }
      }
   }

   public CommonMsg.RefineProperty.Builder toBuilderRefineProperty(int refineNatureId) {
      CommonMsg.RefineProperty.Builder refinePropertyBuilder = CommonMsg.RefineProperty.newBuilder();
      PropertyModel propertyModel = (PropertyModel)this.refinePro.get(refineNatureId);
      if (null == propertyModel) {
         return refinePropertyBuilder;
      } else {
         refinePropertyBuilder.setType(propertyModel.getType());
         refinePropertyBuilder.setWay(propertyModel.getWay());
         refinePropertyBuilder.setValue((double)propertyModel.getValue());
         int quality = this.calQuality(refineNatureId);
         refinePropertyBuilder.setQuality(quality);
         refinePropertyBuilder.setId(refineNatureId);
         refinePropertyBuilder.setSeat(this.getProSeatById(refineNatureId));
         return refinePropertyBuilder;
      }
   }

   public int getProSeatById(int id) {
      this.proSeatChangeHandle();
      Integer seat = (Integer)this.proSeat.get(id);
      return null == seat ? 0 : seat;
   }

   public void proSeatChangeHandle() {
      if (this.refinePro.size() <= 0) {
         this.proSeat.clear();
      } else if (this.refinePro.size() != this.proSeat.size() || !this.refinePro.keySet().containsAll(this.proSeat.keySet())) {
         Set<Integer> noSeatRefineProIdSet = new HashSet();
         Set<Integer> seatSetByConfig = this.getSeatSetByConfig();
         Map<Integer, Integer> tempProSeatMap = new HashMap();

         for(Map.Entry<Integer, PropertyModel> propertyModelEntry : this.refinePro.entrySet()) {
            int id = (Integer)propertyModelEntry.getKey();
            Integer proSeat = (Integer)this.proSeat.get(id);
            if (null == proSeat) {
               noSeatRefineProIdSet.add(id);
            } else {
               seatSetByConfig.remove(proSeat);
               tempProSeatMap.put(id, proSeat);
            }
         }

         if (noSeatRefineProIdSet.size() != seatSetByConfig.size()) {
            this.proSeat.clear();
            this.logger.error("分配洗练属性位置有误：未分配的属性id和可分配位置数量不匹配");
         } else {
            for(Integer noSeatRefineProId : noSeatRefineProIdSet) {
               Optional<Integer> first = seatSetByConfig.stream().findFirst();
               if (first.isPresent()) {
                  int seat = (Integer)first.get();
                  tempProSeatMap.put(noSeatRefineProId, seat);
                  seatSetByConfig.remove(seat);
               }
            }

            this.proSeat.clear();
            this.proSeat.putAll(tempProSeatMap);
         }
      }
   }

   public Set<Integer> getSeatSetByConfig() {
      Set<Integer> seatSet = new HashSet();
      int runeRefineNatureNum = ApplicationContextProvider.getConfigInt("RuneRefineNatureNum", 4);

      for(int i = 1; i <= runeRefineNatureNum; ++i) {
         seatSet.add(i);
      }

      return seatSet;
   }

   public void decode(String data) {
      String[] arrs = data.split(";");
      String[] baseStrs = arrs[0].split(",");
      this.code = Integer.parseInt(baseStrs[0]);
      this.id = Integer.parseInt(baseStrs[1]);
      this.num = Integer.parseInt(baseStrs[2]);
      this.enableTime = Integer.parseInt(baseStrs[3]);
      this.breakUpTime = Integer.parseInt(baseStrs[4]);
      this.refinePro.clear();
      if (arrs.length > 1) {
         String[] proStrs = arrs[1].split(",");

         for(String proStr : proStrs) {
            String[] cell = proStr.split("_");
            if (cell.length < 4) {
               this.logger.error("解析洗练继承石出错");
            } else {
               PropertyModel pro = new PropertyModel(Integer.parseInt(cell[1]), Integer.parseInt(cell[2]), (long)Integer.parseInt(cell[3]));
               this.refinePro.put(Integer.parseInt(cell[0]), pro);
            }
         }
      }

      this.lockNatureIds.clear();
      if (arrs.length > 2 && StringUtils.isNotBlank(arrs[2])) {
         String[] lockNatureStrs = arrs[2].split(",");

         for(String lockNatureStr : lockNatureStrs) {
            this.lockNatureIds.add(Integer.parseInt(lockNatureStr));
         }
      }

      this.proSeat.clear();
      if (arrs.length > 3 && StringUtils.isNotBlank(arrs[3])) {
         String[] natureId_seatStrs = arrs[3].split(",");

         for(String natureId_seatStr : natureId_seatStrs) {
            String[] natureId_seat = natureId_seatStr.split("_");
            if (natureId_seat.length < 2) {
               this.logger.error("解析符文洗练属性出错");
            } else {
               this.proSeat.put(Integer.parseInt(natureId_seat[0]), Integer.parseInt(natureId_seat[1]));
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
      stringBuilder.append(this.breakUpTime);
      stringBuilder.append(";");
      if (this.refinePro.size() > 0) {
         for(Map.Entry<Integer, PropertyModel> entry : this.refinePro.entrySet()) {
            PropertyModel value = (PropertyModel)entry.getValue();
            stringBuilder.append(entry.getKey() + "_" + value.getType() + "_" + value.getWay() + "_" + value.getValue());
            stringBuilder.append(",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      stringBuilder.append(";");
      if (this.lockNatureIds.size() > 0) {
         for(Integer lockNatureId : this.lockNatureIds) {
            stringBuilder.append(lockNatureId + ",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      stringBuilder.append(";");
      if (this.proSeat.size() > 0) {
         for(Map.Entry<Integer, Integer> entry : this.proSeat.entrySet()) {
            stringBuilder.append(entry.getKey() + "_" + entry.getValue() + ",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
