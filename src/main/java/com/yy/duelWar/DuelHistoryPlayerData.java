package com.yy.duelWar;

import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.protobuf.DuelBattleMsg;
import java.util.ArrayList;
import java.util.List;

public class DuelHistoryPlayerData {
   public int rank;
   public int playerId;
   public String playerName;
   public int serverId;
   public int lv;
   public int vip;
   public boolean isShowVip;
   public int head;
   public int headFrame;
   public int like = 0;
   public int zone;
   public int medal;
   public List<byte[]> arraying = new ArrayList();

   public DuelBattleMsg.HistoryPlayerData.Builder buildMsg(boolean myLike) {
      DuelBattleMsg.HistoryPlayerData.Builder msg = DuelBattleMsg.HistoryPlayerData.newBuilder();
      msg.setRank(this.rank);
      msg.setPlayerId(this.playerId);
      msg.setPlayerName(this.playerName);
      msg.setServerId(this.serverId);
      msg.setLv(this.lv);
      msg.setVip(this.vip);
      msg.setIsShowVip(this.isShowVip);
      msg.setHead(this.head);
      msg.setHeadFrame(this.headFrame);
      msg.setZone(this.zone);
      msg.setLike(this.like);
      msg.setMyLike(myLike);
      msg.setMedal(this.medal);

      for(byte[] arrayingBytes : this.arraying) {
         if (arrayingBytes != null) {
            ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror(arrayingBytes);
            if (arrayingMirror != null) {
               msg.addArraying(arrayingMirror.toPlayerArrayingInfo());
            }
         }
      }

      return msg;
   }
}
