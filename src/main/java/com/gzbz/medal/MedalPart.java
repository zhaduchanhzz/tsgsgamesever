package com.gzbz.medal;

import allMgr.PartAnnotation;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.db.ItemBagDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.BagParent;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.model.MedalModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MedalPart extends AbstractTaskPart {
   public void trigger() {
      Map<Integer, MedalModel> medalModelMap = ApplicationContextProvider.<Integer, MedalModel>getModelPoolMap("xunzhang");
      if (medalModelMap != null) {
         for(MedalModel medalModel : medalModelMap.values()) {
            if (medalModel.getTargetType() > 0) {
               this.createTask(medalModel.getItemId());
            }
         }

      }
   }

   public boolean checkComplete(TaskData taskData) {
      if (!super.checkComplete(taskData)) {
         return false;
      } else {
         this.commit(taskData.id);
         return true;
      }
   }

   public void commit(int taskId) {
      TaskData taskData = this.getTask(taskId);
      if (taskData != null) {
         taskData.finish();
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
   }

   protected GeneratedMessageV3 buildTask(TaskData taskData) {
      return null;
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_MEDAL;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
   }

   public TaskTargetItem getTargetItem(int taskId) {
      MedalModel medalModel = (MedalModel)ApplicationContextProvider.getModelPoolEntity("xunzhang", taskId);
      return medalModel == null ? null : new TaskTargetItem(medalModel.getTargetType(), medalModel.getTargetId(), medalModel.getTargetValue());
   }

   public void loginHandle() {
      this.checkMedals();
      this.trigger();
   }

   public void resetHour() {
      this.checkMedals();
   }

   public Set<Integer> getMedals() {
      Set<Integer> medals = new HashSet();
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      BagParent<ItemBase> medalBag = itemBagDao.getBagBySublass(18);

      for(int code : medalBag.getMap().keySet()) {
         ItemBase itemBase = medalBag.getItemByCode(code);
         if (itemBase != null) {
            MedalModel medalModel = (MedalModel)ApplicationContextProvider.getModelPoolEntity("xunzhang", itemBase.id);
            if (medalModel != null && (long)itemBase.enableTime * 1000L > System.currentTimeMillis()) {
               medals.add(itemBase.id);
            }
         }
      }

      return medals;
   }

   private void checkMedals() {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      BagParent<ItemBase> medalBag = itemBagDao.getBagBySublass(18);

      for(int code : medalBag.getMap().keySet()) {
         ItemBase itemBase = medalBag.getItemByCode(code);
         if (itemBase != null) {
            MedalModel medalModel = (MedalModel)ApplicationContextProvider.getModelPoolEntity("xunzhang", itemBase.id);
            if (medalModel == null || (long)itemBase.enableTime * 1000L <= System.currentTimeMillis()) {
               this.player.delResource(2, itemBase.id, (long)itemBase.getNum(), 2, 213, 0, 0, "");
               this.logger.warn("玩家【{}】勋章【{}】【{}】失效,移除勋章", new Object[]{this.player.getPlayerId(), itemBase.id, DateUtil.transferLongToDate((long)itemBase.enableTime * 1000L)});
            }
         }
      }

   }
}
