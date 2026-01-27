package com.gzbz.db.arraying;

import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.protobuf.CommonMsg;
import java.io.Serializable;

public abstract class ArrayingEntity implements Serializable {
   public int positon;
   public int code;

   public abstract boolean heroAndFriend();

   public abstract int heroId();

   public abstract long power();

   public abstract CommonMsg.CodeType entityType();

   public abstract GeneratedMessageV3 toBuilder();

   public abstract String encode();

   public abstract void decode(String str);
}
