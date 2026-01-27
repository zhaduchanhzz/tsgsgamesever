package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "stonehengeBuff"
)
public class StonehengeBuffModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "buff类型"
   )
   private int buffType;
   @ModelColumnAnno(
      comment = "buff品质"
   )
   private int buffQuality;
   @ModelColumnAnno(
      comment = "技能id"
   )
   private int skillId;
   @ModelColumnAnno(
      comment = "基础属性加成(总是对全体武将生效)",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1
   )
   private final ArrayList<PropertyModel> buffs = new ArrayList();
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;
   @ModelColumnAnno(
      comment = "是否随机只对阵容中的单个武将生效"
   )
   private int heroTakeEffect;

   public int getId() {
      return this.id;
   }

   public int getBuffType() {
      return this.buffType;
   }

   public int getSkillId() {
      return this.skillId;
   }

   public ArrayList<PropertyModel> getBuffs() {
      return this.buffs;
   }

   public int getWeight() {
      return this.weight;
   }

   public boolean checkCon(int buffType, int buffQuality, List<Integer> hasList) {
      return this.buffType == buffType && this.buffQuality == buffQuality && !hasList.contains(this.id);
   }

   public boolean randomEffect() {
      return this.heroTakeEffect == 1;
   }
}
