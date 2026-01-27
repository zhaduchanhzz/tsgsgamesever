package com.gzbz.test;

import allMgr.MgrParent;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerPrayDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.pray.PrayPart;
import com.gzbz.model.PrayModel;
import com.gzbz.model.PrayRewardLibModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.robot.MonsterManager;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class PrayTest extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(MonsterManager.class);
   private Map<String, Integer> prayRewardLimMap = null;
   private Set<Integer> surpriseLibSet = new HashSet();
   public int idx;
   public ScheduledFuture scheduledFutur;

   public void init(MgrParent mgr) {
      super.init(mgr);
      this.surpriseLibSet.add(102);
      this.surpriseLibSet.add(202);
   }

   public void createLibMap() {
      if (this.prayRewardLimMap == null) {
         this.prayRewardLimMap = new HashMap();
         Map<Integer, PrayRewardLibModel> modelMap = ApplicationContextProvider.<Integer, PrayRewardLibModel>getModelPoolMap("prayRewardLib");

         for(Map.Entry<Integer, PrayRewardLibModel> entry : modelMap.entrySet()) {
            PrayRewardLibModel model = (PrayRewardLibModel)entry.getValue();
            ResourceModel resourceModel = new ResourceModel(model.getRewardType(), model.getRewardId(), model.getRewardNum());
            this.prayRewardLimMap.putIfAbsent(resourceModel.toString(), entry.getKey());
         }
      }

   }

   public int getResourceId(String strResourceModel) {
      if (this.prayRewardLimMap == null) {
         this.createLibMap();
      }

      int id = (Integer)this.prayRewardLimMap.getOrDefault(strResourceModel, 0);
      return id;
   }

   public void testPrayRefresh(int prayId, int count) {
      PrayPart prayPart = (PrayPart)this.player.getMgrPart(PrayPart.class);
      int totalCost = 0;
      Map<Integer, Map<String, Integer>> recordMap = new HashMap();
      PrayModel model = (PrayModel)this.player.getGameModelPool().getEntity("pray", prayId);

      for(int i = 0; i < count; ++i) {
         prayPart.refreshPrayReward(prayId);
         PlayerPrayDao playerPrayDao = (PlayerPrayDao)this.player.getData("tb_player_pray", this.player.getPlayerId(), prayId);
         totalCost += ((ResourceModel)model.getRefreshCost().get(0)).getValue();

         for(Map.Entry<KeyValFun, ResourceModel> entry : playerPrayDao.prayInfo.rewards.entrySet()) {
            KeyValFun keyValFun = (KeyValFun)entry.getKey();
            int pos = keyValFun.getKey();
            Map<String, Integer> map = (Map)recordMap.computeIfAbsent(pos, (v) -> new HashMap());
            String str = ((ResourceModel)entry.getValue()).toString();
            int value = (Integer)map.getOrDefault(str, 0);
            map.put(str, value + 1);
         }
      }

      logger.info("夺宝刷新概率 prayId:{}", prayId);
      this.printRefreshInfo(prayId, count, totalCost, recordMap);
   }

   public void printRefreshInfo(int prayId, int count, int totalCost, Map<Integer, Map<String, Integer>> recordMap) {
      try {
         String filePath = "PrayRefresh.txt";
         File file = new File(filePath);
         if (!file.exists()) {
            file.createNewFile();
         }

         FileWriter fileWriter = new FileWriter(filePath, true);
         BufferedWriter bw = new BufferedWriter(fileWriter);
         bw.write(String.format("夺宝刷新概率 prayId:%d , 刷新总次数：%d 总花费：%d", prayId, count, totalCost));
         bw.newLine();

         for(Map.Entry<Integer, Map<String, Integer>> entry : recordMap.entrySet()) {
            bw.newLine();
            bw.write("======================= 华丽丽分割线 =======================");
            bw.newLine();
            bw.write(String.format("位置:%d", entry.getKey()));
            bw.newLine();
            Map<String, Integer> resourceMap = (Map)entry.getValue();

            for(Map.Entry<String, Integer> cellEntery : resourceMap.entrySet()) {
               int id = this.getResourceId((String)cellEntery.getKey());
               bw.write(String.format("序号id:%d  物品：%s， 出现次数:%d", id, cellEntery.getKey(), cellEntery.getValue()));
               bw.newLine();
            }
         }

         bw.newLine();
         bw.newLine();
         bw.close();
         fileWriter.close();
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public void testDrawCard(int prayId, int prayIndex, int count) {
      this.idx = 0;
      this.scheduledFutur = this.player.schedule(0L, 10L, () -> {
         if (!Objects.isNull(this.scheduledFutur)) {
            ++this.idx;
            if (this.idx > count) {
               this.scheduledFutur.cancel(false);
               this.scheduledFutur = null;
            } else {
               this.testSurprise(this.idx, prayId, prayIndex);
            }

         }
      });
   }

   public void testSurprise(int idx, int prayId, int prayIndex) {
      long curTime = System.currentTimeMillis();
      PrayPart prayPart = (PrayPart)this.player.getMgrPart(PrayPart.class);
      PrayModel prayModel = (PrayModel)ApplicationContextProvider.getModelPoolEntity("pray", prayId);
      if (prayModel != null) {
         prayPart.refreshPrayReward(prayId);
         logger.info("idx:{} 进行了{},{}连抽", new Object[]{idx, prayModel.getName(), prayModel.getPrayTimes().get(prayIndex)});
         int totalCount = 0;
         ResourceModel bigResource = null;
         boolean surprise = false;

         while(!surprise && totalCount < 300) {
            ++totalCount;

            for(ResourceModel resourceModel : prayPart.handlePray(prayId, prayIndex)) {
               if (resourceModel.getValue() == 0) {
                  logger.info("随不到物品，检测是否资源不足导致");
                  return;
               }

               int id = this.getResourceId(resourceModel.toString());
               PrayRewardLibModel libModel = (PrayRewardLibModel)ApplicationContextProvider.getModelPoolEntity("prayRewardLib", id);
               if (this.surpriseLibSet.contains(libModel.getGroupId())) {
                  logger.info("获得了大奖 {}", resourceModel.toString());
                  surprise = true;
                  bigResource = resourceModel;
               }
            }
         }

         if (surprise) {
            ResourceModel resourceModel = (ResourceModel)prayModel.getCost().get(prayIndex);
            ResourceModel costResourceModel = new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * totalCount);
            logger.info("总共进行了{}抽奖，消耗了{}, 大奖抱回家", totalCount, costResourceModel.toString());
            this.printDrawCardInfo(idx, prayId, prayIndex, totalCount, bigResource, costResourceModel);
         } else {
            logger.info("运气太差了，{}次都没抽中大奖", totalCount);
         }

         logger.info("抽取一次大奖花费的时间：{}", System.currentTimeMillis() - curTime);
      }
   }

   public void printDrawCardInfo(int idx, int prayId, int prayIndex, int count, ResourceModel bigResource, ResourceModel costResourceModel) {
      PrayModel prayModel = (PrayModel)ApplicationContextProvider.getModelPoolEntity("pray", prayId);

      try {
         String filePath = "PrayDrawCard.txt";
         File file = new File(filePath);
         if (!file.exists()) {
            file.createNewFile();
         }

         FileWriter fileWriter = new FileWriter(filePath, true);
         BufferedWriter bw = new BufferedWriter(fileWriter);
         bw.newLine();
         bw.write(String.format("第%d次:%s - %02d 抽奖, 第%d次抽中大奖, 大奖为%s, 消耗:%s", idx, prayModel.getName(), prayModel.getPrayTimes().get(prayIndex), count, bigResource.toString(), costResourceModel.toString()));
         bw.newLine();
         bw.close();
         fileWriter.close();
      } catch (IOException e) {
         e.printStackTrace();
      }

   }
}
