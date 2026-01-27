package com.gzbz.net;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.stream.ChunkedWriteHandler;
import net.CrossWebSocketFrameDecode;
import net.CrossWebSocketFrameEncode;

public class CrossClientInitializer extends ChannelInitializer<SocketChannel> {
   protected void initChannel(SocketChannel socketChannel) throws Exception {
      ChannelPipeline pipeline = socketChannel.pipeline();
      pipeline.addLast(new ChannelHandler[]{new HttpClientCodec()});
      pipeline.addLast(new ChannelHandler[]{new ChunkedWriteHandler()});
      pipeline.addLast(new ChannelHandler[]{new HttpObjectAggregator(1073741824)});
      pipeline.addLast(new ChannelHandler[]{new CrossWebSocketFrameEncode()});
      pipeline.addLast(new ChannelHandler[]{new CrossWebSocketFrameDecode()});
      pipeline.addLast("hookedHandler", new CrossClientHandler());
   }
}
