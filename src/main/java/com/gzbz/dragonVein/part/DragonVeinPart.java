package com.gzbz.dragonVein.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.DragonVeinDao;
import com.gzbz.db.bean.DragonSoulData;
import com.gzbz.db.bean.HeroTypeAttrData;
import com.gzbz.dragonVein.DragonVeinDefine;
import com.gzbz.gameDefine.CodeDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.DragonVeinDecomposeModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.DragonVeinMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class DragonVeinPart extends PlayerPart {
   private static Logger logger = LoggerFactory.getLogger(DragonVeinPart.class);

   public DragonVeinDao getDao() {
      return (DragonVeinDao)this.player.getData("tb_dragon_vein", this.player.getPlayerId());
   }

   public int getLogModule() {
      return 163;
   }

   @MsgHandlerAnno
   public void C2S_DragonVeinInfo_29101(DragonVeinMsg.C2S_DragonVeinInfo_29101 msg, String source) {
      this.sendDragonVeinInfo();
   }

   public void sendDragonVeinInfo() {
      DragonVeinDao dao = this.getDao();
      DragonVeinMsg.S2C_DragonVeinInfo_29102.Builder builder = DragonVeinMsg.S2C_DragonVeinInfo_29102.newBuilder();

      for(Map.Entry<Integer, DragonSoulData> entry : dao.posSoul.entrySet()) {
         DragonSoulData dragonSoulData = (DragonSoulData)entry.getValue();
         builder.addPresentSoulData(dragonSoulData.toBuilder());
      }

      for(Map.Entry<Integer, DragonSoulData> entry : dao.bagSoul.entrySet()) {
         DragonSoulData dragonSoulData = (DragonSoulData)entry.getValue();
         builder.addSurplusSoulData(dragonSoulData.toBuilder());
      }

      builder.setDragonVeinLv(dao.dragonVeinLv);
      builder.setDragonVeinExp(dao.getDragonVeinExp());
      builder.setDragonSoulVal(dao.dragonSoulVal);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public boolean C2S_Lottery_29103(DragonVeinMsg.C2S_Lottery_29103 msg, String source) {
      int lotteryItemId = DragonVeinDefine.getLotteryItemId();
      ResourceModel cost = new ResourceModel(2, lotteryItemId, 1);
      if (!this.player.checkResourceNum(cost)) {
         this.failLottery(76135);
         return this.player.failure(76135);
      } else {
         DragonVeinDao dao = this.getDao();
         DragonSoulData dragonSoulData = DragonVeinDefine.lotteryDragonSoulData(dao.dragonVeinLv, dao.dragonSoulVal);
         if (null == dragonSoulData) {
            this.failLottery(6);
            return this.player.failure(6);
         } else {
            dragonSoulData.setCode(this.player.getUniqueCode(CodeDefine.DRAGON_SOUL_CODE));
            dao.bagSoul.put(dragonSoulData.getCode(), dragonSoulData);
            ++dao.drawNum;
            dao.updateOp();
            this.player.delResource(cost, this.getLogModule(), 16301, 0, 0, "");
            this.player.triggerTask(768, 0, 1L, 1);
            if (dao.drawNum <= 2147483647L) {
               GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
               giftPart.triggerTimeLimitGift(40, (int)dao.drawNum, true);
            }

            DragonVeinMsg.S2C_Lottery_29104.Builder builder = DragonVeinMsg.S2C_Lottery_29104.newBuilder();
            builder.setGotSoul(dragonSoulData.toBuilder());
            builder.setDragonVeinLv(dao.dragonVeinLv);
            builder.setDragonVeinExp(dao.getDragonVeinExp());
            builder.setResult(1);
            this.player.sendMsg(builder.build());
            return true;
         }
      }
   }

   private void failLottery(int tipsCode) {
      DragonVeinDao dao = this.getDao();
      DragonVeinMsg.S2C_Lottery_29104.Builder builder = DragonVeinMsg.S2C_Lottery_29104.newBuilder();
      builder.setDragonVeinLv(dao.dragonVeinLv);
      builder.setDragonVeinExp(dao.getDragonVeinExp());
      builder.setResult(0);
      builder.setTipsCode(tipsCode);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public boolean C2S_PresentSoul_29105(DragonVeinMsg.C2S_PresentSoul_29105 msg, String source) {
      DragonVeinDao dao = this.getDao();
      DragonSoulData dragonSoulData = (DragonSoulData)dao.bagSoul.get(msg.getCode());
      if (null == dragonSoulData) {
         return this.player.failure(76551);
      } else {
         int position = dragonSoulData.getPosition();
         DragonSoulData curSoulData = (DragonSoulData)dao.posSoul.get(position);
         if (curSoulData != null) {
            if (msg.getIsResolve()) {
               DragonVeinDecomposeModel decomposeModel = DragonVeinDefine.getDecomposeModel(dao.dragonVeinLv);
               if (null != decomposeModel) {
                  dao.addVeinExp(decomposeModel.getExp());
                  this.player.addResource(decomposeModel.getResolve(), PlayerMsg.ShowType.SHOW_DRAGON_SOUL_RESOLVE, this.getLogModule(), 16302);
               }
            } else {
               if (curSoulData.getCode() <= 0) {
                  curSoulData.setCode(this.player.getUniqueCode(CodeDefine.DRAGON_SOUL_CODE));
               }

               dao.bagSoul.put(curSoulData.getCode(), curSoulData);
            }
         }

         dao.posSoul.put(position, dragonSoulData);
         dao.bagSoul.remove(msg.getCode());
         dao.updateOp();
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_DRAGON_VEIN);
         DragonVeinMsg.S2C_PresentSoul_29106.Builder builder = DragonVeinMsg.S2C_PresentSoul_29106.newBuilder();
         builder.setCode(msg.getCode());
         builder.setIsResolve(msg.getIsResolve());
         builder.setDragonVeinLv(dao.dragonVeinLv);
         builder.setDragonVeinExp(dao.getDragonVeinExp());

         for(Map.Entry<Integer, DragonSoulData> entry : dao.posSoul.entrySet()) {
            DragonSoulData value = (DragonSoulData)entry.getValue();
            builder.addPresentSoulData(value.toBuilder());
         }

         for(Map.Entry<Integer, DragonSoulData> entry : dao.bagSoul.entrySet()) {
            DragonSoulData value = (DragonSoulData)entry.getValue();
            builder.addSurplusSoulData(value.toBuilder());
         }

         this.player.sendMsg(builder.build());
         return true;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_DismissSoul_29107(DragonVeinMsg.C2S_DismissSoul_29107 msg, String source) {
      DragonVeinDao dao = this.getDao();
      DragonSoulData dragonSoulData;
      if (msg.getPosition() > 0) {
         dragonSoulData = (DragonSoulData)dao.posSoul.get(msg.getPosition());
      } else {
         dragonSoulData = (DragonSoulData)dao.bagSoul.get(msg.getCode());
      }

      if (null == dragonSoulData) {
         return this.player.failure(76551);
      } else {
         DragonVeinDecomposeModel decomposeModel = DragonVeinDefine.getDecomposeModel(dao.dragonVeinLv);
         if (null == decomposeModel) {
            return this.player.failure(37);
         } else {
            dao.addVeinExp(decomposeModel.getExp());
            this.player.addResource(decomposeModel.getResolve(), PlayerMsg.ShowType.SHOW_DRAGON_SOUL_RESOLVE, this.getLogModule(), 16302);
            if (msg.getPosition() > 0) {
               dao.posSoul.remove(msg.getPosition());
            } else {
               dao.bagSoul.remove(msg.getCode());
            }

            dao.updateOp();
            DragonVeinMsg.S2C_DismissSoul_29108.Builder builder = DragonVeinMsg.S2C_DismissSoul_29108.newBuilder();

            for(Map.Entry<Integer, DragonSoulData> entry : dao.posSoul.entrySet()) {
               DragonSoulData value = (DragonSoulData)entry.getValue();
               builder.addPresentSoulData(value.toBuilder());
            }

            for(Map.Entry<Integer, DragonSoulData> entry : dao.bagSoul.entrySet()) {
               DragonSoulData value = (DragonSoulData)entry.getValue();
               builder.addSurplusSoulData(value.toBuilder());
            }

            builder.setResolvePosition(msg.getPosition());
            builder.setDragonVeinLv(dao.dragonVeinLv);
            builder.setDragonVeinExp(dao.getDragonVeinExp());
            this.player.sendMsg(builder.build());
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_DragonSoulValUp_29109(DragonVeinMsg.C2S_DragonSoulValUp_29109 msg, String source) {
      Map<Integer, Integer> costItem = new HashMap();
      int upLongHunItemId = DragonVeinDefine.getUpLongHunItemId();

      for(CommonMsg.MapDataII ii : msg.getItemNumList()) {
         if (ii.getKey() == upLongHunItemId && ii.getValue() > 0) {
            costItem.put(ii.getKey(), ii.getValue());
         }
      }

      if (costItem.isEmpty()) {
         return this.player.failure(6);
      } else {
         List<ResourceModel> cost = new ArrayList();
         int upLongHunAddVal = DragonVeinDefine.getUpLongHunAddVal();
         int addSoulVal = 0;

         for(Map.Entry<Integer, Integer> entry : costItem.entrySet()) {
            cost.add(new ResourceModel(2, (Integer)entry.getKey(), (Integer)entry.getValue()));
            addSoulVal += upLongHunAddVal * (Integer)entry.getValue();
         }

         if (!this.player.checkResourceNum(cost)) {
            return this.player.failure(76135);
         } else {
            this.player.delResource((List)cost, this.getLogModule(), 16303, 0, 0, "");
            DragonVeinDao dao = this.getDao();
            dao.dragonSoulVal += addSoulVal;
            dao.updateOp();
            DragonVeinMsg.S2C_DragonSoulValUp_29110.Builder builder = DragonVeinMsg.S2C_DragonSoulValUp_29110.newBuilder();
            builder.setDragonSoulVal(dao.dragonSoulVal);
            this.player.sendMsg(builder.build());
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_CommitOption_29111(DragonVeinMsg.C2S_CommitOption_29111 msg, String source) {
      Map<Integer, Integer> optionMap = new HashMap();

      for(DragonVeinMsg.OptionVal optionVal : msg.getOptionValList()) {
         DragonVeinMsg.OptionEnum optionEnum = DragonVeinMsg.OptionEnum.forNumber(optionVal.getOption().getNumber());
         if (null == optionEnum) {
            return this.player.failure(6);
         }

         optionMap.put(optionVal.getOption().getNumber(), optionVal.getVal());
      }

      DragonVeinDao dao = this.getDao();
      dao.option.putAll(optionMap);
      dao.updateOp();
      DragonVeinMsg.S2C_CommitOption_29112.Builder builder = DragonVeinMsg.S2C_CommitOption_29112.newBuilder();

      for(Map.Entry<Integer, Integer> entry : dao.option.entrySet()) {
         Integer optionNum = (Integer)entry.getKey();
         Integer optionVal = (Integer)entry.getValue();
         DragonVeinMsg.OptionVal.Builder optionBuilder = DragonVeinMsg.OptionVal.newBuilder();
         optionBuilder.setOption(DragonVeinMsg.OptionEnum.forNumber(optionNum));
         optionBuilder.setVal(optionVal);
         builder.addOptionVal(optionBuilder);
      }

      this.player.sendMsg(builder.build());
      return true;
   }

   @MsgHandlerAnno
   public void C2S_OptionInfo_29113(DragonVeinMsg.C2S_OptionInfo_29113 msg, String source) {
      DragonVeinMsg.S2C_OptionInfo_29114.Builder builder = DragonVeinMsg.S2C_OptionInfo_29114.newBuilder();
      DragonVeinDao dao = this.getDao();

      for(Map.Entry<Integer, Integer> entry : dao.option.entrySet()) {
         Integer optionNum = (Integer)entry.getKey();
         Integer optionVal = (Integer)entry.getValue();
         DragonVeinMsg.OptionVal.Builder optionBuilder = DragonVeinMsg.OptionVal.newBuilder();
         optionBuilder.setOption(DragonVeinMsg.OptionEnum.forNumber(optionNum));
         optionBuilder.setVal(optionVal);
         builder.addOptionVal(optionBuilder);
      }

      this.player.sendMsg(builder.build());
   }

   public List<PropertyModel> getAllAttr(int heroId) {
      List<PropertyModel> attrList = new ArrayList();
      HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroId);
      if (null == heroModel) {
         return attrList;
      } else {
         DragonVeinDao dao = this.getDao();

         for(Map.Entry<Integer, DragonSoulData> entry : dao.posSoul.entrySet()) {
            DragonSoulData dragonSoulData = (DragonSoulData)entry.getValue();

            for(HeroTypeAttrData attrData : dragonSoulData.getAttr()) {
               if (attrData.getHeroType() <= 0 || attrData.getHeroType() == heroModel.getType()) {
                  attrList.add(new PropertyModel(attrData.getType(), attrData.getWay(), (long)attrData.getVal()));
               }
            }
         }

         return attrList;
      }
   }

   public List<PropertyModel> calRealAddPro(int heroId) {
      List<PropertyModel> allPro = this.getAllAttr(heroId);
      List<PropertyModel> newList = new ArrayList();
      if (allPro != null && !allPro.isEmpty()) {
         Map<Integer, Long> valMap = new HashMap();
         Map<Integer, Long> perMap = new HashMap();

         for(PropertyModel propertyModel : allPro) {
            switch (propertyModel.getType()) {
               case 1:
               case 2:
                  if (propertyModel.getWay() == 0) {
                     long oldVal = (Long)MapUtil.getOrDefault(valMap, propertyModel.getType(), 0L);
                     valMap.put(propertyModel.getType(), oldVal + propertyModel.getValue());
                  } else if (propertyModel.getWay() == 1) {
                     long oldVal = (Long)MapUtil.getOrDefault(perMap, propertyModel.getType(), 0L);
                     perMap.put(propertyModel.getType(), oldVal + propertyModel.getValue());
                  }
                  break;
               default:
                  newList.add(propertyModel);
            }
         }

         for(Map.Entry<Integer, Long> entry : valMap.entrySet()) {
            long val = (Long)entry.getValue();
            if (perMap.containsKey(entry.getKey())) {
               double tempVal = (double)((float)val * (1.0F + (float)(Long)perMap.get(entry.getKey()) / 10000.0F));
               val = Double.valueOf(tempVal).longValue();
            }

            newList.add(new PropertyModel((Integer)entry.getKey(), 0, val));
         }

         return newList;
      } else {
         return newList;
      }
   }
}
