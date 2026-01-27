package com.gzbz.net;

import allMgr.MgrParent;
import allMgr.MsgHandler;
import allMgr.PartParent;
import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.protobuf.LoginMsg;
import com.gzbz.scan.GameProtobufScanContext;
import com.gzbz.scan.GameServerScan;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import debug.Debug;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import net.Msg;
import net.ServerHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class GameServerHandler extends ServerHandler {
   static Logger logger = LoggerFactory.getLogger(ServerHandler.class);
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   GameServerScan gameServerScan;
   @Autowired
   ConfigurableApplicationContext context;
   private static final AtomicBoolean PROTO_LOG_STATE = new AtomicBoolean(false);
   private static final Set<Integer> PROTO_LOG_CMD = new ConcurrentHashSet();

   public boolean checkDigest(byte[] digestBytes, byte[] sourceBytes) {
      return true;
   }

   public void channelActive(ChannelHandlerContext ctx) {
      this.worldMgr.pushTask(() -> {
         ctx.channel().attr(AttributeKey.valueOf("life")).set(System.currentTimeMillis());
         this.worldMgr.channelActive(ctx.channel());
      });
   }

   protected void channelRead0(ChannelHandlerContext ctx, Msg msg) throws Exception {
      try {
         if (WorldMgr.serverState.get() == 2) {
            LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.KICKOUT).build();
            ctx.channel().writeAndFlush(protoMsg);
            ctx.channel().close();
            return;
         }

         MsgHandler handler = (MsgHandler)this.gameServerScan.msgHandlerMap.get(msg.cmd);
         if (handler == null || handler.method == null) {
            logger.error("无法找到消息 + " + msg.cmd + "处理器");
            return;
         }

         ctx.channel().attr(AttributeKey.valueOf("life")).set(System.currentTimeMillis());
         String channelId = ctx.channel().id().asLongText();
         MgrParent mgrIns;
         if (handler.mgrCls == GamePlayer.class) {
            if (msg.cmd == 1006) {
               String str = ((LoginMsg.C2S_ReconnectKey_1006)msg.protoBuf).getKey();
               if (!Objects.nonNull(str)) {
                  logger.info("重连key为:null");
                  return;
               }

               logger.info("重连key为:{}", str);
               mgrIns = this.worldMgr.getPlayerById(Integer.parseInt(str) ^ -235736076);
               if (mgrIns == null) {
                  LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.KICKOUT).build();
                  ctx.channel().writeAndFlush(protoMsg);
                  ctx.channel().close();
                  logger.error("无法找到重连消息1006对应处理管理器{},playerId:{}", handler.mgrCls.getName(), str);
                  return;
               }
            } else {
               mgrIns = this.worldMgr.getPlayerByChannel(channelId);
               if (mgrIns == null) {
                  LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.KICKOUT).build();
                  ctx.channel().writeAndFlush(protoMsg);
                  ctx.channel().close();
                  logger.error("无法找到重连消息{}对应处理管理器{}", msg.cmd, handler.mgrCls.getName());
                  return;
               }

               if (msg.protoBuf != null && getProtoLogState(msg.protoBuf.getClass())) {
                  GamePlayer gamePlayer = (GamePlayer)mgrIns;
                  logger.info("【消息日志】:玩家【{}】请求消息【{}】【{}】", new Object[]{gamePlayer.getPlayerId(), msg.protoBuf == null ? "" : msg.protoBuf.getClass().getSimpleName(), msg.protoBuf});
               }
            }
         } else {
            mgrIns = (MgrParent)this.context.getBean(handler.mgrCls);
            if (mgrIns == null) {
               logger.error("无法找到mgr:" + handler.cls.getName());
               return;
            }
         }

         if (handler.handlerType == 1) {
            mgrIns.pushTask(() -> {
               try {
                  handler.method.invoke(mgrIns, msg.protoBuf, channelId);
               } catch (Exception e) {
                  logger.error("消息id:" + msg.cmd + "处理器:" + handler.method.getName() + " 发生错误");
                  e.printStackTrace();
               }

            });
         } else if (handler.handlerType == 2) {
            PartParent part = (PartParent)mgrIns.getMgrPart(handler.cls);
            if (part == null) {
               logger.error(String.format("无法在%s类中找到%s", handler.mgrCls.getName(), handler.cls.getName()));
               return;
            }

            mgrIns.pushTask(() -> {
               try {
                  handler.method.invoke(part, msg.protoBuf, channelId);
               } catch (Exception e) {
                  for(Class<?> cls : handler.method.getParameterTypes()) {
                     logger.error("paramType:" + cls.getName());
                  }

                  logger.error(Thread.currentThread().getName() + "消息id:" + msg.cmd + "处理器:" + handler.method.getName() + " 发生错误");
                  e.printStackTrace();
               }

            });
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
   }

   public void channelInactive(ChannelHandlerContext ctx) {
      this.worldMgr.pushTask(() -> this.worldMgr.channelInactive(ctx.channel()));
   }

   public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
      if (Debug.isDebug) {
         cause.printStackTrace();
      }

      logger.info("链接异常");
      ctx.close();
   }

   public static void setProtoLogState(boolean protoLogState, Set<Integer> cmd) {
      PROTO_LOG_STATE.set(protoLogState);
      if (protoLogState) {
         PROTO_LOG_CMD.addAll(cmd);
      } else {
         PROTO_LOG_CMD.clear();
      }

      logger.info("协议打印开关={},cmd={}", protoLogState, PROTO_LOG_CMD);
   }

   public static boolean getProtoLogState(Class<?> protoClz) {
      if (!PROTO_LOG_STATE.get()) {
         return false;
      } else {
         GameProtobufScanContext protobufContext = (GameProtobufScanContext)ApplicationContextProvider.getContext().getBean(GameProtobufScanContext.class);
         Integer cmd = (Integer)protobufContext.proto2Cmd.get(protoClz);
         if (cmd == null) {
            return false;
         } else if (!PROTO_LOG_CMD.contains(0)) {
            return PROTO_LOG_CMD.contains(cmd);
         } else {
            return cmd != 2001 && cmd != 6102;
         }
      }
   }
}
