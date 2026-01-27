package com.gzbz.dragon.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.db.BattleChapterDao;
import com.gzbz.db.bean.DragonTeamRecordData;
import com.gzbz.dragon.DragonDiscipleExtend;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.model.DragonMysticBookModel;
import com.gzbz.model.DragonStrengthenBattleModel;
import com.gzbz.model.DragonStrengthenCostModel;
import com.gzbz.model.DragonStrengthenModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.DragonDiscipleMsg;
import com.gzbz.worldPaint.part.WorldPaintPart;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class DragonStrengthenPart extends PlayerPart {
   @Autowired
   ConfigManager configManager;

   @MsgHandlerAnno
   public void C2S_AwakenInfo_13471(DragonDiscipleMsg.C2S_AwakenInfo_13471 msg, String source) {
      WorldPaintPart worldPaintPart = (WorldPaintPart)this.player.getMgrPart(WorldPaintPart.class);
      worldPaintPart.sendWorldPaintMsg();
      this.sendAwakenInfo();
   }

   private void sendAwakenInfo() {
      DragonDiscipleMsg.S2C_AwakenInfo_13472.Builder builder = DragonDiscipleMsg.S2C_AwakenInfo_13472.newBuilder();
      DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
      builder.setBreachLv(dragonDiscipleExtend.breachLv);
      builder.addAllTecPlace(dragonDiscipleExtend.tecPlace);
      builder.setHadFight(dragonDiscipleExtend.passed);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_Strengthen_13473(DragonDiscipleMsg.C2S_Strengthen_13473 msg, String source) {
      DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
      if (dragonDiscipleExtend.tecPlace.contains(msg.getTecPlace())) {
         this.player.failure(61015);
      } else if (dragonDiscipleExtend.tecPlace.size() + 1 != msg.getTecPlace()) {
         this.player.failure(61042);
      } else {
         Map<Integer, DragonStrengthenCostModel> modelMap = (Map)this.player.getGameModelPool().getEntity("customDragonStrengthenCost", dragonDiscipleExtend.breachLv + 1);
         if (CollectionUtils.isEmpty(modelMap)) {
            this.player.failure(61017);
         } else if (!modelMap.containsKey(msg.getTecPlace())) {
            this.player.failure(6);
         } else {
            DragonStrengthenCostModel model = (DragonStrengthenCostModel)modelMap.get(msg.getTecPlace());
            if (dragonDiscipleExtend.tecPlace.size() == 0) {
               BattleChapterDao chapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
               if (model.getChapter() > chapterDao.chapterId) {
                  this.player.failure(15001);
                  return;
               }

               DragonStrengthenBattleModel battleModel = (DragonStrengthenBattleModel)this.player.getGameModelPool().getEntity("dragonStrengthenBattle", dragonDiscipleExtend.breachLv);
               if (battleModel != null && !dragonDiscipleExtend.passed) {
                  this.player.failure(61016);
                  return;
               }
            }

            if (!this.player.checkResourceNum(model.getConsumes())) {
               this.player.failure(3);
            } else {
               this.player.delResource((List)model.getConsumes(), 65, 6501, 0, 0, "");
               dragonDiscipleExtend.tecPlace.add(msg.getTecPlace());
               boolean flag = false;
               if (dragonDiscipleExtend.tecPlace.size() == modelMap.size()) {
                  ++dragonDiscipleExtend.breachLv;
                  dragonDiscipleExtend.tecPlace.clear();
                  dragonDiscipleExtend.passed = false;
                  this.player.triggerTask(541, 0, (long)dragonDiscipleExtend.breachLv, 0);
                  flag = true;
               }

               this.player.updatePlayerExtend(65);
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.setProperty_dragon_strengthen(this.getPropertyAdditions());
               heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_DRAGON_STRENGTHEN);
               DragonDiscipleMsg.S2C_Strengthen_13474.Builder builder = DragonDiscipleMsg.S2C_Strengthen_13474.newBuilder();
               builder.setBreachLv(dragonDiscipleExtend.breachLv);
               builder.setTecPlace(msg.getTecPlace());
               this.player.sendMsg(builder.build());
               if (flag) {
                  DragonPart dragonPart = (DragonPart)this.player.getMgrPart(DragonPart.class);
                  dragonPart.sendPlayerToCross(true);
               }

            }
         }
      }
   }

   public List<PropertyModel> getPropertyAdditions() {
      DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
      List<PropertyModel> propertyModels = new ArrayList();
      Map<Integer, List<DragonStrengthenModel>> customModelMap = this.player.getGameModelPool().getMap("customDragonStrengthen");

      for(Map.Entry<Integer, List<DragonStrengthenModel>> mapEntry : customModelMap.entrySet()) {
         int strengthenNum = dragonDiscipleExtend.breachLv + (dragonDiscipleExtend.tecPlace.contains(mapEntry.getKey()) ? 1 : 0);

         for(DragonStrengthenModel dragonStrengthenModel : (List)mapEntry.getValue()) {
            int count = Math.min(dragonStrengthenModel.getMaxCount(), strengthenNum) - dragonStrengthenModel.getMinCount();
            if (count <= 0) {
               break;
            }

            for(PropertyModel propertyModel : dragonStrengthenModel.getProperties()) {
               PropertyModel finalProperty = propertyModel.clone();
               finalProperty.setValue(finalProperty.getValue() * (long)count);
               propertyModels.add(finalProperty);
            }
         }
      }

      return propertyModels;
   }

   public int getStrengthenNum() {
      DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
      return dragonDiscipleExtend.breachLv;
   }

   public List<PropertyModel> getMysticBookAdditions() {
      List<PropertyModel> propertyModels = new ArrayList();
      int strengthenNum = this.getStrengthenNum();
      if (strengthenNum <= 0) {
         return propertyModels;
      } else {
         DragonMysticBookModel model = (DragonMysticBookModel)this.player.getGameModelPool().getEntity("dragonMysticBook", strengthenNum);
         if (model != null) {
            for(PropertyModel propertyModel : model.getMysticbook()) {
               PropertyModel finalProperty = propertyModel.clone();
               propertyModels.add(finalProperty);
            }
         }

         return propertyModels;
      }
   }

   public void gmResetStrengthen(int strengthenLv) {
      Map<Integer, DragonStrengthenCostModel> modelMap = (Map)this.player.getGameModelPool().getEntity("customDragonStrengthenCost", strengthenLv);
      if (strengthenLv != 0 && CollectionUtils.isEmpty(modelMap)) {
         this.player.failure(61017);
      } else {
         DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
         dragonDiscipleExtend.breachLv = strengthenLv;
         dragonDiscipleExtend.tecPlace.clear();
         dragonDiscipleExtend.passed = false;
         this.player.updatePlayerExtend(65);
         this.sendAwakenInfo();
         List<PropertyModel> propertyModelList = this.getPropertyAdditions();
         Map<String, Long> map = new HashMap();

         for(PropertyModel propertyModel : propertyModelList) {
            String key = "" + propertyModel.getType() + propertyModel.getValue();
            Long value = (Long)map.getOrDefault(key, 0L);
            map.put(key, value + propertyModel.getValue());
         }

         for(Map.Entry<String, Long> entry : map.entrySet()) {
            this.logger.info("{} -> {}", entry.getKey(), entry.getValue());
         }

         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         heroBagPart.setProperty_dragon_strengthen(this.getPropertyAdditions());
         heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_DRAGON_STRENGTHEN);
      }
   }

   public void resetDaily() {
      DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
      dragonDiscipleExtend.battleNum = 0;
      this.player.updatePlayerExtend(65);
   }

   @MsgHandlerAnno
   public void C2S_RewardRecord_13476(DragonDiscipleMsg.C2S_RewardRecord_13476 msg, String source) {
      DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
      DragonDiscipleMsg.S2C_RewardRecord_13477.Builder builder = DragonDiscipleMsg.S2C_RewardRecord_13477.newBuilder();

      for(Map.Entry<Integer, DragonTeamRecordData> entry : dragonDiscipleExtend.rewards.entrySet()) {
         DragonDiscipleMsg.RewardRecord.Builder record = DragonDiscipleMsg.RewardRecord.newBuilder();
         record.setBreachLv((Integer)entry.getKey());
         record.setTime(((DragonTeamRecordData)entry.getValue()).time);

         for(ResourceModel resourceModel : ((DragonTeamRecordData)entry.getValue()).awardList) {
            record.addReward(ResourceModel.builderItemInfo(resourceModel));
         }

         builder.addRecord(record);
      }

      this.player.sendMsg(builder.build());
   }

   @TaskMethod
   public void addRecord(List<ResourceModel> resourceModels, int bleachLv, int time) {
      DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
      DragonTeamRecordData data = new DragonTeamRecordData();
      data.stage = bleachLv;
      data.time = time;

      for(ResourceModel model : resourceModels) {
         data.awardList.add(new ResourceModel(model.getType(), model.getId(), model.getValue()));
      }

      dragonDiscipleExtend.rewards.put(bleachLv, data);
      this.player.updatePlayerExtend(65);
   }
}
