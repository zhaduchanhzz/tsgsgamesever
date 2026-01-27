package com.gzbz.http;

import com.gzbz.net.CrossNettyClient;
import com.gzbz.spring.ApplicationContextProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/center"})
public class CenterController {
   @GetMapping({"/crossInfo"})
   public String crossServerInfo(int id, int groupId, String ip, int port) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.pushTaskEx("crossServerInfo", new Object[]{id, groupId, ip, port});
      return "success";
   }

   @GetMapping({"/confirmCrossInfo"})
   public String confirmCrossInfo(int id, int groupId, String ip, int port) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.pushTaskEx("confirmCenterNewGroup", new Object[]{id, groupId, ip, port});
      return "success";
   }
}
