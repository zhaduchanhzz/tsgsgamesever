package com.gzbz.gameCache;

import cache.CachePool;
import cache.CustomCacheData;
import cache.CustomCachePoolAnno;
import com.gzbz.db.PlayerResetDao;
import com.gzbz.db.bean.PlayerResetData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import org.springframework.util.StringUtils;

@CustomCachePoolAnno(
   tbName = "tb_player_reset"
)
public class PlayerResetCustomCache extends CustomCacheData<PlayerResetDao> {
   private PlayerResetDao playerResetDao;
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

   public void load(CachePool pool, List<PlayerResetDao> list, Object... args) {
      this.dailyData = new HashMap();
      this.weekData = new HashMap();
      this.monthData = new HashMap();
      this.foreverData = new HashMap();
      if (list.isEmpty()) {
         this.playerResetDao = new PlayerResetDao();
         this.playerResetDao.playerId = (Integer)args[0];
         this.playerResetDao.insertOp();
      } else {
         this.playerResetDao = (PlayerResetDao)list.get(0);
         this.parseValue(this.dailyData, this.playerResetDao.dailyValue);
         this.parseValue(this.weekData, this.playerResetDao.weekValue);
         this.parseValue(this.monthData, this.playerResetDao.monthValue);
         this.parseValue(this.foreverData, this.playerResetDao.foreverValue);
         this.playerResetDao.dailyValue = null;
         this.playerResetDao.weekValue = null;
         this.playerResetDao.monthValue = null;
         this.playerResetDao.foreverValue = null;
      }
   }

   public List<PlayerResetDao> save() {
      List<PlayerResetDao> playerResetDaoList = new ArrayList();
      PlayerResetDao playerResetDao = new PlayerResetDao();
      playerResetDao.playerId = this.playerResetDao.playerId;
      switch (this.playerResetDao.getOp()) {
         case 1:
            playerResetDao.insertOp();
            break;
         case 2:
            playerResetDao.updateOp();
            break;
         default:
            playerResetDao.noneOp();
      }

      playerResetDao.dailyValue = this.convertDataMap(this.dailyData.values());
      playerResetDao.weekValue = this.convertDataMap(this.weekData.values());
      playerResetDao.monthValue = this.convertDataMap(this.monthData.values());
      playerResetDao.foreverValue = this.convertDataMap(this.foreverData.values());
      playerResetDaoList.add(playerResetDao);
      this.playerResetDao.noneOp();
      return playerResetDaoList;
   }

   public void unload(CachePool pool) {
      this.dailyData.clear();
      this.weekData.clear();
      this.monthData.clear();
      this.foreverData.clear();
      this.playerResetDao = null;
   }

   private void reset(Map<Integer, PlayerResetData> dataMap, int uqId) {
      if (uqId == 0) {
         dataMap.clear();
      } else {
         dataMap.remove(uqId);
      }

      this.playerResetDao.updateOp();
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
      this.playerResetDao.updateOp();
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
      this.playerResetDao.updateOp();
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
