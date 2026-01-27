package com.gzbz.union.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.protobuf.UnionWarMsg;
import com.gzbz.union.UnionMgr;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class UnionWarShopPart extends UnionPart {
   @MsgHandlerAnno
   public void C2S_WarBattleShopLv_9729(UnionWarMsg.C2S_WarBattleShopLv_9729 msg, String source) {
      this.unionMgrParent.pushTask(() -> {
         if (!this.checkJoin()) {
            this.player.failure(23);
         } else {
            UnionMgr unionMgr = super.getUnionMgr();
            this.player.sendMsg(unionMgr.buildWarShopMsg());
         }
      });
   }
}
