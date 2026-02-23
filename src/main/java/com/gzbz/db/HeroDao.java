package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.gzbz.activity.part.DecisiveBattlePart;
import com.gzbz.battle.BattleMisc;
import com.gzbz.db.bean.ArmyArrayData;
import com.gzbz.dragonVein.DragonVeinDefine;
import com.gzbz.dragonVein.part.DragonVeinPart;
import com.gzbz.duel.DuelPart;
import com.gzbz.exclusiveWeapon.EWeaponDefine;
import com.gzbz.exclusiveWeapon.bean.ExclusiveWeaponItem;
import com.gzbz.exclusiveWeapon.part.ExclusiveWeaponPart;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.StarMapDefine;
import com.gzbz.gameDefine.WarriorSignetDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.equip.EquipStrengthPart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroPalacePart;
import com.gzbz.gamePlayer.horse.WarHorse;
import com.gzbz.gamePlayer.monarch.MonarchPart;
import com.gzbz.gamePlayer.playerBag.ArtifactPart;
import com.gzbz.gamePlayer.playerBag.EquipItem;
import com.gzbz.gamePlayer.playerBag.ExclusiveTreasure;
import com.gzbz.gamePlayer.playerBag.ExclusiveTreasurePart;
import com.gzbz.gamePlayer.playerBag.HeroDressPart;
import com.gzbz.gamePlayer.playerBag.OrnamentItem;
import com.gzbz.gamePlayer.playerBag.RuneStoneItem;
import com.gzbz.gamePlayer.playerBag.StarMapPoint;
import com.gzbz.gamePlayer.playerBag.Totem;
import com.gzbz.gamePlayer.playerBag.TotemPart;
import com.gzbz.gamePlayer.playerBag.WarFlag;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.gamePlayer.playerBag.bean.ExclusiveResetData;
import com.gzbz.godBeast.GodBeastDefine;
import com.gzbz.godBeast.NeiDanDefine;
import com.gzbz.godBeast.bean.GodBeastItem;
import com.gzbz.godBeast.bean.NeiDanSkillAndPro;
import com.gzbz.heroCard.part.HeroCardPart;
import com.gzbz.model.AideLevelModel;
import com.gzbz.model.CountryWarFlagBasicModel;
import com.gzbz.model.EquipCastModel;
import com.gzbz.model.EquipEnchantHotModel;
import com.gzbz.model.EquipRefineModel;
import com.gzbz.model.ExclusiveTreasureActivationModel;
import com.gzbz.model.ExclusiveTreasureBaseModel;
import com.gzbz.model.ExclusiveTreasureExtraModel;
import com.gzbz.model.ExclusiveTreasureStoneModel;
import com.gzbz.model.FormationGemLvUpModel;
import com.gzbz.model.FormationGemRangeModel;
import com.gzbz.model.FormationGemSetModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.GradingSystemModel;
import com.gzbz.model.HeroBreachModel;
import com.gzbz.model.HeroDressModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.HeroUpStarModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.ItemPropertyModel;
import com.gzbz.model.LeaderPalaceSkillConsumeModel;
import com.gzbz.model.LeaderTacticsSkillModel;
import com.gzbz.model.RuneBasicNatureModel;
import com.gzbz.model.RuneMainModel;
import com.gzbz.model.RuneRefineLvNatureModel;
import com.gzbz.model.RuneStarNatureModel;
import com.gzbz.model.RuneSuitModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillKingModel;
import com.gzbz.model.SkillKingTalentModel;
import com.gzbz.model.SkillModel;
import com.gzbz.model.StampBasicPropertyModel;
import com.gzbz.model.StampModel;
import com.gzbz.model.StampSetModel;
import com.gzbz.model.StarAspectRumModel;
import com.gzbz.model.StarMapTypeModel;
import com.gzbz.model.StarSkillModel;
import com.gzbz.model.TalentLevelModel;
import com.gzbz.model.TalentSkillModel;
import com.gzbz.model.UpgradeModel;
import com.gzbz.model.WarFlagModel;
import com.gzbz.model.WarHorseArtificeAttModel;
import com.gzbz.model.WarHorseBaseModel;
import com.gzbz.model.WarHorseExclusiveModel;
import com.gzbz.model.WarHorseLevelModel;
import com.gzbz.model.WarHorseSkillModel;
import com.gzbz.model.WarriorSignetSkillModel;
import com.gzbz.model.fun.AideLevelPropertyModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.ValListFun;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.robot.MonsterManager;
import com.gzbz.rune.bean.Rune;
import com.gzbz.rune.bean.RuneItem;
import com.gzbz.rune.bean.RunePropertiesAndSkills;
import com.gzbz.rune.bean.RuneRefineInheritItem;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.war.jingzhou.TreasurePart;
import com.gzbz.worldMgr.WorldMgr;
import com.gzbz.worldPaint.WorldPaintDefine;
import com.gzbz.worldPaint.WorldPaintExtend;
import com.gzbz.worldPaint.WorldPaintInfo;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import misc.BitMap;
import misc.DataUtils;
import misc.JsonUtil;
import misc.MapUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

