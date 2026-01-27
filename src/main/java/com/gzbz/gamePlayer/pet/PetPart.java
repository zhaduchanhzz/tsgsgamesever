package com.gzbz.gamePlayer.pet;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.db.PetDao;
import com.gzbz.db.arraying.PetMirror;
import com.gzbz.db.bean.PetArrayingData;
import com.gzbz.db.bean.PetHatchData;
import com.gzbz.gameDefine.CodeDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.HeroBagModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.PetDictionaryModel;
import com.gzbz.model.PetExSkillModel;
import com.gzbz.model.PetFlyModel;
import com.gzbz.model.PetHatchLibModel;
import com.gzbz.model.PetHatchModel;
import com.gzbz.model.PetModel;
import com.gzbz.model.PetSkillSlotOpenModel;
import com.gzbz.model.PetUpStarModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.UpgradeModel;
import com.gzbz.model.fun.NeedItemsFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PetMsg;
import com.gzbz.protobuf.PlayerMsg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.DateUtil;
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
public class PetPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(PetPart.class);
   @Autowired
   ConfigManager configManager;
   private TreeMap<Integer, PetMirror> petMirrorMap = new TreeMap();

   public void loginHandle() {
      this.opPetUi();
   }

   public TreeMap<Integer, PetMirror> getPetMirrorMap() {
      return this.petMirrorMap;
   }

   @MsgHandlerAnno
   public void C2S_PetOpenUi_12801(PetMsg.C2S_PetOpenUi_12801 msg, String source) {
      this.opPetUi();
   }

   @MsgHandlerAnno
   public void C2S_BuyBagLattice_12803(PetMsg.C2S_BuyBagLattice_12803 msg, String source) {
      this.buyBagLattice();
   }

   @MsgHandlerAnno
   public void C2S_PetArraying_12805(PetMsg.C2S_PetArraying_12805 msg, String source) {
      this.petArraying(msg.getInfoList());
   }

   @MsgHandlerAnno
   public void C2S_PetArrayingSkill_12807(PetMsg.C2S_PetArrayingSkill_12807 msg, String source) {
      this.petArrayingSkill(msg.getSkillIndexList());
   }

   @MsgHandlerAnno
   public void C2S_PetUpLv_12811(PetMsg.C2S_PetUpLv_12811 msg, String source) {
      this.petUpLv(msg.getCode());
   }

   @MsgHandlerAnno
   public void C2S_PetUpStar_12813(PetMsg.C2S_PetUpStar_12813 msg, String source) {
      this.petUpStar(msg.getCode());
   }

   @MsgHandlerAnno
   public void C2S_PetFly_12815(PetMsg.C2S_PetFly_12815 msg, String source) {
      this.petUpBreach(msg.getCode(), msg.getInfosList());
   }

   @MsgHandlerAnno
   public void C2S_PetMerge_12817(PetMsg.C2S_PetMerge_12817 msg, String source) {
      this.merge(msg.getMainCode(), msg.getSlaveCode());
   }

   @MsgHandlerAnno
   public void C2S_LeanSkill_12819(PetMsg.C2S_LeanSkill_12819 msg, String source) {
      this.leanSkill(msg.getCode(), msg.getItemCode());
   }

   @MsgHandlerAnno
   public void C2S_TransferGroup_12821(PetMsg.C2S_TransferGroup_12821 msg, String source) {
      this.transferGrow(msg.getMainCode(), msg.getSlaveCode());
   }

   @MsgHandlerAnno
   public void C2S_HatchUi_12841(PetMsg.C2S_HatchUi_12841 msg, String source) {
      this.openHatchUi();
   }

   @MsgHandlerAnno
   public void C2S_Hatch_12843(PetMsg.C2S_Hatch_12843 msg, String source) {
      this.hatch(msg.getPosition(), msg.getEggId());
   }

   @MsgHandlerAnno
   public void C2S_HatchOpen_12847(PetMsg.C2S_HatchOpen_12847 msg, String source) {
      this.hatchOpenSendClient(msg.getPosition());
   }

   @MsgHandlerAnno
   public void C2S_TakeHatchReward_12849(PetMsg.C2S_TakeHatchReward_12849 msg, String source) {
      this.takeHatchReward(msg.getRewardId());
   }

   @MsgHandlerAnno
   public void C2S_HatchAccelerate_12851(PetMsg.C2S_HatchAccelerate_12851 msg, String source) {
      this.hatchAccelerate(msg.getPosition());
   }

   @MsgHandlerAnno
   public void C2S_OneKeyHatchAccelerate_12853(PetMsg.C2S_OneKeyHatchAccelerate_12853 msg, String source) {
      this.oneKeyHatchAccelerate();
   }

   @MsgHandlerAnno
   public void C2S_PetDecompose_12861(PetMsg.C2S_PetDecompose_12861 msg, String source) {
      this.decompose(msg.getCodesList());
   }

   @MsgHandlerAnno
   public void C2S_TakeDictionaryReward_12871(PetMsg.C2S_TakeDictionaryReward_12871 msg, String source) {
      this.takeDictionaryReward(msg.getPetIdList());
   }

   @MsgHandlerAnno
   public void C2S_PetLock_12875(PetMsg.C2S_PetLock_12875 msg, String source) {
      this.petLock(msg.getCode(), msg.getType());
   }

   public void opPetUi() {
      if (this.player.isSystemOpen(2501)) {
         PetDao petDao = this.getPetDao();
         if (petDao.hatchSlocts.isEmpty()) {
            PetHatchData petHatchData = new PetHatchData();
            petDao.hatchSlocts.put(1, petHatchData);
            petDao.updateOp();
         }

         if (petDao.arraying.isEmpty()) {
            petDao.arraying.put(1, new PetArrayingData());
            petDao.updateOp();
         }

         PetMsg.S2C_PetOpenUi_12802.Builder builder = PetMsg.S2C_PetOpenUi_12802.newBuilder();
         builder.setHatchLv(petDao.hatchLv);
         builder.setHatchExp(petDao.hatchExp);
         if (!petDao.arraying.isEmpty()) {
            for(Map.Entry<Integer, PetArrayingData> entry : petDao.arraying.entrySet()) {
               builder.addInfos(this.toPetDaoArrayingInfo((PetArrayingData)entry.getValue()));
            }
         }

         if (!petDao.hatchSlocts.isEmpty()) {
            for(Map.Entry<Integer, PetHatchData> entry : petDao.hatchSlocts.entrySet()) {
               builder.addHatchInfos(this.toHatchSoltInfo((Integer)entry.getKey(), (PetHatchData)entry.getValue()));
            }
         }

         if (!petDao.dictionaryMap.isEmpty()) {
            for(Map.Entry<Integer, Integer> entry : petDao.dictionaryMap.entrySet()) {
               CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
               info.setKey((Integer)entry.getKey());
               info.setValue((Integer)entry.getValue());
               builder.addDictionaryMap(info);
            }
         }

         if (!petDao.takedIds.isEmpty()) {
            builder.addAllTakedRewardId(petDao.takedIds);
         }

         this.player.sendMsg(builder.build());
      }

   }

   public void petArraying(List<PetMsg.PetDaoArrayingInfo> infoList) {
      PetDao petDao = this.getPetDao();
      if (!infoList.isEmpty()) {
         List<Integer> codeList = new ArrayList();
         List<Integer> idList = new ArrayList();
         List<Integer> indexList = new ArrayList();
         List<Integer> skillIndexList = new ArrayList();
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

         for(PetMsg.PetDaoArrayingInfo info : infoList) {
            int code = info.getCode();
            if (codeList.contains(code)) {
               logger.error("玩家={}，神兽布阵有重复CODE={}，已有={}", new Object[]{this.player.getPlayerId(), code, codeList});
               return;
            }

            Pet pet = this.getPetByCode(code);
            if (pet == null) {
               return;
            }

            codeList.add(code);
            if (idList.contains(pet.id)) {
               logger.error("玩家={}，布阵ID重复，ID={}，已有={}", new Object[]{this.player.getPlayerId(), pet.id, idList});
            }

            idList.add(pet.id);
            int index = info.getIndex();
            if (indexList.contains(index)) {
               logger.error("玩家={}，神兽布阵位置有重复Index={}，已有={}", new Object[]{this.player.getPlayerId(), index, indexList});
               return;
            }

            if (index < 1 || index > 3) {
               logger.error("玩家={}，神兽布阵位置错误，Index={}，", this.player.getPlayerId(), index);
               return;
            }

            if (!petDao.arraying.containsKey(index)) {
               logger.error("玩家={}，位置={}没有解锁", this.player.getPlayerId(), index);
               return;
            }

            indexList.add(index);
            int skillIndex = info.getSkillIndex();
            if (skillIndexList.contains(skillIndex)) {
               logger.error("玩家={}，神兽布阵技能位置有重复Index={}，已有={}", new Object[]{this.player.getPlayerId(), skillIndex, skillIndexList});
               return;
            }

            if (skillIndex < 1 || skillIndex > 4) {
               logger.error("玩家={}，神兽布阵位置错误，Index={}，", this.player.getPlayerId(), skillIndex);
               return;
            }

            skillIndexList.add(skillIndex);
         }

         if (!indexList.contains(1)) {
            logger.error("主阵位没有神兽，是否需要处理？");
         }
      }

      if (infoList.isEmpty()) {
         for(Map.Entry<Integer, PetArrayingData> entry : petDao.arraying.entrySet()) {
            ((PetArrayingData)entry.getValue()).code = 0;
            ((PetArrayingData)entry.getValue()).index = 0;
            ((PetArrayingData)entry.getValue()).skillIndex = 0;
         }

         petDao.updateOp();
      } else {
         for(Map.Entry<Integer, PetArrayingData> entry : petDao.arraying.entrySet()) {
            PetMsg.PetDaoArrayingInfo info = this.getPetDaoArrayingInfo((Integer)entry.getKey(), infoList);
            if (info == null) {
               ((PetArrayingData)entry.getValue()).code = 0;
               ((PetArrayingData)entry.getValue()).index = 0;
               ((PetArrayingData)entry.getValue()).skillIndex = 0;
            } else {
               ((PetArrayingData)entry.getValue()).code = info.getCode();
               ((PetArrayingData)entry.getValue()).index = info.getIndex();
               ((PetArrayingData)entry.getValue()).skillIndex = info.getSkillIndex();
            }
         }

         petDao.updateOp();
      }

      this.flushPetArrayingAndHeroDao();
      PetMsg.S2C_UpdateArrayingInfo_12809.Builder arrayingBuilder = PetMsg.S2C_UpdateArrayingInfo_12809.newBuilder();

      for(Map.Entry<Integer, PetArrayingData> entry : petDao.arraying.entrySet()) {
         arrayingBuilder.addInfos(this.toPetDaoArrayingInfo((PetArrayingData)entry.getValue()));
      }

      this.player.sendMsg(arrayingBuilder.build());
      PetMsg.S2C_PetArraying_12806.Builder builder = PetMsg.S2C_PetArraying_12806.newBuilder();
      builder.setResult(1);
      this.player.sendMsg(builder.build());
   }

   public PetMsg.PetDaoArrayingInfo getPetDaoArrayingInfo(int position, List<PetMsg.PetDaoArrayingInfo> infoList) {
      for(PetMsg.PetDaoArrayingInfo info : infoList) {
         if (info.getIndex() == position) {
            return info;
         }
      }

      return null;
   }

   public void petArrayingSkill(List<CommonMsg.MapDataII> list) {
      PetDao petDao = this.getPetDao();
      if (petDao.arraying.size() != list.size()) {
         logger.error("玩家={}，神兽技能布阵错误，神兽布阵Size={}，技能布阵Size={}", new Object[]{this.player.getPlayerId(), petDao.arraying.size(), list.size()});
      } else {
         List<Integer> skillIndexList = new ArrayList();

         for(CommonMsg.MapDataII mapDataII : list) {
            boolean isHaveCode = false;

            for(Map.Entry<Integer, PetArrayingData> entry : petDao.arraying.entrySet()) {
               if (((PetArrayingData)entry.getValue()).code == mapDataII.getKey()) {
                  isHaveCode = true;
                  break;
               }
            }

            if (!isHaveCode) {
               return;
            }

            if (mapDataII.getValue() < 1 || mapDataII.getValue() > 4) {
               return;
            }

            if (skillIndexList.contains(mapDataII.getValue())) {
               return;
            }

            skillIndexList.add(mapDataII.getValue());
         }

         for(CommonMsg.MapDataII mapDataII : list) {
            for(Map.Entry<Integer, PetArrayingData> entry : petDao.arraying.entrySet()) {
               if (((PetArrayingData)entry.getValue()).code == mapDataII.getKey()) {
                  ((PetArrayingData)entry.getValue()).skillIndex = mapDataII.getValue();
               }
            }
         }

         petDao.updateOp();
         this.flushAllPetMirrorSkill(petDao);
         PetMsg.S2C_UpdateArrayingInfo_12809.Builder arrayingBuilder = PetMsg.S2C_UpdateArrayingInfo_12809.newBuilder();

         for(Map.Entry<Integer, PetArrayingData> entry : petDao.arraying.entrySet()) {
            arrayingBuilder.addInfos(this.toPetDaoArrayingInfo((PetArrayingData)entry.getValue()));
         }

         this.player.sendMsg(arrayingBuilder.build());
         PetMsg.S2C_PetArrayingSkill_12808.Builder builder = PetMsg.S2C_PetArrayingSkill_12808.newBuilder();
         builder.setResult(38009);
         this.player.sendMsg(builder.build());
      }
   }

   public void buyBagLattice() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      int nextNum = playerExtend.petBagBuyNum + 1;
      HeroBagModel heroBagModel = (HeroBagModel)this.player.getGameModelPool().getEntity("heroBag", nextNum);
      if (heroBagModel == null) {
         logger.error("背包购买次数已经达到最大，玩家={}", this.player.getPlayerId());
      } else {
         ResourceModel needResource = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, heroBagModel.getPetcost());
         if (!this.player.checkResourceNum(needResource)) {
            logger.error("玩家={}，购买神兽背包资源不够，需要={}，次数={}", new Object[]{this.player.getPlayerId(), heroBagModel.getPetcost(), nextNum - 1});
         } else {
            this.player.delResource(needResource, 60, 6006, nextNum, 0, "");
            ++playerExtend.petBagBuyNum;
            playerExtend.petBagNum += heroBagModel.getPetlattice();
            this.player.updatePlayerExtend(13);
            this.player.notifyPlayerData(PlayerDefine.PET_BAG_NUM, playerExtend.petBagNum);
            this.player.notifyPlayerData(PlayerDefine.PET_BAG_BUY_NUM, playerExtend.petBagBuyNum);
            PetMsg.S2C_BuyBagLattice_12804.Builder builder = PetMsg.S2C_BuyBagLattice_12804.newBuilder();
            builder.setResult(1);
            builder.setBagNum(playerExtend.petBagNum);
            builder.setBuyNum(playerExtend.petBagBuyNum);
            this.player.sendMsg(builder.build());
         }
      }
   }

   public void petUpLv(int code) {
      Pet pet = this.getPetByCode(code);
      if (pet != null) {
         int limitLv = 0;
         if (pet.star > 1) {
            PetUpStarModel petUpStarModel = this.getPetUpStarModel(pet.id, pet.star);
            if (petUpStarModel == null) {
               return;
            }

            limitLv = petUpStarModel.getLevelMax();
         } else {
            PetModel petModel = (PetModel)this.player.getGameModelPool().getEntity("pet", pet.id);
            limitLv = petModel.getLevelMax();
         }

         if (pet.lv >= limitLv) {
            logger.error("当前等级上限={},CODE={},模板ID={}", new Object[]{pet.lv, pet.code, limitLv});
         } else {
            UpgradeModel upgradeModel = (UpgradeModel)this.player.getGameModelPool().getEntity("upgrade", pet.lv);
            ResourceModel needResource = new ResourceModel(1, PlayerDefine.PLAYER_PET_EXP, upgradeModel.getPetUpExp());
            if (!this.player.checkResourceNum(needResource)) {
               logger.error("神兽经验不足");
            } else {
               this.player.delResource(needResource, 60, 6003, pet.code, pet.lv, "");
               ++pet.lv;
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               itemBagPart.updateOp();
               this.player.additemUpdateBuilder(pet);
               this.player.senditemUpdateMsg();
               this.flushPet(pet);
               PetMsg.S2C_PetUpLv_12812.Builder builder = PetMsg.S2C_PetUpLv_12812.newBuilder();
               builder.setResult(1);
               builder.setCode(code);
               builder.setLv(pet.lv);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   public void petUpStar(int code) {
      Pet pet = this.getPetByCode(code);
      if (pet != null) {
         PetUpStarModel petUpStarModel = this.getPetUpStarModel(pet.id, pet.star + 1);
         if (petUpStarModel == null) {
            logger.error("已经达到最大星级，star={}", petUpStarModel.getStar());
         } else if (petUpStarModel.getNeedFlyLevel() > pet.breach) {
            logger.error("飞升等级不够，需要飞升={},实际={},模板ID={}", new Object[]{petUpStarModel.getNeedFlyLevel(), pet.breach, petUpStarModel.getId()});
         } else if (this.player.checkResourceNum(petUpStarModel.getNeedItemsFun())) {
            this.player.delResource((List)petUpStarModel.getNeedItemsFun(), 60, 6005, 0, 0, "");
            pet.star = petUpStarModel.getStar();
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            itemBagPart.updateOp();
            this.player.additemUpdateBuilder(pet);
            this.player.senditemUpdateMsg();
            this.flushPet(pet);
            PetMsg.S2C_PetUpStar_12814.Builder builder = PetMsg.S2C_PetUpStar_12814.newBuilder();
            builder.setResult(1);
            builder.setCode(code);
            builder.setStar(pet.star);
            this.player.sendMsg(builder.build());
         }
      }
   }

   public void petUpBreach(int code, List<String> infoList) {
      Pet pet = this.getPetByCode(code);
      if (pet != null) {
         PetFlyModel petFlyModel = this.getPetFlyModel(pet.id, pet.breach + 1);
         if (petFlyModel == null) {
            logger.error("飞升规则错误，ID={},飞升等级={},玩家={}，CODE={}", new Object[]{pet.id, pet.breach, this.player.getPlayerId(), code});
         } else if (pet.lv < petFlyModel.getNeedLevel()) {
            logger.error("飞升等级不足，需要={}，当前={}", petFlyModel.getNeedLevel(), pet.lv);
         } else if (pet.star < petFlyModel.getNeedStar()) {
            logger.error("飞升需要星级不足，需要={}，当前={}", petFlyModel.getNeedStar(), pet.star);
         } else {
            int needFlyLv = petFlyModel.getFlyLevel() - 1;
            if (pet.breach != needFlyLv) {
               logger.info("飞升需要的飞升阶段错误，需要={}，当前={}", needFlyLv, pet.breach);
            } else if (this.player.checkResourceNum(petFlyModel.getNeedItemsFun())) {
               if (petFlyModel.getNeedPetFun().size() != infoList.size()) {
                  logger.error("玩家={}，飞升神兽参数不一致，需要size={},实际size={}", new Object[]{this.player.getPlayerId(), petFlyModel.getNeedPetFun().size(), infoList.size()});
               } else {
                  List<Integer> needDelCodeList = new ArrayList();
                  int key = 1;

                  for(String codesStr : infoList) {
                     String[] codes = codesStr.split("_");
                     NeedItemsFun needItemsFun = (NeedItemsFun)petFlyModel.getNeedPetFun().get(key);
                     int petNum = 0;

                     for(String petCode : codes) {
                        Pet needPet = this.getPetByCode(Integer.parseInt(petCode));
                        if (needPet == null) {
                           return;
                        }

                        if (needPet.isLock) {
                           logger.error("神兽上锁，code={}", needPet.code);
                           return;
                        }

                        if (needItemsFun.getType() != 0) {
                           PetModel petModel = (PetModel)this.player.getGameModelPool().getEntity("pet", needPet.id);
                           if (petModel == null) {
                              logger.error("配置文件pet为空，id={}", needPet.id);
                              return;
                           }

                           if (needItemsFun.getType() > 0 && needItemsFun.getType() < 5) {
                              if (petModel.getType() != needItemsFun.getType()) {
                                 logger.error("所传神兽职业和需求职业不一致，需求={}，神兽={}", needItemsFun.getType(), petModel.getType());
                                 return;
                              }
                           } else if (needItemsFun.getType() == 5 && petModel.getId() != needPet.id) {
                              logger.error("所传神兽职业和需求ID不一致，需求={}，神兽={}", petModel.getId(), needPet.id);
                              return;
                           }
                        }

                        if (needPet.star != needItemsFun.getStar()) {
                           logger.error("所传神兽星级和需求星级不一致，需求={},神兽={}", needItemsFun.getStar(), needPet.star);
                           return;
                        }

                        ++petNum;
                        needDelCodeList.add(needPet.code);
                     }

                     if (petNum != needItemsFun.getNum()) {
                        logger.error("所传圣兽数量和需求不一致,需求={}，神兽={}", needItemsFun.getNum(), petNum);
                        return;
                     }

                     ++key;
                  }

                  ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                  itemBagPart.deleteItemByCodes(needDelCodeList, 60, 6006, code, pet.breach, "");
                  this.player.delResource((List)petFlyModel.getNeedItemsFun(), 60, 6006, code, pet.breach, "");
                  pet.breach = petFlyModel.getFlyLevel();
                  itemBagPart.updateOp();
                  this.player.additemUpdateBuilder(pet);
                  this.player.senditemUpdateMsg();
                  this.openArrayingPosition(pet.breach);
                  this.player.additemUpdateBuilder(pet);
                  this.player.senditemUpdateMsg();
                  this.flushPet(pet);
                  PetMsg.S2C_PetFly_12816.Builder builder = PetMsg.S2C_PetFly_12816.newBuilder();
                  builder.setResult(1);
                  builder.setCode(code);
                  builder.setBreach(pet.breach);
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }

   public void merge(int mainCode, int slaveCode) {
      Pet slavePet = this.getPetByCode(slaveCode);
      if (slavePet != null) {
         if (slavePet.skills.size() < 1) {
            logger.error("玩家={}，融合被吃圣兽技能不足,技能个数={}", slavePet.skills.size());
         } else {
            PetModel slavePetModel = (PetModel)this.player.getGameModelPool().getEntity("pet", slavePet.id);
            if (slavePetModel != null) {
               if (slavePet.isLock) {
                  logger.info("神兽上锁，code={},id={}", slaveCode, slavePet.id);
                  this.player.failure(0);
               } else {
                  PetDao petDao = this.getPetDao();
                  if (this.isArrayingPet(slaveCode, petDao)) {
                     logger.info("神兽已上阵，code={},id={}", slaveCode, slavePet.id);
                     this.player.failure(0);
                  } else {
                     Pet mainPet = this.getPetByCode(mainCode);
                     if (mainPet != null) {
                        PetModel mainPetModel = (PetModel)this.player.getGameModelPool().getEntity("pet", mainPet.id);
                        if (mainPetModel != null) {
                           int petMergeMinLv = this.configManager.getIntDefault("petMergeMinLv", 10);
                           if (mainPet.lv < petMergeMinLv) {
                              logger.error("玩家={}，融合主神兽没有达到等级，需要={}，神兽等级={}", new Object[]{this.player.getPlayerId(), petMergeMinLv, mainPet.lv});
                           } else if (slavePetModel.getType() != mainPetModel.getType()) {
                              logger.error("玩家={}，融合职业类型不对，主={}，副={}", new Object[]{this.player.getPlayerId(), mainPetModel.getType(), slavePetModel.getType()});
                           } else {
                              int slavePetSkillNum = 0;

                              for(Integer skill : slavePet.skills) {
                                 if (skill > 0) {
                                    ++slavePetSkillNum;
                                 }
                              }

                              if (mainPet.skills.size() < slavePetSkillNum) {
                                 logger.error("玩家={}，主神兽技能格子小于从神兽技能数，主格子={}，副技能数={}", new Object[]{this.player.getPlayerId(), mainPet.skills.size(), slavePetSkillNum});
                              } else {
                                 String petFuseNum = this.configManager.getStrByDefault("petFuseNum", "2|10014|1");
                                 String[] petFuseNumArraying = petFuseNum.split("\\|");
                                 if (petFuseNumArraying.length >= 3) {
                                    ResourceModel needResource = new ResourceModel(Integer.valueOf(petFuseNumArraying[0]), Integer.valueOf(petFuseNumArraying[1]), Integer.valueOf(petFuseNumArraying[2]));
                                    if (this.player.checkResourceNum(needResource)) {
                                       PetSkillSlotOpenModel petSkillSlotOpenModel = (PetSkillSlotOpenModel)this.player.getGameModelPool().getEntity("petSkillSlotOpen", slavePetSkillNum);
                                       if (petSkillSlotOpenModel != null) {
                                          ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                                          if (mainPet.skills.size() < 4) {
                                             int _r = RandomUtil.randInt(10000);
                                             if (_r < petSkillSlotOpenModel.getSkillSlotOpenOdd()) {
                                                mainPet.skills.add(0);
                                             }
                                          }

                                          int totalOdds = 0;
                                          Map<Integer, Integer> newSkillMap = new HashMap();

                                          for(Map.Entry<Integer, Integer> entry : petSkillSlotOpenModel.getSkillOdds().entrySet()) {
                                             if ((Integer)entry.getValue() > 0) {
                                                newSkillMap.put(entry.getKey(), entry.getValue());
                                                totalOdds += (Integer)entry.getValue();
                                             }
                                          }

                                          int _r = RandomUtil.randInt(totalOdds);
                                          int skillNum = 0;
                                          int loop = 0;

                                          for(Map.Entry<Integer, Integer> entry : newSkillMap.entrySet()) {
                                             loop += (Integer)entry.getValue();
                                             if (_r < loop) {
                                                skillNum = (Integer)entry.getKey() - 1;
                                                break;
                                             }
                                          }

                                          logger.info("玩家={}，材料技能个数={}，随机传承个数={}", new Object[]{this.player.getPlayerId(), slavePetSkillNum, skillNum});
                                          List<Integer> slaveIndexList = new ArrayList();
                                          List<Integer> mainIndexList = new ArrayList();
                                          if (skillNum > 0) {
                                             List<Integer> slaveEnableIndexList = new ArrayList();

                                             for(int i = 0; i < slavePet.skills.size(); ++i) {
                                                if ((Integer)slavePet.skills.get(i) > 0) {
                                                   slaveEnableIndexList.add(i);
                                                }
                                             }

                                             Collections.shuffle(slaveEnableIndexList);

                                             for(int i = 0; i < skillNum; ++i) {
                                                slaveIndexList.add(slaveEnableIndexList.get(i));
                                             }

                                             int slaveIndex = 0;
                                             List<Integer> mainEnableList = new ArrayList();

                                             for(int i = 0; i < mainPet.skills.size() && mainIndexList.size() < slaveIndexList.size(); ++i) {
                                                if ((Integer)mainPet.skills.get(i) == 0) {
                                                   mainPet.skills.set(i, slavePet.skills.get((Integer)slaveIndexList.get(slaveIndex)));
                                                   mainIndexList.add(i);
                                                   ++slaveIndex;
                                                } else {
                                                   mainEnableList.add(i);
                                                }
                                             }

                                             if (slaveIndexList.size() > mainIndexList.size() && mainEnableList.size() > 0) {
                                                Collections.shuffle(mainEnableList);

                                                for(Integer index : mainEnableList) {
                                                   if (mainIndexList.size() >= slaveIndexList.size()) {
                                                      break;
                                                   }

                                                   mainPet.skills.set(index, slavePet.skills.get((Integer)slaveIndexList.get(slaveIndex)));
                                                   mainIndexList.add(index);
                                                   ++slaveIndex;
                                                }
                                             }

                                             itemBagPart.updateOp();
                                             logger.info("玩家={}，从技能顺序={}，主技能顺序={}", new Object[]{this.player.getPlayerId(), slaveIndexList, mainIndexList});
                                          }

                                          this.player.delResource(needResource, 60, 6004, mainCode, slaveCode, "");
                                          itemBagPart.deleteItemByCode(slaveCode, 1, 60, 6004, mainCode, 0, "");
                                          this.player.additemUpdateBuilder(mainPet);
                                          this.player.senditemUpdateMsg();
                                          this.flushPet(mainPet);
                                          PetMsg.S2C_PetMerge_12818.Builder builder = PetMsg.S2C_PetMerge_12818.newBuilder();
                                          builder.setResult(1);
                                          builder.setMainCode(mainCode);
                                          builder.setSlaveCode(slaveCode);
                                          builder.addAllMainSkillIndex(mainIndexList);
                                          builder.addAllSlaveSkillIndex(slaveIndexList);
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
            }
         }
      }
   }

   public void leanSkill(int petCode, int itemId) {
      Pet pet = this.getPetByCode(petCode);
      if (pet != null) {
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemId);
         if (itemModel != null) {
            PetExSkillModel petExSkillModel = (PetExSkillModel)this.player.getGameModelPool().getEntity("petExSkill", itemModel.getUseFuncId());
            if (petExSkillModel != null) {
               if (pet.skills.contains(petExSkillModel.getSkillId())) {
                  logger.error("玩家={}，学习神兽技能有重复，itemId={}，技能表ID={},重复技能={}", new Object[]{this.player.getPlayerId(), itemId, petExSkillModel.getId(), petExSkillModel.getSkillId()});
               } else if (pet.lv < petExSkillModel.getNeedLevel()) {
                  logger.error("玩家={}，神兽={}，学习技能等级不足，技能ID={}，需要等级={}，现有等级={}", new Object[]{this.player.getPlayerId(), pet.code, itemId, petExSkillModel.getNeedLevel(), pet.lv});
               } else {
                  ResourceModel resourceModel = new ResourceModel(2, itemId, 1);
                  if (this.player.checkResourceNum(resourceModel)) {
                     this.player.delResource(resourceModel, 60, 6012, itemId, 0, "");
                     boolean isHaveAdd = false;

                     for(int i = 0; i < pet.skills.size(); ++i) {
                        if ((Integer)pet.skills.get(i) == 0) {
                           pet.skills.set(i, petExSkillModel.getSkillId());
                           isHaveAdd = true;
                           break;
                        }
                     }

                     if (!isHaveAdd) {
                        int index = RandomUtil.randInt(pet.skills.size());
                        pet.skills.set(index, petExSkillModel.getSkillId());
                     }

                     ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                     itemBagPart.updateOp();
                     this.player.additemUpdateBuilder(pet);
                     this.player.senditemUpdateMsg();
                     this.flushPet(pet);
                     PetMsg.S2C_LeanSkill_12820.Builder builder = PetMsg.S2C_LeanSkill_12820.newBuilder();
                     builder.setResult(1);
                     builder.setCode(petCode);
                     this.player.sendMsg(builder.build());
                  }
               }
            }
         }
      }
   }

   public void transferGrow(int mainCode, int slaveCode) {
      Pet slavePet = this.getPetByCode(slaveCode);
      if (slavePet != null) {
         if (!slavePet.isLock) {
            if (slavePet.skills.size() < 1) {
               logger.error("玩家={}，融合被吃圣兽技能不足,技能个数={}", slavePet.skills.size());
            } else {
               PetDao petDao = this.getPetDao();
               if (this.isArrayingPet(slaveCode, petDao)) {
                  logger.info("神兽已上阵，code={},id={}", slaveCode, slavePet.id);
                  this.player.failure(0);
               } else {
                  Pet mainPet = this.getPetByCode(mainCode);
                  if (mainPet != null) {
                     PetModel mainPetModel = (PetModel)this.player.getGameModelPool().getEntity("pet", mainPet.id);
                     if (mainPetModel != null) {
                        PetModel slavePetModel = (PetModel)this.player.getGameModelPool().getEntity("pet", slavePet.id);
                        if (slavePetModel != null) {
                           if (mainPetModel.getType() != slavePetModel.getType()) {
                              logger.error("不是同类型神兽不能继承！主神兽={}，副神兽={}", mainPetModel.getType(), slavePetModel.getType());
                           } else {
                              String petFuseChange = this.configManager.getStrByDefault("petFuseChange", "2|10013|50");
                              String[] petFuseChangeArraying = petFuseChange.split("\\|");
                              if (petFuseChangeArraying.length >= 3) {
                                 ResourceModel needResource = new ResourceModel(Integer.valueOf(petFuseChangeArraying[0]), Integer.valueOf(petFuseChangeArraying[1]), Integer.valueOf(petFuseChangeArraying[2]));
                                 if (this.player.checkResourceNum(needResource)) {
                                    for(int i = 0; i < slavePet.growUp.size(); ++i) {
                                       mainPet.growUp.set(i, slavePet.growUp.get(i));
                                    }

                                    ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                                    itemBagPart.updateOp();
                                    this.player.delResource(needResource, 60, 6013, mainCode, slaveCode, "");
                                    itemBagPart.deleteItemByCode(slaveCode, 1, 60, 6013, mainCode, 0, "");
                                    this.player.additemUpdateBuilder(mainPet);
                                    this.player.senditemUpdateMsg();
                                    this.flushPet(mainPet);
                                    PetMsg.S2C_TransferGroup_12822.Builder builder = PetMsg.S2C_TransferGroup_12822.newBuilder();
                                    builder.setResult(1);
                                    builder.setMainCode(mainCode);
                                    builder.setSlaveCode(slaveCode);
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
      }
   }

   public void openHatchUi() {
      PetDao petDao = this.getPetDao();
      PetMsg.S2C_HatchUi_12842.Builder builder = PetMsg.S2C_HatchUi_12842.newBuilder();
      builder.setHatchLv(petDao.hatchLv);
      builder.setHatchExp(petDao.hatchExp);
      if (!petDao.hatchSlocts.isEmpty()) {
         for(Map.Entry<Integer, PetHatchData> entry : petDao.hatchSlocts.entrySet()) {
            PetMsg.HatchSoltInfo.Builder info = PetMsg.HatchSoltInfo.newBuilder();
            info.setPosition((Integer)entry.getKey());
            info.setEggId(((PetHatchData)entry.getValue()).eggId);
            info.setNeedTime(((PetHatchData)entry.getValue()).needTime);
            info.setStartTime(((PetHatchData)entry.getValue()).startTime);
            builder.addHatchInfos(info);
         }
      }

      this.player.sendMsg(builder.build());
   }

   public void hatch(int position, int eggId) {
      PetDao petDao = this.getPetDao();
      if (!petDao.hatchSlocts.containsKey(position)) {
         logger.error("玩家={}，槽位未开启，position={}，已开放={}", new Object[]{this.player.getPlayerId(), position, petDao.hatchSlocts.keySet()});
      } else {
         PetHatchData petHatchData = (PetHatchData)petDao.hatchSlocts.get(position);
         if (petHatchData.eggId != 0) {
            logger.error("玩家={}，槽位正在使用，position={}，蛋ID={}", new Object[]{this.player.getPlayerId(), position, petHatchData.eggId});
         } else {
            PetHatchModel petHatchModel = (PetHatchModel)this.player.getGameModelPool().getEntity("petHatch", petDao.hatchLv);
            if (petHatchModel != null) {
               ResourceModel needResource = new ResourceModel(2, eggId, 1);
               if (this.player.checkResourceNum(needResource)) {
                  ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", eggId);
                  if (itemModel != null) {
                     if (itemModel.getSubclass() != 13) {
                        logger.error("玩家={}，孵化物品不是神兽蛋，ID={}，类型={}", new Object[]{this.player.getPlayerId(), eggId, itemModel.getSubclass()});
                     } else {
                        this.player.delResource(needResource, 60, 6001, eggId, 0, "");
                        int needTime = petHatchModel.getTime();
                        if (this.isHaveHatchPrivilege()) {
                           needTime = petHatchModel.getVipTime();
                        }

                        petHatchData.eggId = eggId;
                        petHatchData.needTime = needTime;
                        petHatchData.startTime = (int)(System.currentTimeMillis() / 1000L);
                        petDao.updateOp();
                        PetMsg.S2C_Hatch_12844.Builder builder = PetMsg.S2C_Hatch_12844.newBuilder();
                        builder.setResult(1);
                        builder.setInfo(this.toHatchSoltInfo(position, petHatchData));
                        this.player.sendMsg(builder.build());
                     }
                  }
               }
            }
         }
      }
   }

   public void hatchOpenAllSendClient() {
      PetDao petDao = this.getPetDao();
      List<PetModel> petList = new ArrayList();

      for(Map.Entry<Integer, PetHatchData> entry : petDao.hatchSlocts.entrySet()) {
         PetModel petModel = this.hatchOpen((Integer)entry.getKey());
         if (petModel != null) {
            petList.add(petModel);
         }
      }

      if (!petList.isEmpty()) {
         List<ResourceModel> addList = new ArrayList();
         Set<Integer> dictionarySet = new HashSet();
         int totalExp = 0;

         for(PetModel petModel : petList) {
            ResourceModel resourceModel = new ResourceModel(2, petModel.getId(), 1);
            addList.add(resourceModel);
            dictionarySet.add(petModel.getId());
            totalExp += this.getHatchExp(petModel.getId());
         }

         this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_PET, 60, 6011, 0, 0, "");
         this.addPetDictionary(dictionarySet);
         this.addHatchExp(totalExp);
      }

   }

   public void hatchOpenSendClient(int position) {
      PetModel petModel = this.hatchOpen(position);
      if (petModel != null) {
         this.player.addResource(new ResourceModel(2, petModel.getId(), 1), PlayerMsg.ShowType.SHOW_TYPE_PET, 60, 6009, 0, 0, "");
         this.addPetDictionaryEx(petModel.getId());
         int hatchExp = this.getHatchExp(petModel.getId());
         if (hatchExp > 0) {
            this.addHatchExp(hatchExp);
         }

         PetMsg.S2C_HatchOpen_12848.Builder builder = PetMsg.S2C_HatchOpen_12848.newBuilder();
         builder.setResult(1);
         builder.setInfo(this.toHatchSoltInfo(position, (PetHatchData)this.getPetDao().hatchSlocts.get(position)));
         this.player.sendMsg(builder.build());
      }
   }

   private PetModel hatchOpen(int position) {
      PetDao petDao = this.getPetDao();
      if (!petDao.hatchSlocts.containsKey(position)) {
         logger.error("孵化槽位错误，开奖槽位={}，玩家={}", position, petDao.hatchSlocts.keySet());
         return null;
      } else {
         PetHatchData data = (PetHatchData)petDao.hatchSlocts.get(position);
         if (data == null) {
            logger.info("孵化信息为空，位置={}", position);
            return null;
         } else if (data.eggId == 0) {
            logger.error("槽位未被使用，位置={}", position);
            return null;
         } else {
            int deltTime = DateUtil.getIntTime(System.currentTimeMillis()) - data.startTime;
            if (deltTime < data.needTime) {
               logger.error("孵化未完成，需要时间={}，已经孵化时间={}", data.needTime, deltTime);
               return null;
            } else {
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               if (!itemBagPart.isEnableAddToBag(14, 1)) {
                  logger.info("玩家={}，神兽背包已满", this.player.getPlayerId());
                  this.player.failure(61175);
                  return null;
               } else {
                  int footNum = 1;
                  if (petDao.hatchFoots.containsKey(data.eggId)) {
                     footNum = (Integer)petDao.hatchFoots.get(data.eggId) + 1;
                  }

                  List<PetHatchLibModel> petHatchLibModels = (List)this.player.getGameModelPool().getEntity("customPetHatchLib", data.eggId);
                  int totalOdds = 0;
                  boolean isFoot = false;
                  int petId = 0;
                  int footPetId = 0;

                  for(PetHatchLibModel petHatchLibModel : petHatchLibModels) {
                     if (petHatchLibModel.getFootNum() > 0) {
                        footPetId = petHatchLibModel.getPetId();
                        if (footNum >= petHatchLibModel.getFootNum()) {
                           isFoot = true;
                           petId = petHatchLibModel.getPetId();
                           break;
                        }
                     }

                     totalOdds += petHatchLibModel.getOdds();
                  }

                  if (isFoot) {
                     petDao.hatchFoots.put(data.eggId, 0);
                  } else {
                     petDao.hatchFoots.put(data.eggId, footNum);
                     int r = RandomUtil.randInt(totalOdds);
                     int loop = 0;

                     for(PetHatchLibModel petHatchLibModel : petHatchLibModels) {
                        loop += petHatchLibModel.getOdds();
                        if (loop >= r) {
                           petId = petHatchLibModel.getPetId();
                           break;
                        }
                     }

                     if (footPetId > 0 && petId == footPetId) {
                        petDao.hatchFoots.put(data.eggId, 0);
                     }
                  }

                  PetModel petModel = (PetModel)this.player.getGameModelPool().getEntity("pet", petId);
                  if (petModel == null) {
                     logger.error("玩家={}，孵化随机神兽错误，孵化槽位={}，孵化ID={}", new Object[]{this.player.getPlayerId(), position, petId});
                     return null;
                  } else {
                     data.startTime = 0;
                     data.eggId = 0;
                     data.needTime = 0;
                     petDao.updateOp();
                     return petModel;
                  }
               }
            }
         }
      }
   }

   public void takeHatchReward(int rewardId) {
      PetDao petDao = this.getPetDao();
      if (petDao.takedIds.contains(rewardId)) {
         logger.error("玩家={}，已经领取过奖励，ID={}，领取过的ID={}", new Object[]{this.player.getPlayerId(), rewardId, petDao.takedIds});
      } else if (petDao.hatchLv < rewardId) {
         logger.error("玩家={}，没有达到领取奖励提交，领取ID={}，当前等级={}", new Object[]{this.player.getPlayerId(), rewardId, petDao.hatchLv});
      } else {
         PetHatchModel petHatchModel = (PetHatchModel)this.player.getGameModelPool().getEntity("petHatch", rewardId);
         if (petHatchModel != null) {
            this.player.addResource(petHatchModel.getLevelAward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 60, 6008, rewardId, 0, "");
            petDao.takedIds.add(rewardId);
            petDao.updateOp();
            PetMsg.S2C_TakeHatchReward_12850.Builder builder = PetMsg.S2C_TakeHatchReward_12850.newBuilder();
            builder.setResult(1);
            builder.addAllTakedRewardId(petDao.takedIds);
            this.player.sendMsg(builder.build());
         }
      }
   }

   public void hatchAccelerate(int position) {
      PetDao petDao = this.getPetDao();
      if (!petDao.hatchSlocts.containsKey(position)) {
         logger.error("孵化槽位错误，加速槽位={}，玩家={}", position, petDao.hatchSlocts.keySet());
      } else {
         PetHatchData data = (PetHatchData)petDao.hatchSlocts.get(position);
         if (data == null) {
            logger.info("孵化信息为空，位置={}", position);
         } else if (data.eggId == 0) {
            logger.error("槽位未被使用，位置={}", position);
         } else {
            PetHatchModel petHatchModel = (PetHatchModel)this.player.getGameModelPool().getEntity("petHatch", petDao.hatchLv);
            if (petHatchModel != null) {
               int deltTime = data.needTime - ((int)(System.currentTimeMillis() / 1000L) - data.startTime);
               if (deltTime <= 0) {
                  logger.error("玩家={}，槽位={}，不需要加速，需要时间={}，开始时间={}", new Object[]{this.player.getPlayerId(), position, data.needTime, data.startTime});
               } else {
                  int hours = deltTime / 3600 + 1;
                  int gold = 0;
                  if (this.isHaveHatchPrivilege()) {
                     if (ResourceModel.checkTotalNumError(petHatchModel.getVipCost(), hours)) {
                        return;
                     }

                     gold = petHatchModel.getVipCost() * hours;
                  } else {
                     if (ResourceModel.checkTotalNumError(petHatchModel.getCost(), hours)) {
                        return;
                     }

                     gold = petHatchModel.getCost() * hours;
                  }

                  ResourceModel needResource = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, gold);
                  if (this.player.checkResourceNum(needResource)) {
                     ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                     if (!itemBagPart.isEnableAddToBag(14, 1)) {
                        logger.info("玩家={}，神兽背包已满", this.player.getPlayerId());
                        this.player.failure(61175);
                     } else {
                        this.player.delResource(needResource, 60, 6010, position, 0, "");
                        data.needTime = 0;
                        petDao.updateOp();
                        this.hatchOpenSendClient(position);
                     }
                  }
               }
            }
         }
      }
   }

   public void oneKeyHatchAccelerate() {
      PetDao petDao = this.getPetDao();
      PetHatchModel petHatchModel = (PetHatchModel)this.player.getGameModelPool().getEntity("petHatch", petDao.hatchLv);
      if (petHatchModel != null) {
         int totalGold = 0;
         int totalNum = 0;

         for(Map.Entry<Integer, PetHatchData> entry : petDao.hatchSlocts.entrySet()) {
            if (((PetHatchData)entry.getValue()).eggId > 0) {
               int deltTime = ((PetHatchData)entry.getValue()).needTime - ((int)(System.currentTimeMillis() / 1000L) - ((PetHatchData)entry.getValue()).startTime);
               if (deltTime <= 0) {
                  logger.error("玩家={}，槽位={}，不需要加速，需要时间={}，开始时间={}", new Object[]{this.player.getPlayerId(), entry.getKey(), ((PetHatchData)entry.getValue()).needTime, ((PetHatchData)entry.getValue()).startTime});
               } else {
                  int hours = deltTime / 3600 + 1;
                  if (this.isHaveHatchPrivilege()) {
                     if (ResourceModel.checkTotalNumError(petHatchModel.getCost(), hours)) {
                        return;
                     }

                     totalGold += petHatchModel.getCost() * hours;
                  } else {
                     if (ResourceModel.checkTotalNumError(petHatchModel.getVipCost(), hours)) {
                        return;
                     }

                     totalGold += petHatchModel.getVipCost() * hours;
                  }

                  ++totalNum;
               }
            }
         }

         ResourceModel needResource = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, totalGold);
         if (this.player.checkResourceNum(needResource)) {
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            if (!itemBagPart.isEnableAddToBag(14, totalNum)) {
               logger.info("玩家={}，神兽背包已满", this.player.getPlayerId());
               this.player.failure(61175);
            } else {
               this.player.delResource(needResource, 60, 6011, 0, 0, "");

               for(Map.Entry<Integer, PetHatchData> entry : petDao.hatchSlocts.entrySet()) {
                  if (((PetHatchData)entry.getValue()).eggId > 0) {
                     ((PetHatchData)entry.getValue()).needTime = 0;
                     petDao.updateOp();
                  }
               }

               this.hatchOpenAllSendClient();
               PetMsg.S2C_OneKeyHatchAccelerate_12854.Builder builder = PetMsg.S2C_OneKeyHatchAccelerate_12854.newBuilder();
               builder.setResult(1);

               for(Map.Entry<Integer, PetHatchData> entry : petDao.hatchSlocts.entrySet()) {
                  builder.addInfos(this.toHatchSoltInfo((Integer)entry.getKey(), (PetHatchData)entry.getValue()));
               }

               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   public void decompose(List<Integer> codeList) {
      List<Pet> petList = new ArrayList();
      PetDao petDao = this.getPetDao();

      for(Integer code : codeList) {
         Pet pet = this.getPetByCode(code);
         if (pet == null) {
            logger.info("神兽CODE为空，code={}", code);
            this.player.failure(0);
            return;
         }

         if (pet.isLock) {
            logger.info("神兽上锁，code={},id={}", code, pet.id);
            this.player.failure(0);
            return;
         }

         if (this.isArrayingPet(code, petDao)) {
            logger.info("神兽已上阵，code={},id={}", code, pet.id);
            this.player.failure(0);
            return;
         }

         petList.add(pet);
      }

      List<ResourceModel> needAddList = new ArrayList();

      for(Pet pet : petList) {
         PetModel petModel = (PetModel)this.player.getGameModelPool().getEntity("pet", pet.id);
         if (petModel == null) {
            return;
         }

         for(ResourceModel resourceModel : petModel.getResolveItem()) {
            ResourceModel.addResourceToList(needAddList, resourceModel);
         }

         if (pet.lv > 1) {
            UpgradeModel upgradeModel = null;

            for(int i = 1; i < pet.lv; ++i) {
               upgradeModel = (UpgradeModel)this.player.getGameModelPool().getEntity("upgrade", i);
               if (upgradeModel != null) {
                  ResourceModel.addResourceToList(needAddList, new ResourceModel(1, PlayerDefine.PLAYER_PET_EXP, upgradeModel.getPetUpExp()));
               }
            }
         }

         if (pet.star > 1) {
            PetUpStarModel petUpStarModel = (PetUpStarModel)this.player.getGameModelPool().getEntity("petUpStar", petModel.getPetUpStarId());
            if (petUpStarModel == null) {
               return;
            }

            for(ResourceModel resourceModel : petUpStarModel.getRetrieve()) {
               ResourceModel.addResourceToList(needAddList, resourceModel);
            }

            while(pet.star > petUpStarModel.getStar()) {
               int upStarId = petUpStarModel.getNextId();
               PetUpStarModel tempModel = (PetUpStarModel)this.player.getGameModelPool().getEntity("petUpStar", upStarId);
               if (tempModel == null) {
                  break;
               }

               for(ResourceModel resourceModel : petUpStarModel.getRetrieve()) {
                  ResourceModel.addResourceToList(needAddList, resourceModel);
               }

               petUpStarModel = tempModel;
            }
         }

         if (pet.breach > 0) {
            PetFlyModel petFlyModel = (PetFlyModel)this.player.getGameModelPool().getEntity("petFly", petModel.getPetFlyid());
            if (petFlyModel == null) {
               return;
            }

            for(ResourceModel resourceModel : petFlyModel.getRetrieve()) {
               ResourceModel.addResourceToList(needAddList, resourceModel);
            }

            while(pet.breach > petFlyModel.getFlyLevel()) {
               int upFlyId = petFlyModel.getNextId();
               PetFlyModel tempModel = (PetFlyModel)this.player.getGameModelPool().getEntity("petFly", upFlyId);
               if (tempModel == null) {
                  break;
               }

               for(ResourceModel resourceModel : petFlyModel.getRetrieve()) {
                  ResourceModel.addResourceToList(needAddList, resourceModel);
               }

               petFlyModel = tempModel;
            }
         }
      }

      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      itemBagPart.deleteItemByCodes(codeList, 60, 6014, 0, 0, "");
      this.player.addResource(needAddList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 60, 6014, 0, 0, "");
      PetMsg.S2C_PetDecompose_12862.Builder builder = PetMsg.S2C_PetDecompose_12862.newBuilder();
      builder.setResult(38009);
      builder.addAllCodes(codeList);
      this.player.sendMsg(builder.build());
   }

   public void takeDictionaryReward(List<Integer> petIdList) {
      PetDao petDao = this.getPetDao();
      List<ResourceModel> addList = new ArrayList();

      for(Integer petId : petIdList) {
         if (!petDao.dictionaryMap.containsKey(petId)) {
            logger.error("玩家={}，图鉴未解锁，ID={}", this.player.getPlayerId(), petId);
            return;
         }

         if ((Integer)petDao.dictionaryMap.get(petId) > 0) {
            logger.info("玩家={}，图鉴奖励已经领取，ID={}", this.player.getPlayerId(), petId);
            return;
         }

         PetDictionaryModel petDictionaryMode = (PetDictionaryModel)this.player.getGameModelPool().getEntity("petDictionary", petId);
         if (petDictionaryMode == null) {
            return;
         }

         for(ResourceModel reward : petDictionaryMode.getRewards()) {
            addList.add(new ResourceModel(reward.getType(), reward.getId(), reward.getValue()));
         }
      }

      for(Integer petId : petIdList) {
         petDao.dictionaryMap.put(petId, 1);
      }

      petDao.updateOp();
      this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 60, 6014, 0, 0, "");
      PetMsg.S2C_TakeDictionaryReward_12872.Builder builder = PetMsg.S2C_TakeDictionaryReward_12872.newBuilder();
      builder.setResult(1);

      for(Integer petId : petIdList) {
         CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
         info.setKey(petId);
         info.setValue((Integer)petDao.dictionaryMap.get(petId));
         builder.addInfo(info);
      }

      this.player.sendMsg(builder.build());
   }

   public void petLock(int code, int type) {
      Pet pet = this.getPetByCode(code);
      if (pet != null) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         if (type == 1) {
            if (pet.isLock) {
               return;
            }

            pet.isLock = true;
            itemBagPart.updateOp();
         } else {
            if (!pet.isLock) {
               return;
            }

            pet.isLock = false;
            itemBagPart.updateOp();
         }

         this.player.additemUpdateBuilder(pet);
         this.player.senditemUpdateMsg();
         PetMsg.S2C_PetLock_12876.Builder builder = PetMsg.S2C_PetLock_12876.newBuilder();
         builder.setResult(38009);
         builder.setCode(code);
         builder.setType(type);
         this.player.sendMsg(builder.build());
      }
   }

   public PetDao getPetDao() {
      return (PetDao)this.player.getData("tb_pet", this.player.getPlayerId());
   }

   public Pet getPetByCode(int code) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      ItemBase itemBase = itemBagPart.getItemByCode(code);
      if (itemBase == null) {
         return null;
      } else if (!(itemBase instanceof Pet)) {
         logger.error("玩家={}，不是神兽，CODE={}，", this.player.getPlayerId(), code);
         return null;
      } else {
         return (Pet)itemBase;
      }
   }

   private boolean isHaveHatchPrivilege() {
      return this.player.getPlayerDao().privilege_pet > 0;
   }

   @TaskMethod
   public void addPetDictionaryEx(int petId) {
      Set<Integer> set = new HashSet();
      set.add(petId);
      this.addPetDictionary(set);
   }

   public void addPetDictionary(Set<Integer> dictionarySet) {
      logger.info("开出的神兽={}", dictionarySet);
      PetDao petDao = this.getPetDao();
      Set<Integer> newId = new HashSet();

      for(Integer petId : dictionarySet) {
         if (!petDao.dictionaryMap.containsKey(petId)) {
            petDao.dictionaryMap.put(petId, 0);
            newId.add(petId);
         }
      }

      if (!newId.isEmpty()) {
         PetMsg.S2C_UpdateDictionary_12874.Builder builder = PetMsg.S2C_UpdateDictionary_12874.newBuilder();

         for(Integer petId : newId) {
            CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
            info.setKey(petId);
            info.setValue(0);
            builder.addInfo(info);
         }

         this.player.sendMsg(builder.build());
      }

   }

   public PetMsg.PetDaoArrayingInfo.Builder toPetDaoArrayingInfo(PetArrayingData data) {
      PetMsg.PetDaoArrayingInfo.Builder builder = PetMsg.PetDaoArrayingInfo.newBuilder();
      builder.setCode(data.code);
      builder.setIndex(data.index);
      builder.setSkillIndex(data.skillIndex);
      return builder;
   }

   public PetMsg.HatchSoltInfo.Builder toHatchSoltInfo(int position, PetHatchData petHatchData) {
      PetMsg.HatchSoltInfo.Builder builder = PetMsg.HatchSoltInfo.newBuilder();
      builder.setEggId(petHatchData.eggId);
      builder.setPosition(position);
      builder.setStartTime(petHatchData.startTime);
      builder.setNeedTime(petHatchData.needTime);
      return builder;
   }

   public void addHatchExp(int addExp) {
      PetDao petDao = this.getPetDao();
      PetHatchModel nextPetHatchModel = (PetHatchModel)this.player.getGameModelPool().getEntity("petHatch", petDao.hatchLv + 1);
      if (nextPetHatchModel == null) {
         logger.info("玩家={}，孵化等级已经达到最大={}", this.player.getPlayerId(), petDao.hatchLv);
      } else {
         petDao.hatchExp += addExp;
         int oldLv = petDao.hatchLv;

         while(this.lvUp(petDao) != 0) {
         }

         PetMsg.S2C_HatchLvUp_12846.Builder builder = PetMsg.S2C_HatchLvUp_12846.newBuilder();
         builder.setLv(petDao.hatchLv);
         builder.setExp(petDao.hatchExp);
         this.player.sendMsg(builder.build());
      }
   }

   private int lvUp(PetDao petDao) {
      PetHatchModel petHatchModel = (PetHatchModel)this.player.getGameModelPool().getEntity("petHatch", petDao.hatchLv);
      if (petHatchModel == null) {
         return 0;
      } else {
         PetHatchModel nextPetHatchModel = (PetHatchModel)this.player.getGameModelPool().getEntity("petHatch", petDao.hatchLv + 1);
         if (nextPetHatchModel == null) {
            return 0;
         } else if (petDao.hatchExp < petHatchModel.getExp()) {
            return 0;
         } else {
            petDao.hatchExp -= petHatchModel.getExp();
            ++petDao.hatchLv;
            if (!petDao.hatchSlocts.containsKey(nextPetHatchModel.getSlot())) {
               petDao.hatchSlocts.put(nextPetHatchModel.getSlot(), new PetHatchData());
            }

            petDao.updateOp();
            return 1;
         }
      }
   }

   public int getHatchExp(int petId) {
      int exp = 0;
      PetModel petModel = (PetModel)this.player.getGameModelPool().getEntity("pet", petId);
      if (petModel != null) {
         switch (petModel.getQuality()) {
            case 3:
               exp = this.configManager.getIntDefault("petHatchExp1", 1);
               break;
            case 4:
               exp = this.configManager.getIntDefault("petHatchExp2", 2);
               break;
            case 5:
               exp = this.configManager.getIntDefault("petHatchExp3", 3);
         }
      }

      return exp;
   }

   public PetUpStarModel getPetUpStarModel(int petId, int star) {
      if (star == 1) {
         return null;
      } else {
         PetModel petModel = (PetModel)this.player.getGameModelPool().getEntity("pet", petId);
         if (petModel == null) {
            return null;
         } else {
            PetUpStarModel petUpStarModel = (PetUpStarModel)this.player.getGameModelPool().getEntity("petUpStar", petModel.getPetUpStarId());
            if (petUpStarModel == null) {
               return null;
            } else {
               while(star > petUpStarModel.getStar()) {
                  int upStarId = petUpStarModel.getNextId();
                  PetUpStarModel tempModel = (PetUpStarModel)this.player.getGameModelPool().getEntity("petUpStar", upStarId);
                  if (tempModel == null) {
                     break;
                  }

                  petUpStarModel = tempModel;
               }

               return petUpStarModel;
            }
         }
      }
   }

   public PetFlyModel getPetFlyModel(int petId, int breach) {
      if (breach <= 0) {
         return null;
      } else {
         PetModel petModel = (PetModel)this.player.getGameModelPool().getEntity("pet", petId);
         if (petModel == null) {
            return null;
         } else {
            PetFlyModel petFlyModel = (PetFlyModel)this.player.getGameModelPool().getEntity("petFly", petModel.getPetFlyid());
            if (petFlyModel == null) {
               return null;
            } else {
               while(breach > petFlyModel.getFlyLevel()) {
                  int upFlyId = petFlyModel.getNextId();
                  PetFlyModel tempModel = (PetFlyModel)this.player.getGameModelPool().getEntity("petFly", upFlyId);
                  if (tempModel == null) {
                     break;
                  }

                  petFlyModel = tempModel;
               }

               return petFlyModel;
            }
         }
      }
   }

   public void openArrayingPosition(int star) {
      PetDao petDao = this.getPetDao();
      if (petDao.arraying.size() < 3) {
         boolean isHaveChange = false;
         if (petDao.arraying.size() == 1) {
            int VicePetNeedFlyLevel1 = this.configManager.getIntDefault("VicePetNeedFlyLevel1", 1);
            if (star >= VicePetNeedFlyLevel1) {
               petDao.arraying.put(2, new PetArrayingData());
               petDao.updateOp();
               isHaveChange = true;
            }
         }

         if (petDao.arraying.size() == 2) {
            int VicePetNeedFlyLevel2 = this.configManager.getIntDefault("VicePetNeedFlyLevel2", 3);
            if (star >= VicePetNeedFlyLevel2) {
               petDao.arraying.put(3, new PetArrayingData());
               petDao.updateOp();
               isHaveChange = true;
            }
         }

         if (isHaveChange) {
            PetMsg.S2C_UpdateArrayingInfo_12809.Builder builder = PetMsg.S2C_UpdateArrayingInfo_12809.newBuilder();

            for(Map.Entry<Integer, PetArrayingData> entry : petDao.arraying.entrySet()) {
               builder.addInfos(this.toPetDaoArrayingInfo((PetArrayingData)entry.getValue()));
            }

            this.player.sendMsg(builder.build());
         }

      }
   }

   public PetArrayingData getPetArrayingData(int code, PetDao petDao) {
      if (petDao.arraying.isEmpty()) {
         return null;
      } else if (code <= 0) {
         return null;
      } else {
         for(Map.Entry<Integer, PetArrayingData> entry : petDao.arraying.entrySet()) {
            if (((PetArrayingData)entry.getValue()).code == code) {
               return (PetArrayingData)entry.getValue();
            }
         }

         return null;
      }
   }

   public boolean isArrayingPet(int code, PetDao petDao) {
      if (petDao.arraying.isEmpty()) {
         return false;
      } else if (code <= 0) {
         return false;
      } else {
         for(Map.Entry<Integer, PetArrayingData> entry : petDao.arraying.entrySet()) {
            if (((PetArrayingData)entry.getValue()).code == code) {
               return true;
            }
         }

         return false;
      }
   }

   public List<Integer> getPetIdAndSkillId(int code) {
      Pet pet = this.getPetByCode(code);
      if (pet == null) {
         return null;
      } else {
         List<Integer> result = new ArrayList();
         result.add(pet.id);
         PetModel petModel = (PetModel)this.player.getGameModelPool().getEntity("pet", pet.id);
         if (petModel != null) {
            return null;
         } else {
            int skillId = petModel.getActiveSkillId();
            if (pet.star > 1) {
               PetUpStarModel petUpStarModel = this.getPetUpStarModel(pet.id, pet.star);
               if (petUpStarModel != null) {
                  skillId = petUpStarModel.getProportion();
               }
            }

            result.add(skillId);
            return result;
         }
      }
   }

   public void getPetAddHeroPerperty() {
      if (this.petMirrorMap.isEmpty()) {
         if (!this.isHavePetArraying()) {
            return;
         }

         this.flushPetArraying();
      } else {
         PetDao petDao = this.getPetDao();
         this.calAddHeroPropertyAndFlush(petDao);
      }

   }

   public void flushPet(Pet pet) {
      PetDao petDao = this.getPetDao();
      PetArrayingData arrayingData = this.getPetArrayingData(pet.code, petDao);
      if (arrayingData != null) {
         this.calPetProperty(arrayingData);
         this.calMainPetProperty();
         this.calAddHeroPropertyAndFlush(petDao);
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_PET);
      }

   }

   public void flushPetArrayingAndHeroDao() {
      this.flushPetArraying();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_PET);
   }

   public void flushAllPetMirrorSkill(PetDao petDao) {
      if (this.petMirrorMap.isEmpty()) {
         this.flushPetArraying();
      } else {
         for(Map.Entry<Integer, PetArrayingData> entry : petDao.arraying.entrySet()) {
            if (this.petMirrorMap.containsKey(entry.getKey())) {
               ((PetMirror)this.petMirrorMap.get(entry.getKey())).skillIndex = ((PetArrayingData)entry.getValue()).skillIndex;
            }
         }
      }

   }

   private void flushPetArraying() {
      this.petMirrorMap.clear();
      PetDao petDao = this.getPetDao();

      for(Map.Entry<Integer, PetArrayingData> entry : petDao.arraying.entrySet()) {
         if (((PetArrayingData)entry.getValue()).code > 0) {
            this.calPetProperty((PetArrayingData)entry.getValue());
         }
      }

      this.calMainPetProperty();
      this.calAddHeroPropertyAndFlush(petDao);
   }

   public void calPetProperty(PetArrayingData arrayingData) {
      Pet pet = this.getPetByCode(arrayingData.code);
      if (pet != null) {
         PetModel petModel = (PetModel)this.player.getGameModelPool().getEntity("pet", pet.id);
         if (petModel != null) {
            boolean isMainPet = false;
            if (arrayingData.index == 1) {
               isMainPet = true;
            }

            int baseHp = petModel.getBaseHp();
            int baseAtk = petModel.getBaseAtk();
            long totalHpGrow = (long)(Integer)pet.growUp.get(0);
            long totalAtkGrow = (long)(Integer)pet.growUp.get(1);
            int hpAward = 0;
            int atkAward = 0;
            int exclusiveSkillId = petModel.getExclusiveSkillId();
            int activeSkillId = petModel.getActiveSkillId();
            List<Integer> flySkills = new ArrayList();
            PetUpStarModel petUpStarModel = null;
            if (pet.star > 1) {
               petUpStarModel = (PetUpStarModel)this.player.getGameModelPool().getEntity("petUpStar", petModel.getPetUpStarId());
               if (petUpStarModel != null) {
                  hpAward += petUpStarModel.getHpAward();
                  atkAward += petUpStarModel.getAtkAward();
                  if (exclusiveSkillId > 0) {
                     exclusiveSkillId = petUpStarModel.getSkillId();
                  }

                  if (activeSkillId > 0) {
                     activeSkillId = petUpStarModel.getProportion();
                  }

                  while(pet.star > petUpStarModel.getStar()) {
                     int upStarId = petUpStarModel.getNextId();
                     PetUpStarModel tempModel = (PetUpStarModel)this.player.getGameModelPool().getEntity("petUpStar", upStarId);
                     if (tempModel == null) {
                        break;
                     }

                     petUpStarModel = tempModel;
                     hpAward += tempModel.getHpAward();
                     atkAward += tempModel.getAtkAward();
                     if (exclusiveSkillId > 0) {
                        exclusiveSkillId = tempModel.getSkillId();
                     }

                     if (activeSkillId > 0) {
                        activeSkillId = tempModel.getProportion();
                     }
                  }
               }
            }

            PetFlyModel petFlyModel = null;
            if (pet.breach > 0) {
               petFlyModel = (PetFlyModel)this.player.getGameModelPool().getEntity("petFly", petModel.getPetFlyid());
               if (petFlyModel != null) {
                  hpAward += petFlyModel.getHpFlyAward();
                  atkAward += petFlyModel.getAtkFlyAward();
                  totalHpGrow += (long)petFlyModel.getHpGrowUp();
                  totalAtkGrow += (long)petFlyModel.getAtkGrowUp();
                  if (isMainPet) {
                     flySkills.add(petFlyModel.getExclusiveBuffId());
                     flySkills.add(petFlyModel.getActiveBuffId());
                  }

                  while(pet.breach > petFlyModel.getFlyLevel()) {
                     int upFlyId = petFlyModel.getNextId();
                     PetFlyModel tempModel = (PetFlyModel)this.player.getGameModelPool().getEntity("petFly", upFlyId);
                     if (tempModel == null) {
                        break;
                     }

                     petFlyModel = tempModel;
                     hpAward += tempModel.getHpFlyAward();
                     atkAward += tempModel.getAtkFlyAward();
                     totalHpGrow += (long)tempModel.getHpGrowUp();
                     totalAtkGrow += (long)tempModel.getAtkGrowUp();
                     if (isMainPet) {
                        flySkills.add(tempModel.getExclusiveBuffId());
                        flySkills.add(tempModel.getActiveBuffId());
                     }
                  }
               }
            }

            long growHp = totalHpGrow * (long)petModel.getHpGrowUpAdd() * (long)pet.lv;
            long growAtk = totalAtkGrow * (long)petModel.getAtkGrowUpAdd() * (long)pet.lv;
            List<PropertyModel> petPropertyList = null;
            long skill_hp_val = 0L;
            long skill_hp_per = 0L;
            long skill_atk_val = 0L;
            long skill_atk_per = 0L;
            if (!pet.skills.isEmpty()) {
               List<Integer> effectList = HeroDao.getEffectsOfAddProperty(pet.skills);

               for(PropertyModel propertyModel : HeroDao.getPropertyOfSkillEffect(effectList, 0)) {
                  if (propertyModel.getType() == 1) {
                     if (propertyModel.getWay() == 0) {
                        skill_hp_val += propertyModel.getValue();
                     } else {
                        skill_hp_per += propertyModel.getValue();
                     }
                  } else if (propertyModel.getType() == 2) {
                     if (propertyModel.getWay() == 0) {
                        skill_atk_val += propertyModel.getValue();
                     } else {
                        skill_atk_per += propertyModel.getValue();
                     }
                  } else {
                     logger.error("神兽的被动技能有特殊加成，type={}，way={}，val={}", new Object[]{propertyModel.getType(), propertyModel.getWay(), propertyModel.getValue()});
                  }
               }
            }

            int petHp = baseHp + hpAward + (int)(growHp / 10000L);
            int petAtk = baseAtk + atkAward + (int)(growAtk / 10000L);
            petHp = (int)((float)petHp * (1.0F + (float)skill_hp_per / 10000.0F) + (float)skill_hp_val);
            petAtk = (int)((float)petAtk * (1.0F + (float)skill_atk_per / 10000.0F) + (float)skill_atk_val);
            PetMirror petMirror = new PetMirror();
            petMirror.index = arrayingData.index;
            petMirror.code = pet.code;
            petMirror.id = pet.id;
            petMirror.lv = pet.lv;
            petMirror.star = pet.star;
            petMirror.breach = pet.breach;
            petMirror.skillId = activeSkillId;
            petMirror.skillIndex = arrayingData.skillIndex;
            petMirror.exclusiveId = exclusiveSkillId;
            petMirror.skills.addAll(pet.skills);
            petMirror.flySkills = flySkills;
            petMirror.property.put(1, petHp);
            petMirror.property.put(2, petAtk);
            petMirror.growUp.addAll(pet.growUp);
            this.petMirrorMap.put(arrayingData.index, petMirror);
         }
      }
   }

   public void calMainPetProperty() {
      if (!this.petMirrorMap.isEmpty()) {
         boolean isHaveSlavePet = false;

         for(Map.Entry<Integer, PetMirror> entry : this.petMirrorMap.entrySet()) {
            if (((PetMirror)entry.getValue()).index > 1) {
               isHaveSlavePet = true;
            }
         }

         if (!isHaveSlavePet) {
            logger.info("没有副战神兽，不用从新计算");
         } else {
            int totalHp = (Integer)((PetMirror)this.petMirrorMap.get(1)).property.get(1);
            int totalAtk = (Integer)((PetMirror)this.petMirrorMap.get(1)).property.get(2);
            logger.info("主战神兽原始值，hp={}，att={}", totalHp, totalAtk);

            for(Map.Entry<Integer, PetMirror> entry : this.petMirrorMap.entrySet()) {
               if ((Integer)entry.getKey() > 1) {
                  totalHp = (int)((float)totalHp + (float)(Integer)((PetMirror)entry.getValue()).property.get(1) * 0.5F);
                  totalAtk = (int)((float)totalAtk + (float)(Integer)((PetMirror)entry.getValue()).property.get(2) * 0.5F);
               }
            }

            logger.info("主战神兽加成后的值，hp={}，att={}", totalHp, totalAtk);
            ((PetMirror)this.petMirrorMap.get(1)).property.put(1, totalHp);
            ((PetMirror)this.petMirrorMap.get(1)).property.put(2, totalAtk);
         }
      }
   }

   public void calAddHeroPropertyAndFlush(PetDao petDao) {
      List<PropertyModel> list = new ArrayList();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      if (!petDao.arraying.isEmpty() && petDao.arraying.containsKey(1) && ((PetArrayingData)petDao.arraying.get(1)).code > 0) {
         PetMirror petMirror = (PetMirror)this.petMirrorMap.get(1);
         if (petMirror != null && petMirror.property != null) {
            for(Map.Entry<Integer, Integer> entry : petMirror.property.entrySet()) {
               list.add(new PropertyModel((Integer)entry.getKey(), 0, (long)(Integer)entry.getValue()));
            }

            heroBagPart.setProperty_pet(list);
            logger.info("玩家={}，神兽技能={}，神兽战力={}，神兽总属性，hp={}，atk={}", new Object[]{this.player.getPlayerId(), petMirror.flySkills, 0, petMirror.property.get(1), petMirror.property.get(2)});
         } else {
            heroBagPart.setProperty_pet(list);
         }
      } else {
         logger.error("玩家={}，布阵为空或者没有主站神兽", this.player.getPlayerId());
         heroBagPart.setProperty_pet(list);
      }
   }

   public boolean isHavePetArraying() {
      PetDao petDao = this.getPetDao();
      if (petDao.arraying.isEmpty()) {
         return false;
      } else {
         for(Map.Entry<Integer, PetArrayingData> entry : petDao.arraying.entrySet()) {
            if (((PetArrayingData)entry.getValue()).code > 0) {
               return true;
            }
         }

         return false;
      }
   }

   public void levelUp(int preLv, int newLv) {
      SystemFunctionModel systemFunctionModel = (SystemFunctionModel)this.player.getGameModelPool().getEntity("systemFunction", 2501);
      if (systemFunctionModel != null) {
         int lv = systemFunctionModel.getOpenLevel();
         if (preLv < lv && newLv >= lv) {
            int holyBeastDefault = this.configManager.getIntDefault("holyBeastDefault", 90018);
            this.player.addResource(2, holyBeastDefault, 1, PlayerMsg.ShowType.SHOW_TYPE_PET, 60, 6015, 0, 0, "");
            this.opPetUi();
         }

      }
   }

   public void gmTest(String orderStr) {
      String[] orders = orderStr.split(",");
      if (orders.length < 1) {
         logger.info("GM命令参数错误，oder={}", orderStr);
      } else {
         String cmd = orders[0];
         cmd = cmd.toLowerCase();
         PetDao petDao = this.getPetDao();
         switch (cmd) {
            case "hatchexp":
               int exp = Integer.parseInt(orders[1]);
               this.addHatchExp(exp);
               break;
            case "checkslot":
               PetHatchModel petHatchModel = (PetHatchModel)this.player.getGameModelPool().getEntity("petHatch", petDao.hatchLv);
               if (petHatchModel != null) {
                  for(int i = 1; i <= petHatchModel.getSlot(); ++i) {
                     if (!petDao.hatchSlocts.containsKey(i)) {
                        petDao.hatchSlocts.put(i, new PetHatchData());
                        petDao.updateOp();
                     }
                  }
               }
               break;
            case "openarraying":
               int index = Integer.parseInt(orders[1]);
               if (index == 2) {
                  this.openArrayingPosition(2);
               } else if (index == 3) {
                  this.openArrayingPosition(3);
               }
               break;
            case "add":
               if (orders.length < 6) {
                  logger.error("GM命令错误={}", orders);
                  return;
               }

               int petId = Integer.parseInt(orders[1]);
               int lv = Integer.parseInt(orders[2]);
               int star = Integer.parseInt(orders[3]);
               int breach = Integer.parseInt(orders[4]);
               int num = Integer.parseInt(orders[5]);
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               if (!itemBagPart.isEnableAddToBag(14, num)) {
                  logger.info("玩家={}，神兽背包已满", this.player.getPlayerId());
                  this.player.failure(61175);
                  return;
               }

               ItemModel petItemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", petId);
               if (petItemModel == null) {
                  this.player.failure(0);
                  return;
               }

               PetModel petModel = (PetModel)this.player.getGameModelPool().getEntity("pet", petId);
               if (petModel == null) {
                  this.player.failure(0);
                  return;
               }

               if (lv <= 0) {
                  this.player.failure(0);
                  return;
               }

               if (star <= 0) {
                  this.player.failure(0);
                  return;
               }

               if (breach < 0) {
                  this.player.failure(0);
                  return;
               }

               if (num <= 0) {
                  this.player.failure(0);
                  return;
               }

               PetUpStarModel petUpStarModel_add = this.getPetUpStarModel(petId, star);
               if (petUpStarModel_add == null) {
                  breach = 0;
                  if (lv > petModel.getLevelMax()) {
                     lv = petModel.getLevelMax();
                  }
               } else if (lv > petUpStarModel_add.getLevelMax()) {
                  lv = petUpStarModel_add.getLevelMax();
               }

               PetFlyModel petFlyModel = (PetFlyModel)this.player.getGameModelPool().getEntity("petFly", breach);
               if (petFlyModel != null) {
                  if (petFlyModel.getNeedStar() > star) {
                     logger.error("不符合神兽基本法，需要星级={}，实际星级={}", petFlyModel.getNeedStar(), star);
                     this.player.failure(0);
                     return;
                  }

                  if (petFlyModel.getNeedLevel() > lv) {
                     logger.error("不符合神兽基本法，需要等级={}，实际等级={}", petFlyModel.getNeedLevel(), lv);
                     this.player.failure(0);
                     return;
                  }
               }

               int code = this.player.getUniqueCode(CodeDefine.PET_CODE);

               for(int i = 0; i < num; ++i) {
                  Pet pet = new Pet();
                  pet.init(code, 1, petItemModel, this.player);
                  pet.lv = lv;
                  pet.star = star;
                  pet.breach = breach;
                  ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
                  itemBagDao.additem(pet, 14);
                  itemBagDao.updateOp();
                  this.player.additemUpdateBuilder(pet);
                  this.player.addResourceMsg(pet);
               }

               this.addPetDictionaryEx(petId);
               this.player.senditemUpdateMsg();
               this.player.sendResourceMsg(PlayerMsg.ShowType.SHOW_TYPE_PET);
               break;
            case "help":
               Map<Integer, PetModel> petModelMap = this.player.getGameModelPool().getMap("pet");
               List<ResourceModel> addList = new ArrayList();
               if (petModelMap != null) {
                  for(Map.Entry<Integer, PetModel> entry : petModelMap.entrySet()) {
                     addList.add(new ResourceModel(2, ((PetModel)entry.getValue()).getId(), 1));
                  }
               }

               for(int i = 10001; i <= 10015; ++i) {
                  addList.add(new ResourceModel(2, i, 9999));
               }

               this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 49, 452, 0, 0, "");
         }

      }
   }
}
