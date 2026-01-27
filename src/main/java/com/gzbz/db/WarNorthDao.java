package com.gzbz.db;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_war_north",
   resultType = 0,
   selectKey = {"playerId"}
)
public class WarNorthDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "已挑战次数"
   )
   public int challengeCount;
   @DBColumnAnno(
      comment = "已购买次数"
   )
   public int buyCount;
   @DBColumnAnno(
      comment = "副本信息section->(copy->conditions)",
      columnType = "TEXT",
      loadFun = "loadCopies",
      saveFun = "saveCopies"
   )
   public Map<Integer, Map<Integer, Set<Integer>>> copies = new HashMap();
   @DBColumnAnno(
      comment = "已领取章节目标奖励section->idSet",
      columnType = "TEXT",
      loadFun = "loadSectionTargets",
      saveFun = "saveSectionTargets"
   )
   public Map<Integer, Set<Integer>> sectionTargets = new HashMap();
   @DBColumnAnno(
      comment = "已领取章节宝箱section->idSet",
      columnType = "TEXT",
      loadFun = "loadSectionBoxes",
      saveFun = "saveSectionBoxes"
   )
   public Map<Integer, Set<Integer>> sectionBoxes = new HashMap();
   @DBColumnAnno(
      comment = "祭祀已使用免费次数"
   )
   public int sacrificeFreeCount;
   @DBColumnAnno(
      comment = "已祭祀次数"
   )
   public int sacrificeCount;
   @DBColumnAnno(
      comment = "祭祀积分"
   )
   public int sacrificePoint;
   @DBColumnAnno(
      comment = "已领取祭祀宝箱",
      columnType = "TEXT",
      loadFun = "loadSacrificeBoxes",
      saveFun = "saveSacrificeBoxes"
   )
   public Set<Integer> sacrificeBoxes = new HashSet();
   @DBColumnAnno(
      comment = "是否已发放首次必得配饰"
   )
   public boolean firstGot = false;

   public void reset() {
      this.challengeCount = 0;
      this.buyCount = 0;
      this.sacrificeFreeCount = 0;
      this.updateOp();
   }

   public void loadCopies(String columnData) {
      Map<Integer, String> map = JsonUtil.jsonToMap(columnData, Integer.class, String.class);
      map.entrySet().forEach((entry) -> {
         Map<Integer, Set<Integer>> finalValue = new HashMap();
         Map<Integer, String> v = JsonUtil.jsonToMap((String)entry.getValue(), Integer.class, String.class);
         v.entrySet().forEach((valueEntry) -> {
            Set<Integer> valueSet = (Set)JsonUtil.jsonToBean((String)valueEntry.getValue(), HashSet.class);
            finalValue.put(valueEntry.getKey(), valueSet);
         });
         this.copies.put(entry.getKey(), finalValue);
      });
   }

   public String saveCopies() {
      return JsonUtil.beanToJson(this.copies);
   }

   public void loadSectionTargets(String columnData) {
      Map<Integer, String> map = JsonUtil.jsonToMap(columnData, Integer.class, String.class);
      map.entrySet().forEach((entry) -> {
         Set<Integer> v = (Set)JsonUtil.jsonToBean((String)entry.getValue(), HashSet.class);
         this.sectionTargets.put(entry.getKey(), v);
      });
   }

   public String saveSectionTargets() {
      return JsonUtil.beanToJson(this.sectionTargets);
   }

   public void loadSectionBoxes(String columnData) {
      Map<Integer, String> map = JsonUtil.jsonToMap(columnData, Integer.class, String.class);
      map.entrySet().forEach((entry) -> {
         Set<Integer> v = (Set)JsonUtil.jsonToBean((String)entry.getValue(), HashSet.class);
         this.sectionBoxes.put(entry.getKey(), v);
      });
   }

   public String saveSectionBoxes() {
      return JsonUtil.beanToJson(this.sectionBoxes);
   }

   public void loadSacrificeBoxes(String columnData) {
      List<String> list = Splitter.on("|").splitToList(columnData);
      list.forEach((value) -> this.sacrificeBoxes.add(Integer.parseInt(value)));
   }

   public String saveSacrificeBoxes() {
      return Joiner.on("|").join(this.sacrificeBoxes);
   }
}
