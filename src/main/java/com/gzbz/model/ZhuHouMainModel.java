package com.gzbz.model;

import cn.hutool.core.util.StrUtil;
import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "heroGameMain"
)
public class ZhuHouMainModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "升级加速道具"
   )
   private int heroGameAddSpeed;
   @ModelColumnAnno(
      comment = "加速时间（秒）"
   )
   private int heroGameAddSpeedTime;
   @ModelColumnAnno(
      comment = "元宝加速时间（*元宝加速1分钟）"
   )
   private int heroGameAddGold;
   @ModelColumnAnno(
      comment = "抽奖道具"
   )
   private int heroGameLottery;
   @ModelColumnAnno(
      comment = "新玩家初始抽奖道具数量"
   )
   private int heroGameLotteryInitialNum;
   @ModelColumnAnno(
      comment = "加速抽卡宝箱等级"
   )
   private int heroGameLotterySpeed;
   @ModelColumnAnno(
      comment = "后台抽卡宝箱等级"
   )
   private int heroGameLotteryBackstage;
   @ModelColumnAnno(
      comment = "锤炼加速"
   )
   private String accelerate;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Integer> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ZhuHouMainModel model = (ZhuHouMainModel)entry.getValue();
         String[] strArr = StrUtil.split(model.getAccelerate(), "|");

         for(String accStr : strArr) {
            String[] strings = StrUtil.split(accStr, ",");
            tempMap.put(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));
         }
      }

      pool.putMap("CustomHeroGameMain", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getHeroGameAddSpeed() {
      return this.heroGameAddSpeed;
   }

   public void setHeroGameAddSpeed(int heroGameAddSpeed) {
      this.checkModify();
      this.heroGameAddSpeed = heroGameAddSpeed;
   }

   public int getHeroGameAddSpeedTime() {
      return this.heroGameAddSpeedTime;
   }

   public void setHeroGameAddSpeedTime(int heroGameAddSpeedTime) {
      this.checkModify();
      this.heroGameAddSpeedTime = heroGameAddSpeedTime;
   }

   public int getHeroGameAddGold() {
      return this.heroGameAddGold;
   }

   public void setHeroGameAddGold(int heroGameAddGold) {
      this.checkModify();
      this.heroGameAddGold = heroGameAddGold;
   }

   public int getHeroGameLottery() {
      return this.heroGameLottery;
   }

   public void setHeroGameLottery(int heroGameLottery) {
      this.checkModify();
      this.heroGameLottery = heroGameLottery;
   }

   public int getHeroGameLotteryInitialNum() {
      return this.heroGameLotteryInitialNum;
   }

   public void setHeroGameLotteryInitialNum(int heroGameLotteryInitialNum) {
      this.checkModify();
      this.heroGameLotteryInitialNum = heroGameLotteryInitialNum;
   }

   public int getHeroGameLotterySpeed() {
      return this.heroGameLotterySpeed;
   }

   public void setHeroGameLotterySpeed(int heroGameLotterySpeed) {
      this.checkModify();
      this.heroGameLotterySpeed = heroGameLotterySpeed;
   }

   public int getHeroGameLotteryBackstage() {
      return this.heroGameLotteryBackstage;
   }

   public void setHeroGameLotteryBackstage(int heroGameLotteryBackstage) {
      this.checkModify();
      this.heroGameLotteryBackstage = heroGameLotteryBackstage;
   }

   public String getAccelerate() {
      return this.accelerate;
   }

   public void setAccelerate(String accelerate) {
      this.accelerate = accelerate;
   }
}
