package com.gzbz.model.manager;

import java.io.Serializable;

public class BaseModel implements Serializable {
   private final boolean initLoad = null != null;

   public void checkModify() {
      if (this.initLoad) {
         throw new RuntimeException("禁止修改配置资源缓存");
      }
   }

   public void reloadTaskTrigger() {
   }
}
