package com.gzbz.battleTest;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.google.common.base.Splitter;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.gameDefine.WarriorSignetDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.model.ArtifactModel;
import com.gzbz.model.ArtifactSkillModel;
import com.gzbz.model.BattleModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.MagicBookModel;
import com.gzbz.model.MagicSkillModel;
import com.gzbz.model.StampSetModel;
import com.gzbz.model.TalentSkillModel;
import com.gzbz.model.TongQueSkillModel;
import com.gzbz.model.TongqueTerraceModel;
import com.gzbz.model.TotemBreachModel;
import com.gzbz.model.WarHorseBaseModel;
import com.gzbz.model.WarriorSignetSkillModel;
import com.gzbz.model.fun.BattleMonsterFun;
import com.gzbz.model.fun.ValListFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.udp.DBNettyClient;
import debug.Debug;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.PreDestroy;
import misc.MapUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@MgrAnno
public class BattleTestMgr extends GameMgr {
   static HashMap<Byte, String> typeName = new HashMap();
   @Value("${ServerId}")
   public int GAME_SERVER_ID;
   @Autowired
   private DBNettyClient dbClient;
   static String[] NATION_NAME;
   static AtomicLong testTimes;
   static ConcurrentHashMap<Integer, Record> heroMudWin;
   static ConcurrentHashMap<Integer, RecordNationData> nationMudRecord;
   static ConcurrentHashMap<Integer, Record> heroSingleRecord;
   static ConcurrentHashMap<Integer, RecordSingleNationData> nationSingleWin;
   public BattleScene testSceneWave;
   public int next = 1;
   public static ArrayList<Integer> ALL_HEROS;
   public static ArrayList<Integer> BATTLE_POS_INDEX;
   private List<List<WarriorSignetSkillModel>> warriorSignetTypeSkillModel;
   private static HashMap<Integer, ArrayList<HeroModel>> NATION_MAP;
   private List<ArtifactModel> artifactModels;
   private List<ArtifactSkillModel> artifactSkillModels;
   private List<TongqueTerraceModel> tongqueTerraceModels;
   private Map<Integer, List<TongQueSkillModel>> tongQueSkillModelsMap;
   private List<Integer> magicBookIds;
   private List<Integer> magicSkillIds;
   private List<WarHorseBaseModel> allWarHorse = new ArrayList();
   private ItemModel itemModel_warriorSignet;
   private List<List<Integer>> totemModel;
   public static int LAST_POS;
   public static int HERO_MAX;
   public static long times;
   static Logger logger;
   static ConcurrentHashMap<Byte, ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, RecordData>>> recordMap;
   static ConcurrentHashMap<Integer, AtomicLong> missMap;
   static ConcurrentHashMap<Integer, AtomicLong> beMissMap;
   static ConcurrentHashMap<Integer, AtomicLong> absorbMap;
   static ConcurrentHashMap<Integer, AtomicLong> updateBuffMap;
   static ConcurrentHashMap<Integer, AtomicLong> addBuffMap;
   static ConcurrentHashMap<Integer, AtomicLong> damageMap;
   static ConcurrentHashMap<Integer, AtomicLong> reviveMap;
   static ConcurrentHashMap<Integer, AtomicLong> recoverHp;
   private ScheduledFuture future;

