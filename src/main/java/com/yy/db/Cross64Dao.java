package com.yy.db;

import db.DBTableAnno;

@DBTableAnno(
   name = "tb_cross_64",
   dbType = 2,
   resultType = 5,
   selectKey = {"group"}
)
public class Cross64Dao extends CrossZoneDao {
}
