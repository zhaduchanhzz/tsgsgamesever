package com.gzbz.dragonVein;

import com.gzbz.db.bean.DragonSoulData;
import com.gzbz.db.bean.HeroTypeAttrData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.DragonVeinAttrScoreModel;
import com.gzbz.model.DragonVeinAttriGroupAModel;
import com.gzbz.model.DragonVeinAttriGroupBModel;
import com.gzbz.model.DragonVeinAttriGroupSkillModel;
import com.gzbz.model.DragonVeinDecomposeModel;
import com.gzbz.model.DragonVeinLevelModel;
import com.gzbz.model.DragonVeinPositionLevelModel;
import com.gzbz.model.DragonVeinPositionModel;
import com.gzbz.model.DragonVeinQualityModel;
import com.gzbz.model.fun.CorrectWeightModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DragonVeinDefine {
   private static Logger logger = LoggerFactory.getLogger(DragonVeinDefine.class);
   public static final int VEIN_INIT_LV = 1;
   public static final int SOUL_INIT_LV = 1;
   public static final int DRAGON_SOUL_INIT = 1;
   public static final int GROUP_A = 1;
   public static final int GROUP_B = 2;
   public static final int INFINITY = -1;
   public static final int POS_TYPE_NORMAL = 1;
   public static final int POS_TYPE_SPECIAL = 2;

   public static int getLotteryItemId() {
      return ApplicationContextProvider.getConfigInt("DragonVeinLongMai", 2760);
   }

   public static int getLotteryAddExp() {
      return ApplicationContextProvider.getConfigInt("DragonVeinExperience", 1);
   }

   public static int getUpLongHunItemId() {
      return ApplicationContextProvider.getConfigInt("DragonVeinLongHun", 2761);
   }

   public static int getUpLongHunAddVal() {
      return ApplicationContextProvider.getConfigInt("DragonVeinQualityNum", 1);
   }

   public static List<Integer> getAttrUnlockLv() {
      String dragonVeinAttrNum = ApplicationContextProvider.getConfigString("DragonVeinAttriNum", "");
      String[] split = dragonVeinAttrNum.split("\\|");
      List<Integer> list = new ArrayList();

      for(String s : split) {
         list.add(Integer.parseInt(s));
      }

      return list;
   }

   public static int recAttrGroupExcelType(int attrGroup) {
      String dragonVeinAttrGroup = ApplicationContextProvider.getConfigString("DragonVeinAttrGroup", "1-13,14-26");
      String[] star_endStrArr = dragonVeinAttrGroup.split(",");

      for(int i = 0; i < star_endStrArr.length; ++i) {
         String[] star_end = star_endStrArr[i].split("-");
         if (star_end.length >= 2) {
            int star = Integer.parseInt(star_end[0]);
            int end = Integer.parseInt(star_end[1]);
            if (attrGroup >= star && attrGroup <= end) {
               return i + 1;
            }
         }
      }

      return 0;
   }

   public static DragonVeinPositionModel getPositionModel(int id) {
      DragonVeinPositionModel model = (DragonVeinPositionModel)ApplicationContextProvider.getModelPoolEntity("DragonVeinPosition", id);
      if (null == model && id > 0) {
         logger.error("DragonVeinPosition配置缺失,id:{}", id);
      }

      return model;
   }

   public static DragonVeinLevelModel getVeinLevelModel(int id) {
      DragonVeinLevelModel model = (DragonVeinLevelModel)ApplicationContextProvider.getModelPoolEntity("DragonVeinLevel", id);
      return model;
   }

   public static DragonVeinPositionLevelModel getPositionLevelModel(int id) {
      DragonVeinPositionLevelModel model = (DragonVeinPositionLevelModel)ApplicationContextProvider.getModelPoolEntity("DragonVeinPositionLevel", id);
      if (null == model && id > 0) {
         logger.error("DragonVeinPositionLevel配置缺失,id:{}", id);
      }

      return model;
   }

   public static DragonVeinAttriGroupAModel getAttrGroupAModel(int id) {
      DragonVeinAttriGroupAModel groupAModel = (DragonVeinAttriGroupAModel)ApplicationContextProvider.getModelPoolEntity("DragonVeinAttriGroupA", id);
      if (null == groupAModel && id > 0) {
         logger.error("DragonVeinAttriGroupA配置缺失,id:{}", id);
      }

      return groupAModel;
   }

   public static List<DragonVeinAttriGroupAModel> getAttrGroupAList(int group, int soulLv) {
      List<DragonVeinAttriGroupAModel> list = new ArrayList();
      List<DragonVeinAttriGroupAModel> groupAModelList = (List)ApplicationContextProvider.getModelPoolEntity("customDragonVeinAttriGroupA", group);
      if (null == groupAModelList) {
         return list;
      } else {
         for(DragonVeinAttriGroupAModel groupAModel : groupAModelList) {
            if (soulLv >= groupAModel.getLevelDown() && soulLv <= groupAModel.getLevelUP()) {
               list.add(groupAModel);
            }
         }

         return list;
      }
   }

   public static List<DragonVeinAttriGroupBModel> getAttrGroupBList(int group, int soulQuality) {
      List<DragonVeinAttriGroupBModel> list = new ArrayList();
      List<DragonVeinAttriGroupBModel> groupBModelList = (List)ApplicationContextProvider.getModelPoolEntity("customDragonVeinAttriGroupB", group);
      if (null == groupBModelList) {
         return list;
      } else {
         for(DragonVeinAttriGroupBModel groupBModel : groupBModelList) {
            if (soulQuality == groupBModel.getQuality()) {
               list.add(groupBModel);
            }
         }

         return list;
      }
   }

   public static DragonVeinAttriGroupBModel getAttrGroupBModel(int id) {
      DragonVeinAttriGroupBModel groupBModel = (DragonVeinAttriGroupBModel)ApplicationContextProvider.getModelPoolEntity("DragonVeinAttriGroupB", id);
      if (null == groupBModel && id > 0) {
         logger.error("DragonVeinAttriGroupB配置缺失,id:{}", id);
      }

      return groupBModel;
   }

   public static DragonVeinQualityModel getQualityModel(int id) {
      DragonVeinQualityModel qualityModel = (DragonVeinQualityModel)ApplicationContextProvider.getModelPoolEntity("DragonVeinQuality", id);
      if (null == qualityModel && id > 0) {
         logger.error("DragonVeinQuality配置缺失,id:{}", id);
      }

      return qualityModel;
   }

   public static DragonVeinAttriGroupSkillModel getAttrGroupSkillModel(int id) {
      DragonVeinAttriGroupSkillModel model = (DragonVeinAttriGroupSkillModel)ApplicationContextProvider.getModelPoolEntity("DragonVeinAttriGroupSkill", id);
      if (null == model && id > 0) {
         logger.error("DragonVeinAttriGroupSkill配置缺失,id:{}", id);
      }

      return model;
   }

   public static List<Integer> calSkillIds(Map<Integer, DragonSoulData> posSoul) {
      List<Integer> skillIdList = new ArrayList();
      Map<Integer, Integer> groupId_num = new HashMap();

      for(Map.Entry<Integer, DragonSoulData> entry : posSoul.entrySet()) {
         DragonSoulData dragonSoulData = (DragonSoulData)entry.getValue();
         int groupSkillId = dragonSoulData.getGroupSkillId();
         if (groupSkillId > 0) {
            Integer curNum = (Integer)groupId_num.getOrDefault(groupSkillId, 0);
            groupId_num.put(groupSkillId, curNum + 1);
         }
      }

      if (groupId_num.isEmpty()) {
         return skillIdList;
      } else {
         for(Map.Entry<Integer, Integer> entry : groupId_num.entrySet()) {
            Integer groupId = (Integer)entry.getKey();
            if (groupId > 0) {
               Integer num = (Integer)entry.getValue();
               DragonVeinAttriGroupSkillModel attrGroupSkillModel = getAttrGroupSkillModel(groupId);
               List<Integer> modelSkill = attrGroupSkillModel.getSkill();
               if (!modelSkill.isEmpty()) {
                  num = Math.min(num, modelSkill.size());
                  Integer skillId = (Integer)modelSkill.get(num - 1);
                  skillIdList.add(skillId);
               }
            }
         }

         return skillIdList;
      }
   }

   public static List<Integer> getUnEffectSys() {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      return configManager.getIntList("DragonVeinUneffect");
   }

   public static DragonVeinAttrScoreModel getAttrScoreModel(int attrId, int attrWay) {
      String key = attrId + "_" + attrWay;
      DragonVeinAttrScoreModel model = (DragonVeinAttrScoreModel)ApplicationContextProvider.getModelPoolEntity("customDragonVeinAttrScore", key);
      if (null == model) {
         logger.error("DragonVeinAttrScore配置缺失,attrId:{},attrWay:{}", attrId, attrWay);
      }

      return model;
   }

   public static long calAttrScore(int attrId, int attrWay, long attrVal) {
      DragonVeinAttrScoreModel s = getAttrScoreModel(attrId, attrWay);
      if (null == s) {
         return 0L;
      } else {
         double score = Double.parseDouble(s.getScore());
         double doubleResult = (double)attrVal * score + (double)(s.getOffsetType() * s.getOffsetValue());
         return (long)doubleResult;
      }
   }

   public static DragonVeinPositionModel drawPosition(int dragonVeinLv) {
      Map<Integer, DragonVeinPositionModel> allMap = ApplicationContextProvider.<Integer, DragonVeinPositionModel>getModelPoolMap("DragonVeinPosition");
      List<KeyValFun> keyValFunList = new ArrayList();

      for(Map.Entry<Integer, DragonVeinPositionModel> entry : allMap.entrySet()) {
         DragonVeinPositionModel value = (DragonVeinPositionModel)entry.getValue();
         if (dragonVeinLv >= value.getNeedLevel()) {
            keyValFunList.add(new KeyValFun(value.getId(), value.getWeight()));
         }
      }

      int drawId = GamePlayer.countRate(keyValFunList);
      return getPositionModel(drawId);
   }

   public static int drawSoulLv(int dragonVeinLv) {
      Map<Integer, DragonVeinPositionLevelModel> allMap = ApplicationContextProvider.<Integer, DragonVeinPositionLevelModel>getModelPoolMap("DragonVeinPositionLevel");

      for(Map.Entry<Integer, DragonVeinPositionLevelModel> entry : allMap.entrySet()) {
         DragonVeinPositionLevelModel model = (DragonVeinPositionLevelModel)entry.getValue();
         if (dragonVeinLv >= model.getLevelDown() && dragonVeinLv <= model.getLevelUP()) {
            List<CorrectWeightModel> correctWeight = model.getLevel();
            List<KeyValFun> keyValFunList = new ArrayList();

            for(CorrectWeightModel correctWeightModel : correctWeight) {
               keyValFunList.add(new KeyValFun(correctWeightModel.getCorrect(), correctWeightModel.getWeight()));
            }

            int correct = GamePlayer.countRate(keyValFunList);
            int soulLv = dragonVeinLv + correct;
            if (soulLv < 1) {
               soulLv = 1;
            }

            return soulLv;
         }
      }

      logger.error("DragonVeinPositionLevel未配置龙脉等级为:{}的数据", dragonVeinLv);
      return 1;
   }

   public static int drawQuality(int dragonSoulVal) {
      Map<Integer, DragonVeinQualityModel> qualityModelMap = ApplicationContextProvider.<Integer, DragonVeinQualityModel>getModelPoolMap("DragonVeinQuality");

      for(Map.Entry<Integer, DragonVeinQualityModel> entry : qualityModelMap.entrySet()) {
         DragonVeinQualityModel model = (DragonVeinQualityModel)entry.getValue();
         if (dragonSoulVal >= model.getSoulDown() && (dragonSoulVal <= model.getSoulUp() || model.getSoulUp() == -1)) {
            List<KeyValFun> keyValFunList = new ArrayList();

            for(int i = 0; i < model.getWeight().size(); ++i) {
               Integer weight = (Integer)model.getWeight().get(i);
               int changeWeight = 0;
               if (model.getChange().size() > i) {
                  changeWeight = (Integer)model.getChange().get(i);
               }

               int realWeight = weight + changeWeight * (dragonSoulVal - model.getSoulDown());
               if (realWeight > 0) {
                  keyValFunList.add(new KeyValFun(i + 1, realWeight));
               }
            }

            if (keyValFunList.isEmpty()) {
               logger.error("DragonVeinQuality配置缺失,龙魂值:{}", dragonSoulVal);
               return 0;
            } else {
               return GamePlayer.countRate(keyValFunList);
            }
         }
      }

      logger.error("DragonVeinQuality配置缺失,龙魂值:{}", dragonSoulVal);
      return 0;
   }

   public static List<HeroTypeAttrData> drawSoulAttr(int position, int soulLv, int soulQuality) {
      List<HeroTypeAttrData> attrList = new ArrayList();
      DragonVeinPositionModel positionModel = getPositionModel(position);
      if (null == positionModel) {
         return attrList;
      } else {
         List<Integer> attrUnlockLv = getAttrUnlockLv();
         if (attrUnlockLv.isEmpty()) {
            return attrList;
         } else {
            List<Integer> hasAttrGroupList = new ArrayList();
            String[] attrGroupStrArr = positionModel.getAttrGroup().split(",");

            for(int i = 0; i < attrGroupStrArr.length && attrUnlockLv.size() - 1 >= i; ++i) {
               Integer needSoulLv = (Integer)attrUnlockLv.get(i);
               if (soulLv >= needSoulLv) {
                  String attrGroupStr = attrGroupStrArr[i];
                  String[] attrGroupArr = attrGroupStr.split("\\|");
                  int attrGroup = 0;
                  if (attrGroupArr.length > 1) {
                     for(String agStr : attrGroupArr) {
                        int ag = Integer.parseInt(agStr);
                        if (!hasAttrGroupList.contains(ag)) {
                           attrGroup = ag;
                           break;
                        }
                     }
                  } else {
                     attrGroup = Integer.parseInt(attrGroupArr[0]);
                  }

                  if (attrGroup > 0) {
                     hasAttrGroupList.add(attrGroup);
                  }
               }
            }

            Map<Integer, Set<Integer>> type_ways = new HashMap();

            for(Integer hasAttrGroup : hasAttrGroupList) {
               int groupAOrB = recAttrGroupExcelType(hasAttrGroup);
               if (groupAOrB == 1) {
                  List<DragonVeinAttriGroupAModel> attrGroupAList = getAttrGroupAList(hasAttrGroup, soulLv);
                  if (!attrGroupAList.isEmpty()) {
                     List<KeyValFun> keyValFunList = new ArrayList();

                     for(DragonVeinAttriGroupAModel groupAModel : attrGroupAList) {
                        Set<Integer> ways = (Set)type_ways.getOrDefault(groupAModel.getAddProsType(), new HashSet());
                        if (!ways.contains(groupAModel.getAddProsWay())) {
                           keyValFunList.add(new KeyValFun(groupAModel.getId(), groupAModel.getWeight()));
                        }
                     }

                     int id = GamePlayer.countRate(keyValFunList);
                     DragonVeinAttriGroupAModel attrGroupAModel = getAttrGroupAModel(id);
                     int waveNum = RandomUtil.randInt(attrGroupAModel.getWaveDown(), attrGroupAModel.getWaveUp() + 1);
                     int addAttrVal = (attrGroupAModel.getAddProsNum() + attrGroupAModel.getAddProsFactor() * soulLv) * waveNum / 10000;
                     HeroTypeAttrData heroTypeAttrData = new HeroTypeAttrData(attrGroupAModel.getAddProsHeroType(), attrGroupAModel.getAddProsType(), attrGroupAModel.getAddProsWay(), addAttrVal);
                     attrList.add(heroTypeAttrData);
                     ((Set)type_ways.computeIfAbsent(attrGroupAModel.getAddProsType(), (v) -> new HashSet())).add(attrGroupAModel.getAddProsWay());
                  }
               } else if (groupAOrB == 2) {
                  List<DragonVeinAttriGroupBModel> attrGroupBList = getAttrGroupBList(hasAttrGroup, soulQuality);
                  if (!attrGroupBList.isEmpty()) {
                     List<KeyValFun> keyValFunList = new ArrayList();

                     for(DragonVeinAttriGroupBModel groupBModel : attrGroupBList) {
                        Set<Integer> ways = (Set)type_ways.getOrDefault(groupBModel.getAddProsType(), new HashSet());
                        if (!ways.contains(groupBModel.getAddProsWay())) {
                           keyValFunList.add(new KeyValFun(groupBModel.getId(), groupBModel.getWeight()));
                        }
                     }

                     int id = GamePlayer.countRate(keyValFunList);
                     DragonVeinAttriGroupBModel attrGroupBModel = getAttrGroupBModel(id);
                     int waveNum = RandomUtil.randInt(attrGroupBModel.getWaveDown(), attrGroupBModel.getWaveUp() + 1);
                     int addAttrVal = attrGroupBModel.getAddProsNum() * waveNum / 10000;
                     HeroTypeAttrData heroTypeAttrData = new HeroTypeAttrData(attrGroupBModel.getAddProsHeroType(), attrGroupBModel.getAddProsType(), attrGroupBModel.getAddProsWay(), addAttrVal);
                     attrList.add(heroTypeAttrData);
                     ((Set)type_ways.computeIfAbsent(attrGroupBModel.getAddProsType(), (v) -> new HashSet())).add(attrGroupBModel.getAddProsWay());
                  }
               }
            }

            return attrList;
         }
      }
   }

   public static int drawGroupSkillId() {
      Map<Integer, DragonVeinAttriGroupSkillModel> skillModelMap = ApplicationContextProvider.<Integer, DragonVeinAttriGroupSkillModel>getModelPoolMap("DragonVeinAttriGroupSkill");
      List<KeyValFun> keyValFunList = new ArrayList();

      for(Map.Entry<Integer, DragonVeinAttriGroupSkillModel> entry : skillModelMap.entrySet()) {
         DragonVeinAttriGroupSkillModel model = (DragonVeinAttriGroupSkillModel)entry.getValue();
         keyValFunList.add(new KeyValFun(model.getId(), model.getWeight()));
      }

      if (keyValFunList.isEmpty()) {
         logger.error("DragonVeinAttriGroupSkill配置缺失");
         return 0;
      } else {
         return GamePlayer.countRate(keyValFunList);
      }
   }

   public static DragonSoulData lotteryDragonSoulData(int dragonVeinLv, int dragonSoulVal) {
      DragonVeinPositionModel model = drawPosition(dragonVeinLv);
      int soulLv = drawSoulLv(dragonVeinLv);
      int quality = drawQuality(dragonSoulVal);
      List<HeroTypeAttrData> heroTypeAttrDataList = drawSoulAttr(model.getId(), soulLv, quality);
      int groupSkillId = 0;
      if (model.getType() == 2) {
         groupSkillId = drawGroupSkillId();
      }

      return new DragonSoulData(model.getId(), soulLv, quality, heroTypeAttrDataList, groupSkillId);
   }

   public static DragonVeinDecomposeModel getDecomposeModel(int soulLv) {
      Map<Integer, DragonVeinDecomposeModel> modelMap = ApplicationContextProvider.<Integer, DragonVeinDecomposeModel>getModelPoolMap("DragonVeinDecompose");

      for(Map.Entry<Integer, DragonVeinDecomposeModel> entry : modelMap.entrySet()) {
         DragonVeinDecomposeModel model = (DragonVeinDecomposeModel)entry.getValue();
         if (soulLv >= model.getLevelDown() && soulLv <= model.getLevelUP()) {
            return model;
         }
      }

      logger.error("DragonVeinDecompose配置缺失,soulLv:{}", soulLv);
      return null;
   }

   public static int getDragonVeinMaxExp() {
      return ApplicationContextProvider.getConfigInt("DragonVeinMaxExp", 0);
   }
}
