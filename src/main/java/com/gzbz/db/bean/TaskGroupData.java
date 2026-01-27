package com.gzbz.db.bean;

import com.gzbz.protobuf.CommonMsg;

public class TaskGroupData {
   public int group = 0;
   public int end = 0;

   public TaskGroupData() {
   }

   public TaskGroupData(int group, int end) {
      this.group = group;
      this.end = end;
   }

   public CommonMsg.TaskGroup.Builder buildMsg() {
      CommonMsg.TaskGroup.Builder builder = CommonMsg.TaskGroup.newBuilder();
      builder.setEndTime(this.end);
      builder.setGroup(this.group);
      return builder;
   }
}
