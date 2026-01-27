package com.gzbz.robot;

import com.gzbz.db.bean.ArrayingMirror;
import java.util.ArrayList;
import java.util.List;

public class RobotData {
   public boolean pass = false;
   public int player = 0;
   public String name = "";
   public int lv = 0;
   public int head = 1;
   public int headFrame = 30001;
   public int power = 0;
   public int sex = 1;
   public int vip_lv = 0;
   public int monarchId = 0;
   public int likeNum = 0;
   public int canFight = 0;
   public int serverId = 0;
   public List<byte[]> arrayingMirrorList = new ArrayList();

   public List<ArrayingMirror> parseArrayingMirror() {
      List<ArrayingMirror> list = new ArrayList();

      for(byte[] arraysBytes : this.arrayingMirrorList) {
         list.add(ArrayingMirror.toArrayingMirror(arraysBytes));
      }

      return list;
   }
}
