package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.LiYuRewardModel;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.SpringFestivalMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class SpringFestivalTaskPart extends AbstractActivityTaskPart {
   @MsgHandlerAnno
   public void C2S_GiftBoxCommitTask_12415(SpringFestivalMsg.C2S_GiftBoxCommitTask_12415 msg, String source) {
      this.commit(msg.getTaskId());
   }

   protected int rewardReason() {
      return 834;
   }

   protected int getActivityType() {
      return 14;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      SevenDaysTaskModel sevenDaysTaskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskId);
      if (sevenDaysTaskModel == null) {
         this.logger.error("春节活动任务:{}配置不存在", taskId);
         return new ArrayList();
      } else {
         return sevenDaysTaskModel.getRewards();
      }
   }

   public void trigger() {
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo != null && activityInfo.id > 0) {
         this.giftReward();
         if (activityInfo.end > DateUtil.getIntTime(System.currentTimeMillis())) {
            int day = DateUtil.difftimeDay(new Timestamp((long)activityInfo.start * 1000L)) + 1;

            for(SevenDaysTaskModel sevenDaysTaskModel : this.getTaskModels()) {
               if (sevenDaysTaskModel.getTime() == day) {
                  super.createTask(sevenDaysTaskModel.getId());
               }
            }

         }
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         SpringFestivalMsg.S2C_GiftBoxTasks_12418.Builder msg = SpringFestivalMsg.S2C_GiftBoxTasks_12418.newBuilder();

         for(TaskData taskData : taskDataList) {
            ActivityMsg.TaskData task = this.buildTask(taskData);
            if (task != null) {
               msg.addTask(task);
            }
         }

         this.player.sendMsg(msg.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_SPRING_FESTIVAL;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      SpringFestivalMsg.S2C_GiftBoxCommitTask_12416.Builder resp = SpringFestivalMsg.S2C_GiftBoxCommitTask_12416.newBuilder();
      resp.setTaskId(taskId);
      resp.setGotGiftBox(this.getGotGiftCount());
      this.player.sendMsg(resp.build());
   }

   public void loginHandle() {
      this.trigger();
   }

   public int getGotGiftCount() {
      int boxCount = 0;

      for(TaskData taskData : this.getTasksMap().values()) {
         if (taskData.state == 3) {
            ++boxCount;
         }
      }

      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      if (!giftPart.getBuyGifts(21).isEmpty()) {
         boxCount *= 2;
      }

      return boxCount;
   }

   public void giftReward() {
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo != null && activityInfo.id > 0) {
         int day = DateUtil.difftimeDay(new Timestamp((long)activityInfo.start * 1000L)) + 1;
         if (day >= 2) {
            TreeMap<Integer, LiYuRewardModel> liYuRewardModelMap = (TreeMap)ApplicationContextProvider.getModelPoolEntity("customLiyuReward", activityInfo.id);
            LiYuRewardModel liYuRewardModel = null;
            if (liYuRewardModelMap != null && !liYuRewardModelMap.isEmpty()) {
               liYuRewardModel = (LiYuRewardModel)liYuRewardModelMap.firstEntry().getValue();
            }

            GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            List<ResourceModel> rewardList = new ArrayList();
            boolean isSuper = !giftPart.getBuyGifts(21).isEmpty();

            for(TaskData taskData : this.getTasksMap().values()) {
               SevenDaysTaskModel sevenDaysTaskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskData.id);
               if (sevenDaysTaskModel == null) {
                  taskData.delete();
               } else if (sevenDaysTaskModel.getTime() != day) {
                  if (sevenDaysTaskModel.getTime() < day && taskData.state >= 2) {
                     List<ResourceModel> taskRewardList = new ArrayList(sevenDaysTaskModel.getRewards());
                     boolean isBoxReward = true;
                     if (liYuRewardModel != null) {
                        for(ResourceModel resourceModel : taskRewardList) {
                           if (resourceModel.getType() == liYuRewardModel.getPointType() && resourceModel.getId() == liYuRewardModel.getPointId()) {
                              isBoxReward = false;
                              break;
                           }
                        }
                     }

                     if (isBoxReward) {
                        if (!isSuper) {
                           ResourceModel superGiftReward = (ResourceModel)taskRewardList.remove(0);
                           superGiftReward.addResourceToList(playerActivityDao.activitySpringFestivalData.superBox);
                        }

                        for(ResourceModel resourceModel : taskRewardList) {
                           if (resourceModel.getType() != 1 || taskData.state <= 2) {
                              resourceModel.addResourceToList(rewardList);
                           }
                        }
                     }
                  }

                  taskData.delete();
               }
            }

            playerActivityDao.updateOp();
            if (!rewardList.isEmpty()) {
               Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> rewardMailMap = (TreeMap)allAwardModelMap.get(CentreAwardModel.TYPE_SPRING_FESTIVAL_GIFT);
               CentreAwardModel centreAwardModel = (CentreAwardModel)rewardMailMap.firstEntry().getValue();
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               int boxCount = 0;

               for(ResourceModel resourceModel : rewardList) {
                  if (resourceModel.getType() == 2) {
                     boxCount += resourceModel.getValue();
                  }
               }

               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), MessageFormat.format(centreAwardModel.getDesc(), String.valueOf(boxCount)), rewardList, 604800000L, 8, 837);
            }

         }
      }
   }
}
