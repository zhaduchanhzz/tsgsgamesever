package com.gzbz.heroCard.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.google.common.collect.Lists;
import com.gzbz.db.HeroCardDao;
import com.gzbz.db.bean.HeroTypeAttrData;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.CodeDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.model.HeroGameAttrTypeModel;
import com.gzbz.model.HeroGameBoxLotteryModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ZhuHouAttackGroupModel;
import com.gzbz.model.ZhuHouAttrGroupModel;
import com.gzbz.model.ZhuHouEquipLevelModel;
import com.gzbz.model.ZhuHouEquipModel;
import com.gzbz.model.ZhuHouLevelModel;
import com.gzbz.model.ZhuHouMainModel;
import com.gzbz.model.ZhuHouResolveEquipModel;
import com.gzbz.model.fun.EquipAttrModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.QualityWeightModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroCardMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.PlayerTaskPart;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import misc.MapUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroCardPart extends PlayerPart {
   private static Logger logger = LoggerFactory.getLogger(HeroCardPart.class);
   public static final int CONDITION_ONE = 1;
   public static final int CONDITION_ALL = 2;
   List<EquipAttrModel> attrModels;
   ZhuHouAttackGroupModel attackAttr;
   ZhuHouAttackGroupModel defenceAttr;

   public int getLogModule() {
      return 156;
   }

   public HeroCardDao getDao() {
      return (HeroCardDao)this.player.getData("tb_hero_card", this.player.getPlayerId());
   }

   public void logoutHandle() {
   }

   public void trigger_762() {
      Map<Integer, Integer> quality_num = new TreeMap();
      HeroCardDao dao = this.getDao();
      int wearCount = 0;

      for(Map.Entry<Integer, HeroCardDao.EquipData> entry : dao.equips.entrySet()) {
         HeroCardDao.EquipData equipData = (HeroCardDao.EquipData)entry.getValue();
         if (equipData.enable) {
            ZhuHouEquipModel equipModel = this.getEquipModel(equipData.equipId);
            if (null != equipModel) {
               for(int i = 1; i <= equipModel.getQuality(); ++i) {
                  Integer num = (Integer)quality_num.getOrDefault(i, 0);
                  quality_num.put(i, num + 1);
               }

               ++wearCount;
            }
         }
      }

      this.player.triggerTask(762, 0, (long)wearCount, 0);

      for(Map.Entry<Integer, Integer> entry : quality_num.entrySet()) {
         Integer quality = (Integer)entry.getKey();
         Integer count = (Integer)entry.getValue();
         this.player.triggerTask(762, quality, (long)count, 0);
      }

   }

   public boolean isSysOpen(boolean tips) {
      boolean systemOpen = this.player.isSystemOpen(6900);
      return tips && !systemOpen ? this.player.failure(21) : systemOpen;
   }

   public void resetDaily() {
      if (this.isSysOpen(false)) {
         HeroCardDao dao = this.getDao();
         dao.dailyLotteryNum = 0;
         dao.updateOp();
      }
   }

   public void checkAndSendLotteryItem() {
      HeroCardDao dao = this.getDao();
      if (!dao.isSendLotteryItem) {
         int initLotteryNum = this.getZhuHouMainModel().getHeroGameLotteryInitialNum();
         int heroGameLottery = this.getZhuHouMainModel().getHeroGameLottery();
         this.player.addResource(2, heroGameLottery, initLotteryNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, this.getLogModule(), 15605, 0, 0, "");
         dao.isSendLotteryItem = true;
         dao.updateOp();
      }

   }

   public List<ResourceModel> getLotteryUnlockReward() {
      HeroCardDao dao = this.getDao();
      int curBoxLv = dao.getCurBoxLv();
      HeroGameBoxLotteryModel heroGameBoxLotteryModel = this.getHeroGameBoxLotteryModel(curBoxLv);
      if (null == heroGameBoxLotteryModel) {
         return null;
      } else {
         List<ResourceModel> lotteryUnlockReward = new ArrayList();

         for(int i = 1; i <= curBoxLv; ++i) {
            HeroGameBoxLotteryModel lotteryModel = this.getHeroGameBoxLotteryModel(i);
            if (null != lotteryModel && !lotteryModel.getUnlock().isEmpty() && lotteryModel.getUnlockWeight() > 0 && RandomUtil.randTenThousand() <= lotteryModel.getUnlockWeight()) {
               for(ResourceModel resourceModel : lotteryModel.getUnlock()) {
                  resourceModel.addResourceToList(lotteryUnlockReward);
               }
            }
         }

         return lotteryUnlockReward;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Option_28613(HeroCardMsg.C2S_Option_28613 msg, String source) {
      List<HeroCardMsg.OptionVal> lotteryOptionList = msg.getLotteryOptionList();
      Map<Integer, Integer> optionTemp = new HashMap();

      for(HeroCardMsg.OptionVal optionVal : lotteryOptionList) {
         int val = optionVal.getVal();
         if (optionVal.getOption().getNumber() == 4) {
            if (val != 1 && val != 2) {
               return false;
            }
         } else if (optionVal.getOption().getNumber() == 5 && val > 0) {
            int heroGameLotterySpeed = this.getZhuHouMainModel().getHeroGameLotterySpeed();
            HeroCardDao dao = this.getDao();
            if (dao.getCurBoxLv() < heroGameLotterySpeed) {
               return this.player.failure(47);
            }

            long heroCardRecNum = this.player.getResourceNum(1, PlayerDefine.PLAYER_HERO_CARD);
            if (heroCardRecNum <= 0L) {
               return this.player.failure(47);
            }
         } else if (optionVal.getOption().getNumber() == 11 && val > 0) {
            HeroCardDao dao = this.getDao();
            Map<Integer, Integer> map = ApplicationContextProvider.<Integer, Integer>getModelPoolMap("CustomHeroGameMain");
            if (map == null) {
               return false;
            }

            Integer count = (Integer)map.getOrDefault(dao.getCurBoxLv(), map.values().stream().max(Integer::compareTo).get());
            if (val > count) {
               return false;
            }
         } else if (optionVal.getOption().getNumber() == 6 && val > 0) {
            int heroGameLotteryAutoBoxLv = this.getZhuHouMainModel().getHeroGameLotteryBackstage();
            HeroCardDao dao = this.getDao();
            if (dao.getCurBoxLv() < heroGameLotteryAutoBoxLv) {
               return false;
            }
         }

         optionTemp.put(optionVal.getOption().getNumber(), optionVal.getVal());
      }

      HeroCardDao dao = this.getDao();
      dao.option.putAll(optionTemp);
      dao.updateOp();
      HeroCardMsg.S2C_Option_28614.Builder builder = HeroCardMsg.S2C_Option_28614.newBuilder();
      builder.addAllLotteryOption(this.getOptionValBuilderList());
      this.player.sendMsg(builder.build());
      return true;
   }

   public List<HeroCardMsg.OptionVal> getOptionValBuilderList() {
      List<HeroCardMsg.OptionVal> optionValList = new ArrayList();
      HeroCardDao dao = this.getDao();
      HeroCardMsg.OptionEnum[] optionEnums = HeroCardMsg.OptionEnum.values();

      for(HeroCardMsg.OptionEnum optionEnum : optionEnums) {
         HeroCardMsg.OptionVal.Builder optionVal = HeroCardMsg.OptionVal.newBuilder();
         optionVal.setOption(optionEnum);
         optionVal.setVal((Integer)dao.option.getOrDefault(optionEnum.getNumber(), 0));
         optionValList.add(optionVal.build());
      }

      return optionValList;
   }

   @MsgHandlerAnno
   public void C2S_OptionInfo_28615(HeroCardMsg.C2S_OptionInfo_28615 msg, String source) {
      HeroCardMsg.S2C_OptionInfo_28616.Builder builder = HeroCardMsg.S2C_OptionInfo_28616.newBuilder();
      builder.addAllLotteryOption(this.getOptionValBuilderList());
      this.player.sendMsg(builder.build());
   }

   public List<PropertyModel> getAllPro(int heroId) {
      List<PropertyModel> proList = new ArrayList();
      if (!this.isSysOpen(false)) {
         return proList;
      } else {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroId);
         if (null == heroModel) {
            return proList;
         } else {
            HeroCardDao dao = this.getDao();

            for(Map.Entry<Integer, HeroCardDao.EquipData> entry : dao.equips.entrySet()) {
               HeroCardDao.EquipData data = (HeroCardDao.EquipData)entry.getValue();
               if (data.enable) {
                  for(HeroTypeAttrData attrData : data.attr) {
                     if (attrData.getHeroType() <= 0 || attrData.getHeroType() == heroModel.getType()) {
                        proList.add(new PropertyModel(attrData.getType(), attrData.getWay(), (long)attrData.getVal()));
                     }
                  }
               }
            }

            ZhuHouLevelModel levelModel = (ZhuHouLevelModel)ApplicationContextProvider.getModelPoolEntity("heroGameBoxLevel", dao.curLevel);
            proList.addAll(levelModel.getBaseAtt());
            return proList;
         }
      }
   }

   public List<PropertyModel> calRealAddPro(int heroId) {
      List<PropertyModel> allPro = this.getAllPro(heroId);
      List<PropertyModel> newList = new ArrayList();
      if (allPro != null && !allPro.isEmpty()) {
         Map<Integer, Long> valMap = new HashMap();
         Map<Integer, Long> perMap = new HashMap();

         for(PropertyModel propertyModel : allPro) {
            switch (propertyModel.getType()) {
               case 1:
               case 2:
                  if (propertyModel.getWay() == 0) {
                     long oldVal = (Long)MapUtil.getOrDefault(valMap, propertyModel.getType(), 0L);
                     valMap.put(propertyModel.getType(), oldVal + propertyModel.getValue());
                  } else if (propertyModel.getWay() == 1) {
                     long oldVal = (Long)MapUtil.getOrDefault(perMap, propertyModel.getType(), 0L);
                     perMap.put(propertyModel.getType(), oldVal + propertyModel.getValue());
                  }
                  break;
               default:
                  newList.add(propertyModel);
            }
         }

         for(Map.Entry<Integer, Long> entry : valMap.entrySet()) {
            long val = (Long)entry.getValue();
            if (perMap.containsKey(entry.getKey())) {
               double tempVal = (double)((float)val * (1.0F + (float)(Long)perMap.get(entry.getKey()) / 10000.0F));
               val = Double.valueOf(tempVal).longValue();
            }

            newList.add(new PropertyModel((Integer)entry.getKey(), 0, val));
         }

         return newList;
      } else {
         return newList;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_LevelUp_28624(HeroCardMsg.C2S_ZhuHouLevelUp_28624 msg, String source) {
      if (!this.isSysOpen(true)) {
         return false;
      } else {
         HeroCardDao dao = this.getDao();
         ZhuHouLevelModel levelModel = (ZhuHouLevelModel)ApplicationContextProvider.getModelPoolEntity("heroGameBoxLevel", dao.curLevel + 1);
         if (levelModel == null) {
            return false;
         } else {
            Integer needExp = (Integer)ZhuHouLevelModel.expMap.get(dao.curLevel + 1);
            if (needExp > dao.exp) {
               return false;
            } else {
               for(Integer taskId : (List)ApplicationContextProvider.getModelPoolEntity("customHeroGameBoxLevel", dao.curLevel)) {
                  if (!this.isTaskComplete(taskId)) {
                     return this.player.failure(3000);
                  }
               }

               ++dao.curLevel;
               this.autoLevelUp(dao);
               dao.updateOp();
               this.player.triggerTask(767, 0, (long)dao.curLevel, 0);
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ZHU_HOU);
               this.player.sendMsg(HeroCardMsg.S2C_ZhuHouLevelUp_28625.newBuilder().setLevel(dao.curLevel).setExp((long)dao.exp).build());
               return true;
            }
         }
      }
   }

   public boolean isTaskComplete(int taskId) {
      PlayerTaskPart taskPart = (PlayerTaskPart)this.player.getMgrPart(PlayerTaskPart.class);
      TaskData task = this.player.getTask(TaskDefine.TaskModule.MODULE_COMMON, taskId);
      if (task == null) {
         task = taskPart.createTask(taskId);
      }

      return task.state >= CommonMsg.TaskState.STATE_COMPLETE.getNumber();
   }

   @MsgHandlerAnno
   public boolean C2S_ResolveEquip_28622(HeroCardMsg.C2S_ZhuHouResolveEquip_28622 msg, String sourc) {
      if (!this.isSysOpen(true)) {
         return false;
      } else {
         HeroCardDao dao = this.getDao();
         List<HeroCardDao.EquipData> equipDataList = new ArrayList(msg.getCodesCount());

         for(Integer code : msg.getCodesList()) {
            HeroCardDao.EquipData equipData = (HeroCardDao.EquipData)dao.equips.get(code);
            if (equipData == null) {
               logger.info("不存在装备Code:", code);
               return false;
            }

            equipDataList.add(equipData);
         }

         List<ResourceModel> resolveRes = new ArrayList();

         for(HeroCardDao.EquipData equipData : equipDataList) {
            resolveRes.addAll(this.resolveEquip(dao, equipData.code));
         }

         this.autoLevelUp(dao);
         this.player.addResource(resolveRes, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, this.getLogModule(), 15607);
         dao.updateOp();
         this.player.triggerTask(767, 0, (long)dao.curLevel, 0);
         this.player.sendMsg(HeroCardMsg.S2C_ZhuHouResolveEquip_28623.newBuilder().addAllEquips(this.getEquipBuilder(dao.equips.values())).addAllCodes(msg.getCodesList()).setLevel(dao.curLevel).setExp(dao.exp).build());
         return true;
      }
   }

   public List<ResourceModel> resolveEquip(HeroCardDao dao, int code) {
      ZhuHouResolveEquipModel model = this.getResolveEquipModel(dao.curLevel);
      dao.exp += model.getExp();
      dao.equips.remove(code);
      this.player.triggerTask(760, 0, 1L, 1);
      return Lists.newArrayList(model.getResolve());
   }

   private void autoLevelUp(HeroCardDao dao) {
      while(true) {
         if (dao.exp >= (Integer)ZhuHouLevelModel.expMap.getOrDefault(dao.curLevel + 1, 0)) {
            ZhuHouLevelModel nextLevelModel = (ZhuHouLevelModel)ApplicationContextProvider.getModelPoolEntity("heroGameBoxLevel", dao.curLevel + 1);
            if (nextLevelModel != null) {
               ZhuHouLevelModel levelModel = (ZhuHouLevelModel)ApplicationContextProvider.getModelPoolEntity("heroGameBoxLevel", dao.curLevel);
               if (levelModel != null && !StrUtil.isNotBlank(levelModel.getTaskId())) {
                  ++dao.curLevel;
                  continue;
               }
            }
         }

         return;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ZhuHouStampLvUp_28626(HeroCardMsg.C2S_ZhuHouStampLvUp_28626 msg, String source) {
      if (!this.isSysOpen(true)) {
         return false;
      } else {
         HeroCardDao dao = this.getDao();
         long time = dao.recBoxNextLvCountDown(true);
         if ((time <= 0L || !msg.getIsLevelUp()) && (time > 0L || msg.getIsLevelUp())) {
            HeroGameBoxLotteryModel nextLvModel = this.getHeroGameBoxLotteryModel(dao.getCurBoxLv());
            if (nextLvModel == null) {
               return false;
            } else {
               if (time <= 0L) {
                  if (this.player.getPlayerDao().lv < nextLvModel.getNeedLevel()) {
                     return this.player.failure(20);
                  }

                  if (dao.lotteryCount < (long)nextLvModel.getNeedLotteryNum()) {
                     return this.player.failure(76523);
                  }

                  if (!this.player.checkResourceNum(nextLvModel.getNeed())) {
                     return this.player.failure(76135);
                  }

                  this.player.delResource((List)nextLvModel.getNeed(), this.getLogModule(), 15603, 0, 0, "");
                  if (nextLvModel.getTime() == 0) {
                     dao.setCurBoxLv(dao.getCurBoxLv() + 1);
                  } else {
                     dao.boxNextLvTime = System.currentTimeMillis() + (long)nextLvModel.getTime() * 1000L;
                  }
               } else {
                  int speedItemId = this.getZhuHouMainModel().getHeroGameAddSpeed();
                  int speedTime = this.getZhuHouMainModel().getHeroGameAddSpeedTime();
                  int count = (int)Math.ceil((double)time / (double)speedTime);
                  int realUseCount = Math.min(count, msg.getCount());
                  List<ResourceModel> cost = Lists.newArrayList(new ResourceModel[]{new ResourceModel(2, speedItemId, realUseCount)});
                  if (!this.player.checkResourceNum(cost)) {
                     return this.player.failure(76135);
                  }

                  this.player.delResource((List)cost, this.getLogModule(), 15603, 0, 0, "");
                  dao.boxNextLvTime = Math.max(dao.boxNextLvTime - (long)(speedTime * realUseCount * 1000), 0L);
                  dao.setCurBoxLv(dao.boxNextLvTime == 0L ? dao.getCurBoxLv() + 1 : dao.getCurBoxLv());
               }

               dao.updateOp();
               this.player.sendMsg(HeroCardMsg.S2C_ZhuHouStampLvUp_28627.newBuilder().setCurBoxLv(dao.getCurBoxLv()).setBoxNextLvTime(dao.boxNextLvTime / 1000L).build());
               return true;
            }
         } else {
            return false;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ZhuHoubuyItem_28633(HeroCardMsg.C2S_ZhuHoubuyItem_28633 msg, String source) {
      if (!this.isSysOpen(true)) {
         return false;
      } else {
         int buyCost = this.getZhuHouMainModel().getHeroGameAddGold();
         int speedItemId = this.getZhuHouMainModel().getHeroGameAddSpeed();
         ResourceModel cost = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, buyCost * msg.getCount());
         if (!this.player.checkResourceNum(cost)) {
            return this.player.failure(76135);
         } else {
            this.player.delResource(cost, this.getLogModule(), 15608, 0, 0, "");
            this.player.addResource(Lists.newArrayList(new ResourceModel[]{new ResourceModel(2, speedItemId, msg.getCount())}), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getLogModule(), 15608);
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ZhuHouEquipLottery_28620(HeroCardMsg.C2S_ZhuHouEquipLottery_28620 msg, String source) {
      if (!this.isSysOpen(true)) {
         return false;
      } else {
         HeroCardDao dao = this.getDao();
         int lotteryNum = msg.getNum();
         List<ResourceModel> lotteryCost = Lists.newArrayList(new ResourceModel[]{this.getLotteryCost(lotteryNum)});
         if (!this.player.checkResourceNum(lotteryCost)) {
            return this.player.failure(76135);
         } else {
            List<HeroCardDao.EquipData> equipDataList = new ArrayList();
            Map<Integer, Integer> qualityLotteryNum = new HashMap(dao.qualityLotteryNum);

            for(int i = 0; i < lotteryNum; ++i) {
               HeroCardDao.EquipData equipData = this.lotteryEquip(dao.getCurBoxLv(), dao.curLevel, qualityLotteryNum);
               if (equipData == null) {
                  logger.error("生成装备失败");
                  return false;
               }

               equipDataList.add(equipData);
            }

            this.player.delResource((List)lotteryCost, this.getLogModule(), 15601, 0, 0, "");
            List<HeroCardMsg.EquipData> equipList = new ArrayList();
            List<HeroCardMsg.EquipData> resolveEquipList = new ArrayList();
            List<ResourceModel> resources = new ArrayList();

            for(HeroCardDao.EquipData equipData : equipDataList) {
               this.getEquipModel(equipData.equipId);
               equipData.code = this.player.getUniqueCode(CodeDefine.HERO_CARD_CODE);
               dao.equips.put(equipData.code, equipData);
               equipList.add(equipData.toBuilder());
               resources.addAll(this.getLotteryUnlockReward());
               this.player.triggerTask(759, 0, 1L, 1);
            }

            if (CollectionUtil.isNotEmpty(resources)) {
               this.player.addResource(resources, PlayerMsg.ShowType.SHOW_HERO_CARD_RESOLVE, this.getLogModule(), 15606);
            }

            dao.qualityLotteryNum = qualityLotteryNum;
            dao.dailyLotteryNum += lotteryNum;
            dao.lotteryCount += (long)lotteryNum;
            dao.updateOp();
            this.player.sendMsg(HeroCardMsg.S2C_ZhuHouEquipLottery_28621.newBuilder().addAllEquipData(equipList).setDailyLotteryNum(dao.dailyLotteryNum).setLotteryCount(dao.lotteryCount).addAllResolveEquip(resolveEquipList).setResult(1).build());
            return true;
         }
      }
   }

   public boolean isResolveCondition(HeroCardDao dao, HeroCardDao.EquipData equipData) {
      return this.isResolveByNormalCondition(dao, equipData) || this.isResolveByAttrCondition(equipData, dao);
   }

   public boolean isResolveByNormalCondition(HeroCardDao dao, HeroCardDao.EquipData equipData) {
      ZhuHouEquipModel equip = this.getEquipModel(equipData.equipId);
      Integer optionCondition = (Integer)dao.option.getOrDefault(4, 1);
      boolean isResolve = false;

      for(Map.Entry<Integer, Integer> option : dao.option.entrySet()) {
         Integer value = (Integer)option.getValue();
         if (value > 0) {
            boolean tempResolve = false;
            if ((Integer)option.getKey() == 1) {
               tempResolve = value > equip.getQuality();
            } else {
               if ((Integer)option.getKey() != 2) {
                  continue;
               }

               tempResolve = this.compareEquipScore(equipData);
            }

            if (optionCondition == 2 && tempResolve) {
               isResolve = true;
               break;
            }

            if (optionCondition == 1 && !tempResolve) {
               isResolve = false;
               break;
            }
         }
      }

      return isResolve;
   }

   public boolean compareEquipScore(HeroCardDao.EquipData newEquip) {
      HeroCardDao dao = this.getDao();
      ZhuHouEquipModel newEquipModel = this.getEquipModel(newEquip.equipId);
      if (newEquipModel == null) {
         return false;
      } else {
         for(HeroCardDao.EquipData equip : dao.equips.values()) {
            ZhuHouEquipModel equipModel = this.getEquipModel(equip.equipId);
            if (equipModel.getType() == newEquipModel.getType() && equip.enable) {
               return equip.calEquipScore() >= newEquip.calEquipScore();
            }
         }

         return false;
      }
   }

   public boolean isResolveByAttrCondition(HeroCardDao.EquipData equip, HeroCardDao dao) {
      int attackAttr1 = (Integer)dao.option.getOrDefault(7, 0);
      int defenceAttr1 = (Integer)dao.option.getOrDefault(8, 0);
      int attackAttr2 = (Integer)dao.option.getOrDefault(9, 0);
      int defenceAttr2 = (Integer)dao.option.getOrDefault(10, 0);
      Set<Integer> attrType = (Set)equip.attr.stream().map((item) -> item.getType()).collect(Collectors.toSet());
      return attackAttr1 > 0 && !attrType.contains(attackAttr1) || defenceAttr1 > 0 && !attrType.contains(defenceAttr1) || attackAttr2 > 0 && !attrType.contains(attackAttr2) || defenceAttr2 > 0 && !attrType.contains(defenceAttr2);
   }

   @MsgHandlerAnno
   public boolean C2S_ZhuHouInfo_28628(HeroCardMsg.C2S_ZhuHouInfo_28628 msg, String source) {
      if (this.isSysOpen(false)) {
         this.checkAndSendLotteryItem();
      }

      HeroCardDao dao = this.getDao();
      this.player.sendMsg(HeroCardMsg.S2C_ZhuHouInfo_28629.newBuilder().addAllEquips(this.getEquipBuilder(dao.equips.values())).setLevel(dao.curLevel).setExp(dao.exp).setStampLevel(dao.getCurBoxLv()).setStampNextLvTime(dao.boxNextLvTime / 1000L).setDailyLotteryNum(dao.dailyLotteryNum).setLotteryCount(dao.lotteryCount).build());
      return true;
   }

   public List<HeroCardMsg.EquipData> getEquipBuilder(Collection<HeroCardDao.EquipData> equips) {
      List<HeroCardMsg.EquipData> equipsBuilder = new ArrayList();

      for(HeroCardDao.EquipData data : equips) {
         equipsBuilder.add(data.toBuilder());
      }

      return equipsBuilder;
   }

   @MsgHandlerAnno
   public boolean C2S_ZhuHouWearEquip_28630(HeroCardMsg.C2S_ZhuHouWearEquip_28630 msg, String source) {
      if (!this.isSysOpen(true)) {
         return false;
      } else {
         HeroCardDao dao = this.getDao();
         HeroCardDao.EquipData replaceEquip = (HeroCardDao.EquipData)dao.equips.get(msg.getCode());
         if (replaceEquip == null) {
            return false;
         } else if (replaceEquip.enable) {
            return false;
         } else {
            ZhuHouEquipModel replaceEquipModel = (ZhuHouEquipModel)ApplicationContextProvider.getModelPoolEntity("heroGame", replaceEquip.equipId);
            HeroCardDao.EquipData targetEquip = null;
            boolean isBetter = false;

            for(Map.Entry<Integer, HeroCardDao.EquipData> entry : dao.equips.entrySet()) {
               HeroCardDao.EquipData equip = (HeroCardDao.EquipData)entry.getValue();
               ZhuHouEquipModel equipModel = (ZhuHouEquipModel)ApplicationContextProvider.getModelPoolEntity("heroGame", equip.equipId);
               if (equipModel.getType() == replaceEquipModel.getType() && equip.enable) {
                  isBetter = equip.calEquipScore() >= replaceEquip.calEquipScore();
                  targetEquip = equip;
                  break;
               }
            }

            if (targetEquip == null && msg.getIsResolve()) {
               return false;
            } else {
               replaceEquip.enable = true;
               dao.equips.put(replaceEquip.code, replaceEquip);
               if (targetEquip != null) {
                  targetEquip.enable = false;
                  dao.equips.put(targetEquip.code, targetEquip);
               }

               if (isBetter) {
                  this.player.triggerTask(763, 0, 1L, 1);
               }

               if (msg.getIsResolve()) {
                  List<ResourceModel> resolveRec = Lists.newArrayList(this.resolveEquip(dao, targetEquip.code));
                  this.autoLevelUp(dao);
                  this.player.addResource(resolveRec, PlayerMsg.ShowType.SHOW_HERO_CARD_RESOLVE, this.getLogModule(), 15606);
                  this.player.triggerTask(767, 0, (long)dao.curLevel, 0);
               }

               dao.updateOp();
               this.trigger_762();
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ZHU_HOU);
               this.player.sendMsg(HeroCardMsg.S2C_ZhuHouWearEquip_28631.newBuilder().setCode(msg.getCode()).setIsResolve(msg.getIsResolve()).setExp(dao.exp).setLevel(dao.curLevel).addAllEquips(this.getEquipBuilder(dao.equips.values())).build());
               return true;
            }
         }
      }
   }

   public ZhuHouEquipModel getEquipModel(int equipId) {
      ZhuHouEquipModel equipModel = (ZhuHouEquipModel)ApplicationContextProvider.getModelPoolEntity("heroGame", equipId);
      if (equipId > 0 && null == equipModel) {
         logger.error("装备表配置异常 heroCardId:{}", equipId);
      }

      return equipModel;
   }

   public HeroGameBoxLotteryModel getHeroGameBoxLotteryModel(int boxLv) {
      HeroGameBoxLotteryModel model = (HeroGameBoxLotteryModel)ApplicationContextProvider.getModelPoolEntity("heroGameBoxLottery", boxLv);
      if (null == model) {
         logger.error("HeroGameBoxLottery 配置缺失 boxLv:{}", boxLv);
      }

      return model;
   }

   public Map<Integer, Integer> getQualityFloorConfig(int boxLv) {
      HeroGameBoxLotteryModel heroGameBoxLotteryModel = this.getHeroGameBoxLotteryModel(boxLv);
      if (null == heroGameBoxLotteryModel) {
         return null;
      } else {
         Map<Integer, Integer> qualityFloor = new HashMap();

         for(QualityWeightModel qualityWeightModel : heroGameBoxLotteryModel.getQualityWeight()) {
            if (qualityWeightModel.getMust() > 0) {
               qualityFloor.put(qualityWeightModel.getQuality(), qualityWeightModel.getMust());
            }
         }

         return qualityFloor;
      }
   }

   public ResourceModel getLotteryCost(int lotteryNum) {
      int heroGameLottery = this.getZhuHouMainModel().getHeroGameLottery();
      return new ResourceModel(2, heroGameLottery, lotteryNum);
   }

   public int lotteryQuality(int boxLv, Map<Integer, Integer> qualityLotteryNum) {
      HeroGameBoxLotteryModel heroGameBoxLotteryModel = this.getHeroGameBoxLotteryModel(boxLv);
      if (null == heroGameBoxLotteryModel) {
         logger.error("抽取豪杰卡品质异常 boxLv:{}", boxLv);
         return 0;
      } else {
         Map<Integer, Integer> qualityFloorConfig = this.getQualityFloorConfig(boxLv);
         if (qualityFloorConfig != null && qualityFloorConfig.size() > 0) {
            for(Integer quality : (List)qualityFloorConfig.keySet().stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList())) {
               Integer floor = (Integer)qualityFloorConfig.getOrDefault(quality, 0);
               Integer curLotteryNum = (Integer)qualityLotteryNum.getOrDefault(quality, 0);
               if (floor > 0 && curLotteryNum >= floor) {
                  return quality;
               }
            }
         }

         List<KeyValFun> keyValFunList = new ArrayList();

         for(QualityWeightModel qualityWeightModel : heroGameBoxLotteryModel.getQualityWeight()) {
            keyValFunList.add(new KeyValFun(qualityWeightModel.getQuality(), qualityWeightModel.getWeight()));
         }

         return GamePlayer.countRate(keyValFunList);
      }
   }

   public HeroCardDao.EquipData lotteryEquip(int stampLevel, int level, Map<Integer, Integer> equipMust) {
      int equipType = this.getEquipType();
      if (equipType == -1) {
         return null;
      } else {
         int quality = this.lotteryQuality(stampLevel, equipMust);
         if (quality <= 0) {
            return null;
         } else {
            int equipLevel = Math.max(level + this.getEquipLevel(level, equipType), 1);
            this.getEquipBaseAttr(equipType, equipLevel, quality);
            HeroCardDao.EquipData equipData = new HeroCardDao.EquipData();
            ZhuHouEquipModel equipModel = (ZhuHouEquipModel)ApplicationContextProvider.getModelPoolEntity("customHeroGame", StrUtil.format("{}_{}", new Object[]{equipType, quality}));
            equipData.equipId = equipModel.getId();
            equipData.equipLevel = equipLevel;
            this.calEquipAttr(equipData, this.attrModels, this.attackAttr, this.defenceAttr);
            equipMust.put(quality, 0);

            for(QualityWeightModel qualityWeightModel : this.getHeroGameBoxLotteryModel(stampLevel).getQualityWeight()) {
               if (qualityWeightModel.getMust() <= 0) {
                  equipMust.remove(qualityWeightModel.getQuality());
               } else if (qualityWeightModel.getQuality() != equipModel.getQuality()) {
                  Integer qualityNum = (Integer)equipMust.getOrDefault(qualityWeightModel.getQuality(), 0);
                  equipMust.put(qualityWeightModel.getQuality(), qualityNum + 1);
               }
            }

            return equipData;
         }
      }
   }

   public void calEquipAttr(HeroCardDao.EquipData data, List<EquipAttrModel> attrModels, ZhuHouAttackGroupModel attackAttr, ZhuHouAttackGroupModel defenceAttr) {
      for(EquipAttrModel attrModel : attrModels) {
         double attrVal = (double)(((float)attrModel.getNum() + (float)(attrModel.getFactor() * data.equipLevel) / 10000.0F) * ((float)RandomUtil.randInt(attrModel.getDown(), attrModel.getUp()) / 100.0F));
         attrVal = Math.max(attrVal, (double)1.0F);
         HeroTypeAttrData attrData = new HeroTypeAttrData(attrModel.getHeroType(), attrModel.getType(), attrModel.getWay(), Double.valueOf(attrVal).intValue());
         data.attr.add(attrData);
      }

      if (attackAttr != null) {
         double attrVal = (double)((float)attackAttr.getAddProsNum() * ((float)RandomUtil.randInt(attackAttr.getWaveDown(), attackAttr.getWaveUp()) / 100.0F));
         HeroTypeAttrData attrData = new HeroTypeAttrData(attackAttr.getAddProsHeroType(), attackAttr.getAddProsType(), attackAttr.getAddProsWay(), Double.valueOf(attrVal).intValue());
         data.attr.add(attrData);
      }

      if (defenceAttr != null) {
         double attrVal = (double)((float)defenceAttr.getAddProsNum() * ((float)RandomUtil.randInt(defenceAttr.getWaveDown(), defenceAttr.getWaveUp()) / 100.0F));
         HeroTypeAttrData attrData = new HeroTypeAttrData(defenceAttr.getAddProsHeroType(), defenceAttr.getAddProsType(), defenceAttr.getAddProsWay(), Double.valueOf(attrVal).intValue());
         data.attr.add(attrData);
      }

   }

   public ZhuHouMainModel getZhuHouMainModel() {
      ZhuHouMainModel zhuHouMainModel = (ZhuHouMainModel)ApplicationContextProvider.getModelPoolEntity("heroGameMain", 1);
      if (null == zhuHouMainModel) {
         logger.error("HeroGameMain配置缺失 id:1");
      }

      return zhuHouMainModel;
   }

   public Set<Integer> getQualities() {
      return ZhuHouEquipModel.qualitySet;
   }

   public int getEquipType() {
      List<KeyValFun> typeWeights = (List)ApplicationContextProvider.getModelPoolEntity("customHeroGameEquipType", "customHeroGameEquipType");
      return GamePlayer.countRate(typeWeights);
   }

   public int getEquipLevel(int level, int equipType) {
      Map<ZhuHouEquipLevelModel.Limit, List<KeyValFun>> map = (Map)ApplicationContextProvider.getModelPoolEntity("customHeroGameLevel", "customHeroGameLevel");

      for(Map.Entry<ZhuHouEquipLevelModel.Limit, List<KeyValFun>> entry : map.entrySet()) {
         if (level <= ((ZhuHouEquipLevelModel.Limit)entry.getKey()).getMax()) {
            return GamePlayer.countRate((List)entry.getValue());
         }
      }

      logger.error("随机装备等级报错");
      return 0;
   }

   public ZhuHouResolveEquipModel getResolveEquipModel(int level) {
      Map<ZhuHouResolveEquipModel.Limit, ZhuHouResolveEquipModel> map = (Map)ApplicationContextProvider.getModelPoolEntity("customHeroGameDecompose", "customHeroGameDecompose");

      for(Map.Entry<ZhuHouResolveEquipModel.Limit, ZhuHouResolveEquipModel> entry : map.entrySet()) {
         if (level <= ((ZhuHouResolveEquipModel.Limit)entry.getKey()).getMax()) {
            return (ZhuHouResolveEquipModel)entry.getValue();
         }
      }

      return null;
   }

   public void getEquipBaseAttr(int equipType, int equipLevel, int quality) {
      this.attrModels = new ArrayList();
      this.attackAttr = null;
      this.defenceAttr = null;
      HeroGameAttrTypeModel model = (HeroGameAttrTypeModel)ApplicationContextProvider.getModelPoolEntity("heroGameAttrType", equipType);
      int groupBase = model.getGroupBase();
      int groupAttack = model.getGroupAttack();
      int groupDefence = model.getGroupDefence();
      Map<ZhuHouAttrGroupModel.Limit, List<EquipAttrModel>> attrGroup = (Map)ApplicationContextProvider.getModelPoolEntity("customHeroGameAttrGroup", groupBase);

      for(Map.Entry<ZhuHouAttrGroupModel.Limit, List<EquipAttrModel>> entry : attrGroup.entrySet()) {
         if (equipLevel <= ((ZhuHouAttrGroupModel.Limit)entry.getKey()).getMax()) {
            this.attrModels = (List)entry.getValue();
            break;
         }
      }

      List<KeyValFun> attackGroup = (List)ApplicationContextProvider.getModelPoolEntity("customHeroGameAttackGroup", StrUtil.format("{}_{}", new Object[]{groupAttack, quality}));
      if (CollectionUtil.isNotEmpty(attackGroup)) {
         int attackId = GamePlayer.countRate(attackGroup);
         this.attackAttr = (ZhuHouAttackGroupModel)ApplicationContextProvider.getModelPoolEntity("heroGameAttackGroup", attackId);
      }

      List<KeyValFun> defenceGroupTemp = (List)ApplicationContextProvider.getModelPoolEntity("customHeroGameAttackGroup", StrUtil.format("{}_{}", new Object[]{groupDefence, quality}));
      if (CollectionUtil.isNotEmpty(defenceGroupTemp)) {
         List<KeyValFun> defenceGroup = new ArrayList();
         if (this.attackAttr != null) {
            for(KeyValFun keyValFun : defenceGroupTemp) {
               ZhuHouAttackGroupModel attackGroupModel = (ZhuHouAttackGroupModel)ApplicationContextProvider.getModelPoolEntity("heroGameAttackGroup", keyValFun.getKey());
               if (attackGroupModel.getAddProsType() != this.attackAttr.getAddProsType()) {
                  defenceGroup.add(keyValFun);
               }
            }
         }

         int defenceId = GamePlayer.countRate(defenceGroup);
         this.defenceAttr = (ZhuHouAttackGroupModel)ApplicationContextProvider.getModelPoolEntity("heroGameAttackGroup", defenceId);
      }

   }
}
