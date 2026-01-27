package com.gzbz.activity.bean.decisiveBattle;

import com.gzbz.db.HeroDao;
import com.gzbz.gameDefine.WarriorSignetDefine;
import com.gzbz.gamePlayer.playerBag.OrnamentItem;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.model.HeroModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecisiveHeroInfo {
   public int code;
   public int heroId;
   public Map<CommonMsg.WearPosition, DecisiveWarriorSinet> warriorSignetMap = new HashMap();
   public Map<CommonMsg.WearPosition, Integer> warcraftMap = new HashMap();
   public Map<Integer, Integer> talent = new HashMap();
   public Map<Integer, OrnamentItem> ornament = new HashMap();
   public int inheritNation;

   public HeroDao getHeroDao(int code, int lv, int star, int playerId) {
      HeroDao heroDao = new HeroDao();
      HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", this.heroId);
      if (heroModel == null) {
         return null;
      } else {
         heroDao.playerId = playerId;
         heroDao.code = code;
         heroDao.id = this.heroId;
         heroDao.type = heroModel.getHeroSpType();
         heroDao.setLv(lv);
         heroDao.exp = 0L;
         heroDao.quality = heroModel.getQuality();
         heroDao.setStar(star);
         heroDao.setBreachLv(6);
         heroDao.warcrafts.clear();

         for(Map.Entry<CommonMsg.WearPosition, Integer> entry : this.warcraftMap.entrySet()) {
            heroDao.warcrafts.put(((CommonMsg.WearPosition)entry.getKey()).getNumber(), entry.getValue());
         }

         heroDao.warriors.clear();

         for(Map.Entry<CommonMsg.WearPosition, DecisiveWarriorSinet> entry : this.warriorSignetMap.entrySet()) {
            if (entry.getValue() != null) {
               WarriorSignet signet = new WarriorSignet();
               signet.id = ((DecisiveWarriorSinet)entry.getValue()).id;
               signet.skills.addAll(((DecisiveWarriorSinet)entry.getValue()).skills);
               List<Integer> skillIdList = WarriorSignetDefine.getSkillIdList(((DecisiveWarriorSinet)entry.getValue()).id);
               signet.skills.addAll(skillIdList);

               for(PropertyModel property : ((DecisiveWarriorSinet)entry.getValue()).properties) {
                  if (property != null) {
                     signet.properties.add(new PropertyModel(property.getType(), property.getWay(), property.getValue()));
                  }
               }

               signet.score = ((DecisiveWarriorSinet)entry.getValue()).score;
               heroDao.warriors.put(((CommonMsg.WearPosition)entry.getKey()).getNumber(), signet);
            }
         }

         heroDao.ornament.clear();

         for(Map.Entry<Integer, OrnamentItem> entry : this.ornament.entrySet()) {
            heroDao.ornament.put(entry.getKey(), entry.getValue());
         }

         heroDao.talent.clear();

         for(Map.Entry<Integer, Integer> entry : this.talent.entrySet()) {
            List<Integer> tempList = new ArrayList();
            tempList.add(5);
            tempList.add(entry.getValue());
            heroDao.talent.put(entry.getKey(), tempList);
         }

         heroDao.inheritNation = this.inheritNation;
         heroDao.doFlushTotalPropertiesForDecisiveBattle(code);
         return heroDao;
      }
   }
}
