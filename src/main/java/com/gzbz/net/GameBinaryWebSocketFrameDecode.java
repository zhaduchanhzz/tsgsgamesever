package com.gzbz.net;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.protobuf.LoginMsg;
import com.gzbz.worldMgr.WorldMgr;
import io.netty.channel.Channel;
import java.util.Objects;
import net.BinaryWebSocketFrameDecode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameBinaryWebSocketFrameDecode extends BinaryWebSocketFrameDecode {
   @Autowired
   private WorldMgr mgr;

   protected void closeChannel(Channel channel) {
      if (Objects.nonNull(this.mgr)) {
         GamePlayer player = this.mgr.getPlayerByChannel(channel.id().asLongText());
         if (Objects.nonNull(player)) {
            player.closeChannel(LoginMsg.resultType.KICKOUT);
         } else {
            channel.close();
         }
      } else {
         channel.close();
      }

   }
}
