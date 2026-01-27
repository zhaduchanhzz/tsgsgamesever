package com.gzbz.gamePlayer.friend;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.collection.CollectionUtil;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.BattleTowerDao;
import com.gzbz.db.FriendDao;
import com.gzbz.db.GameDBPool;
import com.gzbz.db.MonarchDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.ReportDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.playerChat.PlayerChatPart;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.FriendMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.DateUtil;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class FriendPart extends PlayerPart {
   @Autowired
   ConfigManager configManager;
   @Autowired
   private CrossNettyClient crossNettyClient;
   Logger logger = LoggerFactory.getLogger(FriendPart.class);
   public static final String FRIEND_GIVE_LIMIT = "friendGiveLimit";
   public static final String PRESTIGE_NI_ZAI_BU_ZAI = "prestigenizaibuzai";
   public static final int TYPE_FRIEND = 1;
   public static final int TYPE_REWARD = 2;
   public static final int TYPE_BEINVITE = 3;
   public static final int TYPE_BLACK = 4;
   public static final int TYPE_CHAT = 5;
   public static final int TYPE_CROSS_PK = 6;
   public static final int TYPE_CROSS_PK_DIRECT = 7;
   public static final int OPERATE_INVITE = 1;
   public static final int OPERATE_ADD = 2;
   public static final int OPERATE_REFUSE = 3;
   public static final int OPERATE_DEL = 4;
   public static final int OPERATE_BLACK = 5;
   public static final int OPERATE_REMOVE = 6;
   public static final int OPERATE_GIVE = 7;
   public static final int OPERATE_RECEIVE = 8;
   public static final int OPERATE_FEEDBACK = 9;
   public static final int OPERATE_JOIN_CHAT = 10;
   private static final int OPERATE_OBTAIN = 11;
   private static final int OPERATE_GIVE_QUICK = 12;
   private static final int SEARCH_FIND = 1;
   private static final int SEARCH_RECOMMEND = 2;
   public static final int RECOMMEND_COUNT = 5;
   public static final int OPERATION_ACTIVE = 1;
   public static final int OPERATION_PASSIVE = 2;
   public static final int NO_GIFTS = 0;
   public static final int HAD_GIFTS = 1;
   private Map<Integer, Integer> inviteMap = new HashMap();

   public void resetDaily() {
      this.inviteMap.clear();
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      friendDao.reset();
      this.checkUpdateTime();
      this.msgSendList(2);
   }

   public int getLoginPriority() {
      return 1;
   }

   public void loginHandle() {
      Set<Integer> delSet = new HashSet();
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());

      for(Integer friendId : friendDao.friends) {
         GamePlayer friendPlayer = worldMgr.getPlayerById(friendId);
         if (friendPlayer == null) {
            delSet.add(friendId);
         }
      }

      friendDao.friends.removeAll(delSet);
      if (friendDao.friends.size() >= this.configManager.getInt("friendFriendsLimit") && friendDao.beInvites.size() > 0) {
         friendDao.beInvites.clear();
      }

      friendDao.updateOp();
      this.msgSendList(1);
      this.msgSendList(2);
      this.msgSendList(3);
      this.msgSendList(5);
      this.notifyFriendOnline();
      this.checkUpdateTime();
      this.sendCrossPKListReq(0L, 0L, (String)null);
   }

   @MsgHandlerAnno
   public void msgFriendList(FriendMsg.C2S_FriendList_6301 msg, String source) {
      int typeData = msg.getTypeData();
      if (typeData == 6) {
         this.reqCrossPKList(0L, 0L, (String)null);
      } else {
         this.msgSendList(typeData);
      }

   }

   @MsgHandlerAnno
   public boolean msgFriendOperate(FriendMsg.C2S_FriendOperate_6303 msg, String source) {
      int typeOperate = msg.getTypeOperate();
      List<Integer> list = msg.getPlayerIdList();
      int operateMaxNum = this.configManager.getIntDefault("friendOperateMaxNum", 100);
      if (list.size() > operateMaxNum) {
         return this.player.failure(6004);
      } else {
         switch (typeOperate) {
            case 1:
               this.operateInvite(list);
               break;
            case 2:
               this.operateAdd(list);
               break;
            case 3:
               this.operateRefuse(list);
               break;
            case 4:
               this.operateDel(list);
               break;
            case 5:
               this.operateBlack(list);
               break;
            case 6:
               this.operateRemove(list);
               break;
            case 7:
               this.operateGive(list, false);
               break;
            case 8:
               this.operateReceive(list);
               break;
            case 9:
               this.operateGive(list, true);
               break;
            case 10:
               this.operateJoin(list);
            case 11:
            default:
               break;
            case 12:
               this.operateGiveQuick();
         }

         return true;
      }
   }

   @MsgHandlerAnno
   public boolean msgFriendSearch(FriendMsg.C2S_FriendSearch_6305 msg, String source) {
      int type = msg.getType();
      switch (type) {
         case 1:
            String playerName = msg.getPlayerName();
            this.handleSearch(playerName);
            break;
         case 2:
            this.handleRecommend();
      }

      return true;
   }

   @MsgHandlerAnno
   public void msgFriendBaseInfo(FriendMsg.C2S_FriendBaseInfo_6307 msg, String source) {
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      if (friendDao != null) {
         FriendMsg.S2C_FriendBaseInfo_6308.Builder builder = FriendMsg.S2C_FriendBaseInfo_6308.newBuilder();
         builder.setGiveTimes(friendDao.getGiveTimes());
         this.player.sendMsg(builder.build());
      }

   }

   @MsgHandlerAnno
   public void msgFriendTipOff(FriendMsg.C2S_FriendTipOff_6311 msg, String source) {
      int serverId = msg.getServerId();
      int otherId = msg.getPlayerId();
      this.reportPlayer(serverId, otherId);
   }

   public void reportPlayer(int targetServerId, int targetPlayerId) {
      this.updateReportCount();
      ReportDao reportDao = (ReportDao)this.player.getData("tb_report", this.player.getPlayerId());
      if (reportDao.count <= 0) {
         this.player.failure(58105);
      } else {
         double reportFight = this.getReportFight();
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         if (worldMgr.getServersSet().contains(targetServerId)) {
            GamePlayer other = worldMgr.getPlayerById(targetPlayerId);
            if (other == null) {
               this.logger.info("被举报的玩家不存在 playerId:{}", targetPlayerId);
               return;
            }

            ReportDao otherReportDao = (ReportDao)other.getData("tb_report", other.getPlayerId());
            if (otherReportDao.hp <= (double)0.0F) {
               this.player.failure(58107);
               return;
            }

            if (otherReportDao.reportIdSet.contains(this.player.getPlayerId())) {
               this.player.failure(58106);
               return;
            }

            int curTime = DateUtil.getIntTime(System.currentTimeMillis());
            --reportDao.count;
            reportDao.reportTime = curTime;
            reportDao.updateOp();
            FriendMsg.S2C_FriendTipOff_6312.Builder builder = FriendMsg.S2C_FriendTipOff_6312.newBuilder();
            builder.setResult(1);
            builder.setServerId(targetServerId);
            builder.setPlayerId(targetPlayerId);
            builder.setCount(reportDao.count);
            builder.setReportTime(curTime);
            this.player.sendMsg(builder.build());
            other.pushTask(() -> {
               FriendPart otherPart = (FriendPart)other.getMgrPart(FriendPart.class);
               otherPart.beReport(reportFight, this.player.getPlayerId());
            });
         } else {
            FriendMsg.S2S_ReportPlayer_6315.Builder builder = FriendMsg.S2S_ReportPlayer_6315.newBuilder();
            builder.setReportFight((int)reportFight);
            this.crossNettyClient.send2Server(this.player.getServerId(), this.player.getPlayerId(), targetServerId, targetPlayerId, builder.build());
         }

      }
   }

   public void beReport(double reportFight, int reportId) {
      PlayerDao playerDao = this.player.getPlayerDao();
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      double worldLv = (double)1.0F * (double)worldMgr.getWorldLv();
      if ((double)playerDao.lv >= worldLv * 0.8) {
         reportFight = 0.1 * reportFight;
      }

      ReportDao reportDao = (ReportDao)this.player.getData("tb_report", this.player.getPlayerId());
      this.updateReportCount();
      double curBlood = Math.max((double)0.0F, reportDao.hp - reportFight);
      reportDao.hp = curBlood;
      reportDao.reportIdSet.add(reportId);
      if (curBlood <= (double)0.0F) {
         reportDao.lv = playerDao.lv;
         BattleTowerDao towerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
         reportDao.towerLayer = towerDao.towerId;
         ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
         chatMgr.pushTask(() -> chatMgr.deletePlayerChatInfo(this.player.getPlayerId()));
         this.player.getOperationMgr().pushTask(() -> {
            this.player.getOperationMgr().bandSpeakOldLog(this.player, DateUtil.time(), "被举报，最后举报人id:" + reportId);
            this.player.getOperationMgr().addExtraLog(this.player, 191, "被举报，最后举报人id:" + reportId);
         });
      }

      reportDao.updateOp();
      this.sendReportInfo(reportDao);
   }

   public void updateReportCount() {
      int maxCount = 3;
      int coolTime = this.configManager.getIntDefault("chatcomplainCD", 1200);
      int curServerTime = DateUtil.getIntTime(System.currentTimeMillis());
      ReportDao reportDao = (ReportDao)this.player.getData("tb_report", this.player.getPlayerId());
      int resumeCount = (curServerTime - reportDao.reportTime) / coolTime;
      if (reportDao.count + resumeCount >= maxCount) {
         reportDao.count = maxCount;
         reportDao.reportTime = curServerTime;
      } else {
         reportDao.count += resumeCount;
         reportDao.reportTime += coolTime * resumeCount;
      }

      reportDao.updateOp();
   }

   public double getReportFight() {
      PlayerDao playerDao = this.player.getPlayerDao();
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      double worldLv = (double)1.0F * (double)worldMgr.getWorldLv();
      return (double)playerDao.lv * ((double)playerDao.lv / worldLv);
   }

   public double getReportBlood() {
      PlayerDao playerDao = this.player.getPlayerDao();
      double ratio = playerDao.unionId > 0 ? (double)1.5F : (double)1.0F;
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      double worldLv = (double)1.0F * (double)worldMgr.getWorldLv();
      int level = playerDao.lv > 20 ? playerDao.lv : 20;
      return (double)(level * 4) * ratio * ((double)level / worldLv);
   }

   @MsgHandlerAnno
   public void C2S_ReportInfo_6313(FriendMsg.C2S_ReportInfo_6313 msg, String source) {
      ReportDao reportDao = (ReportDao)this.player.getData("tb_report", this.player.getPlayerId());
      if (reportDao.hp == (double)-1.0F) {
         reportDao.hp = this.getReportBlood();
         reportDao.updateOp();
      }

      this.sendReportInfo(reportDao);
   }

   @MsgHandlerAnno
   public void C2S_FlushCrossPkList_6319(FriendMsg.C2S_FlushCrossPkList_6319 msg, String source) {
      this.reqCrossPKList(msg.getMatchPowerMin(), msg.getMatchPowerMax(), msg.hasPlayerName() && !StringUtils.isEmpty(msg.getPlayerName()) ? msg.getPlayerName() : null);
   }

   @MsgHandlerAnno
   public void S2S_ReportPlayer_6315(FriendMsg.S2S_ReportPlayer_6315 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.logger.info("被 {} 服的玩家 {} 举报了", crossSubscribeMsg.sourceServerId, crossSubscribeMsg.sourcePlayerId);
      int result = 1;
      ReportDao reportDao = (ReportDao)this.player.getData("tb_report", this.player.getPlayerId());
      if (reportDao.hp <= (double)0.0F) {
         result = 58107;
      }

      if (reportDao.reportIdSet.contains(crossSubscribeMsg.sourcePlayerId)) {
         result = 58106;
      }

      if (result == 1) {
         this.beReport((double)msg.getReportFight(), crossSubscribeMsg.sourcePlayerId);
      }

      FriendMsg.S2S_ReportResult_6317.Builder builder = FriendMsg.S2S_ReportResult_6317.newBuilder();
      builder.setResult(result);
      this.crossNettyClient.send2Server(this.player.getServerId(), this.player.getPlayerId(), crossSubscribeMsg.sourceServerId, crossSubscribeMsg.sourcePlayerId, builder.build());
   }

   @MsgHandlerAnno
   public void S2S_ReportResult_6317(FriendMsg.S2S_ReportResult_6317 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.logger.info("举报跨服玩家结果 被举报者服务器:{} 被举报者id:{} resultId:{}", new Object[]{crossSubscribeMsg.sourceServerId, crossSubscribeMsg.sourcePlayerId, msg.getResult()});
      int result = msg.getResult();
      if (result != 1) {
         this.player.failure(result);
      } else {
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         ReportDao reportDao = (ReportDao)this.player.getData("tb_report", this.player.getPlayerId());
         --reportDao.count;
         reportDao.reportTime = curTime;
         reportDao.updateOp();
         FriendMsg.S2C_FriendTipOff_6312.Builder builder = FriendMsg.S2C_FriendTipOff_6312.newBuilder();
         builder.setResult(1);
         builder.setServerId(crossSubscribeMsg.sourceServerId);
         builder.setPlayerId(crossSubscribeMsg.sourcePlayerId);
         builder.setCount(reportDao.count);
         builder.setReportTime(curTime);
         this.player.sendMsg(builder.build());
      }
   }

   public void msgSendList(int typeData) {
      FriendMsg.S2C_FriendList_6302.Builder builder = FriendMsg.S2C_FriendList_6302.newBuilder();
      builder.setTypeData(typeData);
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      if (friendDao != null) {
         Set<Integer> list = friendDao.getDatas(typeData);
         if (list != null) {
            boolean isPossibleInCross = false;

            for(Integer id : list) {
               GamePlayer otherPlayer = worldMgr.getPlayerById(id);
               if (otherPlayer == null && typeData == 4) {
                  isPossibleInCross = true;
               }

               if (otherPlayer != null) {
                  FriendMsg.Friend_Info.Builder info = FriendMsg.Friend_Info.newBuilder();
                  PlayerPublicDao playerPublicDao = otherPlayer.getPublicDao();
                  if (playerPublicDao != null) {
                     info.setPlayerId(id);
                     info.setPlayerName(playerPublicDao.playerName);
                     info.setSex(playerPublicDao.sex);
                     info.setLv(playerPublicDao.lv);
                     info.setVipLv(playerPublicDao.vip_lv);
                     info.setShowVip(playerPublicDao.isShowVip);
                     info.setFight(otherPlayer.getPlayerCombatPower());
                     info.setHead(playerPublicDao.head);
                     info.setHeadFrame(playerPublicDao.headFrame);
                     info.setQqWanKaLv(playerPublicDao.qqWanKaLv);
                     info.setQqLogo(playerPublicDao.qqLogo);
                     info.setServerId(playerPublicDao.serverId);
                     if (otherPlayer.isLogin()) {
                        info.setOffline(0);
                     } else {
                        info.setOffline((int)(playerPublicDao.logoutTime / 1000L));
                     }

                     int giveTimes = this.getGiveFriendshipTimes(id);
                     if (typeData == 1) {
                        info.setGiveState(giveTimes > 0 ? 1 : 0);
                     } else if (typeData == 2) {
                        int gainTimes = this.getGainFriendshipTimes(id);
                        if (gainTimes > 0) {
                           info.setGiveState(giveTimes > 0 ? 1 : 0);
                        }
                     }

                     builder.addInfo(info);
                  }
               }
            }

            if (isPossibleInCross) {
               builder.addAllBlacklist(list);
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
               return;
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   public boolean operateInvite(List<Integer> list) {
      int limitNum = this.configManager.getInt("friendFriendsLimit");
      Set<Integer> friends = this.getListByType(1);
      if (friends.size() >= limitNum) {
         return this.player.failure(6010);
      } else {
         int canAddNum = this.getAddFriendNumForDay();
         if (canAddNum <= 0) {
            return this.player.failure(61180);
         } else {
            List<Integer> result = new ArrayList();
            Iterator var6 = list.iterator();

            while(true) {
               if (var6.hasNext()) {
                  int playerId = (Integer)var6.next();
                  if (playerId == this.player.getPlayerId()) {
                     return this.player.failure(6002);
                  }

                  if (this.checkIdentity(4, playerId)) {
                     return this.player.failure(6000);
                  }

                  if (this.checkIdentity(1, playerId)) {
                     return this.player.failure(6005);
                  }

                  if (friends.size() + result.size() <= limitNum) {
                     result.add(playerId);
                     Integer times = (Integer)this.inviteMap.get(playerId);
                     if (times == null) {
                        this.inviteMap.put(playerId, 1);
                     } else {
                        this.inviteMap.put(playerId, times + 1);
                     }
                     continue;
                  }
               }

               if (result.size() == 0) {
                  return false;
               }

               this.sendMsgOperate(1, 1, result);
               this.notifyResult(1, 2, result, this.player.getPlayerId());
               return true;
            }
         }
      }
   }

   public boolean operateAdd(List<Integer> list) {
      int canAddNum = this.getAddFriendNumForDay();
      if (canAddNum <= 0) {
         return this.player.failure(61180);
      } else {
         Set<Integer> friends = this.getListByType(1);
         int totalNum = friends.size();
         if (totalNum >= this.configManager.getInt("friendFriendsLimit")) {
            return this.player.failure(6010);
         } else {
            int tempTimes = 0;
            List<Integer> results = new ArrayList();
            List<Integer> fullList = new ArrayList();
            int operateResult = 1;
            Iterator friendDao = list.iterator();

            while(true) {
               if (friendDao.hasNext()) {
                  int playerId = (Integer)friendDao.next();
                  if (playerId == this.player.getPlayerId()) {
                     return this.player.failure(6002);
                  }

                  if (this.checkIdentity(4, playerId)) {
                     return this.player.failure(6000);
                  }

                  if (this.checkIdentity(1, playerId)) {
                     return this.player.failure(6005);
                  }

                  if (!this.checkIdentity(3, playerId)) {
                     return this.player.failure(6003);
                  }

                  int tempResult = this.checkFriendFull(playerId);
                  if (tempResult != 1) {
                     fullList.add(playerId);
                     operateResult = tempResult;
                     continue;
                  }

                  results.add(playerId);
                  ++tempTimes;
                  if (tempTimes + totalNum < this.configManager.getInt("friendFriendsLimit") && tempTimes < canAddNum) {
                     continue;
                  }
               }

               FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
               friendDao.updateOp();
               if (operateResult != 1) {
                  this.player.failure(operateResult);
               }

               if (fullList.size() > 0) {
                  this.operateRefuse(fullList);
               }

               if (results.size() <= 0) {
                  return false;
               }

               this.updateData(2, results);
               this.sendMsgOperate(2, 1, results);
               this.player.triggerTask(343, 0, (long)results.size(), 1);
               PlayerPublicDao playerPublicDao = this.player.getPublicDao();
               this.notifyResult(2, 2, results, this.player.getPlayerId(), playerPublicDao.playerName);
               return true;
            }
         }
      }
   }

   public void checkFriendPrestige() {
      Set<Integer> friends = this.getListByType(1);
      if (friends.size() >= this.configManager.getInt("prestigenizaibuzai")) {
         MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
         int friendPrestigeId = this.configManager.getIntDefault("friendPrestigeId", 19525);
         if (!monarchDao.prestiges.containsKey(friendPrestigeId)) {
            this.player.addResource(2, friendPrestigeId, 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 6, 603, 0, 0, "");
         }
      }

   }

   public boolean operateRefuse(List<Integer> list) {
      this.updateData(3, list);
      this.sendMsgOperate(3, 1, list);
      return true;
   }

   public boolean operateDel(List<Integer> list) {
      for(int playerId : list) {
         if (this.checkIdentity(4, playerId)) {
            return this.player.failure(6000);
         }

         if (!this.checkIdentity(1, playerId)) {
            return this.player.failure(6006);
         }
      }

      this.updateData(4, list);
      this.sendMsgOperate(4, 1, list);
      this.notifyResult(4, 2, list, this.player.getPlayerId());
      return true;
   }

   public boolean operateBlack(List<Integer> list) {
      if (list.size() > 1) {
         return false;
      } else if (list.size() < 1) {
         return false;
      } else {
         Set<Integer> blacks = this.getListByType(4);
         if (blacks.size() < this.configManager.getInt("friendBlacksLimit") && blacks.size() + list.size() <= this.configManager.getInt("friendBlacksLimit")) {
            int otherId = (Integer)list.get(0);
            if (this.checkIdentity(4, otherId)) {
               return this.player.failure(6000);
            } else {
               this.updateData(5, otherId);
               this.sendMsgOperate(5, 1, list);
               this.removeFronOther(otherId);
               return true;
            }
         } else {
            return this.player.failure(6011);
         }
      }
   }

   private void removeFronOther(int otherId) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer otherPlayer = worldMgr.getPlayerById(otherId);
      if (Objects.nonNull(otherPlayer)) {
         otherPlayer.pushTask(() -> {
            FriendPart otherPart = (FriendPart)otherPlayer.getMgrPart(FriendPart.class);
            if (otherPart.checkIdentity(1, this.player.getPlayerId())) {
               otherPart.updateData(4, this.player.getPlayerId());
            }
         });
      }

   }

   public boolean operateRemove(List<Integer> list) {
      for(int playerId : list) {
         if (!this.checkIdentity(4, playerId)) {
            return this.player.failure(6);
         }
      }

      this.updateData(6, list);
      this.sendMsgOperate(6, 1, list);
      return true;
   }

   public boolean operateGiveQuick() {
      List<Integer> list = this.getFriendValueList();
      this.operateGive(list, false);
      return true;
   }

   public boolean operateGive(List<Integer> list, boolean isFeedback) {
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      if (friendDao == null) {
         return false;
      } else {
         int giveTimes = friendDao.getGiveTimes();
         if (giveTimes >= this.configManager.getInt("friendGiveLimit")) {
            return this.player.failure(6008);
         } else if (0 == list.size()) {
            return this.player.failure(6007);
         } else {
            int tempTimes = giveTimes;
            List<Integer> results = new ArrayList();

            for(int playerId : list) {
               if (this.checkIdentity(1, playerId)) {
                  int times = this.getGiveFriendshipTimes(playerId);
                  if (times <= 0) {
                     results.add(playerId);
                     int count = (Integer)friendDao.giveCounts.getOrDefault(playerId, 0);
                     friendDao.giveCounts.put(playerId, count + 1);
                     ++tempTimes;
                     if (tempTimes >= this.configManager.getInt("friendGiveLimit")) {
                        break;
                     }
                  }
               }
            }

            if (results.size() < 1) {
               return this.player.failure(6007);
            } else {
               this.player.addResource(1, PlayerDefine.PLAYER_COPPER, results.size() * this.configManager.getInt("friendGiveOfCoin"), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 6, 601, 0, 0, "");
               friendDao.setGiveTimes(giveTimes + results.size());
               this.updateData(7, results);
               this.sendMsgOperate(isFeedback ? 9 : 7, 1, results);
               this.notifyResult(11, 2, results, this.player.getPlayerId());
               this.player.triggerTask(102, 0, (long)results.size(), 1);
               this.player.triggerTask(205, 0, (long)results.size(), 1);
               GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
               guanJiaPart.checkState(1020, (List)null);
               return true;
            }
         }
      }
   }

   public boolean operateJoin(List<Integer> list) {
      if (0 == list.size()) {
         return this.player.failure(6);
      } else {
         for(int playerId : list) {
            if (!this.checkIdentity(1, playerId)) {
               return this.player.failure(6006);
            }

            if (this.checkIdentity(5, playerId)) {
               return false;
            }
         }

         this.updateData(10, list);
         this.sendMsgOperate(10, 1, list);
         return true;
      }
   }

   public boolean operateReceive(List<Integer> list) {
      if (0 == list.size()) {
         return this.player.failure(6007);
      } else {
         for(int playerId : list) {
            int times = this.getGainFriendshipTimes(playerId);
            if (times < 1) {
               return this.player.failure(6);
            }
         }

         this.player.addResource(1, PlayerDefine.PLAYER_FRIEND, list.size() * this.configManager.getInt("friendFriendshipGive"), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 6, 602, 0, 0, "");
         this.updateData(8, list);
         this.sendMsgOperate(8, 1, list);
         return true;
      }
   }

   private Set<Integer> getListByType(int typeData) {
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      Set<Integer> list = friendDao.getDatas(typeData);
      if (list == null) {
         list = new HashSet();
      }

      return list;
   }

   public boolean checkIdentity(int typeData, int playerId) {
      Set<Integer> list = this.getListByType(typeData);
      return list.contains(playerId);
   }

   private void notifyResult(int typeOperate, int relation, List<Integer> list, int inviteId) {
      this.notifyResult(typeOperate, relation, list, inviteId, "");
   }

   private void notifyResult(int typeOperate, int relation, List<Integer> list, int inviteId, String playerName) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);

      for(int otherId : list) {
         GamePlayer otherPlayer = worldMgr.getPlayerById(otherId);
         if (Objects.nonNull(otherPlayer)) {
            otherPlayer.pushTask(() -> {
               FriendPart part = (FriendPart)otherPlayer.getMgrPart(FriendPart.class);
               if (typeOperate != 1 || !part.checkIdentity(4, inviteId)) {
                  if (typeOperate != 2 || !part.checkIdentity(4, inviteId)) {
                     if (typeOperate != 5 || !part.checkIdentity(4, inviteId)) {
                        part.updateData(typeOperate, inviteId);
                        if (typeOperate == 2) {
                           otherPlayer.triggerTask(343, 0, 1L, 1);
                        }

                        if (otherPlayer.isLogin()) {
                           part.sendMsgOperate(typeOperate, relation, inviteId, playerName);
                        }

                     }
                  }
               }
            });
         }
      }

   }

   private void sendMsgOperate(int typeOperate, int relation, int playerId, String playerName) {
      List<Integer> list = new ArrayList();
      list.add(playerId);
      this.sendMsgOperate(typeOperate, relation, list);
   }

   private void sendMsgOperate(int typeOperate, int relation, List<Integer> list) {
      this.sendMsgOperate(typeOperate, relation, list, "");
   }

   private void sendMsgOperate(int typeOperate, int relation, List<Integer> list, String playerName) {
      FriendMsg.S2C_FriendOperate_6304.Builder builder = FriendMsg.S2C_FriendOperate_6304.newBuilder();
      builder.setRelation(relation);
      builder.setTypeOperate(typeOperate);
      builder.addAllPlayerId(list);
      builder.setPlayerName(playerName);
      this.player.sendMsg(builder.build());
   }

   private void updateData(int typeOperate, List<Integer> list) {
      for(int playerId : list) {
         this.updateData(typeOperate, playerId);
      }

   }

   private void updateData(int typeOperate, int playerId) {
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      switch (typeOperate) {
         case 1:
            friendDao.addValue(3, playerId);
            break;
         case 2:
            friendDao.addValue(1, playerId);
            friendDao.removeValue(3, playerId);
            ++friendDao.addFriendNum;
            this.checkFriendPrestige();
            break;
         case 3:
            friendDao.removeValue(3, playerId);
            break;
         case 4:
            friendDao.removeValue(1, playerId);
            friendDao.removeValue(5, playerId);
            PlayerChatPart playerChatPart = (PlayerChatPart)this.player.getMgrPart(PlayerChatPart.class);
            playerChatPart.removeFriendRecord(playerId);
            break;
         case 5:
            friendDao.removeValue(1, playerId);
            friendDao.removeValue(5, playerId);
            friendDao.addValue(4, playerId);
            break;
         case 6:
            friendDao.removeValue(4, playerId);
            break;
         case 7:
            friendDao.setGiveFriendship(playerId);
            break;
         case 8:
            friendDao.setGainFriendship(playerId);
         case 9:
         default:
            break;
         case 10:
            friendDao.addValue(5, playerId);
            break;
         case 11:
            friendDao.obtainFriendship(playerId);
      }

      friendDao.updateOp();
   }

   public int getGiveFriendshipTimes(int playerId) {
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      return friendDao.getGiveFriendship(playerId);
   }

   public int getGainFriendshipTimes(int playerId) {
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      return friendDao.getGainFriendship(playerId);
   }

   private void handleSearch(String name) {
      List<Integer> playerIdList = new ArrayList();
      GameDBPool dbPool = (GameDBPool)ApplicationContextProvider.getContext().getBean(GameDBPool.class);
      String sql = "SELECT playerId, playerName FROM tb_player WHERE (`type` = 0 OR `type` = 998) AND playerName LIKE ? LIMIT 10 ";

      try {
         dbPool.query(sql, (resultSet) -> {
            try {
               while(resultSet.next()) {
                  playerIdList.add(resultSet.getInt("playerId"));
               }
            } catch (Exception e) {
               e.printStackTrace();
            }

         }, new Object[]{"%" + name + "%"});
      } catch (Throwable t) {
         t.printStackTrace();
      }

      List<GamePlayer> list = new ArrayList();
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);

      for(int otherId : playerIdList) {
         GamePlayer otherPlayer = worldMgr.getPlayerById(otherId);
         if (Objects.nonNull(otherPlayer)) {
            list.add(otherPlayer);
         }
      }

      this.notifySearch(1, list);
   }

   private void handleRecommend() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      List<GamePlayer> recommendPlayers = new ArrayList();

      for(GamePlayer otherPlayer : worldMgr.getOnlinePlayer()) {
         int otherId = otherPlayer.getPlayerId();
         if (this.chechRecommendCondition(otherPlayer) && otherId != this.player.getPlayerId() && !this.checkIdentity(1, otherId)) {
            recommendPlayers.add(otherPlayer);
         }
      }

      if (recommendPlayers.size() >= 5) {
         Collections.shuffle(recommendPlayers);
         recommendPlayers = recommendPlayers.subList(0, 5);
      } else {
         List<GamePlayer> offlinePlayers = new ArrayList();
         FriendPart friendPart = (FriendPart)this.player.getMgrPart(FriendPart.class);
         ConcurrentHashMap<Integer, GamePlayer> playerMap = worldMgr.getPlayerMap();
         long tempTime = System.currentTimeMillis() - 86400000L;

         for(Map.Entry<Integer, GamePlayer> entry : playerMap.entrySet()) {
            GamePlayer tempPlayer = (GamePlayer)entry.getValue();
            PlayerPublicDao playerPublicDao = tempPlayer.getPublicDao();
            int tempPlayerId = tempPlayer.getPlayerId();
            if (this.chechRecommendCondition(tempPlayer) && playerPublicDao.logoutTime > tempTime && !recommendPlayers.contains(tempPlayerId) && !friendPart.checkIdentity(1, tempPlayerId)) {
               offlinePlayers.add(tempPlayer);
            }
         }

         Collections.shuffle(offlinePlayers);

         for(GamePlayer player : offlinePlayers) {
            recommendPlayers.add(player);
            if (recommendPlayers.size() >= 5) {
               break;
            }
         }
      }

      this.notifySearch(2, recommendPlayers);
   }

   private boolean chechRecommendCondition(GamePlayer gamePlayer) {
      if (gamePlayer == null) {
         return false;
      } else {
         PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
         SystemFunctionModel model = (SystemFunctionModel)ApplicationContextProvider.getModelPool().getEntity("systemFunction", 1020);
         if (model != null && playerPublicDao.lv <= model.getOpenLevel()) {
            return false;
         } else {
            return playerPublicDao.playerName != "";
         }
      }
   }

   private void notifySearch(int type, List<GamePlayer> list) {
      FriendMsg.S2C_FriendSearch_6306.Builder builder = FriendMsg.S2C_FriendSearch_6306.newBuilder();
      int result = list.size() > 0 ? 1 : 0;
      builder.setResult(result);
      builder.setType(type);
      if (list.size() > 0) {
         for(GamePlayer gamePlayer : list) {
            FriendMsg.Friend_Info.Builder infoBuilder = FriendMsg.Friend_Info.newBuilder();
            PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
            infoBuilder.setPlayerId(gamePlayer.getPlayerId());
            infoBuilder.setPlayerName(playerPublicDao.playerName);
            infoBuilder.setSex(playerPublicDao.sex);
            infoBuilder.setLv(playerPublicDao.lv);
            infoBuilder.setVipLv(playerPublicDao.vip_lv);
            infoBuilder.setShowVip(playerPublicDao.isShowVip);
            infoBuilder.setFight(gamePlayer.getPlayerCombatPower());
            infoBuilder.setHead(playerPublicDao.head);
            infoBuilder.setHeadFrame(playerPublicDao.headFrame);
            infoBuilder.setServerId(playerPublicDao.serverId);
            infoBuilder.setQqWanKaLv(playerPublicDao.qqWanKaLv);
            infoBuilder.setQqLogo(playerPublicDao.qqLogo);
            if (gamePlayer.isLogin()) {
               infoBuilder.setOffline(0);
            } else {
               infoBuilder.setOffline((int)(playerPublicDao.logoutTime / 1000L));
            }

            builder.addFriendInfos(infoBuilder);
         }
      }

      this.player.sendMsg(builder.build());
   }

   public void notifyFriendOnline() {
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      Set<Integer> list = friendDao.getDatas(1);
      if (list != null) {
         PlayerPublicDao playerPublicDao = this.player.getPublicDao();
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         FriendMsg.S2C_FriendOnline_6310 builder = FriendMsg.S2C_FriendOnline_6310.newBuilder().setPlayerName(playerPublicDao.playerName).build();

         for(int otherId : list) {
            GamePlayer otherPlayer = worldMgr.getPlayerById(otherId);
            if (Objects.nonNull(otherPlayer) && otherPlayer.isLogin()) {
               otherPlayer.sendMsg(builder);
            }
         }

      }
   }

   public void removeChat(int otherId) {
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      if (friendDao != null) {
         friendDao.removeValue(5, otherId);
         friendDao.updateOp();
      }

   }

   public int checkFriendFull(int otherId) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer otherPlayer = worldMgr.getPlayerById(otherId);
      if (otherPlayer == null) {
         return 0;
      } else {
         FriendPart otherPart = (FriendPart)otherPlayer.getMgrPart(FriendPart.class);
         Set<Integer> friends = otherPart.getListByType(1);
         if (friends.size() >= this.configManager.getInt("friendFriendsLimit")) {
            return 58104;
         } else {
            int num = otherPart.getAddFriendNumForDay();
            return num <= 0 ? '\ueefd' : 1;
         }
      }
   }

   public void unlockReportByLevel(int level) {
      ReportDao reportDao = (ReportDao)this.player.getDataNoInsert("tb_report", this.player.getPlayerId());
      if (reportDao != null) {
         if (reportDao.hp <= (double)0.0F) {
            int offset = level > 30 ? 2 : 5;
            if (level - reportDao.lv >= offset) {
               reportDao.lv = level;
               reportDao.hp = this.getReportBlood();
               reportDao.reportIdSet.clear();
               reportDao.updateOp();
               this.sendReportInfo(reportDao);
            }
         } else if (reportDao.reportIdSet.size() == 0) {
            reportDao.hp = this.getReportBlood();
            reportDao.updateOp();
         }

      }
   }

   public void unlockReportByTower(int towerId) {
      ReportDao reportDao = (ReportDao)this.player.getDataNoInsert("tb_report", this.player.getPlayerId());
      if (reportDao != null) {
         if (reportDao.hp <= (double)0.0F) {
            PlayerDao playerDao = this.player.getPlayerDao();
            int offset = playerDao.lv >= 100 ? 2 : 10;
            if (towerId - reportDao.towerLayer >= offset) {
               reportDao.towerLayer = towerId;
               reportDao.hp = this.getReportBlood();
               reportDao.reportIdSet.clear();
               reportDao.updateOp();
               this.sendReportInfo(reportDao);
            }
         }

      }
   }

   public void sendReportInfo(ReportDao reportDao) {
      FriendMsg.S2C_ReportInfo_6314.Builder builder = FriendMsg.S2C_ReportInfo_6314.newBuilder();
      builder.setHp((int)reportDao.hp);
      builder.setCount(reportDao.count);
      builder.setReportTime(reportDao.reportTime);
      this.player.sendMsg(builder.build());
   }

   public void levelUp(int preLv, int newLv) {
      this.unlockReportByLevel(newLv);
   }

   public int getAddFriendNumForDay() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      this.checkUpdateTime();
      int lv = this.player.getPlayerDao().lv;
      TreeMap<Integer, Integer> treeMap = this.configManager.getIntTreeMap("addfirends");
      if (!this.configManager.getStr("addfirends_" + worldMgr.country).equals("")) {
         treeMap = this.configManager.getIntTreeMap("addfirends_" + worldMgr.country);
      }

      int num = (Integer)treeMap.firstEntry().getValue();

      for(Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
         if ((Integer)entry.getKey() > lv) {
            break;
         }

         num = (Integer)entry.getValue();
      }

      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      int addNum = num - friendDao.addFriendNum;
      return addNum;
   }

   public void checkUpdateTime() {
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      if (!DateUtil.isSameDay((long)friendDao.updateTime * 1000L)) {
         friendDao.updateTime = DateUtil.getIntTime(System.currentTimeMillis());
         friendDao.addFriendNum = 0;
         friendDao.updateOp();
      }

   }

   private List<Integer> getFriendValueList() {
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      Set<Integer> onlineIdSet = new LinkedHashSet();
      Map<Integer, Long> playerIdMap = new LinkedHashMap();
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);

      for(Integer friendId : friendDao.friends) {
         GamePlayer friendPlayer = worldMgr.getPlayerById(friendId);
         if (friendPlayer != null) {
            if (friendPlayer.isLogin()) {
               onlineIdSet.add(friendId);
            } else {
               PlayerPublicDao playerPublicDao = friendPlayer.getPublicDao();
               playerIdMap.put(friendId, playerPublicDao.logoutTime);
            }
         }
      }

      LinkedHashMap<Integer, Long> sortedMap = CollectionUtil.sortToMap(playerIdMap.entrySet(), (o1, o2) -> ((Long)o2.getValue()).compareTo((Long)o1.getValue()));
      List<Integer> list = new ArrayList();
      list.addAll(onlineIdSet);
      list.addAll(sortedMap.keySet());
      return list;
   }

   public void guanJiaOperate(int systemId) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      List<Integer> list = this.getFriendValueList();
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      int giveTimes = friendDao.getGiveTimes();
      if (giveTimes >= this.configManager.getInt("friendGiveLimit")) {
         guanJiaPart.checkState(systemId, (List)null);
      } else if (0 == list.size()) {
         guanJiaPart.checkState(systemId, (List)null);
      } else {
         int tempTimes = giveTimes;
         List<Integer> results = new ArrayList();

         for(int playerId : list) {
            if (this.checkIdentity(1, playerId)) {
               int times = this.getGiveFriendshipTimes(playerId);
               if (times <= 0) {
                  results.add(playerId);
                  int count = (Integer)friendDao.giveCounts.getOrDefault(playerId, 0);
                  friendDao.giveCounts.put(playerId, count + 1);
                  ++tempTimes;
                  if (tempTimes >= this.configManager.getInt("friendGiveLimit")) {
                     break;
                  }
               }
            }
         }

         if (results.size() < 1) {
            guanJiaPart.checkState(systemId, (List)null);
         } else {
            ResourceModel reward = new ResourceModel(1, PlayerDefine.PLAYER_COPPER, results.size() * this.configManager.getInt("friendGiveOfCoin"));
            this.player.addResource(reward, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 6, 601, 0, 0, "");
            friendDao.setGiveTimes(giveTimes + results.size());
            this.updateData(7, results);
            this.sendMsgOperate(7, 1, results);
            this.notifyResult(11, 2, results, this.player.getPlayerId());
            this.player.triggerTask(102, 0, (long)results.size(), 1);
            this.player.triggerTask(205, 0, (long)results.size(), 1);
            List<ResourceModel> rewardList = new ArrayList();
            rewardList.add(reward);
            guanJiaPart.checkState(1020, rewardList);
         }
      }
   }

   private void reqCrossPKList(long matchPowerMin, long matchPowerMax, String playerName) {
      if (StringUtils.isEmpty(playerName)) {
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int nextFlushTime = (Integer)playerResetCustomCache.getForeverNum(34, 0);
         if (nextFlushTime > curTime) {
            this.player.failure(76039);
            return;
         }

         int reqRes = this.sendCrossPKListReq(matchPowerMin, matchPowerMax, (String)null);
         if (reqRes != 1) {
            this.player.failure(reqRes);
            return;
         }

         nextFlushTime = curTime + ApplicationContextProvider.getConfigInt("CSD_CD2", 10);
         playerResetCustomCache.setForever(34, nextFlushTime);
         this.player.notifyPlayerData(PlayerDefine.CROSS_PK_FLUSH_CD, nextFlushTime);
      } else {
         int reqRes = this.sendCrossPKListReq(0L, 0L, playerName);
         if (reqRes != 1) {
            this.player.failure(reqRes);
         }
      }

   }

   public int sendCrossPKListReq(long matchPowerMin, long matchPowerMax, String playerName) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      if (worldMgr.getOpenServerDays() < ApplicationContextProvider.getConfigInt("CSD_OpenDay", 1)) {
         return 54;
      } else if (!this.crossNettyClient.isLogin()) {
         return 76022;
      } else {
         long finalPowerMin = Math.min(matchPowerMin, matchPowerMax);
         long finalPowerMax = Math.max(matchPowerMin, matchPowerMax);
         long myPower = this.player.getPlayerCombatPower();
         if (StringUtils.isEmpty(playerName)) {
            if (matchPowerMin < 0L || matchPowerMax < 0L) {
               return 6;
            }

            if (matchPowerMin == 0L && matchPowerMax > 0L || matchPowerMin > 0L && matchPowerMax == 0L) {
               return 61228;
            }

            if (finalPowerMin > 0L) {
               int unit = ApplicationContextProvider.getConfigInt("CROSS_PK_POWER_UNIT", 10000000);
               if (finalPowerMin % (long)unit != 0L) {
                  long tempPower = BigDecimal.valueOf(finalPowerMin).divide(BigDecimal.valueOf((long)unit), 0).longValue() * (long)unit;
                  finalPowerMin = tempPower;
               }

               if (finalPowerMax % (long)unit != 0L) {
                  long tempPower = BigDecimal.valueOf(finalPowerMax).divide(BigDecimal.valueOf((long)unit), 0).longValue() * (long)unit;
                  finalPowerMax = tempPower;
               }

               int minPowerPercent = ApplicationContextProvider.getConfigInt("CROSS_PK_POWER_MIN_PER", 50);
               long tempPower = BigDecimal.valueOf(myPower * (long)minPowerPercent / 100L).divide(BigDecimal.valueOf((long)unit), 0).longValue() * (long)unit;
               if (finalPowerMin < tempPower) {
                  finalPowerMin = tempPower;
               }

               int minPower = ApplicationContextProvider.getConfigInt("CROSS_PK_POWER_MIN", unit);
               if (finalPowerMin < (long)minPower) {
                  finalPowerMin = (long)minPower;
               }

               if (finalPowerMin > finalPowerMax) {
                  finalPowerMax = finalPowerMin;
               }

               int maxPowerPercent = ApplicationContextProvider.getConfigInt("CROSS_PK_POWER_MAX_PER", 200);
               tempPower = BigDecimal.valueOf(myPower * (long)maxPowerPercent / 100L).divide(BigDecimal.valueOf((long)unit), 0).longValue() * (long)unit;
               if (finalPowerMax > tempPower) {
                  finalPowerMax = tempPower;
               }

               int maxPower = ApplicationContextProvider.getConfigInt("CROSS_PK_POWER_MAX", 40 * unit);
               if (finalPowerMax > (long)maxPower) {
                  finalPowerMax = (long)maxPower;
               }

               if (finalPowerMin == finalPowerMax) {
                  int rate = ApplicationContextProvider.getConfigInt("CROSS_PK_POWER_EQ_RATE", 10);
                  finalPowerMin = finalPowerMin * (long)(100 - rate) / 100L;
                  finalPowerMax = finalPowerMax * (long)(100 + rate) / 100L;
               }
            }
         }

         CrossMsg.S2CR_CrossPKList_4220.Builder builder = CrossMsg.S2CR_CrossPKList_4220.newBuilder();
         builder.setPower(myPower);
         builder.setMatchPowerMin(finalPowerMin);
         builder.setMatchPowerMax(finalPowerMax);
         if (!StringUtils.isEmpty(playerName)) {
            builder.setPlayerName(playerName);
         }

         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         return 1;
      }
   }
}
