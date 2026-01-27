package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "countryWarMap"
)
public class CountryWarMapModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "mapId",
      isPrimaty = true,
      comment = "地图ID"
   )
   private int mapId;
   @ModelColumnAnno(
      columnName = "mapName",
      comment = "地图名称"
   )
   private String mapName;
   @ModelColumnAnno(
      columnName = "shopLimitId",
      comment = "地图对应礼包ID"
   )
   private int shopLimitId;
   @ModelColumnAnno(
      columnName = "warFlagReward",
      comment = "战旗任务奖励ID"
   )
   private int warFlagReward;
   @ModelColumnAnno(
      columnName = "privilegeId",
      comment = "特权礼包ID"
   )
   private int privilegeId;

   public int getMapId() {
      return this.mapId;
   }

   public void setMapId(int mapId) {
      this.checkModify();
      this.mapId = mapId;
   }

   public String getMapName() {
      return this.mapName;
   }

   public void setMapName(String mapName) {
      this.checkModify();
      this.mapName = mapName;
   }

   public int getShopLimitId() {
      return this.shopLimitId;
   }

   public void setShopLimitId(int shopLimitId) {
      this.checkModify();
      this.shopLimitId = shopLimitId;
   }

   public int getWarFlagReward() {
      return this.warFlagReward;
   }

   public void setWarFlagReward(int warFlagReward) {
      this.checkModify();
      this.warFlagReward = warFlagReward;
   }

   public int getPrivilegeId() {
      return this.privilegeId;
   }

   public void setPrivilegeId(int privilegeId) {
      this.checkModify();
      this.privilegeId = privilegeId;
   }
}
