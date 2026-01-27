package com.gzbz.gameCache;

import cache.CachePool;
import cache.CustomCacheData;
import cache.CustomCachePoolAnno;
import com.gzbz.db.PlayerItemResetDao;
import com.gzbz.db.bean.PlayerResetData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import org.springframework.util.StringUtils;

@CustomCachePoolAnno(
   tbName = "tb_player_item_reset"
)
public class PlayerItemResetCustomCache extends CustomCacheData<PlayerItemResetDao> {
   private PlayerItemResetDao playerItemResetDao;
   private Map<Integer, PlayerResetData> dailyData;
   private Map<Integer, PlayerResetData> weekData;
   private Map<Integer, PlayerResetData> monthData;
   private Map<Integer, PlayerResetData> foreverData;
   public static HashMap<Class<?>, BiFunction> sumFunc = new HashMap();

   public <T> PlayerResetData<T> getDaily(int uqId) {
      return (PlayerResetData)this.dailyData.get(uqId);
   }

   public <T> T getDailyNum(int uqId, T defaultNum) {
      PlayerResetData<T> resetData = this.<T>getDaily(uqId);
      return (T)(resetData == null ? defaultNum : resetData.getNum());
   }

   public PlayerResetData getWeek(int uqId) {
      return (PlayerResetData)this.weekData.get(uqId);
   }

   public <T> T getWeekNum(int uqId, T defaultNum) {
      PlayerResetData<T> resetData = this.getWeek(uqId);
      return (T)(resetData == null ? defaultNum : resetData.getNum());
   }

   public PlayerResetData getMonth(int uqId) {
      return (PlayerResetData)this.monthData.get(uqId);
   }

   public <T> T getMonthNum(int uqId, T defaultNum) {
      PlayerResetData<T> resetData = this.getMonth(uqId);
      return (T)(resetData == null ? defaultNum : resetData.getNum());
   }

   public PlayerResetData getForever(int uqId) {
      return (PlayerResetData)this.foreverData.get(uqId);
   }

   public <T> T getForeverNum(int uqId, T defaultNum) {
      PlayerResetData<T> resetData = this.getForever(uqId);
      return (T)(resetData == null ? defaultNum : resetData.getNum());
   }

   public <T> void addDailyReset(int uqId, T num) {
      this.addReset(this.dailyData, uqId, num);
   }

   public <T> void setDailyReset(int uqId, T num) {
      this.setReset(this.dailyData, uqId, num);
   }

   public <T> void addWeekReset(int uqId, T num) {
      this.addReset(this.weekData, uqId, num);
   }

   public <T> void setWeekReset(int uqId, T num) {
      this.setReset(this.weekData, uqId, num);
   }

   public <T> void addMonthReset(int uqId, T num) {
      this.addReset(this.monthData, uqId, num);
   }

   public <T> void setMonthReset(int uqId, T num) {
      this.setReset(this.monthData, uqId, num);
   }

   public <T> void addForever(int uqId, T num) {
      this.addReset(this.foreverData, uqId, num);
   }

   public <T> void setForever(int uqId, T num) {
      this.setReset(this.foreverData, uqId, num);
   }

   public void reset(int type, int uqId) {
      switch (type) {
         case 1:
            this.reset(this.dailyData, uqId);
            break;
         case 2:
            this.reset(this.weekData, uqId);
            break;
         case 3:
            this.reset(this.monthData, uqId);
            break;
         case 4:
            this.reset(this.foreverData, uqId);
      }

   }

   public void load(CachePool pool, List<PlayerItemResetDao> list, Object... args) {
      this.dailyData = new HashMap();
      this.weekData = new HashMap();
      this.monthData = new HashMap();
      this.foreverData = new HashMap();
      if (list.isEmpty()) {
         this.playerItemResetDao = new PlayerItemResetDao();
         this.playerItemResetDao.playerId = (Integer)args[0];
         this.playerItemResetDao.insertOp();
      } else {
         this.playerItemResetDao = (PlayerItemResetDao)list.get(0);
         this.parseValue(this.dailyData, this.playerItemResetDao.dailyValue);
         this.parseValue(this.weekData, this.playerItemResetDao.weekValue);
         this.parseValue(this.monthData, this.playerItemResetDao.monthValue);
         this.parseValue(this.foreverData, this.playerItemResetDao.foreverValue);
         this.playerItemResetDao.dailyValue = null;
         this.playerItemResetDao.weekValue = null;
         this.playerItemResetDao.monthValue = null;
         this.playerItemResetDao.foreverValue = null;
      }
   }

