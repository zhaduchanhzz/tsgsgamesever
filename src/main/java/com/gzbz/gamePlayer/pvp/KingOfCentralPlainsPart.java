package com.gzbz.gamePlayer.pvp;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.KingOfCentralPlainsMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.time.DayOfWeek;
import java.time.LocalDate;
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
public class KingOfCentralPlainsPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(KingOfCentralPlainsPart.class);
   @Autowired
   KingOfCentralPlainsMgr kingOfCentralPlainsMgr;
   @Autowired
   ConfigManager configManager;

   public void loginHandle() {
      super.loginHandle();
      LocalDate localDate = LocalDate.now();
      if (localDate.getDayOfWeek() != DayOfWeek.WEDNESDAY && localDate.getDayOfWeek() != DayOfWeek.THURSDAY) {
         if (this.player.isSystemOpen(1500)) {
            this.kingOfCentralPlainsMgr.pushTaskEx("S2C_ActivityState_9652", new Object[]{this.player});
         }

      }
   }

   public void resetDaily() {
      super.resetDaily();
      if (this.player.isSystemOpen(1500)) {
         this.kingOfCentralPlainsMgr.pushTaskEx("popSeasonTopThreeForLogin", new Object[]{this.player});
         LocalDate localDate = LocalDate.now();
         if (localDate.getDayOfWeek() == DayOfWeek.WEDNESDAY || localDate.getDayOfWeek() == DayOfWeek.THURSDAY) {
            return;
         }

         this.kingOfCentralPlainsMgr.pushTaskEx("S2C_ActivityState_9652", new Object[]{this.player});
      }

   }

   @MsgHandlerAnno
   public void C2S_ActivityState_9651(KingOfCentralPlainsMsg.C2S_ActivityState_9651 msg, String source) {
      if (this.player.isSystemOpen(1500)) {
         this.kingOfCentralPlainsMgr.pushTaskEx("S2C_ActivityState_9652", new Object[]{this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_RoundAndState_9649(KingOfCentralPlainsMsg.C2S_RoundAndState_9649 msg, String source) {
      if (this.player.isSystemOpen(1500)) {
         this.kingOfCentralPlainsMgr.pushTaskEx("S2C_RoundAndState_9650", new Object[]{this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_MyFightUi_9601(KingOfCentralPlainsMsg.C2S_MyFightUi_9601 msg, String source) {
      if (this.player.isSystemOpen(1500)) {
         this.kingOfCentralPlainsMgr.pushTaskEx("S2C_MyFightResult_9602", new Object[]{this.player.getPlayerId()});
      }
   }

   @MsgHandlerAnno
   public void C2S_GuessUi_9611(KingOfCentralPlainsMsg.C2S_GuessUi_9611 msg, String source) {
      if (this.player.isSystemOpen(1500)) {
         this.kingOfCentralPlainsMgr.pushTaskEx("C2S_GuessUi_9611", new Object[]{this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_Guess_9613(KingOfCentralPlainsMsg.C2S_Guess_9613 msg, String source) {
      if (this.player.isSystemOpen(1500)) {
         int wagerSide = msg.getWagerSide();
         int wagerNum = msg.getWagerNum();
         if (wagerNum <= 0) {
            this.logger.info("下注数量错误，num={}", wagerNum);
         } else {
            int heroRivalGuessChipMax = this.configManager.getIntDefault("heroRivalGuessChipMax", 3500);
            if (wagerNum > heroRivalGuessChipMax) {
               this.logger.info("押注筹码超出最大限制，限制={}，押注={}", heroRivalGuessChipMax, wagerNum);
            } else {
               this.kingOfCentralPlainsMgr.pushTaskEx("guess", new Object[]{this.player, wagerSide, wagerNum});
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GuessRecord_9617(KingOfCentralPlainsMsg.C2S_GuessRecord_9617 msg, String source) {
      this.kingOfCentralPlainsMgr.pushTaskEx("S2C_GuessRecordResult_9618", new Object[]{this.player});
   }

   @MsgHandlerAnno
   public void C2S_GuessRecordAll_9619(KingOfCentralPlainsMsg.C2S_GuessRecordAll_9619 msg, String source) {
      this.kingOfCentralPlainsMgr.pushTaskEx("C2S_GuessRecordAll_9619", new Object[]{this.player});
   }

   @MsgHandlerAnno
   public void C2S_Rank32Ui_9631(KingOfCentralPlainsMsg.C2S_Rank32Ui_9631 msg, String source) {
      this.kingOfCentralPlainsMgr.pushTaskEx("S2C_Rank32UiResult_9632", new Object[]{this.player.getPlayerId()});
   }

   @MsgHandlerAnno
   public void C2S_RankUi_9641(KingOfCentralPlainsMsg.C2S_RankUi_9641 msg, String source) {
      this.kingOfCentralPlainsMgr.pushTaskEx("S2C_RankUiResult_9642", new Object[]{this.player});
   }

   @MsgHandlerAnno
   public void C2S_SeasonTopThree_9643(KingOfCentralPlainsMsg.C2S_SeasonTopThree_9643 msg, String source) {
      if (this.player.isSystemOpen(1500)) {
         this.kingOfCentralPlainsMgr.pushTaskEx("S2C_SeasonTopThreeResult_9644", new Object[]{this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_PlayerKCPSettle_9661(KingOfCentralPlainsMsg.C2S_PlayerKCPSettle_9661 msg, String source) {
      this.kingOfCentralPlainsMgr.pushTaskEx("C2S_PlayerKCPSettle_9661", new Object[]{this.player});
   }

   @MsgHandlerAnno
   public void C2S_MyRecordUi_9603(KingOfCentralPlainsMsg.C2S_MyRecordUi_9603 msg, String source) {
      this.kingOfCentralPlainsMgr.pushTaskEx("S2C_MyRecordResult_9604", new Object[]{this.player});
   }

   @TaskMethod
   public void runSendAward_highestRank(int rank) {
      this.player.triggerTask(302, rank, 1L, 2);
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.kingTopRank == 0 || playerExtend.kingTopRank > rank) {
         playerExtend.kingTopRank = rank;
         this.player.updatePlayerExtend(13);
      }

   }

   public void levelUp(int preLv, int newLv) {
      SystemFunctionModel model_kingOfCp = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 1500);
      int kingOpenLv = 10;
      if (model_kingOfCp != null) {
         kingOpenLv = model_kingOfCp.getOpenLevel();
      }

      if (preLv < kingOpenLv && newLv >= kingOpenLv) {
         LocalDate localDate = LocalDate.now();
         if (localDate.getDayOfWeek() == DayOfWeek.WEDNESDAY || localDate.getDayOfWeek() == DayOfWeek.THURSDAY) {
            return;
         }

         KingOfCentralPlainsMgr kingOfCentralPlainsMgr = (KingOfCentralPlainsMgr)ApplicationContextProvider.getContext().getBean(KingOfCentralPlainsMgr.class);
         kingOfCentralPlainsMgr.S2C_ActivityState_9652(this.player);
      }

   }
}
