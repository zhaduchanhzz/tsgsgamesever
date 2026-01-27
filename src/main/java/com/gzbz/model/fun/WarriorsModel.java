package com.gzbz.model.fun;

import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.ItemModel;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class WarriorsModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      comment = "ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "skills",
      comment = "技能"
   )
   private String skills;
   @ModelColumnAnno(
      columnName = "properties",
      comment = "属性"
   )
   private String properties;

   public WarriorsModel() {
   }

   public WarriorsModel(int id, String skills, String properties) {
      this.id = id;
      this.skills = skills;
      this.properties = properties;
   }

   public WarriorSignet toWarriorSignet() {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      ItemModel itemModel = (ItemModel)gameModelPool.getEntity("item", this.id);
      if (itemModel == null) {
         return null;
      } else {
         List<Integer> skills = new ArrayList();
         if (this.skills != null && this.skills.length() > 0) {
            String[] skillStr = this.skills.split("\\|");

            for(String s : skillStr) {
               skills.add(Integer.valueOf(s));
            }
         }

         List<PropertyModel> properties = new ArrayList();
         if (this.properties != null && this.properties.length() > 0) {
            String[] propertyStr = this.properties.split(",");

            for(String tempStr : propertyStr) {
               if (tempStr != null && tempStr.length() > 0) {
                  String[] tempArray = tempStr.split("\\|");
                  if (tempArray.length == 3) {
                     PropertyModel propertyModel = new PropertyModel(Integer.valueOf(tempArray[0]), Integer.valueOf(tempArray[1]), (long)Integer.valueOf(tempArray[2]));
                     properties.add(propertyModel);
                  }
               }
            }
         }

         WarriorSignet warriorSignet = new WarriorSignet(0, this.id, 0, properties, skills);
         return warriorSignet;
      }
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getSkills() {
      return this.skills;
   }

   public void setSkills(String skills) {
      this.checkModify();
      this.skills = skills;
   }

   public String getProperties() {
      return this.properties;
   }

   public void setProperties(String properties) {
      this.checkModify();
      this.properties = properties;
   }
}
