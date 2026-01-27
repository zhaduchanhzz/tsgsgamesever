package com.gzbz.battle.listener;

import com.gzbz.battle.entity.Entity;
import java.io.Serializable;

public class ListenerContext implements Serializable {
   public short type;
   public int param;
   public String exParams;
   public Listener listener;
   public ListenerChecker checker;
   public Entity entity;
   public byte checkDead;
   public short subCls;
   public int rate;
   public byte force = 0;
   public boolean first;
}
