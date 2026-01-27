package com.gzbz.test;

import allMgr.PartAnnotation;
import com.gzbz.db.AdventureDao;
import com.gzbz.db.bean.AdventureData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.ChapterAdventureConfigModel;
import com.gzbz.model.ChapterAdventureModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.task.AdventureTaskPart;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class AdventureTaskTestPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(AdventureTaskTestPart.class);
   @Autowired
   ConfigManager configManager;
   public StringBuffer sb = new StringBuffer();
   public int loop = 0;
   public int totalNum = 10000;

   public void test() {
      logger.info("开始刷新，总次数={}", this.totalNum);
      this.flushTask();
   }

   public void flushTask() {
      ++this.loop;
      logger.info("刷新次数={}", this.loop);
      AdventureTaskPart adventureTaskPart = (AdventureTaskPart)this.player.getMgrPart(AdventureTaskPart.class);
      ChapterAdventureConfigModel configModel = (ChapterAdventureConfigModel)this.player.getGameModelPool().getEntity("chapterAdventureConfig", adventureTaskPart.getPrivilegeLv());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int usedFreeNum = (Integer)playerResetCustomCache.getDailyNum(123, 0);
      boolean isFree = false;
      if (usedFreeNum < configModel.getFreeTimes()) {
         isFree = true;
      }

      AdventureDao dao = (AdventureDao)this.player.getData("tb_adventure", this.player.getPlayerId());
      Iterator<AdventureData> iterator = dao.jsonData.values().iterator();

      while(iterator.hasNext()) {
         if (((AdventureData)iterator.next()).state == CommonMsg.TaskState.STATE_WAIT_RECEIVE.getNumber()) {
            iterator.remove();
         }
      }

      int RedAdventurestask = this.configManager.getIntDefault("RedAdventurestask", 15);
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      boolean isOpenSixQuality = false;
      if (playerExtend.adventureFlushNum >= RedAdventurestask) {
         isOpenSixQuality = true;
      }

      ++playerExtend.adventureFlushNum;
      this.player.updatePlayerExtend(13);
      List<ChapterAdventureModel> newTaskList = adventureTaskPart.getNewTaskList(isOpenSixQuality, isFree, dao, false);
      TreeMap<Integer, Integer> starMap = new TreeMap();
      this.sb.append(String.format("%06d", this.loop)).append("\t");

      for(ChapterAdventureModel model : newTaskList) {
         this.sb.append(model.getId()).append("\t");
         int oldVal = (Integer)starMap.getOrDefault(model.getQuality(), 0);
         starMap.put(model.getQuality(), oldVal + 1);
      }

      for(int i = 1; i <= 6; ++i) {
         int num = 0;
         if (starMap.get(i) != null) {
            num = (Integer)starMap.get(i);
         }

         this.sb.append(num).append("\t");
      }

      this.sb.append("\n");
      if (isFree) {
         playerResetCustomCache.addDailyReset(123, 1);
      } else {
         playerResetCustomCache.addDailyReset(124, 1);
      }

      if (this.loop < this.totalNum) {
         this.player.schedule(2L, this::flushTask);
      } else {
         logger.info("打印数据");
         this.print(this.sb);
      }

   }

   public void print(StringBuffer stringBuffer) {
      try {
         File file = new File("test/adventureTask.txt");
         if (!file.exists()) {
            file.createNewFile();
         }

         FileWriter fileWriter = new FileWriter("test/adventureTask.txt", true);
         BufferedWriter bw = new BufferedWriter(fileWriter);
         bw.write(stringBuffer.toString());
         bw.close();
         fileWriter.close();
         StringBuffer var6 = null;
      } catch (Exception e) {
         e.printStackTrace();
      }

   }
}
