package com.gzbz.union.part;

import com.gzbz.db.PlayerDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import org.springframework.beans.factory.annotation.Autowired;

public class UnionPart extends PlayerPart {
   @Autowired
   protected UnionMgrParent unionMgrParent;

   protected boolean checkJoin() {
      return this.getUnionMgr() != null && this.getUnionMember() != null;
   }

   protected UnionMgr getUnionMgr() {
      PlayerDao playerDao = super.player.getPlayerDao();
      return this.unionMgrParent.getUnionMgr(playerDao.unionId);
   }

   protected UnionDao getUnion() {
      UnionMgr unionMgr = this.getUnionMgr();
      return unionMgr != null ? unionMgr.getUnion() : null;
   }

   protected UnionMemberDao getUnionMember() {
      UnionMgr unionMgr = this.getUnionMgr();
      return unionMgr != null ? unionMgr.getUnionMember(super.player.getPlayerId()) : null;
   }
}
