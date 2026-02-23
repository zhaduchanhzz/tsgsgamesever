package com.gzbz.transport.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import cn.hutool.core.collection.ConcurrentHashSet;
import com.google.protobuf.InvalidProtocolBufferException;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.BattleDao;
import com.gzbz.db.BattleRecordDao;
import com.gzbz.db.FriendDao;
import com.gzbz.db.MonarchDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.WaterTransportDao;
import com.gzbz.db.WaterTransportRecordDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.arraying.FriendArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerChat.PlayerChatPart;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.model.CargoGoldenModel;
import com.gzbz.model.CargoShipModel;
import com.gzbz.model.CargoShipSacrificesModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.PropertyExtModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossWaterTransportMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.WaterTransportMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.transport.WaterTransportMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import misc.ComparatorUtil;
import misc.DateUtil;
import misc.MapUtil;
import misc.MiscUtil;
import misc.RandomUtil;
import net.CrossSubscribeMsg;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class WaterTransportPart extends PlayerPart {
   private final ConfigManager configManager;
   private final WorldMgr worldMgr;
   private final WaterTransportMgr waterTransportMgr;
   private final BattleRecordMgr battleRecordMgr;
   public static final Set<Integer> IN_MAIN_PLAYERS = new ConcurrentHashSet();
   private static final int MAX_RECORD_NUM = 20;

   public WaterTransportPart(ConfigManager configManager, WorldMgr worldMgr, WaterTransportMgr waterTransportMgr, BattleRecordMgr battleRecordMgr) {
      this.configManager = configManager;
      this.worldMgr = worldMgr;
      this.waterTransportMgr = waterTransportMgr;
      this.battleRecordMgr = battleRecordMgr;
   }

   @MsgHandlerAnno
   public void C2S_WaterTransportMain_9501(WaterTransportMsg.C2S_WaterTransportMain_9501 msg, String source) {
      if (this.player.isSystemOpen(1991)) {
         boolean isExit = msg.hasIsExit() && msg.getIsExit();
         if (isExit) {
            IN_MAIN_PLAYERS.remove(this.player.getPlayerId());
         } else {
            IN_MAIN_PLAYERS.add(this.player.getPlayerId());
         }

         if (!isExit) {
            this.player.uploadCrossPlayer();
            this.sendWaterTransportMain();
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_WaterTransportSupportInfo_9503(WaterTransportMsg.C2S_WaterTransportSupportInfo_9503 msg, String source) {
      this.sendSupportInfo();
   }

   @MsgHandlerAnno
   public void C2S_WaterTransportSetSupport_9505(WaterTransportMsg.C2S_WaterTransportSetSupport_9505 msg, String source) {
      if (this.player.isSystemOpen(1991)) {
         int friendId = msg.getChoiceFriendId();
         WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
         if (friendId > 0) {
            if (waterTransportDao.nextGuardTime > System.currentTimeMillis()) {
               this.player.failure(33002);
               return;
            }

            GamePlayer friendPlayer = this.worldMgr.getOnlinePlayer(friendId);
            if (friendPlayer == null) {
               this.player.failure(33000);
               return;
            }

            FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
            if (!friendDao.friends.contains(friendId)) {
               this.player.failure(6006);
               return;
            }

            WaterTransportPart friendWaterTransportPart = (WaterTransportPart)friendPlayer.getMgrPart(WaterTransportPart.class);
            friendWaterTransportPart.pushTaskEx("transportSetSupport", new Object[]{this.player});
         } else {
            if (friendId != 0) {
               this.player.failure(0);
               return;
            }

            waterTransportDao.nextGuardTime = 0L;
         }

         waterTransportDao.guardId = friendId;
         waterTransportDao.updateOp();
         WaterTransportMsg.S2C_WaterTransportSetSupport_9506.Builder resp = WaterTransportMsg.S2C_WaterTransportSetSupport_9506.newBuilder();
         resp.setChoiceFriendId(friendId);
         resp.setNextGuardTime(DateUtil.getIntTime(waterTransportDao.nextGuardTime));
         this.player.sendMsg(resp.build());
      }
   }

   @TaskMethod
   public void transportSetSupport(GamePlayer doSetPlayer) {
      if (!this.player.isLogin()) {
         doSetPlayer.failure(33000);
      } else {
         WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
         int maxChooseCount = this.configManager.getInt("MaxChosen");
         if (waterTransportDao.guardCount >= maxChooseCount) {
            doSetPlayer.failure(33001);
         } else {
            ArrayingMirror friendArrayingDao = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
            if (friendArrayingDao != null && !friendArrayingDao.arrayingElementsMap.isEmpty()) {
               waterTransportDao.updateOp();
               WaterTransportPart doSetWaterTransportPart = (WaterTransportPart)doSetPlayer.getMgrPart(WaterTransportPart.class);
               doSetWaterTransportPart.pushTaskEx("setTransportNextGuardTime", new Object[0]);
            } else {
               doSetPlayer.failure(33003);
            }
         }
      }
   }

   @TaskMethod
   public void setTransportNextGuardTime() {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      int friendCooling = ApplicationContextProvider.getConfigInt("FriendCooling", Integer.MAX_VALUE);
      waterTransportDao.nextGuardTime = System.currentTimeMillis() + (long)friendCooling * 1000L;
      waterTransportDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_WaterTransportFlush_9507(WaterTransportMsg.C2S_WaterTransportFlush_9507 msg, String source) {
      if (this.player.isSystemOpen(1991)) {
         Map<Integer, TreeMap<Integer, CargoShipModel>> cargoShipModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CargoShipModel>>getModelPoolMap("customCargoShip");
         if (cargoShipModelMap != null && !cargoShipModelMap.isEmpty()) {
            WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
            if (waterTransportDao.shipModelId <= 0) {
               this.player.failure(0);
            } else {
               CargoShipModel cargoShipModel = (CargoShipModel)ApplicationContextProvider.getModelPoolEntity("CargoShip", waterTransportDao.shipModelId);
               List<Integer> qualityList = new ArrayList(cargoShipModelMap.keySet());
               Collections.sort(qualityList);
               int maxQuality = (Integer)qualityList.get(qualityList.size() - 1);
               if (cargoShipModel.getShipQuality() >= maxQuality) {
                  this.player.failure(33006);
               } else {
                  PlayerDao playerDao = this.player.getPlayerDao();
                  List<Integer> priceList;
                  if (playerDao.privilege_transport > 0) {
                     priceList = this.configManager.getIntList("VIPShipUpGrade");
                  } else {
                     priceList = this.configManager.getIntList("ShipUpGrade");
                  }

                  int qualityIndex = qualityList.indexOf(cargoShipModel.getShipQuality());
                  int feeGold = (Integer)priceList.get(qualityIndex);
                  ResourceModel resourceModel = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, feeGold);
                  if (!this.player.checkResourceNum(resourceModel)) {
                     this.player.failure(31);
                  } else {
                     this.player.delResource(resourceModel, 33, 3301, waterTransportDao.shipModelId, 0, "");
                     waterTransportDao.shipModelId = (Integer)((TreeMap)cargoShipModelMap.get(qualityList.get(qualityIndex + 1))).firstKey();
                     waterTransportDao.updateOp();
                     WaterTransportMsg.S2C_WaterTransportFlush_9508.Builder resp = WaterTransportMsg.S2C_WaterTransportFlush_9508.newBuilder();
                     resp.setShipModelId(waterTransportDao.shipModelId);
                     this.player.sendMsg(resp.build());
                  }
               }
            }
         } else {
            this.player.failure(0);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WaterTransportSail_9509(WaterTransportMsg.C2S_WaterTransportSail_9509 msg, String source) {
      if (!this.player.isSystemOpen(1991)) {
         this.player.failure(21);
      } else {
         int result = this.sail(msg.getShipModelId());
         if (result != 1) {
            this.player.failure(result);
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_WaterTransportInfo_9511(WaterTransportMsg.C2S_WaterTransportInfo_9511 msg, String source) {
      int river = 1;
      if (msg.hasRiver()) {
         river = msg.getRiver();
      }

      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      this.waterTransportMgr.sendWaterTransportInfo(this.player, river, (Set)MapUtil.getOrDefault(waterTransportDao.salvages, river, HashSet.class));
   }

   @MsgHandlerAnno
   public void C2S_WaterTransportList_9513(WaterTransportMsg.C2S_WaterTransportList_9513 msg, String source) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      waterTransportDao.listClickTime = System.currentTimeMillis();
      waterTransportDao.updateOp();
      WaterTransportMsg.S2C_WaterTransportList_9514.Builder resp = WaterTransportMsg.S2C_WaterTransportList_9514.newBuilder();
      resp.setListRed(false);
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_WaterTransportRecord_9515(WaterTransportMsg.C2S_WaterTransportRecord_9515 msg, String source) {
      this.sendRecordList();
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      waterTransportDao.hasRecordRedDot = false;
      waterTransportDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_WaterTransportIntercept_9517(WaterTransportMsg.C2S_WaterTransportIntercept_9517 msg, String source) {
   }

   @MsgHandlerAnno
   public void C2S_WaterTransportInterceptBuy_9519(WaterTransportMsg.C2S_WaterTransportInterceptBuy_9519 msg, String source) {
      if (this.player.isSystemOpen(1991)) {
         WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
         int maxBuyCount = ApplicationContextProvider.getConfigInt("MaxPayRob", 0);
         if (waterTransportDao.buyInterceptCount >= maxBuyCount) {
            this.player.failure(25);
         } else {
            int feeGold = ApplicationContextProvider.getConfigInt("PriceRob", Integer.MAX_VALUE);
            ResourceModel resourceModel = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, feeGold);
            if (!this.player.checkResourceNum(resourceModel)) {
               this.player.failure(31);
            } else {
               this.player.delResource(resourceModel, 33, 3302, 0, 0, "");
               ++waterTransportDao.buyInterceptCount;
               waterTransportDao.updateOp();
               WaterTransportMsg.S2C_WaterTransportInterceptBuy_9520.Builder resp = WaterTransportMsg.S2C_WaterTransportInterceptBuy_9520.newBuilder();
               resp.setBuyInterceptCount(waterTransportDao.buyInterceptCount);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WaterTransportSacrificeInfo_9521(WaterTransportMsg.C2S_WaterTransportSacrificeInfo_9521 msg, String source) {
      if (this.player.isSystemOpen(1991)) {
         this.waterTransportMgr.requestAltar(this.player);
      }
   }

   @MsgHandlerAnno
   public void C2S_WaterTransportSacrifice_9523(WaterTransportMsg.C2S_WaterTransportSacrifice_9523 msg, String source) {
      if (this.player.isSystemOpen(1991)) {
         int sacrifice = msg.getSacrifice();
         CargoShipSacrificesModel cargoShipSacrificesModel = (CargoShipSacrificesModel)ApplicationContextProvider.getModelPoolEntity("CargoShipSacrifices", sacrifice);
         if (cargoShipSacrificesModel == null) {
            this.player.failure(0);
         } else {
            WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
            int maxCount = ApplicationContextProvider.getConfigInt("SacrificeTIme", 0);
            if (waterTransportDao.sacrificeCount >= maxCount) {
               this.player.failure(33015);
            } else if (!this.player.checkResourceNum(cargoShipSacrificesModel.getSacrifices())) {
               this.player.failure(18);
            } else {
               this.player.delResource((List)cargoShipSacrificesModel.getSacrifices(), 33, 3304, sacrifice, 0, "");
               this.player.addResource(cargoShipSacrificesModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 33, 3304, sacrifice, 0, "");
               ++waterTransportDao.sacrificeCount;
               waterTransportDao.updateOp();
               this.waterTransportMgr.pushTaskEx("waterTransportSacrifice", new Object[]{cargoShipSacrificesModel, this.player});
               WaterTransportMsg.S2C_WaterTransportSacrifice_9524.Builder resp = WaterTransportMsg.S2C_WaterTransportSacrifice_9524.newBuilder();
               resp.setSacrifice(sacrifice);
               resp.setSacrificeCount(waterTransportDao.sacrificeCount);
               this.player.sendMsg(resp.build());
               GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
               guanJiaPart.checkState(1994, (List)null);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WaterTransportArrayingInfo_9531(WaterTransportMsg.C2S_WaterTransportArrayingInfo_9531 msg, String source) {
      this.waterTransportMgr.requestArrayingInfo(this.player, msg.getShipId());
   }

   @MsgHandlerAnno
   public void C2S_WaterTransportRecover_9533(WaterTransportMsg.C2S_WaterTransportRecover_9533 msg, String source) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      this.checkTransportRecover();
      WaterTransportMsg.S2C_WaterTransportRecover_9534.Builder resp = WaterTransportMsg.S2C_WaterTransportRecover_9534.newBuilder();
      resp.setRemainCount(waterTransportDao.transportCount);
      resp.setTransportRecoverEndTime(waterTransportDao.transportRecoverTime);
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_SalvageReward_9535(WaterTransportMsg.C2S_SalvageReward_9535 msg, String source) {
      if (this.player.isSystemOpen(1991)) {
         WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
         if (((Set)MapUtil.getOrDefault(waterTransportDao.salvages, msg.getRiver(), HashSet.class)).contains(msg.getId())) {
            this.player.failure(33016);
         } else if (this.checkSalvageLimit()) {
            this.player.failure(33023);
         } else {
            this.waterTransportMgr.requestRemainsReward(this.player, msg.getId(), msg.getRiver());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SalvageRewardOneKey_9537(WaterTransportMsg.C2S_SalvageRewardOneKey_9537 msg, String source) {
      if (this.player.isSystemOpen(1991)) {
         MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
         PlayerDao playerDao = this.player.getPlayerDao();
         int vipLimit = ApplicationContextProvider.getConfigInt("ruinAkeyVipRequire", 0);
         if (playerDao.vip_lv < vipLimit & !monarchDao.prestiges.containsKey(19539)) {
            this.player.failure(6);
         } else {
            WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
            if (this.checkSalvageLimit()) {
               this.player.failure(33023);
            } else {
               this.waterTransportMgr.requestRemainsRewardOneKey(this.player, msg.getRiver(), (Set)MapUtil.getOrDefault(waterTransportDao.salvages, msg.getRiver(), HashSet.class));
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SupportApply_9541(WaterTransportMsg.C2S_SupportApply_9541 msg, String source) {
      if (this.player.isSystemOpen(1991)) {
         WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
         if (waterTransportDao.guardId > 0) {
            this.player.failure(33018);
         } else {
            FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
            if (!friendDao.friends.contains(msg.getFriendId())) {
               this.player.failure(6006);
            } else {
               GamePlayer friendGamePlayer = this.worldMgr.getPlayerById(msg.getFriendId());
               if (friendGamePlayer == null) {
                  this.player.failure(17);
               } else if (!friendGamePlayer.isLogin()) {
                  this.player.failure(33000);
               } else {
                  int limitPower = ApplicationContextProvider.getConfigInt("CargoFriendRequest", 10000);
                  if ((float)this.player.getMaxPlayerCombatPower() * ((float)limitPower / 10000.0F) < (float)friendGamePlayer.getMaxPlayerCombatPower()) {
                     this.player.failure(33026);
                  } else {
                     CargoShipModel cargoShipModel = (CargoShipModel)ApplicationContextProvider.getModelPoolEntity("CargoShip", waterTransportDao.shipModelId);
                     if (cargoShipModel == null) {
                        this.player.failure(0);
                     } else {
                        if ("jp".equals(this.worldMgr.country)) {
                           if (waterTransportDao.supports.contains(msg.getFriendId())) {
                              this.player.failure(33001);
                              return;
                           }

                           if (waterTransportDao.supports.size() >= ApplicationContextProvider.getConfigInt("cargoInviteFriendsTime", 3)) {
                              this.player.failure(33025);
                              return;
                           }

                           List<Integer> qualityList = this.configManager.getIntList("cargoQualityLimit");
                           if (!qualityList.contains(cargoShipModel.getShipQuality())) {
                              this.player.failure(33024);
                              return;
                           }

                           this.waterTransportBeAgreeSupport(friendGamePlayer);
                        } else {
                           Map<Integer, TreeMap<Integer, CargoShipModel>> map = ApplicationContextProvider.<Integer, TreeMap<Integer, CargoShipModel>>getModelPoolMap("customCargoShip");
                           TreeSet<Integer> qualitySet = new TreeSet(map.keySet());
                           if ((Integer)qualitySet.last() != cargoShipModel.getShipQuality()) {
                              this.player.failure(33024);
                              return;
                           }

                           WaterTransportPart friendWaterTransportPart = (WaterTransportPart)friendGamePlayer.getMgrPart(WaterTransportPart.class);
                           friendWaterTransportPart.pushTaskEx("transportBeApplySupport", new Object[]{this.player});
                        }

                     }
                  }
               }
            }
         }
      }
   }

   @TaskMethod
   public void transportBeApplySupport(GamePlayer applyPlayer) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      if (waterTransportDao.guardCount > 0) {
         applyPlayer.failure(33001);
      } else {
         WaterTransportPart applyWaterTransport = (WaterTransportPart)applyPlayer.getMgrPart(WaterTransportPart.class);
         applyWaterTransport.pushTaskEx("transportApplySupport", new Object[]{this.player.getPlayerId()});
         PlayerDao playerDao = this.player.getPlayerDao();
         PlayerPublicDao applyPlayerDao = applyPlayer.getPublicDao();
         if (applyPlayerDao.unionId > 0 && applyPlayerDao.unionId == playerDao.unionId) {
            applyWaterTransport.pushTaskEx("waterTransportBeAgreeSupport", new Object[]{this.player});
         } else {
            WaterTransportMsg.S2C_SupportApplyNotify_9544.Builder notifyMsg = WaterTransportMsg.S2C_SupportApplyNotify_9544.newBuilder();
            notifyMsg.setFriendId(applyPlayer.getPlayerId());
            notifyMsg.setIsCancel(false);
            this.player.sendMsg(notifyMsg.build());
         }

      }
   }

   @TaskMethod
   public void transportApplySupport(int friendId) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      waterTransportDao.applySupports.add(friendId);
      waterTransportDao.updateOp();
      WaterTransportMsg.S2C_SupportApply_9542.Builder resp = WaterTransportMsg.S2C_SupportApply_9542.newBuilder();
      resp.setFriendId(friendId);
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_AgreeSupport_9545(WaterTransportMsg.C2S_AgreeSupport_9545 msg, String source) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      if (waterTransportDao.guardCount > 0) {
         this.sendSupportResult(msg.getFriendId(), msg.getIsCancel());
      } else {
         FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
         if (!friendDao.friends.contains(msg.getFriendId())) {
            this.sendSupportResult(msg.getFriendId(), msg.getIsCancel());
         } else {
            GamePlayer applyGamePlayer = this.worldMgr.getPlayerById(msg.getFriendId());
            if (applyGamePlayer == null) {
               this.sendSupportResult(msg.getFriendId(), msg.getIsCancel());
            } else {
               WaterTransportPart applyWaterTransportPart = (WaterTransportPart)applyGamePlayer.getMgrPart(WaterTransportPart.class);
               if (!msg.getIsCancel()) {
                  ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
                  if (arrayingMirror == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
                     this.sendSupportResult(msg.getFriendId(), msg.getIsCancel());
                     return;
                  }

                  applyWaterTransportPart.pushTaskEx("waterTransportBeAgreeSupport", new Object[]{this.player});
               } else {
                  applyWaterTransportPart.pushTaskEx("waterTransportBeCancelSupport", new Object[]{this.player.getPlayerId()});
               }

               this.sendSupportResult(msg.getFriendId(), msg.getIsCancel());
            }
         }
      }
   }

   @TaskMethod
   public void waterTransportBeCancelSupport(int friendId) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      waterTransportDao.applySupports.remove(friendId);
      waterTransportDao.updateOp();
   }

   @TaskMethod
   public void waterTransportBeAgreeSupport(GamePlayer supportPlayer) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      if (waterTransportDao.guardId <= 0) {
         waterTransportDao.guardId = supportPlayer.getPlayerId();
         waterTransportDao.updateOp();
         if (this.sail(waterTransportDao.shipModelId) == 1) {
            if (!"jp".equals(this.worldMgr.country)) {
               WaterTransportPart supportWaterTransportPart = (WaterTransportPart)supportPlayer.getMgrPart(WaterTransportPart.class);
               supportWaterTransportPart.pushTaskEx("waterTransportBeSupport", new Object[0]);
            }
         } else {
            waterTransportDao.guardId = 0;
            waterTransportDao.updateOp();
         }

         WaterTransportMsg.S2C_WaterTransportSetSupport_9506.Builder supportNotifyMsg = WaterTransportMsg.S2C_WaterTransportSetSupport_9506.newBuilder();
         supportNotifyMsg.setChoiceFriendId(supportPlayer.getPlayerId());
         supportNotifyMsg.setNextGuardTime(0);
         this.player.sendMsg(supportNotifyMsg.build());
      }
   }

   @TaskMethod
   public void waterTransportBeSupport() {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      waterTransportDao.guardCount = 1;
      waterTransportDao.updateOp();
      this.waterTransportMgr.broadcastAlreadySupport(this.player.getPlayerId());
   }

   @TaskMethod
   public void waterTransportCancelSupport() {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      waterTransportDao.guardCount = 0;
      waterTransportDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_PlayerShips_9549(WaterTransportMsg.C2S_PlayerShips_9549 msg, String source) {
      this.waterTransportMgr.requestMyShips(!msg.hasPlayerId() ? this.player.getPlayerId() : msg.getPlayerId(), this.player);
   }

   @MsgHandlerAnno
   public void C2S_GoldShip_9551(WaterTransportMsg.C2S_GoldShip_9551 msg, String source) {
      if (this.player.isSystemOpen(1991)) {
         this.waterTransportMgr.requestGoldShipInfo(this.player);
      }
   }

   @MsgHandlerAnno
   public void C2S_GoldShipInterceptCdClear_9557(WaterTransportMsg.C2S_GoldShipInterceptCdClear_9557 msg, String source) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      int shipType = this.getGoldShipType();
      if (shipType == 0) {
         this.player.failure(0);
      } else {
         int goldInterceptCount = MiscUtil.getHiParam((Long)MapUtil.getOrDefault(waterTransportDao.goldInterceptCount, shipType, 0L));
         int goldInterceptCd = MiscUtil.getLowParam((Long)MapUtil.getOrDefault(waterTransportDao.goldInterceptCount, shipType, 0L));
         if (goldInterceptCd < DateUtil.getIntTime(System.currentTimeMillis())) {
            this.player.failure(0);
         } else if (goldInterceptCount >= ApplicationContextProvider.getConfigInt("GoldenFightTime", 0)) {
            this.player.failure(51);
         } else {
            ResourceModel resourceModel = ResourceModel.buildResource(ApplicationContextProvider.getConfigString("GoldenFightSpeedUp", "1|9|200"));
            if (!this.player.checkResourceNum(resourceModel)) {
               this.player.failure(31);
            } else {
               this.player.delResource(resourceModel, 33, 3309, 0, 0, "");
               waterTransportDao.goldInterceptCount.put(shipType, MiscUtil.comboInteger(goldInterceptCount, 0));
               waterTransportDao.updateOp();
               WaterTransportMsg.S2C_GoldShipInterceptCdClear_9558.Builder resp = WaterTransportMsg.S2C_GoldShipInterceptCdClear_9558.newBuilder();
               resp.setGoldInterceptCd(0);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void CR2S_Sail_10206(CrossWaterTransportMsg.CR2S_Sail_10206 msg, CrossSubscribeMsg crossSubscribeMsg) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      WaterTransportMsg.S2C_WaterTransportSail_9510.Builder resp = WaterTransportMsg.S2C_WaterTransportSail_9510.newBuilder();
      resp.setShipModelId(msg.getShipData().getShipModelId());
      resp.setRemainCount(waterTransportDao.transportCount);
      resp.setTransportRecoverEndTime(waterTransportDao.transportRecoverTime);
      resp.setRandomTimeId(msg.getRecord().getRandomId());
      resp.setLuckyBuf(waterTransportDao.getLuckyBuf());
      this.player.sendMsg(resp.build());
      CargoShipModel cargoShipModel = (CargoShipModel)ApplicationContextProvider.getModelPoolEntity("CargoShip", msg.getShipData().getShipModelId());
      this.player.triggerTask(347, 0, 1L, 1);
      this.player.triggerTask(372, cargoShipModel.getShipQuality(), 1L, 3);
      WaterTransportRecordDao waterTransportRecordDao = new WaterTransportRecordDao();
      waterTransportRecordDao.playerId = this.player.getPlayerId();
      waterTransportRecordDao.fromMsg(msg.getRecord());
      this.addRecord(waterTransportRecordDao);
      this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "漕运风云", "1");
   }

   @MsgHandlerAnno
   public void CR2S_Intercept_10208(CrossWaterTransportMsg.CR2S_Intercept_10208 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int shipModelId = msg.getShipModelId();
      int rewardScale = msg.getRewardScale();
      int recordItemNum = 0;
      int recordCopper = 0;
      CargoShipModel cargoShipModel = (CargoShipModel)ApplicationContextProvider.getModelPoolEntity("CargoShip", shipModelId);
      List<ResourceModel> rewardList = new ArrayList();

      for(ResourceModel model : ResourceModel.buildResources(cargoShipModel.getRobFail())) {
         ResourceModel.addResourceToList(rewardList, model);
         if (model.getType() == 2) {
            recordItemNum += model.getValue();
         } else {
            recordCopper += model.getValue();
         }
      }

      if (rewardScale > 0) {
         PropertyExtModel buffModel = this.waterTransportMgr.getBuff(301);
         List<ResourceModel> lvRewards = this.getCargoReward(cargoShipModel.getId(), msg.getWorldLv() > 0 ? msg.getWorldLv() : msg.getLevel());
         List<Integer> robRewardRate = this.configManager.getIntList("RobRewardRate");

         for(ResourceModel resourceModel : lvRewards) {
            ResourceModel rewardModel = resourceModel.clone();
            if (buffModel != null) {
               rewardModel.setValue(rewardModel.getValue() + buffModel.cal(rewardModel.getValue()));
            }

            rewardModel.setValue((int)((float)rewardModel.getValue() * ((float)rewardScale / 10000.0F)));
            if (rewardModel.getType() == 2) {
               rewardModel.setValue((int)((float)rewardModel.getValue() * ((float)(Integer)robRewardRate.get(1) / 10000.0F)));
               recordItemNum += rewardModel.getValue();
            } else {
               rewardModel.setValue((int)((float)rewardModel.getValue() * ((float)(Integer)robRewardRate.get(0) / 10000.0F)));
               recordCopper += rewardModel.getValue();
            }

            rewardModel.addResourceToList(rewardList);
         }
      }

      Map<Integer, BattleDao> battleDaoMap = this.player.<Integer, BattleDao>getMap("tb_battle", this.player.getPlayerId());
      BattleDao battleDao = (BattleDao)battleDaoMap.get(1991);
      if (battleDao == null) {
         this.logger.error("战斗-->{}进入【漕运风云】战斗失败,战斗数据不存在", this.player.getPlayerId());
      } else {
         battleDao.stream = msg.getBattleMsg().toByteArray();
         BattleMsg.S2C_BattleResult_6102.Builder battleMsg = this.battleRecordMgr.addBattleRecord(1991, 0, msg.getBattleMsg().getTeams(0).getBeloogId(), msg.getBattleMsg().getTeams(1).getBeloogId(), msg.getBattleMsg().toBuilder());

         try {
            battleDao.scene = new BattleScene(BattleMsg.S2C_BattleResult_6102.parseFrom(battleDao.stream));
         } catch (InvalidProtocolBufferException e) {
            this.logger.error("战斗-->{}进入【漕运风云】战斗失败,战斗数据解析出错", this.player.getPlayerId());
            e.printStackTrace();
         }

         battleDao.rewards.addAll(rewardList);
         battleDao.status = 0;
         battleDao.totalTime = (long)battleDao.scene.getCostTime();
         battleDao.updateOp();
         this.logger.info("战斗-->{}进入【漕运风云】战斗,拦截【{}】护卫的漕运船,战斗结果【{}】", new Object[]{this.player.getPlayerId(), msg.getBattleMsg().getTeams(1).getBeloogName(), msg.getBattleMsg().getResult().getResult() == 0 ? "拦截成功" : "拦截失败"});
         this.player.sendMsg(msg.getBattleMsg());
         WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
         ++waterTransportDao.interceptCount;
         if (waterTransportDao.revenges.containsKey(msg.getBattleMsg().getTeams(1).getBeloogId())) {
            this.player.triggerTask(613, 0, 1L, 1);
            waterTransportDao.revenges.remove(msg.getBattleMsg().getTeams(1).getBeloogId());
         }

         waterTransportDao.updateOp();
         WaterTransportMsg.S2C_WaterTransportIntercept_9518.Builder resp = WaterTransportMsg.S2C_WaterTransportIntercept_9518.newBuilder();
         resp.setInterceptCount(waterTransportDao.interceptCount);
         resp.setShipId(msg.getShipId());
         this.player.sendMsg(resp.build());
         if (msg.hasRecord()) {
            WaterTransportRecordDao waterTransportRecordDao = new WaterTransportRecordDao();
            waterTransportRecordDao.playerId = this.player.getPlayerId();
            waterTransportRecordDao.fromMsg(msg.getRecord());
            waterTransportRecordDao.copper = recordCopper;
            waterTransportRecordDao.itemNum = recordItemNum;
            waterTransportRecordDao.recordId = battleMsg.getResult().getRecordId();
            waterTransportRecordDao.recordTime = battleMsg.getStartTime();
            this.addRecord(waterTransportRecordDao);
         }

         this.player.triggerTask(393, 0, 1L, 1);
      }
   }

   @MsgHandlerAnno
   public void CR2S_BeInterceptLog_10211(CrossWaterTransportMsg.CR2S_BeInterceptLog_10211 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (this.player.isSystemOpen(1991)) {
         WaterTransportRecordDao waterTransportRecordDao = new WaterTransportRecordDao();
         waterTransportRecordDao.playerId = this.player.getPlayerId();
         waterTransportRecordDao.fromMsg(msg.getRecord());
         WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
         if (msg.getRecord().hasGuardName() && !StringUtils.isEmpty(msg.getRecord().getGuardName())) {
            ++waterTransportDao.guardInterceptCount;
            String[] rewardLimitArr = ApplicationContextProvider.getConfigString("ChosenRewardLimit", "").split("\\|");
            ResourceModel limitResource = new ResourceModel(Integer.parseInt(rewardLimitArr[0]), Integer.parseInt(rewardLimitArr[1]), Integer.parseInt(rewardLimitArr[2]));
            String[] rewardArr = ApplicationContextProvider.getConfigString("ChosenReward", "").split(",");

            for(String rewardStr : rewardArr) {
               String[] resourceArr = rewardStr.split("\\|");
               ResourceModel resourceModel = new ResourceModel(Integer.parseInt(resourceArr[0]), Integer.parseInt(resourceArr[1]), Integer.parseInt(resourceArr[2]));
               if (resourceModel.getType() == limitResource.getType() && resourceModel.getId() == limitResource.getId()) {
                  if (waterTransportDao.guardInterceptCount * resourceModel.getValue() <= limitResource.getValue()) {
                     waterTransportRecordDao.itemNum = resourceModel.getValue();
                  }
               } else {
                  waterTransportRecordDao.copper = resourceModel.getValue();
               }
            }
         } else {
            int revengeLastTime = ApplicationContextProvider.getConfigInt("revengeLastTime", 2);
            waterTransportDao.revenges.put(msg.getBattleMsg().getTeams(0).getBeloogId(), DateUtil.getIntTime(System.currentTimeMillis() + (long)revengeLastTime * 86400000L));
            CargoShipModel cargoShipModel = (CargoShipModel)ApplicationContextProvider.getModelPoolEntity("CargoShip", waterTransportRecordDao.shipModelId);
            if (cargoShipModel != null) {
               for(ResourceModel resourceModel : this.getCargoReward(cargoShipModel.getId(), msg.getWorldLv() > 0 ? msg.getWorldLv() : msg.getLevel())) {
                  if (resourceModel.getType() == 2) {
                     waterTransportRecordDao.itemNum += (int)((float)resourceModel.getValue() * ((float)msg.getRewardScale() / 10000.0F));
                  } else {
                     waterTransportRecordDao.copper += (int)((float)resourceModel.getValue() * ((float)msg.getRewardScale() / 10000.0F));
                  }
               }
            }
         }

         waterTransportDao.updateOp();
         BattleMsg.S2C_BattleResult_6102.Builder battleMsg = this.battleRecordMgr.addBattleRecord(1991, 0, msg.getBattleMsg().getTeams(1).getBeloogId(), msg.getBattleMsg().getTeams(0).getBeloogId(), msg.getBattleMsg().toBuilder());
         waterTransportRecordDao.recordId = battleMsg.getResult().getRecordId();
         waterTransportRecordDao.recordTime = battleMsg.getStartTime();
         this.addRecord(waterTransportRecordDao);
         if (IN_MAIN_PLAYERS.contains(this.player.getPlayerId())) {
            this.sendWaterTransportMain();
         }

      }
   }

   @MsgHandlerAnno
   public void CR2S_PlayerShipArrive_10212(CrossWaterTransportMsg.CR2S_PlayerShipArrive_10212 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.arrive(msg.getShipModelId(), msg.getGuardId(), msg.getBeInterceptCount(), msg.getRewardScale(), msg.getExRewardScale(), msg.getRecord(), msg.getLevel(), msg.getWorldLv());
   }

   @MsgHandlerAnno
   public void CR2S_RemainsReward_10218(CrossWaterTransportMsg.CR2S_RemainsReward_10218 msg, CrossSubscribeMsg crossSubscribeMsg) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      if (((Set)MapUtil.getOrDefault(waterTransportDao.salvages, msg.getRiver(), HashSet.class)).contains(msg.getRemains().getId())) {
         this.player.failure(33016);
      } else if (this.checkSalvageLimit()) {
         this.player.failure(33023);
      } else {
         ((Set)MapUtil.computeIfAbsent(waterTransportDao.salvages, msg.getRiver(), HashSet.class)).add(msg.getRemains().getId());
         waterTransportDao.updateOp();
         List<ResourceModel> resourceModels = this.salvageRewards(msg.getRemains().getShipModelId(), msg.getRemains().getBelongPlayer());

         for(ResourceModel resourceModel : resourceModels) {
            if (this.checkSalvageLimit()) {
               break;
            }

            this.recordSalvageLimit(resourceModel);
         }

         this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_TRANSPORT, 33, 3307, msg.getRemains().getBelongPlayer(), msg.getRemains().getShipModelId(), msg.getRiver() + "");
         WaterTransportMsg.S2C_SalvageReward_9536.Builder resp = WaterTransportMsg.S2C_SalvageReward_9536.newBuilder();
         resp.setId(msg.getRemains().getId());
         resp.setRiver(msg.getRiver());
         this.player.sendMsg(resp.build());
         this.player.triggerTask(392, 0, 1L, 1);
      }
   }

   @MsgHandlerAnno
   public void CR2S_RemainsRewardOneKey_10220(CrossWaterTransportMsg.CR2S_RemainsRewardOneKey_10220 msg, CrossSubscribeMsg crossSubscribeMsg) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      int rewardCount = 0;
      if (msg.getRemainsCount() > 0) {
         if (this.checkSalvageLimit()) {
            this.player.failure(33023);
            return;
         }

         List<ResourceModel> rewards = new ArrayList();

         label40:
         for(CrossWaterTransportMsg.CrossRemainsData crossRemainsData : msg.getRemainsList()) {
            if (!((Set)MapUtil.getOrDefault(waterTransportDao.salvages, msg.getRiver(), HashSet.class)).contains(crossRemainsData.getId())) {
               for(ResourceModel resourceModel : this.salvageRewards(crossRemainsData.getShipModelId(), crossRemainsData.getBelongPlayer())) {
                  if (this.checkSalvageLimit()) {
                     break label40;
                  }

                  resourceModel.addResourceToList(rewards);
                  this.recordSalvageLimit(resourceModel);
               }

               ((Set)MapUtil.computeIfAbsent(waterTransportDao.salvages, msg.getRiver(), HashSet.class)).add(crossRemainsData.getId());
               ++rewardCount;
            }
         }

         waterTransportDao.updateOp();
         this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_TRANSPORT, 33, 3308, msg.getRiver(), 0, "");
      }

      WaterTransportMsg.S2C_SalvageRewardOneKey_9538.Builder resp = WaterTransportMsg.S2C_SalvageRewardOneKey_9538.newBuilder();
      resp.setRiver(msg.getRiver());
      this.player.sendMsg(resp.build());
      if (rewardCount > 0) {
         this.player.triggerTask(392, 0, (long)rewardCount, 1);
      }
   }

   @MsgHandlerAnno
   public void CR2S_GoldShipIntercept_10224(CrossWaterTransportMsg.CR2S_GoldShipIntercept_10224 msg, CrossSubscribeMsg crossSubscribeMsg) {
      Map<Integer, BattleDao> battleDaoMap = this.player.<Integer, BattleDao>getMap("tb_battle", this.player.getPlayerId());
      BattleDao battleDao = (BattleDao)battleDaoMap.get(1991);
      if (battleDao == null) {
         this.logger.error("战斗-->{}进入【漕运风云黄金船】战斗失败,战斗数据不存在", this.player.getPlayerId());
      } else {
         battleDao.stream = msg.getBattleMsg().toByteArray();
         this.battleRecordMgr.addBattleRecord(1991, 0, msg.getBattleMsg().getTeams(0).getBeloogId(), msg.getBattleMsg().getTeams(1).getBeloogId(), msg.getBattleMsg().toBuilder());

         try {
            battleDao.scene = new BattleScene(BattleMsg.S2C_BattleResult_6102.parseFrom(battleDao.stream));
         } catch (InvalidProtocolBufferException e) {
            this.logger.error("战斗-->{}进入【漕运风云黄金船】战斗失败,战斗数据解析出错", this.player.getPlayerId());
            e.printStackTrace();
         }

         CargoGoldenModel cargoGoldenModel = (CargoGoldenModel)ApplicationContextProvider.getModelPoolEntity("cargoGolden", msg.getStage());
         if (cargoGoldenModel != null) {
            battleDao.rewards.addAll(cargoGoldenModel.getcRewards());
            if (msg.getIsKill()) {
               battleDao.rewards.addAll(cargoGoldenModel.getRewards());
            }
         }

         battleDao.status = 0;
         battleDao.totalTime = (long)battleDao.scene.getCostTime();
         battleDao.scene.getBattleMsg().setIsSkip(battleDao.isSkip);
         battleDao.updateOp();
         this.logger.info("战斗-->{}进入【漕运风云黄金船】战斗", this.player.getPlayerId());
         this.player.sendMsg(battleDao.scene.getBattleMsg().build());
         WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
         int interceptCount = MiscUtil.getHiParam((Long)MapUtil.getOrDefault(waterTransportDao.goldInterceptCount, msg.getShipType(), 0L));
         int interceptCd = MiscUtil.getLowParam((Long)MapUtil.getOrDefault(waterTransportDao.goldInterceptCount, msg.getShipType(), 0L));
         WaterTransportMsg.S2C_GoldShipIntercept_9556.Builder resp = WaterTransportMsg.S2C_GoldShipIntercept_9556.newBuilder();
         resp.setGoldInterceptCd(interceptCd);
         resp.setGoldInterceptCount(interceptCount);
         resp.setIsKill(msg.getIsKill());
         this.player.sendMsg(resp.build());
      }
   }

   public int enterBattle(BattleDao battleDao) {
      if (battleDao.params.isEmpty()) {
         return 6;
      } else if ((Integer)battleDao.params.get(1) != 1 && (Integer)battleDao.params.get(1) != 2) {
         return 0;
      } else {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         if (!crossNettyClient.isLogin()) {
            return 0;
         } else {
            this.player.uploadCrossPlayer();
            WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
            ArrayingMirror heroArrayingData = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_WATER_TRANSPORT);
            if (heroArrayingData.arrayingHeroIsEmpty()) {
               return 21000;
            } else {
               int checkCode = battleDao.scene.getPKTeam((byte)0).checkArraying();
               if (checkCode != 1) {
                  return checkCode;
               } else {
                  if ((Integer)battleDao.params.get(1) == 2) {
                     int shipType = this.getGoldShipType();
                     if (shipType == 0) {
                        return 0;
                     }

                     int interceptCount = ApplicationContextProvider.getConfigInt("GoldenFightTime", 0);
                     int goldInterceptCount = MiscUtil.getHiParam((Long)MapUtil.getOrDefault(waterTransportDao.goldInterceptCount, shipType, 0L));
                     int goldInterceptCd = MiscUtil.getLowParam((Long)MapUtil.getOrDefault(waterTransportDao.goldInterceptCount, shipType, 0L));
                     if (goldInterceptCount >= interceptCount) {
                        return 51;
                     }

                     if (goldInterceptCd > DateUtil.getIntTime(System.currentTimeMillis())) {
                        return 33021;
                     }

                     this.waterTransportMgr.pushTaskEx("waterTransportInterceptGoldShip", new Object[]{this.player, shipType, heroArrayingData});
                     ++goldInterceptCount;
                     if (goldInterceptCount < interceptCount) {
                        goldInterceptCd = DateUtil.getIntTime(System.currentTimeMillis()) + ApplicationContextProvider.getConfigInt("GoldenFightCold", Integer.MAX_VALUE);
                     } else {
                        goldInterceptCd = 0;
                     }

                     waterTransportDao.goldInterceptCount.put(shipType, MiscUtil.comboInteger(goldInterceptCount, goldInterceptCd));
                     waterTransportDao.updateOp();
                  } else {
                     this.waterTransportMgr.pushTaskEx("waterTransportInterceptPlayer", new Object[]{this.player, battleDao.params.get(0), heroArrayingData, waterTransportDao.getEnableInterceptCount()});
                  }

                  return 1;
               }
            }
         }
      }
   }

   public void endBattle(BattleDao battleDao) {
      PlayerMsg.ShowType showType = PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW;
      if (!battleDao.autoSettle) {
         if ((Integer)battleDao.params.get(1) == 2) {
            this.waterTransportMgr.requestGoldShipInfo(this.player);
         } else {
            showType = PlayerMsg.ShowType.SHOW_TYPE_COMMON;
         }
      }

      this.player.addResource(battleDao.rewards, showType, 33, 3303, (Integer)battleDao.params.get(1), 0, "");
      this.updateRank(battleDao.rewards, RankDefine.RankModule.WATER_TRANSPORT_INTERCEPT);
   }

   public void arrive(int shipModelId, int guardId, int beInterceptCount, int rewardScale, int exRewardScale, WaterTransportMsg.TransportRecord transportRecord, int level, int worldLv) {
      if (this.player.isSystemOpen(1991)) {
         CargoShipModel cargoShipModel = (CargoShipModel)this.player.getGameModelPool().getEntity("CargoShip", shipModelId);
         if (cargoShipModel == null) {
            this.logger.error("漕运船到达,商船品质{}配置不存在", shipModelId);
         } else {
            String guardName = "";
            if (guardId > 0) {
               GamePlayer friendGamePlayer = this.worldMgr.getPlayerById(guardId);
               if (friendGamePlayer != null) {
                  PlayerPublicDao friendPlayerDao = friendGamePlayer.getPublicDao();
                  guardName = friendPlayerDao.playerName;
                  WaterTransportPart friendWaterTransportPart = (WaterTransportPart)friendGamePlayer.getMgrPart(WaterTransportPart.class);
                  if (!"jp".equals(this.worldMgr.country)) {
                     friendWaterTransportPart.pushTaskEx("waterTransportCancelSupport", new Object[0]);
                  } else {
                     friendWaterTransportPart.pushTaskEx("supportReward", new Object[]{this.player.getPublicDao().playerName});
                  }
               }

               WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
               waterTransportDao.guardId = 0;
               waterTransportDao.updateOp();
            } else {
               LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "oneself");
               if (languageModel != null) {
                  guardName = languageModel.getValue();
               } else {
                  guardName = "自己";
               }
            }

            List<ResourceModel> guardRewards = this.getCargoReward(cargoShipModel.getId(), worldLv > 0 ? worldLv : level);
            if (guardRewards != null && !guardRewards.isEmpty()) {
               WaterTransportRecordDao waterTransportRecordDao = new WaterTransportRecordDao();
               waterTransportRecordDao.playerId = this.player.getPlayerId();
               waterTransportRecordDao.fromMsg(transportRecord);
               List<ResourceModel> rewardList = new ArrayList();
               List<ResourceModel> exRewardList = new ArrayList();

               for(ResourceModel resourceModel : guardRewards) {
                  int reward = (int)((float)resourceModel.getValue() * ((float)rewardScale / 10000.0F));
                  ResourceModel rewardModel = resourceModel.clone();
                  rewardModel.setValue(reward);
                  rewardModel.addResourceToList(rewardList);
                  int exReward = (int)((float)resourceModel.getValue() * ((float)exRewardScale / 10000.0F));
                  if (exReward > 0) {
                     rewardModel = resourceModel.clone();
                     rewardModel.setValue(exReward);
                     rewardModel.addResourceToList(exRewardList);
                  }

                  if (resourceModel.getType() == 1 && resourceModel.getId() == PlayerDefine.PLAYER_COPPER) {
                     waterTransportRecordDao.copper += reward;
                     waterTransportRecordDao.exCopper += exReward;
                  } else if (resourceModel.getType() == 2) {
                     waterTransportRecordDao.itemNum += reward;
                     waterTransportRecordDao.exItemNum += exReward;
                  }
               }

               List<ResourceModel> allRewardList = new ArrayList(rewardList);
               Map<Integer, TreeMap<Integer, CentreAwardModel>> rewardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               TreeMap<Integer, CentreAwardModel> centreAwardModelMap = (TreeMap)rewardMap.get(CentreAwardModel.TYPE_TRANSPORT_ARRIVE);
               CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardModelMap.firstEntry().getValue();
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), MessageFormat.format(centreAwardModel.getDesc(), guardName, beInterceptCount), rewardList, 604800000L, 33, 3305);
               if (!exRewardList.isEmpty()) {
                  centreAwardModelMap = (TreeMap)rewardMap.get(CentreAwardModel.TYPE_TRANSPORT_ARRIVE_EX);
                  centreAwardModel = cargoShipModel.getMaxExtraBonus() > exRewardScale ? (CentreAwardModel)centreAwardModelMap.firstEntry().getValue() : (CentreAwardModel)centreAwardModelMap.lastEntry().getValue();
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), exRewardList, 604800000L, 33, 3305);
                  allRewardList.addAll(exRewardList);
               }

               this.updateRank(allRewardList, RankDefine.RankModule.WATER_TRANSPORT);
               this.sendWaterTransportMain();
               this.addRecord(waterTransportRecordDao);
               this.player.triggerTask(609, 0, 1L, 1);
            } else {
               this.logger.error("等级{},商船{}的护卫奖励配置不存在", this.worldMgr.getWorldLv(), cargoShipModel.getId());
            }
         }
      }
   }

   @TaskMethod
   public void supportReward(String beSupportName) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      ++waterTransportDao.guardCount;
      waterTransportDao.updateOp();
      if (waterTransportDao.guardCount <= ApplicationContextProvider.getConfigInt("cargoHelpAwardTime", 3)) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> rewardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardModelMap = (TreeMap)rewardMap.get(CentreAwardModel.TYPE_TRANSPORT_GUARD_JP);
         if (centreAwardModelMap != null && !centreAwardModelMap.isEmpty()) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardModelMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), MessageFormat.format(centreAwardModel.getDesc(), beSupportName), centreAwardModel.getItems(), 604800000L, 33, 3314);
         }
      }
   }

   public void loginHandle() {
      if (this.player.isSystemOpen(1991)) {
         this.sendWaterTransportMain();
      }
   }

   public boolean loginHandleAsync() {
      return true;
   }

   public void checkTransportRecover() {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      PlayerDao playerDao = this.player.getPlayerDao();
      int recoverTime = ApplicationContextProvider.getConfigInt("CargoTimeRecover", 43200);
      if (playerDao.privilege_transport > 0) {
         recoverTime = ApplicationContextProvider.getConfigInt("CargoVIPTimeRecover", 28800);
      }

      List<Integer> maxCountList = this.configManager.getIntList("CargoMaxTime");
      int maxCount = (Integer)maxCountList.get(0);
      if (playerDao.privilege_transport > 0) {
         maxCount = (Integer)maxCountList.get(1);
      }

      PropertyExtModel buffModel = this.waterTransportMgr.getBuff(306);
      if (buffModel != null) {
         maxCount += buffModel.cal(maxCount);
      }

      if (waterTransportDao.transportCount == -1) {
         waterTransportDao.transportCount = ApplicationContextProvider.getConfigInt("CargoFirstTime", 1);
         waterTransportDao.updateOp();
      }

      if (waterTransportDao.transportCount < maxCount) {
         if (waterTransportDao.transportRecoverTime == 0) {
            waterTransportDao.transportRecoverTime = curTime + recoverTime;
            waterTransportDao.updateOp();
         } else {
            while(waterTransportDao.transportRecoverTime < curTime && waterTransportDao.transportCount < maxCount) {
               waterTransportDao.transportRecoverTime += recoverTime;
               ++waterTransportDao.transportCount;
               waterTransportDao.updateOp();
            }
         }
      }

      if (waterTransportDao.transportCount >= maxCount) {
         waterTransportDao.transportRecoverTime = 0;
         waterTransportDao.updateOp();
      }

   }

   public void delRecord(List<BattleRecordDao> delRecord) {
      if (delRecord != null) {
         List<WaterTransportRecordDao> waterTransportRecordDaoList = this.getTransportRecords();

         for(BattleRecordDao battleRecordDao : delRecord) {
            if (battleRecordDao.model == 1991) {
               for(WaterTransportRecordDao waterTransportRecordDao : waterTransportRecordDaoList) {
                  if (waterTransportRecordDao.recordId == battleRecordDao.id) {
                     waterTransportRecordDao.recordId = 0;
                     waterTransportRecordDao.updateOp();
                  }
               }
            }
         }

      }
   }

   public void resetDaily() {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      if ("jp".equals(this.worldMgr.country)) {
         waterTransportDao.guardCount = 0;
      } else if (waterTransportDao.guardInterceptCount > 0) {
         List<ResourceModel> rewardList = new ArrayList();
         String[] rewardLimitArr = ApplicationContextProvider.getConfigString("ChosenRewardLimit", "").split("\\|");
         ResourceModel limitResource = new ResourceModel(Integer.parseInt(rewardLimitArr[0]), Integer.parseInt(rewardLimitArr[1]), Integer.parseInt(rewardLimitArr[2]));
         String[] rewardArr = ApplicationContextProvider.getConfigString("ChosenReward", "").split(",");

         for(String rewardStr : rewardArr) {
            String[] resourceArr = rewardStr.split("\\|");
            ResourceModel resourceModel = new ResourceModel(Integer.parseInt(resourceArr[0]), Integer.parseInt(resourceArr[1]), waterTransportDao.guardInterceptCount * Integer.parseInt(resourceArr[2]));
            if (resourceModel.getType() == limitResource.getType() && resourceModel.getId() == limitResource.getId() && resourceModel.getValue() > limitResource.getValue()) {
               resourceModel.setValue(limitResource.getValue());
            }

            resourceModel.addResourceToList(rewardList);
         }

         Map<Integer, TreeMap<Integer, CentreAwardModel>> rewardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardModelMap = (TreeMap)rewardMap.get(CentreAwardModel.TYPE_TRANSPORT_GUARD);
         if (centreAwardModelMap != null && !centreAwardModelMap.isEmpty()) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardModelMap.firstEntry().getValue();
            if (centreAwardModel != null) {
               String title = centreAwardModel.getTitle();
               String content = MessageFormat.format(centreAwardModel.getDesc(), waterTransportDao.guardInterceptCount);
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, title, content, rewardList, 604800000L, 33, 3305);
            }
         }
      }

      waterTransportDao.reset();
   }

   private void randomLuckyShip() {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      if (waterTransportDao.luckyShipTime > 0) {
         int cycleTime = ApplicationContextProvider.getConfigInt("lunkyBoatCycle", 0) * 86400;
         int luckyShipTime = waterTransportDao.luckyShipTime + cycleTime;
         if (luckyShipTime > curTime) {
            return;
         }
      }

      if (waterTransportDao.luckyShips.isEmpty()) {
         Map<Integer, CargoShipModel> cargoShipModelMap = ApplicationContextProvider.<Integer, CargoShipModel>getModelPoolMap("CargoShip");
         List<CargoShipModel> cargoShipModels = new ArrayList();

         for(CargoShipModel cargoShipModel : cargoShipModelMap.values()) {
            if (cargoShipModel.getLuckyBoat() > 0) {
               cargoShipModels.add(cargoShipModel);
            }
         }

         float luckyWeight = 1.0F;

         for(CargoShipModel cargoShipModel : cargoShipModels) {
            luckyWeight *= (float)(10000 - cargoShipModel.getLuckyBoat()) / 10000.0F;
         }

         int randomInt = RandomUtil.randInt(10000);
         if (!((float)randomInt <= luckyWeight * 10000.0F)) {
            if (!cargoShipModels.isEmpty()) {
               int luckShipId = ((CargoShipModel)cargoShipModels.get(RandomUtil.randInt(cargoShipModels.size()))).getId();
               if (luckShipId > 0) {
                  waterTransportDao.luckyShips.put(luckShipId, false);
                  waterTransportDao.luckyShipTime = curTime;
                  waterTransportDao.updateOp();
               }

            }
         }
      }
   }

   @TaskMethod
   public void sendWaterTransportMain() {
      this.checkTransportRecover();
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      boolean updateFlag = false;
      if (waterTransportDao.shipModelId == 0) {
         if (waterTransportDao.quality > 0) {
            waterTransportDao.shipModelId = CargoShipModel.getInitShipModel(waterTransportDao.quality);
         } else {
            waterTransportDao.shipModelId = CargoShipModel.getInitShipModel();
         }

         updateFlag = true;
      }

      Iterator<Map.Entry<Integer, Integer>> iterator = waterTransportDao.revenges.entrySet().iterator();

      while(iterator.hasNext()) {
         Map.Entry<Integer, Integer> entry = (Map.Entry)iterator.next();
         if ((Integer)entry.getValue() <= DateUtil.getIntTime(System.currentTimeMillis())) {
            updateFlag = true;
            iterator.remove();
         }
      }

      if (updateFlag) {
         waterTransportDao.updateOp();
      }

      WaterTransportMsg.S2C_WaterTransportMain_9502.Builder resp = WaterTransportMsg.S2C_WaterTransportMain_9502.newBuilder();
      resp.setRemainCount(waterTransportDao.transportCount);
      resp.setInterceptCount(waterTransportDao.interceptCount);
      resp.setBuyInterceptCount(waterTransportDao.buyInterceptCount);
      resp.setSacrificeCount(waterTransportDao.sacrificeCount);
      resp.setHasRecordRedDot(waterTransportDao.hasRecordRedDot);
      resp.addAllRevengeIds(waterTransportDao.revenges.keySet());
      resp.setShipModelId(waterTransportDao.shipModelId);
      resp.setTransportRecoverEndTime(waterTransportDao.transportRecoverTime);
      resp.setLuckyBuf(waterTransportDao.getLuckyBuf());
      int goldInterceptCount = MiscUtil.getHiParam((Long)MapUtil.getOrDefault(waterTransportDao.goldInterceptCount, this.getGoldShipType(), 0L));
      resp.setGoldInterceptCount(goldInterceptCount);
      int goldInterceptCd = MiscUtil.getLowParam((Long)MapUtil.getOrDefault(waterTransportDao.goldInterceptCount, this.getGoldShipType(), 0L));
      resp.setGoldInterceptCd(goldInterceptCd);
      resp.setListRed(waterTransportDao.listClickTime == 0L || DateUtil.difftimeDay(new Timestamp(waterTransportDao.listClickTime)) > 1);
      this.player.sendMsg(resp.build());
   }

   public void systemOpenInitLuckyShip() {
      PlayerDao playerDao = this.player.getPlayerDao();
      SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 1991);
      if (systemFunctionModel.getOpenLevel() == playerDao.lv) {
         this.randomLuckyShip();
      }
   }

   private void sendRecordList() {
      WaterTransportMsg.S2C_WaterTransportRecord_9516.Builder resp = WaterTransportMsg.S2C_WaterTransportRecord_9516.newBuilder();
      List<WaterTransportRecordDao> waterTransportRecordDaoList = new ArrayList(this.getTransportRecords());
      Collections.sort(waterTransportRecordDaoList, ComparatorUtil.createReversedComparatorByFiled(WaterTransportRecordDao.class, "recordTime"));

      for(WaterTransportRecordDao waterTransportRecordDao : waterTransportRecordDaoList) {
         resp.addRecords(waterTransportRecordDao.buildMsg());
      }

      this.player.sendMsg(resp.build());
   }

   public void gmSetInterceptCount(int count) {
      int maxRob = ApplicationContextProvider.getConfigInt("MaxRob", 0);
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      if (count <= maxRob + waterTransportDao.buyInterceptCount) {
         waterTransportDao.interceptCount = maxRob + waterTransportDao.buyInterceptCount - count;
         waterTransportDao.updateOp();
         this.sendWaterTransportMain();
      }
   }

   public void gmSetTransport(int count) {
      int maxTransportCount = ApplicationContextProvider.getConfigInt("CargoTime", 1);
      if (count <= maxTransportCount) {
         WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
         waterTransportDao.transportCount = count;
         waterTransportDao.updateOp();
         this.sendWaterTransportMain();
      }
   }

   public void gmResetLucky() {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      waterTransportDao.todayLuckyShip = 0;
      waterTransportDao.updateOp();
   }

   private List<WaterTransportRecordDao> getTransportRecords() {
      List<WaterTransportRecordDao> recordDaoList = this.player.<WaterTransportRecordDao>getList("tb_water_transport_record", this.player.getPlayerId());

      for(WaterTransportRecordDao waterTransportRecordDao : recordDaoList) {
         if (waterTransportRecordDao.shipModelId == 0 && waterTransportRecordDao.quality > 0) {
            waterTransportRecordDao.shipModelId = CargoShipModel.getInitShipModel(waterTransportRecordDao.quality);
            waterTransportRecordDao.updateOp();
         }
      }

      return recordDaoList;
   }

   public void sendRecord(WaterTransportRecordDao waterTransportRecordDao) {
      WaterTransportMsg.S2C_WaterTransportRecordNotify_9528.Builder msg = WaterTransportMsg.S2C_WaterTransportRecordNotify_9528.newBuilder();
      msg.setRecord(waterTransportRecordDao.buildMsg());
      this.player.sendMsg(msg.build());
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      waterTransportDao.hasRecordRedDot = true;
      waterTransportDao.updateOp();
   }

   @TaskMethod
   public void beSupportOnSail(int supportPlayerId, int shipModelId) {
      if (supportPlayerId != this.player.getPlayerId()) {
         GamePlayer supportGamePlayer = this.worldMgr.getPlayerById(supportPlayerId);
         if (supportGamePlayer != null) {
            CargoShipModel cargoShipModel = (CargoShipModel)ApplicationContextProvider.getModelPoolEntity("CargoShip", shipModelId);
            if (cargoShipModel != null) {
               WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
               if (waterTransportDao.beSupportsTimes < ApplicationContextProvider.getConfigInt("cargoBeSupportTime", 3)) {
                  supportGamePlayer.pushTask(() -> {
                     LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "CargoHelp");
                     if (languageModel != null) {
                        String content = MessageFormat.format(languageModel.getValue(), cargoShipModel.getName());
                        PlayerChatPart playerChatPart = (PlayerChatPart)supportGamePlayer.getMgrPart(PlayerChatPart.class);
                        playerChatPart.SendPersonalChat(this.player.getPlayerId(), content);
                     }

                  });
               }

               ++waterTransportDao.beSupportsTimes;
               waterTransportDao.updateOp();
            }
         }
      }
   }

   public int sail(int shipModelId) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      if (!crossNettyClient.isLogin()) {
         return 0;
      } else {
         WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
         PlayerDao playerDao = this.player.getPlayerDao();
         this.player.uploadCrossPlayer();
         CargoShipModel cargoShipModel = (CargoShipModel)ApplicationContextProvider.getModelPoolEntity("CargoShip", shipModelId);
         if (cargoShipModel == null) {
            return 0;
         } else if (waterTransportDao.shipModelId != shipModelId) {
            return 0;
         } else if (waterTransportDao.transportCount <= 0) {
            return 33004;
         } else {
            ArrayingMirror arrayingDao;
            long highPower;
            if (waterTransportDao.guardId > 0) {
               GamePlayer friendPlayer = this.worldMgr.getPlayerById(waterTransportDao.guardId);
               this.player.uploadCrossPlayer();
               arrayingDao = friendPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_WATER_TRANSPORT_SAIL);
               if (arrayingDao == null || arrayingDao.arrayingElementsMap.isEmpty()) {
                  arrayingDao = friendPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
               }

               highPower = friendPlayer.getMaxPlayerCombatPower();
               if ("jp".equals(this.worldMgr.country)) {
                  waterTransportDao.supports.add(friendPlayer.getPlayerId());
                  waterTransportDao.updateOp();
                  friendPlayer.pushPartTaskEx(WaterTransportPart.class, "beSupportOnSail", new Object[]{this.player.getPlayerId(), shipModelId});
               }
            } else {
               arrayingDao = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_WATER_TRANSPORT_SAIL);
               highPower = this.player.getMaxPlayerCombatPower();
            }

            if (arrayingDao != null && !arrayingDao.arrayingElementsMap.isEmpty()) {
               WaterTransportMsg.ShipInfo.Builder shipData = WaterTransportMsg.ShipInfo.newBuilder();
               shipData.setShipId(0);
               shipData.setShipModelId(shipModelId);
               shipData.setArriveTime(0);
               shipData.setRewardScale(cargoShipModel.getMaxExtraBonus());
               shipData.setBeInterceptCount(0);
               shipData.setServer(playerDao.serverId);
               shipData.setRiver(0);
               shipData.setProtectTime(0);
               shipData.setGuardId(waterTransportDao.guardId);
               shipData.setShipId(0);
               shipData.setCombatPower(0L);
               shipData.setBeInterceptStopTime(0);
               shipData.setHighCombatPower(highPower);
               shipData.setWorldLv(this.worldMgr.getWorldLv());
               shipData.setLuckyBuf(waterTransportDao.getLuckyBuf());
               this.waterTransportMgr.pushTaskEx("waterTransportSail", new Object[]{shipData.build(), this.player.getPlayerId(), arrayingDao, playerDao.lv});
               waterTransportDao.guardId = 0;
               waterTransportDao.nextGuardTime = 0L;
               --waterTransportDao.transportCount;
               waterTransportDao.shipModelId = CargoShipModel.getInitShipModel();
               if (waterTransportDao.transportRecoverTime == 0) {
                  int recoverTime;
                  if (playerDao.privilege_transport > 0) {
                     recoverTime = ApplicationContextProvider.getConfigInt("CargoVIPTimeRecover", 28800);
                  } else {
                     recoverTime = ApplicationContextProvider.getConfigInt("CargoTimeRecover", 43200);
                  }

                  waterTransportDao.transportRecoverTime = DateUtil.getIntTime(System.currentTimeMillis()) + recoverTime;
               }

               for(int applyFriend : waterTransportDao.applySupports) {
                  GamePlayer gamePlayer = this.worldMgr.getOnlinePlayer(applyFriend);
                  if (gamePlayer != null) {
                     WaterTransportMsg.S2C_SupportApplyNotify_9544.Builder notifyMsg = WaterTransportMsg.S2C_SupportApplyNotify_9544.newBuilder();
                     notifyMsg.setFriendId(this.player.getPlayerId());
                     notifyMsg.setIsCancel(true);
                     gamePlayer.sendMsg(notifyMsg.build());
                  }
               }

               waterTransportDao.applySupports.clear();
               waterTransportDao.luckyShips.remove(shipData.getLuckyBuf());
               waterTransportDao.updateOp();
               this.randomLuckyShip();
               this.sendSupportInfo();
               this.checkTransportRecover();
               return 1;
            } else {
               return 4125;
            }
         }
      }
   }

   private void sendSupportInfo() {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      WaterTransportMsg.S2C_WaterTransportSupportInfo_9504.Builder resp = WaterTransportMsg.S2C_WaterTransportSupportInfo_9504.newBuilder();
      resp.setChoiceFriendId(waterTransportDao.guardId);
      resp.setNextGuardTime(DateUtil.getIntTime(waterTransportDao.nextGuardTime));
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      List<GamePlayer> friendGamePlayers = new ArrayList();

      for(Integer friendId : friendDao.friends) {
         GamePlayer friendGamePlayer = this.worldMgr.getOnlinePlayer(friendId);
         if (friendGamePlayer != null && friendGamePlayer.isSystemOpen(1991)) {
            friendGamePlayers.add(friendGamePlayer);
         }
      }

      int limitPower = ApplicationContextProvider.getConfigInt("CargoFriendRequest", 10000);
      Collections.sort(friendGamePlayers, ComparatorUtil.createReversedComparatorByMethod(GamePlayer.class, "getPlayerCombatPower"));
      boolean supportLimit = waterTransportDao.supports.size() >= ApplicationContextProvider.getConfigInt("cargoInviteFriendsTime", 3);
      resp.setSupportTimes(waterTransportDao.supports.size());

      for(GamePlayer friendGamePlayer : friendGamePlayers) {
         ArrayingMirror friendArrayingDao = friendGamePlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_WATER_TRANSPORT_SAIL);
         if (friendArrayingDao == null || friendArrayingDao.arrayingElementsMap.isEmpty()) {
            friendArrayingDao = friendGamePlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         }

         if (friendArrayingDao != null && !friendArrayingDao.arrayingElementsMap.isEmpty()) {
            WaterTransportMsg.FriendInfo.Builder friendInfo = WaterTransportMsg.FriendInfo.newBuilder();
            PlayerPublicDao friendPlayerDao = friendGamePlayer.getPublicDao();
            WaterTransportMsg.PlayerInfo.Builder playerInfo = WaterTransportMsg.PlayerInfo.newBuilder();
            playerInfo.setPlayerId(friendPlayerDao.playerId);
            playerInfo.setPlayerName(friendPlayerDao.playerName);
            playerInfo.setHead(friendPlayerDao.head);
            playerInfo.setLv(friendPlayerDao.lv);
            playerInfo.setHeadFrame(friendPlayerDao.headFrame);
            playerInfo.setVipLv(friendPlayerDao.vip_lv);
            playerInfo.setUnionId(friendPlayerDao.unionId);
            playerInfo.setServerId(friendPlayerDao.serverId);
            playerInfo.setIsShowVip(friendPlayerDao.isShowVip);
            friendInfo.setPlayerInfo(playerInfo);
            WaterTransportMsg.ArrayInfo.Builder arrayInfo = WaterTransportMsg.ArrayInfo.newBuilder();

            for(ArrayingEntity arrayingEntity : friendArrayingDao.arrayingElementsMap.values()) {
               if (arrayingEntity.entityType() == CommonMsg.CodeType.CODE_HERO) {
                  HeroArrayingEntity heroArrayingEntity = (HeroArrayingEntity)arrayingEntity;
                  WaterTransportMsg.HeroInfo.Builder heroInfo = WaterTransportMsg.HeroInfo.newBuilder();
                  if (heroArrayingEntity.mirror != null) {
                     heroInfo.setId(heroArrayingEntity.mirror.id);
                     heroInfo.setLv(heroArrayingEntity.mirror.lv);
                     heroInfo.setStar(heroArrayingEntity.mirror.star);
                     arrayInfo.addHeros(heroInfo);
                  }
               } else if (arrayingEntity.entityType() == CommonMsg.CodeType.CODE_FRIEND) {
                  FriendArrayingEntity friendArrayingEntity = (FriendArrayingEntity)arrayingEntity;
                  WaterTransportMsg.HeroInfo.Builder heroInfo = WaterTransportMsg.HeroInfo.newBuilder();
                  if (friendArrayingEntity.mirror != null) {
                     heroInfo.setId(friendArrayingEntity.mirror.id);
                     heroInfo.setLv(friendArrayingEntity.mirror.lv);
                     heroInfo.setStar(friendArrayingEntity.mirror.star);
                     arrayInfo.addHeros(heroInfo);
                  }
               }
            }

            arrayInfo.setCombatPower(friendArrayingDao.power);
            friendInfo.setArrayingInfo(arrayInfo);
            WaterTransportDao friendWaterTransportDao = (WaterTransportDao)friendGamePlayer.getData("tb_water_transport", friendGamePlayer.getPlayerId());
            boolean unChoice = (float)this.player.getMaxPlayerCombatPower() * ((float)limitPower / 10000.0F) < (float)friendGamePlayer.getMaxPlayerCombatPower();
            if (!unChoice) {
               if ("jp".equals(this.worldMgr.country)) {
                  unChoice = supportLimit || waterTransportDao.supports.contains(friendGamePlayer.getPlayerId());
               } else {
                  unChoice = friendWaterTransportDao.guardCount > 0;
               }
            }

            friendInfo.setUnChoice(unChoice);
            resp.addFriendInfos(friendInfo);
         }
      }

      this.player.sendMsg(resp.build());
   }

   private void updateRank(List<ResourceModel> rewardList, RankDefine.RankModule rankModule) {
      if (rewardList != null) {
         String[] robRankWeightArr = ApplicationContextProvider.getConfigString("robRankWeight", "10000|13").split("\\|");
         int point = 0;

         for(ResourceModel resourceModel : rewardList) {
            if (resourceModel.getType() == 2) {
               point = (int)((float)point + (float)resourceModel.getValue() * (Float.parseFloat(robRankWeightArr[0]) / 10000.0F));
            } else if (resourceModel.getType() == 1) {
               point = (int)((float)point + (float)resourceModel.getValue() * (Float.parseFloat(robRankWeightArr[1]) / 10000.0F));
            }
         }

         if (point > 0) {
            RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
            int finalPoint = point;
            rankMgr.pushTask(() -> {
               int curPoint = (int)rankMgr.getScore(rankModule, this.player.getPlayerId());
               rankMgr.updateRank(rankModule, (long)(finalPoint + curPoint), this.player.getPlayerId());
            });
         }
      }
   }

   private List<ResourceModel> salvageRewards(int shipModelId, int belongId) {
      List<ResourceModel> rewards = new ArrayList();
      CargoShipModel cargoShipModel = (CargoShipModel)ApplicationContextProvider.getModelPoolEntity("CargoShip", shipModelId);
      if (cargoShipModel == null) {
         this.player.failure(0);
         return rewards;
      } else {
         rewards.addAll(cargoShipModel.getSalvageRewards());
         return rewards;
      }
   }

   public void privilegeAddition() {
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.privilege_transport > 0) {
         int recoverTime = ApplicationContextProvider.getConfigInt("CargoTimeRecover", 43200);
         int vipRecoverTime = ApplicationContextProvider.getConfigInt("CargoVIPTimeRecover", 28800);
         List<Integer> maxCountList = this.configManager.getIntList("CargoMaxTime");
         int maxCount = (Integer)maxCountList.get(1);
         PropertyExtModel buffModel = this.waterTransportMgr.getBuff(306);
         if (buffModel != null) {
            maxCount += buffModel.cal(maxCount);
         }

         WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
         if (waterTransportDao.transportCount < maxCount) {
            if (waterTransportDao.transportCount == -1) {
               waterTransportDao.transportCount = ApplicationContextProvider.getConfigInt("CargoFirstTime", 1);
            }

            ++waterTransportDao.transportCount;
            this.checkTransportRecover();
            if (waterTransportDao.transportRecoverTime > 0) {
               int curTime = DateUtil.getIntTime(System.currentTimeMillis());
               waterTransportDao.transportRecoverTime = curTime + (waterTransportDao.transportRecoverTime - curTime) * vipRecoverTime / recoverTime;
            }

            waterTransportDao.updateOp();
         }
      }
   }

   private void addRecord(WaterTransportRecordDao waterTransportRecordDao) {
      List<WaterTransportRecordDao> waterTransportRecordDaoList = new ArrayList(this.getTransportRecords());
      waterTransportRecordDao.id = waterTransportRecordDaoList.isEmpty() ? 1 : ((WaterTransportRecordDao)waterTransportRecordDaoList.get(waterTransportRecordDaoList.size() - 1)).id + 1;
      this.player.insertDao(waterTransportRecordDao, false);
      waterTransportRecordDaoList.add(waterTransportRecordDao);
      this.sendRecord(waterTransportRecordDao);
      int needDelCount = waterTransportRecordDaoList.size() - 20;
      if (needDelCount > 0) {
         int curDel = 0;

         for(WaterTransportRecordDao record : waterTransportRecordDaoList) {
            this.player.deleteDao(record, false);
            ++curDel;
            if (curDel >= needDelCount) {
               break;
            }
         }
      }

   }

   private void sendSupportResult(int friendId, boolean isCancel) {
      WaterTransportMsg.S2C_AgreeSupport_9546.Builder resp = WaterTransportMsg.S2C_AgreeSupport_9546.newBuilder();
      resp.setFriendId(friendId);
      resp.setIsCancel(isCancel);
      this.player.sendMsg(resp.build());
   }

   public int getGoldShipType() {
      String goldenTime = ApplicationContextProvider.getConfigString("GoldenTime", "");
      if (StringUtils.isEmpty(goldenTime)) {
         return 0;
      } else {
         LocalDateTime localDateTime = LocalDateTime.now();
         int cWeek = localDateTime.getDayOfWeek().getValue();
         int cSecond = localDateTime.getHour() * 3600 + localDateTime.getMinute() * 60 + localDateTime.getSecond();
         String[] goldenTimeArr = goldenTime.split(",");

         for(int index = 0; index < goldenTimeArr.length; ++index) {
            String everyGoldenTime = goldenTimeArr[index];
            if (!StringUtils.isEmpty(everyGoldenTime)) {
               String[] everyGoldenTimeArr = everyGoldenTime.split("\\|");
               int cfgWeek = Integer.parseInt(everyGoldenTimeArr[0]);
               String[] cfgBetweenSecond = everyGoldenTimeArr[1].split("-");
               int startSecond = Integer.parseInt(cfgBetweenSecond[0]);
               int endSecond = Integer.parseInt(cfgBetweenSecond[1]);
               if (cfgWeek == cWeek && cSecond >= startSecond && cSecond <= endSecond) {
                  return index + 1;
               }
            }
         }

         return 0;
      }
   }

   public void levelUp(int preLv, int newLv) {
      if (this.player.isSystemOpen(1991)) {
         this.systemOpenInitLuckyShip();
      }
   }

   private List<ResourceModel> getCargoReward(int modelId, int level) {
      TreeMap<Integer, Map<Integer, List<ResourceModel>>> cargoLinkLvModelMap = new TreeMap(ApplicationContextProvider.getModelPoolMap("customCargoLinkLv"));
      if (cargoLinkLvModelMap.isEmpty()) {
         return new ArrayList();
      } else {
         int finalLevel = level;
         if (level < (Integer)cargoLinkLvModelMap.firstKey()) {
            finalLevel = (Integer)cargoLinkLvModelMap.firstKey();
         } else if (level > (Integer)cargoLinkLvModelMap.lastKey()) {
            finalLevel = (Integer)cargoLinkLvModelMap.lastKey();
         }

         Map<Integer, List<ResourceModel>> cargoLinkLvRewardMap = (Map)cargoLinkLvModelMap.get(finalLevel);
         if (cargoLinkLvRewardMap == null) {
            SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 1991);
            if (systemFunctionModel == null) {
               return new ArrayList();
            }

            cargoLinkLvRewardMap = (Map)cargoLinkLvModelMap.get(systemFunctionModel.getOpenLevel());
         }

         return (List<ResourceModel>)(cargoLinkLvRewardMap != null ? (List)MapUtil.getOrDefault(cargoLinkLvRewardMap, modelId, ArrayList.class) : new ArrayList());
      }
   }

   private boolean checkSalvageLimit() {
      List<ResourceModel> limitList = ResourceModel.buildResources(ApplicationContextProvider.getConfigString("cargoRuinLimit", ""));
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());

      for(ResourceModel resourceModel : waterTransportDao.salvageRes) {
         for(ResourceModel limitModel : limitList) {
            if (resourceModel.getId() == limitModel.getId() && resourceModel.getType() == limitModel.getType() && resourceModel.getValue() >= limitModel.getValue()) {
               return true;
            }
         }
      }

      return false;
   }

   private void recordSalvageLimit(ResourceModel resourceModel) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      boolean isExist = false;

      for(ResourceModel limitModel : waterTransportDao.salvageRes) {
         if (resourceModel.getId() == limitModel.getId() && resourceModel.getType() == limitModel.getType()) {
            limitModel.setValue(limitModel.getValue() + resourceModel.getValue());
            isExist = true;
         }
      }

      if (!isExist) {
         waterTransportDao.salvageRes.add(resourceModel.clone());
      }

      waterTransportDao.updateOp();
   }

   public void guanJiaOperate(int systemId, int sacrifice) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      WaterTransportDao waterTransportDao = (WaterTransportDao)this.player.getData("tb_water_transport", this.player.getPlayerId());
      if (waterTransportDao.sacrificeCount > 0) {
         guanJiaPart.checkState(systemId, (List)null);
      } else {
         CargoShipSacrificesModel cargoShipSacrificesModel = (CargoShipSacrificesModel)ApplicationContextProvider.getModelPoolEntity("CargoShipSacrifices", sacrifice);
         if (cargoShipSacrificesModel == null) {
            guanJiaPart.checkState(systemId, (List)null);
         } else {
            List<ResourceModel> addResourceModels = new ArrayList();
            List<ResourceModel> delResourceModels = new ArrayList();
            int maxCount = ApplicationContextProvider.getConfigInt("SacrificeTIme", 0);

            for(int i = 0; i < maxCount; ++i) {
               for(ResourceModel resourceModel : cargoShipSacrificesModel.getItems()) {
                  resourceModel.addResourceToList(addResourceModels);
               }

               for(ResourceModel resourceModel : cargoShipSacrificesModel.getSacrifices()) {
                  resourceModel.addResourceToList(delResourceModels);
               }
            }

            if (!this.player.checkResourceNum(delResourceModels)) {
               guanJiaPart.checkState(systemId, (List)null);
            } else {
               this.player.delResource((List)delResourceModels, 33, 3304, sacrifice, maxCount, "guanJia");
               this.player.addResource(addResourceModels, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 33, 3304, sacrifice, maxCount, "guanJia");
               waterTransportDao.sacrificeCount += maxCount;
               waterTransportDao.updateOp();

               for(int i = 0; i < maxCount; ++i) {
                  this.waterTransportMgr.pushTaskEx("waterTransportSacrifice", new Object[]{cargoShipSacrificesModel, this.player});
               }

               guanJiaPart.checkState(systemId, addResourceModels);
               WaterTransportMsg.S2C_WaterTransportSacrifice_9524.Builder resp = WaterTransportMsg.S2C_WaterTransportSacrifice_9524.newBuilder();
               resp.setSacrifice(sacrifice);
               resp.setSacrificeCount(waterTransportDao.sacrificeCount);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }
}
