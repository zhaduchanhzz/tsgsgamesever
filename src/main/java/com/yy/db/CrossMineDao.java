package com.yy.db;

import com.gzbz.db.bean.HeroMirror;
import com.gzbz.model.fun.ResourceModel;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_mine_cell",
   dbType = 2,
   resultType = 3,
   selectKey = {"group"}
)
public class CrossMineDao extends DBDao {
   @DBColumnAnno(
      comment = "所属分区",
      isPrimary = true
   )
   public int group;
   @DBColumnAnno(
      comment = "唯一标识",
      isPrimary = true
   )
   public String uid = "";
   @DBColumnAnno(
      comment = "线路"
   )
   public int line;
   @DBColumnAnno(
      comment = "矿山id"
   )
   public int hillId;
   @DBColumnAnno(
      comment = "矿洞id"
   )
   public int veinId;
   @DBColumnAnno(
      comment = "占领者"
   )
   public int ownerId;
   @DBColumnAnno(
      comment = "破防值"
   )
   public byte defNum;
   @DBColumnAnno(
      comment = "占领时间"
   )
   public int startTime;
   @DBColumnAnno(
      comment = "奖励记录时间"
   )
   public int rewardTime;
   @DBColumnAnno(
      comment = "开采持续时长(秒)"
   )
   public int durationTime;
   @DBColumnAnno(
      comment = "矿场事件随机掉落时间"
   )
   public int dropOutTime;
   @DBColumnAnno(
      comment = "所属服务器id"
   )
   public int serverId;
   @DBColumnAnno(
      columnType = "BLOB",
      comment = "防守阵型"
   )
   public byte[] arraying;
   @DBColumnAnno(
      comment = "雇佣的好友英雄",
      columnType = "TEXT",
      loadFun = "loadFriendSupport",
      saveFun = "saveFriendSupport"
   )
   public HeroMirror friendHeroMirror;
   @DBColumnAnno(
      comment = "防守位置(雇佣的好友英雄)"
   )
   public byte defPos = -1;
   @DBColumnAnno(
      comment = "矿洞收益数"
   )
   public int fallNum;
   @DBColumnAnno(
      comment = "矿洞结算奖励",
      columnType = "TEXT",
      loadFun = "loadRewards",
      saveFun = "saveRewards"
   )
   public List<ResourceModel> rewards = new ArrayList();

   public void loadFriendSupport(String data) {
      this.friendHeroMirror = (HeroMirror)JsonUtil.jsonToBean(data, HeroMirror.class);
   }

   public String saveFriendSupport() {
      return JsonUtil.object2String(this.friendHeroMirror);
   }

   public void loadRewards(String data) {
      this.rewards = JsonUtil.jsonToList(data, ResourceModel.class);
   }

   public String saveRewards() {
      return JsonUtil.listToJson(this.rewards);
   }

   public void initInfo(int group, int line, int hillId, int veinId) {
      this.group = group;
      this.line = line;
      this.hillId = hillId;
      this.veinId = veinId;
   }

   public void reset() {
      this.ownerId = 0;
      this.defNum = 0;
      this.startTime = 0;
      this.rewardTime = 0;
      this.durationTime = 0;
      this.serverId = 0;
      this.arraying = null;
      this.friendHeroMirror = null;
      this.defPos = -1;
      this.fallNum = 0;
      this.rewards.clear();
      this.dropOutTime = 0;
      this.updateOp();
   }
}
