package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "YuanDanFireWorkDetail"
)
public class YuanDanFireWorkDetailModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "openTime",
      comment = "开启时间"
   )
   private String openTime;
   @ModelColumnAnno(
      columnName = "FireWorkThemeType",
      comment = "烟花主题类型"
   )
   private int fireWorkThemeType;
   @ModelColumnAnno(
      columnName = "ChatWish",
      comment = "聊天祝福"
   )
   private String chatWish;

   public String getChatWish() {
      return this.chatWish;
   }

   public int getId() {
      return this.id;
   }

   public String getOpenTime() {
      return this.openTime;
   }

   public int getFireWorkThemeType() {
      return this.fireWorkThemeType;
   }
}
