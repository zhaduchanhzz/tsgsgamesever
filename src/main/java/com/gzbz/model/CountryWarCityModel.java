package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
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
   file = "countryWarCity"
)
public class CountryWarCityModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "城池ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "mapId",
      comment = "所属地图"
   )
   private int mapId;
   @ModelColumnAnno(
      columnName = "name",
      comment = "城池名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "type",
      comment = "城池类型"
   )
   private int type;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "所属洲"
   )
   private List<Integer> state = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "链接城池"
   )
   private List<Integer> connectCity = new ArrayList();
   @ModelColumnAnno(
      columnName = "maxCount",
      comment = "最大驻守数量"
   )
   private int maxCount;
   @ModelColumnAnno(
      columnName = "score",
      comment = "占领积分"
   )
   private int score;
   @ModelColumnAnno(
      columnName = "ExtreScore",
      comment = "占领积分"
   )
   private int ExtreScore;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "初始守将"
   )
   private List<Integer> defBattles = new ArrayList();
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

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<CountryWarCityModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         CountryWarCityModel model = (CountryWarCityModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.mapId, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customCountryWarCity", tempHashMap);
   }

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

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public List<Integer> getState() {
      return this.state;
   }

   public void setState(List<Integer> state) {
      this.checkModify();
      this.state = state;
   }

   public List<Integer> getConnectCity() {
      return this.connectCity;
   }

   public void setConnectCity(List<Integer> connectCity) {
      this.checkModify();
      this.connectCity = connectCity;
   }

   public int getMaxCount() {
      return this.maxCount;
   }

   public void setMaxCount(int maxCount) {
      this.checkModify();
      this.maxCount = maxCount;
   }

   public int getScore() {
      return this.score;
   }

   public void setScore(int score) {
      this.checkModify();
      this.score = score;
   }

   public List<Integer> getDefBattles() {
      return this.defBattles;
   }

   public void setDefBattles(List<Integer> defBattles) {
      this.checkModify();
      this.defBattles = defBattles;
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

   public int getExtreScore() {
      return this.ExtreScore;
   }

   public void setExtreScore(int extreScore) {
      this.checkModify();
      this.ExtreScore = extreScore;
   }
}
