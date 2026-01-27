package com.gzbz.udp;

import com.gzbz.spring.ApplicationContextProvider;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.AttributeKey;
import java.net.InetSocketAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import udp.DBReceiveFrame;

@Component
public class DBClientHandler extends SimpleChannelInboundHandler<DatagramPacket> {
   static Logger logger = LoggerFactory.getLogger(DBClientHandler.class);
   @Autowired
   private DBMsgReceiveList receiveList;

   public void channelActive(ChannelHandlerContext ctx) throws Exception {
      try {
         DBNettyClient dbNettyClient = (DBNettyClient)ApplicationContextProvider.getContext().getBean(DBNettyClient.class);
         ctx.channel().attr(AttributeKey.valueOf("time")).set(System.currentTimeMillis());
         dbNettyClient.pushTaskEx("channelActive", new Object[]{ctx});
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
      logger.info("连接发生错误！！！");
      cause.printStackTrace();
   }

   public void channelInactive(ChannelHandlerContext ctx) throws Exception {
      DBNettyClient dbNettyClient = (DBNettyClient)ApplicationContextProvider.getContext().getBean(DBNettyClient.class);
      dbNettyClient.pushTaskEx("channelInactive", new Object[]{ctx});
   }

   protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket datagramPacket) throws Exception {
      ByteBuf byteBuf = (ByteBuf)datagramPacket.content();
      DBReceiveFrame frame = new DBReceiveFrame();
      frame.prefix_GlobalCode = byteBuf.readLong();
      frame.suffix_GlobalCode = byteBuf.readLong();
      frame.cmd = byteBuf.readInt();
      frame.curFrame = byteBuf.readInt();
      frame.sender = (InetSocketAddress)datagramPacket.sender();
      switch (frame.cmd) {
         case 0:
            this.receiveList.ack(ctx, frame, byteBuf);
            return;
         case 1:
            this.receiveList.ask(ctx, frame, byteBuf);
            return;
         default:
            frame.totalFrame = byteBuf.readInt();
            frame.type = byteBuf.readByte();
            frame.serverId = byteBuf.readInt();
            frame.sourceId = byteBuf.readInt();
            frame.mgrId = byteBuf.readInt();
            int platformNameLen = byteBuf.readInt();
            frame.totalLen = byteBuf.readInt();
            frame.frameLen = byteBuf.readInt();
            byte[] platformNameBytes = new byte[platformNameLen];
            byteBuf.readBytes(platformNameBytes);
            frame.param1 = byteBuf.readInt();
            frame.param2 = byteBuf.readInt();

            try {
               frame.platform = new String(platformNameBytes, "UTF-8");
            } catch (Exception e) {
               e.printStackTrace();
            }

            this.receiveList.receive(ctx, frame, byteBuf);
      }
   }
}
