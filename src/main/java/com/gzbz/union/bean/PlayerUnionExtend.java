package com.gzbz.union.bean;

import com.gzbz.db.bean.UnionTechnologyPlaceData;
import java.util.HashMap;
import java.util.Map;

public class PlayerUnionExtend {
   public Map<Integer, Map<Integer, UnionTechnologyPlaceData>> technology = new HashMap();
   public int technologyResetCount = 0;
   public int copyChallengeCount = 0;
   public int copyChallengeBuyCount = 0;
   public Map<Integer, String> copyRankMap = new HashMap();
}
