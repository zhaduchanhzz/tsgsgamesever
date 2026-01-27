package com.gzbz.db;

import com.gzbz.scan.GameServerScan;
import db.DBDao;
import db.DBPool;
import db.DBTableNode;
import debug.AppArgs;
import debug.Debug;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import scan.ScanAnnotation;
import thread.ThreadFactroyUtil;

@Component
@DependsOn({"gameDefine"})
public class GameDBPool extends DBPool {
   Logger logger = LoggerFactory.getLogger(GameDBPool.class);
   @Value("${DBGamePath}")
   private String filePath;
   @Value("${DBCorePoolSize}")
   private int DBCorePoolSize;
   @Value("${DBMaximumPoolSize}")
   private int DBMaximumPoolSize;
   @Autowired
   private GameServerScan gameServerScan;
   @Value("${ServerId}")
   public int GAME_SERVER_ID;
   @Value("${gameBackFilePath}")
   public String backFilePath;
   private ExecutorService executor;

   protected ExecutorService getService() {
      return this.executor;
   }

   protected String getFilePath() {
      return this.filePath;
   }

   public ScanAnnotation getScanAnnotation() {
      return this.gameServerScan;
   }

   protected String getBackPath() {
      return this.backFilePath;
   }

   public void error(Throwable r) {
      this.logger.warn("游戏数据库出现故障，请及时解决！！！！");
   }

   @PostConstruct
   public void start() {
      super.start();
      if (Debug.isDebug) {
         String jdbcUrlNoParam = this.getHikariConfig().getJdbcUrl().split("\\?")[0];
         String dbName = jdbcUrlNoParam.substring(jdbcUrlNoParam.lastIndexOf("/") + 1);

         for(DBTableNode table : this.gameServerScan.tableMap.values()) {
            try {
               if (!table.tbName.equals("tb_account") && !table.tbName.equals("tb_union") && !table.tbName.equals("tb_alliance_team")) {
                  if (table.tbName.equals("tb_account_robot")) {
                     super.query(table.createSql(10000), new Object[0]);
                  } else {
                     String createSql = table.createSql();
                     this.logger.info("创建数据sql : " + createSql);
                     super.query(createSql, new Object[0]);
                  }
               } else {
                  super.query(table.createSql(this.GAME_SERVER_ID * 100000), new Object[0]);
               }

               if (AppArgs.isAutoSyncTb) {
                  super.autoSyncTable(dbName, table);
               }
            } catch (Throwable throwable) {
               throwable.printStackTrace();
               this.error(throwable);
               this.connectionPool.close();
               this.logger.error("------------------------------游戏数据库启动失败------------------------------");
               return;
            }
         }
      }

      this.executor = Executors.newFixedThreadPool(this.DBCorePoolSize, new ThreadFactroyUtil("GameDB"));
      ((ThreadPoolExecutor)this.executor).setMaximumPoolSize(this.DBMaximumPoolSize);
      this.logger.info("------------------------------游戏数据库启动成功------------------------------");
   }

   @PreDestroy
   public void destroy() {
      super.destroy();
   }

   public void finishTask(String tbName, byte type) {
      if (DBPool.GlobalSave.get()) {
         if (this.processNum.get() == 0L) {
            this.logger.info("关服保存中...表名{},操作{},剩余次数{}", new Object[]{tbName, DBDao.OP_NAME[type], this.processNum.get()});
            this.logger.info("finishTask:服务器保存成功!!!!!!!!!!!!!!");
            DBPool.GlobalSave.set(false);
            super.closeFile();
         } else {
            this.logger.info("关服保存中...表名{},操作{},剩余次数{}", new Object[]{tbName, DBDao.OP_NAME[type], this.processNum.get()});
         }
      }

   }
}
