package com.gzbz.db.bean;

import com.gzbz.activity.bean.BeautyTreasureRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.MiscUtil;

public class ActivityTongQueRotateData {
   public Map<Integer, Integer> chessMap = new HashMap();
   public int prizes = 0;
   public int flush = 0;
   public int goldFly = 0;
   public int taskGroup = 0;
   public boolean unlock = false;
   public Map<Integer, Integer> connect = new HashMap();
   public Set<Integer> prizeSet = new HashSet();
   public Map<Integer, Long> newChessMap = new HashMap();
   public int floorCount = 0;
   public List<BeautyTreasureRecord> recordList = new ArrayList();
   public Map<Integer, Integer> receiveRecord = new HashMap();
   public Map<Integer, Integer> historyRecord = new HashMap();

   public void reset() {
      this.goldFly = 0;
      this.flush = 0;
   }

   public void resetAll() {
      this.chessMap.clear();
      this.prizes = 0;
      this.flush = 0;
      this.goldFly = 0;
      this.taskGroup = 0;
      this.connect.clear();
      this.newChessMap.clear();
      this.prizeSet.clear();
      this.floorCount = 0;
      this.receiveRecord.clear();
      this.recordList.clear();
      this.historyRecord.clear();
   }

   public boolean chessIsOpen(int pos) {
      long iconValue = (Long)this.newChessMap.getOrDefault(pos, 0L);
      return MiscUtil.getHiParam(iconValue) == 1;
   }

   public Set<Integer> alreadyOpenChess() {
      Set<Integer> set = new HashSet();
      this.newChessMap.keySet().forEach((pos) -> {
         if (this.chessIsOpen(pos)) {
            set.add(pos);
         }

      });
      return set;
   }

   public int chessIcon(int pos) {
      long chessValue = (Long)this.newChessMap.getOrDefault(pos, 0L);
      return MiscUtil.getLowParam(chessValue);
   }
}
