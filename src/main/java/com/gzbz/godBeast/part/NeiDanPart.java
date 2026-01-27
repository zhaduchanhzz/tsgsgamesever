package com.gzbz.godBeast.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gift.GiftPart;
import com.gzbz.godBeast.NeiDanDefine;
import com.gzbz.godBeast.bean.GodBeastItem;
import com.gzbz.godBeast.bean.NeiDanItem;
import com.gzbz.model.GodBeastNeiDanBaseModel;
import com.gzbz.model.GodBeastNeiDanLevelModel;
import com.gzbz.model.GodBeastNeiDanQualityModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.NeiDanMsg;
import com.gzbz.protobuf.PlayerMsg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
public class NeiDanPart extends PlayerPart {
   private static Logger logger = LoggerFactory.getLogger(NeiDanPart.class);
   @Autowired
   private ConfigManager configManager;

   public int getLogModule() {
      return 159;
   }

   @MsgHandlerAnno
   public boolean C2S_NeiDanHatch_28901(NeiDanMsg.C2S_NeiDanHatch_28901 msg, String source) {
      int neiDanHatchItemId = this.configManager.getInt("GodBeastNeiDanIncubate");
      ResourceModel hatchCost = new ResourceModel(2, neiDanHatchItemId, 1);
      if (!this.player.checkResourceNum(hatchCost)) {
         return this.player.failure(76135);
      } else {
         NeiDanItem drawNeiDanItem = NeiDanDefine.drawNeiDanItem();
         if (null == drawNeiDanItem) {
            return this.player.failure(37);
         } else {
            NeiDanItem neiDanItem = this.addNeiDanItem(drawNeiDanItem, this.getLogModule(), 15901, true);
            if (null != neiDanItem) {
               this.player.delResource(hatchCost, this.getLogModule(), 15902, 0, 0, "");
               NeiDanMsg.S2C_NeiDanHatch_28902.Builder resp = NeiDanMsg.S2C_NeiDanHatch_28902.newBuilder();
               this.addHatchLog(neiDanItem);
               this.player.sendMsg(resp.build());
               return true;
            } else {
               return this.player.failure(6);
            }
         }
      }
   }

   public void addHatchLog(NeiDanItem neiDanItem) {
      StringBuilder attrStr = new StringBuilder();

      for(PropertyModel pro : neiDanItem.entryPro) {
         attrStr.append(pro.getType() + ":" + pro.getWay() + ":" + pro.getValue() + ";");
      }

      this.player.getOperationMgr().addExtraLog(this.player, 198, "内丹孵化", "内丹id:" + neiDanItem.id, "数量:1", "词条id:" + neiDanItem.entryId, "词条属性:" + attrStr.toString());
   }

