package com.gzbz.test;

import allMgr.PartAnnotation;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.WarriorSignetCompoundModel;
import com.gzbz.model.fun.KeyValFun;
import java.util.HashMap;
import java.util.Map;
import misc.MapUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class WarriorSignetCompoundTestPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(WarriorSignetCompoundTestPart.class);
   private static int lastResult = 0;
   private static int successNum = 0;
   private static int failNum = 0;
   private static int conSuccessNum = 0;
   private static int conFailNum = 0;
   Map<Integer, Integer> successNumMap = new HashMap();
   Map<Integer, Integer> failNumMap = new HashMap();

   public void resetData() {
      lastResult = 0;
      successNum = 0;
      failNum = 0;
      conSuccessNum = 0;
      conFailNum = 0;
      this.successNumMap.clear();
      this.failNumMap.clear();
   }

   public void gmTest(String orderStr) {
      this.resetData();
      String[] orders = orderStr.split(",");
      int id = Integer.valueOf(orders[0]);
      int num = Integer.valueOf(orders[1]);
      int loop = Integer.valueOf(orders[2]);
      WarriorSignetCompoundModel compoundModel = (WarriorSignetCompoundModel)this.player.getGameModelPool().getEntity("warriorSignetCompound", id);
      if (compoundModel == null) {
         logger.info("参数错误，ID={}", id);
      } else {
         for(int i = 0; i < loop; ++i) {
            this.warriorSignetCompound(compoundModel, num);

            try {
               Thread.sleep(1L);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }

         logger.info("将印合成，ID={}，数量={}，合成次数={}", new Object[]{id, num, loop});
         logger.info("成功次数={}", successNum);
         logger.info("失败次数={}", failNum);
         logger.info("=====连续成功次数=====");

         for(Map.Entry<Integer, Integer> entry : this.successNumMap.entrySet()) {
            logger.info("连续成功{}次，出现次数={}", entry.getKey(), entry.getValue());
         }

         logger.info("=====连续失败次数=====");

         for(Map.Entry<Integer, Integer> entry : this.failNumMap.entrySet()) {
            logger.info("连续失败{}次，出现次数={}", entry.getKey(), entry.getValue());
         }

      }
   }

   public void warriorSignetCompound(WarriorSignetCompoundModel compoundModel, int useNum) {
      int rate = 0;

      for(KeyValFun fun : compoundModel.getRate()) {
         if (fun.getKey() == useNum) {
            rate = fun.getVal();
            break;
         }
      }

      if (rate == 0) {
         logger.info("魂印合成的概率出错");
         this.player.failure(6);
      } else {
         int idx = compoundModel.getRate().size() - 1;
         int random = RandomUtil.randInt(1, ((KeyValFun)compoundModel.getRate().get(idx)).getVal());
         if (random <= rate) {
            ++successNum;
            ++conSuccessNum;
            if (lastResult == -1) {
               int oldVal = (Integer)MapUtil.getOrDefault(this.failNumMap, conFailNum, 0);
               this.failNumMap.put(conFailNum, oldVal + 1);
               conFailNum = 0;
            }

            lastResult = 1;
         } else {
            ++failNum;
            ++conFailNum;
            if (lastResult == 1) {
               int oldVal = (Integer)MapUtil.getOrDefault(this.successNumMap, conSuccessNum, 0);
               this.successNumMap.put(conSuccessNum, oldVal + 1);
               conSuccessNum = 0;
            }

            lastResult = -1;
         }

      }
   }
}
