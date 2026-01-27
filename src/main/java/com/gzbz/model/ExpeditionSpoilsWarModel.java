package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
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
   file = "expeditionSpoilsOfWar"
)
public class ExpeditionSpoilsWarModel extends BaseModel {
   @ModelColumnAnno(
      comment = "战利品id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int groupId;
   @ModelColumnAnno(
      comment = "名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "适用阵营"
   )
   private int camp;
   @ModelColumnAnno(
      comment = "描述"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "图标"
   )
   private int icon;
   @ModelColumnAnno(
      comment = "开场buff",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2
   )
   private List<PropertyModel> buffs = new ArrayList();
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ArrayList<ExpeditionSpoilsWarModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ExpeditionSpoilsWarModel model = (ExpeditionSpoilsWarModel)entry.getValue();
         ((ArrayList)tempMap.computeIfAbsent(model.groupId, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customExpeditionSpoilsOfWar", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroupId() {
      return this.groupId;
   }

   public void setGroupId(int groupId) {
      this.checkModify();
      this.groupId = groupId;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getCamp() {
      return this.camp;
   }

   public void setCamp(int camp) {
      this.checkModify();
      this.camp = camp;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getIcon() {
      return this.icon;
   }

   public void setIcon(int icon) {
      this.checkModify();
      this.icon = icon;
   }

   public List<PropertyModel> getBuffs() {
      return this.buffs;
   }

   public void setBuffs(List<PropertyModel> buffs) {
      this.checkModify();
      this.buffs = buffs;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }
}
