package com.gzbz.http;

import cache.CustomCacheData;
import com.alibaba.fastjson.JSONArray;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.battleTest.BattleTestMgr;
import com.gzbz.db.AccountDao;
import com.gzbz.db.GameDBPool;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.db.MailDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.BagParent;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gamePlayer.record.SpecialRecordMgr;
import com.gzbz.log.LogDBPool;
import com.gzbz.model.GameModelPool;
import com.gzbz.protobuf.LoginMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.redis.GameRedisTool;
import com.gzbz.scan.GameServerScan;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.test.BattleIdTestMgr;
import com.gzbz.worldMgr.WorldMgr;
import com.gzbz.worldMgr.WorldMgrPushTaskPart;
import db.DBColumnNode;
import db.DBDao;
import db.DBPool;
import db.DBTableNode;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import misc.DateUtil;
import misc.JsonUtil;
import misc.LoadSelfClass;
import misc.MiscUtil;
import org.redisson.api.RScoredSortedSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemController {
   static Logger logger = LoggerFactory.getLogger(SystemController.class);
   private static final int TYPE_PROPERTY = 1;
   private static final int TYPE_ITEM_BAG = 2;
   private static final int TYPE_HERO_BAG = 3;
   private static final int TYPE_EMAIL = 4;

   @GetMapping({"/gm/testReset"})
   public void testReset() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      WorldMgrPushTaskPart part = (WorldMgrPushTaskPart)worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      part.pushTaskEx("serverHourCheck", new Object[]{System.currentTimeMillis()});
   }

   @GetMapping({"/db/monitor"})
   public void dbMonitor() {
      GameDBPool gameDBPool = (GameDBPool)ApplicationContextProvider.getContext().getBean(GameDBPool.class);
      gameDBPool.printMonitor();
   }

   @GetMapping({"/db/createTb"})
   public String createTb(String tbName) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      DBTableNode dbTableNode = worldMgr.getGameCachePool().getDBTableNode(tbName);
      if (dbTableNode == null) {
         return "找不到表结构";
      } else {
         try {
            worldMgr.getGameDBPool().query(dbTableNode.createSql(), new Object[0]);
            return "执行成功";
         } catch (Throwable throwable) {
            throwable.printStackTrace();
            return "执行失败";
         }
      }
   }

   @GetMapping({"/mgr/closeServer"})
   public String closeServer(HttpServletRequest rep) {
      logger.info("closeServer:{}", rep.getRemoteAddr());
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      worldMgr.closeServer();
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);

      try {
         while(DBPool.GlobalSave.get()) {
            Thread.sleep(1000L);
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      gameModelPool.systemOperationLog("服务器保存成功!", System.currentTimeMillis());
      return "服务器保存成功!!!!!!!!!!!!!!";
   }

   @GetMapping({"/mgr/openServer"})
   public String openServer() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      worldMgr.openServer();
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      gameModelPool.systemOperationLog("开启端口成功!", System.currentTimeMillis());
      return "开启端口成功";
   }

   @GetMapping({"/gm/loadTb"})
   public String gmLoadTb() {
      boolean flag = true;
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);

      try {
         flag = gameModelPool.loadPool();
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         worldMgr.initExeclModel();
         worldMgr.initBadWords();
      } catch (Exception e) {
         e.printStackTrace();
         gameModelPool.systemOperationLog("刷新配置表失败!", System.currentTimeMillis());
         return "刷新配置表失败";
      }

      if (flag) {
         gameModelPool.systemOperationLog("刷新配置表成功!", System.currentTimeMillis());
         return "刷新配置表成功";
      } else {
         gameModelPool.systemOperationLog("刷新配置表失败!", System.currentTimeMillis());
         return "刷新配置表失败";
      }
   }

   @GetMapping({"/gm/startBattleTest"})
   public String startBattleTest() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      if (Objects.isNull(worldMgr)) {
         return "开始战斗测试失败";
      } else {
         ArrayList<BattleTestMgr> list = worldMgr.getBattleTestMgrList();
         if (!Objects.isNull(list) && list.size() != 0) {
            for(BattleTestMgr testMgr : list) {
               testMgr.begin();
            }

            return "开始战斗测试成功";
         } else {
            return "开始战斗测试失败";
         }
      }
   }

   @GetMapping({"/gm/stopBattleTest"})
   public String stopBattleTest() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      if (Objects.isNull(worldMgr)) {
         return "未开启战斗测试";
      } else {
         ArrayList<BattleTestMgr> list = worldMgr.getBattleTestMgrList();
         if (!Objects.isNull(list) && list.size() != 0) {
            for(BattleTestMgr testMgr : list) {
               testMgr.stop();
            }

            return "关闭战斗测试成功";
         } else {
            return "未开启战斗测试";
         }
      }
   }

   @GetMapping({"/gm/printTestState"})
   public String printTestState() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      if (Objects.isNull(worldMgr)) {
         return "未开启战斗测试";
      } else {
         ArrayList<BattleTestMgr> list = worldMgr.getBattleTestMgrList();
         if (!Objects.isNull(list) && list.size() != 0) {
            BattleTestMgr.printTestState();
            return "已写入文件中";
         } else {
            return "未开启战斗测试";
         }
      }
   }

   @GetMapping({"/gm/printBattleProp"})
   public String printBattleProp() {
      BattleIdTestMgr battleIdTestMgr = (BattleIdTestMgr)ApplicationContextProvider.getContext().getBean(BattleIdTestMgr.class);
      battleIdTestMgr.test();
      return "打印完成！";
   }

   @GetMapping({"/gm/openWriteFile"})
   public String openWriteFile() {
      GameDBPool gameDBPool = (GameDBPool)ApplicationContextProvider.getContext().getBean(GameDBPool.class);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      if (Objects.isNull(gameDBPool)) {
         gameModelPool.systemOperationLog("无法获取数据库缓存池!", System.currentTimeMillis());
         return "无法获取数据库缓存池";
      } else {
         gameDBPool.setWriteFile(true);
         gameModelPool.systemOperationLog("开启写入文件!", System.currentTimeMillis());
         return "开启写入文件";
      }
   }

   @GetMapping({"/gm/closeWriteFile"})
   public String closeWriteFile() {
      GameDBPool gameDBPool = (GameDBPool)ApplicationContextProvider.getContext().getBean(GameDBPool.class);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      if (Objects.isNull(gameDBPool)) {
         gameModelPool.systemOperationLog("无法获取数据库缓存池!", System.currentTimeMillis());
         return "无法获取数据库缓存池";
      } else {
         gameDBPool.setWriteFile(false);
         gameModelPool.systemOperationLog("关闭写入文件!", System.currentTimeMillis());
         return "关闭写入文件";
      }
   }

   @GetMapping({"/gm/openPropertyMonitor"})
   public String openPropertyMonitor() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      worldMgr.setPropertyMonitor(true);
      return "打开属性变化监控";
   }

   @GetMapping({"/gm/closePropertyMonitor"})
   public String closePropertyMonitor() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      worldMgr.setPropertyMonitor(false);
      return "关闭属性变化监控";
   }

   @GetMapping({"/unLoad/{playerId}"})
   public String unLoadPlayerData(@PathVariable int playerId) {
      logger.info("http执行命令:{}", playerId);
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer gamePlayer = worldMgr.getPlayerById(playerId);
      if (gamePlayer == null) {
         return "玩家不存在！";
      } else {
         gamePlayer.pushTask(() -> {
            gamePlayer.closeChannel(LoginMsg.resultType.KICKOUT);
            gamePlayer.getGameCachePool().setExpire_time(0L);
            gamePlayer.getGameCachePool().setOpenCheckExpire(true);

            for(int i = 0; i < 3; ++i) {
               gamePlayer.getGameCachePool().save();
            }

            gamePlayer.getGameCachePool().setExpire_time(7200000L);
         });
         return "卸载玩家数据执行成功：" + playerId;
      }
   }

   @GetMapping({"/expireTime/{playerId}"})
   public String setExpireTime(@PathVariable int playerId) {
      logger.info("设置卸载时间:{}", playerId);
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer gamePlayer = worldMgr.getPlayerById(playerId);
      if (gamePlayer == null) {
         return "玩家不存在！";
      } else {
         gamePlayer.pushTask(() -> {
            gamePlayer.closeChannel(LoginMsg.resultType.KICKOUT);
            gamePlayer.getGameCachePool().setExpire_time(3600000L);
         });
         return "设置数据过期时间成功：" + playerId;
      }
   }

   @GetMapping({"/gm/showPlayerInfo"})
   public JSONArray showPlayerInfo(int playerId, int type) {
      JSONArray jsonArray = new JSONArray();
      if (playerId <= 0) {
         return jsonArray;
      } else {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer player = worldMgr.getPlayerById(playerId);
         if (player == null) {
            return jsonArray;
         } else {
            switch (type) {
               case 1:
                  jsonArray.add(this.showProperty(player));
                  break;
               case 2:
                  jsonArray.add(this.showItemBag(player));
                  break;
               case 3:
                  jsonArray.add(this.showHeroBag(player));
                  break;
               case 4:
                  jsonArray.add(this.showEmail(player));
            }

            return jsonArray;
         }
      }
   }

   @GetMapping({"/gm/rankRevise"})
   public String rankRevise() {
      long curTime = System.currentTimeMillis();
      LogDBPool logDBPool = (LogDBPool)ApplicationContextProvider.getContext().getBean(LogDBPool.class);
      Map<Integer, Integer> reviseDataMap = new HashMap();

      try {
         logDBPool.query("SELECT playerId, SUM( chValue ) AS totalNum FROM log_item WHERE itemId = 1113 AND chValue > 0 AND createTime > '2021-03-22 23:59:59' GROUP BY playerId;", (resultSet) -> {
            try {
               while(resultSet.next()) {
                  int playerId = resultSet.getInt("playerId");
                  int totalNum = resultSet.getInt("totalNum");
                  reviseDataMap.put(playerId, totalNum);
               }
            } catch (Exception e) {
               e.printStackTrace();
            }

         }, new Object[0]);
         logger.info("查询修复数据花费:{}", System.currentTimeMillis() - curTime);
      } catch (Throwable throwable) {
         throwable.printStackTrace();
      }

      if (reviseDataMap.isEmpty()) {
         return "无修复数据";
      } else {
         logger.info("修复数据:{}", reviseDataMap);
         GameRedisTool gameRedisTool = (GameRedisTool)ApplicationContextProvider.getContext().getBean(GameRedisTool.class);
         ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
         RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
         ActivityInfo activityInfo = activityMgr.getActivityInfo(14);
         if (activityInfo == null) {
            return "活动不存在";
         } else {
            RScoredSortedSet<Integer> rScoredSortedSet = gameRedisTool.getClient().getScoredSortedSet(rankMgr.getRedisKey(RankDefine.RankModule.ACTIVITY_POINT, String.valueOf(14), String.valueOf(activityInfo.id)));
            if (rScoredSortedSet != null && !rScoredSortedSet.isEmpty()) {
               int time = DateUtil.getIntTime(System.currentTimeMillis());

               for(Map.Entry<Integer, Integer> e : reviseDataMap.entrySet()) {
                  Integer playerId = (Integer)e.getKey();
                  Integer reviseScore = (Integer)e.getValue();
                  rScoredSortedSet.add((double)MiscUtil.comboInteger(reviseScore, time), playerId);
               }
            }

            logger.info("修复数据花费:{}", System.currentTimeMillis() - curTime);
            return "修复成功";
         }
      }
   }

   private JSONArray showProperty(GamePlayer player) {
      JSONArray jsonArray = new JSONArray();
      PlayerDao playerDao = (PlayerDao)player.getData("tb_player", player.getPlayerId());
      jsonArray.add(JsonUtil.object2JSON(playerDao));
      return jsonArray;
   }

   private JSONArray showItemBag(GamePlayer player) {
      JSONArray jsonArray = new JSONArray();
      ItemBagDao itemBagDao = (ItemBagDao)player.getData("tb_bag", player.getPlayerId());

      for(int subClass = 1; subClass < 16; ++subClass) {
         BagParent<ItemBase> bag = itemBagDao.getBagBySublass(subClass);
         if (bag != null) {
            bag.getMap().forEach((integer, itemBase) -> jsonArray.add(JsonUtil.object2JSON(itemBase)));
         }
      }

      return jsonArray;
   }

   private JSONArray showHeroBag(GamePlayer player) {
      JSONArray jsonArray = new JSONArray();
      Map<Integer, HeroDao> map = player.<Integer, HeroDao>getMap("tb_hero_bag", player.getPlayerId());

      for(Map.Entry<Integer, HeroDao> entry : map.entrySet()) {
         HeroDao heroDao = (HeroDao)entry.getValue();
         jsonArray.add(JsonUtil.object2JSON(heroDao));
      }

      return jsonArray;
   }

   private JSONArray showEmail(GamePlayer player) {
      JSONArray jsonArray = new JSONArray();
      Map<Integer, MailDao> map = player.<Integer, MailDao>getMap("tb_mail", player.getPlayerId());

      for(Map.Entry<Integer, MailDao> entry : map.entrySet()) {
         MailDao mailDao = (MailDao)entry.getValue();
         jsonArray.add(JsonUtil.object2JSON(mailDao));
      }

      return jsonArray;
   }

   @GetMapping({"/gm/resetRedis/{type}"})
   public String resetRedis(@PathVariable String type) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
      switch (type) {
         case "pvpclear":
            rankMgr.pushTask(() -> rankMgr.clearPvpRedis(RankDefine.RankModule.PVP));
            break;
         case "pvpflush":
            worldMgr.flushPvpRedis();
            break;
         case "powerclear":
            rankMgr.pushTask(() -> rankMgr.clearPvpRedis(RankDefine.RankModule.COMBAT_POWER));
            break;
         case "powerflush":
            worldMgr.flushPowerRedis();
      }

      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      gameModelPool.systemOperationLog("resetRedis" + type + "操作成功!", System.currentTimeMillis());
      return "操作成功";
   }

   @GetMapping({"/gm/mergeFile"})
   public void mergeFile() {
      logger.info("开始生成合服文件");
      StringBuilder sb = new StringBuilder();
      sb.append("DELIMITER $$\nDROP PROCEDURE IF EXISTS `merge_players` $$\nCREATE PROCEDURE `merge_players`(\n\tin _db_main_name text(2048),\n\tin _db_slave_name text(2048))\nbegin\n\tdeclare my_sqll text(2048);\n");
      String mergeFormat = "\tset my_sqll = concat('insert ignore into `',_db_main_name,'`.`%s`(%s) select %s from `',_db_slave_name,'`.`%s`;');\n\tset @ms=my_sqll; \n\tselect my_sqll;\n\tprepare s1 from @ms; \n\texecute s1;\n\n";
      HashMap<String, DBTableNode> map = ApplicationContextProvider.getGameScan().tableMap;

      for(DBTableNode node : map.values()) {
         if (DBDao.class.isAssignableFrom(node.dbDaoCls)) {
            if (!node.tbName.equals("tb_world") && !node.tbName.equals("command") && !node.tbName.equals("log_quick") && !node.tbName.equals("online") && !node.tbName.equals("publicnotice") && !node.tbName.equals("systemmail") && !node.tbName.equals("tb_battle_temple") && !node.tbName.equals("tb_battle_record") && !node.tbName.equals("tb_battle_record_extend") && !node.tbName.equals("tb_rune_stone_record") && !node.tbName.equals("tb_peak_red_packet") && !node.tbName.equals("tb_dragon_team") && !node.tbName.equals("tb_demon_boss") && !node.tbName.equals("tb_demon_rotate_boss") && !node.tbName.equals("tb_bug_feedback") && !node.tbName.equals("tb_peak_battle_info") && !node.tbName.equals("tb_water_transport_record") && !node.tbName.equals("tb_sacrifice_record") && !node.tbName.equals("tb_war_horse_record") && !node.tbName.equals("tb_war_barbarian") && !node.tbName.equals("tb_world_boss") && !node.tbName.equals("tb_activity_lamp_record") && !node.tbName.equals("tb_duel_boss_record") && !node.tbName.equals("tb_duel_red_packet") && !node.tbName.equals("tb_flower_fire_record") && !node.tbName.equals("tb_mail_world") && !node.tbName.equals("tb_monster_team") && !node.tbName.equals("tb_monster_team_power") && !node.tbName.equals("tb_mystery_shop_record") && !node.tbName.equals("tb_rank_reward") && !node.tbName.equals("tb_spring_festival_bless") && !node.tbName.equals("tb_stars_activity_draw_server") && !node.tbName.equals("tb_swim_park_draw_server") && !node.tbName.equals("tb_union_red_packet_give") && !node.tbName.equals("tb_union_red_packet_get") && !node.tbName.equals("white_list") && !node.tbName.equals("tb_union_war_attack_log") && !node.tbName.equals("tb_merge_war_info") && !node.tbName.equals("tb_hero_nation_rank") && !node.tbName.equals("tb_god_beast_record")) {
               if (node.dbType == 0) {
                  String columnName = node.getAllColumnName();
                  sb.append(String.format(mergeFormat, node.tbName.toLowerCase(), columnName, columnName, node.tbName.toLowerCase()));
               }
            } else {
               logger.info("过滤不需要生成合服文件的表: {}", node.tbName);
            }
         }
      }

      String extra = "\tset my_sqll = concat('update `',_db_main_name,'`.`tb_server_merge` set mergeNum = mergeNum + 1;');\n\tset @ms=my_sqll; \n\tselect my_sqll;\n\tprepare s1 from @ms; \n\texecute s1;\n\n";
      sb.append(extra);
      sb.append("\tdeallocate prepare s1; \nend $$\nDELIMITER ;");
      File file = new File("D:\\Code_Merge\\GameServer\\src\\main\\resources\\sql\\merge_players.sql");

      try {
         if (!file.exists()) {
            file.createNewFile();
         }

         FileWriter fw = new FileWriter(file);
         fw.write(sb.toString());
         fw.flush();
         fw.close();
      } catch (IOException e) {
         e.printStackTrace();
      }

      logger.info("生成合服文件完毕");
   }

   @GetMapping({"/gm/testHotUpdate"})
   public void testHotUpdate() {
      LoadSelfClass loadSelfClass = new LoadSelfClass();
      loadSelfClass.loadClass("D:\\Work-YouYan\\trunk\\GameServer\\target\\classes\\com\\gzbz\\gamePlayer\\playerChat\\PlayerChatPart.class");
   }

   @GetMapping({"/gm/copyPlayer/{playerId}/{num}"})
   public String copyPlayer(@PathVariable int playerId, @PathVariable int num) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer gamePlayer = worldMgr.getPlayerById(playerId);
      if (Objects.isNull(gamePlayer)) {
         return "无法找到复制的对象:" + playerId;
      } else {
         String copiedPlayerName = gamePlayer.getPlayerDao().playerName;
         String copiedPlayerAccount = gamePlayer.getAccount();
         StringBuilder ret_msg = new StringBuilder();
         ret_msg.append("复制完成，已成功创建账号:");
         GameServerScan gameServerScan = (GameServerScan)ApplicationContextProvider.getContext().getBean(GameServerScan.class);

         for(int i = 0; i < num; ++i) {
            AccountDao dao = new AccountDao();
            dao.serverId = worldMgr.GAME_SERVER_ID;
            dao.account = String.format("%s_%d_%d", worldMgr.PLATFORM_NAME, System.currentTimeMillis() / 1000L, i);
            worldMgr.getGameCachePool().insertDao(dao, true);

            for(DBTableNode dbTableNode : gameServerScan.clsTableMap.values()) {
               if (dbTableNode.tbName.indexOf("log_") <= -1 && dbTableNode.tbName.indexOf("tb_cd_key") <= -1 && dbTableNode.tbName.indexOf("tb_player_extend") <= -1 && dbTableNode.tbName.indexOf("tb_battle_tower_record") <= -1) {
                  boolean find = false;
                  DBColumnNode primaryNode = null;

                  for(DBColumnNode columnNode : dbTableNode.primaryKey) {
                     if (columnNode.columnName.equals("playerId")) {
                        primaryNode = columnNode;
                        break;
                     }
                  }

                  if (!Objects.isNull(primaryNode) && !dbTableNode.tbName.equals("tb_account")) {
                     logger.info("复制表名{}", dbTableNode.tbName);

                     try {
                        switch (dbTableNode.resultType) {
                           case 0:
                              DBDao dbDao = (DBDao)gamePlayer.getGameCachePool().getData(dbTableNode.tbName, new Object[]{playerId});
                              primaryNode.field.set(dbDao, dao.playerId);
                              boolean revertPlayerNameAndAccount = false;
                              if (dbTableNode.tbName.equals("tb_player")) {
                                 for(DBColumnNode dbColumnNode : dbTableNode.columnList) {
                                    if (dbColumnNode.columnName.equals("account")) {
                                       dbColumnNode.field.set(dbDao, dao.account);
                                    } else if (dbColumnNode.columnName.equals("playerName")) {
                                       dbColumnNode.field.set(dbDao, dao.account);
                                    }
                                 }

                                 revertPlayerNameAndAccount = true;
                              }

                              worldMgr.getGameCachePool().insertDao(this.copyDao(dbTableNode, dbDao), true);
                              primaryNode.field.set(dbDao, playerId);
                              if (revertPlayerNameAndAccount) {
                                 for(DBColumnNode dbColumnNode : dbTableNode.columnList) {
                                    if (dbColumnNode.columnName.equals("account")) {
                                       dbColumnNode.field.set(dbDao, copiedPlayerAccount);
                                    } else if (dbColumnNode.columnName.equals("playerName")) {
                                       dbColumnNode.field.set(dbDao, copiedPlayerName);
                                    }
                                 }
                              }
                              break;
                           case 1:
                              for(DBDao listDBDao : gamePlayer.getGameCachePool().getList(dbTableNode.tbName, new Object[]{playerId})) {
                                 primaryNode.field.set(listDBDao, dao.playerId);
                                 worldMgr.getGameCachePool().insertDao(this.copyDao(dbTableNode, listDBDao), true);
                                 primaryNode.field.set(listDBDao, playerId);
                              }
                              break;
                           case 2:
                              Map<Integer, DBDao> map = gamePlayer.getGameCachePool().getMap(dbTableNode.tbName, new Object[]{playerId});
                              if (map != null) {
                                 for(DBDao mapDBDao : map.values()) {
                                    primaryNode.field.set(mapDBDao, dao.playerId);
                                    worldMgr.getGameCachePool().insertDao(this.copyDao(dbTableNode, mapDBDao), true);
                                    primaryNode.field.set(mapDBDao, playerId);
                                 }
                              }
                              break;
                           case 3:
                              CustomCacheData customCacheData = gamePlayer.getGameCachePool().getCustomCache(dbTableNode.tbName, new Object[]{playerId});

                              for(DBDao customDao : customCacheData.save()) {
                                 primaryNode.field.set(customDao, dao.playerId);
                                 worldMgr.getGameCachePool().insertDao(this.copyDao(dbTableNode, customDao), true);
                                 primaryNode.field.set(customDao, playerId);
                              }
                           case 4:
                           case 5:
                        }
                     } catch (Exception e) {
                        e.printStackTrace();
                     }
                  }
               }
            }

            GamePlayer player = (GamePlayer)ApplicationContextProvider.getContext().getBean(GamePlayer.class);
            player.setPlayerIdAndAccount(dao.playerId, dao.account, dao.serverId);
            worldMgr.getPlayerMap().put(dao.playerId, player);
            String account = String.format("%s-%d", dao.account, dao.serverId);
            worldMgr.getAccountMap().put(account, player);
            ret_msg.append(" " + dao.account);
         }

         return ret_msg.toString();
      }
   }

   private DBDao copyDao(DBTableNode dbTableNode, DBDao sourceDao) {
      try {
         DBDao dbDao = (DBDao)dbTableNode.dbDaoCls.newInstance();

         for(DBColumnNode dbColumnNode : dbTableNode.columnList) {
            dbColumnNode.field.set(dbDao, dbColumnNode.field.get(sourceDao));
         }

         dbDao.insertOp();
         return dbDao;
      } catch (Exception var6) {
         return null;
      }
   }

   @GetMapping({"/gm/collectSpecialRecord"})
   public String collectSpecialRecord() {
      SpecialRecordMgr specialRecordMgr = (SpecialRecordMgr)ApplicationContextProvider.getContext().getBean(SpecialRecordMgr.class);
      return specialRecordMgr.collectSpecialRecord();
   }

   @GetMapping({"/gm/clearInvalidPlayers"})
   public String clearInvalidPlayers() {
      RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
      rankMgr.pushTask(rankMgr::clearInvalidPlayers);
      return "成功";
   }
}
