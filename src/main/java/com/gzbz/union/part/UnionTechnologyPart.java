package com.gzbz.union.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.UnionTechnologyPlaceData;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.model.GradingSystemModel;
import com.gzbz.model.UnionTecModel;
import com.gzbz.model.UnionTecPlaceModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.UnionMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.bean.PlayerUnionExtend;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class UnionTechnologyPart extends UnionPart {
   @Autowired
   private ConfigManager configManager;

   @MsgHandlerAnno
   public void C2S_UnionResetTechnology_6943(UnionMsg.C2S_UnionResetTechnology_6943 msg, String source) {
      if (!this.checkJoin()) {
         this.player.failure(23);
      } else {
         int type = msg.getType();
         Map<Integer, Map<Integer, UnionTecModel>> unionTecModeMap = ApplicationContextProvider.<Integer, Map<Integer, UnionTecModel>>getModelPoolMap("customUnionTec");
         if (!unionTecModeMap.containsKey(type)) {
            this.player.failure(0);
         } else {
            PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);
            int consumeCoefficient = 0;
            String[] resourceArr;
            if (playerUnionExtend.technologyResetCount == 0) {
               resourceArr = ApplicationContextProvider.getConfigString("unionTecResetFirst", "").split("\\|");
            } else {
               resourceArr = ApplicationContextProvider.getConfigString("unionTecResetConsume", "").split("\\|");
               consumeCoefficient = ApplicationContextProvider.getConfigInt("unionTecResetCoefficient", Integer.MAX_VALUE);
            }

            ResourceModel resourceModel = new ResourceModel(Integer.parseInt(resourceArr[0]), Integer.parseInt(resourceArr[1]), Integer.parseInt(resourceArr[2]));
            Map<Integer, Map<Integer, UnionTecPlaceModel>> customTecPlaceModelMap = ApplicationContextProvider.<Integer, Map<Integer, UnionTecPlaceModel>>getModelPoolMap("customUnionTecPlace");
            List<ResourceModel> resourceModelList = new ArrayList();
            int returnCopper = 0;
            int returnContribution = 0;
            Map<Integer, UnionTechnologyPlaceData> technologyPlaceDataMap = (Map)playerUnionExtend.technology.getOrDefault(type, new ConcurrentHashMap());

            for(UnionTechnologyPlaceData unionTechnologyPlaceData : technologyPlaceDataMap.values()) {
               UnionTecPlaceModel unionTecPlaceModel = (UnionTecPlaceModel)ApplicationContextProvider.getModelPoolEntity("unionTecPlace", unionTechnologyPlaceData.modelId);
               int level = unionTecPlaceModel.getTecLevel();
               if (!unionTechnologyPlaceData.isLight) {
                  --level;
                  unionTecPlaceModel = (UnionTecPlaceModel)((Map)customTecPlaceModelMap.get(unionTechnologyPlaceData.place)).get(level);
               }

               if (unionTecPlaceModel != null) {
                  if (level > 6) {
                     resourceModel.setValue(resourceModel.getValue() + (level - 6) * consumeCoefficient);
                  }

                  while(level > 0 && unionTecPlaceModel != null) {
                     for(ResourceModel consumeResource : unionTecPlaceModel.getConsumes()) {
                        if (consumeResource.getType() == 1 && consumeResource.getId() == PlayerDefine.PLAYER_COPPER) {
                           returnCopper += consumeResource.getValue() / 2;
                           ResourceModel.addResourceToList(resourceModelList, new ResourceModel(consumeResource.getType(), consumeResource.getId(), consumeResource.getValue() / 2));
                        } else {
                           if (consumeResource.getType() == 1 && consumeResource.getId() == PlayerDefine.PLAYER_UNION_CONTRIBUTION) {
                              returnContribution += consumeResource.getValue();
                           }

                           ResourceModel.addResourceToList(resourceModelList, consumeResource);
                        }
                     }

                     --level;
                     unionTecPlaceModel = (UnionTecPlaceModel)((Map)customTecPlaceModelMap.get(unionTechnologyPlaceData.place)).get(level);
                  }
               }
            }

            if (!this.player.checkResourceNum(resourceModel)) {
               this.player.failure(31);
            } else {
               this.player.delResource(resourceModel, 9, 927, type, 0, "");
               this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 9, 927, type, 0, "");
               super.getUnionMgr().initUnionMemberTechnology(technologyPlaceDataMap);
               ++playerUnionExtend.technologyResetCount;
               this.player.updatePlayerExtend(9);
               this.flushTechnology(type);
               UnionMsg.S2C_UnionResetTechnology_6944.Builder resp = UnionMsg.S2C_UnionResetTechnology_6944.newBuilder();
               resp.setType(type);
               this.player.sendMsg(resp.build());
               this.player.getOperationMgr().pushTask(() -> this.player.getOperationMgr().addExtraLog(this.player, 116, super.getUnion().unionName, String.valueOf(type), String.valueOf(returnCopper), String.valueOf(returnContribution), String.valueOf(resourceModel.getValue())));
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UnionLightTechnology_6957(UnionMsg.C2S_UnionLightTechnology_6957 msg, String source) {
      int id = msg.getId();
      int type = msg.getType();
      PlayerDao playerDao = this.player.getPlayerDao();
      if (!this.checkJoin()) {
         this.player.failure(23);
      } else {
         Map<Integer, Map<Integer, UnionTecModel>> unionTecModeMap = ApplicationContextProvider.<Integer, Map<Integer, UnionTecModel>>getModelPoolMap("customUnionTec");
         if (!unionTecModeMap.containsKey(type)) {
            this.player.failure(0);
         } else {
            UnionTecPlaceModel currentTecPlaceModel = (UnionTecPlaceModel)ApplicationContextProvider.getModelPoolEntity("unionTecPlace", id);
            if (currentTecPlaceModel == null) {
               this.player.failure(0);
            } else {
               int tecPlace = currentTecPlaceModel.getTecPlace();
               PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);
               UnionTechnologyPlaceData currentPlaceData = (UnionTechnologyPlaceData)((Map)playerUnionExtend.technology.get(type)).get(tecPlace);
               if (currentPlaceData.isLight) {
                  this.player.failure(9014);
               } else if (currentPlaceData.modelId != id) {
                  this.player.failure(6);
               } else {
                  if (tecPlace > 1) {
                     UnionTechnologyPlaceData prevPlaceData = (UnionTechnologyPlaceData)((Map)playerUnionExtend.technology.get(type)).get(tecPlace - 1);
                     if (!prevPlaceData.isLight) {
                        this.player.failure(6);
                        return;
                     }
                  }

                  String[] levelLimitArr = this.configManager.getStr("unionTecLevelLimit").split("\\|");
                  int levelCompareMax = Integer.parseInt(levelLimitArr[0]);
                  int levelMax = Integer.parseInt(levelLimitArr[1]);
                  AtomicInteger currentMaxLevel = new AtomicInteger(0);
                  AtomicInteger currentMinLevel = new AtomicInteger(levelMax);
                  playerUnionExtend.technology.forEach((key, value) -> value.values().forEach((unionTechnologyPlaceData) -> {
                        UnionTecPlaceModel tecPlaceModel = (UnionTecPlaceModel)ApplicationContextProvider.getModelPoolEntity("unionTecPlace", unionTechnologyPlaceData.modelId);
                        if (tecPlaceModel.getTecLevel() > currentMaxLevel.get()) {
                           currentMaxLevel.set(tecPlaceModel.getTecLevel());
                        }

                        if (tecPlaceModel.getTecLevel() < currentMinLevel.get()) {
                           currentMinLevel.set(tecPlaceModel.getTecLevel());
                        }

                     }));
                  int levelCompare = currentMaxLevel.get() - currentMinLevel.get();
                  if (currentTecPlaceModel.getTecLevel() >= currentMaxLevel.get() && levelCompare != levelMax && levelCompare >= levelCompareMax) {
                     this.player.failure(9012);
                  } else {
                     int feeCopper = 0;
                     int feeContribution = 0;

                     for(ResourceModel resourceModel : currentTecPlaceModel.getConsumes()) {
                        if (resourceModel.getType() <= 0 || resourceModel.getId() <= 0 || resourceModel.getValue() <= -1) {
                           this.player.failure(0);
                           return;
                        }

                        if (resourceModel.getValue() > 0) {
                           if (!this.player.checkResourceNum(resourceModel)) {
                              this.player.failure(18);
                              return;
                           }

                           if (resourceModel.getType() == 1 && resourceModel.getId() == PlayerDefine.PLAYER_COPPER) {
                              feeCopper += resourceModel.getValue();
                           }

                           if (resourceModel.getType() == 1 && resourceModel.getId() == PlayerDefine.PLAYER_UNION_CONTRIBUTION) {
                              feeContribution += resourceModel.getValue();
                           }
                        }
                     }

                     currentTecPlaceModel.getConsumes().forEach((resourceModel) -> {
                        if (resourceModel.getValue() > 0) {
                           this.player.delResource(resourceModel.getType(), resourceModel.getId(), (long)resourceModel.getValue(), 9, 921, resourceModel.getId(), resourceModel.getValue(), "");
                        }

                     });
                     this.setTechnologyLevel(playerUnionExtend.technology, type, currentTecPlaceModel);
                     this.player.updatePlayerExtend(9);
                     this.flushTechnology(type);
                     this.player.triggerTask(502, 0, 1L, 1);
                     UnionMsg.S2C_UnionLightTechnology_6958.Builder resp = UnionMsg.S2C_UnionLightTechnology_6958.newBuilder();
                     resp.setResult(1);
                     resp.setId(id);
                     resp.setType(type);
                     this.player.sendMsg(resp.build());
                     this.player.getOperationMgr().pushTask(() -> this.player.getOperationMgr().addExtraLog(this.player, 115, super.getUnion().unionName, String.valueOf(type), String.valueOf(currentTecPlaceModel.getTecLevel()), String.valueOf(feeCopper), String.valueOf(feeContribution), String.valueOf(playerDao.union_contribution)));
                  }
               }
            }
         }
      }
   }

   private void setTechnologyLevel(Map<Integer, Map<Integer, UnionTechnologyPlaceData>> technology, int type, UnionTecPlaceModel unionTecPlaceModel) {
      Map<Integer, Map<Integer, UnionTecModel>> unionTecModeMap = ApplicationContextProvider.<Integer, Map<Integer, UnionTecModel>>getModelPoolMap("customUnionTec");
      if (technology != null && unionTecPlaceModel != null && unionTecModeMap.containsKey(type)) {
         String[] levelLimitArr = this.configManager.getStr("unionTecLevelLimit").split("\\|");
         int levelMax = Integer.parseInt(levelLimitArr[1]);
         ((UnionTechnologyPlaceData)((Map)technology.get(type)).get(unionTecPlaceModel.getTecPlace())).isLight = true;
         ((UnionTechnologyPlaceData)((Map)technology.get(type)).get(unionTecPlaceModel.getTecPlace())).modelId = unionTecPlaceModel.getId();
         boolean checkAllLight = ((Map)technology.get(type)).size() > 0 && ((Map)technology.get(type)).values().stream().allMatch((unionTechnologyPlaceData) -> unionTechnologyPlaceData.isLight);
         if (checkAllLight && unionTecPlaceModel.getTecLevel() < levelMax) {
            Map<Integer, Map<Integer, UnionTecPlaceModel>> customTecPlaceModelMap = ApplicationContextProvider.<Integer, Map<Integer, UnionTecPlaceModel>>getModelPoolMap("customUnionTecPlace");
            ((Map)technology.get(type)).forEach((key, value) -> {
               UnionTecPlaceModel placeNextLvModel = (UnionTecPlaceModel)((Map)customTecPlaceModelMap.get(key)).get(unionTecPlaceModel.getTecLevel() + 1);
               if (placeNextLvModel != null) {
                  value.modelId = placeNextLvModel.getId();
                  value.isLight = false;
               }

            });
         }
      }
   }

   public void gmSetTechnologyLevel(int type, int level) {
      PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);
      Map<Integer, Map<Integer, UnionTecPlaceModel>> unionTecPlaceModelMap = ApplicationContextProvider.<Integer, Map<Integer, UnionTecPlaceModel>>getModelPoolMap("customUnionTecPlace");
      unionTecPlaceModelMap.values().forEach((unionTecPlaceLevelMap) -> this.setTechnologyLevel(playerUnionExtend.technology, type, (UnionTecPlaceModel)unionTecPlaceLevelMap.get(level)));
      this.player.updatePlayerExtend(9);
      this.flushTechnology(type);
      this.sendInfo();
   }

   public void gmSetAllTechnologyLevel() {
      PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);
      if (playerUnionExtend.technology.isEmpty()) {
         UnionMgr unionMgr = (UnionMgr)ApplicationContextProvider.getContext().getBean(UnionMgr.class);
         unionMgr.initUnionMemberTechnology(this.player.getPlayerId());
      }

      Map<Integer, Map<Integer, UnionTecPlaceModel>> unionTecPlaceModelMap = ApplicationContextProvider.<Integer, Map<Integer, UnionTecPlaceModel>>getModelPoolMap("customUnionTecPlace");

      for(Map.Entry<Integer, Map<Integer, UnionTecPlaceModel>> entry : unionTecPlaceModelMap.entrySet()) {
         for(Map.Entry<Integer, UnionTecPlaceModel> subEntry : ((Map)entry.getValue()).entrySet()) {
            this.setTechnologyLevel(playerUnionExtend.technology, (Integer)subEntry.getKey(), (UnionTecPlaceModel)((Map)entry.getValue()).get(78));
         }
      }

      this.player.updatePlayerExtend(9);
   }

   @MsgHandlerAnno
   public void C2S_UnionTechnology_6959(UnionMsg.C2S_UnionTechnology_6959 msg, String source) {
      if (this.checkJoin()) {
         this.sendInfo();
      }
   }

   private void sendInfo() {
      UnionMsg.S2C_UnionTechnology_6960.Builder resp = UnionMsg.S2C_UnionTechnology_6960.newBuilder();
      PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);
      playerUnionExtend.technology.entrySet().forEach((entry) -> {
         UnionMsg.UnionTechnology.Builder technologyBuilder = UnionMsg.UnionTechnology.newBuilder();
         technologyBuilder.setType((Integer)entry.getKey());
         ((Map)entry.getValue()).values().forEach((unionTechnologyPlaceData) -> {
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
   }

   public Map<Integer, Integer> getTechnologyLevelScore() {
      Map<Integer, Integer> levelMap = new HashMap();
      PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);
      Map<Integer, Integer> propertyIdList = new HashMap();
      Map<Integer, GradingSystemModel> gradingSystemModel = this.player.getGameModelPool().getMap("gradingSystem");

      for(Map.Entry<Integer, GradingSystemModel> entry : gradingSystemModel.entrySet()) {
         if (((GradingSystemModel)entry.getValue()).getUnionTechnology() > 0) {
            propertyIdList.put(entry.getKey(), ((GradingSystemModel)entry.getValue()).getUnionTechnology());
         }
      }

      playerUnionExtend.technology.forEach((type, technologyMap) -> {
         int typeLevel = -1;

         for(UnionTechnologyPlaceData unionTechnologyPlaceData : technologyMap.values()) {
            UnionTecPlaceModel unionTecPlaceModel = (UnionTecPlaceModel)ApplicationContextProvider.getModelPoolEntity("unionTecPlace", unionTechnologyPlaceData.modelId);
            int placeLv = unionTecPlaceModel.getTecLevel();
            if (!unionTechnologyPlaceData.isLight) {
               --placeLv;
            }

            if (typeLevel == -1 || typeLevel > placeLv) {
               typeLevel = placeLv;
            }
         }

         int addScore = 0;

         for(Map.Entry<Integer, Integer> entry : propertyIdList.entrySet()) {
            UnionTechnologyPlaceData unionTechnologyPlaceData = (UnionTechnologyPlaceData)technologyMap.get(entry.getKey());
            UnionTecPlaceModel unionTecPlaceModel = (UnionTecPlaceModel)ApplicationContextProvider.getModelPoolEntity("unionTecPlace", unionTechnologyPlaceData.modelId);
            if (unionTecPlaceModel.getTecLevel() == typeLevel + 1 && unionTechnologyPlaceData.isLight) {
               addScore += (Integer)entry.getValue();
            }
         }

         int total = typeLevel * 19 + addScore;
         levelMap.put(type, total);
      });
      return levelMap;
   }

   public Map<Integer, List<PropertyModel>> getTechnologyPropertyAdditions() {
      Map<Integer, List<PropertyModel>> propertyModelsMap = new HashMap();
      if (!this.checkJoin()) {
         return propertyModelsMap;
      } else {
         Map<Integer, Map<Integer, UnionTecModel>> unionTecModeMap = ApplicationContextProvider.<Integer, Map<Integer, UnionTecModel>>getModelPoolMap("customUnionTec");
         PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);

         for(Map.Entry<Integer, Map<Integer, UnionTecModel>> entry : unionTecModeMap.entrySet()) {
            List<PropertyModel> propertyModels = new ArrayList();
            Map<Integer, UnionTecModel> unionTecPlaceModelMap = (Map)entry.getValue();
            Map<Integer, UnionTechnologyPlaceData> technologyPlaceDataMap = (Map)playerUnionExtend.technology.getOrDefault(entry.getKey(), new ConcurrentHashMap());

            for(UnionTechnologyPlaceData unionTechnologyPlaceData : technologyPlaceDataMap.values()) {
               UnionTecPlaceModel unionTecPlaceModel = (UnionTecPlaceModel)ApplicationContextProvider.getModelPoolEntity("unionTecPlace", unionTechnologyPlaceData.modelId);
               int level = unionTecPlaceModel.getTecLevel();
               if (!unionTechnologyPlaceData.isLight) {
                  --level;
               }

               if (level > 0) {
                  UnionTecModel unionTecModel = (UnionTecModel)unionTecPlaceModelMap.get(unionTecPlaceModel.getTecPlace());

                  for(PropertyModel propertyModel : unionTecModel.getProperties()) {
                     PropertyModel finalProperty = propertyModel.clone();
                     finalProperty.setValue(finalProperty.getValue() * (long)level);
                     propertyModels.add(finalProperty);
                  }
               }
            }

            propertyModelsMap.put(entry.getKey(), propertyModels);
         }

         return propertyModelsMap;
      }
   }

   public List<CommonMsg.UnionTechnologyLevelData> getTechnologyLevelDataListMsg() {
      List<CommonMsg.UnionTechnologyLevelData> unionTechnologyLevelDataList = new ArrayList();
      PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);
      playerUnionExtend.technology.forEach((type, technologyMap) -> {
         int typeLevel = -1;

         for(UnionTechnologyPlaceData unionTechnologyPlaceData : technologyMap.values()) {
            UnionTecPlaceModel unionTecPlaceModel = (UnionTecPlaceModel)ApplicationContextProvider.getModelPoolEntity("unionTecPlace", unionTechnologyPlaceData.modelId);
            int placeLv = unionTecPlaceModel.getTecLevel();
            if (!unionTechnologyPlaceData.isLight) {
               --placeLv;
            }

            if (typeLevel == -1 || typeLevel > placeLv) {
               typeLevel = placeLv;
            }
         }

         CommonMsg.UnionTechnologyLevelData.Builder msg = CommonMsg.UnionTechnologyLevelData.newBuilder();
         msg.setType(type);
         msg.setLevel(Math.max(typeLevel, 0));
         unionTechnologyLevelDataList.add(msg.build());
      });
      return unionTechnologyLevelDataList;
   }

   private void flushTechnology(int type) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.setProperty_union_skill_map(this.getTechnologyPropertyAdditions(), this.getTechnologyLevelScore());
      heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_UNION_SKILL, type);
   }

   public void flushTechnology() {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.setProperty_union_skill_map(this.getTechnologyPropertyAdditions(), this.getTechnologyLevelScore());
      heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_UNION_SKILL);
   }
}
