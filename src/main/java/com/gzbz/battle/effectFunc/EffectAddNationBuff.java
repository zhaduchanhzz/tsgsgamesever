package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.HeroModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashSet;
import java.util.List;

@EffectAnno(
   effect = 33
)
public class EffectAddNationBuff extends EffectFunc {
   public static final String BUFF_ID = "buffId";
   public static final String[] NATION_TYPE = new String[]{"nationType1", "nationType2", "nationType3", "nationType4", "nationType5"};

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      int buffId = (Integer)model.getFuncParam().get("buffId");
      HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", source.getId());
      int nation = heroModel.getNation();
      if (heroModel.getNation() == 10) {
         nation = source.inheritNation;
      }

      HashSet<Integer> nationSet = new HashSet();

      for(String nationName : NATION_TYPE) {
         if (model.getFuncParam().containsKey(nationName)) {
            nationSet.add(model.getFuncParam().get(nationName));
         }
      }

      if (nationSet.size() == 0) {
         nationSet.add(nation);
      }

      int nationNum = 0;

      for(Entity team : source.getPkTeam().getEntityMap().values()) {
         if (team.getTeamPos() >= 0 && team.getTeamPos() <= 4) {
            heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", team.getId());
            nation = heroModel.getNation();
            if (heroModel.getNation() == 10) {
               nation = team.inheritNation;
            }

            if (nationSet.contains(nation)) {
               ++nationNum;
            }
         }
      }

      for(int i = 0; i < nationNum; ++i) {
         target.getBuffManager().addBuff(action, buffId, source, event);
      }

      return true;
   }
}
