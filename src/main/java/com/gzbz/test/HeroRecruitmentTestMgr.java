package com.gzbz.test;

import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroRecruitmentPart;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HeroEmployeeLibModel;
import com.gzbz.model.HeroEmployeeModel;
import com.gzbz.model.HeroModel;
import com.gzbz.protobuf.HeroMsg;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HeroRecruitmentTestMgr extends GameMgr {
   static Logger logger = LoggerFactory.getLogger(HeroRecruitmentTestMgr.class);
   @Autowired
   GameModelPool gameModelPool;
   ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, Integer>> heroIdMap = new ConcurrentHashMap();

   protected void init() throws Exception {
   }

   public void testHeroRecruitment(int recruitmentrNum, int sleepNum) {
      long currentTime = System.currentTimeMillis();
      logger.info("开始招募，次数={}", recruitmentrNum);

      for(int i = 1; i <= 7; ++i) {
         this.testHeroRecruitmentByType(i, recruitmentrNum, sleepNum);
      }

      logger.info("招募结束，用时={}", System.currentTimeMillis() - currentTime);
   }

   public void testHeroRecruitmentByType(int type, int recruitmentrNum, int sleepNum) {
      ConcurrentHashMap<Integer, Integer> map = (ConcurrentHashMap)this.heroIdMap.getOrDefault(type, new ConcurrentHashMap());
      HeroEmployeeModel heroEmployeeModel = (HeroEmployeeModel)this.gameModelPool.getEntity("heroEmployee", type);

      for(int i = 0; i < recruitmentrNum; ++i) {
         if (sleepNum == 1 && i % 1000 == 999) {
            try {
               Thread.sleep(5L);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }

         int heroId = this.getRecruitmentHeroId(heroEmployeeModel.getLibId());
         int oldValue = (Integer)map.getOrDefault(heroId, 0);
         map.put(heroId, oldValue + 1);
      }

      this.printHeroNum(type, map, recruitmentrNum);
   }

   public void printHeroNum(int type, ConcurrentHashMap<Integer, Integer> map, int recruitmentrNum) {
      try {
         Map<Integer, Integer> starMap = new HashMap();
         File file = new File("heroRecruitment.txt");
         if (!file.exists()) {
            file.createNewFile();
         }

         FileWriter fileWriter = new FileWriter("heroRecruitment.txt", true);
         BufferedWriter bw = new BufferedWriter(fileWriter);
         bw.write(String.format("====招募类型：%d，总次数：%d ====", type, recruitmentrNum));
         bw.newLine();
         bw.write(String.format("====英雄ID===="));
         bw.newLine();

         for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int heroId = (Integer)entry.getKey();
            HeroModel heroModel = (HeroModel)this.gameModelPool.getEntity("hero", heroId);
            int startNum = (Integer)starMap.getOrDefault(heroModel.getStar(), 0);
            starMap.put(heroModel.getStar(), startNum + (Integer)entry.getValue());
            bw.write(String.format("%s,id:%d,star:%d,num:%d", heroModel.getName(), entry.getKey(), heroModel.getStar(), entry.getValue()));
            bw.newLine();
         }

         bw.newLine();
         bw.write(String.format("====英雄Star===="));
         bw.newLine();

         for(Map.Entry<Integer, Integer> entry : starMap.entrySet()) {
            bw.write(String.format("star:%d,num:%d", entry.getKey(), entry.getValue()));
            bw.newLine();
         }

         bw.newLine();
         bw.newLine();
         bw.close();
         fileWriter.close();
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public int getRecruitmentHeroId(int libId) {
      List<HeroEmployeeLibModel> heroEmployeeLibList = (List)this.gameModelPool.getEntity("custom_heroEmployeeLib", libId);
      int totalProbabilityNum = 0;

      for(HeroEmployeeLibModel model : heroEmployeeLibList) {
         totalProbabilityNum += model.getOdds();
      }

      int r = RandomUtil.randInt(totalProbabilityNum);
      int tVal = 0;

      for(HeroEmployeeLibModel model : heroEmployeeLibList) {
         tVal += model.getOdds();
         if (tVal > r) {
            return model.getHeroId();
         }
      }

      return 0;
   }

   public void test(GamePlayer gamePlayer) {
      gamePlayer.pushTask(() -> {
         HeroRecruitmentPart heroRecruitmentPart = (HeroRecruitmentPart)gamePlayer.getMgrPart(HeroRecruitmentPart.class);
         HeroEmployeeModel heroEmployeeModel = (HeroEmployeeModel)gamePlayer.getGameModelPool().getEntity("heroEmployee", 4);
         Map<Integer, Integer> starMap = new HashMap();

         for(int i = 0; i < 10000000; ++i) {
            List<HeroModel> heroModels = heroRecruitmentPart.getHeroList(HeroMsg.RecruitmentType.PROFESSIONAL, HeroMsg.NumType.TEN_TIMES, 10, 0, heroEmployeeModel);
            int fiveStar = 0;

            for(HeroModel heroModel : heroModels) {
               if (heroModel.getStar() == 5) {
                  ++fiveStar;
               }
            }

            int oldVal = (Integer)starMap.getOrDefault(fiveStar, 0);
            starMap.put(fiveStar, oldVal + 1);
         }

         for(Map.Entry<Integer, Integer> entry : starMap.entrySet()) {
            logger.info("抽到{}个五星武将次数={}", entry.getKey(), entry.getValue());
         }

      });
   }
}
