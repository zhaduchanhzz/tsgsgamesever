package com.gzbz.chatServer;

import com.gzbz.spring.ApplicationContextProvider;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.nio.NioDatagramChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ChatServerInitializer extends ChannelInitializer<NioDatagramChannel> {
   static Logger logger = LoggerFactory.getLogger(ChatServerInitializer.class);

   protected void initChannel(NioDatagramChannel nioDatagramChannel) throws Exception {
      ChannelPipeline pipeline = nioDatagramChannel.pipeline();
      ChatServerDecodeUDPHandler decodeUDPHandler = (ChatServerDecodeUDPHandler)ApplicationContextProvider.getContext().getBean(ChatServerDecodeUDPHandler.class);
      ChatServerEncodeUDPHandler encodeUDPHandler = (ChatServerEncodeUDPHandler)ApplicationContextProvider.getContext().getBean(ChatServerEncodeUDPHandler.class);
      pipeline.addLast(new ChannelHandler[]{decodeUDPHandler});
      pipeline.addLast(new ChannelHandler[]{encodeUDPHandler});
   }

   public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
      logger.info("聊天服连接发生错误！！！");
      super.exceptionCaught(ctx, cause);
   }
}
