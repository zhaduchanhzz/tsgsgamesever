package com.gzbz.gamePlayer.clickGold;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.part.SpecialTaskActivityPart;
import com.gzbz.db.BattleChapterDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.log.PlayerLogPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ClickGoldModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ClickGoldMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import misc.DateUtil;
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
public class ClickGoldPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(ClickGoldPart.class);
   @Autowired
   ConfigManager configManager;

   public void resetHour() {
      int currentHour = DateUtil.cHour();
      if (currentHour == 0 || currentHour == 9 || currentHour == 19) {
         this.playerReset();
      }

   }

   private void playerReset() {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      playerResetCustomCache.setForever(241, 0);
      playerResetCustomCache.setForever(242, 0);
      playerResetCustomCache.setForever(243, 0);
      playerResetCustomCache.setForever(244, System.currentTimeMillis());
      this.S2C_OpenUiResult_8202();
   }

   public void loginHandle() {
      long curTime = System.currentTimeMillis();
      int hour = DateUtil.hour(curTime);
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      long oldTime = (Long)playerResetCustomCache.getForeverNum(244, 0L);
      if (oldTime == 0L) {
         this.playerReset();
      } else {
         if (hour >= 19) {
            int deltTime = 68400000;
            if (DateUtil.isSameDay(oldTime - (long)deltTime, curTime - (long)deltTime)) {
               return;
            }
         } else if (hour >= 9) {
            int deltTime = 32400000;
            if (DateUtil.isSameDay(oldTime - (long)deltTime, curTime - (long)deltTime)) {
               return;
            }
         } else if (DateUtil.isSameDay(oldTime, curTime)) {
            return;
         }

         this.playerReset();
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenUi_8201(ClickGoldMsg.C2S_OpenUi_8201 msg, String source) {
      this.S2C_OpenUiResult_8202();
   }

   @MsgHandlerAnno
   public void C2S_Click_8203(ClickGoldMsg.C2S_Click_8203 msg, String source) {
      ClickGoldMsg.ClickGoldType type = msg.getType();
      if (type != null) {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
         PlayerPublicDao playerDao = this.player.getPublicDao();
         BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
         ClickGoldModel clickGoldModel = (ClickGoldModel)this.player.getGameModelPool().getEntity("clickGoldCfg", battleChapterDao.chapterId + 1);
         if (clickGoldModel == null) {
            this.logger.info("找不到对应关卡的点金数据：" + battleChapterDao.chapterId + 1);
         } else {
            boolean isSuc = false;
            int copper = 0;
            SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
            String[] maxNumArr = configManager.getStr("clickGoldTime").split(",");
            String[] commonMaxNumArr = maxNumArr[0].split("\\|");
            String[] activityMaxNumArr = maxNumArr[1].split("\\|");
            int maxNum = 0;
            if (specialTaskActivityPart.isActivityTime(1210)) {
               maxNum = Integer.parseInt(activityMaxNumArr[type.getNumber() - 1]);
            } else {
               maxNum = Integer.parseInt(commonMaxNumArr[type.getNumber() - 1]);
            }

            LogOperationMgr operationMgr = this.player.getOperationMgr();
            PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
            switch (type) {
               case TYPE_FREE:
                  int freeNum = (Integer)playerResetCustomCache.getForeverNum(241, 0);
                  if (freeNum < maxNum) {
                     if (playerDao.vip_lv > 0) {
                        copper = (Integer)clickGoldModel.getVipFree().get(playerDao.vip_lv);
                     } else {
                        copper = clickGoldModel.getFreeClick();
                     }

                     this.player.addResource(1, PlayerDefine.PLAYER_COPPER, copper, PlayerMsg.ShowType.SHOW_TYPE_EJECT, 24, 2401, 0, 0, "");
                     playerResetCustomCache.addForever(241, 1);
                     playerLogPart.logClickGold(battleChapterDao.chapterId + 1, copper, 24, 2401, playerDao.vip_lv, freeNum, "");
                     isSuc = true;
                  }
                  break;
               case TYPE_LOW:
                  int lowNum = (Integer)playerResetCustomCache.getForeverNum(242, 0);
                  if (lowNum < maxNum) {
                     ResourceModel needLowModel = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, 20);
                     if (!this.player.checkResourceNum(needLowModel)) {
                        return;
                     }

                     if (playerDao.vip_lv > 0) {
                        copper = (Integer)clickGoldModel.getVipLow().get(playerDao.vip_lv);
                     } else {
                        copper = clickGoldModel.getLowClick();
                     }

                     this.player.addResource(1, PlayerDefine.PLAYER_COPPER, copper, PlayerMsg.ShowType.SHOW_TYPE_EJECT, 24, 2402, 0, 0, "");
                     this.player.delResource(needLowModel, 24, 2402, 0, 0, "");
                     playerResetCustomCache.addForever(242, 1);
                     playerLogPart.logClickGold(battleChapterDao.chapterId + 1, copper, 24, 2401, playerDao.vip_lv, lowNum, "");
                     isSuc = true;
                  }
                  break;
               case TYPE_HIGH:
                  int highNum = (Integer)playerResetCustomCache.getForeverNum(243, 0);
                  if (highNum < maxNum) {
                     ResourceModel needHighModel = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, 50);
                     if (!this.player.checkResourceNum(needHighModel)) {
                        return;
                     }

                     if (playerDao.vip_lv > 0) {
                        copper = (Integer)clickGoldModel.getVipHigh().get(playerDao.vip_lv);
                     } else {
                        copper = clickGoldModel.getHighClick();
                     }

                     this.player.addResource(1, PlayerDefine.PLAYER_COPPER, copper, PlayerMsg.ShowType.SHOW_TYPE_EJECT, 24, 2403, 0, 0, "");
                     this.player.delResource(needHighModel, 24, 2403, 0, 0, "");
                     playerResetCustomCache.addForever(243, 1);
                     playerLogPart.logClickGold(battleChapterDao.chapterId + 1, copper, 24, 2401, playerDao.vip_lv, highNum, "");
                     isSuc = true;
                  }
            }

            if (isSuc) {
               this.player.triggerTask(509, 0, 1L, 1);
               String[] activityPointArr = ApplicationContextProvider.getConfigString("LuckyFortune", "").split("\\|");
               specialTaskActivityPart.addPoint(1210, Integer.parseInt(activityPointArr[type.getNumber() - 1]));
            }

            this.S2C_OpenUiResult_8202();
            GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
            guanJiaPart.checkState(1012, (List)null);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OneKeyClick_8205(ClickGoldMsg.C2S_OneKeyClick_8205 msg, String source) {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      ClickGoldModel clickGoldModel = (ClickGoldModel)this.player.getGameModelPool().getEntity("clickGoldCfg", battleChapterDao.chapterId + 1);
      if (clickGoldModel == null) {
         this.logger.info("找不到对应关卡的点金数据：" + battleChapterDao.chapterId + 1);
      } else {
         int clickGoldVipClean = this.configManager.getIntDefault("clickGoldVipClean", 8);
         if (this.player.getPublicDao().vip_lv >= clickGoldVipClean) {
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            PlayerPublicDao playerDao = this.player.getPublicDao();
            SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
            boolean isActivityTime = specialTaskActivityPart.isActivityTime(1210);
            String[] maxNumArr = this.configManager.getStr("clickGoldTime").split(",");
            String[] commonMaxNumArr = maxNumArr[0].split("\\|");
            String[] activityMaxNumArr = maxNumArr[1].split("\\|");
            String[] activityPointArr = ApplicationContextProvider.getConfigString("LuckyFortune", "").split("\\|");
            int needGold = 0;
            int totalActivityScore = 0;
            int low_maxNum = 0;
            int low_copper = 0;
            if (isActivityTime) {
               low_maxNum = Integer.parseInt(activityMaxNumArr[1]);
            } else {
               low_maxNum = Integer.parseInt(commonMaxNumArr[1]);
            }

            int lowNum = (Integer)playerResetCustomCache.getForeverNum(242, 0);
            int enableLowNum = low_maxNum - lowNum;
            if (enableLowNum > 0) {
               if (playerDao.vip_lv > 0) {
                  low_copper = (Integer)clickGoldModel.getVipLow().get(playerDao.vip_lv) * enableLowNum;
               } else {
                  low_copper = clickGoldModel.getLowClick() * enableLowNum;
               }

               needGold += 20 * enableLowNum;
               totalActivityScore += Integer.parseInt(activityPointArr[1]) * enableLowNum;
            }

            int high_maxNum = 0;
            int high_copper = 0;
            if (isActivityTime) {
               high_maxNum = Integer.parseInt(activityMaxNumArr[2]);
            } else {
               high_maxNum = Integer.parseInt(commonMaxNumArr[2]);
            }

            int highNum = (Integer)playerResetCustomCache.getForeverNum(243, 0);
            int enableHighNum = high_maxNum - highNum;
            if (enableHighNum > 0) {
               if (playerDao.vip_lv > 0) {
                  high_copper = (Integer)clickGoldModel.getVipHigh().get(playerDao.vip_lv) * enableHighNum;
               } else {
                  high_copper = clickGoldModel.getHighClick() * enableHighNum;
               }

               needGold += 50 * enableHighNum;
               totalActivityScore += Integer.parseInt(activityPointArr[2]) * enableHighNum;
            }

            int free_maxNum = 0;
            int free_copper = 0;
            if (isActivityTime) {
               free_maxNum = Integer.parseInt(activityMaxNumArr[0]);
            } else {
               free_maxNum = Integer.parseInt(commonMaxNumArr[0]);
            }

            int freeNum = (Integer)playerResetCustomCache.getForeverNum(241, 0);
            int enableFreeNum = free_maxNum - freeNum;
            if (enableFreeNum > 0) {
               if (playerDao.vip_lv > 0) {
                  free_copper = (Integer)clickGoldModel.getVipFree().get(playerDao.vip_lv) * enableFreeNum;
               } else {
                  free_copper = clickGoldModel.getFreeClick() * enableFreeNum;
               }

               totalActivityScore += Integer.parseInt(activityPointArr[0]) * enableFreeNum;
            }

            if (enableFreeNum <= 0 && needGold <= 0) {
               this.player.failure(61189);
            } else {
               if (needGold > 0) {
                  ResourceModel needResource = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, needGold);
                  if (!this.player.checkResourceNum(needResource)) {
                     this.player.failure(61190);
                     return;
                  }

                  this.player.delResource(needResource, 24, 2402, 0, 0, "");
               }

               PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
               if (enableFreeNum > 0) {
                  playerResetCustomCache.addForever(241, enableFreeNum);
                  playerLogPart.logClickGold(battleChapterDao.chapterId + 1, free_copper, 24, 2401, playerDao.vip_lv, freeNum, "");
               }

               if (enableLowNum > 0) {
                  playerResetCustomCache.addForever(242, enableLowNum);
                  playerLogPart.logClickGold(battleChapterDao.chapterId + 1, low_copper, 24, 2402, playerDao.vip_lv, lowNum, "");
               }

               if (enableHighNum > 0) {
                  playerResetCustomCache.addForever(243, enableHighNum);
                  playerLogPart.logClickGold(battleChapterDao.chapterId + 1, high_copper, 24, 2403, playerDao.vip_lv, highNum, "");
               }

               int totalCopper = free_copper + low_copper + high_copper;
               this.player.addResource(1, PlayerDefine.PLAYER_COPPER, totalCopper, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 24, 2404, 0, 0, "");
               int totalGoldClickNum = enableFreeNum + enableLowNum + enableHighNum;
               this.player.triggerTask(509, 0, (long)totalGoldClickNum, 1);
               specialTaskActivityPart.addPoint(1210, totalActivityScore);
               ClickGoldMsg.S2C_OneKeyClick_8206.Builder builder = ClickGoldMsg.S2C_OneKeyClick_8206.newBuilder();
               builder.setResult(1);
               builder.setCopper(totalCopper);
               builder.setGold(needGold);
               this.player.sendMsg(builder.build());
               this.S2C_OpenUiResult_8202();
               GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
               guanJiaPart.checkState(1012, (List)null);
            }
         }
      }
   }

   public void S2C_OpenUiResult_8202() {
      ClickGoldMsg.S2C_OpenUiResult_8202.Builder builder = ClickGoldMsg.S2C_OpenUiResult_8202.newBuilder();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int freeNum = (Integer)playerResetCustomCache.getForeverNum(241, 0);
      int lowNum = (Integer)playerResetCustomCache.getForeverNum(242, 0);
      int highNum = (Integer)playerResetCustomCache.getForeverNum(243, 0);
      long time = (Long)playerResetCustomCache.getForeverNum(244, System.currentTimeMillis());
      builder.addInfos(this.getClickGoldInfo(ClickGoldMsg.ClickGoldType.TYPE_FREE, freeNum));
      builder.addInfos(this.getClickGoldInfo(ClickGoldMsg.ClickGoldType.TYPE_LOW, lowNum));
      builder.addInfos(this.getClickGoldInfo(ClickGoldMsg.ClickGoldType.TYPE_HIGH, highNum));
      this.player.sendMsg(builder.build());
   }

   public ClickGoldMsg.ClickGoldInfo.Builder getClickGoldInfo(ClickGoldMsg.ClickGoldType type, int num) {
      ClickGoldMsg.ClickGoldInfo.Builder infoBuilder = ClickGoldMsg.ClickGoldInfo.newBuilder();
      infoBuilder.setType(type);
      infoBuilder.setNum(num);
      return infoBuilder;
   }

   public void guanJiaOperate(int systemId, int num) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      if (num <= 0) {
         guanJiaPart.checkState(systemId, (List)null);
      } else {
         BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
         ClickGoldModel clickGoldModel = (ClickGoldModel)this.player.getGameModelPool().getEntity("clickGoldCfg", battleChapterDao.chapterId + 1);
         if (clickGoldModel == null) {
            this.logger.info("找不到对应关卡的点金数据：" + battleChapterDao.chapterId + 1);
            guanJiaPart.checkState(systemId, (List)null);
         } else {
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            PlayerPublicDao playerDao = this.player.getPublicDao();
            SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
            boolean isActivityTime = specialTaskActivityPart.isActivityTime(1210);
            String[] maxNumArr = this.configManager.getStr("clickGoldTime").split(",");
            String[] commonMaxNumArr = maxNumArr[0].split("\\|");
            String[] activityMaxNumArr = maxNumArr[1].split("\\|");
            String[] activityPointArr = ApplicationContextProvider.getConfigString("LuckyFortune", "").split("\\|");
            int free_maxNum = 0;
            if (isActivityTime) {
               free_maxNum = Integer.parseInt(activityMaxNumArr[0]);
            } else {
               free_maxNum = Integer.parseInt(commonMaxNumArr[0]);
            }

            int haveFreeNum = (Integer)playerResetCustomCache.getForeverNum(241, 0);
            int enableFreeNum = free_maxNum - haveFreeNum;
            int low_maxNum = 0;
            int low_copper = 0;
            if (isActivityTime) {
               low_maxNum = Integer.parseInt(activityMaxNumArr[1]);
            } else {
               low_maxNum = Integer.parseInt(commonMaxNumArr[1]);
            }

            int haveLowNum = (Integer)playerResetCustomCache.getForeverNum(242, 0);
            int enableLowNum = low_maxNum - haveLowNum;
            int high_maxNum = 0;
            int high_copper = 0;
            if (isActivityTime) {
               high_maxNum = Integer.parseInt(activityMaxNumArr[2]);
            } else {
               high_maxNum = Integer.parseInt(commonMaxNumArr[2]);
            }

            int haveHighNum = (Integer)playerResetCustomCache.getForeverNum(243, 0);
            int enableHighNum = high_maxNum - haveHighNum;
            if (num > enableFreeNum + enableLowNum + enableHighNum) {
               guanJiaPart.checkState(systemId, (List)null);
            } else {
               int needGold = 0;
               int totalActivityScore = 0;
               int free_copper = 0;
               int freeNum = num >= enableFreeNum ? enableFreeNum : num;
               if (freeNum > 0) {
                  if (playerDao.vip_lv > 0) {
                     free_copper = (Integer)clickGoldModel.getVipFree().get(playerDao.vip_lv) * freeNum;
                  } else {
                     free_copper = clickGoldModel.getFreeClick() * freeNum;
                  }

                  totalActivityScore += Integer.parseInt(activityPointArr[0]) * freeNum;
               }

               int needLowNum = num - freeNum;
               int lowNum = 0;
               if (needLowNum > 0) {
                  lowNum = needLowNum >= enableLowNum ? enableLowNum : needLowNum;
                  if (lowNum > 0) {
                     if (playerDao.vip_lv > 0) {
                        low_copper = (Integer)clickGoldModel.getVipLow().get(playerDao.vip_lv) * lowNum;
                     } else {
                        low_copper = clickGoldModel.getLowClick() * lowNum;
                     }

                     needGold += 20 * lowNum;
                     totalActivityScore += Integer.parseInt(activityPointArr[1]) * lowNum;
                  }
               }

               int needHighNum = num - freeNum - lowNum;
               int highNum = 0;
               if (needHighNum > 0) {
                  highNum = needHighNum >= enableLowNum ? enableHighNum : needHighNum;
                  if (highNum > 0) {
                     if (playerDao.vip_lv > 0) {
                        high_copper = (Integer)clickGoldModel.getVipHigh().get(playerDao.vip_lv) * highNum;
                     } else {
                        high_copper = clickGoldModel.getHighClick() * highNum;
                     }

                     needGold += 50 * highNum;
                     totalActivityScore += Integer.parseInt(activityPointArr[2]) * highNum;
                  }
               }

               if (enableFreeNum <= 0 && needGold <= 0) {
                  this.player.failure(61189);
                  guanJiaPart.checkState(systemId, (List)null);
               } else {
                  if (needGold > 0) {
                     ResourceModel needResource = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, needGold);
                     if (!this.player.checkResourceNum(needResource)) {
                        this.player.failure(61190);
                        guanJiaPart.checkState(systemId, (List)null);
                        return;
                     }

                     this.player.delResource(needResource, 24, 2402, 0, 0, "");
                  }

                  PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
                  if (freeNum > 0) {
                     playerResetCustomCache.addForever(241, freeNum);
                     playerLogPart.logClickGold(battleChapterDao.chapterId + 1, free_copper, 24, 2401, playerDao.vip_lv, freeNum, "");
                  }

                  if (lowNum > 0) {
                     playerResetCustomCache.addForever(242, lowNum);
                     playerLogPart.logClickGold(battleChapterDao.chapterId + 1, low_copper, 24, 2402, playerDao.vip_lv, lowNum, "");
                  }

                  if (highNum > 0) {
                     playerResetCustomCache.addForever(243, highNum);
                     playerLogPart.logClickGold(battleChapterDao.chapterId + 1, high_copper, 24, 2403, playerDao.vip_lv, highNum, "");
                  }

                  int totalCopper = free_copper + low_copper + high_copper;
                  ResourceModel addList = new ResourceModel(1, PlayerDefine.PLAYER_COPPER, totalCopper);
                  this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 24, 2404, 0, 0, "");
                  this.player.triggerTask(509, 0, (long)num, 1);
                  specialTaskActivityPart.addPoint(1210, totalActivityScore);
                  ClickGoldMsg.S2C_OneKeyClick_8206.Builder builder = ClickGoldMsg.S2C_OneKeyClick_8206.newBuilder();
                  builder.setResult(1);
                  builder.setCopper(totalCopper);
                  builder.setGold(needGold);
                  this.player.sendMsg(builder.build());
                  this.S2C_OpenUiResult_8202();
                  List<ResourceModel> rewardList = new ArrayList();
                  rewardList.add(addList);
                  guanJiaPart.checkState(systemId, rewardList);
               }
            }
         }
      }
   }

   public void advertisementVnClickGold() {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      ClickGoldModel clickGoldModel = (ClickGoldModel)this.player.getGameModelPool().getEntity("clickGoldCfg", battleChapterDao.chapterId + 1);
      if (clickGoldModel == null) {
         this.logger.error("玩家【{}】越南广告点金奖励领取失败,获取不到{}的点金配置", this.player.getPlayerId(), battleChapterDao.chapterId + 1);
      } else {
         PlayerDao playerDao = this.player.getPlayerDao();
         int copper;
         if (playerDao.vip_lv > 0) {
            copper = (Integer)clickGoldModel.getVipHigh().get(playerDao.vip_lv);
         } else {
            copper = clickGoldModel.getHighClick();
         }

         this.player.addResource(1, PlayerDefine.PLAYER_COPPER, copper, PlayerMsg.ShowType.SHOW_TYPE_EJECT, 122, 12201, 0, 0, "clickGold");
         this.player.triggerTask(509, 0, 1L, 1);
         String[] activityPointArr = ApplicationContextProvider.getConfigString("LuckyFortune", "").split("\\|");
         SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
         specialTaskActivityPart.addPoint(1210, Integer.parseInt(activityPointArr[2]));
      }
   }
}
