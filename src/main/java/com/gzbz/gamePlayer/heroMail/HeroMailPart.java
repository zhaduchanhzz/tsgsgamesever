package com.gzbz.gamePlayer.heroMail;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.google.common.base.Splitter;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerExtend.HeroMailData;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.HeroMailModel;
import com.gzbz.model.HeroMailTaskModel;
import com.gzbz.protobuf.HeroMailMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.HeroMailTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import misc.DateUtil;
import org.apache.commons.lang3.StringUtils;
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
public class HeroMailPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(HeroMailPart.class);
   @Autowired
   WorldMgr worldMgr;

   public void loginHandle() {
      super.loginHandle();
      HeroMailExtend heroMailExtend = (HeroMailExtend)this.player.getPlayerExtend(23);
      if (heroMailExtend.heroMailMap.isEmpty()) {
         PlayerExtend playerExtent = (PlayerExtend)this.player.getPlayerExtend(13);
         if (!playerExtent.heroMailMap.isEmpty()) {
            for(Map.Entry<Integer, HeroMailData> entry : playerExtent.heroMailMap.entrySet()) {
               HeroMailData data = new HeroMailData();
               data.taskState = ((HeroMailData)entry.getValue()).taskState;
               data.state = ((HeroMailData)entry.getValue()).state;
               data.mailTime = ((HeroMailData)entry.getValue()).mailTime;
               data.mailId = ((HeroMailData)entry.getValue()).mailId;
               heroMailExtend.heroMailMap.put(entry.getKey(), data);
            }

            this.player.updatePlayerExtend(23);
            playerExtent.heroMailMap.clear();
            this.player.updatePlayerExtend(13);
         }
      }

      List<HeroMailModel> needAddList = new ArrayList();
      Map<Integer, HeroMailModel> map = this.player.getGameModelPool().getMap("heromail");
      if (map != null && !map.isEmpty()) {
         for(Map.Entry<Integer, HeroMailModel> entry : map.entrySet()) {
            HeroMailModel heroMailModel = (HeroMailModel)entry.getValue();
            if (!heroMailExtend.heroMailMap.containsKey(entry.getKey()) && this.checkInArea(heroMailModel.getArea()) && (heroMailModel.getIsSpokes() != 1 || this.checkSpokes())) {
               needAddList.add(heroMailModel);
            }
         }
      }

      if (!needAddList.isEmpty()) {
         this.addMail(needAddList, heroMailExtend);
         this.player.updatePlayerExtend(23);
      }

   }

   public void addMail(List<HeroMailModel> mailModels, HeroMailExtend heroMailExtend) {
      HeroMailTaskPart heroMailTaskPart = (HeroMailTaskPart)this.player.getMgrPart(HeroMailTaskPart.class);
      int time = (int)(System.currentTimeMillis() / 1000L);

      for(HeroMailModel mailModel : mailModels) {
         HeroMailData heroMailData = new HeroMailData();
         heroMailData.mailId = mailModel.getId();
         switch (mailModel.getType()) {
            case 1:
            case 2:
            case 3:
               heroMailData.taskState = 1;
               break;
            case 4:
            case 5:
            case 6:
               TaskData taskData = heroMailTaskPart.addTask(mailModel.getMailtask());
               if (taskData != null) {
                  heroMailData.taskState = taskData.state;
                  if (heroMailData.taskState == 2) {
                     heroMailData.mailTime = time;
                  }

                  heroMailExtend.heroMailMap.put(mailModel.getId(), heroMailData);
               }
         }

         heroMailExtend.heroMailMap.put(mailModel.getId(), heroMailData);
      }

   }

   public boolean checkInArea(String areaListStr) {
      if (StringUtils.isBlank(areaListStr)) {
         return true;
      } else {
         String country = this.worldMgr.country;

         for(String areaStr : Splitter.on("|").splitToList(areaListStr)) {
            if (Objects.equals(country, areaStr)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean checkSpokes() {
      String spokesmanSwitch = ApplicationContextProvider.getConfigString("SpokesmanSwitch", "");
      if (StringUtils.isEmpty(spokesmanSwitch)) {
         return false;
      } else {
         List<String> areaStrList = Splitter.on("|").splitToList(spokesmanSwitch);
         return areaStrList.contains(this.worldMgr.PLATFORM_NAME);
      }
   }

   @MsgHandlerAnno
   public void C2S_OpenUi_13701(HeroMailMsg.C2S_OpenUi_13701 msg, String source) {
      HeroMailExtend heroMailExtend = this.checkMailState();
      HeroMailMsg.S2C_OpenUi_13702.Builder builder = HeroMailMsg.S2C_OpenUi_13702.newBuilder();
      builder.setOpenServerTime((int)(this.worldMgr.getOpenServerTime() / 1000L));
      builder.setCreatePlayerTime((int)(this.player.getPlayerDao().birthTime / 1000L));

      for(Map.Entry<Integer, HeroMailData> entry : heroMailExtend.heroMailMap.entrySet()) {
         builder.addInfos(this.toMailInfoBuilder((HeroMailData)entry.getValue()));
      }

      this.player.sendMsg(builder.build());
   }

   public HeroMailExtend checkMailState() {
      HeroMailExtend heroMailExtend = (HeroMailExtend)this.player.getPlayerExtend(23);
      if (heroMailExtend.heroMailMap.isEmpty()) {
         return heroMailExtend;
      } else {
         boolean isChange = false;
         long time = System.currentTimeMillis();

         for(Map.Entry<Integer, HeroMailData> entry : heroMailExtend.heroMailMap.entrySet()) {
            if (((HeroMailData)entry.getValue()).taskState < 2) {
               HeroMailModel heroMailModel = (HeroMailModel)this.player.getGameModelPool().getEntity("heromail", ((HeroMailData)entry.getValue()).mailId);
               if (heroMailModel != null) {
                  switch (heroMailModel.getType()) {
                     case 1:
                        Date date = DateUtil.getDateTimestamp(heroMailModel.getSpecificTime());
                        if (time >= date.getTime()) {
                           isChange = true;
                           ((HeroMailData)entry.getValue()).taskState = 2;
                           ((HeroMailData)entry.getValue()).mailTime = (int)(time / 1000L);
                        }
                        break;
                     case 2:
                        if (time >= this.worldMgr.getOpenServerTime() + Long.valueOf((long)heroMailModel.getOpenTime()) * 60L * 1000L) {
                           isChange = true;
                           ((HeroMailData)entry.getValue()).taskState = 2;
                           ((HeroMailData)entry.getValue()).mailTime = (int)(time / 1000L);
                        }
                        break;
                     case 3:
                        if (time >= this.player.getPlayerDao().birthTime + Long.valueOf((long)heroMailModel.getCreateTime()) * 60L * 1000L) {
                           isChange = true;
                           ((HeroMailData)entry.getValue()).taskState = 2;
                           ((HeroMailData)entry.getValue()).mailTime = (int)(time / 1000L);
                        }
                        break;
                     case 4:
                        TaskData taskData = this.player.getTask(TaskDefine.TaskModule.MODULE_HERO_MAIL_TASK, heroMailModel.getMailtask());
                        if (taskData != null && ((HeroMailData)entry.getValue()).taskState != taskData.state) {
                           isChange = true;
                           ((HeroMailData)entry.getValue()).taskState = taskData.state;
                           if (((HeroMailData)entry.getValue()).taskState >= 2) {
                              ((HeroMailData)entry.getValue()).mailTime = (int)(time / 1000L);
                              taskData.delete();
                           }
                        }
                        break;
                     case 5:
                        if (time <= this.worldMgr.getOpenServerTime() + Long.valueOf((long)heroMailModel.getOpenTime()) * 60L * 1000L) {
                           TaskData taskData5 = this.player.getTask(TaskDefine.TaskModule.MODULE_HERO_MAIL_TASK, heroMailModel.getMailtask());
                           if (taskData5 != null && ((HeroMailData)entry.getValue()).taskState != taskData5.state) {
                              isChange = true;
                              ((HeroMailData)entry.getValue()).taskState = taskData5.state;
                              if (((HeroMailData)entry.getValue()).taskState >= 2) {
                                 ((HeroMailData)entry.getValue()).mailTime = (int)(time / 1000L);
                                 taskData5.delete();
                              }
                           }
                        }
                        break;
                     case 6:
                        Date date6 = DateUtil.getDateTimestamp(heroMailModel.getSpecificTime());
                        if (time <= date6.getTime()) {
                           TaskData taskData6 = this.player.getTask(TaskDefine.TaskModule.MODULE_HERO_MAIL_TASK, heroMailModel.getMailtask());
                           if (taskData6 != null && ((HeroMailData)entry.getValue()).taskState != taskData6.state) {
                              isChange = true;
                              ((HeroMailData)entry.getValue()).taskState = taskData6.state;
                              if (((HeroMailData)entry.getValue()).taskState >= 2) {
                                 ((HeroMailData)entry.getValue()).mailTime = (int)(time / 1000L);
                                 taskData6.delete();
                              }
                           }
                        }
                  }
               }
            }
         }

         if (isChange) {
            this.player.updatePlayerExtend(23);
         }

         return heroMailExtend;
      }
   }

   @MsgHandlerAnno
   public void C2S_ReadMail_13703(HeroMailMsg.C2S_ReadMail_13703 msg, String source) {
      HeroMailExtend heroMailExtend = this.checkMailState();
      if (!heroMailExtend.heroMailMap.isEmpty()) {
         if (heroMailExtend.heroMailMap.containsKey(msg.getTaskId())) {
            HeroMailData heroMailData = (HeroMailData)heroMailExtend.heroMailMap.get(msg.getTaskId());
            if (heroMailData.taskState < 2) {
               this.player.failure(61068);
            } else if (heroMailData.state == 0) {
               heroMailData.state = 1;
               this.player.updatePlayerExtend(23);
               HeroMailMsg.S2C_ReadMail_13704.Builder builder = HeroMailMsg.S2C_ReadMail_13704.newBuilder();
               builder.setResult(1);
               builder.setTaskId(msg.getTaskId());
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TakeMail_13705(HeroMailMsg.C2S_TakeMail_13705 msg, String source) {
      HeroMailExtend heroMailExtend = this.checkMailState();
      if (!heroMailExtend.heroMailMap.isEmpty()) {
         if (heroMailExtend.heroMailMap.containsKey(msg.getTaskId())) {
            HeroMailData heroMailData = (HeroMailData)heroMailExtend.heroMailMap.get(msg.getTaskId());
            if (heroMailData.taskState < 2) {
               this.player.failure(61068);
            } else if (heroMailData.state != 2) {
               HeroMailModel heroMailModel = (HeroMailModel)this.player.getGameModelPool().getEntity("heromail", heroMailData.mailId);
               if (heroMailModel != null) {
                  if (!heroMailModel.getItems().isEmpty()) {
                     heroMailData.state = 2;
                     this.player.updatePlayerExtend(23);
                     this.player.addResource(heroMailModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 23, 2301, heroMailData.mailId, heroMailData.taskState, "");
                     HeroMailMsg.S2C_TakeMail_13706.Builder builder = HeroMailMsg.S2C_TakeMail_13706.newBuilder();
                     builder.setResult(1);
                     builder.setTaskId(msg.getTaskId());
                     this.player.sendMsg(builder.build());
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OneKeyTakeMail_13709(HeroMailMsg.C2S_OneKeyTakeMail_13709 msg, String source) {
      HeroMailExtend heroMailExtend = this.checkMailState();
      if (!heroMailExtend.heroMailMap.isEmpty()) {
         List<Integer> takeList = new ArrayList();

         for(Map.Entry<Integer, HeroMailData> entry : heroMailExtend.heroMailMap.entrySet()) {
            if (((HeroMailData)entry.getValue()).taskState == 2 && ((HeroMailData)entry.getValue()).state < 2) {
               HeroMailModel heroMailModel = (HeroMailModel)this.player.getGameModelPool().getEntity("heromail", ((HeroMailData)entry.getValue()).mailId);
               if (heroMailModel != null && heroMailModel.getItems().size() > 0 && (heroMailModel.getIsSpokes() != 1 || this.checkSpokes())) {
                  takeList.add(((HeroMailData)entry.getValue()).mailId);
                  ((HeroMailData)entry.getValue()).state = 2;
                  this.player.addResource(heroMailModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_MAIL_OKE_KEY_TAKE, 23, 2301, ((HeroMailData)entry.getValue()).mailId, ((HeroMailData)entry.getValue()).taskState, "");
               }
            }
         }

         if (!takeList.isEmpty()) {
            this.player.sendResourceMsg_OneKeyTakeMail();
            this.player.updatePlayerExtend(23);
            HeroMailMsg.S2C_OneKeyTakeMail_13710.Builder builder = HeroMailMsg.S2C_OneKeyTakeMail_13710.newBuilder();
            builder.addAllTaskId(takeList);
            this.player.sendMsg(builder.build());
         }
      }
   }

   public HeroMailMsg.HeroMailInfo.Builder toMailInfoBuilder(HeroMailData data) {
      HeroMailMsg.HeroMailInfo.Builder builder = HeroMailMsg.HeroMailInfo.newBuilder();
      builder.setId(data.mailId);
      builder.setState(data.state);
      builder.setTaskState(data.taskState);
      builder.setMailTime(data.mailTime);
      return builder;
   }

   public void updateTask(List<TaskData> taskDataList) {
      HeroMailExtend heroMailExtend = this.checkMailState();
      HeroMailMsg.S2C_UpdateMail_13722.Builder builder = HeroMailMsg.S2C_UpdateMail_13722.newBuilder();

      for(TaskData taskData : taskDataList) {
         HeroMailTaskModel heroMailTaskModel = (HeroMailTaskModel)this.player.getGameModelPool().getEntity("heromailtask", taskData.id);
         if (heroMailTaskModel != null && heroMailExtend.heroMailMap.containsKey(heroMailTaskModel.getMailid())) {
            builder.addInfos(this.toMailInfoBuilder((HeroMailData)heroMailExtend.heroMailMap.get(heroMailTaskModel.getMailid())));
         }
      }

      this.player.sendMsg(builder.build());
   }

   public List<HeroMailModel> getHeroMailModelList(List<TaskData> taskDataList) {
      List<HeroMailModel> heroMailModelList = new ArrayList();
      Map<Integer, HeroMailModel> heroMailModelMap = this.player.getGameModelPool().getMap("heromail");
      if (heroMailModelMap != null || !heroMailModelMap.isEmpty()) {
         List<Integer> taskIdList = new ArrayList();

         for(TaskData taskData : taskDataList) {
            taskIdList.add(taskData.id);
         }

         for(Map.Entry<Integer, HeroMailModel> entry : heroMailModelMap.entrySet()) {
            if (taskIdList.contains(((HeroMailModel)entry.getValue()).getMailtask())) {
               heroMailModelList.add(entry.getValue());
            }
         }
      }

      return heroMailModelList;
   }

   public void gmHeroMail(String params) {
      String[] strArr = params.split(",");
      switch (strArr[0]) {
         case "delall":
            HeroMailExtend heroMailExtend = (HeroMailExtend)this.player.getPlayerExtend(23);
            heroMailExtend.heroMailMap.clear();
            this.player.updatePlayerExtend(23);
         default:
      }
   }
}
