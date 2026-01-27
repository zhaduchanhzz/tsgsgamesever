package com.gzbz.db.bean;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.gzbz.battle.entity.Monster;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.ArtifactDao;
import com.gzbz.db.ArtifactDressDao;
import com.gzbz.db.CooperateDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.MagicBookDao;
import com.gzbz.db.TongqueTerraceDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.arraying.ArtifactArrayingEntity;
import com.gzbz.db.arraying.AssistantBeauty;
import com.gzbz.db.arraying.BeautyArrayingEntity;
import com.gzbz.db.arraying.DragonArrayingEntity;
import com.gzbz.db.arraying.FriendArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.arraying.PetArrayingEntity;
import com.gzbz.db.arraying.PetMirror;
import com.gzbz.dragon.part.DragonStrengthenPart;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.pet.PetPart;
import com.gzbz.gamePlayer.playerBag.ArtifactDressPart;
import com.gzbz.gamePlayer.playerBag.ArtifactPart;
import com.gzbz.gamePlayer.tongque.TongqueTerracePart;
import com.gzbz.model.ArtifactModel;
import com.gzbz.model.ArtifactSkillGroupModel;
import com.gzbz.model.BattleModel;
import com.gzbz.model.DecisiveBattlRobotArrayModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.SupportHeroModel;
import com.gzbz.model.TongQueSkillModel;
import com.gzbz.model.fun.BattleMonsterFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

public class ArrayingMirror implements Serializable {
   static Logger logger = LoggerFactory.getLogger(ArrayingMirror.class);
   public int playerId;
   public int arrayingType;
   public long power;
   public int friendNation;
   public int friendState;
   public Map<Byte, ArrayingEntity> arrayingElementsMap = new HashMap();
   public boolean hide;
   public int friendJob;
   public int soulHeroId;
   public int soulHeroCode;

   public ArrayingMirror(long power, Map<Byte, ArrayingEntity> arrayingElementsMap) {
      this.arrayingType = CommonMsg.HeroState.HERO_STATE_ARRAYING.getNumber();
      this.power = power;
      this.arrayingElementsMap = arrayingElementsMap;
   }

   public ArrayingMirror() {
   }

   public ArrayingMirror(int battleId) {
      BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", battleId);
      if (battleModel == null) {
         throw new RuntimeException("生成pkteam时未找到战斗id:" + battleId);
      } else {
         for(BattleMonsterFun fun : battleModel.getMonsters()) {
            if (fun.getPos() < 5) {
               Monster monster = new Monster(fun.getId(), fun.getLv(), fun.getStar(), fun.getOffset(), false, fun, BattlePKTeam.getWarriorSignetByLv(fun.getId(), fun.getLv(), battleModel.getShield()));
               HeroArrayingEntity heroArrayingEntity = new HeroArrayingEntity(fun.getPos(), monster);
               this.arrayingElementsMap.put(fun.getPos(), heroArrayingEntity);
            } else if (fun.getPos() == 5) {
               Monster monster = new Monster(fun.getId(), fun.getLv(), fun.getStar(), fun.getOffset(), false, fun, BattlePKTeam.getWarriorSignetByLv(fun.getId(), fun.getLv(), battleModel.getShield()));
               FriendArrayingEntity friendArrayingEntity = new FriendArrayingEntity(fun.getPos(), monster);
               this.arrayingElementsMap.put(fun.getPos(), friendArrayingEntity);
            }
         }

      }
   }

