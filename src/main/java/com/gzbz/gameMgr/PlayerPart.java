package com.gzbz.gameMgr;

import allMgr.MgrParent;
import allMgr.PartParent;
import com.gzbz.gamePlayer.GamePlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlayerPart extends PartParent {
   protected Logger logger = LoggerFactory.getLogger(this.getClass());
   protected GamePlayer player;

   public void init(MgrParent mgr) {
      this.player = (GamePlayer)mgr;
      this._mgr = mgr;
   }

   public void resetHour() {
   }

   public void resetDaily() {
   }

   public void resetWeek() {
   }

   public void resetMonth() {
   }

   public void loginHandle() {
   }

   public boolean loginHandleAsync() {
      return false;
   }

   public void logoutHandle() {
   }

   public void levelUp(int preLv, int newLv) {
   }

   public int getLoginPriority() {
      return 0;
   }

   public GamePlayer getPlayer() {
      return this.player;
   }
}
