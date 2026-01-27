package com.gzbz.battle.action;

import com.gzbz.battle.scene.BattleScene;
import com.gzbz.protobuf.BattleMsg;
import java.io.Serializable;
import java.util.ArrayList;
import misc.LinkList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ActionManager implements Serializable {
   private BattleScene scene;
   private LinkList<Action> actionList = new LinkList();
   private Action curAction;
   static Logger logger = LoggerFactory.getLogger(ActionManager.class);

   public void init(BattleScene scene) {
      this.scene = scene;
   }

   public void addAction(Action action) {
      if (action != null) {
         if (action.getPriority() == 0) {
            this.actionList.add(action);
         } else {
            int oldSize = this.actionList.size();
            if (!this.actionList.isEmpty()) {
               for(LinkList<Action>.Node node = this.actionList.getHead().next; node != this.actionList.getTail(); node = node.next) {
                  if (((Action)node.data).getPriority() == 0 || action.getPriority() < ((Action)node.data).getPriority()) {
                     this.actionList.insert(node, action);
                     break;
                  }
               }
            }

            if (this.actionList.size() == oldSize) {
               this.actionList.add(action);
            }
         }

      }
   }

   public ArrayList<BattleMsg.S2C_Battle_Action.Builder> run() {
      ArrayList<BattleMsg.S2C_Battle_Action.Builder> msgList;
      for(msgList = new ArrayList(); !this.scene.isOver(); this.doAction(msgList)) {
         if (this.actionList.size() == 0) {
            byte actionType = this.scene.getNextAction();
            if (actionType > 7) {
               break;
            }

            Action action = ActionFactory.getAction(this.scene, actionType);
            if (action == null) {
               break;
            }

            this.addAction(action);
         }
      }

      return msgList;
   }

   public void doAction(ArrayList<BattleMsg.S2C_Battle_Action.Builder> msgList) {
      while(this.actionList.size() > 0) {
         this.curAction = (Action)this.actionList.pop();
         this.curAction.setMsgList(msgList);
         BattleMsg.S2C_Battle_Action.Builder actionMsg = this.curAction.run();
         this.curAction.getBlackboard().clear();
         if (actionMsg != null && actionMsg.getEffectesCount() != 0) {
            msgList.add(actionMsg);
            this.addCostTime(this.curAction.type);
         }

         if (this.curAction.getType() != 47) {
            Action action = ActionFactory.getAction(this.scene, (byte)47);
            action.setPriority((byte)1);
            this.addAction(action);
         }
      }

   }

   public Action getCurAction() {
      return this.curAction;
   }

   public void addCostTime(byte type) {
      switch (type) {
         case 0:
            this.scene.addCostTime(2000);
            break;
         case 4:
            this.scene.addCostTime(2500);
            break;
         case 6:
            this.scene.addCostTime(2000);
            break;
         case 20:
            this.scene.addCostTime(2000);
            break;
         case 21:
            this.scene.addCostTime(2000);
            break;
         case 41:
            this.scene.addCostTime(1000);
            break;
         case 42:
            this.scene.addCostTime(1000);
            break;
         case 43:
            this.scene.addCostTime(2000);
            break;
         case 44:
            this.scene.addCostTime(2000);
            break;
         case 45:
            this.scene.addCostTime(1000);
            break;
         case 60:
            this.scene.addCostTime(2500);
      }

   }

   public void destroy() {
      this.scene = null;
      this.actionList = null;
   }

   public void clear() {
      this.actionList.clear();
   }

   public LinkList<Action> getActionList() {
      return this.actionList;
   }

   public boolean isEmpty() {
      return this.actionList.isEmpty();
   }
}
