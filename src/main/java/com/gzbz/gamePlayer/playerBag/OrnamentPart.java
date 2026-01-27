package com.gzbz.gamePlayer.playerBag;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.gameDefine.CodeDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroWearPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.HeroModel;
import com.gzbz.model.StampBasicPropertyModel;
import com.gzbz.model.StampExtraPropertyModel;
import com.gzbz.model.StampModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.EquipMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class OrnamentPart extends PlayerPart {
   public Test test = null;

   @MsgHandlerAnno
   public void C2S_OrnamentUpLev_7151(EquipMsg.C2S_OrnamentUpLev_7151 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.treasureBag.getItemByCode(msg.getCode());
      if (itemBase == null) {
         this.logger.info("itemCode={}", msg.getCode());
      } else if (!(itemBase instanceof OrnamentItem)) {
         this.player.failure(6);
      } else {
         OrnamentItem ornamentItem = (OrnamentItem)itemBase;
         StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ornamentItem.id);
         if (msg.getNum() > 0 && !this.player.checkResourceNum(((ResourceModel)stampModel.getLevUpConsume().get(0)).getType(), ((ResourceModel)stampModel.getLevUpConsume().get(0)).getId(), msg.getNum())) {
            this.player.failure(12007);
         } else if (msg.getNum() >= 0 && msg.getNum() + ornamentItem.lev <= ((ResourceModel)stampModel.getLevUpConsume().get(0)).getValue()) {
            if (!msg.getConsumeCodeList().isEmpty()) {
               Map<Integer, Integer> checkMap = new HashMap();

               for(int i = 0; i < msg.getConsumeCodeList().size(); ++i) {
                  ItemBase consumeItem = itemBagDao.getItemByCode((Integer)msg.getConsumeCodeList().get(i));
                  if (consumeItem == null) {
                     this.player.failure(12007);
                     return;
                  }

                  if (checkMap.containsKey(msg.getConsumeCodeList().get(i))) {
                     return;
                  }

                  checkMap.put(msg.getConsumeCodeList().get(i), 1);
                  if ((Integer)msg.getConsumeCodeList().get(i) == ornamentItem.code) {
                     return;
                  }
               }
            }

            Map<Integer, ResourceModel> map = new HashMap();
            List<ResourceModel> sellList = new ArrayList();

            for(int i = 0; i < msg.getConsumeCodeList().size(); ++i) {
               ItemBase consumeItem = itemBagDao.getItemByCode((Integer)msg.getConsumeCodeList().get(i));
               OrnamentItem consumeOrnament = (OrnamentItem)consumeItem;
               StampModel consumeModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", consumeOrnament.id);

               for(int k = 0; k < consumeModel.getSell().size(); ++k) {
                  int id = ((ResourceModel)consumeModel.getSell().get(k)).getId();
                  int value = ((ResourceModel)consumeModel.getSell().get(k)).getValue();
                  int type = ((ResourceModel)consumeModel.getSell().get(k)).getType();
                  if (map.containsKey(id)) {
                     ((ResourceModel)map.get(id)).setValue(((ResourceModel)map.get(id)).getValue() + value);
                  } else {
                     map.put(id, new ResourceModel(type, id, value));
                  }
               }

               int clearNum = consumeOrnament.clearNum1 + consumeOrnament.clearNum2 + consumeOrnament.clearNum3 + consumeOrnament.clearNum4 + consumeOrnament.clearNum5;

               for(int j = 0; j < clearNum; ++j) {
                  for(int k = 0; k < consumeModel.getClearConsume().size(); ++k) {
                     int id = ((ResourceModel)consumeModel.getClearConsume().get(k)).getId();
                     int value = ((ResourceModel)consumeModel.getClearConsume().get(k)).getValue();
                     int type = ((ResourceModel)consumeModel.getClearConsume().get(k)).getType();
                     if (map.containsKey(id)) {
                        ((ResourceModel)map.get(id)).setValue(((ResourceModel)map.get(id)).getValue() + value);
                     } else {
                        map.put(id, new ResourceModel(type, id, value));
                     }
                  }
               }
            }

            int needConsume = 0;
            int realConsume = 0;
            int leftNum = 0;
            int consumeNum = ((ResourceModel)stampModel.getLevUpConsume().get(0)).getValue() - ornamentItem.lev;
            if (map.containsKey(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId())) {
               int totalNum = ((ResourceModel)map.get(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId())).getValue();
               if (consumeNum > totalNum + msg.getNum()) {
                  needConsume = totalNum + msg.getNum();
               } else {
                  needConsume = consumeNum;
               }

               int tempConsume = needConsume - totalNum;
               if (tempConsume > 0) {
                  leftNum = 0;
                  realConsume = msg.getNum();
               } else {
                  leftNum = tempConsume * -1;
                  realConsume = 0;
               }

               if (leftNum <= 0) {
                  map.remove(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId());
               } else {
                  ((ResourceModel)map.get(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId())).setValue(leftNum);
               }
            } else if (msg.getNum() - consumeNum > 0) {
               realConsume = consumeNum;
               needConsume = consumeNum;
            } else {
               realConsume = msg.getNum();
               needConsume = msg.getNum();
            }

            sellList.addAll(map.values());

            for(int i = 0; i < msg.getConsumeCodeList().size(); ++i) {
               ItemBase consumeItem = itemBagDao.getItemByCode((Integer)msg.getConsumeCodeList().get(i));
               OrnamentItem consumeOrnament = (OrnamentItem)consumeItem;
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               itemBagPart.deleteItemByCode(consumeOrnament.code, 1, 12, 1210, 0, 0, "");
               this.player.senditemUpdateMsg();
            }

            if (!sellList.isEmpty()) {
               this.player.addResource(sellList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1210, ornamentItem.id, 1, String.valueOf(this.player.getPlayerId()));
            }

            if (realConsume > 0) {
               List<ItemBase> list = itemBagDao.getItemById(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId());
               int bagTotal = 0;

               for(ItemBase base : list) {
                  bagTotal += base.num;
               }

               if (bagTotal < realConsume) {
                  realConsume = bagTotal;
               }

               this.player.delResource(((ResourceModel)stampModel.getLevUpConsume().get(0)).getType(), ((ResourceModel)stampModel.getLevUpConsume().get(0)).getId(), (long)realConsume, 12, 1210, 0, 0, "");
            }

            ornamentItem.lev += needConsume;
            itemBagDao.updateOp();
            this.player.additemUpdateBuilder(ornamentItem);
            this.player.senditemUpdateMsg();
            EquipMsg.S2C_OrnamentUpLev_7152.Builder builder = EquipMsg.S2C_OrnamentUpLev_7152.newBuilder();
            builder.setCode(msg.getCode());
            builder.setLev(ornamentItem.lev);
            this.player.sendMsg(builder.build());
         } else {
            this.player.failure(6);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OrnamentUpStar_7153(EquipMsg.C2S_OrnamentUpStar_7153 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.getItemByCode(msg.getCode());
      if (itemBase == null) {
         this.logger.info("itemCode={}", msg.getCode());
      } else if (itemBase instanceof OrnamentItem) {
         OrnamentItem ornamentItem = (OrnamentItem)itemBase;
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ornamentItem.id);
         if (stampModel != null) {
            if (stampModel.getTargetStamp() != 0) {
               if (((ResourceModel)stampModel.getLevUpConsume().get(0)).getValue() > ornamentItem.lev) {
                  this.player.failure(12006);
               } else if (stampModel.getTargetStamp() != 0) {
                  if (!this.player.checkResourceNum((List)stampModel.getStarUpConsume())) {
                     this.player.failure(12008);
                  } else {
                     this.player.delResource((List)stampModel.getStarUpConsume(), 12, 1211, 0, 0, "");
                     int oldLv = ornamentItem.lev;
                     itemBagPart.deleteItemByCode(ornamentItem.code, 1, 12, 1211, 0, 0, "");
                     this.player.senditemUpdateMsg();

                     try {
                        OrnamentItem newItem = this.addOrnamentUpStar(ornamentItem, itemBagPart, stampModel.getTargetStamp(), 12, 1211, 0, 0, "");
                        if (newItem != null) {
                           this.player.additemUpdateBuilder(newItem);
                           this.player.senditemUpdateMsg();
                        }

                        EquipMsg.S2C_OrnamentUpStar_7154.Builder builder = EquipMsg.S2C_OrnamentUpStar_7154.newBuilder();
                        builder.setInfo(this.getOrnamentInfo(newItem).build());
                        this.player.sendMsg(builder.build());
                        int num1 = 0;
                        int num2 = 0;

                        for(int i = 0; i < stampModel.getStarUpConsume().size(); ++i) {
                           if (((ResourceModel)stampModel.getStarUpConsume().get(i)).getId() == 1009) {
                              num2 = ((ResourceModel)stampModel.getStarUpConsume().get(i)).getValue();
                           }

                           if (((ResourceModel)stampModel.getStarUpConsume().get(i)).getId() == 1011) {
                              num2 = ((ResourceModel)stampModel.getStarUpConsume().get(i)).getValue();
                           }
                        }

                        this.player.getOperationMgr().addExtraLog(this.player, 133, stampModel.getId() + "", stampModel.getName(), oldLv + "", "0", num1 + "", num2 + "");
                        StampModel nextStampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", newItem.id);
                        GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                        giftPart.triggerTimeLimitGift(10, nextStampModel.getStar());
                     } catch (Exception e) {
                        this.logger.error(e.getMessage());
                     }

                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_BagOrnamentPro_7187(EquipMsg.C2S_BagOrnamentPro_7187 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.getItemByCode(msg.getCode());
      if (itemBase == null) {
         this.logger.info("itemCode={}", msg.getCode());
      } else if (itemBase instanceof OrnamentItem) {
         OrnamentItem ornamentItem = (OrnamentItem)itemBase;
         EquipMsg.S2C_BagOrnamentPro_7188.Builder builder = EquipMsg.S2C_BagOrnamentPro_7188.newBuilder();
         Map<Integer, PropertyModel> calcPro = new LinkedHashMap();
         Map<Integer, StampExtraPropertyModel> modelMap = this.player.getGameModelPool().getMap("StampExtraProperty");

         for(Map.Entry<Integer, PropertyModel> entry : ornamentItem.proMap.entrySet()) {
            if (!modelMap.containsKey(entry.getKey())) {
               builder.addUpPro(ornamentItem.toBuilder((PropertyModel)entry.getValue()));
            } else {
               StampExtraPropertyModel model = (StampExtraPropertyModel)modelMap.get(entry.getKey());
               if (model.getNextid() != 0 && modelMap.containsKey(model.getNextid())) {
                  int clearNum = ornamentItem.clearNum1 + ornamentItem.clearNum2 + ornamentItem.clearNum3 + ornamentItem.clearNum4 + ornamentItem.clearNum5;
                  long value = 0L;
                  StampExtraPropertyModel newModel = (StampExtraPropertyModel)modelMap.get(model.getNextid());
                  if (clearNum <= newModel.getClearMaxTime()) {
                     value = (long)((newModel.getPropertyValueMax() - newModel.getPropertyValueMin()) * clearNum / newModel.getClearMaxTime() + newModel.getPropertyValueMin());
                     if (value > (long)newModel.getPropertyValueMax()) {
                        value = (long)newModel.getPropertyValueMax();
                     }

                     if (value < ((PropertyModel)entry.getValue()).getValue()) {
                        value = ((PropertyModel)entry.getValue()).getValue();
                     }
                  } else {
                     value = (long)newModel.getPropertyValueMax();
                  }

                  calcPro.put(model.getNextid(), new PropertyModel(((PropertyModel)entry.getValue()).getType(), ((PropertyModel)entry.getValue()).getWay(), value));
               } else {
                  builder.addUpPro(ornamentItem.toBuilder((PropertyModel)entry.getValue()));
               }
            }
         }

         builder.setCode(msg.getCode());

         for(PropertyModel propertyModel : calcPro.values()) {
            builder.addUpPro(ornamentItem.toBuilder(propertyModel));
         }

         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_OrnamentClear_7155(EquipMsg.C2S_OrnamentClear_7155 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.getItemByCode(msg.getCode());
      if (itemBase == null) {
         this.logger.info("itemCode={}", msg.getCode());
      } else if (itemBase instanceof OrnamentItem) {
         OrnamentItem ornamentItem = (OrnamentItem)itemBase;
         StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ornamentItem.id);
         List<String> lockTempList = new ArrayList();

         for(PropertyModel model : ornamentItem.proMap.values()) {
            lockTempList.add(model.getType() + "-" + model.getWay());
         }

         if (!msg.getLockProList().isEmpty()) {
            for(String lock : msg.getLockProList()) {
               if (!lockTempList.contains(lock)) {
                  this.logger.error("配饰洗炼时出现了锁没有的属性：" + lock + "=======" + lockTempList);
                  return;
               }
            }
         }

         if (this.clearCheck(stampModel, msg.getLockProList())) {
            this.commonClear(stampModel, ornamentItem, msg.getLockProList());
            List<Integer> tempList = new ArrayList();
            tempList.addAll(ornamentItem.clearProColour);
            ornamentItem.clearProColour.clear();
            ornamentItem.calClearColour(tempList);
            ornamentItem.lockList.clear();
            ornamentItem.clearPosList.clear();
            if (stampModel.getExtraPropertyNum() == 2) {
               int firstId = 0;
               int secondId = 0;
               List<Integer> tempPos = new ArrayList();
               tempPos.addAll(ornamentItem.clearProMap.keySet());
               firstId = (Integer)tempPos.get(0);
               secondId = (Integer)tempPos.get(1);
               if (firstId > 0) {
                  if (!ornamentItem.posList.contains(firstId) && !ornamentItem.posList.contains(secondId)) {
                     ornamentItem.clearPosList.add(firstId);
                     ornamentItem.clearPosList.add(secondId);
                  } else if ((Integer)ornamentItem.posList.get(0) != firstId && (Integer)ornamentItem.posList.get(1) != secondId) {
                     if ((Integer)ornamentItem.posList.get(1) == firstId || (Integer)ornamentItem.posList.get(0) == secondId) {
                        ornamentItem.clearPosList.add(secondId);
                        ornamentItem.clearPosList.add(firstId);
                     }
                  } else {
                     ornamentItem.clearPosList.add(firstId);
                     ornamentItem.clearPosList.add(secondId);
                  }
               }
            } else {
               ornamentItem.clearPosList.addAll(ornamentItem.clearProMap.keySet());
            }

            itemBagDao.updateOp();
            this.player.additemUpdateBuilder(ornamentItem);
            this.player.senditemUpdateMsg();
            EquipMsg.S2C_OrnamentClear_7156.Builder builder = EquipMsg.S2C_OrnamentClear_7156.newBuilder();
            builder.setInfo(this.getOrnamentInfo(ornamentItem).build());
            builder.addAllLockPro(msg.getLockProList());
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OrnamentExchange_7157(EquipMsg.C2S_OrnamentExchange_7157 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.getItemByCode(msg.getCode());
      if (itemBase == null) {
         this.logger.info("itemCode={}", msg.getCode());
      } else if (itemBase instanceof OrnamentItem) {
         OrnamentItem ornamentItem = (OrnamentItem)itemBase;
         StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ornamentItem.id);
         StampModel targetModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", msg.getExchangeId());
         if (stampModel.getStar() != targetModel.getStar()) {
            this.player.failure(12011);
         } else if (this.checkExchange(stampModel, targetModel)) {
            int oldLev = ornamentItem.lev;
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            itemBagPart.deleteItemByCode(ornamentItem.code, 1, 12, 1213, 0, 0, "");
            this.player.senditemUpdateMsg();
            OrnamentItem newItem = this.addOrnament(ornamentItem, itemBagPart, targetModel.getId(), 12, 1213, 0, 0, "");
            if (oldLev > 0) {
               int resourceId = 0;
               int targetNum = 0;
               if (!targetModel.getLevUpConsume().isEmpty()) {
                  targetNum = ((ResourceModel)targetModel.getLevUpConsume().get(0)).getValue();
                  resourceId = ((ResourceModel)targetModel.getLevUpConsume().get(0)).getId();
               }

               if (targetNum < oldLev) {
                  int realNum = oldLev - targetNum;
                  newItem.lev = targetNum;
                  if (resourceId == 0 && !stampModel.getLevUpConsume().isEmpty()) {
                     resourceId = ((ResourceModel)stampModel.getLevUpConsume().get(0)).getId();
                  }

                  if (resourceId > 0) {
                     this.logger.info("配饰转换给玩家返还道具：{}", realNum);
                     this.player.addResource(2, resourceId, realNum, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1213, ornamentItem.id, 1, String.valueOf(this.player.getPlayerId()));
                  }
               } else {
                  newItem.lev = oldLev;
               }
            }

            newItem.id = msg.getExchangeId();
            newItem.clearProMap.clear();
            newItem.proMap.clear();
            newItem.proColour.clear();
            newItem.clearProColour.clear();
            newItem.lockList.clear();
            newItem.groupList.clear();
            newItem.clearRound = 0;
            newItem.clearPosList.clear();
            newItem.posList.clear();

            for(int i = 0; i < targetModel.getExtraPropertyNum(); ++i) {
               newItem.exchangePro(this.player.getGameModelPool(), targetModel);
            }

            newItem.calColour();
            itemBagDao.updateOp();
            this.player.additemUpdateBuilder(newItem);
            this.player.senditemUpdateMsg();
            this.player.addResourceMsg(newItem);
            this.player.sendResourceMsg();
            EquipMsg.S2C_OrnamentExchange_7158.Builder builder = EquipMsg.S2C_OrnamentExchange_7158.newBuilder();
            builder.setInfo(this.getOrnamentInfo(newItem).build());
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OrnamentSave_7159(EquipMsg.C2S_OrnamentSave_7159 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.getItemByCode(msg.getCode());
      if (itemBase == null) {
         this.logger.info("itemCode={}", msg.getCode());
      } else if (!(itemBase instanceof OrnamentItem)) {
         this.logger.info("不是配饰类型");
      } else {
         OrnamentItem ornamentItem = (OrnamentItem)itemBase;
         if (!ornamentItem.clearProMap.isEmpty()) {
            ornamentItem.proMap.clear();
            ornamentItem.proMap.putAll(ornamentItem.clearProMap);
            ornamentItem.clearProMap.clear();
            ornamentItem.proColour.clear();
            ornamentItem.proColour.addAll(ornamentItem.clearProColour);
            ornamentItem.clearProColour.clear();
            ornamentItem.groupList.clear();
            ornamentItem.clearRound = 0;
            ornamentItem.posList.clear();
            ornamentItem.posList.addAll(ornamentItem.clearPosList);
            ornamentItem.clearPosList.clear();
            itemBagDao.updateOp();
            this.player.additemUpdateBuilder(ornamentItem);
            this.player.senditemUpdateMsg();
            EquipMsg.S2C_OrnamentSave_7160.Builder builder = EquipMsg.S2C_OrnamentSave_7160.newBuilder();
            builder.setInfo(this.getOrnamentInfo(ornamentItem).build());
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OrnamentSell_7161(EquipMsg.C2S_OrnamentSell_7161 msg, String source) {
      if (!msg.getCodeList().isEmpty()) {
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         Map<Integer, Integer> checkMap = new HashMap();

         for(int i = 0; i < msg.getCodeList().size(); ++i) {
            ItemBase itemBase = itemBagDao.getItemByCode((Integer)msg.getCodeList().get(i));
            if (itemBase == null) {
               this.logger.info("itemCode={}", msg.getCodeList().get(i));
               return;
            }

            if (!(itemBase instanceof OrnamentItem)) {
               this.logger.info("不是配饰类型");
               return;
            }

            if (checkMap.containsKey(msg.getCodeList().get(i))) {
               this.logger.info("itemCode相同={}", msg.getCodeList().get(i));
               return;
            }

            checkMap.put(msg.getCodeList().get(i), 1);
         }

         List<ResourceModel> sellList = new ArrayList();

         for(int i = 0; i < msg.getCodeList().size(); ++i) {
            ItemBase itemBase = itemBagDao.getItemByCode((Integer)msg.getCodeList().get(i));
            OrnamentItem ornamentItem = (OrnamentItem)itemBase;
            StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ornamentItem.id);
            sellList.addAll(stampModel.getSell());
            int clearNum = ornamentItem.clearNum1 + ornamentItem.clearNum2 + ornamentItem.clearNum3 + ornamentItem.clearNum4 + ornamentItem.clearNum5;

            for(int j = 0; j < clearNum; ++j) {
               sellList.addAll(stampModel.getClearConsume());
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

         String sellId = "";
         String sellName = "";

         for(int i = 0; i < msg.getCodeList().size(); ++i) {
            ItemBase itemBase = itemBagDao.getItemByCode((Integer)msg.getCodeList().get(i));
            OrnamentItem item = (OrnamentItem)itemBase;
            StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", item.id);
            if (sellId.equals("")) {
               sellId = item.id + "";
            } else {
               sellId = sellId + "," + item.id;
            }

            if (sellName.equals("")) {
               sellName = stampModel.getName();
            } else {
               (new StringBuilder()).append(sellName).append(",").append(stampModel.getName()).toString();
            }

            sellName = stampModel.getName() + ",";
         }

         this.player.addResource(realList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1214, 0, msg.getCodeList().size(), String.valueOf(this.player.getPlayerId()));
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

         for(int i = 0; i < msg.getCodeList().size(); ++i) {
            itemBagPart.deleteItemByCode((Integer)msg.getCodeList().get(i), 1, 12, 1214, 0, 0, "");
         }

         this.player.senditemUpdateMsg();
         EquipMsg.S2C_OrnamentSell_7162.Builder builder = EquipMsg.S2C_OrnamentSell_7162.newBuilder();
         builder.setResult(1);
         this.player.sendMsg(builder.build());
         int sellNum = 0;

         for(int i = 0; i < realList.size(); ++i) {
            if (((ResourceModel)realList.get(i)).getId() == 1010) {
               sellNum = ((ResourceModel)realList.get(i)).getValue();
               break;
            }
         }

         this.player.getOperationMgr().addExtraLog(this.player, 132, sellId, sellName, sellNum + "");
      }
   }

   public void randNewPro(StampModel stampModel, OrnamentItem ornamentItem, String lock) {
      int lockId = -1;
      int lockWay = -1;
      if (!lock.equals("")) {
         String[] locks = lock.split("-");
         lockId = Integer.parseInt(locks[0]);
         lockWay = Integer.parseInt(locks[1]);
      }

      Map<Integer, StampExtraPropertyModel> extraMap = this.player.getGameModelPool().getMap("StampExtraProperty");
      List<StampExtraPropertyModel> list = new ArrayList();

      for(StampExtraPropertyModel model : extraMap.values()) {
         if (model.getGroupId() == stampModel.getExtraPropertyType()) {
            list.add(model);
         }
      }

      int realId = 0;
      if (ornamentItem.groupList.size() < 10) {
         ArrayList<KeyValFun> funList = new ArrayList();

         for(StampExtraPropertyModel v : list) {
            boolean flag = true;

            for(PropertyModel model : ornamentItem.clearProMap.values()) {
               if (model.getType() == v.getPropertyId() && model.getWay() == v.getPropertyWay()) {
                  flag = false;
                  break;
               }
            }

            if (ornamentItem.clearRound == 0) {
               for(PropertyModel model : ornamentItem.proMap.values()) {
                  if (model.getType() == v.getPropertyId() && model.getWay() == v.getPropertyWay()) {
                     flag = false;
                     break;
                  }
               }
            }

            if (v.getPropertyId() == lockId && v.getPropertyWay() == lockWay) {
               flag = false;
            }

            if (ornamentItem.groupList.contains(v.getId())) {
               flag = false;
            }

            if (flag) {
               funList.add(new KeyValFun(v.getId(), v.getWeight()));
            }
         }

         if (!funList.isEmpty()) {
            realId = GamePlayer.countRate(funList);
         }
      }

      if (realId == 0) {
         ArrayList<KeyValFun> funList = new ArrayList();

         for(StampExtraPropertyModel v : list) {
            boolean flag = true;

            for(PropertyModel model : ornamentItem.clearProMap.values()) {
               if (model.getType() == v.getPropertyId() && model.getWay() == v.getPropertyWay()) {
                  flag = false;
                  break;
               }
            }

            if (v.getPropertyId() == lockId && v.getPropertyWay() == lockWay) {
               flag = false;
            }

            if (flag) {
               funList.add(new KeyValFun(v.getId(), v.getWeight()));
            }
         }

         realId = GamePlayer.countRate(funList);
      }

      int minValue = ((StampExtraPropertyModel)extraMap.get(realId)).getPropertyValueMin();
      String[] upStr = ((StampExtraPropertyModel)extraMap.get(realId)).getClearNum().split("\\|");
      int realUp = Integer.parseInt(upStr[2]);
      int clearNum = ornamentItem.clearNum1 + ornamentItem.clearNum2 + ornamentItem.clearNum3 + ornamentItem.clearNum4 + ornamentItem.clearNum5;
      realUp *= clearNum + 1;
      int realValue = realUp + minValue;
      if (realValue > ((StampExtraPropertyModel)extraMap.get(realId)).getPropertyValueMax()) {
         realValue = ((StampExtraPropertyModel)extraMap.get(realId)).getPropertyValueMax();
      }

      ornamentItem.clearProMap.put(realId, new PropertyModel(((StampExtraPropertyModel)extraMap.get(realId)).getPropertyId(), ((StampExtraPropertyModel)extraMap.get(realId)).getPropertyWay(), (long)realValue));
      ornamentItem.groupList.add(realId);
      if (stampModel.getExtraPropertyNum() == 1 && ornamentItem.clearRound == 0 && ornamentItem.groupList.size() >= 9) {
         ornamentItem.groupList.clear();
         ++ornamentItem.clearRound;
      } else if (stampModel.getExtraPropertyNum() == 2 && ornamentItem.clearRound == 0 && ornamentItem.groupList.size() >= 8) {
         ornamentItem.groupList.clear();
         ++ornamentItem.clearRound;
      } else if (ornamentItem.groupList.size() >= 10) {
         ornamentItem.groupList.clear();
         ++ornamentItem.clearRound;
      }

   }

   public void randStaticPro(OrnamentItem ornamentItem, String lock, Map<Integer, PropertyModel> tempMap, StampModel stampModel) {
      int groupId = 0;
      int flagGroup = 0;
      String[] locks = lock.split("-");
      int lockId = Integer.parseInt(locks[0]);
      int lockWay = Integer.parseInt(locks[1]);
      Map<Integer, StampExtraPropertyModel> flagMap = this.player.getGameModelPool().getMap("StampExtraProperty");

      for(Map.Entry<Integer, PropertyModel> entry : ornamentItem.proMap.entrySet()) {
         if (lockId == ((PropertyModel)entry.getValue()).getType() && lockWay == ((PropertyModel)entry.getValue()).getWay()) {
            groupId = (Integer)entry.getKey();
         }

         flagGroup = (Integer)entry.getKey();
      }

      this.logger.error("固定属性组序号id：{}", groupId);
      if (groupId == 0 && flagGroup > 0) {
         int tempGroupId = ((StampExtraPropertyModel)flagMap.get(flagGroup)).getGroupId();
         int tempFlag = flagGroup;
         List<StampExtraPropertyModel> list = new ArrayList();

         for(StampExtraPropertyModel model : flagMap.values()) {
            if (model.getGroupId() == tempGroupId && model.getId() != tempFlag) {
               list.add(model);
            }
         }

         if (!list.isEmpty()) {
            groupId = ((StampExtraPropertyModel)list.get(0)).getId();
         }
      }

      StampExtraPropertyModel extraModel = (StampExtraPropertyModel)this.player.getGameModelPool().getEntity("StampExtraProperty", groupId);
      String[] upStr = extraModel.getClearNum().split("\\|");
      int realUp = 0;
      int minValue = extraModel.getPropertyValueMin();
      int clearNum = ornamentItem.clearNum1 + ornamentItem.clearNum2 + ornamentItem.clearNum3 + ornamentItem.clearNum4 + ornamentItem.clearNum5;
      int tempUp = Integer.parseInt(upStr[2]);
      int tempNum = tempUp * (clearNum + 1);
      tempNum = minValue + tempNum;
      realUp = tempNum;
      if (tempNum > extraModel.getPropertyValueMax()) {
         realUp = extraModel.getPropertyValueMax();
      }

      if (ornamentItem.proMap.containsKey(groupId)) {
         ornamentItem.clearProMap.put(groupId, new PropertyModel(((PropertyModel)ornamentItem.proMap.get(groupId)).getType(), ((PropertyModel)ornamentItem.proMap.get(groupId)).getWay(), (long)realUp));
      } else {
         ornamentItem.clearProMap.put(groupId, new PropertyModel(extraModel.getPropertyId(), extraModel.getPropertyWay(), (long)realUp));
      }

   }

   public CommonMsg.OrnamentInfo.Builder getOrnamentInfo(OrnamentItem ornamentItem) {
      CommonMsg.OrnamentInfo.Builder builder = CommonMsg.OrnamentInfo.newBuilder();
      builder.setCode(ornamentItem.code);
      builder.setId(ornamentItem.id);
      builder.setClearNum1(ornamentItem.clearNum1);
      builder.setClearNum2(ornamentItem.clearNum2);
      builder.setClearNum3(ornamentItem.clearNum3);
      builder.setClearNum4(ornamentItem.clearNum4);
      builder.setClearNum5(ornamentItem.clearNum5);
      builder.addClearNum(ornamentItem.clearNum1);
      builder.addClearNum(ornamentItem.clearNum2);
      builder.addClearNum(ornamentItem.clearNum3);
      builder.addClearNum(ornamentItem.clearNum4);
      builder.addClearNum(ornamentItem.clearNum5);

      for(Integer id : ornamentItem.posList) {
         if (ornamentItem.proMap.containsKey(id)) {
            builder.addExtraPro(ornamentItem.toBuilder((PropertyModel)ornamentItem.proMap.get(id)));
         }
      }

      for(Integer id : ornamentItem.clearPosList) {
         if (ornamentItem.clearProMap.containsKey(id)) {
            builder.addClearExtraPro(ornamentItem.toBuilder((PropertyModel)ornamentItem.clearProMap.get(id)));
         }
      }

      builder.setLev(ornamentItem.lev);
      if (!ornamentItem.lockList.isEmpty()) {
         builder.addAllLockPro(ornamentItem.lockList);
      }

      builder.addAllProColour(ornamentItem.proColour);
      builder.addAllExtraProColour(ornamentItem.clearProColour);
      return builder;
   }

   public OrnamentItem addOrnament(OrnamentItem ornamentItem, ItemBagPart itemBagPart, int id, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      int code = this.player.getUniqueCode(CodeDefine.ITEM_CODE);
      OrnamentItem newItem = new OrnamentItem(code, id);
      newItem.clearNum1 = ornamentItem.clearNum1;
      newItem.clearNum2 = ornamentItem.clearNum2;
      newItem.clearNum3 = ornamentItem.clearNum3;
      newItem.clearNum4 = ornamentItem.clearNum4;
      newItem.clearNum5 = ornamentItem.clearNum5;
      newItem.lev = 0;
      itemBagDao.additem(newItem, 5);
      itemBagPart.logItem(newItem.id, newItem.getNum(), 1, module, reason, newItem.code, misc2, misc3);
      itemBagPart.addOperationLog(newItem.id, newItem.getNum(), 1, reason);
      return newItem;
   }

   public OrnamentItem addOrnamentUpStar(OrnamentItem ornamentItem, ItemBagPart itemBagPart, int id, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      int code = this.player.getUniqueCode(CodeDefine.ITEM_CODE);
      Map<Integer, PropertyModel> calcPro = new LinkedHashMap();
      Map<Integer, StampExtraPropertyModel> modelMap = this.player.getGameModelPool().getMap("StampExtraProperty");
      ornamentItem.posList.clear();
      Iterator<Map.Entry<Integer, PropertyModel>> it = ornamentItem.proMap.entrySet().iterator();

      while(it.hasNext()) {
         Map.Entry<Integer, PropertyModel> entry = (Map.Entry)it.next();
         if (!modelMap.containsKey(entry.getKey())) {
            this.logger.error("配饰升星数据错误:" + entry.getKey());
         } else {
            StampExtraPropertyModel model = (StampExtraPropertyModel)modelMap.get(entry.getKey());
            if (model.getNextid() != 0 && modelMap.containsKey(model.getNextid())) {
               it.remove();
               int clearNum = ornamentItem.clearNum1 + ornamentItem.clearNum2 + ornamentItem.clearNum3 + ornamentItem.clearNum4 + ornamentItem.clearNum5;
               long value = 0L;
               StampExtraPropertyModel newModel = (StampExtraPropertyModel)modelMap.get(model.getNextid());
               if (clearNum <= newModel.getClearMaxTime()) {
                  value = (long)((newModel.getPropertyValueMax() - newModel.getPropertyValueMin()) * clearNum / newModel.getClearMaxTime() + newModel.getPropertyValueMin());
                  if (value > (long)newModel.getPropertyValueMax()) {
                     this.logger.error("背包配饰升星,计算值大于了最大值：" + value + ",最大值：" + newModel.getPropertyValueMax());
                     value = (long)newModel.getPropertyValueMax();
                  }

                  if (value < ((PropertyModel)entry.getValue()).getValue()) {
                     this.logger.error("背包配饰升星,计算值小于了原先值：" + value + ",原先值：" + ((PropertyModel)entry.getValue()).getValue());
                     value = ((PropertyModel)entry.getValue()).getValue();
                  }
               } else {
                  value = (long)newModel.getPropertyValueMax();
               }

               calcPro.put(model.getNextid(), new PropertyModel(((PropertyModel)entry.getValue()).getType(), ((PropertyModel)entry.getValue()).getWay(), value));
            } else {
               this.logger.error("配饰升星数据错误:" + entry.getKey());
            }
         }
      }

      OrnamentItem newItem = new OrnamentItem(code, id);
      newItem.proMap.clear();
      newItem.proMap.putAll(calcPro);
      newItem.posList.clear();
      newItem.posList.addAll(newItem.proMap.keySet());
      newItem.clearNum1 = ornamentItem.clearNum1;
      newItem.clearNum2 = ornamentItem.clearNum2;
      newItem.clearNum3 = ornamentItem.clearNum3;
      newItem.clearNum4 = ornamentItem.clearNum4;
      newItem.clearNum5 = ornamentItem.clearNum5;
      newItem.lev = 0;
      newItem.lockList.clear();
      newItem.groupList.clear();
      newItem.clearRound = 0;
      newItem.clearPosList.clear();
      itemBagDao.additem(newItem, 5);
      itemBagPart.logItem(newItem.id, newItem.getNum(), 1, module, reason, newItem.code, misc2, misc3);
      itemBagPart.addOperationLog(newItem.id, newItem.getNum(), 1, reason);
      return newItem;
   }

   @MsgHandlerAnno
   public void C2S_OrnamentClear_5104(HeroMsg.C2S_OrnamentClear_5104 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode(), msg.getPosition());
      if (!Objects.isNull(heroDao)) {
         OrnamentItem ornamentItem = (OrnamentItem)heroDao.ornament.get(msg.getPosition().getNumber());
         if (!Objects.isNull(ornamentItem)) {
            List<String> lockTempList = new ArrayList();

            for(PropertyModel model : ornamentItem.proMap.values()) {
               lockTempList.add(model.getType() + "-" + model.getWay());
            }

            if (!msg.getLockProList().isEmpty()) {
               for(String lock : msg.getLockProList()) {
                  if (!lockTempList.contains(lock)) {
                     this.logger.error("配饰洗炼时出现了锁没有的属性：" + lock + "=======" + lockTempList);
                     return;
                  }
               }
            }

            StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ornamentItem.id);
            if (this.clearCheck(stampModel, msg.getLockProList())) {
               this.commonClear(stampModel, ornamentItem, msg.getLockProList());
               List<Integer> tempList = new ArrayList();
               tempList.addAll(ornamentItem.clearProColour);
               ornamentItem.clearProColour.clear();
               ornamentItem.calClearColour(tempList);
               ornamentItem.lockList.clear();
               if (ornamentItem.proMap.size() < ornamentItem.clearProMap.size()) {
                  ornamentItem.proMap.clear();
                  ornamentItem.proMap.putAll(ornamentItem.clearProMap);
                  ornamentItem.proColour.clear();
                  ornamentItem.proColour.addAll(ornamentItem.clearProColour);
               }

               ornamentItem.clearPosList.clear();
               if (stampModel.getExtraPropertyNum() == 2) {
                  int firstId = 0;
                  int secondId = 0;
                  List<Integer> tempPos = new ArrayList();
                  tempPos.addAll(ornamentItem.clearProMap.keySet());
                  firstId = (Integer)tempPos.get(0);
                  secondId = (Integer)tempPos.get(1);
                  if (firstId > 0) {
                     if (!ornamentItem.posList.contains(firstId) && !ornamentItem.posList.contains(secondId)) {
                        ornamentItem.clearPosList.add(firstId);
                        ornamentItem.clearPosList.add(secondId);
                     } else if ((Integer)ornamentItem.posList.get(0) != firstId && (Integer)ornamentItem.posList.get(1) != secondId) {
                        if ((Integer)ornamentItem.posList.get(1) == firstId || (Integer)ornamentItem.posList.get(0) == secondId) {
                           ornamentItem.clearPosList.add(secondId);
                           ornamentItem.clearPosList.add(firstId);
                        }
                     } else {
                        ornamentItem.clearPosList.add(firstId);
                        ornamentItem.clearPosList.add(secondId);
                     }
                  }
               } else {
                  ornamentItem.clearPosList.addAll(ornamentItem.clearProMap.keySet());
               }

               heroDao.updateOp();
               HeroMsg.S2C_OrnamentClear_5105.Builder builder = HeroMsg.S2C_OrnamentClear_5105.newBuilder();
               builder.setHeroCode(msg.getHeroCode());
               builder.setPosition(msg.getPosition());
               builder.setInfo(this.packWear(ornamentItem, msg.getPosition()));
               builder.addAllLockPro(msg.getLockProList());
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OrnamentExchange_5106(HeroMsg.C2S_OrnamentExchange_5106 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode(), msg.getPosition());
      if (!Objects.isNull(heroDao)) {
         OrnamentItem ornamentItem = (OrnamentItem)heroDao.ornament.get(msg.getPosition().getNumber());
         if (!Objects.isNull(ornamentItem)) {
            StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ornamentItem.id);
            StampModel targetModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", msg.getExchangeId());
            if (stampModel.getStar() != targetModel.getStar()) {
               this.player.failure(12011);
            } else if (!Objects.isNull(targetModel) && stampModel.getQuality() == targetModel.getQuality()) {
               if (this.checkExchange(stampModel, targetModel)) {
                  int oldId = ornamentItem.id;
                  if (ornamentItem.lev > 0) {
                     int resourceId = 0;
                     int targetNum = 0;
                     if (!targetModel.getLevUpConsume().isEmpty()) {
                        targetNum = ((ResourceModel)targetModel.getLevUpConsume().get(0)).getValue();
                        resourceId = ((ResourceModel)targetModel.getLevUpConsume().get(0)).getId();
                     }

                     if (targetNum < ornamentItem.lev) {
                        int realNum = ornamentItem.lev - targetNum;
                        ornamentItem.lev = targetNum;
                        if (resourceId == 0 && !stampModel.getLevUpConsume().isEmpty()) {
                           resourceId = ((ResourceModel)stampModel.getLevUpConsume().get(0)).getId();
                        }

                        if (resourceId > 0) {
                           this.logger.info("配饰转换给玩家返还道具：{}", realNum);
                           this.player.addResource(2, resourceId, realNum, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1213, ornamentItem.id, 1, String.valueOf(this.player.getPlayerId()));
                        }
                     }
                  }

                  ornamentItem.clearProMap.clear();
                  ornamentItem.proMap.clear();
                  ornamentItem.proColour.clear();
                  ornamentItem.clearProColour.clear();
                  ornamentItem.lockList.clear();
                  ornamentItem.groupList.clear();
                  ornamentItem.clearRound = 0;
                  ornamentItem.clearPosList.clear();
                  ornamentItem.posList.clear();

                  for(int i = 0; i < targetModel.getExtraPropertyNum(); ++i) {
                     ornamentItem.exchangePro(this.player.getGameModelPool(), targetModel);
                  }

                  ornamentItem.calColour();
                  ornamentItem.id = targetModel.getId();
                  boolean flag = false;
                  StampBasicPropertyModel basicPropertyModel = (StampBasicPropertyModel)this.player.getGameModelPool().getEntity("StampBasicProperty", stampModel.getBasicPropertyType());
                  StampBasicPropertyModel targetPropertyModel = (StampBasicPropertyModel)this.player.getGameModelPool().getEntity("StampBasicProperty", targetModel.getBasicPropertyType());
                  if (basicPropertyModel.getStampType() != targetPropertyModel.getStampType()) {
                     this.logger.info("配饰类型不一致！！！！！！");
                     OrnamentItem newItem = this.UnderDressOrnament(heroDao, msg.getPosition());
                     this.player.addResourceMsg(newItem);
                     this.player.sendResourceMsg();
                  } else {
                     heroDao.updateOp();
                     flag = true;
                  }

                  HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                  heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_ORNAMENT, heroDao);
                  HeroMsg.S2C_OrnamentExchange_5107.Builder builder = HeroMsg.S2C_OrnamentExchange_5107.newBuilder();
                  builder.setHeroCode(msg.getHeroCode());
                  builder.setPosition(msg.getPosition());
                  builder.setIsType(flag);
                  if (flag) {
                     builder.setInfo(this.packWear(ornamentItem, msg.getPosition()));
                  }

                  builder.setOrnamentPower(heroDao.getOrnamentPower());
                  if (!heroDao.getOrnametProperty().isEmpty()) {
                     for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
                        if (heroDao.getOrnametProperty().get(i) != null) {
                           builder.addProAll(((Long)heroDao.getOrnametProperty().get(i)).intValue());
                        } else {
                           builder.addProAll(0);
                        }
                     }
                  }

                  this.player.sendMsg(builder.build());
                  StampModel oldModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", oldId);
                  StampModel newModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", targetModel.getId());
                  String oldName = "-";
                  String newName = "-";
                  if (!Objects.isNull(oldModel)) {
                     oldName = oldModel.getName();
                  }

                  if (!Objects.isNull(newModel)) {
                     newName = newModel.getName();
                  }

                  this.player.getOperationMgr().addExtraLog(this.player, 131, oldId + "", oldName, targetModel.getId() + "", newName);
               }
            } else {
               this.player.failure(6);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OrnamentSave_5108(HeroMsg.C2S_OrnamentSave_5108 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode(), msg.getPosition());
      if (!Objects.isNull(heroDao)) {
         OrnamentItem ornamentItem = (OrnamentItem)heroDao.ornament.get(msg.getPosition().getNumber());
         if (!Objects.isNull(ornamentItem)) {
            if (!ornamentItem.clearProMap.isEmpty()) {
               ornamentItem.proMap.clear();
               ornamentItem.proMap.putAll(ornamentItem.clearProMap);
               ornamentItem.clearProMap.clear();
               ornamentItem.proColour.clear();
               ornamentItem.proColour.addAll(ornamentItem.clearProColour);
               ornamentItem.clearProColour.clear();
               ornamentItem.groupList.clear();
               ornamentItem.clearRound = 0;
               ornamentItem.posList.clear();
               ornamentItem.posList.addAll(ornamentItem.clearPosList);
               ornamentItem.clearPosList.clear();
               heroDao.updateOp();
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_ORNAMENT, heroDao);
               HeroMsg.S2C_OrnamentSave_5109.Builder builder = HeroMsg.S2C_OrnamentSave_5109.newBuilder();
               builder.setHeroCode(msg.getHeroCode());
               builder.setPosition(msg.getPosition());
               builder.setInfo(this.packWear(ornamentItem, msg.getPosition()));
               builder.setOrnamentPower(heroDao.getOrnamentPower());
               if (!heroDao.getOrnametProperty().isEmpty()) {
                  for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
                     if (heroDao.getOrnametProperty().get(i) != null) {
                        builder.addProAll(((Long)heroDao.getOrnametProperty().get(i)).intValue());
                     } else {
                        builder.addProAll(0);
                     }
                  }
               }

               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UndressOrnament_5102(HeroMsg.C2S_UndressOrnament_5102 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode(), msg.getPosition());
      if (!Objects.isNull(heroDao)) {
         OrnamentItem ornamentItem = this.UnderDressOrnament(heroDao, msg.getPosition());
         if (!Objects.isNull(ornamentItem)) {
            if (ornamentItem != null) {
               this.player.additemUpdateBuilder(ornamentItem);
               this.player.senditemUpdateMsg();
            }

            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_ORNAMENT, heroDao);
            HeroMsg.S2C_UndressOrnamentResult_5103.Builder builder = HeroMsg.S2C_UndressOrnamentResult_5103.newBuilder();
            builder.setPosition(msg.getPosition());
            builder.setHeroCode(msg.getHeroCode());
            builder.setOrnamentPower(heroDao.getOrnamentPower());
            if (!heroDao.getOrnametProperty().isEmpty()) {
               for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
                  if (heroDao.getOrnametProperty().get(i) != null) {
                     builder.addProAll(((Long)heroDao.getOrnametProperty().get(i)).intValue());
                  } else {
                     builder.addProAll(0);
                  }
               }
            }

            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WearOrnament_5100(HeroMsg.C2S_WearOrnament_5100 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode(), msg.getPosition());
      if (!Objects.isNull(heroDao)) {
         if (!HeroModel.isReplacementHero(heroDao.id)) {
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            ItemBase itemBase = itemBagPart.getItemByCode(msg.getItemCode());
            if (itemBase == null) {
               this.logger.info("要佩戴的配饰为空！itemCode={}", msg.getItemCode());
            } else if (!(itemBase instanceof OrnamentItem)) {
               this.logger.info("不是配饰类型");
            } else {
               OrnamentItem ornamentItem = (OrnamentItem)itemBase;
               this.heroWearOrnament(heroDao, msg.getPosition(), ornamentItem);
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_ORNAMENT, heroDao);
               HeroMsg.S2C_WearOrnamentResult_5101.Builder builder = HeroMsg.S2C_WearOrnamentResult_5101.newBuilder();
               builder.setHeroCode(msg.getHeroCode());
               builder.setInfo(this.packWear(ornamentItem, msg.getPosition()));
               builder.setOrnamentPower(heroDao.getOrnamentPower());
               if (!heroDao.getOrnametProperty().isEmpty()) {
                  for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
                     if (heroDao.getOrnametProperty().get(i) != null) {
                        builder.addProAll(((Long)heroDao.getOrnametProperty().get(i)).intValue());
                     } else {
                        builder.addProAll(0);
                     }
                  }
               }

               this.player.sendMsg(builder.build());
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
               StampModel itemModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ornamentItem.id);
               String itemName = "-";
               if (!Objects.isNull(itemModel)) {
                  itemName = itemModel.getName();
               }

               this.player.getOperationMgr().addExtraLog(this.player, 130, heroModel.getName(), heroDao.getStar() + "", msg.getPosition().getNumber() + "", itemName);
               int taskVal = 0;

               for(HeroDao heroDao1 : this.getHeroMap().values()) {
                  if (!heroDao1.ornament.isEmpty() && heroDao1.ornament.size() >= 4) {
                     ++taskVal;
                  }
               }

               this.player.triggerTask(360, 0, (long)taskVal, 0);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OrnamentUpLev_5110(HeroMsg.C2S_OrnamentUpLev_5110 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode(), msg.getPosition());
      if (!Objects.isNull(heroDao)) {
         OrnamentItem ornamentItem = (OrnamentItem)heroDao.ornament.get(msg.getPosition().getNumber());
         if (!Objects.isNull(ornamentItem)) {
            ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
            StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ornamentItem.id);
            if (msg.getNum() > 0 && !this.player.checkResourceNum(((ResourceModel)stampModel.getLevUpConsume().get(0)).getType(), ((ResourceModel)stampModel.getLevUpConsume().get(0)).getId(), msg.getNum())) {
               this.player.failure(12007);
            } else if (msg.getNum() >= 0 && msg.getNum() + ornamentItem.lev <= ((ResourceModel)stampModel.getLevUpConsume().get(0)).getValue()) {
               if (!msg.getConsumeCodeList().isEmpty()) {
                  Map<Integer, Integer> checkMap = new HashMap();

                  for(int i = 0; i < msg.getConsumeCodeList().size(); ++i) {
                     ItemBase consumeItem = itemBagDao.getItemByCode((Integer)msg.getConsumeCodeList().get(i));
                     if (consumeItem == null) {
                        this.player.failure(12007);
                        return;
                     }

                     if (checkMap.containsKey(msg.getConsumeCodeList().get(i))) {
                        return;
                     }

                     checkMap.put(msg.getConsumeCodeList().get(i), 1);
                     if ((Integer)msg.getConsumeCodeList().get(i) == ornamentItem.code) {
                        return;
                     }
                  }
               }

               Map<Integer, ResourceModel> map = new HashMap();
               List<ResourceModel> sellList = new ArrayList();

               for(int i = 0; i < msg.getConsumeCodeList().size(); ++i) {
                  ItemBase consumeItem = itemBagDao.getItemByCode((Integer)msg.getConsumeCodeList().get(i));
                  OrnamentItem consumeOrnament = (OrnamentItem)consumeItem;
                  StampModel consumeModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", consumeOrnament.id);

                  for(int k = 0; k < consumeModel.getSell().size(); ++k) {
                     int id = ((ResourceModel)consumeModel.getSell().get(k)).getId();
                     int value = ((ResourceModel)consumeModel.getSell().get(k)).getValue();
                     int type = ((ResourceModel)consumeModel.getSell().get(k)).getType();
                     if (map.containsKey(id)) {
                        ((ResourceModel)map.get(id)).setValue(((ResourceModel)map.get(id)).getValue() + value);
                     } else {
                        map.put(id, new ResourceModel(type, id, value));
                     }
                  }

                  int clearNum = consumeOrnament.clearNum1 + consumeOrnament.clearNum2 + consumeOrnament.clearNum3 + consumeOrnament.clearNum4 + consumeOrnament.clearNum5;

                  for(int j = 0; j < clearNum; ++j) {
                     for(int k = 0; k < consumeModel.getClearConsume().size(); ++k) {
                        int id = ((ResourceModel)consumeModel.getClearConsume().get(k)).getId();
                        int value = ((ResourceModel)consumeModel.getClearConsume().get(k)).getValue();
                        int type = ((ResourceModel)consumeModel.getClearConsume().get(k)).getType();
                        if (map.containsKey(id)) {
                           ((ResourceModel)map.get(id)).setValue(((ResourceModel)map.get(id)).getValue() + value);
                        } else {
                           map.put(id, new ResourceModel(type, id, value));
                        }
                     }
                  }
               }

               int needConsume = 0;
               int realConsume = 0;
               int leftNum = 0;
               int consumeNum = ((ResourceModel)stampModel.getLevUpConsume().get(0)).getValue() - ornamentItem.lev;
               if (map.containsKey(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId())) {
                  int totalNum = ((ResourceModel)map.get(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId())).getValue();
                  if (consumeNum > totalNum + msg.getNum()) {
                     needConsume = totalNum + msg.getNum();
                  } else {
                     needConsume = consumeNum;
                  }

                  int tempConsume = needConsume - totalNum;
                  if (tempConsume > 0) {
                     leftNum = 0;
                     realConsume = msg.getNum();
                  } else {
                     leftNum = tempConsume * -1;
                     realConsume = 0;
                  }

                  if (leftNum <= 0) {
                     map.remove(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId());
                  } else {
                     ((ResourceModel)map.get(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId())).setValue(leftNum);
                  }
               } else if (msg.getNum() - consumeNum > 0) {
                  realConsume = consumeNum;
                  needConsume = consumeNum;
               } else {
                  realConsume = msg.getNum();
                  needConsume = msg.getNum();
               }

               sellList.addAll(map.values());

               for(int i = 0; i < msg.getConsumeCodeList().size(); ++i) {
                  ItemBase consumeItem = itemBagDao.getItemByCode((Integer)msg.getConsumeCodeList().get(i));
                  OrnamentItem consumeOrnament = (OrnamentItem)consumeItem;
                  ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                  itemBagPart.deleteItemByCode(consumeOrnament.code, 1, 12, 1210, 0, 0, "");
                  this.player.senditemUpdateMsg();
               }

               if (!sellList.isEmpty()) {
                  this.player.addResource(sellList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1210, ornamentItem.id, 1, String.valueOf(this.player.getPlayerId()));
               }

               if (realConsume > 0) {
                  List<ItemBase> list = itemBagDao.getItemById(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId());
                  int bagTotal = 0;

                  for(ItemBase itemBase : list) {
                     bagTotal += itemBase.num;
                  }

                  if (bagTotal < realConsume) {
                     realConsume = bagTotal;
                  }

                  this.player.delResource(((ResourceModel)stampModel.getLevUpConsume().get(0)).getType(), ((ResourceModel)stampModel.getLevUpConsume().get(0)).getId(), (long)realConsume, 12, 1210, 0, 0, "");
               }

               ornamentItem.lev += needConsume;
               itemBagDao.updateOp();
               heroDao.updateOp();
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_ORNAMENT, heroDao);
               this.player.additemUpdateBuilder(ornamentItem);
               this.player.senditemUpdateMsg();
               HeroMsg.S2C_OrnamentUpLev_5111.Builder builder = HeroMsg.S2C_OrnamentUpLev_5111.newBuilder();
               builder.setCode(msg.getHeroCode());
               builder.setInfo(this.packWear(ornamentItem, msg.getPosition()));
               builder.setOrnamentPower(heroDao.getOrnamentPower());
               if (!heroDao.getOrnametProperty().isEmpty()) {
                  for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
                     if (heroDao.getOrnametProperty().get(i) != null) {
                        builder.addProAll(((Long)heroDao.getOrnametProperty().get(i)).intValue());
                     } else {
                        builder.addProAll(0);
                     }
                  }
               }

               builder.setPosition(msg.getPosition());
               this.player.sendMsg(builder.build());
            } else {
               this.player.failure(6);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroOrnamentUpStar_7185(EquipMsg.C2S_HeroOrnamentUpStar_7185 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode(), msg.getPosition());
      if (!Objects.isNull(heroDao)) {
         OrnamentItem ornamentItem = (OrnamentItem)heroDao.ornament.get(msg.getPosition().getNumber());
         if (!Objects.isNull(ornamentItem)) {
            StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ornamentItem.id);
            if (stampModel != null) {
               if (stampModel.getTargetStamp() != 0) {
                  if (((ResourceModel)stampModel.getLevUpConsume().get(0)).getValue() > ornamentItem.lev) {
                     this.player.failure(12006);
                  } else if (!this.player.checkResourceNum((List)stampModel.getStarUpConsume())) {
                     this.logger.info("配饰升星道具不足！！");
                     this.player.failure(12008);
                  } else {
                     this.player.delResource((List)stampModel.getStarUpConsume(), 12, 1211, 0, 0, "");
                     ornamentItem.id = stampModel.getTargetStamp();
                     ornamentItem.lev = 0;
                     Map<Integer, PropertyModel> calcPro = new LinkedHashMap();
                     Map<Integer, StampExtraPropertyModel> modelMap = this.player.getGameModelPool().getMap("StampExtraProperty");
                     Iterator<Map.Entry<Integer, PropertyModel>> it = ornamentItem.proMap.entrySet().iterator();

                     while(it.hasNext()) {
                        Map.Entry<Integer, PropertyModel> entry = (Map.Entry)it.next();
                        if (!modelMap.containsKey(entry.getKey())) {
                           this.logger.error("英雄身上配饰升星数据错误：" + entry.getKey());
                        } else {
                           StampExtraPropertyModel model = (StampExtraPropertyModel)modelMap.get(entry.getKey());
                           if (model.getNextid() != 0 && modelMap.containsKey(model.getNextid())) {
                              it.remove();
                              int clearNum = ornamentItem.clearNum1 + ornamentItem.clearNum2 + ornamentItem.clearNum3 + ornamentItem.clearNum4 + ornamentItem.clearNum5;
                              long value = 0L;
                              StampExtraPropertyModel newModel = (StampExtraPropertyModel)modelMap.get(model.getNextid());
                              if (clearNum <= newModel.getClearMaxTime()) {
                                 value = (long)((newModel.getPropertyValueMax() - newModel.getPropertyValueMin()) * clearNum / newModel.getClearMaxTime() + newModel.getPropertyValueMin());
                                 if (value > (long)newModel.getPropertyValueMax()) {
                                    this.logger.error("英雄身上配饰升星 数值超过了最大值:" + value + "，最大值：" + newModel.getPropertyValueMax());
                                    value = (long)newModel.getPropertyValueMax();
                                 }

                                 if (value < ((PropertyModel)entry.getValue()).getValue()) {
                                    this.logger.error("英雄身上配饰升星 数值低于了原先星级的值:" + value + ", 原先值：" + ((PropertyModel)entry.getValue()).getValue());
                                    value = ((PropertyModel)entry.getValue()).getValue();
                                 }
                              } else {
                                 value = (long)newModel.getPropertyValueMax();
                              }

                              calcPro.put(model.getNextid(), new PropertyModel(((PropertyModel)entry.getValue()).getType(), ((PropertyModel)entry.getValue()).getWay(), value));
                           } else {
                              this.logger.error("英雄身上配饰升星数据错误：" + entry.getKey());
                           }
                        }
                     }

                     ornamentItem.proMap.putAll(calcPro);
                     ornamentItem.clearPosList.clear();
                     ornamentItem.posList.clear();
                     ornamentItem.posList.addAll(ornamentItem.proMap.keySet());
                     ornamentItem.clearProMap.clear();
                     ornamentItem.lockList.clear();
                     ornamentItem.calColour();
                     ornamentItem.groupList.clear();
                     ornamentItem.clearRound = 0;
                     heroDao.updateOp();
                     HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                     heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_ORNAMENT, heroDao);
                     EquipMsg.S2C_HeroOrnamentUpStar_7186.Builder builder = EquipMsg.S2C_HeroOrnamentUpStar_7186.newBuilder();
                     builder.setCode(msg.getHeroCode());
                     builder.setInfo(this.packWear(ornamentItem, msg.getPosition()));
                     builder.setOrnamentPower(heroDao.getOrnamentPower());
                     if (!heroDao.getOrnametProperty().isEmpty()) {
                        for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
                           if (heroDao.getOrnametProperty().get(i) != null) {
                              builder.addProAll(((Long)heroDao.getOrnametProperty().get(i)).intValue());
                           } else {
                              builder.addProAll(0);
                           }
                        }
                     }

                     builder.setPosition(msg.getPosition());
                     this.player.sendMsg(builder.build());
                     int num1 = 0;
                     int num2 = 0;

                     for(int i = 0; i < stampModel.getStarUpConsume().size(); ++i) {
                        if (((ResourceModel)stampModel.getStarUpConsume().get(i)).getId() == 1009) {
                           num2 = ((ResourceModel)stampModel.getStarUpConsume().get(i)).getValue();
                        }

                        if (((ResourceModel)stampModel.getStarUpConsume().get(i)).getId() == 1011) {
                           num2 = ((ResourceModel)stampModel.getStarUpConsume().get(i)).getValue();
                        }
                     }

                     this.player.getOperationMgr().addExtraLog(this.player, 133, stampModel.getId() + "", stampModel.getName(), ornamentItem.lev + "", "0", num1 + "", num2 + "");
                     stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ornamentItem.id);
                     GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                     giftPart.triggerTimeLimitGift(10, stampModel.getStar());
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroOrnamentPro_7189(EquipMsg.C2S_HeroOrnamentPro_7189 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode(), msg.getPosition());
      if (!Objects.isNull(heroDao)) {
         OrnamentItem ornamentItem = (OrnamentItem)heroDao.ornament.get(msg.getPosition().getNumber());
         if (!Objects.isNull(ornamentItem)) {
            StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ornamentItem.id);
            if (stampModel != null) {
               EquipMsg.S2C_HeroOrnamentPro_7190.Builder builder = EquipMsg.S2C_HeroOrnamentPro_7190.newBuilder();
               Map<Integer, PropertyModel> calcPro = new LinkedHashMap();
               Map<Integer, StampExtraPropertyModel> modelMap = this.player.getGameModelPool().getMap("StampExtraProperty");

               for(Map.Entry<Integer, PropertyModel> entry : ornamentItem.proMap.entrySet()) {
                  if (!modelMap.containsKey(entry.getKey())) {
                     builder.addUpPro(ornamentItem.toBuilder((PropertyModel)entry.getValue()));
                  } else {
                     StampExtraPropertyModel model = (StampExtraPropertyModel)modelMap.get(entry.getKey());
                     if (model.getNextid() != 0 && modelMap.containsKey(model.getNextid())) {
                        int clearNum = ornamentItem.clearNum1 + ornamentItem.clearNum2 + ornamentItem.clearNum3 + ornamentItem.clearNum4 + ornamentItem.clearNum5;
                        long value = 0L;
                        StampExtraPropertyModel newModel = (StampExtraPropertyModel)modelMap.get(model.getNextid());
                        if (clearNum <= newModel.getClearMaxTime()) {
                           value = (long)((newModel.getPropertyValueMax() - newModel.getPropertyValueMin()) * clearNum / newModel.getClearMaxTime() + newModel.getPropertyValueMin());
                           if (value > (long)newModel.getPropertyValueMax()) {
                              value = (long)newModel.getPropertyValueMax();
                           }

                           if (value < ((PropertyModel)entry.getValue()).getValue()) {
                              value = ((PropertyModel)entry.getValue()).getValue();
                           }
                        } else {
                           value = (long)newModel.getPropertyValueMax();
                        }

                        calcPro.put(model.getNextid(), new PropertyModel(((PropertyModel)entry.getValue()).getType(), ((PropertyModel)entry.getValue()).getWay(), value));
                     } else {
                        builder.addUpPro(ornamentItem.toBuilder((PropertyModel)entry.getValue()));
                     }
                  }
               }

               builder.setHeroCode(msg.getHeroCode());
               builder.setPosition(msg.getPosition());

               for(PropertyModel propertyModel : calcPro.values()) {
                  builder.addUpPro(ornamentItem.toBuilder(propertyModel));
               }

               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   private Map<Integer, HeroDao> getHeroMap() {
      return this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
   }

   public CommonMsg.OrnamentWear.Builder packWear(OrnamentItem ornamentItem, CommonMsg.WearPosition position) {
      CommonMsg.OrnamentWear.Builder wear = CommonMsg.OrnamentWear.newBuilder();
      wear.setId(ornamentItem.id);
      wear.setLev(ornamentItem.lev);
      wear.setPosition(position);
      wear.setClearNum1(ornamentItem.clearNum1);
      wear.setClearNum2(ornamentItem.clearNum2);
      wear.setClearNum3(ornamentItem.clearNum3);
      wear.setClearNum4(ornamentItem.clearNum4);
      wear.setClearNum5(ornamentItem.clearNum5);
      wear.addClearNum(ornamentItem.clearNum1);
      wear.addClearNum(ornamentItem.clearNum2);
      wear.addClearNum(ornamentItem.clearNum3);
      wear.addClearNum(ornamentItem.clearNum4);
      wear.addClearNum(ornamentItem.clearNum5);
      if (!ornamentItem.proMap.isEmpty()) {
         for(Integer id : ornamentItem.posList) {
            if (ornamentItem.proMap.containsKey(id)) {
               wear.addExtraPro(ornamentItem.toBuilder((PropertyModel)ornamentItem.proMap.get(id)));
            }
         }
      }

      if (!ornamentItem.clearProMap.isEmpty()) {
         for(Integer id : ornamentItem.clearPosList) {
            if (ornamentItem.clearProMap.containsKey(id)) {
               wear.addClearExtraPro(ornamentItem.toBuilder((PropertyModel)ornamentItem.clearProMap.get(id)));
            }
         }
      }

      if (!ornamentItem.lockList.isEmpty()) {
         wear.addAllLockPro(ornamentItem.lockList);
      }

      wear.addAllProColour(ornamentItem.proColour);
      wear.addAllExtraProColour(ornamentItem.clearProColour);
      return wear;
   }

   private void heroWearOrnament(HeroDao heroDao, CommonMsg.WearPosition position, OrnamentItem ornamentItem) {
      OrnamentItem oldItem = (OrnamentItem)heroDao.ornament.get(position.getNumber());
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      if (oldItem == null) {
         heroDao.ornament.put(position.getNumber(), ornamentItem);
         heroDao.updateOp();
      } else {
         OrnamentItem ornament = itemBagPart.addOrnament(oldItem, 12, 1226, 0, 0, "");
         if (ornament != null) {
            this.player.additemUpdateBuilder(ornament);
            this.player.senditemUpdateMsg();
         }

         heroDao.ornament.put(position.getNumber(), ornamentItem);
         heroDao.updateOp();
         heroDao.updateOp();
      }

      itemBagPart.deleteItemByCode(ornamentItem.code, 1, 12, 1226, 0, 0, "");
      this.player.senditemUpdateMsg();
   }

   private OrnamentItem UnderDressOrnament(HeroDao heroDao, CommonMsg.WearPosition position) {
      OrnamentItem ornamentItem = (OrnamentItem)heroDao.ornament.get(position.getNumber());
      if (ornamentItem != null) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         OrnamentItem newItem = itemBagPart.addOrnament(ornamentItem, 12, 1225, 0, 0, "");
         if (newItem != null) {
            this.player.additemUpdateBuilder(newItem);
            this.player.senditemUpdateMsg();
         }

         heroDao.ornament.remove(position.getNumber());
         heroDao.updateOp();
         return newItem;
      } else {
         return null;
      }
   }

   public HeroDao getHeroDao(int heroCode, CommonMsg.WearPosition posion) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + heroCode);
         return null;
      } else {
         HeroWearPart wearPart = (HeroWearPart)this.player.getMgrPart(HeroWearPart.class);
         return !wearPart.isEnableWear(heroDao, posion, CommonMsg.WearType.WEARTYPE_ORANMENT) ? null : heroDao;
      }
   }

   public boolean checkExchange(StampModel stampModel, StampModel targetModel) {
      if (targetModel.getSetType() == 0) {
         if (!this.player.checkResourceNum((List)stampModel.getExchangeToSet_0())) {
            for(ResourceModel resourceModel : stampModel.getExchangeToSet_0()) {
               if (!this.player.checkResourceNum(resourceModel)) {
                  if (resourceModel.getId() == PlayerDefine.PLAYER_GOLD && resourceModel.getType() == 1) {
                     this.player.failure(61154);
                     return false;
                  }

                  this.player.failure(61155);
                  return false;
               }
            }
         }
      } else if (targetModel.getSetType() == 1) {
         if (!this.player.checkResourceNum((List)stampModel.getExchangeToSet_1())) {
            for(ResourceModel resourceModel : stampModel.getExchangeToSet_1()) {
               if (!this.player.checkResourceNum(resourceModel)) {
                  if (resourceModel.getId() == PlayerDefine.PLAYER_GOLD && resourceModel.getType() == 1) {
                     this.player.failure(61154);
                     return false;
                  }

                  this.player.failure(61155);
                  return false;
               }
            }
         }
      } else if (targetModel.getSetType() == 2 && !this.player.checkResourceNum((List)stampModel.getExchangeToSet_2())) {
         for(ResourceModel resourceModel : stampModel.getExchangeToSet_2()) {
            if (!this.player.checkResourceNum(resourceModel)) {
               if (resourceModel.getId() == PlayerDefine.PLAYER_GOLD && resourceModel.getType() == 1) {
                  this.player.failure(61154);
                  return false;
               }

               this.player.failure(61155);
               return false;
            }
         }
      }

      if (targetModel.getSetType() == 0) {
         this.player.delResource((List)stampModel.getExchangeToSet_0(), 12, 1213, 0, 0, "");
      } else if (targetModel.getSetType() == 1) {
         this.player.delResource((List)stampModel.getExchangeToSet_1(), 12, 1213, 0, 0, "");
      } else {
         this.player.delResource((List)stampModel.getExchangeToSet_2(), 12, 1213, 0, 0, "");
      }

      return true;
   }

   public boolean clearCheck(StampModel stampModel, List<String> proList) {
      if (stampModel.getExtraPropertyNum() != 0 && proList.size() <= stampModel.getExtraPropertyNum()) {
         if (!this.player.checkResourceNum((List)stampModel.getClearConsume())) {
            this.player.failure(12009);
            return false;
         } else if (proList.size() == 1 && !this.player.checkResourceNum((List)stampModel.getClearConsume_one())) {
            this.player.failure(12009);
            return false;
         } else if (proList.size() == 2 && !this.player.checkResourceNum((List)stampModel.getClearConsume_two())) {
            this.player.failure(12009);
            return false;
         } else {
            this.player.delResource((List)stampModel.getClearConsume(), 12, 1212, 0, 0, "");
            if (proList.size() == 1) {
               this.player.delResource((List)stampModel.getClearConsume_one(), 12, 1212, 0, 0, "");
            } else if (proList.size() == 2) {
               this.player.delResource((List)stampModel.getClearConsume_two(), 12, 1212, 0, 0, "");
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public void commonClear(StampModel stampModel, OrnamentItem ornamentItem, List<String> proList) {
      Map<Integer, PropertyModel> tempMap = new LinkedHashMap();
      tempMap.putAll(ornamentItem.clearProMap);
      List<Integer> newList = new ArrayList();

      for(Integer id : tempMap.keySet()) {
         newList.add(id);
      }

      ornamentItem.clearProMap.clear();
      if (proList.size() == 1) {
         int lockId = Integer.parseInt(((String)proList.get(0)).split("-")[0]);
         int lockWay = Integer.parseInt(((String)proList.get(0)).split("-")[1]);
         int staticNum = 0;

         for(Map.Entry<Integer, PropertyModel> entry : ornamentItem.proMap.entrySet()) {
            ++staticNum;
            if (lockId == ((PropertyModel)entry.getValue()).getType() && lockWay == ((PropertyModel)entry.getValue()).getWay()) {
               break;
            }
         }

         if (staticNum == 1) {
            this.randStaticPro(ornamentItem, (String)proList.get(0), tempMap, stampModel);
            if (stampModel.getExtraPropertyNum() == 2) {
               this.randNewPro(stampModel, ornamentItem, (String)proList.get(0));
            }
         } else {
            if (stampModel.getExtraPropertyNum() == 2) {
               this.randNewPro(stampModel, ornamentItem, (String)proList.get(0));
            }

            this.randStaticPro(ornamentItem, (String)proList.get(0), tempMap, stampModel);
         }
      } else if (proList.size() == 2) {
         this.randStaticPro(ornamentItem, (String)proList.get(0), tempMap, stampModel);
         this.randStaticPro(ornamentItem, (String)proList.get(1), tempMap, stampModel);
      } else {
         for(int i = 0; i < stampModel.getExtraPropertyNum(); ++i) {
            this.randNewPro(stampModel, ornamentItem, "");
         }
      }

      if (stampModel.getStar() == 1) {
         ++ornamentItem.clearNum1;
      } else if (stampModel.getStar() == 2) {
         ++ornamentItem.clearNum2;
      } else if (stampModel.getStar() == 3) {
         ++ornamentItem.clearNum3;
      } else if (stampModel.getStar() == 4) {
         ++ornamentItem.clearNum4;
      } else if (stampModel.getStar() == 5) {
         ++ornamentItem.clearNum5;
      }

   }

   public void test() {
      this.addItem();

      for(int code = 1; code <= 100; ++code) {
         this.test = new Test();
         this.C2S_OrnamentUpLev_7151(code);
      }

      for(int code = 1; code <= 200; ++code) {
         this.test = new Test();
         this.C2S_OrnamentUpStar_7153(code);
      }

      for(int code = 1; code <= 200; ++code) {
         this.test = new Test();
         this.C2S_OrnamentUpLev_7151(code);
      }

      for(int code = 1; code <= 200; ++code) {
         this.test = new Test();
         this.C2S_OrnamentUpStar_7153(code);
      }

      for(int code = 1; code <= 300; ++code) {
         this.test = new Test();
         this.C2S_OrnamentUpLev_7151(code);
      }

      for(int code = 1; code <= 300; ++code) {
         this.test = new Test();
         this.C2S_OrnamentUpStar_7153(code);
      }

   }

   public void addItem() {
      for(int id = 511101; id <= 511112; ++id) {
         this.player.addResource(2, id, 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1210, id, 1, String.valueOf(this.player.getPlayerId()));
      }

      for(int id = 511201; id <= 511212; ++id) {
         this.player.addResource(2, id, 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1210, id, 1, String.valueOf(this.player.getPlayerId()));
      }

      for(int id = 511301; id <= 511312; ++id) {
         this.player.addResource(2, id, 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1210, id, 1, String.valueOf(this.player.getPlayerId()));
      }

      this.player.addResource(2, 1009, 20000, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1210, 1009, 1, String.valueOf(this.player.getPlayerId()));
      this.player.addResource(2, 1010, 20000, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1210, 1010, 1, String.valueOf(this.player.getPlayerId()));
      this.player.addResource(2, 1011, 20000, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1210, 1001, 1, String.valueOf(this.player.getPlayerId()));
   }

   public void testWrite(String data) {
      String path = "e:1111.txt";
      BufferedWriter bw = null;
      File file = null;

      try {
         file = new File(path);
         File fileParent = file.getParentFile();
         if (!fileParent.exists()) {
            fileParent.mkdirs();
         }

         if (!file.exists()) {
            file.createNewFile();
         }

         OutputStream os = new FileOutputStream(file, true);
         bw = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
         bw.write(data);
         bw.flush();
      } catch (Exception e) {
         this.logger.error(e.getMessage());
      } finally {
         try {
            bw.close();
         } catch (Exception e) {
            this.logger.error(e.getMessage());
         }

      }

   }

   private void C2S_OrnamentUpLev_7151(int code) {
      for(int i = 0; i < 100 && !this.test.isEnd; ++i) {
         this.logger.info("---向服务端请求配饰升级---");
         EquipMsg.C2S_OrnamentUpLev_7151.Builder builder = EquipMsg.C2S_OrnamentUpLev_7151.newBuilder();
         builder.setCode(code);
         builder.setNum(1);
         this.upLEvTest(builder.build(), "");
      }

   }

   private void C2S_OrnamentUpStar_7153(int code) {
      for(int i = 0; i < 100 && !this.test.isEnd; ++i) {
         this.logger.info("---向服务端请求配饰升星---");
         EquipMsg.C2S_OrnamentUpStar_7153.Builder builder = EquipMsg.C2S_OrnamentUpStar_7153.newBuilder();
         builder.setCode(code);
         this.testUpStar(builder.build(), "");
      }

   }

   public void upLEvTest(EquipMsg.C2S_OrnamentUpLev_7151 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.treasureBag.getItemByCode(msg.getCode());
      if (itemBase == null) {
         this.logger.info("itemCode={}", msg.getCode());
      } else if (!(itemBase instanceof OrnamentItem)) {
         this.logger.info("不是配饰类型");
         this.player.failure(6);
      } else {
         OrnamentItem ornamentItem = (OrnamentItem)itemBase;
         StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ornamentItem.id);
         ItemBagPart part = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         int testNum = part.getItemNum(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId());
         if (msg.getNum() > 0 && !this.player.checkResourceNum(((ResourceModel)stampModel.getLevUpConsume().get(0)).getType(), ((ResourceModel)stampModel.getLevUpConsume().get(0)).getId(), msg.getNum())) {
            this.logger.info("配饰升级道具不足！！");
            this.player.failure(12007);
         } else {
            this.logger.info("当前配饰最高等级：" + ((ResourceModel)stampModel.getLevUpConsume().get(0)).getValue());
            if (msg.getNum() >= 0 && msg.getNum() + ornamentItem.lev <= ((ResourceModel)stampModel.getLevUpConsume().get(0)).getValue()) {
               this.test.data = "\r\n当前配饰id:" + ornamentItem.id + ",当前配饰等级：" + ornamentItem.lev + ",升级要消耗的道具id:" + ((ResourceModel)stampModel.getLevUpConsume().get(0)).getId() + ",本次升级前的道具数量:" + testNum + ",本次升级要消耗道具：" + msg.getNum();
               this.logger.info("写入配饰：" + ornamentItem.id + "----" + ornamentItem.code);
               this.test.data = "";
               if (!msg.getConsumeCodeList().isEmpty()) {
                  for(int i = 0; i < msg.getConsumeCodeList().size(); ++i) {
                     ItemBase consumeItem = itemBagDao.getItemByCode((Integer)msg.getConsumeCodeList().get(i));
                     if (consumeItem == null) {
                        this.logger.info("配饰升级消耗的配饰不存在：{}", msg.getConsumeCodeList().get(i));
                        this.player.failure(12007);
                        return;
                     }
                  }
               }

               Map<Integer, ResourceModel> map = new HashMap();
               List<ResourceModel> sellList = new ArrayList();

               for(int i = 0; i < msg.getConsumeCodeList().size(); ++i) {
                  ItemBase consumeItem = itemBagDao.getItemByCode((Integer)msg.getConsumeCodeList().get(i));
                  OrnamentItem consumeOrnament = (OrnamentItem)consumeItem;
                  StampModel consumeModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", consumeOrnament.id);

                  for(int k = 0; k < consumeModel.getSell().size(); ++k) {
                     int id = ((ResourceModel)consumeModel.getSell().get(k)).getId();
                     int value = ((ResourceModel)consumeModel.getSell().get(k)).getValue();
                     int type = ((ResourceModel)consumeModel.getSell().get(k)).getType();
                     if (map.containsKey(id)) {
                        ((ResourceModel)map.get(id)).setValue(((ResourceModel)map.get(id)).getValue() + value);
                     } else {
                        map.put(id, new ResourceModel(type, id, value));
                     }
                  }

                  int clearNum = consumeOrnament.clearNum1 + consumeOrnament.clearNum2 + consumeOrnament.clearNum3 + consumeOrnament.clearNum4 + consumeOrnament.clearNum5;

                  for(int j = 0; j < clearNum; ++j) {
                     for(int k = 0; k < consumeModel.getClearConsume().size(); ++k) {
                        int id = ((ResourceModel)consumeModel.getClearConsume().get(k)).getId();
                        int value = ((ResourceModel)consumeModel.getClearConsume().get(k)).getValue();
                        int type = ((ResourceModel)consumeModel.getClearConsume().get(k)).getType();
                        if (map.containsKey(id)) {
                           ((ResourceModel)map.get(id)).setValue(((ResourceModel)map.get(id)).getValue() + value);
                        } else {
                           map.put(id, new ResourceModel(type, id, value));
                        }
                     }
                  }
               }

               int needConsume = 0;
               int realConsume = 0;
               int leftNum = 0;
               int consumeNum = ((ResourceModel)stampModel.getLevUpConsume().get(0)).getValue() - ornamentItem.lev;
               this.logger.info("需要消耗多少个：" + consumeNum + "---" + msg.getNum());
               if (map.containsKey(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId())) {
                  int totalNum = ((ResourceModel)map.get(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId())).getValue();
                  this.logger.info("总共卖了多少个：" + totalNum);
                  if (consumeNum > totalNum + msg.getNum()) {
                     needConsume = totalNum + msg.getNum();
                  } else {
                     needConsume = consumeNum;
                  }

                  int tempConsume = needConsume - totalNum;
                  if (tempConsume > 0) {
                     leftNum = 0;
                     realConsume = msg.getNum();
                  } else {
                     leftNum = tempConsume * -1;
                     realConsume = 0;
                  }

                  this.logger.info("剩余返回的数量：" + leftNum);
                  if (leftNum <= 0) {
                     map.remove(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId());
                  } else {
                     ((ResourceModel)map.get(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId())).setValue(leftNum);
                  }
               } else if (msg.getNum() - consumeNum > 0) {
                  realConsume = consumeNum;
                  needConsume = consumeNum;
               } else {
                  realConsume = msg.getNum();
                  needConsume = msg.getNum();
               }

               sellList.addAll(map.values());

               for(int i = 0; i < msg.getConsumeCodeList().size(); ++i) {
                  ItemBase consumeItem = itemBagDao.getItemByCode((Integer)msg.getConsumeCodeList().get(i));
                  OrnamentItem consumeOrnament = (OrnamentItem)consumeItem;
                  ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                  itemBagPart.deleteItemByCode(consumeOrnament.code, 1, 12, 1210, 0, 0, "");
                  this.player.senditemUpdateMsg();
               }

               if (!sellList.isEmpty()) {
                  this.player.addResource(sellList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1210, ornamentItem.id, 1, String.valueOf(this.player.getPlayerId()));
               }

               if (realConsume > 0) {
                  this.logger.info("从背包扣除的数量：" + realConsume);
                  List<ItemBase> list = itemBagDao.getItemById(((ResourceModel)stampModel.getLevUpConsume().get(0)).getId());
                  int bagTotal = 0;

                  for(ItemBase base : list) {
                     bagTotal += base.num;
                  }

                  if (bagTotal < realConsume) {
                     this.logger.error("配饰升级 扣除配饰：" + bagTotal);
                     realConsume = bagTotal;
                  }

                  this.player.delResource(((ResourceModel)stampModel.getLevUpConsume().get(0)).getType(), ((ResourceModel)stampModel.getLevUpConsume().get(0)).getId(), (long)realConsume, 12, 1210, 0, 0, "");
               }

               ornamentItem.lev += needConsume;
               itemBagDao.updateOp();
               this.player.additemUpdateBuilder(ornamentItem);
               this.player.senditemUpdateMsg();
               EquipMsg.S2C_OrnamentUpLev_7152.Builder builder = EquipMsg.S2C_OrnamentUpLev_7152.newBuilder();
               builder.setCode(msg.getCode());
               builder.setLev(ornamentItem.lev);
               this.player.sendMsg(builder.build());
            } else {
               this.player.failure(6);
               this.test.isEnd = true;
               this.test.data = "\r\n升级结束了，当前配饰id:" + ornamentItem.id + ",当前配饰等级：" + ornamentItem.lev + ",此时道具id:" + ((ResourceModel)stampModel.getLevUpConsume().get(0)).getId() + ",还有：" + testNum;
               this.logger.info("写入配饰：" + ornamentItem.id + "----" + ornamentItem.code);
               this.test.data = "";
            }
         }
      }
   }

   public void testUpStar(EquipMsg.C2S_OrnamentUpStar_7153 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.getItemByCode(msg.getCode());
      if (itemBase == null) {
         this.logger.info("itemCode={}", msg.getCode());
      } else if (!(itemBase instanceof OrnamentItem)) {
         this.logger.info("不是配饰类型");
      } else {
         OrnamentItem ornamentItem = (OrnamentItem)itemBase;
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ornamentItem.id);
         if (((ResourceModel)stampModel.getLevUpConsume().get(0)).getValue() > ornamentItem.lev) {
            this.player.failure(12006);
         } else if (!this.player.checkResourceNum((List)stampModel.getStarUpConsume())) {
            this.logger.info("配饰升星道具不足！！");
            this.player.failure(12008);
         } else {
            ItemBagPart part = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            if (stampModel.getTargetStamp() == 0) {
               this.test.data = "\r\n此配饰不可升星：" + ornamentItem.id;
               this.testWrite(this.test.data);
               this.logger.info("写入配饰：" + ornamentItem.id + "----" + ornamentItem.code);
               this.test.data = "";
               this.test.isEnd = true;
            } else {
               this.test.data = "\r\n当前配饰id:" + ornamentItem.id + ",";

               for(int i = 0; i < stampModel.getStarUpConsume().size(); ++i) {
                  int testId = ((ResourceModel)stampModel.getStarUpConsume().get(i)).getId();
                  int testConsumeNum = ((ResourceModel)stampModel.getStarUpConsume().get(i)).getValue();
                  int testNum = part.getItemNum(testId);
                  this.test.data = this.test.data + "此时道具id:" + testId + ",当前数量： " + testNum + ",本次消耗数量：" + testConsumeNum;
               }

               this.player.delResource((List)stampModel.getStarUpConsume(), 12, 1211, 0, 0, "");
               itemBagPart.deleteItemByCode(ornamentItem.code, 1, 12, 1211, 0, 0, "");
               this.player.senditemUpdateMsg();

               try {
                  OrnamentItem newItem = this.addOrnament(ornamentItem, itemBagPart, stampModel.getTargetStamp(), 12, 1211, 0, 0, "");

                  for(int i = 0; i < stampModel.getStarUpConsume().size(); ++i) {
                     int testId = ((ResourceModel)stampModel.getStarUpConsume().get(i)).getId();
                     int testNum = part.getItemNum(testId);
                     this.test.data = this.test.data + ",此次升星后道具id：" + testId + ",剩余：" + testNum;
                  }

                  this.test.data = this.test.data + ", 升星后的配饰id: " + newItem.id;
                  this.testWrite(this.test.data);
                  this.logger.info("写入配饰：" + ornamentItem.id + "----" + ornamentItem.code);
                  this.test.data = "";
                  this.test.isEnd = true;
                  if (newItem != null) {
                     this.player.additemUpdateBuilder(newItem);
                     this.player.senditemUpdateMsg();
                     this.player.addResourceMsg(newItem);
                     this.player.sendResourceMsg();
                  }

                  EquipMsg.S2C_OrnamentUpStar_7154.Builder builder = EquipMsg.S2C_OrnamentUpStar_7154.newBuilder();
                  builder.setInfo(this.getOrnamentInfo(newItem).build());
                  this.player.sendMsg(builder.build());
               } catch (Exception e) {
                  this.logger.error(e.getMessage());
               }

            }
         }
      }
   }

   class Test {
      public boolean isFirst = false;
      public boolean isEnd = false;
      public int ornamentId;
      public int consumeId;
      public int consumeNum;
      public String data;
   }
}
