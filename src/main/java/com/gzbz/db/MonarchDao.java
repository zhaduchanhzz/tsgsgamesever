package com.gzbz.db;

import com.alibaba.fastjson.JSON;
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
import misc.DataUtils;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_player_monarch",
   selectKey = {"id"}
)
public class MonarchDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家code"
   )
   public int id;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadHeadFrame",
      saveFun = "saveHeadFrame",
      comment = "当前所拥有头像框"
   )
   public Map<Integer, Integer> headFrames = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadPrestige",
      saveFun = "savePrestige",
      comment = "当前所拥有称号"
   )
   public Map<Integer, Integer> prestiges = new HashMap();
   @DBColumnAnno(
      comment = "玩家君主形象列表",
      columnName = "monarchs",
      columnType = "TEXT",
      loadFun = "loadMonarch",
      saveFun = "saveMonarch"
   )
   public Set<Integer> monarchs = new HashSet();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadHead",
      saveFun = "saveHead",
      comment = "当前所拥有头像"
   )
   public Set<Integer> heads = new HashSet();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadPrestigeLv",
      saveFun = "savePrestigeLv",
      comment = "当前所拥有称号与等级"
   )
   public Map<Integer, Integer> prestigeLv = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadCustomPrestiges",
      saveFun = "saveCustomPrestiges",
      comment = "玩家自定义称号"
   )
   public Map<Integer, String> customPrestiges = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadTrendHead",
      saveFun = "saveTrendHead",
      comment = "玩家动态头像"
   )
   public Set<Integer> trendHead = new HashSet();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadHideTrendHead",
      saveFun = "saveHideTrendHead",
      comment = "是否隐藏动态头像"
   )
   public Map<Integer, Boolean> showTrendHead = new HashMap();

   public void loadHideTrendHead(String data) {
      this.showTrendHead = JsonUtil.jsonToMap(data, Integer.class, Boolean.class);
   }

   public String saveHideTrendHead() {
      return JSON.toJSONString(this.showTrendHead);
   }

   public void loadTrendHead(String columnData) {
      List<String> list = Splitter.on("|").splitToList(columnData);
      list.forEach((value) -> this.trendHead.add(Integer.parseInt(value)));
   }

   public String saveTrendHead() {
      return Joiner.on("|").join(this.trendHead);
   }

   public void loadCustomPrestiges(String data) {
      this.customPrestiges = DataUtils.stringToInt_stringMap(data);
   }

   public String saveCustomPrestiges() {
      return DataUtils.int_stringMapToString(this.customPrestiges);
   }

   public void loadHeadFrame(String data) {
      this.headFrames = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveHeadFrame() {
      return JSON.toJSONString(this.headFrames);
   }

   public void loadPrestige(String data) {
      this.prestiges = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String savePrestige() {
      return JSON.toJSONString(this.prestiges);
   }

   public void loadHead(String columnData) {
      List<String> list = Splitter.on("|").splitToList(columnData);
      list.forEach((value) -> this.heads.add(Integer.parseInt(value)));
   }

   public String saveHead() {
      return Joiner.on("|").join(this.heads);
   }

   public void loadMonarch(String columnData) {
      List<String> list = Splitter.on("|").splitToList(columnData);
      list.forEach((value) -> this.monarchs.add(Integer.parseInt(value)));
   }

   public String saveMonarch() {
      return Joiner.on("|").join(this.monarchs);
   }

   public void loadPrestigeLv(String data) {
      this.prestigeLv = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String savePrestigeLv() {
      return JSON.toJSONString(this.prestigeLv);
   }
}
