package com.gzbz.war.hl;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.WarMsg;
import java.util.ArrayList;
import java.util.List;

public class HLEvent {
   public int pos;
   public int eventId;
   public int eventType;
   public List<KeyValFun> question = new ArrayList();
   public List<HLGoods> goods = new ArrayList();
   public List<ResourceModel> rewards1 = new ArrayList();
   public List<ResourceModel> rewards2 = new ArrayList();
   public boolean end;
   public int buffId;

   public WarMsg.S2C_EventInfo_8006 builder() {
      WarMsg.S2C_EventInfo_8006.Builder builder = WarMsg.S2C_EventInfo_8006.newBuilder();
      builder.setEventPos(this.pos);
      builder.setEventId(this.eventId);
      if (this.question != null) {
         for(KeyValFun fun : this.question) {
            CommonMsg.MapDataII.Builder q = CommonMsg.MapDataII.newBuilder();
            q.setKey(fun.getKey());
            q.setValue(fun.getVal());
            builder.addQuestion(q);
         }
      }

      if (this.goods != null) {
         for(int i = 0; i < this.goods.size(); ++i) {
            builder.addGoods(((HLGoods)this.goods.get(i)).builder());
         }
      }

      builder.setEnd(this.end);
      builder.setBuffId(this.buffId);
      return builder.build();
   }
}
