package com.gzbz.db.arraying;

import java.util.ArrayList;
import java.util.List;

public class AssistantBeauty {
   public List<Integer> assistantList = new ArrayList();
   public List<Integer> assistantSkillList = new ArrayList();
   public List<Integer> beautyList = new ArrayList();
   public List<Integer> beautySkillList = new ArrayList();

   public String encode() {
      StringBuffer sb = new StringBuffer();

      for(Integer id : this.assistantList) {
         sb.append(id).append(",");
      }

      sb.append(";");

      for(Integer id : this.assistantSkillList) {
         sb.append(id).append(",");
      }

      sb.append(";");

      for(Integer id : this.beautyList) {
         sb.append(id).append(",");
      }

      sb.append(";");

      for(Integer id : this.beautySkillList) {
         sb.append(id).append(",");
      }

      sb.append(";");
      return sb.toString();
   }

   public void decode(String str) {
      String[] array = str.split(";");
      if (array.length >= 4) {
         if (!array[0].isEmpty()) {
            String[] array_sub = array[0].split(",");

            for(String s : array_sub) {
               this.assistantList.add(Integer.parseInt(s));
            }
         }

         if (!array[1].isEmpty()) {
            String[] array_sub = array[1].split(",");

            for(String s : array_sub) {
               this.assistantSkillList.add(Integer.parseInt(s));
            }
         }

         if (!array[2].isEmpty()) {
            String[] array_sub = array[2].split(",");

            for(String s : array_sub) {
               this.beautyList.add(Integer.parseInt(s));
            }
         }

         if (!array[3].isEmpty()) {
            String[] array_sub = array[3].split(",");

            for(String s : array_sub) {
               this.beautySkillList.add(Integer.parseInt(s));
            }
         }

      }
   }
}
