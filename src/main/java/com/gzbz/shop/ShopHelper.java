package com.gzbz.shop;

import cn.hutool.core.util.ClassUtil;
import com.gzbz.protobuf.ShopMsg;
import com.gzbz.shop.domain.AbstractShop;
import java.util.HashSet;
import java.util.Set;
import org.reflections.Reflections;
import org.reflections.scanners.Scanner;

public final class ShopHelper {
   public static final Set<Class<? extends AbstractShop>> shopClasses = new HashSet();

   public static ShopMsg.BuyItem.Builder builder(int id, int num) {
      ShopMsg.BuyItem.Builder buyItemBuilder = ShopMsg.BuyItem.newBuilder();
      buyItemBuilder.setBuyId(id);
      buyItemBuilder.setBuyNum(num);
      return buyItemBuilder;
   }

   static {
      Reflections reflections = new Reflections(ClassUtil.getPackage(AbstractShop.class) + ".sub", new Scanner[0]);
      shopClasses.addAll(reflections.getSubTypesOf(AbstractShop.class));
   }
}
