package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.model.BuffModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Objects;
import java.util.TreeSet;
import jodd.util.StringUtil;

@ListenerCheckAnno(
   type = 7
)
public class CheckBuffChangeAdd extends ListenerChecker {
   public static final int EVENT_CHECKER_BUFF_ADD_SELF = 1;
   public static final int EVENT_CHECKER_BUFF_ADD_FRIEND = 2;
   public static final int EVENT_CHECKER_BUFF_ADD_SELF_FORCE = 3;
   public static final int EVENT_CHECKER_BUFF_ADD_ENEMY = 4;
   public static final int EVENT_CHECKER_BUFF_ADD_SELF_CONTROLL = 5;
   public static final int EVENT_CHECKER_BUFF_SELF_CASTER = 6;
   public static final int EVENT_CHECKER_BUFF_ADD_SELF_BUFFID = 7;
   public static final int EVENT_CHECKER_BUFF_SUBCLS_COMBINE_ENEMY = 8;
   public static final int EVENT_CHECKER_BUFF_ADD_TARGET_SUBCLS = 9;
   public static final int EVENT_CHECKER_BUFF_ADD_FRIEND_SUBCLS = 10;
   public static final int EVENT_CHECKER_BUFF_ADD_SELF_FORCE_BUFFID = 11;
   public static final int EVENT_CHECKER_BUFF_ADD_ENEMY_SUBCLS = 12;
   public static final int EVENT_CHECKER_BUFF_SELF_CASTER_BUFFID = 13;
   private int triggerTimes = 0;

   public boolean check(Event event, ListenerContext context) {
      Entity target = (Entity)event.getParam(3);
      Entity source = (Entity)event.getParam(2);
      switch (context.param) {
         case 1:
            return target == context.entity;
         case 2:
            return target != context.entity && target.getForce() == context.entity.getForce();
         case 3:
            return target.getForce() == context.entity.getForce();
         case 4:
            return target.getForce() != context.entity.getForce();
         case 5:
            if (target != context.entity) {
               return false;
            }

            if (!event.containsParam(19)) {
               return false;
            }

            int buffId = (Integer)event.getParam(19);
            BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId);
            if (Objects.isNull(buffModel)) {
               return false;
            }

            BuffUseFun fun = (BuffUseFun)buffModel.getFuncs().get(1);
            if (!Objects.isNull(fun) && fun.getUseFunc() == 3) {
               switch (fun.getUseId()) {
                  case 1:
                  case 2:
                  case 11:
                  case 12:
                  case 16:
                  case 17:
                  case 18:
                     ++this.triggerTimes;
                     if (context.exParams != null) {
                        int times = Integer.parseInt(context.exParams);
                        return this.triggerTimes % times == 0;
                     }

                     return true;
                  case 3:
                  case 4:
                  case 5:
                  case 6:
                  case 7:
                  case 8:
                  case 9:
                  case 10:
                  case 13:
                  case 14:
                  case 15:
                  default:
                     return false;
               }
            }

            return false;
         case 6:
            Short subClass = (Short)event.getParam(7);
            if (subClass == null) {
               return false;
            }

            String[] arr = context.exParams.split("&");
            EntitySkill entitySkill = (EntitySkill)event.getAction().getBlackboard().getSkillParam(4);
            if (arr.length < 2) {
               return false;
            }

            if (source == context.entity && subClass == Integer.parseInt(arr[1]) && entitySkill.index == Integer.parseInt(arr[0])) {
               return true;
            }
            break;
         case 7:
            if (StringUtil.isEmpty(context.exParams)) {
               return false;
            }

            Integer buffIdValue = (Integer)event.getParam(19);
            if (buffIdValue == null) {
               return false;
            }

            if (target == context.entity && buffIdValue == Integer.parseInt(context.exParams)) {
               return true;
            }
            break;
         case 8:
            Short subCls = (Short)event.getParam(7);
            if (subCls == null) {
               return false;
            }

            String[] exArr = context.exParams.split("&");
            if (exArr.length < 2) {
               return false;
            }

            if (target.getForce() == context.entity.getForce() || subCls != Short.parseShort(exArr[0])) {
               return false;
            }

            TreeSet<Integer> codeSet = target.getBuffManager().getSubBuff(subCls);
            Short count = target.getBuffManager().getBuffCount(subCls);
            if (codeSet == null || count == null) {
               return false;
            }

            int combine = Integer.parseInt(exArr[1]);
            if (count >= combine && codeSet.size() >= combine) {
               if (target.getBuffManager().isExistSubType((short)84)) {
                  return false;
               }

               target.getBuffManager().resetBuffCount(subCls);
               return true;
            }
            break;
         case 9:
            if (StringUtil.isEmpty(context.exParams)) {
               return false;
            }

            Short subType = (Short)event.getParam(7);
            if (subType == null) {
               return false;
            }

            return target == context.entity && subType == Short.parseShort(context.exParams);
         case 10:
            if (StringUtil.isEmpty(context.exParams)) {
               return false;
            }

            Short buffType = (Short)event.getParam(7);
            if (buffType == null) {
               return false;
            }

            return target != context.entity && target.getForce() == context.entity.getForce() && buffType == Short.parseShort(context.exParams);
         case 11:
            if (StringUtil.isEmpty(context.exParams)) {
               return false;
            }

            Integer id = (Integer)event.getParam(19);
            if (id == null) {
               return false;
            }

            return target.getForce() == context.entity.getForce() && id == Integer.parseInt(context.exParams);
         case 12:
            if (StringUtil.isEmpty(context.exParams)) {
               return false;
            }

            Short subType2 = (Short)event.getParam(7);
            if (subType2 == null) {
               return false;
            }

            return target.getForce() != context.entity.getForce() && subType2 == Short.parseShort(context.exParams);
         case 13:
            Integer tmpId = (Integer)event.getParam(19);
            if (tmpId == null) {
               return false;
            }

            String[] str = context.exParams.split("&");
            EntitySkill curSkill = (EntitySkill)event.getAction().getBlackboard().getSkillParam(4);
            if (str.length < 2) {
               return false;
            }

            if (source == context.entity && tmpId == Integer.parseInt(str[1]) && curSkill.index == Integer.parseInt(str[0])) {
               return true;
            }
      }

      return false;
   }
}
