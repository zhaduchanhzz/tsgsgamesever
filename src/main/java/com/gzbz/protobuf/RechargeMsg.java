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

public final class RechargeMsg {
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_C2S_RechargeConfirm_7701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_C2S_RechargeConfirm_7701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRecharge_7702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRecharge_7702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_RoleFirstRecharge_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_RoleFirstRecharge_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRecharge_7703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRecharge_7703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRechargeReward_7704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRechargeReward_7704_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRechargeReward_7705_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRechargeReward_7705_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRecharge_7706_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRecharge_7706_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRecharge_7707_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRecharge_7707_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRechargeReward_7708_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRechargeReward_7708_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRechargeReward_7709_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRechargeReward_7709_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeRewardInfo_7710_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeRewardInfo_7710_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_ValueRechargeInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_ValueRechargeInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeRewardInfo_7711_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeRewardInfo_7711_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeReward_7712_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeReward_7712_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeReward_7713_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeReward_7713_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_C2S_RechargeBillList_7715_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_C2S_RechargeBillList_7715_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_C2S_RechargeByCoin_7717_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_C2S_RechargeByCoin_7717_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_S2C_RechargeByCoin_7718_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_S2C_RechargeByCoin_7718_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_S2C_KrJueBanRecharge_7719_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_S2C_KrJueBanRecharge_7719_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_recharge_com_gzbz_protobuf_KrValueRechargeInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_recharge_com_gzbz_protobuf_KrValueRechargeInfo_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private RechargeMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eRecharge.proto\u0012\u001arecharge.com.gzbz.protobuf\"*\n\u0018C2S_RechargeConfirm_7701\u0012\u000e\n\u0006billNo\u0018\u0001 \u0002(\t\"\u001c\n\u001aC2S_RoleFirstRecharge_7702\"B\n\u0011RoleFirstRecharge\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ngotLastDay\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003day\u0018\u0003 \u0002(\u0005\"i\n\u001aS2C_RoleFirstRecharge_7703\u0012;\n\u0004info\u0018\u0001 \u0003(\u000b2-.recharge.com.gzbz.protobuf.RoleFirstRecharge\u0012\u000e\n\u0006isOpen\u0018\u0002 \u0002(\b\"0\n C2S_RoleFirstRechargeReward_7704\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"D\n S2C_RoleFirstRechargeReward_7705\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ngotLastDay\u0018\u0002 \u0002(\u0005\"\u001d\n\u001bC2S_DailyFirstRecharge_7706\"-\n\u001bS2C_DailyFirstRecharge_7707\u0012\u000e\n\u0006gotIds\u0018\u0001 \u0003(\u0005\"/\n!C2S_DailyFirstRechargeReward_7708\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"?\n!S2C_DailyFirstRechargeReward_7709\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\"\"\n C2S_ValueRechargeRewardInfo_7710\"D\n\u0011ValueRechargeInfo\u0012\u0010\n\bquantity\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003day\u0018\u0002 \u0002(\u0005\u0012\u0010\n\btodayGot\u0018\u0003 \u0002(\b\"`\n S2C_ValueRechargeRewardInfo_7711\u0012<\n\u0005infos\u0018\u0001 \u0003(\u000b2-.recharge.com.gzbz.protobuf.ValueRechargeInfo\"=\n\u001cC2S_ValueRechargeReward_7712\u0012\u0010\n\bquantity\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003day\u0018\u0002 \u0002(\u0005\"[\n\u001cS2C_ValueRechargeReward_7713\u0012;\n\u0004info\u0018\u0001 \u0002(\u000b2-.recharge.com.gzbz.protobuf.ValueRechargeInfo\"\u001b\n\u0019C2S_RechargeBillList_7715\"`\n\u0017C2S_RechargeByCoin_7717\u0012\r\n\u0005money\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplatform\u0018\u0002 \u0002(\u0005\u0012\u0014\n\frechargeType\u0018\u0003 \u0002(\u0005\u0012\u000e\n\u0006goodId\u0018\u0004 \u0002(\u0005\"p\n\u0017S2C_RechargeByCoin_7718\u0012\r\n\u0005money\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplatform\u0018\u0002 \u0002(\u0005\u0012\u0014\n\frechargeType\u0018\u0003 \u0002(\u0005\u0012\u000e\n\u0006goodId\u0018\u0004 \u0002(\u0005\u0012\u000e\n\u0006isReal\u0018\u0005 \u0002(\b\"k\n\u0019S2C_KrJueBanRecharge_7719\u0012>\n\u0005infos\u0018\u0001 \u0003(\u000b2/.recharge.com.gzbz.protobuf.KrValueRechargeInfo\u0012\u000e\n\u0006giftId\u0018\u0002 \u0001(\u0005\"2\n\u0013KrValueRechargeInfo\u0012\u000e\n\u0006giftId\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003day\u0018\u0002 \u0003(\u0005B\"\n\u0011com.gzbz.protobufB\u000bRechargeMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_recharge_com_gzbz_protobuf_C2S_RechargeConfirm_7701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_recharge_com_gzbz_protobuf_C2S_RechargeConfirm_7701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_C2S_RechargeConfirm_7701_descriptor, new String[]{"BillNo"});
      internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRecharge_7702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRecharge_7702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRecharge_7702_descriptor, new String[0]);
      internal_static_recharge_com_gzbz_protobuf_RoleFirstRecharge_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_recharge_com_gzbz_protobuf_RoleFirstRecharge_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_RoleFirstRecharge_descriptor, new String[]{"Type", "GotLastDay", "Day"});
      internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRecharge_7703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRecharge_7703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRecharge_7703_descriptor, new String[]{"Info", "IsOpen"});
      internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRechargeReward_7704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRechargeReward_7704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRechargeReward_7704_descriptor, new String[]{"Type"});
      internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRechargeReward_7705_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRechargeReward_7705_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRechargeReward_7705_descriptor, new String[]{"Type", "GotLastDay"});
      internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRecharge_7706_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRecharge_7706_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRecharge_7706_descriptor, new String[0]);
      internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRecharge_7707_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRecharge_7707_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRecharge_7707_descriptor, new String[]{"GotIds"});
      internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRechargeReward_7708_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRechargeReward_7708_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRechargeReward_7708_descriptor, new String[]{"Id"});
      internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRechargeReward_7709_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRechargeReward_7709_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRechargeReward_7709_descriptor, new String[]{"Result", "Id"});
      internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeRewardInfo_7710_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeRewardInfo_7710_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeRewardInfo_7710_descriptor, new String[0]);
      internal_static_recharge_com_gzbz_protobuf_ValueRechargeInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_recharge_com_gzbz_protobuf_ValueRechargeInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_ValueRechargeInfo_descriptor, new String[]{"Quantity", "Day", "TodayGot"});
      internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeRewardInfo_7711_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeRewardInfo_7711_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeRewardInfo_7711_descriptor, new String[]{"Infos"});
      internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeReward_7712_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeReward_7712_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeReward_7712_descriptor, new String[]{"Quantity", "Day"});
      internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeReward_7713_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeReward_7713_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeReward_7713_descriptor, new String[]{"Info"});
      internal_static_recharge_com_gzbz_protobuf_C2S_RechargeBillList_7715_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_recharge_com_gzbz_protobuf_C2S_RechargeBillList_7715_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_C2S_RechargeBillList_7715_descriptor, new String[0]);
      internal_static_recharge_com_gzbz_protobuf_C2S_RechargeByCoin_7717_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_recharge_com_gzbz_protobuf_C2S_RechargeByCoin_7717_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_C2S_RechargeByCoin_7717_descriptor, new String[]{"Money", "Platform", "RechargeType", "GoodId"});
      internal_static_recharge_com_gzbz_protobuf_S2C_RechargeByCoin_7718_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_recharge_com_gzbz_protobuf_S2C_RechargeByCoin_7718_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_S2C_RechargeByCoin_7718_descriptor, new String[]{"Money", "Platform", "RechargeType", "GoodId", "IsReal"});
      internal_static_recharge_com_gzbz_protobuf_S2C_KrJueBanRecharge_7719_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_recharge_com_gzbz_protobuf_S2C_KrJueBanRecharge_7719_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_S2C_KrJueBanRecharge_7719_descriptor, new String[]{"Infos", "GiftId"});
      internal_static_recharge_com_gzbz_protobuf_KrValueRechargeInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_recharge_com_gzbz_protobuf_KrValueRechargeInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_recharge_com_gzbz_protobuf_KrValueRechargeInfo_descriptor, new String[]{"GiftId", "Day"});
   }

   public static final class C2S_RechargeConfirm_7701 extends GeneratedMessageV3 implements C2S_RechargeConfirm_7701OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BILLNO_FIELD_NUMBER = 1;
      private volatile Object billNo_;
      private byte memoizedIsInitialized;
      private static final C2S_RechargeConfirm_7701 DEFAULT_INSTANCE = new C2S_RechargeConfirm_7701();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RechargeConfirm_7701> PARSER = new AbstractParser<C2S_RechargeConfirm_7701>() {
         public C2S_RechargeConfirm_7701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RechargeConfirm_7701(input, extensionRegistry);
         }
      };

      private C2S_RechargeConfirm_7701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RechargeConfirm_7701() {
         this.memoizedIsInitialized = -1;
         this.billNo_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RechargeConfirm_7701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RechargeConfirm_7701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1;
                        this.billNo_ = bs;
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
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RechargeConfirm_7701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RechargeConfirm_7701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RechargeConfirm_7701.class, Builder.class);
      }

      public boolean hasBillNo() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getBillNo() {
         Object ref = this.billNo_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.billNo_ = s;
            }

            return s;
         }
      }

      public ByteString getBillNoBytes() {
         Object ref = this.billNo_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.billNo_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBillNo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.billNo_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.billNo_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RechargeConfirm_7701)) {
            return super.equals(obj);
         } else {
            C2S_RechargeConfirm_7701 other = (C2S_RechargeConfirm_7701)obj;
            if (this.hasBillNo() != other.hasBillNo()) {
               return false;
            } else if (this.hasBillNo() && !this.getBillNo().equals(other.getBillNo())) {
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
            if (this.hasBillNo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBillNo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RechargeConfirm_7701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RechargeConfirm_7701)PARSER.parseFrom(data);
      }

      public static C2S_RechargeConfirm_7701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RechargeConfirm_7701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RechargeConfirm_7701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RechargeConfirm_7701)PARSER.parseFrom(data);
      }

      public static C2S_RechargeConfirm_7701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RechargeConfirm_7701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RechargeConfirm_7701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RechargeConfirm_7701)PARSER.parseFrom(data);
      }

      public static C2S_RechargeConfirm_7701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RechargeConfirm_7701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RechargeConfirm_7701 parseFrom(InputStream input) throws IOException {
         return (C2S_RechargeConfirm_7701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RechargeConfirm_7701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RechargeConfirm_7701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RechargeConfirm_7701 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RechargeConfirm_7701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RechargeConfirm_7701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RechargeConfirm_7701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RechargeConfirm_7701 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RechargeConfirm_7701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RechargeConfirm_7701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RechargeConfirm_7701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RechargeConfirm_7701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RechargeConfirm_7701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RechargeConfirm_7701> parser() {
         return PARSER;
      }

      public Parser<C2S_RechargeConfirm_7701> getParserForType() {
         return PARSER;
      }

      public C2S_RechargeConfirm_7701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RechargeConfirm_7701OrBuilder {
         private int bitField0_;
         private Object billNo_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RechargeConfirm_7701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RechargeConfirm_7701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RechargeConfirm_7701.class, Builder.class);
         }

         private Builder() {
            this.billNo_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.billNo_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.C2S_RechargeConfirm_7701.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.billNo_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RechargeConfirm_7701_descriptor;
         }

         public C2S_RechargeConfirm_7701 getDefaultInstanceForType() {
            return RechargeMsg.C2S_RechargeConfirm_7701.getDefaultInstance();
         }

         public C2S_RechargeConfirm_7701 build() {
            C2S_RechargeConfirm_7701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RechargeConfirm_7701 buildPartial() {
            C2S_RechargeConfirm_7701 result = new C2S_RechargeConfirm_7701(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.billNo_ = this.billNo_;
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
            if (other instanceof C2S_RechargeConfirm_7701) {
               return this.mergeFrom((C2S_RechargeConfirm_7701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RechargeConfirm_7701 other) {
            if (other == RechargeMsg.C2S_RechargeConfirm_7701.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBillNo()) {
                  this.bitField0_ |= 1;
                  this.billNo_ = other.billNo_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBillNo();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RechargeConfirm_7701 parsedMessage = null;

            try {
               parsedMessage = (C2S_RechargeConfirm_7701)RechargeMsg.C2S_RechargeConfirm_7701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RechargeConfirm_7701)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBillNo() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getBillNo() {
            Object ref = this.billNo_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.billNo_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getBillNoBytes() {
            Object ref = this.billNo_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.billNo_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setBillNo(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.billNo_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearBillNo() {
            this.bitField0_ &= -2;
            this.billNo_ = RechargeMsg.C2S_RechargeConfirm_7701.getDefaultInstance().getBillNo();
            this.onChanged();
            return this;
         }

         public Builder setBillNoBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.billNo_ = value;
               this.onChanged();
               return this;
            }
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RoleFirstRecharge_7702 extends GeneratedMessageV3 implements C2S_RoleFirstRecharge_7702OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RoleFirstRecharge_7702 DEFAULT_INSTANCE = new C2S_RoleFirstRecharge_7702();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RoleFirstRecharge_7702> PARSER = new AbstractParser<C2S_RoleFirstRecharge_7702>() {
         public C2S_RoleFirstRecharge_7702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RoleFirstRecharge_7702(input, extensionRegistry);
         }
      };

      private C2S_RoleFirstRecharge_7702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RoleFirstRecharge_7702() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RoleFirstRecharge_7702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RoleFirstRecharge_7702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRecharge_7702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRecharge_7702_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RoleFirstRecharge_7702.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RoleFirstRecharge_7702)) {
            return super.equals(obj);
         } else {
            C2S_RoleFirstRecharge_7702 other = (C2S_RoleFirstRecharge_7702)obj;
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

      public static C2S_RoleFirstRecharge_7702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RoleFirstRecharge_7702)PARSER.parseFrom(data);
      }

      public static C2S_RoleFirstRecharge_7702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RoleFirstRecharge_7702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RoleFirstRecharge_7702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RoleFirstRecharge_7702)PARSER.parseFrom(data);
      }

      public static C2S_RoleFirstRecharge_7702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RoleFirstRecharge_7702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RoleFirstRecharge_7702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RoleFirstRecharge_7702)PARSER.parseFrom(data);
      }

      public static C2S_RoleFirstRecharge_7702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RoleFirstRecharge_7702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RoleFirstRecharge_7702 parseFrom(InputStream input) throws IOException {
         return (C2S_RoleFirstRecharge_7702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RoleFirstRecharge_7702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RoleFirstRecharge_7702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RoleFirstRecharge_7702 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RoleFirstRecharge_7702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RoleFirstRecharge_7702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RoleFirstRecharge_7702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RoleFirstRecharge_7702 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RoleFirstRecharge_7702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RoleFirstRecharge_7702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RoleFirstRecharge_7702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RoleFirstRecharge_7702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RoleFirstRecharge_7702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RoleFirstRecharge_7702> parser() {
         return PARSER;
      }

      public Parser<C2S_RoleFirstRecharge_7702> getParserForType() {
         return PARSER;
      }

      public C2S_RoleFirstRecharge_7702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RoleFirstRecharge_7702OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRecharge_7702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRecharge_7702_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RoleFirstRecharge_7702.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.C2S_RoleFirstRecharge_7702.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRecharge_7702_descriptor;
         }

         public C2S_RoleFirstRecharge_7702 getDefaultInstanceForType() {
            return RechargeMsg.C2S_RoleFirstRecharge_7702.getDefaultInstance();
         }

         public C2S_RoleFirstRecharge_7702 build() {
            C2S_RoleFirstRecharge_7702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RoleFirstRecharge_7702 buildPartial() {
            C2S_RoleFirstRecharge_7702 result = new C2S_RoleFirstRecharge_7702(this);
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
            if (other instanceof C2S_RoleFirstRecharge_7702) {
               return this.mergeFrom((C2S_RoleFirstRecharge_7702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RoleFirstRecharge_7702 other) {
            if (other == RechargeMsg.C2S_RoleFirstRecharge_7702.getDefaultInstance()) {
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
            C2S_RoleFirstRecharge_7702 parsedMessage = null;

            try {
               parsedMessage = (C2S_RoleFirstRecharge_7702)RechargeMsg.C2S_RoleFirstRecharge_7702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RoleFirstRecharge_7702)e.getUnfinishedMessage();
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

   public static final class RoleFirstRecharge extends GeneratedMessageV3 implements RoleFirstRechargeOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int GOTLASTDAY_FIELD_NUMBER = 2;
      private int gotLastDay_;
      public static final int DAY_FIELD_NUMBER = 3;
      private int day_;
      private byte memoizedIsInitialized;
      private static final RoleFirstRecharge DEFAULT_INSTANCE = new RoleFirstRecharge();
      /** @deprecated */
      @Deprecated
      public static final Parser<RoleFirstRecharge> PARSER = new AbstractParser<RoleFirstRecharge>() {
         public RoleFirstRecharge parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RoleFirstRecharge(input, extensionRegistry);
         }
      };

      private RoleFirstRecharge(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RoleFirstRecharge() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RoleFirstRecharge();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RoleFirstRecharge(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gotLastDay_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.day_ = input.readInt32();
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
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_RoleFirstRecharge_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_RoleFirstRecharge_fieldAccessorTable.ensureFieldAccessorsInitialized(RoleFirstRecharge.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasGotLastDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGotLastDay() {
         return this.gotLastDay_;
      }

      public boolean hasDay() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDay() {
         return this.day_;
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
         } else if (!this.hasGotLastDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDay()) {
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
            output.writeInt32(2, this.gotLastDay_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.day_);
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
               size += CodedOutputStream.computeInt32Size(2, this.gotLastDay_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.day_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RoleFirstRecharge)) {
            return super.equals(obj);
         } else {
            RoleFirstRecharge other = (RoleFirstRecharge)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasGotLastDay() != other.hasGotLastDay()) {
               return false;
            } else if (this.hasGotLastDay() && this.getGotLastDay() != other.getGotLastDay()) {
               return false;
            } else if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
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

            if (this.hasGotLastDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGotLastDay();
            }

            if (this.hasDay()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RoleFirstRecharge parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RoleFirstRecharge)PARSER.parseFrom(data);
      }

      public static RoleFirstRecharge parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RoleFirstRecharge)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RoleFirstRecharge parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RoleFirstRecharge)PARSER.parseFrom(data);
      }

      public static RoleFirstRecharge parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RoleFirstRecharge)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RoleFirstRecharge parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RoleFirstRecharge)PARSER.parseFrom(data);
      }

      public static RoleFirstRecharge parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RoleFirstRecharge)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RoleFirstRecharge parseFrom(InputStream input) throws IOException {
         return (RoleFirstRecharge)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RoleFirstRecharge parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RoleFirstRecharge)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RoleFirstRecharge parseDelimitedFrom(InputStream input) throws IOException {
         return (RoleFirstRecharge)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RoleFirstRecharge parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RoleFirstRecharge)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RoleFirstRecharge parseFrom(CodedInputStream input) throws IOException {
         return (RoleFirstRecharge)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RoleFirstRecharge parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RoleFirstRecharge)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RoleFirstRecharge prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RoleFirstRecharge getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RoleFirstRecharge> parser() {
         return PARSER;
      }

      public Parser<RoleFirstRecharge> getParserForType() {
         return PARSER;
      }

      public RoleFirstRecharge getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RoleFirstRechargeOrBuilder {
         private int bitField0_;
         private int type_;
         private int gotLastDay_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_RoleFirstRecharge_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_RoleFirstRecharge_fieldAccessorTable.ensureFieldAccessorsInitialized(RoleFirstRecharge.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.RoleFirstRecharge.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.gotLastDay_ = 0;
            this.bitField0_ &= -3;
            this.day_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_RoleFirstRecharge_descriptor;
         }

         public RoleFirstRecharge getDefaultInstanceForType() {
            return RechargeMsg.RoleFirstRecharge.getDefaultInstance();
         }

         public RoleFirstRecharge build() {
            RoleFirstRecharge result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RoleFirstRecharge buildPartial() {
            RoleFirstRecharge result = new RoleFirstRecharge(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.gotLastDay_ = this.gotLastDay_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.day_ = this.day_;
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
            if (other instanceof RoleFirstRecharge) {
               return this.mergeFrom((RoleFirstRecharge)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RoleFirstRecharge other) {
            if (other == RechargeMsg.RoleFirstRecharge.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasGotLastDay()) {
                  this.setGotLastDay(other.getGotLastDay());
               }

               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasGotLastDay()) {
               return false;
            } else {
               return this.hasDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RoleFirstRecharge parsedMessage = null;

            try {
               parsedMessage = (RoleFirstRecharge)RechargeMsg.RoleFirstRecharge.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RoleFirstRecharge)e.getUnfinishedMessage();
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

         public boolean hasGotLastDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGotLastDay() {
            return this.gotLastDay_;
         }

         public Builder setGotLastDay(int value) {
            this.bitField0_ |= 2;
            this.gotLastDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotLastDay() {
            this.bitField0_ &= -3;
            this.gotLastDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 4;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -5;
            this.day_ = 0;
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

   public static final class S2C_RoleFirstRecharge_7703 extends GeneratedMessageV3 implements S2C_RoleFirstRecharge_7703OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<RoleFirstRecharge> info_;
      public static final int ISOPEN_FIELD_NUMBER = 2;
      private boolean isOpen_;
      private byte memoizedIsInitialized;
      private static final S2C_RoleFirstRecharge_7703 DEFAULT_INSTANCE = new S2C_RoleFirstRecharge_7703();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RoleFirstRecharge_7703> PARSER = new AbstractParser<S2C_RoleFirstRecharge_7703>() {
         public S2C_RoleFirstRecharge_7703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RoleFirstRecharge_7703(input, extensionRegistry);
         }
      };

      private S2C_RoleFirstRecharge_7703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RoleFirstRecharge_7703() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RoleFirstRecharge_7703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RoleFirstRecharge_7703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.info_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.info_.add(input.readMessage(RechargeMsg.RoleFirstRecharge.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.isOpen_ = input.readBool();
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
                  this.info_ = Collections.unmodifiableList(this.info_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRecharge_7703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRecharge_7703_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RoleFirstRecharge_7703.class, Builder.class);
      }

      public List<RoleFirstRecharge> getInfoList() {
         return this.info_;
      }

      public List<? extends RoleFirstRechargeOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public RoleFirstRecharge getInfo(int index) {
         return (RoleFirstRecharge)this.info_.get(index);
      }

      public RoleFirstRechargeOrBuilder getInfoOrBuilder(int index) {
         return (RoleFirstRechargeOrBuilder)this.info_.get(index);
      }

      public boolean hasIsOpen() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsOpen() {
         return this.isOpen_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsOpen()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getInfoCount(); ++i) {
               if (!this.getInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.info_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.info_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(2, this.isOpen_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.info_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.info_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isOpen_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RoleFirstRecharge_7703)) {
            return super.equals(obj);
         } else {
            S2C_RoleFirstRecharge_7703 other = (S2C_RoleFirstRecharge_7703)obj;
            if (!this.getInfoList().equals(other.getInfoList())) {
               return false;
            } else if (this.hasIsOpen() != other.hasIsOpen()) {
               return false;
            } else if (this.hasIsOpen() && this.getIsOpen() != other.getIsOpen()) {
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
            if (this.getInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfoList().hashCode();
            }

            if (this.hasIsOpen()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsOpen());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RoleFirstRecharge_7703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RoleFirstRecharge_7703)PARSER.parseFrom(data);
      }

      public static S2C_RoleFirstRecharge_7703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RoleFirstRecharge_7703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RoleFirstRecharge_7703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RoleFirstRecharge_7703)PARSER.parseFrom(data);
      }

      public static S2C_RoleFirstRecharge_7703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RoleFirstRecharge_7703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RoleFirstRecharge_7703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RoleFirstRecharge_7703)PARSER.parseFrom(data);
      }

      public static S2C_RoleFirstRecharge_7703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RoleFirstRecharge_7703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RoleFirstRecharge_7703 parseFrom(InputStream input) throws IOException {
         return (S2C_RoleFirstRecharge_7703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RoleFirstRecharge_7703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RoleFirstRecharge_7703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RoleFirstRecharge_7703 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RoleFirstRecharge_7703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RoleFirstRecharge_7703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RoleFirstRecharge_7703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RoleFirstRecharge_7703 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RoleFirstRecharge_7703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RoleFirstRecharge_7703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RoleFirstRecharge_7703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RoleFirstRecharge_7703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RoleFirstRecharge_7703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RoleFirstRecharge_7703> parser() {
         return PARSER;
      }

      public Parser<S2C_RoleFirstRecharge_7703> getParserForType() {
         return PARSER;
      }

      public S2C_RoleFirstRecharge_7703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RoleFirstRecharge_7703OrBuilder {
         private int bitField0_;
         private List<RoleFirstRecharge> info_;
         private RepeatedFieldBuilderV3<RoleFirstRecharge, RoleFirstRecharge.Builder, RoleFirstRechargeOrBuilder> infoBuilder_;
         private boolean isOpen_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRecharge_7703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRecharge_7703_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RoleFirstRecharge_7703.class, Builder.class);
         }

         private Builder() {
            this.info_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.info_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.S2C_RoleFirstRecharge_7703.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infoBuilder_.clear();
            }

            this.isOpen_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRecharge_7703_descriptor;
         }

         public S2C_RoleFirstRecharge_7703 getDefaultInstanceForType() {
            return RechargeMsg.S2C_RoleFirstRecharge_7703.getDefaultInstance();
         }

         public S2C_RoleFirstRecharge_7703 build() {
            S2C_RoleFirstRecharge_7703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RoleFirstRecharge_7703 buildPartial() {
            S2C_RoleFirstRecharge_7703 result = new S2C_RoleFirstRecharge_7703(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -2;
               }

               result.info_ = this.info_;
            } else {
               result.info_ = this.infoBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isOpen_ = this.isOpen_;
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
            if (other instanceof S2C_RoleFirstRecharge_7703) {
               return this.mergeFrom((S2C_RoleFirstRecharge_7703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RoleFirstRecharge_7703 other) {
            if (other == RechargeMsg.S2C_RoleFirstRecharge_7703.getDefaultInstance()) {
               return this;
            } else {
               if (this.infoBuilder_ == null) {
                  if (!other.info_.isEmpty()) {
                     if (this.info_.isEmpty()) {
                        this.info_ = other.info_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureInfoIsMutable();
                        this.info_.addAll(other.info_);
                     }

                     this.onChanged();
                  }
               } else if (!other.info_.isEmpty()) {
                  if (this.infoBuilder_.isEmpty()) {
                     this.infoBuilder_.dispose();
                     this.infoBuilder_ = null;
                     this.info_ = other.info_;
                     this.bitField0_ &= -2;
                     this.infoBuilder_ = RechargeMsg.S2C_RoleFirstRecharge_7703.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
                  } else {
                     this.infoBuilder_.addAllMessages(other.info_);
                  }
               }

               if (other.hasIsOpen()) {
                  this.setIsOpen(other.getIsOpen());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIsOpen()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfoCount(); ++i) {
                  if (!this.getInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RoleFirstRecharge_7703 parsedMessage = null;

            try {
               parsedMessage = (S2C_RoleFirstRecharge_7703)RechargeMsg.S2C_RoleFirstRecharge_7703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RoleFirstRecharge_7703)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.info_ = new ArrayList(this.info_);
               this.bitField0_ |= 1;
            }

         }

         public List<RoleFirstRecharge> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public RoleFirstRecharge getInfo(int index) {
            return this.infoBuilder_ == null ? (RoleFirstRecharge)this.info_.get(index) : (RoleFirstRecharge)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, RoleFirstRecharge value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.set(index, value);
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfo(int index, RoleFirstRecharge.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(RoleFirstRecharge value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.add(value);
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfo(int index, RoleFirstRecharge value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.add(index, value);
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfo(RoleFirstRecharge.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, RoleFirstRecharge.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends RoleFirstRecharge> values) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.info_);
               this.onChanged();
            } else {
               this.infoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfo(int index) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.remove(index);
               this.onChanged();
            } else {
               this.infoBuilder_.remove(index);
            }

            return this;
         }

         public RoleFirstRecharge.Builder getInfoBuilder(int index) {
            return (RoleFirstRecharge.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public RoleFirstRechargeOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (RoleFirstRechargeOrBuilder)this.info_.get(index) : (RoleFirstRechargeOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RoleFirstRechargeOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public RoleFirstRecharge.Builder addInfoBuilder() {
            return (RoleFirstRecharge.Builder)this.getInfoFieldBuilder().addBuilder(RechargeMsg.RoleFirstRecharge.getDefaultInstance());
         }

         public RoleFirstRecharge.Builder addInfoBuilder(int index) {
            return (RoleFirstRecharge.Builder)this.getInfoFieldBuilder().addBuilder(index, RechargeMsg.RoleFirstRecharge.getDefaultInstance());
         }

         public List<RoleFirstRecharge.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RoleFirstRecharge, RoleFirstRecharge.Builder, RoleFirstRechargeOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public boolean hasIsOpen() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsOpen() {
            return this.isOpen_;
         }

         public Builder setIsOpen(boolean value) {
            this.bitField0_ |= 2;
            this.isOpen_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsOpen() {
            this.bitField0_ &= -3;
            this.isOpen_ = false;
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

   public static final class C2S_RoleFirstRechargeReward_7704 extends GeneratedMessageV3 implements C2S_RoleFirstRechargeReward_7704OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_RoleFirstRechargeReward_7704 DEFAULT_INSTANCE = new C2S_RoleFirstRechargeReward_7704();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RoleFirstRechargeReward_7704> PARSER = new AbstractParser<C2S_RoleFirstRechargeReward_7704>() {
         public C2S_RoleFirstRechargeReward_7704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RoleFirstRechargeReward_7704(input, extensionRegistry);
         }
      };

      private C2S_RoleFirstRechargeReward_7704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RoleFirstRechargeReward_7704() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RoleFirstRechargeReward_7704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RoleFirstRechargeReward_7704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRechargeReward_7704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRechargeReward_7704_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RoleFirstRechargeReward_7704.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.type_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RoleFirstRechargeReward_7704)) {
            return super.equals(obj);
         } else {
            C2S_RoleFirstRechargeReward_7704 other = (C2S_RoleFirstRechargeReward_7704)obj;
            if (this.hasType() != other.hasType()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RoleFirstRechargeReward_7704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RoleFirstRechargeReward_7704)PARSER.parseFrom(data);
      }

      public static C2S_RoleFirstRechargeReward_7704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RoleFirstRechargeReward_7704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RoleFirstRechargeReward_7704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RoleFirstRechargeReward_7704)PARSER.parseFrom(data);
      }

      public static C2S_RoleFirstRechargeReward_7704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RoleFirstRechargeReward_7704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RoleFirstRechargeReward_7704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RoleFirstRechargeReward_7704)PARSER.parseFrom(data);
      }

      public static C2S_RoleFirstRechargeReward_7704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RoleFirstRechargeReward_7704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RoleFirstRechargeReward_7704 parseFrom(InputStream input) throws IOException {
         return (C2S_RoleFirstRechargeReward_7704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RoleFirstRechargeReward_7704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RoleFirstRechargeReward_7704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RoleFirstRechargeReward_7704 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RoleFirstRechargeReward_7704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RoleFirstRechargeReward_7704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RoleFirstRechargeReward_7704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RoleFirstRechargeReward_7704 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RoleFirstRechargeReward_7704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RoleFirstRechargeReward_7704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RoleFirstRechargeReward_7704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RoleFirstRechargeReward_7704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RoleFirstRechargeReward_7704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RoleFirstRechargeReward_7704> parser() {
         return PARSER;
      }

      public Parser<C2S_RoleFirstRechargeReward_7704> getParserForType() {
         return PARSER;
      }

      public C2S_RoleFirstRechargeReward_7704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RoleFirstRechargeReward_7704OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRechargeReward_7704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRechargeReward_7704_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RoleFirstRechargeReward_7704.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.C2S_RoleFirstRechargeReward_7704.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RoleFirstRechargeReward_7704_descriptor;
         }

         public C2S_RoleFirstRechargeReward_7704 getDefaultInstanceForType() {
            return RechargeMsg.C2S_RoleFirstRechargeReward_7704.getDefaultInstance();
         }

         public C2S_RoleFirstRechargeReward_7704 build() {
            C2S_RoleFirstRechargeReward_7704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RoleFirstRechargeReward_7704 buildPartial() {
            C2S_RoleFirstRechargeReward_7704 result = new C2S_RoleFirstRechargeReward_7704(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof C2S_RoleFirstRechargeReward_7704) {
               return this.mergeFrom((C2S_RoleFirstRechargeReward_7704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RoleFirstRechargeReward_7704 other) {
            if (other == RechargeMsg.C2S_RoleFirstRechargeReward_7704.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RoleFirstRechargeReward_7704 parsedMessage = null;

            try {
               parsedMessage = (C2S_RoleFirstRechargeReward_7704)RechargeMsg.C2S_RoleFirstRechargeReward_7704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RoleFirstRechargeReward_7704)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_RoleFirstRechargeReward_7705 extends GeneratedMessageV3 implements S2C_RoleFirstRechargeReward_7705OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int GOTLASTDAY_FIELD_NUMBER = 2;
      private int gotLastDay_;
      private byte memoizedIsInitialized;
      private static final S2C_RoleFirstRechargeReward_7705 DEFAULT_INSTANCE = new S2C_RoleFirstRechargeReward_7705();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RoleFirstRechargeReward_7705> PARSER = new AbstractParser<S2C_RoleFirstRechargeReward_7705>() {
         public S2C_RoleFirstRechargeReward_7705 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RoleFirstRechargeReward_7705(input, extensionRegistry);
         }
      };

      private S2C_RoleFirstRechargeReward_7705(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RoleFirstRechargeReward_7705() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RoleFirstRechargeReward_7705();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RoleFirstRechargeReward_7705(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gotLastDay_ = input.readInt32();
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
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRechargeReward_7705_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRechargeReward_7705_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RoleFirstRechargeReward_7705.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasGotLastDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGotLastDay() {
         return this.gotLastDay_;
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
         } else if (!this.hasGotLastDay()) {
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
            output.writeInt32(2, this.gotLastDay_);
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
               size += CodedOutputStream.computeInt32Size(2, this.gotLastDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RoleFirstRechargeReward_7705)) {
            return super.equals(obj);
         } else {
            S2C_RoleFirstRechargeReward_7705 other = (S2C_RoleFirstRechargeReward_7705)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasGotLastDay() != other.hasGotLastDay()) {
               return false;
            } else if (this.hasGotLastDay() && this.getGotLastDay() != other.getGotLastDay()) {
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

            if (this.hasGotLastDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGotLastDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RoleFirstRechargeReward_7705 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RoleFirstRechargeReward_7705)PARSER.parseFrom(data);
      }

      public static S2C_RoleFirstRechargeReward_7705 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RoleFirstRechargeReward_7705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RoleFirstRechargeReward_7705 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RoleFirstRechargeReward_7705)PARSER.parseFrom(data);
      }

      public static S2C_RoleFirstRechargeReward_7705 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RoleFirstRechargeReward_7705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RoleFirstRechargeReward_7705 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RoleFirstRechargeReward_7705)PARSER.parseFrom(data);
      }

      public static S2C_RoleFirstRechargeReward_7705 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RoleFirstRechargeReward_7705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RoleFirstRechargeReward_7705 parseFrom(InputStream input) throws IOException {
         return (S2C_RoleFirstRechargeReward_7705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RoleFirstRechargeReward_7705 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RoleFirstRechargeReward_7705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RoleFirstRechargeReward_7705 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RoleFirstRechargeReward_7705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RoleFirstRechargeReward_7705 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RoleFirstRechargeReward_7705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RoleFirstRechargeReward_7705 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RoleFirstRechargeReward_7705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RoleFirstRechargeReward_7705 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RoleFirstRechargeReward_7705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RoleFirstRechargeReward_7705 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RoleFirstRechargeReward_7705 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RoleFirstRechargeReward_7705> parser() {
         return PARSER;
      }

      public Parser<S2C_RoleFirstRechargeReward_7705> getParserForType() {
         return PARSER;
      }

      public S2C_RoleFirstRechargeReward_7705 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RoleFirstRechargeReward_7705OrBuilder {
         private int bitField0_;
         private int type_;
         private int gotLastDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRechargeReward_7705_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRechargeReward_7705_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RoleFirstRechargeReward_7705.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.S2C_RoleFirstRechargeReward_7705.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.gotLastDay_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_RoleFirstRechargeReward_7705_descriptor;
         }

         public S2C_RoleFirstRechargeReward_7705 getDefaultInstanceForType() {
            return RechargeMsg.S2C_RoleFirstRechargeReward_7705.getDefaultInstance();
         }

         public S2C_RoleFirstRechargeReward_7705 build() {
            S2C_RoleFirstRechargeReward_7705 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RoleFirstRechargeReward_7705 buildPartial() {
            S2C_RoleFirstRechargeReward_7705 result = new S2C_RoleFirstRechargeReward_7705(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.gotLastDay_ = this.gotLastDay_;
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
            if (other instanceof S2C_RoleFirstRechargeReward_7705) {
               return this.mergeFrom((S2C_RoleFirstRechargeReward_7705)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RoleFirstRechargeReward_7705 other) {
            if (other == RechargeMsg.S2C_RoleFirstRechargeReward_7705.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasGotLastDay()) {
                  this.setGotLastDay(other.getGotLastDay());
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
               return this.hasGotLastDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RoleFirstRechargeReward_7705 parsedMessage = null;

            try {
               parsedMessage = (S2C_RoleFirstRechargeReward_7705)RechargeMsg.S2C_RoleFirstRechargeReward_7705.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RoleFirstRechargeReward_7705)e.getUnfinishedMessage();
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

         public boolean hasGotLastDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGotLastDay() {
            return this.gotLastDay_;
         }

         public Builder setGotLastDay(int value) {
            this.bitField0_ |= 2;
            this.gotLastDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotLastDay() {
            this.bitField0_ &= -3;
            this.gotLastDay_ = 0;
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

   public static final class C2S_DailyFirstRecharge_7706 extends GeneratedMessageV3 implements C2S_DailyFirstRecharge_7706OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DailyFirstRecharge_7706 DEFAULT_INSTANCE = new C2S_DailyFirstRecharge_7706();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DailyFirstRecharge_7706> PARSER = new AbstractParser<C2S_DailyFirstRecharge_7706>() {
         public C2S_DailyFirstRecharge_7706 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DailyFirstRecharge_7706(input, extensionRegistry);
         }
      };

      private C2S_DailyFirstRecharge_7706(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DailyFirstRecharge_7706() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DailyFirstRecharge_7706();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DailyFirstRecharge_7706(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRecharge_7706_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRecharge_7706_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailyFirstRecharge_7706.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DailyFirstRecharge_7706)) {
            return super.equals(obj);
         } else {
            C2S_DailyFirstRecharge_7706 other = (C2S_DailyFirstRecharge_7706)obj;
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

      public static C2S_DailyFirstRecharge_7706 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DailyFirstRecharge_7706)PARSER.parseFrom(data);
      }

      public static C2S_DailyFirstRecharge_7706 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyFirstRecharge_7706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyFirstRecharge_7706 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DailyFirstRecharge_7706)PARSER.parseFrom(data);
      }

      public static C2S_DailyFirstRecharge_7706 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyFirstRecharge_7706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyFirstRecharge_7706 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DailyFirstRecharge_7706)PARSER.parseFrom(data);
      }

      public static C2S_DailyFirstRecharge_7706 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyFirstRecharge_7706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyFirstRecharge_7706 parseFrom(InputStream input) throws IOException {
         return (C2S_DailyFirstRecharge_7706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailyFirstRecharge_7706 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyFirstRecharge_7706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailyFirstRecharge_7706 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DailyFirstRecharge_7706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DailyFirstRecharge_7706 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyFirstRecharge_7706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailyFirstRecharge_7706 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DailyFirstRecharge_7706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailyFirstRecharge_7706 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyFirstRecharge_7706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DailyFirstRecharge_7706 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DailyFirstRecharge_7706 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DailyFirstRecharge_7706> parser() {
         return PARSER;
      }

      public Parser<C2S_DailyFirstRecharge_7706> getParserForType() {
         return PARSER;
      }

      public C2S_DailyFirstRecharge_7706 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DailyFirstRecharge_7706OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRecharge_7706_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRecharge_7706_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailyFirstRecharge_7706.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.C2S_DailyFirstRecharge_7706.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRecharge_7706_descriptor;
         }

         public C2S_DailyFirstRecharge_7706 getDefaultInstanceForType() {
            return RechargeMsg.C2S_DailyFirstRecharge_7706.getDefaultInstance();
         }

         public C2S_DailyFirstRecharge_7706 build() {
            C2S_DailyFirstRecharge_7706 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DailyFirstRecharge_7706 buildPartial() {
            C2S_DailyFirstRecharge_7706 result = new C2S_DailyFirstRecharge_7706(this);
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
            if (other instanceof C2S_DailyFirstRecharge_7706) {
               return this.mergeFrom((C2S_DailyFirstRecharge_7706)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DailyFirstRecharge_7706 other) {
            if (other == RechargeMsg.C2S_DailyFirstRecharge_7706.getDefaultInstance()) {
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
            C2S_DailyFirstRecharge_7706 parsedMessage = null;

            try {
               parsedMessage = (C2S_DailyFirstRecharge_7706)RechargeMsg.C2S_DailyFirstRecharge_7706.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DailyFirstRecharge_7706)e.getUnfinishedMessage();
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

   public static final class S2C_DailyFirstRecharge_7707 extends GeneratedMessageV3 implements S2C_DailyFirstRecharge_7707OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GOTIDS_FIELD_NUMBER = 1;
      private Internal.IntList gotIds_;
      private byte memoizedIsInitialized;
      private static final S2C_DailyFirstRecharge_7707 DEFAULT_INSTANCE = new S2C_DailyFirstRecharge_7707();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DailyFirstRecharge_7707> PARSER = new AbstractParser<S2C_DailyFirstRecharge_7707>() {
         public S2C_DailyFirstRecharge_7707 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DailyFirstRecharge_7707(input, extensionRegistry);
         }
      };

      private S2C_DailyFirstRecharge_7707(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DailyFirstRecharge_7707() {
         this.memoizedIsInitialized = -1;
         this.gotIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DailyFirstRecharge_7707();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DailyFirstRecharge_7707(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.gotIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.gotIds_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotIds_.addInt(input.readInt32());
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
                  this.gotIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRecharge_7707_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRecharge_7707_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailyFirstRecharge_7707.class, Builder.class);
      }

      public List<Integer> getGotIdsList() {
         return this.gotIds_;
      }

      public int getGotIdsCount() {
         return this.gotIds_.size();
      }

      public int getGotIds(int index) {
         return this.gotIds_.getInt(index);
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
         for(int i = 0; i < this.gotIds_.size(); ++i) {
            output.writeInt32(1, this.gotIds_.getInt(i));
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

            for(int i = 0; i < this.gotIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DailyFirstRecharge_7707)) {
            return super.equals(obj);
         } else {
            S2C_DailyFirstRecharge_7707 other = (S2C_DailyFirstRecharge_7707)obj;
            if (!this.getGotIdsList().equals(other.getGotIdsList())) {
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
            if (this.getGotIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGotIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DailyFirstRecharge_7707 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DailyFirstRecharge_7707)PARSER.parseFrom(data);
      }

      public static S2C_DailyFirstRecharge_7707 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyFirstRecharge_7707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyFirstRecharge_7707 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DailyFirstRecharge_7707)PARSER.parseFrom(data);
      }

      public static S2C_DailyFirstRecharge_7707 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyFirstRecharge_7707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyFirstRecharge_7707 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DailyFirstRecharge_7707)PARSER.parseFrom(data);
      }

      public static S2C_DailyFirstRecharge_7707 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyFirstRecharge_7707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyFirstRecharge_7707 parseFrom(InputStream input) throws IOException {
         return (S2C_DailyFirstRecharge_7707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailyFirstRecharge_7707 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyFirstRecharge_7707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailyFirstRecharge_7707 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DailyFirstRecharge_7707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DailyFirstRecharge_7707 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyFirstRecharge_7707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailyFirstRecharge_7707 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DailyFirstRecharge_7707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailyFirstRecharge_7707 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyFirstRecharge_7707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DailyFirstRecharge_7707 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DailyFirstRecharge_7707 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DailyFirstRecharge_7707> parser() {
         return PARSER;
      }

      public Parser<S2C_DailyFirstRecharge_7707> getParserForType() {
         return PARSER;
      }

      public S2C_DailyFirstRecharge_7707 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DailyFirstRecharge_7707OrBuilder {
         private int bitField0_;
         private Internal.IntList gotIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRecharge_7707_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRecharge_7707_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailyFirstRecharge_7707.class, Builder.class);
         }

         private Builder() {
            this.gotIds_ = RechargeMsg.S2C_DailyFirstRecharge_7707.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotIds_ = RechargeMsg.S2C_DailyFirstRecharge_7707.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.S2C_DailyFirstRecharge_7707.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gotIds_ = RechargeMsg.S2C_DailyFirstRecharge_7707.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRecharge_7707_descriptor;
         }

         public S2C_DailyFirstRecharge_7707 getDefaultInstanceForType() {
            return RechargeMsg.S2C_DailyFirstRecharge_7707.getDefaultInstance();
         }

         public S2C_DailyFirstRecharge_7707 build() {
            S2C_DailyFirstRecharge_7707 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DailyFirstRecharge_7707 buildPartial() {
            S2C_DailyFirstRecharge_7707 result = new S2C_DailyFirstRecharge_7707(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.gotIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.gotIds_ = this.gotIds_;
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
            if (other instanceof S2C_DailyFirstRecharge_7707) {
               return this.mergeFrom((S2C_DailyFirstRecharge_7707)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DailyFirstRecharge_7707 other) {
            if (other == RechargeMsg.S2C_DailyFirstRecharge_7707.getDefaultInstance()) {
               return this;
            } else {
               if (!other.gotIds_.isEmpty()) {
                  if (this.gotIds_.isEmpty()) {
                     this.gotIds_ = other.gotIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureGotIdsIsMutable();
                     this.gotIds_.addAll(other.gotIds_);
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
            S2C_DailyFirstRecharge_7707 parsedMessage = null;

            try {
               parsedMessage = (S2C_DailyFirstRecharge_7707)RechargeMsg.S2C_DailyFirstRecharge_7707.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DailyFirstRecharge_7707)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGotIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.gotIds_ = RechargeMsg.S2C_DailyFirstRecharge_7707.mutableCopy(this.gotIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getGotIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.gotIds_) : this.gotIds_);
         }

         public int getGotIdsCount() {
            return this.gotIds_.size();
         }

         public int getGotIds(int index) {
            return this.gotIds_.getInt(index);
         }

         public Builder setGotIds(int index, int value) {
            this.ensureGotIdsIsMutable();
            this.gotIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotIds(int value) {
            this.ensureGotIdsIsMutable();
            this.gotIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotIds(Iterable<? extends Integer> values) {
            this.ensureGotIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotIds_);
            this.onChanged();
            return this;
         }

         public Builder clearGotIds() {
            this.gotIds_ = RechargeMsg.S2C_DailyFirstRecharge_7707.emptyIntList();
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

   public static final class C2S_DailyFirstRechargeReward_7708 extends GeneratedMessageV3 implements C2S_DailyFirstRechargeReward_7708OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_DailyFirstRechargeReward_7708 DEFAULT_INSTANCE = new C2S_DailyFirstRechargeReward_7708();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DailyFirstRechargeReward_7708> PARSER = new AbstractParser<C2S_DailyFirstRechargeReward_7708>() {
         public C2S_DailyFirstRechargeReward_7708 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DailyFirstRechargeReward_7708(input, extensionRegistry);
         }
      };

      private C2S_DailyFirstRechargeReward_7708(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DailyFirstRechargeReward_7708() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DailyFirstRechargeReward_7708();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DailyFirstRechargeReward_7708(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.id_ = input.readInt32();
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
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRechargeReward_7708_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRechargeReward_7708_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailyFirstRechargeReward_7708.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.id_);
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
               size += CodedOutputStream.computeInt32Size(1, this.id_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_DailyFirstRechargeReward_7708)) {
            return super.equals(obj);
         } else {
            C2S_DailyFirstRechargeReward_7708 other = (C2S_DailyFirstRechargeReward_7708)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
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
            if (this.hasId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_DailyFirstRechargeReward_7708 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DailyFirstRechargeReward_7708)PARSER.parseFrom(data);
      }

      public static C2S_DailyFirstRechargeReward_7708 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyFirstRechargeReward_7708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyFirstRechargeReward_7708 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DailyFirstRechargeReward_7708)PARSER.parseFrom(data);
      }

      public static C2S_DailyFirstRechargeReward_7708 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyFirstRechargeReward_7708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyFirstRechargeReward_7708 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DailyFirstRechargeReward_7708)PARSER.parseFrom(data);
      }

      public static C2S_DailyFirstRechargeReward_7708 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyFirstRechargeReward_7708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyFirstRechargeReward_7708 parseFrom(InputStream input) throws IOException {
         return (C2S_DailyFirstRechargeReward_7708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailyFirstRechargeReward_7708 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyFirstRechargeReward_7708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailyFirstRechargeReward_7708 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DailyFirstRechargeReward_7708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DailyFirstRechargeReward_7708 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyFirstRechargeReward_7708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailyFirstRechargeReward_7708 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DailyFirstRechargeReward_7708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailyFirstRechargeReward_7708 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyFirstRechargeReward_7708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DailyFirstRechargeReward_7708 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DailyFirstRechargeReward_7708 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DailyFirstRechargeReward_7708> parser() {
         return PARSER;
      }

      public Parser<C2S_DailyFirstRechargeReward_7708> getParserForType() {
         return PARSER;
      }

      public C2S_DailyFirstRechargeReward_7708 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DailyFirstRechargeReward_7708OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRechargeReward_7708_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRechargeReward_7708_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailyFirstRechargeReward_7708.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.C2S_DailyFirstRechargeReward_7708.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_DailyFirstRechargeReward_7708_descriptor;
         }

         public C2S_DailyFirstRechargeReward_7708 getDefaultInstanceForType() {
            return RechargeMsg.C2S_DailyFirstRechargeReward_7708.getDefaultInstance();
         }

         public C2S_DailyFirstRechargeReward_7708 build() {
            C2S_DailyFirstRechargeReward_7708 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DailyFirstRechargeReward_7708 buildPartial() {
            C2S_DailyFirstRechargeReward_7708 result = new C2S_DailyFirstRechargeReward_7708(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
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
            if (other instanceof C2S_DailyFirstRechargeReward_7708) {
               return this.mergeFrom((C2S_DailyFirstRechargeReward_7708)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DailyFirstRechargeReward_7708 other) {
            if (other == RechargeMsg.C2S_DailyFirstRechargeReward_7708.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_DailyFirstRechargeReward_7708 parsedMessage = null;

            try {
               parsedMessage = (C2S_DailyFirstRechargeReward_7708)RechargeMsg.C2S_DailyFirstRechargeReward_7708.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DailyFirstRechargeReward_7708)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 1;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -2;
            this.id_ = 0;
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

   public static final class S2C_DailyFirstRechargeReward_7709 extends GeneratedMessageV3 implements S2C_DailyFirstRechargeReward_7709OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_DailyFirstRechargeReward_7709 DEFAULT_INSTANCE = new S2C_DailyFirstRechargeReward_7709();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DailyFirstRechargeReward_7709> PARSER = new AbstractParser<S2C_DailyFirstRechargeReward_7709>() {
         public S2C_DailyFirstRechargeReward_7709 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DailyFirstRechargeReward_7709(input, extensionRegistry);
         }
      };

      private S2C_DailyFirstRechargeReward_7709(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DailyFirstRechargeReward_7709() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DailyFirstRechargeReward_7709();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DailyFirstRechargeReward_7709(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.result_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.id_ = input.readInt32();
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
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRechargeReward_7709_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRechargeReward_7709_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailyFirstRechargeReward_7709.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DailyFirstRechargeReward_7709)) {
            return super.equals(obj);
         } else {
            S2C_DailyFirstRechargeReward_7709 other = (S2C_DailyFirstRechargeReward_7709)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DailyFirstRechargeReward_7709 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DailyFirstRechargeReward_7709)PARSER.parseFrom(data);
      }

      public static S2C_DailyFirstRechargeReward_7709 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyFirstRechargeReward_7709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyFirstRechargeReward_7709 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DailyFirstRechargeReward_7709)PARSER.parseFrom(data);
      }

      public static S2C_DailyFirstRechargeReward_7709 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyFirstRechargeReward_7709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyFirstRechargeReward_7709 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DailyFirstRechargeReward_7709)PARSER.parseFrom(data);
      }

      public static S2C_DailyFirstRechargeReward_7709 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyFirstRechargeReward_7709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyFirstRechargeReward_7709 parseFrom(InputStream input) throws IOException {
         return (S2C_DailyFirstRechargeReward_7709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailyFirstRechargeReward_7709 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyFirstRechargeReward_7709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailyFirstRechargeReward_7709 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DailyFirstRechargeReward_7709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DailyFirstRechargeReward_7709 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyFirstRechargeReward_7709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailyFirstRechargeReward_7709 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DailyFirstRechargeReward_7709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailyFirstRechargeReward_7709 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyFirstRechargeReward_7709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DailyFirstRechargeReward_7709 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DailyFirstRechargeReward_7709 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DailyFirstRechargeReward_7709> parser() {
         return PARSER;
      }

      public Parser<S2C_DailyFirstRechargeReward_7709> getParserForType() {
         return PARSER;
      }

      public S2C_DailyFirstRechargeReward_7709 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DailyFirstRechargeReward_7709OrBuilder {
         private int bitField0_;
         private int result_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRechargeReward_7709_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRechargeReward_7709_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailyFirstRechargeReward_7709.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.S2C_DailyFirstRechargeReward_7709.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_DailyFirstRechargeReward_7709_descriptor;
         }

         public S2C_DailyFirstRechargeReward_7709 getDefaultInstanceForType() {
            return RechargeMsg.S2C_DailyFirstRechargeReward_7709.getDefaultInstance();
         }

         public S2C_DailyFirstRechargeReward_7709 build() {
            S2C_DailyFirstRechargeReward_7709 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DailyFirstRechargeReward_7709 buildPartial() {
            S2C_DailyFirstRechargeReward_7709 result = new S2C_DailyFirstRechargeReward_7709(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
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
            if (other instanceof S2C_DailyFirstRechargeReward_7709) {
               return this.mergeFrom((S2C_DailyFirstRechargeReward_7709)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DailyFirstRechargeReward_7709 other) {
            if (other == RechargeMsg.S2C_DailyFirstRechargeReward_7709.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else {
               return this.hasId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DailyFirstRechargeReward_7709 parsedMessage = null;

            try {
               parsedMessage = (S2C_DailyFirstRechargeReward_7709)RechargeMsg.S2C_DailyFirstRechargeReward_7709.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DailyFirstRechargeReward_7709)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 1;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 2;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -3;
            this.id_ = 0;
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

   public static final class C2S_ValueRechargeRewardInfo_7710 extends GeneratedMessageV3 implements C2S_ValueRechargeRewardInfo_7710OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ValueRechargeRewardInfo_7710 DEFAULT_INSTANCE = new C2S_ValueRechargeRewardInfo_7710();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ValueRechargeRewardInfo_7710> PARSER = new AbstractParser<C2S_ValueRechargeRewardInfo_7710>() {
         public C2S_ValueRechargeRewardInfo_7710 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ValueRechargeRewardInfo_7710(input, extensionRegistry);
         }
      };

      private C2S_ValueRechargeRewardInfo_7710(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ValueRechargeRewardInfo_7710() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ValueRechargeRewardInfo_7710();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ValueRechargeRewardInfo_7710(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeRewardInfo_7710_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeRewardInfo_7710_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ValueRechargeRewardInfo_7710.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ValueRechargeRewardInfo_7710)) {
            return super.equals(obj);
         } else {
            C2S_ValueRechargeRewardInfo_7710 other = (C2S_ValueRechargeRewardInfo_7710)obj;
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

      public static C2S_ValueRechargeRewardInfo_7710 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ValueRechargeRewardInfo_7710)PARSER.parseFrom(data);
      }

      public static C2S_ValueRechargeRewardInfo_7710 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ValueRechargeRewardInfo_7710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ValueRechargeRewardInfo_7710 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ValueRechargeRewardInfo_7710)PARSER.parseFrom(data);
      }

      public static C2S_ValueRechargeRewardInfo_7710 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ValueRechargeRewardInfo_7710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ValueRechargeRewardInfo_7710 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ValueRechargeRewardInfo_7710)PARSER.parseFrom(data);
      }

      public static C2S_ValueRechargeRewardInfo_7710 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ValueRechargeRewardInfo_7710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ValueRechargeRewardInfo_7710 parseFrom(InputStream input) throws IOException {
         return (C2S_ValueRechargeRewardInfo_7710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ValueRechargeRewardInfo_7710 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ValueRechargeRewardInfo_7710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ValueRechargeRewardInfo_7710 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ValueRechargeRewardInfo_7710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ValueRechargeRewardInfo_7710 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ValueRechargeRewardInfo_7710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ValueRechargeRewardInfo_7710 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ValueRechargeRewardInfo_7710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ValueRechargeRewardInfo_7710 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ValueRechargeRewardInfo_7710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ValueRechargeRewardInfo_7710 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ValueRechargeRewardInfo_7710 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ValueRechargeRewardInfo_7710> parser() {
         return PARSER;
      }

      public Parser<C2S_ValueRechargeRewardInfo_7710> getParserForType() {
         return PARSER;
      }

      public C2S_ValueRechargeRewardInfo_7710 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ValueRechargeRewardInfo_7710OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeRewardInfo_7710_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeRewardInfo_7710_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ValueRechargeRewardInfo_7710.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.C2S_ValueRechargeRewardInfo_7710.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeRewardInfo_7710_descriptor;
         }

         public C2S_ValueRechargeRewardInfo_7710 getDefaultInstanceForType() {
            return RechargeMsg.C2S_ValueRechargeRewardInfo_7710.getDefaultInstance();
         }

         public C2S_ValueRechargeRewardInfo_7710 build() {
            C2S_ValueRechargeRewardInfo_7710 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ValueRechargeRewardInfo_7710 buildPartial() {
            C2S_ValueRechargeRewardInfo_7710 result = new C2S_ValueRechargeRewardInfo_7710(this);
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
            if (other instanceof C2S_ValueRechargeRewardInfo_7710) {
               return this.mergeFrom((C2S_ValueRechargeRewardInfo_7710)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ValueRechargeRewardInfo_7710 other) {
            if (other == RechargeMsg.C2S_ValueRechargeRewardInfo_7710.getDefaultInstance()) {
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
            C2S_ValueRechargeRewardInfo_7710 parsedMessage = null;

            try {
               parsedMessage = (C2S_ValueRechargeRewardInfo_7710)RechargeMsg.C2S_ValueRechargeRewardInfo_7710.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ValueRechargeRewardInfo_7710)e.getUnfinishedMessage();
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

   public static final class ValueRechargeInfo extends GeneratedMessageV3 implements ValueRechargeInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int QUANTITY_FIELD_NUMBER = 1;
      private int quantity_;
      public static final int DAY_FIELD_NUMBER = 2;
      private int day_;
      public static final int TODAYGOT_FIELD_NUMBER = 3;
      private boolean todayGot_;
      private byte memoizedIsInitialized;
      private static final ValueRechargeInfo DEFAULT_INSTANCE = new ValueRechargeInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<ValueRechargeInfo> PARSER = new AbstractParser<ValueRechargeInfo>() {
         public ValueRechargeInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ValueRechargeInfo(input, extensionRegistry);
         }
      };

      private ValueRechargeInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ValueRechargeInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ValueRechargeInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ValueRechargeInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.quantity_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.day_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.todayGot_ = input.readBool();
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
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_ValueRechargeInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_ValueRechargeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ValueRechargeInfo.class, Builder.class);
      }

      public boolean hasQuantity() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getQuantity() {
         return this.quantity_;
      }

      public boolean hasDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public boolean hasTodayGot() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getTodayGot() {
         return this.todayGot_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasQuantity()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTodayGot()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.quantity_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.day_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.todayGot_);
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
               size += CodedOutputStream.computeInt32Size(1, this.quantity_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.day_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.todayGot_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ValueRechargeInfo)) {
            return super.equals(obj);
         } else {
            ValueRechargeInfo other = (ValueRechargeInfo)obj;
            if (this.hasQuantity() != other.hasQuantity()) {
               return false;
            } else if (this.hasQuantity() && this.getQuantity() != other.getQuantity()) {
               return false;
            } else if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
               return false;
            } else if (this.hasTodayGot() != other.hasTodayGot()) {
               return false;
            } else if (this.hasTodayGot() && this.getTodayGot() != other.getTodayGot()) {
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
            if (this.hasQuantity()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getQuantity();
            }

            if (this.hasDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDay();
            }

            if (this.hasTodayGot()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getTodayGot());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ValueRechargeInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ValueRechargeInfo)PARSER.parseFrom(data);
      }

      public static ValueRechargeInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ValueRechargeInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ValueRechargeInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ValueRechargeInfo)PARSER.parseFrom(data);
      }

      public static ValueRechargeInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ValueRechargeInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ValueRechargeInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ValueRechargeInfo)PARSER.parseFrom(data);
      }

      public static ValueRechargeInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ValueRechargeInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ValueRechargeInfo parseFrom(InputStream input) throws IOException {
         return (ValueRechargeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ValueRechargeInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ValueRechargeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ValueRechargeInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (ValueRechargeInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ValueRechargeInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ValueRechargeInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ValueRechargeInfo parseFrom(CodedInputStream input) throws IOException {
         return (ValueRechargeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ValueRechargeInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ValueRechargeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ValueRechargeInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ValueRechargeInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ValueRechargeInfo> parser() {
         return PARSER;
      }

      public Parser<ValueRechargeInfo> getParserForType() {
         return PARSER;
      }

      public ValueRechargeInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ValueRechargeInfoOrBuilder {
         private int bitField0_;
         private int quantity_;
         private int day_;
         private boolean todayGot_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_ValueRechargeInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_ValueRechargeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ValueRechargeInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.ValueRechargeInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.quantity_ = 0;
            this.bitField0_ &= -2;
            this.day_ = 0;
            this.bitField0_ &= -3;
            this.todayGot_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_ValueRechargeInfo_descriptor;
         }

         public ValueRechargeInfo getDefaultInstanceForType() {
            return RechargeMsg.ValueRechargeInfo.getDefaultInstance();
         }

         public ValueRechargeInfo build() {
            ValueRechargeInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ValueRechargeInfo buildPartial() {
            ValueRechargeInfo result = new ValueRechargeInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.quantity_ = this.quantity_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.day_ = this.day_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.todayGot_ = this.todayGot_;
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
            if (other instanceof ValueRechargeInfo) {
               return this.mergeFrom((ValueRechargeInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ValueRechargeInfo other) {
            if (other == RechargeMsg.ValueRechargeInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasQuantity()) {
                  this.setQuantity(other.getQuantity());
               }

               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               if (other.hasTodayGot()) {
                  this.setTodayGot(other.getTodayGot());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasQuantity()) {
               return false;
            } else if (!this.hasDay()) {
               return false;
            } else {
               return this.hasTodayGot();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ValueRechargeInfo parsedMessage = null;

            try {
               parsedMessage = (ValueRechargeInfo)RechargeMsg.ValueRechargeInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ValueRechargeInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasQuantity() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getQuantity() {
            return this.quantity_;
         }

         public Builder setQuantity(int value) {
            this.bitField0_ |= 1;
            this.quantity_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearQuantity() {
            this.bitField0_ &= -2;
            this.quantity_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 2;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -3;
            this.day_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTodayGot() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getTodayGot() {
            return this.todayGot_;
         }

         public Builder setTodayGot(boolean value) {
            this.bitField0_ |= 4;
            this.todayGot_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTodayGot() {
            this.bitField0_ &= -5;
            this.todayGot_ = false;
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

   public static final class S2C_ValueRechargeRewardInfo_7711 extends GeneratedMessageV3 implements S2C_ValueRechargeRewardInfo_7711OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<ValueRechargeInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_ValueRechargeRewardInfo_7711 DEFAULT_INSTANCE = new S2C_ValueRechargeRewardInfo_7711();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ValueRechargeRewardInfo_7711> PARSER = new AbstractParser<S2C_ValueRechargeRewardInfo_7711>() {
         public S2C_ValueRechargeRewardInfo_7711 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ValueRechargeRewardInfo_7711(input, extensionRegistry);
         }
      };

      private S2C_ValueRechargeRewardInfo_7711(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ValueRechargeRewardInfo_7711() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ValueRechargeRewardInfo_7711();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ValueRechargeRewardInfo_7711(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.infos_.add(input.readMessage(RechargeMsg.ValueRechargeInfo.PARSER, extensionRegistry));
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeRewardInfo_7711_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeRewardInfo_7711_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ValueRechargeRewardInfo_7711.class, Builder.class);
      }

      public List<ValueRechargeInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends ValueRechargeInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public ValueRechargeInfo getInfos(int index) {
         return (ValueRechargeInfo)this.infos_.get(index);
      }

      public ValueRechargeInfoOrBuilder getInfosOrBuilder(int index) {
         return (ValueRechargeInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.infos_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ValueRechargeRewardInfo_7711)) {
            return super.equals(obj);
         } else {
            S2C_ValueRechargeRewardInfo_7711 other = (S2C_ValueRechargeRewardInfo_7711)obj;
            if (!this.getInfosList().equals(other.getInfosList())) {
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
            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ValueRechargeRewardInfo_7711 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ValueRechargeRewardInfo_7711)PARSER.parseFrom(data);
      }

      public static S2C_ValueRechargeRewardInfo_7711 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ValueRechargeRewardInfo_7711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ValueRechargeRewardInfo_7711 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ValueRechargeRewardInfo_7711)PARSER.parseFrom(data);
      }

      public static S2C_ValueRechargeRewardInfo_7711 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ValueRechargeRewardInfo_7711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ValueRechargeRewardInfo_7711 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ValueRechargeRewardInfo_7711)PARSER.parseFrom(data);
      }

      public static S2C_ValueRechargeRewardInfo_7711 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ValueRechargeRewardInfo_7711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ValueRechargeRewardInfo_7711 parseFrom(InputStream input) throws IOException {
         return (S2C_ValueRechargeRewardInfo_7711)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ValueRechargeRewardInfo_7711 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ValueRechargeRewardInfo_7711)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ValueRechargeRewardInfo_7711 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ValueRechargeRewardInfo_7711)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ValueRechargeRewardInfo_7711 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ValueRechargeRewardInfo_7711)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ValueRechargeRewardInfo_7711 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ValueRechargeRewardInfo_7711)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ValueRechargeRewardInfo_7711 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ValueRechargeRewardInfo_7711)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ValueRechargeRewardInfo_7711 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ValueRechargeRewardInfo_7711 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ValueRechargeRewardInfo_7711> parser() {
         return PARSER;
      }

      public Parser<S2C_ValueRechargeRewardInfo_7711> getParserForType() {
         return PARSER;
      }

      public S2C_ValueRechargeRewardInfo_7711 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ValueRechargeRewardInfo_7711OrBuilder {
         private int bitField0_;
         private List<ValueRechargeInfo> infos_;
         private RepeatedFieldBuilderV3<ValueRechargeInfo, ValueRechargeInfo.Builder, ValueRechargeInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeRewardInfo_7711_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeRewardInfo_7711_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ValueRechargeRewardInfo_7711.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.S2C_ValueRechargeRewardInfo_7711.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeRewardInfo_7711_descriptor;
         }

         public S2C_ValueRechargeRewardInfo_7711 getDefaultInstanceForType() {
            return RechargeMsg.S2C_ValueRechargeRewardInfo_7711.getDefaultInstance();
         }

         public S2C_ValueRechargeRewardInfo_7711 build() {
            S2C_ValueRechargeRewardInfo_7711 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ValueRechargeRewardInfo_7711 buildPartial() {
            S2C_ValueRechargeRewardInfo_7711 result = new S2C_ValueRechargeRewardInfo_7711(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -2;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
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
            if (other instanceof S2C_ValueRechargeRewardInfo_7711) {
               return this.mergeFrom((S2C_ValueRechargeRewardInfo_7711)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ValueRechargeRewardInfo_7711 other) {
            if (other == RechargeMsg.S2C_ValueRechargeRewardInfo_7711.getDefaultInstance()) {
               return this;
            } else {
               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureInfosIsMutable();
                        this.infos_.addAll(other.infos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infos_.isEmpty()) {
                  if (this.infosBuilder_.isEmpty()) {
                     this.infosBuilder_.dispose();
                     this.infosBuilder_ = null;
                     this.infos_ = other.infos_;
                     this.bitField0_ &= -2;
                     this.infosBuilder_ = RechargeMsg.S2C_ValueRechargeRewardInfo_7711.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ValueRechargeRewardInfo_7711 parsedMessage = null;

            try {
               parsedMessage = (S2C_ValueRechargeRewardInfo_7711)RechargeMsg.S2C_ValueRechargeRewardInfo_7711.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ValueRechargeRewardInfo_7711)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 1;
            }

         }

         public List<ValueRechargeInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public ValueRechargeInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (ValueRechargeInfo)this.infos_.get(index) : (ValueRechargeInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, ValueRechargeInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.set(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfos(int index, ValueRechargeInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(ValueRechargeInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfos(int index, ValueRechargeInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfos(ValueRechargeInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, ValueRechargeInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends ValueRechargeInfo> values) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infos_);
               this.onChanged();
            } else {
               this.infosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfos() {
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfos(int index) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.remove(index);
               this.onChanged();
            } else {
               this.infosBuilder_.remove(index);
            }

            return this;
         }

         public ValueRechargeInfo.Builder getInfosBuilder(int index) {
            return (ValueRechargeInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public ValueRechargeInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (ValueRechargeInfoOrBuilder)this.infos_.get(index) : (ValueRechargeInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ValueRechargeInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public ValueRechargeInfo.Builder addInfosBuilder() {
            return (ValueRechargeInfo.Builder)this.getInfosFieldBuilder().addBuilder(RechargeMsg.ValueRechargeInfo.getDefaultInstance());
         }

         public ValueRechargeInfo.Builder addInfosBuilder(int index) {
            return (ValueRechargeInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, RechargeMsg.ValueRechargeInfo.getDefaultInstance());
         }

         public List<ValueRechargeInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ValueRechargeInfo, ValueRechargeInfo.Builder, ValueRechargeInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ValueRechargeReward_7712 extends GeneratedMessageV3 implements C2S_ValueRechargeReward_7712OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int QUANTITY_FIELD_NUMBER = 1;
      private int quantity_;
      public static final int DAY_FIELD_NUMBER = 2;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_ValueRechargeReward_7712 DEFAULT_INSTANCE = new C2S_ValueRechargeReward_7712();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ValueRechargeReward_7712> PARSER = new AbstractParser<C2S_ValueRechargeReward_7712>() {
         public C2S_ValueRechargeReward_7712 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ValueRechargeReward_7712(input, extensionRegistry);
         }
      };

      private C2S_ValueRechargeReward_7712(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ValueRechargeReward_7712() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ValueRechargeReward_7712();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ValueRechargeReward_7712(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.quantity_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.day_ = input.readInt32();
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
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeReward_7712_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeReward_7712_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ValueRechargeReward_7712.class, Builder.class);
      }

      public boolean hasQuantity() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getQuantity() {
         return this.quantity_;
      }

      public boolean hasDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasQuantity()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.quantity_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.day_);
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
               size += CodedOutputStream.computeInt32Size(1, this.quantity_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.day_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ValueRechargeReward_7712)) {
            return super.equals(obj);
         } else {
            C2S_ValueRechargeReward_7712 other = (C2S_ValueRechargeReward_7712)obj;
            if (this.hasQuantity() != other.hasQuantity()) {
               return false;
            } else if (this.hasQuantity() && this.getQuantity() != other.getQuantity()) {
               return false;
            } else if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
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
            if (this.hasQuantity()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getQuantity();
            }

            if (this.hasDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ValueRechargeReward_7712 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ValueRechargeReward_7712)PARSER.parseFrom(data);
      }

      public static C2S_ValueRechargeReward_7712 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ValueRechargeReward_7712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ValueRechargeReward_7712 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ValueRechargeReward_7712)PARSER.parseFrom(data);
      }

      public static C2S_ValueRechargeReward_7712 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ValueRechargeReward_7712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ValueRechargeReward_7712 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ValueRechargeReward_7712)PARSER.parseFrom(data);
      }

      public static C2S_ValueRechargeReward_7712 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ValueRechargeReward_7712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ValueRechargeReward_7712 parseFrom(InputStream input) throws IOException {
         return (C2S_ValueRechargeReward_7712)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ValueRechargeReward_7712 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ValueRechargeReward_7712)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ValueRechargeReward_7712 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ValueRechargeReward_7712)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ValueRechargeReward_7712 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ValueRechargeReward_7712)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ValueRechargeReward_7712 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ValueRechargeReward_7712)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ValueRechargeReward_7712 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ValueRechargeReward_7712)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ValueRechargeReward_7712 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ValueRechargeReward_7712 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ValueRechargeReward_7712> parser() {
         return PARSER;
      }

      public Parser<C2S_ValueRechargeReward_7712> getParserForType() {
         return PARSER;
      }

      public C2S_ValueRechargeReward_7712 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ValueRechargeReward_7712OrBuilder {
         private int bitField0_;
         private int quantity_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeReward_7712_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeReward_7712_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ValueRechargeReward_7712.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.C2S_ValueRechargeReward_7712.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.quantity_ = 0;
            this.bitField0_ &= -2;
            this.day_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_ValueRechargeReward_7712_descriptor;
         }

         public C2S_ValueRechargeReward_7712 getDefaultInstanceForType() {
            return RechargeMsg.C2S_ValueRechargeReward_7712.getDefaultInstance();
         }

         public C2S_ValueRechargeReward_7712 build() {
            C2S_ValueRechargeReward_7712 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ValueRechargeReward_7712 buildPartial() {
            C2S_ValueRechargeReward_7712 result = new C2S_ValueRechargeReward_7712(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.quantity_ = this.quantity_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.day_ = this.day_;
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
            if (other instanceof C2S_ValueRechargeReward_7712) {
               return this.mergeFrom((C2S_ValueRechargeReward_7712)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ValueRechargeReward_7712 other) {
            if (other == RechargeMsg.C2S_ValueRechargeReward_7712.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasQuantity()) {
                  this.setQuantity(other.getQuantity());
               }

               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasQuantity()) {
               return false;
            } else {
               return this.hasDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ValueRechargeReward_7712 parsedMessage = null;

            try {
               parsedMessage = (C2S_ValueRechargeReward_7712)RechargeMsg.C2S_ValueRechargeReward_7712.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ValueRechargeReward_7712)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasQuantity() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getQuantity() {
            return this.quantity_;
         }

         public Builder setQuantity(int value) {
            this.bitField0_ |= 1;
            this.quantity_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearQuantity() {
            this.bitField0_ &= -2;
            this.quantity_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 2;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -3;
            this.day_ = 0;
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

   public static final class S2C_ValueRechargeReward_7713 extends GeneratedMessageV3 implements S2C_ValueRechargeReward_7713OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private ValueRechargeInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_ValueRechargeReward_7713 DEFAULT_INSTANCE = new S2C_ValueRechargeReward_7713();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ValueRechargeReward_7713> PARSER = new AbstractParser<S2C_ValueRechargeReward_7713>() {
         public S2C_ValueRechargeReward_7713 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ValueRechargeReward_7713(input, extensionRegistry);
         }
      };

      private S2C_ValueRechargeReward_7713(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ValueRechargeReward_7713() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ValueRechargeReward_7713();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ValueRechargeReward_7713(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ValueRechargeInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (ValueRechargeInfo)input.readMessage(RechargeMsg.ValueRechargeInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
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
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeReward_7713_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeReward_7713_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ValueRechargeReward_7713.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public ValueRechargeInfo getInfo() {
         return this.info_ == null ? RechargeMsg.ValueRechargeInfo.getDefaultInstance() : this.info_;
      }

      public ValueRechargeInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? RechargeMsg.ValueRechargeInfo.getDefaultInstance() : this.info_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ValueRechargeReward_7713)) {
            return super.equals(obj);
         } else {
            S2C_ValueRechargeReward_7713 other = (S2C_ValueRechargeReward_7713)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
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
            if (this.hasInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ValueRechargeReward_7713 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ValueRechargeReward_7713)PARSER.parseFrom(data);
      }

      public static S2C_ValueRechargeReward_7713 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ValueRechargeReward_7713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ValueRechargeReward_7713 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ValueRechargeReward_7713)PARSER.parseFrom(data);
      }

      public static S2C_ValueRechargeReward_7713 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ValueRechargeReward_7713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ValueRechargeReward_7713 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ValueRechargeReward_7713)PARSER.parseFrom(data);
      }

      public static S2C_ValueRechargeReward_7713 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ValueRechargeReward_7713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ValueRechargeReward_7713 parseFrom(InputStream input) throws IOException {
         return (S2C_ValueRechargeReward_7713)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ValueRechargeReward_7713 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ValueRechargeReward_7713)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ValueRechargeReward_7713 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ValueRechargeReward_7713)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ValueRechargeReward_7713 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ValueRechargeReward_7713)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ValueRechargeReward_7713 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ValueRechargeReward_7713)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ValueRechargeReward_7713 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ValueRechargeReward_7713)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ValueRechargeReward_7713 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ValueRechargeReward_7713 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ValueRechargeReward_7713> parser() {
         return PARSER;
      }

      public Parser<S2C_ValueRechargeReward_7713> getParserForType() {
         return PARSER;
      }

      public S2C_ValueRechargeReward_7713 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ValueRechargeReward_7713OrBuilder {
         private int bitField0_;
         private ValueRechargeInfo info_;
         private SingleFieldBuilderV3<ValueRechargeInfo, ValueRechargeInfo.Builder, ValueRechargeInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeReward_7713_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeReward_7713_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ValueRechargeReward_7713.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.S2C_ValueRechargeReward_7713.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_ValueRechargeReward_7713_descriptor;
         }

         public S2C_ValueRechargeReward_7713 getDefaultInstanceForType() {
            return RechargeMsg.S2C_ValueRechargeReward_7713.getDefaultInstance();
         }

         public S2C_ValueRechargeReward_7713 build() {
            S2C_ValueRechargeReward_7713 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ValueRechargeReward_7713 buildPartial() {
            S2C_ValueRechargeReward_7713 result = new S2C_ValueRechargeReward_7713(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (ValueRechargeInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_ValueRechargeReward_7713) {
               return this.mergeFrom((S2C_ValueRechargeReward_7713)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ValueRechargeReward_7713 other) {
            if (other == RechargeMsg.S2C_ValueRechargeReward_7713.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ValueRechargeReward_7713 parsedMessage = null;

            try {
               parsedMessage = (S2C_ValueRechargeReward_7713)RechargeMsg.S2C_ValueRechargeReward_7713.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ValueRechargeReward_7713)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public ValueRechargeInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? RechargeMsg.ValueRechargeInfo.getDefaultInstance() : this.info_;
            } else {
               return (ValueRechargeInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(ValueRechargeInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setInfo(ValueRechargeInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(ValueRechargeInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != RechargeMsg.ValueRechargeInfo.getDefaultInstance()) {
                  this.info_ = RechargeMsg.ValueRechargeInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public ValueRechargeInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ValueRechargeInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public ValueRechargeInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (ValueRechargeInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? RechargeMsg.ValueRechargeInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<ValueRechargeInfo, ValueRechargeInfo.Builder, ValueRechargeInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RechargeBillList_7715 extends GeneratedMessageV3 implements C2S_RechargeBillList_7715OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RechargeBillList_7715 DEFAULT_INSTANCE = new C2S_RechargeBillList_7715();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RechargeBillList_7715> PARSER = new AbstractParser<C2S_RechargeBillList_7715>() {
         public C2S_RechargeBillList_7715 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RechargeBillList_7715(input, extensionRegistry);
         }
      };

      private C2S_RechargeBillList_7715(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RechargeBillList_7715() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RechargeBillList_7715();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RechargeBillList_7715(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RechargeBillList_7715_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RechargeBillList_7715_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RechargeBillList_7715.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RechargeBillList_7715)) {
            return super.equals(obj);
         } else {
            C2S_RechargeBillList_7715 other = (C2S_RechargeBillList_7715)obj;
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

      public static C2S_RechargeBillList_7715 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RechargeBillList_7715)PARSER.parseFrom(data);
      }

      public static C2S_RechargeBillList_7715 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RechargeBillList_7715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RechargeBillList_7715 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RechargeBillList_7715)PARSER.parseFrom(data);
      }

      public static C2S_RechargeBillList_7715 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RechargeBillList_7715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RechargeBillList_7715 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RechargeBillList_7715)PARSER.parseFrom(data);
      }

      public static C2S_RechargeBillList_7715 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RechargeBillList_7715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RechargeBillList_7715 parseFrom(InputStream input) throws IOException {
         return (C2S_RechargeBillList_7715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RechargeBillList_7715 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RechargeBillList_7715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RechargeBillList_7715 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RechargeBillList_7715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RechargeBillList_7715 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RechargeBillList_7715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RechargeBillList_7715 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RechargeBillList_7715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RechargeBillList_7715 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RechargeBillList_7715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RechargeBillList_7715 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RechargeBillList_7715 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RechargeBillList_7715> parser() {
         return PARSER;
      }

      public Parser<C2S_RechargeBillList_7715> getParserForType() {
         return PARSER;
      }

      public C2S_RechargeBillList_7715 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RechargeBillList_7715OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RechargeBillList_7715_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RechargeBillList_7715_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RechargeBillList_7715.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.C2S_RechargeBillList_7715.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RechargeBillList_7715_descriptor;
         }

         public C2S_RechargeBillList_7715 getDefaultInstanceForType() {
            return RechargeMsg.C2S_RechargeBillList_7715.getDefaultInstance();
         }

         public C2S_RechargeBillList_7715 build() {
            C2S_RechargeBillList_7715 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RechargeBillList_7715 buildPartial() {
            C2S_RechargeBillList_7715 result = new C2S_RechargeBillList_7715(this);
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
            if (other instanceof C2S_RechargeBillList_7715) {
               return this.mergeFrom((C2S_RechargeBillList_7715)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RechargeBillList_7715 other) {
            if (other == RechargeMsg.C2S_RechargeBillList_7715.getDefaultInstance()) {
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
            C2S_RechargeBillList_7715 parsedMessage = null;

            try {
               parsedMessage = (C2S_RechargeBillList_7715)RechargeMsg.C2S_RechargeBillList_7715.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RechargeBillList_7715)e.getUnfinishedMessage();
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

   public static final class C2S_RechargeByCoin_7717 extends GeneratedMessageV3 implements C2S_RechargeByCoin_7717OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MONEY_FIELD_NUMBER = 1;
      private int money_;
      public static final int PLATFORM_FIELD_NUMBER = 2;
      private int platform_;
      public static final int RECHARGETYPE_FIELD_NUMBER = 3;
      private int rechargeType_;
      public static final int GOODID_FIELD_NUMBER = 4;
      private int goodId_;
      private byte memoizedIsInitialized;
      private static final C2S_RechargeByCoin_7717 DEFAULT_INSTANCE = new C2S_RechargeByCoin_7717();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RechargeByCoin_7717> PARSER = new AbstractParser<C2S_RechargeByCoin_7717>() {
         public C2S_RechargeByCoin_7717 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RechargeByCoin_7717(input, extensionRegistry);
         }
      };

      private C2S_RechargeByCoin_7717(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RechargeByCoin_7717() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RechargeByCoin_7717();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RechargeByCoin_7717(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.money_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.platform_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.rechargeType_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.goodId_ = input.readInt32();
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
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RechargeByCoin_7717_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RechargeByCoin_7717_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RechargeByCoin_7717.class, Builder.class);
      }

      public boolean hasMoney() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMoney() {
         return this.money_;
      }

      public boolean hasPlatform() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlatform() {
         return this.platform_;
      }

      public boolean hasRechargeType() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRechargeType() {
         return this.rechargeType_;
      }

      public boolean hasGoodId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getGoodId() {
         return this.goodId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMoney()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlatform()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRechargeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGoodId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.money_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.platform_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.rechargeType_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.goodId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.money_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.platform_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.rechargeType_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.goodId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RechargeByCoin_7717)) {
            return super.equals(obj);
         } else {
            C2S_RechargeByCoin_7717 other = (C2S_RechargeByCoin_7717)obj;
            if (this.hasMoney() != other.hasMoney()) {
               return false;
            } else if (this.hasMoney() && this.getMoney() != other.getMoney()) {
               return false;
            } else if (this.hasPlatform() != other.hasPlatform()) {
               return false;
            } else if (this.hasPlatform() && this.getPlatform() != other.getPlatform()) {
               return false;
            } else if (this.hasRechargeType() != other.hasRechargeType()) {
               return false;
            } else if (this.hasRechargeType() && this.getRechargeType() != other.getRechargeType()) {
               return false;
            } else if (this.hasGoodId() != other.hasGoodId()) {
               return false;
            } else if (this.hasGoodId() && this.getGoodId() != other.getGoodId()) {
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
            if (this.hasMoney()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMoney();
            }

            if (this.hasPlatform()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlatform();
            }

            if (this.hasRechargeType()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRechargeType();
            }

            if (this.hasGoodId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGoodId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RechargeByCoin_7717 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RechargeByCoin_7717)PARSER.parseFrom(data);
      }

      public static C2S_RechargeByCoin_7717 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RechargeByCoin_7717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RechargeByCoin_7717 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RechargeByCoin_7717)PARSER.parseFrom(data);
      }

      public static C2S_RechargeByCoin_7717 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RechargeByCoin_7717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RechargeByCoin_7717 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RechargeByCoin_7717)PARSER.parseFrom(data);
      }

      public static C2S_RechargeByCoin_7717 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RechargeByCoin_7717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RechargeByCoin_7717 parseFrom(InputStream input) throws IOException {
         return (C2S_RechargeByCoin_7717)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RechargeByCoin_7717 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RechargeByCoin_7717)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RechargeByCoin_7717 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RechargeByCoin_7717)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RechargeByCoin_7717 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RechargeByCoin_7717)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RechargeByCoin_7717 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RechargeByCoin_7717)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RechargeByCoin_7717 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RechargeByCoin_7717)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RechargeByCoin_7717 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RechargeByCoin_7717 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RechargeByCoin_7717> parser() {
         return PARSER;
      }

      public Parser<C2S_RechargeByCoin_7717> getParserForType() {
         return PARSER;
      }

      public C2S_RechargeByCoin_7717 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RechargeByCoin_7717OrBuilder {
         private int bitField0_;
         private int money_;
         private int platform_;
         private int rechargeType_;
         private int goodId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RechargeByCoin_7717_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RechargeByCoin_7717_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RechargeByCoin_7717.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.C2S_RechargeByCoin_7717.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.money_ = 0;
            this.bitField0_ &= -2;
            this.platform_ = 0;
            this.bitField0_ &= -3;
            this.rechargeType_ = 0;
            this.bitField0_ &= -5;
            this.goodId_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_C2S_RechargeByCoin_7717_descriptor;
         }

         public C2S_RechargeByCoin_7717 getDefaultInstanceForType() {
            return RechargeMsg.C2S_RechargeByCoin_7717.getDefaultInstance();
         }

         public C2S_RechargeByCoin_7717 build() {
            C2S_RechargeByCoin_7717 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RechargeByCoin_7717 buildPartial() {
            C2S_RechargeByCoin_7717 result = new C2S_RechargeByCoin_7717(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.money_ = this.money_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.platform_ = this.platform_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.rechargeType_ = this.rechargeType_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.goodId_ = this.goodId_;
               to_bitField0_ |= 8;
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
            if (other instanceof C2S_RechargeByCoin_7717) {
               return this.mergeFrom((C2S_RechargeByCoin_7717)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RechargeByCoin_7717 other) {
            if (other == RechargeMsg.C2S_RechargeByCoin_7717.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMoney()) {
                  this.setMoney(other.getMoney());
               }

               if (other.hasPlatform()) {
                  this.setPlatform(other.getPlatform());
               }

               if (other.hasRechargeType()) {
                  this.setRechargeType(other.getRechargeType());
               }

               if (other.hasGoodId()) {
                  this.setGoodId(other.getGoodId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMoney()) {
               return false;
            } else if (!this.hasPlatform()) {
               return false;
            } else if (!this.hasRechargeType()) {
               return false;
            } else {
               return this.hasGoodId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RechargeByCoin_7717 parsedMessage = null;

            try {
               parsedMessage = (C2S_RechargeByCoin_7717)RechargeMsg.C2S_RechargeByCoin_7717.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RechargeByCoin_7717)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMoney() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMoney() {
            return this.money_;
         }

         public Builder setMoney(int value) {
            this.bitField0_ |= 1;
            this.money_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMoney() {
            this.bitField0_ &= -2;
            this.money_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlatform() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPlatform() {
            return this.platform_;
         }

         public Builder setPlatform(int value) {
            this.bitField0_ |= 2;
            this.platform_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlatform() {
            this.bitField0_ &= -3;
            this.platform_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRechargeType() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRechargeType() {
            return this.rechargeType_;
         }

         public Builder setRechargeType(int value) {
            this.bitField0_ |= 4;
            this.rechargeType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRechargeType() {
            this.bitField0_ &= -5;
            this.rechargeType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGoodId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGoodId() {
            return this.goodId_;
         }

         public Builder setGoodId(int value) {
            this.bitField0_ |= 8;
            this.goodId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGoodId() {
            this.bitField0_ &= -9;
            this.goodId_ = 0;
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

   public static final class S2C_RechargeByCoin_7718 extends GeneratedMessageV3 implements S2C_RechargeByCoin_7718OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MONEY_FIELD_NUMBER = 1;
      private int money_;
      public static final int PLATFORM_FIELD_NUMBER = 2;
      private int platform_;
      public static final int RECHARGETYPE_FIELD_NUMBER = 3;
      private int rechargeType_;
      public static final int GOODID_FIELD_NUMBER = 4;
      private int goodId_;
      public static final int ISREAL_FIELD_NUMBER = 5;
      private boolean isReal_;
      private byte memoizedIsInitialized;
      private static final S2C_RechargeByCoin_7718 DEFAULT_INSTANCE = new S2C_RechargeByCoin_7718();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RechargeByCoin_7718> PARSER = new AbstractParser<S2C_RechargeByCoin_7718>() {
         public S2C_RechargeByCoin_7718 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RechargeByCoin_7718(input, extensionRegistry);
         }
      };

      private S2C_RechargeByCoin_7718(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RechargeByCoin_7718() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RechargeByCoin_7718();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RechargeByCoin_7718(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.money_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.platform_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.rechargeType_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.goodId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.isReal_ = input.readBool();
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
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_RechargeByCoin_7718_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_RechargeByCoin_7718_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RechargeByCoin_7718.class, Builder.class);
      }

      public boolean hasMoney() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMoney() {
         return this.money_;
      }

      public boolean hasPlatform() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlatform() {
         return this.platform_;
      }

      public boolean hasRechargeType() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRechargeType() {
         return this.rechargeType_;
      }

      public boolean hasGoodId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getGoodId() {
         return this.goodId_;
      }

      public boolean hasIsReal() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getIsReal() {
         return this.isReal_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMoney()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlatform()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRechargeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGoodId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsReal()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.money_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.platform_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.rechargeType_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.goodId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(5, this.isReal_);
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
               size += CodedOutputStream.computeInt32Size(1, this.money_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.platform_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.rechargeType_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.goodId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.isReal_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RechargeByCoin_7718)) {
            return super.equals(obj);
         } else {
            S2C_RechargeByCoin_7718 other = (S2C_RechargeByCoin_7718)obj;
            if (this.hasMoney() != other.hasMoney()) {
               return false;
            } else if (this.hasMoney() && this.getMoney() != other.getMoney()) {
               return false;
            } else if (this.hasPlatform() != other.hasPlatform()) {
               return false;
            } else if (this.hasPlatform() && this.getPlatform() != other.getPlatform()) {
               return false;
            } else if (this.hasRechargeType() != other.hasRechargeType()) {
               return false;
            } else if (this.hasRechargeType() && this.getRechargeType() != other.getRechargeType()) {
               return false;
            } else if (this.hasGoodId() != other.hasGoodId()) {
               return false;
            } else if (this.hasGoodId() && this.getGoodId() != other.getGoodId()) {
               return false;
            } else if (this.hasIsReal() != other.hasIsReal()) {
               return false;
            } else if (this.hasIsReal() && this.getIsReal() != other.getIsReal()) {
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
            if (this.hasMoney()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMoney();
            }

            if (this.hasPlatform()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlatform();
            }

            if (this.hasRechargeType()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRechargeType();
            }

            if (this.hasGoodId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGoodId();
            }

            if (this.hasIsReal()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getIsReal());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RechargeByCoin_7718 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RechargeByCoin_7718)PARSER.parseFrom(data);
      }

      public static S2C_RechargeByCoin_7718 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RechargeByCoin_7718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RechargeByCoin_7718 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RechargeByCoin_7718)PARSER.parseFrom(data);
      }

      public static S2C_RechargeByCoin_7718 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RechargeByCoin_7718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RechargeByCoin_7718 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RechargeByCoin_7718)PARSER.parseFrom(data);
      }

      public static S2C_RechargeByCoin_7718 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RechargeByCoin_7718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RechargeByCoin_7718 parseFrom(InputStream input) throws IOException {
         return (S2C_RechargeByCoin_7718)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RechargeByCoin_7718 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RechargeByCoin_7718)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RechargeByCoin_7718 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RechargeByCoin_7718)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RechargeByCoin_7718 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RechargeByCoin_7718)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RechargeByCoin_7718 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RechargeByCoin_7718)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RechargeByCoin_7718 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RechargeByCoin_7718)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RechargeByCoin_7718 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RechargeByCoin_7718 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RechargeByCoin_7718> parser() {
         return PARSER;
      }

      public Parser<S2C_RechargeByCoin_7718> getParserForType() {
         return PARSER;
      }

      public S2C_RechargeByCoin_7718 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RechargeByCoin_7718OrBuilder {
         private int bitField0_;
         private int money_;
         private int platform_;
         private int rechargeType_;
         private int goodId_;
         private boolean isReal_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_RechargeByCoin_7718_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_RechargeByCoin_7718_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RechargeByCoin_7718.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.S2C_RechargeByCoin_7718.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.money_ = 0;
            this.bitField0_ &= -2;
            this.platform_ = 0;
            this.bitField0_ &= -3;
            this.rechargeType_ = 0;
            this.bitField0_ &= -5;
            this.goodId_ = 0;
            this.bitField0_ &= -9;
            this.isReal_ = false;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_RechargeByCoin_7718_descriptor;
         }

         public S2C_RechargeByCoin_7718 getDefaultInstanceForType() {
            return RechargeMsg.S2C_RechargeByCoin_7718.getDefaultInstance();
         }

         public S2C_RechargeByCoin_7718 build() {
            S2C_RechargeByCoin_7718 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RechargeByCoin_7718 buildPartial() {
            S2C_RechargeByCoin_7718 result = new S2C_RechargeByCoin_7718(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.money_ = this.money_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.platform_ = this.platform_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.rechargeType_ = this.rechargeType_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.goodId_ = this.goodId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.isReal_ = this.isReal_;
               to_bitField0_ |= 16;
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
            if (other instanceof S2C_RechargeByCoin_7718) {
               return this.mergeFrom((S2C_RechargeByCoin_7718)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RechargeByCoin_7718 other) {
            if (other == RechargeMsg.S2C_RechargeByCoin_7718.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMoney()) {
                  this.setMoney(other.getMoney());
               }

               if (other.hasPlatform()) {
                  this.setPlatform(other.getPlatform());
               }

               if (other.hasRechargeType()) {
                  this.setRechargeType(other.getRechargeType());
               }

               if (other.hasGoodId()) {
                  this.setGoodId(other.getGoodId());
               }

               if (other.hasIsReal()) {
                  this.setIsReal(other.getIsReal());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMoney()) {
               return false;
            } else if (!this.hasPlatform()) {
               return false;
            } else if (!this.hasRechargeType()) {
               return false;
            } else if (!this.hasGoodId()) {
               return false;
            } else {
               return this.hasIsReal();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RechargeByCoin_7718 parsedMessage = null;

            try {
               parsedMessage = (S2C_RechargeByCoin_7718)RechargeMsg.S2C_RechargeByCoin_7718.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RechargeByCoin_7718)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMoney() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMoney() {
            return this.money_;
         }

         public Builder setMoney(int value) {
            this.bitField0_ |= 1;
            this.money_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMoney() {
            this.bitField0_ &= -2;
            this.money_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlatform() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPlatform() {
            return this.platform_;
         }

         public Builder setPlatform(int value) {
            this.bitField0_ |= 2;
            this.platform_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlatform() {
            this.bitField0_ &= -3;
            this.platform_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRechargeType() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRechargeType() {
            return this.rechargeType_;
         }

         public Builder setRechargeType(int value) {
            this.bitField0_ |= 4;
            this.rechargeType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRechargeType() {
            this.bitField0_ &= -5;
            this.rechargeType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGoodId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGoodId() {
            return this.goodId_;
         }

         public Builder setGoodId(int value) {
            this.bitField0_ |= 8;
            this.goodId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGoodId() {
            this.bitField0_ &= -9;
            this.goodId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsReal() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getIsReal() {
            return this.isReal_;
         }

         public Builder setIsReal(boolean value) {
            this.bitField0_ |= 16;
            this.isReal_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsReal() {
            this.bitField0_ &= -17;
            this.isReal_ = false;
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

   public static final class S2C_KrJueBanRecharge_7719 extends GeneratedMessageV3 implements S2C_KrJueBanRecharge_7719OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<KrValueRechargeInfo> infos_;
      public static final int GIFTID_FIELD_NUMBER = 2;
      private int giftId_;
      private byte memoizedIsInitialized;
      private static final S2C_KrJueBanRecharge_7719 DEFAULT_INSTANCE = new S2C_KrJueBanRecharge_7719();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_KrJueBanRecharge_7719> PARSER = new AbstractParser<S2C_KrJueBanRecharge_7719>() {
         public S2C_KrJueBanRecharge_7719 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_KrJueBanRecharge_7719(input, extensionRegistry);
         }
      };

      private S2C_KrJueBanRecharge_7719(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_KrJueBanRecharge_7719() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_KrJueBanRecharge_7719();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_KrJueBanRecharge_7719(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.infos_.add(input.readMessage(RechargeMsg.KrValueRechargeInfo.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.giftId_ = input.readInt32();
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_KrJueBanRecharge_7719_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_KrJueBanRecharge_7719_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_KrJueBanRecharge_7719.class, Builder.class);
      }

      public List<KrValueRechargeInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends KrValueRechargeInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public KrValueRechargeInfo getInfos(int index) {
         return (KrValueRechargeInfo)this.infos_.get(index);
      }

      public KrValueRechargeInfoOrBuilder getInfosOrBuilder(int index) {
         return (KrValueRechargeInfoOrBuilder)this.infos_.get(index);
      }

      public boolean hasGiftId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGiftId() {
         return this.giftId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.infos_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.giftId_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.infos_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.giftId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_KrJueBanRecharge_7719)) {
            return super.equals(obj);
         } else {
            S2C_KrJueBanRecharge_7719 other = (S2C_KrJueBanRecharge_7719)obj;
            if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else if (this.hasGiftId() != other.hasGiftId()) {
               return false;
            } else if (this.hasGiftId() && this.getGiftId() != other.getGiftId()) {
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
            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            if (this.hasGiftId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGiftId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_KrJueBanRecharge_7719 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_KrJueBanRecharge_7719)PARSER.parseFrom(data);
      }

      public static S2C_KrJueBanRecharge_7719 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_KrJueBanRecharge_7719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_KrJueBanRecharge_7719 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_KrJueBanRecharge_7719)PARSER.parseFrom(data);
      }

      public static S2C_KrJueBanRecharge_7719 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_KrJueBanRecharge_7719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_KrJueBanRecharge_7719 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_KrJueBanRecharge_7719)PARSER.parseFrom(data);
      }

      public static S2C_KrJueBanRecharge_7719 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_KrJueBanRecharge_7719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_KrJueBanRecharge_7719 parseFrom(InputStream input) throws IOException {
         return (S2C_KrJueBanRecharge_7719)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_KrJueBanRecharge_7719 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_KrJueBanRecharge_7719)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_KrJueBanRecharge_7719 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_KrJueBanRecharge_7719)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_KrJueBanRecharge_7719 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_KrJueBanRecharge_7719)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_KrJueBanRecharge_7719 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_KrJueBanRecharge_7719)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_KrJueBanRecharge_7719 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_KrJueBanRecharge_7719)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_KrJueBanRecharge_7719 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_KrJueBanRecharge_7719 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_KrJueBanRecharge_7719> parser() {
         return PARSER;
      }

      public Parser<S2C_KrJueBanRecharge_7719> getParserForType() {
         return PARSER;
      }

      public S2C_KrJueBanRecharge_7719 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_KrJueBanRecharge_7719OrBuilder {
         private int bitField0_;
         private List<KrValueRechargeInfo> infos_;
         private RepeatedFieldBuilderV3<KrValueRechargeInfo, KrValueRechargeInfo.Builder, KrValueRechargeInfoOrBuilder> infosBuilder_;
         private int giftId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_KrJueBanRecharge_7719_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_KrJueBanRecharge_7719_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_KrJueBanRecharge_7719.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.S2C_KrJueBanRecharge_7719.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infosBuilder_.clear();
            }

            this.giftId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_S2C_KrJueBanRecharge_7719_descriptor;
         }

         public S2C_KrJueBanRecharge_7719 getDefaultInstanceForType() {
            return RechargeMsg.S2C_KrJueBanRecharge_7719.getDefaultInstance();
         }

         public S2C_KrJueBanRecharge_7719 build() {
            S2C_KrJueBanRecharge_7719 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_KrJueBanRecharge_7719 buildPartial() {
            S2C_KrJueBanRecharge_7719 result = new S2C_KrJueBanRecharge_7719(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -2;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.giftId_ = this.giftId_;
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
            if (other instanceof S2C_KrJueBanRecharge_7719) {
               return this.mergeFrom((S2C_KrJueBanRecharge_7719)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_KrJueBanRecharge_7719 other) {
            if (other == RechargeMsg.S2C_KrJueBanRecharge_7719.getDefaultInstance()) {
               return this;
            } else {
               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureInfosIsMutable();
                        this.infos_.addAll(other.infos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infos_.isEmpty()) {
                  if (this.infosBuilder_.isEmpty()) {
                     this.infosBuilder_.dispose();
                     this.infosBuilder_ = null;
                     this.infos_ = other.infos_;
                     this.bitField0_ &= -2;
                     this.infosBuilder_ = RechargeMsg.S2C_KrJueBanRecharge_7719.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               if (other.hasGiftId()) {
                  this.setGiftId(other.getGiftId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_KrJueBanRecharge_7719 parsedMessage = null;

            try {
               parsedMessage = (S2C_KrJueBanRecharge_7719)RechargeMsg.S2C_KrJueBanRecharge_7719.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_KrJueBanRecharge_7719)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 1;
            }

         }

         public List<KrValueRechargeInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public KrValueRechargeInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (KrValueRechargeInfo)this.infos_.get(index) : (KrValueRechargeInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, KrValueRechargeInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.set(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfos(int index, KrValueRechargeInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(KrValueRechargeInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfos(int index, KrValueRechargeInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfos(KrValueRechargeInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, KrValueRechargeInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends KrValueRechargeInfo> values) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infos_);
               this.onChanged();
            } else {
               this.infosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfos() {
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfos(int index) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.remove(index);
               this.onChanged();
            } else {
               this.infosBuilder_.remove(index);
            }

            return this;
         }

         public KrValueRechargeInfo.Builder getInfosBuilder(int index) {
            return (KrValueRechargeInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public KrValueRechargeInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (KrValueRechargeInfoOrBuilder)this.infos_.get(index) : (KrValueRechargeInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends KrValueRechargeInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public KrValueRechargeInfo.Builder addInfosBuilder() {
            return (KrValueRechargeInfo.Builder)this.getInfosFieldBuilder().addBuilder(RechargeMsg.KrValueRechargeInfo.getDefaultInstance());
         }

         public KrValueRechargeInfo.Builder addInfosBuilder(int index) {
            return (KrValueRechargeInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, RechargeMsg.KrValueRechargeInfo.getDefaultInstance());
         }

         public List<KrValueRechargeInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<KrValueRechargeInfo, KrValueRechargeInfo.Builder, KrValueRechargeInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public boolean hasGiftId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGiftId() {
            return this.giftId_;
         }

         public Builder setGiftId(int value) {
            this.bitField0_ |= 2;
            this.giftId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGiftId() {
            this.bitField0_ &= -3;
            this.giftId_ = 0;
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

   public static final class KrValueRechargeInfo extends GeneratedMessageV3 implements KrValueRechargeInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIFTID_FIELD_NUMBER = 1;
      private int giftId_;
      public static final int DAY_FIELD_NUMBER = 2;
      private Internal.IntList day_;
      private byte memoizedIsInitialized;
      private static final KrValueRechargeInfo DEFAULT_INSTANCE = new KrValueRechargeInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<KrValueRechargeInfo> PARSER = new AbstractParser<KrValueRechargeInfo>() {
         public KrValueRechargeInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new KrValueRechargeInfo(input, extensionRegistry);
         }
      };

      private KrValueRechargeInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private KrValueRechargeInfo() {
         this.memoizedIsInitialized = -1;
         this.day_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new KrValueRechargeInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private KrValueRechargeInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.giftId_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.day_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.day_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.day_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.day_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.day_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_KrValueRechargeInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_KrValueRechargeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(KrValueRechargeInfo.class, Builder.class);
      }

      public boolean hasGiftId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGiftId() {
         return this.giftId_;
      }

      public List<Integer> getDayList() {
         return this.day_;
      }

      public int getDayCount() {
         return this.day_.size();
      }

      public int getDay(int index) {
         return this.day_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGiftId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.giftId_);
         }

         for(int i = 0; i < this.day_.size(); ++i) {
            output.writeInt32(2, this.day_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.giftId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.day_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.day_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getDayList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof KrValueRechargeInfo)) {
            return super.equals(obj);
         } else {
            KrValueRechargeInfo other = (KrValueRechargeInfo)obj;
            if (this.hasGiftId() != other.hasGiftId()) {
               return false;
            } else if (this.hasGiftId() && this.getGiftId() != other.getGiftId()) {
               return false;
            } else if (!this.getDayList().equals(other.getDayList())) {
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
            if (this.hasGiftId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiftId();
            }

            if (this.getDayCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDayList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static KrValueRechargeInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (KrValueRechargeInfo)PARSER.parseFrom(data);
      }

      public static KrValueRechargeInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (KrValueRechargeInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static KrValueRechargeInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (KrValueRechargeInfo)PARSER.parseFrom(data);
      }

      public static KrValueRechargeInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (KrValueRechargeInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static KrValueRechargeInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (KrValueRechargeInfo)PARSER.parseFrom(data);
      }

      public static KrValueRechargeInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (KrValueRechargeInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static KrValueRechargeInfo parseFrom(InputStream input) throws IOException {
         return (KrValueRechargeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static KrValueRechargeInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (KrValueRechargeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static KrValueRechargeInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (KrValueRechargeInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static KrValueRechargeInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (KrValueRechargeInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static KrValueRechargeInfo parseFrom(CodedInputStream input) throws IOException {
         return (KrValueRechargeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static KrValueRechargeInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (KrValueRechargeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(KrValueRechargeInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static KrValueRechargeInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<KrValueRechargeInfo> parser() {
         return PARSER;
      }

      public Parser<KrValueRechargeInfo> getParserForType() {
         return PARSER;
      }

      public KrValueRechargeInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements KrValueRechargeInfoOrBuilder {
         private int bitField0_;
         private int giftId_;
         private Internal.IntList day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_KrValueRechargeInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_KrValueRechargeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(KrValueRechargeInfo.class, Builder.class);
         }

         private Builder() {
            this.day_ = RechargeMsg.KrValueRechargeInfo.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.day_ = RechargeMsg.KrValueRechargeInfo.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RechargeMsg.KrValueRechargeInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.giftId_ = 0;
            this.bitField0_ &= -2;
            this.day_ = RechargeMsg.KrValueRechargeInfo.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RechargeMsg.internal_static_recharge_com_gzbz_protobuf_KrValueRechargeInfo_descriptor;
         }

         public KrValueRechargeInfo getDefaultInstanceForType() {
            return RechargeMsg.KrValueRechargeInfo.getDefaultInstance();
         }

         public KrValueRechargeInfo build() {
            KrValueRechargeInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public KrValueRechargeInfo buildPartial() {
            KrValueRechargeInfo result = new KrValueRechargeInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.giftId_ = this.giftId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.day_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.day_ = this.day_;
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
            if (other instanceof KrValueRechargeInfo) {
               return this.mergeFrom((KrValueRechargeInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(KrValueRechargeInfo other) {
            if (other == RechargeMsg.KrValueRechargeInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGiftId()) {
                  this.setGiftId(other.getGiftId());
               }

               if (!other.day_.isEmpty()) {
                  if (this.day_.isEmpty()) {
                     this.day_ = other.day_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureDayIsMutable();
                     this.day_.addAll(other.day_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGiftId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            KrValueRechargeInfo parsedMessage = null;

            try {
               parsedMessage = (KrValueRechargeInfo)RechargeMsg.KrValueRechargeInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (KrValueRechargeInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGiftId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGiftId() {
            return this.giftId_;
         }

         public Builder setGiftId(int value) {
            this.bitField0_ |= 1;
            this.giftId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGiftId() {
            this.bitField0_ &= -2;
            this.giftId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureDayIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.day_ = RechargeMsg.KrValueRechargeInfo.mutableCopy(this.day_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getDayList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.day_) : this.day_);
         }

         public int getDayCount() {
            return this.day_.size();
         }

         public int getDay(int index) {
            return this.day_.getInt(index);
         }

         public Builder setDay(int index, int value) {
            this.ensureDayIsMutable();
            this.day_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addDay(int value) {
            this.ensureDayIsMutable();
            this.day_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllDay(Iterable<? extends Integer> values) {
            this.ensureDayIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.day_);
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.day_ = RechargeMsg.KrValueRechargeInfo.emptyIntList();
            this.bitField0_ &= -3;
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

   public interface C2S_DailyFirstRechargeReward_7708OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_DailyFirstRecharge_7706OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RechargeBillList_7715OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RechargeByCoin_7717OrBuilder extends MessageOrBuilder {
      boolean hasMoney();

      int getMoney();

      boolean hasPlatform();

      int getPlatform();

      boolean hasRechargeType();

      int getRechargeType();

      boolean hasGoodId();

      int getGoodId();
   }

   public interface C2S_RechargeConfirm_7701OrBuilder extends MessageOrBuilder {
      boolean hasBillNo();

      String getBillNo();

      ByteString getBillNoBytes();
   }

   public interface C2S_RoleFirstRechargeReward_7704OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_RoleFirstRecharge_7702OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ValueRechargeRewardInfo_7710OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ValueRechargeReward_7712OrBuilder extends MessageOrBuilder {
      boolean hasQuantity();

      int getQuantity();

      boolean hasDay();

      int getDay();
   }

   public interface KrValueRechargeInfoOrBuilder extends MessageOrBuilder {
      boolean hasGiftId();

      int getGiftId();

      List<Integer> getDayList();

      int getDayCount();

      int getDay(int index);
   }

   public interface RoleFirstRechargeOrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasGotLastDay();

      int getGotLastDay();

      boolean hasDay();

      int getDay();
   }

   public interface S2C_DailyFirstRechargeReward_7709OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasId();

      int getId();
   }

   public interface S2C_DailyFirstRecharge_7707OrBuilder extends MessageOrBuilder {
      List<Integer> getGotIdsList();

      int getGotIdsCount();

      int getGotIds(int index);
   }

   public interface S2C_KrJueBanRecharge_7719OrBuilder extends MessageOrBuilder {
      List<KrValueRechargeInfo> getInfosList();

      KrValueRechargeInfo getInfos(int index);

      int getInfosCount();

      List<? extends KrValueRechargeInfoOrBuilder> getInfosOrBuilderList();

      KrValueRechargeInfoOrBuilder getInfosOrBuilder(int index);

      boolean hasGiftId();

      int getGiftId();
   }

   public interface S2C_RechargeByCoin_7718OrBuilder extends MessageOrBuilder {
      boolean hasMoney();

      int getMoney();

      boolean hasPlatform();

      int getPlatform();

      boolean hasRechargeType();

      int getRechargeType();

      boolean hasGoodId();

      int getGoodId();

      boolean hasIsReal();

      boolean getIsReal();
   }

   public interface S2C_RoleFirstRechargeReward_7705OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasGotLastDay();

      int getGotLastDay();
   }

   public interface S2C_RoleFirstRecharge_7703OrBuilder extends MessageOrBuilder {
      List<RoleFirstRecharge> getInfoList();

      RoleFirstRecharge getInfo(int index);

      int getInfoCount();

      List<? extends RoleFirstRechargeOrBuilder> getInfoOrBuilderList();

      RoleFirstRechargeOrBuilder getInfoOrBuilder(int index);

      boolean hasIsOpen();

      boolean getIsOpen();
   }

   public interface S2C_ValueRechargeRewardInfo_7711OrBuilder extends MessageOrBuilder {
      List<ValueRechargeInfo> getInfosList();

      ValueRechargeInfo getInfos(int index);

      int getInfosCount();

      List<? extends ValueRechargeInfoOrBuilder> getInfosOrBuilderList();

      ValueRechargeInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_ValueRechargeReward_7713OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      ValueRechargeInfo getInfo();

      ValueRechargeInfoOrBuilder getInfoOrBuilder();
   }

   public interface ValueRechargeInfoOrBuilder extends MessageOrBuilder {
      boolean hasQuantity();

      int getQuantity();

      boolean hasDay();

      int getDay();

      boolean hasTodayGot();

      boolean getTodayGot();
   }
}
