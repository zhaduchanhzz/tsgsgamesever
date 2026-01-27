package com.gzbz.logOperation;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.db.DeviceDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.bean.DeviceData;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.logOperation.bean.LogNewData;
import com.gzbz.logOperation.bean.LogOldData;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.PlayerProperty;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.worldMgr.WorldMgr;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import misc.BitMap;
import misc.DateUtil;
import misc.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@MgrAnno
public class LogOperationMgr extends GameMgr {
   Logger logger = LoggerFactory.getLogger(LogOperationMgr.class);
   @Value("${oldLogOperationPath}")
   private String oldLogPath;
   @Value("${newLogOperationPath}")
   private String newLogPath;
   @Value("${extraLogOperationPath}")
   private String extraLogPath;
   @Value("${logWrite}")
   private int logWrite;
   @Autowired
   private WorldMgr worldMgr;
   StringBuffer newBuffer;
   StringBuffer oldBuffer;
   private long writeTime = 0L;
   StringBuffer extraBuffer;

   protected void init() throws Exception {
   }

   public void addOnlineLog(LogOldData oldData) {
      this.writeOldData(oldData, "");
   }

   public void addOldLog(PlayerDao playerDao, LogOldData oldData, GamePlayer player) {
      if (Objects.isNull(playerDao)) {
         oldData.playerName = "-";
         oldData.platformName = this.worldMgr.PLATFORM_NAME;
         oldData.accountName = "-";
         oldData.agentName = "-";
      } else {
         oldData.playerId = String.valueOf(playerDao.playerId);
         oldData.playerName = playerDao.playerName;
         oldData.platformName = this.worldMgr.PLATFORM_NAME;
         oldData.accountName = playerDao.account;
         oldData.agentName = "-";
         if (!Objects.isNull(player) && player.getDevUID() != null && !player.getDevUID().equals("")) {
            DeviceDao deviceDao = this.worldMgr.getDevice(player.getDevUID());
            if (!Objects.isNull(deviceDao) && deviceDao.jsonData != null && !deviceDao.jsonData.equals("")) {
               DeviceData deviceData = (DeviceData)JsonUtil.jsonToBean(deviceDao.jsonData, DeviceData.class);
               if (deviceData != null && deviceData.agentId != null && !deviceData.agentId.equals("")) {
                  oldData.agentName = deviceData.agentId;
               }
            }
         }
      }

      this.writeOldData(oldData, "");
   }

   public void addNewLog(GamePlayer player, LogNewData newData, int logId) {
      if (Objects.isNull(player)) {
         newData.logId = logId;
         newData.playerId = "-";
         newData.playerName = "-";
         newData.platformName = this.worldMgr.PLATFORM_NAME;
         newData.serverId = this.worldMgr.GAME_SERVER_ID;
         newData.agentId = "-";
         newData.userId = "-";
         newData.vipLevel = "-";
      } else {
         PlayerPublicDao playerDao = player.getPublicDao();
         newData.logId = logId;
         newData.playerId = String.valueOf(playerDao.playerId);
         newData.playerName = playerDao.playerName;
         newData.platformName = this.worldMgr.PLATFORM_NAME;
         newData.serverId = player.getServerId();
         newData.agentId = "-";
         newData.userId = player.getPlayerDao().account;
         newData.vipLevel = String.valueOf(playerDao.vip_lv);
      }

      if (!Objects.isNull(player) && player.getDevUID() != null && !player.getDevUID().equals("")) {
         DeviceDao deviceDao = this.worldMgr.getDevice(player.getDevUID());
         if (!Objects.isNull(deviceDao) && deviceDao.jsonData != null && !deviceDao.jsonData.equals("")) {
            DeviceData deviceData = (DeviceData)JsonUtil.jsonToBean(deviceDao.jsonData, DeviceData.class);
            if (deviceData != null && deviceData.agentId != null && !deviceData.agentId.equals("")) {
               newData.agentId = deviceData.agentId;
            }
         }
      }

      this.writeNewData(newData, "");
   }

   private synchronized void writeNewData(LogNewData newData, String txtTime) {
      if (Objects.isNull(this.newBuffer)) {
         this.newBuffer = new StringBuffer(51200);
      }

      if (Objects.isNull(newData)) {
         this.bufferedWriteNewLog(this.newBuffer.toString(), txtTime);
         this.newBuffer.setLength(0);
      } else {
         long startTime = System.currentTimeMillis();
         if (this.newBuffer.length() + this.appendNewData(newData).length() > this.newBuffer.capacity()) {
            this.bufferedWriteNewLog(this.newBuffer.toString() + this.appendNewData(newData), txtTime);
            this.newBuffer.setLength(0);
         } else {
            this.newBuffer.append(this.appendNewData(newData));
         }

         long endTime = System.currentTimeMillis();
         if (endTime - startTime > 50L) {
            this.logger.error("写入新日志消耗时间：" + (endTime - startTime));
         }

      }
   }

   private synchronized void writeOldData(LogOldData oldData, String txtTime) {
      if (Objects.isNull(this.oldBuffer)) {
         this.oldBuffer = new StringBuffer(51200);
      }

      if (Objects.isNull(oldData)) {
         this.bufferedWriteOldLog(this.oldBuffer.toString(), txtTime);
         this.oldBuffer.setLength(0);
      } else {
         long startTime = System.currentTimeMillis();
         if (this.oldBuffer.length() + this.appendOldData(oldData).length() > this.oldBuffer.capacity()) {
            this.bufferedWriteOldLog(this.oldBuffer.toString() + this.appendOldData(oldData), txtTime);
            this.oldBuffer.setLength(0);
         } else {
            this.oldBuffer.append(this.appendOldData(oldData));
         }

         long endTime = System.currentTimeMillis();
         if (endTime - startTime > 50L) {
            this.logger.error("写入老日志消耗时间：" + (endTime - startTime));
         }

      }
   }

   @Scheduled(
      cron = "0 0/5 * * * ?"
   )
   public void writeFile() throws IOException {
      this.pushTask(() -> {
         if (this.writeTime == 0L || System.currentTimeMillis() - this.writeTime >= 240000L) {
            this.writeNewData((LogNewData)null, DateUtil.timeStr());
            this.writeOldData((LogOldData)null, DateUtil.timeStr());
            this.writeTime = System.currentTimeMillis();
         }

      });
   }

