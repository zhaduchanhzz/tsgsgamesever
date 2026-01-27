package com.gzbz.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.FileDescriptor;

public final class HeroGodTrialMsg {
   private static Descriptors.FileDescriptor descriptor;

   private HeroGodTrialMsg() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite registry) {
   }

   public static void registerAllExtensions(ExtensionRegistry registry) {
      registerAllExtensions((ExtensionRegistryLite)registry);
   }

   public static Descriptors.FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] descriptorData = new String[]{"\n\u0012HeroGodTrial.proto\u0012\u001eheroGodTrial.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u0011BattleDaily.proto\u001a\nRank.protoB&\n\u0011com.gzbz.protobufB\u000fHeroGodTrialMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), BattleDailyMsg.getDescriptor(), RankMsg.getDescriptor()});
      CommonMsg.getDescriptor();
      BattleDailyMsg.getDescriptor();
      RankMsg.getDescriptor();
   }
}
