package com.gzbz.model;

import com.gzbz.model.fun.PropertyRangeModel;
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
   file = "GodBeastAptitudeLib"
)
public class GodBeastAptitudeLibModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "随机库id组"
   )
   private int libId;
   @ModelColumnAnno(
      comment = "资质范围备注"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int odds;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyRangeModel.class,
      comment = "生命属性范围"
   )
   private List<PropertyRangeModel> attrHp = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyRangeModel.class,
      comment = "攻击属性范围"
   )
   private List<PropertyRangeModel> attrAttack = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyRangeModel.class,
      comment = "速度属性范围"
   )
   private List<PropertyRangeModel> attrSpeed = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ArrayList<GodBeastAptitudeLibModel>> allMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         GodBeastAptitudeLibModel value = (GodBeastAptitudeLibModel)entry.getValue();
         ((ArrayList)allMap.computeIfAbsent(value.getLibId(), (k) -> new ArrayList())).add(value);
      }

      pool.putMap("customGodBeastAptitudeLib", allMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getLibId() {
      return this.libId;
   }

   public void setLibId(int libId) {
      this.checkModify();
      this.libId = libId;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getOdds() {
      return this.odds;
   }

   public void setOdds(int odds) {
      this.checkModify();
      this.odds = odds;
   }

   public List<PropertyRangeModel> getAttrHp() {
      return this.attrHp;
   }

   public void setAttrHp(List<PropertyRangeModel> attrHp) {
      this.checkModify();
      this.attrHp = attrHp;
   }

   public List<PropertyRangeModel> getAttrAttack() {
      return this.attrAttack;
   }

   public void setAttrAttack(List<PropertyRangeModel> attrAttack) {
      this.checkModify();
      this.attrAttack = attrAttack;
   }

   public List<PropertyRangeModel> getAttrSpeed() {
      return this.attrSpeed;
   }

   public void setAttrSpeed(List<PropertyRangeModel> attrSpeed) {
      this.checkModify();
      this.attrSpeed = attrSpeed;
   }
}