   public ArrayingMirror(GamePlayer gamePlayer, HeroArrayingDao heroArrayingDao) {
      if (heroArrayingDao != null) {
         boolean isHaveArrayingHero = false;

         for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
            if ((Byte)entry.getKey() <= 5) {
               isHaveArrayingHero = true;
               break;
            }
         }

         if (isHaveArrayingHero) {
            this.playerId = heroArrayingDao.playerId;
            this.arrayingType = heroArrayingDao.arrayingType;
            this.friendState = heroArrayingDao.friendState;
            this.friendNation = heroArrayingDao.friendNation;
            this.friendJob = heroArrayingDao.friendJob;
            this.hide = heroArrayingDao.hide;
            HeroMirror friendHero = null;
            HeroMirror kingHero = null;
            HeroBagPart heroBagPart = (HeroBagPart)gamePlayer.getMgrPart(HeroBagPart.class);
            heroBagPart.checkArrayingHaveKingControl(heroArrayingDao.elements, gamePlayer);

            for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
               switch ((Byte)entry.getKey()) {
                  case 0:
                  case 1:
                  case 2:
                  case 3:
                  case 4:
                     HeroDao heroDao = heroBagPart.getHeroByCode((Integer)entry.getValue());
                     if (heroDao != null) {
                        heroBagPart.heroBagFlushProperties(heroDao);
                        HeroArrayingEntity heroArrayingEntity = new HeroArrayingEntity((Byte)entry.getKey(), heroDao);
                        this.arrayingElementsMap.put(entry.getKey(), heroArrayingEntity);
                        this.power += heroArrayingEntity.mirror.combatPower;
                        if ((Integer)entry.getValue() == heroArrayingDao.kingCode) {
                           kingHero = heroArrayingEntity.mirror;
                        }
                     }
                     break;
                  case 5:
                     HeroDao friendDao = heroBagPart.getHeroByCode((Integer)entry.getValue());
                     if (friendDao != null) {
                        heroBagPart.heroBagFlushProperties(friendDao);
                        FriendArrayingEntity friendArrayingEntity = new FriendArrayingEntity((Byte)entry.getKey(), friendDao);
                        this.arrayingElementsMap.put(entry.getKey(), friendArrayingEntity);
                        this.power += friendDao.combatPower;
                        friendHero = friendArrayingEntity.mirror;
                        if ((Integer)entry.getValue() == heroArrayingDao.kingCode) {
                           kingHero = friendArrayingEntity.mirror;
                        }
                     }
                     break;
                  case 6:
                     ArtifactPart artifactPart = (ArtifactPart)gamePlayer.getMgrPart(ArtifactPart.class);
                     ArtifactDao artifactDao = artifactPart.getArtifactDao();
                     if (artifactDao != null && ((ArtifactData)artifactDao.artifacts.get(entry.getValue())).state == 2) {
                        ArtifactArrayingEntity artifactArrayingEntity = new ArtifactArrayingEntity();
                        artifactArrayingEntity.positon = (Byte)entry.getKey();
                        artifactArrayingEntity.code = (Integer)entry.getValue();
                        artifactArrayingEntity.skillId = ((ArtifactData)artifactDao.artifacts.get(entry.getValue())).skillId;
                        artifactArrayingEntity.level = artifactDao.skillLv;
                        ArtifactDressPart artifactDressPart = (ArtifactDressPart)gamePlayer.getMgrPart(ArtifactDressPart.class);
                        ArtifactDressDao artifactDressDao = artifactDressPart.getArtifactDressDaoByArtifactId((Integer)entry.getValue());
                        if (artifactDressDao != null) {
                           ArtifactModel artifactModel = (ArtifactModel)ApplicationContextProvider.getModelPoolEntity("artifact", artifactArrayingEntity.code);
                           if (artifactModel != null) {
                              Map<Integer, ArtifactSkillGroupModel> groupModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customArtifactSkillGroup", artifactDressDao.id);
                              if (groupModelMap != null && !groupModelMap.isEmpty()) {
                                 ArtifactSkillGroupModel model = (ArtifactSkillGroupModel)groupModelMap.get(artifactDao.skillLv);
                                 if (model != null) {
                                    artifactArrayingEntity.skinId = artifactDressDao.id;
                                    artifactArrayingEntity.skillId = (Integer)model.getDressSkills().get(artifactModel.getSkillKey());
                                 }
                              }
                           }
                        }

                        this.arrayingElementsMap.put(entry.getKey(), artifactArrayingEntity);
                     }
                     break;
                  case 7:
                     TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)gamePlayer.getMgrPart(TongqueTerracePart.class);
                     TongqueTerraceDao tongqueTerraceDao = tongqueTerracePart.getTongqueTerraceDao((Integer)entry.getValue());
                     if (tongqueTerraceDao != null && tongqueTerraceDao.state == 2) {
                        BeautyArrayingEntity beautyArrayingEntity = new BeautyArrayingEntity();
                        beautyArrayingEntity.positon = (Byte)entry.getKey();
                        beautyArrayingEntity.code = (Integer)entry.getValue();
                        beautyArrayingEntity.skillId = tongqueTerraceDao.skillId;
                        if (tongqueTerraceDao.cooperateType > 0) {
                           CooperateDao cooperateDao = tongqueTerracePart.getCooperateDao(tongqueTerraceDao.cooperateType);
                           if (cooperateDao != null) {
                              AssistantBeauty assistantBeauty = new AssistantBeauty();

                              for(Integer beautyId : cooperateDao.cooperateBeauty) {
                                 assistantBeauty.beautyList.add(beautyId);
                                 if (beautyId != 0 && beautyId != tongqueTerraceDao.beautyId) {
                                    assistantBeauty.assistantList.add(beautyId);
                                    TongqueTerraceDao extraBeautyDao = tongqueTerracePart.getTongqueTerraceDao(beautyId);
                                    if (extraBeautyDao != null && extraBeautyDao.state == 2) {
                                       TongQueSkillModel tongQueSkillModel = (TongQueSkillModel)gamePlayer.getGameModelPool().getEntity("TongQueSkill", extraBeautyDao.skillId);
                                       if (tongQueSkillModel != null) {
                                          assistantBeauty.assistantSkillList.add(tongQueSkillModel.getAssistantSkill());
                                          assistantBeauty.beautySkillList.add(tongQueSkillModel.getAssistantSkill());
                                       }
                                    }
                                 } else if (beautyId != 0) {
                                    assistantBeauty.beautySkillList.add(tongqueTerraceDao.skillId);
                                 } else {
                                    assistantBeauty.beautySkillList.add(0);
                                 }
                              }

                              beautyArrayingEntity.assistantBeauty = assistantBeauty;
                           }
                        }

                        this.arrayingElementsMap.put(entry.getKey(), beautyArrayingEntity);
                     }
               }
            }

