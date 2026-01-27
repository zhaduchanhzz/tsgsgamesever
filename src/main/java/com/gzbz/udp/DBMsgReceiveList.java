package com.gzbz.udp;

import allMgr.MgrParent;
import allMgr.MsgHandler;
import allMgr.PartParent;
import com.github.luben.zstd.Zstd;
import com.google.protobuf.MessageLiteOrBuilder;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.scan.GameProtobufScanContext;
import com.gzbz.scan.GameServerScan;
import com.gzbz.worldMgr.WorldMgr;
import io.netty.channel.ChannelHandlerContext;
import java.lang.reflect.Method;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import udp.DBFrame;
import udp.DBReceiveFrame;
import udp.MsgReceiveList;
import udp.MsgSendList;

@Component
public class DBMsgReceiveList extends MsgReceiveList {
   static Logger logger = LoggerFactory.getLogger(DBMsgReceiveList.class);
   @Autowired
   private DBMsgSendList sendList;
   @Autowired
   private GameProtobufScanContext protoScanContext;
   @Autowired
   private GameServerScan gameServerScan;
   @Autowired
   private WorldMgr worldMgr;

   protected void processMsg(ChannelHandlerContext ctx, DBFrame frame, byte[] stream) {
      try {
         if (frame.cmd == 6102 && System.currentTimeMillis() / 1000L > 1631177042L) {
            int size = (int)Zstd.decompressedSize(stream);
            int maxSize = 1048576;
            if (size < 1048576 && size > 0) {
               byte[] tempArray = new byte[size];
               Zstd.decompress(tempArray, stream);
               stream = tempArray;
            }
         }
      } catch (Throwable var12) {
         logger.error("战斗录像解压错误，可能是旧数据");
      }

      try {
         DBReceiveFrame receiveFrame = (DBReceiveFrame)frame;
         Class<?> cls = (Class)this.protoScanContext.protobufBuilderMap.get(frame.cmd);
         Method method = cls.getDeclaredMethod("parseFrom", byte[].class);
         MessageLiteOrBuilder protoBuf = (MessageLiteOrBuilder)method.invoke((Object)null, stream);
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(receiveFrame.mgrId);
         if (frame.cmd == 6102) {
            gamePlayer.pushTaskEx("battleResult", new Object[]{protoBuf, receiveFrame.param1, receiveFrame.param2});
            return;
         }

         MsgHandler handler = (MsgHandler)this.gameServerScan.msgHandlerMap.get(frame.cmd);
         if (handler == null || handler.method == null) {
            logger.error("无法找到消息 + " + frame.cmd + "处理器");
            return;
         }

         if (handler.handlerType == 1) {
            gamePlayer.pushTask(() -> {
               try {
                  handler.method.invoke(gamePlayer, protoBuf, null);
               } catch (Exception e) {
                  logger.error("消息id:" + frame.cmd + "处理器:" + handler.method.getName() + " 发生错误");
                  e.printStackTrace();
               }

            });
         } else if (handler.handlerType == 2) {
            PartParent part = (PartParent)((MgrParent)gamePlayer).getMgrPart(handler.cls);
            if (part == null) {
               logger.error(String.format("无法在%s类中找到%s", handler.mgrCls.getName(), handler.cls.getName()));
               return;
            }

            ((MgrParent)gamePlayer).pushTask(() -> {
               try {
                  handler.method.invoke(part, protoBuf, null);
               } catch (Exception e) {
                  for(Class<?> cls1 : handler.method.getParameterTypes()) {
                     logger.error("paramType:" + cls1.getName());
                  }

                  logger.error(Thread.currentThread().getName() + "消息id:" + frame.cmd + "处理器:" + handler.method.getName() + " 发生错误");
                  e.printStackTrace();
               }

            });
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   protected MsgSendList getSendList() {
      return this.sendList;
   }
}
