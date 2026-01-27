package com.gzbz.test;

import allMgr.PartAnnotation;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mysteryShop.MysteryShopPart;
import com.gzbz.model.MysteryShopLibModel;
import com.gzbz.model.MysteryShopModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MysteryShopTestPart extends PlayerPart {
   private Map<Integer, List<KeyValFun>> level2group = new HashMap();

   public void randomShopData(int count) {
      if (this.level2group.size() == 0) {
         this.initLevelWeight();
      }

      try {
         String filePath = "MysteryShop.txt";
         File file = new File(filePath);
         if (!file.exists()) {
            file.createNewFile();
         }

         FileWriter fileWriter = new FileWriter(filePath, true);
         BufferedWriter bw = new BufferedWriter(fileWriter);
         bw.newLine();
         bw.write(String.format("神秘商店刷新测试 刷新%d次", count));
         MysteryShopPart mysteryShopPart = (MysteryShopPart)this.player.getMgrPart(MysteryShopPart.class);

         for(Map.Entry<Integer, List<KeyValFun>> entry : this.level2group.entrySet()) {
            Integer level = (Integer)entry.getKey();
            this.logger.info("====================================================");
            this.logger.info("等级：{} 包含的 group:", level);
            bw.write(String.format("等级:%d包含的 group:", level));
            List<KeyValFun> list = (List)entry.getValue();
            int totalWeight = 0;

            for(int i = 0; i < list.size(); ++i) {
               this.logger.info("group:{} weight:{}", ((KeyValFun)list.get(i)).getKey(), ((KeyValFun)list.get(i)).getVal());
               bw.write(String.format(" (group:%d weight:%d) - ", ((KeyValFun)list.get(i)).getKey(), ((KeyValFun)list.get(i)).getVal()));
               totalWeight += ((KeyValFun)list.get(i)).getVal();
            }

            bw.newLine();
            bw.write(String.format("总比重值:%d", totalWeight));
            bw.newLine();
            Map<Integer, Integer> groupRecordMap = new HashMap();
            Map<Integer, Integer> itemRecordMap = new HashMap();

            for(int i = 0; i < count; ++i) {
               GamePlayer var10000 = this.player;
               int group = GamePlayer.countRate(list);
               int groupValue = (Integer)groupRecordMap.getOrDefault(group, 0);
               groupRecordMap.put(group, groupValue + 1);
               int id = mysteryShopPart.randomShopItem(group);
               MysteryShopModel mysteryShopModel = (MysteryShopModel)ApplicationContextProvider.getModelPoolEntity("mysteryShop", id);
               if (mysteryShopModel != null) {
                  int value = (Integer)itemRecordMap.getOrDefault(id, 0);
                  itemRecordMap.put(id, value + 1);
               } else {
                  this.logger.info("随机出来一个不存在的物品 group:{}", group);
               }
            }

            this.logger.info("--------------- 等级随机物品记录 ---------------");
            bw.write(String.format("--- 等级随机物品记录 ---"));

            for(Map.Entry<Integer, Integer> tempEntry : groupRecordMap.entrySet()) {
               MysteryShopLibModel mysteryShopLibModel = (MysteryShopLibModel)ApplicationContextProvider.getModelPoolEntity("mysteryShopLib", (Integer)tempEntry.getKey());
               this.logger.info("group：{} 出现了 {} 次， 配置表中的比重为: {}", new Object[]{mysteryShopLibModel.getId(), tempEntry.getValue(), mysteryShopLibModel.getWeight()});
               bw.write(String.format("group：%d 出现了 %d 次， 配置表中的比重为: %d", mysteryShopLibModel.getId(), tempEntry.getValue(), mysteryShopLibModel.getWeight()));
               bw.newLine();
            }

            bw.newLine();
            bw.write(String.format("--- 随机物品 ---"));
            bw.newLine();
            this.logger.info("--- 随机物品 ---");

            for(Map.Entry<Integer, Integer> tempEntry : itemRecordMap.entrySet()) {
               MysteryShopModel mysteryShopModel = (MysteryShopModel)ApplicationContextProvider.getModelPoolEntity("mysteryShop", (Integer)tempEntry.getKey());
               this.logger.info("id：{} 出现了 {} 次， 配置表中的比重为: {}", new Object[]{mysteryShopModel.getId(), tempEntry.getValue(), mysteryShopModel.getWeight()});
               bw.write(String.format("id：%d 出现了 %d 次， 配置表中的比重为: %d", mysteryShopModel.getId(), tempEntry.getValue(), mysteryShopModel.getWeight()));
               bw.newLine();
            }
         }

         bw.close();
         fileWriter.close();
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public void initLevelWeight() {
      this.level2group.clear();
      Map<Integer, MysteryShopLibModel> map = ApplicationContextProvider.<Integer, MysteryShopLibModel>getModelPoolMap("mysteryShopLib");
      Set<Integer> levelSet = new HashSet();

      for(Map.Entry<Integer, MysteryShopLibModel> entry : map.entrySet()) {
         levelSet.add(((MysteryShopLibModel)entry.getValue()).getLevelBegin());
      }

      for(Integer level : levelSet) {
         for(Map.Entry<Integer, MysteryShopLibModel> entry : map.entrySet()) {
            MysteryShopLibModel libModel = (MysteryShopLibModel)entry.getValue();
            if (level >= libModel.getLevelBegin() && level < libModel.getLevelLimit()) {
               KeyValFun keyValFun = new KeyValFun(libModel.getGroup(), libModel.getWeight());
               ((List)this.level2group.computeIfAbsent(level, (v) -> new ArrayList())).add(keyValFun);
            }
         }
      }

   }
}
