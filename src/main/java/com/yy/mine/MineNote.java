package com.yy.mine;

import com.gzbz.model.fun.ResourceModel;
import java.util.ArrayList;
import java.util.List;

public class MineNote {
   public byte type;
   public int createTime;
   public int veinId;
   public int serverId;
   public String playerName;
   public List<ResourceModel> resourceModels = new ArrayList();
   public int defNum;
   public String extraParam = "";

   public MineNote() {
   }

   public MineNote(byte type, int createTime) {
      this.type = type;
      this.createTime = createTime;
   }

   public void initNote(int veinId) {
      this.veinId = veinId;
   }

   public void initNote(int veinId, int serverId, String playerName, int defNum) {
      this.veinId = veinId;
      this.serverId = serverId;
      this.playerName = playerName;
      this.defNum = defNum;
   }

   public void initNote(int veidId, List<ResourceModel> resourceModelList) {
      this.veinId = veidId;
      this.resourceModels.addAll(resourceModelList);
   }

   public void setExtraParam(String extraParam) {
      this.extraParam = extraParam;
   }
}
