package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeMap;

import jodd.util.StringUtil;

@ListenerCheckAnno(
        type = 15
)
public class CheckSkillHurt extends ListenerChecker {
    public static final int EVENT_CHECKER_SELF_SKILL = 1;
    public static final int EVENT_CHECKER_INI_SKILL = 2;
    public static final int EVENT_CHECKER_HP_LOWER = 3;
    public static final int EVENT_CHECKER_INI_SKILL_NO_COMMON = 4;
    public static final int EVENT_CHECKER_HP_LOWER_PHYSICAL = 5;
    public static final int EVENT_CHECKER_HP_LOWER_MAGIC = 6;
    public static final int EVENT_CHECKER_INI_SKILL_COMMON = 7;
    public static final int EVENT_CHECKER_CRIT = 8;
    public static final int EVENT_CHECKER_SELF_TARGET = 9;
    public static final int EVENT_CHECKER_NO_CRIT_SELF = 10;
    public static final int EVENT_CHECKER_SELF_BE_CRIT = 11;
    public static final int EVENT_CHECKER_CRIT_SELF = 12;
    public static final int EVENT_CHECKER_SELF_FORCE_BE_CRIT = 13;
    public static final int EVENT_CHECKER_SELF_FORCE_PRE_ATK = 14;
    public static final int EVENT_CHECKER_SELF_TARGET_ATK_BUF = 15;
    public static final int EVENT_CHECKER_SELF_FORCE_INI_SKILL = 16;
    public static final int EVENT_CHECKER_SELF_FORCE_SKILL = 17;
    public static final int EVENT_CHECKER_SELF_FORCE_TARGET = 18;
    public static final int EVENT_CHECKER_SELF_OR_FORCE_TARGET = 19;
    public static HashSet<Byte> ACTIONS_17 = new HashSet();

    boolean check(Event event, ListenerContext context) {
        Entity source = (Entity) event.getParam(2);
        Entity target = (Entity) event.getParam(3);
        EntitySkill entitySkill = (EntitySkill) event.getParam(5);
        switch (context.param) {
            case 1:
                if (StringUtil.isEmpty(context.exParams)) {
                    return context.entity == source;
                }

                return context.entity == source && entitySkill != null && entitySkill.index == Integer.parseInt(context.exParams);
            case 2:
                return context.entity == source && event.getAction().getType() == 4;
            case 3:
                if (context.entity != source) {
                    return false;
                } else {
                    if (target.getHpRate() < Integer.parseInt(context.exParams)) {
                        return true;
                    }

                    return false;
                }
            case 4:
                entitySkill = (EntitySkill) event.getParam(5);
                if (entitySkill == null) {
                    return false;
                }

                return context.entity == source && event.getAction().getType() == 4 && entitySkill.index != 1;
            case 5:
                if (entitySkill == null) {
                    return false;
                } else {
                    if (context.entity == source && !target.isDead() && this.checkPhysical(event)) {
                        if (context.exParams != null && target.getHpRate() >= Integer.parseInt(context.exParams)) {
                            return false;
                        }

                        return true;
                    }

                    return false;
                }
            case 6:
                if (entitySkill == null) {
                    return false;
                } else {
                    if (context.entity == source && !target.isDead() && this.checkMagic(event)) {
                        if (context.exParams != null && target.getHpRate() >= Integer.parseInt(context.exParams)) {
                            return false;
                        }

                        return true;
                    }

                    return false;
                }
            case 7:
                if (entitySkill == null) {
                    return false;
                }

                return context.entity == source && event.getAction().getType() == 4 && entitySkill.index == 1;
            case 8:
                Boolean isCrit = (Boolean) event.getAction().getBlackboard().getSkillParam(200 + target.getBattlePos());
                return context.entity == source && isCrit != null && isCrit;
            case 9:
                return target == context.entity;
            case 10:
                Boolean sourceCrit = (Boolean) event.getAction().getBlackboard().getSkillParam(21);
                return context.entity == source && (sourceCrit == null || !sourceCrit);
            case 11:
                Boolean crit = (Boolean) event.getAction().getBlackboard().getSkillParam(2900 + target.getBattlePos());
                return target == context.entity && crit != null && crit;
            case 12:
                boolean srcCrit = false;
                Integer times = (Integer) event.getAction().getBlackboard().getSkillParam(49);
                if (times != null && times > 0) {
                    srcCrit = true;
                }

                return context.entity == source && srcCrit;
            case 13:
                for (Entity e : (ArrayList<Entity>) event.getParam(14)) {
                    Boolean beCrit = (Boolean) event.getAction().getBlackboard().getSkillParam(2900 + e.getBattlePos());
                    if (beCrit != null && beCrit && e.getForce() == context.entity.getForce()) {
                        return true;
                    }
                }

                return false;
            case 14:
                if (!StringUtil.isEmpty(context.exParams) && target != context.entity) {
                    String[] arr = context.exParams.split("&");
                    if (arr.length < 2) {
                        return false;
                    }

                    int buffId = Integer.parseInt(arr[0]);
                    int beAtkTime = Integer.parseInt(arr[1]);
                    TreeMap<Integer, Buff> codeMap = target.getBuffManager().getBuffsById(buffId);
                    if (Objects.nonNull(codeMap) && codeMap.size() > 0) {
                        Buff buff = (Buff) codeMap.firstEntry().getValue();
                        ++buff.attackedTimes;
                        int value = buff.attackedTimes % beAtkTime;
                        return target.getForce() == context.entity.getForce() && value == 0;
                    }

                    return false;
                }

                return false;
            case 15:
                if (!StringUtil.isEmpty(context.exParams) && target == context.entity) {
                    String[] exArr = context.exParams.split("&");

                    for (String param : exArr) {
                        if (source.getBuffManager().isExistId(Integer.parseInt(param))) {
                            return true;
                        }
                    }

                    return false;
                }

                return false;
            case 16:
                return source.getForce() == context.entity.getForce() && event.getAction().getType() == 4;
            case 17:
                return source.getForce() == context.entity.getForce() && ACTIONS_17.contains(event.getAction().getType());
            case 18:
                return target.getForce() == context.entity.getForce();
            case 19:
                if (target == context.entity) {
                    return true;
                } else {
                    if (target.getForce() == context.entity.getForce() && !StringUtil.isEmpty(context.exParams)) {
                        int tmpBuffId = Integer.parseInt(context.exParams);
                        return target.getBuffManager().isExistId(tmpBuffId);
                    }

                    return false;
                }
            default:
                return false;
        }
    }

    static {
        ACTIONS_17.add((byte) 4);
        ACTIONS_17.add((byte) 41);
        ACTIONS_17.add((byte) 43);
        ACTIONS_17.add((byte) 46);
        ACTIONS_17.add((byte) 48);
        ACTIONS_17.add((byte) 50);
    }
}
