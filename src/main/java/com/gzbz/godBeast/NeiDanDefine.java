package com.gzbz.godBeast;

import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.godBeast.bean.NeiDanItem;
import com.gzbz.godBeast.bean.NeiDanSkillAndPro;
import com.gzbz.model.AuctionGodBeastNeiDanModel;
import com.gzbz.model.GodBeastNeiDanBaseModel;
import com.gzbz.model.GodBeastNeiDanEntryModel;
import com.gzbz.model.GodBeastNeiDanGroupModel;
import com.gzbz.model.GodBeastNeiDanGroupSkillModel;
import com.gzbz.model.GodBeastNeiDanLevelModel;
import com.gzbz.model.GodBeastNeiDanQualityModel;
import com.gzbz.model.GodBeastNeiDanTypeModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NeiDanDefine {
   private static Logger logger = LoggerFactory.getLogger(NeiDanDefine.class);
   public static final int INIT_LV = 0;
   public static final int MAIN_NEI_DAN = 0;
   public static final int LEFT_NEI_DAN = 1;
   public static final int RIGHT_NEI_DAN = 2;
   public static final int SINGLE_IN_BAG = 0;
   public static final int DRESS_IN_ITEM = 1;
   public static final int DRESS_IN_HERO = 2;
   public static final int COMPOUND = 1;
   public static final int REFINING = 2;
   public static final int UNLOCK = 0;
   public static final int LOCK = 1;
   public static final int NUM_COMPOUND = 3;
   public static final int NUM_REFINING = 2;

   public static GodBeastNeiDanTypeModel getTypeModel(int typeId) {
      GodBeastNeiDanTypeModel godBeastNeiDanTypeModel = (GodBeastNeiDanTypeModel)ApplicationContextProvider.getModelPoolEntity("GodBeastNeiDanType", typeId);
      if (null == godBeastNeiDanTypeModel && typeId > 0) {
         logger.error("GodBeastNeiDanType找不到对应配置 typeId:{}", typeId);
      }

      return godBeastNeiDanTypeModel;
   }

   public static int randomTypeId() {
      Map<Integer, GodBeastNeiDanTypeModel> neiDanTypeModelMap = ApplicationContextProvider.<Integer, GodBeastNeiDanTypeModel>getModelPoolMap("GodBeastNeiDanType");
      List<KeyValFun> keyValFunList = new ArrayList();

      for(Map.Entry<Integer, GodBeastNeiDanTypeModel> entry : neiDanTypeModelMap.entrySet()) {
         Integer typeId = (Integer)entry.getKey();
         GodBeastNeiDanTypeModel value = (GodBeastNeiDanTypeModel)entry.getValue();
         keyValFunList.add(new KeyValFun(typeId, value.getTypeWeight()));
      }

      return GamePlayer.countRate(keyValFunList);
   }

   public static int getMaxQuality() {
      Map<Integer, GodBeastNeiDanQualityModel> allMap = ApplicationContextProvider.<Integer, GodBeastNeiDanQualityModel>getModelPoolMap("GodBeastNeiDanQuality");
      List<Integer> qualityDesc = (List)allMap.keySet().stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
      return (Integer)qualityDesc.get(0);
   }

   public static GodBeastNeiDanQualityModel getQualityModel(int quality) {
      GodBeastNeiDanQualityModel qualityModel = (GodBeastNeiDanQualityModel)ApplicationContextProvider.getModelPoolEntity("GodBeastNeiDanQuality", quality);
      if (null == qualityModel && quality > 0) {
         logger.error("GodBeastNeiDanQuality 配置缺失 quality:{}", quality);
      }

      return qualityModel;
   }

   public static int randomQuality() {
      Map<Integer, GodBeastNeiDanQualityModel> map = ApplicationContextProvider.<Integer, GodBeastNeiDanQualityModel>getModelPoolMap("GodBeastNeiDanQuality");
      List<KeyValFun> keyValFunList = new ArrayList();

      for(Map.Entry<Integer, GodBeastNeiDanQualityModel> entry : map.entrySet()) {
         Integer quality = (Integer)entry.getKey();
         GodBeastNeiDanQualityModel value = (GodBeastNeiDanQualityModel)entry.getValue();
         keyValFunList.add(new KeyValFun(quality, value.getQualityWeight()));
      }

      return GamePlayer.countRate(keyValFunList);
   }

   public static GodBeastNeiDanBaseModel getBaseModel(int id) {
      GodBeastNeiDanBaseModel model = (GodBeastNeiDanBaseModel)ApplicationContextProvider.getModelPoolEntity("GodBeastNeiDanBase", id);
      if (null == model && id > 0) {
         logger.error("GodBeastNeiDanBase 配置缺失 id:{}", id);
      }

      return model;
   }

   public static GodBeastNeiDanBaseModel getBaseModel(int quality, int typeId) {
      ConcurrentHashMap<Integer, GodBeastNeiDanBaseModel> modelMap = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customGodBeastNeiDanBase", quality);
      if (null == modelMap) {
         logger.error("GodBeastNeiDanBase 配置缺失 quality:{}", quality);
         return null;
      } else {
         GodBeastNeiDanBaseModel model = (GodBeastNeiDanBaseModel)modelMap.get(typeId);
         if (null == model) {
            logger.error("GodBeastNeiDanBase 配置缺失 quality:{} typeId:{}", quality, typeId);
         }

         return model;
      }
   }

   public static GodBeastNeiDanEntryModel getEntryModel(int id) {
      GodBeastNeiDanEntryModel entryModel = (GodBeastNeiDanEntryModel)ApplicationContextProvider.getModelPoolEntity("GodBeastNeiDanEntry", id);
      if (null == entryModel && id > 0) {
         logger.error("GodBeastNeiDanEntry 配置缺失 id:{}", id);
      }

      return entryModel;
   }

   public static Map<Integer, GodBeastNeiDanEntryModel> getEntryModelGroup(int entryType) {
      Map<Integer, GodBeastNeiDanEntryModel> map = (Map)ApplicationContextProvider.getModelPoolEntity("customGodBeastNeiDanEntry", entryType);
      if ((null == map || map.isEmpty()) && entryType > 0) {
         logger.error("GodBeastNeiDanEntry 配置确实 attrUpId:{}", entryType);
      }

      return map;
   }

   public static GodBeastNeiDanEntryModel randomEntry(List<Integer> entryIds) {
      if (null != entryIds && !entryIds.isEmpty()) {
         List<KeyValFun> keyValFunList = new ArrayList();

         for(Integer entryId : entryIds) {
            GodBeastNeiDanEntryModel entryModel = getEntryModel(entryId);
            if (null != entryModel) {
               keyValFunList.add(new KeyValFun(entryModel.getId(), entryModel.getWeight()));
            }
         }

         int entryId = GamePlayer.countRate(keyValFunList);
         if (entryId <= 0) {
            return null;
         } else {
            return getEntryModel(entryId);
         }
      } else {
         return null;
      }
   }

   public static NeiDanItem drawNeiDanItem() {
      int quality = randomQuality();
      int typeId = randomTypeId();
      GodBeastNeiDanBaseModel baseModel = getBaseModel(quality, typeId);
      return null == baseModel ? null : drawNeiDanItem(baseModel.getId());
   }

   public static NeiDanItem drawNeiDanItem(int itemId) {
      GodBeastNeiDanBaseModel baseModel = getBaseModel(itemId);
      if (null == baseModel) {
         return null;
      } else {
         GodBeastNeiDanEntryModel entryModel = randomEntry(baseModel.getEntryId());
         if (null == entryModel) {
            return null;
         } else {
            List<PropertyModel> entryPro = new ArrayList();
            if (entryModel.getBaseAtt().size() > 0) {
               entryPro.addAll(entryModel.getBaseAtt());
            }

            return new NeiDanItem(baseModel.getId(), 0, 0, entryModel.getId(), entryPro);
         }
      }
   }

   public static GodBeastNeiDanLevelModel getLevelModel(int lv) {
      GodBeastNeiDanLevelModel levelModel = (GodBeastNeiDanLevelModel)ApplicationContextProvider.getModelPoolEntity("GodBeastNeiDanLevel", lv);
      if (null == levelModel && lv > 0) {
         logger.error("GodBeastNeiDanLevel配置缺失 lv:{}", lv);
      }

      return levelModel;
   }

   public static GodBeastNeiDanGroupSkillModel getSkillModel(int stageSkillId) {
      GodBeastNeiDanGroupSkillModel skillModel = (GodBeastNeiDanGroupSkillModel)ApplicationContextProvider.getModelPoolEntity("GodBeastNeiDanGroupSkill", stageSkillId);
      if (null == skillModel && stageSkillId > 0) {
         logger.error("GodBeastNeiDanGroupSkill配置缺失 id:{}", stageSkillId);
      }

      return skillModel;
   }

   public static Map<String, Long> calAddGodBeastPro(NeiDanItem mainNeiDan) {
      Map<String, Long> proMap = new HashMap();
      if (mainNeiDan == null) {
         return proMap;
      } else {
         GodBeastNeiDanBaseModel baseModel = getBaseModel(mainNeiDan.id);
         if (null == baseModel) {
            return proMap;
         } else {
            GodBeastNeiDanQualityModel qualityModel = getQualityModel(baseModel.getQuality());
            if (null != qualityModel) {
               for(PropertyModel propertyModel : qualityModel.getBaseAtt()) {
                  String proKey = propertyModel.getType() + "_" + propertyModel.getWay();
                  Long beforeVal = (Long)proMap.getOrDefault(proKey, 0L);
                  proMap.put(proKey, beforeVal + propertyModel.getValue());
               }
            }

            GodBeastNeiDanLevelModel levelModel = getLevelModel(mainNeiDan.level);
            if (levelModel != null) {
               for(PropertyModel propertyModel : levelModel.getBaseAttAdd()) {
                  String proKey = propertyModel.getType() + "_" + propertyModel.getWay();
                  Long beforeVal = (Long)proMap.getOrDefault(proKey, 0L);
                  proMap.put(proKey, beforeVal + propertyModel.getValue());
               }
            }

            return proMap;
         }
      }
   }

   public static NeiDanSkillAndPro calAddHeroPro(NeiDanItem mainNeiDan) {
      if (null == mainNeiDan) {
         return null;
      } else {
         GodBeastNeiDanBaseModel mainBaseModel = getBaseModel(mainNeiDan.id);
         if (null == mainBaseModel) {
            return null;
         } else {
            Map<Integer, NeiDanItem> neiDanItemMap = new HashMap();
            neiDanItemMap.put(0, mainNeiDan);

            for(Map.Entry<Integer, NeiDanItem> entry : mainNeiDan.deputyNeiDan.entrySet()) {
               neiDanItemMap.put(entry.getKey(), entry.getValue());
            }

            List<PropertyModel> proList = new ArrayList();
            Map<Integer, Integer> quality_num = new HashMap();

            for(Map.Entry<Integer, NeiDanItem> entry : neiDanItemMap.entrySet()) {
               NeiDanItem neiDanItem = (NeiDanItem)entry.getValue();
               proList.addAll(neiDanItem.entryPro);
               GodBeastNeiDanBaseModel deputyBaseModel = getBaseModel(neiDanItem.id);
               if (null != deputyBaseModel) {
                  for(int i = 1; i <= deputyBaseModel.getQuality(); ++i) {
                     Integer qualityNum = (Integer)quality_num.getOrDefault(i, 0);
                     quality_num.put(i, qualityNum + 1);
                  }
               }
            }

            List<Integer> skillList = new ArrayList();
            GodBeastNeiDanGroupModel groupModel = getGroupModel(mainNeiDan);
            if (groupModel != null) {
               Map<Integer, String> stageGroupConfig = getStageGroupConfig();
               List<Integer> stageDesc = (List)stageGroupConfig.keySet().stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
               int stage = 0;

               for(Integer st : stageDesc) {
                  String quality_needNumStr = (String)stageGroupConfig.get(st);
                  String[] quality_needNum = quality_needNumStr.split("_");
                  int quality = Integer.parseInt(quality_needNum[0]);
                  int needNum = Integer.parseInt(quality_needNum[1]);
                  Integer curNum = (Integer)quality_num.getOrDefault(quality, 0);
                  if (curNum >= needNum) {
                     stage = st;
                     break;
                  }
               }

               if (stage > 0) {
                  for(int i = 1; i <= stage && groupModel.getStageSkill().size() >= i; ++i) {
                     Integer stageSkillId = (Integer)groupModel.getStageSkill().get(i - 1);
                     GodBeastNeiDanGroupSkillModel groupSkillModel = (GodBeastNeiDanGroupSkillModel)ApplicationContextProvider.getModelPoolEntity("GodBeastNeiDanGroupSkill", stageSkillId);
                     if (groupSkillModel != null) {
                        if (groupSkillModel.getSkillType() > 0 && groupSkillModel.getSkillId() > 0) {
                           skillList.add(groupSkillModel.getSkillId());
                        } else if (groupSkillModel.getSkillType() <= 0 && groupSkillModel.getBaseAtt().size() > 0) {
                           proList.addAll(groupSkillModel.getBaseAtt());
                        }
                     }
                  }
               }
            }

            return new NeiDanSkillAndPro(skillList, proList);
         }
      }
   }

   public static GodBeastNeiDanGroupModel getGroupModel(NeiDanItem mainNeiDan) {
      if (null != mainNeiDan && null != mainNeiDan.deputyNeiDan.get(1)) {
         NeiDanItem leftNeiDan = (NeiDanItem)mainNeiDan.deputyNeiDan.get(1);
         GodBeastNeiDanBaseModel mainBaseModel = getBaseModel(mainNeiDan.id);
         GodBeastNeiDanBaseModel leftBaseModel = getBaseModel(leftNeiDan.id);
         if (null != mainBaseModel && null != leftBaseModel) {
            String modelKey = mainBaseModel.getTypeId() + "_" + leftBaseModel.getTypeId();
            List<GodBeastNeiDanGroupModel> groupModelList = (List)ApplicationContextProvider.getModelPoolEntity("customGodBeastNeiDanGroup", modelKey);
            if (null != groupModelList && !groupModelList.isEmpty()) {
               if (groupModelList.size() > 1) {
                  groupModelList = (List)groupModelList.stream().sorted(Comparator.comparingInt(GodBeastNeiDanGroupModel::getId)).collect(Collectors.toList());
               }

               NeiDanItem rightNeiDan = (NeiDanItem)mainNeiDan.deputyNeiDan.get(2);
               if (rightNeiDan == null) {
                  return (GodBeastNeiDanGroupModel)groupModelList.get(0);
               } else {
                  GodBeastNeiDanBaseModel rightBaseModel = getBaseModel(rightNeiDan.id);
                  if (null == rightBaseModel) {
                     return null;
                  } else {
                     for(GodBeastNeiDanGroupModel groupModel : groupModelList) {
                        List<Integer> needTypes = groupModel.getTypes();
                        if (needTypes.size() <= 2) {
                           return groupModel;
                        }

                        Integer needRightType = (Integer)needTypes.get(2);
                        if (needRightType == rightBaseModel.getTypeId() || needRightType == 0) {
                           return groupModel;
                        }
                     }

                     return null;
                  }
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static Map<Integer, String> getStageGroupConfig() {
      String godBeastNeiDanGroup = ApplicationContextProvider.getConfigString("GodBeastNeiDanGroup", "2|4|1,3|5|2,3|6|3");
      String[] groupStrArr = godBeastNeiDanGroup.split(",");
      Map<Integer, String> map = new HashMap();

      for(String groupStr : groupStrArr) {
         String[] num_quality_stage = groupStr.split("\\|");
         if (num_quality_stage.length >= 3) {
            map.put(Integer.parseInt(num_quality_stage[2]), num_quality_stage[1] + "_" + num_quality_stage[0]);
         }
      }

      return map;
   }

   public static Map<Integer, Integer> getLvUpItemId_exp() {
      Map<Integer, Integer> itemId_expMap = new HashMap();
      String itemId_expConfig = ApplicationContextProvider.getConfigString("GodBeastNeiDanLvUpConsume", "");
      String[] itemId_expStrArr = itemId_expConfig.split(",");

      for(String itemId_expStr : itemId_expStrArr) {
         String[] itemId_exp = itemId_expStr.split("\\|");
         if (itemId_exp.length >= 2) {
            int itemId = Integer.parseInt(itemId_exp[0]);
            int exp = Integer.parseInt(itemId_exp[1]);
            itemId_expMap.put(itemId, exp);
         }
      }

      return itemId_expMap;
   }

   public static List<ResourceModel> calExpReturnReward(int exp) {
      List<ResourceModel> returnReward = new ArrayList();
      if (exp <= 0) {
         return returnReward;
      } else {
         String itemId_expConfig = ApplicationContextProvider.getConfigString("GodBeastNeiDanLvUpConsume", "");
         String[] itemId_expStrArr = itemId_expConfig.split(",");
         Map<Integer, Integer> exp_itemId = new HashMap();

         for(String itemId_expStr : itemId_expStrArr) {
            String[] itemId_exp = itemId_expStr.split("\\|");
            if (itemId_exp.length >= 2) {
               int itemId = Integer.parseInt(itemId_exp[0]);
               int itemIdExp = Integer.parseInt(itemId_exp[1]);
               exp_itemId.put(itemIdExp, itemId);
            }
         }

         for(Integer itemExp : (List)exp_itemId.keySet().stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList())) {
            int num = exp / itemExp;
            if (num > 0) {
               Integer itemId = (Integer)exp_itemId.get(itemExp);
               ResourceModel rm = new ResourceModel(2, itemId, num);
               rm.addResourceToList(returnReward);
               exp -= itemExp * num;
            }
         }

         return returnReward;
      }
   }

   public static AuctionGodBeastNeiDanModel getAuctionModel(int quality) {
      AuctionGodBeastNeiDanModel model = (AuctionGodBeastNeiDanModel)ApplicationContextProvider.getModelPoolEntity("auctionGodBeastNeiDan", quality);
      if (null == model && quality > 0) {
         logger.error("AuctionGodBeastNeiDan 配置缺失 quality:{}", quality);
      }

      return model;
   }

   public static ResourceModel getResetCostGold() {
      int godBeastNeiDanReset = ApplicationContextProvider.getConfigInt("GodBeastNeiDanReset", 200);
      return new ResourceModel(1, PlayerDefine.PLAYER_GOLD, godBeastNeiDanReset);
   }
}
