package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_exclusive_weapon",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ExclusiveWeaponDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "已解锁得预告id",
      columnName = "unlockNoticeIds",
      columnType = "TEXT",
      loadFun = "loadUnlockNoticeIds",
      saveFun = "saveUnlockNoticeIds"
   )
   public Set<Integer> unlockNoticeIds = new HashSet();
   @DBColumnAnno(
      comment = "历史上获得过的幻武及最高的幻武星级",
      columnType = "LONGTEXT",
      loadFun = "loadHistoryWeaponIdStar",
      saveFun = "saveHistoryWeaponIdStar"
   )
   public Map<Integer, Integer> historyWeaponIdStar = new HashMap();
   @DBColumnAnno(
      comment = "专属幻武已解锁图鉴",
      columnType = "LONGTEXT",
      loadFun = "loadWeaponLib",
      saveFun = "saveWeaponLib"
   )
   public Map<Integer, Integer> weaponLib = new HashMap();
   @DBColumnAnno(
      comment = "强化升级任意幻武次数"
   )
   public int strongCount = 0;

   public void loadUnlockNoticeIds(String data) {
      this.unlockNoticeIds = DataUtils.stringToIntSet(data);
   }

   public String saveUnlockNoticeIds() {
      return DataUtils.intSetToString(this.unlockNoticeIds);
   }

   public void loadHistoryWeaponIdStar(String data) {
      this.historyWeaponIdStar = DataUtils.stringToInt_intMap(data);
   }

   public String saveHistoryWeaponIdStar() {
      return DataUtils.int_intMapToString(this.historyWeaponIdStar);
   }

   public void loadWeaponLib(String data) {
      this.weaponLib = DataUtils.stringToInt_intMap(data);
   }

   public String saveWeaponLib() {
      return DataUtils.int_intMapToString(this.weaponLib);
   }
}
