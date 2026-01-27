package com.gzbz.gamePlayer.pet;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.model.ItemModel;
import com.gzbz.model.PetModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import misc.RandomUtil;

public class Pet extends ItemBase {
   public int lv = 1;
   public int star = 1;
   public int breach;
   public boolean isLock;
   public List<Integer> growUp = new ArrayList();
   public List<Integer> skills = new ArrayList();

   public void init(int code, int num, ItemModel itemModel, GamePlayer gamePlayer) {
      PetModel petModel = (PetModel)ApplicationContextProvider.getModelPoolEntity("pet", itemModel.getId());
      if (petModel != null) {
         super.init(code, num, itemModel, gamePlayer);
         this.lv = 1;
         this.star = 1;
         this.breach = 0;
         int atkGroup = RandomUtil.randInt(petModel.getAtkGrowUpMix() / 1000, petModel.getAtkGrowUpMax() / 1000 + 1);
         int hpGroup = RandomUtil.randInt(petModel.getHpGrowUpMix() / 1000, petModel.getHpGrowUpMax() / 1000 + 1);
         this.growUp.add(hpGroup * 1000);
         this.growUp.add(atkGroup * 1000);
         this.skills.add(0);
         this.skills.add(0);
         gamePlayer.pushPartTaskEx(PetPart.class, "addPetDictionaryEx", new Object[]{this.id});
      }
   }

   public void decode(String data) {
      String[] array = data.split(";");
      this.lv = Integer.parseInt(array[0]);
      this.star = Integer.parseInt(array[1]);
      this.breach = Integer.parseInt(array[2]);
      this.isLock = Integer.parseInt(array[3]) == 1;
      String[] array_sub_grow = array[4].split(",");

      for(String grow : array_sub_grow) {
         this.growUp.add(Integer.parseInt(grow));
      }

      String[] array_sub_skill = array[5].split(",");

      for(String skillId : array_sub_skill) {
         this.skills.add(Integer.parseInt(skillId));
      }

   }

   public String encode() {
      StringBuilder sb = new StringBuilder();
      sb.append(this.lv).append(";");
      sb.append(this.star).append(";");
      sb.append(this.breach).append(";");
      sb.append(this.isLock ? 1 : 0).append(";");

      for(Integer grow : this.growUp) {
         sb.append(grow).append(",");
      }

      sb.append(";");

      for(Integer skillId : this.skills) {
         sb.append(skillId).append(",");
      }

      sb.append(";");
      return sb.toString();
   }
}
