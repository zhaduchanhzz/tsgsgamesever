package com.gzbz.test;

import allMgr.PartAnnotation;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.bean.ShopJsonData;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopWarcraftItemModel;
import com.gzbz.model.ShopWarcraftLibModel;
import com.gzbz.model.ShopWarcraftModel;
import com.gzbz.model.manager.ConfigManager;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
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
public class ShopWarcraftTestPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(AdventureTaskTestPart.class);
   @Autowired
   ConfigManager configManager;
   public StringBuffer sb = new StringBuffer();
   public int loop = 0;
   private TreeMap<Integer, Integer> bookNum = new TreeMap();

   public void test() {
      logger.info("开始刷新，总次数={}", 10000);

      for(int i = 0; i < 10000; ++i) {
         this.randomShop();
      }

      for(Map.Entry<Integer, Integer> entry : this.bookNum.entrySet()) {
         logger.info("{}\t{}", entry.getKey(), entry.getValue());
      }

      this.bookNum.clear();
   }

   private void randomShop() {
      ShopJsonData shopJsonData = new ShopJsonData();
      Map<Integer, ShopWarcraftModel> modelMap = this.player.getGameModelPool().getMap("shopWarcraft");

      for(Map.Entry<Integer, ShopWarcraftModel> entry : modelMap.entrySet()) {
         ShopWarcraftModel model = (ShopWarcraftModel)entry.getValue();
         int groupId = model.getGroupId();

         for(int i = 0; i < 100; ++i) {
            int id = this.getShopItem(groupId);
            if (id > 0 && !shopJsonData.map.containsKey(id)) {
               ShopWarcraftItemModel itemModel = (ShopWarcraftItemModel)this.player.getGameModelPool().getEntity("shopWarcraftItem", id);
               if (itemModel != null) {
                  shopJsonData.map.put(itemModel.getId(), 0);
                  break;
               }
            }
         }
      }

      if (shopJsonData.map.size() != modelMap.size()) {
         System.out.println("----- 兵法商城 随机的物品数量不对 -----");
      } else {
         for(Map.Entry<Integer, Integer> entry : shopJsonData.map.entrySet()) {
            if (!this.bookNum.containsKey(entry.getKey())) {
               this.bookNum.put(entry.getKey(), 1);
            } else {
               int old = (Integer)this.bookNum.get(entry.getKey());
               this.bookNum.put(entry.getKey(), old + 1);
            }
         }
      }

   }

   private int getShopItem(int groupId) {
      PlayerPublicDao playerDao = this.player.getPublicDao();
      int totalWeight = 0;
      List<ShopWarcraftLibModel> list = new ArrayList();
      Map<Integer, ShopWarcraftLibModel> modelMap = this.player.getGameModelPool().getMap("shopWarcraftLib");

      for(Map.Entry<Integer, ShopWarcraftLibModel> entry : modelMap.entrySet()) {
         ShopWarcraftLibModel model = (ShopWarcraftLibModel)entry.getValue();
         if (model.getGroupId() == groupId && (playerDao.lv >= model.getLvLimitEx() || playerDao.lv >= model.getLvLimit())) {
            totalWeight += model.getWeight();
            list.add(model);
         }
      }

      int tempValue = 0;
      int r = RandomUtil.randInt(totalWeight);

      for(ShopWarcraftLibModel model : list) {
         tempValue += model.getWeight();
         if (tempValue > r) {
            return model.getShopItem();
         }
      }

      return 0;
   }

   public void print(StringBuffer stringBuffer) {
      try {
         File file = new File("test/shopWarcraft.txt");
         if (!file.exists()) {
            file.createNewFile();
         }

         FileWriter fileWriter = new FileWriter("test/shopWarcraft.txt", true);
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
