package com.gzbz.model;

import cn.hutool.core.util.NumberUtil;
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
   file = "crossServerMatch"
)
public class CrossServerMatchModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "匹配范围"
   )
   private int matchingRange;
   @ModelColumnAnno(
      comment = "筛选人数"
   )
   private int screenNumber;
   @ModelColumnAnno(
      comment = "每次扩展参数"
   )
   private int extendedParameter;
   @ModelColumnAnno(
      comment = "最大范围"
   )
   private int rangeMax;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<CrossServerMatchModel>> tempHashMap = new ConcurrentHashMap();
      List<CrossServerMatchModel> crossServerMatchModels = new ArrayList();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         CrossServerMatchModel model = (CrossServerMatchModel)entry.getValue();
         crossServerMatchModels.add(model);
      }

      crossServerMatchModels.sort((o1, o2) -> NumberUtil.compare(o1.getId(), o2.getId()));
      tempHashMap.put(0, crossServerMatchModels);
      pool.putMap("customCrossServerMatch", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getMatchingRange() {
      return this.matchingRange;
   }

   public void setMatchingRange(int matchingRange) {
      this.checkModify();
      this.matchingRange = matchingRange;
   }

   public int getScreenNumber() {
      return this.screenNumber;
   }

   public void setScreenNumber(int screenNumber) {
      this.checkModify();
      this.screenNumber = screenNumber;
   }

   public int getExtendedParameter() {
      return this.extendedParameter;
   }

   public void setExtendedParameter(int extendedParameter) {
      this.checkModify();
      this.extendedParameter = extendedParameter;
   }

   public int getRangeMax() {
      return this.rangeMax;
   }

   public void setRangeMax(int rangeMax) {
      this.checkModify();
      this.rangeMax = rangeMax;
   }
}
