package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "rechargePrice"
)
public class RechargeModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "编号"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "platformType",
      comment = "平台类型"
   )
   private int platformType;
   @ModelColumnAnno(
      columnName = "type",
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "name",
      comment = "名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "moneyType",
      comment = "钱类型"
   )
   private int moneyType;
   @ModelColumnAnno(
      columnName = "money",
      comment = "需求钱数"
   )
   private int money;
   @ModelColumnAnno(
      columnName = "money_kr",
      comment = "韩服价格"
   )
   private int moneyKr;
   @ModelColumnAnno(
      columnName = "ingots",
      comment = "充值获得元宝数"
   )
   private int ingots;
   @ModelColumnAnno(
      columnName = "extraInggots",
      comment = "首充额外赠送元宝数"
   )
   private int extraIngots;
   @ModelColumnAnno(
      columnName = "day",
      comment = "各种卡天数"
   )
   private int day;
   @ModelColumnAnno(
      columnName = "vipExp",
      comment = "获得vip经验"
   )
   private int vipExp;
   @ModelColumnAnno(
      columnName = "multiplyingPower",
      comment = "首充倍率"
   )
   private int multiplyingPower;
   @ModelColumnAnno(
      columnName = "productId",
      comment = "产品id"
   )
   private int productId;
   @ModelColumnAnno(
      columnName = "sanguobi",
      comment = "三国币数量"
   )
   private int sanguobi;
   @ModelColumnAnno(
      columnName = "money_th",
      comment = "需要的泰铢"
   )
   private float moneyTh;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getPlatformType() {
      return this.platformType;
   }

   public void setPlatformType(int platformType) {
      this.checkModify();
      this.platformType = platformType;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getMoneyType() {
      return this.moneyType;
   }

   public void setMoneyType(int moneyType) {
      this.checkModify();
      this.moneyType = moneyType;
   }

   public int getMoney() {
      return this.money;
   }

   public void setMoney(int money) {
      this.checkModify();
      this.money = money;
   }

   public int getIngots() {
      return this.ingots;
   }

   public void setIngots(int ingots) {
      this.checkModify();
      this.ingots = ingots;
   }

   public int getExtraIngots() {
      return this.extraIngots;
   }

   public void setExtraIngots(int extraIngots) {
      this.checkModify();
      this.extraIngots = extraIngots;
   }

   public int getDay() {
      return this.day;
   }

   public void setDay(int day) {
      this.checkModify();
      this.day = day;
   }

   public int getVipExp() {
      return this.vipExp;
   }

   public void setVipExp(int vipExp) {
      this.checkModify();
      this.vipExp = vipExp;
   }

   public int getMultiplyingPower() {
      return this.multiplyingPower;
   }

   public void setMultiplyingPower(int multiplyingPower) {
      this.checkModify();
      this.multiplyingPower = multiplyingPower;
   }

   public int getProductId() {
      return this.productId;
   }

   public void setProductId(int productId) {
      this.checkModify();
      this.productId = productId;
   }

   public int getSanguobi() {
      return this.sanguobi;
   }

   public void setSanguobi(int sanguobi) {
      this.checkModify();
      this.sanguobi = sanguobi;
   }

   public int getMoneyKr() {
      return this.moneyKr;
   }

   public float getMoneyTh() {
      return this.moneyTh;
   }

   public void setMoneyTh(float moneyTh) {
      this.checkModify();
      this.moneyTh = moneyTh;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, RechargeModel> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         RechargeModel model = (RechargeModel)entry.getValue();
         String key = model.platformType + "-" + model.getType() + "-" + model.getMoney();
         if (tempHashMap.containsKey(key)) {
            (new Exception("重复的充值项！key:" + key)).printStackTrace();
         }

         tempHashMap.put(key, model);
      }

      pool.putMap("custom_recharge", tempHashMap);
   }

   public RechargeModel clone() {
      RechargeModel rechargeModel = new RechargeModel();
      rechargeModel.setMoney(this.money);
      rechargeModel.setName(this.name);
      rechargeModel.setIngots(this.ingots);
      rechargeModel.setDay(this.day);
      rechargeModel.setExtraIngots(this.extraIngots);
      rechargeModel.setId(this.id);
      rechargeModel.setMoneyType(this.moneyType);
      rechargeModel.setMultiplyingPower(this.multiplyingPower);
      rechargeModel.setPlatformType(this.platformType);
      rechargeModel.setProductId(this.productId);
      rechargeModel.setType(this.type);
      rechargeModel.setVipExp(this.vipExp);
      rechargeModel.setSanguobi(this.sanguobi);
      return rechargeModel;
   }
}
