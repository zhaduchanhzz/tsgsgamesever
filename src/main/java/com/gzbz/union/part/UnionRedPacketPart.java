package com.gzbz.union.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.db.UnionRedPacketGetDao;
import com.gzbz.db.UnionRedPacketGiveDao;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.UnionRedPacketModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.UnionMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import misc.RandomUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class UnionRedPacketPart extends UnionPart {
   private final WorldMgr worldMgr;

   public UnionRedPacketPart(WorldMgr worldMgr) {
      this.worldMgr = worldMgr;
   }

   @MsgHandlerAnno
   public void C2S_UnionRedPacketInfo_6961(UnionMsg.C2S_UnionRedPacketInfo_6961 msg, String source) {
      this.unionMgrParent.pushTask(this::sendUnionRedPacketInfo);
   }

   @MsgHandlerAnno
   public void C2S_UnionGetRedPacket_6963(UnionMsg.C2S_UnionGetRedPacket_6963 msg, String source) {
      if (!this.checkJoin()) {
         this.sendGetRedPacketResult(23, 0, "玩家{}抢军团红包失败,玩家没有加入军团", this.player.getPlayerId());
      } else {
         int id = msg.getId();
         this.unionMgrParent.pushTask(() -> {
            UnionMgr unionMgr = super.getUnionMgr();
            UnionRedPacketGiveDao unionRedPacketGiveDao = unionMgr.getRedPacket(id);
            if (unionRedPacketGiveDao == null) {
               this.sendGetRedPacketResult(0, id, "玩家{}抢{}军团红包失败,红包不存在", this.player.getPlayerId(), id);
            } else if (unionMgr.getGotRedPacketRecord(id).containsKey(this.player.getPlayerId())) {
               this.sendGetRedPacketResult(9015, id, "玩家{}抢{}军团红包失败,红包已抢过", this.player.getPlayerId(), id);
            } else {
               UnionRedPacketModel unionRedPacketModel = (UnionRedPacketModel)ApplicationContextProvider.getModelPoolEntity("unionRedpacket", unionRedPacketGiveDao.redPacketId);
               if (unionRedPacketModel == null) {
                  this.sendGetRedPacketResult(0, id, "玩家{}抢{}军团红包失败,红包不存在", this.player.getPlayerId(), unionRedPacketGiveDao.redPacketId);
               } else {
                  int redPacketNum = unionRedPacketGiveDao.redPacketNum;
                  int redPacketItemNum = unionRedPacketGiveDao.redPacketItemNum;
                  if (redPacketNum > 0 && redPacketItemNum > 0) {
                     if (redPacketNum > 1) {
                        redPacketItemNum = calGetRedPacketMoney(unionRedPacketGiveDao.redPacketItemNum / unionRedPacketGiveDao.redPacketNum * 2);
                     }

                     unionRedPacketGiveDao.redPacketItemNum -= redPacketItemNum;
                     --unionRedPacketGiveDao.redPacketNum;
                     unionRedPacketGiveDao.updateOp();
                     this.player.pushTask(() -> this.player.addResource(unionRedPacketModel.getRedPacketItemType(), unionRedPacketModel.getRedPacketItemId(), redPacketItemNum, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 9, 924, 0, 0, ""));
                     unionMgr.recordGotRedPacket(id, redPacketItemNum, this.player.getPlayerId());
                     if (unionRedPacketGiveDao.redPacketNum <= 0) {
                        Map<Integer, UnionRedPacketGetDao> redPacketGetDaoMap = unionMgr.getGotRedPacketRecord(unionRedPacketGiveDao.id);
                        Optional<UnionRedPacketGetDao> opt = redPacketGetDaoMap.values().stream().max(Comparator.comparing((unionRedPacketGetDao) -> unionRedPacketGetDao.money));
                        if (opt.isPresent()) {
                           int luckyPlayer = ((UnionRedPacketGetDao)opt.get()).playerId;
                           GamePlayer gamePlayer = this.worldMgr.getPlayerById(luckyPlayer);
                           if (gamePlayer != null) {
                              gamePlayer.pushTask(() -> gamePlayer.triggerTask(328, 0, 1L, 1));
                           }
                        }
                     }

                     unionMgr.notifyRedPacket(unionRedPacketGiveDao);
                     this.sendGetRedPacketResult(1, id, (String)null);
                  } else {
                     this.sendGetRedPacketResult(9019, id, "玩家{}抢{}军团红包失败,红包被抢完了", this.player.getPlayerId(), id);
                  }
               }
            }
         });
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionRedPacketRank_6965(UnionMsg.C2S_UnionRedPacketRank_6965 msg, String source) {
      UnionMsg.S2C_UnionRedPacketRank_6966.Builder resp = UnionMsg.S2C_UnionRedPacketRank_6966.newBuilder();
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.sendMsg(resp.build());
         } else {
            UnionMgr unionMgr = super.getUnionMgr();
            unionMgr.getUnionRedPacketRank().forEach((key, value) -> {
               long money = value.money;
               int num = value.num;
               if (money > 0L && num > 0) {
                  UnionMsg.UnionRedPacketRank.Builder redPacketRank = UnionMsg.UnionRedPacketRank.newBuilder();
                  redPacketRank.setMoney(money);
                  redPacketRank.setPlayerName(value.playerName);
                  redPacketRank.setNum(num);
                  redPacketRank.setPlayerId(key);
                  resp.addRank(redPacketRank);
               }

            });
            this.player.sendMsg(resp.build());
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_UnionRedPacketList_6967(UnionMsg.C2S_UnionRedPacketList_6967 msg, String source) {
      this.unionMgrParent.pushTask(() -> {
         UnionMsg.S2C_UnionRedPacketList_6968.Builder resp = UnionMsg.S2C_UnionRedPacketList_6968.newBuilder();
         if (!this.checkJoin()) {
            this.player.sendMsg(resp.build());
         } else {
            UnionMgr unionMgr = super.getUnionMgr();
            Map<Integer, UnionRedPacketGiveDao> redPacketGiveDaoMap = unionMgr.getUnionRedPackets();
            redPacketGiveDaoMap.values().forEach((unionRedPacketGiveDao) -> {
               if (unionRedPacketGiveDao.giveTime + 86400000L > System.currentTimeMillis()) {
                  resp.addRedPacket(unionMgr.buildRedPacket(unionRedPacketGiveDao));
               }

               if (unionMgr.getGotRedPacketRecord(unionRedPacketGiveDao.id).containsKey(this.player.getPlayerId())) {
                  resp.addGotIds(unionRedPacketGiveDao.id);
               }

            });
            this.player.sendMsg(resp.build());
         }
      });
   }

   private void sendUnionRedPacketInfo() {
      UnionMsg.S2C_UnionRedPacketInfo_6962.Builder resp = UnionMsg.S2C_UnionRedPacketInfo_6962.newBuilder();
      if (!this.checkJoin()) {
         this.player.failure(23);
      } else {
         resp.setResult(1);
         UnionMemberDao unionMemberDao = super.getUnionMember();
         unionMemberDao.redPacketGave.forEach((key, value) -> {
            UnionMsg.UnionRedPacketData.Builder redPacket = UnionMsg.UnionRedPacketData.newBuilder();
            redPacket.setId(key);
            redPacket.setLeftNum(value);
            resp.addData(redPacket);
         });
         this.player.sendMsg(resp.build());
      }
   }

   public void redPacketRecharge(int buyId, List<ResourceModel> resourceModels) {
      if (!this.checkJoin()) {
         this.logger.error("玩家没有加入军团");
      } else {
         UnionRedPacketModel unionRedPacketModel = this.getByGift(buyId);
         if (unionRedPacketModel == null) {
            this.logger.error("id为{}的军团红包不存在", buyId);
         } else {
            unionRedPacketModel.getGrantItem().forEach((resourceModel) -> resourceModel.addResourceToList(resourceModels));
         }
      }
   }

   public void giveRedPacket(ShopLimitModel shopLimitModel) {
      UnionRedPacketModel unionRedPacketModel = this.getByGift(shopLimitModel.getId());
      if (unionRedPacketModel == null) {
         this.logger.error("{}发军团红包,红包{}不存在", this.player.getPlayerId(), shopLimitModel.getId());
      } else {
         PlayerDao playerDao = this.player.getPlayerDao();
         this.unionMgrParent.pushTask(() -> {
            if (!this.checkJoin()) {
               this.logger.error("{}发军团红包失败,没有加入军团", this.player.getPlayerId());
            } else {
               UnionMemberDao unionMemberDao = super.getUnionMember();
               UnionMgr unionMgr = super.getUnionMgr();
               int money = unionMgr.giveRedPacket(unionRedPacketModel, playerDao);
               unionMemberDao.redPacketGave.put(shopLimitModel.getActivityId(), (Integer)unionMemberDao.redPacketGave.getOrDefault(shopLimitModel.getActivityId(), 0) + 1);
               unionMemberDao.redPacketTotal += (long)money;
               ++unionMemberDao.redPacketNum;
               unionMemberDao.updateOp();
               this.sendUnionRedPacketInfo();
               this.player.pushTask(() -> {
                  this.player.triggerTask(505, 0, 1L, 1);
                  if (unionRedPacketModel.getRedPacketItemType() == 1 && unionRedPacketModel.getRedPacketItemId() == PlayerDefine.PLAYER_GOLD) {
                     this.player.triggerTask(331, 0, (long)unionRedPacketModel.getRedPacketItemNum(), 1);
                  }

               });
            }
         });
      }
   }

   private UnionRedPacketModel getByGift(int giftId) {
      Map<Integer, UnionRedPacketModel> unionRedPacketModelMap = ApplicationContextProvider.<Integer, UnionRedPacketModel>getModelPoolMap("unionRedpacket");
      Optional<UnionRedPacketModel> unionRedPacketModelOptional = unionRedPacketModelMap.values().stream().filter((unionRedPacketModel1) -> unionRedPacketModel1.getGiftId() == giftId).findFirst();
      if (!unionRedPacketModelOptional.isPresent()) {
         this.logger.error("军团红包{}不存在", giftId);
         return null;
      } else {
         return (UnionRedPacketModel)unionRedPacketModelOptional.get();
      }
   }

   private void sendGetRedPacketResult(int code, int id, String message, Object... args) {
      UnionMsg.S2C_UnionGetRedPacket_6964.Builder resp = UnionMsg.S2C_UnionGetRedPacket_6964.newBuilder();
      resp.setResult(code);
      if (code != 1 && !StringUtils.isEmpty(message)) {
      }

      resp.setId(id);
      this.player.sendMsg(resp.build());
   }

   private static int calGetRedPacketMoney(int max) {
      return RandomUtil.randInt(1, max);
   }

   public static void main(String[] args) {
      for(int i = 0; i < 100; ++i) {
         int money = 600000;
         int num = 15;
         int maxIndex = 0;
         int maxMoney = 0;
         int minIndex = 0;
         int minMoney = 600000;

         while(num > 0) {
            int getMoney;
            if (num == 1) {
               getMoney = money;
            } else {
               getMoney = calGetRedPacketMoney(money / num * 2);
            }

            money -= getMoney;
            --num;
            if (getMoney < minMoney) {
               minMoney = getMoney;
               minIndex = 15 - num;
            }

            if (getMoney > maxMoney) {
               maxMoney = getMoney;
               maxIndex = 15 - num;
            }
         }

         System.out.println("最大金额:" + maxMoney);
         System.out.println("最大金额在第:" + maxIndex + "个");
         System.out.println("最小金额:" + minMoney);
         System.out.println("最小金额在第:" + minIndex + "个");
         System.out.println("");
      }

   }
}
