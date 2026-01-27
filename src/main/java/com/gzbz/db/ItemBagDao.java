package com.gzbz.db;

import com.gzbz.exclusiveWeapon.bean.ExclusiveWeaponItem;
import com.gzbz.gamePlayer.horse.WarHorse;
import com.gzbz.gamePlayer.pet.Pet;
import com.gzbz.gamePlayer.playerBag.BagParent;
import com.gzbz.gamePlayer.playerBag.EquipItem;
import com.gzbz.gamePlayer.playerBag.HeroAideItem;
import com.gzbz.gamePlayer.playerBag.Item;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gamePlayer.playerBag.Magic;
import com.gzbz.gamePlayer.playerBag.OrnamentItem;
import com.gzbz.gamePlayer.playerBag.RuneStoneItem;
import com.gzbz.gamePlayer.playerBag.Totem;
import com.gzbz.gamePlayer.playerBag.WarFlag;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.godBeast.NeiDanDefine;
import com.gzbz.godBeast.bean.GodBeastItem;
import com.gzbz.godBeast.bean.NeiDanItem;
import com.gzbz.model.EquipEnchantHotModel;
import com.gzbz.model.GodBeastNeiDanBaseModel;
import com.gzbz.model.GodBeastNeiDanEntryModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.ItemPropertyModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.rune.bean.RuneItem;
import com.gzbz.rune.bean.RuneRefineInheritItem;
import com.gzbz.spring.ApplicationContextProvider;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_bag",
   resultType = 0,
   selectKey = {"playerId"},
   mapKey = {"code"}
)
public class ItemBagDao extends DBDao {
   static Logger logger = LoggerFactory.getLogger(ItemBagDao.class);
   public static HashMap<Integer, Class> clsMap = new HashMap();
   @DBColumnAnno(
      skip = true
   )
   private int maxCode = 1;
   @DBColumnAnno(
      skip = true
   )
   private HashMap<Integer, BagParent> bags = new HashMap();
   @DBColumnAnno(
      skip = true
   )
   private HashMap<Integer, ItemBase> itemMap = new HashMap();
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "物品背包",
      columnName = "itemBag",
      columnType = "LONGTEXT",
      loadFun = "loadItem",
      saveFun = "saveItem"
   )
   public BagParent<Item> itemBag = new BagParent<Item>();
   @DBColumnAnno(
      comment = "装备背包",
      columnName = "equipBag",
      columnType = "LONGTEXT",
      loadFun = "loadEquip",
      saveFun = "saveEquip"
   )
   public BagParent<EquipItem> equipBag = new BagParent<EquipItem>();
   @DBColumnAnno(
      comment = "将符背包",
      columnName = "soulBag",
      columnType = "LONGTEXT",
      loadFun = "loadSoul",
      saveFun = "saveSoul"
   )
   public BagParent<Item> soulBag = new BagParent<Item>();
   @DBColumnAnno(
      comment = "将印背包",
      columnName = "warriorSignetBag",
      columnType = "LONGTEXT",
      loadFun = "loadWarriorSignet",
      saveFun = "saveWarriorSignet"
   )
   public BagParent<ItemBase> warriorSignetBag = new BagParent<ItemBase>();
   @DBColumnAnno(
      comment = "图腾背包",
      columnName = "totemBag",
      columnType = "LONGTEXT",
      loadFun = "loadTotem",
      saveFun = "saveTotem"
   )
   public BagParent<Totem> totemBag = new BagParent<Totem>();
   @DBColumnAnno(
      comment = "宝物背包",
      columnName = "treasureBag",
      columnType = "LONGTEXT",
      loadFun = "loadTreasure",
      saveFun = "saveTreasure"
   )
   public BagParent<ItemBase> treasureBag = new BagParent<ItemBase>();
   @DBColumnAnno(
      comment = "副将背包",
      columnName = "aideBag",
      columnType = "LONGTEXT",
      loadFun = "loadAide",
      saveFun = "saveAide"
   )
   public BagParent<HeroAideItem> aideBag = new BagParent<HeroAideItem>();
   @DBColumnAnno(
      comment = "奇谋背包",
      columnName = "magicBag",
      columnType = "LONGTEXT",
      loadFun = "loadMagic",
      saveFun = "saveMagic"
   )
   public BagParent<Magic> magicBag = new BagParent<Magic>();
   @DBColumnAnno(
      comment = "战旗背包",
      columnName = "flagBag",
      columnType = "LONGTEXT",
      loadFun = "loadFlag",
      saveFun = "saveFlag"
   )
   public BagParent<WarFlag> flagBag = new BagParent<WarFlag>();
   @DBColumnAnno(
      comment = "符石背包",
      columnName = "runeStoneBag",
      columnType = "LONGTEXT",
      loadFun = "loadRune",
      saveFun = "saveRune"
   )
   public BagParent<RuneStoneItem> runeStoneBag = new BagParent<RuneStoneItem>();
   @DBColumnAnno(
      comment = "宝石背包",
      columnName = "gemStoneBag",
      columnType = "LONGTEXT",
      loadFun = "loadGem",
      saveFun = "saveGem"
   )
   public BagParent<Item> gemStoneBag = new BagParent<Item>();
   @DBColumnAnno(
      comment = "隐藏背包",
      columnName = "hideBag",
      columnType = "LONGTEXT",
      loadFun = "loadHide",
      saveFun = "saveHide"
   )
   public BagParent<ItemBase> hideBag = new BagParent<ItemBase>();
   @DBColumnAnno(
      comment = "战马背包",
      columnName = "warHorse",
      columnType = "LONGTEXT",
      loadFun = "loadWarHorse",
      saveFun = "saveWarHorse"
   )
   public BagParent<WarHorse> warHorse = new BagParent<WarHorse>();
   @DBColumnAnno(
      comment = "战马碎片背包",
      columnName = "warHorseChip",
      columnType = "LONGTEXT",
      loadFun = "loadWarHorseChip",
      saveFun = "saveWarHorseChip"
   )
   public BagParent<Item> warHorseChip = new BagParent<Item>();
   @DBColumnAnno(
      comment = "神兽背包",
      columnName = "pet",
      columnType = "LONGTEXT",
      loadFun = "loadPet",
      saveFun = "savePet"
   )
   public BagParent<Pet> pet = new BagParent<Pet>();
   @DBColumnAnno(
      comment = "神兽物品背包",
      columnName = "petBag",
      columnType = "LONGTEXT",
      loadFun = "loadPetBag",
      saveFun = "savePetBag"
   )
   public BagParent<ItemBase> petBag = new BagParent<ItemBase>();
   @DBColumnAnno(
      comment = "聊天气泡背包",
      columnName = "bubbleBag",
      columnType = "LONGTEXT",
      loadFun = "loadBubbleBag",
      saveFun = "saveBubbleBag"
   )
   public BagParent<Item> bubbleBag = new BagParent<Item>();
   @DBColumnAnno(
      comment = "符文背包",
      columnName = "runeBag",
      columnType = "LONGTEXT",
      loadFun = "loadRuneBag",
      saveFun = "saveRuneBag"
   )
   public BagParent<RuneItem> runeBag = new BagParent<RuneItem>();
   @DBColumnAnno(
      comment = "符文洗练继承石背包",
      columnName = "runeRefineInheritBag",
      columnType = "LONGTEXT",
      loadFun = "loadRuneRefineInheritBag",
      saveFun = "saveRuneRefineInheritBag"
   )
   public BagParent<RuneRefineInheritItem> runeRefineInheritBag = new BagParent<RuneRefineInheritItem>();
   @DBColumnAnno(
      comment = "勋章背包",
      columnName = "medalBag",
      columnType = "LONGTEXT",
      loadFun = "loadMedalBag",
      saveFun = "saveMedalBag"
   )
   public BagParent<Item> medalBag = new BagParent<Item>();
   @DBColumnAnno(
      comment = "灵兽背包",
      columnName = "godBeastBag",
      columnType = "LONGTEXT",
      loadFun = "loadGodBeastBag",
      saveFun = "saveGodBeastBag"
   )
   public BagParent<GodBeastItem> godBeastBag = new BagParent<GodBeastItem>();
   @DBColumnAnno(
      comment = "灵兽技能书背包",
      columnName = "godBeastSkillBookBag",
      columnType = "LONGTEXT",
      loadFun = "loadGodBeastSkillBookBag",
      saveFun = "saveGodBeastSkillBookBag"
   )
   public BagParent<Item> godBeastSkillBookBag = new BagParent<Item>();
   @DBColumnAnno(
      comment = "专属幻武背包",
      columnName = "exclusiveWeaponBag",
      columnType = "LONGTEXT",
      loadFun = "loadExclusiveWeaponBag",
      saveFun = "saveExclusiveWeaponBag"
   )
   public BagParent<ExclusiveWeaponItem> exclusiveWeaponBag = new BagParent<ExclusiveWeaponItem>();
   @DBColumnAnno(
      comment = "灵兽内丹",
      columnName = "neiDanBag",
      columnType = "LONGTEXT",
      loadFun = "loadNeiDanBag",
      saveFun = "saveNeiDanBag"
   )
   public BagParent<NeiDanItem> neiDanBag = new BagParent<NeiDanItem>();

   public void loadItem(String itemStr) {
      this.loadFunc(1, this.itemBag, itemStr);
   }

   public String saveItem() {
      return this.saveWithCustomString(this.itemBag);
   }

   public void loadEquip(String itemStr) {
      this.loadFunc(2, this.equipBag, itemStr);
   }

   public String saveEquip() {
      return this.saveWithCustomString(this.equipBag);
   }

   public void loadSoul(String itemStr) {
      this.loadFunc(3, this.soulBag, itemStr);
   }

   public String saveSoul() {
      return this.saveWithCustomString(this.soulBag);
   }

   public void loadWarriorSignet(String itemStr) {
      this.loadFunc(4, this.warriorSignetBag, itemStr);
   }

   public String saveWarriorSignet() {
      return this.saveWithCustomString(this.warriorSignetBag);
   }

   public void loadTotem(String itemStr) {
      this.loadFunc(7, this.totemBag, itemStr);
   }

   public String saveTotem() {
      return this.saveWithCustomString(this.totemBag);
   }

   public void loadTreasure(String itemStr) {
      this.loadFunc(5, this.treasureBag, itemStr);
   }

   public String saveTreasure() {
      return this.saveWithCustomString(this.treasureBag);
   }

   public void loadAide(String itemStr) {
      this.loadFunc(9, this.aideBag, itemStr);
   }

   public String saveAide() {
      return this.saveWithCustomString(this.aideBag);
   }

   public void loadMagic(String itemStr) {
      this.loadFunc(8, this.magicBag, itemStr);
   }

   public String saveMagic() {
      return this.saveWithCustomString(this.magicBag);
   }

   public void loadFlag(String itemStr) {
      this.loadFunc(6, this.flagBag, itemStr);
   }

   public String saveFlag() {
      return this.saveWithCustomString(this.flagBag);
   }

   public void loadRune(String itemStr) {
      this.loadFunc(11, this.runeStoneBag, itemStr);
   }

   public String saveRune() {
      return this.saveWithCustomString(this.runeStoneBag);
   }

   public void loadExclusiveWeaponBag(String itemStr) {
      this.loadFunc(35, this.exclusiveWeaponBag, itemStr);
   }

   public String saveExclusiveWeaponBag() {
      return this.saveWithCustomString(this.exclusiveWeaponBag);
   }

   public void loadGodBeastSkillBookBag(String itemStr) {
      this.loadFunc(33, this.godBeastSkillBookBag, itemStr);
   }

   public String saveGodBeastSkillBookBag() {
      return this.saveWithCustomString(this.godBeastSkillBookBag);
   }

   public void loadGem(String itemStr) {
      this.loadFunc(10, this.gemStoneBag, itemStr);
   }

   public String saveGem() {
      return this.saveWithCustomString(this.gemStoneBag);
   }

   public void loadRuneBag(String itemStr) {
      this.loadFunc(30, this.runeBag, itemStr);
   }

   public String saveRuneBag() {
      return this.saveWithCustomString(this.runeBag);
   }

   public void loadGodBeastBag(String itemStr) {
      this.loadFunc(32, this.godBeastBag, itemStr);
   }

   public String saveGodBeastBag() {
      return this.saveWithCustomString(this.godBeastBag);
   }

   public void loadRuneRefineInheritBag(String itemStr) {
      this.loadFunc(31, this.runeRefineInheritBag, itemStr);
   }

   public String saveRuneRefineInheritBag() {
      return this.saveWithCustomString(this.runeRefineInheritBag);
   }

   public void loadHide(String itemStr) {
      this.loadFunc(12, this.hideBag, itemStr);
   }

   public String saveHide() {
      return this.saveWithCustomString(this.hideBag);
   }

   public void loadWarHorse(String itemStr) {
      this.loadFunc(15, this.warHorse, itemStr);
   }

   public String saveWarHorse() {
      return this.saveWithCustomString(this.warHorse);
   }

   public void loadWarHorseChip(String itemStr) {
      this.loadFunc(16, this.warHorseChip, itemStr);
   }

   public String saveWarHorseChip() {
      return this.saveWithCustomString(this.warHorseChip);
   }

   public void loadPet(String itemStr) {
      this.loadFunc(14, this.pet, itemStr);
   }

   public String savePet() {
      return JsonUtil.beanToJson(this.pet.getMap());
   }

   public void loadPetBag(String itemStr) {
      this.loadFunc(13, this.petBag, itemStr);
   }

   public String savePetBag() {
      return JsonUtil.beanToJson(this.petBag.getMap());
   }

   public void loadBubbleBag(String itemStr) {
      this.loadFunc(17, this.bubbleBag, itemStr);
   }

   public String saveBubbleBag() {
      return JsonUtil.beanToJson(this.bubbleBag.getMap());
   }

   public void loadMedalBag(String itemStr) {
      this.loadFunc(18, this.medalBag, itemStr);
   }

   public String saveMedalBag() {
      return this.saveWithCustomString(this.medalBag);
   }

   public void loadNeiDanBag(String itemStr) {
      this.loadFunc(36, this.neiDanBag, itemStr);
   }

   public String saveNeiDanBag() {
      return this.saveWithCustomString(this.neiDanBag);
   }

   private void loadFunc(int subclass, BagParent bag, String itemStr) {
      if (!StringUtils.isEmpty(itemStr) && clsMap.containsKey(subclass)) {
         if (itemStr.startsWith("{")) {
            HashMap<Integer, ? extends ItemBase> map = (HashMap)JsonUtil.jsonToBean(itemStr, HashMap.class);

            for(Map.Entry<Integer, ? extends ItemBase> entry : map.entrySet()) {
               ItemBase itemBase = (ItemBase)JsonUtil.jsonToBean(entry.getValue(), (Class)clsMap.get(subclass));
               bag.getMap().put(itemBase.code, itemBase);
               this.itemMap.put(itemBase.code, itemBase);
               this.maxCode = Math.max(itemBase.code, this.maxCode);
            }
         } else {
            String[] strings = itemStr.split("\u0001");

            for(String string : strings) {
               try {
                  ItemBase itemBase = (ItemBase)((Class)clsMap.get(subclass)).newInstance();
                  itemBase.decode(string);
                  bag.getMap().put(itemBase.code, itemBase);
                  this.itemMap.put(itemBase.code, itemBase);
                  this.maxCode = Math.max(itemBase.code, this.maxCode);
               } catch (Exception e) {
                  e.printStackTrace();
               }
            }
         }

         this.bags.put(subclass, bag);
      }
   }

   public BagParent<ItemBase> getBagBySublass(int subclass) {
      BagParent bag = (BagParent)this.bags.get(subclass);
      if (bag == null) {
         bag = new BagParent();
         this.bags.put(subclass, bag);
         switch (subclass) {
            case 1:
               this.itemBag = bag;
               break;
            case 2:
               this.equipBag = bag;
               break;
            case 3:
               this.soulBag = bag;
               break;
            case 4:
               this.warriorSignetBag = bag;
               break;
            case 5:
               this.treasureBag = bag;
               break;
            case 6:
               this.flagBag = bag;
               break;
            case 7:
               this.totemBag = bag;
               break;
            case 8:
               this.magicBag = bag;
               break;
            case 9:
               this.aideBag = bag;
               break;
            case 10:
               this.gemStoneBag = bag;
               break;
            case 11:
               this.runeStoneBag = bag;
               break;
            case 12:
               this.hideBag = bag;
               break;
            case 13:
               this.petBag = bag;
               break;
            case 14:
               this.pet = bag;
               break;
            case 15:
               this.warHorse = bag;
               break;
            case 16:
               this.warHorseChip = bag;
               break;
            case 17:
               this.bubbleBag = bag;
               break;
            case 18:
               this.medalBag = bag;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 34:
            default:
               break;
            case 30:
               this.runeBag = bag;
               break;
            case 31:
               this.runeRefineInheritBag = bag;
               break;
            case 32:
               this.godBeastBag = bag;
               break;
            case 33:
               this.godBeastSkillBookBag = bag;
               break;
            case 35:
               this.exclusiveWeaponBag = bag;
               break;
            case 36:
               this.neiDanBag = bag;
         }
      }

      return (BagParent)this.bags.get(subclass);
   }

   public Map<Integer, ItemBase> getItemMap() {
      return this.itemMap;
   }

   public ItemBase getItemByCode(int code) {
      return (ItemBase)this.itemMap.get(code);
   }

   public List<ItemBase> getItemById(int id) {
      List<ItemBase> list = new ArrayList();

      for(Map.Entry<Integer, ItemBase> entry : this.itemMap.entrySet()) {
         ItemBase itemBase = (ItemBase)entry.getValue();
         if (itemBase.id == id && itemBase.getNum() > 0) {
            list.add(itemBase);
         }
      }

      return list;
   }

   private void removeFromMap(int code) {
      this.itemMap.remove(code);
      this.bags.entrySet().forEach((entry) -> {
         BagParent<ItemBase> bag = (BagParent)entry.getValue();
         bag.getMap().remove(code);
      });
   }

   public boolean additem(ItemBase itemBase, int subclass) {
      if (itemBase == null) {
         return false;
      } else if (this.getItemByCode(itemBase.code) != null) {
         return false;
      } else {
         BagParent<ItemBase> bag = this.getBagBySublass(subclass);
         if (bag == null) {
            return false;
         } else {
            this.itemPreAddHandle(itemBase, subclass);
            bag.getMap().put(itemBase.code, itemBase);
            this.itemMap.put(itemBase.code, itemBase);
            this.updateOp();
            return true;
         }
      }
   }

   public void itemPreAddHandle(ItemBase itemBase, int subclass) {
      if (subclass == 36) {
         if (!(itemBase instanceof NeiDanItem)) {
            logger.error("itemCode:{} 类型转换异常，当前类型不是灵兽内丹类型", itemBase.code);
            return;
         }

         NeiDanItem neiDanItem = (NeiDanItem)itemBase;
         if (neiDanItem.entryId <= 0 || neiDanItem.entryPro.isEmpty()) {
            GodBeastNeiDanBaseModel baseModel = NeiDanDefine.getBaseModel(itemBase.id);
            if (null == baseModel || baseModel.getEntryId().isEmpty()) {
               return;
            }

            GodBeastNeiDanEntryModel entryModel = NeiDanDefine.randomEntry(baseModel.getEntryId());
            if (null == entryModel) {
               return;
            }

            List<PropertyModel> entryPro = new ArrayList();
            if (entryModel.getBaseAtt().size() > 0) {
               entryPro.addAll(entryModel.getBaseAtt());
            }

            neiDanItem.entryId = entryModel.getId();
            neiDanItem.entryPro.addAll(entryPro);
         }
      }

   }

   public boolean updateItem(int code, int num) {
      ItemBase itemBase = (ItemBase)this.itemMap.get(code);
      if (itemBase == null) {
         logger.error("找不到物品code:{}", code);
         return false;
      } else {
         itemBase.updateNum(num);
         if (itemBase.getNum() <= 0) {
            this.removeFromMap(code);
         }

         this.updateOp();
         return true;
      }
   }

   public EquipItem getMaxScoreFromEquopByseat(int seat) {
      BagParent<ItemBase> bag = this.getBagBySublass(2);
      EquipItem maxScoreEquip = null;
      int maxScore = 0;

      for(ItemBase itemBase : bag.getMap().values()) {
         EquipItem temp = (EquipItem)itemBase;
         ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", temp.id);
         if (itemModel.getSeat() == seat) {
            int score = 0;
            if (itemModel.getTargetclass() == 12) {
               EquipEnchantHotModel equipEnchantHotModel = (EquipEnchantHotModel)ApplicationContextProvider.getModelPoolEntity("equipEnchantHot", itemModel.getId());
               if (equipEnchantHotModel == null) {
                  continue;
               }

               score = equipEnchantHotModel.getScore();
            } else {
               ItemPropertyModel itemPropertyModel = (ItemPropertyModel)ApplicationContextProvider.getModelPoolEntity("itemProperty", itemModel.getProperty());
               if (itemPropertyModel == null) {
                  continue;
               }

               score = itemPropertyModel.getPoint();
            }

            if (maxScoreEquip == null) {
               if (temp.getNum() > 0) {
                  maxScoreEquip = temp;
                  maxScore = score;
               }
            } else if (score > maxScore && temp.getNum() > 0) {
               maxScoreEquip = temp;
               maxScore = score;
            }
         }
      }

      return maxScoreEquip;
   }

   private String saveWithCustomString(BagParent<? extends ItemBase> bag) {
      StringBuilder stringBuilder = new StringBuilder();

      for(Map.Entry<Integer, ? extends ItemBase> entry : bag.getMap().entrySet()) {
         ItemBase itemBase = (ItemBase)entry.getValue();
         stringBuilder.append(itemBase.encode());
         stringBuilder.append("\u0001");
      }

      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }

   public int getMaxCode() {
      return this.maxCode;
   }

   static {
      clsMap.put(1, Item.class);
      clsMap.put(2, EquipItem.class);
      clsMap.put(3, Item.class);
      clsMap.put(4, WarriorSignet.class);
      clsMap.put(5, OrnamentItem.class);
      clsMap.put(6, WarFlag.class);
      clsMap.put(7, Totem.class);
      clsMap.put(8, Magic.class);
      clsMap.put(9, HeroAideItem.class);
      clsMap.put(10, Item.class);
      clsMap.put(11, RuneStoneItem.class);
      clsMap.put(12, Item.class);
      clsMap.put(13, ItemBase.class);
      clsMap.put(14, Pet.class);
      clsMap.put(15, WarHorse.class);
      clsMap.put(16, Item.class);
      clsMap.put(17, Item.class);
      clsMap.put(30, RuneItem.class);
      clsMap.put(31, RuneRefineInheritItem.class);
      clsMap.put(18, Item.class);
      clsMap.put(32, GodBeastItem.class);
      clsMap.put(33, Item.class);
      clsMap.put(35, ExclusiveWeaponItem.class);
      clsMap.put(36, NeiDanItem.class);
   }
}
