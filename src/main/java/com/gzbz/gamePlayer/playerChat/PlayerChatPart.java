package com.gzbz.gamePlayer.playerChat;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.chat.ChatMgr;
import com.gzbz.chatServer.ChatServerClient;
import com.gzbz.db.ChatDao;
import com.gzbz.db.FriendDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.PlayerUnionDailyGuessDao;
import com.gzbz.db.ReportDao;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.ChatData;
import com.gzbz.db.worldBean.PrestigeData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.CodeDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.friend.FriendPart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.monarch.MonarchPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.gamePlayer.tongque.TongqueTerracePart;
import com.gzbz.http.vo.ChatLimitData;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.medal.MedalPart;
import com.gzbz.model.ScriptTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BagMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.ChatMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossChatMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.TongqueTerraceMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ChatBubblePart;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.union.part.UnionDailyGuessPart;
import com.gzbz.util.WordsFilter;
import com.gzbz.worldMgr.WorldMgr;
import debug.Debug;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;
import misc.DateUtil;
import misc.MD5Util;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class PlayerChatPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(PlayerChatPart.class);
   @Autowired
   ConfigurableApplicationContext context;
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private HeroRankMgr heroRankMgr;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   ConfigManager configManager;
   @Autowired
   private ChatServerClient chatServerClient;
   private int lastChatTime = 0;
   private int tooFastTimes = 0;
   private TreeMap<String, Integer> _lastMessage = new TreeMap();

   @MsgHandlerAnno
   public boolean msgChat(ChatMsg.C2S_Chat_6003 msg, String source) {
      int channel = msg.getChannel();
      String content = msg.getContent();
      String finalContent = content;
      int subclass = msg.getSubclass();
      int receiveId = msg.getDestPlayerId();
      int code = msg.getCode();
      String shareTips = "";
      if (msg.hasShareTips()) {
         shareTips = msg.getShareTips();
      }

      this.logger.debug("聊天系统：" + content);
      if (!this.channelLimit(channel)) {
         this.logger.info("聊天频道不可发言 playerId:{}, channel:{}", this.player.getPlayerId(), channel);
         return false;
      } else {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (playerDao.forbidChatTime > System.currentTimeMillis()) {
            this.player.failure(48);
            return false;
         } else {
            ReportDao reportDao = (ReportDao)this.player.getData("tb_report", this.player.getPlayerId());
            if (reportDao.hp <= (double)0.0F) {
               return this.player.failure(58107);
            } else if ((subclass == 6 || subclass == 8) && channel == 4) {
               this.logger.info("不能在系统频道分享武将, channel = {}", channel);
               return false;
            } else if (content.length() == 0) {
               return this.player.failure(12);
            } else if (receiveId == this.player.getPlayerId()) {
               return this.player.failure(11);
            } else if (!this.checkLimit(channel, subclass, content)) {
               return false;
            } else {
               PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
               ChatBubblePart chatBubblePart = (ChatBubblePart)this.player.getMgrPart(ChatBubblePart.class);
               if (chatBubblePart.checkBubbleInvalid(playerExtend.bubble)) {
                  chatBubblePart.settingBubble(0);
               }

               MedalPart medalPart = (MedalPart)this.player.getMgrPart(MedalPart.class);
               Set<Integer> medals = medalPart.getMedals();
               MonarchPart monarchPart = (MonarchPart)this.player.getMgrPart(MonarchPart.class);
               List<CommonMsg.MapDataIS> customPrestiges = monarchPart.getCustomPrestiges();
               boolean isGmCmd = false;
               if (Debug.isDebug || this.worldMgr.PLATFORM_NAME.equals("dev") && playerDao.type == 999) {
                  isGmCmd = content.startsWith("gm ");
               }

               if (isGmCmd || playerExtend.silent <= System.currentTimeMillis() && !this.isSilentEffect(content)) {
                  boolean needCheckBadWords = !this.isShare(subclass);
                  if (!Debug.isDebug && needCheckBadWords) {
                     if (!isGmCmd && !this.checkMsgRepeat(content)) {
                        this.logger.info("聊天内容是否重复 playerId:{}, content:{}", this.player.getPlayerId(), content);
                        return false;
                     }

                     int chatContentLengthLimit = this.configManager.getIntDefault("chatContentLengthLimit", 256);
                     if (content.length() > chatContentLengthLimit) {
                        return this.player.failure(7000);
                     }

                     boolean showBadWordTip = this.getShowBadWordTip();
                     StringBuilder badWordBuilder = WordsFilter.getBadWords(content, showBadWordTip);
                     boolean hadBadWords = badWordBuilder.length() > 0;
                     if (hadBadWords && !showBadWordTip) {
                        String badWordString = badWordBuilder.toString();
                        String[] badWardArr = badWordString.split(",");

                        for(String word : badWardArr) {
                           if (!"|".equals(word)) {
                              String r = "";

                              for(int i = 0; i < word.length(); ++i) {
                                 r = r + "*";
                              }

                              content = content.replaceAll(word, r);
                           }
                        }
                     }

                     if (!isGmCmd && hadBadWords && showBadWordTip) {
                        return this.player.failure(40);
                     }
                  }

                  int newTime = DateUtil.getIntTime(System.currentTimeMillis());
                  if (newTime - this.lastChatTime < 10) {
                     ++this.tooFastTimes;
                     if (this.tooFastTimes >= 5) {
                        return this.player.failure(14);
                     }
                  } else {
                     this.lastChatTime = newTime;
                     this.tooFastTimes = 1;
                  }

                  ChatMgr chatMgr = (ChatMgr)this.context.getBean(ChatMgr.class);
                  if (isGmCmd) {
                     if (channel != 2) {
                        return this.player.failure(40);
                     } else {
                        chatMgr.handleGMCommand(this.player, content);
                        this.handlePersonalSender(channel, this.player.getPlayerId(), content, subclass, (CommonMsg.HeroInfo)null, (BagMsg.Item_Info)null, shareTips, playerExtend.bubble, medals, customPrestiges);
                        return true;
                     }
                  } else {
                     if (channel == 1) {
                        WorldMgr worldMgr = (WorldMgr)this.context.getBean(WorldMgr.class);
                        GamePlayer targetPlayer = worldMgr.getPlayerById(receiveId);
                        if (Objects.isNull(targetPlayer)) {
                           return this.player.failure(17);
                        }

                        this.handlePersonalSender(channel, receiveId, content, subclass, (CommonMsg.HeroInfo)null, (BagMsg.Item_Info)null, shareTips, playerExtend.bubble, medals, customPrestiges);
                        long openServerTime = (long)DateUtil.getIntTime(worldMgr.getOpenServerTime());
                        int privatechatbantime = ApplicationContextProvider.getConfigInt("privatechatbantime", 259200);
                        boolean isFirstDayLimit = DateUtil.isSameDay(playerDao.birthTime);
                        if (!ApplicationContextProvider.getConfigString("privatechatbantime_" + worldMgr.country, "").equals("")) {
                           isFirstDayLimit = false;
                           privatechatbantime = ApplicationContextProvider.getConfigInt("privatechatbantime_" + worldMgr.country, 259200);
                        }

                        int platformbantime = 0;
                        String privatechatbantimechannel = ApplicationContextProvider.getConfigString("privatechatbantimechannel", "");
                        if (!privatechatbantimechannel.isEmpty()) {
                           String[] banchannels = privatechatbantimechannel.split(",");

                           for(String banchannel : banchannels) {
                              String[] baninfo = banchannel.split("\\|");
                              if (baninfo.length == 2) {
                                 String platformName = baninfo[0];
                                 int banTime = Integer.parseInt(baninfo[1]);
                                 if (worldMgr.PLATFORM_NAME.equals(platformName)) {
                                    platformbantime = banTime;
                                    break;
                                 }
                              }
                           }
                        }

                        int curTime = DateUtil.getIntTime(System.currentTimeMillis());
                        if (isFirstDayLimit) {
                           this.handlePersonalReceiver(channel, 2, receiveId, this.player.getPlayerId(), content, subclass, playerExtend.bubble, medals, customPrestiges);
                        } else if (platformbantime > 0) {
                           if (openServerTime + (long)platformbantime < (long)curTime) {
                              this.handlePersonalReceiver(channel, 2, receiveId, this.player.getPlayerId(), content, subclass, playerExtend.bubble, medals, customPrestiges);
                           }
                        } else if (openServerTime + (long)privatechatbantime < (long)curTime) {
                           this.handlePersonalReceiver(channel, 2, receiveId, this.player.getPlayerId(), content, subclass, playerExtend.bubble, medals, customPrestiges);
                        }
                     } else {
                        if (subclass == 6 && code > 0) {
                           HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                           HeroDao heroDao = heroBagPart.getHeroByCode(code);
                           if (heroDao != null) {
                              CommonMsg.HeroInfo.Builder heroInfo = heroDao.toHeroInfo();
                              this.handlePersonalSender(channel, this.player.getPlayerId(), content, subclass, heroInfo.build(), (BagMsg.Item_Info)null, shareTips, playerExtend.bubble, medals, customPrestiges);
                              ChatData chatData = new ChatData(this.player.getServerId(), this.player.getPlayerId(), channel, content, subclass, heroInfo.build(), receiveId, (BagMsg.Item_Info)null, shareTips, playerExtend.bubble, medals, customPrestiges);
                              chatMgr.pushTask(() -> chatMgr.handleMsg(chatData));
                           }
                        } else if (subclass == 8 && code > 0) {
                           ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                           ItemBase itemBase = itemBagPart.getItemByCode(code);
                           if (itemBase != null) {
                              BagMsg.Item_Info.Builder itemInfoMsg = itemBase.toItemInfoBuilder();
                              this.handlePersonalSender(channel, this.player.getPlayerId(), content, subclass, (CommonMsg.HeroInfo)null, itemInfoMsg.build(), shareTips, playerExtend.bubble, medals, customPrestiges);
                              ChatData chatData = new ChatData(this.player.getServerId(), this.player.getPlayerId(), channel, content, subclass, (CommonMsg.HeroInfo)null, receiveId, itemInfoMsg.build(), shareTips, playerExtend.bubble, medals, customPrestiges);
                              chatMgr.pushTask(() -> chatMgr.handleMsg(chatData));
                           }
                        } else {
                           this.handlePersonalSender(channel, this.player.getPlayerId(), content, subclass, (CommonMsg.HeroInfo)null, (BagMsg.Item_Info)null, shareTips, playerExtend.bubble, medals, customPrestiges);
                           ChatData chatData = new ChatData(this.player.getServerId(), this.player.getPlayerId(), channel, content, subclass, (CommonMsg.HeroInfo)null, receiveId, (BagMsg.Item_Info)null, shareTips, playerExtend.bubble, medals, customPrestiges);
                           chatMgr.pushTask(() -> chatMgr.handleMsg(chatData));
                        }

                        if (channel == 2) {
                           Map<Integer, ScriptTaskModel> scriptTaskModelMap = ApplicationContextProvider.<Integer, ScriptTaskModel>getModelPoolMap("scripttask");

                           for(ScriptTaskModel scriptTaskModel : scriptTaskModelMap.values()) {
                              if (content.trim().equals(scriptTaskModel.getScript())) {
                                 this.player.triggerTask(608, scriptTaskModel.getId(), 1L, 1);
                              }
                           }
                        }

                        this.player.triggerTask(634, channel, 1L, 1);
                        this.player.triggerTask(634, 0, 1L, 1);
                     }

                     LogOperationMgr operationMgr = this.player.getOperationMgr();
                     operationMgr.pushTask(() -> operationMgr.addChatNewLog(this.player, channel, finalContent, receiveId));
                     playerExtend.chatRecord.put((byte)channel, DateUtil.getIntTime(System.currentTimeMillis()));
                     this.player.updatePlayerExtend(13);
                     PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
                     if (subclass == 6 || subclass == 8 || subclass == 10) {
                        playerResetCustomCache.addDailyReset(525, 1);
                     }

                     if (channel == 3 && subclass == 10) {
                        UnionDailyGuessPart unionDailyGuessPart = (UnionDailyGuessPart)this.player.getMgrPart(UnionDailyGuessPart.class);
                        PlayerUnionDailyGuessDao playerUnionDailyGuessDao = unionDailyGuessPart.getPlayerUnionDailyGuessDao(false);
                        if (null != playerUnionDailyGuessDao && playerUnionDailyGuessDao.shareState != 1) {
                           List<ResourceModel> resourceModelList = ResourceModel.buildResources(ApplicationContextProvider.getConfigString("unionGateShareReward", ""));
                           this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 76, 937, 0, 0, "");
                           playerUnionDailyGuessDao.shareState = 1;
                           playerUnionDailyGuessDao.updateOp();
                        }
                     }

                     if (subclass == 7) {
                        int battleShareStartTime = (Integer)playerResetCustomCache.getDailyNum(537, 0);
                        int battleShareCount = (Integer)playerResetCustomCache.getDailyNum(538, 0);
                        int BATTLE_SHARE_RANGE = this.configManager.getIntDefault("battleShareRange", 120);
                        int BATTLE_SHARE_COUNT_LIMIT = this.configManager.getIntDefault("battleShareCountLimit", 5);
                        int curTime = DateUtil.getIntTime(System.currentTimeMillis());
                        if (curTime >= battleShareStartTime + BATTLE_SHARE_RANGE) {
                           playerResetCustomCache.setDailyReset(537, curTime);
                           playerResetCustomCache.setDailyReset(538, 1);
                           playerResetCustomCache.setDailyReset(539, 0);
                        } else {
                           if (battleShareCount + 1 >= BATTLE_SHARE_COUNT_LIMIT) {
                              playerResetCustomCache.setDailyReset(539, curTime);
                           }

                           playerResetCustomCache.addDailyReset(538, 1);
                        }
                     }

                     if (channel == 5 && subclass == 9) {
                        int itemId = Integer.parseInt(this.configManager.parseValue("CompeteReam", 0, ","));
                        int itemNum = Integer.parseInt(this.configManager.parseValue("CompeteReam", 1, ","));
                        this.player.delResource(2, itemId, (long)itemNum, 7, 711, 0, 0, "" + DateUtil.getIntTime(System.currentTimeMillis()));
                        playerResetCustomCache.addDailyReset(524, 1);
                     }

                     return true;
                  }
               } else {
                  if (channel == 1) {
                     this.handlePersonalSender(channel, receiveId, content, subclass, (CommonMsg.HeroInfo)null, (BagMsg.Item_Info)null, shareTips, playerExtend.bubble, medals, customPrestiges);
                  } else {
                     this.handlePersonalSender(channel, this.player.getPlayerId(), content, subclass, (CommonMsg.HeroInfo)null, (BagMsg.Item_Info)null, shareTips, playerExtend.bubble, medals, customPrestiges);
                  }

                  return false;
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void msgDelRecord(ChatMsg.C2S_DelRecord_6005 msg, String source) {
      int playerId = msg.getPlayerId();
      this.removeFriendRecord(playerId);
      FriendPart friendPart = (FriendPart)this.player.getMgrPart(FriendPart.class);
      friendPart.removeChat(playerId);
      ChatMsg.S2C_DelRecord_6006.Builder builder = ChatMsg.S2C_DelRecord_6006.newBuilder();
      builder.setResult(1);
      builder.setPlayerId(playerId);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void msgDetailInfo(ChatMsg.C2S_PlayerDetailInfo_6009 msg, String source) {
      WorldMgr worldMgr = (WorldMgr)this.context.getBean(WorldMgr.class);
      int otherId = msg.getPlayerId();
      CommonMsg.HeroState[] arrayingType = new CommonMsg.HeroState[]{msg.hasArraying() ? msg.getArraying() : CommonMsg.HeroState.HERO_STATE_ARRAYING};
      int serverId;
      if (!msg.hasServerId()) {
         serverId = worldMgr.GAME_SERVER_ID;
      } else {
         serverId = msg.getServerId();
      }

      if (worldMgr.getServersSet().contains(serverId)) {
         GamePlayer otherPlayer = worldMgr.getPlayerById(otherId);
         if (otherPlayer != null) {
            otherPlayer.pushTask(() -> {
               ChatMsg.S2C_PlayerDetailInfo_6010.Builder builder = ChatMsg.S2C_PlayerDetailInfo_6010.newBuilder();
               builder.setArraying(arrayingType[0]);
               HeroArrayingPart heroArrayingPart = (HeroArrayingPart)otherPlayer.getMgrPart(HeroArrayingPart.class);
               HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(arrayingType[0]);
               if (heroArrayingDao == null || heroArrayingDao.elements.isEmpty()) {
                  arrayingType[0] = CommonMsg.HeroState.HERO_STATE_ARRAYING;
               }

               builder.setPlayerInfo(otherPlayer.toPlayerInfo(arrayingType[0]));
               ReportDao reportDao = (ReportDao)otherPlayer.getDataNoInsert("tb_report", otherPlayer.getPlayerId());
               if (reportDao != null) {
                  builder.setReport(reportDao.reportIdSet.contains(this.player.getPlayerId()));
               } else {
                  builder.setReport(false);
               }

               this.player.sendMsg(builder.build());
            });
         }
      } else if (msg.hasCross() && msg.getCross()) {
         CrossChatMsg.S2CR_PlayerDetailInfo_11705.Builder builder = CrossChatMsg.S2CR_PlayerDetailInfo_11705.newBuilder();
         builder.setArraying(msg.getArraying());
         this.crossNettyClient.send2Server(this.player.getServerId(), this.player.getPlayerId(), msg.getServerId(), msg.getPlayerId(), builder.build());
      } else {
         ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
         int playerLv = this.player.getPlayerDao().lv;
         chatMgr.reqCrossPlayerDetailToCross(worldMgr.GAME_SERVER_ID, this.player.getPlayerId(), playerLv, serverId, otherId, arrayingType[0]);
      }

   }

   public void removeFriendRecord(int otherId) {
      List<ChatDao> list = this.player.<ChatDao>getList("tb_chat", this.player.getPlayerId());

      for(int i = list.size(); i > 0; --i) {
         ChatDao chatDao = (ChatDao)list.get(i - 1);
         if (chatDao.relativePlayerId == otherId) {
            this.player.deleteDao(chatDao, false);
         }
      }

   }

   public boolean handlePersonalSender(int channel, int targetId, String content, int subclass, CommonMsg.HeroInfo heroInfoMsg, BagMsg.Item_Info itemInfoMsg, String shareTips, int bubble, Set<Integer> medals, List<CommonMsg.MapDataIS> customPrestiges) {
      WorldMgr worldMgr = (WorldMgr)this.context.getBean(WorldMgr.class);
      GamePlayer targetPlayer = worldMgr.getPlayerById(targetId);
      if (Objects.isNull(targetPlayer)) {
         return this.player.failure(17);
      } else {
         FriendPart friendPart = (FriendPart)this.player.getMgrPart(FriendPart.class);
         if (!friendPart.checkIdentity(4, targetId)) {
            PlayerPublicDao targetPlayerDao = targetPlayer.getPublicDao();
            ChatMsg.S2C_Chat_6004.Builder builder = ChatMsg.S2C_Chat_6004.newBuilder();
            ChatMsg.Chat_Info.Builder chatInfo = ChatMsg.Chat_Info.newBuilder();
            chatInfo.setChatId(-1);
            chatInfo.setChannel(channel);
            chatInfo.setContent(content);
            chatInfo.setPlayerId(targetPlayer.getPlayerId());
            chatInfo.setPlayerName(targetPlayerDao.playerName);
            chatInfo.setSex(targetPlayerDao.sex);
            chatInfo.setLevel(targetPlayerDao.lv);
            chatInfo.setVipLv(targetPlayerDao.vip_lv);
            chatInfo.setShowVip(targetPlayerDao.isShowVip);
            chatInfo.setHead(targetPlayerDao.head);
            chatInfo.setHeadFrame(targetPlayerDao.headFrame);
            chatInfo.setPrestige(targetPlayerDao.prestige);
            chatInfo.setSecondTitle(targetPlayerDao.secondTitle);
            chatInfo.setServerId(targetPlayerDao.serverId);
            chatInfo.setProvince(this.player.getIpProvince());
            chatInfo.setCity(this.player.getIpCity());
            chatInfo.setSubclass(subclass);
            chatInfo.setExtra1(1);
            chatInfo.setExtra2("");
            chatInfo.setChatTime(DateUtil.getIntTime(System.currentTimeMillis()));
            chatInfo.setShareTips(shareTips);
            chatInfo.setQqWanKaLv(targetPlayerDao.qqWanKaLv);
            chatInfo.setQqLogo(targetPlayerDao.qqLogo);
            if (heroInfoMsg != null) {
               chatInfo.setHeroInfo(heroInfoMsg);
            }

            if (itemInfoMsg != null) {
               chatInfo.setItemInfo(itemInfoMsg);
            }

            if (bubble > 0) {
               chatInfo.setBubble(bubble);
            }

            if (medals != null && !medals.isEmpty()) {
               chatInfo.addAllMedal(medals);
            }

            if (customPrestiges != null && !customPrestiges.isEmpty()) {
               chatInfo.addAllCustomPrestige(customPrestiges);
            }

            builder.addInfos(chatInfo);
            this.player.sendMsg(builder.build());
            if (channel == 1) {
               ChatDao chatDao = new ChatDao();
               chatDao.id = this.player.getUniqueCode(CodeDefine.CHAT_CODE);
               chatDao.playerId = this.player.getPlayerId();
               chatDao.relativePlayerId = targetId;
               chatDao.content = content;
               chatDao.channel = channel;
               chatDao.sendType = 1;
               chatDao.subclass = subclass;
               chatDao.bubbleId = bubble;
               chatDao.medals = medals;
               PrestigeData prestigeData = new PrestigeData();

               for(CommonMsg.MapDataIS mapDataMsg : customPrestiges) {
                  prestigeData.prestigeMap.put(mapDataMsg.getKey(), mapDataMsg.getValue());
               }

               chatDao.customPrestiges = prestigeData;
               this.player.insertDao(chatDao, false);
               this.deleteExpiredRecord();
            }
         }

         return true;
      }
   }

   public boolean handlePersonalReceiver(int channel, int sendType, int receiverId, int senderId, String content, int subclass, int bubble, Set<Integer> medals, List<CommonMsg.MapDataIS> customPrestiges) {
      WorldMgr worldMgr = (WorldMgr)this.context.getBean(WorldMgr.class);
      GamePlayer receivePlayer = worldMgr.getPlayerById(receiverId);
      if (Objects.isNull(receivePlayer)) {
         return this.player.failure(17);
      } else {
         FriendPart friendPart = (FriendPart)receivePlayer.getMgrPart(FriendPart.class);
         if (!friendPart.checkIdentity(4, senderId)) {
            if (receivePlayer.isLogin()) {
               GamePlayer sender = worldMgr.getPlayerById(senderId);
               if (sender != null) {
                  PlayerPublicDao senderPlayerDao = sender.getPublicDao();
                  ChatMsg.S2C_Chat_6004.Builder builder = ChatMsg.S2C_Chat_6004.newBuilder();
                  ChatMsg.Chat_Info.Builder chatInfo = ChatMsg.Chat_Info.newBuilder();
                  chatInfo.setChatId(-1);
                  chatInfo.setChannel(channel);
                  chatInfo.setContent(content);
                  chatInfo.setPlayerId(senderId);
                  chatInfo.setPlayerName(senderPlayerDao.playerName);
                  chatInfo.setSex(senderPlayerDao.sex);
                  chatInfo.setLevel(senderPlayerDao.lv);
                  chatInfo.setVipLv(senderPlayerDao.vip_lv);
                  chatInfo.setHead(senderPlayerDao.head);
                  chatInfo.setHeadFrame(senderPlayerDao.headFrame);
                  chatInfo.setPrestige(senderPlayerDao.prestige);
                  chatInfo.setSecondTitle(senderPlayerDao.secondTitle);
                  chatInfo.setServerId(senderPlayerDao.serverId);
                  chatInfo.setProvince(sender.getIpProvince());
                  chatInfo.setCity(sender.getIpCity());
                  chatInfo.setSubclass(subclass);
                  chatInfo.setExtra1(sendType);
                  chatInfo.setExtra2("");
                  chatInfo.setChatTime(DateUtil.getIntTime(System.currentTimeMillis()));
                  chatInfo.setQqWanKaLv(senderPlayerDao.qqWanKaLv);
                  chatInfo.setQqLogo(senderPlayerDao.qqLogo);
                  if (bubble > 0) {
                     chatInfo.setBubble(bubble);
                  }

                  if (medals != null && !medals.isEmpty()) {
                     chatInfo.addAllMedal(medals);
                  }

                  if (customPrestiges != null && !customPrestiges.isEmpty()) {
                     chatInfo.addAllCustomPrestige(customPrestiges);
                  }

                  builder.addInfos(chatInfo);
                  receivePlayer.sendMsg(builder.build());
               }
            }

            ChatDao chatDao = new ChatDao();
            receivePlayer.pushTask(() -> {
               receivePlayer.getList("tb_chat", receivePlayer.getPlayerId());
               chatDao.id = receivePlayer.getUniqueCode(CodeDefine.CHAT_CODE);
               chatDao.playerId = receivePlayer.getPlayerId();
               chatDao.relativePlayerId = senderId;
               chatDao.content = content;
               chatDao.channel = channel;
               chatDao.sendType = sendType;
               chatDao.subclass = subclass;
               chatDao.bubbleId = bubble;
               chatDao.medals = medals;
               PrestigeData prestigeData = new PrestigeData();

               for(CommonMsg.MapDataIS mapDataMsg : customPrestiges) {
                  prestigeData.prestigeMap.put(mapDataMsg.getKey(), mapDataMsg.getValue());
               }

               chatDao.customPrestiges = prestigeData;
               receivePlayer.insertDao(chatDao, false);
               PlayerChatPart part = (PlayerChatPart)receivePlayer.getMgrPart(PlayerChatPart.class);
               part.deleteExpiredRecord();
            });
         }

         return true;
      }
   }

   private ChatMsg.Chat_Info.Builder packChatInfo(ChatDao chatDao) {
      WorldMgr worldMgr = (WorldMgr)this.context.getBean(WorldMgr.class);
      int playerId = chatDao.playerId;
      int receiveId = chatDao.playerId;
      if (chatDao.channel == 1) {
         playerId = chatDao.relativePlayerId;
         if (chatDao.sendType == 2) {
            receiveId = chatDao.relativePlayerId;
         }
      }

      ChatMsg.Chat_Info.Builder chatInfoBuilder = ChatMsg.Chat_Info.newBuilder();
      int chatId = chatDao.id;
      if (chatId == 0) {
         chatId = -1;
      }

      chatInfoBuilder.setChatId(chatId);
      chatInfoBuilder.setChannel(chatDao.channel);
      chatInfoBuilder.setContent(chatDao.content);
      chatInfoBuilder.setPlayerId(playerId);
      chatInfoBuilder.setExtra1(chatDao.sendType);
      chatInfoBuilder.setExtra2(chatDao.extra_2);
      chatInfoBuilder.setSubclass(chatDao.subclass);
      chatInfoBuilder.setChatTime(DateUtil.getIntTime(chatDao.createTime.getTime()));
      chatInfoBuilder.setAppointId(chatDao.appointId);
      if (chatDao.bubbleId > 0) {
         chatInfoBuilder.setBubble(chatDao.bubbleId);
      }

      GamePlayer otherPlayer = worldMgr.getPlayerById(receiveId);
      if (otherPlayer != null) {
         PlayerPublicDao otherPlayerDao = otherPlayer.getPublicDao();
         chatInfoBuilder.setPlayerName(otherPlayerDao.playerName);
         chatInfoBuilder.setSex(otherPlayerDao.sex);
         chatInfoBuilder.setLevel(otherPlayerDao.lv);
         chatInfoBuilder.setVipLv(otherPlayerDao.vip_lv);
         chatInfoBuilder.setHead(otherPlayerDao.head);
         chatInfoBuilder.setHeadFrame(otherPlayerDao.headFrame);
         chatInfoBuilder.setPrestige(otherPlayerDao.prestige);
         chatInfoBuilder.setSecondTitle(otherPlayerDao.secondTitle);
         chatInfoBuilder.setServerId(otherPlayerDao.serverId);
         chatInfoBuilder.setShowVip(otherPlayerDao.isShowVip);
         chatInfoBuilder.setProvince(otherPlayer.getIpProvince());
         chatInfoBuilder.setCity(otherPlayer.getIpCity());
         chatInfoBuilder.setQqWanKaLv(otherPlayerDao.qqWanKaLv);
         chatInfoBuilder.setQqLogo(otherPlayerDao.qqLogo);
      }

      if (chatDao.subclass == 6) {
         try {
            CommonMsg.HeroInfo heroInfoMsg = CommonMsg.HeroInfo.parseFrom(chatDao.heroShare);
            chatInfoBuilder.setHeroInfo(heroInfoMsg);
         } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
         }
      }

      if (chatDao.medals != null && !chatDao.medals.isEmpty()) {
         chatInfoBuilder.addAllMedal(chatDao.medals);
      }

      if (chatDao.customPrestiges != null) {
         for(Map.Entry<Integer, String> entry : chatDao.customPrestiges.prestigeMap.entrySet()) {
            CommonMsg.MapDataIS.Builder prestigeMsg = CommonMsg.MapDataIS.newBuilder();
            prestigeMsg.setKey((Integer)entry.getKey());
            prestigeMsg.setValue((String)entry.getValue());
            chatInfoBuilder.addCustomPrestige(prestigeMsg);
         }
      }

      return chatInfoBuilder;
   }

   private boolean showCondition(int channel, int playerId, int sendType) {
      if (channel == 4) {
         return true;
      } else if (channel == 2 && sendType == 1) {
         return true;
      } else {
         return channel == 1 && playerId == this.player.getPlayerId();
      }
   }

   private void deleteExpiredRecord() {
      List<ChatDao> list = this.player.<ChatDao>getList("tb_chat", this.player.getPlayerId());
      int saveCount = Math.min(500, this.configManager.getIntDefault("chatmemory", 50));
      if (list.size() > saveCount) {
         ChatDao chatDao = (ChatDao)list.get(0);
         if (Objects.nonNull(chatDao)) {
            this.player.deleteDao(chatDao, false);
         }
      }

   }

   private boolean channelLimit(int channel) {
      ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
      ChatLimitData chatLimitData = chatMgr.getChatLimitData((byte)channel);
      if (chatLimitData == null) {
         return true;
      } else {
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         int lastChatTime = (Integer)playerExtend.chatRecord.getOrDefault(channel, 0);
         PlayerPublicDao playerPublicDao = this.player.getPublicDao();
         int hintNum = chatLimitData.chatEnable(playerPublicDao.lv, playerPublicDao.vip_lv, lastChatTime);
         if (hintNum == 1) {
            return true;
         } else {
            this.player.failure(hintNum);
            return false;
         }
      }
   }

   @MsgHandlerAnno
   public void fightToFriend(ChatMsg.C2S_FightToFriend_6007 msg, String channelId) {
      WorldMgr bean = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      int destPlayerId = msg.getPlayerId();
      int serverId = msg.getServerId();
      PlayerPublicDao myDao = this.player.getPublicDao();
      ArrayingMirror myArraying = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      if (myArraying == null) {
         this.player.failure(6);
      } else if (msg.hasCross() && msg.getCross() && !this.checkCrossPKCD()) {
         this.player.failure(76038);
      } else {
         if (serverId != 0 && !this.worldMgr.getServersSet().contains(serverId)) {
            CommonMsg.PlayerInfo.Builder playerInfo = CommonMsg.PlayerInfo.newBuilder();
            playerInfo.setPlayerId(this.player.getPlayerId());
            playerInfo.setPlayerName(myDao.playerName);
            playerInfo.setSex(myDao.sex);
            playerInfo.setLevel(myDao.lv);
            playerInfo.setVipLv(myDao.vip_lv);
            playerInfo.setHead(myDao.head);
            playerInfo.setHeadFrame(myDao.headFrame);
            playerInfo.setQqWanKaLv(myDao.qqWanKaLv);
            playerInfo.setQqLogo(myDao.qqLogo);
            playerInfo.setPower(myDao.combat_power);
            playerInfo.setServerId(myDao.serverId);
            if (msg.hasCross() && msg.getCross()) {
               CrossMsg.S2S_CrossPK_4221.Builder builder = CrossMsg.S2S_CrossPK_4221.newBuilder();
               builder.setArrayingData(ByteString.copyFrom(myArraying.toByteArray()));
               builder.setAtkPlayerInfo(playerInfo);
               this.crossNettyClient.send2Server(this.player.getServerId(), this.player.getPlayerId(), msg.getServerId(), msg.getPlayerId(), builder.build());
            } else {
               CrossChatMsg.S2CR_FightToPlayer_11715.Builder builder = CrossChatMsg.S2CR_FightToPlayer_11715.newBuilder();
               builder.setDefServerId(serverId);
               builder.setDefPlayerId(destPlayerId);
               builder.setAtkPlayerInfo(playerInfo);
               builder.setHeroArrayingData(ByteString.copyFrom(myArraying.toByteArray()));
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            }
         } else {
            GamePlayer friendPlayer = bean.getPlayerById(destPlayerId);
            if (friendPlayer == null) {
               this.player.failure(6);
               return;
            }

            friendPlayer.pushTask(() -> {
               PlayerPublicDao friendPlayerDao = friendPlayer.getPublicDao();
               ArrayingMirror playerArraying = friendPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
               this.fightPlayer(myDao, myArraying, friendPlayerDao, playerArraying, msg.hasCross() && msg.getCross());
            });
         }

      }
   }

   @MsgHandlerAnno
   public void S2S_CrossPK_4221(CrossMsg.S2S_CrossPK_4221 msg, CrossSubscribeMsg crossSubscribeMsg) {
      HeroRankMgr heroRankMgr = (HeroRankMgr)ApplicationContextProvider.getContext().getBean(HeroRankMgr.class);
      PlayerPublicDao defPlayerDao = this.player.getPublicDao();
      ArrayingMirror atkArraying = ArrayingMirror.toArrayingMirror(msg.getArrayingData().toByteArray());
      ArrayingMirror defArraying = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      BattlePKTeam atkTeam = new BattlePKTeam(msg.getAtkPlayerInfo().getPlayerId(), msg.getAtkPlayerInfo().getPlayerName(), atkArraying, msg.getAtkPlayerInfo().getLevel(), msg.getAtkPlayerInfo().getHead(), msg.getAtkPlayerInfo().getHeadFrame(), heroRankMgr.getHeroRankCompensate(atkArraying, false));
      BattlePKTeam defTeam = new BattlePKTeam(defPlayerDao.playerId, defPlayerDao.playerName, defArraying, defPlayerDao.lv, defPlayerDao.head, defPlayerDao.headFrame, heroRankMgr.getHeroRankCompensate(defArraying, false));
      BattleScene battleScene = new BattleScene(1040, msg.getAtkPlayerInfo().getPlayerId());
      battleScene.addPKTeam(atkTeam, defTeam);
      BattleMsg.S2C_BattleResult_6102.Builder fight = battleScene.fight((byte)22);
      this.setPkTeamServerId(fight, crossSubscribeMsg.sourceServerId, this.player.getServerId());
      this.crossNettyClient.send2Server(this.player.getServerId(), this.player.getPlayerId(), crossSubscribeMsg.sourceServerId, crossSubscribeMsg.sourcePlayerId, fight.build());
   }

   private boolean checkCrossPKCD() {
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int nextFlushTime = (Integer)playerResetCustomCache.getForeverNum(35, 0);
      if (nextFlushTime > curTime) {
         return false;
      } else {
         nextFlushTime = curTime + ApplicationContextProvider.getConfigInt("CSD_CD1", 10);
         playerResetCustomCache.setForever(35, nextFlushTime);
         this.player.notifyPlayerData(PlayerDefine.CROSS_PK_CD, nextFlushTime);
         return true;
      }
   }

   public void fightPlayer(PlayerPublicDao atkPlayerDao, ArrayingMirror atkArraying, PlayerPublicDao defPlayerDao, ArrayingMirror defArraying, boolean isCross) {
      if (atkPlayerDao != null && atkArraying != null && defPlayerDao != null && defArraying != null) {
         BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
         battleRecordMgr.pushTask(() -> {
            BattleScene battleScene = new BattleScene(1040, atkPlayerDao.playerId);
            BattlePKTeam myTeam = new BattlePKTeam(atkPlayerDao.playerId, atkPlayerDao.playerName, atkArraying, atkPlayerDao.lv, atkPlayerDao.head, atkPlayerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(atkArraying, false));
            BattlePKTeam friendTeam = new BattlePKTeam(defPlayerDao.playerId, defPlayerDao.playerName, defArraying, defPlayerDao.lv, defPlayerDao.head, defPlayerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(defArraying, false));
            battleScene.addPKTeam(myTeam, friendTeam);
            BattleMsg.S2C_BattleResult_6102.Builder fight = battleScene.fight((byte)22);
            BattlePart.printTextOfBattleMsg(fight);
            if (isCross) {
               this.setPkTeamServerId(fight, atkPlayerDao.serverId, defPlayerDao.serverId);
            }

            this.player.sendMsg(battleRecordMgr.addBattleRecord(1040, 0, atkPlayerDao.playerId, defPlayerDao.playerId, fight).build());
         });
      } else {
         this.player.failure(6);
      }
   }

   private void setPkTeamServerId(BattleMsg.S2C_BattleResult_6102.Builder fight, int leftServerId, int rightServerId) {
      BattleMsg.S2C_Battle_PKTeam.Builder atkTeamBuilder = fight.getTeams(0).toBuilder();
      PlayerMsg.PropertyCell.Builder serverIdBuild = PlayerMsg.PropertyCell.newBuilder();
      serverIdBuild.setProperty(PlayerDefine.SERVER_ID);
      serverIdBuild.setValue(String.valueOf(leftServerId));
      fight.setTeams(atkTeamBuilder.getForce(), atkTeamBuilder.addPlayerInfos(serverIdBuild));
      BattleMsg.S2C_Battle_PKTeam.Builder defTeamBuilder = fight.getTeams(1).toBuilder();
      serverIdBuild = PlayerMsg.PropertyCell.newBuilder();
      serverIdBuild.setProperty(PlayerDefine.SERVER_ID);
      serverIdBuild.setValue(String.valueOf(rightServerId));
      fight.setTeams(defTeamBuilder.getForce(), defTeamBuilder.addPlayerInfos(serverIdBuild));
   }

   @MsgHandlerAnno
   public void C2S_ChatLogin_6013(ChatMsg.C2S_ChatLogin_6013 msg, String source) {
      ChatMsg.S2C_ChatLogin_6014.Builder builder = ChatMsg.S2C_ChatLogin_6014.newBuilder();
      WorldMgr worldMgr = (WorldMgr)this.context.getBean(WorldMgr.class);
      List<ChatDao> list = this.player.<ChatDao>getList("tb_chat", this.player.getPlayerId());
      Map<Integer, Map<Integer, ChatDao>> map = new HashMap();

      for(ChatDao chatDao : list) {
         if (this.showCondition(chatDao.channel, chatDao.playerId, chatDao.sendType)) {
            Map<Integer, ChatDao> tempMap = (Map)map.getOrDefault(chatDao.relativePlayerId, new HashMap());
            tempMap.put(chatDao.id, chatDao);
            map.put(chatDao.relativePlayerId, tempMap);
         }
      }

      for(Map.Entry<Integer, Map<Integer, ChatDao>> entry : map.entrySet()) {
         List<Integer> keyList = new ArrayList(((Map)entry.getValue()).keySet());
         Collections.sort(keyList);
         int loop = 0;
         List<ChatDao> allPlayerChatList = new ArrayList();

         for(int i = keyList.size() - 1; i >= 0; --i) {
            ++loop;
            if (loop > 20) {
               break;
            }

            allPlayerChatList.add(((Map)entry.getValue()).get(keyList.get(i)));
         }

         for(int i = allPlayerChatList.size() - 1; i >= 0; --i) {
            builder.addInfos(this.packChatInfo((ChatDao)allPlayerChatList.get(i)));
         }
      }

      PlayerDao playerDao = this.player.getPlayerDao();
      ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
      List<Integer> chanelList = new ArrayList();
      chanelList.add(2);
      chanelList.add(4);
      chanelList.add(7);

      for(Integer channel : chanelList) {
         Queue<ChatMsg.Chat_Info> worldQueue = chatMgr.getCacheChat(channel);
         this.addChatInfo(builder, worldQueue);
      }

      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      Queue<ChatMsg.Chat_Info> areaQueue = chatMgr.getAreaQueue(playerExtend.areaId);
      this.addChatInfo(builder, areaQueue);
      Queue<ChatMsg.Chat_Info> unionQueue = chatMgr.getUnionQueue(playerDao.unionId);
      this.addChatInfo(builder, unionQueue);
      Queue<ChatMsg.Chat_Info> internationalChats = chatMgr.getInternationalChat();
      this.addChatInfo(builder, internationalChats);
      this.player.sendMsg(builder.build());
   }

   private void addChatInfo(ChatMsg.S2C_ChatLogin_6014.Builder builder, Queue<ChatMsg.Chat_Info> queue) {
      if (queue != null) {
         FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
         int chatSaveDay = this.configManager.getIntDefault("chatSaveDay", 3);
         int showLimit = this.configManager.getIntDefault("ChatShowLimitNum", 50);
         int beginTime = DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(System.currentTimeMillis() - 86400000L * (long)(chatSaveDay - 1)));
         if (queue.size() <= showLimit) {
            for(ChatMsg.Chat_Info chatInfo : queue) {
               if (!friendDao.blacks.contains(chatInfo.getPlayerId())) {
                  builder.addInfos(chatInfo);
               }
            }
         } else {
            for(ChatMsg.Chat_Info chatInfo : queue) {
               if (!friendDao.blacks.contains(chatInfo.getPlayerId()) && chatInfo.getChatTime() > beginTime) {
                  builder.addInfos(chatInfo);
               }
            }
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_ChatDistory_6011(ChatMsg.C2S_ChatDistory_6011 msg, String source) {
      WorldMgr worldMgr = (WorldMgr)this.context.getBean(WorldMgr.class);
      List<ChatDao> list = this.player.<ChatDao>getList("tb_chat", this.player.getPlayerId());
      Map<Integer, ChatDao> map = new HashMap();
      List<Integer> keyList = new ArrayList();

      for(ChatDao chatDao : list) {
         if (chatDao.channel == msg.getChannel() && chatDao.relativePlayerId == msg.getDestPlayerId() && this.showCondition(chatDao.channel, chatDao.playerId, chatDao.sendType)) {
            map.put(chatDao.id, chatDao);
            keyList.add(chatDao.id);
         }
      }

      ChatMsg.S2C_ChatDistory_6012.Builder builder = ChatMsg.S2C_ChatDistory_6012.newBuilder();
      if (!map.isEmpty() && map.keySet().contains(msg.getChatId())) {
         List<ChatDao> result = new ArrayList();
         Collections.sort(keyList);
         boolean isStart = false;
         int loop = 0;

         for(int i = keyList.size() - 1; i >= 0; --i) {
            if (isStart) {
               int chatId = (Integer)keyList.get(i);
               result.add(map.get(chatId));
               ++loop;
               if (loop >= 20) {
                  break;
               }
            } else if ((Integer)keyList.get(i) == msg.getChatId()) {
               isStart = true;
            }
         }

         if (!result.isEmpty()) {
            for(ChatDao chatDao : result) {
               builder.addInfos(this.packChatInfo(chatDao));
            }
         }

         this.player.sendMsg(builder.build());
      } else {
         this.logger.info("没有历史记录了，玩家={}，聊天玩家={},频道={}，聊天Id={}", new Object[]{this.player.getPlayerDao(), msg.getDestPlayerId(), msg.getChannel(), msg.getChatId()});
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void CR2S_FightToPlayer_11716(CrossChatMsg.CR2S_FightToPlayer_11716 msg, String source) {
      CommonMsg.PlayerInfo atkPlayerInfo = msg.getAtkPlayerInfo();
      BattleScene battleScene = new BattleScene(1040, atkPlayerInfo.getPlayerId());
      ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror(msg.getHeroArrayingData().toByteArray());
      BattlePKTeam atkTeam = new BattlePKTeam(atkPlayerInfo.getPlayerId(), atkPlayerInfo.getPlayerName(), arrayingMirror, atkPlayerInfo.getLevel(), atkPlayerInfo.getHead(), atkPlayerInfo.getHeadFrame(), this.heroRankMgr.getHeroRankCompensate(arrayingMirror, false));
      PlayerPublicDao myDao = this.player.getPublicDao();
      ArrayingMirror myArraying = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      BattlePKTeam defTeam = new BattlePKTeam(myDao.playerId, myDao.playerName, myArraying, myDao.lv, myDao.head, myDao.headFrame, this.heroRankMgr.getHeroRankCompensate(myArraying, false));
      battleScene.addPKTeam(atkTeam, defTeam);
      BattleMsg.S2C_BattleResult_6102.Builder fight = battleScene.fight((byte)22);
      CrossChatMsg.S2CR_FightToPlayerResult_11717.Builder builder = CrossChatMsg.S2CR_FightToPlayerResult_11717.newBuilder();
      builder.setDestServerId(atkPlayerInfo.getServerId());
      builder.setDestPlayerId(atkPlayerInfo.getPlayerId());
      builder.setBattleMsg(fight);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void CR2S_FightToPlayerResult_11718(CrossChatMsg.CR2S_FightToPlayerResult_11718 msg, String source) {
      BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
      battleRecordMgr.pushTask(() -> this.player.sendMsg(battleRecordMgr.addBattleRecord(1040, 0, this.player.getPlayerId(), msg.getDefPlayerId(), msg.getBattleMsg().toBuilder()).build()));
   }

   public boolean checkMsgRepeat(String message) {
      int repeatChatLength = this.configManager.getIntDefault("repeatChatLength", 6);
      if (!this.configManager.getStr("repeatChatLength_" + this.worldMgr.country).equals("")) {
         repeatChatLength = this.configManager.getIntDefault("repeatChatLength_" + this.worldMgr.country, 6);
      }

      if (message.length() <= repeatChatLength) {
         return true;
      } else {
         String _encode = MD5Util.encode(message);
         int _curTime = DateUtil.getIntTime(System.currentTimeMillis());
         if (this._lastMessage.containsKey(_encode)) {
            int _lastTime = (Integer)this._lastMessage.get(_encode);
            if (_curTime - _lastTime < this.configManager.getIntDefault("chatSameWordsTime", 3600)) {
               return this.player.failure(61047);
            }
         }

         int _limitSize = 50;
         if (this._lastMessage.size() > _limitSize) {
            Iterator<Map.Entry<String, Integer>> _it = this._lastMessage.entrySet().iterator();

            for(int _pos = 0; _pos <= _limitSize / 2 && _it.hasNext(); ++_pos) {
               _it.next();
               _it.remove();
            }
         }

         this._lastMessage.put(_encode, _curTime);
         return true;
      }
   }

   public void loginHandle() {
      this.sendChatCondition();
   }

   public void sendChatCondition() {
      ChatMgr chatMgr = (ChatMgr)this.context.getBean(ChatMgr.class);
      Map<Byte, ChatLimitData> chatConditionMap = chatMgr.getChatLimitDataMap();
      if (chatConditionMap.size() > 0) {
         ChatMsg.S2C_ChatCondition_6016.Builder builder = ChatMsg.S2C_ChatCondition_6016.newBuilder();

         for(ChatLimitData chatLimitData : chatConditionMap.values()) {
            builder.addConditions(chatLimitData.toChatCondition());
         }

         this.player.sendMsg(builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_PlayerBeautyInfo_9840(TongqueTerraceMsg.C2S_PlayerBeautyInfo_9840 msg, String source) {
      WorldMgr worldMgr = (WorldMgr)this.context.getBean(WorldMgr.class);
      int otherId = msg.getPlayerId();
      int serverId;
      if (!msg.hasServerId()) {
         serverId = worldMgr.GAME_SERVER_ID;
      } else {
         serverId = msg.getServerId();
      }

      if (worldMgr.getServersSet().contains(serverId)) {
         GamePlayer otherPlayer = worldMgr.getPlayerById(otherId);
         if (otherPlayer != null) {
            otherPlayer.pushTask(() -> {
               TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)otherPlayer.getMgrPart(TongqueTerracePart.class);
               TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.Builder builder = TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.newBuilder();
               tongqueTerracePart.packPlayerBeautyInfo(builder, msg.getBeautyId());
               this.player.sendMsg(builder.build());
            });
         }
      } else {
         ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
         chatMgr.reqCrossBeautyDetail(worldMgr.GAME_SERVER_ID, this.player.getPlayerId(), serverId, otherId);
      }

   }

   public boolean isSilentEffect(String string) {
      if (this.worldMgr.country.equals("tw")) {
         return false;
      } else {
         int day = DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) + 1;
         if (day > this.configManager.getIntDefault("ChatSilentDay", 7)) {
            return false;
         } else {
            PlayerDao playerDao = this.player.getPlayerDao();
            int silentEffect = this.configManager.getIntDefault("SilentEffect", 60);
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            if (playerDao.lv < worldMgr.getWorldLv() * silentEffect / 100) {
               return true;
            } else {
               int chatSilentCheckDay = this.configManager.getIntDefault("chatSilentCheckDay", 1);
               if (day <= chatSilentCheckDay && playerDao.lv < this.configManager.getIntDefault("chatSilentFirstDayLv", 25)) {
                  String chatSilentString = this.configManager.getStrByDefault("chatSilentString", "零一二三四五六七八九壹贰叁肆伍陆柒捌玖〇①②③④⑤⑥⑦⑧⑨ⅠⅡⅢⅣⅤⅥⅦⅧⅨⅩ㈠㈡㈢㈣㈤㈥㈦㈧㈨㈩㊀㊁㊂㊃㊄㊅㊆㊇㊈㊉");
                  String chatSymbolString = this.configManager.getStrByDefault("chatSymbolString", "，；：。【】{}“”（）！,.;'[]!");
                  boolean isSpecial = false;
                  int symbol = 0;
                  char[] chars = string.toCharArray();

                  for(char ch : chars) {
                     if (chatSilentString.contains(String.valueOf(ch))) {
                        this.logger.info("包含了静默字符 - {}", ch);
                        isSpecial = true;
                     }

                     if (chatSymbolString.contains(String.valueOf(ch))) {
                        ++symbol;
                     }
                  }

                  this.logger.info("符号数量是：{}", symbol);
                  Pattern pattern = Pattern.compile("[A-Za-z0-9]+");
                  if (!isSpecial && !pattern.matcher(string).find()) {
                     if (string.length() - symbol > this.configManager.getIntDefault("chatSilentFirstLen2", 20)) {
                        return true;
                     }
                  } else if (string.length() - symbol > this.configManager.getIntDefault("chatSilentFirstLen1", 10)) {
                     this.logger.info("包含数字、字符或特殊字符，并且文本长度大于 {}，产生静默", this.configManager.getIntDefault("chatSilentFirstLen1", 10));
                     return true;
                  }
               }

               return false;
            }
         }
      }
   }

   public boolean checkLimit(int channel, int subclass, String content) {
      if (channel == 3) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (playerDao.unionId <= 0) {
            this.player.failure(23);
            return false;
         }

         int unionchatdonation = this.configManager.getIntDefault("unionchatdonation", 100);
         if (!this.configManager.getStr("unionchatdonation_" + this.worldMgr.country).equals("")) {
            unionchatdonation = this.configManager.getIntDefault("unionchatdonation_" + this.worldMgr.country, 100);
         }

         UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
         UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerDao.unionId);
         if (unionMgr == null) {
            this.player.failure(23);
            return false;
         }

         UnionMemberDao unionMemberDao = unionMgr.getUnionMember(playerDao.playerId);
         if (unionMemberDao == null) {
            this.player.failure(23);
            return false;
         }

         if (unionMemberDao.contribution < unionchatdonation) {
            this.player.failure(61182);
            return false;
         }
      } else if (channel == 5 && subclass == 9) {
         int itemId = Integer.parseInt(this.configManager.parseValue("CompeteReam", 0, ","));
         int itemNum = Integer.parseInt(this.configManager.parseValue("CompeteReam", 1, ","));
         if (!this.player.checkResourceNum(2, itemId, itemNum)) {
            String errorTips = ResourceModel.getResourceErrorTips(2, itemId);
            return this.player.failure(53, errorTips);
         }
      }

      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      if (subclass == 6 || subclass == 8 || subclass == 10) {
         int shareCount = Integer.parseInt(this.configManager.parseValue("shareHeroLimit", 0, "\\|"));
         int unlockLv = Integer.parseInt(this.configManager.parseValue("shareHeroLimit", 1, "\\|"));
         if (this.player.getPlayerDao().lv < unlockLv && (Integer)playerResetCustomCache.getDailyNum(525, 0) >= shareCount) {
            this.player.failure(76015);
            return false;
         }
      }

      if (subclass == 7) {
         int shareCoolTime = (Integer)playerResetCustomCache.getDailyNum(539, 0);
         int coolTime = this.configManager.getIntDefault("battleShareCoolTime", 600);
         if (shareCoolTime + coolTime > DateUtil.getIntTime(System.currentTimeMillis())) {
            this.player.failure(76032);
            return false;
         }
      }

      return true;
   }

   @MsgHandlerAnno
   public void C2S_KingOfChallenge_6021(ChatMsg.C2S_KingOfChallenge_6021 msg, String source) {
      int defPlayerId = msg.getPlayerId();
      int defServerId = msg.getServerId();
      if (defServerId == this.player.getPlayerId()) {
         this.player.failure(76013);
      } else {
         ArrayingMirror myArraying = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         if (myArraying == null) {
            this.player.failure(6);
         } else {
            CrossChatMsg.S2CR_KingOfChallenge_11723.Builder builder = CrossChatMsg.S2CR_KingOfChallenge_11723.newBuilder();
            builder.setDefServerId(defServerId);
            builder.setDefPlayerId(defPlayerId);
            CommonMsg.PlayerInfo.Builder playerInfo = this.player.toPlayerInfo(CommonMsg.HeroState.HERO_STATE_ARRAYING);
            playerInfo.clearArraying();
            builder.setAtkPlayerInfo(playerInfo);
            builder.setHeroArrayingData(ByteString.copyFrom(myArraying.toByteArray()));
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void CR2S_KingOfChallenge_11724(CrossChatMsg.CR2S_KingOfChallenge_11724 msg, String source) {
      CommonMsg.PlayerInfo atkPlayerInfo = msg.getAtkPlayerInfo();
      ArrayingMirror atkArraying = ArrayingMirror.toArrayingMirror(msg.getHeroArrayingData().toByteArray());
      BattlePKTeam atkTeam = new BattlePKTeam(atkPlayerInfo.getPlayerId(), atkPlayerInfo.getPlayerName(), atkArraying, atkPlayerInfo.getLevel(), atkPlayerInfo.getHead(), atkPlayerInfo.getHeadFrame(), this.heroRankMgr.getHeroRankCompensate(atkArraying, false));
      PlayerPublicDao defPlayerDao = this.player.getPublicDao();
      ArrayingMirror defArraying = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      BattlePKTeam defTeam = new BattlePKTeam(defPlayerDao.playerId, defPlayerDao.playerName, defArraying, defPlayerDao.lv, defPlayerDao.head, defPlayerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(defArraying, false));
      BattleScene battleScene = new BattleScene(1040, atkPlayerInfo.getPlayerId());
      battleScene.addPKTeam(atkTeam, defTeam);
      BattleMsg.S2C_BattleResult_6102.Builder battleResult = battleScene.fight((byte)22);
      CrossChatMsg.S2CR_KingOfChallenge_11725.Builder builder = CrossChatMsg.S2CR_KingOfChallenge_11725.newBuilder();
      builder.setAtkServerId(atkPlayerInfo.getServerId());
      builder.setAtkPlayerId(atkPlayerInfo.getPlayerId());
      builder.setDefServerId(this.player.getServerId());
      builder.setDefPlayerId(this.player.getPlayerId());
      builder.setBattleMsg(battleResult);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void CR2S_KingOfChallenge_11726(CrossChatMsg.CR2S_KingOfChallenge_11726 msg, String source) {
      this.kingOfChallenge(msg.getDefPlayerId(), msg.getBattleMsg());
   }

   private void kingOfChallenge(int defPlayerId, BattleMsg.S2C_BattleResult_6102 battleMsg) {
      BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
      battleRecordMgr.pushTask(() -> this.player.sendMsg(battleRecordMgr.addBattleRecord(1040, 0, this.player.getPlayerId(), defPlayerId, battleMsg.toBuilder()).build()));
   }

   public void gmTest(String param) {
      String[] strArr = param.split(",");
      switch (strArr[0]) {
         case "kingofchallenge":
            this.C2S_KingOfChallenge_6021(ChatMsg.C2S_KingOfChallenge_6021.newBuilder().setServerId(Integer.parseInt(strArr[1])).setPlayerId(Integer.parseInt(strArr[2])).build(), (String)null);
         default:
      }
   }

   public boolean isShare(int subclass) {
      return subclass == 6 || subclass == 7 || subclass == 8 || subclass == 10 || subclass == 9;
   }

   public boolean getShowBadWordTip() {
      String platformNames = this.configManager.getStrByDefault("playerChatBadWordPlatform", "hkw");
      return platformNames.indexOf(this.worldMgr.PLATFORM_NAME) == -1;
   }

   public void SendPersonalChat(int destPlayerId, String content) {
      ChatMsg.C2S_Chat_6003.Builder chatBuilder = ChatMsg.C2S_Chat_6003.newBuilder();
      chatBuilder.setChannel(1);
      chatBuilder.setContent(content);
      chatBuilder.setDestPlayerId(destPlayerId);
      this.msgChat(chatBuilder.build(), "");
   }
}
