package com.gzbz.db.bean;

import com.gzbz.model.fun.ResourceModel;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ArmyArrayData implements Serializable {
   public int grid;
   public int arrayId;
   public int eye;
   public Map<Integer, ResourceModel> protectedMap = new HashMap();

   public void decode(String data) {
      String[] strArray = data.split(",");
      this.grid = Integer.parseInt(strArray[0]);
      this.arrayId = Integer.parseInt(strArray[1]);
      this.eye = Integer.parseInt(strArray[2]);
      this.protectedMap.clear();
      if (strArray.length > 3) {
         String[] strProtectedArr = strArray[3].split(":");
         if (strProtectedArr.length > 0) {
            for(String cellProtected : strProtectedArr) {
               String[] s = cellProtected.split("_");
               ResourceModel resourceModel = new ResourceModel(Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]));
               this.protectedMap.put(Integer.parseInt(s[0]), resourceModel);
            }
         }
      }

   }

   public String encode() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.grid);
      stringBuilder.append(",");
      stringBuilder.append(this.arrayId);
      stringBuilder.append(",");
      stringBuilder.append(this.eye);
      if (this.protectedMap.size() > 0) {
         stringBuilder.append(",");

         for(Map.Entry<Integer, ResourceModel> entry : this.protectedMap.entrySet()) {
            ResourceModel resourceModel = (ResourceModel)entry.getValue();
            stringBuilder.append(entry.getKey());
            stringBuilder.append("_");
            stringBuilder.append(resourceModel.getType());
            stringBuilder.append("_");
            stringBuilder.append(resourceModel.getId());
            stringBuilder.append("_");
            stringBuilder.append(resourceModel.getValue());
            stringBuilder.append(":");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
