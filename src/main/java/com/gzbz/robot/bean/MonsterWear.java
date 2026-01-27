package com.gzbz.robot.bean;

import java.util.ArrayList;
import java.util.List;

public class MonsterWear {
   public byte pos;
   public int id;
   public long power;
   public int lv;
   public List<MonsterWarrior> warriors = new ArrayList();
   public List<Integer> equips = new ArrayList();
   public List<Integer> warcrafts = new ArrayList();
   public List<Integer> stone = new ArrayList();
}
