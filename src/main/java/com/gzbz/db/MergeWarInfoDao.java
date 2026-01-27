package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_merge_war_info",
   resultType = 0,
   selectKey = {"systemId"}
)
public class MergeWarInfoDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "系统id"
   )
   public int systemId;
   @DBColumnAnno(
      comment = "开启类型"
   )
   public int type;
   @DBColumnAnno(
      comment = "活动阶段"
   )
   public int stage;
   @DBColumnAnno(
      comment = "阶段内小状态"
   )
   public int subState;
   @DBColumnAnno(
      comment = "第一阶段开启时间"
   )
   public int firstOpenTime;
   @DBColumnAnno(
      comment = "第二阶段开启时间"
   )
   public int secondOpenTime;
   @DBColumnAnno(
      comment = "结束时间"
   )
   public int endTime;
   @DBColumnAnno(
      comment = "第一阶段奖励发送情况"
   )
   public boolean hadFirstReward;
   @DBColumnAnno(
      comment = "是否开启中"
   )
   public boolean isOpening;
   @DBColumnAnno(
      comment = "开启次数"
   )
   public int count;
   @DBColumnAnno(
      comment = "晋级军团"
   )
   public int promoteUnion;
   @DBColumnAnno(
      comment = "配置组"
   )
   public int modelGroup;
   @DBColumnAnno(
      comment = "开放入口"
   )
   public boolean openEntrance;
}
