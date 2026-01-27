package com.gzbz.gamePlayer.stoneCircle;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.StoneCircleDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.db.bean.MapEventData;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.stoneCircle.bean.EmployHeroData;
import com.gzbz.gamePlayer.stoneCircle.bean.EventData;
import com.gzbz.gamePlayer.stoneCircle.bean.MapLocation;
import com.gzbz.model.StoneCircleEventModel;
import com.gzbz.model.StoneCircleMapModel;
import com.gzbz.model.StoneCircleModel;
import com.gzbz.model.StoneCircleSecretEventModel;
import com.gzbz.model.StoneCircleShopModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.StoneCircleMsg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import misc.MapUtil;
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
public class StoneCirclePart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(StoneCirclePart.class);
   @Autowired
   private HeroRankMgr heroRankMgr;
   public static final int EVENT_TP = 1;
   public static final int EVENT_MONSTER = 2;
   public static final int EVENT_RESOURCE = 3;
   public static final int EVENT_SHOP = 4;
   public static final int EVENT_RECOVER = 5;
   public static final int EVENT_ALTAR = 6;
   public static final int EVENT_SPECIAL = 7;
   public static final int EVENT_BOSS = 9;
   public static final int EVENT_SPECIAL_BOSS = 10;

   @MsgHandlerAnno
   public void C2S_StoneCircleInfo_5801(StoneCircleMsg.C2S_StoneCircleInfo_5801 msg, String source) {
      StoneCircleDao circleDao = this.getCircleDao();
      StoneCircleMsg.S2C_StoneCircleInfo_5802.Builder builder = StoneCircleMsg.S2C_StoneCircleInfo_5802.newBuilder();
      builder.setSpiritNum(circleDao.spiritNum);
      builder.setStage(circleDao.stageId);

      for(Map.Entry<Integer, Float> entry : circleDao.heroHp.entrySet()) {
         StoneCircleMsg.HpData.Builder hp = StoneCircleMsg.HpData.newBuilder();
         hp.setCode((Integer)entry.getKey());
         hp.setHp((Float)entry.getValue());
         builder.addHpData(hp);
      }

      builder.addAllMySupport(circleDao.supportHero);

      for(EmployHeroData employHero : circleDao.employHero) {
         StoneCircleMsg.EmployInfo.Builder employ = StoneCircleMsg.EmployInfo.newBuilder();
         employ.setPlayerId(employHero.playerId);
         employ.setHeroInfo(employHero.heroMirror.toBuilder());
         employ.setHp(employHero.hp);
         builder.addEmployInfo(employ);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_StoneMapInfo_5803(StoneCircleMsg.C2S_StoneMapInfo_5803 msg, String source) {
      this.player.sendMsg(this.packMapInfo());
   }

   @MsgHandlerAnno
   public void C2S_BattleEvent_5805(StoneCircleMsg.C2S_BattleEvent_5805 msg, String source) {
      if (this.checkEvent(msg.getPosition().getMapGrid(), msg.getPosition().getMapCell(), msg.getEventId())) {
         StoneCircleEventModel eventModel = (StoneCircleEventModel)this.player.getGameModelPool().getEntity("stoneCycleEvent", msg.getEventId());
         if (eventModel != null) {
            StoneCircleDao circleDao = this.getCircleDao();
            int battleId = (Integer)eventModel.getParam().get(1);
            BattlePKTeam rightTeam = new BattlePKTeam(battleId);
            PlayerDao playerDao = this.player.getPlayerDao();
            HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
            ArrayingMirror arrayingMirror = heroArrayingPart.getArrayingMirrorByType(CommonMsg.HeroState.HERO_STATE_STONE_CIRCLE);
            BattlePKTeam leftTeam = new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, false));
            Iterator<Entity> it1 = leftTeam.getEntityMap().values().iterator();

            while(it1.hasNext()) {
               Entity entity = (Entity)it1.next();
               float curHp = (Float)circleDao.heroHp.getOrDefault(entity.getHeroCode(), 1.0F);
               if (curHp <= 0.0F) {
                  it1.remove();
               } else {
                  entity.setBaseProperty(99, (long)((float)entity.getBaseProperty(1) * curHp));
               }
            }

            if (leftTeam.getFriendEntity() != null) {
               float curHp = (Float)circleDao.heroHp.getOrDefault(leftTeam.getFriendEntity().getHeroCode(), 1.0F);
               if (curHp <= 0.0F) {
                  leftTeam.setFriendEntity((Entity)null);
               } else {
                  leftTeam.getFriendEntity().setBaseProperty(99, (long)((float)leftTeam.getFriendEntity().getBaseProperty(1) * curHp));
               }
            }

            for(Map.Entry<Integer, EmployHeroData> entry : circleDao.arraying.entrySet()) {
               HeroMirror heroMirror = ((EmployHeroData)entry.getValue()).heroMirror;
               if ((Integer)entry.getKey() == 5) {
                  Entity entity = new Entity(BattleMsg.EntityType.EntityType_Friend, heroMirror);
                  leftTeam.setFriendEntity(entity);
                  float curHp = ((EmployHeroData)entry.getValue()).hp;
                  if (curHp <= 0.0F) {
                     leftTeam.setFriendEntity((Entity)null);
                  } else {
                     leftTeam.getFriendEntity().setBaseProperty(99, (long)((float)leftTeam.getFriendEntity().getBaseProperty(1) * curHp));
                  }
               } else {
                  float curHp = ((EmployHeroData)entry.getValue()).hp;
                  if (!(curHp <= 0.0F)) {
                     Entity entity = new Entity(BattleMsg.EntityType.EntityType_Hero, heroMirror);
                     leftTeam.getEntityMap().put(((Integer)entry.getKey()).byteValue(), entity);
                     entity.setBaseProperty(99, (long)((float)entity.getBaseProperty(1) * curHp));
                  }
               }
            }

            BattleScene battleScene = new BattleScene(3070, 1);
            battleScene.addPKTeam((byte)0, leftTeam);
            battleScene.addPKTeam((byte)1, rightTeam);
            BattleMsg.S2C_BattleResult_6102.Builder fight = battleScene.fight((byte)15);
            this.player.sendMsg(fight.build());

            for(Map.Entry<Byte, Entity> entry : leftTeam.getEntityMap().entrySet()) {
               Entity entity = (Entity)entry.getValue();
               if (circleDao.arraying.containsKey(entry.getValue())) {
                  long curHP = entity.getBaseProperty(99);
                  long maxHP = entity.getBaseProperty(1);
                  ((EmployHeroData)circleDao.arraying.get(entry.getValue())).hp = (float)curHP * 1.0F / (float)maxHP;
               } else {
                  long curHP = entity.getBaseProperty(99);
                  long maxHP = entity.getBaseProperty(1);
                  circleDao.heroHp.put(entity.getHeroCode(), (float)curHP * 1.0F / (float)maxHP);
               }
            }

            StoneCircleMsg.S2C_BattleEvent_5806.Builder builder = StoneCircleMsg.S2C_BattleEvent_5806.newBuilder();

            for(EventData eventData : circleDao.mapData.eventList) {
               if (eventData.location.grid == msg.getPosition().getMapGrid() && eventData.location.cell == msg.getPosition().getMapCell()) {
                  if (battleScene.getWinForce() == 0) {
                     eventData.end = true;
                  }

                  builder.setMapEvent(eventData.builder());
                  this.player.sendMsg(builder.build());
                  break;
               }
            }

            circleDao.updateOp();
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TpEvent_5807(StoneCircleMsg.C2S_TpEvent_5807 msg, String source) {
      StoneCircleEventModel eventModel = (StoneCircleEventModel)this.player.getGameModelPool().getEntity("stoneCycleEvent", msg.getEventId());
      if (eventModel != null) {
         StoneCircleDao circleDao = this.getCircleDao();
         if (eventModel.getEventType() != 7) {
            if (eventModel.getEventType() == 8) {
               List<KeyValFun> funList = new ArrayList();
               String[] args = eventModel.getArgs().split("\\|");

               for(int i = 0; i < eventModel.getParam().size(); ++i) {
                  funList.add(new KeyValFun((Integer)eventModel.getParam().get(i), Integer.parseInt(args[i])));
               }

               int tpStage = countRate(funList);
               int realStage = tpStage + circleDao.stageId;
               MapEventData data = this.createMap(realStage);
               circleDao.mapData = data;
               circleDao.updateOp();
            } else {
               if (circleDao.mapData.isShow < 2) {
                  this.logger.error("未打死boss");
                  return;
               }

               if (circleDao.mapData.myLocation.cell != circleDao.mapData.bossLocation) {
                  this.logger.error("未在boss位置");
                  return;
               }

               if (circleDao.spiritNum < (Integer)eventModel.getParam().get(1)) {
                  this.logger.error("体力不足");
                  return;
               }

               int tpStage = (Integer)eventModel.getParam().get(0);
               int realStage = tpStage + circleDao.stageId;
               MapEventData data = this.createMap(realStage);
               circleDao.mapData = data;
               circleDao.spiritNum -= (Integer)eventModel.getParam().get(1);
               circleDao.updateOp();
            }
         }

         StoneCircleMsg.S2C_TpEvent_5808.Builder builder = StoneCircleMsg.S2C_TpEvent_5808.newBuilder();
         builder.setNextInfo(this.packMapInfo());
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_RecoverEvent_5811(StoneCircleMsg.C2S_RecoverEvent_5811 msg, String source) {
      if (this.checkEvent(msg.getPosition().getMapGrid(), msg.getPosition().getMapCell(), msg.getEventId())) {
         StoneCircleEventModel eventModel = (StoneCircleEventModel)this.player.getGameModelPool().getEntity("stoneCycleEvent", msg.getEventId());
         if (eventModel != null) {
            EventData data = null;
            StoneCircleDao circleDao = this.getCircleDao();

            for(EventData eventData : circleDao.mapData.eventList) {
               if (msg.getPosition().getMapGrid() == eventData.location.grid && msg.getPosition().getMapCell() == eventData.location.cell && msg.getEventId() == eventData.eventId) {
                  if (eventData.end) {
                     this.logger.error("该事件已经完成");
                     return;
                  }

                  data = eventData;
               }
            }

            if (eventModel.getParam().size() == 1) {
               List<Integer> heroList = new ArrayList();
               HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
               ArrayingMirror arrayingMirror = heroArrayingPart.getArrayingMirrorByType(CommonMsg.HeroState.HERO_STATE_DEMON_BOSS);

               for(ArrayingEntity entity : arrayingMirror.arrayingElementsMap.values()) {
                  if (circleDao.heroHp.containsKey(entity.code)) {
                     heroList.add(entity.code);
                  }
               }

               for(Integer heroCode : heroList) {
                  float hp = (Float)circleDao.heroHp.get(heroCode);
                  if (hp != 0.0F) {
                     float realHp = hp + (float)((Integer)eventModel.getParam().get(0) / 10000) > 1.0F ? 1.0F : hp + (float)((Integer)eventModel.getParam().get(0) / 10000);
                     circleDao.heroHp.put(heroCode, realHp);
                  }
               }

               if (circleDao.arraying.isEmpty()) {
                  for(Map.Entry<Integer, EmployHeroData> employHeroDataEntry : circleDao.arraying.entrySet()) {
                     EmployHeroData employHeroData = (EmployHeroData)employHeroDataEntry.getValue();
                     if (employHeroData.hp > 0.0F) {
                        float realHp = employHeroData.hp + (float)((Integer)eventModel.getParam().get(0) / 10000) > 1.0F ? 1.0F : employHeroData.hp + (float)((Integer)eventModel.getParam().get(0) / 10000);
                        employHeroData.hp = realHp;

                        for(EmployHeroData employHero : circleDao.employHero) {
                           if (employHero.playerId == employHeroData.playerId && employHero.heroMirror.code == employHeroData.heroMirror.code) {
                              employHero.hp = realHp;
                              break;
                           }
                        }
                     }
                  }
               }
            } else {
               int heroCode = 0;

               for(Map.Entry<Integer, Float> entry : circleDao.heroHp.entrySet()) {
                  if ((Float)entry.getValue() == 0.0F) {
                     heroCode = (Integer)entry.getKey();
                     break;
                  }
               }

               if (heroCode > 0) {
                  circleDao.heroHp.put(heroCode, 1.0F);
               } else {
                  List<Integer> heroList = new ArrayList();
                  HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
                  ArrayingMirror arrayingMirror = heroArrayingPart.getArrayingMirrorByType(CommonMsg.HeroState.HERO_STATE_DEMON_BOSS);

                  for(ArrayingEntity entity : arrayingMirror.arrayingElementsMap.values()) {
                     if (circleDao.heroHp.containsKey(entity.code) && (Float)circleDao.heroHp.get(entity.code) < 1.0F) {
                        heroList.add(entity.code);
                     }
                  }

                  if (heroList.isEmpty()) {
                     for(EmployHeroData employHeroData : circleDao.arraying.values()) {
                        if (employHeroData.hp != 0.0F && employHeroData.hp != 1.0F) {
                           float realHp = employHeroData.hp + (float)((Integer)eventModel.getParam().get(1) / 10000) > 1.0F ? 1.0F : employHeroData.hp + (float)((Integer)eventModel.getParam().get(1) / 10000);
                           employHeroData.hp = realHp;
                           break;
                        }
                     }
                  } else {
                     int maxHero = heroList.size() + circleDao.arraying.size();
                     int rand = RandomUtil.randInt(1, maxHero + 1);
                     if (rand <= heroList.size()) {
                        int realCode = (Integer)heroList.get(RandomUtil.randInt(0, heroList.size()));
                        float realHp = (Float)circleDao.heroHp.get(realCode) + (float)((Integer)eventModel.getParam().get(1) / 10000) > 1.0F ? 1.0F : (Float)circleDao.heroHp.get(realCode) + (float)((Integer)eventModel.getParam().get(1) / 10000);
                        circleDao.heroHp.put(realCode, realHp);
                     } else {
                        for(EmployHeroData employHeroData : circleDao.arraying.values()) {
                           if (employHeroData.hp != 0.0F && employHeroData.hp != 1.0F) {
                              float realHp = employHeroData.hp + (float)((Integer)eventModel.getParam().get(1) / 10000) > 1.0F ? 1.0F : employHeroData.hp + (float)((Integer)eventModel.getParam().get(1) / 10000);
                              employHeroData.hp = realHp;
                              break;
                           }
                        }
                     }
                  }
               }
            }

            circleDao.updateOp();
            StoneCircleMsg.S2C_RecoverEvent_5812.Builder builder = StoneCircleMsg.S2C_RecoverEvent_5812.newBuilder();

            for(Map.Entry<Integer, Float> entry : circleDao.heroHp.entrySet()) {
               StoneCircleMsg.HpData.Builder hp = StoneCircleMsg.HpData.newBuilder();
               hp.setCode((Integer)entry.getKey());
               hp.setHp((Float)entry.getValue());
               builder.addHeroHp(hp);
            }

            for(EmployHeroData employHero : circleDao.employHero) {
               StoneCircleMsg.EmployInfo.Builder employ = StoneCircleMsg.EmployInfo.newBuilder();
               employ.setPlayerId(employHero.playerId);
               employ.setHeroInfo(employHero.heroMirror.toBuilder());
               employ.setHp(employHero.hp);
               builder.addEmployInfo(employ);
            }

            builder.setMapEvent(data.builder());
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ShopEvent_5813(StoneCircleMsg.C2S_ShopEvent_5813 msg, String source) {
      if (!this.checkEvent(msg.getPosition().getMapGrid(), msg.getPosition().getMapCell(), msg.getEventId())) {
         this.logger.error("完成事件有问题：" + msg.getPosition().getMapGrid() + "--" + msg.getPosition().getMapCell() + "--" + msg.getEventId());
      } else {
         StoneCircleDao stoneCircleDao = this.getCircleDao();
         EventData event = null;

         for(EventData eventData : stoneCircleDao.mapData.eventList) {
            if (!eventData.end && eventData.location.grid == msg.getPosition().getMapGrid() && eventData.location.cell == msg.getPosition().getMapCell()) {
               event = eventData;
               if (!eventData.goods.containsKey(msg.getShopInx())) {
                  return;
               }

               if ((Boolean)eventData.goods.get(msg.getShopInx())) {
                  this.logger.info("该商品已经被购买");
                  return;
               }
               break;
            }
         }

         StoneCircleShopModel shopModel = (StoneCircleShopModel)this.player.getGameModelPool().getEntity("stoneCircleShop", msg.getShopInx());
         if (shopModel != null) {
            if (!this.player.checkResourceNum(shopModel.getResourceType(), shopModel.getResourceId(), shopModel.getDisPrice())) {
               this.logger.info("购买道具不足");
            } else {
               this.player.delResource(shopModel.getResourceType(), shopModel.getResourceId(), (long)shopModel.getDisPrice(), 67, 856, 0, 0, "");
               this.player.addResource(shopModel.getItemType(), shopModel.getItemId(), shopModel.getCombineNum(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 67, 856, 0, 0, "");
               event.goods.put(msg.getShopInx(), true);
               stoneCircleDao.updateOp();
               StoneCircleMsg.S2C_ShopEvent_5814.Builder builder = StoneCircleMsg.S2C_ShopEvent_5814.newBuilder();
               builder.setShopEvent(event.builder());
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_LightMap_5817(StoneCircleMsg.C2S_LightMap_5817 msg, String source) {
      StoneCircleDao circleDao = this.getCircleDao();
      circleDao.mapData.myLocation.grid = msg.getPosition().getMapGrid();
      circleDao.mapData.myLocation.cell = msg.getPosition().getMapCell();
      if (circleDao.mapData.isShow == 0) {
         for(StoneCircleMsg.MapIdentify light : msg.getLightList()) {
            boolean flag = false;

            for(MapLocation location : circleDao.mapData.lightList) {
               if (location.grid == light.getMapGrid() && location.cell == light.getMapCell()) {
                  flag = true;
                  break;
               }
            }

            if (!flag) {
               circleDao.mapData.lightList.add(new MapLocation(light.getMapGrid(), light.getMapCell()));
            }
         }
      }

      circleDao.updateOp();
      StoneCircleMsg.S2C_LightMap_5818.Builder builder = StoneCircleMsg.S2C_LightMap_5818.newBuilder();
      builder.setPosition(msg.getPosition());
      builder.addAllLight(msg.getLightList());
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_SaveArraying_5819(StoneCircleMsg.C2S_SaveArraying_5819 msg, String source) {
      StoneCircleDao circleDao = this.getCircleDao();
      circleDao.arraying.clear();

      for(StoneCircleMsg.ExtraArraying extra : msg.getExtraHeroList()) {
         for(EmployHeroData employHero : circleDao.employHero) {
            if (extra.getPlayerId() == employHero.playerId && extra.getHeroCode() == employHero.heroMirror.code && employHero.hp != 0.0F) {
               circleDao.arraying.put(extra.getPosition(), employHero);
               break;
            }
         }
      }

      circleDao.updateOp();
      StoneCircleMsg.S2C_SaveArraying_5820.Builder builder = StoneCircleMsg.S2C_SaveArraying_5820.newBuilder();

      for(Map.Entry<Integer, EmployHeroData> entry : circleDao.arraying.entrySet()) {
         StoneCircleMsg.Arraying.Builder arrayBuilder = StoneCircleMsg.Arraying.newBuilder();
         arrayBuilder.setPosition((Integer)entry.getKey());
         StoneCircleMsg.EmployInfo.Builder employ = StoneCircleMsg.EmployInfo.newBuilder();
         employ.setHp(((EmployHeroData)entry.getValue()).hp);
         employ.setHeroInfo(((EmployHeroData)entry.getValue()).heroMirror.toBuilder());
         employ.setPlayerId(((EmployHeroData)entry.getValue()).playerId);
         arrayBuilder.setEmployInfo(employ);
         builder.addArraying(arrayBuilder);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ExtraArraying_5821(StoneCircleMsg.C2S_ExtraArraying_5821 msg, String source) {
      StoneCircleDao circleDao = this.getCircleDao();
      StoneCircleMsg.S2C_ExtraArraying_5822.Builder builder = StoneCircleMsg.S2C_ExtraArraying_5822.newBuilder();

      for(Map.Entry<Integer, EmployHeroData> entry : circleDao.arraying.entrySet()) {
         StoneCircleMsg.Arraying.Builder arrayBuilder = StoneCircleMsg.Arraying.newBuilder();
         arrayBuilder.setPosition((Integer)entry.getKey());
         StoneCircleMsg.EmployInfo.Builder employ = StoneCircleMsg.EmployInfo.newBuilder();
         employ.setHp(((EmployHeroData)entry.getValue()).hp);
         employ.setHeroInfo(((EmployHeroData)entry.getValue()).heroMirror.toBuilder());
         employ.setPlayerId(((EmployHeroData)entry.getValue()).playerId);
         arrayBuilder.setEmployInfo(employ);
         builder.addArraying(arrayBuilder);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_FinishCommonEvent_5826(StoneCircleMsg.C2S_FinishCommonEvent_5826 msg, String source) {
      if (!this.checkEvent(msg.getPosition().getMapGrid(), msg.getPosition().getMapCell(), msg.getEventId())) {
         this.logger.error("完成事件有问题：" + msg.getPosition().getMapGrid() + "--" + msg.getPosition().getMapCell() + "--" + msg.getEventId());
      } else {
         StoneCircleEventModel eventModel = (StoneCircleEventModel)this.player.getGameModelPool().getEntity("stoneCycleEvent", msg.getEventId());
         if (eventModel != null) {
            StoneCircleDao circleDao = this.getCircleDao();
            EventData data = null;
            if (msg.getPosition().getMapGrid() > 0) {
               for(EventData eventData : circleDao.mapData.eventList) {
                  if (eventData.location.grid == msg.getPosition().getMapGrid() && eventData.location.cell == msg.getPosition().getMapCell()) {
                     data = eventData;
                     break;
                  }
               }
            } else {
               for(EventData eventData : circleDao.mapData.specialEvent) {
                  if (eventData.location.grid == msg.getPosition().getMapGrid() && eventData.location.cell == msg.getPosition().getMapCell()) {
                     data = eventData;
                     break;
                  }
               }
            }

            if (eventModel.getEventType() == 3) {
               if (data.end) {
                  return;
               }

               data.end = true;
               this.player.addResource((Integer)eventModel.getParam().get(0), (Integer)eventModel.getParam().get(1), (Integer)eventModel.getParam().get(2), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 67, 856, 0, 0, "");
            } else if (eventModel.getEventType() == 7) {
               Map<Integer, StoneCircleSecretEventModel> modelMap = this.player.getGameModelPool().getMap("stoneCircleSecretEvent");
               int startPos = 0;

               for(StoneCircleSecretEventModel model : modelMap.values()) {
                  if (model.getUnitType() == -1) {
                     startPos = model.getId();
                     break;
                  }
               }

               circleDao.mapData.enterSpecial = true;
               circleDao.mapData.myLocation.grid = 0;
               circleDao.mapData.myLocation.cell = startPos;
               data.end = true;
            }

            circleDao.updateOp();
            StoneCircleMsg.S2C_FinishCommonEvent_5827.Builder builder = StoneCircleMsg.S2C_FinishCommonEvent_5827.newBuilder();
            builder.setCommonEvent(data.builder());
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SupportHero_5828(StoneCircleMsg.C2S_SupportHero_5828 msg, String source) {
      StoneCircleDao circleDao = this.getCircleDao();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao != null) {
         circleDao.supportHero.add(msg.getHeroCode());
      }

      StoneCircleMsg.S2C_SupportHero_5829.Builder builder = StoneCircleMsg.S2C_SupportHero_5829.newBuilder();
      builder.addAllSupportHero(circleDao.supportHero);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_LeaveEvent_5830(StoneCircleMsg.C2S_LeaveEvent_5830 msg, String source) {
      if (!this.checkEvent(msg.getPosition().getMapGrid(), msg.getPosition().getMapCell(), msg.getEventId())) {
         this.logger.error("完成事件有问题：" + msg.getPosition().getMapGrid() + "--" + msg.getPosition().getMapCell() + "--" + msg.getEventId());
      } else {
         StoneCircleEventModel eventModel = (StoneCircleEventModel)this.player.getGameModelPool().getEntity("stoneCycleEvent", msg.getEventId());
         if (eventModel != null) {
            if (eventModel.getEventType() == 3 || eventModel.getEventType() == 4 || eventModel.getEventType() == 5) {
               StoneCircleDao circleDao = this.getCircleDao();
               EventData data = null;
               if (msg.getPosition().getMapGrid() > 0) {
                  for(EventData eventData : circleDao.mapData.eventList) {
                     if (eventData.location.grid == msg.getPosition().getMapGrid() && eventData.location.cell == msg.getPosition().getMapCell()) {
                        data = eventData;
                        break;
                     }
                  }
               } else {
                  for(EventData eventData : circleDao.mapData.specialEvent) {
                     if (eventData.location.grid == msg.getPosition().getMapGrid() && eventData.location.cell == msg.getPosition().getMapCell()) {
                        data = eventData;
                        break;
                     }
                  }
               }

               data.end = true;
               circleDao.updateOp();
               StoneCircleMsg.S2C_LeaveEvent_5831.Builder builder = StoneCircleMsg.S2C_LeaveEvent_5831.newBuilder();
               builder.setLeaveEvent(data.builder());
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   public StoneCircleDao getCircleDao() {
      StoneCircleDao stoneCircleDao = (StoneCircleDao)this.player.getData("tb_stone_circle", this.player.getPlayerId());
      if (stoneCircleDao.stageId == 0 || stoneCircleDao.mapData == null) {
         stoneCircleDao.stageId = 1;
         MapEventData data = this.createMap(stoneCircleDao.stageId);
         stoneCircleDao.mapData = data;
         long time = DateUtil.getSomeDayBeginTime(System.currentTimeMillis());
         stoneCircleDao.resetTime = time;
         stoneCircleDao.spiritNum = 1111;
         stoneCircleDao.updateOp();
      }

      return stoneCircleDao;
   }

   public StoneCircleMsg.S2C_StoneMapInfo_5804 packMapInfo() {
      StoneCircleDao circleDao = this.getCircleDao();
      StoneCircleMsg.S2C_StoneMapInfo_5804.Builder builder = StoneCircleMsg.S2C_StoneMapInfo_5804.newBuilder();
      builder.setSpiritNum(circleDao.spiritNum);
      builder.setStage(circleDao.stageId);
      StoneCircleMsg.MapIdentify.Builder mapBuilder = StoneCircleMsg.MapIdentify.newBuilder();
      mapBuilder.setMapGrid(circleDao.mapData.myLocation.grid);
      mapBuilder.setMapCell(circleDao.mapData.myLocation.cell);
      builder.setPosition(mapBuilder);
      builder.addAllExtraGrid(circleDao.mapData.extraGrid);

      for(EventData eventData : circleDao.mapData.eventList) {
         if (!eventData.end) {
            builder.addMapEvent(eventData.builder());
         }
      }

      for(MapLocation lightLocation : circleDao.mapData.lightList) {
         StoneCircleMsg.MapIdentify.Builder lightBuilder = StoneCircleMsg.MapIdentify.newBuilder();
         lightBuilder.setMapGrid(lightLocation.grid);
         lightBuilder.setMapCell(lightLocation.cell);
         builder.addLightPosition(lightBuilder);
      }

      builder.setBossMapGrid(circleDao.mapData.bossBlock);
      builder.setBossLocation(circleDao.mapData.bossLocation);

      for(EventData eventData : circleDao.mapData.specialEvent) {
         builder.addBossEvent(eventData.builder());
      }

      builder.setIsShow(circleDao.mapData.isShow);
      return builder.build();
   }

   public boolean checkEvent(int mapGrid, int mapCell, int eventId) {
      StoneCircleDao stoneCircleDao = this.getCircleDao();
      if (mapGrid <= 0) {
         for(EventData eventData : stoneCircleDao.mapData.specialEvent) {
            if (eventData.location.grid == mapGrid && eventData.location.cell == mapCell) {
               if (eventData.eventId != eventId) {
                  return false;
               }
               break;
            }
         }
      } else {
         for(EventData eventData : stoneCircleDao.mapData.eventList) {
            if (eventData.location.grid == mapGrid && eventData.location.cell == mapCell) {
               if (eventData.eventId != eventId) {
                  return false;
               }
               break;
            }
         }
      }

      return true;
   }

   public void resetDaily() {
   }

   public void resetWeek() {
   }

   public void gmOp(String gmOp) {
      StoneCircleDao circleDao = this.getCircleDao();
      String[] op = gmOp.split(",");
      if (Integer.parseInt(op[0]) == 1) {
         circleDao.spiritNum = 111;
      } else if (Integer.parseInt(op[0]) == 2) {
         circleDao.stageId = Integer.parseInt(op[1]);
         circleDao.mapData = this.createMap(circleDao.stageId);
      } else if (Integer.parseInt(op[0]) == 3) {
         circleDao.mapData.isShow = 1;
      }

      circleDao.updateOp();
   }

   public MapEventData createMap(int stage) {
      MapEventData data = new MapEventData();
      data.stage = stage;
      StoneCircleModel model = (StoneCircleModel)this.player.getGameModelPool().getEntity("stoneCircle", stage);
      if (model == null) {
         this.logger.error("奇兵八阵当前关卡错误:" + stage);
         model = (StoneCircleModel)this.player.getGameModelPool().getEntity("stoneCircle", 1);
      }

      data.extraGrid = this.getExtraGrid(model);
      this.getBossLocation(data);
      this.createStartLocation(data, model);
      data.lightList.add(data.myLocation);
      data.eventList.addAll(this.getEventList(model, data));
      return data;
   }

   public void createStartLocation(MapEventData data, StoneCircleModel model) {
      List<Integer> blockList = new ArrayList();
      String[] lastMapRange = model.getLastMapRange().split("\\|");

      for(int i = Integer.parseInt(lastMapRange[0]); i <= Integer.parseInt(lastMapRange[1]); ++i) {
         blockList.add(i);
      }

      blockList.addAll(data.extraGrid);
      if (blockList.contains(data.bossBlock)) {
         blockList.remove(data.bossBlock);
      }

      if (blockList.isEmpty()) {
         data.myLocation = new MapLocation(1, 1);
      } else {
         int targetBlock = (Integer)blockList.get(RandomUtil.randInt(0, blockList.size()));
         StoneCircleMapModel mapModel = (StoneCircleMapModel)this.player.getGameModelPool().getEntity("stoneCircleMap", targetBlock);
         if (mapModel == null) {
            data.myLocation = new MapLocation(1, 1);
         } else {
            int cell = 0;

            for(int i = 0; i < mapModel.getBlock().size(); ++i) {
               if ((Integer)mapModel.getBlock().get(i) == mapModel.getStartBlock()) {
                  cell = i + 1;
                  break;
               }
            }

            if (cell == 0) {
               data.myLocation = new MapLocation(1, 1);
            } else {
               data.myLocation = new MapLocation(targetBlock, cell);
               this.logger.info("生成的出生点位置在：" + targetBlock + "--" + cell);
            }
         }
      }
   }

   public void getBossLocation(MapEventData data) {
      int bossLocation = 0;
      Map<Integer, StoneCircleMapModel> mapModelMap = this.player.getGameModelPool().getMap("stoneCircleMap");
      if (data.extraGrid.isEmpty()) {
         int randBlock = RandomUtil.randInt(1, 7);
         if (mapModelMap.containsKey(randBlock)) {
            String bossBlock = ((StoneCircleMapModel)mapModelMap.get(randBlock)).getBossBlock();
            data.bossBlock = randBlock;
            String[] block = bossBlock.split("\\|");
            int result = RandomUtil.randInt(0, block.length);
            bossLocation = Integer.parseInt(block[result]);
         } else {
            this.logger.error("boss格子数据有误：" + randBlock);
         }
      } else {
         int randBlock = (Integer)data.extraGrid.get(RandomUtil.randInt(0, data.extraGrid.size()));
         if (mapModelMap.containsKey(randBlock)) {
            data.bossBlock = randBlock;
            String bossBlock = ((StoneCircleMapModel)mapModelMap.get(randBlock)).getBossBlock();
            String[] block = bossBlock.split("\\|");
            int result = RandomUtil.randInt(0, block.length);
            bossLocation = Integer.parseInt(block[result]);
         } else {
            this.logger.error("boss格子数据有误：" + randBlock);
         }
      }

      this.createBossEvent(data, bossLocation);
      this.logger.info("生成的boss点位置在：" + data.bossBlock + "--" + bossLocation);
      data.bossLocation = bossLocation;
   }

   public List<Integer> getExtraGrid(StoneCircleModel model) {
      List<Integer> result = new ArrayList();
      List<Integer> list = new ArrayList();
      if (model.getExtraBlockNum() == 0) {
         return result;
      } else {
         if (model.getMapRange() != null && !model.getMapRange().equals("")) {
            String[] range = model.getMapRange().split("\\|");

            for(int i = Integer.parseInt(range[0]); i <= Integer.parseInt(range[1]); ++i) {
               list.add(i);
            }
         }

         Collections.shuffle(list);

         for(int i = 0; i < list.size() && i < model.getExtraBlockNum(); ++i) {
            result.add(list.get(i));
         }

         return result;
      }
   }

   public List<EventData> getEventList(StoneCircleModel model, MapEventData data) {
      List<EventData> eventList = new ArrayList();
      List<KeyValFun> weightList = new ArrayList();
      weightList.add(new KeyValFun(2, model.getMonsterUnitWeight()));
      weightList.add(new KeyValFun(3, model.getItemUnitWeight()));
      weightList.add(new KeyValFun(4, model.getShopUnitWeight()));
      weightList.add(new KeyValFun(5, model.getRecoverUnitWeight()));
      weightList.add(new KeyValFun(7, model.getSpecialUnitWeght()));
      Map<Integer, Integer> eventTypeMap = new HashMap();

      for(int i = 0; i < model.getEventLimit(); ++i) {
         int eventType = countRate(weightList);
         if (eventTypeMap.containsKey(eventType)) {
            int typeNum = MapUtil.mapPlusInt(eventTypeMap, eventType, 1);
            this.checkEventType(model, weightList, typeNum, eventType);
         } else {
            eventTypeMap.put(eventType, 1);
            this.checkEventType(model, weightList, 1, eventType);
         }
      }

      List<Integer> blockList = new ArrayList();
      int staticBlock = model.getGrounUnit() - model.getExtraBlockNum();

      for(int i = 1; i <= staticBlock; ++i) {
         blockList.add(i);
      }

      blockList.addAll(data.extraGrid);
      Map<Integer, Integer> blockMap = new HashMap();
      Map<Integer, List<Integer>> blockCellMap = new HashMap();
      List<Integer> eventTypeList = new ArrayList();

      for(Map.Entry<Integer, Integer> entry : eventTypeMap.entrySet()) {
         for(int i = 0; i < (Integer)entry.getValue(); ++i) {
            eventTypeList.add(entry.getKey());
         }
      }

      Collections.shuffle(eventTypeList);

      for(int i = 0; i < eventTypeList.size(); ++i) {
         int targetBlock = (Integer)blockList.get(RandomUtil.randInt(0, blockList.size()));
         List<Integer> cellList = new ArrayList();

         for(int cell = 1; cell <= 7; ++cell) {
            if ((!blockCellMap.containsKey(targetBlock) || !((List)blockCellMap.get(targetBlock)).contains(cell)) && (data.myLocation.grid != targetBlock || data.myLocation.cell != cell)) {
               cellList.add(cell);
            }
         }

         int targetCell = (Integer)cellList.get(RandomUtil.randInt(0, cellList.size()));
         if (blockCellMap.containsKey(targetBlock)) {
            ((List)blockCellMap.get(targetBlock)).add(targetCell);
         } else {
            List<Integer> tempList = new ArrayList();
            tempList.add(targetCell);
            blockCellMap.put(targetBlock, tempList);
         }

         int blockCellNum = MapUtil.mapPlusInt(blockMap, targetBlock, 1);
         if (blockCellNum >= model.getUnitEventLimit()) {
            blockList.remove(targetBlock);
         }

         EventData eventData = this.getEvent(data, targetBlock, targetCell, (Integer)eventTypeList.get(i), data.stage);
         eventList.add(eventData);
      }

      return eventList;
   }

   public EventData getEvent(MapEventData mapEventData, int targetBlock, int targetCell, int eventType, int curStage) {
      EventData data = new EventData();
      data.location = new MapLocation(targetBlock, targetCell);
      data.eventType = eventType;
      data.eventId = this.getEventId(eventType, mapEventData.stage);
      switch (eventType) {
         case 2:
         case 3:
         case 5:
         case 6:
         default:
            break;
         case 4:
            Map<Integer, StoneCircleShopModel> shopModelMap = this.player.getGameModelPool().getMap("stoneCircleShop");
            List<Integer> shopList = new ArrayList();

            for(StoneCircleShopModel model : shopModelMap.values()) {
               if (model.getShopType() == data.eventId && model.getAppearStage() <= curStage) {
                  shopList.add(model.getId());
               }
            }

            Collections.shuffle(shopList);

            for(int i = 0; i < shopList.size() && i <= 3; ++i) {
               data.goods.put(shopList.get(i), false);
            }
            break;
         case 7:
            this.createSpecialEvent(mapEventData);
      }

      return data;
   }

   public void createSpecialEvent(MapEventData data) {
      this.logger.info("生成了地图的神秘事件！");
      Map<Integer, StoneCircleSecretEventModel> secretEventModelMap = this.player.getGameModelPool().getMap("stoneCircleSecretEvent");

      for(StoneCircleSecretEventModel secretEventModel : secretEventModelMap.values()) {
         if (secretEventModel.getUnitType() > 0) {
            int eventId = this.getEventId(secretEventModel.getUnitType(), data.stage);
            EventData eventData = new EventData();
            eventData.location = new MapLocation(0, secretEventModel.getId());
            eventData.eventType = secretEventModel.getUnitType();
            eventData.eventId = eventId;
            data.specialEvent.add(eventData);
         }
      }

   }

   public void createBossEvent(MapEventData data, int bossLocation) {
      int eventId = this.getEventId(9, data.stage);
      EventData eventData = new EventData();
      eventData.location = new MapLocation(0, bossLocation);
      eventData.eventType = 9;
      eventData.eventId = eventId;
      data.specialEvent.add(eventData);
   }

   public int getEventId(int eventType, int curStage) {
      Map<Integer, StoneCircleEventModel> eventModelMap = this.player.getGameModelPool().getMap("stoneCycleEvent");
      List<StoneCircleEventModel> list = new ArrayList();

      for(StoneCircleEventModel eventModel : eventModelMap.values()) {
         String[] appear = eventModel.getAppearBlock().split("\\|");
         if (eventModel.getEventType() == eventType && Integer.parseInt(appear[0]) <= curStage && Integer.parseInt(appear[1]) >= curStage) {
            list.add(eventModel);
         }
      }

      if (list.isEmpty()) {
         this.logger.error("生成的事件id有错误：" + eventType);
         return 10;
      } else {
         int eventId = 0;
         if (list.size() == 1) {
            eventId = ((StoneCircleEventModel)list.get(0)).getId();
         } else {
            List<KeyValFun> funList = new ArrayList();

            for(StoneCircleEventModel model : list) {
               if (model.getUnitWeight() != 0) {
                  funList.add(new KeyValFun(model.getId(), model.getUnitWeight()));
               }
            }

            if (funList.isEmpty()) {
               eventId = ((StoneCircleEventModel)list.get(0)).getId();
            } else {
               eventId = countRate(funList);
            }
         }

         if (!eventModelMap.containsKey(eventId)) {
            this.logger.error("生成的事件id有错误：" + eventType);
            return 10;
         } else {
            return eventId;
         }
      }
   }

   public void checkEventType(StoneCircleModel model, List<KeyValFun> weightList, int typeNum, int eventType) {
      switch (eventType) {
         case 2:
            if (typeNum >= model.getMonsterUnitLimt()) {
               Iterator<KeyValFun> it = weightList.iterator();

               while(it.hasNext()) {
                  KeyValFun fun = (KeyValFun)it.next();
                  if (fun.getKey() == 2) {
                     it.remove();
                  }
               }
            }
            break;
         case 3:
            if (typeNum >= model.getItemUnitLimit()) {
               Iterator<KeyValFun> it = weightList.iterator();

               while(it.hasNext()) {
                  KeyValFun fun = (KeyValFun)it.next();
                  if (fun.getKey() == 3) {
                     it.remove();
                  }
               }
            }
            break;
         case 4:
            if (typeNum >= model.getShopUnitLimt()) {
               Iterator<KeyValFun> it = weightList.iterator();

               while(it.hasNext()) {
                  KeyValFun fun = (KeyValFun)it.next();
                  if (fun.getKey() == 4) {
                     it.remove();
                  }
               }
            }
            break;
         case 5:
            if (typeNum >= model.getRecoverUnitLimt()) {
               Iterator<KeyValFun> it = weightList.iterator();

               while(it.hasNext()) {
                  KeyValFun fun = (KeyValFun)it.next();
                  if (fun.getKey() == 5) {
                     it.remove();
                  }
               }
            }
         case 6:
         default:
            break;
         case 7:
            if (typeNum >= model.getSpecialUnitLimit()) {
               Iterator<KeyValFun> it = weightList.iterator();

               while(it.hasNext()) {
                  KeyValFun fun = (KeyValFun)it.next();
                  if (fun.getKey() == 7) {
                     it.remove();
                  }
               }
            }
      }

   }

   public static int countRate(List<KeyValFun> list) {
      if (list != null && !list.isEmpty()) {
         int maxRate = 0;

         for(KeyValFun fun : list) {
            if (fun.getVal() > 0) {
               maxRate += fun.getVal();
            }
         }

         int randInt = RandomUtil.randInt(maxRate);

         for(KeyValFun fun : list) {
            if (fun.getVal() > 0) {
               if (randInt < fun.getVal()) {
                  return fun.getKey();
               }

               randInt -= fun.getVal();
            }
         }

         return ((KeyValFun)list.get(0)).getKey();
      } else {
         return -1;
      }
   }
}