   public List<PlayerItemResetDao> save() {
      List<PlayerItemResetDao> playerItemResetDaoList = new ArrayList();
      PlayerItemResetDao playerItemResetDao = new PlayerItemResetDao();
      playerItemResetDao.playerId = this.playerItemResetDao.playerId;
      switch (this.playerItemResetDao.getOp()) {
         case 1:
            playerItemResetDao.insertOp();
            break;
         case 2:
            playerItemResetDao.updateOp();
            break;
         default:
            playerItemResetDao.noneOp();
      }

      playerItemResetDao.dailyValue = this.convertDataMap(this.dailyData.values());
      playerItemResetDao.weekValue = this.convertDataMap(this.weekData.values());
      playerItemResetDao.monthValue = this.convertDataMap(this.monthData.values());
      playerItemResetDao.foreverValue = this.convertDataMap(this.foreverData.values());
      playerItemResetDaoList.add(playerItemResetDao);
      this.playerItemResetDao.noneOp();
      return playerItemResetDaoList;
   }

   public void unload(CachePool pool) {
      this.dailyData.clear();
      this.weekData.clear();
      this.monthData.clear();
      this.foreverData.clear();
      this.playerItemResetDao = null;
   }

   private void reset(Map<Integer, PlayerResetData> dataMap, int uqId) {
      if (uqId == 0) {
         dataMap.clear();
      } else {
         dataMap.remove(uqId);
      }

      this.playerItemResetDao.updateOp();
   }

   private <T> void addReset(Map<Integer, PlayerResetData> dataMap, int uqId, T num) {
      PlayerResetData playerResetData = (PlayerResetData)dataMap.get(uqId);
      if (playerResetData == null) {
         playerResetData = new PlayerResetData(uqId, num, num.getClass());
      } else {
         playerResetData.setNum(((BiFunction)sumFunc.get(num.getClass())).apply(playerResetData.getNum(), num));
      }

      playerResetData.updateTime = System.currentTimeMillis();
      dataMap.put(uqId, playerResetData);
      this.playerItemResetDao.updateOp();
   }

   private <T> void setReset(Map<Integer, PlayerResetData> dataMap, int uqId, T num) {
      PlayerResetData playerResetData = (PlayerResetData)dataMap.get(uqId);
      if (playerResetData == null) {
         playerResetData = new PlayerResetData(uqId, num, num.getClass());
      } else {
         playerResetData.setNum(num);
      }

      playerResetData.updateTime = System.currentTimeMillis();
      dataMap.put(uqId, playerResetData);
      this.playerItemResetDao.updateOp();
   }

   private void parseValue(Map<Integer, PlayerResetData> dataMap, String dataValue) {
      if (!StringUtils.isEmpty(dataValue)) {
         String[] dataArr = dataValue.split(";");

         for(String data : dataArr) {
            String[] fields = data.split(",");
            dataMap.put(Integer.parseInt(fields[0]), PlayerResetData.NewPlayerResetData(fields[0], fields[1], fields[2], fields[3]));
         }
      }

   }

   private String convertDataMap(Collection<PlayerResetData> playerResetDataCollection) {
      StringBuilder stringBuilder = new StringBuilder();

      for(PlayerResetData playerResetData : playerResetDataCollection) {
         stringBuilder.append(playerResetData.uqId).append(",").append(playerResetData.getNum()).append(",").append(playerResetData.cls).append(",").append(playerResetData.updateTime).append(";");
      }

      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }

   static {
      sumFunc.put(Integer.class, Integer::sum);
      sumFunc.put(Integer.TYPE, Integer::sum);
      sumFunc.put(Byte.class, (BiFunction)(a, b) -> (byte)(a + b));
      sumFunc.put(Byte.TYPE, (BiFunction)(a, b) -> (byte)(a + b));
      sumFunc.put(Short.class, (BiFunction)(a, b) -> (short)(a + b));
      sumFunc.put(Short.TYPE, (BiFunction)(a, b) -> (short)(a + b));
      sumFunc.put(Long.class, (BiFunction)(a, b) -> a + b);
      sumFunc.put(Long.TYPE, (BiFunction)(a, b) -> a + b);
   }
}
