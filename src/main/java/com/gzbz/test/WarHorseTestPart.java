package com.gzbz.test;

import allMgr.PartAnnotation;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.horse.WarHorse;
import com.gzbz.model.ItemModel;
import com.gzbz.model.WarHorseBaseModel;
import com.gzbz.model.WarHorseSkillModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class WarHorseTestPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(AdventureTaskTestPart.class);

   public void gmHorseSkillTest() {
      logger.info("开始");
      Map<Integer, WarHorseBaseModel> warHorseBaseModelMap = this.player.getGameModelPool().getMap("warHorseBase");
      if (warHorseBaseModelMap != null && !warHorseBaseModelMap.isEmpty()) {
         int loop = 100000;
         StringBuffer sb = new StringBuffer();

         for(Map.Entry<Integer, WarHorseBaseModel> entry : warHorseBaseModelMap.entrySet()) {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", entry.getKey());
            sb.append("==========随机战马ID=").append(entry.getKey()).append(",").append(itemModel.getName()).append(",").append(loop).append("次").append("\n").append("\n");
            Map<Integer, Integer> skillSizeMap = new HashMap();
            Map<Integer, Integer> qualityMap = new HashMap();
            Map<Integer, Integer> skillLvMap = new HashMap();
            Map<Integer, Integer> skillIdMap = new HashMap();
            Map<Integer, Integer> skillTypeMap = new HashMap();
            int oldVla = 0;
            int key = 0;

            for(int i = 0; i < loop; ++i) {
               WarHorse warHorse = new WarHorse();
               warHorse.init(0, 1, itemModel, (GamePlayer)null);
               key = warHorse.upSkills.size();
               oldVla = (Integer)MapUtil.getOrDefault(skillSizeMap, key, 0);
               skillSizeMap.put(key, oldVla + 1);

               for(Integer upSkill : warHorse.upSkills) {
                  WarHorseSkillModel warHorseSkillModel = (WarHorseSkillModel)this.player.getGameModelPool().getEntity("warHorseSkill", upSkill);
                  if (warHorseSkillModel != null) {
                     key = warHorseSkillModel.getQuality();
                     oldVla = (Integer)MapUtil.getOrDefault(qualityMap, key, 0);
                     qualityMap.put(key, oldVla + 1);
                     key = warHorseSkillModel.getLv();
                     oldVla = (Integer)MapUtil.getOrDefault(skillLvMap, key, 0);
                     skillLvMap.put(key, oldVla + 1);
                     key = upSkill;
                     oldVla = (Integer)MapUtil.getOrDefault(skillIdMap, key, 0);
                     skillIdMap.put(key, oldVla + 1);
                     key = warHorseSkillModel.getType();
                     oldVla = (Integer)MapUtil.getOrDefault(skillTypeMap, key, 0);
                     skillTypeMap.put(key, oldVla + 1);
                  }
               }
            }

            sb.append("技能类型").append("\n");

            for(Map.Entry<Integer, Integer> subEntry : skillTypeMap.entrySet()) {
               sb.append(subEntry.getKey()).append("\t").append(subEntry.getValue()).append("\n");
            }

            sb.append("技能ID").append("\n");

            for(Map.Entry<Integer, Integer> subEntry : skillIdMap.entrySet()) {
               sb.append(subEntry.getKey()).append("\t").append(subEntry.getValue()).append("\n");
            }

            sb.append("技能个数").append("\n");

            for(Map.Entry<Integer, Integer> subEntry : skillSizeMap.entrySet()) {
               sb.append(subEntry.getKey()).append("\t").append(subEntry.getValue()).append("\n");
            }

            sb.append("技能品质").append("\n");

            for(Map.Entry<Integer, Integer> subEntry : qualityMap.entrySet()) {
               sb.append(subEntry.getKey()).append("\t").append(subEntry.getValue()).append("\n");
            }

            sb.append("技能等级").append("\n");

            for(Map.Entry<Integer, Integer> subEntry : skillLvMap.entrySet()) {
               sb.append(subEntry.getKey()).append("\t").append(subEntry.getValue()).append("\n");
            }

            sb.append("\n");
            sb.append("\n");
         }

         this.print(sb);
         logger.info("结束");
      }
   }

   public void print(StringBuffer stringBuffer) {
      try {
         File file = new File("test/warhorse.txt");
         if (!file.exists()) {
            file.createNewFile();
         }

         FileWriter fileWriter = new FileWriter("test/warhorse.txt", true);
         BufferedWriter bw = new BufferedWriter(fileWriter);
         bw.write(stringBuffer.toString());
         bw.close();
         fileWriter.close();
         StringBuffer var6 = null;
      } catch (Exception e) {
         e.printStackTrace();
      }

   }
}
