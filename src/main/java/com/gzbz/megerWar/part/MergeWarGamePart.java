package com.gzbz.megerWar.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.google.protobuf.ByteString;
import com.gzbz.db.MergeWarInfoDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.megerWar.CoreWarMgr;
import com.gzbz.megerWar.bean.MergeWarOpenData;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossCoreWarMsg;
import com.gzbz.protobuf.MergeWarGameMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.MergeWarGameTaskPart;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import java.util.List;
import java.util.Objects;
import misc.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MergeWarGamePart extends PlayerPart {
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private ConfigManager configManager;
   private final CoreWarMgr coreWarMgr;

   public MergeWarGamePart(CoreWarMgr coreWarMgr) {
      this.coreWarMgr = coreWarMgr;
   }

   public void loginHandle() {
      this.sendNextTime();
      MergeWarInfoDao mergeWarInfoDao = this.coreWarMgr.getMergeWarInfoDao();
      if (mergeWarInfoDao.isOpening && mergeWarInfoDao.stage == 2) {
         CrossCoreWarMsg.S2CR_BaseInfo_21131.Builder builder = CrossCoreWarMsg.S2CR_BaseInfo_21131.newBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         if (this.isJoinGame()) {
            MergeWarGameTaskPart mergeWarGameTaskPart = (MergeWarGameTaskPart)this.player.getMgrPart(MergeWarGameTaskPart.class);
            mergeWarGameTaskPart.trigger();
         }
      }

   }

   @MsgHandlerAnno
   public void C2S_WarInfo_19501(MergeWarGameMsg.C2S_WarInfo_19501 msg, String source) {
      MergeWarInfoDao mergeWarInfoDao = this.coreWarMgr.getMergeWarInfoDao();
      if (mergeWarInfoDao.isOpening && mergeWarInfoDao.stage == 2) {
         MergeWarGameTaskPart mergeWarGameTaskPart = (MergeWarGameTaskPart)this.player.getMgrPart(MergeWarGameTaskPart.class);
         mergeWarGameTaskPart.trigger();
         boolean leave = msg.getLeave();
         if (!leave) {
            this.player.uploadCrossPlayer();
         }

         CrossCoreWarMsg.S2CR_WarInfo_21101.Builder builder = CrossCoreWarMsg.S2CR_WarInfo_21101.newBuilder();
         builder.setLeave(leave);
         builder.setIsJoin(this.isJoinGame());
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_Move_19505(MergeWarGameMsg.C2S_Move_19505 msg, String source) {
      if (this.isJoinGame()) {
         ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         if (arrayingMirror != null && !arrayingMirror.arrayingHeroIsEmpty()) {
            int reuslt = this.isInSubState(13);
            if (reuslt != 1) {
               this.player.failure(reuslt);
            } else {
               List<Integer> gridIdList = msg.getGridIdList();
               if (gridIdList.size() <= 1) {
                  this.logger.info("玩家{}移动路线错误{}", this.player.getPlayerId(), gridIdList);
               } else if (gridIdList.size() > this.configManager.getIntDefault("mergeWarGamePerMove", 100)) {
                  this.logger.info("一次最多只能移动 {} 格", this.configManager.getIntDefault("mergeWarGamePerMove", 100));
               } else {
                  CrossCoreWarMsg.S2CR_Move_21103.Builder builder = CrossCoreWarMsg.S2CR_Move_21103.newBuilder();
                  builder.addAllGridId(gridIdList);
                  builder.setAuto(msg.getAuto());
                  this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
               }
            }
         } else {
            this.player.failure(76064);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_AtkBuilding_19509(MergeWarGameMsg.C2S_AtkBuilding_19509 msg, String source) {
      if (this.isJoinGame()) {
         int reuslt = this.isInSubState(13);
         if (reuslt != 1) {
            this.player.failure(reuslt);
         } else {
            CrossCoreWarMsg.S2CR_AtkBuilding_21105.Builder builder = CrossCoreWarMsg.S2CR_AtkBuilding_21105.newBuilder();
            builder.setGridId(msg.getGridId());
            builder.setSkipBattle(msg.getSkipBattle());
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Repair_19511(MergeWarGameMsg.C2S_Repair_19511 msg, String source) {
   }

   @MsgHandlerAnno
   public void C2S_AtkPlayer_19521(MergeWarGameMsg.C2S_AtkPlayer_19521 msg, String source) {
      if (this.isJoinGame()) {
         int reuslt = this.isInSubState(13);
         if (reuslt != 1) {
            this.player.failure(reuslt);
         } else {
            CrossCoreWarMsg.S2CR_AtkPlayer_21107.Builder builder = CrossCoreWarMsg.S2CR_AtkPlayer_21107.newBuilder();
            builder.setGridId(msg.getGridId());
            builder.setPlayerId(msg.getPlayerId());
            builder.setSkipBattle(msg.getSkipBattle());
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ScoreReward_19525(MergeWarGameMsg.C2S_ScoreReward_19525 msg, String source) {
      if (this.isJoinGame()) {
         CrossCoreWarMsg.S2CR_ScoreReward_21111.Builder builder = CrossCoreWarMsg.S2CR_ScoreReward_21111.newBuilder();
         builder.setScoreId(msg.getScoreId());
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_SetDestGrid_19537(MergeWarGameMsg.C2S_SetDestGrid_19537 msg, String source) {
      if (this.isJoinGame()) {
         PlayerPublicDao playerPublicDao = this.player.getPublicDao();
         if (playerPublicDao.unionId != 0) {
            UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
            UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerPublicDao.unionId);
            if (!Objects.isNull(unionMgr)) {
               UnionMemberDao unionMember = unionMgr.getUnionMember(playerPublicDao.playerId);
               if (unionMember.position != 1 && unionMember.position != 2) {
                  this.player.failure(76065);
                  return;
               }

               CrossCoreWarMsg.S2CR_SetDestGrid_21121.Builder builder = CrossCoreWarMsg.S2CR_SetDestGrid_21121.newBuilder();
               builder.setType(msg.getType());
               builder.setGridId(msg.getGridId());
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            }

         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ActRank_19549(MergeWarGameMsg.C2S_ActRank_19549 msg, String source) {
      CrossCoreWarMsg.S2CR_ActRank_21127.Builder builder = CrossCoreWarMsg.S2CR_ActRank_21127.newBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ChangeMove_19551(MergeWarGameMsg.C2S_ChangeMove_19551 msg, String source) {
      if (this.isJoinGame()) {
         CrossCoreWarMsg.S2CR_ChangeMove_21151.Builder builder = CrossCoreWarMsg.S2CR_ChangeMove_21151.newBuilder();
         builder.setGrid(msg.getGrid());
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_LastInfo_19553(MergeWarGameMsg.C2S_LastInfo_19553 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_NextTime_19555(MergeWarGameMsg.C2S_NextTime_19555 msg, String source) {
      this.sendNextTime();
   }

   @MsgHandlerAnno
   public void C2S_PromoteInfo_19557(MergeWarGameMsg.C2S_PromoteInfo_19557 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   private void sendNextTime() {
      MergeWarOpenData nextMergeWarOpenData = this.coreWarMgr.getNextMergeWarOpenData();
      if (nextMergeWarOpenData != null && DateUtil.getIntTime(System.currentTimeMillis()) < nextMergeWarOpenData.openTime) {
         this.sendNextTime(nextMergeWarOpenData);
      } else {
         CrossCoreWarMsg.S2CR_EarliestOpenDay_21157.Builder builder = CrossCoreWarMsg.S2CR_EarliestOpenDay_21157.newBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   public void sendNextTime(MergeWarOpenData mergeWarOpenData) {
      MergeWarGameMsg.S2C_NextTime_19556.Builder builder = MergeWarGameMsg.S2C_NextTime_19556.newBuilder();
      if (mergeWarOpenData != null) {
         builder.setNextTime(mergeWarOpenData.openTime);
         builder.setModelGroup(mergeWarOpenData.group);
      } else {
         builder.setNextTime(0);
         builder.setModelGroup(0);
      }

      this.player.sendMsg(builder.build());
   }

   public int isInSubState(int state) {
      int subState = this.coreWarMgr.getSubState();
      if (subState == state) {
         return 1;
      } else if (subState == 0) {
         return 76078;
      } else {
         return subState >= 14 ? 76080 : 76079;
      }
   }

   public void sendArrayingToCross() {
      int unionId = this.player.getPublicDao().unionId;
      if (unionId != 0) {
         MergeWarInfoDao mergeWarInfoDao = this.coreWarMgr.getMergeWarInfoDao();
         if (mergeWarInfoDao.promoteUnion == unionId) {
            CrossCoreWarMsg.S2CR_PlayerArraying_21133.Builder builder = CrossCoreWarMsg.S2CR_PlayerArraying_21133.newBuilder();
            ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
            if (arrayingMirror != null) {
               byte[] bytes = arrayingMirror.toByteArray();
               builder.setArraying(ByteString.copyFrom(bytes));
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            }
         }
      }
   }

   public boolean isJoinGame() {
      MergeWarInfoDao mergeWarInfoDao = this.coreWarMgr.getMergeWarInfoDao();
      if (!mergeWarInfoDao.isOpening) {
         return false;
      } else {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (playerDao.unionId == 0) {
            return false;
         } else if (playerDao.unionId != mergeWarInfoDao.promoteUnion) {
            return false;
         } else {
            UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
            UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerDao.unionId);
            if (unionMgr == null) {
               return false;
            } else {
               UnionMemberDao unionMemberDao = unionMgr.getUnionMember(this.player.getPlayerId());
               if (unionMemberDao == null) {
                  return false;
               } else {
                  return (int)(unionMemberDao.joinTime / 1000L) <= mergeWarInfoDao.secondOpenTime;
               }
            }
         }
      }
   }

   public void gmTest(String string) {
      String[] arr = string.split(",");
      switch (arr[0]) {
         case "nextopen":
            MergeWarOpenData mergeWarOpenData = this.coreWarMgr.getNextMergeWarOpenData();
            if (mergeWarOpenData != null) {
               this.logger.info("【双城之战】当前时间：{} 下次开启时间：{}", DateUtil.transferLongToDate(System.currentTimeMillis()), DateUtil.transferLongToDate((long)mergeWarOpenData.openTime * 1000L));
            } else {
               this.logger.info("【双城之战】开启中");
            }
            break;
         case "memberenter":
            int memberNum = arr.length > 1 ? Integer.parseInt(arr[1]) : 10;
            this.gmMemberEnter(memberNum);
            break;
         case "end":
            MergeWarInfoDao mergeWarInfoDao = this.coreWarMgr.getMergeWarInfoDao();
            mergeWarInfoDao.isOpening = false;
            mergeWarInfoDao.updateOp();
            this.logger.info("【双城之战】gm命令关闭入口 serverId:{}", this.player.getServerId());
            break;
         default:
            CrossCoreWarMsg.S2CR_GM_21171.Builder builder = CrossCoreWarMsg.S2CR_GM_21171.newBuilder();
            builder.setStr(string);
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   public void gmMemberEnter(int num) {
      int unionId = this.player.getPublicDao().unionId;
      UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
      UnionDao unionDao = (UnionDao)unionMgrParent.getUnionDaoMap().get(unionId);
      if (unionDao == null) {
         this.logger.info("【双城之战】自己没有加入军团");
      } else {
         this.coreWarMgr.pushTask(() -> this.coreWarMgr.gmAddUnionMember(unionId, num));
      }
   }
}
