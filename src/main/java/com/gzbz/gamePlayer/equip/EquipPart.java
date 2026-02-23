package com.gzbz.gamePlayer.equip;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.EquipCompoundLogDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.gameDefine.CodeDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerBag.EquipItem;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gamePlayer.playerBag.WarFlag;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.EquipCompoundModel;
import com.gzbz.model.EquipEnchantHotModel;
import com.gzbz.model.EquipExtraHotModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.ItemModel;
import com.gzbz.model.WarFlagLvupCostModel;
import com.gzbz.model.WarFlagModel;
import com.gzbz.model.WarriorSignetCompoundModel;
import com.gzbz.model.WarriorSignetModel;
import com.gzbz.model.WarriorSignetPropertyLibModel;
import com.gzbz.model.WarriorSignetPropertyModel;
import com.gzbz.model.WarriorSignetSkillLibModel;
import com.gzbz.model.WarriorSignetSkillModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.EquipMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.MapUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class EquipPart extends PlayerPart {
   @Autowired
   ConfigManager configManager;
   private Logger logger = LoggerFactory.getLogger(this.getClass());
   private static final int RESULT_SUCESS = 1;
   private static final int RESULT_FAIL = 2;
   private static final int OPERATE_PREVIEW = 1;
   private static final int OPERATE_SUBMIT = 2;
   private static final int LOG_MAX_NUM = 10;
   private static final String WARRIOR_SIGNET_TRACE = "warriorSignetTrace";
   private static final String WARRIOR_EXCHANGE_ID = "warriorExchangeId";
   private static final String WARRIOR_EXCHANGE_COST = "warriorExchangeCost";
   private static final int REFINE_TYPE_1 = 1;
   private static final int REFINE_TYPE_2 = 2;
   private static final int REFINE_TYPE_3 = 3;

   @MsgHandlerAnno
   public void equipCompound(EquipMsg.C2S_EquipCompound_7101 msg, String channelId) {
      int compoundId = msg.getCompoundId();
      int num = msg.getNum();
      EquipMsg.S2C_EquipCompound_7102.Builder builder = EquipMsg.S2C_EquipCompound_7102.newBuilder();
      EquipCompoundModel composeModel = (EquipCompoundModel)this.player.getGameModelPool().getEntity("equipCompound", compoundId);
      if (composeModel == null) {
         this.player.sendMsg(builder.setResult(2).build());
         this.player.failure(6);
      } else if (!ResourceModel.checkTotalNumError(composeModel.getNeedNum(), num)) {
         if (!this.player.checkResourceNum(composeModel.getNeedType(), composeModel.getNeedId(), composeModel.getNeedNum() * num)) {
            this.player.sendMsg(builder.setResult(2).build());
            this.player.failure(12000);
         } else if (!ResourceModel.checkTotalNumError(composeModel.getCostNum(), num)) {
            if (!this.player.checkResourceNum(composeModel.getCostType(), composeModel.getCostId(), composeModel.getCostNum() * num)) {
               this.player.failure(12000);
            } else {
               List<ResourceModel> costList = new ArrayList();
               costList.add(new ResourceModel(composeModel.getNeedType(), composeModel.getNeedId(), num * composeModel.getNeedNum()));
               costList.add(new ResourceModel(composeModel.getCostType(), composeModel.getCostId(), num * composeModel.getCostNum()));
               this.player.delResource((List)costList, 12, 1201, compoundId, 0, String.valueOf(this.player.getPlayerId()));
               List<ResourceModel> obtainList = new ArrayList();
               obtainList.add(new ResourceModel(composeModel.getRewardType(), composeModel.getRewardId(), num * composeModel.getRewardNum()));
               this.player.addResource(obtainList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1201, compoundId, 0, String.valueOf(this.player.getPlayerId()));
               this.recodeCompound(costList, obtainList);
               this.player.sendMsg(builder.setResult(1).build());
               this.player.triggerTask(516, 0, (long)num, 1);
               ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", composeModel.getRewardId());
               if (itemModel != null) {
                  this.player.triggerTask(604, itemModel.getQuality(), (long)num, 3);
               }

            }
         }
      }
   }

   @MsgHandlerAnno
   public void equipCompoundQuick(EquipMsg.C2S_EquipCompoundQuick_7103 msg, String channelId) {
      int compoundId = msg.getCompoundId();
      int operateType = msg.getOperateType();
      EquipCompoundModel composeModel = (EquipCompoundModel)this.player.getGameModelPool().getEntity("equipCompound", compoundId);
      if (composeModel == null) {
         this.player.failure(6);
      } else {
         int startId = -1;

         while(composeModel != null && startId == -1) {
            if (this.player.getResourceNum(composeModel.getNeedType(), composeModel.getNeedId()) >= (long)composeModel.getNeedNum() && this.player.getResourceNum(composeModel.getCostType(), composeModel.getCostId()) >= (long)composeModel.getCostNum()) {
               startId = composeModel.getId();
            } else {
               composeModel = (EquipCompoundModel)this.player.getGameModelPool().getEntity("equipCompound", composeModel.getNextId());
            }
         }

         if (startId == -1) {
            this.player.failure(12000);
         } else {
            Map<String, Long> itemMap = new HashMap();
            Map<String, Long> costMap = new HashMap();
            int totalComposeNum = 0;
            int extraNum = 0;

            for(EquipCompoundModel var20 = (EquipCompoundModel)this.player.getGameModelPool().getEntity("equipCompound", startId); var20 != null; var20 = (EquipCompoundModel)this.player.getGameModelPool().getEntity("equipCompound", var20.getNextId())) {
               long needNum_own = this.player.getResourceNum(var20.getNeedType(), var20.getNeedId());
               long costNum_own = this.player.getResourceNum(var20.getCostType(), var20.getCostId());
               long offsetCost = (Long)MapUtil.getOrDefault(costMap, var20.getCostType() + "_" + var20.getCostId(), 0L);
               if (needNum_own + (long)extraNum >= (long)var20.getNeedNum() && costNum_own - offsetCost >= (long)var20.getCostNum()) {
                  extraNum = (int)Math.min((needNum_own + (long)extraNum) / (long)var20.getNeedNum(), (costNum_own - offsetCost) / (long)var20.getCostNum());
                  String key = var20.getNeedType() + "_" + var20.getNeedId();
                  long needOld = (Long)MapUtil.computeIfAbsent(itemMap, key, 0L);
                  itemMap.put(key, needOld - (long)(var20.getNeedNum() * extraNum));
                  key = var20.getRewardType() + "_" + var20.getRewardId();
                  needOld = (Long)MapUtil.computeIfAbsent(itemMap, key, 0L);
                  itemMap.put(key, needOld + (long)(var20.getRewardNum() * extraNum));
                  key = var20.getCostType() + "_" + var20.getCostId();
                  needOld = (Long)MapUtil.computeIfAbsent(costMap, key, 0L);
                  costMap.put(key, needOld + (long)(var20.getCostNum() * extraNum));
               } else {
                  extraNum = 0;
               }

               totalComposeNum += extraNum;
            }

            List<ResourceModel> costList = new ArrayList();
            List<ResourceModel> obtainList = new ArrayList();

            for(Map.Entry<String, Long> entry : itemMap.entrySet()) {
               String[] str = ((String)entry.getKey()).split("_");
               long value = (Long)entry.getValue();
               if (value > 0L) {
                  obtainList.add(new ResourceModel(Integer.parseInt(str[0]), Integer.parseInt(str[1]), (int)value));
               } else if (value < 0L) {
                  costList.add(new ResourceModel(Integer.parseInt(str[0]), Integer.parseInt(str[1]), (int)Math.abs(value)));
               }
            }

            for(Map.Entry<String, Long> entry : costMap.entrySet()) {
               String[] str = ((String)entry.getKey()).split("_");
               costList.add(new ResourceModel(Integer.parseInt(str[0]), Integer.parseInt(str[1]), (int)Math.abs((Long)entry.getValue())));
            }

            EquipMsg.S2C_EquipCompoundQuick_7104.Builder builder = EquipMsg.S2C_EquipCompoundQuick_7104.newBuilder();
            builder.setCompoundId(compoundId);
            builder.setOperateType(operateType);
            if (operateType == 1) {
               for(ResourceModel resourceModel : costList) {
                  builder.addCost(resourceModel.builder());
               }

               for(ResourceModel resourceModel : obtainList) {
                  builder.addObtain(resourceModel.builder());
               }
            } else if (operateType == 2) {
               this.player.delResource((List)costList, 12, 1201, 0, 0, "quick" + compoundId);
               this.player.addResource(obtainList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1201, 0, 0, "quick" + compoundId);

               for(ResourceModel resourceModel : obtainList) {
                  ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", resourceModel.getId());
                  if (itemModel != null) {
                     this.player.triggerTask(604, itemModel.getQuality(), (long)resourceModel.getValue(), 3);
                  }
               }

               this.recodeCompound(costList, obtainList);
               this.player.triggerTask(516, 0, (long)totalComposeNum, 1);
            }

            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void msgGetCompoundLog(EquipMsg.C2S_GetCompoundLog_7105 msg, String channelId) {
      EquipMsg.S2C_GetCompoundLog_7106.Builder builder = EquipMsg.S2C_GetCompoundLog_7106.newBuilder();

      for(EquipCompoundLogDao logDao : new ArrayList<EquipCompoundLogDao>(this.player.getList("tb_equip_compound_log", this.player.getPlayerId()))) {
         EquipMsg.LogInfo.Builder logInfo = EquipMsg.LogInfo.newBuilder();

         for(ResourceModel resourceModel : logDao.obtain) {
            logInfo.addObtain(resourceModel.builder());
         }

         int copper = 0;

         for(ResourceModel resourceModel : logDao.cost) {
            if (resourceModel.getType() == 1 && resourceModel.getId() == PlayerDefine.PLAYER_COPPER) {
               copper += resourceModel.getValue();
            }
         }

         logInfo.setCopper(copper);
         logInfo.setTime((int)(logDao.createTime / 1000L));
         builder.addLogInfo(logInfo);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_NewWarriorSignetCompound_7141(EquipMsg.C2S_NewWarriorSignetCompound_7141 msg, String channelId) {
      List<Integer> warriorCodes = msg.getWarriorsList();
      List<Integer> lockPropertyIndex = msg.getLockPropertyIndexList();
      List<Integer> lockSkillIndex = msg.getLockSkillIndexList();
      List<Integer> codeList = new ArrayList();

      for(Integer warriorCode : warriorCodes) {
         if (codeList.contains(warriorCode)) {
            this.logger.error("玩家={}，合成将印code有重复={},List={}", new Object[]{this.player.getPlayerId(), warriorCode, codeList});
            return;
         }

         codeList.add(warriorCode);
      }

      if (warriorCodes.size() < 2) {
         this.player.failure(12002);
      } else {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         int useNum = warriorCodes.size();
         ItemBase compoundtemBase = null;

         for(int code : warriorCodes) {
            ItemBase tempItem = itemBagPart.getItemByCode(code);
            if (tempItem == null) {
               this.logger.info("将印不存在，CODE={}", code);
               this.player.failure(5);
               return;
            }

            if (compoundtemBase == null) {
               compoundtemBase = tempItem;
            } else if (compoundtemBase.id != tempItem.id) {
               this.logger.info("被合成将印ID不一样，将印，code={}，ID={}，被合将印code={}，id={}", new Object[]{compoundtemBase.code, compoundtemBase.id, tempItem.code, tempItem.id});
               this.player.failure(12003);
               return;
            }
         }

         GameModelPool gameModelPool = this.player.getGameModelPool();
         WarriorSignetCompoundModel compoundModel = (WarriorSignetCompoundModel)gameModelPool.getEntity("warriorSignetCompound", compoundtemBase.id);
         if (compoundModel == null) {
            this.player.failure(6);
         } else {
            boolean isHaveMain = false;
            int main = -1;
            WarriorSignet mainSignet = null;
            List<ResourceModel> totalNeedList = new ArrayList();
            Map<Integer, Integer> lockSkillMap = new HashMap();
            Map<Integer, PropertyModel> lockPropertyMap = new HashMap();
            ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
            if (warriorCodes.size() == 5) {
               main = (Integer)warriorCodes.get(msg.getMainIndex());
               ItemBase mainItem = itemBagDao.getItemByCode(main);
               if (mainItem == null) {
                  this.logger.info("主将印不存在，{}", main);
                  return;
               }

               if (!(mainItem instanceof WarriorSignet)) {
                  this.logger.info("物品不是将印，CODE={}", main);
                  return;
               }

               mainSignet = (WarriorSignet)mainItem;

               for(Integer skillIndex : lockSkillIndex) {
                  int index = skillIndex - 1;
                  if (mainSignet.skills.get(index) == null) {
                     this.logger.info("锁定将印技能位置和将印实际位置不匹配,锁定位置={}，将印技能数={}", index, mainSignet.skills.size());
                     return;
                  }

                  lockSkillMap.put(index, mainSignet.skills.get(index));
               }

               WarriorSignetModel warriorSignetModel = (WarriorSignetModel)this.player.getGameModelPool().getEntity("warriorSignet", mainSignet.id);
               if (lockSkillIndex.size() > 0) {
                  for(Integer skillIndex : lockSkillIndex) {
                     if (warriorSignetModel.getSkillComLock().get(skillIndex) == null) {
                        this.logger.info("将印合成单技能锁定消耗配置错误，index={}", skillIndex);
                        return;
                     }

                     ResourceModel.addResourceToList(totalNeedList, (ResourceModel)warriorSignetModel.getSkillComLock().get(skillIndex));
                  }
               }

               for(Integer propertyIndex : lockPropertyIndex) {
                  int index = propertyIndex - 1;
                  if (mainSignet.properties.get(index) == null) {
                     this.logger.info("锁定将印属性位置和将印实际位置不匹配,锁定位置={}，将印技能数={}", index, mainSignet.properties.size());
                     return;
                  }

                  lockPropertyMap.put(index, ((PropertyModel)mainSignet.properties.get(index)).clone());
               }

               if (lockPropertyIndex.size() > 0) {
                  for(Integer propertyIndex : lockPropertyIndex) {
                     if (warriorSignetModel.getPropertylock().get(propertyIndex) == null) {
                        this.logger.info("将印合成属性锁定消耗配置错误");
                        return;
                     }

                     totalNeedList.add(warriorSignetModel.getPropertylock().get(propertyIndex));
                  }
               }
            }

            int costNum = warriorCodes.size() - 1;

            for(ResourceModel resourceModel : compoundModel.getCost()) {
               ResourceModel.addResourceToList(totalNeedList, new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * costNum));
            }

            if (!this.player.checkResourceNum(totalNeedList)) {
               this.player.failure(12000);
            } else {
               int rate = 0;

               for(KeyValFun fun : compoundModel.getRate()) {
                  if (fun.getKey() == useNum) {
                     rate = fun.getVal();
                     break;
                  }
               }

               if (rate == 0) {
                  this.logger.info("魂印合成的概率出错");
                  this.player.failure(6);
               } else {
                  for(int code : warriorCodes) {
                     itemBagPart.deleteItemByCode(code, 1, 12, 1202, compoundtemBase.id, lockSkillIndex.size(), String.valueOf(this.player.getPlayerId()));
                  }

                  this.player.senditemUpdateMsg();
                  this.player.delResource((List)totalNeedList, 12, 1202, 0, 0, "");
                  ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", compoundModel.getTargetWarrior());
                  int idx = compoundModel.getRate().size() - 1;
                  int random = RandomUtil.randInt(1, ((KeyValFun)compoundModel.getRate().get(idx)).getVal());
                  int addTrace = 0;
                  boolean isSuccess = false;
                  if (random <= rate) {
                     isSuccess = true;
                     WarriorSignet tempWarriorSignet = new WarriorSignet();
                     tempWarriorSignet.initByCompound(itemModel, lockPropertyMap, lockSkillMap, this.player);
                     WarriorSignet newWarriorSignet = itemBagPart.addWarriorSignet(tempWarriorSignet, 12, 1202, 0, 0, "");
                     itemBagDao.updateOp();
                     this.player.additemUpdateBuilder(newWarriorSignet);
                     this.player.senditemUpdateMsg();
                     this.player.addResourceMsg(newWarriorSignet);
                     this.player.sendResourceMsg();
                     this.player.addResource(compoundModel.getSuccessItem(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 12, 1202, 0, 0, "success");
                     this.player.triggerTask(210, itemModel.getQuality(), 1L, 3);
                     this.player.triggerTask(321, itemModel.getQuality(), 1L, 3);
                     GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                     giftPart.triggerTimeLimitGift(19, itemModel.getQuality());
                     this.player.getOperationMgr().addExtraLog(this.player, 127, itemModel.getQuality() + "", "", compoundModel.getQuality() + "&" + warriorCodes.size());
                  } else {
                     List<ResourceModel> defeatItem = new ArrayList();

                     for(ResourceModel resourceModel : compoundModel.getDefeatItem()) {
                        ResourceModel.addResourceToList(defeatItem, new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * useNum));
                     }

                     addTrace = this.configManager.getIntDefault("warriorSignetTrace", 10);
                     ResourceModel.addResourceToList(defeatItem, new ResourceModel(1, PlayerDefine.PLAYER_WARRIOR_SIGNET_TRACE, addTrace));
                     this.player.addResource(defeatItem, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1202, 0, 0, "lose");
                     GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                     giftPart.triggerTimeLimitGift(18, itemModel.getQuality());
                     this.player.getOperationMgr().addExtraLog(this.player, 127, "", addTrace + "", compoundModel.getQuality() + "&" + warriorCodes.size());
                  }

                  this.player.triggerTask(209, 0, 1L, 1);
                  EquipMsg.S2C_NewWarriorSignetCompound_7142.Builder builder = EquipMsg.S2C_NewWarriorSignetCompound_7142.newBuilder();
                  builder.setSuccess(isSuccess);
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WarriorSignetRefine_7143(EquipMsg.C2S_WarriorSignetRefine_7143 msg, String channelId) {
      int main = msg.getMain();
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase mainItem = itemBagDao.getItemByCode(msg.getMain());
      if (mainItem == null) {
         this.logger.info("主将印不存在，{}", main);
      } else if (!(mainItem instanceof WarriorSignet)) {
         this.logger.info("物品不是将印，CODE={}", msg.getMain());
      } else {
         WarriorSignet mainSignet = (WarriorSignet)mainItem;
         WarriorSignetModel warriorSignetModel = (WarriorSignetModel)this.player.getGameModelPool().getEntity("warriorSignet", mainSignet.id);
         if (warriorSignetModel.getUpGradeType() != 2) {
            this.logger.info("不是大将军印，id={}", mainSignet.id);
         } else if (!this.player.checkResourceNum(warriorSignetModel.getRefineCost())) {
            this.logger.info("大将军印精炼材料不够，code={}", mainSignet.code);
         } else {
            int newItemId = 0;
            switch (mainSignet.id) {
               case 4050:
                  newItemId = 4051;
                  break;
               case 4051:
                  newItemId = 4052;
                  break;
               case 4052:
                  newItemId = 4060;
            }

            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", newItemId);
            if (itemModel == null) {
               this.logger.info("将印模板为空，id={}", newItemId);
            } else {
               boolean result = mainSignet.refineWarriorSignet(newItemId);
               if (result) {
                  this.player.delResource((List)warriorSignetModel.getRefineCost(), 12, 1209, 0, 0, "");
                  itemBagDao.updateOp();
                  this.player.additemUpdateBuilder(mainSignet);
                  this.player.senditemUpdateMsg();
                  this.player.triggerTask(210, itemModel.getQuality(), 1L, 3);
                  GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                  giftPart.triggerTimeLimitGift(21, 1);
               }

               EquipMsg.S2C_WarriorSignetRefine_7144.Builder builder = EquipMsg.S2C_WarriorSignetRefine_7144.newBuilder();
               builder.setSuccess(result);
               builder.setMain(main);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WarriorSignetRefineHero_7145(EquipMsg.C2S_WarriorSignetRefineHero_7145 msg, String channelId) {
      int code = msg.getHeroCode();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(code);
      if (heroDao == null) {
         this.logger.info("将印精炼英雄不存在，code={}", code);
      } else if (!heroDao.warriors.containsKey(msg.getPosition().getNumber())) {
         this.logger.info("英雄该位置不存在将印，code={},position={}", code, msg.getPosition());
      } else {
         WarriorSignet mainSignet = (WarriorSignet)heroDao.warriors.get(msg.getPosition().getNumber());
         if (mainSignet == null) {
            this.logger.info("主将印不存在，{}", msg.getPosition().getNumber());
         } else {
            WarriorSignetModel warriorSignetModel = (WarriorSignetModel)this.player.getGameModelPool().getEntity("warriorSignet", mainSignet.id);
            if (warriorSignetModel.getUpGradeType() != 2) {
               this.logger.info("不是大将军印，id={}", mainSignet.id);
            } else if (!this.player.checkResourceNum(warriorSignetModel.getRefineCost())) {
               this.logger.info("大将军印精炼材料不够，code={}", mainSignet.code);
            } else {
               int newItemId = 0;
               switch (mainSignet.id) {
                  case 4050:
                     newItemId = 4051;
                     break;
                  case 4051:
                     newItemId = 4052;
                     break;
                  case 4052:
                     newItemId = 4060;
               }

               ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", newItemId);
               if (itemModel == null) {
                  this.logger.info("将印模板为空，id={}", newItemId);
               } else {
                  boolean result = mainSignet.refineWarriorSignet(newItemId);
                  if (result) {
                     this.player.delResource((List)warriorSignetModel.getRefineCost(), 12, 1209, 0, 0, "");
                     heroDao.warriors.put(msg.getPosition().getNumber(), mainSignet);
                     heroDao.updateOp();
                     heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WARRIORSIGNET, heroDao);
                     this.player.triggerTask(210, itemModel.getQuality(), 1L, 3);
                     GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                     giftPart.triggerTimeLimitGift(21, 1);
                  }

                  EquipMsg.S2C_WarriorSignetRefineHero_7146.Builder builder = EquipMsg.S2C_WarriorSignetRefineHero_7146.newBuilder();
                  builder.setSuccess(result);
                  builder.setHeroCode(msg.getHeroCode());
                  builder.setPosition(msg.getPosition());
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WarriorSignetCustomized_7147(EquipMsg.C2S_WarriorSignetCustomized_7147 msg, String channelId) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase mainItem = itemBagDao.getItemByCode(msg.getItemCode());
      if (mainItem == null) {
         this.logger.info("主将印不存在，{}", msg.getItemCode());
      } else if (!(mainItem instanceof WarriorSignet)) {
         this.logger.info("物品不是将印，CODE={}", msg.getItemCode());
      } else {
         WarriorSignet mainSignet = (WarriorSignet)mainItem;
         WarriorSignetModel warriorSignetModel = (WarriorSignetModel)this.player.getGameModelPool().getEntity("warriorSignet", mainSignet.id);
         if (warriorSignetModel != null) {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", mainSignet.id);
            if (itemModel != null) {
               if (!msg.getPropertyIdsList().isEmpty() && msg.getPropertyIdsList().size() >= 3) {
                  int customPropertyNum = 0;
                  int customSkillNum = 0;
                  List<PropertyModel> customiedPropertyList = new ArrayList();
                  List<ResourceModel> needList = new ArrayList();
                  Map<Integer, PropertyModel> propertyMap = new HashMap();
                  List<PropertyModel> otherPropertyTypeList = new ArrayList();

                  for(int i = 0; i < 3; ++i) {
                     int propertyId = (Integer)msg.getPropertyIdsList().get(i);
                     if (propertyId <= 0) {
                        if (mainSignet.properties.size() > i) {
                           otherPropertyTypeList.add(((PropertyModel)mainSignet.properties.get(i)).clone());
                        }
                     } else {
                        if (i >= mainSignet.properties.size()) {
                           return;
                        }

                        WarriorSignetPropertyLibModel libModel = (WarriorSignetPropertyLibModel)this.player.getGameModelPool().getEntity("warriorSignetPropertyLib", propertyId);
                        if (libModel == null) {
                           this.logger.error("玩家={}，定制属性错误，输入model为空，ID={}", this.player.getPlayerId(), propertyId);
                           return;
                        }

                        WarriorSignetPropertyModel propertyModel = (WarriorSignetPropertyModel)this.player.getGameModelPool().getEntity("warriorSignetProperty", libModel.getPropertyId());
                        if (propertyModel == null) {
                           return;
                        }

                        if ((Integer)warriorSignetModel.getPropertyLib().get(i) != libModel.getGroupId()) {
                           this.logger.error("玩家={}，定制属性组错误，选择属性ID={}，将印可行属性组={}", new Object[]{this.player.getPlayerId(), propertyId, libModel.getGroupId()});
                           return;
                        }

                        if (warriorSignetModel.getCustomizedId() <= 0) {
                           return;
                        }

                        for(PropertyModel model : customiedPropertyList) {
                           if (propertyModel.getPropertyId() == model.getType() && propertyModel.getPropertyWay() == model.getWay()) {
                              this.logger.error("定制属性中有相同类型属性，类型={}，加成方式={}", model.getType(), model.getWay());
                              return;
                           }
                        }

                        PropertyModel customizedProperty = new PropertyModel(propertyModel.getPropertyId(), propertyModel.getPropertyWay(), (long)propertyModel.getPropertyValue());
                        customiedPropertyList.add(customizedProperty);
                        ResourceModel.addResourceToList(needList, new ResourceModel(2, warriorSignetModel.getCustomizedId(), 1));
                        propertyMap.put(i, customizedProperty);
                        ++customPropertyNum;
                     }
                  }

                  if (!msg.getSkillIdsList().isEmpty() && msg.getSkillIdsList().size() >= 2) {
                     List<Integer> customziedBaseSkillList = new ArrayList();
                     Map<Integer, Integer> skillMap = new HashMap();
                     List<Integer> otherBaseSkillIdList = new ArrayList();

                     for(int i = 0; i < 2; ++i) {
                        int skillLibId = (Integer)msg.getSkillIdsList().get(i);
                        if (skillLibId > 0) {
                           WarriorSignetSkillLibModel libModel = (WarriorSignetSkillLibModel)this.player.getGameModelPool().getEntity("warriorSignetSkillLib", skillLibId);
                           if (libModel == null) {
                              return;
                           }

                           WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", libModel.getSkillId());
                           if (skillModel == null) {
                              this.logger.error("玩家={}，定制技能错误，输入model为空，ID={}", this.player.getPlayerId(), libModel.getSkillId());
                              return;
                           }

                           if (customziedBaseSkillList.contains(skillModel.getBaseSkill())) {
                              this.logger.error("定制将印有重复base的技能，技能ID={}", skillModel.getId());
                              return;
                           }

                           customziedBaseSkillList.add(skillModel.getBaseSkill());
                           int skillGroup = 0;
                           if (i == 0) {
                              skillGroup = warriorSignetModel.getSkill2_1();
                           } else {
                              skillGroup = warriorSignetModel.getSkill2_2();
                           }

                           List<WarriorSignetSkillLibModel> libModelList = (List)this.player.getGameModelPool().getEntity("customWarriorSignetSkillLib", skillGroup);
                           if (libModelList == null || libModelList.isEmpty()) {
                              return;
                           }

                           boolean isHaveSkill = false;

                           for(WarriorSignetSkillLibModel warriorSignetSkillLibModel : libModelList) {
                              if (warriorSignetSkillLibModel.getSkillId() == libModel.getSkillId()) {
                                 isHaveSkill = true;
                                 break;
                              }
                           }

                           if (!isHaveSkill) {
                              this.logger.error("将印={}，技能位置={},技能组中没有技能={}", new Object[]{mainSignet.id, i, libModel.getSkillId()});
                              return;
                           }

                           if (warriorSignetModel.getCustomizedId() <= 0) {
                              return;
                           }

                           ResourceModel.addResourceToList(needList, new ResourceModel(2, warriorSignetModel.getCustomizedId(), 1));
                           skillMap.put(i, libModel.getSkillId());
                           ++customSkillNum;
                        } else if (mainSignet.skills.size() > i) {
                           WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", mainSignet.skills.get(i));
                           if (skillModel != null) {
                              otherBaseSkillIdList.add(skillModel.getBaseSkill());
                           }
                        }
                     }

                     if (msg.hasType() && msg.getType() == 1) {
                        int tempSkillNum = 0;

                        for(KeyValFun keyValFun : warriorSignetModel.getSkillNum()) {
                           tempSkillNum = Math.max(tempSkillNum, keyValFun.getKey());
                        }

                        if (tempSkillNum != customPropertyNum || warriorSignetModel.getPropertyLib().size() != customSkillNum) {
                           this.logger.info("需要完全定制属性和技能");
                           return;
                        }

                        needList.clear();
                        ResourceModel.addResourceToList(needList, new ResourceModel(2, warriorSignetModel.getCustomizedWholeId(), 1));
                     }

                     if (!needList.isEmpty()) {
                        if (this.player.checkResourceNum(needList)) {
                           WarriorSignet newWarriorSignet = new WarriorSignet();
                           newWarriorSignet.initByRecast(false, itemModel, skillMap, propertyMap, this.player, otherPropertyTypeList, otherBaseSkillIdList);
                           this.player.delResource((List)needList, 12, 1208, mainItem.id, 0, mainItem.id + "");
                           String oldPropertyStr = "";
                           String oldSkillStr = "";

                           for(PropertyModel property : mainSignet.properties) {
                              oldPropertyStr = oldPropertyStr + property.getType() + "_" + property.getWay() + "_" + property.getValue() + ",";
                           }

                           for(Integer skill : mainSignet.skills) {
                              oldSkillStr = oldSkillStr + skill + ",";
                           }

                           mainSignet.skills.clear();
                           mainSignet.skills.addAll(newWarriorSignet.skills);
                           mainSignet.properties.clear();
                           mainSignet.properties.addAll(newWarriorSignet.properties);
                           itemBagDao.updateOp();
                           this.player.additemUpdateBuilder(mainSignet);
                           this.player.senditemUpdateMsg();
                           EquipMsg.S2C_WarriorSignetCustomized_7148.Builder builder = EquipMsg.S2C_WarriorSignetCustomized_7148.newBuilder();
                           builder.setSuccess(true);
                           builder.setItemCode(msg.getItemCode());
                           this.player.sendMsg(builder.build());
                           String propertyStr = "";
                           String skillStr = "";

                           for(PropertyModel property : mainSignet.properties) {
                              propertyStr = propertyStr + property.getType() + "_" + property.getWay() + "_" + property.getValue() + ",";
                           }

                           for(Integer skill : mainSignet.skills) {
                              skillStr = skillStr + skill + ",";
                           }

                           String customizedProperty = "";

                           for(Integer id : msg.getPropertyIdsList()) {
                              customizedProperty = customizedProperty + id + ",";
                           }

                           String customizedSkill = "";

                           for(Integer id : msg.getSkillIdsList()) {
                              customizedSkill = customizedSkill + id + ",";
                           }

                           int num = 0;
                           int id = 0;

                           for(ResourceModel resourceModel : needList) {
                              num += resourceModel.getValue();
                              id = resourceModel.getId();
                           }

                           this.player.getOperationMgr().addExtraLog(this.player, 210, itemModel.getQuality() + "", oldPropertyStr, oldSkillStr, customizedProperty, customizedSkill, propertyStr, skillStr, id + "", num + "");
                        }
                     }
                  } else {
                     this.logger.error("玩家={}，定制将印技能输入错误，ID={}，传入技能={}", new Object[]{this.player.getPlayerId(), warriorSignetModel.getId(), msg.getSkillIdsList()});
                  }
               } else {
                  this.logger.error("玩家={}，定制将印属性输入错误，ID={}，传入属性={}，model属性={}", new Object[]{this.player.getPlayerId(), warriorSignetModel.getId(), msg.getPropertyIdsList(), warriorSignetModel.getPropertyLib()});
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WarriorSignetCustomizedHero_7149(EquipMsg.C2S_WarriorSignetCustomizedHero_7149 msg, String channelId) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄为空，CODE={}", msg.getHeroCode());
      } else {
         WarriorSignet warriorSignet = (WarriorSignet)heroDao.warriors.get(msg.getPosition().getNumber());
         if (warriorSignet == null) {
            this.logger.info("英雄此位置没有将印，position={}", msg.getPosition().getNumber());
         } else {
            WarriorSignetModel warriorSignetModel = (WarriorSignetModel)this.player.getGameModelPool().getEntity("warriorSignet", warriorSignet.id);
            if (warriorSignetModel != null) {
               ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", warriorSignet.id);
               if (itemModel != null) {
                  if (!msg.getPropertyIdsList().isEmpty() && msg.getPropertyIdsList().size() >= 3) {
                     int customPropertyNum = 0;
                     int customSkillNum = 0;
                     List<PropertyModel> customiedPropertyList = new ArrayList();
                     List<ResourceModel> needList = new ArrayList();
                     Map<Integer, PropertyModel> propertyMap = new HashMap();
                     List<PropertyModel> otherPropertyTypeList = new ArrayList();

                     for(int i = 0; i < 3; ++i) {
                        int propertyId = (Integer)msg.getPropertyIdsList().get(i);
                        if (propertyId <= 0) {
                           if (warriorSignet.properties.size() > i) {
                              otherPropertyTypeList.add(((PropertyModel)warriorSignet.properties.get(i)).clone());
                           }
                        } else {
                           if (i >= warriorSignet.properties.size()) {
                              return;
                           }

                           WarriorSignetPropertyLibModel libModel = (WarriorSignetPropertyLibModel)this.player.getGameModelPool().getEntity("warriorSignetPropertyLib", propertyId);
                           if (libModel == null) {
                              this.logger.error("玩家={}，定制属性错误，输入model为空，ID={}", this.player.getPlayerId(), propertyId);
                              return;
                           }

                           WarriorSignetPropertyModel propertyModel = (WarriorSignetPropertyModel)this.player.getGameModelPool().getEntity("warriorSignetProperty", libModel.getPropertyId());
                           if (propertyModel == null) {
                              return;
                           }

                           if ((Integer)warriorSignetModel.getPropertyLib().get(i) != libModel.getGroupId()) {
                              this.logger.error("玩家={}，定制属性组错误，选择属性ID={}，将印可行属性组={}", new Object[]{this.player.getPlayerId(), propertyId, libModel.getGroupId()});
                              return;
                           }

                           if (warriorSignetModel.getCustomizedId() <= 0) {
                              return;
                           }

                           for(PropertyModel model : customiedPropertyList) {
                              if (propertyModel.getPropertyId() == model.getType() && propertyModel.getPropertyWay() == model.getWay()) {
                                 this.logger.error("定制属性中有相同类型属性，类型={}，加成方式={}", model.getType(), model.getWay());
                                 return;
                              }
                           }

                           PropertyModel customizedProperty = new PropertyModel(propertyModel.getPropertyId(), propertyModel.getPropertyWay(), (long)propertyModel.getPropertyValue());
                           customiedPropertyList.add(customizedProperty);
                           ResourceModel.addResourceToList(needList, new ResourceModel(2, warriorSignetModel.getCustomizedId(), 1));
                           propertyMap.put(i, customizedProperty);
                           ++customPropertyNum;
                        }
                     }

                     if (!msg.getSkillIdsList().isEmpty() && msg.getSkillIdsList().size() >= 2) {
                        List<Integer> customziedBaseSkillList = new ArrayList();
                        Map<Integer, Integer> skillMap = new HashMap();
                        List<Integer> otherBaseSkillIdList = new ArrayList();

                        for(int i = 0; i < msg.getSkillIdsCount(); ++i) {
                           int skillLibId = (Integer)msg.getSkillIdsList().get(i);
                           if (skillLibId > 0) {
                              WarriorSignetSkillLibModel libModel = (WarriorSignetSkillLibModel)this.player.getGameModelPool().getEntity("warriorSignetSkillLib", skillLibId);
                              if (libModel == null) {
                                 return;
                              }

                              WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", libModel.getSkillId());
                              if (skillModel == null) {
                                 this.logger.error("玩家={}，定制技能错误，输入model为空，ID={}", this.player.getPlayerId(), libModel.getSkillId());
                                 return;
                              }

                              if (customziedBaseSkillList.contains(skillModel.getBaseSkill())) {
                                 this.logger.error("定制将印有重复base的技能，技能ID={}", skillModel.getId());
                                 return;
                              }

                              customziedBaseSkillList.add(skillModel.getBaseSkill());
                              int skillGroup = 0;
                              if (i == 0) {
                                 skillGroup = warriorSignetModel.getSkill2_1();
                              } else {
                                 skillGroup = warriorSignetModel.getSkill2_2();
                              }

                              List<WarriorSignetSkillLibModel> libModelList = (List)this.player.getGameModelPool().getEntity("customWarriorSignetSkillLib", skillGroup);
                              if (libModelList == null || libModelList.isEmpty()) {
                                 return;
                              }

                              boolean isHaveSkill = false;

                              for(WarriorSignetSkillLibModel warriorSignetSkillLibModel : libModelList) {
                                 if (warriorSignetSkillLibModel.getSkillId() == libModel.getSkillId()) {
                                    isHaveSkill = true;
                                    break;
                                 }
                              }

                              if (!isHaveSkill) {
                                 this.logger.error("将印={}，技能位置={},技能组中没有技能={}", new Object[]{warriorSignet.id, i, libModel.getSkillId()});
                                 return;
                              }

                              if (warriorSignetModel.getCustomizedId() <= 0) {
                                 return;
                              }

                              ResourceModel.addResourceToList(needList, new ResourceModel(2, warriorSignetModel.getCustomizedId(), 1));
                              skillMap.put(i, libModel.getSkillId());
                              ++customSkillNum;
                           } else if (warriorSignet.skills.size() > i) {
                              WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", warriorSignet.skills.get(i));
                              if (skillModel != null) {
                                 otherBaseSkillIdList.add(skillModel.getBaseSkill());
                              }
                           }
                        }

                        if (msg.hasType() && msg.getType() == 1) {
                           int tempSkillNum = 0;

                           for(KeyValFun keyValFun : warriorSignetModel.getSkillNum()) {
                              tempSkillNum = Math.max(tempSkillNum, keyValFun.getKey());
                           }

                           if (tempSkillNum != customPropertyNum || warriorSignetModel.getPropertyLib().size() != customSkillNum) {
                              this.logger.info("需要完全定制属性和技能");
                              return;
                           }

                           needList.clear();
                           ResourceModel.addResourceToList(needList, new ResourceModel(2, warriorSignetModel.getCustomizedWholeId(), 1));
                        }

                        if (!needList.isEmpty()) {
                           if (this.player.checkResourceNum(needList)) {
                              WarriorSignet newWarriorSignet = new WarriorSignet();
                              newWarriorSignet.initByRecast(false, itemModel, skillMap, propertyMap, this.player, otherPropertyTypeList, otherBaseSkillIdList);
                              this.player.delResource((List)needList, 12, 1208, warriorSignet.id, 0, warriorSignet.id + "");
                              String oldPropertyStr = "";
                              String oldSkillStr = "";

                              for(PropertyModel property : warriorSignet.properties) {
                                 oldPropertyStr = oldPropertyStr + property.getType() + "_" + property.getWay() + "_" + property.getValue() + ",";
                              }

                              for(Integer skill : warriorSignet.skills) {
                                 oldSkillStr = oldSkillStr + skill + ",";
                              }

                              warriorSignet.skills.clear();
                              warriorSignet.skills.addAll(newWarriorSignet.skills);
                              warriorSignet.properties.clear();
                              warriorSignet.properties.addAll(newWarriorSignet.properties);
                              heroDao.updateOp();
                              heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WARRIORSIGNET, heroDao);
                              heroBagPart.updateHeroScore(HeroDefine.HeroPropertyModel.MODEL_WEAR_WARRIORSIGNET, heroDao);
                              EquipMsg.S2C_WarriorSignetCustomizedHero_7150.Builder builder = EquipMsg.S2C_WarriorSignetCustomizedHero_7150.newBuilder();
                              builder.setSuccess(true);
                              builder.setHeroCode(msg.getHeroCode());
                              builder.setPosition(msg.getPosition());
                              this.player.sendMsg(builder.build());
                              String propertyStr = "";
                              String skillStr = "";

                              for(PropertyModel property : warriorSignet.properties) {
                                 propertyStr = propertyStr + property.getType() + "_" + property.getWay() + "_" + property.getValue() + ",";
                              }

                              for(Integer skill : warriorSignet.skills) {
                                 skillStr = skillStr + skill + ",";
                              }

                              String customizedProperty = "";

                              for(Integer id : msg.getPropertyIdsList()) {
                                 customizedProperty = customizedProperty + id + ",";
                              }

                              String customizedSkill = "";

                              for(Integer id : msg.getSkillIdsList()) {
                                 customizedSkill = customizedSkill + id + ",";
                              }

                              int num = 0;
                              int id = 0;

                              for(ResourceModel resourceModel : needList) {
                                 num += resourceModel.getValue();
                                 id = resourceModel.getId();
                              }

                              this.player.getOperationMgr().addExtraLog(this.player, 210, itemModel.getQuality() + "", oldPropertyStr, oldSkillStr, customizedProperty, customizedSkill, propertyStr, skillStr, id + "", num + "");
                           }
                        }
                     } else {
                        this.logger.error("玩家={}，定制将印技能输入错误，ID={}，传入技能={}", new Object[]{this.player.getPlayerId(), warriorSignetModel.getId(), msg.getSkillIdsList()});
                     }
                  } else {
                     this.logger.error("玩家={}，定制将印属性输入错误，ID={}，传入属性={}，model属性={}", new Object[]{this.player.getPlayerId(), warriorSignetModel.getId(), msg.getPropertyIdsList(), warriorSignetModel.getPropertyLib()});
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void warriorDiscompose(EquipMsg.C2S_WarriorDiscompose_7107 msg, String source) {
      int code = msg.getCode();
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      ItemBase itemBase = itemBagPart.getItemByCode(code);
      if (itemBase == null) {
         this.player.failure(5);
      } else {
         WarriorSignetModel warriorSignetModel = (WarriorSignetModel)this.player.getGameModelPool().getEntity("warriorSignet", itemBase.id);
         if (warriorSignetModel == null) {
            this.player.failure(5);
         } else {
            boolean result = itemBagPart.deleteItemByCode(code, 1, 2, 205, 0, 0, "");
            if (result) {
               this.player.addResource(warriorSignetModel.getDiscomposeType(), warriorSignetModel.getDiscomposeId(), warriorSignetModel.getDiscomposeNum(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 2, 205, itemBase.id, 1, "code:" + code);
            }

            EquipMsg.S2C_WarriorDiscompose_7108.Builder builder = EquipMsg.S2C_WarriorDiscompose_7108.newBuilder();
            builder.setCode(code);
            this.player.sendMsg(builder.build());
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", warriorSignetModel.getId());
            this.player.getOperationMgr().addExtraLog(this.player, 129, itemModel != null ? itemModel.getQuality() + "" : "", warriorSignetModel.getDiscomposeNum() + "");
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WarriorSignetBuy_7109(EquipMsg.C2S_WarriorSignetBuy_7109 msg, String source) {
      int itemId = this.configManager.getIntDefault("warriorExchangeId", 4040);
      ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemId);
      if (itemModel == null) {
         this.player.failure(5);
      } else {
         int cost = this.configManager.getIntDefault("warriorExchangeCost", 1000);
         ResourceModel resourceModel = new ResourceModel(1, PlayerDefine.PLAYER_WARRIOR_SIGNET_TRACE, cost);
         if (!this.player.checkResourceNum(resourceModel)) {
            this.player.failure(12004);
         } else {
            this.player.delResource(resourceModel, 12, 1202, 0, 0, "");
            this.player.addResource(2, itemId, 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 2, 206, 0, 0, "");
            EquipMsg.S2C_WarriorSignetBuy_7110.Builder builder = EquipMsg.S2C_WarriorSignetBuy_7110.newBuilder();
            builder.setResult(1);
            this.player.sendMsg(builder.build());
         }
      }
   }

   private void recodeCompound(List<ResourceModel> cost, List<ResourceModel> obtain) {
      EquipCompoundLogDao logDao = new EquipCompoundLogDao();
      logDao.playerId = this.player.getPlayerId();
      logDao.cost = cost;
      logDao.obtain = obtain;
      logDao.createTime = System.currentTimeMillis();
      this.player.insertDao(logDao, false);
      this.deleteExpiredRecord();
   }

   private void deleteExpiredRecord() {
      List<EquipCompoundLogDao> list = this.player.<EquipCompoundLogDao>getList("tb_equip_compound_log", this.player.getPlayerId());
      if (list.size() > 10) {
         EquipCompoundLogDao logDao = (EquipCompoundLogDao)list.get(0);
         if (logDao != null) {
            System.out.println("删除过期合成记录：" + this.player.getPlayerId());
            this.player.deleteDao(logDao, false);
         }
      }

   }

   @MsgHandlerAnno
   public void C2S_RecastHeroWarrior_7115(EquipMsg.C2S_RecastHeroWarrior_7115 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄为空，CODE={}", msg.getHeroCode());
      } else {
         if (msg.getIsGold()) {
            int WstRmbVipRequest = this.configManager.getIntDefault("WstRmbVipRequest", 10);
            if (this.player.getPublicDao().vip_lv < WstRmbVipRequest) {
               this.logger.info("玩家={}，重铸vip等级不足，需要={}，玩家={}", new Object[]{this.player.getPlayerId(), WstRmbVipRequest, this.player.getPublicDao().vip_lv});
               return;
            }
         }

         WarriorSignet warriorSignet = (WarriorSignet)heroDao.warriors.get(msg.getPosition().getNumber());
         if (warriorSignet == null) {
            this.logger.info("英雄此位置没有将印，position={}", msg.getPosition().getNumber());
         } else if (warriorSignet.id != 4051 && warriorSignet.id != 4052 && warriorSignet.id != 4010) {
            if (warriorSignet.id == 4020 && msg.getSkillPositionList().size() > 0) {
               this.logger.info("蓝色将印不能锁定");
               this.player.failure(0);
            } else {
               List<ResourceModel> needList = new ArrayList();
               WarriorSignetModel warriorSignetModel = (WarriorSignetModel)this.player.getGameModelPool().getEntity("warriorSignet", warriorSignet.id);
               if (warriorSignetModel == null) {
                  this.logger.info("没有资源模板信息，id={}", warriorSignet.id);
               } else if (warriorSignetModel.getRecastCost().isEmpty()) {
                  this.logger.info("资源消耗为空，说明该将印不能重铸，id={}", warriorSignet.id);
               } else {
                  boolean isLock = false;
                  if (msg.getPropertyPositionList().size() > 0 || msg.getSkillPositionList().size() > 0) {
                     isLock = true;
                  }

                  for(int i = 0; i < warriorSignetModel.getRecastCost().size(); ++i) {
                     ResourceModel resourceModel = (ResourceModel)warriorSignetModel.getRecastCost().get(i);
                     if (!isLock || resourceModel.getType() != 1 || resourceModel.getId() != PlayerDefine.PLAYER_COPPER) {
                        ResourceModel.addResourceToList(needList, resourceModel);
                     }
                  }

                  if (msg.getIsGold()) {
                     if (!this.player.checkResourceNum(this.getNeedGoldList(needList))) {
                        this.logger.info("玩家={}，重铸将印锁定金币--资源不足");
                        return;
                     }
                  } else if (!this.player.checkResourceNum(needList)) {
                     this.logger.info("将印重铸--资源不足");
                     this.player.failure(12005);
                     return;
                  }

                  ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", warriorSignet.id);
                  if (itemModel == null) {
                     this.logger.info("没有物品模板信息，id={}", warriorSignet.id);
                  } else {
                     WarriorSignet newWarriorSignet = new WarriorSignet();
                     boolean isLuck = false;
                     PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
                     int recastNum = (Integer)MapUtil.getOrDefault(playerExtend.warriorRecastNum, warriorSignet.id, 0);
                     if (msg.getSkillPositionCount() <= 0 && warriorSignetModel.getLuckRecastCost() > 0 && recastNum >= warriorSignetModel.getLuckRecastCost()) {
                        isLuck = true;
                     }

                     List<Integer> skillPosition = msg.getSkillPositionList();
                     List<Integer> propertyPosition = msg.getPropertyPositionList();
                     Map<Integer, Integer> skillMap = new HashMap();
                     Map<Integer, PropertyModel> propertyMap = new HashMap();
                     List<PropertyModel> otherPropertyTypeList = new ArrayList();
                     List<Integer> otherBaseSkillIdList = new ArrayList();
                     if (skillPosition.size() > 0) {
                        for(int i = 0; i < warriorSignet.skills.size(); ++i) {
                           int index = i + 1;
                           if (skillPosition.contains(index)) {
                              skillMap.put(i, warriorSignet.skills.get(i));
                           } else {
                              WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", warriorSignet.skills.get(i));
                              if (skillModel != null) {
                                 otherBaseSkillIdList.add(skillModel.getBaseSkill());
                              }
                           }
                        }

                        for(Integer skillPos : skillPosition) {
                           if (warriorSignetModel.getSkillRecastLock().get(skillPos) == null) {
                              this.logger.info("属性锁定消耗资源配置错误");
                              return;
                           }

                           ResourceModel.addResourceToList(needList, (ResourceModel)warriorSignetModel.getSkillRecastLock().get(skillPos));
                        }
                     } else if (isLock) {
                        for(int i = 0; i < warriorSignet.skills.size(); ++i) {
                           WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", warriorSignet.skills.get(i));
                           if (skillModel != null) {
                              otherBaseSkillIdList.add(skillModel.getBaseSkill());
                           }
                        }
                     }

                     if (propertyPosition.size() > 0) {
                        for(int i = 0; i < warriorSignet.properties.size(); ++i) {
                           int index = i + 1;
                           if (propertyPosition.contains(index)) {
                              propertyMap.put(i, ((PropertyModel)warriorSignet.properties.get(i)).clone());
                           } else {
                              otherPropertyTypeList.add(((PropertyModel)warriorSignet.properties.get(i)).clone());
                           }
                        }

                        for(Integer position : propertyPosition) {
                           if (warriorSignetModel.getPropertyRecastlock().get(position) == null) {
                              this.logger.info("属性锁定消耗资源配置错误");
                              return;
                           }

                           ResourceModel.addResourceToList(needList, (ResourceModel)warriorSignetModel.getPropertyRecastlock().get(position));
                        }
                     } else if (isLock) {
                        for(int i = 0; i < warriorSignet.properties.size(); ++i) {
                           otherPropertyTypeList.add(((PropertyModel)warriorSignet.properties.get(i)).clone());
                        }
                     }

                     if (msg.getIsGold()) {
                        needList = this.getNeedGoldList(needList);
                     }

                     if (!this.player.checkResourceNum(needList)) {
                        this.logger.info("重置资源不够");
                     } else {
                        newWarriorSignet.initByRecast(isLuck, itemModel, skillMap, propertyMap, this.player, otherPropertyTypeList, otherBaseSkillIdList);
                        warriorSignet.recastPros = newWarriorSignet.properties;
                        warriorSignet.recastSkills = newWarriorSignet.skills;
                        if (isLuck) {
                           int val = recastNum - warriorSignetModel.getLuckRecastCost();
                           playerExtend.warriorRecastNum.put(warriorSignet.id, val);
                        } else {
                           playerExtend.warriorRecastNum.put(warriorSignet.id, recastNum + 1);
                        }

                        this.player.updatePlayerExtend(13);
                        heroDao.updateOp();
                        this.updateRecastNum(warriorSignet.id);
                        this.player.delResource((List)needList, 12, 1208, 0, 0, "");
                        heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WARRIORSIGNET, heroDao);
                        heroBagPart.updateHeroScore(HeroDefine.HeroPropertyModel.MODEL_WEAR_WARRIORSIGNET, heroDao);
                        EquipMsg.S2C_RecastHeroWarriorResult_7116.Builder builder = EquipMsg.S2C_RecastHeroWarriorResult_7116.newBuilder();
                        builder.setResult(1);
                        builder.setHeroCode(msg.getHeroCode());
                        builder.setPosition(msg.getPosition());

                        for(PropertyModel property : newWarriorSignet.properties) {
                           builder.addProperties(property.builder());
                        }

                        for(Integer skillId : newWarriorSignet.skills) {
                           builder.addSkills(skillId);
                        }

                        this.player.sendMsg(builder.build());
                        if (itemModel.getQuality() >= 5) {
                           GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                           giftPart.triggerTimeLimitGift(26);
                        }

                        String skill_1 = "";
                        String skill_2 = "";
                        String recast_skill_1 = "";
                        String recast_skill_2 = "";
                        if (warriorSignet.skills.size() > 0) {
                           skill_1 = warriorSignet.skills.get(0) + "";
                        }

                        if (warriorSignet.skills.size() > 1) {
                           skill_2 = warriorSignet.skills.get(1) + "";
                        }

                        if (warriorSignet.recastSkills.size() > 0) {
                           recast_skill_1 = warriorSignet.recastSkills.get(0) + "";
                        }

                        if (warriorSignet.recastSkills.size() > 1) {
                           recast_skill_2 = warriorSignet.recastSkills.get(1) + "";
                        }

                        int copper = 0;
                        int item_1006 = 0;

                        for(ResourceModel resourceModel : needList) {
                           if (resourceModel.getId() == PlayerDefine.PLAYER_COPPER) {
                              copper += resourceModel.getValue();
                           } else if (resourceModel.getId() == 1006) {
                              item_1006 += resourceModel.getValue();
                           }
                        }

                        this.player.getOperationMgr().addExtraLog(this.player, 128, itemModel.getQuality() + "", skill_1, skill_2, recast_skill_1, recast_skill_2, copper + "", item_1006 + "");
                     }
                  }
               }
            }
         } else {
            this.logger.info("将印不能重铸，id={}", warriorSignet.id);
            this.player.failure(0);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ConfrimHeroRecast_7117(EquipMsg.C2S_ConfrimHeroRecast_7117 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄为空，CODE={}", msg.getHeroCode());
      } else {
         WarriorSignet warriorSignet = (WarriorSignet)heroDao.warriors.get(msg.getPosition().getNumber());
         if (warriorSignet == null) {
            this.logger.info("英雄此位置没有将印，position={}", msg.getPosition().getNumber());
         } else if (!warriorSignet.recastPros.isEmpty()) {
            warriorSignet.properties.clear();
            warriorSignet.properties.addAll(warriorSignet.recastPros);
            warriorSignet.skills.clear();
            warriorSignet.skills.addAll(warriorSignet.recastSkills);
            warriorSignet.recastPros.clear();
            warriorSignet.recastSkills.clear();
            heroDao.updateOp();
            heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WARRIORSIGNET, heroDao);
            heroBagPart.updateHeroScore(HeroDefine.HeroPropertyModel.MODEL_WEAR_WARRIORSIGNET, heroDao);
            EquipMsg.S2C_ConfrimHeroRecastResult_7118.Builder builder = EquipMsg.S2C_ConfrimHeroRecastResult_7118.newBuilder();
            builder.setResult(1);
            builder.setHeroCode(msg.getHeroCode());
            builder.setPosition(msg.getPosition());

            for(PropertyModel property : warriorSignet.properties) {
               builder.addProperties(property.builder());
            }

            for(Integer skillId : warriorSignet.skills) {
               builder.addSkills(skillId);
            }

            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RecastBagWarrior_7131(EquipMsg.C2S_RecastBagWarrior_7131 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.getItemByCode(msg.getCode());
      if (!(itemBase instanceof WarriorSignet)) {
         this.logger.info("物品不是将印，CODE={}", msg.getCode());
      } else {
         WarriorSignet warriorSignet = (WarriorSignet)itemBase;
         if (warriorSignet == null) {
            this.logger.info("将印物品为空，code={}", msg.getCode());
            this.player.failure(0);
         } else if (warriorSignet.id != 4051 && warriorSignet.id != 4052 && warriorSignet.id != 4010) {
            if (warriorSignet.id == 4020 && msg.getSkillPositionList().size() > 0) {
               this.logger.info("蓝色将印不能锁定");
               this.player.failure(0);
            } else {
               if (msg.getIsGold()) {
                  int WstRmbVipRequest = this.configManager.getIntDefault("WstRmbVipRequest", 10);
                  if (this.player.getPublicDao().vip_lv < WstRmbVipRequest) {
                     this.logger.info("玩家={}，重铸vip等级不足，需要={}，玩家={}", new Object[]{this.player.getPlayerId(), WstRmbVipRequest, this.player.getPublicDao().vip_lv});
                     return;
                  }
               }

               WarriorSignetModel warriorSignetModel = (WarriorSignetModel)this.player.getGameModelPool().getEntity("warriorSignet", warriorSignet.id);
               if (warriorSignetModel == null) {
                  this.logger.info("没有资源模板信息，id={}", warriorSignet.id);
               } else if (warriorSignetModel.getRecastCost().isEmpty()) {
                  this.logger.info("资源消耗为空，说明该将印不能重铸，id={}", warriorSignet.id);
               } else {
                  List<ResourceModel> needList = new ArrayList();
                  boolean isLock = false;
                  if (msg.getPropertyPositionList().size() > 0 || msg.getSkillPositionList().size() > 0) {
                     isLock = true;
                  }

                  for(int i = 0; i < warriorSignetModel.getRecastCost().size(); ++i) {
                     ResourceModel resourceModel = (ResourceModel)warriorSignetModel.getRecastCost().get(i);
                     if (!isLock || resourceModel.getType() != 1 || resourceModel.getId() != PlayerDefine.PLAYER_COPPER) {
                        ResourceModel.addResourceToList(needList, resourceModel);
                     }
                  }

                  if (msg.getIsGold()) {
                     if (!this.player.checkResourceNum(this.getNeedGoldList(needList))) {
                        this.logger.info("玩家={}，重铸将印锁定金币--资源不足", this.player.getPlayerId());
                        return;
                     }
                  } else if (!this.player.checkResourceNum(needList)) {
                     this.logger.info("将印重铸--资源不足");
                     this.player.failure(12005);
                     return;
                  }

                  ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", warriorSignet.id);
                  if (itemModel == null) {
                     this.logger.info("没有物品模板信息，id={}", warriorSignet.id);
                  } else {
                     WarriorSignet newWarriorSignet = new WarriorSignet();
                     boolean isLuck = false;
                     PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
                     int recastNum = (Integer)MapUtil.getOrDefault(playerExtend.warriorRecastNum, warriorSignet.id, 0);
                     if (msg.getSkillPositionCount() <= 0 && warriorSignetModel.getLuckRecastCost() > 0 && recastNum >= warriorSignetModel.getLuckRecastCost()) {
                        isLuck = true;
                     }

                     List<Integer> skillPosition = msg.getSkillPositionList();
                     List<Integer> propertyPosition = msg.getPropertyPositionList();
                     Map<Integer, Integer> skillMap = new HashMap();
                     Map<Integer, PropertyModel> propertyMap = new HashMap();
                     List<PropertyModel> otherPropertyTypeList = new ArrayList();
                     List<Integer> otherBaseSkillIdList = new ArrayList();
                     if (skillPosition.size() > 0) {
                        for(int i = 0; i < warriorSignet.skills.size(); ++i) {
                           int index = i + 1;
                           if (skillPosition.contains(index)) {
                              skillMap.put(i, warriorSignet.skills.get(i));
                           } else {
                              WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", warriorSignet.skills.get(i));
                              if (skillModel != null) {
                                 otherBaseSkillIdList.add(skillModel.getBaseSkill());
                              }
                           }
                        }

                        for(Integer skillPos : skillPosition) {
                           if (warriorSignetModel.getSkillRecastLock().get(skillPos) == null) {
                              this.logger.info("属性锁定消耗资源配置错误");
                              return;
                           }

                           ResourceModel.addResourceToList(needList, (ResourceModel)warriorSignetModel.getSkillRecastLock().get(skillPos));
                        }
                     } else if (isLock) {
                        for(int i = 0; i < warriorSignet.skills.size(); ++i) {
                           WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", warriorSignet.skills.get(i));
                           if (skillModel != null) {
                              otherBaseSkillIdList.add(skillModel.getBaseSkill());
                           }
                        }
                     }

                     if (propertyPosition.size() > 0) {
                        for(int i = 0; i < warriorSignet.properties.size(); ++i) {
                           int index = i + 1;
                           if (propertyPosition.contains(index)) {
                              propertyMap.put(i, ((PropertyModel)warriorSignet.properties.get(i)).clone());
                           } else {
                              otherPropertyTypeList.add(((PropertyModel)warriorSignet.properties.get(i)).clone());
                           }
                        }

                        for(Integer position : propertyPosition) {
                           if (warriorSignetModel.getPropertyRecastlock().get(position) == null) {
                              this.logger.info("属性锁定消耗资源配置错误");
                              return;
                           }

                           ResourceModel.addResourceToList(needList, (ResourceModel)warriorSignetModel.getPropertyRecastlock().get(position));
                        }
                     } else if (isLock) {
                        for(int i = 0; i < warriorSignet.properties.size(); ++i) {
                           otherPropertyTypeList.add(((PropertyModel)warriorSignet.properties.get(i)).clone());
                        }
                     }

                     if (msg.getIsGold()) {
                        needList = this.getNeedGoldList(needList);
                     }

                     if (!this.player.checkResourceNum(needList)) {
                        this.logger.info("重置资源不够");
                     } else {
                        newWarriorSignet.initByRecast(isLuck, itemModel, skillMap, propertyMap, this.player, otherPropertyTypeList, otherBaseSkillIdList);
                        warriorSignet.recastPros = newWarriorSignet.properties;
                        warriorSignet.recastSkills = newWarriorSignet.skills;
                        if (isLuck) {
                           int val = recastNum - warriorSignetModel.getLuckRecastCost();
                           playerExtend.warriorRecastNum.put(warriorSignet.id, val);
                        } else {
                           playerExtend.warriorRecastNum.put(warriorSignet.id, recastNum + 1);
                        }

                        this.player.updatePlayerExtend(13);
                        itemBagDao.updateOp();
                        this.player.additemUpdateBuilder(warriorSignet);
                        this.player.senditemUpdateMsg();
                        this.updateRecastNum(warriorSignet.id);
                        this.player.delResource((List)needList, 12, 1208, 0, 0, "");
                        EquipMsg.S2C_RecastBagWarriorResult_7132.Builder builder = EquipMsg.S2C_RecastBagWarriorResult_7132.newBuilder();
                        builder.setResult(1);
                        builder.setCode(msg.getCode());

                        for(PropertyModel property : newWarriorSignet.properties) {
                           builder.addProperties(property.builder());
                        }

                        for(Integer skillId : newWarriorSignet.skills) {
                           builder.addSkills(skillId);
                        }

                        this.player.sendMsg(builder.build());
                        String skill_1 = "";
                        String skill_2 = "";
                        String recast_skill_1 = "";
                        String recast_skill_2 = "";
                        if (warriorSignet.skills.size() > 0) {
                           skill_1 = warriorSignet.skills.get(0) + "";
                        }

                        if (warriorSignet.skills.size() > 1) {
                           skill_2 = warriorSignet.skills.get(1) + "";
                        }

                        if (warriorSignet.recastSkills.size() > 0) {
                           recast_skill_1 = warriorSignet.recastSkills.get(0) + "";
                        }

                        if (warriorSignet.recastSkills.size() > 1) {
                           recast_skill_2 = warriorSignet.recastSkills.get(1) + "";
                        }

                        int copper = 0;
                        int item_1006 = 0;

                        for(ResourceModel resourceModel : needList) {
                           if (resourceModel.getId() == PlayerDefine.PLAYER_COPPER) {
                              copper += resourceModel.getValue();
                           } else if (resourceModel.getId() == 1006) {
                              item_1006 += resourceModel.getValue();
                           }
                        }

                        this.player.getOperationMgr().addExtraLog(this.player, 128, itemModel.getQuality() + "", skill_1, skill_2, recast_skill_1, recast_skill_2, copper + "", item_1006 + "");
                        if (itemModel.getQuality() >= 5) {
                           GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                           giftPart.triggerTimeLimitGift(26);
                        }

                     }
                  }
               }
            }
         } else {
            this.logger.info("将印不能重铸，id={}", warriorSignet.id);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ConfrimBagRecast_7133(EquipMsg.C2S_ConfrimBagRecast_7133 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.getItemByCode(msg.getCode());
      if (!(itemBase instanceof WarriorSignet)) {
         this.logger.info("物品不是将印，CODE={}", msg.getCode());
      } else {
         WarriorSignet warriorSignet = (WarriorSignet)itemBase;
         if (warriorSignet == null) {
            this.logger.info("将印物品为空，code={}", msg.getCode());
         } else if (!warriorSignet.recastPros.isEmpty()) {
            warriorSignet.properties.clear();
            warriorSignet.properties.addAll(warriorSignet.recastPros);
            warriorSignet.skills.clear();
            warriorSignet.skills.addAll(warriorSignet.recastSkills);
            warriorSignet.recastPros.clear();
            warriorSignet.recastSkills.clear();
            itemBagDao.updateOp();
            this.player.additemUpdateBuilder(warriorSignet);
            this.player.senditemUpdateMsg();
            EquipMsg.S2C_ConfrimBagRecastResult_7134.Builder builder = EquipMsg.S2C_ConfrimBagRecastResult_7134.newBuilder();
            builder.setResult(1);
            builder.setCode(msg.getCode());

            for(PropertyModel property : warriorSignet.properties) {
               builder.addProperties(property.builder());
            }

            for(Integer skillId : warriorSignet.skills) {
               builder.addSkills(skillId);
            }

            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RecastNum_7111(EquipMsg.C2S_RecastNum_7111 msg, String source) {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (!playerExtend.warriorRecastNum.isEmpty()) {
         EquipMsg.S2C_RecastNum_7112.Builder builder = EquipMsg.S2C_RecastNum_7112.newBuilder();

         for(Map.Entry<Integer, Integer> entry : playerExtend.warriorRecastNum.entrySet()) {
            EquipMsg.WarriorsRecastInfo.Builder infoBuilder = EquipMsg.WarriorsRecastInfo.newBuilder();
            infoBuilder.setId((Integer)entry.getKey());
            infoBuilder.setNum((Integer)entry.getValue());
            builder.addInfos(infoBuilder);
         }

         this.player.sendMsg(builder.build());
      }
   }

   public void updateRecastNum(int id) {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      int recastNum = (Integer)MapUtil.getOrDefault(playerExtend.warriorRecastNum, id, 0);
      EquipMsg.S2C_RecastNum_7112.Builder builder = EquipMsg.S2C_RecastNum_7112.newBuilder();
      EquipMsg.WarriorsRecastInfo.Builder infoBuilder = EquipMsg.WarriorsRecastInfo.newBuilder();
      infoBuilder.setId(id);
      infoBuilder.setNum(recastNum);
      builder.addInfos(infoBuilder);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_WarFlagStrongOfBag_7171(EquipMsg.C2S_WarFlagStrongOfBag_7171 msg, String source) {
      int code = msg.getItemCode();
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      ItemBase itemBase = itemBagPart.getItemByCode(code);
      if (itemBase != null) {
         if (!(itemBase instanceof WarFlag)) {
            this.logger.info("该物品不是战旗，code={}", code);
         } else {
            WarFlag warFlag = (WarFlag)itemBase;
            WarFlagModel warFlagModel = (WarFlagModel)this.player.getGameModelPool().getEntity("countryWarFlag", warFlag.id);
            if (warFlagModel != null) {
               if (warFlag.strongLv < warFlagModel.getMaxlv()) {
                  WarFlagLvupCostModel currentWarFlagModel = (WarFlagLvupCostModel)this.player.getGameModelPool().getEntity("countryWarFlagLvupCost", warFlag.strongLv);
                  if (currentWarFlagModel != null) {
                     if (currentWarFlagModel.getNextlv() > 0) {
                        if (this.player.checkResourceNum(currentWarFlagModel.getLvUpCost())) {
                           this.player.delResource((List)currentWarFlagModel.getLvUpCost(), 12, 1215, warFlag.id, warFlag.strongLv, "warfalg");
                           warFlag.lvUp();
                           this.player.additemUpdateBuilder(warFlag);
                           this.player.senditemUpdateMsg();
                           EquipMsg.S2C_WarFlagStrongOfBag_7172.Builder builder = EquipMsg.S2C_WarFlagStrongOfBag_7172.newBuilder();
                           builder.setResult(1);
                           builder.setItemCode(msg.getItemCode());
                           this.player.sendMsg(builder.build());
                           GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                           giftPart.triggerTimeLimitGift(16, warFlag.strongLv);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WarFlagStrongOfHero_7173(EquipMsg.C2S_WarFlagStrongOfHero_7173 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao != null) {
         if (heroDao.warFlag != null) {
            WarFlagModel warFlagModel = (WarFlagModel)this.player.getGameModelPool().getEntity("countryWarFlag", heroDao.warFlag.id);
            if (warFlagModel != null) {
               if (heroDao.warFlag.strongLv < warFlagModel.getMaxlv()) {
                  WarFlagLvupCostModel currentWarFlagModel = (WarFlagLvupCostModel)this.player.getGameModelPool().getEntity("countryWarFlagLvupCost", heroDao.warFlag.strongLv);
                  if (currentWarFlagModel != null) {
                     if (currentWarFlagModel.getNextlv() > 0) {
                        if (this.player.checkResourceNum(currentWarFlagModel.getLvUpCost())) {
                           this.player.delResource((List)currentWarFlagModel.getLvUpCost(), 12, 1215, heroDao.warFlag.id, heroDao.warFlag.strongLv, "warfalg");
                           heroDao.warFlag.lvUp();
                           heroDao.updateOp();
                           heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WAR_FALG, heroDao);
                           EquipMsg.S2C_WarFlagStrongOfHero_7174.Builder builder = EquipMsg.S2C_WarFlagStrongOfHero_7174.newBuilder();
                           builder.setResult(1);
                           builder.setHeroCode(msg.getHeroCode());
                           this.player.sendMsg(builder.build());
                           GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                           giftPart.triggerTimeLimitGift(16, heroDao.warFlag.strongLv);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WarFlagRecastOfItem_7175(EquipMsg.C2S_WarFlagRecastOfItem_7175 msg, String source) {
      int code = msg.getItemCode();
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      ItemBase itemBase = itemBagPart.getItemByCode(code);
      if (itemBase != null) {
         if (!(itemBase instanceof WarFlag)) {
            this.logger.info("该物品不是战旗，code={}", code);
         } else {
            WarFlag warFlag = (WarFlag)itemBase;
            WarFlagModel warFlagModel = (WarFlagModel)this.player.getGameModelPool().getEntity("countryWarFlag", warFlag.id);
            if (warFlagModel != null) {
               if (this.player.checkResourceNum(warFlagModel.getRefreshCost())) {
                  this.player.delResource((List)warFlagModel.getRefreshCost(), 12, 1216, warFlag.id, warFlag.recastNum, "warfalg");
                  warFlag.recast();
                  this.player.additemUpdateBuilder(warFlag);
                  this.player.senditemUpdateMsg();
                  EquipMsg.S2C_WarFlagRecastOfItem_7176.Builder builder = EquipMsg.S2C_WarFlagRecastOfItem_7176.newBuilder();
                  builder.setResult(1);
                  builder.setItemCode(msg.getItemCode());
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ConfrimWarFlagRecastOfItem_7177(EquipMsg.C2S_ConfrimWarFlagRecastOfItem_7177 msg, String source) {
      int code = msg.getItemCode();
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      ItemBase itemBase = itemBagPart.getItemByCode(code);
      if (itemBase != null) {
         if (!(itemBase instanceof WarFlag)) {
            this.logger.info("该物品不是战旗，code={}", code);
         } else {
            WarFlag warFlag = (WarFlag)itemBase;
            if (warFlag.recastProperties.isEmpty()) {
               this.logger.info("已经还没有洗练，不能保存");
            } else {
               for(int i = 0; i < warFlag.recastProperties.size(); ++i) {
                  PropertyModel propertyModel = (PropertyModel)warFlag.recastProperties.get(i);
                  warFlag.strongProperties.set(i, new PropertyModel(propertyModel.getType(), propertyModel.getWay(), propertyModel.getValue()));
               }

               warFlag.recastProperties.clear();
               this.player.additemUpdateBuilder(warFlag);
               this.player.senditemUpdateMsg();
               EquipMsg.S2C_ConfrimWarFlagRecastOfItem_7178.Builder builder = EquipMsg.S2C_ConfrimWarFlagRecastOfItem_7178.newBuilder();
               builder.setResult(1);
               builder.setItemCode(msg.getItemCode());
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WarFlagRecastOfHero_7179(EquipMsg.C2S_WarFlagRecastOfHero_7179 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao != null) {
         if (heroDao.warFlag != null) {
            WarFlagModel warFlagModel = (WarFlagModel)this.player.getGameModelPool().getEntity("countryWarFlag", heroDao.warFlag.id);
            if (warFlagModel != null) {
               if (this.player.checkResourceNum(warFlagModel.getRefreshCost())) {
                  this.player.delResource((List)warFlagModel.getRefreshCost(), 12, 1216, heroDao.warFlag.id, heroDao.warFlag.recastNum, "warfalg");
                  heroDao.warFlag.recast();
                  heroDao.updateOp();
                  heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WAR_FALG, heroDao);
                  EquipMsg.S2C_WarFlagRecastOfHero_7180.Builder builder = EquipMsg.S2C_WarFlagRecastOfHero_7180.newBuilder();
                  builder.setResult(1);
                  builder.setHeroCode(msg.getHeroCode());
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ConfrimWarFlagRecastOfHero_7181(EquipMsg.C2S_ConfrimWarFlagRecastOfHero_7181 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao != null) {
         if (heroDao.warFlag != null) {
            if (heroDao.warFlag.recastProperties.isEmpty()) {
               this.logger.info("已经还没有洗练，不能保存");
            } else {
               for(int i = 0; i < heroDao.warFlag.recastProperties.size(); ++i) {
                  PropertyModel propertyModel = (PropertyModel)heroDao.warFlag.recastProperties.get(i);
                  heroDao.warFlag.strongProperties.set(i, new PropertyModel(propertyModel.getType(), propertyModel.getWay(), propertyModel.getValue()));
               }

               heroDao.warFlag.recastProperties.clear();
               heroDao.updateOp();
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WAR_FALG, heroDao);
               EquipMsg.S2C_ConfrimWarFlagRecastOfHero_7182.Builder builder = EquipMsg.S2C_ConfrimWarFlagRecastOfHero_7182.newBuilder();
               builder.setResult(1);
               builder.setHeroCode(msg.getHeroCode());
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OneKeySellWarFlag_7183(EquipMsg.C2S_OneKeySellWarFlag_7183 msg, String source) {
      if (!msg.getFlagCodesList().isEmpty()) {
         List<Integer> codeList = new ArrayList();

         for(Integer code : msg.getFlagCodesList()) {
            if (codeList.contains(code)) {
               this.logger.error("玩家={}，一键出售战旗有重复code={}，List={}", new Object[]{this.player.getPlayerId(), code, codeList});
               return;
            }

            codeList.add(code);
         }

         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());

         for(int i = 0; i < msg.getFlagCodesList().size(); ++i) {
            ItemBase itemBase = itemBagDao.getItemByCode((Integer)msg.getFlagCodesList().get(i));
            if (itemBase == null) {
               this.logger.info("没有物品，itemCode={}", msg.getFlagCodesList().get(i));
               return;
            }

            if (!(itemBase instanceof WarFlag)) {
               this.logger.info("不是战旗类型");
               return;
            }
         }

         List<ResourceModel> sellList = new ArrayList();

         for(int i = 0; i < msg.getFlagCodesList().size(); ++i) {
            ItemBase itemBase = itemBagDao.getItemByCode((Integer)msg.getFlagCodesList().get(i));
            WarFlag warFlag = (WarFlag)itemBase;

            for(ResourceModel resourceModel : warFlag.sellReturnResource(true)) {
               ResourceModel.addResourceToList(sellList, resourceModel);
            }
         }

         this.player.addResource(sellList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1227, 0, msg.getFlagCodesList().size(), String.valueOf(this.player.getPlayerId()));
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

         for(int i = 0; i < msg.getFlagCodesList().size(); ++i) {
            itemBagPart.deleteItemByCode((Integer)msg.getFlagCodesList().get(i), 1, 12, 1227, 0, 0, "");
         }

         this.player.senditemUpdateMsg();
         EquipMsg.S2C_OneKeySellWarFlag_7184.Builder builder = EquipMsg.S2C_OneKeySellWarFlag_7184.newBuilder();
         builder.setResult(1);
         builder.addAllCoeds(msg.getFlagCodesList());
         this.player.sendMsg(builder.build());
      }
   }

   public List<ResourceModel> getNeedGoldList(List<ResourceModel> resourceModelList) {
      int itemNum = 0;
      List<ResourceModel> newList = new ArrayList();

      for(ResourceModel resourceModel : resourceModelList) {
         if (resourceModel.getType() == 2 && resourceModel.getId() == 1006) {
            itemNum += resourceModel.getValue();
         } else if (resourceModel.getType() != 1 && resourceModel.getId() != PlayerDefine.PLAYER_COPPER) {
            newList.add(resourceModel);
         }
      }

      if (itemNum > 0) {
         int WstRmbPro = this.configManager.getIntDefault("WstRmbPro", 5000);
         int gold = (int)((long)itemNum * 1L * (long)WstRmbPro / 10000L);
         newList.add(new ResourceModel(1, PlayerDefine.PLAYER_GOLD, gold));
      }

      return newList;
   }

   private EquipItem getEquipItem(int heroCode, int position, int itemCode) {
      EquipItem equipItem = null;
      if (heroCode > 0) {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
         if (heroDao != null) {
            equipItem = (EquipItem)heroDao.equips.get(position);
         }
      } else {
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         equipItem = (EquipItem)itemBagDao.getItemByCode(itemCode);
      }

      return equipItem;
   }

   @MsgHandlerAnno
   public void C2S_EnchantType_7191(EquipMsg.C2S_EnchantType_7191 msg, String source) {
      EquipItem equipItem = this.getEquipItem(msg.getHeroCode(), msg.getPosition(), msg.getEquipCode());
      if (equipItem == null) {
         this.player.failure(5);
      } else {
         EquipExtraHotModel equipExtraHotModel = (EquipExtraHotModel)this.player.getGameModelPool().getEntity("equipExtraHot", equipItem.id);
         if (equipExtraHotModel == null) {
            this.player.failure(61095);
         } else {
            int idx = -1;

            for(int i = 0; i < equipExtraHotModel.getHotTarget().size(); ++i) {
               if ((Integer)equipExtraHotModel.getHotTarget().get(i) == msg.getType()) {
                  idx = i;
                  break;
               }
            }

            if (idx == -1) {
               this.player.failure(61096);
            } else {
               List<ResourceModel> needList = new ArrayList();

               for(ResourceModel resourceModel : equipExtraHotModel.getHotItem()) {
                  ResourceModel.addResourceToList(needList, resourceModel);
               }

               if (idx >= equipExtraHotModel.getHotSpItem().size()) {
                  this.logger.warn("装备套装激活消耗配置错误");
               } else {
                  ResourceModel.addResourceToList(needList, new ResourceModel(2, (Integer)equipExtraHotModel.getHotSpItem().get(idx), equipExtraHotModel.getHotSpItemNum()));
                  if (msg.getHeroCode() == 0) {
                     ResourceModel.addResourceToList(needList, new ResourceModel(2, equipItem.id, 1));
                  }

                  if (!this.player.checkResourceNum(needList)) {
                     this.logger.info("装备附魔激活资源不足");
                  } else {
                     String tips = "equipCode:" + msg.getEquipCode() + "heroCode:" + msg.getHeroCode() + "type:" + msg.getType();
                     if (needList.size() > 0) {
                        this.player.delResource((List)needList, 12, 1229, 0, 0, tips);
                     }

                     if (msg.getHeroCode() == 0) {
                        this.player.addResource(2, msg.getType(), 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1229, equipItem.code, 0, "");
                     } else {
                        equipItem.id = msg.getType();
                        HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                        HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
                        heroDao.updateOp();
                        heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_EQUIP, heroDao);
                     }

                     EquipMsg.S2C_EnchantType_7192.Builder builder = EquipMsg.S2C_EnchantType_7192.newBuilder();
                     this.player.sendMsg(builder.build());
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_EnchantOperate_7193(EquipMsg.C2S_EnchantOperate_7193 msg, String source) {
      EquipItem equipItem = this.getEquipItem(msg.getHeroCode(), msg.getPosition(), msg.getEquipCode());
      if (equipItem == null) {
         this.logger.info("该装备不存在");
      } else {
         boolean result = false;
         switch (msg.getOp()) {
            case OP_UPGRADE:
               result = this.enchantPromote(equipItem, msg.getHeroCode());
               break;
            case OP_RESET:
               result = this.enchantReset(equipItem, msg.getHeroCode());
         }

         if (result) {
            EquipMsg.S2C_EnchantOperate_7194.Builder builder = EquipMsg.S2C_EnchantOperate_7194.newBuilder();
            builder.setOp(msg.getOp());
            this.player.sendMsg(builder.build());
         } else {
            this.logger.info("附魔操作失败 playerId:{}, op:{}", this.player.getPlayerId(), msg.getOp());
         }

      }
   }

   private boolean enchantPromote(EquipItem equipItem, int heroCode) {
      EquipEnchantHotModel model = (EquipEnchantHotModel)this.player.getGameModelPool().getEntity("equipEnchantHot", equipItem.id);
      if (model != null && model.getStageUpId() != 0) {
         if (!this.player.checkResourceNum(model.getEnchantCost())) {
            this.logger.info("装备附魔提升资源不足");
            return false;
         } else {
            if (heroCode > 0) {
               equipItem.id = model.getStageUpId();
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
               heroDao.updateOp();
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_EQUIP, heroDao);
            } else {
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               itemBagPart.deleteItemByCode(equipItem.code, 1, 12, 1230, 0, 0, "");
               this.player.addResource(2, model.getStageUpId(), 1, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 12, 1230, equipItem.code, 0, "");
            }

            this.player.delResource((List)model.getEnchantCost(), 12, 1230, equipItem.code, 0, "");
            return true;
         }
      } else {
         this.logger.info("该装备不可升级 itemId:{}", equipItem.id);
         return false;
      }
   }

   private boolean enchantReset(EquipItem equipItem, int heroCode) {
      EquipEnchantHotModel model = (EquipEnchantHotModel)this.player.getGameModelPool().getEntity("equipEnchantHot", equipItem.id);
      if (model == null) {
         this.logger.warn("该装备不存在 itemId:{}", equipItem.id);
         return false;
      } else if (!this.player.checkResourceNum(model.getReturnCost())) {
         this.logger.info("装备附魔重置消耗的资源不足");
         return false;
      } else {
         EquipExtraHotModel extraHotModel = (EquipExtraHotModel)this.player.getGameModelPool().getEntity("equipExtraHot", model.getEnchantHotId());
         if (extraHotModel == null) {
            this.logger.info("附魔装备返还配置出错 enchantHot:{}", equipItem.id);
            return false;
         } else {
            List<ResourceModel> resourceModelList = new ArrayList();
            List<ResourceModel> showList = new ArrayList();
            this.player.delResource((List)model.getReturnCost(), 12, 1231, 0, 0, "");
            if (heroCode > 0) {
               equipItem.id = model.getEnchantHotId();
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
               heroDao.updateOp();
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_EQUIP, heroDao);
            } else {
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               itemBagPart.deleteItemByCode(equipItem.code, 1, 12, 1231, 0, 0, "");
               ResourceModel.addResourceToList(resourceModelList, new ResourceModel(2, model.getEnchantHotId(), 1));
            }

            ResourceModel.addResourceToList(showList, new ResourceModel(2, model.getEnchantHotId(), 1));

            for(int i = 0; i < extraHotModel.getHotTarget().size(); ++i) {
               if (model.getId() == (Integer)extraHotModel.getHotTarget().get(i)) {
                  ResourceModel.addResourceToList(resourceModelList, new ResourceModel(2, (Integer)extraHotModel.getHotSpItem().get(i), extraHotModel.getHotSpItemNum()));
                  ResourceModel.addResourceToList(showList, new ResourceModel(2, (Integer)extraHotModel.getHotSpItem().get(i), extraHotModel.getHotSpItemNum()));
                  break;
               }
            }

            this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 12, 1231, 0, 0, "");
            this.player.addResourceMsg(showList);
            this.player.sendResourceMsg();
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_compoundWarFlagBag_7195(EquipMsg.C2S_compoundWarFlagBag_7195 msg, String source) {
      this.compoundWarFlagBag(msg.getCodes());
   }

   @MsgHandlerAnno
   public void C2S_compoundWarFlagHero_7197(EquipMsg.C2S_compoundWarFlagHero_7197 msg, String source) {
      this.compoundWarFlagHero(msg.getHeroCode());
   }

   public void compoundWarFlagBag(int code) {
      if (this.player.isSystemOpen(3810)) {
         List<ResourceModel> countryWarFlagStarupCost = this.configManager.getResourceModelList("countryWarFlagStarupCost", "2|1211|1");
         if (this.player.checkResourceNum(countryWarFlagStarupCost)) {
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            ItemBase itemBase = itemBagPart.getItemByCode(code);
            if (itemBase != null) {
               if (itemBase instanceof WarFlag) {
                  WarFlag warFlag = (WarFlag)itemBase;
                  ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", warFlag.id);
                  if (itemModel != null) {
                     if (itemModel.getQuality() != 6) {
                        this.logger.error("战旗品质不对={}", itemModel.getQuality());
                     } else {
                        int pinkWarFlagId = this.configManager.getIntDefault("pinkWarFlagId", 6011);
                        ItemModel newItemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", pinkWarFlagId);
                        if (newItemModel != null) {
                           WarFlag newWarFlag = new WarFlag(this.player.getUniqueCode(CodeDefine.ITEM_CODE), newItemModel, warFlag);
                           itemBagPart.addWarFlagForCom(newWarFlag, 12, 1233, 0, 0, "");
                           this.player.additemUpdateBuilder(newWarFlag);
                           this.player.senditemUpdateMsg();
                           itemBagPart.deleteItemByCode(code, 1, 12, 1233, 0, 0, "");
                           this.player.delResource((List)countryWarFlagStarupCost, 12, 1233, 0, 0, "");
                           this.player.addResourceMsg(newWarFlag);
                           this.player.sendResourceMsg();
                           EquipMsg.S2C_compoundWarFlagBag_7196.Builder builder = EquipMsg.S2C_compoundWarFlagBag_7196.newBuilder();
                           builder.setResult(1);
                           this.player.sendMsg(builder.build());
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void compoundWarFlagHero(int heroCode) {
      if (this.player.isSystemOpen(3810)) {
         List<ResourceModel> countryWarFlagStarupCost = this.configManager.getResourceModelList("countryWarFlagStarupCost", "2|1211|1");
         if (this.player.checkResourceNum(countryWarFlagStarupCost)) {
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
            if (heroDao != null) {
               if (heroDao.warFlag != null) {
                  ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", heroDao.warFlag.id);
                  if (itemModel != null) {
                     if (itemModel.getQuality() != 6) {
                        this.logger.error("战旗品质不对={}", itemModel.getQuality());
                     } else {
                        int pinkWarFlagId = this.configManager.getIntDefault("pinkWarFlagId", 6011);
                        ItemModel newItemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", pinkWarFlagId);
                        if (newItemModel != null) {
                           this.player.delResource((List)countryWarFlagStarupCost, 12, 1233, 0, 0, "");
                           WarFlag newWarFlag = new WarFlag(0, newItemModel, heroDao.warFlag);
                           heroDao.warFlag = newWarFlag;
                           heroDao.updateOp();
                           heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WAR_FALG, heroDao);
                           EquipMsg.S2C_compoundWarFlagHero_7198.Builder builder = EquipMsg.S2C_compoundWarFlagHero_7198.newBuilder();
                           builder.setHeroCode(heroCode);
                           this.player.sendMsg(builder.build());
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_resetWarFlag_7121(EquipMsg.C2S_resetWarFlag_7121 msg, String source) {
      EquipMsg.FromOp fromOp = msg.getFromOp();
      EquipMsg.WarFlagOp opType = msg.getOpType();
      switch (fromOp) {
         case FROM_HERO:
            this.resetWarFlagHero(fromOp, opType, msg.getCode());
            break;
         case FROM_BAG:
            this.resetWarFlagBag(fromOp, opType, msg.getCode());
      }

   }

   private boolean preResetWarFlag(WarFlag warFlag, EquipMsg.FromOp fromOp, EquipMsg.WarFlagOp opType, int code, List<ResourceModel> returnList) {
      if (warFlag.strongLv <= 1) {
         this.logger.info("【战旗重置】重置的战旗等级不足 playerId:{} strongLv:{}", this.player.getPlayerId(), warFlag.strongLv);
         return false;
      } else {
         List<ResourceModel> returnResource = warFlag.sellReturnResource(false);
         returnList.addAll(returnResource);
         if (opType == EquipMsg.WarFlagOp.PREVIEW) {
            this.resetWarFlagPreview(fromOp, code, opType, returnList);
            return false;
         } else {
            List<ResourceModel> resetCostList = this.configManager.getResourceModelList("countryWarFlagResetCost", "1|9|0");
            if (!this.player.checkResourceNum(resetCostList)) {
               return false;
            } else {
               this.player.delResource((List)resetCostList, 12, 1239, 0, 0, "");
               return true;
            }
         }
      }
   }

   private void resetWarFlagHero(EquipMsg.FromOp fromOp, EquipMsg.WarFlagOp opType, int code) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(code);
      if (heroDao != null && heroDao.warFlag != null) {
         List<ResourceModel> returnList = new ArrayList();
         WarFlag warFlag = heroDao.warFlag;
         if (this.preResetWarFlag(warFlag, fromOp, opType, code, returnList)) {
            warFlag.reset();
            heroDao.updateOp();
            heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WAR_FALG, heroDao);
            this.player.addResource(returnList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1239, 0, 0, "");
            this.resetWarFlag(fromOp, code);
         }
      }
   }

   private void resetWarFlagBag(EquipMsg.FromOp fromOp, EquipMsg.WarFlagOp opType, int code) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      ItemBase itemBase = itemBagPart.getItemByCode(code);
      if (itemBase != null) {
         if (!(itemBase instanceof WarFlag)) {
            this.logger.info("该物品不是战旗，code={}", code);
         } else {
            WarFlag warFlag = (WarFlag)itemBase;
            WarFlagModel warFlagModel = (WarFlagModel)this.player.getGameModelPool().getEntity("countryWarFlag", warFlag.id);
            if (warFlagModel != null) {
               List<ResourceModel> returnList = new ArrayList();
               if (this.preResetWarFlag(warFlag, fromOp, opType, code, returnList)) {
                  warFlag.reset();
                  this.player.additemUpdateBuilder(warFlag);
                  this.player.senditemUpdateMsg();
                  this.player.addResource(returnList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1239, 0, 0, "");
                  this.resetWarFlag(fromOp, code);
               }
            }
         }
      }
   }

   private void resetWarFlagPreview(EquipMsg.FromOp fromOp, int code, EquipMsg.WarFlagOp opType, List<ResourceModel> resourceModels) {
      EquipMsg.S2C_resetWarFlagPreview_7124.Builder builder = EquipMsg.S2C_resetWarFlagPreview_7124.newBuilder();
      builder.setFromOp(fromOp);
      builder.setCode(code);
      builder.setOpType(opType);

      for(ResourceModel resourceModel : resourceModels) {
         builder.addResource(resourceModel.builder());
      }

      this.player.sendMsg(builder.build());
   }

   private void resetWarFlag(EquipMsg.FromOp fromOp, int code) {
      EquipMsg.S2C_resetWarFlag_7122.Builder builder = EquipMsg.S2C_resetWarFlag_7122.newBuilder();
      builder.setFromOp(fromOp);
      builder.setCode(code);
      this.player.sendMsg(builder.build());
   }
}
