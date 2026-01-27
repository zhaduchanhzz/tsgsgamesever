package com.gzbz.udp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import udp.MsgSendList;

@Component
public class DBMsgSendList extends MsgSendList {
   @Value("${PlatformName}")
   private String platform;
   @Value("${ServerId}")
   private int serverId;

   public byte getServerType() {
      return 1;
   }

   public String getPlatform() {
      return this.platform;
   }

   public int getServerId() {
      return this.serverId;
   }
}
