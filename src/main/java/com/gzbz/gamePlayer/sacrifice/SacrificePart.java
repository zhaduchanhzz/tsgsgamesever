package com.gzbz.gamePlayer.sacrifice;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroDao;
import com.gzbz.db.HeroPalaceDao;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroPalacePart;
import com.gzbz.gamePlayer.heroPart.HeroUpgradePart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.RecyclingRewardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.SacrificeMsg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class SacrificePart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(HeroUpgradePart.class);
   public static final int TYPE_HERO = 1;
   public static final int TYPE_SOUL = 2;
   public static final int TYPE_HERO_QUICK = 3;
   public static final String ONE_CLICK_SACRIFICE = "OneclickSacrifice";
   @Autowired
   ConfigManager configManager;

   @MsgHandlerAnno
   public void msgSacrificeHero(SacrificeMsg.C2S_SacrificeHero_8501 msg, String source) {
      Set<Integer> codeSet = new HashSet(msg.getCodeList());
      List<Integer> codeList = new ArrayList(codeSet);
      this.handleSacrificeHero(codeList, 1, false);
   }

   @MsgHandlerAnno
   public void msgSacrificeSoul(SacrificeMsg.C2S_SacrificeSoul_8503 msg, String source) {
      this.handleSacrificeSoul(msg.getCode(), msg.getNum(), false);
   }

   @MsgHandlerAnno
   public void msgSacrificeOperate(SacrificeMsg.C2S_SacrificeOperate_8505 msg, String source) {
      int type = msg.getType();
      if (type == 1) {
         Set<Integer> codeSet = new HashSet(msg.getCodeList());
         List<Integer> codeList = new ArrayList(codeSet);
         this.handleSacrificeHero(codeList, type, true);
      } else if (type == 3) {
         List<Integer> codeList = this.getSacrificeQuickHeroList();
         this.handleSacrificeHero(codeList, type, true);
      } else if (type == 2) {
         List<Integer> codeList = msg.getCodeList();
         if (codeList.size() == 0) {
            return;
         }

         this.handleSacrificeSoul((Integer)codeList.get(0), msg.getNum(), true);
      }

   }

   private void notifyClient(int type) {
      SacrificeMsg.S2C_SacrificeOperate_8506.Builder builder = SacrificeMsg.S2C_SacrificeOperate_8506.newBuilder();
      builder.setType(type);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void msgSacrificeQuick(SacrificeMsg.C2S_SacrificeQuick_8507 msg, String source) {
      List<Integer> list = this.getSacrificeQuickHeroList();
      if (0 == list.size()) {
         this.sendRewardPreview(3, false, new ArrayList());
      } else {
         this.handleSacrificeHero(list, 3, false);
      }
   }

   private boolean handleSacrificeHero(List<Integer> codeList, int type, boolean submit) {
      if (CollectionUtils.isEmpty(codeList)) {
         return false;
      } else if (!this.player.isSystemOpen(1120)) {
         return this.player.failure(21);
      } else {
         boolean bRare = false;
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroPalacePart heroPalacePart = (HeroPalacePart)this.player.getMgrPart(HeroPalacePart.class);
         HeroPalaceDao heroPalaceDao = heroPalacePart.getHeroPalaceDao();

         for(Integer code : codeList) {
            HeroDao heroDao = heroBagPart.getHeroByCode(code);
            if (heroDao == null) {
               return this.player.failure(6);
            }

            if (heroDao.isHaveArrayingState()) {
               return this.player.failure(38);
            }

            if (heroDao.lock) {
               return this.player.failure(39);
            }

            if (heroDao.code == heroPalaceDao.heroCode) {
               return this.player.failure(76042);
            }

            if (heroDao.code == heroPalaceDao.shareCode) {
               return this.player.failure(76047);
            }

            if (heroBagPart.linkHeroCantDo(heroDao)) {
               return false;
            }

            bRare = bRare || heroDao.getStar() >= 4;
         }

         List<CommonMsg.ItemInfo.Builder> delHeroReturnResourceList = heroBagPart.getDelHeroReturnResourceList(codeList, HeroDefine.DelHeroReturnShowType.SACRIFICE);
         if (delHeroReturnResourceList != null && delHeroReturnResourceList.size() != 0) {
            if (submit) {
               boolean success = heroBagPart.deleteHero(codeList, HeroDefine.DelHeroType.SACRIFICE, 25, 2501, 0, 0, "");
               if (!success) {
                  this.logger.info("删除武将失败 playerId:{} codeList:{}", this.player.getPlayerId(), codeList);
                  return false;
               }

               this.player.senditemUpdateMsg();
               this.player.sendResourceMsg();
               this.player.triggerTask(213, 0, (long)codeList.size(), 1);
               this.notifyClient(type);
            } else {
               this.sendRewardPreview(type, bRare, delHeroReturnResourceList);
            }

            return true;
         } else {
            this.logger.info("下野武将列表为空，没有返回任何物品");
            return false;
         }
      }
   }

   private boolean handleSacrificeSoul(int code, int num, boolean submit) {
      List<ResourceModel> resourceModelList = new ArrayList();
      List<CommonMsg.ItemInfo.Builder> itemInfoBuilderList = new ArrayList();
      if (num <= 0) {
         return false;
      } else {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         ItemBase itemBase = itemBagPart.getItemByCode(code);
         if (itemBase == null) {
            return this.player.failure(5);
         } else if (itemBase.getNum() < num) {
            return this.player.failure(3);
         } else {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
            if (itemModel == null) {
               return this.player.failure(5);
            } else if (itemModel.getTargetclass() == 27) {
               return this.player.failure(76505);
            } else {
               RecyclingRewardModel recyclingRewardModel = (RecyclingRewardModel)this.player.getGameModelPool().getEntity("recyclingReward", Integer.valueOf(itemModel.getStar()));
               if (recyclingRewardModel == null) {
                  return this.player.failure(25000);
               } else {
                  for(ResourceModel resourceModel : recyclingRewardModel.getRewardList()) {
                     ResourceModel reward = new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * num);
                     ResourceModel.addResourceToList(resourceModelList, reward);
                     itemInfoBuilderList.add(ResourceModel.builderItemInfo(reward));
                  }

                  if (submit) {
                     this.player.delResource(2, itemBase.id, (long)num, 25, 2502, 0, 0, "");
                     this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 25, 2502, 0, 0, "");
                     this.notifyClient(2);
                  } else {
                     this.sendRewardPreview(2, false, itemInfoBuilderList);
                  }

                  return true;
               }
            }
         }
      }
   }

   private void sendRewardPreview(int type, boolean bRare, List<CommonMsg.ItemInfo.Builder> itemInfoBuilderList) {
      SacrificeMsg.S2C_SacrificeReward_8502.Builder builder = SacrificeMsg.S2C_SacrificeReward_8502.newBuilder();
      builder.setType(type);
      builder.setRare(bRare);

      for(CommonMsg.ItemInfo.Builder itemInfo : itemInfoBuilderList) {
         builder.addItems(itemInfo);
      }

      this.player.sendMsg(builder.build());
   }

   private List<Integer> getSacrificeQuickHeroList() {
      Set<Integer> codeSet = new HashSet();
      Map<Integer, List<Integer>> map = new HashMap();
      Map<Integer, HeroDao> herosMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());

      for(Map.Entry<Integer, HeroDao> entry : herosMap.entrySet()) {
         HeroDao heroDao = (HeroDao)entry.getValue();
         if (!heroDao.lock && !heroDao.isHaveArrayingState()) {
            if (heroDao.getStar() < 3) {
               codeSet.add(heroDao.code);
            } else if (heroDao.getStar() == 3) {
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
               ((List)map.computeIfAbsent(heroModel.getNation(), (k) -> new ArrayList())).add(heroDao.code);
            }
         }
      }

      for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
         List<Integer> tempList = (List)entry.getValue();
         int countLimit = this.configManager.getIntDefault("OneclickSacrifice", 20);
         if (tempList.size() > countLimit) {
            codeSet.addAll(tempList.subList(0, tempList.size() - countLimit));
         }
      }

      List<Integer> list = new ArrayList(codeSet);
      return list;
   }
}
