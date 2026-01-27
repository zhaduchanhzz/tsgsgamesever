package com.gzbz.db.bean;

import com.gzbz.protobuf.DemonStrikesMsg;
import misc.DateUtil;
import org.springframework.util.StringUtils;

public class DemonStrikesLogData {
   public int type;
   public int server;
   public String playerName;
   public int cityId;
   public int defenseNum;
   public int playerId;
   public int cTime;

   public DemonStrikesMsg.LogInfo.Builder buildLogMsg() {
      DemonStrikesMsg.LogInfo.Builder builder = DemonStrikesMsg.LogInfo.newBuilder();
      builder.setType(DemonStrikesMsg.LogType.forNumber(this.type));
      if (this.server > 0) {
         builder.setServer(this.server);
      }

      if (!StringUtils.isEmpty(this.playerName)) {
         builder.setPlayerName(this.playerName);
      }

      if (this.cityId > 0) {
         builder.setCityId(this.cityId);
      }

      if (this.defenseNum > 0) {
         builder.setDefenseNum(this.defenseNum);
      }

      if (this.playerId > 0) {
         builder.setPlayerId(this.playerId);
      }

      builder.setCreateTime(this.cTime <= 0 ? DateUtil.getIntTime(System.currentTimeMillis()) : this.cTime);
      return builder;
   }

   public static DemonStrikesLogData fromLogMsg(DemonStrikesMsg.LogInfo.Builder logInfo) {
      DemonStrikesLogData logData = new DemonStrikesLogData();
      logData.type = logInfo.getType().getNumber();
      if (logInfo.hasServer()) {
         logData.server = logInfo.getServer();
      }

      if (logInfo.hasPlayerName()) {
         logData.playerName = logInfo.getPlayerName();
      }

      if (logInfo.hasCityId()) {
         logData.cityId = logInfo.getCityId();
      }

      if (logInfo.hasDefenseNum()) {
         logData.defenseNum = logInfo.getDefenseNum();
      }

      if (logInfo.hasPlayerId()) {
         logData.playerId = logInfo.getPlayerId();
      }

      logData.cTime = logInfo.getCreateTime() <= 0 ? DateUtil.getIntTime(System.currentTimeMillis()) : logInfo.getCreateTime();
      return logData;
   }
}
