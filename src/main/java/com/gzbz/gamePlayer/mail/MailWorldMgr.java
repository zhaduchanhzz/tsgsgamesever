package com.gzbz.gamePlayer.mail;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import cn.hutool.core.convert.Convert;
import com.gzbz.db.worldBean.MailWorldDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.log.LogMgr;
import com.gzbz.log.MailWorldLog;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
import misc.JsonUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@MgrAnno
public class MailWorldMgr extends GameMgr {
   Logger logger = LoggerFactory.getLogger(MailWorldMgr.class);
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   LogMgr logMgr;
   private long checkTime;

   protected void init() {
   }

   @TaskMethod
   public void initData() {
      this.dayCheck();
      this.checkTime = System.currentTimeMillis();
   }

   @TaskMethod
   public void mailWorldCheck() {
      int currentHour = DateUtil.cHour();
      if (currentHour == 2 || currentHour == 3 || currentHour == 4 || currentHour == 5 || currentHour == 6) {
         long currentTime = System.currentTimeMillis();
         if (!DateUtil.isSameDay(currentTime, this.checkTime)) {
            int delay = RandomUtil.randInt(3000);
            this.logger.info("世界邮件过期检查，延迟时间={}秒", delay);
            this.scheduleEx((long)(delay * 1000), "dayCheck", new Object[0]);
            this.checkTime = currentTime;
         }
      }

   }

   @TaskMethod
   public void dayCheck() {
      this.logger.info("检查世界邮件");
      Map<Integer, MailWorldDao> map = this.gameCachePool.getAllTableByMap("tb_mail_world");
      long currentTime = System.currentTimeMillis();
      int totalNum = 0;
      List<MailWorldDao> needDelList = new ArrayList();

      for(Map.Entry<Integer, MailWorldDao> entry : map.entrySet()) {
         if (currentTime > ((MailWorldDao)entry.getValue()).enableTime) {
            needDelList.add(entry.getValue());
         } else if (((MailWorldDao)entry.getValue()).sendType == 1) {
            if (((MailWorldDao)entry.getValue()).playerParams.isEmpty()) {
               needDelList.add(entry.getValue());
            } else {
               ++totalNum;
               if (((MailWorldDao)entry.getValue()).playerParams.size() > 50) {
               }
            }
         }
      }

      this.logger.info("待发送玩家列表邮件数量={}，待删除邮件数量={}", totalNum, needDelList.size());
      if (!needDelList.isEmpty()) {
         for(MailWorldDao mailWorldDao : needDelList) {
            this.gameCachePool.deleteDao(mailWorldDao, true);
            this.logMailWorld(mailWorldDao, -1);
         }
      }

   }

   @TaskMethod
   public void playerLoginCheckPlayer(final GamePlayer gamePlayer, int maxMailId) {
      Map<Integer, MailWorldDao> map = this.gameCachePool.getAllTableByMap("tb_mail_world");
      TreeMap<Integer, MailWorldDao> treeMap = new TreeMap(map);
      long currentTime = System.currentTimeMillis();
      PlayerExtend playerExtend = (PlayerExtend)gamePlayer.getPlayerExtend(13);

      for(Map.Entry<Integer, MailWorldDao> entry : treeMap.entrySet()) {
         MailWorldDao mailWorldDao = (MailWorldDao)entry.getValue();
         if (currentTime <= mailWorldDao.enableTime) {
            if (((MailWorldDao)entry.getValue()).servers.isEmpty()) {
               ((MailWorldDao)entry.getValue()).servers.addAll(this.worldMgr.getServersSet());
               ((MailWorldDao)entry.getValue()).updateOp();
            }

            if (((MailWorldDao)entry.getValue()).servers.contains(gamePlayer.getServerId())) {
               switch (mailWorldDao.sendType) {
                  case 0:
                     if (((MailWorldDao)entry.getValue()).creatTime > playerExtend.mailWorldTime) {
                        gamePlayer.pushPartTaskEx(MailPart.class, "mailWorldMgr_addCommonMailExcludeMap_toAll", new Object[]{entry.getKey(), ((MailWorldDao)entry.getValue()).creatTime, ((MailWorldDao)entry.getValue()).type, mailWorldDao.title, mailWorldDao.context, mailWorldDao.items, mailWorldDao.enableTime, mailWorldDao.module, mailWorldDao.reason, mailWorldDao.centreAwardId});
                     }
                     break;
                  case 1:
                     if (mailWorldDao.playerParams.keySet().contains(gamePlayer.getPlayerId()) && ((MailWorldDao)entry.getValue()).creatTime > gamePlayer.getPlayerDao().birthTime) {
                        MailDefine.MailType type = MailDefine.MailType.getMailType(mailWorldDao.type);
                        String params = (String)mailWorldDao.playerParams.get(gamePlayer.getPlayerId());
                        String format = MessageFormat.format(mailWorldDao.context, params.split("@"));
                        gamePlayer.pushPartTaskEx(MailPart.class, "addMailOfEndTime", new Object[]{type, mailWorldDao.title, format, mailWorldDao.items, mailWorldDao.enableTime, mailWorldDao.module, mailWorldDao.reason, mailWorldDao.creatTime, mailWorldDao.centreAwardId});
                        mailWorldDao.playerParams.remove(gamePlayer.getPlayerId());
                        mailWorldDao.updateOp();
                        gamePlayer.getOperationMgr().addReceiveAwardNewLog(gamePlayer, 17, 0, mailWorldDao.title, params + "-" + params, params + "-" + params, 0, 0, 0);
                     }
               }
            }
         }
      }

   }

