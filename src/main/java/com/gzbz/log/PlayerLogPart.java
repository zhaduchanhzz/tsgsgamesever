package com.gzbz.log;

import allMgr.PartAnnotation;
import cn.hutool.core.convert.Convert;
import com.gzbz.db.MailDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import java.sql.Timestamp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class PlayerLogPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(PlayerLogPart.class);

   public void logTongQue(int code, int chValue, int module, int reason, int misc1, int misc2, String misc3) {
      TongqueLog log = new TongqueLog();
      log.playerId = this.player.getPlayerId();
      log.code = code;
      log.chValue = chValue;
      log.module = module;
      log.reason = reason;
      log.misc1 = misc1;
      log.misc2 = misc2;
      log.misc3 = misc3;
      log.createTime = new Timestamp(System.currentTimeMillis());
      LogMgr.checkLog(log);
      this.player.getLogMgr().pushTask(() -> this.player.getLogMgr().addLog(log));
   }

   public void logArtifact(int code, int chValue, int module, int reason, int misc1, int misc2, String misc3) {
      ArtifactLog log = new ArtifactLog();
      log.playerId = this.player.getPlayerId();
      log.code = code;
      log.chValue = chValue;
      log.module = module;
      log.reason = reason;
      log.misc1 = misc1;
      log.misc2 = misc2;
      log.misc3 = misc3;
      log.createTime = new Timestamp(System.currentTimeMillis());
      LogMgr.checkLog(log);
      this.player.getLogMgr().pushTask(() -> this.player.getLogMgr().addLog(log));
   }

   public void logMail(MailDao mailDao, int chValue) {
      MailLog log = new MailLog();
      log.playerId = this.player.getPlayerId();
      log.code = mailDao.code;
      log.chValue = chValue;
      log.module = mailDao.module;
      log.reason = mailDao.reason;
      log.misc1 = mailDao.type;
      log.misc2 = mailDao.state;
      String mark = mailDao.title + "@" + mailDao.context + "@" + mailDao.enableTime + "@" + Convert.toStr(mailDao.items);
      log.misc3 = mark;
      log.createTime = new Timestamp(System.currentTimeMillis());
      LogMgr.checkLog(log);
      this.player.getLogMgr().pushTask(() -> this.player.getLogMgr().addLog(log));
   }

   public void logChapter(int chapterId, int chValue, int module, int reason, int misc1, int misc2, String misc3) {
      ChapterLog log = new ChapterLog();
      log.playerId = this.player.getPlayerId();
      log.code = chapterId;
      log.chValue = chValue;
      log.module = module;
      log.reason = reason;
      log.misc1 = misc1;
      log.misc2 = misc2;
      log.misc3 = misc3;
      log.createTime = new Timestamp(System.currentTimeMillis());
      LogMgr.checkLog(log);
      this.player.getLogMgr().pushTask(() -> this.player.getLogMgr().addLog(log));
   }

   public void logAdventureTask(int code, int chValue, int module, int reason, int misc1, int misc2, String misc3) {
      AdventureTaskLog log = new AdventureTaskLog();
      log.playerId = this.player.getPlayerId();
      log.code = code;
      log.chValue = chValue;
      log.module = module;
      log.reason = reason;
      log.misc1 = misc1;
      log.misc2 = misc2;
      log.misc3 = misc3;
      log.createTime = new Timestamp(System.currentTimeMillis());
      LogMgr.checkLog(log);
      this.player.getLogMgr().pushTask(() -> this.player.getLogMgr().addLog(log));
   }

   public void logClickGold(int code, int chValue, int module, int reason, int misc1, int misc2, String misc3) {
      ClickGoldLog log = new ClickGoldLog();
      log.playerId = this.player.getPlayerId();
      log.code = code;
      log.chValue = chValue;
      log.module = module;
      log.reason = reason;
      log.misc1 = misc1;
      log.misc2 = misc2;
      log.misc3 = misc3;
      log.createTime = new Timestamp(System.currentTimeMillis());
      LogMgr.checkLog(log);
      this.player.getLogMgr().pushTask(() -> this.player.getLogMgr().addLog(log));
   }
}
