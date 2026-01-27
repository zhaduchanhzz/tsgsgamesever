package com.gzbz.db.arraying;

import cn.hutool.core.util.StrUtil;
import com.gzbz.protobuf.CommonMsg;

public class BeautyArrayingEntity extends ArrayingEntity {
   public int skillId;
   public int level;
   public AssistantBeauty assistantBeauty;

   public BeautyArrayingEntity() {
   }

   public BeautyArrayingEntity(int position, int code, int skillId, int level) {
      this.positon = position;
      this.code = code;
      this.skillId = skillId;
      this.level = level;
   }

   public boolean heroAndFriend() {
      return false;
   }

   public int heroId() {
      return -1;
   }

   public long power() {
      return 0L;
   }

   public CommonMsg.CodeType entityType() {
      return CommonMsg.CodeType.CODE_BEAUTY;
   }

   public CommonMsg.BeautyInfo toBuilder() {
      CommonMsg.BeautyInfo.Builder builder = CommonMsg.BeautyInfo.newBuilder();
      builder.setPosition(this.positon);
      builder.setId(this.code);
      builder.setSkill(this.skillId);
      return builder.build();
   }

   public String encode() {
      StringBuffer sb = new StringBuffer();
      sb.append(this.positon).append("arrFor");
      sb.append(this.code).append("arrFor");
      sb.append(this.skillId).append("arrFor");
      sb.append(this.level).append("arrFor");
      if (this.assistantBeauty != null) {
         sb.append(this.assistantBeauty.encode());
      }

      sb.append("arrFor");
      return sb.toString();
   }

   public void decode(String str) {
      if (StrUtil.isNotEmpty(str)) {
         String[] array = StrUtil.split(str, "arrFor");
         if (array.length < 3) {
            return;
         }

         this.positon = Integer.parseInt(array[0]);
         this.code = Integer.parseInt(array[1]);
         this.skillId = Integer.parseInt(array[2]);
         this.level = Integer.parseInt(array[3]);
         if (!array[4].isEmpty()) {
            this.assistantBeauty = new AssistantBeauty();
            this.assistantBeauty.decode(array[4]);
         }
      }

   }
}
