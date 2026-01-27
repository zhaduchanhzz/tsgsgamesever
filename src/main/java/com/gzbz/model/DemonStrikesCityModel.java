package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "demonWarCity"
)
public class DemonStrikesCityModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno
   private int mapId;
   @ModelColumnAnno
   private String name;
   @ModelColumnAnno
   private int demonWarFightTime;
   @ModelColumnAnno
   private int type;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "链接城池"
   )
   private List<Integer> connectCity = new ArrayList();
   @ModelColumnAnno
   private int demonCount;
   @ModelColumnAnno
   private int humanCount;
   @ModelColumnAnno(
      comment = "占领积分"
   )
   private int score;
   @ModelColumnAnno(
      columnName = "ExtreScore",
      comment = "首次占领额外积分"
   )
   private int extraScore;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = KeyValFun.class,
      comment = "初始守将",
      count = 9
   )
   private List<KeyValFun> defBattles = new ArrayList();
   @ModelColumnAnno(
      columnName = "addPros",
      columnConvertType = 1,
      count = 1,
      subCls = PropertyModel.class,
      comment = "战力属性增加"
   )
   private List<PropertyModel> addPros = new ArrayList();
   @ModelColumnAnno(
      columnName = "gains",
      columnConvertType = 1,
      count = 2,
      subCls = ResourceModel.class,
      comment = "占领收益(每小时)"
   )
   private List<ResourceModel> gains = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getMapId() {
      return this.mapId;
   }

   public void setMapId(int mapId) {
      this.checkModify();
      this.mapId = mapId;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getDemonWarFightTime() {
      return this.demonWarFightTime;
   }

   public void setDemonWarFightTime(int demonWarFightTime) {
      this.checkModify();
      this.demonWarFightTime = demonWarFightTime;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public List<Integer> getConnectCity() {
      return this.connectCity;
   }

   public void setConnectCity(List<Integer> connectCity) {
      this.checkModify();
      this.connectCity = connectCity;
   }

   public int getDemonCount() {
      return this.demonCount;
   }

   public void setDemonCount(int demonCount) {
      this.checkModify();
      this.demonCount = demonCount;
   }

   public int getHumanCount() {
      return this.humanCount;
   }

   public void setHumanCount(int humanCount) {
      this.checkModify();
      this.humanCount = humanCount;
   }

   public int getScore() {
      return this.score;
   }

   public void setScore(int score) {
      this.checkModify();
      this.score = score;
   }

   public int getExtraScore() {
      return this.extraScore;
   }

   public void setExtraScore(int extraScore) {
      this.checkModify();
      this.extraScore = extraScore;
   }

   public List<PropertyModel> getAddPros() {
      return this.addPros;
   }

   public void setAddPros(List<PropertyModel> addPros) {
      this.checkModify();
      this.addPros = addPros;
   }

   public List<ResourceModel> getGains() {
      return this.gains;
   }

   public void setGains(List<ResourceModel> gains) {
      this.checkModify();
      this.gains = gains;
   }

   public List<KeyValFun> getDefBattles() {
      return this.defBattles;
   }

   public void setDefBattles(List<KeyValFun> defBattles) {
      this.checkModify();
      this.defBattles = defBattles;
   }
}
