package com.gzbz.db.arraying;

import cn.hutool.core.util.StrUtil;
import com.gzbz.model.MagicBookModel;
import com.gzbz.model.MagicSkillModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DragonArrayingEntity extends ArrayingEntity {
   public Map<Integer, Integer> skillIds = new TreeMap();
   public Map<Integer, PropertyModel> dragonStrengthen = new HashMap();

   public DragonArrayingEntity() {
   }

   public DragonArrayingEntity(int position, int code, Map<Integer, Integer> skillIds, Map<Integer, PropertyModel> dragonStrengthen) {
      this.positon = position;
      this.code = code;
      this.skillIds = skillIds;
      this.dragonStrengthen = dragonStrengthen;
   }

   public boolean heroAndFriend() {
      return false;
   }

   public int heroId() {
      return -1;
   }

   public long power() {
      long power = 0L;
      MagicBookModel magicBookModel = (MagicBookModel)ApplicationContextProvider.getModelPoolEntity("MysticBook", this.code);
      if (magicBookModel == null) {
         return power;
      } else {
         power += (long)magicBookModel.getPowerUp();

         for(int skillId : this.skillIds.values()) {
            MagicSkillModel magicSkillModel = (MagicSkillModel)ApplicationContextProvider.getModelPoolEntity("MysticSkill", skillId);
            if (magicSkillModel != null) {
               power += (long)magicSkillModel.getPowerUp();
            }
         }

         return power;
      }
   }

   public CommonMsg.CodeType entityType() {
      return CommonMsg.CodeType.CODE_DRAGON;
   }

   public CommonMsg.MagicBookInfo toBuilder() {
      CommonMsg.MagicBookInfo.Builder builder = CommonMsg.MagicBookInfo.newBuilder();
      this.skillIds.forEach((k, v) -> {
         CommonMsg.MagicInfo.Builder magicBuilder = CommonMsg.MagicInfo.newBuilder();
         magicBuilder.setPosition(k);
         magicBuilder.setSkillId(v);
         builder.addMagics(magicBuilder);
      });
      builder.setId(super.code);
      return builder.build();
   }

   public String encode() {
      StringBuffer sb = new StringBuffer();
      sb.append(this.positon).append("arrFor");
      sb.append(this.code).append("arrFor");

      for(Map.Entry<Integer, Integer> entry : this.skillIds.entrySet()) {
         sb.append(entry.getKey());
         sb.append(",");
         sb.append(entry.getValue());
         sb.append(";");
      }

      sb.append("arrFor");

      for(Map.Entry<Integer, PropertyModel> entry : this.dragonStrengthen.entrySet()) {
         sb.append(entry.getKey()).append(",");
         sb.append(((PropertyModel)entry.getValue()).getType()).append(",");
         sb.append(((PropertyModel)entry.getValue()).getWay()).append(",");
         sb.append(((PropertyModel)entry.getValue()).getValue()).append(",");
         sb.append(";");
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
         if (StrUtil.isNotEmpty(array[2])) {
            String[] array_sub = array[2].split(";");

            for(String s : array_sub) {
               String[] array_key_val = s.split(",");
               this.skillIds.put(Integer.parseInt(array_key_val[0]), Integer.parseInt(array_key_val[1]));
            }
         }

         if (StrUtil.isNotEmpty(array[3])) {
            String[] array_sub = array[3].split(";");

            for(String s : array_sub) {
               String[] array_key_val = s.split(",");
               PropertyModel propertyModel = new PropertyModel(Integer.parseInt(array_key_val[1]), Integer.parseInt(array_key_val[2]), Long.parseLong(array_key_val[3]));
               this.dragonStrengthen.put(Integer.parseInt(array_key_val[0]), propertyModel);
            }
         }
      }

   }
}
