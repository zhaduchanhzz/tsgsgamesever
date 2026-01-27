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
   file = "heroEmployeeLib"
)
public class HeroEmployeeLibModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "libId",
      comment = "随机库id组"
   )
   private int libId;
   @ModelColumnAnno(
      comment = "开始时间"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "结束时间"
   )
   private int dateEnd;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      columnName = "heroId",
      comment = "武将id"
   )
   private int heroId;
   @ModelColumnAnno(
      columnName = "odds",
      comment = "odds"
   )
   private int odds;
   @ModelColumnAnno(
      columnName = "lockNum",
      comment = "高级招募前置次数"
   )
   private int lockNum;
   @ModelColumnAnno(
      columnName = "openLimit",
      comment = "开启图鉴未获得保底的前置次数"
   )
   private int openLimit;
   @ModelColumnAnno(
      columnName = "numSpace",
      comment = "间隔X次触发一次保底概率"
   )
   private int numSpace;
   @ModelColumnAnno(
      columnName = "limitAddPro",
      comment = "图鉴保底时概率"
   )
   private int limitAddPro;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         HeroEmployeeLibModel model = (HeroEmployeeLibModel)entry.getValue();
         if (tempHashMap.get(model.libId) == null) {
            List<HeroEmployeeLibModel> tempList = new ArrayList();
            tempList.add(model);
            tempHashMap.put(model.libId, tempList);
         } else {
            List<HeroEmployeeLibModel> tempList = (List)tempHashMap.get(model.libId);
            tempList.add(model);
            tempHashMap.put(model.libId, tempList);
         }
      }

      pool.putMap("custom_heroEmployeeLib", tempHashMap);
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

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getHeroId() {
      return this.heroId;
   }

   public void setHeroId(int heroId) {
      this.checkModify();
      this.heroId = heroId;
   }

   public int getOdds() {
      return this.odds;
   }

   public void setOdds(int odds) {
      this.checkModify();
      this.odds = odds;
   }

   public int getLockNum() {
      return this.lockNum;
   }

   public void setLockNum(int lockNum) {
      this.checkModify();
      this.lockNum = lockNum;
   }

   public int getOpenLimit() {
      return this.openLimit;
   }

   public void setOpenLimit(int openLimit) {
      this.checkModify();
      this.openLimit = openLimit;
   }

   public int getNumSpace() {
      return this.numSpace;
   }

   public void setNumSpace(int numSpace) {
      this.checkModify();
      this.numSpace = numSpace;
   }

   public int getLimitAddPro() {
      return this.limitAddPro;
   }

   public void setLimitAddPro(int limitAddPro) {
      this.checkModify();
      this.limitAddPro = limitAddPro;
   }
}
