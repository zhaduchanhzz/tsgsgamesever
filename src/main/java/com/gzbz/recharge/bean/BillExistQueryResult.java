package com.gzbz.recharge.bean;

import db.ParsingResult;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BillExistQueryResult implements ParsingResult {
   public boolean isExist = true;

   public void parsing(ResultSet resultSet) {
      try {
         if (resultSet.next()) {
            this.isExist = resultSet.getInt("billCount") > 0;
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }

   }
}
