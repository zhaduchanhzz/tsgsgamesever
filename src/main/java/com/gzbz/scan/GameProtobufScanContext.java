package com.gzbz.scan;

import com.gzbz.chatServer.ChatServerDecodeUDPHandler;
import javax.annotation.PostConstruct;
import net.BinaryWebSocketFrameDecode;
import net.BinaryWebSocketFrameEncode;
import net.CrossWebSocketFrameDecode;
import net.CrossWebSocketFrameEncode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import scan.ProtobufScanContext;
import udp.UDPSocketFrameEncode;

@Component
public class GameProtobufScanContext extends ProtobufScanContext {
   static Logger logger = LoggerFactory.getLogger(GameProtobufScanContext.class);
   @Value("${protobuf.packageName}")
   private String packageName;
   @Value("${protobuf.split}")
   private String split;

   public String getPackageName() {
      return this.packageName;
   }

   public String getSplit() {
      return this.split;
   }

   @PostConstruct
   public void start() {
      super.start();
      CrossWebSocketFrameDecode.protoCtx = this;
      CrossWebSocketFrameEncode.protoCtx = this;
      BinaryWebSocketFrameEncode.protoCtx = this;
      BinaryWebSocketFrameDecode.protoCtx = this;
      UDPSocketFrameEncode.protoCtx = this;
      ChatServerDecodeUDPHandler.protoCtx = this;
   }
}