@DBTableAnno(
   name = "tb_hero_bag",
   resultType = 2,
   selectKey = {"playerId"},
   mapKey = {"code"}
)
public class HeroDao extends DBDao {
   @DBColumnAnno(
      skip = true
   )
   private static Logger logger = LoggerFactory.getLogger(HeroDao.class);
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id",
      index = 0
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "英雄编号",
      index = 0
   )
   public int code;
   @DBColumnAnno(
      comment = "英雄模板id"
   )
   public int id;
   @DBColumnAnno(
      comment = "英雄等级"
   )
   private int lv;
   @DBColumnAnno(
      comment = "英雄经验"
   )
   public long exp;
   @DBColumnAnno(
      comment = "品质"
   )
   public int quality;
   @DBColumnAnno(
      comment = "星级",
      loadFun = "checkStar"
   )
   private int star;
   @DBColumnAnno(
      comment = "升星模板"
   )
   public int upStarId;
   @DBColumnAnno(
      comment = "进阶等级"
   )
   private int breachLv;
   @DBColumnAnno(
      comment = "英雄战力"
   )
   public long combatPower;
   @DBColumnAnno(
      comment = "符石等级"
   )
   public int runeLv;
   @DBColumnAnno(
      comment = "是否解锁专属宝物"
   )
   public boolean isLockStone;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadStateJson",
      saveFun = "saveStateJson"
   )
   private Set<Integer> states = new TreeSet();
   @DBColumnAnno(
      comment = "英雄状态"
   )
   public boolean lock;
   @DBColumnAnno(
      comment = "副将"
   )
   public int aide;
   @DBColumnAnno(
      comment = "副将2"
   )
   public int aide2;
   @DBColumnAnno(
      comment = "双副将羁绊配置id"
   )
   public int aideTrammelsId;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadEquipJson",
      saveFun = "saveEquipJson"
   )
   public Map<Integer, EquipItem> equips = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadCastSoulJson",
      saveFun = "saveCastSoulJson"
   )
   public Map<Integer, Integer> castSouls = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadWarriorSignetJson",
      saveFun = "saveWarriorSignetJson"
   )
   public Map<Integer, WarriorSignet> warriors = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadWarcraftJson",
      saveFun = "saveWarcraftJson"
   )
   public Map<Integer, Integer> warcrafts = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadOrnamentJson",
      saveFun = "saveOrnamentJson"
   )
   public Map<Integer, OrnamentItem> ornament = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadRuneStoneJson",
      saveFun = "saveRuneStoneJson"
   )
   public Map<Integer, RuneStoneItem> runeStone = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadWarFlagJson",
      saveFun = "saveWarFlagJson"
   )
   public WarFlag warFlag;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadExclusiveTreasureJson",
      saveFun = "saveExclusiveTreasureJson"
   )
   public ExclusiveTreasure exTreasure;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadRuneJson",
      saveFun = "saveRuneJson"
   )
   public Rune rune = new Rune();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadTalent",
      saveFun = "saveTalent"
   )
   public Map<Integer, List> talent = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadWarHorseJson",
      saveFun = "saveWarHorseJson"
   )
   public WarHorse warHorse;
   @DBColumnAnno(
      comment = "英雄新状态"
   )
   private long state;
   @DBColumnAnno(
      comment = "延续阵型状态保存(state已经超出范围，增加新的状态保存)",
      columnType = "TEXT",
      loadFun = "loadArrays",
      saveFun = "saveArrays"
   )
   private Set<Integer> arrays = new HashSet();
   @DBColumnAnno(
      skip = true
   )
   public BitMap stateBitMap = null;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadStrengthJson",
      saveFun = "saveStrengthJson"
   )
   public Map<Integer, Integer> strengthLev = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadStrengthSkillJson",
      saveFun = "saveStrengthSkillJson"
   )
   public Map<Integer, Integer> strengthSkill = new HashMap();
   @DBColumnAnno(
      comment = "英雄类型"
   )
   public int type;
   @DBColumnAnno(
      comment = "军阵格子",
      columnType = "TEXT",
      loadFun = "loadArmyArray",
      saveFun = "saveArmyArray"
   )
   public Set<Integer> armyArrayGrids = new HashSet();
   @DBColumnAnno(
      comment = "军阵阵眼技能",
      columnType = "TEXT",
      loadFun = "loadArmyArraySkill",
      saveFun = "saveArmyArraySkill"
   )
   public Set<Integer> armyArraySkill = new HashSet();
   @DBColumnAnno(
      comment = "星图",
      columnType = "TEXT",
      loadFun = "loadStarAtlas",
      saveFun = "saveStarAtlas"
   )
   private Set<Integer> starAtlas = new HashSet();
   @DBColumnAnno(
      comment = "星图等级(伪实时)"
   )
   private int starMapTotalLv;
   @DBColumnAnno(
      comment = "星图v2",
      columnType = "TEXT",
      loadFun = "loadStarMap",
      saveFun = "saveStarMap"
   )
   public Map<Integer, StarMapPoint> starMap = new HashMap();
   @DBColumnAnno(
      comment = "天下绘卷",
      columnType = "TEXT",
      loadFun = "loadWorldPaintInfoMap",
      saveFun = "saveWorldPaintInfoMap"
   )
   public Map<Integer, WorldPaintInfo> worldPaintInfoMap = new HashMap();
   @DBColumnAnno(
      comment = "灵兽",
      columnType = "TEXT",
      loadFun = "loadGodBeast",
      saveFun = "saveGodBeast"
   )
   public GodBeastItem godBeastItem = null;
   @DBColumnAnno(
      comment = "帝王星图技能",
      columnType = "TEXT",
      loadFun = "loadPalaceStarSkill",
      saveFun = "savePalaceStarSkill"
   )
   public Map<Integer, Integer> palaceStarSkill = new HashMap();
   @DBColumnAnno(
      comment = "继承阵营"
   )
   public int inheritNation;
   @DBColumnAnno(
      comment = "专属幻武",
      columnType = "TEXT",
      loadFun = "loadExclusiveWeaponMap",
      saveFun = "saveExclusiveWeaponMap"
   )
   public Map<Integer, ExclusiveWeaponItem> exclusiveWeaponMap = new HashMap();
   @DBColumnAnno(
      comment = "幻灵技能",
      columnType = "TEXT",
      loadFun = "loadSoulSkill",
      saveFun = "saveSoulSkill"
   )
   public Map<Integer, Integer> soulSkill = new HashMap();
   @DBColumnAnno(
      comment = "联动武将链接的武将"
   )
   public int linkCode;
   @DBColumnAnno(
      comment = "失效时间"
   )
   public int invalidTime;
   @DBColumnAnno(
      comment = "该链接武将对应的联动武将"
   )
   public int beLinkCode;
   @DBColumnAnno(
      comment = "龙脉技能",
      columnType = "TEXT",
      loadFun = "loadDragonVeinSkills",
      saveFun = "saveDragonVeinSkills"
   )
   public Set<Integer> dragonVeinSkills = new HashSet();
   @DBColumnAnno(
      skip = true
   )
   public boolean isChange = true;
   @DBColumnAnno(
      skip = true
   )
   public Map<Integer, Long> totalFightProperties = new HashMap();
   @DBColumnAnno(
      skip = true
   )
   public Map<Integer, Long> totalShowProperties = new HashMap();
   @DBColumnAnno(
      skip = true
   )
   public int totalScore;
   @DBColumnAnno(
      skip = true
   )
   public boolean isRobot = false;
   @DBColumnAnno(
      skip = true
   )
   public long nextFlushTime;
   @DBColumnAnno(
      skip = true
   )
   public Map<Integer, Long> baseProperties = new HashMap();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_all = true;
   @DBColumnAnno(
      skip = true
   )
   private boolean change_lv = true;
   @DBColumnAnno(
      skip = true
   )
   public int score_lv;
   @DBColumnAnno(
      skip = true
   )
   private boolean change_breach = true;
   @DBColumnAnno(
      skip = true
   )
   public Map<Integer, Integer> property_breach = new HashMap();
   @DBColumnAnno(
      skip = true
   )
   public long combatPower_breach;
   @DBColumnAnno(
      skip = true
   )
   public int score_breach;
   @DBColumnAnno(
      skip = true
   )
   private boolean change_star = true;
   @DBColumnAnno(
      skip = true
   )
   public Map<Integer, Integer> property_star = new HashMap();
   @DBColumnAnno(
      skip = true
   )
   public List<Integer> heroStarSkills = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public List<Integer> heroCastSoulSkills = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public long combatPower_star;
   @DBColumnAnno(
      skip = true
   )
   public int score_star;
   @DBColumnAnno(
      skip = true
   )
   private boolean change_equip = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_equips = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public int score_equip;
   @DBColumnAnno(
      skip = true
   )
   private boolean change_warriorignet = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_warriorignet = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private Set<Integer> skill_warriorignet = new HashSet();
   @DBColumnAnno(
      skip = true
   )
   public int score_warriorignet;
   @DBColumnAnno(
      skip = true
   )
   private boolean change_warcraft = true;
   @DBColumnAnno(
      skip = true
   )
   private Set<Integer> skill_warcraft = new HashSet();
   @DBColumnAnno(
      skip = true
   )
   public int score_artifact_strong;
   @DBColumnAnno(
      skip = true
   )
   public int score_union;
   @DBColumnAnno(
      skip = true
   )
   private boolean change_title = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_title = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_totem = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_totem = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_equip_cast_soul = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_equip_cast_soul = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private Map<Integer, Integer> castLvMap = new HashMap();
   @DBColumnAnno(
      skip = true
   )
   public int castPower;
   @DBColumnAnno(
      skip = true
   )
   private boolean change_hero_dress = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_hero_dress = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private List<PropertyModel> property_hero_dress_all = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public int dressId;
   @DBColumnAnno(
      skip = true
   )
   public int dressLv;
   @DBColumnAnno(
      skip = true
   )
   public int dressHeroId;
   @DBColumnAnno(
      skip = true
   )
   public long dressEndTime;
   @DBColumnAnno(
      skip = true
   )
   private boolean change_warFlag = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_warFlag = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_warFlag_hpAtk = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_ornament = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_ornament = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_ornament_skill = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private long ornament_power;
   @DBColumnAnno(
      skip = true
   )
   private Map<Integer, Long> ornamentProperties = new HashMap();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_rune_stone = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_rune_stone = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private Set<Integer> skill_rune_stone = new HashSet();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_aide = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_aide = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_aide_no_cal = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_friend;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_king = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_king_control = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_exclusive_treasure = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_exclusive_treasure = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private Set<Integer> skill_exclusive_treasure = new HashSet();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_rune = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_rune = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private Set<Integer> skill_rune = new HashSet();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_talent = true;
   @DBColumnAnno(
      skip = true
   )
   private List<Integer> skill_talent = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public long talent_power;
   @DBColumnAnno(
      skip = true
   )
   private boolean change_dragonStrengthen = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_dragonStrengthen = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_warHorse = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_warHorse = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> warHorseBasePros = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public long pwoer_herose;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> extraWarHorsePros = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_palace = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_palace = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public int palaceWatchHeroId;
   @DBColumnAnno(
      skip = true
   )
   public Map<Integer, Integer> palaceWatchHeroSkills = new HashMap();
   @DBColumnAnno(
      skip = true
   )
   public List<Integer> destinySkills = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public int palaceTitle;
   @DBColumnAnno(
      skip = true
   )
   public int shareHeroId;
   @DBColumnAnno(
      skip = true
   )
   private boolean change_duel_jade = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_duel_jade = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_star_map = true;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_star_map = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public List<Integer> skill_star_map = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_god_beast = true;
   @DBColumnAnno(
      skip = true
   )
   private List<PropertyModel> property_god_beast = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private Set<Integer> skill_god_beast = new HashSet();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_exclusive_weapon = true;
   @DBColumnAnno(
      skip = true
   )
   private List<PropertyModel> property_exclusive_weapon = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private Set<Integer> skill_exclusive_weapon = new HashSet();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_exclusive_weapon_lib = true;
   @DBColumnAnno(
      skip = true
   )
   private List<PropertyModel> property_exclusive_weapon_lib = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private List<PropertyModel> property_zhu_hou = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private List<PropertyModel> property_dragon_vein = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_property_skill_hero = false;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_skill_hero = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   private boolean change_property_skill_other = false;
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_skill_other = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public List<PropertyModel> property_temp = new ArrayList();
   @DBColumnAnno(
      skip = true
   )
   public boolean use_artifact = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_beauty = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_title = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_divine_generals = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_treasure = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_union = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_pet = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_dragon = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_king = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_palace = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_army = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_hero_dress = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_promote = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_aide_no_cal = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_world_paint = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_soul_palace = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_collect_dress = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_hero_card = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean use_dragon_vein = true;
   @DBColumnAnno(
      skip = true
   )
   private boolean change_world_paint = true;
   @DBColumnAnno(
      skip = true
   )
   private List<PropertyModel> property_world_paint = new ArrayList();

   public void loadStateJson(String data) {
      if (data.isEmpty()) {
         this.states = new TreeSet();
      } else {
         List<Integer> list = JsonUtil.jsonToList(data, Integer.class);
         if (list != null) {
            BitMap bitMap = new BitMap(new byte[8]);

            for(Integer state : list) {
               if (state == 99) {
                  bitMap.setBit(31);
               } else if (state == 98) {
                  bitMap.setBit(30);
               } else if (state == 97) {
                  bitMap.setBit(29);
               } else if (state == 96) {
                  bitMap.setBit(28);
               } else if (state == 95) {
                  bitMap.setBit(27);
               } else if (state == 94) {
                  bitMap.setBit(26);
               } else {
                  bitMap.setBit(state);
               }
            }

            this.state = BitMap.byteArrayToLong(bitMap.getByteArray());
         }
      }

   }

   public String saveStateJson() {
      return JSON.toJSONString(this.states);
   }

   public void loadEquipJson(String data) {
      if (!data.isEmpty()) {
         this.equips = new HashMap();
         if (data.startsWith("{")) {
            this.equips = JsonUtil.jsonToMap(data, Integer.class, EquipItem.class);
         } else {
            String[] _oneArray = data.split("\u0001");
            if (_oneArray.length > 0) {
               for(String s : _oneArray) {
                  String[] _twoArray = s.split("\u0002");
                  if (_twoArray.length > 1) {
                     EquipItem equipItem = new EquipItem();
                     equipItem.id = Integer.valueOf(_twoArray[1]);
                     this.equips.put(Integer.valueOf(_twoArray[0]), equipItem);
                  }
               }
            }
         }
      }

   }

   public String saveEquipJson() {
      if (this.equips.isEmpty()) {
         return "";
      } else {
         StringBuffer _sb = new StringBuffer();

         for(Map.Entry<Integer, EquipItem> entry : this.equips.entrySet()) {
            _sb.append(entry.getKey());
            _sb.append("\u0002");
            _sb.append(((EquipItem)entry.getValue()).id);
            _sb.append("\u0001");
         }

         return JSON.toJSONString(this.equips);
      }
   }

   public void loadCastSoulJson(String data) {
      if (data.isEmpty()) {
         this.castSouls = new HashMap();
      } else {
         this.castSouls = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
      }

   }

   public String saveCastSoulJson() {
      return JSON.toJSONString(this.castSouls);
   }

   public void loadWarriorSignetJson(String data) {
      if (data.isEmpty()) {
         this.warriors = new HashMap();
      } else {
         this.warriors = JsonUtil.jsonToMap(data, Integer.class, WarriorSignet.class);
      }

   }

   public String saveWarriorSignetJson() {
      return JSON.toJSONString(this.warriors);
   }

   public void loadWarcraftJson(String data) {
      if (data.isEmpty()) {
         this.warcrafts = new HashMap();
      } else {
         this.warcrafts = JsonUtil.jsonToMap(data, Integer.class, Integer.class);

         for(Integer warcraft : this.warcrafts.keySet()) {
            if ((Integer)this.warcrafts.get(warcraft) == 0) {
               this.warcrafts.remove(warcraft);
               this.updateOp();
            }
         }
      }

   }

   public String saveWarcraftJson() {
      return JSON.toJSONString(this.warcrafts);
   }

   public void loadOrnamentJson(String data) {
      if (data.isEmpty()) {
         this.ornament = new HashMap();
      } else {
         this.ornament = JsonUtil.jsonToMap(data, Integer.class, OrnamentItem.class);

         for(OrnamentItem itemBase : this.ornament.values()) {
            if (itemBase.posList.size() == 0) {
               for(Integer id : itemBase.proMap.keySet()) {
                  itemBase.posList.add(id);
               }
            }

            if (itemBase.clearPosList.size() == 0) {
               for(Integer id : itemBase.clearProMap.keySet()) {
                  itemBase.clearPosList.add(id);
               }
            }
         }
      }

   }

   public String saveOrnamentJson() {
      return JSON.toJSONString(this.ornament);
   }

   public void loadRuneStoneJson(String data) {
      if (data.isEmpty()) {
         this.runeStone = new HashMap();
      } else {
         this.runeStone = JsonUtil.jsonToMap(data, Integer.class, RuneStoneItem.class);
      }

   }

   public String saveRuneStoneJson() {
      return JSON.toJSONString(this.runeStone);
   }

   public void loadWarFlagJson(String data) {
      this.warFlag = (WarFlag)JsonUtil.jsonToBean(data, WarFlag.class);
   }

   public String saveWarFlagJson() {
      return JSON.toJSONString(this.warFlag);
   }

   public void loadExclusiveTreasureJson(String data) {
      this.exTreasure = (ExclusiveTreasure)JsonUtil.jsonToBean(data, ExclusiveTreasure.class);
   }

   public String saveExclusiveTreasureJson() {
      return JSON.toJSONString(this.exTreasure);
   }

   public void loadRuneJson(String data) {
      this.rune = (Rune)JsonUtil.jsonToBean(data, Rune.class);
   }

   public String saveRuneJson() {
      return JSON.toJSONString(this.rune);
   }

   public void loadTalent(String data) {
      if (!Objects.isNull(data) && data.length() > 0 && !data.equals("[]")) {
         this.talent = JsonUtil.jsonToMap(data, Integer.class, List.class);
      } else {
         this.talent = new HashMap();
      }

   }

   public String saveTalent() {
      return JsonUtil.beanToJson(this.talent);
   }

   public void loadWarHorseJson(String data) {
      this.warHorse = (WarHorse)JsonUtil.jsonToBean(data, WarHorse.class);
      if (this.warHorse != null) {
         if (this.warHorse.lockSkill > 0) {
            this.warHorse.lockSkilIndex.add(this.warHorse.lockSkill);
            this.warHorse.lockSkill = 0;
         }

         this.updateOp();
      }

   }

   public String saveWarHorseJson() {
      return JSON.toJSONString(this.warHorse);
   }

   public void loadArrays(String data) {
      this.arrays = DataUtils.stringToIntSet(data);
   }

   public String saveArrays() {
      return DataUtils.intSetToString(this.arrays);
   }

   private void initStateBitMap() {
      if (this.stateBitMap == null) {
         this.state &= HeroDefine.ALL_STATES;
         this.stateBitMap = new BitMap(BitMap.longToByteArray(this.state));
      }

   }

   public boolean isHaveArrayingState() {
      if ((this.state & HeroDefine.ALL_STATES) != 0L) {
         return true;
      } else {
         if (!this.arrays.isEmpty()) {
            for(CommonMsg.HeroState value : CommonMsg.HeroState.values()) {
               if (this.arrays.contains(value.getNumber())) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean isOnlyInvalidHeroAfterLeaveArraying() {
      if (this.arrays.isEmpty()) {
         return false;
      } else {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer player = worldMgr.getPlayerById(this.playerId);
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)player.getMgrPart(HeroArrayingPart.class);
         HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);

         for(Integer arrayStateNum : this.arrays) {
            Set<Integer> arrayingHeroCodes = heroArrayingPart.getArrayingHeroCodes(CommonMsg.HeroState.forNumber(arrayStateNum));
            int expectThisHeroNum = 0;
            int invalidHeroNum = 0;

            for(Integer arrayingHeroCode : arrayingHeroCodes) {
               if (arrayingHeroCode != this.code) {
                  HeroDao arrayingHero = heroBagPart.getHeroByCode(arrayingHeroCode);
                  ++expectThisHeroNum;
                  if (null != arrayingHero && arrayingHero.invalidTime > 0) {
                     ++invalidHeroNum;
                  }
               }
            }

            if (expectThisHeroNum == invalidHeroNum) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean isHaveOnlyArrayingState() {
      if ((this.state & HeroDefine.ARRAYING_STATES) != 0L) {
         return true;
      } else {
         if (!this.arrays.isEmpty()) {
            for(CommonMsg.HeroStateArraying value : CommonMsg.HeroStateArraying.values()) {
               if (this.arrays.contains(value.getNumber())) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean containState(int position) {
      this.initStateBitMap();
      return this.stateBitMap.getBit(position) == 1 || this.arrays.contains(position);
   }

   public void addState(int position) {
      if (position >= 1 && position <= 63) {
         this.initStateBitMap();
         this.stateBitMap.setBit(position);
         this.state = BitMap.byteArrayToLong(this.stateBitMap.getByteArray());
      } else {
         this.arrays.add(position);
      }

   }

   public void delState(int position) {
      this.initStateBitMap();
      if (position >= 1 && position <= 63) {
         this.stateBitMap.delBit(position);
         this.state = BitMap.byteArrayToLong(this.stateBitMap.getByteArray());
      } else {
         this.arrays.remove(position);
      }

   }

   public List<Integer> getStateList() {
      this.initStateBitMap();
      List<Integer> statesList = new ArrayList();

      for(CommonMsg.HeroState value : CommonMsg.HeroState.values()) {
         if (this.stateBitMap.getBit(value.getNumber()) == 1) {
            statesList.add(value.getNumber());
         }
      }

      statesList.addAll(this.arrays);
      return statesList;
   }

   public void loadStrengthJson(String data) {
      if (data.isEmpty()) {
         this.strengthLev = new HashMap();
      } else {
         this.strengthLev = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
      }

   }

   public String saveStrengthJson() {
      return JSON.toJSONString(this.strengthLev);
   }

   public void loadStrengthSkillJson(String data) {
      if (data.isEmpty()) {
         this.strengthSkill = new HashMap();
      } else {
         this.strengthSkill = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
      }

   }

   public String saveStrengthSkillJson() {
      return JSON.toJSONString(this.strengthSkill);
   }

   public void loadArmyArray(String data) {
      if (data.isEmpty()) {
         this.armyArrayGrids = new HashSet();
      } else {
         List<String> list = Splitter.on("|").splitToList(data);
         list.forEach((value) -> this.armyArrayGrids.add(Integer.parseInt(value)));
      }

   }

   public String saveArmyArray() {
      return Joiner.on("|").join(this.armyArrayGrids);
   }

   public void loadArmyArraySkill(String data) {
      if (data.isEmpty()) {
         this.armyArraySkill = new HashSet();
      } else {
         List<String> list = Splitter.on("|").splitToList(data);
         list.forEach((value) -> this.armyArraySkill.add(Integer.parseInt(value)));
      }

   }

   public String saveArmyArraySkill() {
      return Joiner.on("|").join(this.armyArraySkill);
   }

   public void loadStarAtlas(String data) {
      if (data.isEmpty()) {
         this.starAtlas = new HashSet();
      } else {
         List<String> list = Splitter.on("|").splitToList(data);
         list.forEach((value) -> this.starAtlas.add(Integer.parseInt(value)));
      }

   }

   public String saveStarAtlas() {
      return Joiner.on("|").join(this.starAtlas);
   }

   public void loadStarMap(String data) {
      if (data.isEmpty()) {
         this.starMap = new HashMap();
      } else {
         this.starMap = JsonUtil.jsonToMap(data, Integer.class, StarMapPoint.class);
      }

   }

   public String saveStarMap() {
      return JSON.toJSONString(this.starMap);
   }

   public void loadWorldPaintInfoMap(String data) {
      if (data.isEmpty()) {
         this.worldPaintInfoMap = new HashMap();
      } else {
         this.worldPaintInfoMap = JsonUtil.jsonToMap(data, Integer.class, WorldPaintInfo.class);
      }

   }

   public String saveWorldPaintInfoMap() {
      return null != this.worldPaintInfoMap && !this.worldPaintInfoMap.isEmpty() ? JSON.toJSONString(this.worldPaintInfoMap) : "";
   }

   public void loadGodBeast(String data) {
      if (!StringUtils.isBlank(data)) {
         this.godBeastItem = (GodBeastItem)JsonUtil.jsonToBean(data, GodBeastItem.class);
      }
   }

   public String saveGodBeast() {
      return null == this.godBeastItem ? "" : JSON.toJSONString(this.godBeastItem);
   }

   public void loadPalaceStarSkill(String data) {
      if (data.isEmpty()) {
         this.palaceStarSkill = new HashMap();
      } else {
         this.palaceStarSkill = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
      }

   }

   public String savePalaceStarSkill() {
      return JSON.toJSONString(this.palaceStarSkill);
   }

   public void loadExclusiveWeaponMap(String data) {
      if (StringUtils.isBlank(data)) {
         this.exclusiveWeaponMap = new HashMap();
      } else {
         this.exclusiveWeaponMap = JsonUtil.jsonToMap(data, Integer.class, ExclusiveWeaponItem.class);
      }

   }

   public String saveExclusiveWeaponMap() {
      return null != this.exclusiveWeaponMap && !this.exclusiveWeaponMap.isEmpty() ? JSON.toJSONString(this.exclusiveWeaponMap) : "";
   }

   public void loadSoulSkill(String data) {
      if (StringUtils.isBlank(data)) {
         this.soulSkill = new HashMap();
      } else {
         this.soulSkill = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
      }

   }

   public String saveSoulSkill() {
      return null != this.soulSkill && !this.soulSkill.isEmpty() ? JSON.toJSONString(this.soulSkill) : "";
   }

   public void loadDragonVeinSkills(String data) {
      this.dragonVeinSkills = DataUtils.stringToIntSet(data);
   }

   public String saveDragonVeinSkills() {
      return DataUtils.intSetToString(this.dragonVeinSkills);
   }

   public long getCombatPower() {
      this.flushTotalProperties();
      return this.combatPower;
   }

   public int getDressHeroId() {
      return this.dressHeroId > 0 ? this.dressHeroId : this.id;
   }

   public Map<Integer, Long> getFightProperties() {
      return this.totalFightProperties;
   }

   public Map<Integer, Long> getClientShowProperties() {
      return this.totalShowProperties;
   }

   public Totem getTotem() {
      if (this.isRobot) {
         return null;
      } else {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer player = worldMgr.getPlayerById(this.playerId);
         TotemPart totemPart = (TotemPart)player.getMgrPart(TotemPart.class);
         return totemPart.getTotemByHeroCode(this.code);
      }
   }

   public Set<Integer> getActiveDressIds() {
      Set<Integer> activeDressIds = new HashSet();
      if (this.isRobot) {
         return activeDressIds;
      } else {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer player = worldMgr.getPlayerById(this.playerId);
         HeroDressPart dressPart = (HeroDressPart)player.getMgrPart(HeroDressPart.class);
         activeDressIds = dressPart.getActiveDressIdByHeroId(this.id, false);
         return activeDressIds;
      }
   }

   public ArmyArrayData getArmyArrayData(int grid) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer player = worldMgr.getPlayerById(this.playerId);
      ArmyArrayDao armyArrayDao = (ArmyArrayDao)player.getData("tb_army_array", player.getPlayerId());
      return (ArmyArrayData)armyArrayDao.arrayDataMap.get(grid);
   }

   public List<ArmyArrayData> getAllArmyArrayData() {
      List<ArmyArrayData> list = new ArrayList();
      if (this.armyArrayGrids.size() > 0) {
         for(int grid : this.armyArrayGrids) {
            ArmyArrayData armyArrayData = this.getArmyArrayData(grid);
            if (armyArrayData != null) {
               list.add(armyArrayData);
            }
         }
      }

      return list;
   }

   public void flushHero(HeroDefine.HeroPropertyModel model, boolean beForce, boolean flushKingFriend) {
      this.isChange = true;
      switch (model) {
         case MODEL_HERO_UP_LV:
            this.change_lv = true;
            this.change_property_skill_hero = true;
            this.change_star_map = true;
            break;
         case MODEL_HERO_UP_STAR:
            this.change_star = true;
            this.change_breach = true;
            break;
         case MODEL_HERO_UP_BREACH:
            this.change_breach = true;
            this.change_star = true;
            break;
         case MODEL_WEAR_EQUIP:
            this.change_equip = true;
            this.change_equip_cast_soul = true;
            break;
         case MODEL_WEAR_WARCRAFT:
            this.change_warcraft = true;
            break;
         case MODEL_WEAR_WARRIORSIGNET:
            this.change_warriorignet = true;
            break;
         case MODEL_ARTIFACT_TITLE:
            this.change_title = true;
            break;
         case MODEL_TOTEM:
            this.change_totem = true;
            break;
         case MODEL_EQUIP_CAST_SOUL:
            this.change_equip_cast_soul = true;
            break;
         case MODEL_HERO_DRESS:
            this.change_hero_dress = true;
            this.change_property_skill_hero = true;
            break;
         case MODEL_WEAR_ORNAMENT:
            this.change_ornament = true;
            break;
         case MODEL_WEAR_WAR_FALG:
            this.change_warFlag = true;
            break;
         case MODEL_RUNE_STONE:
            this.change_rune_stone = true;
            this.change_property_skill_other = true;
            break;
         case MODEL_AIDE:
            this.change_aide = true;
            break;
         case MODEL_EXCLUSIVE_TREASURE:
            this.change_exclusive_treasure = true;
            this.change_property_skill_other = true;
            break;
         case MODEL_RUNE:
            this.change_rune = true;
            this.change_property_skill_other = true;
            break;
         case MODEL_HERO_TALENT:
            this.change_talent = true;
            this.change_property_skill_hero = true;
            break;
         case MODEL_DRAGON_STRENGTHEN:
            this.change_dragonStrengthen = true;
            break;
         case MODEL_WAR_HORSE:
            this.change_warHorse = true;
            break;
         case MODULE_STAR_MAP:
            this.change_star_map = true;
            this.change_property_skill_hero = true;
            break;
         case MODEL_PET:
            this.change_property_skill_other = true;
            break;
         case MODEL_EQUIP_STRENGTH:
            this.change_equip = true;
            break;
         case MODULE_HERO_PALACE:
            this.change_palace = true;
            this.change_aide = true;
            this.change_equip_cast_soul = true;
            this.change_property_skill_hero = true;
            this.change_talent = true;
            break;
         case MODULE_DUEL_JADE:
            this.change_duel_jade = true;
            break;
         case MODEL_WORLD_PAINT:
            this.change_world_paint = true;
            break;
         case MODEL_GOD_BEAST:
            this.change_god_beast = true;
            this.change_property_skill_hero = true;
            break;
         case MODEL_EXCLUSIVE_WEAPON:
            this.change_exclusive_weapon = true;
            this.change_property_skill_hero = true;
            break;
         case MODEL_EXCLUSIVE_WEAPON_LIB:
            this.change_exclusive_weapon_lib = true;
         case MODEL_ZHU_HOU:
         case MODEL_DRAGON_VEIN:
         default:
            break;
         case MODEL_ALL:
            this.change_all = true;
      }

      this.doFlushTotalProperties(beForce, flushKingFriend);
   }

   public List<Integer> getTalentSkill() {
      return this.skill_talent;
   }

   public boolean isNeedFlush() {
      if (this.state == 0L && CollectionUtils.isEmpty(this.arrays)) {
         if (this.getLv() > 1) {
            return true;
         } else if (this.getLv() == 1 && !this.equips.isEmpty()) {
            return true;
         } else {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", this.id);
            if (heroModel == null) {
               return false;
            } else if (heroModel.getHeroSpType() != HeroDefine.HERO_SP_TYPE_PALACE && heroModel.getHeroSpType() != HeroDefine.HERO_SP_TYPE_LINK) {
               if (this.getLv() == 1 && this.getStar() <= 5) {
                  return false;
               } else {
                  return this.getStar() > heroModel.getStar();
               }
            } else {
               return true;
            }
         }
      } else {
         return true;
      }
   }

   public void flushTotalProperties() {
      if (System.currentTimeMillis() > this.nextFlushTime) {
         this.doFlushTotalProperties(false, false);
      }

   }

   private void doFlushTotalProperties(boolean beForce, Boolean flushKingFriend) {
      this.nextFlushTime = System.currentTimeMillis() + 10000L;
      this.flushHeroDress();
      if (this.isChange) {
         this.isChange = false;
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);
         if (heroModel != null) {
            if (heroModel.getStar() > this.getStar()) {
               logger.info("玩家={}，英雄ID={},英雄={}，code={}，星级调整，从{}到{}", new Object[]{this.playerId, this.id, heroModel.getName(), this.code, this.getStar(), heroModel.getStar()});
               this.setStar(heroModel.getStar());
               this.updateOp();
               this.change_all = true;
            }

            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            GamePlayer gamePlayer = worldMgr.getPlayerById(this.playerId);
            if (gamePlayer.isRobot()) {
               this.isRobot = true;
            }

            this.baseProperties = heroModel.getProperty();
            if (this.type == HeroDefine.HERO_SP_TYPE_PALACE) {
               if (this.palaceWatchHeroId > 0) {
                  HeroModel palaceHeroModel = (HeroModel)gameModelPool.getEntity("hero", this.palaceWatchHeroId);
                  this.baseProperties = palaceHeroModel.getProperty();
               } else {
                  HeroPalacePart heroPalacePart = (HeroPalacePart)gamePlayer.getMgrPart(HeroPalacePart.class);
                  HeroPalaceDao heroPalaceDao = heroPalacePart.getHeroPalaceDao();
                  if (heroPalaceDao.shareCode > 0) {
                     Map<Integer, HeroDao> map = gamePlayer.<Integer, HeroDao>getMap("tb_hero_bag", gamePlayer.getPlayerId());
                     HeroDao shareHeroDao = (HeroDao)map.get(heroPalaceDao.shareCode);
                     if (shareHeroDao != null) {
                        HeroModel palaceHeroModel = (HeroModel)gameModelPool.getEntity("hero", shareHeroDao.id);
                        this.baseProperties = palaceHeroModel.getProperty();
                     }
                  }
               }
            }

            if (!beForce && !this.isNeedFlush()) {
               this.totalFightProperties = this.baseProperties;
               this.totalShowProperties = this.baseProperties;
               this.combatPower = this.calBasePropertyPower(this.baseProperties);
            } else {
               this.flushHeroLv();
               this.flushHeroBreach();
               this.flushHeroStar();
               this.flushEquip();
               this.flushWarriorSignet();
               this.flushWarcraft();
               this.flushArtifactStrongScore();
               this.flushTitle();
               this.flushUnionScore();
               this.flushTotem();
               this.flushEquipCastSoul();
               this.flushWarFlag();
               this.flushAide();
               this.flushStarMap();
               this.flushGodBeast();
               this.flushExclusiveWeapon();
               this.flushExclusiveWeaponLib();
               this.flushRuneStone();
               this.flushExclusiveTreasure();
               this.flushRune();
               this.flushPalace(gamePlayer);
               this.flushTalent(gamePlayer, heroModel);
               this.flushDragonStrengthen();
               this.flushWarHorse();
               this.flushWorldPaint();
               this.flushHeroDuelJade();
               this.flushHeroCard();
               this.flushDragonVein();
               this.flushHeroSkill(heroModel);
               this.flushOtherSkill();
               this.flushFriend(heroModel);
               this.flushKingControl(flushKingFriend);
               this.flushKingToKing(flushKingFriend);
               this.totalSettle();
               this.change_all = false;
            }
         }
      }
   }

   public void totalSettle() {
      this.flushOrnament();
      this.calTotalScore();
      this.calTotalPorperty();
      this.checkKingFLush();
   }

   public void checkKingFLush() {
      if (!this.isRobot && this.use_king) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer player = worldMgr.getPlayerById(this.playerId);
         HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
         heroBagPart.checkFlushControl(this);
      }
   }

   private void flushHeroLv() {
      if (this.change_lv || this.change_all) {
         this.change_lv = false;
         ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
         int generalsRating = configManager.getInt("GeneralsRating");
         this.score_lv = generalsRating * this.getLv() + 50;
      }
   }

   private void flushHeroBreach() {
      if (this.change_breach || this.change_all) {
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.getDressHeroId());
         if (!HeroModel.isReplacementHero(heroModel.getId())) {
            HashMap<Integer, Integer> propertyMap = new HashMap();
            long combatPower = 0L;
            List<Integer> tempUnlockSkills = new ArrayList();
            tempUnlockSkills.add(heroModel.getSkills().get(1));
            tempUnlockSkills.add(heroModel.getSkills().get(2));

            for(int i = 0; i <= this.getBreachLv(); ++i) {
               HeroBreachModel heroBreachModel = (HeroBreachModel)gameModelPool.getEntity("heroBreach", i);
               HashMap<Integer, Integer> map = new HashMap();
               map.put(1, heroBreachModel.getHpAward());
               map.put(2, heroBreachModel.getAtkAward());
               map.put(3, heroBreachModel.getDefAward());
               map.put(4, heroBreachModel.getSpdAward());
               MapUtil.mapMergeInt(propertyMap, map);
               UpgradeModel upgradeModel = (UpgradeModel)gameModelPool.getEntity("upgrade", i);
               if (upgradeModel != null) {
                  combatPower += (long)upgradeModel.getBreachAddCombat();
               }

               if (heroBreachModel.getUnlockSkillIndex() > 0 && heroModel.getSkills().size() >= heroBreachModel.getUnlockSkillIndex()) {
                  int skillId = (Integer)heroModel.getSkills().get(heroBreachModel.getUnlockSkillIndex());
                  tempUnlockSkills.add(skillId);
                  this.change_property_skill_hero = true;
               }
            }

            this.change_breach = false;
            this.property_breach = propertyMap;
            this.combatPower_breach = combatPower;
            this.heroStarSkills = tempUnlockSkills;
            int tempBreachLv = 0;
            if (tempBreachLv > 6) {
               tempBreachLv = 6;
            } else {
               tempBreachLv = this.getBreachLv();
            }

            GradingSystemModel gradingSystemModel = (GradingSystemModel)gameModelPool.getEntity("gradingSystem", tempBreachLv);
            this.score_breach = gradingSystemModel.getHeroAdvanced();
         }
      }
   }

   private void flushHeroDuelJade() {
      if (this.change_duel_jade || this.change_all) {
         this.change_duel_jade = false;
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer player = worldMgr.getPlayerById(this.playerId);
         if (player != null) {
            DuelPart duelPart = (DuelPart)player.getMgrPart(DuelPart.class);
            List<PropertyModel> proList = duelPart.getJadePro();
            List<PropertyModel> tempList = new ArrayList();

            for(PropertyModel model : proList) {
               tempList.add(new PropertyModel(model.getType(), model.getWay(), model.getValue()));
            }

            this.property_duel_jade = tempList;
         }
      }
   }

   private void flushHeroStar() {
      if (this.change_star || this.change_all) {
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.getDressHeroId());
         int nextUpStarId = heroModel.getUpStarId();
         HashMap<Integer, Integer> tempTotalPropertyMap = new HashMap();
         int starLoop = 0;
         long combatPower = 0L;
         HeroUpStarModel heroUpStarModel = null;
         int loop = 0;

         while(this.getStar() - heroModel.getStar() > starLoop) {
            ++loop;
            heroUpStarModel = (HeroUpStarModel)gameModelPool.getEntity("heroUpStar", nextUpStarId);
            if (heroUpStarModel == null) {
               break;
            }

            ++starLoop;
            nextUpStarId = heroUpStarModel.getNext();
            HashMap<Integer, Integer> propertyMap = new HashMap();
            if (heroUpStarModel != null) {
               propertyMap.put(1, heroUpStarModel.getHpAward());
               propertyMap.put(2, heroUpStarModel.getAtkAward());
               propertyMap.put(3, heroUpStarModel.getDefAward());
               propertyMap.put(4, heroUpStarModel.getSpdAward());
               propertyMap.put(11, heroUpStarModel.getResistAward());
            }

            MapUtil.mapMergeInt(tempTotalPropertyMap, propertyMap);
            int skillSlot = heroUpStarModel.getSkillSlot();
            int size = this.heroStarSkills.size();
            switch (skillSlot) {
               case 1:
               case 2:
               case 3:
               case 4:
                  if (size > skillSlot) {
                     int newSkill = (Integer)heroUpStarModel.getNewSkillList().get(0);
                     this.heroStarSkills.set(skillSlot, newSkill);
                     this.change_property_skill_hero = true;
                  }
                  break;
               case 5:
                  for(int i = 0; i < heroUpStarModel.getNewSkillList().size(); ++i) {
                     if (size > i + 1) {
                        this.heroStarSkills.set(i + 1, heroUpStarModel.getNewSkillList().get(i));
                        this.change_property_skill_hero = true;
                     }
                  }
            }

            if (loop > 999) {
               break;
            }
         }

         UpgradeModel upgradeModel = (UpgradeModel)gameModelPool.getEntity("upgrade", this.getStar());
         if (upgradeModel != null) {
            combatPower += (long)upgradeModel.getStarAddCombat();
         }

         this.change_star = false;
         this.property_star = tempTotalPropertyMap;
         this.combatPower_star = combatPower;
         GradingSystemModel gradingSystemModel = (GradingSystemModel)gameModelPool.getEntity("gradingSystem", this.getStar());
         this.score_star = gradingSystemModel.getHeroStar();
      }
   }

   private void flushEquip() {
      if (this.change_equip || this.change_all) {
         this.change_equip = false;
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         List<PropertyModel> temp_propertyModels = new ArrayList();

         for(Map.Entry<Integer, EquipItem> entry : this.equips.entrySet()) {
            ItemModel itemModel = (ItemModel)gameModelPool.getEntity("item", ((EquipItem)entry.getValue()).id);
            if (itemModel != null) {
               if (itemModel.getTargetclass() == 12) {
                  EquipEnchantHotModel equipEnchantHotModel = (EquipEnchantHotModel)gameModelPool.getEntity("equipEnchantHot", itemModel.getId());
                  if (equipEnchantHotModel != null) {
                     for(PropertyModel propertyModel : equipEnchantHotModel.getBaseProperty()) {
                        temp_propertyModels.add(propertyModel);
                     }

                     for(PropertyModel propertyModel : equipEnchantHotModel.getExtraProperty()) {
                        temp_propertyModels.add(propertyModel);
                     }
                  }
               } else {
                  ItemPropertyModel itemPropertyModel = (ItemPropertyModel)gameModelPool.getEntity("itemProperty", itemModel.getProperty());
                  if (itemPropertyModel != null) {
                     for(int i = 0; i < itemPropertyModel.getProperties().size(); ++i) {
                        PropertyModel propertyModel = (PropertyModel)itemPropertyModel.getProperties().get(i);
                        if (i == 0) {
                           long lastValue = this.getRealRefinePro(itemModel, propertyModel);
                           if (lastValue > 0L) {
                              temp_propertyModels.add(new PropertyModel(propertyModel.getType(), propertyModel.getWay(), lastValue));
                           } else {
                              temp_propertyModels.add(propertyModel);
                           }
                        } else {
                           temp_propertyModels.add(propertyModel);
                        }
                     }

                     for(PropertyModel propertyModel : itemPropertyModel.getSuitProperty()) {
                        temp_propertyModels.add(propertyModel);
                     }
                  }

                  temp_propertyModels.addAll(this.getEquipStrengthExtra(itemModel));
               }
            }
         }

         this.property_equips = temp_propertyModels;
         int tempEquipScore = 0;

         for(Map.Entry<Integer, EquipItem> entry : this.equips.entrySet()) {
            ItemModel itemModel = (ItemModel)gameModelPool.getEntity("item", ((EquipItem)entry.getValue()).id);
            if (itemModel != null) {
               StringBuffer sb = new StringBuffer();
               sb.append(itemModel.getQuality());
               sb.append(itemModel.getStar());
               int key = Integer.parseInt(sb.toString());
               GradingSystemModel gradingSystemModel = (GradingSystemModel)gameModelPool.getEntity("gradingSystem", key);
               if (gradingSystemModel != null) {
                  tempEquipScore += gradingSystemModel.getEquipQualityStar();
               }

               if (itemModel.getTargetclass() == 12) {
                  GradingSystemModel startGradingSystemModel = (GradingSystemModel)gameModelPool.getEntity("gradingSystem", itemModel.getStar());
                  if (startGradingSystemModel != null) {
                     tempEquipScore += startGradingSystemModel.getEquipEx();
                  }
               }
            }
         }

         this.score_equip = tempEquipScore;
      }
   }

   public List<PropertyModel> getEquipStrengthExtra(ItemModel itemModel) {
      List<PropertyModel> list = new ArrayList();
      EquipRefineModel model = this.getRefineModel(itemModel);
      if (model == null) {
         return list;
      } else {
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         Map<Integer, EquipRefineModel> strengthModelMap = gameModelPool.getMap("EquipRefine");

         for(Map.Entry<Integer, EquipRefineModel> entry : strengthModelMap.entrySet()) {
            if (((EquipRefineModel)entry.getValue()).getEquipType() == itemModel.getSeat() && ((EquipRefineModel)entry.getValue()).getRefineLevel() <= model.getRefineLevel()) {
               for(PropertyModel property : ((EquipRefineModel)entry.getValue()).getAdditional()) {
                  list.add(new PropertyModel(property.getType(), property.getWay(), property.getValue()));
               }
            }
         }

         return list;
      }
   }

   public long getRealRefinePro(ItemModel itemModel, PropertyModel propertyModel) {
      long realValue = 0L;
      EquipRefineModel refineModel = this.getRefineModel(itemModel);
      if (refineModel != null && !refineModel.getBase().isEmpty() && ((PropertyModel)refineModel.getBase().get(0)).getType() == propertyModel.getType()) {
         realValue = propertyModel.getValue() * (((PropertyModel)refineModel.getBase().get(0)).getValue() + 10000L) / 10000L;
         if (refineModel.getBase().size() >= 2 && propertyModel.getType() == ((PropertyModel)refineModel.getBase().get(1)).getType()) {
            realValue += ((PropertyModel)refineModel.getBase().get(1)).getValue();
         }
      }

      return realValue;
   }

   public EquipRefineModel getRefineModel(ItemModel itemModel) {
      EquipRefineModel model = null;
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      String limit = ApplicationContextProvider.getConfigString("RefineOpenLevel", "6|4");
      String[] limitLev = limit.split("\\|");
      int limitQuality = Integer.parseInt(limitLev[0]);
      int limitStar = Integer.parseInt(limitLev[1]);
      Map<Integer, EquipRefineModel> strengthModelMap = gameModelPool.getMap("EquipRefine");
      if (itemModel == null) {
         return null;
      } else {
         if (itemModel.getQuality() >= limitQuality && itemModel.getStar() >= limitStar && this.strengthLev.containsKey(Integer.valueOf(itemModel.getSeat())) && (Integer)this.strengthLev.get(Integer.valueOf(itemModel.getSeat())) > 0) {
            for(Map.Entry<Integer, EquipRefineModel> refineModelEntry : strengthModelMap.entrySet()) {
               if (((EquipRefineModel)refineModelEntry.getValue()).getEquipType() == itemModel.getSeat() && ((EquipRefineModel)refineModelEntry.getValue()).getRefineLevel() == (Integer)this.strengthLev.get(Integer.valueOf(itemModel.getSeat()))) {
                  model = (EquipRefineModel)refineModelEntry.getValue();
                  break;
               }
            }
         }

         return model;
      }
   }

   private void flushOrnament() {
      if (this.change_ornament || this.change_all) {
         this.change_ornament = false;
         this.property_ornament.clear();
         this.property_ornament_skill.clear();
         if (!this.ornament.isEmpty() && !this.isRobot) {
            List<PropertyModel> tempPropertyList = new ArrayList();
            List<Integer> skillSet = new ArrayList();
            GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);

            for(Map.Entry<Integer, OrnamentItem> entry : this.ornament.entrySet()) {
               for(PropertyModel property : ((OrnamentItem)entry.getValue()).proMap.values()) {
                  if (property.getType() == 4) {
                     tempPropertyList.add(new PropertyModel(property.getType(), property.getWay(), property.getValue() / 100L));
                  } else {
                     tempPropertyList.add(new PropertyModel(property.getType(), property.getWay(), property.getValue()));
                  }
               }

               StampModel stampModel = (StampModel)gameModelPool.getEntity("Stamp", ((OrnamentItem)entry.getValue()).id);
               StampBasicPropertyModel baseModel = (StampBasicPropertyModel)gameModelPool.getEntity("StampBasicProperty", stampModel.getBasicPropertyType());
               if (!Objects.isNull(baseModel)) {
                  int realValue = 0;
                  if (baseModel.getNextLvValue() != 0) {
                     if (((OrnamentItem)entry.getValue()).lev == 0) {
                        realValue = baseModel.getPropertyValue();
                     } else {
                        realValue = Math.floorDiv((baseModel.getNextLvValue() - baseModel.getPropertyValue()) * ((OrnamentItem)entry.getValue()).lev, ((ResourceModel)stampModel.getLevUpConsume().get(0)).getValue()) + baseModel.getPropertyValue();
                     }
                  } else {
                     realValue = baseModel.getPropertyValue();
                  }

                  PropertyModel property = new PropertyModel(baseModel.getBasicPropertyId(), baseModel.getBasicPropertyWay(), (long)realValue);
                  tempPropertyList.add(property);
               }
            }

            Map<String, ArrayList<StampModel>> setMap = new HashMap();

            for(OrnamentItem ornamentItem : this.ornament.values()) {
               StampModel stampModel = (StampModel)gameModelPool.getEntity("Stamp", ornamentItem.id);
               if (stampModel != null) {
                  if (setMap.containsKey(stampModel.getSetType() + "-" + stampModel.getSetId())) {
                     ((ArrayList)setMap.get(stampModel.getSetType() + "-" + stampModel.getSetId())).add(stampModel);
                  } else {
                     ArrayList<StampModel> list = new ArrayList();
                     list.add(stampModel);
                     setMap.put(stampModel.getSetType() + "-" + stampModel.getSetId(), list);
                  }
               }
            }

            for(List<StampModel> stampList : setMap.values()) {
               if (stampList.size() == 4) {
                  int starMin = 100;

                  for(int i = 0; i < stampList.size(); ++i) {
                     if (starMin > ((StampModel)stampList.get(i)).getStar()) {
                        starMin = ((StampModel)stampList.get(i)).getStar();
                     }
                  }

                  StampSetModel setModel = (StampSetModel)gameModelPool.getEntity("StampSet", ((StampModel)stampList.get(0)).getSetId());
                  if (setModel.getSpSkillId().size() >= starMin) {
                     skillSet.add(setModel.getSpSkillId().get(starMin - 1));
                  }

                  int maxStar = 0;
                  Map<Integer, Integer> specialMap = new HashMap();

                  for(StampModel stampModel : stampList) {
                     MapUtil.mapPlusInt(specialMap, stampModel.getStar(), 1);
                  }

                  int minStar = Integer.MAX_VALUE;
                  if (!specialMap.isEmpty()) {
                     for(Map.Entry<Integer, Integer> entry : specialMap.entrySet()) {
                        if ((Integer)entry.getValue() >= 2 && (Integer)entry.getKey() > maxStar) {
                           maxStar = (Integer)entry.getKey();
                        }

                        if ((Integer)entry.getKey() < minStar) {
                           minStar = (Integer)entry.getKey();
                        }
                     }
                  }

                  if (maxStar > 0 && setModel.getSetSkillId().size() >= maxStar) {
                     skillSet.add(setModel.getSetSkillId().get(maxStar - 1));
                  } else if (minStar != 0) {
                     skillSet.add(setModel.getSetSkillId().get(minStar - 1));
                  }
               } else if (stampList.size() == 2) {
                  int minStar = Integer.MAX_VALUE;

                  for(StampModel stampModel : stampList) {
                     if (stampModel.getStar() < minStar) {
                        minStar = stampModel.getStar();
                     }
                  }

                  StampSetModel setModel = (StampSetModel)gameModelPool.getEntity("StampSet", ((StampModel)stampList.get(0)).getSetId());
                  if (setModel != null) {
                     skillSet.add(setModel.getSetSkillId().get(minStar - 1));
                  }
               } else if (stampList.size() == 3) {
                  int specialStar = 0;
                  int minStar = Integer.MAX_VALUE;
                  Map<Integer, Integer> specialMap = new HashMap();

                  for(StampModel stampModel : stampList) {
                     MapUtil.mapPlusInt(specialMap, stampModel.getStar(), 1);
                  }

                  for(Map.Entry<Integer, Integer> entry : specialMap.entrySet()) {
                     if ((Integer)entry.getKey() < minStar) {
                        minStar = (Integer)entry.getKey();
                     }

                     if ((Integer)entry.getValue() >= 2) {
                        specialStar = (Integer)entry.getKey();
                     }
                  }

                  StampSetModel setModel = (StampSetModel)gameModelPool.getEntity("StampSet", ((StampModel)stampList.get(0)).getSetId());
                  if (setModel != null) {
                     if (specialStar != 0) {
                        skillSet.add(setModel.getSetSkillId().get(specialStar - 1));
                     } else if (minStar != 0) {
                        skillSet.add(setModel.getSetSkillId().get(minStar - 1));
                     }
                  }
               }
            }

            this.property_ornament = tempPropertyList;
            List<Integer> effectList = getEffectsOfAddProperty(skillSet);

            for(PropertyModel property : getPropertyOfSkillEffect(effectList, this.getLvWithPromote())) {
               PropertyModel.addLvProtities(this.property_ornament_skill, property);
            }

         }
      }
   }

   private void flushWarriorSignet() {
      if (this.change_warriorignet || this.change_all) {
         this.change_warriorignet = false;
         Set<Integer> tempSkillList = new HashSet();
         List<PropertyModel> tempPropertyList = new ArrayList();
         int tempTotalSocre = 0;
         int tempMaxScore = 0;

         for(Map.Entry<Integer, WarriorSignet> entry : this.warriors.entrySet()) {
            int tempScore = 0;
            GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);

            for(Integer skillId : ((WarriorSignet)entry.getValue()).skills) {
               WarriorSignetSkillModel model = (WarriorSignetSkillModel)gameModelPool.getEntity("warriorSignetSkill", skillId);
               tempScore += model.getPower();
               tempSkillList.add(skillId);
            }

            if (tempScore > tempMaxScore) {
               tempMaxScore = tempScore;
            }

            tempTotalSocre += tempScore;
            tempPropertyList.addAll(((WarriorSignet)entry.getValue()).properties);
            WarriorSignet warriorSignet = (WarriorSignet)entry.getValue();
            List<PropertyModel> baseAttr = WarriorSignetDefine.getBaseAttr(warriorSignet.id);
            List<PropertyModel> exclusiveAttr = WarriorSignetDefine.getExclusiveAttr(warriorSignet.id);
            tempPropertyList.addAll(baseAttr);
            tempPropertyList.addAll(exclusiveAttr);
            List<Integer> skillIdList = WarriorSignetDefine.getSkillIdList(warriorSignet.id);
            tempSkillList.addAll(skillIdList);
         }

         this.property_warriorignet = tempPropertyList;
         this.skill_warriorignet = tempSkillList;
         this.score_warriorignet = tempMaxScore + tempTotalSocre;
         this.change_property_skill_other = true;
      }
   }

   private void flushArtifactStrongScore() {
      if (!this.isRobot && this.use_artifact) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer player = worldMgr.getPlayerById(this.playerId);
         ArtifactPart artifactPart = (ArtifactPart)player.getMgrPart(ArtifactPart.class);
         ArtifactDao artifactDao = artifactPart.getArtifactDao();
         if (artifactDao != null) {
            if (artifactDao.strongLv > 0) {
               GradingSystemModel gradingSystemModel = (GradingSystemModel)player.getGameModelPool().getEntity("gradingSystem", artifactDao.strongLv);
               if (gradingSystemModel.getCounsellor() > this.score_artifact_strong) {
                  this.score_artifact_strong = gradingSystemModel.getCounsellor();
               }
            }

         }
      }
   }

   private void flushWarcraft() {
      if (this.change_warcraft || this.change_all) {
         this.change_warcraft = false;
         Set<Integer> tempSet = new HashSet();

         for(Map.Entry<Integer, Integer> entry : this.warcrafts.entrySet()) {
            tempSet.add(entry.getValue());
         }

         this.skill_warcraft = tempSet;
         this.change_property_skill_other = true;
      }
   }

   private void flushUnionScore() {
      if (!this.isRobot) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer player = worldMgr.getPlayerById(this.playerId);
         HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
         HeroModel model = (HeroModel)player.getGameModelPool().getEntity("hero", this.id);
         this.score_union = heroBagPart.getUnionTechnologyLevelScore(model.getType());
      }
   }

   private void flushTitle() {
      if (!this.isRobot && this.use_title) {
         if (this.change_title || this.change_all) {
            this.change_title = false;
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            GamePlayer player = worldMgr.getPlayerById(this.playerId);
            MonarchPart monarchPart = (MonarchPart)player.getMgrPart(MonarchPart.class);
            this.property_title = monarchPart.getPrestigePro();
         }
      }
   }

   private void flushTotem() {
      if (!this.isRobot) {
         if (this.change_totem || this.change_all) {
            this.change_totem = false;
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            GamePlayer player = worldMgr.getPlayerById(this.playerId);
            TotemPart totemPart = (TotemPart)player.getMgrPart(TotemPart.class);
            this.property_totem = totemPart.getHeroTotemProperty(this.code);
         }
      }
   }

   private void flushRuneStone() {
      if (!this.isRobot) {
         if (this.change_rune_stone || this.change_all) {
            this.change_rune_stone = false;
            this.property_rune_stone.clear();
            this.skill_rune_stone.clear();
            if (!this.runeStone.isEmpty()) {
               List<PropertyModel> tempPropertyList = new ArrayList();
               List<Integer> skillSet = new ArrayList();
               GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
               HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);
               Map<Integer, FormationGemRangeModel> rangeMap = gameModelPool.getMap("formationGemRange");
               ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
               String formationGemRatio = configManager.getStr("formationGemRatio");
               String[] str = formationGemRatio.split("\\|");

               for(RuneStoneItem item : this.runeStone.values()) {
                  for(Map.Entry<Integer, PropertyModel> entry : item.proMap.entrySet()) {
                     if ((Integer)entry.getKey() == 0 || !rangeMap.containsKey(entry.getKey()) || ((FormationGemRangeModel)rangeMap.get(entry.getKey())).getTypeLimit() == 0 || ((FormationGemRangeModel)rangeMap.get(entry.getKey())).getTypeLimit() == heroModel.getType()) {
                        PropertyModel pro = (PropertyModel)entry.getValue();
                        long realValue = pro.getValue();
                        if ((Integer)entry.getKey() == 0 && item.strengthen > 0) {
                           String formationStrength = ApplicationContextProvider.getConfigString("formationGemStrength", "2000|4000");
                           String[] gemStrength = formationStrength.split("\\|");
                           int addNum = 0;
                           if (gemStrength.length >= item.strengthen) {
                              addNum = Integer.parseInt(gemStrength[item.strengthen - 1]);
                           } else {
                              addNum = Integer.parseInt(gemStrength[0]);
                           }

                           realValue = pro.getValue() * (long)(10000 + addNum) / 10000L;
                        }

                        long value = realValue * (long)Integer.parseInt(str[pro.getType() - 1]) / 10000L;
                        tempPropertyList.add(new PropertyModel(pro.getType(), pro.getWay(), value));
                     }
                  }
               }

               int levSum = 0;

               for(RuneStoneItem item : this.runeStone.values()) {
                  FormationGemLvUpModel model = (FormationGemLvUpModel)gameModelPool.getEntity("formationGemLvup", item.id);
                  if (!Objects.isNull(model)) {
                     levSum += model.getLv();
                  }
               }

               Map<Integer, FormationGemSetModel> gemMap = gameModelPool.getMap("formationGemSet");
               int finalLevSum = levSum / 10 * 10;
               List<FormationGemSetModel> list = new ArrayList();

               for(FormationGemSetModel model : gemMap.values()) {
                  if (model.getHotLv() <= finalLevSum && (model.getJob() == heroModel.getType() || model.getJob() == 0)) {
                     list.add(model);
                  }
               }

               for(FormationGemSetModel setModel : list) {
                  if (finalLevSum < 40 || setModel.getHotLv() != 30) {
                     for(KeyValFun fun : setModel.getHotSkill()) {
                        if (fun.getKey() > 0) {
                           skillSet.add(fun.getKey());
                        }
                     }
                  }
               }

               this.property_rune_stone = tempPropertyList;
               this.skill_rune_stone.addAll(skillSet);
            }
         }
      }
   }

   private void flushEquipCastSoul() {
      if (!this.isRobot) {
         if (this.change_equip_cast_soul || this.change_all) {
            this.change_equip_cast_soul = false;
            ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
            int equipCastHeroStarLimit = configManager.getIntDefault("configManager", 10);
            if (this.getStar() >= equipCastHeroStarLimit) {
               Map<Integer, Integer> tempLvMap = new HashMap();
               List<PropertyModel> tempCastPropertyList = new ArrayList();
               GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);

               for(Map.Entry<Integer, EquipItem> itemEntry : this.equips.entrySet()) {
                  EquipItem equipItem = (EquipItem)itemEntry.getValue();
                  ItemModel itemModel = (ItemModel)gameModelPool.getEntity("item", equipItem.id);
                  if (this.castSouls.get(itemEntry.getKey()) != null && (Integer)this.castSouls.get(itemEntry.getKey()) >= 1) {
                     int state = (Integer)this.castSouls.get(itemEntry.getKey());
                     Map<Integer, EquipCastModel> positionMap = (Map)gameModelPool.getEntity("customEquipCast", itemEntry.getKey());
                     if (positionMap != null) {
                        EquipCastModel equipCastModel = (EquipCastModel)positionMap.get(state);
                        if (equipCastModel != null && itemModel.getQuality() >= equipCastModel.getEquipQuiltyLimit()) {
                           int realCastLv = state - 1;
                           if (realCastLv > itemModel.getStar()) {
                              realCastLv = itemModel.getStar();
                           }

                           tempLvMap.put(itemEntry.getKey(), realCastLv);

                           for(int i = 0; i <= realCastLv; ++i) {
                              EquipCastModel model = (EquipCastModel)positionMap.get(i + 1);

                              for(PropertyModel effect : model.getEffects()) {
                                 tempCastPropertyList.add(effect);
                              }
                           }
                        }
                     }
                  }
               }

               this.castLvMap = tempLvMap;
               this.property_equip_cast_soul = tempCastPropertyList;
               this.change_property_skill_hero = true;
               int tempPower = 0;

               for(Map.Entry<Integer, Integer> entry : this.castLvMap.entrySet()) {
                  UpgradeModel upgradeModel = (UpgradeModel)gameModelPool.getEntity("upgrade", entry.getValue());
                  if (upgradeModel != null) {
                     tempPower += (Integer)upgradeModel.getEquipCastCombat().get(entry.getKey());
                  }
               }

               this.castPower = tempPower;
            }
         }
      }
   }

   private void flushHeroDress() {
      if (!this.isRobot) {
         int oldDressId = this.dressId;
         this.dressId = 0;
         this.dressHeroId = 0;
         this.dressEndTime = 0L;
         List<PropertyModel> tmp_property_hero_dress = new ArrayList();
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer player = worldMgr.getPlayerById(this.playerId);
         HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
         List<HeroDressPart.HeroDressEndTimeAndPros> beanList = heroBagPart.getHeroDressEndTimeAndPros(this.id);
         if (beanList != null) {
            for(HeroDressPart.HeroDressEndTimeAndPros bean : beanList) {
               if (bean.isUsed) {
                  this.dressId = bean.dressId;
                  this.dressLv = bean.dressLv;
                  HeroDressModel heroDressModel = (HeroDressModel)ApplicationContextProvider.getModelPoolEntity("heroDress", this.dressId);
                  if (heroDressModel != null) {
                     this.dressHeroId = heroDressModel.getChangedHeroId();
                  }

                  this.dressEndTime = bean.endTime;
               }

               tmp_property_hero_dress.addAll(bean.pros);
            }
         }

         this.property_hero_dress = tmp_property_hero_dress;
         if (oldDressId != this.dressId) {
            this.change_breach = true;
            this.change_star = true;
            this.change_equip_cast_soul = true;
            this.change_talent = true;
         }

      }
   }

   private void flushAide() {
      if (!this.isRobot) {
         if (this.change_aide || this.change_all) {
            this.change_aide = false;
            this.property_aide.clear();
            this.property_aide_no_cal.clear();
            GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
            AideLevelModel aideLevelModel = (AideLevelModel)gameModelPool.getEntity("aideLevel", this.aide);
            if (aideLevelModel != null) {
               for(AideLevelPropertyModel property : aideLevelModel.getProperties()) {
                  if (property.getWay() == 0) {
                     this.property_aide_no_cal.add(property);
                  } else {
                     this.property_aide.add(property);
                  }
               }
            }

            AideLevelModel aideLevelModel2 = (AideLevelModel)gameModelPool.getEntity("aideLevel", this.aide2);
            if (aideLevelModel2 != null) {
               for(AideLevelPropertyModel property : aideLevelModel2.getProperties()) {
                  if (property.getWay() == 0) {
                     this.property_aide_no_cal.add(property);
                  } else {
                     this.property_aide.add(property);
                  }
               }
            }

            if (this.aide <= 0 || this.aide2 <= 0) {
               this.aideTrammelsId = 0;
               this.updateOp();
            }

         }
      }
   }

   private void flushStarMap() {
      if (!this.isRobot) {
         if (this.change_star_map || this.change_all) {
            this.property_star_map.clear();
            this.skill_star_map.clear();
            Map<Integer, StarMapPoint> starMapPointMap = this.recHeroStarMapPointMap();
            if (starMapPointMap != null && !starMapPointMap.isEmpty()) {
               this.change_star_map = false;
               StarMapTypeModel starMapTypeModel = StarMapDefine.getStarMapTypeModel(this);
               if (null != starMapTypeModel) {
                  for(Map.Entry<Integer, StarMapPoint> starId_starMapPoint : starMapPointMap.entrySet()) {
                     Integer starId = (Integer)starId_starMapPoint.getKey();
                     StarMapPoint starMapPoint = (StarMapPoint)starId_starMapPoint.getValue();
                     if (starMapPoint.optionSkillGroup == 0) {
                        StarAspectRumModel starAspectRumModel = StarMapDefine.getStarAspectRumModel(starMapTypeModel.getStarMapId(), starId, starMapPoint.starLv);
                        if (null != starAspectRumModel && !starAspectRumModel.getBase().isEmpty()) {
                           this.property_star_map.addAll(starAspectRumModel.getBase());
                        }
                     } else if (starMapPoint.optionSkillGroup != -1 && starMapPoint.optionSkillGroup > 0) {
                        StarSkillModel starSkillModel = StarMapDefine.getStarSkillModel(starMapPoint.optionSkillGroup, starMapTypeModel.getClassify(), starMapPoint.starLv);
                        if (null != starSkillModel && !starSkillModel.getBase().isEmpty()) {
                           this.property_star_map.addAll(starSkillModel.getBase());
                        }
                     }
                  }

                  int starMapTotalLv = this.recStarMapTotalLv();
                  List<Integer> skillStarMapList = StarMapDefine.getSkillStarMapList(this, this.lv, starMapTotalLv);
                  if (!skillStarMapList.isEmpty()) {
                     this.skill_star_map.addAll(skillStarMapList);
                  }

               }
            }
         }
      }
   }

   private void flushGodBeast() {
      if (!this.isRobot) {
         if (this.change_god_beast || this.change_all) {
            this.property_god_beast.clear();
            this.skill_god_beast.clear();
            this.change_god_beast = false;
            if (null != this.godBeastItem) {
               List<PropertyModel> allProList = GodBeastDefine.getAllProList(this.godBeastItem, true);
               this.property_god_beast.addAll(allProList);
               List<Integer> allSkillIdList = GodBeastDefine.getAllSkillIdList(this.godBeastItem);
               this.skill_god_beast.addAll(allSkillIdList);
               if (this.godBeastItem.mainNeiDan != null) {
                  NeiDanSkillAndPro neiDanSkillAndPro = NeiDanDefine.calAddHeroPro(this.godBeastItem.mainNeiDan);
                  if (null != neiDanSkillAndPro) {
                     this.property_god_beast.addAll(neiDanSkillAndPro.getProList());
                     this.skill_god_beast.addAll(neiDanSkillAndPro.getSkillList());
                  }
               }

            }
         }
      }
   }

   private void flushExclusiveWeapon() {
      if (!this.isRobot) {
         if (this.change_exclusive_weapon || this.change_all) {
            this.property_exclusive_weapon.clear();
            this.skill_exclusive_weapon.clear();
            this.change_exclusive_weapon = false;
            if (null != this.exclusiveWeaponMap && !this.exclusiveWeaponMap.isEmpty()) {
               this.property_exclusive_weapon.addAll(EWeaponDefine.getAllDevelopProList(this.exclusiveWeaponMap));
               ExclusiveWeaponItem mainWeaponItem = (ExclusiveWeaponItem)this.exclusiveWeaponMap.get(34);
               int mainWeaponId = mainWeaponItem == null ? 0 : mainWeaponItem.id;
               int weaponStarId = mainWeaponItem == null ? 0 : mainWeaponItem.getStarId();
               this.skill_exclusive_weapon.addAll(EWeaponDefine.getSkillList(this.id, mainWeaponId, weaponStarId, this.soulSkill));
            }
         }
      }
   }

   private void flushHeroCard() {
      if (!this.isRobot) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer gamePlayer = worldMgr.getPlayerById(this.playerId);
         HeroCardPart heroCardPart = (HeroCardPart)gamePlayer.getMgrPart(HeroCardPart.class);
         int calHeroId = this.shareHeroId > 0 ? this.shareHeroId : this.id;
         List<PropertyModel> allPro = heroCardPart.calRealAddPro(calHeroId);
         this.property_zhu_hou.clear();
         this.property_zhu_hou.addAll(allPro);
      }
   }

   private void flushDragonVein() {
      if (!this.isRobot) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer gamePlayer = worldMgr.getPlayerById(this.playerId);
         DragonVeinPart dragonVeinPart = (DragonVeinPart)gamePlayer.getMgrPart(DragonVeinPart.class);
         int calHeroId = this.shareHeroId > 0 ? this.shareHeroId : this.id;
         List<PropertyModel> allPro = dragonVeinPart.calRealAddPro(calHeroId);
         this.property_dragon_vein.clear();
         this.property_dragon_vein.addAll(allPro);
         DragonVeinDao dao = dragonVeinPart.getDao();
         this.dragonVeinSkills.clear();
         this.dragonVeinSkills.addAll(DragonVeinDefine.calSkillIds(dao.posSoul));
      }
   }

   private void flushExclusiveWeaponLib() {
      if (!this.isRobot) {
         if (this.change_exclusive_weapon_lib || this.change_all) {
            this.change_exclusive_weapon_lib = false;
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            GamePlayer gamePlayer = worldMgr.getPlayerById(this.playerId);
            ExclusiveWeaponPart weaponPart = (ExclusiveWeaponPart)gamePlayer.getMgrPart(ExclusiveWeaponPart.class);
            ExclusiveWeaponDao weaponDao = weaponPart.getDao();
            this.property_exclusive_weapon_lib = EWeaponDefine.getLibPropertyList(weaponDao.weaponLib);
         }
      }
   }

   private void flushKingControl(Boolean flushKingFriend) {
      if (!this.isRobot && this.use_king) {
         this.property_king_control.clear();
         if (!flushKingFriend) {
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            GamePlayer player = worldMgr.getPlayerById(this.playerId);
            HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
            List<PropertyModel> tempList = heroBagPart.getKingControlAdd(this);
            this.property_king_control = tempList;
         }
      }
   }

   public void flushKingToKing(Boolean flushKingFriend) {
      if (!this.isRobot && this.use_king) {
         this.property_king.clear();
         if (!flushKingFriend) {
            GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
            HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            GamePlayer player = worldMgr.getPlayerById(this.playerId);
            if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
               HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
               HeroDao kingHeroDao = heroBagPart.getKingHeroDao(heroModel.getNation());
               if (kingHeroDao == null || kingHeroDao.code != this.code) {
                  return;
               }

               SkillKingTalentModel skillKingTalentModel = heroBagPart.getKingTalentModel(this);
               if (skillKingTalentModel == null) {
                  return;
               }

               List<PropertyModel> tempList = new ArrayList();

               for(PropertyModel buff : skillKingTalentModel.getBuffs()) {
                  if (buff.getWay() == 0) {
                     PropertyModel.addLvProtities(tempList, buff.clone());
                  } else if (buff.getWay() == 1 && this.totalFightProperties.containsKey(buff.getType())) {
                     float tempVal = (float)(Long)this.totalFightProperties.get(buff.getType()) * ((float)buff.getValue() / 10000.0F);
                     PropertyModel.addLvProtities(tempList, new PropertyModel(buff.getType(), 0, Float.valueOf(tempVal).longValue()));
                  }
               }

               SkillKingModel skillKingModel = (SkillKingModel)ApplicationContextProvider.getModelPoolEntity("skillKing", this.getDressHeroId());

               for(HeroDressPart.HeroDressEndTimeAndPros pro : heroBagPart.getHeroDressEndTimeAndPros(this.id)) {
                  HeroDressModel heroDressModel = (HeroDressModel)ApplicationContextProvider.getModelPoolEntity("heroDress", pro.dressId);
                  if (heroDressModel != null && heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_AWAKEN) {
                     skillKingModel = (SkillKingModel)ApplicationContextProvider.getModelPoolEntity("skillKing", heroDressModel.getChangedHeroId());
                     break;
                  }
               }

               if (skillKingModel == null) {
                  skillKingModel = (SkillKingModel)ApplicationContextProvider.getModelPoolEntity("skillKing", this.id);
               }

               if (skillKingModel != null) {
                  for(PropertyModel buff : skillKingModel.getBuffs()) {
                     if (buff.getWay() == 0) {
                        PropertyModel.addLvProtities(tempList, buff.clone());
                     } else if (buff.getWay() == 1 && this.totalFightProperties.containsKey(buff.getType())) {
                        float tempVal = (float)(Long)this.totalFightProperties.get(buff.getType()) * ((float)buff.getValue() / 10000.0F);
                        PropertyModel.addLvProtities(tempList, new PropertyModel(buff.getType(), 0, Float.valueOf(tempVal).longValue()));
                     }
                  }

                  for(PropertyModel buff : skillKingModel.getAddBuffs()) {
                     if (buff.getWay() == 0) {
                        PropertyModel.addLvProtities(tempList, buff.clone());
                     } else if (buff.getWay() == 1 && this.totalFightProperties.containsKey(buff.getType())) {
                        float tempVal = (float)(Long)this.totalFightProperties.get(buff.getType()) * ((float)buff.getValue() / 10000.0F);
                        PropertyModel.addLvProtities(tempList, new PropertyModel(buff.getType(), 0, Float.valueOf(tempVal).longValue()));
                     }
                  }
               }

               this.property_king = tempList;
            }

         }
      }
   }

   private void flushFriend(HeroModel heroModel) {
      if (!this.isRobot) {
         if (this.property_friend != null) {
            this.property_friend = null;
         }

         this.property_king_control.clear();
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer player = worldMgr.getPlayerById(this.playerId);
         HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
         if (this.containState(1)) {
            HeroArrayingPart heroArrayingPart = (HeroArrayingPart)player.getMgrPart(HeroArrayingPart.class);
            HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);
            int friendCode = 0;
            if (heroArrayingDao != null && heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
               for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                  if ((Byte)entry.getKey() == 5) {
                     friendCode = (Integer)entry.getValue();
                  } else if ((Byte)entry.getKey() < 5) {
                  }
               }
            }

            if (friendCode > 0 && friendCode != this.code) {
               int realNation = heroBagPart.getHeroNation(this);
               this.property_friend = heroBagPart.getProperty_friend(realNation, heroModel.getType());
            } else {
               this.calTotalPorperty();
            }
         }

         if (this.use_king && heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
            this.property_king.clear();
            this.calTotalPorperty();
            heroBagPart.calcKingControl(this);
         }

      }
   }

   private void flushExclusiveTreasure() {
      if (!this.isRobot) {
         if (this.change_exclusive_treasure || this.change_all) {
            this.property_exclusive_treasure.clear();
            this.skill_exclusive_treasure.clear();
            if (!Objects.isNull(this.exTreasure)) {
               this.change_exclusive_treasure = false;
               List<PropertyModel> tempList = new ArrayList();
               int tempSkillId = 0;
               GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
               Map<Integer, ExclusiveTreasureBaseModel> modelMap = gameModelPool.getMap("exclusiveTreasureBase");
               HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);
               List<ExclusiveTreasureBaseModel> extraList = new ArrayList();

               for(ExclusiveTreasureBaseModel model : modelMap.values()) {
                  if (model.getLev() <= this.exTreasure.lev && model.getStar() <= this.exTreasure.star && model.getNation() == heroModel.getType()) {
                     extraList.add(model);
                  }
               }

               for(int i = 0; i < extraList.size(); ++i) {
                  ExclusiveTreasureBaseModel model = (ExclusiveTreasureBaseModel)extraList.get(i);
                  tempList.add(new PropertyModel(model.getProId(), model.getProWay(), (long)model.getProValue()));
               }

               if (!this.exTreasure.stoneMap.isEmpty()) {
                  for(Integer stoneId : this.exTreasure.stoneMap.values()) {
                     ExclusiveTreasureStoneModel stoneModel = (ExclusiveTreasureStoneModel)gameModelPool.getEntity("exclusiveTreasureStone", stoneId);
                     if (!Objects.isNull(stoneModel)) {
                        tempList.add(new PropertyModel(stoneModel.getProType(), stoneModel.getProWay(), (long)stoneModel.getProValue()));
                     }
                  }
               }

               ExclusiveTreasureActivationModel activationModel = (ExclusiveTreasureActivationModel)gameModelPool.getEntity("exclusiveTreasureActivation", this.exTreasure.condition1);
               Map<Integer, Integer> numMap = new HashMap();
               if (!this.exTreasure.stoneMap.isEmpty()) {
                  for(Integer stoneId : this.exTreasure.stoneMap.values()) {
                     ExclusiveTreasureStoneModel stoneModel = (ExclusiveTreasureStoneModel)gameModelPool.getEntity("exclusiveTreasureStone", stoneId);
                     if (!Objects.isNull(stoneModel)) {
                        int tempNum = (Integer)numMap.getOrDefault(stoneModel.getType(), 0);
                        numMap.put(stoneModel.getType(), tempNum + 1);
                     }
                  }

                  int num1 = (Integer)numMap.getOrDefault(1, 0);
                  int num2 = (Integer)numMap.getOrDefault(2, 0);
                  int num3 = (Integer)numMap.getOrDefault(3, 0);
                  if (num1 >= activationModel.getTriangleNum() && num2 >= activationModel.getSquareNum() && num3 >= activationModel.getCircularNum()) {
                     ExclusiveTreasureExtraModel extraModel = (ExclusiveTreasureExtraModel)gameModelPool.getEntity("exclusiveTreasureExtra", this.exTreasure.extraProId);
                     if (!Objects.isNull(extraModel)) {
                        tempList.add(new PropertyModel(extraModel.getPropertyId(), extraModel.getPropertyWay(), (long)extraModel.getPropertyValue()));
                     }
                  }

                  ExclusiveTreasureActivationModel skillModel = (ExclusiveTreasureActivationModel)gameModelPool.getEntity("exclusiveTreasureActivation", this.exTreasure.condition2);
                  if (num1 >= skillModel.getTriangleNum() && num2 >= skillModel.getSquareNum() && num3 >= skillModel.getCircularNum()) {
                     ExclusiveTreasureExtraModel extraSkillModel = (ExclusiveTreasureExtraModel)gameModelPool.getEntity("exclusiveTreasureExtra", this.exTreasure.skillId);
                     if (!Objects.isNull(extraSkillModel)) {
                        tempSkillId = extraSkillModel.getSkillId();
                     }
                  }
               }

               this.property_exclusive_treasure = tempList;
               if (tempSkillId > 0) {
                  this.skill_exclusive_treasure.add(tempSkillId);
               }

            }
         }
      }
   }

   private void flushRune() {
      if (!this.isRobot) {
         if (this.change_rune || this.change_all) {
            this.property_rune.clear();
            this.skill_rune.clear();
            if (this.rune != null && !this.rune.runeMap.isEmpty()) {
               this.change_rune = false;
               RunePropertiesAndSkills runePropertiesAndSkills = this.getRuneAndRefinePropertiesAndSkills();
               if (null == runePropertiesAndSkills) {
                  logger.error("计算符文加成属性和套装技能出错！！！");
               } else {
                  this.property_rune.addAll(runePropertiesAndSkills.getPropertyModelList());
                  this.skill_rune.addAll(runePropertiesAndSkills.getSkillList());
               }
            }
         }
      }
   }

   public RunePropertiesAndSkills getRuneAndRefinePropertiesAndSkills() {
      List<PropertyModel> runeAndRefineProList = new ArrayList();
      List<Integer> skillList = new ArrayList();
      if (null != this.rune && !this.rune.runeMap.isEmpty()) {
         Map<Integer, RuneItem> runeMap = this.rune.runeMap;
         Map<Integer, RuneRefineInheritItem> runeRefineMap = this.rune.runeRefineMap;

         for(Map.Entry<Integer, RuneItem> runeItemEntry : runeMap.entrySet()) {
            int seat = (Integer)runeItemEntry.getKey();
            RuneItem value = (RuneItem)runeItemEntry.getValue();
            RuneMainModel runeMainModel = this.getRuneMainModel(value.id);
            if (null != runeMainModel) {
               runeAndRefineProList.addAll(runeMainModel.getPro());
               RuneBasicNatureModel runeBasicNatureModel = this.getRuneBasicNatureModel(value.id, value.level);
               if (null != runeBasicNatureModel) {
                  runeAndRefineProList.addAll(runeBasicNatureModel.getPro());
               }

               if (runeMainModel.getStarNatureId() > 0) {
                  RuneStarNatureModel runeStarNatureModel = this.getRuneStarNatureModel(runeMainModel.getStarNatureId());
                  if (null != runeStarNatureModel) {
                     runeAndRefineProList.addAll(runeStarNatureModel.getPro());
                  }
               }

               RuneRefineInheritItem runeRefineInheritItem = (RuneRefineInheritItem)runeRefineMap.get(seat);
               if (null != runeRefineInheritItem) {
                  RuneRefineLvNatureModel runeRefineLvNatureModel = this.getRuneRefineLvNatureModel(seat, runeRefineInheritItem.breakUpTime);
                  if (null != runeRefineLvNatureModel && runeMainModel.getQuality() >= runeRefineLvNatureModel.getNeedRuneQuality()) {
                     runeAndRefineProList.addAll(runeRefineLvNatureModel.getRefinePro());

                     for(Map.Entry<Integer, PropertyModel> refineProEntry : runeRefineInheritItem.refinePro.entrySet()) {
                        PropertyModel refinePro = (PropertyModel)refineProEntry.getValue();
                        runeAndRefineProList.add(refinePro);
                     }
                  }
               }
            }
         }

         int skill4SuitModelId = 0;
         RunePropertiesAndSkills suitProAndSkillIdList = this.getSuitProAndSkillIdList();
         if (null != suitProAndSkillIdList) {
            List<PropertyModel> suitPropertyModelList = suitProAndSkillIdList.getPropertyModelList();
            List<Integer> suitSkillList = suitProAndSkillIdList.getSkillList();
            if (suitPropertyModelList != null && suitPropertyModelList.size() > 0) {
               runeAndRefineProList.addAll(suitPropertyModelList);
            }

            if (suitSkillList != null && suitSkillList.size() > 0) {
               skillList.addAll(suitSkillList);
            }

            skill4SuitModelId = suitProAndSkillIdList.getSkill4SuitModelId();
         }

         RunePropertiesAndSkills prosAndSkills = new RunePropertiesAndSkills(runeAndRefineProList, skillList, skill4SuitModelId);
         return prosAndSkills;
      } else {
         RunePropertiesAndSkills prosAndSkills = new RunePropertiesAndSkills(runeAndRefineProList, skillList, 0);
         return prosAndSkills;
      }
   }

   public RuneBasicNatureModel getRuneBasicNatureModel(int runeId, int level) {
      RuneMainModel runeMainModel = this.getRuneMainModel(runeId);
      if (null == runeMainModel) {
         return null;
      } else {
         int seat = runeMainModel.getSeat();
         int quality = runeMainModel.getQuality();
         String mapKey = level + "_" + seat + "_" + quality;
         RuneBasicNatureModel runeBasicNatureModel = (RuneBasicNatureModel)ApplicationContextProvider.getModelPoolEntity("customRuneBasicNature", mapKey);
         if (null == runeBasicNatureModel) {
            logger.error("RuneBasicNature 配置错误 level:{},seat:{},quality:{}", new Object[]{level, seat, quality});
         }

         return runeBasicNatureModel;
      }
   }

   public RuneStarNatureModel getRuneStarNatureModel(int starNatureId) {
      RuneStarNatureModel runeStarNatureModel = (RuneStarNatureModel)ApplicationContextProvider.getModelPoolEntity("RuneStarNature", starNatureId);
      if (null == runeStarNatureModel) {
         logger.error("RuneStarNature 表配置出错 starNatureId:{}", starNatureId);
      }

      return runeStarNatureModel;
   }

   private void flushWarFlag() {
      if (!this.isRobot) {
         if (this.change_warFlag || this.change_all) {
            this.change_warFlag = false;
            this.property_warFlag.clear();
            this.property_warFlag = getWarFlagProperty(this.warFlag);
            this.property_warFlag_hpAtk = getWarFlagPropertyOfBasic(this.warFlag);
         }
      }
   }

   private void flushTalent(GamePlayer gamePlayer, HeroModel heroModel) {
      if (!this.isRobot) {
         if (this.change_talent || this.change_all) {
            this.change_talent = false;
            this.skill_talent.clear();
            this.skill_talent = getTalentSkill(this.id, this.getStar(), this.dressHeroId, this.talent, gamePlayer, heroModel, this.type == HeroDefine.HERO_SP_TYPE_PALACE, this.shareHeroId);
            this.talent_power = getTalentPower(this.talent);
         }
      }
   }

   private void flushDragonStrengthen() {
      if (!this.isRobot && this.use_dragon) {
         if (this.change_dragonStrengthen || this.change_all) {
            this.change_dragonStrengthen = false;
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            GamePlayer player = worldMgr.getPlayerById(this.playerId);
            HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
            this.property_dragonStrengthen = heroBagPart.getProperty_dragon_strengthen();
         }
      }
   }

   private void flushWarHorse() {
      if (!this.isRobot) {
         if (this.change_warHorse || this.change_all) {
            this.change_warHorse = false;
            this.property_warHorse.clear();
            this.warHorseBasePros.clear();
            this.extraWarHorsePros.clear();
            double temp_pwoer_herose = (double)0.0F;
            this.property_warHorse = calModelProperty(this.getWarHorseProperty(this.warHorse));
            if (!this.property_warHorse.isEmpty()) {
               for(PropertyModel propertyModel : this.property_warHorse) {
                  if (propertyModel.getType() <= 4) {
                     this.warHorseBasePros.add(propertyModel);
                     temp_pwoer_herose += calPowerByType(propertyModel.getType(), propertyModel.getValue());
                  }
               }
            }

            if (this.warHorse != null && !this.warHorse.upSkills.isEmpty()) {
               for(Integer upSkillId : this.warHorse.upSkills) {
                  WarHorseSkillModel warHorseSkillModel = (WarHorseSkillModel)ApplicationContextProvider.getModelPoolEntity("warHorseSkill", upSkillId);
                  if (warHorseSkillModel != null) {
                     temp_pwoer_herose += (double)warHorseSkillModel.getPower();
                  }
               }
            }

            this.pwoer_herose = (long)temp_pwoer_herose;
            if (this.warHorse != null) {
               WarHorseExclusiveModel exclusiveModel = (WarHorseExclusiveModel)ApplicationContextProvider.getModelPoolEntity("warHorseExclusive", this.warHorse.id);
               if (exclusiveModel != null && this.id == exclusiveModel.getHeroId()) {
                  List<PropertyModel> tempList = new ArrayList();

                  for(PropertyModel propertyModel : exclusiveModel.getExtraAtt()) {
                     PropertyModel.addLvProtities(tempList, propertyModel);
                  }

                  if (this.warHorse.isAwaken) {
                     for(PropertyModel propertyModel : exclusiveModel.getWakenExtraAtt()) {
                        PropertyModel.addLvProtities(tempList, propertyModel);
                     }
                  }

                  this.extraWarHorsePros = tempList;
               }
            }

         }
      }
   }

   public void flushPalace(GamePlayer gamePlayer) {
      if (!this.isRobot) {
         if (this.change_palace || this.change_all) {
            this.change_palace = false;
            if (this.type == HeroDefine.HERO_SP_TYPE_PALACE) {
               HeroPalacePart heroPalacePart = (HeroPalacePart)gamePlayer.getMgrPart(HeroPalacePart.class);
               this.property_palace = heroPalacePart.getHeroPalaceProperty();
               this.destinySkills = heroPalacePart.getDestinySkills();
               this.palaceTitle = gamePlayer.getPublicDao().palaceTitle;
               this.shareHeroId = heroPalacePart.getShareHeroId();
            }

         }
      }
   }

   private void flushWorldPaint() {
      if (!this.isRobot) {
         if (this.change_world_paint || this.change_all) {
            this.change_world_paint = false;
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            GamePlayer gamePlayer = worldMgr.getPlayerById(this.playerId);
            WorldPaintExtend worldPaintExtend = (WorldPaintExtend)gamePlayer.getPlayerExtend(135);
            this.worldPaintInfoMap.clear();
            this.worldPaintInfoMap.putAll(worldPaintExtend.worldPaintInfoMap);
            this.property_world_paint = WorldPaintDefine.getAllProList(worldPaintExtend);
         }
      }
   }

   private void flushHeroSkill(HeroModel heroModel) {
      if (this.type == HeroDefine.HERO_SP_TYPE_PALACE || this.change_property_skill_hero || this.change_all) {
         this.change_property_skill_hero = false;
         this.flushCastSoulSkills(heroModel);
         List<Integer> allHeroSkills = new ArrayList();
         allHeroSkills.addAll(this.heroCastSoulSkills);
         allHeroSkills.addAll(this.skill_talent);
         allHeroSkills.addAll(this.skill_star_map);
         List<Integer> allEffects = getEffectsOfAddProperty(allHeroSkills);
         this.property_skill_hero = getPropertyOfSkillEffect(allEffects, this.getLvWithPromote());
      }
   }

   private void flushCastSoulSkills(HeroModel heroModel) {
      List<Integer> resultList = new ArrayList();
      TreeMap<Integer, Integer> tempMap = new TreeMap();
      boolean isPalaceHero = false;
      GamePlayer gamePlayer = ((WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class)).getPlayerById(this.playerId);
      if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_PALACE) {
         if (this.palaceWatchHeroId > 0) {
            tempMap.putAll(this.palaceWatchHeroSkills);
         } else {
            HeroPalaceDao heroPalaceDao = (HeroPalaceDao)gamePlayer.getData("tb_hero_palace", gamePlayer.getPlayerId());
            tempMap.putAll(heroPalaceDao.skills);
         }

         isPalaceHero = true;
      } else {
         HeroBagPart heroBagPart = (HeroBagPart)gamePlayer.getMgrPart(HeroBagPart.class);

         for(int i = 0; i < this.heroStarSkills.size(); ++i) {
            Integer skillId = (Integer)this.heroStarSkills.get(i);
            SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", skillId);
            if (skillModel.getSkillId() != 0) {
               for(HeroDressPart.HeroDressEndTimeAndPros pro : heroBagPart.getHeroDressEndTimeAndPros(this.id)) {
                  HeroDressModel heroDressModel = (HeroDressModel)ApplicationContextProvider.getModelPoolEntity("heroDress", pro.dressId);
                  if (heroDressModel != null && heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_AWAKEN) {
                     skillId = skillModel.getSkillId();
                     break;
                  }
               }
            }

            tempMap.put(i, skillId);
         }
      }

      for(Map.Entry<Integer, Integer> entry : tempMap.entrySet()) {
         if ((Integer)entry.getValue() > 0) {
            if ((Integer)entry.getKey() == 0) {
               resultList.add(entry.getValue());
            } else {
               int oldSkillId = (Integer)entry.getValue();
               if (this.castLvMap.get(entry.getKey()) != null) {
                  GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
                  if (isPalaceHero) {
                     SkillModel skillModel = (SkillModel)gameModelPool.getEntity("skill", oldSkillId);
                     if (skillModel.getLv() < 3) {
                        resultList.add(oldSkillId);
                        continue;
                     }
                  }

                  int addLv = (Integer)this.castLvMap.get(entry.getKey());

                  for(int j = 1; j <= addLv; ++j) {
                     SkillModel skillModel = (SkillModel)gameModelPool.getEntity("skill", oldSkillId);
                     if (skillModel != null) {
                        oldSkillId = skillModel.getNextSkillid();
                     }
                  }
               }

               resultList.add(oldSkillId);
            }
         }
      }

      this.heroCastSoulSkills = resultList;
   }

   private void flushOtherSkill() {
      if (this.change_property_skill_other || this.change_all) {
         List<Integer> allEffects = this.getOtherSkillEffectsOfAddProperty();
         this.property_skill_other = getPropertyOfSkillEffect(allEffects, this.getLvWithPromote());
      }
   }

   private List<Integer> getOtherSkillEffectsOfAddProperty() {
      List<Integer> allEffects = new ArrayList();
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      MonsterManager monsterManager = (MonsterManager)ApplicationContextProvider.getContext().getBean(MonsterManager.class);
      Set<Integer> allSkills = new HashSet();
      allSkills.addAll(this.skill_warcraft);
      allSkills.addAll(this.skill_warriorignet);

      for(Integer skillId : monsterManager.getSkillOfRemoveChild(allSkills)) {
         WarriorSignetSkillModel warriorSignetSkillModel = (WarriorSignetSkillModel)gameModelPool.getEntity("warriorSignetSkill", skillId);
         if (warriorSignetSkillModel != null) {
            for(Map.Entry<Integer, Integer> entry : warriorSignetSkillModel.getEffects().entrySet()) {
               allEffects.add(entry.getValue());
            }
         }
      }

      List<Integer> allOtherSkillList = new ArrayList();
      allOtherSkillList.addAll(this.skill_exclusive_treasure);
      allOtherSkillList.addAll(this.skill_rune);
      allOtherSkillList.addAll(this.skill_god_beast);
      allOtherSkillList.addAll(this.skill_exclusive_weapon);
      allOtherSkillList.addAll(this.dragonVeinSkills);

      for(Integer skillId : allOtherSkillList) {
         SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", skillId);
         if (skillModel == null) {
            logger.info("找不到技能配置，技能ID={}", skillId);
         }
      }

      if (!this.skill_rune_stone.isEmpty()) {
         allEffects.addAll(this.skill_rune_stone);
      }

      return allEffects;
   }

   private void calTotalScore() {
      int tempTotalScore = 0;
      tempTotalScore += this.score_artifact_strong;
      tempTotalScore += this.score_breach;
      tempTotalScore += this.score_equip;
      tempTotalScore += this.score_lv;
      tempTotalScore += this.score_star;
      tempTotalScore += this.score_union;
      tempTotalScore += this.score_warriorignet;
      this.totalScore = tempTotalScore;
   }

   private void calTotalPorperty() {
      HashMap<Integer, Long> tempTotalFightProperties = new HashMap();
      HashMap<Integer, Long> tempTotalShowProperties = new HashMap();
      long tempTotalCombatPower = this.calCombatPowerOfOtherModel();
      Map<Integer, Long> tempOrnamentProperties = new HashMap();
      double tempOrnamentPower = (double)0.0F;
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);

      for(Map.Entry<Integer, Long> entry : this.baseProperties.entrySet()) {
         int key = (Integer)entry.getKey();
         int add_heroBreach = (Integer)this.property_breach.getOrDefault(key, 0);
         int add_heroUpStar = (Integer)this.property_star.getOrDefault(key, 0);
         long[] add_skill_val = this.claHeroSkillProperty(key, 0);
         long[] add_skill_per = this.claHeroSkillProperty(key, 1);
         long[] add_other_val = this.calOtherProperty(key, 0);
         long[] add_other_per = this.calOtherProperty(key, 1);
         long[] add_ornament_val = this.calListProperty(key, 0, this.property_ornament);
         long[] add_ornament_per = this.calListProperty(key, 1, this.property_ornament);
         long[] add_ornament_skill_val = this.calListProperty(key, 0, this.property_ornament_skill);
         long[] add_ornament_skill_per = this.calListProperty(key, 1, this.property_ornament_skill);
         long[] add_no_addition_val = this.calNoPowerAdditionProperty(key, 0);
         long[] add_have_power_val = this.calHavePowerAdditionProperty(key, 0);
         long add_friend_val = 0L;
         if (this.property_friend != null) {
            for(PropertyModel propertyModel : this.property_friend) {
               if (propertyModel.getType() == key && propertyModel.getWay() == 0) {
                  add_friend_val += propertyModel.getValue();
               }
            }
         }

         if (this.property_king != null) {
            for(PropertyModel propertyModel : this.property_king) {
               if (propertyModel.getType() == key && propertyModel.getWay() == 0) {
                  add_friend_val += propertyModel.getValue();
               }
            }
         }

         if (this.property_king_control != null) {
            for(PropertyModel propertyModel : this.property_king_control) {
               if (propertyModel.getType() == key && propertyModel.getWay() == 0) {
                  add_friend_val += propertyModel.getValue();
               }
            }
         }

         long base = (Long)entry.getValue();
         int growAdd = 0;
         UpgradeModel upgradeModel = (UpgradeModel)gameModelPool.getEntity("upgrade", key);
         double propertyToPowerRatio = Double.parseDouble(upgradeModel.getPropertyAddCombat());
         long tempFightResult;
         long tempShowResult;
         long tempCombatPower;
         double ornamentPropertyBefore;
         double ornamentPowerBefore;
         double ornamentPropertyAfter;
         double ornamentPowerAfter;
         if ((Integer)entry.getKey() == 1) {
            growAdd = configManager.getInt("hpLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.getLvWithPromote()) * (1.0F + (float)add_heroBreach / 10000.0F) * (1.0F + (float)add_heroUpStar / 10000.0F) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 2) {
            growAdd = configManager.getInt("atkLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.getLvWithPromote()) * (1.0F + (float)add_heroBreach / 10000.0F) * (1.0F + (float)add_heroUpStar / 10000.0F) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 3) {
            growAdd = configManager.getInt("defLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.getLvWithPromote() + (float)add_heroBreach + (float)add_heroUpStar) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 4) {
            growAdd = configManager.getInt("spdLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.getLvWithPromote() + (float)add_heroBreach + (float)add_heroUpStar) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 21) {
            double tempResult = (double)(Long)entry.getValue();
            ornamentPowerBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 22) {
            double tempResult = (double)(Long)entry.getValue();
            ornamentPowerBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 6) {
            int baseCritiDamage = configManager.getIntDefault("baseCritiDamage", 12000);
            double tempResult = (double)((Long)entry.getValue() + (long)baseCritiDamage);
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0];
            ornamentPowerBefore = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            ornamentPropertyBefore = tempResult;
            ornamentPropertyAfter = tempResult + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            tempResult = tempResult + (double)add_ornament_skill_val[0] + (double)add_ornament_skill_per[0] + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            ornamentPowerAfter = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            long combatResult = tempPowerResult - (Long)heroModel.getProperty().get(key) - (long)baseCritiDamage;
            tempPowerResult += add_have_power_val[0];
            if (combatResult < 0L) {
               combatResult = 0L;
            }

            tempCombatPower = Double.valueOf((double)combatResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 8) {
            double tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0];
            ornamentPowerBefore = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            ornamentPropertyBefore = tempResult;
            ornamentPropertyAfter = tempResult + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            tempResult = tempResult + (double)add_ornament_skill_val[0] + (double)add_ornament_skill_per[0] + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            ornamentPowerAfter = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            long combatResult = tempPowerResult - (Long)heroModel.getProperty().get(key);
            tempPowerResult += add_have_power_val[0];
            if (combatResult < 0L) {
               combatResult = 0L;
            }

            tempCombatPower = Double.valueOf((double)combatResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() != 11 && (Integer)entry.getKey() != 14 && (Integer)entry.getKey() != 15 && (Integer)entry.getKey() != 23) {
            double tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0];
            ornamentPowerBefore = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            ornamentPropertyBefore = tempResult;
            ornamentPropertyAfter = tempResult + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            tempResult = tempResult + (double)add_ornament_skill_val[0] + (double)add_ornament_skill_per[0] + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            ornamentPowerAfter = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else {
            tempShowResult = (Long)entry.getValue() + add_other_val[0] + add_other_per[0] + add_skill_per[0] + add_skill_val[0];
            tempFightResult = Double.valueOf((double)((1.0F - (float)(Long)entry.getValue() / 10000.0F) * (1.0F - (float)add_other_val[1] / 10000.0F) * (1.0F - (float)add_other_per[1] / 10000.0F) * (1.0F - (float)add_skill_per[1] / 10000.0F) * (1.0F - (float)add_skill_val[1] / 10000.0F) * (1.0F - (float)add_ornament_val[1] / 10000.0F) * (1.0F - (float)add_ornament_per[1] / 10000.0F) * (1.0F - (float)add_ornament_skill_val[1] / 10000.0F) * (1.0F - (float)add_ornament_skill_per[1] / 10000.0F) * 10000.0F)).longValue();
            ornamentPowerBefore = (double)tempShowResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            ornamentPropertyBefore = (double)tempShowResult;
            tempShowResult = tempShowResult + add_ornament_val[0] + add_ornament_per[0];
            ornamentPropertyAfter = (double)tempShowResult;
            tempShowResult = tempShowResult + add_ornament_skill_val[0] + add_ornament_skill_per[0];
            ornamentPowerAfter = (double)tempShowResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            tempShowResult += add_have_power_val[0];
            tempFightResult = Double.valueOf((double)((float)tempFightResult * (1.0F - (float)add_have_power_val[1] / 10000.0F))).longValue();
            tempCombatPower = Double.valueOf((double)tempShowResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F).longValue();
            tempShowResult += add_no_addition_val[0];
            tempFightResult = Double.valueOf((double)((float)tempFightResult * (1.0F - (float)add_no_addition_val[1] / 10000.0F))).longValue();
         }

         tempTotalCombatPower += tempCombatPower;
         tempTotalFightProperties.put(key, tempFightResult);
         tempTotalShowProperties.put(key, tempShowResult);
         tempOrnamentPower += (double)Double.valueOf(ornamentPowerAfter - ornamentPowerBefore).longValue();
         tempOrnamentProperties.put(key, Double.valueOf(ornamentPropertyAfter - ornamentPropertyBefore).longValue());
      }

      this.ornamentProperties = tempOrnamentProperties;
      this.ornament_power = Double.valueOf(tempOrnamentPower).longValue();
      this.totalFightProperties = tempTotalFightProperties;
      this.totalShowProperties = tempTotalShowProperties;
      tempTotalCombatPower += (long)this.castPower;
      tempTotalCombatPower += this.talent_power;
      tempTotalCombatPower += this.pwoer_herose;
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer player = worldMgr.getPlayerById(this.playerId);
      HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
      if (this.use_divine_generals) {
         tempTotalCombatPower += heroBagPart.getDivinePower();
      }

      this.combatPower = tempTotalCombatPower;
   }

   private long[] claHeroSkillProperty(int key, int way) {
      long[] total = new long[]{0L, 0L};

      for(PropertyModel propertyModel : this.property_skill_hero) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      return total;
   }

   private long[] calListProperty(int key, int way, List<PropertyModel> list) {
      long[] total = new long[]{0L, 0L};
      if (list != null && !list.isEmpty()) {
         for(PropertyModel propertyModel : mergePropertys(list)) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }

         return total;
      } else {
         return total;
      }
   }

   private long[] calOtherProperty(int key, int way) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer player = worldMgr.getPlayerById(this.playerId);
      HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
      HeroModel model = (HeroModel)player.getGameModelPool().getEntity("hero", this.id);
      long[] total = new long[]{0L, 0L};

      for(PropertyModel propertyModel : mergePropertys(this.property_equips)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      if (this.use_artifact) {
         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_artifact_strong())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }

         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_artifact_refine())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }

         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_artifact_dress())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }

         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_artifact_castSoul())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_warriorignet)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      if (this.use_collect_dress) {
         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_hero_dress_collect())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_title)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      if (this.use_union) {
         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_union_skill(model.getType()))) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_skill_other)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      int realNation = heroBagPart.getHeroNation(this);
      if (this.use_treasure) {
         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_reasuret(realNation))) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      if (this.use_beauty) {
         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_tongque())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_totem)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_equip_cast_soul)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_hero_dress)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_warFlag)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_aide)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_exclusive_treasure)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_rune)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_god_beast)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_exclusive_weapon)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_exclusive_weapon_lib)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_rune_stone)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_dragonStrengthen)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      if (this.use_world_paint) {
         for(PropertyModel propertyModel : mergePropertys(this.property_world_paint)) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_duel_jade)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_star_map)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.extraWarHorsePros)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      if (this.use_hero_card) {
         for(PropertyModel propertyModel : mergePropertys(this.property_zhu_hou)) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      if (this.use_dragon_vein) {
         for(PropertyModel propertyModel : mergePropertys(this.property_dragon_vein)) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      if (this.use_palace) {
         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_hero_palace())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }

         for(PropertyModel propertyModel : mergePropertys(this.property_palace)) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      if (this.use_promote) {
         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_hero_promote())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      if (this.use_hero_dress) {
         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_hero_dress_all_base())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      if (this.use_army) {
         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_army_array())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }

         for(Integer grid : this.armyArrayGrids) {
            for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_eys_army_array(grid))) {
               if (propertyModel.getType() == key && propertyModel.getWay() == way) {
                  total[0] += propertyModel.getValue();
                  total[1] = addProperty(total[1], propertyModel.getValue(), key);
               }
            }
         }
      }

      if (!CollectionUtils.isEmpty(this.property_temp)) {
         for(PropertyModel propertyModel : mergePropertys(this.property_temp)) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      if (this.use_soul_palace) {
         Map<Integer, Map<Integer, Long>> property_soul_palace = heroBagPart.getProperty_soul_palace();
         if (property_soul_palace.containsKey(key)) {
            Map<Integer, Long> map = (Map)property_soul_palace.get(key);
            if (map.containsKey(way)) {
               total[0] += (Long)map.get(way);
               total[1] = addProperty(total[1], (Long)map.get(way), key);
            }
         }
      }

      return total;
   }

   private long[] calNoPowerAdditionProperty(int key, int way) {
      long[] total = new long[]{0L, 0L};

      for(PropertyModel propertyModel : mergePropertys(this.property_warHorse)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      return total;
   }

   private long[] calHavePowerAdditionProperty(int key, int way) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer player = worldMgr.getPlayerById(this.playerId);
      HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
      long[] total = new long[]{0L, 0L};
      if (this.use_divine_generals) {
         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_divine_generals())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      if (this.use_pet && heroBagPart.getProperty_pet() != null) {
         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_pet())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      if (this.use_aide_no_cal) {
         for(PropertyModel propertyModel : this.property_aide_no_cal) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      if (this.use_union) {
         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_union_activity())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      for(PropertyModel propertyModel : this.property_warFlag_hpAtk) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      if (this.use_artifact) {
         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_artifact_refine_add())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      if (this.use_hero_dress) {
         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_hero_dress_all())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue() * (long)this.getLvWithPromote();
               total[1] = addProperty(total[1], propertyModel.getValue() * (long)this.getLvWithPromote(), key);
            }
         }
      }

      if (this.use_beauty) {
         for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_tongque_new_beauty())) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = addProperty(total[1], propertyModel.getValue(), key);
            }
         }
      }

      return total;
   }

   public static List<PropertyModel> mergePropertys(List<PropertyModel> oldList) {
      List<PropertyModel> newList = new ArrayList();

      for(PropertyModel propertyModel : oldList) {
         boolean isSame = false;

         for(PropertyModel model : newList) {
            if (model.getType() == propertyModel.getType() && model.getWay() == propertyModel.getWay()) {
               model.setValue(model.getValue() + propertyModel.getValue());
               isSame = true;
            }
         }

         if (!isSame) {
            newList.add(new PropertyModel(propertyModel.getType(), propertyModel.getWay(), propertyModel.getValue()));
         }
      }

      return newList;
   }

   public static long addProperty(long base, long add, int key) {
      if (BattleMisc.isMultiplyProperty(key)) {
         return base == 0L ? add : 10000L - (10000L - base) * (10000L - add) / 10000L;
      } else {
         return base + add;
      }
   }

   private long calCombatPowerOfOtherModel() {
      int result = 0;
      result = (int)((long)result + this.combatPower_breach);
      result = (int)((long)result + this.combatPower_star);
      return (long)result;
   }

   public CommonMsg.HeroInfo.Builder toHeroInfo() {
      this.flushTotalProperties();
      CommonMsg.HeroInfo.Builder heroBuilder = CommonMsg.HeroInfo.newBuilder();
      heroBuilder.setCode(this.code);
      heroBuilder.setId(this.id);
      heroBuilder.setLv(this.getLvWithPromote());
      heroBuilder.setExp(this.exp);
      heroBuilder.setQuality(this.quality);
      heroBuilder.setStar(this.getStar());
      heroBuilder.setBreachLv(this.getBreachLv());
      heroBuilder.setCombatPower(this.combatPower);
      heroBuilder.addAllState(this.getStateList());
      heroBuilder.setAide(this.aide);
      heroBuilder.setAide2(this.aide2);
      heroBuilder.setAideTrammelsId(this.aideTrammelsId);
      heroBuilder.setLock(this.lock);
      heroBuilder.setPromoteLv(this.getPromoteLv());
      heroBuilder.addAllActiveDressId(this.getActiveDressIds());
      heroBuilder.addAllDestinySkills(this.destinySkills);
      heroBuilder.setPalaceTitle(this.palaceTitle);
      heroBuilder.setShareHeroId(this.shareHeroId);
      heroBuilder.setIsBaptize(this.rune.runeRefineMap != null && !this.rune.runeRefineMap.isEmpty());
      heroBuilder.setGodBeastInfo(GodBeastDefine.recGodBeastInfoBuilder(this.godBeastItem));
      heroBuilder.setRuneAndRefineInfo(this.toBuilderRuneAndRefineInfo());
      heroBuilder.addAllExclusiveWeaponInfo(EWeaponDefine.toBuildExclusiveWeaponInfoList(this.exclusiveWeaponMap, this.soulSkill));
      if (this.dressId > 0) {
         heroBuilder.setDressId(this.dressId);
         heroBuilder.setDressLv(this.dressLv);
         heroBuilder.setDressEndTime((int)(this.dressEndTime / 1000L));
      }

      boolean inCommonArraying = this.containState(CommonMsg.HeroState.HERO_STATE_ARRAYING.getNumber());
      Map<Integer, Long> addFriendProperties = null;
      Map<Integer, Long> addKingProperties = null;
      if (inCommonArraying) {
         addFriendProperties = this.convertAdditionToMap(this.property_friend);
         addKingProperties = this.convertAdditionToMap(this.property_king_control);
      }

      for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
         Long property = (Long)this.totalShowProperties.get(i);
         if (property != null) {
            heroBuilder.addProperties(property.intValue());
            if (inCommonArraying) {
               if (addFriendProperties != null) {
                  property = property - (Long)addFriendProperties.getOrDefault(i, 0L);
               }

               if (addKingProperties != null) {
                  property = property - (Long)addKingProperties.getOrDefault(i, 0L);
               }

               heroBuilder.addBaseProperties(property.intValue());
            }
         } else {
            heroBuilder.addProperties(0);
         }
      }

      for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
         if (this.totalFightProperties.get(i) != null) {
            heroBuilder.addFightProperties(((Long)this.totalShowProperties.get(i)).intValue());
         } else {
            heroBuilder.addFightProperties(0);
         }
      }

      heroBuilder.addAllUnlockHeroSkills(this.heroCastSoulSkills);
      if (this.armyArrayGrids.size() > 0) {
         for(int grid : this.armyArrayGrids) {
            ArmyArrayData armyArrayData = this.getArmyArrayData(grid);
            if (armyArrayData != null) {
               CommonMsg.ArmyArrayData.Builder armyArrayDataMsg = CommonMsg.ArmyArrayData.newBuilder();
               armyArrayDataMsg.setArrayId(armyArrayData.arrayId);

               for(Map.Entry<Integer, ResourceModel> entry : armyArrayData.protectedMap.entrySet()) {
                  ResourceModel resourceModel = (ResourceModel)entry.getValue();
                  CommonMsg.ItemInfo.Builder builder = CommonMsg.ItemInfo.newBuilder();
                  builder.setType(resourceModel.getType());
                  builder.setId(resourceModel.getId());
                  builder.setNum(resourceModel.getValue());
                  builder.setPos((Integer)entry.getKey());
                  armyArrayDataMsg.addProtectData(builder);
               }

               heroBuilder.addArmyArrayData(armyArrayDataMsg);
            }
         }
      }

      if (this.isNeedFlush()) {
         for(Map.Entry<Integer, EquipItem> entry : this.equips.entrySet()) {
            CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
            CommonMsg.HeroEquipInfo.Builder equipBuilder = CommonMsg.HeroEquipInfo.newBuilder();
            equipBuilder.setPosition(position);
            equipBuilder.setId(((EquipItem)entry.getValue()).id);
            heroBuilder.addEquips(equipBuilder);
         }

         for(Map.Entry<Integer, Integer> entry : this.castSouls.entrySet()) {
            CommonMsg.HeroCastInfo.Builder castSoulsBulider = CommonMsg.HeroCastInfo.newBuilder();
            CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
            castSoulsBulider.setPosition(position);
            castSoulsBulider.setState((Integer)entry.getValue());
            heroBuilder.addCast(castSoulsBulider);
         }

         for(Map.Entry<Integer, WarriorSignet> entry : this.warriors.entrySet()) {
            CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
            CommonMsg.HeroWarriorSignetInfo.Builder warriorSignetBuilder = CommonMsg.HeroWarriorSignetInfo.newBuilder();
            warriorSignetBuilder.setPosition(position);
            warriorSignetBuilder.setId(((WarriorSignet)entry.getValue()).id);
            warriorSignetBuilder.setScore(((WarriorSignet)entry.getValue()).score);

            for(Integer skillId : ((WarriorSignet)entry.getValue()).skills) {
               warriorSignetBuilder.addSkills(skillId);
            }

            for(PropertyModel property : ((WarriorSignet)entry.getValue()).properties) {
               warriorSignetBuilder.addProperty(property.builder());
            }

            for(PropertyModel recastPro : ((WarriorSignet)entry.getValue()).recastPros) {
               warriorSignetBuilder.addRecastPros(recastPro.builder());
            }

            for(Integer recastSkill : ((WarriorSignet)entry.getValue()).recastSkills) {
               warriorSignetBuilder.addRecastSkills(recastSkill);
            }

            WarriorSignetDefine.addExclusiveAttrAndSkill(((WarriorSignet)entry.getValue()).id, warriorSignetBuilder);
            heroBuilder.addWarriorSignets(warriorSignetBuilder);
         }

         heroBuilder.setOrnament(this.packOrnamentInfo());

         for(Map.Entry<Integer, Integer> entry : this.warcrafts.entrySet()) {
            CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
            CommonMsg.HeroWarcraftInfo.Builder warcraftBuilder = CommonMsg.HeroWarcraftInfo.newBuilder();
            warcraftBuilder.setPosition(position);
            warcraftBuilder.setId((Integer)entry.getValue());
            heroBuilder.addWarcraft(warcraftBuilder);
         }

         heroBuilder.setRuneLev(this.runeLv);

         for(Map.Entry<Integer, RuneStoneItem> entry : this.runeStone.entrySet()) {
            CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
            CommonMsg.RuneStoneWear.Builder wearBuilder = CommonMsg.RuneStoneWear.newBuilder();
            wearBuilder.setPosition(position);
            wearBuilder.setId(((RuneStoneItem)entry.getValue()).id);
            wearBuilder.setStrengthen(((RuneStoneItem)entry.getValue()).strengthen);

            for(Map.Entry<Integer, PropertyModel> propertyModelEntry : ((RuneStoneItem)entry.getValue()).proMap.entrySet()) {
               wearBuilder.addPro(((RuneStoneItem)entry.getValue()).toBuilder((Integer)propertyModelEntry.getKey(), (PropertyModel)propertyModelEntry.getValue(), ((RuneStoneItem)entry.getValue()).strengthen));
            }

            heroBuilder.addRuneStone(wearBuilder);
         }

         if (this.warFlag != null) {
            CommonMsg.WarFlagInfo.Builder warFlagBuilder = CommonMsg.WarFlagInfo.newBuilder();
            warFlagBuilder.setId(this.warFlag.id);
            warFlagBuilder.setStrongLv(this.warFlag.strongLv);
            warFlagBuilder.setRecastNum(this.warFlag.recastNum);
            warFlagBuilder.setHighRecastNum(this.warFlag.highRecastNum);

            for(PropertyModel strongProperty : this.warFlag.strongProperties) {
               warFlagBuilder.addStrongPros(strongProperty.builder());
            }

            for(PropertyModel recastProperty : this.warFlag.recastProperties) {
               warFlagBuilder.addRecastPros(recastProperty.builder());
            }

            heroBuilder.setWafFlag(warFlagBuilder);
         }

         if (!this.isRobot) {
            heroBuilder.setTreasureLev(this.getTreasure(1));
            heroBuilder.setTreasureStage(this.getTreasure(2));
         }

         for(Map.Entry<Integer, List> entry : this.talent.entrySet()) {
            CommonMsg.TalentInfo.Builder infoBuilder = CommonMsg.TalentInfo.newBuilder();
            infoBuilder.setPosition(CommonMsg.WearPosition.forNumber((Integer)entry.getKey()));
            infoBuilder.setLv((Integer)((List)entry.getValue()).get(0));
            if (((List)entry.getValue()).size() > 1) {
               infoBuilder.setIndex((Integer)((List)entry.getValue()).get(1));
            } else {
               infoBuilder.setIndex(-1);
            }

            heroBuilder.addTalentInfos(infoBuilder.build());
         }

         if (!this.isRobot) {
            if (this.exTreasure != null) {
               heroBuilder.setExclusiveInfo(this.packExclusive());
               this.addExclusive();
            } else if (this.checkExclusive()) {
               this.exTreasure = new ExclusiveTreasure();
               WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
               GamePlayer player = worldMgr.getPlayerById(this.playerId);
               ExclusiveTreasurePart part = (ExclusiveTreasurePart)player.getMgrPart(ExclusiveTreasurePart.class);
               ExclusiveTreasureDao dao = part.getDao();
               if (dao.resetData.containsKey(this.code)) {
                  ExclusiveResetData resetData = (ExclusiveResetData)dao.resetData.get(this.code);
                  if (resetData.skillId > 0) {
                     this.exTreasure.skillId = resetData.skillId;
                  }

                  if (resetData.extraProId > 0) {
                     this.exTreasure.extraProId = resetData.extraProId;
                  }

                  if (resetData.condition1 > 0) {
                     this.exTreasure.condition1 = resetData.condition1;
                  }

                  if (resetData.condition2 > 0) {
                     this.exTreasure.condition2 = resetData.condition2;
                  }
               }

               this.updateOp();
               heroBuilder.setExclusiveInfo(this.packExclusive());
            }
         }

         Totem totem = this.getTotem();
         if (totem != null) {
            CommonMsg.TotemInfo.Builder totemBuilder = CommonMsg.TotemInfo.newBuilder();
            totemBuilder.setId(totem.id);
            totemBuilder.setLevel(totem.level);
            totemBuilder.setBreachLv(totem.breachLv);
            heroBuilder.setTotemInfo(totemBuilder);
         }

         if (this.warHorse != null) {
            CommonMsg.WarHorseInfo.Builder warHorseBuilder = CommonMsg.WarHorseInfo.newBuilder();
            warHorseBuilder.setId(this.warHorse.id);
            warHorseBuilder.setLv(this.warHorse.lv);
            warHorseBuilder.setExp(this.warHorse.exp);
            warHorseBuilder.setArtificeVal(this.warHorse.artificeVal);
            warHorseBuilder.setSkinId(this.warHorse.skinId);
            warHorseBuilder.setIsLock(this.warHorse.isLock);
            warHorseBuilder.addAllHorseLockSkill(this.warHorse.lockSkilIndex);
            warHorseBuilder.addAllUpSkills(this.warHorse.upSkills);
            warHorseBuilder.setIsMainSkillUnlock(this.warHorse.isUnlock);
            warHorseBuilder.setIsAwaken(this.warHorse.isAwaken);

            for(PropertyModel warHorseBasePro : this.warHorseBasePros) {
               warHorseBuilder.addWarHorseBasePros(warHorseBasePro.builder());
            }

            if (!this.warHorse.awakenIndex.isEmpty()) {
               warHorseBuilder.addAllAwakenIndex(this.warHorse.awakenIndex);
            }

            heroBuilder.setWarHorse(warHorseBuilder);
         }

         if (!this.strengthLev.isEmpty()) {
            for(Map.Entry<Integer, Integer> entry : this.strengthLev.entrySet()) {
               if ((Integer)entry.getValue() > 0) {
                  CommonMsg.HeroEquipStrengthInfo.Builder strengthBuilder = CommonMsg.HeroEquipStrengthInfo.newBuilder();
                  CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
                  strengthBuilder.setPosition(position);
                  strengthBuilder.setStrengthLev((Integer)entry.getValue());
                  heroBuilder.addStrengthInfo(strengthBuilder);
               }
            }
         }

         if (!this.strengthSkill.isEmpty()) {
            this.packStrengthSKill(heroBuilder);
         }

         Map<Integer, StarMapPoint> starMapPointMap = this.recHeroStarMapPointMap();
         if (null != starMapPointMap && starMapPointMap.size() > 0) {
            heroBuilder.addAllStarMapPointInfo(StarMapDefine.toBuilderStarMapPointInfoList(starMapPointMap));
            heroBuilder.setStarMapTotalLv(this.recStarMapTotalLv());
         }

         if (!this.palaceStarSkill.isEmpty()) {
            for(Map.Entry<Integer, Integer> entry : this.palaceStarSkill.entrySet()) {
               CommonMsg.MapDataII.Builder mapBuilder = CommonMsg.MapDataII.newBuilder();
               mapBuilder.setKey((Integer)entry.getKey());
               mapBuilder.setValue((Integer)entry.getValue());
               heroBuilder.addSelectSkill(mapBuilder);
            }
         }
      }

      heroBuilder.setInheritNation(this.inheritNation);
      heroBuilder.setLinkCode(this.linkCode);
      heroBuilder.setInvalidTime(this.invalidTime);
      heroBuilder.setBeLinkCode(this.beLinkCode);
      return heroBuilder;
   }

   public void remStarTypeWrongStarId(ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, StarAspectRumModel>> starId_levelModelMap) {
      if (this.starMap != null && this.starMap.size() > 0) {
         List<Integer> remStarIdList = new ArrayList();

         for(Map.Entry<Integer, StarMapPoint> entry : this.starMap.entrySet()) {
            Integer starId = (Integer)entry.getKey();
            StarMapPoint starMapPoint = (StarMapPoint)entry.getValue();
            ConcurrentHashMap<Integer, StarAspectRumModel> level_modelMap = (ConcurrentHashMap)starId_levelModelMap.get(starId);
            if (level_modelMap == null || level_modelMap.isEmpty()) {
               remStarIdList.add(starId);
            }

            StarAspectRumModel starAspectRumModel = (StarAspectRumModel)level_modelMap.get(1);
            if (null == starAspectRumModel) {
               remStarIdList.add(starId);
            }

            if (starMapPoint.optionSkillGroup == 0 && starAspectRumModel.getStarType() == 2) {
               remStarIdList.add(starId);
            }

            if ((starMapPoint.optionSkillGroup == -1 || starMapPoint.optionSkillGroup > 0) && starAspectRumModel.getStarType() == 1) {
               remStarIdList.add(starId);
            }
         }

         if (remStarIdList.size() > 0) {
            for(int remStarId : remStarIdList) {
               this.starMap.remove(remStarId);
            }

            this.updateOp();
         }
      }

   }

   public Map<Integer, StarMapPoint> recHeroStarMapPointMap() {
      StarMapTypeModel starMapTypeModel = StarMapDefine.getStarMapTypeModel(this);
      if (null != starMapTypeModel && starMapTypeModel.getIsRelease() != 2) {
         if (this.getStar() < starMapTypeModel.getStar()) {
            return null;
         } else {
            ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, StarAspectRumModel>> starId_levelModelMap = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customStarAspectrum", starMapTypeModel.getStarMapId());
            if (null != starId_levelModelMap && !starId_levelModelMap.isEmpty()) {
               if (this.starMap == null) {
                  this.starMap = new HashMap();
                  this.updateOp();
               }

               this.remStarTypeWrongStarId(starId_levelModelMap);
               if (this.starMap.isEmpty()) {
                  Set<Integer> unlockInitStarIds = new HashSet();

                  for(Integer starId : starId_levelModelMap.keySet()) {
                     ConcurrentHashMap<Integer, StarAspectRumModel> level_model = (ConcurrentHashMap)starId_levelModelMap.get(starId);
                     if (null != level_model) {
                        StarAspectRumModel starAspectRumModel = (StarAspectRumModel)level_model.get(1);
                        if (null != starAspectRumModel && starAspectRumModel.getUnlockType() == 0) {
                           unlockInitStarIds.add(starId);
                        }
                     }
                  }

                  if (!unlockInitStarIds.isEmpty()) {
                     Map<Integer, StarMapPoint> tempStarMap = new HashMap();

                     for(Integer unlockInitStarId : unlockInitStarIds) {
                        if (!this.starMap.containsKey(unlockInitStarId)) {
                           StarMapPoint initStarMapPoint = StarMapDefine.getInitStarMapPoint(this, starMapTypeModel.getStarMapId(), unlockInitStarId, tempStarMap);
                           if (null != initStarMapPoint) {
                              tempStarMap.put(unlockInitStarId, initStarMapPoint);
                           }
                        }
                     }

                     if (!tempStarMap.isEmpty()) {
                        this.starMap.putAll(tempStarMap);
                        this.updateOp();
                     }
                  }
               }

               return this.starMap;
            } else {
               logger.error("StarAspectRum 缺少配置 starMapId:{}", starMapTypeModel.getStarMapId());
               return null;
            }
         }
      } else {
         return null;
      }
   }

   public int recStarMapTotalLv() {
      return StarMapDefine.recStarMapTotalLv(this.recHeroStarMapPointMap());
   }

   public CommonMsg.RuneAndRefineInfo.Builder toBuilderRuneAndRefineInfo() {
      CommonMsg.RuneAndRefineInfo.Builder runeAndRefineInfoBuilder = CommonMsg.RuneAndRefineInfo.newBuilder();
      if (null != this.rune && !this.rune.runeMap.isEmpty()) {
         Map<Integer, RuneItem> runeMap = this.rune.runeMap;
         Map<Integer, RuneRefineInheritItem> runeRefineMap = this.rune.runeRefineMap;

         for(Map.Entry<Integer, RuneItem> runeItemEntry : runeMap.entrySet()) {
            Integer positionNum = (Integer)runeItemEntry.getKey();
            RuneItem runeItem = (RuneItem)runeItemEntry.getValue();
            RuneMainModel runeMainModel = this.getRuneMainModel(runeItem.id);
            if (null == runeMainModel) {
               logger.error("RuneMain 缺少配置 id:{}", runeItem.id);
            } else {
               CommonMsg.RuneInfo.Builder runeInfoBuilder = CommonMsg.RuneInfo.newBuilder();
               runeInfoBuilder.setPosition(CommonMsg.RunePosition.forNumber(positionNum));
               runeInfoBuilder.setRuneId(runeMainModel.getId());
               runeInfoBuilder.setRuneLv(runeItem.level);
               runeInfoBuilder.setUpgradeProgress(runeItem.upgradeProgress);
               runeAndRefineInfoBuilder.addRuneInfo(runeInfoBuilder);
               RuneRefineInheritItem runeRefineInheritItem = (RuneRefineInheritItem)runeRefineMap.get(positionNum);
               if (null != runeRefineInheritItem) {
                  RuneRefineLvNatureModel runeRefineLvNatureModel = this.getRuneRefineLvNatureModel(positionNum, runeRefineInheritItem.breakUpTime);
                  if (null == runeRefineLvNatureModel) {
                     logger.error("RuneRefineLvNature缺少配置 seat:{},breakUpTime:{}", positionNum, runeRefineInheritItem.breakUpTime);
                  } else {
                     CommonMsg.RuneRefineInfo.Builder runeRefineInfoBuilder = CommonMsg.RuneRefineInfo.newBuilder();
                     runeRefineInfoBuilder.setPosition(CommonMsg.RunePosition.forNumber(positionNum));
                     runeRefineInfoBuilder.setRefineLv(runeRefineLvNatureModel.getRefineLv());
                     runeRefineInfoBuilder.setBreakUpTime(runeRefineInheritItem.breakUpTime);

                     for(Map.Entry<Integer, PropertyModel> entry : runeRefineInheritItem.refinePro.entrySet()) {
                        runeRefineInfoBuilder.addRefineProperty(runeRefineInheritItem.toBuilderRefineProperty((Integer)entry.getKey()));
                     }

                     runeAndRefineInfoBuilder.addRuneRefineInfo(runeRefineInfoBuilder);
                  }
               }
            }
         }

         this.updateOp();
         RunePropertiesAndSkills suitProAndSkillIdList = this.getSuitProAndSkillIdList();
         if (suitProAndSkillIdList != null && suitProAndSkillIdList.getSkillList().size() > 0) {
            for(int skillId : suitProAndSkillIdList.getSkillList()) {
               runeAndRefineInfoBuilder.addSkillId(skillId);
            }
         }

         return runeAndRefineInfoBuilder;
      } else {
         return runeAndRefineInfoBuilder;
      }
   }

   public RunePropertiesAndSkills getSuitProAndSkillIdList() {
      List<PropertyModel> suitProList = new ArrayList();
      List<Integer> suitSkillIdList = new ArrayList();
      if (null != this.rune && !this.rune.runeMap.isEmpty()) {
         Map<Integer, Set<Integer>> suitId_runeIdSetMap = new HashMap();
         Map<Integer, List<Integer>> suitId_runeQualityListMap = new HashMap();
         Map<Integer, Integer> suitId_minRuneQuality = new HashMap();

         for(Map.Entry<Integer, RuneItem> runeItemEntry : this.rune.runeMap.entrySet()) {
            RuneItem runeItem = (RuneItem)runeItemEntry.getValue();
            RuneMainModel runeMainModel = this.getRuneMainModel(runeItem.id);
            if (null != runeMainModel) {
               (suitId_runeIdSetMap.computeIfAbsent(runeMainModel.getSuitId(), (k) -> new HashSet())).add(runeMainModel.getId());
               ((List)suitId_runeQualityListMap.computeIfAbsent(runeMainModel.getSuitId(), (k) -> new ArrayList())).add(runeMainModel.getQuality());
               Integer minRuneQuality = (Integer)suitId_minRuneQuality.get(runeMainModel.getSuitId());
               if (null == minRuneQuality) {
                  suitId_minRuneQuality.put(runeMainModel.getSuitId(), runeMainModel.getQuality());
               } else if (minRuneQuality > runeMainModel.getQuality()) {
                  suitId_minRuneQuality.put(runeMainModel.getSuitId(), runeMainModel.getQuality());
               }
            }
         }

         int skill4SuitModelId = 0;

         for(Map.Entry<Integer, Set<Integer>> suitId_runeIds : suitId_runeIdSetMap.entrySet()) {
            Integer suitId = (Integer)suitId_runeIds.getKey();
            Set<Integer> runeIds = suitId_runeIds.getValue();
            if (runeIds.size() >= 2) {
               int suitSkill2RuneQuality = 0;
               if (runeIds.size() == 2) {
                  Integer minRuneQuality = (Integer)suitId_minRuneQuality.get(suitId);
                  if (null == minRuneQuality) {
                     logger.error("suitId_minRuneQuality未找到最低品质符文 suitId:{}", suitId);
                     continue;
                  }

                  suitSkill2RuneQuality = minRuneQuality;
               } else if (runeIds.size() > 2) {
                  List<Integer> runeQualityList = (List)suitId_runeQualityListMap.get(suitId);
                  if (runeQualityList == null || runeQualityList.size() <= 2) {
                     logger.error("suitId_runeQualityListMap未找到对应套装符文品质列表");
                     continue;
                  }

                  List<Integer> runeQualityListSorted = (List)runeQualityList.stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
                  suitSkill2RuneQuality = (Integer)runeQualityListSorted.get(1);
               }

               RuneSuitModel runeSuitNature2Model = this.getRuneSuitNature2Model(suitId, suitSkill2RuneQuality);
               if (null != runeSuitNature2Model) {
                  suitProList.addAll(runeSuitNature2Model.getSuitSkill2());
               }
            }

            if (runeIds.size() >= 4) {
               Integer minRuneQuality = (Integer)suitId_minRuneQuality.get(suitId);
               if (null == minRuneQuality) {
                  logger.error("suitId_minRuneQuality未找到最低品质符文 suitId:{}", suitId);
               } else {
                  RuneSuitModel runeSuitSkill4Model = this.getRuneSuitSkill4Model(suitId, minRuneQuality);
                  if (null != runeSuitSkill4Model) {
                     suitSkillIdList.add(runeSuitSkill4Model.getSuitSkill4());
                     skill4SuitModelId = runeSuitSkill4Model.getId();
                  }
               }
            }
         }

         RunePropertiesAndSkills proAndSkills = new RunePropertiesAndSkills(suitProList, suitSkillIdList, skill4SuitModelId);
         return proAndSkills;
      } else {
         return new RunePropertiesAndSkills(suitProList, suitSkillIdList, 0);
      }
   }

   public RuneRefineLvNatureModel getRuneRefineLvNatureModel(int seat, int breakUpTime) {
      ConcurrentHashMap<Integer, RuneRefineLvNatureModel> breakUpTime_model = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customRuneRefinelvNature", seat);
      if (null == breakUpTime_model) {
         logger.error("RuneRefineLvNature缺少配置 seat:{},breakUpTime:{}", seat, breakUpTime);
         return null;
      } else {
         RuneRefineLvNatureModel model = (RuneRefineLvNatureModel)breakUpTime_model.get(breakUpTime);
         if (null == model) {
            logger.error("RuneRefineLvNature缺少配置 seat:{},breakUpTime:{}", seat, breakUpTime);
         }

         return (RuneRefineLvNatureModel)breakUpTime_model.get(breakUpTime);
      }
   }

   public RuneMainModel getRuneMainModel(int runeId) {
      RuneMainModel model = (RuneMainModel)ApplicationContextProvider.getModelPoolEntity("RuneMain", runeId);
      if (null == model) {
         logger.error("RuneMain配置为空 id:{}", runeId);
      }

      return model;
   }

   public RuneSuitModel getRuneSuitNature2Model(int suitId, int suitSkill2RuneQuality) {
      ConcurrentHashMap<Integer, RuneSuitModel> maxRuneNature_model = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customRuneSuitNature2", suitId);
      if (null == maxRuneNature_model) {
         return null;
      } else {
         RuneSuitModel runeSuitModel = (RuneSuitModel)maxRuneNature_model.get(suitSkill2RuneQuality);
         return runeSuitModel;
      }
   }

   public RuneSuitModel getRuneSuitSkill4Model(int suitId, int minRuneQuality) {
      ConcurrentHashMap<Integer, RuneSuitModel> minRuneQuality_model = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customRuneSuitSkill4", suitId);
      RuneSuitModel runeSuitModel = (RuneSuitModel)minRuneQuality_model.get(minRuneQuality);
      return runeSuitModel;
   }

   public void packStrengthSKill(CommonMsg.HeroInfo.Builder heroBuilder) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer player = worldMgr.getPlayerById(this.playerId);
      EquipStrengthPart equipStrengthPart = (EquipStrengthPart)player.getMgrPart(EquipStrengthPart.class);
      int minLev = equipStrengthPart.getMinLev(this);
      if (!this.strengthSkill.isEmpty()) {
         for(Map.Entry<Integer, Integer> entry : this.strengthSkill.entrySet()) {
            if ((Integer)entry.getValue() > 0 && (Integer)entry.getKey() <= minLev) {
               CommonMsg.EquipStrengthSkillInfo.Builder strengthBuilder = CommonMsg.EquipStrengthSkillInfo.newBuilder();
               CommonMsg.StrengthSkillPosition position = CommonMsg.StrengthSkillPosition.forNumber((Integer)entry.getValue());
               strengthBuilder.setStrengthLev((Integer)entry.getKey());
               strengthBuilder.setPosition(position);
               heroBuilder.addStrengthSkillInfo(strengthBuilder);
            }
         }
      }

   }

   public CommonMsg.ExclusiveInfo.Builder packExclusive() {
      CommonMsg.ExclusiveInfo.Builder exclusiveBuilder = CommonMsg.ExclusiveInfo.newBuilder();
      exclusiveBuilder.setLev(this.exTreasure.lev);
      exclusiveBuilder.setStar(this.exTreasure.star);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      ExclusiveTreasureActivationModel activationModel = (ExclusiveTreasureActivationModel)gameModelPool.getEntity("exclusiveTreasureActivation", this.exTreasure.condition1);
      Map<Integer, Integer> numMap = new HashMap();
      if (!this.exTreasure.stoneMap.isEmpty()) {
         for(Integer stoneId : this.exTreasure.stoneMap.values()) {
            ExclusiveTreasureStoneModel stoneModel = (ExclusiveTreasureStoneModel)gameModelPool.getEntity("exclusiveTreasureStone", stoneId);
            if (!Objects.isNull(stoneModel)) {
               int tempNum = (Integer)numMap.getOrDefault(stoneModel.getType(), 0);
               numMap.put(stoneModel.getType(), tempNum + 1);
            }
         }

         int num1 = (Integer)numMap.getOrDefault(1, 0);
         int num2 = (Integer)numMap.getOrDefault(2, 0);
         int num3 = (Integer)numMap.getOrDefault(3, 0);
         if (num1 >= activationModel.getTriangleNum() && num2 >= activationModel.getSquareNum() && num3 >= activationModel.getCircularNum()) {
            ExclusiveTreasureExtraModel extraModel = (ExclusiveTreasureExtraModel)gameModelPool.getEntity("exclusiveTreasureExtra", this.exTreasure.extraProId);
            if (!Objects.isNull(extraModel)) {
               exclusiveBuilder.setExtraProId(this.exTreasure.extraProId);
            }
         }

         ExclusiveTreasureActivationModel skillModel = (ExclusiveTreasureActivationModel)gameModelPool.getEntity("exclusiveTreasureActivation", this.exTreasure.condition2);
         if (num1 >= skillModel.getTriangleNum() && num2 >= skillModel.getSquareNum() && num3 >= skillModel.getCircularNum()) {
            ExclusiveTreasureExtraModel extraSkillModel = (ExclusiveTreasureExtraModel)gameModelPool.getEntity("exclusiveTreasureExtra", this.exTreasure.skillId);
            if (!Objects.isNull(extraSkillModel)) {
               exclusiveBuilder.setSkillId(extraSkillModel.getSkillId());
            }
         }

         for(Map.Entry<CommonMsg.StonePosition, Integer> entry : this.exTreasure.stoneMap.entrySet()) {
            CommonMsg.TreasureStone.Builder stoneBuilder = CommonMsg.TreasureStone.newBuilder();
            stoneBuilder.setPosition((CommonMsg.StonePosition)entry.getKey());
            stoneBuilder.setId((Integer)entry.getValue());
            exclusiveBuilder.addExclusiveStone(stoneBuilder);
         }
      }

      return exclusiveBuilder;
   }

   public int getTreasure(int type) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer player = worldMgr.getPlayerById(this.playerId);
      TreasurePart treasurePart = (TreasurePart)player.getMgrPart(TreasurePart.class);
      HeroModel model = (HeroModel)player.getGameModelPool().getEntity("hero", this.id);
      if (model == null) {
         return 0;
      } else {
         HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
         int realNation = heroBagPart.getHeroNation(this);
         return treasurePart.getTreasureLevOrStage(realNation, type);
      }
   }

   public Boolean checkExclusive() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer player = worldMgr.getPlayerById(this.playerId);
      ExclusiveTreasurePart part = (ExclusiveTreasurePart)player.getMgrPart(ExclusiveTreasurePart.class);
      ExclusiveTreasureDao dao = part.getDao();
      return dao.heroIds.contains(this.id);
   }

   public void addExclusive() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer player = worldMgr.getPlayerById(this.playerId);
      ExclusiveTreasurePart part = (ExclusiveTreasurePart)player.getMgrPart(ExclusiveTreasurePart.class);
      ExclusiveTreasureDao exclusiveTreasureDao = part.getDao();
      if (!exclusiveTreasureDao.heroIds.contains(this.id)) {
         exclusiveTreasureDao.heroIds.add(this.id);
         exclusiveTreasureDao.updateOp();
      }

   }

   public CommonMsg.HeroOrnamentInfo.Builder packOrnamentInfo() {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      Set<Integer> skillSet = new HashSet();
      CommonMsg.HeroOrnamentInfo.Builder ornamentBuilder = CommonMsg.HeroOrnamentInfo.newBuilder();

      for(Map.Entry<Integer, OrnamentItem> entry : this.ornament.entrySet()) {
         OrnamentItem data = (OrnamentItem)entry.getValue();
         CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
         CommonMsg.OrnamentWear.Builder wearBuilder = CommonMsg.OrnamentWear.newBuilder();
         wearBuilder.setPosition(position);
         wearBuilder.setId(data.id);
         wearBuilder.setLev(data.lev);
         wearBuilder.setClearNum1(data.clearNum1);
         wearBuilder.setClearNum2(data.clearNum2);
         wearBuilder.setClearNum3(data.clearNum3);
         wearBuilder.setClearNum4(data.clearNum4);
         wearBuilder.setClearNum5(data.clearNum5);
         wearBuilder.addClearNum(data.clearNum1);
         wearBuilder.addClearNum(data.clearNum2);
         wearBuilder.addClearNum(data.clearNum3);
         wearBuilder.addClearNum(data.clearNum4);
         wearBuilder.addClearNum(data.clearNum5);

         for(PropertyModel v : data.proMap.values()) {
            wearBuilder.addExtraPro(v.builder());
         }

         for(PropertyModel v : data.clearProMap.values()) {
            wearBuilder.addClearExtraPro(v.builder());
         }

         wearBuilder.addAllProColour(data.proColour);
         wearBuilder.addAllExtraProColour(data.clearProColour);
         ornamentBuilder.addInfo(wearBuilder);
      }

      Map<String, ArrayList<StampModel>> setMap = new HashMap();

      for(OrnamentItem ornamentItem : this.ornament.values()) {
         StampModel stampModel = (StampModel)gameModelPool.getEntity("Stamp", ornamentItem.id);
         if (stampModel != null) {
            if (setMap.containsKey(stampModel.getSetType() + "-" + stampModel.getSetId())) {
               ((ArrayList)setMap.get(stampModel.getSetType() + "-" + stampModel.getSetId())).add(stampModel);
            } else {
               ArrayList<StampModel> list = new ArrayList();
               list.add(stampModel);
               setMap.put(stampModel.getSetType() + "-" + stampModel.getSetId(), list);
            }
         }
      }

      for(List<StampModel> stampList : setMap.values()) {
         if (stampList.size() == 4) {
            int starMin = 100;

            for(int i = 0; i < stampList.size(); ++i) {
               if (starMin > ((StampModel)stampList.get(i)).getStar()) {
                  starMin = ((StampModel)stampList.get(i)).getStar();
               }
            }

            StampSetModel setModel = (StampSetModel)gameModelPool.getEntity("StampSet", ((StampModel)stampList.get(0)).getSetId());
            if (setModel.getSpSkillId().size() >= starMin) {
               skillSet.add(setModel.getSpSkillId().get(starMin - 1));
            }

            int maxStar = 0;
            Map<Integer, Integer> specialMap = new HashMap();

            for(StampModel stampModel : stampList) {
               MapUtil.mapPlusInt(specialMap, stampModel.getStar(), 1);
            }

            if (!specialMap.isEmpty()) {
               for(Map.Entry<Integer, Integer> entry : specialMap.entrySet()) {
                  if ((Integer)entry.getValue() >= 2 && (Integer)entry.getKey() > maxStar) {
                     maxStar = (Integer)entry.getKey();
                  }
               }
            }

            if (maxStar > 0 && setModel.getSetSkillId().size() >= maxStar) {
               skillSet.add(setModel.getSetSkillId().get(maxStar - 1));
            }
         } else if (stampList.size() == 2) {
            int minStar = Integer.MAX_VALUE;

            for(StampModel stampModel : stampList) {
               if (stampModel.getStar() < minStar) {
                  minStar = stampModel.getStar();
               }
            }

            StampSetModel setModel = (StampSetModel)gameModelPool.getEntity("StampSet", ((StampModel)stampList.get(0)).getSetId());
            if (setModel != null) {
               skillSet.add(setModel.getSetSkillId().get(minStar - 1));
            }
         } else if (stampList.size() == 3) {
            int specialStar = 0;
            int minStar = Integer.MAX_VALUE;
            Map<Integer, Integer> specialMap = new HashMap();

            for(StampModel stampModel : stampList) {
               MapUtil.mapPlusInt(specialMap, stampModel.getStar(), 1);
            }

            for(Map.Entry<Integer, Integer> entry : specialMap.entrySet()) {
               if ((Integer)entry.getKey() < minStar) {
                  minStar = (Integer)entry.getKey();
               }

               if ((Integer)entry.getValue() >= 2) {
                  specialStar = (Integer)entry.getKey();
               }
            }

            StampSetModel setModel = (StampSetModel)gameModelPool.getEntity("StampSet", ((StampModel)stampList.get(0)).getSetId());
            if (setModel != null) {
               if (specialStar != 0) {
                  skillSet.add(setModel.getSetSkillId().get(specialStar - 1));
               } else if (minStar != 0) {
                  skillSet.add(setModel.getSetSkillId().get(minStar - 1));
               }
            }
         }
      }

      ornamentBuilder.addAllSkill(skillSet);
      ornamentBuilder.setOrnamentPower(this.getOrnamentPower());
      if (!this.getOrnametProperty().isEmpty()) {
         for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
            if (this.getOrnametProperty().get(i) != null) {
               ornamentBuilder.addProAll(((Long)this.getOrnametProperty().get(i)).intValue());
            } else {
               ornamentBuilder.addProAll(0);
            }
         }
      }

      return ornamentBuilder;
   }

   public long getOrnamentPower() {
      return this.ornament_power;
   }

   public Map<Integer, Long> getOrnametProperty() {
      return this.ornamentProperties;
   }

   public static List<PropertyModel> getPropertyOfSkillEffect(List<Integer> skillEffectList, int heroLv) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      SkillEffectModel skillEffectModel = null;
      List<PropertyModel> property_skill_temp = new ArrayList();

      for(Integer effectId : skillEffectList) {
         skillEffectModel = (SkillEffectModel)gameModelPool.getEntity("skillEffect", effectId);
         if (skillEffectModel != null && skillEffectModel.getProperty() > 0 && skillEffectModel.getFetterType() == 0 && skillEffectModel.getNation() == 0) {
            int propertyId = skillEffectModel.getProperty();
            if (propertyId > 0) {
               int value = skillEffectModel.getPropertyValue();
               if (value != 0) {
                  property_skill_temp.add(new PropertyModel(propertyId, skillEffectModel.getCalc(), (long)value));
               }
            }

            int propertyId_lv = skillEffectModel.getProperty_lv();
            if (propertyId_lv > 0) {
               int value = skillEffectModel.getPropertyValue_lv() * heroLv;
               if (value != 0) {
                  property_skill_temp.add(new PropertyModel(propertyId_lv, skillEffectModel.getCalc_lv(), (long)value));
               }
            }
         }
      }

      return property_skill_temp;
   }

   public static List<Integer> getEffectsOfAddProperty(List<Integer> resourceSkillList) {
      List<Integer> allEffects = new ArrayList();
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);

      for(Integer skillId : resourceSkillList) {
         SkillModel skillModel = (SkillModel)gameModelPool.getEntity("skill", skillId);
         if (skillModel != null && (skillModel.getType() == 1 || skillModel.getType() == 3)) {
            for(Map.Entry<Integer, Integer> entry : skillModel.getEffects().entrySet()) {
               allEffects.add(entry.getValue());
            }
         }
      }

      return allEffects;
   }

   public static List<Integer> getTalentSkill(int heroId, int star, int dressHeroId, Map<Integer, List> talentMap, GamePlayer gamePlayer, HeroModel heroModel, boolean isPalaceHero, int shareHeroId) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      if (!isPalaceHero && dressHeroId > 0) {
         Map<Integer, TalentSkillModel> map = (Map)gameModelPool.getEntity("customTalentSkill", dressHeroId);
         if (null != map) {
            heroId = dressHeroId;
         }
      }

      List<Integer> tempSkill = new ArrayList();
      if (talentMap != null && !talentMap.isEmpty()) {
         for(Map.Entry<Integer, List> entry : talentMap.entrySet()) {
            if (((List)entry.getValue()).size() > 1) {
               int position = (Integer)entry.getKey();
               int curLv = (Integer)((List)entry.getValue()).get(0);
               int index = (Integer)((List)entry.getValue()).get(1);
               TalentLevelModel talentLevelModel = (TalentLevelModel)gameModelPool.getEntity("talentLevel", position);
               if (talentLevelModel != null && talentLevelModel.getStar() <= star) {
                  int key = position - 19;
                  int normalSkillId = getSkillId(heroId, position, curLv, index);
                  int shareSkillId = getSkillId(shareHeroId, position, curLv, index);
                  int actualSkillId = normalSkillId;
                  if (isPalaceHero && shareSkillId > 0) {
                     if (normalSkillId < 0) {
                        actualSkillId = normalSkillId;
                     } else {
                        actualSkillId = shareSkillId;
                     }
                  }

                  if (actualSkillId < 0) {
                     int palaceTalentSkillId = getPalaceTalentSkill(gamePlayer, Math.abs(actualSkillId), key, index, curLv, heroModel);
                     if (palaceTalentSkillId > 0) {
                        tempSkill.add(palaceTalentSkillId);
                     }
                  } else {
                     tempSkill.add(actualSkillId);
                  }
               }
            }
         }
      }

      return tempSkill;
   }

   public static int getSkillId(int heroId, int position, int curLv, int index) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      Map<Integer, TalentSkillModel> modelMap = (Map)gameModelPool.getEntity("customTalentSkill", heroId);
      if (modelMap != null && !modelMap.isEmpty()) {
         TalentSkillModel talentSkillModel = (TalentSkillModel)modelMap.get(curLv);
         if (talentSkillModel != null) {
            int key = position - 19;
            if (talentSkillModel.getSkills().containsKey(key)) {
               ValListFun valListFun = (ValListFun)talentSkillModel.getSkills().get(key);
               if (valListFun != null) {
                  switch (index) {
                     case 0:
                        return valListFun.getV0();
                     case 1:
                        return valListFun.getV1();
                     case 2:
                        return valListFun.getV2();
                  }
               }
            }
         }

         return 0;
      } else {
         return 0;
      }
   }

   public static int getPalaceTalentSkill(GamePlayer gamePlayer, int palaceSkillIndex, int positionKey, int talentIndex, int talentLv, HeroModel heroModel) {
      if (talentLv <= 0) {
         return 0;
      } else {
         HeroPalaceDao heroPalaceDao = (HeroPalaceDao)gamePlayer.getData("tb_hero_palace", gamePlayer.getPlayerId());
         if (!heroPalaceDao.skills.containsKey(palaceSkillIndex)) {
            logger.error("玩家={}，配置表技能位置={}，君主府武将技能位置={}", new Object[]{gamePlayer.getPlayerId(), palaceSkillIndex, heroPalaceDao.skills.keySet()});
            return 0;
         } else {
            int lvIndex = talentLv - 1;
            int palaceSkill = (Integer)heroPalaceDao.skills.get(palaceSkillIndex);
            String skillStr = "";
            if (heroPalaceDao.heroSkillDir.contains(palaceSkill)) {
               LeaderPalaceSkillConsumeModel model = (LeaderPalaceSkillConsumeModel)gamePlayer.getGameModelPool().getEntity("leaderPalaceSkillConsume", palaceSkill);
               if (model != null && model.getTalentSkills().size() > talentIndex) {
                  skillStr = (String)model.getTalentSkills().get(talentIndex);
               }
            } else if (heroPalaceDao.kingSkillDir.contains(palaceSkill)) {
               LeaderTacticsSkillModel model = (LeaderTacticsSkillModel)gamePlayer.getGameModelPool().getEntity("leaderTacticsSkill", palaceSkill);
               if (model != null && model.getTalentSkill().size() > talentIndex) {
                  String strIndexSkill = (String)model.getTalentSkill().get(talentIndex);
                  String[] typeSkillArr = strIndexSkill.split("\\|");
                  if (typeSkillArr.length != 4 || heroModel.getType() > typeSkillArr.length) {
                     logger.error("天赋配置错误={} talentIndex:{}", strIndexSkill, talentIndex);
                     return 0;
                  }

                  skillStr = typeSkillArr[heroModel.getType() - 1];
               }
            }

            if (!org.springframework.util.StringUtils.isEmpty(skillStr)) {
               String[] talentSkills = skillStr.split(",");
               if (talentSkills.length == 5 && lvIndex < talentSkills.length) {
                  return Integer.parseInt(talentSkills[lvIndex]);
               } else {
                  logger.error("天赋配置错误={} lvIndex:{}", skillStr, lvIndex);
                  return 0;
               }
            } else {
               logger.info("天赋技能配置错误");
               return 0;
            }
         }
      }
   }

   public static Long getTalentPower(Map<Integer, List> talentMap) {
      long totalPower = 0L;
      if (!talentMap.isEmpty()) {
         for(Map.Entry<Integer, List> entry : talentMap.entrySet()) {
            if (((List)entry.getValue()).size() > 1) {
               int position = (Integer)entry.getKey();
               int curLv = (Integer)((List)entry.getValue()).get(0);
               if (curLv > 0) {
                  for(int i = 1; i <= curLv; ++i) {
                     UpgradeModel upgradeModel = (UpgradeModel)ApplicationContextProvider.getModelPoolEntity("upgrade", i);
                     if (upgradeModel != null) {
                        int key = position - 19;
                        totalPower += (long)(Integer)upgradeModel.getTalentCombat().get(key);
                     }
                  }
               }
            }
         }
      }

      return totalPower;
   }

   public static List<PropertyModel> getWarFlagProperty(WarFlag warFlag) {
      List<PropertyModel> tempList = new ArrayList();
      if (warFlag == null) {
         return tempList;
      } else {
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         WarFlagModel warFlagModel = (WarFlagModel)gameModelPool.getEntity("countryWarFlag", warFlag.id);
         if (warFlagModel != null) {
            for(PropertyModel propertyModel : warFlagModel.getInitialProperty()) {
               PropertyModel.addLvProtities(tempList, propertyModel);
            }
         }

         int deltLv = warFlag.strongLv - 1;
         if (deltLv > 0) {
            for(PropertyModel propertyModel : warFlagModel.getInitialProperty()) {
               PropertyModel.addLvProtities(tempList, new PropertyModel(propertyModel.getType(), propertyModel.getWay(), (long)(warFlagModel.getLvupPropertyRise() * deltLv)));
            }
         }

         tempList.addAll(warFlag.strongProperties);
         return tempList;
      }
   }

   public static List<PropertyModel> getWarFlagPropertyOfBasic(WarFlag warFlag) {
      List<PropertyModel> tempList = new ArrayList();
      if (warFlag == null) {
         return tempList;
      } else {
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         WarFlagModel warFlagModel = (WarFlagModel)gameModelPool.getEntity("countryWarFlag", warFlag.id);
         Map<Integer, CountryWarFlagBasicModel> lvMap = (Map)gameModelPool.getEntity("customCountryWarFlagBasic", warFlagModel.getQuality());
         if (lvMap == null) {
            return tempList;
         } else {
            if (lvMap.containsKey(warFlag.strongLv)) {
               CountryWarFlagBasicModel countryWarFlagBasicModel = (CountryWarFlagBasicModel)lvMap.get(warFlag.strongLv);

               for(PropertyModel propertyModel : countryWarFlagBasicModel.getProperty()) {
                  PropertyModel.addLvProtities(tempList, new PropertyModel(propertyModel.getType(), propertyModel.getWay(), propertyModel.getValue()));
               }
            }

            return tempList;
         }
      }
   }

   public List<PropertyModel> getWarHorseProperty(WarHorse warHorse) {
      List<PropertyModel> resultList = new ArrayList();
      if (warHorse == null) {
         return resultList;
      } else {
         WarHorseBaseModel warHowrseBaseModel = (WarHorseBaseModel)ApplicationContextProvider.getModelPoolEntity("warHorseBase", warHorse.id);
         if (warHowrseBaseModel == null) {
            return resultList;
         } else {
            if (!warHorse.upSkills.isEmpty()) {
               for(Integer upSkillId : warHorse.upSkills) {
                  WarHorseSkillModel warHorseSkillModel = (WarHorseSkillModel)ApplicationContextProvider.getModelPoolEntity("warHorseSkill", upSkillId);
                  if (warHorseSkillModel != null) {
                     for(PropertyModel propertyModel : warHorseSkillModel.getProperty()) {
                        PropertyModel.addLvProtities(resultList, propertyModel);
                     }
                  }
               }
            }

            if (warHorse.isAwaken) {
               for(PropertyModel propertyModel : warHowrseBaseModel.getWakeBaseAtt()) {
                  PropertyModel.addLvProtities(resultList, propertyModel);
               }
            } else {
               for(PropertyModel propertyModel : warHowrseBaseModel.getBaseAtt()) {
                  PropertyModel.addLvProtities(resultList, propertyModel);
               }
            }

            WarHorseArtificeAttModel warHorseArtificeAttModel = (WarHorseArtificeAttModel)ApplicationContextProvider.getModelPoolEntity("warHorseArtificeAtt", warHowrseBaseModel.getRefineAttGroupId());
            if (warHorseArtificeAttModel == null) {
               return resultList;
            } else {
               double roate = (double)0.0F;
               WarHorseLevelModel levelModel = (WarHorseLevelModel)ApplicationContextProvider.getModelPoolEntity("warHorseLevel", warHorse.lv);
               if (levelModel != null && levelModel.getExp() != 0 && warHorse.exp != 0) {
                  roate = (double)((float)warHorse.exp * 1.0F / (float)levelModel.getExp());
               }

               double lv = (double)(warHorse.lv - 1) + roate;

               for(int i = 1; i <= HeroDefine.map.size(); ++i) {
                  double val = (double)0.0F;
                  double per = (double)0.0F;
                  if (warHorse.isAwaken) {
                     if (warHowrseBaseModel.getWakePerGradeAtt().size() >= i) {
                        val += (double)(Integer)warHowrseBaseModel.getWakePerGradeAtt().get(i - 1) * lv;
                     }
                  } else if (warHowrseBaseModel.getPerGradeAtt().size() >= i) {
                     val += (double)(Integer)warHowrseBaseModel.getPerGradeAtt().get(i - 1) * lv;
                  }

                  List<PropertyModel> typeList = getProperty(warHorseArtificeAttModel.getProperty(), i);
                  if (!typeList.isEmpty()) {
                     for(PropertyModel propertyModel : typeList) {
                        if (propertyModel.getWay() == 0) {
                           val += (double)((float)propertyModel.getValue() / 10000.0F * (float)warHorse.artificeVal * (float)(warHorse.lv - 1));
                        } else {
                           per = (double)((float)propertyModel.getValue() / 10000.0F * (float)warHorse.artificeVal * (float)(warHorse.lv - 1));
                        }
                     }
                  }

                  if (val != (double)0.0F) {
                     PropertyModel propertyModel = new PropertyModel(i, 0, (long)((int)val));
                     PropertyModel.addLvProtities(resultList, propertyModel);
                  }

                  if (per != (double)0.0F) {
                     PropertyModel propertyModel = new PropertyModel(i, 1, (long)((int)per));
                     PropertyModel.addLvProtities(resultList, propertyModel);
                  }
               }

               return resultList;
            }
         }
      }
   }

   public static List<PropertyModel> getProperty(List<PropertyModel> resourceList, int type) {
      List<PropertyModel> list = new ArrayList();

      for(PropertyModel propertyModel : resourceList) {
         if (propertyModel.getType() == type) {
            list.add(propertyModel);
         }
      }

      return list;
   }

   public static List<PropertyModel> calModelProperty(List<PropertyModel> resourceList) {
      List<PropertyModel> newList = new ArrayList();
      if (resourceList != null && !resourceList.isEmpty()) {
         Map<Integer, Long> valMap = new HashMap();
         Map<Integer, Long> perMap = new HashMap();

         for(PropertyModel propertyModel : resourceList) {
            switch (propertyModel.getType()) {
               case 1:
               case 2:
               case 3:
               case 4:
                  if (propertyModel.getWay() == 0) {
                     long oldVal = (Long)MapUtil.getOrDefault(valMap, propertyModel.getType(), 0L);
                     valMap.put(propertyModel.getType(), oldVal + propertyModel.getValue());
                  } else if (propertyModel.getWay() == 1) {
                     long oldVal = (Long)MapUtil.getOrDefault(perMap, propertyModel.getType(), 0L);
                     perMap.put(propertyModel.getType(), oldVal + propertyModel.getValue());
                  }
                  break;
               default:
                  long oldVal = (Long)MapUtil.getOrDefault(valMap, propertyModel.getType(), 0L);
                  valMap.put(propertyModel.getType(), oldVal + propertyModel.getValue());
            }
         }

         for(Map.Entry<Integer, Long> entry : valMap.entrySet()) {
            long val = (Long)entry.getValue();
            if (perMap.containsKey(entry.getKey())) {
               double tempVal = (double)((float)val * (1.0F + (float)(Long)perMap.get(entry.getKey()) / 10000.0F));
               val = Double.valueOf(tempVal).longValue();
            }

            newList.add(new PropertyModel((Integer)entry.getKey(), 0, val));
         }

         return newList;
      } else {
         return newList;
      }
   }

   public static double calPowerByType(int type, long val) {
      double tempPower = (double)0.0F;
      UpgradeModel upgradeModel = (UpgradeModel)ApplicationContextProvider.getModelPoolEntity("upgrade", type);
      if (upgradeModel != null) {
         double propertyToPowerRatio = Double.parseDouble(upgradeModel.getPropertyAddCombat());
         tempPower += propertyToPowerRatio * (double)val;
      }

      return tempPower;
   }

   private long calBasePropertyPower(Map<Integer, Long> baseProperties) {
      long tempCombatPower = 0L;

      for(Map.Entry<Integer, Long> entry : baseProperties.entrySet()) {
         int key = (Integer)entry.getKey();
         UpgradeModel upgradeModel = (UpgradeModel)ApplicationContextProvider.getModelPoolEntity("upgrade", key);
         double propertyToPowerRatio = Double.parseDouble(upgradeModel.getPropertyAddCombat());
         tempCombatPower += Double.valueOf((double)(Long)entry.getValue() * propertyToPowerRatio).longValue();
      }

      return tempCombatPower;
   }

   public int getLv() {
      if (this.type == HeroDefine.HERO_SP_TYPE_LINK && this.linkCode > 0) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer player = worldMgr.getPlayerById(this.playerId);
         HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
         HeroDao linkHeroDao = heroBagPart.getHeroByCode(this.linkCode);
         if (linkHeroDao != null) {
            return linkHeroDao.getLv();
         }
      }

      return this.lv;
   }

   public int getLvWithPromote() {
      int promoteLv = this.getPromoteLv();
      return this.getLv() + promoteLv;
   }

   public int getPromoteLv() {
      if (!this.isRobot && this.getStateList().size() != 0) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer player = worldMgr.getPlayerById(this.playerId);
         HeroPromoteDao heroPromoteDao = (HeroPromoteDao)player.getData("tb_hero_promote", this.playerId);
         return heroPromoteDao.level;
      } else {
         return 0;
      }
   }

   public void doFlushTotalPropertiesForDragonWar(List<PropertyModel> addList) {
      this.nextFlushTime = System.currentTimeMillis() + 10000L;
      this.flushHeroDress();
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);
      if (heroModel != null) {
         if (heroModel.getStar() > this.getStar()) {
            logger.info("玩家={}，英雄ID={},英雄={}，code={}，星级调整，从{}到{}", new Object[]{this.playerId, this.id, heroModel.getName(), this.code, this.getStar(), heroModel.getStar()});
            this.setStar(heroModel.getStar());
            this.updateOp();
         }

         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer gamePlayer = worldMgr.getPlayerById(this.playerId);
         if (gamePlayer.isRobot()) {
            this.isRobot = true;
         }

         this.baseProperties = heroModel.getProperty();
         if (this.type == HeroDefine.HERO_SP_TYPE_PALACE) {
            if (this.palaceWatchHeroId > 0) {
               HeroModel palaceHeroModel = (HeroModel)gameModelPool.getEntity("hero", this.palaceWatchHeroId);
               this.baseProperties = palaceHeroModel.getProperty();
            } else {
               HeroPalacePart heroPalacePart = (HeroPalacePart)gamePlayer.getMgrPart(HeroPalacePart.class);
               HeroPalaceDao heroPalaceDao = heroPalacePart.getHeroPalaceDao();
               if (heroPalaceDao.shareCode > 0) {
                  Map<Integer, HeroDao> map = gamePlayer.<Integer, HeroDao>getMap("tb_hero_bag", gamePlayer.getPlayerId());
                  HeroDao shareHeroDao = (HeroDao)map.get(heroPalaceDao.shareCode);
                  if (shareHeroDao != null) {
                     HeroModel palaceHeroModel = (HeroModel)gameModelPool.getEntity("hero", shareHeroDao.id);
                     this.baseProperties = palaceHeroModel.getProperty();
                  }
               }
            }
         }

         this.totalFightProperties = this.baseProperties;
         this.totalShowProperties = this.baseProperties;
         this.combatPower = this.calBasePropertyPower(this.baseProperties);
         this.flushHeroLv();
         this.flushHeroBreach();
         this.flushHeroStar();
         this.flushHeroSkill(heroModel);
         if (!addList.isEmpty()) {
            this.property_skill_hero.addAll(addList);
         }

         this.calTotalScore();
         this.calTotalPorpertyForDragonWar();
      }
   }

   private void calTotalPorpertyForDragonWar() {
      HashMap<Integer, Long> tempTotalFightProperties = new HashMap();
      HashMap<Integer, Long> tempTotalShowProperties = new HashMap();
      long tempTotalCombatPower = this.calCombatPowerOfOtherModel();
      Map<Integer, Long> tempOrnamentProperties = new HashMap();
      double tempOrnamentPower = (double)0.0F;
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);

      for(Map.Entry<Integer, Long> entry : this.baseProperties.entrySet()) {
         int key = (Integer)entry.getKey();
         int add_heroBreach = (Integer)this.property_breach.getOrDefault(key, 0);
         int add_heroUpStar = (Integer)this.property_star.getOrDefault(key, 0);
         long[] add_skill_val = this.claHeroSkillProperty(key, 0);
         long[] add_skill_per = this.claHeroSkillProperty(key, 1);
         long[] add_other_val = this.calOtherPropertyForDragon(key, 0);
         long[] add_other_per = this.calOtherPropertyForDragon(key, 1);
         long[] add_ornament_val = new long[]{0L, 0L};
         long[] add_ornament_per = new long[]{0L, 0L};
         long[] add_ornament_skill_val = new long[]{0L, 0L};
         long[] add_ornament_skill_per = new long[]{0L, 0L};
         long[] add_no_addition_val = new long[]{0L, 0L};
         long[] add_have_power_val = this.calHavePowerAdditionPropertyForDragon(key, 0);
         long add_friend_val = 0L;
         if (this.property_friend != null) {
            for(PropertyModel propertyModel : this.property_friend) {
               if (propertyModel.getType() == key && propertyModel.getWay() == 0) {
                  add_friend_val += propertyModel.getValue();
               }
            }
         }

         if (this.property_king != null) {
            for(PropertyModel propertyModel : this.property_king) {
               if (propertyModel.getType() == key && propertyModel.getWay() == 0) {
                  add_friend_val += propertyModel.getValue();
               }
            }
         }

         long base = (Long)entry.getValue();
         int growAdd = 0;
         UpgradeModel upgradeModel = (UpgradeModel)gameModelPool.getEntity("upgrade", key);
         double propertyToPowerRatio = Double.parseDouble(upgradeModel.getPropertyAddCombat());
         long tempFightResult;
         long tempShowResult;
         long tempCombatPower;
         double ornamentPropertyBefore;
         double ornamentPowerBefore;
         double ornamentPropertyAfter;
         double ornamentPowerAfter;
         if ((Integer)entry.getKey() == 1) {
            growAdd = configManager.getInt("hpLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.getLvWithPromote()) * (1.0F + (float)add_heroBreach / 10000.0F) * (1.0F + (float)add_heroUpStar / 10000.0F) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 2) {
            growAdd = configManager.getInt("atkLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.getLvWithPromote()) * (1.0F + (float)add_heroBreach / 10000.0F) * (1.0F + (float)add_heroUpStar / 10000.0F) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 3) {
            growAdd = configManager.getInt("defLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.getLvWithPromote() + (float)add_heroBreach + (float)add_heroUpStar) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 4) {
            growAdd = configManager.getInt("spdLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.getLvWithPromote() + (float)add_heroBreach + (float)add_heroUpStar) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 21) {
            double tempResult = (double)(Long)entry.getValue();
            ornamentPowerBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 22) {
            double tempResult = (double)(Long)entry.getValue();
            ornamentPowerBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 6) {
            int baseCritiDamage = configManager.getIntDefault("baseCritiDamage", 12000);
            double tempResult = (double)((Long)entry.getValue() + (long)baseCritiDamage);
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0];
            ornamentPowerBefore = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            ornamentPropertyBefore = tempResult;
            ornamentPropertyAfter = tempResult + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            tempResult = tempResult + (double)add_ornament_skill_val[0] + (double)add_ornament_skill_per[0] + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            ornamentPowerAfter = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            long combatResult = tempPowerResult - (Long)heroModel.getProperty().get(key) - (long)baseCritiDamage;
            tempPowerResult += add_have_power_val[0];
            if (combatResult < 0L) {
               combatResult = 0L;
            }

            tempCombatPower = Double.valueOf((double)combatResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 8) {
            double tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0];
            ornamentPowerBefore = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            ornamentPropertyBefore = tempResult;
            ornamentPropertyAfter = tempResult + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            tempResult = tempResult + (double)add_ornament_skill_val[0] + (double)add_ornament_skill_per[0] + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            ornamentPowerAfter = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            long combatResult = tempPowerResult - (Long)heroModel.getProperty().get(key);
            tempPowerResult += add_have_power_val[0];
            if (combatResult < 0L) {
               combatResult = 0L;
            }

            tempCombatPower = Double.valueOf((double)combatResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() != 11 && (Integer)entry.getKey() != 14 && (Integer)entry.getKey() != 15 && (Integer)entry.getKey() != 23) {
            double tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0];
            ornamentPowerBefore = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            ornamentPropertyBefore = tempResult;
            ornamentPropertyAfter = tempResult + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            tempResult = tempResult + (double)add_ornament_skill_val[0] + (double)add_ornament_skill_per[0] + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            ornamentPowerAfter = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else {
            tempShowResult = (Long)entry.getValue() + add_other_val[0] + add_other_per[0] + add_skill_per[0] + add_skill_val[0];
            tempFightResult = Double.valueOf((double)((1.0F - (float)(Long)entry.getValue() / 10000.0F) * (1.0F - (float)add_other_val[1] / 10000.0F) * (1.0F - (float)add_other_per[1] / 10000.0F) * (1.0F - (float)add_skill_per[1] / 10000.0F) * (1.0F - (float)add_skill_val[1] / 10000.0F) * (1.0F - (float)add_ornament_val[1] / 10000.0F) * (1.0F - (float)add_ornament_per[1] / 10000.0F) * (1.0F - (float)add_ornament_skill_val[1] / 10000.0F) * (1.0F - (float)add_ornament_skill_per[1] / 10000.0F) * 10000.0F)).longValue();
            ornamentPowerBefore = (double)tempShowResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            ornamentPropertyBefore = (double)tempShowResult;
            tempShowResult = tempShowResult + add_ornament_val[0] + add_ornament_per[0];
            ornamentPropertyAfter = (double)tempShowResult;
            tempShowResult = tempShowResult + add_ornament_skill_val[0] + add_ornament_skill_per[0];
            ornamentPowerAfter = (double)tempShowResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            tempShowResult += add_have_power_val[0];
            tempFightResult = Double.valueOf((double)((float)tempFightResult * (1.0F - (float)add_have_power_val[1] / 10000.0F))).longValue();
            tempCombatPower = Double.valueOf((double)tempShowResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F).longValue();
            tempShowResult += add_no_addition_val[0];
            tempFightResult = Double.valueOf((double)((float)tempFightResult * (1.0F - (float)add_no_addition_val[1] / 10000.0F))).longValue();
         }

         tempTotalCombatPower += tempCombatPower;
         tempTotalFightProperties.put(key, tempFightResult);
         tempTotalShowProperties.put(key, tempShowResult);
         tempOrnamentPower += (double)Double.valueOf(ornamentPowerAfter - ornamentPowerBefore).longValue();
         tempOrnamentProperties.put(key, Double.valueOf(ornamentPropertyAfter - ornamentPropertyBefore).longValue());
      }

      this.ornamentProperties = tempOrnamentProperties;
      this.ornament_power = Double.valueOf(tempOrnamentPower).longValue();
      this.totalFightProperties = tempTotalFightProperties;
      this.totalShowProperties = tempTotalShowProperties;
      tempTotalCombatPower += (long)this.castPower;
      tempTotalCombatPower += this.talent_power;
      tempTotalCombatPower += this.pwoer_herose;
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer player = worldMgr.getPlayerById(this.playerId);
      HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
      this.combatPower = tempTotalCombatPower;
   }

   private long[] calOtherPropertyForDragon(int key, int way) {
      long[] total = new long[]{0L, 0L};
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer player = worldMgr.getPlayerById(this.playerId);
      HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);

      for(PropertyModel propertyModel : mergePropertys(this.property_hero_dress)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_hero_dress_all_base())) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_hero_dress_collect())) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      return total;
   }

   private long[] calHavePowerAdditionPropertyForDragon(int key, int way) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer player = worldMgr.getPlayerById(this.playerId);
      HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
      long[] total = new long[]{0L, 0L};

      for(PropertyModel propertyModel : mergePropertys(heroBagPart.getProperty_hero_dress_all())) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue() * (long)this.getLvWithPromote();
            total[1] = addProperty(total[1], propertyModel.getValue() * (long)this.getLvWithPromote(), key);
         }
      }

      return total;
   }

   public void setLv(int lv) {
      this.lv = lv;
   }

   public int getStar() {
      if (this.type == HeroDefine.HERO_SP_TYPE_LINK && this.linkCode > 0) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer player = worldMgr.getPlayerById(this.playerId);
         HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
         HeroDao linkHeroDao = heroBagPart.getHeroByCode(this.linkCode);
         if (linkHeroDao != null) {
            return linkHeroDao.getStar();
         }
      }

      return this.star;
   }

   public void setStar(int star) {
      this.star = star;
   }

   public int getBreachLv() {
      if (this.type == HeroDefine.HERO_SP_TYPE_LINK) {
         if (this.linkCode <= 0) {
            return 0;
         } else {
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            GamePlayer player = worldMgr.getPlayerById(this.playerId);
            HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
            HeroDao linkHeroDao = heroBagPart.getHeroByCode(this.linkCode);
            return null == linkHeroDao ? 0 : linkHeroDao.getBreachLv();
         }
      } else {
         return this.breachLv;
      }
   }

   public void setBreachLv(int breachLv) {
      this.breachLv = breachLv;
   }

   public int getStarMapTotalLv() {
      return this.starMapTotalLv;
   }

   public void setStarMapTotalLv(int starMapTotalLv) {
      this.starMapTotalLv = starMapTotalLv;
   }

   public Map<Integer, Long> convertAdditionToMap(List<PropertyModel> properties) {
      Map<Integer, Long> propertyMap = null;
      if (properties != null) {
         propertyMap = new HashMap();

         for(PropertyModel propertyModel : properties) {
            if (propertyModel.getWay() == 0) {
               propertyMap.put(propertyModel.getType(), propertyModel.getValue());
            }
         }
      }

      return propertyMap;
   }

   public void doFlushTotalPropertiesForDecisiveBattle(int code) {
      this.change_all = true;
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);
      if (heroModel != null) {
         if (heroModel.getStar() > this.getStar()) {
            logger.info("玩家={}，英雄ID={},英雄={}，code={}，星级调整，从{}到{}", new Object[]{this.playerId, this.id, heroModel.getName(), code, this.getStar(), heroModel.getStar()});
            this.setStar(heroModel.getStar());
         }

         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer gamePlayer = worldMgr.getPlayerById(this.playerId);
         if (gamePlayer.isRobot()) {
            this.isRobot = true;
         }

         this.baseProperties = heroModel.getProperty();
         this.totalFightProperties = this.baseProperties;
         this.totalShowProperties = this.baseProperties;
         this.combatPower = this.calBasePropertyPower(this.baseProperties);
         this.flushHeroLv();
         this.dressHeroId = 0;
         this.flushHeroBreach();
         this.flushWarcraft();
         this.flushWarriorSignet();
         this.flushHeroStar();
         this.flushTalent(gamePlayer, heroModel);
         List<Integer> resultList = new ArrayList();
         TreeMap<Integer, Integer> tempMap = new TreeMap();

         for(int i = 0; i < this.heroStarSkills.size(); ++i) {
            Integer skillId = (Integer)this.heroStarSkills.get(i);
            tempMap.put(i, skillId);
         }

         for(Map.Entry<Integer, Integer> entry : tempMap.entrySet()) {
            if ((Integer)entry.getValue() > 0) {
               if ((Integer)entry.getKey() == 0) {
                  resultList.add(entry.getValue());
               } else {
                  int oldSkillId = (Integer)entry.getValue();
                  resultList.add(oldSkillId);
               }
            }
         }

         this.heroCastSoulSkills = resultList;
         List<Integer> allHeroSkills = new ArrayList();
         allHeroSkills.addAll(this.heroCastSoulSkills);
         allHeroSkills.addAll(this.skill_talent);
         List<Integer> allEffects = getEffectsOfAddProperty(allHeroSkills);
         this.property_skill_hero = getPropertyOfSkillEffect(allEffects, this.getLvWithPromote());
         this.flushOtherSkillForDecisive();
         DecisiveBattlePart decisiveBattlePart = (DecisiveBattlePart)gamePlayer.getMgrPart(DecisiveBattlePart.class);
         this.property_friend = decisiveBattlePart.getProperty_friend(heroModel.getNation(), heroModel.getType(), code);
         this.flushOrnament();
         this.calTotalScore();
         this.calTotalPorpertyForDecisiveBattle();
      }
   }

   public void flushOtherSkillForDecisive() {
      List<Integer> allEffects = new ArrayList();
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      MonsterManager monsterManager = (MonsterManager)ApplicationContextProvider.getContext().getBean(MonsterManager.class);
      Set<Integer> allSkills = new HashSet();
      allSkills.addAll(this.skill_warcraft);
      allSkills.addAll(this.skill_warriorignet);

      for(Integer skillId : monsterManager.getSkillOfRemoveChild(allSkills)) {
         WarriorSignetSkillModel warriorSignetSkillModel = (WarriorSignetSkillModel)gameModelPool.getEntity("warriorSignetSkill", skillId);
         if (warriorSignetSkillModel != null) {
            for(Map.Entry<Integer, Integer> entry : warriorSignetSkillModel.getEffects().entrySet()) {
               allEffects.add(entry.getValue());
            }
         }
      }

      this.property_skill_other = getPropertyOfSkillEffect(allEffects, this.getLvWithPromote());
   }

   private void calTotalPorpertyForDecisiveBattle() {
      HashMap<Integer, Long> tempTotalFightProperties = new HashMap();
      HashMap<Integer, Long> tempTotalShowProperties = new HashMap();
      long tempTotalCombatPower = this.calCombatPowerOfOtherModel();
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);
      Map<Integer, Long> tempOrnamentProperties = new HashMap();
      double tempOrnamentPower = (double)0.0F;

      for(Map.Entry<Integer, Long> entry : this.baseProperties.entrySet()) {
         int key = (Integer)entry.getKey();
         int add_heroBreach = (Integer)this.property_breach.getOrDefault(key, 0);
         int add_heroUpStar = (Integer)this.property_star.getOrDefault(key, 0);
         long[] add_skill_val = this.claHeroSkillProperty(key, 0);
         long[] add_skill_per = this.claHeroSkillProperty(key, 1);
         long[] add_other_val = this.calOtherPropertyForDecisiveBattle(key, 0);
         long[] add_other_per = this.calOtherPropertyForDecisiveBattle(key, 1);
         long[] add_ornament_val = this.calListProperty(key, 0, this.property_ornament);
         long[] add_ornament_per = this.calListProperty(key, 1, this.property_ornament);
         long[] add_ornament_skill_val = this.calListProperty(key, 0, this.property_ornament_skill);
         long[] add_ornament_skill_per = this.calListProperty(key, 1, this.property_ornament_skill);
         long[] add_no_addition_val = new long[]{0L, 0L};
         long[] add_have_power_val = this.calHavePowerAdditionPropertyForDecisiveBattle(key, 0);
         long add_friend_val = 0L;
         if (this.property_friend != null) {
            for(PropertyModel propertyModel : this.property_friend) {
               if (propertyModel.getType() == key && propertyModel.getWay() == 0) {
                  add_friend_val += propertyModel.getValue();
               }
            }
         }

         long base = (Long)entry.getValue();
         int growAdd = 0;
         UpgradeModel upgradeModel = (UpgradeModel)gameModelPool.getEntity("upgrade", key);
         double propertyToPowerRatio = Double.parseDouble(upgradeModel.getPropertyAddCombat());
         long tempFightResult;
         long tempShowResult;
         long tempCombatPower;
         double ornamentPropertyBefore;
         double ornamentPowerBefore;
         double ornamentPropertyAfter;
         double ornamentPowerAfter;
         if ((Integer)entry.getKey() == 1) {
            growAdd = configManager.getInt("hpLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.getLvWithPromote()) * (1.0F + (float)add_heroBreach / 10000.0F) * (1.0F + (float)add_heroUpStar / 10000.0F) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 2) {
            growAdd = configManager.getInt("atkLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.getLvWithPromote()) * (1.0F + (float)add_heroBreach / 10000.0F) * (1.0F + (float)add_heroUpStar / 10000.0F) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 3) {
            growAdd = configManager.getInt("defLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.getLvWithPromote() + (float)add_heroBreach + (float)add_heroUpStar) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 4) {
            growAdd = configManager.getInt("spdLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.getLvWithPromote() + (float)add_heroBreach + (float)add_heroUpStar) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 21) {
            double tempResult = (double)(Long)entry.getValue();
            ornamentPowerBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 22) {
            double tempResult = (double)(Long)entry.getValue();
            ornamentPowerBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 6) {
            int baseCritiDamage = configManager.getIntDefault("baseCritiDamage", 12000);
            double tempResult = (double)((Long)entry.getValue() + (long)baseCritiDamage);
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0];
            ornamentPowerBefore = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            ornamentPropertyBefore = tempResult;
            ornamentPropertyAfter = tempResult + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            tempResult = tempResult + (double)add_ornament_skill_val[0] + (double)add_ornament_skill_per[0] + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            ornamentPowerAfter = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            long combatResult = tempPowerResult - (Long)heroModel.getProperty().get(key) - (long)baseCritiDamage;
            tempPowerResult += add_have_power_val[0];
            if (combatResult < 0L) {
               combatResult = 0L;
            }

            tempCombatPower = Double.valueOf((double)combatResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 8) {
            double tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0];
            ornamentPowerBefore = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            ornamentPropertyBefore = tempResult;
            ornamentPropertyAfter = tempResult + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            tempResult = tempResult + (double)add_ornament_skill_val[0] + (double)add_ornament_skill_per[0] + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            ornamentPowerAfter = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            long combatResult = tempPowerResult - (Long)heroModel.getProperty().get(key);
            tempPowerResult += add_have_power_val[0];
            if (combatResult < 0L) {
               combatResult = 0L;
            }

            tempCombatPower = Double.valueOf((double)combatResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() != 11 && (Integer)entry.getKey() != 14 && (Integer)entry.getKey() != 15 && (Integer)entry.getKey() != 23) {
            double tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0];
            ornamentPowerBefore = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            ornamentPropertyBefore = tempResult;
            ornamentPropertyAfter = tempResult + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            tempResult = tempResult + (double)add_ornament_skill_val[0] + (double)add_ornament_skill_per[0] + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            ornamentPowerAfter = tempResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else {
            tempShowResult = (Long)entry.getValue() + add_other_val[0] + add_other_per[0] + add_skill_per[0] + add_skill_val[0];
            tempFightResult = Double.valueOf((double)((1.0F - (float)(Long)entry.getValue() / 10000.0F) * (1.0F - (float)add_other_val[1] / 10000.0F) * (1.0F - (float)add_other_per[1] / 10000.0F) * (1.0F - (float)add_skill_per[1] / 10000.0F) * (1.0F - (float)add_skill_val[1] / 10000.0F) * (1.0F - (float)add_ornament_val[1] / 10000.0F) * (1.0F - (float)add_ornament_per[1] / 10000.0F) * (1.0F - (float)add_ornament_skill_val[1] / 10000.0F) * (1.0F - (float)add_ornament_skill_per[1] / 10000.0F) * 10000.0F)).longValue();
            ornamentPowerBefore = (double)tempShowResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            ornamentPropertyBefore = (double)tempShowResult;
            tempShowResult = tempShowResult + add_ornament_val[0] + add_ornament_per[0];
            ornamentPropertyAfter = (double)tempShowResult;
            tempShowResult = tempShowResult + add_ornament_skill_val[0] + add_ornament_skill_per[0];
            ornamentPowerAfter = (double)tempShowResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F;
            tempShowResult += add_have_power_val[0];
            tempFightResult = Double.valueOf((double)((float)tempFightResult * (1.0F - (float)add_have_power_val[1] / 10000.0F))).longValue();
            tempCombatPower = Double.valueOf((double)tempShowResult * propertyToPowerRatio * (double)this.getLvWithPromote() / (double)10.0F).longValue();
            tempShowResult += add_no_addition_val[0];
            tempFightResult = Double.valueOf((double)((float)tempFightResult * (1.0F - (float)add_no_addition_val[1] / 10000.0F))).longValue();
         }

         tempTotalCombatPower += tempCombatPower;
         tempTotalFightProperties.put(key, tempFightResult);
         tempTotalShowProperties.put(key, tempShowResult);
         tempOrnamentPower += (double)Double.valueOf(ornamentPowerAfter - ornamentPowerBefore).longValue();
         tempOrnamentProperties.put(key, Double.valueOf(ornamentPropertyAfter - ornamentPropertyBefore).longValue());
      }

      this.ornamentProperties = tempOrnamentProperties;
      this.ornament_power = Double.valueOf(tempOrnamentPower).longValue();
      this.totalFightProperties = tempTotalFightProperties;
      this.totalShowProperties = tempTotalShowProperties;
      tempTotalCombatPower += this.talent_power;
      this.combatPower = tempTotalCombatPower;
   }

   private long[] calHavePowerAdditionPropertyForDecisiveBattle(int key, int way) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer player = worldMgr.getPlayerById(this.playerId);
      DecisiveBattlePart decisiveBattlePart = (DecisiveBattlePart)player.getMgrPart(DecisiveBattlePart.class);
      long[] total = new long[]{0L, 0L};

      for(PropertyModel propertyModel : mergePropertys(decisiveBattlePart.getProperty_artifact_refine_add())) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      return total;
   }

   private long[] calOtherPropertyForDecisiveBattle(int key, int way) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer player = worldMgr.getPlayerById(this.playerId);
      DecisiveBattlePart decisiveBattlePart = (DecisiveBattlePart)player.getMgrPart(DecisiveBattlePart.class);
      long[] total = new long[]{0L, 0L};

      for(PropertyModel propertyModel : mergePropertys(decisiveBattlePart.getProperty_artifact_strong())) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(decisiveBattlePart.getProperty_artifact_refine())) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_warriorignet)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : mergePropertys(this.property_skill_other)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      return total;
   }

   public CommonMsg.HeroInfo.Builder toHeroInfoForDecisive() {
      CommonMsg.HeroInfo.Builder heroBuilder = CommonMsg.HeroInfo.newBuilder();
      heroBuilder.setCode(this.code);
      heroBuilder.setId(this.id);
      heroBuilder.setLv(this.getLvWithPromote());
      heroBuilder.setExp(this.exp);
      heroBuilder.setQuality(this.quality);
      heroBuilder.setStar(this.getStar());
      heroBuilder.setBreachLv(this.getBreachLv());
      heroBuilder.setCombatPower(this.combatPower);
      heroBuilder.addAllState(this.getStateList());
      heroBuilder.setAide(this.aide);
      heroBuilder.setAide2(this.aide2);
      heroBuilder.setAideTrammelsId(this.aideTrammelsId);
      heroBuilder.setLock(this.lock);
      heroBuilder.setPromoteLv(this.getPromoteLv());
      heroBuilder.addAllActiveDressId(this.getActiveDressIds());
      heroBuilder.addAllDestinySkills(this.destinySkills);
      heroBuilder.setPalaceTitle(this.palaceTitle);
      heroBuilder.setShareHeroId(this.shareHeroId);

      for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
         Long property = (Long)this.totalShowProperties.get(i);
         if (property != null) {
            heroBuilder.addProperties(property.intValue());
         } else {
            heroBuilder.addProperties(0);
         }
      }

      for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
         if (this.totalFightProperties.get(i) != null) {
            heroBuilder.addFightProperties(((Long)this.totalShowProperties.get(i)).intValue());
         } else {
            heroBuilder.addFightProperties(0);
         }
      }

      heroBuilder.addAllUnlockHeroSkills(this.heroCastSoulSkills);

      for(Map.Entry<Integer, WarriorSignet> entry : this.warriors.entrySet()) {
         CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
         CommonMsg.HeroWarriorSignetInfo.Builder warriorSignetBuilder = CommonMsg.HeroWarriorSignetInfo.newBuilder();
         warriorSignetBuilder.setPosition(position);
         warriorSignetBuilder.setId(((WarriorSignet)entry.getValue()).id);
         warriorSignetBuilder.setScore(((WarriorSignet)entry.getValue()).score);

         for(Integer skillId : ((WarriorSignet)entry.getValue()).skills) {
            warriorSignetBuilder.addSkills(skillId);
         }

         for(PropertyModel property : ((WarriorSignet)entry.getValue()).properties) {
            warriorSignetBuilder.addProperty(property.builder());
         }

         for(PropertyModel recastPro : ((WarriorSignet)entry.getValue()).recastPros) {
            warriorSignetBuilder.addRecastPros(recastPro.builder());
         }

         for(Integer recastSkill : ((WarriorSignet)entry.getValue()).recastSkills) {
            warriorSignetBuilder.addRecastSkills(recastSkill);
         }

         WarriorSignetDefine.addExclusiveAttrAndSkill(((WarriorSignet)entry.getValue()).id, warriorSignetBuilder);
         heroBuilder.addWarriorSignets(warriorSignetBuilder);
      }

      for(Map.Entry<Integer, List> entry : this.talent.entrySet()) {
         CommonMsg.TalentInfo.Builder infoBuilder = CommonMsg.TalentInfo.newBuilder();
         infoBuilder.setPosition(CommonMsg.WearPosition.forNumber((Integer)entry.getKey()));
         infoBuilder.setLv((Integer)((List)entry.getValue()).get(0));
         if (((List)entry.getValue()).size() > 1) {
            infoBuilder.setIndex((Integer)((List)entry.getValue()).get(1));
         } else {
            infoBuilder.setIndex(-1);
         }

         heroBuilder.addTalentInfos(infoBuilder.build());
      }

      for(Map.Entry<Integer, Integer> entry : this.warcrafts.entrySet()) {
         CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
         CommonMsg.HeroWarcraftInfo.Builder warcraftBuilder = CommonMsg.HeroWarcraftInfo.newBuilder();
         warcraftBuilder.setPosition(position);
         warcraftBuilder.setId((Integer)entry.getValue());
         heroBuilder.addWarcraft(warcraftBuilder);
      }

      heroBuilder.setOrnament(this.packOrnamentInfo());
      heroBuilder.setInheritNation(this.inheritNation);
      return heroBuilder;
   }
}
