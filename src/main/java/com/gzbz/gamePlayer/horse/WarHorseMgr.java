package com.gzbz.gamePlayer.horse;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.db.WarHorseRecordDao;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.WarHorseMsg;
import com.gzbz.worldMgr.OnLineMgr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import misc.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class WarHorseMgr extends GameMgr {
   @Autowired
   OnLineMgr onLineMgr;
   private final Map<Integer, Set<Integer>> playerRecords = new ConcurrentHashMap();

   protected void init() throws Exception {
      Map<Integer, WarHorseRecordDao> recordMap = this.getWarHorseRecordMap();

      for(Map.Entry<Integer, WarHorseRecordDao> entry : recordMap.entrySet()) {
         if (this.playerRecords.containsKey(((WarHorseRecordDao)entry.getValue()).playerId)) {
            ((Set)this.playerRecords.get(((WarHorseRecordDao)entry.getValue()).playerId)).add(((WarHorseRecordDao)entry.getValue()).id);
         } else {
            Set<Integer> set = new TreeSet();
            set.add(((WarHorseRecordDao)entry.getValue()).id);
            this.playerRecords.put(((WarHorseRecordDao)entry.getValue()).playerId, set);
         }
      }

   }

   public void resetDaily() {
      this.scheduleEx((long)RandomUtil.randInt(1200000, 1800000), "resetRecord", new Object[0]);
   }

   @TaskMethod
   public void resetRecord() {
      this.gameCachePool.dropAndCreate("tb_war_horse_record");
      this.playerRecords.clear();
   }

   public Map<Integer, WarHorseRecordDao> getWarHorseRecordMap() {
      return this.gameCachePool.getAllTableByMap("tb_war_horse_record");
   }

   private void addSacrificeRecord(int playerId, String playerName, ResourceModel resourceModel, List<WarHorseMsg.SacrificeRecordData> recordListMsg) {
      WarHorseRecordDao warHorseRecordDao = new WarHorseRecordDao();
      warHorseRecordDao.playerId = playerId;
      warHorseRecordDao.playerName = playerName;
      warHorseRecordDao.resourceId = resourceModel.getId();
      warHorseRecordDao.resourceType = resourceModel.getType();
      warHorseRecordDao.resourceNum = resourceModel.getValue();
      this.gameCachePool.insertDao(warHorseRecordDao, true);
      if (this.playerRecords.containsKey(playerId)) {
         ((Set)this.playerRecords.get(playerId)).add(warHorseRecordDao.id);
      } else {
         Set<Integer> set = new TreeSet();
         set.add(warHorseRecordDao.id);
         this.playerRecords.put(playerId, set);
      }

      recordListMsg.add(this.buildWarHorseRecordDataMsg(warHorseRecordDao));
   }

   @TaskMethod
   public void addSacrificeRecords(List<ResourceModel> sacrificeLogResources, int playerId, String playerName) {
      WarHorseMsg.S2C_SacrificeRecord_13850.Builder msg = WarHorseMsg.S2C_SacrificeRecord_13850.newBuilder();
      List<WarHorseMsg.SacrificeRecordData> recordListMsg = new ArrayList();

      for(ResourceModel resourceModel : sacrificeLogResources) {
         this.addSacrificeRecord(playerId, playerName, resourceModel, recordListMsg);
      }

      msg.addAllRecordList(recordListMsg);
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg.build()});
   }

   public WarHorseMsg.S2C_SacrificeRecordList_13848 buildSacrificeRecordListMsg(int type, int playerId) {
      WarHorseMsg.S2C_SacrificeRecordList_13848.Builder msg = WarHorseMsg.S2C_SacrificeRecordList_13848.newBuilder();
      msg.setType(type);
      Map<Integer, WarHorseRecordDao> warHorseRecordMap = this.getWarHorseRecordMap();
      int count = 0;
      if (type == 1) {
         for(Integer id : (Set)this.playerRecords.getOrDefault(playerId, new TreeSet())) {
            WarHorseRecordDao warHorseRecordDao = (WarHorseRecordDao)warHorseRecordMap.get(id);
            if (warHorseRecordDao != null) {
               ++count;
               msg.addRecordList(this.buildWarHorseRecordDataMsg(warHorseRecordDao));
               if (count >= 50) {
                  break;
               }
            }
         }
      } else {
         for(WarHorseRecordDao warHorseRecordDao : warHorseRecordMap.values()) {
            ++count;
            msg.addRecordList(this.buildWarHorseRecordDataMsg(warHorseRecordDao));
            if (count >= 50) {
               break;
            }
         }
      }

      return msg.build();
   }

   private WarHorseMsg.SacrificeRecordData buildWarHorseRecordDataMsg(WarHorseRecordDao warHorseRecordDao) {
      WarHorseMsg.SacrificeRecordData.Builder msg = WarHorseMsg.SacrificeRecordData.newBuilder();
      msg.setPlayerId(warHorseRecordDao.playerId);
      msg.setPlayerName(warHorseRecordDao.playerName);
      msg.setResourceType(warHorseRecordDao.resourceType);
      msg.setResourceId(warHorseRecordDao.resourceId);
      msg.setResourceNum(warHorseRecordDao.resourceNum);
      return msg.build();
   }
}
