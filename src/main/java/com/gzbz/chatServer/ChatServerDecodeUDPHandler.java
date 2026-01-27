package com.gzbz.chatServer;

import allMgr.MgrParent;
import allMgr.MsgHandler;
import allMgr.PartParent;
import chatServer.ChatUdpMsg;
import chatServer.LoginUdpMsg;
import chatServer.TransmitUdpMsg;
import chatServer.UdpMsg;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.chat.ChatMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.protobuf.ChatMsg;
import com.gzbz.scan.GameServerScan;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import java.lang.reflect.Method;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import scan.ProtobufScanContext;

@Component
@Scope("prototype")
public class ChatServerDecodeUDPHandler extends SimpleChannelInboundHandler<DatagramPacket> {
   protected static Logger log = LoggerFactory.getLogger(ChatServerDecodeUDPHandler.class);
   public static ProtobufScanContext protoCtx;

   protected UdpMsg script(ByteBuf byteBuf) {
      int cmd = byteBuf.readInt();
      UdpMsg msg = null;
      switch (cmd) {
         case 2:
            msg = new LoginUdpMsg();
            break;
         case 3:
            msg = new TransmitUdpMsg();
            break;
         case 4:
            msg = new ChatUdpMsg();
      }

      if (msg == null) {
         log.error("错误的消息号:{}", cmd);
         return null;
      } else {
         msg.decode(cmd, byteBuf);
         return msg;
      }
   }

   public void channelActive(ChannelHandlerContext ctx) throws Exception {
      ChatServerClient chatServerClient = (ChatServerClient)ApplicationContextProvider.getContext().getBean(ChatServerClient.class);
      chatServerClient.pushTask(() -> chatServerClient.channelActive(ctx));
   }

   protected void channelRead0(ChannelHandlerContext channelHandlerContext, DatagramPacket datagramPacket) throws Exception {
      ByteBuf byteBuf = (ByteBuf)datagramPacket.content();
      UdpMsg msg = this.script(byteBuf);
      switch (msg.cmd) {
         case 2:
            ChatServerClient chatServerClient = (ChatServerClient)ApplicationContextProvider.getContext().getBean(ChatServerClient.class);
            chatServerClient.pushTaskEx("login", new Object[]{msg, channelHandlerContext.channel()});
            break;
         case 3:
            try {
               TransmitUdpMsg transmitUdpMsg = (TransmitUdpMsg)msg;
               Class cls = (Class)protoCtx.protobufBuilderMap.get(transmitUdpMsg.protoCmd);
               if (cls == null) {
                  log.error("无法找消息码对应的protobuf：" + transmitUdpMsg.protoCmd);
                  return;
               }

               Method method = cls.getDeclaredMethod("parseFrom", byte[].class);
               if (method == null) {
                  log.error("无法找到解析函数：" + transmitUdpMsg.protoCmd);
                  return;
               }

               GeneratedMessageV3 proto = (GeneratedMessageV3)method.invoke((Object)null, transmitUdpMsg.proto);
               this.process((TransmitUdpMsg)msg, proto);
            } catch (Exception e) {
               e.printStackTrace();
            }
            break;
         case 4:
            ChatUdpMsg chatUdpMsg = (ChatUdpMsg)msg;
            ChatMsg.Chat_Info chatInfo = ChatMsg.Chat_Info.parseFrom(chatUdpMsg.proto);
            ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
            chatMgr.pushTask(() -> chatMgr.CR2S_Chat_11702(chatInfo));
      }

   }

   protected void process(TransmitUdpMsg msg, GeneratedMessageV3 proto) {
      GameServerScan gameServerScan = (GameServerScan)ApplicationContextProvider.getContext().getBean(GameServerScan.class);
      if (msg.route == 1) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         if (!Objects.isNull(worldMgr)) {
            MgrParent mgrIns = worldMgr.getPlayerById(msg.destMgrId);
            if (mgrIns == null) {
               log.error("无法找到消息{}找到的对应的玩家", msg.cmd);
            } else {
               ((GamePlayer)mgrIns).sendMsg(proto);
            }
         }
      } else {
         MsgHandler handler = (MsgHandler)gameServerScan.msgHandlerMap.get(msg.protoCmd);
         if (handler != null && handler.method != null) {
            MgrParent mgrIns;
            if (handler.mgrCls == GamePlayer.class) {
               WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
               if (Objects.isNull(worldMgr)) {
                  return;
               }

               mgrIns = worldMgr.getPlayerById(msg.destMgrId);
               if (mgrIns == null) {
                  log.error("无法找到消息{}找到的对应的玩家{}:", msg.cmd, handler.mgrCls.getName());
                  return;
               }
            } else {
               mgrIns = (MgrParent)ApplicationContextProvider.getContext().getBean(handler.mgrCls);
               if (mgrIns == null) {
                  log.error("无法找到mgr:" + handler.cls.getName());
                  return;
               }
            }

            if (handler.handlerType == 1) {
               mgrIns.pushTask(() -> {
                  try {
                     Class<?>[] paramArr = handler.method.getParameterTypes();
                     handler.method.invoke(mgrIns, proto, null);
                  } catch (Exception e) {
                     log.error("消息id:" + msg.cmd + "处理器:" + handler.method.getName() + " 发生错误");
                     e.printStackTrace();
                  }

               });
            } else if (handler.handlerType == 2) {
               PartParent part = (PartParent)mgrIns.getMgrPart(handler.cls);
               if (part == null) {
                  log.error(String.format("无法在%s类中找到%s", handler.mgrCls.getName(), handler.cls.getName()));
                  return;
               }

               mgrIns.pushTask(() -> {
                  try {
                     Class<?>[] paramArr = handler.method.getParameterTypes();
                     handler.method.invoke(part, proto, msg);
                  } catch (Exception e) {
                     log.error("消息id:" + msg.cmd + "处理器:" + handler.method.getName() + " 发生错误");
                     e.printStackTrace();
                  }

               });
            }

         } else {
            log.error("无法找到消息 + " + msg.protoCmd + "处理器");
         }
      }
   }
}
