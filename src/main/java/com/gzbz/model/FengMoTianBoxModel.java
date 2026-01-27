package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
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
   file = "fengmoTianBox"
)
public class FengMoTianBoxModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int actId;
   @ModelColumnAnno(
      comment = "抽取天数"
   )
   private int drawTime;
   @ModelColumnAnno(
      comment = "天字宝箱奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> tianreward = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<FengMoTianBoxModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         FengMoTianBoxModel model = (FengMoTianBoxModel)entry.getValue();
         ((List)tempMap.computeIfAbsent(model.getActId(), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customFengmoTianBox", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getActId() {
      return this.actId;
   }

   public void setActId(int actId) {
      this.checkModify();
      this.actId = actId;
   }

   public int getDrawTime() {
      return this.drawTime;
   }

   public void setDrawTime(int drawTime) {
      this.checkModify();
      this.drawTime = drawTime;
   }

   public List<ResourceModel> getTianreward() {
      return this.tianreward;
   }

   public void setTianreward(List<ResourceModel> tianreward) {
      this.checkModify();
      this.tianreward = tianreward;
   }
}
