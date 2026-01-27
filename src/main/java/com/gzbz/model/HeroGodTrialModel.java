package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "JZTrialbase"
)
public class HeroGodTrialModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "阵营"
   )
   private int camp;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "品质名称"
   )
   private String qualityName;
   @ModelColumnAnno(
      comment = "层数"
   )
   private int step;
   @ModelColumnAnno(
      comment = "战斗id"
   )
   private int battle;
   @ModelColumnAnno(
      comment = "回合限制"
   )
   private int boutCount;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "首次通关奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "挑战需要上阵相关阵营武将数量"
   )
   private int needNum;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, HeroGodTrialModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         HeroGodTrialModel model = (HeroGodTrialModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.camp, (v) -> new TreeMap())).put(model.step, model);
      }

      pool.putMap("customJZTrialbase", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getCamp() {
      return this.camp;
   }

   public void setCamp(int camp) {
      this.checkModify();
      this.camp = camp;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public String getQualityName() {
      return this.qualityName;
   }

   public void setQualityName(String qualityName) {
      this.checkModify();
      this.qualityName = qualityName;
   }

   public int getStep() {
      return this.step;
   }

   public void setStep(int step) {
      this.checkModify();
      this.step = step;
   }

   public int getBattle() {
      return this.battle;
   }

   public void setBattle(int battle) {
      this.checkModify();
      this.battle = battle;
   }

   public int getBoutCount() {
      return this.boutCount;
   }

   public void setBoutCount(int boutCount) {
      this.checkModify();
      this.boutCount = boutCount;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getNeedNum() {
      return this.needNum;
   }

   public void setNeedNum(int needNum) {
      this.checkModify();
      this.needNum = needNum;
   }
}
