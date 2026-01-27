package com.gzbz.unionOffer;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.collection.ConcurrentHashSet;
import com.google.protobuf.ByteString;
import com.gzbz.db.BattleDao;
import com.gzbz.db.OfferPersonDao;
import com.gzbz.db.OfferUnionDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.OfferHeroModel;
import com.gzbz.model.OfferRewardModel;
import com.gzbz.model.UnionCopyModel;
import com.gzbz.model.VipModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossUnionOfferMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.UnionOfferMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.union.part.UnionPrivilegePart;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import misc.DateUtil;
import net.CrossSubscribeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class OfferPart extends PlayerPart {
   public static Set<Integer> IN_UNION_OFFER_PLAYERS = new ConcurrentHashSet();
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private OfferMgr offerMgr;
   @Autowired
   private ConfigManager configManager;
   @Autowired
   UnionMgrParent unionMgrParent;
   @Autowired
   WorldMgr worldMgr;

   public void resetDaily() {
      OfferPersonDao offerPersonDao = (OfferPersonDao)this.player.getData("tb_offer_person", this.player.getPlayerId());
      offerPersonDao.reset();
      offerPersonDao.updateOp();
   }

   public void resetWeek() {
      OfferPersonDao offerPersonDao = (OfferPersonDao)this.player.getData("tb_offer_person", this.player.getPlayerId());
      offerPersonDao.updateOp();
   }

   private OfferUnionDao getOfferUnionDao() {
      PlayerPublicDao publicDao = this.player.getPublicDao();
      return this.offerMgr.getOfferUnionDao(publicDao.unionId);
   }

   public UnionMgr getUnionMgr() {
      PlayerPublicDao playerPublicDao = this.player.getPublicDao();
      UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
      UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerPublicDao.unionId);
      return unionMgr;
   }

   @MsgHandlerAnno
   public void C2S_EnterView_14601(UnionOfferMsg.C2S_EnterView_14601 msg, String source) {
      if (this.player.isSystemOpen(3103)) {
         PlayerPublicDao publicDao = this.player.getPublicDao();
         if (publicDao.unionId <= 0) {
            this.player.failure(23);
         } else {
            if (msg.getEnter() != 1 && msg.getEnter() != 3) {
               IN_UNION_OFFER_PLAYERS.remove(this.player.getPlayerId());
            } else {
               if (msg.getEnter() == 1) {
                  IN_UNION_OFFER_PLAYERS.add(this.player.getPlayerId());
               }

               CrossUnionOfferMsg.S2CR_EnterView_14701.Builder builder = CrossUnionOfferMsg.S2CR_EnterView_14701.newBuilder();
               OfferPersonDao offerPersonDao = (OfferPersonDao)this.player.getData("tb_offer_person", this.player.getPlayerId());
               builder.setFightNum(offerPersonDao.fight);
               builder.setBuyNum(offerPersonDao.buy);
               builder.setCoolTime(offerPersonDao.coolTime);
               int unionCopyNum = 0;
               UnionMgr unionMgr = this.getUnionMgr();
               if (!Objects.isNull(unionMgr)) {
                  unionCopyNum = unionMgr.getMemberCopyTimes();
               }

               builder.setUnionCopyNum(unionCopyNum);
               OfferUnionDao offerUnionDao = this.getOfferUnionDao();
               builder.setUnionPublishNum(offerUnionDao.hideNum);
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            }

         }
      }
   }

   @MsgHandlerAnno
   public void C2S_PublishOffer_14603(UnionOfferMsg.C2S_PublishOffer_14603 msg, String source) {
      UnionPrivilegePart unionPrivilegePart = (UnionPrivilegePart)this.player.getMgrPart(UnionPrivilegePart.class);
      if (!unionPrivilegePart.checkPermission(1, 2)) {
         this.player.failure(61161);
      } else {
         OfferUnionDao offerUnionDao = this.getOfferUnionDao();
         int offerUnionActNum = this.configManager.getIntDefault("offerUnionActNum", 10);
         UnionMgr unionMgr = this.getUnionMgr();
         if (!Objects.isNull(unionMgr) && unionMgr.getMemberCopyTimes() < offerUnionActNum) {
            this.player.failure(61162);
         } else {
            int offerUnionSetNum = this.configManager.getIntDefault("offerUnionSetNum", 1);
            if (offerUnionDao.hideNum >= offerUnionSetNum) {
               this.player.failure(61123);
            } else {
               PlayerPublicDao playerPublicDao = this.player.getPublicDao();
               UnionDao unionDao = this.getUnionMgr().getUnion();
               UnionCopyModel unionCopyModel = (UnionCopyModel)ApplicationContextProvider.getModelPoolEntity("unionCopy", unionDao.copyId);
               if (unionCopyModel != null) {
                  int offerId = unionCopyModel.getOfferid() > 0 ? unionCopyModel.getOfferid() : this.configManager.getIntDefault("offerDefaultOfferId", 300060);
                  this.offerMgr.pushTaskEx("publishOffer", new Object[]{2, this.player.getServerId(), this.player.getPlayerId(), playerPublicDao.unionId, 1000, offerId});
               }

            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_BuyFight_14609(UnionOfferMsg.C2S_BuyFight_14609 msg, String source) {
      PlayerPublicDao publicDao = this.player.getPublicDao();
      if (publicDao.unionId <= 0) {
         this.player.failure(23);
      } else {
         OfferPersonDao offerPersonDao = (OfferPersonDao)this.player.getData("tb_offer_person", this.player.getPlayerId());
         int buyNum = offerPersonDao.buy;
         VipModel vipModel = (VipModel)ApplicationContextProvider.getModelPoolEntity("vip", publicDao.vip_lv);
         if (buyNum >= vipModel.getOfferRewardTimes()) {
            this.logger.info("购买次数已达上限 playerId:{} 已经购买:{}, 可购买:{}", new Object[]{this.player.getPlayerId(), buyNum, vipModel.getOfferRewardTimes()});
            this.player.failure(61164);
         } else {
            List<Integer> costList = this.configManager.getIntList("offerChallengeCost");
            int idx = buyNum >= costList.size() ? costList.size() - 1 : buyNum;
            ResourceModel cost = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, (Integer)costList.get(idx));
            if (!this.player.checkResourceNum(cost)) {
               this.player.failure(31);
            } else {
               this.player.delResource(cost, 71, 7105, 0, 0, "");
               ++offerPersonDao.buy;
               offerPersonDao.updateOp();
               this.notifyFightNum(offerPersonDao.fight, offerPersonDao.buy);
               UnionOfferMsg.S2C_BuyFight_14624.Builder builder = UnionOfferMsg.S2C_BuyFight_14624.newBuilder();
               builder.setBuyNum(offerPersonDao.buy);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Record_14611(UnionOfferMsg.C2S_Record_14611 msg, String source) {
      PlayerPublicDao publicDao = this.player.getPublicDao();
      if (publicDao.unionId <= 0) {
         this.player.failure(23);
      } else {
         CrossUnionOfferMsg.S2CR_Record_14711.Builder builder = CrossUnionOfferMsg.S2CR_Record_14711.newBuilder();
         builder.setUnionId(publicDao.unionId);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_ShopLv_14613(UnionOfferMsg.C2S_ShopLv_14613 msg, String source) {
      PlayerPublicDao publicDao = this.player.getPublicDao();
      if (publicDao.unionId <= 0) {
         this.player.failure(23);
      } else {
         this.offerMgr.pushTaskEx("sendShopLv", new Object[]{this.player.getPlayerId(), publicDao.unionId});
      }
   }

   @MsgHandlerAnno
   public void C2S_OfferDetail_14615(UnionOfferMsg.C2S_OfferDetail_14615 msg, String source) {
      this.requestOfferDetial(msg.getCode());
   }

   @MsgHandlerAnno
   public void C2S_DamageRank_14617(UnionOfferMsg.C2S_DamageRank_14617 msg, String source) {
      CrossUnionOfferMsg.S2CR_DamageRank_14717.Builder builder = CrossUnionOfferMsg.S2CR_DamageRank_14717.newBuilder();
      builder.setCode(msg.getCode());
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_MyRankPoint_14619(UnionOfferMsg.C2S_MyRankPoint_14619 msg, String source) {
      CrossUnionOfferMsg.S2CR_MyRankPoint_14719.Builder builder = CrossUnionOfferMsg.S2CR_MyRankPoint_14719.newBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_PointRank_14631(UnionOfferMsg.C2S_PointRank_14631 msg, String source) {
      this.requestPointRank(msg.getType());
   }

   private void requestPointRank(int type) {
      CrossUnionOfferMsg.S2CR_PointRank_14731.Builder builder = CrossUnionOfferMsg.S2CR_PointRank_14731.newBuilder();
      builder.setType(type);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void CR2S_Fight_14710(CrossUnionOfferMsg.CR2S_Fight_14710 msg, CrossSubscribeMsg crossSubscribeMsg) {
      PlayerPublicDao publicDao = this.player.getPublicDao();
      this.offerMgr.pushTaskEx("updatePoint", new Object[]{publicDao.unionId, publicDao.playerId, msg.getUnionPoint(), msg.getIsKill()});
      OfferPersonDao offerPersonDao = (OfferPersonDao)this.player.getData("tb_offer_person", this.player.getPlayerId());
      ++offerPersonDao.fight;
      if (msg.getIsKill()) {
         ++offerPersonDao.kill;
      }

      int offerChallengecd = this.configManager.getIntDefault("offerChallengecd", 10);
      offerPersonDao.coolTime = DateUtil.getIntTime(System.currentTimeMillis()) + offerChallengecd;
      offerPersonDao.updateOp();
      List<CommonMsg.ItemInfo> awardItemsList = msg.getBattleMsg().getResult().getAwardItemsList();
      Map<Integer, BattleDao> battleDaoMap = this.player.<Integer, BattleDao>getMap("tb_battle", this.player.getPlayerId());
      BattleDao battleDao = (BattleDao)battleDaoMap.get(3103);
      if (battleDao == null) {
         this.logger.error("战斗-->{}进入【悬赏】战斗失败,战斗数据不存在", this.player.getPlayerId());
      } else {
         for(CommonMsg.ItemInfo itemInfo : awardItemsList) {
            battleDao.rewards.add(new ResourceModel(itemInfo.getType(), itemInfo.getId(), itemInfo.getNum()));
         }

         battleDao.scene.setBattleMsg(msg.getBattleMsg().toBuilder());
         battleDao.status = 0;
         battleDao.totalTime = (long)battleDao.scene.getCostTime();
         battleDao.updateOp();
         this.notifyFightNum(offerPersonDao.fight, offerPersonDao.buy);
         this.player.sendMsg(msg.getBattleMsg());
         OfferHeroModel offerHeroModel = (OfferHeroModel)ApplicationContextProvider.getModelPoolEntity("offerhero", msg.getOfferHeroId());
         this.player.triggerTask(378, offerHeroModel.getHeroGroup(), 1L, 3);
         this.player.triggerTask(379, 0, 1L, 1);
      }
   }

   public UnionOfferMsg.RecordInfo.Builder toFightRecord(int subclass, int serverId, int fight, int kill, int point, int rank, String highestName, int highestPoint) {
      UnionOfferMsg.RecordInfo.Builder builder = UnionOfferMsg.RecordInfo.newBuilder();
      builder.setSubclass(subclass);
      builder.setServerId(serverId);
      builder.setPlayerId(0);
      builder.setFightNum(fight);
      builder.setKillNum(kill);
      builder.setPoint(point);
      builder.setRank(rank);
      builder.setHighestName(highestName);
      builder.setHighestPoint(highestPoint);
      return builder;
   }

   @MsgHandlerAnno
   public void CR2S_Kill_14722(CrossUnionOfferMsg.CR2S_Kill_14722 msg, CrossSubscribeMsg crossSubscribeMsg) {
      OfferRewardModel offerRewardModel = (OfferRewardModel)ApplicationContextProvider.getModelPoolEntity("offerReward", msg.getRewardId());
      if (offerRewardModel == null) {
         this.logger.info("悬赏 - 击杀奖励不存在 offerRewardId:{}", msg.getRewardId());
      } else {
         CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", offerRewardModel.getKillAward());
         if (centreAwardModel == null) {
            this.logger.info("悬赏 - 击杀奖励不存在 offerRewardId:{} centreAwardId:{}", msg.getRewardId(), offerRewardModel.getKillAward());
         } else {
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            List<ResourceModel> resourceModelList = new ArrayList();
            resourceModelList.add(new ResourceModel(1, PlayerDefine.PLAYER_OFFER_POINT, msg.getKillPoint()));
            resourceModelList.addAll(centreAwardModel.getItems());
            OfferHeroModel offerHeroModel = (OfferHeroModel)ApplicationContextProvider.getModelPoolEntity("offerhero", msg.getOfferHeroId());
            String format = MessageFormat.format(centreAwardModel.getDesc(), offerHeroModel.getHeroName());
            mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), format, resourceModelList, 604800000L, 71, 7102});
         }
      }
   }

   private void notifyFightNum(int fightNum, int buyNum) {
      UnionOfferMsg.S2C_UpdateFight_14610.Builder builder = UnionOfferMsg.S2C_UpdateFight_14610.newBuilder();
      builder.setFightNum(fightNum);
      builder.setBuyNum(buyNum);
      this.player.sendMsg(builder.build());
   }

   public int enterBattle(BattleDao battleDao) {
      PlayerPublicDao publicDao = this.player.getPublicDao();
      if (publicDao.unionId <= 0) {
         return 23;
      } else {
         OfferPersonDao offerPersonDao = (OfferPersonDao)this.player.getData("tb_offer_person", this.player.getPlayerId());
         int offerChallengeNum = this.configManager.getIntDefault("offerChallengeNum", 3);
         if (offerPersonDao.fight >= offerChallengeNum + offerPersonDao.buy) {
            this.logger.info("今日挑战次数已达上限，提升VIP可购买挑战次数");
            return 61159;
         } else {
            ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_OFFER_REWARD);
            CrossUnionOfferMsg.S2CR_Fight_14709.Builder builder = CrossUnionOfferMsg.S2CR_Fight_14709.newBuilder();
            builder.setCode(battleDao.modelId);
            builder.setHeroArrayingData(ByteString.copyFrom(arrayingMirror.toByteArray()));
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            return 1;
         }
      }
   }

   public void endBattle(BattleDao battleDao) {
      PlayerMsg.ShowType showType = PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW;
      if (battleDao.rewards.size() > 0) {
         this.player.addResource(battleDao.rewards, showType, 71, 7101, 0, 0, "");
      }

   }

   public void requestOfferDetial(int code) {
      CrossUnionOfferMsg.S2CR_OfferDetail_14715.Builder builder = CrossUnionOfferMsg.S2CR_OfferDetail_14715.newBuilder();
      builder.setCode(code);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public void gmOp(String op) {
      String[] str = op.split(",");
      switch (str[0]) {
         case "enterview":
            this.C2S_EnterView_14601(UnionOfferMsg.C2S_EnterView_14601.newBuilder().setEnter(Integer.parseInt(str[1])).build(), "");
            break;
         case "pulish":
            this.C2S_PublishOffer_14603((UnionOfferMsg.C2S_PublishOffer_14603)null, (String)null);
            break;
         case "autopublish":
            this.offerMgr.pushTaskEx("checkPublishOffer", new Object[]{this.player.getPlayerId(), Integer.parseInt(str[1])});
            break;
         case "battle":
            BattleMsg.C2S_BattleBegin_6107.Builder battleBuilder = BattleMsg.C2S_BattleBegin_6107.newBuilder();
            battleBuilder.setType(3103);
            battleBuilder.setModelId(Integer.parseInt(str[1]));
            BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
            battlePart.begin(battleBuilder.build(), "");
            break;
         case "record":
            this.C2S_Record_14611((UnionOfferMsg.C2S_Record_14611)null, (String)null);
            break;
         case "publicbysystem":
            this.S2CR_SystemPublish_14729(Integer.parseInt(str[1]), Integer.parseInt(str[2]));
            break;
         case "offerdetail":
            this.requestOfferDetial(Integer.parseInt(str[1]));
            break;
         case "pointrank":
            this.requestPointRank(Integer.parseInt(str[1]));
            break;
         case "settlement":
            this.gmSettlement(str[1]);
      }

   }

   public void S2CR_SystemPublish_14729(int num, int unionCopyId) {
      CrossUnionOfferMsg.S2CR_SystemPublish_14729.Builder builder = CrossUnionOfferMsg.S2CR_SystemPublish_14729.newBuilder();
      builder.setNum(num);
      builder.setUnionCopyid(unionCopyId);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public void gmSettlement(String serverIds) {
      CrossUnionOfferMsg.S2CR_SETTLEMENT_14751.Builder builder = CrossUnionOfferMsg.S2CR_SETTLEMENT_14751.newBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }
}
