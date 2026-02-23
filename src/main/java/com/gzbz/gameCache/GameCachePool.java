package com.gzbz.gameCache;

import cache.CachePool;
import cache.CustomCachePoolNode;
import com.gzbz.db.AccountDao;
import com.gzbz.db.AllianceTeamDao;
import com.gzbz.db.GameDBPool;
import com.gzbz.db.UnionDao;
import com.gzbz.scan.GameServerScan;
import db.DBPool;
import db.DBTableNode;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class GameCachePool extends CachePool {
   static Logger logger = LoggerFactory.getLogger(GameCachePool.class);
   @Autowired
   private GameServerScan gameServerScan;
   @Autowired
   private GameDBPool gameDBPool;

   @PostConstruct
   public void start() {
   }

   @PreDestroy
   public void destroy() {
   }

   public DBTableNode getDBTableNode(String tableName) {
      return this.gameServerScan.getTableNode(tableName);
   }

   public DBTableNode getDBTableNode(Class cls) {
      return this.gameServerScan.getTableNode(cls);
   }

   protected DBPool getDbPool() {
      return this.gameDBPool;
   }

   protected CustomCachePoolNode getCustomCacheNode(String tableName) {
      return this.gameServerScan.getCustomCachePoolNode(tableName);
   }

   public <V> void insertDao(V dao, boolean sync) {
      super.insertDao(dao, sync);
      if (sync) {
         DBTableNode tableNode = this.getDBTableNode(dao.getClass());
         int increaseStart = this.gameDBPool.GAME_SERVER_ID * 100000;

         try {
            switch (tableNode.tbName) {
               case "tb_account":
                  AccountDao accountDao = (AccountDao)dao;
                  int curIncreaseVal = accountDao.playerId;
                  if (this.getDbPool().reviseAutoIncrease(tableNode.tbName, curIncreaseVal, increaseStart)) {
                     this.deleteDao(dao, true);
                     accountDao.playerId = 0;
                     super.insertDao(accountDao, true);
                     if (accountDao.playerId < increaseStart) {
                        throw new RuntimeException("错误的玩家id:" + accountDao.playerId);
                     }
                  }
                  break;
               case "tb_union":
                  UnionDao unionDao = (UnionDao)dao;
                   curIncreaseVal = unionDao.unionId;
                  if (this.getDbPool().reviseAutoIncrease(tableNode.tbName, curIncreaseVal, increaseStart)) {
                     this.deleteDao(dao, true);
                     unionDao.unionId = 0;
                     super.insertDao(unionDao, true);
                     if (unionDao.unionId < increaseStart) {
                        throw new RuntimeException("错误的军团id:" + unionDao.unionId);
                     }
                  }
                  break;
               case "tb_alliance_team":
                  AllianceTeamDao allianceTeamDao = (AllianceTeamDao)dao;
                   curIncreaseVal = allianceTeamDao.teamId;
                  if (this.getDbPool().reviseAutoIncrease(tableNode.tbName, curIncreaseVal, increaseStart)) {
                     this.deleteDao(dao, true);
                     allianceTeamDao.teamId = 0;
                     super.insertDao(allianceTeamDao, true);
                     if (allianceTeamDao.teamId < increaseStart) {
                        throw new RuntimeException("错误的合纵连横队伍id:" + allianceTeamDao.teamId);
                     }
                  }
            }
         } catch (Throwable throwable) {
            this.getDbPool().error(throwable);
            throwable.printStackTrace();
            throw new RuntimeException(throwable);
         }
      }

   }
}
