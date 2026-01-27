package com.gzbz.battle.action;

import com.gzbz.battle.Blackboard;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.protobuf.BattleMsg;
import java.io.Serializable;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Action implements Serializable {
   protected static Logger logger = LoggerFactory.getLogger(Action.class);
   protected BattleScene scene;
   protected byte type;
   protected Entity entity;
   protected byte priority;
   protected Blackboard blackboard = new Blackboard();
   protected transient ArrayList<BattleMsg.S2C_Battle_Action.Builder> msgList;

   public ArrayList<BattleMsg.S2C_Battle_Action.Builder> getMsgList() {
      return this.msgList;
   }

   public void setMsgList(ArrayList<BattleMsg.S2C_Battle_Action.Builder> msgList) {
      this.msgList = msgList;
   }

   public abstract BattleMsg.S2C_Battle_Action.Builder run();

   public void destroy() {
      this.blackboard.clear();
   }

   public void init(byte type, BattleScene scene) {
      this.type = type;
      this.scene = scene;
   }

   public Entity getEntity() {
      return this.entity;
   }

   public void setEntity(Entity entity) {
      this.entity = entity;
   }

   public void setScene(BattleScene scene) {
      this.scene = scene;
   }

   public BattleScene getScene() {
      return this.scene;
   }

   public void setType(byte type) {
      this.type = type;
   }

   public byte getPriority() {
      return this.priority;
   }

   public void setPriority(byte priority) {
      this.priority = priority;
   }

   public Blackboard getBlackboard() {
      return this.blackboard;
   }

   public byte getType() {
      return this.type;
   }
}
