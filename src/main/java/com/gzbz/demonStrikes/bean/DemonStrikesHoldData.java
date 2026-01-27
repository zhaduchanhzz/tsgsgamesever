package com.gzbz.demonStrikes.bean;

import com.gzbz.protobuf.DemonStrikesMsg;
import java.util.HashMap;
import java.util.Map;

public class DemonStrikesHoldData {
   public int uid;
   public Map<Byte, Integer> hp = new HashMap();
   public int defense;

   public DemonStrikesHoldData(int uid) {
      this.uid = uid;
   }

   public DemonStrikesHoldData() {
   }

   public DemonStrikesMsg.CityHoldInfo.Builder buildHoldMsg(int modelId) {
      DemonStrikesMsg.CityHoldInfo.Builder holdInfo = DemonStrikesMsg.CityHoldInfo.newBuilder();
      holdInfo.setDefenseValue(this.defense);
      holdInfo.setUid(this.uid);
      if (modelId > 0) {
         holdInfo.setModelId(modelId);
      }

      for(Map.Entry<Byte, Integer> entry : this.hp.entrySet()) {
         DemonStrikesMsg.NpcHpInfo.Builder hpInfo = DemonStrikesMsg.NpcHpInfo.newBuilder();
         hpInfo.setPos((Byte)entry.getKey());
         hpInfo.setHpPercent((Integer)entry.getValue());
         holdInfo.addNpcHp(hpInfo);
      }

      return holdInfo;
   }

   public String toString() {
      return "{uid=" + this.uid + ", hpData=" + this.hp + ", defenseValue=" + this.defense + '}';
   }
}
