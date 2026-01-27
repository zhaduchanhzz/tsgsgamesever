package com.gzbz.worldMgr;

import com.gzbz.db.GameDBPool;
import com.gzbz.db.PlayerDao;
import db.DBTableNode;
import db.ParsingResult;
import java.sql.ResultSet;
import java.util.HashMap;

class RobotParsingResult implements ParsingResult {
   public HashMap<Integer, PlayerDao> resultMap = new HashMap();
   public GameDBPool gameDBPool;
   public DBTableNode dbTableNode;

   public void parsing(ResultSet resultSet) {
      try {
         while(resultSet.next()) {
            PlayerDao playerDao = (PlayerDao)this.gameDBPool.parseResult(resultSet, this.dbTableNode);
            this.resultMap.put(playerDao.playerId, playerDao);
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

   }
}
