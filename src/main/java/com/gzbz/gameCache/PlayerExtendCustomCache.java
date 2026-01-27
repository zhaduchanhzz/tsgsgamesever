package com.gzbz.gameCache;

import cache.CachePool;
import cache.CustomCacheData;
import cache.CustomCachePoolAnno;
import com.gzbz.db.PlayerExtendDao;
import com.gzbz.gameDefine.PlayerExtendDefine;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@CustomCachePoolAnno(
   tbName = "tb_player_extend"
)
public class PlayerExtendCustomCache<T> extends CustomCacheData<PlayerExtendDao> {
   public T playerExtendData = null;
   private List<PlayerExtendDao> list;

   public void update() {
      ((PlayerExtendDao)this.list.get(0)).updateOp();
   }

   public void load(CachePool pool, List<PlayerExtendDao> list, Object... objects) {
      if (list != null && list.size() > 0) {
         this.playerExtendData = (T)JsonUtil.jsonToBean(((PlayerExtendDao)list.get(0)).value, (Class)PlayerExtendDefine.moduleExtendMap.get(objects[1]));
         this.list = list;
      } else {
         this.list = new ArrayList();

         try {
            Class<?> extendClz = (Class)PlayerExtendDefine.moduleExtendMap.get(objects[1]);
            if (extendClz == null) {
               throw new RuntimeException("未知扩展信息类,请检查PlayerExtendDefine.moduleExtendMap");
            }

            this.playerExtendData = (T)extendClz.newInstance();
            PlayerExtendDao playerExtendDao = new PlayerExtendDao();
            playerExtendDao.playerId = (Integer)objects[0];
            playerExtendDao.module = (Integer)objects[1];
            playerExtendDao.value = (T)JsonUtil.beanToJson(this.playerExtendData);
            playerExtendDao.insertOp();
            this.list.add(playerExtendDao);
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

   }

   public List<PlayerExtendDao> save() {
      ((PlayerExtendDao)this.list.get(0)).value = (T)JsonUtil.beanToJson(this.playerExtendData);
      return this.list;
   }

   public void unload(CachePool pool) {
      this.playerExtendData = null;
   }
}
