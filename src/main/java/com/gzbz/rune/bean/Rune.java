package com.gzbz.rune.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

public class Rune implements Serializable {
   public Map<Integer, RuneItem> runeMap = new HashMap();
   public Map<Integer, RuneRefineInheritItem> runeRefineMap = new HashMap();

   public void decode(String data) {
      String[] strs = data.split("\u0014");
      if (strs.length > 0 && StringUtils.isNotBlank(strs[0])) {
         String runeStr = strs[0];
         String[] runeStrSplit = runeStr.split("@");
         if (runeStrSplit.length > 0) {
            for(String seat_runeItemStr : runeStrSplit) {
               String[] seat_runeItemStrSplit = seat_runeItemStr.split(":");
               if (seat_runeItemStrSplit.length >= 2) {
                  RuneItem runeItem = new RuneItem();
                  runeItem.decode(seat_runeItemStrSplit[1]);
                  this.runeMap.put(Integer.parseInt(seat_runeItemStrSplit[0]), runeItem);
               }
            }
         }
      }

      if (strs.length > 1 && StringUtils.isNotBlank(strs[1])) {
         String refineStr = strs[1];
         String[] refineSplit = refineStr.split("@");
         if (refineSplit.length > 0) {
            for(String seat_refineStr : refineSplit) {
               String[] seat_refineStrSplit = seat_refineStr.split(":");
               if (seat_refineStrSplit.length >= 2) {
                  RuneRefineInheritItem runeRefineInheritItem = new RuneRefineInheritItem();
                  runeRefineInheritItem.decode(seat_refineStrSplit[1]);
                  this.runeRefineMap.put(Integer.parseInt(seat_refineStrSplit[0]), runeRefineInheritItem);
               }
            }
         }
      }

   }

   public String encode() {
      StringBuilder stringBuilder = new StringBuilder();
      if (!this.runeMap.isEmpty()) {
         for(Map.Entry<Integer, RuneItem> runeItemEntry : this.runeMap.entrySet()) {
            int seat = (Integer)runeItemEntry.getKey();
            RuneItem runeItem = (RuneItem)runeItemEntry.getValue();
            String runeItemEncode = runeItem.encode();
            stringBuilder.append(seat + ":" + runeItemEncode + "@");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      stringBuilder.append("\u0014");
      if (!this.runeRefineMap.isEmpty()) {
         for(Map.Entry<Integer, RuneRefineInheritItem> runeRefineInheritItemEntry : this.runeRefineMap.entrySet()) {
            int seat = (Integer)runeRefineInheritItemEntry.getKey();
            RuneRefineInheritItem runeRefineInheritItem = (RuneRefineInheritItem)runeRefineInheritItemEntry.getValue();
            String runeRefineInheritItemEncode = runeRefineInheritItem.encode();
            stringBuilder.append(seat + ":" + runeRefineInheritItemEncode + "@");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
