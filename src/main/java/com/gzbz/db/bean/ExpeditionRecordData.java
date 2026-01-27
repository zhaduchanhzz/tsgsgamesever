package com.gzbz.db.bean;

import java.util.ArrayList;
import java.util.List;

public class ExpeditionRecordData {
   public int type;
   public int playerId;
   public List<HeroMirror> heroMirrorList = new ArrayList();
   public long fight;
   public int recordTime;
}
