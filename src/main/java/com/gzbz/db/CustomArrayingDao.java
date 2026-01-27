package com.gzbz.db;

import com.gzbz.activity.bean.decisiveBattle.DecisiveHeroInfo;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.CommonMsg;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.DataUtils;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_custom_arraying",
   resultType = 0,
   selectKey = {"playerId"}
)
public class CustomArrayingDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "阵列信息",
      columnType = "LONGTEXT",
      loadFun = "loadArraying",
      saveFun = "saveArraying"
   )
   public Map<CommonMsg.HeroState, ArrayingInfo> arrayingMap = new HashMap();
   @DBColumnAnno(
      comment = "奇谋信息",
      columnType = "LONGTEXT",
      loadFun = "loadMagicBook",
      saveFun = "saveMagicBook"
   )
   public Map<Integer, Integer> magicBook = new HashMap();
   @DBColumnAnno(
      comment = "英雄信息",
      columnType = "LONGTEXT",
      loadFun = "loadHeroData",
      saveFun = "saveHeroData"
   )
   public Map<Integer, DecisiveHeroInfo> heroMap = new HashMap();
   @DBColumnAnno(
      comment = "同心策",
      columnType = "LONGTEXT",
      loadFun = "loadBeautyMap",
      saveFun = "saveBeautyMap"
   )
   public List<Integer> beautyList = new ArrayList();
   public List<PropertyModel> property_artifact_refine = new ArrayList();
   public List<PropertyModel> property_artifact_refine_add = new ArrayList();
   public List<PropertyModel> property_artifact_strong = new ArrayList();
   public Map<CommonMsg.HeroState, Map<Integer, Map<Integer, List<PropertyModel>>>> friendProperty = new HashMap();

   public void loadArraying(String data) {
      this.arrayingMap = JsonUtil.jsonToMap(data, CommonMsg.HeroState.class, ArrayingInfo.class);
   }

   public String saveArraying() {
      return JsonUtil.beanToJson(this.arrayingMap);
   }

   public void loadBeautyMap(String data) {
      this.beautyList = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveBeautyMap() {
      return JsonUtil.beanToJson(this.beautyList);
   }

   public void loadMagicBook(String data) {
      this.magicBook = DataUtils.stringToInt_intMap(data);
   }

   public String saveMagicBook() {
      return DataUtils.int_intMapToString(this.magicBook);
   }

   public void loadHeroData(String data) {
      this.heroMap = JsonUtil.jsonToMap(data, Integer.class, DecisiveHeroInfo.class, HashMap.class);
   }

   public String saveHeroData() {
      return JsonUtil.beanToJson(this.heroMap);
   }

   public static class ArrayingInfo {
      public int friendJob;
      public int friendNation;
      public int friendState;
      public int beautyId;
      public int artifactId;
      public Map<Integer, Integer> heroMap = new HashMap();
      public int soulHeroCode;
   }
}
