package com.gzbz.unionOffer;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import com.gzbz.db.OfferPersonDao;
import com.gzbz.db.OfferUnionDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.OfferDetailModel;
import com.gzbz.model.OfferHeroModel;
import com.gzbz.model.OfferShopLvModel;
import com.gzbz.model.UnionCopyModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossUnionOfferMsg;
import com.gzbz.protobuf.UnionOfferMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.RandomUtil;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@MgrAnno
@Component
public class OfferMgr extends GameMgr {
   Logger logger = LoggerFactory.getLogger(OfferMgr.class);
   private final WorldMgr worldMgr;
   private final OnLineMgr onLineMgr;
   private final CrossNettyClient crossNettyClient;
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private MailWorldMgr mailWorldMgr;
   private ConcurrentHashMap<Integer, OfferUnionDao> offerUnionDaoMap = new ConcurrentHashMap();

   public OfferMgr(WorldMgr worldMgr, OnLineMgr onLineMgr, CrossNettyClient crossNettyClient) {
      this.worldMgr = worldMgr;
      this.onLineMgr = onLineMgr;
      this.crossNettyClient = crossNettyClient;
   }

   protected void init() throws Exception {
      Map<Integer, OfferUnionDao> map = this.gameCachePool.getAllTableByMap("tb_offer_union");

      for(Map.Entry<Integer, OfferUnionDao> entry : map.entrySet()) {
         this.offerUnionDaoMap.put(entry.getKey(), entry.getValue());
      }

   }

   public OfferUnionDao getOfferUnionDao(int unionId) {
      if (!this.offerUnionDaoMap.containsKey(unionId)) {
         OfferUnionDao offerUnionDao = new OfferUnionDao();
         offerUnionDao.unionId = unionId;
         this.offerUnionDaoMap.put(unionId, offerUnionDao);
         this.gameCachePool.insertDao(offerUnionDao, true);
      }

      return (OfferUnionDao)this.offerUnionDaoMap.get(unionId);
   }

   @MsgHandlerAnno
   public void CR2S_PublishOffer_14704(CrossUnionOfferMsg.CR2S_PublishOffer_14704 msg, CrossSubscribeMsg crossSubscribeMsg) {
      UnionOfferMsg.S2C_AddOffer_14604.Builder builder = UnionOfferMsg.S2C_AddOffer_14604.newBuilder();
      builder.setInfo(msg.getOffer());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
      UnionOfferMsg.OfferRewardInfo offerRewardInfo = msg.getOffer();
      if (offerRewardInfo.getServerId() > 0 && offerRewardInfo.getUnionId() > 0) {
         OfferUnionDao offerUnionDao = this.getOfferUnionDao(offerRewardInfo.getUnionId());
         if (offerRewardInfo.getType() == 1) {
            if (offerRewardInfo.getServerId() == this.worldMgr.GAME_SERVER_ID && offerRewardInfo.getPlayerId() > 0) {
               GamePlayer gamePlayer = this.worldMgr.getPlayerById(offerRewardInfo.getPlayerId());
               if (gamePlayer != null) {
                  OfferPersonDao offerPersonDao = (OfferPersonDao)gamePlayer.getData("tb_offer_person", offerRewardInfo.getPlayerId());
                  ++offerPersonDao.publishNum;
                  offerPersonDao.updateOp();
               }
            }

            ++offerUnionDao.publishNum;
         } else if (offerRewardInfo.getType() == 2) {
            ++offerUnionDao.hideNum;
         }

         offerUnionDao.updateOp();
      }

   }

