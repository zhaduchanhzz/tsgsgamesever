package com.gzbz.gamePlayer.tongque;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.CooperateDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.TongqueTerraceDao;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gift.GiftPart;
import com.gzbz.log.PlayerLogPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.TongQueSkillModel;
import com.gzbz.model.TongQueUpLevelModel;
import com.gzbz.model.TongqueChongxingModel;
import com.gzbz.model.TongqueTerraceModel;
import com.gzbz.model.VipModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.TongqueTerraceMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
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
public class TongqueTerracePart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(TongqueTerracePart.class);
   @Autowired
   ConfigManager configManager;
   @Autowired
   WorldMgr worldMgr;

   @MsgHandlerAnno
   public void C2S_UnlockInfo_9801(TongqueTerraceMsg.C2S_UnlockInfo_9801 msg, String source) {
      TongqueTerraceMsg.S2C_UnlockInfoResult_9802.Builder builder = TongqueTerraceMsg.S2C_UnlockInfoResult_9802.newBuilder();
      Map<Integer, TongqueTerraceDao> map = this.player.getGameModelPool().getMap("tb_tongque_terrace");
      if (map == null) {
         this.logger.info("没有美人信息");
      } else {
         for(Map.Entry<Integer, TongqueTerraceDao> entry : map.entrySet()) {
            TongqueTerraceMsg.UnlockInfo.Builder unlockBuilder = TongqueTerraceMsg.UnlockInfo.newBuilder();
            unlockBuilder.setId(((TongqueTerraceDao)entry.getValue()).beautyId);
            unlockBuilder.setState(((TongqueTerraceDao)entry.getValue()).state);
            unlockBuilder.setUnlockStep(((TongqueTerraceDao)entry.getValue()).unlockStep);
            builder.addInfos(unlockBuilder);
         }

         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_OpenUi_9803(TongqueTerraceMsg.C2S_OpenUi_9803 msg, String source) {
      Map<Integer, CooperateDao> map = this.player.<Integer, CooperateDao>getMap("tb_cooperate", this.player.getPlayerId());

      for(Map.Entry<Integer, CooperateDao> entry : map.entrySet()) {
         CooperateDao cooperateDao = (CooperateDao)entry.getValue();
         HashSet<Integer> tmpSet = new HashSet();

         for(int i = 0; i < cooperateDao.cooperateBeauty.size(); ++i) {
            Integer beautyId = (Integer)cooperateDao.cooperateBeauty.get(i);
            if (beautyId != 0) {
               if (tmpSet.contains(beautyId)) {
                  cooperateDao.cooperateBeauty.set(i, 0);
                  this.logger.warn("玩家 {} 同心策数据修正，因有重复美人，同心策类型 {}，美人ID {}", new Object[]{this.player.getPlayerId(), entry.getKey(), beautyId});
                  cooperateDao.updateOp();
               } else {
                  tmpSet.add(beautyId);
               }
            }
         }
      }

      this.openMainUi();
   }

   public void openMainUi() {
      TongqueTerraceMsg.S2C_OpenUiResult_9804.Builder builder = TongqueTerraceMsg.S2C_OpenUiResult_9804.newBuilder();
      Map<Integer, TongqueTerraceDao> map = this.player.<Integer, TongqueTerraceDao>getMap("tb_tongque_terrace", this.player.getPlayerId());

      for(Map.Entry<Integer, TongqueTerraceDao> entry : map.entrySet()) {
         TongqueTerraceMsg.BeautyInfo.Builder infoBuilder = TongqueTerraceMsg.BeautyInfo.newBuilder();
         infoBuilder.setId(((TongqueTerraceDao)entry.getValue()).beautyId);
         infoBuilder.setState(((TongqueTerraceDao)entry.getValue()).state);
         infoBuilder.setUnlockStep(((TongqueTerraceDao)entry.getValue()).unlockStep);
         infoBuilder.setTrystLv(((TongqueTerraceDao)entry.getValue()).trystLv);
         infoBuilder.setTrystExp(((TongqueTerraceDao)entry.getValue()).trystExp);
         infoBuilder.setBestowNum(((TongqueTerraceDao)entry.getValue()).bestowNum);
         infoBuilder.setSkillId(((TongqueTerraceDao)entry.getValue()).skillId);
         infoBuilder.setPatronizeLv(((TongqueTerraceDao)entry.getValue()).patronizeLv);

         for(PropertyModel lvPro : this.getTrystProperties((TongqueTerraceDao)entry.getValue())) {
            infoBuilder.addTrystPropertys(lvPro.builder());
         }

         for(PropertyModel bestowProperty : this.getBestowProperties(((TongqueTerraceDao)entry.getValue()).beautyId, ((TongqueTerraceDao)entry.getValue()).bestowNum)) {
            infoBuilder.addBestowPropertys(bestowProperty.builder());
         }

         for(PropertyModel patronizePro : this.getPatronizePros((TongqueTerraceDao)entry.getValue())) {
            infoBuilder.addPatronizeProperty(patronizePro.builder());
         }

         infoBuilder.setBeautyGrade(((TongqueTerraceDao)entry.getValue()).beautyGrade);
         if (((TongqueTerraceDao)entry.getValue()).cooperateType == 1) {
            infoBuilder.setType(TongqueTerraceMsg.CooperateType.COOPERATE_HEAVEN);
         } else if (((TongqueTerraceDao)entry.getValue()).cooperateType == 2) {
            infoBuilder.setType(TongqueTerraceMsg.CooperateType.COOPERATE_EARTH);
         } else if (((TongqueTerraceDao)entry.getValue()).cooperateType == 3) {
            infoBuilder.setType(TongqueTerraceMsg.CooperateType.COOPERATE_PERSON);
         } else {
            infoBuilder.setType(TongqueTerraceMsg.CooperateType.COOPERATE_NONE);
         }

         TongQueSkillModel skillModel = (TongQueSkillModel)this.player.getGameModelPool().getEntity("TongQueSkill", ((TongqueTerraceDao)entry.getValue()).skillId);
         if (skillModel != null) {
            infoBuilder.setAssistantSkill(skillModel.getAssistantSkill());
         } else {
            infoBuilder.setAssistantSkill(((TongqueTerraceDao)entry.getValue()).skillId);
         }

         builder.addInfos(infoBuilder);
      }

      builder.setDownTime(this.getDownTime() / 1000);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_FreeTryst_9805(TongqueTerraceMsg.C2S_FreeTryst_9805 msg, String source) {
   }

   @MsgHandlerAnno
   public void C2S_TrystBeauty_9807(TongqueTerraceMsg.C2S_TrystBeauty_9807 msg, String source) {
      TongqueTerraceDao dao = this.getTongqueTerraceDao(msg.getBeautyId());
      if (dao != null) {
         int tongqueMaxTrystLv = this.configManager.getIntDefault("tongqueMaxTrystLv", 70);
         if (dao.trystLv >= tongqueMaxTrystLv) {
            this.logger.info("达到最大幽会等级了");
            this.player.failure(26);
         } else {
            TongQueUpLevelModel model = this.getTongQueUpLevelModel(dao.beautyId, dao.trystLv);
            if (model == null) {
               this.logger.info("升级模板未空，ID={}", dao.trystLv);
            } else if (!this.player.checkResourceNum(model.getCosts())) {
               this.logger.info("升级物品不足");
            } else {
               this.player.delResource((List)model.getCosts(), 35, 3504, 0, 0, "");
               int addExp = model.calExp();
               int realAddExp = this.incTrystExp(dao, addExp);
               List<PropertyModel> addPros = new ArrayList();

               for(PropertyModel att : model.getAtts()) {
                  PropertyModel propertyModel = new PropertyModel(att.getType(), att.getWay(), (long)((int)((float)att.getValue() / 10000.0F * (float)realAddExp)));
                  addPros.add(propertyModel);
               }

               dao.updateOp();
               PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
               playerLogPart.logTongQue(dao.beautyId, realAddExp, 35, 3504, 0, 0, "tryst_item");
               TongqueTerraceMsg.S2C_TrystBeautyResult_9808.Builder builder = TongqueTerraceMsg.S2C_TrystBeautyResult_9808.newBuilder();
               builder.setBeautyId(msg.getBeautyId());
               TongqueTerraceMsg.TrystExpInfo.Builder expInfoBuilder = TongqueTerraceMsg.TrystExpInfo.newBuilder();
               expInfoBuilder.setId(msg.getBeautyId());
               expInfoBuilder.setAddExp(realAddExp);

               for(PropertyModel addPro : addPros) {
                  expInfoBuilder.addProtities(addPro.builder());
               }

               builder.setExpInfos(expInfoBuilder);
               TongqueTerraceMsg.BeautyTrystInfo.Builder beautyInfoBuilder = TongqueTerraceMsg.BeautyTrystInfo.newBuilder();
               beautyInfoBuilder.setBeatuyId(msg.getBeautyId());
               beautyInfoBuilder.setTrystLv(dao.trystLv);
               beautyInfoBuilder.setTrystExp(dao.trystExp);

               for(PropertyModel lvPro : this.getTrystProperties(dao)) {
                  beautyInfoBuilder.addTrystPropertys(lvPro.builder());
               }

               builder.setTrystInfos(beautyInfoBuilder);
               this.player.sendMsg(builder.build());
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               this.flushTongqueProperties();
               heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_TONGQUE);
               this.player.triggerTask(518, 0, 1L, 1);
               this.player.triggerTask(346, 0, (long)dao.trystLv, 0);
               GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
               giftPart.triggerTimeLimitGift(11, dao.trystLv);
               String[] rewardsInfo = LogOperationMgr.toRewardsInfo(model.getCosts());
               this.player.getOperationMgr().addExtraLog(this.player, 172, dao.beautyId + "", rewardsInfo[0], rewardsInfo[1], rewardsInfo[2], dao.trystExp + "", dao.trystLv + "");
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_BestowBeauty_9811(TongqueTerraceMsg.C2S_BestowBeauty_9811 msg, String source) {
      TongqueTerraceModel model = (TongqueTerraceModel)this.player.getGameModelPool().getEntity("TongQueBase", msg.getBeautyId());
      if (model == null) {
         this.logger.info("美人模板为空，ID={}", msg.getBeautyId());
      } else {
         TongqueTerraceDao dao = this.getTongqueTerraceDao(msg.getBeautyId());
         if (dao == null) {
            this.logger.info("美人不存，ID={}", msg.getBeautyId());
         } else if (dao.state != 2) {
            this.logger.info("美人未开放，state={}", dao.state);
         } else if (dao.bestowNum + msg.getNum() > model.getBestowTimes()) {
            this.logger.info("赏赐次数已经达到最大等级，Num={},赏赐次数={}", dao.bestowNum, msg.getNum());
         } else {
            List<ResourceModel> needList = new ArrayList();

            for(ResourceModel resourceModel : model.getBestowConsume()) {
               ResourceModel newResourceModel = new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * msg.getNum());
               needList.add(newResourceModel);
            }

            if (!this.player.checkResourceNum(needList)) {
               this.logger.info("赏赐材料不够");
            } else {
               this.player.delResource((List)needList, 35, 3505, 0, 0, "");
               dao.bestowNum += msg.getNum();
               dao.updateOp();
               TongqueTerraceModel tongqueTerraceModel = (TongqueTerraceModel)this.player.getGameModelPool().getEntity("TongQueBase", dao.beautyId);
               if (tongqueTerraceModel != null && !StringUtils.isEmpty(tongqueTerraceModel.getUnlockCondition())) {
                  String[] unlock = tongqueTerraceModel.getUnlockCondition().split("\\|");
                  if (unlock.length >= 2 && dao.bestowNum >= Integer.valueOf(unlock[1])) {
                     this.unlockBeauty(Integer.valueOf(unlock[0]));
                  }
               }

               PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
               playerLogPart.logTongQue(dao.beautyId, msg.getNum(), 35, 3505, dao.bestowNum, 0, "bestow");
               TongqueTerraceMsg.S2C_BestowBeautyResult_9812.Builder builder = TongqueTerraceMsg.S2C_BestowBeautyResult_9812.newBuilder();
               builder.setBeautyId(msg.getBeautyId());
               builder.setNum(dao.bestowNum);

               for(PropertyModel bestowProperty : this.getBestowProperties(msg.getBeautyId(), msg.getNum())) {
                  builder.addAddBestowPropertys(bestowProperty.builder());
               }

               this.player.sendMsg(builder.build());
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               this.flushTongqueProperties();
               heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_TONGQUE);
               this.player.getOperationMgr().addExtraLog(this.player, 173, dao.beautyId + "", msg.getNum() + "", dao.bestowNum + "");
               this.player.triggerTask(538, 0, (long)msg.getNum(), 1);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SkillUpBeauty_9813(TongqueTerraceMsg.C2S_SkillUpBeauty_9813 msg, String source) {
      TongqueTerraceDao dao = this.getTongqueTerraceDao(msg.getBeautyId());
      if (dao == null) {
         this.logger.info("美人不存，ID={}", msg.getBeautyId());
      } else if (dao.state != 2) {
         this.logger.info("美人未开放，state={}", dao.state);
      } else {
         TongQueSkillModel model = (TongQueSkillModel)this.player.getGameModelPool().getEntity("TongQueSkill", dao.skillId);
         if (model.getNextSkill() <= 0) {
            this.logger.info("等级已经达到最大，skillId={}", dao.skillId);
         } else if (!this.player.checkResourceNum(model.getCosts())) {
            this.logger.info("升级物品不足，skillId={}", dao.skillId);
         } else if (model.getLvLimit() > dao.trystLv) {
            this.logger.info("幽会等级没有达到,需要等级={}，幽会等级={}", model.getLvLimit(), dao.trystLv);
         } else {
            int oldSkillId = dao.skillId;
            this.player.delResource((List)model.getCosts(), 35, 3503, 0, 0, "");
            dao.skillId = model.getNextSkill();
            dao.updateOp();
            PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
            playerLogPart.logTongQue(dao.beautyId, dao.skillId, 35, 3503, oldSkillId, 0, "skillup");
            TongqueTerraceMsg.S2C_SkillUpBeautyResult_9814.Builder builder = TongqueTerraceMsg.S2C_SkillUpBeautyResult_9814.newBuilder();
            builder.setBeautyId(msg.getBeautyId());
            builder.setSkillId(dao.skillId);
            TongQueSkillModel skillModel = (TongQueSkillModel)this.player.getGameModelPool().getEntity("TongQueSkill", dao.skillId);
            if (skillModel != null) {
               builder.setAssistantSkill(skillModel.getAssistantSkill());
            } else {
               builder.setAssistantSkill(dao.skillId);
            }

            this.player.sendMsg(builder.build());
            this.player.triggerTask(374, 0, 1L, 1);
            String[] rewardsInfo = LogOperationMgr.toRewardsInfo(model.getCosts());
            this.player.getOperationMgr().addExtraLog(this.player, 174, dao.beautyId + "", rewardsInfo[0], rewardsInfo[1], rewardsInfo[2], dao.trystLv + "");
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_PatronizeBeauty_9815(TongqueTerraceMsg.C2S_PatronizeBeauty_9815 msg, String source) {
      TongqueTerraceDao dao = this.getTongqueTerraceDao(msg.getBeautyId());
      if (dao == null) {
         this.logger.info("美人不存，ID={}", msg.getBeautyId());
      } else if (dao.state != 2) {
         this.logger.info("美人未开放，state={}", dao.state);
      } else {
         int tongqueMaxPatronizeLv = this.configManager.getIntDefault("tongqueMaxPatronizeLv", 72);
         if (dao.patronizeLv >= tongqueMaxPatronizeLv) {
            this.logger.info("宠幸等级已经达到最大等级，LV={},", dao.patronizeLv);
         } else {
            TongqueChongxingModel model = (TongqueChongxingModel)this.player.getGameModelPool().getEntity("TongQueChongXing", dao.patronizeLv + 1);
            if (model == null) {
               this.logger.info("美人宠幸模板为空，ID={}", dao.patronizeLv);
            } else if (dao.trystLv < model.getLvLimit()) {
               this.logger.info("美人幽会等级达不到宠幸等级要求，ID={},幽会等级={}，需要等级={}", new Object[]{dao.patronizeLv, dao.trystLv, model.getLvLimit()});
            } else if (!this.player.checkResourceNum(model.getConsts())) {
               this.logger.info("升级物品不够");
            } else {
               this.player.delResource((List)model.getConsts(), 35, 3502, 0, 0, "");
               ++dao.patronizeLv;
               dao.updateOp();
               PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
               playerLogPart.logTongQue(dao.beautyId, dao.patronizeLv, 35, 3502, 0, 0, "patronize");
               TongqueTerraceMsg.S2C_PatronizeBeautyResult_9816.Builder builder = TongqueTerraceMsg.S2C_PatronizeBeautyResult_9816.newBuilder();
               builder.setBeautyId(msg.getBeautyId());
               builder.setPatronizeLv(dao.patronizeLv);

               for(PropertyModel patronizePro : model.getStrong()) {
                  builder.addAddPatronizeProperty(patronizePro.builder());
               }

               this.player.sendMsg(builder.build());
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               this.flushTongqueProperties();
               heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_TONGQUE);
               this.player.triggerTask(373, 0, 1L, 1);
               String[] rewardsInfo = LogOperationMgr.toRewardsInfo(model.getConsts());
               this.player.getOperationMgr().addExtraLog(this.player, 175, dao.beautyId + "", rewardsInfo[0], rewardsInfo[1], rewardsInfo[2], dao.trystLv + "");
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ResetBeauty_9842(TongqueTerraceMsg.C2S_ResetBeauty_9842 msg, String source) {
      String tongQueResetCost = ApplicationContextProvider.getConfigString("TongQueResetCost", "1|9|100");
      String tongQueResetOpen = ApplicationContextProvider.getConfigString("TongQueResetOpen", "80");
      int openLevel = Integer.parseInt(tongQueResetOpen);
      ResourceModel resource = ResourceModel.buildResource(tongQueResetCost);
      TongqueTerraceDao dao = this.getTongqueTerraceDao(msg.getBeautyId());
      if (dao != null && dao.state == 2 && this.player.checkResourceNum(resource) && this.player.getPlayerDao().lv >= openLevel && dao.cooperateType == 0) {
         TongQueUpLevelModel model = this.getTongQueUpLevelModel(dao.beautyId, dao.trystLv);
         if (model != null) {
            ArrayList<ResourceModel> returnItems = new ArrayList();
            ResourceModel.addResourceToListPlus(returnItems, model.getReturnItems());
            List<ResourceModel> excessItems = new ArrayList();

            for(ResourceModel cost : model.getCosts()) {
               int value = Math.round((float)dao.trystExp * 1.0F / (float)model.getExpRandomHigher() * (float)cost.getValue());
               if (value > 0) {
                  ResourceModel clone = cost.clone();
                  clone.setValue(value);
                  excessItems.add(clone);
               }
            }

            ResourceModel.addResourceToListPlus(returnItems, excessItems);
            TongqueTerraceModel tongqueTerraceModel = (TongqueTerraceModel)this.player.getGameModelPool().getEntity("TongQueBase", dao.beautyId);
            ArrayList<ResourceModel> awardItems = new ArrayList();
            if (dao.bestowNum > 0) {
               for(ResourceModel resourceModel : tongqueTerraceModel.getBestowConsume()) {
                  ResourceModel clone = resourceModel.clone();
                  clone.setValue(resourceModel.getValue() * dao.bestowNum);
                  awardItems.add(clone);
               }

               ResourceModel.addResourceToListPlus(returnItems, awardItems);
            }

            List<TongQueSkillModel> skillModels = (List)this.player.getGameModelPool().getEntity("customTongQueSkill", dao.beautyId);
            ArrayList<ResourceModel> skillItems = new ArrayList();
            int initialSkillId = 0;
            Optional<TongQueSkillModel> first = skillModels.stream().filter((s) -> s.getSkillId() == dao.skillId).findFirst();
            if (first.isPresent()) {
               for(TongQueSkillModel skillModel : skillModels) {
                  if (skillModel.getLv() == 1) {
                     initialSkillId = skillModel.getSkillId();
                  }

                  if (skillModel.getLv() < ((TongQueSkillModel)first.get()).getLv()) {
                     skillItems.addAll(skillModel.getCosts());
                  }
               }
            }

            ResourceModel.addResourceToListPlus(returnItems, skillItems);
            ArrayList<ResourceModel> chongxingItems = new ArrayList();
            Map<Integer, TongqueChongxingModel> chongxingMap = this.player.getGameModelPool().getMap("TongQueChongXing");

            for(TongqueChongxingModel chongxingModel : chongxingMap.values()) {
               if (chongxingModel.getLevel() <= dao.patronizeLv) {
                  chongxingItems.addAll(chongxingModel.getConsts());
               }
            }

            ResourceModel.addResourceToListPlus(returnItems, chongxingItems);
            if (!returnItems.isEmpty()) {
               if (msg.getStatus() == 0) {
                  TongqueTerraceMsg.S2C_ResetBeauty_9843.Builder builder = TongqueTerraceMsg.S2C_ResetBeauty_9843.newBuilder();
                  builder.addAllItems(ResourceModel.builderList(returnItems));
                  this.player.sendMsg(builder.build());
               } else if (msg.getStatus() == 1) {
                  this.player.delResource(resource, 35, 3509, 0, 0, "");
                  this.player.addResource(returnItems, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 35, 3508, 0, 0, "");
                  dao.trystLv = 0;
                  dao.trystExp = 0;
                  dao.bestowNum = 0;
                  dao.skillId = initialSkillId;
                  dao.patronizeLv = 0;
                  dao.updateOp();
                  HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                  this.flushTongqueProperties();
                  heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_TONGQUE);
                  this.openMainUi();
               }

            }
         }
      } else {
         this.player.failure(6);
      }
   }

   public void unlockBeauty(int beautyId) {
      TongqueTerraceDao tongqueTerraceDao = this.getTongqueTerraceDao(beautyId);
      if (tongqueTerraceDao != null && tongqueTerraceDao.state == 2) {
         this.logger.info("美人已经解锁,ID={}", beautyId);
      } else {
         TongqueTerraceModel tongqueTerraceModel = (TongqueTerraceModel)this.player.getGameModelPool().getEntity("TongQueBase", beautyId);
         if (tongqueTerraceModel == null) {
            this.logger.info("美人模板为空，ID={}", beautyId);
         } else {
            if (tongqueTerraceDao == null) {
               tongqueTerraceDao = new TongqueTerraceDao();
               tongqueTerraceDao.playerId = this.player.getPlayerId();
               tongqueTerraceDao.beautyId = tongqueTerraceModel.getId();
               tongqueTerraceDao.state = 2;
               tongqueTerraceDao.trystLv = 0;

               for(TongQueSkillModel skillModel : (List)this.player.getGameModelPool().getEntity("customTongQueSkill", tongqueTerraceModel.getId())) {
                  if (skillModel.getLv() == 1) {
                     tongqueTerraceDao.skillId = skillModel.getSkillId();
                     break;
                  }
               }

               this.player.insertDao(tongqueTerraceDao, false);
            } else {
               tongqueTerraceDao.state = 2;
               tongqueTerraceDao.updateOp();
            }

            PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
            playerLogPart.logTongQue(tongqueTerraceDao.beautyId, tongqueTerraceDao.state, 35, 3506, 0, 0, "unlock");
            this.openMainUi();
         }
      }
   }

   public List<PropertyModel> getBestowProperties(int beautyId, int num) {
      List<PropertyModel> result = new ArrayList();
      TongqueTerraceModel model = (TongqueTerraceModel)this.player.getGameModelPool().getEntity("TongQueBase", beautyId);
      if (model == null) {
         return result;
      } else {
         for(PropertyModel bestowProperty : model.getBestowProperties()) {
            result.add(new PropertyModel(bestowProperty.getType(), bestowProperty.getWay(), bestowProperty.getValue() * (long)num));
         }

         return result;
      }
   }

   public int incTrystExp(TongqueTerraceDao dao, int addExp) {
      int oldTrysExp = dao.trystExp;
      int oldLv = dao.trystLv;
      dao.trystExp += addExp;
      dao.updateOp();

      boolean isLvUp;
      for(isLvUp = false; this.trystLvUp(dao) != 0; isLvUp = true) {
      }

      if (isLvUp) {
         TongQueUpLevelModel model = this.getTongQueUpLevelModel(dao.beautyId, oldLv);
         return model.getExp() - oldTrysExp;
      } else {
         return addExp;
      }
   }

   public int trystLvUp(TongqueTerraceDao dao) {
      TongQueUpLevelModel model = this.getTongQueUpLevelModel(dao.beautyId, dao.trystLv);
      if (model == null) {
         return 0;
      } else {
         int tongqueMaxTrystLv = this.configManager.getIntDefault("tongqueMaxTrystLv", 70);
         if (dao.trystLv >= tongqueMaxTrystLv) {
            if (dao.trystExp > model.getExp()) {
               dao.trystExp = model.getExp();
               dao.updateOp();
            }

            return 0;
         } else if (dao.trystExp < model.getExp()) {
            return 0;
         } else {
            dao.trystExp -= model.getExp();
            int oldLv = dao.trystLv++;
            dao.updateOp();
            PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
            playerLogPart.logTongQue(dao.beautyId, dao.trystLv, 35, 3507, oldLv, 0, "trystLv");
            return 1;
         }
      }
   }

   public int getDownTime() {
      VipModel vipModel = (VipModel)this.player.getGameModelPool().getEntity("vip", this.player.getPlayerDao().vip_lv);
      int maxTimes = vipModel.getBeautyTimes();
      long currentTime = System.currentTimeMillis();
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      long deltTime = currentTime - playerExtend.tongqueTime;
      return deltTime >= (long)maxTimes * 10800000L ? 0 : (int)(10800000L * (long)maxTimes - deltTime);
   }

   public int getTrystTimes(TongqueTerraceMsg.TrystType type, PlayerExtend playerExtend, long currentTime, long deltTime) {
      int trystTimes = 1;
      VipModel vipModel = (VipModel)this.player.getGameModelPool().getEntity("vip", this.player.getPlayerDao().vip_lv);
      int maxTimes = vipModel.getBeautyTimes();
      if (type == TongqueTerraceMsg.TrystType.TRYST_TYPE_FREE) {
         if (deltTime / 10800000L >= (long)maxTimes) {
            playerExtend.tongqueTime = currentTime - 10800000L * (long)(maxTimes - 1);
         } else {
            playerExtend.tongqueTime += 10800000L;
         }
      } else if (deltTime / 10800000L >= (long)maxTimes) {
         trystTimes = maxTimes;
         playerExtend.tongqueTime = currentTime;
      } else {
         trystTimes = (int)(deltTime / 10800000L);
         playerExtend.tongqueTime += 10800000L * (long)trystTimes;
      }

      this.player.updatePlayerExtend(13);
      this.logger.info("约会次数={},vip={}", trystTimes, this.player.getPlayerDao().vip_lv);
      return trystTimes;
   }

   public TongqueTerraceDao getTongqueTerraceDao(int beautyId) {
      Map<Integer, TongqueTerraceDao> map = this.player.<Integer, TongqueTerraceDao>getMap("tb_tongque_terrace", this.player.getPlayerId());
      return map == null ? null : (TongqueTerraceDao)map.get(beautyId);
   }

   public Map<Integer, TongqueTerraceDao> getUnlockBeautyMap() {
      Map<Integer, TongqueTerraceDao> resultMap = new HashMap();
      Map<Integer, TongqueTerraceDao> map = this.player.<Integer, TongqueTerraceDao>getMap("tb_tongque_terrace", this.player.getPlayerId());
      if (map == null) {
         return resultMap;
      } else {
         for(Map.Entry<Integer, TongqueTerraceDao> entry : map.entrySet()) {
            if (((TongqueTerraceDao)entry.getValue()).state == 2) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   public List<PropertyModel> getTrystProperties(TongqueTerraceDao tongqueTerraceDao) {
      List<PropertyModel> tempList = new ArrayList();
      TreeMap<Integer, TongQueUpLevelModel> map = this.getTongQueUpLevelModelMap(tongqueTerraceDao.beautyId, tongqueTerraceDao.trystLv);

      for(Map.Entry<Integer, TongQueUpLevelModel> entry : map.entrySet()) {
         if ((Integer)entry.getKey() < tongqueTerraceDao.trystLv) {
            for(PropertyModel att : ((TongQueUpLevelModel)entry.getValue()).getAtts()) {
               PropertyModel propertyModel = new PropertyModel(att.getType(), att.getWay(), att.getValue() * (long)((TongQueUpLevelModel)entry.getValue()).getExp());
               PropertyModel.addLvProtities(tempList, propertyModel);
            }
         } else if ((Integer)entry.getKey() == tongqueTerraceDao.trystLv) {
            for(PropertyModel att : ((TongQueUpLevelModel)entry.getValue()).getAtts()) {
               PropertyModel propertyModel = new PropertyModel(att.getType(), att.getWay(), att.getValue() * (long)tongqueTerraceDao.trystExp);
               PropertyModel.addLvProtities(tempList, propertyModel);
            }
         }
      }

      List<PropertyModel> resultList = new ArrayList();

      for(PropertyModel model : tempList) {
         PropertyModel propertyModel = new PropertyModel(model.getType(), model.getWay(), (long)((int)((float)model.getValue() / 10000.0F)));
         PropertyModel.addLvProtities(resultList, propertyModel);
      }

      return resultList;
   }

   public List<PropertyModel> getPatronizePros(TongqueTerraceDao tongqueTerraceDao) {
      List<PropertyModel> resultList = new ArrayList();

      for(int i = 1; i <= tongqueTerraceDao.patronizeLv; ++i) {
         TongqueChongxingModel tongqueChongxingModel = (TongqueChongxingModel)this.player.getGameModelPool().getEntity("TongQueChongXing", i);

         for(PropertyModel model : tongqueChongxingModel.getStrong()) {
            PropertyModel propertyModel = new PropertyModel(model.getType(), model.getWay(), model.getValue());
            PropertyModel.addLvProtities(resultList, propertyModel);
         }
      }

      return resultList;
   }

   public void flushTongqueProperties() {
      List<PropertyModel> resultList = new ArrayList();
      List<PropertyModel> addValList = new ArrayList();
      Map<Integer, TongqueTerraceDao> map = this.player.<Integer, TongqueTerraceDao>getMap("tb_tongque_terrace", this.player.getPlayerId());
      if (map != null) {
         for(Map.Entry<Integer, TongqueTerraceDao> entry : map.entrySet()) {
            if (((TongqueTerraceDao)entry.getValue()).state == 2) {
               TongqueTerraceModel tongqueTerraceModel = (TongqueTerraceModel)this.player.getGameModelPool().getEntity("TongQueBase", entry.getKey());
               if (tongqueTerraceModel != null) {
                  for(PropertyModel lvPro : this.getTrystProperties((TongqueTerraceDao)entry.getValue())) {
                     if (tongqueTerraceModel.getBeautyType() == 1) {
                        PropertyModel.addLvProtities(resultList, lvPro);
                     } else {
                        PropertyModel.addLvProtities(addValList, lvPro);
                     }
                  }

                  TongqueTerraceModel model = (TongqueTerraceModel)this.player.getGameModelPool().getEntity("TongQueBase", entry.getKey());
                  if (model != null) {
                     for(PropertyModel bestowProperty : model.getBestowProperties()) {
                        PropertyModel.addLvProtities(resultList, new PropertyModel(bestowProperty.getType(), bestowProperty.getWay(), bestowProperty.getValue() * (long)((TongqueTerraceDao)entry.getValue()).bestowNum));
                     }
                  }

                  for(PropertyModel lvPro : this.getPatronizePros((TongqueTerraceDao)entry.getValue())) {
                     PropertyModel.addLvProtities(resultList, lvPro);
                  }
               }
            }
         }
      }

      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.setProperty_tongque(resultList);
      heroBagPart.setProperty_tongque_new_beauty(addValList);
   }

   public void gmClearStartTime() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      playerExtend.tongqueTime = 0L;
      this.player.updatePlayerExtend(13);
      TongqueTerraceMsg.S2C_FreeTrystResult_9806.Builder builder = TongqueTerraceMsg.S2C_FreeTrystResult_9806.newBuilder();
      builder.setDownTime(this.getDownTime() / 1000);
      builder.setType(TongqueTerraceMsg.TrystType.TRYST_TYPE_FREE);
      this.player.sendMsg(builder.build());
   }

   public void testOneKeyLvUp() {
      for(Map.Entry<Integer, TongqueTerraceDao> entry : this.getUnlockBeautyMap().entrySet()) {
         if (((TongqueTerraceDao)entry.getValue()).trystLv < 120) {
            ((TongqueTerraceDao)entry.getValue()).trystLv = 120;
         }

         ((TongqueTerraceDao)entry.getValue()).updateOp();
      }

      this.openMainUi();
   }

   public void setBeautyLv(int beautyId, int lv) {
      for(Map.Entry<Integer, TongqueTerraceDao> entry : this.getUnlockBeautyMap().entrySet()) {
         if ((Integer)entry.getKey() == beautyId) {
            TongQueUpLevelModel tongQueUpLevelModel = this.getTongQueUpLevelModel(beautyId, lv);
            if (tongQueUpLevelModel != null) {
               ((TongqueTerraceDao)entry.getValue()).trystLv = lv;
            }
         }

         ((TongqueTerraceDao)entry.getValue()).updateOp();
      }

      this.openMainUi();
   }

   public void gmUnlockBeauty(int beautyId) {
      this.unlockBeauty(beautyId);
   }

   public void gmAddAll() {
      Map<Integer, TongqueTerraceDao> map = this.player.<Integer, TongqueTerraceDao>getMap("tb_tongque_terrace", this.player.getPlayerId());
      if (map != null) {
         for(Map.Entry<Integer, TongqueTerraceDao> entry : map.entrySet()) {
            if (((TongqueTerraceDao)entry.getValue()).state != 2) {
               ((TongqueTerraceDao)entry.getValue()).state = 2;
            }

            if (((TongqueTerraceDao)entry.getValue()).trystLv < 120) {
               ((TongqueTerraceDao)entry.getValue()).trystLv = 120;
            }

            if (((TongqueTerraceDao)entry.getValue()).bestowNum < 558) {
               ((TongqueTerraceDao)entry.getValue()).bestowNum = 558;
            }

            if (((TongqueTerraceDao)entry.getValue()).patronizeLv < 72) {
               ((TongqueTerraceDao)entry.getValue()).patronizeLv = 72;
            }

            ((TongqueTerraceDao)entry.getValue()).updateOp();
         }

         this.openMainUi();
      }
   }

   public CooperateDao getCooperateDao(int cooperateType) {
      Map<Integer, CooperateDao> map = this.player.<Integer, CooperateDao>getMap("tb_cooperate", this.player.getPlayerId());
      return map == null ? null : (CooperateDao)map.get(cooperateType);
   }

   @MsgHandlerAnno
   public void C2S_CooperateInfo_9830(TongqueTerraceMsg.C2S_CooperateInfo_9830 msg, String source) {
      Map<Integer, CooperateDao> map = this.player.<Integer, CooperateDao>getMap("tb_cooperate", this.player.getPlayerId());
      TongqueTerraceMsg.S2C_CooperateInfo_9831.Builder builder = TongqueTerraceMsg.S2C_CooperateInfo_9831.newBuilder();
      if (map.isEmpty()) {
         for(int i = 1; i <= 3; ++i) {
            CooperateDao cooperateDao = new CooperateDao();
            cooperateDao.playerId = this.player.getPlayerId();
            cooperateDao.cooperateType = i;
            this.player.insertDao(cooperateDao, true);
         }
      }

      for(CooperateDao cooperateDao : map.values()) {
         if (cooperateDao != null) {
            TongqueTerraceMsg.CooperateInfo.Builder info = TongqueTerraceMsg.CooperateInfo.newBuilder();
            if (cooperateDao.cooperateType == TongqueTerraceMsg.CooperateType.COOPERATE_HEAVEN.getNumber()) {
               info.setType(TongqueTerraceMsg.CooperateType.COOPERATE_HEAVEN);
            } else if (cooperateDao.cooperateType == TongqueTerraceMsg.CooperateType.COOPERATE_EARTH.getNumber()) {
               info.setType(TongqueTerraceMsg.CooperateType.COOPERATE_EARTH);
            } else {
               info.setType(TongqueTerraceMsg.CooperateType.COOPERATE_PERSON);
            }

            if (cooperateDao.cooperateBeauty.isEmpty()) {
               for(int j = 0; j < 5; ++j) {
                  info.addBeautyIdList(0);
               }
            } else {
               for(Integer beautyId : cooperateDao.cooperateBeauty) {
                  info.addBeautyIdList(beautyId);
               }
            }

            builder.addInfo(info);
         }
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_SaveCooperate_9832(TongqueTerraceMsg.C2S_SaveCooperate_9832 msg, String source) {
      String tryLev = this.configManager.getStrByDefault("tongQueConnectCondition1", "2|30,3|50,4|70,5|100");
      String skillLev = this.configManager.getStrByDefault("tongQueConnectCondition2", "2|0,3|0,4|0,5|0");
      Map<Integer, Integer> tryMap = new HashMap();
      Map<Integer, Integer> skillMap = new HashMap();
      String[] tryStr = tryLev.split(",");
      String[] skillStr = skillLev.split(",");

      for(int i = 0; i < tryStr.length; ++i) {
         String[] tryLimit = tryStr[i].split("\\|");
         tryMap.put(Integer.parseInt(tryLimit[0]), Integer.parseInt(tryLimit[1]));
      }

      for(int i = 0; i < skillStr.length; ++i) {
         String[] skillLimit = skillStr[i].split("\\|");
         skillMap.put(Integer.parseInt(skillLimit[0]), Integer.parseInt(skillLimit[1]));
      }

      int beautyNum = 0;

      for(Integer id : msg.getCooperate().getBeautyIdListList()) {
         if (id > 0) {
            ++beautyNum;
         }
      }

      HashSet<Integer> checkSameIdSet = new HashSet();

      for(Integer beautyId : msg.getCooperate().getBeautyIdListList()) {
         if (beautyId != 0) {
            if (checkSameIdSet.contains(beautyId)) {
               this.player.failure(6);
               return;
            }

            checkSameIdSet.add(beautyId);
         }
      }

      this.logger.info("保存同心策：" + msg.getCooperate().getBeautyIdListList());
      if (msg.getCooperate().getBeautyIdListList().size() == 5 && (Integer)msg.getCooperate().getBeautyIdListList().get(0) != 0) {
         int flag = 0;

         for(Integer beautyId : msg.getCooperate().getBeautyIdListList()) {
            if (beautyId != 0) {
               ++flag;
               TongqueTerraceDao tongqueTerraceDao = this.getTongqueTerraceDao(beautyId);
               if (tongqueTerraceDao == null || tongqueTerraceDao.state != 2) {
                  return;
               }

               if (tongqueTerraceDao != null) {
                  if (tongqueTerraceDao.beautyGrade >= 0 || tongqueTerraceDao.cooperateType > 0 && tongqueTerraceDao.cooperateType != msg.getCooperate().getType().getNumber()) {
                     CooperateDao cooperateDao = this.getCooperateDao(tongqueTerraceDao.cooperateType);
                     if (cooperateDao != null) {
                        if (!cooperateDao.cooperateBeauty.contains(beautyId)) {
                           tongqueTerraceDao.beautyGrade = -1;
                           tongqueTerraceDao.cooperateType = 0;
                           tongqueTerraceDao.updateOp();
                        } else {
                           if (tongqueTerraceDao.cooperateType != msg.getCooperate().getType().getNumber()) {
                              this.logger.info("该美人已经在同心策阵上");
                              this.player.failure(61102);
                              return;
                           }

                           if (tongqueTerraceDao.trystLv < (Integer)tryMap.get(beautyNum)) {
                              this.logger.info("幽会等级不足！！！");
                              this.player.failure(61103);
                              return;
                           }
                        }
                     } else {
                        tongqueTerraceDao.beautyGrade = -1;
                        tongqueTerraceDao.cooperateType = 0;
                        tongqueTerraceDao.updateOp();
                     }
                  }

                  TongQueSkillModel model = (TongQueSkillModel)this.player.getGameModelPool().getEntity("TongQueSkill", tongqueTerraceDao.skillId);
                  if (tryMap.containsKey(beautyNum)) {
                     if (tongqueTerraceDao.trystLv < (Integer)tryMap.get(beautyNum)) {
                        this.logger.info("幽会等级不足！！！");
                        this.player.failure(61103);
                        return;
                     }
                  } else if (tongqueTerraceDao.trystLv < 30) {
                     this.logger.info("幽会等级不足！！！");
                     this.player.failure(61103);
                     return;
                  }

                  if (skillMap.containsKey(beautyNum) && model.getLv() < (Integer)skillMap.get(beautyNum)) {
                     this.logger.info("技能等级不足！！！");
                     this.player.failure(61104);
                     return;
                  }
               }
            }
         }

         if (flag < 2) {
            this.logger.info("同心策上阵美人不足两个");
            this.player.failure(61101);
         } else {
            List<Integer> beautyIdList = new ArrayList();

            for(int i = 1; i < msg.getCooperate().getBeautyIdListList().size(); ++i) {
               if ((Integer)msg.getCooperate().getBeautyIdListList().get(i) != 0) {
                  beautyIdList.add(msg.getCooperate().getBeautyIdListList().get(i));
               }
            }

            CooperateDao cooperateDao = this.getCooperateDao(msg.getCooperate().getType().getNumber());
            if (cooperateDao == null) {
               cooperateDao = new CooperateDao();
               cooperateDao.playerId = this.player.getPlayerId();
               cooperateDao.cooperateType = msg.getCooperate().getType().getNumber();
               this.player.insertDao(cooperateDao, true);
            }

            int mainId = 0;
            if (cooperateDao != null && !cooperateDao.cooperateBeauty.isEmpty()) {
               mainId = (Integer)cooperateDao.cooperateBeauty.get(0);
               if (mainId == (Integer)msg.getCooperate().getBeautyIdListList().get(0)) {
                  mainId = 0;
               }

               for(Integer beautyId : cooperateDao.cooperateBeauty) {
                  if (beautyId != 0) {
                     TongqueTerraceDao tongqueTerraceDao = this.getTongqueTerraceDao(beautyId);
                     if (tongqueTerraceDao != null) {
                        tongqueTerraceDao.beautyGrade = -1;
                        tongqueTerraceDao.cooperateType = 0;
                        tongqueTerraceDao.updateOp();
                     }
                  }
               }
            }

            for(int i = 0; i < 5; ++i) {
               Integer beautyId = (Integer)msg.getCooperate().getBeautyIdListList().get(i);
               if (beautyId != 0) {
                  TongqueTerraceDao tongqueTerraceDao = this.getTongqueTerraceDao(beautyId);
                  if (tongqueTerraceDao != null) {
                     if (i == 0) {
                        tongqueTerraceDao.beautyGrade = 0;
                     } else {
                        tongqueTerraceDao.beautyGrade = 1;
                     }

                     tongqueTerraceDao.cooperateType = msg.getCooperate().getType().getNumber();
                     tongqueTerraceDao.updateOp();
                  }
               }
            }

            cooperateDao.cooperateBeauty.clear();
            cooperateDao.cooperateBeauty.addAll(msg.getCooperate().getBeautyIdListList());
            cooperateDao.updateOp();
            List<CommonMsg.HeroState> arrayingList = new ArrayList();
            HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);

            for(CommonMsg.HeroState state : CommonMsg.HeroState.values()) {
               HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(state);
               if (heroArrayingDao != null && !heroArrayingDao.elements.isEmpty()) {
                  for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                     if ((Byte)entry.getKey() == 7) {
                        if (beautyIdList.contains(entry.getValue())) {
                           arrayingList.add(state);
                        } else if (mainId > 0 && (Integer)entry.getValue() == mainId) {
                           arrayingList.add(state);
                        }
                     }
                  }
               }
            }

            for(CommonMsg.HeroState state : arrayingList) {
               this.logger.info("保存同心策更新阵容：" + state);
               HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(state);
               heroArrayingDao.elements.remove((byte)7);
               heroArrayingDao.updateOp();
            }

            if (!arrayingList.isEmpty()) {
               HeroMsg.S2C_ArtifactBeautyArraying_5202.Builder builder = HeroMsg.S2C_ArtifactBeautyArraying_5202.newBuilder();
               builder.setResult(1);
               builder.addAllArrayingType(arrayingList);
               builder.setCodeType(CommonMsg.CodeType.CODE_BEAUTY);
               builder.setCode(-1);
               this.player.sendMsg(builder.build());
            }

            TongqueTerraceMsg.S2C_SaveCooperate_9833.Builder save = TongqueTerraceMsg.S2C_SaveCooperate_9833.newBuilder();
            save.setResult(1);
            save.setCooperate(msg.getCooperate());
            this.player.sendMsg(save.build());
            this.notifyBeautyState();
         }
      } else {
         this.logger.info("上阵同心策没有主美人或者数量不足5");
         this.player.failure(61101);
      }
   }

   @MsgHandlerAnno
   public void C2S_DismissCooperate_9834(TongqueTerraceMsg.C2S_DismissCooperate_9834 msg, String source) {
      List<Integer> beautyList = new ArrayList();
      CooperateDao cooperateDao = this.getCooperateDao(msg.getType().getNumber());
      if (cooperateDao != null) {
         for(Integer beautyId : cooperateDao.cooperateBeauty) {
            if (beautyId != 0) {
               beautyList.add(beautyId);
            }
         }

         if (!beautyList.isEmpty()) {
            int mainId = (Integer)cooperateDao.cooperateBeauty.get(0);
            if (mainId == 0) {
               this.logger.error("没有主美人的同心策");
            } else {
               List<CommonMsg.HeroState> arrayingList = new ArrayList();
               HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);

               for(CommonMsg.HeroState state : CommonMsg.HeroState.values()) {
                  HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(state);
                  if (heroArrayingDao != null && !heroArrayingDao.elements.isEmpty()) {
                     for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                        if ((Byte)entry.getKey() == 7 && (Integer)entry.getValue() == mainId) {
                           arrayingList.add(state);
                        }
                     }
                  }
               }

               for(CommonMsg.HeroState state : arrayingList) {
                  this.logger.info("解散同心策更新阵容：" + state);
                  HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(state);
                  heroArrayingDao.elements.remove((byte)7);
                  heroArrayingDao.updateOp();
               }

               if (!arrayingList.isEmpty()) {
                  HeroMsg.S2C_ArtifactBeautyArraying_5202.Builder builder = HeroMsg.S2C_ArtifactBeautyArraying_5202.newBuilder();
                  builder.setResult(1);
                  builder.addAllArrayingType(arrayingList);
                  builder.setCodeType(CommonMsg.CodeType.CODE_BEAUTY);
                  builder.setCode(-1);
                  this.player.sendMsg(builder.build());
               }

               cooperateDao.cooperateBeauty.clear();
               cooperateDao.updateOp();

               for(Integer beautyId : beautyList) {
                  TongqueTerraceDao tongqueTerraceDao = this.getTongqueTerraceDao(beautyId);
                  if (tongqueTerraceDao != null) {
                     tongqueTerraceDao.beautyGrade = -1;
                     tongqueTerraceDao.cooperateType = 0;
                     tongqueTerraceDao.updateOp();
                  }
               }

               TongqueTerraceMsg.S2C_DismissCooperate_9835.Builder dismiss = TongqueTerraceMsg.S2C_DismissCooperate_9835.newBuilder();
               dismiss.setResult(1);
               dismiss.setType(msg.getType());
               this.player.sendMsg(dismiss.build());
               this.notifyBeautyState();
            }
         }
      }
   }

   public void notifyBeautyState() {
      TongqueTerraceMsg.S2C_NotifyBeautyState_9836.Builder builder = TongqueTerraceMsg.S2C_NotifyBeautyState_9836.newBuilder();
      Map<Integer, TongqueTerraceDao> map = this.player.<Integer, TongqueTerraceDao>getMap("tb_tongque_terrace", this.player.getPlayerId());

      for(TongqueTerraceDao terraceDao : map.values()) {
         if (terraceDao != null && terraceDao.state == 2) {
            TongqueTerraceMsg.BeautyState.Builder state = TongqueTerraceMsg.BeautyState.newBuilder();
            state.setId(terraceDao.beautyId);
            state.setBeautyGrade(terraceDao.beautyGrade);
            if (terraceDao.cooperateType == 1) {
               state.setType(TongqueTerraceMsg.CooperateType.COOPERATE_HEAVEN);
            } else if (terraceDao.cooperateType == 2) {
               state.setType(TongqueTerraceMsg.CooperateType.COOPERATE_EARTH);
            } else if (terraceDao.cooperateType == 3) {
               state.setType(TongqueTerraceMsg.CooperateType.COOPERATE_PERSON);
            } else {
               state.setType(TongqueTerraceMsg.CooperateType.COOPERATE_NONE);
            }

            builder.addInfo(state);
         }
      }

      this.player.sendMsg(builder.build());
   }

   public void packPlayerBeautyInfo(TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.Builder builder, int packBeautyId) {
      Map<Integer, TongqueTerraceDao> map = this.player.<Integer, TongqueTerraceDao>getMap("tb_tongque_terrace", this.player.getPlayerId());

      for(Map.Entry<Integer, TongqueTerraceDao> entry : map.entrySet()) {
         TongqueTerraceMsg.BeautyInfo.Builder infoBuilder = TongqueTerraceMsg.BeautyInfo.newBuilder();
         infoBuilder.setId(((TongqueTerraceDao)entry.getValue()).beautyId);
         infoBuilder.setState(((TongqueTerraceDao)entry.getValue()).state);
         infoBuilder.setUnlockStep(((TongqueTerraceDao)entry.getValue()).unlockStep);
         infoBuilder.setTrystLv(((TongqueTerraceDao)entry.getValue()).trystLv);
         infoBuilder.setTrystExp(((TongqueTerraceDao)entry.getValue()).trystExp);
         infoBuilder.setBestowNum(((TongqueTerraceDao)entry.getValue()).bestowNum);
         infoBuilder.setSkillId(((TongqueTerraceDao)entry.getValue()).skillId);
         infoBuilder.setPatronizeLv(((TongqueTerraceDao)entry.getValue()).patronizeLv);

         for(PropertyModel lvPro : this.getTrystProperties((TongqueTerraceDao)entry.getValue())) {
            infoBuilder.addTrystPropertys(lvPro.builder());
         }

         for(PropertyModel bestowProperty : this.getBestowProperties(((TongqueTerraceDao)entry.getValue()).beautyId, ((TongqueTerraceDao)entry.getValue()).bestowNum)) {
            infoBuilder.addBestowPropertys(bestowProperty.builder());
         }

         for(PropertyModel patronizePro : this.getPatronizePros((TongqueTerraceDao)entry.getValue())) {
            infoBuilder.addPatronizeProperty(patronizePro.builder());
         }

         infoBuilder.setBeautyGrade(((TongqueTerraceDao)entry.getValue()).beautyGrade);
         if (((TongqueTerraceDao)entry.getValue()).cooperateType == 1) {
            infoBuilder.setType(TongqueTerraceMsg.CooperateType.COOPERATE_HEAVEN);
         } else if (((TongqueTerraceDao)entry.getValue()).cooperateType == 2) {
            infoBuilder.setType(TongqueTerraceMsg.CooperateType.COOPERATE_EARTH);
         } else if (((TongqueTerraceDao)entry.getValue()).cooperateType == 3) {
            infoBuilder.setType(TongqueTerraceMsg.CooperateType.COOPERATE_PERSON);
         } else {
            infoBuilder.setType(TongqueTerraceMsg.CooperateType.COOPERATE_NONE);
         }

         TongQueSkillModel skillModel = (TongQueSkillModel)this.player.getGameModelPool().getEntity("TongQueSkill", ((TongqueTerraceDao)entry.getValue()).skillId);
         if (skillModel != null) {
            infoBuilder.setAssistantSkill(skillModel.getAssistantSkill());
         } else {
            infoBuilder.setAssistantSkill(((TongqueTerraceDao)entry.getValue()).skillId);
         }

         builder.addInfos(infoBuilder);
      }

      if (packBeautyId == 0) {
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         if (heroArrayingDao != null && heroArrayingDao.elements.containsKey((byte)7)) {
            packBeautyId = (Integer)heroArrayingDao.elements.get((byte)7);
         }
      }

      builder.setBeautyId(packBeautyId);
      if (builder.getBeautyId() > 0) {
         TongqueTerraceDao tongqueTerraceDao = this.getTongqueTerraceDao(builder.getBeautyId());
         if (tongqueTerraceDao.cooperateType > 0) {
            CooperateDao cooperateDao = this.getCooperateDao(tongqueTerraceDao.cooperateType);
            if (cooperateDao != null && !cooperateDao.cooperateBeauty.isEmpty()) {
               builder.addAllBeautyIdList(cooperateDao.cooperateBeauty);

               for(Integer beautyId : cooperateDao.cooperateBeauty) {
                  if (beautyId == 0) {
                     builder.addSkillList(0);
                  } else {
                     TongqueTerraceDao dao = this.getTongqueTerraceDao(beautyId);
                     if (dao.beautyGrade == 0) {
                        builder.addSkillList(dao.skillId);
                     } else {
                        TongQueSkillModel skillModel = (TongQueSkillModel)this.player.getGameModelPool().getEntity("TongQueSkill", dao.skillId);
                        builder.addSkillList(skillModel.getAssistantSkill());
                     }
                  }
               }
            }
         }
      }

   }

   public void levelUp(int preLv, int newLv) {
      SystemFunctionModel model_beauty = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 2300);
      int beautyLv = 40;
      if (model_beauty != null) {
         beautyLv = model_beauty.getOpenLevel();
      }

      if (preLv < beautyLv && newLv >= beautyLv) {
         this.unlockBeauty(1);
      }

   }

   public TreeMap<Integer, TongQueUpLevelModel> getTongQueUpLevelModelMap(int beautyId, int trystLv) {
      TongqueTerraceModel tongqueTerraceModel = (TongqueTerraceModel)this.player.getGameModelPool().getEntity("TongQueBase", beautyId);
      return tongqueTerraceModel == null ? null : (TreeMap)this.player.getGameModelPool().getEntity("customTongQueUpLevel", tongqueTerraceModel.getUpType());
   }

   public TongQueUpLevelModel getTongQueUpLevelModel(int beautyId, int trystLv) {
      TreeMap<Integer, TongQueUpLevelModel> tongQueUpLevelModelMap = this.getTongQueUpLevelModelMap(beautyId, trystLv);
      if (tongQueUpLevelModelMap != null && !tongQueUpLevelModelMap.isEmpty()) {
         return tongQueUpLevelModelMap.containsKey(trystLv) ? (TongQueUpLevelModel)tongQueUpLevelModelMap.get(trystLv) : null;
      } else {
         return null;
      }
   }
}
