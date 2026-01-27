package com.gzbz.http;

import cn.hutool.core.util.ObjectUtil;
import com.gzbz.db.GameDBPool;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.log.LogMgr;
import com.gzbz.log.RechargeFailLog;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.RechargeModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.recharge.bean.BillExistQueryResult;
import com.gzbz.recharge.bean.RechargeNotifyData;
import com.gzbz.recharge.bean.RechargeReasonEnum;
import com.gzbz.recharge.part.PlayerRechargePart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.spring.ApplicationRunnerImpl;
import com.gzbz.worldMgr.WorldMgr;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.SignUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RechargeController {
   private static final Logger LOGGER = LoggerFactory.getLogger(RechargeController.class);
   @Value("${recharge.appKey}")
   public String rechargeKey;
   @Autowired
   private GameDBPool gameDBPool;
   private static final String INSERT_RECHARGE_SQL = "INSERT INTO tb_recharge(`playerId`,`billNo`,`serverId`,`rechargeId`,`money`,`status`,`extra`,`real`,`rewards`) VALUE(?,?,?,?,?,?,?,?,?)";
   private static final String QUERY_RECHARGE_EXIST_SQL = "SELECT COUNT(1) AS billCount FROM tb_recharge WHERE `playerId` = ? AND `billNo` = ?";

   @GetMapping({"/recharge/notify"})
   public int rechargeNotify(RechargeNotifyData rechargeNotifyData) {
      LOGGER.info("充值请求:{}", rechargeNotifyData);
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      if (ObjectUtil.hasEmpty(new Object[]{rechargeNotifyData.getBillNo(), rechargeNotifyData.getMoney(), rechargeNotifyData.getExtra(), rechargeNotifyData.getSign()})) {
         return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_EMPTY_PARAM, (PlayerPublicDao)null, (RechargeModel)null);
      } else if (!this.checkSign(rechargeNotifyData)) {
         return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_ERROR_SIGN, (PlayerPublicDao)null, (RechargeModel)null);
      } else {
         boolean isIosSh = StringUtils.isEmpty(ApplicationRunnerImpl.mgrName) && StringUtils.isEmpty(ApplicationRunnerImpl.mgrMethod);
         RechargeModel rechargeModel = null;
         PlayerPublicDao playerDao = null;

         try {
            String[] extra = rechargeNotifyData.getExtra().split("\\|");
            if (extra.length != 7) {
               return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_ILLEGAL, playerDao, rechargeModel);
            }

            int platform = Integer.parseInt(extra[0]);
            int serverId = Integer.parseInt(extra[1]);
            String account = extra[2];
            int playerId = Integer.parseInt(extra[3]);
            int rechargeType = Integer.parseInt(extra[4]);
            int goodId = Integer.parseInt(extra[5]);
            GamePlayer gamePlayer = worldMgr.getPlayerById(playerId);
            if (gamePlayer == null) {
               return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_PLAYER_NOT_EXIST, (PlayerPublicDao)null, rechargeModel);
            }

            PlayerPublicDao finalPlayerDao = gamePlayer.getPlayerDao();
            if (!gamePlayer.getAccount().equals(account)) {
               return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_PLAYER_ILLEGAL, finalPlayerDao, rechargeModel);
            }

            if (!worldMgr.getServersSet().contains(serverId)) {
               return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_SERVER, finalPlayerDao, rechargeModel);
            }

            int reason = 1706;
            int status = 1;
            if (isIosSh) {
               if (rechargeNotifyData.getMoney() == null || rechargeNotifyData.getMoney() <= 0) {
                  return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_ILLEGAL, finalPlayerDao, rechargeModel);
               }

               rechargeModel = new RechargeModel();
               rechargeModel.setName("IOS审核直充");
               rechargeModel.setIngots(rechargeNotifyData.getMoney() * 10);
               rechargeModel.setMoney(rechargeNotifyData.getMoney());
            } else if (rechargeType == 90) {
               rechargeModel = new RechargeModel();
               if (rechargeNotifyData.getMoney() == null || rechargeNotifyData.getMoney() <= 0) {
                  return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_ILLEGAL, finalPlayerDao, rechargeModel);
               }

               Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_INGOT_ANY);
               if (null == centreAwardMap || centreAwardMap.isEmpty()) {
                  return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_MODEL_NOT_EXIST, finalPlayerDao, rechargeModel);
               }

               CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
               if (null == centreAwardModel) {
                  return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_MODEL_NOT_EXIST, finalPlayerDao, rechargeModel);
               }

               int ingots = rechargeNotifyData.getMoney();
               int realMoney = ingots % 10 == 0 ? ingots / 10 : ingots / 10 + 1;
               rechargeNotifyData.setMoney(realMoney);
               rechargeModel.setType(rechargeType);
               rechargeModel.setName("任意金额元宝");
               rechargeModel.setIngots(ingots);
               rechargeModel.setMoney(rechargeNotifyData.getMoney());
               rechargeModel.setVipExp(ingots);
            } else if (rechargeType == 91) {
               rechargeModel = new RechargeModel();
               rechargeModel.setIngots(rechargeNotifyData.getMoney());
               rechargeNotifyData.setMoney(0);
               status = 4;
               reason = 1710;
            } else {
               if (rechargeType == 88) {
                  rechargeModel = (RechargeModel)ApplicationContextProvider.getModelPoolEntity("custom_recharge", platform + "-" + rechargeType + "-" + 0);
                  reason = 1709;
               } else {
                  rechargeModel = (RechargeModel)ApplicationContextProvider.getModelPoolEntity("custom_recharge", platform + "-" + rechargeType + "-" + rechargeNotifyData.getMoney());
                  if (rechargeType == 89) {
                     reason = 1709;
                  }
               }

               if (rechargeModel == null) {
                  return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_MODEL_NOT_EXIST, finalPlayerDao, (RechargeModel)null);
               }

               if (rechargeType != 88 && rechargeModel.getMoney() != rechargeNotifyData.getMoney()) {
                  return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_MONEY_NOT_SAME, finalPlayerDao, rechargeModel);
               }

               if (rechargeModel.getType() == 5 || rechargeModel.getType() == 12 || rechargeModel.getType() == 13) {
                  if (goodId <= 0) {
                     return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_GIFT_ID, finalPlayerDao, rechargeModel);
                  }

                  ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", goodId);
                  if (shopLimitModel == null) {
                     return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.RECHARGE_GIFT_INFO_NOT_DEFINE, finalPlayerDao, rechargeModel);
                  }

                  RechargeModel checkRechargeModel = (RechargeModel)ApplicationContextProvider.getModelPoolEntity("rechargePrice", shopLimitModel.getPriceType());
                  if (checkRechargeModel == null) {
                     return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_MODEL_NOT_EXIST, finalPlayerDao, (RechargeModel)null);
                  }

                  if (checkRechargeModel.getMoney() != rechargeNotifyData.getMoney()) {
                     return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_MONEY_NOT_SAME, finalPlayerDao, rechargeModel);
                  }
               }
            }

            RechargeModel finalRechargeModel = rechargeModel.clone();
            finalRechargeModel.setMoney(rechargeNotifyData.getMoney());
            if (this.isBillExist(finalPlayerDao.playerId, rechargeNotifyData.getBillNo())) {
               return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.RECHARGE_ORDER_EXIST, finalPlayerDao, rechargeModel);
            }

            this.createRechargeBill(rechargeNotifyData.getBillNo(), rechargeNotifyData.getExtra(), finalPlayerDao.playerId, serverId, finalRechargeModel, status);
            if (rechargeType == 91) {
               Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_RECHARGE_REBATE);
               if (null == centreAwardMap || centreAwardMap.isEmpty()) {
                  return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_MODEL_NOT_EXIST, finalPlayerDao, (RechargeModel)null);
               }

               CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
               List<ResourceModel> resourceModels = new ArrayList();
               resourceModels.add(new ResourceModel(1, PlayerDefine.PLAYER_GOLD, finalRechargeModel.getIngots()));
               gamePlayer.pushPartTaskEx(MailPart.class, "addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), MessageFormat.format(centreAwardModel.getDesc(), finalRechargeModel.getIngots()), resourceModels, 604800000L, 17, reason});
            } else {
               gamePlayer.pushTask(() -> {
                  PlayerRechargePart playerRechargePart = (PlayerRechargePart)gamePlayer.getMgrPart(PlayerRechargePart.class);
                  playerRechargePart.recharge(rechargeNotifyData.getBillNo(), rechargeNotifyData.getExtra(), finalRechargeModel, goodId, 17, reason, rechargeNotifyData.getData_to_client());
               });
            }
         } catch (Exception e) {
            e.printStackTrace();
            return this.rechargeFail(rechargeNotifyData, RechargeReasonEnum.NOTIFY_ILLEGAL, playerDao, rechargeModel);
         }

         LOGGER.info("订单:{},充值成功", rechargeNotifyData.getBillNo());
         return RechargeReasonEnum.NOTIFY_SUC.getReason();
      }
   }

   public boolean isBillExist(int playerId, String billNo) {
      try {
         BillExistQueryResult billExistQueryResult = new BillExistQueryResult();
         this.gameDBPool.query("SELECT COUNT(1) AS billCount FROM tb_recharge WHERE `playerId` = ? AND `billNo` = ?", billExistQueryResult, new Object[]{playerId, billNo});
         return billExistQueryResult.isExist;
      } catch (Throwable throwable) {
         throwable.printStackTrace();
         return true;
      }
   }

   private void createRechargeBill(String billNo, String extra, int playerId, int serverId, RechargeModel rechargeModel, int status) throws Exception {
      try {
         this.gameDBPool.query("INSERT INTO tb_recharge(`playerId`,`billNo`,`serverId`,`rechargeId`,`money`,`status`,`extra`,`real`,`rewards`) VALUE(?,?,?,?,?,?,?,?,?)", new Object[]{playerId, billNo, serverId, rechargeModel.getId(), rechargeModel.getMoney(), status, extra, 1, ""});
      } catch (Throwable throwable) {
         LOGGER.error("生成充值订单异常,{}", throwable.getMessage(), throwable);
         throw new Exception(throwable);
      }
   }

   private int rechargeFail(RechargeNotifyData rechargeNotifyData, RechargeReasonEnum reason, PlayerPublicDao playerDao, RechargeModel rechargeModel) {
      LOGGER.error("订单:{},{}", rechargeNotifyData.getBillNo(), reason.getDesc());
      RechargeFailLog rechargeFailLog = new RechargeFailLog();
      rechargeFailLog.billNo = rechargeNotifyData.getBillNo();
      rechargeFailLog.extra = rechargeNotifyData.getExtra();
      rechargeFailLog.money = (double)rechargeNotifyData.getMoney();
      rechargeFailLog.reason = reason.getDesc();
      if (playerDao != null) {
         rechargeFailLog.playerId = playerDao.playerId;
         rechargeFailLog.playerName = playerDao.playerName;
         rechargeFailLog.serverId = playerDao.serverId;
      }

      if (rechargeModel != null) {
         rechargeFailLog.platformId = rechargeModel.getPlatformType();
         rechargeFailLog.rechargeId = rechargeModel.getId();
      }

      LogMgr logMgr = (LogMgr)ApplicationContextProvider.getContext().getBean(LogMgr.class);
      logMgr.pushTask(() -> logMgr.addLog(rechargeFailLog));
      return reason.getReason();
   }

   private boolean checkSign(RechargeNotifyData rechargeNotifyData) {
      try {
         Map<String, String> params = new HashMap();

         for(Field field : RechargeNotifyData.class.getDeclaredFields()) {
            if (!field.getName().equals("sign")) {
               field.setAccessible(true);
               Object fieldValue = field.get(rechargeNotifyData);
               if (fieldValue != null) {
                  String fieldStr = fieldValue.toString();
                  if (!StringUtils.isEmpty(fieldStr)) {
                     params.put(field.getName(), URLEncoder.encode(fieldStr, "UTF-8"));
                  }
               }
            }
         }

         String checkSign = SignUtil.sign(params, this.rechargeKey, true);
         if (!checkSign.equals(rechargeNotifyData.getSign())) {
            return false;
         } else {
            return true;
         }
      } catch (Exception e) {
         e.printStackTrace();
         return false;
      }
   }
}
