package com.gzbz.http.vo;

import com.gzbz.protobuf.ChatMsg;
import misc.DateUtil;

public class ChatLimitData {
   private int coolingTime;
   private int chatLevel;
   private byte type;
   private boolean both;
   private int vip;

   public int getCoolingTime() {
      return this.coolingTime;
   }

   public void setCoolingTime(int coolingTime) {
      this.coolingTime = coolingTime;
   }

   public int getChatLevel() {
      return this.chatLevel;
   }

   public void setChatLevel(int chatLevel) {
      this.chatLevel = chatLevel;
   }

   public byte getType() {
      return this.type;
   }

   public void setType(byte type) {
      this.type = type;
   }

   public boolean isBoth() {
      return this.both;
   }

   public void setBoth(boolean both) {
      this.both = both;
   }

   public int getVip() {
      return this.vip;
   }

   public void setVip(int vip) {
      this.vip = vip;
   }

   public ChatMsg.Chat_Condition.Builder toChatCondition() {
      ChatMsg.Chat_Condition.Builder builder = ChatMsg.Chat_Condition.newBuilder();
      builder.setChannel(this.type);
      builder.setCoolTime(this.coolingTime);
      builder.setBAll(this.both);
      builder.setLevel(this.chatLevel);
      builder.setVip(this.vip);
      return builder;
   }

   public int chatEnable(int level, int vip, int lastChatTime) {
      if (this.isBoth()) {
         if (level < this.chatLevel) {
            return 58110;
         }

         if (vip < this.vip) {
            return 58111;
         }
      } else if (level < this.chatLevel && vip < this.vip) {
         if (level < this.chatLevel) {
            return 58110;
         }

         if (vip < this.vip) {
            return 58111;
         }
      }

      return lastChatTime + this.coolingTime > DateUtil.getIntTime(System.currentTimeMillis()) ? '\ue300' : 1;
   }
}
