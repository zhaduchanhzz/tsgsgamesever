package com.gzbz.db;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.gzbz.megerWar.bean.MergeWarGameData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_merge_war_game",
   resultType = 0,
   mapKey = {"systemId"}
)
public class MergeWarGameDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "开启类型"
   )
   public int systemId;
   @DBColumnAnno(
      comment = "地图id"
   )
   public int chapterId;
   @DBColumnAnno(
      comment = "参与的军团",
      loadFun = "loadUnionList",
      saveFun = "saveUnionList"
   )
   public List<Integer> unionList = new ArrayList();
   @DBColumnAnno(
      comment = "玩法数据",
      columnType = "LONGTEXT",
      loadFun = "loadMergeWarData",
      saveFun = "saveMergeWarData"
   )
   public MergeWarGameData mergeWarData;

   public void loadUnionList(String data) {
      List<String> list = Splitter.on("|").splitToList(data);
      list.forEach((unionId) -> this.unionList.add(Integer.parseInt(unionId)));
   }

   public String saveUnionList() {
      return Joiner.on("|").join(this.unionList);
   }

   public void loadMergeWarData(String data) {
      this.mergeWarData = (MergeWarGameData)JsonUtil.jsonToBean(data, MergeWarGameData.class);
   }

   public String saveMergeWarData() {
      return JsonUtil.beanToJson(this.mergeWarData);
   }
}
