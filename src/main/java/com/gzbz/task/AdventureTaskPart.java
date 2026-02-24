package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.convert.Convert;
import com.gzbz.activity.part.SpecialTaskActivityPart;
import com.gzbz.db.AdventureDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.AdventureData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.log.PlayerLogPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ChapterAdventureConfigModel;
import com.gzbz.model.ChapterAdventureModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.AdventureMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.MapUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class AdventureTaskPart extends PlayerPart {
   private Logger logger = LoggerFactory.getLogger(AdventureTaskPart.class);
   @Autowired
   ConfigManager configManager;

   @MsgHandlerAnno
   public void C2S_OpenAdventureUi_7801(AdventureMsg.C2S_OpenAdventureUi_7801 msg, String source) {
      this.sendTaskList();
   }

   @MsgHandlerAnno
   public void C2S_AutoAcceptQuality_7813(AdventureMsg.C2S_AutoAcceptQuality_7813 msg, String source) {
      AdventureDao adventureDao = (AdventureDao)this.player.getData("tb_adventure", this.player.getPlayerId());
      adventureDao.qualityLv.clear();
      if (msg.getQualityCount() > 0) {
         adventureDao.qualityLv.addAll(msg.getQualityList());
      }

      adventureDao.updateOp();
      AdventureMsg.S2C_AutoAcceptQuality_7814.Builder builder = AdventureMsg.S2C_AutoAcceptQuality_7814.newBuilder();
      builder.addAllQuality(msg.getQualityList());
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_AutoAccept_7815(AdventureMsg.C2S_AutoAccept_7815 msg, String source) {
   }

   @MsgHandlerAnno
   public void C2S_FlushTask_7803(AdventureMsg.C2S_FlushTask_7803 msg, String source) {
      this.flushTask(msg.hasIsMust());
      int adventureEnableAutoVipLv = this.configManager.getIntDefault("adventureEnableAutoVipLv", 4);
      if (this.player.getPublicDao().vip_lv >= adventureEnableAutoVipLv) {
         this.autoAcceptTask();
      }

      this.sendTaskList();
      AdventureMsg.S2C_FlushTaskResult_7804.Builder builder = AdventureMsg.S2C_FlushTaskResult_7804.newBuilder();
      builder.setResult(1);
      this.player.sendMsg(builder.build());
   }

   public void autoAcceptTask() {
      AdventureDao adventureDao = (AdventureDao)this.player.getData("tb_adventure", this.player.getPlayerId());
      if (adventureDao.qualityLv.size() > 0) {
         boolean isHaveAuto = false;
         String[] activityPointArr = ApplicationContextProvider.getConfigString("AdventuresPoints", "").split("\\|");
         SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);

         for(Map.Entry<String, AdventureData> entry : adventureDao.jsonData.entrySet()) {
            if (((AdventureData)entry.getValue()).state == 0) {
               ChapterAdventureModel chapterAdventureModel = (ChapterAdventureModel)ApplicationContextProvider.getModelPoolEntity("chapterAdventure", ((AdventureData)entry.getValue()).taskId);
               if (chapterAdventureModel != null && adventureDao.qualityLv.contains(chapterAdventureModel.getQuality())) {
                  ResourceModel needResourceModel = new ResourceModel(1, PlayerDefine.PLAYER_INFOMATION, chapterAdventureModel.getCost());
                  if (this.isActivityTime()) {
                     needResourceModel = new ResourceModel(1, PlayerDefine.PLAYER_INFOMATION, chapterAdventureModel.getActivityCost());
                  }

                  if (!this.player.checkResourceNum(needResourceModel)) {
                     this.player.failure(61216);
                     return;
                  }

                  List<Integer> heroList = this.getEnableUseHeroCodes(chapterAdventureModel);
                  if (heroList == null || heroList.isEmpty()) {
                     this.player.failure(61217);
                     return;
                  }

                  ((AdventureData)entry.getValue()).state = 1;
                  ((AdventureData)entry.getValue()).acceptTime = System.currentTimeMillis();
                  ((AdventureData)entry.getValue()).heroCodes.addAll(heroList);
                  adventureDao.updateOp();
                  isHaveAuto = true;
                  this.player.delResource(needResourceModel, 18, 1806, 0, 0, "");
                  this.player.triggerTask(110, 0, 1L, 1);
                  this.player.triggerTask(212, chapterAdventureModel.getQuality(), 1L, 3);
                  String[] rewardInfo = LogOperationMgr.toRewardsInfo(chapterAdventureModel.getRewardItems());
                  this.player.getOperationMgr().addExtraLog(this.player, 104, chapterAdventureModel.getQuality() + "", rewardInfo[0], rewardInfo[1], rewardInfo[2], needResourceModel.getValue() + "", this.player.getPlayerDao().getProperty(PlayerDefine.PLAYER_INFOMATION) + "");
                  specialTaskActivityPart.addPoint(1170, Integer.parseInt(activityPointArr[chapterAdventureModel.getQuality() - 1]));
               }
            }
         }

         if (isHaveAuto) {
            this.player.failure(61221);
         }

      }
   }

   public List<Integer> getEnableUseHeroCodes(ChapterAdventureModel chapterAdventureModel) {
      int needStar = chapterAdventureModel.getStar();
      int needNation = chapterAdventureModel.getNation();
      List<Integer> enableCodeList = new ArrayList();
      List<Integer> uesdList = this.getUesdHeroCode();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      Map<Integer, HeroDao> heroDaoMap = heroBagPart.getHeroDaoMap();
      boolean isHaveNation = false;

      for(Map.Entry<Integer, HeroDao> entry : heroDaoMap.entrySet()) {
         if (!uesdList.contains(entry.getKey()) && !HeroModel.isReplacementHero(((HeroDao)entry.getValue()).id) && ((HeroDao)entry.getValue()).getStar() >= needStar) {
            enableCodeList.add(entry.getKey());
            uesdList.add(entry.getKey());
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", ((HeroDao)entry.getValue()).id);
            if (heroModel != null && heroModel.getNation() == needNation) {
               isHaveNation = true;
            }
            break;
         }
      }

      if (enableCodeList.isEmpty()) {
         return null;
      } else {
         if (!isHaveNation) {
            TreeMap<Integer, HeroDao> starNationMap = new TreeMap();

            for(Map.Entry<Integer, HeroDao> entry : heroDaoMap.entrySet()) {
               if (!uesdList.contains(entry.getKey())) {
                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", ((HeroDao)entry.getValue()).id);
                  if (heroModel != null && heroModel.getNation() == needNation) {
                     if (((HeroDao)entry.getValue()).getStar() <= 3) {
                        enableCodeList.add(((HeroDao)entry.getValue()).code);
                        uesdList.add(((HeroDao)entry.getValue()).code);
                        isHaveNation = true;
                        break;
                     }

                     if (!starNationMap.containsKey(((HeroDao)entry.getValue()).getStar())) {
                        starNationMap.put(((HeroDao)entry.getValue()).getStar(), entry.getValue());
                     }
                  }
               }
            }

            if (!isHaveNation) {
               if (starNationMap.isEmpty()) {
                  return null;
               }

               Iterator var17 = starNationMap.entrySet().iterator();
               if (var17.hasNext()) {
                  Map.Entry<Integer, HeroDao> daoEntry = (Map.Entry)var17.next();
                  enableCodeList.add(((HeroDao)daoEntry.getValue()).code);
                  uesdList.add(((HeroDao)daoEntry.getValue()).code);
               }
            }
         }

         if (chapterAdventureModel.getNation2() > 0) {
            TreeMap<Integer, HeroDao> starNationMap = new TreeMap();
            boolean isHaveNation2 = false;

            for(Map.Entry<Integer, HeroDao> entry : heroDaoMap.entrySet()) {
               if (!uesdList.contains(entry.getKey())) {
                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", ((HeroDao)entry.getValue()).id);
                  if (heroModel != null && heroModel.getNation() == chapterAdventureModel.getNation2()) {
                     if (((HeroDao)entry.getValue()).getStar() <= 3) {
                        enableCodeList.add(((HeroDao)entry.getValue()).code);
                        uesdList.add(((HeroDao)entry.getValue()).code);
                        isHaveNation2 = true;
                        break;
                     }

                     if (!starNationMap.containsKey(((HeroDao)entry.getValue()).getStar())) {
                        starNationMap.put(((HeroDao)entry.getValue()).getStar(), entry.getValue());
                     }
                  }
               }
            }

            if (!isHaveNation2) {
               if (starNationMap.isEmpty()) {
                  return null;
               }

               Iterator var22 = starNationMap.entrySet().iterator();
               if (var22.hasNext()) {
                  Map.Entry<Integer, HeroDao> daoEntry = (Map.Entry)var22.next();
                  enableCodeList.add(((HeroDao)daoEntry.getValue()).code);
                  uesdList.add(((HeroDao)daoEntry.getValue()).code);
               }
            }
         }

         return enableCodeList;
      }
   }

   public List<Integer> getUesdHeroCode() {
      AdventureDao adventureDao = (AdventureDao)this.player.getData("tb_adventure", this.player.getPlayerId());
      List<Integer> codesList = new ArrayList();

      for(Map.Entry<String, AdventureData> entry : adventureDao.jsonData.entrySet()) {
         codesList.addAll(((AdventureData)entry.getValue()).heroCodes);
      }

      return codesList;
   }

   @MsgHandlerAnno
   public void C2S_AcceptTask_7805(AdventureMsg.C2S_AcceptTask_7805 msg, String source) {
      AdventureData data = this.getAdventureData(msg.getCode());
      if (data == null) {
         this.logger.info("接取的任务为空");
         this.player.failure(18000);
      } else {
         ChapterAdventureModel model = (ChapterAdventureModel)this.player.getGameModelPool().getEntity("chapterAdventure", data.taskId);
         if (data.state != CommonMsg.TaskState.STATE_WAIT_RECEIVE.getNumber()) {
            this.logger.info("任务状态不对：" + data.state);
            this.player.failure(18001);
         } else {
            ResourceModel needResourceModel = new ResourceModel(1, PlayerDefine.PLAYER_INFOMATION, model.getCost());
            if (this.isActivityTime()) {
               needResourceModel = new ResourceModel(1, PlayerDefine.PLAYER_INFOMATION, model.getActivityCost());
            }

            if (!this.player.checkResourceNum(needResourceModel)) {
               this.logger.info("情报不够:" + needResourceModel.getValue());
               this.player.failure(18002);
            } else {
               List<Integer> heroCodeList = msg.getHeroCodeList();
               if (!this.isEnableHeroStarAndNation(heroCodeList, data)) {
                  this.logger.info("英雄不满足条件");
                  this.player.failure(18003);
               } else {
                  data.state = CommonMsg.TaskState.STATE_DOING.getNumber();
                  data.acceptTime = System.currentTimeMillis();
                  data.heroCodes.addAll(heroCodeList);
                  this.updateAdventureDao();
                  this.player.delResource(needResourceModel, 18, 1802, 0, 0, "");
                  this.player.triggerTask(110, 0, 1L, 1);
                  this.player.triggerTask(212, model.getQuality(), 1L, 3);
                  AdventureMsg.S2C_AcceptTaskResult_7806.Builder builder = AdventureMsg.S2C_AcceptTaskResult_7806.newBuilder();
                  builder.setResult(1);
                  builder.setInfo(this.getAdventureTaskInfo(data));
                  this.player.sendMsg(builder.build());
                  String[] rewardInfo = LogOperationMgr.toRewardsInfo(model.getRewardItems());
                  this.player.getOperationMgr().addExtraLog(this.player, 104, model.getQuality() + "", rewardInfo[0], rewardInfo[1], rewardInfo[2], needResourceModel.getValue() + "", this.player.getPlayerDao().getProperty(PlayerDefine.PLAYER_INFOMATION) + "");
                  String[] activityPointArr = ApplicationContextProvider.getConfigString("AdventuresPoints", "").split("\\|");
                  SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
                  specialTaskActivityPart.addPoint(1170, Integer.parseInt(activityPointArr[model.getQuality() - 1]));
               }
            }
         }
      }
   }

   public boolean isEnableHeroStarAndNation(List<Integer> heroCodeList, AdventureData data) {
      ChapterAdventureModel model = (ChapterAdventureModel)this.player.getGameModelPool().getEntity("chapterAdventure", data.taskId);
      if (model == null) {
         return false;
      } else {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         AdventureDao adventureDao = (AdventureDao)this.player.getData("tb_adventure", this.player.getPlayerId());
         List<Integer> taskHeroCodeList = new ArrayList();

         for(Map.Entry<String, AdventureData> entry : adventureDao.jsonData.entrySet()) {
            taskHeroCodeList.addAll(((AdventureData)entry.getValue()).heroCodes);
         }

         for(Integer heroCode : heroCodeList) {
            if (taskHeroCodeList.contains(heroCode)) {
               this.logger.info("英雄已经被使用过，{}", heroCode);
               return false;
            }
         }

         boolean haveNation1 = false;
         Iterator var17 = heroCodeList.iterator();

         while(true) {
            if (var17.hasNext()) {
               Integer code = (Integer)var17.next();
               HeroDao heroDao = heroBagPart.getHeroByCode(code);
               if (heroDao == null) {
                  return false;
               }

               if (HeroModel.isReplacementHero(heroDao.id)) {
                  return false;
               }

               if (heroDao.getStar() < model.getStar()) {
                  continue;
               }

               haveNation1 = true;
            }

            boolean haveNation2 = false;

            for(Integer code : heroCodeList) {
               HeroDao heroDao = heroBagPart.getHeroByCode(code);
               if (heroDao == null) {
                  return false;
               }

               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
               if (model.getNation() == heroModel.getNation()) {
                  haveNation2 = true;
                  break;
               }
            }

            boolean haveNation3 = false;
            if (model.getNation2() < 1) {
               haveNation3 = true;
            } else {
               for(Integer code : heroCodeList) {
                  HeroDao heroDao = heroBagPart.getHeroByCode(code);
                  if (heroDao == null) {
                     return false;
                  }

                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                  if (model.getNation2() == heroModel.getNation()) {
                     haveNation3 = true;
                     break;
                  }
               }
            }

            return haveNation1 && haveNation2 && haveNation3;
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_AccelerateTask_7807(AdventureMsg.C2S_AccelerateTask_7807 msg, String source) {
      String code = msg.getCode();
      AdventureDao adventureDao = (AdventureDao)this.player.getData("tb_adventure", this.player.getPlayerId());
      AdventureData data = this.getAdventureData(code);
      if (data == null) {
         this.logger.info("加速任务为空:" + code);
         this.player.failure(18000);
      } else if (data.state != CommonMsg.TaskState.STATE_DOING.getNumber()) {
         this.logger.info("任务状态不对");
         this.player.failure(18001);
      } else {
         ChapterAdventureConfigModel configModel = (ChapterAdventureConfigModel)this.player.getGameModelPool().getEntity("chapterAdventureConfig", this.getPrivilegeLv());
         ChapterAdventureModel chapterAdventureModel = (ChapterAdventureModel)ApplicationContextProvider.getModelPoolEntity("chapterAdventure", data.taskId);
         long currentTime = System.currentTimeMillis();
         long needTime = (long)chapterAdventureModel.getTimes();
         long runTime = (long)((int)(currentTime - data.acceptTime) / 1000);
         int needGold = 0;
         if (runTime < needTime) {
            long goldTime = needTime - runTime;
            double hour = (double)goldTime / (double)3600.0F;
            needGold = (int)Math.ceil(hour) * configModel.getAccelerateCost();
            if (needGold < configModel.getAccelerateCostMin()) {
               needGold = configModel.getAccelerateCostMin();
            } else if (needGold > configModel.getAccelerateCostMax()) {
               needGold = configModel.getAccelerateCostMax();
            }

            if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, needGold)) {
               this.logger.info("金币不够");
               this.player.failure(18004);
               return;
            }
         }

         data.state = CommonMsg.TaskState.STATE_COMPLETE.getNumber();
         this.updateAdventureDao();
         this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)needGold, 18, 1801, 0, 0, "");
         PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
         playerLogPart.logAdventureTask(data.taskId, data.state, 18, 1801, needGold, 0, "");
         this.takeTask(adventureDao, data, chapterAdventureModel);
      }
   }

   @MsgHandlerAnno
   public void C2S_TakeTask_7809(AdventureMsg.C2S_TakeTask_7809 msg, String source) {
      AdventureDao adventureDao = (AdventureDao)this.player.getData("tb_adventure", this.player.getPlayerId());
      AdventureData data = this.getAdventureData(msg.getCode());
      if (data == null) {
         this.logger.info("领取奖励为空:" + msg.getCode());
         this.player.failure(18000);
      } else {
         ChapterAdventureModel model = (ChapterAdventureModel)this.player.getGameModelPool().getEntity("chapterAdventure", data.taskId);
         if (model == null) {
            adventureDao.jsonData.remove(msg.getCode());
            adventureDao.updateOp();
         } else {
            this.check(data);
            if (data.state != CommonMsg.TaskState.STATE_COMPLETE.getNumber()) {
               this.logger.info("任务状态不对");
               this.player.failure(18001);
            } else {
               this.takeTask(adventureDao, data, model);
            }
         }
      }
   }

   public void takeTask(AdventureDao adventureDao, AdventureData data, ChapterAdventureModel model) {
      List<ResourceModel> rewards = model.getRewardItems();
      this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 18, 1803, data.taskId, 0, "");
      adventureDao.jsonData.remove(data.code);
      this.updateAdventureDao();
      PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
      playerLogPart.logAdventureTask(data.taskId, data.state, 18, 1803, 0, 0, Convert.toStr(rewards));
      AdventureMsg.S2C_TakeTaskResult_7810.Builder builder = AdventureMsg.S2C_TakeTaskResult_7810.newBuilder();
      builder.setResult(1);
      builder.setCode(data.code);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_TakeAllTask_7811(AdventureMsg.C2S_TakeAllTask_7811 msg, String source) {
      AdventureDao adventureDao = (AdventureDao)this.player.getData("tb_adventure", this.player.getPlayerId());
      List<ResourceModel> rewardList = new ArrayList();
      List<String> codes = new ArrayList();
      Iterator<AdventureData> iterator = adventureDao.jsonData.values().iterator();
      PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);

      while(iterator.hasNext()) {
         AdventureData data = (AdventureData)iterator.next();
         ChapterAdventureModel model = (ChapterAdventureModel)this.player.getGameModelPool().getEntity("chapterAdventure", data.taskId);
         if (model == null) {
            iterator.remove();
            this.updateAdventureDao();
         } else {
            this.check(data);
            if (data.state == CommonMsg.TaskState.STATE_COMPLETE.getNumber()) {
               playerLogPart.logAdventureTask(data.taskId, data.state, 18, 1803, 0, 0, Convert.toStr(model.getRewardItems()));
               rewardList.addAll(model.getRewardItems());
               codes.add(data.code);
               iterator.remove();
               this.updateAdventureDao();
            }
         }
      }

      this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 18, 1803, 0, 0, "");
      AdventureMsg.S2C_TakeAllTaskResult_7812.Builder builder = AdventureMsg.S2C_TakeAllTaskResult_7812.newBuilder();
      builder.setResult(1);

      for(String code : codes) {
         builder.addCodes(code);
      }

      this.player.sendMsg(builder.build());
   }

   public void initTask() {
      AdventureDao dao = (AdventureDao)this.player.getData("tb_adventure", this.player.getPlayerId());
      ChapterAdventureConfigModel configModel = (ChapterAdventureConfigModel)this.player.getGameModelPool().getEntity("chapterAdventureConfig", this.getPrivilegeLv());
      long currentTime = System.currentTimeMillis();

      for(Integer taskId : configModel.getDefaultList()) {
         ChapterAdventureModel chapterAdventureModel = (ChapterAdventureModel)this.player.getGameModelPool().getEntity("chapterAdventure", taskId);
         AdventureData newData = new AdventureData();
         newData.code = chapterAdventureModel.getId() + "_" + currentTime;
         newData.taskId = chapterAdventureModel.getId();
         newData.state = CommonMsg.TaskState.STATE_WAIT_RECEIVE.getNumber();
         newData.acceptTime = 0L;
         dao.jsonData.put(newData.code, newData);
      }

      dao.updateOp();
   }

   public void flushTask(boolean isMust) {
      ChapterAdventureConfigModel configModel = (ChapterAdventureConfigModel)this.player.getGameModelPool().getEntity("chapterAdventureConfig", this.getPrivilegeLv());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int usedFreeNum = (Integer)playerResetCustomCache.getDailyNum(123, 0);
      boolean isFree = false;
      boolean isItem = false;
      if (usedFreeNum < configModel.getFreeTimes()) {
         isFree = true;
      } else if (this.player.checkResourceNum((ResourceModel)configModel.getCosts().get(0))) {
         isItem = true;
      } else if (!this.player.checkResourceNum((ResourceModel)configModel.getCosts().get(1))) {
         this.logger.info("既没有免费次数，有没有令牌,还没有金子");
         this.player.failure(18005);
         return;
      }

      AdventureDao dao = (AdventureDao)this.player.getData("tb_adventure", this.player.getPlayerId());
      if (!isMust) {
         for(AdventureData data : dao.jsonData.values()) {
            if (data.state == 0) {
               ChapterAdventureModel chapterAdventureModel = (ChapterAdventureModel)this.player.getGameModelPool().getEntity("chapterAdventure", data.taskId);
               if (chapterAdventureModel.getQuality() >= 4) {
                  this.logger.info("玩家,刷新太快，有4星以上任务，需要确定，taskId={}", data.taskId);
                  return;
               }
            }
         }
      }

      Iterator<AdventureData> iterator = dao.jsonData.values().iterator();

      while(iterator.hasNext()) {
         if (((AdventureData)iterator.next()).state == CommonMsg.TaskState.STATE_WAIT_RECEIVE.getNumber()) {
            iterator.remove();
         }
      }

      int RedAdventurestask = this.configManager.getIntDefault("RedAdventurestask", 15);
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      boolean isOpenSixQuality = false;
      boolean isRedAdventures = false;
      if (playerExtend.adventureFlushNum >= RedAdventurestask) {
         isOpenSixQuality = true;
         if (!playerExtend.iisCompletedFirstSixAdventureTask()) {
            int RedAdventurestask1 = this.configManager.getIntDefault("RedAdventurestask1", 25);
            if (playerExtend.adventureFlushNum >= RedAdventurestask1) {
               isRedAdventures = true;
            }
         }
      }

      ++playerExtend.adventureFlushNum;
      this.player.updatePlayerExtend(13);
      List<ChapterAdventureModel> newTaskList = this.getNewTaskList(isOpenSixQuality, isFree, dao, isRedAdventures);
      long currentTime = System.currentTimeMillis();
      List<String> newTaskStrList = new ArrayList();

      for(ChapterAdventureModel chapterAdventureModel : newTaskList) {
         AdventureData newData = new AdventureData();
         newData.code = chapterAdventureModel.getId() + "_" + currentTime;
         newData.taskId = chapterAdventureModel.getId();
         newData.state = CommonMsg.TaskState.STATE_WAIT_RECEIVE.getNumber();
         newData.acceptTime = 0L;
         dao.jsonData.put(newData.code, newData);
         newTaskStrList.add(newData.code);
      }

      dao.updateOp();
      int useItemNum = 0;
      int useGoldNum = 0;
      if (isFree) {
         playerResetCustomCache.addDailyReset(123, 1);
      } else if (isItem) {
         this.player.delResource((ResourceModel)configModel.getCosts().get(0), 18, 1804, 0, 0, "");
         playerResetCustomCache.addDailyReset(124, 1);
         useItemNum = 1;
      } else {
         this.player.delResource((ResourceModel)configModel.getCosts().get(1), 18, 1804, 0, 0, "");
         playerResetCustomCache.addDailyReset(124, 1);
         useGoldNum = 1;
      }

      this.player.triggerTask(511, 0, 1L, 1);
      PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
      playerLogPart.logAdventureTask(0, 1, 18, 1804, usedFreeNum, isItem ? 1 : 0, Convert.toStr(newTaskStrList));
      this.player.getOperationMgr().addExtraLog(this.player, 103, String.valueOf(useItemNum), String.valueOf(useGoldNum));
   }

   public List<ChapterAdventureModel> getNewTaskList(boolean isOpenSixQuality, boolean isFree, AdventureDao dao, boolean isRedAdventures) {
      ChapterAdventureConfigModel configModel = (ChapterAdventureConfigModel)this.player.getGameModelPool().getEntity("chapterAdventureConfig", this.getPrivilegeLv());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int usedTotalNum = (Integer)playerResetCustomCache.getDailyNum(124, 0);
      if (!isFree) {
         ++usedTotalNum;
      }

      Map<Integer, List<ChapterAdventureModel>> oldGroupMap = this.player.getGameModelPool().getMap("customChapterAdventureGroup");
      int playerLv = this.player.getPlayerDao().lv;
      Map<Integer, List<ChapterAdventureModel>> newGroupMap = new HashMap();
      Map<Integer, Integer> newProbMap = new HashMap();

      for(Map.Entry<Integer, List<ChapterAdventureModel>> entry : oldGroupMap.entrySet()) {
         List<ChapterAdventureModel> newList = new ArrayList();
         int prob = 0;

         for(ChapterAdventureModel model : entry.getValue()) {
            if (playerLv >= model.getOpenLevel()) {
               newList.add(model);
            }

            prob += model.getOdds();
         }

         newGroupMap.put(entry.getKey(), newList);
         newProbMap.put(entry.getKey(), prob);
      }

      List<ChapterAdventureModel> resultList = new ArrayList();
      int sixQualityNum = 0;

      for(Map.Entry<Integer, List<ChapterAdventureModel>> entry : newGroupMap.entrySet()) {
         int group = (Integer)entry.getKey();
         List<ChapterAdventureModel> tempList = (List)entry.getValue();
         int quality = this.getPrivilegeQuality(configModel, usedTotalNum);
         if (quality > 0 && group == 1) {
            for(ChapterAdventureModel chapterAdventureModel : tempList) {
               if (chapterAdventureModel.getQuality() == quality) {
                  if (chapterAdventureModel.getQuality() == 6) {
                     ++sixQualityNum;
                  }

                  resultList.add(chapterAdventureModel);
                  break;
               }
            }
         } else {
            if (group == 6) {
               int minimumAdventure4 = this.configManager.getIntDefault("minimumAdventure4", 18);
               if (sixQualityNum == 0 && (dao.noSixQualityNum >= minimumAdventure4 || isRedAdventures)) {
                  if (isRedAdventures) {
                     int FristRedAdventure = this.configManager.getIntDefault("FristRedAdventure", 6602);
                     ChapterAdventureModel chapterAdventureModel = (ChapterAdventureModel)this.player.getGameModelPool().getEntity("chapterAdventure", FristRedAdventure);
                     resultList.add(chapterAdventureModel);
                  } else {
                     int minimumAdventure2 = this.configManager.getIntDefault("minimumAdventure2", 100);
                     int r_num = RandomUtil.randInt(minimumAdventure2);
                     if (dao.noSixQualityNum >= r_num) {
                        List<Integer> minimumAdventure3List = this.configManager.getIntList("minimumAdventure3");
                        int r_id = RandomUtil.randInt(minimumAdventure3List.size());
                        int id = (Integer)minimumAdventure3List.get(r_id);
                        ChapterAdventureModel model = (ChapterAdventureModel)this.player.getGameModelPool().getEntity("chapterAdventure", id);
                        resultList.add(model);
                        dao.noSixQualityNum = 0;
                        dao.updateOp();
                        continue;
                     }
                  }
               }

               if (sixQualityNum == 0) {
                  ++dao.noSixQualityNum;
               } else {
                  dao.noSixQualityNum = 0;
               }

               dao.updateOp();
            }

            int totalProb = (Integer)newProbMap.get(group);
            int r = RandomUtil.randInt(totalProb);
            int tempAddProb = 0;

            for(ChapterAdventureModel chapterAdventureModel : tempList) {
               tempAddProb += chapterAdventureModel.getOdds();
               if (r < tempAddProb) {
                  if (chapterAdventureModel.getQuality() == 6 && !isOpenSixQuality) {
                     ChapterAdventureModel fiveMode = (ChapterAdventureModel)this.player.getGameModelPool().getEntity("chapterAdventure", chapterAdventureModel.getSix2five());
                     resultList.add(fiveMode);
                     break;
                  }

                  if (chapterAdventureModel.getQuality() == 6) {
                     ++sixQualityNum;
                  }

                  resultList.add(chapterAdventureModel);
                  break;
               }
            }
         }
      }

      List<Integer> fourStarProtectList = this.configManager.getIntList("minimumAdventure");
      int fourStarProtectNum = (Integer)fourStarProtectList.get(0);
      int fourStarProtectQuality = (Integer)fourStarProtectList.get(1);
      List<Integer> minimumAdventure_1_List = this.configManager.getIntList("minimumAdventure1");
      int fourStarAppointNum = (Integer)minimumAdventure_1_List.get(0);
      int fourStarAppointQuality = (Integer)minimumAdventure_1_List.get(1);
      int fourStarAppointItemId = (Integer)minimumAdventure_1_List.get(2);
      int fourStarProtecQualityNum = 0;
      int fourStarAppointQualityNum = 0;
      boolean isFourStarProtect = false;
      boolean isFourStarAppoint = false;

      for(ChapterAdventureModel model : resultList) {
         if (model.getStar() >= fourStarProtectQuality) {
            ++fourStarProtecQualityNum;
         }

         if (model.getStar() == fourStarAppointQuality) {
            ++fourStarAppointQualityNum;
         }
      }

      if (fourStarProtecQualityNum == 0) {
         int noStarNum = (Integer)playerResetCustomCache.getDailyNum(125, 0);
         if (noStarNum >= fourStarProtectNum) {
            isFourStarProtect = true;
            ++fourStarAppointQualityNum;
            playerResetCustomCache.setDailyReset(125, 0);
         } else {
            playerResetCustomCache.addDailyReset(125, 1);
         }
      } else {
         playerResetCustomCache.setDailyReset(125, 0);
      }

      if (fourStarAppointQualityNum > 0) {
         int fourStarNum = (Integer)playerResetCustomCache.getDailyNum(126, 0);
         if (fourStarNum >= fourStarAppointNum) {
            isFourStarAppoint = true;
            playerResetCustomCache.setDailyReset(126, 0);
         } else {
            playerResetCustomCache.addDailyReset(126, 1);
         }
      }

      if (isFourStarAppoint && isFourStarProtect) {
         ChapterAdventureModel chapterAdventureModel = (ChapterAdventureModel)this.player.getGameModelPool().getEntity("chapterAdventure", fourStarAppointItemId);
         resultList.set(0, chapterAdventureModel);
      } else if (isFourStarAppoint) {
         ChapterAdventureModel chapterAdventureModel = (ChapterAdventureModel)this.player.getGameModelPool().getEntity("chapterAdventure", fourStarAppointItemId);

         for(int i = 0; i < resultList.size(); ++i) {
            if (((ChapterAdventureModel)resultList.get(i)).getQuality() == fourStarAppointQuality) {
               resultList.set(i, chapterAdventureModel);
               break;
            }
         }
      } else if (isFourStarProtect) {
         Map<Integer, List<ChapterAdventureModel>> qualityMap = this.player.getGameModelPool().getMap("customChapterAdventureQuality4");
         List<ChapterAdventureModel> list = (List)qualityMap.get(fourStarProtectQuality);
         ChapterAdventureModel model = (ChapterAdventureModel)list.get(RandomUtil.randInt(list.size()));
         ChapterAdventureModel chapterAdventureModel = (ChapterAdventureModel)this.player.getGameModelPool().getEntity("chapterAdventure", model.getId());
         resultList.set(0, chapterAdventureModel);
      }

      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (!playerExtend.iisCompletedFirstSixAdventureTask()) {
         int index = 0;
         boolean isHaveSixQuality = false;

         for(ChapterAdventureModel model : resultList) {
            if (model.getQuality() == 6) {
               isHaveSixQuality = true;
               break;
            }

            ++index;
         }

         if (isHaveSixQuality) {
            int FristRedAdventure = this.configManager.getIntDefault("FristRedAdventure", 6602);
            ChapterAdventureModel chapterAdventureModel = (ChapterAdventureModel)this.player.getGameModelPool().getEntity("chapterAdventure", FristRedAdventure);
            resultList.set(index, chapterAdventureModel);
            playerExtend.completedFirstSixAdventureTask();
            this.player.updatePlayerExtend(13);
         }
      }

      return resultList;
   }

   private int getPrivilegeQuality(ChapterAdventureConfigModel configModel, int useNum) {
      for(Map.Entry<Integer, KeyValFun> entry : configModel.getFlushNumMap().entrySet()) {
         if (((KeyValFun)entry.getValue()).getKey() == useNum) {
            return ((KeyValFun)entry.getValue()).getVal();
         }
      }

      return 0;
   }

   public void check(AdventureData data) {
      ChapterAdventureModel chapterAdventureModel = (ChapterAdventureModel)ApplicationContextProvider.getModelPoolEntity("chapterAdventure", data.taskId);
      long currentTime = System.currentTimeMillis();
      if (data.state == CommonMsg.TaskState.STATE_DOING.getNumber() && currentTime - data.acceptTime >= (long)(chapterAdventureModel.getTimes() * 1000)) {
         data.state = CommonMsg.TaskState.STATE_COMPLETE.getNumber();
         this.updateAdventureDao();
      }

   }

   public void sendTaskList() {
      AdventureMsg.S2C_OpenAdventureUiResult_7802.Builder result_builder = AdventureMsg.S2C_OpenAdventureUiResult_7802.newBuilder();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int usedFreeNum = (Integer)playerResetCustomCache.getDailyNum(123, 0);
      result_builder.setUseFreeNum(usedFreeNum);
      result_builder.setIsActivity(this.isActivityTime());
      AdventureDao adventureDao = (AdventureDao)this.player.getData("tb_adventure", this.player.getPlayerId());
      result_builder.addAllQuality(adventureDao.qualityLv);
      List<String> notIdList = new ArrayList();

      for(Map.Entry<String, AdventureData> entry : adventureDao.jsonData.entrySet()) {
         ChapterAdventureModel chapterAdventureModel = (ChapterAdventureModel)ApplicationContextProvider.getModelPoolEntity("chapterAdventure", ((AdventureData)entry.getValue()).taskId);
         if (chapterAdventureModel != null) {
            this.check((AdventureData)entry.getValue());
            result_builder.addInfos(this.getAdventureTaskInfo((AdventureData)entry.getValue()));
         } else {
            notIdList.add(entry.getKey());
         }
      }

      if (!notIdList.isEmpty()) {
         for(String code : notIdList) {
            adventureDao.jsonData.remove(code);
         }

         adventureDao.updateOp();
      }

      this.player.sendMsg(result_builder.build());
   }

   public AdventureMsg.TaskInfo.Builder getAdventureTaskInfo(AdventureData data) {
      AdventureMsg.TaskInfo.Builder info_builder = AdventureMsg.TaskInfo.newBuilder();
      info_builder.setCode(data.code);
      info_builder.setState(data.state);
      info_builder.setTaskId(data.taskId);
      info_builder.setAcceptTime(data.acceptTime);
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);

      for(Integer heroCode : data.heroCodes) {
         HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
         if (heroDao != null) {
            info_builder.addHeroInfos(this.toAdventureHero(heroDao));
         }
      }

      return info_builder;
   }

   public AdventureMsg.AdventureHero.Builder toAdventureHero(HeroDao heroDao) {
      AdventureMsg.AdventureHero.Builder builder = AdventureMsg.AdventureHero.newBuilder();
      builder.setCode(heroDao.code);
      builder.setId(heroDao.id);
      builder.setStar(heroDao.getStar());
      return builder;
   }

   public void updateAdventureDao() {
      AdventureDao adventureDao = (AdventureDao)this.player.getData("tb_adventure", this.player.getPlayerId());
      adventureDao.updateOp();
   }

   public AdventureData getAdventureData(String id) {
      AdventureDao adventureDao = (AdventureDao)this.player.getData("tb_adventure", this.player.getPlayerId());
      return (AdventureData)adventureDao.jsonData.get(id);
   }

   public int getPrivilegeLv() {
      int lv = 0;
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.privilege_adventure_luxury > 0) {
         lv = 2;
      } else if (playerDao.privilege_adventure_senior > 0) {
         lv = 1;
      }

      return lv;
   }

   public boolean isActivityTime() {
      SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
      int activityId = specialTaskActivityPart.getPlayerActivityId();
      return activityId == 1170;
   }

   public int completedFastTask(int num, long currentTime) {
      AdventureDao adventureDao = (AdventureDao)this.player.getData("tb_adventure", this.player.getPlayerId());
      TreeMap<Integer, List<AdventureData>> qualityMap = new TreeMap();

      for(Map.Entry<String, AdventureData> entry : adventureDao.jsonData.entrySet()) {
         ChapterAdventureModel chapterAdventureModel = (ChapterAdventureModel)ApplicationContextProvider.getModelPoolEntity("chapterAdventure", ((AdventureData)entry.getValue()).taskId);
         if (chapterAdventureModel != null && ((AdventureData)entry.getValue()).state == 0) {
            List<AdventureData> list = (List)MapUtil.getOrDefault(qualityMap, chapterAdventureModel.getQuality(), new ArrayList());
            list.add(entry.getValue());
            qualityMap.put(chapterAdventureModel.getQuality(), list);
         }
      }

      int taskNum = 0;
      if (!qualityMap.isEmpty()) {
         for(Map.Entry<Integer, List<AdventureData>> entry : qualityMap.entrySet()) {
            for(AdventureData data : entry.getValue()) {
               if (taskNum >= num) {
                  break;
               }

               ++taskNum;
               data.state = 1;
               data.acceptTime = currentTime;
               this.player.triggerTask(212, (Integer)entry.getKey(), 1L, 3);
            }
         }
      }

      return taskNum;
   }
}
