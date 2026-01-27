package com.gzbz.db;

import com.gzbz.model.fun.ResourceModel;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_mine_person",
   resultType = 0,
   selectKey = {"playerId"}
)
public class MinePersonDao extends DBDao {
   @DBColumnAnno(
      comment = "玩家id",
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "线路"
   )
   public int line;
   @DBColumnAnno(
      comment = "当前是否拥有矿洞"
   )
   public boolean having = false;
   @DBColumnAnno(
      comment = "矿山id"
   )
   public int hillId;
   @DBColumnAnno(
      comment = "矿洞id"
   )
   public int veinId;
   @DBColumnAnno(
      comment = "当天使用精力值次数"
   )
   public byte useEnergy;
   @DBColumnAnno(
      comment = "精力值恢复时间"
   )
   public int resumeTime;
   @DBColumnAnno(
      comment = "精力值购买次数"
   )
   public byte buyTime;
   @DBColumnAnno(
      comment = "当前选中的支援好友id"
   )
   public int friendCode;
   @DBColumnAnno(
      comment = "防守位置(雇佣的好友英雄)"
   )
   public int defPos = -1;
   @DBColumnAnno(
      comment = "复仇玩家id"
   )
   public int revengeId;
   @DBColumnAnno(
      comment = "被击败时间"
   )
   public int loseTime;
   @DBColumnAnno(
      comment = "占领时间"
   )
   public int startTime;
   @DBColumnAnno(
      comment = "开采持续时长(秒)"
   )
   public int durationTime;
   @DBColumnAnno(
      comment = "矿洞奖励",
      columnType = "TEXT",
      loadFun = "loadRewards",
      saveFun = "saveRewards"
   )
   public List<ResourceModel> rewards = new ArrayList();
   @DBColumnAnno(
      comment = "矿洞收益数"
   )
   public int fallNum;
   @DBColumnAnno(
      comment = "攻击位置(雇佣的好友英雄)"
   )
   public byte atkPos = -1;
   @DBColumnAnno(
      comment = "本轮雇佣次数"
   )
   public int employNum;

   public void loadRewards(String data) {
      this.rewards = JsonUtil.jsonToList(data, ResourceModel.class);
   }

   public String saveRewards() {
      return JsonUtil.listToJson(this.rewards);
   }
}
