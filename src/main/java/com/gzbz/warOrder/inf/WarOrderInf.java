package com.gzbz.warOrder.inf;

import com.gzbz.model.manager.WarOrderBaseModel;

public interface WarOrderInf {
   int system();

   String excel();

   boolean check(WarOrderBaseModel warOrderBaseModel);

   boolean isBuy(WarOrderBaseModel warOrderBaseModel);
}
