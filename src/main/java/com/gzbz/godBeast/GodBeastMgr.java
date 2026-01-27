package com.gzbz.godBeast;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.db.GodBeastRecordDao;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.godBeast.bean.GodBeastRecordData;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.GodBeastMsg;
import com.gzbz.worldMgr.OnLineMgr;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class GodBeastMgr extends GameMgr {
   @Autowired
   OnLineMgr onLineMgr;
   private final Deque<Integer> recordIdDeque = new LinkedList();

   protected void init() throws Exception {
      Map<Integer, GodBeastRecordDao> recordMap = this.getGodBeastRecordMap();
      List<Integer> tempRecordIdList = new ArrayList();

      for(Map.Entry<Integer, GodBeastRecordDao> entry : recordMap.entrySet()) {
         tempRecordIdList.add(((GodBeastRecordDao)entry.getValue()).id);
      }

      if (tempRecordIdList.size() > 0) {
         List<Integer> descIdList = (List)tempRecordIdList.stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
         int size = Math.min(descIdList.size(), 100);
         this.recordIdDeque.clear();
         this.recordIdDeque.addAll(descIdList.subList(0, size));
         if (descIdList.size() > this.recordIdDeque.size()) {
            descIdList.removeAll(this.recordIdDeque);

            for(Integer id : descIdList) {
               GodBeastRecordDao godBeastRecordDao = (GodBeastRecordDao)recordMap.get(id);
               if (null != godBeastRecordDao) {
                  this.gameCachePool.deleteDao(godBeastRecordDao, false);
               }
            }
         }
      }

   }

   public Map<Integer, GodBeastRecordDao> getGodBeastRecordMap() {
      return this.gameCachePool.getAllTableByMap("tb_god_beast_record");
   }

   private void addRecord(int playerId, String playerName, ResourceModel resourceModel, long recTime, int scoreId, List<GodBeastMsg.HatchRecordData> recordListMsg) {
      GodBeastRecordDao recordDao = new GodBeastRecordDao();
      recordDao.playerId = playerId;
      recordDao.playerName = playerName;
      recordDao.resourceId = resourceModel.getId();
      recordDao.resourceType = resourceModel.getType();
      recordDao.resourceNum = resourceModel.getValue();
      recordDao.recTime = recTime;
      recordDao.scoreId = scoreId;
      this.gameCachePool.insertDao(recordDao, true);
      this.recordIdDeque.push(recordDao.id);
      List<Integer> delIdList = new ArrayList();

      while(this.recordIdDeque.size() > 100) {
         delIdList.add(this.recordIdDeque.pollLast());
      }

      if (delIdList.size() > 0) {
         Map<Integer, GodBeastRecordDao> godBeastRecordMap = this.getGodBeastRecordMap();

         for(Integer id : delIdList) {
            GodBeastRecordDao godBeastRecordDao = (GodBeastRecordDao)godBeastRecordMap.get(id);
            if (null != godBeastRecordDao) {
               this.gameCachePool.deleteDao(godBeastRecordDao, false);
            }
         }
      }

      recordListMsg.add(this.buildRecordDataMsg(recordDao));
   }

   @TaskMethod
   public void addRecordAndSendMsg(int godBeastId, int scoreId, int playerId, String playerName, long recTime) {
      GodBeastMsg.S2C_HatchRecordList_21642.Builder msg = GodBeastMsg.S2C_HatchRecordList_21642.newBuilder();
      List<GodBeastMsg.HatchRecordData> recordListMsg = new ArrayList();
      ResourceModel resourceModel = new ResourceModel(2, godBeastId, 1);
      this.addRecord(playerId, playerName, resourceModel, recTime, scoreId, recordListMsg);
      msg.addAllRecordList(recordListMsg);
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg.build()});
   }

   @TaskMethod
   public void sendRecordListMsg(GamePlayer player, String playerName, Deque<GodBeastRecordData> playerRecordList) {
      int playerId = player.getPlayerId();
      GodBeastMsg.S2C_HatchRecordList_21641.Builder msg = GodBeastMsg.S2C_HatchRecordList_21641.newBuilder();
      Map<Integer, GodBeastRecordDao> godBeastRecordMap = this.getGodBeastRecordMap();
      if (playerRecordList != null && playerRecordList.size() > 0) {
         for(GodBeastRecordData recordData : playerRecordList) {
            GodBeastMsg.HatchRecordData.Builder recordInfoMsg = GodBeastMsg.HatchRecordData.newBuilder();
            recordInfoMsg.setPlayerId(playerId);
            recordInfoMsg.setPlayerName(playerName);
            recordInfoMsg.setResourceType(2);
            recordInfoMsg.setResourceId(recordData.godBeastId);
            recordInfoMsg.setResourceNum(1);
            recordInfoMsg.setRecTime(recordData.recTime);
            recordInfoMsg.setScoreId(recordData.scoreId);
            msg.addPlayerRecordList(recordInfoMsg);
         }
      }

      if (godBeastRecordMap != null && !godBeastRecordMap.isEmpty()) {
         for(Integer id : new LinkedList(this.recordIdDeque)) {
            GodBeastRecordDao godBeastRecordDao = (GodBeastRecordDao)godBeastRecordMap.get(id);
            if (null != godBeastRecordDao) {
               msg.addAllRecordList(this.buildRecordDataMsg(godBeastRecordDao));
            }
         }
      }

      player.pushTask(() -> player.sendMsg(msg.build()));
   }

   private GodBeastMsg.HatchRecordData buildRecordDataMsg(GodBeastRecordDao recordDao) {
      GodBeastMsg.HatchRecordData.Builder msg = GodBeastMsg.HatchRecordData.newBuilder();
      msg.setPlayerId(recordDao.playerId);
      msg.setPlayerName(recordDao.playerName);
      msg.setResourceType(recordDao.resourceType);
      msg.setResourceId(recordDao.resourceId);
      msg.setResourceNum(recordDao.resourceNum);
      msg.setRecTime(recordDao.recTime);
      msg.setScoreId(recordDao.scoreId);
      return msg.build();
   }
}
