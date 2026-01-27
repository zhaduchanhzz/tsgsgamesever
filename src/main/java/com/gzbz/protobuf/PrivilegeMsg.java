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
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PrivilegeMsg {
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_C2S_SingleRechargeInfo_7901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_C2S_SingleRechargeInfo_7901_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_S2C_SingleRechargeResult_7902_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_S2C_SingleRechargeResult_7902_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftInfo_7903_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftInfo_7903_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftResult_7904_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftResult_7904_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftBuy_7905_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftBuy_7905_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftBuyResult_7906_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftBuyResult_7906_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftInfo_7907_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftInfo_7907_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftResult_7908_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftResult_7908_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftBuy_7909_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftBuy_7909_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftBuyResult_7910_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftBuyResult_7910_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallInfo_7911_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallInfo_7911_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallResult_7912_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallResult_7912_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallBuy_7913_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallBuy_7913_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallBuyResult_7914_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallBuyResult_7914_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopInfo_7915_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopInfo_7915_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopResult_7916_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopResult_7916_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopBuy_7917_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopBuy_7917_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopBuyResult_7918_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopBuyResult_7918_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_C2S_VipLevelShow_7919_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_C2S_VipLevelShow_7919_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_S2C_VipLevelShowResult_7920_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_S2C_VipLevelShowResult_7920_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_C2S_VipMonthlyReward_7921_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_C2S_VipMonthlyReward_7921_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_S2C_VipMonthlyRewardResult_7922_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_S2C_VipMonthlyRewardResult_7922_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftReward_7923_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftReward_7923_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftReward_7924_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftReward_7924_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private PrivilegeMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fPrivilege.proto\u0012\u001bprivilege.com.gzbz.protobuf\u001a\nShop.proto\"\u001d\n\u001bC2S_SingleRechargeInfo_7901\"9\n\u001dS2C_SingleRechargeResult_7902\u0012\u0018\n\u0010firstRechargeIds\u0018\u0001 \u0003(\u0005\"\u0016\n\u0014C2S_VipGiftInfo_7903\"T\n\u0016S2C_VipGiftResult_7904\u0012\u000f\n\u0007giftIds\u0018\u0001 \u0003(\u0005\u0012\u0013\n\u000bmonthlyCard\u0018\u0002 \u0002(\u0005\u0012\u0014\n\frewardLevels\u0018\u0003 \u0003(\u0005\"'\n\u0013C2S_VipGiftBuy_7905\u0012\u0010\n\bvipLevel\u0018\u0001 \u0002(\u0005\"-\n\u0019S2C_VipGiftBuyResult_7906\u0012\u0010\n\bvipLevel\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016C2S_DailyGiftInfo_7907\":\n\u0018S2C_DailyGiftResult_7908\u0012\u000f\n\u0007giftIds\u0018\u0001 \u0003(\u0005\u0012\r\n\u0005isGot\u0018\u0002 \u0002(\b\"&\n\u0015C2S_DailyGiftBuy_7909\u0012\r\n\u0005buyId\u0018\u0001 \u0002(\u0005\",\n\u001bS2C_DailyGiftBuyResult_7910\u0012\r\n\u0005buyId\u0018\u0001 \u0002(\u0005\"\u001c\n\u001aC2S_PrivilegeMallInfo_7911\"/\n\u001cS2C_PrivilegeMallResult_7912\u0012\u000f\n\u0007giftIds\u0018\u0001 \u0003(\u0005\"*\n\u0019C2S_PrivilegeMallBuy_7913\u0012\r\n\u0005buyId\u0018\u0001 \u0002(\u0005\"0\n\u001fS2C_PrivilegeMallBuyResult_7914\u0012\r\n\u0005buyId\u0018\u0001 \u0002(\u0005\"\u001c\n\u001aC2S_HeroStartShopInfo_7915\"Q\n\u001cS2C_HeroStartShopResult_7916\u00121\n\bbuyItems\u0018\u0001 \u0003(\u000b2\u001f.shop.com.gzbz.protobuf.BuyItem\"+\n\u0019C2S_HeroStartShopBuy_7917\u0012\u000e\n\u0006goodId\u0018\u0001 \u0002(\u0005\"0\n\u001fS2C_HeroStartShopBuyResult_7918\u0012\r\n\u0005buyId\u0018\u0001 \u0002(\u0005\"'\n\u0015C2S_VipLevelShow_7919\u0012\u000e\n\u0006isShow\u0018\u0001 \u0002(\b\"-\n\u001bS2C_VipLevelShowResult_7920\u0012\u000e\n\u0006isShow\u0018\u0001 \u0002(\b\"-\n\u0019C2S_VipMonthlyReward_7921\u0012\u0010\n\bvipLevel\u0018\u0001 \u0002(\u0005\"3\n\u001fS2C_VipMonthlyRewardResult_7922\u0012\u0010\n\bvipLevel\u0018\u0001 \u0002(\u0005\"\u001a\n\u0018C2S_DailyGiftReward_7923\"*\n\u0018S2C_DailyGiftReward_7924\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005B#\n\u0011com.gzbz.protobufB\fPrivilegeMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ShopMsg.getDescriptor()});
      internal_static_privilege_com_gzbz_protobuf_C2S_SingleRechargeInfo_7901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_privilege_com_gzbz_protobuf_C2S_SingleRechargeInfo_7901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_C2S_SingleRechargeInfo_7901_descriptor, new String[0]);
      internal_static_privilege_com_gzbz_protobuf_S2C_SingleRechargeResult_7902_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_privilege_com_gzbz_protobuf_S2C_SingleRechargeResult_7902_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_S2C_SingleRechargeResult_7902_descriptor, new String[]{"FirstRechargeIds"});
      internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftInfo_7903_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftInfo_7903_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftInfo_7903_descriptor, new String[0]);
      internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftResult_7904_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftResult_7904_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftResult_7904_descriptor, new String[]{"GiftIds", "MonthlyCard", "RewardLevels"});
      internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftBuy_7905_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftBuy_7905_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftBuy_7905_descriptor, new String[]{"VipLevel"});
      internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftBuyResult_7906_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftBuyResult_7906_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftBuyResult_7906_descriptor, new String[]{"VipLevel"});
      internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftInfo_7907_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftInfo_7907_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftInfo_7907_descriptor, new String[0]);
      internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftResult_7908_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftResult_7908_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftResult_7908_descriptor, new String[]{"GiftIds", "IsGot"});
      internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftBuy_7909_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftBuy_7909_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftBuy_7909_descriptor, new String[]{"BuyId"});
      internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftBuyResult_7910_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftBuyResult_7910_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftBuyResult_7910_descriptor, new String[]{"BuyId"});
      internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallInfo_7911_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallInfo_7911_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallInfo_7911_descriptor, new String[0]);
      internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallResult_7912_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallResult_7912_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallResult_7912_descriptor, new String[]{"GiftIds"});
      internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallBuy_7913_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallBuy_7913_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallBuy_7913_descriptor, new String[]{"BuyId"});
      internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallBuyResult_7914_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallBuyResult_7914_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallBuyResult_7914_descriptor, new String[]{"BuyId"});
      internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopInfo_7915_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopInfo_7915_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopInfo_7915_descriptor, new String[0]);
      internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopResult_7916_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopResult_7916_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopResult_7916_descriptor, new String[]{"BuyItems"});
      internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopBuy_7917_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopBuy_7917_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopBuy_7917_descriptor, new String[]{"GoodId"});
      internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopBuyResult_7918_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopBuyResult_7918_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopBuyResult_7918_descriptor, new String[]{"BuyId"});
      internal_static_privilege_com_gzbz_protobuf_C2S_VipLevelShow_7919_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_privilege_com_gzbz_protobuf_C2S_VipLevelShow_7919_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_C2S_VipLevelShow_7919_descriptor, new String[]{"IsShow"});
      internal_static_privilege_com_gzbz_protobuf_S2C_VipLevelShowResult_7920_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_privilege_com_gzbz_protobuf_S2C_VipLevelShowResult_7920_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_S2C_VipLevelShowResult_7920_descriptor, new String[]{"IsShow"});
      internal_static_privilege_com_gzbz_protobuf_C2S_VipMonthlyReward_7921_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_privilege_com_gzbz_protobuf_C2S_VipMonthlyReward_7921_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_C2S_VipMonthlyReward_7921_descriptor, new String[]{"VipLevel"});
      internal_static_privilege_com_gzbz_protobuf_S2C_VipMonthlyRewardResult_7922_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_privilege_com_gzbz_protobuf_S2C_VipMonthlyRewardResult_7922_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_S2C_VipMonthlyRewardResult_7922_descriptor, new String[]{"VipLevel"});
      internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftReward_7923_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftReward_7923_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftReward_7923_descriptor, new String[0]);
      internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftReward_7924_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftReward_7924_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftReward_7924_descriptor, new String[]{"Result"});
      ShopMsg.getDescriptor();
   }

   public static final class C2S_SingleRechargeInfo_7901 extends GeneratedMessageV3 implements C2S_SingleRechargeInfo_7901OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SingleRechargeInfo_7901 DEFAULT_INSTANCE = new C2S_SingleRechargeInfo_7901();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SingleRechargeInfo_7901> PARSER = new AbstractParser<C2S_SingleRechargeInfo_7901>() {
         public C2S_SingleRechargeInfo_7901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SingleRechargeInfo_7901(input, extensionRegistry);
         }
      };

      private C2S_SingleRechargeInfo_7901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SingleRechargeInfo_7901() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SingleRechargeInfo_7901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SingleRechargeInfo_7901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_SingleRechargeInfo_7901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_SingleRechargeInfo_7901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SingleRechargeInfo_7901.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SingleRechargeInfo_7901)) {
            return super.equals(obj);
         } else {
            C2S_SingleRechargeInfo_7901 other = (C2S_SingleRechargeInfo_7901)obj;
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

      public static C2S_SingleRechargeInfo_7901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SingleRechargeInfo_7901)PARSER.parseFrom(data);
      }

      public static C2S_SingleRechargeInfo_7901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SingleRechargeInfo_7901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SingleRechargeInfo_7901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SingleRechargeInfo_7901)PARSER.parseFrom(data);
      }

      public static C2S_SingleRechargeInfo_7901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SingleRechargeInfo_7901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SingleRechargeInfo_7901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SingleRechargeInfo_7901)PARSER.parseFrom(data);
      }

      public static C2S_SingleRechargeInfo_7901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SingleRechargeInfo_7901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SingleRechargeInfo_7901 parseFrom(InputStream input) throws IOException {
         return (C2S_SingleRechargeInfo_7901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SingleRechargeInfo_7901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SingleRechargeInfo_7901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SingleRechargeInfo_7901 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SingleRechargeInfo_7901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SingleRechargeInfo_7901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SingleRechargeInfo_7901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SingleRechargeInfo_7901 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SingleRechargeInfo_7901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SingleRechargeInfo_7901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SingleRechargeInfo_7901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SingleRechargeInfo_7901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SingleRechargeInfo_7901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SingleRechargeInfo_7901> parser() {
         return PARSER;
      }

      public Parser<C2S_SingleRechargeInfo_7901> getParserForType() {
         return PARSER;
      }

      public C2S_SingleRechargeInfo_7901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SingleRechargeInfo_7901OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_SingleRechargeInfo_7901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_SingleRechargeInfo_7901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SingleRechargeInfo_7901.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.C2S_SingleRechargeInfo_7901.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_SingleRechargeInfo_7901_descriptor;
         }

         public C2S_SingleRechargeInfo_7901 getDefaultInstanceForType() {
            return PrivilegeMsg.C2S_SingleRechargeInfo_7901.getDefaultInstance();
         }

         public C2S_SingleRechargeInfo_7901 build() {
            C2S_SingleRechargeInfo_7901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SingleRechargeInfo_7901 buildPartial() {
            C2S_SingleRechargeInfo_7901 result = new C2S_SingleRechargeInfo_7901(this);
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
            if (other instanceof C2S_SingleRechargeInfo_7901) {
               return this.mergeFrom((C2S_SingleRechargeInfo_7901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SingleRechargeInfo_7901 other) {
            if (other == PrivilegeMsg.C2S_SingleRechargeInfo_7901.getDefaultInstance()) {
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
            C2S_SingleRechargeInfo_7901 parsedMessage = null;

            try {
               parsedMessage = (C2S_SingleRechargeInfo_7901)PrivilegeMsg.C2S_SingleRechargeInfo_7901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SingleRechargeInfo_7901)e.getUnfinishedMessage();
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

   public static final class S2C_SingleRechargeResult_7902 extends GeneratedMessageV3 implements S2C_SingleRechargeResult_7902OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int FIRSTRECHARGEIDS_FIELD_NUMBER = 1;
      private Internal.IntList firstRechargeIds_;
      private byte memoizedIsInitialized;
      private static final S2C_SingleRechargeResult_7902 DEFAULT_INSTANCE = new S2C_SingleRechargeResult_7902();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SingleRechargeResult_7902> PARSER = new AbstractParser<S2C_SingleRechargeResult_7902>() {
         public S2C_SingleRechargeResult_7902 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SingleRechargeResult_7902(input, extensionRegistry);
         }
      };

      private S2C_SingleRechargeResult_7902(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SingleRechargeResult_7902() {
         this.memoizedIsInitialized = -1;
         this.firstRechargeIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SingleRechargeResult_7902();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SingleRechargeResult_7902(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.firstRechargeIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.firstRechargeIds_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.firstRechargeIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.firstRechargeIds_.addInt(input.readInt32());
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
                  this.firstRechargeIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_SingleRechargeResult_7902_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_SingleRechargeResult_7902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SingleRechargeResult_7902.class, Builder.class);
      }

      public List<Integer> getFirstRechargeIdsList() {
         return this.firstRechargeIds_;
      }

      public int getFirstRechargeIdsCount() {
         return this.firstRechargeIds_.size();
      }

      public int getFirstRechargeIds(int index) {
         return this.firstRechargeIds_.getInt(index);
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
         for(int i = 0; i < this.firstRechargeIds_.size(); ++i) {
            output.writeInt32(1, this.firstRechargeIds_.getInt(i));
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

            for(int i = 0; i < this.firstRechargeIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.firstRechargeIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getFirstRechargeIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SingleRechargeResult_7902)) {
            return super.equals(obj);
         } else {
            S2C_SingleRechargeResult_7902 other = (S2C_SingleRechargeResult_7902)obj;
            if (!this.getFirstRechargeIdsList().equals(other.getFirstRechargeIdsList())) {
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
            if (this.getFirstRechargeIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFirstRechargeIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SingleRechargeResult_7902 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SingleRechargeResult_7902)PARSER.parseFrom(data);
      }

      public static S2C_SingleRechargeResult_7902 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SingleRechargeResult_7902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SingleRechargeResult_7902 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SingleRechargeResult_7902)PARSER.parseFrom(data);
      }

      public static S2C_SingleRechargeResult_7902 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SingleRechargeResult_7902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SingleRechargeResult_7902 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SingleRechargeResult_7902)PARSER.parseFrom(data);
      }

      public static S2C_SingleRechargeResult_7902 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SingleRechargeResult_7902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SingleRechargeResult_7902 parseFrom(InputStream input) throws IOException {
         return (S2C_SingleRechargeResult_7902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SingleRechargeResult_7902 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SingleRechargeResult_7902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SingleRechargeResult_7902 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SingleRechargeResult_7902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SingleRechargeResult_7902 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SingleRechargeResult_7902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SingleRechargeResult_7902 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SingleRechargeResult_7902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SingleRechargeResult_7902 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SingleRechargeResult_7902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SingleRechargeResult_7902 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SingleRechargeResult_7902 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SingleRechargeResult_7902> parser() {
         return PARSER;
      }

      public Parser<S2C_SingleRechargeResult_7902> getParserForType() {
         return PARSER;
      }

      public S2C_SingleRechargeResult_7902 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SingleRechargeResult_7902OrBuilder {
         private int bitField0_;
         private Internal.IntList firstRechargeIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_SingleRechargeResult_7902_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_SingleRechargeResult_7902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SingleRechargeResult_7902.class, Builder.class);
         }

         private Builder() {
            this.firstRechargeIds_ = PrivilegeMsg.S2C_SingleRechargeResult_7902.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.firstRechargeIds_ = PrivilegeMsg.S2C_SingleRechargeResult_7902.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.S2C_SingleRechargeResult_7902.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.firstRechargeIds_ = PrivilegeMsg.S2C_SingleRechargeResult_7902.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_SingleRechargeResult_7902_descriptor;
         }

         public S2C_SingleRechargeResult_7902 getDefaultInstanceForType() {
            return PrivilegeMsg.S2C_SingleRechargeResult_7902.getDefaultInstance();
         }

         public S2C_SingleRechargeResult_7902 build() {
            S2C_SingleRechargeResult_7902 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SingleRechargeResult_7902 buildPartial() {
            S2C_SingleRechargeResult_7902 result = new S2C_SingleRechargeResult_7902(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.firstRechargeIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.firstRechargeIds_ = this.firstRechargeIds_;
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
            if (other instanceof S2C_SingleRechargeResult_7902) {
               return this.mergeFrom((S2C_SingleRechargeResult_7902)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SingleRechargeResult_7902 other) {
            if (other == PrivilegeMsg.S2C_SingleRechargeResult_7902.getDefaultInstance()) {
               return this;
            } else {
               if (!other.firstRechargeIds_.isEmpty()) {
                  if (this.firstRechargeIds_.isEmpty()) {
                     this.firstRechargeIds_ = other.firstRechargeIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureFirstRechargeIdsIsMutable();
                     this.firstRechargeIds_.addAll(other.firstRechargeIds_);
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
            S2C_SingleRechargeResult_7902 parsedMessage = null;

            try {
               parsedMessage = (S2C_SingleRechargeResult_7902)PrivilegeMsg.S2C_SingleRechargeResult_7902.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SingleRechargeResult_7902)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureFirstRechargeIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.firstRechargeIds_ = PrivilegeMsg.S2C_SingleRechargeResult_7902.mutableCopy(this.firstRechargeIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getFirstRechargeIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.firstRechargeIds_) : this.firstRechargeIds_);
         }

         public int getFirstRechargeIdsCount() {
            return this.firstRechargeIds_.size();
         }

         public int getFirstRechargeIds(int index) {
            return this.firstRechargeIds_.getInt(index);
         }

         public Builder setFirstRechargeIds(int index, int value) {
            this.ensureFirstRechargeIdsIsMutable();
            this.firstRechargeIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addFirstRechargeIds(int value) {
            this.ensureFirstRechargeIdsIsMutable();
            this.firstRechargeIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllFirstRechargeIds(Iterable<? extends Integer> values) {
            this.ensureFirstRechargeIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.firstRechargeIds_);
            this.onChanged();
            return this;
         }

         public Builder clearFirstRechargeIds() {
            this.firstRechargeIds_ = PrivilegeMsg.S2C_SingleRechargeResult_7902.emptyIntList();
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

   public static final class C2S_VipGiftInfo_7903 extends GeneratedMessageV3 implements C2S_VipGiftInfo_7903OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_VipGiftInfo_7903 DEFAULT_INSTANCE = new C2S_VipGiftInfo_7903();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_VipGiftInfo_7903> PARSER = new AbstractParser<C2S_VipGiftInfo_7903>() {
         public C2S_VipGiftInfo_7903 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_VipGiftInfo_7903(input, extensionRegistry);
         }
      };

      private C2S_VipGiftInfo_7903(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_VipGiftInfo_7903() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_VipGiftInfo_7903();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_VipGiftInfo_7903(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftInfo_7903_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftInfo_7903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VipGiftInfo_7903.class, Builder.class);
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
         } else if (!(obj instanceof C2S_VipGiftInfo_7903)) {
            return super.equals(obj);
         } else {
            C2S_VipGiftInfo_7903 other = (C2S_VipGiftInfo_7903)obj;
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

      public static C2S_VipGiftInfo_7903 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_VipGiftInfo_7903)PARSER.parseFrom(data);
      }

      public static C2S_VipGiftInfo_7903 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VipGiftInfo_7903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VipGiftInfo_7903 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_VipGiftInfo_7903)PARSER.parseFrom(data);
      }

      public static C2S_VipGiftInfo_7903 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VipGiftInfo_7903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VipGiftInfo_7903 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_VipGiftInfo_7903)PARSER.parseFrom(data);
      }

      public static C2S_VipGiftInfo_7903 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VipGiftInfo_7903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VipGiftInfo_7903 parseFrom(InputStream input) throws IOException {
         return (C2S_VipGiftInfo_7903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VipGiftInfo_7903 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VipGiftInfo_7903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VipGiftInfo_7903 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_VipGiftInfo_7903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_VipGiftInfo_7903 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VipGiftInfo_7903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VipGiftInfo_7903 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_VipGiftInfo_7903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VipGiftInfo_7903 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VipGiftInfo_7903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_VipGiftInfo_7903 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_VipGiftInfo_7903 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_VipGiftInfo_7903> parser() {
         return PARSER;
      }

      public Parser<C2S_VipGiftInfo_7903> getParserForType() {
         return PARSER;
      }

      public C2S_VipGiftInfo_7903 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_VipGiftInfo_7903OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftInfo_7903_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftInfo_7903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VipGiftInfo_7903.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.C2S_VipGiftInfo_7903.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftInfo_7903_descriptor;
         }

         public C2S_VipGiftInfo_7903 getDefaultInstanceForType() {
            return PrivilegeMsg.C2S_VipGiftInfo_7903.getDefaultInstance();
         }

         public C2S_VipGiftInfo_7903 build() {
            C2S_VipGiftInfo_7903 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_VipGiftInfo_7903 buildPartial() {
            C2S_VipGiftInfo_7903 result = new C2S_VipGiftInfo_7903(this);
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
            if (other instanceof C2S_VipGiftInfo_7903) {
               return this.mergeFrom((C2S_VipGiftInfo_7903)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_VipGiftInfo_7903 other) {
            if (other == PrivilegeMsg.C2S_VipGiftInfo_7903.getDefaultInstance()) {
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
            C2S_VipGiftInfo_7903 parsedMessage = null;

            try {
               parsedMessage = (C2S_VipGiftInfo_7903)PrivilegeMsg.C2S_VipGiftInfo_7903.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_VipGiftInfo_7903)e.getUnfinishedMessage();
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

   public static final class S2C_VipGiftResult_7904 extends GeneratedMessageV3 implements S2C_VipGiftResult_7904OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIFTIDS_FIELD_NUMBER = 1;
      private Internal.IntList giftIds_;
      public static final int MONTHLYCARD_FIELD_NUMBER = 2;
      private int monthlyCard_;
      public static final int REWARDLEVELS_FIELD_NUMBER = 3;
      private Internal.IntList rewardLevels_;
      private byte memoizedIsInitialized;
      private static final S2C_VipGiftResult_7904 DEFAULT_INSTANCE = new S2C_VipGiftResult_7904();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_VipGiftResult_7904> PARSER = new AbstractParser<S2C_VipGiftResult_7904>() {
         public S2C_VipGiftResult_7904 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_VipGiftResult_7904(input, extensionRegistry);
         }
      };

      private S2C_VipGiftResult_7904(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_VipGiftResult_7904() {
         this.memoizedIsInitialized = -1;
         this.giftIds_ = emptyIntList();
         this.rewardLevels_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_VipGiftResult_7904();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_VipGiftResult_7904(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.giftIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.giftIds_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.giftIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.monthlyCard_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.rewardLevels_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.rewardLevels_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardLevels_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.rewardLevels_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.giftIds_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.giftIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.rewardLevels_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftResult_7904_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftResult_7904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_VipGiftResult_7904.class, Builder.class);
      }

      public List<Integer> getGiftIdsList() {
         return this.giftIds_;
      }

      public int getGiftIdsCount() {
         return this.giftIds_.size();
      }

      public int getGiftIds(int index) {
         return this.giftIds_.getInt(index);
      }

      public boolean hasMonthlyCard() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMonthlyCard() {
         return this.monthlyCard_;
      }

      public List<Integer> getRewardLevelsList() {
         return this.rewardLevels_;
      }

      public int getRewardLevelsCount() {
         return this.rewardLevels_.size();
      }

      public int getRewardLevels(int index) {
         return this.rewardLevels_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMonthlyCard()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.giftIds_.size(); ++i) {
            output.writeInt32(1, this.giftIds_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.monthlyCard_);
         }

         for(int i = 0; i < this.rewardLevels_.size(); ++i) {
            output.writeInt32(3, this.rewardLevels_.getInt(i));
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

            for(int i = 0; i < this.giftIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.giftIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGiftIdsList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.monthlyCard_);
            }

            dataSize = 0;

            for(int i = 0; i < this.rewardLevels_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardLevels_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardLevelsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_VipGiftResult_7904)) {
            return super.equals(obj);
         } else {
            S2C_VipGiftResult_7904 other = (S2C_VipGiftResult_7904)obj;
            if (!this.getGiftIdsList().equals(other.getGiftIdsList())) {
               return false;
            } else if (this.hasMonthlyCard() != other.hasMonthlyCard()) {
               return false;
            } else if (this.hasMonthlyCard() && this.getMonthlyCard() != other.getMonthlyCard()) {
               return false;
            } else if (!this.getRewardLevelsList().equals(other.getRewardLevelsList())) {
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
            if (this.getGiftIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiftIdsList().hashCode();
            }

            if (this.hasMonthlyCard()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMonthlyCard();
            }

            if (this.getRewardLevelsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRewardLevelsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_VipGiftResult_7904 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_VipGiftResult_7904)PARSER.parseFrom(data);
      }

      public static S2C_VipGiftResult_7904 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VipGiftResult_7904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VipGiftResult_7904 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_VipGiftResult_7904)PARSER.parseFrom(data);
      }

      public static S2C_VipGiftResult_7904 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VipGiftResult_7904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VipGiftResult_7904 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_VipGiftResult_7904)PARSER.parseFrom(data);
      }

      public static S2C_VipGiftResult_7904 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VipGiftResult_7904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VipGiftResult_7904 parseFrom(InputStream input) throws IOException {
         return (S2C_VipGiftResult_7904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_VipGiftResult_7904 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VipGiftResult_7904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_VipGiftResult_7904 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_VipGiftResult_7904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_VipGiftResult_7904 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VipGiftResult_7904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_VipGiftResult_7904 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_VipGiftResult_7904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_VipGiftResult_7904 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VipGiftResult_7904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_VipGiftResult_7904 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_VipGiftResult_7904 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_VipGiftResult_7904> parser() {
         return PARSER;
      }

      public Parser<S2C_VipGiftResult_7904> getParserForType() {
         return PARSER;
      }

      public S2C_VipGiftResult_7904 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_VipGiftResult_7904OrBuilder {
         private int bitField0_;
         private Internal.IntList giftIds_;
         private int monthlyCard_;
         private Internal.IntList rewardLevels_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftResult_7904_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftResult_7904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_VipGiftResult_7904.class, Builder.class);
         }

         private Builder() {
            this.giftIds_ = PrivilegeMsg.S2C_VipGiftResult_7904.emptyIntList();
            this.rewardLevels_ = PrivilegeMsg.S2C_VipGiftResult_7904.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.giftIds_ = PrivilegeMsg.S2C_VipGiftResult_7904.emptyIntList();
            this.rewardLevels_ = PrivilegeMsg.S2C_VipGiftResult_7904.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.S2C_VipGiftResult_7904.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.giftIds_ = PrivilegeMsg.S2C_VipGiftResult_7904.emptyIntList();
            this.bitField0_ &= -2;
            this.monthlyCard_ = 0;
            this.bitField0_ &= -3;
            this.rewardLevels_ = PrivilegeMsg.S2C_VipGiftResult_7904.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftResult_7904_descriptor;
         }

         public S2C_VipGiftResult_7904 getDefaultInstanceForType() {
            return PrivilegeMsg.S2C_VipGiftResult_7904.getDefaultInstance();
         }

         public S2C_VipGiftResult_7904 build() {
            S2C_VipGiftResult_7904 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_VipGiftResult_7904 buildPartial() {
            S2C_VipGiftResult_7904 result = new S2C_VipGiftResult_7904(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.giftIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.giftIds_ = this.giftIds_;
            if ((from_bitField0_ & 2) != 0) {
               result.monthlyCard_ = this.monthlyCard_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.rewardLevels_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.rewardLevels_ = this.rewardLevels_;
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
            if (other instanceof S2C_VipGiftResult_7904) {
               return this.mergeFrom((S2C_VipGiftResult_7904)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_VipGiftResult_7904 other) {
            if (other == PrivilegeMsg.S2C_VipGiftResult_7904.getDefaultInstance()) {
               return this;
            } else {
               if (!other.giftIds_.isEmpty()) {
                  if (this.giftIds_.isEmpty()) {
                     this.giftIds_ = other.giftIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureGiftIdsIsMutable();
                     this.giftIds_.addAll(other.giftIds_);
                  }

                  this.onChanged();
               }

               if (other.hasMonthlyCard()) {
                  this.setMonthlyCard(other.getMonthlyCard());
               }

               if (!other.rewardLevels_.isEmpty()) {
                  if (this.rewardLevels_.isEmpty()) {
                     this.rewardLevels_ = other.rewardLevels_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureRewardLevelsIsMutable();
                     this.rewardLevels_.addAll(other.rewardLevels_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasMonthlyCard();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_VipGiftResult_7904 parsedMessage = null;

            try {
               parsedMessage = (S2C_VipGiftResult_7904)PrivilegeMsg.S2C_VipGiftResult_7904.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_VipGiftResult_7904)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGiftIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.giftIds_ = PrivilegeMsg.S2C_VipGiftResult_7904.mutableCopy(this.giftIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getGiftIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.giftIds_) : this.giftIds_);
         }

         public int getGiftIdsCount() {
            return this.giftIds_.size();
         }

         public int getGiftIds(int index) {
            return this.giftIds_.getInt(index);
         }

         public Builder setGiftIds(int index, int value) {
            this.ensureGiftIdsIsMutable();
            this.giftIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGiftIds(int value) {
            this.ensureGiftIdsIsMutable();
            this.giftIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGiftIds(Iterable<? extends Integer> values) {
            this.ensureGiftIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.giftIds_);
            this.onChanged();
            return this;
         }

         public Builder clearGiftIds() {
            this.giftIds_ = PrivilegeMsg.S2C_VipGiftResult_7904.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasMonthlyCard() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMonthlyCard() {
            return this.monthlyCard_;
         }

         public Builder setMonthlyCard(int value) {
            this.bitField0_ |= 2;
            this.monthlyCard_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonthlyCard() {
            this.bitField0_ &= -3;
            this.monthlyCard_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRewardLevelsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.rewardLevels_ = PrivilegeMsg.S2C_VipGiftResult_7904.mutableCopy(this.rewardLevels_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getRewardLevelsList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.rewardLevels_) : this.rewardLevels_);
         }

         public int getRewardLevelsCount() {
            return this.rewardLevels_.size();
         }

         public int getRewardLevels(int index) {
            return this.rewardLevels_.getInt(index);
         }

         public Builder setRewardLevels(int index, int value) {
            this.ensureRewardLevelsIsMutable();
            this.rewardLevels_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRewardLevels(int value) {
            this.ensureRewardLevelsIsMutable();
            this.rewardLevels_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRewardLevels(Iterable<? extends Integer> values) {
            this.ensureRewardLevelsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewardLevels_);
            this.onChanged();
            return this;
         }

         public Builder clearRewardLevels() {
            this.rewardLevels_ = PrivilegeMsg.S2C_VipGiftResult_7904.emptyIntList();
            this.bitField0_ &= -5;
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

   public static final class C2S_VipGiftBuy_7905 extends GeneratedMessageV3 implements C2S_VipGiftBuy_7905OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int VIPLEVEL_FIELD_NUMBER = 1;
      private int vipLevel_;
      private byte memoizedIsInitialized;
      private static final C2S_VipGiftBuy_7905 DEFAULT_INSTANCE = new C2S_VipGiftBuy_7905();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_VipGiftBuy_7905> PARSER = new AbstractParser<C2S_VipGiftBuy_7905>() {
         public C2S_VipGiftBuy_7905 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_VipGiftBuy_7905(input, extensionRegistry);
         }
      };

      private C2S_VipGiftBuy_7905(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_VipGiftBuy_7905() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_VipGiftBuy_7905();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_VipGiftBuy_7905(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.vipLevel_ = input.readInt32();
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftBuy_7905_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftBuy_7905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VipGiftBuy_7905.class, Builder.class);
      }

      public boolean hasVipLevel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getVipLevel() {
         return this.vipLevel_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasVipLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.vipLevel_);
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
               size += CodedOutputStream.computeInt32Size(1, this.vipLevel_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_VipGiftBuy_7905)) {
            return super.equals(obj);
         } else {
            C2S_VipGiftBuy_7905 other = (C2S_VipGiftBuy_7905)obj;
            if (this.hasVipLevel() != other.hasVipLevel()) {
               return false;
            } else if (this.hasVipLevel() && this.getVipLevel() != other.getVipLevel()) {
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
            if (this.hasVipLevel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getVipLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_VipGiftBuy_7905 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_VipGiftBuy_7905)PARSER.parseFrom(data);
      }

      public static C2S_VipGiftBuy_7905 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VipGiftBuy_7905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VipGiftBuy_7905 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_VipGiftBuy_7905)PARSER.parseFrom(data);
      }

      public static C2S_VipGiftBuy_7905 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VipGiftBuy_7905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VipGiftBuy_7905 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_VipGiftBuy_7905)PARSER.parseFrom(data);
      }

      public static C2S_VipGiftBuy_7905 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VipGiftBuy_7905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VipGiftBuy_7905 parseFrom(InputStream input) throws IOException {
         return (C2S_VipGiftBuy_7905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VipGiftBuy_7905 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VipGiftBuy_7905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VipGiftBuy_7905 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_VipGiftBuy_7905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_VipGiftBuy_7905 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VipGiftBuy_7905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VipGiftBuy_7905 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_VipGiftBuy_7905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VipGiftBuy_7905 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VipGiftBuy_7905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_VipGiftBuy_7905 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_VipGiftBuy_7905 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_VipGiftBuy_7905> parser() {
         return PARSER;
      }

      public Parser<C2S_VipGiftBuy_7905> getParserForType() {
         return PARSER;
      }

      public C2S_VipGiftBuy_7905 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_VipGiftBuy_7905OrBuilder {
         private int bitField0_;
         private int vipLevel_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftBuy_7905_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftBuy_7905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VipGiftBuy_7905.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.C2S_VipGiftBuy_7905.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.vipLevel_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipGiftBuy_7905_descriptor;
         }

         public C2S_VipGiftBuy_7905 getDefaultInstanceForType() {
            return PrivilegeMsg.C2S_VipGiftBuy_7905.getDefaultInstance();
         }

         public C2S_VipGiftBuy_7905 build() {
            C2S_VipGiftBuy_7905 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_VipGiftBuy_7905 buildPartial() {
            C2S_VipGiftBuy_7905 result = new C2S_VipGiftBuy_7905(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.vipLevel_ = this.vipLevel_;
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
            if (other instanceof C2S_VipGiftBuy_7905) {
               return this.mergeFrom((C2S_VipGiftBuy_7905)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_VipGiftBuy_7905 other) {
            if (other == PrivilegeMsg.C2S_VipGiftBuy_7905.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasVipLevel()) {
                  this.setVipLevel(other.getVipLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasVipLevel();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_VipGiftBuy_7905 parsedMessage = null;

            try {
               parsedMessage = (C2S_VipGiftBuy_7905)PrivilegeMsg.C2S_VipGiftBuy_7905.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_VipGiftBuy_7905)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasVipLevel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getVipLevel() {
            return this.vipLevel_;
         }

         public Builder setVipLevel(int value) {
            this.bitField0_ |= 1;
            this.vipLevel_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVipLevel() {
            this.bitField0_ &= -2;
            this.vipLevel_ = 0;
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

   public static final class S2C_VipGiftBuyResult_7906 extends GeneratedMessageV3 implements S2C_VipGiftBuyResult_7906OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int VIPLEVEL_FIELD_NUMBER = 1;
      private int vipLevel_;
      private byte memoizedIsInitialized;
      private static final S2C_VipGiftBuyResult_7906 DEFAULT_INSTANCE = new S2C_VipGiftBuyResult_7906();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_VipGiftBuyResult_7906> PARSER = new AbstractParser<S2C_VipGiftBuyResult_7906>() {
         public S2C_VipGiftBuyResult_7906 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_VipGiftBuyResult_7906(input, extensionRegistry);
         }
      };

      private S2C_VipGiftBuyResult_7906(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_VipGiftBuyResult_7906() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_VipGiftBuyResult_7906();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_VipGiftBuyResult_7906(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.vipLevel_ = input.readInt32();
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftBuyResult_7906_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftBuyResult_7906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_VipGiftBuyResult_7906.class, Builder.class);
      }

      public boolean hasVipLevel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getVipLevel() {
         return this.vipLevel_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasVipLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.vipLevel_);
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
               size += CodedOutputStream.computeInt32Size(1, this.vipLevel_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_VipGiftBuyResult_7906)) {
            return super.equals(obj);
         } else {
            S2C_VipGiftBuyResult_7906 other = (S2C_VipGiftBuyResult_7906)obj;
            if (this.hasVipLevel() != other.hasVipLevel()) {
               return false;
            } else if (this.hasVipLevel() && this.getVipLevel() != other.getVipLevel()) {
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
            if (this.hasVipLevel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getVipLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_VipGiftBuyResult_7906 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_VipGiftBuyResult_7906)PARSER.parseFrom(data);
      }

      public static S2C_VipGiftBuyResult_7906 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VipGiftBuyResult_7906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VipGiftBuyResult_7906 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_VipGiftBuyResult_7906)PARSER.parseFrom(data);
      }

      public static S2C_VipGiftBuyResult_7906 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VipGiftBuyResult_7906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VipGiftBuyResult_7906 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_VipGiftBuyResult_7906)PARSER.parseFrom(data);
      }

      public static S2C_VipGiftBuyResult_7906 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VipGiftBuyResult_7906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VipGiftBuyResult_7906 parseFrom(InputStream input) throws IOException {
         return (S2C_VipGiftBuyResult_7906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_VipGiftBuyResult_7906 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VipGiftBuyResult_7906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_VipGiftBuyResult_7906 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_VipGiftBuyResult_7906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_VipGiftBuyResult_7906 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VipGiftBuyResult_7906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_VipGiftBuyResult_7906 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_VipGiftBuyResult_7906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_VipGiftBuyResult_7906 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VipGiftBuyResult_7906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_VipGiftBuyResult_7906 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_VipGiftBuyResult_7906 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_VipGiftBuyResult_7906> parser() {
         return PARSER;
      }

      public Parser<S2C_VipGiftBuyResult_7906> getParserForType() {
         return PARSER;
      }

      public S2C_VipGiftBuyResult_7906 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_VipGiftBuyResult_7906OrBuilder {
         private int bitField0_;
         private int vipLevel_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftBuyResult_7906_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftBuyResult_7906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_VipGiftBuyResult_7906.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.S2C_VipGiftBuyResult_7906.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.vipLevel_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipGiftBuyResult_7906_descriptor;
         }

         public S2C_VipGiftBuyResult_7906 getDefaultInstanceForType() {
            return PrivilegeMsg.S2C_VipGiftBuyResult_7906.getDefaultInstance();
         }

         public S2C_VipGiftBuyResult_7906 build() {
            S2C_VipGiftBuyResult_7906 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_VipGiftBuyResult_7906 buildPartial() {
            S2C_VipGiftBuyResult_7906 result = new S2C_VipGiftBuyResult_7906(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.vipLevel_ = this.vipLevel_;
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
            if (other instanceof S2C_VipGiftBuyResult_7906) {
               return this.mergeFrom((S2C_VipGiftBuyResult_7906)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_VipGiftBuyResult_7906 other) {
            if (other == PrivilegeMsg.S2C_VipGiftBuyResult_7906.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasVipLevel()) {
                  this.setVipLevel(other.getVipLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasVipLevel();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_VipGiftBuyResult_7906 parsedMessage = null;

            try {
               parsedMessage = (S2C_VipGiftBuyResult_7906)PrivilegeMsg.S2C_VipGiftBuyResult_7906.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_VipGiftBuyResult_7906)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasVipLevel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getVipLevel() {
            return this.vipLevel_;
         }

         public Builder setVipLevel(int value) {
            this.bitField0_ |= 1;
            this.vipLevel_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVipLevel() {
            this.bitField0_ &= -2;
            this.vipLevel_ = 0;
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

   public static final class C2S_DailyGiftInfo_7907 extends GeneratedMessageV3 implements C2S_DailyGiftInfo_7907OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DailyGiftInfo_7907 DEFAULT_INSTANCE = new C2S_DailyGiftInfo_7907();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DailyGiftInfo_7907> PARSER = new AbstractParser<C2S_DailyGiftInfo_7907>() {
         public C2S_DailyGiftInfo_7907 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DailyGiftInfo_7907(input, extensionRegistry);
         }
      };

      private C2S_DailyGiftInfo_7907(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DailyGiftInfo_7907() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DailyGiftInfo_7907();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DailyGiftInfo_7907(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftInfo_7907_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftInfo_7907_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailyGiftInfo_7907.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DailyGiftInfo_7907)) {
            return super.equals(obj);
         } else {
            C2S_DailyGiftInfo_7907 other = (C2S_DailyGiftInfo_7907)obj;
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

      public static C2S_DailyGiftInfo_7907 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftInfo_7907)PARSER.parseFrom(data);
      }

      public static C2S_DailyGiftInfo_7907 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftInfo_7907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyGiftInfo_7907 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftInfo_7907)PARSER.parseFrom(data);
      }

      public static C2S_DailyGiftInfo_7907 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftInfo_7907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyGiftInfo_7907 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftInfo_7907)PARSER.parseFrom(data);
      }

      public static C2S_DailyGiftInfo_7907 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftInfo_7907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyGiftInfo_7907 parseFrom(InputStream input) throws IOException {
         return (C2S_DailyGiftInfo_7907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailyGiftInfo_7907 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyGiftInfo_7907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailyGiftInfo_7907 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DailyGiftInfo_7907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DailyGiftInfo_7907 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyGiftInfo_7907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailyGiftInfo_7907 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DailyGiftInfo_7907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailyGiftInfo_7907 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyGiftInfo_7907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DailyGiftInfo_7907 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DailyGiftInfo_7907 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DailyGiftInfo_7907> parser() {
         return PARSER;
      }

      public Parser<C2S_DailyGiftInfo_7907> getParserForType() {
         return PARSER;
      }

      public C2S_DailyGiftInfo_7907 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DailyGiftInfo_7907OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftInfo_7907_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftInfo_7907_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailyGiftInfo_7907.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.C2S_DailyGiftInfo_7907.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftInfo_7907_descriptor;
         }

         public C2S_DailyGiftInfo_7907 getDefaultInstanceForType() {
            return PrivilegeMsg.C2S_DailyGiftInfo_7907.getDefaultInstance();
         }

         public C2S_DailyGiftInfo_7907 build() {
            C2S_DailyGiftInfo_7907 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DailyGiftInfo_7907 buildPartial() {
            C2S_DailyGiftInfo_7907 result = new C2S_DailyGiftInfo_7907(this);
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
            if (other instanceof C2S_DailyGiftInfo_7907) {
               return this.mergeFrom((C2S_DailyGiftInfo_7907)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DailyGiftInfo_7907 other) {
            if (other == PrivilegeMsg.C2S_DailyGiftInfo_7907.getDefaultInstance()) {
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
            C2S_DailyGiftInfo_7907 parsedMessage = null;

            try {
               parsedMessage = (C2S_DailyGiftInfo_7907)PrivilegeMsg.C2S_DailyGiftInfo_7907.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DailyGiftInfo_7907)e.getUnfinishedMessage();
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

   public static final class S2C_DailyGiftResult_7908 extends GeneratedMessageV3 implements S2C_DailyGiftResult_7908OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIFTIDS_FIELD_NUMBER = 1;
      private Internal.IntList giftIds_;
      public static final int ISGOT_FIELD_NUMBER = 2;
      private boolean isGot_;
      private byte memoizedIsInitialized;
      private static final S2C_DailyGiftResult_7908 DEFAULT_INSTANCE = new S2C_DailyGiftResult_7908();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DailyGiftResult_7908> PARSER = new AbstractParser<S2C_DailyGiftResult_7908>() {
         public S2C_DailyGiftResult_7908 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DailyGiftResult_7908(input, extensionRegistry);
         }
      };

      private S2C_DailyGiftResult_7908(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DailyGiftResult_7908() {
         this.memoizedIsInitialized = -1;
         this.giftIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DailyGiftResult_7908();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DailyGiftResult_7908(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.giftIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.giftIds_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.giftIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.isGot_ = input.readBool();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.giftIds_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.giftIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftResult_7908_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftResult_7908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailyGiftResult_7908.class, Builder.class);
      }

      public List<Integer> getGiftIdsList() {
         return this.giftIds_;
      }

      public int getGiftIdsCount() {
         return this.giftIds_.size();
      }

      public int getGiftIds(int index) {
         return this.giftIds_.getInt(index);
      }

      public boolean hasIsGot() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsGot() {
         return this.isGot_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsGot()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.giftIds_.size(); ++i) {
            output.writeInt32(1, this.giftIds_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(2, this.isGot_);
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

            for(int i = 0; i < this.giftIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.giftIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGiftIdsList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isGot_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DailyGiftResult_7908)) {
            return super.equals(obj);
         } else {
            S2C_DailyGiftResult_7908 other = (S2C_DailyGiftResult_7908)obj;
            if (!this.getGiftIdsList().equals(other.getGiftIdsList())) {
               return false;
            } else if (this.hasIsGot() != other.hasIsGot()) {
               return false;
            } else if (this.hasIsGot() && this.getIsGot() != other.getIsGot()) {
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
            if (this.getGiftIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiftIdsList().hashCode();
            }

            if (this.hasIsGot()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsGot());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DailyGiftResult_7908 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftResult_7908)PARSER.parseFrom(data);
      }

      public static S2C_DailyGiftResult_7908 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftResult_7908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyGiftResult_7908 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftResult_7908)PARSER.parseFrom(data);
      }

      public static S2C_DailyGiftResult_7908 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftResult_7908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyGiftResult_7908 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftResult_7908)PARSER.parseFrom(data);
      }

      public static S2C_DailyGiftResult_7908 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftResult_7908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyGiftResult_7908 parseFrom(InputStream input) throws IOException {
         return (S2C_DailyGiftResult_7908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailyGiftResult_7908 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyGiftResult_7908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailyGiftResult_7908 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DailyGiftResult_7908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DailyGiftResult_7908 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyGiftResult_7908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailyGiftResult_7908 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DailyGiftResult_7908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailyGiftResult_7908 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyGiftResult_7908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DailyGiftResult_7908 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DailyGiftResult_7908 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DailyGiftResult_7908> parser() {
         return PARSER;
      }

      public Parser<S2C_DailyGiftResult_7908> getParserForType() {
         return PARSER;
      }

      public S2C_DailyGiftResult_7908 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DailyGiftResult_7908OrBuilder {
         private int bitField0_;
         private Internal.IntList giftIds_;
         private boolean isGot_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftResult_7908_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftResult_7908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailyGiftResult_7908.class, Builder.class);
         }

         private Builder() {
            this.giftIds_ = PrivilegeMsg.S2C_DailyGiftResult_7908.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.giftIds_ = PrivilegeMsg.S2C_DailyGiftResult_7908.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.S2C_DailyGiftResult_7908.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.giftIds_ = PrivilegeMsg.S2C_DailyGiftResult_7908.emptyIntList();
            this.bitField0_ &= -2;
            this.isGot_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftResult_7908_descriptor;
         }

         public S2C_DailyGiftResult_7908 getDefaultInstanceForType() {
            return PrivilegeMsg.S2C_DailyGiftResult_7908.getDefaultInstance();
         }

         public S2C_DailyGiftResult_7908 build() {
            S2C_DailyGiftResult_7908 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DailyGiftResult_7908 buildPartial() {
            S2C_DailyGiftResult_7908 result = new S2C_DailyGiftResult_7908(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.giftIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.giftIds_ = this.giftIds_;
            if ((from_bitField0_ & 2) != 0) {
               result.isGot_ = this.isGot_;
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
            if (other instanceof S2C_DailyGiftResult_7908) {
               return this.mergeFrom((S2C_DailyGiftResult_7908)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DailyGiftResult_7908 other) {
            if (other == PrivilegeMsg.S2C_DailyGiftResult_7908.getDefaultInstance()) {
               return this;
            } else {
               if (!other.giftIds_.isEmpty()) {
                  if (this.giftIds_.isEmpty()) {
                     this.giftIds_ = other.giftIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureGiftIdsIsMutable();
                     this.giftIds_.addAll(other.giftIds_);
                  }

                  this.onChanged();
               }

               if (other.hasIsGot()) {
                  this.setIsGot(other.getIsGot());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIsGot();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DailyGiftResult_7908 parsedMessage = null;

            try {
               parsedMessage = (S2C_DailyGiftResult_7908)PrivilegeMsg.S2C_DailyGiftResult_7908.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DailyGiftResult_7908)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGiftIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.giftIds_ = PrivilegeMsg.S2C_DailyGiftResult_7908.mutableCopy(this.giftIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getGiftIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.giftIds_) : this.giftIds_);
         }

         public int getGiftIdsCount() {
            return this.giftIds_.size();
         }

         public int getGiftIds(int index) {
            return this.giftIds_.getInt(index);
         }

         public Builder setGiftIds(int index, int value) {
            this.ensureGiftIdsIsMutable();
            this.giftIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGiftIds(int value) {
            this.ensureGiftIdsIsMutable();
            this.giftIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGiftIds(Iterable<? extends Integer> values) {
            this.ensureGiftIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.giftIds_);
            this.onChanged();
            return this;
         }

         public Builder clearGiftIds() {
            this.giftIds_ = PrivilegeMsg.S2C_DailyGiftResult_7908.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasIsGot() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsGot() {
            return this.isGot_;
         }

         public Builder setIsGot(boolean value) {
            this.bitField0_ |= 2;
            this.isGot_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsGot() {
            this.bitField0_ &= -3;
            this.isGot_ = false;
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

   public static final class C2S_DailyGiftBuy_7909 extends GeneratedMessageV3 implements C2S_DailyGiftBuy_7909OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYID_FIELD_NUMBER = 1;
      private int buyId_;
      private byte memoizedIsInitialized;
      private static final C2S_DailyGiftBuy_7909 DEFAULT_INSTANCE = new C2S_DailyGiftBuy_7909();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DailyGiftBuy_7909> PARSER = new AbstractParser<C2S_DailyGiftBuy_7909>() {
         public C2S_DailyGiftBuy_7909 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DailyGiftBuy_7909(input, extensionRegistry);
         }
      };

      private C2S_DailyGiftBuy_7909(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DailyGiftBuy_7909() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DailyGiftBuy_7909();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DailyGiftBuy_7909(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyId_ = input.readInt32();
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftBuy_7909_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftBuy_7909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailyGiftBuy_7909.class, Builder.class);
      }

      public boolean hasBuyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyId() {
         return this.buyId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_DailyGiftBuy_7909)) {
            return super.equals(obj);
         } else {
            C2S_DailyGiftBuy_7909 other = (C2S_DailyGiftBuy_7909)obj;
            if (this.hasBuyId() != other.hasBuyId()) {
               return false;
            } else if (this.hasBuyId() && this.getBuyId() != other.getBuyId()) {
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
            if (this.hasBuyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_DailyGiftBuy_7909 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftBuy_7909)PARSER.parseFrom(data);
      }

      public static C2S_DailyGiftBuy_7909 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftBuy_7909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyGiftBuy_7909 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftBuy_7909)PARSER.parseFrom(data);
      }

      public static C2S_DailyGiftBuy_7909 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftBuy_7909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyGiftBuy_7909 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftBuy_7909)PARSER.parseFrom(data);
      }

      public static C2S_DailyGiftBuy_7909 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftBuy_7909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyGiftBuy_7909 parseFrom(InputStream input) throws IOException {
         return (C2S_DailyGiftBuy_7909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailyGiftBuy_7909 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyGiftBuy_7909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailyGiftBuy_7909 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DailyGiftBuy_7909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DailyGiftBuy_7909 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyGiftBuy_7909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailyGiftBuy_7909 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DailyGiftBuy_7909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailyGiftBuy_7909 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyGiftBuy_7909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DailyGiftBuy_7909 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DailyGiftBuy_7909 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DailyGiftBuy_7909> parser() {
         return PARSER;
      }

      public Parser<C2S_DailyGiftBuy_7909> getParserForType() {
         return PARSER;
      }

      public C2S_DailyGiftBuy_7909 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DailyGiftBuy_7909OrBuilder {
         private int bitField0_;
         private int buyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftBuy_7909_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftBuy_7909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailyGiftBuy_7909.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.C2S_DailyGiftBuy_7909.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftBuy_7909_descriptor;
         }

         public C2S_DailyGiftBuy_7909 getDefaultInstanceForType() {
            return PrivilegeMsg.C2S_DailyGiftBuy_7909.getDefaultInstance();
         }

         public C2S_DailyGiftBuy_7909 build() {
            C2S_DailyGiftBuy_7909 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DailyGiftBuy_7909 buildPartial() {
            C2S_DailyGiftBuy_7909 result = new C2S_DailyGiftBuy_7909(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyId_ = this.buyId_;
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
            if (other instanceof C2S_DailyGiftBuy_7909) {
               return this.mergeFrom((C2S_DailyGiftBuy_7909)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DailyGiftBuy_7909 other) {
            if (other == PrivilegeMsg.C2S_DailyGiftBuy_7909.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyId()) {
                  this.setBuyId(other.getBuyId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuyId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_DailyGiftBuy_7909 parsedMessage = null;

            try {
               parsedMessage = (C2S_DailyGiftBuy_7909)PrivilegeMsg.C2S_DailyGiftBuy_7909.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DailyGiftBuy_7909)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyId() {
            return this.buyId_;
         }

         public Builder setBuyId(int value) {
            this.bitField0_ |= 1;
            this.buyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyId() {
            this.bitField0_ &= -2;
            this.buyId_ = 0;
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

   public static final class S2C_DailyGiftBuyResult_7910 extends GeneratedMessageV3 implements S2C_DailyGiftBuyResult_7910OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYID_FIELD_NUMBER = 1;
      private int buyId_;
      private byte memoizedIsInitialized;
      private static final S2C_DailyGiftBuyResult_7910 DEFAULT_INSTANCE = new S2C_DailyGiftBuyResult_7910();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DailyGiftBuyResult_7910> PARSER = new AbstractParser<S2C_DailyGiftBuyResult_7910>() {
         public S2C_DailyGiftBuyResult_7910 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DailyGiftBuyResult_7910(input, extensionRegistry);
         }
      };

      private S2C_DailyGiftBuyResult_7910(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DailyGiftBuyResult_7910() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DailyGiftBuyResult_7910();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DailyGiftBuyResult_7910(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyId_ = input.readInt32();
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftBuyResult_7910_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftBuyResult_7910_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailyGiftBuyResult_7910.class, Builder.class);
      }

      public boolean hasBuyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyId() {
         return this.buyId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DailyGiftBuyResult_7910)) {
            return super.equals(obj);
         } else {
            S2C_DailyGiftBuyResult_7910 other = (S2C_DailyGiftBuyResult_7910)obj;
            if (this.hasBuyId() != other.hasBuyId()) {
               return false;
            } else if (this.hasBuyId() && this.getBuyId() != other.getBuyId()) {
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
            if (this.hasBuyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DailyGiftBuyResult_7910 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftBuyResult_7910)PARSER.parseFrom(data);
      }

      public static S2C_DailyGiftBuyResult_7910 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftBuyResult_7910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyGiftBuyResult_7910 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftBuyResult_7910)PARSER.parseFrom(data);
      }

      public static S2C_DailyGiftBuyResult_7910 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftBuyResult_7910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyGiftBuyResult_7910 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftBuyResult_7910)PARSER.parseFrom(data);
      }

      public static S2C_DailyGiftBuyResult_7910 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftBuyResult_7910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyGiftBuyResult_7910 parseFrom(InputStream input) throws IOException {
         return (S2C_DailyGiftBuyResult_7910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailyGiftBuyResult_7910 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyGiftBuyResult_7910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailyGiftBuyResult_7910 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DailyGiftBuyResult_7910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DailyGiftBuyResult_7910 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyGiftBuyResult_7910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailyGiftBuyResult_7910 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DailyGiftBuyResult_7910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailyGiftBuyResult_7910 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyGiftBuyResult_7910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DailyGiftBuyResult_7910 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DailyGiftBuyResult_7910 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DailyGiftBuyResult_7910> parser() {
         return PARSER;
      }

      public Parser<S2C_DailyGiftBuyResult_7910> getParserForType() {
         return PARSER;
      }

      public S2C_DailyGiftBuyResult_7910 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DailyGiftBuyResult_7910OrBuilder {
         private int bitField0_;
         private int buyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftBuyResult_7910_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftBuyResult_7910_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailyGiftBuyResult_7910.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.S2C_DailyGiftBuyResult_7910.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftBuyResult_7910_descriptor;
         }

         public S2C_DailyGiftBuyResult_7910 getDefaultInstanceForType() {
            return PrivilegeMsg.S2C_DailyGiftBuyResult_7910.getDefaultInstance();
         }

         public S2C_DailyGiftBuyResult_7910 build() {
            S2C_DailyGiftBuyResult_7910 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DailyGiftBuyResult_7910 buildPartial() {
            S2C_DailyGiftBuyResult_7910 result = new S2C_DailyGiftBuyResult_7910(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyId_ = this.buyId_;
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
            if (other instanceof S2C_DailyGiftBuyResult_7910) {
               return this.mergeFrom((S2C_DailyGiftBuyResult_7910)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DailyGiftBuyResult_7910 other) {
            if (other == PrivilegeMsg.S2C_DailyGiftBuyResult_7910.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyId()) {
                  this.setBuyId(other.getBuyId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuyId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DailyGiftBuyResult_7910 parsedMessage = null;

            try {
               parsedMessage = (S2C_DailyGiftBuyResult_7910)PrivilegeMsg.S2C_DailyGiftBuyResult_7910.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DailyGiftBuyResult_7910)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyId() {
            return this.buyId_;
         }

         public Builder setBuyId(int value) {
            this.bitField0_ |= 1;
            this.buyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyId() {
            this.bitField0_ &= -2;
            this.buyId_ = 0;
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

   public static final class C2S_PrivilegeMallInfo_7911 extends GeneratedMessageV3 implements C2S_PrivilegeMallInfo_7911OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_PrivilegeMallInfo_7911 DEFAULT_INSTANCE = new C2S_PrivilegeMallInfo_7911();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PrivilegeMallInfo_7911> PARSER = new AbstractParser<C2S_PrivilegeMallInfo_7911>() {
         public C2S_PrivilegeMallInfo_7911 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PrivilegeMallInfo_7911(input, extensionRegistry);
         }
      };

      private C2S_PrivilegeMallInfo_7911(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PrivilegeMallInfo_7911() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PrivilegeMallInfo_7911();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PrivilegeMallInfo_7911(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallInfo_7911_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallInfo_7911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrivilegeMallInfo_7911.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PrivilegeMallInfo_7911)) {
            return super.equals(obj);
         } else {
            C2S_PrivilegeMallInfo_7911 other = (C2S_PrivilegeMallInfo_7911)obj;
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

      public static C2S_PrivilegeMallInfo_7911 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PrivilegeMallInfo_7911)PARSER.parseFrom(data);
      }

      public static C2S_PrivilegeMallInfo_7911 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrivilegeMallInfo_7911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrivilegeMallInfo_7911 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PrivilegeMallInfo_7911)PARSER.parseFrom(data);
      }

      public static C2S_PrivilegeMallInfo_7911 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrivilegeMallInfo_7911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrivilegeMallInfo_7911 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PrivilegeMallInfo_7911)PARSER.parseFrom(data);
      }

      public static C2S_PrivilegeMallInfo_7911 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrivilegeMallInfo_7911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrivilegeMallInfo_7911 parseFrom(InputStream input) throws IOException {
         return (C2S_PrivilegeMallInfo_7911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrivilegeMallInfo_7911 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrivilegeMallInfo_7911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrivilegeMallInfo_7911 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PrivilegeMallInfo_7911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PrivilegeMallInfo_7911 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrivilegeMallInfo_7911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrivilegeMallInfo_7911 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PrivilegeMallInfo_7911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrivilegeMallInfo_7911 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrivilegeMallInfo_7911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PrivilegeMallInfo_7911 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PrivilegeMallInfo_7911 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PrivilegeMallInfo_7911> parser() {
         return PARSER;
      }

      public Parser<C2S_PrivilegeMallInfo_7911> getParserForType() {
         return PARSER;
      }

      public C2S_PrivilegeMallInfo_7911 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PrivilegeMallInfo_7911OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallInfo_7911_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallInfo_7911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrivilegeMallInfo_7911.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.C2S_PrivilegeMallInfo_7911.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallInfo_7911_descriptor;
         }

         public C2S_PrivilegeMallInfo_7911 getDefaultInstanceForType() {
            return PrivilegeMsg.C2S_PrivilegeMallInfo_7911.getDefaultInstance();
         }

         public C2S_PrivilegeMallInfo_7911 build() {
            C2S_PrivilegeMallInfo_7911 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PrivilegeMallInfo_7911 buildPartial() {
            C2S_PrivilegeMallInfo_7911 result = new C2S_PrivilegeMallInfo_7911(this);
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
            if (other instanceof C2S_PrivilegeMallInfo_7911) {
               return this.mergeFrom((C2S_PrivilegeMallInfo_7911)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PrivilegeMallInfo_7911 other) {
            if (other == PrivilegeMsg.C2S_PrivilegeMallInfo_7911.getDefaultInstance()) {
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
            C2S_PrivilegeMallInfo_7911 parsedMessage = null;

            try {
               parsedMessage = (C2S_PrivilegeMallInfo_7911)PrivilegeMsg.C2S_PrivilegeMallInfo_7911.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PrivilegeMallInfo_7911)e.getUnfinishedMessage();
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

   public static final class S2C_PrivilegeMallResult_7912 extends GeneratedMessageV3 implements S2C_PrivilegeMallResult_7912OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GIFTIDS_FIELD_NUMBER = 1;
      private Internal.IntList giftIds_;
      private byte memoizedIsInitialized;
      private static final S2C_PrivilegeMallResult_7912 DEFAULT_INSTANCE = new S2C_PrivilegeMallResult_7912();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrivilegeMallResult_7912> PARSER = new AbstractParser<S2C_PrivilegeMallResult_7912>() {
         public S2C_PrivilegeMallResult_7912 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrivilegeMallResult_7912(input, extensionRegistry);
         }
      };

      private S2C_PrivilegeMallResult_7912(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrivilegeMallResult_7912() {
         this.memoizedIsInitialized = -1;
         this.giftIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrivilegeMallResult_7912();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrivilegeMallResult_7912(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.giftIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.giftIds_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.giftIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.giftIds_.addInt(input.readInt32());
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
                  this.giftIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallResult_7912_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallResult_7912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrivilegeMallResult_7912.class, Builder.class);
      }

      public List<Integer> getGiftIdsList() {
         return this.giftIds_;
      }

      public int getGiftIdsCount() {
         return this.giftIds_.size();
      }

      public int getGiftIds(int index) {
         return this.giftIds_.getInt(index);
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
         for(int i = 0; i < this.giftIds_.size(); ++i) {
            output.writeInt32(1, this.giftIds_.getInt(i));
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

            for(int i = 0; i < this.giftIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.giftIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGiftIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PrivilegeMallResult_7912)) {
            return super.equals(obj);
         } else {
            S2C_PrivilegeMallResult_7912 other = (S2C_PrivilegeMallResult_7912)obj;
            if (!this.getGiftIdsList().equals(other.getGiftIdsList())) {
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
            if (this.getGiftIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiftIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PrivilegeMallResult_7912 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrivilegeMallResult_7912)PARSER.parseFrom(data);
      }

      public static S2C_PrivilegeMallResult_7912 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrivilegeMallResult_7912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrivilegeMallResult_7912 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrivilegeMallResult_7912)PARSER.parseFrom(data);
      }

      public static S2C_PrivilegeMallResult_7912 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrivilegeMallResult_7912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrivilegeMallResult_7912 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrivilegeMallResult_7912)PARSER.parseFrom(data);
      }

      public static S2C_PrivilegeMallResult_7912 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrivilegeMallResult_7912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrivilegeMallResult_7912 parseFrom(InputStream input) throws IOException {
         return (S2C_PrivilegeMallResult_7912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrivilegeMallResult_7912 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrivilegeMallResult_7912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrivilegeMallResult_7912 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrivilegeMallResult_7912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrivilegeMallResult_7912 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrivilegeMallResult_7912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrivilegeMallResult_7912 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrivilegeMallResult_7912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrivilegeMallResult_7912 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrivilegeMallResult_7912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrivilegeMallResult_7912 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrivilegeMallResult_7912 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrivilegeMallResult_7912> parser() {
         return PARSER;
      }

      public Parser<S2C_PrivilegeMallResult_7912> getParserForType() {
         return PARSER;
      }

      public S2C_PrivilegeMallResult_7912 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrivilegeMallResult_7912OrBuilder {
         private int bitField0_;
         private Internal.IntList giftIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallResult_7912_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallResult_7912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrivilegeMallResult_7912.class, Builder.class);
         }

         private Builder() {
            this.giftIds_ = PrivilegeMsg.S2C_PrivilegeMallResult_7912.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.giftIds_ = PrivilegeMsg.S2C_PrivilegeMallResult_7912.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.S2C_PrivilegeMallResult_7912.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.giftIds_ = PrivilegeMsg.S2C_PrivilegeMallResult_7912.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallResult_7912_descriptor;
         }

         public S2C_PrivilegeMallResult_7912 getDefaultInstanceForType() {
            return PrivilegeMsg.S2C_PrivilegeMallResult_7912.getDefaultInstance();
         }

         public S2C_PrivilegeMallResult_7912 build() {
            S2C_PrivilegeMallResult_7912 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrivilegeMallResult_7912 buildPartial() {
            S2C_PrivilegeMallResult_7912 result = new S2C_PrivilegeMallResult_7912(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.giftIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.giftIds_ = this.giftIds_;
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
            if (other instanceof S2C_PrivilegeMallResult_7912) {
               return this.mergeFrom((S2C_PrivilegeMallResult_7912)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrivilegeMallResult_7912 other) {
            if (other == PrivilegeMsg.S2C_PrivilegeMallResult_7912.getDefaultInstance()) {
               return this;
            } else {
               if (!other.giftIds_.isEmpty()) {
                  if (this.giftIds_.isEmpty()) {
                     this.giftIds_ = other.giftIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureGiftIdsIsMutable();
                     this.giftIds_.addAll(other.giftIds_);
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
            S2C_PrivilegeMallResult_7912 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrivilegeMallResult_7912)PrivilegeMsg.S2C_PrivilegeMallResult_7912.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrivilegeMallResult_7912)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGiftIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.giftIds_ = PrivilegeMsg.S2C_PrivilegeMallResult_7912.mutableCopy(this.giftIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getGiftIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.giftIds_) : this.giftIds_);
         }

         public int getGiftIdsCount() {
            return this.giftIds_.size();
         }

         public int getGiftIds(int index) {
            return this.giftIds_.getInt(index);
         }

         public Builder setGiftIds(int index, int value) {
            this.ensureGiftIdsIsMutable();
            this.giftIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGiftIds(int value) {
            this.ensureGiftIdsIsMutable();
            this.giftIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGiftIds(Iterable<? extends Integer> values) {
            this.ensureGiftIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.giftIds_);
            this.onChanged();
            return this;
         }

         public Builder clearGiftIds() {
            this.giftIds_ = PrivilegeMsg.S2C_PrivilegeMallResult_7912.emptyIntList();
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

   public static final class C2S_PrivilegeMallBuy_7913 extends GeneratedMessageV3 implements C2S_PrivilegeMallBuy_7913OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYID_FIELD_NUMBER = 1;
      private int buyId_;
      private byte memoizedIsInitialized;
      private static final C2S_PrivilegeMallBuy_7913 DEFAULT_INSTANCE = new C2S_PrivilegeMallBuy_7913();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PrivilegeMallBuy_7913> PARSER = new AbstractParser<C2S_PrivilegeMallBuy_7913>() {
         public C2S_PrivilegeMallBuy_7913 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PrivilegeMallBuy_7913(input, extensionRegistry);
         }
      };

      private C2S_PrivilegeMallBuy_7913(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PrivilegeMallBuy_7913() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PrivilegeMallBuy_7913();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PrivilegeMallBuy_7913(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyId_ = input.readInt32();
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallBuy_7913_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallBuy_7913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrivilegeMallBuy_7913.class, Builder.class);
      }

      public boolean hasBuyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyId() {
         return this.buyId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PrivilegeMallBuy_7913)) {
            return super.equals(obj);
         } else {
            C2S_PrivilegeMallBuy_7913 other = (C2S_PrivilegeMallBuy_7913)obj;
            if (this.hasBuyId() != other.hasBuyId()) {
               return false;
            } else if (this.hasBuyId() && this.getBuyId() != other.getBuyId()) {
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
            if (this.hasBuyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PrivilegeMallBuy_7913 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PrivilegeMallBuy_7913)PARSER.parseFrom(data);
      }

      public static C2S_PrivilegeMallBuy_7913 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrivilegeMallBuy_7913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrivilegeMallBuy_7913 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PrivilegeMallBuy_7913)PARSER.parseFrom(data);
      }

      public static C2S_PrivilegeMallBuy_7913 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrivilegeMallBuy_7913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrivilegeMallBuy_7913 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PrivilegeMallBuy_7913)PARSER.parseFrom(data);
      }

      public static C2S_PrivilegeMallBuy_7913 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrivilegeMallBuy_7913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrivilegeMallBuy_7913 parseFrom(InputStream input) throws IOException {
         return (C2S_PrivilegeMallBuy_7913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrivilegeMallBuy_7913 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrivilegeMallBuy_7913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrivilegeMallBuy_7913 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PrivilegeMallBuy_7913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PrivilegeMallBuy_7913 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrivilegeMallBuy_7913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrivilegeMallBuy_7913 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PrivilegeMallBuy_7913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrivilegeMallBuy_7913 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrivilegeMallBuy_7913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PrivilegeMallBuy_7913 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PrivilegeMallBuy_7913 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PrivilegeMallBuy_7913> parser() {
         return PARSER;
      }

      public Parser<C2S_PrivilegeMallBuy_7913> getParserForType() {
         return PARSER;
      }

      public C2S_PrivilegeMallBuy_7913 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PrivilegeMallBuy_7913OrBuilder {
         private int bitField0_;
         private int buyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallBuy_7913_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallBuy_7913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrivilegeMallBuy_7913.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.C2S_PrivilegeMallBuy_7913.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_PrivilegeMallBuy_7913_descriptor;
         }

         public C2S_PrivilegeMallBuy_7913 getDefaultInstanceForType() {
            return PrivilegeMsg.C2S_PrivilegeMallBuy_7913.getDefaultInstance();
         }

         public C2S_PrivilegeMallBuy_7913 build() {
            C2S_PrivilegeMallBuy_7913 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PrivilegeMallBuy_7913 buildPartial() {
            C2S_PrivilegeMallBuy_7913 result = new C2S_PrivilegeMallBuy_7913(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyId_ = this.buyId_;
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
            if (other instanceof C2S_PrivilegeMallBuy_7913) {
               return this.mergeFrom((C2S_PrivilegeMallBuy_7913)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PrivilegeMallBuy_7913 other) {
            if (other == PrivilegeMsg.C2S_PrivilegeMallBuy_7913.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyId()) {
                  this.setBuyId(other.getBuyId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuyId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PrivilegeMallBuy_7913 parsedMessage = null;

            try {
               parsedMessage = (C2S_PrivilegeMallBuy_7913)PrivilegeMsg.C2S_PrivilegeMallBuy_7913.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PrivilegeMallBuy_7913)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyId() {
            return this.buyId_;
         }

         public Builder setBuyId(int value) {
            this.bitField0_ |= 1;
            this.buyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyId() {
            this.bitField0_ &= -2;
            this.buyId_ = 0;
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

   public static final class S2C_PrivilegeMallBuyResult_7914 extends GeneratedMessageV3 implements S2C_PrivilegeMallBuyResult_7914OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYID_FIELD_NUMBER = 1;
      private int buyId_;
      private byte memoizedIsInitialized;
      private static final S2C_PrivilegeMallBuyResult_7914 DEFAULT_INSTANCE = new S2C_PrivilegeMallBuyResult_7914();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrivilegeMallBuyResult_7914> PARSER = new AbstractParser<S2C_PrivilegeMallBuyResult_7914>() {
         public S2C_PrivilegeMallBuyResult_7914 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrivilegeMallBuyResult_7914(input, extensionRegistry);
         }
      };

      private S2C_PrivilegeMallBuyResult_7914(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrivilegeMallBuyResult_7914() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrivilegeMallBuyResult_7914();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrivilegeMallBuyResult_7914(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyId_ = input.readInt32();
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallBuyResult_7914_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallBuyResult_7914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrivilegeMallBuyResult_7914.class, Builder.class);
      }

      public boolean hasBuyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyId() {
         return this.buyId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PrivilegeMallBuyResult_7914)) {
            return super.equals(obj);
         } else {
            S2C_PrivilegeMallBuyResult_7914 other = (S2C_PrivilegeMallBuyResult_7914)obj;
            if (this.hasBuyId() != other.hasBuyId()) {
               return false;
            } else if (this.hasBuyId() && this.getBuyId() != other.getBuyId()) {
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
            if (this.hasBuyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PrivilegeMallBuyResult_7914 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrivilegeMallBuyResult_7914)PARSER.parseFrom(data);
      }

      public static S2C_PrivilegeMallBuyResult_7914 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrivilegeMallBuyResult_7914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrivilegeMallBuyResult_7914 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrivilegeMallBuyResult_7914)PARSER.parseFrom(data);
      }

      public static S2C_PrivilegeMallBuyResult_7914 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrivilegeMallBuyResult_7914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrivilegeMallBuyResult_7914 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrivilegeMallBuyResult_7914)PARSER.parseFrom(data);
      }

      public static S2C_PrivilegeMallBuyResult_7914 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrivilegeMallBuyResult_7914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrivilegeMallBuyResult_7914 parseFrom(InputStream input) throws IOException {
         return (S2C_PrivilegeMallBuyResult_7914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrivilegeMallBuyResult_7914 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrivilegeMallBuyResult_7914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrivilegeMallBuyResult_7914 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrivilegeMallBuyResult_7914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrivilegeMallBuyResult_7914 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrivilegeMallBuyResult_7914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrivilegeMallBuyResult_7914 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrivilegeMallBuyResult_7914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrivilegeMallBuyResult_7914 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrivilegeMallBuyResult_7914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrivilegeMallBuyResult_7914 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrivilegeMallBuyResult_7914 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrivilegeMallBuyResult_7914> parser() {
         return PARSER;
      }

      public Parser<S2C_PrivilegeMallBuyResult_7914> getParserForType() {
         return PARSER;
      }

      public S2C_PrivilegeMallBuyResult_7914 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrivilegeMallBuyResult_7914OrBuilder {
         private int bitField0_;
         private int buyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallBuyResult_7914_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallBuyResult_7914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrivilegeMallBuyResult_7914.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.S2C_PrivilegeMallBuyResult_7914.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_PrivilegeMallBuyResult_7914_descriptor;
         }

         public S2C_PrivilegeMallBuyResult_7914 getDefaultInstanceForType() {
            return PrivilegeMsg.S2C_PrivilegeMallBuyResult_7914.getDefaultInstance();
         }

         public S2C_PrivilegeMallBuyResult_7914 build() {
            S2C_PrivilegeMallBuyResult_7914 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrivilegeMallBuyResult_7914 buildPartial() {
            S2C_PrivilegeMallBuyResult_7914 result = new S2C_PrivilegeMallBuyResult_7914(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyId_ = this.buyId_;
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
            if (other instanceof S2C_PrivilegeMallBuyResult_7914) {
               return this.mergeFrom((S2C_PrivilegeMallBuyResult_7914)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrivilegeMallBuyResult_7914 other) {
            if (other == PrivilegeMsg.S2C_PrivilegeMallBuyResult_7914.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyId()) {
                  this.setBuyId(other.getBuyId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuyId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PrivilegeMallBuyResult_7914 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrivilegeMallBuyResult_7914)PrivilegeMsg.S2C_PrivilegeMallBuyResult_7914.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrivilegeMallBuyResult_7914)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyId() {
            return this.buyId_;
         }

         public Builder setBuyId(int value) {
            this.bitField0_ |= 1;
            this.buyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyId() {
            this.bitField0_ &= -2;
            this.buyId_ = 0;
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

   public static final class C2S_HeroStartShopInfo_7915 extends GeneratedMessageV3 implements C2S_HeroStartShopInfo_7915OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_HeroStartShopInfo_7915 DEFAULT_INSTANCE = new C2S_HeroStartShopInfo_7915();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroStartShopInfo_7915> PARSER = new AbstractParser<C2S_HeroStartShopInfo_7915>() {
         public C2S_HeroStartShopInfo_7915 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroStartShopInfo_7915(input, extensionRegistry);
         }
      };

      private C2S_HeroStartShopInfo_7915(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroStartShopInfo_7915() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroStartShopInfo_7915();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroStartShopInfo_7915(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopInfo_7915_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopInfo_7915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroStartShopInfo_7915.class, Builder.class);
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
         } else if (!(obj instanceof C2S_HeroStartShopInfo_7915)) {
            return super.equals(obj);
         } else {
            C2S_HeroStartShopInfo_7915 other = (C2S_HeroStartShopInfo_7915)obj;
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

      public static C2S_HeroStartShopInfo_7915 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroStartShopInfo_7915)PARSER.parseFrom(data);
      }

      public static C2S_HeroStartShopInfo_7915 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroStartShopInfo_7915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroStartShopInfo_7915 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroStartShopInfo_7915)PARSER.parseFrom(data);
      }

      public static C2S_HeroStartShopInfo_7915 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroStartShopInfo_7915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroStartShopInfo_7915 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroStartShopInfo_7915)PARSER.parseFrom(data);
      }

      public static C2S_HeroStartShopInfo_7915 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroStartShopInfo_7915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroStartShopInfo_7915 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroStartShopInfo_7915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroStartShopInfo_7915 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroStartShopInfo_7915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroStartShopInfo_7915 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroStartShopInfo_7915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroStartShopInfo_7915 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroStartShopInfo_7915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroStartShopInfo_7915 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroStartShopInfo_7915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroStartShopInfo_7915 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroStartShopInfo_7915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroStartShopInfo_7915 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroStartShopInfo_7915 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroStartShopInfo_7915> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroStartShopInfo_7915> getParserForType() {
         return PARSER;
      }

      public C2S_HeroStartShopInfo_7915 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroStartShopInfo_7915OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopInfo_7915_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopInfo_7915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroStartShopInfo_7915.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.C2S_HeroStartShopInfo_7915.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopInfo_7915_descriptor;
         }

         public C2S_HeroStartShopInfo_7915 getDefaultInstanceForType() {
            return PrivilegeMsg.C2S_HeroStartShopInfo_7915.getDefaultInstance();
         }

         public C2S_HeroStartShopInfo_7915 build() {
            C2S_HeroStartShopInfo_7915 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroStartShopInfo_7915 buildPartial() {
            C2S_HeroStartShopInfo_7915 result = new C2S_HeroStartShopInfo_7915(this);
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
            if (other instanceof C2S_HeroStartShopInfo_7915) {
               return this.mergeFrom((C2S_HeroStartShopInfo_7915)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroStartShopInfo_7915 other) {
            if (other == PrivilegeMsg.C2S_HeroStartShopInfo_7915.getDefaultInstance()) {
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
            C2S_HeroStartShopInfo_7915 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroStartShopInfo_7915)PrivilegeMsg.C2S_HeroStartShopInfo_7915.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroStartShopInfo_7915)e.getUnfinishedMessage();
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

   public static final class S2C_HeroStartShopResult_7916 extends GeneratedMessageV3 implements S2C_HeroStartShopResult_7916OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int BUYITEMS_FIELD_NUMBER = 1;
      private List<ShopMsg.BuyItem> buyItems_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroStartShopResult_7916 DEFAULT_INSTANCE = new S2C_HeroStartShopResult_7916();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroStartShopResult_7916> PARSER = new AbstractParser<S2C_HeroStartShopResult_7916>() {
         public S2C_HeroStartShopResult_7916 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroStartShopResult_7916(input, extensionRegistry);
         }
      };

      private S2C_HeroStartShopResult_7916(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroStartShopResult_7916() {
         this.memoizedIsInitialized = -1;
         this.buyItems_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroStartShopResult_7916();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroStartShopResult_7916(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.buyItems_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.buyItems_.add(input.readMessage(ShopMsg.BuyItem.PARSER, extensionRegistry));
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
                  this.buyItems_ = Collections.unmodifiableList(this.buyItems_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopResult_7916_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopResult_7916_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroStartShopResult_7916.class, Builder.class);
      }

      public List<ShopMsg.BuyItem> getBuyItemsList() {
         return this.buyItems_;
      }

      public List<? extends ShopMsg.BuyItemOrBuilder> getBuyItemsOrBuilderList() {
         return this.buyItems_;
      }

      public int getBuyItemsCount() {
         return this.buyItems_.size();
      }

      public ShopMsg.BuyItem getBuyItems(int index) {
         return (ShopMsg.BuyItem)this.buyItems_.get(index);
      }

      public ShopMsg.BuyItemOrBuilder getBuyItemsOrBuilder(int index) {
         return (ShopMsg.BuyItemOrBuilder)this.buyItems_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getBuyItemsCount(); ++i) {
               if (!this.getBuyItems(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.buyItems_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.buyItems_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.buyItems_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.buyItems_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroStartShopResult_7916)) {
            return super.equals(obj);
         } else {
            S2C_HeroStartShopResult_7916 other = (S2C_HeroStartShopResult_7916)obj;
            if (!this.getBuyItemsList().equals(other.getBuyItemsList())) {
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
            if (this.getBuyItemsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyItemsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroStartShopResult_7916 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroStartShopResult_7916)PARSER.parseFrom(data);
      }

      public static S2C_HeroStartShopResult_7916 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroStartShopResult_7916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroStartShopResult_7916 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroStartShopResult_7916)PARSER.parseFrom(data);
      }

      public static S2C_HeroStartShopResult_7916 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroStartShopResult_7916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroStartShopResult_7916 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroStartShopResult_7916)PARSER.parseFrom(data);
      }

      public static S2C_HeroStartShopResult_7916 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroStartShopResult_7916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroStartShopResult_7916 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroStartShopResult_7916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroStartShopResult_7916 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroStartShopResult_7916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroStartShopResult_7916 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroStartShopResult_7916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroStartShopResult_7916 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroStartShopResult_7916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroStartShopResult_7916 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroStartShopResult_7916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroStartShopResult_7916 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroStartShopResult_7916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroStartShopResult_7916 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroStartShopResult_7916 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroStartShopResult_7916> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroStartShopResult_7916> getParserForType() {
         return PARSER;
      }

      public S2C_HeroStartShopResult_7916 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroStartShopResult_7916OrBuilder {
         private int bitField0_;
         private List<ShopMsg.BuyItem> buyItems_;
         private RepeatedFieldBuilderV3<ShopMsg.BuyItem, ShopMsg.BuyItem.Builder, ShopMsg.BuyItemOrBuilder> buyItemsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopResult_7916_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopResult_7916_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroStartShopResult_7916.class, Builder.class);
         }

         private Builder() {
            this.buyItems_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.buyItems_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.S2C_HeroStartShopResult_7916.alwaysUseFieldBuilders) {
               this.getBuyItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.buyItemsBuilder_ == null) {
               this.buyItems_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.buyItemsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopResult_7916_descriptor;
         }

         public S2C_HeroStartShopResult_7916 getDefaultInstanceForType() {
            return PrivilegeMsg.S2C_HeroStartShopResult_7916.getDefaultInstance();
         }

         public S2C_HeroStartShopResult_7916 build() {
            S2C_HeroStartShopResult_7916 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroStartShopResult_7916 buildPartial() {
            S2C_HeroStartShopResult_7916 result = new S2C_HeroStartShopResult_7916(this);
            int from_bitField0_ = this.bitField0_;
            if (this.buyItemsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.buyItems_ = Collections.unmodifiableList(this.buyItems_);
                  this.bitField0_ &= -2;
               }

               result.buyItems_ = this.buyItems_;
            } else {
               result.buyItems_ = this.buyItemsBuilder_.build();
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
            if (other instanceof S2C_HeroStartShopResult_7916) {
               return this.mergeFrom((S2C_HeroStartShopResult_7916)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroStartShopResult_7916 other) {
            if (other == PrivilegeMsg.S2C_HeroStartShopResult_7916.getDefaultInstance()) {
               return this;
            } else {
               if (this.buyItemsBuilder_ == null) {
                  if (!other.buyItems_.isEmpty()) {
                     if (this.buyItems_.isEmpty()) {
                        this.buyItems_ = other.buyItems_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureBuyItemsIsMutable();
                        this.buyItems_.addAll(other.buyItems_);
                     }

                     this.onChanged();
                  }
               } else if (!other.buyItems_.isEmpty()) {
                  if (this.buyItemsBuilder_.isEmpty()) {
                     this.buyItemsBuilder_.dispose();
                     this.buyItemsBuilder_ = null;
                     this.buyItems_ = other.buyItems_;
                     this.bitField0_ &= -2;
                     this.buyItemsBuilder_ = PrivilegeMsg.S2C_HeroStartShopResult_7916.alwaysUseFieldBuilders ? this.getBuyItemsFieldBuilder() : null;
                  } else {
                     this.buyItemsBuilder_.addAllMessages(other.buyItems_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getBuyItemsCount(); ++i) {
               if (!this.getBuyItems(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroStartShopResult_7916 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroStartShopResult_7916)PrivilegeMsg.S2C_HeroStartShopResult_7916.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroStartShopResult_7916)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureBuyItemsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.buyItems_ = new ArrayList(this.buyItems_);
               this.bitField0_ |= 1;
            }

         }

         public List<ShopMsg.BuyItem> getBuyItemsList() {
            return this.buyItemsBuilder_ == null ? Collections.unmodifiableList(this.buyItems_) : this.buyItemsBuilder_.getMessageList();
         }

         public int getBuyItemsCount() {
            return this.buyItemsBuilder_ == null ? this.buyItems_.size() : this.buyItemsBuilder_.getCount();
         }

         public ShopMsg.BuyItem getBuyItems(int index) {
            return this.buyItemsBuilder_ == null ? (ShopMsg.BuyItem)this.buyItems_.get(index) : (ShopMsg.BuyItem)this.buyItemsBuilder_.getMessage(index);
         }

         public Builder setBuyItems(int index, ShopMsg.BuyItem value) {
            if (this.buyItemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuyItemsIsMutable();
               this.buyItems_.set(index, value);
               this.onChanged();
            } else {
               this.buyItemsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBuyItems(int index, ShopMsg.BuyItem.Builder builderForValue) {
            if (this.buyItemsBuilder_ == null) {
               this.ensureBuyItemsIsMutable();
               this.buyItems_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buyItemsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBuyItems(ShopMsg.BuyItem value) {
            if (this.buyItemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuyItemsIsMutable();
               this.buyItems_.add(value);
               this.onChanged();
            } else {
               this.buyItemsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBuyItems(int index, ShopMsg.BuyItem value) {
            if (this.buyItemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuyItemsIsMutable();
               this.buyItems_.add(index, value);
               this.onChanged();
            } else {
               this.buyItemsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBuyItems(ShopMsg.BuyItem.Builder builderForValue) {
            if (this.buyItemsBuilder_ == null) {
               this.ensureBuyItemsIsMutable();
               this.buyItems_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.buyItemsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBuyItems(int index, ShopMsg.BuyItem.Builder builderForValue) {
            if (this.buyItemsBuilder_ == null) {
               this.ensureBuyItemsIsMutable();
               this.buyItems_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buyItemsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBuyItems(Iterable<? extends ShopMsg.BuyItem> values) {
            if (this.buyItemsBuilder_ == null) {
               this.ensureBuyItemsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buyItems_);
               this.onChanged();
            } else {
               this.buyItemsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBuyItems() {
            if (this.buyItemsBuilder_ == null) {
               this.buyItems_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.buyItemsBuilder_.clear();
            }

            return this;
         }

         public Builder removeBuyItems(int index) {
            if (this.buyItemsBuilder_ == null) {
               this.ensureBuyItemsIsMutable();
               this.buyItems_.remove(index);
               this.onChanged();
            } else {
               this.buyItemsBuilder_.remove(index);
            }

            return this;
         }

         public ShopMsg.BuyItem.Builder getBuyItemsBuilder(int index) {
            return (ShopMsg.BuyItem.Builder)this.getBuyItemsFieldBuilder().getBuilder(index);
         }

         public ShopMsg.BuyItemOrBuilder getBuyItemsOrBuilder(int index) {
            return this.buyItemsBuilder_ == null ? (ShopMsg.BuyItemOrBuilder)this.buyItems_.get(index) : (ShopMsg.BuyItemOrBuilder)this.buyItemsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ShopMsg.BuyItemOrBuilder> getBuyItemsOrBuilderList() {
            return this.buyItemsBuilder_ != null ? this.buyItemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.buyItems_);
         }

         public ShopMsg.BuyItem.Builder addBuyItemsBuilder() {
            return (ShopMsg.BuyItem.Builder)this.getBuyItemsFieldBuilder().addBuilder(ShopMsg.BuyItem.getDefaultInstance());
         }

         public ShopMsg.BuyItem.Builder addBuyItemsBuilder(int index) {
            return (ShopMsg.BuyItem.Builder)this.getBuyItemsFieldBuilder().addBuilder(index, ShopMsg.BuyItem.getDefaultInstance());
         }

         public List<ShopMsg.BuyItem.Builder> getBuyItemsBuilderList() {
            return this.getBuyItemsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ShopMsg.BuyItem, ShopMsg.BuyItem.Builder, ShopMsg.BuyItemOrBuilder> getBuyItemsFieldBuilder() {
            if (this.buyItemsBuilder_ == null) {
               this.buyItemsBuilder_ = new RepeatedFieldBuilderV3(this.buyItems_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.buyItems_ = null;
            }

            return this.buyItemsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_HeroStartShopBuy_7917 extends GeneratedMessageV3 implements C2S_HeroStartShopBuy_7917OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOODID_FIELD_NUMBER = 1;
      private int goodId_;
      private byte memoizedIsInitialized;
      private static final C2S_HeroStartShopBuy_7917 DEFAULT_INSTANCE = new C2S_HeroStartShopBuy_7917();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroStartShopBuy_7917> PARSER = new AbstractParser<C2S_HeroStartShopBuy_7917>() {
         public C2S_HeroStartShopBuy_7917 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroStartShopBuy_7917(input, extensionRegistry);
         }
      };

      private C2S_HeroStartShopBuy_7917(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroStartShopBuy_7917() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroStartShopBuy_7917();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroStartShopBuy_7917(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopBuy_7917_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopBuy_7917_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroStartShopBuy_7917.class, Builder.class);
      }

      public boolean hasGoodId() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.goodId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.goodId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HeroStartShopBuy_7917)) {
            return super.equals(obj);
         } else {
            C2S_HeroStartShopBuy_7917 other = (C2S_HeroStartShopBuy_7917)obj;
            if (this.hasGoodId() != other.hasGoodId()) {
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
            if (this.hasGoodId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGoodId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HeroStartShopBuy_7917 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroStartShopBuy_7917)PARSER.parseFrom(data);
      }

      public static C2S_HeroStartShopBuy_7917 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroStartShopBuy_7917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroStartShopBuy_7917 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroStartShopBuy_7917)PARSER.parseFrom(data);
      }

      public static C2S_HeroStartShopBuy_7917 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroStartShopBuy_7917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroStartShopBuy_7917 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroStartShopBuy_7917)PARSER.parseFrom(data);
      }

      public static C2S_HeroStartShopBuy_7917 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroStartShopBuy_7917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroStartShopBuy_7917 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroStartShopBuy_7917)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroStartShopBuy_7917 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroStartShopBuy_7917)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroStartShopBuy_7917 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroStartShopBuy_7917)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroStartShopBuy_7917 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroStartShopBuy_7917)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroStartShopBuy_7917 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroStartShopBuy_7917)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroStartShopBuy_7917 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroStartShopBuy_7917)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroStartShopBuy_7917 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroStartShopBuy_7917 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroStartShopBuy_7917> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroStartShopBuy_7917> getParserForType() {
         return PARSER;
      }

      public C2S_HeroStartShopBuy_7917 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroStartShopBuy_7917OrBuilder {
         private int bitField0_;
         private int goodId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopBuy_7917_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopBuy_7917_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroStartShopBuy_7917.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.C2S_HeroStartShopBuy_7917.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.goodId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_HeroStartShopBuy_7917_descriptor;
         }

         public C2S_HeroStartShopBuy_7917 getDefaultInstanceForType() {
            return PrivilegeMsg.C2S_HeroStartShopBuy_7917.getDefaultInstance();
         }

         public C2S_HeroStartShopBuy_7917 build() {
            C2S_HeroStartShopBuy_7917 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroStartShopBuy_7917 buildPartial() {
            C2S_HeroStartShopBuy_7917 result = new C2S_HeroStartShopBuy_7917(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.goodId_ = this.goodId_;
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
            if (other instanceof C2S_HeroStartShopBuy_7917) {
               return this.mergeFrom((C2S_HeroStartShopBuy_7917)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroStartShopBuy_7917 other) {
            if (other == PrivilegeMsg.C2S_HeroStartShopBuy_7917.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGoodId()) {
                  this.setGoodId(other.getGoodId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGoodId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HeroStartShopBuy_7917 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroStartShopBuy_7917)PrivilegeMsg.C2S_HeroStartShopBuy_7917.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroStartShopBuy_7917)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGoodId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGoodId() {
            return this.goodId_;
         }

         public Builder setGoodId(int value) {
            this.bitField0_ |= 1;
            this.goodId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGoodId() {
            this.bitField0_ &= -2;
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

   public static final class S2C_HeroStartShopBuyResult_7918 extends GeneratedMessageV3 implements S2C_HeroStartShopBuyResult_7918OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYID_FIELD_NUMBER = 1;
      private int buyId_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroStartShopBuyResult_7918 DEFAULT_INSTANCE = new S2C_HeroStartShopBuyResult_7918();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroStartShopBuyResult_7918> PARSER = new AbstractParser<S2C_HeroStartShopBuyResult_7918>() {
         public S2C_HeroStartShopBuyResult_7918 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroStartShopBuyResult_7918(input, extensionRegistry);
         }
      };

      private S2C_HeroStartShopBuyResult_7918(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroStartShopBuyResult_7918() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroStartShopBuyResult_7918();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroStartShopBuyResult_7918(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyId_ = input.readInt32();
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopBuyResult_7918_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopBuyResult_7918_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroStartShopBuyResult_7918.class, Builder.class);
      }

      public boolean hasBuyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyId() {
         return this.buyId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroStartShopBuyResult_7918)) {
            return super.equals(obj);
         } else {
            S2C_HeroStartShopBuyResult_7918 other = (S2C_HeroStartShopBuyResult_7918)obj;
            if (this.hasBuyId() != other.hasBuyId()) {
               return false;
            } else if (this.hasBuyId() && this.getBuyId() != other.getBuyId()) {
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
            if (this.hasBuyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroStartShopBuyResult_7918 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroStartShopBuyResult_7918)PARSER.parseFrom(data);
      }

      public static S2C_HeroStartShopBuyResult_7918 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroStartShopBuyResult_7918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroStartShopBuyResult_7918 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroStartShopBuyResult_7918)PARSER.parseFrom(data);
      }

      public static S2C_HeroStartShopBuyResult_7918 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroStartShopBuyResult_7918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroStartShopBuyResult_7918 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroStartShopBuyResult_7918)PARSER.parseFrom(data);
      }

      public static S2C_HeroStartShopBuyResult_7918 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroStartShopBuyResult_7918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroStartShopBuyResult_7918 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroStartShopBuyResult_7918)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroStartShopBuyResult_7918 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroStartShopBuyResult_7918)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroStartShopBuyResult_7918 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroStartShopBuyResult_7918)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroStartShopBuyResult_7918 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroStartShopBuyResult_7918)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroStartShopBuyResult_7918 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroStartShopBuyResult_7918)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroStartShopBuyResult_7918 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroStartShopBuyResult_7918)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroStartShopBuyResult_7918 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroStartShopBuyResult_7918 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroStartShopBuyResult_7918> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroStartShopBuyResult_7918> getParserForType() {
         return PARSER;
      }

      public S2C_HeroStartShopBuyResult_7918 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroStartShopBuyResult_7918OrBuilder {
         private int bitField0_;
         private int buyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopBuyResult_7918_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopBuyResult_7918_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroStartShopBuyResult_7918.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.S2C_HeroStartShopBuyResult_7918.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_HeroStartShopBuyResult_7918_descriptor;
         }

         public S2C_HeroStartShopBuyResult_7918 getDefaultInstanceForType() {
            return PrivilegeMsg.S2C_HeroStartShopBuyResult_7918.getDefaultInstance();
         }

         public S2C_HeroStartShopBuyResult_7918 build() {
            S2C_HeroStartShopBuyResult_7918 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroStartShopBuyResult_7918 buildPartial() {
            S2C_HeroStartShopBuyResult_7918 result = new S2C_HeroStartShopBuyResult_7918(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyId_ = this.buyId_;
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
            if (other instanceof S2C_HeroStartShopBuyResult_7918) {
               return this.mergeFrom((S2C_HeroStartShopBuyResult_7918)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroStartShopBuyResult_7918 other) {
            if (other == PrivilegeMsg.S2C_HeroStartShopBuyResult_7918.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyId()) {
                  this.setBuyId(other.getBuyId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuyId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroStartShopBuyResult_7918 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroStartShopBuyResult_7918)PrivilegeMsg.S2C_HeroStartShopBuyResult_7918.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroStartShopBuyResult_7918)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyId() {
            return this.buyId_;
         }

         public Builder setBuyId(int value) {
            this.bitField0_ |= 1;
            this.buyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyId() {
            this.bitField0_ &= -2;
            this.buyId_ = 0;
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

   public static final class C2S_VipLevelShow_7919 extends GeneratedMessageV3 implements C2S_VipLevelShow_7919OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISSHOW_FIELD_NUMBER = 1;
      private boolean isShow_;
      private byte memoizedIsInitialized;
      private static final C2S_VipLevelShow_7919 DEFAULT_INSTANCE = new C2S_VipLevelShow_7919();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_VipLevelShow_7919> PARSER = new AbstractParser<C2S_VipLevelShow_7919>() {
         public C2S_VipLevelShow_7919 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_VipLevelShow_7919(input, extensionRegistry);
         }
      };

      private C2S_VipLevelShow_7919(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_VipLevelShow_7919() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_VipLevelShow_7919();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_VipLevelShow_7919(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isShow_ = input.readBool();
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipLevelShow_7919_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipLevelShow_7919_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VipLevelShow_7919.class, Builder.class);
      }

      public boolean hasIsShow() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsShow() {
         return this.isShow_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsShow()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.isShow_);
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
               size += CodedOutputStream.computeBoolSize(1, this.isShow_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_VipLevelShow_7919)) {
            return super.equals(obj);
         } else {
            C2S_VipLevelShow_7919 other = (C2S_VipLevelShow_7919)obj;
            if (this.hasIsShow() != other.hasIsShow()) {
               return false;
            } else if (this.hasIsShow() && this.getIsShow() != other.getIsShow()) {
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
            if (this.hasIsShow()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsShow());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_VipLevelShow_7919 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_VipLevelShow_7919)PARSER.parseFrom(data);
      }

      public static C2S_VipLevelShow_7919 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VipLevelShow_7919)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VipLevelShow_7919 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_VipLevelShow_7919)PARSER.parseFrom(data);
      }

      public static C2S_VipLevelShow_7919 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VipLevelShow_7919)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VipLevelShow_7919 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_VipLevelShow_7919)PARSER.parseFrom(data);
      }

      public static C2S_VipLevelShow_7919 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VipLevelShow_7919)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VipLevelShow_7919 parseFrom(InputStream input) throws IOException {
         return (C2S_VipLevelShow_7919)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VipLevelShow_7919 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VipLevelShow_7919)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VipLevelShow_7919 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_VipLevelShow_7919)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_VipLevelShow_7919 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VipLevelShow_7919)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VipLevelShow_7919 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_VipLevelShow_7919)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VipLevelShow_7919 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VipLevelShow_7919)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_VipLevelShow_7919 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_VipLevelShow_7919 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_VipLevelShow_7919> parser() {
         return PARSER;
      }

      public Parser<C2S_VipLevelShow_7919> getParserForType() {
         return PARSER;
      }

      public C2S_VipLevelShow_7919 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_VipLevelShow_7919OrBuilder {
         private int bitField0_;
         private boolean isShow_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipLevelShow_7919_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipLevelShow_7919_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VipLevelShow_7919.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.C2S_VipLevelShow_7919.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.isShow_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipLevelShow_7919_descriptor;
         }

         public C2S_VipLevelShow_7919 getDefaultInstanceForType() {
            return PrivilegeMsg.C2S_VipLevelShow_7919.getDefaultInstance();
         }

         public C2S_VipLevelShow_7919 build() {
            C2S_VipLevelShow_7919 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_VipLevelShow_7919 buildPartial() {
            C2S_VipLevelShow_7919 result = new C2S_VipLevelShow_7919(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isShow_ = this.isShow_;
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
            if (other instanceof C2S_VipLevelShow_7919) {
               return this.mergeFrom((C2S_VipLevelShow_7919)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_VipLevelShow_7919 other) {
            if (other == PrivilegeMsg.C2S_VipLevelShow_7919.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsShow()) {
                  this.setIsShow(other.getIsShow());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIsShow();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_VipLevelShow_7919 parsedMessage = null;

            try {
               parsedMessage = (C2S_VipLevelShow_7919)PrivilegeMsg.C2S_VipLevelShow_7919.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_VipLevelShow_7919)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsShow() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsShow() {
            return this.isShow_;
         }

         public Builder setIsShow(boolean value) {
            this.bitField0_ |= 1;
            this.isShow_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsShow() {
            this.bitField0_ &= -2;
            this.isShow_ = false;
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

   public static final class S2C_VipLevelShowResult_7920 extends GeneratedMessageV3 implements S2C_VipLevelShowResult_7920OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISSHOW_FIELD_NUMBER = 1;
      private boolean isShow_;
      private byte memoizedIsInitialized;
      private static final S2C_VipLevelShowResult_7920 DEFAULT_INSTANCE = new S2C_VipLevelShowResult_7920();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_VipLevelShowResult_7920> PARSER = new AbstractParser<S2C_VipLevelShowResult_7920>() {
         public S2C_VipLevelShowResult_7920 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_VipLevelShowResult_7920(input, extensionRegistry);
         }
      };

      private S2C_VipLevelShowResult_7920(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_VipLevelShowResult_7920() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_VipLevelShowResult_7920();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_VipLevelShowResult_7920(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isShow_ = input.readBool();
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipLevelShowResult_7920_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipLevelShowResult_7920_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_VipLevelShowResult_7920.class, Builder.class);
      }

      public boolean hasIsShow() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsShow() {
         return this.isShow_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsShow()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.isShow_);
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
               size += CodedOutputStream.computeBoolSize(1, this.isShow_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_VipLevelShowResult_7920)) {
            return super.equals(obj);
         } else {
            S2C_VipLevelShowResult_7920 other = (S2C_VipLevelShowResult_7920)obj;
            if (this.hasIsShow() != other.hasIsShow()) {
               return false;
            } else if (this.hasIsShow() && this.getIsShow() != other.getIsShow()) {
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
            if (this.hasIsShow()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsShow());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_VipLevelShowResult_7920 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_VipLevelShowResult_7920)PARSER.parseFrom(data);
      }

      public static S2C_VipLevelShowResult_7920 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VipLevelShowResult_7920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VipLevelShowResult_7920 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_VipLevelShowResult_7920)PARSER.parseFrom(data);
      }

      public static S2C_VipLevelShowResult_7920 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VipLevelShowResult_7920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VipLevelShowResult_7920 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_VipLevelShowResult_7920)PARSER.parseFrom(data);
      }

      public static S2C_VipLevelShowResult_7920 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VipLevelShowResult_7920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VipLevelShowResult_7920 parseFrom(InputStream input) throws IOException {
         return (S2C_VipLevelShowResult_7920)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_VipLevelShowResult_7920 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VipLevelShowResult_7920)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_VipLevelShowResult_7920 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_VipLevelShowResult_7920)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_VipLevelShowResult_7920 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VipLevelShowResult_7920)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_VipLevelShowResult_7920 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_VipLevelShowResult_7920)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_VipLevelShowResult_7920 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VipLevelShowResult_7920)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_VipLevelShowResult_7920 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_VipLevelShowResult_7920 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_VipLevelShowResult_7920> parser() {
         return PARSER;
      }

      public Parser<S2C_VipLevelShowResult_7920> getParserForType() {
         return PARSER;
      }

      public S2C_VipLevelShowResult_7920 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_VipLevelShowResult_7920OrBuilder {
         private int bitField0_;
         private boolean isShow_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipLevelShowResult_7920_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipLevelShowResult_7920_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_VipLevelShowResult_7920.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.S2C_VipLevelShowResult_7920.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.isShow_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipLevelShowResult_7920_descriptor;
         }

         public S2C_VipLevelShowResult_7920 getDefaultInstanceForType() {
            return PrivilegeMsg.S2C_VipLevelShowResult_7920.getDefaultInstance();
         }

         public S2C_VipLevelShowResult_7920 build() {
            S2C_VipLevelShowResult_7920 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_VipLevelShowResult_7920 buildPartial() {
            S2C_VipLevelShowResult_7920 result = new S2C_VipLevelShowResult_7920(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isShow_ = this.isShow_;
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
            if (other instanceof S2C_VipLevelShowResult_7920) {
               return this.mergeFrom((S2C_VipLevelShowResult_7920)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_VipLevelShowResult_7920 other) {
            if (other == PrivilegeMsg.S2C_VipLevelShowResult_7920.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsShow()) {
                  this.setIsShow(other.getIsShow());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIsShow();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_VipLevelShowResult_7920 parsedMessage = null;

            try {
               parsedMessage = (S2C_VipLevelShowResult_7920)PrivilegeMsg.S2C_VipLevelShowResult_7920.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_VipLevelShowResult_7920)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsShow() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsShow() {
            return this.isShow_;
         }

         public Builder setIsShow(boolean value) {
            this.bitField0_ |= 1;
            this.isShow_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsShow() {
            this.bitField0_ &= -2;
            this.isShow_ = false;
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

   public static final class C2S_VipMonthlyReward_7921 extends GeneratedMessageV3 implements C2S_VipMonthlyReward_7921OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int VIPLEVEL_FIELD_NUMBER = 1;
      private int vipLevel_;
      private byte memoizedIsInitialized;
      private static final C2S_VipMonthlyReward_7921 DEFAULT_INSTANCE = new C2S_VipMonthlyReward_7921();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_VipMonthlyReward_7921> PARSER = new AbstractParser<C2S_VipMonthlyReward_7921>() {
         public C2S_VipMonthlyReward_7921 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_VipMonthlyReward_7921(input, extensionRegistry);
         }
      };

      private C2S_VipMonthlyReward_7921(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_VipMonthlyReward_7921() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_VipMonthlyReward_7921();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_VipMonthlyReward_7921(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.vipLevel_ = input.readInt32();
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipMonthlyReward_7921_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipMonthlyReward_7921_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VipMonthlyReward_7921.class, Builder.class);
      }

      public boolean hasVipLevel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getVipLevel() {
         return this.vipLevel_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasVipLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.vipLevel_);
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
               size += CodedOutputStream.computeInt32Size(1, this.vipLevel_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_VipMonthlyReward_7921)) {
            return super.equals(obj);
         } else {
            C2S_VipMonthlyReward_7921 other = (C2S_VipMonthlyReward_7921)obj;
            if (this.hasVipLevel() != other.hasVipLevel()) {
               return false;
            } else if (this.hasVipLevel() && this.getVipLevel() != other.getVipLevel()) {
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
            if (this.hasVipLevel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getVipLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_VipMonthlyReward_7921 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_VipMonthlyReward_7921)PARSER.parseFrom(data);
      }

      public static C2S_VipMonthlyReward_7921 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VipMonthlyReward_7921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VipMonthlyReward_7921 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_VipMonthlyReward_7921)PARSER.parseFrom(data);
      }

      public static C2S_VipMonthlyReward_7921 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VipMonthlyReward_7921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VipMonthlyReward_7921 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_VipMonthlyReward_7921)PARSER.parseFrom(data);
      }

      public static C2S_VipMonthlyReward_7921 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VipMonthlyReward_7921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VipMonthlyReward_7921 parseFrom(InputStream input) throws IOException {
         return (C2S_VipMonthlyReward_7921)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VipMonthlyReward_7921 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VipMonthlyReward_7921)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VipMonthlyReward_7921 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_VipMonthlyReward_7921)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_VipMonthlyReward_7921 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VipMonthlyReward_7921)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VipMonthlyReward_7921 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_VipMonthlyReward_7921)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VipMonthlyReward_7921 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VipMonthlyReward_7921)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_VipMonthlyReward_7921 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_VipMonthlyReward_7921 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_VipMonthlyReward_7921> parser() {
         return PARSER;
      }

      public Parser<C2S_VipMonthlyReward_7921> getParserForType() {
         return PARSER;
      }

      public C2S_VipMonthlyReward_7921 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_VipMonthlyReward_7921OrBuilder {
         private int bitField0_;
         private int vipLevel_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipMonthlyReward_7921_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipMonthlyReward_7921_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VipMonthlyReward_7921.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.C2S_VipMonthlyReward_7921.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.vipLevel_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_VipMonthlyReward_7921_descriptor;
         }

         public C2S_VipMonthlyReward_7921 getDefaultInstanceForType() {
            return PrivilegeMsg.C2S_VipMonthlyReward_7921.getDefaultInstance();
         }

         public C2S_VipMonthlyReward_7921 build() {
            C2S_VipMonthlyReward_7921 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_VipMonthlyReward_7921 buildPartial() {
            C2S_VipMonthlyReward_7921 result = new C2S_VipMonthlyReward_7921(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.vipLevel_ = this.vipLevel_;
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
            if (other instanceof C2S_VipMonthlyReward_7921) {
               return this.mergeFrom((C2S_VipMonthlyReward_7921)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_VipMonthlyReward_7921 other) {
            if (other == PrivilegeMsg.C2S_VipMonthlyReward_7921.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasVipLevel()) {
                  this.setVipLevel(other.getVipLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasVipLevel();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_VipMonthlyReward_7921 parsedMessage = null;

            try {
               parsedMessage = (C2S_VipMonthlyReward_7921)PrivilegeMsg.C2S_VipMonthlyReward_7921.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_VipMonthlyReward_7921)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasVipLevel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getVipLevel() {
            return this.vipLevel_;
         }

         public Builder setVipLevel(int value) {
            this.bitField0_ |= 1;
            this.vipLevel_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVipLevel() {
            this.bitField0_ &= -2;
            this.vipLevel_ = 0;
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

   public static final class S2C_VipMonthlyRewardResult_7922 extends GeneratedMessageV3 implements S2C_VipMonthlyRewardResult_7922OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int VIPLEVEL_FIELD_NUMBER = 1;
      private int vipLevel_;
      private byte memoizedIsInitialized;
      private static final S2C_VipMonthlyRewardResult_7922 DEFAULT_INSTANCE = new S2C_VipMonthlyRewardResult_7922();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_VipMonthlyRewardResult_7922> PARSER = new AbstractParser<S2C_VipMonthlyRewardResult_7922>() {
         public S2C_VipMonthlyRewardResult_7922 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_VipMonthlyRewardResult_7922(input, extensionRegistry);
         }
      };

      private S2C_VipMonthlyRewardResult_7922(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_VipMonthlyRewardResult_7922() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_VipMonthlyRewardResult_7922();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_VipMonthlyRewardResult_7922(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.vipLevel_ = input.readInt32();
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipMonthlyRewardResult_7922_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipMonthlyRewardResult_7922_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_VipMonthlyRewardResult_7922.class, Builder.class);
      }

      public boolean hasVipLevel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getVipLevel() {
         return this.vipLevel_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasVipLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.vipLevel_);
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
               size += CodedOutputStream.computeInt32Size(1, this.vipLevel_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_VipMonthlyRewardResult_7922)) {
            return super.equals(obj);
         } else {
            S2C_VipMonthlyRewardResult_7922 other = (S2C_VipMonthlyRewardResult_7922)obj;
            if (this.hasVipLevel() != other.hasVipLevel()) {
               return false;
            } else if (this.hasVipLevel() && this.getVipLevel() != other.getVipLevel()) {
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
            if (this.hasVipLevel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getVipLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_VipMonthlyRewardResult_7922 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_VipMonthlyRewardResult_7922)PARSER.parseFrom(data);
      }

      public static S2C_VipMonthlyRewardResult_7922 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VipMonthlyRewardResult_7922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VipMonthlyRewardResult_7922 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_VipMonthlyRewardResult_7922)PARSER.parseFrom(data);
      }

      public static S2C_VipMonthlyRewardResult_7922 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VipMonthlyRewardResult_7922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VipMonthlyRewardResult_7922 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_VipMonthlyRewardResult_7922)PARSER.parseFrom(data);
      }

      public static S2C_VipMonthlyRewardResult_7922 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VipMonthlyRewardResult_7922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VipMonthlyRewardResult_7922 parseFrom(InputStream input) throws IOException {
         return (S2C_VipMonthlyRewardResult_7922)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_VipMonthlyRewardResult_7922 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VipMonthlyRewardResult_7922)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_VipMonthlyRewardResult_7922 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_VipMonthlyRewardResult_7922)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_VipMonthlyRewardResult_7922 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VipMonthlyRewardResult_7922)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_VipMonthlyRewardResult_7922 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_VipMonthlyRewardResult_7922)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_VipMonthlyRewardResult_7922 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VipMonthlyRewardResult_7922)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_VipMonthlyRewardResult_7922 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_VipMonthlyRewardResult_7922 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_VipMonthlyRewardResult_7922> parser() {
         return PARSER;
      }

      public Parser<S2C_VipMonthlyRewardResult_7922> getParserForType() {
         return PARSER;
      }

      public S2C_VipMonthlyRewardResult_7922 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_VipMonthlyRewardResult_7922OrBuilder {
         private int bitField0_;
         private int vipLevel_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipMonthlyRewardResult_7922_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipMonthlyRewardResult_7922_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_VipMonthlyRewardResult_7922.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.S2C_VipMonthlyRewardResult_7922.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.vipLevel_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_VipMonthlyRewardResult_7922_descriptor;
         }

         public S2C_VipMonthlyRewardResult_7922 getDefaultInstanceForType() {
            return PrivilegeMsg.S2C_VipMonthlyRewardResult_7922.getDefaultInstance();
         }

         public S2C_VipMonthlyRewardResult_7922 build() {
            S2C_VipMonthlyRewardResult_7922 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_VipMonthlyRewardResult_7922 buildPartial() {
            S2C_VipMonthlyRewardResult_7922 result = new S2C_VipMonthlyRewardResult_7922(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.vipLevel_ = this.vipLevel_;
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
            if (other instanceof S2C_VipMonthlyRewardResult_7922) {
               return this.mergeFrom((S2C_VipMonthlyRewardResult_7922)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_VipMonthlyRewardResult_7922 other) {
            if (other == PrivilegeMsg.S2C_VipMonthlyRewardResult_7922.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasVipLevel()) {
                  this.setVipLevel(other.getVipLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasVipLevel();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_VipMonthlyRewardResult_7922 parsedMessage = null;

            try {
               parsedMessage = (S2C_VipMonthlyRewardResult_7922)PrivilegeMsg.S2C_VipMonthlyRewardResult_7922.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_VipMonthlyRewardResult_7922)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasVipLevel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getVipLevel() {
            return this.vipLevel_;
         }

         public Builder setVipLevel(int value) {
            this.bitField0_ |= 1;
            this.vipLevel_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVipLevel() {
            this.bitField0_ &= -2;
            this.vipLevel_ = 0;
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

   public static final class C2S_DailyGiftReward_7923 extends GeneratedMessageV3 implements C2S_DailyGiftReward_7923OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DailyGiftReward_7923 DEFAULT_INSTANCE = new C2S_DailyGiftReward_7923();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DailyGiftReward_7923> PARSER = new AbstractParser<C2S_DailyGiftReward_7923>() {
         public C2S_DailyGiftReward_7923 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DailyGiftReward_7923(input, extensionRegistry);
         }
      };

      private C2S_DailyGiftReward_7923(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DailyGiftReward_7923() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DailyGiftReward_7923();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DailyGiftReward_7923(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftReward_7923_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftReward_7923_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailyGiftReward_7923.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DailyGiftReward_7923)) {
            return super.equals(obj);
         } else {
            C2S_DailyGiftReward_7923 other = (C2S_DailyGiftReward_7923)obj;
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

      public static C2S_DailyGiftReward_7923 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftReward_7923)PARSER.parseFrom(data);
      }

      public static C2S_DailyGiftReward_7923 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftReward_7923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyGiftReward_7923 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftReward_7923)PARSER.parseFrom(data);
      }

      public static C2S_DailyGiftReward_7923 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftReward_7923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyGiftReward_7923 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftReward_7923)PARSER.parseFrom(data);
      }

      public static C2S_DailyGiftReward_7923 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyGiftReward_7923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyGiftReward_7923 parseFrom(InputStream input) throws IOException {
         return (C2S_DailyGiftReward_7923)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailyGiftReward_7923 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyGiftReward_7923)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailyGiftReward_7923 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DailyGiftReward_7923)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DailyGiftReward_7923 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyGiftReward_7923)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailyGiftReward_7923 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DailyGiftReward_7923)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailyGiftReward_7923 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyGiftReward_7923)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DailyGiftReward_7923 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DailyGiftReward_7923 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DailyGiftReward_7923> parser() {
         return PARSER;
      }

      public Parser<C2S_DailyGiftReward_7923> getParserForType() {
         return PARSER;
      }

      public C2S_DailyGiftReward_7923 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DailyGiftReward_7923OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftReward_7923_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftReward_7923_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailyGiftReward_7923.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.C2S_DailyGiftReward_7923.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_C2S_DailyGiftReward_7923_descriptor;
         }

         public C2S_DailyGiftReward_7923 getDefaultInstanceForType() {
            return PrivilegeMsg.C2S_DailyGiftReward_7923.getDefaultInstance();
         }

         public C2S_DailyGiftReward_7923 build() {
            C2S_DailyGiftReward_7923 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DailyGiftReward_7923 buildPartial() {
            C2S_DailyGiftReward_7923 result = new C2S_DailyGiftReward_7923(this);
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
            if (other instanceof C2S_DailyGiftReward_7923) {
               return this.mergeFrom((C2S_DailyGiftReward_7923)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DailyGiftReward_7923 other) {
            if (other == PrivilegeMsg.C2S_DailyGiftReward_7923.getDefaultInstance()) {
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
            C2S_DailyGiftReward_7923 parsedMessage = null;

            try {
               parsedMessage = (C2S_DailyGiftReward_7923)PrivilegeMsg.C2S_DailyGiftReward_7923.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DailyGiftReward_7923)e.getUnfinishedMessage();
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

   public static final class S2C_DailyGiftReward_7924 extends GeneratedMessageV3 implements S2C_DailyGiftReward_7924OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_DailyGiftReward_7924 DEFAULT_INSTANCE = new S2C_DailyGiftReward_7924();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DailyGiftReward_7924> PARSER = new AbstractParser<S2C_DailyGiftReward_7924>() {
         public S2C_DailyGiftReward_7924 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DailyGiftReward_7924(input, extensionRegistry);
         }
      };

      private S2C_DailyGiftReward_7924(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DailyGiftReward_7924() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DailyGiftReward_7924();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DailyGiftReward_7924(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftReward_7924_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftReward_7924_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailyGiftReward_7924.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.result_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DailyGiftReward_7924)) {
            return super.equals(obj);
         } else {
            S2C_DailyGiftReward_7924 other = (S2C_DailyGiftReward_7924)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DailyGiftReward_7924 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftReward_7924)PARSER.parseFrom(data);
      }

      public static S2C_DailyGiftReward_7924 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftReward_7924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyGiftReward_7924 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftReward_7924)PARSER.parseFrom(data);
      }

      public static S2C_DailyGiftReward_7924 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftReward_7924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyGiftReward_7924 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftReward_7924)PARSER.parseFrom(data);
      }

      public static S2C_DailyGiftReward_7924 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyGiftReward_7924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyGiftReward_7924 parseFrom(InputStream input) throws IOException {
         return (S2C_DailyGiftReward_7924)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailyGiftReward_7924 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyGiftReward_7924)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailyGiftReward_7924 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DailyGiftReward_7924)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DailyGiftReward_7924 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyGiftReward_7924)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailyGiftReward_7924 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DailyGiftReward_7924)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailyGiftReward_7924 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyGiftReward_7924)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DailyGiftReward_7924 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DailyGiftReward_7924 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DailyGiftReward_7924> parser() {
         return PARSER;
      }

      public Parser<S2C_DailyGiftReward_7924> getParserForType() {
         return PARSER;
      }

      public S2C_DailyGiftReward_7924 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DailyGiftReward_7924OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftReward_7924_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftReward_7924_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailyGiftReward_7924.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrivilegeMsg.S2C_DailyGiftReward_7924.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrivilegeMsg.internal_static_privilege_com_gzbz_protobuf_S2C_DailyGiftReward_7924_descriptor;
         }

         public S2C_DailyGiftReward_7924 getDefaultInstanceForType() {
            return PrivilegeMsg.S2C_DailyGiftReward_7924.getDefaultInstance();
         }

         public S2C_DailyGiftReward_7924 build() {
            S2C_DailyGiftReward_7924 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DailyGiftReward_7924 buildPartial() {
            S2C_DailyGiftReward_7924 result = new S2C_DailyGiftReward_7924(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_DailyGiftReward_7924) {
               return this.mergeFrom((S2C_DailyGiftReward_7924)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DailyGiftReward_7924 other) {
            if (other == PrivilegeMsg.S2C_DailyGiftReward_7924.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasResult();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DailyGiftReward_7924 parsedMessage = null;

            try {
               parsedMessage = (S2C_DailyGiftReward_7924)PrivilegeMsg.S2C_DailyGiftReward_7924.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DailyGiftReward_7924)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_DailyGiftBuy_7909OrBuilder extends MessageOrBuilder {
      boolean hasBuyId();

      int getBuyId();
   }

   public interface C2S_DailyGiftInfo_7907OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DailyGiftReward_7923OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_HeroStartShopBuy_7917OrBuilder extends MessageOrBuilder {
      boolean hasGoodId();

      int getGoodId();
   }

   public interface C2S_HeroStartShopInfo_7915OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PrivilegeMallBuy_7913OrBuilder extends MessageOrBuilder {
      boolean hasBuyId();

      int getBuyId();
   }

   public interface C2S_PrivilegeMallInfo_7911OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SingleRechargeInfo_7901OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_VipGiftBuy_7905OrBuilder extends MessageOrBuilder {
      boolean hasVipLevel();

      int getVipLevel();
   }

   public interface C2S_VipGiftInfo_7903OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_VipLevelShow_7919OrBuilder extends MessageOrBuilder {
      boolean hasIsShow();

      boolean getIsShow();
   }

   public interface C2S_VipMonthlyReward_7921OrBuilder extends MessageOrBuilder {
      boolean hasVipLevel();

      int getVipLevel();
   }

   public interface S2C_DailyGiftBuyResult_7910OrBuilder extends MessageOrBuilder {
      boolean hasBuyId();

      int getBuyId();
   }

   public interface S2C_DailyGiftResult_7908OrBuilder extends MessageOrBuilder {
      List<Integer> getGiftIdsList();

      int getGiftIdsCount();

      int getGiftIds(int index);

      boolean hasIsGot();

      boolean getIsGot();
   }

   public interface S2C_DailyGiftReward_7924OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_HeroStartShopBuyResult_7918OrBuilder extends MessageOrBuilder {
      boolean hasBuyId();

      int getBuyId();
   }

   public interface S2C_HeroStartShopResult_7916OrBuilder extends MessageOrBuilder {
      List<ShopMsg.BuyItem> getBuyItemsList();

      ShopMsg.BuyItem getBuyItems(int index);

      int getBuyItemsCount();

      List<? extends ShopMsg.BuyItemOrBuilder> getBuyItemsOrBuilderList();

      ShopMsg.BuyItemOrBuilder getBuyItemsOrBuilder(int index);
   }

   public interface S2C_PrivilegeMallBuyResult_7914OrBuilder extends MessageOrBuilder {
      boolean hasBuyId();

      int getBuyId();
   }

   public interface S2C_PrivilegeMallResult_7912OrBuilder extends MessageOrBuilder {
      List<Integer> getGiftIdsList();

      int getGiftIdsCount();

      int getGiftIds(int index);
   }

   public interface S2C_SingleRechargeResult_7902OrBuilder extends MessageOrBuilder {
      List<Integer> getFirstRechargeIdsList();

      int getFirstRechargeIdsCount();

      int getFirstRechargeIds(int index);
   }

   public interface S2C_VipGiftBuyResult_7906OrBuilder extends MessageOrBuilder {
      boolean hasVipLevel();

      int getVipLevel();
   }

   public interface S2C_VipGiftResult_7904OrBuilder extends MessageOrBuilder {
      List<Integer> getGiftIdsList();

      int getGiftIdsCount();

      int getGiftIds(int index);

      boolean hasMonthlyCard();

      int getMonthlyCard();

      List<Integer> getRewardLevelsList();

      int getRewardLevelsCount();

      int getRewardLevels(int index);
   }

   public interface S2C_VipLevelShowResult_7920OrBuilder extends MessageOrBuilder {
      boolean hasIsShow();

      boolean getIsShow();
   }

   public interface S2C_VipMonthlyRewardResult_7922OrBuilder extends MessageOrBuilder {
      boolean hasVipLevel();

      int getVipLevel();
   }
}
