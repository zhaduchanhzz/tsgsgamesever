package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import com.gzbz.db.bean.FairylandRecordData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.JsonUtil;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_player_fairland",
   resultType = 0,
   selectKey = {"playerId"}
)
public class FairylandDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "关卡id"
   )
   public int stageId;
   @DBColumnAnno(
      comment = "层数扫荡次数"
   )
   public int commonSweep;
   @DBColumnAnno(
      comment = "挑战券数量"
   )
   public int ticketNum = 4;
   @DBColumnAnno(
      comment = "探索英雄",
      columnType = "TEXT",
      loadFun = "loadHero",
      saveFun = "saveHero"
   )
   public Map<Integer, Integer> exploreHero = new HashMap();
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
      columnType = "BLOB",
      comment = "乱入英雄信息"
   )
   public byte[] heroInfo;
   @DBColumnAnno(
      comment = "奖励标识"
   )
   public int recordFlag = 1;
   @DBColumnAnno(
      comment = "被劫掠记录",
      columnType = "TEXT",
      loadFun = "loadRecord",
      saveFun = "saveRecord"
   )
   public List<FairylandRecordData> recordData = new ArrayList();
   @DBColumnAnno(
      comment = "通关状态"
   )
   public int passState = 0;

   public void loadHero(String data) {
      this.exploreHero = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveHero() {
      return JsonUtil.beanToJson(this.exploreHero);
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

   public void loadRecord(String data) {
      if (!StringUtils.isEmpty(data)) {
         this.recordData = JsonUtil.jsonToList(data, FairylandRecordData.class);
      }
   }

   public String saveRecord() {
      return JSON.toJSONString(this.recordData);
   }
}
