package com.gzbz.gamePlayer.playerBag;

import com.gzbz.exclusiveWeapon.EWeaponDefine;
import com.gzbz.exclusiveWeapon.bean.ExclusiveWeaponItem;
import com.gzbz.gameDefine.WarriorSignetDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.horse.WarHorse;
import com.gzbz.gamePlayer.pet.Pet;
import com.gzbz.godBeast.GodBeastDefine;
import com.gzbz.godBeast.bean.GodBeastItem;
import com.gzbz.godBeast.bean.NeiDanItem;
import com.gzbz.model.AideLevelModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.BagMsg;
import com.gzbz.rune.bean.RuneItem;
import com.gzbz.rune.bean.RuneRefineInheritItem;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import misc.DateUtil;

public class ItemBase implements Serializable {
   public int code;
   public int id;
   protected int num;
   public int enableTime;

   public void init(int code, int num, ItemModel itemModel, GamePlayer gamePlayer) {
      this.code = code;
      this.num = num;
      this.id = itemModel.getId();
      if (itemModel.getTargetclass() == 7 && itemModel.getTimeOut() > 0) {
         this.enableTime = (int)(System.currentTimeMillis() / 1000L) + itemModel.getTimeOut();
      }

   }

   public void updateNum(int num) {
      int newNum = this.num + num;
      if (newNum <= 0) {
         this.num = 0;
      } else {
         this.num = newNum;
      }

   }

   public int getNum() {
      return this.num;
   }

   public void setNum(int num) {
      num = Math.max(num, 0);
      this.num = num;
   }