   public void bufferedWriteNewLog(String data, String txtTime) {
      if (this.logWrite != 0) {
         String path = this.newLogPath + "/new_log_temp.txt";
         BufferedWriter bw = null;
         File file = null;
         boolean var18 = false;

         label132: {
            try {
               var18 = true;
               file = new File(path);
               File e = file.getParentFile();
               if (!e.exists()) {
                  e.mkdirs();
               }

               if (!file.exists()) {
                  file.createNewFile();
               }

               OutputStream os = new FileOutputStream(file, true);
               bw = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
               bw.write(data);
               bw.flush();
               var18 = false;
               break label132;
            } catch (Exception e) {
               this.logger.error(e.getMessage());
               var18 = false;
            } finally {
               if (var18) {
                  try {
                     bw.close();
                     if (!txtTime.equals("")) {
                        String newPath = this.newLogPath + "/new_log_" + txtTime + ".txt";
                        File newFile = new File(newPath);
                        boolean flag = file.renameTo(newFile);
                        if (!flag) {
                           this.logger.error("后台日志改名失败！！");
                        }
                     }
                  } catch (Exception e) {
                     this.logger.error(e.getMessage());
                  }

               }
            }

            try {
               bw.close();
               if (!txtTime.equals("")) {
                  String newPath = this.newLogPath + "/new_log_" + txtTime + ".txt";
                  File newFile = new File(newPath);
                  boolean flag = file.renameTo(newFile);
                  if (!flag) {
                     this.logger.error("后台日志改名失败！！");
                  }

                  return;
               }
            } catch (Exception e) {
               this.logger.error(e.getMessage());
            }

            return;
         }

         try {
            bw.close();
            if (!txtTime.equals("")) {
               String newPath = this.newLogPath + "/new_log_" + txtTime + ".txt";
               File newFile = new File(newPath);
               boolean flag = file.renameTo(newFile);
               if (!flag) {
                  this.logger.error("后台日志改名失败！！");
               }
            }
         } catch (Exception e) {
            this.logger.error(e.getMessage());
         }

      }
   }

   public void bufferedWriteOldLog(String data, String txtTime) {
      if (this.logWrite != 0) {
         String path = this.oldLogPath + "/old_log_temp.txt";
         BufferedWriter bw = null;
         File file = null;
         boolean var18 = false;

         label132: {
            try {
               var18 = true;
               file = new File(path);
               File e = file.getParentFile();
               if (!e.exists()) {
                  e.mkdirs();
               }

               if (!file.exists()) {
                  file.createNewFile();
               }

               OutputStream os = new FileOutputStream(file, true);
               bw = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
               bw.write(data);
               bw.flush();
               var18 = false;
               break label132;
            } catch (Exception e) {
               this.logger.error(e.getMessage());
               var18 = false;
            } finally {
               if (var18) {
                  try {
                     bw.close();
                     if (!txtTime.equals("")) {
                        String newPath = this.oldLogPath + "/old_log_" + txtTime + ".txt";
                        File newFile = new File(newPath);
                        boolean flag = file.renameTo(newFile);
                        if (!flag) {
                           this.logger.error("后台日志改名失败！！");
                        }
                     }
                  } catch (Exception e) {
                     this.logger.error(e.getMessage());
                  }

               }
            }

            try {
               bw.close();
               if (!txtTime.equals("")) {
                  String newPath = this.oldLogPath + "/old_log_" + txtTime + ".txt";
                  File newFile = new File(newPath);
                  boolean flag = file.renameTo(newFile);
                  if (!flag) {
                     this.logger.error("后台日志改名失败！！");
                  }

                  return;
               }
            } catch (Exception e) {
               this.logger.error(e.getMessage());
            }

            return;
         }

         try {
            bw.close();
            if (!txtTime.equals("")) {
               String newPath = this.oldLogPath + "/old_log_" + txtTime + ".txt";
               File newFile = new File(newPath);
               boolean flag = file.renameTo(newFile);
               if (!flag) {
                  this.logger.error("后台日志改名失败！！");
               }
            }
         } catch (Exception e) {
            this.logger.error(e.getMessage());
         }

      }
   }

   public void addMoneyLog(GamePlayer player, int logId, long num, long leftNum, String reason) {
      PlayerDao playerDao = player.getPlayerDao();
      LogOldData oldData = new LogOldData(logId);
      oldData.param_n3 = String.valueOf(num);
      oldData.param_n4 = String.valueOf(leftNum);
      oldData.param_z3 = reason;
      this.addOldLog(playerDao, oldData, player);
   }

   public void addItemLog(GamePlayer player, int logId, int id, long num, String reason) {
      PlayerDao playerDao = player.getPlayerDao();
      LogOldData oldData = new LogOldData(logId);
      oldData.param_n3 = String.valueOf(id);
      oldData.param_n4 = String.valueOf(num);
      oldData.param_z3 = reason;
      this.addOldLog(playerDao, oldData, player);
   }

   public void addCopyLog(GamePlayer player, int copyId, String copyType) {
      PlayerDao playerDao = player.getPlayerDao();
      LogOldData oldData = new LogOldData(35);
      oldData.param_n3 = String.valueOf(copyId);
      oldData.param_z3 = copyType;
      oldData.param_n4 = String.valueOf(playerDao.lv);
      oldData.param_n5 = String.valueOf(playerDao.lv);
      this.addOldLog(playerDao, oldData, player);
   }

   public void addActivityLog(GamePlayer player, int activityId, String activityName) {
      PlayerDao playerDao = player.getPlayerDao();
      LogOldData oldData = new LogOldData(22);
      oldData.param_n3 = String.valueOf(activityId);
      oldData.param_n4 = String.valueOf(playerDao.lv);
      oldData.param_z3 = activityName;
      oldData.param_n6 = "-";
      this.addOldLog(playerDao, oldData, player);
   }

   @TaskMethod
   public void addMailLog(GamePlayer player, int logId, int itemId, int num, String mailTitle, String mailContent, int acceptId) {
      PlayerDao playerDao = player.getPlayerDao();
      LogOldData oldData = new LogOldData(logId);
      oldData.param_n3 = String.valueOf(itemId);
      oldData.param_n4 = String.valueOf(num);
      oldData.param_z3 = mailTitle;
      oldData.param_z4 = mailContent;
      oldData.param_n5 = String.valueOf(acceptId);
      this.addOldLog(playerDao, oldData, player);
   }

