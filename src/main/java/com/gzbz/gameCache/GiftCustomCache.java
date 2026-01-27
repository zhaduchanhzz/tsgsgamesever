package com.gzbz.gameCache;

import cache.CachePool;
import cache.CustomCacheData;
import cache.CustomCachePoolAnno;
import com.gzbz.db.GiftDao;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@CustomCachePoolAnno(
   tbName = "tb_gift"
)
public class GiftCustomCache extends CustomCacheData<GiftDao> {
   private final Map<Integer, Map<Integer, GiftDao>> giftMap = new ConcurrentHashMap();
   private List<GiftDao> list;
   private CachePool pool;

   public void addGift(GiftDao giftDao) {
      giftDao.insertOp();
      this.list.add(giftDao);
      ((Map)this.giftMap.computeIfAbsent(giftDao.giftType, (v) -> new ConcurrentHashMap())).put(giftDao.giftId, giftDao);
   }

   public Map<Integer, GiftDao> getBuyGifts(int giftType) {
      return (Map)this.giftMap.getOrDefault(giftType, new ConcurrentHashMap());
   }

   public void clearGifts(int giftType) {
      this.getBuyGifts(giftType).values().forEach((giftDao) -> {
         this.list.remove(giftDao);
         this.pool.deleteDao(giftDao, false);
      });
      this.giftMap.remove(giftType);
   }

   public void removeGift(GiftDao giftDao) {
      this.getBuyGifts(giftDao.giftType).remove(giftDao.giftId);
      this.list.remove(giftDao);
      this.pool.deleteDao(giftDao, false);
   }

   public void load(CachePool pool, List<GiftDao> list, Object... objects) {
      this.pool = pool;
      this.list = list;
      this.list.forEach((giftDao) -> {
         GiftDao var10000 = (GiftDao)((Map)this.giftMap.computeIfAbsent(giftDao.giftType, (v) -> new ConcurrentHashMap())).put(giftDao.giftId, giftDao);
      });
   }

   public List<GiftDao> save() {
      return this.list;
   }

   public void unload(CachePool pool) {
      this.giftMap.clear();
      this.list.clear();
   }
}
