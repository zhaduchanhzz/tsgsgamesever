package com.gzbz.db;

import cn.hutool.core.util.StrUtil;
import com.gzbz.db.bean.HeroTypeAttrData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.HeroGameBoxLotteryModel;
import com.gzbz.model.ZhuHouAttrScoreModel;
import com.gzbz.protobuf.HeroCardMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.DataUtils;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_hero_card",
   resultType = 0,
   selectKey = {"playerId"}
)
public class HeroCardDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "当前宝箱等级"
   )
   private int curBoxLv = 1;
   @DBColumnAnno(
      comment = "宝箱升到下一级的时间戳"
   )
   public long boxNextLvTime;
   @DBColumnAnno(
      comment = "用于计算各个品质的保底",
      columnType = "TEXT",
      saveFun = "saveQualityLotteryNum",
      loadFun = "loadQualityLotteryNum"
   )
   public Map<Integer, Integer> qualityLotteryNum = new HashMap();
   @DBColumnAnno(
      comment = "今日抽取次数"
   )
   public int dailyLotteryNum = 0;
   @DBColumnAnno(
      comment = "是否赠送过初始抽奖道具"
   )
   public boolean isSendLotteryItem = false;
   @DBColumnAnno(
      comment = "自动抽卡选项",
      columnType = "TEXT",
      saveFun = "saveOption",
      loadFun = "loadOption"
   )
   public Map<Integer, Integer> option = new HashMap();
   @DBColumnAnno(
      comment = "当前完成的主线任务id"
   )
   public int completeMainTaskId = 0;
   @DBColumnAnno(
      comment = "累计抽卡次数"
   )
   public long lotteryCount = 0L;
   @DBColumnAnno(
      comment = "玩家等级（官职）"
   )
   public int curLevel = 1;
   @DBColumnAnno(
      comment = "玩家经验值"
   )
   public int exp;
   @DBColumnAnno(
      comment = "所有装备",
      columnType = "TEXT",
      saveFun = "saveEquips",
      loadFun = "loadEquips"
   )
   public Map<Integer, EquipData> equips = new HashMap();
   @DBColumnAnno(
      comment = "用于计算各个品质的保底",
      columnType = "TEXT",
      saveFun = "saveMust",
      loadFun = "loadMust"
   )
   public Map<Integer, Integer> equipMust = new HashMap();

   public void reset() {
      this.setCurBoxLv(1);
      this.boxNextLvTime = 0L;
      this.qualityLotteryNum.clear();
      this.dailyLotteryNum = 0;
      this.isSendLotteryItem = false;
      this.option.clear();
      this.completeMainTaskId = 0;
      this.lotteryCount = 0L;
      this.updateOp();
   }

   public String saveEquips() {
      return JsonUtil.beanToJson(this.equips);
   }

   public void loadEquips(String data) {
      this.equips = JsonUtil.jsonToMap(data, Integer.class, EquipData.class);
   }

   public String saveMust() {
      return JsonUtil.beanToJson(this.equipMust);
   }

   public void loadMust(String data) {
      this.equipMust = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveQualityLotteryNum() {
      return DataUtils.int_intMapToString(this.qualityLotteryNum);
   }

   public void loadQualityLotteryNum(String data) {
      this.qualityLotteryNum = DataUtils.stringToInt_intMap(data);
   }

   public String saveOption() {
      return DataUtils.int_intMapToString(this.option);
   }

   public void loadOption(String data) {
      this.option = DataUtils.stringToInt_intMap(data);
   }

   public long recBoxNextLvCountDown(boolean checkBoxLvUp) {
      if (checkBoxLvUp) {
         this.getCurBoxLv();
      }

      if (this.boxNextLvTime <= 0L) {
         return -1L;
      } else {
         long currentTimeMillis = System.currentTimeMillis();
         long countDownMillis = this.boxNextLvTime - currentTimeMillis;
         return countDownMillis <= 0L ? 0L : countDownMillis / 1000L;
      }
   }

   public int getCurBoxLv() {
      if (this.boxNextLvTime <= 0L) {
         return this.curBoxLv;
      } else {
         long currentTimeMillis = System.currentTimeMillis();
         long countDownMillis = this.boxNextLvTime - currentTimeMillis;
         if (countDownMillis <= 0L) {
            HeroGameBoxLotteryModel nextLvBox = (HeroGameBoxLotteryModel)ApplicationContextProvider.getModelPoolEntity("heroGameBoxLottery", this.curBoxLv + 1);
            if (null != nextLvBox) {
               this.setCurBoxLv(nextLvBox.getBoxLv());
            }

            this.boxNextLvTime = 0L;
            this.updateOp();
         }

         return this.curBoxLv;
      }
   }

   public void setCurBoxLv(int curBoxLv) {
      this.curBoxLv = curBoxLv;
      this.qualityLotteryNum.clear();
      this.updateOp();
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      GamePlayer player = worldMgr.getPlayerById(this.playerId);
      player.triggerTask(761, 0, (long)curBoxLv, 0);
      player.getOperationMgr().addExtraLog(player, 236, "玉玺升级后等级:" + curBoxLv);
   }

   public static class EquipData {
      public int code;
      public int equipId;
      public int equipLevel;
      public boolean enable = false;
      public List<HeroTypeAttrData> attr = new ArrayList();

      public HeroCardMsg.EquipData toBuilder() {
         List<HeroCardMsg.EquipTypeAttr> list = new ArrayList();

         for(HeroTypeAttrData heroTypeAttrData : this.attr) {
            list.add(HeroCardMsg.EquipTypeAttr.newBuilder().setHeroType(heroTypeAttrData.getHeroType()).setType(heroTypeAttrData.getType()).setVal(heroTypeAttrData.getVal()).setWay(heroTypeAttrData.getWay()).build());
         }

         return HeroCardMsg.EquipData.newBuilder().setCode(this.code).setEquipId(this.equipId).setLevel(this.equipLevel).setEnable(this.enable).addAllAttr(list).build();
      }

      public long calEquipScore() {
         if (this.attr.isEmpty()) {
            return 0L;
         } else {
            long s = 0L;

            for(HeroTypeAttrData heroTypeAttrData : this.attr) {
               ZhuHouAttrScoreModel model = (ZhuHouAttrScoreModel)ZhuHouAttrScoreModel.attrTypeMap.get(StrUtil.format("{}_{}", new Object[]{heroTypeAttrData.getType(), heroTypeAttrData.getWay()}));
               if (model != null) {
                  s += (long)(heroTypeAttrData.getVal() * model.getScore() + model.getOffsetType() * model.getOffsetValue());
               }
            }

            return s;
         }
      }
   }
}
