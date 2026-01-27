package com.gzbz.http;

import com.google.protobuf.GeneratedMessageV3;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SocialController {
   @PostMapping(
      value = {"/social/playerInfo"},
      produces = {"application/x-protobuf"}
   )
   public GeneratedMessageV3 playerInfo() {
      return null;
   }
}
