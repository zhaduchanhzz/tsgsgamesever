package com.gzbz.demon.bean;

import com.gzbz.db.arraying.ArrayingEntity;
import java.util.Comparator;

public class ArrayingEntityComparator implements Comparator<ArrayingEntity> {
   public int compare(ArrayingEntity o1, ArrayingEntity o2) {
      return (int)(o1.power() - o2.power());
   }
}
