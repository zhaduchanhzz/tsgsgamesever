package com.yy.db;

import db.DBTableAnno;

@DBTableAnno(
   name = "tb_cross_record_catch_deer",
   dbType = 2,
   resultType = 0,
   selectKey = {"id"}
)
public class CrossRecordCatchDeerDao extends CrossRecordDao {
}
