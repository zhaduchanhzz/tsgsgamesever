package com.gzbz.gamePlayer.record;

import allMgr.MgrAnno;
import cn.hutool.core.util.NumberUtil;
import com.github.luben.zstd.Zstd;
import com.gzbz.battle.BattleMisc;
import com.gzbz.db.GameDBPool;
import com.gzbz.db.parseResult.IntQueryResult;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.record.bean.SpecialRecordData;
import com.gzbz.model.HeroModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.BattleRecordMsg;
import com.gzbz.spring.ApplicationContextProvider;
import debug.Debug;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import misc.Pagination;
import org.springframework.stereotype.Component;
import thread.ThreadFactroyUtil;

@Component
@MgrAnno
public class SpecialRecordMgr extends GameMgr {
   private final GameDBPool dbPool;
   private ExecutorService executorService;
   private final Map<Integer, LinkedHashSet<Long>> specialRecordGroupMap = new ConcurrentHashMap();
   private final Map<String, List<SpecialRecordData>> allRecordDataMap = new HashMap();
   private static final int EVERY_THREAD_COLLECT_NUM = 1000;
   private static final int MAX_COLLECT_THREAD_NUM = 8;
   private static final int KEEP_SAME_NUM = 2;

   public SpecialRecordMgr(GameDBPool dbPool) {
      this.dbPool = dbPool;
   }

   protected void init() throws Exception {
   }

   public String collectSpecialRecord() {
      if (!Debug.isDebug) {
         return "非法请求";
      } else if (this.executorService != null) {
         return "正在收集中,请稍等...";
      } else {
         logger.info("开始收集录像,请稍等...");
         this.specialRecordGroupMap.clear();
         this.allRecordDataMap.clear();
         String tbName = String.format("%s_%d_%d.%s", "special", 0, 0, "special_record");
         IntQueryResult intQueryResult = new IntQueryResult("TOTAL");

         try {
            this.dbPool.query(String.format("SELECT COUNT(1) AS TOTAL FROM %s", tbName), intQueryResult, new Object[0]);
         } catch (Throwable throwable) {
            throwable.printStackTrace();
         }

         logger.info("查询录像完成,开始进行录像分组,总共需要处理{}条录像", intQueryResult.getValue());
         if (intQueryResult.getValue() == 0) {
            return "收集录像完成...";
         } else {
            int nThread = (intQueryResult.getValue() + 1000) / 1000;
            if (nThread > 8) {
               nThread = 8;
            }

            int everyThreadCollectNum = (intQueryResult.getValue() + nThread) / nThread;
            logger.info("进行录像分组,开启{}条线程,每条线程处理{}条录像", nThread, everyThreadCollectNum);
            this.executorService = Executors.newFixedThreadPool(nThread, new ThreadFactroyUtil("collect"));
            CountDownLatch countDownLatch = new CountDownLatch(nThread);

            for(int threadIndex = 0; threadIndex < nThread; ++threadIndex) {
               Pagination pagination = new Pagination(threadIndex + 1, everyThreadCollectNum, intQueryResult.getValue());
               List<SpecialRecordData> specialRecordDataList = this.collectSpecialRecord(tbName, pagination);
               this.executorService.submit(() -> {
                  this.collectSpecialRecord(specialRecordDataList);
                  countDownLatch.countDown();
               });
            }

            try {
               countDownLatch.await();
               this.executorService.shutdown();
               this.executorService = null;
               List<SpecialRecordData> finalList = new ArrayList();

               for(Map.Entry<String, List<SpecialRecordData>> next : this.allRecordDataMap.entrySet()) {
                  ((List<SpecialRecordData>)next.getValue()).sort((o1, o2) -> NumberUtil.compare(o2.powerDif, o1.powerDif));
                  int size = ((List<SpecialRecordData>)next.getValue()).size();
                  if (size > 2) {
                     ((List<SpecialRecordData>)next.getValue()).removeAll(((List)next.getValue()).subList(2, size));
                  }

                  finalList.addAll((Collection<SpecialRecordData>)next.getValue());
               }

               this.allRecordDataMap.clear();
               finalList.sort((o1, o2) -> NumberUtil.compare(o2.powerDif, o1.powerDif));

               for(SpecialRecordData specialRecordData : finalList) {
                  Iterator<Map.Entry<Integer, Integer>> subIterator = specialRecordData.nationCountMap.entrySet().iterator();

                  Map.Entry<Integer, Integer> cur;
                  for(Map.Entry<Integer, Integer> pre = null; subIterator.hasNext(); pre = cur) {
                     cur = (Map.Entry)subIterator.next();
                     if (pre != null && !((Integer)cur.getValue()).equals(pre.getValue())) {
                        break;
                     }

                     ((LinkedHashSet)this.specialRecordGroupMap.computeIfAbsent(cur.getKey(), (v) -> new LinkedHashSet())).add(specialRecordData.recordId);
                     ((LinkedHashSet)this.specialRecordGroupMap.computeIfAbsent(0, (v) -> new LinkedHashSet())).add(specialRecordData.recordId);
                  }
               }

               logger.info("收集录像完成...");
            } catch (InterruptedException e) {
               e.printStackTrace();
            }

            return "收集录像完成...";
         }
      }
   }

