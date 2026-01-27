package com.gzbz.chatServer;

import chatServer.UdpMsg;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ChatServerEncodeUDPHandler extends MessageToMessageEncoder<UdpMsg> {
   protected void encode(ChannelHandlerContext channelHandlerContext, UdpMsg chatMsg, List<Object> list) throws Exception {
      ByteBuf byteBuf = channelHandlerContext.alloc().buffer(chatMsg.getLen());
      chatMsg.encode(byteBuf);
      list.add(byteBuf);
   }
}
