package com.gzbz.model;

import com.gzbz.model.fun.ProbabilityFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import misc.RandomUtil;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroEmployee"
)
public class HeroEmployeeModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "招募类型"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "类型描述"
   )
   private String desc;
   @ModelColumnAnno(
      columnName = "freeTimes",
      comment = "免费次数"
   )
   private int freeTimes;
   @ModelColumnAnno(
      columnName = "freeCD",
      comment = "免费次数CD（秒）"
   )
   private int freeCD;
   @ModelColumnAnno(
      columnName = "heroExp",
      comment = "获得武将经验"
   )
   private int heroExp;
   @ModelColumnAnno(
      columnName = "vip",
      comment = "vip限制"
   )
   private int vip;
   @ModelColumnAnno(
      columnName = "points",
      comment = "获得招募积分"
   )
   private int points;
   @ModelColumnAnno(
      columnName = "consume",
      comment = "招募令/元宝/友情值/招募积分消耗"
   )
   private int consume;
   @ModelColumnAnno(
      columnName = "heroLib1",
      columnConvertType = 1,
      subCls = ProbabilityFun.class,
      count = 6,
      comment = "武将随机"
   )
   private ArrayList<ProbabilityFun> heroLib1 = new ArrayList();
   @ModelColumnAnno(
      columnName = "heroLib2",
      columnConvertType = 1,
      subCls = ProbabilityFun.class,
      count = 2,
      comment = "十连保底"
   )
   private ArrayList<ProbabilityFun> heroLib2 = new ArrayList();

   public int getLibId() {
      int lib = this.getLibIdByList(this.heroLib1);
      return lib;
   }

   public int getLibIdAssure() {
      return this.getLibIdByList(this.heroLib2);
   }

   private int getLibIdByList(ArrayList<ProbabilityFun> list) {
      int libId = 0;
      int totalProbability = 0;

      for(ProbabilityFun probabilityFun : list) {
         totalProbability += probabilityFun.getProbability();
      }

      int tempVal = 0;
      int r = RandomUtil.randInt(totalProbability);

      for(int i = 0; i < list.size(); ++i) {
         libId = 0;
         if (list.get(i) != null) {
            tempVal += ((ProbabilityFun)list.get(i)).getProbability();
            if (tempVal > r) {
               libId = ((ProbabilityFun)list.get(i)).getVal();
               break;
            }
         }
      }

      return libId;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getFreeTimes() {
      return this.freeTimes;
   }

   public void setFreeTimes(int freeTimes) {
      this.checkModify();
      this.freeTimes = freeTimes;
   }

   public int getFreeCD() {
      return this.freeCD;
   }

   public void setFreeCD(int freeCD) {
      this.checkModify();
      this.freeCD = freeCD;
   }

   public int getHeroExp() {
      return this.heroExp;
   }

   public void setHeroExp(int heroExp) {
      this.checkModify();
      this.heroExp = heroExp;
   }

   public int getVip() {
      return this.vip;
   }

   public void setVip(int vip) {
      this.checkModify();
      this.vip = vip;
   }

   public int getPoints() {
      return this.points;
   }

   public void setPoints(int points) {
      this.checkModify();
      this.points = points;
   }

   public int getConsume() {
      return this.consume;
   }

   public void setConsume(int consume) {
      this.checkModify();
      this.consume = consume;
   }

   public ArrayList<ProbabilityFun> getHeroLib1() {
      return this.heroLib1;
   }

   public void setHeroLib1(ArrayList<ProbabilityFun> heroLib1) {
      this.checkModify();
      this.heroLib1 = heroLib1;
   }

   public ArrayList<ProbabilityFun> getHeroLib2() {
      return this.heroLib2;
   }

   public void setHeroLib2(ArrayList<ProbabilityFun> heroLib2) {
      this.checkModify();
      this.heroLib2 = heroLib2;
   }
}
