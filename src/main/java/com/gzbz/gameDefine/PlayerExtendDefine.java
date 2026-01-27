package com.gzbz.gameDefine;

import com.gzbz.benefit.bean.PlayerBenefitExtend;
import com.gzbz.dragon.DragonDiscipleExtend;
import com.gzbz.gamePlayer.heroMail.HeroMailExtend;
import com.gzbz.gamePlayer.heroPart.bean.PlayerHeroExtend;
import com.gzbz.gamePlayer.playerBag.bean.PlayerBagExtend;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gift.bean.PlayerGiftExtend;
import com.gzbz.privilege.bean.PlayerPrivilegeExtend;
import com.gzbz.rank.bean.PlayerRankExtend;
import com.gzbz.task.bean.PlayerTaskExtend;
import com.gzbz.union.bean.PlayerUnionExtend;
import com.gzbz.worldPaint.WorldPaintExtend;
import java.util.HashMap;
import java.util.Map;

public class PlayerExtendDefine {
   public static final Map<Integer, Class<?>> moduleExtendMap = new HashMap();
   public static final String CONFIG_VERIFIED_KEY = "Verified";
   public static final String CONFIG_DOWNLOAD_GIFT_KEY = "DownloadGoodGift";

   static {
      moduleExtendMap.put(13, PlayerExtend.class);
      moduleExtendMap.put(9, PlayerUnionExtend.class);
      moduleExtendMap.put(22, PlayerGiftExtend.class);
      moduleExtendMap.put(20, PlayerBenefitExtend.class);
      moduleExtendMap.put(3, PlayerTaskExtend.class);
      moduleExtendMap.put(19, PlayerPrivilegeExtend.class);
      moduleExtendMap.put(44, PlayerRankExtend.class);
      moduleExtendMap.put(2, PlayerBagExtend.class);
      moduleExtendMap.put(65, DragonDiscipleExtend.class);
      moduleExtendMap.put(23, HeroMailExtend.class);
      moduleExtendMap.put(135, WorldPaintExtend.class);
      moduleExtendMap.put(4, PlayerHeroExtend.class);
   }
}
