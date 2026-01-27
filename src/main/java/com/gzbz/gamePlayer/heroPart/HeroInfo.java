package com.gzbz.gamePlayer.heroPart;

import com.gzbz.db.HeroDao;
import com.gzbz.model.HeroModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashMap;
import java.util.Map;

public class HeroInfo {
   private int playerId;
   private HeroDao heroDao;
   private int id;
   private int lv;
   private int star;
   private int shareId;
   private boolean isSameNation = true;
   private Map<Integer, Integer> skills = new HashMap();
   private Map<Integer, Integer> warcrafts = new HashMap();

   public HeroInfo(int playerId, HeroDao heroDao, int id, int shareId, int lv, int star, boolean isSameNation, Map<Integer, Integer> skills, Map<Integer, Integer> warcrafts) {
      this.playerId = playerId;
      this.heroDao = heroDao;
      this.id = id;
      this.lv = lv;
      this.star = star;
      this.shareId = shareId;
      this.isSameNation = isSameNation;
      this.skills = skills;
      this.warcrafts = warcrafts;
   }

   public HeroDao getHeroDaoForPalace() {
      HeroDao newHeroDao = new HeroDao();
      newHeroDao.playerId = this.playerId;
      newHeroDao.code = this.heroDao.code;
      newHeroDao.id = this.id;
      newHeroDao.setLv(this.lv);
      newHeroDao.exp = this.heroDao.exp;
      newHeroDao.quality = this.heroDao.quality;
      newHeroDao.setStar(this.star);
      newHeroDao.upStarId = this.heroDao.upStarId;
      newHeroDao.setBreachLv(this.heroDao.getBreachLv());
      newHeroDao.runeLv = this.heroDao.runeLv;
      if (this.isSameNation) {
         newHeroDao.aide = this.heroDao.aide;
         newHeroDao.aide2 = this.heroDao.aide2;
      }

      newHeroDao.equips = this.heroDao.equips;
      newHeroDao.castSouls = this.heroDao.castSouls;
      newHeroDao.warriors = this.heroDao.warriors;
      newHeroDao.warcrafts = this.warcrafts;
      newHeroDao.ornament = this.heroDao.ornament;
      newHeroDao.runeStone = this.heroDao.runeStone;
      newHeroDao.warFlag = this.heroDao.warFlag;
      newHeroDao.talent = this.heroDao.talent;
      newHeroDao.strengthSkill = this.heroDao.strengthSkill;
      newHeroDao.isLockStone = this.heroDao.isLockStone;
      newHeroDao.exTreasure = this.heroDao.exTreasure;
      newHeroDao.warHorse = this.heroDao.warHorse;
      newHeroDao.type = this.heroDao.type;
      newHeroDao.strengthLev = this.heroDao.strengthLev;
      newHeroDao.palaceWatchHeroId = this.shareId;
      newHeroDao.palaceWatchHeroSkills.putAll(this.skills);
      newHeroDao.flushTotalProperties();
      return newHeroDao;
   }

   public HeroInfo(int playerId, HeroDao heroDao, int id, int lv, int star) {
      this.playerId = playerId;
      this.heroDao = heroDao;
      this.id = id;
      this.lv = lv;
      this.star = star;
   }

   public HeroDao getHeroDaoForDragonWar() {
      HeroDao newHeroDao = new HeroDao();
      newHeroDao.playerId = this.playerId;
      newHeroDao.code = this.heroDao.code;
      newHeroDao.id = this.id;
      HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", this.id);
      newHeroDao.type = heroModel != null ? heroModel.getHeroSpType() : 0;
      newHeroDao.setLv(this.lv);
      newHeroDao.exp = this.heroDao.exp;
      newHeroDao.quality = this.heroDao.quality;
      newHeroDao.setStar(this.star);
      newHeroDao.upStarId = this.heroDao.upStarId;
      newHeroDao.setBreachLv(6);
      newHeroDao.inheritNation = this.heroDao.inheritNation;
      return newHeroDao;
   }

   public static HeroDao getHeroDaoForStonehenge(HeroDao heroDao) {
      HeroDao newHeroDao = new HeroDao();
      if (heroDao == null) {
         return newHeroDao;
      } else {
         newHeroDao.playerId = heroDao.playerId;
         newHeroDao.code = heroDao.code;
         newHeroDao.id = heroDao.id;
         newHeroDao.type = heroDao.type;
         newHeroDao.invalidTime = heroDao.invalidTime;
         newHeroDao.setLv(heroDao.getLv());
         newHeroDao.setStar(heroDao.getStar());
         newHeroDao.talent = heroDao.talent;
         newHeroDao.starMap = heroDao.starMap;
         newHeroDao.setStarMapTotalLv(heroDao.getStarMapTotalLv());
         newHeroDao.warcrafts = heroDao.warcrafts;
         newHeroDao.warriors = heroDao.warriors;
         newHeroDao.equips = heroDao.equips;
         newHeroDao.strengthLev = heroDao.strengthLev;
         newHeroDao.strengthSkill = heroDao.strengthSkill;
         newHeroDao.property_totem = heroDao.property_totem;
         newHeroDao.castSouls = heroDao.castSouls;
         newHeroDao.heroCastSoulSkills = heroDao.heroCastSoulSkills;
         newHeroDao.ornament = heroDao.ornament;
         newHeroDao.rune = heroDao.rune;
         newHeroDao.godBeastItem = heroDao.godBeastItem;
         newHeroDao.exclusiveWeaponMap = heroDao.exclusiveWeaponMap;
         newHeroDao.armyArrayGrids = heroDao.armyArrayGrids;
         newHeroDao.armyArraySkill = heroDao.armyArraySkill;
         newHeroDao.use_artifact = false;
         newHeroDao.use_beauty = false;
         newHeroDao.use_divine_generals = false;
         newHeroDao.use_treasure = false;
         newHeroDao.use_title = false;
         newHeroDao.use_union = false;
         newHeroDao.use_pet = false;
         newHeroDao.use_dragon = false;
         newHeroDao.use_king = false;
         newHeroDao.use_palace = false;
         newHeroDao.use_promote = false;
         newHeroDao.use_aide_no_cal = false;
         newHeroDao.use_world_paint = false;
         newHeroDao.use_soul_palace = false;
         newHeroDao.use_hero_card = false;
         newHeroDao.use_dragon_vein = true;
         newHeroDao.setBreachLv(heroDao.getBreachLv());
         newHeroDao.inheritNation = heroDao.inheritNation;
         return newHeroDao;
      }
   }
}