   public static void readyData(String path) {
      try {
         File file = new File(path);
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);

         String lineStr;
         while((lineStr = br.readLine()) != null) {
            ALL_HEROS.add(Integer.parseInt(lineStr));
         }

         for(int heroId : ALL_HEROS) {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPool().getEntity("hero", heroId);
            if (null != heroModel) {
               ArrayList<HeroModel> heroModels = (ArrayList)MapUtil.computeIfAbsent(NATION_MAP, heroModel.getNation(), ArrayList.class);
               heroModels.add(heroModel);
            }
         }

         for(int i = 0; i < BattleMisc.FORCE_BATTLE_POS_MAX; ++i) {
            BATTLE_POS_INDEX.add(0);
         }

         LAST_POS = BattleMisc.FORCE_BATTLE_POS_MAX - 1;
         BATTLE_POS_INDEX.set(BATTLE_POS_INDEX.size() - 1, -1);
         HERO_MAX = ALL_HEROS.size();
         br.close();
         fr.close();
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public static boolean carry(int index) {
      int num = (Integer)BATTLE_POS_INDEX.get(index);
      if (num >= HERO_MAX) {
         BATTLE_POS_INDEX.set(index, 0);
         int carryIndex = index - 1;
         if (carryIndex < 0) {
            return false;
         } else {
            BATTLE_POS_INDEX.set(carryIndex, (Integer)BATTLE_POS_INDEX.get(carryIndex) + 1);
            return carry(carryIndex);
         }
      } else {
         return true;
      }
   }

   private BattleModel parseTeam(String team, int maxLv) {
      Map<String, String> teamMap = Splitter.on(",").withKeyValueSeparator(":").split(team);
      BattleModel battleModel = new BattleModel();

      for(Map.Entry<String, String> monster : teamMap.entrySet()) {
         BattleMonsterFun fun = new BattleMonsterFun();
         fun.setPos(Byte.parseByte((String)monster.getKey()));
         fun.setId(Integer.parseInt((String)monster.getValue()));
         fun.setLv(maxLv);
         battleModel.getMonsters().add(fun);
      }

      return battleModel;
   }

   public static synchronized ArrayList<Integer> getBattlePos() {
      int num = (Integer)BATTLE_POS_INDEX.get(LAST_POS);
      ++num;
      BATTLE_POS_INDEX.set(LAST_POS, num);
      boolean result = carry(LAST_POS);
      if (!result) {
         BATTLE_POS_INDEX.clear();

         for(int i = 0; i < BattleMisc.FORCE_BATTLE_POS_MAX; ++i) {
            BATTLE_POS_INDEX.add(i);
         }
      }

      ArrayList<Integer> battleHeros = new ArrayList();

      for(int i = 0; i < BattleMisc.FORCE_BATTLE_POS_MAX; ++i) {
         battleHeros.add(ALL_HEROS.get((Integer)BATTLE_POS_INDEX.get(i)));
      }

      ++times;
      return battleHeros;
   }

   private BattleModel parseSingleTeam(HashSet<Integer> exHeroSet, HashSet<Integer> heroSet) {
      while(true) {
         int index = (int)(Math.random() * (double)ALL_HEROS.size());
         int hero = (Integer)ALL_HEROS.get(index);
         if (exHeroSet == null || !exHeroSet.contains(hero)) {
            heroSet.add(hero);
            if (heroSet.size() >= 1) {
               return this.getBattleModel(heroSet);
            }
         }
      }
   }

   private BattleModel parseNationTeam(int nation) {
      HashSet<Integer> heroSet = new HashSet();
      ArrayList<HeroModel> nationList = (ArrayList)NATION_MAP.get(nation);
      if (nationList.size() < 6) {
         logger.error("单阵营不足6个英雄");
         return null;
      } else {
         do {
            int index = (int)(Math.random() * (double)nationList.size());
            heroSet.add(((HeroModel)nationList.get(index)).getId());
         } while(heroSet.size() < 6);

         return this.getBattleModel(heroSet);
      }
   }

   private BattleModel parseRandomTeam() {
      HashSet<Integer> heroSet = new HashSet();

      do {
         int index = (int)(Math.random() * (double)ALL_HEROS.size());
         int hero = (Integer)ALL_HEROS.get(index);
         heroSet.add(hero);
      } while(heroSet.size() < 6);

      return this.getBattleModel(heroSet);
   }

   public BattleModel getBattleModel(HashSet<Integer> heroSet) {
      BattleModel battleModel = new BattleModel();
      byte pos = 0;

      for(int heroId : heroSet) {
         BattleMonsterFun fun = new BattleMonsterFun();
         fun.setPos(pos++);
         fun.setId(heroId);
         fun.setLv(340);

         for(int i = 0; i < 2; ++i) {
            WarriorSignet warriorSignet = new WarriorSignet();
            warriorSignet.init(0, 1, this.itemModel_warriorSignet, (GamePlayer)null);
            fun.getWarriorSignet().addAll(warriorSignet.skills);
            List<Integer> skillIdList = WarriorSignetDefine.getSkillIdList(warriorSignet.id);
            fun.getWarriorSignet().addAll(skillIdList);
         }

         for(int i = 0; i < 2; ++i) {
            List<WarriorSignetSkillModel> list = (List)this.warriorSignetTypeSkillModel.get(RandomUtil.randInt(this.warriorSignetTypeSkillModel.size()));
            WarriorSignetSkillModel model = (WarriorSignetSkillModel)list.get(RandomUtil.randInt(list.size()));
            fun.getWarcrafts().add(model.getId());
         }

         HashSet<Integer> totemSet = new HashSet();
         List<Integer> totemSkills = new ArrayList();

         for(int i = 0; i < 3; ++i) {
            int index = (int)(Math.random() * (double)this.totemModel.size());
            if (!totemSet.contains(index)) {
               totemSet.add(index);
               List<Integer> totems = (List)this.totemModel.get(index);
               totemSkills.add(totems.get((int)(Math.random() * (double)totems.size())));
            }
         }

         fun.setTotemSkills(totemSkills);
         Map<Integer, StampSetModel> allStampMaps = ApplicationContextProvider.<Integer, StampSetModel>getModelPoolMap("StampSet");
         int stampSkillId = (int)(Math.random() * (double)allStampMaps.size() + (double)1.0F);
         StampSetModel model = (StampSetModel)ApplicationContextProvider.getModelPoolEntity("StampSet", stampSkillId);
         if (model != null) {
            fun.getStampSkills().add(model.getSetSkillId().get(2));
            fun.getStampSkills().add(model.getSpSkillId().get(2));
         }

         int warHorseIndex = (int)(Math.random() * (double)this.allWarHorse.size());
         fun.setWarHorse((WarHorseBaseModel)this.allWarHorse.get(warHorseIndex));
         TreeMap<Integer, TalentSkillModel> levelTalentSkillModel = (TreeMap)ApplicationContextProvider.getModelPoolEntity("customTalentSkill", heroId);
         if (levelTalentSkillModel != null) {
            int level = (int)(Math.random() * (double)5.0F) + 1;
            TalentSkillModel levelModel = (TalentSkillModel)levelTalentSkillModel.get(level);

            for(ValListFun valListFun : levelModel.getSkills().values()) {
               int skillIndex = (int)(Math.random() * (double)3.0F);
               switch (skillIndex) {
                  case 0:
                     fun.getTalentSkills().add(valListFun.getV0());
                     break;
                  case 1:
                     fun.getTalentSkills().add(valListFun.getV1());
                     break;
                  case 2:
                     fun.getTalentSkills().add(valListFun.getV2());
               }
            }
         }

         battleModel.getMonsters().add(fun);
      }

      ArtifactModel artifactModel = (ArtifactModel)this.artifactModels.get(RandomUtil.randInt(this.artifactModels.size()));
      battleModel.setWeaponId(artifactModel.getId());
      ArtifactSkillModel artifactSkillModel = (ArtifactSkillModel)this.artifactSkillModels.get(RandomUtil.randInt(this.artifactSkillModels.size()));
      battleModel.setWeaponSkillLv(artifactSkillModel.getLevel());
      battleModel.setWeaponSkill((Integer)artifactSkillModel.getSkills().get(artifactModel.getSkillKey()));
      TongqueTerraceModel tongqueTerraceModel = (TongqueTerraceModel)this.tongqueTerraceModels.get(RandomUtil.randInt(this.tongqueTerraceModels.size()));
      battleModel.setBeautyId(tongqueTerraceModel.getId());
      List<TongQueSkillModel> beautySkillList = (List)this.tongQueSkillModelsMap.get(tongqueTerraceModel.getId());
      battleModel.setBeautySkills(((TongQueSkillModel)beautySkillList.get(RandomUtil.randInt(beautySkillList.size()))).getSkillId());
      battleModel.setDragonId((Integer)this.magicBookIds.get(RandomUtil.randInt(this.magicBookIds.size())));
      battleModel.getDragonSkills().add(0);
      battleModel.getDragonSkills().add(0);
      battleModel.getDragonSkills().add(0);
      battleModel.getDragonSkills().add(0);

      for(int i = 0; i < battleModel.getDragonSkills().size(); ++i) {
         int skillId = (Integer)this.magicSkillIds.get(RandomUtil.randInt(this.magicSkillIds.size()));
         if (!battleModel.getDragonSkills().contains(skillId)) {
            battleModel.getDragonSkills().set(i, skillId);
         }
      }

      return battleModel;
   }

   protected void init() throws Exception {
      this.itemModel_warriorSignet = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", 4060);
      Map<Integer, WarriorSignetSkillModel> warriorSignetMap = ApplicationContextProvider.<Integer, WarriorSignetSkillModel>getModelPoolMap("warriorSignetSkill");
      HashMap<Integer, List<WarriorSignetSkillModel>> typeSkillModelMap = new HashMap();

      for(Map.Entry<Integer, WarriorSignetSkillModel> entry : warriorSignetMap.entrySet()) {
         Integer k = (Integer)entry.getKey();
         WarriorSignetSkillModel v = (WarriorSignetSkillModel)entry.getValue();
         List<WarriorSignetSkillModel> typeSkillSet = (List)MapUtil.computeIfAbsent(typeSkillModelMap, v.getBaseSkill(), ArrayList.class);
         typeSkillSet.add(v);
      }

      this.warriorSignetTypeSkillModel = new ArrayList();
      this.warriorSignetTypeSkillModel.addAll(typeSkillModelMap.values());
      Map<Integer, TotemBreachModel> totemBreachModelMap = ApplicationContextProvider.<Integer, TotemBreachModel>getModelPoolMap("totemBreach");
      this.totemModel = new ArrayList();
      HashMap<Integer, List<Integer>> totemMap = new HashMap();

      for(TotemBreachModel model : totemBreachModelMap.values()) {
         List<Integer> totemList = (List)MapUtil.computeIfAbsent(totemMap, model.getTotemId(), ArrayList.class);
         totemList.add(model.getSkill());
      }

      this.totemModel.addAll(totemMap.values());
      Map<Integer, ArtifactModel> artifactModelMap = ApplicationContextProvider.<Integer, ArtifactModel>getModelPoolMap("artifact");
      this.artifactModels = new ArrayList();

      for(Map.Entry<Integer, ArtifactModel> entry : artifactModelMap.entrySet()) {
         this.artifactModels.add(entry.getValue());
      }

      Map<Integer, ArtifactSkillModel> artifactSkillModelMap = ApplicationContextProvider.<Integer, ArtifactSkillModel>getModelPoolMap("artifactSkill");
      this.artifactSkillModels = new ArrayList();

      for(Map.Entry<Integer, ArtifactSkillModel> entry : artifactSkillModelMap.entrySet()) {
         this.artifactSkillModels.add(entry.getValue());
      }

      Map<Integer, TongqueTerraceModel> tongqueTerraceModelMap = ApplicationContextProvider.<Integer, TongqueTerraceModel>getModelPoolMap("TongQueBase");
      this.tongqueTerraceModels = new ArrayList();

      for(Map.Entry<Integer, TongqueTerraceModel> entry : tongqueTerraceModelMap.entrySet()) {
         if (((TongqueTerraceModel)entry.getValue()).getState() == 1) {
            this.tongqueTerraceModels.add(entry.getValue());
         }
      }

      Map<Integer, TongQueSkillModel> tongQueSkillModelMap = ApplicationContextProvider.<Integer, TongQueSkillModel>getModelPoolMap("TongQueSkill");
      this.tongQueSkillModelsMap = new HashMap();

      for(Map.Entry<Integer, TongQueSkillModel> entry : tongQueSkillModelMap.entrySet()) {
         List<TongQueSkillModel> list = (List)MapUtil.computeIfAbsent(this.tongQueSkillModelsMap, ((TongQueSkillModel)entry.getValue()).getBeautyId(), ArrayList.class);
         list.add(entry.getValue());
      }

      Map<Integer, MagicBookModel> magicBookModelMap = ApplicationContextProvider.<Integer, MagicBookModel>getModelPoolMap("MysticBook");
      this.magicBookIds = new ArrayList(magicBookModelMap.keySet());
      Map<Integer, MagicSkillModel> magicSkillModelMap = ApplicationContextProvider.<Integer, MagicSkillModel>getModelPoolMap("MysticSkill");
      this.magicSkillIds = new ArrayList(magicSkillModelMap.keySet());
      Map<Integer, WarHorseBaseModel> warHorseMap = ApplicationContextProvider.<Integer, WarHorseBaseModel>getModelPoolMap("warHorseBase");
      this.allWarHorse.addAll(warHorseMap.values());
   }

   public void recordErr(BattleModel battleModel1, BattleModel battleModel2, Exception ex) {
      try {
         ex.printStackTrace();
         if (battleModel1 == null || battleModel2 == null) {
            return;
         }

         String errStr = battleModel1.toString() + "---" + battleModel2.toString();
         logger.error("对战错误{},{}!!!!", errStr);
         FileWriter fileWriter = new FileWriter("logFile.txt", true);
         PrintWriter printWriter = new PrintWriter(fileWriter);
         printWriter.append("对战错误:" + errStr);
         printWriter.append(ex.getMessage());
         ex.printStackTrace(printWriter);
         printWriter.flush();
         printWriter.close();
      } catch (Exception ex1) {
         ex1.printStackTrace();
      }

      ex.printStackTrace();
      this.future.cancel(true);
   }

   public void testNation() {
      BattleModel battleModel1 = null;
      BattleModel battleModel2 = null;

      try {
         int nation1 = (int)(Math.random() * (double)5.0F + (double)1.0F);
         battleModel1 = this.parseNationTeam(nation1);
         int nation2 = (int)(Math.random() * (double)5.0F + (double)1.0F);
         battleModel2 = this.parseNationTeam(nation2);
         BattleScene scene = this.doBattle(battleModel1, battleModel2);
         if (this.getWinForce(scene) == 0) {
            RecordNationData leftRecord = (RecordNationData)MapUtil.computeIfAbsent(nationMudRecord, nation1, RecordNationData.class);
            ((AtomicLong)MapUtil.computeIfAbsent(leftRecord.nationWin, nation2, AtomicLong.class)).incrementAndGet();
            RecordNationData rightRecord = (RecordNationData)MapUtil.computeIfAbsent(nationMudRecord, nation2, RecordNationData.class);
            ((AtomicLong)MapUtil.computeIfAbsent(rightRecord.nationFailed, nation1, AtomicLong.class)).incrementAndGet();
         } else {
            RecordNationData rightRecord = (RecordNationData)MapUtil.computeIfAbsent(nationMudRecord, nation2, RecordNationData.class);
            ((AtomicLong)MapUtil.computeIfAbsent(rightRecord.nationWin, nation1, AtomicLong.class)).incrementAndGet();
            RecordNationData leftRecord = (RecordNationData)MapUtil.computeIfAbsent(nationMudRecord, nation1, RecordNationData.class);
            ((AtomicLong)MapUtil.computeIfAbsent(leftRecord.nationFailed, nation2, AtomicLong.class)).incrementAndGet();
         }

         this.send2DB(scene.getBattleMsg());
      } catch (Exception ex) {
         this.recordErr(battleModel1, battleModel2, ex);
      }

   }

   private void send2DB(BattleMsg.S2C_BattleResult_6102.Builder battleResult) {
      int id = (int)(Math.random() * (double)Integer.MAX_VALUE);
      int time = battleResult.getStartTime();
      this.dbClient.sendBattleMsg(battleResult.build(), this.GAME_SERVER_ID, id, time);
   }

   private BattleScene doBattle(BattleModel battleModel1, BattleModel battleModel2) {
      long time = System.currentTimeMillis();
      BattlePKTeam left = new BattlePKTeam(battleModel1);
      left.setBelongName("1");
      BattlePKTeam right = new BattlePKTeam(battleModel2);
      right.setBelongName("2");
      BattleScene scene = new BattleScene(1040, 1);
      scene.addPKTeam(left, right);
      scene.fight((byte)20);
      return scene;
   }

   public void testSingleHero() {
      BattleModel battleModel1 = null;
      BattleModel battleModel2 = null;

      try {
         HashSet<Integer> single1 = new HashSet();
         HashSet<Integer> single2 = new HashSet();
         battleModel1 = this.parseSingleTeam((HashSet)null, single1);
         battleModel2 = this.parseSingleTeam(single1, single2);
         BattleScene scene = this.doBattle(battleModel1, battleModel2);

         for(BattleMonsterFun battleMonsterFun : battleModel1.getMonsters()) {
            Record record = (Record)MapUtil.computeIfAbsent(heroSingleRecord, battleMonsterFun.getId(), Record.class);
            record.heroId = battleMonsterFun.getId();
            if (this.getWinForce(scene) == 0) {
               record.win.incrementAndGet();
            } else {
               record.failed.incrementAndGet();
            }
         }

         for(BattleMonsterFun battleMonsterFun : battleModel2.getMonsters()) {
            Record record = (Record)MapUtil.computeIfAbsent(heroSingleRecord, battleMonsterFun.getId(), Record.class);
            record.heroId = battleMonsterFun.getId();
            if (this.getWinForce(scene) == 0) {
               record.failed.incrementAndGet();
            } else {
               record.win.incrementAndGet();
            }
         }

         this.send2DB(scene.getBattleMsg());
      } catch (Exception ex) {
         this.recordErr(battleModel1, battleModel2, ex);
      }

   }

   public BattleScene testRandom() {
      BattleModel battleModel1 = null;
      BattleModel battleModel2 = null;
      BattleScene scene = null;

      try {
         battleModel1 = this.parseRandomTeam();
         battleModel2 = this.parseRandomTeam();
         scene = this.doBattle(battleModel1, battleModel2);

         for(BattleMonsterFun battleMonsterFun : battleModel1.getMonsters()) {
            Record record = (Record)MapUtil.computeIfAbsent(heroMudWin, battleMonsterFun.getId(), Record.class);
            record.heroId = battleMonsterFun.getId();
            if (this.getWinForce(scene) == 0) {
               record.win.incrementAndGet();
            } else {
               record.failed.incrementAndGet();
            }
         }

         for(BattleMonsterFun battleMonsterFun : battleModel2.getMonsters()) {
            Record record = (Record)MapUtil.computeIfAbsent(heroMudWin, battleMonsterFun.getId(), Record.class);
            record.heroId = battleMonsterFun.getId();
            if (this.getWinForce(scene) == 0) {
               record.failed.incrementAndGet();
            } else {
               record.win.incrementAndGet();
            }
         }
      } catch (Exception ex) {
         this.recordErr(battleModel1, battleModel2, ex);
      }

      return scene;
   }

   public void testNext() {
      BattleModel battleModel1 = null;
      BattleModel battleModel2 = null;

      try {
         ++this.next;
         if (this.testSceneWave != null && this.next != 20) {
            battleModel1 = this.parseRandomTeam();
            BattlePKTeam left = new BattlePKTeam(battleModel1);
            if (this.testSceneWave.getWinForce() == 0) {
               this.testSceneWave.addPKTeam((byte)0, left);
            } else {
               this.testSceneWave.addPKTeam((byte)1, left);
            }

            this.testSceneWave.setWave((short)this.next);
            this.testSceneWave.fight((byte)20);
         } else {
            battleModel1 = this.parseRandomTeam();
            battleModel2 = this.parseRandomTeam();
            BattlePKTeam left = new BattlePKTeam(battleModel1);
            left.setBelongName("1");
            BattlePKTeam right = new BattlePKTeam(battleModel2);
            right.setBelongName("2");
            this.testSceneWave = new BattleScene(1260, 1);
            this.testSceneWave.setWave((short)this.next);
            this.testSceneWave.addPKTeam((byte)0, left);
            this.testSceneWave.addPKTeam((byte)1, right);
            this.testSceneWave.fight((byte)20);
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public void testSingleNation() {
      BattleModel battleModel1 = null;
      BattleModel battleModel2 = null;

      try {
         int nation = (int)(Math.random() * (double)5.0F + (double)1.0F);
         battleModel1 = this.parseNationTeam(nation);
         battleModel2 = this.parseRandomTeam();
         BattleScene scene = this.doBattle(battleModel1, battleModel2);
         RecordSingleNationData leftRecord = (RecordSingleNationData)MapUtil.computeIfAbsent(nationSingleWin, nation, RecordSingleNationData.class);
         if (this.getWinForce(scene) == 0) {
            leftRecord.nationWin.incrementAndGet();
         } else {
            leftRecord.nationFailed.incrementAndGet();
         }

         this.send2DB(scene.getBattleMsg());
      } catch (Exception ex) {
         this.recordErr(battleModel1, battleModel2, ex);
      }

   }

   @TaskMethod
   public void scheduleTask() {
      this.testRandom();
   }

   public void begin() {
      if (this.future == null) {
         this.future = this.scheduleEx(20000L, 1000L, "scheduleTask", new Object[0]);
      }
   }

   public static void analyseBuffEffect(byte type, int heroId, int effectId, long value) {
      if (Debug.isDebug) {
         ;
      }
   }

   public void analyseEffect(BattleScene battleScene, int skillEntityPos, BattleMsg.S2C_Battle_Effect effect) {
   }

   public static void printNationResult(BufferedWriter bw) throws Exception {
      for(Map.Entry<Integer, RecordNationData> entry : nationMudRecord.entrySet()) {
         bw.write(entry.getKey() + ":种族测试情况");
         RecordNationData recordNationData = (RecordNationData)entry.getValue();
         bw.newLine();

         for(Map.Entry<Integer, AtomicLong> winEntry : recordNationData.nationWin.entrySet()) {
            AtomicLong failedNum = (AtomicLong)recordNationData.nationFailed.get(winEntry.getKey());
            bw.write(String.format("种族(%s)对(%s)胜利场数%d,胜率为:%f", NATION_NAME[(Integer)entry.getKey() - 1], NATION_NAME[(Integer)winEntry.getKey() - 1], ((AtomicLong)winEntry.getValue()).get(), (float)((AtomicLong)winEntry.getValue()).get() / (float)(((AtomicLong)winEntry.getValue()).get() + failedNum.get())));
            bw.newLine();
            bw.write(String.format("种族(%s)对(%s)失败场数%d,败率为:%f", NATION_NAME[(Integer)entry.getKey() - 1], NATION_NAME[(Integer)winEntry.getKey() - 1], failedNum.get(), (float)failedNum.get() / (float)(((AtomicLong)winEntry.getValue()).get() + failedNum.get())));
            bw.newLine();
         }
      }

   }

   public static void printHeroResult(BufferedWriter bw, ConcurrentHashMap<Integer, Record> heroWin, String title) throws Exception {
      TreeMap<Float, Record> rank = new TreeMap();

      for(Map.Entry<Integer, Record> entry : heroWin.entrySet()) {
         Record record = (Record)entry.getValue();
         record.winRate = (float)record.win.get() / (float)(record.win.get() + record.failed.get());
         rank.put(record.winRate, record);
      }

      bw.write(title);
      bw.newLine();

      for(Record recordData : rank.values()) {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", recordData.heroId);
         bw.write(String.format("英雄名称:%s,英雄ID:%d, 胜率:%f, 胜利场数:%d,失败场数:%d", heroModel.getName(), recordData.heroId, recordData.winRate, recordData.win.get(), recordData.failed.get()));
         bw.newLine();
      }

   }

   public static void printSingleNation(BufferedWriter bw) throws Exception {
      bw.write("单种族测试情况");

      for(Map.Entry<Integer, RecordSingleNationData> entry : nationSingleWin.entrySet()) {
         RecordSingleNationData recordData = (RecordSingleNationData)entry.getValue();
         bw.newLine();
         bw.write(String.format("种族(%s)胜利场数:%d,胜率为:%f,失败场数:%d,失败率:%f", NATION_NAME[(Integer)entry.getKey() - 1], ((RecordSingleNationData)entry.getValue()).nationWin.get(), (float)((RecordSingleNationData)entry.getValue()).nationWin.get() / (float)(((RecordSingleNationData)entry.getValue()).nationWin.get() + ((RecordSingleNationData)entry.getValue()).nationFailed.get()), ((RecordSingleNationData)entry.getValue()).nationFailed.get(), (float)((RecordSingleNationData)entry.getValue()).nationFailed.get() / (float)(((RecordSingleNationData)entry.getValue()).nationWin.get() + ((RecordSingleNationData)entry.getValue()).nationFailed.get())));
      }

      bw.newLine();
   }

   public static void printTestState() {
      try {
         File file = new File("testState.txt");
         if (!file.exists()) {
            file.createNewFile();
         }

         FileWriter fileWriter = new FileWriter("testState.txt", true);
         BufferedWriter bw = new BufferedWriter(fileWriter);
         printNationResult(bw);
         printSingleNation(bw);
         printHeroResult(bw, heroMudWin, "英雄混战测试情况");
         printHeroResult(bw, heroSingleRecord, "英雄单挑测试情况");
         bw.flush();
         fileWriter.flush();
         bw.close();
         fileWriter.close();
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public byte getWinForce(BattleScene scene) {
      if (!scene.getPKTeam((byte)1).isDead() && !scene.getPKTeam((byte)0).isDead()) {
         return (byte)(scene.getPKTeam((byte)1).geAttackValue() > scene.getPKTeam((byte)0).geAttackValue() ? 1 : 0);
      } else {
         return scene.getWinForce();
      }
   }

   public void stop() {
      if (this.future != null) {
         this.future.cancel(false);
         this.future = null;
      }

   }

   public static void produceGameServerConfig(String path, String dir, int start, int end) {
      for(int i = start; i < end; ++i) {
         String tmpPath = path + File.separator + String.format("%s-%d", dir, i) + File.separator + "config" + File.separator + "application.properties";
         File file = new File(tmpPath);

         try {
            if (!file.exists()) {
               file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.format("NettyPort=%d\n", 8000 + i));
            bw.write(String.format("ServerName=s%d\n", i));
            bw.write(String.format("ServerId=%d\n", i));
            bw.write("PlatformId=4\n");
            bw.write("PlatformName=dev\n");
            bw.write(String.format("server.port=%d\n", 30000 + i));
            bw.write("center.url=http://192.168.10.24:40002\n");
            bw.write("ManagerCorePoolSize=8\npackage.scan=com.gzbz|com.yy\nprotobuf.packageName=com.gzbz.protobuf\nprotobuf.split=_\n" + String.format("DBGamePath=GameServer-%d\\\\config\\\\DBHikariCP.properties\n", i) + "DBCorePoolSize=4\nDBMaximumPoolSize=16\nxlsPath=E:\\\\Client-Vertical\\\\trunk\\\\Document\\\\trunk\\\\CeHua\\\\xls\nproduceXls=\nlanguage=Zh\nexlanguage=exZh\n" + String.format("DBLogPath=GameServer-%d\\\\config\\\\LogHikariCP.properties\n", i) + "DBLogSize=2\nDBLogMaximumSize=16\nredisUrl=redis://127.0.0.1:6379|123456\n" + String.format("ipPath=GameServer-%d\\\\config\\\\qqwry.dat\n", i) + "badWordPath=config\\\\txt\\\\BadWords.txt\nlogging.level.root=info\nlogging.file.path=./src/main/resources/log\nholidaysPath=config\\\\txt\\\\Holidays.txt\noldLogOperationPath=./src/main/resources/logOld\nnewLogOperationPath=./src/main/resources/logNew\nlogWrite=1\ngameBackFilePath=./dbBack.txt\nlogBackFilePath=./logBack.txt\nspring.mail.url=bin.com\nspring.mail.host=42.194.202.157\nspring.mail.port=25\nspring.mail.username=server\nspring.mail.password=123456\nspring.mail.recipient=yuanbin,zf,ytr,sjj,dam\nrecharge.appKey=110\nsdk.loginKey=N0o9dJqKxr3RUePWB79pHvOZ28fLlVrr\npropertyMonitor=true\nServerZone=1\nopenServerTime=2021-03-15 00:00:00\ncardExchangeUrl=http://cls.hb01.youyannet.com/api/c2s/use_card.php\ngetKeywordUrl=http://cls.hb01.youyannet.com/api/keyword.php\ngetKeywordKey=hdlSla9sjXphPqEoE8lZcg\nheroPath=D:\\\\Work-YouYan\\\\trunk\\\\GameServer\\\\src\\\\main\\\\resources\\\\hero.txt\nopPath=./logSystem.txt\nhotAgent.classpath=D:\\\\Work-YouYan\\\\trunk\\\\GameServer\\\\src\\\\main\\\\resources\\\\update\nhotAgent.jarPath=C:\\\\Users\\\\Administrator\\\\.m2\\\\repository\\\\hotswap-agent\\\\hotswap-agent\\\\1\\\\hotswap-agent-1.jar\nclientVersionFilePath=./\ngetChatLimitUrl=http://cls.hb01.youyannet.com/api/c2s/chat_level.php");
            bw.flush();
            fw.flush();
            bw.close();
            fw.close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

   }

   public static void produceDBConfig(String path, String dir, int start, int end) {
      for(int i = start; i < end; ++i) {
         String tmpPath = path + File.separator + String.format("%s-%d", dir, i) + File.separator + "config" + File.separator + "DBHikariCP.properties";
         File file = new File(tmpPath);

         try {
            if (!file.exists()) {
               file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.format("jdbcUrl=jdbc:mysql://localhost:3306/db_game_s%d?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull\n", i));
            bw.write("username=root\npassword=123456\nmaximumPoolSize=30\nminimumIdle=5\nconnectionTestQuery=SELECT 1\nautoCommit=true\nconnectionTimeout=2000\nidleTimeout=120000\nvalidationTimeout=10000\ndataSource.cachePrepStmts=true\ndataSource.prepStmtCacheSize=250\ndataSource.prepStmtCacheSqlLimit=2048\ndataSource.useServerPrepStmts=true\ndataSource.useLocalSessionState=true\ndataSource.useLocalTransactionState=true\ndataSource.rewriteBatchedStatements=true\ndataSource.cacheResultSetMetadata=true\ndataSource.cacheServerConfiguration=true\ndataSource.elideSetAutoCommits=true\ndataSource.maintainTimeStats=false");
            bw.flush();
            fw.flush();
            bw.close();
            fw.close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

   }

   public static void produceLogConfig(String path, String dir, int start, int end) {
      for(int i = start; i < end; ++i) {
         String tmpPath = path + File.separator + String.format("%s-%d", dir, i) + File.separator + "config" + File.separator + "LogHikariCP.properties";
         File file = new File(tmpPath);

         try {
            if (!file.exists()) {
               file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.format("jdbcUrl=jdbc:mysql://localhost:3306/db_log_s%d?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull\n", i));
            bw.write("username=root\npassword=123456\nmaximumPoolSize=30\nminimumIdle=5\nconnectionTestQuery=SELECT 1\nautoCommit=true\nconnectionTimeout=2000\nidleTimeout=120000\nvalidationTimeout=10000\ndataSource.cachePrepStmts=true\ndataSource.prepStmtCacheSize=250\ndataSource.prepStmtCacheSqlLimit=2048\ndataSource.useServerPrepStmts=true\ndataSource.useLocalSessionState=true\ndataSource.useLocalTransactionState=true\ndataSource.rewriteBatchedStatements=true\ndataSource.cacheResultSetMetadata=true\ndataSource.cacheServerConfiguration=true\ndataSource.elideSetAutoCommits=true\ndataSource.maintainTimeStats=false");
            bw.flush();
            fw.flush();
            bw.close();
            fw.close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

   }

   public static void main(final String[] args) {
      String path = "G:\\GameServers";
      String dir = "GameServer";
      int start = 20;
      int end = 33;
      produceGameServerConfig(path, dir, start, end);
      produceDBConfig(path, dir, start, end);
      produceLogConfig(path, dir, start, end);
   }

   @PreDestroy
   public void destroy() {
      this.future.cancel(true);
   }

   static {
      typeName.put((byte)6, "--------------------伤害");
      typeName.put((byte)5, "--------------------增加buff");
      typeName.put((byte)2, "--------------------吸收");
      typeName.put((byte)8, "--------------------回血");
      typeName.put((byte)1, "--------------------闪避");
      typeName.put((byte)7, "--------------------复活");
      NATION_NAME = new String[]{"魏", "蜀", "吴", "神", "魔"};
      testTimes = new AtomicLong();
      heroMudWin = new ConcurrentHashMap();
      nationMudRecord = new ConcurrentHashMap();
      heroSingleRecord = new ConcurrentHashMap();
      nationSingleWin = new ConcurrentHashMap();
      ALL_HEROS = new ArrayList();
      BATTLE_POS_INDEX = new ArrayList();
      NATION_MAP = new HashMap();
      LAST_POS = 9;
      HERO_MAX = 0;
      times = 0L;
      logger = LoggerFactory.getLogger(BattleTestMgr.class);
      recordMap = new ConcurrentHashMap();
      missMap = new ConcurrentHashMap();
      beMissMap = new ConcurrentHashMap();
      absorbMap = new ConcurrentHashMap();
      updateBuffMap = new ConcurrentHashMap();
      addBuffMap = new ConcurrentHashMap();
      damageMap = new ConcurrentHashMap();
      reviveMap = new ConcurrentHashMap();
      recoverHp = new ConcurrentHashMap();
   }
}