            MagicBookDao magicBookDao = (MagicBookDao)gamePlayer.getData("tb_magic_book", gamePlayer.getPlayerId());
            if (magicBookDao.magicBookId > 0) {
               DragonArrayingEntity dragonArrayingEntity = new DragonArrayingEntity();
               dragonArrayingEntity.positon = 8;
               dragonArrayingEntity.code = magicBookDao.magicBookId;
               dragonArrayingEntity.skillIds.putAll(magicBookDao.skillPosition);
               DragonStrengthenPart dragonStrengthenPart = (DragonStrengthenPart)gamePlayer.getMgrPart(DragonStrengthenPart.class);

               for(PropertyModel propertyModel : dragonStrengthenPart.getPropertyAdditions()) {
                  dragonArrayingEntity.dragonStrengthen.put(propertyModel.getType(), propertyModel);
               }

               this.arrayingElementsMap.put((byte)8, dragonArrayingEntity);
               this.power += dragonArrayingEntity.power();
            }

            PetPart petPart = (PetPart)gamePlayer.getMgrPart(PetPart.class);
            if (petPart.isHavePetArraying()) {
               if (petPart.getPetMirrorMap().isEmpty()) {
               }

               TreeMap<Integer, PetMirror> petMap = new TreeMap();

               for(Map.Entry<Integer, PetMirror> entry : petPart.getPetMirrorMap().entrySet()) {
                  petMap.put(((PetMirror)entry.getValue()).skillIndex, entry.getValue());
               }

               PetArrayingEntity petArrayingEntity = new PetArrayingEntity(9, 0, petMap);
               this.arrayingElementsMap.put((byte)9, petArrayingEntity);
            }

