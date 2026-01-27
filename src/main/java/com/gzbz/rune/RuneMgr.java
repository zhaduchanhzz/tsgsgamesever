package com.gzbz.rune;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.db.RuneLotteryRecordDao;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.RuneMsg;
import com.gzbz.worldMgr.OnLineMgr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import misc.RandomUtil;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class RuneMgr extends GameMgr {
   private final OnLineMgr onLineMgr;
   private final Map<Integer, Set<Integer>> playerRecords = new ConcurrentHashMap();

   public RuneMgr(OnLineMgr onLineMgr) {
      this.onLineMgr = onLineMgr;
   }

   protected void init() throws Exception {
      Map<Integer, RuneLotteryRecordDao> recordMap = this.getRecordMap();
      recordMap.values().forEach((runeLotteryRecordDao) -> ((Set)this.playerRecords.computeIfAbsent(runeLotteryRecordDao.playerId, (v) -> new TreeSet())).add(runeLotteryRecordDao.id));
   }

   public Map<Integer, RuneLotteryRecordDao> getRecordMap() {
      return this.gameCachePool.getAllTableByMap("tb_rune_lottery_record");
   }

   public void resetDaily() {
      this.scheduleEx((long)RandomUtil.randInt(1800000, 2400000), "resetRecord", new Object[0]);
   }

   @TaskMethod
   public void resetRecord() {
      this.gameCachePool.dropAndCreate("tb_rune_lottery_record");
      this.playerRecords.clear();
   }

   private void addRuneLotteryRecord(int playerId, String playerName, ResourceModel resourceModel, List<RuneMsg.RuneLotteryRecordData> recordListMsg) {
      RuneLotteryRecordDao runeLotteryRecordDao = new RuneLotteryRecordDao();
      runeLotteryRecordDao.playerId = playerId;
      runeLotteryRecordDao.playerName = playerName;
      runeLotteryRecordDao.resourceId = resourceModel.getId();
      runeLotteryRecordDao.resourceType = resourceModel.getType();
      runeLotteryRecordDao.resourceNum = resourceModel.getValue();
      this.gameCachePool.insertDao(runeLotteryRecordDao, true);
      ((Set)this.playerRecords.computeIfAbsent(playerId, (v) -> new TreeSet())).add(runeLotteryRecordDao.id);
      recordListMsg.add(this.buildRuneLotteryRecordDataMsg(runeLotteryRecordDao));
   }

   public void addRuneLotteryRecordList(List<ResourceModel> resourceModelList, int playerId, String playerName) {
      RuneMsg.S2C_RuneLotteryRecord_20309.Builder msg = RuneMsg.S2C_RuneLotteryRecord_20309.newBuilder();
      List<RuneMsg.RuneLotteryRecordData> recordListMsg = new ArrayList();
      resourceModelList.forEach((resourceModel) -> this.addRuneLotteryRecord(playerId, playerName, resourceModel, recordListMsg));
      msg.addAllRecordList(recordListMsg);
      this.onLineMgr.pushTask(() -> this.onLineMgr.onlineBroadcast(msg.build()));
   }

   private RuneMsg.RuneLotteryRecordData buildRuneLotteryRecordDataMsg(RuneLotteryRecordDao runeLotteryRecordDao) {
      RuneMsg.RuneLotteryRecordData.Builder msg = RuneMsg.RuneLotteryRecordData.newBuilder();
      msg.setPlayerId(runeLotteryRecordDao.playerId);
      msg.setPlayerName(runeLotteryRecordDao.playerName);
      msg.setResourceType(runeLotteryRecordDao.resourceType);
      msg.setResourceId(runeLotteryRecordDao.resourceId);
      msg.setResourceNum(runeLotteryRecordDao.resourceNum);
      return msg.build();
   }

   public RuneMsg.S2C_RuneLotteryRecordList_20308 buildRuneLotteryRecordListMsg(int type, int playerId) {
      RuneMsg.S2C_RuneLotteryRecordList_20308.Builder msg = RuneMsg.S2C_RuneLotteryRecordList_20308.newBuilder();
      msg.setType(type);
      Map<Integer, RuneLotteryRecordDao> recordMap = this.getRecordMap();
      int count = 0;
      if (type == 1) {
         for(Integer id : (Set)this.playerRecords.getOrDefault(playerId, new TreeSet())) {
            RuneLotteryRecordDao runeLotteryRecordDao = (RuneLotteryRecordDao)recordMap.get(id);
            if (runeLotteryRecordDao != null) {
               ++count;
               msg.addRecordList(this.buildRuneLotteryRecordDataMsg(runeLotteryRecordDao));
               if (count >= 50) {
                  break;
               }
            }
         }
      } else {
         for(RuneLotteryRecordDao recordDao : recordMap.values()) {
            ++count;
            msg.addRecordList(this.buildRuneLotteryRecordDataMsg(recordDao));
            if (count >= 50) {
               break;
            }
         }
      }

      return msg.build();
   }
}
