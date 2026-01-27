package com.gzbz.chatServer;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import chatServer.ChatUdpMsg;
import chatServer.LoginUdpMsg;
import chatServer.TransmitUdpMsg;
import chatServer.UdpMsg;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.scan.GameProtobufScanContext;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.FixedRecvByteBufAllocator;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import misc.BitMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@MgrAnno
public class ChatServerClient extends GameMgr {
   public static Logger logger = LoggerFactory.getLogger(ChatServerClient.class);
   public int GAME_SERVER_ID;
   public String PLATFORM_NAME;
   private int chatPort;
   private String chatIp;
   @Autowired
   public GameProtobufScanContext protoScanContext;
   private Channel channel;
   private EventLoopGroup eventLoopGroup;
   private long heartStart = -1L;
   private ScheduledFuture sf;
   private static long HEART_TIME = 120000L;
   @Autowired
   private ChatServerInitializer initializer;

   protected void init() throws Exception {
   }

   public void startConnect() {
      if (!this.checkConnect()) {
         this.connect();
         if (this.sf != null) {
            this.sf.cancel(true);
         }

         this.sf = this.schedule(3000L, HEART_TIME, () -> {
            if (this.channel != null) {
               long curTime = System.currentTimeMillis();
               if (this.heartStart != -1L && curTime - this.heartStart > HEART_TIME + 5000L) {
                  logger.error("聊天服心跳超时");
               }

               LoginUdpMsg msg = this.sendLoginMsg();
               msg.type = 1;
               this.sendMsg(msg);
            }
         });
      }
   }

   public boolean checkConnect() {
      return Objects.isNull(this.channel) ? false : this.channel.isActive();
   }

   public void connect() {
      if (StringUtils.isEmpty(this.chatIp)) {
         logger.info("无dbIp,无法连接聊天服!!!!");
      } else if (this.chatPort <= 0) {
         logger.info("无dbPort,无法连接聊天服!!!!");
      } else {
         logger.info("开始连接聊天服:{}:{}", this.chatIp, this.chatPort);
         if (!Objects.nonNull(this.eventLoopGroup)) {
            this.eventLoopGroup = new NioEventLoopGroup();
            Bootstrap clientBoot = new Bootstrap();
            ((Bootstrap)clientBoot.group(this.eventLoopGroup)).handler(new LoggingHandler(LogLevel.INFO));
            clientBoot.option(ChannelOption.SO_RCVBUF, 33554432);
            clientBoot.option(ChannelOption.SO_SNDBUF, 33554432);
            clientBoot.option(ChannelOption.RCVBUF_ALLOCATOR, new FixedRecvByteBufAllocator(65535));
            clientBoot.channel(NioDatagramChannel.class);
            clientBoot.handler(this.initializer);

            try {
               clientBoot.connect(this.chatIp, this.chatPort).sync().await();
            } catch (Exception e) {
               e.printStackTrace();
            }

         }
      }
   }

   @TaskMethod
   public void channelActive(ChannelHandlerContext ctx) {
      try {
         if (ctx.channel() == null) {
            return;
         }

         if (ctx.channel().remoteAddress() == null) {
            if (this.channel != null) {
               this.channel.close();
               this.channel = null;
            }

            return;
         }

         logger.info("连接到聊天服:{}", ctx.channel().remoteAddress());
         this.channel = ctx.channel();
         LoginUdpMsg msg = this.sendLoginMsg();
         msg.type = 0;
         this.sendMsg(msg);
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   private LoginUdpMsg sendLoginMsg() {
      LoginUdpMsg loginUdpMsg = new LoginUdpMsg();
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      loginUdpMsg.platformId = BitMap.stringToAscii(this.PLATFORM_NAME);
      loginUdpMsg.serverId = this.GAME_SERVER_ID;
      loginUdpMsg.type = 0;

      for(int serverId : worldMgr.getServersSet()) {
         if (serverId != worldMgr.GAME_SERVER_ID) {
            loginUdpMsg.slaveIds.add(serverId);
         }
      }

      return loginUdpMsg;
   }

   @TaskMethod
   public void login(LoginUdpMsg msg, Channel channel) {
      if (msg.type == 0) {
         this.channel = channel;
         logger.info("登陆聊天服成功:{}", channel.remoteAddress());
      } else {
         this.heartStart = System.currentTimeMillis();
      }

   }

   @TaskMethod
   public void channelInactive(ChannelHandlerContext ctx) {
      logger.info("聊天服链接断开");
      this.channel = null;
   }

   public void sendMsg(UdpMsg udpMsg) {
      if (this.channel != null && this.channel.isActive()) {
         this.channel.writeAndFlush(udpMsg);
      } else {
         logger.info("未连接聊天服");
      }
   }

   public void sendChatMgr(byte channel, GeneratedMessageV3 msg) {
      ChatUdpMsg chatUdpMsg = new ChatUdpMsg();
      chatUdpMsg.serverId = this.GAME_SERVER_ID;
      chatUdpMsg.channel = channel;
      chatUdpMsg.platformId = BitMap.stringToAscii(this.PLATFORM_NAME);
      chatUdpMsg.proto = msg.toByteArray();
      this.sendMsg(chatUdpMsg);
   }

   public void send2Server(int destServer, int destMgr, GeneratedMessageV3 msg) {
      Integer cmd = (Integer)this.protoScanContext.proto2Cmd.get(msg.getClass());
      if (cmd == null) {
         logger.info("无法找到:{},对应的消息码", msg.getClass().getSimpleName());
      } else {
         TransmitUdpMsg transmitUdpMsg = new TransmitUdpMsg();
         transmitUdpMsg.serverId = this.GAME_SERVER_ID;
         transmitUdpMsg.platformId = BitMap.stringToAscii(this.PLATFORM_NAME);
         transmitUdpMsg.destPlatformId = (int)transmitUdpMsg.platformId;
         transmitUdpMsg.destServerId = destServer;
         transmitUdpMsg.destMgrId = destMgr;
         transmitUdpMsg.protoCmd = cmd;
         transmitUdpMsg.proto = msg.toByteArray();
         transmitUdpMsg.route = 0;
         this.sendMsg(transmitUdpMsg);
      }
   }

   public void send2Client(int destServer, int destMgr, GeneratedMessageV3 msg) {
      Integer cmd = (Integer)this.protoScanContext.proto2Cmd.get(msg.getClass());
      if (cmd == null) {
         logger.info("无法找到:{},对应的消息码", msg.getClass().getSimpleName());
      } else {
         TransmitUdpMsg transmitUdpMsg = new TransmitUdpMsg();
         transmitUdpMsg.serverId = this.GAME_SERVER_ID;
         transmitUdpMsg.platformId = BitMap.stringToAscii(this.PLATFORM_NAME);
         transmitUdpMsg.destPlatformId = (int)transmitUdpMsg.platformId;
         transmitUdpMsg.destServerId = destServer;
         transmitUdpMsg.destMgrId = destMgr;
         transmitUdpMsg.protoCmd = cmd;
         transmitUdpMsg.route = 1;
         transmitUdpMsg.proto = msg.toByteArray();
         this.sendMsg(transmitUdpMsg);
      }
   }
}
