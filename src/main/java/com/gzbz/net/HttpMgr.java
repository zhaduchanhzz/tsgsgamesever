package com.gzbz.net;

import HttpClient.HttpClient;
import allMgr.MgrAnno;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gameMgr.PlayerPart;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import thread.ThreadFactroyUtil;

@MgrAnno
@Component
public class HttpMgr extends GameMgr {
   private ExecutorService _executor;
   private Logger logger = LoggerFactory.getLogger(this.getClass());

   public void init() {
      this._executor = Executors.newFixedThreadPool(2, new ThreadFactroyUtil("http"));
   }

   public void sendGet(String url, String param, Object obj, Method httpCallBack) {
      this._executor.submit(() -> {
         String result = HttpClient.sendGet(url, param);
         if (!Objects.isNull(obj)) {
            if (PlayerPart.class.isAssignableFrom(obj.getClass())) {
               PlayerPart playerPart = (PlayerPart)obj;
               playerPart.getPlayer().pushTask(() -> {
                  try {
                     httpCallBack.invoke(obj, param, result);
                  } catch (Exception e) {
                     this.logger.error("{},http回调{}处理失败:{}", new Object[]{playerPart.getClass().getSimpleName(), httpCallBack.getName(), e.getMessage(), e});
                  }

               });
            } else if (GameMgr.class.isAssignableFrom(obj.getClass())) {
               GameMgr gameMgr = (GameMgr)obj;
               gameMgr.pushTask(() -> {
                  try {
                     httpCallBack.invoke(obj, param, result);
                  } catch (Exception e) {
                     this.logger.error("{},http回调{}处理失败:{}", new Object[]{gameMgr.getClass().getSimpleName(), httpCallBack.getName(), e.getMessage(), e});
                  }

               });
            }
         }

      });
   }

   public void sendPost(String url, String param, Object obj, Method httpCallBack) {
      this._executor.submit(() -> {
         String result = HttpClient.sendPost(url, param);
         if (!Objects.isNull(obj)) {
            if (PlayerPart.class.isAssignableFrom(obj.getClass())) {
               PlayerPart playerPart = (PlayerPart)obj;
               playerPart.getPlayer().pushTask(() -> {
                  try {
                     httpCallBack.invoke(obj, param, result);
                  } catch (Exception e) {
                     this.logger.error("{},http回调{}处理失败:{}", new Object[]{playerPart.getClass().getSimpleName(), httpCallBack.getName(), e.getMessage(), e});
                  }

               });
            } else if (GameMgr.class.isAssignableFrom(obj.getClass())) {
               GameMgr gameMgr = (GameMgr)obj;
               gameMgr.pushTask(() -> {
                  try {
                     httpCallBack.invoke(obj, param, result);
                  } catch (Exception e) {
                     this.logger.error("{},http回调{}处理失败:{}", new Object[]{gameMgr.getClass().getSimpleName(), httpCallBack.getName(), e.getMessage(), e});
                  }

               });
            }
         }

      });
   }
}
