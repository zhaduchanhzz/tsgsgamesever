package com.gzbz.net;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.countryWar.CountryWarMgr;
import com.gzbz.db.WorldDao;
import com.gzbz.db.worldBean.WorldData;
import com.gzbz.duel.DuelMgr;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.redis.GameRedisTool;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.supremePvp.SupremePvpMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.worldMgr.CenterServerPart;
import com.gzbz.worldMgr.WorldMgr;
import debug.Debug;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshakerFactory;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.util.AttributeKey;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@MgrAnno
public class CrossNettyClient extends GameMgr {
   static Logger logger = LoggerFactory.getLogger(CrossNettyClient.class);
   private Channel channel;
   private ScheduledFuture<?> sf;
   @Value("${ServerId}")
   public int GAME_SERVER_ID;
   @Value("${PlatformName}")
   public String PLATFORM_NAME;
   @Autowired
   private GameRedisTool gameRedisTool;
   @Autowired
   private Environment env;
   @Autowired
   private WorldMgr worldMgr;
   private URI websocketURI;
   private EventLoopGroup eventLoopGroup;
   private Bootstrap clientBoot;
   private AtomicBoolean isLogin = new AtomicBoolean(false);
   private int crossId;
   private String crossIp;
   private int crossPort;
   private int crossGroupId;
   private int newCrossId;
   private String newCrossIp;
   private int newCrossPort;
   private int newCrossGroupId;

   @TaskMethod
   public void crossServerInfo(int id, int groupId, String ip, int port) {
      logger.info("从中心服收到跨服信息:{},{},{},{}", new Object[]{id, groupId, ip, port});
      this.crossId = id;
      this.crossIp = ip;
      this.crossPort = port;
      this.crossGroupId = groupId;
      this.startConnect();
   }

   @TaskMethod
   public void confirmCenterNewGroup(int id, int groupId, String ip, int port) {
      logger.info("收到中心服确认信息:{},{},{},{}", new Object[]{id, groupId, ip, port});
      if (this.newCrossGroupId != groupId) {
         this.newCrossId = id;
         this.newCrossIp = ip;
         this.newCrossPort = port;
         this.newCrossGroupId = groupId;
         logger.info("跨服还未结算完毕，需要等待!!!!");
      } else {
         this.doConnectCross(id, groupId, ip, port);
      }

   }

   @TaskMethod
   public void doConnectCross(int id, int groupId, String ip, int port) {
      if (ip.equals(this.crossIp) && this.crossPort == port) {
         if (this.crossGroupId != groupId) {
            logger.info("服务器的分区发生了改变:老:{},新：{}", this.crossGroupId, groupId);
            this.crossGroupId = groupId;
            this.crossClose();
            this.worldMgr.pushPartTaskEx(CenterServerPart.class, "loginCrossServer", new Object[]{this.crossGroupId});
            this.clearCache();
         }
      } else {
         logger.info("新夸服的ip 老:{},新:{},端口 老:{},新:{},ip或端口发生了改变,将断开重新连接", new Object[]{this.crossIp, ip, this.crossPort, port});
         if (this.channel != null) {
            this.channel.close().syncUninterruptibly();
         }

         this.crossId = id;
         this.crossIp = ip;
         this.crossPort = port;
         this.crossGroupId = groupId;
         this.worldMgr.pushTask(() -> {
            WorldDao<WorldData> worldDao = this.worldMgr.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
            ((WorldData)worldDao.jsonData).crossChange = true;
            worldDao.updateOp();
            CenterServerPart centerServerPart = (CenterServerPart)this.worldMgr.getMgrPart(CenterServerPart.class);
            centerServerPart.updateCenterInfo((byte)0);
            this.pushTask(() -> {
               this.startConnect();
               this.clearCache();
            });
         });
      }

   }

   private void clearCache() {
      this.newCrossId = 0;
      this.newCrossIp = null;
      this.newCrossPort = 0;
      this.newCrossGroupId = 0;
   }

   @TaskMethod
   public void confirmCrossNewGroup(int newGroup) {
      this.newCrossGroupId = newGroup;
      logger.info("收到跨服发来的确认信息:{}", this.newCrossGroupId);
      if (!StringUtils.isEmpty(this.newCrossIp)) {
         this.doConnectCross(this.newCrossId, this.newCrossGroupId, this.newCrossIp, this.newCrossPort);
      }
   }

