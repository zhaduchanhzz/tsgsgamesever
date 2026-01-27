package com.gzbz.gamePlayer.playerBag;

import cn.hutool.core.util.StrUtil;
import com.gzbz.model.ExclusiveTreasureActivationModel;
import com.gzbz.model.ExclusiveTreasureExtraModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.RandomUtil;

public class ExclusiveTreasure implements Serializable {
   public int lev;
   public int star;
   public int extraProId;
   public int condition1;
   public int condition2;
   public int skillId;
   public int recastProId;
   public int recastCondition1;
   public int recastCondition2;
   public int recastSkillId;
   public Map<CommonMsg.StonePosition, Integer> stoneMap = new HashMap();

   public ExclusiveTreasure() {
      this.lev = 1;
      this.star = 0;
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      Map<Integer, ExclusiveTreasureActivationModel> activationModelMap = gameModelPool.getMap("exclusiveTreasureActivation");
      List<ExclusiveTreasureActivationModel> activationList1 = new ArrayList();

      for(ExclusiveTreasureActivationModel model : activationModelMap.values()) {
         if (model.getAddType() == 1) {
            activationList1.add(model);
         }
      }

      List<KeyValFun> funList = new ArrayList();

      for(int i = 0; i < activationList1.size(); ++i) {
         funList.add(new KeyValFun(((ExclusiveTreasureActivationModel)activationList1.get(i)).getId(), ((ExclusiveTreasureActivationModel)activationList1.get(i)).getRate()));
      }

      int activation1 = this.countRate(funList);
      funList.clear();
      ExclusiveTreasureActivationModel activeModel = (ExclusiveTreasureActivationModel)activationModelMap.get(activation1);
      List<ExclusiveTreasureActivationModel> activationList2 = new ArrayList();

      for(ExclusiveTreasureActivationModel model : activationModelMap.values()) {
         if (model.getAddType() == 2 && activeModel.getGroup() == model.getGroup()) {
            activationList2.add(model);
         }
      }

      for(int i = 0; i < activationList2.size(); ++i) {
         funList.add(new KeyValFun(((ExclusiveTreasureActivationModel)activationList2.get(i)).getId(), ((ExclusiveTreasureActivationModel)activationList2.get(i)).getRate()));
      }

      int activation2 = this.countRate(funList);
      this.condition1 = activation1;
      this.condition2 = activation2;
      Map<Integer, ExclusiveTreasureExtraModel> extraMap = gameModelPool.getMap("exclusiveTreasureExtra");
      List<ExclusiveTreasureExtraModel> extraList1 = new ArrayList();

      for(ExclusiveTreasureExtraModel model : extraMap.values()) {
         if (model.getAddType() == 1) {
            extraList1.add(model);
         }
      }

      List<ExclusiveTreasureExtraModel> extraList2 = new ArrayList();

      for(ExclusiveTreasureExtraModel model : extraMap.values()) {
         if (model.getAddType() == 2) {
            extraList2.add(model);
         }
      }

      funList.clear();

      for(int i = 0; i < extraList1.size(); ++i) {
         funList.add(new KeyValFun(((ExclusiveTreasureExtraModel)extraList1.get(i)).getId(), ((ExclusiveTreasureExtraModel)extraList1.get(i)).getRate()));
      }

      int proId = this.countRate(funList);
      funList.clear();

      for(int i = 0; i < extraList2.size(); ++i) {
         funList.add(new KeyValFun(((ExclusiveTreasureExtraModel)extraList2.get(i)).getId(), ((ExclusiveTreasureExtraModel)extraList2.get(i)).getRate()));
      }

      int skillId = this.countRate(funList);
      this.extraProId = proId;
      this.skillId = skillId;
   }

   public ExclusiveTreasure(CommonMsg.ExclusiveInfo info) {
   }

   public int countRate(List<KeyValFun> list) {
      if (list != null && !list.isEmpty()) {
         int maxRate = 0;

         for(KeyValFun fun : list) {
            if (fun.getVal() > 0) {
               maxRate += fun.getVal();
            }
         }

         int randInt = RandomUtil.randInt(maxRate);

         for(KeyValFun fun : list) {
            if (fun.getVal() > 0) {
               if (randInt < fun.getVal()) {
                  return fun.getKey();
               }

               randInt -= fun.getVal();
            }
         }

         return ((KeyValFun)list.get(0)).getKey();
      } else {
         return -1;
      }
   }

   public void decode(String data) {
      String[] strs = data.split(";");
      this.lev = Integer.parseInt(strs[0]);
      this.star = Integer.parseInt(strs[1]);
      this.extraProId = Integer.parseInt(strs[2]);
      this.condition1 = Integer.parseInt(strs[3]);
      this.condition2 = Integer.parseInt(strs[4]);
      this.skillId = Integer.parseInt(strs[5]);
      this.recastProId = Integer.parseInt(strs[6]);
      this.recastCondition1 = Integer.parseInt(strs[7]);
      this.recastCondition2 = Integer.parseInt(strs[8]);
      this.recastSkillId = Integer.parseInt(strs[9]);
      if (strs.length > 10 && StrUtil.isNotEmpty(strs[10])) {
         String[] array_sub_1 = strs[10].split(",");

         for(String tempStr : array_sub_1) {
            String[] array_sub_2 = tempStr.split("_");
            if (array_sub_2.length >= 2) {
               this.stoneMap.put(CommonMsg.StonePosition.forNumber(Integer.valueOf(array_sub_2[0])), Integer.valueOf(array_sub_2[1]));
            }
         }
      }

   }

   public String encode() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.lev).append(";");
      stringBuilder.append(this.star).append(";");
      stringBuilder.append(this.extraProId).append(";");
      stringBuilder.append(this.condition1).append(";");
      stringBuilder.append(this.condition2).append(";");
      stringBuilder.append(this.skillId).append(";");
      stringBuilder.append(this.recastProId).append(";");
      stringBuilder.append(this.recastCondition1).append(";");
      stringBuilder.append(this.recastCondition2).append(";");
      stringBuilder.append(this.recastSkillId).append(";");

      for(Map.Entry<CommonMsg.StonePosition, Integer> entry : this.stoneMap.entrySet()) {
         stringBuilder.append(((CommonMsg.StonePosition)entry.getKey()).getNumber()).append("_");
         stringBuilder.append(entry.getValue()).append(",");
      }

      stringBuilder.append(this.recastSkillId).append(";");
      return stringBuilder.toString();
   }
}
