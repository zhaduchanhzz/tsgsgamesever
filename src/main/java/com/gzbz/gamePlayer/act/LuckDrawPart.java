package com.gzbz.gamePlayer.act;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.LuckDrawDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroRecruitmentPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.HeroEmployeeModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.LuckyDrawModel;
import com.gzbz.model.QualityColorModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.LuckDrawMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
public class LuckDrawPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(LuckDrawPart.class);
   @Autowired
   ConfigManager configManager;

   public void loginHandle() {
      if (this.isEnable()) {
         LuckDrawTaskPart luckDrawTaskPart = (LuckDrawTaskPart)this.player.getMgrPart(LuckDrawTaskPart.class);
         Map<Integer, TaskData> taskDataMap = luckDrawTaskPart.getTasksMap();
         if (taskDataMap == null || taskDataMap.isEmpty() || taskDataMap.size() <= 3) {
            luckDrawTaskPart.trigger();
         }

         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         if (playerExtend.iisCompletedLuckDraw()) {
            LuckDrawDao luckDrawDao = this.getLuckDrawDao();
            luckDrawDao.drawRound = 4;
            luckDrawDao.step = 1;
            luckDrawDao.heros.clear();
            luckDrawDao.takedIds.clear();
            luckDrawDao.updateOp();
            playerExtend.reseteLuckDraw();
            this.player.updatePlayerExtend(13);
         }
      }

   }

   public void initData() {
      LuckDrawTaskPart luckDrawTaskPart = (LuckDrawTaskPart)this.player.getMgrPart(LuckDrawTaskPart.class);
      luckDrawTaskPart.trigger();
      this.openMainUi();
   }

   public void openMainUi() {
      LuckDrawDao luckDrawDao = this.getLuckDrawDao();
      LuckDrawMsg.S2C_OpenUi_12702.Builder builder = LuckDrawMsg.S2C_OpenUi_12702.newBuilder();
      builder.setRound(luckDrawDao.drawRound);
      builder.addAllTakedId(luckDrawDao.takedIds);

      for(Map.Entry<Integer, List> entry : luckDrawDao.heros.entrySet()) {
         LuckDrawMsg.StepHeros.Builder infoBuilder = LuckDrawMsg.StepHeros.newBuilder();
         infoBuilder.setStep((Integer)entry.getKey());

         for(Object heroId : (List)entry.getValue()) {
            infoBuilder.addHeroIds((Integer)heroId);
         }

         builder.addStepHeros(infoBuilder);
      }

      LuckDrawTaskPart luckDrawTaskPart = (LuckDrawTaskPart)this.player.getMgrPart(LuckDrawTaskPart.class);
      Map<Integer, TaskData> taskDataMap = luckDrawTaskPart.getTasksMap();

      for(Map.Entry<Integer, TaskData> entry : taskDataMap.entrySet()) {
         builder.addTasks(((TaskData)entry.getValue()).toBuilder());
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_OpenUi_12701(LuckDrawMsg.C2S_OpenUi_12701 msg, String source) {
      if (this.isEnable()) {
         this.openMainUi();
      }
   }

   @MsgHandlerAnno
   public void C2S_Draw_12703(LuckDrawMsg.C2S_Draw_12703 msg, String source) {
      if (this.isEnable()) {
         LuckDrawDao luckDrawDao = this.getLuckDrawDao();
         if (luckDrawDao.drawRound != msg.getRound()) {
            logger.info("领取参数不对，数据库round={},前端round={},step={}", new Object[]{luckDrawDao.drawRound, msg.getRound(), msg.getStep()});
         } else {
            LuckyDrawModel luckyDrawModel = (LuckyDrawModel)this.player.getGameModelPool().getEntity("luckyDraw", luckDrawDao.drawRound);
            if (luckyDrawModel != null) {
               int DrawTime = this.configManager.getIntDefault("DrawTime", 3);
               if (luckDrawDao.heros.size() >= DrawTime) {
                  logger.info("本轮免费抽取次数已经到达最大，次数={}", DrawTime);
               } else if (luckDrawDao.heros.containsKey(msg.getStep())) {
                  logger.info("本轮已经抽取，step={}", msg.getStep());
               } else {
                  int rewardnum = this.configManager.getIntDefault("rewardnum", 1);
                  if (luckDrawDao.takedIds.size() >= rewardnum) {
                     logger.info("本轮奖励已经领取完，round={}，rewarNum={}", luckDrawDao.drawRound, luckDrawDao.takedIds.size());
                  } else {
                     HeroRecruitmentPart heroRecruitmentPart = (HeroRecruitmentPart)this.player.getMgrPart(HeroRecruitmentPart.class);
                     int typeId = HeroDefine.HERO_RECRUITMENT[3][1];
                     HeroEmployeeModel heroEmployeeModel = (HeroEmployeeModel)this.player.getGameModelPool().getEntity("heroEmployee", typeId);
                     List<HeroModel> heroModelList = heroRecruitmentPart.getHeroList(HeroMsg.RecruitmentType.INTEGRAL, HeroMsg.NumType.TEN_TIMES, 10, -1, heroEmployeeModel);
                     if (heroModelList != null && !heroModelList.isEmpty()) {
                        boolean isSameNationFiveStar = false;
                        List<Integer> fiveStarNationList = new ArrayList();
                        if (!luckDrawDao.heros.isEmpty()) {
                           for(Map.Entry<Integer, List> entry : luckDrawDao.heros.entrySet()) {
                              for(Object o : (List)entry.getValue()) {
                                 int heroId = (Integer)o;
                                 HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroId);
                                 if (heroModel.getStar() == 5) {
                                    fiveStarNationList.add(heroModel.getNation());
                                    break;
                                 }
                              }
                           }

                           if (!fiveStarNationList.isEmpty()) {
                              for(HeroModel heroModel : heroModelList) {
                                 if (heroModel.getStar() == 5 && fiveStarNationList.contains(heroModel.getNation())) {
                                    isSameNationFiveStar = true;
                                 }
                              }
                           }

                           if (isSameNationFiveStar) {
                              PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
                              int heroEmployeeHeroLock = this.configManager.getInt("heroEmployeeHeroLock");
                              boolean isNeedCheck = false;
                              if (playerExtend.professionalNum < heroEmployeeHeroLock) {
                                 isNeedCheck = true;
                              }

                              for(int i = 0; i < heroModelList.size(); ++i) {
                                 HeroModel heroModel = (HeroModel)heroModelList.get(i);
                                 if (heroModel.getStar() == 5) {
                                    HeroModel newHeroModel = null;
                                    int loop = 0;

                                    do {
                                       int heroId = heroRecruitmentPart.getRecruitmentHeroId(5, playerExtend);
                                       newHeroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroId);
                                       ++loop;
                                    } while(loop <= 10000 && (isNeedCheck && (newHeroModel.getNation() == 4 || newHeroModel.getNation() == 5) || fiveStarNationList.contains(newHeroModel.getNation())));

                                    logger.info("幸运十连抽,前{}次抽到武将={},替换={},loop={},神魔限制={}", new Object[]{playerExtend.professionalNum, heroModel.getName(), newHeroModel.getName(), loop, heroEmployeeHeroLock});
                                    heroModelList.set(i, newHeroModel);
                                 }
                              }

                              this.player.updatePlayerExtend(13);
                           }
                        }

                        List<Integer> heroIdList = new ArrayList();

                        for(HeroModel heroModel : heroModelList) {
                           heroIdList.add(heroModel.getId());
                        }

                        luckDrawDao.heros.put(msg.getStep(), heroIdList);
                        luckDrawDao.updateOp();
                        LuckDrawMsg.S2C_Draw_12704.Builder builder = LuckDrawMsg.S2C_Draw_12704.newBuilder();
                        builder.setResult(1);
                        LuckDrawMsg.StepHeros.Builder infoBuilder = LuckDrawMsg.StepHeros.newBuilder();
                        infoBuilder.setStep(msg.getStep());
                        infoBuilder.addAllHeroIds(heroIdList);
                        builder.setStepHeros(infoBuilder);
                        this.player.sendMsg(builder.build());
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TakeReward_12705(LuckDrawMsg.C2S_TakeReward_12705 msg, String source) {
      if (this.isEnable()) {
         LuckDrawDao luckDrawDao = this.getLuckDrawDao();
         if (luckDrawDao.drawRound != msg.getRound()) {
            logger.info("领取参数不对，数据库round={},step={},前端round={},step={}", new Object[]{luckDrawDao.drawRound, luckDrawDao.step, msg.getRound(), msg.getStep()});
         } else {
            LuckyDrawModel luckyDrawModel = (LuckyDrawModel)this.player.getGameModelPool().getEntity("luckyDraw", luckDrawDao.drawRound);
            if (luckyDrawModel != null) {
               LuckDrawTaskPart luckDrawTaskPart = (LuckDrawTaskPart)this.player.getMgrPart(LuckDrawTaskPart.class);
               TaskData taskData = luckDrawTaskPart.getTask(luckyDrawModel.getId());
               if (taskData != null && taskData.state == 2) {
                  if (luckDrawDao.heros.size() < 3) {
                     logger.error("本轮还有奖励没有抽取，size={}", luckDrawDao.heros.size());
                     this.player.failure(61137);
                  } else if (luckDrawDao.takedIds.contains(msg.getStep())) {
                     logger.info("奖励ID已经领取，round={}，ID={}", new Object[]{luckDrawDao.drawRound, msg.getStep(), luckDrawDao.takedIds.size()});
                  } else if (!luckDrawDao.heros.containsKey(msg.getStep())) {
                     logger.info("还没有抽取奖励，round={},ID={}", luckDrawDao.drawRound, msg.getStep());
                  } else {
                     int rewardnum = this.configManager.getIntDefault("rewardnum", 1);
                     if (luckDrawDao.takedIds.size() >= rewardnum) {
                        logger.info("本轮所有奖励已经领取完，round={}，takedIds={}", luckDrawDao.drawRound, luckDrawDao.takedIds);
                     } else {
                        List heroList = (List)luckDrawDao.heros.get(msg.getStep());
                        if (heroList != null && !heroList.isEmpty()) {
                           List<HeroModel> heroModelList = new ArrayList();

                           for(Object heroId : heroList) {
                              HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroId);
                              if (heroModel != null) {
                                 heroModelList.add(heroModel);
                              }
                           }

                           List<HeroModel> fiveStarList = new ArrayList();
                           List<ResourceModel> heroIdList = new ArrayList();

                           for(HeroModel heroModel : heroModelList) {
                              heroIdList.add(new ResourceModel(3, heroModel.getId(), 1));
                              if (heroModel.getStar() == 5) {
                                 fiveStarList.add(heroModel);
                              }
                           }

                           LanguageModel model = (LanguageModel)this.player.getGameModelPool().getEntity("language", "luckDraw");
                           this.player.addResource(heroIdList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 4, 432, 0, 0, "");

                           for(HeroModel heroModel : fiveStarList) {
                              LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "SeniorRecruitment");
                              LanguageModel languageModel_deep = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "SeniorRecruitment_deep");
                              QualityColorModel qualityColorModel = (QualityColorModel)this.player.getGameModelPool().getEntity("qualityColor", heroModel.getQuality());
                              String format = MessageFormat.format(languageModel.getValue(), this.player.getPublicDao().playerName, model.getValue(), qualityColorModel.getColor(), heroModel.getName());
                              String format_deep = MessageFormat.format(languageModel_deep.getValue(), this.player.getPublicDao().playerName, model.getValue(), qualityColorModel.getColor(), heroModel.getName());
                              ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
                              chatMgr.pushTaskEx("sendSystem", new Object[]{4, 2, this.player.getPlayerId(), this.player.getPublicDao().playerName, format});
                              chatMgr.pushTaskEx("sendSystem", new Object[]{4, 5, this.player.getPlayerId(), this.player.getPublicDao().playerName, format_deep});
                           }

                           luckDrawDao.takedIds.add(msg.getStep());
                           luckDrawDao.updateOp();
                           boolean isTakedAllReward = false;
                           if (luckDrawDao.takedIds.size() >= rewardnum) {
                              ++luckDrawDao.drawRound;
                              luckDrawDao.takedIds.clear();
                              luckDrawDao.heros.clear();
                              luckDrawDao.updateOp();
                              LuckyDrawModel newLuckyDrawModel = (LuckyDrawModel)this.player.getGameModelPool().getEntity("luckyDraw", luckDrawDao.drawRound);
                              if (newLuckyDrawModel == null) {
                                 PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
                                 playerExtend.completedLuckDraw_new();
                                 this.player.updatePlayerExtend(13);
                                 luckDrawTaskPart.deleteTask();
                                 isTakedAllReward = true;
                              }
                           }

                           LuckDrawMsg.S2C_TakeReward_12706.Builder builder = LuckDrawMsg.S2C_TakeReward_12706.newBuilder();
                           builder.setResult(1);
                           builder.setRound(luckDrawDao.drawRound);
                           builder.addAllTakedId(luckDrawDao.takedIds);

                           for(Map.Entry<Integer, List> entry : luckDrawDao.heros.entrySet()) {
                              LuckDrawMsg.StepHeros.Builder infoBuilder = LuckDrawMsg.StepHeros.newBuilder();
                              infoBuilder.setStep((Integer)entry.getKey());

                              for(Object heroId : (List)entry.getValue()) {
                                 infoBuilder.addHeroIds((Integer)heroId);
                              }

                              builder.addStepHeros(infoBuilder);
                           }

                           builder.setIsTakedAllReward(isTakedAllReward);
                           this.player.sendMsg(builder.build());
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void updateTask(List<TaskData> taskDataList) {
      LuckDrawMsg.S2C_UpdateTask_12708.Builder builder = LuckDrawMsg.S2C_UpdateTask_12708.newBuilder();

      for(TaskData taskData : taskDataList) {
         builder.addTasks(taskData.toBuilder());
      }

      this.player.sendMsg(builder.build());
   }

   public void takeSuccess(int taskId) {
      logger.info("【幸运十连抽】领取任务成功：taskId={}", taskId);
   }

   public LuckDrawDao getLuckDrawDao() {
      LuckDrawDao luckDrawDao = (LuckDrawDao)this.player.getData("tb_luck_draw", this.player.getPlayerId());
      if (luckDrawDao.drawRound < 1) {
         luckDrawDao.drawRound = 1;
         luckDrawDao.updateOp();
      }

      if (luckDrawDao.step < 1) {
         luckDrawDao.step = 1;
         luckDrawDao.updateOp();
      }

      return luckDrawDao;
   }

   private boolean isEnable() {
      if (!this.player.isSystemOpen(3000)) {
         return false;
      } else {
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         return !playerExtend.iisCompletedLuckDraw_new();
      }
   }

   public void resetLuckDraw() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      playerExtend.reseteLuckDraw_new();
      LuckDrawDao luckDrawDao = this.getLuckDrawDao();
      luckDrawDao.drawRound = 1;
      luckDrawDao.step = 1;
      luckDrawDao.heros.clear();
      luckDrawDao.takedIds.clear();
      luckDrawDao.updateOp();
      this.openMainUi();
   }

   public void levelUp(int preLv, int newLv) {
      SystemFunctionModel model_luckDraw = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 3000);
      int luckDrawLv = model_luckDraw.getOpenLevel();
      if (luckDrawLv > 0 && preLv < luckDrawLv && newLv >= luckDrawLv) {
         this.initData();
      }

   }
}