            if (this.soulHeroId <= 0 && heroArrayingDao.soulHeroCode > 0) {
               HeroDao heroDao = heroBagPart.getHeroByCode(heroArrayingDao.soulHeroCode);
               if (heroDao != null && heroDao.containState(heroArrayingDao.arrayingType)) {
                  this.soulHeroId = heroDao.id;
                  this.soulHeroCode = heroDao.code;
               }
            }

         }
      }
   }

   public CommonMsg.PlayerArrayingInfo.Builder toPlayerArrayingInfo() {
      CommonMsg.PlayerArrayingInfo.Builder builder = CommonMsg.PlayerArrayingInfo.newBuilder();
      if (this.arrayingType == 0) {
         this.arrayingType = 1;
      }

      if (this.arrayingType == 19) {
         this.arrayingType = 1;
      }

      builder.setType(CommonMsg.HeroState.forNumber(this.arrayingType));
      builder.setFriendState(this.friendState);
      builder.setFriendNation(this.friendNation);
      builder.setIsHide(this.hide);
      builder.setFriendJob(this.friendJob);
      builder.setSoulHeroCode(this.soulHeroCode);

      for(Map.Entry<Byte, ArrayingEntity> entry : this.arrayingElementsMap.entrySet()) {
         switch (((ArrayingEntity)entry.getValue()).entityType()) {
            case CODE_HERO:
            case CODE_FRIEND:
               builder.addHeros((CommonMsg.HeroInfo)((ArrayingEntity)entry.getValue()).toBuilder());
               break;
            case CODE_ARTIFACT:
               builder.setArtifact((CommonMsg.ArtifactInfo)((ArrayingEntity)entry.getValue()).toBuilder());
               break;
            case CODE_BEAUTY:
               builder.setBeauty((CommonMsg.BeautyInfo)((ArrayingEntity)entry.getValue()).toBuilder());
               break;
            case CODE_DRAGON:
               builder.setDragon((CommonMsg.MagicBookInfo)((ArrayingEntity)entry.getValue()).toBuilder());
         }
      }

      return builder;
   }

   public byte[] toByteArray() {
      String str = this.encode();
      return str.getBytes();
   }

   public static ArrayingMirror toArrayingMirror(byte[] bytes) {
      String str = new String(bytes);
      ArrayingMirror arrayingMirror = new ArrayingMirror();
      if (str.startsWith("{")) {
         JSONObject jsonObject = null;

         try {
            jsonObject = JSONUtil.parseObj(str);
         } catch (Exception var9) {
            return null;
         }

         arrayingMirror.playerId = jsonObject.getInt("playerId");
         arrayingMirror.power = jsonObject.getLong("power");
         arrayingMirror.arrayingType = jsonObject.getInt("arrayingType");
         if (!jsonObject.isNull("friendState")) {
            arrayingMirror.friendState = jsonObject.getInt("friendState");
         }

         if (!jsonObject.isNull("hide")) {
            arrayingMirror.hide = jsonObject.getBool("hide");
         }

         JSONObject mapJson = jsonObject.getJSONObject("arrayingElementsMap");
         if (mapJson != null) {
            for(Map.Entry<String, Object> entry : mapJson.entrySet()) {
               byte pos = Byte.parseByte((String)entry.getKey());
               if (pos < 5) {
                  HeroArrayingEntity heroArrayingEntity = (HeroArrayingEntity)JSONUtil.toBean((JSONObject)entry.getValue(), HeroArrayingEntity.class);
                  arrayingMirror.arrayingElementsMap.put(pos, heroArrayingEntity);
               } else if (pos == 5) {
                  FriendArrayingEntity friendArrayingEntity = (FriendArrayingEntity)JSONUtil.toBean((JSONObject)entry.getValue(), FriendArrayingEntity.class);
                  arrayingMirror.arrayingElementsMap.put(pos, friendArrayingEntity);
               } else if (pos == 6) {
                  ArtifactArrayingEntity artifactArrayingEntity = (ArtifactArrayingEntity)JSONUtil.toBean((JSONObject)entry.getValue(), ArtifactArrayingEntity.class);
                  arrayingMirror.arrayingElementsMap.put(pos, artifactArrayingEntity);
               } else if (pos == 7) {
                  BeautyArrayingEntity beautyArrayingEntity = (BeautyArrayingEntity)JSONUtil.toBean((JSONObject)entry.getValue(), BeautyArrayingEntity.class);
                  arrayingMirror.arrayingElementsMap.put(pos, beautyArrayingEntity);
               } else if (pos == 8) {
                  DragonArrayingEntity dragonArrayingEntity = (DragonArrayingEntity)JSONUtil.toBean((JSONObject)entry.getValue(), DragonArrayingEntity.class);
                  arrayingMirror.arrayingElementsMap.put(pos, dragonArrayingEntity);
               } else if (pos == 9) {
                  PetArrayingEntity petArrayingEntity = (PetArrayingEntity)JSONUtil.toBean((JSONObject)entry.getValue(), PetArrayingEntity.class);
                  arrayingMirror.arrayingElementsMap.put(pos, petArrayingEntity);
               }
            }
         }

         if (!jsonObject.isNull("friendJob")) {
            arrayingMirror.friendJob = jsonObject.getInt("friendJob");
         }

         if (!jsonObject.isNull("soulHeroId")) {
            arrayingMirror.soulHeroId = jsonObject.getInt("soulHeroId");
         }

         if (!jsonObject.isNull("soulHeroCode")) {
            arrayingMirror.soulHeroCode = jsonObject.getInt("soulHeroCode");
         }

         if (arrayingMirror == null || arrayingMirror.arrayingElementsMap == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
            logger.error("使用JSON解析也为空,打印错误日志");
            (new Exception()).printStackTrace();
         }
      } else {
         arrayingMirror.decode(str);
      }

      return arrayingMirror;
   }

   public boolean arrayingIsEmpty() {
      return this.arrayingElementsMap == null || this.arrayingElementsMap.isEmpty();
   }

   public boolean arrayingHeroIsEmpty() {
      if (this.arrayingElementsMap != null && !this.arrayingElementsMap.isEmpty()) {
         return !this.arrayingElementsMap.containsKey((byte)0) && !this.arrayingElementsMap.containsKey((byte)1) && !this.arrayingElementsMap.containsKey((byte)2) && !this.arrayingElementsMap.containsKey((byte)3) && !this.arrayingElementsMap.containsKey((byte)4);
      } else {
         return true;
      }
   }

   public void decode(String str) {
      String[] array = StrUtil.split(str, "arrFir");
      if (array.length > 0) {
         this.playerId = Integer.parseInt(array[0]);
      }

      if (array.length > 1) {
         this.arrayingType = Integer.parseInt(array[1]);
      }

      if (array.length > 2) {
         this.power = Long.parseLong(array[2]);
      }

      if (array.length > 3) {
         this.friendNation = Integer.parseInt(array[3]);
      }

      if (array.length > 4) {
         this.friendState = Integer.parseInt(array[4]);
      }

      if (array.length > 5 && StrUtil.isNotEmpty(array[5])) {
         String[] array_sub = StrUtil.split(array[5], "arrSec");

         for(String s : array_sub) {
            if (!StrUtil.isEmpty(s)) {
               String[] array_arraying = StrUtil.split(s, "arrThi");
               Byte position = Byte.parseByte(array_arraying[0]);
               switch (position) {
                  case 0:
                  case 1:
                  case 2:
                  case 3:
                  case 4:
                     HeroArrayingEntity heroArrayingEntity = new HeroArrayingEntity();
                     heroArrayingEntity.decode(array_arraying[1]);
                     this.arrayingElementsMap.put(position, heroArrayingEntity);
                     break;
                  case 5:
                     FriendArrayingEntity friendArrayingEntity = new FriendArrayingEntity();
                     friendArrayingEntity.decode(array_arraying[1]);
                     this.arrayingElementsMap.put(position, friendArrayingEntity);
                     break;
                  case 6:
                     ArtifactArrayingEntity artifactArrayingEntity = new ArtifactArrayingEntity();
                     artifactArrayingEntity.decode(array_arraying[1]);
                     this.arrayingElementsMap.put(position, artifactArrayingEntity);
                     break;
                  case 7:
                     BeautyArrayingEntity beautyArrayingEntity = new BeautyArrayingEntity();
                     beautyArrayingEntity.decode(array_arraying[1]);
                     this.arrayingElementsMap.put(position, beautyArrayingEntity);
                     break;
                  case 8:
                     DragonArrayingEntity dragonArrayingEntity = new DragonArrayingEntity();
                     dragonArrayingEntity.decode(array_arraying[1]);
                     this.arrayingElementsMap.put(position, dragonArrayingEntity);
                     break;
                  case 9:
                     PetArrayingEntity petArrayingEntity = new PetArrayingEntity();
                     petArrayingEntity.decode(array_arraying[1]);
                     this.arrayingElementsMap.put(position, petArrayingEntity);
               }
            }
         }
      }

      if (array.length > 6) {
         this.hide = Boolean.parseBoolean(array[6]);
      }

      if (array.length > 7) {
         this.friendJob = array[7] != null && !array[7].isEmpty() ? Integer.parseInt(array[7]) : 0;
      }

      if (array.length > 8) {
         this.soulHeroId = array[8] != null && !array[8].isEmpty() ? Integer.parseInt(array[8]) : 0;
      }

      if (array.length > 9) {
         this.soulHeroCode = array[9] != null && !array[9].isEmpty() ? Integer.parseInt(array[9]) : 0;
      }

   }

   public String encode() {
      StringBuffer sb = new StringBuffer();
      sb.append(this.playerId).append("arrFir");
      sb.append(this.arrayingType).append("arrFir");
      sb.append(this.power).append("arrFir");
      sb.append(this.friendNation).append("arrFir");
      sb.append(this.friendState).append("arrFir");

      for(Map.Entry<Byte, ArrayingEntity> entry : this.arrayingElementsMap.entrySet()) {
         sb.append(entry.getKey()).append("arrThi");
         sb.append(((ArrayingEntity)entry.getValue()).encode()).append("arrSec");
      }

      sb.append("arrFir");
      sb.append(this.hide).append("arrFir");
      sb.append(this.friendJob).append("arrFir");
      sb.append(this.soulHeroId).append("arrFir");
      sb.append(this.soulHeroCode).append("arrFir");
      return sb.toString();
   }

   private void specialAdditionReset(HeroDao heroDao, HeroArrayingEntity arrayingEntity) {
      if (HeroArrayingPart.RESET_ADDITION_ARRAYING.contains(this.arrayingType)) {
         Map<Integer, Long> addProperties = new HashMap();
         Map<Integer, Long> addFriendProperties = heroDao.convertAdditionToMap(heroDao.property_friend);
         if (addFriendProperties != null) {
            MapUtil.mapMergeLong(addProperties, addFriendProperties);
         }

         for(Map.Entry<Integer, Long> entry : addProperties.entrySet()) {
            HeroMirror var10000 = arrayingEntity.mirror;
            var10000.combatPower -= Double.valueOf(HeroDao.calPowerByType((Integer)entry.getKey(), (Long)entry.getValue())).longValue();
         }

         for(Map.Entry<Integer, Long> propertyEntry : arrayingEntity.mirror.totalShowProperties.entrySet()) {
            propertyEntry.setValue((Long)propertyEntry.getValue() - (Long)addProperties.getOrDefault(propertyEntry.getKey(), 0L));
         }

         for(Map.Entry<Integer, Long> propertyEntry : arrayingEntity.mirror.totalFightProperties.entrySet()) {
            propertyEntry.setValue((Long)propertyEntry.getValue() - (Long)addProperties.getOrDefault(propertyEntry.getKey(), 0L));
         }

      }
   }

   private void specialAdditionCal(HeroMirror friendHero, HeroMirror kingHero) {
      if (HeroArrayingPart.RESET_ADDITION_ARRAYING.contains(this.arrayingType)) {
         Map<Integer, Map<Integer, List<PropertyModel>>> friendAdditionProperties = new HashMap();
         new HashMap();
         boolean isFriendKing = false;
         if (friendHero != null) {
            HeroModel friendHeroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", friendHero.id);
            if (friendHeroModel != null) {
               int friendJob = friendHeroModel.getType();
               if (friendHeroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING && this.friendJob > 0) {
                  friendJob = this.friendJob;
               }

               int key = friendJob * 100 + friendHero.star;
               SupportHeroModel supportHeroModel = (SupportHeroModel)ApplicationContextProvider.getModelPoolEntity("supportHero", key);
               if (supportHeroModel != null && friendHero.totalFightProperties.containsKey(supportHeroModel.getAddpro())) {
                  long val = (Long)friendHero.totalFightProperties.get(supportHeroModel.getAddpro()) * (long)supportHeroModel.getAddper() / 10000L;

                  for(int i = 1; i <= 5; ++i) {
                     Map<Integer, List<PropertyModel>> tempMap = new HashMap();

                     for(int j = 1; j <= 4; ++j) {
                        List<PropertyModel> list = new ArrayList();
                        list.add(new PropertyModel(supportHeroModel.getAddpro(), 0, val));
                        tempMap.put(j, list);
                     }

                     friendAdditionProperties.put(i, tempMap);
                  }
               }

               if (friendHero == kingHero) {
                  isFriendKing = true;
               }
            }

            this.addHeroMirrorProperties(friendAdditionProperties);
         }

         if (kingHero != null && !isFriendKing) {
         }

      }
   }

   private void addHeroMirrorProperties(Map<Integer, Map<Integer, List<PropertyModel>>> additionProperties) {
      for(Map.Entry<Byte, ArrayingEntity> entry : this.arrayingElementsMap.entrySet()) {
         if ((Byte)entry.getKey() < 5) {
            HeroArrayingEntity heroArrayingEntity = (HeroArrayingEntity)entry.getValue();
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroArrayingEntity.heroId());
            if (heroModel != null) {
               this.addHeroMirrorProperties(heroArrayingEntity.mirror, (List)((Map)additionProperties.getOrDefault(heroModel.getNation(), new HashMap())).get(heroModel.getType()));
            }
         }
      }

   }

   private void addHeroMirrorProperties(HeroMirror mirror, List<PropertyModel> additions) {
      if (additions != null) {
         for(PropertyModel addition : additions) {
            long addVal;
            if (addition.getWay() == 0) {
               addVal = addition.getValue();
            } else {
               if (addition.getWay() != 1) {
                  continue;
               }

               addVal = Float.valueOf((float)(Long)mirror.totalFightProperties.get(addition.getType()) * ((float)addition.getValue() / 10000.0F)).longValue();
            }

            mirror.combatPower = (long)((double)mirror.combatPower + HeroDao.calPowerByType(addition.getType(), addition.getValue()));
            if (mirror.totalShowProperties.containsKey(addition.getType())) {
               mirror.totalShowProperties.put(addition.getType(), (Long)mirror.totalShowProperties.getOrDefault(addition.getType(), 0L) + addVal);
            }

            if (mirror.totalFightProperties.containsKey(addition.getType())) {
               mirror.totalFightProperties.put(addition.getType(), (Long)mirror.totalFightProperties.getOrDefault(addition.getType(), 0L) + addVal);
            }
         }

      }
   }

   public ArrayingMirror(int step, int battleId, List<PropertyModel> proList, DecisiveBattlRobotArrayModel robotModel) {
      BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", battleId);
      if (battleModel == null) {
         throw new RuntimeException("生成pkteam时未找到战斗id:" + battleId);
      } else {
         for(BattleMonsterFun fun : battleModel.getMonsters()) {
            if (fun.getPos() < 5) {
               List<Integer> warcraftList = this.getRobotWarcraftSkill(robotModel);
               Monster monster = new Monster(step, fun.getId(), fun.getLv(), fun.getStar(), fun.getOffset(), BattlePKTeam.getWarriorSignetByBattleId(battleId, fun.getPos()), warcraftList, proList);
               HeroArrayingEntity heroArrayingEntity = new HeroArrayingEntity(fun.getPos(), monster);
               this.arrayingElementsMap.put(fun.getPos(), heroArrayingEntity);
            } else if (fun.getPos() == 5) {
               List<Integer> warcraftList = this.getRobotWarcraftSkill(robotModel);
               Monster monster = new Monster(step, fun.getId(), fun.getLv(), fun.getStar(), fun.getOffset(), BattlePKTeam.getWarriorSignetByBattleId(battleId, fun.getPos()), warcraftList, proList);
               FriendArrayingEntity friendArrayingEntity = new FriendArrayingEntity(fun.getPos(), monster);
               this.arrayingElementsMap.put(fun.getPos(), friendArrayingEntity);
            }
         }

      }
   }

   public List<Integer> getRobotWarcraftSkill(DecisiveBattlRobotArrayModel robotModel) {
      List<Integer> warcraftList = new ArrayList();
      List<Integer> tempList = new ArrayList();
      tempList.addAll(robotModel.getWarcraftId());
      Collections.shuffle(tempList);

      for(int i = 0; i < robotModel.getWarcraftNum(); ++i) {
         for(Integer skillId : tempList) {
            if (!warcraftList.contains(skillId)) {
               warcraftList.add(skillId);
               break;
            }
         }
      }

      return warcraftList;
   }

   public ArrayingMirror(GamePlayer player, CommonMsg.HeroState arrayingType, List<CommonMsg.CodeType> removeType) {
      Map<Integer, HeroArrayingDao> map = player.<Integer, HeroArrayingDao>getMap("tb_hero_arraying", player.getPlayerId());
      if (map != null) {
         HeroArrayingDao heroArrayingDao = (HeroArrayingDao)map.get(arrayingType.getNumber());
         if (heroArrayingDao != null) {
            if (!heroArrayingDao.elements.keySet().stream().noneMatch((pos) -> pos <= 5)) {
               this.playerId = heroArrayingDao.playerId;
               this.arrayingType = heroArrayingDao.arrayingType;
               this.friendState = heroArrayingDao.friendState;
               this.friendNation = heroArrayingDao.friendNation;
               this.friendJob = heroArrayingDao.friendJob;
               this.hide = heroArrayingDao.hide;
               HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
               this.soulHeroCode = heroArrayingDao.soulHeroCode;
               if (heroArrayingDao.soulHeroCode > 0) {
                  HeroDao heroDao = heroBagPart.getHeroByCode(heroArrayingDao.soulHeroCode, arrayingType);
                  if (heroDao != null) {
                     this.soulHeroId = heroDao.id;
                  }
               }

               heroBagPart.checkArrayingHaveKingControl(heroArrayingDao.elements, player);
               Map<Byte, Integer> cloneElements = new HashMap(heroArrayingDao.elements);
               if (!CollectionUtils.isEmpty(removeType)) {
                  for(CommonMsg.CodeType codeType : removeType) {
                     if (codeType == CommonMsg.CodeType.CODE_FRIEND) {
                        cloneElements.remove((byte)5);
                     }

                     if (codeType == CommonMsg.CodeType.CODE_ARTIFACT) {
                        cloneElements.remove((byte)6);
                     }

                     if (codeType == CommonMsg.CodeType.CODE_BEAUTY) {
                        cloneElements.remove((byte)7);
                     }

                     if (codeType == CommonMsg.CodeType.CODE_DRAGON) {
                        cloneElements.remove((byte)8);
                     }

                     if (codeType == CommonMsg.CodeType.CODE_PET) {
                        cloneElements.remove((byte)9);
                     }
                  }
               }

               for(Map.Entry<Byte, Integer> entry : cloneElements.entrySet()) {
                  switch ((Byte)entry.getKey()) {
                     case 0:
                     case 1:
                     case 2:
                     case 3:
                     case 4:
                        HeroDao heroDao = heroBagPart.getHeroByCode((Integer)entry.getValue(), arrayingType);
                        if (heroDao != null) {
                           HeroArrayingEntity heroArrayingEntity = new HeroArrayingEntity((Byte)entry.getKey(), heroDao);
                           this.arrayingElementsMap.put(entry.getKey(), heroArrayingEntity);
                           this.power += heroArrayingEntity.mirror.combatPower;
                        }
                        break;
                     case 5:
                        HeroDao friendDao = heroBagPart.getHeroByCode((Integer)entry.getValue(), arrayingType);
                        if (friendDao != null) {
                           heroBagPart.heroBagFlushProperties(friendDao);
                           FriendArrayingEntity friendArrayingEntity = new FriendArrayingEntity((Byte)entry.getKey(), friendDao);
                           this.arrayingElementsMap.put(entry.getKey(), friendArrayingEntity);
                           this.power += friendDao.combatPower;
                        }
                        break;
                     case 6:
                        ArtifactPart artifactPart = (ArtifactPart)player.getMgrPart(ArtifactPart.class);
                        ArtifactDao artifactDao = artifactPart.getArtifactDao();
                        if (artifactDao != null && ((ArtifactData)artifactDao.artifacts.get(entry.getValue())).state == 2) {
                           ArtifactArrayingEntity artifactArrayingEntity = new ArtifactArrayingEntity();
                           artifactArrayingEntity.positon = (Byte)entry.getKey();
                           artifactArrayingEntity.code = (Integer)entry.getValue();
                           artifactArrayingEntity.skillId = ((ArtifactData)artifactDao.artifacts.get(entry.getValue())).skillId;
                           artifactArrayingEntity.level = artifactDao.skillLv;
                           ArtifactDressPart artifactDressPart = (ArtifactDressPart)player.getMgrPart(ArtifactDressPart.class);
                           ArtifactDressDao artifactDressDao = artifactDressPart.getArtifactDressDaoByArtifactId((Integer)entry.getValue());
                           if (artifactDressDao != null) {
                              ArtifactModel artifactModel = (ArtifactModel)ApplicationContextProvider.getModelPoolEntity("artifact", artifactArrayingEntity.code);
                              if (artifactModel != null) {
                                 Map<Integer, ArtifactSkillGroupModel> groupModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customArtifactSkillGroup", artifactDressDao.id);
                                 if (groupModelMap != null && !groupModelMap.isEmpty()) {
                                    ArtifactSkillGroupModel model = (ArtifactSkillGroupModel)groupModelMap.get(artifactDao.skillLv);
                                    if (model != null) {
                                       artifactArrayingEntity.skinId = artifactDressDao.id;
                                       artifactArrayingEntity.skillId = (Integer)model.getDressSkills().get(artifactModel.getSkillKey());
                                    }
                                 }
                              }
                           }

                           this.arrayingElementsMap.put(entry.getKey(), artifactArrayingEntity);
                        }
                        break;
                     case 7:
                        TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)player.getMgrPart(TongqueTerracePart.class);
                        TongqueTerraceDao tongqueTerraceDao = tongqueTerracePart.getTongqueTerraceDao((Integer)entry.getValue());
                        if (tongqueTerraceDao == null || tongqueTerraceDao.state != 2) {
                           break;
                        }

                        BeautyArrayingEntity beautyArrayingEntity = new BeautyArrayingEntity();
                        beautyArrayingEntity.positon = (Byte)entry.getKey();
                        beautyArrayingEntity.code = (Integer)entry.getValue();
                        beautyArrayingEntity.skillId = tongqueTerraceDao.skillId;
                        if (tongqueTerraceDao.cooperateType > 0) {
                           CooperateDao cooperateDao = tongqueTerracePart.getCooperateDao(tongqueTerraceDao.cooperateType);
                           if (cooperateDao != null) {
                              AssistantBeauty assistantBeauty = new AssistantBeauty();

                              for(Integer beautyId : cooperateDao.cooperateBeauty) {
                                 assistantBeauty.beautyList.add(beautyId);
                                 if (beautyId != 0 && beautyId != tongqueTerraceDao.beautyId) {
                                    assistantBeauty.assistantList.add(beautyId);
                                    TongqueTerraceDao extraBeautyDao = tongqueTerracePart.getTongqueTerraceDao(beautyId);
                                    if (extraBeautyDao != null && extraBeautyDao.state == 2) {
                                       TongQueSkillModel tongQueSkillModel = (TongQueSkillModel)player.getGameModelPool().getEntity("TongQueSkill", extraBeautyDao.skillId);
                                       if (tongQueSkillModel != null) {
                                          assistantBeauty.assistantSkillList.add(tongQueSkillModel.getAssistantSkill());
                                          assistantBeauty.beautySkillList.add(tongQueSkillModel.getAssistantSkill());
                                       }
                                    }
                                 } else if (beautyId != 0) {
                                    assistantBeauty.beautySkillList.add(tongqueTerraceDao.skillId);
                                 } else {
                                    assistantBeauty.beautySkillList.add(0);
                                 }
                              }

                              beautyArrayingEntity.assistantBeauty = assistantBeauty;
                           }
                        }

                        this.arrayingElementsMap.put(entry.getKey(), beautyArrayingEntity);
                        break;
                     case 8:
                        MagicBookDao magicBookDao = (MagicBookDao)player.getData("tb_magic_book", this.playerId);
                        if (magicBookDao.magicBookId <= 0) {
                           break;
                        }

                        DragonArrayingEntity dragonArrayingEntity = new DragonArrayingEntity();
                        dragonArrayingEntity.positon = 8;
                        dragonArrayingEntity.code = magicBookDao.magicBookId;
                        dragonArrayingEntity.skillIds.putAll(magicBookDao.skillPosition);
                        DragonStrengthenPart dragonStrengthenPart = (DragonStrengthenPart)player.getMgrPart(DragonStrengthenPart.class);

                        for(PropertyModel propertyModel : dragonStrengthenPart.getPropertyAdditions()) {
                           dragonArrayingEntity.dragonStrengthen.put(propertyModel.getType(), propertyModel);
                        }

                        this.arrayingElementsMap.put((byte)8, dragonArrayingEntity);
                        this.power += dragonArrayingEntity.power();
                        break;
                     case 9:
                        PetPart petPart = (PetPart)player.getMgrPart(PetPart.class);
                        if (petPart.isHavePetArraying()) {
                           TreeMap<Integer, PetMirror> petMap = new TreeMap();
                           petPart.getPetMirrorMap().values().forEach((pet) -> {
                              PetMirror var10000 = (PetMirror)petMap.put(pet.skillIndex, pet);
                           });
                           PetArrayingEntity petArrayingEntity = new PetArrayingEntity(9, 0, petMap);
                           this.arrayingElementsMap.put((byte)9, petArrayingEntity);
                        }
                  }
               }

            }
         }
      }
   }

   public void refreshPower() {
      long totalPower = 0L;

      for(Map.Entry<Byte, ArrayingEntity> entry : this.arrayingElementsMap.entrySet()) {
         ArrayingEntity entity = (ArrayingEntity)entry.getValue();
         totalPower += entity.power();
      }

      this.power = totalPower;
   }
}
