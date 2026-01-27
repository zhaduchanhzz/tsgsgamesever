package com.gzbz.net;

import io.netty.channel.ChannelInitializer;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import net.BinaryWebSocketFrameDecode;
import net.BinaryWebSocketFrameEncode;
import net.NettyServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import scan.ProtobufScanContext;

@Component
public class GameServerNetty extends NettyServer {
   @Value("${NettyPort}")
   private int port;
   @Autowired
   private ConfigurableApplicationContext context;

   public void bindListener() {
      logger.info("游戏服已开启监听");
   }

   public int getPort() {
      return this.port;
   }

   public ChannelInitializer getChannelInitializer() {
      return (ChannelInitializer)this.context.getBean(GameServerChannelInitializer.class);
   }

   @PostConstruct
   public void bind() {
      BinaryWebSocketFrameDecode.protoCtx = (ProtobufScanContext)this.context.getBean("gameProtobufScanContext");
      BinaryWebSocketFrameEncode.protoCtx = (ProtobufScanContext)this.context.getBean("gameProtobufScanContext");
      super.bind();
   }

   @PreDestroy
   public void close() {
      super.close();
   }
}
