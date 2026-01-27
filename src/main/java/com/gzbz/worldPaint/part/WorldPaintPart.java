package com.gzbz.worldPaint.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.model.WorldPaintFrontModel;
import com.gzbz.model.WorldPaintLevelModel;
import com.gzbz.protobuf.WorldPaintMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldPaint.WorldPaintDefine;
import com.gzbz.worldPaint.WorldPaintExtend;
import com.gzbz.worldPaint.WorldPaintInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class WorldPaintPart extends PlayerPart {
   @MsgHandlerAnno
   public void C2S_WorldPaintMsg_23501(WorldPaintMsg.C2S_WorldPaintMsg_23501 msg, String source) {
      this.sendWorldPaintMsg();
   }

   public void sendWorldPaintMsg() {
      WorldPaintExtend worldPaintExtend = (WorldPaintExtend)this.player.getPlayerExtend(135);
      Map<Integer, WorldPaintFrontModel> worldPaintFrontModelMap = ApplicationContextProvider.<Integer, WorldPaintFrontModel>getModelPoolMap("WorldPaintFront");
      WorldPaintMsg.S2C_WorldPaintMsg_23502.Builder resp = WorldPaintMsg.S2C_WorldPaintMsg_23502.newBuilder();

      for(Map.Entry<Integer, WorldPaintFrontModel> entry : worldPaintFrontModelMap.entrySet()) {
         WorldPaintMsg.WorldPaintInfo.Builder infoBuilder = WorldPaintMsg.WorldPaintInfo.newBuilder();
         WorldPaintFrontModel value = (WorldPaintFrontModel)entry.getValue();
         WorldPaintInfo worldPaintInfo = (WorldPaintInfo)worldPaintExtend.worldPaintInfoMap.get(value.getId());
         if (null != worldPaintInfo) {
            infoBuilder.setType(worldPaintInfo.getType());
            infoBuilder.setGrade(worldPaintInfo.getGrade());
            infoBuilder.setLv(worldPaintInfo.getLv());
         } else {
            infoBuilder.setType(value.getId());
            infoBuilder.setGrade(0);
            infoBuilder.setLv(0);
         }

         resp.addWorldPaint(infoBuilder);
      }

      this.player.sendMsg(resp.build());
   }

   public boolean checkFrontUnlock(int type) {
      WorldPaintFrontModel worldPaintFrontModel = WorldPaintDefine.getWorldPaintFrontModel(type);
      if (null == worldPaintFrontModel) {
         return false;
      } else if (worldPaintFrontModel.getFrontPaint() <= 0) {
         return true;
      } else {
         WorldPaintExtend worldPaintExtend = (WorldPaintExtend)this.player.getPlayerExtend(135);
         Map<Integer, WorldPaintInfo> worldPaintInfoMap = worldPaintExtend.worldPaintInfoMap;
         WorldPaintInfo preWorldPaintInfo = (WorldPaintInfo)worldPaintInfoMap.get(worldPaintFrontModel.getFrontPaint());
         return preWorldPaintInfo != null && preWorldPaintInfo.getGrade() >= worldPaintFrontModel.getFrontPaintGrade();
      }
   }

   @MsgHandlerAnno
   public boolean C2S_WorldPaintStrengthen_23503(WorldPaintMsg.C2S_WorldPaintStrengthen_23503 msg, String source) {
      if (!this.player.isSystemOpen(6351)) {
         return this.player.failure(21);
      } else {
         WorldPaintFrontModel worldPaintFrontModel = WorldPaintDefine.getWorldPaintFrontModel(msg.getType());
         if (null == worldPaintFrontModel) {
            return this.player.failure(6);
         } else if (!this.checkFrontUnlock(msg.getType())) {
            return this.player.failure(76306);
         } else {
            WorldPaintExtend worldPaintExtend = (WorldPaintExtend)this.player.getPlayerExtend(135);
            WorldPaintInfo worldPaintInfo = (WorldPaintInfo)worldPaintExtend.worldPaintInfoMap.get(msg.getType());
            if (null == worldPaintInfo) {
               worldPaintInfo = new WorldPaintInfo(msg.getType(), 0, 0);
            }

            int beforeGrade = worldPaintInfo.getGrade();
            WorldPaintLevelModel worldPaintLevelModel = WorldPaintDefine.getWorldPaintLevelModel(worldPaintInfo.getType(), worldPaintInfo.getGrade(), worldPaintInfo.getLv());
            if (null == worldPaintLevelModel) {
               return this.player.failure(37);
            } else if (worldPaintLevelModel.getNextId() <= 0) {
               return this.player.failure(76307);
            } else if (!this.player.checkResourceNum((List)worldPaintLevelModel.getMaterials())) {
               return this.player.failure(76135);
            } else {
               WorldPaintLevelModel nextWorldPaintLevelModel = WorldPaintDefine.getWorldPaintLevelModel(worldPaintLevelModel.getNextId());
               if (null == nextWorldPaintLevelModel) {
                  return this.player.failure(37);
               } else {
                  this.player.delResource((List)worldPaintLevelModel.getMaterials(), 135, 13501, 0, 0, "");
                  worldPaintInfo.setGrade(nextWorldPaintLevelModel.getGrade());
                  worldPaintInfo.setLv(nextWorldPaintLevelModel.getLv());
                  worldPaintExtend.worldPaintInfoMap.put(worldPaintInfo.getType(), worldPaintInfo);
                  this.updateAndFlush();
                  this.player.triggerTask(740, 0, 1L, 1);
                  WorldPaintMsg.S2C_WorldPaintStrengthen_23504.Builder resp = WorldPaintMsg.S2C_WorldPaintStrengthen_23504.newBuilder();
                  this.player.sendMsg(resp.build());
                  this.worldPaintUnlockNotice(worldPaintInfo.getType(), beforeGrade, worldPaintInfo.getGrade());
                  return true;
               }
            }
         }
      }
   }

   public void updateAndFlush() {
      this.player.updatePlayerExtend(135);
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_WORLD_PAINT);
      this.sendWorldPaintMsg();
   }

   public void worldPaintUnlockNotice(int type, int beforeGrade, int afterGrade) {
      Map<Integer, WorldPaintFrontModel> worldPaintFrontModelMap = ApplicationContextProvider.<Integer, WorldPaintFrontModel>getModelPoolMap("WorldPaintFront");
      if (worldPaintFrontModelMap != null && !worldPaintFrontModelMap.isEmpty()) {
         List<Integer> unlockTypeList = new ArrayList();

         for(Map.Entry<Integer, WorldPaintFrontModel> entry : worldPaintFrontModelMap.entrySet()) {
            WorldPaintFrontModel worldPaintFrontModel = (WorldPaintFrontModel)entry.getValue();
            if (worldPaintFrontModel.getFrontPaint() == type && worldPaintFrontModel.getFrontPaintGrade() == afterGrade && afterGrade > beforeGrade) {
               unlockTypeList.add(worldPaintFrontModel.getId());
            }
         }

         if (unlockTypeList.size() > 0) {
            WorldPaintMsg.S2C_WorldPaintUnlockNotice_23505.Builder resp = WorldPaintMsg.S2C_WorldPaintUnlockNotice_23505.newBuilder();
            resp.addAllType(unlockTypeList);
            this.player.sendMsg(resp.build());
         }

      }
   }
}
