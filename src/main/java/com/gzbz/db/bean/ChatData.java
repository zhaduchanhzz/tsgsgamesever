package com.gzbz.db.bean;

import com.gzbz.protobuf.BagMsg;
import com.gzbz.protobuf.CommonMsg;
import java.util.List;
import java.util.Set;

public class ChatData {
   public int serverId;
   public int senderId;
   public int channel;
   public String content;
   public int subclass;
   public CommonMsg.HeroInfo heroInfoMsg;
   public int appointId;
   public BagMsg.Item_Info itemInfoMsg;
   public String shareTips;
   public int bubble;
   public Set<Integer> medals;
   public List<CommonMsg.MapDataIS> customPrestige;

   public ChatData(int serverId, int senderId, int channel, String content, int subclass, CommonMsg.HeroInfo heroInfoMsg, int appointId, BagMsg.Item_Info itemInfoMsg, String shareTips, int bubble, Set<Integer> medals, List<CommonMsg.MapDataIS> customPrestige) {
      this.serverId = serverId;
      this.senderId = senderId;
      this.channel = channel;
      this.content = content;
      this.subclass = subclass;
      this.heroInfoMsg = heroInfoMsg;
      this.appointId = appointId;
      this.itemInfoMsg = itemInfoMsg;
      this.shareTips = shareTips;
      this.bubble = bubble;
      this.medals = medals;
      this.customPrestige = customPrestige;
   }
}
