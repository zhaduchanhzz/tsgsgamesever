package com.gzbz.db.parseResult;

import db.ParsingResult;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IntQueryResult implements ParsingResult {
   private String columnName;
   private Integer value = null;
   private Exception exception;

   public void parsing(ResultSet resultSet) {
      try {
         if (resultSet.next()) {
            this.value = resultSet.getInt(this.columnName);
         }
      } catch (SQLException e) {
         this.exception = e;
      }

   }

   public Exception getException() {
      return this.exception;
   }

   public Integer getValue() {
      return this.value;
   }

   public String getColumnName() {
      return this.columnName;
   }

   public void setColumnName(String columnName) {
      this.columnName = columnName;
   }

   public IntQueryResult(String columnName) {
      this.columnName = columnName;
   }
}
