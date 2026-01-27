package com.gzbz.gamePlayer.playerBag;

import java.util.HashMap;
import java.util.Map;

public class BagParent<T extends ItemBase> {
   private HashMap<Integer, T> map = new HashMap();

   public HashMap<Integer, T> getMap() {
      return this.map;
   }

   public T getItemByCode(int code) {
      return (T)(this.map.get(code));
   }

   public T getItemById(int id) {
      for(Map.Entry<Integer, T> entry : this.map.entrySet()) {
         T item = (T)(entry.getValue());
         if (item.id == id) {
            return item;
         }
      }

      return null;
   }

   public int getBagSize() {
      return this.map.size();
   }
}
