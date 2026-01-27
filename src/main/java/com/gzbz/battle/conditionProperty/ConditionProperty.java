package com.gzbz.battle.conditionProperty;

import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import java.io.Serializable;

public class ConditionProperty implements Serializable {
   public int propertyId;
   public SkillModel skillModel;
   public SkillEffectModel skillEffectModel;
}