   @MsgHandlerAnno
   public boolean C2S_NeiDanLvUp_28903(NeiDanMsg.C2S_NeiDanLvUp_28903 msg, String source) {
      NeiDanItem neiDanItem = this.getNeiDanByDressState(msg.getSource());
      if (null == neiDanItem) {
         return this.player.failure(76532);
      } else if (msg.getCostItemList().size() <= 0 && msg.getCostNeiDanCodeList().size() <= 0) {
         return this.player.failure(6);
      } else {
         Map<Integer, Integer> costItemMap = new HashMap();

         for(CommonMsg.MapDataII mapDataII : msg.getCostItemList()) {
            costItemMap.put(mapDataII.getKey(), mapDataII.getValue());
         }

         List<Integer> costNeiDanCodeList = this.intDistinct(msg.getCostNeiDanCodeList());
         List<ResourceModel> reward = new ArrayList();
         int preLv = neiDanItem.level;
         int preExp = neiDanItem.exp;
         int tips = this.lvUp(neiDanItem, costItemMap, costNeiDanCodeList, reward);
         if (tips != 1) {
            return this.player.failure(tips);
         } else {
            for(Map.Entry<Integer, Integer> entry : costItemMap.entrySet()) {
               Integer itemId = (Integer)entry.getKey();
               Integer num = (Integer)entry.getValue();
               this.player.delResource(2, itemId, (long)num, this.getLogModule(), 15903, 0, 0, "");
            }

            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            StringBuilder costNeiDanStr = new StringBuilder();

            for(Integer costNeiDanCode : costNeiDanCodeList) {
               NeiDanItem neiDanItemFromBag = this.getNeiDanItemFromBag(costNeiDanCode);
               costNeiDanStr.append(neiDanItemFromBag.toLogString()).append(";");
            }

            itemBagPart.deleteItemByCodes(costNeiDanCodeList, this.getLogModule(), 15903, 0, 0, "");
            if (reward.size() > 0) {
               this.player.addResource(reward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getLogModule(), 15904);
            }

            this.saveNeiDanByDressState(msg.getSource());
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            Integer neiDanStrongNum = (Integer)playerResetCustomCache.getForeverNum(62, 0);
            int newNeiDNStrongNum = neiDanStrongNum + 1;
            if (newNeiDNStrongNum < Integer.MAX_VALUE) {
               playerResetCustomCache.setForever(62, newNeiDNStrongNum);
            }

            GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
            giftPart.triggerTimeLimitGift(39, newNeiDNStrongNum);
            this.player.getOperationMgr().addExtraLog(this.player, 239, "强化的内丹id:" + neiDanItem.id, "强化前的等级:" + preLv, "强化前的经验:" + preExp, "强化后的等级:" + neiDanItem.level, "强化后的经验:" + neiDanItem.exp, "消耗的精魄道具id和数量:" + costItemMap.toString(), "消耗的内丹道具:" + costNeiDanStr.toString());
            NeiDanMsg.S2C_NeiDanLvUp_28904.Builder builder = NeiDanMsg.S2C_NeiDanLvUp_28904.newBuilder();
            this.player.sendMsg(builder.build());
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_LvResetPreview_28915(NeiDanMsg.C2S_LvResetPreview_28915 msg, String source) {
      NeiDanItem neiDanItem = this.getNeiDanByDressState(msg.getSource());
      if (null == neiDanItem) {
         return this.player.failure(76532);
      } else {
         GodBeastNeiDanLevelModel levelModel = NeiDanDefine.getLevelModel(neiDanItem.level);
         if (null == levelModel) {
            return this.player.failure(37);
         } else {
            List<ResourceModel> lvResetReward = NeiDanDefine.calExpReturnReward(levelModel.getGetEX() + neiDanItem.exp);
            NeiDanMsg.S2C_LvResetPreview_28916.Builder builder = NeiDanMsg.S2C_LvResetPreview_28916.newBuilder();

            for(ResourceModel rm : lvResetReward) {
               CommonMsg.ItemInfo.Builder itemInfo = CommonMsg.ItemInfo.newBuilder();
               itemInfo.setType(rm.getType());
               itemInfo.setId(rm.getId());
               itemInfo.setNum(rm.getValue());
               builder.addReturnReward(itemInfo);
            }

            this.player.sendMsg(builder.build());
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_NeiDanLvReset_28905(NeiDanMsg.C2S_NeiDanLvReset_28905 msg, String source) {
      NeiDanItem neiDanItem = this.getNeiDanByDressState(msg.getSource());
      if (null == neiDanItem) {
         return this.player.failure(76532);
      } else {
         GodBeastNeiDanLevelModel levelModel = NeiDanDefine.getLevelModel(neiDanItem.level);
         if (null == levelModel) {
            return this.player.failure(37);
         } else {
            ResourceModel resetCostGold = NeiDanDefine.getResetCostGold();
            if (!this.player.checkResourceNum(resetCostGold)) {
               return this.player.failure(31);
            } else {
               List<ResourceModel> lvResetReward = NeiDanDefine.calExpReturnReward(levelModel.getGetEX() + neiDanItem.exp);
               this.player.addResource(lvResetReward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getLogModule(), 15905, 0, 0, "");
               this.player.delResource(resetCostGold, this.getLogModule(), 15910, 0, 0, "");
               if (neiDanItem.deputyNeiDan.size() > 0) {
                  for(Map.Entry<Integer, NeiDanItem> entry : neiDanItem.deputyNeiDan.entrySet()) {
                     this.addNeiDanItem((NeiDanItem)entry.getValue(), this.getLogModule(), 15905, false);
                  }
               }

               neiDanItem.reset();
               this.saveNeiDanByDressState(msg.getSource());
               NeiDanMsg.S2C_NeiDanLvReset_28906.Builder builder = NeiDanMsg.S2C_NeiDanLvReset_28906.newBuilder();
               this.player.sendMsg(builder.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_NeiDanCompound_28907(NeiDanMsg.C2S_NeiDanCompound_28907 msg, String source) {
      if (msg.getComType() != 1 && msg.getComType() != 2) {
         return this.player.failure(6);
      } else {
         List<Integer> recNeiDanItemCodeList = this.intDistinct(msg.getRecNeiDanItemCodeList());
         List<Integer> realCostItemCode = new ArrayList();
         List<NeiDanItem> targetNeiDanList = new ArrayList();
         List<NeiDanItem> costNeiDan = new ArrayList();
         List<ResourceModel> lvResetReturn = new ArrayList();
         List<String> logStrList = new ArrayList();

         for(Integer itemCode : recNeiDanItemCodeList) {
            NeiDanItem neiDanItemFromBag = this.getNeiDanItemFromBag(itemCode);
            if (null == neiDanItemFromBag) {
               return this.player.failure(76532);
            }

            if (neiDanItemFromBag.state == 1) {
               return this.player.failure(76549);
            }

            if (neiDanItemFromBag.deputyNeiDan.size() > 0) {
               return this.player.failure(76533);
            }

            costNeiDan.add(neiDanItemFromBag);
            if (msg.getComType() == 1) {
               if (costNeiDan.size() == 3) {
                  int sameQuality = 0;

                  for(int i = 0; i < costNeiDan.size(); ++i) {
                     NeiDanItem neiDanItem = (NeiDanItem)costNeiDan.get(i);
                     GodBeastNeiDanBaseModel baseModel = NeiDanDefine.getBaseModel(neiDanItem.id);
                     if (null == baseModel) {
                        return this.player.failure(37);
                     }

                     if (i == 0) {
                        sameQuality = baseModel.getQuality();
                     }

                     if (baseModel.getQuality() != sameQuality) {
                        return this.player.failure(76534);
                     }

                     GodBeastNeiDanLevelModel levelModel = NeiDanDefine.getLevelModel(neiDanItem.level);

                     for(ResourceModel rm : NeiDanDefine.calExpReturnReward(levelModel.getGetEX() + neiDanItem.exp)) {
                        rm.addResourceToList(lvResetReturn);
                     }

                     realCostItemCode.add(neiDanItem.code);
                  }

                  int typeId = NeiDanDefine.randomTypeId();
                  GodBeastNeiDanBaseModel baseModel = NeiDanDefine.getBaseModel(sameQuality + 1, typeId);
                  if (null == baseModel) {
                     return this.player.failure(76535);
                  }

                  NeiDanItem targetNeiDan = NeiDanDefine.drawNeiDanItem(baseModel.getId());
                  if (targetNeiDan == null) {
                     return this.player.failure(76546);
                  }

                  targetNeiDanList.add(targetNeiDan);
                  StringBuilder logStr = new StringBuilder();

                  for(int i = 0; i < costNeiDan.size(); ++i) {
                     NeiDanItem costNei = (NeiDanItem)costNeiDan.get(i);
                     logStr.append("消耗的第[").append(i + 1).append("]").append("个内丹id:").append(costNei.id).append(" 词条id:").append(costNei.entryId).append(",");
                  }

                  logStr.append(";").append("获得的目标内丹id:").append(targetNeiDan.id).append(" 词条id:").append(targetNeiDan.entryId);
                  logStrList.add(logStr.toString());
                  costNeiDan.clear();
               }
            } else if (costNeiDan.size() == 2) {
               int sameQuality = 0;

               for(int i = 0; i < costNeiDan.size(); ++i) {
                  NeiDanItem neiDanItem = (NeiDanItem)costNeiDan.get(i);
                  GodBeastNeiDanBaseModel baseModel = NeiDanDefine.getBaseModel(neiDanItem.id);
                  if (null == baseModel) {
                     return this.player.failure(37);
                  }

                  if (i == 0) {
                     sameQuality = baseModel.getQuality();
                  }

                  if (baseModel.getQuality() != sameQuality) {
                     return this.player.failure(76534);
                  }

                  GodBeastNeiDanLevelModel levelModel = NeiDanDefine.getLevelModel(neiDanItem.level);

                  for(ResourceModel rm : NeiDanDefine.calExpReturnReward(levelModel.getGetEX() + neiDanItem.exp)) {
                     rm.addResourceToList(lvResetReturn);
                  }

                  realCostItemCode.add(neiDanItem.code);
               }

               int typeId = NeiDanDefine.randomTypeId();
               GodBeastNeiDanBaseModel baseModel = NeiDanDefine.getBaseModel(sameQuality, typeId);
               if (null == baseModel) {
                  return this.player.failure(37);
               }

               NeiDanItem targetNeiDan = NeiDanDefine.drawNeiDanItem(baseModel.getId());
               if (targetNeiDan == null) {
                  return this.player.failure(76546);
               }

               targetNeiDanList.add(targetNeiDan);
               StringBuilder logStr = new StringBuilder();

               for(int i = 0; i < costNeiDan.size(); ++i) {
                  NeiDanItem costNei = (NeiDanItem)costNeiDan.get(i);
                  logStr.append("消耗的第[").append(i + 1).append("]").append("个内丹id:").append(costNei.id).append(" 词条id:").append(costNei.entryId).append(",");
               }

               logStr.append(";").append("获得的目标内丹id:").append(targetNeiDan.id).append(" 词条id:").append(targetNeiDan.entryId);
               logStrList.add(logStr.toString());
               costNeiDan.clear();
            }
         }

         if (targetNeiDanList.isEmpty()) {
            return this.player.failure(76546);
         } else {
            int logReason = msg.getComType() == 1 ? 15906 : 15907;
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            itemBagPart.deleteItemByCodes(realCostItemCode, this.getLogModule(), logReason, 0, 0, "");

            for(NeiDanItem neiDanItem : targetNeiDanList) {
               NeiDanItem addNeiDanItem = this.addNeiDanItem(neiDanItem, this.getLogModule(), logReason, false);
               this.player.addResourceMsg(addNeiDanItem);
            }

            this.player.sendResourceMsg(PlayerMsg.ShowType.SHOW_NEI_DAN);
            this.player.addResource(lvResetReturn, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getLogModule(), logReason);
            if (logStrList.size() > 0) {
               String comTypeStr = msg.getComType() == 1 ? "内丹合成" : "内丹炼化";
               int logCmdDefineId = msg.getComType() == 1 ? 237 : 238;

               for(String logStr : logStrList) {
                  this.player.getOperationMgr().addExtraLog(this.player, logCmdDefineId, comTypeStr, logStr);
               }
            }

            NeiDanMsg.S2C_NeiDanCompound_28908.Builder builder = NeiDanMsg.S2C_NeiDanCompound_28908.newBuilder();
            this.player.sendMsg(builder.build());
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_NeiDanDress_28909(NeiDanMsg.C2S_NeiDanDress_28909 msg, String source) {
      if (msg.getTarget().getState() == 0) {
         return this.player.failure(6);
      } else {
         NeiDanItem resource = this.getNeiDanByDressState(msg.getResource());
         if (null == resource) {
            return this.player.failure(76532);
         } else {
            if (msg.getTarget().getPos() > 0) {
               if (resource.checkReset()) {
                  ResourceModel resetCostGold = NeiDanDefine.getResetCostGold();
                  if (!this.player.checkResourceNum(resetCostGold)) {
                     return this.player.failure(31);
                  }

                  GodBeastNeiDanLevelModel levelModel = NeiDanDefine.getLevelModel(resource.level);
                  if (null == levelModel) {
                     return this.player.failure(37);
                  }

                  List<ResourceModel> lvResetReward = NeiDanDefine.calExpReturnReward(levelModel.getGetEX() + resource.exp);
                  this.player.addResource(lvResetReward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getLogModule(), 15905, 0, 0, "");
                  this.player.delResource(resetCostGold, this.getLogModule(), 15910, 0, 0, "");
               }

               if (resource.deputyNeiDan.size() > 0) {
                  for(Map.Entry<Integer, NeiDanItem> entry : resource.deputyNeiDan.entrySet()) {
                     this.addNeiDanItem((NeiDanItem)entry.getValue(), this.getLogModule(), 15905, false);
                  }
               }

               resource.reset();
               this.saveNeiDanByDressState(msg.getResource());
            }

            NeiDanItem target = this.getNeiDanByDressState(msg.getTarget());
            if (null != target) {
               this.addNeiDanItem(target, this.getLogModule(), 15909, false);
               this.delNeiDanByDressState(msg.getTarget(), 15909, false);
            }

            NeiDanItem dressNeiDan = new NeiDanItem(0, resource);
            int tips = this.dressNeiDanByDressState(dressNeiDan, msg.getTarget());
            if (tips != 1) {
               return this.player.failure(tips);
            } else {
               this.delNeiDanByDressState(msg.getResource(), 15908, true);
               NeiDanMsg.S2C_NeiDanDress_28910.Builder builder = NeiDanMsg.S2C_NeiDanDress_28910.newBuilder();
               this.player.sendMsg(builder.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_UndressNeiDan_28911(NeiDanMsg.C2S_UndressNeiDan_28911 msg, String source) {
      if (msg.getResource().getState() == 0) {
         return this.player.failure(6);
      } else {
         NeiDanItem resource = this.getNeiDanByDressState(msg.getResource());
         if (null == resource) {
            return this.player.failure(76532);
         } else {
            this.addNeiDanItem(resource, this.getLogModule(), 15909, false);
            this.delNeiDanByDressState(msg.getResource(), 15909, true);
            NeiDanMsg.S2C_UndressNeiDan_28912.Builder builder = NeiDanMsg.S2C_UndressNeiDan_28912.newBuilder();
            this.player.sendMsg(builder.build());
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_LockNeiDan_28913(NeiDanMsg.C2S_LockNeiDan_28913 msg, String source) {
      NeiDanItem resource = this.getNeiDanByDressState(msg.getResource());
      if (null == resource) {
         return this.player.failure(76532);
      } else if (msg.getState() != resource.state && msg.getState() <= 1) {
         resource.state = msg.getState();
         this.saveNeiDanByDressState(msg.getResource());
         NeiDanMsg.S2C_LockNeiDan_28914.Builder builder = NeiDanMsg.S2C_LockNeiDan_28914.newBuilder();
         builder.setResource(msg.getResource());
         builder.setState(msg.getState());
         this.player.sendMsg(builder.build());
         return true;
      } else {
         return this.player.failure(6);
      }
   }

   public int dressNeiDanByDressState(NeiDanItem resource, NeiDanMsg.DressState dressState) {
      if (resource == null) {
         return 76532;
      } else if (dressState.getPos() <= 0 || !resource.checkReset() && resource.deputyNeiDan.size() <= 0) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         switch (dressState.getState()) {
            case 1:
               ItemBase mainNeiDanOrGodBeast = this.getItemBaseFromBag(dressState.getCode());
               if (null == mainNeiDanOrGodBeast) {
                  logger.error("dress失败 获取不到内丹或灵兽数据 playerId:{} dressState:{}", this.player.getPlayerId(), dressState.toString());
                  return 5;
               }

               if (mainNeiDanOrGodBeast instanceof NeiDanItem) {
                  NeiDanItem mainNeiDan = (NeiDanItem)mainNeiDanOrGodBeast;
                  NeiDanItem posNeiDan = (NeiDanItem)mainNeiDan.deputyNeiDan.get(dressState.getPos());
                  if (null != posNeiDan) {
                     return 76548;
                  }

                  mainNeiDan.deputyNeiDan.put(dressState.getPos(), resource);
               } else if (mainNeiDanOrGodBeast instanceof GodBeastItem) {
                  GodBeastItem godBeast = (GodBeastItem)mainNeiDanOrGodBeast;
                  if (dressState.getPos() == 0) {
                     if (null != godBeast.mainNeiDan) {
                        return 76548;
                     }

                     godBeast.mainNeiDan = resource;
                  } else {
                     NeiDanItem posNeiDan = (NeiDanItem)godBeast.mainNeiDan.deputyNeiDan.get(dressState.getPos());
                     if (null != posNeiDan) {
                        return 76548;
                     }

                     godBeast.mainNeiDan.deputyNeiDan.put(dressState.getPos(), resource);
                  }
               }

               itemBagPart.updateOp();
               this.player.additemUpdateBuilder(mainNeiDanOrGodBeast);
               this.player.senditemUpdateMsg();
               break;
            case 2:
               GodBeastPart godBeastPart = (GodBeastPart)this.player.getMgrPart(GodBeastPart.class);
               GodBeastItem godBeastItemFromHero = godBeastPart.getGodBeastItemFromHero(dressState.getCode());
               if (null == godBeastItemFromHero) {
                  logger.error("dress失败 获取不到内丹数据 playerId:{} dressState:{}", this.player.getPlayerId(), dressState.toString());
                  return 5;
               }

               if (dressState.getPos() == 0) {
                  if (null != godBeastItemFromHero.mainNeiDan) {
                     return 76548;
                  }

                  godBeastItemFromHero.mainNeiDan = resource;
               } else {
                  NeiDanItem posNeiDan = (NeiDanItem)godBeastItemFromHero.mainNeiDan.deputyNeiDan.get(dressState.getPos());
                  if (posNeiDan != null) {
                     return 76548;
                  }

                  godBeastItemFromHero.mainNeiDan.deputyNeiDan.put(dressState.getPos(), resource);
               }

               godBeastPart.updateHeroGodBeastAndFlush(dressState.getCode());
               break;
            default:
               return 6;
         }

         return 1;
      } else {
         return 76533;
      }
   }

   public int lvUp(NeiDanItem neiDanItem, Map<Integer, Integer> costItemMap, List<Integer> costNeiDanCodeList, List<ResourceModel> reward) {
      if (neiDanItem != null && costItemMap != null && costNeiDanCodeList != null) {
         GodBeastNeiDanLevelModel curLvModel = NeiDanDefine.getLevelModel(neiDanItem.level);
         if (null == curLvModel) {
            return 37;
         } else {
            GodBeastNeiDanLevelModel nextLvModel = NeiDanDefine.getLevelModel(neiDanItem.level + 1);
            if (null == nextLvModel) {
               return 26;
            } else {
               Map<Integer, Integer> realCostItemMap = new HashMap();
               Map<Integer, Integer> lvUpItemId_exp = NeiDanDefine.getLvUpItemId_exp();
               boolean isMaxLv = false;
               Iterator realCostNeiDanCodeList = costItemMap.entrySet().iterator();

               while(true) {
                  if (realCostNeiDanCodeList.hasNext()) {
                     Map.Entry<Integer, Integer> entry = (Map.Entry)realCostNeiDanCodeList.next();
                     Integer itemId = (Integer)entry.getKey();
                     Integer num = (Integer)entry.getValue();
                     if (num <= 0) {
                        return 6;
                     }

                     if (!this.player.checkResourceNum(2, itemId, num)) {
                        return 76135;
                     }

                     Integer singleAddExp = (Integer)lvUpItemId_exp.get(itemId);
                     if (null == singleAddExp) {
                        return 76547;
                     }

                     int addExp = singleAddExp * num;
                     isMaxLv = this.addExp(neiDanItem, addExp, reward);
                     realCostItemMap.put(itemId, num);
                     if (!isMaxLv) {
                        continue;
                     }
                  }

                  costItemMap.clear();
                  costItemMap.putAll(realCostItemMap);
                  if (isMaxLv) {
                     costNeiDanCodeList.clear();
                  } else {
                     List<Integer> realCostNeiDanCodeList = new ArrayList();
                     Iterator var20 = costNeiDanCodeList.iterator();

                     while(true) {
                        if (var20.hasNext()) {
                           Integer costNeiDanCode = (Integer)var20.next();
                           NeiDanItem costNeiDanItemFromBag = this.getNeiDanItemFromBag(costNeiDanCode);
                           if (null == costNeiDanItemFromBag) {
                              return 76532;
                           }

                           if (costNeiDanItemFromBag.deputyNeiDan.size() > 0) {
                              return 76533;
                           }

                           if (costNeiDanItemFromBag.state == 1) {
                              return 76549;
                           }

                           GodBeastNeiDanBaseModel costBaseModel = NeiDanDefine.getBaseModel(costNeiDanItemFromBag.id);
                           GodBeastNeiDanQualityModel costQualityModel = NeiDanDefine.getQualityModel(costBaseModel.getQuality());
                           GodBeastNeiDanLevelModel costNeiDanLvModel = NeiDanDefine.getLevelModel(costNeiDanItemFromBag.level);
                           int addExp = costQualityModel.getExp() + costNeiDanLvModel.getGetEX() + costNeiDanItemFromBag.exp;
                           isMaxLv = this.addExp(neiDanItem, addExp, reward);
                           realCostNeiDanCodeList.add(costNeiDanCode);
                           if (!isMaxLv) {
                              continue;
                           }
                        }

                        costNeiDanCodeList.clear();
                        costNeiDanCodeList.addAll(realCostNeiDanCodeList);
                        break;
                     }
                  }

                  return 1;
               }
            }
         }
      } else {
         return 6;
      }
   }

   public boolean addExp(NeiDanItem neiDanItem, int addExp, List<ResourceModel> reward) {
      neiDanItem.exp += addExp;
      boolean isMaxLv = false;

      while(true) {
         GodBeastNeiDanLevelModel curLvModel = NeiDanDefine.getLevelModel(neiDanItem.level);
         GodBeastNeiDanLevelModel nextLvModel = NeiDanDefine.getLevelModel(neiDanItem.level + 1);
         if (nextLvModel == null) {
            isMaxLv = true;
            break;
         }

         if (curLvModel.getExp() <= 0) {
            logger.error("GodBeastNeiDanLevel 表exp字段配置有误，lv:{}", curLvModel.getLv());
            return true;
         }

         if (neiDanItem.exp < curLvModel.getExp()) {
            break;
         }

         neiDanItem.level = nextLvModel.getLv();
         neiDanItem.exp -= curLvModel.getExp();
      }

      if (isMaxLv && neiDanItem.exp > 0) {
         for(ResourceModel rm : NeiDanDefine.calExpReturnReward(neiDanItem.exp)) {
            rm.addResourceToList(reward);
         }

         neiDanItem.exp = 0;
      }

      return isMaxLv;
   }

   public NeiDanItem addNeiDanItem(NeiDanItem data, int module, int reason, boolean sendResourceMsg) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      NeiDanItem neiDanItem = itemBagPart.addNeiDanItem(data, module, reason, 0, 0, "");
      if (null != neiDanItem) {
         this.updateBagNeiDanItem(neiDanItem.code);
         if (sendResourceMsg) {
            this.player.addResourceMsg(neiDanItem);
            this.player.sendResourceMsg(PlayerMsg.ShowType.SHOW_NEI_DAN);
         }
      }

      return neiDanItem;
   }

   public void updateBagNeiDanItem(int itemCode) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      itemBagPart.updateOp();
      NeiDanItem neiDanItemFromBag = this.getNeiDanItemFromBag(itemCode);
      if (null != neiDanItemFromBag) {
         this.player.additemUpdateBuilder(neiDanItemFromBag);
         this.player.senditemUpdateMsg();
      }
   }

   public NeiDanItem getNeiDanItemFromBag(int itemCode) {
      ItemBase itemBaseFromBag = this.getItemBaseFromBag(itemCode);
      if (!(itemBaseFromBag instanceof NeiDanItem)) {
         logger.error("玩家player:{} 道具itemCode:{}，不是内丹道具", this.player.getPlayerId(), itemCode);
         return null;
      } else {
         return (NeiDanItem)itemBaseFromBag;
      }
   }

   public ItemBase getItemBaseFromBag(int itemCode) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      ItemBase itemBase = itemBagPart.getItemByCode(itemCode);
      if (itemBase == null) {
         logger.error("玩家 playerId:{} 背包中未找到道具 itemCode:{}", this.player.getPlayerId(), itemCode);
         return null;
      } else {
         return itemBase;
      }
   }

   public void saveNeiDanByDressState(NeiDanMsg.DressState dressState) {
      this.getNeiDanByDressState(dressState, true);
   }

   public NeiDanItem getNeiDanByDressState(NeiDanMsg.DressState dressState) {
      return this.getNeiDanByDressState(dressState, false);
   }

   public boolean delNeiDanByDressState(NeiDanMsg.DressState dressState, int logReason, boolean needFlushHero) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      switch (dressState.getState()) {
         case 0:
            itemBagPart.deleteItemByCode(dressState.getCode(), 1, this.getLogModule(), logReason, 0, 0, "");
            this.player.senditemUpdateMsg();
            return true;
         case 1:
            ItemBase mainNeiDanOrGodBeast = this.getItemBaseFromBag(dressState.getCode());
            if (null == mainNeiDanOrGodBeast) {
               logger.error("del失败 获取不到内丹或灵兽数据 playerId:{} dressState:{}", this.player.getPlayerId(), dressState.toString());
               return false;
            }

            if (mainNeiDanOrGodBeast instanceof NeiDanItem) {
               NeiDanItem mainNeiDan = (NeiDanItem)mainNeiDanOrGodBeast;
               mainNeiDan.deputyNeiDan.remove(dressState.getPos());
            } else if (mainNeiDanOrGodBeast instanceof GodBeastItem) {
               GodBeastItem godBeast = (GodBeastItem)mainNeiDanOrGodBeast;
               if (dressState.getPos() == 0) {
                  godBeast.mainNeiDan = null;
               } else {
                  godBeast.mainNeiDan.deputyNeiDan.remove(dressState.getPos());
               }
            }

            itemBagPart.updateOp();
            this.player.additemUpdateBuilder(mainNeiDanOrGodBeast);
            this.player.senditemUpdateMsg();
            return true;
         case 2:
            GodBeastPart godBeastPart = (GodBeastPart)this.player.getMgrPart(GodBeastPart.class);
            GodBeastItem godBeastItemFromHero = godBeastPart.getGodBeastItemFromHero(dressState.getCode());
            if (null != godBeastItemFromHero && null != godBeastItemFromHero.mainNeiDan) {
               if (dressState.getPos() == 0) {
                  godBeastItemFromHero.mainNeiDan = null;
               } else {
                  godBeastItemFromHero.mainNeiDan.deputyNeiDan.remove(dressState.getPos());
               }

               if (needFlushHero) {
                  godBeastPart.updateHeroGodBeastAndFlush(dressState.getCode());
               }

               return true;
            }

            logger.error("del失败 获取不到内丹数据 playerId:{} dressState:{}", this.player.getPlayerId(), dressState.toString());
            return false;
         default:
            logger.error("del失败 获取不到内丹数据 playerId:{} dressState:{}", this.player.getPlayerId(), dressState.toString());
            return false;
      }
   }

   public NeiDanItem getNeiDanByDressState(NeiDanMsg.DressState dressState, boolean saveDB) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      NeiDanItem neiDanItem = null;
      switch (dressState.getState()) {
         case 0:
            NeiDanItem neiDanItemFromBag = this.getNeiDanItemFromBag(dressState.getCode());
            if (null == neiDanItemFromBag) {
               logger.error("获取不到内丹数据 playerId:{} dressState:{}", this.player.getPlayerId(), dressState.toString());
               return null;
            }

            if (saveDB) {
               itemBagPart.updateOp();
               this.player.additemUpdateBuilder(neiDanItemFromBag);
               this.player.senditemUpdateMsg();
            }

            return neiDanItemFromBag;
         case 1:
            ItemBase mainNeiDanOrGodBeast = this.getItemBaseFromBag(dressState.getCode());
            if (null == mainNeiDanOrGodBeast) {
               return null;
            } else {
               if (mainNeiDanOrGodBeast instanceof NeiDanItem) {
                  NeiDanItem mainNeiDan = (NeiDanItem)mainNeiDanOrGodBeast;
                  neiDanItem = (NeiDanItem)mainNeiDan.deputyNeiDan.get(dressState.getPos());
               } else if (mainNeiDanOrGodBeast instanceof GodBeastItem) {
                  GodBeastItem godBeast = (GodBeastItem)mainNeiDanOrGodBeast;
                  if (dressState.getPos() == 0) {
                     neiDanItem = godBeast.mainNeiDan;
                  } else {
                     neiDanItem = (NeiDanItem)godBeast.mainNeiDan.deputyNeiDan.get(dressState.getPos());
                  }
               }

               if (neiDanItem == null) {
                  return null;
               }

               if (saveDB) {
                  itemBagPart.updateOp();
                  this.player.additemUpdateBuilder(mainNeiDanOrGodBeast);
                  this.player.senditemUpdateMsg();
               }

               return neiDanItem;
            }
         case 2:
            GodBeastPart godBeastPart = (GodBeastPart)this.player.getMgrPart(GodBeastPart.class);
            GodBeastItem godBeastItemFromHero = godBeastPart.getGodBeastItemFromHero(dressState.getCode());
            if (null != godBeastItemFromHero && null != godBeastItemFromHero.mainNeiDan) {
               if (dressState.getPos() == 0) {
                  neiDanItem = godBeastItemFromHero.mainNeiDan;
               } else {
                  neiDanItem = (NeiDanItem)godBeastItemFromHero.mainNeiDan.deputyNeiDan.get(dressState.getPos());
               }

               if (saveDB) {
                  godBeastPart.updateHeroGodBeastAndFlush(dressState.getCode());
               }

               return neiDanItem;
            }

            return null;
         default:
            logger.error("获取不到内丹数据 playerId:{} dressState:{}", this.player.getPlayerId(), dressState.toString());
            return null;
      }
   }

   public List<Integer> intDistinct(List<Integer> list) {
      List<Integer> distinctList = new ArrayList();
      if (null == list) {
         return distinctList;
      } else {
         for(Integer i : list) {
            if (!distinctList.contains(i)) {
               distinctList.add(i);
            }
         }

         return distinctList;
      }
   }
}
