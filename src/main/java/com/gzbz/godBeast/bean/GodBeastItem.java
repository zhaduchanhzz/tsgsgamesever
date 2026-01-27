package com.gzbz.godBeast.bean;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.godBeast.GodBeastDefine;
import com.gzbz.model.GodBeastModel;
import com.gzbz.model.GodBeastPassiveSkillModel;
import com.gzbz.model.GodBeastSkillModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

public class GodBeastItem extends ItemBase {
   public Map<Integer, PropertyModel> attrMap = new HashMap();
   public int level;
   private int starId;
   public int exp;
   public int starUpProgress;
   public int passiveSkillId;
   public Map<Integer, Integer> attrSkillMap = new HashMap();
   public boolean isLock = false;
   public int martRecTime;
   public NeiDanItem mainNeiDan;

   public void init(int code, int num, ItemModel itemModel, GamePlayer gamePlayer) {
      super.init(code, num, itemModel, gamePlayer);
      this.level = 0;
      GodBeastModel godBeastModel = GodBeastDefine.getGodBeastModel(itemModel.getId());
      this.starId = godBeastModel.getUpStarID();
      this.exp = 0;
      this.starUpProgress = 0;
      this.passiveSkillId = 0;
      this.isLock = godBeastModel.getIsLock() > 0;
      this.martRecTime = 0;
   }

   public void developInherit(GodBeastItem godBeastItem) {
      this.level = godBeastItem.level;
      this.exp = godBeastItem.exp;
      this.starUpProgress = godBeastItem.starUpProgress;
      this.passiveSkillId = godBeastItem.passiveSkillId;
      this.attrSkillMap.clear();
      this.attrSkillMap.putAll(godBeastItem.attrSkillMap);
      this.starId = GodBeastDefine.recStarIdWhenGodBeastIdChange(this.id, godBeastItem.getStarId());
   }

   public void aptitudeInherit(GodBeastItem godBeastItem) {
      if (null != godBeastItem) {
         this.attrMap.clear();
         this.attrMap.putAll(godBeastItem.attrMap);
      }
   }

   public boolean checkReset() {
      GodBeastModel godBeastModel = GodBeastDefine.getGodBeastModel(this.id);
      if (null == godBeastModel) {
         return false;
      } else {
         return this.level != 0 || this.starId != 0 && this.starId != godBeastModel.getUpStarID() || this.exp != 0 || this.starUpProgress != 0 || this.passiveSkillId != 0 || !this.attrSkillMap.isEmpty();
      }
   }

   public void reset() {
      this.level = 0;
      this.starId = GodBeastDefine.getGodBeastModel(this.id).getUpStarID();
      this.exp = 0;
      this.starUpProgress = 0;
      this.passiveSkillId = 0;
      this.attrSkillMap.clear();
   }

   public List<ResourceModel> recResetCost() {
      List<ResourceModel> resetCost = new ArrayList();
      if (this.passiveSkillId <= 0 && this.attrSkillMap.isEmpty()) {
         return resetCost;
      } else {
         GodBeastPassiveSkillModel godBeastPassiveSkillModel = GodBeastDefine.getGodBeastPassiveSkillModel(this.passiveSkillId);
         if (null != godBeastPassiveSkillModel) {
            resetCost.addAll(godBeastPassiveSkillModel.getReSet());
         }

         for(Map.Entry<Integer, Integer> entry : this.attrSkillMap.entrySet()) {
            Integer skillId = (Integer)entry.getValue();
            GodBeastSkillModel curSkillModel = GodBeastDefine.getGodBeastSkillModel(skillId);
            if (null != curSkillModel) {
               resetCost.addAll(curSkillModel.getReSet());
            }
         }

         return resetCost;
      }
   }

   public GodBeastItem() {
   }

   public GodBeastItem(Map<Integer, PropertyModel> attrMap) {
      this.attrMap.clear();
      this.attrMap.putAll(attrMap);
   }

   public GodBeastItem(int godBeastId, Map<Integer, PropertyModel> attrMap) {
      this.attrMap.clear();
      this.attrMap.putAll(attrMap);
      ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", godBeastId);
      this.init(0, 1, itemModel, (GamePlayer)null);
   }

   public GodBeastItem(int code, GodBeastItem data) {
      this.code = code;
      this.id = data.id;
      this.num = data.num;
      this.enableTime = data.enableTime;
      this.attrMap.clear();
      this.attrMap.putAll(data.attrMap);
      this.level = data.level;
      this.starId = data.starId;
      this.exp = data.exp;
      this.starUpProgress = data.starUpProgress;
      this.passiveSkillId = data.passiveSkillId;
      this.attrSkillMap.clear();
      this.attrSkillMap.putAll(data.attrSkillMap);
      this.isLock = data.isLock;
      this.martRecTime = data.martRecTime;
      this.mainNeiDan = data.mainNeiDan;
   }

