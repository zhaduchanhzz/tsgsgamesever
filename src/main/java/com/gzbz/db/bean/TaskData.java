package com.gzbz.db.bean;

import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import misc.DateUtil;

public class TaskData {
   public short module = 0;
   public int player = 0;
   public int id = 0;
   public int tVal = 0;
   public short count = 0;
   public byte state = 1;
   public int acTime = 0;
   public int cpTime = 0;
   public int ctTime = 0;

   public void create() {
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      this.ctTime = curTime;
      this.acTime = curTime;
      this.state = (byte)CommonMsg.TaskState.STATE_DOING.getNumber();
      this.getTaskCache().add(this);
   }

   public void complete() {
      this.state = (byte)CommonMsg.TaskState.STATE_COMPLETE.getNumber();
      this.cpTime = DateUtil.getIntTime(System.currentTimeMillis());
      ++this.count;
      this.updateOp();
   }

   public void finish() {
      this.state = (byte)CommonMsg.TaskState.STATE_FINISH.getNumber();
      this.updateOp();
   }

   public void delete() {
      this.getTaskCache().delete(this);
   }

   public void updateOp() {
      this.getTaskCache().updateOp();
   }

   private TaskCustomCache getTaskCache() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer gamePlayer = worldMgr.getPlayerById(this.player);
      if (gamePlayer == null) {
         throw new RuntimeException("玩家" + this.player + "不存在");
      } else {
         return (TaskCustomCache)gamePlayer.getCustomCache("tb_task", this.player);
      }
   }

   public CommonMsg.Task.Builder toBuilder() {
      CommonMsg.Task.Builder task_builder = CommonMsg.Task.newBuilder();
      task_builder.setTaskId(this.id);
      task_builder.setState(CommonMsg.TaskState.forNumber(this.state));
      task_builder.setTaskNum(this.tVal);
      return task_builder;
   }
}
