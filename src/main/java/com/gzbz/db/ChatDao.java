package com.gzbz.db;

import com.gzbz.db.worldBean.PrestigeData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import misc.DataUtils;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_chat",
   resultType = 1,
   selectKey = {"playerId"}
)
public class ChatDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id",
      index = 0,
      indexName = {"playerId"}
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "id"
   )
   public int id;
   @DBColumnAnno(
      comment = "频道"
   )
   public int channel;
   @DBColumnAnno(
      comment = "子渠道"
   )
   public int subclass;
   @DBColumnAnno(
      comment = "发送标识"
   )
   public int sendType;
   @DBColumnAnno(
      comment = "相对应玩家id"
   )
   public int relativePlayerId;
   @DBColumnAnno(
      comment = "内容"
   )
   public String content = "";
   @DBColumnAnno(
      comment = "额外参数1"
   )
   public int extra_1;
   @DBColumnAnno(
      comment = "额外参数2"
   )
   public String extra_2 = "";
   @DBColumnAnno(
      columnType = "BLOB",
      comment = "武将分享"
   )
   public byte[] heroShare;
   @DBColumnAnno(
      comment = "接收者id"
   )
   public int appointId;
   @DBColumnAnno(
      comment = "聊天气泡id"
   )
   public int bubbleId;
   public Timestamp createTime = new Timestamp(System.currentTimeMillis());
   @DBColumnAnno(
      comment = "勋章",
      loadFun = "loadMedals",
      saveFun = "saveMedals"
   )
   public Set<Integer> medals = new HashSet();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "自定义称号",
      loadFun = "loadCustomPrestiges",
      saveFun = "saveCustomPrestiges"
   )
   public PrestigeData customPrestiges;

   public void loadMedals(String data) {
      this.medals = DataUtils.stringToIntSet(data);
   }

   public String saveMedals() {
      return DataUtils.intSetToString(this.medals);
   }

   public void loadCustomPrestiges(String data) {
      this.customPrestiges = (PrestigeData)JsonUtil.jsonToBean(data, PrestigeData.class);
   }

   public String saveCustomPrestiges() {
      return JsonUtil.beanToJson(this.customPrestiges);
   }
}
