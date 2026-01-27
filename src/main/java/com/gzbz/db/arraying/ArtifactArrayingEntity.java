package com.gzbz.db.arraying;

import cn.hutool.core.util.StrUtil;
import com.gzbz.protobuf.CommonMsg;

public class ArtifactArrayingEntity extends ArrayingEntity {
   public int skillId;
   public int level;
   public int skinId;

   public ArtifactArrayingEntity() {
   }

   public ArtifactArrayingEntity(int position, int code, int skillId, int level, int skinId) {
      this.positon = position;
      this.code = code;
      this.skillId = skillId;
      this.level = level;
      this.skinId = skinId;
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
      return CommonMsg.CodeType.CODE_ARTIFACT;
   }

   public CommonMsg.ArtifactInfo toBuilder() {
      CommonMsg.ArtifactInfo.Builder builder = CommonMsg.ArtifactInfo.newBuilder();
      builder.setPosition(this.positon);
      builder.setId(this.code);
      builder.setSkill(this.skillId);
      builder.setLv(this.level);
      builder.setSkinId(this.skinId);
      return builder.build();
   }

   public String encode() {
      StringBuffer sb = new StringBuffer();
      sb.append(this.positon).append("arrFor");
      sb.append(this.code).append("arrFor");
      sb.append(this.skillId).append("arrFor");
      sb.append(this.level).append("arrFor");
      sb.append(this.skinId).append("arrFor");
      return sb.toString();
   }

   public void decode(String str) {
      if (StrUtil.isNotEmpty(str)) {
         String[] array = StrUtil.split(str, "arrFor");
         if (array.length < 5) {
            return;
         }

         this.positon = Integer.parseInt(array[0]);
         this.code = Integer.parseInt(array[1]);
         this.skillId = Integer.parseInt(array[2]);
         this.level = Integer.parseInt(array[3]);
         this.skinId = Integer.parseInt(array[4]);
      }

   }
}
