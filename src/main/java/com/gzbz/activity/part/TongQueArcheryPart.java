package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.TongQueArcheryDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.ArcheryPointAwardModel;
import com.gzbz.model.ArcherySignAwardModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.ThemeActivityMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.TongQueArcheryPrayTaskPart;
import com.gzbz.task.TongQueArcheryTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class TongQueArcheryPart extends AbstractActivityPart {
   @MsgHandlerAnno
   public void C2S_ArcheryInfo_12937(ThemeActivityMsg.C2S_ArcheryInfo_12937 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_ArcheryShoot_12939(ThemeActivityMsg.C2S_ArcheryShoot_12939 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         TongQueArcheryDao tongQueArcheryDao = (TongQueArcheryDao)this.player.getData("tb_activity_archery", this.player.getPlayerId());
         if (tongQueArcheryDao.arrowNum <= 0) {
            this.logger.error("玩家【{}】铜雀竞射已经没有次数了还射击", this.player.getPlayerId());
            this.player.failure(0);
         } else {
            ArcheryPointAwardModel archeryPointAwardModel = (ArcheryPointAwardModel)ApplicationContextProvider.getModelPoolEntity("archeryPointAward", msg.getCurPoint());
            if (archeryPointAwardModel == null) {
               this.player.failure(0);
            } else {
               --tongQueArcheryDao.arrowNum;
               tongQueArcheryDao.point += msg.getCurPoint();
               tongQueArcheryDao.updateOp();
               this.player.addResource(archeryPointAwardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_ARCHERY, 8, 870, msg.getCurPoint(), tongQueArcheryDao.arrowNum, "");
               ThemeActivityMsg.S2C_ArcheryShoot_12940.Builder resp = ThemeActivityMsg.S2C_ArcheryShoot_12940.newBuilder();
               resp.setCurPoint(msg.getCurPoint());
               resp.setPoint(tongQueArcheryDao.point);
               resp.setArrowNum(tongQueArcheryDao.arrowNum);
               this.player.sendMsg(resp.build());
               RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
               rankPart.updateRank(RankDefine.RankModule.ACTIVITY_POINT, (long)tongQueArcheryDao.point, false, String.valueOf(this.getActivityType()), String.valueOf(this.getPlayerActivityId()));
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ArcheryPray_12941(ThemeActivityMsg.C2S_ArcheryPray_12941 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         int archerySignNum = ApplicationContextProvider.getConfigInt("archerySignNum", Integer.MAX_VALUE);
         if (msg.getPrayCount() != archerySignNum) {
            this.player.failure(0);
         } else {
            TongQueArcheryDao tongQueArcheryDao = (TongQueArcheryDao)this.player.getData("tb_activity_archery", this.player.getPlayerId());
            if (!tongQueArcheryDao.prays.isEmpty()) {
               this.player.failure(0);
            } else {
               StringBuilder stringBuilder = new StringBuilder();
               TongQueArcheryPrayTaskPart tongQueArcheryPrayTaskPart = (TongQueArcheryPrayTaskPart)this.player.getMgrPart(TongQueArcheryPrayTaskPart.class);

               for(int pray : msg.getPrayList()) {
                  ArcherySignAwardModel archerySignAwardModel = (ArcherySignAwardModel)ApplicationContextProvider.getModelPoolEntity("archerySignAward", pray);
                  if (archerySignAwardModel == null) {
                     this.player.failure(0);
                     return;
                  }

                  if (archerySignAwardModel.getRewardsNeed() == 2) {
                     TaskData taskData = tongQueArcheryPrayTaskPart.getTask(archerySignAwardModel.getId());
                     if (taskData == null || taskData.state < 2) {
                        this.player.failure(3000);
                        return;
                     }
                  }

                  for(ResourceModel resourceModel : archerySignAwardModel.getRewards()) {
                     stringBuilder.append(resourceModel.getId()).append(":").append(resourceModel.getValue()).append("-");
                  }
               }

               tongQueArcheryDao.prays.addAll(msg.getPrayList());
               tongQueArcheryDao.updateOp();
               ThemeActivityMsg.S2C_ArcheryPray_12942.Builder resp = ThemeActivityMsg.S2C_ArcheryPray_12942.newBuilder();
               resp.addAllPray(msg.getPrayList());
               this.player.sendMsg(resp.build());
               if (stringBuilder.length() > 0) {
                  stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                  this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getPlayerActivityId(), "铜雀竞射签到", stringBuilder.toString(), stringBuilder.toString(), 0, 0, 0);
               }

            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ArcheryTaskReward_12945(ThemeActivityMsg.C2S_ArcheryTaskReward_12945 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         TongQueArcheryTaskPart tongQueArcheryTaskPart = (TongQueArcheryTaskPart)this.player.getMgrPart(TongQueArcheryTaskPart.class);
         tongQueArcheryTaskPart.commit(msg.getTaskId());
      }
   }

   @MsgHandlerAnno
   public void C2S_ArcheryTaskArrowReward_12947(ThemeActivityMsg.C2S_ArcheryTaskArrowReward_12947 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         TongQueArcheryDao tongQueArcheryDao = (TongQueArcheryDao)this.player.getData("tb_activity_archery", this.player.getPlayerId());
         if (tongQueArcheryDao.isGotExArrow) {
            this.player.failure(24);
         } else {
            TongQueArcheryTaskPart tongQueArcheryTaskPart = (TongQueArcheryTaskPart)this.player.getMgrPart(TongQueArcheryTaskPart.class);
            Map<Integer, TaskData> taskDataMap = tongQueArcheryTaskPart.getTasksMap();
            if (taskDataMap.isEmpty()) {
               this.player.failure(0);
            } else {
               for(TaskData taskData : taskDataMap.values()) {
                  if (taskData.state < 2) {
                     this.player.failure(0);
                     return;
                  }
               }

               tongQueArcheryDao.isGotExArrow = true;
               ++tongQueArcheryDao.arrowNum;
               tongQueArcheryDao.updateOp();
               ThemeActivityMsg.S2C_ArcheryTaskArrowReward_12948.Builder resp = ThemeActivityMsg.S2C_ArcheryTaskArrowReward_12948.newBuilder();
               resp.setArrowNum(tongQueArcheryDao.arrowNum);
               resp.setIsGot(tongQueArcheryDao.isGotExArrow);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   private void prayReward() {
      TongQueArcheryDao tongQueArcheryDao = (TongQueArcheryDao)this.player.getData("tb_activity_archery", this.player.getPlayerId());
      List<ResourceModel> resourceModels = new ArrayList();

      for(int pray : tongQueArcheryDao.prays) {
         ArcherySignAwardModel archerySignAwardModel = (ArcherySignAwardModel)ApplicationContextProvider.getModelPoolEntity("archerySignAward", pray);
         if (archerySignAwardModel != null) {
            resourceModels.addAll(archerySignAwardModel.getRewards());
         }
      }

      if (!resourceModels.isEmpty()) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> rewardMailMap = (TreeMap)allAwardModelMap.get(CentreAwardModel.TYPE_TONG_QUE_ARCHERY_PRAY);
         CentreAwardModel centreAwardModel = (CentreAwardModel)rewardMailMap.firstEntry().getValue();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModels, 604800000L, 8, 871);
      }

      tongQueArcheryDao.prays.clear();
      tongQueArcheryDao.updateOp();
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         if (this.getSeverActivityDay() != 1) {
            this.prayReward();
            this.resetData();
         }
      }
   }

   public void rotateReset(int oldActivityId) {
      this.resetData();
      TongQueArcheryDao tongQueArcheryDao = (TongQueArcheryDao)this.player.getData("tb_activity_archery", this.player.getPlayerId());
      tongQueArcheryDao.point = 0;
      tongQueArcheryDao.updateOp();
      this.clearActivityGift(24);
   }

   public void activityEnd(int oldActivityId) {
      this.prayReward();
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         TongQueArcheryDao tongQueArcheryDao = (TongQueArcheryDao)this.player.getData("tb_activity_archery", this.player.getPlayerId());
         TongQueArcheryTaskPart tongQueArcheryTaskPart = (TongQueArcheryTaskPart)this.player.getMgrPart(TongQueArcheryTaskPart.class);
         TongQueArcheryPrayTaskPart tongQueArcheryPrayTaskPart = (TongQueArcheryPrayTaskPart)this.player.getMgrPart(TongQueArcheryPrayTaskPart.class);
         ThemeActivityMsg.S2C_ArcheryInfo_12938.Builder msg = ThemeActivityMsg.S2C_ArcheryInfo_12938.newBuilder();
         msg.setDay(this.getSeverActivityDay());
         msg.setArrowNum(tongQueArcheryDao.arrowNum);
         msg.addAllPray(tongQueArcheryDao.prays);
         msg.setIsGot(tongQueArcheryDao.isGotExArrow);

         for(TaskData taskData : tongQueArcheryPrayTaskPart.getTasksMap().values()) {
            msg.addPrayTask(tongQueArcheryPrayTaskPart.buildTask(taskData));
         }

         for(TaskData taskData : tongQueArcheryTaskPart.getTasksMap().values()) {
            msg.addDailyTask(tongQueArcheryTaskPart.buildTask(taskData));
         }

         msg.setPoint(tongQueArcheryDao.point);
         this.player.sendMsg(msg.build());
      }
   }

   public int getActivityType() {
      return 28;
   }

   private void resetData() {
      TongQueArcheryDao tongQueArcheryDao = (TongQueArcheryDao)this.player.getData("tb_activity_archery", this.player.getPlayerId());
      tongQueArcheryDao.reset();
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_TONG_QUE_ARCHERY_DAILY);
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_TONG_QUE_ARCHERY_PRAY);
      TongQueArcheryTaskPart tongQueArcheryTaskPart = (TongQueArcheryTaskPart)this.player.getMgrPart(TongQueArcheryTaskPart.class);
      tongQueArcheryTaskPart.trigger();
      TongQueArcheryPrayTaskPart tongQueArcheryPrayTaskPart = (TongQueArcheryPrayTaskPart)this.player.getMgrPart(TongQueArcheryPrayTaskPart.class);
      tongQueArcheryPrayTaskPart.trigger();
   }
}