   public void addParamsMailAndSendOnline(MailDefine.MailType type, String title, String context, List<ResourceModel> items, Map<Integer, String> playerParams, long effectTime, int module, int reason, int centreAwardId) {
      Map<Integer, String> needSendMap = new HashMap();

      for(Map.Entry<Integer, String> entry : playerParams.entrySet()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)entry.getKey());
         if (gamePlayer.isLogin()) {
            String format = MessageFormat.format(context, ((String)entry.getValue()).split("@"));
            gamePlayer.pushPartTaskEx(MailPart.class, "addMailOfEffectTimeByCentreAwardId", new Object[]{type, title, format, items, effectTime, module, reason, centreAwardId});
         } else {
            needSendMap.put(entry.getKey(), entry.getValue());
         }
      }

      if (needSendMap.size() > 0) {
         this.addParamsMail(type, title, context, items, needSendMap, effectTime, module, reason, centreAwardId);
      }

   }

   public void addParamsMail(MailDefine.MailType type, String title, String context, List<ResourceModel> items, Map<Integer, String> playerParams, long effectTime, int module, int reason, int centreAwardId) {
      if (playerParams.size() < 5) {
         for(Map.Entry<Integer, String> entry : playerParams.entrySet()) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)entry.getKey());
            if (gamePlayer != null) {
               String format = MessageFormat.format(context, ((String)entry.getValue()).split("@"));
               gamePlayer.pushPartTaskEx(MailPart.class, "addMailOfEffectTimeByCentreAwardId", new Object[]{type, title, format, items, effectTime, module, reason, centreAwardId});
               gamePlayer.getOperationMgr().addReceiveAwardNewLog(gamePlayer, 17, 0, title, (String)entry.getValue() + "-" + (String)entry.getValue(), (String)entry.getValue() + "-" + (String)entry.getValue(), 0, 0, 0);
            }
         }
      } else {
         this.pushTaskEx("addParamsMailPrivate", new Object[]{type, title, context, items, playerParams, effectTime, module, reason, centreAwardId});
      }

   }

   @TaskMethod
   public void addParamsMailPrivate(MailDefine.MailType type, String title, String context, List<ResourceModel> items, Map<Integer, String> playerParams, long effectTime, int module, int reason, int centreAwardId) {
      Map<Integer, String> tempPlayerParams = new HashMap(playerParams);
      tempPlayerParams.entrySet().removeIf((entry) -> {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)entry.getKey());
         return gamePlayer == null || gamePlayer.getPublicDao().logoutTime > 0L && DateUtil.difftimeDay(new Timestamp(gamePlayer.getPublicDao().logoutTime)) >= 15;
      });
      this.logger.info("添加带参数全服邮件，玩家数量={}", tempPlayerParams.size());
      this.gameCachePool.getAllTableByMap("tb_mail_world");
      MailWorldDao mailWorldDao = new MailWorldDao();
      mailWorldDao.sendType = 1;
      mailWorldDao.type = type.getId();
      if (title == null) {
         this.logger.info("全服邮件标题为空！");
         title = "";
      }

      mailWorldDao.title = title;
      if (context == null) {
         this.logger.info("全服邮件内容为空！");
         context = "";
      }

      mailWorldDao.context = context;
      mailWorldDao.module = module;
      mailWorldDao.reason = reason;
      mailWorldDao.centreAwardId = centreAwardId;
      mailWorldDao.servers.addAll(this.worldMgr.getServersSet());
      long currentTime = System.currentTimeMillis();
      if (effectTime <= 0L) {
         effectTime = 604800000L;
      } else if (effectTime > 1209600000L) {
         effectTime = 1209600000L;
      }

      mailWorldDao.enableTime = currentTime + effectTime;
      mailWorldDao.creatTime = currentTime;
      if (items != null) {
         for(ResourceModel model : items) {
            mailWorldDao.items.add(model);
         }
      }

      mailWorldDao.playerParams = tempPlayerParams;
      mailWorldDao.insertOp();
      this.gameCachePool.insertDao(mailWorldDao, true);
      this.logMailWorld(mailWorldDao, 1);
   }

   public void addCommonMailExcludeMap(MailDefine.MailType type, String title, String context, List<ResourceModel> items, long endTime, int module, int reason, int centreAwardId) {
      this.gameCachePool.getAllTableByMap("tb_mail_world");
      MailWorldDao mailWorldDao = new MailWorldDao();
      mailWorldDao.sendType = 0;
      mailWorldDao.type = type.getId();
      if (title == null) {
         this.logger.info("全服邮件标题为空！");
         title = "";
      }

      mailWorldDao.title = title;
      if (context == null) {
         this.logger.info("全服邮件内容为空！");
         context = "";
      }

      mailWorldDao.context = context;
      mailWorldDao.reason = reason;
      mailWorldDao.module = module;
      mailWorldDao.centreAwardId = centreAwardId;
      mailWorldDao.servers.addAll(this.worldMgr.getServersSet());
      long currentTime = System.currentTimeMillis();
      mailWorldDao.creatTime = currentTime;
      long maxEndTime = currentTime + 1209600000L;
      if (endTime <= 0L) {
         endTime = currentTime + 604800000L;
      } else if (endTime > maxEndTime) {
         endTime = maxEndTime;
      }

      mailWorldDao.enableTime = endTime;
      if (items != null) {
         for(ResourceModel model : items) {
            mailWorldDao.items.add(model);
         }
      }

      mailWorldDao.insertOp();
      this.gameCachePool.insertDao(mailWorldDao, true);
      this.logMailWorld(mailWorldDao, 1);

      for(GamePlayer player : this.worldMgr.getOnlinePlayer()) {
         player.pushPartTaskEx(MailPart.class, "mailWorldMgr_addCommonMailExcludeMap", new Object[]{type, mailWorldDao.title, mailWorldDao.context, items, mailWorldDao.enableTime, module, reason, currentTime, mailWorldDao.id, centreAwardId});
      }

   }

   public int deleteMail(int code, int module, int reason) {
      int result = 0;
      MailWorldDao mailWorldDao = this.getMailWorldByCode(code);
      if (mailWorldDao == null) {
         this.logger.warn("删除的邮件不存在");
         return 23000;
      } else {
         this.gameCachePool.deleteDao(mailWorldDao, true);
         this.logMailWorld(mailWorldDao, -1);
         result = 1;
         return result;
      }
   }

   public MailWorldDao getMailWorldByCode(int code) {
      return (MailWorldDao)this.gameCachePool.getData("tb_mail_world", new Object[]{code});
   }

   public void logMailWorld(MailWorldDao mailWorldDao, int chValue) {
      MailWorldLog log = new MailWorldLog();
      log.playerId = 0;
      log.code = mailWorldDao.id;
      log.chValue = chValue;
      log.module = mailWorldDao.module;
      log.reason = mailWorldDao.reason;
      log.misc1 = mailWorldDao.type;
      log.misc2 = mailWorldDao.sendType;
      String mark = mailWorldDao.title + "@" + mailWorldDao.context + "@" + mailWorldDao.enableTime + "@" + Convert.toStr(mailWorldDao.playerParams) + "@" + JsonUtil.listToJson(mailWorldDao.items).toString();
      log.misc3 = mark;
      log.createTime = new Timestamp(System.currentTimeMillis());
      LogMgr.checkLog(log);
      this.logMgr.pushTaskEx("addLog", new Object[]{log});
   }

   public void serverMailTest() {
      List<ResourceModel> list = new ArrayList();
      list.add(new ResourceModel(1, 8, 10000));
      long endTime = System.currentTimeMillis() + 1814400000L;
      this.addCommonMailExcludeMap(MailDefine.MailType.MAIL_TYPE_COMMON, "标题", "类容", list, endTime, 49, 706, 0);
   }

   public void mergeWorldMail() {
      Map<Integer, MailWorldDao> map = this.gameCachePool.getAllTableByMap("tb_mail_world");
      if (map != null) {
         int mailWolrdNUm = map.size();
         long currentTime = System.currentTimeMillis();
         long overTime = 1296000000L;
         int totalMailNum = 0;

         for(Map.Entry<Integer, MailWorldDao> entry : map.entrySet()) {
            MailWorldDao mailWorldDao = (MailWorldDao)entry.getValue();
            if (currentTime <= mailWorldDao.enableTime) {
               switch (mailWorldDao.sendType) {
                  case 0:
                     for(Map.Entry<Integer, GamePlayer> playerEntry : this.worldMgr.getPlayerMap().entrySet()) {
                        if (!((GamePlayer)playerEntry.getValue()).isRobot()) {
                           long time = currentTime - ((GamePlayer)playerEntry.getValue()).getPublicDao().logoutTime;
                           if (time <= overTime) {
                              MailPart mailPart = (MailPart)((GamePlayer)playerEntry.getValue()).getMgrPart(MailPart.class);
                              mailPart.mailWorldMgr_addCommonMailExcludeMap_toAll((Integer)entry.getKey(), ((MailWorldDao)entry.getValue()).creatTime, ((MailWorldDao)entry.getValue()).type, ((MailWorldDao)entry.getValue()).title, ((MailWorldDao)entry.getValue()).context, ((MailWorldDao)entry.getValue()).items, ((MailWorldDao)entry.getValue()).enableTime, ((MailWorldDao)entry.getValue()).module, ((MailWorldDao)entry.getValue()).reason, ((MailWorldDao)entry.getValue()).centreAwardId);
                              ++totalMailNum;
                           }
                        }
                     }
                     break;
                  case 1:
                     for(Map.Entry<Integer, String> mailEntry : mailWorldDao.playerParams.entrySet()) {
                        GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)mailEntry.getKey());
                        if (gamePlayer != null && !gamePlayer.isRobot()) {
                           long time = currentTime - gamePlayer.getPublicDao().logoutTime;
                           if (time <= overTime && gamePlayer.getPlayerDao().birthTime <= ((MailWorldDao)entry.getValue()).creatTime) {
                              MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                              MailDefine.MailType type = MailDefine.MailType.getMailType(mailWorldDao.type);
                              String params = (String)mailWorldDao.playerParams.get(gamePlayer.getPlayerId());
                              String format = MessageFormat.format(mailWorldDao.context, params.split("@"));
                              mailPart.addMailOfEndTime(type, mailWorldDao.title, format, mailWorldDao.items, mailWorldDao.enableTime, mailWorldDao.module, mailWorldDao.reason, mailWorldDao.creatTime, mailWorldDao.centreAwardId);
                              ++totalMailNum;
                           }
                        }
                     }
               }
            }
         }

         Iterator iterator = map.values().iterator();

         while(iterator.hasNext()) {
            this.gameCachePool.deleteDao(iterator.next(), true);
         }

         this.logger.info("【合服--邮件】服务器={}，处理世界邮件={}，发送玩家邮件={}，共耗时={}毫秒", new Object[]{this.worldMgr.GAME_SERVER_ID, mailWolrdNUm, totalMailNum, System.currentTimeMillis() - currentTime});
      }
   }

   public void _mainServerMergeBegin() throws Exception {
      this.logger.info("【合服--邮件】主服={},开始处理！", this.worldMgr.GAME_SERVER_ID);
      this.mergeWorldMail();
   }

   public void _slaveServerMergeBegin(int mainServerId) throws Exception {
      this.logger.info("【合服--邮件】从服={},开始处理！", this.worldMgr.GAME_SERVER_ID);
      this.mergeWorldMail();
   }
}
