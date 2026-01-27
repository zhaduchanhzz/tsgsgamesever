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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DragonVeinMsg {
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_SoulData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_SoulData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_HeroTypeAttr_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_HeroTypeAttr_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonVeinInfo_29101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonVeinInfo_29101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonVeinInfo_29102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonVeinInfo_29102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_C2S_Lottery_29103_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_C2S_Lottery_29103_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_S2C_Lottery_29104_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_S2C_Lottery_29104_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_C2S_PresentSoul_29105_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_C2S_PresentSoul_29105_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_S2C_PresentSoul_29106_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_S2C_PresentSoul_29106_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_C2S_DismissSoul_29107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_C2S_DismissSoul_29107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_S2C_DismissSoul_29108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_S2C_DismissSoul_29108_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonSoulValUp_29109_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonSoulValUp_29109_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonSoulValUp_29110_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonSoulValUp_29110_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_OptionVal_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_OptionVal_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_C2S_CommitOption_29111_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_C2S_CommitOption_29111_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_S2C_CommitOption_29112_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_S2C_CommitOption_29112_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_C2S_OptionInfo_29113_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_C2S_OptionInfo_29113_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonVein_com_gzbz_protobuf_S2C_OptionInfo_29114_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonVein_com_gzbz_protobuf_S2C_OptionInfo_29114_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private DragonVeinMsg() {
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
      String[] descriptorData = new String[]{"\n\u0010DragonVein.proto\u0012\u001cdragonVein.com.gzbz.protobuf\u001a\fcommon.proto\"ª\u0001\n\bSoulData\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bposition\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006soulLv\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007quality\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005score\u0018\u0005 \u0002(\u0003\u00128\n\u0004attr\u0018\u0006 \u0003(\u000b2*.dragonVein.com.gzbz.protobuf.HeroTypeAttr\u0012\u0014\n\fgroupSkillId\u0018\u0007 \u0001(\u0005\"H\n\fHeroTypeAttr\u0012\u0010\n\bheroType\u0018\u0001 \u0001(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003way\u0018\u0003 \u0002(\u0005\u0012\u000b\n\u0003val\u0018\u0004 \u0002(\u0005\"\u001a\n\u0018C2S_DragonVeinInfo_29101\"à\u0001\n\u0018S2C_DragonVeinInfo_29102\u0012?\n\u000fpresentSoulData\u0018\u0001 \u0003(\u000b2&.dragonVein.com.gzbz.protobuf.SoulData\u0012?\n\u000fsurplusSoulData\u0018\u0002 \u0003(\u000b2&.dragonVein.com.gzbz.protobuf.SoulData\u0012\u0014\n\fdragonVeinLv\u0018\u0003 \u0002(\u0005\u0012\u0015\n\rdragonVeinExp\u0018\u0004 \u0002(\u0005\u0012\u0015\n\rdragonSoulVal\u0018\u0005 \u0002(\u0005\"\u0013\n\u0011C2S_Lottery_29103\"\u009b\u0001\n\u0011S2C_Lottery_29104\u00127\n\u0007gotSoul\u0018\u0001 \u0001(\u000b2&.dragonVein.com.gzbz.protobuf.SoulData\u0012\u0014\n\fdragonVeinLv\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rdragonVeinExp\u0018\u0003 \u0002(\u0005\u0012\u000e\n\u0006result\u0018\u0004 \u0002(\u0005\u0012\u0010\n\btipsCode\u0018\u0005 \u0001(\u0005\"8\n\u0015C2S_PresentSoul_29105\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tisResolve\u0018\u0002 \u0002(\b\"ç\u0001\n\u0015S2C_PresentSoul_29106\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012?\n\u000fpresentSoulData\u0018\u0002 \u0003(\u000b2&.dragonVein.com.gzbz.protobuf.SoulData\u0012?\n\u000fsurplusSoulData\u0018\u0003 \u0003(\u000b2&.dragonVein.com.gzbz.protobuf.SoulData\u0012\u0011\n\tisResolve\u0018\u0004 \u0002(\b\u0012\u0014\n\fdragonVeinLv\u0018\u0005 \u0002(\u0005\u0012\u0015\n\rdragonVeinExp\u0018\u0006 \u0002(\u0005\"7\n\u0015C2S_DismissSoul_29107\u0012\u0010\n\bposition\u0018\u0001 \u0001(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0001(\u0005\"ß\u0001\n\u0015S2C_DismissSoul_29108\u0012?\n\u000fpresentSoulData\u0018\u0001 \u0003(\u000b2&.dragonVein.com.gzbz.protobuf.SoulData\u0012?\n\u000fsurplusSoulData\u0018\u0002 \u0003(\u000b2&.dragonVein.com.gzbz.protobuf.SoulData\u0012\u0017\n\u000fresolvePosition\u0018\u0003 \u0001(\u0005\u0012\u0014\n\fdragonVeinLv\u0018\u0004 \u0002(\u0005\u0012\u0015\n\rdragonVeinExp\u0018\u0005 \u0002(\u0005\"?\n\u0019C2S_DragonSoulValUp_29109\u0012\"\n\u0007itemNum\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\"2\n\u0019S2C_DragonSoulValUp_29110\u0012\u0015\n\rdragonSoulVal\u0018\u0001 \u0002(\u0005\"R\n\tOptionVal\u00128\n\u0006option\u0018\u0001 \u0002(\u000e2(.dragonVein.com.gzbz.protobuf.OptionEnum\u0012\u000b\n\u0003val\u0018\u0002 \u0001(\u0005\"T\n\u0016C2S_CommitOption_29111\u0012:\n\toptionVal\u0018\u0001 \u0003(\u000b2'.dragonVein.com.gzbz.protobuf.OptionVal\"T\n\u0016S2C_CommitOption_29112\u0012:\n\toptionVal\u0018\u0001 \u0003(\u000b2'.dragonVein.com.gzbz.protobuf.OptionVal\"\u0016\n\u0014C2S_OptionInfo_29113\"R\n\u0014S2C_OptionInfo_29114\u0012:\n\toptionVal\u0018\u0001 \u0003(\u000b2'.dragonVein.com.gzbz.protobuf.OptionVal*´\u0002\n\nOptionEnum\u0012\u0010\n\fSOUL_QUALITY\u0010\u0001\u0012\u0012\n\u000eSOUL_SCORE_TOP\u0010\u0002\u0012\u000e\n\nAND_OR_TOP\u0010\u0003\u0012\f\n\bATTR_TOP\u0010\u0004\u0012\u0011\n\rBASE_ATTR_TOP\u0010\u0005\u0012\u0014\n\u0010SPECIAL_ATTR_TOP\u0010\u0006\u0012\u0015\n\u0011SOUL_SCORE_BOTTOM\u0010\u0007\u0012\u0011\n\rAND_OR_BOTTOM\u0010\b\u0012\u000f\n\u000bATTR_BOTTOM\u0010\t\u0012\u0014\n\u0010BASE_ATTR_BOTTOM\u0010\n\u0012\u0017\n\u0013SPECIAL_ATTR_BOTTOM\u0010\u000b\u0012\u000e\n\nSOUL_GROUP\u0010\f\u0012\u000e\n\nATTR_GROUP\u0010\r\u0012\u0014\n\u0010SOUL_GROUP_SKILL\u0010\u000e\u0012\t\n\u0005SPEED\u0010\u000f\u0012\u000e\n\nBACK_STATE\u0010\u0010B$\n\u0011com.gzbz.protobufB\rDragonVeinMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_dragonVein_com_gzbz_protobuf_SoulData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_dragonVein_com_gzbz_protobuf_SoulData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_SoulData_descriptor, new String[]{"Code", "Position", "SoulLv", "Quality", "Score", "Attr", "GroupSkillId"});
      internal_static_dragonVein_com_gzbz_protobuf_HeroTypeAttr_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_dragonVein_com_gzbz_protobuf_HeroTypeAttr_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_HeroTypeAttr_descriptor, new String[]{"HeroType", "Type", "Way", "Val"});
      internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonVeinInfo_29101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonVeinInfo_29101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonVeinInfo_29101_descriptor, new String[0]);
      internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonVeinInfo_29102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonVeinInfo_29102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonVeinInfo_29102_descriptor, new String[]{"PresentSoulData", "SurplusSoulData", "DragonVeinLv", "DragonVeinExp", "DragonSoulVal"});
      internal_static_dragonVein_com_gzbz_protobuf_C2S_Lottery_29103_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_dragonVein_com_gzbz_protobuf_C2S_Lottery_29103_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_C2S_Lottery_29103_descriptor, new String[0]);
      internal_static_dragonVein_com_gzbz_protobuf_S2C_Lottery_29104_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_dragonVein_com_gzbz_protobuf_S2C_Lottery_29104_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_S2C_Lottery_29104_descriptor, new String[]{"GotSoul", "DragonVeinLv", "DragonVeinExp", "Result", "TipsCode"});
      internal_static_dragonVein_com_gzbz_protobuf_C2S_PresentSoul_29105_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_dragonVein_com_gzbz_protobuf_C2S_PresentSoul_29105_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_C2S_PresentSoul_29105_descriptor, new String[]{"Code", "IsResolve"});
      internal_static_dragonVein_com_gzbz_protobuf_S2C_PresentSoul_29106_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_dragonVein_com_gzbz_protobuf_S2C_PresentSoul_29106_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_S2C_PresentSoul_29106_descriptor, new String[]{"Code", "PresentSoulData", "SurplusSoulData", "IsResolve", "DragonVeinLv", "DragonVeinExp"});
      internal_static_dragonVein_com_gzbz_protobuf_C2S_DismissSoul_29107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_dragonVein_com_gzbz_protobuf_C2S_DismissSoul_29107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_C2S_DismissSoul_29107_descriptor, new String[]{"Position", "Code"});
      internal_static_dragonVein_com_gzbz_protobuf_S2C_DismissSoul_29108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_dragonVein_com_gzbz_protobuf_S2C_DismissSoul_29108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_S2C_DismissSoul_29108_descriptor, new String[]{"PresentSoulData", "SurplusSoulData", "ResolvePosition", "DragonVeinLv", "DragonVeinExp"});
      internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonSoulValUp_29109_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonSoulValUp_29109_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonSoulValUp_29109_descriptor, new String[]{"ItemNum"});
      internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonSoulValUp_29110_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonSoulValUp_29110_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonSoulValUp_29110_descriptor, new String[]{"DragonSoulVal"});
      internal_static_dragonVein_com_gzbz_protobuf_OptionVal_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_dragonVein_com_gzbz_protobuf_OptionVal_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_OptionVal_descriptor, new String[]{"Option", "Val"});
      internal_static_dragonVein_com_gzbz_protobuf_C2S_CommitOption_29111_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_dragonVein_com_gzbz_protobuf_C2S_CommitOption_29111_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_C2S_CommitOption_29111_descriptor, new String[]{"OptionVal"});
      internal_static_dragonVein_com_gzbz_protobuf_S2C_CommitOption_29112_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_dragonVein_com_gzbz_protobuf_S2C_CommitOption_29112_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_S2C_CommitOption_29112_descriptor, new String[]{"OptionVal"});
      internal_static_dragonVein_com_gzbz_protobuf_C2S_OptionInfo_29113_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_dragonVein_com_gzbz_protobuf_C2S_OptionInfo_29113_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_C2S_OptionInfo_29113_descriptor, new String[0]);
      internal_static_dragonVein_com_gzbz_protobuf_S2C_OptionInfo_29114_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_dragonVein_com_gzbz_protobuf_S2C_OptionInfo_29114_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonVein_com_gzbz_protobuf_S2C_OptionInfo_29114_descriptor, new String[]{"OptionVal"});
      CommonMsg.getDescriptor();
   }

   public static enum OptionEnum implements ProtocolMessageEnum {
      SOUL_QUALITY(1),
      SOUL_SCORE_TOP(2),
      AND_OR_TOP(3),
      ATTR_TOP(4),
      BASE_ATTR_TOP(5),
      SPECIAL_ATTR_TOP(6),
      SOUL_SCORE_BOTTOM(7),
      AND_OR_BOTTOM(8),
      ATTR_BOTTOM(9),
      BASE_ATTR_BOTTOM(10),
      SPECIAL_ATTR_BOTTOM(11),
      SOUL_GROUP(12),
      ATTR_GROUP(13),
      SOUL_GROUP_SKILL(14),
      SPEED(15),
      BACK_STATE(16);

      public static final int SOUL_QUALITY_VALUE = 1;
      public static final int SOUL_SCORE_TOP_VALUE = 2;
      public static final int AND_OR_TOP_VALUE = 3;
      public static final int ATTR_TOP_VALUE = 4;
      public static final int BASE_ATTR_TOP_VALUE = 5;
      public static final int SPECIAL_ATTR_TOP_VALUE = 6;
      public static final int SOUL_SCORE_BOTTOM_VALUE = 7;
      public static final int AND_OR_BOTTOM_VALUE = 8;
      public static final int ATTR_BOTTOM_VALUE = 9;
      public static final int BASE_ATTR_BOTTOM_VALUE = 10;
      public static final int SPECIAL_ATTR_BOTTOM_VALUE = 11;
      public static final int SOUL_GROUP_VALUE = 12;
      public static final int ATTR_GROUP_VALUE = 13;
      public static final int SOUL_GROUP_SKILL_VALUE = 14;
      public static final int SPEED_VALUE = 15;
      public static final int BACK_STATE_VALUE = 16;
      private static final Internal.EnumLiteMap<OptionEnum> internalValueMap = new Internal.EnumLiteMap<OptionEnum>() {
         public OptionEnum findValueByNumber(int number) {
            return DragonVeinMsg.OptionEnum.forNumber(number);
         }
      };
      private static final OptionEnum[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static OptionEnum valueOf(int value) {
         return forNumber(value);
      }

      public static OptionEnum forNumber(int value) {
         switch (value) {
            case 1:
               return SOUL_QUALITY;
            case 2:
               return SOUL_SCORE_TOP;
            case 3:
               return AND_OR_TOP;
            case 4:
               return ATTR_TOP;
            case 5:
               return BASE_ATTR_TOP;
            case 6:
               return SPECIAL_ATTR_TOP;
            case 7:
               return SOUL_SCORE_BOTTOM;
            case 8:
               return AND_OR_BOTTOM;
            case 9:
               return ATTR_BOTTOM;
            case 10:
               return BASE_ATTR_BOTTOM;
            case 11:
               return SPECIAL_ATTR_BOTTOM;
            case 12:
               return SOUL_GROUP;
            case 13:
               return ATTR_GROUP;
            case 14:
               return SOUL_GROUP_SKILL;
            case 15:
               return SPEED;
            case 16:
               return BACK_STATE;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<OptionEnum> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)DragonVeinMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static OptionEnum valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private OptionEnum(int value) {
         this.value = value;
      }
   }

   public static final class SoulData extends GeneratedMessageV3 implements SoulDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int SOULLV_FIELD_NUMBER = 3;
      private int soulLv_;
      public static final int QUALITY_FIELD_NUMBER = 4;
      private int quality_;
      public static final int SCORE_FIELD_NUMBER = 5;
      private long score_;
      public static final int ATTR_FIELD_NUMBER = 6;
      private List<HeroTypeAttr> attr_;
      public static final int GROUPSKILLID_FIELD_NUMBER = 7;
      private int groupSkillId_;
      private byte memoizedIsInitialized;
      private static final SoulData DEFAULT_INSTANCE = new SoulData();
      /** @deprecated */
      @Deprecated
      public static final Parser<SoulData> PARSER = new AbstractParser<SoulData>() {
         public SoulData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new SoulData(input, extensionRegistry);
         }
      };

      private SoulData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private SoulData() {
         this.memoizedIsInitialized = -1;
         this.attr_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new SoulData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private SoulData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.position_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.soulLv_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.quality_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.score_ = input.readInt64();
                        break;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.attr_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.attr_.add(input.readMessage(DragonVeinMsg.HeroTypeAttr.PARSER, extensionRegistry));
                        break;
                     case 56:
                        this.bitField0_ |= 32;
                        this.groupSkillId_ = input.readInt32();
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
               if ((mutable_bitField0_ & 32) != 0) {
                  this.attr_ = Collections.unmodifiableList(this.attr_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_SoulData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_SoulData_fieldAccessorTable.ensureFieldAccessorsInitialized(SoulData.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public boolean hasSoulLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSoulLv() {
         return this.soulLv_;
      }

      public boolean hasQuality() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getQuality() {
         return this.quality_;
      }

      public boolean hasScore() {
         return (this.bitField0_ & 16) != 0;
      }

      public long getScore() {
         return this.score_;
      }

      public List<HeroTypeAttr> getAttrList() {
         return this.attr_;
      }

      public List<? extends HeroTypeAttrOrBuilder> getAttrOrBuilderList() {
         return this.attr_;
      }

      public int getAttrCount() {
         return this.attr_.size();
      }

      public HeroTypeAttr getAttr(int index) {
         return (HeroTypeAttr)this.attr_.get(index);
      }

      public HeroTypeAttrOrBuilder getAttrOrBuilder(int index) {
         return (HeroTypeAttrOrBuilder)this.attr_.get(index);
      }

      public boolean hasGroupSkillId() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getGroupSkillId() {
         return this.groupSkillId_;
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
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSoulLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasQuality()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getAttrCount(); ++i) {
               if (!this.getAttr(i).isInitialized()) {
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
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.position_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.soulLv_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.quality_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt64(5, this.score_);
         }

         for(int i = 0; i < this.attr_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.attr_.get(i));
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(7, this.groupSkillId_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.position_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.soulLv_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.quality_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt64Size(5, this.score_);
            }

            for(int i = 0; i < this.attr_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.attr_.get(i));
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.groupSkillId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof SoulData)) {
            return super.equals(obj);
         } else {
            SoulData other = (SoulData)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
               return false;
            } else if (this.hasSoulLv() != other.hasSoulLv()) {
               return false;
            } else if (this.hasSoulLv() && this.getSoulLv() != other.getSoulLv()) {
               return false;
            } else if (this.hasQuality() != other.hasQuality()) {
               return false;
            } else if (this.hasQuality() && this.getQuality() != other.getQuality()) {
               return false;
            } else if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
               return false;
            } else if (!this.getAttrList().equals(other.getAttrList())) {
               return false;
            } else if (this.hasGroupSkillId() != other.hasGroupSkillId()) {
               return false;
            } else if (this.hasGroupSkillId() && this.getGroupSkillId() != other.getGroupSkillId()) {
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

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPosition();
            }

            if (this.hasSoulLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSoulLv();
            }

            if (this.hasQuality()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getQuality();
            }

            if (this.hasScore()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashLong(this.getScore());
            }

            if (this.getAttrCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getAttrList().hashCode();
            }

            if (this.hasGroupSkillId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getGroupSkillId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static SoulData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (SoulData)PARSER.parseFrom(data);
      }

      public static SoulData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SoulData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SoulData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (SoulData)PARSER.parseFrom(data);
      }

      public static SoulData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SoulData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SoulData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (SoulData)PARSER.parseFrom(data);
      }

      public static SoulData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SoulData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SoulData parseFrom(InputStream input) throws IOException {
         return (SoulData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SoulData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SoulData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static SoulData parseDelimitedFrom(InputStream input) throws IOException {
         return (SoulData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static SoulData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SoulData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static SoulData parseFrom(CodedInputStream input) throws IOException {
         return (SoulData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SoulData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SoulData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(SoulData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static SoulData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<SoulData> parser() {
         return PARSER;
      }

      public Parser<SoulData> getParserForType() {
         return PARSER;
      }

      public SoulData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SoulDataOrBuilder {
         private int bitField0_;
         private int code_;
         private int position_;
         private int soulLv_;
         private int quality_;
         private long score_;
         private List<HeroTypeAttr> attr_;
         private RepeatedFieldBuilderV3<HeroTypeAttr, HeroTypeAttr.Builder, HeroTypeAttrOrBuilder> attrBuilder_;
         private int groupSkillId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_SoulData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_SoulData_fieldAccessorTable.ensureFieldAccessorsInitialized(SoulData.class, Builder.class);
         }

         private Builder() {
            this.attr_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.attr_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.SoulData.alwaysUseFieldBuilders) {
               this.getAttrFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 0;
            this.bitField0_ &= -3;
            this.soulLv_ = 0;
            this.bitField0_ &= -5;
            this.quality_ = 0;
            this.bitField0_ &= -9;
            this.score_ = 0L;
            this.bitField0_ &= -17;
            if (this.attrBuilder_ == null) {
               this.attr_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.attrBuilder_.clear();
            }

            this.groupSkillId_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_SoulData_descriptor;
         }

         public SoulData getDefaultInstanceForType() {
            return DragonVeinMsg.SoulData.getDefaultInstance();
         }

         public SoulData build() {
            SoulData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public SoulData buildPartial() {
            SoulData result = new SoulData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.position_ = this.position_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.soulLv_ = this.soulLv_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.quality_ = this.quality_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.score_ = this.score_;
               to_bitField0_ |= 16;
            }

            if (this.attrBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.attr_ = Collections.unmodifiableList(this.attr_);
                  this.bitField0_ &= -33;
               }

               result.attr_ = this.attr_;
            } else {
               result.attr_ = this.attrBuilder_.build();
            }

            if ((from_bitField0_ & 64) != 0) {
               result.groupSkillId_ = this.groupSkillId_;
               to_bitField0_ |= 32;
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
            if (other instanceof SoulData) {
               return this.mergeFrom((SoulData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(SoulData other) {
            if (other == DragonVeinMsg.SoulData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasSoulLv()) {
                  this.setSoulLv(other.getSoulLv());
               }

               if (other.hasQuality()) {
                  this.setQuality(other.getQuality());
               }

               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               if (this.attrBuilder_ == null) {
                  if (!other.attr_.isEmpty()) {
                     if (this.attr_.isEmpty()) {
                        this.attr_ = other.attr_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensureAttrIsMutable();
                        this.attr_.addAll(other.attr_);
                     }

                     this.onChanged();
                  }
               } else if (!other.attr_.isEmpty()) {
                  if (this.attrBuilder_.isEmpty()) {
                     this.attrBuilder_.dispose();
                     this.attrBuilder_ = null;
                     this.attr_ = other.attr_;
                     this.bitField0_ &= -33;
                     this.attrBuilder_ = DragonVeinMsg.SoulData.alwaysUseFieldBuilders ? this.getAttrFieldBuilder() : null;
                  } else {
                     this.attrBuilder_.addAllMessages(other.attr_);
                  }
               }

               if (other.hasGroupSkillId()) {
                  this.setGroupSkillId(other.getGroupSkillId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else if (!this.hasSoulLv()) {
               return false;
            } else if (!this.hasQuality()) {
               return false;
            } else if (!this.hasScore()) {
               return false;
            } else {
               for(int i = 0; i < this.getAttrCount(); ++i) {
                  if (!this.getAttr(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            SoulData parsedMessage = null;

            try {
               parsedMessage = (SoulData)DragonVeinMsg.SoulData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (SoulData)e.getUnfinishedMessage();
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

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPosition() {
            return this.position_;
         }

         public Builder setPosition(int value) {
            this.bitField0_ |= 2;
            this.position_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSoulLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSoulLv() {
            return this.soulLv_;
         }

         public Builder setSoulLv(int value) {
            this.bitField0_ |= 4;
            this.soulLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSoulLv() {
            this.bitField0_ &= -5;
            this.soulLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasQuality() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getQuality() {
            return this.quality_;
         }

         public Builder setQuality(int value) {
            this.bitField0_ |= 8;
            this.quality_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearQuality() {
            this.bitField0_ &= -9;
            this.quality_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasScore() {
            return (this.bitField0_ & 16) != 0;
         }

         public long getScore() {
            return this.score_;
         }

         public Builder setScore(long value) {
            this.bitField0_ |= 16;
            this.score_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScore() {
            this.bitField0_ &= -17;
            this.score_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureAttrIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.attr_ = new ArrayList(this.attr_);
               this.bitField0_ |= 32;
            }

         }

         public List<HeroTypeAttr> getAttrList() {
            return this.attrBuilder_ == null ? Collections.unmodifiableList(this.attr_) : this.attrBuilder_.getMessageList();
         }

         public int getAttrCount() {
            return this.attrBuilder_ == null ? this.attr_.size() : this.attrBuilder_.getCount();
         }

         public HeroTypeAttr getAttr(int index) {
            return this.attrBuilder_ == null ? (HeroTypeAttr)this.attr_.get(index) : (HeroTypeAttr)this.attrBuilder_.getMessage(index);
         }

         public Builder setAttr(int index, HeroTypeAttr value) {
            if (this.attrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAttrIsMutable();
               this.attr_.set(index, value);
               this.onChanged();
            } else {
               this.attrBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAttr(int index, HeroTypeAttr.Builder builderForValue) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.attrBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAttr(HeroTypeAttr value) {
            if (this.attrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAttrIsMutable();
               this.attr_.add(value);
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAttr(int index, HeroTypeAttr value) {
            if (this.attrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAttrIsMutable();
               this.attr_.add(index, value);
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAttr(HeroTypeAttr.Builder builderForValue) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAttr(int index, HeroTypeAttr.Builder builderForValue) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAttr(Iterable<? extends HeroTypeAttr> values) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.attr_);
               this.onChanged();
            } else {
               this.attrBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAttr() {
            if (this.attrBuilder_ == null) {
               this.attr_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.attrBuilder_.clear();
            }

            return this;
         }

         public Builder removeAttr(int index) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.remove(index);
               this.onChanged();
            } else {
               this.attrBuilder_.remove(index);
            }

            return this;
         }

         public HeroTypeAttr.Builder getAttrBuilder(int index) {
            return (HeroTypeAttr.Builder)this.getAttrFieldBuilder().getBuilder(index);
         }

         public HeroTypeAttrOrBuilder getAttrOrBuilder(int index) {
            return this.attrBuilder_ == null ? (HeroTypeAttrOrBuilder)this.attr_.get(index) : (HeroTypeAttrOrBuilder)this.attrBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroTypeAttrOrBuilder> getAttrOrBuilderList() {
            return this.attrBuilder_ != null ? this.attrBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.attr_);
         }

         public HeroTypeAttr.Builder addAttrBuilder() {
            return (HeroTypeAttr.Builder)this.getAttrFieldBuilder().addBuilder(DragonVeinMsg.HeroTypeAttr.getDefaultInstance());
         }

         public HeroTypeAttr.Builder addAttrBuilder(int index) {
            return (HeroTypeAttr.Builder)this.getAttrFieldBuilder().addBuilder(index, DragonVeinMsg.HeroTypeAttr.getDefaultInstance());
         }

         public List<HeroTypeAttr.Builder> getAttrBuilderList() {
            return this.getAttrFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroTypeAttr, HeroTypeAttr.Builder, HeroTypeAttrOrBuilder> getAttrFieldBuilder() {
            if (this.attrBuilder_ == null) {
               this.attrBuilder_ = new RepeatedFieldBuilderV3(this.attr_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.attr_ = null;
            }

            return this.attrBuilder_;
         }

         public boolean hasGroupSkillId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getGroupSkillId() {
            return this.groupSkillId_;
         }

         public Builder setGroupSkillId(int value) {
            this.bitField0_ |= 64;
            this.groupSkillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGroupSkillId() {
            this.bitField0_ &= -65;
            this.groupSkillId_ = 0;
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

   public static final class HeroTypeAttr extends GeneratedMessageV3 implements HeroTypeAttrOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROTYPE_FIELD_NUMBER = 1;
      private int heroType_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      public static final int WAY_FIELD_NUMBER = 3;
      private int way_;
      public static final int VAL_FIELD_NUMBER = 4;
      private int val_;
      private byte memoizedIsInitialized;
      private static final HeroTypeAttr DEFAULT_INSTANCE = new HeroTypeAttr();
      /** @deprecated */
      @Deprecated
      public static final Parser<HeroTypeAttr> PARSER = new AbstractParser<HeroTypeAttr>() {
         public HeroTypeAttr parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HeroTypeAttr(input, extensionRegistry);
         }
      };

      private HeroTypeAttr(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HeroTypeAttr() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HeroTypeAttr();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HeroTypeAttr(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.type_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.way_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.val_ = input.readInt32();
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
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_HeroTypeAttr_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_HeroTypeAttr_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroTypeAttr.class, Builder.class);
      }

      public boolean hasHeroType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroType() {
         return this.heroType_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasWay() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getWay() {
         return this.way_;
      }

      public boolean hasVal() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getVal() {
         return this.val_;
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
         } else if (!this.hasWay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasVal()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.type_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.way_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.val_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.type_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.way_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.val_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HeroTypeAttr)) {
            return super.equals(obj);
         } else {
            HeroTypeAttr other = (HeroTypeAttr)obj;
            if (this.hasHeroType() != other.hasHeroType()) {
               return false;
            } else if (this.hasHeroType() && this.getHeroType() != other.getHeroType()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasWay() != other.hasWay()) {
               return false;
            } else if (this.hasWay() && this.getWay() != other.getWay()) {
               return false;
            } else if (this.hasVal() != other.hasVal()) {
               return false;
            } else if (this.hasVal() && this.getVal() != other.getVal()) {
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
            if (this.hasHeroType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroType();
            }

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getType();
            }

            if (this.hasWay()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getWay();
            }

            if (this.hasVal()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getVal();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HeroTypeAttr parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HeroTypeAttr)PARSER.parseFrom(data);
      }

      public static HeroTypeAttr parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroTypeAttr)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroTypeAttr parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HeroTypeAttr)PARSER.parseFrom(data);
      }

      public static HeroTypeAttr parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroTypeAttr)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroTypeAttr parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HeroTypeAttr)PARSER.parseFrom(data);
      }

      public static HeroTypeAttr parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroTypeAttr)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroTypeAttr parseFrom(InputStream input) throws IOException {
         return (HeroTypeAttr)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroTypeAttr parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroTypeAttr)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroTypeAttr parseDelimitedFrom(InputStream input) throws IOException {
         return (HeroTypeAttr)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HeroTypeAttr parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroTypeAttr)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroTypeAttr parseFrom(CodedInputStream input) throws IOException {
         return (HeroTypeAttr)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroTypeAttr parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroTypeAttr)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HeroTypeAttr prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HeroTypeAttr getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HeroTypeAttr> parser() {
         return PARSER;
      }

      public Parser<HeroTypeAttr> getParserForType() {
         return PARSER;
      }

      public HeroTypeAttr getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeroTypeAttrOrBuilder {
         private int bitField0_;
         private int heroType_;
         private int type_;
         private int way_;
         private int val_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_HeroTypeAttr_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_HeroTypeAttr_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroTypeAttr.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.HeroTypeAttr.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroType_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            this.way_ = 0;
            this.bitField0_ &= -5;
            this.val_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_HeroTypeAttr_descriptor;
         }

         public HeroTypeAttr getDefaultInstanceForType() {
            return DragonVeinMsg.HeroTypeAttr.getDefaultInstance();
         }

         public HeroTypeAttr build() {
            HeroTypeAttr result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HeroTypeAttr buildPartial() {
            HeroTypeAttr result = new HeroTypeAttr(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroType_ = this.heroType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.way_ = this.way_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.val_ = this.val_;
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
            if (other instanceof HeroTypeAttr) {
               return this.mergeFrom((HeroTypeAttr)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HeroTypeAttr other) {
            if (other == DragonVeinMsg.HeroTypeAttr.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroType()) {
                  this.setHeroType(other.getHeroType());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasWay()) {
                  this.setWay(other.getWay());
               }

               if (other.hasVal()) {
                  this.setVal(other.getVal());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasWay()) {
               return false;
            } else {
               return this.hasVal();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            HeroTypeAttr parsedMessage = null;

            try {
               parsedMessage = (HeroTypeAttr)DragonVeinMsg.HeroTypeAttr.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HeroTypeAttr)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroType() {
            return this.heroType_;
         }

         public Builder setHeroType(int value) {
            this.bitField0_ |= 1;
            this.heroType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroType() {
            this.bitField0_ &= -2;
            this.heroType_ = 0;
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

         public boolean hasWay() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getWay() {
            return this.way_;
         }

         public Builder setWay(int value) {
            this.bitField0_ |= 4;
            this.way_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWay() {
            this.bitField0_ &= -5;
            this.way_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasVal() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getVal() {
            return this.val_;
         }

         public Builder setVal(int value) {
            this.bitField0_ |= 8;
            this.val_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVal() {
            this.bitField0_ &= -9;
            this.val_ = 0;
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

   public static final class C2S_DragonVeinInfo_29101 extends GeneratedMessageV3 implements C2S_DragonVeinInfo_29101OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DragonVeinInfo_29101 DEFAULT_INSTANCE = new C2S_DragonVeinInfo_29101();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DragonVeinInfo_29101> PARSER = new AbstractParser<C2S_DragonVeinInfo_29101>() {
         public C2S_DragonVeinInfo_29101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DragonVeinInfo_29101(input, extensionRegistry);
         }
      };

      private C2S_DragonVeinInfo_29101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DragonVeinInfo_29101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DragonVeinInfo_29101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DragonVeinInfo_29101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonVeinInfo_29101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonVeinInfo_29101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DragonVeinInfo_29101.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DragonVeinInfo_29101)) {
            return super.equals(obj);
         } else {
            C2S_DragonVeinInfo_29101 other = (C2S_DragonVeinInfo_29101)obj;
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

      public static C2S_DragonVeinInfo_29101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DragonVeinInfo_29101)PARSER.parseFrom(data);
      }

      public static C2S_DragonVeinInfo_29101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonVeinInfo_29101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonVeinInfo_29101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DragonVeinInfo_29101)PARSER.parseFrom(data);
      }

      public static C2S_DragonVeinInfo_29101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonVeinInfo_29101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonVeinInfo_29101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DragonVeinInfo_29101)PARSER.parseFrom(data);
      }

      public static C2S_DragonVeinInfo_29101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonVeinInfo_29101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonVeinInfo_29101 parseFrom(InputStream input) throws IOException {
         return (C2S_DragonVeinInfo_29101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DragonVeinInfo_29101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonVeinInfo_29101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DragonVeinInfo_29101 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DragonVeinInfo_29101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DragonVeinInfo_29101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonVeinInfo_29101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DragonVeinInfo_29101 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DragonVeinInfo_29101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DragonVeinInfo_29101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonVeinInfo_29101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DragonVeinInfo_29101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DragonVeinInfo_29101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DragonVeinInfo_29101> parser() {
         return PARSER;
      }

      public Parser<C2S_DragonVeinInfo_29101> getParserForType() {
         return PARSER;
      }

      public C2S_DragonVeinInfo_29101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DragonVeinInfo_29101OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonVeinInfo_29101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonVeinInfo_29101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DragonVeinInfo_29101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.C2S_DragonVeinInfo_29101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonVeinInfo_29101_descriptor;
         }

         public C2S_DragonVeinInfo_29101 getDefaultInstanceForType() {
            return DragonVeinMsg.C2S_DragonVeinInfo_29101.getDefaultInstance();
         }

         public C2S_DragonVeinInfo_29101 build() {
            C2S_DragonVeinInfo_29101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DragonVeinInfo_29101 buildPartial() {
            C2S_DragonVeinInfo_29101 result = new C2S_DragonVeinInfo_29101(this);
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
            if (other instanceof C2S_DragonVeinInfo_29101) {
               return this.mergeFrom((C2S_DragonVeinInfo_29101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DragonVeinInfo_29101 other) {
            if (other == DragonVeinMsg.C2S_DragonVeinInfo_29101.getDefaultInstance()) {
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
            C2S_DragonVeinInfo_29101 parsedMessage = null;

            try {
               parsedMessage = (C2S_DragonVeinInfo_29101)DragonVeinMsg.C2S_DragonVeinInfo_29101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DragonVeinInfo_29101)e.getUnfinishedMessage();
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

   public static final class S2C_DragonVeinInfo_29102 extends GeneratedMessageV3 implements S2C_DragonVeinInfo_29102OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRESENTSOULDATA_FIELD_NUMBER = 1;
      private List<SoulData> presentSoulData_;
      public static final int SURPLUSSOULDATA_FIELD_NUMBER = 2;
      private List<SoulData> surplusSoulData_;
      public static final int DRAGONVEINLV_FIELD_NUMBER = 3;
      private int dragonVeinLv_;
      public static final int DRAGONVEINEXP_FIELD_NUMBER = 4;
      private int dragonVeinExp_;
      public static final int DRAGONSOULVAL_FIELD_NUMBER = 5;
      private int dragonSoulVal_;
      private byte memoizedIsInitialized;
      private static final S2C_DragonVeinInfo_29102 DEFAULT_INSTANCE = new S2C_DragonVeinInfo_29102();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DragonVeinInfo_29102> PARSER = new AbstractParser<S2C_DragonVeinInfo_29102>() {
         public S2C_DragonVeinInfo_29102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DragonVeinInfo_29102(input, extensionRegistry);
         }
      };

      private S2C_DragonVeinInfo_29102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DragonVeinInfo_29102() {
         this.memoizedIsInitialized = -1;
         this.presentSoulData_ = Collections.emptyList();
         this.surplusSoulData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DragonVeinInfo_29102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DragonVeinInfo_29102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.presentSoulData_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.presentSoulData_.add(input.readMessage(DragonVeinMsg.SoulData.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.surplusSoulData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.surplusSoulData_.add(input.readMessage(DragonVeinMsg.SoulData.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 1;
                        this.dragonVeinLv_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 2;
                        this.dragonVeinExp_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.dragonSoulVal_ = input.readInt32();
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
                  this.presentSoulData_ = Collections.unmodifiableList(this.presentSoulData_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.surplusSoulData_ = Collections.unmodifiableList(this.surplusSoulData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonVeinInfo_29102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonVeinInfo_29102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonVeinInfo_29102.class, Builder.class);
      }

      public List<SoulData> getPresentSoulDataList() {
         return this.presentSoulData_;
      }

      public List<? extends SoulDataOrBuilder> getPresentSoulDataOrBuilderList() {
         return this.presentSoulData_;
      }

      public int getPresentSoulDataCount() {
         return this.presentSoulData_.size();
      }

      public SoulData getPresentSoulData(int index) {
         return (SoulData)this.presentSoulData_.get(index);
      }

      public SoulDataOrBuilder getPresentSoulDataOrBuilder(int index) {
         return (SoulDataOrBuilder)this.presentSoulData_.get(index);
      }

      public List<SoulData> getSurplusSoulDataList() {
         return this.surplusSoulData_;
      }

      public List<? extends SoulDataOrBuilder> getSurplusSoulDataOrBuilderList() {
         return this.surplusSoulData_;
      }

      public int getSurplusSoulDataCount() {
         return this.surplusSoulData_.size();
      }

      public SoulData getSurplusSoulData(int index) {
         return (SoulData)this.surplusSoulData_.get(index);
      }

      public SoulDataOrBuilder getSurplusSoulDataOrBuilder(int index) {
         return (SoulDataOrBuilder)this.surplusSoulData_.get(index);
      }

      public boolean hasDragonVeinLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDragonVeinLv() {
         return this.dragonVeinLv_;
      }

      public boolean hasDragonVeinExp() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDragonVeinExp() {
         return this.dragonVeinExp_;
      }

      public boolean hasDragonSoulVal() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDragonSoulVal() {
         return this.dragonSoulVal_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDragonVeinLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDragonVeinExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDragonSoulVal()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPresentSoulDataCount(); ++i) {
               if (!this.getPresentSoulData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getSurplusSoulDataCount(); ++i) {
               if (!this.getSurplusSoulData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.presentSoulData_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.presentSoulData_.get(i));
         }

         for(int i = 0; i < this.surplusSoulData_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.surplusSoulData_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(3, this.dragonVeinLv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.dragonVeinExp_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.dragonSoulVal_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.presentSoulData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.presentSoulData_.get(i));
            }

            for(int i = 0; i < this.surplusSoulData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.surplusSoulData_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.dragonVeinLv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.dragonVeinExp_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.dragonSoulVal_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DragonVeinInfo_29102)) {
            return super.equals(obj);
         } else {
            S2C_DragonVeinInfo_29102 other = (S2C_DragonVeinInfo_29102)obj;
            if (!this.getPresentSoulDataList().equals(other.getPresentSoulDataList())) {
               return false;
            } else if (!this.getSurplusSoulDataList().equals(other.getSurplusSoulDataList())) {
               return false;
            } else if (this.hasDragonVeinLv() != other.hasDragonVeinLv()) {
               return false;
            } else if (this.hasDragonVeinLv() && this.getDragonVeinLv() != other.getDragonVeinLv()) {
               return false;
            } else if (this.hasDragonVeinExp() != other.hasDragonVeinExp()) {
               return false;
            } else if (this.hasDragonVeinExp() && this.getDragonVeinExp() != other.getDragonVeinExp()) {
               return false;
            } else if (this.hasDragonSoulVal() != other.hasDragonSoulVal()) {
               return false;
            } else if (this.hasDragonSoulVal() && this.getDragonSoulVal() != other.getDragonSoulVal()) {
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
            if (this.getPresentSoulDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPresentSoulDataList().hashCode();
            }

            if (this.getSurplusSoulDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSurplusSoulDataList().hashCode();
            }

            if (this.hasDragonVeinLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDragonVeinLv();
            }

            if (this.hasDragonVeinExp()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDragonVeinExp();
            }

            if (this.hasDragonSoulVal()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDragonSoulVal();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DragonVeinInfo_29102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DragonVeinInfo_29102)PARSER.parseFrom(data);
      }

      public static S2C_DragonVeinInfo_29102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonVeinInfo_29102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonVeinInfo_29102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DragonVeinInfo_29102)PARSER.parseFrom(data);
      }

      public static S2C_DragonVeinInfo_29102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonVeinInfo_29102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonVeinInfo_29102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DragonVeinInfo_29102)PARSER.parseFrom(data);
      }

      public static S2C_DragonVeinInfo_29102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonVeinInfo_29102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonVeinInfo_29102 parseFrom(InputStream input) throws IOException {
         return (S2C_DragonVeinInfo_29102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonVeinInfo_29102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonVeinInfo_29102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonVeinInfo_29102 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DragonVeinInfo_29102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DragonVeinInfo_29102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonVeinInfo_29102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonVeinInfo_29102 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DragonVeinInfo_29102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonVeinInfo_29102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonVeinInfo_29102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DragonVeinInfo_29102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DragonVeinInfo_29102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DragonVeinInfo_29102> parser() {
         return PARSER;
      }

      public Parser<S2C_DragonVeinInfo_29102> getParserForType() {
         return PARSER;
      }

      public S2C_DragonVeinInfo_29102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DragonVeinInfo_29102OrBuilder {
         private int bitField0_;
         private List<SoulData> presentSoulData_;
         private RepeatedFieldBuilderV3<SoulData, SoulData.Builder, SoulDataOrBuilder> presentSoulDataBuilder_;
         private List<SoulData> surplusSoulData_;
         private RepeatedFieldBuilderV3<SoulData, SoulData.Builder, SoulDataOrBuilder> surplusSoulDataBuilder_;
         private int dragonVeinLv_;
         private int dragonVeinExp_;
         private int dragonSoulVal_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonVeinInfo_29102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonVeinInfo_29102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonVeinInfo_29102.class, Builder.class);
         }

         private Builder() {
            this.presentSoulData_ = Collections.emptyList();
            this.surplusSoulData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.presentSoulData_ = Collections.emptyList();
            this.surplusSoulData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.S2C_DragonVeinInfo_29102.alwaysUseFieldBuilders) {
               this.getPresentSoulDataFieldBuilder();
               this.getSurplusSoulDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.presentSoulDataBuilder_ == null) {
               this.presentSoulData_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.presentSoulDataBuilder_.clear();
            }

            if (this.surplusSoulDataBuilder_ == null) {
               this.surplusSoulData_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.surplusSoulDataBuilder_.clear();
            }

            this.dragonVeinLv_ = 0;
            this.bitField0_ &= -5;
            this.dragonVeinExp_ = 0;
            this.bitField0_ &= -9;
            this.dragonSoulVal_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonVeinInfo_29102_descriptor;
         }

         public S2C_DragonVeinInfo_29102 getDefaultInstanceForType() {
            return DragonVeinMsg.S2C_DragonVeinInfo_29102.getDefaultInstance();
         }

         public S2C_DragonVeinInfo_29102 build() {
            S2C_DragonVeinInfo_29102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DragonVeinInfo_29102 buildPartial() {
            S2C_DragonVeinInfo_29102 result = new S2C_DragonVeinInfo_29102(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.presentSoulDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.presentSoulData_ = Collections.unmodifiableList(this.presentSoulData_);
                  this.bitField0_ &= -2;
               }

               result.presentSoulData_ = this.presentSoulData_;
            } else {
               result.presentSoulData_ = this.presentSoulDataBuilder_.build();
            }

            if (this.surplusSoulDataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.surplusSoulData_ = Collections.unmodifiableList(this.surplusSoulData_);
                  this.bitField0_ &= -3;
               }

               result.surplusSoulData_ = this.surplusSoulData_;
            } else {
               result.surplusSoulData_ = this.surplusSoulDataBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.dragonVeinLv_ = this.dragonVeinLv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.dragonVeinExp_ = this.dragonVeinExp_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.dragonSoulVal_ = this.dragonSoulVal_;
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
            if (other instanceof S2C_DragonVeinInfo_29102) {
               return this.mergeFrom((S2C_DragonVeinInfo_29102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DragonVeinInfo_29102 other) {
            if (other == DragonVeinMsg.S2C_DragonVeinInfo_29102.getDefaultInstance()) {
               return this;
            } else {
               if (this.presentSoulDataBuilder_ == null) {
                  if (!other.presentSoulData_.isEmpty()) {
                     if (this.presentSoulData_.isEmpty()) {
                        this.presentSoulData_ = other.presentSoulData_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensurePresentSoulDataIsMutable();
                        this.presentSoulData_.addAll(other.presentSoulData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.presentSoulData_.isEmpty()) {
                  if (this.presentSoulDataBuilder_.isEmpty()) {
                     this.presentSoulDataBuilder_.dispose();
                     this.presentSoulDataBuilder_ = null;
                     this.presentSoulData_ = other.presentSoulData_;
                     this.bitField0_ &= -2;
                     this.presentSoulDataBuilder_ = DragonVeinMsg.S2C_DragonVeinInfo_29102.alwaysUseFieldBuilders ? this.getPresentSoulDataFieldBuilder() : null;
                  } else {
                     this.presentSoulDataBuilder_.addAllMessages(other.presentSoulData_);
                  }
               }

               if (this.surplusSoulDataBuilder_ == null) {
                  if (!other.surplusSoulData_.isEmpty()) {
                     if (this.surplusSoulData_.isEmpty()) {
                        this.surplusSoulData_ = other.surplusSoulData_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureSurplusSoulDataIsMutable();
                        this.surplusSoulData_.addAll(other.surplusSoulData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.surplusSoulData_.isEmpty()) {
                  if (this.surplusSoulDataBuilder_.isEmpty()) {
                     this.surplusSoulDataBuilder_.dispose();
                     this.surplusSoulDataBuilder_ = null;
                     this.surplusSoulData_ = other.surplusSoulData_;
                     this.bitField0_ &= -3;
                     this.surplusSoulDataBuilder_ = DragonVeinMsg.S2C_DragonVeinInfo_29102.alwaysUseFieldBuilders ? this.getSurplusSoulDataFieldBuilder() : null;
                  } else {
                     this.surplusSoulDataBuilder_.addAllMessages(other.surplusSoulData_);
                  }
               }

               if (other.hasDragonVeinLv()) {
                  this.setDragonVeinLv(other.getDragonVeinLv());
               }

               if (other.hasDragonVeinExp()) {
                  this.setDragonVeinExp(other.getDragonVeinExp());
               }

               if (other.hasDragonSoulVal()) {
                  this.setDragonSoulVal(other.getDragonSoulVal());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDragonVeinLv()) {
               return false;
            } else if (!this.hasDragonVeinExp()) {
               return false;
            } else if (!this.hasDragonSoulVal()) {
               return false;
            } else {
               for(int i = 0; i < this.getPresentSoulDataCount(); ++i) {
                  if (!this.getPresentSoulData(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getSurplusSoulDataCount(); ++i) {
                  if (!this.getSurplusSoulData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DragonVeinInfo_29102 parsedMessage = null;

            try {
               parsedMessage = (S2C_DragonVeinInfo_29102)DragonVeinMsg.S2C_DragonVeinInfo_29102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DragonVeinInfo_29102)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePresentSoulDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.presentSoulData_ = new ArrayList(this.presentSoulData_);
               this.bitField0_ |= 1;
            }

         }

         public List<SoulData> getPresentSoulDataList() {
            return this.presentSoulDataBuilder_ == null ? Collections.unmodifiableList(this.presentSoulData_) : this.presentSoulDataBuilder_.getMessageList();
         }

         public int getPresentSoulDataCount() {
            return this.presentSoulDataBuilder_ == null ? this.presentSoulData_.size() : this.presentSoulDataBuilder_.getCount();
         }

         public SoulData getPresentSoulData(int index) {
            return this.presentSoulDataBuilder_ == null ? (SoulData)this.presentSoulData_.get(index) : (SoulData)this.presentSoulDataBuilder_.getMessage(index);
         }

         public Builder setPresentSoulData(int index, SoulData value) {
            if (this.presentSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.set(index, value);
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPresentSoulData(int index, SoulData.Builder builderForValue) {
            if (this.presentSoulDataBuilder_ == null) {
               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPresentSoulData(SoulData value) {
            if (this.presentSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.add(value);
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPresentSoulData(int index, SoulData value) {
            if (this.presentSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.add(index, value);
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPresentSoulData(SoulData.Builder builderForValue) {
            if (this.presentSoulDataBuilder_ == null) {
               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPresentSoulData(int index, SoulData.Builder builderForValue) {
            if (this.presentSoulDataBuilder_ == null) {
               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPresentSoulData(Iterable<? extends SoulData> values) {
            if (this.presentSoulDataBuilder_ == null) {
               this.ensurePresentSoulDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.presentSoulData_);
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPresentSoulData() {
            if (this.presentSoulDataBuilder_ == null) {
               this.presentSoulData_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.clear();
            }

            return this;
         }

         public Builder removePresentSoulData(int index) {
            if (this.presentSoulDataBuilder_ == null) {
               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.remove(index);
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.remove(index);
            }

            return this;
         }

         public SoulData.Builder getPresentSoulDataBuilder(int index) {
            return (SoulData.Builder)this.getPresentSoulDataFieldBuilder().getBuilder(index);
         }

         public SoulDataOrBuilder getPresentSoulDataOrBuilder(int index) {
            return this.presentSoulDataBuilder_ == null ? (SoulDataOrBuilder)this.presentSoulData_.get(index) : (SoulDataOrBuilder)this.presentSoulDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SoulDataOrBuilder> getPresentSoulDataOrBuilderList() {
            return this.presentSoulDataBuilder_ != null ? this.presentSoulDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.presentSoulData_);
         }

         public SoulData.Builder addPresentSoulDataBuilder() {
            return (SoulData.Builder)this.getPresentSoulDataFieldBuilder().addBuilder(DragonVeinMsg.SoulData.getDefaultInstance());
         }

         public SoulData.Builder addPresentSoulDataBuilder(int index) {
            return (SoulData.Builder)this.getPresentSoulDataFieldBuilder().addBuilder(index, DragonVeinMsg.SoulData.getDefaultInstance());
         }

         public List<SoulData.Builder> getPresentSoulDataBuilderList() {
            return this.getPresentSoulDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SoulData, SoulData.Builder, SoulDataOrBuilder> getPresentSoulDataFieldBuilder() {
            if (this.presentSoulDataBuilder_ == null) {
               this.presentSoulDataBuilder_ = new RepeatedFieldBuilderV3(this.presentSoulData_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.presentSoulData_ = null;
            }

            return this.presentSoulDataBuilder_;
         }

         private void ensureSurplusSoulDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.surplusSoulData_ = new ArrayList(this.surplusSoulData_);
               this.bitField0_ |= 2;
            }

         }

         public List<SoulData> getSurplusSoulDataList() {
            return this.surplusSoulDataBuilder_ == null ? Collections.unmodifiableList(this.surplusSoulData_) : this.surplusSoulDataBuilder_.getMessageList();
         }

         public int getSurplusSoulDataCount() {
            return this.surplusSoulDataBuilder_ == null ? this.surplusSoulData_.size() : this.surplusSoulDataBuilder_.getCount();
         }

         public SoulData getSurplusSoulData(int index) {
            return this.surplusSoulDataBuilder_ == null ? (SoulData)this.surplusSoulData_.get(index) : (SoulData)this.surplusSoulDataBuilder_.getMessage(index);
         }

         public Builder setSurplusSoulData(int index, SoulData value) {
            if (this.surplusSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.set(index, value);
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSurplusSoulData(int index, SoulData.Builder builderForValue) {
            if (this.surplusSoulDataBuilder_ == null) {
               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSurplusSoulData(SoulData value) {
            if (this.surplusSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.add(value);
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSurplusSoulData(int index, SoulData value) {
            if (this.surplusSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.add(index, value);
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSurplusSoulData(SoulData.Builder builderForValue) {
            if (this.surplusSoulDataBuilder_ == null) {
               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSurplusSoulData(int index, SoulData.Builder builderForValue) {
            if (this.surplusSoulDataBuilder_ == null) {
               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSurplusSoulData(Iterable<? extends SoulData> values) {
            if (this.surplusSoulDataBuilder_ == null) {
               this.ensureSurplusSoulDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.surplusSoulData_);
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSurplusSoulData() {
            if (this.surplusSoulDataBuilder_ == null) {
               this.surplusSoulData_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeSurplusSoulData(int index) {
            if (this.surplusSoulDataBuilder_ == null) {
               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.remove(index);
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.remove(index);
            }

            return this;
         }

         public SoulData.Builder getSurplusSoulDataBuilder(int index) {
            return (SoulData.Builder)this.getSurplusSoulDataFieldBuilder().getBuilder(index);
         }

         public SoulDataOrBuilder getSurplusSoulDataOrBuilder(int index) {
            return this.surplusSoulDataBuilder_ == null ? (SoulDataOrBuilder)this.surplusSoulData_.get(index) : (SoulDataOrBuilder)this.surplusSoulDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SoulDataOrBuilder> getSurplusSoulDataOrBuilderList() {
            return this.surplusSoulDataBuilder_ != null ? this.surplusSoulDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.surplusSoulData_);
         }

         public SoulData.Builder addSurplusSoulDataBuilder() {
            return (SoulData.Builder)this.getSurplusSoulDataFieldBuilder().addBuilder(DragonVeinMsg.SoulData.getDefaultInstance());
         }

         public SoulData.Builder addSurplusSoulDataBuilder(int index) {
            return (SoulData.Builder)this.getSurplusSoulDataFieldBuilder().addBuilder(index, DragonVeinMsg.SoulData.getDefaultInstance());
         }

         public List<SoulData.Builder> getSurplusSoulDataBuilderList() {
            return this.getSurplusSoulDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SoulData, SoulData.Builder, SoulDataOrBuilder> getSurplusSoulDataFieldBuilder() {
            if (this.surplusSoulDataBuilder_ == null) {
               this.surplusSoulDataBuilder_ = new RepeatedFieldBuilderV3(this.surplusSoulData_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.surplusSoulData_ = null;
            }

            return this.surplusSoulDataBuilder_;
         }

         public boolean hasDragonVeinLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getDragonVeinLv() {
            return this.dragonVeinLv_;
         }

         public Builder setDragonVeinLv(int value) {
            this.bitField0_ |= 4;
            this.dragonVeinLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDragonVeinLv() {
            this.bitField0_ &= -5;
            this.dragonVeinLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDragonVeinExp() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDragonVeinExp() {
            return this.dragonVeinExp_;
         }

         public Builder setDragonVeinExp(int value) {
            this.bitField0_ |= 8;
            this.dragonVeinExp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDragonVeinExp() {
            this.bitField0_ &= -9;
            this.dragonVeinExp_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDragonSoulVal() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDragonSoulVal() {
            return this.dragonSoulVal_;
         }

         public Builder setDragonSoulVal(int value) {
            this.bitField0_ |= 16;
            this.dragonSoulVal_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDragonSoulVal() {
            this.bitField0_ &= -17;
            this.dragonSoulVal_ = 0;
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

   public static final class C2S_Lottery_29103 extends GeneratedMessageV3 implements C2S_Lottery_29103OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Lottery_29103 DEFAULT_INSTANCE = new C2S_Lottery_29103();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Lottery_29103> PARSER = new AbstractParser<C2S_Lottery_29103>() {
         public C2S_Lottery_29103 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Lottery_29103(input, extensionRegistry);
         }
      };

      private C2S_Lottery_29103(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Lottery_29103() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Lottery_29103();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Lottery_29103(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_Lottery_29103_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_Lottery_29103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Lottery_29103.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Lottery_29103)) {
            return super.equals(obj);
         } else {
            C2S_Lottery_29103 other = (C2S_Lottery_29103)obj;
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

      public static C2S_Lottery_29103 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Lottery_29103)PARSER.parseFrom(data);
      }

      public static C2S_Lottery_29103 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Lottery_29103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Lottery_29103 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Lottery_29103)PARSER.parseFrom(data);
      }

      public static C2S_Lottery_29103 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Lottery_29103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Lottery_29103 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Lottery_29103)PARSER.parseFrom(data);
      }

      public static C2S_Lottery_29103 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Lottery_29103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Lottery_29103 parseFrom(InputStream input) throws IOException {
         return (C2S_Lottery_29103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Lottery_29103 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Lottery_29103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Lottery_29103 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Lottery_29103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Lottery_29103 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Lottery_29103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Lottery_29103 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Lottery_29103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Lottery_29103 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Lottery_29103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Lottery_29103 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Lottery_29103 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Lottery_29103> parser() {
         return PARSER;
      }

      public Parser<C2S_Lottery_29103> getParserForType() {
         return PARSER;
      }

      public C2S_Lottery_29103 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Lottery_29103OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_Lottery_29103_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_Lottery_29103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Lottery_29103.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.C2S_Lottery_29103.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_Lottery_29103_descriptor;
         }

         public C2S_Lottery_29103 getDefaultInstanceForType() {
            return DragonVeinMsg.C2S_Lottery_29103.getDefaultInstance();
         }

         public C2S_Lottery_29103 build() {
            C2S_Lottery_29103 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Lottery_29103 buildPartial() {
            C2S_Lottery_29103 result = new C2S_Lottery_29103(this);
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
            if (other instanceof C2S_Lottery_29103) {
               return this.mergeFrom((C2S_Lottery_29103)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Lottery_29103 other) {
            if (other == DragonVeinMsg.C2S_Lottery_29103.getDefaultInstance()) {
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
            C2S_Lottery_29103 parsedMessage = null;

            try {
               parsedMessage = (C2S_Lottery_29103)DragonVeinMsg.C2S_Lottery_29103.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Lottery_29103)e.getUnfinishedMessage();
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

   public static final class S2C_Lottery_29104 extends GeneratedMessageV3 implements S2C_Lottery_29104OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTSOUL_FIELD_NUMBER = 1;
      private SoulData gotSoul_;
      public static final int DRAGONVEINLV_FIELD_NUMBER = 2;
      private int dragonVeinLv_;
      public static final int DRAGONVEINEXP_FIELD_NUMBER = 3;
      private int dragonVeinExp_;
      public static final int RESULT_FIELD_NUMBER = 4;
      private int result_;
      public static final int TIPSCODE_FIELD_NUMBER = 5;
      private int tipsCode_;
      private byte memoizedIsInitialized;
      private static final S2C_Lottery_29104 DEFAULT_INSTANCE = new S2C_Lottery_29104();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Lottery_29104> PARSER = new AbstractParser<S2C_Lottery_29104>() {
         public S2C_Lottery_29104 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Lottery_29104(input, extensionRegistry);
         }
      };

      private S2C_Lottery_29104(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Lottery_29104() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Lottery_29104();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Lottery_29104(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        SoulData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.gotSoul_.toBuilder();
                        }

                        this.gotSoul_ = (SoulData)input.readMessage(DragonVeinMsg.SoulData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.gotSoul_);
                           this.gotSoul_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.dragonVeinLv_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.dragonVeinExp_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.result_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.tipsCode_ = input.readInt32();
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
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_Lottery_29104_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_Lottery_29104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Lottery_29104.class, Builder.class);
      }

      public boolean hasGotSoul() {
         return (this.bitField0_ & 1) != 0;
      }

      public SoulData getGotSoul() {
         return this.gotSoul_ == null ? DragonVeinMsg.SoulData.getDefaultInstance() : this.gotSoul_;
      }

      public SoulDataOrBuilder getGotSoulOrBuilder() {
         return this.gotSoul_ == null ? DragonVeinMsg.SoulData.getDefaultInstance() : this.gotSoul_;
      }

      public boolean hasDragonVeinLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDragonVeinLv() {
         return this.dragonVeinLv_;
      }

      public boolean hasDragonVeinExp() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDragonVeinExp() {
         return this.dragonVeinExp_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasTipsCode() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getTipsCode() {
         return this.tipsCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDragonVeinLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDragonVeinExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasGotSoul() && !this.getGotSoul().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getGotSoul());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.dragonVeinLv_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.dragonVeinExp_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.result_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.tipsCode_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getGotSoul());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.dragonVeinLv_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.dragonVeinExp_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.result_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.tipsCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Lottery_29104)) {
            return super.equals(obj);
         } else {
            S2C_Lottery_29104 other = (S2C_Lottery_29104)obj;
            if (this.hasGotSoul() != other.hasGotSoul()) {
               return false;
            } else if (this.hasGotSoul() && !this.getGotSoul().equals(other.getGotSoul())) {
               return false;
            } else if (this.hasDragonVeinLv() != other.hasDragonVeinLv()) {
               return false;
            } else if (this.hasDragonVeinLv() && this.getDragonVeinLv() != other.getDragonVeinLv()) {
               return false;
            } else if (this.hasDragonVeinExp() != other.hasDragonVeinExp()) {
               return false;
            } else if (this.hasDragonVeinExp() && this.getDragonVeinExp() != other.getDragonVeinExp()) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasTipsCode() != other.hasTipsCode()) {
               return false;
            } else if (this.hasTipsCode() && this.getTipsCode() != other.getTipsCode()) {
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
            if (this.hasGotSoul()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGotSoul().hashCode();
            }

            if (this.hasDragonVeinLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDragonVeinLv();
            }

            if (this.hasDragonVeinExp()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDragonVeinExp();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasTipsCode()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTipsCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Lottery_29104 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Lottery_29104)PARSER.parseFrom(data);
      }

      public static S2C_Lottery_29104 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Lottery_29104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Lottery_29104 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Lottery_29104)PARSER.parseFrom(data);
      }

      public static S2C_Lottery_29104 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Lottery_29104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Lottery_29104 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Lottery_29104)PARSER.parseFrom(data);
      }

      public static S2C_Lottery_29104 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Lottery_29104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Lottery_29104 parseFrom(InputStream input) throws IOException {
         return (S2C_Lottery_29104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Lottery_29104 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Lottery_29104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Lottery_29104 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Lottery_29104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Lottery_29104 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Lottery_29104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Lottery_29104 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Lottery_29104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Lottery_29104 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Lottery_29104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Lottery_29104 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Lottery_29104 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Lottery_29104> parser() {
         return PARSER;
      }

      public Parser<S2C_Lottery_29104> getParserForType() {
         return PARSER;
      }

      public S2C_Lottery_29104 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Lottery_29104OrBuilder {
         private int bitField0_;
         private SoulData gotSoul_;
         private SingleFieldBuilderV3<SoulData, SoulData.Builder, SoulDataOrBuilder> gotSoulBuilder_;
         private int dragonVeinLv_;
         private int dragonVeinExp_;
         private int result_;
         private int tipsCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_Lottery_29104_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_Lottery_29104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Lottery_29104.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.S2C_Lottery_29104.alwaysUseFieldBuilders) {
               this.getGotSoulFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.gotSoulBuilder_ == null) {
               this.gotSoul_ = null;
            } else {
               this.gotSoulBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.dragonVeinLv_ = 0;
            this.bitField0_ &= -3;
            this.dragonVeinExp_ = 0;
            this.bitField0_ &= -5;
            this.result_ = 0;
            this.bitField0_ &= -9;
            this.tipsCode_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_Lottery_29104_descriptor;
         }

         public S2C_Lottery_29104 getDefaultInstanceForType() {
            return DragonVeinMsg.S2C_Lottery_29104.getDefaultInstance();
         }

         public S2C_Lottery_29104 build() {
            S2C_Lottery_29104 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Lottery_29104 buildPartial() {
            S2C_Lottery_29104 result = new S2C_Lottery_29104(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.gotSoulBuilder_ == null) {
                  result.gotSoul_ = this.gotSoul_;
               } else {
                  result.gotSoul_ = (SoulData)this.gotSoulBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.dragonVeinLv_ = this.dragonVeinLv_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.dragonVeinExp_ = this.dragonVeinExp_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.tipsCode_ = this.tipsCode_;
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
            if (other instanceof S2C_Lottery_29104) {
               return this.mergeFrom((S2C_Lottery_29104)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Lottery_29104 other) {
            if (other == DragonVeinMsg.S2C_Lottery_29104.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGotSoul()) {
                  this.mergeGotSoul(other.getGotSoul());
               }

               if (other.hasDragonVeinLv()) {
                  this.setDragonVeinLv(other.getDragonVeinLv());
               }

               if (other.hasDragonVeinExp()) {
                  this.setDragonVeinExp(other.getDragonVeinExp());
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasTipsCode()) {
                  this.setTipsCode(other.getTipsCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDragonVeinLv()) {
               return false;
            } else if (!this.hasDragonVeinExp()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else {
               return !this.hasGotSoul() || this.getGotSoul().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Lottery_29104 parsedMessage = null;

            try {
               parsedMessage = (S2C_Lottery_29104)DragonVeinMsg.S2C_Lottery_29104.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Lottery_29104)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGotSoul() {
            return (this.bitField0_ & 1) != 0;
         }

         public SoulData getGotSoul() {
            if (this.gotSoulBuilder_ == null) {
               return this.gotSoul_ == null ? DragonVeinMsg.SoulData.getDefaultInstance() : this.gotSoul_;
            } else {
               return (SoulData)this.gotSoulBuilder_.getMessage();
            }
         }

         public Builder setGotSoul(SoulData value) {
            if (this.gotSoulBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.gotSoul_ = value;
               this.onChanged();
            } else {
               this.gotSoulBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setGotSoul(SoulData.Builder builderForValue) {
            if (this.gotSoulBuilder_ == null) {
               this.gotSoul_ = builderForValue.build();
               this.onChanged();
            } else {
               this.gotSoulBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeGotSoul(SoulData value) {
            if (this.gotSoulBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.gotSoul_ != null && this.gotSoul_ != DragonVeinMsg.SoulData.getDefaultInstance()) {
                  this.gotSoul_ = DragonVeinMsg.SoulData.newBuilder(this.gotSoul_).mergeFrom(value).buildPartial();
               } else {
                  this.gotSoul_ = value;
               }

               this.onChanged();
            } else {
               this.gotSoulBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearGotSoul() {
            if (this.gotSoulBuilder_ == null) {
               this.gotSoul_ = null;
               this.onChanged();
            } else {
               this.gotSoulBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public SoulData.Builder getGotSoulBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (SoulData.Builder)this.getGotSoulFieldBuilder().getBuilder();
         }

         public SoulDataOrBuilder getGotSoulOrBuilder() {
            if (this.gotSoulBuilder_ != null) {
               return (SoulDataOrBuilder)this.gotSoulBuilder_.getMessageOrBuilder();
            } else {
               return this.gotSoul_ == null ? DragonVeinMsg.SoulData.getDefaultInstance() : this.gotSoul_;
            }
         }

         private SingleFieldBuilderV3<SoulData, SoulData.Builder, SoulDataOrBuilder> getGotSoulFieldBuilder() {
            if (this.gotSoulBuilder_ == null) {
               this.gotSoulBuilder_ = new SingleFieldBuilderV3(this.getGotSoul(), this.getParentForChildren(), this.isClean());
               this.gotSoul_ = null;
            }

            return this.gotSoulBuilder_;
         }

         public boolean hasDragonVeinLv() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDragonVeinLv() {
            return this.dragonVeinLv_;
         }

         public Builder setDragonVeinLv(int value) {
            this.bitField0_ |= 2;
            this.dragonVeinLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDragonVeinLv() {
            this.bitField0_ &= -3;
            this.dragonVeinLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDragonVeinExp() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getDragonVeinExp() {
            return this.dragonVeinExp_;
         }

         public Builder setDragonVeinExp(int value) {
            this.bitField0_ |= 4;
            this.dragonVeinExp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDragonVeinExp() {
            this.bitField0_ &= -5;
            this.dragonVeinExp_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 8;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -9;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTipsCode() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getTipsCode() {
            return this.tipsCode_;
         }

         public Builder setTipsCode(int value) {
            this.bitField0_ |= 16;
            this.tipsCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTipsCode() {
            this.bitField0_ &= -17;
            this.tipsCode_ = 0;
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

   public static final class C2S_PresentSoul_29105 extends GeneratedMessageV3 implements C2S_PresentSoul_29105OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int ISRESOLVE_FIELD_NUMBER = 2;
      private boolean isResolve_;
      private byte memoizedIsInitialized;
      private static final C2S_PresentSoul_29105 DEFAULT_INSTANCE = new C2S_PresentSoul_29105();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PresentSoul_29105> PARSER = new AbstractParser<C2S_PresentSoul_29105>() {
         public C2S_PresentSoul_29105 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PresentSoul_29105(input, extensionRegistry);
         }
      };

      private C2S_PresentSoul_29105(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PresentSoul_29105() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PresentSoul_29105();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PresentSoul_29105(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.isResolve_ = input.readBool();
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
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_PresentSoul_29105_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_PresentSoul_29105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PresentSoul_29105.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasIsResolve() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsResolve() {
         return this.isResolve_;
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
         } else if (!this.hasIsResolve()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isResolve_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isResolve_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PresentSoul_29105)) {
            return super.equals(obj);
         } else {
            C2S_PresentSoul_29105 other = (C2S_PresentSoul_29105)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasIsResolve() != other.hasIsResolve()) {
               return false;
            } else if (this.hasIsResolve() && this.getIsResolve() != other.getIsResolve()) {
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

            if (this.hasIsResolve()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsResolve());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PresentSoul_29105 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PresentSoul_29105)PARSER.parseFrom(data);
      }

      public static C2S_PresentSoul_29105 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PresentSoul_29105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PresentSoul_29105 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PresentSoul_29105)PARSER.parseFrom(data);
      }

      public static C2S_PresentSoul_29105 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PresentSoul_29105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PresentSoul_29105 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PresentSoul_29105)PARSER.parseFrom(data);
      }

      public static C2S_PresentSoul_29105 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PresentSoul_29105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PresentSoul_29105 parseFrom(InputStream input) throws IOException {
         return (C2S_PresentSoul_29105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PresentSoul_29105 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PresentSoul_29105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PresentSoul_29105 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PresentSoul_29105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PresentSoul_29105 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PresentSoul_29105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PresentSoul_29105 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PresentSoul_29105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PresentSoul_29105 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PresentSoul_29105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PresentSoul_29105 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PresentSoul_29105 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PresentSoul_29105> parser() {
         return PARSER;
      }

      public Parser<C2S_PresentSoul_29105> getParserForType() {
         return PARSER;
      }

      public C2S_PresentSoul_29105 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PresentSoul_29105OrBuilder {
         private int bitField0_;
         private int code_;
         private boolean isResolve_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_PresentSoul_29105_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_PresentSoul_29105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PresentSoul_29105.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.C2S_PresentSoul_29105.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.isResolve_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_PresentSoul_29105_descriptor;
         }

         public C2S_PresentSoul_29105 getDefaultInstanceForType() {
            return DragonVeinMsg.C2S_PresentSoul_29105.getDefaultInstance();
         }

         public C2S_PresentSoul_29105 build() {
            C2S_PresentSoul_29105 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PresentSoul_29105 buildPartial() {
            C2S_PresentSoul_29105 result = new C2S_PresentSoul_29105(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isResolve_ = this.isResolve_;
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
            if (other instanceof C2S_PresentSoul_29105) {
               return this.mergeFrom((C2S_PresentSoul_29105)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PresentSoul_29105 other) {
            if (other == DragonVeinMsg.C2S_PresentSoul_29105.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasIsResolve()) {
                  this.setIsResolve(other.getIsResolve());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasIsResolve();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PresentSoul_29105 parsedMessage = null;

            try {
               parsedMessage = (C2S_PresentSoul_29105)DragonVeinMsg.C2S_PresentSoul_29105.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PresentSoul_29105)e.getUnfinishedMessage();
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

         public boolean hasIsResolve() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsResolve() {
            return this.isResolve_;
         }

         public Builder setIsResolve(boolean value) {
            this.bitField0_ |= 2;
            this.isResolve_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsResolve() {
            this.bitField0_ &= -3;
            this.isResolve_ = false;
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

   public static final class S2C_PresentSoul_29106 extends GeneratedMessageV3 implements S2C_PresentSoul_29106OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int PRESENTSOULDATA_FIELD_NUMBER = 2;
      private List<SoulData> presentSoulData_;
      public static final int SURPLUSSOULDATA_FIELD_NUMBER = 3;
      private List<SoulData> surplusSoulData_;
      public static final int ISRESOLVE_FIELD_NUMBER = 4;
      private boolean isResolve_;
      public static final int DRAGONVEINLV_FIELD_NUMBER = 5;
      private int dragonVeinLv_;
      public static final int DRAGONVEINEXP_FIELD_NUMBER = 6;
      private int dragonVeinExp_;
      private byte memoizedIsInitialized;
      private static final S2C_PresentSoul_29106 DEFAULT_INSTANCE = new S2C_PresentSoul_29106();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PresentSoul_29106> PARSER = new AbstractParser<S2C_PresentSoul_29106>() {
         public S2C_PresentSoul_29106 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PresentSoul_29106(input, extensionRegistry);
         }
      };

      private S2C_PresentSoul_29106(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PresentSoul_29106() {
         this.memoizedIsInitialized = -1;
         this.presentSoulData_ = Collections.emptyList();
         this.surplusSoulData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PresentSoul_29106();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PresentSoul_29106(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.presentSoulData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.presentSoulData_.add(input.readMessage(DragonVeinMsg.SoulData.PARSER, extensionRegistry));
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.surplusSoulData_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.surplusSoulData_.add(input.readMessage(DragonVeinMsg.SoulData.PARSER, extensionRegistry));
                        break;
                     case 32:
                        this.bitField0_ |= 2;
                        this.isResolve_ = input.readBool();
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.dragonVeinLv_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 8;
                        this.dragonVeinExp_ = input.readInt32();
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
                  this.presentSoulData_ = Collections.unmodifiableList(this.presentSoulData_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.surplusSoulData_ = Collections.unmodifiableList(this.surplusSoulData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_PresentSoul_29106_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_PresentSoul_29106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PresentSoul_29106.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public List<SoulData> getPresentSoulDataList() {
         return this.presentSoulData_;
      }

      public List<? extends SoulDataOrBuilder> getPresentSoulDataOrBuilderList() {
         return this.presentSoulData_;
      }

      public int getPresentSoulDataCount() {
         return this.presentSoulData_.size();
      }

      public SoulData getPresentSoulData(int index) {
         return (SoulData)this.presentSoulData_.get(index);
      }

      public SoulDataOrBuilder getPresentSoulDataOrBuilder(int index) {
         return (SoulDataOrBuilder)this.presentSoulData_.get(index);
      }

      public List<SoulData> getSurplusSoulDataList() {
         return this.surplusSoulData_;
      }

      public List<? extends SoulDataOrBuilder> getSurplusSoulDataOrBuilderList() {
         return this.surplusSoulData_;
      }

      public int getSurplusSoulDataCount() {
         return this.surplusSoulData_.size();
      }

      public SoulData getSurplusSoulData(int index) {
         return (SoulData)this.surplusSoulData_.get(index);
      }

      public SoulDataOrBuilder getSurplusSoulDataOrBuilder(int index) {
         return (SoulDataOrBuilder)this.surplusSoulData_.get(index);
      }

      public boolean hasIsResolve() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsResolve() {
         return this.isResolve_;
      }

      public boolean hasDragonVeinLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDragonVeinLv() {
         return this.dragonVeinLv_;
      }

      public boolean hasDragonVeinExp() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDragonVeinExp() {
         return this.dragonVeinExp_;
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
         } else if (!this.hasIsResolve()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDragonVeinLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDragonVeinExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPresentSoulDataCount(); ++i) {
               if (!this.getPresentSoulData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getSurplusSoulDataCount(); ++i) {
               if (!this.getSurplusSoulData(i).isInitialized()) {
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
            output.writeInt32(1, this.code_);
         }

         for(int i = 0; i < this.presentSoulData_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.presentSoulData_.get(i));
         }

         for(int i = 0; i < this.surplusSoulData_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.surplusSoulData_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(4, this.isResolve_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.dragonVeinLv_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(6, this.dragonVeinExp_);
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

            for(int i = 0; i < this.presentSoulData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.presentSoulData_.get(i));
            }

            for(int i = 0; i < this.surplusSoulData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.surplusSoulData_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isResolve_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.dragonVeinLv_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.dragonVeinExp_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PresentSoul_29106)) {
            return super.equals(obj);
         } else {
            S2C_PresentSoul_29106 other = (S2C_PresentSoul_29106)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (!this.getPresentSoulDataList().equals(other.getPresentSoulDataList())) {
               return false;
            } else if (!this.getSurplusSoulDataList().equals(other.getSurplusSoulDataList())) {
               return false;
            } else if (this.hasIsResolve() != other.hasIsResolve()) {
               return false;
            } else if (this.hasIsResolve() && this.getIsResolve() != other.getIsResolve()) {
               return false;
            } else if (this.hasDragonVeinLv() != other.hasDragonVeinLv()) {
               return false;
            } else if (this.hasDragonVeinLv() && this.getDragonVeinLv() != other.getDragonVeinLv()) {
               return false;
            } else if (this.hasDragonVeinExp() != other.hasDragonVeinExp()) {
               return false;
            } else if (this.hasDragonVeinExp() && this.getDragonVeinExp() != other.getDragonVeinExp()) {
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

            if (this.getPresentSoulDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPresentSoulDataList().hashCode();
            }

            if (this.getSurplusSoulDataCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSurplusSoulDataList().hashCode();
            }

            if (this.hasIsResolve()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsResolve());
            }

            if (this.hasDragonVeinLv()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDragonVeinLv();
            }

            if (this.hasDragonVeinExp()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getDragonVeinExp();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PresentSoul_29106 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PresentSoul_29106)PARSER.parseFrom(data);
      }

      public static S2C_PresentSoul_29106 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PresentSoul_29106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PresentSoul_29106 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PresentSoul_29106)PARSER.parseFrom(data);
      }

      public static S2C_PresentSoul_29106 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PresentSoul_29106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PresentSoul_29106 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PresentSoul_29106)PARSER.parseFrom(data);
      }

      public static S2C_PresentSoul_29106 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PresentSoul_29106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PresentSoul_29106 parseFrom(InputStream input) throws IOException {
         return (S2C_PresentSoul_29106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PresentSoul_29106 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PresentSoul_29106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PresentSoul_29106 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PresentSoul_29106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PresentSoul_29106 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PresentSoul_29106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PresentSoul_29106 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PresentSoul_29106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PresentSoul_29106 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PresentSoul_29106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PresentSoul_29106 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PresentSoul_29106 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PresentSoul_29106> parser() {
         return PARSER;
      }

      public Parser<S2C_PresentSoul_29106> getParserForType() {
         return PARSER;
      }

      public S2C_PresentSoul_29106 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PresentSoul_29106OrBuilder {
         private int bitField0_;
         private int code_;
         private List<SoulData> presentSoulData_;
         private RepeatedFieldBuilderV3<SoulData, SoulData.Builder, SoulDataOrBuilder> presentSoulDataBuilder_;
         private List<SoulData> surplusSoulData_;
         private RepeatedFieldBuilderV3<SoulData, SoulData.Builder, SoulDataOrBuilder> surplusSoulDataBuilder_;
         private boolean isResolve_;
         private int dragonVeinLv_;
         private int dragonVeinExp_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_PresentSoul_29106_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_PresentSoul_29106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PresentSoul_29106.class, Builder.class);
         }

         private Builder() {
            this.presentSoulData_ = Collections.emptyList();
            this.surplusSoulData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.presentSoulData_ = Collections.emptyList();
            this.surplusSoulData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.S2C_PresentSoul_29106.alwaysUseFieldBuilders) {
               this.getPresentSoulDataFieldBuilder();
               this.getSurplusSoulDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            if (this.presentSoulDataBuilder_ == null) {
               this.presentSoulData_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.presentSoulDataBuilder_.clear();
            }

            if (this.surplusSoulDataBuilder_ == null) {
               this.surplusSoulData_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.surplusSoulDataBuilder_.clear();
            }

            this.isResolve_ = false;
            this.bitField0_ &= -9;
            this.dragonVeinLv_ = 0;
            this.bitField0_ &= -17;
            this.dragonVeinExp_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_PresentSoul_29106_descriptor;
         }

         public S2C_PresentSoul_29106 getDefaultInstanceForType() {
            return DragonVeinMsg.S2C_PresentSoul_29106.getDefaultInstance();
         }

         public S2C_PresentSoul_29106 build() {
            S2C_PresentSoul_29106 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PresentSoul_29106 buildPartial() {
            S2C_PresentSoul_29106 result = new S2C_PresentSoul_29106(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if (this.presentSoulDataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.presentSoulData_ = Collections.unmodifiableList(this.presentSoulData_);
                  this.bitField0_ &= -3;
               }

               result.presentSoulData_ = this.presentSoulData_;
            } else {
               result.presentSoulData_ = this.presentSoulDataBuilder_.build();
            }

            if (this.surplusSoulDataBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.surplusSoulData_ = Collections.unmodifiableList(this.surplusSoulData_);
                  this.bitField0_ &= -5;
               }

               result.surplusSoulData_ = this.surplusSoulData_;
            } else {
               result.surplusSoulData_ = this.surplusSoulDataBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isResolve_ = this.isResolve_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.dragonVeinLv_ = this.dragonVeinLv_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.dragonVeinExp_ = this.dragonVeinExp_;
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
            if (other instanceof S2C_PresentSoul_29106) {
               return this.mergeFrom((S2C_PresentSoul_29106)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PresentSoul_29106 other) {
            if (other == DragonVeinMsg.S2C_PresentSoul_29106.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (this.presentSoulDataBuilder_ == null) {
                  if (!other.presentSoulData_.isEmpty()) {
                     if (this.presentSoulData_.isEmpty()) {
                        this.presentSoulData_ = other.presentSoulData_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensurePresentSoulDataIsMutable();
                        this.presentSoulData_.addAll(other.presentSoulData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.presentSoulData_.isEmpty()) {
                  if (this.presentSoulDataBuilder_.isEmpty()) {
                     this.presentSoulDataBuilder_.dispose();
                     this.presentSoulDataBuilder_ = null;
                     this.presentSoulData_ = other.presentSoulData_;
                     this.bitField0_ &= -3;
                     this.presentSoulDataBuilder_ = DragonVeinMsg.S2C_PresentSoul_29106.alwaysUseFieldBuilders ? this.getPresentSoulDataFieldBuilder() : null;
                  } else {
                     this.presentSoulDataBuilder_.addAllMessages(other.presentSoulData_);
                  }
               }

               if (this.surplusSoulDataBuilder_ == null) {
                  if (!other.surplusSoulData_.isEmpty()) {
                     if (this.surplusSoulData_.isEmpty()) {
                        this.surplusSoulData_ = other.surplusSoulData_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureSurplusSoulDataIsMutable();
                        this.surplusSoulData_.addAll(other.surplusSoulData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.surplusSoulData_.isEmpty()) {
                  if (this.surplusSoulDataBuilder_.isEmpty()) {
                     this.surplusSoulDataBuilder_.dispose();
                     this.surplusSoulDataBuilder_ = null;
                     this.surplusSoulData_ = other.surplusSoulData_;
                     this.bitField0_ &= -5;
                     this.surplusSoulDataBuilder_ = DragonVeinMsg.S2C_PresentSoul_29106.alwaysUseFieldBuilders ? this.getSurplusSoulDataFieldBuilder() : null;
                  } else {
                     this.surplusSoulDataBuilder_.addAllMessages(other.surplusSoulData_);
                  }
               }

               if (other.hasIsResolve()) {
                  this.setIsResolve(other.getIsResolve());
               }

               if (other.hasDragonVeinLv()) {
                  this.setDragonVeinLv(other.getDragonVeinLv());
               }

               if (other.hasDragonVeinExp()) {
                  this.setDragonVeinExp(other.getDragonVeinExp());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasIsResolve()) {
               return false;
            } else if (!this.hasDragonVeinLv()) {
               return false;
            } else if (!this.hasDragonVeinExp()) {
               return false;
            } else {
               for(int i = 0; i < this.getPresentSoulDataCount(); ++i) {
                  if (!this.getPresentSoulData(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getSurplusSoulDataCount(); ++i) {
                  if (!this.getSurplusSoulData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PresentSoul_29106 parsedMessage = null;

            try {
               parsedMessage = (S2C_PresentSoul_29106)DragonVeinMsg.S2C_PresentSoul_29106.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PresentSoul_29106)e.getUnfinishedMessage();
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

         private void ensurePresentSoulDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.presentSoulData_ = new ArrayList(this.presentSoulData_);
               this.bitField0_ |= 2;
            }

         }

         public List<SoulData> getPresentSoulDataList() {
            return this.presentSoulDataBuilder_ == null ? Collections.unmodifiableList(this.presentSoulData_) : this.presentSoulDataBuilder_.getMessageList();
         }

         public int getPresentSoulDataCount() {
            return this.presentSoulDataBuilder_ == null ? this.presentSoulData_.size() : this.presentSoulDataBuilder_.getCount();
         }

         public SoulData getPresentSoulData(int index) {
            return this.presentSoulDataBuilder_ == null ? (SoulData)this.presentSoulData_.get(index) : (SoulData)this.presentSoulDataBuilder_.getMessage(index);
         }

         public Builder setPresentSoulData(int index, SoulData value) {
            if (this.presentSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.set(index, value);
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPresentSoulData(int index, SoulData.Builder builderForValue) {
            if (this.presentSoulDataBuilder_ == null) {
               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPresentSoulData(SoulData value) {
            if (this.presentSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.add(value);
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPresentSoulData(int index, SoulData value) {
            if (this.presentSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.add(index, value);
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPresentSoulData(SoulData.Builder builderForValue) {
            if (this.presentSoulDataBuilder_ == null) {
               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPresentSoulData(int index, SoulData.Builder builderForValue) {
            if (this.presentSoulDataBuilder_ == null) {
               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPresentSoulData(Iterable<? extends SoulData> values) {
            if (this.presentSoulDataBuilder_ == null) {
               this.ensurePresentSoulDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.presentSoulData_);
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPresentSoulData() {
            if (this.presentSoulDataBuilder_ == null) {
               this.presentSoulData_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.clear();
            }

            return this;
         }

         public Builder removePresentSoulData(int index) {
            if (this.presentSoulDataBuilder_ == null) {
               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.remove(index);
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.remove(index);
            }

            return this;
         }

         public SoulData.Builder getPresentSoulDataBuilder(int index) {
            return (SoulData.Builder)this.getPresentSoulDataFieldBuilder().getBuilder(index);
         }

         public SoulDataOrBuilder getPresentSoulDataOrBuilder(int index) {
            return this.presentSoulDataBuilder_ == null ? (SoulDataOrBuilder)this.presentSoulData_.get(index) : (SoulDataOrBuilder)this.presentSoulDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SoulDataOrBuilder> getPresentSoulDataOrBuilderList() {
            return this.presentSoulDataBuilder_ != null ? this.presentSoulDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.presentSoulData_);
         }

         public SoulData.Builder addPresentSoulDataBuilder() {
            return (SoulData.Builder)this.getPresentSoulDataFieldBuilder().addBuilder(DragonVeinMsg.SoulData.getDefaultInstance());
         }

         public SoulData.Builder addPresentSoulDataBuilder(int index) {
            return (SoulData.Builder)this.getPresentSoulDataFieldBuilder().addBuilder(index, DragonVeinMsg.SoulData.getDefaultInstance());
         }

         public List<SoulData.Builder> getPresentSoulDataBuilderList() {
            return this.getPresentSoulDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SoulData, SoulData.Builder, SoulDataOrBuilder> getPresentSoulDataFieldBuilder() {
            if (this.presentSoulDataBuilder_ == null) {
               this.presentSoulDataBuilder_ = new RepeatedFieldBuilderV3(this.presentSoulData_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.presentSoulData_ = null;
            }

            return this.presentSoulDataBuilder_;
         }

         private void ensureSurplusSoulDataIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.surplusSoulData_ = new ArrayList(this.surplusSoulData_);
               this.bitField0_ |= 4;
            }

         }

         public List<SoulData> getSurplusSoulDataList() {
            return this.surplusSoulDataBuilder_ == null ? Collections.unmodifiableList(this.surplusSoulData_) : this.surplusSoulDataBuilder_.getMessageList();
         }

         public int getSurplusSoulDataCount() {
            return this.surplusSoulDataBuilder_ == null ? this.surplusSoulData_.size() : this.surplusSoulDataBuilder_.getCount();
         }

         public SoulData getSurplusSoulData(int index) {
            return this.surplusSoulDataBuilder_ == null ? (SoulData)this.surplusSoulData_.get(index) : (SoulData)this.surplusSoulDataBuilder_.getMessage(index);
         }

         public Builder setSurplusSoulData(int index, SoulData value) {
            if (this.surplusSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.set(index, value);
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSurplusSoulData(int index, SoulData.Builder builderForValue) {
            if (this.surplusSoulDataBuilder_ == null) {
               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSurplusSoulData(SoulData value) {
            if (this.surplusSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.add(value);
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSurplusSoulData(int index, SoulData value) {
            if (this.surplusSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.add(index, value);
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSurplusSoulData(SoulData.Builder builderForValue) {
            if (this.surplusSoulDataBuilder_ == null) {
               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSurplusSoulData(int index, SoulData.Builder builderForValue) {
            if (this.surplusSoulDataBuilder_ == null) {
               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSurplusSoulData(Iterable<? extends SoulData> values) {
            if (this.surplusSoulDataBuilder_ == null) {
               this.ensureSurplusSoulDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.surplusSoulData_);
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSurplusSoulData() {
            if (this.surplusSoulDataBuilder_ == null) {
               this.surplusSoulData_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeSurplusSoulData(int index) {
            if (this.surplusSoulDataBuilder_ == null) {
               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.remove(index);
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.remove(index);
            }

            return this;
         }

         public SoulData.Builder getSurplusSoulDataBuilder(int index) {
            return (SoulData.Builder)this.getSurplusSoulDataFieldBuilder().getBuilder(index);
         }

         public SoulDataOrBuilder getSurplusSoulDataOrBuilder(int index) {
            return this.surplusSoulDataBuilder_ == null ? (SoulDataOrBuilder)this.surplusSoulData_.get(index) : (SoulDataOrBuilder)this.surplusSoulDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SoulDataOrBuilder> getSurplusSoulDataOrBuilderList() {
            return this.surplusSoulDataBuilder_ != null ? this.surplusSoulDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.surplusSoulData_);
         }

         public SoulData.Builder addSurplusSoulDataBuilder() {
            return (SoulData.Builder)this.getSurplusSoulDataFieldBuilder().addBuilder(DragonVeinMsg.SoulData.getDefaultInstance());
         }

         public SoulData.Builder addSurplusSoulDataBuilder(int index) {
            return (SoulData.Builder)this.getSurplusSoulDataFieldBuilder().addBuilder(index, DragonVeinMsg.SoulData.getDefaultInstance());
         }

         public List<SoulData.Builder> getSurplusSoulDataBuilderList() {
            return this.getSurplusSoulDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SoulData, SoulData.Builder, SoulDataOrBuilder> getSurplusSoulDataFieldBuilder() {
            if (this.surplusSoulDataBuilder_ == null) {
               this.surplusSoulDataBuilder_ = new RepeatedFieldBuilderV3(this.surplusSoulData_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.surplusSoulData_ = null;
            }

            return this.surplusSoulDataBuilder_;
         }

         public boolean hasIsResolve() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsResolve() {
            return this.isResolve_;
         }

         public Builder setIsResolve(boolean value) {
            this.bitField0_ |= 8;
            this.isResolve_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsResolve() {
            this.bitField0_ &= -9;
            this.isResolve_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasDragonVeinLv() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDragonVeinLv() {
            return this.dragonVeinLv_;
         }

         public Builder setDragonVeinLv(int value) {
            this.bitField0_ |= 16;
            this.dragonVeinLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDragonVeinLv() {
            this.bitField0_ &= -17;
            this.dragonVeinLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDragonVeinExp() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getDragonVeinExp() {
            return this.dragonVeinExp_;
         }

         public Builder setDragonVeinExp(int value) {
            this.bitField0_ |= 32;
            this.dragonVeinExp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDragonVeinExp() {
            this.bitField0_ &= -33;
            this.dragonVeinExp_ = 0;
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

   public static final class C2S_DismissSoul_29107 extends GeneratedMessageV3 implements C2S_DismissSoul_29107OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_DismissSoul_29107 DEFAULT_INSTANCE = new C2S_DismissSoul_29107();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DismissSoul_29107> PARSER = new AbstractParser<C2S_DismissSoul_29107>() {
         public C2S_DismissSoul_29107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DismissSoul_29107(input, extensionRegistry);
         }
      };

      private C2S_DismissSoul_29107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DismissSoul_29107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DismissSoul_29107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DismissSoul_29107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_DismissSoul_29107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_DismissSoul_29107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DismissSoul_29107.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
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
            output.writeInt32(2, this.code_);
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
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_DismissSoul_29107)) {
            return super.equals(obj);
         } else {
            C2S_DismissSoul_29107 other = (C2S_DismissSoul_29107)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition();
            }

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_DismissSoul_29107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DismissSoul_29107)PARSER.parseFrom(data);
      }

      public static C2S_DismissSoul_29107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DismissSoul_29107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DismissSoul_29107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DismissSoul_29107)PARSER.parseFrom(data);
      }

      public static C2S_DismissSoul_29107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DismissSoul_29107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DismissSoul_29107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DismissSoul_29107)PARSER.parseFrom(data);
      }

      public static C2S_DismissSoul_29107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DismissSoul_29107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DismissSoul_29107 parseFrom(InputStream input) throws IOException {
         return (C2S_DismissSoul_29107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DismissSoul_29107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DismissSoul_29107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DismissSoul_29107 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DismissSoul_29107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DismissSoul_29107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DismissSoul_29107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DismissSoul_29107 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DismissSoul_29107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DismissSoul_29107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DismissSoul_29107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DismissSoul_29107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DismissSoul_29107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DismissSoul_29107> parser() {
         return PARSER;
      }

      public Parser<C2S_DismissSoul_29107> getParserForType() {
         return PARSER;
      }

      public C2S_DismissSoul_29107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DismissSoul_29107OrBuilder {
         private int bitField0_;
         private int position_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_DismissSoul_29107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_DismissSoul_29107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DismissSoul_29107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.C2S_DismissSoul_29107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_DismissSoul_29107_descriptor;
         }

         public C2S_DismissSoul_29107 getDefaultInstanceForType() {
            return DragonVeinMsg.C2S_DismissSoul_29107.getDefaultInstance();
         }

         public C2S_DismissSoul_29107 build() {
            C2S_DismissSoul_29107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DismissSoul_29107 buildPartial() {
            C2S_DismissSoul_29107 result = new C2S_DismissSoul_29107(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.position_ = this.position_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof C2S_DismissSoul_29107) {
               return this.mergeFrom((C2S_DismissSoul_29107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DismissSoul_29107 other) {
            if (other == DragonVeinMsg.C2S_DismissSoul_29107.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
            C2S_DismissSoul_29107 parsedMessage = null;

            try {
               parsedMessage = (C2S_DismissSoul_29107)DragonVeinMsg.C2S_DismissSoul_29107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DismissSoul_29107)e.getUnfinishedMessage();
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

         public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 2;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -3;
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

   public static final class S2C_DismissSoul_29108 extends GeneratedMessageV3 implements S2C_DismissSoul_29108OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRESENTSOULDATA_FIELD_NUMBER = 1;
      private List<SoulData> presentSoulData_;
      public static final int SURPLUSSOULDATA_FIELD_NUMBER = 2;
      private List<SoulData> surplusSoulData_;
      public static final int RESOLVEPOSITION_FIELD_NUMBER = 3;
      private int resolvePosition_;
      public static final int DRAGONVEINLV_FIELD_NUMBER = 4;
      private int dragonVeinLv_;
      public static final int DRAGONVEINEXP_FIELD_NUMBER = 5;
      private int dragonVeinExp_;
      private byte memoizedIsInitialized;
      private static final S2C_DismissSoul_29108 DEFAULT_INSTANCE = new S2C_DismissSoul_29108();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DismissSoul_29108> PARSER = new AbstractParser<S2C_DismissSoul_29108>() {
         public S2C_DismissSoul_29108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DismissSoul_29108(input, extensionRegistry);
         }
      };

      private S2C_DismissSoul_29108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DismissSoul_29108() {
         this.memoizedIsInitialized = -1;
         this.presentSoulData_ = Collections.emptyList();
         this.surplusSoulData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DismissSoul_29108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DismissSoul_29108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.presentSoulData_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.presentSoulData_.add(input.readMessage(DragonVeinMsg.SoulData.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.surplusSoulData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.surplusSoulData_.add(input.readMessage(DragonVeinMsg.SoulData.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 1;
                        this.resolvePosition_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 2;
                        this.dragonVeinLv_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.dragonVeinExp_ = input.readInt32();
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
                  this.presentSoulData_ = Collections.unmodifiableList(this.presentSoulData_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.surplusSoulData_ = Collections.unmodifiableList(this.surplusSoulData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_DismissSoul_29108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_DismissSoul_29108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DismissSoul_29108.class, Builder.class);
      }

      public List<SoulData> getPresentSoulDataList() {
         return this.presentSoulData_;
      }

      public List<? extends SoulDataOrBuilder> getPresentSoulDataOrBuilderList() {
         return this.presentSoulData_;
      }

      public int getPresentSoulDataCount() {
         return this.presentSoulData_.size();
      }

      public SoulData getPresentSoulData(int index) {
         return (SoulData)this.presentSoulData_.get(index);
      }

      public SoulDataOrBuilder getPresentSoulDataOrBuilder(int index) {
         return (SoulDataOrBuilder)this.presentSoulData_.get(index);
      }

      public List<SoulData> getSurplusSoulDataList() {
         return this.surplusSoulData_;
      }

      public List<? extends SoulDataOrBuilder> getSurplusSoulDataOrBuilderList() {
         return this.surplusSoulData_;
      }

      public int getSurplusSoulDataCount() {
         return this.surplusSoulData_.size();
      }

      public SoulData getSurplusSoulData(int index) {
         return (SoulData)this.surplusSoulData_.get(index);
      }

      public SoulDataOrBuilder getSurplusSoulDataOrBuilder(int index) {
         return (SoulDataOrBuilder)this.surplusSoulData_.get(index);
      }

      public boolean hasResolvePosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResolvePosition() {
         return this.resolvePosition_;
      }

      public boolean hasDragonVeinLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDragonVeinLv() {
         return this.dragonVeinLv_;
      }

      public boolean hasDragonVeinExp() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDragonVeinExp() {
         return this.dragonVeinExp_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDragonVeinLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDragonVeinExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPresentSoulDataCount(); ++i) {
               if (!this.getPresentSoulData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getSurplusSoulDataCount(); ++i) {
               if (!this.getSurplusSoulData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.presentSoulData_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.presentSoulData_.get(i));
         }

         for(int i = 0; i < this.surplusSoulData_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.surplusSoulData_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(3, this.resolvePosition_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.dragonVeinLv_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.dragonVeinExp_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.presentSoulData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.presentSoulData_.get(i));
            }

            for(int i = 0; i < this.surplusSoulData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.surplusSoulData_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.resolvePosition_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.dragonVeinLv_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.dragonVeinExp_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DismissSoul_29108)) {
            return super.equals(obj);
         } else {
            S2C_DismissSoul_29108 other = (S2C_DismissSoul_29108)obj;
            if (!this.getPresentSoulDataList().equals(other.getPresentSoulDataList())) {
               return false;
            } else if (!this.getSurplusSoulDataList().equals(other.getSurplusSoulDataList())) {
               return false;
            } else if (this.hasResolvePosition() != other.hasResolvePosition()) {
               return false;
            } else if (this.hasResolvePosition() && this.getResolvePosition() != other.getResolvePosition()) {
               return false;
            } else if (this.hasDragonVeinLv() != other.hasDragonVeinLv()) {
               return false;
            } else if (this.hasDragonVeinLv() && this.getDragonVeinLv() != other.getDragonVeinLv()) {
               return false;
            } else if (this.hasDragonVeinExp() != other.hasDragonVeinExp()) {
               return false;
            } else if (this.hasDragonVeinExp() && this.getDragonVeinExp() != other.getDragonVeinExp()) {
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
            if (this.getPresentSoulDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPresentSoulDataList().hashCode();
            }

            if (this.getSurplusSoulDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSurplusSoulDataList().hashCode();
            }

            if (this.hasResolvePosition()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getResolvePosition();
            }

            if (this.hasDragonVeinLv()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDragonVeinLv();
            }

            if (this.hasDragonVeinExp()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDragonVeinExp();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DismissSoul_29108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DismissSoul_29108)PARSER.parseFrom(data);
      }

      public static S2C_DismissSoul_29108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DismissSoul_29108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DismissSoul_29108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DismissSoul_29108)PARSER.parseFrom(data);
      }

      public static S2C_DismissSoul_29108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DismissSoul_29108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DismissSoul_29108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DismissSoul_29108)PARSER.parseFrom(data);
      }

      public static S2C_DismissSoul_29108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DismissSoul_29108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DismissSoul_29108 parseFrom(InputStream input) throws IOException {
         return (S2C_DismissSoul_29108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DismissSoul_29108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DismissSoul_29108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DismissSoul_29108 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DismissSoul_29108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DismissSoul_29108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DismissSoul_29108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DismissSoul_29108 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DismissSoul_29108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DismissSoul_29108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DismissSoul_29108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DismissSoul_29108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DismissSoul_29108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DismissSoul_29108> parser() {
         return PARSER;
      }

      public Parser<S2C_DismissSoul_29108> getParserForType() {
         return PARSER;
      }

      public S2C_DismissSoul_29108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DismissSoul_29108OrBuilder {
         private int bitField0_;
         private List<SoulData> presentSoulData_;
         private RepeatedFieldBuilderV3<SoulData, SoulData.Builder, SoulDataOrBuilder> presentSoulDataBuilder_;
         private List<SoulData> surplusSoulData_;
         private RepeatedFieldBuilderV3<SoulData, SoulData.Builder, SoulDataOrBuilder> surplusSoulDataBuilder_;
         private int resolvePosition_;
         private int dragonVeinLv_;
         private int dragonVeinExp_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_DismissSoul_29108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_DismissSoul_29108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DismissSoul_29108.class, Builder.class);
         }

         private Builder() {
            this.presentSoulData_ = Collections.emptyList();
            this.surplusSoulData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.presentSoulData_ = Collections.emptyList();
            this.surplusSoulData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.S2C_DismissSoul_29108.alwaysUseFieldBuilders) {
               this.getPresentSoulDataFieldBuilder();
               this.getSurplusSoulDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.presentSoulDataBuilder_ == null) {
               this.presentSoulData_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.presentSoulDataBuilder_.clear();
            }

            if (this.surplusSoulDataBuilder_ == null) {
               this.surplusSoulData_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.surplusSoulDataBuilder_.clear();
            }

            this.resolvePosition_ = 0;
            this.bitField0_ &= -5;
            this.dragonVeinLv_ = 0;
            this.bitField0_ &= -9;
            this.dragonVeinExp_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_DismissSoul_29108_descriptor;
         }

         public S2C_DismissSoul_29108 getDefaultInstanceForType() {
            return DragonVeinMsg.S2C_DismissSoul_29108.getDefaultInstance();
         }

         public S2C_DismissSoul_29108 build() {
            S2C_DismissSoul_29108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DismissSoul_29108 buildPartial() {
            S2C_DismissSoul_29108 result = new S2C_DismissSoul_29108(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.presentSoulDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.presentSoulData_ = Collections.unmodifiableList(this.presentSoulData_);
                  this.bitField0_ &= -2;
               }

               result.presentSoulData_ = this.presentSoulData_;
            } else {
               result.presentSoulData_ = this.presentSoulDataBuilder_.build();
            }

            if (this.surplusSoulDataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.surplusSoulData_ = Collections.unmodifiableList(this.surplusSoulData_);
                  this.bitField0_ &= -3;
               }

               result.surplusSoulData_ = this.surplusSoulData_;
            } else {
               result.surplusSoulData_ = this.surplusSoulDataBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.resolvePosition_ = this.resolvePosition_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.dragonVeinLv_ = this.dragonVeinLv_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.dragonVeinExp_ = this.dragonVeinExp_;
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
            if (other instanceof S2C_DismissSoul_29108) {
               return this.mergeFrom((S2C_DismissSoul_29108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DismissSoul_29108 other) {
            if (other == DragonVeinMsg.S2C_DismissSoul_29108.getDefaultInstance()) {
               return this;
            } else {
               if (this.presentSoulDataBuilder_ == null) {
                  if (!other.presentSoulData_.isEmpty()) {
                     if (this.presentSoulData_.isEmpty()) {
                        this.presentSoulData_ = other.presentSoulData_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensurePresentSoulDataIsMutable();
                        this.presentSoulData_.addAll(other.presentSoulData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.presentSoulData_.isEmpty()) {
                  if (this.presentSoulDataBuilder_.isEmpty()) {
                     this.presentSoulDataBuilder_.dispose();
                     this.presentSoulDataBuilder_ = null;
                     this.presentSoulData_ = other.presentSoulData_;
                     this.bitField0_ &= -2;
                     this.presentSoulDataBuilder_ = DragonVeinMsg.S2C_DismissSoul_29108.alwaysUseFieldBuilders ? this.getPresentSoulDataFieldBuilder() : null;
                  } else {
                     this.presentSoulDataBuilder_.addAllMessages(other.presentSoulData_);
                  }
               }

               if (this.surplusSoulDataBuilder_ == null) {
                  if (!other.surplusSoulData_.isEmpty()) {
                     if (this.surplusSoulData_.isEmpty()) {
                        this.surplusSoulData_ = other.surplusSoulData_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureSurplusSoulDataIsMutable();
                        this.surplusSoulData_.addAll(other.surplusSoulData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.surplusSoulData_.isEmpty()) {
                  if (this.surplusSoulDataBuilder_.isEmpty()) {
                     this.surplusSoulDataBuilder_.dispose();
                     this.surplusSoulDataBuilder_ = null;
                     this.surplusSoulData_ = other.surplusSoulData_;
                     this.bitField0_ &= -3;
                     this.surplusSoulDataBuilder_ = DragonVeinMsg.S2C_DismissSoul_29108.alwaysUseFieldBuilders ? this.getSurplusSoulDataFieldBuilder() : null;
                  } else {
                     this.surplusSoulDataBuilder_.addAllMessages(other.surplusSoulData_);
                  }
               }

               if (other.hasResolvePosition()) {
                  this.setResolvePosition(other.getResolvePosition());
               }

               if (other.hasDragonVeinLv()) {
                  this.setDragonVeinLv(other.getDragonVeinLv());
               }

               if (other.hasDragonVeinExp()) {
                  this.setDragonVeinExp(other.getDragonVeinExp());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDragonVeinLv()) {
               return false;
            } else if (!this.hasDragonVeinExp()) {
               return false;
            } else {
               for(int i = 0; i < this.getPresentSoulDataCount(); ++i) {
                  if (!this.getPresentSoulData(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getSurplusSoulDataCount(); ++i) {
                  if (!this.getSurplusSoulData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DismissSoul_29108 parsedMessage = null;

            try {
               parsedMessage = (S2C_DismissSoul_29108)DragonVeinMsg.S2C_DismissSoul_29108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DismissSoul_29108)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePresentSoulDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.presentSoulData_ = new ArrayList(this.presentSoulData_);
               this.bitField0_ |= 1;
            }

         }

         public List<SoulData> getPresentSoulDataList() {
            return this.presentSoulDataBuilder_ == null ? Collections.unmodifiableList(this.presentSoulData_) : this.presentSoulDataBuilder_.getMessageList();
         }

         public int getPresentSoulDataCount() {
            return this.presentSoulDataBuilder_ == null ? this.presentSoulData_.size() : this.presentSoulDataBuilder_.getCount();
         }

         public SoulData getPresentSoulData(int index) {
            return this.presentSoulDataBuilder_ == null ? (SoulData)this.presentSoulData_.get(index) : (SoulData)this.presentSoulDataBuilder_.getMessage(index);
         }

         public Builder setPresentSoulData(int index, SoulData value) {
            if (this.presentSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.set(index, value);
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPresentSoulData(int index, SoulData.Builder builderForValue) {
            if (this.presentSoulDataBuilder_ == null) {
               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPresentSoulData(SoulData value) {
            if (this.presentSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.add(value);
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPresentSoulData(int index, SoulData value) {
            if (this.presentSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.add(index, value);
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPresentSoulData(SoulData.Builder builderForValue) {
            if (this.presentSoulDataBuilder_ == null) {
               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPresentSoulData(int index, SoulData.Builder builderForValue) {
            if (this.presentSoulDataBuilder_ == null) {
               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPresentSoulData(Iterable<? extends SoulData> values) {
            if (this.presentSoulDataBuilder_ == null) {
               this.ensurePresentSoulDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.presentSoulData_);
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPresentSoulData() {
            if (this.presentSoulDataBuilder_ == null) {
               this.presentSoulData_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.clear();
            }

            return this;
         }

         public Builder removePresentSoulData(int index) {
            if (this.presentSoulDataBuilder_ == null) {
               this.ensurePresentSoulDataIsMutable();
               this.presentSoulData_.remove(index);
               this.onChanged();
            } else {
               this.presentSoulDataBuilder_.remove(index);
            }

            return this;
         }

         public SoulData.Builder getPresentSoulDataBuilder(int index) {
            return (SoulData.Builder)this.getPresentSoulDataFieldBuilder().getBuilder(index);
         }

         public SoulDataOrBuilder getPresentSoulDataOrBuilder(int index) {
            return this.presentSoulDataBuilder_ == null ? (SoulDataOrBuilder)this.presentSoulData_.get(index) : (SoulDataOrBuilder)this.presentSoulDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SoulDataOrBuilder> getPresentSoulDataOrBuilderList() {
            return this.presentSoulDataBuilder_ != null ? this.presentSoulDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.presentSoulData_);
         }

         public SoulData.Builder addPresentSoulDataBuilder() {
            return (SoulData.Builder)this.getPresentSoulDataFieldBuilder().addBuilder(DragonVeinMsg.SoulData.getDefaultInstance());
         }

         public SoulData.Builder addPresentSoulDataBuilder(int index) {
            return (SoulData.Builder)this.getPresentSoulDataFieldBuilder().addBuilder(index, DragonVeinMsg.SoulData.getDefaultInstance());
         }

         public List<SoulData.Builder> getPresentSoulDataBuilderList() {
            return this.getPresentSoulDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SoulData, SoulData.Builder, SoulDataOrBuilder> getPresentSoulDataFieldBuilder() {
            if (this.presentSoulDataBuilder_ == null) {
               this.presentSoulDataBuilder_ = new RepeatedFieldBuilderV3(this.presentSoulData_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.presentSoulData_ = null;
            }

            return this.presentSoulDataBuilder_;
         }

         private void ensureSurplusSoulDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.surplusSoulData_ = new ArrayList(this.surplusSoulData_);
               this.bitField0_ |= 2;
            }

         }

         public List<SoulData> getSurplusSoulDataList() {
            return this.surplusSoulDataBuilder_ == null ? Collections.unmodifiableList(this.surplusSoulData_) : this.surplusSoulDataBuilder_.getMessageList();
         }

         public int getSurplusSoulDataCount() {
            return this.surplusSoulDataBuilder_ == null ? this.surplusSoulData_.size() : this.surplusSoulDataBuilder_.getCount();
         }

         public SoulData getSurplusSoulData(int index) {
            return this.surplusSoulDataBuilder_ == null ? (SoulData)this.surplusSoulData_.get(index) : (SoulData)this.surplusSoulDataBuilder_.getMessage(index);
         }

         public Builder setSurplusSoulData(int index, SoulData value) {
            if (this.surplusSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.set(index, value);
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSurplusSoulData(int index, SoulData.Builder builderForValue) {
            if (this.surplusSoulDataBuilder_ == null) {
               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSurplusSoulData(SoulData value) {
            if (this.surplusSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.add(value);
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSurplusSoulData(int index, SoulData value) {
            if (this.surplusSoulDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.add(index, value);
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSurplusSoulData(SoulData.Builder builderForValue) {
            if (this.surplusSoulDataBuilder_ == null) {
               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSurplusSoulData(int index, SoulData.Builder builderForValue) {
            if (this.surplusSoulDataBuilder_ == null) {
               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSurplusSoulData(Iterable<? extends SoulData> values) {
            if (this.surplusSoulDataBuilder_ == null) {
               this.ensureSurplusSoulDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.surplusSoulData_);
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSurplusSoulData() {
            if (this.surplusSoulDataBuilder_ == null) {
               this.surplusSoulData_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeSurplusSoulData(int index) {
            if (this.surplusSoulDataBuilder_ == null) {
               this.ensureSurplusSoulDataIsMutable();
               this.surplusSoulData_.remove(index);
               this.onChanged();
            } else {
               this.surplusSoulDataBuilder_.remove(index);
            }

            return this;
         }

         public SoulData.Builder getSurplusSoulDataBuilder(int index) {
            return (SoulData.Builder)this.getSurplusSoulDataFieldBuilder().getBuilder(index);
         }

         public SoulDataOrBuilder getSurplusSoulDataOrBuilder(int index) {
            return this.surplusSoulDataBuilder_ == null ? (SoulDataOrBuilder)this.surplusSoulData_.get(index) : (SoulDataOrBuilder)this.surplusSoulDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SoulDataOrBuilder> getSurplusSoulDataOrBuilderList() {
            return this.surplusSoulDataBuilder_ != null ? this.surplusSoulDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.surplusSoulData_);
         }

         public SoulData.Builder addSurplusSoulDataBuilder() {
            return (SoulData.Builder)this.getSurplusSoulDataFieldBuilder().addBuilder(DragonVeinMsg.SoulData.getDefaultInstance());
         }

         public SoulData.Builder addSurplusSoulDataBuilder(int index) {
            return (SoulData.Builder)this.getSurplusSoulDataFieldBuilder().addBuilder(index, DragonVeinMsg.SoulData.getDefaultInstance());
         }

         public List<SoulData.Builder> getSurplusSoulDataBuilderList() {
            return this.getSurplusSoulDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SoulData, SoulData.Builder, SoulDataOrBuilder> getSurplusSoulDataFieldBuilder() {
            if (this.surplusSoulDataBuilder_ == null) {
               this.surplusSoulDataBuilder_ = new RepeatedFieldBuilderV3(this.surplusSoulData_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.surplusSoulData_ = null;
            }

            return this.surplusSoulDataBuilder_;
         }

         public boolean hasResolvePosition() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getResolvePosition() {
            return this.resolvePosition_;
         }

         public Builder setResolvePosition(int value) {
            this.bitField0_ |= 4;
            this.resolvePosition_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResolvePosition() {
            this.bitField0_ &= -5;
            this.resolvePosition_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDragonVeinLv() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDragonVeinLv() {
            return this.dragonVeinLv_;
         }

         public Builder setDragonVeinLv(int value) {
            this.bitField0_ |= 8;
            this.dragonVeinLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDragonVeinLv() {
            this.bitField0_ &= -9;
            this.dragonVeinLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDragonVeinExp() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDragonVeinExp() {
            return this.dragonVeinExp_;
         }

         public Builder setDragonVeinExp(int value) {
            this.bitField0_ |= 16;
            this.dragonVeinExp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDragonVeinExp() {
            this.bitField0_ &= -17;
            this.dragonVeinExp_ = 0;
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

   public static final class C2S_DragonSoulValUp_29109 extends GeneratedMessageV3 implements C2S_DragonSoulValUp_29109OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ITEMNUM_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> itemNum_;
      private byte memoizedIsInitialized;
      private static final C2S_DragonSoulValUp_29109 DEFAULT_INSTANCE = new C2S_DragonSoulValUp_29109();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DragonSoulValUp_29109> PARSER = new AbstractParser<C2S_DragonSoulValUp_29109>() {
         public C2S_DragonSoulValUp_29109 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DragonSoulValUp_29109(input, extensionRegistry);
         }
      };

      private C2S_DragonSoulValUp_29109(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DragonSoulValUp_29109() {
         this.memoizedIsInitialized = -1;
         this.itemNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DragonSoulValUp_29109();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DragonSoulValUp_29109(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.itemNum_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.itemNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
                  this.itemNum_ = Collections.unmodifiableList(this.itemNum_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonSoulValUp_29109_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonSoulValUp_29109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DragonSoulValUp_29109.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getItemNumList() {
         return this.itemNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getItemNumOrBuilderList() {
         return this.itemNum_;
      }

      public int getItemNumCount() {
         return this.itemNum_.size();
      }

      public CommonMsg.MapDataII getItemNum(int index) {
         return (CommonMsg.MapDataII)this.itemNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getItemNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.itemNum_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getItemNumCount(); ++i) {
               if (!this.getItemNum(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.itemNum_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.itemNum_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.itemNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.itemNum_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_DragonSoulValUp_29109)) {
            return super.equals(obj);
         } else {
            C2S_DragonSoulValUp_29109 other = (C2S_DragonSoulValUp_29109)obj;
            if (!this.getItemNumList().equals(other.getItemNumList())) {
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
            if (this.getItemNumCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemNumList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_DragonSoulValUp_29109 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DragonSoulValUp_29109)PARSER.parseFrom(data);
      }

      public static C2S_DragonSoulValUp_29109 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonSoulValUp_29109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonSoulValUp_29109 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DragonSoulValUp_29109)PARSER.parseFrom(data);
      }

      public static C2S_DragonSoulValUp_29109 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonSoulValUp_29109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonSoulValUp_29109 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DragonSoulValUp_29109)PARSER.parseFrom(data);
      }

      public static C2S_DragonSoulValUp_29109 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonSoulValUp_29109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonSoulValUp_29109 parseFrom(InputStream input) throws IOException {
         return (C2S_DragonSoulValUp_29109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DragonSoulValUp_29109 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonSoulValUp_29109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DragonSoulValUp_29109 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DragonSoulValUp_29109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DragonSoulValUp_29109 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonSoulValUp_29109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DragonSoulValUp_29109 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DragonSoulValUp_29109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DragonSoulValUp_29109 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonSoulValUp_29109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DragonSoulValUp_29109 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DragonSoulValUp_29109 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DragonSoulValUp_29109> parser() {
         return PARSER;
      }

      public Parser<C2S_DragonSoulValUp_29109> getParserForType() {
         return PARSER;
      }

      public C2S_DragonSoulValUp_29109 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DragonSoulValUp_29109OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> itemNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> itemNumBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonSoulValUp_29109_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonSoulValUp_29109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DragonSoulValUp_29109.class, Builder.class);
         }

         private Builder() {
            this.itemNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.C2S_DragonSoulValUp_29109.alwaysUseFieldBuilders) {
               this.getItemNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.itemNumBuilder_ == null) {
               this.itemNum_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.itemNumBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_DragonSoulValUp_29109_descriptor;
         }

         public C2S_DragonSoulValUp_29109 getDefaultInstanceForType() {
            return DragonVeinMsg.C2S_DragonSoulValUp_29109.getDefaultInstance();
         }

         public C2S_DragonSoulValUp_29109 build() {
            C2S_DragonSoulValUp_29109 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DragonSoulValUp_29109 buildPartial() {
            C2S_DragonSoulValUp_29109 result = new C2S_DragonSoulValUp_29109(this);
            int from_bitField0_ = this.bitField0_;
            if (this.itemNumBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.itemNum_ = Collections.unmodifiableList(this.itemNum_);
                  this.bitField0_ &= -2;
               }

               result.itemNum_ = this.itemNum_;
            } else {
               result.itemNum_ = this.itemNumBuilder_.build();
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
            if (other instanceof C2S_DragonSoulValUp_29109) {
               return this.mergeFrom((C2S_DragonSoulValUp_29109)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DragonSoulValUp_29109 other) {
            if (other == DragonVeinMsg.C2S_DragonSoulValUp_29109.getDefaultInstance()) {
               return this;
            } else {
               if (this.itemNumBuilder_ == null) {
                  if (!other.itemNum_.isEmpty()) {
                     if (this.itemNum_.isEmpty()) {
                        this.itemNum_ = other.itemNum_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureItemNumIsMutable();
                        this.itemNum_.addAll(other.itemNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.itemNum_.isEmpty()) {
                  if (this.itemNumBuilder_.isEmpty()) {
                     this.itemNumBuilder_.dispose();
                     this.itemNumBuilder_ = null;
                     this.itemNum_ = other.itemNum_;
                     this.bitField0_ &= -2;
                     this.itemNumBuilder_ = DragonVeinMsg.C2S_DragonSoulValUp_29109.alwaysUseFieldBuilders ? this.getItemNumFieldBuilder() : null;
                  } else {
                     this.itemNumBuilder_.addAllMessages(other.itemNum_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getItemNumCount(); ++i) {
               if (!this.getItemNum(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_DragonSoulValUp_29109 parsedMessage = null;

            try {
               parsedMessage = (C2S_DragonSoulValUp_29109)DragonVeinMsg.C2S_DragonSoulValUp_29109.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DragonSoulValUp_29109)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureItemNumIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.itemNum_ = new ArrayList(this.itemNum_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getItemNumList() {
            return this.itemNumBuilder_ == null ? Collections.unmodifiableList(this.itemNum_) : this.itemNumBuilder_.getMessageList();
         }

         public int getItemNumCount() {
            return this.itemNumBuilder_ == null ? this.itemNum_.size() : this.itemNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getItemNum(int index) {
            return this.itemNumBuilder_ == null ? (CommonMsg.MapDataII)this.itemNum_.get(index) : (CommonMsg.MapDataII)this.itemNumBuilder_.getMessage(index);
         }

         public Builder setItemNum(int index, CommonMsg.MapDataII value) {
            if (this.itemNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemNumIsMutable();
               this.itemNum_.set(index, value);
               this.onChanged();
            } else {
               this.itemNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItemNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.itemNumBuilder_ == null) {
               this.ensureItemNumIsMutable();
               this.itemNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItemNum(CommonMsg.MapDataII value) {
            if (this.itemNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemNumIsMutable();
               this.itemNum_.add(value);
               this.onChanged();
            } else {
               this.itemNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItemNum(int index, CommonMsg.MapDataII value) {
            if (this.itemNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemNumIsMutable();
               this.itemNum_.add(index, value);
               this.onChanged();
            } else {
               this.itemNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItemNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.itemNumBuilder_ == null) {
               this.ensureItemNumIsMutable();
               this.itemNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItemNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.itemNumBuilder_ == null) {
               this.ensureItemNumIsMutable();
               this.itemNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItemNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.itemNumBuilder_ == null) {
               this.ensureItemNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.itemNum_);
               this.onChanged();
            } else {
               this.itemNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItemNum() {
            if (this.itemNumBuilder_ == null) {
               this.itemNum_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.itemNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeItemNum(int index) {
            if (this.itemNumBuilder_ == null) {
               this.ensureItemNumIsMutable();
               this.itemNum_.remove(index);
               this.onChanged();
            } else {
               this.itemNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getItemNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getItemNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getItemNumOrBuilder(int index) {
            return this.itemNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.itemNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.itemNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getItemNumOrBuilderList() {
            return this.itemNumBuilder_ != null ? this.itemNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.itemNum_);
         }

         public CommonMsg.MapDataII.Builder addItemNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getItemNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addItemNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getItemNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getItemNumBuilderList() {
            return this.getItemNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getItemNumFieldBuilder() {
            if (this.itemNumBuilder_ == null) {
               this.itemNumBuilder_ = new RepeatedFieldBuilderV3(this.itemNum_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.itemNum_ = null;
            }

            return this.itemNumBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_DragonSoulValUp_29110 extends GeneratedMessageV3 implements S2C_DragonSoulValUp_29110OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRAGONSOULVAL_FIELD_NUMBER = 1;
      private int dragonSoulVal_;
      private byte memoizedIsInitialized;
      private static final S2C_DragonSoulValUp_29110 DEFAULT_INSTANCE = new S2C_DragonSoulValUp_29110();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DragonSoulValUp_29110> PARSER = new AbstractParser<S2C_DragonSoulValUp_29110>() {
         public S2C_DragonSoulValUp_29110 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DragonSoulValUp_29110(input, extensionRegistry);
         }
      };

      private S2C_DragonSoulValUp_29110(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DragonSoulValUp_29110() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DragonSoulValUp_29110();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DragonSoulValUp_29110(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dragonSoulVal_ = input.readInt32();
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
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonSoulValUp_29110_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonSoulValUp_29110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonSoulValUp_29110.class, Builder.class);
      }

      public boolean hasDragonSoulVal() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDragonSoulVal() {
         return this.dragonSoulVal_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDragonSoulVal()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.dragonSoulVal_);
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
               size += CodedOutputStream.computeInt32Size(1, this.dragonSoulVal_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DragonSoulValUp_29110)) {
            return super.equals(obj);
         } else {
            S2C_DragonSoulValUp_29110 other = (S2C_DragonSoulValUp_29110)obj;
            if (this.hasDragonSoulVal() != other.hasDragonSoulVal()) {
               return false;
            } else if (this.hasDragonSoulVal() && this.getDragonSoulVal() != other.getDragonSoulVal()) {
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
            if (this.hasDragonSoulVal()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDragonSoulVal();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DragonSoulValUp_29110 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DragonSoulValUp_29110)PARSER.parseFrom(data);
      }

      public static S2C_DragonSoulValUp_29110 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonSoulValUp_29110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonSoulValUp_29110 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DragonSoulValUp_29110)PARSER.parseFrom(data);
      }

      public static S2C_DragonSoulValUp_29110 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonSoulValUp_29110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonSoulValUp_29110 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DragonSoulValUp_29110)PARSER.parseFrom(data);
      }

      public static S2C_DragonSoulValUp_29110 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonSoulValUp_29110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonSoulValUp_29110 parseFrom(InputStream input) throws IOException {
         return (S2C_DragonSoulValUp_29110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonSoulValUp_29110 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonSoulValUp_29110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonSoulValUp_29110 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DragonSoulValUp_29110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DragonSoulValUp_29110 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonSoulValUp_29110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonSoulValUp_29110 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DragonSoulValUp_29110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonSoulValUp_29110 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonSoulValUp_29110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DragonSoulValUp_29110 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DragonSoulValUp_29110 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DragonSoulValUp_29110> parser() {
         return PARSER;
      }

      public Parser<S2C_DragonSoulValUp_29110> getParserForType() {
         return PARSER;
      }

      public S2C_DragonSoulValUp_29110 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DragonSoulValUp_29110OrBuilder {
         private int bitField0_;
         private int dragonSoulVal_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonSoulValUp_29110_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonSoulValUp_29110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonSoulValUp_29110.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.S2C_DragonSoulValUp_29110.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dragonSoulVal_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_DragonSoulValUp_29110_descriptor;
         }

         public S2C_DragonSoulValUp_29110 getDefaultInstanceForType() {
            return DragonVeinMsg.S2C_DragonSoulValUp_29110.getDefaultInstance();
         }

         public S2C_DragonSoulValUp_29110 build() {
            S2C_DragonSoulValUp_29110 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DragonSoulValUp_29110 buildPartial() {
            S2C_DragonSoulValUp_29110 result = new S2C_DragonSoulValUp_29110(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.dragonSoulVal_ = this.dragonSoulVal_;
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
            if (other instanceof S2C_DragonSoulValUp_29110) {
               return this.mergeFrom((S2C_DragonSoulValUp_29110)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DragonSoulValUp_29110 other) {
            if (other == DragonVeinMsg.S2C_DragonSoulValUp_29110.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDragonSoulVal()) {
                  this.setDragonSoulVal(other.getDragonSoulVal());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDragonSoulVal();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DragonSoulValUp_29110 parsedMessage = null;

            try {
               parsedMessage = (S2C_DragonSoulValUp_29110)DragonVeinMsg.S2C_DragonSoulValUp_29110.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DragonSoulValUp_29110)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDragonSoulVal() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDragonSoulVal() {
            return this.dragonSoulVal_;
         }

         public Builder setDragonSoulVal(int value) {
            this.bitField0_ |= 1;
            this.dragonSoulVal_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDragonSoulVal() {
            this.bitField0_ &= -2;
            this.dragonSoulVal_ = 0;
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

   public static final class OptionVal extends GeneratedMessageV3 implements OptionValOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPTION_FIELD_NUMBER = 1;
      private int option_;
      public static final int VAL_FIELD_NUMBER = 2;
      private int val_;
      private byte memoizedIsInitialized;
      private static final OptionVal DEFAULT_INSTANCE = new OptionVal();
      /** @deprecated */
      @Deprecated
      public static final Parser<OptionVal> PARSER = new AbstractParser<OptionVal>() {
         public OptionVal parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new OptionVal(input, extensionRegistry);
         }
      };

      private OptionVal(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private OptionVal() {
         this.memoizedIsInitialized = -1;
         this.option_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new OptionVal();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private OptionVal(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        OptionEnum value = DragonVeinMsg.OptionEnum.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.option_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.val_ = input.readInt32();
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
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_OptionVal_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_OptionVal_fieldAccessorTable.ensureFieldAccessorsInitialized(OptionVal.class, Builder.class);
      }

      public boolean hasOption() {
         return (this.bitField0_ & 1) != 0;
      }

      public OptionEnum getOption() {
         OptionEnum result = DragonVeinMsg.OptionEnum.valueOf(this.option_);
         return result == null ? DragonVeinMsg.OptionEnum.SOUL_QUALITY : result;
      }

      public boolean hasVal() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getVal() {
         return this.val_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOption()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.option_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.val_);
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
               size += CodedOutputStream.computeEnumSize(1, this.option_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.val_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof OptionVal)) {
            return super.equals(obj);
         } else {
            OptionVal other = (OptionVal)obj;
            if (this.hasOption() != other.hasOption()) {
               return false;
            } else if (this.hasOption() && this.option_ != other.option_) {
               return false;
            } else if (this.hasVal() != other.hasVal()) {
               return false;
            } else if (this.hasVal() && this.getVal() != other.getVal()) {
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
            if (this.hasOption()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.option_;
            }

            if (this.hasVal()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getVal();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static OptionVal parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (OptionVal)PARSER.parseFrom(data);
      }

      public static OptionVal parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OptionVal)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OptionVal parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (OptionVal)PARSER.parseFrom(data);
      }

      public static OptionVal parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OptionVal)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OptionVal parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (OptionVal)PARSER.parseFrom(data);
      }

      public static OptionVal parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OptionVal)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OptionVal parseFrom(InputStream input) throws IOException {
         return (OptionVal)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static OptionVal parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OptionVal)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static OptionVal parseDelimitedFrom(InputStream input) throws IOException {
         return (OptionVal)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static OptionVal parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OptionVal)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static OptionVal parseFrom(CodedInputStream input) throws IOException {
         return (OptionVal)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static OptionVal parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OptionVal)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(OptionVal prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static OptionVal getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<OptionVal> parser() {
         return PARSER;
      }

      public Parser<OptionVal> getParserForType() {
         return PARSER;
      }

      public OptionVal getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OptionValOrBuilder {
         private int bitField0_;
         private int option_;
         private int val_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_OptionVal_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_OptionVal_fieldAccessorTable.ensureFieldAccessorsInitialized(OptionVal.class, Builder.class);
         }

         private Builder() {
            this.option_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.option_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.OptionVal.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.option_ = 1;
            this.bitField0_ &= -2;
            this.val_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_OptionVal_descriptor;
         }

         public OptionVal getDefaultInstanceForType() {
            return DragonVeinMsg.OptionVal.getDefaultInstance();
         }

         public OptionVal build() {
            OptionVal result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public OptionVal buildPartial() {
            OptionVal result = new OptionVal(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.option_ = this.option_;
            if ((from_bitField0_ & 2) != 0) {
               result.val_ = this.val_;
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
            if (other instanceof OptionVal) {
               return this.mergeFrom((OptionVal)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(OptionVal other) {
            if (other == DragonVeinMsg.OptionVal.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOption()) {
                  this.setOption(other.getOption());
               }

               if (other.hasVal()) {
                  this.setVal(other.getVal());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasOption();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            OptionVal parsedMessage = null;

            try {
               parsedMessage = (OptionVal)DragonVeinMsg.OptionVal.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (OptionVal)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOption() {
            return (this.bitField0_ & 1) != 0;
         }

         public OptionEnum getOption() {
            OptionEnum result = DragonVeinMsg.OptionEnum.valueOf(this.option_);
            return result == null ? DragonVeinMsg.OptionEnum.SOUL_QUALITY : result;
         }

         public Builder setOption(OptionEnum value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.option_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearOption() {
            this.bitField0_ &= -2;
            this.option_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasVal() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getVal() {
            return this.val_;
         }

         public Builder setVal(int value) {
            this.bitField0_ |= 2;
            this.val_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVal() {
            this.bitField0_ &= -3;
            this.val_ = 0;
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

   public static final class C2S_CommitOption_29111 extends GeneratedMessageV3 implements C2S_CommitOption_29111OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int OPTIONVAL_FIELD_NUMBER = 1;
      private List<OptionVal> optionVal_;
      private byte memoizedIsInitialized;
      private static final C2S_CommitOption_29111 DEFAULT_INSTANCE = new C2S_CommitOption_29111();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CommitOption_29111> PARSER = new AbstractParser<C2S_CommitOption_29111>() {
         public C2S_CommitOption_29111 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CommitOption_29111(input, extensionRegistry);
         }
      };

      private C2S_CommitOption_29111(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CommitOption_29111() {
         this.memoizedIsInitialized = -1;
         this.optionVal_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CommitOption_29111();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CommitOption_29111(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.optionVal_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.optionVal_.add(input.readMessage(DragonVeinMsg.OptionVal.PARSER, extensionRegistry));
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
                  this.optionVal_ = Collections.unmodifiableList(this.optionVal_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_CommitOption_29111_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_CommitOption_29111_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitOption_29111.class, Builder.class);
      }

      public List<OptionVal> getOptionValList() {
         return this.optionVal_;
      }

      public List<? extends OptionValOrBuilder> getOptionValOrBuilderList() {
         return this.optionVal_;
      }

      public int getOptionValCount() {
         return this.optionVal_.size();
      }

      public OptionVal getOptionVal(int index) {
         return (OptionVal)this.optionVal_.get(index);
      }

      public OptionValOrBuilder getOptionValOrBuilder(int index) {
         return (OptionValOrBuilder)this.optionVal_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getOptionValCount(); ++i) {
               if (!this.getOptionVal(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.optionVal_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.optionVal_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.optionVal_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.optionVal_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CommitOption_29111)) {
            return super.equals(obj);
         } else {
            C2S_CommitOption_29111 other = (C2S_CommitOption_29111)obj;
            if (!this.getOptionValList().equals(other.getOptionValList())) {
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
            if (this.getOptionValCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOptionValList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CommitOption_29111 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CommitOption_29111)PARSER.parseFrom(data);
      }

      public static C2S_CommitOption_29111 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitOption_29111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitOption_29111 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CommitOption_29111)PARSER.parseFrom(data);
      }

      public static C2S_CommitOption_29111 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitOption_29111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitOption_29111 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CommitOption_29111)PARSER.parseFrom(data);
      }

      public static C2S_CommitOption_29111 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitOption_29111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitOption_29111 parseFrom(InputStream input) throws IOException {
         return (C2S_CommitOption_29111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitOption_29111 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitOption_29111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitOption_29111 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CommitOption_29111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CommitOption_29111 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitOption_29111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitOption_29111 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CommitOption_29111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitOption_29111 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitOption_29111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CommitOption_29111 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CommitOption_29111 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CommitOption_29111> parser() {
         return PARSER;
      }

      public Parser<C2S_CommitOption_29111> getParserForType() {
         return PARSER;
      }

      public C2S_CommitOption_29111 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CommitOption_29111OrBuilder {
         private int bitField0_;
         private List<OptionVal> optionVal_;
         private RepeatedFieldBuilderV3<OptionVal, OptionVal.Builder, OptionValOrBuilder> optionValBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_CommitOption_29111_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_CommitOption_29111_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitOption_29111.class, Builder.class);
         }

         private Builder() {
            this.optionVal_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.optionVal_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.C2S_CommitOption_29111.alwaysUseFieldBuilders) {
               this.getOptionValFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.optionValBuilder_ == null) {
               this.optionVal_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.optionValBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_CommitOption_29111_descriptor;
         }

         public C2S_CommitOption_29111 getDefaultInstanceForType() {
            return DragonVeinMsg.C2S_CommitOption_29111.getDefaultInstance();
         }

         public C2S_CommitOption_29111 build() {
            C2S_CommitOption_29111 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CommitOption_29111 buildPartial() {
            C2S_CommitOption_29111 result = new C2S_CommitOption_29111(this);
            int from_bitField0_ = this.bitField0_;
            if (this.optionValBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.optionVal_ = Collections.unmodifiableList(this.optionVal_);
                  this.bitField0_ &= -2;
               }

               result.optionVal_ = this.optionVal_;
            } else {
               result.optionVal_ = this.optionValBuilder_.build();
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
            if (other instanceof C2S_CommitOption_29111) {
               return this.mergeFrom((C2S_CommitOption_29111)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CommitOption_29111 other) {
            if (other == DragonVeinMsg.C2S_CommitOption_29111.getDefaultInstance()) {
               return this;
            } else {
               if (this.optionValBuilder_ == null) {
                  if (!other.optionVal_.isEmpty()) {
                     if (this.optionVal_.isEmpty()) {
                        this.optionVal_ = other.optionVal_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureOptionValIsMutable();
                        this.optionVal_.addAll(other.optionVal_);
                     }

                     this.onChanged();
                  }
               } else if (!other.optionVal_.isEmpty()) {
                  if (this.optionValBuilder_.isEmpty()) {
                     this.optionValBuilder_.dispose();
                     this.optionValBuilder_ = null;
                     this.optionVal_ = other.optionVal_;
                     this.bitField0_ &= -2;
                     this.optionValBuilder_ = DragonVeinMsg.C2S_CommitOption_29111.alwaysUseFieldBuilders ? this.getOptionValFieldBuilder() : null;
                  } else {
                     this.optionValBuilder_.addAllMessages(other.optionVal_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getOptionValCount(); ++i) {
               if (!this.getOptionVal(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CommitOption_29111 parsedMessage = null;

            try {
               parsedMessage = (C2S_CommitOption_29111)DragonVeinMsg.C2S_CommitOption_29111.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CommitOption_29111)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureOptionValIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.optionVal_ = new ArrayList(this.optionVal_);
               this.bitField0_ |= 1;
            }

         }

         public List<OptionVal> getOptionValList() {
            return this.optionValBuilder_ == null ? Collections.unmodifiableList(this.optionVal_) : this.optionValBuilder_.getMessageList();
         }

         public int getOptionValCount() {
            return this.optionValBuilder_ == null ? this.optionVal_.size() : this.optionValBuilder_.getCount();
         }

         public OptionVal getOptionVal(int index) {
            return this.optionValBuilder_ == null ? (OptionVal)this.optionVal_.get(index) : (OptionVal)this.optionValBuilder_.getMessage(index);
         }

         public Builder setOptionVal(int index, OptionVal value) {
            if (this.optionValBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOptionValIsMutable();
               this.optionVal_.set(index, value);
               this.onChanged();
            } else {
               this.optionValBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setOptionVal(int index, OptionVal.Builder builderForValue) {
            if (this.optionValBuilder_ == null) {
               this.ensureOptionValIsMutable();
               this.optionVal_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.optionValBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addOptionVal(OptionVal value) {
            if (this.optionValBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOptionValIsMutable();
               this.optionVal_.add(value);
               this.onChanged();
            } else {
               this.optionValBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addOptionVal(int index, OptionVal value) {
            if (this.optionValBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOptionValIsMutable();
               this.optionVal_.add(index, value);
               this.onChanged();
            } else {
               this.optionValBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addOptionVal(OptionVal.Builder builderForValue) {
            if (this.optionValBuilder_ == null) {
               this.ensureOptionValIsMutable();
               this.optionVal_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.optionValBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addOptionVal(int index, OptionVal.Builder builderForValue) {
            if (this.optionValBuilder_ == null) {
               this.ensureOptionValIsMutable();
               this.optionVal_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.optionValBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllOptionVal(Iterable<? extends OptionVal> values) {
            if (this.optionValBuilder_ == null) {
               this.ensureOptionValIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.optionVal_);
               this.onChanged();
            } else {
               this.optionValBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearOptionVal() {
            if (this.optionValBuilder_ == null) {
               this.optionVal_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.optionValBuilder_.clear();
            }

            return this;
         }

         public Builder removeOptionVal(int index) {
            if (this.optionValBuilder_ == null) {
               this.ensureOptionValIsMutable();
               this.optionVal_.remove(index);
               this.onChanged();
            } else {
               this.optionValBuilder_.remove(index);
            }

            return this;
         }

         public OptionVal.Builder getOptionValBuilder(int index) {
            return (OptionVal.Builder)this.getOptionValFieldBuilder().getBuilder(index);
         }

         public OptionValOrBuilder getOptionValOrBuilder(int index) {
            return this.optionValBuilder_ == null ? (OptionValOrBuilder)this.optionVal_.get(index) : (OptionValOrBuilder)this.optionValBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends OptionValOrBuilder> getOptionValOrBuilderList() {
            return this.optionValBuilder_ != null ? this.optionValBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.optionVal_);
         }

         public OptionVal.Builder addOptionValBuilder() {
            return (OptionVal.Builder)this.getOptionValFieldBuilder().addBuilder(DragonVeinMsg.OptionVal.getDefaultInstance());
         }

         public OptionVal.Builder addOptionValBuilder(int index) {
            return (OptionVal.Builder)this.getOptionValFieldBuilder().addBuilder(index, DragonVeinMsg.OptionVal.getDefaultInstance());
         }

         public List<OptionVal.Builder> getOptionValBuilderList() {
            return this.getOptionValFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<OptionVal, OptionVal.Builder, OptionValOrBuilder> getOptionValFieldBuilder() {
            if (this.optionValBuilder_ == null) {
               this.optionValBuilder_ = new RepeatedFieldBuilderV3(this.optionVal_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.optionVal_ = null;
            }

            return this.optionValBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_CommitOption_29112 extends GeneratedMessageV3 implements S2C_CommitOption_29112OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int OPTIONVAL_FIELD_NUMBER = 1;
      private List<OptionVal> optionVal_;
      private byte memoizedIsInitialized;
      private static final S2C_CommitOption_29112 DEFAULT_INSTANCE = new S2C_CommitOption_29112();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommitOption_29112> PARSER = new AbstractParser<S2C_CommitOption_29112>() {
         public S2C_CommitOption_29112 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommitOption_29112(input, extensionRegistry);
         }
      };

      private S2C_CommitOption_29112(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommitOption_29112() {
         this.memoizedIsInitialized = -1;
         this.optionVal_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommitOption_29112();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommitOption_29112(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.optionVal_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.optionVal_.add(input.readMessage(DragonVeinMsg.OptionVal.PARSER, extensionRegistry));
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
                  this.optionVal_ = Collections.unmodifiableList(this.optionVal_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_CommitOption_29112_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_CommitOption_29112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitOption_29112.class, Builder.class);
      }

      public List<OptionVal> getOptionValList() {
         return this.optionVal_;
      }

      public List<? extends OptionValOrBuilder> getOptionValOrBuilderList() {
         return this.optionVal_;
      }

      public int getOptionValCount() {
         return this.optionVal_.size();
      }

      public OptionVal getOptionVal(int index) {
         return (OptionVal)this.optionVal_.get(index);
      }

      public OptionValOrBuilder getOptionValOrBuilder(int index) {
         return (OptionValOrBuilder)this.optionVal_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getOptionValCount(); ++i) {
               if (!this.getOptionVal(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.optionVal_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.optionVal_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.optionVal_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.optionVal_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CommitOption_29112)) {
            return super.equals(obj);
         } else {
            S2C_CommitOption_29112 other = (S2C_CommitOption_29112)obj;
            if (!this.getOptionValList().equals(other.getOptionValList())) {
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
            if (this.getOptionValCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOptionValList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CommitOption_29112 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommitOption_29112)PARSER.parseFrom(data);
      }

      public static S2C_CommitOption_29112 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitOption_29112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitOption_29112 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommitOption_29112)PARSER.parseFrom(data);
      }

      public static S2C_CommitOption_29112 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitOption_29112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitOption_29112 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommitOption_29112)PARSER.parseFrom(data);
      }

      public static S2C_CommitOption_29112 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitOption_29112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitOption_29112 parseFrom(InputStream input) throws IOException {
         return (S2C_CommitOption_29112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitOption_29112 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitOption_29112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitOption_29112 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommitOption_29112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommitOption_29112 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitOption_29112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitOption_29112 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommitOption_29112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitOption_29112 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitOption_29112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommitOption_29112 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommitOption_29112 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommitOption_29112> parser() {
         return PARSER;
      }

      public Parser<S2C_CommitOption_29112> getParserForType() {
         return PARSER;
      }

      public S2C_CommitOption_29112 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommitOption_29112OrBuilder {
         private int bitField0_;
         private List<OptionVal> optionVal_;
         private RepeatedFieldBuilderV3<OptionVal, OptionVal.Builder, OptionValOrBuilder> optionValBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_CommitOption_29112_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_CommitOption_29112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitOption_29112.class, Builder.class);
         }

         private Builder() {
            this.optionVal_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.optionVal_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.S2C_CommitOption_29112.alwaysUseFieldBuilders) {
               this.getOptionValFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.optionValBuilder_ == null) {
               this.optionVal_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.optionValBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_CommitOption_29112_descriptor;
         }

         public S2C_CommitOption_29112 getDefaultInstanceForType() {
            return DragonVeinMsg.S2C_CommitOption_29112.getDefaultInstance();
         }

         public S2C_CommitOption_29112 build() {
            S2C_CommitOption_29112 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommitOption_29112 buildPartial() {
            S2C_CommitOption_29112 result = new S2C_CommitOption_29112(this);
            int from_bitField0_ = this.bitField0_;
            if (this.optionValBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.optionVal_ = Collections.unmodifiableList(this.optionVal_);
                  this.bitField0_ &= -2;
               }

               result.optionVal_ = this.optionVal_;
            } else {
               result.optionVal_ = this.optionValBuilder_.build();
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
            if (other instanceof S2C_CommitOption_29112) {
               return this.mergeFrom((S2C_CommitOption_29112)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommitOption_29112 other) {
            if (other == DragonVeinMsg.S2C_CommitOption_29112.getDefaultInstance()) {
               return this;
            } else {
               if (this.optionValBuilder_ == null) {
                  if (!other.optionVal_.isEmpty()) {
                     if (this.optionVal_.isEmpty()) {
                        this.optionVal_ = other.optionVal_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureOptionValIsMutable();
                        this.optionVal_.addAll(other.optionVal_);
                     }

                     this.onChanged();
                  }
               } else if (!other.optionVal_.isEmpty()) {
                  if (this.optionValBuilder_.isEmpty()) {
                     this.optionValBuilder_.dispose();
                     this.optionValBuilder_ = null;
                     this.optionVal_ = other.optionVal_;
                     this.bitField0_ &= -2;
                     this.optionValBuilder_ = DragonVeinMsg.S2C_CommitOption_29112.alwaysUseFieldBuilders ? this.getOptionValFieldBuilder() : null;
                  } else {
                     this.optionValBuilder_.addAllMessages(other.optionVal_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getOptionValCount(); ++i) {
               if (!this.getOptionVal(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CommitOption_29112 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommitOption_29112)DragonVeinMsg.S2C_CommitOption_29112.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommitOption_29112)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureOptionValIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.optionVal_ = new ArrayList(this.optionVal_);
               this.bitField0_ |= 1;
            }

         }

         public List<OptionVal> getOptionValList() {
            return this.optionValBuilder_ == null ? Collections.unmodifiableList(this.optionVal_) : this.optionValBuilder_.getMessageList();
         }

         public int getOptionValCount() {
            return this.optionValBuilder_ == null ? this.optionVal_.size() : this.optionValBuilder_.getCount();
         }

         public OptionVal getOptionVal(int index) {
            return this.optionValBuilder_ == null ? (OptionVal)this.optionVal_.get(index) : (OptionVal)this.optionValBuilder_.getMessage(index);
         }

         public Builder setOptionVal(int index, OptionVal value) {
            if (this.optionValBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOptionValIsMutable();
               this.optionVal_.set(index, value);
               this.onChanged();
            } else {
               this.optionValBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setOptionVal(int index, OptionVal.Builder builderForValue) {
            if (this.optionValBuilder_ == null) {
               this.ensureOptionValIsMutable();
               this.optionVal_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.optionValBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addOptionVal(OptionVal value) {
            if (this.optionValBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOptionValIsMutable();
               this.optionVal_.add(value);
               this.onChanged();
            } else {
               this.optionValBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addOptionVal(int index, OptionVal value) {
            if (this.optionValBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOptionValIsMutable();
               this.optionVal_.add(index, value);
               this.onChanged();
            } else {
               this.optionValBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addOptionVal(OptionVal.Builder builderForValue) {
            if (this.optionValBuilder_ == null) {
               this.ensureOptionValIsMutable();
               this.optionVal_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.optionValBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addOptionVal(int index, OptionVal.Builder builderForValue) {
            if (this.optionValBuilder_ == null) {
               this.ensureOptionValIsMutable();
               this.optionVal_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.optionValBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllOptionVal(Iterable<? extends OptionVal> values) {
            if (this.optionValBuilder_ == null) {
               this.ensureOptionValIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.optionVal_);
               this.onChanged();
            } else {
               this.optionValBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearOptionVal() {
            if (this.optionValBuilder_ == null) {
               this.optionVal_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.optionValBuilder_.clear();
            }

            return this;
         }

         public Builder removeOptionVal(int index) {
            if (this.optionValBuilder_ == null) {
               this.ensureOptionValIsMutable();
               this.optionVal_.remove(index);
               this.onChanged();
            } else {
               this.optionValBuilder_.remove(index);
            }

            return this;
         }

         public OptionVal.Builder getOptionValBuilder(int index) {
            return (OptionVal.Builder)this.getOptionValFieldBuilder().getBuilder(index);
         }

         public OptionValOrBuilder getOptionValOrBuilder(int index) {
            return this.optionValBuilder_ == null ? (OptionValOrBuilder)this.optionVal_.get(index) : (OptionValOrBuilder)this.optionValBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends OptionValOrBuilder> getOptionValOrBuilderList() {
            return this.optionValBuilder_ != null ? this.optionValBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.optionVal_);
         }

         public OptionVal.Builder addOptionValBuilder() {
            return (OptionVal.Builder)this.getOptionValFieldBuilder().addBuilder(DragonVeinMsg.OptionVal.getDefaultInstance());
         }

         public OptionVal.Builder addOptionValBuilder(int index) {
            return (OptionVal.Builder)this.getOptionValFieldBuilder().addBuilder(index, DragonVeinMsg.OptionVal.getDefaultInstance());
         }

         public List<OptionVal.Builder> getOptionValBuilderList() {
            return this.getOptionValFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<OptionVal, OptionVal.Builder, OptionValOrBuilder> getOptionValFieldBuilder() {
            if (this.optionValBuilder_ == null) {
               this.optionValBuilder_ = new RepeatedFieldBuilderV3(this.optionVal_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.optionVal_ = null;
            }

            return this.optionValBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_OptionInfo_29113 extends GeneratedMessageV3 implements C2S_OptionInfo_29113OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OptionInfo_29113 DEFAULT_INSTANCE = new C2S_OptionInfo_29113();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OptionInfo_29113> PARSER = new AbstractParser<C2S_OptionInfo_29113>() {
         public C2S_OptionInfo_29113 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OptionInfo_29113(input, extensionRegistry);
         }
      };

      private C2S_OptionInfo_29113(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OptionInfo_29113() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OptionInfo_29113();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OptionInfo_29113(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_OptionInfo_29113_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_OptionInfo_29113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionInfo_29113.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OptionInfo_29113)) {
            return super.equals(obj);
         } else {
            C2S_OptionInfo_29113 other = (C2S_OptionInfo_29113)obj;
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

      public static C2S_OptionInfo_29113 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OptionInfo_29113)PARSER.parseFrom(data);
      }

      public static C2S_OptionInfo_29113 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionInfo_29113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionInfo_29113 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OptionInfo_29113)PARSER.parseFrom(data);
      }

      public static C2S_OptionInfo_29113 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionInfo_29113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionInfo_29113 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OptionInfo_29113)PARSER.parseFrom(data);
      }

      public static C2S_OptionInfo_29113 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionInfo_29113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionInfo_29113 parseFrom(InputStream input) throws IOException {
         return (C2S_OptionInfo_29113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionInfo_29113 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionInfo_29113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionInfo_29113 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OptionInfo_29113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OptionInfo_29113 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionInfo_29113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionInfo_29113 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OptionInfo_29113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionInfo_29113 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionInfo_29113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OptionInfo_29113 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OptionInfo_29113 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OptionInfo_29113> parser() {
         return PARSER;
      }

      public Parser<C2S_OptionInfo_29113> getParserForType() {
         return PARSER;
      }

      public C2S_OptionInfo_29113 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OptionInfo_29113OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_OptionInfo_29113_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_OptionInfo_29113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionInfo_29113.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.C2S_OptionInfo_29113.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_C2S_OptionInfo_29113_descriptor;
         }

         public C2S_OptionInfo_29113 getDefaultInstanceForType() {
            return DragonVeinMsg.C2S_OptionInfo_29113.getDefaultInstance();
         }

         public C2S_OptionInfo_29113 build() {
            C2S_OptionInfo_29113 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OptionInfo_29113 buildPartial() {
            C2S_OptionInfo_29113 result = new C2S_OptionInfo_29113(this);
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
            if (other instanceof C2S_OptionInfo_29113) {
               return this.mergeFrom((C2S_OptionInfo_29113)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OptionInfo_29113 other) {
            if (other == DragonVeinMsg.C2S_OptionInfo_29113.getDefaultInstance()) {
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
            C2S_OptionInfo_29113 parsedMessage = null;

            try {
               parsedMessage = (C2S_OptionInfo_29113)DragonVeinMsg.C2S_OptionInfo_29113.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OptionInfo_29113)e.getUnfinishedMessage();
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

   public static final class S2C_OptionInfo_29114 extends GeneratedMessageV3 implements S2C_OptionInfo_29114OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int OPTIONVAL_FIELD_NUMBER = 1;
      private List<OptionVal> optionVal_;
      private byte memoizedIsInitialized;
      private static final S2C_OptionInfo_29114 DEFAULT_INSTANCE = new S2C_OptionInfo_29114();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OptionInfo_29114> PARSER = new AbstractParser<S2C_OptionInfo_29114>() {
         public S2C_OptionInfo_29114 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OptionInfo_29114(input, extensionRegistry);
         }
      };

      private S2C_OptionInfo_29114(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OptionInfo_29114() {
         this.memoizedIsInitialized = -1;
         this.optionVal_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OptionInfo_29114();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OptionInfo_29114(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.optionVal_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.optionVal_.add(input.readMessage(DragonVeinMsg.OptionVal.PARSER, extensionRegistry));
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
                  this.optionVal_ = Collections.unmodifiableList(this.optionVal_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_OptionInfo_29114_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_OptionInfo_29114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionInfo_29114.class, Builder.class);
      }

      public List<OptionVal> getOptionValList() {
         return this.optionVal_;
      }

      public List<? extends OptionValOrBuilder> getOptionValOrBuilderList() {
         return this.optionVal_;
      }

      public int getOptionValCount() {
         return this.optionVal_.size();
      }

      public OptionVal getOptionVal(int index) {
         return (OptionVal)this.optionVal_.get(index);
      }

      public OptionValOrBuilder getOptionValOrBuilder(int index) {
         return (OptionValOrBuilder)this.optionVal_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getOptionValCount(); ++i) {
               if (!this.getOptionVal(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.optionVal_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.optionVal_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.optionVal_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.optionVal_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OptionInfo_29114)) {
            return super.equals(obj);
         } else {
            S2C_OptionInfo_29114 other = (S2C_OptionInfo_29114)obj;
            if (!this.getOptionValList().equals(other.getOptionValList())) {
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
            if (this.getOptionValCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOptionValList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OptionInfo_29114 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OptionInfo_29114)PARSER.parseFrom(data);
      }

      public static S2C_OptionInfo_29114 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionInfo_29114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionInfo_29114 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OptionInfo_29114)PARSER.parseFrom(data);
      }

      public static S2C_OptionInfo_29114 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionInfo_29114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionInfo_29114 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OptionInfo_29114)PARSER.parseFrom(data);
      }

      public static S2C_OptionInfo_29114 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionInfo_29114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionInfo_29114 parseFrom(InputStream input) throws IOException {
         return (S2C_OptionInfo_29114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionInfo_29114 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionInfo_29114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionInfo_29114 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OptionInfo_29114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OptionInfo_29114 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionInfo_29114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionInfo_29114 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OptionInfo_29114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionInfo_29114 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionInfo_29114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OptionInfo_29114 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OptionInfo_29114 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OptionInfo_29114> parser() {
         return PARSER;
      }

      public Parser<S2C_OptionInfo_29114> getParserForType() {
         return PARSER;
      }

      public S2C_OptionInfo_29114 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OptionInfo_29114OrBuilder {
         private int bitField0_;
         private List<OptionVal> optionVal_;
         private RepeatedFieldBuilderV3<OptionVal, OptionVal.Builder, OptionValOrBuilder> optionValBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_OptionInfo_29114_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_OptionInfo_29114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionInfo_29114.class, Builder.class);
         }

         private Builder() {
            this.optionVal_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.optionVal_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonVeinMsg.S2C_OptionInfo_29114.alwaysUseFieldBuilders) {
               this.getOptionValFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.optionValBuilder_ == null) {
               this.optionVal_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.optionValBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonVeinMsg.internal_static_dragonVein_com_gzbz_protobuf_S2C_OptionInfo_29114_descriptor;
         }

         public S2C_OptionInfo_29114 getDefaultInstanceForType() {
            return DragonVeinMsg.S2C_OptionInfo_29114.getDefaultInstance();
         }

         public S2C_OptionInfo_29114 build() {
            S2C_OptionInfo_29114 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OptionInfo_29114 buildPartial() {
            S2C_OptionInfo_29114 result = new S2C_OptionInfo_29114(this);
            int from_bitField0_ = this.bitField0_;
            if (this.optionValBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.optionVal_ = Collections.unmodifiableList(this.optionVal_);
                  this.bitField0_ &= -2;
               }

               result.optionVal_ = this.optionVal_;
            } else {
               result.optionVal_ = this.optionValBuilder_.build();
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
            if (other instanceof S2C_OptionInfo_29114) {
               return this.mergeFrom((S2C_OptionInfo_29114)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OptionInfo_29114 other) {
            if (other == DragonVeinMsg.S2C_OptionInfo_29114.getDefaultInstance()) {
               return this;
            } else {
               if (this.optionValBuilder_ == null) {
                  if (!other.optionVal_.isEmpty()) {
                     if (this.optionVal_.isEmpty()) {
                        this.optionVal_ = other.optionVal_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureOptionValIsMutable();
                        this.optionVal_.addAll(other.optionVal_);
                     }

                     this.onChanged();
                  }
               } else if (!other.optionVal_.isEmpty()) {
                  if (this.optionValBuilder_.isEmpty()) {
                     this.optionValBuilder_.dispose();
                     this.optionValBuilder_ = null;
                     this.optionVal_ = other.optionVal_;
                     this.bitField0_ &= -2;
                     this.optionValBuilder_ = DragonVeinMsg.S2C_OptionInfo_29114.alwaysUseFieldBuilders ? this.getOptionValFieldBuilder() : null;
                  } else {
                     this.optionValBuilder_.addAllMessages(other.optionVal_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getOptionValCount(); ++i) {
               if (!this.getOptionVal(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OptionInfo_29114 parsedMessage = null;

            try {
               parsedMessage = (S2C_OptionInfo_29114)DragonVeinMsg.S2C_OptionInfo_29114.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OptionInfo_29114)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureOptionValIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.optionVal_ = new ArrayList(this.optionVal_);
               this.bitField0_ |= 1;
            }

         }

         public List<OptionVal> getOptionValList() {
            return this.optionValBuilder_ == null ? Collections.unmodifiableList(this.optionVal_) : this.optionValBuilder_.getMessageList();
         }

         public int getOptionValCount() {
            return this.optionValBuilder_ == null ? this.optionVal_.size() : this.optionValBuilder_.getCount();
         }

         public OptionVal getOptionVal(int index) {
            return this.optionValBuilder_ == null ? (OptionVal)this.optionVal_.get(index) : (OptionVal)this.optionValBuilder_.getMessage(index);
         }

         public Builder setOptionVal(int index, OptionVal value) {
            if (this.optionValBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOptionValIsMutable();
               this.optionVal_.set(index, value);
               this.onChanged();
            } else {
               this.optionValBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setOptionVal(int index, OptionVal.Builder builderForValue) {
            if (this.optionValBuilder_ == null) {
               this.ensureOptionValIsMutable();
               this.optionVal_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.optionValBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addOptionVal(OptionVal value) {
            if (this.optionValBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOptionValIsMutable();
               this.optionVal_.add(value);
               this.onChanged();
            } else {
               this.optionValBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addOptionVal(int index, OptionVal value) {
            if (this.optionValBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOptionValIsMutable();
               this.optionVal_.add(index, value);
               this.onChanged();
            } else {
               this.optionValBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addOptionVal(OptionVal.Builder builderForValue) {
            if (this.optionValBuilder_ == null) {
               this.ensureOptionValIsMutable();
               this.optionVal_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.optionValBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addOptionVal(int index, OptionVal.Builder builderForValue) {
            if (this.optionValBuilder_ == null) {
               this.ensureOptionValIsMutable();
               this.optionVal_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.optionValBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllOptionVal(Iterable<? extends OptionVal> values) {
            if (this.optionValBuilder_ == null) {
               this.ensureOptionValIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.optionVal_);
               this.onChanged();
            } else {
               this.optionValBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearOptionVal() {
            if (this.optionValBuilder_ == null) {
               this.optionVal_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.optionValBuilder_.clear();
            }

            return this;
         }

         public Builder removeOptionVal(int index) {
            if (this.optionValBuilder_ == null) {
               this.ensureOptionValIsMutable();
               this.optionVal_.remove(index);
               this.onChanged();
            } else {
               this.optionValBuilder_.remove(index);
            }

            return this;
         }

         public OptionVal.Builder getOptionValBuilder(int index) {
            return (OptionVal.Builder)this.getOptionValFieldBuilder().getBuilder(index);
         }

         public OptionValOrBuilder getOptionValOrBuilder(int index) {
            return this.optionValBuilder_ == null ? (OptionValOrBuilder)this.optionVal_.get(index) : (OptionValOrBuilder)this.optionValBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends OptionValOrBuilder> getOptionValOrBuilderList() {
            return this.optionValBuilder_ != null ? this.optionValBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.optionVal_);
         }

         public OptionVal.Builder addOptionValBuilder() {
            return (OptionVal.Builder)this.getOptionValFieldBuilder().addBuilder(DragonVeinMsg.OptionVal.getDefaultInstance());
         }

         public OptionVal.Builder addOptionValBuilder(int index) {
            return (OptionVal.Builder)this.getOptionValFieldBuilder().addBuilder(index, DragonVeinMsg.OptionVal.getDefaultInstance());
         }

         public List<OptionVal.Builder> getOptionValBuilderList() {
            return this.getOptionValFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<OptionVal, OptionVal.Builder, OptionValOrBuilder> getOptionValFieldBuilder() {
            if (this.optionValBuilder_ == null) {
               this.optionValBuilder_ = new RepeatedFieldBuilderV3(this.optionVal_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.optionVal_ = null;
            }

            return this.optionValBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_CommitOption_29111OrBuilder extends MessageOrBuilder {
      List<OptionVal> getOptionValList();

      OptionVal getOptionVal(int index);

      int getOptionValCount();

      List<? extends OptionValOrBuilder> getOptionValOrBuilderList();

      OptionValOrBuilder getOptionValOrBuilder(int index);
   }

   public interface C2S_DismissSoul_29107OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      int getPosition();

      boolean hasCode();

      int getCode();
   }

   public interface C2S_DragonSoulValUp_29109OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getItemNumList();

      CommonMsg.MapDataII getItemNum(int index);

      int getItemNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getItemNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getItemNumOrBuilder(int index);
   }

   public interface C2S_DragonVeinInfo_29101OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Lottery_29103OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OptionInfo_29113OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PresentSoul_29105OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasIsResolve();

      boolean getIsResolve();
   }

   public interface HeroTypeAttrOrBuilder extends MessageOrBuilder {
      boolean hasHeroType();

      int getHeroType();

      boolean hasType();

      int getType();

      boolean hasWay();

      int getWay();

      boolean hasVal();

      int getVal();
   }

   public interface OptionValOrBuilder extends MessageOrBuilder {
      boolean hasOption();

      OptionEnum getOption();

      boolean hasVal();

      int getVal();
   }

   public interface S2C_CommitOption_29112OrBuilder extends MessageOrBuilder {
      List<OptionVal> getOptionValList();

      OptionVal getOptionVal(int index);

      int getOptionValCount();

      List<? extends OptionValOrBuilder> getOptionValOrBuilderList();

      OptionValOrBuilder getOptionValOrBuilder(int index);
   }

   public interface S2C_DismissSoul_29108OrBuilder extends MessageOrBuilder {
      List<SoulData> getPresentSoulDataList();

      SoulData getPresentSoulData(int index);

      int getPresentSoulDataCount();

      List<? extends SoulDataOrBuilder> getPresentSoulDataOrBuilderList();

      SoulDataOrBuilder getPresentSoulDataOrBuilder(int index);

      List<SoulData> getSurplusSoulDataList();

      SoulData getSurplusSoulData(int index);

      int getSurplusSoulDataCount();

      List<? extends SoulDataOrBuilder> getSurplusSoulDataOrBuilderList();

      SoulDataOrBuilder getSurplusSoulDataOrBuilder(int index);

      boolean hasResolvePosition();

      int getResolvePosition();

      boolean hasDragonVeinLv();

      int getDragonVeinLv();

      boolean hasDragonVeinExp();

      int getDragonVeinExp();
   }

   public interface S2C_DragonSoulValUp_29110OrBuilder extends MessageOrBuilder {
      boolean hasDragonSoulVal();

      int getDragonSoulVal();
   }

   public interface S2C_DragonVeinInfo_29102OrBuilder extends MessageOrBuilder {
      List<SoulData> getPresentSoulDataList();

      SoulData getPresentSoulData(int index);

      int getPresentSoulDataCount();

      List<? extends SoulDataOrBuilder> getPresentSoulDataOrBuilderList();

      SoulDataOrBuilder getPresentSoulDataOrBuilder(int index);

      List<SoulData> getSurplusSoulDataList();

      SoulData getSurplusSoulData(int index);

      int getSurplusSoulDataCount();

      List<? extends SoulDataOrBuilder> getSurplusSoulDataOrBuilderList();

      SoulDataOrBuilder getSurplusSoulDataOrBuilder(int index);

      boolean hasDragonVeinLv();

      int getDragonVeinLv();

      boolean hasDragonVeinExp();

      int getDragonVeinExp();

      boolean hasDragonSoulVal();

      int getDragonSoulVal();
   }

   public interface S2C_Lottery_29104OrBuilder extends MessageOrBuilder {
      boolean hasGotSoul();

      SoulData getGotSoul();

      SoulDataOrBuilder getGotSoulOrBuilder();

      boolean hasDragonVeinLv();

      int getDragonVeinLv();

      boolean hasDragonVeinExp();

      int getDragonVeinExp();

      boolean hasResult();

      int getResult();

      boolean hasTipsCode();

      int getTipsCode();
   }

   public interface S2C_OptionInfo_29114OrBuilder extends MessageOrBuilder {
      List<OptionVal> getOptionValList();

      OptionVal getOptionVal(int index);

      int getOptionValCount();

      List<? extends OptionValOrBuilder> getOptionValOrBuilderList();

      OptionValOrBuilder getOptionValOrBuilder(int index);
   }

   public interface S2C_PresentSoul_29106OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      List<SoulData> getPresentSoulDataList();

      SoulData getPresentSoulData(int index);

      int getPresentSoulDataCount();

      List<? extends SoulDataOrBuilder> getPresentSoulDataOrBuilderList();

      SoulDataOrBuilder getPresentSoulDataOrBuilder(int index);

      List<SoulData> getSurplusSoulDataList();

      SoulData getSurplusSoulData(int index);

      int getSurplusSoulDataCount();

      List<? extends SoulDataOrBuilder> getSurplusSoulDataOrBuilderList();

      SoulDataOrBuilder getSurplusSoulDataOrBuilder(int index);

      boolean hasIsResolve();

      boolean getIsResolve();

      boolean hasDragonVeinLv();

      int getDragonVeinLv();

      boolean hasDragonVeinExp();

      int getDragonVeinExp();
   }

   public interface SoulDataOrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasPosition();

      int getPosition();

      boolean hasSoulLv();

      int getSoulLv();

      boolean hasQuality();

      int getQuality();

      boolean hasScore();

      long getScore();

      List<HeroTypeAttr> getAttrList();

      HeroTypeAttr getAttr(int index);

      int getAttrCount();

      List<? extends HeroTypeAttrOrBuilder> getAttrOrBuilderList();

      HeroTypeAttrOrBuilder getAttrOrBuilder(int index);

      boolean hasGroupSkillId();

      int getGroupSkillId();
   }
}
