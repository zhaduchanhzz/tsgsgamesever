package com.gzbz.gamePlayer.monarch;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.db.BugFeedbackDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.db.MonarchDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattleTempleMgr;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.BattleTempleModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.CityNameModel;
import com.gzbz.model.ConfigModel;
import com.gzbz.model.GeneralAvatarModel;
import com.gzbz.model.HeadFrameModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.MonarchImageModel;
import com.gzbz.model.PrestigeModel;
import com.gzbz.model.ProvinceNameModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BagMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.MonarchMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.util.NameFilter;
import com.gzbz.util.WordsFilter;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MonarchPart extends PlayerPart {
   private Logger logger = LoggerFactory.getLogger(MonarchPart.class);
   public static final int HEAD = 1;
   public static final int HEAD_FRAME = 2;
   public static final int MONARCH = 3;
   public static final int PRESTIGE = 4;
   public static final int TREND_HEAD = 6;
   public static final int USE_LIMIT_TYPE_1 = 1;
   @Autowired
   BattleTempleMgr battleTempleMgr;

   @MsgHandlerAnno
   public void getMonarchInfo(MonarchMsg.C2S_MonarchInfo_9001 msg, String channelId) {
      this.sendMonarchInfo();
   }

   public void sendMonarchInfo() {
      List<Integer> logList = new ArrayList();
      MonarchMsg.S2C_MonarchInfo_9002.Builder down = MonarchMsg.S2C_MonarchInfo_9002.newBuilder();
      Map<Integer, HeadFrameModel> headFrameModelMap = this.player.getGameModelPool().getMap("headframe");
      Map<Integer, PrestigeModel> prestigeModelMap = this.player.getGameModelPool().getMap("prestige");
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
      boolean monarchFlag = false;
      boolean playerFlag = false;
      Iterator<Map.Entry<Integer, Integer>> prestigeit = monarchDao.prestiges.entrySet().iterator();

      while(prestigeit.hasNext()) {
         Map.Entry<Integer, Integer> entry = (Map.Entry)prestigeit.next();
         if (!prestigeModelMap.containsKey(entry.getKey())) {
            this.logger.info("请求君主信息移除过期称号:" + entry.getKey());
            if (playerDao.prestige == (Integer)entry.getKey()) {
               playerDao.prestige = 0;
               playerFlag = true;
            }

            prestigeit.remove();
            monarchFlag = true;
         } else {
            PrestigeModel prestigeModel = (PrestigeModel)prestigeModelMap.get(entry.getKey());
            if (prestigeModel.getTime() > 0 && (Integer)entry.getValue() > 0) {
               int time = DateUtil.getIntTime(System.currentTimeMillis());
               if (time - (Integer)entry.getValue() > prestigeModel.getTime()) {
                  this.logger.info("请求君主信息移除过期称号:" + entry.getKey());
                  logList.add(entry.getKey());
                  if (playerDao.prestige == (Integer)entry.getKey()) {
                     playerDao.prestige = 0;
                     playerFlag = true;
                     this.player.notifyPlayerData(PlayerDefine.PLAYER_PRESTIGE, 0);
                  }

                  if (playerDao.secondTitle == (Integer)entry.getKey()) {
                     playerDao.secondTitle = 0;
                     playerFlag = true;
                     this.player.notifyPlayerData(PlayerDefine.PLAYER_SECOND_TITLE, 0);
                  }

                  prestigeit.remove();
                  monarchFlag = true;
               } else {
                  down.addPrestiges(this.packPrestige(playerDao, prestigeModelMap, entry, monarchDao));
               }
            } else {
               down.addPrestiges(this.packPrestige(playerDao, prestigeModelMap, entry, monarchDao));
            }
         }
      }

      Iterator<Map.Entry<Integer, Integer>> it = monarchDao.headFrames.entrySet().iterator();

      while(it.hasNext()) {
         Map.Entry<Integer, Integer> entry = (Map.Entry)it.next();
         if (!headFrameModelMap.containsKey(entry.getKey())) {
            this.logger.info("请求君主信息移除过期头像框:" + entry.getKey());
            if (playerDao.headFrame == (Integer)entry.getKey()) {
               playerDao.headFrame = 30001;
               playerFlag = true;
               this.player.notifyPlayerData(PlayerDefine.PLAYER_HEADFRAME, 30001);
            }

            it.remove();
            monarchFlag = true;
         } else {
            HeadFrameModel headFrameModel = (HeadFrameModel)headFrameModelMap.get(entry.getKey());
            if (headFrameModel.getTime() > 0 && (Integer)entry.getValue() > 0) {
               int time = DateUtil.getIntTime(System.currentTimeMillis());
               if (time - (Integer)entry.getValue() > headFrameModel.getTime()) {
                  this.logger.info("请求君主信息移除过期头像框:" + entry.getKey());
                  if (playerDao.headFrame == (Integer)entry.getKey()) {
                     playerDao.headFrame = 0;
                     playerFlag = true;
                  }

                  it.remove();
                  monarchFlag = true;
               } else {
                  down.addHeadFrames(this.packHeadFrame(playerDao, headFrameModelMap, entry));
               }
            } else {
               down.addHeadFrames(this.packHeadFrame(playerDao, headFrameModelMap, entry));
            }
         }
      }

      down.addAllHeads(monarchDao.heads);
      down.addAllTrendHeads(monarchDao.trendHead);

      for(Map.Entry<Integer, Boolean> entry : monarchDao.showTrendHead.entrySet()) {
         if ((Boolean)entry.getValue() && monarchDao.heads.contains(entry.getKey())) {
            down.addShowTrendHead((Integer)entry.getKey());
         }
      }

      if (monarchFlag) {
         monarchDao.updateOp();
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_TITLE);
      }

      if (playerFlag) {
         playerDao.updateOp();
      }

      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int alterNum = (Integer)playerResetCustomCache.getForeverNum(341, 0);
      down.setAlterName(alterNum);
      down.addAllSkinIds(monarchDao.monarchs);
      this.player.sendMsg(down.build());
      if (!logList.isEmpty()) {
         for(Integer id : logList) {
            this.addDelPrestigeLog(id);
         }
      }

   }

   public List<Integer> getSkinIds() {
      List<Integer> list = new ArrayList();
      Map<Integer, MonarchImageModel> monarchImageModelMap = this.player.getGameModelPool().getMap("MonarchImage");

      for(MonarchImageModel v : monarchImageModelMap.values()) {
         if (v.getUseType() == 2 && this.player.checkResourceNum(v.getItemType(), v.getItemID(), v.getCombineNum()) && this.player.checkResourceNum(v.getItemType1(), v.getItemid1(), v.getCombineNum2())) {
            list.add(v.getId());
         }
      }

      return list;
   }

   public void addItemMonarch() {
      List<Integer> list = this.getSkinIds();
      MonarchMsg.S2C_NotifyHead_9020.Builder builder = MonarchMsg.S2C_NotifyHead_9020.newBuilder();
      if (!list.isEmpty()) {
         MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());

         for(int i = 0; i < list.size(); ++i) {
            if (!monarchDao.monarchs.contains(list.get(i))) {
               monarchDao.monarchs.add(list.get(i));
               builder.addId((Integer)list.get(i));
            } else {
               MonarchImageModel monarchImageModelMap = (MonarchImageModel)this.player.getGameModelPool().getEntity("MonarchImage", list.get(i));
               if (monarchImageModelMap != null && !monarchImageModelMap.getConvert().isEmpty()) {
                  this.player.addResource((Integer)monarchImageModelMap.getConvert().get(0), (Integer)monarchImageModelMap.getConvert().get(1), (Integer)monarchImageModelMap.getConvert().get(2), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 7, 716, 0, 0, "");
               }
            }
         }

         monarchDao.updateOp();
         builder.setType(3);
         if (!builder.getIdList().isEmpty()) {
            this.player.sendMsg(builder.build());
         }
      }

      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      List<Integer> headList = new ArrayList();
      Map<Integer, GeneralAvatarModel> generalAvatarModelMap = this.player.getGameModelPool().getMap("GeneralAvatar");

      for(GeneralAvatarModel model : generalAvatarModelMap.values()) {
         MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
         if (model.getUnlockCondition1() != null && !model.getUnlockCondition1().equals("")) {
            String[] condition = model.getUnlockCondition1().split("\\|");
            int conditionType = Integer.parseInt(condition[0]);
            int conditionId = Integer.parseInt(condition[1]);
            int conditionVal = Integer.parseInt(condition[2]);
            if (this.player.checkResourceNum(conditionType, conditionId, conditionVal)) {
               if (!monarchDao.heads.contains(model.getId())) {
                  if (conditionType == 3) {
                     List<HeroDao> heroList = heroBagPart.findHeroById(conditionId);
                     heroList.removeIf((heroDao) -> heroDao.invalidTime > 0);
                     if (heroList.isEmpty()) {
                        continue;
                     }
                  }

                  headList.add(model.getId());
               } else if (!model.getConvert().isEmpty()) {
                  this.player.addResource((Integer)model.getConvert().get(0), (Integer)model.getConvert().get(1), (Integer)model.getConvert().get(2), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 7, 717, 0, 0, "");
               }
            }
         }
      }

      if (!headList.isEmpty()) {
         MonarchMsg.S2C_NotifyHead_9020.Builder headBuilder = MonarchMsg.S2C_NotifyHead_9020.newBuilder();
         MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());

         for(Integer headId : headList) {
            monarchDao.heads.add(headId);
            headBuilder.addId(headId);
         }

         monarchDao.updateOp();
         if (!headBuilder.getIdList().isEmpty()) {
            builder.setType(1);
            this.player.sendMsg(builder.build());
         }
      }

   }

   public void addHeroMonarch(List<Integer> heroList) {
      boolean flag = false;
      Map<Integer, MonarchImageModel> monarchImageModelMap = this.player.getGameModelPool().getMap("MonarchImage");
      Map<Integer, GeneralAvatarModel> generalAvatarModelMap = this.player.getGameModelPool().getMap("GeneralAvatar");
      MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
      MonarchMsg.S2C_NotifyHead_9020.Builder builder = MonarchMsg.S2C_NotifyHead_9020.newBuilder();

      for(Integer heroId : heroList) {
         if (!monarchDao.monarchs.contains(heroId) && monarchImageModelMap.containsKey(heroId)) {
            monarchDao.monarchs.add(heroId);
            builder.addId(heroId);
            flag = true;
         }
      }

      if (!builder.getIdList().isEmpty()) {
         builder.setType(3);
         this.player.sendMsg(builder.build());
      }

      MonarchMsg.S2C_NotifyHead_9020.Builder headBuilder = MonarchMsg.S2C_NotifyHead_9020.newBuilder();

      for(Integer heroId : heroList) {
         if (!monarchDao.heads.contains(heroId) && generalAvatarModelMap.containsKey(heroId)) {
            monarchDao.heads.add(heroId);
            headBuilder.addId(heroId);
            flag = true;
         }
      }

      if (!headBuilder.getIdList().isEmpty()) {
         headBuilder.setType(1);
         this.player.sendMsg(headBuilder.build());
      }

      if (flag) {
         monarchDao.updateOp();
      }

   }

   @MsgHandlerAnno
   public void C2S_ActivationMonarch_9012(MonarchMsg.C2S_ActivationMonarch_9012 msg, String channelId) {
      MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
      if (msg.getType() == 4) {
         if (monarchDao.prestiges.containsKey(msg.getId())) {
            PrestigeModel prestigeModel = (PrestigeModel)this.player.getGameModelPool().getEntity("prestige", msg.getId());
            if (prestigeModel != null && prestigeModel.getTime() > 0 && (Integer)monarchDao.prestiges.get(msg.getId()) <= 0) {
               monarchDao.prestiges.put(msg.getId(), DateUtil.getIntTime(System.currentTimeMillis()));
               monarchDao.updateOp();
            }
         }
      } else if (msg.getType() == 2 && monarchDao.headFrames.containsKey(msg.getId())) {
         HeadFrameModel headFrameModel = (HeadFrameModel)this.player.getGameModelPool().getEntity("headframe", msg.getId());
         if (headFrameModel != null && headFrameModel.getTime() > 0 && (Integer)monarchDao.headFrames.get(msg.getId()) <= 0) {
            monarchDao.headFrames.put(msg.getId(), DateUtil.getIntTime(System.currentTimeMillis()));
            monarchDao.updateOp();
         }
      }

      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_TITLE);
      MonarchMsg.S2C_ActivationMonarch_9013.Builder builder = MonarchMsg.S2C_ActivationMonarch_9013.newBuilder();
      builder.setId(msg.getId());
      builder.setType(msg.getType());
      builder.setTime(DateUtil.getIntTime(System.currentTimeMillis()));
      builder.setResult(1);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void changeMonarch(MonarchMsg.C2S_MonarchChangeInfo_9003 msg, String channelId) {
      MonarchMsg.S2C_MonarchChangeInfo_9004.Builder down = MonarchMsg.S2C_MonarchChangeInfo_9004.newBuilder();
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
      if (msg.getChangeType() == 1) {
         if (msg.getChangeId() != 1 && msg.getChangeId() != 2) {
            if (msg.getChangeId() != 3 && msg.getChangeId() != 4) {
               if (!monarchDao.heads.contains(msg.getChangeId())) {
                  this.player.failure(27002);
                  return;
               }
            } else {
               GeneralAvatarModel generalAvatarModel = (GeneralAvatarModel)this.player.getGameModelPool().getEntity("GeneralAvatar", msg.getChangeId());
               String[] condition = generalAvatarModel.getUnlockCondition1().split("\\|");
               if (!this.player.checkResourceNum(Integer.parseInt(condition[0]), Integer.parseInt(condition[1]), Integer.parseInt(condition[2]))) {
                  this.player.failure(27002);
                  return;
               }
            }
         }

         down.setOldId(playerDao.head);
         GeneralAvatarModel generalAvatarModel = this.getHeadModel(msg.getChangeId());
         if (generalAvatarModel != null) {
            if (monarchDao.trendHead.contains(generalAvatarModel.getTrendsId()) && (Boolean)monarchDao.showTrendHead.getOrDefault(generalAvatarModel.getId(), true)) {
               playerDao.head = generalAvatarModel.getTrendsId();
            } else {
               playerDao.head = msg.getChangeId();
            }
         } else {
            playerDao.head = msg.getChangeId();
         }

         this.player.notifyPlayerData(PlayerDefine.PLAYER_HEAD, playerDao.head);
         this.player.getOperationMgr().changeHeadOldLog(this.player);
         this.player.getOperationMgr().addExtraLog(this.player, 192, playerDao.head + "", playerDao.headFrame + "", playerDao.sex + "");
      } else if (msg.getChangeType() == 2) {
         if (msg.getChangeId() != 30001) {
            Map<Integer, HeadFrameModel> headFrameModelMap = this.player.getGameModelPool().getMap("headframe");
            if (!headFrameModelMap.containsKey(msg.getChangeId())) {
               this.player.failure(27000);
               return;
            }

            if (!monarchDao.headFrames.containsKey(msg.getChangeId())) {
               this.player.failure(27000);
               return;
            }

            down.setOldId(playerDao.headFrame);
            playerDao.headFrame = msg.getChangeId();
            if ((Integer)monarchDao.headFrames.get(msg.getChangeId()) <= 0 && ((HeadFrameModel)headFrameModelMap.get(msg.getChangeId())).getTime() > 0) {
               monarchDao.headFrames.put(msg.getChangeId(), DateUtil.getIntTime(System.currentTimeMillis()));
            }
         }

         down.setOldId(playerDao.headFrame);
         playerDao.headFrame = msg.getChangeId();
         this.player.notifyPlayerData(PlayerDefine.PLAYER_HEADFRAME, msg.getChangeId());
         this.player.getOperationMgr().changeHeadOldLog(this.player);
         this.player.getOperationMgr().addExtraLog(this.player, 192, playerDao.head + "", playerDao.headFrame + "", playerDao.sex + "");
      } else if (msg.getChangeType() == 3) {
         if (!monarchDao.monarchs.contains(msg.getChangeId())) {
            this.player.failure(27002);
            return;
         }

         down.setOldId(playerDao.monarchId);
         playerDao.monarchId = msg.getChangeId();
         this.player.notifyPlayerData(PlayerDefine.PLAYER_MONARCHID, msg.getChangeId());
      } else {
         Map<Integer, PrestigeModel> prestigeModelMap = this.player.getGameModelPool().getMap("prestige");
         if (!prestigeModelMap.containsKey(msg.getChangeId())) {
            this.player.failure(27001);
            return;
         }

         int prestige = playerDao.prestige;
         if (!monarchDao.prestiges.containsKey(msg.getChangeId())) {
            this.player.failure(27001);
            return;
         }

         down.setOldId(playerDao.prestige);
         playerDao.prestige = msg.getChangeId();
         this.player.notifyPlayerData(PlayerDefine.PLAYER_PRESTIGE, msg.getChangeId());
         if (playerDao.secondTitle == msg.getChangeId()) {
            playerDao.secondTitle = prestige;
            this.player.notifyPlayerData(PlayerDefine.PLAYER_SECOND_TITLE, playerDao.secondTitle);
         }

         if ((Integer)monarchDao.prestiges.get(msg.getChangeId()) <= 0 && ((PrestigeModel)prestigeModelMap.get(msg.getChangeId())).getTime() > 0) {
            monarchDao.prestiges.put(msg.getChangeId(), DateUtil.getIntTime(System.currentTimeMillis()));
         }
      }

      playerDao.updateOp();
      down.setIdx(msg.getChangeId());
      down.setChangeType(msg.getChangeType());
      this.player.sendMsg(down.build());
      this.player.uploadCrossPlayer();
   }

   public void loginHandle() {
      Map<Integer, BattleTempleModel> templeModelMap = this.player.getGameModelPool().getMap("battleTemple");
      Set<Integer> templeList = new HashSet();

      for(BattleTempleModel value : templeModelMap.values()) {
         templeList.add(value.getTitleId());
      }

      Map<Integer, HeadFrameModel> headFrameModelMap = this.player.getGameModelPool().getMap("headframe");
      Map<Integer, PrestigeModel> prestigeModelMap = this.player.getGameModelPool().getMap("prestige");
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
      boolean monarchFlag = false;
      boolean playerFlag = false;
      List<Integer> updatePrestiges = new ArrayList();
      List<Integer> updateHeadFrame = new ArrayList();
      List<Integer> logList = new ArrayList();
      Iterator<Map.Entry<Integer, Integer>> prestigeit = monarchDao.prestiges.entrySet().iterator();

      while(prestigeit.hasNext()) {
         Map.Entry<Integer, Integer> entry = (Map.Entry)prestigeit.next();
         if (!prestigeModelMap.containsKey(entry.getKey())) {
            logList.add(entry.getKey());
            this.logger.info("登陆移除过期称号:" + entry.getKey());
            if (playerDao.prestige == (Integer)entry.getKey()) {
               playerDao.prestige = 0;
               playerFlag = true;
               this.player.notifyPlayerData(PlayerDefine.PLAYER_PRESTIGE, 0);
            }

            if (playerDao.secondTitle == (Integer)entry.getKey()) {
               playerDao.secondTitle = 0;
               playerFlag = true;
               this.player.notifyPlayerData(PlayerDefine.PLAYER_SECOND_TITLE, 0);
            }

            monarchFlag = true;
            prestigeit.remove();
         } else {
            if (templeList.contains(entry.getKey()) && !this.battleTempleMgr.checkExist(this.player, (Integer)entry.getKey())) {
               this.logger.info("登陆移除战神殿称号:" + entry.getKey());
               if (playerDao.prestige == (Integer)entry.getKey()) {
                  playerDao.prestige = 0;
                  playerFlag = true;
                  this.player.notifyPlayerData(PlayerDefine.PLAYER_PRESTIGE, 0);
               }

               if (playerDao.secondTitle == (Integer)entry.getKey()) {
                  playerDao.secondTitle = 0;
                  playerFlag = true;
                  this.player.notifyPlayerData(PlayerDefine.PLAYER_SECOND_TITLE, 0);
               }

               prestigeit.remove();
               monarchFlag = true;
            }

            PrestigeModel prestigeModel = (PrestigeModel)prestigeModelMap.get(entry.getKey());
            if (prestigeModel.getTime() > 0 && (Integer)entry.getValue() > 0) {
               int time = DateUtil.getIntTime(System.currentTimeMillis());
               if (time - (Integer)entry.getValue() > prestigeModel.getTime()) {
                  this.logger.info("登陆移除过期称号:" + entry.getKey());
                  if (playerDao.prestige == (Integer)entry.getKey()) {
                     playerDao.prestige = 0;
                     playerFlag = true;
                     this.player.notifyPlayerData(PlayerDefine.PLAYER_PRESTIGE, 0);
                  }

                  if (playerDao.secondTitle == (Integer)entry.getKey()) {
                     playerDao.secondTitle = 0;
                     playerFlag = true;
                     this.player.notifyPlayerData(PlayerDefine.PLAYER_SECOND_TITLE, 0);
                  }

                  monarchFlag = true;
                  logList.add(entry.getKey());
                  prestigeit.remove();
               }
            } else if (prestigeModel.getTime() > 0 && (Integer)entry.getValue() <= 0) {
               updatePrestiges.add(entry.getKey());
            }
         }
      }

      Iterator<Map.Entry<Integer, Integer>> it = monarchDao.headFrames.entrySet().iterator();

      while(it.hasNext()) {
         Map.Entry<Integer, Integer> entry = (Map.Entry)it.next();
         if (!headFrameModelMap.containsKey(entry.getKey())) {
            this.logger.info("登陆移除过期头像框:" + entry.getKey());
            if (playerDao.headFrame == (Integer)entry.getKey()) {
               playerDao.headFrame = 30001;
               playerFlag = true;
               this.player.notifyPlayerData(PlayerDefine.PLAYER_HEADFRAME, 30001);
            }

            monarchFlag = true;
            it.remove();
         } else {
            HeadFrameModel headFrameModel = (HeadFrameModel)headFrameModelMap.get(entry.getKey());
            if (headFrameModel.getTime() > 0 && (Integer)entry.getValue() > 0) {
               int time = DateUtil.getIntTime(System.currentTimeMillis());
               if (time - (Integer)entry.getValue() > headFrameModel.getTime()) {
                  this.logger.info("登陆移除过期头像框:" + entry.getKey());
                  if (playerDao.headFrame == (Integer)entry.getKey()) {
                     playerDao.headFrame = 30001;
                     playerFlag = true;
                     this.player.notifyPlayerData(PlayerDefine.PLAYER_HEADFRAME, 30001);
                  }

                  monarchFlag = true;
                  it.remove();
               }
            } else if (headFrameModel.getTime() > 0 && (Integer)entry.getValue() <= 0) {
               updateHeadFrame.add(entry.getKey());
            }
         }
      }

      for(Integer prestigeId : updatePrestiges) {
         monarchDao.prestiges.put(prestigeId, DateUtil.getIntTime(System.currentTimeMillis()));
         monarchFlag = true;
      }

      for(Integer headFrameId : updateHeadFrame) {
         monarchDao.headFrames.put(headFrameId, DateUtil.getIntTime(System.currentTimeMillis()));
         monarchFlag = true;
      }

      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      int monarchId = configManager.getInt("DefaultHeroMonarchImage");
      if (!monarchDao.monarchs.contains(monarchId)) {
         monarchDao.monarchs.add(monarchId);
         monarchFlag = true;
      }

      if (monarchFlag) {
         monarchDao.updateOp();
      }

      if (playerFlag) {
         playerDao.updateOp();
      }

      if (!logList.isEmpty()) {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_TITLE);

         for(Integer id : logList) {
            this.addDelPrestigeLog(id);
         }
      }

      this.player.sendOldSystemOpen();
   }

   @TaskMethod
   public void newUpdateMonarchType(int idx, int monarchType, int getType) {
      PlayerDao playerDao = this.player.getPlayerDao();
      playerDao.templeDefeatTime = 0L;
      playerDao.updateOp();
      this.updateMonarchTitle(idx, monarchType, getType);
   }

   public void updateMonarchTitle(int idx, int monarchType, int getType) {
      this.logger.info("获得称号/头像框：" + idx + "------" + monarchType);
      MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
      MonarchMsg.S2C_MonarchAcquire_9006.Builder down = MonarchMsg.S2C_MonarchAcquire_9006.newBuilder();
      MonarchMsg.MonarchItem.Builder monarch = MonarchMsg.MonarchItem.newBuilder();
      monarch.setIfUse(false);
      monarch.setAgingTime(0);
      if (monarchType == 2) {
         HeadFrameModel headFrameModel = (HeadFrameModel)this.player.getGameModelPool().getEntity("headframe", idx);
         if (headFrameModel != null) {
            if (monarchDao.headFrames.containsKey(idx) && !headFrameModel.getConvert().isEmpty()) {
               this.player.addResource((Integer)headFrameModel.getConvert().get(0), (Integer)headFrameModel.getConvert().get(1), (Integer)headFrameModel.getConvert().get(2), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 7, 713, 0, 0, "");
            }

            if (headFrameModel.getTime() > 0) {
               monarchDao.headFrames.put(idx, DateUtil.getIntTime(System.currentTimeMillis()));
            } else {
               monarchDao.headFrames.put(idx, -1);
            }

            monarch.setAgingTime(headFrameModel.getTime());
         }
      } else {
         if (monarchType != 4) {
            return;
         }

         PrestigeModel prestigeModel = (PrestigeModel)this.player.getGameModelPool().getEntity("prestige", idx);
         if (prestigeModel != null) {
            if (monarchDao.prestiges.containsKey(idx) && !prestigeModel.getConvert().isEmpty()) {
               this.player.addResource((Integer)prestigeModel.getConvert().get(0), (Integer)prestigeModel.getConvert().get(1), (Integer)prestigeModel.getConvert().get(2), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 7, 714, 0, 0, "");
            }

            if (prestigeModel.getTime() > 0) {
               monarchDao.prestiges.put(idx, DateUtil.getIntTime(System.currentTimeMillis()));
            } else {
               monarchDao.prestiges.put(idx, -1);
            }

            monarch.setAgingTime(prestigeModel.getTime());
            monarch.setPrestigeLv(0);
            if (monarchDao.prestigeLv.containsKey(idx)) {
               monarch.setPrestigeLv((Integer)monarchDao.prestigeLv.get(idx));
            }
         }
      }

      monarchDao.updateOp();
      monarch.setIdx(idx);
      monarch.setAcquireTime(DateUtil.getIntTime(System.currentTimeMillis()));
      down.setIdx(idx);
      down.setType(monarchType);
      down.setItem(monarch);
      if (getType != 1) {
         this.player.sendMsg(down.build());
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_TITLE);
      }

   }

   @TaskMethod
   public void delMonarchTitle(int idx, int monarchType) {
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
      boolean flag = false;
      if (monarchType == 2) {
         if (!monarchDao.headFrames.containsKey(idx)) {
            return;
         }

         monarchDao.headFrames.remove(idx);
         if (playerDao.headFrame == idx) {
            playerDao.headFrame = 30001;
            flag = true;
            this.player.notifyPlayerData(PlayerDefine.PLAYER_HEADFRAME, 30001);
         }
      } else {
         if (monarchType != 4) {
            return;
         }

         if (!monarchDao.prestiges.containsKey(idx)) {
            return;
         }

         monarchDao.prestiges.remove(idx);
         if (playerDao.prestige == idx) {
            playerDao.prestige = 0;
            flag = true;
            this.player.notifyPlayerData(PlayerDefine.PLAYER_PRESTIGE, 0);
         }

         if (playerDao.secondTitle == idx) {
            playerDao.secondTitle = 0;
            flag = true;
            this.player.notifyPlayerData(PlayerDefine.PLAYER_SECOND_TITLE, 0);
         }
      }

      monarchDao.updateOp();
      if (flag) {
         playerDao.updateOp();
      }

      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_TITLE);
      BattleMsg.S2C_BattleTemple_6122.Builder delTitle = BattleMsg.S2C_BattleTemple_6122.newBuilder();
      delTitle.setId(idx);
      this.player.sendMsg(delTitle.build());
      if (monarchType == 4) {
         this.addDelPrestigeLog(idx);
      }

   }

   public void addDelPrestigeLog(int id) {
      String name = "-";
      PrestigeModel model = (PrestigeModel)this.player.getGameModelPool().getEntity("prestige", id);
      if (model != null) {
         name = model.getName();
      }

      this.player.getOperationMgr().addExtraLog(this.player, 211, name);
      if (model != null && model.getTipMail() == 1) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = this.player.getGameModelPool().getMap("customCentreAward");
         if (centreAwardModelMap.isEmpty() || !centreAwardModelMap.containsKey(CentreAwardModel.TYPE_PRESTIGE_TIME_OUT_CONTENT)) {
            return;
         }

         CentreAwardModel rewardModel = (CentreAwardModel)((TreeMap)centreAwardModelMap.get(CentreAwardModel.TYPE_PRESTIGE_TIME_OUT_CONTENT)).firstEntry().getValue();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         String content = MessageFormat.format(rewardModel.getDesc(), name);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), content, rewardModel.getItems(), 604800000L, 23, 2302);
      }

   }

   public MonarchMsg.MonarchItem.Builder packHeadFrame(PlayerDao playerDao, Map<Integer, HeadFrameModel> headFrameModelMap, Map.Entry<Integer, Integer> entry) {
      MonarchMsg.MonarchItem.Builder headFrame = MonarchMsg.MonarchItem.newBuilder();
      headFrame.setIdx((Integer)entry.getKey());
      headFrame.setAcquireTime((Integer)entry.getValue());
      if (playerDao.headFrame == (Integer)entry.getKey()) {
         headFrame.setIfUse(true);
      } else {
         headFrame.setIfUse(false);
      }

      headFrame.setAgingTime(((HeadFrameModel)headFrameModelMap.get(entry.getKey())).getTime());
      return headFrame;
   }

   public MonarchMsg.MonarchItem.Builder packPrestige(PlayerDao playerDao, Map<Integer, PrestigeModel> prestigeModelMap, Map.Entry<Integer, Integer> entry, MonarchDao monarchDao) {
      MonarchMsg.MonarchItem.Builder prestige = MonarchMsg.MonarchItem.newBuilder();
      prestige.setIdx((Integer)entry.getKey());
      prestige.setAcquireTime((Integer)entry.getValue());
      if (playerDao.prestige != (Integer)entry.getKey() && playerDao.secondTitle != (Integer)entry.getKey()) {
         prestige.setIfUse(false);
      } else {
         prestige.setIfUse(true);
      }

      prestige.setAgingTime(((PrestigeModel)prestigeModelMap.get(entry.getKey())).getTime());
      prestige.setPrestigeLv(0);
      if (monarchDao.prestigeLv.containsKey(entry.getKey())) {
         prestige.setPrestigeLv((Integer)monarchDao.prestigeLv.get(entry.getKey()));
      }

      if (monarchDao.customPrestiges.containsKey(entry.getKey())) {
         prestige.setName((String)monarchDao.customPrestiges.get(entry.getKey()));
      }

      return prestige;
   }

   @MsgHandlerAnno
   public void alterPlayerName(MonarchMsg.C2S_AlterRoleName_9007 msg, String channelId) {
      String playerName = msg.getRoleName();
      playerName = playerName.trim();
      if (this.player.checkPlayerNameLength(playerName)) {
         if (NameFilter.hasBadWords(playerName)) {
            this.player.failure(13004);
         } else {
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            worldMgr.pushTaskEx("changeName", new Object[]{this.player, playerName});
         }
      }
   }

   @TaskMethod
   public void changeName(String tmp) {
      PlayerDao playerDao = this.player.getPlayerDao();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int alterNum = (Integer)playerResetCustomCache.getForeverNum(341, 0);
      if (alterNum > 0) {
         ConfigModel configModelItem = (ConfigModel)this.player.getGameModelPool().getEntity("config", "ChangeNameItem");
         if (null == configModelItem) {
            return;
         }

         String[] resourceItem = configModelItem.getValue().split("\\|");
         if (!this.player.checkResourceNum(Integer.parseInt(resourceItem[0]), Integer.parseInt(resourceItem[1]), Integer.parseInt(resourceItem[2]))) {
            ConfigModel configModel = (ConfigModel)this.player.getGameModelPool().getEntity("config", "ChangeName");
            if (configModel != null) {
               String[] resource = configModel.getValue().split("\\|");
               if (!this.player.checkResourceNum(Integer.parseInt(resource[0]), Integer.parseInt(resource[1]), Integer.parseInt(resource[2]))) {
                  this.logger.info("金币不够");
                  this.player.failure(31);
                  return;
               }

               this.player.delResource(Integer.parseInt(resource[0]), Integer.parseInt(resource[1]), (long)Integer.parseInt(resource[2]), 13, 1304, 0, 0, "");
            }
         } else {
            this.player.delResource(Integer.parseInt(resourceItem[0]), Integer.parseInt(resourceItem[1]), (long)Integer.parseInt(resourceItem[2]), 13, 1304, 0, 0, "");
         }
      }

      playerDao.playerName = tmp;
      playerDao.updateOp();
      playerResetCustomCache.addForever(341, 1);
      MonarchMsg.S2C_AlterRoleName_9008.Builder down = MonarchMsg.S2C_AlterRoleName_9008.newBuilder();
      down.setAlterNameNum(alterNum);
      this.player.sendMsg(down.build());
      this.player.notifyPlayerData(PlayerDefine.PLAYER_NAME, tmp);
      this.player.uploadCrossPlayer();
      if (playerDao.unionId > 0) {
         UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
         UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerDao.unionId);
         if (unionMgr != null) {
            if (unionMgr.getUnion().leaderId == this.player.getPlayerId()) {
               unionMgrParent.pushTaskEx("sendUnion", new Object[]{playerDao.unionId, null});
            }
         }
      }
   }

   @MsgHandlerAnno
   public void alterProvince(MonarchMsg.C2S_AlterProvince_9009 msg, String channelId) {
      int provinceId = msg.getProvinceId();
      int cityId = msg.getCityId();
      ProvinceNameModel provinceNameModel = (ProvinceNameModel)ApplicationContextProvider.getModelPoolEntity("provinceName", provinceId);
      if (provinceNameModel == null) {
         this.player.failure(76043);
      } else {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         Map<Integer, ProvinceNameModel> modelMap = (Map)ApplicationContextProvider.getModelPoolEntity("custom_province_name_server_type", worldMgr.country);
         if (!modelMap.containsKey(provinceId)) {
            this.player.failure(76043);
         } else {
            CityNameModel cityNameModel = (CityNameModel)ApplicationContextProvider.getModelPoolEntity("cityName", cityId);
            if ((cityNameModel == null || cityNameModel.getProvinceId() != provinceId) && !worldMgr.country.equals("kr")) {
               this.player.failure(76044);
            } else {
               this.player.setIpProvince(provinceId, cityId);
               this.player.notifyPlayerData(PlayerDefine.PLAYER_PROVINCE_ID, provinceId);
               this.player.notifyPlayerData(PlayerDefine.PLAYER_CITY_ID, cityId);
               this.player.uploadCrossPlayer();
            }
         }
      }
   }

   @MsgHandlerAnno
   public void bugFeedback(MonarchMsg.C2S_BugFeedback_9011 msg, String channelId) {
      String title = msg.getTitle();
      String message = msg.getMessage();
      message = message.trim();
      if (!"".equals(message) && message.length() >= 5) {
         BugFeedbackDao bugFeedbackDao = new BugFeedbackDao();
         bugFeedbackDao.playerId = this.player.getPlayerId();
         PlayerDao playerDao = this.player.getPlayerDao();
         bugFeedbackDao.playerName = playerDao.playerName;
         bugFeedbackDao.serverId = playerDao.serverId;
         bugFeedbackDao.title = title;
         bugFeedbackDao.message = message;
         bugFeedbackDao.insertOp();
         this.player.insertDao(bugFeedbackDao);
      }
   }

   public List<PropertyModel> getPrestigePro() {
      List<PropertyModel> list = new ArrayList();
      MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());

      for(Map.Entry<Integer, Integer> entry : monarchDao.prestiges.entrySet()) {
         PrestigeModel prestigeModel = (PrestigeModel)this.player.getGameModelPool().getEntity("prestige", entry.getKey());
         if (prestigeModel != null && (prestigeModel.getTime() <= 0 || (Integer)entry.getValue() > 0)) {
            for(PropertyModel model : prestigeModel.getAddPro()) {
               if (monarchDao.prestigeLv.containsKey(entry.getKey())) {
                  list.add(new PropertyModel(model.getType(), model.getWay(), model.getValue() * (long)((Integer)monarchDao.prestigeLv.get(entry.getKey()) + 1)));
               } else {
                  list.add(new PropertyModel(model.getType(), model.getWay(), model.getValue()));
               }
            }
         }
      }

      for(Map.Entry<Integer, Integer> entry : monarchDao.headFrames.entrySet()) {
         HeadFrameModel headFrameModel = (HeadFrameModel)this.player.getGameModelPool().getEntity("headframe", entry.getKey());
         if (headFrameModel != null && (headFrameModel.getTime() <= 0 || (Integer)entry.getValue() > 0)) {
            list.addAll(headFrameModel.getAddPro());
         }
      }

      return list;
   }

   public void addTrendsHead(int id) {
      Map<Integer, GeneralAvatarModel> map = this.player.getGameModelPool().getMap("GeneralAvatar");

      for(GeneralAvatarModel value : map.values()) {
         if (value.getTrendsCondition1() != null && !value.getTrendsCondition1().equals("")) {
            String[] condition = value.getTrendsCondition1().split("\\|");
            if (Integer.parseInt(condition[1]) == id) {
               Boolean flag = false;
               MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
               if (!monarchDao.heads.contains(value.getId())) {
                  monarchDao.heads.add(value.getId());
                  flag = true;
                  MonarchMsg.S2C_NotifyHead_9020.Builder builder = MonarchMsg.S2C_NotifyHead_9020.newBuilder();
                  builder.addId(value.getId());
                  builder.setType(1);
                  this.player.sendMsg(builder.build());
               }

               if (!monarchDao.trendHead.contains(value.getTrendsId())) {
                  monarchDao.trendHead.add(value.getTrendsId());
                  flag = true;
                  MonarchMsg.S2C_NotifyHead_9020.Builder builder = MonarchMsg.S2C_NotifyHead_9020.newBuilder();
                  builder.addId(value.getTrendsId());
                  builder.setType(6);
                  this.player.sendMsg(builder.build());
                  PlayerDao playerDao = this.player.getPlayerDao();
                  if (playerDao.head == value.getId()) {
                     playerDao.head = value.getTrendsId();
                     playerDao.updateOp();
                     this.player.notifyPlayerData(PlayerDefine.PLAYER_HEAD, playerDao.head);
                  }

                  if (!monarchDao.showTrendHead.containsKey(value.getId())) {
                     flag = true;
                     monarchDao.showTrendHead.put(value.getId(), true);
                  }
               }

               if (flag) {
                  monarchDao.updateOp();
               }

               this.notifyTreandsHead(monarchDao);
               break;
            }
         }
      }

   }

   public void addMonarch(int subclass, int id) {
      if (subclass == 20) {
         this.updateMonarchTitle(id, 2, 0);
      } else if (subclass == 19) {
         this.updateMonarchTitle(id, 4, 0);
      } else if (subclass == 21) {
         Map<Integer, GeneralAvatarModel> map = this.player.getGameModelPool().getMap("GeneralAvatar");

         for(GeneralAvatarModel value : map.values()) {
            if (value.getUnlockType() == 3 && value.getUnlockCondition1() != null && !value.getUnlockCondition1().equals("")) {
               String[] condition = value.getUnlockCondition1().split("\\|");
               if (Integer.parseInt(condition[1]) == id) {
                  MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
                  if (!monarchDao.heads.contains(value.getId())) {
                     monarchDao.heads.add(value.getId());
                     monarchDao.updateOp();
                     MonarchMsg.S2C_NotifyHead_9020.Builder builder = MonarchMsg.S2C_NotifyHead_9020.newBuilder();
                     builder.addId(value.getId());
                     builder.setType(1);
                     this.player.sendMsg(builder.build());
                  } else if (!value.getConvert().isEmpty()) {
                     this.player.addResource((Integer)value.getConvert().get(0), (Integer)value.getConvert().get(1), (Integer)value.getConvert().get(2), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 7, 717, 0, 0, "");
                  }
                  break;
               }
            }
         }
      } else if (subclass == 22) {
         Map<Integer, MonarchImageModel> map = this.player.getGameModelPool().getMap("MonarchImage");

         for(MonarchImageModel value : map.values()) {
            if (value.getUseType() == 3) {
               MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
               if (value.getItemID() == id) {
                  if (!monarchDao.monarchs.contains(value.getId())) {
                     monarchDao.monarchs.add(value.getId());
                     monarchDao.updateOp();
                     MonarchMsg.S2C_NotifyHead_9020.Builder builder = MonarchMsg.S2C_NotifyHead_9020.newBuilder();
                     builder.addId(value.getId());
                     builder.setType(3);
                     this.player.sendMsg(builder.build());
                  } else if (!value.getConvert().isEmpty()) {
                     this.player.addResource((Integer)value.getConvert().get(0), (Integer)value.getConvert().get(1), (Integer)value.getConvert().get(2), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 7, 716, 0, 0, "");
                  }
                  break;
               }
            }
         }
      }

   }

   @MsgHandlerAnno
   public void C2S_UnderDressPrestige_9014(MonarchMsg.C2S_UnderDressPrestige_9014 msg, String channelId) {
      PlayerDao playerDao = this.player.getPlayerDao();
      playerDao.prestige = 0;
      playerDao.updateOp();
      this.player.notifyPlayerData(PlayerDefine.PLAYER_PRESTIGE, 0);
      MonarchMsg.S2C_UnderDressPrestige_9015.Builder builder = MonarchMsg.S2C_UnderDressPrestige_9015.newBuilder();
      builder.setResult(1);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_WearSecondTitle_9016(MonarchMsg.C2S_WearSecondTitle_9016 msg, String channelId) {
      MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
      PlayerDao playerDao = this.player.getPlayerDao();
      int secondTitle = playerDao.secondTitle;
      Map<Integer, PrestigeModel> prestigeModelMap = this.player.getGameModelPool().getMap("prestige");
      if (!prestigeModelMap.containsKey(msg.getId())) {
         this.player.failure(27001);
      } else if (monarchDao.prestiges.containsKey(msg.getId())) {
         playerDao.secondTitle = msg.getId();
         this.player.notifyPlayerData(PlayerDefine.PLAYER_SECOND_TITLE, msg.getId());
         if ((Integer)monarchDao.prestiges.get(msg.getId()) <= 0 && ((PrestigeModel)prestigeModelMap.get(msg.getId())).getTime() > 0) {
            monarchDao.prestiges.put(msg.getId(), DateUtil.getIntTime(System.currentTimeMillis()));
         }

         if (playerDao.prestige == msg.getId()) {
            playerDao.prestige = secondTitle;
            this.player.notifyPlayerData(PlayerDefine.PLAYER_PRESTIGE, playerDao.prestige);
         }

         playerDao.updateOp();
         MonarchMsg.S2C_WearSecondTitle_9017.Builder builder = MonarchMsg.S2C_WearSecondTitle_9017.newBuilder();
         builder.setResult(1);
         this.player.sendMsg(builder.build());
      } else {
         this.player.failure(27001);
      }
   }

   @MsgHandlerAnno
   public void C2S_UnderDressSecondTitle_9018(MonarchMsg.C2S_UnderDressSecondTitle_9018 msg, String channelId) {
      PlayerDao playerDao = this.player.getPlayerDao();
      playerDao.secondTitle = 0;
      playerDao.updateOp();
      this.player.notifyPlayerData(PlayerDefine.PLAYER_SECOND_TITLE, 0);
      MonarchMsg.S2C_UnderDressSecondTitle_9019.Builder builder = MonarchMsg.S2C_UnderDressSecondTitle_9019.newBuilder();
      builder.setResult(1);
      this.player.sendMsg(builder.build());
   }

   public void gmOp(int id) {
      MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
      Map<Integer, MonarchImageModel> map = this.player.getGameModelPool().getMap("MonarchImage");
      if (map.containsKey(id)) {
         monarchDao.monarchs.add(id);
         monarchDao.updateOp();
      }

      if (id == -1) {
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         playerExtend.tempPlayerLv = -1;
         this.player.updatePlayerExtend(13);
      }

   }

   @TaskMethod
   public void mergeServerDelPrestige(int id) {
      MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
      if (monarchDao.prestiges.containsKey(id)) {
         monarchDao.prestiges.remove(id);
         monarchDao.updateOp();
         PlayerDao playerDao = this.player.getPlayerDao();
         if (playerDao.secondTitle == id) {
            playerDao.secondTitle = 0;
            playerDao.updateOp();
         } else if (playerDao.prestige == id) {
            playerDao.prestige = 0;
            playerDao.updateOp();
         }

         String name = "-";
         PrestigeModel model = (PrestigeModel)this.player.getGameModelPool().getEntity("prestige", id);
         if (model != null) {
            name = model.getName();
         }

         this.player.getOperationMgr().addExtraLog(this.player, 211, name);
         if (model != null) {
            Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = this.player.getGameModelPool().getMap("customCentreAward");
            if (centreAwardModelMap.isEmpty() || !centreAwardModelMap.containsKey(CentreAwardModel.TYPE_PRESTIGE_TIME_OUT_CONTENT)) {
               return;
            }

            CentreAwardModel rewardModel = (CentreAwardModel)((TreeMap)centreAwardModelMap.get(CentreAwardModel.TYPE_PRESTIGE_TIME_OUT_CONTENT)).firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            String content = MessageFormat.format(rewardModel.getDesc(), name);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), content, rewardModel.getItems(), 604800000L, 23, 2302);
         }
      }

   }

   public void setPlayerHead(int headId) {
      PlayerPublicDao playerPublicDao = this.player.getPublicDao();
      playerPublicDao.head = headId;
      playerPublicDao.updateOp();
      this.player.notifyPlayerData(PlayerDefine.PLAYER_HEAD, playerPublicDao.head);
      this.player.getOperationMgr().changeHeadOldLog(this.player);
      this.player.getOperationMgr().addExtraLog(this.player, 192, playerPublicDao.head + "", playerPublicDao.headFrame + "", playerPublicDao.sex + "");
      this.player.uploadCrossPlayer();
   }

   @MsgHandlerAnno
   public void C2S_NativeHead_9023(MonarchMsg.C2S_NativeHead_9023 msg, String source) {
      int headId = msg.getTimeStamp();
      this.setPlayerHead(headId);
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      playerExtend.custom_face_state = DateUtil.getIntTime(System.currentTimeMillis());
      this.player.updatePlayerExtend(13);
      this.player.notifyPlayerData(PlayerDefine.CUSTOM_FACE_STATE, playerExtend.custom_face_state);
      MonarchMsg.S2C_NativeHead_9024.Builder builder = MonarchMsg.S2C_NativeHead_9024.newBuilder();
      builder.setTimeStamp(headId);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_PrestigeUpLv_9025(MonarchMsg.C2S_PrestigeUpLv_9025 msg, String channelId) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.itemBag.getItemByCode(msg.getItemCode());
      if (itemBase == null) {
         this.logger.info("itemCode={}", msg.getItemCode());
      } else {
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
         if (itemModel != null) {
            PrestigeModel prestigeModel = (PrestigeModel)this.player.getGameModelPool().getEntity("prestige", itemModel.getUseFuncId());
            if (prestigeModel != null && !prestigeModel.getConvert().isEmpty()) {
               MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
               if (monarchDao.prestiges.containsKey(prestigeModel.getId())) {
                  if (!monarchDao.prestigeLv.containsKey(prestigeModel.getId()) || (Integer)monarchDao.prestigeLv.get(prestigeModel.getId()) < prestigeModel.getStarLimit()) {
                     if ((Integer)prestigeModel.getConvert().get(1) == itemBase.id) {
                        if (monarchDao.prestigeLv.containsKey(prestigeModel.getId())) {
                           int lv = (Integer)monarchDao.prestigeLv.get(prestigeModel.getId()) + 1;
                           monarchDao.prestigeLv.put(prestigeModel.getId(), lv);
                        } else {
                           monarchDao.prestigeLv.put(prestigeModel.getId(), 1);
                        }

                        monarchDao.updateOp();
                        ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                        itemBagPart.deleteItemByCode(msg.getItemCode(), 1, 7, 715, 0, 0, "");
                        this.player.senditemUpdateMsg();
                        MonarchMsg.S2C_PrestigeUpLv_9026.Builder builder = MonarchMsg.S2C_PrestigeUpLv_9026.newBuilder();
                        MonarchMsg.MonarchItem.Builder prestige = MonarchMsg.MonarchItem.newBuilder();
                        prestige.setIdx(prestigeModel.getId());
                        prestige.setAcquireTime((Integer)monarchDao.prestiges.get(prestigeModel.getId()));
                        if (this.player.getPlayerDao().prestige != prestigeModel.getId() && this.player.getPlayerDao().secondTitle != prestigeModel.getId()) {
                           prestige.setIfUse(false);
                        } else {
                           prestige.setIfUse(true);
                        }

                        prestige.setAgingTime(prestigeModel.getTime());
                        prestige.setPrestigeLv((Integer)monarchDao.prestigeLv.get(prestigeModel.getId()));
                        builder.setPrestige(prestige);
                        this.player.sendMsg(builder.build());
                        HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                        heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_TITLE);
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_CustomPrestige_3037(BagMsg.C2S_CustomPrestige_3037 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.getItemByCode(msg.getCode());
      if (itemBase == null) {
         return this.player.failure(2);
      } else if (itemBase.getNum() <= 0) {
         return this.player.failure(6);
      } else {
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
         if (itemModel == null) {
            return this.player.failure(5);
         } else {
            if (itemModel.getUseFuncType() == 35) {
               PrestigeModel prestigeModel = (PrestigeModel)this.player.getGameModelPool().getEntity("prestige", itemModel.getUseFuncId());
               if (prestigeModel == null) {
                  return this.player.failure(37);
               }

               int checkName = this.checkName(msg.getPrestige());
               if (checkName != 3) {
                  if (checkName == 1) {
                     return this.player.failure(0);
                  }

                  return this.player.failure(40);
               }

               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               itemBagPart.deleteItemByCode(msg.getCode(), 1, 2, 201, 0, 0, "");
               this.player.senditemUpdateMsg();
               this.player.addResource(2, itemModel.getUseFuncId(), 1, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 2, 201, 0, 0, "");
               MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
               if (monarchDao.prestiges.containsKey(prestigeModel.getId())) {
                  monarchDao.customPrestiges.put(prestigeModel.getId(), msg.getPrestige());
                  monarchDao.updateOp();
               }

               BagMsg.S2C_CustomPrestigeChanged_3038.Builder resp = BagMsg.S2C_CustomPrestigeChanged_3038.newBuilder();
               resp.setItemId(itemModel.getId());
               resp.setPrestige(msg.getPrestige());
               this.player.sendMsg(resp.build());
            }

            return true;
         }
      }
   }

   private int checkName(String name) {
      if (name.length() > 4) {
         return 1;
      } else {
         StringBuilder badWordBuilder = WordsFilter.getBadWords(name, true);
         return badWordBuilder.length() != 0 ? 2 : 3;
      }
   }

   public List<CommonMsg.MapDataIS> getCustomPrestiges() {
      PlayerDao playerDao = this.player.getPlayerDao();
      List<CommonMsg.MapDataIS> customPrestiges = new ArrayList();
      MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
      if (monarchDao.customPrestiges.containsKey(playerDao.prestige)) {
         CommonMsg.MapDataIS.Builder map = CommonMsg.MapDataIS.newBuilder();
         map.setKey(playerDao.prestige);
         map.setValue((String)monarchDao.customPrestiges.get(playerDao.prestige));
         customPrestiges.add(map.build());
      }

      if (monarchDao.customPrestiges.containsKey(playerDao.secondTitle)) {
         CommonMsg.MapDataIS.Builder map = CommonMsg.MapDataIS.newBuilder();
         map.setKey(playerDao.secondTitle);
         map.setValue((String)monarchDao.customPrestiges.get(playerDao.secondTitle));
         customPrestiges.add(map.build());
      }

      return customPrestiges;
   }

   @MsgHandlerAnno
   public void C2S_HideTrendHead_9027(MonarchMsg.C2S_HideTrendHead_9027 msg, String source) {
      MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
      if (monarchDao.heads.contains(msg.getHeadId())) {
         monarchDao.showTrendHead.put(msg.getHeadId(), msg.getHideTrendHead());
         monarchDao.updateOp();
         this.notifyTreandsHead(monarchDao);
         PlayerDao playerDao = this.player.getPlayerDao();
         GeneralAvatarModel model = this.getHeadModel(playerDao.head);
         if (model != null) {
            if (!msg.getHideTrendHead()) {
               if (playerDao.head == model.getTrendsId() && msg.getHeadId() == model.getId()) {
                  playerDao.head = model.getId();
                  playerDao.updateOp();
                  this.player.notifyPlayerData(PlayerDefine.PLAYER_HEAD, playerDao.head);
                  this.player.uploadCrossPlayer();
               }
            } else if (msg.getHeadId() == playerDao.head && monarchDao.trendHead.contains(model.getTrendsId())) {
               playerDao.head = model.getTrendsId();
               playerDao.updateOp();
               this.player.notifyPlayerData(PlayerDefine.PLAYER_HEAD, playerDao.head);
               this.player.uploadCrossPlayer();
            }

         }
      }
   }

   public void notifyTreandsHead(MonarchDao monarchDao) {
      MonarchMsg.S2C_HideTrendHead_9028.Builder builder = MonarchMsg.S2C_HideTrendHead_9028.newBuilder();

      for(Map.Entry<Integer, Boolean> entry : monarchDao.showTrendHead.entrySet()) {
         if ((Boolean)entry.getValue() && monarchDao.heads.contains(entry.getKey())) {
            builder.addShowTrendHead((Integer)entry.getKey());
         }
      }

      this.player.sendMsg(builder.build());
   }

   public GeneralAvatarModel getHeadModel(int headId) {
      Map<Integer, GeneralAvatarModel> modelMap = this.player.getGameModelPool().getMap("GeneralAvatar");

      for(GeneralAvatarModel model : modelMap.values()) {
         if (model.getId() == headId || model.getTrendsId() == headId) {
            return model;
         }
      }

      return null;
   }
}
