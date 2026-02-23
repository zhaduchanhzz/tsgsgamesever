package com.gzbz.gameDefine;

import com.gzbz.db.HeroDao;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.gamePlayer.playerBag.StarMapPoint;
import com.gzbz.model.HeroModel;
import com.gzbz.model.StarAspectRumModel;
import com.gzbz.model.StarMapTypeModel;
import com.gzbz.model.StarSkillModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StarMapDefine {
   static Logger logger = LoggerFactory.getLogger(StarMapDefine.class);
   public static final int NO_RELEASE = 2;
   public static final int STAR_POINT_UNLOCK_TYPE_INIT = 0;
   public static final int STAR_POINT_UNLOCK_TYPE_LV = 1;
   public static final int STAR_TYPE_FIXED = 1;
   public static final int STAR_TYPE_CHOOSE = 2;
   public static final int STAR_POINT_INIT_LV = 0;
   public static final int POINT_TYPE_FIXED = 0;
   public static final int POINT_TYPE_CHOOSE = -1;

   public static List<Integer> getSkillStarMapList(HeroDao heroDao, int heroLv, int starMapTotalLv) {
      List<Integer> skillStarMapList = new ArrayList();
      if (heroDao.type == HeroDefine.HERO_SP_TYPE_PALACE) {
         skillStarMapList.addAll(heroDao.palaceStarSkill.values());
         return skillStarMapList;
      } else {
         StarMapTypeModel starMapTypeModel = getStarMapTypeModel(heroDao);
         if (null == starMapTypeModel) {
            return skillStarMapList;
         } else {
            if (heroLv >= starMapTypeModel.getNeedlevel()) {
               List<Integer> skill = starMapTypeModel.getSkill();
               if (skill.size() > 1 && starMapTotalLv >= (Integer)skill.get(0)) {
                  skillStarMapList.add(skill.get(1));
               }

               List<Integer> skill2 = starMapTypeModel.getSkill2();
               if (skill2.size() > 1 && starMapTotalLv >= (Integer)skill2.get(0)) {
                  skillStarMapList.add(skill2.get(1));
               }
            }

            return skillStarMapList;
         }
      }
   }

   public static List<Integer> getSkillStarMapList(int heroId, int heroLv, int starMapTotalLv) {
      List<Integer> skillStarMapList = new ArrayList();
      StarMapTypeModel starMapTypeModel = (StarMapTypeModel)ApplicationContextProvider.getModelPoolEntity("starMapType", heroId);
      if (null == starMapTypeModel) {
         return skillStarMapList;
      } else {
         if (heroLv >= starMapTypeModel.getNeedlevel()) {
            List<Integer> skill = starMapTypeModel.getSkill();
            if (skill.size() > 1 && starMapTotalLv >= (Integer)skill.get(0)) {
               skillStarMapList.add(skill.get(1));
            }

            List<Integer> skill2 = starMapTypeModel.getSkill2();
            if (skill2.size() > 1 && starMapTotalLv >= (Integer)skill2.get(0)) {
               skillStarMapList.add(skill2.get(1));
            }
         }

         return skillStarMapList;
      }
   }

   public static List<Integer> getSkillPvpStarMapList(HeroMirror heroMirror, int starMapTotalLv) {
      List<Integer> skillPvpStarMapList = new ArrayList();
      if (heroMirror.type == HeroDefine.HERO_SP_TYPE_PALACE) {
         skillPvpStarMapList.addAll(heroMirror.palaceStarSkill.values());
         return skillPvpStarMapList;
      } else {
         StarMapTypeModel starMapTypeModel = (StarMapTypeModel)ApplicationContextProvider.getModelPoolEntity("starMapType", heroMirror.id);
         if (null == starMapTypeModel) {
            return skillPvpStarMapList;
         } else {
            List<Integer> skill3 = starMapTypeModel.getSkill3();
            if (skill3.size() > 1 && starMapTotalLv >= (Integer)skill3.get(0)) {
               skillPvpStarMapList.add(skill3.get(1));
            }

            return skillPvpStarMapList;
         }
      }
   }

   public static StarMapTypeModel getStarMapTypeModel(HeroDao heroDao) {
      StarMapTypeModel starMapTypeModel = null;
      if (heroDao.type != HeroDefine.HERO_SP_TYPE_PALACE) {
         starMapTypeModel = (StarMapTypeModel)ApplicationContextProvider.getModelPoolEntity("starMapType", heroDao.id);
         return starMapTypeModel;
      } else {
         String palaceIdStr = ApplicationContextProvider.getConfigString("starDiWangId", "1|10000001,2|10000002,3|1000000,4|10000004");
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPool().getEntity("hero", heroDao.shareHeroId);
         if (heroModel == null) {
            return null;
         } else {
            String[] str = palaceIdStr.split(",");

            for(int i = 0; i < str.length; ++i) {
               if (Integer.parseInt(str[i].split("\\|")[0]) == heroModel.getType()) {
                  starMapTypeModel = (StarMapTypeModel)ApplicationContextProvider.getModelPoolEntity("starMapType", Integer.parseInt(str[i].split("\\|")[1]));
                  return starMapTypeModel;
               }
            }

            return null;
         }
      }
   }

   public static StarMapPoint getInitStarMapPoint(HeroDao heroDao, int starMapId, int starId, Map<Integer, StarMapPoint> heroStarMapPointMap) {
      StarAspectRumModel starAspectRumModel = getStarAspectRumModel(starMapId, starId, 1);
      if (null == starAspectRumModel) {
         return null;
      } else {
         int optionSkillGroup = 0;
         if (starAspectRumModel.getStarType() == 2) {
            StarMapTypeModel starMapTypeModel = getStarMapTypeModel(heroDao);
            List<Integer> starSelectGroupList = getStarSelectGroupList(starMapTypeModel.getType());
            List<Integer> hasSkillGroups = getHasSkillGroupList(heroStarMapPointMap);
            starSelectGroupList.removeAll(hasSkillGroups);
            if (starSelectGroupList.isEmpty()) {
               optionSkillGroup = -1;
            } else {
               optionSkillGroup = (Integer)starSelectGroupList.get(0);
            }
         }

         StarMapPoint starMapPoint = new StarMapPoint(starId, 0, optionSkillGroup);
         return starMapPoint;
      }
   }

   public static StarAspectRumModel getStarAspectRumModel(int id) {
      StarAspectRumModel starAspectRumModel = (StarAspectRumModel)ApplicationContextProvider.getModelPoolEntity("starAspectrum", id);
      if (null == starAspectRumModel) {
         logger.error("StarAspectRum中未配置 id={} 的配置", id);
      }

      return starAspectRumModel;
   }

   public static StarAspectRumModel getStarAspectRumModel(int starMapId, int starId, int level) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, StarAspectRumModel>> starId_levelModelMap = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customStarAspectrum", starMapId);
      if (null == starId_levelModelMap) {
         logger.error("StarAspectRum 配置异常 starMapId:{}", starMapId);
         return null;
      } else {
         ConcurrentHashMap<Integer, StarAspectRumModel> levelModel = (ConcurrentHashMap)starId_levelModelMap.get(starId);
         if (null == levelModel) {
            logger.error("StarAspectRum 配置异常 starMapId:{} starId:{}", starMapId, starId);
            return null;
         } else {
            StarAspectRumModel starAspectRumModel = (StarAspectRumModel)levelModel.get(level);
            if (null == starAspectRumModel) {
               logger.error("StarAspectRum 配置异常 starMapId:{} starId:{} level:{}", new Object[]{starMapId, starId, level});
            }

            return starAspectRumModel;
         }
      }
   }

   public static StarSkillModel getStarSkillModel(int group, int classify, int level) {
      String key = group + "_" + classify + "_" + level;
      StarSkillModel starSkillModel = (StarSkillModel)ApplicationContextProvider.getModelPoolEntity("customStarSkill", key);
      return starSkillModel;
   }

   public static List<CommonMsg.StarMapPointInfo> toBuilderStarMapPointInfoList(Map<Integer, StarMapPoint> starMapPointMap) {
      List<CommonMsg.StarMapPointInfo> starMapPointInfoList = new ArrayList();
      if (starMapPointMap != null && !starMapPointMap.isEmpty()) {
         for(Map.Entry<Integer, StarMapPoint> starId_starMapPoint : starMapPointMap.entrySet()) {
            StarMapPoint value = (StarMapPoint)starId_starMapPoint.getValue();
            CommonMsg.StarMapPointInfo.Builder starMapPointInfo = CommonMsg.StarMapPointInfo.newBuilder();
            starMapPointInfo.setStarId(value.starId);
            starMapPointInfo.setStarLv(value.starLv);
            starMapPointInfo.setOptionSkillGroup(value.optionSkillGroup);
            starMapPointInfoList.add(starMapPointInfo.build());
         }

         return starMapPointInfoList;
      } else {
         return starMapPointInfoList;
      }
   }

   public static List<Integer> getStarSelectGroupList(int type) {
      List<Integer> allGroupList = new ArrayList();
      Set<Integer> groups = ApplicationContextProvider.getModelPoolEntity("customStarSelectSkill", type);
      if (null == groups) {
         logger.error("StarSelectSkill 配置有误 typeLimit缺少:{}", type);
         return allGroupList;
      } else {
         allGroupList.addAll(groups);
         return allGroupList;
      }
   }

   public static List<Integer> getHasSkillGroupList(Map<Integer, StarMapPoint> heroStarMapPointMap) {
      List<Integer> hasSkillGroups = new ArrayList();
      if (null != heroStarMapPointMap && !heroStarMapPointMap.isEmpty()) {
         for(Map.Entry<Integer, StarMapPoint> starId_starMapPoint : heroStarMapPointMap.entrySet()) {
            StarMapPoint value = (StarMapPoint)starId_starMapPoint.getValue();
            if (value.optionSkillGroup > 0) {
               hasSkillGroups.add(value.optionSkillGroup);
            }
         }

         return hasSkillGroups;
      } else {
         return hasSkillGroups;
      }
   }

   public static int recStarMapTotalLv(Map<Integer, StarMapPoint> heroStarMapPointMap) {
      if (null != heroStarMapPointMap && !heroStarMapPointMap.isEmpty()) {
         Map<Integer, StarMapPoint> tempHeroStarMapPointMap = new HashMap(heroStarMapPointMap);
         int totalLv = 0;

         for(Map.Entry<Integer, StarMapPoint> starId_starMapPoint : tempHeroStarMapPointMap.entrySet()) {
            StarMapPoint value = (StarMapPoint)starId_starMapPoint.getValue();
            totalLv += value.starLv;
         }

         return totalLv;
      } else {
         return 0;
      }
   }
}
