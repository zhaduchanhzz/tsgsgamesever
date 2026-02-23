package com.gzbz.godBeast;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.godBeast.bean.GodBeastHatchFloorData;
import com.gzbz.godBeast.bean.GodBeastItem;
import com.gzbz.model.GodBeastAptitudeLibModel;
import com.gzbz.model.GodBeastBuyEggModel;
import com.gzbz.model.GodBeastDecompositionModel;
import com.gzbz.model.GodBeastFloorModel;
import com.gzbz.model.GodBeastHatchLibModel;
import com.gzbz.model.GodBeastHatchModel;
import com.gzbz.model.GodBeastLevelAttrModel;
import com.gzbz.model.GodBeastLevelEXPModel;
import com.gzbz.model.GodBeastModel;
import com.gzbz.model.GodBeastPassiveSkillModel;
import com.gzbz.model.GodBeastScoreModel;
import com.gzbz.model.GodBeastSkillModel;
import com.gzbz.model.GodBeastSkillUnlockModel;
import com.gzbz.model.GodBeastStarMaterialModel;
import com.gzbz.model.GodBeastStarModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.PropertyRangeModel;
import com.gzbz.model.fun.ResourceBackModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import misc.RandomUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GodBeastDefine {
   private static Logger logger = LoggerFactory.getLogger(GodBeastDefine.class);
   public static final int INIT_LEVEL = 0;
   public static final int HATCH_TYPE_1 = 1;
   public static final int HATCH_TYPE_2 = 2;
   public static final int HATCH_TYPE_3 = 3;
   public static final int STAR_UP_COST_NUM_NOT_ENOUGH = -1;
   public static final int STAR_UP_COST_ID_WRONG = -2;
   public static final int STAR_UP_COST_IS_LOCK = -3;
   public static final int STAR_UP_ITEM_TYPE_ITEM = 1;
   public static final int MAX_RECORD_SIZE = 100;

   public static GodBeastHatchModel getGodBeastHatchModel(int id) {
      GodBeastHatchModel model = (GodBeastHatchModel)ApplicationContextProvider.getModelPoolEntity("GodBeastHatch", id);
      if (null == model) {
         logger.error("GodBeastHatch 配置有误 id:{}", id);
      }

      return model;
   }

   public static GodBeastItem hatch(int hatchType, long playerHatchNum, Map<Integer, Integer> playerQualityHatchNum, long worldPlayerCount, Map<Integer, Integer> worldQualityHatchNum, Map<Integer, Integer> worldQualityTriggerTimes) {
      if (null == playerQualityHatchNum) {
         playerQualityHatchNum = new HashMap();
      }

      if (null == worldQualityHatchNum) {
         worldQualityHatchNum = new HashMap();
      }

      if (null == worldQualityTriggerTimes) {
         worldQualityTriggerTimes = new HashMap();
      }

      GodBeastHatchModel godBeastHatchModel = getGodBeastHatchModel(hatchType);
      if (null == godBeastHatchModel) {
         return null;
      } else {
         int godBeastLibId = 0;
         int worldFloorTriggerQuality = 0;
         Set<Integer> worldMaxTriggerTimesQualitySet = new HashSet();
         Map<Integer, GodBeastFloorModel> godBeastFloorModelMap = getGodBeastFloorModelMap();
         if (godBeastFloorModelMap.size() > 0 && hatchType == 1) {
            for(Integer quality : godBeastFloorModelMap.keySet().stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList())) {
               GodBeastFloorModel godBeastFloorModel = (GodBeastFloorModel)godBeastFloorModelMap.get(quality);
               int baseNum = godBeastFloorModel.getBaseNum();
               long qualityMaxTriggerNum = worldPlayerCount / (long)baseNum;
               if (qualityMaxTriggerNum <= 0L) {
                  qualityMaxTriggerNum = 1L;
               }

               Integer curQualityTriggerTimes = (Integer)worldQualityTriggerTimes.getOrDefault(quality, 0);
               if ((long)curQualityTriggerTimes >= qualityMaxTriggerNum * (long)godBeastFloorModel.getBaseTimes()) {
                  worldMaxTriggerTimesQualitySet.add(quality);
               } else {
                  Integer curHatchNum = (Integer)worldQualityHatchNum.getOrDefault(quality, 0);
                  if (curHatchNum + 1 >= godBeastFloorModel.getExtractTimes()) {
                     worldFloorTriggerQuality = quality;
                     godBeastLibId = godBeastFloorModel.getHatchLibId();
                     break;
                  }
               }
            }
         }

         Set<Integer> playerFloorTriggerQualitySet = new HashSet();
         int playerFloorTriggerQuality = 0;
         Map<Integer, GodBeastHatchFloorData> godBeastPlayerFloorMap = getGodBeastPlayerFloorMap();
         if (godBeastPlayerFloorMap.size() > 0 && hatchType == 1) {
            for(int quality : godBeastPlayerFloorMap.keySet().stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList())) {
               GodBeastHatchFloorData godBeastHatchFloorData = (GodBeastHatchFloorData)godBeastPlayerFloorMap.get(quality);
               int hatchNum = godBeastHatchFloorData.getHatchNum();
               Integer curHatchNum = (Integer)playerQualityHatchNum.getOrDefault(quality, 0);
               if (curHatchNum + 1 >= hatchNum) {
                  playerFloorTriggerQualitySet.add(quality);
                  if (godBeastLibId <= 0) {
                     playerFloorTriggerQuality = quality;
                     godBeastLibId = godBeastHatchFloorData.getLibId();
                  }
               }
            }
         }

         if (godBeastLibId <= 0) {
            godBeastLibId = GamePlayer.countRate(godBeastHatchModel.getGBLib1());
         }

         long newHatchNum = playerHatchNum + 1L;
         GodBeastHatchLibModel godBeastHatchLibModel = randomGodBeastHatchLibModel(godBeastLibId, newHatchNum);
         if (null == godBeastHatchLibModel) {
            return null;
         } else {
            GodBeastItem godBeastItem = randomGodBeastItem(godBeastHatchLibModel.getGodBeastID(), godBeastHatchLibModel.getAptitude());
            if (null != godBeastItem && hatchType == 1) {
               for(int quality : godBeastFloorModelMap.keySet()) {
                  if (worldMaxTriggerTimesQualitySet.contains(quality)) {
                     worldQualityHatchNum.put(quality, 0);
                  } else {
                     Integer curHatchNum = (Integer)worldQualityHatchNum.getOrDefault(quality, 0);
                     worldQualityHatchNum.put(quality, curHatchNum + 1);
                  }
               }

               for(int quality : godBeastPlayerFloorMap.keySet()) {
                  Integer curHatchNum = (Integer)playerQualityHatchNum.getOrDefault(quality, 0);
                  playerQualityHatchNum.put(quality, curHatchNum + 1);
               }

               if (worldFloorTriggerQuality > 0) {
                  worldQualityHatchNum.put(worldFloorTriggerQuality, 0);
                  if (!playerFloorTriggerQualitySet.contains(worldFloorTriggerQuality)) {
                     playerQualityHatchNum.put(worldFloorTriggerQuality, 0);
                  }

                  Integer curQualityTriggerTimes = (Integer)worldQualityTriggerTimes.getOrDefault(worldFloorTriggerQuality, 0);
                  worldQualityTriggerTimes.put(worldFloorTriggerQuality, curQualityTriggerTimes + 1);
               }

               if (playerFloorTriggerQuality > 0) {
                  playerQualityHatchNum.put(playerFloorTriggerQuality, 0);
               }
            }

            return godBeastItem;
         }
      }
   }

   public static GodBeastHatchLibModel randomGodBeastHatchLibModel(int libId, long hatchNum) {
      ArrayList<GodBeastHatchLibModel> hatchLibModelList = (ArrayList)ApplicationContextProvider.getModelPoolEntity("customGodBeastHatchLib", libId);
      if (null != hatchLibModelList && !hatchLibModelList.isEmpty()) {
         List<KeyValFun> keyValFunList = new ArrayList();

         for(GodBeastHatchLibModel model : hatchLibModelList) {
            if (hatchNum >= (long)model.getLockNum()) {
               keyValFunList.add(new KeyValFun(model.getId(), model.getOdds()));
            }
         }

         int id = GamePlayer.countRate(keyValFunList);
         return getGodBeastHatchLibModel(id);
      } else {
         logger.error("GodBeastHatchLib 配置有误 libId:{}", libId);
         return null;
      }
   }

   public static GodBeastItem randomGodBeastItem(int godBeastId, int aptitudeLibId) {
      ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", godBeastId);
      GodBeastModel godBeastModel = getGodBeastModel(godBeastId);
      if (null != itemModel && null != godBeastModel) {
         List<GodBeastAptitudeLibModel> godBeastAptitudeLibModelList = getGodBeastAptitudeLibModelList(aptitudeLibId);
         if (null != godBeastAptitudeLibModelList && !godBeastAptitudeLibModelList.isEmpty()) {
            List<KeyValFun> keyValFunList = new ArrayList();

            for(GodBeastAptitudeLibModel model : godBeastAptitudeLibModelList) {
               keyValFunList.add(new KeyValFun(model.getId(), model.getOdds()));
            }

            int aptitudeId = GamePlayer.countRate(keyValFunList);
            GodBeastAptitudeLibModel godBeastAptitudeLibModel = getGodBeastAptitudeLibModel(aptitudeId);
            if (null == godBeastAptitudeLibModel) {
               return null;
            } else {
               List<PropertyRangeModel> attrRangeList = new ArrayList();
               List<PropertyRangeModel> attrHp = godBeastAptitudeLibModel.getAttrHp();
               if (attrHp.size() > 0) {
                  int index = RandomUtil.randInt(0, attrHp.size());
                  PropertyRangeModel propertyRangeModel = (PropertyRangeModel)attrHp.get(index);
                  attrRangeList.add(propertyRangeModel);
               }

               List<PropertyRangeModel> attrAttack = godBeastAptitudeLibModel.getAttrAttack();
               if (attrAttack.size() > 0) {
                  int index = RandomUtil.randInt(0, attrAttack.size());
                  PropertyRangeModel propertyRangeModel = (PropertyRangeModel)attrAttack.get(index);
                  attrRangeList.add(propertyRangeModel);
               }

               List<PropertyRangeModel> attrSpeed = godBeastAptitudeLibModel.getAttrSpeed();
               if (attrSpeed.size() > 0) {
                  int index = RandomUtil.randInt(0, attrSpeed.size());
                  PropertyRangeModel propertyRangeModel = (PropertyRangeModel)attrSpeed.get(index);
                  attrRangeList.add(propertyRangeModel);
               }

               return recGodBeastItemByAttrRange(godBeastId, attrRangeList);
            }
         } else {
            return null;
         }
      } else {
         logger.error("Item 或 GodBeast 配置异常 itemId:{}", godBeastId);
         return null;
      }
   }

   public static GodBeastItem recGodBeastItemByAttrRange(int godBeastId, List<PropertyRangeModel> attrRangeList) {
      if (null != attrRangeList && !attrRangeList.isEmpty()) {
         Map<Integer, PropertyModel> attrMap = new HashMap();

         for(PropertyRangeModel propertyRangeModel : attrRangeList) {
            int randomValue = RandomUtil.randInt((int)propertyRangeModel.getMin(), (int)propertyRangeModel.getMax() + 1);
            PropertyModel pro = new PropertyModel(propertyRangeModel.getType(), propertyRangeModel.getWay(), (long)randomValue);
            attrMap.put(pro.getType(), pro);
         }

         GodBeastItem godBeastItem = new GodBeastItem(godBeastId, attrMap);
         return godBeastItem;
      } else {
         return null;
      }
   }

   public static GodBeastHatchLibModel getGodBeastHatchLibModel(int id) {
      GodBeastHatchLibModel model = (GodBeastHatchLibModel)ApplicationContextProvider.getModelPoolEntity("GodBeastHatchLib", id);
      if (null == model) {
         logger.error("GodBeastHatchLib 配置有误 id:{}", id);
      }

      return model;
   }

   public static List<GodBeastAptitudeLibModel> getGodBeastAptitudeLibModelList(int aptitudeLibId) {
      ArrayList<GodBeastAptitudeLibModel> libModelList = (ArrayList)ApplicationContextProvider.getModelPoolEntity("customGodBeastAptitudeLib", aptitudeLibId);
      if (null != libModelList && !libModelList.isEmpty()) {
         return libModelList;
      } else {
         logger.error("GodBeastAptitudeLib 配置有误 libId:{}", aptitudeLibId);
         return new ArrayList();
      }
   }

   public static GodBeastAptitudeLibModel getGodBeastAptitudeLibModel(int id) {
      GodBeastAptitudeLibModel model = (GodBeastAptitudeLibModel)ApplicationContextProvider.getModelPoolEntity("GodBeastAptitudeLib", id);
      if (null == model) {
         logger.error("GodBeastAptitudeLib 配置有误 id:{}", id);
      }

      return model;
   }

   public static GodBeastModel getGodBeastModel(int godBeastID) {
      GodBeastModel model = (GodBeastModel)ApplicationContextProvider.getModelPoolEntity("GodBeast", godBeastID);
      if (null == model) {
         logger.error("GodBeast 配置有误 godBeastID:{}", godBeastID);
      }

      return model;
   }

   public static GodBeastLevelEXPModel getGodBeastLevelEXPModel(int level) {
      GodBeastLevelEXPModel model = (GodBeastLevelEXPModel)ApplicationContextProvider.getModelPoolEntity("GodBeastLevelEXP", level);
      if (null == model) {
         logger.error("GodBeastLevelEXP 配置有误 level:{}", level);
      }

      return model;
   }

   public static int getMaxLevel(int scoreId, int starId) {
      GodBeastLevelAttrModel godBeastLevelAttrModel = getGodBeastLevelAttrModel(scoreId);
      if (null == godBeastLevelAttrModel) {
         return 0;
      } else {
         int star = 0;
         GodBeastStarModel godBeastStarModel = getGodBeastStarModel(starId);
         if (null != godBeastStarModel) {
            star = godBeastStarModel.getStar();
         }

         List<Integer> lvLimit = godBeastLevelAttrModel.getLvLimit();
         return lvLimit.size() <= star ? (Integer)lvLimit.get(0) : (Integer)lvLimit.get(star);
      }
   }

   public static List<Integer> getAllSkillIdList(GodBeastItem godBeastItem) {
      List<Integer> skillIdList = new ArrayList();
      if (null == godBeastItem) {
         return skillIdList;
      } else {
         int talentSkill = getTalentSkill(godBeastItem.getStarId());
         if (talentSkill > 0) {
            skillIdList.add(talentSkill);
         }

         if (godBeastItem.passiveSkillId > 0) {
            skillIdList.add(godBeastItem.passiveSkillId);
         }

         return skillIdList;
      }
   }

   public static Map<Integer, List<PropertyModel>> extractProList(GodBeastItem godBeastItem) {
      List<PropertyModel> baseProList = new ArrayList();
      List<PropertyModel> otherProList = new ArrayList();
      Map<Integer, List<PropertyModel>> proMap = new HashMap();
      proMap.put(0, baseProList);
      proMap.put(1, otherProList);
      if (null == godBeastItem) {
         return proMap;
      } else {
         List<PropertyModel> allProList = getAllProList(godBeastItem, true);
         if (allProList.isEmpty()) {
            return proMap;
         } else {
            for(PropertyModel propertyModel : allProList) {
               boolean typeLimit = propertyModel.getType() == 1 || propertyModel.getType() == 2 || propertyModel.getType() == 3 || propertyModel.getType() == 4;
               if (typeLimit && propertyModel.getWay() == 0) {
                  baseProList.add(propertyModel);
               } else {
                  otherProList.add(propertyModel);
               }
            }

            return proMap;
         }
      }
   }

   public static List<PropertyModel> getAllProList(GodBeastItem godBeastItem, boolean aptitude) {
      List<PropertyModel> proList = new ArrayList();
      if (null == godBeastItem) {
         return proList;
      } else {
         int scoreId = calGodBeastScoreId(godBeastItem);
         GodBeastLevelAttrModel godBeastLevelAttrModel = getGodBeastLevelAttrModel(scoreId);
         if (null == godBeastLevelAttrModel) {
            return proList;
         } else {
            Map<String, Long> typeWay_val = new HashMap();

            for(PropertyModel p : godBeastLevelAttrModel.getBaseAtt()) {
               p.add2TypeWayMap(typeWay_val);
            }

            if (aptitude) {
               for(Map.Entry<Integer, PropertyModel> entry : godBeastItem.attrMap.entrySet()) {
                  PropertyModel p = (PropertyModel)entry.getValue();
                  p.add2TypeWayMap(typeWay_val);
               }
            }

            for(PropertyModel p : getLvProList(scoreId, godBeastItem.level)) {
               p.add2TypeWayMap(typeWay_val);
            }

            for(PropertyModel p : getStarProList(godBeastItem.getStarId())) {
               p.add2TypeWayMap(typeWay_val);
            }

            Map<Integer, Integer> attrSkillMap = new HashMap(godBeastItem.attrSkillMap);

            for(Map.Entry<Integer, Integer> entry : attrSkillMap.entrySet()) {
               int skillId = (Integer)entry.getValue();
               GodBeastSkillModel godBeastSkillModel = getGodBeastSkillModel(skillId);
               if (null != godBeastSkillModel) {
                  for(PropertyModel p : godBeastSkillModel.getProperty()) {
                     p.add2TypeWayMap(typeWay_val);
                  }
               }
            }

            if (null != godBeastItem.mainNeiDan) {
               Map<String, Long> neiDanTypeWay_val = NeiDanDefine.calAddGodBeastPro(godBeastItem.mainNeiDan);
               if (neiDanTypeWay_val.size() > 0) {
                  for(Map.Entry<String, Long> entry : typeWay_val.entrySet()) {
                     String type_wayStr = (String)entry.getKey();
                     String[] type_way = type_wayStr.split("_");
                     int type = Integer.parseInt(type_way[0]);
                     int way = Integer.parseInt(type_way[1]);
                     Long val = (Long)entry.getValue();
                     boolean typeLimit = type == 1 || type == 2 || type == 3 || type == 4;
                     if (typeLimit && way == 0) {
                        Long addRatio = (Long)neiDanTypeWay_val.get(type + "_" + 1);
                        if (null != addRatio) {
                           double addRatioDouble = Double.parseDouble(addRatio + "");
                           double finalVal = (double)val * ((double)1.0F + addRatioDouble / (double)10000.0F);
                           typeWay_val.put(type_wayStr, (long)finalVal);
                        }
                     }
                  }
               }
            }

            for(Map.Entry<String, Long> entry : typeWay_val.entrySet()) {
               String type_wayStr = (String)entry.getKey();
               String[] type_way = type_wayStr.split("_");
               int type = Integer.parseInt(type_way[0]);
               int way = Integer.parseInt(type_way[1]);
               Long val = (Long)entry.getValue();
               proList.add(new PropertyModel(type, way, val));
            }

            return proList;
         }
      }
   }

   public static List<PropertyModel> getLvProList(int scoreId, int level) {
      List<PropertyModel> lvProList = new ArrayList();
      GodBeastLevelAttrModel godBeastLevelAttrModel = getGodBeastLevelAttrModel(scoreId);
      if (null == godBeastLevelAttrModel) {
         return lvProList;
      } else {
         int levelUpNum = level - 0;
         if (levelUpNum <= 0) {
            return lvProList;
         } else {
            for(PropertyModel p : godBeastLevelAttrModel.getLvAtt()) {
               lvProList.add(new PropertyModel(p.getType(), p.getWay(), p.getValue() * (long)levelUpNum));
            }

            return lvProList;
         }
      }
   }

   public static List<PropertyModel> getStarProList(int starId) {
      List<PropertyModel> proList = new ArrayList();
      if (starId <= 0) {
         return proList;
      } else {
         GodBeastStarModel godBeastStarModel = getGodBeastStarModel(starId);
         if (null != godBeastStarModel) {
            proList.addAll(godBeastStarModel.getUpStar());
         }

         return proList;
      }
   }

   public static KeyValFun getGodBeastExpItem() {
      int godBeastExpItem = ApplicationContextProvider.getConfigInt("godBeastExpItem", 50050);
      String godBeastExp = ApplicationContextProvider.getConfigString("godBeastExp", "50050:1");
      int exp = Integer.parseInt(godBeastExp.split(":")[1]);
      return new KeyValFun(godBeastExpItem, exp);
   }

   public static int getGodBeastRecordQuality() {
      return ApplicationContextProvider.getConfigInt("godBeastExpRecord", 5);
   }

   public static ResourceModel getLevelUpCost(int curLevel, int curExp) {
      GodBeastLevelEXPModel godBeastLevelEXPModel = getGodBeastLevelEXPModel(curLevel);
      if (null != godBeastLevelEXPModel && godBeastLevelEXPModel.getNeedEXP() > 0) {
         KeyValFun godBeastExpItem = getGodBeastExpItem();
         if (null == godBeastExpItem) {
            return null;
         } else {
            int needEXP = godBeastLevelEXPModel.getNeedEXP() - curExp;
            if (needEXP <= 0) {
               logger.error("升级所需经验needEXP:{}", needEXP);
               return null;
            } else {
               int exp = godBeastExpItem.getVal();
               if (exp <= 0) {
                  logger.error("GodBeastLevelEXP 配置有误 EXP:{}", exp);
                  return null;
               } else {
                  int count = needEXP / exp;
                  if (needEXP % exp > 0) {
                     ++count;
                  }

                  ResourceModel resourceModel = new ResourceModel(2, godBeastExpItem.getKey(), count);
                  return resourceModel;
               }
            }
         }
      } else {
         return null;
      }
   }

   public static int getExpByCostItem(ResourceModel costItem) {
      if (costItem != null && costItem.getValue() > 0) {
         KeyValFun godBeastExpItem = getGodBeastExpItem();
         if (null != godBeastExpItem && godBeastExpItem.getKey() == costItem.getId() && costItem.getType() == 2) {
            int exp = godBeastExpItem.getVal();
            return costItem.getValue() * exp;
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public static GodBeastStarModel getGodBeastStarModel(int upStarID) {
      GodBeastStarModel model = (GodBeastStarModel)ApplicationContextProvider.getModelPoolEntity("GodBeastStar", upStarID);
      if (null == model && upStarID > 0) {
         logger.error("GodBeastStar 配置有误 upStarID:{}", upStarID);
      }

      return model;
   }

   public static GodBeastStarModel getGodBeastStarModel(int godBeastId, int star) {
      GodBeastModel godBeastModel = getGodBeastModel(godBeastId);
      if (null == godBeastModel) {
         return null;
      } else {
         GodBeastStarModel godBeastStarModel = getGodBeastStarModel(godBeastModel.getUpStarID());
         if (star <= 0) {
            return godBeastStarModel;
         } else {
            int nextStarId = godBeastStarModel.getNextStarID();

            while(true) {
               GodBeastStarModel nextStarModel = getGodBeastStarModel(nextStarId);
               if (null == nextStarModel || nextStarModel.getStar() >= star) {
                  return nextStarModel;
               }

               nextStarId = nextStarModel.getNextStarID();
            }
         }
      }
   }

   public static GodBeastStarMaterialModel getGodBeastStarMaterialModel(int materialId, int qualificationScore) {
      String key = materialId + "_" + qualificationScore;
      GodBeastStarMaterialModel model = (GodBeastStarMaterialModel)ApplicationContextProvider.getModelPoolEntity("customGodBeastStarMaterial", key);
      if (null == model) {
         logger.error("GodBeastStarMaterial 配置有误 materialId:{} qualificationScore:{}", materialId, qualificationScore);
      }

      return model;
   }

   public static int calGodBeastScore(GodBeastItem godBeastItem) {
      Map<Integer, PropertyModel> attrMap = new HashMap(godBeastItem.attrMap);
      PropertyModel attackPro = (PropertyModel)attrMap.get(2);
      PropertyModel hpPro = (PropertyModel)attrMap.get(1);
      PropertyModel speedPro = (PropertyModel)attrMap.get(4);
      long attackVal = attackPro == null ? 0L : attackPro.getValue();
      long hpVal = hpPro == null ? 0L : hpPro.getValue();
      long speedVal = speedPro == null ? 0L : speedPro.getValue();
      BigDecimal attack = new BigDecimal(attackVal + "");
      BigDecimal hp = new BigDecimal(hpVal + "");
      BigDecimal speed = new BigDecimal(speedVal + "");
      int scale = 3;
      BigDecimal attackDivide = attack.divide(new BigDecimal("10"), scale, 4);
      BigDecimal hpDivide = hp.divide(new BigDecimal("10"), scale, 4);
      BigDecimal add = attackDivide.add(hpDivide).add(speed);
      BigDecimal score = add.divide(new BigDecimal("3"), scale, 4);
      int s = score.setScale(0, 1).intValue();
      if (s < 1) {
         s = 1;
      }

      return s;
   }

   public static int calGodBeastScoreId(GodBeastItem godBeastItem) {
      Map<Integer, GodBeastScoreModel> modelMap = ApplicationContextProvider.<Integer, GodBeastScoreModel>getModelPoolMap("GodBeastScore");
      if (null != modelMap && !modelMap.isEmpty()) {
         int score = calGodBeastScore(godBeastItem);

         for(Map.Entry<Integer, GodBeastScoreModel> entry : modelMap.entrySet()) {
            GodBeastScoreModel value = (GodBeastScoreModel)entry.getValue();
            if (score >= value.getScoreLow() && score <= value.getScoreHigh()) {
               return value.getId();
            }
         }

         return 0;
      } else {
         return 0;
      }
   }

   public static int getTalentSkill(int starId) {
      if (starId <= 0) {
         return 0;
      } else {
         GodBeastStarModel godBeastStarModel = getGodBeastStarModel(starId);
         return null == godBeastStarModel ? 0 : godBeastStarModel.getTalentSkill();
      }
   }

   public static GodBeastPassiveSkillModel getGodBeastPassiveSkillModel(int skillId) {
      GodBeastPassiveSkillModel model = (GodBeastPassiveSkillModel)ApplicationContextProvider.getModelPoolEntity("GodBeastPassiveSkill", skillId);
      if (null == model && skillId > 0) {
         logger.error("GodBeastPassiveSkill 配置有误 skillId:{}", skillId);
      }

      return model;
   }

   public static List<GodBeastPassiveSkillModel> getGodBeastPassiveSkillModelList(int skillGroup) {
      List<GodBeastPassiveSkillModel> modelList = (List)ApplicationContextProvider.getModelPoolEntity("customGodBeastPassiveSkill", skillGroup);
      if (null == modelList || modelList.isEmpty()) {
         logger.error("GodBeastPassiveSkill 配置有误 ");
      }

      return modelList;
   }

   public static List<ResourceModel> getPassiveSkillResetReward(int passiveSkillId) {
      List<ResourceModel> resetRewardList = new ArrayList();
      if (passiveSkillId <= 0) {
         return resetRewardList;
      } else {
         GodBeastPassiveSkillModel godBeastPassiveSkillModel = getGodBeastPassiveSkillModel(passiveSkillId);
         if (null == godBeastPassiveSkillModel) {
            return resetRewardList;
         } else {
            for(ResourceBackModel resourceBackModel : godBeastPassiveSkillModel.getCost()) {
               ResourceModel rm = new ResourceModel(resourceBackModel.getType(), resourceBackModel.getId(), resourceBackModel.getBack());
               rm.addResourceToList(resetRewardList);
            }

            return resetRewardList;
         }
      }
   }

   public static GodBeastSkillUnlockModel getGodBeastSkillUnlockModel(int id) {
      GodBeastSkillUnlockModel model = (GodBeastSkillUnlockModel)ApplicationContextProvider.getModelPoolEntity("GodBeastSkillUnlock", id);
      if (null == model && id > 0) {
         logger.error("GodBeastSkillUnlock 配置有误 id:{}", id);
      }

      return model;
   }

   public static GodBeastSkillModel getGodBeastSkillModel(int skillId) {
      GodBeastSkillModel model = (GodBeastSkillModel)ApplicationContextProvider.getModelPoolEntity("GodBeastSkill", skillId);
      if (null == model && skillId > 0) {
         logger.error("GodBeastSkill 配置有误 skillID:{}", skillId);
      }

      return model;
   }

   public static Set<Integer> getAttrSkillGroups(Map<Integer, Integer> attrSkillMap) {
      Set<Integer> groups = new HashSet();
      if (null != attrSkillMap && !attrSkillMap.isEmpty()) {
         Map<Integer, Integer> map = new HashMap(attrSkillMap);

         for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer skillId = (Integer)entry.getValue();
            GodBeastSkillModel godBeastSkillModel = getGodBeastSkillModel(skillId);
            groups.add(godBeastSkillModel.getSkillGroup());
         }

         return groups;
      } else {
         return groups;
      }
   }

   public static boolean checkAttrSkillSlotUnlock(int slot, int star, int quality) {
      GodBeastSkillUnlockModel model = getGodBeastSkillUnlockModel(slot);
      if (null == model) {
         return false;
      } else {
         return star >= model.getNeedStar() && quality >= model.getNeedQuality();
      }
   }

   public static List<ResourceModel> getAttrSkillResetReward(int attrSkillId) {
      List<ResourceModel> resetRewardList = new ArrayList();
      if (attrSkillId <= 0) {
         return resetRewardList;
      } else {
         GodBeastSkillModel godBeastSkillModel = getGodBeastSkillModel(attrSkillId);
         if (null == godBeastSkillModel) {
            return resetRewardList;
         } else {
            for(ResourceBackModel resourceBackModel : godBeastSkillModel.getCost()) {
               ResourceModel rm = new ResourceModel(resourceBackModel.getType(), resourceBackModel.getId(), resourceBackModel.getBack());
               rm.addResourceToList(resetRewardList);
            }

            return resetRewardList;
         }
      }
   }

   public static List<ResourceModel> getLvResetReward(int level, int exp) {
      List<ResourceModel> resetReward = new ArrayList();
      if (level <= 0) {
         return resetReward;
      } else {
         while(true) {
            --level;
            GodBeastLevelEXPModel godBeastLevelEXPModel = getGodBeastLevelEXPModel(level);
            if (null == godBeastLevelEXPModel) {
               if (exp <= 0) {
                  return resetReward;
               } else {
                  KeyValFun godBeastExpItem = getGodBeastExpItem();
                  int num = exp / godBeastExpItem.getVal();
                  resetReward.add(new ResourceModel(2, godBeastExpItem.getKey(), num));
                  return resetReward;
               }
            }

            exp += godBeastLevelEXPModel.getNeedEXP();
         }
      }
   }

   public static List<ResourceModel> getStarResetReward(int starId, int starUpProgress) {
      if (starId <= 0) {
         return new ArrayList();
      } else {
         GodBeastStarModel godBeastStarModel = getGodBeastStarModel(starId);
         if (null != godBeastStarModel && godBeastStarModel.getPreStarID() > 0) {
            starId = godBeastStarModel.getPreStarID();

            while(true) {
               GodBeastStarModel preGodBeastStarModel = getGodBeastStarModel(starId);
               if (null == preGodBeastStarModel || preGodBeastStarModel.getPreStarID() == preGodBeastStarModel.getUpStarID()) {
                  break;
               }

               starId = preGodBeastStarModel.getPreStarID();
               starUpProgress += preGodBeastStarModel.getProgress();
            }
         }

         return getRewardByStarUpProgress(starUpProgress);
      }
   }

   public static List<ResourceModel> getRewardByStarUpProgress(int starUpProgress) {
      List<ResourceModel> rewardList = new ArrayList();
      if (starUpProgress <= 0) {
         return rewardList;
      } else {
         List<GodBeastStarMaterialModel> modelList = (List)ApplicationContextProvider.getModelPoolEntity("customTypeGodBeastStarMaterial", 1);

         for(GodBeastStarMaterialModel model : (List<GodBeastStarMaterialModel>)modelList.stream().sorted((o1, o2) -> o2.getProgramNum() - o1.getProgramNum()).collect(Collectors.toList())) {
            int programNum = model.getProgramNum();
            int num = starUpProgress / programNum;
            if (num > 0) {
               starUpProgress -= num * programNum;
               rewardList.add(new ResourceModel(2, model.getMaterialId(), num));
            }
         }

         return rewardList;
      }
   }

   public static List<ResourceModel> getAllResetReturnReward(GodBeastItem godBeastItem) {
      List<ResourceModel> allReturnReward = new ArrayList();
      if (null != godBeastItem && godBeastItem.checkReset()) {
         for(ResourceModel rm : getLvResetReward(godBeastItem.level, godBeastItem.exp)) {
            rm.addResourceToList(allReturnReward);
         }

         for(ResourceModel rm : getStarResetReward(godBeastItem.getStarId(), godBeastItem.starUpProgress)) {
            rm.addResourceToList(allReturnReward);
         }

         for(ResourceModel rm : getPassiveSkillResetReward(godBeastItem.passiveSkillId)) {
            rm.addResourceToList(allReturnReward);
         }

         Map<Integer, Integer> attrSkillMap = new HashMap(godBeastItem.attrSkillMap);
         if (attrSkillMap.size() > 0) {
            for(Map.Entry<Integer, Integer> entry : attrSkillMap.entrySet()) {
               Integer skillId = (Integer)entry.getValue();

               for(ResourceModel rm : getAttrSkillResetReward(skillId)) {
                  rm.addResourceToList(allReturnReward);
               }
            }
         }

         return allReturnReward;
      } else {
         return allReturnReward;
      }
   }

   public static GodBeastDecompositionModel getGodBeastDecompositionModel(int godBeastId, int qualificationScore) {
      String key = godBeastId + "_" + qualificationScore;
      GodBeastDecompositionModel godBeastDecompositionModel = (GodBeastDecompositionModel)ApplicationContextProvider.getModelPoolEntity("customGodBeastDecomposition", key);
      return godBeastDecompositionModel;
   }

   public static GodBeastLevelAttrModel getGodBeastLevelAttrModel(int id) {
      GodBeastLevelAttrModel model = (GodBeastLevelAttrModel)ApplicationContextProvider.getModelPoolEntity("GodBeastLevelAttr", id);
      if (id > 0 && null == model) {
         logger.error("GodBeastLevelAttr 配置有误 id:{}", id);
      }

      return model;
   }

   public static List<Integer> getGodBeastUnEffectSys() {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      ArrayList<Integer> godBeastUneffect = configManager.getIntList("godBeastUneffect");
      return godBeastUneffect;
   }

   public static Map<Integer, GodBeastHatchFloorData> getGodBeastPlayerFloorMap() {
      Map<Integer, GodBeastHatchFloorData> godBeastHatchFloorsMap = new HashMap();
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      String godBeastHatchFloors = configManager.getStrByDefault("godBeastHatchFloors", "5|350|5,6|1000|6");
      String[] split = godBeastHatchFloors.split(",");

      for(String quality_num_libIdStr : split) {
         String[] quality_num_libId = quality_num_libIdStr.split("\\|");
         if (quality_num_libId.length >= 3) {
            int quality = Integer.parseInt(quality_num_libId[0]);
            int num = Integer.parseInt(quality_num_libId[1]);
            int libId = Integer.parseInt(quality_num_libId[2]);
            godBeastHatchFloorsMap.put(quality, new GodBeastHatchFloorData(quality, num, libId));
         }
      }

      return godBeastHatchFloorsMap;
   }

   public static int recStarIdWhenGodBeastIdChange(int newGodBeastId, int lastStarId) {
      GodBeastStarModel godBeastStarModel = getGodBeastStarModel(lastStarId);
      if (null != godBeastStarModel && godBeastStarModel.getStar() > 0) {
         GodBeastStarModel newGodBeastStarModel = getGodBeastStarModel(newGodBeastId, godBeastStarModel.getStar());
         return null == newGodBeastStarModel ? getGodBeastModel(newGodBeastId).getUpStarID() : newGodBeastStarModel.getUpStarID();
      } else {
         return getGodBeastModel(newGodBeastId).getUpStarID();
      }
   }

   public static boolean isPlatformOpen() {
      String godBeastAuctionSwitch = ApplicationContextProvider.getConfigString("godBeastAuctionSwitch", "");
      if (StringUtils.isBlank(godBeastAuctionSwitch)) {
         return true;
      } else {
         String[] godBeastAuctionSwitchSplit = godBeastAuctionSwitch.split("\\|");
         if (godBeastAuctionSwitchSplit.length <= 0) {
            return true;
         } else {
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);

            for(String platformStr : godBeastAuctionSwitchSplit) {
               if (Objects.equals(worldMgr.PLATFORM_NAME, platformStr)) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public static GodBeastBuyEggModel getGodBeastBuyEggModel(int id) {
      GodBeastBuyEggModel buyEggModel = (GodBeastBuyEggModel)ApplicationContextProvider.getModelPoolEntity("GodBeastBuyEgg", id);
      return buyEggModel;
   }

   public static GodBeastFloorModel getGodBeastFloorModel(int quality) {
      GodBeastFloorModel godBeastFloorModel = (GodBeastFloorModel)ApplicationContextProvider.getModelPoolEntity("GodBeastFloor", quality);
      return godBeastFloorModel;
   }

   public static Map<Integer, GodBeastFloorModel> getGodBeastFloorModelMap() {
      Map<Integer, GodBeastFloorModel> floorModelMap = ApplicationContextProvider.<Integer, GodBeastFloorModel>getModelPoolMap("GodBeastFloor");
      return floorModelMap;
   }

   public static CommonMsg.GodBeastInfo.Builder recGodBeastInfoBuilder(GodBeastItem godBeastItem) {
      CommonMsg.GodBeastInfo.Builder resp = CommonMsg.GodBeastInfo.newBuilder();
      if (null == godBeastItem) {
         return resp;
      } else {
         resp.setGodBeastId(godBeastItem.id);
         resp.setLevel(godBeastItem.level);
         resp.setStarId(godBeastItem.getStarId());
         resp.setExp(godBeastItem.exp);
         resp.setStarUpProgress(godBeastItem.starUpProgress);
         resp.setPassiveSkillId(godBeastItem.passiveSkillId);
         if (godBeastItem.attrSkillMap.size() > 0) {
            for(Map.Entry<Integer, Integer> entry : godBeastItem.attrSkillMap.entrySet()) {
               Integer slot = (Integer)entry.getKey();
               Integer skillId = (Integer)entry.getValue();
               CommonMsg.MapDataII.Builder attrSkill = CommonMsg.MapDataII.newBuilder();
               attrSkill.setKey(slot);
               attrSkill.setValue(skillId);
               resp.addAttrSkill(attrSkill);
            }
         }

         if (godBeastItem.attrMap.size() > 0) {
            for(Map.Entry<Integer, PropertyModel> entry : godBeastItem.attrMap.entrySet()) {
               PropertyModel pro = (PropertyModel)entry.getValue();
               CommonMsg.PropertyInfo.Builder attr = CommonMsg.PropertyInfo.newBuilder();
               attr.setId(pro.getType());
               attr.setWay(pro.getWay());
               attr.setValue((double)pro.getValue());
               resp.addAttr(attr);
            }
         }

         for(PropertyModel pro : getAllProList(godBeastItem, false)) {
            CommonMsg.PropertyInfo.Builder attr = CommonMsg.PropertyInfo.newBuilder();
            attr.setId(pro.getType());
            attr.setWay(pro.getWay());
            attr.setValue((double)pro.getValue());
            resp.addExtraAttr(attr);
         }

         Map<Integer, List<PropertyModel>> proGroup_proList = extractProList(godBeastItem);
         List<PropertyModel> baseProList = (List)proGroup_proList.get(0);
         if (null != baseProList && baseProList.size() > 0) {
            for(PropertyModel pro : baseProList) {
               CommonMsg.PropertyInfo.Builder attr = CommonMsg.PropertyInfo.newBuilder();
               attr.setId(pro.getType());
               attr.setWay(pro.getWay());
               attr.setValue((double)pro.getValue());
               resp.addBasePro(attr);
            }
         }

         List<PropertyModel> otherProList = (List)proGroup_proList.get(1);
         if (null != otherProList && otherProList.size() > 0) {
            for(PropertyModel pro : otherProList) {
               CommonMsg.PropertyInfo.Builder attr = CommonMsg.PropertyInfo.newBuilder();
               attr.setId(pro.getType());
               attr.setWay(pro.getWay());
               attr.setValue((double)pro.getValue());
               resp.addOtherPro(attr);
            }
         }

         resp.setIsLock(godBeastItem.isLock);
         resp.setIsDevelop(godBeastItem.checkReset());
         resp.setMartRecTime(godBeastItem.martRecTime);
         resp.setScore(calGodBeastScore(godBeastItem));
         if (null != godBeastItem.mainNeiDan) {
            resp.setNeiDanInfo(godBeastItem.mainNeiDan.recNeiDanInfoBuilder());
         }

         return resp;
      }
   }
}
