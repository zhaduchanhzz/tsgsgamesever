package com.gzbz.exclusiveWeapon.bean;

import com.gzbz.exclusiveWeapon.EWeaponDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.model.ExclusiveWeaponBaseModel;
import com.gzbz.model.ExclusiveWeaponLevelModel;
import com.gzbz.model.ExclusiveWeaponStarLibModel;
import com.gzbz.model.ExclusiveWeaponUpStarModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.NeedItemsFun2;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class ExclusiveWeaponItem extends ItemBase {
   public int level;
   private int starId;
   public int exp;
   public boolean isLock;

   public ExclusiveWeaponItem() {
   }

   public ExclusiveWeaponItem(int id, int starId) {
      ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", id);
      this.code = 0;
      this.id = id;
      this.num = 1;
      if (itemModel.getTargetclass() == 7 && itemModel.getTimeOut() > 0) {
         this.enableTime = (int)(System.currentTimeMillis() / 1000L) + itemModel.getTimeOut();
      }

      this.level = 0;
      this.starId = starId;
      this.exp = 0;
      ExclusiveWeaponBaseModel exclusiveWeaponBaseModel = EWeaponDefine.getExclusiveWeaponBaseModel(id);
      this.isLock = exclusiveWeaponBaseModel == null || exclusiveWeaponBaseModel.getIsLock() > 0;
   }

   public ExclusiveWeaponItem(int code, ExclusiveWeaponItem data) {
      this.code = code;
      this.id = data.id;
      this.num = data.num;
      this.enableTime = data.enableTime;
      this.level = data.level;
      this.starId = data.starId;
      this.exp = data.exp;
      this.isLock = data.isLock;
   }

   public void init(int code, int num, ItemModel itemModel, GamePlayer gamePlayer) {
      super.init(code, num, itemModel, gamePlayer);
      this.level = 0;
      ExclusiveWeaponBaseModel exclusiveWeaponBaseModel = EWeaponDefine.getExclusiveWeaponBaseModel(itemModel.getId());
      this.starId = exclusiveWeaponBaseModel == null ? 0 : exclusiveWeaponBaseModel.getUpStarId();
      this.exp = 0;
      this.isLock = exclusiveWeaponBaseModel == null || exclusiveWeaponBaseModel.getIsLock() > 0;
   }

   public int getStarId() {
      if (this.starId > 0) {
         return this.starId;
      } else {
         ExclusiveWeaponBaseModel exclusiveWeaponBaseModel = EWeaponDefine.getExclusiveWeaponBaseModel(this.id);
         return exclusiveWeaponBaseModel != null ? exclusiveWeaponBaseModel.getUpStarId() : 0;
      }
   }

   public void setStarId(int starId) {
      this.starId = starId;
   }

   public int recStarLv() {
      ExclusiveWeaponUpStarModel exclusiveWeaponUpStarModel = EWeaponDefine.getExclusiveWeaponUpStarModel(this.getStarId());
      return null == exclusiveWeaponUpStarModel ? 0 : exclusiveWeaponUpStarModel.getStarLevel();
   }

   public int recQuality() {
      ExclusiveWeaponBaseModel exclusiveWeaponBaseModel = EWeaponDefine.getExclusiveWeaponBaseModel(this.id);
      return null == exclusiveWeaponBaseModel ? 0 : exclusiveWeaponBaseModel.getQuality();
   }

   public boolean canLvReset() {
      return this.level > 0 || this.exp > 0;
   }

   public boolean canStarReset() {
      ExclusiveWeaponBaseModel exclusiveWeaponBaseModel = EWeaponDefine.getExclusiveWeaponBaseModel(this.id);
      int curStarId = this.getStarId();
      if (null != exclusiveWeaponBaseModel && exclusiveWeaponBaseModel.getUpStarId() > 0 && curStarId > 0) {
         return exclusiveWeaponBaseModel.getUpStarId() != curStarId;
      } else {
         return false;
      }
   }

   public ResourceModel recLvResetReward() {
      if (!this.canLvReset()) {
         return null;
      } else {
         int totalExp = 0;
         totalExp += this.exp;
         ExclusiveWeaponLevelModel levelModel = EWeaponDefine.getExclusiveWeaponLevelModel(this.level);
         if (null != levelModel) {
            totalExp += levelModel.getGetEX();
         }

         KeyValFun expItem = EWeaponDefine.getExpItem();
         int num = totalExp / expItem.getVal();
         return new ResourceModel(2, expItem.getKey(), num);
      }
   }

   public List<ExclusiveWeaponItem> recStarResetReward() {
      List<ExclusiveWeaponItem> resetReward = new ArrayList();
      if (!this.canStarReset()) {
         return resetReward;
      } else {
         ExclusiveWeaponBaseModel exclusiveWeaponBaseModel = EWeaponDefine.getExclusiveWeaponBaseModel(this.id);
         int curStarId = this.getStarId();

         ExclusiveWeaponUpStarModel starModel;
         for(int initStarId = exclusiveWeaponBaseModel.getUpStarId(); initStarId > 0 && initStarId != curStarId; initStarId = starModel.getNext()) {
            starModel = EWeaponDefine.getExclusiveWeaponUpStarModel(initStarId);
            if (null == starModel) {
               break;
            }

            List<NeedItemsFun2> needItemsFunList = new ArrayList();
            if (starModel.getItemId() > 0) {
               NeedItemsFun2 mainItemFun = new NeedItemsFun2(starModel.getItemId(), starModel.getItemStar(), starModel.getItemNum());
               needItemsFunList.add(mainItemFun);
            }

            ExclusiveWeaponStarLibModel libModel = EWeaponDefine.getExclusiveWeaponStarLibModel(starModel.getLibId());
            if (null != libModel) {
               needItemsFunList.addAll(libModel.getNeedItemsFun());
            }

            for(NeedItemsFun2 needItemsFun : needItemsFunList) {
               int type = needItemsFun.getType();
               int star = needItemsFun.getStar();
               int needNum = needItemsFun.getNum();
               ExclusiveWeaponBaseModel baseModel = null;
               if (type > 10) {
                  baseModel = EWeaponDefine.getExclusiveWeaponBaseModel(type);
               } else {
                  baseModel = EWeaponDefine.getRandomExclusiveWeaponBaseModel(type);
               }

               if (baseModel != null) {
                  ExclusiveWeaponUpStarModel rewardStarModel = EWeaponDefine.getExclusiveWeaponUpStarModel(baseModel.getWeaponId(), star);
                  int rewardStarId = rewardStarModel.getId();
                  ExclusiveWeaponItem reward = new ExclusiveWeaponItem(baseModel.getWeaponId(), rewardStarId);

                  for(int i = 0; i < needNum; ++i) {
                     resetReward.add(reward);
                  }
               }
            }
         }

         return resetReward;
      }
   }

   public void decode(String data) {
      if (!StringUtils.isBlank(data)) {
         String[] fieldArr = data.split(",");
         if (fieldArr.length >= 8) {
            this.code = Integer.parseInt(fieldArr[0]);
            this.id = Integer.parseInt(fieldArr[1]);
            this.num = Integer.parseInt(fieldArr[2]);
            this.enableTime = Integer.parseInt(fieldArr[3]);
            this.level = Integer.parseInt(fieldArr[4]);
            this.starId = Integer.parseInt(fieldArr[5]);
            this.exp = Integer.parseInt(fieldArr[6]);
            this.isLock = Integer.parseInt(fieldArr[7]) > 0;
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
      stringBuilder.append(this.isLock ? 1 : 0);
      return stringBuilder.toString();
   }
}
