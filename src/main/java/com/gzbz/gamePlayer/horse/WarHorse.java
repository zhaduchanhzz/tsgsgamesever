package com.gzbz.gamePlayer.horse;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.ItemModel;
import com.gzbz.model.WarHorseBaseModel;
import com.gzbz.model.WarHorseExclusiveModel;
import com.gzbz.model.WarHorseSkillModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import misc.RandomUtil;
import org.springframework.util.StringUtils;

public class WarHorse extends ItemBase {
   public static final String SPLIT_WAR_HORSE = "warhorse";
   public int lv = 1;
   public int exp;
   public int artificeVal;
   public int skinId;
   public List<Integer> upSkills = new ArrayList();
   public boolean isLock = false;
   public int lockSkill;
   public boolean isUnlock;
   public List<Integer> lockSkilIndex = new ArrayList();
   public boolean isAwaken = false;
   public List<Integer> awakenIndex = new ArrayList();

   public WarHorse() {
   }

   public WarHorse(int code, WarHorse warHorse) {
      this.code = code;
      this.id = warHorse.id;
      this.num = 1;
      this.lv = warHorse.lv;
      this.exp = warHorse.exp;
      this.artificeVal = warHorse.artificeVal;
      this.skinId = warHorse.skinId;
      this.upSkills.addAll(warHorse.upSkills);
      this.isLock = warHorse.isLock;
      this.lockSkill = warHorse.lockSkill;
      this.isAwaken = warHorse.isAwaken;
      this.awakenIndex.addAll(warHorse.awakenIndex);
      this.updateMainSkillUnlock();
   }

   public void init(int code, int num, ItemModel itemModel, GamePlayer gamePlayer) {
      super.init(code, num, itemModel, gamePlayer);
      this.lv = 1;
      this.exp = 0;
      this.artificeVal = 0;
      this.skinId = 0;
      WarHorseBaseModel baseModel = (WarHorseBaseModel)ApplicationContextProvider.getModelPoolEntity("warHorseBase", itemModel.getId());
      if (baseModel != null) {
         Map<Integer, WarHorseExclusiveModel> modelMap = ApplicationContextProvider.<Integer, WarHorseExclusiveModel>getModelPoolMap("warHorseExclusive");
         if (modelMap.containsKey(itemModel.getId())) {
            WarHorseExclusiveModel exclusiveModel = (WarHorseExclusiveModel)modelMap.get(itemModel.getId());

            for(Integer skillId : exclusiveModel.getHorseSkillId()) {
               this.upSkills.add(skillId);
            }
         } else {
            int skillNum = baseModel.getSkillNum();
            if (skillNum > 0) {
               List<WarHorseSkillModel> modelList = new ArrayList();

               for(int i = 0; i < skillNum; ++i) {
                  List<WarHorseSkillModel> randmoList = new ArrayList();
                  int totalWeight = 0;
                  Map<Integer, WarHorseSkillModel> skillMap = ApplicationContextProvider.<Integer, WarHorseSkillModel>getModelPoolMap("warHorseSkill");
                  if (skillMap != null) {
                     Iterator r = skillMap.entrySet().iterator();

                     label96:
                     while(true) {
                        WarHorseSkillModel model;
                        while(true) {
                           if (!r.hasNext()) {
                              break label96;
                           }

                           Map.Entry<Integer, WarHorseSkillModel> entry = (Map.Entry)r.next();
                           model = (WarHorseSkillModel)entry.getValue();
                           if (model.getType() >= baseModel.getSkillMinType() && model.getType() <= baseModel.getSkillMaxType() && model.getQuality() >= baseModel.getSkillMinQuality() && model.getQuality() <= baseModel.getSkillMaxQuality() && model.getLv() >= baseModel.getSkillMinLv() && model.getLv() <= baseModel.getSkillMaxLv()) {
                              if (modelList.isEmpty()) {
                                 break;
                              }

                              boolean isHaveSame = false;

                              for(WarHorseSkillModel warHorseSkillModel : modelList) {
                                 if (model.getType() == warHorseSkillModel.getType() && model.getQuality() == warHorseSkillModel.getQuality()) {
                                    isHaveSame = true;
                                    break;
                                 }
                              }

                              if (!isHaveSame) {
                                 break;
                              }
                           }
                        }

                        randmoList.add(model);
                        totalWeight += model.getWeight();
                     }
                  }

                  int r = RandomUtil.randInt(totalWeight);
                  int loop = 0;

                  for(WarHorseSkillModel model : randmoList) {
                     loop += model.getWeight();
                     if (r < loop) {
                        modelList.add(model);
                        this.upSkills.add(model.getId());
                        break;
                     }
                  }
               }
            }
         }

         if (gamePlayer != null) {
            gamePlayer.pushPartTaskEx(WarHorsePart.class, "unlockWarHorse", new Object[]{this.id});
            if (baseModel != null) {
               GiftPart giftPart = (GiftPart)gamePlayer.getMgrPart(GiftPart.class);
               giftPart.triggerTimeLimitGift(27, baseModel.getQuality());
               gamePlayer.triggerTask(621, baseModel.getQuality(), 1L, 1);
            }
         }

         this.updateMainSkillUnlock();
      }
   }

