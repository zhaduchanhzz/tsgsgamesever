package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.KeyValFun;
import java.util.Objects;

@ListenerCheckAnno(
   type = 12
)
public class CheckRecoverHPEvent extends ListenerChecker {
   public static final int RECOVER_EVENT_TYPE_ENEMY_TAKE = 1;
   public static final int RECOVER_EVENT_TYPE_FRIEND_TAKE = 2;
   public static final int RECOVER_EVENT_TYPE_SELF_TAKE = 3;
   public static final int RECOVER_EVENT_TYPE_SELF_CAUSE = 4;
   public static final int RECOVER_EVENT_TYPE_SELF_OR_FRIEND_TAKE = 5;
   public static final int RECOVER_EVENT_TYPE_SELF_OR_FRIEND_CAUSE = 6;
   public static final int RECOVER_EVENT_TYPE_SELF_CAUSE_NO_EVENT = 7;

   boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      Entity target = (Entity)event.getParam(3);
      switch (context.param) {
         case 1:
            return target.getForce() != context.entity.getForce();
         case 2:
            return target.getForce() == context.entity.getForce();
         case 3:
            SkillEffectModel model = (SkillEffectModel)event.getParam(31);
            if (model != null) {
               for(KeyValFun keyValFun : model.eventType.values()) {
                  if (keyValFun.getKey() == 12 && keyValFun.getVal() == 3) {
                     return false;
                  }
               }
            }

            return target == context.entity;
         case 4:
            return source == context.entity;
         case 5:
            return target == context.entity || target.getForce() == context.entity.getForce();
         case 6:
            return source == context.entity || source.getForce() == context.entity.getForce();
         case 7:
            if (source == context.entity && event.getTriggerLayer() == 0) {
               Entity entity = (Entity)event.getAction().getBlackboard().getSkillParam(40);
               if (Objects.isNull(entity)) {
                  event.getAction().getBlackboard().addSkillParam(40, source);
                  return true;
               }
            }

            return false;
         default:
            return false;
      }
   }
}
