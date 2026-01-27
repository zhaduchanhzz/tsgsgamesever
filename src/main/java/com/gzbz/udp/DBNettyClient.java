package com.gzbz.udp;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.github.luben.zstd.Zstd;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.protobuf.DBServerMsg;
import com.gzbz.scan.GameProtobufScanContext;
import com.gzbz.spring.ApplicationRunnerImpl;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import java.net.InetSocketAddress;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import udp.DBSubscribeMsg;

@Component
@MgrAnno
public class DBNettyClient extends GameMgr {
   static Logger logger = LoggerFactory.getLogger(DBNettyClient.class);
   @Value("${ServerId}")
   public int GAME_SERVER_ID;
   @Value("${PlatformName}")
   public String PLATFORM_NAME;
   @Autowired
   public GameProtobufScanContext protoScanContext;
   @Autowired
   private Environment env;
   @Autowired
   private DBMsgSendList sendList;
   @Autowired
   private DBClientInitializer initializer;
   private ScheduledFuture<?> sf;
   private Channel channel;
   private EventLoopGroup eventLoopGroup;
   private String dbIp = "";
   private int dbPort = 0;

   protected void init() throws Exception {
      if (ApplicationRunnerImpl.mgrName != null || ApplicationRunnerImpl.mgrMethod != null) {
         if (this.env.containsProperty("dbNettyIp")) {
            this.dbIp = this.env.getProperty("dbNettyIp");
         }

         if (this.env.containsProperty("dbNettyPort") && !StringUtils.isEmpty(this.env.getProperty("dbNettyPort"))) {
            this.dbPort = Integer.parseInt((String)Objects.requireNonNull(this.env.getProperty("dbNettyPort")));
         }

         this.startConnect();
      }
   }

   public void startConnect() {
      if (!this.checkConnect()) {
         this.connect();
      }
   }

   public boolean checkConnect() {
      return Objects.isNull(this.channel) ? false : this.channel.isActive();
   }

   public void connect() {
      if (StringUtils.isEmpty(this.dbIp)) {
         logger.info("无dbIp,无法连接数据服!!!!");
      } else if (this.dbPort <= 0) {
         logger.info("无dbPort,无法连接数据服!!!!");
      } else {
         logger.info("开始连接数据服:{}:{}", this.dbIp, this.dbPort);
         if (!Objects.nonNull(this.eventLoopGroup)) {
            this.eventLoopGroup = new NioEventLoopGroup();
            Bootstrap clientBoot = new Bootstrap();
            ((Bootstrap)clientBoot.group(this.eventLoopGroup)).handler(new LoggingHandler(LogLevel.INFO));
            clientBoot.option(ChannelOption.SO_RCVBUF, 12582912);
            clientBoot.option(ChannelOption.SO_SNDBUF, 12582912);
            clientBoot.channel(NioDatagramChannel.class);
            clientBoot.handler(this.initializer);

            try {
               clientBoot.connect(this.dbIp, this.dbPort);
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

         logger.info("连接到数据服:{}", ctx.channel().remoteAddress());
         this.channel = ctx.channel();
         this.sendMsg(DBServerMsg.S2DB_Login_14501.newBuilder().build());
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   @TaskMethod
   public void channelInactive(ChannelHandlerContext ctx) {
      logger.info("数据服链接断开");
      this.channel = null;
   }

   public boolean canSend(GeneratedMessageV3 proto) {
      if (!this.checkConnect()) {
         logger.info("未连接到数据服，无法发送消息:" + proto.toString());
         return false;
      } else {
         return true;
      }
   }

   public void sendMsg(GeneratedMessageV3 proto) {
      this.sendMsg(proto, 0);
   }

   public void sendMsg(GeneratedMessageV3 proto, int playerId) {
      if (this.channel == null) {
         logger.info("当前未连接到数据服!!!!,{}：消息未发送", proto.getClass().getSimpleName());
      } else {
         DBSubscribeMsg msg = new DBSubscribeMsg();
         msg.proto = proto;
         msg.cmd = (Integer)this.protoScanContext.proto2Cmd.get(proto.getClass());
         if (msg.cmd == 6102) {
            (new Exception("6102的消息请走sendBattleMsg这个方法")).printStackTrace();
         } else {
            msg.serverId = this.GAME_SERVER_ID;
            msg.platform = this.PLATFORM_NAME;
            msg.mgrId = playerId;
            msg.type = 1;
            msg.stream = proto.toByteArray();
            msg.channel = this.channel;
            msg.sender = (InetSocketAddress)this.channel.remoteAddress();
            this.sendList.addSendMsg(msg);
         }
      }
   }

   public void sendBattleMsg(GeneratedMessageV3 proto, int serverId, int id, int time) {
      if (this.channel == null) {
         logger.error("未连接数据服，请尽快连接！！！！");
      } else {
         DBSubscribeMsg msg = null;

         try {
            byte[] protoArr = proto.toByteArray();
            msg = new DBSubscribeMsg();
            msg.proto = proto;
            msg.cmd = (Integer)this.protoScanContext.proto2Cmd.get(proto.getClass());
            msg.serverId = serverId;
            msg.platform = this.PLATFORM_NAME;
            msg.type = 1;
            msg.param1 = id;
            msg.param2 = time;
            long curTime = System.currentTimeMillis();
            msg.stream = Zstd.compress(protoArr);
            logger.info("压缩战斗流长度:{},{}ms", protoArr.length, System.currentTimeMillis() - curTime);
            msg.channel = this.channel;
            msg.sender = (InetSocketAddress)this.channel.remoteAddress();
         } catch (Exception e) {
            e.printStackTrace();
         }

         if (msg != null) {
            this.sendList.addSendMsg(msg);
         }

      }
   }

   public void sendSpecialRecord(GeneratedMessageV3 proto, int time) {
      if (this.channel == null) {
         logger.error("未连接数据服，请尽快连接！！！！");
      } else {
         DBSubscribeMsg msg = null;

         try {
            byte[] protoArr = proto.toByteArray();
            msg = new DBSubscribeMsg();
            msg.proto = proto;
            msg.cmd = (Integer)this.protoScanContext.proto2Cmd.get(proto.getClass());
            msg.serverId = 0;
            msg.platform = "special";
            msg.type = 0;
            msg.param1 = 0;
            msg.param2 = time;
            msg.stream = Zstd.compress(protoArr);
            msg.channel = this.channel;
            msg.sender = (InetSocketAddress)this.channel.remoteAddress();
         } catch (Exception e) {
            e.printStackTrace();
         }

         if (msg != null) {
            this.sendList.addSendMsg(msg);
         }

      }
   }

   public void sendMsg(GeneratedMessageV3 proto, int playerId, int serverId, String platform, byte type) {
      if (this.channel == null) {
         logger.info("当前未连接到数据服!!!!,{}：消息未发送", proto.getClass().getSimpleName());
      } else {
         DBSubscribeMsg msg = new DBSubscribeMsg();
         msg.proto = proto;
         msg.cmd = (Integer)this.protoScanContext.proto2Cmd.get(proto.getClass());
         if (msg.cmd == 6102) {
            (new Exception("6102的消息请走sendBattleMsg这个方法")).printStackTrace();
         } else {
            msg.platform = platform;
            msg.type = type;
            msg.serverId = serverId;
            msg.mgrId = playerId;
            msg.stream = proto.toByteArray();
            msg.channel = this.channel;
            msg.sender = (InetSocketAddress)this.channel.remoteAddress();
            this.sendList.addSendMsg(msg);
         }
      }
   }
}
