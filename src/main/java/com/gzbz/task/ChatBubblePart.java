package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.ChatBubbleModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ChatMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ChatBubblePart extends AbstractTaskPart {
   @MsgHandlerAnno
   public void C2S_ChoiceBubble_6019(ChatMsg.C2S_ChoiceBubble_6019 msg, String source) {
      ChatBubbleModel chatBubbleModel = (ChatBubbleModel)ApplicationContextProvider.getModelPoolEntity("chatBubble", msg.getBubbleId());
      if (chatBubbleModel == null) {
         this.player.failure(0);
      } else {
         if (msg.getBubbleId() > 0) {
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            List<ItemBase> bubbleItemList = itemBagPart.getItemBaseById(msg.getBubbleId());
            if (bubbleItemList == null || bubbleItemList.isEmpty()) {
               this.player.failure(7001);
               return;
            }

            ItemBase bubbleItem = (ItemBase)bubbleItemList.get(0);
            if (bubbleItem.enableTime > 0 && (long)bubbleItem.enableTime * 1000L <= System.currentTimeMillis()) {
               this.player.failure(7002);
               return;
            }
         }

         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         this.checkBubbleInvalid(playerExtend.bubble);
         this.settingBubble(msg.getBubbleId());
         ChatMsg.S2C_ChoiceBubble_6020.Builder resp = ChatMsg.S2C_ChoiceBubble_6020.newBuilder();
         resp.setBubbleId(msg.getBubbleId());
         this.player.sendMsg(resp.build());
      }
   }

   public void trigger() {
      Map<Integer, ChatBubbleModel> chatBubbleModelMap = ApplicationContextProvider.<Integer, ChatBubbleModel>getModelPoolMap("chatBubble");
      if (chatBubbleModelMap != null && !chatBubbleModelMap.isEmpty()) {
         for(ChatBubbleModel bubbleModel : chatBubbleModelMap.values()) {
            if (bubbleModel.getId() > 0 && bubbleModel.getTargetType() > 0 && bubbleModel.getTargetValue() > 0) {
               this.createTask(bubbleModel.getId());
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
         ChatBubbleModel chatBubbleModel = (ChatBubbleModel)ApplicationContextProvider.getModelPoolEntity("chatBubble", taskId);
         if (chatBubbleModel != null) {
            if (this.player.checkResourceNum(2, chatBubbleModel.getId(), 1)) {
               if (!chatBubbleModel.getConvert().isEmpty()) {
                  this.player.addResource((Integer)chatBubbleModel.getConvert().get(0), (Integer)chatBubbleModel.getConvert().get(1), (Integer)chatBubbleModel.getConvert().get(2), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 7, 709, 0, 0, "");
               }

            } else {
               this.player.addResource(2, chatBubbleModel.getId(), 1, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 7, 709, 0, 0, "");
            }
         }
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
   }

   protected GeneratedMessageV3 buildTask(TaskData taskData) {
      return null;
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_CHAT_BUBBLE;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
   }

   public TaskTargetItem getTargetItem(int taskId) {
      ChatBubbleModel chatBubbleModel = (ChatBubbleModel)ApplicationContextProvider.getModelPoolEntity("chatBubble", taskId);
      return chatBubbleModel == null ? null : new TaskTargetItem(chatBubbleModel.getTargetType(), chatBubbleModel.getTargetId(), chatBubbleModel.getTargetValue());
   }

   public void loginHandle() {
      this.checkBubbles();
      this.trigger();
   }

   public void resetHour() {
      this.checkBubbles();
   }

   private void checkBubbles() {
      Map<Integer, ChatBubbleModel> chatBubbleModelMap = ApplicationContextProvider.<Integer, ChatBubbleModel>getModelPoolMap("chatBubble");
      if (chatBubbleModelMap != null && !chatBubbleModelMap.isEmpty()) {
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);

         for(int bubble : chatBubbleModelMap.keySet()) {
            if (this.checkBubbleInvalid(bubble) && playerExtend.bubble == bubble) {
               this.settingBubble(0);
            }
         }

      }
   }

   public boolean checkBubbleInvalid(int bubble) {
      if (bubble == 0) {
         return false;
      } else {
         ChatBubbleModel chatBubbleModel = (ChatBubbleModel)ApplicationContextProvider.getModelPoolEntity("chatBubble", bubble);
         if (chatBubbleModel == null) {
            this.resetBubble(bubble);
            return true;
         } else {
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            List<ItemBase> itemBases = itemBagPart.getItemBaseById(chatBubbleModel.getId());
            if (itemBases != null && !itemBases.isEmpty()) {
               ItemBase itemBase = (ItemBase)itemBases.get(0);
               if (itemBase.enableTime <= 0) {
                  return false;
               } else if ((long)itemBase.enableTime * 1000L <= System.currentTimeMillis()) {
                  this.resetBubble(chatBubbleModel.getId());
                  return true;
               } else {
                  return false;
               }
            } else {
               return true;
            }
         }
      }
   }

   public void settingBubble(int bubble) {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.bubble != bubble) {
         playerExtend.bubble = bubble;
         this.player.updatePlayerExtend(13);
         this.player.notifyPlayerData(PlayerDefine.CHAT_BUBBLE, playerExtend.bubble);
      }

   }

   public void resetBubble(int bubble) {
      if (this.player.checkResourceNum(2, bubble, 1)) {
         this.player.delResource(2, bubble, 1L, 7, 710, 0, 0, "");
      }

   }
}