   public BagMsg.Item_Info.Builder toItemInfoBuilder() {
      BagMsg.Item_Info.Builder builder = BagMsg.Item_Info.newBuilder();
      builder.setCode(this.code);
      builder.setId(this.id);
      builder.setNum(this.getNum());
      if (this.enableTime > 0) {
         builder.setEnableTime(this.enableTime);
      }

      if (this instanceof WarriorSignet) {
         WarriorSignet warriorSignet = (WarriorSignet)this;
         builder.setScore(warriorSignet.score);
         if (!warriorSignet.skills.isEmpty()) {
            for(Integer skill : warriorSignet.skills) {
               builder.addSkills(skill);
            }
         }

         if (!warriorSignet.properties.isEmpty()) {
            for(PropertyModel proModel : warriorSignet.properties) {
               builder.addProperties(proModel.builder());
            }
         }

         if (!warriorSignet.recastSkills.isEmpty()) {
            for(Integer recastSkill : warriorSignet.recastSkills) {
               builder.addRecastSkills(recastSkill);
            }
         }

         if (!warriorSignet.recastPros.isEmpty()) {
            for(PropertyModel recastPro : warriorSignet.recastPros) {
               builder.addRecastPros(recastPro.builder());
            }
         }

         for(PropertyModel propertyModel : WarriorSignetDefine.getBaseAttr(warriorSignet.id)) {
            builder.addProperties(propertyModel.builder());
         }

         for(PropertyModel propertyModel : WarriorSignetDefine.getExclusiveAttr(warriorSignet.id)) {
            builder.addExclusiveAttr(propertyModel.builder());
         }

         List<Integer> skillIdList = WarriorSignetDefine.getSkillIdList(warriorSignet.id);
         builder.addAllSkills(skillIdList);
      } else if (this instanceof OrnamentItem) {
         OrnamentItem ornamentItem = (OrnamentItem)this;
         builder.addClearNum(ornamentItem.clearNum1);
         builder.addClearNum(ornamentItem.clearNum2);
         builder.addClearNum(ornamentItem.clearNum3);
         builder.addClearNum(ornamentItem.clearNum4);
         builder.addClearNum(ornamentItem.clearNum5);
         builder.setLevel(ornamentItem.lev);
         if (!ornamentItem.proMap.isEmpty()) {
            for(PropertyModel proModel : ornamentItem.proMap.values()) {
               builder.addProperties(ornamentItem.toBuilder(proModel));
            }
         }

         if (!ornamentItem.clearProMap.isEmpty()) {
            for(PropertyModel proModel : ornamentItem.clearProMap.values()) {
               builder.addRecastPros(ornamentItem.toBuilder(proModel));
            }
         }

         ornamentItem.proColour.clear();
         ornamentItem.calColour();
         builder.addAllOrnamentProColour(ornamentItem.proColour);
         builder.addAllOrnamentExtraProColour(ornamentItem.clearProColour);
      } else if (this instanceof Totem) {
         Totem totem = (Totem)this;
         builder.setLevel(totem.level);
         builder.setHeroCode(totem.heroCode);
         builder.setBreachLv(totem.breachLv);
      } else if (this instanceof WarFlag) {
         WarFlag warFlag = (WarFlag)this;
         builder.setLevel(warFlag.strongLv);
         if (!warFlag.strongProperties.isEmpty()) {
            for(PropertyModel base : warFlag.strongProperties) {
               builder.addStrongPros(base.builder());
            }
         }

         builder.addClearNum(warFlag.recastNum);
         builder.addClearNum(warFlag.highRecastNum);
         if (!warFlag.recastProperties.isEmpty()) {
            for(PropertyModel base : warFlag.recastProperties) {
               builder.addRecastPros(base.builder());
            }
         }
      } else if (this instanceof RuneStoneItem) {
         RuneStoneItem runeStone = (RuneStoneItem)this;
         builder.setIsRuneLock(runeStone.isLock);
         builder.setRuneStoneStrength(runeStone.strengthen);

         for(Map.Entry<Integer, PropertyModel> entry : runeStone.proMap.entrySet()) {
            builder.addRunePro(runeStone.toBuilder((Integer)entry.getKey(), (PropertyModel)entry.getValue(), runeStone.strengthen));
         }
      } else if (this instanceof HeroAideItem) {
         HeroAideItem aideItem = (HeroAideItem)this;
         AideLevelModel aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", aideItem.aideId);
         if (aideLevelModel == null) {
            builder.setLevel(0);
         } else {
            builder.setLevel(aideLevelModel.getLevel());
         }
      } else if (this instanceof WarHorse) {
         WarHorse warHorse = (WarHorse)this;
         builder.setLevel(warHorse.lv);
         builder.setExp(warHorse.exp);
         builder.setArtificeVal(warHorse.artificeVal);
         builder.addAllSkills(warHorse.upSkills);
         builder.setSkinId(warHorse.skinId);
         builder.setIsLock(warHorse.isLock);
         builder.setLockSkill(warHorse.lockSkill);
         builder.addAllHorseLockSkill(warHorse.lockSkilIndex);
         builder.setIsMainSkillUnlock(warHorse.isUnlock);
         builder.setIsAwaken(warHorse.isAwaken);
         if (!warHorse.awakenIndex.isEmpty()) {
            builder.addAllAwakenIndex(warHorse.awakenIndex);
         }
      } else if (this instanceof Pet) {
         Pet pet = (Pet)this;
         builder.setLevel(pet.lv);
         builder.setPetStar(pet.star);
         builder.setBreachLv(pet.breach);
         builder.setIsLock(pet.isLock);

         for(Integer grow : pet.growUp) {
            builder.addPetGroup(grow);
         }

         for(Integer skill : pet.skills) {
            builder.addSkills(skill);
         }
      } else if (this instanceof RuneItem) {
         RuneItem runeItem = (RuneItem)this;
         builder.setUpgradeProgress(runeItem.upgradeProgress);
         builder.setLevel(runeItem.level);
      } else if (this instanceof RuneRefineInheritItem) {
         RuneRefineInheritItem runeRefineInheritItem = (RuneRefineInheritItem)this;

         for(Map.Entry<Integer, PropertyModel> entry : runeRefineInheritItem.refinePro.entrySet()) {
            builder.addRefineProperty(runeRefineInheritItem.toBuilderRefineProperty((Integer)entry.getKey()));
         }

         builder.setBreakUpTime(runeRefineInheritItem.breakUpTime);
      } else if (this instanceof GodBeastItem) {
         GodBeastItem godBeastItem = (GodBeastItem)this;
         builder.setGodBeastInfo(GodBeastDefine.recGodBeastInfoBuilder(godBeastItem));
      } else if (this instanceof ExclusiveWeaponItem) {
         ExclusiveWeaponItem exclusiveWeaponItem = (ExclusiveWeaponItem)this;
         builder.setExclusiveWeaponData(EWeaponDefine.toBuildExclusiveWeaponData(exclusiveWeaponItem, (Map)null));
      } else if (this instanceof NeiDanItem) {
         NeiDanItem neiDanItem = (NeiDanItem)this;
         builder.setNeiDanInfo(neiDanItem.recNeiDanInfoBuilder());
         builder.setParamId(neiDanItem.entryId);
      }

      return builder;
   }

   public void decode(String data) {
   }

   public String encode() {
      return "";
   }

   public String toString() {
      return "ItemBase{code=" + this.code + ", id=" + this.id + ", num=" + this.num + ", enableTime=" + DateUtil.transferLongToDate((long)this.enableTime * 1000L) + '}';
   }
}
