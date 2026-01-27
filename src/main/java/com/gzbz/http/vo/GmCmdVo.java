package com.gzbz.http.vo;

import java.util.ArrayList;
import java.util.List;

public class GmCmdVo {
   private String cmd;
   private List<String> params = new ArrayList();

   public String getCmd() {
      return this.cmd;
   }

   public void setCmd(String cmd) {
      this.cmd = cmd;
   }

   public List<String> getParams() {
      return this.params;
   }

   public void setParams(List<String> params) {
      this.params = params;
   }
}
