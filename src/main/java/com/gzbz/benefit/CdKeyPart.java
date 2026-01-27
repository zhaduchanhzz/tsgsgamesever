package com.gzbz.benefit;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.alibaba.fastjson.JSONObject;
import com.gzbz.db.CdKeyDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.HttpMgr;
import com.gzbz.protobuf.BenefitMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import misc.DateUtil;
import misc.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class CdKeyPart extends PlayerPart {
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   ConfigManager configManager;

   @MsgHandlerAnno
   public void C2S_CdKeyReward_8126(BenefitMsg.C2S_CdKeyReward_8126 msg, String source) {
      this.cardExchange(msg.getCdKey());
   }

   public void cardExchange(String code) {
      if (StringUtils.isEmpty(code)) {
         this.logger.error("兑换失败,激活码为空");
      } else {
         ArrayList<String> shopGoldCodeListConfig = this.getShopGoldCodeListConfig();
         if (shopGoldCodeListConfig.contains(code.toUpperCase())) {
            code = code.toUpperCase();
         }

         PlayerDao playerDao = this.player.getPlayerDao();
         Map<String, String> params = new LinkedHashMap();
         params.put("spid", this.worldMgr.PLATFORM_NAME);
         params.put("server", String.valueOf(this.player.getServerId()));
         params.put("user", this.player.getAccount());
         params.put("role", String.valueOf(this.player.getPlayerId()));
         params.put("level", String.valueOf(playerDao.lv));
         params.put("card", code);
         params.put("time", DateUtil.getIntTime(System.currentTimeMillis()) + "");
         StringBuilder stringBuilder = new StringBuilder();
         params.values().forEach(stringBuilder::append);
         stringBuilder.append(this.worldMgr.GM_APP_KEY);
         params.put("sign", MD5Util.encode(stringBuilder.toString()));
         stringBuilder = new StringBuilder();

         try {
            for(Map.Entry<String, String> entry : params.entrySet()) {
               String k = (String)entry.getKey();
               String v = (String)entry.getValue();
               stringBuilder.append(k).append("=").append(URLEncoder.encode(v, "UTF-8")).append("&");
            }
         } catch (Exception e) {
            e.printStackTrace();
         }

         HttpMgr httpMgr = (HttpMgr)ApplicationContextProvider.getContext().getBean(HttpMgr.class);

         try {
            if (!this.checkExchangeAllow(code)) {
               return;
            }

            httpMgr.sendGet(this.worldMgr.CARD_EXCHANGE_URL, stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString(), this, this.getClass().getMethod("httpCallback", String.class, String.class));
         } catch (NoSuchMethodException var10) {
            this.logger.error("发送http请求失败,找不到http回调方法httpCallback");
         }

      }
   }

   public ArrayList<String> getShopGoldCodeListConfig() {
      String TwGoldgiftStr = this.configManager.getStrByDefault("TwGoldgift", "GOLD1|GOLD2|GOLD3");
      String[] TwGoldgift = TwGoldgiftStr.split("\\|");
      ArrayList<String> shopGoldCodeList = new ArrayList();

      for(String code : TwGoldgift) {
         shopGoldCodeList.add(code.toUpperCase());
      }

      return shopGoldCodeList;
   }

   public boolean checkExchangeAllow(String code) {
      String upperCaseCode = code.toUpperCase();
      Map<String, CdKeyDao> cdKeyDaoMap = this.player.<String, CdKeyDao>getMap("tb_cd_key", this.player.getPlayerId(), 1);
      ArrayList<String> shopGoldCodeListConfig = this.getShopGoldCodeListConfig();
      if (shopGoldCodeListConfig.contains(upperCaseCode)) {
         long lastExchangeTime = 0L;

         for(String cdKey : shopGoldCodeListConfig) {
            CdKeyDao cdKeyDao = (CdKeyDao)cdKeyDaoMap.get(cdKey);
            if (null != cdKeyDao) {
               lastExchangeTime = cdKeyDao.exchangeTime > lastExchangeTime ? cdKeyDao.exchangeTime : lastExchangeTime;
            }
         }

         if (lastExchangeTime > 0L) {
            int nowTime = DateUtil.getIntTime(System.currentTimeMillis());
            int goldchangetime = this.configManager.getIntDefault("Goldchangetime", 1800);
            if ((long)nowTime - lastExchangeTime < (long)goldchangetime) {
               return this.player.failure(73128);
            }
         }
      }

      return true;
   }

   public void httpCallback(String param, String result) {
      String[] paramArr = param.split("&");
      String cdKey = null;

      for(String paramKeyValue : paramArr) {
         String[] paramKeyValueArr = paramKeyValue.split("=");
         if (paramKeyValueArr[0].equals("card")) {
            cdKey = paramKeyValueArr[1];
            break;
         }
      }

      this.logger.info("礼包兑换结果:{}", result);
      if (StringUtils.isEmpty(cdKey)) {
         this.logger.info("礼包兑换失败,礼包码为空");
      } else if (StringUtils.isEmpty(result)) {
         this.sendRewardResult(20006, cdKey);
         this.logger.error("礼包兑换出错,兑换结果为空");
      } else {
         JSONObject jsonObject = JSONObject.parseObject(result);
         Integer ret = jsonObject.getInteger("ret");
         if (ret == null) {
            this.logger.error("礼包兑换出错,兑换消息:{}", jsonObject.getString("msg"));
            this.sendRewardResult(20006, cdKey);
         } else {
            if (ret == 0) {
               Map<String, CdKeyDao> cdKeyDaoMap = this.player.<String, CdKeyDao>getMap("tb_cd_key", this.player.getPlayerId(), 1);
               if (cdKeyDaoMap.containsKey(cdKey)) {
                  CdKeyDao cdKeyDao = (CdKeyDao)cdKeyDaoMap.get(cdKey);
                  ++cdKeyDao.count;
                  cdKeyDao.exchangeTime = (long)DateUtil.getIntTime(System.currentTimeMillis());
                  cdKeyDao.updateOp();
               } else {
                  CdKeyDao cdKeyDao = new CdKeyDao();
                  cdKeyDao.cdKey = cdKey;
                  cdKeyDao.playerId = this.player.getPlayerId();
                  cdKeyDao.type = 1;
                  cdKeyDao.count = 1;
                  cdKeyDao.exchangeTime = (long)DateUtil.getIntTime(System.currentTimeMillis());
                  this.player.insertDao(cdKeyDao);
               }

               this.sendRewardResult(1, cdKey);
               this.sendShopGoldCdKeyTimeMsg();
            } else if (ret == 1) {
               this.sendRewardResult(20011, cdKey);
            } else if (ret == 2) {
               this.sendRewardResult(20012, cdKey);
            } else if (ret == 3) {
               this.sendRewardResult(20013, cdKey);
            } else if (ret == 4) {
               this.sendRewardResult(20014, cdKey);
            } else if (ret == 5) {
               this.sendRewardResult(20015, cdKey);
            } else if (ret == 6) {
               this.sendRewardResult(20016, cdKey);
            } else if (ret == 7) {
               this.sendRewardResult(20017, cdKey);
            } else if (ret == 8) {
               this.sendRewardResult(20018, cdKey);
            } else {
               this.sendRewardResult(20006, cdKey);
            }

         }
      }
   }

   private void sendRewardResult(int code, String cdKey) {
      BenefitMsg.S2C_CdKeyRewardResult_8127.Builder msg = BenefitMsg.S2C_CdKeyRewardResult_8127.newBuilder();
      msg.setResult(code);
      msg.setCdKey(cdKey);
      this.player.sendMsg(msg.build());
   }

   @MsgHandlerAnno
   public void C2S_ShopGoldCdKeyTime_8135(BenefitMsg.C2S_ShopGoldCdKeyTime_8135 msg, String source) {
      this.sendShopGoldCdKeyTimeMsg();
   }

   public void sendShopGoldCdKeyTimeMsg() {
      BenefitMsg.S2C_ShopGoldCdKeyTime_8136.Builder builder = BenefitMsg.S2C_ShopGoldCdKeyTime_8136.newBuilder();
      ArrayList<String> shopGoldCodeList = this.getShopGoldCodeListConfig();
      Map<String, CdKeyDao> cdKeyDaoMap = this.player.<String, CdKeyDao>getMap("tb_cd_key", this.player.getPlayerId(), 1);
      BenefitMsg.ShopGoldCdKey.Builder shopGoldCdKeyBuilder = BenefitMsg.ShopGoldCdKey.newBuilder();
      long lastExchangeTime = 0L;

      for(String cdKey : shopGoldCodeList) {
         CdKeyDao cdKeyDao = (CdKeyDao)cdKeyDaoMap.get(cdKey);
         if (null != cdKeyDao) {
            shopGoldCdKeyBuilder.addExchangeCode(cdKey);
            lastExchangeTime = cdKeyDao.exchangeTime > lastExchangeTime ? cdKeyDao.exchangeTime : lastExchangeTime;
         }
      }

      shopGoldCdKeyBuilder.setLastExchangeTime(lastExchangeTime);
      builder.setShopGoldCdKey(shopGoldCdKeyBuilder);
      this.player.sendMsg(builder.build());
   }
}
