package com.gzbz.model;

import cn.hutool.core.util.StrUtil;
import com.google.common.collect.Lists;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.manager.BaseModel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "heroGameAttackGroup"
)
public class ZhuHouAttackGroupModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "基础属性池"
   )
   private int groupAttack;
   @ModelColumnAnno(
      comment = "装备品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "属性类型"
   )
   private int addProsType;
   @ModelColumnAnno(
      comment = "职业类型"
   )
   private int addProsHeroType;
   @ModelColumnAnno(
      comment = "计算方式"
   )
   private int addProsWay;
   @ModelColumnAnno(
      comment = "属性值"
   )
   private int addProsNum;
   @ModelColumnAnno(
      comment = "波动范围下限"
   )
   private int waveDown;
   @ModelColumnAnno(
      comment = "波动范围上限"
   )
   private int waveUp;
   @ModelColumnAnno(
      comment = "抽取权重"
   )
   private int weight;
   @ModelColumnAnno(
      comment = "属性名称"
   )
   private String name;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, List<KeyValFun>> tempMap = new ConcurrentHashMap();
      map.forEach((key, value) -> {
         ZhuHouAttackGroupModel model = (ZhuHouAttackGroupModel)value;
         if (model.getAddProsType() != 0) {
            String k = StrUtil.format("{}_{}", new Object[]{model.groupAttack, model.quality});
            List<KeyValFun> keyValFunList = (List)tempMap.getOrDefault(k, Lists.newArrayList());
            keyValFunList.add(new KeyValFun(model.id, model.weight));
            tempMap.put(k, keyValFunList);
         }
      });
      pool.putMap("customHeroGameAttackGroup", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getGroupAttack() {
      return this.groupAttack;
   }

   public void setGroupAttack(int groupAttack) {
      this.groupAttack = groupAttack;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.quality = quality;
   }

   public int getAddProsType() {
      return this.addProsType;
   }

   public void setAddProsType(int addProsType) {
      this.addProsType = addProsType;
   }

   public int getAddProsHeroType() {
      return this.addProsHeroType;
   }

   public void setAddProsHeroType(int addProsHeroType) {
      this.addProsHeroType = addProsHeroType;
   }

   public int getAddProsWay() {
      return this.addProsWay;
   }

   public void setAddProsWay(int addProsWay) {
      this.addProsWay = addProsWay;
   }

   public int getAddProsNum() {
      return this.addProsNum;
   }

   public void setAddProsNum(int addProsNum) {
      this.addProsNum = addProsNum;
   }

   public int getWaveDown() {
      return this.waveDown;
   }

   public void setWaveDown(int waveDown) {
      this.waveDown = waveDown;
   }

   public int getWaveUp() {
      return this.waveUp;
   }

   public void setWaveUp(int waveUp) {
      this.waveUp = waveUp;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
