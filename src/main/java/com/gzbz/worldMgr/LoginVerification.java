package com.gzbz.worldMgr;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.SdkChannelModel;
import com.gzbz.spring.ApplicationContextProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginVerification {
   private static final Logger LOGGER = LoggerFactory.getLogger(LoginVerification.class);

   public boolean loginVerification(String account, String passwad, int channelId, int serverId) {
      LOGGER.info("第三方登录验证，渠道={},account={}，passwad={}", new Object[]{channelId, account, passwad});
      boolean result = false;
      switch (channelId) {
         default:
            result = this.defaultChannel(account, passwad, serverId);
         case 9999:
         case 10000:
            return result;
      }
   }

   public boolean commonChannel(String account, String password, int channel, int serverId) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      SdkChannelModel sdkChannelModel = (SdkChannelModel)gameModelPool.getEntity("sddChannel", channel);
      if (sdkChannelModel == null) {
         LOGGER.info("渠道{}SDK模板为空", channel);
         return false;
      } else {
         String url = sdkChannelModel.getVerUrl();
         if (url.indexOf("?") < 0) {
            url = url + "?";
         }

         String result = HttpUtil.get(url);
         JSONObject jsonObject = JSON.parseObject(result);
         String state = jsonObject.getString("state");
         return "success".equals(state);
      }
   }

   public boolean defaultChannel(String account, String password, int serverId) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer gamePlayer = worldMgr.getGamePlayerByAccount(account, serverId);
      return gamePlayer != null;
   }
}