   public void addMailNewLog(GamePlayer player, int logId, String[] prop, String mailTitle, String mailContent) {
      LogNewData data = new LogNewData();
      if (prop != null && prop.length > 0) {
         data.param1 = prop[0];
         data.param2 = prop[1];
         data.param3 = prop[2];
      } else {
         data.param1 = "-";
         data.param2 = "-";
         data.param3 = "-";
      }

      data.param4 = mailTitle;
      data.param5 = mailContent;
      this.addNewLog(player, data, logId);
   }

   public void addLoginLog(String clientIp, GamePlayer player, String netInfo, String devOsVer, String devName) {
      PlayerDao playerDao = player.getPlayerDao();
      LogOldData oldData = new LogOldData(54);
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)player.getData("tb_player_recharge", player.getPlayerId());
      oldData.param_n3 = clientIp.substring(1).split(":")[0];
      oldData.param_n4 = String.valueOf(playerDao.lv);
      oldData.param_z3 = String.valueOf(playerRechargeDao.totalRecharge);
      oldData.param_z4 = String.valueOf(player.getPlayerCombatPower());
      if (!Objects.isNull(player) && player.getDevUID() != null && !player.getDevUID().equals("")) {
         oldData.param_n5 = player.getDevUID();
      }

      this.addOldLog(playerDao, oldData, player);
      LogNewData newData = new LogNewData();
      newData.param1 = clientIp.substring(1).split(":")[0];
      newData.param2 = player.getDevUID();
      newData.param3 = netInfo;
      newData.param4 = devOsVer;
      newData.param5 = devName;
      this.addNewLog(player, newData, 2);
      this.addExtraLog(player, newData, 2);
   }

   public void addExtraLoginLog(String clientIp, GamePlayer player) {
      PlayerDao playerDao = player.getPlayerDao();
      LogOldData oldData = new LogOldData(54);
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)player.getData("tb_player_recharge", player.getPlayerId());
      oldData.param_n3 = clientIp.substring(1).split(":")[0];
      oldData.param_n4 = String.valueOf(playerDao.lv);
      oldData.param_z3 = String.valueOf(playerRechargeDao.totalRecharge);
      oldData.param_z4 = String.valueOf(player.getPlayerCombatPower());
      if (!Objects.isNull(player) && player.getDevUID() != null && !player.getDevUID().equals("")) {
         oldData.param_n5 = player.getDevUID();
      }

      this.addOldLog(playerDao, oldData, player);
      LogNewData newData = new LogNewData();
      newData.param1 = clientIp.substring(1).split(":")[0];
      newData.param2 = player.getDevUID();
      newData.param3 = "-";
      newData.param4 = "-";
      newData.param5 = "-";
      if (!Objects.isNull(player) && player.getDevUID() != null && !player.getDevUID().equals("")) {
         DeviceDao deviceDao = this.worldMgr.getDevice(player.getDevUID());
         if (!Objects.isNull(deviceDao) && deviceDao.jsonData != null && !deviceDao.jsonData.equals("")) {
            DeviceData deviceData = (DeviceData)JsonUtil.jsonToBean(deviceDao.jsonData, DeviceData.class);
            if (deviceData != null && deviceData.netInfo != null && !deviceData.netInfo.equals("")) {
               newData.param3 = deviceData.netInfo;
            }

            if (deviceData != null && deviceData.devOsVer != null && !deviceData.devOsVer.equals("")) {
               newData.param4 = deviceData.devOsVer;
            }

            if (deviceData != null && deviceData.devName != null && !deviceData.devName.equals("")) {
               newData.param5 = deviceData.devName;
            }
         }
      }

      this.addNewLog(player, newData, 2);
      this.addExtraLog(player, newData, 2);
   }

   public void addLogoutLog(GamePlayer player, long onlineTime, String clientIp) {
      PlayerDao playerDao = player.getPlayerDao();
      LogOldData oldData = new LogOldData(55);
      oldData.param_n3 = String.valueOf(onlineTime);
      oldData.param_n4 = String.valueOf(player.getPlayerCombatPower());
      oldData.param_z3 = String.valueOf(playerDao.gold);
      oldData.param_n5 = String.valueOf(playerDao.lv);
      if (!Objects.isNull(player) && player.getDevUID() != null && !player.getDevUID().equals("")) {
         oldData.param_n6 = player.getDevUID();
      }

      oldData.param_n7 = clientIp.substring(1).split(":")[0];
      this.addOldLog(playerDao, oldData, player);
      LogNewData newData = new LogNewData();
      newData.param1 = clientIp.substring(1).split(":")[0];
      if (player.getDevUID() != null && !player.getDevUID().equals("")) {
         newData.param2 = player.getDevUID();
      }

      if (!Objects.isNull(player) && player.getDevUID() != null && !player.getDevUID().equals("")) {
         DeviceDao deviceDao = this.worldMgr.getDevice(player.getDevUID());
         if (!Objects.isNull(deviceDao) && deviceDao.jsonData != null && !deviceDao.jsonData.equals("")) {
            DeviceData deviceData = (DeviceData)JsonUtil.jsonToBean(deviceDao.jsonData, DeviceData.class);
            if (deviceData != null && deviceData.netInfo != null && !deviceData.netInfo.equals("")) {
               newData.param3 = deviceData.netInfo;
            }

            if (deviceData != null && deviceData.devOsVer != null && !deviceData.devOsVer.equals("")) {
               newData.param4 = deviceData.devOsVer;
            }

            if (deviceData != null && deviceData.devName != null && !deviceData.devName.equals("")) {
               newData.param5 = deviceData.devName;
            }
         }
      }

      if (!Objects.isNull(player) && playerDao.lastLoginTime != 0L) {
         newData.param6 = DateUtil.transferLongToDate(playerDao.lastLoginTime, "yyyy-MM-dd HH:mm:ss");
      }

      this.addNewLog(player, newData, 3);
      this.addExtraLog(player, newData, 3);
   }

   public void addUpLevelLog(GamePlayer player) {
      PlayerDao playerDao = player.getPlayerDao();
      LogOldData oldData = new LogOldData(56);
      oldData.param_n3 = String.valueOf(playerDao.lv);
      oldData.param_n4 = "-";
      this.addOldLog(playerDao, oldData, player);
      LogNewData newData = new LogNewData();
      newData.param1 = String.valueOf(playerDao.lv);
      newData.param2 = String.valueOf(playerDao.active);
      newData.param3 = String.valueOf(player.getPlayerCombatPower());
      this.addNewLog(player, newData, 10);
      this.addExtraLog(player, newData, 10);
   }

   public void addPowerChangeLog(GamePlayer player, long oldPower, String reason, HeroDefine.HeroPropertyModel model) {
      if (!player.isRobot()) {
         PlayerDao playerDao = player.getPlayerDao();
         LogOldData oldData = new LogOldData(121);
         String clientIp = player.getLogClientIp();
         if (clientIp.startsWith("null:")) {
            this.logger.warn("添加战力变化日志:无法获取玩家{}-{}的ip,{}", new Object[]{playerDao.playerId, playerDao.playerName, clientIp.split(":")[1]});
         } else {
            oldData.param_n6 = clientIp.substring(1).split(":")[0];
         }

         long changeNum = player.getPlayerCombatPower() - oldPower;
         oldData.param_n3 = String.valueOf(player.getPlayerCombatPower());
         oldData.param_n4 = String.valueOf(changeNum);
         oldData.param_z3 = String.valueOf(oldPower);
         oldData.param_z4 = String.valueOf(player.getMaxPlayerCombatPower());
         if (model != null) {
            oldData.param_z5 = model.name();
            oldData.param_z6 = model.name();
         } else {
            oldData.param_z5 = "保存阵容";
            oldData.param_z6 = "保存阵容";
         }

         this.addOldLog(playerDao, oldData, player);
         LogNewData newData = new LogNewData();
         newData.param1 = String.valueOf(oldPower);
         newData.param2 = String.valueOf(player.getPlayerCombatPower());
         newData.param3 = String.valueOf(changeNum);
         newData.param4 = String.valueOf(player.getPlayerCombatPower());
         newData.param5 = reason;
         if (model != null) {
            newData.param6 = model.name();
         }

         this.addNewLog(player, newData, 55);
      }
   }

   public void addHeartMsgLog(GamePlayer player, String ip) {
      if (player != null) {
         PlayerDao playerDao = player.getPlayerDao();
         if (playerDao != null) {
            LogOldData oldData = new LogOldData(21);
            oldData.param_n3 = String.valueOf(playerDao.lv);
            oldData.param_n4 = String.valueOf(player.getPlayerCombatPower());
            this.addOldLog(playerDao, oldData, player);
            LogNewData newData = new LogNewData();
            newData.param1 = ip.substring(1).split(":")[0];
            newData.param2 = player.getDevUID();
            newData.param3 = "-";
            newData.param4 = String.valueOf(player.getPlayerCombatPower());
            newData.param5 = String.valueOf(playerDao.lv);
            newData.param6 = String.valueOf(playerDao.active);
            PlayerExtend playerExtend = (PlayerExtend)player.getPlayerExtend(13);
            int onlineTimeCount = 0;
            if (playerDao.lastLoginTime - DateUtil.getDayStartTimeStamp() >= 0L) {
               onlineTimeCount = (int)(System.currentTimeMillis() - playerDao.lastLoginTime + playerExtend.todayOnlineTime);
            } else {
               int temp = (int)(System.currentTimeMillis() - DateUtil.getDayStartTimeStamp());
               onlineTimeCount = (int)((long)temp + playerExtend.todayOnlineTime);
            }

            onlineTimeCount /= 1000;
            newData.param7 = String.valueOf(onlineTimeCount);
            this.addNewLog(player, newData, 5);
         }
      }
   }

   public void addOnLinePlayerLog(int onLineNum) {
      LogOldData oldData = new LogOldData(49);
      oldData.playerId = String.valueOf(onLineNum);
      oldData.param_n3 = "-";
      oldData.param_n4 = "-";
      oldData.platformName = this.worldMgr.PLATFORM_NAME;
      this.addOldLog((PlayerDao)null, oldData, (GamePlayer)null);
      LogNewData newData = new LogNewData();
      newData.param1 = String.valueOf(onLineNum);
      this.addNewLog((GamePlayer)null, newData, 11);
      Map<String, Set<Integer>> map = new HashMap();

      for(GamePlayer player : this.worldMgr.getOnlinePlayer()) {
         if (!Objects.isNull(player) && player.getDevUID() != null && !player.getDevUID().equals("")) {
            DeviceDao deviceDao = this.worldMgr.getDevice(player.getDevUID());
            if (!Objects.isNull(deviceDao) && deviceDao.jsonData != null && !deviceDao.jsonData.equals("")) {
               DeviceData deviceData = (DeviceData)JsonUtil.jsonToBean(deviceDao.jsonData, DeviceData.class);
               if (deviceData != null && deviceData.agentId != null && !deviceData.agentId.equals("")) {
                  String agentName = deviceData.agentId;
                  if (map.containsKey(agentName)) {
                     ((Set)map.get(agentName)).add(player.getPlayerId());
                  } else {
                     Set<Integer> tempSet = new HashSet();
                     tempSet.add(player.getPlayerId());
                     map.put(agentName, tempSet);
                  }
               }
            }
         }
      }

      for(Map.Entry<String, Set<Integer>> entry : map.entrySet()) {
         LogOldData oldExtraLog = new LogOldData(49);
         oldExtraLog.playerId = String.valueOf(((Set)entry.getValue()).size());
         oldExtraLog.param_n3 = "-";
         oldExtraLog.param_n4 = "-";
         oldExtraLog.platformName = (String)entry.getKey();
         oldExtraLog.accountName = "-";
         oldExtraLog.agentName = (String)entry.getKey();
         this.addOnlineLog(oldExtraLog);
      }

   }

   public void addCreateUserNewLog(GamePlayer player, String clientIp) {
      PlayerDao playerDao = player.getPlayerDao();
      LogNewData newData = new LogNewData();
      newData.param1 = clientIp.substring(1).split(":")[0];
      newData.param2 = player.getDevUID();
      newData.param4 = String.valueOf(playerDao.sex);
      this.addNewLog(player, newData, 1);
      this.addExtraLog(player, newData, 1);
   }

   public void addCreateUserOldLog(GamePlayer player) {
      PlayerDao playerDao = player.getPlayerDao();
      LogOldData oldData = new LogOldData(53);
      oldData.param_n3 = String.valueOf(playerDao.sex);
      oldData.param_n4 = "-";
      oldData.platformName = this.worldMgr.PLATFORM_NAME;
      this.addOldLog(playerDao, oldData, player);
   }

   public void changeHeadOldLog(GamePlayer player) {
      PlayerDao playerDao = player.getPlayerDao();
      LogOldData oldData = new LogOldData(122);
      oldData.param_n3 = String.valueOf(playerDao.head);
      oldData.param_n4 = String.valueOf(playerDao.headFrame);
      oldData.param_z3 = String.valueOf(playerDao.sex);
      oldData.param_z4 = String.valueOf(playerDao.lv);
      oldData.param_n5 = String.valueOf(playerDao.vip_lv);
      oldData.platformName = this.worldMgr.PLATFORM_NAME;
      this.addOldLog(playerDao, oldData, player);
   }

   public void bandSpeakOldLog(GamePlayer player, String time, String reason) {
      PlayerDao playerDao = player.getPlayerDao();
      LogOldData oldData = new LogOldData(17);
      oldData.param_n3 = String.valueOf(time);
      oldData.param_z5 = reason;
      oldData.platformName = this.worldMgr.PLATFORM_NAME;
      this.addOldLog(playerDao, oldData, player);
   }

   public void addChatNewLog(GamePlayer player, int channelId, String msg, int otherId) {
      String otherName = "-";
      String otherAccount = "-";
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(otherId);
      if (!Objects.isNull(gamePlayer)) {
         PlayerPublicDao playerDao = gamePlayer.getPublicDao();
         otherName = playerDao.playerName;
         otherAccount = gamePlayer.getAccount();
      }

      LogNewData newData = new LogNewData();
      newData.param1 = msg;
      newData.param2 = String.valueOf(channelId);
      newData.param3 = otherName;
      newData.param4 = otherAccount;
      newData.param5 = String.valueOf(otherId);
      newData.param6 = String.valueOf(DateUtil.getIntTime(System.currentTimeMillis()));
      String addressIp = player.getChannel().remoteAddress().toString();
      String ip = addressIp.substring(1).split(":")[0];
      newData.param7 = ip;
      PlayerDao playerDao = player.getPlayerDao();
      newData.param8 = player.getDevUID();
      newData.param9 = String.valueOf(playerDao.lv);
      newData.param10 = String.valueOf(playerDao.gold);
      newData.param11 = String.valueOf(playerDao.combat_power);
      PlayerExtend playerExtend = (PlayerExtend)player.getPlayerExtend(13);
      String silent = playerExtend.silent > System.currentTimeMillis() ? "1" : "0";
      newData.param12 = silent;
      String unionName = "-";
      if (playerDao.unionId > 0) {
         UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
         UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerDao.unionId);
         if (!Objects.isNull(unionMgr)) {
            UnionDao unionDao = unionMgr.getUnion();
            unionName = unionDao.unionName;
         }
      }

      newData.param13 = unionName;
      newData.param14 = "-1";
      if (channelId == 1) {
         this.addNewLog(player, newData, 9);
         this.addExtraLog(player, newData, 9);
      } else {
         this.addNewLog(player, newData, 8);
         this.addExtraLog(player, newData, 8);
      }

   }

   public void addMoneyNewLog(GamePlayer player, int logId, long num, long leftNum, String reason, String desc) {
      PlayerDao playerDao = player.getPlayerDao();
      LogNewData data = new LogNewData();
      data.param1 = String.valueOf(num);
      data.param2 = String.valueOf(leftNum);
      if (logId != 19 && logId != 20 && logId != 22) {
         if (logId == 23 || logId == 24 || logId == 26) {
            if (!StringUtils.isEmpty(desc)) {
               data.param5 = desc;
            }

            data.param3 = reason;
            data.param6 = String.valueOf(player.getPlayerCombatPower());
            data.param7 = String.valueOf(playerDao.active);
            data.param8 = String.valueOf(playerDao.lv);
         }
      } else {
         data.param3 = reason;
         if (StringUtils.isEmpty(desc)) {
            data.param4 = reason;
         } else {
            data.param4 = desc;
         }

         data.param8 = String.valueOf(player.getPlayerCombatPower());
         data.param9 = String.valueOf(playerDao.active);
         data.param10 = String.valueOf(playerDao.lv);
      }

      this.addNewLog(player, data, logId);
   }

   public void addCoinNewLog(GamePlayer player, int num, long leftNum, String... buyInfo) {
      LogNewData data = new LogNewData();
      data.param1 = String.valueOf(Math.abs(num));
      data.param2 = String.valueOf(leftNum);
      int newLogId;
      LogOldData oldData;
      if (num < 0) {
         newLogId = 21;
         data.param3 = buyInfo[0];
         data.param4 = buyInfo[1];
         oldData = new LogOldData(91);
         oldData.param_z3 = buyInfo[0];
         oldData.param_z4 = buyInfo[1];
      } else {
         newLogId = 25;
         data.param3 = buyInfo[0];
         oldData = new LogOldData(90);
         oldData.param_z3 = buyInfo[0];
      }

      this.addNewLog(player, data, newLogId);
      oldData.param_n3 = String.valueOf(Math.abs(num));
      oldData.param_n4 = String.valueOf(leftNum);
      this.addOldLog(player.getPlayerDao(), oldData, player);
   }

   public void addHeroExpNewLog(GamePlayer player, int logId, long num, long leftNum, String reason) {
      PlayerDao playerDao = player.getPlayerDao();
      LogNewData data = new LogNewData();
      data.param1 = String.valueOf(num);
      data.param2 = String.valueOf(leftNum);
      data.param3 = reason;
      data.param4 = String.valueOf(player.getPlayerCombatPower());
      data.param5 = String.valueOf(playerDao.active);
      data.param6 = String.valueOf(playerDao.lv);
      this.addNewLog(player, data, logId);
   }

   public void addUnionNewLog(GamePlayer player, int logId, long num, long leftNum, String reason) {
      PlayerDao playerDao = player.getPlayerDao();
      LogNewData data = new LogNewData();
      data.param1 = String.valueOf(num);
      data.param2 = String.valueOf(leftNum);
      data.param3 = reason;
      data.param4 = String.valueOf(player.getPlayerCombatPower());
      data.param5 = String.valueOf(playerDao.active);
      data.param6 = String.valueOf(playerDao.lv);
      this.addNewLog(player, data, logId);
   }

   public void addItemNewLog(GamePlayer player, int logType, int id, long num, long leftNum, String reason) {
      int logId = 0;
      PlayerDao playerDao = player.getPlayerDao();
      ItemModel model = (ItemModel)player.getGameModelPool().getEntity("item", id);
      LogNewData data = new LogNewData();
      if (Objects.isNull(model)) {
         if (logType == 1) {
            logId = 33;
         } else {
            logId = 36;
         }

         data.param1 = String.valueOf(id);
         data.param3 = String.valueOf(num);
         data.param8 = reason;
      } else if (id == 1006) {
         if (logType == 1) {
            logId = 29;
         } else {
            logId = 32;
         }

         data.param1 = String.valueOf(num);
         data.param2 = String.valueOf(leftNum);
         data.param3 = reason;
         data.param4 = String.valueOf(player.getPlayerCombatPower());
         data.param5 = String.valueOf(playerDao.active);
         data.param6 = String.valueOf(playerDao.lv);
      } else if (model.getSubclass() == 2) {
         if (logType == 1) {
            logId = 37;
         } else {
            logId = 38;
         }

         data.param1 = String.valueOf(id);
         data.param2 = model.getName();
         data.param3 = String.valueOf(num);
         data.param4 = String.valueOf(model.getSubclass());
         data.param5 = String.valueOf(model.getSubclass());
         data.param6 = String.valueOf(model.getStar());
         data.param7 = String.valueOf(model.getQuality());
         data.param8 = reason;
      } else {
         if (logType == 1) {
            logId = 33;
         } else {
            logId = 36;
         }

         data.param1 = String.valueOf(id);
         data.param2 = model.getName();
         data.param3 = String.valueOf(num);
         data.param4 = String.valueOf(model.getSubclass());
         data.param5 = String.valueOf(model.getSubclass());
         data.param6 = String.valueOf(model.getStar());
         data.param7 = String.valueOf(model.getQuality());
         data.param8 = reason;
      }

      this.addNewLog(player, data, logId);
      if (logId == 36 || logId == 33) {
         this.addExtraLog(player, data, logId);
      }

   }

   public void addTaskNewLog(GamePlayer player, int logId, int taskId, String taskType, String taskName, String time1, String time2) {
      PlayerDao playerDao = player.getPlayerDao();
      LogNewData data = new LogNewData();
      data.param1 = String.valueOf(taskId);
      data.param2 = taskType;
      data.param3 = time1;
      data.param4 = String.valueOf(playerDao.lv);
      data.param5 = taskName;
      if (logId == 1201) {
         data.param6 = time2;
      }

      this.addNewLog(player, data, logId);
   }

   public void addRechargeNewLog(GamePlayer player, int oldVipLevel, int amount, String rechargeType, String rechargeWayName, String rechargeName) {
      PlayerDao playerDao = player.getPlayerDao();
      LogNewData data = new LogNewData();
      data.param1 = String.valueOf(oldVipLevel);
      data.param2 = String.valueOf(amount);
      data.param3 = String.valueOf(playerDao.lv);
      data.param4 = String.valueOf(player.getPlayerCombatPower());
      data.param5 = String.valueOf(playerDao.active);
      data.param6 = rechargeType;
      data.param7 = rechargeWayName;
      data.param8 = player.getDevUID();
      data.param9 = rechargeName;
      this.addNewLog(player, data, 7);
   }

   public void addVipNewLog(GamePlayer player, int logId, int oldVipLevel, int vipExp, int expSum, int rechargeSum) {
      PlayerDao playerDao = player.getPlayerDao();
      LogNewData data = new LogNewData();
      data.param1 = String.valueOf(oldVipLevel);
      data.param2 = String.valueOf(playerDao.lv);
      data.param3 = String.valueOf(player.getPlayerCombatPower());
      data.param4 = String.valueOf(playerDao.active);
      if (logId == 6) {
         data.param5 = String.valueOf(rechargeSum);
      } else if (logId == 18) {
         data.param5 = String.valueOf(vipExp);
         data.param6 = String.valueOf(expSum);
      }

      this.addNewLog(player, data, logId);
      if (logId == 6) {
         LogOldData oldData = new LogOldData(47);
         oldData.param_n3 = String.valueOf(playerDao.vip_lv);
         oldData.param_n4 = "-";
         oldData.param_n6 = String.valueOf(rechargeSum);
         this.addOldLog(playerDao, oldData, player);
      }

   }

   public void addReceiveAwardNewLog(GamePlayer player, int logId, int activityId, String activityType, String gearId, String gearName, int gearNum, int awardNo, int awardNum) {
      PlayerPublicDao playerDao = player.getPublicDao();
      LogNewData data = new LogNewData();
      data.param1 = String.valueOf(activityId);
      data.param2 = activityType;
      data.param3 = gearId;
      data.param4 = String.valueOf(gearName);
      data.param5 = String.valueOf(gearNum);
      data.param6 = String.valueOf(awardNo);
      data.param7 = String.valueOf(awardNum);
      data.param8 = String.valueOf(player.getPlayerCombatPower());
      data.param9 = String.valueOf(playerDao.active);
      data.param10 = String.valueOf(playerDao.lv);
      this.addNewLog(player, data, logId);
   }

   public String appendOldData(LogOldData data) {
      StringBuffer buffer = new StringBuffer();
      buffer.append(data.logTime).append("\t").append(data.logId).append("\t").append(data.accountName).append("\t").append(data.playerId).append("\t").append(data.playerName).append("\t").append(data.platformName).append("\t").append(data.agentName).append("\t").append(data.param_n3).append("\t").append(data.param_n4).append("\t").append(data.param_z3).append("\t").append(data.param_z4).append("\t").append(data.param_n5).append("\t").append(data.param_n6).append("\t").append(data.param_z5).append("\t").append(data.param_z6).append("\t").append(data.param_n7).append("\t").append(data.param_n8).append("\t").append(data.param_n9).append("\t").append(data.param_n10).append("\t").append(data.param_n11).append("\r\n");
      return buffer.toString();
   }

   public String appendNewData(LogNewData data) {
      StringBuffer buffer = new StringBuffer();
      String time = "[" + data.logTime + "] quick2 (Info):";
      String realAgentId = "-";
      if (!data.agentId.equals("") && !data.agentId.equals("-")) {
         char[] devC = data.agentId.toCharArray();
         if (devC.length < 8) {
            long agentId = BitMap.stringToAscii(data.agentId);
            realAgentId = agentId + "";
         }
      }

      String platformName = data.platformName.replace("\"", "");
      StringBuffer var10000 = buffer.append(time).append(" ").append(data.logId).append("\t");
      data.getClass();
      var10000.append("hb01").append("\t").append(this.worldMgr.country).append("\t").append(platformName).append("\t").append(data.serverId).append("\t").append(realAgentId).append("\t").append(data.playerId).append("\t").append(data.playerName).append("\t").append(data.userId).append("\t").append(data.vipLevel).append("\t").append(data.param1).append("\t").append(data.param2).append("\t").append(data.param3).append("\t").append(data.param4).append("\t").append(data.param5).append("\t").append(data.param6).append("\t").append(data.param7).append("\t").append(data.param8).append("\t").append(data.param9).append("\t").append(data.param10).append("\t").append(data.param11).append("\t").append(data.param12).append("\t").append(data.param13).append("\t").append(data.param14).append("\t").append(data.param15).append("\t").append(data.param16).append("\t").append(data.param17).append("\r\n");
      return buffer.toString();
   }

   public List<HeroDao> getHerosById(GamePlayer player, int heroId) {
      List<HeroDao> result = new ArrayList();
      Map<Integer, HeroDao> map = player.<Integer, HeroDao>getMap("tb_hero_bag", player.getPlayerId());

      for(Map.Entry<Integer, HeroDao> entry : map.entrySet()) {
         if (((HeroDao)entry.getValue()).id == heroId) {
            result.add(entry.getValue());
         }
      }

      return result;
   }

   public void closeServerSave() {
      try {
         this.writeTime = 0L;
         this.writeFile();
         this.writeExtraFile();
      } catch (Exception e) {
         this.logger.error(e.getMessage());
      }

   }

   public void addExtraLog(GamePlayer player, int logId, String... args) {
      this.pushTask(() -> {
         PlayerPublicDao playerDao = player.getPublicDao();
         LogNewData newData = new LogNewData();
         newData.param1 = String.valueOf(playerDao.lv);
         newData.param2 = String.valueOf(player.getPlayerCombatPower());

         for(int i = 1; i <= args.length; ++i) {
            switch (i) {
               case 1:
                  newData.param3 = args[0];
                  break;
               case 2:
                  newData.param4 = args[1];
                  break;
               case 3:
                  newData.param5 = args[2];
                  break;
               case 4:
                  newData.param6 = args[3];
                  break;
               case 5:
                  newData.param7 = args[4];
                  break;
               case 6:
                  newData.param8 = args[5];
                  break;
               case 7:
                  newData.param9 = args[6];
                  break;
               case 8:
                  newData.param10 = args[7];
                  break;
               case 9:
                  newData.param11 = args[8];
                  break;
               case 10:
                  newData.param12 = args[9];
                  break;
               case 11:
                  newData.param13 = args[10];
                  break;
               case 12:
                  newData.param14 = args[11];
                  break;
               case 13:
                  newData.param15 = args[12];
                  break;
               case 14:
                  newData.param16 = args[13];
                  break;
               case 15:
                  newData.param17 = args[14];
                  break;
               default:
                  this.logger.error("参数超长了， 及时检查：" + logId + "----" + args.length);
            }
         }

         this.addNewLog(player, newData, logId);
      });
   }

   public static String[] toRewardsInfo(List<ResourceModel> rewardsList) {
      String[] resultStrArray = new String[]{"", "", ""};
      if (rewardsList != null && !rewardsList.isEmpty()) {
         int loop = 0;

         for(ResourceModel resourceModel : rewardsList) {
            ++loop;
            resultStrArray[0] = resultStrArray[0] + resourceModel.getId();
            resultStrArray[1] = resultStrArray[1] + resourceModel.getValue();
            String name = "";
            GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
            switch (resourceModel.getType()) {
               case 1:
                  PlayerProperty propertyModel = (PlayerProperty)gameModelPool.getEntity("playerProperty", resourceModel.getId());
                  if (propertyModel != null) {
                     name = propertyModel.getName();
                  }
                  break;
               case 2:
                  ItemModel itemModel = (ItemModel)gameModelPool.getEntity("item", resourceModel.getId());
                  if (itemModel != null) {
                     name = itemModel.getName();
                  }
                  break;
               case 3:
                  HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", resourceModel.getId());
                  if (heroModel != null) {
                     name = heroModel.getName();
                  }
            }

            resultStrArray[2] = resultStrArray[2] + name;
            if (loop != rewardsList.size()) {
               resultStrArray[0] = resultStrArray[0] + ",";
               resultStrArray[1] = resultStrArray[1] + ",";
               resultStrArray[2] = resultStrArray[2] + ",";
            }
         }

         return resultStrArray;
      } else {
         return resultStrArray;
      }
   }

   public static long getLeftNum(GamePlayer player, int type, int id) {
      long leftNum = 0L;
      PlayerDao playerDao = player.getPlayerDao();
      if (type == 1) {
         leftNum = playerDao.getProperty(id);
      } else if (type == 2) {
         ItemBagPart itemBagPart = (ItemBagPart)player.getMgrPart(ItemBagPart.class);
         leftNum = (long)itemBagPart.getItemNum(id);
      } else if (type == 3) {
         HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
         List<HeroDao> heroById = heroBagPart.findHeroById(id);
         if (heroById != null) {
            leftNum = (long)heroById.size();
         }
      }

      return leftNum;
   }

   public static String[] toRewardsInfo(ResourceModel resourceModel) {
      String[] resultStrArray = new String[]{"", "", ""};
      if (resourceModel == null) {
         return resultStrArray;
      } else {
         resultStrArray[0] = resultStrArray[0] + resourceModel.getId();
         resultStrArray[1] = resultStrArray[1] + resourceModel.getValue();
         String name = "";
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         switch (resourceModel.getType()) {
            case 1:
               PlayerProperty propertyModel = (PlayerProperty)gameModelPool.getEntity("playerProperty", resourceModel.getId());
               if (propertyModel != null) {
                  name = propertyModel.getName();
               }
               break;
            case 2:
               ItemModel itemModel = (ItemModel)gameModelPool.getEntity("item", resourceModel.getId());
               if (itemModel != null) {
                  name = itemModel.getName();
               }
               break;
            case 3:
               HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", resourceModel.getId());
               if (heroModel != null) {
                  name = heroModel.getName();
               }
         }

         resultStrArray[2] = resultStrArray[2] + name;
         return resultStrArray;
      }
   }

   public synchronized void testWrite(String data) {
      String path = "f:/test.txt";
      BufferedWriter bw = null;
      File file = null;

      try {
         file = new File(path);
         File fileParent = file.getParentFile();
         if (!fileParent.exists()) {
            fileParent.mkdirs();
         }

         if (!file.exists()) {
            file.createNewFile();
         }

         OutputStream os = new FileOutputStream(file, true);
         bw = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
         bw.write(data);
         bw.flush();
      } catch (Exception e) {
         this.logger.error(e.getMessage());
      } finally {
         try {
            bw.close();
         } catch (Exception e) {
            this.logger.error(e.getMessage());
         }

      }

   }

   public void addHeroWinRate(String heroName, int heroId, int heroLev, long heroPower, int battleType, int isWin) {
      this.pushTask(() -> {
         LogNewData newData = new LogNewData();
         newData.param1 = String.valueOf(heroName);
         newData.param2 = String.valueOf(heroId);
         newData.param3 = String.valueOf(heroLev);
         newData.param4 = String.valueOf(heroPower);
         newData.param5 = String.valueOf(battleType);
         newData.param6 = String.valueOf(isWin);
         this.addNewLog((GamePlayer)null, newData, 208);
      });
   }

   public void alterUnionContent(GamePlayer player, String unionName, int leaderId, String leaderName, String content) {
      this.pushTask(() -> {
         LogNewData newData = new LogNewData();
         newData.param1 = unionName;
         newData.param2 = String.valueOf(leaderId);
         newData.param3 = leaderName;
         newData.param4 = content;
         this.addNewLog(player, newData, 209);
         this.addExtraLog(player, newData, 209);
      });
   }

   @Scheduled(
      cron = "0 0 * * * ?"
   )
   public void writeExtraFile() throws IOException {
      this.pushTask(() -> this.writeExtraData((LogNewData)null, this.getCurTimeStr()));
   }

   @Scheduled(
      cron = "0 0/1 * * * ?"
   )
   public void writeExtraFileMinute() throws IOException {
      this.pushTask(() -> this.writeExtraData((LogNewData)null, ""));
   }

   public void addExtraLog(GamePlayer player, LogNewData newData, int logId) {
      if (Objects.isNull(player)) {
         newData.logId = logId;
         newData.playerId = "-";
         newData.playerName = "-";
         newData.platformName = this.worldMgr.PLATFORM_NAME;
         newData.serverId = this.worldMgr.GAME_SERVER_ID;
         newData.agentId = "-";
         newData.userId = "-";
         newData.vipLevel = "-";
      } else {
         PlayerPublicDao playerDao = player.getPublicDao();
         newData.logId = logId;
         newData.playerId = String.valueOf(playerDao.playerId);
         newData.playerName = playerDao.playerName;
         newData.platformName = this.worldMgr.PLATFORM_NAME;
         newData.serverId = player.getServerId();
         newData.agentId = "-";
         newData.userId = player.getPlayerDao().account;
         newData.vipLevel = String.valueOf(playerDao.vip_lv);
      }

      if (!Objects.isNull(player) && player.getDevUID() != null && !player.getDevUID().equals("")) {
         DeviceDao deviceDao = this.worldMgr.getDevice(player.getDevUID());
         if (!Objects.isNull(deviceDao) && deviceDao.jsonData != null && !deviceDao.jsonData.equals("")) {
            DeviceData deviceData = (DeviceData)JsonUtil.jsonToBean(deviceDao.jsonData, DeviceData.class);
            if (deviceData != null && deviceData.agentId != null && !deviceData.agentId.equals("")) {
               newData.agentId = deviceData.agentId;
            }
         }
      }

      this.writeExtraData(newData, "");
   }

   private synchronized void writeExtraData(LogNewData newData, String txtTime) {
      if (Objects.isNull(this.extraBuffer)) {
         this.extraBuffer = new StringBuffer(10240);
      }

      if (Objects.isNull(newData)) {
         this.bufferedWriteExtraLog(this.extraBuffer.toString(), txtTime);
         this.extraBuffer.setLength(0);
      } else {
         long startTime = System.currentTimeMillis();
         if (this.extraBuffer.length() + this.appendNewData(newData).length() > this.extraBuffer.capacity()) {
            this.bufferedWriteExtraLog(this.extraBuffer.toString() + this.appendNewData(newData), txtTime);
            this.extraBuffer.setLength(0);
         } else {
            this.extraBuffer.append(this.appendNewData(newData));
         }

         long endTime = System.currentTimeMillis();
      }
   }

   public void bufferedWriteExtraLog(String data, String txtTime) {
      if (this.logWrite != 0) {
         String path = this.extraLogPath + "/" + this.worldMgr.PLATFORM_NAME + "_s" + this.worldMgr.GAME_SERVER_ID + "_chatquick.txt";
         BufferedWriter bw = null;
         File file = null;
         boolean var18 = false;

         label132: {
            try {
               var18 = true;
               file = new File(path);
               File e = file.getParentFile();
               if (!e.exists()) {
                  e.mkdirs();
               }

               if (!file.exists()) {
                  file.createNewFile();
               }

               OutputStream os = new FileOutputStream(file, true);
               bw = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
               bw.write(data);
               bw.flush();
               var18 = false;
               break label132;
            } catch (Exception e) {
               this.logger.error(e.getMessage());
               var18 = false;
            } finally {
               if (var18) {
                  try {
                     bw.close();
                     if (!txtTime.equals("")) {
                        String newPath = this.extraLogPath + "/" + this.worldMgr.PLATFORM_NAME + "_s" + this.worldMgr.GAME_SERVER_ID + "_chatquick_" + txtTime + ".txt";
                        File newFile = new File(newPath);
                        boolean flag = file.renameTo(newFile);
                        if (!flag) {
                           this.logger.error("后台日志改名失败！！");
                        }
                     }
                  } catch (Exception e) {
                     this.logger.error(e.getMessage());
                  }

               }
            }

            try {
               bw.close();
               if (!txtTime.equals("")) {
                  String newPath = this.extraLogPath + "/" + this.worldMgr.PLATFORM_NAME + "_s" + this.worldMgr.GAME_SERVER_ID + "_chatquick_" + txtTime + ".txt";
                  File newFile = new File(newPath);
                  boolean flag = file.renameTo(newFile);
                  if (!flag) {
                     this.logger.error("后台日志改名失败！！");
                  }

                  return;
               }
            } catch (Exception e) {
               this.logger.error(e.getMessage());
            }

            return;
         }

         try {
            bw.close();
            if (!txtTime.equals("")) {
               String newPath = this.extraLogPath + "/" + this.worldMgr.PLATFORM_NAME + "_s" + this.worldMgr.GAME_SERVER_ID + "_chatquick_" + txtTime + ".txt";
               File newFile = new File(newPath);
               boolean flag = file.renameTo(newFile);
               if (!flag) {
                  this.logger.error("后台日志改名失败！！");
               }
            }
         } catch (Exception e) {
            this.logger.error(e.getMessage());
         }

      }
   }

   public String getCurTimeStr() {
      SimpleDateFormat df = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
      df.setTimeZone(TimeZone.getDefault());
      return df.format(new Date());
   }
}
