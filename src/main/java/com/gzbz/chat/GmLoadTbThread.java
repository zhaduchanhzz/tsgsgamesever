package com.gzbz.chat;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.GameModelPool;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;

public class GmLoadTbThread extends Thread {
   private GamePlayer player;
   private WorldMgr worldMgr;

   public GmLoadTbThread(WorldMgr worldMgr, GamePlayer player) {
      this.worldMgr = worldMgr;
      this.player = player;
   }

   public void run() {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      gameModelPool.loadPool();
      this.player.failure(1);

      try {
         this.worldMgr.initExeclModel();
      } catch (Exception e) {
         e.printStackTrace();
      }

   }
}
