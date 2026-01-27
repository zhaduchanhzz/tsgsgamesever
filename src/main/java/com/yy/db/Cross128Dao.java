package com.yy.db;

import db.DBTableAnno;

@DBTableAnno(
   name = "tb_cross_128",
   dbType = 2,
   resultType = 5,
   selectKey = {"group"}
)
public class Cross128Dao extends CrossZoneDao {
}
