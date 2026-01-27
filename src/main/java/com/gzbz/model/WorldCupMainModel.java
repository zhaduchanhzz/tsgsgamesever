package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "WorldCupMain"
)
public class WorldCupMainModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "场次id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "可投注日期"
   )
   private String betTime;
   @ModelColumnAnno(
      comment = "比赛时间"
   )
   private String raceTime;
   @ModelColumnAnno(
      comment = "主队"
   )
   private int homeTeam;
   @ModelColumnAnno(
      comment = "客队"
   )
   private int guestTeam;
   @ModelColumnAnno(
      comment = "赔率(主客平)",
      columnConvertType = 4,
      subCls = Integer.class,
      count = 3
   )
   private List<Integer> odds = new ArrayList();

   public int getId() {
      return this.id;
   }

   public String getBetTime() {
      return this.betTime;
   }

   public String getRaceTime() {
      return this.raceTime;
   }

   public int getHomeTeam() {
      return this.homeTeam;
   }

   public int getGuestTeam() {
      return this.guestTeam;
   }

   public List<Integer> getOdds() {
      return this.odds;
   }
}
