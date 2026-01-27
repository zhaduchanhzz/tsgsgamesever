package com.gzbz.gamePlayer.heroPart;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.HeroModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CrossHeroCommentMsg;
import com.gzbz.protobuf.HeroCommentMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.util.WordsFilter;
import com.gzbz.worldMgr.WorldMgr;
import java.util.List;
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
public class HeroCommentPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(HeroCommentPart.class);
   @Autowired
   CrossNettyClient crossNettyClient;
   @Autowired
   ConfigManager configManager;
   @Autowired
   private WorldMgr worldMgr;
   public static final String chinese = "[一-龥]";

   @MsgHandlerAnno
   public void C2S_OpenUi_8301(HeroCommentMsg.C2S_OpenUi_8301 msg, String source) {
      this.S2C_OpenUiResult_8302(msg.getHeroId(), msg.getType());
   }

   @MsgHandlerAnno
   public void C2S_Click_8303(HeroCommentMsg.C2S_Click_8303 msg, String source) {
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", msg.getHeroId());
      if (heroModel == null) {
         logger.info("玩家{}点击喜欢请求英雄ID错误，ID={}", this.player.getPlayerId(), msg.getHeroId());
      } else {
         CrossHeroCommentMsg.S2CR_Click_8353.Builder builder = CrossHeroCommentMsg.S2CR_Click_8353.newBuilder();
         builder.setHeroId(msg.getHeroId());
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_Comment_8305(HeroCommentMsg.C2S_Comment_8305 msg, String source) {
      if (!this.player.isSystemOpen(1600)) {
         this.player.failure(20);
      } else {
         boolean isEnableComment = false;
         List<Integer> heroDislimit1 = this.configManager.getIntList("heroDislimit1");
         if (heroDislimit1.size() < 2) {
            logger.error("英雄评论config表heroDislimit1配置错误");
         } else {
            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            int rank = rankPart.getRank(RankDefine.RankModule.COMBAT_POWER);
            int lv = this.player.getPublicDao().lv;
            if ((Integer)heroDislimit1.get(1) > 0) {
               if (lv >= (Integer)heroDislimit1.get(0) && rank > 0 && rank <= (Integer)heroDislimit1.get(1)) {
                  isEnableComment = true;
               }
            } else if (lv >= (Integer)heroDislimit1.get(0)) {
               isEnableComment = true;
            }

            if (!isEnableComment) {
               List<Integer> heroDislimit2 = this.configManager.getIntList("heroDislimit2");
               if (heroDislimit2.size() < 2) {
                  logger.error("英雄评论config表heroDislimit2配置错误");
                  return;
               }

               if ((Integer)heroDislimit2.get(1) > 0) {
                  if (lv >= (Integer)heroDislimit2.get(0) && rank > 0 && rank <= (Integer)heroDislimit2.get(1)) {
                     isEnableComment = true;
                  }
               } else if (lv >= (Integer)heroDislimit2.get(0)) {
                  isEnableComment = true;
               }
            }

            if (!isEnableComment) {
               this.player.failure(61156);
            } else {
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", msg.getHeroId());
               if (heroModel == null) {
                  logger.info("玩家{}发表评论请求英雄ID错误，ID={}", this.player.getPlayerId(), msg.getHeroId());
               } else if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_PALACE) {
                  this.player.failure(76042);
               } else if (msg.getContext().isEmpty()) {
                  this.player.failure(0);
               } else {
                  int length = this.chineseLength(msg.getContext());
                  if (length <= 80 && length >= 10) {
                     if (WordsFilter.hasBadWords(msg.getContext())) {
                        this.player.failure(58121);
                     } else {
                        CrossHeroCommentMsg.S2CR_Comment_8355.Builder builder = CrossHeroCommentMsg.S2CR_Comment_8355.newBuilder();
                        builder.setHeroId(msg.getHeroId());
                        builder.setContext(msg.getContext());
                        builder.setPlayerName(this.player.getPublicDao().playerName);
                        this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
                     }
                  } else {
                     this.player.failure(58120);
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ThumbsUp_8307(HeroCommentMsg.C2S_ThumbsUp_8307 msg, String source) {
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", msg.getHeroId());
      if (heroModel == null) {
         logger.info("玩家{}点赞请求英雄ID错误，ID={}", this.player.getPlayerId(), msg.getHeroId());
      } else {
         CrossHeroCommentMsg.S2CR_ThumbsUp_8357.Builder builder = CrossHeroCommentMsg.S2CR_ThumbsUp_8357.newBuilder();
         builder.setHeroId(msg.getHeroId());
         builder.setCode(msg.getCode());
         builder.setOperation(msg.getOperation());
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   public void S2C_OpenUiResult_8302(int heroId, int type) {
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroId);
      if (heroModel == null) {
         logger.info("玩家{}打开评论界面请求英雄ID错误，ID={}", this.player.getPlayerId(), heroId);
      } else {
         CrossHeroCommentMsg.S2CR_OpenUi_8351.Builder builder = CrossHeroCommentMsg.S2CR_OpenUi_8351.newBuilder();
         builder.setHeroId(heroId);
         builder.setType(type);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_DelComment_8309(HeroCommentMsg.C2S_DelComment_8309 msg, String source) {
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", msg.getHeroId());
      if (heroModel == null) {
         logger.info("玩家{}删除英雄评论请求英雄ID错误，ID={}", this.player.getPlayerId(), msg.getHeroId());
      } else {
         CrossHeroCommentMsg.S2CR_DelComment_8359.Builder builder = CrossHeroCommentMsg.S2CR_DelComment_8359.newBuilder();
         builder.setHeroId(msg.getHeroId());
         builder.setCode(msg.getCode());
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_ReportComment_8311(HeroCommentMsg.C2S_ReportComment_8311 msg, String source) {
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", msg.getHeroId());
      if (heroModel == null) {
         logger.info("玩家{}举报英雄评论请求英雄ID错误，ID={}", this.player.getPlayerId(), msg.getHeroId());
      } else {
         HeroCommentMsg.C2S_ReportComment_8311.Builder builder = msg.toBuilder();
         builder.setIsSuccess(false);
         int heroReportPara1 = this.configManager.getIntDefault("heroReportPara1", 80);
         int limitLv = this.worldMgr.getWorldLv() * heroReportPara1 / 100;
         if (this.player.getPublicDao().lv >= limitLv) {
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int limitNum = (Integer)playerResetCustomCache.getDailyNum(43, 0);
            int heroReportTimes = this.configManager.getIntDefault("heroReportTimes", 10);
            if (limitNum < heroReportTimes) {
               builder.setIsSuccess(true);
            }
         }

         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void S2S_ReportResult_8313(HeroCommentMsg.S2S_ReportResult_8313 msg, CrossSubscribeMsg crossSubscribeMsg) {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      playerResetCustomCache.addDailyReset(43, 1);
   }

   public int chineseLength(String value) {
      int valueLength = 0;

      for(int i = 0; i < value.length(); ++i) {
         String temp = value.substring(i, i + 1);
         if (temp.matches("[一-龥]")) {
            valueLength += 2;
         } else {
            ++valueLength;
         }
      }

      return valueLength;
   }
}
