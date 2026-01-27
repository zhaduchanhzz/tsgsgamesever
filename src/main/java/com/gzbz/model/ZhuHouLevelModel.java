package com.gzbz.model;

import cn.hutool.core.util.StrUtil;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "heroGameBoxLevel"
)
public class ZhuHouLevelModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "玩法等级"
   )
   private int id;
   @ModelColumnAnno(
      comment = "升到下一级需要的经验"
   )
   private int exp;
   @ModelColumnAnno(
      comment = "晋阶任务id"
   )
   private String taskId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "属性加成"
   )
   private List<PropertyModel> baseAtt = new ArrayList();
   public static Map<Integer, Integer> expMap = new LinkedHashMap();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      expMap.clear();
      ConcurrentHashMap<Integer, List<Integer>> tempMap = new ConcurrentHashMap();
      int tempExp = 0;

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ZhuHouLevelModel model = (ZhuHouLevelModel)entry.getValue();
         List<Integer> taskIds = (List)Arrays.stream(StrUtil.split(model.taskId, "|")).map(Integer::parseInt).collect(Collectors.toList());
         tempMap.put(model.id, taskIds);
         tempExp += model.exp;
         expMap.put(model.id + 1, tempExp);
      }

      pool.putMap("customHeroGameBoxLevel", tempMap);
   }

   public int getExp() {
      return this.exp;
   }

   public void setExp(int exp) {
      this.exp = exp;
   }

   public String getTaskId() {
      return this.taskId;
   }

   public void setTaskId(String taskId) {
      this.taskId = taskId;
   }

   public List<PropertyModel> getBaseAtt() {
      return this.baseAtt;
   }

   public void setBaseAtt(List<PropertyModel> baseAtt) {
      this.baseAtt = baseAtt;
   }
}
