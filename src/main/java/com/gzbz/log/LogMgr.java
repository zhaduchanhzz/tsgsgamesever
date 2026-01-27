package com.gzbz.log;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.scan.GameServerScan;
import db.DBDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class LogMgr extends GameMgr {
   static Logger logger = LoggerFactory.getLogger(LogMgr.class);
   @Autowired
   protected ConfigurableApplicationContext context;
   @Autowired
   GameServerScan gameServerScan;
   StringBuilder sqlBuffer = new StringBuilder();
   public static final int SQL_LEN = 0;

   @TaskMethod
   public void addLog(DBDao dao) {
   }

   public void addRecord(ErrorRecordLog log) {
   }

   public static void checkLog(DBDao dao) {
   }

   public void queryRecordAndSend(GamePlayer gamePlayer, int recordId, int playerId) {
   }

   protected void init() {
   }
}
