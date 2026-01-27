package com.gzbz.db.arraying;

import cn.hutool.core.util.StrUtil;
import com.gzbz.protobuf.CommonMsg;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetMirror implements Cloneable, Serializable {
   public int index;
   public int code;
   public int id;
   public int lv;
   public int star;
   public int breach;
   public int skillId;
   public int skillIndex;
   public int exclusiveId;
   public List<Integer> skills = new ArrayList();
   public List<Integer> flySkills = new ArrayList();
   public Map<Integer, Integer> property = new HashMap();
   public List<Integer> growUp = new ArrayList();

   public CommonMsg.PetInfo.Builder toBuilder() {
      CommonMsg.PetInfo.Builder info = CommonMsg.PetInfo.newBuilder();
      info.setIndex(this.index);
      info.setCode(this.code);
      info.setId(this.id);
      info.setLv(this.lv);
      info.setStar(this.star);
      info.setBreach(this.breach);
      info.setSkillId(this.skillId);
      info.setSkillIndex(this.skillIndex);

      for(Integer skill : this.skills) {
         if (skill > 0) {
            info.addSkills(skill);
         }
      }

      for(Map.Entry<Integer, Integer> subEntry : this.property.entrySet()) {
         CommonMsg.MapDataII.Builder proInfo = CommonMsg.MapDataII.newBuilder();
         proInfo.setKey((Integer)subEntry.getKey());
         proInfo.setValue((Integer)subEntry.getValue());
         info.addProperty(proInfo);
      }

      for(Integer grow : this.growUp) {
         info.addGrows(grow);
      }

      return info;
   }

   public String encode() {
      StringBuffer sb = new StringBuffer();
      sb.append(this.index).append("\u0011");
      sb.append(this.code).append("\u0011");
      sb.append(this.id).append("\u0011");
      sb.append(this.lv).append("\u0011");
      sb.append(this.star).append("\u0011");
      sb.append(this.breach).append("\u0011");
      sb.append(this.skillId).append("\u0011");
      sb.append(this.skillIndex).append("\u0011");
      sb.append(this.exclusiveId).append("\u0011");

      for(Integer skill : this.skills) {
         sb.append(skill).append("\u0012");
      }

      sb.append("\u0011");

      for(Integer flySkill : this.flySkills) {
         sb.append(flySkill).append("\u0012");
      }

      sb.append("\u0011");

      for(Map.Entry<Integer, Integer> entry : this.property.entrySet()) {
         sb.append(entry.getKey()).append("\u0013");
         sb.append(entry.getValue()).append("\u0012");
      }

      sb.append("\u0011");

      for(Integer grow : this.growUp) {
         sb.append(grow).append("\u0012");
      }

      sb.append("\u0011");
      return sb.toString();
   }

   public void decode(String str) {
      if (StrUtil.isNotEmpty(str)) {
         String[] array = str.split("\u0011");
         if (array.length < 13) {
            return;
         }

         this.index = Integer.parseInt(array[0]);
         this.code = Integer.parseInt(array[1]);
         this.id = Integer.parseInt(array[2]);
         this.lv = Integer.parseInt(array[3]);
         this.star = Integer.parseInt(array[4]);
         this.breach = Integer.parseInt(array[5]);
         this.skillId = Integer.parseInt(array[6]);
         this.skillIndex = Integer.parseInt(array[7]);
         this.exclusiveId = Integer.parseInt(array[8]);
         if (StrUtil.isNotEmpty(array[9])) {
            String[] array_sub_1 = array[9].split("\u0012");

            for(String state : array_sub_1) {
               this.skills.add(Integer.parseInt(state));
            }
         }

         if (StrUtil.isNotEmpty(array[10])) {
            String[] array_sub_1 = array[10].split("\u0012");

            for(String state : array_sub_1) {
               this.flySkills.add(Integer.parseInt(state));
            }
         }

         if (StrUtil.isNotEmpty(array[11])) {
            String[] array_sub_1 = array[11].split("\u0012");

            for(String tempStr : array_sub_1) {
               String[] array_sub_2 = tempStr.split("\u0013");
               if (array_sub_2.length >= 2) {
                  this.property.put(Integer.parseInt(array_sub_2[0]), Integer.parseInt(array_sub_2[1]));
               }
            }
         }

         if (StrUtil.isNotEmpty(array[12])) {
            String[] array_sub_1 = array[12].split("\u0012");

            for(String state : array_sub_1) {
               this.growUp.add(Integer.parseInt(state));
            }
         }
      }

   }
}
