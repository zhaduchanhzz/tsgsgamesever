package com.gzbz.runeStone;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.db.RuneStoneRecordDao;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.RuneStoneMsg;
import com.gzbz.worldMgr.OnLineMgr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import misc.DateUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class RuneStoneMgr extends GameMgr {
   static Logger logger = LoggerFactory.getLogger(RuneStoneMgr.class);
   private final OnLineMgr onLineMgr;
   private ConcurrentHashMap<Integer, ArrayList<RuneStoneRecordDao>> playerRecords = new ConcurrentHashMap();
   private ArrayList<RuneStoneRecordDao> allRecord = new ArrayList();

   public RuneStoneMgr(OnLineMgr onLineMgr) {
      this.onLineMgr = onLineMgr;
   }

   protected void init() throws Exception {
      Map<Integer, RuneStoneRecordDao> recordMap = this.getRecordList();

      for(RuneStoneRecordDao dao : recordMap.values()) {
         if (this.playerRecords.containsKey(dao.playerId)) {
            ((ArrayList)this.playerRecords.get(dao.playerId)).add(dao);
         } else {
            ArrayList<RuneStoneRecordDao> list = new ArrayList();
            list.add(dao);
            this.playerRecords.put(dao.playerId, list);
         }
      }

      List<RuneStoneRecordDao> allList = new ArrayList();

      for(RuneStoneRecordDao value : this.getRecordList().values()) {
         allList.add(value);
      }

      Collections.sort(allList, new RuneStoneRecordComparator());
      int flag = 0;

      for(int i = allList.size() - 1; i >= 0 && flag < 20; --i) {
         ++flag;
         this.allRecord.add(allList.get(i));
      }

   }

   public void resetDaily() {
      this.scheduleEx((long)RandomUtil.randInt(2400000, 3000000), "resetRecord", new Object[0]);
   }

   @TaskMethod
   public void resetRecord() {
      this.gameCachePool.dropAndCreate("tb_rune_stone_record");
      this.playerRecords.clear();
      this.allRecord.clear();
   }

   public Map<Integer, RuneStoneRecordDao> getRecordList() {
      return this.gameCachePool.getAllTableByMap("tb_rune_stone_record");
   }

   private void addRuneRecord(int playerId, String playerName, ResourceModel resourceModel, List<RuneStoneMsg.RuneRecordData> recordListMsg) {
      RuneStoneRecordDao recordDao = new RuneStoneRecordDao();
      recordDao.playerId = playerId;
      recordDao.playerName = playerName;
      recordDao.resourceId = resourceModel.getId();
      recordDao.resourceType = resourceModel.getType();
      recordDao.resourceNum = resourceModel.getValue();
      recordDao.time = DateUtil.getIntTime(System.currentTimeMillis());
      this.gameCachePool.insertDao(recordDao);
      recordListMsg.add(this.buildSacrificeRecordDataMsg(recordDao));
      if (this.allRecord.size() >= 20) {
         this.allRecord.remove(0);
         this.allRecord.add(recordDao);
      } else {
         this.allRecord.add(recordDao);
      }

      if (this.playerRecords.containsKey(playerId)) {
         if (((ArrayList)this.playerRecords.get(playerId)).size() >= 20) {
            RuneStoneRecordDao dao = (RuneStoneRecordDao)((ArrayList)this.playerRecords.get(playerId)).remove(0);
            this.gameCachePool.deleteDao(dao, false);
         }

         ((ArrayList)this.playerRecords.get(playerId)).add(recordDao);
      } else {
         ArrayList<RuneStoneRecordDao> list = new ArrayList();
         list.add(recordDao);
         this.playerRecords.put(playerId, list);
      }

   }

   @TaskMethod
   public void addRuneRecords(List<ResourceModel> addList, int playerId, String playerName) {
      List<RuneStoneMsg.RuneRecordData> recordListMsg = new ArrayList();

      for(ResourceModel resourceModel : addList) {
         this.addRuneRecord(playerId, playerName, resourceModel, recordListMsg);
      }

   }

   public RuneStoneMsg.S2C_RuneRecordList_5416 buildRuneStoneInfo(boolean isFree, int playerId, int num) {
      RuneStoneMsg.S2C_RuneRecordList_5416.Builder msg = RuneStoneMsg.S2C_RuneRecordList_5416.newBuilder();
      msg.setRecruitNum(num);
      msg.setIsFree(isFree);

      for(int i = 0; i < this.allRecord.size(); ++i) {
         msg.addAllRecord(this.buildSacrificeRecordDataMsg((RuneStoneRecordDao)this.allRecord.get(i)));
      }

      if (this.playerRecords.containsKey(playerId)) {
         ArrayList<RuneStoneRecordDao> myList = (ArrayList)this.playerRecords.get(playerId);

         for(int i = 0; i < myList.size(); ++i) {
            msg.addMyRecord(this.buildSacrificeRecordDataMsg((RuneStoneRecordDao)myList.get(i)));
         }
      }

      return msg.build();
   }

   private RuneStoneMsg.RuneRecordData buildSacrificeRecordDataMsg(RuneStoneRecordDao recordDao) {
      RuneStoneMsg.RuneRecordData.Builder msg = RuneStoneMsg.RuneRecordData.newBuilder();
      msg.setPlayerId(recordDao.playerId);
      msg.setPlayerName(recordDao.playerName);
      msg.setResourceType(recordDao.resourceType);
      msg.setResourceId(recordDao.resourceId);
      msg.setResourceNum(recordDao.resourceNum);
      return msg.build();
   }
}
