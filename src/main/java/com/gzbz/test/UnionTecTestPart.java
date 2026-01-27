package com.gzbz.test;

import allMgr.PartAnnotation;
import cn.hutool.core.io.FileUtil;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.UnionTechnologyPlaceData;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.UnionTecModel;
import com.gzbz.model.UnionTecPlaceModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.UnionMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.bean.PlayerUnionExtend;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class UnionTecTestPart extends PlayerPart {
   private StringBuffer testResultText = null;

   public void testTecFee() {
      this.testResultText = new StringBuffer();
      PlayerDao playerDao = this.player.getPlayerDao();
      PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);
      playerUnionExtend.technology.clear();
      Map<Integer, Map<Integer, UnionTecModel>> unionTecModeMap = ApplicationContextProvider.<Integer, Map<Integer, UnionTecModel>>getModelPoolMap("customUnionTec");
      this.testResultText.append("--------------测试玩家【").append(playerDao.playerName).append("】").append("\n");
      List<ResourceModel> feeList = new ArrayList();
      unionTecModeMap.keySet().forEach((type) -> {
         this.testResultText.append("--------------职业类型:【").append(type).append("】\n");
         List<ResourceModel> typeFeeList = this.testTecFee(type, playerUnionExtend.technology);
         typeFeeList.forEach((resourceModel) -> {
            this.testResultText.append("--------------职业类型:【").append(type).append("】").append("总消耗【").append(resourceModel.getId()).append("】:【").append(resourceModel.getValue()).append("】\n");
            resourceModel.addResourceToList(feeList);
         });
         this.testResultText.append("\n");
      });
      this.player.updatePlayerExtend(9);
      UnionMsg.S2C_UnionTechnology_6960.Builder resp = UnionMsg.S2C_UnionTechnology_6960.newBuilder();
      playerUnionExtend.technology.forEach((key, value) -> {
         UnionMsg.UnionTechnology.Builder technologyBuilder = UnionMsg.UnionTechnology.newBuilder();
         technologyBuilder.setType(key);
         value.values().forEach((unionTechnologyPlaceData) -> {
            UnionMsg.UnionTechnologyPlace.Builder placeBuilder = UnionMsg.UnionTechnologyPlace.newBuilder();
            placeBuilder.setPlace(unionTechnologyPlaceData.place);
            placeBuilder.setModelId(unionTechnologyPlaceData.modelId);
            placeBuilder.setIsLight(unionTechnologyPlaceData.isLight);
            technologyBuilder.addPlace(placeBuilder);
         });
         resp.addTechnology(technologyBuilder);
      });
      resp.setResetCount(playerUnionExtend.technologyResetCount);
      this.player.sendMsg(resp.build());
      this.printResult();
   }

   public List<ResourceModel> testTecFee(int type, Map<Integer, Map<Integer, UnionTechnologyPlaceData>> technology) {
      List<ResourceModel> resourceModelList = new ArrayList();
      Map<Integer, Map<Integer, UnionTecModel>> unionTecModeMap = ApplicationContextProvider.<Integer, Map<Integer, UnionTecModel>>getModelPoolMap("customUnionTec");
      Map<Integer, Map<Integer, UnionTecPlaceModel>> customTecPlaceModelMap = ApplicationContextProvider.<Integer, Map<Integer, UnionTecPlaceModel>>getModelPoolMap("customUnionTecPlace");
      ((Map)unionTecModeMap.get(type)).keySet().forEach((pos) -> {
         List<ResourceModel> posResourceList = new ArrayList();
         ((Map)customTecPlaceModelMap.get(pos)).values().forEach((unionTecPlaceModel) -> {
            unionTecPlaceModel.getConsumes().forEach((resourceModel) -> resourceModel.clone().addResourceToList(posResourceList));
            ((Map)technology.computeIfAbsent(type, (v) -> new ConcurrentHashMap())).put(pos, new UnionTechnologyPlaceData(unionTecPlaceModel.getTecPlace(), unionTecPlaceModel.getId(), true));
         });
         posResourceList.forEach((resourceModel) -> {
            resourceModel.addResourceToList(resourceModelList);
            this.testResultText.append("--------------位置:【").append(pos).append("】总消耗【").append(resourceModel.getId()).append("】:【").append(resourceModel.getValue()).append("】\n");
         });
         this.testResultText.append("\n");
      });
      return resourceModelList;
   }

   private void printResult() {
      FileUtil.writeString(this.testResultText.toString(), System.getProperty("user.dir") + File.separator + "test" + File.separator + "unionTecTest.txt", "UTF-8");
      this.testResultText = null;
   }
}
