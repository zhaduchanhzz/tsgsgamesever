package com.gzbz.union.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.MergeWarInfoDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.UnionApplyDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.UnionLog;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.db.bean.ChatData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.monarch.MonarchPart;
import com.gzbz.gamePlayer.playerChat.PlayerChatPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.medal.MedalPart;
import com.gzbz.megerWar.CoreWarMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.ConfigModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.UnionAddNumberModel;
import com.gzbz.model.UnionHeadModel;
import com.gzbz.model.UnionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BagMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.UnionExtendMsg;
import com.gzbz.protobuf.UnionMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.bean.PlayerUnionExtend;
import com.gzbz.util.ResCountryDifUtils;
import com.gzbz.util.WordsFilter;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
import misc.MiscUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class UnionPrivilegePart extends UnionPart {
   private final WorldMgr worldMgr;
   private final ChatMgr chatMgr;

   public UnionPrivilegePart(WorldMgr worldMgr, ChatMgr chatMgr) {
      this.worldMgr = worldMgr;
      this.chatMgr = chatMgr;
   }

   @MsgHandlerAnno
   public void C2S_FindUnion_6973(UnionMsg.C2S_FindUnion_6973 msg, String source) {
      String name = msg.getName();
      super.unionMgrParent.pushTask(() -> {
         UnionMsg.S2C_FindUnion_6974.Builder resp = UnionMsg.S2C_FindUnion_6974.newBuilder();
         super.unionMgrParent.getUnionMgrMap().values().forEach((unionMgr) -> {
            if (unionMgr.getUnion().unionName.contains(name)) {
               UnionMsg.UnionData unionData = unionMgr.buildUnionData();
               if (unionData != null) {
                  resp.addUnions(unionData);
               }
            }

         });
         this.player.sendMsg(resp.build());
      });
   }

   @MsgHandlerAnno
   public void C2S_Union_6903(UnionMsg.C2S_Union_6903 msg, String source) {
      if (this.checkJoin()) {
         this.unionMgrParent.pushTask(() -> super.getUnionMgr().sendUnion(this.player));
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionMemberList_6905(UnionMsg.C2S_UnionMemberList_6905 msg, String source) {
      if (!this.checkJoin()) {
         this.player.failure(23);
      } else {
         this.unionMgrParent.pushTask(() -> this.player.sendMsg(super.getUnionMgr().buildMembersMsg()));
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionCreate_6909(UnionMsg.C2S_UnionCreate_6909 msg, String source) {
      if (this.player.isSystemOpen(1410)) {
         String unionName = msg.getUnionName();
         boolean verify = msg.getVerify();
         int verifyLevel = msg.getVerifyLevel();
         int verifyPower = msg.getVerifyPower();
         if (this.checkConditionOfJoin(verifyLevel, verifyPower)) {
            String declaration = ApplicationContextProvider.getConfigString("unionNoticeDefault", "诚挚期待各路人才，有酒喝酒，有肉吃肉。");
            PlayerDao playerDao = this.player.getPlayerDao();
            ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
            int vipLimit = configManager.getInt("unionCreateVipLimit");
            String countryVipLimitStr = configManager.getStr(String.format("%s_%s", "unionCreateVipLimit", this.worldMgr.country));
            if (!countryVipLimitStr.equals("")) {
               vipLimit = Integer.valueOf(countryVipLimitStr);
            }

            if (playerDao.vip_lv < vipLimit) {
               this.sendCreateResult(19, "创建军团失败,玩家VIP等级未达到{},现VIP等级{},玩家{}", vipLimit, playerDao.vip_lv, playerDao.playerId);
            } else {
               PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
               int dailyCreateCount = ApplicationContextProvider.getConfigInt("unionEverydayFoundNum", 0);
               if (dailyCreateCount > 0 && (Integer)playerResetCustomCache.getDailyNum(11, 0) >= dailyCreateCount) {
                  this.player.failure(61138);
               } else {
                  int createUnionAfterTime = ApplicationContextProvider.getConfigInt("unionCreatelimit", 0);
                  if (!ApplicationContextProvider.getConfigString("unionCreatelimit_" + this.worldMgr.country, "").equals("")) {
                     createUnionAfterTime = ApplicationContextProvider.getConfigInt("unionCreatelimit_" + this.worldMgr.country, 0);
                  }

                  int lastCreateUnionTime = (Integer)playerResetCustomCache.getForeverNum(13, 0);
                  if (lastCreateUnionTime > 0) {
                     int passTime = DateUtil.getIntTime(System.currentTimeMillis()) - lastCreateUnionTime;
                     if (passTime < createUnionAfterTime) {
                        String errorStr = "无法创建军团，距离下次军团可创建还需{0}秒";
                        LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "unioncreatelimit");
                        if (languageModel != null) {
                           errorStr = languageModel.getValue();
                        }

                        this.player.failure(53, MessageFormat.format(errorStr, createUnionAfterTime - passTime));
                        return;
                     }
                  }

                  if (!ResCountryDifUtils.checkCharLengthByCountry(unionName, "unionNameLength", 2, 6)) {
                     this.player.failure(9043);
                  } else {
                     int needGold = configManager.getInt("unionCreateConsume");
                     if (playerDao.gold < (long)needGold) {
                        this.sendCreateResult(31, "创建军团失败,玩家元宝不足{},现元宝{},玩家{}", needGold, playerDao.gold, playerDao.playerId);
                     } else {
                        this.unionMgrParent.pushTask(() -> {
                           if (!this.unionMgrParent.checkUnionName(unionName, 0)) {
                              this.sendCreateResult(9000, "创建军团失败,军团名已存在,玩家{}", this.player.getPlayerId());
                           } else if (this.checkJoin()) {
                              this.sendCreateResult(9003, "创建军团失败,已经加入其他军团,玩家{}", playerDao.playerId);
                           } else {
                              UnionDao unionDao = new UnionDao();
                              unionDao.leaderId = this.player.getPlayerId();
                              unionDao.unionName = unionName;
                              unionDao.verify = verify;
                              unionDao.verifyLevel = verifyLevel;
                              unionDao.verifyPower = verifyPower;
                              unionDao.declaration = declaration;
                              unionDao.serverId = playerDao.serverId;
                              if (msg.hasHead()) {
                                 unionDao.head = MiscUtil.comboInteger(msg.getHead(), 0);
                              }

                              this.unionMgrParent.createUnion(unionDao);
                              this.player.pushTask(() -> {
                                 this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)needGold, 9, 911, PlayerDefine.PLAYER_GOLD, needGold, "");
                                 playerResetCustomCache.addDailyReset(11, 1);
                                 playerResetCustomCache.setForever(13, DateUtil.getIntTime(System.currentTimeMillis()));
                              });
                              this.sendCreateResult(1, (String)null);
                              this.player.getOperationMgr().addExtraLog(this.player, 107, unionName, String.valueOf(verify), String.valueOf(verifyLevel), String.valueOf(needGold));
                           }
                        });
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionModifyVerify_6911(UnionMsg.C2S_UnionModifyVerify_6911 msg, String source) {
      boolean verify = msg.getVerify();
      int verifyLevel = msg.getVerifyLevel();
      int verifyPower = msg.getVerifyPower();
      if (this.checkConditionOfJoin(verifyLevel, verifyPower)) {
         this.unionMgrParent.pushTask(() -> {
            if (!this.checkJoin()) {
               this.sendModifyVerifyResult(23, verify, verifyLevel, verifyPower, "修改军团审核信息失败,玩家{}没加入军团", this.player.getPlayerId());
            } else if (!this.checkPermission(1, 2)) {
               this.sendModifyVerifyResult(9001, verify, verifyLevel, verifyPower, "修改军团审核信息失败,玩家{}权限不足", this.player.getPlayerId());
            } else {
               UnionMgr unionMgr = super.getUnionMgr();
               UnionDao unionDao = unionMgr.getUnion();
               unionDao.verify = verify;
               unionDao.verifyLevel = verifyLevel;
               unionDao.verifyPower = verifyPower;
               unionDao.updateOp();
               unionMgr.sendUnion((GamePlayer)null);
               this.sendModifyVerifyResult(1, verify, verifyLevel, verifyPower, (String)null);
            }
         });
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionModifyName_6913(UnionMsg.C2S_UnionModifyName_6913 msg, String source) {
      String unionName = msg.getUnionName();
      PlayerDao playerDao = this.player.getPlayerDao();
      if (!ResCountryDifUtils.checkCharLengthByCountry(unionName, "unionNameLength", 2, 6)) {
         this.player.failure(9043);
      } else {
         ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
         int feeGold = configManager.getInt("unionNameExchangeConsume");
         ConfigModel configModelItem = (ConfigModel)this.player.getGameModelPool().getEntity("config", "UnionChangeNameItem");
         if (null != configModelItem) {
            String[] resourceItem = configModelItem.getValue().split("\\|");
            if (!this.player.checkResourceNum(Integer.parseInt(resourceItem[0]), Integer.parseInt(resourceItem[1]), Integer.parseInt(resourceItem[2])) && (long)feeGold > playerDao.gold) {
               this.sendModifyNameResult(31, unionName, "修改军团名失败,玩家元宝不足{},现元宝{},玩家{}", feeGold, playerDao.gold, playerDao.playerId);
            } else {
               this.unionMgrParent.pushTask(() -> {
                  if (!this.checkJoin()) {
                     this.sendModifyNameResult(23, unionName, "修改军团名失败,玩家{}没有加入军团", this.player.getPlayerId());
                  } else if (!this.checkPermission(1, 2)) {
                     this.sendModifyNameResult(9001, unionName, "修改军团名失败,玩家{}没有权限", this.player.getPlayerId());
                  } else if (!this.unionMgrParent.checkUnionName(unionName, playerDao.unionId)) {
                     this.sendModifyNameResult(9000, unionName, "修改军团名失败,军团名已存在,玩家{}", unionName, playerDao.playerId);
                  } else {
                     UnionMgr unionMgr = super.getUnionMgr();
                     UnionDao unionDao = unionMgr.getUnion();
                     if (unionDao.unionName.equals(unionName)) {
                        this.sendModifyNameResult(9000, unionName, "修改军团名失败,军团名已存在,玩家{}", unionName, playerDao.playerId);
                     } else {
                        unionDao.unionName = unionName;
                        unionDao.updateOp();
                        this.player.pushTask(() -> {
                           if (this.player.checkResourceNum(Integer.parseInt(resourceItem[0]), Integer.parseInt(resourceItem[1]), Integer.parseInt(resourceItem[2]))) {
                              this.player.delResource(Integer.parseInt(resourceItem[0]), Integer.parseInt(resourceItem[1]), (long)Integer.parseInt(resourceItem[2]), 13, 1304, 0, 0, "");
                           } else {
                              this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)feeGold, 9, 912, PlayerDefine.PLAYER_GOLD, feeGold, "");
                           }

                        });
                        unionMgr.sendUnion((GamePlayer)null);
                        this.sendModifyNameResult(1, unionName, (String)null);
                        unionMgr.uploadToCross(false, false);
                     }
                  }
               });
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionModifyDeclaration_6915(UnionMsg.C2S_UnionModifyDeclaration_6915 msg, String source) {
      String declaration = msg.getDeclaration();
      if (!ResCountryDifUtils.checkCharLengthByCountry(declaration, "unionNoticeLength", 0, 55)) {
         this.player.failure(9044);
      } else {
         int openServerTime = ApplicationContextProvider.getConfigInt("unionnoticebantime", 0);
         if (!ApplicationContextProvider.getConfigString("unionnoticebantime_" + this.worldMgr.country, "").equals("")) {
            openServerTime = ApplicationContextProvider.getConfigInt("unionnoticebantime_" + this.worldMgr.country, 0);
         }

         int openServerTimeDay = openServerTime / DateUtil.getIntTime(86400000L);
         if (DateUtil.getIntTime(System.currentTimeMillis() - this.worldMgr.getOpenServerTime()) < openServerTime) {
            String errorStr = "修改军团公告功能在开服第{0}天后解锁";
            LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "unionnoticelimit");
            if (languageModel != null) {
               errorStr = languageModel.getValue();
            }

            this.player.failure(53, MessageFormat.format(errorStr, openServerTimeDay));
         } else {
            this.unionMgrParent.pushTask(() -> {
               if (!this.checkJoin()) {
                  this.sendModifyDeclarationResult(23, declaration, "修改军团宣言失败,玩家{}没有加入军团", this.player.getPlayerId());
               } else if (!this.checkPermission(1, 2)) {
                  this.sendModifyDeclarationResult(9001, declaration, "修改军团宣言失败,玩家{}没有权限", this.player.getPlayerId());
               } else {
                  UnionMgr unionMgr = super.getUnionMgr();
                  UnionDao unionDao = unionMgr.getUnion();
                  if (unionDao.modifySwitch == 1) {
                     this.player.failure(61229);
                  } else {
                     int dailyDeclaration = ApplicationContextProvider.getConfigInt("unionnoticechangetime", 0);
                     if (dailyDeclaration > 0 && unionDao.modifyDeclarationCount >= dailyDeclaration) {
                        this.player.failure(9039);
                     } else {
                        ++unionDao.modifyDeclarationCount;
                        unionDao.declaration = declaration;
                        unionDao.updateOp();
                        unionMgr.sendUnion((GamePlayer)null);
                        this.sendModifyDeclarationResult(1, declaration, (String)null);
                        GamePlayer leaderPlayer = this.worldMgr.getPlayerById(unionDao.leaderId);
                        PlayerPublicDao leaderPublicDao = leaderPlayer.getPublicDao();
                        this.player.getOperationMgr().alterUnionContent(this.player, unionDao.unionName, unionDao.leaderId, leaderPublicDao.playerName, declaration);
                     }
                  }
               }
            });
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionApply_6917(UnionMsg.C2S_UnionApply_6917 msg, String source) {
      if (this.player.isSystemOpen(1410)) {
         int unionId = msg.getUnionId();
         boolean isCancel = msg.getIsCancel();
         if (unionId <= 0) {
            this.player.failure(6);
         } else {
            if (!isCancel) {
               PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
               long nextCdTime = (Long)playerResetCustomCache.getForeverNum(3, 0L);
               if (nextCdTime > System.currentTimeMillis()) {
                  this.player.failure(9004);
                  return;
               }
            }

            PlayerDao playerDao = this.player.getPlayerDao();
            this.unionMgrParent.pushTask(() -> {
               UnionMgr applyUnion = this.unionMgrParent.getUnionMgr(unionId);
               if (applyUnion == null) {
                  this.player.failure(9017);
               } else if (isCancel) {
                  applyUnion.removeUnionApply(this.player.getPlayerId());
                  this.sendApplyResult(unionId, true);
               } else if (this.checkJoin()) {
                  this.player.failure(9003);
               } else {
                  UnionDao unionDao = applyUnion.getUnion();
                  if (playerDao.lv < unionDao.verifyLevel) {
                     this.player.failure(20);
                  } else if (playerDao.combat_power < (long)unionDao.verifyPower * 10000L) {
                     this.player.failure(76140);
                  } else {
                     if (!unionDao.verify && this.getUnionNum(unionDao) > applyUnion.getUnionMembers().size()) {
                        applyUnion.joinUnion(this.player, false);
                     } else {
                        applyUnion.unionApply(this.player.getPlayerId());
                     }

                     this.sendApplyResult(unionId, false);
                  }
               }
            });
         }
      }
   }

   public int getUnionNum(UnionDao unionDao) {
      if (null == unionDao) {
         return 0;
      } else {
         UnionModel unionModel = (UnionModel)ApplicationContextProvider.getModelPoolEntity("union", unionDao.level);
         if (null == unionModel) {
            return 0;
         } else if (unionDao.curUnionAddNumberId <= 0) {
            return unionModel.getUnionNum();
         } else {
            int addNum = 0;
            int curUnionAddNumberId = unionDao.curUnionAddNumberId;

            for(int i = curUnionAddNumberId; i > 0; --i) {
               UnionAddNumberModel addNumberModel = (UnionAddNumberModel)ApplicationContextProvider.getModelPoolEntity("unionAddNumber", i);
               if (addNumberModel != null) {
                  addNum += addNumberModel.getNumber();
               }
            }

            return unionModel.getUnionNum() + addNum;
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionApplyList_6919(UnionMsg.C2S_UnionApplyList_6919 msg, String source) {
      if (this.checkJoin()) {
         this.unionMgrParent.pushTask(this::sendApplyList);
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionReview_6921(UnionMsg.C2S_UnionReview_6921 msg, String source) {
      int memberId = msg.getMember();
      boolean isPass = msg.getIsPass();
      if (memberId <= 0) {
         this.player.failure(6);
      } else {
         GamePlayer applyPlayer = this.worldMgr.getPlayerById(memberId);
         if (applyPlayer == null) {
            this.player.failure(0);
         } else {
            this.unionMgrParent.pushTask(() -> {
               if (!this.checkJoin()) {
                  this.player.failure(23);
               } else if (!this.checkPermission(1, 2)) {
                  this.player.failure(9001);
               } else {
                  UnionMgr unionMgr = super.getUnionMgr();
                  UnionDao unionDao = unionMgr.getUnion();
                  if (isPass) {
                     UnionApplyDao unionApplyDao = unionMgr.getUnionApply(memberId);
                     if (unionApplyDao == null) {
                        this.player.failure(9027);
                        return;
                     }

                     if (this.getUnionNum(unionDao) <= unionMgr.getUnionMembers().size()) {
                        this.player.failure(9010);
                        return;
                     }

                     applyPlayer.pushTask(() -> {
                        PlayerDao applyPlayerDao = applyPlayer.getPlayerDao();
                        if (applyPlayerDao.unionId > 0) {
                           this.unionMgrParent.pushTask(() -> unionMgr.removeUnionApply(memberId));
                           this.player.failure(9003);
                        } else {
                           this.unionMgrParent.pushTask(() -> {
                              unionMgr.joinUnion(applyPlayer, false);
                              this.sendReviewResult(1, memberId, true, (String)null);
                           });
                        }
                     });
                  } else {
                     unionMgr.removeUnionApply(memberId);
                     this.sendReviewResult(1, memberId, false, (String)null);
                  }

               }
            });
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionExit_6923(UnionMsg.C2S_UnionExit_6923 msg, String source) {
      if (this.checkOutUnion(76067)) {
         PlayerDao playerDao = this.player.getPlayerDao();
         this.unionMgrParent.pushTask(() -> {
            if (!this.checkJoin()) {
               this.sendExitResult(23, "退出军团请求失败,玩家{}没有加入军团", this.player.getPlayerId());
            } else {
               UnionMgr unionMgr = super.getUnionMgr();
               if (this.unionMgrParent.warStatus > 0 && unionMgr.warIsMatch) {
                  this.sendExitResult(9025, "退出军团请求失败,军团争霸期间禁止退出军团");
               } else {
                  UnionMemberDao unionMemberDao = super.getUnionMember();
                  if (unionMemberDao != null && unionMemberDao.position == 1) {
                     this.sendExitResult(9009, "退出军团请求失败,玩家{}是军团长不能退出军团", this.player.getPlayerId());
                  } else {
                     unionMgr.exitUnion(this.player.getPlayerId());
                     unionMgr.addLog(playerDao.unionId, 11, playerDao.playerName);
                     this.sendExitResult(1, (String)null);
                     this.player.pushTask(this::checkReApplyCd);
                     unionMgr.sendMemberLeavl(playerDao.playerId);
                  }
               }
            }
         });
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionRemoveMember_6925(UnionMsg.C2S_UnionRemoveMember_6925 msg, String source) {
      this.unionRemoveMember(msg.getMember());
   }

   private void unionRemoveMember(int memberId) {
      if (this.checkOutUnion(76144)) {
         GamePlayer memberPlayer = this.worldMgr.getPlayerById(memberId);
         if (memberPlayer == null) {
            this.sendRemoveMemberResult(17, memberId, "移除军团成员失败,被移除的玩家{}不存在", memberId);
         } else {
            PlayerDao playerDao = this.player.getPlayerDao();
            this.unionMgrParent.pushTask(() -> {
               if (!this.checkJoin()) {
                  this.sendRemoveMemberResult(23, memberId, "移除军团成员失败,执行移除的玩家{}没有加入军团", this.player.getPlayerId());
               } else {
                  UnionMgr unionMgr = super.getUnionMgr();
                  if (this.unionMgrParent.warStatus > 0 && unionMgr.warIsMatch) {
                     this.sendExitResult(9025, "退出军团请求失败,军团争霸期间禁止退出军团");
                  } else {
                     UnionMemberDao memberDao = unionMgr.getUnionMember(memberId);
                     if (memberDao != null) {
                        boolean checkPermission = false;
                        switch (memberDao.position) {
                           case 1:
                              this.sendRemoveMemberResult(9005, memberId, "移除军团成员失败,军团长{}不能被移除,执行的玩家{}", memberId, playerDao.playerId);
                              return;
                           case 2:
                              checkPermission = this.checkPermission(1);
                              break;
                           case 3:
                              checkPermission = this.checkPermission(1, 2);
                        }

                        if (!checkPermission) {
                           this.sendRemoveMemberResult(9001, memberId, "移除军团成员失败,执行的玩家{}没有权限", playerDao.playerId);
                           return;
                        }
                     }

                     unionMgr.exitUnion(memberId);
                     this.sendRemoveMemberResult(1, memberId, (String)null);
                     UnionDao unionDao = unionMgr.getUnion();
                     PlayerPublicDao memberPlayerDao = memberPlayer.getPublicDao();
                     unionMgr.addLog(playerDao.unionId, 12, playerDao.playerName, memberPlayerDao.playerName);
                     LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "KickOutOfTheLeague");
                     String content = MessageFormat.format(languageModel.getValue(), memberPlayerDao.playerName);
                     this.chatMgr.sendUnionSystem(unionDao.unionId, content, 3);
                     String positionDesc = "";
                     switch (this.getUnionMember().position) {
                        case 1:
                           languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "Unionmailname2");
                           positionDesc = languageModel == null ? "团长" : languageModel.getValue();
                           break;
                        case 2:
                           languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "Unionmailname1");
                           positionDesc = languageModel == null ? "副团长" : languageModel.getValue();
                     }

                     unionMgr.sendMail(memberId, CentreAwardModel.TYPE_UNION_BE_MOVE, positionDesc, playerDao.playerName);
                     unionMgr.sendMemberLeavl(memberId);
                  }
               }
            });
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionRemindAll_6931(UnionMsg.C2S_UnionRemindAll_6931 msg, String source) {
      int type = msg.getType();
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.sendNotifyAllResult(23, type, "提醒失败,玩家{}没有加入军团", this.player.getPlayerId());
         } else if (!this.checkPermission(1, 2)) {
            this.sendNotifyAllResult(9001, type, "提醒失败,玩家{}权限不足", this.player.getPlayerId());
         } else {
            UnionMgr unionMgr = super.getUnionMgr();

            for(UnionMemberDao memberDao : unionMgr.getUnionMembers().values()) {
               if (memberDao.playerId != this.player.getPlayerId()) {
                  GamePlayer gamePlayer = this.worldMgr.getOnlinePlayer(memberDao.playerId);
                  if (gamePlayer != null) {
                     switch (type) {
                        case 1:
                           gamePlayer.pushTask(() -> {
                              PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)gamePlayer.getCustomCache("tb_player_reset", gamePlayer.getPlayerId());
                              if ((Integer)playerResetCustomCache.getDailyNum(5, 0) == 0) {
                                 UnionMsg.S2C_UnionRemindAll_6932.Builder notifyMsg = UnionMsg.S2C_UnionRemindAll_6932.newBuilder();
                                 notifyMsg.setResult(1);
                                 notifyMsg.setType(1);
                                 gamePlayer.sendMsg(notifyMsg.build());
                              }

                           });
                           break;
                        case 2:
                           int copyFreeCount = ApplicationContextProvider.getConfigInt("unionCopyFreeChallenge", 0);
                           gamePlayer.pushTask(() -> {
                              PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)gamePlayer.getPlayerExtend(9);
                              if (playerUnionExtend.copyChallengeCount < copyFreeCount + playerUnionExtend.copyChallengeBuyCount) {
                                 UnionMsg.S2C_UnionRemindAll_6932.Builder notifyMsg = UnionMsg.S2C_UnionRemindAll_6932.newBuilder();
                                 notifyMsg.setResult(1);
                                 notifyMsg.setType(2);
                                 gamePlayer.sendMsg(notifyMsg.build());
                              }

                           });
                           break;
                        case 3:
                           if (memberDao.warChallengeCount == 0) {
                              UnionMsg.S2C_UnionRemindAll_6932.Builder notifyMsg = UnionMsg.S2C_UnionRemindAll_6932.newBuilder();
                              notifyMsg.setResult(1);
                              notifyMsg.setType(3);
                              gamePlayer.sendMsg(notifyMsg.build());
                           }
                     }
                  }
               }
            }

         }
      });
      this.sendNotifyAllResult(1, type, (String)null);
   }

   @MsgHandlerAnno
   public void C2S_UnionGrant_6927(UnionMsg.C2S_UnionGrant_6927 msg, String source) {
      boolean grant = msg.getGrant();
      int memberId = msg.getMember();
      GamePlayer memberPlayer = this.worldMgr.getPlayerById(memberId);
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.sendGrantResult(23, grant, memberId);
         } else if (!this.checkPermission(1)) {
            this.sendGrantResult(9001, grant, memberId);
         } else {
            UnionMgr unionMgr = super.getUnionMgr();
            int result = unionMgr.handleDeputyLeader(memberPlayer, this.player, grant, false);
            this.sendGrantResult(result, grant, memberId);
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_UnionImpeachment_6929(UnionMsg.C2S_UnionImpeachment_6929 msg, String source) {
      PlayerDao playerDao = this.player.getPlayerDao();
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.sendToBeLeaderResult(23, "夺取团长失败,没有加入军团,玩家{}", playerDao.playerId);
         } else {
            UnionMgr unionMgr = super.getUnionMgr();
            UnionMemberDao unionMemberDao = super.getUnionMember();
            int offlineDay;
            int feeGold;
            switch (unionMemberDao.position) {
               case 1:
                  this.sendToBeLeaderResult(9009, "夺取团长失败,已经是团长,玩家{}", this.player.getPlayerId());
                  return;
               case 2:
                  offlineDay = Integer.parseInt(configManager.parseValue("unionMasterExchangeTime", 0, "\\|"));
                  feeGold = Integer.parseInt(configManager.parseValue("unionMasterExchangeConsume", 0, "\\|"));
                  break;
               case 3:
                  offlineDay = Integer.parseInt(configManager.parseValue("unionMasterExchangeTime", 1, "\\|"));
                  feeGold = Integer.parseInt(configManager.parseValue("unionMasterExchangeConsume", 1, "\\|"));
                  break;
               default:
                  this.sendToBeLeaderResult(6, "夺取团长失败,军团成员{}未知职位", playerDao.playerId);
                  return;
            }

            UnionDao unionDao = unionMgr.getUnion();
            int leaderId = unionDao.leaderId;
            GamePlayer leaderPlayer = this.worldMgr.getPlayerById(leaderId);
            leaderPlayer.pushTask(() -> {
               PlayerDao leaderDao = leaderPlayer.getPlayerDao();
               if (leaderDao.logoutTime == 0L) {
                  this.sendToBeLeaderResult(9002, "夺取团长失败,团长离线时间不足{}天,玩家{}", offlineDay, this.player.getPlayerId());
               } else {
                  long leaderOfflineTime = System.currentTimeMillis() - leaderDao.logoutTime;
                  long needOfflineTime = (long)offlineDay * 86400000L;
                  if (leaderOfflineTime < needOfflineTime) {
                     this.sendToBeLeaderResult(9002, "夺取团长失败,团长离线时间不足{}天,玩家{}", offlineDay, this.player.getPlayerId());
                  } else {
                     this.player.pushTask(() -> {
                        if (playerDao.gold < (long)feeGold) {
                           this.sendToBeLeaderResult(31, "夺取团长失败,玩家元宝不足{},现元宝{},玩家{}", feeGold, playerDao.gold, playerDao.playerId);
                        } else {
                           this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)feeGold, 9, 913, PlayerDefine.PLAYER_GOLD, feeGold, "");
                           this.unionMgrParent.pushTask(() -> {
                              unionDao.leaderId = this.player.getPlayerId();
                              unionDao.updateOp();
                              unionMemberDao.position = 1;
                              unionMemberDao.updateOp();
                              unionMgr.broadcastMember(unionMemberDao.playerId);
                              UnionMemberDao leaderMemberDao = unionMgr.getUnionMember(leaderPlayer.getPlayerId());
                              leaderMemberDao.position = 3;
                              leaderMemberDao.updateOp();
                              unionMgr.broadcastMember(leaderMemberDao.playerId);
                              unionMgr.sendUnion((GamePlayer)null);
                              this.sendToBeLeaderResult(1, (String)null);
                              LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "ChallengeTheLeader");
                              String content = MessageFormat.format(languageModel.getValue(), leaderDao.playerName, playerDao.playerName);
                              this.chatMgr.sendUnionSystem(unionDao.unionId, content, 3);
                              unionMgr.uploadToCross(false, false);
                           });
                        }
                     });
                  }
               }
            });
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_UnionSendMailAll_6935(UnionMsg.C2S_UnionSendMailAll_6935 msg, String source) {
      String content = msg.getContent();
      int mailBanTime = ApplicationContextProvider.getConfigInt("unionmailbantime", 0);
      if (!ApplicationContextProvider.getConfigString("unionmailbantime_" + this.worldMgr.country, "").equals("")) {
         mailBanTime = ApplicationContextProvider.getConfigInt("unionmailbantime_" + this.worldMgr.country, 0);
      }

      if (DateUtil.getIntTime(System.currentTimeMillis() - this.worldMgr.getOpenServerTime()) < mailBanTime) {
         String errorStr = "军团邮件功能在开服第{0}天后解锁";
         LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "unionmailtime");
         if (languageModel != null) {
            errorStr = languageModel.getValue();
         }

         this.player.failure(53, MessageFormat.format(errorStr, mailBanTime / DateUtil.getIntTime(86400000L)));
      } else if (content.length() > ApplicationContextProvider.getConfigInt("unionMailNumLimit", 100)) {
         this.player.failure(23004);
      } else if (WordsFilter.hasBadWords(content)) {
         this.player.failure(40);
      } else {
         this.unionMgrParent.pushTask(() -> {
            if (!this.checkJoin()) {
               this.sendMailAllResult(23, "发送邮件失败,玩家{}没有加入军团", this.player.getPlayerId());
            } else if (!this.checkPermission(1, 2)) {
               this.sendMailAllResult(9001, "发送邮件失败,玩家{}没有权限", this.player.getPlayerId());
            } else {
               UnionMemberDao myMemberDao = this.getUnionMember();
               int todayMaxMailCount = ApplicationContextProvider.getConfigInt("unionMailLimit", 0);
               if (myMemberDao.todayMailCount >= todayMaxMailCount) {
                  this.player.failure(51);
               } else {
                  CentreAwardModel centreAwardModel = CentreAwardModel.getByType(CentreAwardModel.TYPE_UNION_MAIL);
                  if (centreAwardModel == null) {
                     this.player.failure(0);
                  } else {
                     ++myMemberDao.todayMailCount;
                     myMemberDao.updateOp();
                     UnionMgr unionMgr = super.getUnionMgr();
                     unionMgr.getUnionMembers().values().forEach((memberDao) -> {
                        if (memberDao.playerId != this.player.getPlayerId()) {
                           GamePlayer gamePlayer = this.worldMgr.getPlayerById(memberDao.playerId);
                           if (gamePlayer != null) {
                              gamePlayer.pushTask(() -> {
                                 MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                                 mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), content, (List)null, 604800000L, 9, 922);
                              });
                           }
                        }

                     });
                  }
               }
            }
         });
         this.sendMailAllResult(1, (String)null);
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionDismiss_6937(UnionMsg.C2S_UnionDismiss_6937 msg, String source) {
      PlayerDao playerDao = this.player.getPlayerDao();
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else {
            UnionMgr unionMgr = super.getUnionMgr();
            if (this.unionMgrParent.warStatus > 0 && unionMgr.warIsMatch) {
               this.player.failure(9025);
            } else if (!this.checkPermission(1)) {
               this.player.failure(9001);
            } else if (unionMgr.getUnionMembers().size() > 1) {
               this.player.failure(9037);
            } else {
               CoreWarMgr coreWarMgr = (CoreWarMgr)ApplicationContextProvider.getContext().getBean(CoreWarMgr.class);
               MergeWarInfoDao mergeWarInfoDao = coreWarMgr.getMergeWarInfoDao();
               if (mergeWarInfoDao.isOpening && mergeWarInfoDao.subState != 16) {
                  this.player.failure(76115);
               } else {
                  UnionDao unionDao = unionMgr.getUnion();
                  this.unionMgrParent.dismissUnion(playerDao.unionId);
                  this.sendDismissResult(1, playerDao.unionId, (String)null);
                  this.player.getOperationMgr().addExtraLog(this.player, 110, unionDao.unionName, String.valueOf(unionDao.level), String.valueOf(unionMgr.getUnionMembers().size()), String.valueOf(playerDao.playerId), playerDao.playerName);
                  this.player.pushTask(this::checkReApplyCd);
               }
            }
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_MakeOverUnion_6975(UnionMsg.C2S_MakeOverUnion_6975 msg, String source) {
      int member = msg.getMember();
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(member);
      if (gamePlayer == null) {
         this.player.failure(17);
      } else {
         this.unionMgrParent.pushTask(() -> {
            if (!this.checkJoin()) {
               this.player.failure(23);
            } else {
               UnionMgr unionMgr = super.getUnionMgr();
               UnionMemberDao unionMemberDao = super.getUnionMember();
               UnionMemberDao opUnionMemberDao = unionMgr.getUnionMember(member);
               if (opUnionMemberDao == null) {
                  this.player.failure(9035);
               } else {
                  UnionDao unionDao = unionMgr.getUnion();
                  if (unionDao.leaderId != this.player.getPlayerId()) {
                     this.player.failure(9001);
                  } else {
                     unionMgr.changeLeader(unionMemberDao, opUnionMemberDao, false);
                     UnionMsg.S2C_MakeOverUnion_6976.Builder resp = UnionMsg.S2C_MakeOverUnion_6976.newBuilder();
                     resp.setMember(member);
                     this.player.sendMsg(resp.build());
                  }
               }
            }
         });
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionRecruit_6977(UnionMsg.C2S_UnionRecruit_6977 msg, String source) {
      int freeNum = ApplicationContextProvider.getConfigInt("unionRecruitNoticeFreeNum", 1);
      int dailyLimit = ApplicationContextProvider.getConfigInt("unionRecruitNoticeNum", 0);
      String[] consumeArr = ApplicationContextProvider.getConfigString("unionRecruitNoticeConsume", "").split("\\|");
      ResourceModel resourceModel = new ResourceModel(Integer.parseInt(consumeArr[0]), Integer.parseInt(consumeArr[1]), Integer.parseInt(consumeArr[2]));
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      MedalPart medalPart = (MedalPart)this.player.getMgrPart(MedalPart.class);
      Set<Integer> medals = medalPart.getMedals();
      MonarchPart monarchPart = (MonarchPart)this.player.getMgrPart(MonarchPart.class);
      List<CommonMsg.MapDataIS> customPrestiges = monarchPart.getCustomPrestiges();
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else if (!this.checkPermission(2, 1)) {
            this.player.failure(9001);
         } else {
            UnionMgr unionMgr = super.getUnionMgr();
            UnionDao unionDao = unionMgr.getUnion();
            if (unionDao.recruitCount >= dailyLimit) {
               this.player.failure(9038);
            } else {
               if (unionDao.recruitCount >= freeNum) {
                  this.player.pushTask(() -> {
                     if (!this.player.checkResourceNum(resourceModel)) {
                        this.player.failure(31);
                     } else {
                        this.player.delResource(resourceModel, 9, 925, 0, 0, "");
                        this.unionMgrParent.pushTask(() -> this.recruit(unionDao, playerExtend.bubble, medals, customPrestiges));
                     }
                  });
               } else {
                  this.recruit(unionDao, playerExtend.bubble, medals, customPrestiges);
               }

            }
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_UnionLogs_6969(UnionMsg.C2S_UnionLogs_6969 msg, String source) {
      this.unionMgrParent.pushTask(() -> {
         if (this.checkJoin()) {
            this.sendUnionLogs();
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_UnionHead_17501(UnionExtendMsg.C2S_UnionHead_17501 msg, String source) {
      this.unionMgrParent.pushTask(() -> {
         UnionExtendMsg.S2C_UnionHead_17502.Builder resp = UnionExtendMsg.S2C_UnionHead_17502.newBuilder();
         if (!this.checkJoin()) {
            this.player.sendMsg(resp.build());
         } else {
            for(Map.Entry<Integer, Integer> entry : this.getUnion().hasHead.entrySet()) {
               UnionExtendMsg.UnionHeadData.Builder builder = UnionExtendMsg.UnionHeadData.newBuilder();
               builder.setHead((Integer)entry.getKey());
               builder.setInvalidTime((Integer)entry.getValue());
               resp.addHead(builder);
            }

            this.player.sendMsg(resp.build());
         }
      });
   }

   @MsgHandlerAnno
   public void C2S_UnionSettingHead_17503(UnionExtendMsg.C2S_UnionSettingHead_17503 msg, String source) {
      this.unionMgrParent.pushTask(() -> {
         if (this.checkJoin()) {
            UnionDao unionDao = this.getUnion();
            if (!this.checkPermission(1)) {
               this.player.failure(9001);
            } else if (!unionDao.hasHead.containsKey(msg.getChoiceHead())) {
               this.player.failure(9040);
            } else {
               UnionHeadModel unionHeadModel = (UnionHeadModel)ApplicationContextProvider.getModelPoolEntity("unionHead", msg.getChoiceHead());
               if (unionHeadModel == null) {
                  this.player.failure(0);
               } else {
                  int curTime = DateUtil.getIntTime(System.currentTimeMillis());
                  int invalidTime = (Integer)unionDao.hasHead.get(msg.getChoiceHead());
                  if (invalidTime > 0 && invalidTime <= curTime) {
                     this.player.failure(9041);
                  } else {
                     int changeCdConfig = ApplicationContextProvider.getConfigInt("unionHeadCD", 0);
                     int changeCd = MiscUtil.getLowParam(unionDao.head);
                     if (changeCd > 0 && changeCd + changeCdConfig > curTime) {
                        LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "unionHeadChange");
                        String tips = languageModel == null ? "剩余{0}秒后可更换军团头像" : languageModel.getValue();
                        this.player.failure(53, MessageFormat.format(tips, changeCd + changeCdConfig - curTime));
                     } else {
                        unionDao.head = MiscUtil.comboInteger(msg.getChoiceHead(), curTime);
                        unionDao.updateOp();
                        UnionExtendMsg.S2C_UnionSettingHead_17504.Builder resp = UnionExtendMsg.S2C_UnionSettingHead_17504.newBuilder();
                        resp.setChoiceHead(msg.getChoiceHead());
                        this.player.sendMsg(resp.build());
                     }
                  }
               }
            }
         }
      });
   }

   public void loginHandle() {
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.unionId > 0) {
         this.unionMgrParent.pushTask(() -> {
            UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(playerDao.unionId);
            if (unionMgr == null) {
               this.logger.error("玩家【{}】,名称:【{}】,所在军团【{}】已不存在,unionId标记为0", new Object[]{playerDao.playerId, playerDao.playerName, playerDao.unionId});
               this.player.pushTask(() -> {
                  playerDao.unionId = 0;
                  playerDao.updateOp();
                  this.player.notifyPlayerData(PlayerDefine.PLAYER_UNION_ID, 0);
               });
            } else if (unionMgr.getUnionMember(this.player.getPlayerId()) == null) {
               this.logger.error("玩家【{}】,名称:【{}】,所在军团【{}】成员信息不存在,unionId标记为0", new Object[]{playerDao.playerId, playerDao.playerName, playerDao.unionId});
               this.player.pushTask(() -> {
                  playerDao.unionId = 0;
                  playerDao.updateOp();
                  this.player.notifyPlayerData(PlayerDefine.PLAYER_UNION_ID, 0);
               });
            }

         });
      }

      PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);
      this.player.notifyPlayerData(PlayerDefine.UNION_COPY_CHALLENGE, playerUnionExtend.copyChallengeCount);
      this.player.notifyPlayerData(PlayerDefine.UNION_COPY_BUY, playerUnionExtend.copyChallengeBuyCount);
   }

   public void sendUnionLogs() {
      UnionMsg.S2C_UnionLogs_6970.Builder msg = UnionMsg.S2C_UnionLogs_6970.newBuilder();
      int maxCount = ApplicationContextProvider.getConfigInt("unionLogLimit", 50);
      UnionMgr unionMgr = super.getUnionMgr();
      List<UnionLog> unionLogList = unionMgr.getUnionLogList();
      if (!unionLogList.isEmpty()) {
         int lessCount = unionLogList.size() - maxCount;

         for(int i = unionLogList.size() - 1; i > -1; --i) {
            UnionLog unionLog = (UnionLog)unionLogList.get(i);
            if (i < lessCount) {
               unionMgr.removeUnionLog(unionLog);
            } else {
               msg.addUnionLogs(unionMgr.buildLogMsg(unionLog));
            }
         }
      }

      msg.setIsNotify(false);
      this.player.sendMsg(msg.build());
   }

   public void resetDaily() {
      PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);
      if (playerUnionExtend.copyChallengeCount > 0 || playerUnionExtend.copyChallengeBuyCount > 0) {
         playerUnionExtend.copyChallengeCount = 0;
         playerUnionExtend.copyChallengeBuyCount = 0;
         this.player.updatePlayerExtend(9);
         this.player.notifyPlayerData(PlayerDefine.UNION_COPY_CHALLENGE, playerUnionExtend.copyChallengeCount);
         this.player.notifyPlayerData(PlayerDefine.UNION_COPY_BUY, playerUnionExtend.copyChallengeBuyCount);
      }

      this.unionMgrParent.pushTask(() -> {
         if (this.checkJoin()) {
            UnionMgr unionMgr = super.getUnionMgr();
            UnionMemberDao unionMemberDao = super.getUnionMember();
            if (!unionMemberDao.redPacketGave.isEmpty()) {
               unionMemberDao.redPacketGave.clear();
            }

            unionMemberDao.worships.clear();
            unionMemberDao.todayMailCount = 0;
            unionMemberDao.updateOp();
            unionMgr.sendMember(this.player);
         }
      });
   }

   private void recruit(UnionDao unionDao, int bubble, Set<Integer> medals, List<CommonMsg.MapDataIS> customPrestiges) {
      ++unionDao.recruitCount;
      unionDao.updateOp();
      UnionMsg.S2C_UnionRecruit_6978.Builder resp = UnionMsg.S2C_UnionRecruit_6978.newBuilder();
      resp.setCount(unionDao.recruitCount);
      this.player.sendMsg(resp.build());
      LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "recruitInfo");
      String msg = languageModel.getValue().replaceAll("\\{0\\}", unionDao.level + "").replaceAll("\\{1\\}", unionDao.unionName).replaceAll("\\{2\\}", unionDao.verifyLevel + "").replaceAll("\\{3\\}", unionDao.unionId + "").replaceAll("\\\\", "");
      PlayerChatPart playerChatPart = (PlayerChatPart)this.player.getMgrPart(PlayerChatPart.class);
      playerChatPart.handlePersonalSender(2, this.player.getPlayerId(), msg, 1, (CommonMsg.HeroInfo)null, (BagMsg.Item_Info)null, "", bubble, medals, customPrestiges);
      this.chatMgr.pushTask(() -> {
         ChatData chatData = new ChatData(this.player.getServerId(), this.player.getPlayerId(), 2, msg, 1, (CommonMsg.HeroInfo)null, 0, (BagMsg.Item_Info)null, "", bubble, medals, customPrestiges);
         this.chatMgr.handleMsg(chatData);
      });
   }

   public boolean checkPermission(int... positions) {
      if (positions == null) {
         return false;
      } else {
         boolean checkCount = false;
         UnionMemberDao unionMemberDao = super.getUnionMember();

         for(int position : positions) {
            if (unionMemberDao == null) {
               return false;
            }

            if (unionMemberDao.position == position) {
               checkCount = true;
               break;
            }
         }

         return checkCount;
      }
   }

   private void sendNotifyAllResult(int code, int type, String message, Object... args) {
      if (code != 1) {
      }

      UnionMsg.S2C_UnionRemindAll_6932.Builder msg = UnionMsg.S2C_UnionRemindAll_6932.newBuilder();
      msg.setResult(code);
      msg.setType(type);
      this.player.sendMsg(msg.build());
   }

   private void sendCreateResult(int code, String message, Object... args) {
      UnionMsg.S2C_UnionCreate_6910.Builder msg = UnionMsg.S2C_UnionCreate_6910.newBuilder();
      msg.setResult(code);
      if (code != 1) {
      }

      this.player.sendMsg(msg.build());
   }

   private void sendModifyVerifyResult(int code, boolean verify, int verifyLevel, int verifyPower, String message, Object... args) {
      if (code != 1 && !StringUtils.isEmpty(message)) {
      }

      UnionMsg.S2C_UnionModifyVerify_6912.Builder msg = UnionMsg.S2C_UnionModifyVerify_6912.newBuilder();
      msg.setResult(code);
      msg.setVerify(verify);
      msg.setVerifyLevel(verifyLevel);
      msg.setVerifyPower(verifyPower);
      this.player.sendMsg(msg.build());
   }

   private void sendModifyNameResult(int code, String unionName, String message, Object... args) {
      if (code != 1 && !StringUtils.isEmpty(message)) {
      }

      UnionMsg.S2C_UnionModifyName_6914.Builder msg = UnionMsg.S2C_UnionModifyName_6914.newBuilder();
      msg.setResult(code);
      msg.setUnionName(unionName);
      this.player.sendMsg(msg.build());
   }

   private void sendModifyDeclarationResult(int code, String declaration, String message, Object... args) {
      if (code != 1 && !StringUtils.isEmpty(message)) {
      }

      UnionMsg.S2C_UnionModifyDeclaration_6916.Builder msg = UnionMsg.S2C_UnionModifyDeclaration_6916.newBuilder();
      msg.setResult(code);
      msg.setDeclaration(declaration);
      this.player.sendMsg(msg.build());
   }

   private void sendApplyResult(int unionId, boolean isCancel) {
      UnionMsg.S2C_UnionApply_6918.Builder msg = UnionMsg.S2C_UnionApply_6918.newBuilder();
      msg.setIsCancel(isCancel);
      msg.setResult(1);
      msg.setUnionId(unionId);
      this.player.sendMsg(msg.build());
   }

   private void sendReviewResult(int code, int member, boolean isPass, String message, Object... args) {
      if (code != 1 && !StringUtils.isEmpty(message)) {
      }

      UnionMsg.S2C_UnionReview_6922.Builder msg = UnionMsg.S2C_UnionReview_6922.newBuilder();
      msg.setIsPass(isPass);
      msg.setMember(member);
      this.player.sendMsg(msg.build());
   }

   private void sendExitResult(int code, String message, Object... args) {
      if (code != 1 && !StringUtils.isEmpty(message)) {
      }

      UnionMsg.S2C_UnionExit_6924.Builder msg = UnionMsg.S2C_UnionExit_6924.newBuilder();
      msg.setResult(code);
      this.player.sendMsg(msg.build());
   }

   private void sendRemoveMemberResult(int code, int member, String message, Object... args) {
      if (code != 1 && !StringUtils.isEmpty(message)) {
      }

      UnionMsg.S2C_UnionRemoveMember_6926.Builder msg = UnionMsg.S2C_UnionRemoveMember_6926.newBuilder();
      msg.setMember(member);
      msg.setResult(code);
      this.player.sendMsg(msg.build());
   }

   private void sendGrantResult(int code, boolean grant, int member) {
      UnionMsg.S2C_UnionGrant_6928.Builder msg = UnionMsg.S2C_UnionGrant_6928.newBuilder();
      msg.setMember(member);
      msg.setGrant(grant);
      msg.setResult(code);
      this.player.sendMsg(msg.build());
   }

   private void sendToBeLeaderResult(int code, String message, Object... args) {
      if (code != 1 && !StringUtils.isEmpty(message)) {
      }

      UnionMsg.S2C_UnionImpeachment_6930.Builder msg = UnionMsg.S2C_UnionImpeachment_6930.newBuilder();
      msg.setResult(code);
      this.player.sendMsg(msg.build());
   }

   private void sendMailAllResult(int code, String message, Object... args) {
      if (code != 1 && !StringUtils.isEmpty(message)) {
      }

      UnionMsg.S2C_UnionSendMailAll_6936.Builder msg = UnionMsg.S2C_UnionSendMailAll_6936.newBuilder();
      msg.setResult(code);
      this.player.sendMsg(msg.build());
   }

   private void sendDismissResult(int code, int unionId, String message, Object... args) {
      if (code != 1 && !StringUtils.isEmpty(message)) {
      }

      UnionMsg.S2C_UnionDismiss_6938.Builder msg = UnionMsg.S2C_UnionDismiss_6938.newBuilder();
      msg.setUnionId(unionId);
      msg.setResult(code);
      this.player.sendMsg(msg.build());
   }

   private void sendApplyList() {
      this.player.sendMsg(super.getUnionMgr().buildApplyListMsg());
   }

   private void checkReApplyCd() {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      int cdCount = Integer.parseInt(configManager.parseValue("unionExchangeCD", 0, "\\|"));
      int cdTime = Integer.parseInt(configManager.parseValue("unionExchangeCD", 1, "\\|"));
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int currentCount = (Integer)playerResetCustomCache.getForeverNum(2, 0);
      long nextCdTime;
      if (currentCount >= cdCount) {
         nextCdTime = System.currentTimeMillis() + (long)(cdTime * 60 * 60 * 1000);
      } else {
         nextCdTime = System.currentTimeMillis();
      }

      playerResetCustomCache.addForever(2, 1);
      playerResetCustomCache.setForever(3, nextCdTime);
      this.player.notifyPlayerData(PlayerDefine.PLAYER_JOIN_UNION_CD, DateUtil.getIntTime(nextCdTime));
   }

   @MsgHandlerAnno
   public void C2S_UnionAddNumber_17505(UnionExtendMsg.C2S_UnionAddNumber_17505 msg, String source) {
      UnionMgr unionMgr = this.getUnionMgr();
      unionMgr.unionAddNumber(this.player);
   }

   public boolean checkConditionOfJoin(int verifyLevel, int verifyPower) {
      verifyLevel = Math.max(0, verifyLevel);
      int levelLimit = ApplicationContextProvider.getConfigInt("unionJoinLevelLimitNew", 200);
      if (verifyLevel > levelLimit) {
         this.logger.info("设置的入团等级超过上限 verifyLevel:{} levelLimit:{}", verifyLevel, levelLimit);
         return false;
      } else {
         verifyPower = Math.max(0, verifyPower);
         int powerLimit = ApplicationContextProvider.getConfigInt("unionJoinPowerLimit", 5000);
         if (verifyPower > powerLimit) {
            this.logger.info("设置的入团等级超过上限 verifyLevel:{} levelLimit:{}", verifyPower, powerLimit);
            return false;
         } else {
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionRemoveMemberBatch_6993(UnionMsg.C2S_UnionRemoveMemberBatch_6993 msg, String source) {
      if (this.checkOutUnion(76144)) {
         List<Integer> membersList = msg.getMembersList();
         Set<Integer> list = new HashSet(membersList);
         this.unionMgrParent.pushTaskEx("unionRemoveMemberBatch", new Object[]{list, this});
      }
   }

   private boolean checkOutUnion(int errorCode) {
      CoreWarMgr coreWarMgr = (CoreWarMgr)ApplicationContextProvider.getContext().getBean(CoreWarMgr.class);
      MergeWarInfoDao mergeWarInfoDao = coreWarMgr.getMergeWarInfoDao();
      if (mergeWarInfoDao.isOpening && mergeWarInfoDao.stage == 2 && mergeWarInfoDao.promoteUnion == this.player.getPlayerDao().unionId) {
         this.player.failure(errorCode);
         return false;
      } else {
         return true;
      }
   }
}
