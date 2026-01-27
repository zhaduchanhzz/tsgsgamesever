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
   file = "RuneRefinelvNature"
)
public class RuneRefineLvNatureModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "部位"
   )
   private int seat;
   @ModelColumnAnno(
      comment = "突破次数"
   )
   private int breakUpTime;
   @ModelColumnAnno(
      comment = "洗炼等级"
   )
   private int refineLv;
   @ModelColumnAnno(
      comment = "继承突破次数的位置的最高突破次数"
   )
   private int succeedUpBreakUpTime;
   @ModelColumnAnno(
      comment = "继承突破次数的位置穿戴的符文的最低品质"
   )
   private int succeedSeatNeedQuality;
   @ModelColumnAnno(
      comment = "突破所需属性品质"
   )
   private int breakUpNeedQuality;
   @ModelColumnAnno(
      comment = "突破所需属性数量"
   )
   private int breakUpNeedNum;
   @ModelColumnAnno(
      comment = "需要装配的符文最低品质"
   )
   private int needRuneQuality;
   @ModelColumnAnno(
      comment = "突破需装配的符文最低品质"
   )
   private int breakUpNeedRuneQuality;
   @ModelColumnAnno(
      columnName = "refinePro",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "洗练等级属性"
   )
   private List<PropertyModel> refinePro = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, RuneRefineLvNatureModel>> allMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         RuneRefineLvNatureModel value = (RuneRefineLvNatureModel)entry.getValue();
         ((ConcurrentHashMap)allMap.computeIfAbsent(value.getSeat(), (k) -> new ConcurrentHashMap())).put(value.getBreakUpTime(), value);
      }

      pool.putMap("customRuneRefinelvNature", allMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getSeat() {
      return this.seat;
   }

   public void setSeat(int seat) {
      this.checkModify();
      this.seat = seat;
   }

   public int getBreakUpTime() {
      return this.breakUpTime;
   }

   public void setBreakUpTime(int breakUpTime) {
      this.checkModify();
      this.breakUpTime = breakUpTime;
   }

   public int getRefineLv() {
      return this.refineLv;
   }

   public void setRefineLv(int refineLv) {
      this.checkModify();
      this.refineLv = refineLv;
   }

   public int getSucceedUpBreakUpTime() {
      return this.succeedUpBreakUpTime;
   }

   public void setSucceedUpBreakUpTime(int succeedUpBreakUpTime) {
      this.checkModify();
      this.succeedUpBreakUpTime = succeedUpBreakUpTime;
   }

   public int getSucceedSeatNeedQuality() {
      return this.succeedSeatNeedQuality;
   }

   public void setSucceedSeatNeedQuality(int succeedSeatNeedQuality) {
      this.checkModify();
      this.succeedSeatNeedQuality = succeedSeatNeedQuality;
   }

   public int getBreakUpNeedQuality() {
      return this.breakUpNeedQuality;
   }

   public void setBreakUpNeedQuality(int breakUpNeedQuality) {
      this.checkModify();
      this.breakUpNeedQuality = breakUpNeedQuality;
   }

   public int getBreakUpNeedNum() {
      return this.breakUpNeedNum;
   }

   public void setBreakUpNeedNum(int breakUpNeedNum) {
      this.checkModify();
      this.breakUpNeedNum = breakUpNeedNum;
   }

   public int getNeedRuneQuality() {
      return this.needRuneQuality;
   }

   public void setNeedRuneQuality(int needRuneQuality) {
      this.checkModify();
      this.needRuneQuality = needRuneQuality;
   }

   public int getBreakUpNeedRuneQuality() {
      return this.breakUpNeedRuneQuality;
   }

   public void setBreakUpNeedRuneQuality(int breakUpNeedRuneQuality) {
      this.checkModify();
      this.breakUpNeedRuneQuality = breakUpNeedRuneQuality;
   }

   public List<PropertyModel> getRefinePro() {
      return this.refinePro;
   }

   public void setRefinePro(List<PropertyModel> refinePro) {
      this.checkModify();
      this.refinePro = refinePro;
   }
}