   @MsgHandlerAnno
   public void CR2S_UpdateOffer_14706(CrossUnionOfferMsg.CR2S_UpdateOffer_14706 msg, CrossSubscribeMsg crossSubscribeMsg) {
      UnionOfferMsg.S2C_UpdateOffer_14606.Builder builder = UnionOfferMsg.S2C_UpdateOffer_14606.newBuilder();
      builder.setInfo(msg.getInfo());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void CR2S_DelOffer_14708(CrossUnionOfferMsg.CR2S_DelOffer_14708 msg, CrossSubscribeMsg crossSubscribeMsg) {
      UnionOfferMsg.S2C_DelOffer_14608.Builder builder = UnionOfferMsg.S2C_DelOffer_14608.newBuilder();
      builder.addAllCodes(msg.getCodesList());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void CR2S_RamageRand_14724(CrossUnionOfferMsg.CR2S_RamageRand_14724 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int rewardGroup = msg.getRewardGroup();
      OfferHeroModel offerHeroModel = (OfferHeroModel)ApplicationContextProvider.getModelPoolEntity("offerhero", msg.getOfferHeroId());
      List<CrossUnionOfferMsg.RankInfo> damageRankList = new ArrayList(msg.getRankInfoList());
      Map<Integer, CentreAwardModel> centreAwardMap = (Map)ApplicationContextProvider.getModelPoolEntity("customCentreAward", rewardGroup);

      for(CentreAwardModel centreAwardModel : centreAwardMap.values()) {
         Map<Integer, String> offlinePlayerRewardMap = new HashMap();
         Iterator<CrossUnionOfferMsg.RankInfo> iterator = damageRankList.iterator();

         while(iterator.hasNext()) {
            CrossUnionOfferMsg.RankInfo rankInfo = (CrossUnionOfferMsg.RankInfo)iterator.next();
            int rank = rankInfo.getRank();
            int playerId = rankInfo.getId();
            if (rank <= centreAwardModel.getMaxRank() && rank >= centreAwardModel.getMinRank()) {
               GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
               if (gamePlayer != null) {
                  if (gamePlayer.isLogin()) {
                     String format = MessageFormat.format(centreAwardModel.getDesc(), rank, offerHeroModel.getHeroName());
                     MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                     mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), format, centreAwardModel.getItems(), 604800000L, 71, 7104});
                  } else {
                     offlinePlayerRewardMap.put(gamePlayer.getPlayerId(), rank + "@" + offerHeroModel.getHeroName());
                  }

                  this.logger.info("悬赏伤害排名 - 玩家 {} 获得了第 {} 名", gamePlayer.getPlayerId(), rank);
                  iterator.remove();
               }
            }
         }

         if (!offlinePlayerRewardMap.isEmpty()) {
            this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), offlinePlayerRewardMap, 604800000L, 71, 7104, 0);
         }
      }

   }

   @MsgHandlerAnno
   public void CR2S_UnionPointRand_14726(CrossUnionOfferMsg.CR2S_UnionPointRand_14726 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int rewardGroup = this.configManager.getInt("offerRankAward");
      Map<Integer, CentreAwardModel> centreAwardMap = (Map)ApplicationContextProvider.getModelPoolEntity("customCentreAward", rewardGroup);
      if (!CollectionUtils.isEmpty(centreAwardMap)) {
         List<CrossUnionOfferMsg.RankInfo> damageRankList = new ArrayList(msg.getRankInfoList());
         UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);

         for(CentreAwardModel centreAwardModel : centreAwardMap.values()) {
            Map<Integer, String> offlinePlayerRewardMap = new HashMap();
            Iterator<CrossUnionOfferMsg.RankInfo> iterator = damageRankList.iterator();

            while(iterator.hasNext()) {
               CrossUnionOfferMsg.RankInfo rankInfo = (CrossUnionOfferMsg.RankInfo)iterator.next();
               int rank = rankInfo.getRank();
               int unionId = rankInfo.getId();
               if (centreAwardModel.getMinRank() <= rank && centreAwardModel.getMaxRank() >= rank) {
                  UnionMgr unionMgr = unionMgrParent.getUnionMgr(unionId);
                  if (unionMgr == null) {
                     this.logger.info("悬赏 - 找不到军团管理器 unionId:{}", unionId);
                  } else {
                     OfferUnionDao offerUnionDao = this.getOfferUnionDao(unionId);
                     Map<Integer, UnionMemberDao> unionMembers = unionMgr.getUnionMembers();

                     for(Integer playerId : unionMembers.keySet()) {
                        this.logger.info("unionId:{} - 军团成员 plyaerId:{}", unionId, playerId);
                        GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                        if (gamePlayer == null) {
                           this.logger.info("找不到该玩家 playerId:{}", playerId);
                        } else if (!offerUnionDao.members.contains(playerId)) {
                           this.logger.info("该军团成员本周没有参加缉拿悬赏 playerId:{}", playerId);
                        } else if (gamePlayer.isLogin()) {
                           MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                           String format = MessageFormat.format(centreAwardModel.getDesc(), rank);
                           mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), format, centreAwardModel.getItems(), 604800000L, 71, 7106});
                        } else {
                           offlinePlayerRewardMap.put(gamePlayer.getPlayerId(), String.valueOf(rank));
                        }
                     }

                     iterator.remove();
                     offerUnionDao.members.clear();
                     offerUnionDao.updateOp();
                  }
               }
            }

            if (!offlinePlayerRewardMap.isEmpty()) {
               this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), offlinePlayerRewardMap, 604800000L, 71, 7106, 0);
            }
         }

      }
   }

   @MsgHandlerAnno
   public void CR2S_UpdateUnionPoint_14728(CrossUnionOfferMsg.CR2S_UpdateUnionPoint_14728 msg, CrossSubscribeMsg crossSubscribeMsg) {
      for(CommonMsg.MapDataII mapDataII : msg.getUnionPointList()) {
         this.updateUnionPoint(mapDataII.getKey(), mapDataII.getValue());
      }

   }

   @MsgHandlerAnno
   public void CR2S_DailyUpdate_14734(CrossUnionOfferMsg.CR2S_DailyUpdate_14734 msg, CrossSubscribeMsg crossSubscribeMsg) {
      UnionOfferMsg.S2C_DailyUpdate_14634.Builder builder = UnionOfferMsg.S2C_DailyUpdate_14634.newBuilder();
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @TaskMethod
   public void checkPublishOffer(int playerId, int unionCopyId) {
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
      PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
      this.logger.info("悬赏 - 挑战军团副本，检测是否可自动发布悬赏 playerName:{}, unionId:{}", playerPublicDao.playerName, unionCopyId);
      if (playerPublicDao.unionId > 0) {
         OfferPersonDao offerPersonDao = (OfferPersonDao)gamePlayer.getData("tb_offer_person", playerId);
         int offerSetLimit1 = this.configManager.getIntDefault("offerSetLimit1", 3);
         if (offerPersonDao.publishNum >= offerSetLimit1) {
            this.logger.info("悬赏 - 个人发布达到上限 playerName:{} 已发布：{} 发布上限:{}", new Object[]{playerPublicDao.playerName, offerPersonDao.publishNum, offerSetLimit1});
         } else {
            int activeNum = this.getUnionActiveNum(playerPublicDao.unionId);
            int offerActPeople = this.configManager.getIntDefault("offerActPeople", 10);
            if (activeNum < offerActPeople) {
               this.logger.info("悬赏 - 活跃人数不足 playerName:{} unionId:{} 活跃人数：{} 需要人数：{}", new Object[]{playerPublicDao.playerName, playerPublicDao.unionId, activeNum, offerActPeople});
            } else {
               TreeMap<Integer, Integer> limitTreeMap = this.configManager.getIntTreeMap("offerSetLimit2");
               int unionOffsetLimit2 = (Integer)limitTreeMap.lastEntry().getValue();

               for(Map.Entry<Integer, Integer> entry : limitTreeMap.entrySet()) {
                  if ((Integer)entry.getKey() >= activeNum) {
                     unionOffsetLimit2 = (Integer)entry.getValue();
                     break;
                  }
               }

               OfferUnionDao offerDao = this.getOfferUnionDao(playerPublicDao.unionId);
               if (offerDao.publishNum >= unionOffsetLimit2) {
                  this.logger.info("悬赏 - 军团发布数量达到上限 playerName:{}, 发布数量:{}, 发布上限:{}", new Object[]{playerPublicDao.playerName, offerDao.publishNum, unionOffsetLimit2});
               } else {
                  UnionCopyModel unionCopyModel = (UnionCopyModel)ApplicationContextProvider.getModelPoolEntity("unionCopy", unionCopyId);
                  if (unionCopyModel.getOfferid() == 0) {
                     this.logger.info("悬赏 - 军团副本配置的悬赏id 是0，不需要发布 unionCopyId:{}", unionCopyId);
                  } else {
                     int random = RandomUtil.randInt(1000);
                     this.publishOffer(1, playerPublicDao.serverId, playerId, playerPublicDao.unionId, random, unionCopyModel.getOfferid());
                  }
               }
            }
         }
      }
   }

   private int getUnionActiveNum(int unionId) {
      int count = 0;
      UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
      UnionMgr unionMgr = unionMgrParent.getUnionMgr(unionId);
      int offerActTime = this.configManager.getIntDefault("offerActTime", 180);

      for(UnionMemberDao memberDao : unionMgr.getUnionMembers().values()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(memberDao.playerId);
         if (gamePlayer != null) {
            PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
            if (playerPublicDao.logoutTime == 0L || playerPublicDao.logoutTime + (long)(offerActTime * 1000) > System.currentTimeMillis()) {
               ++count;
            }
         }
      }

      return count;
   }

   @TaskMethod
   public void publishOffer(int type, int serverId, int playerId, int unionId, int random, int offerId) {
      int offerSetOdd = this.configManager.getIntDefault("offerSetOdd", 500);
      if (type == 1 && random > offerSetOdd) {
         this.logger.info("随机值为{},在概率范围{}外,不发布悬赏", random, offerSetOdd);
      } else {
         OfferDetailModel detailModel = (OfferDetailModel)ApplicationContextProvider.getModelPoolEntity("offerDetail", offerId);
         if (detailModel == null) {
            this.logger.info("发布的悬赏不存在 offerId:{}", offerId);
         } else {
            CrossUnionOfferMsg.S2CR_PublishOffer_14703.Builder builder = CrossUnionOfferMsg.S2CR_PublishOffer_14703.newBuilder();
            builder.setUnionId(unionId);
            builder.setPlayerId(playerId);
            builder.setOfferId(offerId);
            builder.setType(type);
            this.crossNettyClient.sendCross(serverId, playerId, builder.build());
         }
      }
   }

   @TaskMethod
   public void updatePoint(int unionId, int playerId, int point, boolean bKill) {
      if (unionId > 0) {
         OfferUnionDao offerUnionDao = this.getOfferUnionDao(unionId);
         ++offerUnionDao.fight;
         if (bKill) {
            ++offerUnionDao.kill;
         }

         offerUnionDao.members.add(playerId);
         offerUnionDao.updateOp();
         this.updateUnionPoint(unionId, point);
      }
   }

   private void updateUnionPoint(int unionId, int point) {
      OfferUnionDao offerUnionDao = this.getOfferUnionDao(unionId);
      offerUnionDao.point += point;
      offerUnionDao.updateOp();
      this.logger.info("悬赏 - unionId:{} 军团积分更新 增加积分:{} 增加后:{}", new Object[]{unionId, point, offerUnionDao.point});
      OfferShopLvModel offerShopLvModel = (OfferShopLvModel)ApplicationContextProvider.getModelPoolEntity("offerShoplv", offerUnionDao.shopLv);
      if (offerShopLvModel == null) {
         this.logger.warn("悬赏商城等级错误 shopLv:{}", offerUnionDao.shopLv);
      } else if (offerUnionDao.point < offerShopLvModel.getMinNum() || offerUnionDao.point > offerShopLvModel.getMaxNum()) {
         int newShopLv = offerUnionDao.shopLv + 1;

         Map<Integer, OfferShopLvModel> modelMap;
         for(modelMap = ApplicationContextProvider.<Integer, OfferShopLvModel>getModelPoolMap("offerShoplv"); modelMap.containsKey(newShopLv); ++newShopLv) {
            offerShopLvModel = (OfferShopLvModel)modelMap.get(newShopLv);
            if (offerUnionDao.point >= offerShopLvModel.getMinNum() && offerUnionDao.point <= offerShopLvModel.getMaxNum()) {
               break;
            }
         }

         newShopLv = modelMap.containsKey(newShopLv) ? newShopLv : modelMap.size();
         this.logger.info("悬赏 - 等级发送变化 原来等级:{} 变化后等级:{}", offerUnionDao.shopLv, newShopLv);
         offerUnionDao.shopLv = newShopLv;
         offerUnionDao.updateOp();
      }
   }

   @TaskMethod
   public void sendShopLv(int playerId, int unionId) {
      OfferUnionDao offerUnionDao = this.getOfferUnionDao(unionId);
      UnionOfferMsg.S2C_ShopLv_14614.Builder builder = UnionOfferMsg.S2C_ShopLv_14614.newBuilder();
      builder.setPoint(offerUnionDao.point);
      builder.setShopLv(offerUnionDao.shopLv);
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
      if (gamePlayer != null) {
         gamePlayer.sendMsg(builder.build());
      }

   }

   public void dailyReset() {
      for(OfferUnionDao offerUnionDao : this.offerUnionDaoMap.values()) {
         offerUnionDao.publishNum = 0;
         offerUnionDao.hideNum = 0;
         offerUnionDao.updateOp();
      }

   }
}
