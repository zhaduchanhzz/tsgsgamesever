package com.gzbz.gameCache;

import cache.CachePool;
import cache.CustomCacheData;
import cache.CustomCachePoolAnno;
import com.gzbz.db.TestDao;
import java.util.HashMap;
import java.util.List;

@CustomCachePoolAnno(
   tbName = "tb_test"
)
public class TestCustomCache extends CustomCacheData<TestDao> {
   private HashMap<Integer, TestDao> map;
   private List<TestDao> list;
   private CachePool pool;

   public void add(TestDao dao) {
      this.map.put(dao.playerId, dao);
      this.list.add(dao);
      dao.insertOp();
   }

   public void modify(int playerId, String name) {
      TestDao testDao = (TestDao)this.map.get(playerId);
      testDao.name = name;
      testDao.updateOp();
   }

   public void delete(int playerId) {
      TestDao testDao = (TestDao)this.map.remove(playerId);
      this.list.remove(testDao);
      this.pool.deleteDao(testDao, false);
   }

   public void load(CachePool pool, List<TestDao> list, Object... arg) {
      this.pool = pool;
      this.list = list;
      this.map = new HashMap();

      for(TestDao dao : list) {
         this.map.put(dao.playerId, dao);
      }

   }

   public List<TestDao> save() {
      return this.list;
   }

   public void unload(CachePool pool) {
      this.map.clear();
   }
}
