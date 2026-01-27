package com.gzbz.protobuf;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class MagicBookMsg {
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_AuthInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_AuthInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_OriginalBuyInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_OriginalBuyInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookInfo_10601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookInfo_10601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookInfo_10602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookInfo_10602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_C2S_Auth_10603_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_C2S_Auth_10603_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_S2C_Auth_10604_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_S2C_Auth_10604_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_C2S_AuthSpeedUp_10605_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_C2S_AuthSpeedUp_10605_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_S2C_AuthSpeedUp_10606_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_S2C_AuthSpeedUp_10606_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_C2S_AuthLevelUp_10607_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_C2S_AuthLevelUp_10607_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_S2C_AuthLevelUp_10608_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_S2C_AuthLevelUp_10608_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookLevelUp_10609_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookLevelUp_10609_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookLevelUp_10610_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookLevelUp_10610_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_C2S_MagicAuthDone_10611_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_C2S_MagicAuthDone_10611_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_S2C_MagicAuthDone_10612_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_S2C_MagicAuthDone_10612_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_C2S_MagicLevelUp_10613_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_C2S_MagicLevelUp_10613_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_S2C_MagicLevelUp_10614_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_S2C_MagicLevelUp_10614_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_C2S_MagicDisCompose_10615_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_C2S_MagicDisCompose_10615_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_S2C_MagicDisCompose_10616_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_S2C_MagicDisCompose_10616_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_C2S_MagicSkillUp_10617_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_C2S_MagicSkillUp_10617_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_S2C_MagicSkillUp_10618_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_S2C_MagicSkillUp_10618_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_C2S_MagicOriginalBuy_10619_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_C2S_MagicOriginalBuy_10619_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_S2C_MagicOriginalBuy_10620_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_S2C_MagicOriginalBuy_10620_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_C2S_TaskList_10621_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_C2S_TaskList_10621_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_S2C_TaskList_10622_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_S2C_TaskList_10622_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_C2S_CommitTask_10623_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_C2S_CommitTask_10623_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_S2C_CommitTaskResult_10624_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_S2C_CommitTaskResult_10624_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_S2C_PowerChange_10626_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_S2C_PowerChange_10626_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_MagicDisComposeInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_MagicDisComposeInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_C2S_BatchMagicDisCompose_10627_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_C2S_BatchMagicDisCompose_10627_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookReset_10628_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookReset_10628_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookReset_10629_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookReset_10629_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private MagicBookMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fMagicBook.proto\u0012\u001bmagicBook.com.gzbz.protobuf\u001a\fcommon.proto\"D\n\bAuthInfo\u0012\u0010\n\bposition\u0018\u0001 \u0002(\u0005\u0012\u0012\n\noriginalId\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nfinishTime\u0018\u0003 \u0002(\u0005\"2\n\u000fOriginalBuyInfo\u0012\u0012\n\noriginalId\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003buy\u0018\u0002 \u0002(\u0005\"\u0019\n\u0017C2S_MagicBookInfo_10601\"ð\u0001\n\u0017S2C_MagicBookInfo_10602\u0012\u0012\n\nidentityId\u0018\u0001 \u0002(\u0005\u0012(\n\tmagicBook\u0018\u0002 \u0002(\u000b2\u0015.common.MagicBookInfo\u00127\n\bauthList\u0018\u0003 \u0003(\u000b2%.magicBook.com.gzbz.protobuf.AuthInfo\u0012?\n\toriginals\u0018\u0004 \u0003(\u000b2,.magicBook.com.gzbz.protobuf.OriginalBuyInfo\u0012\u000e\n\u0006magics\u0018\u0005 \u0003(\u0005\u0012\r\n\u0005power\u0018\u0006 \u0002(\u0003\"6\n\u000eC2S_Auth_10603\u0012\u0010\n\bposition\u0018\u0001 \u0002(\u0005\u0012\u0012\n\noriginalId\u0018\u0002 \u0002(\u0005\"I\n\u000eS2C_Auth_10604\u00127\n\bauthList\u0018\u0001 \u0003(\u000b2%.magicBook.com.gzbz.protobuf.AuthInfo\"7\n\u0015C2S_AuthSpeedUp_10605\u0012\u0010\n\bposition\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\"P\n\u0015S2C_AuthSpeedUp_10606\u00127\n\bauthList\u0018\u0001 \u0003(\u000b2%.magicBook.com.gzbz.protobuf.AuthInfo\"-\n\u0015C2S_AuthLevelUp_10607\u0012\u0014\n\fheroCodeList\u0018\u0001 \u0003(\u0005\"z\n\u0015S2C_AuthLevelUp_10608\u0012\u0012\n\nidentityId\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fheroCodeList\u0018\u0002 \u0003(\u0005\u00127\n\bauthList\u0018\u0003 \u0003(\u000b2%.magicBook.com.gzbz.protobuf.AuthInfo\"\u001c\n\u001aC2S_MagicBookLevelUp_10609\"1\n\u001aS2C_MagicBookLevelUp_10610\u0012\u0013\n\u000bmagicBookId\u0018\u0001 \u0002(\u0005\"+\n\u0017C2S_MagicAuthDone_10611\u0012\u0010\n\bposition\u0018\u0001 \u0002(\u0005\"d\n\u0017S2C_MagicAuthDone_10612\u0012\u0010\n\bitemList\u0018\u0001 \u0003(\u0005\u00127\n\bauthList\u0018\u0002 \u0003(\u000b2%.magicBook.com.gzbz.protobuf.AuthInfo\"4\n\u0016C2S_MagicLevelUp_10613\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004item\u0018\u0002 \u0002(\u0005\"H\n\u0016S2C_MagicLevelUp_10614\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012 \n\u0005magic\u0018\u0002 \u0001(\u000b2\u0011.common.MagicInfo\":\n\u0019C2S_MagicDisCompose_10615\u0012\u0010\n\bitemCode\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"\u001b\n\u0019S2C_MagicDisCompose_10616\";\n\u0016C2S_MagicSkillUp_10617\u0012!\n\u0006magics\u0018\u0001 \u0003(\u000b2\u0011.common.MagicInfo\";\n\u0016S2C_MagicSkillUp_10618\u0012!\n\u0006magics\u0018\u0001 \u0003(\u000b2\u0011.common.MagicInfo\"\\\n\u001aC2S_MagicOriginalBuy_10619\u0012>\n\boriginal\u0018\u0001 \u0002(\u000b2,.magicBook.com.gzbz.protobuf.OriginalBuyInfo\"]\n\u001aS2C_MagicOriginalBuy_10620\u0012?\n\toriginals\u0018\u0001 \u0003(\u000b2,.magicBook.com.gzbz.protobuf.OriginalBuyInfo\"\u0014\n\u0012C2S_TaskList_10621\"1\n\u0012S2C_TaskList_10622\u0012\u001b\n\u0005tasks\u0018\u0001 \u0003(\u000b2\f.common.Task\"&\n\u0014C2S_CommitTask_10623\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\">\n\u001aS2C_CommitTaskResult_10624\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bisActive\u0018\u0002 \u0002(\b\"&\n\u0015S2C_PowerChange_10626\u0012\r\n\u0005power\u0018\u0001 \u0002(\u0003\"4\n\u0013MagicDisComposeInfo\u0012\u0010\n\bitemCode\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"o\n\u001eC2S_BatchMagicDisCompose_10627\u0012M\n\u0013magicDisComposeList\u0018\u0001 \u0003(\u000b20.magicBook.com.gzbz.protobuf.MagicDisComposeInfo\"(\n\u0018C2S_MagicBookReset_10628\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"\u001a\n\u0018S2C_MagicBookReset_10629B#\n\u0011com.gzbz.protobufB\fMagicBookMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_magicBook_com_gzbz_protobuf_AuthInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_magicBook_com_gzbz_protobuf_AuthInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_AuthInfo_descriptor, new String[]{"Position", "OriginalId", "FinishTime"});
      internal_static_magicBook_com_gzbz_protobuf_OriginalBuyInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_magicBook_com_gzbz_protobuf_OriginalBuyInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_OriginalBuyInfo_descriptor, new String[]{"OriginalId", "Buy"});
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookInfo_10601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookInfo_10601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookInfo_10601_descriptor, new String[0]);
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookInfo_10602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookInfo_10602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookInfo_10602_descriptor, new String[]{"IdentityId", "MagicBook", "AuthList", "Originals", "Magics", "Power"});
      internal_static_magicBook_com_gzbz_protobuf_C2S_Auth_10603_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_magicBook_com_gzbz_protobuf_C2S_Auth_10603_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_C2S_Auth_10603_descriptor, new String[]{"Position", "OriginalId"});
      internal_static_magicBook_com_gzbz_protobuf_S2C_Auth_10604_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_magicBook_com_gzbz_protobuf_S2C_Auth_10604_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_S2C_Auth_10604_descriptor, new String[]{"AuthList"});
      internal_static_magicBook_com_gzbz_protobuf_C2S_AuthSpeedUp_10605_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_magicBook_com_gzbz_protobuf_C2S_AuthSpeedUp_10605_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_C2S_AuthSpeedUp_10605_descriptor, new String[]{"Position", "Type"});
      internal_static_magicBook_com_gzbz_protobuf_S2C_AuthSpeedUp_10606_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_magicBook_com_gzbz_protobuf_S2C_AuthSpeedUp_10606_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_S2C_AuthSpeedUp_10606_descriptor, new String[]{"AuthList"});
      internal_static_magicBook_com_gzbz_protobuf_C2S_AuthLevelUp_10607_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_magicBook_com_gzbz_protobuf_C2S_AuthLevelUp_10607_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_C2S_AuthLevelUp_10607_descriptor, new String[]{"HeroCodeList"});
      internal_static_magicBook_com_gzbz_protobuf_S2C_AuthLevelUp_10608_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_magicBook_com_gzbz_protobuf_S2C_AuthLevelUp_10608_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_S2C_AuthLevelUp_10608_descriptor, new String[]{"IdentityId", "HeroCodeList", "AuthList"});
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookLevelUp_10609_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookLevelUp_10609_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookLevelUp_10609_descriptor, new String[0]);
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookLevelUp_10610_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookLevelUp_10610_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookLevelUp_10610_descriptor, new String[]{"MagicBookId"});
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicAuthDone_10611_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicAuthDone_10611_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_C2S_MagicAuthDone_10611_descriptor, new String[]{"Position"});
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicAuthDone_10612_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicAuthDone_10612_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_S2C_MagicAuthDone_10612_descriptor, new String[]{"ItemList", "AuthList"});
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicLevelUp_10613_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicLevelUp_10613_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_C2S_MagicLevelUp_10613_descriptor, new String[]{"Type", "Item"});
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicLevelUp_10614_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicLevelUp_10614_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_S2C_MagicLevelUp_10614_descriptor, new String[]{"Type", "Magic"});
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicDisCompose_10615_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicDisCompose_10615_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_C2S_MagicDisCompose_10615_descriptor, new String[]{"ItemCode", "Num"});
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicDisCompose_10616_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicDisCompose_10616_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_S2C_MagicDisCompose_10616_descriptor, new String[0]);
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicSkillUp_10617_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicSkillUp_10617_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_C2S_MagicSkillUp_10617_descriptor, new String[]{"Magics"});
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicSkillUp_10618_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicSkillUp_10618_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_S2C_MagicSkillUp_10618_descriptor, new String[]{"Magics"});
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicOriginalBuy_10619_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicOriginalBuy_10619_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_C2S_MagicOriginalBuy_10619_descriptor, new String[]{"Original"});
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicOriginalBuy_10620_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicOriginalBuy_10620_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_S2C_MagicOriginalBuy_10620_descriptor, new String[]{"Originals"});
      internal_static_magicBook_com_gzbz_protobuf_C2S_TaskList_10621_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_magicBook_com_gzbz_protobuf_C2S_TaskList_10621_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_C2S_TaskList_10621_descriptor, new String[0]);
      internal_static_magicBook_com_gzbz_protobuf_S2C_TaskList_10622_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_magicBook_com_gzbz_protobuf_S2C_TaskList_10622_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_S2C_TaskList_10622_descriptor, new String[]{"Tasks"});
      internal_static_magicBook_com_gzbz_protobuf_C2S_CommitTask_10623_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_magicBook_com_gzbz_protobuf_C2S_CommitTask_10623_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_C2S_CommitTask_10623_descriptor, new String[]{"TaskId"});
      internal_static_magicBook_com_gzbz_protobuf_S2C_CommitTaskResult_10624_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_magicBook_com_gzbz_protobuf_S2C_CommitTaskResult_10624_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_S2C_CommitTaskResult_10624_descriptor, new String[]{"TaskId", "IsActive"});
      internal_static_magicBook_com_gzbz_protobuf_S2C_PowerChange_10626_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_magicBook_com_gzbz_protobuf_S2C_PowerChange_10626_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_S2C_PowerChange_10626_descriptor, new String[]{"Power"});
      internal_static_magicBook_com_gzbz_protobuf_MagicDisComposeInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_magicBook_com_gzbz_protobuf_MagicDisComposeInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_MagicDisComposeInfo_descriptor, new String[]{"ItemCode", "Num"});
      internal_static_magicBook_com_gzbz_protobuf_C2S_BatchMagicDisCompose_10627_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_magicBook_com_gzbz_protobuf_C2S_BatchMagicDisCompose_10627_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_C2S_BatchMagicDisCompose_10627_descriptor, new String[]{"MagicDisComposeList"});
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookReset_10628_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookReset_10628_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookReset_10628_descriptor, new String[]{"Code"});
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookReset_10629_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookReset_10629_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookReset_10629_descriptor, new String[0]);
      CommonMsg.getDescriptor();
   }

   public static final class AuthInfo extends GeneratedMessageV3 implements AuthInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int ORIGINALID_FIELD_NUMBER = 2;
      private int originalId_;
      public static final int FINISHTIME_FIELD_NUMBER = 3;
      private int finishTime_;
      private byte memoizedIsInitialized;
      private static final AuthInfo DEFAULT_INSTANCE = new AuthInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<AuthInfo> PARSER = new AbstractParser<AuthInfo>() {
         public AuthInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new AuthInfo(input, extensionRegistry);
         }
      };

      private AuthInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private AuthInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new AuthInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private AuthInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.position_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.originalId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.finishTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_AuthInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_AuthInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthInfo.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public boolean hasOriginalId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getOriginalId() {
         return this.originalId_;
      }

      public boolean hasFinishTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getFinishTime() {
         return this.finishTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOriginalId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFinishTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.position_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.originalId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.finishTime_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.position_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.originalId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.finishTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof AuthInfo)) {
            return super.equals(obj);
         } else {
            AuthInfo other = (AuthInfo)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
               return false;
            } else if (this.hasOriginalId() != other.hasOriginalId()) {
               return false;
            } else if (this.hasOriginalId() && this.getOriginalId() != other.getOriginalId()) {
               return false;
            } else if (this.hasFinishTime() != other.hasFinishTime()) {
               return false;
            } else if (this.hasFinishTime() && this.getFinishTime() != other.getFinishTime()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition();
            }

            if (this.hasOriginalId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getOriginalId();
            }

            if (this.hasFinishTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFinishTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static AuthInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (AuthInfo)PARSER.parseFrom(data);
      }

      public static AuthInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AuthInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AuthInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (AuthInfo)PARSER.parseFrom(data);
      }

      public static AuthInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AuthInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AuthInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (AuthInfo)PARSER.parseFrom(data);
      }

      public static AuthInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AuthInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AuthInfo parseFrom(InputStream input) throws IOException {
         return (AuthInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static AuthInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AuthInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static AuthInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (AuthInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static AuthInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AuthInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static AuthInfo parseFrom(CodedInputStream input) throws IOException {
         return (AuthInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static AuthInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AuthInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(AuthInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static AuthInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<AuthInfo> parser() {
         return PARSER;
      }

      public Parser<AuthInfo> getParserForType() {
         return PARSER;
      }

      public AuthInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AuthInfoOrBuilder {
         private int bitField0_;
         private int position_;
         private int originalId_;
         private int finishTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_AuthInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_AuthInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.AuthInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 0;
            this.bitField0_ &= -2;
            this.originalId_ = 0;
            this.bitField0_ &= -3;
            this.finishTime_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_AuthInfo_descriptor;
         }

         public AuthInfo getDefaultInstanceForType() {
            return MagicBookMsg.AuthInfo.getDefaultInstance();
         }

         public AuthInfo build() {
            AuthInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public AuthInfo buildPartial() {
            AuthInfo result = new AuthInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.position_ = this.position_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.originalId_ = this.originalId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.finishTime_ = this.finishTime_;
               to_bitField0_ |= 4;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof AuthInfo) {
               return this.mergeFrom((AuthInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(AuthInfo other) {
            if (other == MagicBookMsg.AuthInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasOriginalId()) {
                  this.setOriginalId(other.getOriginalId());
               }

               if (other.hasFinishTime()) {
                  this.setFinishTime(other.getFinishTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else if (!this.hasOriginalId()) {
               return false;
            } else {
               return this.hasFinishTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            AuthInfo parsedMessage = null;

            try {
               parsedMessage = (AuthInfo)MagicBookMsg.AuthInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (AuthInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPosition() {
            return this.position_;
         }

         public Builder setPosition(int value) {
            this.bitField0_ |= 1;
            this.position_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPosition() {
            this.bitField0_ &= -2;
            this.position_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOriginalId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getOriginalId() {
            return this.originalId_;
         }

         public Builder setOriginalId(int value) {
            this.bitField0_ |= 2;
            this.originalId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOriginalId() {
            this.bitField0_ &= -3;
            this.originalId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFinishTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getFinishTime() {
            return this.finishTime_;
         }

         public Builder setFinishTime(int value) {
            this.bitField0_ |= 4;
            this.finishTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFinishTime() {
            this.bitField0_ &= -5;
            this.finishTime_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class OriginalBuyInfo extends GeneratedMessageV3 implements OriginalBuyInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ORIGINALID_FIELD_NUMBER = 1;
      private int originalId_;
      public static final int BUY_FIELD_NUMBER = 2;
      private int buy_;
      private byte memoizedIsInitialized;
      private static final OriginalBuyInfo DEFAULT_INSTANCE = new OriginalBuyInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<OriginalBuyInfo> PARSER = new AbstractParser<OriginalBuyInfo>() {
         public OriginalBuyInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new OriginalBuyInfo(input, extensionRegistry);
         }
      };

      private OriginalBuyInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private OriginalBuyInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new OriginalBuyInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private OriginalBuyInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.originalId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buy_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_OriginalBuyInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_OriginalBuyInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(OriginalBuyInfo.class, Builder.class);
      }

      public boolean hasOriginalId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOriginalId() {
         return this.originalId_;
      }

      public boolean hasBuy() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuy() {
         return this.buy_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOriginalId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.originalId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buy_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.originalId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof OriginalBuyInfo)) {
            return super.equals(obj);
         } else {
            OriginalBuyInfo other = (OriginalBuyInfo)obj;
            if (this.hasOriginalId() != other.hasOriginalId()) {
               return false;
            } else if (this.hasOriginalId() && this.getOriginalId() != other.getOriginalId()) {
               return false;
            } else if (this.hasBuy() != other.hasBuy()) {
               return false;
            } else if (this.hasBuy() && this.getBuy() != other.getBuy()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasOriginalId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOriginalId();
            }

            if (this.hasBuy()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuy();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static OriginalBuyInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (OriginalBuyInfo)PARSER.parseFrom(data);
      }

      public static OriginalBuyInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OriginalBuyInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OriginalBuyInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (OriginalBuyInfo)PARSER.parseFrom(data);
      }

      public static OriginalBuyInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OriginalBuyInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OriginalBuyInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (OriginalBuyInfo)PARSER.parseFrom(data);
      }

      public static OriginalBuyInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OriginalBuyInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OriginalBuyInfo parseFrom(InputStream input) throws IOException {
         return (OriginalBuyInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static OriginalBuyInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OriginalBuyInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static OriginalBuyInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (OriginalBuyInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static OriginalBuyInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OriginalBuyInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static OriginalBuyInfo parseFrom(CodedInputStream input) throws IOException {
         return (OriginalBuyInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static OriginalBuyInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OriginalBuyInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(OriginalBuyInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static OriginalBuyInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<OriginalBuyInfo> parser() {
         return PARSER;
      }

      public Parser<OriginalBuyInfo> getParserForType() {
         return PARSER;
      }

      public OriginalBuyInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OriginalBuyInfoOrBuilder {
         private int bitField0_;
         private int originalId_;
         private int buy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_OriginalBuyInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_OriginalBuyInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(OriginalBuyInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.OriginalBuyInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.originalId_ = 0;
            this.bitField0_ &= -2;
            this.buy_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_OriginalBuyInfo_descriptor;
         }

         public OriginalBuyInfo getDefaultInstanceForType() {
            return MagicBookMsg.OriginalBuyInfo.getDefaultInstance();
         }

         public OriginalBuyInfo build() {
            OriginalBuyInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public OriginalBuyInfo buildPartial() {
            OriginalBuyInfo result = new OriginalBuyInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.originalId_ = this.originalId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buy_ = this.buy_;
               to_bitField0_ |= 2;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof OriginalBuyInfo) {
               return this.mergeFrom((OriginalBuyInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(OriginalBuyInfo other) {
            if (other == MagicBookMsg.OriginalBuyInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOriginalId()) {
                  this.setOriginalId(other.getOriginalId());
               }

               if (other.hasBuy()) {
                  this.setBuy(other.getBuy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOriginalId()) {
               return false;
            } else {
               return this.hasBuy();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            OriginalBuyInfo parsedMessage = null;

            try {
               parsedMessage = (OriginalBuyInfo)MagicBookMsg.OriginalBuyInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (OriginalBuyInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOriginalId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOriginalId() {
            return this.originalId_;
         }

         public Builder setOriginalId(int value) {
            this.bitField0_ |= 1;
            this.originalId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOriginalId() {
            this.bitField0_ &= -2;
            this.originalId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuy() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuy() {
            return this.buy_;
         }

         public Builder setBuy(int value) {
            this.bitField0_ |= 2;
            this.buy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuy() {
            this.bitField0_ &= -3;
            this.buy_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_MagicBookInfo_10601 extends GeneratedMessageV3 implements C2S_MagicBookInfo_10601OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_MagicBookInfo_10601 DEFAULT_INSTANCE = new C2S_MagicBookInfo_10601();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MagicBookInfo_10601> PARSER = new AbstractParser<C2S_MagicBookInfo_10601>() {
         public C2S_MagicBookInfo_10601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MagicBookInfo_10601(input, extensionRegistry);
         }
      };

      private C2S_MagicBookInfo_10601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MagicBookInfo_10601() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MagicBookInfo_10601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MagicBookInfo_10601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookInfo_10601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookInfo_10601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicBookInfo_10601.class, Builder.class);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_MagicBookInfo_10601)) {
            return super.equals(obj);
         } else {
            C2S_MagicBookInfo_10601 other = (C2S_MagicBookInfo_10601)obj;
            return this.unknownFields.equals(other.unknownFields);
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_MagicBookInfo_10601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MagicBookInfo_10601)PARSER.parseFrom(data);
      }

      public static C2S_MagicBookInfo_10601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicBookInfo_10601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicBookInfo_10601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MagicBookInfo_10601)PARSER.parseFrom(data);
      }

      public static C2S_MagicBookInfo_10601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicBookInfo_10601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicBookInfo_10601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MagicBookInfo_10601)PARSER.parseFrom(data);
      }

      public static C2S_MagicBookInfo_10601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicBookInfo_10601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicBookInfo_10601 parseFrom(InputStream input) throws IOException {
         return (C2S_MagicBookInfo_10601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicBookInfo_10601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicBookInfo_10601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicBookInfo_10601 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MagicBookInfo_10601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MagicBookInfo_10601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicBookInfo_10601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicBookInfo_10601 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MagicBookInfo_10601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicBookInfo_10601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicBookInfo_10601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MagicBookInfo_10601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MagicBookInfo_10601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MagicBookInfo_10601> parser() {
         return PARSER;
      }

      public Parser<C2S_MagicBookInfo_10601> getParserForType() {
         return PARSER;
      }

      public C2S_MagicBookInfo_10601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MagicBookInfo_10601OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookInfo_10601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookInfo_10601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicBookInfo_10601.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.C2S_MagicBookInfo_10601.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookInfo_10601_descriptor;
         }

         public C2S_MagicBookInfo_10601 getDefaultInstanceForType() {
            return MagicBookMsg.C2S_MagicBookInfo_10601.getDefaultInstance();
         }

         public C2S_MagicBookInfo_10601 build() {
            C2S_MagicBookInfo_10601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MagicBookInfo_10601 buildPartial() {
            C2S_MagicBookInfo_10601 result = new C2S_MagicBookInfo_10601(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_MagicBookInfo_10601) {
               return this.mergeFrom((C2S_MagicBookInfo_10601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MagicBookInfo_10601 other) {
            if (other == MagicBookMsg.C2S_MagicBookInfo_10601.getDefaultInstance()) {
               return this;
            } else {
               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_MagicBookInfo_10601 parsedMessage = null;

            try {
               parsedMessage = (C2S_MagicBookInfo_10601)MagicBookMsg.C2S_MagicBookInfo_10601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MagicBookInfo_10601)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_MagicBookInfo_10602 extends GeneratedMessageV3 implements S2C_MagicBookInfo_10602OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int IDENTITYID_FIELD_NUMBER = 1;
      private int identityId_;
      public static final int MAGICBOOK_FIELD_NUMBER = 2;
      private CommonMsg.MagicBookInfo magicBook_;
      public static final int AUTHLIST_FIELD_NUMBER = 3;
      private List<AuthInfo> authList_;
      public static final int ORIGINALS_FIELD_NUMBER = 4;
      private List<OriginalBuyInfo> originals_;
      public static final int MAGICS_FIELD_NUMBER = 5;
      private Internal.IntList magics_;
      public static final int POWER_FIELD_NUMBER = 6;
      private long power_;
      private byte memoizedIsInitialized;
      private static final S2C_MagicBookInfo_10602 DEFAULT_INSTANCE = new S2C_MagicBookInfo_10602();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MagicBookInfo_10602> PARSER = new AbstractParser<S2C_MagicBookInfo_10602>() {
         public S2C_MagicBookInfo_10602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MagicBookInfo_10602(input, extensionRegistry);
         }
      };

      private S2C_MagicBookInfo_10602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MagicBookInfo_10602() {
         this.memoizedIsInitialized = -1;
         this.authList_ = Collections.emptyList();
         this.originals_ = Collections.emptyList();
         this.magics_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MagicBookInfo_10602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MagicBookInfo_10602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  int limit;
                  switch (tag) {
                     case 0:
                        done = true;
                        continue;
                     case 8:
                        this.bitField0_ |= 1;
                        this.identityId_ = input.readInt32();
                        continue;
                     case 18:
                        CommonMsg.MagicBookInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.magicBook_.toBuilder();
                        }

                        this.magicBook_ = (CommonMsg.MagicBookInfo)input.readMessage(CommonMsg.MagicBookInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.magicBook_);
                           this.magicBook_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        continue;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.authList_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.authList_.add(input.readMessage(MagicBookMsg.AuthInfo.PARSER, extensionRegistry));
                        continue;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.originals_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.originals_.add(input.readMessage(MagicBookMsg.OriginalBuyInfo.PARSER, extensionRegistry));
                        continue;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.magics_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.magics_.addInt(input.readInt32());
                        continue;
                     case 42:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.magics_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }
                        break;
                     case 48:
                        this.bitField0_ |= 4;
                        this.power_ = input.readInt64();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.magics_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.authList_ = Collections.unmodifiableList(this.authList_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.originals_ = Collections.unmodifiableList(this.originals_);
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.magics_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookInfo_10602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookInfo_10602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicBookInfo_10602.class, Builder.class);
      }

      public boolean hasIdentityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIdentityId() {
         return this.identityId_;
      }

      public boolean hasMagicBook() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.MagicBookInfo getMagicBook() {
         return this.magicBook_ == null ? CommonMsg.MagicBookInfo.getDefaultInstance() : this.magicBook_;
      }

      public CommonMsg.MagicBookInfoOrBuilder getMagicBookOrBuilder() {
         return this.magicBook_ == null ? CommonMsg.MagicBookInfo.getDefaultInstance() : this.magicBook_;
      }

      public List<AuthInfo> getAuthListList() {
         return this.authList_;
      }

      public List<? extends AuthInfoOrBuilder> getAuthListOrBuilderList() {
         return this.authList_;
      }

      public int getAuthListCount() {
         return this.authList_.size();
      }

      public AuthInfo getAuthList(int index) {
         return (AuthInfo)this.authList_.get(index);
      }

      public AuthInfoOrBuilder getAuthListOrBuilder(int index) {
         return (AuthInfoOrBuilder)this.authList_.get(index);
      }

      public List<OriginalBuyInfo> getOriginalsList() {
         return this.originals_;
      }

      public List<? extends OriginalBuyInfoOrBuilder> getOriginalsOrBuilderList() {
         return this.originals_;
      }

      public int getOriginalsCount() {
         return this.originals_.size();
      }

      public OriginalBuyInfo getOriginals(int index) {
         return (OriginalBuyInfo)this.originals_.get(index);
      }

      public OriginalBuyInfoOrBuilder getOriginalsOrBuilder(int index) {
         return (OriginalBuyInfoOrBuilder)this.originals_.get(index);
      }

      public List<Integer> getMagicsList() {
         return this.magics_;
      }

      public int getMagicsCount() {
         return this.magics_.size();
      }

      public int getMagics(int index) {
         return this.magics_.getInt(index);
      }

      public boolean hasPower() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIdentityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMagicBook()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getMagicBook().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getAuthListCount(); ++i) {
               if (!this.getAuthList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getOriginalsCount(); ++i) {
               if (!this.getOriginals(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.identityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getMagicBook());
         }

         for(int i = 0; i < this.authList_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.authList_.get(i));
         }

         for(int i = 0; i < this.originals_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.originals_.get(i));
         }

         for(int i = 0; i < this.magics_.size(); ++i) {
            output.writeInt32(5, this.magics_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(6, this.power_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.identityId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getMagicBook());
            }

            for(int i = 0; i < this.authList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.authList_.get(i));
            }

            for(int i = 0; i < this.originals_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.originals_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.magics_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.magics_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getMagicsList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.power_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MagicBookInfo_10602)) {
            return super.equals(obj);
         } else {
            S2C_MagicBookInfo_10602 other = (S2C_MagicBookInfo_10602)obj;
            if (this.hasIdentityId() != other.hasIdentityId()) {
               return false;
            } else if (this.hasIdentityId() && this.getIdentityId() != other.getIdentityId()) {
               return false;
            } else if (this.hasMagicBook() != other.hasMagicBook()) {
               return false;
            } else if (this.hasMagicBook() && !this.getMagicBook().equals(other.getMagicBook())) {
               return false;
            } else if (!this.getAuthListList().equals(other.getAuthListList())) {
               return false;
            } else if (!this.getOriginalsList().equals(other.getOriginalsList())) {
               return false;
            } else if (!this.getMagicsList().equals(other.getMagicsList())) {
               return false;
            } else if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasIdentityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdentityId();
            }

            if (this.hasMagicBook()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMagicBook().hashCode();
            }

            if (this.getAuthListCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAuthListList().hashCode();
            }

            if (this.getOriginalsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getOriginalsList().hashCode();
            }

            if (this.getMagicsCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getMagicsList().hashCode();
            }

            if (this.hasPower()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MagicBookInfo_10602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MagicBookInfo_10602)PARSER.parseFrom(data);
      }

      public static S2C_MagicBookInfo_10602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicBookInfo_10602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicBookInfo_10602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MagicBookInfo_10602)PARSER.parseFrom(data);
      }

      public static S2C_MagicBookInfo_10602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicBookInfo_10602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicBookInfo_10602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MagicBookInfo_10602)PARSER.parseFrom(data);
      }

      public static S2C_MagicBookInfo_10602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicBookInfo_10602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicBookInfo_10602 parseFrom(InputStream input) throws IOException {
         return (S2C_MagicBookInfo_10602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicBookInfo_10602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicBookInfo_10602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicBookInfo_10602 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MagicBookInfo_10602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MagicBookInfo_10602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicBookInfo_10602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicBookInfo_10602 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MagicBookInfo_10602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicBookInfo_10602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicBookInfo_10602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MagicBookInfo_10602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MagicBookInfo_10602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MagicBookInfo_10602> parser() {
         return PARSER;
      }

      public Parser<S2C_MagicBookInfo_10602> getParserForType() {
         return PARSER;
      }

      public S2C_MagicBookInfo_10602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MagicBookInfo_10602OrBuilder {
         private int bitField0_;
         private int identityId_;
         private CommonMsg.MagicBookInfo magicBook_;
         private SingleFieldBuilderV3<CommonMsg.MagicBookInfo, CommonMsg.MagicBookInfo.Builder, CommonMsg.MagicBookInfoOrBuilder> magicBookBuilder_;
         private List<AuthInfo> authList_;
         private RepeatedFieldBuilderV3<AuthInfo, AuthInfo.Builder, AuthInfoOrBuilder> authListBuilder_;
         private List<OriginalBuyInfo> originals_;
         private RepeatedFieldBuilderV3<OriginalBuyInfo, OriginalBuyInfo.Builder, OriginalBuyInfoOrBuilder> originalsBuilder_;
         private Internal.IntList magics_;
         private long power_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookInfo_10602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookInfo_10602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicBookInfo_10602.class, Builder.class);
         }

         private Builder() {
            this.authList_ = Collections.emptyList();
            this.originals_ = Collections.emptyList();
            this.magics_ = MagicBookMsg.S2C_MagicBookInfo_10602.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.authList_ = Collections.emptyList();
            this.originals_ = Collections.emptyList();
            this.magics_ = MagicBookMsg.S2C_MagicBookInfo_10602.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.S2C_MagicBookInfo_10602.alwaysUseFieldBuilders) {
               this.getMagicBookFieldBuilder();
               this.getAuthListFieldBuilder();
               this.getOriginalsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.identityId_ = 0;
            this.bitField0_ &= -2;
            if (this.magicBookBuilder_ == null) {
               this.magicBook_ = null;
            } else {
               this.magicBookBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.authListBuilder_ == null) {
               this.authList_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.authListBuilder_.clear();
            }

            if (this.originalsBuilder_ == null) {
               this.originals_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.originalsBuilder_.clear();
            }

            this.magics_ = MagicBookMsg.S2C_MagicBookInfo_10602.emptyIntList();
            this.bitField0_ &= -17;
            this.power_ = 0L;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookInfo_10602_descriptor;
         }

         public S2C_MagicBookInfo_10602 getDefaultInstanceForType() {
            return MagicBookMsg.S2C_MagicBookInfo_10602.getDefaultInstance();
         }

         public S2C_MagicBookInfo_10602 build() {
            S2C_MagicBookInfo_10602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MagicBookInfo_10602 buildPartial() {
            S2C_MagicBookInfo_10602 result = new S2C_MagicBookInfo_10602(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.identityId_ = this.identityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.magicBookBuilder_ == null) {
                  result.magicBook_ = this.magicBook_;
               } else {
                  result.magicBook_ = (CommonMsg.MagicBookInfo)this.magicBookBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if (this.authListBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.authList_ = Collections.unmodifiableList(this.authList_);
                  this.bitField0_ &= -5;
               }

               result.authList_ = this.authList_;
            } else {
               result.authList_ = this.authListBuilder_.build();
            }

            if (this.originalsBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.originals_ = Collections.unmodifiableList(this.originals_);
                  this.bitField0_ &= -9;
               }

               result.originals_ = this.originals_;
            } else {
               result.originals_ = this.originalsBuilder_.build();
            }

            if ((this.bitField0_ & 16) != 0) {
               this.magics_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.magics_ = this.magics_;
            if ((from_bitField0_ & 32) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 4;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_MagicBookInfo_10602) {
               return this.mergeFrom((S2C_MagicBookInfo_10602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MagicBookInfo_10602 other) {
            if (other == MagicBookMsg.S2C_MagicBookInfo_10602.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIdentityId()) {
                  this.setIdentityId(other.getIdentityId());
               }

               if (other.hasMagicBook()) {
                  this.mergeMagicBook(other.getMagicBook());
               }

               if (this.authListBuilder_ == null) {
                  if (!other.authList_.isEmpty()) {
                     if (this.authList_.isEmpty()) {
                        this.authList_ = other.authList_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureAuthListIsMutable();
                        this.authList_.addAll(other.authList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.authList_.isEmpty()) {
                  if (this.authListBuilder_.isEmpty()) {
                     this.authListBuilder_.dispose();
                     this.authListBuilder_ = null;
                     this.authList_ = other.authList_;
                     this.bitField0_ &= -5;
                     this.authListBuilder_ = MagicBookMsg.S2C_MagicBookInfo_10602.alwaysUseFieldBuilders ? this.getAuthListFieldBuilder() : null;
                  } else {
                     this.authListBuilder_.addAllMessages(other.authList_);
                  }
               }

               if (this.originalsBuilder_ == null) {
                  if (!other.originals_.isEmpty()) {
                     if (this.originals_.isEmpty()) {
                        this.originals_ = other.originals_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureOriginalsIsMutable();
                        this.originals_.addAll(other.originals_);
                     }

                     this.onChanged();
                  }
               } else if (!other.originals_.isEmpty()) {
                  if (this.originalsBuilder_.isEmpty()) {
                     this.originalsBuilder_.dispose();
                     this.originalsBuilder_ = null;
                     this.originals_ = other.originals_;
                     this.bitField0_ &= -9;
                     this.originalsBuilder_ = MagicBookMsg.S2C_MagicBookInfo_10602.alwaysUseFieldBuilders ? this.getOriginalsFieldBuilder() : null;
                  } else {
                     this.originalsBuilder_.addAllMessages(other.originals_);
                  }
               }

               if (!other.magics_.isEmpty()) {
                  if (this.magics_.isEmpty()) {
                     this.magics_ = other.magics_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureMagicsIsMutable();
                     this.magics_.addAll(other.magics_);
                  }

                  this.onChanged();
               }

               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIdentityId()) {
               return false;
            } else if (!this.hasMagicBook()) {
               return false;
            } else if (!this.hasPower()) {
               return false;
            } else if (!this.getMagicBook().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getAuthListCount(); ++i) {
                  if (!this.getAuthList(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getOriginalsCount(); ++i) {
                  if (!this.getOriginals(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MagicBookInfo_10602 parsedMessage = null;

            try {
               parsedMessage = (S2C_MagicBookInfo_10602)MagicBookMsg.S2C_MagicBookInfo_10602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MagicBookInfo_10602)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIdentityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIdentityId() {
            return this.identityId_;
         }

         public Builder setIdentityId(int value) {
            this.bitField0_ |= 1;
            this.identityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIdentityId() {
            this.bitField0_ &= -2;
            this.identityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMagicBook() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.MagicBookInfo getMagicBook() {
            if (this.magicBookBuilder_ == null) {
               return this.magicBook_ == null ? CommonMsg.MagicBookInfo.getDefaultInstance() : this.magicBook_;
            } else {
               return (CommonMsg.MagicBookInfo)this.magicBookBuilder_.getMessage();
            }
         }

         public Builder setMagicBook(CommonMsg.MagicBookInfo value) {
            if (this.magicBookBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.magicBook_ = value;
               this.onChanged();
            } else {
               this.magicBookBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setMagicBook(CommonMsg.MagicBookInfo.Builder builderForValue) {
            if (this.magicBookBuilder_ == null) {
               this.magicBook_ = builderForValue.build();
               this.onChanged();
            } else {
               this.magicBookBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeMagicBook(CommonMsg.MagicBookInfo value) {
            if (this.magicBookBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.magicBook_ != null && this.magicBook_ != CommonMsg.MagicBookInfo.getDefaultInstance()) {
                  this.magicBook_ = CommonMsg.MagicBookInfo.newBuilder(this.magicBook_).mergeFrom(value).buildPartial();
               } else {
                  this.magicBook_ = value;
               }

               this.onChanged();
            } else {
               this.magicBookBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearMagicBook() {
            if (this.magicBookBuilder_ == null) {
               this.magicBook_ = null;
               this.onChanged();
            } else {
               this.magicBookBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.MagicBookInfo.Builder getMagicBookBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.MagicBookInfo.Builder)this.getMagicBookFieldBuilder().getBuilder();
         }

         public CommonMsg.MagicBookInfoOrBuilder getMagicBookOrBuilder() {
            if (this.magicBookBuilder_ != null) {
               return (CommonMsg.MagicBookInfoOrBuilder)this.magicBookBuilder_.getMessageOrBuilder();
            } else {
               return this.magicBook_ == null ? CommonMsg.MagicBookInfo.getDefaultInstance() : this.magicBook_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.MagicBookInfo, CommonMsg.MagicBookInfo.Builder, CommonMsg.MagicBookInfoOrBuilder> getMagicBookFieldBuilder() {
            if (this.magicBookBuilder_ == null) {
               this.magicBookBuilder_ = new SingleFieldBuilderV3(this.getMagicBook(), this.getParentForChildren(), this.isClean());
               this.magicBook_ = null;
            }

            return this.magicBookBuilder_;
         }

         private void ensureAuthListIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.authList_ = new ArrayList(this.authList_);
               this.bitField0_ |= 4;
            }

         }

         public List<AuthInfo> getAuthListList() {
            return this.authListBuilder_ == null ? Collections.unmodifiableList(this.authList_) : this.authListBuilder_.getMessageList();
         }

         public int getAuthListCount() {
            return this.authListBuilder_ == null ? this.authList_.size() : this.authListBuilder_.getCount();
         }

         public AuthInfo getAuthList(int index) {
            return this.authListBuilder_ == null ? (AuthInfo)this.authList_.get(index) : (AuthInfo)this.authListBuilder_.getMessage(index);
         }

         public Builder setAuthList(int index, AuthInfo value) {
            if (this.authListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAuthListIsMutable();
               this.authList_.set(index, value);
               this.onChanged();
            } else {
               this.authListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAuthList(int index, AuthInfo.Builder builderForValue) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.authListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAuthList(AuthInfo value) {
            if (this.authListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAuthListIsMutable();
               this.authList_.add(value);
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAuthList(int index, AuthInfo value) {
            if (this.authListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAuthListIsMutable();
               this.authList_.add(index, value);
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAuthList(AuthInfo.Builder builderForValue) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAuthList(int index, AuthInfo.Builder builderForValue) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAuthList(Iterable<? extends AuthInfo> values) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.authList_);
               this.onChanged();
            } else {
               this.authListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAuthList() {
            if (this.authListBuilder_ == null) {
               this.authList_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.authListBuilder_.clear();
            }

            return this;
         }

         public Builder removeAuthList(int index) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.remove(index);
               this.onChanged();
            } else {
               this.authListBuilder_.remove(index);
            }

            return this;
         }

         public AuthInfo.Builder getAuthListBuilder(int index) {
            return (AuthInfo.Builder)this.getAuthListFieldBuilder().getBuilder(index);
         }

         public AuthInfoOrBuilder getAuthListOrBuilder(int index) {
            return this.authListBuilder_ == null ? (AuthInfoOrBuilder)this.authList_.get(index) : (AuthInfoOrBuilder)this.authListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends AuthInfoOrBuilder> getAuthListOrBuilderList() {
            return this.authListBuilder_ != null ? this.authListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.authList_);
         }

         public AuthInfo.Builder addAuthListBuilder() {
            return (AuthInfo.Builder)this.getAuthListFieldBuilder().addBuilder(MagicBookMsg.AuthInfo.getDefaultInstance());
         }

         public AuthInfo.Builder addAuthListBuilder(int index) {
            return (AuthInfo.Builder)this.getAuthListFieldBuilder().addBuilder(index, MagicBookMsg.AuthInfo.getDefaultInstance());
         }

         public List<AuthInfo.Builder> getAuthListBuilderList() {
            return this.getAuthListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<AuthInfo, AuthInfo.Builder, AuthInfoOrBuilder> getAuthListFieldBuilder() {
            if (this.authListBuilder_ == null) {
               this.authListBuilder_ = new RepeatedFieldBuilderV3(this.authList_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.authList_ = null;
            }

            return this.authListBuilder_;
         }

         private void ensureOriginalsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.originals_ = new ArrayList(this.originals_);
               this.bitField0_ |= 8;
            }

         }

         public List<OriginalBuyInfo> getOriginalsList() {
            return this.originalsBuilder_ == null ? Collections.unmodifiableList(this.originals_) : this.originalsBuilder_.getMessageList();
         }

         public int getOriginalsCount() {
            return this.originalsBuilder_ == null ? this.originals_.size() : this.originalsBuilder_.getCount();
         }

         public OriginalBuyInfo getOriginals(int index) {
            return this.originalsBuilder_ == null ? (OriginalBuyInfo)this.originals_.get(index) : (OriginalBuyInfo)this.originalsBuilder_.getMessage(index);
         }

         public Builder setOriginals(int index, OriginalBuyInfo value) {
            if (this.originalsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOriginalsIsMutable();
               this.originals_.set(index, value);
               this.onChanged();
            } else {
               this.originalsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setOriginals(int index, OriginalBuyInfo.Builder builderForValue) {
            if (this.originalsBuilder_ == null) {
               this.ensureOriginalsIsMutable();
               this.originals_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.originalsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addOriginals(OriginalBuyInfo value) {
            if (this.originalsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOriginalsIsMutable();
               this.originals_.add(value);
               this.onChanged();
            } else {
               this.originalsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addOriginals(int index, OriginalBuyInfo value) {
            if (this.originalsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOriginalsIsMutable();
               this.originals_.add(index, value);
               this.onChanged();
            } else {
               this.originalsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addOriginals(OriginalBuyInfo.Builder builderForValue) {
            if (this.originalsBuilder_ == null) {
               this.ensureOriginalsIsMutable();
               this.originals_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.originalsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addOriginals(int index, OriginalBuyInfo.Builder builderForValue) {
            if (this.originalsBuilder_ == null) {
               this.ensureOriginalsIsMutable();
               this.originals_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.originalsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllOriginals(Iterable<? extends OriginalBuyInfo> values) {
            if (this.originalsBuilder_ == null) {
               this.ensureOriginalsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.originals_);
               this.onChanged();
            } else {
               this.originalsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearOriginals() {
            if (this.originalsBuilder_ == null) {
               this.originals_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.originalsBuilder_.clear();
            }

            return this;
         }

         public Builder removeOriginals(int index) {
            if (this.originalsBuilder_ == null) {
               this.ensureOriginalsIsMutable();
               this.originals_.remove(index);
               this.onChanged();
            } else {
               this.originalsBuilder_.remove(index);
            }

            return this;
         }

         public OriginalBuyInfo.Builder getOriginalsBuilder(int index) {
            return (OriginalBuyInfo.Builder)this.getOriginalsFieldBuilder().getBuilder(index);
         }

         public OriginalBuyInfoOrBuilder getOriginalsOrBuilder(int index) {
            return this.originalsBuilder_ == null ? (OriginalBuyInfoOrBuilder)this.originals_.get(index) : (OriginalBuyInfoOrBuilder)this.originalsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends OriginalBuyInfoOrBuilder> getOriginalsOrBuilderList() {
            return this.originalsBuilder_ != null ? this.originalsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.originals_);
         }

         public OriginalBuyInfo.Builder addOriginalsBuilder() {
            return (OriginalBuyInfo.Builder)this.getOriginalsFieldBuilder().addBuilder(MagicBookMsg.OriginalBuyInfo.getDefaultInstance());
         }

         public OriginalBuyInfo.Builder addOriginalsBuilder(int index) {
            return (OriginalBuyInfo.Builder)this.getOriginalsFieldBuilder().addBuilder(index, MagicBookMsg.OriginalBuyInfo.getDefaultInstance());
         }

         public List<OriginalBuyInfo.Builder> getOriginalsBuilderList() {
            return this.getOriginalsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<OriginalBuyInfo, OriginalBuyInfo.Builder, OriginalBuyInfoOrBuilder> getOriginalsFieldBuilder() {
            if (this.originalsBuilder_ == null) {
               this.originalsBuilder_ = new RepeatedFieldBuilderV3(this.originals_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.originals_ = null;
            }

            return this.originalsBuilder_;
         }

         private void ensureMagicsIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.magics_ = MagicBookMsg.S2C_MagicBookInfo_10602.mutableCopy(this.magics_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getMagicsList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.magics_) : this.magics_);
         }

         public int getMagicsCount() {
            return this.magics_.size();
         }

         public int getMagics(int index) {
            return this.magics_.getInt(index);
         }

         public Builder setMagics(int index, int value) {
            this.ensureMagicsIsMutable();
            this.magics_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addMagics(int value) {
            this.ensureMagicsIsMutable();
            this.magics_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllMagics(Iterable<? extends Integer> values) {
            this.ensureMagicsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.magics_);
            this.onChanged();
            return this;
         }

         public Builder clearMagics() {
            this.magics_ = MagicBookMsg.S2C_MagicBookInfo_10602.emptyIntList();
            this.bitField0_ &= -17;
            this.onChanged();
            return this;
         }

         public boolean hasPower() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 32;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -33;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Auth_10603 extends GeneratedMessageV3 implements C2S_Auth_10603OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int ORIGINALID_FIELD_NUMBER = 2;
      private int originalId_;
      private byte memoizedIsInitialized;
      private static final C2S_Auth_10603 DEFAULT_INSTANCE = new C2S_Auth_10603();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Auth_10603> PARSER = new AbstractParser<C2S_Auth_10603>() {
         public C2S_Auth_10603 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Auth_10603(input, extensionRegistry);
         }
      };

      private C2S_Auth_10603(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Auth_10603() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Auth_10603();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Auth_10603(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.position_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.originalId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_Auth_10603_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_Auth_10603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Auth_10603.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public boolean hasOriginalId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getOriginalId() {
         return this.originalId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOriginalId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.position_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.originalId_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.position_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.originalId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Auth_10603)) {
            return super.equals(obj);
         } else {
            C2S_Auth_10603 other = (C2S_Auth_10603)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
               return false;
            } else if (this.hasOriginalId() != other.hasOriginalId()) {
               return false;
            } else if (this.hasOriginalId() && this.getOriginalId() != other.getOriginalId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition();
            }

            if (this.hasOriginalId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getOriginalId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Auth_10603 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Auth_10603)PARSER.parseFrom(data);
      }

      public static C2S_Auth_10603 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Auth_10603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Auth_10603 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Auth_10603)PARSER.parseFrom(data);
      }

      public static C2S_Auth_10603 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Auth_10603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Auth_10603 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Auth_10603)PARSER.parseFrom(data);
      }

      public static C2S_Auth_10603 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Auth_10603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Auth_10603 parseFrom(InputStream input) throws IOException {
         return (C2S_Auth_10603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Auth_10603 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Auth_10603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Auth_10603 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Auth_10603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Auth_10603 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Auth_10603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Auth_10603 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Auth_10603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Auth_10603 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Auth_10603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Auth_10603 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Auth_10603 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Auth_10603> parser() {
         return PARSER;
      }

      public Parser<C2S_Auth_10603> getParserForType() {
         return PARSER;
      }

      public C2S_Auth_10603 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Auth_10603OrBuilder {
         private int bitField0_;
         private int position_;
         private int originalId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_Auth_10603_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_Auth_10603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Auth_10603.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.C2S_Auth_10603.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 0;
            this.bitField0_ &= -2;
            this.originalId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_Auth_10603_descriptor;
         }

         public C2S_Auth_10603 getDefaultInstanceForType() {
            return MagicBookMsg.C2S_Auth_10603.getDefaultInstance();
         }

         public C2S_Auth_10603 build() {
            C2S_Auth_10603 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Auth_10603 buildPartial() {
            C2S_Auth_10603 result = new C2S_Auth_10603(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.position_ = this.position_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.originalId_ = this.originalId_;
               to_bitField0_ |= 2;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Auth_10603) {
               return this.mergeFrom((C2S_Auth_10603)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Auth_10603 other) {
            if (other == MagicBookMsg.C2S_Auth_10603.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasOriginalId()) {
                  this.setOriginalId(other.getOriginalId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasOriginalId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Auth_10603 parsedMessage = null;

            try {
               parsedMessage = (C2S_Auth_10603)MagicBookMsg.C2S_Auth_10603.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Auth_10603)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPosition() {
            return this.position_;
         }

         public Builder setPosition(int value) {
            this.bitField0_ |= 1;
            this.position_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPosition() {
            this.bitField0_ &= -2;
            this.position_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOriginalId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getOriginalId() {
            return this.originalId_;
         }

         public Builder setOriginalId(int value) {
            this.bitField0_ |= 2;
            this.originalId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOriginalId() {
            this.bitField0_ &= -3;
            this.originalId_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_Auth_10604 extends GeneratedMessageV3 implements S2C_Auth_10604OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int AUTHLIST_FIELD_NUMBER = 1;
      private List<AuthInfo> authList_;
      private byte memoizedIsInitialized;
      private static final S2C_Auth_10604 DEFAULT_INSTANCE = new S2C_Auth_10604();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Auth_10604> PARSER = new AbstractParser<S2C_Auth_10604>() {
         public S2C_Auth_10604 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Auth_10604(input, extensionRegistry);
         }
      };

      private S2C_Auth_10604(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Auth_10604() {
         this.memoizedIsInitialized = -1;
         this.authList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Auth_10604();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Auth_10604(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.authList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.authList_.add(input.readMessage(MagicBookMsg.AuthInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.authList_ = Collections.unmodifiableList(this.authList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_Auth_10604_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_Auth_10604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Auth_10604.class, Builder.class);
      }

      public List<AuthInfo> getAuthListList() {
         return this.authList_;
      }

      public List<? extends AuthInfoOrBuilder> getAuthListOrBuilderList() {
         return this.authList_;
      }

      public int getAuthListCount() {
         return this.authList_.size();
      }

      public AuthInfo getAuthList(int index) {
         return (AuthInfo)this.authList_.get(index);
      }

      public AuthInfoOrBuilder getAuthListOrBuilder(int index) {
         return (AuthInfoOrBuilder)this.authList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getAuthListCount(); ++i) {
               if (!this.getAuthList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.authList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.authList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.authList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.authList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Auth_10604)) {
            return super.equals(obj);
         } else {
            S2C_Auth_10604 other = (S2C_Auth_10604)obj;
            if (!this.getAuthListList().equals(other.getAuthListList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getAuthListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAuthListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Auth_10604 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Auth_10604)PARSER.parseFrom(data);
      }

      public static S2C_Auth_10604 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Auth_10604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Auth_10604 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Auth_10604)PARSER.parseFrom(data);
      }

      public static S2C_Auth_10604 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Auth_10604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Auth_10604 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Auth_10604)PARSER.parseFrom(data);
      }

      public static S2C_Auth_10604 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Auth_10604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Auth_10604 parseFrom(InputStream input) throws IOException {
         return (S2C_Auth_10604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Auth_10604 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Auth_10604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Auth_10604 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Auth_10604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Auth_10604 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Auth_10604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Auth_10604 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Auth_10604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Auth_10604 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Auth_10604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Auth_10604 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Auth_10604 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Auth_10604> parser() {
         return PARSER;
      }

      public Parser<S2C_Auth_10604> getParserForType() {
         return PARSER;
      }

      public S2C_Auth_10604 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Auth_10604OrBuilder {
         private int bitField0_;
         private List<AuthInfo> authList_;
         private RepeatedFieldBuilderV3<AuthInfo, AuthInfo.Builder, AuthInfoOrBuilder> authListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_Auth_10604_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_Auth_10604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Auth_10604.class, Builder.class);
         }

         private Builder() {
            this.authList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.authList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.S2C_Auth_10604.alwaysUseFieldBuilders) {
               this.getAuthListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.authListBuilder_ == null) {
               this.authList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.authListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_Auth_10604_descriptor;
         }

         public S2C_Auth_10604 getDefaultInstanceForType() {
            return MagicBookMsg.S2C_Auth_10604.getDefaultInstance();
         }

         public S2C_Auth_10604 build() {
            S2C_Auth_10604 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Auth_10604 buildPartial() {
            S2C_Auth_10604 result = new S2C_Auth_10604(this);
            int from_bitField0_ = this.bitField0_;
            if (this.authListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.authList_ = Collections.unmodifiableList(this.authList_);
                  this.bitField0_ &= -2;
               }

               result.authList_ = this.authList_;
            } else {
               result.authList_ = this.authListBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_Auth_10604) {
               return this.mergeFrom((S2C_Auth_10604)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Auth_10604 other) {
            if (other == MagicBookMsg.S2C_Auth_10604.getDefaultInstance()) {
               return this;
            } else {
               if (this.authListBuilder_ == null) {
                  if (!other.authList_.isEmpty()) {
                     if (this.authList_.isEmpty()) {
                        this.authList_ = other.authList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureAuthListIsMutable();
                        this.authList_.addAll(other.authList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.authList_.isEmpty()) {
                  if (this.authListBuilder_.isEmpty()) {
                     this.authListBuilder_.dispose();
                     this.authListBuilder_ = null;
                     this.authList_ = other.authList_;
                     this.bitField0_ &= -2;
                     this.authListBuilder_ = MagicBookMsg.S2C_Auth_10604.alwaysUseFieldBuilders ? this.getAuthListFieldBuilder() : null;
                  } else {
                     this.authListBuilder_.addAllMessages(other.authList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getAuthListCount(); ++i) {
               if (!this.getAuthList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Auth_10604 parsedMessage = null;

            try {
               parsedMessage = (S2C_Auth_10604)MagicBookMsg.S2C_Auth_10604.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Auth_10604)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureAuthListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.authList_ = new ArrayList(this.authList_);
               this.bitField0_ |= 1;
            }

         }

         public List<AuthInfo> getAuthListList() {
            return this.authListBuilder_ == null ? Collections.unmodifiableList(this.authList_) : this.authListBuilder_.getMessageList();
         }

         public int getAuthListCount() {
            return this.authListBuilder_ == null ? this.authList_.size() : this.authListBuilder_.getCount();
         }

         public AuthInfo getAuthList(int index) {
            return this.authListBuilder_ == null ? (AuthInfo)this.authList_.get(index) : (AuthInfo)this.authListBuilder_.getMessage(index);
         }

         public Builder setAuthList(int index, AuthInfo value) {
            if (this.authListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAuthListIsMutable();
               this.authList_.set(index, value);
               this.onChanged();
            } else {
               this.authListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAuthList(int index, AuthInfo.Builder builderForValue) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.authListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAuthList(AuthInfo value) {
            if (this.authListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAuthListIsMutable();
               this.authList_.add(value);
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAuthList(int index, AuthInfo value) {
            if (this.authListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAuthListIsMutable();
               this.authList_.add(index, value);
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAuthList(AuthInfo.Builder builderForValue) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAuthList(int index, AuthInfo.Builder builderForValue) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAuthList(Iterable<? extends AuthInfo> values) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.authList_);
               this.onChanged();
            } else {
               this.authListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAuthList() {
            if (this.authListBuilder_ == null) {
               this.authList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.authListBuilder_.clear();
            }

            return this;
         }

         public Builder removeAuthList(int index) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.remove(index);
               this.onChanged();
            } else {
               this.authListBuilder_.remove(index);
            }

            return this;
         }

         public AuthInfo.Builder getAuthListBuilder(int index) {
            return (AuthInfo.Builder)this.getAuthListFieldBuilder().getBuilder(index);
         }

         public AuthInfoOrBuilder getAuthListOrBuilder(int index) {
            return this.authListBuilder_ == null ? (AuthInfoOrBuilder)this.authList_.get(index) : (AuthInfoOrBuilder)this.authListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends AuthInfoOrBuilder> getAuthListOrBuilderList() {
            return this.authListBuilder_ != null ? this.authListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.authList_);
         }

         public AuthInfo.Builder addAuthListBuilder() {
            return (AuthInfo.Builder)this.getAuthListFieldBuilder().addBuilder(MagicBookMsg.AuthInfo.getDefaultInstance());
         }

         public AuthInfo.Builder addAuthListBuilder(int index) {
            return (AuthInfo.Builder)this.getAuthListFieldBuilder().addBuilder(index, MagicBookMsg.AuthInfo.getDefaultInstance());
         }

         public List<AuthInfo.Builder> getAuthListBuilderList() {
            return this.getAuthListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<AuthInfo, AuthInfo.Builder, AuthInfoOrBuilder> getAuthListFieldBuilder() {
            if (this.authListBuilder_ == null) {
               this.authListBuilder_ = new RepeatedFieldBuilderV3(this.authList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.authList_ = null;
            }

            return this.authListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_AuthSpeedUp_10605 extends GeneratedMessageV3 implements C2S_AuthSpeedUp_10605OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_AuthSpeedUp_10605 DEFAULT_INSTANCE = new C2S_AuthSpeedUp_10605();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AuthSpeedUp_10605> PARSER = new AbstractParser<C2S_AuthSpeedUp_10605>() {
         public C2S_AuthSpeedUp_10605 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AuthSpeedUp_10605(input, extensionRegistry);
         }
      };

      private C2S_AuthSpeedUp_10605(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AuthSpeedUp_10605() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AuthSpeedUp_10605();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AuthSpeedUp_10605(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.position_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.type_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_AuthSpeedUp_10605_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_AuthSpeedUp_10605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AuthSpeedUp_10605.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.position_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.type_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.position_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AuthSpeedUp_10605)) {
            return super.equals(obj);
         } else {
            C2S_AuthSpeedUp_10605 other = (C2S_AuthSpeedUp_10605)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition();
            }

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AuthSpeedUp_10605 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AuthSpeedUp_10605)PARSER.parseFrom(data);
      }

      public static C2S_AuthSpeedUp_10605 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AuthSpeedUp_10605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AuthSpeedUp_10605 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AuthSpeedUp_10605)PARSER.parseFrom(data);
      }

      public static C2S_AuthSpeedUp_10605 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AuthSpeedUp_10605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AuthSpeedUp_10605 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AuthSpeedUp_10605)PARSER.parseFrom(data);
      }

      public static C2S_AuthSpeedUp_10605 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AuthSpeedUp_10605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AuthSpeedUp_10605 parseFrom(InputStream input) throws IOException {
         return (C2S_AuthSpeedUp_10605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AuthSpeedUp_10605 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AuthSpeedUp_10605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AuthSpeedUp_10605 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AuthSpeedUp_10605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AuthSpeedUp_10605 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AuthSpeedUp_10605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AuthSpeedUp_10605 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AuthSpeedUp_10605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AuthSpeedUp_10605 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AuthSpeedUp_10605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AuthSpeedUp_10605 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AuthSpeedUp_10605 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AuthSpeedUp_10605> parser() {
         return PARSER;
      }

      public Parser<C2S_AuthSpeedUp_10605> getParserForType() {
         return PARSER;
      }

      public C2S_AuthSpeedUp_10605 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AuthSpeedUp_10605OrBuilder {
         private int bitField0_;
         private int position_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_AuthSpeedUp_10605_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_AuthSpeedUp_10605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AuthSpeedUp_10605.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.C2S_AuthSpeedUp_10605.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_AuthSpeedUp_10605_descriptor;
         }

         public C2S_AuthSpeedUp_10605 getDefaultInstanceForType() {
            return MagicBookMsg.C2S_AuthSpeedUp_10605.getDefaultInstance();
         }

         public C2S_AuthSpeedUp_10605 build() {
            C2S_AuthSpeedUp_10605 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AuthSpeedUp_10605 buildPartial() {
            C2S_AuthSpeedUp_10605 result = new C2S_AuthSpeedUp_10605(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.position_ = this.position_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 2;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_AuthSpeedUp_10605) {
               return this.mergeFrom((C2S_AuthSpeedUp_10605)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AuthSpeedUp_10605 other) {
            if (other == MagicBookMsg.C2S_AuthSpeedUp_10605.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_AuthSpeedUp_10605 parsedMessage = null;

            try {
               parsedMessage = (C2S_AuthSpeedUp_10605)MagicBookMsg.C2S_AuthSpeedUp_10605.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AuthSpeedUp_10605)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPosition() {
            return this.position_;
         }

         public Builder setPosition(int value) {
            this.bitField0_ |= 1;
            this.position_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPosition() {
            this.bitField0_ &= -2;
            this.position_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 2;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -3;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_AuthSpeedUp_10606 extends GeneratedMessageV3 implements S2C_AuthSpeedUp_10606OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int AUTHLIST_FIELD_NUMBER = 1;
      private List<AuthInfo> authList_;
      private byte memoizedIsInitialized;
      private static final S2C_AuthSpeedUp_10606 DEFAULT_INSTANCE = new S2C_AuthSpeedUp_10606();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AuthSpeedUp_10606> PARSER = new AbstractParser<S2C_AuthSpeedUp_10606>() {
         public S2C_AuthSpeedUp_10606 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AuthSpeedUp_10606(input, extensionRegistry);
         }
      };

      private S2C_AuthSpeedUp_10606(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AuthSpeedUp_10606() {
         this.memoizedIsInitialized = -1;
         this.authList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AuthSpeedUp_10606();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AuthSpeedUp_10606(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.authList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.authList_.add(input.readMessage(MagicBookMsg.AuthInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.authList_ = Collections.unmodifiableList(this.authList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_AuthSpeedUp_10606_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_AuthSpeedUp_10606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AuthSpeedUp_10606.class, Builder.class);
      }

      public List<AuthInfo> getAuthListList() {
         return this.authList_;
      }

      public List<? extends AuthInfoOrBuilder> getAuthListOrBuilderList() {
         return this.authList_;
      }

      public int getAuthListCount() {
         return this.authList_.size();
      }

      public AuthInfo getAuthList(int index) {
         return (AuthInfo)this.authList_.get(index);
      }

      public AuthInfoOrBuilder getAuthListOrBuilder(int index) {
         return (AuthInfoOrBuilder)this.authList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getAuthListCount(); ++i) {
               if (!this.getAuthList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.authList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.authList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.authList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.authList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AuthSpeedUp_10606)) {
            return super.equals(obj);
         } else {
            S2C_AuthSpeedUp_10606 other = (S2C_AuthSpeedUp_10606)obj;
            if (!this.getAuthListList().equals(other.getAuthListList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getAuthListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAuthListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AuthSpeedUp_10606 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AuthSpeedUp_10606)PARSER.parseFrom(data);
      }

      public static S2C_AuthSpeedUp_10606 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AuthSpeedUp_10606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AuthSpeedUp_10606 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AuthSpeedUp_10606)PARSER.parseFrom(data);
      }

      public static S2C_AuthSpeedUp_10606 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AuthSpeedUp_10606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AuthSpeedUp_10606 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AuthSpeedUp_10606)PARSER.parseFrom(data);
      }

      public static S2C_AuthSpeedUp_10606 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AuthSpeedUp_10606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AuthSpeedUp_10606 parseFrom(InputStream input) throws IOException {
         return (S2C_AuthSpeedUp_10606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AuthSpeedUp_10606 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AuthSpeedUp_10606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AuthSpeedUp_10606 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AuthSpeedUp_10606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AuthSpeedUp_10606 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AuthSpeedUp_10606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AuthSpeedUp_10606 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AuthSpeedUp_10606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AuthSpeedUp_10606 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AuthSpeedUp_10606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AuthSpeedUp_10606 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AuthSpeedUp_10606 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AuthSpeedUp_10606> parser() {
         return PARSER;
      }

      public Parser<S2C_AuthSpeedUp_10606> getParserForType() {
         return PARSER;
      }

      public S2C_AuthSpeedUp_10606 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AuthSpeedUp_10606OrBuilder {
         private int bitField0_;
         private List<AuthInfo> authList_;
         private RepeatedFieldBuilderV3<AuthInfo, AuthInfo.Builder, AuthInfoOrBuilder> authListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_AuthSpeedUp_10606_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_AuthSpeedUp_10606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AuthSpeedUp_10606.class, Builder.class);
         }

         private Builder() {
            this.authList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.authList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.S2C_AuthSpeedUp_10606.alwaysUseFieldBuilders) {
               this.getAuthListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.authListBuilder_ == null) {
               this.authList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.authListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_AuthSpeedUp_10606_descriptor;
         }

         public S2C_AuthSpeedUp_10606 getDefaultInstanceForType() {
            return MagicBookMsg.S2C_AuthSpeedUp_10606.getDefaultInstance();
         }

         public S2C_AuthSpeedUp_10606 build() {
            S2C_AuthSpeedUp_10606 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AuthSpeedUp_10606 buildPartial() {
            S2C_AuthSpeedUp_10606 result = new S2C_AuthSpeedUp_10606(this);
            int from_bitField0_ = this.bitField0_;
            if (this.authListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.authList_ = Collections.unmodifiableList(this.authList_);
                  this.bitField0_ &= -2;
               }

               result.authList_ = this.authList_;
            } else {
               result.authList_ = this.authListBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_AuthSpeedUp_10606) {
               return this.mergeFrom((S2C_AuthSpeedUp_10606)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AuthSpeedUp_10606 other) {
            if (other == MagicBookMsg.S2C_AuthSpeedUp_10606.getDefaultInstance()) {
               return this;
            } else {
               if (this.authListBuilder_ == null) {
                  if (!other.authList_.isEmpty()) {
                     if (this.authList_.isEmpty()) {
                        this.authList_ = other.authList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureAuthListIsMutable();
                        this.authList_.addAll(other.authList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.authList_.isEmpty()) {
                  if (this.authListBuilder_.isEmpty()) {
                     this.authListBuilder_.dispose();
                     this.authListBuilder_ = null;
                     this.authList_ = other.authList_;
                     this.bitField0_ &= -2;
                     this.authListBuilder_ = MagicBookMsg.S2C_AuthSpeedUp_10606.alwaysUseFieldBuilders ? this.getAuthListFieldBuilder() : null;
                  } else {
                     this.authListBuilder_.addAllMessages(other.authList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getAuthListCount(); ++i) {
               if (!this.getAuthList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AuthSpeedUp_10606 parsedMessage = null;

            try {
               parsedMessage = (S2C_AuthSpeedUp_10606)MagicBookMsg.S2C_AuthSpeedUp_10606.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AuthSpeedUp_10606)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureAuthListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.authList_ = new ArrayList(this.authList_);
               this.bitField0_ |= 1;
            }

         }

         public List<AuthInfo> getAuthListList() {
            return this.authListBuilder_ == null ? Collections.unmodifiableList(this.authList_) : this.authListBuilder_.getMessageList();
         }

         public int getAuthListCount() {
            return this.authListBuilder_ == null ? this.authList_.size() : this.authListBuilder_.getCount();
         }

         public AuthInfo getAuthList(int index) {
            return this.authListBuilder_ == null ? (AuthInfo)this.authList_.get(index) : (AuthInfo)this.authListBuilder_.getMessage(index);
         }

         public Builder setAuthList(int index, AuthInfo value) {
            if (this.authListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAuthListIsMutable();
               this.authList_.set(index, value);
               this.onChanged();
            } else {
               this.authListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAuthList(int index, AuthInfo.Builder builderForValue) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.authListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAuthList(AuthInfo value) {
            if (this.authListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAuthListIsMutable();
               this.authList_.add(value);
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAuthList(int index, AuthInfo value) {
            if (this.authListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAuthListIsMutable();
               this.authList_.add(index, value);
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAuthList(AuthInfo.Builder builderForValue) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAuthList(int index, AuthInfo.Builder builderForValue) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAuthList(Iterable<? extends AuthInfo> values) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.authList_);
               this.onChanged();
            } else {
               this.authListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAuthList() {
            if (this.authListBuilder_ == null) {
               this.authList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.authListBuilder_.clear();
            }

            return this;
         }

         public Builder removeAuthList(int index) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.remove(index);
               this.onChanged();
            } else {
               this.authListBuilder_.remove(index);
            }

            return this;
         }

         public AuthInfo.Builder getAuthListBuilder(int index) {
            return (AuthInfo.Builder)this.getAuthListFieldBuilder().getBuilder(index);
         }

         public AuthInfoOrBuilder getAuthListOrBuilder(int index) {
            return this.authListBuilder_ == null ? (AuthInfoOrBuilder)this.authList_.get(index) : (AuthInfoOrBuilder)this.authListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends AuthInfoOrBuilder> getAuthListOrBuilderList() {
            return this.authListBuilder_ != null ? this.authListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.authList_);
         }

         public AuthInfo.Builder addAuthListBuilder() {
            return (AuthInfo.Builder)this.getAuthListFieldBuilder().addBuilder(MagicBookMsg.AuthInfo.getDefaultInstance());
         }

         public AuthInfo.Builder addAuthListBuilder(int index) {
            return (AuthInfo.Builder)this.getAuthListFieldBuilder().addBuilder(index, MagicBookMsg.AuthInfo.getDefaultInstance());
         }

         public List<AuthInfo.Builder> getAuthListBuilderList() {
            return this.getAuthListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<AuthInfo, AuthInfo.Builder, AuthInfoOrBuilder> getAuthListFieldBuilder() {
            if (this.authListBuilder_ == null) {
               this.authListBuilder_ = new RepeatedFieldBuilderV3(this.authList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.authList_ = null;
            }

            return this.authListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_AuthLevelUp_10607 extends GeneratedMessageV3 implements C2S_AuthLevelUp_10607OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int HEROCODELIST_FIELD_NUMBER = 1;
      private Internal.IntList heroCodeList_;
      private byte memoizedIsInitialized;
      private static final C2S_AuthLevelUp_10607 DEFAULT_INSTANCE = new C2S_AuthLevelUp_10607();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AuthLevelUp_10607> PARSER = new AbstractParser<C2S_AuthLevelUp_10607>() {
         public C2S_AuthLevelUp_10607 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AuthLevelUp_10607(input, extensionRegistry);
         }
      };

      private C2S_AuthLevelUp_10607(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AuthLevelUp_10607() {
         this.memoizedIsInitialized = -1;
         this.heroCodeList_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AuthLevelUp_10607();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AuthLevelUp_10607(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.heroCodeList_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.heroCodeList_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroCodeList_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heroCodeList_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.heroCodeList_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_AuthLevelUp_10607_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_AuthLevelUp_10607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AuthLevelUp_10607.class, Builder.class);
      }

      public List<Integer> getHeroCodeListList() {
         return this.heroCodeList_;
      }

      public int getHeroCodeListCount() {
         return this.heroCodeList_.size();
      }

      public int getHeroCodeList(int index) {
         return this.heroCodeList_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.heroCodeList_.size(); ++i) {
            output.writeInt32(1, this.heroCodeList_.getInt(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            int dataSize = 0;

            for(int i = 0; i < this.heroCodeList_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroCodeList_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroCodeListList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AuthLevelUp_10607)) {
            return super.equals(obj);
         } else {
            C2S_AuthLevelUp_10607 other = (C2S_AuthLevelUp_10607)obj;
            if (!this.getHeroCodeListList().equals(other.getHeroCodeListList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getHeroCodeListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCodeListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AuthLevelUp_10607 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AuthLevelUp_10607)PARSER.parseFrom(data);
      }

      public static C2S_AuthLevelUp_10607 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AuthLevelUp_10607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AuthLevelUp_10607 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AuthLevelUp_10607)PARSER.parseFrom(data);
      }

      public static C2S_AuthLevelUp_10607 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AuthLevelUp_10607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AuthLevelUp_10607 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AuthLevelUp_10607)PARSER.parseFrom(data);
      }

      public static C2S_AuthLevelUp_10607 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AuthLevelUp_10607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AuthLevelUp_10607 parseFrom(InputStream input) throws IOException {
         return (C2S_AuthLevelUp_10607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AuthLevelUp_10607 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AuthLevelUp_10607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AuthLevelUp_10607 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AuthLevelUp_10607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AuthLevelUp_10607 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AuthLevelUp_10607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AuthLevelUp_10607 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AuthLevelUp_10607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AuthLevelUp_10607 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AuthLevelUp_10607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AuthLevelUp_10607 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AuthLevelUp_10607 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AuthLevelUp_10607> parser() {
         return PARSER;
      }

      public Parser<C2S_AuthLevelUp_10607> getParserForType() {
         return PARSER;
      }

      public C2S_AuthLevelUp_10607 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AuthLevelUp_10607OrBuilder {
         private int bitField0_;
         private Internal.IntList heroCodeList_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_AuthLevelUp_10607_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_AuthLevelUp_10607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AuthLevelUp_10607.class, Builder.class);
         }

         private Builder() {
            this.heroCodeList_ = MagicBookMsg.C2S_AuthLevelUp_10607.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroCodeList_ = MagicBookMsg.C2S_AuthLevelUp_10607.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.C2S_AuthLevelUp_10607.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCodeList_ = MagicBookMsg.C2S_AuthLevelUp_10607.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_AuthLevelUp_10607_descriptor;
         }

         public C2S_AuthLevelUp_10607 getDefaultInstanceForType() {
            return MagicBookMsg.C2S_AuthLevelUp_10607.getDefaultInstance();
         }

         public C2S_AuthLevelUp_10607 build() {
            C2S_AuthLevelUp_10607 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AuthLevelUp_10607 buildPartial() {
            C2S_AuthLevelUp_10607 result = new C2S_AuthLevelUp_10607(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.heroCodeList_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.heroCodeList_ = this.heroCodeList_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_AuthLevelUp_10607) {
               return this.mergeFrom((C2S_AuthLevelUp_10607)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AuthLevelUp_10607 other) {
            if (other == MagicBookMsg.C2S_AuthLevelUp_10607.getDefaultInstance()) {
               return this;
            } else {
               if (!other.heroCodeList_.isEmpty()) {
                  if (this.heroCodeList_.isEmpty()) {
                     this.heroCodeList_ = other.heroCodeList_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureHeroCodeListIsMutable();
                     this.heroCodeList_.addAll(other.heroCodeList_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_AuthLevelUp_10607 parsedMessage = null;

            try {
               parsedMessage = (C2S_AuthLevelUp_10607)MagicBookMsg.C2S_AuthLevelUp_10607.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AuthLevelUp_10607)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureHeroCodeListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.heroCodeList_ = MagicBookMsg.C2S_AuthLevelUp_10607.mutableCopy(this.heroCodeList_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getHeroCodeListList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.heroCodeList_) : this.heroCodeList_);
         }

         public int getHeroCodeListCount() {
            return this.heroCodeList_.size();
         }

         public int getHeroCodeList(int index) {
            return this.heroCodeList_.getInt(index);
         }

         public Builder setHeroCodeList(int index, int value) {
            this.ensureHeroCodeListIsMutable();
            this.heroCodeList_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroCodeList(int value) {
            this.ensureHeroCodeListIsMutable();
            this.heroCodeList_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroCodeList(Iterable<? extends Integer> values) {
            this.ensureHeroCodeListIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroCodeList_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroCodeList() {
            this.heroCodeList_ = MagicBookMsg.C2S_AuthLevelUp_10607.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_AuthLevelUp_10608 extends GeneratedMessageV3 implements S2C_AuthLevelUp_10608OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int IDENTITYID_FIELD_NUMBER = 1;
      private int identityId_;
      public static final int HEROCODELIST_FIELD_NUMBER = 2;
      private Internal.IntList heroCodeList_;
      public static final int AUTHLIST_FIELD_NUMBER = 3;
      private List<AuthInfo> authList_;
      private byte memoizedIsInitialized;
      private static final S2C_AuthLevelUp_10608 DEFAULT_INSTANCE = new S2C_AuthLevelUp_10608();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AuthLevelUp_10608> PARSER = new AbstractParser<S2C_AuthLevelUp_10608>() {
         public S2C_AuthLevelUp_10608 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AuthLevelUp_10608(input, extensionRegistry);
         }
      };

      private S2C_AuthLevelUp_10608(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AuthLevelUp_10608() {
         this.memoizedIsInitialized = -1;
         this.heroCodeList_ = emptyIntList();
         this.authList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AuthLevelUp_10608();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AuthLevelUp_10608(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  int limit;
                  switch (tag) {
                     case 0:
                        done = true;
                        continue;
                     case 8:
                        this.bitField0_ |= 1;
                        this.identityId_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.heroCodeList_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.heroCodeList_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroCodeList_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.authList_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.authList_.add(input.readMessage(MagicBookMsg.AuthInfo.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.heroCodeList_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.heroCodeList_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.authList_ = Collections.unmodifiableList(this.authList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_AuthLevelUp_10608_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_AuthLevelUp_10608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AuthLevelUp_10608.class, Builder.class);
      }

      public boolean hasIdentityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIdentityId() {
         return this.identityId_;
      }

      public List<Integer> getHeroCodeListList() {
         return this.heroCodeList_;
      }

      public int getHeroCodeListCount() {
         return this.heroCodeList_.size();
      }

      public int getHeroCodeList(int index) {
         return this.heroCodeList_.getInt(index);
      }

      public List<AuthInfo> getAuthListList() {
         return this.authList_;
      }

      public List<? extends AuthInfoOrBuilder> getAuthListOrBuilderList() {
         return this.authList_;
      }

      public int getAuthListCount() {
         return this.authList_.size();
      }

      public AuthInfo getAuthList(int index) {
         return (AuthInfo)this.authList_.get(index);
      }

      public AuthInfoOrBuilder getAuthListOrBuilder(int index) {
         return (AuthInfoOrBuilder)this.authList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIdentityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getAuthListCount(); ++i) {
               if (!this.getAuthList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.identityId_);
         }

         for(int i = 0; i < this.heroCodeList_.size(); ++i) {
            output.writeInt32(2, this.heroCodeList_.getInt(i));
         }

         for(int i = 0; i < this.authList_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.authList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.identityId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.heroCodeList_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroCodeList_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroCodeListList().size();

            for(int i = 0; i < this.authList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.authList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AuthLevelUp_10608)) {
            return super.equals(obj);
         } else {
            S2C_AuthLevelUp_10608 other = (S2C_AuthLevelUp_10608)obj;
            if (this.hasIdentityId() != other.hasIdentityId()) {
               return false;
            } else if (this.hasIdentityId() && this.getIdentityId() != other.getIdentityId()) {
               return false;
            } else if (!this.getHeroCodeListList().equals(other.getHeroCodeListList())) {
               return false;
            } else if (!this.getAuthListList().equals(other.getAuthListList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasIdentityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdentityId();
            }

            if (this.getHeroCodeListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCodeListList().hashCode();
            }

            if (this.getAuthListCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAuthListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AuthLevelUp_10608 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AuthLevelUp_10608)PARSER.parseFrom(data);
      }

      public static S2C_AuthLevelUp_10608 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AuthLevelUp_10608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AuthLevelUp_10608 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AuthLevelUp_10608)PARSER.parseFrom(data);
      }

      public static S2C_AuthLevelUp_10608 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AuthLevelUp_10608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AuthLevelUp_10608 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AuthLevelUp_10608)PARSER.parseFrom(data);
      }

      public static S2C_AuthLevelUp_10608 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AuthLevelUp_10608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AuthLevelUp_10608 parseFrom(InputStream input) throws IOException {
         return (S2C_AuthLevelUp_10608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AuthLevelUp_10608 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AuthLevelUp_10608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AuthLevelUp_10608 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AuthLevelUp_10608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AuthLevelUp_10608 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AuthLevelUp_10608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AuthLevelUp_10608 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AuthLevelUp_10608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AuthLevelUp_10608 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AuthLevelUp_10608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AuthLevelUp_10608 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AuthLevelUp_10608 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AuthLevelUp_10608> parser() {
         return PARSER;
      }

      public Parser<S2C_AuthLevelUp_10608> getParserForType() {
         return PARSER;
      }

      public S2C_AuthLevelUp_10608 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AuthLevelUp_10608OrBuilder {
         private int bitField0_;
         private int identityId_;
         private Internal.IntList heroCodeList_;
         private List<AuthInfo> authList_;
         private RepeatedFieldBuilderV3<AuthInfo, AuthInfo.Builder, AuthInfoOrBuilder> authListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_AuthLevelUp_10608_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_AuthLevelUp_10608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AuthLevelUp_10608.class, Builder.class);
         }

         private Builder() {
            this.heroCodeList_ = MagicBookMsg.S2C_AuthLevelUp_10608.emptyIntList();
            this.authList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroCodeList_ = MagicBookMsg.S2C_AuthLevelUp_10608.emptyIntList();
            this.authList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.S2C_AuthLevelUp_10608.alwaysUseFieldBuilders) {
               this.getAuthListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.identityId_ = 0;
            this.bitField0_ &= -2;
            this.heroCodeList_ = MagicBookMsg.S2C_AuthLevelUp_10608.emptyIntList();
            this.bitField0_ &= -3;
            if (this.authListBuilder_ == null) {
               this.authList_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.authListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_AuthLevelUp_10608_descriptor;
         }

         public S2C_AuthLevelUp_10608 getDefaultInstanceForType() {
            return MagicBookMsg.S2C_AuthLevelUp_10608.getDefaultInstance();
         }

         public S2C_AuthLevelUp_10608 build() {
            S2C_AuthLevelUp_10608 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AuthLevelUp_10608 buildPartial() {
            S2C_AuthLevelUp_10608 result = new S2C_AuthLevelUp_10608(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.identityId_ = this.identityId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.heroCodeList_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.heroCodeList_ = this.heroCodeList_;
            if (this.authListBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.authList_ = Collections.unmodifiableList(this.authList_);
                  this.bitField0_ &= -5;
               }

               result.authList_ = this.authList_;
            } else {
               result.authList_ = this.authListBuilder_.build();
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_AuthLevelUp_10608) {
               return this.mergeFrom((S2C_AuthLevelUp_10608)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AuthLevelUp_10608 other) {
            if (other == MagicBookMsg.S2C_AuthLevelUp_10608.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIdentityId()) {
                  this.setIdentityId(other.getIdentityId());
               }

               if (!other.heroCodeList_.isEmpty()) {
                  if (this.heroCodeList_.isEmpty()) {
                     this.heroCodeList_ = other.heroCodeList_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureHeroCodeListIsMutable();
                     this.heroCodeList_.addAll(other.heroCodeList_);
                  }

                  this.onChanged();
               }

               if (this.authListBuilder_ == null) {
                  if (!other.authList_.isEmpty()) {
                     if (this.authList_.isEmpty()) {
                        this.authList_ = other.authList_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureAuthListIsMutable();
                        this.authList_.addAll(other.authList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.authList_.isEmpty()) {
                  if (this.authListBuilder_.isEmpty()) {
                     this.authListBuilder_.dispose();
                     this.authListBuilder_ = null;
                     this.authList_ = other.authList_;
                     this.bitField0_ &= -5;
                     this.authListBuilder_ = MagicBookMsg.S2C_AuthLevelUp_10608.alwaysUseFieldBuilders ? this.getAuthListFieldBuilder() : null;
                  } else {
                     this.authListBuilder_.addAllMessages(other.authList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIdentityId()) {
               return false;
            } else {
               for(int i = 0; i < this.getAuthListCount(); ++i) {
                  if (!this.getAuthList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AuthLevelUp_10608 parsedMessage = null;

            try {
               parsedMessage = (S2C_AuthLevelUp_10608)MagicBookMsg.S2C_AuthLevelUp_10608.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AuthLevelUp_10608)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIdentityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIdentityId() {
            return this.identityId_;
         }

         public Builder setIdentityId(int value) {
            this.bitField0_ |= 1;
            this.identityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIdentityId() {
            this.bitField0_ &= -2;
            this.identityId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHeroCodeListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.heroCodeList_ = MagicBookMsg.S2C_AuthLevelUp_10608.mutableCopy(this.heroCodeList_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getHeroCodeListList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.heroCodeList_) : this.heroCodeList_);
         }

         public int getHeroCodeListCount() {
            return this.heroCodeList_.size();
         }

         public int getHeroCodeList(int index) {
            return this.heroCodeList_.getInt(index);
         }

         public Builder setHeroCodeList(int index, int value) {
            this.ensureHeroCodeListIsMutable();
            this.heroCodeList_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroCodeList(int value) {
            this.ensureHeroCodeListIsMutable();
            this.heroCodeList_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroCodeList(Iterable<? extends Integer> values) {
            this.ensureHeroCodeListIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroCodeList_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroCodeList() {
            this.heroCodeList_ = MagicBookMsg.S2C_AuthLevelUp_10608.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureAuthListIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.authList_ = new ArrayList(this.authList_);
               this.bitField0_ |= 4;
            }

         }

         public List<AuthInfo> getAuthListList() {
            return this.authListBuilder_ == null ? Collections.unmodifiableList(this.authList_) : this.authListBuilder_.getMessageList();
         }

         public int getAuthListCount() {
            return this.authListBuilder_ == null ? this.authList_.size() : this.authListBuilder_.getCount();
         }

         public AuthInfo getAuthList(int index) {
            return this.authListBuilder_ == null ? (AuthInfo)this.authList_.get(index) : (AuthInfo)this.authListBuilder_.getMessage(index);
         }

         public Builder setAuthList(int index, AuthInfo value) {
            if (this.authListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAuthListIsMutable();
               this.authList_.set(index, value);
               this.onChanged();
            } else {
               this.authListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAuthList(int index, AuthInfo.Builder builderForValue) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.authListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAuthList(AuthInfo value) {
            if (this.authListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAuthListIsMutable();
               this.authList_.add(value);
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAuthList(int index, AuthInfo value) {
            if (this.authListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAuthListIsMutable();
               this.authList_.add(index, value);
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAuthList(AuthInfo.Builder builderForValue) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAuthList(int index, AuthInfo.Builder builderForValue) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAuthList(Iterable<? extends AuthInfo> values) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.authList_);
               this.onChanged();
            } else {
               this.authListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAuthList() {
            if (this.authListBuilder_ == null) {
               this.authList_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.authListBuilder_.clear();
            }

            return this;
         }

         public Builder removeAuthList(int index) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.remove(index);
               this.onChanged();
            } else {
               this.authListBuilder_.remove(index);
            }

            return this;
         }

         public AuthInfo.Builder getAuthListBuilder(int index) {
            return (AuthInfo.Builder)this.getAuthListFieldBuilder().getBuilder(index);
         }

         public AuthInfoOrBuilder getAuthListOrBuilder(int index) {
            return this.authListBuilder_ == null ? (AuthInfoOrBuilder)this.authList_.get(index) : (AuthInfoOrBuilder)this.authListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends AuthInfoOrBuilder> getAuthListOrBuilderList() {
            return this.authListBuilder_ != null ? this.authListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.authList_);
         }

         public AuthInfo.Builder addAuthListBuilder() {
            return (AuthInfo.Builder)this.getAuthListFieldBuilder().addBuilder(MagicBookMsg.AuthInfo.getDefaultInstance());
         }

         public AuthInfo.Builder addAuthListBuilder(int index) {
            return (AuthInfo.Builder)this.getAuthListFieldBuilder().addBuilder(index, MagicBookMsg.AuthInfo.getDefaultInstance());
         }

         public List<AuthInfo.Builder> getAuthListBuilderList() {
            return this.getAuthListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<AuthInfo, AuthInfo.Builder, AuthInfoOrBuilder> getAuthListFieldBuilder() {
            if (this.authListBuilder_ == null) {
               this.authListBuilder_ = new RepeatedFieldBuilderV3(this.authList_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.authList_ = null;
            }

            return this.authListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_MagicBookLevelUp_10609 extends GeneratedMessageV3 implements C2S_MagicBookLevelUp_10609OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_MagicBookLevelUp_10609 DEFAULT_INSTANCE = new C2S_MagicBookLevelUp_10609();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MagicBookLevelUp_10609> PARSER = new AbstractParser<C2S_MagicBookLevelUp_10609>() {
         public C2S_MagicBookLevelUp_10609 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MagicBookLevelUp_10609(input, extensionRegistry);
         }
      };

      private C2S_MagicBookLevelUp_10609(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MagicBookLevelUp_10609() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MagicBookLevelUp_10609();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MagicBookLevelUp_10609(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookLevelUp_10609_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookLevelUp_10609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicBookLevelUp_10609.class, Builder.class);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_MagicBookLevelUp_10609)) {
            return super.equals(obj);
         } else {
            C2S_MagicBookLevelUp_10609 other = (C2S_MagicBookLevelUp_10609)obj;
            return this.unknownFields.equals(other.unknownFields);
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_MagicBookLevelUp_10609 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MagicBookLevelUp_10609)PARSER.parseFrom(data);
      }

      public static C2S_MagicBookLevelUp_10609 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicBookLevelUp_10609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicBookLevelUp_10609 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MagicBookLevelUp_10609)PARSER.parseFrom(data);
      }

      public static C2S_MagicBookLevelUp_10609 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicBookLevelUp_10609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicBookLevelUp_10609 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MagicBookLevelUp_10609)PARSER.parseFrom(data);
      }

      public static C2S_MagicBookLevelUp_10609 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicBookLevelUp_10609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicBookLevelUp_10609 parseFrom(InputStream input) throws IOException {
         return (C2S_MagicBookLevelUp_10609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicBookLevelUp_10609 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicBookLevelUp_10609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicBookLevelUp_10609 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MagicBookLevelUp_10609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MagicBookLevelUp_10609 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicBookLevelUp_10609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicBookLevelUp_10609 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MagicBookLevelUp_10609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicBookLevelUp_10609 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicBookLevelUp_10609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MagicBookLevelUp_10609 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MagicBookLevelUp_10609 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MagicBookLevelUp_10609> parser() {
         return PARSER;
      }

      public Parser<C2S_MagicBookLevelUp_10609> getParserForType() {
         return PARSER;
      }

      public C2S_MagicBookLevelUp_10609 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MagicBookLevelUp_10609OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookLevelUp_10609_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookLevelUp_10609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicBookLevelUp_10609.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.C2S_MagicBookLevelUp_10609.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookLevelUp_10609_descriptor;
         }

         public C2S_MagicBookLevelUp_10609 getDefaultInstanceForType() {
            return MagicBookMsg.C2S_MagicBookLevelUp_10609.getDefaultInstance();
         }

         public C2S_MagicBookLevelUp_10609 build() {
            C2S_MagicBookLevelUp_10609 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MagicBookLevelUp_10609 buildPartial() {
            C2S_MagicBookLevelUp_10609 result = new C2S_MagicBookLevelUp_10609(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_MagicBookLevelUp_10609) {
               return this.mergeFrom((C2S_MagicBookLevelUp_10609)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MagicBookLevelUp_10609 other) {
            if (other == MagicBookMsg.C2S_MagicBookLevelUp_10609.getDefaultInstance()) {
               return this;
            } else {
               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_MagicBookLevelUp_10609 parsedMessage = null;

            try {
               parsedMessage = (C2S_MagicBookLevelUp_10609)MagicBookMsg.C2S_MagicBookLevelUp_10609.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MagicBookLevelUp_10609)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_MagicBookLevelUp_10610 extends GeneratedMessageV3 implements S2C_MagicBookLevelUp_10610OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAGICBOOKID_FIELD_NUMBER = 1;
      private int magicBookId_;
      private byte memoizedIsInitialized;
      private static final S2C_MagicBookLevelUp_10610 DEFAULT_INSTANCE = new S2C_MagicBookLevelUp_10610();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MagicBookLevelUp_10610> PARSER = new AbstractParser<S2C_MagicBookLevelUp_10610>() {
         public S2C_MagicBookLevelUp_10610 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MagicBookLevelUp_10610(input, extensionRegistry);
         }
      };

      private S2C_MagicBookLevelUp_10610(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MagicBookLevelUp_10610() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MagicBookLevelUp_10610();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MagicBookLevelUp_10610(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.magicBookId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookLevelUp_10610_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookLevelUp_10610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicBookLevelUp_10610.class, Builder.class);
      }

      public boolean hasMagicBookId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMagicBookId() {
         return this.magicBookId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMagicBookId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.magicBookId_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.magicBookId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MagicBookLevelUp_10610)) {
            return super.equals(obj);
         } else {
            S2C_MagicBookLevelUp_10610 other = (S2C_MagicBookLevelUp_10610)obj;
            if (this.hasMagicBookId() != other.hasMagicBookId()) {
               return false;
            } else if (this.hasMagicBookId() && this.getMagicBookId() != other.getMagicBookId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMagicBookId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMagicBookId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MagicBookLevelUp_10610 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MagicBookLevelUp_10610)PARSER.parseFrom(data);
      }

      public static S2C_MagicBookLevelUp_10610 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicBookLevelUp_10610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicBookLevelUp_10610 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MagicBookLevelUp_10610)PARSER.parseFrom(data);
      }

      public static S2C_MagicBookLevelUp_10610 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicBookLevelUp_10610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicBookLevelUp_10610 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MagicBookLevelUp_10610)PARSER.parseFrom(data);
      }

      public static S2C_MagicBookLevelUp_10610 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicBookLevelUp_10610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicBookLevelUp_10610 parseFrom(InputStream input) throws IOException {
         return (S2C_MagicBookLevelUp_10610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicBookLevelUp_10610 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicBookLevelUp_10610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicBookLevelUp_10610 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MagicBookLevelUp_10610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MagicBookLevelUp_10610 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicBookLevelUp_10610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicBookLevelUp_10610 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MagicBookLevelUp_10610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicBookLevelUp_10610 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicBookLevelUp_10610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MagicBookLevelUp_10610 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MagicBookLevelUp_10610 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MagicBookLevelUp_10610> parser() {
         return PARSER;
      }

      public Parser<S2C_MagicBookLevelUp_10610> getParserForType() {
         return PARSER;
      }

      public S2C_MagicBookLevelUp_10610 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MagicBookLevelUp_10610OrBuilder {
         private int bitField0_;
         private int magicBookId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookLevelUp_10610_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookLevelUp_10610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicBookLevelUp_10610.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.S2C_MagicBookLevelUp_10610.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.magicBookId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookLevelUp_10610_descriptor;
         }

         public S2C_MagicBookLevelUp_10610 getDefaultInstanceForType() {
            return MagicBookMsg.S2C_MagicBookLevelUp_10610.getDefaultInstance();
         }

         public S2C_MagicBookLevelUp_10610 build() {
            S2C_MagicBookLevelUp_10610 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MagicBookLevelUp_10610 buildPartial() {
            S2C_MagicBookLevelUp_10610 result = new S2C_MagicBookLevelUp_10610(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.magicBookId_ = this.magicBookId_;
               to_bitField0_ |= 1;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_MagicBookLevelUp_10610) {
               return this.mergeFrom((S2C_MagicBookLevelUp_10610)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MagicBookLevelUp_10610 other) {
            if (other == MagicBookMsg.S2C_MagicBookLevelUp_10610.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMagicBookId()) {
                  this.setMagicBookId(other.getMagicBookId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasMagicBookId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MagicBookLevelUp_10610 parsedMessage = null;

            try {
               parsedMessage = (S2C_MagicBookLevelUp_10610)MagicBookMsg.S2C_MagicBookLevelUp_10610.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MagicBookLevelUp_10610)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMagicBookId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMagicBookId() {
            return this.magicBookId_;
         }

         public Builder setMagicBookId(int value) {
            this.bitField0_ |= 1;
            this.magicBookId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMagicBookId() {
            this.bitField0_ &= -2;
            this.magicBookId_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_MagicAuthDone_10611 extends GeneratedMessageV3 implements C2S_MagicAuthDone_10611OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_MagicAuthDone_10611 DEFAULT_INSTANCE = new C2S_MagicAuthDone_10611();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MagicAuthDone_10611> PARSER = new AbstractParser<C2S_MagicAuthDone_10611>() {
         public C2S_MagicAuthDone_10611 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MagicAuthDone_10611(input, extensionRegistry);
         }
      };

      private C2S_MagicAuthDone_10611(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MagicAuthDone_10611() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MagicAuthDone_10611();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MagicAuthDone_10611(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.position_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicAuthDone_10611_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicAuthDone_10611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicAuthDone_10611.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.position_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_MagicAuthDone_10611)) {
            return super.equals(obj);
         } else {
            C2S_MagicAuthDone_10611 other = (C2S_MagicAuthDone_10611)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_MagicAuthDone_10611 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MagicAuthDone_10611)PARSER.parseFrom(data);
      }

      public static C2S_MagicAuthDone_10611 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicAuthDone_10611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicAuthDone_10611 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MagicAuthDone_10611)PARSER.parseFrom(data);
      }

      public static C2S_MagicAuthDone_10611 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicAuthDone_10611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicAuthDone_10611 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MagicAuthDone_10611)PARSER.parseFrom(data);
      }

      public static C2S_MagicAuthDone_10611 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicAuthDone_10611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicAuthDone_10611 parseFrom(InputStream input) throws IOException {
         return (C2S_MagicAuthDone_10611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicAuthDone_10611 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicAuthDone_10611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicAuthDone_10611 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MagicAuthDone_10611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MagicAuthDone_10611 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicAuthDone_10611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicAuthDone_10611 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MagicAuthDone_10611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicAuthDone_10611 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicAuthDone_10611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MagicAuthDone_10611 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MagicAuthDone_10611 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MagicAuthDone_10611> parser() {
         return PARSER;
      }

      public Parser<C2S_MagicAuthDone_10611> getParserForType() {
         return PARSER;
      }

      public C2S_MagicAuthDone_10611 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MagicAuthDone_10611OrBuilder {
         private int bitField0_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicAuthDone_10611_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicAuthDone_10611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicAuthDone_10611.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.C2S_MagicAuthDone_10611.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicAuthDone_10611_descriptor;
         }

         public C2S_MagicAuthDone_10611 getDefaultInstanceForType() {
            return MagicBookMsg.C2S_MagicAuthDone_10611.getDefaultInstance();
         }

         public C2S_MagicAuthDone_10611 build() {
            C2S_MagicAuthDone_10611 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MagicAuthDone_10611 buildPartial() {
            C2S_MagicAuthDone_10611 result = new C2S_MagicAuthDone_10611(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.position_ = this.position_;
               to_bitField0_ |= 1;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_MagicAuthDone_10611) {
               return this.mergeFrom((C2S_MagicAuthDone_10611)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MagicAuthDone_10611 other) {
            if (other == MagicBookMsg.C2S_MagicAuthDone_10611.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPosition();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_MagicAuthDone_10611 parsedMessage = null;

            try {
               parsedMessage = (C2S_MagicAuthDone_10611)MagicBookMsg.C2S_MagicAuthDone_10611.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MagicAuthDone_10611)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPosition() {
            return this.position_;
         }

         public Builder setPosition(int value) {
            this.bitField0_ |= 1;
            this.position_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPosition() {
            this.bitField0_ &= -2;
            this.position_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_MagicAuthDone_10612 extends GeneratedMessageV3 implements S2C_MagicAuthDone_10612OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ITEMLIST_FIELD_NUMBER = 1;
      private Internal.IntList itemList_;
      public static final int AUTHLIST_FIELD_NUMBER = 2;
      private List<AuthInfo> authList_;
      private byte memoizedIsInitialized;
      private static final S2C_MagicAuthDone_10612 DEFAULT_INSTANCE = new S2C_MagicAuthDone_10612();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MagicAuthDone_10612> PARSER = new AbstractParser<S2C_MagicAuthDone_10612>() {
         public S2C_MagicAuthDone_10612 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MagicAuthDone_10612(input, extensionRegistry);
         }
      };

      private S2C_MagicAuthDone_10612(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MagicAuthDone_10612() {
         this.memoizedIsInitialized = -1;
         this.itemList_ = emptyIntList();
         this.authList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MagicAuthDone_10612();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MagicAuthDone_10612(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  int limit;
                  switch (tag) {
                     case 0:
                        done = true;
                        continue;
                     case 8:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.itemList_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.itemList_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.itemList_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.authList_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.authList_.add(input.readMessage(MagicBookMsg.AuthInfo.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.itemList_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.itemList_.makeImmutable();
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.authList_ = Collections.unmodifiableList(this.authList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicAuthDone_10612_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicAuthDone_10612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicAuthDone_10612.class, Builder.class);
      }

      public List<Integer> getItemListList() {
         return this.itemList_;
      }

      public int getItemListCount() {
         return this.itemList_.size();
      }

      public int getItemList(int index) {
         return this.itemList_.getInt(index);
      }

      public List<AuthInfo> getAuthListList() {
         return this.authList_;
      }

      public List<? extends AuthInfoOrBuilder> getAuthListOrBuilderList() {
         return this.authList_;
      }

      public int getAuthListCount() {
         return this.authList_.size();
      }

      public AuthInfo getAuthList(int index) {
         return (AuthInfo)this.authList_.get(index);
      }

      public AuthInfoOrBuilder getAuthListOrBuilder(int index) {
         return (AuthInfoOrBuilder)this.authList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getAuthListCount(); ++i) {
               if (!this.getAuthList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.itemList_.size(); ++i) {
            output.writeInt32(1, this.itemList_.getInt(i));
         }

         for(int i = 0; i < this.authList_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.authList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            int dataSize = 0;

            for(int i = 0; i < this.itemList_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.itemList_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getItemListList().size();

            for(int i = 0; i < this.authList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.authList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MagicAuthDone_10612)) {
            return super.equals(obj);
         } else {
            S2C_MagicAuthDone_10612 other = (S2C_MagicAuthDone_10612)obj;
            if (!this.getItemListList().equals(other.getItemListList())) {
               return false;
            } else if (!this.getAuthListList().equals(other.getAuthListList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getItemListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemListList().hashCode();
            }

            if (this.getAuthListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAuthListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MagicAuthDone_10612 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MagicAuthDone_10612)PARSER.parseFrom(data);
      }

      public static S2C_MagicAuthDone_10612 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicAuthDone_10612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicAuthDone_10612 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MagicAuthDone_10612)PARSER.parseFrom(data);
      }

      public static S2C_MagicAuthDone_10612 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicAuthDone_10612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicAuthDone_10612 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MagicAuthDone_10612)PARSER.parseFrom(data);
      }

      public static S2C_MagicAuthDone_10612 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicAuthDone_10612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicAuthDone_10612 parseFrom(InputStream input) throws IOException {
         return (S2C_MagicAuthDone_10612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicAuthDone_10612 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicAuthDone_10612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicAuthDone_10612 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MagicAuthDone_10612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MagicAuthDone_10612 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicAuthDone_10612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicAuthDone_10612 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MagicAuthDone_10612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicAuthDone_10612 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicAuthDone_10612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MagicAuthDone_10612 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MagicAuthDone_10612 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MagicAuthDone_10612> parser() {
         return PARSER;
      }

      public Parser<S2C_MagicAuthDone_10612> getParserForType() {
         return PARSER;
      }

      public S2C_MagicAuthDone_10612 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MagicAuthDone_10612OrBuilder {
         private int bitField0_;
         private Internal.IntList itemList_;
         private List<AuthInfo> authList_;
         private RepeatedFieldBuilderV3<AuthInfo, AuthInfo.Builder, AuthInfoOrBuilder> authListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicAuthDone_10612_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicAuthDone_10612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicAuthDone_10612.class, Builder.class);
         }

         private Builder() {
            this.itemList_ = MagicBookMsg.S2C_MagicAuthDone_10612.emptyIntList();
            this.authList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemList_ = MagicBookMsg.S2C_MagicAuthDone_10612.emptyIntList();
            this.authList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.S2C_MagicAuthDone_10612.alwaysUseFieldBuilders) {
               this.getAuthListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.itemList_ = MagicBookMsg.S2C_MagicAuthDone_10612.emptyIntList();
            this.bitField0_ &= -2;
            if (this.authListBuilder_ == null) {
               this.authList_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.authListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicAuthDone_10612_descriptor;
         }

         public S2C_MagicAuthDone_10612 getDefaultInstanceForType() {
            return MagicBookMsg.S2C_MagicAuthDone_10612.getDefaultInstance();
         }

         public S2C_MagicAuthDone_10612 build() {
            S2C_MagicAuthDone_10612 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MagicAuthDone_10612 buildPartial() {
            S2C_MagicAuthDone_10612 result = new S2C_MagicAuthDone_10612(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.itemList_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.itemList_ = this.itemList_;
            if (this.authListBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.authList_ = Collections.unmodifiableList(this.authList_);
                  this.bitField0_ &= -3;
               }

               result.authList_ = this.authList_;
            } else {
               result.authList_ = this.authListBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_MagicAuthDone_10612) {
               return this.mergeFrom((S2C_MagicAuthDone_10612)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MagicAuthDone_10612 other) {
            if (other == MagicBookMsg.S2C_MagicAuthDone_10612.getDefaultInstance()) {
               return this;
            } else {
               if (!other.itemList_.isEmpty()) {
                  if (this.itemList_.isEmpty()) {
                     this.itemList_ = other.itemList_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureItemListIsMutable();
                     this.itemList_.addAll(other.itemList_);
                  }

                  this.onChanged();
               }

               if (this.authListBuilder_ == null) {
                  if (!other.authList_.isEmpty()) {
                     if (this.authList_.isEmpty()) {
                        this.authList_ = other.authList_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureAuthListIsMutable();
                        this.authList_.addAll(other.authList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.authList_.isEmpty()) {
                  if (this.authListBuilder_.isEmpty()) {
                     this.authListBuilder_.dispose();
                     this.authListBuilder_ = null;
                     this.authList_ = other.authList_;
                     this.bitField0_ &= -3;
                     this.authListBuilder_ = MagicBookMsg.S2C_MagicAuthDone_10612.alwaysUseFieldBuilders ? this.getAuthListFieldBuilder() : null;
                  } else {
                     this.authListBuilder_.addAllMessages(other.authList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getAuthListCount(); ++i) {
               if (!this.getAuthList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MagicAuthDone_10612 parsedMessage = null;

            try {
               parsedMessage = (S2C_MagicAuthDone_10612)MagicBookMsg.S2C_MagicAuthDone_10612.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MagicAuthDone_10612)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureItemListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.itemList_ = MagicBookMsg.S2C_MagicAuthDone_10612.mutableCopy(this.itemList_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getItemListList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.itemList_) : this.itemList_);
         }

         public int getItemListCount() {
            return this.itemList_.size();
         }

         public int getItemList(int index) {
            return this.itemList_.getInt(index);
         }

         public Builder setItemList(int index, int value) {
            this.ensureItemListIsMutable();
            this.itemList_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addItemList(int value) {
            this.ensureItemListIsMutable();
            this.itemList_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllItemList(Iterable<? extends Integer> values) {
            this.ensureItemListIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.itemList_);
            this.onChanged();
            return this;
         }

         public Builder clearItemList() {
            this.itemList_ = MagicBookMsg.S2C_MagicAuthDone_10612.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         private void ensureAuthListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.authList_ = new ArrayList(this.authList_);
               this.bitField0_ |= 2;
            }

         }

         public List<AuthInfo> getAuthListList() {
            return this.authListBuilder_ == null ? Collections.unmodifiableList(this.authList_) : this.authListBuilder_.getMessageList();
         }

         public int getAuthListCount() {
            return this.authListBuilder_ == null ? this.authList_.size() : this.authListBuilder_.getCount();
         }

         public AuthInfo getAuthList(int index) {
            return this.authListBuilder_ == null ? (AuthInfo)this.authList_.get(index) : (AuthInfo)this.authListBuilder_.getMessage(index);
         }

         public Builder setAuthList(int index, AuthInfo value) {
            if (this.authListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAuthListIsMutable();
               this.authList_.set(index, value);
               this.onChanged();
            } else {
               this.authListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAuthList(int index, AuthInfo.Builder builderForValue) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.authListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAuthList(AuthInfo value) {
            if (this.authListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAuthListIsMutable();
               this.authList_.add(value);
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAuthList(int index, AuthInfo value) {
            if (this.authListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAuthListIsMutable();
               this.authList_.add(index, value);
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAuthList(AuthInfo.Builder builderForValue) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAuthList(int index, AuthInfo.Builder builderForValue) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.authListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAuthList(Iterable<? extends AuthInfo> values) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.authList_);
               this.onChanged();
            } else {
               this.authListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAuthList() {
            if (this.authListBuilder_ == null) {
               this.authList_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.authListBuilder_.clear();
            }

            return this;
         }

         public Builder removeAuthList(int index) {
            if (this.authListBuilder_ == null) {
               this.ensureAuthListIsMutable();
               this.authList_.remove(index);
               this.onChanged();
            } else {
               this.authListBuilder_.remove(index);
            }

            return this;
         }

         public AuthInfo.Builder getAuthListBuilder(int index) {
            return (AuthInfo.Builder)this.getAuthListFieldBuilder().getBuilder(index);
         }

         public AuthInfoOrBuilder getAuthListOrBuilder(int index) {
            return this.authListBuilder_ == null ? (AuthInfoOrBuilder)this.authList_.get(index) : (AuthInfoOrBuilder)this.authListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends AuthInfoOrBuilder> getAuthListOrBuilderList() {
            return this.authListBuilder_ != null ? this.authListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.authList_);
         }

         public AuthInfo.Builder addAuthListBuilder() {
            return (AuthInfo.Builder)this.getAuthListFieldBuilder().addBuilder(MagicBookMsg.AuthInfo.getDefaultInstance());
         }

         public AuthInfo.Builder addAuthListBuilder(int index) {
            return (AuthInfo.Builder)this.getAuthListFieldBuilder().addBuilder(index, MagicBookMsg.AuthInfo.getDefaultInstance());
         }

         public List<AuthInfo.Builder> getAuthListBuilderList() {
            return this.getAuthListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<AuthInfo, AuthInfo.Builder, AuthInfoOrBuilder> getAuthListFieldBuilder() {
            if (this.authListBuilder_ == null) {
               this.authListBuilder_ = new RepeatedFieldBuilderV3(this.authList_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.authList_ = null;
            }

            return this.authListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_MagicLevelUp_10613 extends GeneratedMessageV3 implements C2S_MagicLevelUp_10613OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int ITEM_FIELD_NUMBER = 2;
      private int item_;
      private byte memoizedIsInitialized;
      private static final C2S_MagicLevelUp_10613 DEFAULT_INSTANCE = new C2S_MagicLevelUp_10613();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MagicLevelUp_10613> PARSER = new AbstractParser<C2S_MagicLevelUp_10613>() {
         public C2S_MagicLevelUp_10613 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MagicLevelUp_10613(input, extensionRegistry);
         }
      };

      private C2S_MagicLevelUp_10613(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MagicLevelUp_10613() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MagicLevelUp_10613();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MagicLevelUp_10613(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.type_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.item_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicLevelUp_10613_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicLevelUp_10613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicLevelUp_10613.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasItem() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItem() {
         return this.item_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasItem()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.item_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.item_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_MagicLevelUp_10613)) {
            return super.equals(obj);
         } else {
            C2S_MagicLevelUp_10613 other = (C2S_MagicLevelUp_10613)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasItem() != other.hasItem()) {
               return false;
            } else if (this.hasItem() && this.getItem() != other.getItem()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasItem()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItem();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_MagicLevelUp_10613 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MagicLevelUp_10613)PARSER.parseFrom(data);
      }

      public static C2S_MagicLevelUp_10613 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicLevelUp_10613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicLevelUp_10613 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MagicLevelUp_10613)PARSER.parseFrom(data);
      }

      public static C2S_MagicLevelUp_10613 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicLevelUp_10613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicLevelUp_10613 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MagicLevelUp_10613)PARSER.parseFrom(data);
      }

      public static C2S_MagicLevelUp_10613 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicLevelUp_10613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicLevelUp_10613 parseFrom(InputStream input) throws IOException {
         return (C2S_MagicLevelUp_10613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicLevelUp_10613 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicLevelUp_10613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicLevelUp_10613 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MagicLevelUp_10613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MagicLevelUp_10613 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicLevelUp_10613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicLevelUp_10613 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MagicLevelUp_10613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicLevelUp_10613 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicLevelUp_10613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MagicLevelUp_10613 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MagicLevelUp_10613 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MagicLevelUp_10613> parser() {
         return PARSER;
      }

      public Parser<C2S_MagicLevelUp_10613> getParserForType() {
         return PARSER;
      }

      public C2S_MagicLevelUp_10613 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MagicLevelUp_10613OrBuilder {
         private int bitField0_;
         private int type_;
         private int item_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicLevelUp_10613_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicLevelUp_10613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicLevelUp_10613.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.C2S_MagicLevelUp_10613.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.item_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicLevelUp_10613_descriptor;
         }

         public C2S_MagicLevelUp_10613 getDefaultInstanceForType() {
            return MagicBookMsg.C2S_MagicLevelUp_10613.getDefaultInstance();
         }

         public C2S_MagicLevelUp_10613 build() {
            C2S_MagicLevelUp_10613 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MagicLevelUp_10613 buildPartial() {
            C2S_MagicLevelUp_10613 result = new C2S_MagicLevelUp_10613(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.item_ = this.item_;
               to_bitField0_ |= 2;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_MagicLevelUp_10613) {
               return this.mergeFrom((C2S_MagicLevelUp_10613)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MagicLevelUp_10613 other) {
            if (other == MagicBookMsg.C2S_MagicLevelUp_10613.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasItem()) {
                  this.setItem(other.getItem());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else {
               return this.hasItem();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_MagicLevelUp_10613 parsedMessage = null;

            try {
               parsedMessage = (C2S_MagicLevelUp_10613)MagicBookMsg.C2S_MagicLevelUp_10613.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MagicLevelUp_10613)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItem() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItem() {
            return this.item_;
         }

         public Builder setItem(int value) {
            this.bitField0_ |= 2;
            this.item_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItem() {
            this.bitField0_ &= -3;
            this.item_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_MagicLevelUp_10614 extends GeneratedMessageV3 implements S2C_MagicLevelUp_10614OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int MAGIC_FIELD_NUMBER = 2;
      private CommonMsg.MagicInfo magic_;
      private byte memoizedIsInitialized;
      private static final S2C_MagicLevelUp_10614 DEFAULT_INSTANCE = new S2C_MagicLevelUp_10614();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MagicLevelUp_10614> PARSER = new AbstractParser<S2C_MagicLevelUp_10614>() {
         public S2C_MagicLevelUp_10614 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MagicLevelUp_10614(input, extensionRegistry);
         }
      };

      private S2C_MagicLevelUp_10614(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MagicLevelUp_10614() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MagicLevelUp_10614();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MagicLevelUp_10614(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.type_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.MagicInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.magic_.toBuilder();
                        }

                        this.magic_ = (CommonMsg.MagicInfo)input.readMessage(CommonMsg.MagicInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.magic_);
                           this.magic_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicLevelUp_10614_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicLevelUp_10614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicLevelUp_10614.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasMagic() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.MagicInfo getMagic() {
         return this.magic_ == null ? CommonMsg.MagicInfo.getDefaultInstance() : this.magic_;
      }

      public CommonMsg.MagicInfoOrBuilder getMagicOrBuilder() {
         return this.magic_ == null ? CommonMsg.MagicInfo.getDefaultInstance() : this.magic_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasMagic() && !this.getMagic().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getMagic());
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getMagic());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MagicLevelUp_10614)) {
            return super.equals(obj);
         } else {
            S2C_MagicLevelUp_10614 other = (S2C_MagicLevelUp_10614)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasMagic() != other.hasMagic()) {
               return false;
            } else if (this.hasMagic() && !this.getMagic().equals(other.getMagic())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasMagic()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMagic().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MagicLevelUp_10614 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MagicLevelUp_10614)PARSER.parseFrom(data);
      }

      public static S2C_MagicLevelUp_10614 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicLevelUp_10614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicLevelUp_10614 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MagicLevelUp_10614)PARSER.parseFrom(data);
      }

      public static S2C_MagicLevelUp_10614 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicLevelUp_10614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicLevelUp_10614 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MagicLevelUp_10614)PARSER.parseFrom(data);
      }

      public static S2C_MagicLevelUp_10614 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicLevelUp_10614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicLevelUp_10614 parseFrom(InputStream input) throws IOException {
         return (S2C_MagicLevelUp_10614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicLevelUp_10614 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicLevelUp_10614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicLevelUp_10614 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MagicLevelUp_10614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MagicLevelUp_10614 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicLevelUp_10614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicLevelUp_10614 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MagicLevelUp_10614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicLevelUp_10614 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicLevelUp_10614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MagicLevelUp_10614 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MagicLevelUp_10614 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MagicLevelUp_10614> parser() {
         return PARSER;
      }

      public Parser<S2C_MagicLevelUp_10614> getParserForType() {
         return PARSER;
      }

      public S2C_MagicLevelUp_10614 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MagicLevelUp_10614OrBuilder {
         private int bitField0_;
         private int type_;
         private CommonMsg.MagicInfo magic_;
         private SingleFieldBuilderV3<CommonMsg.MagicInfo, CommonMsg.MagicInfo.Builder, CommonMsg.MagicInfoOrBuilder> magicBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicLevelUp_10614_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicLevelUp_10614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicLevelUp_10614.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.S2C_MagicLevelUp_10614.alwaysUseFieldBuilders) {
               this.getMagicFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            if (this.magicBuilder_ == null) {
               this.magic_ = null;
            } else {
               this.magicBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicLevelUp_10614_descriptor;
         }

         public S2C_MagicLevelUp_10614 getDefaultInstanceForType() {
            return MagicBookMsg.S2C_MagicLevelUp_10614.getDefaultInstance();
         }

         public S2C_MagicLevelUp_10614 build() {
            S2C_MagicLevelUp_10614 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MagicLevelUp_10614 buildPartial() {
            S2C_MagicLevelUp_10614 result = new S2C_MagicLevelUp_10614(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.magicBuilder_ == null) {
                  result.magic_ = this.magic_;
               } else {
                  result.magic_ = (CommonMsg.MagicInfo)this.magicBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_MagicLevelUp_10614) {
               return this.mergeFrom((S2C_MagicLevelUp_10614)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MagicLevelUp_10614 other) {
            if (other == MagicBookMsg.S2C_MagicLevelUp_10614.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasMagic()) {
                  this.mergeMagic(other.getMagic());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else {
               return !this.hasMagic() || this.getMagic().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MagicLevelUp_10614 parsedMessage = null;

            try {
               parsedMessage = (S2C_MagicLevelUp_10614)MagicBookMsg.S2C_MagicLevelUp_10614.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MagicLevelUp_10614)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMagic() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.MagicInfo getMagic() {
            if (this.magicBuilder_ == null) {
               return this.magic_ == null ? CommonMsg.MagicInfo.getDefaultInstance() : this.magic_;
            } else {
               return (CommonMsg.MagicInfo)this.magicBuilder_.getMessage();
            }
         }

         public Builder setMagic(CommonMsg.MagicInfo value) {
            if (this.magicBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.magic_ = value;
               this.onChanged();
            } else {
               this.magicBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setMagic(CommonMsg.MagicInfo.Builder builderForValue) {
            if (this.magicBuilder_ == null) {
               this.magic_ = builderForValue.build();
               this.onChanged();
            } else {
               this.magicBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeMagic(CommonMsg.MagicInfo value) {
            if (this.magicBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.magic_ != null && this.magic_ != CommonMsg.MagicInfo.getDefaultInstance()) {
                  this.magic_ = CommonMsg.MagicInfo.newBuilder(this.magic_).mergeFrom(value).buildPartial();
               } else {
                  this.magic_ = value;
               }

               this.onChanged();
            } else {
               this.magicBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearMagic() {
            if (this.magicBuilder_ == null) {
               this.magic_ = null;
               this.onChanged();
            } else {
               this.magicBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.MagicInfo.Builder getMagicBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.MagicInfo.Builder)this.getMagicFieldBuilder().getBuilder();
         }

         public CommonMsg.MagicInfoOrBuilder getMagicOrBuilder() {
            if (this.magicBuilder_ != null) {
               return (CommonMsg.MagicInfoOrBuilder)this.magicBuilder_.getMessageOrBuilder();
            } else {
               return this.magic_ == null ? CommonMsg.MagicInfo.getDefaultInstance() : this.magic_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.MagicInfo, CommonMsg.MagicInfo.Builder, CommonMsg.MagicInfoOrBuilder> getMagicFieldBuilder() {
            if (this.magicBuilder_ == null) {
               this.magicBuilder_ = new SingleFieldBuilderV3(this.getMagic(), this.getParentForChildren(), this.isClean());
               this.magic_ = null;
            }

            return this.magicBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_MagicDisCompose_10615 extends GeneratedMessageV3 implements C2S_MagicDisCompose_10615OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private int itemCode_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_MagicDisCompose_10615 DEFAULT_INSTANCE = new C2S_MagicDisCompose_10615();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MagicDisCompose_10615> PARSER = new AbstractParser<C2S_MagicDisCompose_10615>() {
         public C2S_MagicDisCompose_10615 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MagicDisCompose_10615(input, extensionRegistry);
         }
      };

      private C2S_MagicDisCompose_10615(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MagicDisCompose_10615() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MagicDisCompose_10615();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MagicDisCompose_10615(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.itemCode_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.num_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicDisCompose_10615_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicDisCompose_10615_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicDisCompose_10615.class, Builder.class);
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasItemCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.itemCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.num_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.itemCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_MagicDisCompose_10615)) {
            return super.equals(obj);
         } else {
            C2S_MagicDisCompose_10615 other = (C2S_MagicDisCompose_10615)obj;
            if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasItemCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_MagicDisCompose_10615 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MagicDisCompose_10615)PARSER.parseFrom(data);
      }

      public static C2S_MagicDisCompose_10615 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicDisCompose_10615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicDisCompose_10615 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MagicDisCompose_10615)PARSER.parseFrom(data);
      }

      public static C2S_MagicDisCompose_10615 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicDisCompose_10615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicDisCompose_10615 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MagicDisCompose_10615)PARSER.parseFrom(data);
      }

      public static C2S_MagicDisCompose_10615 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicDisCompose_10615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicDisCompose_10615 parseFrom(InputStream input) throws IOException {
         return (C2S_MagicDisCompose_10615)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicDisCompose_10615 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicDisCompose_10615)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicDisCompose_10615 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MagicDisCompose_10615)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MagicDisCompose_10615 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicDisCompose_10615)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicDisCompose_10615 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MagicDisCompose_10615)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicDisCompose_10615 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicDisCompose_10615)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MagicDisCompose_10615 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MagicDisCompose_10615 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MagicDisCompose_10615> parser() {
         return PARSER;
      }

      public Parser<C2S_MagicDisCompose_10615> getParserForType() {
         return PARSER;
      }

      public C2S_MagicDisCompose_10615 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MagicDisCompose_10615OrBuilder {
         private int bitField0_;
         private int itemCode_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicDisCompose_10615_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicDisCompose_10615_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicDisCompose_10615.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.C2S_MagicDisCompose_10615.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicDisCompose_10615_descriptor;
         }

         public C2S_MagicDisCompose_10615 getDefaultInstanceForType() {
            return MagicBookMsg.C2S_MagicDisCompose_10615.getDefaultInstance();
         }

         public C2S_MagicDisCompose_10615 build() {
            C2S_MagicDisCompose_10615 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MagicDisCompose_10615 buildPartial() {
            C2S_MagicDisCompose_10615 result = new C2S_MagicDisCompose_10615(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 2;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_MagicDisCompose_10615) {
               return this.mergeFrom((C2S_MagicDisCompose_10615)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MagicDisCompose_10615 other) {
            if (other == MagicBookMsg.C2S_MagicDisCompose_10615.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasItemCode()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_MagicDisCompose_10615 parsedMessage = null;

            try {
               parsedMessage = (C2S_MagicDisCompose_10615)MagicBookMsg.C2S_MagicDisCompose_10615.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MagicDisCompose_10615)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 1;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 2;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -3;
            this.num_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_MagicDisCompose_10616 extends GeneratedMessageV3 implements S2C_MagicDisCompose_10616OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_MagicDisCompose_10616 DEFAULT_INSTANCE = new S2C_MagicDisCompose_10616();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MagicDisCompose_10616> PARSER = new AbstractParser<S2C_MagicDisCompose_10616>() {
         public S2C_MagicDisCompose_10616 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MagicDisCompose_10616(input, extensionRegistry);
         }
      };

      private S2C_MagicDisCompose_10616(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MagicDisCompose_10616() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MagicDisCompose_10616();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MagicDisCompose_10616(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicDisCompose_10616_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicDisCompose_10616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicDisCompose_10616.class, Builder.class);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MagicDisCompose_10616)) {
            return super.equals(obj);
         } else {
            S2C_MagicDisCompose_10616 other = (S2C_MagicDisCompose_10616)obj;
            return this.unknownFields.equals(other.unknownFields);
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MagicDisCompose_10616 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MagicDisCompose_10616)PARSER.parseFrom(data);
      }

      public static S2C_MagicDisCompose_10616 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicDisCompose_10616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicDisCompose_10616 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MagicDisCompose_10616)PARSER.parseFrom(data);
      }

      public static S2C_MagicDisCompose_10616 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicDisCompose_10616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicDisCompose_10616 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MagicDisCompose_10616)PARSER.parseFrom(data);
      }

      public static S2C_MagicDisCompose_10616 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicDisCompose_10616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicDisCompose_10616 parseFrom(InputStream input) throws IOException {
         return (S2C_MagicDisCompose_10616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicDisCompose_10616 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicDisCompose_10616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicDisCompose_10616 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MagicDisCompose_10616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MagicDisCompose_10616 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicDisCompose_10616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicDisCompose_10616 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MagicDisCompose_10616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicDisCompose_10616 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicDisCompose_10616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MagicDisCompose_10616 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MagicDisCompose_10616 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MagicDisCompose_10616> parser() {
         return PARSER;
      }

      public Parser<S2C_MagicDisCompose_10616> getParserForType() {
         return PARSER;
      }

      public S2C_MagicDisCompose_10616 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MagicDisCompose_10616OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicDisCompose_10616_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicDisCompose_10616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicDisCompose_10616.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.S2C_MagicDisCompose_10616.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicDisCompose_10616_descriptor;
         }

         public S2C_MagicDisCompose_10616 getDefaultInstanceForType() {
            return MagicBookMsg.S2C_MagicDisCompose_10616.getDefaultInstance();
         }

         public S2C_MagicDisCompose_10616 build() {
            S2C_MagicDisCompose_10616 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MagicDisCompose_10616 buildPartial() {
            S2C_MagicDisCompose_10616 result = new S2C_MagicDisCompose_10616(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_MagicDisCompose_10616) {
               return this.mergeFrom((S2C_MagicDisCompose_10616)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MagicDisCompose_10616 other) {
            if (other == MagicBookMsg.S2C_MagicDisCompose_10616.getDefaultInstance()) {
               return this;
            } else {
               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MagicDisCompose_10616 parsedMessage = null;

            try {
               parsedMessage = (S2C_MagicDisCompose_10616)MagicBookMsg.S2C_MagicDisCompose_10616.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MagicDisCompose_10616)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_MagicSkillUp_10617 extends GeneratedMessageV3 implements C2S_MagicSkillUp_10617OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MAGICS_FIELD_NUMBER = 1;
      private List<CommonMsg.MagicInfo> magics_;
      private byte memoizedIsInitialized;
      private static final C2S_MagicSkillUp_10617 DEFAULT_INSTANCE = new C2S_MagicSkillUp_10617();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MagicSkillUp_10617> PARSER = new AbstractParser<C2S_MagicSkillUp_10617>() {
         public C2S_MagicSkillUp_10617 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MagicSkillUp_10617(input, extensionRegistry);
         }
      };

      private C2S_MagicSkillUp_10617(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MagicSkillUp_10617() {
         this.memoizedIsInitialized = -1;
         this.magics_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MagicSkillUp_10617();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MagicSkillUp_10617(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.magics_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.magics_.add(input.readMessage(CommonMsg.MagicInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.magics_ = Collections.unmodifiableList(this.magics_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicSkillUp_10617_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicSkillUp_10617_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicSkillUp_10617.class, Builder.class);
      }

      public List<CommonMsg.MagicInfo> getMagicsList() {
         return this.magics_;
      }

      public List<? extends CommonMsg.MagicInfoOrBuilder> getMagicsOrBuilderList() {
         return this.magics_;
      }

      public int getMagicsCount() {
         return this.magics_.size();
      }

      public CommonMsg.MagicInfo getMagics(int index) {
         return (CommonMsg.MagicInfo)this.magics_.get(index);
      }

      public CommonMsg.MagicInfoOrBuilder getMagicsOrBuilder(int index) {
         return (CommonMsg.MagicInfoOrBuilder)this.magics_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getMagicsCount(); ++i) {
               if (!this.getMagics(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.magics_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.magics_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.magics_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.magics_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_MagicSkillUp_10617)) {
            return super.equals(obj);
         } else {
            C2S_MagicSkillUp_10617 other = (C2S_MagicSkillUp_10617)obj;
            if (!this.getMagicsList().equals(other.getMagicsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getMagicsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMagicsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_MagicSkillUp_10617 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MagicSkillUp_10617)PARSER.parseFrom(data);
      }

      public static C2S_MagicSkillUp_10617 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicSkillUp_10617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicSkillUp_10617 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MagicSkillUp_10617)PARSER.parseFrom(data);
      }

      public static C2S_MagicSkillUp_10617 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicSkillUp_10617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicSkillUp_10617 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MagicSkillUp_10617)PARSER.parseFrom(data);
      }

      public static C2S_MagicSkillUp_10617 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicSkillUp_10617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicSkillUp_10617 parseFrom(InputStream input) throws IOException {
         return (C2S_MagicSkillUp_10617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicSkillUp_10617 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicSkillUp_10617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicSkillUp_10617 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MagicSkillUp_10617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MagicSkillUp_10617 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicSkillUp_10617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicSkillUp_10617 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MagicSkillUp_10617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicSkillUp_10617 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicSkillUp_10617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MagicSkillUp_10617 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MagicSkillUp_10617 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MagicSkillUp_10617> parser() {
         return PARSER;
      }

      public Parser<C2S_MagicSkillUp_10617> getParserForType() {
         return PARSER;
      }

      public C2S_MagicSkillUp_10617 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MagicSkillUp_10617OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MagicInfo> magics_;
         private RepeatedFieldBuilderV3<CommonMsg.MagicInfo, CommonMsg.MagicInfo.Builder, CommonMsg.MagicInfoOrBuilder> magicsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicSkillUp_10617_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicSkillUp_10617_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicSkillUp_10617.class, Builder.class);
         }

         private Builder() {
            this.magics_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.magics_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.C2S_MagicSkillUp_10617.alwaysUseFieldBuilders) {
               this.getMagicsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.magicsBuilder_ == null) {
               this.magics_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.magicsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicSkillUp_10617_descriptor;
         }

         public C2S_MagicSkillUp_10617 getDefaultInstanceForType() {
            return MagicBookMsg.C2S_MagicSkillUp_10617.getDefaultInstance();
         }

         public C2S_MagicSkillUp_10617 build() {
            C2S_MagicSkillUp_10617 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MagicSkillUp_10617 buildPartial() {
            C2S_MagicSkillUp_10617 result = new C2S_MagicSkillUp_10617(this);
            int from_bitField0_ = this.bitField0_;
            if (this.magicsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.magics_ = Collections.unmodifiableList(this.magics_);
                  this.bitField0_ &= -2;
               }

               result.magics_ = this.magics_;
            } else {
               result.magics_ = this.magicsBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_MagicSkillUp_10617) {
               return this.mergeFrom((C2S_MagicSkillUp_10617)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MagicSkillUp_10617 other) {
            if (other == MagicBookMsg.C2S_MagicSkillUp_10617.getDefaultInstance()) {
               return this;
            } else {
               if (this.magicsBuilder_ == null) {
                  if (!other.magics_.isEmpty()) {
                     if (this.magics_.isEmpty()) {
                        this.magics_ = other.magics_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureMagicsIsMutable();
                        this.magics_.addAll(other.magics_);
                     }

                     this.onChanged();
                  }
               } else if (!other.magics_.isEmpty()) {
                  if (this.magicsBuilder_.isEmpty()) {
                     this.magicsBuilder_.dispose();
                     this.magicsBuilder_ = null;
                     this.magics_ = other.magics_;
                     this.bitField0_ &= -2;
                     this.magicsBuilder_ = MagicBookMsg.C2S_MagicSkillUp_10617.alwaysUseFieldBuilders ? this.getMagicsFieldBuilder() : null;
                  } else {
                     this.magicsBuilder_.addAllMessages(other.magics_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getMagicsCount(); ++i) {
               if (!this.getMagics(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_MagicSkillUp_10617 parsedMessage = null;

            try {
               parsedMessage = (C2S_MagicSkillUp_10617)MagicBookMsg.C2S_MagicSkillUp_10617.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MagicSkillUp_10617)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureMagicsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.magics_ = new ArrayList(this.magics_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MagicInfo> getMagicsList() {
            return this.magicsBuilder_ == null ? Collections.unmodifiableList(this.magics_) : this.magicsBuilder_.getMessageList();
         }

         public int getMagicsCount() {
            return this.magicsBuilder_ == null ? this.magics_.size() : this.magicsBuilder_.getCount();
         }

         public CommonMsg.MagicInfo getMagics(int index) {
            return this.magicsBuilder_ == null ? (CommonMsg.MagicInfo)this.magics_.get(index) : (CommonMsg.MagicInfo)this.magicsBuilder_.getMessage(index);
         }

         public Builder setMagics(int index, CommonMsg.MagicInfo value) {
            if (this.magicsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMagicsIsMutable();
               this.magics_.set(index, value);
               this.onChanged();
            } else {
               this.magicsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMagics(int index, CommonMsg.MagicInfo.Builder builderForValue) {
            if (this.magicsBuilder_ == null) {
               this.ensureMagicsIsMutable();
               this.magics_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.magicsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMagics(CommonMsg.MagicInfo value) {
            if (this.magicsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMagicsIsMutable();
               this.magics_.add(value);
               this.onChanged();
            } else {
               this.magicsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMagics(int index, CommonMsg.MagicInfo value) {
            if (this.magicsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMagicsIsMutable();
               this.magics_.add(index, value);
               this.onChanged();
            } else {
               this.magicsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMagics(CommonMsg.MagicInfo.Builder builderForValue) {
            if (this.magicsBuilder_ == null) {
               this.ensureMagicsIsMutable();
               this.magics_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.magicsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMagics(int index, CommonMsg.MagicInfo.Builder builderForValue) {
            if (this.magicsBuilder_ == null) {
               this.ensureMagicsIsMutable();
               this.magics_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.magicsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMagics(Iterable<? extends CommonMsg.MagicInfo> values) {
            if (this.magicsBuilder_ == null) {
               this.ensureMagicsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.magics_);
               this.onChanged();
            } else {
               this.magicsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMagics() {
            if (this.magicsBuilder_ == null) {
               this.magics_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.magicsBuilder_.clear();
            }

            return this;
         }

         public Builder removeMagics(int index) {
            if (this.magicsBuilder_ == null) {
               this.ensureMagicsIsMutable();
               this.magics_.remove(index);
               this.onChanged();
            } else {
               this.magicsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MagicInfo.Builder getMagicsBuilder(int index) {
            return (CommonMsg.MagicInfo.Builder)this.getMagicsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MagicInfoOrBuilder getMagicsOrBuilder(int index) {
            return this.magicsBuilder_ == null ? (CommonMsg.MagicInfoOrBuilder)this.magics_.get(index) : (CommonMsg.MagicInfoOrBuilder)this.magicsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MagicInfoOrBuilder> getMagicsOrBuilderList() {
            return this.magicsBuilder_ != null ? this.magicsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.magics_);
         }

         public CommonMsg.MagicInfo.Builder addMagicsBuilder() {
            return (CommonMsg.MagicInfo.Builder)this.getMagicsFieldBuilder().addBuilder(CommonMsg.MagicInfo.getDefaultInstance());
         }

         public CommonMsg.MagicInfo.Builder addMagicsBuilder(int index) {
            return (CommonMsg.MagicInfo.Builder)this.getMagicsFieldBuilder().addBuilder(index, CommonMsg.MagicInfo.getDefaultInstance());
         }

         public List<CommonMsg.MagicInfo.Builder> getMagicsBuilderList() {
            return this.getMagicsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MagicInfo, CommonMsg.MagicInfo.Builder, CommonMsg.MagicInfoOrBuilder> getMagicsFieldBuilder() {
            if (this.magicsBuilder_ == null) {
               this.magicsBuilder_ = new RepeatedFieldBuilderV3(this.magics_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.magics_ = null;
            }

            return this.magicsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_MagicSkillUp_10618 extends GeneratedMessageV3 implements S2C_MagicSkillUp_10618OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MAGICS_FIELD_NUMBER = 1;
      private List<CommonMsg.MagicInfo> magics_;
      private byte memoizedIsInitialized;
      private static final S2C_MagicSkillUp_10618 DEFAULT_INSTANCE = new S2C_MagicSkillUp_10618();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MagicSkillUp_10618> PARSER = new AbstractParser<S2C_MagicSkillUp_10618>() {
         public S2C_MagicSkillUp_10618 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MagicSkillUp_10618(input, extensionRegistry);
         }
      };

      private S2C_MagicSkillUp_10618(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MagicSkillUp_10618() {
         this.memoizedIsInitialized = -1;
         this.magics_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MagicSkillUp_10618();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MagicSkillUp_10618(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.magics_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.magics_.add(input.readMessage(CommonMsg.MagicInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.magics_ = Collections.unmodifiableList(this.magics_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicSkillUp_10618_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicSkillUp_10618_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicSkillUp_10618.class, Builder.class);
      }

      public List<CommonMsg.MagicInfo> getMagicsList() {
         return this.magics_;
      }

      public List<? extends CommonMsg.MagicInfoOrBuilder> getMagicsOrBuilderList() {
         return this.magics_;
      }

      public int getMagicsCount() {
         return this.magics_.size();
      }

      public CommonMsg.MagicInfo getMagics(int index) {
         return (CommonMsg.MagicInfo)this.magics_.get(index);
      }

      public CommonMsg.MagicInfoOrBuilder getMagicsOrBuilder(int index) {
         return (CommonMsg.MagicInfoOrBuilder)this.magics_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getMagicsCount(); ++i) {
               if (!this.getMagics(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.magics_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.magics_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.magics_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.magics_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MagicSkillUp_10618)) {
            return super.equals(obj);
         } else {
            S2C_MagicSkillUp_10618 other = (S2C_MagicSkillUp_10618)obj;
            if (!this.getMagicsList().equals(other.getMagicsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getMagicsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMagicsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MagicSkillUp_10618 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MagicSkillUp_10618)PARSER.parseFrom(data);
      }

      public static S2C_MagicSkillUp_10618 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicSkillUp_10618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicSkillUp_10618 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MagicSkillUp_10618)PARSER.parseFrom(data);
      }

      public static S2C_MagicSkillUp_10618 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicSkillUp_10618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicSkillUp_10618 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MagicSkillUp_10618)PARSER.parseFrom(data);
      }

      public static S2C_MagicSkillUp_10618 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicSkillUp_10618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicSkillUp_10618 parseFrom(InputStream input) throws IOException {
         return (S2C_MagicSkillUp_10618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicSkillUp_10618 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicSkillUp_10618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicSkillUp_10618 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MagicSkillUp_10618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MagicSkillUp_10618 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicSkillUp_10618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicSkillUp_10618 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MagicSkillUp_10618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicSkillUp_10618 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicSkillUp_10618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MagicSkillUp_10618 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MagicSkillUp_10618 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MagicSkillUp_10618> parser() {
         return PARSER;
      }

      public Parser<S2C_MagicSkillUp_10618> getParserForType() {
         return PARSER;
      }

      public S2C_MagicSkillUp_10618 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MagicSkillUp_10618OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MagicInfo> magics_;
         private RepeatedFieldBuilderV3<CommonMsg.MagicInfo, CommonMsg.MagicInfo.Builder, CommonMsg.MagicInfoOrBuilder> magicsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicSkillUp_10618_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicSkillUp_10618_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicSkillUp_10618.class, Builder.class);
         }

         private Builder() {
            this.magics_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.magics_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.S2C_MagicSkillUp_10618.alwaysUseFieldBuilders) {
               this.getMagicsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.magicsBuilder_ == null) {
               this.magics_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.magicsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicSkillUp_10618_descriptor;
         }

         public S2C_MagicSkillUp_10618 getDefaultInstanceForType() {
            return MagicBookMsg.S2C_MagicSkillUp_10618.getDefaultInstance();
         }

         public S2C_MagicSkillUp_10618 build() {
            S2C_MagicSkillUp_10618 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MagicSkillUp_10618 buildPartial() {
            S2C_MagicSkillUp_10618 result = new S2C_MagicSkillUp_10618(this);
            int from_bitField0_ = this.bitField0_;
            if (this.magicsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.magics_ = Collections.unmodifiableList(this.magics_);
                  this.bitField0_ &= -2;
               }

               result.magics_ = this.magics_;
            } else {
               result.magics_ = this.magicsBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_MagicSkillUp_10618) {
               return this.mergeFrom((S2C_MagicSkillUp_10618)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MagicSkillUp_10618 other) {
            if (other == MagicBookMsg.S2C_MagicSkillUp_10618.getDefaultInstance()) {
               return this;
            } else {
               if (this.magicsBuilder_ == null) {
                  if (!other.magics_.isEmpty()) {
                     if (this.magics_.isEmpty()) {
                        this.magics_ = other.magics_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureMagicsIsMutable();
                        this.magics_.addAll(other.magics_);
                     }

                     this.onChanged();
                  }
               } else if (!other.magics_.isEmpty()) {
                  if (this.magicsBuilder_.isEmpty()) {
                     this.magicsBuilder_.dispose();
                     this.magicsBuilder_ = null;
                     this.magics_ = other.magics_;
                     this.bitField0_ &= -2;
                     this.magicsBuilder_ = MagicBookMsg.S2C_MagicSkillUp_10618.alwaysUseFieldBuilders ? this.getMagicsFieldBuilder() : null;
                  } else {
                     this.magicsBuilder_.addAllMessages(other.magics_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getMagicsCount(); ++i) {
               if (!this.getMagics(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MagicSkillUp_10618 parsedMessage = null;

            try {
               parsedMessage = (S2C_MagicSkillUp_10618)MagicBookMsg.S2C_MagicSkillUp_10618.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MagicSkillUp_10618)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureMagicsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.magics_ = new ArrayList(this.magics_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MagicInfo> getMagicsList() {
            return this.magicsBuilder_ == null ? Collections.unmodifiableList(this.magics_) : this.magicsBuilder_.getMessageList();
         }

         public int getMagicsCount() {
            return this.magicsBuilder_ == null ? this.magics_.size() : this.magicsBuilder_.getCount();
         }

         public CommonMsg.MagicInfo getMagics(int index) {
            return this.magicsBuilder_ == null ? (CommonMsg.MagicInfo)this.magics_.get(index) : (CommonMsg.MagicInfo)this.magicsBuilder_.getMessage(index);
         }

         public Builder setMagics(int index, CommonMsg.MagicInfo value) {
            if (this.magicsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMagicsIsMutable();
               this.magics_.set(index, value);
               this.onChanged();
            } else {
               this.magicsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMagics(int index, CommonMsg.MagicInfo.Builder builderForValue) {
            if (this.magicsBuilder_ == null) {
               this.ensureMagicsIsMutable();
               this.magics_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.magicsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMagics(CommonMsg.MagicInfo value) {
            if (this.magicsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMagicsIsMutable();
               this.magics_.add(value);
               this.onChanged();
            } else {
               this.magicsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMagics(int index, CommonMsg.MagicInfo value) {
            if (this.magicsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMagicsIsMutable();
               this.magics_.add(index, value);
               this.onChanged();
            } else {
               this.magicsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMagics(CommonMsg.MagicInfo.Builder builderForValue) {
            if (this.magicsBuilder_ == null) {
               this.ensureMagicsIsMutable();
               this.magics_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.magicsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMagics(int index, CommonMsg.MagicInfo.Builder builderForValue) {
            if (this.magicsBuilder_ == null) {
               this.ensureMagicsIsMutable();
               this.magics_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.magicsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMagics(Iterable<? extends CommonMsg.MagicInfo> values) {
            if (this.magicsBuilder_ == null) {
               this.ensureMagicsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.magics_);
               this.onChanged();
            } else {
               this.magicsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMagics() {
            if (this.magicsBuilder_ == null) {
               this.magics_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.magicsBuilder_.clear();
            }

            return this;
         }

         public Builder removeMagics(int index) {
            if (this.magicsBuilder_ == null) {
               this.ensureMagicsIsMutable();
               this.magics_.remove(index);
               this.onChanged();
            } else {
               this.magicsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MagicInfo.Builder getMagicsBuilder(int index) {
            return (CommonMsg.MagicInfo.Builder)this.getMagicsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MagicInfoOrBuilder getMagicsOrBuilder(int index) {
            return this.magicsBuilder_ == null ? (CommonMsg.MagicInfoOrBuilder)this.magics_.get(index) : (CommonMsg.MagicInfoOrBuilder)this.magicsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MagicInfoOrBuilder> getMagicsOrBuilderList() {
            return this.magicsBuilder_ != null ? this.magicsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.magics_);
         }

         public CommonMsg.MagicInfo.Builder addMagicsBuilder() {
            return (CommonMsg.MagicInfo.Builder)this.getMagicsFieldBuilder().addBuilder(CommonMsg.MagicInfo.getDefaultInstance());
         }

         public CommonMsg.MagicInfo.Builder addMagicsBuilder(int index) {
            return (CommonMsg.MagicInfo.Builder)this.getMagicsFieldBuilder().addBuilder(index, CommonMsg.MagicInfo.getDefaultInstance());
         }

         public List<CommonMsg.MagicInfo.Builder> getMagicsBuilderList() {
            return this.getMagicsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MagicInfo, CommonMsg.MagicInfo.Builder, CommonMsg.MagicInfoOrBuilder> getMagicsFieldBuilder() {
            if (this.magicsBuilder_ == null) {
               this.magicsBuilder_ = new RepeatedFieldBuilderV3(this.magics_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.magics_ = null;
            }

            return this.magicsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_MagicOriginalBuy_10619 extends GeneratedMessageV3 implements C2S_MagicOriginalBuy_10619OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ORIGINAL_FIELD_NUMBER = 1;
      private OriginalBuyInfo original_;
      private byte memoizedIsInitialized;
      private static final C2S_MagicOriginalBuy_10619 DEFAULT_INSTANCE = new C2S_MagicOriginalBuy_10619();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MagicOriginalBuy_10619> PARSER = new AbstractParser<C2S_MagicOriginalBuy_10619>() {
         public C2S_MagicOriginalBuy_10619 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MagicOriginalBuy_10619(input, extensionRegistry);
         }
      };

      private C2S_MagicOriginalBuy_10619(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MagicOriginalBuy_10619() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MagicOriginalBuy_10619();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MagicOriginalBuy_10619(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        OriginalBuyInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.original_.toBuilder();
                        }

                        this.original_ = (OriginalBuyInfo)input.readMessage(MagicBookMsg.OriginalBuyInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.original_);
                           this.original_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicOriginalBuy_10619_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicOriginalBuy_10619_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicOriginalBuy_10619.class, Builder.class);
      }

      public boolean hasOriginal() {
         return (this.bitField0_ & 1) != 0;
      }

      public OriginalBuyInfo getOriginal() {
         return this.original_ == null ? MagicBookMsg.OriginalBuyInfo.getDefaultInstance() : this.original_;
      }

      public OriginalBuyInfoOrBuilder getOriginalOrBuilder() {
         return this.original_ == null ? MagicBookMsg.OriginalBuyInfo.getDefaultInstance() : this.original_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOriginal()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getOriginal().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getOriginal());
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeMessageSize(1, this.getOriginal());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_MagicOriginalBuy_10619)) {
            return super.equals(obj);
         } else {
            C2S_MagicOriginalBuy_10619 other = (C2S_MagicOriginalBuy_10619)obj;
            if (this.hasOriginal() != other.hasOriginal()) {
               return false;
            } else if (this.hasOriginal() && !this.getOriginal().equals(other.getOriginal())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasOriginal()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOriginal().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_MagicOriginalBuy_10619 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MagicOriginalBuy_10619)PARSER.parseFrom(data);
      }

      public static C2S_MagicOriginalBuy_10619 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicOriginalBuy_10619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicOriginalBuy_10619 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MagicOriginalBuy_10619)PARSER.parseFrom(data);
      }

      public static C2S_MagicOriginalBuy_10619 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicOriginalBuy_10619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicOriginalBuy_10619 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MagicOriginalBuy_10619)PARSER.parseFrom(data);
      }

      public static C2S_MagicOriginalBuy_10619 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicOriginalBuy_10619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicOriginalBuy_10619 parseFrom(InputStream input) throws IOException {
         return (C2S_MagicOriginalBuy_10619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicOriginalBuy_10619 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicOriginalBuy_10619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicOriginalBuy_10619 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MagicOriginalBuy_10619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MagicOriginalBuy_10619 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicOriginalBuy_10619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicOriginalBuy_10619 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MagicOriginalBuy_10619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicOriginalBuy_10619 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicOriginalBuy_10619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MagicOriginalBuy_10619 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MagicOriginalBuy_10619 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MagicOriginalBuy_10619> parser() {
         return PARSER;
      }

      public Parser<C2S_MagicOriginalBuy_10619> getParserForType() {
         return PARSER;
      }

      public C2S_MagicOriginalBuy_10619 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MagicOriginalBuy_10619OrBuilder {
         private int bitField0_;
         private OriginalBuyInfo original_;
         private SingleFieldBuilderV3<OriginalBuyInfo, OriginalBuyInfo.Builder, OriginalBuyInfoOrBuilder> originalBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicOriginalBuy_10619_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicOriginalBuy_10619_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicOriginalBuy_10619.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.C2S_MagicOriginalBuy_10619.alwaysUseFieldBuilders) {
               this.getOriginalFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.originalBuilder_ == null) {
               this.original_ = null;
            } else {
               this.originalBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicOriginalBuy_10619_descriptor;
         }

         public C2S_MagicOriginalBuy_10619 getDefaultInstanceForType() {
            return MagicBookMsg.C2S_MagicOriginalBuy_10619.getDefaultInstance();
         }

         public C2S_MagicOriginalBuy_10619 build() {
            C2S_MagicOriginalBuy_10619 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MagicOriginalBuy_10619 buildPartial() {
            C2S_MagicOriginalBuy_10619 result = new C2S_MagicOriginalBuy_10619(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.originalBuilder_ == null) {
                  result.original_ = this.original_;
               } else {
                  result.original_ = (OriginalBuyInfo)this.originalBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_MagicOriginalBuy_10619) {
               return this.mergeFrom((C2S_MagicOriginalBuy_10619)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MagicOriginalBuy_10619 other) {
            if (other == MagicBookMsg.C2S_MagicOriginalBuy_10619.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOriginal()) {
                  this.mergeOriginal(other.getOriginal());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOriginal()) {
               return false;
            } else {
               return this.getOriginal().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_MagicOriginalBuy_10619 parsedMessage = null;

            try {
               parsedMessage = (C2S_MagicOriginalBuy_10619)MagicBookMsg.C2S_MagicOriginalBuy_10619.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MagicOriginalBuy_10619)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOriginal() {
            return (this.bitField0_ & 1) != 0;
         }

         public OriginalBuyInfo getOriginal() {
            if (this.originalBuilder_ == null) {
               return this.original_ == null ? MagicBookMsg.OriginalBuyInfo.getDefaultInstance() : this.original_;
            } else {
               return (OriginalBuyInfo)this.originalBuilder_.getMessage();
            }
         }

         public Builder setOriginal(OriginalBuyInfo value) {
            if (this.originalBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.original_ = value;
               this.onChanged();
            } else {
               this.originalBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setOriginal(OriginalBuyInfo.Builder builderForValue) {
            if (this.originalBuilder_ == null) {
               this.original_ = builderForValue.build();
               this.onChanged();
            } else {
               this.originalBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeOriginal(OriginalBuyInfo value) {
            if (this.originalBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.original_ != null && this.original_ != MagicBookMsg.OriginalBuyInfo.getDefaultInstance()) {
                  this.original_ = MagicBookMsg.OriginalBuyInfo.newBuilder(this.original_).mergeFrom(value).buildPartial();
               } else {
                  this.original_ = value;
               }

               this.onChanged();
            } else {
               this.originalBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearOriginal() {
            if (this.originalBuilder_ == null) {
               this.original_ = null;
               this.onChanged();
            } else {
               this.originalBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public OriginalBuyInfo.Builder getOriginalBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (OriginalBuyInfo.Builder)this.getOriginalFieldBuilder().getBuilder();
         }

         public OriginalBuyInfoOrBuilder getOriginalOrBuilder() {
            if (this.originalBuilder_ != null) {
               return (OriginalBuyInfoOrBuilder)this.originalBuilder_.getMessageOrBuilder();
            } else {
               return this.original_ == null ? MagicBookMsg.OriginalBuyInfo.getDefaultInstance() : this.original_;
            }
         }

         private SingleFieldBuilderV3<OriginalBuyInfo, OriginalBuyInfo.Builder, OriginalBuyInfoOrBuilder> getOriginalFieldBuilder() {
            if (this.originalBuilder_ == null) {
               this.originalBuilder_ = new SingleFieldBuilderV3(this.getOriginal(), this.getParentForChildren(), this.isClean());
               this.original_ = null;
            }

            return this.originalBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_MagicOriginalBuy_10620 extends GeneratedMessageV3 implements S2C_MagicOriginalBuy_10620OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ORIGINALS_FIELD_NUMBER = 1;
      private List<OriginalBuyInfo> originals_;
      private byte memoizedIsInitialized;
      private static final S2C_MagicOriginalBuy_10620 DEFAULT_INSTANCE = new S2C_MagicOriginalBuy_10620();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MagicOriginalBuy_10620> PARSER = new AbstractParser<S2C_MagicOriginalBuy_10620>() {
         public S2C_MagicOriginalBuy_10620 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MagicOriginalBuy_10620(input, extensionRegistry);
         }
      };

      private S2C_MagicOriginalBuy_10620(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MagicOriginalBuy_10620() {
         this.memoizedIsInitialized = -1;
         this.originals_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MagicOriginalBuy_10620();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MagicOriginalBuy_10620(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.originals_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.originals_.add(input.readMessage(MagicBookMsg.OriginalBuyInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.originals_ = Collections.unmodifiableList(this.originals_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicOriginalBuy_10620_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicOriginalBuy_10620_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicOriginalBuy_10620.class, Builder.class);
      }

      public List<OriginalBuyInfo> getOriginalsList() {
         return this.originals_;
      }

      public List<? extends OriginalBuyInfoOrBuilder> getOriginalsOrBuilderList() {
         return this.originals_;
      }

      public int getOriginalsCount() {
         return this.originals_.size();
      }

      public OriginalBuyInfo getOriginals(int index) {
         return (OriginalBuyInfo)this.originals_.get(index);
      }

      public OriginalBuyInfoOrBuilder getOriginalsOrBuilder(int index) {
         return (OriginalBuyInfoOrBuilder)this.originals_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getOriginalsCount(); ++i) {
               if (!this.getOriginals(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.originals_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.originals_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.originals_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.originals_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MagicOriginalBuy_10620)) {
            return super.equals(obj);
         } else {
            S2C_MagicOriginalBuy_10620 other = (S2C_MagicOriginalBuy_10620)obj;
            if (!this.getOriginalsList().equals(other.getOriginalsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getOriginalsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOriginalsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MagicOriginalBuy_10620 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MagicOriginalBuy_10620)PARSER.parseFrom(data);
      }

      public static S2C_MagicOriginalBuy_10620 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicOriginalBuy_10620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicOriginalBuy_10620 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MagicOriginalBuy_10620)PARSER.parseFrom(data);
      }

      public static S2C_MagicOriginalBuy_10620 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicOriginalBuy_10620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicOriginalBuy_10620 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MagicOriginalBuy_10620)PARSER.parseFrom(data);
      }

      public static S2C_MagicOriginalBuy_10620 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicOriginalBuy_10620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicOriginalBuy_10620 parseFrom(InputStream input) throws IOException {
         return (S2C_MagicOriginalBuy_10620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicOriginalBuy_10620 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicOriginalBuy_10620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicOriginalBuy_10620 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MagicOriginalBuy_10620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MagicOriginalBuy_10620 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicOriginalBuy_10620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicOriginalBuy_10620 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MagicOriginalBuy_10620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicOriginalBuy_10620 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicOriginalBuy_10620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MagicOriginalBuy_10620 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MagicOriginalBuy_10620 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MagicOriginalBuy_10620> parser() {
         return PARSER;
      }

      public Parser<S2C_MagicOriginalBuy_10620> getParserForType() {
         return PARSER;
      }

      public S2C_MagicOriginalBuy_10620 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MagicOriginalBuy_10620OrBuilder {
         private int bitField0_;
         private List<OriginalBuyInfo> originals_;
         private RepeatedFieldBuilderV3<OriginalBuyInfo, OriginalBuyInfo.Builder, OriginalBuyInfoOrBuilder> originalsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicOriginalBuy_10620_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicOriginalBuy_10620_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicOriginalBuy_10620.class, Builder.class);
         }

         private Builder() {
            this.originals_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.originals_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.S2C_MagicOriginalBuy_10620.alwaysUseFieldBuilders) {
               this.getOriginalsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.originalsBuilder_ == null) {
               this.originals_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.originalsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicOriginalBuy_10620_descriptor;
         }

         public S2C_MagicOriginalBuy_10620 getDefaultInstanceForType() {
            return MagicBookMsg.S2C_MagicOriginalBuy_10620.getDefaultInstance();
         }

         public S2C_MagicOriginalBuy_10620 build() {
            S2C_MagicOriginalBuy_10620 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MagicOriginalBuy_10620 buildPartial() {
            S2C_MagicOriginalBuy_10620 result = new S2C_MagicOriginalBuy_10620(this);
            int from_bitField0_ = this.bitField0_;
            if (this.originalsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.originals_ = Collections.unmodifiableList(this.originals_);
                  this.bitField0_ &= -2;
               }

               result.originals_ = this.originals_;
            } else {
               result.originals_ = this.originalsBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_MagicOriginalBuy_10620) {
               return this.mergeFrom((S2C_MagicOriginalBuy_10620)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MagicOriginalBuy_10620 other) {
            if (other == MagicBookMsg.S2C_MagicOriginalBuy_10620.getDefaultInstance()) {
               return this;
            } else {
               if (this.originalsBuilder_ == null) {
                  if (!other.originals_.isEmpty()) {
                     if (this.originals_.isEmpty()) {
                        this.originals_ = other.originals_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureOriginalsIsMutable();
                        this.originals_.addAll(other.originals_);
                     }

                     this.onChanged();
                  }
               } else if (!other.originals_.isEmpty()) {
                  if (this.originalsBuilder_.isEmpty()) {
                     this.originalsBuilder_.dispose();
                     this.originalsBuilder_ = null;
                     this.originals_ = other.originals_;
                     this.bitField0_ &= -2;
                     this.originalsBuilder_ = MagicBookMsg.S2C_MagicOriginalBuy_10620.alwaysUseFieldBuilders ? this.getOriginalsFieldBuilder() : null;
                  } else {
                     this.originalsBuilder_.addAllMessages(other.originals_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getOriginalsCount(); ++i) {
               if (!this.getOriginals(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MagicOriginalBuy_10620 parsedMessage = null;

            try {
               parsedMessage = (S2C_MagicOriginalBuy_10620)MagicBookMsg.S2C_MagicOriginalBuy_10620.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MagicOriginalBuy_10620)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureOriginalsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.originals_ = new ArrayList(this.originals_);
               this.bitField0_ |= 1;
            }

         }

         public List<OriginalBuyInfo> getOriginalsList() {
            return this.originalsBuilder_ == null ? Collections.unmodifiableList(this.originals_) : this.originalsBuilder_.getMessageList();
         }

         public int getOriginalsCount() {
            return this.originalsBuilder_ == null ? this.originals_.size() : this.originalsBuilder_.getCount();
         }

         public OriginalBuyInfo getOriginals(int index) {
            return this.originalsBuilder_ == null ? (OriginalBuyInfo)this.originals_.get(index) : (OriginalBuyInfo)this.originalsBuilder_.getMessage(index);
         }

         public Builder setOriginals(int index, OriginalBuyInfo value) {
            if (this.originalsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOriginalsIsMutable();
               this.originals_.set(index, value);
               this.onChanged();
            } else {
               this.originalsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setOriginals(int index, OriginalBuyInfo.Builder builderForValue) {
            if (this.originalsBuilder_ == null) {
               this.ensureOriginalsIsMutable();
               this.originals_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.originalsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addOriginals(OriginalBuyInfo value) {
            if (this.originalsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOriginalsIsMutable();
               this.originals_.add(value);
               this.onChanged();
            } else {
               this.originalsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addOriginals(int index, OriginalBuyInfo value) {
            if (this.originalsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOriginalsIsMutable();
               this.originals_.add(index, value);
               this.onChanged();
            } else {
               this.originalsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addOriginals(OriginalBuyInfo.Builder builderForValue) {
            if (this.originalsBuilder_ == null) {
               this.ensureOriginalsIsMutable();
               this.originals_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.originalsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addOriginals(int index, OriginalBuyInfo.Builder builderForValue) {
            if (this.originalsBuilder_ == null) {
               this.ensureOriginalsIsMutable();
               this.originals_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.originalsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllOriginals(Iterable<? extends OriginalBuyInfo> values) {
            if (this.originalsBuilder_ == null) {
               this.ensureOriginalsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.originals_);
               this.onChanged();
            } else {
               this.originalsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearOriginals() {
            if (this.originalsBuilder_ == null) {
               this.originals_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.originalsBuilder_.clear();
            }

            return this;
         }

         public Builder removeOriginals(int index) {
            if (this.originalsBuilder_ == null) {
               this.ensureOriginalsIsMutable();
               this.originals_.remove(index);
               this.onChanged();
            } else {
               this.originalsBuilder_.remove(index);
            }

            return this;
         }

         public OriginalBuyInfo.Builder getOriginalsBuilder(int index) {
            return (OriginalBuyInfo.Builder)this.getOriginalsFieldBuilder().getBuilder(index);
         }

         public OriginalBuyInfoOrBuilder getOriginalsOrBuilder(int index) {
            return this.originalsBuilder_ == null ? (OriginalBuyInfoOrBuilder)this.originals_.get(index) : (OriginalBuyInfoOrBuilder)this.originalsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends OriginalBuyInfoOrBuilder> getOriginalsOrBuilderList() {
            return this.originalsBuilder_ != null ? this.originalsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.originals_);
         }

         public OriginalBuyInfo.Builder addOriginalsBuilder() {
            return (OriginalBuyInfo.Builder)this.getOriginalsFieldBuilder().addBuilder(MagicBookMsg.OriginalBuyInfo.getDefaultInstance());
         }

         public OriginalBuyInfo.Builder addOriginalsBuilder(int index) {
            return (OriginalBuyInfo.Builder)this.getOriginalsFieldBuilder().addBuilder(index, MagicBookMsg.OriginalBuyInfo.getDefaultInstance());
         }

         public List<OriginalBuyInfo.Builder> getOriginalsBuilderList() {
            return this.getOriginalsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<OriginalBuyInfo, OriginalBuyInfo.Builder, OriginalBuyInfoOrBuilder> getOriginalsFieldBuilder() {
            if (this.originalsBuilder_ == null) {
               this.originalsBuilder_ = new RepeatedFieldBuilderV3(this.originals_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.originals_ = null;
            }

            return this.originalsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TaskList_10621 extends GeneratedMessageV3 implements C2S_TaskList_10621OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TaskList_10621 DEFAULT_INSTANCE = new C2S_TaskList_10621();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TaskList_10621> PARSER = new AbstractParser<C2S_TaskList_10621>() {
         public C2S_TaskList_10621 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TaskList_10621(input, extensionRegistry);
         }
      };

      private C2S_TaskList_10621(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TaskList_10621() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TaskList_10621();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TaskList_10621(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_TaskList_10621_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_TaskList_10621_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskList_10621.class, Builder.class);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TaskList_10621)) {
            return super.equals(obj);
         } else {
            C2S_TaskList_10621 other = (C2S_TaskList_10621)obj;
            return this.unknownFields.equals(other.unknownFields);
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TaskList_10621 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TaskList_10621)PARSER.parseFrom(data);
      }

      public static C2S_TaskList_10621 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskList_10621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskList_10621 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TaskList_10621)PARSER.parseFrom(data);
      }

      public static C2S_TaskList_10621 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskList_10621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskList_10621 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TaskList_10621)PARSER.parseFrom(data);
      }

      public static C2S_TaskList_10621 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskList_10621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskList_10621 parseFrom(InputStream input) throws IOException {
         return (C2S_TaskList_10621)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskList_10621 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskList_10621)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskList_10621 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TaskList_10621)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TaskList_10621 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskList_10621)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskList_10621 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TaskList_10621)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskList_10621 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskList_10621)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TaskList_10621 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TaskList_10621 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TaskList_10621> parser() {
         return PARSER;
      }

      public Parser<C2S_TaskList_10621> getParserForType() {
         return PARSER;
      }

      public C2S_TaskList_10621 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TaskList_10621OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_TaskList_10621_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_TaskList_10621_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskList_10621.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.C2S_TaskList_10621.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_TaskList_10621_descriptor;
         }

         public C2S_TaskList_10621 getDefaultInstanceForType() {
            return MagicBookMsg.C2S_TaskList_10621.getDefaultInstance();
         }

         public C2S_TaskList_10621 build() {
            C2S_TaskList_10621 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TaskList_10621 buildPartial() {
            C2S_TaskList_10621 result = new C2S_TaskList_10621(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TaskList_10621) {
               return this.mergeFrom((C2S_TaskList_10621)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TaskList_10621 other) {
            if (other == MagicBookMsg.C2S_TaskList_10621.getDefaultInstance()) {
               return this;
            } else {
               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TaskList_10621 parsedMessage = null;

            try {
               parsedMessage = (C2S_TaskList_10621)MagicBookMsg.C2S_TaskList_10621.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TaskList_10621)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_TaskList_10622 extends GeneratedMessageV3 implements S2C_TaskList_10622OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKS_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> tasks_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskList_10622 DEFAULT_INSTANCE = new S2C_TaskList_10622();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskList_10622> PARSER = new AbstractParser<S2C_TaskList_10622>() {
         public S2C_TaskList_10622 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskList_10622(input, extensionRegistry);
         }
      };

      private S2C_TaskList_10622(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskList_10622() {
         this.memoizedIsInitialized = -1;
         this.tasks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskList_10622();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskList_10622(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.tasks_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.tasks_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_TaskList_10622_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_TaskList_10622_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskList_10622.class, Builder.class);
      }

      public List<CommonMsg.Task> getTasksList() {
         return this.tasks_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList() {
         return this.tasks_;
      }

      public int getTasksCount() {
         return this.tasks_.size();
      }

      public CommonMsg.Task getTasks(int index) {
         return (CommonMsg.Task)this.tasks_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTasksOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.tasks_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTasksCount(); ++i) {
               if (!this.getTasks(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.tasks_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.tasks_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.tasks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.tasks_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TaskList_10622)) {
            return super.equals(obj);
         } else {
            S2C_TaskList_10622 other = (S2C_TaskList_10622)obj;
            if (!this.getTasksList().equals(other.getTasksList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getTasksCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTasksList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TaskList_10622 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskList_10622)PARSER.parseFrom(data);
      }

      public static S2C_TaskList_10622 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskList_10622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskList_10622 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskList_10622)PARSER.parseFrom(data);
      }

      public static S2C_TaskList_10622 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskList_10622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskList_10622 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskList_10622)PARSER.parseFrom(data);
      }

      public static S2C_TaskList_10622 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskList_10622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskList_10622 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskList_10622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskList_10622 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskList_10622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskList_10622 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskList_10622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskList_10622 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskList_10622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskList_10622 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskList_10622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskList_10622 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskList_10622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskList_10622 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskList_10622 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskList_10622> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskList_10622> getParserForType() {
         return PARSER;
      }

      public S2C_TaskList_10622 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskList_10622OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> tasks_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> tasksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_TaskList_10622_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_TaskList_10622_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskList_10622.class, Builder.class);
         }

         private Builder() {
            this.tasks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.tasks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.S2C_TaskList_10622.alwaysUseFieldBuilders) {
               this.getTasksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_TaskList_10622_descriptor;
         }

         public S2C_TaskList_10622 getDefaultInstanceForType() {
            return MagicBookMsg.S2C_TaskList_10622.getDefaultInstance();
         }

         public S2C_TaskList_10622 build() {
            S2C_TaskList_10622 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskList_10622 buildPartial() {
            S2C_TaskList_10622 result = new S2C_TaskList_10622(this);
            int from_bitField0_ = this.bitField0_;
            if (this.tasksBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
                  this.bitField0_ &= -2;
               }

               result.tasks_ = this.tasks_;
            } else {
               result.tasks_ = this.tasksBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_TaskList_10622) {
               return this.mergeFrom((S2C_TaskList_10622)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskList_10622 other) {
            if (other == MagicBookMsg.S2C_TaskList_10622.getDefaultInstance()) {
               return this;
            } else {
               if (this.tasksBuilder_ == null) {
                  if (!other.tasks_.isEmpty()) {
                     if (this.tasks_.isEmpty()) {
                        this.tasks_ = other.tasks_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTasksIsMutable();
                        this.tasks_.addAll(other.tasks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.tasks_.isEmpty()) {
                  if (this.tasksBuilder_.isEmpty()) {
                     this.tasksBuilder_.dispose();
                     this.tasksBuilder_ = null;
                     this.tasks_ = other.tasks_;
                     this.bitField0_ &= -2;
                     this.tasksBuilder_ = MagicBookMsg.S2C_TaskList_10622.alwaysUseFieldBuilders ? this.getTasksFieldBuilder() : null;
                  } else {
                     this.tasksBuilder_.addAllMessages(other.tasks_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTasksCount(); ++i) {
               if (!this.getTasks(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TaskList_10622 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskList_10622)MagicBookMsg.S2C_TaskList_10622.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskList_10622)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTasksIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.tasks_ = new ArrayList(this.tasks_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.Task> getTasksList() {
            return this.tasksBuilder_ == null ? Collections.unmodifiableList(this.tasks_) : this.tasksBuilder_.getMessageList();
         }

         public int getTasksCount() {
            return this.tasksBuilder_ == null ? this.tasks_.size() : this.tasksBuilder_.getCount();
         }

         public CommonMsg.Task getTasks(int index) {
            return this.tasksBuilder_ == null ? (CommonMsg.Task)this.tasks_.get(index) : (CommonMsg.Task)this.tasksBuilder_.getMessage(index);
         }

         public Builder setTasks(int index, CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.set(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTasks(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTasks(int index, CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTasks(CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTasks(Iterable<? extends CommonMsg.Task> values) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tasks_);
               this.onChanged();
            } else {
               this.tasksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTasks() {
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Builder removeTasks(int index) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.remove(index);
               this.onChanged();
            } else {
               this.tasksBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTasksBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTasksOrBuilder(int index) {
            return this.tasksBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.tasks_.get(index) : (CommonMsg.TaskOrBuilder)this.tasksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList() {
            return this.tasksBuilder_ != null ? this.tasksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.tasks_);
         }

         public CommonMsg.Task.Builder addTasksBuilder() {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTasksBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTasksBuilderList() {
            return this.getTasksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTasksFieldBuilder() {
            if (this.tasksBuilder_ == null) {
               this.tasksBuilder_ = new RepeatedFieldBuilderV3(this.tasks_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.tasks_ = null;
            }

            return this.tasksBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_CommitTask_10623 extends GeneratedMessageV3 implements C2S_CommitTask_10623OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_CommitTask_10623 DEFAULT_INSTANCE = new C2S_CommitTask_10623();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CommitTask_10623> PARSER = new AbstractParser<C2S_CommitTask_10623>() {
         public C2S_CommitTask_10623 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CommitTask_10623(input, extensionRegistry);
         }
      };

      private C2S_CommitTask_10623(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CommitTask_10623() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CommitTask_10623();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CommitTask_10623(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.taskId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_CommitTask_10623_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_CommitTask_10623_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_10623.class, Builder.class);
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTaskId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.taskId_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.taskId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CommitTask_10623)) {
            return super.equals(obj);
         } else {
            C2S_CommitTask_10623 other = (C2S_CommitTask_10623)obj;
            if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasTaskId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CommitTask_10623 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_10623)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_10623 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_10623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_10623 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_10623)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_10623 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_10623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_10623 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_10623)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_10623 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_10623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_10623 parseFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_10623)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_10623 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_10623)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_10623 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_10623)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_10623 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_10623)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_10623 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CommitTask_10623)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_10623 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_10623)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CommitTask_10623 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CommitTask_10623 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CommitTask_10623> parser() {
         return PARSER;
      }

      public Parser<C2S_CommitTask_10623> getParserForType() {
         return PARSER;
      }

      public C2S_CommitTask_10623 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CommitTask_10623OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_CommitTask_10623_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_CommitTask_10623_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_10623.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.C2S_CommitTask_10623.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_CommitTask_10623_descriptor;
         }

         public C2S_CommitTask_10623 getDefaultInstanceForType() {
            return MagicBookMsg.C2S_CommitTask_10623.getDefaultInstance();
         }

         public C2S_CommitTask_10623 build() {
            C2S_CommitTask_10623 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CommitTask_10623 buildPartial() {
            C2S_CommitTask_10623 result = new C2S_CommitTask_10623(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskId_ = this.taskId_;
               to_bitField0_ |= 1;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_CommitTask_10623) {
               return this.mergeFrom((C2S_CommitTask_10623)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CommitTask_10623 other) {
            if (other == MagicBookMsg.C2S_CommitTask_10623.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTaskId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CommitTask_10623 parsedMessage = null;

            try {
               parsedMessage = (C2S_CommitTask_10623)MagicBookMsg.C2S_CommitTask_10623.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CommitTask_10623)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTaskId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTaskId() {
            return this.taskId_;
         }

         public Builder setTaskId(int value) {
            this.bitField0_ |= 1;
            this.taskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.bitField0_ &= -2;
            this.taskId_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_CommitTaskResult_10624 extends GeneratedMessageV3 implements S2C_CommitTaskResult_10624OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      public static final int ISACTIVE_FIELD_NUMBER = 2;
      private boolean isActive_;
      private byte memoizedIsInitialized;
      private static final S2C_CommitTaskResult_10624 DEFAULT_INSTANCE = new S2C_CommitTaskResult_10624();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommitTaskResult_10624> PARSER = new AbstractParser<S2C_CommitTaskResult_10624>() {
         public S2C_CommitTaskResult_10624 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommitTaskResult_10624(input, extensionRegistry);
         }
      };

      private S2C_CommitTaskResult_10624(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommitTaskResult_10624() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommitTaskResult_10624();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommitTaskResult_10624(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.taskId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.isActive_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_CommitTaskResult_10624_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_CommitTaskResult_10624_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTaskResult_10624.class, Builder.class);
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public boolean hasIsActive() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsActive() {
         return this.isActive_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTaskId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsActive()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.taskId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isActive_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.taskId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isActive_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CommitTaskResult_10624)) {
            return super.equals(obj);
         } else {
            S2C_CommitTaskResult_10624 other = (S2C_CommitTaskResult_10624)obj;
            if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
               return false;
            } else if (this.hasIsActive() != other.hasIsActive()) {
               return false;
            } else if (this.hasIsActive() && this.getIsActive() != other.getIsActive()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasTaskId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskId();
            }

            if (this.hasIsActive()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsActive());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CommitTaskResult_10624 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommitTaskResult_10624)PARSER.parseFrom(data);
      }

      public static S2C_CommitTaskResult_10624 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTaskResult_10624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTaskResult_10624 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommitTaskResult_10624)PARSER.parseFrom(data);
      }

      public static S2C_CommitTaskResult_10624 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTaskResult_10624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTaskResult_10624 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommitTaskResult_10624)PARSER.parseFrom(data);
      }

      public static S2C_CommitTaskResult_10624 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTaskResult_10624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTaskResult_10624 parseFrom(InputStream input) throws IOException {
         return (S2C_CommitTaskResult_10624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTaskResult_10624 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTaskResult_10624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTaskResult_10624 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommitTaskResult_10624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommitTaskResult_10624 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTaskResult_10624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTaskResult_10624 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommitTaskResult_10624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTaskResult_10624 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTaskResult_10624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommitTaskResult_10624 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommitTaskResult_10624 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommitTaskResult_10624> parser() {
         return PARSER;
      }

      public Parser<S2C_CommitTaskResult_10624> getParserForType() {
         return PARSER;
      }

      public S2C_CommitTaskResult_10624 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommitTaskResult_10624OrBuilder {
         private int bitField0_;
         private int taskId_;
         private boolean isActive_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_CommitTaskResult_10624_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_CommitTaskResult_10624_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTaskResult_10624.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.S2C_CommitTaskResult_10624.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            this.isActive_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_CommitTaskResult_10624_descriptor;
         }

         public S2C_CommitTaskResult_10624 getDefaultInstanceForType() {
            return MagicBookMsg.S2C_CommitTaskResult_10624.getDefaultInstance();
         }

         public S2C_CommitTaskResult_10624 build() {
            S2C_CommitTaskResult_10624 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommitTaskResult_10624 buildPartial() {
            S2C_CommitTaskResult_10624 result = new S2C_CommitTaskResult_10624(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskId_ = this.taskId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isActive_ = this.isActive_;
               to_bitField0_ |= 2;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_CommitTaskResult_10624) {
               return this.mergeFrom((S2C_CommitTaskResult_10624)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommitTaskResult_10624 other) {
            if (other == MagicBookMsg.S2C_CommitTaskResult_10624.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               if (other.hasIsActive()) {
                  this.setIsActive(other.getIsActive());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTaskId()) {
               return false;
            } else {
               return this.hasIsActive();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CommitTaskResult_10624 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommitTaskResult_10624)MagicBookMsg.S2C_CommitTaskResult_10624.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommitTaskResult_10624)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTaskId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTaskId() {
            return this.taskId_;
         }

         public Builder setTaskId(int value) {
            this.bitField0_ |= 1;
            this.taskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.bitField0_ &= -2;
            this.taskId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsActive() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsActive() {
            return this.isActive_;
         }

         public Builder setIsActive(boolean value) {
            this.bitField0_ |= 2;
            this.isActive_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsActive() {
            this.bitField0_ &= -3;
            this.isActive_ = false;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_PowerChange_10626 extends GeneratedMessageV3 implements S2C_PowerChange_10626OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POWER_FIELD_NUMBER = 1;
      private long power_;
      private byte memoizedIsInitialized;
      private static final S2C_PowerChange_10626 DEFAULT_INSTANCE = new S2C_PowerChange_10626();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PowerChange_10626> PARSER = new AbstractParser<S2C_PowerChange_10626>() {
         public S2C_PowerChange_10626 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PowerChange_10626(input, extensionRegistry);
         }
      };

      private S2C_PowerChange_10626(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PowerChange_10626() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PowerChange_10626();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PowerChange_10626(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.power_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_PowerChange_10626_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_PowerChange_10626_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PowerChange_10626.class, Builder.class);
      }

      public boolean hasPower() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(1, this.power_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt64Size(1, this.power_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PowerChange_10626)) {
            return super.equals(obj);
         } else {
            S2C_PowerChange_10626 other = (S2C_PowerChange_10626)obj;
            if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPower()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PowerChange_10626 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PowerChange_10626)PARSER.parseFrom(data);
      }

      public static S2C_PowerChange_10626 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PowerChange_10626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PowerChange_10626 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PowerChange_10626)PARSER.parseFrom(data);
      }

      public static S2C_PowerChange_10626 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PowerChange_10626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PowerChange_10626 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PowerChange_10626)PARSER.parseFrom(data);
      }

      public static S2C_PowerChange_10626 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PowerChange_10626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PowerChange_10626 parseFrom(InputStream input) throws IOException {
         return (S2C_PowerChange_10626)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PowerChange_10626 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PowerChange_10626)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PowerChange_10626 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PowerChange_10626)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PowerChange_10626 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PowerChange_10626)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PowerChange_10626 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PowerChange_10626)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PowerChange_10626 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PowerChange_10626)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PowerChange_10626 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PowerChange_10626 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PowerChange_10626> parser() {
         return PARSER;
      }

      public Parser<S2C_PowerChange_10626> getParserForType() {
         return PARSER;
      }

      public S2C_PowerChange_10626 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PowerChange_10626OrBuilder {
         private int bitField0_;
         private long power_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_PowerChange_10626_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_PowerChange_10626_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PowerChange_10626.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.S2C_PowerChange_10626.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.power_ = 0L;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_PowerChange_10626_descriptor;
         }

         public S2C_PowerChange_10626 getDefaultInstanceForType() {
            return MagicBookMsg.S2C_PowerChange_10626.getDefaultInstance();
         }

         public S2C_PowerChange_10626 build() {
            S2C_PowerChange_10626 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PowerChange_10626 buildPartial() {
            S2C_PowerChange_10626 result = new S2C_PowerChange_10626(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 1;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_PowerChange_10626) {
               return this.mergeFrom((S2C_PowerChange_10626)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PowerChange_10626 other) {
            if (other == MagicBookMsg.S2C_PowerChange_10626.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPower();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PowerChange_10626 parsedMessage = null;

            try {
               parsedMessage = (S2C_PowerChange_10626)MagicBookMsg.S2C_PowerChange_10626.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PowerChange_10626)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPower() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 1;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -2;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class MagicDisComposeInfo extends GeneratedMessageV3 implements MagicDisComposeInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private int itemCode_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final MagicDisComposeInfo DEFAULT_INSTANCE = new MagicDisComposeInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<MagicDisComposeInfo> PARSER = new AbstractParser<MagicDisComposeInfo>() {
         public MagicDisComposeInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MagicDisComposeInfo(input, extensionRegistry);
         }
      };

      private MagicDisComposeInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private MagicDisComposeInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new MagicDisComposeInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private MagicDisComposeInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.itemCode_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.num_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_MagicDisComposeInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_MagicDisComposeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MagicDisComposeInfo.class, Builder.class);
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasItemCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.itemCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.num_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.itemCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MagicDisComposeInfo)) {
            return super.equals(obj);
         } else {
            MagicDisComposeInfo other = (MagicDisComposeInfo)obj;
            if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasItemCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MagicDisComposeInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MagicDisComposeInfo)PARSER.parseFrom(data);
      }

      public static MagicDisComposeInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MagicDisComposeInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MagicDisComposeInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MagicDisComposeInfo)PARSER.parseFrom(data);
      }

      public static MagicDisComposeInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MagicDisComposeInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MagicDisComposeInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MagicDisComposeInfo)PARSER.parseFrom(data);
      }

      public static MagicDisComposeInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MagicDisComposeInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MagicDisComposeInfo parseFrom(InputStream input) throws IOException {
         return (MagicDisComposeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MagicDisComposeInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MagicDisComposeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MagicDisComposeInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (MagicDisComposeInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MagicDisComposeInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MagicDisComposeInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MagicDisComposeInfo parseFrom(CodedInputStream input) throws IOException {
         return (MagicDisComposeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MagicDisComposeInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MagicDisComposeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(MagicDisComposeInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static MagicDisComposeInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MagicDisComposeInfo> parser() {
         return PARSER;
      }

      public Parser<MagicDisComposeInfo> getParserForType() {
         return PARSER;
      }

      public MagicDisComposeInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MagicDisComposeInfoOrBuilder {
         private int bitField0_;
         private int itemCode_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_MagicDisComposeInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_MagicDisComposeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MagicDisComposeInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.MagicDisComposeInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_MagicDisComposeInfo_descriptor;
         }

         public MagicDisComposeInfo getDefaultInstanceForType() {
            return MagicBookMsg.MagicDisComposeInfo.getDefaultInstance();
         }

         public MagicDisComposeInfo build() {
            MagicDisComposeInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MagicDisComposeInfo buildPartial() {
            MagicDisComposeInfo result = new MagicDisComposeInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 2;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof MagicDisComposeInfo) {
               return this.mergeFrom((MagicDisComposeInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(MagicDisComposeInfo other) {
            if (other == MagicBookMsg.MagicDisComposeInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasItemCode()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MagicDisComposeInfo parsedMessage = null;

            try {
               parsedMessage = (MagicDisComposeInfo)MagicBookMsg.MagicDisComposeInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (MagicDisComposeInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 1;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 2;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -3;
            this.num_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_BatchMagicDisCompose_10627 extends GeneratedMessageV3 implements C2S_BatchMagicDisCompose_10627OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MAGICDISCOMPOSELIST_FIELD_NUMBER = 1;
      private List<MagicDisComposeInfo> magicDisComposeList_;
      private byte memoizedIsInitialized;
      private static final C2S_BatchMagicDisCompose_10627 DEFAULT_INSTANCE = new C2S_BatchMagicDisCompose_10627();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BatchMagicDisCompose_10627> PARSER = new AbstractParser<C2S_BatchMagicDisCompose_10627>() {
         public C2S_BatchMagicDisCompose_10627 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BatchMagicDisCompose_10627(input, extensionRegistry);
         }
      };

      private C2S_BatchMagicDisCompose_10627(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BatchMagicDisCompose_10627() {
         this.memoizedIsInitialized = -1;
         this.magicDisComposeList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BatchMagicDisCompose_10627();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BatchMagicDisCompose_10627(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.magicDisComposeList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.magicDisComposeList_.add(input.readMessage(MagicBookMsg.MagicDisComposeInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.magicDisComposeList_ = Collections.unmodifiableList(this.magicDisComposeList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_BatchMagicDisCompose_10627_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_BatchMagicDisCompose_10627_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BatchMagicDisCompose_10627.class, Builder.class);
      }

      public List<MagicDisComposeInfo> getMagicDisComposeListList() {
         return this.magicDisComposeList_;
      }

      public List<? extends MagicDisComposeInfoOrBuilder> getMagicDisComposeListOrBuilderList() {
         return this.magicDisComposeList_;
      }

      public int getMagicDisComposeListCount() {
         return this.magicDisComposeList_.size();
      }

      public MagicDisComposeInfo getMagicDisComposeList(int index) {
         return (MagicDisComposeInfo)this.magicDisComposeList_.get(index);
      }

      public MagicDisComposeInfoOrBuilder getMagicDisComposeListOrBuilder(int index) {
         return (MagicDisComposeInfoOrBuilder)this.magicDisComposeList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getMagicDisComposeListCount(); ++i) {
               if (!this.getMagicDisComposeList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.magicDisComposeList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.magicDisComposeList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.magicDisComposeList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.magicDisComposeList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BatchMagicDisCompose_10627)) {
            return super.equals(obj);
         } else {
            C2S_BatchMagicDisCompose_10627 other = (C2S_BatchMagicDisCompose_10627)obj;
            if (!this.getMagicDisComposeListList().equals(other.getMagicDisComposeListList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getMagicDisComposeListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMagicDisComposeListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BatchMagicDisCompose_10627 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BatchMagicDisCompose_10627)PARSER.parseFrom(data);
      }

      public static C2S_BatchMagicDisCompose_10627 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BatchMagicDisCompose_10627)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BatchMagicDisCompose_10627 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BatchMagicDisCompose_10627)PARSER.parseFrom(data);
      }

      public static C2S_BatchMagicDisCompose_10627 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BatchMagicDisCompose_10627)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BatchMagicDisCompose_10627 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BatchMagicDisCompose_10627)PARSER.parseFrom(data);
      }

      public static C2S_BatchMagicDisCompose_10627 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BatchMagicDisCompose_10627)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BatchMagicDisCompose_10627 parseFrom(InputStream input) throws IOException {
         return (C2S_BatchMagicDisCompose_10627)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BatchMagicDisCompose_10627 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BatchMagicDisCompose_10627)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BatchMagicDisCompose_10627 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BatchMagicDisCompose_10627)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BatchMagicDisCompose_10627 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BatchMagicDisCompose_10627)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BatchMagicDisCompose_10627 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BatchMagicDisCompose_10627)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BatchMagicDisCompose_10627 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BatchMagicDisCompose_10627)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BatchMagicDisCompose_10627 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BatchMagicDisCompose_10627 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BatchMagicDisCompose_10627> parser() {
         return PARSER;
      }

      public Parser<C2S_BatchMagicDisCompose_10627> getParserForType() {
         return PARSER;
      }

      public C2S_BatchMagicDisCompose_10627 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BatchMagicDisCompose_10627OrBuilder {
         private int bitField0_;
         private List<MagicDisComposeInfo> magicDisComposeList_;
         private RepeatedFieldBuilderV3<MagicDisComposeInfo, MagicDisComposeInfo.Builder, MagicDisComposeInfoOrBuilder> magicDisComposeListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_BatchMagicDisCompose_10627_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_BatchMagicDisCompose_10627_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BatchMagicDisCompose_10627.class, Builder.class);
         }

         private Builder() {
            this.magicDisComposeList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.magicDisComposeList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.C2S_BatchMagicDisCompose_10627.alwaysUseFieldBuilders) {
               this.getMagicDisComposeListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.magicDisComposeListBuilder_ == null) {
               this.magicDisComposeList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.magicDisComposeListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_BatchMagicDisCompose_10627_descriptor;
         }

         public C2S_BatchMagicDisCompose_10627 getDefaultInstanceForType() {
            return MagicBookMsg.C2S_BatchMagicDisCompose_10627.getDefaultInstance();
         }

         public C2S_BatchMagicDisCompose_10627 build() {
            C2S_BatchMagicDisCompose_10627 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BatchMagicDisCompose_10627 buildPartial() {
            C2S_BatchMagicDisCompose_10627 result = new C2S_BatchMagicDisCompose_10627(this);
            int from_bitField0_ = this.bitField0_;
            if (this.magicDisComposeListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.magicDisComposeList_ = Collections.unmodifiableList(this.magicDisComposeList_);
                  this.bitField0_ &= -2;
               }

               result.magicDisComposeList_ = this.magicDisComposeList_;
            } else {
               result.magicDisComposeList_ = this.magicDisComposeListBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_BatchMagicDisCompose_10627) {
               return this.mergeFrom((C2S_BatchMagicDisCompose_10627)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BatchMagicDisCompose_10627 other) {
            if (other == MagicBookMsg.C2S_BatchMagicDisCompose_10627.getDefaultInstance()) {
               return this;
            } else {
               if (this.magicDisComposeListBuilder_ == null) {
                  if (!other.magicDisComposeList_.isEmpty()) {
                     if (this.magicDisComposeList_.isEmpty()) {
                        this.magicDisComposeList_ = other.magicDisComposeList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureMagicDisComposeListIsMutable();
                        this.magicDisComposeList_.addAll(other.magicDisComposeList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.magicDisComposeList_.isEmpty()) {
                  if (this.magicDisComposeListBuilder_.isEmpty()) {
                     this.magicDisComposeListBuilder_.dispose();
                     this.magicDisComposeListBuilder_ = null;
                     this.magicDisComposeList_ = other.magicDisComposeList_;
                     this.bitField0_ &= -2;
                     this.magicDisComposeListBuilder_ = MagicBookMsg.C2S_BatchMagicDisCompose_10627.alwaysUseFieldBuilders ? this.getMagicDisComposeListFieldBuilder() : null;
                  } else {
                     this.magicDisComposeListBuilder_.addAllMessages(other.magicDisComposeList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getMagicDisComposeListCount(); ++i) {
               if (!this.getMagicDisComposeList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BatchMagicDisCompose_10627 parsedMessage = null;

            try {
               parsedMessage = (C2S_BatchMagicDisCompose_10627)MagicBookMsg.C2S_BatchMagicDisCompose_10627.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BatchMagicDisCompose_10627)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureMagicDisComposeListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.magicDisComposeList_ = new ArrayList(this.magicDisComposeList_);
               this.bitField0_ |= 1;
            }

         }

         public List<MagicDisComposeInfo> getMagicDisComposeListList() {
            return this.magicDisComposeListBuilder_ == null ? Collections.unmodifiableList(this.magicDisComposeList_) : this.magicDisComposeListBuilder_.getMessageList();
         }

         public int getMagicDisComposeListCount() {
            return this.magicDisComposeListBuilder_ == null ? this.magicDisComposeList_.size() : this.magicDisComposeListBuilder_.getCount();
         }

         public MagicDisComposeInfo getMagicDisComposeList(int index) {
            return this.magicDisComposeListBuilder_ == null ? (MagicDisComposeInfo)this.magicDisComposeList_.get(index) : (MagicDisComposeInfo)this.magicDisComposeListBuilder_.getMessage(index);
         }

         public Builder setMagicDisComposeList(int index, MagicDisComposeInfo value) {
            if (this.magicDisComposeListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMagicDisComposeListIsMutable();
               this.magicDisComposeList_.set(index, value);
               this.onChanged();
            } else {
               this.magicDisComposeListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMagicDisComposeList(int index, MagicDisComposeInfo.Builder builderForValue) {
            if (this.magicDisComposeListBuilder_ == null) {
               this.ensureMagicDisComposeListIsMutable();
               this.magicDisComposeList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.magicDisComposeListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMagicDisComposeList(MagicDisComposeInfo value) {
            if (this.magicDisComposeListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMagicDisComposeListIsMutable();
               this.magicDisComposeList_.add(value);
               this.onChanged();
            } else {
               this.magicDisComposeListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMagicDisComposeList(int index, MagicDisComposeInfo value) {
            if (this.magicDisComposeListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMagicDisComposeListIsMutable();
               this.magicDisComposeList_.add(index, value);
               this.onChanged();
            } else {
               this.magicDisComposeListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMagicDisComposeList(MagicDisComposeInfo.Builder builderForValue) {
            if (this.magicDisComposeListBuilder_ == null) {
               this.ensureMagicDisComposeListIsMutable();
               this.magicDisComposeList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.magicDisComposeListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMagicDisComposeList(int index, MagicDisComposeInfo.Builder builderForValue) {
            if (this.magicDisComposeListBuilder_ == null) {
               this.ensureMagicDisComposeListIsMutable();
               this.magicDisComposeList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.magicDisComposeListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMagicDisComposeList(Iterable<? extends MagicDisComposeInfo> values) {
            if (this.magicDisComposeListBuilder_ == null) {
               this.ensureMagicDisComposeListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.magicDisComposeList_);
               this.onChanged();
            } else {
               this.magicDisComposeListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMagicDisComposeList() {
            if (this.magicDisComposeListBuilder_ == null) {
               this.magicDisComposeList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.magicDisComposeListBuilder_.clear();
            }

            return this;
         }

         public Builder removeMagicDisComposeList(int index) {
            if (this.magicDisComposeListBuilder_ == null) {
               this.ensureMagicDisComposeListIsMutable();
               this.magicDisComposeList_.remove(index);
               this.onChanged();
            } else {
               this.magicDisComposeListBuilder_.remove(index);
            }

            return this;
         }

         public MagicDisComposeInfo.Builder getMagicDisComposeListBuilder(int index) {
            return (MagicDisComposeInfo.Builder)this.getMagicDisComposeListFieldBuilder().getBuilder(index);
         }

         public MagicDisComposeInfoOrBuilder getMagicDisComposeListOrBuilder(int index) {
            return this.magicDisComposeListBuilder_ == null ? (MagicDisComposeInfoOrBuilder)this.magicDisComposeList_.get(index) : (MagicDisComposeInfoOrBuilder)this.magicDisComposeListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MagicDisComposeInfoOrBuilder> getMagicDisComposeListOrBuilderList() {
            return this.magicDisComposeListBuilder_ != null ? this.magicDisComposeListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.magicDisComposeList_);
         }

         public MagicDisComposeInfo.Builder addMagicDisComposeListBuilder() {
            return (MagicDisComposeInfo.Builder)this.getMagicDisComposeListFieldBuilder().addBuilder(MagicBookMsg.MagicDisComposeInfo.getDefaultInstance());
         }

         public MagicDisComposeInfo.Builder addMagicDisComposeListBuilder(int index) {
            return (MagicDisComposeInfo.Builder)this.getMagicDisComposeListFieldBuilder().addBuilder(index, MagicBookMsg.MagicDisComposeInfo.getDefaultInstance());
         }

         public List<MagicDisComposeInfo.Builder> getMagicDisComposeListBuilderList() {
            return this.getMagicDisComposeListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MagicDisComposeInfo, MagicDisComposeInfo.Builder, MagicDisComposeInfoOrBuilder> getMagicDisComposeListFieldBuilder() {
            if (this.magicDisComposeListBuilder_ == null) {
               this.magicDisComposeListBuilder_ = new RepeatedFieldBuilderV3(this.magicDisComposeList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.magicDisComposeList_ = null;
            }

            return this.magicDisComposeListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_MagicBookReset_10628 extends GeneratedMessageV3 implements C2S_MagicBookReset_10628OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_MagicBookReset_10628 DEFAULT_INSTANCE = new C2S_MagicBookReset_10628();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MagicBookReset_10628> PARSER = new AbstractParser<C2S_MagicBookReset_10628>() {
         public C2S_MagicBookReset_10628 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MagicBookReset_10628(input, extensionRegistry);
         }
      };

      private C2S_MagicBookReset_10628(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MagicBookReset_10628() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MagicBookReset_10628();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MagicBookReset_10628(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.code_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookReset_10628_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookReset_10628_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicBookReset_10628.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_MagicBookReset_10628)) {
            return super.equals(obj);
         } else {
            C2S_MagicBookReset_10628 other = (C2S_MagicBookReset_10628)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_MagicBookReset_10628 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MagicBookReset_10628)PARSER.parseFrom(data);
      }

      public static C2S_MagicBookReset_10628 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicBookReset_10628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicBookReset_10628 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MagicBookReset_10628)PARSER.parseFrom(data);
      }

      public static C2S_MagicBookReset_10628 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicBookReset_10628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicBookReset_10628 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MagicBookReset_10628)PARSER.parseFrom(data);
      }

      public static C2S_MagicBookReset_10628 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MagicBookReset_10628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MagicBookReset_10628 parseFrom(InputStream input) throws IOException {
         return (C2S_MagicBookReset_10628)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicBookReset_10628 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicBookReset_10628)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicBookReset_10628 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MagicBookReset_10628)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MagicBookReset_10628 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicBookReset_10628)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MagicBookReset_10628 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MagicBookReset_10628)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MagicBookReset_10628 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MagicBookReset_10628)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MagicBookReset_10628 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MagicBookReset_10628 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MagicBookReset_10628> parser() {
         return PARSER;
      }

      public Parser<C2S_MagicBookReset_10628> getParserForType() {
         return PARSER;
      }

      public C2S_MagicBookReset_10628 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MagicBookReset_10628OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookReset_10628_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookReset_10628_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MagicBookReset_10628.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.C2S_MagicBookReset_10628.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_C2S_MagicBookReset_10628_descriptor;
         }

         public C2S_MagicBookReset_10628 getDefaultInstanceForType() {
            return MagicBookMsg.C2S_MagicBookReset_10628.getDefaultInstance();
         }

         public C2S_MagicBookReset_10628 build() {
            C2S_MagicBookReset_10628 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MagicBookReset_10628 buildPartial() {
            C2S_MagicBookReset_10628 result = new C2S_MagicBookReset_10628(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_MagicBookReset_10628) {
               return this.mergeFrom((C2S_MagicBookReset_10628)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MagicBookReset_10628 other) {
            if (other == MagicBookMsg.C2S_MagicBookReset_10628.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_MagicBookReset_10628 parsedMessage = null;

            try {
               parsedMessage = (C2S_MagicBookReset_10628)MagicBookMsg.C2S_MagicBookReset_10628.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MagicBookReset_10628)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_MagicBookReset_10629 extends GeneratedMessageV3 implements S2C_MagicBookReset_10629OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_MagicBookReset_10629 DEFAULT_INSTANCE = new S2C_MagicBookReset_10629();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MagicBookReset_10629> PARSER = new AbstractParser<S2C_MagicBookReset_10629>() {
         public S2C_MagicBookReset_10629 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MagicBookReset_10629(input, extensionRegistry);
         }
      };

      private S2C_MagicBookReset_10629(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MagicBookReset_10629() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MagicBookReset_10629();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MagicBookReset_10629(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookReset_10629_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookReset_10629_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicBookReset_10629.class, Builder.class);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MagicBookReset_10629)) {
            return super.equals(obj);
         } else {
            S2C_MagicBookReset_10629 other = (S2C_MagicBookReset_10629)obj;
            return this.unknownFields.equals(other.unknownFields);
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MagicBookReset_10629 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MagicBookReset_10629)PARSER.parseFrom(data);
      }

      public static S2C_MagicBookReset_10629 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicBookReset_10629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicBookReset_10629 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MagicBookReset_10629)PARSER.parseFrom(data);
      }

      public static S2C_MagicBookReset_10629 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicBookReset_10629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicBookReset_10629 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MagicBookReset_10629)PARSER.parseFrom(data);
      }

      public static S2C_MagicBookReset_10629 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MagicBookReset_10629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MagicBookReset_10629 parseFrom(InputStream input) throws IOException {
         return (S2C_MagicBookReset_10629)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicBookReset_10629 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicBookReset_10629)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicBookReset_10629 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MagicBookReset_10629)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MagicBookReset_10629 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicBookReset_10629)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MagicBookReset_10629 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MagicBookReset_10629)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MagicBookReset_10629 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MagicBookReset_10629)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MagicBookReset_10629 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MagicBookReset_10629 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MagicBookReset_10629> parser() {
         return PARSER;
      }

      public Parser<S2C_MagicBookReset_10629> getParserForType() {
         return PARSER;
      }

      public S2C_MagicBookReset_10629 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MagicBookReset_10629OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookReset_10629_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookReset_10629_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MagicBookReset_10629.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MagicBookMsg.S2C_MagicBookReset_10629.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MagicBookMsg.internal_static_magicBook_com_gzbz_protobuf_S2C_MagicBookReset_10629_descriptor;
         }

         public S2C_MagicBookReset_10629 getDefaultInstanceForType() {
            return MagicBookMsg.S2C_MagicBookReset_10629.getDefaultInstance();
         }

         public S2C_MagicBookReset_10629 build() {
            S2C_MagicBookReset_10629 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MagicBookReset_10629 buildPartial() {
            S2C_MagicBookReset_10629 result = new S2C_MagicBookReset_10629(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_MagicBookReset_10629) {
               return this.mergeFrom((S2C_MagicBookReset_10629)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MagicBookReset_10629 other) {
            if (other == MagicBookMsg.S2C_MagicBookReset_10629.getDefaultInstance()) {
               return this;
            } else {
               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MagicBookReset_10629 parsedMessage = null;

            try {
               parsedMessage = (S2C_MagicBookReset_10629)MagicBookMsg.S2C_MagicBookReset_10629.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MagicBookReset_10629)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface AuthInfoOrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      int getPosition();

      boolean hasOriginalId();

      int getOriginalId();

      boolean hasFinishTime();

      int getFinishTime();
   }

   public interface C2S_AuthLevelUp_10607OrBuilder extends MessageOrBuilder {
      List<Integer> getHeroCodeListList();

      int getHeroCodeListCount();

      int getHeroCodeList(int index);
   }

   public interface C2S_AuthSpeedUp_10605OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      int getPosition();

      boolean hasType();

      int getType();
   }

   public interface C2S_Auth_10603OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      int getPosition();

      boolean hasOriginalId();

      int getOriginalId();
   }

   public interface C2S_BatchMagicDisCompose_10627OrBuilder extends MessageOrBuilder {
      List<MagicDisComposeInfo> getMagicDisComposeListList();

      MagicDisComposeInfo getMagicDisComposeList(int index);

      int getMagicDisComposeListCount();

      List<? extends MagicDisComposeInfoOrBuilder> getMagicDisComposeListOrBuilderList();

      MagicDisComposeInfoOrBuilder getMagicDisComposeListOrBuilder(int index);
   }

   public interface C2S_CommitTask_10623OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_MagicAuthDone_10611OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      int getPosition();
   }

   public interface C2S_MagicBookInfo_10601OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_MagicBookLevelUp_10609OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_MagicBookReset_10628OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface C2S_MagicDisCompose_10615OrBuilder extends MessageOrBuilder {
      boolean hasItemCode();

      int getItemCode();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_MagicLevelUp_10613OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasItem();

      int getItem();
   }

   public interface C2S_MagicOriginalBuy_10619OrBuilder extends MessageOrBuilder {
      boolean hasOriginal();

      OriginalBuyInfo getOriginal();

      OriginalBuyInfoOrBuilder getOriginalOrBuilder();
   }

   public interface C2S_MagicSkillUp_10617OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MagicInfo> getMagicsList();

      CommonMsg.MagicInfo getMagics(int index);

      int getMagicsCount();

      List<? extends CommonMsg.MagicInfoOrBuilder> getMagicsOrBuilderList();

      CommonMsg.MagicInfoOrBuilder getMagicsOrBuilder(int index);
   }

   public interface C2S_TaskList_10621OrBuilder extends MessageOrBuilder {
   }

   public interface MagicDisComposeInfoOrBuilder extends MessageOrBuilder {
      boolean hasItemCode();

      int getItemCode();

      boolean hasNum();

      int getNum();
   }

   public interface OriginalBuyInfoOrBuilder extends MessageOrBuilder {
      boolean hasOriginalId();

      int getOriginalId();

      boolean hasBuy();

      int getBuy();
   }

   public interface S2C_AuthLevelUp_10608OrBuilder extends MessageOrBuilder {
      boolean hasIdentityId();

      int getIdentityId();

      List<Integer> getHeroCodeListList();

      int getHeroCodeListCount();

      int getHeroCodeList(int index);

      List<AuthInfo> getAuthListList();

      AuthInfo getAuthList(int index);

      int getAuthListCount();

      List<? extends AuthInfoOrBuilder> getAuthListOrBuilderList();

      AuthInfoOrBuilder getAuthListOrBuilder(int index);
   }

   public interface S2C_AuthSpeedUp_10606OrBuilder extends MessageOrBuilder {
      List<AuthInfo> getAuthListList();

      AuthInfo getAuthList(int index);

      int getAuthListCount();

      List<? extends AuthInfoOrBuilder> getAuthListOrBuilderList();

      AuthInfoOrBuilder getAuthListOrBuilder(int index);
   }

   public interface S2C_Auth_10604OrBuilder extends MessageOrBuilder {
      List<AuthInfo> getAuthListList();

      AuthInfo getAuthList(int index);

      int getAuthListCount();

      List<? extends AuthInfoOrBuilder> getAuthListOrBuilderList();

      AuthInfoOrBuilder getAuthListOrBuilder(int index);
   }

   public interface S2C_CommitTaskResult_10624OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();

      boolean hasIsActive();

      boolean getIsActive();
   }

   public interface S2C_MagicAuthDone_10612OrBuilder extends MessageOrBuilder {
      List<Integer> getItemListList();

      int getItemListCount();

      int getItemList(int index);

      List<AuthInfo> getAuthListList();

      AuthInfo getAuthList(int index);

      int getAuthListCount();

      List<? extends AuthInfoOrBuilder> getAuthListOrBuilderList();

      AuthInfoOrBuilder getAuthListOrBuilder(int index);
   }

   public interface S2C_MagicBookInfo_10602OrBuilder extends MessageOrBuilder {
      boolean hasIdentityId();

      int getIdentityId();

      boolean hasMagicBook();

      CommonMsg.MagicBookInfo getMagicBook();

      CommonMsg.MagicBookInfoOrBuilder getMagicBookOrBuilder();

      List<AuthInfo> getAuthListList();

      AuthInfo getAuthList(int index);

      int getAuthListCount();

      List<? extends AuthInfoOrBuilder> getAuthListOrBuilderList();

      AuthInfoOrBuilder getAuthListOrBuilder(int index);

      List<OriginalBuyInfo> getOriginalsList();

      OriginalBuyInfo getOriginals(int index);

      int getOriginalsCount();

      List<? extends OriginalBuyInfoOrBuilder> getOriginalsOrBuilderList();

      OriginalBuyInfoOrBuilder getOriginalsOrBuilder(int index);

      List<Integer> getMagicsList();

      int getMagicsCount();

      int getMagics(int index);

      boolean hasPower();

      long getPower();
   }

   public interface S2C_MagicBookLevelUp_10610OrBuilder extends MessageOrBuilder {
      boolean hasMagicBookId();

      int getMagicBookId();
   }

   public interface S2C_MagicBookReset_10629OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_MagicDisCompose_10616OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_MagicLevelUp_10614OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasMagic();

      CommonMsg.MagicInfo getMagic();

      CommonMsg.MagicInfoOrBuilder getMagicOrBuilder();
   }

   public interface S2C_MagicOriginalBuy_10620OrBuilder extends MessageOrBuilder {
      List<OriginalBuyInfo> getOriginalsList();

      OriginalBuyInfo getOriginals(int index);

      int getOriginalsCount();

      List<? extends OriginalBuyInfoOrBuilder> getOriginalsOrBuilderList();

      OriginalBuyInfoOrBuilder getOriginalsOrBuilder(int index);
   }

   public interface S2C_MagicSkillUp_10618OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MagicInfo> getMagicsList();

      CommonMsg.MagicInfo getMagics(int index);

      int getMagicsCount();

      List<? extends CommonMsg.MagicInfoOrBuilder> getMagicsOrBuilderList();

      CommonMsg.MagicInfoOrBuilder getMagicsOrBuilder(int index);
   }

   public interface S2C_PowerChange_10626OrBuilder extends MessageOrBuilder {
      boolean hasPower();

      long getPower();
   }

   public interface S2C_TaskList_10622OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTasksList();

      CommonMsg.Task getTasks(int index);

      int getTasksCount();

      List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList();

      CommonMsg.TaskOrBuilder getTasksOrBuilder(int index);
   }
}