   private List<SpecialRecordData> collectSpecialRecord(String tbName, Pagination pagination) {
      List<SpecialRecordData> specialRecordDataList = new ArrayList();

      try {
         this.dbPool.query(String.format("SELECT id,stream FROM %s LIMIT %d,%d", tbName, pagination.getStartIndex(), pagination.getPageSize()), (resultSet) -> {
            while(true) {
               try {
                  if (!resultSet.next()) {
                     return;
                  }

                  long recordId = resultSet.getLong("id");
                  byte[] stream = resultSet.getBytes("stream");
                  specialRecordDataList.add(new SpecialRecordData(recordId, stream));
               } catch (Exception var5) {
               }
            }
         }, new Object[0]);
      } catch (Throwable throwable) {
         throwable.printStackTrace();
      }

      return specialRecordDataList;
   }

   private void collectSpecialRecord(List<SpecialRecordData> specialRecordDataList) {
      Iterator<SpecialRecordData> iterator = specialRecordDataList.iterator();

      while(iterator.hasNext()) {
         SpecialRecordData specialRecordData = (SpecialRecordData)iterator.next();

         try {
            specialRecordData.stream = this.decompress(specialRecordData.stream);
            BattleMsg.S2C_BattleResult_6102 battleMsgBuild = BattleMsg.S2C_BattleResult_6102.parseFrom(specialRecordData.stream);
            specialRecordData.nationCountMap = new LinkedHashMap();
            StringBuilder[] playerAndArrayKey = new StringBuilder[2];

            for(BattleMsg.S2C_Battle_PKTeam team : battleMsgBuild.getTeamsList()) {
               playerAndArrayKey[team.getForce()] = new StringBuilder();
               playerAndArrayKey[team.getForce()].append(team.getBeloogId()).append(":");

               for(BattleMsg.S2C_Battle_Entity battleEntity : team.getEntitesList()) {
                  if (battleEntity.getType() == BattleMsg.EntityType.EntityType_Hero || battleEntity.getType() == BattleMsg.EntityType.EntityType_Friend) {
                     if (team.getForce() == battleMsgBuild.getResult().getResult()) {
                        HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", battleEntity.getHeroId());
                        if (heroModel == null) {
                           continue;
                        }

                        specialRecordData.nationCountMap.put(heroModel.getNation(), (Integer)specialRecordData.nationCountMap.getOrDefault(heroModel.getNation(), 0) + 1);
                     }

                     byte pos = battleEntity.getOriginalPos() != BattleMisc.FRIEND_POS[0] && battleEntity.getOriginalPos() != BattleMisc.FRIEND_POS[1] ? (byte)battleEntity.getTeamPos() : 5;
                     playerAndArrayKey[team.getForce()].append(pos).append("=").append(battleEntity.getHeroId()).append("&");
                  }
               }

               playerAndArrayKey[team.getForce()].deleteCharAt(playerAndArrayKey[team.getForce()].length() - 1);
            }

            String finalKey = "";
            if (battleMsgBuild.getTeams(0).getBeloogId() > battleMsgBuild.getTeams(1).getBeloogId()) {
               finalKey = playerAndArrayKey[0].toString() + "+" + playerAndArrayKey[1].toString();
            } else {
               finalKey = playerAndArrayKey[1].toString() + "+" + playerAndArrayKey[0].toString();
            }

            if (specialRecordData.nationCountMap.isEmpty()) {
               return;
            }

            specialRecordData.stream = null;
            specialRecordData.powerDif = Math.abs(battleMsgBuild.getTeams(0).getCombatPower() - battleMsgBuild.getTeams(1).getCombatPower());
            specialRecordData.nationCountMap = (LinkedHashMap)specialRecordData.nationCountMap.entrySet().stream().sorted((o1, o2) -> NumberUtil.compare((Integer)o2.getValue(), (Integer)o1.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
            ((List)this.allRecordDataMap.computeIfAbsent(finalKey, (v) -> new ArrayList())).add(specialRecordData);
         } catch (Exception var11) {
            iterator.remove();
         }
      }

      logger.info("finish collect record size: {}", specialRecordDataList.size());
   }

   public List<BattleRecordMsg.SpecialBattleRecordInfo> getSpecialRecords(List<Long> recordIds) {
      List<BattleRecordMsg.SpecialBattleRecordInfo> list = new ArrayList();
      String tbName = String.format("%s_%d_%d.%s", "special", 0, 0, "special_record");

      try {
         for(long recordId : recordIds) {
            this.dbPool.query(String.format("SELECT id,stream FROM %s where id=?", tbName), (resultSet) -> {
               try {
                  if (resultSet.next()) {
                     byte[] stream = resultSet.getBytes("stream");
                     stream = this.decompress(stream);
                     BattleMsg.S2C_BattleResult_6102 battleMsgBuild = BattleMsg.S2C_BattleResult_6102.parseFrom(stream);
                     BattleRecordMsg.SpecialBattleRecordInfo.Builder specialRecordBuild = BattleRecordMsg.SpecialBattleRecordInfo.newBuilder();
                     specialRecordBuild.setRecordId(resultSet.getLong("id"));
                     specialRecordBuild.setResult(battleMsgBuild.toBuilder().setIsRecord(1).clearRounds());
                     list.add(specialRecordBuild.build());
                  }
               } catch (Exception var6) {
               }

            }, new Object[]{recordId});
         }
      } catch (Throwable throwable) {
         throwable.printStackTrace();
      }

      return list;
   }

   public BattleMsg.S2C_BattleResult_6102 getSpecialRecord(long recordId) {
      BattleMsg.S2C_BattleResult_6102[] result = new BattleMsg.S2C_BattleResult_6102[]{null};
      String tbName = String.format("%s_%d_%d.%s", "special", 0, 0, "special_record");

      try {
         this.dbPool.query(String.format("SELECT stream FROM %s where id=?", tbName), (resultSet) -> {
            try {
               if (!resultSet.next()) {
                  return;
               }

               byte[] stream = resultSet.getBytes("stream");
               stream = this.decompress(stream);
               BattleMsg.S2C_BattleResult_6102 battleMsgBuild = BattleMsg.S2C_BattleResult_6102.parseFrom(stream);
               result[0] = battleMsgBuild.toBuilder().setIsRecord(1).build();
            } catch (Exception var5) {
            }

         }, new Object[]{recordId});
      } catch (Throwable throwable) {
         throwable.printStackTrace();
      }

      return result[0];
   }

   private byte[] decompress(byte[] stream) throws Exception {
      int size = (int)Zstd.decompressedSize(stream);
      if (size < 1048576 && size > 0) {
         byte[] tempArray = new byte[size];
         Zstd.decompress(tempArray, stream);
         stream = tempArray;
      }

      return stream;
   }

   public LinkedHashSet<Long> getNationRecordIds(int nation) {
      return !this.specialRecordGroupMap.containsKey(nation) ? new LinkedHashSet() : (LinkedHashSet)this.specialRecordGroupMap.get(nation);
   }
}
