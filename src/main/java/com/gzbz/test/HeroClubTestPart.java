package com.gzbz.test;

import allMgr.PartAnnotation;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroClubPart;
import com.gzbz.model.HeroExchangeModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.HeroRecruitLibModel;
import com.gzbz.model.HeroRecruitModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.ResourceModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroClubTestPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(HeroClubTestPart.class);

   public void test() {
      this.logger.info("开始将星招募测试");
      int num = 10000;
      this.testRecruit(num);
      this.testExchange(num);
      this.logger.info("结束将星招募测试");
   }

   public void testRecruit(int num) {
      int[] type = new int[]{1, 2, 3, 4};

      for(int tyepId : type) {
         HeroRecruitModel heroRecruitMode = (HeroRecruitModel)this.player.getGameModelPool().getEntity("heroRecruit", tyepId);
         Map<Integer, Integer> heroMap = new HashMap();
         List<ResourceModel> needList = new ArrayList();
         List<ResourceModel> receiveList = new ArrayList();

         for(int i = 0; i < num; ++i) {
            HeroClubPart heroClubPart = (HeroClubPart)this.player.getMgrPart(HeroClubPart.class);
            HeroRecruitLibModel heroRecruitLibModel = heroClubPart.randomRecruitHeroId(tyepId);
            int oldValue = (Integer)heroMap.getOrDefault(heroRecruitLibModel.getPropsId(), 0);
            heroMap.put(heroRecruitLibModel.getPropsId(), oldValue + 1);

            for(ResourceModel consumeItem : heroRecruitMode.getConsumeItems()) {
               ResourceModel.addResourceToList(needList, consumeItem);
            }

            for(ResourceModel receiveItem : heroRecruitMode.getReceiveItems()) {
               ResourceModel.addResourceToList(receiveList, receiveItem);
            }
         }

         this.print(tyepId, heroMap, needList, receiveList, num);
      }

   }

   public void testExchange(int num) {
      StringBuffer sb = new StringBuffer();
      sb.append("=========置换========").append("\n");
      int[] heroId = new int[]{21510, 21508, 21507, 21505, 21504, 21503, 21502, 21501, 21405, 21404, 21403, 21402, 21401, 22511, 22510, 22509, 22508, 22507, 22504, 22502, 22505, 22404, 22403, 22402, 22401, 22405, 23510, 23508, 23507, 23506, 23504, 23503, 23513, 23502, 23405, 23404, 23403, 23402, 23401};
      HeroClubPart heroClubPart = (HeroClubPart)this.player.getMgrPart(HeroClubPart.class);

      for(int id : heroId) {
         sb.append("=========英雄Id=").append(id).append("======").append("\n");
         HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", id);
         String key = heroModel.getNation() + "" + heroModel.getStar();
         HeroExchangeModel var10000 = (HeroExchangeModel)this.player.getGameModelPool().getEntity("heroExchange", key);
         Map<Integer, Integer> heroMap = new HashMap();

         for(int i = 0; i < num; ++i) {
            int randomHeroId = heroClubPart.randomExchangeHeroId(Integer.parseInt(key));
            int oldValue = (Integer)heroMap.getOrDefault(randomHeroId, 0);
            heroMap.put(randomHeroId, oldValue + 1);
         }

         sb.append("==ID，星级，数量，名称====").append("\n");

         for(Map.Entry<Integer, Integer> entry : heroMap.entrySet()) {
            HeroModel exchangeHeroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", entry.getKey());
            sb.append(entry.getKey()).append(",");
            sb.append(exchangeHeroModel.getStar()).append(",");
            sb.append(entry.getValue()).append(",");
            sb.append(exchangeHeroModel.getName()).append(",");
            sb.append("\n");
         }
      }

      this.print(sb);
   }

   public void print(StringBuffer stringBuffer) {
      try {
         File file = new File("test/heroClubRecruit.txt");
         if (!file.exists()) {
            file.createNewFile();
         }

         FileWriter fileWriter = new FileWriter("test/heroClubRecruit.txt", true);
         BufferedWriter bw = new BufferedWriter(fileWriter);
         bw.write(stringBuffer.toString());
         bw.close();
         fileWriter.close();
         StringBuffer var6 = null;
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public void print(int type, Map<Integer, Integer> heroMap, List<ResourceModel> needList, List<ResourceModel> receiveList, int recruitmentrNum) {
      try {
         File file = new File("test/heroClubRecruit.txt");
         if (!file.exists()) {
            file.createNewFile();
         }

         FileWriter fileWriter = new FileWriter("test/heroClubRecruit.txt", true);
         BufferedWriter bw = new BufferedWriter(fileWriter);
         bw.write(String.format("====招募类型：%d，总次数：%d ====", type, recruitmentrNum));
         bw.newLine();
         bw.write("==类型，ID，星级，数量，名称====");
         bw.newLine();

         for(Map.Entry<Integer, Integer> entry : heroMap.entrySet()) {
            int heroId = (Integer)entry.getKey();
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", heroId);
            bw.write(String.format("%d,%d,%d,%d,%s", type, entry.getKey(), itemModel.getStar(), entry.getValue(), itemModel.getName()));
            bw.newLine();
         }

         bw.newLine();
         bw.write(String.format("====总消耗===="));
         bw.newLine();

         for(ResourceModel resourceModel : needList) {
            bw.write(String.format("id:%d,num:%d", resourceModel.getId(), resourceModel.getValue()));
            bw.newLine();
         }

         bw.write(String.format("====获取===="));
         bw.newLine();

         for(ResourceModel resourceModel : receiveList) {
            bw.write(String.format("id:%d,num:%d", resourceModel.getId(), resourceModel.getValue()));
            bw.newLine();
         }

         bw.close();
         fileWriter.close();
      } catch (Exception e) {
         e.printStackTrace();
      }

   }
}
