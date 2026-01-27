package com.gzbz.gamePlayer.mail;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.db.MailDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.gameDefine.CodeDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.log.PlayerLogPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.MailMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MailPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(MailPart.class);
   public static final long WEAK = 604800000L;
   public static final long FOREVER = System.currentTimeMillis();

   public void loginHandle() {
      super.loginHandle();
      MailWorldMgr mailWorldMgr = (MailWorldMgr)ApplicationContextProvider.getContext().getBean(MailWorldMgr.class);
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.mailWorldMaxId <= 0 && !playerExtend.mailWorldId.isEmpty()) {
         for(Integer mailID : playerExtend.mailWorldId) {
            if (mailID > playerExtend.mailWorldMaxId) {
               playerExtend.mailWorldMaxId = mailID;
            }
         }

         this.player.updatePlayerExtend(13);
      }

      mailWorldMgr.pushTaskEx("playerLoginCheckPlayer", new Object[]{this.player, playerExtend.mailWorldMaxId});
   }

   public void logoutHandle() {
      super.logoutHandle();
      Map<Integer, MailDao> mailDaoMap = this.player.<Integer, MailDao>getMap("tb_mail", this.player.getPlayerId());
      this.checkMail(mailDaoMap);
   }

   @MsgHandlerAnno
   public void C2S_MailList_6401(MailMsg.C2S_MailList_6401 msg, String source) {
      this.S2C_MailListData_6402(1);
   }

   public void S2C_MailListData_6402(int type) {
      Map<Integer, MailDao> mailsMap = this.player.<Integer, MailDao>getMap("tb_mail", this.player.getPlayerId());
      Map<Integer, MailDao> tempMap = new HashMap();
      List<MailDao> beyondMails = new ArrayList();
      long currentTime = System.currentTimeMillis();
      int maxCode = 0;

      for(Map.Entry<Integer, MailDao> entry : mailsMap.entrySet()) {
         MailDao mailDao = (MailDao)entry.getValue();
         if (mailDao.code > maxCode) {
            maxCode = mailDao.code;
         }

         if (mailDao.enableTime < currentTime) {
            beyondMails.add(mailDao);
         } else {
            tempMap.put(entry.getKey(), mailDao);
         }
      }

      for(MailDao beyondMail : beyondMails) {
         this.deleteMail(beyondMail.code);
      }

      this.player.sendMsg(this.setMailList(tempMap, type).build());
      this.player.checkUnionCode(CodeDefine.MAIL_CODE, maxCode);
   }

   @MsgHandlerAnno
   public void C2S_ReadMail_6403(MailMsg.C2S_ReadMail_6403 msg, String source) {
      int code = msg.getCode();
      MailDao mailDao = this.getMailByCode(code);
      if (mailDao != null) {
         int result = 1;
         switch (msg.getType()) {
            case READ_MAIL:
               if (mailDao.state == 2 || mailDao.state == 1) {
                  return;
               }

               if (mailDao.items.isEmpty()) {
                  mailDao.state = 2;
               } else {
                  mailDao.state = 1;
               }

               mailDao.updateOp();
               break;
            case TAKE_REWARD:
               if (mailDao.state == 2) {
                  this.player.failure(23002);
                  return;
               }

               if (mailDao.items.isEmpty()) {
                  this.player.failure(23003);
                  return;
               }

               if (!this.player.checkAddResourceItemBagNum(mailDao.items)) {
                  this.logger.info("领取邮件，物品超出背包限制，不能领取");
                  this.player.failure(23001);
                  return;
               }

               LogOperationMgr operationMgr = this.player.getOperationMgr();

               for(ResourceModel model : mailDao.items) {
                  if (model.getType() == 2) {
                     ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", model.getId());
                     if (itemModel != null && itemModel.getSubclass() == 17) {
                        model.setCreateTime(DateUtil.getIntTime(mailDao.creatTime));
                     }
                  }

                  operationMgr.pushTaskEx("addMailLog", new Object[]{this.player, 15, model.getId(), model.getValue(), mailDao.title, mailDao.context, this.player.getPlayerId()});
               }

               String[] prop = LogOperationMgr.toRewardsInfo(mailDao.items);
               operationMgr.addMailNewLog(this.player, 48, prop, mailDao.title, mailDao.context);
               this.player.addResource(mailDao.items, PlayerMsg.ShowType.SHOW_TYPE_COMMON, mailDao.module, mailDao.reason, 0, 0, "");
               mailDao.state = 2;
               mailDao.updateOp();
         }

         MailMsg.S2C_ReadMailResult_6404.Builder builder = MailMsg.S2C_ReadMailResult_6404.newBuilder();
         builder.setResult(result);
         builder.setInfo(this.toMainInfo(mailDao));
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_DelMail_6409(MailMsg.C2S_DelMail_6409 msg, String source) {
      int code = msg.getCode();
      MailDao mailDao = this.getMailByCode(code);
      if (mailDao != null) {
         if (mailDao.state != 2) {
            this.logger.info("邮件状态不对，不能删除");
         } else {
            int type = mailDao.type;
            int result = this.deleteMail(code);
            MailMsg.S2C_DelMailResult_6410.Builder builder = MailMsg.S2C_DelMailResult_6410.newBuilder();
            builder.setResult(result);
            builder.setCode(code);
            builder.setType(type);
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OneKeyTakeMail_6405(MailMsg.C2S_OneKeyTakeMail_6405 msg, String source) {
      Map<Integer, MailDao> mailDaoMap = this.player.<Integer, MailDao>getMap("tb_mail", this.player.getPlayerId());
      if (mailDaoMap != null) {
         int type = msg.getType();
         List<ResourceModel> rewards = new ArrayList();

         for(Map.Entry<Integer, MailDao> entry : mailDaoMap.entrySet()) {
            MailDao mailDao = (MailDao)entry.getValue();
            if (mailDao.state != 2 && mailDao.type == type && mailDao.items.size() > 0) {
               for(ResourceModel item : mailDao.items) {
                  if (item.getType() == 2) {
                     ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", item.getId());
                     if (itemModel != null && itemModel.getSubclass() == 17) {
                        item.setCreateTime(DateUtil.getIntTime(mailDao.creatTime));
                     }
                  }

                  rewards.add(item);
               }
            }
         }

         if (!this.player.checkAddResourceItemBagNum(rewards)) {
            this.logger.info("一键领取邮件，物品超出背包限制，不能领取");
            this.player.failure(23001);
         } else {
            for(Map.Entry<Integer, MailDao> entry : mailDaoMap.entrySet()) {
               MailDao mailDao = (MailDao)entry.getValue();
               if (mailDao.state != 2 && mailDao.type == type && mailDao.items.size() > 0) {
                  this.player.addResource(mailDao.items, PlayerMsg.ShowType.SHOW_TYPE_MAIL_OKE_KEY_TAKE, mailDao.module, mailDao.reason, mailDao.code, 0, "");
               }
            }

            LogOperationMgr operationMgr = this.player.getOperationMgr();

            for(Map.Entry<Integer, MailDao> entry : mailDaoMap.entrySet()) {
               MailDao mailDao = (MailDao)entry.getValue();
               if (mailDao.state != 2 && mailDao.type == type && mailDao.items.size() > 0) {
                  for(ResourceModel model : mailDao.items) {
                     operationMgr.addMailLog(this.player, 15, model.getId(), model.getValue(), mailDao.title, mailDao.context, this.player.getPlayerId());
                  }

                  String[] prop = LogOperationMgr.toRewardsInfo(mailDao.items);
                  operationMgr.addMailNewLog(this.player, 48, prop, mailDao.title, mailDao.context);
               }
            }

            for(Map.Entry<Integer, MailDao> entry : mailDaoMap.entrySet()) {
               MailDao mailDao = (MailDao)entry.getValue();
               if (mailDao.state != 2 && mailDao.type == type && mailDao.items.size() > 0) {
                  mailDao.state = 2;
                  mailDao.updateOp();
               }
            }

            this.player.sendResourceMsg_OneKeyTakeMail();
            this.S2C_MailListData_6402(2);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OneKeyDelMail_6407(MailMsg.C2S_OneKeyDelMail_6407 msg, String source) {
      Map<Integer, MailDao> mailDaoMap = this.player.<Integer, MailDao>getMap("tb_mail", this.player.getPlayerId());
      if (mailDaoMap != null) {
         int type = msg.getType();
         MailMsg.S2C_OneKeyDelMailResult_6408.Builder builder = MailMsg.S2C_OneKeyDelMailResult_6408.newBuilder();
         builder.setType(type);

         for(Map.Entry<Integer, MailDao> integerMailDaoEntry : mailDaoMap.entrySet()) {
            MailDao mailDao = (MailDao)integerMailDaoEntry.getValue();
            if (mailDao.state == 2 && mailDao.type == type) {
               this.deleteMail(mailDao.code);
               builder.addCodes(mailDao.code);
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   public MailMsg.S2C_MailListData_6402.Builder setMailList(Map<Integer, MailDao> mailsMap, int type) {
      MailMsg.S2C_MailListData_6402.Builder builder = MailMsg.S2C_MailListData_6402.newBuilder();
      builder.setType(type);

      for(Map.Entry<Integer, MailDao> entry : mailsMap.entrySet()) {
         builder.addMails(this.toMainInfo((MailDao)entry.getValue()));
      }

      return builder;
   }

   public MailMsg.S2C_AddMailListData_6412.Builder addMailList(Map<Integer, MailDao> mailsMap) {
      MailMsg.S2C_AddMailListData_6412.Builder builder = MailMsg.S2C_AddMailListData_6412.newBuilder();

      for(Map.Entry<Integer, MailDao> entry : mailsMap.entrySet()) {
         builder.addMails(this.toMainInfo((MailDao)entry.getValue()));
      }

      return builder;
   }

   public MailMsg.Mail.Builder toMainInfo(MailDao mailDao) {
      MailMsg.Mail.Builder mailBuilder = MailMsg.Mail.newBuilder();
      mailBuilder.setCode(mailDao.code);
      mailBuilder.setType(mailDao.type);
      mailBuilder.setTitle(mailDao.title);
      mailBuilder.setContext(mailDao.context);
      mailBuilder.setCreatTime(mailDao.creatTime);
      mailBuilder.setEnableTime(mailDao.enableTime);
      mailBuilder.setState(MailMsg.MailState.forNumber(mailDao.state));
      mailBuilder.setCentreAwardId(mailDao.centreAwardId);

      for(ResourceModel item : mailDao.items) {
         CommonMsg.ItemInfo.Builder itemBuilder = CommonMsg.ItemInfo.newBuilder();
         itemBuilder.setType(item.getType());
         itemBuilder.setId(item.getId());
         itemBuilder.setNum(item.getValue());
         mailBuilder.addItems(itemBuilder);
      }

      return mailBuilder;
   }

   @TaskMethod
   public void addMailOfEffectTime(MailDefine.MailType type, String title, String context, List<ResourceModel> items, long effectTime, int module, int reason) {
      long currentTime = System.currentTimeMillis();
      long endTime = 0L;
      if (effectTime > 0L) {
         endTime = currentTime + effectTime;
      }

      this.addMailOfEndTime(type, title, context, items, endTime, module, reason, System.currentTimeMillis(), 0);
   }

   @TaskMethod
   public void addMailOfEffectTimeByCentreAwardId(MailDefine.MailType type, String title, String context, List<ResourceModel> items, long effectTime, int module, int reason, int centreAwardId) {
      long currentTime = System.currentTimeMillis();
      long endTime = 0L;
      if (effectTime > 0L) {
         endTime = currentTime + effectTime;
      }

      this.addMailOfEndTime(type, title, context, items, endTime, module, reason, System.currentTimeMillis(), centreAwardId);
   }

   @TaskMethod
   public void addMailOfEndTime(MailDefine.MailType type, String title, String context, List<ResourceModel> items, long enableTime, int module, int reason, long createTime, int centreAwardId) {
      PlayerPublicDao playerPublicDao = this.player.getPublicDao();
      if (playerPublicDao.logoutTime > 0L && DateUtil.difftimeDay(new Timestamp(playerPublicDao.logoutTime)) >= 15) {
         this.logger.warn("玩家【{}】离线已超过15天,不再添加【{}】邮件", this.player.getPlayerId(), title);
      } else {
         Map<Integer, MailDao> mailDaoMap = this.player.<Integer, MailDao>getMap("tb_mail", this.player.getPlayerId());
         if (!this.player.isLogin()) {
            this.checkMail(mailDaoMap);
         }

         MailDao mailDao = new MailDao();
         mailDao.playerId = this.player.getPlayerId();
         mailDao.code = this.player.getUniqueCode(CodeDefine.MAIL_CODE);
         mailDao.type = type.getId();
         if (title == null) {
            title = "";
         }

         mailDao.title = title;
         if (context == null) {
            context = "";
         }

         mailDao.module = module;
         mailDao.reason = reason;
         mailDao.context = context;
         mailDao.creatTime = createTime;
         mailDao.centreAwardId = centreAwardId;
         long currentTime = System.currentTimeMillis();
         long maxEndTime = currentTime + 1209600000L;
         if (enableTime <= 0L) {
            enableTime = currentTime + 604800000L;
         } else if (enableTime > maxEndTime) {
            enableTime = maxEndTime;
         }

         mailDao.enableTime = enableTime;
         if (items != null) {
            for(ResourceModel item : items) {
               mailDao.items.add(item.clone());
            }
         }

         mailDao.insertOp();
         this.player.insertDao(mailDao);
         if (this.player.isLogin()) {
            Map<Integer, MailDao> mailsMap = new HashMap();
            mailsMap.put(mailDao.code, mailDao);
            this.player.sendMsg(this.addMailList(mailsMap).build());
         }

         PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
         playerLogPart.logMail(mailDao, 1);
         String[] prop = null;
         if (mailDao.items != null && !mailDao.items.isEmpty()) {
            prop = LogOperationMgr.toRewardsInfo(mailDao.items);
         }

         this.player.getOperationMgr().addMailNewLog(this.player, 47, prop, mailDao.title, mailDao.context);
      }
   }

   public int deleteMail(int code) {
      int result = 0;
      MailDao mailDao = this.getMailByCode(code);
      if (mailDao == null) {
         this.logger.warn("删除的邮件不存在");
         return 23000;
      } else {
         this.player.deleteDao(mailDao, true);
         PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
         playerLogPart.logMail(mailDao, -1);
         result = 1;
         String[] prop = null;
         if (mailDao.items != null && !mailDao.items.isEmpty()) {
            prop = LogOperationMgr.toRewardsInfo(mailDao.items);
         }

         this.player.getOperationMgr().addMailNewLog(this.player, 49, prop, mailDao.title, mailDao.context);
         return result;
      }
   }

   public MailDao getMailByCode(int code) {
      Map<Integer, MailDao> map = this.player.<Integer, MailDao>getMap("tb_mail", this.player.getPlayerId());
      return (MailDao)map.get(code);
   }

   public void checkMail(Map<Integer, MailDao> mailDaoMap) {
      if (!mailDaoMap.isEmpty()) {
         TreeMap<Integer, MailDao> treeMap = new TreeMap(mailDaoMap);
         int needNum = treeMap.size() - 200;
         if (needNum > 0) {
            List<Integer> needCodeList = new ArrayList();
            int loop = 0;

            for(Integer code : treeMap.keySet()) {
               if (loop >= needNum) {
                  break;
               }

               needCodeList.add(code);
               ++loop;
            }

            if (!needCodeList.isEmpty()) {
               for(Integer code : needCodeList) {
                  this.deleteMail(code);
               }
            }

         }
      }
   }

   @TaskMethod
   public void mailWorldMgr_addCommonMailExcludeMap(MailDefine.MailType type, String title, String context, List<ResourceModel> items, long enableTime, int module, int reason, long createTime, int id, int centreAwardId) {
      this.addMailOfEndTime(type, title, context, items, enableTime, module, reason, createTime, centreAwardId);
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      playerExtend.mailWorldTime = createTime;
      playerExtend.mailWorldMaxId = id;
      this.player.updatePlayerExtend(13);
   }

   @TaskMethod
   public void mailWorldMgr_addCommonMailExcludeMap_toAll(int id, long createTime, int worldType, String title, String context, List<ResourceModel> items, long enableTime, int module, int reason, int centreAwardId) {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (createTime > this.player.getPlayerDao().birthTime && createTime > playerExtend.mailWorldTime) {
         playerExtend.mailWorldTime = createTime;
         playerExtend.mailWorldMaxId = id;
         this.player.updatePlayerExtend(13);
         MailDefine.MailType type = MailDefine.MailType.getMailType(worldType);
         this.addMailOfEndTime(type, title, context, items, enableTime, module, reason, createTime, centreAwardId);
      }

   }

   public void gmDelAllMail() {
      Map<Integer, MailDao> map = this.player.<Integer, MailDao>getMap("tb_mail", this.player.getPlayerId());
      if (map != null && !map.isEmpty()) {
         this.logger.info("GM删除邮件，玩家={}，数量={}", this.player.getPlayerId(), map.size());

         for(MailDao mailDao : map.values()) {
            this.player.deleteDao(mailDao, false);
         }

         this.player.sendMsg(this.setMailList(new HashMap(), 1).build());
      }

   }
}
