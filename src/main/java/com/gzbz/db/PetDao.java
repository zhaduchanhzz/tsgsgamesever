package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import com.gzbz.db.bean.PetArrayingData;
import com.gzbz.db.bean.PetHatchData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_pet",
   resultType = 0,
   selectKey = {"playerId"}
)
public class PetDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id",
      index = 0
   )
   public int playerId;
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "神兽布阵",
      loadFun = "loadArrayingJson",
      saveFun = "saveArrayingJson"
   )
   public Map<Integer, PetArrayingData> arraying = new HashMap();
   @DBColumnAnno(
      comment = "孵化等级"
   )
   public int hatchLv;
   @DBColumnAnno(
      comment = "孵化经验"
   )
   public int hatchExp;
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "孵化信息",
      loadFun = "loadHatchSloctsJson",
      saveFun = "saveHatchSloctsJson"
   )
   public Map<Integer, PetHatchData> hatchSlocts = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "图鉴领取信息",
      loadFun = "loadDictionaryMapJson",
      saveFun = "saveDictionaryMapJson"
   )
   public Map<Integer, Integer> dictionaryMap = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "孵化保底数据",
      loadFun = "loadHatchFootsJson",
      saveFun = "saveHatchFootsJson"
   )
   public Map<Integer, Integer> hatchFoots = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "已领取升级宝箱",
      loadFun = "loadTakedIdsJson",
      saveFun = "saveTakedIdsJson"
   )
   public List<Integer> takedIds = new ArrayList();

   public void loadArrayingJson(String data) {
      this.arraying = JsonUtil.jsonToMap(data, Integer.class, PetArrayingData.class);
   }

   public String saveArrayingJson() {
      return JSON.toJSONString(this.arraying);
   }

   public void loadHatchSloctsJson(String data) {
      this.hatchSlocts = JsonUtil.jsonToMap(data, Integer.class, PetHatchData.class);
   }

   public String saveHatchSloctsJson() {
      return JSON.toJSONString(this.hatchSlocts);
   }

   public void loadDictionaryMapJson(String data) {
      this.dictionaryMap = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveDictionaryMapJson() {
      return JSON.toJSONString(this.dictionaryMap);
   }

   public void loadHatchFootsJson(String data) {
      this.hatchFoots = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveHatchFootsJson() {
      return JSON.toJSONString(this.hatchFoots);
   }

   public void loadTakedIdsJson(String data) {
      this.takedIds = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveTakedIdsJson() {
      return JSON.toJSONString(this.takedIds);
   }
}
