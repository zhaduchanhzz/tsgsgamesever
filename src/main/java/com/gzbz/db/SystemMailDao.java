package com.gzbz.db;

import com.gzbz.model.fun.ResourceModel;
import db.DBColumnAnno;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;

@DBTableAnno(
   name = "systemmail"
)
public class SystemMailDao {
   @DBColumnAnno(
      columnName = "systemmail_id",
      len = 20,
      isPrimary = true,
      isAutoInc = true
   )
   public long systemMailId;
   @DBColumnAnno(
      columnName = "uid",
      len = 11,
      comment = "uid就是角色ID",
      index = 0,
      indexName = {"role_id_index"},
      isNotNull = true
   )
   public int uid;
   @DBColumnAnno(
      columnName = "kind",
      len = 11,
      isNotNull = true,
      comment = "邮件类型,1是个人邮件,2是全服邮件"
   )
   public int kind;
   @DBColumnAnno(
      columnName = "recv_time",
      len = 20,
      isNotNull = true,
      comment = "游戏服接收时间,默认0未接收"
   )
   public long recvTime;
   @DBColumnAnno(
      columnName = "coin",
      len = 11,
      isNotNull = true,
      comment = "铜钱"
   )
   public int coin;
   @DBColumnAnno(
      columnName = "gold",
      len = 11,
      isNotNull = true,
      comment = "元宝"
   )
   public int gold;
   @DBColumnAnno(
      columnName = "subject",
      len = 128,
      isNotNull = true,
      comment = "邮件标题"
   )
   public String subject;
   @DBColumnAnno(
      columnName = "content",
      len = 512,
      isNotNull = true,
      comment = "邮件内容"
   )
   public String content;
   @DBColumnAnno(
      columnName = "invalid_time",
      len = 20,
      isNotNull = true,
      comment = "邮件失效时间"
   )
   public long invalidTime;
   @DBColumnAnno(
      columnName = "create_time",
      len = 20,
      isNotNull = true,
      comment = "创建时间"
   )
   public long createTime;
   @DBColumnAnno(
      columnName = "item_type1",
      len = 11,
      isNotNull = true
   )
   public int itemType1;
   @DBColumnAnno(
      columnName = "item_id1",
      len = 11,
      isNotNull = true
   )
   public int itemId1;
   @DBColumnAnno(
      columnName = "item_num1",
      len = 11,
      isNotNull = true
   )
   public int itemNum1;
   @DBColumnAnno(
      columnName = "item_type2",
      len = 11,
      isNotNull = true
   )
   public int itemType2;
   @DBColumnAnno(
      columnName = "item_id2",
      len = 11,
      isNotNull = true
   )
   public int itemId2;
   @DBColumnAnno(
      columnName = "item_num2",
      len = 11,
      isNotNull = true
   )
   public int itemNum2;
   @DBColumnAnno(
      columnName = "item_type3",
      len = 11,
      isNotNull = true
   )
   public int itemType3;
   @DBColumnAnno(
      columnName = "item_id3",
      len = 11,
      isNotNull = true
   )
   public int itemId3;
   @DBColumnAnno(
      columnName = "item_num3",
      len = 11,
      isNotNull = true
   )
   public int itemNum3;
   @DBColumnAnno(
      columnName = "item_type4",
      len = 11,
      isNotNull = true
   )
   public int itemType4;
   @DBColumnAnno(
      columnName = "item_id4",
      len = 11,
      isNotNull = true
   )
   public int itemId4;
   @DBColumnAnno(
      columnName = "item_num4",
      len = 11,
      isNotNull = true
   )
   public int itemNum4;
   @DBColumnAnno(
      columnName = "item_type5",
      len = 11,
      isNotNull = true
   )
   public int itemType5;
   @DBColumnAnno(
      columnName = "item_id5",
      len = 11,
      isNotNull = true
   )
   public int itemId5;
   @DBColumnAnno(
      columnName = "item_num5",
      len = 11,
      isNotNull = true
   )
   public int itemNum5;
   @DBColumnAnno(
      columnName = "item_type6",
      len = 11,
      isNotNull = true
   )
   public int itemType6;
   @DBColumnAnno(
      columnName = "item_id6",
      len = 11,
      isNotNull = true
   )
   public int itemId6;
   @DBColumnAnno(
      columnName = "item_num6",
      len = 11,
      isNotNull = true
   )
   public int itemNum6;
   @DBColumnAnno(
      columnName = "item_type7",
      len = 11,
      isNotNull = true
   )
   public int itemType7;
   @DBColumnAnno(
      columnName = "item_id7",
      len = 11,
      isNotNull = true
   )
   public int itemId7;
   @DBColumnAnno(
      columnName = "item_num7",
      len = 11,
      isNotNull = true
   )
   public int itemNum7;
   @DBColumnAnno(
      columnName = "item_type8",
      len = 11,
      isNotNull = true
   )
   public int itemType8;
   @DBColumnAnno(
      columnName = "item_id8",
      len = 11,
      isNotNull = true
   )
   public int itemId8;
   @DBColumnAnno(
      columnName = "item_num8",
      len = 11,
      isNotNull = true
   )
   public int itemNum8;
   @DBColumnAnno(
      columnName = "item_type9",
      len = 11,
      isNotNull = true
   )
   public int itemType9;
   @DBColumnAnno(
      columnName = "item_id9",
      len = 11,
      isNotNull = true
   )
   public int itemId9;
   @DBColumnAnno(
      columnName = "item_num9",
      len = 11,
      isNotNull = true
   )
   public int itemNum9;
   @DBColumnAnno(
      columnName = "item_type10",
      len = 11,
      isNotNull = true
   )
   public int itemType10;
   @DBColumnAnno(
      columnName = "item_id10",
      len = 11,
      isNotNull = true
   )
   public int itemId10;
   @DBColumnAnno(
      columnName = "item_num10",
      len = 11,
      isNotNull = true
   )
   public int itemNum10;
   @DBColumnAnno(
      skip = true
   )
   public List<ResourceModel> resourceModels = new ArrayList();
}
