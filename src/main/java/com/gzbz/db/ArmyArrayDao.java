package com.gzbz.db;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.gzbz.db.bean.ArmyArrayData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_army_array",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ArmyArrayDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "已解锁的格子",
      loadFun = "loadArrayIds",
      saveFun = "saveArrayIds"
   )
   public Set<Integer> gridSet = new HashSet();
   @DBColumnAnno(
      comment = "军阵数据",
      columnType = "TEXT",
      loadFun = "loadArrayDataList",
      saveFun = "saveArrayDataList"
   )
   public Map<Integer, ArmyArrayData> arrayDataMap = new HashMap();
   @DBColumnAnno(
      comment = "显示的格子数"
   )
   public int showGridNum;

   public void loadArrayIds(String string) {
      List<String> list = Splitter.on("|").splitToList(string);
      list.forEach((value) -> this.gridSet.add(Integer.parseInt(value)));
   }

   public String saveArrayIds() {
      return Joiner.on("|").join(this.gridSet);
   }

   public void loadArrayDataList(String string) {
      if (!StringUtils.isEmpty(string)) {
         for(String str : Splitter.on("|").splitToList(string)) {
            if (!"".equals(str)) {
               ArmyArrayData armyArrayData = new ArmyArrayData();
               armyArrayData.decode(str);
               this.arrayDataMap.put(armyArrayData.grid, armyArrayData);
            }
         }

      }
   }

   public String saveArrayDataList() {
      if (this.arrayDataMap.size() == 0) {
         return "";
      } else {
         StringBuilder stringBuilder = new StringBuilder();

         for(Map.Entry<Integer, ArmyArrayData> entry : this.arrayDataMap.entrySet()) {
            stringBuilder.append(((ArmyArrayData)entry.getValue()).encode());
            stringBuilder.append("|");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         return stringBuilder.toString();
      }
   }
}
