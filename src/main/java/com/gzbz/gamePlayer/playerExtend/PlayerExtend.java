package com.gzbz.gamePlayer.playerExtend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import misc.MiscUtil;

public class PlayerExtend {
   public int heroBagBuyNum;
   public String ipProvince = "北京市";
   public String ipCity = "朝阳区";
   public String ipAttribution = "";
   public String ipAttributionByGm = "";
   public boolean authentication = false;
   public int reward = 0;
   public int soulNum;
   public int clubHeroCode;
   public int clubExchangeId;
   public long highestPower;
   public List<Integer> collectRecords = new ArrayList();
   public int guideStep;
   public int storyId;
   public long tongqueTime;
   public int kingTopRank;
   public long todayOnlineTime;
   public int age;
   public Map<Integer, Integer> warriorRecastNum = new HashMap();
   public long totalOnlineTime;
   public int adventureFlushNum;
   public Set<Integer> mailWorldId = new HashSet();
   public int mailWorldMaxId;
   public long mailWorldTime;
   public int runeStone;
   public int fastFightNum;
   public int professionalNum;
   public Set<Integer> guideIds = new HashSet();
   public int heroHighestLv = 1;
   public int heroHighestStar = 1;
   public boolean isShowVip = true;
   public int clubFloorNum;
   public Map<Byte, Queue<Integer>> heroComposeRecord = new HashMap();
   public Map<Byte, Integer> chatRecord = new HashMap();
   public long silent;
   public Map<Integer, Integer> cumulatives = new HashMap();
   public int fastNoItemNum = 0;
   public boolean hadResetExpetion = false;
   public Map<Integer, Integer> mysteryShopItems = new HashMap();
   public Map<Integer, HeroMailData> heroMailMap = new HashMap();
   public int expeditionHeroId;
   public List<Integer> unlockHorses = new ArrayList();
   public List<Integer> newHorseIds = new ArrayList();
   public Set<Integer> heroIntroduce = new HashSet();
   public int higestMineType = 1;
   public int petBagNum;
   public int petBagBuyNum;
   public int bubble;
   public int deerTopRank;
   public Map<Integer, Integer> likePlayer = new HashMap();
   public int numSpace;
   public int areaId;
   public int provinceId = 0;
   public int cityId = 0;
   public List<Integer> countryGuide = new ArrayList();
   public int levelPromoteId = 0;
   public int runeStoneFlush = 0;
   public int warcraftReset = 0;
   public int star13Heros;
   public int custom_face_state = 0;
   public int mergewarGameEndTime = 0;
   public Map<Integer, Long> nationMaxPower = new HashMap();
   public int handleWarFlagTime = 0;
   public int tempPlayerLv = -1;
   public Set<Long> weeklyCardPointGot = new HashSet();

   public boolean iisGotDownLoadReward() {
      return MiscUtil.existBit((long)this.reward, 0);
   }

   public void downLoadReward() {
      this.reward = MiscUtil.setBit(this.reward, 0);
   }

   public boolean iisGotAuthenticationReward() {
      return MiscUtil.existBit((long)this.reward, 1);
   }

   public void authenticationReward() {
      this.reward = MiscUtil.setBit(this.reward, 1);
   }

   public boolean iisCompletedCommonRecruitmentGuide() {
      return MiscUtil.existBit((long)this.reward, 2);
   }

   public void completedCommonRecruitmentGuide() {
      this.reward = MiscUtil.setBit(this.reward, 2);
   }

   public boolean iisCompletedProfessionalRecruitmentGuide() {
      return MiscUtil.existBit((long)this.reward, 3);
   }

   public void completedProfessionalRecruitmentGuide() {
      this.reward = MiscUtil.setBit(this.reward, 3);
   }

   public boolean iisCompletedPvpSkip() {
      return MiscUtil.existBit((long)this.reward, 4);
   }

   public void completedPvpSkip() {
      this.reward = MiscUtil.setBit(this.reward, 4);
   }

   public boolean iisCompletedFirstSixAdventureTask() {
      return MiscUtil.existBit((long)this.reward, 5);
   }

   public void completedFirstSixAdventureTask() {
      this.reward = MiscUtil.setBit(this.reward, 5);
   }

   public boolean iisCompletedLuckDraw() {
      return MiscUtil.existBit((long)this.reward, 6);
   }

   public void completedLuckDraw() {
      this.reward = MiscUtil.setBit(this.reward, 6);
   }

   public void reseteLuckDraw() {
      this.reward = MiscUtil.delBit(this.reward, 6);
   }

   public boolean iisCompletedPet() {
      return MiscUtil.existBit((long)this.reward, 7);
   }

   public void completedPet() {
      this.reward = MiscUtil.setBit(this.reward, 7);
   }

   public boolean iisCompletedLuckDraw_new() {
      return MiscUtil.existBit((long)this.reward, 10);
   }

   public void completedLuckDraw_new() {
      this.reward = MiscUtil.setBit(this.reward, 10);
   }

   public void reseteLuckDraw_new() {
      this.reward = MiscUtil.delBit(this.reward, 10);
   }

   public boolean iisCompletedWarHorse() {
      return MiscUtil.existBit((long)this.reward, 11);
   }

   public void completedWarHorse() {
      this.reward = MiscUtil.setBit(this.reward, 11);
   }

   public boolean iisCompletedHeroDressArchive() {
      return MiscUtil.existBit((long)this.reward, 12);
   }

   public void completedHeroDressArchive() {
      this.reward = MiscUtil.setBit(this.reward, 12);
   }

   public boolean iisCompletedWarHorsFix() {
      return MiscUtil.existBit((long)this.reward, 13);
   }

   public void completedWarHorsFix() {
      this.reward = MiscUtil.setBit(this.reward, 13);
   }
}