   public int getStarId() {
      if (this.starId > 0) {
         return this.starId;
      } else {
         GodBeastModel godBeastModel = GodBeastDefine.getGodBeastModel(this.id);
         return godBeastModel.getUpStarID();
      }
   }

   public void setStarId(int starId) {
      this.starId = starId;
   }

   public void decode(String data) {
      if (!StringUtils.isBlank(data)) {
         String[] fieldArr = data.split(",");
         if (fieldArr.length >= 9) {
            this.code = Integer.parseInt(fieldArr[0]);
            this.id = Integer.parseInt(fieldArr[1]);
            this.num = Integer.parseInt(fieldArr[2]);
            this.enableTime = Integer.parseInt(fieldArr[3]);
            this.level = Integer.parseInt(fieldArr[4]);
            this.starId = Integer.parseInt(fieldArr[5]);
            this.exp = Integer.parseInt(fieldArr[6]);
            this.starUpProgress = Integer.parseInt(fieldArr[7]);
            this.passiveSkillId = Integer.parseInt(fieldArr[8]);
            if (fieldArr.length > 9) {
               String attrStr = fieldArr[9];
               this.attrMap.clear();
               if (StringUtils.isNotBlank(attrStr)) {
                  String[] attrArr = attrStr.split(";");

                  for(String attr : attrArr) {
                     String[] proArr = attr.split("_");
                     if (proArr.length >= 3) {
                        int type = Integer.parseInt(proArr[0]);
                        int way = Integer.parseInt(proArr[1]);
                        int value = Integer.parseInt(proArr[2]);
                        this.attrMap.put(type, new PropertyModel(type, way, (long)value));
                     }
                  }
               }
            }

            if (fieldArr.length > 10) {
               String attrSkillStr = fieldArr[10];
               this.attrSkillMap.clear();
               if (StringUtils.isNotBlank(attrSkillStr)) {
                  String[] attrSkillArr = attrSkillStr.split(";");

                  for(String attrSkill : attrSkillArr) {
                     String[] slot_skillId = attrSkill.split("_");
                     if (slot_skillId.length >= 2) {
                        int slot = Integer.parseInt(slot_skillId[0]);
                        int skillId = Integer.parseInt(slot_skillId[1]);
                        this.attrSkillMap.put(slot, skillId);
                     }
                  }
               }
            }

            if (fieldArr.length > 11) {
               this.isLock = Integer.parseInt(fieldArr[11]) > 0;
            }

            if (fieldArr.length > 12) {
               this.martRecTime = Integer.parseInt(fieldArr[12]);
            }

            if (fieldArr.length > 13) {
               this.mainNeiDan = new NeiDanItem();
               this.mainNeiDan.decode(fieldArr[13]);
            }

         }
      }
   }

   public String encode() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.code);
      stringBuilder.append(",");
      stringBuilder.append(this.id);
      stringBuilder.append(",");
      stringBuilder.append(this.num);
      stringBuilder.append(",");
      stringBuilder.append(this.enableTime);
      stringBuilder.append(",");
      stringBuilder.append(this.level);
      stringBuilder.append(",");
      stringBuilder.append(this.starId);
      stringBuilder.append(",");
      stringBuilder.append(this.exp);
      stringBuilder.append(",");
      stringBuilder.append(this.starUpProgress);
      stringBuilder.append(",");
      stringBuilder.append(this.passiveSkillId);
      stringBuilder.append(",");
      if (this.attrMap.size() > 0) {
         for(Map.Entry<Integer, PropertyModel> entry : this.attrMap.entrySet()) {
            PropertyModel pm = (PropertyModel)entry.getValue();
            stringBuilder.append(pm.getType()).append("_").append(pm.getWay()).append("_").append(pm.getValue()).append(";");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      stringBuilder.append(",");
      if (this.attrSkillMap.size() > 0) {
         for(Map.Entry<Integer, Integer> entry : this.attrSkillMap.entrySet()) {
            Integer slot = (Integer)entry.getKey();
            Integer skillId = (Integer)entry.getValue();
            stringBuilder.append(slot).append("_").append(skillId).append(";");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      stringBuilder.append(",");
      stringBuilder.append(this.isLock ? 1 : 0);
      stringBuilder.append(",");
      stringBuilder.append(this.martRecTime);
      stringBuilder.append(",");
      if (null != this.mainNeiDan) {
         stringBuilder.append(this.mainNeiDan.encode());
      }

      return stringBuilder.toString();
   }

   public CommonMsg.GodBeastInfo.Builder recGodBeastInfoBuilder() {
      return GodBeastDefine.recGodBeastInfoBuilder(this);
   }
}
