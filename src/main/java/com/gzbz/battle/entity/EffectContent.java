package com.gzbz.battle.entity;

import com.gzbz.battle.effectFunc.EffectFunc;
import com.gzbz.model.SkillModel;
import java.io.Serializable;

public class EffectContent implements Serializable {
   public int skillId;
   public int effectId;
   public int useTimes;
   public SkillModel skillModel;
   public EffectFunc func;
}
