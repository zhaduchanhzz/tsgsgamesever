package com.gzbz.util;

import ip.IPSeeker;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IPSeekerUtils extends IPSeeker {
   @Value("${ipPath}")
   private String path;

   public String getPath() {
      return this.path;
   }

   @PostConstruct
   public void init() {
      if (this.path != null) {
         super.init();
      }
   }
}
