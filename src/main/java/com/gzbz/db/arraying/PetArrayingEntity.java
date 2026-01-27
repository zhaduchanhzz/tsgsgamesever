package com.gzbz.db.arraying;

import cn.hutool.core.util.StrUtil;
import com.gzbz.protobuf.CommonMsg;
import java.util.Map;
import java.util.TreeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PetArrayingEntity extends ArrayingEntity {
   static Logger logger = LoggerFactory.getLogger(PetArrayingEntity.class);
   public TreeMap<Integer, PetMirror> skillsMap = new TreeMap();

   public PetArrayingEntity() {
   }

   public PetArrayingEntity(int position, int code, TreeMap<Integer, PetMirror> petMap) {
      this.positon = position;
      this.code = code;
      this.skillsMap = petMap;
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
      return CommonMsg.CodeType.CODE_PET;
   }

   public CommonMsg.PetArrayingInfo toBuilder() {
      CommonMsg.PetArrayingInfo.Builder builder = CommonMsg.PetArrayingInfo.newBuilder();
      builder.setPosition(9);

      for(Map.Entry<Integer, PetMirror> entry : this.skillsMap.entrySet()) {
         builder.addPetInfos(((PetMirror)entry.getValue()).toBuilder());
      }

      return builder.build();
   }

   public String encode() {
      StringBuffer sb = new StringBuffer();
      sb.append(this.positon).append("arrFor");
      sb.append(this.code).append("arrFor");

      for(Map.Entry<Integer, PetMirror> entry : this.skillsMap.entrySet()) {
         sb.append(entry.getKey());
         sb.append(",");
         sb.append(((PetMirror)entry.getValue()).encode());
         sb.append(";");
      }

      sb.append("arrFor");
      return sb.toString();
   }

   public void decode(String str) {
      if (StrUtil.isNotEmpty(str)) {
         try {
            String[] array = StrUtil.split(str, "arrFor");
            if (array.length < 4) {
               return;
            }

            this.positon = Integer.parseInt(array[0]);
            this.code = Integer.parseInt(array[1]);
            if (StrUtil.isNotEmpty(array[2])) {
               String[] array_sub = array[2].split(";");

               for(String s : array_sub) {
                  String[] array_key_val = s.split(",");
                  PetMirror petMirror = new PetMirror();
                  petMirror.decode(array_key_val[1]);
                  this.skillsMap.put(Integer.parseInt(array_key_val[0]), petMirror);
               }
            }
         } catch (Exception var10) {
            logger.error("解析阵型出错，str={}", str);
         }
      }

   }
}
