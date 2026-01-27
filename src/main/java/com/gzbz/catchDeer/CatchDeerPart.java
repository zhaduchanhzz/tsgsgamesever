package com.gzbz.catchDeer;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.db.PvpDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CatchDeerMsg;
import com.gzbz.protobuf.CrossCatchDeerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.time.DayOfWeek;
import java.time.LocalDate;
import net.CrossSubscribeMsg;
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
public class CatchDeerPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(CatchDeerPart.class);
   @Autowired
   ConfigManager configManager;
   @Autowired
   CatchDeerMgr catchDeerMgr;

   public void loginHandle() {
      if (this.player.isSystemOpen(1500)) {
         LocalDate localDate = LocalDate.now();
         if (localDate.getDayOfWeek() != DayOfWeek.SATURDAY && localDate.getDayOfWeek() != DayOfWeek.SUNDAY && localDate.getDayOfWeek() != DayOfWeek.MONDAY) {
            this.catchDeerMgr.S2CR_ActivityState_15451(this.player.getPlayerId());
         }
      }
   }

   public boolean loginHandleAsync() {
      return true;
   }

   public void resetDaily() {
      if (this.player.isSystemOpen(1500)) {
         LocalDate localDate = LocalDate.now();
         if (localDate.getDayOfWeek() != DayOfWeek.SATURDAY && localDate.getDayOfWeek() != DayOfWeek.SUNDAY && localDate.getDayOfWeek() != DayOfWeek.MONDAY) {
            this.catchDeerMgr.S2CR_ActivityState_15451(this.player.getPlayerId());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ActivityState_15351(CatchDeerMsg.C2S_ActivityState_15351 msg, String source) {
      if (this.player.isSystemOpen(1500)) {
         this.catchDeerMgr.S2CR_ActivityState_15451(this.player.getPlayerId());
      }
   }

   @MsgHandlerAnno
   public void C2S_RoundAndState_15349(CatchDeerMsg.C2S_RoundAndState_15349 msg, String source) {
      if (this.player.isSystemOpen(1500)) {
         this.catchDeerMgr.S2CR_RoundAndState_15475(this.player.getPlayerId());
      }
   }

   @MsgHandlerAnno
   public void C2S_MyFightUi_15301(CatchDeerMsg.C2S_MyFightUi_15301 msg, String source) {
      if (this.player.isSystemOpen(1500)) {
         this.catchDeerMgr.S2CR_MyFightUi_15401(this.player.getPlayerId());
      }
   }

   @MsgHandlerAnno
   public void C2S_GuessUi_15311(CatchDeerMsg.C2S_GuessUi_15311 msg, String source) {
      if (this.player.isSystemOpen(1500)) {
         this.catchDeerMgr.S2CR_GuessUi_15411(this.player.getPlayerId());
      }
   }

   @MsgHandlerAnno
   public void C2S_Guess_15313(CatchDeerMsg.C2S_Guess_15313 msg, String source) {
      if (this.player.isSystemOpen(1500)) {
         int wagerSide = msg.getWagerSide();
         int wagerNum = msg.getWagerNum();
         if (wagerNum <= 0) {
            logger.info("下注数量错误，num={}", wagerNum);
         } else {
            int heroRivalGuessChipMax = this.configManager.getIntDefault("heroRivalGuessChipMax", 3500);
            if (wagerNum > heroRivalGuessChipMax) {
               logger.info("押注筹码超出最大限制，限制={}，押注={}", heroRivalGuessChipMax, wagerNum);
            } else {
               this.catchDeerMgr.S2CR_Guess_15413(this.player.getPlayerId(), wagerSide, wagerNum);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GuessRecord_15317(CatchDeerMsg.C2S_GuessRecord_15317 msg, String source) {
      this.catchDeerMgr.S2CR_GuessRecord_15417(this.player.getPlayerId());
   }

   @MsgHandlerAnno
   public void C2S_GuessRecordAll_15319(CatchDeerMsg.C2S_GuessRecordAll_15319 msg, String source) {
      this.catchDeerMgr.S2CR_GuessRecordAll_15419(this.player.getPlayerId());
   }

   @MsgHandlerAnno
   public void C2S_Rank32Ui_15331(CatchDeerMsg.C2S_Rank32Ui_15331 msg, String source) {
      this.catchDeerMgr.S2CR_Rank32Ui_15431(this.player.getPlayerId());
   }

   @MsgHandlerAnno
   public void C2S_RankUi_15341(CatchDeerMsg.C2S_RankUi_15341 msg, String source) {
      PvpDao pvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
      this.catchDeerMgr.S2CR_RankUi_15441(this.player.getPlayerId(), pvpDao.deerThumbsUps);
   }

   @MsgHandlerAnno
   public void C2S_SeasonTopThree_15343(CatchDeerMsg.C2S_SeasonTopThree_15343 msg, String source) {
      if (this.player.isSystemOpen(1500)) {
         PvpDao pvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         this.catchDeerMgr.S2CR_SeasonTopThree_15443(this.player.getPlayerId(), playerExtend.deerTopRank, pvpDao.deerThumbsUps);
      }
   }

   @MsgHandlerAnno
   public void C2S_PlayerKCPSettle_15361(CatchDeerMsg.C2S_PlayerKCPSettle_15361 msg, String source) {
      this.catchDeerMgr.S2CR_PlayerKCPSettle_15461(this.player.getPlayerId());
   }

   @MsgHandlerAnno
   public void C2S_MyRecordUi_15303(CatchDeerMsg.C2S_MyRecordUi_15303 msg, String source) {
      this.catchDeerMgr.S2CR_MyRecordUi_15403(this.player.getPlayerId());
   }

   @MsgHandlerAnno
   public void C2S_ThumbsUp_15365(CatchDeerMsg.C2S_ThumbsUp_15365 msg, String source) {
      PvpDao pvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
      if (pvpDao.deerThumbsUps.size() >= this.configManager.getInt("duelLikeLimit")) {
         logger.info("点赞数满了,次数={}", pvpDao.deerThumbsUps.size());
         this.player.failure(10005);
      } else if (pvpDao.deerThumbsUps.contains(msg.getBeThumbsUpId())) {
         logger.info("已经点过赞了,ID={}", msg.getBeThumbsUpId());
         this.player.failure(10004);
      } else {
         this.catchDeerMgr.S2CR_ThumbsUp_15465(this.player.getPlayerId(), msg.getBeThumbsUpId());
      }
   }

   @MsgHandlerAnno
   public void CR2S_PlayerInfo_15466(CrossCatchDeerMsg.CR2S_PlayerInfo_15466 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.getResult() == 1) {
         PvpDao pvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
         pvpDao.deerThumbsUps.add(msg.getBeThumbsUpId());
         pvpDao.updateOp();
         CatchDeerMsg.S2C_ThumbsUp_15366.Builder builder = CatchDeerMsg.S2C_ThumbsUp_15366.newBuilder();
         builder.setResult(1);
         builder.setBeThumbsUpId(msg.getBeThumbsUpId());
         builder.setThumbsUpNum(pvpDao.deerThumbsUps.size());
         this.player.sendMsg(builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_PlayerInfo_15367(CatchDeerMsg.C2S_PlayerInfo_15367 msg, String source) {
      this.catchDeerMgr.S2CR_PlayerInfo_15467(this.player, msg.getPlayerId(), msg.getServerId());
   }

   @MsgHandlerAnno
   public void C2S_BattleRecordData_15369(CatchDeerMsg.C2S_BattleRecordData_15369 msg, String source) {
      this.catchDeerMgr.S2CR_BattleRecordData_15469(this.player.getPlayerId(), msg.getRecordId());
   }

   @TaskMethod
   public void runSendAward_highestRank(int rank) {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.deerTopRank == 0 || playerExtend.deerTopRank > rank) {
         playerExtend.deerTopRank = rank;
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
         CatchDeerMgr catchDeerMgr = (CatchDeerMgr)ApplicationContextProvider.getContext().getBean(CatchDeerMgr.class);
         catchDeerMgr.S2CR_ActivityState_15451(this.player.getPlayerId());
      }

   }
}
