package com.gzbz.db;

import com.gzbz.db.bean.DragonSoulData;
import com.gzbz.dragonVein.DragonVeinDefine;
import com.gzbz.model.DragonVeinLevelModel;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.DataUtils;
import misc.JsonUtil;
import org.apache.commons.lang3.StringUtils;

@DBTableAnno(
   name = "tb_dragon_vein",
   resultType = 0,
   selectKey = {"playerId"}
)
public class DragonVeinDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "上阵的精魂,key:位置",
      columnType = "TEXT",
      saveFun = "savePosSoul",
      loadFun = "loadPosSoul"
   )
   public Map<Integer, DragonSoulData> posSoul = new HashMap();
   @DBColumnAnno(
      comment = "当前拥有的豪杰卡,key:code",
      columnType = "TEXT",
      saveFun = "saveHasSoul",
      loadFun = "loadHasSoul"
   )
   public Map<Integer, DragonSoulData> bagSoul = new HashMap();
   @DBColumnAnno(
      comment = "龙脉等级"
   )
   public int dragonVeinLv = 1;
   @DBColumnAnno(
      comment = "龙脉经验"
   )
   private int dragonVeinExp;
   @DBColumnAnno(
      comment = "龙魂值"
   )
   public int dragonSoulVal = 1;
   @DBColumnAnno(
      comment = "自动抽奖选项",
      columnType = "TEXT",
      columnName = "option",
      loadFun = "loadOption",
      saveFun = "saveOption"
   )
   public Map<Integer, Integer> option = new HashMap();
   @DBColumnAnno(
      comment = "激发龙脉次数"
   )
   public long drawNum;

   public int getDragonVeinExp() {
      return this.dragonVeinExp;
   }

   public void setDragonVeinExp(int dragonVeinExp) {
      this.dragonVeinExp = dragonVeinExp;
   }

   public void addVeinExp(int exp) {
      DragonVeinLevelModel nextLvModel = DragonVeinDefine.getVeinLevelModel(this.dragonVeinLv + 1);
      int dragonVeinMaxExp = DragonVeinDefine.getDragonVeinMaxExp();
      if (null != nextLvModel || this.dragonVeinExp < dragonVeinMaxExp) {
         this.dragonVeinExp += exp;

         while(true) {
            nextLvModel = DragonVeinDefine.getVeinLevelModel(this.dragonVeinLv + 1);
            if (nextLvModel == null) {
               break;
            }

            DragonVeinLevelModel curLvModel = DragonVeinDefine.getVeinLevelModel(this.dragonVeinLv);
            if (curLvModel.getExp() <= 0 || this.dragonVeinExp < curLvModel.getExp()) {
               break;
            }

            ++this.dragonVeinLv;
            this.dragonVeinExp -= curLvModel.getExp();
         }

         this.updateOp();
      }
   }

   public String savePosSoul() {
      return this.posSoul.isEmpty() ? "" : JsonUtil.beanToJson(this.posSoul);
   }

   public void loadPosSoul(String data) {
      if (!StringUtils.isEmpty(data)) {
         this.posSoul = JsonUtil.jsonToMap(data, Integer.class, DragonSoulData.class);
      }
   }

   public String saveHasSoul() {
      return this.bagSoul.isEmpty() ? "" : JsonUtil.beanToJson(this.bagSoul);
   }

   public void loadHasSoul(String data) {
      if (!StringUtils.isEmpty(data)) {
         this.bagSoul = JsonUtil.jsonToMap(data, Integer.class, DragonSoulData.class);
      }
   }

   public void loadOption(String data) {
      this.option = DataUtils.stringToInt_intMap(data);
   }

   public String saveOption() {
      return DataUtils.int_intMapToString(this.option);
   }
}
