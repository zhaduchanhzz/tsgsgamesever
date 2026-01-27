package com.gzbz.db;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.union.bean.UnionDailyGuessGridInfo;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.JsonUtil;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_player_union_daily_guess",
   resultType = 0,
   selectKey = {"playerId"}
)
public class PlayerUnionDailyGuessDao extends DBDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "军团id"
   )
   public int unionId;
   @DBColumnAnno(
      columnName = "currentChapter",
      comment = "当前所在关卡,0表示还未开始"
   )
   public int currentChapter;
   @DBColumnAnno(
      comment = "版本号"
   )
   public int version;
   @DBColumnAnno(
      comment = "当前所在格子"
   )
   public int curGrid;
   @DBColumnAnno(
      comment = "当前章节战斗状态 0.未开始 1.行军中 2.已完成"
   )
   public int state;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadSee",
      saveFun = "saveSee",
      comment = "已探索的格子"
   )
   public Set<Integer> seeGridSet = new HashSet();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadGridInfo",
      saveFun = "saveGridInfo",
      comment = "格子信息"
   )
   public Map<Integer, UnionDailyGuessGridInfo> gridInfoMap = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadEnemyDataMap",
      saveFun = "saveEnemyDataMap",
      comment = "敌人信息 grid:isPassed"
   )
   public Map<Integer, Integer> enemyDataMap = new HashMap();
   @DBColumnAnno(
      columnName = "allPassState",
      comment = "所有层通关状态,0:未完成,1:已完全通关,-1:已结束但未完全通关"
   )
   public int allPassState;
   @DBColumnAnno(
      columnName = "resetTime",
      comment = "重置时间,在线玩家每日零点重置,不在线玩家登录时重置"
   )
   public long resetTime;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadPassOrderMap",
      saveFun = "savePassOrderMap",
      comment = "通关顺序 chapterId:orderNumber"
   )
   public TreeMap<Integer, Integer> passOrderMap = new TreeMap();
   @DBColumnAnno(
      columnName = "shareState",
      comment = "分享通关顺序状态 0:还未分享过 1:已分享"
   )
   public int shareState = 0;
   @DBColumnAnno(
      columnType = "TEXT",
      columnName = "rewardList",
      comment = "猜门结束时的奖励列表",
      loadFun = "loadRewardList",
      saveFun = "saveRewardList"
   )
   public List<ResourceModel> rewardList = new ArrayList();

   public void loadSee(String str) {
      List<String> list = Splitter.on("|").splitToList(str);
      list.forEach((value) -> this.seeGridSet.add(Integer.parseInt(value)));
   }

   public String saveSee() {
      return Joiner.on("|").join(this.seeGridSet);
   }

   public void loadGridInfo(String str) {
      if (!StringUtils.isEmpty(str)) {
         Map<Integer, UnionDailyGuessGridInfo> gridInfoMap_ = new HashMap();
         String[] strings = str.split("\u0001", -1);

         for(String string : strings) {
            UnionDailyGuessGridInfo unionDailyGuessGridInfo = new UnionDailyGuessGridInfo();
            unionDailyGuessGridInfo.decode(string);
            gridInfoMap_.put(unionDailyGuessGridInfo.gridId, unionDailyGuessGridInfo);
         }

         this.gridInfoMap = gridInfoMap_;
      }
   }

   public String saveGridInfo() {
      StringBuilder stringBuilder = new StringBuilder();
      if (this.gridInfoMap.size() > 0) {
         for(Map.Entry<Integer, UnionDailyGuessGridInfo> entry : this.gridInfoMap.entrySet()) {
            UnionDailyGuessGridInfo unionDailyGuessGridInfo = (UnionDailyGuessGridInfo)entry.getValue();
            String data = unionDailyGuessGridInfo.encode();
            stringBuilder.append(data);
            stringBuilder.append("\u0001");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }

   public void loadEnemyDataMap(String data) {
      if (!StringUtils.isEmpty(data)) {
         Map<Integer, Integer> enemyDataMap_ = new HashMap();
         String[] enemyDataArray = data.split(",");
         if (enemyDataArray.length > 0) {
            for(String enemyDataStr : enemyDataArray) {
               String[] grid_passed = enemyDataStr.split(":");
               if (grid_passed.length >= 2) {
                  int grid = Integer.parseInt(grid_passed[0]);
                  int passed = Integer.parseInt(grid_passed[1]);
                  enemyDataMap_.put(grid, passed);
               }
            }

            this.enemyDataMap = enemyDataMap_;
         }
      }
   }

   public String saveEnemyDataMap() {
      StringBuilder stringBuilder = new StringBuilder();
      if (this.enemyDataMap.size() > 0) {
         for(Map.Entry<Integer, Integer> entry : this.enemyDataMap.entrySet()) {
            Integer grid = (Integer)entry.getKey();
            Integer passed = (Integer)entry.getValue();
            stringBuilder.append(grid + ":" + passed + ",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }

   public void loadPassOrderMap(String data) {
      if (!StringUtils.isEmpty(data)) {
         TreeMap<Integer, Integer> passOrderMap_ = new TreeMap();
         String[] list = data.split(",");
         if (list.length > 0) {
            for(String listStr : list) {
               String[] int_int = listStr.split(":");
               if (int_int.length >= 2) {
                  int chapterId = Integer.parseInt(int_int[0]);
                  int orderNumber = Integer.parseInt(int_int[1]);
                  passOrderMap_.put(chapterId, orderNumber);
               }
            }

            this.passOrderMap = passOrderMap_;
         }
      }
   }

   public String savePassOrderMap() {
      StringBuilder stringBuilder = new StringBuilder();
      if (this.passOrderMap.size() > 0) {
         for(Map.Entry<Integer, Integer> entry : this.passOrderMap.entrySet()) {
            Integer chapterId = (Integer)entry.getKey();
            Integer orderNumber = (Integer)entry.getValue();
            stringBuilder.append(chapterId + ":" + orderNumber + ",");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }

   public void loadRewardList(String data) {
      this.rewardList = JsonUtil.jsonToList(data, ResourceModel.class);
   }

   public String saveRewardList() {
      return JsonUtil.beanToJson(this.rewardList);
   }
}
