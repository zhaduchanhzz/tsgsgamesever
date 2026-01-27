package com.gzbz.share.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.db.FaceBookShareDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.FaceBookShareAwardModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.protobuf.FaceBookShareMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Map;
import java.util.TreeMap;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class FaceBookSharePart extends PlayerPart {
   private static final int STATE_COMPLETE = 1;
   private static final int RESET_TYPE_DAILY = 2;

   public void resetDaily() {
      FaceBookShareDao dao = this.getDao();
      if (dao.likesState == 1) {
         FaceBookShareAwardModel faceBookShareAwardModel = this.getFaceBookShareAwardModel(1);
         if (faceBookShareAwardModel.getResetType() == 2) {
            dao.likesState = 0;
         }
      }

      if (dao.shareState == 1) {
         FaceBookShareAwardModel faceBookShareAwardModel = this.getFaceBookShareAwardModel(2);
         if (faceBookShareAwardModel.getResetType() == 2) {
            dao.shareState = 0;
         }
      }

      if (dao.inviteState == 1) {
         FaceBookShareAwardModel faceBookShareAwardModel = this.getFaceBookShareAwardModel(3);
         if (faceBookShareAwardModel.getResetType() == 2) {
            dao.inviteState = 0;
            dao.invitePlayer.clear();
         }
      }

      if (dao.bindingState == 1) {
         FaceBookShareAwardModel faceBookShareAwardModel = this.getFaceBookShareAwardModel(4);
         if (faceBookShareAwardModel.getResetType() == 2) {
            dao.bindingState = 0;
         }
      }

      dao.updateOp();
      this.sendTotalInfo();
   }

   public void loginHandle() {
   }

   public FaceBookShareDao getDao() {
      FaceBookShareDao faceBookShareDao = (FaceBookShareDao)this.player.getData("tb_face_book_share", this.player.getPlayerId());
      return faceBookShareDao;
   }

   public FaceBookShareAwardModel getFaceBookShareAwardModel(int id) {
      FaceBookShareAwardModel model = (FaceBookShareAwardModel)this.player.getGameModelPool().getEntity("FaceBookShareAward", id);
      return model;
   }

   public SystemFunctionModel getSystemFunctionModel(int systemId) {
      SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", systemId);
      return systemFunctionModel;
   }

   public void sendTotalInfo() {
      FaceBookShareDao dao = this.getDao();
      FaceBookShareMsg.S2C_TotalInfo_19202.Builder builder = FaceBookShareMsg.S2C_TotalInfo_19202.newBuilder();
      builder.setLikesState(dao.likesState);
      builder.setShareState(dao.shareState);
      builder.setInviteState(dao.inviteState);
      builder.setCommunityState(dao.communityState);
      builder.setAdviseState(dao.adviseState);
      builder.setBindingState(dao.bindingState);
      builder.setGooglePlayerState(dao.googlePlayerState);
      builder.setH5GuideState(dao.h5GuideState);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_TotalInfo_19201(FaceBookShareMsg.C2S_TotalInfo_19201 msg, String source) {
      this.sendTotalInfo();
   }

   @MsgHandlerAnno
   public boolean C2S_Likes_19203(FaceBookShareMsg.C2S_Likes_19203 msg, String source) {
      SystemFunctionModel systemFunctionModel = this.getSystemFunctionModel(4450);
      if (null != systemFunctionModel && this.player.getPlayerDao().lv >= systemFunctionModel.getOpenLevel()) {
         FaceBookShareDao dao = this.getDao();
         if (1 == dao.likesState) {
            return this.player.failure(76030);
         } else {
            FaceBookShareAwardModel faceBookShareAwardModel = this.getFaceBookShareAwardModel(1);
            this.player.addResource(faceBookShareAwardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 97, 9701, 0, 0, "");
            dao.likesState = 1;
            dao.updateOp();
            this.sendTotalInfo();
            return true;
         }
      } else {
         return this.player.failure(20);
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Share_19204(FaceBookShareMsg.C2S_Share_19204 msg, String source) {
      SystemFunctionModel systemFunctionModel = this.getSystemFunctionModel(4450);
      if (null != systemFunctionModel && this.player.getPlayerDao().lv >= systemFunctionModel.getOpenLevel()) {
         FaceBookShareDao dao = this.getDao();
         if (1 == dao.shareState) {
            return this.player.failure(76030);
         } else {
            FaceBookShareAwardModel faceBookShareAwardModel = this.getFaceBookShareAwardModel(2);
            this.player.addResource(faceBookShareAwardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 97, 9702, 0, 0, "");
            dao.shareState = 1;
            dao.updateOp();
            this.sendTotalInfo();
            return true;
         }
      } else {
         return this.player.failure(20);
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Invite_19205(FaceBookShareMsg.C2S_Invite_19205 msg, String source) {
      SystemFunctionModel systemFunctionModel = this.getSystemFunctionModel(4450);
      if (null != systemFunctionModel && this.player.getPlayerDao().lv >= systemFunctionModel.getOpenLevel()) {
         FaceBookShareDao dao = this.getDao();
         if (1 == dao.inviteState) {
            return this.player.failure(76030);
         } else {
            FaceBookShareAwardModel faceBookShareAwardModel = this.getFaceBookShareAwardModel(3);
            this.player.addResource(faceBookShareAwardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 97, 9703, 0, 0, "");
            dao.inviteState = 1;
            dao.updateOp();
            this.sendTotalInfo();
            return true;
         }
      } else {
         return this.player.failure(20);
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Community_19206(FaceBookShareMsg.C2S_Community_19206 msg, String source) {
      SystemFunctionModel systemFunctionModel = this.getSystemFunctionModel(4451);
      if (null != systemFunctionModel && this.player.getPlayerDao().lv >= systemFunctionModel.getOpenLevel()) {
         FaceBookShareDao dao = this.getDao();
         if (1 == dao.communityState) {
            return this.player.failure(76030);
         } else {
            Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
            TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_FB_COMMUNITY_REWARD);
            if (null != centreAwardMap && !centreAwardMap.isEmpty()) {
               CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), 604800000L, 97, 9704);
               dao.communityState = 1;
               dao.updateOp();
               this.sendTotalInfo();
               return true;
            } else {
               return this.player.failure(37);
            }
         }
      } else {
         return this.player.failure(20);
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Advise_19207(FaceBookShareMsg.C2S_Advise_19207 msg, String source) {
      SystemFunctionModel systemFunctionModel = this.getSystemFunctionModel(4452);
      if (null != systemFunctionModel && this.player.getPlayerDao().lv >= systemFunctionModel.getOpenLevel()) {
         FaceBookShareDao dao = this.getDao();
         if (1 == dao.adviseState) {
            return this.player.failure(76030);
         } else {
            if (msg.getSendAward()) {
               Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_FB_ADVISE_REWARD);
               if (null == centreAwardMap || centreAwardMap.isEmpty()) {
                  return this.player.failure(37);
               }

               CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), 604800000L, 97, 9705);
            } else {
               this.logger.info("客户端请求不发送【建议反馈邮件奖励】，playerId:{}", this.player.getPlayerId());
            }

            dao.adviseState = 1;
            dao.updateOp();
            this.sendTotalInfo();
            return true;
         }
      } else {
         return this.player.failure(20);
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Binding_19208(FaceBookShareMsg.C2S_Binding_19208 msg, String source) {
      SystemFunctionModel systemFunctionModel = this.getSystemFunctionModel(4453);
      if (null != systemFunctionModel && this.player.getPlayerDao().lv >= systemFunctionModel.getOpenLevel()) {
         FaceBookShareDao dao = this.getDao();
         if (1 == dao.bindingState) {
            return this.player.failure(76030);
         } else {
            FaceBookShareAwardModel faceBookShareAwardModel = this.getFaceBookShareAwardModel(4);
            this.player.addResource(faceBookShareAwardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 97, 9706, 0, 0, "");
            dao.bindingState = 1;
            dao.updateOp();
            this.sendTotalInfo();
            return true;
         }
      } else {
         return this.player.failure(20);
      }
   }

   @MsgHandlerAnno
   public boolean C2S_RecH5Guide_19210(FaceBookShareMsg.C2S_RecH5Guide_19210 msg, String source) {
      FaceBookShareDao dao = this.getDao();
      if (1 == dao.h5GuideState) {
         return this.player.failure(76030);
      } else {
         FaceBookShareAwardModel awardModel = this.getFaceBookShareAwardModel(7);
         if (null == awardModel) {
            return this.player.failure(37);
         } else {
            this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 97, 9608, 0, 0, "");
            dao.h5GuideState = 1;
            dao.updateOp();
            this.sendTotalInfo();
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_GooglePlayer_19209(FaceBookShareMsg.C2S_GooglePlayer_19209 msg, String source) {
      FaceBookShareDao dao = this.getDao();
      if (1 == dao.googlePlayerState) {
         return this.player.failure(76030);
      } else {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_GOOGLE_PLAYER);
         if (null != centreAwardMap && !centreAwardMap.isEmpty()) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), 604800000L, 97, 9607);
            dao.googlePlayerState = 1;
            dao.updateOp();
            this.sendTotalInfo();
            return true;
         } else {
            return this.player.failure(37);
         }
      }
   }

   @TaskMethod
   public void invitePlayer(String beInvite) {
      FaceBookShareDao dao = this.getDao();
      if (!dao.invitePlayer.contains(beInvite)) {
         dao.invitePlayer.add(beInvite);
         dao.updateOp();
         this.sendTotalInfo();
      }
   }
}
