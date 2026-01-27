package com.gzbz.exclusiveWeapon;

import com.gzbz.db.HeroDao;
import com.gzbz.exclusiveWeapon.bean.ExclusiveWeaponItem;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ExclusiveWeaponBaseModel;
import com.gzbz.model.ExclusiveWeaponLevelModel;
import com.gzbz.model.ExclusiveWeaponLibraryModel;
import com.gzbz.model.ExclusiveWeaponNoticeModel;
import com.gzbz.model.ExclusiveWeaponStarLibModel;
import com.gzbz.model.ExclusiveWeaponStarLvModel;
import com.gzbz.model.ExclusiveWeaponUpStarModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EWeaponDefine {
   private static Logger logger = LoggerFactory.getLogger(EWeaponDefine.class);
   public static final int INIT_LV = 0;
   public static final int INIT_STAR_LV = 0;
   public static final int LV_UP_ATT_HP = 0;
   public static final int LV_UP_ATT_ATK = 1;
   public static final int LV_UP_ATT_SPD = 2;
   public static final int LV_UP_ATT_DEF = 3;
   public static final int POS_MAIN = 34;
   public static final int POS_LEFT = 35;
   public static final int POS_RIGHT = 36;
   public static final int MAX_QUALITY = 10;

   public static ExclusiveWeaponBaseModel getExclusiveWeaponBaseModel(int weaponId) {
      ExclusiveWeaponBaseModel exclusiveWeaponBaseModel = (ExclusiveWeaponBaseModel)ApplicationContextProvider.getModelPoolEntity("ExclusiveWeaponBase", weaponId);
      if (null == exclusiveWeaponBaseModel && weaponId > 0) {
         logger.error("ExclusiveWeaponBase 未找到相应配置 weaponId:{}", weaponId);
      }

      return exclusiveWeaponBaseModel;
   }

   public static List<ExclusiveWeaponBaseModel> getExclusiveWeaponBaseModelList(int quality) {
      List<ExclusiveWeaponBaseModel> modelList = (List)ApplicationContextProvider.getModelPoolEntity("customExclusiveWeaponBase", quality);
      if (null == modelList || modelList.isEmpty()) {
         logger.error("ExclusiveWeaponBase 配置缺失 quality:{}", quality);
      }

      return modelList;
   }

   public static ExclusiveWeaponBaseModel getRandomExclusiveWeaponBaseModel(int quality) {
      List<ExclusiveWeaponBaseModel> list = getExclusiveWeaponBaseModelList(quality);
      if (null != list && !list.isEmpty()) {
         List<KeyValFun> keyValFunList = new ArrayList();

         for(ExclusiveWeaponBaseModel baseModel : list) {
            keyValFunList.add(new KeyValFun(baseModel.getWeaponId(), baseModel.getBackWeight()));
         }

         int weaponId = GamePlayer.countRate(keyValFunList);
         return getExclusiveWeaponBaseModel(weaponId);
      } else {
         return null;
      }
   }

   public static KeyValFun getExpItem() {
      String exclusiveWeaponLvUpCost = ApplicationContextProvider.getConfigString("exclusiveWeaponLvUpCost", "1001:100");
      String[] split = exclusiveWeaponLvUpCost.split(":");
      int itemId = Integer.parseInt(split[0]);
      int exp = Integer.parseInt(split[1]);
      return new KeyValFun(itemId, exp);
   }

   public static ExclusiveWeaponLevelModel getExclusiveWeaponLevelModel(int lv) {
      ExclusiveWeaponLevelModel model = (ExclusiveWeaponLevelModel)ApplicationContextProvider.getModelPoolEntity("ExclusiveWeaponLevel", lv);
      if (null == model && lv > 0) {
         logger.error("ExclusiveWeaponLevel 未找到对应配置 lv:{}", lv);
      }

      return model;
   }

   public static ExclusiveWeaponUpStarModel getExclusiveWeaponUpStarModel(int starId) {
      ExclusiveWeaponUpStarModel model = (ExclusiveWeaponUpStarModel)ApplicationContextProvider.getModelPoolEntity("ExclusiveWeaponUpStar", starId);
      if (null == model && starId > 0) {
         logger.error("ExclusiveWeaponUpStar 未找到对应配置 starId:{}", starId);
      }

      return model;
   }

   public static ExclusiveWeaponUpStarModel getExclusiveWeaponUpStarModel(int weaponId, int starLv) {
      if (starLv < 0) {
         logger.error("获取ExclusiveWeaponUpStar失败 starLv:{}", starLv);
         return null;
      } else {
         ExclusiveWeaponBaseModel baseModel = getExclusiveWeaponBaseModel(weaponId);
         if (null == baseModel) {
            logger.error("获取ExclusiveWeaponUpStar失败 weaponId:{}", weaponId);
            return null;
         } else {
            int starId = baseModel.getUpStarId();

            while(starId > 0) {
               ExclusiveWeaponUpStarModel starModel = getExclusiveWeaponUpStarModel(starId);
               if (null == starModel) {
                  break;
               }

               if (starModel.getStarLevel() == starLv) {
                  return starModel;
               }

               starId = starModel.getNext();
               if (starId <= 0) {
                  break;
               }
            }

            logger.error("获取ExclusiveWeaponUpStar失败 baseStarId:{}", starId);
            return null;
         }
      }
   }

   public static ExclusiveWeaponStarLibModel getExclusiveWeaponStarLibModel(int libId) {
      ExclusiveWeaponStarLibModel model = (ExclusiveWeaponStarLibModel)ApplicationContextProvider.getModelPoolEntity("ExclusiveWeaponStarLib", libId);
      if (null == model && libId > 0) {
         logger.error("ExclusiveWeaponStarLib 未找到相应配置 libId:{}", libId);
      }

      return model;
   }

   public static ExclusiveWeaponStarLvModel getExclusiveWeaponStarLvModel(int quality) {
      ExclusiveWeaponStarLvModel model = (ExclusiveWeaponStarLvModel)ApplicationContextProvider.getModelPoolEntity("ExclusiveWeaponStarLv", quality);
      if (null == model && quality > 0) {
         logger.error("ExclusiveWeaponStarLv 未找到对应配置 quality:{}", quality);
      }

      return model;
   }

   public static ExclusiveWeaponLibraryModel getLibraryModel(int weaponId, int starLv) {
      Map<Integer, ExclusiveWeaponLibraryModel> star_model = (Map)ApplicationContextProvider.getModelPoolEntity("customExclusiveWeaponLibrary", weaponId);
      return null == star_model ? null : (ExclusiveWeaponLibraryModel)star_model.get(starLv);
   }

   public static int getLibraryInitStarLv(int weaponId) {
      Map<Integer, ExclusiveWeaponLibraryModel> star_model = (Map)ApplicationContextProvider.getModelPoolEntity("customExclusiveWeaponLibrary", weaponId);
      if (null == star_model) {
         return 0;
      } else {
         int initStarLv = 999;

         for(Integer starLv : star_model.keySet()) {
            if (initStarLv > starLv) {
               initStarLv = starLv;
            }
         }

         return initStarLv;
      }
   }

   public static List<Integer> getSoulSkill() {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      String exclusiveWeaponSoulSkillStr = configManager.getStrByDefault("ExclusiveWeaponSoulSkill", "202,300|203,300|204,300|205,300|206,300|207,300|208,300|209,300");
      List<Integer> soulSkill = new ArrayList();
      if (StringUtils.isNotBlank(exclusiveWeaponSoulSkillStr)) {
         String[] id_powerArr = exclusiveWeaponSoulSkillStr.split("\\|");

         for(String id_powerStr : id_powerArr) {
            String[] id_power = id_powerStr.split(",");
            if (id_power.length >= 1) {
               int id = Integer.parseInt(id_power[0]);
               soulSkill.add(id);
            }
         }
      }

      return soulSkill;
   }

   public static int getSoulSkillSlotNum(int mainWeaponId) {
      ExclusiveWeaponBaseModel exclusiveWeaponBaseModel = getExclusiveWeaponBaseModel(mainWeaponId);
      if (null == exclusiveWeaponBaseModel) {
         return 0;
      } else {
         int weaponQuality = exclusiveWeaponBaseModel.getQuality();
         String exclusiveWeaponSoulQuality = ApplicationContextProvider.getConfigString("ExclusiveWeaponSoulQuality", "5|1,6|3");
         String[] quality_slotNumStrArr = exclusiveWeaponSoulQuality.split(",");
         int maxNum = 0;

         for(String quality_slotNumStr : quality_slotNumStrArr) {
            String[] quality_slotNum = quality_slotNumStr.split("\\|");
            if (quality_slotNum.length >= 2) {
               int quality = Integer.parseInt(quality_slotNum[0]);
               int slotNum = Integer.parseInt(quality_slotNum[1]);
               if (weaponQuality >= quality && maxNum < slotNum) {
                  maxNum = slotNum;
               }
            }
         }

         return maxNum;
      }
   }

   public static List<Integer> getUnlockSoulSkillSlot(Map<Integer, ExclusiveWeaponItem> exclusiveWeaponMap) {
      List<Integer> list = new ArrayList();
      if (null != exclusiveWeaponMap && !exclusiveWeaponMap.isEmpty()) {
         String exclusiveWeaponUnlock = ApplicationContextProvider.getConfigString("ExclusiveWeaponUnlock", "1|1|5,2|1|6,3|2|6");
         String[] slot_num_qualityStrArr = exclusiveWeaponUnlock.split(",");

         for(String slot_num_qualityStr : slot_num_qualityStrArr) {
            String[] slot_num_quality = slot_num_qualityStr.split("\\|");
            if (slot_num_quality.length >= 3) {
               int slot = Integer.parseInt(slot_num_quality[0]);
               int protectNum = Integer.parseInt(slot_num_quality[1]);
               int quality = Integer.parseInt(slot_num_quality[2]);
               if (protectNum <= 0) {
                  list.add(slot);
               } else if (protectNum == 1) {
                  ExclusiveWeaponItem leftWeapon = (ExclusiveWeaponItem)exclusiveWeaponMap.get(35);
                  ExclusiveWeaponItem rightWeapon = (ExclusiveWeaponItem)exclusiveWeaponMap.get(36);
                  if (null != leftWeapon && leftWeapon.recQuality() >= quality || null != rightWeapon && rightWeapon.recQuality() >= quality) {
                     list.add(slot);
                  }
               } else if (protectNum == 2) {
                  ExclusiveWeaponItem leftWeapon = (ExclusiveWeaponItem)exclusiveWeaponMap.get(35);
                  ExclusiveWeaponItem rightWeapon = (ExclusiveWeaponItem)exclusiveWeaponMap.get(36);
                  if (null != leftWeapon && leftWeapon.recQuality() >= quality && null != rightWeapon && rightWeapon.recQuality() >= quality) {
                     list.add(slot);
                  }
               }
            }
         }

         return list;
      } else {
         return list;
      }
   }

   public static List<Integer> getBlessQuality() {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      return configManager.getIntList("ExclusiveWeaponBlessQuality");
   }

   public static ResourceModel getLevelUpCost(int curLevel, int curExp) {
      ExclusiveWeaponLevelModel exclusiveWeaponLevelModel = getExclusiveWeaponLevelModel(curLevel);
      if (null != exclusiveWeaponLevelModel && exclusiveWeaponLevelModel.getExp() > 0) {
         KeyValFun expItem = getExpItem();
         int needExp = exclusiveWeaponLevelModel.getExp() - curExp;
         if (needExp <= 0) {
            logger.error("升级所需经验needEXP:{}", needExp);
            return null;
         } else {
            int exp = expItem.getVal();
            if (exp <= 0) {
               logger.error("exclusiveWeaponLvUpCost 配置有误 exp:{}", exp);
               return null;
            } else {
               int count = needExp / exp;
               if (needExp % exp > 0) {
                  ++count;
               }

               return new ResourceModel(2, expItem.getKey(), count);
            }
         }
      } else {
         return null;
      }
   }

   public static int getExpByCostItem(ResourceModel costItem) {
      if (costItem != null && costItem.getValue() > 0) {
         KeyValFun expItem = getExpItem();
         if (expItem.getKey() == costItem.getId() && costItem.getType() == 2) {
            int exp = expItem.getVal();
            return costItem.getValue() * exp;
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public static List<PropertyModel> getAllDevelopProList(Map<Integer, ExclusiveWeaponItem> exclusiveWeaponMap) {
      List<PropertyModel> proList = new ArrayList();
      if (null != exclusiveWeaponMap && !exclusiveWeaponMap.isEmpty()) {
         for(Map.Entry<Integer, ExclusiveWeaponItem> entry : exclusiveWeaponMap.entrySet()) {
            Integer pos = (Integer)entry.getKey();
            ExclusiveWeaponItem weaponItem = (ExclusiveWeaponItem)entry.getValue();
            List<PropertyModel> developPro = getDevelopPro(pos, weaponItem);
            proList.addAll(developPro);
         }

         return proList;
      } else {
         return proList;
      }
   }

   public static List<PropertyModel> getDevelopPro(int pos, ExclusiveWeaponItem weaponItem) {
      List<PropertyModel> proList = new ArrayList();
      if ((pos == 34 || pos == 35 || pos == 36) && weaponItem != null) {
         ExclusiveWeaponBaseModel baseModel = getExclusiveWeaponBaseModel(weaponItem.id);
         ExclusiveWeaponUpStarModel starModel = getExclusiveWeaponUpStarModel(weaponItem.getStarId());
         Map<String, Long> ewPro = new HashMap();
         if (null != baseModel) {
            for(PropertyModel p : baseModel.getBaseAtt()) {
               String key = p.getType() + "_" + p.getWay();
               Long preAdd = (Long)ewPro.getOrDefault(key, 0L);
               ewPro.put(key, preAdd + p.getValue());
            }

            if (weaponItem.level > 0) {
               int lv = weaponItem.level;
               if (baseModel.getPerGradeAtt().size() > 0) {
                  Integer hp = (Integer)baseModel.getPerGradeAtt().get(0);
                  String key = "1_0";
                  Long preAdd = (Long)ewPro.getOrDefault(key, 0L);
                  ewPro.put(key, preAdd + (long)(hp * lv));
               }

               if (baseModel.getPerGradeAtt().size() > 1) {
                  Integer atk = (Integer)baseModel.getPerGradeAtt().get(1);
                  String key = "2_0";
                  Long preAdd = (Long)ewPro.getOrDefault(key, 0L);
                  ewPro.put(key, preAdd + (long)(atk * lv));
               }

               if (baseModel.getPerGradeAtt().size() > 2) {
                  Integer speed = (Integer)baseModel.getPerGradeAtt().get(2);
                  String key = "4_0";
                  Long preAdd = (Long)ewPro.getOrDefault(key, 0L);
                  ewPro.put(key, preAdd + (long)(speed * lv));
               }

               if (baseModel.getPerGradeAtt().size() > 3) {
                  Integer def = (Integer)baseModel.getPerGradeAtt().get(3);
                  String key = "3_0";
                  Long preAdd = (Long)ewPro.getOrDefault(key, 0L);
                  ewPro.put(key, preAdd + (long)(def * lv));
               }
            }
         }

         if (null != starModel) {
            for(PropertyModel p : starModel.getExtraAtt()) {
               String key = p.getType() + "_" + p.getWay();
               Long preAdd = (Long)ewPro.getOrDefault(key, 0L);
               ewPro.put(key, preAdd + p.getValue());
            }

            proList.addAll(starModel.getStarAtt());
         }

         long tenThou = 10000L;
         int hp = starModel == null ? 0 : starModel.getHpAward();
         int atk = starModel == null ? 0 : starModel.getAtkAward();
         int def = starModel == null ? 0 : starModel.getDefAward();
         int spd = starModel == null ? 0 : starModel.getSpdAward();

         for(Map.Entry<String, Long> ewProEntry : ewPro.entrySet()) {
            String[] type_wayArr = ((String)ewProEntry.getKey()).split("_");
            int type = Integer.parseInt(type_wayArr[0]);
            int way = Integer.parseInt(type_wayArr[1]);
            Long value = (Long)ewProEntry.getValue();
            int calHeroTypeVal = 0;
            if (type == 1) {
               calHeroTypeVal = hp;
            } else if (type == 2) {
               calHeroTypeVal = atk;
            } else if (type == 4) {
               calHeroTypeVal = spd;
            } else if (type == 3) {
               calHeroTypeVal = def;
            }

            long heroAddVal = value * (tenThou + (long)calHeroTypeVal) / tenThou;
            PropertyModel pro = new PropertyModel(type, way, heroAddVal);
            proList.add(pro);
         }

         if (pos == 34) {
            return proList;
         } else {
            int percent = ApplicationContextProvider.getConfigInt("ExclusiveWeaponBlessSlots", 50);
            List<PropertyModel> mergeProList = HeroDao.mergePropertys(proList);

            for(PropertyModel pro : mergeProList) {
               long value = pro.getValue() * (long)percent / 100L;
               pro.setValue(value);
            }

            return mergeProList;
         }
      } else {
         return proList;
      }
   }

   public static List<PropertyModel> getLibPropertyList(Map<Integer, Integer> weaponLib) {
      List<PropertyModel> libProList = new ArrayList();
      if (null != weaponLib && !weaponLib.isEmpty()) {
         for(Map.Entry<Integer, Integer> entry : weaponLib.entrySet()) {
            Integer weaponId = (Integer)entry.getKey();
            Integer starLv = (Integer)entry.getValue();
            ExclusiveWeaponLibraryModel libraryModel = getLibraryModel(weaponId, starLv);
            if (null != libraryModel) {
               libProList.addAll(libraryModel.getExtraAtt());
               libProList.addAll(libraryModel.getSpecialAtt());
            }
         }

         return libProList;
      } else {
         return libProList;
      }
   }

   public static List<Integer> getSkillList(int heroId, int mainWeaponId, int weaponStarId, Map<Integer, Integer> soulSkill) {
      List<Integer> skillList = new ArrayList();
      ExclusiveWeaponBaseModel baseModel = getExclusiveWeaponBaseModel(mainWeaponId);
      if (null != baseModel && baseModel.getHeroId() > 0 && baseModel.getHeroId() == heroId) {
         ExclusiveWeaponUpStarModel starModel = getExclusiveWeaponUpStarModel(weaponStarId);
         if (null != starModel && starModel.getNewSkill() > 0) {
            skillList.add(starModel.getNewSkill());
         }
      }

      if (mainWeaponId > 0 && baseModel != null) {
         for(Map.Entry<Integer, Integer> entry : soulSkill.entrySet()) {
            Integer skillId = (Integer)entry.getValue();
            skillList.add(skillId);
         }
      }

      return skillList;
   }

   public static List<Integer> getUnEffectSys() {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      return configManager.getIntList("ExclusiveWeapontUneffect");
   }

   public static ExclusiveWeaponNoticeModel getNoticeModel(int id) {
      return (ExclusiveWeaponNoticeModel)ApplicationContextProvider.getModelPoolEntity("ExclusiveWeaponNotice", id);
   }

   public static List<CommonMsg.ExclusiveWeaponInfo> toBuildExclusiveWeaponInfoList(Map<Integer, ExclusiveWeaponItem> exclusiveWeaponMap, Map<Integer, Integer> soulSkill) {
      List<CommonMsg.ExclusiveWeaponInfo> weaponInfoList = new ArrayList();
      if (null != exclusiveWeaponMap && exclusiveWeaponMap.size() > 0) {
         for(Map.Entry<Integer, ExclusiveWeaponItem> exclusiveWeaponItemEntry : exclusiveWeaponMap.entrySet()) {
            Integer pos = (Integer)exclusiveWeaponItemEntry.getKey();
            ExclusiveWeaponItem weaponItem = (ExclusiveWeaponItem)exclusiveWeaponItemEntry.getValue();
            CommonMsg.ExclusiveWeaponInfo.Builder weaponInfo = CommonMsg.ExclusiveWeaponInfo.newBuilder();
            weaponInfo.setPos(CommonMsg.WearPosition.forNumber(pos));
            if (pos == 34) {
               weaponInfo.setExclusiveWeaponData(toBuildExclusiveWeaponData(weaponItem, soulSkill));
            } else {
               weaponInfo.setExclusiveWeaponData(toBuildExclusiveWeaponData(weaponItem, (Map)null));
            }

            weaponInfoList.add(weaponInfo.build());
         }
      }

      return weaponInfoList;
   }

   public static CommonMsg.ExclusiveWeaponData.Builder toBuildExclusiveWeaponData(ExclusiveWeaponItem weaponItem, Map<Integer, Integer> soulSkill) {
      CommonMsg.ExclusiveWeaponData.Builder builder = CommonMsg.ExclusiveWeaponData.newBuilder();
      builder.setWeaponId(weaponItem.id);
      builder.setLevel(weaponItem.level);
      builder.setStarId(weaponItem.getStarId());
      builder.setExp(weaponItem.exp);
      builder.setIsLock(weaponItem.isLock);
      if (null != soulSkill && soulSkill.size() > 0) {
         for(Map.Entry<Integer, Integer> entry : soulSkill.entrySet()) {
            Integer pos = (Integer)entry.getKey();
            Integer skillId = (Integer)entry.getValue();
            CommonMsg.MapDataII.Builder mapDataII = CommonMsg.MapDataII.newBuilder();
            mapDataII.setKey(pos);
            mapDataII.setValue(skillId);
            builder.addSoulSkill(mapDataII);
         }
      }

      return builder;
   }
}