   @MsgHandlerAnno
   public void crossConnectSuc(CrossMsg.CR2S_Login_4204 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.isLogin.set(true);
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      worldMgr.pushTask(() -> worldMgr.crossConnectSuc(msg, crossSubscribeMsg));
   }

   @TaskMethod
   public void channelActive(ChannelHandlerContext ctx) {
      try {
         logger.info("连接到跨服:{}", ctx.channel().remoteAddress());
         this.channel = ctx.channel();
         HttpHeaders httpHeaders = new DefaultHttpHeaders();
         WebSocketClientHandshaker handShaker = WebSocketClientHandshakerFactory.newHandshaker(this.websocketURI, WebSocketVersion.V13, (String)null, true, httpHeaders, 10485760);
         CrossClientHandler handler = (CrossClientHandler)this.channel.pipeline().get("hookedHandler");
         handler.setHandShaker(handShaker);
         handler.handShakeFuture().addListener((future) -> {
            if (!future.isSuccess()) {
               future.cause().printStackTrace();
               this.channel.close();
               logger.info("游戏服与跨服握手失败!!!!!!!!");
            } else {
               logger.info("握手后发送登陆协议:ip:{},port{},crossId:{}", new Object[]{this.crossIp, this.crossPort, this.crossId});
               this.worldMgr.pushPartTaskEx(CenterServerPart.class, "loginCrossServer", new Object[]{this.crossGroupId});
            }

         });
         handShaker.handshake(this.channel);
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   @TaskMethod
   public void channelInactive(ChannelHandlerContext ctx) {
      logger.info("跨服链接断开");
      this.channel = null;
      this.crossClose();
   }

   private void crossClose() {
      CountryWarMgr countryWarMgr = (CountryWarMgr)ApplicationContextProvider.getContext().getBean(CountryWarMgr.class);
      countryWarMgr.pushTaskEx("setState", new Object[]{0});
      UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
      unionMgrParent.pushTaskEx("unionWarCrossDisconnect", new Object[0]);
      DuelMgr duelMgr = (DuelMgr)ApplicationContextProvider.getContext().getBean(DuelMgr.class);
      duelMgr.pushTaskEx("disConnect", new Object[0]);
      SupremePvpMgr supremePvpMgr = (SupremePvpMgr)ApplicationContextProvider.getContext().getBean(SupremePvpMgr.class);
      supremePvpMgr.pushTaskEx("disConnect", new Object[0]);
   }

   public void startConnect() {
      if (!this.checkConnect()) {
         this.connect();
         if (this.sf == null) {
            logger.info("启动跨服连接的定时器!!!");
            this.sf = this.schedule(30000L, 60000L, () -> {
               if (!this.checkConnect()) {
                  this.connect();
               } else {
                  long lastTime = (Long)this.channel.attr(AttributeKey.valueOf("time")).get();
                  if (!Debug.isDebug && System.currentTimeMillis() - lastTime > 120000L) {
                     this.channel.close().syncUninterruptibly();
                     logger.info("游戏服一直不登录,或者游戏服与跨服超过1分钟没有往来消息，主动断开!!!");
                     return;
                  }

                  if (!this.isLogin.get()) {
                     logger.info("补发登录协议:ip:{},port{},crossId:{}", new Object[]{this.crossIp, this.crossPort, this.crossId});
                     this.worldMgr.pushPartTaskEx(CenterServerPart.class, "loginCrossServer", new Object[]{this.crossGroupId});
                     return;
                  }

                  PlayerMsg.A_Heart_2001.Builder heartBuilder = PlayerMsg.A_Heart_2001.newBuilder();
                  heartBuilder.setTime((int)(System.currentTimeMillis() / 1000L));
                  this.sendCrossNoDest(heartBuilder.build(), this.GAME_SERVER_ID);
               }

            });
         }

      }
   }

   private String _getRedisKey(String key) {
      Integer serverZone = (Integer)this.env.getProperty("ServerZone", Integer.class);
      return serverZone == null ? "" : this.PLATFORM_NAME + ":ZoneServer:" + serverZone + ":" + key;
   }

   public void connect() {
      if (StringUtils.isEmpty(this.crossIp)) {
         logger.info("无ip,无法连接!!!!");
      } else {
         logger.info("开始连接跨服:{}:{}", this.crossIp, this.crossPort);
         if (Objects.nonNull(this.eventLoopGroup)) {
            this.eventLoopGroup.shutdownGracefully();
            this.eventLoopGroup = null;
         }

         this.eventLoopGroup = new NioEventLoopGroup();
         this.clientBoot = new Bootstrap();
         this.clientBoot.option(ChannelOption.SO_KEEPALIVE, true);
         this.clientBoot.option(ChannelOption.TCP_NODELAY, true);
         ((Bootstrap)this.clientBoot.group(this.eventLoopGroup)).handler(new LoggingHandler(LogLevel.INFO));
         this.clientBoot.channel(NioSocketChannel.class);
         CrossClientInitializer initializer = new CrossClientInitializer();
         this.clientBoot.handler(initializer);
         this.isLogin.set(false);

         try {
            this.websocketURI = new URI(String.format("ws://%s:%d/ws", this.crossIp, this.crossPort));
            this.clientBoot.connect(this.crossIp, this.crossPort);
         } catch (Exception e) {
            e.printStackTrace();
         }

      }
   }

   public boolean checkConnect() {
      return Objects.isNull(this.channel) ? false : this.channel.isActive();
   }

   public boolean canSend(GeneratedMessageV3 proto) {
      if (!this.checkConnect()) {
         logger.info("未连接到服务器，无法发送消息:" + proto.toString());
         return false;
      } else {
         return true;
      }
   }

   public void sendMsg(CrossSubscribeMsg msg) {
      if (this.channel == null) {
         logger.info("当前未连接到跨服!!!!,{}：消息未发送", msg.proto.getClass().getSimpleName());
      }

      try {
         this.channel.writeAndFlush(msg);
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public void send2Server(int sourceServerId, int sourcePlayerId, int destServerId, int destMgrId, GeneratedMessageV3 proto) {
      if (this.canSend(proto)) {
         CrossSubscribeMsg msg = new CrossSubscribeMsg();
         msg.sourceServerId = sourceServerId;
         msg.sourcePlayerId = sourcePlayerId;
         msg.destServerId = destServerId;
         msg.destMgrId = destMgrId;
         msg.route = 2;
         msg.proto = proto;
         this.sendMsg(msg);
      }
   }

   public void send2Client(int destServerId, int destMgrId, GeneratedMessageV3 proto) {
      if (this.canSend(proto)) {
         CrossSubscribeMsg msg = new CrossSubscribeMsg();
         msg.destServerId = destServerId;
         msg.destMgrId = destMgrId;
         msg.proto = proto;
         msg.route = 1;
         this.sendMsg(msg);
      }
   }

   public void send2Zone(int sourceServerId, int sourcePlayerId, GeneratedMessageV3 proto) {
      if (this.canSend(proto)) {
         CrossSubscribeMsg msg = new CrossSubscribeMsg();
         msg.sourceServerId = sourceServerId;
         msg.sourcePlayerId = sourcePlayerId;
         msg.proto = proto;
         msg.route = 3;
         this.sendMsg(msg);
      }
   }

   public void sendCross(int sourceServerId, int sourcePlayerId, GeneratedMessageV3 proto) {
      if (this.canSend(proto)) {
         CrossSubscribeMsg msg = new CrossSubscribeMsg();
         msg.sourceServerId = sourceServerId;
         msg.sourcePlayerId = sourcePlayerId;
         msg.proto = proto;
         msg.route = 4;
         this.sendMsg(msg);
      }
   }

   public void sendCrossNoDest(GeneratedMessageV3 proto, int sourceServer) {
      if (this.canSend(proto)) {
         CrossSubscribeMsg msg = new CrossSubscribeMsg();
         msg.proto = proto;
         msg.route = 4;
         msg.sourceServerId = sourceServer;
         this.sendMsg(msg);
      }
   }

   public boolean isLogin() {
      return this.isLogin.get();
   }

   protected void init() {
   }
}
