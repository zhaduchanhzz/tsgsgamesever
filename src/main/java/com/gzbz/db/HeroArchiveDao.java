package com.gzbz.db;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_dictionary_hero",
   resultType = 0,
   selectKey = {"playerId"}
)
public class HeroArchiveDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadFunc",
      saveFun = "saveFunc"
   )
   public HashMap<Integer, Byte> mapHero = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadAideFunc",
      saveFun = "saveAideFunc",
      comment = "拥有过的副将"
   )
   public Set<Integer> heroAides = new HashSet();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadMagicFunc",
      saveFun = "saveMagicFunc",
      comment = "拥有过的奇谋"
   )
   public Set<Integer> magics = new HashSet();

   public void loadFunc(String data) {
      if (!StringUtils.isEmpty(data)) {
         Map<String, String> map = Splitter.on("|").withKeyValueSeparator("_").split(data);
         map.forEach((key, value) -> {
            Byte var10000 = (Byte)this.mapHero.put(Integer.parseInt(key), Byte.parseByte(value));
         });
      }
   }

   public String saveFunc() {
      return Joiner.on("|").withKeyValueSeparator("_").join(this.mapHero);
   }

   public void loadAideFunc(String data) {
      Splitter.on(",").splitToList(data).forEach((str) -> this.heroAides.add(Integer.parseInt(str)));
   }

   public String saveAideFunc() {
      return Joiner.on(",").join(this.heroAides);
   }

   public void loadMagicFunc(String data) {
      Splitter.on(",").splitToList(data).forEach((str) -> this.magics.add(Integer.parseInt(str)));
   }

   public String saveMagicFunc() {
      return Joiner.on(",").join(this.magics);
   }
}
