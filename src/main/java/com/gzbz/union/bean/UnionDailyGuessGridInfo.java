package com.gzbz.union.bean;

import com.gzbz.model.fun.UnionDailyGuessEventFun;
import java.util.ArrayList;
import java.util.List;
import org.springframework.util.StringUtils;

public class UnionDailyGuessGridInfo {
   public int gridId;
   public int state;
   private int eventIdx;
   private List<UnionDailyGuessEventFun> eventFunList = new ArrayList();

   public void changeGrid(List<UnionDailyGuessEventFun> eventFunList) {
      this.eventFunList = eventFunList;
      this.eventIdx = eventFunList.size() > 0 ? 1 : 0;
   }

   public UnionDailyGuessEventFun curEventFunc() {
      return this.eventFunList.size() > 0 && this.eventFunList.size() >= this.eventIdx && this.eventIdx > 0 ? (UnionDailyGuessEventFun)this.eventFunList.get(this.eventIdx - 1) : null;
   }

   public List<UnionDailyGuessEventFun> getEventFunList() {
      return this.eventFunList;
   }

   public int getEventIdx() {
      return this.eventIdx;
   }

   public void setEventIdx(int eventIdx) {
      this.eventIdx = eventIdx;
   }

   public void decode(String string) {
      if (!StringUtils.isEmpty(string)) {
         String[] arrs = string.split(";", -1);
         String[] baseStrs = arrs[0].split(",");
         this.gridId = Integer.parseInt(baseStrs[0]);
         this.state = Integer.parseInt(baseStrs[1]);
         this.eventIdx = Integer.parseInt(baseStrs[2]);
         this.eventFunList.clear();
         if (!StringUtils.isEmpty(arrs[1])) {
            String[] eventStrs = arrs[1].split(",");

            for(String eventStr : eventStrs) {
               String[] cell = eventStr.split("_");
               UnionDailyGuessEventFun eventFun = new UnionDailyGuessEventFun(Integer.parseInt(cell[0]), Integer.parseInt(cell[1]));
               this.eventFunList.add(eventFun);
            }
         }

      }
   }

   public String encode() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.gridId);
      stringBuilder.append(",");
      stringBuilder.append(this.state);
      stringBuilder.append(",");
      stringBuilder.append(this.eventIdx);
      stringBuilder.append(";");
      if (this.eventFunList.size() > 0) {
         for(UnionDailyGuessEventFun eventFun : this.eventFunList) {
            stringBuilder.append(eventFun.getType() + "_" + eventFun.getId());
            stringBuilder.append(",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
