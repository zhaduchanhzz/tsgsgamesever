package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "provinceName"
)
public class ProvinceNameModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "省份id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "省份名"
   )
   private String name;
   @ModelColumnAnno(
      comment = "省份所属地区"
   )
   private int groupType;
   @ModelColumnAnno(
      comment = "指定服务器显示"
   )
   private String areanShow;
   @ModelColumnAnno(
      comment = "指定服务器-所属地区",
      columnConvertType = 2,
      subCls = String.class
   )
   private List<String> replaceGrouptype = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, TreeMap<Integer, ProvinceNameModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ProvinceNameModel model = (ProvinceNameModel)entry.getValue();
         String[] arr = model.areanShow.split("\\|");

         for(String serverType : arr) {
            ((TreeMap)tempHashMap.computeIfAbsent(serverType, (v) -> new TreeMap())).put(model.getId(), model);
         }
      }

      pool.putMap("custom_province_name_server_type", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getGroupType() {
      return this.groupType;
   }

   public void setGroupType(int groupType) {
      this.checkModify();
      this.groupType = groupType;
   }

   public String getAreanShow() {
      return this.areanShow;
   }

   public void setAreanShow(String areanShow) {
      this.checkModify();
      this.areanShow = areanShow;
   }

   public List<String> getReplaceGrouptype() {
      return this.replaceGrouptype;
   }

   public void setReplaceGrouptype(List<String> replaceGrouptype) {
      this.checkModify();
      this.replaceGrouptype = replaceGrouptype;
   }
}
