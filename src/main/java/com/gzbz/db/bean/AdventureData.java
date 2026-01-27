package com.gzbz.db.bean;

import java.util.ArrayList;
import java.util.List;

public class AdventureData {
   public String code;
   public int taskId;
   public long acceptTime;
   public int state;
   public List<Integer> heroCodes = new ArrayList();
}
