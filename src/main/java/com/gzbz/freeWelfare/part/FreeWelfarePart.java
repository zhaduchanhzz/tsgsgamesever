package com.gzbz.freeWelfare.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.FreeWelfareDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.FreeWelfareModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.FreeWelfareMsg;
import com.gzbz.spring.ApplicationContextProvider;
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
public class FreeWelfarePart extends PlayerPart {
   public FreeWelfareDao getDao() {
      return (FreeWelfareDao)this.player.getData("tb_free_welfare", this.player.getPlayerId());
   }

   public Map<Integer, FreeWelfareModel> getFreeWelfareModelMap() {
      return ApplicationContextProvider.<Integer, FreeWelfareModel>getModelPoolMap("FreeWelfare");
   }

   public FreeWelfareModel getFreeWelfareModel(int id) {
      Map<Integer, FreeWelfareModel> freeWelfareModelMap = this.getFreeWelfareModelMap();
      return freeWelfareModelMap == null ? null : (FreeWelfareModel)freeWelfareModelMap.get(id);
   }

   public void resetDaily() {
      if (this.player.isSystemOpen(6810)) {
         FreeWelfareDao dao = this.getDao();
         dao.advWatchNum.clear();
         dao.recAdvId.clear();
         dao.updateOp();
         this.sendFreeWelfareInfo();
      }
   }

   public int getMaxCanWatchAdvId() {
      Map<Integer, FreeWelfareModel> freeWelfareModelMap = this.getFreeWelfareModelMap();
      if (null != freeWelfareModelMap && !freeWelfareModelMap.isEmpty()) {
         int maxId = 1;
         FreeWelfareDao dao = this.getDao();

         for(Map.Entry<Integer, FreeWelfareModel> entry : freeWelfareModelMap.entrySet()) {
            FreeWelfareModel model = (FreeWelfareModel)entry.getValue();
            Integer watchNum = (Integer)dao.advWatchNum.getOrDefault(model.getId(), 0);
            if (watchNum > 0 && model.getId() > maxId) {
               maxId = model.getId();
            }
         }

         FreeWelfareModel maxIdModel = this.getFreeWelfareModel(maxId);
         Integer maxIdWatchNum = (Integer)dao.advWatchNum.getOrDefault(maxIdModel.getId(), 0);
         if (maxIdWatchNum >= maxIdModel.getNum()) {
            FreeWelfareModel nextModel = this.getFreeWelfareModel(maxId + 1);
            if (nextModel != null) {
               ++maxId;
            }
         }

         return maxId;
      } else {
         return 0;
      }
   }

   public List<CommonMsg.MapDataII> getAdvWatchNumBuilder() {
      List<CommonMsg.MapDataII> mapDataIIList = new ArrayList();
      Map<Integer, FreeWelfareModel> freeWelfareModelMap = this.getFreeWelfareModelMap();
      FreeWelfareDao dao = this.getDao();
      if (null != freeWelfareModelMap && freeWelfareModelMap.size() > 0) {
         for(Map.Entry<Integer, FreeWelfareModel> entry : freeWelfareModelMap.entrySet()) {
            FreeWelfareModel model = (FreeWelfareModel)entry.getValue();
            Integer watchNum = (Integer)dao.advWatchNum.getOrDefault(model.getId(), 0);
            CommonMsg.MapDataII.Builder mapDataII = CommonMsg.MapDataII.newBuilder();
            mapDataII.setKey(model.getId());
            mapDataII.setValue(watchNum);
            mapDataIIList.add(mapDataII.build());
         }
      }

      return mapDataIIList;
   }

   @MsgHandlerAnno
   public void C2S_FreeWelfareInfo_28301(FreeWelfareMsg.C2S_FreeWelfareInfo_28301 msg, String source) {
      this.sendFreeWelfareInfo();
   }

   public void sendFreeWelfareInfo() {
      FreeWelfareMsg.S2C_FreeWelfareInfo_28302.Builder builder = FreeWelfareMsg.S2C_FreeWelfareInfo_28302.newBuilder();
      builder.addAllAdvWatchNum(this.getAdvWatchNumBuilder());
      FreeWelfareDao dao = this.getDao();

      for(Integer advId : dao.recAdvId) {
         builder.addRecAdvId(advId);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public boolean C2S_WatchAdv_28303(FreeWelfareMsg.C2S_WatchAdv_28303 msg, String source) {
      if (!this.player.isSystemOpen(6810)) {
         return this.player.failure(21);
      } else {
         FreeWelfareModel freeWelfareModel = this.getFreeWelfareModel(msg.getId());
         if (null == freeWelfareModel) {
            return this.player.failure(37);
         } else {
            int maxCanWatchAdvId = this.getMaxCanWatchAdvId();
            if (maxCanWatchAdvId < freeWelfareModel.getId()) {
               return this.player.failure(6);
            } else {
               FreeWelfareDao dao = this.getDao();
               Integer curWatchNum = (Integer)dao.advWatchNum.getOrDefault(msg.getId(), 0);
               dao.advWatchNum.put(msg.getId(), curWatchNum + 1);
               dao.updateOp();
               FreeWelfareMsg.S2C_WatchAdv_28304.Builder builder = FreeWelfareMsg.S2C_WatchAdv_28304.newBuilder();
               builder.addAllAdvWatchNum(this.getAdvWatchNumBuilder());
               this.player.sendMsg(builder.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_RecAdvReward_28305(FreeWelfareMsg.C2S_RecAdvReward_28305 msg, String source) {
      if (!this.player.isSystemOpen(6810)) {
         return this.player.failure(21);
      } else {
         FreeWelfareModel freeWelfareModel = this.getFreeWelfareModel(msg.getId());
         if (null == freeWelfareModel) {
            return this.player.failure(37);
         } else {
            FreeWelfareDao dao = this.getDao();
            if (dao.recAdvId.contains(msg.getId())) {
               return this.player.failure(76030);
            } else {
               Integer watchNum = (Integer)dao.advWatchNum.getOrDefault(msg.getId(), 0);
               if (watchNum >= freeWelfareModel.getNum()) {
                  dao.recAdvId.add(freeWelfareModel.getId());
                  dao.updateOp();
                  this.player.addResource(freeWelfareModel.getRewards(), 153, 15301);
               }

               FreeWelfareMsg.S2C_RecAdvReward_28306.Builder builder = FreeWelfareMsg.S2C_RecAdvReward_28306.newBuilder();

               for(Integer recId : dao.recAdvId) {
                  builder.addRecAdvId(recId);
               }

               this.player.sendMsg(builder.build());
               return true;
            }
         }
      }
   }

   public int recAdvReward(int freeWelfareId) {
      FreeWelfareModel freeWelfareModel = this.getFreeWelfareModel(freeWelfareId);
      if (null == freeWelfareModel) {
         return 37;
      } else {
         FreeWelfareDao dao = this.getDao();
         dao.recAdvId.add(freeWelfareModel.getId());
         dao.updateOp();
         this.player.addResource(freeWelfareModel.getRewards(), 153, 15301);
         return 1;
      }
   }
}
