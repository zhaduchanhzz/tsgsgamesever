package com.gzbz.db;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.gamePlayer.expedition.ExpeditionGridInfo;
import com.gzbz.model.ExpeditionEventModel;
import com.gzbz.model.ExpeditionGridEventModel;
import com.gzbz.model.ExpeditionMapModel;
import com.gzbz.model.fun.ExpeditionEventFun;
import com.gzbz.model.fun.ResourceModel;
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
import misc.JsonUtil;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_expedition",
   resultType = 2,
   selectKey = {"playerId"},
   mapKey = {"chapterId"}
)
public class ExpeditionDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "关卡id"
   )
   public int chapterId;
   @DBColumnAnno(
      comment = "版本号"
   )
   public int version;
   @DBColumnAnno(
      comment = "当前所在格子"
   )
   public int curGrid;
   @DBColumnAnno(
      comment = "是否已播放剧情"
   )
   public int plot = -1;
   @DBColumnAnno(
      comment = "击败敌军数"
   )
   public int beat;
   @DBColumnAnno(
      comment = "已领取宝箱数"
   )
   public int openedBoxNum;
   @DBColumnAnno(
      comment = "总宝箱数"
   )
   public int totalBoxNum;
   @DBColumnAnno(
      comment = "状态"
   )
   public int state;
   @DBColumnAnno(
      comment = "是否通关"
   )
   public boolean passed;
   @DBColumnAnno(
      comment = "进入章节的活动id"
   )
   public int activityId;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadBuffs",
      saveFun = "saveBuffs",
      comment = "当前拥有的buff"
   )
   public Set<Integer> buffs = new HashSet();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadSee",
      saveFun = "saveSee",
      comment = "已探索的格子"
   )
   public Set<Integer> seeGridSet = new HashSet();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadGridBuffs",
      saveFun = "saveGridBuffs",
      comment = "格子战利品"
   )
   public Map<Integer, Set<Integer>> gridBuffs = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadGridMonster",
      saveFun = "saveGridMonster",
      comment = "兵营武将"
   )
   public Map<Integer, List<HeroMirror>> gridMonster = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadMonsters",
      saveFun = "saveMonsters",
      comment = "选择的援兵"
   )
   public Map<Integer, HeroMirror> monsters = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadEnemyData",
      saveFun = "saveEnemyData",
      comment = "敌军数据"
   )
   public Map<Integer, EnemyData> enemyDatas = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadHeroHp",
      saveFun = "saveHeroHp",
      comment = "武将血量"
   )
   public Map<Integer, HpData> heroHp = new HashMap();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadGridInfo",
      saveFun = "saveGridInfo",
      comment = "格子信息"
   )
   public Map<Integer, ExpeditionGridInfo> gridInfoMap = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadFrontEventMap",
      saveFun = "saveFrontEventMap",
      comment = "Map<带前置事件的格子id, 前置条件list>"
   )
   public Map<Integer, List<Integer>> frontEventMap = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadBox",
      saveFun = "saveBox",
      comment = "宝箱数据"
   )
   public Map<Integer, Integer> box = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadHeroMirror",
      saveFun = "saveHeroMirror",
      comment = "最高战力阵型"
   )
   public List<HeroMirror> heroMirrors = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadChooseFriend",
      saveFun = "saveChooseFriend",
      comment = "选择雇佣的好友"
   )
   public Set<Integer> chooseFriend = new HashSet();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadTempProps",
      saveFun = "saveTempProps",
      comment = "临时道具"
   )
   public Map<Integer, ResourceModel> tempProps = new HashMap();

   public void loadBuffs(String str) {
      List<String> list = Splitter.on("|").splitToList(str);
      list.forEach((value) -> this.buffs.add(Integer.parseInt(value)));
   }

   public String saveBuffs() {
      return Joiner.on("|").join(this.buffs);
   }

   public void loadSee(String str) {
      List<String> list = Splitter.on("|").splitToList(str);
      list.forEach((value) -> this.seeGridSet.add(Integer.parseInt(value)));
   }

   public String saveSee() {
      return Joiner.on("|").join(this.seeGridSet);
   }

   public void loadGridBuffs(String str) {
      Map<Integer, String> map = JsonUtil.jsonToMap(str, Integer.class, String.class);
      map.entrySet().forEach((entry) -> {
         Set<Integer> v = (Set)JsonUtil.jsonToBean((String)entry.getValue(), HashSet.class);
         this.gridBuffs.put(entry.getKey(), v);
      });
   }

   public String saveGridBuffs() {
      return JsonUtil.beanToJson(this.gridBuffs);
   }

   public void loadGridMonster(String str) {
      Map<Integer, String> map = JsonUtil.jsonToMap(str, Integer.class, String.class);
      map.entrySet().forEach((entry) -> {
         List<HeroMirror> v = JsonUtil.jsonToList((String)entry.getValue(), HeroMirror.class);
         this.gridMonster.put(entry.getKey(), v);
      });
   }

   public String saveGridMonster() {
      return JsonUtil.beanToJson(this.gridMonster);
   }

   public void loadFrontEventMap(String str) {
      this.frontEventMap = TempUtil.strToIntMapList(str);
   }

   public String saveFrontEventMap() {
      return JsonUtil.beanToJson(this.frontEventMap);
   }

   public void loadMonsters(String str) {
      this.monsters = JsonUtil.jsonToMap(str, Integer.class, HeroMirror.class);
   }

   public String saveMonsters() {
      return JsonUtil.beanToJson(this.monsters);
   }

   public void loadEnemyData(String str) {
      this.enemyDatas = JsonUtil.jsonToMap(str, Integer.class, EnemyData.class);
   }

   public String saveEnemyData() {
      return JsonUtil.beanToJson(this.enemyDatas);
   }

   public void loadHeroHp(String str) {
      this.heroHp = JsonUtil.jsonToMap(str, Integer.class, HpData.class);
   }

   public String saveHeroHp() {
      return JsonUtil.beanToJson(this.heroHp);
   }

   public void loadGridInfo(String str) {
      if (!StringUtils.isEmpty(str)) {
         if (str.startsWith("{")) {
            this.gridInfoMap = JsonUtil.jsonToMap(str, Integer.class, ExpeditionGridInfo.class);
         } else {
            this.gridInfoMap.clear();
            String[] strings = str.split("\u0001", -1);

            for(String string : strings) {
               ExpeditionGridInfo expeditionGridInfo = new ExpeditionGridInfo();
               expeditionGridInfo.decode(string);
               this.gridInfoMap.put(expeditionGridInfo.gridId, expeditionGridInfo);
            }
         }

      }
   }

   public String saveGridInfo() {
      StringBuilder stringBuilder = new StringBuilder();
      if (this.gridInfoMap.size() > 0) {
         for(Map.Entry<Integer, ExpeditionGridInfo> entry : this.gridInfoMap.entrySet()) {
            ExpeditionGridInfo expeditionGridInfo = (ExpeditionGridInfo)entry.getValue();
            String data = expeditionGridInfo.encode();
            stringBuilder.append(data);
            stringBuilder.append("\u0001");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }

   public void loadBox(String str) {
      this.box = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String saveBox() {
      return JsonUtil.beanToJson(this.box);
   }

   public void loadHeroMirror(String str) {
      this.heroMirrors = JsonUtil.jsonToList(str, HeroMirror.class);
   }

   public String saveHeroMirror() {
      return JsonUtil.beanToJson(this.heroMirrors);
   }

   public void loadChooseFriend(String str) {
      this.chooseFriend = (Set)JsonUtil.jsonToBean(str, HashSet.class);
   }

   public String saveChooseFriend() {
      return JsonUtil.beanToJson(this.chooseFriend);
   }

   public void loadTempProps(String str) {
      this.tempProps = JsonUtil.jsonToMap(str, Integer.class, ResourceModel.class);
   }

   public String saveTempProps() {
      return JsonUtil.beanToJson(this.tempProps);
   }

   public void createFrontEventMap() {
      this.frontEventMap.clear();
      Map<Integer, ExpeditionMapModel> map = (Map)ApplicationContextProvider.getModelPoolEntity("customExpeditionMap", this.chapterId);
      if (map != null) {
         for(ExpeditionMapModel model : map.values()) {
            ExpeditionGridEventModel model1 = (ExpeditionGridEventModel)ApplicationContextProvider.getModelPoolEntity("expeditionGridEvent", model.getGridEventId());
            ExpeditionGridEventModel model2 = (ExpeditionGridEventModel)ApplicationContextProvider.getModelPoolEntity("expeditionGridEvent", model.getChangeEventId());
            ArrayList<ExpeditionEventFun> eventFuns = new ArrayList();
            if (model1 != null) {
               eventFuns.addAll(model1.getEvent());
            }

            if (model2 != null) {
               eventFuns.addAll(model2.getEvent());
            }

            for(ExpeditionEventFun eventFun : eventFuns) {
               if (eventFun != null && eventFun.getType() == 21) {
                  ExpeditionEventModel eventModel = (ExpeditionEventModel)ApplicationContextProvider.getModelPoolEntity("customExpeditionEvent", String.format("%d_%d", eventFun.getType(), eventFun.getId()));
                  if (eventModel != null) {
                     List<Integer> list = (List)this.frontEventMap.computeIfAbsent(model.getGridId(), ArrayList::new);

                     for(String eventId : eventModel.getArgs().split("\\|")) {
                        list.add(Integer.parseInt(eventId));
                     }
                  }
               }
            }
         }
      }

   }

   public static class HpData {
      public Long hp;
      public Integer hpPercent;
   }

   public static class EnemyData {
      public boolean passed;
      public Map<Integer, HpData> hpDataMap = new HashMap();
   }
}
