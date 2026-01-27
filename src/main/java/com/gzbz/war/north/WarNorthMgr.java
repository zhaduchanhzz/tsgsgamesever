package com.gzbz.war.north;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.db.SacrificeRecordDao;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.WarNorthMsg;
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
public class WarNorthMgr extends GameMgr {
   private final OnLineMgr onLineMgr;
   private final Map<Integer, Set<Integer>> playerRecords = new ConcurrentHashMap();

   public WarNorthMgr(OnLineMgr onLineMgr) {
      this.onLineMgr = onLineMgr;
   }

   protected void init() throws Exception {
      Map<Integer, SacrificeRecordDao> recordMap = this.getRecordMap();
      recordMap.values().forEach((sacrificeRecordDao) -> ((Set)this.playerRecords.computeIfAbsent(sacrificeRecordDao.playerId, (v) -> new TreeSet())).add(sacrificeRecordDao.id));
   }

   public void resetDaily() {
      this.scheduleEx((long)RandomUtil.randInt(1800000, 2400000), "resetRecord", new Object[0]);
   }

   @TaskMethod
   public void resetRecord() {
      this.gameCachePool.dropAndCreate("tb_sacrifice_record");
      this.playerRecords.clear();
   }

   public Map<Integer, SacrificeRecordDao> getRecordMap() {
      return this.gameCachePool.getAllTableByMap("tb_sacrifice_record");
   }

   private void addSacrificeRecord(int playerId, String playerName, ResourceModel resourceModel, List<WarNorthMsg.SacrificeRecordData> recordListMsg) {
      SacrificeRecordDao sacrificeRecordDao = new SacrificeRecordDao();
      sacrificeRecordDao.playerId = playerId;
      sacrificeRecordDao.playerName = playerName;
      sacrificeRecordDao.resourceId = resourceModel.getId();
      sacrificeRecordDao.resourceType = resourceModel.getType();
      sacrificeRecordDao.resourceNum = resourceModel.getValue();
      this.gameCachePool.insertDao(sacrificeRecordDao, true);
      ((Set)this.playerRecords.computeIfAbsent(playerId, (v) -> new TreeSet())).add(sacrificeRecordDao.id);
      recordListMsg.add(this.buildSacrificeRecordDataMsg(sacrificeRecordDao));
   }

   public void addSacrificeRecords(List<ResourceModel> sacrificeLogResources, int playerId, String playerName) {
      WarNorthMsg.S2C_WarNorthSacrificeRecord_11020.Builder msg = WarNorthMsg.S2C_WarNorthSacrificeRecord_11020.newBuilder();
      List<WarNorthMsg.SacrificeRecordData> recordListMsg = new ArrayList();
      sacrificeLogResources.forEach((resourceModel) -> this.addSacrificeRecord(playerId, playerName, resourceModel, recordListMsg));
      msg.addAllRecordList(recordListMsg);
      this.onLineMgr.pushTask(() -> this.onLineMgr.onlineBroadcast(msg.build()));
   }

   public WarNorthMsg.S2C_WarNorthSacrificeRecordList_11018 buildSacrificeRecordListMsg(int type, int playerId) {
      WarNorthMsg.S2C_WarNorthSacrificeRecordList_11018.Builder msg = WarNorthMsg.S2C_WarNorthSacrificeRecordList_11018.newBuilder();
      msg.setType(type);
      Map<Integer, SacrificeRecordDao> sacrificeRecordDaoMap = this.getRecordMap();
      int count = 0;
      if (type == 1) {
         for(Integer id : (Set)this.playerRecords.getOrDefault(playerId, new TreeSet())) {
            SacrificeRecordDao sacrificeRecordDao = (SacrificeRecordDao)sacrificeRecordDaoMap.get(id);
            if (sacrificeRecordDao != null) {
               ++count;
               msg.addRecordList(this.buildSacrificeRecordDataMsg(sacrificeRecordDao));
               if (count >= 50) {
                  break;
               }
            }
         }
      } else {
         for(SacrificeRecordDao sacrificeRecordDao : sacrificeRecordDaoMap.values()) {
            ++count;
            msg.addRecordList(this.buildSacrificeRecordDataMsg(sacrificeRecordDao));
            if (count >= 50) {
               break;
            }
         }
      }

      return msg.build();
   }

   private WarNorthMsg.SacrificeRecordData buildSacrificeRecordDataMsg(SacrificeRecordDao sacrificeRecordDao) {
      WarNorthMsg.SacrificeRecordData.Builder msg = WarNorthMsg.SacrificeRecordData.newBuilder();
      msg.setPlayerId(sacrificeRecordDao.playerId);
      msg.setPlayerName(sacrificeRecordDao.playerName);
      msg.setResourceType(sacrificeRecordDao.resourceType);
      msg.setResourceId(sacrificeRecordDao.resourceId);
      msg.setResourceNum(sacrificeRecordDao.resourceNum);
      return msg.build();
   }
}
