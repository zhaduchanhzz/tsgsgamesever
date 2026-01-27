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
   file = "heroRecruitLib"
)
public class HeroRecruitLibModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "日期组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "日期组末尾"
   )
   private int dateEnd;
   @ModelColumnAnno(
      columnName = "libId",
      comment = "随机库ID"
   )
   private int libId;
   @ModelColumnAnno(
      columnName = "propsId",
      comment = "武将ID"
   )
   private int propsId;
   @ModelColumnAnno(
      columnName = "isShow",
      comment = "是否播放跑马灯"
   )
   private int isShow;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      columnName = "propsNum",
      comment = "道具数量"
   )
   private int propsNum;
   @ModelColumnAnno(
      columnName = "probability",
      comment = "概率（千分比）"
   )
   private int probability;
   @ModelColumnAnno(
      columnName = "floors",
      comment = "保底次数"
   )
   private int floors;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<HeroRecruitLibModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         HeroRecruitLibModel model = (HeroRecruitLibModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.libId, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("custom_heroRecruitLib", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public void setDateStart(int dateStart) {
      this.checkModify();
      this.dateStart = dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public void setDateEnd(int dateEnd) {
      this.checkModify();
      this.dateEnd = dateEnd;
   }

   public int getLibId() {
      return this.libId;
   }

   public void setLibId(int libId) {
      this.checkModify();
      this.libId = libId;
   }

   public int getPropsId() {
      return this.propsId;
   }

   public void setPropsId(int propsId) {
      this.checkModify();
      this.propsId = propsId;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getPropsNum() {
      return this.propsNum;
   }

   public void setPropsNum(int propsNum) {
      this.checkModify();
      this.propsNum = propsNum;
   }

   public int getProbability() {
      return this.probability;
   }

   public void setProbability(int probability) {
      this.checkModify();
      this.probability = probability;
   }

   public int getIsShow() {
      return this.isShow;
   }

   public void setIsShow(int isShow) {
      this.checkModify();
      this.isShow = isShow;
   }

   public int getFloors() {
      return this.floors;
   }

   public void setFloors(int floors) {
      this.checkModify();
      this.floors = floors;
   }
}
