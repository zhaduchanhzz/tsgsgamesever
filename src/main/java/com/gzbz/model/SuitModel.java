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
   file = "suit"
)
public class SuitModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "type",
      comment = "套装类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "tip",
      comment = "注释"
   )
   private String tip;
   @ModelColumnAnno(
      columnName = "name",
      comment = "套装名字"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "needNum",
      comment = "组成件数"
   )
   private int needNum;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2,
      comment = "基础属性"
   )
   private ArrayList<PropertyModel> suitProperty = new ArrayList();
   @ModelColumnAnno(
      columnName = "desc",
      comment = "套装说明"
   )
   private String desc;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         SuitModel model = (SuitModel)entry.getValue();
         if (tempHashMap.get(model.type) == null) {
            List<SuitModel> tempList = new ArrayList();
            tempList.add(model);
            tempHashMap.put(model.type, tempList);
         } else {
            List<SuitModel> tempList = (List)tempHashMap.get(model.type);
            tempList.add(model);
            tempHashMap.put(model.type, tempList);
         }
      }

      pool.putMap("custom_suit", tempHashMap);
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

   public String getTip() {
      return this.tip;
   }

   public void setTip(String tip) {
      this.checkModify();
      this.tip = tip;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getNeedNum() {
      return this.needNum;
   }

   public void setNeedNum(int needNum) {
      this.checkModify();
      this.needNum = needNum;
   }

   public ArrayList<PropertyModel> getSuitProperty() {
      return this.suitProperty;
   }

   public void setSuitProperty(ArrayList<PropertyModel> suitProperty) {
      this.checkModify();
      this.suitProperty = suitProperty;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
