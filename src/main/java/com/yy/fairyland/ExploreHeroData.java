package com.yy.fairyland;

import cn.hutool.json.JSONUtil;
import com.gzbz.robot.RobotData;
import misc.JsonUtil;

public class ExploreHeroData {
   public int playerId;
   public byte[] heroInfo;
   public int powerLib;
   public int attackNum;
   public int time;
   public int heroPower;
   public boolean isPlayer;
   public String playerName;
   public int serverId;
   public RobotData robot;
   public boolean plusFlag = false;

   public byte[] toByteArray(RobotData robot) {
      String str = JsonUtil.beanToJson(robot);
      return str.getBytes();
   }

   public static RobotData toRobot(byte[] bytes) {
      String str = new String(bytes);
      return (RobotData)JSONUtil.toBean(str, RobotData.class);
   }
}
