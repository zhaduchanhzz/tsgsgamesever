package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "wankaLevel"
)
public class WanKaLevelModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "特权等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "特权备注"
   )
   private String mark;
   @ModelColumnAnno(
      comment = "需求咖值"
   )
   private int need;
   @ModelColumnAnno(
      comment = "特权标识"
   )
   private String icon;
   @ModelColumnAnno(
      comment = "过期标识"
   )
   private String icon1;
   @ModelColumnAnno(
      comment = "等级礼包道具id(用于解锁 头像框,称号,特权标识等)"
   )
   private int lvBoxItemId;
   @ModelColumnAnno(
      comment = "头像框"
   )
   private int headFrame;
   @ModelColumnAnno(
      comment = "称号道具id"
   )
   private int prestige;
   @ModelColumnAnno(
      comment = "qq特权标识"
   )
   private int logo;

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public String getMark() {
      return this.mark;
   }

   public void setMark(String mark) {
      this.checkModify();
      this.mark = mark;
   }

   public int getNeed() {
      return this.need;
   }

   public void setNeed(int need) {
      this.checkModify();
      this.need = need;
   }

   public String getIcon() {
      return this.icon;
   }

   public void setIcon(String icon) {
      this.checkModify();
      this.icon = icon;
   }

   public String getIcon1() {
      return this.icon1;
   }

   public void setIcon1(String icon1) {
      this.checkModify();
      this.icon1 = icon1;
   }

   public int getLvBoxItemId() {
      return this.lvBoxItemId;
   }

   public void setLvBoxItemId(int lvBoxItemId) {
      this.checkModify();
      this.lvBoxItemId = lvBoxItemId;
   }

   public int getHeadFrame() {
      return this.headFrame;
   }

   public void setHeadFrame(int headFrame) {
      this.checkModify();
      this.headFrame = headFrame;
   }

   public int getPrestige() {
      return this.prestige;
   }

   public void setPrestige(int prestige) {
      this.checkModify();
      this.prestige = prestige;
   }

   public int getLogo() {
      return this.logo;
   }

   public void setLogo(int logo) {
      this.checkModify();
      this.logo = logo;
   }
}
