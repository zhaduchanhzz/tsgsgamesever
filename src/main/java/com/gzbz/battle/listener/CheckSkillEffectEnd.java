package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.model.SkillEffectModel;
import java.util.HashSet;
import java.util.Objects;
import jodd.util.StringUtil;

@ListenerCheckAnno(
   type = 36
)
public class CheckSkillEffectEnd extends ListenerChecker {
   public static final int EVENT_CHECKER_SKILL_EFFECT_USER_PHYSICAL = 1;
   public static final int EVENT_CHECKER_SKILL_EFFECT_USER_MAGIC = 2;
   public static final int EVENT_CHECKER_SELF_SKILL_EFFECT = 3;
   public static final int EVENT_CHECKER_SELF_EFFECT = 4;
   public static HashSet<Short> PHYSICAL_HURT_FUN_DEFINE = new HashSet();
   public static HashSet<Short> MAGIC_HURT_FUN_DEFINE = new HashSet();

   boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      switch (context.param) {
         case 1:
            return source == context.entity && this.checkPhysical(event) && this.checkPhysicalEffect(event);
         case 2:
            return source == context.entity && this.checkMagic(event) && this.checkMagicEffect(event);
         case 3:
            if (StringUtil.isEmpty(context.exParams)) {
               return source == context.entity;
            }

            EntitySkill entitySkill = (EntitySkill)event.getParam(5);
            return source == context.entity && entitySkill != null && entitySkill.index == Integer.parseInt(context.exParams);
         case 4:
            if (StringUtil.isEmpty(context.exParams)) {
               return source == context.entity;
            }

            SkillEffectModel model = (SkillEffectModel)event.getAction().getBlackboard().getSkillParam(19);
            return source == context.entity && model != null && model.getId() == Integer.parseInt(context.exParams);
         default:
            return false;
      }
   }

   private boolean checkPhysicalEffect(Event event) {
      SkillEffectModel model = (SkillEffectModel)event.getAction().getBlackboard().getSkillParam(19);
      return Objects.nonNull(model) && PHYSICAL_HURT_FUN_DEFINE.contains(model.getFunc());
   }

   private boolean checkMagicEffect(Event event) {
      SkillEffectModel model = (SkillEffectModel)event.getAction().getBlackboard().getSkillParam(19);
      return Objects.nonNull(model) && MAGIC_HURT_FUN_DEFINE.contains(model.getFunc());
   }

   static {
      PHYSICAL_HURT_FUN_DEFINE.add(Short.valueOf((short)1));
      PHYSICAL_HURT_FUN_DEFINE.add(Short.valueOf((short)10));
      PHYSICAL_HURT_FUN_DEFINE.add(Short.valueOf((short)26));
      PHYSICAL_HURT_FUN_DEFINE.add(Short.valueOf((short)48));
      MAGIC_HURT_FUN_DEFINE.add(Short.valueOf((short)2));
      MAGIC_HURT_FUN_DEFINE.add(Short.valueOf((short)29));
      MAGIC_HURT_FUN_DEFINE.add(Short.valueOf((short)37));
      MAGIC_HURT_FUN_DEFINE.add(Short.valueOf((short)69));
   }
}
