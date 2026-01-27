package com.gzbz.mart;

import com.gzbz.model.ItemModel;
import com.gzbz.spring.ApplicationContextProvider;

public interface MartDefine {
   int RESULT_FAIL = 0;
   int RESULT_SUCCESS = 1;
   String MART_FREE_GRID = "martFreeGrid";
   String MART_GRID_UNLOCK = "martGridUnlock";
   String AUCTION_SERVICE_CHANGE = "AuctionServriceChage";
   String DURATION_TIME = "AuctionDurationTime";
   String SHOW_TIME = "AuctionShowTime";
   String HISTORY_PRICE_LIST = "AuctionHistoryPriceList";
   int CARE = 0;
   int CARE_CANCEL = 1;
   int RECORD_SELL_SUCCESS = 1;
   int RECORD_SELL_FAIL = 2;
   int RECORD_BUY_SUCCESS = 3;
   int RECORD_BUY_FAIL = 4;
   String RECORD_LIMIT_PLAYER = "AuctionPersonalRecords";
   String RECORD_LIMIT_SERVER = "AuctionAllRecords";
   int NOTICE_UP = 1;
   int REWARD_NOT_GET = 0;
   int REWARD_HAD_GET = 1;
   String AUCTION_UPDATES_TIME = "AuctionUpdatesTime";
   String AUCTION_UPDATES_INTERVAL_TIME = "AuctionUpdatesIntervalTime";
   int STAET_PRICE_RANDOM = 0;
   int FIX_PRICE_RANDOM = 0;
   int PRICE_TYPE_START = 1;
   int PRICE_TYPE_MAX = 2;
   int SHOW_PLAYER_INFO = 0;
   int HIDE_PLAYER_INFO = 1;
   String AUCTION_LONG_TIME = "AuctionLongTime";
   String FAIL_RECORD_TIME = "failRecordTime";
   int BUY_RESULT_SUCCESS = 0;
   int BUY_RESULT_DEAL = 1;
   int BUY_RESULT_DEAL_TIME_OUT = 2;
   String MAIL_DEAL_FOR_BUYER = "martMailDeal";
   String MAIL_DEAL_FOR_SELLER = "martMailDealForSeller";
   String MAIL_RETURN_PRICE = "martMailReturnPrice";
   String MAIL_BUYER_NOT_GET = "martMailBuyerNotGet";
   String SELL_COOLING_TIME = "AuctionCoolingTime";
   String SYSTEM_BUY_TIME = "AuctionSystemBuyTime";
   int SYS_PLAYER_ID = -1;
   String SYS_QUOTED_PER_PRICE = "martQuotedPerPrice";
   String SYS_QUOTED_PRICE_STATE = "AuctionSystemBid";
   String PER_NUM_ONCE = "martPerNumOnce";
   String MART_GOODS_COUNT_PER_PAGE = "martGoodsCountPerPage";
   String AUCTION_ONE_SCREEN_NUM = "AuctionOneScreenNum";
   String HISTORY_SHELVES_NUM = "AuctionHistoryShelvesNum";
   String UPFRONT_PRICE_LIMIT = "UpfrontPriceLimit";
   String AUCTION_HOT_SHOW_TIME = "AuctionHotShowTime";
   String AUCTION_EXCHANGE = "AuctionExchange";
   int MART_STATE_OPEN = 0;
   int MART_STATE_STOP = 1;
   int MART_STATE_CHANGE_ZONE = 2;
   int GET_GOODS = 1;
   int TASK_OFF_GOODS = 2;
   String GOD_BEAST_AUCTION_SWITCH = "godBeastAuctionSwitch";
   String SWITCH_PRICE = "martSwitchPrice";
   String DIAMOND_TO_CHIP = "martDiamondToChipRatio";
   int GOD_BEAST_S = 10;

   static boolean isBestGoods(int itemId, int scoreId) {
      ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", itemId);
      if (itemModel == null) {
         return false;
      } else if (itemModel.getSubclass() == 32) {
         return scoreId >= 10;
      } else if (itemModel.getSubclass() == 36) {
         int neiDanDirectSellQuality = ApplicationContextProvider.getConfigInt("neiDanDirectSellQuality", 6);
         return itemModel.getQuality() >= neiDanDirectSellQuality;
      } else {
         return false;
      }
   }

   static long getLatestShowTime() {
      return ApplicationContextProvider.getConfigLong("martLatestShowTime", 604800L);
   }

   static int getFreeRecentShow() {
      return ApplicationContextProvider.getConfigInt("martFreeRecentShow", 50);
   }

   static boolean isRecentShowExpire(long dealSeconds) {
      long currentTimeMillis = System.currentTimeMillis();
      long currentSeconds = currentTimeMillis / 1000L;
      return dealSeconds + getLatestShowTime() < currentSeconds;
   }
}
