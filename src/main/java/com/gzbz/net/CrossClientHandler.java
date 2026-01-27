package com.gzbz.net;

import allMgr.MgrParent;
import allMgr.MsgHandler;
import allMgr.PartParent;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.scan.GameServerScan;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker;
import io.netty.handler.codec.http.websocketx.WebSocketHandshakeException;
import io.netty.util.AttributeKey;
import io.netty.util.CharsetUtil;
import java.util.Objects;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrossClientHandler extends SimpleChannelInboundHandler<Object> {
   Logger logger = LoggerFactory.getLogger(CrossClientHandler.class);
   WebSocketClientHandshaker handShaker;
   ChannelPromise handShakeFuture;

   public void handlerAdded(ChannelHandlerContext ctx) {
      this.handShakeFuture = ctx.newPromise();
   }

   public void setHandShaker(WebSocketClientHandshaker handShaker) {
      this.handShaker = handShaker;
   }

   public ChannelFuture handShakeFuture() {
      return this.handShakeFuture;
   }

   public void channelActive(ChannelHandlerContext ctx) throws Exception {
      try {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         if (Objects.isNull(crossNettyClient)) {
            this.logger.info("连上跨服后，客户端不见了");
            return;
         }

         ctx.channel().attr(AttributeKey.valueOf("time")).set(System.currentTimeMillis());
         crossNettyClient.pushTaskEx("channelActive", new Object[]{ctx});
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
      super.exceptionCaught(ctx, cause);
      cause.printStackTrace();
   }

   public void channelInactive(ChannelHandlerContext ctx) throws Exception {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      if (Objects.isNull(crossNettyClient)) {
         this.logger.info("跨服断开后，客户端不见了");
      } else {
         crossNettyClient.pushTaskEx("channelInactive", new Object[]{ctx});
      }
   }

   protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
      Channel ch = ctx.channel();
      if (!this.handShaker.isHandshakeComplete()) {
         try {
            FullHttpResponse response = (FullHttpResponse)msg;
            this.handShaker.finishHandshake(ch, response);
            this.handShakeFuture.setSuccess();
            System.out.println("WebSocket Client connected! response headers[sec-websocket-extensions]:{}" + response.headers());
         } catch (WebSocketHandshakeException var9) {
            FullHttpResponse res = (FullHttpResponse)msg;
            String errorMsg = String.format("WebSocket Client failed to connect,status:%s,reason:%s", res.status(), res.content().toString(CharsetUtil.UTF_8));
            this.handShakeFuture.setFailure(new Exception(errorMsg));
         }
      } else {
         if (msg instanceof FullHttpResponse) {
            FullHttpResponse response = (FullHttpResponse)msg;
            throw new IllegalStateException("Unexpected FullHttpResponse (getStatus=" + response.status() + ", content=" + response.content().toString(CharsetUtil.UTF_8) + ')');
         }

         if (msg instanceof CrossSubscribeMsg) {
            ch.attr(AttributeKey.valueOf("time")).set(System.currentTimeMillis());
            CrossSubscribeMsg crossSubscribeMsg = (CrossSubscribeMsg)msg;

            try {
               switch (crossSubscribeMsg.route) {
                  case 1:
                     WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
                     GamePlayer gamePlayer = worldMgr.getPlayerById(crossSubscribeMsg.destMgrId);
                     if (gamePlayer == null) {
                        this.logger.error("无法找到玩家:{}", crossSubscribeMsg.destMgrId);
                     } else {
                        gamePlayer.sendMsg(crossSubscribeMsg.proto);
                     }
                     break;
                  case 2:
                     this.processMgr(crossSubscribeMsg);
               }
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      }

   }

   protected void processMgr(CrossSubscribeMsg msg) {
      GameServerScan gameServerScan = (GameServerScan)ApplicationContextProvider.getContext().getBean(GameServerScan.class);
      MsgHandler handler = (MsgHandler)gameServerScan.msgHandlerMap.get(msg.cmd);
      if (handler != null && handler.method != null) {
         MgrParent mgrIns;
         if (handler.mgrCls == GamePlayer.class) {
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            if (Objects.isNull(worldMgr)) {
               return;
            }

            mgrIns = worldMgr.getPlayerById(msg.destMgrId);
            if (mgrIns == null) {
               this.logger.error("无法找到消息{}找到的对应处理管理器{}:", msg.cmd, handler.mgrCls.getName());
               return;
            }
         } else {
            mgrIns = (MgrParent)ApplicationContextProvider.getContext().getBean(handler.mgrCls);
            if (mgrIns == null) {
               this.logger.error("无法找到mgr:" + handler.cls.getName());
               return;
            }
         }

         if (handler.handlerType == 1) {
            mgrIns.pushTask(() -> {
               try {
                  Class<?>[] paramArr = handler.method.getParameterTypes();
                  if (paramArr.length == 0) {
                     handler.method.invoke(mgrIns, msg.proto);
                  } else if (paramArr[1].equals(CrossSubscribeMsg.class)) {
                     handler.method.invoke(mgrIns, msg.proto, msg);
                  } else if (paramArr[1].equals(String.class)) {
                     handler.method.invoke(mgrIns, msg.proto, msg.channelId);
                  }
               } catch (Exception e) {
                  this.logger.error("消息id:" + msg.cmd + "处理器:" + handler.method.getName() + " 发生错误");
                  e.printStackTrace();
               }

            });
         } else if (handler.handlerType == 2) {
            PartParent part = (PartParent)mgrIns.getMgrPart(handler.cls);
            if (part == null) {
               this.logger.error(String.format("无法在%s类中找到%s", handler.mgrCls.getName(), handler.cls.getName()));
               return;
            }

            mgrIns.pushTask(() -> {
               try {
                  Class<?>[] paramArr = handler.method.getParameterTypes();
                  if (paramArr.length == 0) {
                     handler.method.invoke(part, msg.proto);
                  } else if (paramArr[1].equals(CrossSubscribeMsg.class)) {
                     handler.method.invoke(part, msg.proto, msg);
                  } else if (paramArr[1].equals(String.class)) {
                     handler.method.invoke(part, msg.proto, msg.channelId);
                  }
               } catch (Exception e) {
                  this.logger.error("消息id:" + msg.cmd + "处理器:" + handler.method.getName() + " 发生错误");
                  e.printStackTrace();
               }

            });
         }

      } else {
         this.logger.error("无法找到消息 + " + msg.cmd + "处理器");
      }
   }
}
