package com.gzbz.db;

import db.DBTableAnno;

@DBTableAnno(
   name = "tb_activity_kr_event_hero",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ActivityKrEventHeroDao extends ActivityEventHeroDao {
}
