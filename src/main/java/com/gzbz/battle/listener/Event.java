package com.gzbz.battle.listener;

import com.gzbz.battle.action.Action;
import java.io.Serializable;
import java.util.HashMap;

public class Event implements Serializable {
   private short type;
   private HashMap<Integer, Object> parameterMap = new HashMap();
   private Action action;
   private byte layer;

   public Event(short type, Action action, Event other) {
      this.type = type;
      this.action = action;
      this.addTriggerLayer(other);
   }

   public Action getAction() {
      return this.action;
   }

   public short getType() {
      return this.type;
   }

   public void addParam(int name, Object object) {
      this.parameterMap.put(name, object);
   }

   public <T> T getParam(int name) {
      return (T)(!this.parameterMap.containsKey(name) ? null : this.parameterMap.get(name));
   }

   public <T> T getParamDefault(int name, T value) {
      return (T)this.parameterMap.getOrDefault(name, value);
   }

   public boolean containsParam(int name) {
      return this.parameterMap.containsKey(name);
   }

   public byte getTriggerLayer() {
      return this.layer;
   }

   public void addTriggerLayer(Event other) {
      if (other != null) {
         this.layer = (byte)(other.getTriggerLayer() + 1);
      }
   }
}
