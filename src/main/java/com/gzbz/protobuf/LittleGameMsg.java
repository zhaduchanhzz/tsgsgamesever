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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LittleGameMsg {
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_CleansingTowerChapterInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_CleansingTowerChapterInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20803_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20803_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20804_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20805_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20805_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20806_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20806_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20807_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20807_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20808_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20808_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20811_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20811_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20812_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20812_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20813_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20813_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20814_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20814_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20815_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20815_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20816_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20816_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20817_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20817_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20818_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20818_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private LittleGameMsg() {
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
      String[] descriptorData = new String[]{"\n\u0010LittleGame.proto\u0012\u001clittleGame.com.gzbz.protobuf\"\u001e\n\u001cC2S_CleansingTowerInfo_20801\"C\n\u0019CleansingTowerChapterInfo\u0012\u000f\n\u0007chapter\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rboxRewardFlag\u0018\u0002 \u0002(\u0005\"Ü\u0001\n\u001cS2C_CleansingTowerInfo_20802\u0012N\n\fnotifyReason\u0018\u0001 \u0002(\u000e28.littleGame.com.gzbz.protobuf.CleansingTowerNotifyReason\u0012\u000f\n\u0007chapter\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0003 \u0002(\u0005\u0012L\n\u000bchapterInfo\u0018\u0004 \u0003(\u000b27.littleGame.com.gzbz.protobuf.CleansingTowerChapterInfo\"@\n\u001eC2S_CleansingTowerFinish_20803\u0012\u000f\n\u0007chapter\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005\"O\n$C2S_CleansingTowerGetBoxReward_20804\u0012\u000f\n\u0007chapter\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000eboxRewardIndex\u0018\u0002 \u0002(\u0005\"\u001e\n\u001cC2S_CleansingTowerInfo_20805\"Ü\u0001\n\u001cS2C_CleansingTowerInfo_20806\u0012N\n\fnotifyReason\u0018\u0001 \u0002(\u000e28.littleGame.com.gzbz.protobuf.CleansingTowerNotifyReason\u0012\u000f\n\u0007chapter\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0003 \u0002(\u0005\u0012L\n\u000bchapterInfo\u0018\u0004 \u0003(\u000b27.littleGame.com.gzbz.protobuf.CleansingTowerChapterInfo\"@\n\u001eC2S_CleansingTowerFinish_20807\u0012\u000f\n\u0007chapter\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005\"O\n$C2S_CleansingTowerGetBoxReward_20808\u0012\u000f\n\u0007chapter\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000eboxRewardIndex\u0018\u0002 \u0002(\u0005\"\u001e\n\u001cC2S_CleansingTowerInfo_20811\"Ü\u0001\n\u001cS2C_CleansingTowerInfo_20812\u0012N\n\fnotifyReason\u0018\u0001 \u0002(\u000e28.littleGame.com.gzbz.protobuf.CleansingTowerNotifyReason\u0012\u000f\n\u0007chapter\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0003 \u0002(\u0005\u0012L\n\u000bchapterInfo\u0018\u0004 \u0003(\u000b27.littleGame.com.gzbz.protobuf.CleansingTowerChapterInfo\"@\n\u001eC2S_CleansingTowerFinish_20813\u0012\u000f\n\u0007chapter\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005\"O\n$C2S_CleansingTowerGetBoxReward_20814\u0012\u000f\n\u0007chapter\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000eboxRewardIndex\u0018\u0002 \u0002(\u0005\"\u001e\n\u001cC2S_CleansingTowerInfo_20815\"Ü\u0001\n\u001cS2C_CleansingTowerInfo_20816\u0012N\n\fnotifyReason\u0018\u0001 \u0002(\u000e28.littleGame.com.gzbz.protobuf.CleansingTowerNotifyReason\u0012\u000f\n\u0007chapter\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0003 \u0002(\u0005\u0012L\n\u000bchapterInfo\u0018\u0004 \u0003(\u000b27.littleGame.com.gzbz.protobuf.CleansingTowerChapterInfo\"@\n\u001eC2S_CleansingTowerFinish_20817\u0012\u000f\n\u0007chapter\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005\"O\n$C2S_CleansingTowerGetBoxReward_20818\u0012\u000f\n\u0007chapter\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000eboxRewardIndex\u0018\u0002 \u0002(\u0005*\u0095\u0001\n\u001aCleansingTowerNotifyReason\u0012%\n!CLEANSING_TOWER_NOTIFY_REASON_REQ\u0010\u0000\u0012&\n\"CLEANSING_TOWER_NOTIFY_REASON_PASS\u0010\u0001\u0012(\n$CLEANSING_TOWER_NOTIFY_REASON_REWARD\u0010\u0002B$\n\u0011com.gzbz.protobufB\rLittleGameMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20801_descriptor, new String[0]);
      internal_static_littleGame_com_gzbz_protobuf_CleansingTowerChapterInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_littleGame_com_gzbz_protobuf_CleansingTowerChapterInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_CleansingTowerChapterInfo_descriptor, new String[]{"Chapter", "BoxRewardFlag"});
      internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20802_descriptor, new String[]{"NotifyReason", "Chapter", "Level", "ChapterInfo"});
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20803_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20803_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20803_descriptor, new String[]{"Chapter", "Level"});
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20804_descriptor, new String[]{"Chapter", "BoxRewardIndex"});
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20805_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20805_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20805_descriptor, new String[0]);
      internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20806_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20806_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20806_descriptor, new String[]{"NotifyReason", "Chapter", "Level", "ChapterInfo"});
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20807_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20807_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20807_descriptor, new String[]{"Chapter", "Level"});
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20808_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20808_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20808_descriptor, new String[]{"Chapter", "BoxRewardIndex"});
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20811_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20811_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20811_descriptor, new String[0]);
      internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20812_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20812_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20812_descriptor, new String[]{"NotifyReason", "Chapter", "Level", "ChapterInfo"});
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20813_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20813_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20813_descriptor, new String[]{"Chapter", "Level"});
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20814_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20814_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20814_descriptor, new String[]{"Chapter", "BoxRewardIndex"});
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20815_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20815_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20815_descriptor, new String[0]);
      internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20816_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20816_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20816_descriptor, new String[]{"NotifyReason", "Chapter", "Level", "ChapterInfo"});
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20817_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20817_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20817_descriptor, new String[]{"Chapter", "Level"});
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20818_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20818_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20818_descriptor, new String[]{"Chapter", "BoxRewardIndex"});
   }

   public static enum CleansingTowerNotifyReason implements ProtocolMessageEnum {
      CLEANSING_TOWER_NOTIFY_REASON_REQ(0),
      CLEANSING_TOWER_NOTIFY_REASON_PASS(1),
      CLEANSING_TOWER_NOTIFY_REASON_REWARD(2);

      public static final int CLEANSING_TOWER_NOTIFY_REASON_REQ_VALUE = 0;
      public static final int CLEANSING_TOWER_NOTIFY_REASON_PASS_VALUE = 1;
      public static final int CLEANSING_TOWER_NOTIFY_REASON_REWARD_VALUE = 2;
      private static final Internal.EnumLiteMap<CleansingTowerNotifyReason> internalValueMap = new Internal.EnumLiteMap<CleansingTowerNotifyReason>() {
         public CleansingTowerNotifyReason findValueByNumber(int number) {
            return LittleGameMsg.CleansingTowerNotifyReason.forNumber(number);
         }
      };
      private static final CleansingTowerNotifyReason[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static CleansingTowerNotifyReason valueOf(int value) {
         return forNumber(value);
      }

      public static CleansingTowerNotifyReason forNumber(int value) {
         switch (value) {
            case 0:
               return CLEANSING_TOWER_NOTIFY_REASON_REQ;
            case 1:
               return CLEANSING_TOWER_NOTIFY_REASON_PASS;
            case 2:
               return CLEANSING_TOWER_NOTIFY_REASON_REWARD;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<CleansingTowerNotifyReason> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)LittleGameMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static CleansingTowerNotifyReason valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private CleansingTowerNotifyReason(int value) {
         this.value = value;
      }
   }

   public static final class C2S_CleansingTowerInfo_20801 extends GeneratedMessageV3 implements C2S_CleansingTowerInfo_20801OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_CleansingTowerInfo_20801 DEFAULT_INSTANCE = new C2S_CleansingTowerInfo_20801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CleansingTowerInfo_20801> PARSER = new AbstractParser<C2S_CleansingTowerInfo_20801>() {
         public C2S_CleansingTowerInfo_20801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CleansingTowerInfo_20801(input, extensionRegistry);
         }
      };

      private C2S_CleansingTowerInfo_20801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CleansingTowerInfo_20801() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CleansingTowerInfo_20801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CleansingTowerInfo_20801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerInfo_20801.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CleansingTowerInfo_20801)) {
            return super.equals(obj);
         } else {
            C2S_CleansingTowerInfo_20801 other = (C2S_CleansingTowerInfo_20801)obj;
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

      public static C2S_CleansingTowerInfo_20801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20801)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerInfo_20801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20801)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerInfo_20801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20801)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerInfo_20801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20801 parseFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerInfo_20801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerInfo_20801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerInfo_20801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerInfo_20801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerInfo_20801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerInfo_20801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CleansingTowerInfo_20801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerInfo_20801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerInfo_20801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CleansingTowerInfo_20801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CleansingTowerInfo_20801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CleansingTowerInfo_20801> parser() {
         return PARSER;
      }

      public Parser<C2S_CleansingTowerInfo_20801> getParserForType() {
         return PARSER;
      }

      public C2S_CleansingTowerInfo_20801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CleansingTowerInfo_20801OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerInfo_20801.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.C2S_CleansingTowerInfo_20801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20801_descriptor;
         }

         public C2S_CleansingTowerInfo_20801 getDefaultInstanceForType() {
            return LittleGameMsg.C2S_CleansingTowerInfo_20801.getDefaultInstance();
         }

         public C2S_CleansingTowerInfo_20801 build() {
            C2S_CleansingTowerInfo_20801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CleansingTowerInfo_20801 buildPartial() {
            C2S_CleansingTowerInfo_20801 result = new C2S_CleansingTowerInfo_20801(this);
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
            if (other instanceof C2S_CleansingTowerInfo_20801) {
               return this.mergeFrom((C2S_CleansingTowerInfo_20801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CleansingTowerInfo_20801 other) {
            if (other == LittleGameMsg.C2S_CleansingTowerInfo_20801.getDefaultInstance()) {
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
            C2S_CleansingTowerInfo_20801 parsedMessage = null;

            try {
               parsedMessage = (C2S_CleansingTowerInfo_20801)LittleGameMsg.C2S_CleansingTowerInfo_20801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CleansingTowerInfo_20801)e.getUnfinishedMessage();
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

   public static final class CleansingTowerChapterInfo extends GeneratedMessageV3 implements CleansingTowerChapterInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTER_FIELD_NUMBER = 1;
      private int chapter_;
      public static final int BOXREWARDFLAG_FIELD_NUMBER = 2;
      private int boxRewardFlag_;
      private byte memoizedIsInitialized;
      private static final CleansingTowerChapterInfo DEFAULT_INSTANCE = new CleansingTowerChapterInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<CleansingTowerChapterInfo> PARSER = new AbstractParser<CleansingTowerChapterInfo>() {
         public CleansingTowerChapterInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CleansingTowerChapterInfo(input, extensionRegistry);
         }
      };

      private CleansingTowerChapterInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CleansingTowerChapterInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CleansingTowerChapterInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CleansingTowerChapterInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.chapter_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.boxRewardFlag_ = input.readInt32();
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
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_CleansingTowerChapterInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_CleansingTowerChapterInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CleansingTowerChapterInfo.class, Builder.class);
      }

      public boolean hasChapter() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapter() {
         return this.chapter_;
      }

      public boolean hasBoxRewardFlag() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBoxRewardFlag() {
         return this.boxRewardFlag_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChapter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBoxRewardFlag()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.chapter_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.boxRewardFlag_);
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
               size += CodedOutputStream.computeInt32Size(1, this.chapter_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.boxRewardFlag_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CleansingTowerChapterInfo)) {
            return super.equals(obj);
         } else {
            CleansingTowerChapterInfo other = (CleansingTowerChapterInfo)obj;
            if (this.hasChapter() != other.hasChapter()) {
               return false;
            } else if (this.hasChapter() && this.getChapter() != other.getChapter()) {
               return false;
            } else if (this.hasBoxRewardFlag() != other.hasBoxRewardFlag()) {
               return false;
            } else if (this.hasBoxRewardFlag() && this.getBoxRewardFlag() != other.getBoxRewardFlag()) {
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
            if (this.hasChapter()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChapter();
            }

            if (this.hasBoxRewardFlag()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBoxRewardFlag();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CleansingTowerChapterInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CleansingTowerChapterInfo)PARSER.parseFrom(data);
      }

      public static CleansingTowerChapterInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CleansingTowerChapterInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CleansingTowerChapterInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CleansingTowerChapterInfo)PARSER.parseFrom(data);
      }

      public static CleansingTowerChapterInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CleansingTowerChapterInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CleansingTowerChapterInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CleansingTowerChapterInfo)PARSER.parseFrom(data);
      }

      public static CleansingTowerChapterInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CleansingTowerChapterInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CleansingTowerChapterInfo parseFrom(InputStream input) throws IOException {
         return (CleansingTowerChapterInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CleansingTowerChapterInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CleansingTowerChapterInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CleansingTowerChapterInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (CleansingTowerChapterInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CleansingTowerChapterInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CleansingTowerChapterInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CleansingTowerChapterInfo parseFrom(CodedInputStream input) throws IOException {
         return (CleansingTowerChapterInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CleansingTowerChapterInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CleansingTowerChapterInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CleansingTowerChapterInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CleansingTowerChapterInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CleansingTowerChapterInfo> parser() {
         return PARSER;
      }

      public Parser<CleansingTowerChapterInfo> getParserForType() {
         return PARSER;
      }

      public CleansingTowerChapterInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CleansingTowerChapterInfoOrBuilder {
         private int bitField0_;
         private int chapter_;
         private int boxRewardFlag_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_CleansingTowerChapterInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_CleansingTowerChapterInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CleansingTowerChapterInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.CleansingTowerChapterInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.chapter_ = 0;
            this.bitField0_ &= -2;
            this.boxRewardFlag_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_CleansingTowerChapterInfo_descriptor;
         }

         public CleansingTowerChapterInfo getDefaultInstanceForType() {
            return LittleGameMsg.CleansingTowerChapterInfo.getDefaultInstance();
         }

         public CleansingTowerChapterInfo build() {
            CleansingTowerChapterInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CleansingTowerChapterInfo buildPartial() {
            CleansingTowerChapterInfo result = new CleansingTowerChapterInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapter_ = this.chapter_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.boxRewardFlag_ = this.boxRewardFlag_;
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
            if (other instanceof CleansingTowerChapterInfo) {
               return this.mergeFrom((CleansingTowerChapterInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CleansingTowerChapterInfo other) {
            if (other == LittleGameMsg.CleansingTowerChapterInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapter()) {
                  this.setChapter(other.getChapter());
               }

               if (other.hasBoxRewardFlag()) {
                  this.setBoxRewardFlag(other.getBoxRewardFlag());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChapter()) {
               return false;
            } else {
               return this.hasBoxRewardFlag();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CleansingTowerChapterInfo parsedMessage = null;

            try {
               parsedMessage = (CleansingTowerChapterInfo)LittleGameMsg.CleansingTowerChapterInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CleansingTowerChapterInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChapter() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChapter() {
            return this.chapter_;
         }

         public Builder setChapter(int value) {
            this.bitField0_ |= 1;
            this.chapter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapter() {
            this.bitField0_ &= -2;
            this.chapter_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBoxRewardFlag() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBoxRewardFlag() {
            return this.boxRewardFlag_;
         }

         public Builder setBoxRewardFlag(int value) {
            this.bitField0_ |= 2;
            this.boxRewardFlag_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxRewardFlag() {
            this.bitField0_ &= -3;
            this.boxRewardFlag_ = 0;
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

   public static final class S2C_CleansingTowerInfo_20802 extends GeneratedMessageV3 implements S2C_CleansingTowerInfo_20802OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NOTIFYREASON_FIELD_NUMBER = 1;
      private int notifyReason_;
      public static final int CHAPTER_FIELD_NUMBER = 2;
      private int chapter_;
      public static final int LEVEL_FIELD_NUMBER = 3;
      private int level_;
      public static final int CHAPTERINFO_FIELD_NUMBER = 4;
      private List<CleansingTowerChapterInfo> chapterInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_CleansingTowerInfo_20802 DEFAULT_INSTANCE = new S2C_CleansingTowerInfo_20802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CleansingTowerInfo_20802> PARSER = new AbstractParser<S2C_CleansingTowerInfo_20802>() {
         public S2C_CleansingTowerInfo_20802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CleansingTowerInfo_20802(input, extensionRegistry);
         }
      };

      private S2C_CleansingTowerInfo_20802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CleansingTowerInfo_20802() {
         this.memoizedIsInitialized = -1;
         this.notifyReason_ = 0;
         this.chapterInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CleansingTowerInfo_20802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CleansingTowerInfo_20802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        CleansingTowerNotifyReason value = LittleGameMsg.CleansingTowerNotifyReason.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.notifyReason_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.chapter_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.level_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.chapterInfo_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.chapterInfo_.add(input.readMessage(LittleGameMsg.CleansingTowerChapterInfo.PARSER, extensionRegistry));
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.chapterInfo_ = Collections.unmodifiableList(this.chapterInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CleansingTowerInfo_20802.class, Builder.class);
      }

      public boolean hasNotifyReason() {
         return (this.bitField0_ & 1) != 0;
      }

      public CleansingTowerNotifyReason getNotifyReason() {
         CleansingTowerNotifyReason result = LittleGameMsg.CleansingTowerNotifyReason.valueOf(this.notifyReason_);
         return result == null ? LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REQ : result;
      }

      public boolean hasChapter() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getChapter() {
         return this.chapter_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public List<CleansingTowerChapterInfo> getChapterInfoList() {
         return this.chapterInfo_;
      }

      public List<? extends CleansingTowerChapterInfoOrBuilder> getChapterInfoOrBuilderList() {
         return this.chapterInfo_;
      }

      public int getChapterInfoCount() {
         return this.chapterInfo_.size();
      }

      public CleansingTowerChapterInfo getChapterInfo(int index) {
         return (CleansingTowerChapterInfo)this.chapterInfo_.get(index);
      }

      public CleansingTowerChapterInfoOrBuilder getChapterInfoOrBuilder(int index) {
         return (CleansingTowerChapterInfoOrBuilder)this.chapterInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasNotifyReason()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasChapter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getChapterInfoCount(); ++i) {
               if (!this.getChapterInfo(i).isInitialized()) {
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
            output.writeEnum(1, this.notifyReason_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.chapter_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.level_);
         }

         for(int i = 0; i < this.chapterInfo_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.chapterInfo_.get(i));
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
               size += CodedOutputStream.computeEnumSize(1, this.notifyReason_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.chapter_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.level_);
            }

            for(int i = 0; i < this.chapterInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.chapterInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CleansingTowerInfo_20802)) {
            return super.equals(obj);
         } else {
            S2C_CleansingTowerInfo_20802 other = (S2C_CleansingTowerInfo_20802)obj;
            if (this.hasNotifyReason() != other.hasNotifyReason()) {
               return false;
            } else if (this.hasNotifyReason() && this.notifyReason_ != other.notifyReason_) {
               return false;
            } else if (this.hasChapter() != other.hasChapter()) {
               return false;
            } else if (this.hasChapter() && this.getChapter() != other.getChapter()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (!this.getChapterInfoList().equals(other.getChapterInfoList())) {
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
            if (this.hasNotifyReason()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.notifyReason_;
            }

            if (this.hasChapter()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getChapter();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLevel();
            }

            if (this.getChapterInfoCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getChapterInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CleansingTowerInfo_20802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20802)PARSER.parseFrom(data);
      }

      public static S2C_CleansingTowerInfo_20802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20802)PARSER.parseFrom(data);
      }

      public static S2C_CleansingTowerInfo_20802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20802)PARSER.parseFrom(data);
      }

      public static S2C_CleansingTowerInfo_20802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20802 parseFrom(InputStream input) throws IOException {
         return (S2C_CleansingTowerInfo_20802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CleansingTowerInfo_20802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CleansingTowerInfo_20802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CleansingTowerInfo_20802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CleansingTowerInfo_20802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CleansingTowerInfo_20802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CleansingTowerInfo_20802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CleansingTowerInfo_20802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CleansingTowerInfo_20802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CleansingTowerInfo_20802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CleansingTowerInfo_20802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CleansingTowerInfo_20802> parser() {
         return PARSER;
      }

      public Parser<S2C_CleansingTowerInfo_20802> getParserForType() {
         return PARSER;
      }

      public S2C_CleansingTowerInfo_20802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CleansingTowerInfo_20802OrBuilder {
         private int bitField0_;
         private int notifyReason_;
         private int chapter_;
         private int level_;
         private List<CleansingTowerChapterInfo> chapterInfo_;
         private RepeatedFieldBuilderV3<CleansingTowerChapterInfo, CleansingTowerChapterInfo.Builder, CleansingTowerChapterInfoOrBuilder> chapterInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CleansingTowerInfo_20802.class, Builder.class);
         }

         private Builder() {
            this.notifyReason_ = 0;
            this.chapterInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.notifyReason_ = 0;
            this.chapterInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.S2C_CleansingTowerInfo_20802.alwaysUseFieldBuilders) {
               this.getChapterInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.notifyReason_ = 0;
            this.bitField0_ &= -2;
            this.chapter_ = 0;
            this.bitField0_ &= -3;
            this.level_ = 0;
            this.bitField0_ &= -5;
            if (this.chapterInfoBuilder_ == null) {
               this.chapterInfo_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.chapterInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20802_descriptor;
         }

         public S2C_CleansingTowerInfo_20802 getDefaultInstanceForType() {
            return LittleGameMsg.S2C_CleansingTowerInfo_20802.getDefaultInstance();
         }

         public S2C_CleansingTowerInfo_20802 build() {
            S2C_CleansingTowerInfo_20802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CleansingTowerInfo_20802 buildPartial() {
            S2C_CleansingTowerInfo_20802 result = new S2C_CleansingTowerInfo_20802(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.notifyReason_ = this.notifyReason_;
            if ((from_bitField0_ & 2) != 0) {
               result.chapter_ = this.chapter_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 4;
            }

            if (this.chapterInfoBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.chapterInfo_ = Collections.unmodifiableList(this.chapterInfo_);
                  this.bitField0_ &= -9;
               }

               result.chapterInfo_ = this.chapterInfo_;
            } else {
               result.chapterInfo_ = this.chapterInfoBuilder_.build();
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
            if (other instanceof S2C_CleansingTowerInfo_20802) {
               return this.mergeFrom((S2C_CleansingTowerInfo_20802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CleansingTowerInfo_20802 other) {
            if (other == LittleGameMsg.S2C_CleansingTowerInfo_20802.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNotifyReason()) {
                  this.setNotifyReason(other.getNotifyReason());
               }

               if (other.hasChapter()) {
                  this.setChapter(other.getChapter());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (this.chapterInfoBuilder_ == null) {
                  if (!other.chapterInfo_.isEmpty()) {
                     if (this.chapterInfo_.isEmpty()) {
                        this.chapterInfo_ = other.chapterInfo_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureChapterInfoIsMutable();
                        this.chapterInfo_.addAll(other.chapterInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.chapterInfo_.isEmpty()) {
                  if (this.chapterInfoBuilder_.isEmpty()) {
                     this.chapterInfoBuilder_.dispose();
                     this.chapterInfoBuilder_ = null;
                     this.chapterInfo_ = other.chapterInfo_;
                     this.bitField0_ &= -9;
                     this.chapterInfoBuilder_ = LittleGameMsg.S2C_CleansingTowerInfo_20802.alwaysUseFieldBuilders ? this.getChapterInfoFieldBuilder() : null;
                  } else {
                     this.chapterInfoBuilder_.addAllMessages(other.chapterInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasNotifyReason()) {
               return false;
            } else if (!this.hasChapter()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else {
               for(int i = 0; i < this.getChapterInfoCount(); ++i) {
                  if (!this.getChapterInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CleansingTowerInfo_20802 parsedMessage = null;

            try {
               parsedMessage = (S2C_CleansingTowerInfo_20802)LittleGameMsg.S2C_CleansingTowerInfo_20802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CleansingTowerInfo_20802)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNotifyReason() {
            return (this.bitField0_ & 1) != 0;
         }

         public CleansingTowerNotifyReason getNotifyReason() {
            CleansingTowerNotifyReason result = LittleGameMsg.CleansingTowerNotifyReason.valueOf(this.notifyReason_);
            return result == null ? LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REQ : result;
         }

         public Builder setNotifyReason(CleansingTowerNotifyReason value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.notifyReason_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearNotifyReason() {
            this.bitField0_ &= -2;
            this.notifyReason_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasChapter() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getChapter() {
            return this.chapter_;
         }

         public Builder setChapter(int value) {
            this.bitField0_ |= 2;
            this.chapter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapter() {
            this.bitField0_ &= -3;
            this.chapter_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 4;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -5;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureChapterInfoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.chapterInfo_ = new ArrayList(this.chapterInfo_);
               this.bitField0_ |= 8;
            }

         }

         public List<CleansingTowerChapterInfo> getChapterInfoList() {
            return this.chapterInfoBuilder_ == null ? Collections.unmodifiableList(this.chapterInfo_) : this.chapterInfoBuilder_.getMessageList();
         }

         public int getChapterInfoCount() {
            return this.chapterInfoBuilder_ == null ? this.chapterInfo_.size() : this.chapterInfoBuilder_.getCount();
         }

         public CleansingTowerChapterInfo getChapterInfo(int index) {
            return this.chapterInfoBuilder_ == null ? (CleansingTowerChapterInfo)this.chapterInfo_.get(index) : (CleansingTowerChapterInfo)this.chapterInfoBuilder_.getMessage(index);
         }

         public Builder setChapterInfo(int index, CleansingTowerChapterInfo value) {
            if (this.chapterInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.set(index, value);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setChapterInfo(int index, CleansingTowerChapterInfo.Builder builderForValue) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addChapterInfo(CleansingTowerChapterInfo value) {
            if (this.chapterInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(value);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addChapterInfo(int index, CleansingTowerChapterInfo value) {
            if (this.chapterInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(index, value);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addChapterInfo(CleansingTowerChapterInfo.Builder builderForValue) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addChapterInfo(int index, CleansingTowerChapterInfo.Builder builderForValue) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllChapterInfo(Iterable<? extends CleansingTowerChapterInfo> values) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.chapterInfo_);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearChapterInfo() {
            if (this.chapterInfoBuilder_ == null) {
               this.chapterInfo_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeChapterInfo(int index) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.remove(index);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.remove(index);
            }

            return this;
         }

         public CleansingTowerChapterInfo.Builder getChapterInfoBuilder(int index) {
            return (CleansingTowerChapterInfo.Builder)this.getChapterInfoFieldBuilder().getBuilder(index);
         }

         public CleansingTowerChapterInfoOrBuilder getChapterInfoOrBuilder(int index) {
            return this.chapterInfoBuilder_ == null ? (CleansingTowerChapterInfoOrBuilder)this.chapterInfo_.get(index) : (CleansingTowerChapterInfoOrBuilder)this.chapterInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CleansingTowerChapterInfoOrBuilder> getChapterInfoOrBuilderList() {
            return this.chapterInfoBuilder_ != null ? this.chapterInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.chapterInfo_);
         }

         public CleansingTowerChapterInfo.Builder addChapterInfoBuilder() {
            return (CleansingTowerChapterInfo.Builder)this.getChapterInfoFieldBuilder().addBuilder(LittleGameMsg.CleansingTowerChapterInfo.getDefaultInstance());
         }

         public CleansingTowerChapterInfo.Builder addChapterInfoBuilder(int index) {
            return (CleansingTowerChapterInfo.Builder)this.getChapterInfoFieldBuilder().addBuilder(index, LittleGameMsg.CleansingTowerChapterInfo.getDefaultInstance());
         }

         public List<CleansingTowerChapterInfo.Builder> getChapterInfoBuilderList() {
            return this.getChapterInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CleansingTowerChapterInfo, CleansingTowerChapterInfo.Builder, CleansingTowerChapterInfoOrBuilder> getChapterInfoFieldBuilder() {
            if (this.chapterInfoBuilder_ == null) {
               this.chapterInfoBuilder_ = new RepeatedFieldBuilderV3(this.chapterInfo_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.chapterInfo_ = null;
            }

            return this.chapterInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_CleansingTowerFinish_20803 extends GeneratedMessageV3 implements C2S_CleansingTowerFinish_20803OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTER_FIELD_NUMBER = 1;
      private int chapter_;
      public static final int LEVEL_FIELD_NUMBER = 2;
      private int level_;
      private byte memoizedIsInitialized;
      private static final C2S_CleansingTowerFinish_20803 DEFAULT_INSTANCE = new C2S_CleansingTowerFinish_20803();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CleansingTowerFinish_20803> PARSER = new AbstractParser<C2S_CleansingTowerFinish_20803>() {
         public C2S_CleansingTowerFinish_20803 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CleansingTowerFinish_20803(input, extensionRegistry);
         }
      };

      private C2S_CleansingTowerFinish_20803(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CleansingTowerFinish_20803() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CleansingTowerFinish_20803();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CleansingTowerFinish_20803(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.chapter_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.level_ = input.readInt32();
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
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20803_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerFinish_20803.class, Builder.class);
      }

      public boolean hasChapter() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapter() {
         return this.chapter_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChapter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.chapter_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.level_);
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
               size += CodedOutputStream.computeInt32Size(1, this.chapter_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.level_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CleansingTowerFinish_20803)) {
            return super.equals(obj);
         } else {
            C2S_CleansingTowerFinish_20803 other = (C2S_CleansingTowerFinish_20803)obj;
            if (this.hasChapter() != other.hasChapter()) {
               return false;
            } else if (this.hasChapter() && this.getChapter() != other.getChapter()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
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
            if (this.hasChapter()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChapter();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CleansingTowerFinish_20803 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20803)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerFinish_20803 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20803 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20803)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerFinish_20803 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20803 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20803)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerFinish_20803 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20803 parseFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerFinish_20803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerFinish_20803 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerFinish_20803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20803 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerFinish_20803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerFinish_20803 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerFinish_20803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20803 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CleansingTowerFinish_20803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerFinish_20803 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerFinish_20803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CleansingTowerFinish_20803 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CleansingTowerFinish_20803 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CleansingTowerFinish_20803> parser() {
         return PARSER;
      }

      public Parser<C2S_CleansingTowerFinish_20803> getParserForType() {
         return PARSER;
      }

      public C2S_CleansingTowerFinish_20803 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CleansingTowerFinish_20803OrBuilder {
         private int bitField0_;
         private int chapter_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20803_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerFinish_20803.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.C2S_CleansingTowerFinish_20803.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.chapter_ = 0;
            this.bitField0_ &= -2;
            this.level_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20803_descriptor;
         }

         public C2S_CleansingTowerFinish_20803 getDefaultInstanceForType() {
            return LittleGameMsg.C2S_CleansingTowerFinish_20803.getDefaultInstance();
         }

         public C2S_CleansingTowerFinish_20803 build() {
            C2S_CleansingTowerFinish_20803 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CleansingTowerFinish_20803 buildPartial() {
            C2S_CleansingTowerFinish_20803 result = new C2S_CleansingTowerFinish_20803(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapter_ = this.chapter_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.level_ = this.level_;
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
            if (other instanceof C2S_CleansingTowerFinish_20803) {
               return this.mergeFrom((C2S_CleansingTowerFinish_20803)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CleansingTowerFinish_20803 other) {
            if (other == LittleGameMsg.C2S_CleansingTowerFinish_20803.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapter()) {
                  this.setChapter(other.getChapter());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChapter()) {
               return false;
            } else {
               return this.hasLevel();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CleansingTowerFinish_20803 parsedMessage = null;

            try {
               parsedMessage = (C2S_CleansingTowerFinish_20803)LittleGameMsg.C2S_CleansingTowerFinish_20803.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CleansingTowerFinish_20803)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChapter() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChapter() {
            return this.chapter_;
         }

         public Builder setChapter(int value) {
            this.bitField0_ |= 1;
            this.chapter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapter() {
            this.bitField0_ &= -2;
            this.chapter_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 2;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -3;
            this.level_ = 0;
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

   public static final class C2S_CleansingTowerGetBoxReward_20804 extends GeneratedMessageV3 implements C2S_CleansingTowerGetBoxReward_20804OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTER_FIELD_NUMBER = 1;
      private int chapter_;
      public static final int BOXREWARDINDEX_FIELD_NUMBER = 2;
      private int boxRewardIndex_;
      private byte memoizedIsInitialized;
      private static final C2S_CleansingTowerGetBoxReward_20804 DEFAULT_INSTANCE = new C2S_CleansingTowerGetBoxReward_20804();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CleansingTowerGetBoxReward_20804> PARSER = new AbstractParser<C2S_CleansingTowerGetBoxReward_20804>() {
         public C2S_CleansingTowerGetBoxReward_20804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CleansingTowerGetBoxReward_20804(input, extensionRegistry);
         }
      };

      private C2S_CleansingTowerGetBoxReward_20804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CleansingTowerGetBoxReward_20804() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CleansingTowerGetBoxReward_20804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CleansingTowerGetBoxReward_20804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.chapter_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.boxRewardIndex_ = input.readInt32();
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
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20804_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerGetBoxReward_20804.class, Builder.class);
      }

      public boolean hasChapter() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapter() {
         return this.chapter_;
      }

      public boolean hasBoxRewardIndex() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBoxRewardIndex() {
         return this.boxRewardIndex_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChapter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBoxRewardIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.chapter_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.boxRewardIndex_);
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
               size += CodedOutputStream.computeInt32Size(1, this.chapter_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.boxRewardIndex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CleansingTowerGetBoxReward_20804)) {
            return super.equals(obj);
         } else {
            C2S_CleansingTowerGetBoxReward_20804 other = (C2S_CleansingTowerGetBoxReward_20804)obj;
            if (this.hasChapter() != other.hasChapter()) {
               return false;
            } else if (this.hasChapter() && this.getChapter() != other.getChapter()) {
               return false;
            } else if (this.hasBoxRewardIndex() != other.hasBoxRewardIndex()) {
               return false;
            } else if (this.hasBoxRewardIndex() && this.getBoxRewardIndex() != other.getBoxRewardIndex()) {
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
            if (this.hasChapter()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChapter();
            }

            if (this.hasBoxRewardIndex()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBoxRewardIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CleansingTowerGetBoxReward_20804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20804)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerGetBoxReward_20804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20804)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerGetBoxReward_20804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20804)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerGetBoxReward_20804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20804 parseFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerGetBoxReward_20804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20804 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerGetBoxReward_20804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20804 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerGetBoxReward_20804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CleansingTowerGetBoxReward_20804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CleansingTowerGetBoxReward_20804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CleansingTowerGetBoxReward_20804> parser() {
         return PARSER;
      }

      public Parser<C2S_CleansingTowerGetBoxReward_20804> getParserForType() {
         return PARSER;
      }

      public C2S_CleansingTowerGetBoxReward_20804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CleansingTowerGetBoxReward_20804OrBuilder {
         private int bitField0_;
         private int chapter_;
         private int boxRewardIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20804_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerGetBoxReward_20804.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.C2S_CleansingTowerGetBoxReward_20804.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.chapter_ = 0;
            this.bitField0_ &= -2;
            this.boxRewardIndex_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20804_descriptor;
         }

         public C2S_CleansingTowerGetBoxReward_20804 getDefaultInstanceForType() {
            return LittleGameMsg.C2S_CleansingTowerGetBoxReward_20804.getDefaultInstance();
         }

         public C2S_CleansingTowerGetBoxReward_20804 build() {
            C2S_CleansingTowerGetBoxReward_20804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CleansingTowerGetBoxReward_20804 buildPartial() {
            C2S_CleansingTowerGetBoxReward_20804 result = new C2S_CleansingTowerGetBoxReward_20804(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapter_ = this.chapter_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.boxRewardIndex_ = this.boxRewardIndex_;
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
            if (other instanceof C2S_CleansingTowerGetBoxReward_20804) {
               return this.mergeFrom((C2S_CleansingTowerGetBoxReward_20804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CleansingTowerGetBoxReward_20804 other) {
            if (other == LittleGameMsg.C2S_CleansingTowerGetBoxReward_20804.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapter()) {
                  this.setChapter(other.getChapter());
               }

               if (other.hasBoxRewardIndex()) {
                  this.setBoxRewardIndex(other.getBoxRewardIndex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChapter()) {
               return false;
            } else {
               return this.hasBoxRewardIndex();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CleansingTowerGetBoxReward_20804 parsedMessage = null;

            try {
               parsedMessage = (C2S_CleansingTowerGetBoxReward_20804)LittleGameMsg.C2S_CleansingTowerGetBoxReward_20804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CleansingTowerGetBoxReward_20804)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChapter() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChapter() {
            return this.chapter_;
         }

         public Builder setChapter(int value) {
            this.bitField0_ |= 1;
            this.chapter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapter() {
            this.bitField0_ &= -2;
            this.chapter_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBoxRewardIndex() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBoxRewardIndex() {
            return this.boxRewardIndex_;
         }

         public Builder setBoxRewardIndex(int value) {
            this.bitField0_ |= 2;
            this.boxRewardIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxRewardIndex() {
            this.bitField0_ &= -3;
            this.boxRewardIndex_ = 0;
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

   public static final class C2S_CleansingTowerInfo_20805 extends GeneratedMessageV3 implements C2S_CleansingTowerInfo_20805OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_CleansingTowerInfo_20805 DEFAULT_INSTANCE = new C2S_CleansingTowerInfo_20805();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CleansingTowerInfo_20805> PARSER = new AbstractParser<C2S_CleansingTowerInfo_20805>() {
         public C2S_CleansingTowerInfo_20805 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CleansingTowerInfo_20805(input, extensionRegistry);
         }
      };

      private C2S_CleansingTowerInfo_20805(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CleansingTowerInfo_20805() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CleansingTowerInfo_20805();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CleansingTowerInfo_20805(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20805_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerInfo_20805.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CleansingTowerInfo_20805)) {
            return super.equals(obj);
         } else {
            C2S_CleansingTowerInfo_20805 other = (C2S_CleansingTowerInfo_20805)obj;
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

      public static C2S_CleansingTowerInfo_20805 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20805)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerInfo_20805 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20805 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20805)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerInfo_20805 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20805 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20805)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerInfo_20805 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20805 parseFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerInfo_20805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerInfo_20805 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerInfo_20805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20805 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerInfo_20805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerInfo_20805 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerInfo_20805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20805 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CleansingTowerInfo_20805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerInfo_20805 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerInfo_20805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CleansingTowerInfo_20805 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CleansingTowerInfo_20805 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CleansingTowerInfo_20805> parser() {
         return PARSER;
      }

      public Parser<C2S_CleansingTowerInfo_20805> getParserForType() {
         return PARSER;
      }

      public C2S_CleansingTowerInfo_20805 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CleansingTowerInfo_20805OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20805_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerInfo_20805.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.C2S_CleansingTowerInfo_20805.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20805_descriptor;
         }

         public C2S_CleansingTowerInfo_20805 getDefaultInstanceForType() {
            return LittleGameMsg.C2S_CleansingTowerInfo_20805.getDefaultInstance();
         }

         public C2S_CleansingTowerInfo_20805 build() {
            C2S_CleansingTowerInfo_20805 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CleansingTowerInfo_20805 buildPartial() {
            C2S_CleansingTowerInfo_20805 result = new C2S_CleansingTowerInfo_20805(this);
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
            if (other instanceof C2S_CleansingTowerInfo_20805) {
               return this.mergeFrom((C2S_CleansingTowerInfo_20805)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CleansingTowerInfo_20805 other) {
            if (other == LittleGameMsg.C2S_CleansingTowerInfo_20805.getDefaultInstance()) {
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
            C2S_CleansingTowerInfo_20805 parsedMessage = null;

            try {
               parsedMessage = (C2S_CleansingTowerInfo_20805)LittleGameMsg.C2S_CleansingTowerInfo_20805.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CleansingTowerInfo_20805)e.getUnfinishedMessage();
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

   public static final class S2C_CleansingTowerInfo_20806 extends GeneratedMessageV3 implements S2C_CleansingTowerInfo_20806OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NOTIFYREASON_FIELD_NUMBER = 1;
      private int notifyReason_;
      public static final int CHAPTER_FIELD_NUMBER = 2;
      private int chapter_;
      public static final int LEVEL_FIELD_NUMBER = 3;
      private int level_;
      public static final int CHAPTERINFO_FIELD_NUMBER = 4;
      private List<CleansingTowerChapterInfo> chapterInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_CleansingTowerInfo_20806 DEFAULT_INSTANCE = new S2C_CleansingTowerInfo_20806();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CleansingTowerInfo_20806> PARSER = new AbstractParser<S2C_CleansingTowerInfo_20806>() {
         public S2C_CleansingTowerInfo_20806 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CleansingTowerInfo_20806(input, extensionRegistry);
         }
      };

      private S2C_CleansingTowerInfo_20806(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CleansingTowerInfo_20806() {
         this.memoizedIsInitialized = -1;
         this.notifyReason_ = 0;
         this.chapterInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CleansingTowerInfo_20806();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CleansingTowerInfo_20806(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        CleansingTowerNotifyReason value = LittleGameMsg.CleansingTowerNotifyReason.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.notifyReason_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.chapter_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.level_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.chapterInfo_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.chapterInfo_.add(input.readMessage(LittleGameMsg.CleansingTowerChapterInfo.PARSER, extensionRegistry));
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.chapterInfo_ = Collections.unmodifiableList(this.chapterInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20806_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CleansingTowerInfo_20806.class, Builder.class);
      }

      public boolean hasNotifyReason() {
         return (this.bitField0_ & 1) != 0;
      }

      public CleansingTowerNotifyReason getNotifyReason() {
         CleansingTowerNotifyReason result = LittleGameMsg.CleansingTowerNotifyReason.valueOf(this.notifyReason_);
         return result == null ? LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REQ : result;
      }

      public boolean hasChapter() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getChapter() {
         return this.chapter_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public List<CleansingTowerChapterInfo> getChapterInfoList() {
         return this.chapterInfo_;
      }

      public List<? extends CleansingTowerChapterInfoOrBuilder> getChapterInfoOrBuilderList() {
         return this.chapterInfo_;
      }

      public int getChapterInfoCount() {
         return this.chapterInfo_.size();
      }

      public CleansingTowerChapterInfo getChapterInfo(int index) {
         return (CleansingTowerChapterInfo)this.chapterInfo_.get(index);
      }

      public CleansingTowerChapterInfoOrBuilder getChapterInfoOrBuilder(int index) {
         return (CleansingTowerChapterInfoOrBuilder)this.chapterInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasNotifyReason()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasChapter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getChapterInfoCount(); ++i) {
               if (!this.getChapterInfo(i).isInitialized()) {
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
            output.writeEnum(1, this.notifyReason_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.chapter_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.level_);
         }

         for(int i = 0; i < this.chapterInfo_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.chapterInfo_.get(i));
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
               size += CodedOutputStream.computeEnumSize(1, this.notifyReason_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.chapter_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.level_);
            }

            for(int i = 0; i < this.chapterInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.chapterInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CleansingTowerInfo_20806)) {
            return super.equals(obj);
         } else {
            S2C_CleansingTowerInfo_20806 other = (S2C_CleansingTowerInfo_20806)obj;
            if (this.hasNotifyReason() != other.hasNotifyReason()) {
               return false;
            } else if (this.hasNotifyReason() && this.notifyReason_ != other.notifyReason_) {
               return false;
            } else if (this.hasChapter() != other.hasChapter()) {
               return false;
            } else if (this.hasChapter() && this.getChapter() != other.getChapter()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (!this.getChapterInfoList().equals(other.getChapterInfoList())) {
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
            if (this.hasNotifyReason()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.notifyReason_;
            }

            if (this.hasChapter()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getChapter();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLevel();
            }

            if (this.getChapterInfoCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getChapterInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CleansingTowerInfo_20806 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20806)PARSER.parseFrom(data);
      }

      public static S2C_CleansingTowerInfo_20806 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20806 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20806)PARSER.parseFrom(data);
      }

      public static S2C_CleansingTowerInfo_20806 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20806 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20806)PARSER.parseFrom(data);
      }

      public static S2C_CleansingTowerInfo_20806 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20806 parseFrom(InputStream input) throws IOException {
         return (S2C_CleansingTowerInfo_20806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CleansingTowerInfo_20806 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CleansingTowerInfo_20806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20806 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CleansingTowerInfo_20806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CleansingTowerInfo_20806 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CleansingTowerInfo_20806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20806 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CleansingTowerInfo_20806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CleansingTowerInfo_20806 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CleansingTowerInfo_20806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CleansingTowerInfo_20806 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CleansingTowerInfo_20806 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CleansingTowerInfo_20806> parser() {
         return PARSER;
      }

      public Parser<S2C_CleansingTowerInfo_20806> getParserForType() {
         return PARSER;
      }

      public S2C_CleansingTowerInfo_20806 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CleansingTowerInfo_20806OrBuilder {
         private int bitField0_;
         private int notifyReason_;
         private int chapter_;
         private int level_;
         private List<CleansingTowerChapterInfo> chapterInfo_;
         private RepeatedFieldBuilderV3<CleansingTowerChapterInfo, CleansingTowerChapterInfo.Builder, CleansingTowerChapterInfoOrBuilder> chapterInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20806_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CleansingTowerInfo_20806.class, Builder.class);
         }

         private Builder() {
            this.notifyReason_ = 0;
            this.chapterInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.notifyReason_ = 0;
            this.chapterInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.S2C_CleansingTowerInfo_20806.alwaysUseFieldBuilders) {
               this.getChapterInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.notifyReason_ = 0;
            this.bitField0_ &= -2;
            this.chapter_ = 0;
            this.bitField0_ &= -3;
            this.level_ = 0;
            this.bitField0_ &= -5;
            if (this.chapterInfoBuilder_ == null) {
               this.chapterInfo_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.chapterInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20806_descriptor;
         }

         public S2C_CleansingTowerInfo_20806 getDefaultInstanceForType() {
            return LittleGameMsg.S2C_CleansingTowerInfo_20806.getDefaultInstance();
         }

         public S2C_CleansingTowerInfo_20806 build() {
            S2C_CleansingTowerInfo_20806 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CleansingTowerInfo_20806 buildPartial() {
            S2C_CleansingTowerInfo_20806 result = new S2C_CleansingTowerInfo_20806(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.notifyReason_ = this.notifyReason_;
            if ((from_bitField0_ & 2) != 0) {
               result.chapter_ = this.chapter_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 4;
            }

            if (this.chapterInfoBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.chapterInfo_ = Collections.unmodifiableList(this.chapterInfo_);
                  this.bitField0_ &= -9;
               }

               result.chapterInfo_ = this.chapterInfo_;
            } else {
               result.chapterInfo_ = this.chapterInfoBuilder_.build();
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
            if (other instanceof S2C_CleansingTowerInfo_20806) {
               return this.mergeFrom((S2C_CleansingTowerInfo_20806)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CleansingTowerInfo_20806 other) {
            if (other == LittleGameMsg.S2C_CleansingTowerInfo_20806.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNotifyReason()) {
                  this.setNotifyReason(other.getNotifyReason());
               }

               if (other.hasChapter()) {
                  this.setChapter(other.getChapter());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (this.chapterInfoBuilder_ == null) {
                  if (!other.chapterInfo_.isEmpty()) {
                     if (this.chapterInfo_.isEmpty()) {
                        this.chapterInfo_ = other.chapterInfo_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureChapterInfoIsMutable();
                        this.chapterInfo_.addAll(other.chapterInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.chapterInfo_.isEmpty()) {
                  if (this.chapterInfoBuilder_.isEmpty()) {
                     this.chapterInfoBuilder_.dispose();
                     this.chapterInfoBuilder_ = null;
                     this.chapterInfo_ = other.chapterInfo_;
                     this.bitField0_ &= -9;
                     this.chapterInfoBuilder_ = LittleGameMsg.S2C_CleansingTowerInfo_20806.alwaysUseFieldBuilders ? this.getChapterInfoFieldBuilder() : null;
                  } else {
                     this.chapterInfoBuilder_.addAllMessages(other.chapterInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasNotifyReason()) {
               return false;
            } else if (!this.hasChapter()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else {
               for(int i = 0; i < this.getChapterInfoCount(); ++i) {
                  if (!this.getChapterInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CleansingTowerInfo_20806 parsedMessage = null;

            try {
               parsedMessage = (S2C_CleansingTowerInfo_20806)LittleGameMsg.S2C_CleansingTowerInfo_20806.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CleansingTowerInfo_20806)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNotifyReason() {
            return (this.bitField0_ & 1) != 0;
         }

         public CleansingTowerNotifyReason getNotifyReason() {
            CleansingTowerNotifyReason result = LittleGameMsg.CleansingTowerNotifyReason.valueOf(this.notifyReason_);
            return result == null ? LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REQ : result;
         }

         public Builder setNotifyReason(CleansingTowerNotifyReason value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.notifyReason_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearNotifyReason() {
            this.bitField0_ &= -2;
            this.notifyReason_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasChapter() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getChapter() {
            return this.chapter_;
         }

         public Builder setChapter(int value) {
            this.bitField0_ |= 2;
            this.chapter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapter() {
            this.bitField0_ &= -3;
            this.chapter_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 4;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -5;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureChapterInfoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.chapterInfo_ = new ArrayList(this.chapterInfo_);
               this.bitField0_ |= 8;
            }

         }

         public List<CleansingTowerChapterInfo> getChapterInfoList() {
            return this.chapterInfoBuilder_ == null ? Collections.unmodifiableList(this.chapterInfo_) : this.chapterInfoBuilder_.getMessageList();
         }

         public int getChapterInfoCount() {
            return this.chapterInfoBuilder_ == null ? this.chapterInfo_.size() : this.chapterInfoBuilder_.getCount();
         }

         public CleansingTowerChapterInfo getChapterInfo(int index) {
            return this.chapterInfoBuilder_ == null ? (CleansingTowerChapterInfo)this.chapterInfo_.get(index) : (CleansingTowerChapterInfo)this.chapterInfoBuilder_.getMessage(index);
         }

         public Builder setChapterInfo(int index, CleansingTowerChapterInfo value) {
            if (this.chapterInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.set(index, value);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setChapterInfo(int index, CleansingTowerChapterInfo.Builder builderForValue) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addChapterInfo(CleansingTowerChapterInfo value) {
            if (this.chapterInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(value);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addChapterInfo(int index, CleansingTowerChapterInfo value) {
            if (this.chapterInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(index, value);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addChapterInfo(CleansingTowerChapterInfo.Builder builderForValue) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addChapterInfo(int index, CleansingTowerChapterInfo.Builder builderForValue) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllChapterInfo(Iterable<? extends CleansingTowerChapterInfo> values) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.chapterInfo_);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearChapterInfo() {
            if (this.chapterInfoBuilder_ == null) {
               this.chapterInfo_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeChapterInfo(int index) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.remove(index);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.remove(index);
            }

            return this;
         }

         public CleansingTowerChapterInfo.Builder getChapterInfoBuilder(int index) {
            return (CleansingTowerChapterInfo.Builder)this.getChapterInfoFieldBuilder().getBuilder(index);
         }

         public CleansingTowerChapterInfoOrBuilder getChapterInfoOrBuilder(int index) {
            return this.chapterInfoBuilder_ == null ? (CleansingTowerChapterInfoOrBuilder)this.chapterInfo_.get(index) : (CleansingTowerChapterInfoOrBuilder)this.chapterInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CleansingTowerChapterInfoOrBuilder> getChapterInfoOrBuilderList() {
            return this.chapterInfoBuilder_ != null ? this.chapterInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.chapterInfo_);
         }

         public CleansingTowerChapterInfo.Builder addChapterInfoBuilder() {
            return (CleansingTowerChapterInfo.Builder)this.getChapterInfoFieldBuilder().addBuilder(LittleGameMsg.CleansingTowerChapterInfo.getDefaultInstance());
         }

         public CleansingTowerChapterInfo.Builder addChapterInfoBuilder(int index) {
            return (CleansingTowerChapterInfo.Builder)this.getChapterInfoFieldBuilder().addBuilder(index, LittleGameMsg.CleansingTowerChapterInfo.getDefaultInstance());
         }

         public List<CleansingTowerChapterInfo.Builder> getChapterInfoBuilderList() {
            return this.getChapterInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CleansingTowerChapterInfo, CleansingTowerChapterInfo.Builder, CleansingTowerChapterInfoOrBuilder> getChapterInfoFieldBuilder() {
            if (this.chapterInfoBuilder_ == null) {
               this.chapterInfoBuilder_ = new RepeatedFieldBuilderV3(this.chapterInfo_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.chapterInfo_ = null;
            }

            return this.chapterInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_CleansingTowerFinish_20807 extends GeneratedMessageV3 implements C2S_CleansingTowerFinish_20807OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTER_FIELD_NUMBER = 1;
      private int chapter_;
      public static final int LEVEL_FIELD_NUMBER = 2;
      private int level_;
      private byte memoizedIsInitialized;
      private static final C2S_CleansingTowerFinish_20807 DEFAULT_INSTANCE = new C2S_CleansingTowerFinish_20807();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CleansingTowerFinish_20807> PARSER = new AbstractParser<C2S_CleansingTowerFinish_20807>() {
         public C2S_CleansingTowerFinish_20807 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CleansingTowerFinish_20807(input, extensionRegistry);
         }
      };

      private C2S_CleansingTowerFinish_20807(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CleansingTowerFinish_20807() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CleansingTowerFinish_20807();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CleansingTowerFinish_20807(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.chapter_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.level_ = input.readInt32();
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
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20807_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerFinish_20807.class, Builder.class);
      }

      public boolean hasChapter() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapter() {
         return this.chapter_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChapter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.chapter_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.level_);
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
               size += CodedOutputStream.computeInt32Size(1, this.chapter_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.level_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CleansingTowerFinish_20807)) {
            return super.equals(obj);
         } else {
            C2S_CleansingTowerFinish_20807 other = (C2S_CleansingTowerFinish_20807)obj;
            if (this.hasChapter() != other.hasChapter()) {
               return false;
            } else if (this.hasChapter() && this.getChapter() != other.getChapter()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
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
            if (this.hasChapter()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChapter();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CleansingTowerFinish_20807 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20807)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerFinish_20807 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20807 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20807)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerFinish_20807 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20807 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20807)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerFinish_20807 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20807 parseFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerFinish_20807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerFinish_20807 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerFinish_20807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20807 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerFinish_20807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerFinish_20807 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerFinish_20807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20807 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CleansingTowerFinish_20807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerFinish_20807 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerFinish_20807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CleansingTowerFinish_20807 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CleansingTowerFinish_20807 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CleansingTowerFinish_20807> parser() {
         return PARSER;
      }

      public Parser<C2S_CleansingTowerFinish_20807> getParserForType() {
         return PARSER;
      }

      public C2S_CleansingTowerFinish_20807 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CleansingTowerFinish_20807OrBuilder {
         private int bitField0_;
         private int chapter_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20807_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerFinish_20807.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.C2S_CleansingTowerFinish_20807.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.chapter_ = 0;
            this.bitField0_ &= -2;
            this.level_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20807_descriptor;
         }

         public C2S_CleansingTowerFinish_20807 getDefaultInstanceForType() {
            return LittleGameMsg.C2S_CleansingTowerFinish_20807.getDefaultInstance();
         }

         public C2S_CleansingTowerFinish_20807 build() {
            C2S_CleansingTowerFinish_20807 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CleansingTowerFinish_20807 buildPartial() {
            C2S_CleansingTowerFinish_20807 result = new C2S_CleansingTowerFinish_20807(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapter_ = this.chapter_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.level_ = this.level_;
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
            if (other instanceof C2S_CleansingTowerFinish_20807) {
               return this.mergeFrom((C2S_CleansingTowerFinish_20807)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CleansingTowerFinish_20807 other) {
            if (other == LittleGameMsg.C2S_CleansingTowerFinish_20807.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapter()) {
                  this.setChapter(other.getChapter());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChapter()) {
               return false;
            } else {
               return this.hasLevel();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CleansingTowerFinish_20807 parsedMessage = null;

            try {
               parsedMessage = (C2S_CleansingTowerFinish_20807)LittleGameMsg.C2S_CleansingTowerFinish_20807.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CleansingTowerFinish_20807)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChapter() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChapter() {
            return this.chapter_;
         }

         public Builder setChapter(int value) {
            this.bitField0_ |= 1;
            this.chapter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapter() {
            this.bitField0_ &= -2;
            this.chapter_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 2;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -3;
            this.level_ = 0;
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

   public static final class C2S_CleansingTowerGetBoxReward_20808 extends GeneratedMessageV3 implements C2S_CleansingTowerGetBoxReward_20808OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTER_FIELD_NUMBER = 1;
      private int chapter_;
      public static final int BOXREWARDINDEX_FIELD_NUMBER = 2;
      private int boxRewardIndex_;
      private byte memoizedIsInitialized;
      private static final C2S_CleansingTowerGetBoxReward_20808 DEFAULT_INSTANCE = new C2S_CleansingTowerGetBoxReward_20808();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CleansingTowerGetBoxReward_20808> PARSER = new AbstractParser<C2S_CleansingTowerGetBoxReward_20808>() {
         public C2S_CleansingTowerGetBoxReward_20808 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CleansingTowerGetBoxReward_20808(input, extensionRegistry);
         }
      };

      private C2S_CleansingTowerGetBoxReward_20808(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CleansingTowerGetBoxReward_20808() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CleansingTowerGetBoxReward_20808();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CleansingTowerGetBoxReward_20808(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.chapter_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.boxRewardIndex_ = input.readInt32();
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
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20808_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20808_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerGetBoxReward_20808.class, Builder.class);
      }

      public boolean hasChapter() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapter() {
         return this.chapter_;
      }

      public boolean hasBoxRewardIndex() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBoxRewardIndex() {
         return this.boxRewardIndex_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChapter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBoxRewardIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.chapter_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.boxRewardIndex_);
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
               size += CodedOutputStream.computeInt32Size(1, this.chapter_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.boxRewardIndex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CleansingTowerGetBoxReward_20808)) {
            return super.equals(obj);
         } else {
            C2S_CleansingTowerGetBoxReward_20808 other = (C2S_CleansingTowerGetBoxReward_20808)obj;
            if (this.hasChapter() != other.hasChapter()) {
               return false;
            } else if (this.hasChapter() && this.getChapter() != other.getChapter()) {
               return false;
            } else if (this.hasBoxRewardIndex() != other.hasBoxRewardIndex()) {
               return false;
            } else if (this.hasBoxRewardIndex() && this.getBoxRewardIndex() != other.getBoxRewardIndex()) {
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
            if (this.hasChapter()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChapter();
            }

            if (this.hasBoxRewardIndex()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBoxRewardIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CleansingTowerGetBoxReward_20808 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20808)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerGetBoxReward_20808 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20808 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20808)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerGetBoxReward_20808 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20808 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20808)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerGetBoxReward_20808 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20808 parseFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerGetBoxReward_20808 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20808 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerGetBoxReward_20808 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20808 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerGetBoxReward_20808 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CleansingTowerGetBoxReward_20808 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CleansingTowerGetBoxReward_20808 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CleansingTowerGetBoxReward_20808> parser() {
         return PARSER;
      }

      public Parser<C2S_CleansingTowerGetBoxReward_20808> getParserForType() {
         return PARSER;
      }

      public C2S_CleansingTowerGetBoxReward_20808 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CleansingTowerGetBoxReward_20808OrBuilder {
         private int bitField0_;
         private int chapter_;
         private int boxRewardIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20808_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20808_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerGetBoxReward_20808.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.C2S_CleansingTowerGetBoxReward_20808.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.chapter_ = 0;
            this.bitField0_ &= -2;
            this.boxRewardIndex_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20808_descriptor;
         }

         public C2S_CleansingTowerGetBoxReward_20808 getDefaultInstanceForType() {
            return LittleGameMsg.C2S_CleansingTowerGetBoxReward_20808.getDefaultInstance();
         }

         public C2S_CleansingTowerGetBoxReward_20808 build() {
            C2S_CleansingTowerGetBoxReward_20808 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CleansingTowerGetBoxReward_20808 buildPartial() {
            C2S_CleansingTowerGetBoxReward_20808 result = new C2S_CleansingTowerGetBoxReward_20808(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapter_ = this.chapter_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.boxRewardIndex_ = this.boxRewardIndex_;
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
            if (other instanceof C2S_CleansingTowerGetBoxReward_20808) {
               return this.mergeFrom((C2S_CleansingTowerGetBoxReward_20808)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CleansingTowerGetBoxReward_20808 other) {
            if (other == LittleGameMsg.C2S_CleansingTowerGetBoxReward_20808.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapter()) {
                  this.setChapter(other.getChapter());
               }

               if (other.hasBoxRewardIndex()) {
                  this.setBoxRewardIndex(other.getBoxRewardIndex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChapter()) {
               return false;
            } else {
               return this.hasBoxRewardIndex();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CleansingTowerGetBoxReward_20808 parsedMessage = null;

            try {
               parsedMessage = (C2S_CleansingTowerGetBoxReward_20808)LittleGameMsg.C2S_CleansingTowerGetBoxReward_20808.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CleansingTowerGetBoxReward_20808)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChapter() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChapter() {
            return this.chapter_;
         }

         public Builder setChapter(int value) {
            this.bitField0_ |= 1;
            this.chapter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapter() {
            this.bitField0_ &= -2;
            this.chapter_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBoxRewardIndex() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBoxRewardIndex() {
            return this.boxRewardIndex_;
         }

         public Builder setBoxRewardIndex(int value) {
            this.bitField0_ |= 2;
            this.boxRewardIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxRewardIndex() {
            this.bitField0_ &= -3;
            this.boxRewardIndex_ = 0;
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

   public static final class C2S_CleansingTowerInfo_20811 extends GeneratedMessageV3 implements C2S_CleansingTowerInfo_20811OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_CleansingTowerInfo_20811 DEFAULT_INSTANCE = new C2S_CleansingTowerInfo_20811();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CleansingTowerInfo_20811> PARSER = new AbstractParser<C2S_CleansingTowerInfo_20811>() {
         public C2S_CleansingTowerInfo_20811 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CleansingTowerInfo_20811(input, extensionRegistry);
         }
      };

      private C2S_CleansingTowerInfo_20811(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CleansingTowerInfo_20811() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CleansingTowerInfo_20811();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CleansingTowerInfo_20811(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20811_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerInfo_20811.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CleansingTowerInfo_20811)) {
            return super.equals(obj);
         } else {
            C2S_CleansingTowerInfo_20811 other = (C2S_CleansingTowerInfo_20811)obj;
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

      public static C2S_CleansingTowerInfo_20811 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20811)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerInfo_20811 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20811 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20811)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerInfo_20811 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20811 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20811)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerInfo_20811 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20811 parseFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerInfo_20811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerInfo_20811 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerInfo_20811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20811 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerInfo_20811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerInfo_20811 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerInfo_20811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20811 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CleansingTowerInfo_20811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerInfo_20811 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerInfo_20811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CleansingTowerInfo_20811 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CleansingTowerInfo_20811 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CleansingTowerInfo_20811> parser() {
         return PARSER;
      }

      public Parser<C2S_CleansingTowerInfo_20811> getParserForType() {
         return PARSER;
      }

      public C2S_CleansingTowerInfo_20811 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CleansingTowerInfo_20811OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20811_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerInfo_20811.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.C2S_CleansingTowerInfo_20811.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20811_descriptor;
         }

         public C2S_CleansingTowerInfo_20811 getDefaultInstanceForType() {
            return LittleGameMsg.C2S_CleansingTowerInfo_20811.getDefaultInstance();
         }

         public C2S_CleansingTowerInfo_20811 build() {
            C2S_CleansingTowerInfo_20811 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CleansingTowerInfo_20811 buildPartial() {
            C2S_CleansingTowerInfo_20811 result = new C2S_CleansingTowerInfo_20811(this);
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
            if (other instanceof C2S_CleansingTowerInfo_20811) {
               return this.mergeFrom((C2S_CleansingTowerInfo_20811)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CleansingTowerInfo_20811 other) {
            if (other == LittleGameMsg.C2S_CleansingTowerInfo_20811.getDefaultInstance()) {
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
            C2S_CleansingTowerInfo_20811 parsedMessage = null;

            try {
               parsedMessage = (C2S_CleansingTowerInfo_20811)LittleGameMsg.C2S_CleansingTowerInfo_20811.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CleansingTowerInfo_20811)e.getUnfinishedMessage();
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

   public static final class S2C_CleansingTowerInfo_20812 extends GeneratedMessageV3 implements S2C_CleansingTowerInfo_20812OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NOTIFYREASON_FIELD_NUMBER = 1;
      private int notifyReason_;
      public static final int CHAPTER_FIELD_NUMBER = 2;
      private int chapter_;
      public static final int LEVEL_FIELD_NUMBER = 3;
      private int level_;
      public static final int CHAPTERINFO_FIELD_NUMBER = 4;
      private List<CleansingTowerChapterInfo> chapterInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_CleansingTowerInfo_20812 DEFAULT_INSTANCE = new S2C_CleansingTowerInfo_20812();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CleansingTowerInfo_20812> PARSER = new AbstractParser<S2C_CleansingTowerInfo_20812>() {
         public S2C_CleansingTowerInfo_20812 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CleansingTowerInfo_20812(input, extensionRegistry);
         }
      };

      private S2C_CleansingTowerInfo_20812(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CleansingTowerInfo_20812() {
         this.memoizedIsInitialized = -1;
         this.notifyReason_ = 0;
         this.chapterInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CleansingTowerInfo_20812();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CleansingTowerInfo_20812(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        CleansingTowerNotifyReason value = LittleGameMsg.CleansingTowerNotifyReason.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.notifyReason_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.chapter_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.level_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.chapterInfo_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.chapterInfo_.add(input.readMessage(LittleGameMsg.CleansingTowerChapterInfo.PARSER, extensionRegistry));
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.chapterInfo_ = Collections.unmodifiableList(this.chapterInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20812_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CleansingTowerInfo_20812.class, Builder.class);
      }

      public boolean hasNotifyReason() {
         return (this.bitField0_ & 1) != 0;
      }

      public CleansingTowerNotifyReason getNotifyReason() {
         CleansingTowerNotifyReason result = LittleGameMsg.CleansingTowerNotifyReason.valueOf(this.notifyReason_);
         return result == null ? LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REQ : result;
      }

      public boolean hasChapter() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getChapter() {
         return this.chapter_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public List<CleansingTowerChapterInfo> getChapterInfoList() {
         return this.chapterInfo_;
      }

      public List<? extends CleansingTowerChapterInfoOrBuilder> getChapterInfoOrBuilderList() {
         return this.chapterInfo_;
      }

      public int getChapterInfoCount() {
         return this.chapterInfo_.size();
      }

      public CleansingTowerChapterInfo getChapterInfo(int index) {
         return (CleansingTowerChapterInfo)this.chapterInfo_.get(index);
      }

      public CleansingTowerChapterInfoOrBuilder getChapterInfoOrBuilder(int index) {
         return (CleansingTowerChapterInfoOrBuilder)this.chapterInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasNotifyReason()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasChapter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getChapterInfoCount(); ++i) {
               if (!this.getChapterInfo(i).isInitialized()) {
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
            output.writeEnum(1, this.notifyReason_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.chapter_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.level_);
         }

         for(int i = 0; i < this.chapterInfo_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.chapterInfo_.get(i));
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
               size += CodedOutputStream.computeEnumSize(1, this.notifyReason_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.chapter_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.level_);
            }

            for(int i = 0; i < this.chapterInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.chapterInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CleansingTowerInfo_20812)) {
            return super.equals(obj);
         } else {
            S2C_CleansingTowerInfo_20812 other = (S2C_CleansingTowerInfo_20812)obj;
            if (this.hasNotifyReason() != other.hasNotifyReason()) {
               return false;
            } else if (this.hasNotifyReason() && this.notifyReason_ != other.notifyReason_) {
               return false;
            } else if (this.hasChapter() != other.hasChapter()) {
               return false;
            } else if (this.hasChapter() && this.getChapter() != other.getChapter()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (!this.getChapterInfoList().equals(other.getChapterInfoList())) {
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
            if (this.hasNotifyReason()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.notifyReason_;
            }

            if (this.hasChapter()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getChapter();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLevel();
            }

            if (this.getChapterInfoCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getChapterInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CleansingTowerInfo_20812 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20812)PARSER.parseFrom(data);
      }

      public static S2C_CleansingTowerInfo_20812 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20812 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20812)PARSER.parseFrom(data);
      }

      public static S2C_CleansingTowerInfo_20812 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20812 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20812)PARSER.parseFrom(data);
      }

      public static S2C_CleansingTowerInfo_20812 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20812 parseFrom(InputStream input) throws IOException {
         return (S2C_CleansingTowerInfo_20812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CleansingTowerInfo_20812 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CleansingTowerInfo_20812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20812 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CleansingTowerInfo_20812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CleansingTowerInfo_20812 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CleansingTowerInfo_20812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20812 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CleansingTowerInfo_20812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CleansingTowerInfo_20812 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CleansingTowerInfo_20812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CleansingTowerInfo_20812 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CleansingTowerInfo_20812 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CleansingTowerInfo_20812> parser() {
         return PARSER;
      }

      public Parser<S2C_CleansingTowerInfo_20812> getParserForType() {
         return PARSER;
      }

      public S2C_CleansingTowerInfo_20812 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CleansingTowerInfo_20812OrBuilder {
         private int bitField0_;
         private int notifyReason_;
         private int chapter_;
         private int level_;
         private List<CleansingTowerChapterInfo> chapterInfo_;
         private RepeatedFieldBuilderV3<CleansingTowerChapterInfo, CleansingTowerChapterInfo.Builder, CleansingTowerChapterInfoOrBuilder> chapterInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20812_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CleansingTowerInfo_20812.class, Builder.class);
         }

         private Builder() {
            this.notifyReason_ = 0;
            this.chapterInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.notifyReason_ = 0;
            this.chapterInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.S2C_CleansingTowerInfo_20812.alwaysUseFieldBuilders) {
               this.getChapterInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.notifyReason_ = 0;
            this.bitField0_ &= -2;
            this.chapter_ = 0;
            this.bitField0_ &= -3;
            this.level_ = 0;
            this.bitField0_ &= -5;
            if (this.chapterInfoBuilder_ == null) {
               this.chapterInfo_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.chapterInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20812_descriptor;
         }

         public S2C_CleansingTowerInfo_20812 getDefaultInstanceForType() {
            return LittleGameMsg.S2C_CleansingTowerInfo_20812.getDefaultInstance();
         }

         public S2C_CleansingTowerInfo_20812 build() {
            S2C_CleansingTowerInfo_20812 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CleansingTowerInfo_20812 buildPartial() {
            S2C_CleansingTowerInfo_20812 result = new S2C_CleansingTowerInfo_20812(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.notifyReason_ = this.notifyReason_;
            if ((from_bitField0_ & 2) != 0) {
               result.chapter_ = this.chapter_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 4;
            }

            if (this.chapterInfoBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.chapterInfo_ = Collections.unmodifiableList(this.chapterInfo_);
                  this.bitField0_ &= -9;
               }

               result.chapterInfo_ = this.chapterInfo_;
            } else {
               result.chapterInfo_ = this.chapterInfoBuilder_.build();
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
            if (other instanceof S2C_CleansingTowerInfo_20812) {
               return this.mergeFrom((S2C_CleansingTowerInfo_20812)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CleansingTowerInfo_20812 other) {
            if (other == LittleGameMsg.S2C_CleansingTowerInfo_20812.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNotifyReason()) {
                  this.setNotifyReason(other.getNotifyReason());
               }

               if (other.hasChapter()) {
                  this.setChapter(other.getChapter());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (this.chapterInfoBuilder_ == null) {
                  if (!other.chapterInfo_.isEmpty()) {
                     if (this.chapterInfo_.isEmpty()) {
                        this.chapterInfo_ = other.chapterInfo_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureChapterInfoIsMutable();
                        this.chapterInfo_.addAll(other.chapterInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.chapterInfo_.isEmpty()) {
                  if (this.chapterInfoBuilder_.isEmpty()) {
                     this.chapterInfoBuilder_.dispose();
                     this.chapterInfoBuilder_ = null;
                     this.chapterInfo_ = other.chapterInfo_;
                     this.bitField0_ &= -9;
                     this.chapterInfoBuilder_ = LittleGameMsg.S2C_CleansingTowerInfo_20812.alwaysUseFieldBuilders ? this.getChapterInfoFieldBuilder() : null;
                  } else {
                     this.chapterInfoBuilder_.addAllMessages(other.chapterInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasNotifyReason()) {
               return false;
            } else if (!this.hasChapter()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else {
               for(int i = 0; i < this.getChapterInfoCount(); ++i) {
                  if (!this.getChapterInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CleansingTowerInfo_20812 parsedMessage = null;

            try {
               parsedMessage = (S2C_CleansingTowerInfo_20812)LittleGameMsg.S2C_CleansingTowerInfo_20812.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CleansingTowerInfo_20812)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNotifyReason() {
            return (this.bitField0_ & 1) != 0;
         }

         public CleansingTowerNotifyReason getNotifyReason() {
            CleansingTowerNotifyReason result = LittleGameMsg.CleansingTowerNotifyReason.valueOf(this.notifyReason_);
            return result == null ? LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REQ : result;
         }

         public Builder setNotifyReason(CleansingTowerNotifyReason value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.notifyReason_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearNotifyReason() {
            this.bitField0_ &= -2;
            this.notifyReason_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasChapter() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getChapter() {
            return this.chapter_;
         }

         public Builder setChapter(int value) {
            this.bitField0_ |= 2;
            this.chapter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapter() {
            this.bitField0_ &= -3;
            this.chapter_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 4;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -5;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureChapterInfoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.chapterInfo_ = new ArrayList(this.chapterInfo_);
               this.bitField0_ |= 8;
            }

         }

         public List<CleansingTowerChapterInfo> getChapterInfoList() {
            return this.chapterInfoBuilder_ == null ? Collections.unmodifiableList(this.chapterInfo_) : this.chapterInfoBuilder_.getMessageList();
         }

         public int getChapterInfoCount() {
            return this.chapterInfoBuilder_ == null ? this.chapterInfo_.size() : this.chapterInfoBuilder_.getCount();
         }

         public CleansingTowerChapterInfo getChapterInfo(int index) {
            return this.chapterInfoBuilder_ == null ? (CleansingTowerChapterInfo)this.chapterInfo_.get(index) : (CleansingTowerChapterInfo)this.chapterInfoBuilder_.getMessage(index);
         }

         public Builder setChapterInfo(int index, CleansingTowerChapterInfo value) {
            if (this.chapterInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.set(index, value);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setChapterInfo(int index, CleansingTowerChapterInfo.Builder builderForValue) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addChapterInfo(CleansingTowerChapterInfo value) {
            if (this.chapterInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(value);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addChapterInfo(int index, CleansingTowerChapterInfo value) {
            if (this.chapterInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(index, value);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addChapterInfo(CleansingTowerChapterInfo.Builder builderForValue) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addChapterInfo(int index, CleansingTowerChapterInfo.Builder builderForValue) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllChapterInfo(Iterable<? extends CleansingTowerChapterInfo> values) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.chapterInfo_);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearChapterInfo() {
            if (this.chapterInfoBuilder_ == null) {
               this.chapterInfo_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeChapterInfo(int index) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.remove(index);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.remove(index);
            }

            return this;
         }

         public CleansingTowerChapterInfo.Builder getChapterInfoBuilder(int index) {
            return (CleansingTowerChapterInfo.Builder)this.getChapterInfoFieldBuilder().getBuilder(index);
         }

         public CleansingTowerChapterInfoOrBuilder getChapterInfoOrBuilder(int index) {
            return this.chapterInfoBuilder_ == null ? (CleansingTowerChapterInfoOrBuilder)this.chapterInfo_.get(index) : (CleansingTowerChapterInfoOrBuilder)this.chapterInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CleansingTowerChapterInfoOrBuilder> getChapterInfoOrBuilderList() {
            return this.chapterInfoBuilder_ != null ? this.chapterInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.chapterInfo_);
         }

         public CleansingTowerChapterInfo.Builder addChapterInfoBuilder() {
            return (CleansingTowerChapterInfo.Builder)this.getChapterInfoFieldBuilder().addBuilder(LittleGameMsg.CleansingTowerChapterInfo.getDefaultInstance());
         }

         public CleansingTowerChapterInfo.Builder addChapterInfoBuilder(int index) {
            return (CleansingTowerChapterInfo.Builder)this.getChapterInfoFieldBuilder().addBuilder(index, LittleGameMsg.CleansingTowerChapterInfo.getDefaultInstance());
         }

         public List<CleansingTowerChapterInfo.Builder> getChapterInfoBuilderList() {
            return this.getChapterInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CleansingTowerChapterInfo, CleansingTowerChapterInfo.Builder, CleansingTowerChapterInfoOrBuilder> getChapterInfoFieldBuilder() {
            if (this.chapterInfoBuilder_ == null) {
               this.chapterInfoBuilder_ = new RepeatedFieldBuilderV3(this.chapterInfo_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.chapterInfo_ = null;
            }

            return this.chapterInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_CleansingTowerFinish_20813 extends GeneratedMessageV3 implements C2S_CleansingTowerFinish_20813OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTER_FIELD_NUMBER = 1;
      private int chapter_;
      public static final int LEVEL_FIELD_NUMBER = 2;
      private int level_;
      private byte memoizedIsInitialized;
      private static final C2S_CleansingTowerFinish_20813 DEFAULT_INSTANCE = new C2S_CleansingTowerFinish_20813();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CleansingTowerFinish_20813> PARSER = new AbstractParser<C2S_CleansingTowerFinish_20813>() {
         public C2S_CleansingTowerFinish_20813 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CleansingTowerFinish_20813(input, extensionRegistry);
         }
      };

      private C2S_CleansingTowerFinish_20813(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CleansingTowerFinish_20813() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CleansingTowerFinish_20813();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CleansingTowerFinish_20813(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.chapter_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.level_ = input.readInt32();
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
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20813_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerFinish_20813.class, Builder.class);
      }

      public boolean hasChapter() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapter() {
         return this.chapter_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChapter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.chapter_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.level_);
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
               size += CodedOutputStream.computeInt32Size(1, this.chapter_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.level_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CleansingTowerFinish_20813)) {
            return super.equals(obj);
         } else {
            C2S_CleansingTowerFinish_20813 other = (C2S_CleansingTowerFinish_20813)obj;
            if (this.hasChapter() != other.hasChapter()) {
               return false;
            } else if (this.hasChapter() && this.getChapter() != other.getChapter()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
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
            if (this.hasChapter()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChapter();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CleansingTowerFinish_20813 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20813)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerFinish_20813 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20813 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20813)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerFinish_20813 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20813 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20813)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerFinish_20813 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20813 parseFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerFinish_20813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerFinish_20813 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerFinish_20813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20813 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerFinish_20813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerFinish_20813 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerFinish_20813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20813 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CleansingTowerFinish_20813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerFinish_20813 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerFinish_20813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CleansingTowerFinish_20813 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CleansingTowerFinish_20813 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CleansingTowerFinish_20813> parser() {
         return PARSER;
      }

      public Parser<C2S_CleansingTowerFinish_20813> getParserForType() {
         return PARSER;
      }

      public C2S_CleansingTowerFinish_20813 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CleansingTowerFinish_20813OrBuilder {
         private int bitField0_;
         private int chapter_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20813_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerFinish_20813.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.C2S_CleansingTowerFinish_20813.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.chapter_ = 0;
            this.bitField0_ &= -2;
            this.level_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20813_descriptor;
         }

         public C2S_CleansingTowerFinish_20813 getDefaultInstanceForType() {
            return LittleGameMsg.C2S_CleansingTowerFinish_20813.getDefaultInstance();
         }

         public C2S_CleansingTowerFinish_20813 build() {
            C2S_CleansingTowerFinish_20813 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CleansingTowerFinish_20813 buildPartial() {
            C2S_CleansingTowerFinish_20813 result = new C2S_CleansingTowerFinish_20813(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapter_ = this.chapter_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.level_ = this.level_;
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
            if (other instanceof C2S_CleansingTowerFinish_20813) {
               return this.mergeFrom((C2S_CleansingTowerFinish_20813)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CleansingTowerFinish_20813 other) {
            if (other == LittleGameMsg.C2S_CleansingTowerFinish_20813.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapter()) {
                  this.setChapter(other.getChapter());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChapter()) {
               return false;
            } else {
               return this.hasLevel();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CleansingTowerFinish_20813 parsedMessage = null;

            try {
               parsedMessage = (C2S_CleansingTowerFinish_20813)LittleGameMsg.C2S_CleansingTowerFinish_20813.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CleansingTowerFinish_20813)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChapter() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChapter() {
            return this.chapter_;
         }

         public Builder setChapter(int value) {
            this.bitField0_ |= 1;
            this.chapter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapter() {
            this.bitField0_ &= -2;
            this.chapter_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 2;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -3;
            this.level_ = 0;
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

   public static final class C2S_CleansingTowerGetBoxReward_20814 extends GeneratedMessageV3 implements C2S_CleansingTowerGetBoxReward_20814OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTER_FIELD_NUMBER = 1;
      private int chapter_;
      public static final int BOXREWARDINDEX_FIELD_NUMBER = 2;
      private int boxRewardIndex_;
      private byte memoizedIsInitialized;
      private static final C2S_CleansingTowerGetBoxReward_20814 DEFAULT_INSTANCE = new C2S_CleansingTowerGetBoxReward_20814();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CleansingTowerGetBoxReward_20814> PARSER = new AbstractParser<C2S_CleansingTowerGetBoxReward_20814>() {
         public C2S_CleansingTowerGetBoxReward_20814 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CleansingTowerGetBoxReward_20814(input, extensionRegistry);
         }
      };

      private C2S_CleansingTowerGetBoxReward_20814(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CleansingTowerGetBoxReward_20814() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CleansingTowerGetBoxReward_20814();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CleansingTowerGetBoxReward_20814(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.chapter_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.boxRewardIndex_ = input.readInt32();
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
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20814_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20814_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerGetBoxReward_20814.class, Builder.class);
      }

      public boolean hasChapter() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapter() {
         return this.chapter_;
      }

      public boolean hasBoxRewardIndex() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBoxRewardIndex() {
         return this.boxRewardIndex_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChapter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBoxRewardIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.chapter_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.boxRewardIndex_);
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
               size += CodedOutputStream.computeInt32Size(1, this.chapter_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.boxRewardIndex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CleansingTowerGetBoxReward_20814)) {
            return super.equals(obj);
         } else {
            C2S_CleansingTowerGetBoxReward_20814 other = (C2S_CleansingTowerGetBoxReward_20814)obj;
            if (this.hasChapter() != other.hasChapter()) {
               return false;
            } else if (this.hasChapter() && this.getChapter() != other.getChapter()) {
               return false;
            } else if (this.hasBoxRewardIndex() != other.hasBoxRewardIndex()) {
               return false;
            } else if (this.hasBoxRewardIndex() && this.getBoxRewardIndex() != other.getBoxRewardIndex()) {
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
            if (this.hasChapter()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChapter();
            }

            if (this.hasBoxRewardIndex()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBoxRewardIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CleansingTowerGetBoxReward_20814 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20814)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerGetBoxReward_20814 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20814 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20814)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerGetBoxReward_20814 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20814 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20814)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerGetBoxReward_20814 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20814 parseFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerGetBoxReward_20814 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20814 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerGetBoxReward_20814 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20814 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerGetBoxReward_20814 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CleansingTowerGetBoxReward_20814 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CleansingTowerGetBoxReward_20814 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CleansingTowerGetBoxReward_20814> parser() {
         return PARSER;
      }

      public Parser<C2S_CleansingTowerGetBoxReward_20814> getParserForType() {
         return PARSER;
      }

      public C2S_CleansingTowerGetBoxReward_20814 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CleansingTowerGetBoxReward_20814OrBuilder {
         private int bitField0_;
         private int chapter_;
         private int boxRewardIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20814_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20814_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerGetBoxReward_20814.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.C2S_CleansingTowerGetBoxReward_20814.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.chapter_ = 0;
            this.bitField0_ &= -2;
            this.boxRewardIndex_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20814_descriptor;
         }

         public C2S_CleansingTowerGetBoxReward_20814 getDefaultInstanceForType() {
            return LittleGameMsg.C2S_CleansingTowerGetBoxReward_20814.getDefaultInstance();
         }

         public C2S_CleansingTowerGetBoxReward_20814 build() {
            C2S_CleansingTowerGetBoxReward_20814 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CleansingTowerGetBoxReward_20814 buildPartial() {
            C2S_CleansingTowerGetBoxReward_20814 result = new C2S_CleansingTowerGetBoxReward_20814(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapter_ = this.chapter_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.boxRewardIndex_ = this.boxRewardIndex_;
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
            if (other instanceof C2S_CleansingTowerGetBoxReward_20814) {
               return this.mergeFrom((C2S_CleansingTowerGetBoxReward_20814)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CleansingTowerGetBoxReward_20814 other) {
            if (other == LittleGameMsg.C2S_CleansingTowerGetBoxReward_20814.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapter()) {
                  this.setChapter(other.getChapter());
               }

               if (other.hasBoxRewardIndex()) {
                  this.setBoxRewardIndex(other.getBoxRewardIndex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChapter()) {
               return false;
            } else {
               return this.hasBoxRewardIndex();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CleansingTowerGetBoxReward_20814 parsedMessage = null;

            try {
               parsedMessage = (C2S_CleansingTowerGetBoxReward_20814)LittleGameMsg.C2S_CleansingTowerGetBoxReward_20814.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CleansingTowerGetBoxReward_20814)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChapter() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChapter() {
            return this.chapter_;
         }

         public Builder setChapter(int value) {
            this.bitField0_ |= 1;
            this.chapter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapter() {
            this.bitField0_ &= -2;
            this.chapter_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBoxRewardIndex() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBoxRewardIndex() {
            return this.boxRewardIndex_;
         }

         public Builder setBoxRewardIndex(int value) {
            this.bitField0_ |= 2;
            this.boxRewardIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxRewardIndex() {
            this.bitField0_ &= -3;
            this.boxRewardIndex_ = 0;
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

   public static final class C2S_CleansingTowerInfo_20815 extends GeneratedMessageV3 implements C2S_CleansingTowerInfo_20815OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_CleansingTowerInfo_20815 DEFAULT_INSTANCE = new C2S_CleansingTowerInfo_20815();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CleansingTowerInfo_20815> PARSER = new AbstractParser<C2S_CleansingTowerInfo_20815>() {
         public C2S_CleansingTowerInfo_20815 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CleansingTowerInfo_20815(input, extensionRegistry);
         }
      };

      private C2S_CleansingTowerInfo_20815(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CleansingTowerInfo_20815() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CleansingTowerInfo_20815();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CleansingTowerInfo_20815(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20815_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerInfo_20815.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CleansingTowerInfo_20815)) {
            return super.equals(obj);
         } else {
            C2S_CleansingTowerInfo_20815 other = (C2S_CleansingTowerInfo_20815)obj;
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

      public static C2S_CleansingTowerInfo_20815 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20815)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerInfo_20815 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20815 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20815)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerInfo_20815 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20815 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20815)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerInfo_20815 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerInfo_20815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20815 parseFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerInfo_20815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerInfo_20815 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerInfo_20815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20815 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerInfo_20815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerInfo_20815 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerInfo_20815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerInfo_20815 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CleansingTowerInfo_20815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerInfo_20815 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerInfo_20815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CleansingTowerInfo_20815 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CleansingTowerInfo_20815 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CleansingTowerInfo_20815> parser() {
         return PARSER;
      }

      public Parser<C2S_CleansingTowerInfo_20815> getParserForType() {
         return PARSER;
      }

      public C2S_CleansingTowerInfo_20815 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CleansingTowerInfo_20815OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20815_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerInfo_20815.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.C2S_CleansingTowerInfo_20815.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerInfo_20815_descriptor;
         }

         public C2S_CleansingTowerInfo_20815 getDefaultInstanceForType() {
            return LittleGameMsg.C2S_CleansingTowerInfo_20815.getDefaultInstance();
         }

         public C2S_CleansingTowerInfo_20815 build() {
            C2S_CleansingTowerInfo_20815 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CleansingTowerInfo_20815 buildPartial() {
            C2S_CleansingTowerInfo_20815 result = new C2S_CleansingTowerInfo_20815(this);
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
            if (other instanceof C2S_CleansingTowerInfo_20815) {
               return this.mergeFrom((C2S_CleansingTowerInfo_20815)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CleansingTowerInfo_20815 other) {
            if (other == LittleGameMsg.C2S_CleansingTowerInfo_20815.getDefaultInstance()) {
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
            C2S_CleansingTowerInfo_20815 parsedMessage = null;

            try {
               parsedMessage = (C2S_CleansingTowerInfo_20815)LittleGameMsg.C2S_CleansingTowerInfo_20815.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CleansingTowerInfo_20815)e.getUnfinishedMessage();
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

   public static final class S2C_CleansingTowerInfo_20816 extends GeneratedMessageV3 implements S2C_CleansingTowerInfo_20816OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NOTIFYREASON_FIELD_NUMBER = 1;
      private int notifyReason_;
      public static final int CHAPTER_FIELD_NUMBER = 2;
      private int chapter_;
      public static final int LEVEL_FIELD_NUMBER = 3;
      private int level_;
      public static final int CHAPTERINFO_FIELD_NUMBER = 4;
      private List<CleansingTowerChapterInfo> chapterInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_CleansingTowerInfo_20816 DEFAULT_INSTANCE = new S2C_CleansingTowerInfo_20816();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CleansingTowerInfo_20816> PARSER = new AbstractParser<S2C_CleansingTowerInfo_20816>() {
         public S2C_CleansingTowerInfo_20816 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CleansingTowerInfo_20816(input, extensionRegistry);
         }
      };

      private S2C_CleansingTowerInfo_20816(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CleansingTowerInfo_20816() {
         this.memoizedIsInitialized = -1;
         this.notifyReason_ = 0;
         this.chapterInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CleansingTowerInfo_20816();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CleansingTowerInfo_20816(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        CleansingTowerNotifyReason value = LittleGameMsg.CleansingTowerNotifyReason.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.notifyReason_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.chapter_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.level_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.chapterInfo_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.chapterInfo_.add(input.readMessage(LittleGameMsg.CleansingTowerChapterInfo.PARSER, extensionRegistry));
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.chapterInfo_ = Collections.unmodifiableList(this.chapterInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20816_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CleansingTowerInfo_20816.class, Builder.class);
      }

      public boolean hasNotifyReason() {
         return (this.bitField0_ & 1) != 0;
      }

      public CleansingTowerNotifyReason getNotifyReason() {
         CleansingTowerNotifyReason result = LittleGameMsg.CleansingTowerNotifyReason.valueOf(this.notifyReason_);
         return result == null ? LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REQ : result;
      }

      public boolean hasChapter() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getChapter() {
         return this.chapter_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public List<CleansingTowerChapterInfo> getChapterInfoList() {
         return this.chapterInfo_;
      }

      public List<? extends CleansingTowerChapterInfoOrBuilder> getChapterInfoOrBuilderList() {
         return this.chapterInfo_;
      }

      public int getChapterInfoCount() {
         return this.chapterInfo_.size();
      }

      public CleansingTowerChapterInfo getChapterInfo(int index) {
         return (CleansingTowerChapterInfo)this.chapterInfo_.get(index);
      }

      public CleansingTowerChapterInfoOrBuilder getChapterInfoOrBuilder(int index) {
         return (CleansingTowerChapterInfoOrBuilder)this.chapterInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasNotifyReason()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasChapter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getChapterInfoCount(); ++i) {
               if (!this.getChapterInfo(i).isInitialized()) {
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
            output.writeEnum(1, this.notifyReason_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.chapter_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.level_);
         }

         for(int i = 0; i < this.chapterInfo_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.chapterInfo_.get(i));
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
               size += CodedOutputStream.computeEnumSize(1, this.notifyReason_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.chapter_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.level_);
            }

            for(int i = 0; i < this.chapterInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.chapterInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CleansingTowerInfo_20816)) {
            return super.equals(obj);
         } else {
            S2C_CleansingTowerInfo_20816 other = (S2C_CleansingTowerInfo_20816)obj;
            if (this.hasNotifyReason() != other.hasNotifyReason()) {
               return false;
            } else if (this.hasNotifyReason() && this.notifyReason_ != other.notifyReason_) {
               return false;
            } else if (this.hasChapter() != other.hasChapter()) {
               return false;
            } else if (this.hasChapter() && this.getChapter() != other.getChapter()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (!this.getChapterInfoList().equals(other.getChapterInfoList())) {
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
            if (this.hasNotifyReason()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.notifyReason_;
            }

            if (this.hasChapter()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getChapter();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLevel();
            }

            if (this.getChapterInfoCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getChapterInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CleansingTowerInfo_20816 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20816)PARSER.parseFrom(data);
      }

      public static S2C_CleansingTowerInfo_20816 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20816 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20816)PARSER.parseFrom(data);
      }

      public static S2C_CleansingTowerInfo_20816 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20816 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20816)PARSER.parseFrom(data);
      }

      public static S2C_CleansingTowerInfo_20816 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CleansingTowerInfo_20816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20816 parseFrom(InputStream input) throws IOException {
         return (S2C_CleansingTowerInfo_20816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CleansingTowerInfo_20816 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CleansingTowerInfo_20816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20816 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CleansingTowerInfo_20816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CleansingTowerInfo_20816 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CleansingTowerInfo_20816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CleansingTowerInfo_20816 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CleansingTowerInfo_20816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CleansingTowerInfo_20816 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CleansingTowerInfo_20816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CleansingTowerInfo_20816 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CleansingTowerInfo_20816 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CleansingTowerInfo_20816> parser() {
         return PARSER;
      }

      public Parser<S2C_CleansingTowerInfo_20816> getParserForType() {
         return PARSER;
      }

      public S2C_CleansingTowerInfo_20816 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CleansingTowerInfo_20816OrBuilder {
         private int bitField0_;
         private int notifyReason_;
         private int chapter_;
         private int level_;
         private List<CleansingTowerChapterInfo> chapterInfo_;
         private RepeatedFieldBuilderV3<CleansingTowerChapterInfo, CleansingTowerChapterInfo.Builder, CleansingTowerChapterInfoOrBuilder> chapterInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20816_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CleansingTowerInfo_20816.class, Builder.class);
         }

         private Builder() {
            this.notifyReason_ = 0;
            this.chapterInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.notifyReason_ = 0;
            this.chapterInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.S2C_CleansingTowerInfo_20816.alwaysUseFieldBuilders) {
               this.getChapterInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.notifyReason_ = 0;
            this.bitField0_ &= -2;
            this.chapter_ = 0;
            this.bitField0_ &= -3;
            this.level_ = 0;
            this.bitField0_ &= -5;
            if (this.chapterInfoBuilder_ == null) {
               this.chapterInfo_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.chapterInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_S2C_CleansingTowerInfo_20816_descriptor;
         }

         public S2C_CleansingTowerInfo_20816 getDefaultInstanceForType() {
            return LittleGameMsg.S2C_CleansingTowerInfo_20816.getDefaultInstance();
         }

         public S2C_CleansingTowerInfo_20816 build() {
            S2C_CleansingTowerInfo_20816 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CleansingTowerInfo_20816 buildPartial() {
            S2C_CleansingTowerInfo_20816 result = new S2C_CleansingTowerInfo_20816(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.notifyReason_ = this.notifyReason_;
            if ((from_bitField0_ & 2) != 0) {
               result.chapter_ = this.chapter_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 4;
            }

            if (this.chapterInfoBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.chapterInfo_ = Collections.unmodifiableList(this.chapterInfo_);
                  this.bitField0_ &= -9;
               }

               result.chapterInfo_ = this.chapterInfo_;
            } else {
               result.chapterInfo_ = this.chapterInfoBuilder_.build();
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
            if (other instanceof S2C_CleansingTowerInfo_20816) {
               return this.mergeFrom((S2C_CleansingTowerInfo_20816)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CleansingTowerInfo_20816 other) {
            if (other == LittleGameMsg.S2C_CleansingTowerInfo_20816.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNotifyReason()) {
                  this.setNotifyReason(other.getNotifyReason());
               }

               if (other.hasChapter()) {
                  this.setChapter(other.getChapter());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (this.chapterInfoBuilder_ == null) {
                  if (!other.chapterInfo_.isEmpty()) {
                     if (this.chapterInfo_.isEmpty()) {
                        this.chapterInfo_ = other.chapterInfo_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureChapterInfoIsMutable();
                        this.chapterInfo_.addAll(other.chapterInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.chapterInfo_.isEmpty()) {
                  if (this.chapterInfoBuilder_.isEmpty()) {
                     this.chapterInfoBuilder_.dispose();
                     this.chapterInfoBuilder_ = null;
                     this.chapterInfo_ = other.chapterInfo_;
                     this.bitField0_ &= -9;
                     this.chapterInfoBuilder_ = LittleGameMsg.S2C_CleansingTowerInfo_20816.alwaysUseFieldBuilders ? this.getChapterInfoFieldBuilder() : null;
                  } else {
                     this.chapterInfoBuilder_.addAllMessages(other.chapterInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasNotifyReason()) {
               return false;
            } else if (!this.hasChapter()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else {
               for(int i = 0; i < this.getChapterInfoCount(); ++i) {
                  if (!this.getChapterInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CleansingTowerInfo_20816 parsedMessage = null;

            try {
               parsedMessage = (S2C_CleansingTowerInfo_20816)LittleGameMsg.S2C_CleansingTowerInfo_20816.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CleansingTowerInfo_20816)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNotifyReason() {
            return (this.bitField0_ & 1) != 0;
         }

         public CleansingTowerNotifyReason getNotifyReason() {
            CleansingTowerNotifyReason result = LittleGameMsg.CleansingTowerNotifyReason.valueOf(this.notifyReason_);
            return result == null ? LittleGameMsg.CleansingTowerNotifyReason.CLEANSING_TOWER_NOTIFY_REASON_REQ : result;
         }

         public Builder setNotifyReason(CleansingTowerNotifyReason value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.notifyReason_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearNotifyReason() {
            this.bitField0_ &= -2;
            this.notifyReason_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasChapter() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getChapter() {
            return this.chapter_;
         }

         public Builder setChapter(int value) {
            this.bitField0_ |= 2;
            this.chapter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapter() {
            this.bitField0_ &= -3;
            this.chapter_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 4;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -5;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureChapterInfoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.chapterInfo_ = new ArrayList(this.chapterInfo_);
               this.bitField0_ |= 8;
            }

         }

         public List<CleansingTowerChapterInfo> getChapterInfoList() {
            return this.chapterInfoBuilder_ == null ? Collections.unmodifiableList(this.chapterInfo_) : this.chapterInfoBuilder_.getMessageList();
         }

         public int getChapterInfoCount() {
            return this.chapterInfoBuilder_ == null ? this.chapterInfo_.size() : this.chapterInfoBuilder_.getCount();
         }

         public CleansingTowerChapterInfo getChapterInfo(int index) {
            return this.chapterInfoBuilder_ == null ? (CleansingTowerChapterInfo)this.chapterInfo_.get(index) : (CleansingTowerChapterInfo)this.chapterInfoBuilder_.getMessage(index);
         }

         public Builder setChapterInfo(int index, CleansingTowerChapterInfo value) {
            if (this.chapterInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.set(index, value);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setChapterInfo(int index, CleansingTowerChapterInfo.Builder builderForValue) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addChapterInfo(CleansingTowerChapterInfo value) {
            if (this.chapterInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(value);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addChapterInfo(int index, CleansingTowerChapterInfo value) {
            if (this.chapterInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(index, value);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addChapterInfo(CleansingTowerChapterInfo.Builder builderForValue) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addChapterInfo(int index, CleansingTowerChapterInfo.Builder builderForValue) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllChapterInfo(Iterable<? extends CleansingTowerChapterInfo> values) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.chapterInfo_);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearChapterInfo() {
            if (this.chapterInfoBuilder_ == null) {
               this.chapterInfo_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeChapterInfo(int index) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.remove(index);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.remove(index);
            }

            return this;
         }

         public CleansingTowerChapterInfo.Builder getChapterInfoBuilder(int index) {
            return (CleansingTowerChapterInfo.Builder)this.getChapterInfoFieldBuilder().getBuilder(index);
         }

         public CleansingTowerChapterInfoOrBuilder getChapterInfoOrBuilder(int index) {
            return this.chapterInfoBuilder_ == null ? (CleansingTowerChapterInfoOrBuilder)this.chapterInfo_.get(index) : (CleansingTowerChapterInfoOrBuilder)this.chapterInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CleansingTowerChapterInfoOrBuilder> getChapterInfoOrBuilderList() {
            return this.chapterInfoBuilder_ != null ? this.chapterInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.chapterInfo_);
         }

         public CleansingTowerChapterInfo.Builder addChapterInfoBuilder() {
            return (CleansingTowerChapterInfo.Builder)this.getChapterInfoFieldBuilder().addBuilder(LittleGameMsg.CleansingTowerChapterInfo.getDefaultInstance());
         }

         public CleansingTowerChapterInfo.Builder addChapterInfoBuilder(int index) {
            return (CleansingTowerChapterInfo.Builder)this.getChapterInfoFieldBuilder().addBuilder(index, LittleGameMsg.CleansingTowerChapterInfo.getDefaultInstance());
         }

         public List<CleansingTowerChapterInfo.Builder> getChapterInfoBuilderList() {
            return this.getChapterInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CleansingTowerChapterInfo, CleansingTowerChapterInfo.Builder, CleansingTowerChapterInfoOrBuilder> getChapterInfoFieldBuilder() {
            if (this.chapterInfoBuilder_ == null) {
               this.chapterInfoBuilder_ = new RepeatedFieldBuilderV3(this.chapterInfo_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.chapterInfo_ = null;
            }

            return this.chapterInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_CleansingTowerFinish_20817 extends GeneratedMessageV3 implements C2S_CleansingTowerFinish_20817OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTER_FIELD_NUMBER = 1;
      private int chapter_;
      public static final int LEVEL_FIELD_NUMBER = 2;
      private int level_;
      private byte memoizedIsInitialized;
      private static final C2S_CleansingTowerFinish_20817 DEFAULT_INSTANCE = new C2S_CleansingTowerFinish_20817();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CleansingTowerFinish_20817> PARSER = new AbstractParser<C2S_CleansingTowerFinish_20817>() {
         public C2S_CleansingTowerFinish_20817 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CleansingTowerFinish_20817(input, extensionRegistry);
         }
      };

      private C2S_CleansingTowerFinish_20817(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CleansingTowerFinish_20817() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CleansingTowerFinish_20817();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CleansingTowerFinish_20817(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.chapter_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.level_ = input.readInt32();
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
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20817_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20817_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerFinish_20817.class, Builder.class);
      }

      public boolean hasChapter() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapter() {
         return this.chapter_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChapter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.chapter_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.level_);
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
               size += CodedOutputStream.computeInt32Size(1, this.chapter_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.level_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CleansingTowerFinish_20817)) {
            return super.equals(obj);
         } else {
            C2S_CleansingTowerFinish_20817 other = (C2S_CleansingTowerFinish_20817)obj;
            if (this.hasChapter() != other.hasChapter()) {
               return false;
            } else if (this.hasChapter() && this.getChapter() != other.getChapter()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
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
            if (this.hasChapter()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChapter();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CleansingTowerFinish_20817 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20817)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerFinish_20817 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20817 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20817)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerFinish_20817 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20817 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20817)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerFinish_20817 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerFinish_20817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20817 parseFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerFinish_20817)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerFinish_20817 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerFinish_20817)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20817 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerFinish_20817)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerFinish_20817 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerFinish_20817)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerFinish_20817 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CleansingTowerFinish_20817)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerFinish_20817 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerFinish_20817)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CleansingTowerFinish_20817 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CleansingTowerFinish_20817 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CleansingTowerFinish_20817> parser() {
         return PARSER;
      }

      public Parser<C2S_CleansingTowerFinish_20817> getParserForType() {
         return PARSER;
      }

      public C2S_CleansingTowerFinish_20817 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CleansingTowerFinish_20817OrBuilder {
         private int bitField0_;
         private int chapter_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20817_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20817_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerFinish_20817.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.C2S_CleansingTowerFinish_20817.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.chapter_ = 0;
            this.bitField0_ &= -2;
            this.level_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerFinish_20817_descriptor;
         }

         public C2S_CleansingTowerFinish_20817 getDefaultInstanceForType() {
            return LittleGameMsg.C2S_CleansingTowerFinish_20817.getDefaultInstance();
         }

         public C2S_CleansingTowerFinish_20817 build() {
            C2S_CleansingTowerFinish_20817 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CleansingTowerFinish_20817 buildPartial() {
            C2S_CleansingTowerFinish_20817 result = new C2S_CleansingTowerFinish_20817(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapter_ = this.chapter_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.level_ = this.level_;
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
            if (other instanceof C2S_CleansingTowerFinish_20817) {
               return this.mergeFrom((C2S_CleansingTowerFinish_20817)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CleansingTowerFinish_20817 other) {
            if (other == LittleGameMsg.C2S_CleansingTowerFinish_20817.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapter()) {
                  this.setChapter(other.getChapter());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChapter()) {
               return false;
            } else {
               return this.hasLevel();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CleansingTowerFinish_20817 parsedMessage = null;

            try {
               parsedMessage = (C2S_CleansingTowerFinish_20817)LittleGameMsg.C2S_CleansingTowerFinish_20817.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CleansingTowerFinish_20817)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChapter() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChapter() {
            return this.chapter_;
         }

         public Builder setChapter(int value) {
            this.bitField0_ |= 1;
            this.chapter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapter() {
            this.bitField0_ &= -2;
            this.chapter_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 2;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -3;
            this.level_ = 0;
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

   public static final class C2S_CleansingTowerGetBoxReward_20818 extends GeneratedMessageV3 implements C2S_CleansingTowerGetBoxReward_20818OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTER_FIELD_NUMBER = 1;
      private int chapter_;
      public static final int BOXREWARDINDEX_FIELD_NUMBER = 2;
      private int boxRewardIndex_;
      private byte memoizedIsInitialized;
      private static final C2S_CleansingTowerGetBoxReward_20818 DEFAULT_INSTANCE = new C2S_CleansingTowerGetBoxReward_20818();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CleansingTowerGetBoxReward_20818> PARSER = new AbstractParser<C2S_CleansingTowerGetBoxReward_20818>() {
         public C2S_CleansingTowerGetBoxReward_20818 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CleansingTowerGetBoxReward_20818(input, extensionRegistry);
         }
      };

      private C2S_CleansingTowerGetBoxReward_20818(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CleansingTowerGetBoxReward_20818() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CleansingTowerGetBoxReward_20818();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CleansingTowerGetBoxReward_20818(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.chapter_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.boxRewardIndex_ = input.readInt32();
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
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20818_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20818_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerGetBoxReward_20818.class, Builder.class);
      }

      public boolean hasChapter() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapter() {
         return this.chapter_;
      }

      public boolean hasBoxRewardIndex() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBoxRewardIndex() {
         return this.boxRewardIndex_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChapter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBoxRewardIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.chapter_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.boxRewardIndex_);
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
               size += CodedOutputStream.computeInt32Size(1, this.chapter_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.boxRewardIndex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CleansingTowerGetBoxReward_20818)) {
            return super.equals(obj);
         } else {
            C2S_CleansingTowerGetBoxReward_20818 other = (C2S_CleansingTowerGetBoxReward_20818)obj;
            if (this.hasChapter() != other.hasChapter()) {
               return false;
            } else if (this.hasChapter() && this.getChapter() != other.getChapter()) {
               return false;
            } else if (this.hasBoxRewardIndex() != other.hasBoxRewardIndex()) {
               return false;
            } else if (this.hasBoxRewardIndex() && this.getBoxRewardIndex() != other.getBoxRewardIndex()) {
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
            if (this.hasChapter()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChapter();
            }

            if (this.hasBoxRewardIndex()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBoxRewardIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CleansingTowerGetBoxReward_20818 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20818)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerGetBoxReward_20818 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20818 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20818)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerGetBoxReward_20818 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20818 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20818)PARSER.parseFrom(data);
      }

      public static C2S_CleansingTowerGetBoxReward_20818 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CleansingTowerGetBoxReward_20818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20818 parseFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20818)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerGetBoxReward_20818 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20818)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20818 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20818)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerGetBoxReward_20818 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20818)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CleansingTowerGetBoxReward_20818 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20818)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CleansingTowerGetBoxReward_20818 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CleansingTowerGetBoxReward_20818)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CleansingTowerGetBoxReward_20818 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CleansingTowerGetBoxReward_20818 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CleansingTowerGetBoxReward_20818> parser() {
         return PARSER;
      }

      public Parser<C2S_CleansingTowerGetBoxReward_20818> getParserForType() {
         return PARSER;
      }

      public C2S_CleansingTowerGetBoxReward_20818 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CleansingTowerGetBoxReward_20818OrBuilder {
         private int bitField0_;
         private int chapter_;
         private int boxRewardIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20818_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20818_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CleansingTowerGetBoxReward_20818.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LittleGameMsg.C2S_CleansingTowerGetBoxReward_20818.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.chapter_ = 0;
            this.bitField0_ &= -2;
            this.boxRewardIndex_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LittleGameMsg.internal_static_littleGame_com_gzbz_protobuf_C2S_CleansingTowerGetBoxReward_20818_descriptor;
         }

         public C2S_CleansingTowerGetBoxReward_20818 getDefaultInstanceForType() {
            return LittleGameMsg.C2S_CleansingTowerGetBoxReward_20818.getDefaultInstance();
         }

         public C2S_CleansingTowerGetBoxReward_20818 build() {
            C2S_CleansingTowerGetBoxReward_20818 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CleansingTowerGetBoxReward_20818 buildPartial() {
            C2S_CleansingTowerGetBoxReward_20818 result = new C2S_CleansingTowerGetBoxReward_20818(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapter_ = this.chapter_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.boxRewardIndex_ = this.boxRewardIndex_;
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
            if (other instanceof C2S_CleansingTowerGetBoxReward_20818) {
               return this.mergeFrom((C2S_CleansingTowerGetBoxReward_20818)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CleansingTowerGetBoxReward_20818 other) {
            if (other == LittleGameMsg.C2S_CleansingTowerGetBoxReward_20818.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapter()) {
                  this.setChapter(other.getChapter());
               }

               if (other.hasBoxRewardIndex()) {
                  this.setBoxRewardIndex(other.getBoxRewardIndex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChapter()) {
               return false;
            } else {
               return this.hasBoxRewardIndex();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CleansingTowerGetBoxReward_20818 parsedMessage = null;

            try {
               parsedMessage = (C2S_CleansingTowerGetBoxReward_20818)LittleGameMsg.C2S_CleansingTowerGetBoxReward_20818.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CleansingTowerGetBoxReward_20818)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChapter() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChapter() {
            return this.chapter_;
         }

         public Builder setChapter(int value) {
            this.bitField0_ |= 1;
            this.chapter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapter() {
            this.bitField0_ &= -2;
            this.chapter_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBoxRewardIndex() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBoxRewardIndex() {
            return this.boxRewardIndex_;
         }

         public Builder setBoxRewardIndex(int value) {
            this.bitField0_ |= 2;
            this.boxRewardIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxRewardIndex() {
            this.bitField0_ &= -3;
            this.boxRewardIndex_ = 0;
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

   public interface C2S_CleansingTowerFinish_20803OrBuilder extends MessageOrBuilder {
      boolean hasChapter();

      int getChapter();

      boolean hasLevel();

      int getLevel();
   }

   public interface C2S_CleansingTowerFinish_20807OrBuilder extends MessageOrBuilder {
      boolean hasChapter();

      int getChapter();

      boolean hasLevel();

      int getLevel();
   }

   public interface C2S_CleansingTowerFinish_20813OrBuilder extends MessageOrBuilder {
      boolean hasChapter();

      int getChapter();

      boolean hasLevel();

      int getLevel();
   }

   public interface C2S_CleansingTowerFinish_20817OrBuilder extends MessageOrBuilder {
      boolean hasChapter();

      int getChapter();

      boolean hasLevel();

      int getLevel();
   }

   public interface C2S_CleansingTowerGetBoxReward_20804OrBuilder extends MessageOrBuilder {
      boolean hasChapter();

      int getChapter();

      boolean hasBoxRewardIndex();

      int getBoxRewardIndex();
   }

   public interface C2S_CleansingTowerGetBoxReward_20808OrBuilder extends MessageOrBuilder {
      boolean hasChapter();

      int getChapter();

      boolean hasBoxRewardIndex();

      int getBoxRewardIndex();
   }

   public interface C2S_CleansingTowerGetBoxReward_20814OrBuilder extends MessageOrBuilder {
      boolean hasChapter();

      int getChapter();

      boolean hasBoxRewardIndex();

      int getBoxRewardIndex();
   }

   public interface C2S_CleansingTowerGetBoxReward_20818OrBuilder extends MessageOrBuilder {
      boolean hasChapter();

      int getChapter();

      boolean hasBoxRewardIndex();

      int getBoxRewardIndex();
   }

   public interface C2S_CleansingTowerInfo_20801OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CleansingTowerInfo_20805OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CleansingTowerInfo_20811OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CleansingTowerInfo_20815OrBuilder extends MessageOrBuilder {
   }

   public interface CleansingTowerChapterInfoOrBuilder extends MessageOrBuilder {
      boolean hasChapter();

      int getChapter();

      boolean hasBoxRewardFlag();

      int getBoxRewardFlag();
   }

   public interface S2C_CleansingTowerInfo_20802OrBuilder extends MessageOrBuilder {
      boolean hasNotifyReason();

      CleansingTowerNotifyReason getNotifyReason();

      boolean hasChapter();

      int getChapter();

      boolean hasLevel();

      int getLevel();

      List<CleansingTowerChapterInfo> getChapterInfoList();

      CleansingTowerChapterInfo getChapterInfo(int index);

      int getChapterInfoCount();

      List<? extends CleansingTowerChapterInfoOrBuilder> getChapterInfoOrBuilderList();

      CleansingTowerChapterInfoOrBuilder getChapterInfoOrBuilder(int index);
   }

   public interface S2C_CleansingTowerInfo_20806OrBuilder extends MessageOrBuilder {
      boolean hasNotifyReason();

      CleansingTowerNotifyReason getNotifyReason();

      boolean hasChapter();

      int getChapter();

      boolean hasLevel();

      int getLevel();

      List<CleansingTowerChapterInfo> getChapterInfoList();

      CleansingTowerChapterInfo getChapterInfo(int index);

      int getChapterInfoCount();

      List<? extends CleansingTowerChapterInfoOrBuilder> getChapterInfoOrBuilderList();

      CleansingTowerChapterInfoOrBuilder getChapterInfoOrBuilder(int index);
   }

   public interface S2C_CleansingTowerInfo_20812OrBuilder extends MessageOrBuilder {
      boolean hasNotifyReason();

      CleansingTowerNotifyReason getNotifyReason();

      boolean hasChapter();

      int getChapter();

      boolean hasLevel();

      int getLevel();

      List<CleansingTowerChapterInfo> getChapterInfoList();

      CleansingTowerChapterInfo getChapterInfo(int index);

      int getChapterInfoCount();

      List<? extends CleansingTowerChapterInfoOrBuilder> getChapterInfoOrBuilderList();

      CleansingTowerChapterInfoOrBuilder getChapterInfoOrBuilder(int index);
   }

   public interface S2C_CleansingTowerInfo_20816OrBuilder extends MessageOrBuilder {
      boolean hasNotifyReason();

      CleansingTowerNotifyReason getNotifyReason();

      boolean hasChapter();

      int getChapter();

      boolean hasLevel();

      int getLevel();

      List<CleansingTowerChapterInfo> getChapterInfoList();

      CleansingTowerChapterInfo getChapterInfo(int index);

      int getChapterInfoCount();

      List<? extends CleansingTowerChapterInfoOrBuilder> getChapterInfoOrBuilderList();

      CleansingTowerChapterInfoOrBuilder getChapterInfoOrBuilder(int index);
   }
}
