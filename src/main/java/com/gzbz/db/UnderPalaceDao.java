package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import com.gzbz.db.bean.UnderPalaceData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.DataUtils;
import misc.JsonUtil;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_player_under_Palace"
)
public class UnderPalaceDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "已扫荡次数"
   )
   public int sweepNum;
   @DBColumnAnno(
      comment = "各难度关卡信息",
      columnType = "TEXT",
      loadFun = "loadPalace",
      saveFun = "savePalace"
   )
   public Map<Integer, UnderPalaceData> palaceInfo = new HashMap();
   @DBColumnAnno(
      comment = "镜花水月奖励领取情况",
      columnType = "TEXT",
      loadFun = "loadExtra",
      saveFun = "saveExtra"
   )
   public List<Integer> extraAward = new ArrayList();
   @DBColumnAnno(
      comment = "普通层数奖励领取情况",
      columnType = "TEXT",
      loadFun = "loadCommon",
      saveFun = "saveCommon"
   )
   public List<Integer> commonAward = new ArrayList();
   @DBColumnAnno(
      comment = "紫薇战令奖励领取情况",
      columnType = "TEXT",
      loadFun = "loadRecZiWeiAward",
      saveFun = "saveRecZiWeiAward"
   )
   public List<Integer> recZiWeiAward = new ArrayList();

   public void loadPalace(String data) {
      this.palaceInfo = JsonUtil.jsonToMap(data, Integer.class, UnderPalaceData.class);
   }

   public String savePalace() {
      return JsonUtil.beanToJson(this.palaceInfo);
   }

   public void loadExtra(String data) {
      if (!StringUtils.isEmpty(data)) {
         this.extraAward = JsonUtil.jsonToList(data, Integer.class);
      }
   }

   public String saveExtra() {
      return JSON.toJSONString(this.extraAward);
   }

   public void loadCommon(String data) {
      if (!StringUtils.isEmpty(data)) {
         this.commonAward = JsonUtil.jsonToList(data, Integer.class);
      }
   }

   public String saveCommon() {
      return JSON.toJSONString(this.commonAward);
   }

   public void loadRecZiWeiAward(String data) {
      this.recZiWeiAward = DataUtils.stringToIntList(data);
   }

   public String saveRecZiWeiAward() {
      return DataUtils.intListToString(this.recZiWeiAward);
   }
}
