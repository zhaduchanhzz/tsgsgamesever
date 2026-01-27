package com.gzbz.model;

import com.gzbz.model.fun.RuneRefineRangeModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "RuneRefineNature"
)
public class RuneRefineNatureModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "洗炼等级"
   )
   private int refineLv;
   @ModelColumnAnno(
      comment = "位置"
   )
   private int seat;
   @ModelColumnAnno(
      comment = "可继承部位",
      columnConvertType = 2,
      subCls = Integer.class,
      count = 2
   )
   private List<Integer> succeedSeat = new ArrayList();
   @ModelColumnAnno(
      comment = "属性名称"
   )
   private String natureName;
   @ModelColumnAnno(
      comment = "属性类型"
   )
   private int natureType;
   @ModelColumnAnno(
      comment = "加成方式"
   )
   private int natureWay;
   @ModelColumnAnno(
      comment = "属性权重"
   )
   private int natureWeight;
   @ModelColumnAnno(
      columnName = "refineRange",
      columnConvertType = 1,
      subCls = RuneRefineRangeModel.class,
      comment = "品质属性值取值范围"
   )
   Map<Integer, RuneRefineRangeModel> refineRange = new HashMap();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, List<RuneRefineNatureModel>> refineLv_seat_list = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         RuneRefineNatureModel value = (RuneRefineNatureModel)entry.getValue();
         Map<Integer, RuneRefineRangeModel> refineRangeMap = value.getRefineRange();
         Map<Integer, RuneRefineRangeModel> quality_modelMap = new HashMap();

         for(Map.Entry<Integer, RuneRefineRangeModel> id_model : refineRangeMap.entrySet()) {
            RuneRefineRangeModel runeRefineRangeModel = (RuneRefineRangeModel)id_model.getValue();
            quality_modelMap.put(runeRefineRangeModel.getQuality(), runeRefineRangeModel);
         }

         value.refineRange.clear();
         value.refineRange.putAll(quality_modelMap);
         ((List)refineLv_seat_list.computeIfAbsent(value.getRefineLv() + "_" + value.getSeat(), (k) -> new ArrayList())).add(value);
      }

      pool.putMap("customRuneRefineNature", refineLv_seat_list);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getRefineLv() {
      return this.refineLv;
   }

   public void setRefineLv(int refineLv) {
      this.checkModify();
      this.refineLv = refineLv;
   }

   public int getSeat() {
      return this.seat;
   }

   public void setSeat(int seat) {
      this.checkModify();
      this.seat = seat;
   }

   public List<Integer> getSucceedSeat() {
      return this.succeedSeat;
   }

   public void setSucceedSeat(List<Integer> succeedSeat) {
      this.checkModify();
      this.succeedSeat = succeedSeat;
   }

   public String getNatureName() {
      return this.natureName;
   }

   public void setNatureName(String natureName) {
      this.checkModify();
      this.natureName = natureName;
   }

   public int getNatureType() {
      return this.natureType;
   }

   public void setNatureType(int natureType) {
      this.checkModify();
      this.natureType = natureType;
   }

   public int getNatureWay() {
      return this.natureWay;
   }

   public void setNatureWay(int natureWay) {
      this.checkModify();
      this.natureWay = natureWay;
   }

   public int getNatureWeight() {
      return this.natureWeight;
   }

   public void setNatureWeight(int natureWeight) {
      this.checkModify();
      this.natureWeight = natureWeight;
   }

   public Map<Integer, RuneRefineRangeModel> getRefineRange() {
      return this.refineRange;
   }

   public void setRefineRange(Map<Integer, RuneRefineRangeModel> refineRange) {
      this.checkModify();
      this.refineRange = refineRange;
   }
}
