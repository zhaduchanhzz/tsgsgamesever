package com.gzbz.udp;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.nio.NioDatagramChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import udp.UDPSocketFrameEncode;

@Component
public class DBClientInitializer extends ChannelInitializer<NioDatagramChannel> {
   @Autowired
   private DBClientHandler dbClientHandler;

   protected void initChannel(NioDatagramChannel datagramChannel) throws Exception {
      ChannelPipeline pipeline = datagramChannel.pipeline();
      pipeline.addLast(new ChannelHandler[]{new UDPSocketFrameEncode()});
      pipeline.addLast(new ChannelHandler[]{this.dbClientHandler});
   }
}
