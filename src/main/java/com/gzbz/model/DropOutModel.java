package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "dropOut"
)
public class DropOutModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "group",
      comment = "奖励组"
   )
   private int group;
   @ModelColumnAnno(
      columnName = "tips",
      comment = "备注"
   )
   private String tips;
   @ModelColumnAnno(
      columnName = "type",
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "itemId",
      comment = "物品的id"
   )
   private int itemId;
   @ModelColumnAnno(
      columnName = "odds",
      comment = "出现概率"
   )
   private int odds;
   @ModelColumnAnno(
      columnName = "min",
      comment = "最小数"
   )
   private int min;
   @ModelColumnAnno(
      columnName = "max",
      comment = "最大数"
   )
   private int max;
   @ModelColumnAnno(
      columnName = "fastBattle",
      comment = "快速作战必定掉落1个所需次数"
   )
   private int fastBattle;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         DropOutModel model = (DropOutModel)entry.getValue();
         if (tempHashMap.get(model.group) == null) {
            List<DropOutModel> tempList = new ArrayList();
            tempList.add(model);
            tempHashMap.put(model.group, tempList);
         } else {
            List<DropOutModel> tempList = (List)tempHashMap.get(model.group);
            tempList.add(model);
            tempHashMap.put(model.group, tempList);
         }
      }

      pool.putMap("custom_dropOut", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.checkModify();
      this.group = group;
   }

   public String getTips() {
      return this.tips;
   }

   public void setTips(String tips) {
      this.checkModify();
      this.tips = tips;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }

   public int getOdds() {
      return this.odds;
   }

   public void setOdds(int odds) {
      this.checkModify();
      this.odds = odds;
   }

   public int getMin() {
      return this.min;
   }

   public void setMin(int min) {
      this.checkModify();
      this.min = min;
   }

   public int getMax() {
      return this.max;
   }

   public void setMax(int max) {
      this.checkModify();
      this.max = max;
   }

   public int getFastBattle() {
      return this.fastBattle;
   }

   public void setFastBattle(int fastBattle) {
      this.checkModify();
      this.fastBattle = fastBattle;
   }
}
