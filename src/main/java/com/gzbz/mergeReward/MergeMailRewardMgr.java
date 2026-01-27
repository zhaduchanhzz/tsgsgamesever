package com.gzbz.mergeReward;

import allMgr.MgrAnno;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.ProFusionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@MgrAnno
public class MergeMailRewardMgr extends GameMgr {
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   GameModelPool gameModelPool;
   public static int MAIN_REWARD = 1;
   public static int MAIN_EARLY_REWARD = 2;
   public static int SLAVE_EARLY_REWARD = 3;

   protected void init() throws Exception {
   }

   public void _mainServerMergeBegin() throws Exception {
   }

   public void _mainServerMergeFinish(HashSet<Integer> slaveServerSet) throws Exception {
      List<GamePlayer> allPlayer = this.worldMgr.getAllPlayer();
      List<MailPart> playerMailPartList = new ArrayList();
      logger.info("从服列表:{}", slaveServerSet);

      for(GamePlayer gamePlayer : allPlayer) {
         if (!slaveServerSet.contains(gamePlayer.getServerId())) {
            MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
            if (null != mailPart && !gamePlayer.isRobot()) {
               playerMailPartList.add(mailPart);
            }
         }
      }

      if (playerMailPartList.isEmpty()) {
         logger.info("主服服务器id{} 没有玩家？？？", this.worldMgr.GAME_SERVER_ID);
      } else {
         StringBuilder serverName = new StringBuilder();
         serverName.append(this.worldMgr.GAME_SERVER_ID + ",");

         for(Integer slaveServerId : slaveServerSet) {
            String serverNameFromRedis = this.worldMgr.getServerNameFromRedis(slaveServerId);
            serverName.append(serverNameFromRedis + ",");
         }

         serverName.deleteCharAt(serverName.length() - 1);
         this.sendMergeRewardMail(playerMailPartList, serverName.toString());
      }
   }

   public void _slaveServerMergeBegin(int mainServerId) throws Exception {
      if (this.worldMgr.GAME_SERVER_ID != mainServerId) {
         List<GamePlayer> allPlayer = this.worldMgr.getAllPlayer();
         List<MailPart> playerMailPartList = new ArrayList();

         for(GamePlayer gamePlayer : allPlayer) {
            MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
            if (null != mailPart && !gamePlayer.isRobot()) {
               playerMailPartList.add(mailPart);
            }
         }

         if (playerMailPartList.isEmpty()) {
            logger.info("从服服务器id{} 没有玩家？？？", this.worldMgr.GAME_SERVER_ID);
         } else {
            String serverName = this.worldMgr.getServerNameFromRedis(mainServerId) + "," + this.worldMgr.GAME_SERVER_ID;
            this.sendMergeRewardMail(playerMailPartList, serverName);
            Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
            TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_MERGE_COM_MAIL_REWARD);
            if (centreAwardMap != null && centreAwardMap.size() > 0) {
               CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
               long mainOpenServerTime = this.worldMgr.getOpenServerTimeFromRedis(mainServerId);
               long salveOpenServerTime = this.worldMgr.getOpenServerTime();
               long diffTime = (salveOpenServerTime - mainOpenServerTime) / 86400000L;
               List<ResourceModel> rewardList = new ArrayList();
               if (diffTime < 0L) {
                  List<ProFusionModel> modelList = this.getProFusionModelByType(SLAVE_EARLY_REWARD);
                  if (null == modelList || modelList.size() <= 0) {
                     return;
                  }

                  rewardList.addAll(((ProFusionModel)modelList.get(0)).getRewards());
               } else {
                  List<ProFusionModel> modelList = this.getProFusionModelByType(MAIN_EARLY_REWARD);
                  if (null == modelList || modelList.size() <= 0) {
                     return;
                  }

                  for(ProFusionModel model : modelList) {
                     if (diffTime >= (long)model.getOpenStartDay() && diffTime <= (long)model.getOpenEndDay()) {
                        rewardList.addAll(model.getRewards());
                        break;
                     }
                  }
               }

               if (rewardList.size() <= 0) {
                  logger.info("合服奖励为空 从服开服天数-主服开服天数={}", diffTime);
               } else {
                  String desc = MessageFormat.format(centreAwardModel.getDesc(), serverName);

                  for(MailPart mailPart : playerMailPartList) {
                     mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), desc, rewardList, 604800000L, 93, 9301);
                  }

               }
            } else {
               logger.info("发送合服邮件失败找不到邮件类型:{}", CentreAwardModel.TYPE_MERGE_COM_MAIL_REWARD);
            }
         }
      }
   }

   public List<ProFusionModel> getProFusionModelByType(int type) {
      List<ProFusionModel> modelList = (List)ApplicationContextProvider.getModelPoolEntity("customProFusion", type);
      if (null == modelList || modelList.size() <= 0) {
         logger.info("ProFusion表未配置type={} 的数据", type);
      }

      return modelList;
   }

   public void sendMergeRewardMail(List<MailPart> playerMailPartList, String serverName) {
      if (playerMailPartList != null && playerMailPartList.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_MERGE_MAIL_REWARD);
         if (centreAwardMap != null && centreAwardMap.size() > 0) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            String desc = MessageFormat.format(centreAwardModel.getDesc(), serverName);

            for(MailPart mailPart : playerMailPartList) {
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), desc, centreAwardModel.getItems(), 604800000L, 93, 9305);
            }

         } else {
            logger.info("发送合服邮件失败找不到邮件类型:{}", CentreAwardModel.TYPE_MERGE_MAIL_REWARD);
         }
      } else {
         logger.info("发送合服邮件失败，玩家数为空");
      }
   }
}
