package com.gzbz.db.bean;

import com.gzbz.model.fun.ResourceModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivityHeroSkinData {
   public int fight;
   public int matchPlayerId;
   public List<Integer> dailyMatchIds = new ArrayList();
   public long firstDamage;
   public long secondDamage;
   public long totalDamage;
   public int mvpHeroId;
   public int totalPoint;
   public List<Integer> fightReward = new ArrayList();
   public List<Integer> pointReward = new ArrayList();
   public int trunCardRoun = 1;
   public Map<Integer, List<ResourceModel>> trunCardMap = new HashMap();
   public int awardIndex = -1;
   public boolean isHaveLuck = false;
   public List<Integer> taskGroup = new ArrayList();

   public void reset() {
      this.fight = 0;
      this.matchPlayerId = 0;
      this.firstDamage = 0L;
      this.secondDamage = 0L;
      this.totalDamage = 0L;
      this.mvpHeroId = 0;
      this.totalPoint = 0;
      this.fightReward = new ArrayList();
      this.pointReward = new ArrayList();
      this.trunCardRoun = 1;
      this.trunCardMap = new HashMap();
      this.awardIndex = -1;
      this.isHaveLuck = false;
      this.taskGroup.clear();
      this.dailyMatchIds.clear();
   }
}
