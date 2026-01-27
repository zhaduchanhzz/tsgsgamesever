package com.gzbz.gamePlayer.expedition;

import com.gzbz.model.ExpeditionMapiconModel;
import com.gzbz.model.fun.ExpeditionEventFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import org.springframework.util.StringUtils;

public class ExpeditionGridInfo {
   public int gridId;
   public int state;
   public int gridType;
   public int gridIcon;
   private int eventIdx;
   private List<ExpeditionEventFun> eventFunList = new ArrayList();
   public boolean bOnce;

   public void changeGrid(int gridType, int gridIcon, List<ExpeditionEventFun> eventFunList) {
      this.gridType = gridType;
      this.gridIcon = gridIcon;
      this.eventFunList = eventFunList;
      this.eventIdx = eventFunList.size() > 0 ? 1 : 0;
   }

   public ExpeditionEventFun curEventFunc() {
      return this.eventFunList.size() > 0 && this.eventFunList.size() >= this.eventIdx && this.eventIdx > 0 ? (ExpeditionEventFun)this.eventFunList.get(this.eventIdx - 1) : null;
   }

   public List<ExpeditionEventFun> getEventFunList() {
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
         this.gridIcon = Integer.parseInt(baseStrs[2]);
         this.eventIdx = Integer.parseInt(baseStrs[3]);
         this.bOnce = Integer.parseInt(baseStrs[4]) == 1;
         if (baseStrs.length == 6) {
            this.gridType = Integer.parseInt(baseStrs[5]);
         } else if (this.gridIcon > 0) {
            ExpeditionMapiconModel model = (ExpeditionMapiconModel)ApplicationContextProvider.getModelPoolEntity("customExpeditionMapicon", this.gridIcon);
            if (model != null) {
               this.gridType = model.getId();
            }
         }

         this.eventFunList.clear();
         if (!StringUtils.isEmpty(arrs[1])) {
            String[] eventStrs = arrs[1].split(",");

            for(String eventStr : eventStrs) {
               String[] cell = eventStr.split("_");
               ExpeditionEventFun eventFun = new ExpeditionEventFun(Integer.parseInt(cell[0]), Integer.parseInt(cell[1]));
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
      stringBuilder.append(this.gridIcon);
      stringBuilder.append(",");
      stringBuilder.append(this.eventIdx);
      stringBuilder.append(",");
      stringBuilder.append(this.bOnce ? 1 : 0);
      stringBuilder.append(",");
      stringBuilder.append(this.gridType);
      stringBuilder.append(";");
      if (this.eventFunList.size() > 0) {
         for(ExpeditionEventFun eventFun : this.eventFunList) {
            stringBuilder.append(eventFun.getType() + "_" + eventFun.getId());
            stringBuilder.append(",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
