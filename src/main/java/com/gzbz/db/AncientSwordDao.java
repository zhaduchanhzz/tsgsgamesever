package com.gzbz.db;

import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.arraying.FriendArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.model.BattleModel;
import com.gzbz.protobuf.AncientSwordMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.util.TempUtil;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DataUtils;
import misc.JsonUtil;
import org.springframework.util.CollectionUtils;

@DBTableAnno(
   name = "tb_ancient_sword",
   resultType = 0,
   selectKey = {"playerId"}
)
public class AncientSwordDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "剑冢积累的灵气值"
   )
   public int gas;
   @DBColumnAnno(
      comment = "是否已经解锁过剑冢(解锁了可以一键扫荡每日小怪了)"
   )
   public boolean hasUnlock = false;
   @DBColumnAnno(
      comment = "周怪物剩余刷新次数"
   )
   public int flushTime = 5;
   @DBColumnAnno(
      comment = "本次神秘商店截止时间"
   )
   public long shopDeadline;
   @DBColumnAnno(
      comment = "今日神秘商店是否已经触发过"
   )
   public boolean triggerShop = false;
   @DBColumnAnno(
      comment = "失败后记录的每日小怪的key用于是否结算"
   )
   public int failKey;
   @DBColumnAnno(
      comment = "失败后记录的奖励id"
   )
   public int failRewardId;
   @DBColumnAnno(
      comment = "活跃度"
   )
   public int activeValue;
   @DBColumnAnno(
      comment = "本轮活跃奖励结束时间戳"
   )
   public int activeEnd;
   @DBColumnAnno(
      comment = "上一次生成小怪时间"
   )
   public int lastBorn;
   @DBColumnAnno(
      comment = "每日小怪是否已经生成过了，刷周和刷日一起执行，这个时候就不再执行每日的刷新了"
   )
   public boolean todayBorn = false;
   @DBColumnAnno(
      comment = "待刷新的小怪id"
   )
   public int flushM;
   @DBColumnAnno(
      comment = "生成小怪等待时间，如果当前时间超过这个值，则默认跨服生成完了开始补机器人"
   )
   public long waitTime;
   @DBColumnAnno(
      comment = "战令 - 是否开启高级战令"
   )
   public boolean VIP = false;
   @DBColumnAnno(
      comment = "战令 - 积分"
   )
   public int integral;
   @DBColumnAnno(
      comment = "战令 - 等级"
   )
   public int level;
   @DBColumnAnno(
      comment = "战令 - 已购买的等级"
   )
   public int buyLevel;
   @DBColumnAnno(
      comment = "战令 - 已购买的积分"
   )
   public int buyIntegral;
   @DBColumnAnno(
      comment = "本次商店刷出的商品",
      columnType = "TEXT",
      loadFun = "loadShopIds",
      saveFun = "saveShopIds"
   )
   public Set<Integer> shopIds = new HashSet();
   @DBColumnAnno(
      comment = "Map<商品id，本周刷出的次数>",
      columnType = "TEXT",
      loadFun = "loadShopTimeMap",
      saveFun = "saveShopTimeMap"
   )
   public Map<Integer, Integer> shopTimeMap = new HashMap();
   @DBColumnAnno(
      comment = "日怪(key是生成玩家id)",
      columnType = "LONGTEXT",
      loadFun = "loadDayMonsterMap",
      saveFun = "saveDayMonsterMap"
   )
   public Map<Integer, MonsterData> dayMonsterMap = new HashMap();
   @DBColumnAnno(
      comment = "周怪(key是生成玩家id)",
      columnType = "LONGTEXT",
      loadFun = "loadWeekMonsterMap",
      saveFun = "saveWeekMonsterMap"
   )
   public Map<Integer, MonsterData> weekMonsterMap = new HashMap();
   @DBColumnAnno(
      comment = "小怪接收list，机器人跨服什么的全部先保存来这里，最后战力排序再分配难度",
      columnType = "LONGTEXT",
      loadFun = "loadWeekMonsterMap",
      saveFun = "saveWeekMonsterMap"
   )
   public List<MonsterData> receiveList = new ArrayList();
   @DBColumnAnno(
      comment = "获得的buffId(对应的是skill表的技能id)",
      columnType = "TEXT",
      loadFun = "loadBuffs",
      saveFun = "saveBuffs"
   )
   public List<Integer> buffs = new ArrayList();
   @DBColumnAnno(
      comment = "已领取的活跃度奖励id",
      columnType = "TEXT",
      loadFun = "loadActiveRewards",
      saveFun = "saveActiveRewards"
   )
   public List<Integer> activeRewards = new ArrayList();
   @DBColumnAnno(
      comment = "需要生成的小怪配置(真人玩家不足通过这个补上机器人)",
      columnType = "VARCHAR",
      loadFun = "loadBornConfigs",
      saveFun = "saveBornConfigs"
   )
   public List<Integer> bornConfigs = new ArrayList();

   public void loadShopIds(String data) {
      this.shopIds = DataUtils.stringToIntSet(data);
   }

   public String saveShopIds() {
      return DataUtils.intSetToString(this.shopIds);
   }

   public void loadShopTimeMap(String data) {
      this.shopTimeMap = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveShopTimeMap() {
      return JsonUtil.beanToJson(this.shopTimeMap);
   }

   public void loadDayMonsterMap(String data) {
      this.dayMonsterMap = JsonUtil.jsonToMap(data, Integer.class, MonsterData.class);
   }

   public String saveWeekMonsterMap() {
      return JsonUtil.beanToJson(this.weekMonsterMap);
   }

   public void loadWeekMonsterMap(String data) {
      this.weekMonsterMap = JsonUtil.jsonToMap(data, Integer.class, MonsterData.class);
   }

   public String saveDayMonsterMap() {
      return JsonUtil.beanToJson(this.dayMonsterMap);
   }

   public void loadBuffs(String data) {
      this.buffs = DataUtils.stringToIntList(data);
   }

   public String saveBuffs() {
      return DataUtils.intListToString(this.buffs);
   }

   public void loadActiveRewards(String data) {
      this.activeRewards = DataUtils.stringToIntList(data);
   }

   public String saveActiveRewards() {
      return DataUtils.intListToString(this.activeRewards);
   }

   public void loadBornConfigs(String data) {
      this.bornConfigs = DataUtils.stringToIntList(data);
   }

   public String saveBornConfigs() {
      return DataUtils.intListToString(this.bornConfigs);
   }

   public MonsterData getMonster(int key) {
      MonsterData data = (MonsterData)this.dayMonsterMap.get(key);
      if (data == null) {
         data = (MonsterData)this.weekMonsterMap.get(key);
      }

      return data;
   }

   public int removeMonster(int playerId) {
      MonsterData data = (MonsterData)this.dayMonsterMap.remove(playerId);
      if (data == null) {
         data = (MonsterData)this.weekMonsterMap.remove(playerId);
      }

      return data == null ? -1 : data.index;
   }

   public void resetToken() {
      this.VIP = false;
      this.level = 0;
      this.integral = 0;
      this.buyIntegral = 0;
      this.buyLevel = 0;
      this.updateOp();
   }

   public static class MonsterData {
      public int monsterId = -1;
      public String name;
      public int key;
      public int lv;
      public byte[] arrayingData;
      public int battleId;
      public long power;
      public int index = -1;
      public int heroId;
      public List<Integer> briefInfo = new ArrayList();

      public AncientSwordMsg.AncientMonster toBuild() {
         if (CollectionUtils.isEmpty(this.briefInfo)) {
            BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", this.battleId);
            if (battleModel != null) {
               BattlePKTeam battlePKTeam = new BattlePKTeam(this.battleId);

               for(Map.Entry<Byte, Entity> entry : battlePKTeam.getAllEntity().entrySet()) {
                  Entity entity = (Entity)entry.getValue();
                  this.briefInfo.add(entity.getId());
                  this.briefInfo.add(entity.getLevel());
                  this.briefInfo.add(entity.getStar());
                  this.briefInfo.add(Integer.valueOf((Byte)entry.getKey()));
                  this.briefInfo.add(entity.getHeroMirror().dressId);
               }

               if (this.heroId == 0) {
                  Entity one = (Entity)TempUtil.getOneForCollection(battlePKTeam.getAllEntity().values());
                  if (one != null) {
                     this.heroId = one.getId();
                  }
               }
            } else {
               ArrayList<HeroArrayingEntity> heroes = new ArrayList();
               ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror(this.arrayingData);
               if (arrayingMirror != null) {
                  for(ArrayingEntity entity : arrayingMirror.arrayingElementsMap.values()) {
                     if (entity instanceof HeroArrayingEntity) {
                        HeroArrayingEntity e = (HeroArrayingEntity)entity;
                        HeroMirror mirror = e.mirror;
                        this.briefInfo.add(mirror.id);
                        this.briefInfo.add(mirror.lv);
                        this.briefInfo.add(mirror.star);
                        this.briefInfo.add(e.positon);
                        this.briefInfo.add(mirror.dressId);
                        heroes.add(e);
                     } else if (entity instanceof FriendArrayingEntity) {
                        FriendArrayingEntity e = (FriendArrayingEntity)entity;
                        HeroMirror mirror = e.mirror;
                        this.briefInfo.add(mirror.id);
                        this.briefInfo.add(mirror.lv);
                        this.briefInfo.add(mirror.star);
                        this.briefInfo.add(e.positon);
                        this.briefInfo.add(mirror.dressId);
                     }
                  }

                  if (this.heroId == 0) {
                     HeroArrayingEntity entity = (HeroArrayingEntity)TempUtil.getOneForCollection(heroes);
                     if (entity != null) {
                        this.heroId = entity.heroId();
                     }
                  }
               }
            }
         }

         AncientSwordMsg.AncientMonster.Builder builder = AncientSwordMsg.AncientMonster.newBuilder();
         int i = 0;

         while(i < this.briefInfo.size()) {
            builder.addAncientHero(AncientSwordMsg.AncientHero.newBuilder().setHeroId((Integer)this.briefInfo.get(i++)).setLevel((Integer)this.briefInfo.get(i++)).setStar((Integer)this.briefInfo.get(i++)).setPos((Integer)this.briefInfo.get(i++)).setDressId((Integer)this.briefInfo.get(i++)).build());
         }

         builder.setId(this.monsterId).setKey(this.key).setLv(this.lv).setName(this.name == null ? "soldier" : this.name).setPower(this.power).setIndex(this.index).setHeroId(this.heroId);
         return builder.build();
      }

      public long getPower() {
         return this.power;
      }
   }
}
