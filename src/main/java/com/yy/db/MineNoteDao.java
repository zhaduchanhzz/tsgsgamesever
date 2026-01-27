package com.yy.db;

import com.yy.mine.MineNote;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import misc.DateUtil;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_mine_note",
   dbType = 2,
   resultType = 0,
   selectKey = {"playerId"}
)
public class MineNoteDao extends DBDao {
   @DBColumnAnno(
      comment = "玩家id",
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "发生变动"
   )
   public boolean isChange = false;
   @DBColumnAnno(
      comment = "内容",
      columnType = "LONGTEXT",
      saveFun = "saveContent",
      loadFun = "loadContent"
   )
   public List<MineNote> mineNoteList = new ArrayList();

   public void loadContent(String str) {
      this.mineNoteList = JsonUtil.jsonToList(str, MineNote.class);
      this.filterTimeOut(this.mineNoteList);
   }

   public String saveContent() {
      this.filterTimeOut(this.mineNoteList);
      return JsonUtil.beanToJson(this.mineNoteList);
   }

   public void filterTimeOut(List<MineNote> mineNoteList) {
      Iterator<MineNote> iterator = mineNoteList.iterator();

      while(iterator.hasNext()) {
         MineNote mineNote = (MineNote)iterator.next();
         if (DateUtil.checkTime((long)mineNote.createTime * 1000L, 2)) {
            iterator.remove();
         }
      }

   }
}
