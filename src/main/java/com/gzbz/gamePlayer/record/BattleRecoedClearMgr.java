package com.gzbz.gamePlayer.record;

import allMgr.MgrAnno;
import com.gzbz.gameMgr.GameMgr;
import misc.DateUtil;
import org.springframework.stereotype.Component;

@Component
@MgrAnno
public class BattleRecoedClearMgr extends GameMgr {
   protected void init() throws Exception {
   }

   public void clearPlayerBattleRecord() {
      int currentHour = DateUtil.cHour();
      if (currentHour == 4) {
      }

   }
}
