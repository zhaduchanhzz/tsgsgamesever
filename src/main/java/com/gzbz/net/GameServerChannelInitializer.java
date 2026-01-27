package com.gzbz.net;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.ssl.SslHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import javax.annotation.PostConstruct;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import net.BinaryWebSocketFrameEncode;
import net.ServerChannelInitializer;
import net.ServerHandler;
import net.SslUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class GameServerChannelInitializer extends ServerChannelInitializer {
   @Autowired
   private ConfigurableApplicationContext context;
   @Value("${keyStore}")
   private String keyStore;
   @Value("${passWord}")
   private String password;
   private SSLContext sslContext;

   public ServerHandler getCustomHandler() {
      return (ServerHandler)this.context.getBean(GameServerHandler.class);
   }

   @PostConstruct
   public void init() {
      if (!StringUtils.isEmpty(this.keyStore)) {
         this.sslContext = SslUtil.createSSLContext(this.password, this.keyStore);
      }

   }

   protected void initChannel(final SocketChannel ch) {
      SSLEngine engine = null;
      if (this.sslContext != null) {
         engine = this.sslContext.createSSLEngine();
         engine.setUseClientMode(false);
         engine.setNeedClientAuth(false);
      }

      ChannelPipeline pipeline = ch.pipeline();
      if (engine != null) {
         SslHandler sslHandler = new SslHandler(engine);
         pipeline.addFirst(new ChannelHandler[]{sslHandler});
      }

      pipeline.addLast(new ChannelHandler[]{new HttpServerCodec()});
      pipeline.addLast(new ChannelHandler[]{new ChunkedWriteHandler()});
      pipeline.addLast(new ChannelHandler[]{new HttpObjectAggregator(1073741824)});
      pipeline.addLast(new ChannelHandler[]{new WebSocketServerProtocolHandler("/ws", (String)null, true, 1048576)});
      pipeline.addLast(new ChannelHandler[]{new GameBinaryWebSocketFrameDecode()});
      pipeline.addLast(new ChannelHandler[]{new BinaryWebSocketFrameEncode()});
      pipeline.addLast(new ChannelHandler[]{this.getCustomHandler()});
   }
}
