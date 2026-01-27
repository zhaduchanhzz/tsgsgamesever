package com.yy.db;

import db.DBTableAnno;

@DBTableAnno(
   name = "tb_cross_8",
   dbType = 2,
   resultType = 5,
   selectKey = {"group"}
)
public class Cross8Dao extends CrossZoneDao {
}
