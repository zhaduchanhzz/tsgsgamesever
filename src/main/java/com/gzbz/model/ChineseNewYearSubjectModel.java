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
   file = "ChunJieSubject"
)
public class ChineseNewYearSubjectModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "建筑类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "答案"
   )
   private int answer;
   @ModelColumnAnno(
      comment = "占比"
   )
   private int ratio;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<ChineseNewYearSubjectModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ChineseNewYearSubjectModel model = (ChineseNewYearSubjectModel)entry.getValue();
         ((List)tempMap.computeIfAbsent(model.getType(), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customChunJieSubject", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getAnswer() {
      return this.answer;
   }

   public void setAnswer(int answer) {
      this.checkModify();
      this.answer = answer;
   }

   public int getRatio() {
      return this.ratio;
   }

   public void setRatio(int ratio) {
      this.checkModify();
      this.ratio = ratio;
   }
}
