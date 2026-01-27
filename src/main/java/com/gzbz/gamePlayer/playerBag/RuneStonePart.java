package com.gzbz.gamePlayer.playerBag;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroWearPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.FormationGemGetModel;
import com.gzbz.model.FormationGemLvUpModel;
import com.gzbz.model.FormationGemModel;
import com.gzbz.model.FormationGemRangeModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.RuneStoneMsg;
import com.gzbz.runeStone.RuneStoneMgr;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import misc.MapUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class RuneStonePart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(RuneStonePart.class);
   private final RuneStoneMgr runeStoneMgr;

   public RuneStonePart(RuneStoneMgr runeStoneMgr) {
      this.runeStoneMgr = runeStoneMgr;
   }

   public void resetDaily() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.runeStone > 0) {
         playerExtend.runeStone = 0;
         this.player.updatePlayerExtend(13);
      }

   }

   @MsgHandlerAnno
   public void C2S_RuneRecordList_5415(RuneStoneMsg.C2S_RuneRecordList_5415 msg, String source) {
      boolean isFree = true;
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.runeStone > 0) {
         isFree = false;
      }

      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(19, 0);
      this.player.sendMsg(this.runeStoneMgr.buildRuneStoneInfo(isFree, this.player.getPlayerId(), recruitNum));
   }

   @MsgHandlerAnno
   public void C2S_RuneStoneRecruitment_5409(RuneStoneMsg.C2S_RuneStoneRecruitment_5409 msg, String source) {
      PlayerDao playerDao = this.player.getPlayerDao();
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      BagParent<ItemBase> bag = itemBagDao.getBagBySublass(11);
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      int maxLimit = itemBagPart.getMaxCount(11);
      int maxRecruitNum = ApplicationContextProvider.getConfigInt("LotteryLimit", 99999);
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(19, 0);
      if (msg.getType() == 1) {
         boolean isFree = true;
         if (bag.getBagSize() + 1 > maxLimit) {
            this.player.failure(12023);
            return;
         }

         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         FormationGemGetModel model = (FormationGemGetModel)this.player.getGameModelPool().getEntity("formationGemGet", 1);
         if (playerExtend.runeStone == 0) {
            playerExtend.runeStone = 1;
            this.player.updatePlayerExtend(13);
            this.player.notifyPlayerData(PlayerDefine.PLAYER_RUNE_STONE, 1);
         } else {
            isFree = false;
            if (!this.player.checkResourceNum(model.getGetItemType(), model.getGetItemId(), model.getGetItemNum())) {
               this.player.failure(12012);
               return;
            }

            if (recruitNum >= maxRecruitNum) {
               this.player.failure(12026);
               return;
            }
         }

         FormationGemModel gemModel = this.getGemModel(model);
         if (Objects.isNull(gemModel)) {
            return;
         }

         if (!isFree) {
            this.player.delResource(model.getGetItemType(), model.getGetItemId(), (long)model.getGetItemNum(), 12, 1219, 0, 0, "");
         }

         playerResetCustomCache.addDailyReset(19, 1);
         this.player.addResource(2, gemModel.getId(), 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1219, gemModel.getId(), 1, "");
         if (gemModel.getQuality() == 5) {
            List<ResourceModel> sacrificeLogResources = new ArrayList();
            sacrificeLogResources.add(new ResourceModel(2, gemModel.getId(), 1));
            this.runeStoneMgr.pushTaskEx("addRuneRecords", new Object[]{sacrificeLogResources, playerDao.playerId, playerDao.playerName});
         }
      } else {
         if (bag.getBagSize() + 10 > maxLimit) {
            this.player.failure(12023);
            return;
         }

         ArrayList<FormationGemModel> itemList = new ArrayList();
         FormationGemGetModel model = (FormationGemGetModel)this.player.getGameModelPool().getEntity("formationGemGet", 2);
         if (!this.player.checkResourceNum(model.getGetItemType(), model.getGetItemId(), model.getGetItemNum())) {
            this.player.failure(12012);
            return;
         }

         if (recruitNum + 10 > maxRecruitNum) {
            this.player.failure(12026);
            return;
         }

         for(int i = 0; i < 8; ++i) {
            FormationGemModel gemModel = this.getGemModel(model);
            if (!Objects.isNull(gemModel)) {
               itemList.add(gemModel);
            }
         }

         FormationGemModel fourStarModel = this.getStaticGem(model.getTenTimeRandomValueForP(), model.getTenTimeRandomForP());
         FormationGemModel fiveStarModel = this.getStaticGem(model.getTenTimeRandomValue(), model.getTenTimeRandom());
         if (fourStarModel != null) {
            itemList.add(fourStarModel);
         } else {
            Map<Integer, FormationGemModel> map = this.player.getGameModelPool().getMap("formationGem");
            List<FormationGemModel> list = new ArrayList();

            for(FormationGemModel value : map.values()) {
               if (value.getQuality() == 4) {
                  list.add(value);
               }
            }

            if (list.isEmpty()) {
               logger.error("探寻符石出错：");
            }

            Collections.shuffle(list);
            FormationGemModel gemModel = (FormationGemModel)list.get(0);
            itemList.add(gemModel);
         }

         if (fiveStarModel != null) {
            itemList.add(fiveStarModel);
         } else {
            Map<Integer, FormationGemModel> map = this.player.getGameModelPool().getMap("formationGem");
            List<FormationGemModel> list = new ArrayList();

            for(FormationGemModel value : map.values()) {
               if (value.getQuality() == 5) {
                  list.add(value);
               }
            }

            if (list.isEmpty()) {
               logger.error("探寻符石出错：");
            }

            Collections.shuffle(list);
            FormationGemModel gemModel = (FormationGemModel)list.get(0);
            itemList.add(gemModel);
         }

         List<ResourceModel> realList = new ArrayList();

         for(int i = 0; i < itemList.size(); ++i) {
            realList.add(new ResourceModel(2, ((FormationGemModel)itemList.get(i)).getId(), 1));
         }

         this.player.delResource(model.getGetItemType(), model.getGetItemId(), (long)model.getGetItemNum(), 12, 1219, 0, 0, "");
         this.player.addResource(realList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1219, 0, 1, "");
         List<ResourceModel> sacrificeLogResources = new ArrayList();

         for(int i = 0; i < itemList.size(); ++i) {
            if (((FormationGemModel)itemList.get(i)).getQuality() == 5) {
               sacrificeLogResources.add(new ResourceModel(2, ((FormationGemModel)itemList.get(i)).getId(), 1));
            }
         }

         playerResetCustomCache.addDailyReset(19, 10);
         if (!sacrificeLogResources.isEmpty()) {
            this.runeStoneMgr.pushTaskEx("addRuneRecords", new Object[]{sacrificeLogResources, playerDao.playerId, playerDao.playerName});
         }
      }

      RuneStoneMsg.S2C_RuneStoneRecruitment_5410.Builder builder = RuneStoneMsg.S2C_RuneStoneRecruitment_5410.newBuilder();
      builder.setType(msg.getType());
      int lastNum = (Integer)playerResetCustomCache.getDailyNum(19, 0);
      builder.setRecruitNum(lastNum);
      this.player.sendMsg(builder.build());
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      guanJiaPart.checkState(1191, (List)null);
   }

   @MsgHandlerAnno
   public void C2S_WearRuneStone_5401(RuneStoneMsg.C2S_WearRuneStone_5401 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode(), msg.getPosition());
      if (!Objects.isNull(heroDao)) {
         if (!HeroModel.isReplacementHero(heroDao.id)) {
            ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
            RuneStoneItem runeItem = itemBagDao.runeStoneBag.getItemByCode(msg.getItemCode());
            if (runeItem == null) {
               logger.info("itemCode={}", msg.getItemCode());
            } else {
               int type = 0;
               FormationGemModel gemModel = (FormationGemModel)this.player.getGameModelPool().getEntity("formationGem", runeItem.id);
               if (Objects.isNull(gemModel)) {
                  FormationGemLvUpModel lvModel = (FormationGemLvUpModel)this.player.getGameModelPool().getEntity("formationGemLvup", runeItem.id);
                  type = lvModel.getType();
               } else {
                  type = gemModel.getType();
               }

               for(Map.Entry<Integer, RuneStoneItem> entry : heroDao.runeStone.entrySet()) {
                  if ((Integer)entry.getKey() != msg.getPosition().getNumber()) {
                     FormationGemModel tempModel = (FormationGemModel)this.player.getGameModelPool().getEntity("formationGem", ((RuneStoneItem)entry.getValue()).id);
                     if (Objects.isNull(tempModel)) {
                        FormationGemLvUpModel lvTempModel = (FormationGemLvUpModel)this.player.getGameModelPool().getEntity("formationGemLvup", ((RuneStoneItem)entry.getValue()).id);
                        if (lvTempModel.getType() == type) {
                           this.player.failure(12022);
                           return;
                        }
                     } else if (tempModel.getType() == type) {
                        this.player.failure(12022);
                        return;
                     }
                  }
               }

               this.heroWearRune(heroDao, msg.getPosition(), runeItem);
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_RUNE_STONE, heroDao);
               RuneStoneMsg.S2C_WearRuneStone_5402.Builder builder = RuneStoneMsg.S2C_WearRuneStone_5402.newBuilder();
               builder.setHeroCode(msg.getHeroCode());
               CommonMsg.RuneStoneWear.Builder wearBuilder = CommonMsg.RuneStoneWear.newBuilder();
               wearBuilder.setPosition(msg.getPosition());
               wearBuilder.setIsLock(runeItem.isLock);
               wearBuilder.setStrengthen(runeItem.strengthen);

               for(Map.Entry<Integer, PropertyModel> entry : runeItem.proMap.entrySet()) {
                  wearBuilder.addPro(runeItem.toHeroBuilder((Integer)entry.getKey(), (PropertyModel)entry.getValue(), runeItem.strengthen));
               }

               wearBuilder.setId(runeItem.id);
               builder.setInfo(wearBuilder);
               builder.setTypeOperate(msg.getTypeOperate());
               builder.setLevSum(heroDao.runeLv);
               this.player.sendMsg(builder.build());
               GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
               giftPart.triggerTimeLimitGift(12, heroDao.runeLv);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UndressRuneStone_5403(RuneStoneMsg.C2S_UndressRuneStone_5403 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode(), msg.getPosition());
      if (!Objects.isNull(heroDao)) {
         RuneStoneItem runeItem = this.UnderDressRune(heroDao, msg.getPosition());
         if (!Objects.isNull(runeItem)) {
            if (runeItem != null) {
               this.player.additemUpdateBuilder(runeItem);
               this.player.senditemUpdateMsg();
            }

            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_RUNE_STONE, heroDao);
            RuneStoneMsg.S2C_UndressRuneStone_5404.Builder builder = RuneStoneMsg.S2C_UndressRuneStone_5404.newBuilder();
            builder.setPosition(msg.getPosition());
            builder.setHeroCode(msg.getHeroCode());
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RuneStoneUpLev_5405(RuneStoneMsg.C2S_RuneStoneUpLev_5405 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode(), msg.getPosition());
      if (!Objects.isNull(heroDao)) {
         RuneStoneItem runeItem = (RuneStoneItem)heroDao.runeStone.get(msg.getPosition().getNumber());
         if (!Objects.isNull(runeItem)) {
            String consumeStr = "";
            ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
            Map<Integer, FormationGemModel> modelMap1 = this.player.getGameModelPool().getMap("formationGem");
            Map<Integer, FormationGemLvUpModel> modelMap2 = this.player.getGameModelPool().getMap("formationGemLvup");
            FormationGemLvUpModel upModel = (FormationGemLvUpModel)this.player.getGameModelPool().getEntity("formationGemLvup", runeItem.id);
            if (upModel == null) {
               FormationGemModel gemModel = (FormationGemModel)this.player.getGameModelPool().getEntity("formationGem", runeItem.id);
               if (gemModel == null) {
                  return;
               }

               if (gemModel.getLvuptarget() == 0) {
                  return;
               }

               ArrayList<Integer> realList = new ArrayList();
               Map<Integer, Integer> checkMap = new HashMap();

               for(int i = 0; i < msg.getConsumeItemList().size(); ++i) {
                  int code = (Integer)msg.getConsumeItemList().get(i);
                  RuneStoneItem consumeItem = itemBagDao.runeStoneBag.getItemByCode(code);
                  realList.add(runeItem.id);
                  if (Objects.isNull(consumeItem)) {
                     return;
                  }

                  if (checkMap.containsKey(code)) {
                     logger.info("itemCode相同={}", code);
                     return;
                  }

                  checkMap.put(code, 1);
               }

               ArrayList<Integer> consumeList = new ArrayList();
               ArrayList<ResourceModel> otherList = new ArrayList();

               for(int i = 0; i < gemModel.getLvupitem().size(); ++i) {
                  if (!modelMap1.containsKey(((ResourceModel)gemModel.getLvupitem().get(i)).getId()) && !modelMap2.containsKey(((ResourceModel)gemModel.getLvupitem().get(i)).getId())) {
                     otherList.add(gemModel.getLvupitem().get(i));
                  } else {
                     for(int j = 0; j < ((ResourceModel)gemModel.getLvupitem().get(i)).getValue(); ++j) {
                        consumeList.add(((ResourceModel)gemModel.getLvupitem().get(i)).getId());
                     }
                  }
               }

               if (realList.isEmpty() || consumeList.isEmpty() || !realList.containsAll(consumeList) || realList.size() != consumeList.size()) {
                  this.player.failure(12014);
                  return;
               }

               if (!this.player.checkResourceNum((List)otherList)) {
                  this.player.failure(12014);
                  return;
               }

               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

               for(int i = 0; i < msg.getConsumeItemList().size(); ++i) {
                  int code = (Integer)msg.getConsumeItemList().get(i);
                  itemBagPart.deleteItemByCode(code, 1, 12, 1222, 0, 0, "");
                  if (consumeStr.equals("")) {
                     consumeStr = code + ",1";
                  } else {
                     consumeStr = consumeStr + "|" + code + ",1";
                  }
               }

               this.player.senditemUpdateMsg();

               for(ResourceModel resourceModel : otherList) {
                  if (consumeStr.equals("")) {
                     consumeStr = resourceModel.getId() + "," + resourceModel.getValue();
                  } else {
                     consumeStr = consumeStr + "|" + resourceModel.getId() + "," + resourceModel.getValue();
                  }
               }

               this.player.delResource((List)otherList, 12, 1222, 0, 0, "");
               runeItem.id = gemModel.getLvuptarget();
               Map<Integer, FormationGemRangeModel> rangeModelMap = this.player.getGameModelPool().getMap("formationGemRange");
               runeItem.proMap.clear();
               FormationGemModel targetModel = (FormationGemModel)this.player.getGameModelPool().getEntity("formationGem", gemModel.getLvuptarget());
               runeItem.proMap.put(0, new PropertyModel(targetModel.getFixQualityId(), targetModel.getFixQualityWay(), (long)targetModel.getFixQualityValue()));

               for(int i = 0; i < targetModel.getRandomQuality().size(); ++i) {
                  int randomProperty = (Integer)targetModel.getRandomQuality().get(i);
                  List<FormationGemRangeModel> list = new ArrayList();

                  for(FormationGemRangeModel value : rangeModelMap.values()) {
                     if (value.getQuality() == randomProperty) {
                        list.add(value);
                     }
                  }

                  if (list.isEmpty()) {
                     logger.error("掉落符石随机资质出错！！！！");
                     break;
                  }

                  List<KeyValFun> funList = new ArrayList();

                  for(FormationGemRangeModel formationGemRangeModel : list) {
                     funList.add(new KeyValFun(formationGemRangeModel.getId(), formationGemRangeModel.getWeight()));
                  }

                  GamePlayer var10000 = this.player;
                  int realId = GamePlayer.countRate(funList);
                  FormationGemRangeModel rangeModel = (FormationGemRangeModel)rangeModelMap.get(realId);

                  for(int lastId = rangeModel.getId(); runeItem.proMap.containsKey(lastId); lastId = rangeModel.getId()) {
                     Collections.shuffle(list);
                     rangeModel = (FormationGemRangeModel)list.get(0);
                  }

                  int value = 0;
                  value = RandomUtil.randInt(Integer.parseInt(rangeModel.getRandomQualityValueRange().split("\\|")[0]), Integer.parseInt(rangeModel.getRandomQualityValueRange().split("\\|")[1]));
                  if (rangeModel.getPefectweight() > 0 && rangeModel.getPefectweight() > RandomUtil.randInt(0, 10000)) {
                     value = Integer.parseInt(rangeModel.getRandomQualityValueRange().split("\\|")[1]);
                  }

                  runeItem.proMap.put(rangeModel.getId(), new PropertyModel(rangeModel.getRandomQualityId(), rangeModel.getRandomQualityWay(), (long)value));
               }

               int levSum = 0;

               for(RuneStoneItem item : heroDao.runeStone.values()) {
                  FormationGemModel tempModel = (FormationGemModel)this.player.getGameModelPool().getEntity("formationGem", item.id);
                  if (Objects.isNull(tempModel)) {
                     FormationGemLvUpModel lvModel = (FormationGemLvUpModel)this.player.getGameModelPool().getEntity("formationGemLvup", item.id);
                     levSum += lvModel.getLv();
                  }
               }

               if (levSum > heroDao.runeLv) {
                  heroDao.runeLv = levSum;
               }

               heroDao.updateOp();
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_RUNE_STONE, heroDao);
               RuneStoneMsg.S2C_RuneStoneUpLev_5406.Builder builder = RuneStoneMsg.S2C_RuneStoneUpLev_5406.newBuilder();
               builder.setHeroCode(msg.getHeroCode());
               CommonMsg.RuneStoneWear.Builder wearBuilder = CommonMsg.RuneStoneWear.newBuilder();
               wearBuilder.setPosition(msg.getPosition());
               wearBuilder.setIsLock(runeItem.isLock);
               wearBuilder.setStrengthen(runeItem.strengthen);

               for(Map.Entry<Integer, PropertyModel> entry : runeItem.proMap.entrySet()) {
                  wearBuilder.addPro(runeItem.toBuilder((Integer)entry.getKey(), (PropertyModel)entry.getValue(), runeItem.strengthen));
               }

               wearBuilder.setId(runeItem.id);
               builder.setInfo(wearBuilder);
               builder.setLevSum(heroDao.runeLv);
               this.player.sendMsg(builder.build());
            } else {
               if (Objects.isNull(upModel) || upModel.getLv() == 10) {
                  this.player.failure(12013);
                  return;
               }

               ArrayList<Integer> consumeList = new ArrayList();
               ArrayList<ResourceModel> otherList = new ArrayList();

               for(int i = 0; i < upModel.getLvUpTool().size(); ++i) {
                  if (!modelMap1.containsKey(((ResourceModel)upModel.getLvUpTool().get(i)).getId()) && !modelMap2.containsKey(((ResourceModel)upModel.getLvUpTool().get(i)).getId())) {
                     otherList.add(upModel.getLvUpTool().get(i));
                  } else {
                     for(int j = 0; j < ((ResourceModel)upModel.getLvUpTool().get(i)).getValue(); ++j) {
                        consumeList.add(((ResourceModel)upModel.getLvUpTool().get(i)).getId());
                     }
                  }
               }

               ArrayList<Integer> realList = new ArrayList();
               Map<Integer, Integer> checkMap = new HashMap();

               for(int i = 0; i < msg.getConsumeItemList().size(); ++i) {
                  int code = (Integer)msg.getConsumeItemList().get(i);
                  RuneStoneItem consumeItem = itemBagDao.runeStoneBag.getItemByCode(code);
                  if (!Objects.isNull(consumeItem)) {
                     realList.add(consumeItem.id);
                  }

                  if (checkMap.containsKey(code)) {
                     logger.info("itemCode相同={}", code);
                     return;
                  }

                  checkMap.put(code, 1);
               }

               if (realList.isEmpty() || consumeList.isEmpty() || !realList.containsAll(consumeList) || realList.size() != consumeList.size()) {
                  this.player.failure(12014);
                  return;
               }

               if (!this.player.checkResourceNum((List)otherList)) {
                  this.player.failure(12014);
                  return;
               }

               if (upModel.getPropertyType() > 0 && upModel.getGemNum() > 0) {
                  if (msg.getExtraCodeList().isEmpty() || msg.getExtraCodeList().size() != upModel.getGemNum()) {
                     this.player.failure(12014);
                     return;
                  }

                  Map<Integer, Integer> extraMap = new HashMap();

                  for(int i = 0; i < msg.getExtraCodeList().size(); ++i) {
                     int code = (Integer)msg.getExtraCodeList().get(i);
                     RuneStoneItem extraItem = itemBagDao.runeStoneBag.getItemByCode(code);
                     if (Objects.isNull(extraItem)) {
                        return;
                     }

                     FormationGemModel gemModel = (FormationGemModel)this.player.getGameModelPool().getEntity("formationGem", extraItem.id);
                     if (gemModel == null || gemModel.getType() != upModel.getType()) {
                        this.player.failure(12015);
                        return;
                     }

                     if (extraMap.containsKey(code)) {
                        logger.info("itemCode相同={}", code);
                        return;
                     }

                     extraMap.put(code, 1);
                  }
               }

               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

               for(int i = 0; i < msg.getConsumeItemList().size(); ++i) {
                  int code = (Integer)msg.getConsumeItemList().get(i);
                  itemBagPart.deleteItemByCode(code, 1, 12, 1222, 0, 0, "");
                  if (consumeStr.equals("")) {
                     consumeStr = code + ",1";
                  } else {
                     consumeStr = consumeStr + "|" + code + ",1";
                  }
               }

               for(int i = 0; i < msg.getExtraCodeList().size(); ++i) {
                  int code = (Integer)msg.getExtraCodeList().get(i);
                  itemBagPart.deleteItemByCode(code, 1, 12, 1222, 0, 0, "");
                  consumeStr = consumeStr + "|" + code + ",1";
               }

               this.player.senditemUpdateMsg();

               for(ResourceModel resourceModel : otherList) {
                  if (consumeStr.equals("")) {
                     consumeStr = resourceModel.getId() + "," + resourceModel.getValue();
                  } else {
                     consumeStr = consumeStr + "|" + resourceModel.getId() + "," + resourceModel.getValue();
                  }
               }

               this.player.delResource((List)otherList, 12, 1222, 0, 0, "");
               runeItem.id = upModel.getTargetGemId();
               FormationGemLvUpModel targetModel = (FormationGemLvUpModel)this.player.getGameModelPool().getEntity("formationGemLvup", upModel.getTargetGemId());
               runeItem.proMap.put(0, new PropertyModel(targetModel.getFixQualityId(), targetModel.getFixQualityWay(), (long)targetModel.getFixQualityValue()));
               int levSum = 0;

               for(RuneStoneItem item : heroDao.runeStone.values()) {
                  FormationGemModel gemModel = (FormationGemModel)this.player.getGameModelPool().getEntity("formationGem", item.id);
                  if (Objects.isNull(gemModel)) {
                     FormationGemLvUpModel lvModel = (FormationGemLvUpModel)this.player.getGameModelPool().getEntity("formationGemLvup", item.id);
                     levSum += lvModel.getLv();
                  }
               }

               if (levSum > heroDao.runeLv) {
                  heroDao.runeLv = levSum;
               }

               heroDao.updateOp();
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_RUNE_STONE, heroDao);
               RuneStoneMsg.S2C_RuneStoneUpLev_5406.Builder builder = RuneStoneMsg.S2C_RuneStoneUpLev_5406.newBuilder();
               builder.setHeroCode(msg.getHeroCode());
               CommonMsg.RuneStoneWear.Builder wearBuilder = CommonMsg.RuneStoneWear.newBuilder();
               wearBuilder.setPosition(msg.getPosition());
               wearBuilder.setIsLock(runeItem.isLock);
               wearBuilder.setStrengthen(runeItem.strengthen);

               for(Map.Entry<Integer, PropertyModel> entry : runeItem.proMap.entrySet()) {
                  wearBuilder.addPro(runeItem.toBuilder((Integer)entry.getKey(), (PropertyModel)entry.getValue(), runeItem.strengthen));
               }

               wearBuilder.setId(runeItem.id);
               builder.setInfo(wearBuilder);
               builder.setLevSum(heroDao.runeLv);
               this.player.sendMsg(builder.build());
            }

            this.player.triggerTask(363, 0, 1L, 1);
            int lastLv = 0;
            FormationGemLvUpModel lvModel = (FormationGemLvUpModel)this.player.getGameModelPool().getEntity("formationGemLvup", runeItem.id);
            if (lvModel != null) {
               lastLv = lvModel.getLv();
            }

            this.player.getOperationMgr().addExtraLog(this.player, 206, String.valueOf(runeItem.id), String.valueOf(lastLv), consumeStr);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RuneStoneInherit_5407(RuneStoneMsg.C2S_RuneStoneInherit_5407 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode(), msg.getPosition());
      if (!Objects.isNull(heroDao)) {
         RuneStoneItem runeItem = (RuneStoneItem)heroDao.runeStone.get(msg.getPosition().getNumber());
         if (!Objects.isNull(runeItem)) {
            ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
            RuneStoneItem consumeItem = itemBagDao.runeStoneBag.getItemByCode(msg.getItemCode());
            if (!Objects.isNull(consumeItem)) {
               if (!consumeItem.proMap.containsKey(msg.getProKey())) {
                  this.player.failure(12016);
               } else if (msg.getTargetKey() != -1 && !runeItem.proMap.containsKey(msg.getTargetKey())) {
                  this.player.failure(12017);
               } else {
                  FormationGemRangeModel rangeModel = (FormationGemRangeModel)this.player.getGameModelPool().getEntity("formationGemRange", msg.getProKey());
                  if (!Objects.isNull(rangeModel)) {
                     for(Integer key : runeItem.proMap.keySet()) {
                        FormationGemRangeModel model = (FormationGemRangeModel)this.player.getGameModelPool().getEntity("formationGemRange", key);
                        if (!Objects.isNull(model) && key != msg.getTargetKey() && model.getTypeLimit() == rangeModel.getTypeLimit() && model.getRandomQualityId() == rangeModel.getRandomQualityId()) {
                           this.player.failure(12018);
                           return;
                        }
                     }

                     if (!this.player.checkResourceNum(rangeModel.getCarryitemType(), rangeModel.getCarryitemId(), rangeModel.getCarryitemNum())) {
                        this.player.failure(12019);
                     } else {
                        if (msg.getTargetKey() != -1) {
                           FormationGemRangeModel targetModel = (FormationGemRangeModel)this.player.getGameModelPool().getEntity("formationGemRange", msg.getTargetKey());
                           if (targetModel.getTypeLimit() == rangeModel.getTypeLimit() && targetModel.getRandomQualityId() == rangeModel.getRandomQualityId() && ((PropertyModel)runeItem.proMap.get(msg.getTargetKey())).getValue() > ((PropertyModel)consumeItem.proMap.get(msg.getProKey())).getValue()) {
                              this.player.failure(12020);
                              return;
                           }
                        }

                        PropertyModel property = new PropertyModel();
                        property.setType(((PropertyModel)consumeItem.proMap.get(msg.getProKey())).getType());
                        property.setWay(((PropertyModel)consumeItem.proMap.get(msg.getProKey())).getWay());
                        property.setValue(((PropertyModel)consumeItem.proMap.get(msg.getProKey())).getValue());
                        if (msg.getTargetKey() != -1) {
                           runeItem.proMap.remove(msg.getTargetKey());
                        }

                        runeItem.proMap.put(msg.getProKey(), property);
                        consumeItem.proMap.remove(msg.getProKey());
                        itemBagDao.updateOp();
                        heroDao.updateOp();
                        this.player.delResource(rangeModel.getCarryitemType(), rangeModel.getCarryitemId(), (long)rangeModel.getCarryitemNum(), 12, 1223, 0, 0, "");
                        this.player.additemUpdateBuilder(consumeItem);
                        this.player.senditemUpdateMsg();
                        HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                        heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_RUNE_STONE, heroDao);
                        RuneStoneMsg.S2C_RuneStoneInherit_5408.Builder builder = RuneStoneMsg.S2C_RuneStoneInherit_5408.newBuilder();
                        builder.setHeroCode(msg.getHeroCode());
                        CommonMsg.RuneStoneWear.Builder wearBuilder = CommonMsg.RuneStoneWear.newBuilder();
                        wearBuilder.setPosition(msg.getPosition());
                        wearBuilder.setIsLock(runeItem.isLock);
                        wearBuilder.setStrengthen(runeItem.strengthen);

                        for(Map.Entry<Integer, PropertyModel> entry : runeItem.proMap.entrySet()) {
                           wearBuilder.addPro(runeItem.toBuilder((Integer)entry.getKey(), (PropertyModel)entry.getValue(), runeItem.strengthen));
                        }

                        wearBuilder.setId(runeItem.id);
                        builder.setInfo(wearBuilder);
                        CommonMsg.RuneStone.Builder itemBuilder = CommonMsg.RuneStone.newBuilder();
                        itemBuilder.setCode(runeItem.code);
                        itemBuilder.setId(runeItem.id);
                        itemBuilder.setIsLock(runeItem.isLock);
                        itemBuilder.setStrengthen(runeItem.strengthen);

                        for(Map.Entry<Integer, PropertyModel> entry : runeItem.proMap.entrySet()) {
                           itemBuilder.addPro(runeItem.toBuilder((Integer)entry.getKey(), (PropertyModel)entry.getValue(), runeItem.strengthen));
                        }

                        for(Map.Entry<Integer, PropertyModel> entry : runeItem.proMap.entrySet()) {
                           itemBuilder.addPro(runeItem.toBuilder((Integer)entry.getKey(), (PropertyModel)entry.getValue(), runeItem.strengthen));
                        }

                        builder.setRuneItem(itemBuilder);
                        this.player.sendMsg(builder.build());
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RuneStoneUpLev_5411(RuneStoneMsg.C2S_RuneStoneUpLev_5411 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      RuneStoneItem runeItem = itemBagDao.runeStoneBag.getItemByCode(msg.getCode());
      if (runeItem == null) {
         logger.info("itemCode={}", msg.getCode());
      } else {
         FormationGemLvUpModel upModel = (FormationGemLvUpModel)this.player.getGameModelPool().getEntity("formationGemLvup", runeItem.id);
         if (!Objects.isNull(upModel) && upModel.getLv() != 10) {
            String consumeStr = "";
            Map<Integer, FormationGemModel> modelMap1 = this.player.getGameModelPool().getMap("formationGem");
            Map<Integer, FormationGemLvUpModel> modelMap2 = this.player.getGameModelPool().getMap("formationGemLvup");
            if (upModel == null) {
               FormationGemModel gemModel = (FormationGemModel)this.player.getGameModelPool().getEntity("formationGem", runeItem.id);
               if (gemModel == null) {
                  return;
               }

               if (gemModel.getLvuptarget() == 0) {
                  return;
               }

               ArrayList<Integer> realList = new ArrayList();

               for(int i = 0; i < msg.getConsumeItemList().size(); ++i) {
                  int code = (Integer)msg.getConsumeItemList().get(i);
                  RuneStoneItem consumeItem = itemBagDao.runeStoneBag.getItemByCode(code);
                  realList.add(runeItem.id);
                  if (Objects.isNull(consumeItem)) {
                     return;
                  }
               }

               ArrayList<Integer> consumeList = new ArrayList();
               ArrayList<ResourceModel> otherList = new ArrayList();

               for(int i = 0; i < gemModel.getLvupitem().size(); ++i) {
                  if (!modelMap1.containsKey(((ResourceModel)gemModel.getLvupitem().get(i)).getId()) && !modelMap2.containsKey(((ResourceModel)gemModel.getLvupitem().get(i)).getId())) {
                     otherList.add(gemModel.getLvupitem().get(i));
                  } else {
                     for(int j = 0; j < ((ResourceModel)gemModel.getLvupitem().get(i)).getValue(); ++j) {
                        consumeList.add(((ResourceModel)gemModel.getLvupitem().get(i)).getId());
                     }
                  }
               }

               if (realList.isEmpty() || consumeList.isEmpty() || !realList.containsAll(consumeList) || realList.size() != consumeList.size()) {
                  this.player.failure(12014);
                  return;
               }

               if (!this.player.checkResourceNum((List)otherList)) {
                  this.player.failure(12014);
                  return;
               }

               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

               for(int i = 0; i < msg.getConsumeItemList().size(); ++i) {
                  int code = (Integer)msg.getConsumeItemList().get(i);
                  itemBagPart.deleteItemByCode(code, 1, 12, 1222, 0, 0, "");
                  if (consumeStr.equals("")) {
                     consumeStr = code + ",1";
                  } else {
                     consumeStr = consumeStr + "|" + code + ",1";
                  }
               }

               this.player.senditemUpdateMsg();

               for(ResourceModel resourceModel : otherList) {
                  if (consumeStr.equals("")) {
                     consumeStr = resourceModel.getId() + "," + resourceModel.getValue();
                  } else {
                     consumeStr = consumeStr + "|" + resourceModel.getId() + "," + resourceModel.getValue();
                  }
               }

               this.player.delResource((List)otherList, 12, 1222, 0, 0, "");
               runeItem.id = upModel.getTargetGemId();
               FormationGemLvUpModel targetModel = (FormationGemLvUpModel)this.player.getGameModelPool().getEntity("formationGemLvup", upModel.getTargetGemId());
               runeItem.proMap.put(0, new PropertyModel(targetModel.getFixQualityId(), targetModel.getFixQualityWay(), (long)targetModel.getFixQualityValue()));
               itemBagDao.updateOp();
            }

            RuneStoneMsg.S2C_RuneStoneUpLev_5412.Builder builder = RuneStoneMsg.S2C_RuneStoneUpLev_5412.newBuilder();
            CommonMsg.RuneStone.Builder itemBuilder = CommonMsg.RuneStone.newBuilder();
            itemBuilder.setCode(runeItem.code);
            itemBuilder.setId(runeItem.id);
            itemBuilder.setIsLock(runeItem.isLock);
            itemBuilder.setStrengthen(runeItem.strengthen);

            for(Map.Entry<Integer, PropertyModel> entry : runeItem.proMap.entrySet()) {
               itemBuilder.addPro(runeItem.toBuilder((Integer)entry.getKey(), (PropertyModel)entry.getValue(), runeItem.strengthen));
            }

            builder.setInfo(itemBuilder);
            this.player.sendMsg(builder.build());
            this.player.triggerTask(363, 0, 1L, 1);
            int lastLv = 0;
            FormationGemLvUpModel targetModel = (FormationGemLvUpModel)this.player.getGameModelPool().getEntity("formationGemLvup", runeItem.id);
            if (targetModel != null) {
               lastLv = targetModel.getLv();
            }

            this.player.getOperationMgr().addExtraLog(this.player, 206, String.valueOf(runeItem.id), String.valueOf(lastLv), consumeStr);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RuneStoneDecompose_7165(RuneStoneMsg.C2S_RuneStoneDecompose_5413 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      if (!msg.getCodeList().isEmpty()) {
         Map<Integer, Integer> checkMap = new HashMap();

         for(int i = 0; i < msg.getCodeList().size(); ++i) {
            RuneStoneItem runeItem = itemBagDao.runeStoneBag.getItemByCode((Integer)msg.getCodeList().get(i));
            if (runeItem == null) {
               logger.info("itemCode={}", msg.getCodeList().get(i));
               return;
            }

            if (checkMap.containsKey(msg.getCodeList().get(i))) {
               logger.info("itemCode相同={}", msg.getCodeList().get(i));
               return;
            }

            checkMap.put(msg.getCodeList().get(i), 1);
         }

         List<ResourceModel> sellList = new ArrayList();

         for(int i = 0; i < msg.getCodeList().size(); ++i) {
            RuneStoneItem runeItem = itemBagDao.runeStoneBag.getItemByCode((Integer)msg.getCodeList().get(i));
            FormationGemModel gemModel = (FormationGemModel)this.player.getGameModelPool().getEntity("formationGem", runeItem.id);
            if (Objects.isNull(gemModel)) {
               FormationGemLvUpModel lvModel = (FormationGemLvUpModel)this.player.getGameModelPool().getEntity("formationGemLvup", runeItem.id);
               if (Objects.isNull(lvModel)) {
                  continue;
               }

               sellList.addAll(lvModel.getBlockItem());
            } else {
               sellList.addAll(gemModel.getBlockItem());
            }

            if (runeItem.strengthen > 0) {
               String formationStrengthCost = ApplicationContextProvider.getConfigString("formationGemStrengthCost", "2|1001|1,2|1001|2");
               String[] gemCost = formationStrengthCost.split(",");

               for(int lev = 0; lev < runeItem.strengthen; ++lev) {
                  String[] cost = gemCost[lev].split("\\|");
                  sellList.add(new ResourceModel(Integer.parseInt(cost[0]), Integer.parseInt(cost[1]), Integer.parseInt(cost[2])));
               }
            }
         }

         List<ResourceModel> realList = new ArrayList();

         for(int i = 0; i < sellList.size(); ++i) {
            boolean has = false;
            int value = ((ResourceModel)sellList.get(i)).getValue();
            int id = ((ResourceModel)sellList.get(i)).getId();
            int type = ((ResourceModel)sellList.get(i)).getType();

            for(ResourceModel model : realList) {
               if (id == model.getId()) {
                  has = true;
                  model.setValue(model.getValue() + value);
                  break;
               }
            }

            if (!has) {
               realList.add(new ResourceModel(type, id, value));
            }
         }

         this.player.addResource(realList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1224, 0, 1, String.valueOf(this.player.getPlayerId()));
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

         for(int i = 0; i < msg.getCodeList().size(); ++i) {
            itemBagPart.deleteItemByCode((Integer)msg.getCodeList().get(i), 1, 12, 1224, 0, 0, "");
         }

         this.player.senditemUpdateMsg();
         RuneStoneMsg.S2C_RuneStoneDecompose_5414.Builder builder = RuneStoneMsg.S2C_RuneStoneDecompose_5414.newBuilder();
         builder.setResult(1);
         this.player.sendMsg(builder.build());
      }
   }

   public HeroDao getHeroDao(int heroCode, CommonMsg.WearPosition posion) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (heroDao == null) {
         logger.info("英雄不存在：" + heroCode);
         return null;
      } else {
         HeroWearPart wearPart = (HeroWearPart)this.player.getMgrPart(HeroWearPart.class);
         return !wearPart.isEnableWear(heroDao, posion, CommonMsg.WearType.WEARTYPE_RUNESTONE) ? null : heroDao;
      }
   }

   private RuneStoneItem UnderDressRune(HeroDao heroDao, CommonMsg.WearPosition position) {
      RuneStoneItem runeItem = (RuneStoneItem)heroDao.runeStone.get(position.getNumber());
      if (runeItem != null) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         RuneStoneItem newItem = itemBagPart.addRuneStoneItem(runeItem, 12, 1221, 0, 0, "");
         if (newItem != null) {
            this.player.additemUpdateBuilder(newItem);
            this.player.senditemUpdateMsg();
         }

         heroDao.runeStone.remove(position.getNumber());
         heroDao.updateOp();
         return newItem;
      } else {
         return null;
      }
   }

   private void heroWearRune(HeroDao heroDao, CommonMsg.WearPosition position, RuneStoneItem runeItem) {
      RuneStoneItem oldItem = (RuneStoneItem)heroDao.runeStone.get(position.getNumber());
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      if (oldItem == null) {
         heroDao.runeStone.put(position.getNumber(), runeItem);
      } else {
         RuneStoneItem oldRuneStone = itemBagPart.addRuneStoneItem(oldItem, 12, 1220, 0, 0, "");
         if (oldRuneStone != null) {
            this.player.additemUpdateBuilder(oldRuneStone);
            this.player.senditemUpdateMsg();
         }

         heroDao.runeStone.put(position.getNumber(), runeItem);
      }

      int levSum = 0;

      for(RuneStoneItem item : heroDao.runeStone.values()) {
         FormationGemModel gemModel = (FormationGemModel)this.player.getGameModelPool().getEntity("formationGem", item.id);
         if (Objects.isNull(gemModel)) {
            FormationGemLvUpModel lvModel = (FormationGemLvUpModel)this.player.getGameModelPool().getEntity("formationGemLvup", item.id);
            levSum += lvModel.getLv();
         }
      }

      if (levSum > heroDao.runeLv) {
         heroDao.runeLv = levSum;
      }

      heroDao.updateOp();
      itemBagPart.deleteItemByCode(runeItem.code, 1, 12, 1220, 0, 0, "");
      this.player.senditemUpdateMsg();
   }

   public FormationGemModel getGemModel(FormationGemGetModel model) {
      ArrayList<KeyValFun> funList = new ArrayList();

      for(int i = 0; i < model.getRuneRandom().size(); ++i) {
         funList.add(new KeyValFun(((KeyValFun)model.getRuneRandom().get(i)).getKey(), ((KeyValFun)model.getRuneRandom().get(i)).getVal()));
      }

      GamePlayer var10000 = this.player;
      int randomId = GamePlayer.countRate(funList);
      Map<Integer, FormationGemModel> map = this.player.getGameModelPool().getMap("formationGem");
      List<FormationGemModel> list = new ArrayList();

      for(FormationGemModel value : map.values()) {
         if (value.getQuality() == randomId) {
            list.add(value);
         }
      }

      if (list.isEmpty()) {
         logger.error("探寻符石出错：" + randomId);
         return null;
      } else {
         Collections.shuffle(list);
         FormationGemModel gemModel = (FormationGemModel)list.get(0);
         return gemModel;
      }
   }

   public FormationGemModel getStaticGem(int key, int value) {
      ArrayList<KeyValFun> funList = new ArrayList();
      funList.add(new KeyValFun(key, value));
      GamePlayer var10000 = this.player;
      int randomId = GamePlayer.countRate(funList);
      Map<Integer, FormationGemModel> map = this.player.getGameModelPool().getMap("formationGem");
      List<FormationGemModel> list = new ArrayList();

      for(FormationGemModel model : map.values()) {
         if (model.getQuality() == randomId) {
            list.add(model);
         }
      }

      if (list.isEmpty()) {
         logger.error("探寻符石出错：" + randomId);
         return null;
      } else {
         Collections.shuffle(list);
         FormationGemModel gemModel = (FormationGemModel)list.get(0);
         return gemModel;
      }
   }

   @MsgHandlerAnno
   public void C2S_BagStoneLock_5422(RuneStoneMsg.C2S_BagStoneLock_5422 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      RuneStoneItem runeItem = itemBagDao.runeStoneBag.getItemByCode(msg.getItemCode());
      if (runeItem == null) {
         logger.info("itemCode={}", msg.getItemCode());
      } else {
         if (msg.getTypeOperate() == 1) {
            runeItem.isLock = true;
         } else {
            runeItem.isLock = false;
         }

         itemBagDao.updateOp();
         RuneStoneMsg.S2C_BagStoneLock_5423.Builder builder = RuneStoneMsg.S2C_BagStoneLock_5423.newBuilder();
         builder.setResult(1);
         builder.setItemCode(msg.getItemCode());
         builder.setTypeOperate(msg.getTypeOperate());
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroStoneLock_5420(RuneStoneMsg.C2S_HeroStoneLock_5420 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode(), msg.getPosition());
      if (!Objects.isNull(heroDao)) {
         RuneStoneItem runeItem = (RuneStoneItem)heroDao.runeStone.get(msg.getPosition().getNumber());
         if (runeItem != null) {
            runeItem.isLock = msg.getTypeOperate() == 1;
            heroDao.updateOp();
            RuneStoneMsg.S2C_HeroStoneLock_5421.Builder builder = RuneStoneMsg.S2C_HeroStoneLock_5421.newBuilder();
            builder.setHeroCode(msg.getHeroCode());
            builder.setPosition(msg.getPosition());
            builder.setTypeOperate(msg.getTypeOperate());
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ComposeStone_5418(RuneStoneMsg.C2S_ComposeStone_5418 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      if (!msg.getItemCodeList().isEmpty()) {
         Map<Integer, Integer> checkMap = new HashMap();

         for(int i = 0; i < msg.getItemCodeList().size(); ++i) {
            RuneStoneItem runeItem = itemBagDao.runeStoneBag.getItemByCode((Integer)msg.getItemCodeList().get(i));
            if (runeItem == null) {
               logger.info("itemCode={}", msg.getItemCodeList().get(i));
               return;
            }

            if (checkMap.containsKey(msg.getItemCodeList().get(i))) {
               logger.info("itemCode相同={}", msg.getItemCodeList().get(i));
               return;
            }

            checkMap.put(msg.getItemCodeList().get(i), 1);
         }

         List<Integer> consumeList = new ArrayList();

         for(int i = 0; i < msg.getItemCodeList().size(); ++i) {
            RuneStoneItem runeItem = itemBagDao.runeStoneBag.getItemByCode((Integer)msg.getItemCodeList().get(i));
            consumeList.add(runeItem.id);
         }

         Map<Integer, FormationGemModel> modelMap = this.player.getGameModelPool().getMap("formationGem");
         List<Integer> realList = new ArrayList();
         List<ResourceModel> otherConsume = new ArrayList();

         for(int i = 0; i < msg.getTargetIdList().size(); ++i) {
            FormationGemModel model = null;
            List<FormationGemModel> list = new ArrayList();

            for(FormationGemModel value : modelMap.values()) {
               if (value.getLvuptarget() == (Integer)msg.getTargetIdList().get(i)) {
                  list.add(value);
               }
            }

            if (!list.isEmpty()) {
               model = (FormationGemModel)list.get(0);

               for(ResourceModel resourceModel : model.getComposeItem()) {
                  if (modelMap.containsKey(resourceModel.getId())) {
                     for(int j = 0; j < resourceModel.getValue(); ++j) {
                        realList.add(resourceModel.getId());
                     }
                  } else {
                     otherConsume.add(resourceModel);
                  }
               }
            }
         }

         if (!realList.isEmpty() && !consumeList.isEmpty() && realList.size() == consumeList.size() && this.checkList(realList, consumeList)) {
            if (!this.player.checkResourceNum(otherConsume)) {
               this.player.failure(12021);
            } else {
               List<ResourceModel> gainList = new ArrayList();

               for(int i = 0; i < msg.getTargetIdList().size(); ++i) {
                  gainList.add(new ResourceModel(2, (Integer)msg.getTargetIdList().get(i), 1));
               }

               this.player.delResource((List)otherConsume, 12, 1228, 0, 0, "");
               this.player.addResource(gainList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1228, 0, 1, String.valueOf(this.player.getPlayerId()));
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

               for(int i = 0; i < msg.getItemCodeList().size(); ++i) {
                  itemBagPart.deleteItemByCode((Integer)msg.getItemCodeList().get(i), 1, 12, 1228, 0, 0, "");
               }

               this.player.senditemUpdateMsg();
               RuneStoneMsg.S2C_ComposeStone_5419.Builder builder = RuneStoneMsg.S2C_ComposeStone_5419.newBuilder();
               builder.setResult(1);
               this.player.sendMsg(builder.build());
            }
         } else {
            this.player.failure(12021);
         }
      }
   }

   public boolean checkList(List<Integer> realList, List<Integer> comsumeList) {
      Map<Integer, Integer> realMap = new HashMap();

      for(Integer id : realList) {
         MapUtil.mapPlusInt(realMap, id, 1);
      }

      Map<Integer, Integer> consumeMap = new HashMap();

      for(Integer id : comsumeList) {
         MapUtil.mapPlusInt(consumeMap, id, 1);
      }

      for(Map.Entry<Integer, Integer> entry : realMap.entrySet()) {
         if (!consumeMap.containsKey(entry.getKey())) {
            return false;
         }

         if (consumeMap.get(entry.getKey()) != entry.getValue()) {
            return false;
         }
      }

      for(Map.Entry<Integer, Integer> entry : consumeMap.entrySet()) {
         if (!realMap.containsKey(entry.getKey())) {
            return false;
         }

         if (realMap.get(entry.getKey()) != entry.getValue()) {
            return false;
         }
      }

      return true;
   }

   public void heroReborn(HeroDao heroDao) {
      if (heroDao.runeLv != 0 || !heroDao.runeStone.isEmpty()) {
         List<RuneStoneItem> runeItemList = new ArrayList();
         if (!heroDao.runeStone.isEmpty()) {
            runeItemList.addAll(heroDao.runeStone.values());
         }

         if (!runeItemList.isEmpty()) {
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

            for(RuneStoneItem rune : runeItemList) {
               RuneStoneItem newRune = itemBagPart.addRuneStoneItem(rune, 26, 2603, 0, 0, "");
               this.player.additemUpdateBuilder(newRune);
            }

            this.player.senditemUpdateMsg();
         }

         heroDao.runeStone.clear();
         heroDao.runeLv = 0;
         heroDao.updateOp();
      }
   }

   public void loginHandle() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.runeStoneFlush <= 0) {
         if (this.player.getPublicDao().lv < 120) {
            playerExtend.runeStoneFlush = 1;
            this.player.updatePlayerExtend(13);
         } else {
            ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
            Map<Integer, FormationGemLvUpModel> gemMap = this.player.getGameModelPool().getMap("formationGemLvup");
            boolean flag = false;

            for(RuneStoneItem item : itemBagDao.runeStoneBag.getMap().values()) {
               if (gemMap.containsKey(item.id)) {
                  FormationGemLvUpModel model = (FormationGemLvUpModel)gemMap.get(item.id);
                  if (model.getType() == 3 && item.proMap.containsKey(0) && ((PropertyModel)item.proMap.get(0)).getValue() != (long)model.getFixQualityValue() && ((PropertyModel)item.proMap.get(0)).getType() == model.getFixQualityId() && ((PropertyModel)item.proMap.get(0)).getWay() == model.getFixQualityWay()) {
                     item.proMap.put(0, new PropertyModel(model.getFixQualityId(), model.getFixQualityWay(), (long)model.getFixQualityValue()));
                     flag = true;
                  }
               }
            }

            if (flag) {
               itemBagDao.updateOp();
            }

            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);

            for(HeroDao heroDao : heroBagPart.getHeroDaoMap().values()) {
               if (!heroDao.runeStone.isEmpty()) {
                  boolean heroFlush = false;

                  for(RuneStoneItem item : heroDao.runeStone.values()) {
                     if (gemMap.containsKey(item.id)) {
                        FormationGemLvUpModel model = (FormationGemLvUpModel)gemMap.get(item.id);
                        if (model.getType() == 3 && item.proMap.containsKey(0) && ((PropertyModel)item.proMap.get(0)).getValue() != (long)model.getFixQualityValue() && ((PropertyModel)item.proMap.get(0)).getType() == model.getFixQualityId() && ((PropertyModel)item.proMap.get(0)).getWay() == model.getFixQualityWay()) {
                           item.proMap.put(0, new PropertyModel(model.getFixQualityId(), model.getFixQualityWay(), (long)model.getFixQualityValue()));
                           heroFlush = true;
                        }
                     }
                  }

                  if (heroFlush) {
                     heroDao.updateOp();
                  }
               }
            }

            playerExtend.runeStoneFlush = 1;
            this.player.updatePlayerExtend(13);
         }
      }
   }

   public void gmOp(String op) {
      String[] str = op.split(",");
      int id = Integer.parseInt(str[0]);
      List<Integer> list = new ArrayList();

      for(int i = 1; i < str.length; ++i) {
         list.add(Integer.parseInt(str[i]));
      }

      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      RuneStoneItem newItem = itemBagPart.addMaxRuneStone(id, list, 2, 208, 0, 0, "");
      this.player.additemUpdateBuilder(newItem);
      this.player.senditemUpdateMsg();
   }

   @MsgHandlerAnno
   public void C2S_RuneStoneHeroStrengthen_5426(RuneStoneMsg.C2S_RuneStoneHeroStrengthen_5426 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode(), msg.getPosition());
      if (!Objects.isNull(heroDao)) {
         RuneStoneItem runeItem = (RuneStoneItem)heroDao.runeStone.get(msg.getPosition().getNumber());
         if (runeItem != null) {
            int formationStrengthLimit = ApplicationContextProvider.getConfigInt("formationStrengthLimit", 2);
            if (runeItem.strengthen >= formationStrengthLimit) {
               this.player.failure(12024);
            } else {
               String formationStrength = ApplicationContextProvider.getConfigString("formationGemStrength", "2000|4000");
               String[] gemStrength = formationStrength.split("\\|");
               if (runeItem.strengthen >= gemStrength.length) {
                  logger.info("已经精炼到最大等级：{}", runeItem.strengthen);
                  this.player.failure(12024);
               } else {
                  Map<Integer, FormationGemLvUpModel> gemMap = this.player.getGameModelPool().getMap("formationGemLvup");
                  if (gemMap.containsKey(runeItem.id)) {
                     String formationStrengthCost = ApplicationContextProvider.getConfigString("formationGemStrengthCost", "2|1001|1,2|1001|2");
                     String[] gemCost = formationStrengthCost.split(",");
                     if (runeItem.strengthen < gemCost.length) {
                        String[] cost = gemCost[runeItem.strengthen].split("\\|");
                        if (!this.player.checkResourceNum(Integer.parseInt(cost[0]), Integer.parseInt(cost[1]), Integer.parseInt(cost[2]))) {
                           this.player.failure(12025);
                        } else {
                           this.player.delResource(Integer.parseInt(cost[0]), Integer.parseInt(cost[1]), (long)Integer.parseInt(cost[2]), 12, 1234, 0, 0, "");
                           ++runeItem.strengthen;
                           heroDao.updateOp();
                           HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                           heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_RUNE_STONE, heroDao);
                           RuneStoneMsg.S2C_RuneStoneHeroStrength_5427.Builder builder = RuneStoneMsg.S2C_RuneStoneHeroStrength_5427.newBuilder();
                           builder.setHeroCode(msg.getHeroCode());
                           builder.setPosition(msg.getPosition());
                           CommonMsg.RuneStoneWear.Builder wearBuilder = CommonMsg.RuneStoneWear.newBuilder();
                           wearBuilder.setPosition(msg.getPosition());
                           wearBuilder.setIsLock(runeItem.isLock);
                           wearBuilder.setStrengthen(runeItem.strengthen);

                           for(Map.Entry<Integer, PropertyModel> entry : runeItem.proMap.entrySet()) {
                              wearBuilder.addPro(runeItem.toHeroBuilder((Integer)entry.getKey(), (PropertyModel)entry.getValue(), runeItem.strengthen));
                           }

                           wearBuilder.setId(runeItem.id);
                           builder.setInfo(wearBuilder);
                           this.player.sendMsg(builder.build());
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