   public void initBySkill(int code, int num, int skillId, ItemModel itemModel, GamePlayer gamePlayer) {
      super.init(code, num, itemModel, gamePlayer);
      this.lv = 1;
      this.exp = 0;
      this.artificeVal = 0;
      this.skinId = 0;
      this.upSkills.add(skillId);
   }

   public void reset(boolean isResetAwaken) {
      this.lv = 1;
      this.exp = 0;
      this.artificeVal = 0;
      this.isUnlock = false;
      this.isLock = false;
      this.lockSkill = 0;
      this.upSkills.clear();
      this.lockSkilIndex.clear();
      if (isResetAwaken) {
         this.isAwaken = false;
      }

      this.awakenIndex.clear();
      this.updateMainSkillUnlock();
   }

   public void updateMainSkillUnlock() {
      if (this.isAwaken) {
         this.isUnlock = true;
      } else {
         WarHorseBaseModel baseModel = (WarHorseBaseModel)ApplicationContextProvider.getModelPoolEntity("warHorseBase", this.id);
         if (baseModel != null) {
            int haveNum = 0;

            for(Integer upSkill : this.upSkills) {
               WarHorseSkillModel warHorseSkillModel = (WarHorseSkillModel)ApplicationContextProvider.getModelPoolEntity("warHorseSkill", upSkill);
               if (warHorseSkillModel != null && warHorseSkillModel.getQuality() >= baseModel.getUnlockSkillQuality()) {
                  ++haveNum;
               }
            }

            if (haveNum >= baseModel.getUnlockSkillNum()) {
               this.isUnlock = true;
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
         this.lv = Integer.parseInt(baseStrs[4]);
         this.exp = Integer.parseInt(baseStrs[5]);
         this.artificeVal = Integer.parseInt(baseStrs[6]);
         this.skinId = Integer.parseInt(baseStrs[7]);
         this.isLock = Integer.parseInt(baseStrs[8]) == 1;
         this.lockSkill = Integer.parseInt(baseStrs[9]);
         this.isUnlock = Integer.parseInt(baseStrs[10]) == 1;
      }

      this.upSkills.clear();
      if (!StringUtils.isEmpty(strs[1])) {
         String[] strArr = strs[1].split(",");

         for(String skill : strArr) {
            this.upSkills.add(Integer.parseInt(skill));
         }
      }

      if (strs.length > 2 && !StringUtils.isEmpty(strs[2])) {
         String[] strArr = strs[2].split(",");

         for(String skill : strArr) {
            this.lockSkilIndex.add(Integer.parseInt(skill));
         }
      }

      if (strs.length > 3) {
         this.isAwaken = Integer.parseInt(strs[3]) == 1;
      }

      if (strs.length > 4 && !StringUtils.isEmpty(strs[4])) {
         String[] strArr = strs[4].split(",");

         for(String skill : strArr) {
            this.awakenIndex.add(Integer.parseInt(skill));
         }
      }

      if (this.lockSkill > 0) {
         this.lockSkilIndex.add(this.lockSkill);
         this.lockSkill = 0;
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
      stringBuilder.append(this.lv);
      stringBuilder.append(",");
      stringBuilder.append(this.exp);
      stringBuilder.append(",");
      stringBuilder.append(this.artificeVal);
      stringBuilder.append(",");
      stringBuilder.append(this.skinId);
      stringBuilder.append(",");
      stringBuilder.append(this.isLock ? 1 : 0);
      stringBuilder.append(",");
      stringBuilder.append(this.lockSkill);
      stringBuilder.append(",");
      stringBuilder.append(this.isUnlock ? 1 : 0);
      stringBuilder.append(";");
      if (this.upSkills.size() > 0) {
         for(int skill : this.upSkills) {
            stringBuilder.append(skill);
            stringBuilder.append(",");
         }
      }

      stringBuilder.append(";");
      if (this.lockSkilIndex.size() > 0) {
         for(int index : this.lockSkilIndex) {
            stringBuilder.append(index);
            stringBuilder.append(",");
         }
      }

      stringBuilder.append(";");
      stringBuilder.append(this.isAwaken ? 1 : 0);
      stringBuilder.append(";");
      if (this.awakenIndex.size() > 0) {
         for(int index : this.awakenIndex) {
            stringBuilder.append(index);
            stringBuilder.append(",");
         }
      }

      return stringBuilder.toString();
   }
}
