package com.gzbz.db;

import db.DBColumnAnno;

public class RoleNameMapDao {
   @DBColumnAnno(
      isPrimary = true,
      columnName = "idrole_name_map",
      len = 20,
      isAutoInc = true
   )
   public long idRoleNameMap;
   @DBColumnAnno(
      len = 11,
      columnName = "db_index",
      isNotNull = true
   )
   public int dbIndex;
   @DBColumnAnno(
      len = 11,
      columnName = "role_id",
      isNotNull = true,
      index = 0,
      indexName = {"role_id_index"}
   )
   public int roleId;
   @DBColumnAnno(
      len = 32,
      columnType = "VARBINARY",
      columnName = "role_name",
      isNotNull = true,
      index = 0,
      indexName = {"role_name_index"}
   )
   public byte[] roleName;
   @DBColumnAnno(
      len = 64,
      columnType = "VARBINARY",
      columnName = "plat_user_name",
      isNotNull = true
   )
   public byte[] platUserName;
}
