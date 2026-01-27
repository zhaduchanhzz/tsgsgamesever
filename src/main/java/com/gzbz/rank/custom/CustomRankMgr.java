package com.gzbz.rank.custom;

import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class CustomRankMgr extends GameMgr {
   @Autowired
   private RankMgr rankMgr;

   protected void init() {
      this.rankMgr.customRankMgrMap.put(this.module().name(), this);
   }

   public abstract RankDefine.RankModule module();

   public abstract List<RankData> getRanks(int limitCount, String... keyAppends);

   public abstract double getScore(int playerId, String... keyAppends);

   public abstract int getRank(int playerId, String... keyAppends);
}
