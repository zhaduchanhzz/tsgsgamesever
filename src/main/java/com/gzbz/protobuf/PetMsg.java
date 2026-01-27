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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
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

public final class PetMsg {
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_PetOpenUi_12801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_PetOpenUi_12801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_PetOpenUi_12802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_PetOpenUi_12802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_BuyBagLattice_12803_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_BuyBagLattice_12803_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_BuyBagLattice_12804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_BuyBagLattice_12804_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_PetDaoArrayingInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_PetDaoArrayingInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_PetArraying_12805_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_PetArraying_12805_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_PetArraying_12806_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_PetArraying_12806_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_PetArrayingSkill_12807_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_PetArrayingSkill_12807_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_PetArrayingSkill_12808_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_PetArrayingSkill_12808_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_UpdateArrayingInfo_12809_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_UpdateArrayingInfo_12809_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_PetUpLv_12811_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_PetUpLv_12811_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_PetUpLv_12812_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_PetUpLv_12812_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_PetUpStar_12813_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_PetUpStar_12813_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_PetUpStar_12814_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_PetUpStar_12814_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_PetFly_12815_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_PetFly_12815_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_PetFly_12816_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_PetFly_12816_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_PetMerge_12817_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_PetMerge_12817_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_PetMerge_12818_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_PetMerge_12818_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_LeanSkill_12819_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_LeanSkill_12819_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_LeanSkill_12820_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_LeanSkill_12820_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_TransferGroup_12821_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_TransferGroup_12821_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_TransferGroup_12822_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_TransferGroup_12822_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_HatchSoltInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_HatchSoltInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_HatchUi_12841_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_HatchUi_12841_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_HatchUi_12842_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_HatchUi_12842_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_Hatch_12843_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_Hatch_12843_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_Hatch_12844_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_Hatch_12844_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_HatchLvUp_12846_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_HatchLvUp_12846_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_HatchOpen_12847_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_HatchOpen_12847_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_HatchOpen_12848_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_HatchOpen_12848_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_TakeHatchReward_12849_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_TakeHatchReward_12849_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_TakeHatchReward_12850_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_TakeHatchReward_12850_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_HatchAccelerate_12851_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_HatchAccelerate_12851_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_OneKeyHatchAccelerate_12853_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_OneKeyHatchAccelerate_12853_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_OneKeyHatchAccelerate_12854_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_OneKeyHatchAccelerate_12854_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_PetDecompose_12861_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_PetDecompose_12861_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_PetDecompose_12862_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_PetDecompose_12862_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_TakeDictionaryReward_12871_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_TakeDictionaryReward_12871_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_TakeDictionaryReward_12872_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_TakeDictionaryReward_12872_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_UpdateDictionary_12873_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_UpdateDictionary_12873_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_UpdateDictionary_12874_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_UpdateDictionary_12874_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_C2S_PetLock_12875_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_C2S_PetLock_12875_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pet_com_gzbz_protobuf_S2C_PetLock_12876_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pet_com_gzbz_protobuf_S2C_PetLock_12876_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private PetMsg() {
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
      String[] descriptorData = new String[]{"\n\tPet.proto\u0012\u0015pet.com.gzbz.protobuf\u001a\fcommon.proto\"\u0015\n\u0013C2S_PetOpenUi_12801\"í\u0001\n\u0013S2C_PetOpenUi_12802\u0012\u000f\n\u0007hatchLv\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bhatchExp\u0018\u0002 \u0002(\u0005\u00128\n\u0005infos\u0018\u0003 \u0003(\u000b2).pet.com.gzbz.protobuf.PetDaoArrayingInfo\u00128\n\nhatchInfos\u0018\u0004 \u0003(\u000b2$.pet.com.gzbz.protobuf.HatchSoltInfo\u0012(\n\rdictionaryMap\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0015\n\rtakedRewardId\u0018\u0006 \u0003(\u0005\"\u0019\n\u0017C2S_BuyBagLattice_12803\"I\n\u0017S2C_BuyBagLattice_12804\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006buyNum\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006bagNum\u0018\u0003 \u0002(\u0005\"E\n\u0012PetDaoArrayingInfo\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005index\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nskillIndex\u0018\u0003 \u0002(\u0005\"P\n\u0015C2S_PetArraying_12805\u00127\n\u0004info\u0018\u0001 \u0003(\u000b2).pet.com.gzbz.protobuf.PetDaoArrayingInfo\"'\n\u0015S2C_PetArraying_12806\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"C\n\u001aC2S_PetArrayingSkill_12807\u0012%\n\nskillIndex\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\",\n\u001aS2C_PetArrayingSkill_12808\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"X\n\u001cS2C_UpdateArrayingInfo_12809\u00128\n\u0005infos\u0018\u0001 \u0003(\u000b2).pet.com.gzbz.protobuf.PetDaoArrayingInfo\"!\n\u0011C2S_PetUpLv_12811\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"=\n\u0011S2C_PetUpLv_12812\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0003 \u0002(\u0005\"#\n\u0013C2S_PetUpStar_12813\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"A\n\u0013S2C_PetUpStar_12814\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004star\u0018\u0003 \u0002(\u0005\"/\n\u0010C2S_PetFly_12815\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005infos\u0018\u0002 \u0003(\t\"@\n\u0010S2C_PetFly_12816\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006breach\u0018\u0003 \u0002(\u0005\"9\n\u0012C2S_PetMerge_12817\u0012\u0010\n\bmainCode\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tslaveCode\u0018\u0002 \u0002(\u0005\"z\n\u0012S2C_PetMerge_12818\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bmainCode\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tslaveCode\u0018\u0003 \u0002(\u0005\u0012\u0016\n\u000emainSkillIndex\u0018\u0004 \u0003(\u0005\u0012\u0017\n\u000fslaveSkillIndex\u0018\u0005 \u0003(\u0005\"5\n\u0013C2S_LeanSkill_12819\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0002(\u0005\"3\n\u0013S2C_LeanSkill_12820\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\">\n\u0017C2S_TransferGroup_12821\u0012\u0010\n\bmainCode\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tslaveCode\u0018\u0002 \u0002(\u0005\"N\n\u0017S2C_TransferGroup_12822\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bmainCode\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tslaveCode\u0018\u0003 \u0002(\u0005\"U\n\rHatchSoltInfo\u0012\u0010\n\bposition\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005eggId\u0018\u0003 \u0001(\u0005\u0012\u0010\n\bneedTime\u0018\u0004 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0005 \u0001(\u0005\"\u0013\n\u0011C2S_HatchUi_12841\"p\n\u0011S2C_HatchUi_12842\u0012\u000f\n\u0007hatchLv\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bhatchExp\u0018\u0002 \u0002(\u0005\u00128\n\nhatchInfos\u0018\u0003 \u0003(\u000b2$.pet.com.gzbz.protobuf.HatchSoltInfo\"2\n\u000fC2S_Hatch_12843\u0012\u0010\n\bposition\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005eggId\u0018\u0002 \u0002(\u0005\"U\n\u000fS2C_Hatch_12844\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u00122\n\u0004info\u0018\u0003 \u0001(\u000b2$.pet.com.gzbz.protobuf.HatchSoltInfo\".\n\u0013S2C_HatchLvUp_12846\u0012\n\n\u0002lv\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003exp\u0018\u0002 \u0002(\u0005\"'\n\u0013C2S_HatchOpen_12847\u0012\u0010\n\bposition\u0018\u0001 \u0002(\u0005\"Y\n\u0013S2C_HatchOpen_12848\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u00122\n\u0004info\u0018\u0002 \u0002(\u000b2$.pet.com.gzbz.protobuf.HatchSoltInfo\"-\n\u0019C2S_TakeHatchReward_12849\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\"B\n\u0019S2C_TakeHatchReward_12850\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rtakedRewardId\u0018\u0002 \u0003(\u0005\"-\n\u0019C2S_HatchAccelerate_12851\u0012\u0010\n\bposition\u0018\u0001 \u0002(\u0005\"!\n\u001fC2S_OneKeyHatchAccelerate_12853\"f\n\u001fS2C_OneKeyHatchAccelerate_12854\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u00123\n\u0005infos\u0018\u0002 \u0003(\u000b2$.pet.com.gzbz.protobuf.HatchSoltInfo\"'\n\u0016C2S_PetDecompose_12861\u0012\r\n\u0005codes\u0018\u0001 \u0003(\u0005\"7\n\u0016S2C_PetDecompose_12862\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005codes\u0018\u0002 \u0003(\u0005\"/\n\u001eC2S_TakeDictionaryReward_12871\u0012\r\n\u0005petId\u0018\u0001 \u0003(\u0005\"Q\n\u001eS2C_TakeDictionaryReward_12872\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u001f\n\u0004info\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\"\u001c\n\u001aC2S_UpdateDictionary_12873\"=\n\u001aS2C_UpdateDictionary_12874\u0012\u001f\n\u0004info\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\"/\n\u0011C2S_PetLock_12875\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\"?\n\u0011S2C_PetLock_12876\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0003 \u0002(\u0005B\u001d\n\u0011com.gzbz.protobufB\u0006PetMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_pet_com_gzbz_protobuf_C2S_PetOpenUi_12801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_pet_com_gzbz_protobuf_C2S_PetOpenUi_12801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_PetOpenUi_12801_descriptor, new String[0]);
      internal_static_pet_com_gzbz_protobuf_S2C_PetOpenUi_12802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_pet_com_gzbz_protobuf_S2C_PetOpenUi_12802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_PetOpenUi_12802_descriptor, new String[]{"HatchLv", "HatchExp", "Infos", "HatchInfos", "DictionaryMap", "TakedRewardId"});
      internal_static_pet_com_gzbz_protobuf_C2S_BuyBagLattice_12803_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_pet_com_gzbz_protobuf_C2S_BuyBagLattice_12803_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_BuyBagLattice_12803_descriptor, new String[0]);
      internal_static_pet_com_gzbz_protobuf_S2C_BuyBagLattice_12804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_pet_com_gzbz_protobuf_S2C_BuyBagLattice_12804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_BuyBagLattice_12804_descriptor, new String[]{"Result", "BuyNum", "BagNum"});
      internal_static_pet_com_gzbz_protobuf_PetDaoArrayingInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_pet_com_gzbz_protobuf_PetDaoArrayingInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_PetDaoArrayingInfo_descriptor, new String[]{"Code", "Index", "SkillIndex"});
      internal_static_pet_com_gzbz_protobuf_C2S_PetArraying_12805_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_pet_com_gzbz_protobuf_C2S_PetArraying_12805_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_PetArraying_12805_descriptor, new String[]{"Info"});
      internal_static_pet_com_gzbz_protobuf_S2C_PetArraying_12806_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_pet_com_gzbz_protobuf_S2C_PetArraying_12806_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_PetArraying_12806_descriptor, new String[]{"Result"});
      internal_static_pet_com_gzbz_protobuf_C2S_PetArrayingSkill_12807_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_pet_com_gzbz_protobuf_C2S_PetArrayingSkill_12807_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_PetArrayingSkill_12807_descriptor, new String[]{"SkillIndex"});
      internal_static_pet_com_gzbz_protobuf_S2C_PetArrayingSkill_12808_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_pet_com_gzbz_protobuf_S2C_PetArrayingSkill_12808_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_PetArrayingSkill_12808_descriptor, new String[]{"Result"});
      internal_static_pet_com_gzbz_protobuf_S2C_UpdateArrayingInfo_12809_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_pet_com_gzbz_protobuf_S2C_UpdateArrayingInfo_12809_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_UpdateArrayingInfo_12809_descriptor, new String[]{"Infos"});
      internal_static_pet_com_gzbz_protobuf_C2S_PetUpLv_12811_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_pet_com_gzbz_protobuf_C2S_PetUpLv_12811_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_PetUpLv_12811_descriptor, new String[]{"Code"});
      internal_static_pet_com_gzbz_protobuf_S2C_PetUpLv_12812_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_pet_com_gzbz_protobuf_S2C_PetUpLv_12812_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_PetUpLv_12812_descriptor, new String[]{"Result", "Code", "Lv"});
      internal_static_pet_com_gzbz_protobuf_C2S_PetUpStar_12813_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_pet_com_gzbz_protobuf_C2S_PetUpStar_12813_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_PetUpStar_12813_descriptor, new String[]{"Code"});
      internal_static_pet_com_gzbz_protobuf_S2C_PetUpStar_12814_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_pet_com_gzbz_protobuf_S2C_PetUpStar_12814_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_PetUpStar_12814_descriptor, new String[]{"Result", "Code", "Star"});
      internal_static_pet_com_gzbz_protobuf_C2S_PetFly_12815_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_pet_com_gzbz_protobuf_C2S_PetFly_12815_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_PetFly_12815_descriptor, new String[]{"Code", "Infos"});
      internal_static_pet_com_gzbz_protobuf_S2C_PetFly_12816_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_pet_com_gzbz_protobuf_S2C_PetFly_12816_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_PetFly_12816_descriptor, new String[]{"Result", "Code", "Breach"});
      internal_static_pet_com_gzbz_protobuf_C2S_PetMerge_12817_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_pet_com_gzbz_protobuf_C2S_PetMerge_12817_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_PetMerge_12817_descriptor, new String[]{"MainCode", "SlaveCode"});
      internal_static_pet_com_gzbz_protobuf_S2C_PetMerge_12818_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_pet_com_gzbz_protobuf_S2C_PetMerge_12818_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_PetMerge_12818_descriptor, new String[]{"Result", "MainCode", "SlaveCode", "MainSkillIndex", "SlaveSkillIndex"});
      internal_static_pet_com_gzbz_protobuf_C2S_LeanSkill_12819_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_pet_com_gzbz_protobuf_C2S_LeanSkill_12819_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_LeanSkill_12819_descriptor, new String[]{"Code", "ItemCode"});
      internal_static_pet_com_gzbz_protobuf_S2C_LeanSkill_12820_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_pet_com_gzbz_protobuf_S2C_LeanSkill_12820_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_LeanSkill_12820_descriptor, new String[]{"Result", "Code"});
      internal_static_pet_com_gzbz_protobuf_C2S_TransferGroup_12821_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_pet_com_gzbz_protobuf_C2S_TransferGroup_12821_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_TransferGroup_12821_descriptor, new String[]{"MainCode", "SlaveCode"});
      internal_static_pet_com_gzbz_protobuf_S2C_TransferGroup_12822_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_pet_com_gzbz_protobuf_S2C_TransferGroup_12822_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_TransferGroup_12822_descriptor, new String[]{"Result", "MainCode", "SlaveCode"});
      internal_static_pet_com_gzbz_protobuf_HatchSoltInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_pet_com_gzbz_protobuf_HatchSoltInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_HatchSoltInfo_descriptor, new String[]{"Position", "EggId", "NeedTime", "StartTime"});
      internal_static_pet_com_gzbz_protobuf_C2S_HatchUi_12841_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_pet_com_gzbz_protobuf_C2S_HatchUi_12841_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_HatchUi_12841_descriptor, new String[0]);
      internal_static_pet_com_gzbz_protobuf_S2C_HatchUi_12842_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_pet_com_gzbz_protobuf_S2C_HatchUi_12842_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_HatchUi_12842_descriptor, new String[]{"HatchLv", "HatchExp", "HatchInfos"});
      internal_static_pet_com_gzbz_protobuf_C2S_Hatch_12843_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_pet_com_gzbz_protobuf_C2S_Hatch_12843_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_Hatch_12843_descriptor, new String[]{"Position", "EggId"});
      internal_static_pet_com_gzbz_protobuf_S2C_Hatch_12844_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_pet_com_gzbz_protobuf_S2C_Hatch_12844_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_Hatch_12844_descriptor, new String[]{"Result", "Info"});
      internal_static_pet_com_gzbz_protobuf_S2C_HatchLvUp_12846_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_pet_com_gzbz_protobuf_S2C_HatchLvUp_12846_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_HatchLvUp_12846_descriptor, new String[]{"Lv", "Exp"});
      internal_static_pet_com_gzbz_protobuf_C2S_HatchOpen_12847_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_pet_com_gzbz_protobuf_C2S_HatchOpen_12847_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_HatchOpen_12847_descriptor, new String[]{"Position"});
      internal_static_pet_com_gzbz_protobuf_S2C_HatchOpen_12848_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_pet_com_gzbz_protobuf_S2C_HatchOpen_12848_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_HatchOpen_12848_descriptor, new String[]{"Result", "Info"});
      internal_static_pet_com_gzbz_protobuf_C2S_TakeHatchReward_12849_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_pet_com_gzbz_protobuf_C2S_TakeHatchReward_12849_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_TakeHatchReward_12849_descriptor, new String[]{"RewardId"});
      internal_static_pet_com_gzbz_protobuf_S2C_TakeHatchReward_12850_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_pet_com_gzbz_protobuf_S2C_TakeHatchReward_12850_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_TakeHatchReward_12850_descriptor, new String[]{"Result", "TakedRewardId"});
      internal_static_pet_com_gzbz_protobuf_C2S_HatchAccelerate_12851_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_pet_com_gzbz_protobuf_C2S_HatchAccelerate_12851_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_HatchAccelerate_12851_descriptor, new String[]{"Position"});
      internal_static_pet_com_gzbz_protobuf_C2S_OneKeyHatchAccelerate_12853_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_pet_com_gzbz_protobuf_C2S_OneKeyHatchAccelerate_12853_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_OneKeyHatchAccelerate_12853_descriptor, new String[0]);
      internal_static_pet_com_gzbz_protobuf_S2C_OneKeyHatchAccelerate_12854_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_pet_com_gzbz_protobuf_S2C_OneKeyHatchAccelerate_12854_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_OneKeyHatchAccelerate_12854_descriptor, new String[]{"Result", "Infos"});
      internal_static_pet_com_gzbz_protobuf_C2S_PetDecompose_12861_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_pet_com_gzbz_protobuf_C2S_PetDecompose_12861_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_PetDecompose_12861_descriptor, new String[]{"Codes"});
      internal_static_pet_com_gzbz_protobuf_S2C_PetDecompose_12862_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_pet_com_gzbz_protobuf_S2C_PetDecompose_12862_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_PetDecompose_12862_descriptor, new String[]{"Result", "Codes"});
      internal_static_pet_com_gzbz_protobuf_C2S_TakeDictionaryReward_12871_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_pet_com_gzbz_protobuf_C2S_TakeDictionaryReward_12871_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_TakeDictionaryReward_12871_descriptor, new String[]{"PetId"});
      internal_static_pet_com_gzbz_protobuf_S2C_TakeDictionaryReward_12872_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(38);
      internal_static_pet_com_gzbz_protobuf_S2C_TakeDictionaryReward_12872_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_TakeDictionaryReward_12872_descriptor, new String[]{"Result", "Info"});
      internal_static_pet_com_gzbz_protobuf_C2S_UpdateDictionary_12873_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(39);
      internal_static_pet_com_gzbz_protobuf_C2S_UpdateDictionary_12873_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_UpdateDictionary_12873_descriptor, new String[0]);
      internal_static_pet_com_gzbz_protobuf_S2C_UpdateDictionary_12874_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(40);
      internal_static_pet_com_gzbz_protobuf_S2C_UpdateDictionary_12874_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_UpdateDictionary_12874_descriptor, new String[]{"Info"});
      internal_static_pet_com_gzbz_protobuf_C2S_PetLock_12875_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(41);
      internal_static_pet_com_gzbz_protobuf_C2S_PetLock_12875_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_C2S_PetLock_12875_descriptor, new String[]{"Code", "Type"});
      internal_static_pet_com_gzbz_protobuf_S2C_PetLock_12876_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(42);
      internal_static_pet_com_gzbz_protobuf_S2C_PetLock_12876_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pet_com_gzbz_protobuf_S2C_PetLock_12876_descriptor, new String[]{"Result", "Code", "Type"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_PetOpenUi_12801 extends GeneratedMessageV3 implements C2S_PetOpenUi_12801OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_PetOpenUi_12801 DEFAULT_INSTANCE = new C2S_PetOpenUi_12801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PetOpenUi_12801> PARSER = new AbstractParser<C2S_PetOpenUi_12801>() {
         public C2S_PetOpenUi_12801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PetOpenUi_12801(input, extensionRegistry);
         }
      };

      private C2S_PetOpenUi_12801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PetOpenUi_12801() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PetOpenUi_12801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PetOpenUi_12801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetOpenUi_12801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetOpenUi_12801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetOpenUi_12801.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PetOpenUi_12801)) {
            return super.equals(obj);
         } else {
            C2S_PetOpenUi_12801 other = (C2S_PetOpenUi_12801)obj;
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

      public static C2S_PetOpenUi_12801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PetOpenUi_12801)PARSER.parseFrom(data);
      }

      public static C2S_PetOpenUi_12801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetOpenUi_12801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetOpenUi_12801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PetOpenUi_12801)PARSER.parseFrom(data);
      }

      public static C2S_PetOpenUi_12801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetOpenUi_12801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetOpenUi_12801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PetOpenUi_12801)PARSER.parseFrom(data);
      }

      public static C2S_PetOpenUi_12801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetOpenUi_12801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetOpenUi_12801 parseFrom(InputStream input) throws IOException {
         return (C2S_PetOpenUi_12801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetOpenUi_12801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetOpenUi_12801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetOpenUi_12801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PetOpenUi_12801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PetOpenUi_12801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetOpenUi_12801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetOpenUi_12801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PetOpenUi_12801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetOpenUi_12801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetOpenUi_12801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PetOpenUi_12801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PetOpenUi_12801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PetOpenUi_12801> parser() {
         return PARSER;
      }

      public Parser<C2S_PetOpenUi_12801> getParserForType() {
         return PARSER;
      }

      public C2S_PetOpenUi_12801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PetOpenUi_12801OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetOpenUi_12801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetOpenUi_12801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetOpenUi_12801.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_PetOpenUi_12801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetOpenUi_12801_descriptor;
         }

         public C2S_PetOpenUi_12801 getDefaultInstanceForType() {
            return PetMsg.C2S_PetOpenUi_12801.getDefaultInstance();
         }

         public C2S_PetOpenUi_12801 build() {
            C2S_PetOpenUi_12801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PetOpenUi_12801 buildPartial() {
            C2S_PetOpenUi_12801 result = new C2S_PetOpenUi_12801(this);
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
            if (other instanceof C2S_PetOpenUi_12801) {
               return this.mergeFrom((C2S_PetOpenUi_12801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PetOpenUi_12801 other) {
            if (other == PetMsg.C2S_PetOpenUi_12801.getDefaultInstance()) {
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
            C2S_PetOpenUi_12801 parsedMessage = null;

            try {
               parsedMessage = (C2S_PetOpenUi_12801)PetMsg.C2S_PetOpenUi_12801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PetOpenUi_12801)e.getUnfinishedMessage();
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

   public static final class S2C_PetOpenUi_12802 extends GeneratedMessageV3 implements S2C_PetOpenUi_12802OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HATCHLV_FIELD_NUMBER = 1;
      private int hatchLv_;
      public static final int HATCHEXP_FIELD_NUMBER = 2;
      private int hatchExp_;
      public static final int INFOS_FIELD_NUMBER = 3;
      private List<PetDaoArrayingInfo> infos_;
      public static final int HATCHINFOS_FIELD_NUMBER = 4;
      private List<HatchSoltInfo> hatchInfos_;
      public static final int DICTIONARYMAP_FIELD_NUMBER = 5;
      private List<CommonMsg.MapDataII> dictionaryMap_;
      public static final int TAKEDREWARDID_FIELD_NUMBER = 6;
      private Internal.IntList takedRewardId_;
      private byte memoizedIsInitialized;
      private static final S2C_PetOpenUi_12802 DEFAULT_INSTANCE = new S2C_PetOpenUi_12802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PetOpenUi_12802> PARSER = new AbstractParser<S2C_PetOpenUi_12802>() {
         public S2C_PetOpenUi_12802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PetOpenUi_12802(input, extensionRegistry);
         }
      };

      private S2C_PetOpenUi_12802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PetOpenUi_12802() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
         this.hatchInfos_ = Collections.emptyList();
         this.dictionaryMap_ = Collections.emptyList();
         this.takedRewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PetOpenUi_12802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PetOpenUi_12802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hatchLv_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.hatchExp_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.infos_.add(input.readMessage(PetMsg.PetDaoArrayingInfo.PARSER, extensionRegistry));
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.hatchInfos_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.hatchInfos_.add(input.readMessage(PetMsg.HatchSoltInfo.PARSER, extensionRegistry));
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.dictionaryMap_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.dictionaryMap_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 48:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.takedRewardId_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }

                        this.takedRewardId_.addInt(input.readInt32());
                        break;
                     case 50:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 32) == 0 && input.getBytesUntilLimit() > 0) {
                           this.takedRewardId_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.takedRewardId_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 4) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.hatchInfos_ = Collections.unmodifiableList(this.hatchInfos_);
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.dictionaryMap_ = Collections.unmodifiableList(this.dictionaryMap_);
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.takedRewardId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetOpenUi_12802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetOpenUi_12802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetOpenUi_12802.class, Builder.class);
      }

      public boolean hasHatchLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHatchLv() {
         return this.hatchLv_;
      }

      public boolean hasHatchExp() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHatchExp() {
         return this.hatchExp_;
      }

      public List<PetDaoArrayingInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends PetDaoArrayingInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public PetDaoArrayingInfo getInfos(int index) {
         return (PetDaoArrayingInfo)this.infos_.get(index);
      }

      public PetDaoArrayingInfoOrBuilder getInfosOrBuilder(int index) {
         return (PetDaoArrayingInfoOrBuilder)this.infos_.get(index);
      }

      public List<HatchSoltInfo> getHatchInfosList() {
         return this.hatchInfos_;
      }

      public List<? extends HatchSoltInfoOrBuilder> getHatchInfosOrBuilderList() {
         return this.hatchInfos_;
      }

      public int getHatchInfosCount() {
         return this.hatchInfos_.size();
      }

      public HatchSoltInfo getHatchInfos(int index) {
         return (HatchSoltInfo)this.hatchInfos_.get(index);
      }

      public HatchSoltInfoOrBuilder getHatchInfosOrBuilder(int index) {
         return (HatchSoltInfoOrBuilder)this.hatchInfos_.get(index);
      }

      public List<CommonMsg.MapDataII> getDictionaryMapList() {
         return this.dictionaryMap_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getDictionaryMapOrBuilderList() {
         return this.dictionaryMap_;
      }

      public int getDictionaryMapCount() {
         return this.dictionaryMap_.size();
      }

      public CommonMsg.MapDataII getDictionaryMap(int index) {
         return (CommonMsg.MapDataII)this.dictionaryMap_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getDictionaryMapOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.dictionaryMap_.get(index);
      }

      public List<Integer> getTakedRewardIdList() {
         return this.takedRewardId_;
      }

      public int getTakedRewardIdCount() {
         return this.takedRewardId_.size();
      }

      public int getTakedRewardId(int index) {
         return this.takedRewardId_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHatchLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHatchExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getHatchInfosCount(); ++i) {
               if (!this.getHatchInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getDictionaryMapCount(); ++i) {
               if (!this.getDictionaryMap(i).isInitialized()) {
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
            output.writeInt32(1, this.hatchLv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.hatchExp_);
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.infos_.get(i));
         }

         for(int i = 0; i < this.hatchInfos_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.hatchInfos_.get(i));
         }

         for(int i = 0; i < this.dictionaryMap_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.dictionaryMap_.get(i));
         }

         for(int i = 0; i < this.takedRewardId_.size(); ++i) {
            output.writeInt32(6, this.takedRewardId_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.hatchLv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.hatchExp_);
            }

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.infos_.get(i));
            }

            for(int i = 0; i < this.hatchInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.hatchInfos_.get(i));
            }

            for(int i = 0; i < this.dictionaryMap_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.dictionaryMap_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.takedRewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.takedRewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTakedRewardIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PetOpenUi_12802)) {
            return super.equals(obj);
         } else {
            S2C_PetOpenUi_12802 other = (S2C_PetOpenUi_12802)obj;
            if (this.hasHatchLv() != other.hasHatchLv()) {
               return false;
            } else if (this.hasHatchLv() && this.getHatchLv() != other.getHatchLv()) {
               return false;
            } else if (this.hasHatchExp() != other.hasHatchExp()) {
               return false;
            } else if (this.hasHatchExp() && this.getHatchExp() != other.getHatchExp()) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else if (!this.getHatchInfosList().equals(other.getHatchInfosList())) {
               return false;
            } else if (!this.getDictionaryMapList().equals(other.getDictionaryMapList())) {
               return false;
            } else if (!this.getTakedRewardIdList().equals(other.getTakedRewardIdList())) {
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
            if (this.hasHatchLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHatchLv();
            }

            if (this.hasHatchExp()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHatchExp();
            }

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            if (this.getHatchInfosCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHatchInfosList().hashCode();
            }

            if (this.getDictionaryMapCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDictionaryMapList().hashCode();
            }

            if (this.getTakedRewardIdCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getTakedRewardIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PetOpenUi_12802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PetOpenUi_12802)PARSER.parseFrom(data);
      }

      public static S2C_PetOpenUi_12802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetOpenUi_12802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetOpenUi_12802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PetOpenUi_12802)PARSER.parseFrom(data);
      }

      public static S2C_PetOpenUi_12802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetOpenUi_12802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetOpenUi_12802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PetOpenUi_12802)PARSER.parseFrom(data);
      }

      public static S2C_PetOpenUi_12802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetOpenUi_12802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetOpenUi_12802 parseFrom(InputStream input) throws IOException {
         return (S2C_PetOpenUi_12802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetOpenUi_12802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetOpenUi_12802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetOpenUi_12802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PetOpenUi_12802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PetOpenUi_12802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetOpenUi_12802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetOpenUi_12802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PetOpenUi_12802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetOpenUi_12802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetOpenUi_12802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PetOpenUi_12802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PetOpenUi_12802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PetOpenUi_12802> parser() {
         return PARSER;
      }

      public Parser<S2C_PetOpenUi_12802> getParserForType() {
         return PARSER;
      }

      public S2C_PetOpenUi_12802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PetOpenUi_12802OrBuilder {
         private int bitField0_;
         private int hatchLv_;
         private int hatchExp_;
         private List<PetDaoArrayingInfo> infos_;
         private RepeatedFieldBuilderV3<PetDaoArrayingInfo, PetDaoArrayingInfo.Builder, PetDaoArrayingInfoOrBuilder> infosBuilder_;
         private List<HatchSoltInfo> hatchInfos_;
         private RepeatedFieldBuilderV3<HatchSoltInfo, HatchSoltInfo.Builder, HatchSoltInfoOrBuilder> hatchInfosBuilder_;
         private List<CommonMsg.MapDataII> dictionaryMap_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> dictionaryMapBuilder_;
         private Internal.IntList takedRewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetOpenUi_12802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetOpenUi_12802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetOpenUi_12802.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.hatchInfos_ = Collections.emptyList();
            this.dictionaryMap_ = Collections.emptyList();
            this.takedRewardId_ = PetMsg.S2C_PetOpenUi_12802.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.hatchInfos_ = Collections.emptyList();
            this.dictionaryMap_ = Collections.emptyList();
            this.takedRewardId_ = PetMsg.S2C_PetOpenUi_12802.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_PetOpenUi_12802.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
               this.getHatchInfosFieldBuilder();
               this.getDictionaryMapFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.hatchLv_ = 0;
            this.bitField0_ &= -2;
            this.hatchExp_ = 0;
            this.bitField0_ &= -3;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.infosBuilder_.clear();
            }

            if (this.hatchInfosBuilder_ == null) {
               this.hatchInfos_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.hatchInfosBuilder_.clear();
            }

            if (this.dictionaryMapBuilder_ == null) {
               this.dictionaryMap_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.dictionaryMapBuilder_.clear();
            }

            this.takedRewardId_ = PetMsg.S2C_PetOpenUi_12802.emptyIntList();
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetOpenUi_12802_descriptor;
         }

         public S2C_PetOpenUi_12802 getDefaultInstanceForType() {
            return PetMsg.S2C_PetOpenUi_12802.getDefaultInstance();
         }

         public S2C_PetOpenUi_12802 build() {
            S2C_PetOpenUi_12802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PetOpenUi_12802 buildPartial() {
            S2C_PetOpenUi_12802 result = new S2C_PetOpenUi_12802(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hatchLv_ = this.hatchLv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hatchExp_ = this.hatchExp_;
               to_bitField0_ |= 2;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -5;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
            }

            if (this.hatchInfosBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.hatchInfos_ = Collections.unmodifiableList(this.hatchInfos_);
                  this.bitField0_ &= -9;
               }

               result.hatchInfos_ = this.hatchInfos_;
            } else {
               result.hatchInfos_ = this.hatchInfosBuilder_.build();
            }

            if (this.dictionaryMapBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.dictionaryMap_ = Collections.unmodifiableList(this.dictionaryMap_);
                  this.bitField0_ &= -17;
               }

               result.dictionaryMap_ = this.dictionaryMap_;
            } else {
               result.dictionaryMap_ = this.dictionaryMapBuilder_.build();
            }

            if ((this.bitField0_ & 32) != 0) {
               this.takedRewardId_.makeImmutable();
               this.bitField0_ &= -33;
            }

            result.takedRewardId_ = this.takedRewardId_;
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
            if (other instanceof S2C_PetOpenUi_12802) {
               return this.mergeFrom((S2C_PetOpenUi_12802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PetOpenUi_12802 other) {
            if (other == PetMsg.S2C_PetOpenUi_12802.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHatchLv()) {
                  this.setHatchLv(other.getHatchLv());
               }

               if (other.hasHatchExp()) {
                  this.setHatchExp(other.getHatchExp());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -5;
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
                     this.bitField0_ &= -5;
                     this.infosBuilder_ = PetMsg.S2C_PetOpenUi_12802.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               if (this.hatchInfosBuilder_ == null) {
                  if (!other.hatchInfos_.isEmpty()) {
                     if (this.hatchInfos_.isEmpty()) {
                        this.hatchInfos_ = other.hatchInfos_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureHatchInfosIsMutable();
                        this.hatchInfos_.addAll(other.hatchInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.hatchInfos_.isEmpty()) {
                  if (this.hatchInfosBuilder_.isEmpty()) {
                     this.hatchInfosBuilder_.dispose();
                     this.hatchInfosBuilder_ = null;
                     this.hatchInfos_ = other.hatchInfos_;
                     this.bitField0_ &= -9;
                     this.hatchInfosBuilder_ = PetMsg.S2C_PetOpenUi_12802.alwaysUseFieldBuilders ? this.getHatchInfosFieldBuilder() : null;
                  } else {
                     this.hatchInfosBuilder_.addAllMessages(other.hatchInfos_);
                  }
               }

               if (this.dictionaryMapBuilder_ == null) {
                  if (!other.dictionaryMap_.isEmpty()) {
                     if (this.dictionaryMap_.isEmpty()) {
                        this.dictionaryMap_ = other.dictionaryMap_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureDictionaryMapIsMutable();
                        this.dictionaryMap_.addAll(other.dictionaryMap_);
                     }

                     this.onChanged();
                  }
               } else if (!other.dictionaryMap_.isEmpty()) {
                  if (this.dictionaryMapBuilder_.isEmpty()) {
                     this.dictionaryMapBuilder_.dispose();
                     this.dictionaryMapBuilder_ = null;
                     this.dictionaryMap_ = other.dictionaryMap_;
                     this.bitField0_ &= -17;
                     this.dictionaryMapBuilder_ = PetMsg.S2C_PetOpenUi_12802.alwaysUseFieldBuilders ? this.getDictionaryMapFieldBuilder() : null;
                  } else {
                     this.dictionaryMapBuilder_.addAllMessages(other.dictionaryMap_);
                  }
               }

               if (!other.takedRewardId_.isEmpty()) {
                  if (this.takedRewardId_.isEmpty()) {
                     this.takedRewardId_ = other.takedRewardId_;
                     this.bitField0_ &= -33;
                  } else {
                     this.ensureTakedRewardIdIsMutable();
                     this.takedRewardId_.addAll(other.takedRewardId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHatchLv()) {
               return false;
            } else if (!this.hasHatchExp()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfosCount(); ++i) {
                  if (!this.getInfos(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getHatchInfosCount(); ++i) {
                  if (!this.getHatchInfos(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getDictionaryMapCount(); ++i) {
                  if (!this.getDictionaryMap(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PetOpenUi_12802 parsedMessage = null;

            try {
               parsedMessage = (S2C_PetOpenUi_12802)PetMsg.S2C_PetOpenUi_12802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PetOpenUi_12802)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHatchLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHatchLv() {
            return this.hatchLv_;
         }

         public Builder setHatchLv(int value) {
            this.bitField0_ |= 1;
            this.hatchLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHatchLv() {
            this.bitField0_ &= -2;
            this.hatchLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHatchExp() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHatchExp() {
            return this.hatchExp_;
         }

         public Builder setHatchExp(int value) {
            this.bitField0_ |= 2;
            this.hatchExp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHatchExp() {
            this.bitField0_ &= -3;
            this.hatchExp_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 4;
            }

         }

         public List<PetDaoArrayingInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public PetDaoArrayingInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (PetDaoArrayingInfo)this.infos_.get(index) : (PetDaoArrayingInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, PetDaoArrayingInfo value) {
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

         public Builder setInfos(int index, PetDaoArrayingInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(PetDaoArrayingInfo value) {
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

         public Builder addInfos(int index, PetDaoArrayingInfo value) {
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

         public Builder addInfos(PetDaoArrayingInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, PetDaoArrayingInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends PetDaoArrayingInfo> values) {
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
               this.bitField0_ &= -5;
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

         public PetDaoArrayingInfo.Builder getInfosBuilder(int index) {
            return (PetDaoArrayingInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public PetDaoArrayingInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (PetDaoArrayingInfoOrBuilder)this.infos_.get(index) : (PetDaoArrayingInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PetDaoArrayingInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public PetDaoArrayingInfo.Builder addInfosBuilder() {
            return (PetDaoArrayingInfo.Builder)this.getInfosFieldBuilder().addBuilder(PetMsg.PetDaoArrayingInfo.getDefaultInstance());
         }

         public PetDaoArrayingInfo.Builder addInfosBuilder(int index) {
            return (PetDaoArrayingInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, PetMsg.PetDaoArrayingInfo.getDefaultInstance());
         }

         public List<PetDaoArrayingInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PetDaoArrayingInfo, PetDaoArrayingInfo.Builder, PetDaoArrayingInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         private void ensureHatchInfosIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.hatchInfos_ = new ArrayList(this.hatchInfos_);
               this.bitField0_ |= 8;
            }

         }

         public List<HatchSoltInfo> getHatchInfosList() {
            return this.hatchInfosBuilder_ == null ? Collections.unmodifiableList(this.hatchInfos_) : this.hatchInfosBuilder_.getMessageList();
         }

         public int getHatchInfosCount() {
            return this.hatchInfosBuilder_ == null ? this.hatchInfos_.size() : this.hatchInfosBuilder_.getCount();
         }

         public HatchSoltInfo getHatchInfos(int index) {
            return this.hatchInfosBuilder_ == null ? (HatchSoltInfo)this.hatchInfos_.get(index) : (HatchSoltInfo)this.hatchInfosBuilder_.getMessage(index);
         }

         public Builder setHatchInfos(int index, HatchSoltInfo value) {
            if (this.hatchInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHatchInfosIsMutable();
               this.hatchInfos_.set(index, value);
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHatchInfos(int index, HatchSoltInfo.Builder builderForValue) {
            if (this.hatchInfosBuilder_ == null) {
               this.ensureHatchInfosIsMutable();
               this.hatchInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHatchInfos(HatchSoltInfo value) {
            if (this.hatchInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHatchInfosIsMutable();
               this.hatchInfos_.add(value);
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHatchInfos(int index, HatchSoltInfo value) {
            if (this.hatchInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHatchInfosIsMutable();
               this.hatchInfos_.add(index, value);
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHatchInfos(HatchSoltInfo.Builder builderForValue) {
            if (this.hatchInfosBuilder_ == null) {
               this.ensureHatchInfosIsMutable();
               this.hatchInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHatchInfos(int index, HatchSoltInfo.Builder builderForValue) {
            if (this.hatchInfosBuilder_ == null) {
               this.ensureHatchInfosIsMutable();
               this.hatchInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHatchInfos(Iterable<? extends HatchSoltInfo> values) {
            if (this.hatchInfosBuilder_ == null) {
               this.ensureHatchInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hatchInfos_);
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHatchInfos() {
            if (this.hatchInfosBuilder_ == null) {
               this.hatchInfos_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removeHatchInfos(int index) {
            if (this.hatchInfosBuilder_ == null) {
               this.ensureHatchInfosIsMutable();
               this.hatchInfos_.remove(index);
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.remove(index);
            }

            return this;
         }

         public HatchSoltInfo.Builder getHatchInfosBuilder(int index) {
            return (HatchSoltInfo.Builder)this.getHatchInfosFieldBuilder().getBuilder(index);
         }

         public HatchSoltInfoOrBuilder getHatchInfosOrBuilder(int index) {
            return this.hatchInfosBuilder_ == null ? (HatchSoltInfoOrBuilder)this.hatchInfos_.get(index) : (HatchSoltInfoOrBuilder)this.hatchInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HatchSoltInfoOrBuilder> getHatchInfosOrBuilderList() {
            return this.hatchInfosBuilder_ != null ? this.hatchInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.hatchInfos_);
         }

         public HatchSoltInfo.Builder addHatchInfosBuilder() {
            return (HatchSoltInfo.Builder)this.getHatchInfosFieldBuilder().addBuilder(PetMsg.HatchSoltInfo.getDefaultInstance());
         }

         public HatchSoltInfo.Builder addHatchInfosBuilder(int index) {
            return (HatchSoltInfo.Builder)this.getHatchInfosFieldBuilder().addBuilder(index, PetMsg.HatchSoltInfo.getDefaultInstance());
         }

         public List<HatchSoltInfo.Builder> getHatchInfosBuilderList() {
            return this.getHatchInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HatchSoltInfo, HatchSoltInfo.Builder, HatchSoltInfoOrBuilder> getHatchInfosFieldBuilder() {
            if (this.hatchInfosBuilder_ == null) {
               this.hatchInfosBuilder_ = new RepeatedFieldBuilderV3(this.hatchInfos_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.hatchInfos_ = null;
            }

            return this.hatchInfosBuilder_;
         }

         private void ensureDictionaryMapIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.dictionaryMap_ = new ArrayList(this.dictionaryMap_);
               this.bitField0_ |= 16;
            }

         }

         public List<CommonMsg.MapDataII> getDictionaryMapList() {
            return this.dictionaryMapBuilder_ == null ? Collections.unmodifiableList(this.dictionaryMap_) : this.dictionaryMapBuilder_.getMessageList();
         }

         public int getDictionaryMapCount() {
            return this.dictionaryMapBuilder_ == null ? this.dictionaryMap_.size() : this.dictionaryMapBuilder_.getCount();
         }

         public CommonMsg.MapDataII getDictionaryMap(int index) {
            return this.dictionaryMapBuilder_ == null ? (CommonMsg.MapDataII)this.dictionaryMap_.get(index) : (CommonMsg.MapDataII)this.dictionaryMapBuilder_.getMessage(index);
         }

         public Builder setDictionaryMap(int index, CommonMsg.MapDataII value) {
            if (this.dictionaryMapBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDictionaryMapIsMutable();
               this.dictionaryMap_.set(index, value);
               this.onChanged();
            } else {
               this.dictionaryMapBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setDictionaryMap(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.dictionaryMapBuilder_ == null) {
               this.ensureDictionaryMapIsMutable();
               this.dictionaryMap_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dictionaryMapBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addDictionaryMap(CommonMsg.MapDataII value) {
            if (this.dictionaryMapBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDictionaryMapIsMutable();
               this.dictionaryMap_.add(value);
               this.onChanged();
            } else {
               this.dictionaryMapBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addDictionaryMap(int index, CommonMsg.MapDataII value) {
            if (this.dictionaryMapBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDictionaryMapIsMutable();
               this.dictionaryMap_.add(index, value);
               this.onChanged();
            } else {
               this.dictionaryMapBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addDictionaryMap(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.dictionaryMapBuilder_ == null) {
               this.ensureDictionaryMapIsMutable();
               this.dictionaryMap_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.dictionaryMapBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addDictionaryMap(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.dictionaryMapBuilder_ == null) {
               this.ensureDictionaryMapIsMutable();
               this.dictionaryMap_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dictionaryMapBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllDictionaryMap(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.dictionaryMapBuilder_ == null) {
               this.ensureDictionaryMapIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.dictionaryMap_);
               this.onChanged();
            } else {
               this.dictionaryMapBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearDictionaryMap() {
            if (this.dictionaryMapBuilder_ == null) {
               this.dictionaryMap_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.dictionaryMapBuilder_.clear();
            }

            return this;
         }

         public Builder removeDictionaryMap(int index) {
            if (this.dictionaryMapBuilder_ == null) {
               this.ensureDictionaryMapIsMutable();
               this.dictionaryMap_.remove(index);
               this.onChanged();
            } else {
               this.dictionaryMapBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getDictionaryMapBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getDictionaryMapFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getDictionaryMapOrBuilder(int index) {
            return this.dictionaryMapBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.dictionaryMap_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.dictionaryMapBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getDictionaryMapOrBuilderList() {
            return this.dictionaryMapBuilder_ != null ? this.dictionaryMapBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.dictionaryMap_);
         }

         public CommonMsg.MapDataII.Builder addDictionaryMapBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getDictionaryMapFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addDictionaryMapBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getDictionaryMapFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getDictionaryMapBuilderList() {
            return this.getDictionaryMapFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getDictionaryMapFieldBuilder() {
            if (this.dictionaryMapBuilder_ == null) {
               this.dictionaryMapBuilder_ = new RepeatedFieldBuilderV3(this.dictionaryMap_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.dictionaryMap_ = null;
            }

            return this.dictionaryMapBuilder_;
         }

         private void ensureTakedRewardIdIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.takedRewardId_ = PetMsg.S2C_PetOpenUi_12802.mutableCopy(this.takedRewardId_);
               this.bitField0_ |= 32;
            }

         }

         public List<Integer> getTakedRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 32) != 0 ? Collections.unmodifiableList(this.takedRewardId_) : this.takedRewardId_);
         }

         public int getTakedRewardIdCount() {
            return this.takedRewardId_.size();
         }

         public int getTakedRewardId(int index) {
            return this.takedRewardId_.getInt(index);
         }

         public Builder setTakedRewardId(int index, int value) {
            this.ensureTakedRewardIdIsMutable();
            this.takedRewardId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTakedRewardId(int value) {
            this.ensureTakedRewardIdIsMutable();
            this.takedRewardId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTakedRewardId(Iterable<? extends Integer> values) {
            this.ensureTakedRewardIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.takedRewardId_);
            this.onChanged();
            return this;
         }

         public Builder clearTakedRewardId() {
            this.takedRewardId_ = PetMsg.S2C_PetOpenUi_12802.emptyIntList();
            this.bitField0_ &= -33;
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

   public static final class C2S_BuyBagLattice_12803 extends GeneratedMessageV3 implements C2S_BuyBagLattice_12803OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BuyBagLattice_12803 DEFAULT_INSTANCE = new C2S_BuyBagLattice_12803();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyBagLattice_12803> PARSER = new AbstractParser<C2S_BuyBagLattice_12803>() {
         public C2S_BuyBagLattice_12803 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyBagLattice_12803(input, extensionRegistry);
         }
      };

      private C2S_BuyBagLattice_12803(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyBagLattice_12803() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyBagLattice_12803();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyBagLattice_12803(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_BuyBagLattice_12803_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_BuyBagLattice_12803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyBagLattice_12803.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BuyBagLattice_12803)) {
            return super.equals(obj);
         } else {
            C2S_BuyBagLattice_12803 other = (C2S_BuyBagLattice_12803)obj;
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

      public static C2S_BuyBagLattice_12803 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyBagLattice_12803)PARSER.parseFrom(data);
      }

      public static C2S_BuyBagLattice_12803 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyBagLattice_12803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyBagLattice_12803 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyBagLattice_12803)PARSER.parseFrom(data);
      }

      public static C2S_BuyBagLattice_12803 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyBagLattice_12803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyBagLattice_12803 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyBagLattice_12803)PARSER.parseFrom(data);
      }

      public static C2S_BuyBagLattice_12803 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyBagLattice_12803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyBagLattice_12803 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyBagLattice_12803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyBagLattice_12803 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyBagLattice_12803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyBagLattice_12803 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyBagLattice_12803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyBagLattice_12803 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyBagLattice_12803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyBagLattice_12803 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyBagLattice_12803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyBagLattice_12803 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyBagLattice_12803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyBagLattice_12803 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyBagLattice_12803 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyBagLattice_12803> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyBagLattice_12803> getParserForType() {
         return PARSER;
      }

      public C2S_BuyBagLattice_12803 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyBagLattice_12803OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_BuyBagLattice_12803_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_BuyBagLattice_12803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyBagLattice_12803.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_BuyBagLattice_12803.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_BuyBagLattice_12803_descriptor;
         }

         public C2S_BuyBagLattice_12803 getDefaultInstanceForType() {
            return PetMsg.C2S_BuyBagLattice_12803.getDefaultInstance();
         }

         public C2S_BuyBagLattice_12803 build() {
            C2S_BuyBagLattice_12803 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyBagLattice_12803 buildPartial() {
            C2S_BuyBagLattice_12803 result = new C2S_BuyBagLattice_12803(this);
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
            if (other instanceof C2S_BuyBagLattice_12803) {
               return this.mergeFrom((C2S_BuyBagLattice_12803)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyBagLattice_12803 other) {
            if (other == PetMsg.C2S_BuyBagLattice_12803.getDefaultInstance()) {
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
            C2S_BuyBagLattice_12803 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyBagLattice_12803)PetMsg.C2S_BuyBagLattice_12803.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyBagLattice_12803)e.getUnfinishedMessage();
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

   public static final class S2C_BuyBagLattice_12804 extends GeneratedMessageV3 implements S2C_BuyBagLattice_12804OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int BUYNUM_FIELD_NUMBER = 2;
      private int buyNum_;
      public static final int BAGNUM_FIELD_NUMBER = 3;
      private int bagNum_;
      private byte memoizedIsInitialized;
      private static final S2C_BuyBagLattice_12804 DEFAULT_INSTANCE = new S2C_BuyBagLattice_12804();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BuyBagLattice_12804> PARSER = new AbstractParser<S2C_BuyBagLattice_12804>() {
         public S2C_BuyBagLattice_12804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BuyBagLattice_12804(input, extensionRegistry);
         }
      };

      private S2C_BuyBagLattice_12804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BuyBagLattice_12804() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BuyBagLattice_12804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BuyBagLattice_12804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyNum_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.bagNum_ = input.readInt32();
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_BuyBagLattice_12804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_BuyBagLattice_12804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyBagLattice_12804.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasBuyNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyNum() {
         return this.buyNum_;
      }

      public boolean hasBagNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBagNum() {
         return this.bagNum_;
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
         } else if (!this.hasBuyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBagNum()) {
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
            output.writeInt32(2, this.buyNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.bagNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.buyNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.bagNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BuyBagLattice_12804)) {
            return super.equals(obj);
         } else {
            S2C_BuyBagLattice_12804 other = (S2C_BuyBagLattice_12804)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasBuyNum() != other.hasBuyNum()) {
               return false;
            } else if (this.hasBuyNum() && this.getBuyNum() != other.getBuyNum()) {
               return false;
            } else if (this.hasBagNum() != other.hasBagNum()) {
               return false;
            } else if (this.hasBagNum() && this.getBagNum() != other.getBagNum()) {
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

            if (this.hasBuyNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyNum();
            }

            if (this.hasBagNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBagNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BuyBagLattice_12804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BuyBagLattice_12804)PARSER.parseFrom(data);
      }

      public static S2C_BuyBagLattice_12804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyBagLattice_12804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyBagLattice_12804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BuyBagLattice_12804)PARSER.parseFrom(data);
      }

      public static S2C_BuyBagLattice_12804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyBagLattice_12804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyBagLattice_12804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BuyBagLattice_12804)PARSER.parseFrom(data);
      }

      public static S2C_BuyBagLattice_12804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyBagLattice_12804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyBagLattice_12804 parseFrom(InputStream input) throws IOException {
         return (S2C_BuyBagLattice_12804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyBagLattice_12804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyBagLattice_12804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyBagLattice_12804 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BuyBagLattice_12804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BuyBagLattice_12804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyBagLattice_12804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyBagLattice_12804 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BuyBagLattice_12804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyBagLattice_12804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyBagLattice_12804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BuyBagLattice_12804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BuyBagLattice_12804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BuyBagLattice_12804> parser() {
         return PARSER;
      }

      public Parser<S2C_BuyBagLattice_12804> getParserForType() {
         return PARSER;
      }

      public S2C_BuyBagLattice_12804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BuyBagLattice_12804OrBuilder {
         private int bitField0_;
         private int result_;
         private int buyNum_;
         private int bagNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_BuyBagLattice_12804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_BuyBagLattice_12804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyBagLattice_12804.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_BuyBagLattice_12804.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.buyNum_ = 0;
            this.bitField0_ &= -3;
            this.bagNum_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_BuyBagLattice_12804_descriptor;
         }

         public S2C_BuyBagLattice_12804 getDefaultInstanceForType() {
            return PetMsg.S2C_BuyBagLattice_12804.getDefaultInstance();
         }

         public S2C_BuyBagLattice_12804 build() {
            S2C_BuyBagLattice_12804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BuyBagLattice_12804 buildPartial() {
            S2C_BuyBagLattice_12804 result = new S2C_BuyBagLattice_12804(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyNum_ = this.buyNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.bagNum_ = this.bagNum_;
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
            if (other instanceof S2C_BuyBagLattice_12804) {
               return this.mergeFrom((S2C_BuyBagLattice_12804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BuyBagLattice_12804 other) {
            if (other == PetMsg.S2C_BuyBagLattice_12804.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasBuyNum()) {
                  this.setBuyNum(other.getBuyNum());
               }

               if (other.hasBagNum()) {
                  this.setBagNum(other.getBagNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasBuyNum()) {
               return false;
            } else {
               return this.hasBagNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BuyBagLattice_12804 parsedMessage = null;

            try {
               parsedMessage = (S2C_BuyBagLattice_12804)PetMsg.S2C_BuyBagLattice_12804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BuyBagLattice_12804)e.getUnfinishedMessage();
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

         public boolean hasBuyNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyNum() {
            return this.buyNum_;
         }

         public Builder setBuyNum(int value) {
            this.bitField0_ |= 2;
            this.buyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyNum() {
            this.bitField0_ &= -3;
            this.buyNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBagNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBagNum() {
            return this.bagNum_;
         }

         public Builder setBagNum(int value) {
            this.bitField0_ |= 4;
            this.bagNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBagNum() {
            this.bitField0_ &= -5;
            this.bagNum_ = 0;
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

   public static final class PetDaoArrayingInfo extends GeneratedMessageV3 implements PetDaoArrayingInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int INDEX_FIELD_NUMBER = 2;
      private int index_;
      public static final int SKILLINDEX_FIELD_NUMBER = 3;
      private int skillIndex_;
      private byte memoizedIsInitialized;
      private static final PetDaoArrayingInfo DEFAULT_INSTANCE = new PetDaoArrayingInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<PetDaoArrayingInfo> PARSER = new AbstractParser<PetDaoArrayingInfo>() {
         public PetDaoArrayingInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new PetDaoArrayingInfo(input, extensionRegistry);
         }
      };

      private PetDaoArrayingInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PetDaoArrayingInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new PetDaoArrayingInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PetDaoArrayingInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.index_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.skillIndex_ = input.readInt32();
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_PetDaoArrayingInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_PetDaoArrayingInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PetDaoArrayingInfo.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasIndex() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getIndex() {
         return this.index_;
      }

      public boolean hasSkillIndex() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSkillIndex() {
         return this.skillIndex_;
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
         } else if (!this.hasIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSkillIndex()) {
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
            output.writeInt32(2, this.index_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.skillIndex_);
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
               size += CodedOutputStream.computeInt32Size(2, this.index_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.skillIndex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof PetDaoArrayingInfo)) {
            return super.equals(obj);
         } else {
            PetDaoArrayingInfo other = (PetDaoArrayingInfo)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasIndex() != other.hasIndex()) {
               return false;
            } else if (this.hasIndex() && this.getIndex() != other.getIndex()) {
               return false;
            } else if (this.hasSkillIndex() != other.hasSkillIndex()) {
               return false;
            } else if (this.hasSkillIndex() && this.getSkillIndex() != other.getSkillIndex()) {
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

            if (this.hasIndex()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIndex();
            }

            if (this.hasSkillIndex()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSkillIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static PetDaoArrayingInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (PetDaoArrayingInfo)PARSER.parseFrom(data);
      }

      public static PetDaoArrayingInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PetDaoArrayingInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PetDaoArrayingInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (PetDaoArrayingInfo)PARSER.parseFrom(data);
      }

      public static PetDaoArrayingInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PetDaoArrayingInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PetDaoArrayingInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (PetDaoArrayingInfo)PARSER.parseFrom(data);
      }

      public static PetDaoArrayingInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PetDaoArrayingInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PetDaoArrayingInfo parseFrom(InputStream input) throws IOException {
         return (PetDaoArrayingInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PetDaoArrayingInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PetDaoArrayingInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static PetDaoArrayingInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (PetDaoArrayingInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static PetDaoArrayingInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PetDaoArrayingInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static PetDaoArrayingInfo parseFrom(CodedInputStream input) throws IOException {
         return (PetDaoArrayingInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PetDaoArrayingInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PetDaoArrayingInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(PetDaoArrayingInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static PetDaoArrayingInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PetDaoArrayingInfo> parser() {
         return PARSER;
      }

      public Parser<PetDaoArrayingInfo> getParserForType() {
         return PARSER;
      }

      public PetDaoArrayingInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PetDaoArrayingInfoOrBuilder {
         private int bitField0_;
         private int code_;
         private int index_;
         private int skillIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_PetDaoArrayingInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_PetDaoArrayingInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PetDaoArrayingInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.PetDaoArrayingInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.index_ = 0;
            this.bitField0_ &= -3;
            this.skillIndex_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_PetDaoArrayingInfo_descriptor;
         }

         public PetDaoArrayingInfo getDefaultInstanceForType() {
            return PetMsg.PetDaoArrayingInfo.getDefaultInstance();
         }

         public PetDaoArrayingInfo build() {
            PetDaoArrayingInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public PetDaoArrayingInfo buildPartial() {
            PetDaoArrayingInfo result = new PetDaoArrayingInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.index_ = this.index_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.skillIndex_ = this.skillIndex_;
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
            if (other instanceof PetDaoArrayingInfo) {
               return this.mergeFrom((PetDaoArrayingInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(PetDaoArrayingInfo other) {
            if (other == PetMsg.PetDaoArrayingInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasIndex()) {
                  this.setIndex(other.getIndex());
               }

               if (other.hasSkillIndex()) {
                  this.setSkillIndex(other.getSkillIndex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasIndex()) {
               return false;
            } else {
               return this.hasSkillIndex();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            PetDaoArrayingInfo parsedMessage = null;

            try {
               parsedMessage = (PetDaoArrayingInfo)PetMsg.PetDaoArrayingInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (PetDaoArrayingInfo)e.getUnfinishedMessage();
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

         public boolean hasIndex() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getIndex() {
            return this.index_;
         }

         public Builder setIndex(int value) {
            this.bitField0_ |= 2;
            this.index_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIndex() {
            this.bitField0_ &= -3;
            this.index_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSkillIndex() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSkillIndex() {
            return this.skillIndex_;
         }

         public Builder setSkillIndex(int value) {
            this.bitField0_ |= 4;
            this.skillIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillIndex() {
            this.bitField0_ &= -5;
            this.skillIndex_ = 0;
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

   public static final class C2S_PetArraying_12805 extends GeneratedMessageV3 implements C2S_PetArraying_12805OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<PetDaoArrayingInfo> info_;
      private byte memoizedIsInitialized;
      private static final C2S_PetArraying_12805 DEFAULT_INSTANCE = new C2S_PetArraying_12805();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PetArraying_12805> PARSER = new AbstractParser<C2S_PetArraying_12805>() {
         public C2S_PetArraying_12805 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PetArraying_12805(input, extensionRegistry);
         }
      };

      private C2S_PetArraying_12805(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PetArraying_12805() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PetArraying_12805();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PetArraying_12805(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.info_.add(input.readMessage(PetMsg.PetDaoArrayingInfo.PARSER, extensionRegistry));
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetArraying_12805_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetArraying_12805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetArraying_12805.class, Builder.class);
      }

      public List<PetDaoArrayingInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends PetDaoArrayingInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public PetDaoArrayingInfo getInfo(int index) {
         return (PetDaoArrayingInfo)this.info_.get(index);
      }

      public PetDaoArrayingInfoOrBuilder getInfoOrBuilder(int index) {
         return (PetDaoArrayingInfoOrBuilder)this.info_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PetArraying_12805)) {
            return super.equals(obj);
         } else {
            C2S_PetArraying_12805 other = (C2S_PetArraying_12805)obj;
            if (!this.getInfoList().equals(other.getInfoList())) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PetArraying_12805 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PetArraying_12805)PARSER.parseFrom(data);
      }

      public static C2S_PetArraying_12805 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetArraying_12805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetArraying_12805 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PetArraying_12805)PARSER.parseFrom(data);
      }

      public static C2S_PetArraying_12805 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetArraying_12805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetArraying_12805 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PetArraying_12805)PARSER.parseFrom(data);
      }

      public static C2S_PetArraying_12805 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetArraying_12805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetArraying_12805 parseFrom(InputStream input) throws IOException {
         return (C2S_PetArraying_12805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetArraying_12805 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetArraying_12805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetArraying_12805 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PetArraying_12805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PetArraying_12805 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetArraying_12805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetArraying_12805 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PetArraying_12805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetArraying_12805 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetArraying_12805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PetArraying_12805 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PetArraying_12805 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PetArraying_12805> parser() {
         return PARSER;
      }

      public Parser<C2S_PetArraying_12805> getParserForType() {
         return PARSER;
      }

      public C2S_PetArraying_12805 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PetArraying_12805OrBuilder {
         private int bitField0_;
         private List<PetDaoArrayingInfo> info_;
         private RepeatedFieldBuilderV3<PetDaoArrayingInfo, PetDaoArrayingInfo.Builder, PetDaoArrayingInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetArraying_12805_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetArraying_12805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetArraying_12805.class, Builder.class);
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
            if (PetMsg.C2S_PetArraying_12805.alwaysUseFieldBuilders) {
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

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetArraying_12805_descriptor;
         }

         public C2S_PetArraying_12805 getDefaultInstanceForType() {
            return PetMsg.C2S_PetArraying_12805.getDefaultInstance();
         }

         public C2S_PetArraying_12805 build() {
            C2S_PetArraying_12805 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PetArraying_12805 buildPartial() {
            C2S_PetArraying_12805 result = new C2S_PetArraying_12805(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -2;
               }

               result.info_ = this.info_;
            } else {
               result.info_ = this.infoBuilder_.build();
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
            if (other instanceof C2S_PetArraying_12805) {
               return this.mergeFrom((C2S_PetArraying_12805)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PetArraying_12805 other) {
            if (other == PetMsg.C2S_PetArraying_12805.getDefaultInstance()) {
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
                     this.infoBuilder_ = PetMsg.C2S_PetArraying_12805.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
                  } else {
                     this.infoBuilder_.addAllMessages(other.info_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getInfoCount(); ++i) {
               if (!this.getInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PetArraying_12805 parsedMessage = null;

            try {
               parsedMessage = (C2S_PetArraying_12805)PetMsg.C2S_PetArraying_12805.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PetArraying_12805)e.getUnfinishedMessage();
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

         public List<PetDaoArrayingInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public PetDaoArrayingInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (PetDaoArrayingInfo)this.info_.get(index) : (PetDaoArrayingInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, PetDaoArrayingInfo value) {
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

         public Builder setInfo(int index, PetDaoArrayingInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(PetDaoArrayingInfo value) {
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

         public Builder addInfo(int index, PetDaoArrayingInfo value) {
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

         public Builder addInfo(PetDaoArrayingInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, PetDaoArrayingInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends PetDaoArrayingInfo> values) {
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

         public PetDaoArrayingInfo.Builder getInfoBuilder(int index) {
            return (PetDaoArrayingInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public PetDaoArrayingInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (PetDaoArrayingInfoOrBuilder)this.info_.get(index) : (PetDaoArrayingInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PetDaoArrayingInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public PetDaoArrayingInfo.Builder addInfoBuilder() {
            return (PetDaoArrayingInfo.Builder)this.getInfoFieldBuilder().addBuilder(PetMsg.PetDaoArrayingInfo.getDefaultInstance());
         }

         public PetDaoArrayingInfo.Builder addInfoBuilder(int index) {
            return (PetDaoArrayingInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, PetMsg.PetDaoArrayingInfo.getDefaultInstance());
         }

         public List<PetDaoArrayingInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PetDaoArrayingInfo, PetDaoArrayingInfo.Builder, PetDaoArrayingInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class S2C_PetArraying_12806 extends GeneratedMessageV3 implements S2C_PetArraying_12806OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_PetArraying_12806 DEFAULT_INSTANCE = new S2C_PetArraying_12806();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PetArraying_12806> PARSER = new AbstractParser<S2C_PetArraying_12806>() {
         public S2C_PetArraying_12806 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PetArraying_12806(input, extensionRegistry);
         }
      };

      private S2C_PetArraying_12806(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PetArraying_12806() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PetArraying_12806();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PetArraying_12806(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetArraying_12806_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetArraying_12806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetArraying_12806.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PetArraying_12806)) {
            return super.equals(obj);
         } else {
            S2C_PetArraying_12806 other = (S2C_PetArraying_12806)obj;
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

      public static S2C_PetArraying_12806 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PetArraying_12806)PARSER.parseFrom(data);
      }

      public static S2C_PetArraying_12806 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetArraying_12806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetArraying_12806 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PetArraying_12806)PARSER.parseFrom(data);
      }

      public static S2C_PetArraying_12806 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetArraying_12806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetArraying_12806 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PetArraying_12806)PARSER.parseFrom(data);
      }

      public static S2C_PetArraying_12806 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetArraying_12806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetArraying_12806 parseFrom(InputStream input) throws IOException {
         return (S2C_PetArraying_12806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetArraying_12806 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetArraying_12806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetArraying_12806 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PetArraying_12806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PetArraying_12806 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetArraying_12806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetArraying_12806 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PetArraying_12806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetArraying_12806 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetArraying_12806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PetArraying_12806 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PetArraying_12806 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PetArraying_12806> parser() {
         return PARSER;
      }

      public Parser<S2C_PetArraying_12806> getParserForType() {
         return PARSER;
      }

      public S2C_PetArraying_12806 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PetArraying_12806OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetArraying_12806_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetArraying_12806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetArraying_12806.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_PetArraying_12806.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetArraying_12806_descriptor;
         }

         public S2C_PetArraying_12806 getDefaultInstanceForType() {
            return PetMsg.S2C_PetArraying_12806.getDefaultInstance();
         }

         public S2C_PetArraying_12806 build() {
            S2C_PetArraying_12806 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PetArraying_12806 buildPartial() {
            S2C_PetArraying_12806 result = new S2C_PetArraying_12806(this);
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
            if (other instanceof S2C_PetArraying_12806) {
               return this.mergeFrom((S2C_PetArraying_12806)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PetArraying_12806 other) {
            if (other == PetMsg.S2C_PetArraying_12806.getDefaultInstance()) {
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
            S2C_PetArraying_12806 parsedMessage = null;

            try {
               parsedMessage = (S2C_PetArraying_12806)PetMsg.S2C_PetArraying_12806.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PetArraying_12806)e.getUnfinishedMessage();
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

   public static final class C2S_PetArrayingSkill_12807 extends GeneratedMessageV3 implements C2S_PetArrayingSkill_12807OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SKILLINDEX_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> skillIndex_;
      private byte memoizedIsInitialized;
      private static final C2S_PetArrayingSkill_12807 DEFAULT_INSTANCE = new C2S_PetArrayingSkill_12807();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PetArrayingSkill_12807> PARSER = new AbstractParser<C2S_PetArrayingSkill_12807>() {
         public C2S_PetArrayingSkill_12807 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PetArrayingSkill_12807(input, extensionRegistry);
         }
      };

      private C2S_PetArrayingSkill_12807(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PetArrayingSkill_12807() {
         this.memoizedIsInitialized = -1;
         this.skillIndex_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PetArrayingSkill_12807();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PetArrayingSkill_12807(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.skillIndex_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.skillIndex_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
                  this.skillIndex_ = Collections.unmodifiableList(this.skillIndex_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetArrayingSkill_12807_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetArrayingSkill_12807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetArrayingSkill_12807.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getSkillIndexList() {
         return this.skillIndex_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getSkillIndexOrBuilderList() {
         return this.skillIndex_;
      }

      public int getSkillIndexCount() {
         return this.skillIndex_.size();
      }

      public CommonMsg.MapDataII getSkillIndex(int index) {
         return (CommonMsg.MapDataII)this.skillIndex_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getSkillIndexOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.skillIndex_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getSkillIndexCount(); ++i) {
               if (!this.getSkillIndex(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.skillIndex_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.skillIndex_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.skillIndex_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.skillIndex_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PetArrayingSkill_12807)) {
            return super.equals(obj);
         } else {
            C2S_PetArrayingSkill_12807 other = (C2S_PetArrayingSkill_12807)obj;
            if (!this.getSkillIndexList().equals(other.getSkillIndexList())) {
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
            if (this.getSkillIndexCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSkillIndexList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PetArrayingSkill_12807 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PetArrayingSkill_12807)PARSER.parseFrom(data);
      }

      public static C2S_PetArrayingSkill_12807 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetArrayingSkill_12807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetArrayingSkill_12807 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PetArrayingSkill_12807)PARSER.parseFrom(data);
      }

      public static C2S_PetArrayingSkill_12807 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetArrayingSkill_12807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetArrayingSkill_12807 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PetArrayingSkill_12807)PARSER.parseFrom(data);
      }

      public static C2S_PetArrayingSkill_12807 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetArrayingSkill_12807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetArrayingSkill_12807 parseFrom(InputStream input) throws IOException {
         return (C2S_PetArrayingSkill_12807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetArrayingSkill_12807 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetArrayingSkill_12807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetArrayingSkill_12807 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PetArrayingSkill_12807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PetArrayingSkill_12807 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetArrayingSkill_12807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetArrayingSkill_12807 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PetArrayingSkill_12807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetArrayingSkill_12807 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetArrayingSkill_12807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PetArrayingSkill_12807 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PetArrayingSkill_12807 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PetArrayingSkill_12807> parser() {
         return PARSER;
      }

      public Parser<C2S_PetArrayingSkill_12807> getParserForType() {
         return PARSER;
      }

      public C2S_PetArrayingSkill_12807 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PetArrayingSkill_12807OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> skillIndex_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> skillIndexBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetArrayingSkill_12807_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetArrayingSkill_12807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetArrayingSkill_12807.class, Builder.class);
         }

         private Builder() {
            this.skillIndex_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.skillIndex_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_PetArrayingSkill_12807.alwaysUseFieldBuilders) {
               this.getSkillIndexFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.skillIndexBuilder_ == null) {
               this.skillIndex_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.skillIndexBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetArrayingSkill_12807_descriptor;
         }

         public C2S_PetArrayingSkill_12807 getDefaultInstanceForType() {
            return PetMsg.C2S_PetArrayingSkill_12807.getDefaultInstance();
         }

         public C2S_PetArrayingSkill_12807 build() {
            C2S_PetArrayingSkill_12807 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PetArrayingSkill_12807 buildPartial() {
            C2S_PetArrayingSkill_12807 result = new C2S_PetArrayingSkill_12807(this);
            int from_bitField0_ = this.bitField0_;
            if (this.skillIndexBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.skillIndex_ = Collections.unmodifiableList(this.skillIndex_);
                  this.bitField0_ &= -2;
               }

               result.skillIndex_ = this.skillIndex_;
            } else {
               result.skillIndex_ = this.skillIndexBuilder_.build();
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
            if (other instanceof C2S_PetArrayingSkill_12807) {
               return this.mergeFrom((C2S_PetArrayingSkill_12807)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PetArrayingSkill_12807 other) {
            if (other == PetMsg.C2S_PetArrayingSkill_12807.getDefaultInstance()) {
               return this;
            } else {
               if (this.skillIndexBuilder_ == null) {
                  if (!other.skillIndex_.isEmpty()) {
                     if (this.skillIndex_.isEmpty()) {
                        this.skillIndex_ = other.skillIndex_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureSkillIndexIsMutable();
                        this.skillIndex_.addAll(other.skillIndex_);
                     }

                     this.onChanged();
                  }
               } else if (!other.skillIndex_.isEmpty()) {
                  if (this.skillIndexBuilder_.isEmpty()) {
                     this.skillIndexBuilder_.dispose();
                     this.skillIndexBuilder_ = null;
                     this.skillIndex_ = other.skillIndex_;
                     this.bitField0_ &= -2;
                     this.skillIndexBuilder_ = PetMsg.C2S_PetArrayingSkill_12807.alwaysUseFieldBuilders ? this.getSkillIndexFieldBuilder() : null;
                  } else {
                     this.skillIndexBuilder_.addAllMessages(other.skillIndex_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getSkillIndexCount(); ++i) {
               if (!this.getSkillIndex(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PetArrayingSkill_12807 parsedMessage = null;

            try {
               parsedMessage = (C2S_PetArrayingSkill_12807)PetMsg.C2S_PetArrayingSkill_12807.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PetArrayingSkill_12807)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureSkillIndexIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.skillIndex_ = new ArrayList(this.skillIndex_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getSkillIndexList() {
            return this.skillIndexBuilder_ == null ? Collections.unmodifiableList(this.skillIndex_) : this.skillIndexBuilder_.getMessageList();
         }

         public int getSkillIndexCount() {
            return this.skillIndexBuilder_ == null ? this.skillIndex_.size() : this.skillIndexBuilder_.getCount();
         }

         public CommonMsg.MapDataII getSkillIndex(int index) {
            return this.skillIndexBuilder_ == null ? (CommonMsg.MapDataII)this.skillIndex_.get(index) : (CommonMsg.MapDataII)this.skillIndexBuilder_.getMessage(index);
         }

         public Builder setSkillIndex(int index, CommonMsg.MapDataII value) {
            if (this.skillIndexBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSkillIndexIsMutable();
               this.skillIndex_.set(index, value);
               this.onChanged();
            } else {
               this.skillIndexBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSkillIndex(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.skillIndexBuilder_ == null) {
               this.ensureSkillIndexIsMutable();
               this.skillIndex_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.skillIndexBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSkillIndex(CommonMsg.MapDataII value) {
            if (this.skillIndexBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSkillIndexIsMutable();
               this.skillIndex_.add(value);
               this.onChanged();
            } else {
               this.skillIndexBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSkillIndex(int index, CommonMsg.MapDataII value) {
            if (this.skillIndexBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSkillIndexIsMutable();
               this.skillIndex_.add(index, value);
               this.onChanged();
            } else {
               this.skillIndexBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSkillIndex(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.skillIndexBuilder_ == null) {
               this.ensureSkillIndexIsMutable();
               this.skillIndex_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.skillIndexBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSkillIndex(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.skillIndexBuilder_ == null) {
               this.ensureSkillIndexIsMutable();
               this.skillIndex_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.skillIndexBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSkillIndex(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.skillIndexBuilder_ == null) {
               this.ensureSkillIndexIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.skillIndex_);
               this.onChanged();
            } else {
               this.skillIndexBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSkillIndex() {
            if (this.skillIndexBuilder_ == null) {
               this.skillIndex_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.skillIndexBuilder_.clear();
            }

            return this;
         }

         public Builder removeSkillIndex(int index) {
            if (this.skillIndexBuilder_ == null) {
               this.ensureSkillIndexIsMutable();
               this.skillIndex_.remove(index);
               this.onChanged();
            } else {
               this.skillIndexBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getSkillIndexBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSkillIndexFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getSkillIndexOrBuilder(int index) {
            return this.skillIndexBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.skillIndex_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.skillIndexBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getSkillIndexOrBuilderList() {
            return this.skillIndexBuilder_ != null ? this.skillIndexBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.skillIndex_);
         }

         public CommonMsg.MapDataII.Builder addSkillIndexBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getSkillIndexFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addSkillIndexBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSkillIndexFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getSkillIndexBuilderList() {
            return this.getSkillIndexFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getSkillIndexFieldBuilder() {
            if (this.skillIndexBuilder_ == null) {
               this.skillIndexBuilder_ = new RepeatedFieldBuilderV3(this.skillIndex_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.skillIndex_ = null;
            }

            return this.skillIndexBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_PetArrayingSkill_12808 extends GeneratedMessageV3 implements S2C_PetArrayingSkill_12808OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_PetArrayingSkill_12808 DEFAULT_INSTANCE = new S2C_PetArrayingSkill_12808();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PetArrayingSkill_12808> PARSER = new AbstractParser<S2C_PetArrayingSkill_12808>() {
         public S2C_PetArrayingSkill_12808 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PetArrayingSkill_12808(input, extensionRegistry);
         }
      };

      private S2C_PetArrayingSkill_12808(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PetArrayingSkill_12808() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PetArrayingSkill_12808();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PetArrayingSkill_12808(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetArrayingSkill_12808_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetArrayingSkill_12808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetArrayingSkill_12808.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PetArrayingSkill_12808)) {
            return super.equals(obj);
         } else {
            S2C_PetArrayingSkill_12808 other = (S2C_PetArrayingSkill_12808)obj;
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

      public static S2C_PetArrayingSkill_12808 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PetArrayingSkill_12808)PARSER.parseFrom(data);
      }

      public static S2C_PetArrayingSkill_12808 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetArrayingSkill_12808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetArrayingSkill_12808 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PetArrayingSkill_12808)PARSER.parseFrom(data);
      }

      public static S2C_PetArrayingSkill_12808 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetArrayingSkill_12808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetArrayingSkill_12808 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PetArrayingSkill_12808)PARSER.parseFrom(data);
      }

      public static S2C_PetArrayingSkill_12808 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetArrayingSkill_12808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetArrayingSkill_12808 parseFrom(InputStream input) throws IOException {
         return (S2C_PetArrayingSkill_12808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetArrayingSkill_12808 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetArrayingSkill_12808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetArrayingSkill_12808 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PetArrayingSkill_12808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PetArrayingSkill_12808 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetArrayingSkill_12808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetArrayingSkill_12808 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PetArrayingSkill_12808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetArrayingSkill_12808 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetArrayingSkill_12808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PetArrayingSkill_12808 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PetArrayingSkill_12808 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PetArrayingSkill_12808> parser() {
         return PARSER;
      }

      public Parser<S2C_PetArrayingSkill_12808> getParserForType() {
         return PARSER;
      }

      public S2C_PetArrayingSkill_12808 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PetArrayingSkill_12808OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetArrayingSkill_12808_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetArrayingSkill_12808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetArrayingSkill_12808.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_PetArrayingSkill_12808.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetArrayingSkill_12808_descriptor;
         }

         public S2C_PetArrayingSkill_12808 getDefaultInstanceForType() {
            return PetMsg.S2C_PetArrayingSkill_12808.getDefaultInstance();
         }

         public S2C_PetArrayingSkill_12808 build() {
            S2C_PetArrayingSkill_12808 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PetArrayingSkill_12808 buildPartial() {
            S2C_PetArrayingSkill_12808 result = new S2C_PetArrayingSkill_12808(this);
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
            if (other instanceof S2C_PetArrayingSkill_12808) {
               return this.mergeFrom((S2C_PetArrayingSkill_12808)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PetArrayingSkill_12808 other) {
            if (other == PetMsg.S2C_PetArrayingSkill_12808.getDefaultInstance()) {
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
            S2C_PetArrayingSkill_12808 parsedMessage = null;

            try {
               parsedMessage = (S2C_PetArrayingSkill_12808)PetMsg.S2C_PetArrayingSkill_12808.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PetArrayingSkill_12808)e.getUnfinishedMessage();
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

   public static final class S2C_UpdateArrayingInfo_12809 extends GeneratedMessageV3 implements S2C_UpdateArrayingInfo_12809OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<PetDaoArrayingInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateArrayingInfo_12809 DEFAULT_INSTANCE = new S2C_UpdateArrayingInfo_12809();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateArrayingInfo_12809> PARSER = new AbstractParser<S2C_UpdateArrayingInfo_12809>() {
         public S2C_UpdateArrayingInfo_12809 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateArrayingInfo_12809(input, extensionRegistry);
         }
      };

      private S2C_UpdateArrayingInfo_12809(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateArrayingInfo_12809() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateArrayingInfo_12809();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateArrayingInfo_12809(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.infos_.add(input.readMessage(PetMsg.PetDaoArrayingInfo.PARSER, extensionRegistry));
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_UpdateArrayingInfo_12809_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_UpdateArrayingInfo_12809_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateArrayingInfo_12809.class, Builder.class);
      }

      public List<PetDaoArrayingInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends PetDaoArrayingInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public PetDaoArrayingInfo getInfos(int index) {
         return (PetDaoArrayingInfo)this.infos_.get(index);
      }

      public PetDaoArrayingInfoOrBuilder getInfosOrBuilder(int index) {
         return (PetDaoArrayingInfoOrBuilder)this.infos_.get(index);
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
         } else if (!(obj instanceof S2C_UpdateArrayingInfo_12809)) {
            return super.equals(obj);
         } else {
            S2C_UpdateArrayingInfo_12809 other = (S2C_UpdateArrayingInfo_12809)obj;
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

      public static S2C_UpdateArrayingInfo_12809 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateArrayingInfo_12809)PARSER.parseFrom(data);
      }

      public static S2C_UpdateArrayingInfo_12809 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateArrayingInfo_12809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateArrayingInfo_12809 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateArrayingInfo_12809)PARSER.parseFrom(data);
      }

      public static S2C_UpdateArrayingInfo_12809 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateArrayingInfo_12809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateArrayingInfo_12809 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateArrayingInfo_12809)PARSER.parseFrom(data);
      }

      public static S2C_UpdateArrayingInfo_12809 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateArrayingInfo_12809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateArrayingInfo_12809 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateArrayingInfo_12809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateArrayingInfo_12809 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateArrayingInfo_12809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateArrayingInfo_12809 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateArrayingInfo_12809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateArrayingInfo_12809 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateArrayingInfo_12809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateArrayingInfo_12809 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateArrayingInfo_12809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateArrayingInfo_12809 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateArrayingInfo_12809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateArrayingInfo_12809 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateArrayingInfo_12809 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateArrayingInfo_12809> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateArrayingInfo_12809> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateArrayingInfo_12809 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateArrayingInfo_12809OrBuilder {
         private int bitField0_;
         private List<PetDaoArrayingInfo> infos_;
         private RepeatedFieldBuilderV3<PetDaoArrayingInfo, PetDaoArrayingInfo.Builder, PetDaoArrayingInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_UpdateArrayingInfo_12809_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_UpdateArrayingInfo_12809_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateArrayingInfo_12809.class, Builder.class);
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
            if (PetMsg.S2C_UpdateArrayingInfo_12809.alwaysUseFieldBuilders) {
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
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_UpdateArrayingInfo_12809_descriptor;
         }

         public S2C_UpdateArrayingInfo_12809 getDefaultInstanceForType() {
            return PetMsg.S2C_UpdateArrayingInfo_12809.getDefaultInstance();
         }

         public S2C_UpdateArrayingInfo_12809 build() {
            S2C_UpdateArrayingInfo_12809 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateArrayingInfo_12809 buildPartial() {
            S2C_UpdateArrayingInfo_12809 result = new S2C_UpdateArrayingInfo_12809(this);
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
            if (other instanceof S2C_UpdateArrayingInfo_12809) {
               return this.mergeFrom((S2C_UpdateArrayingInfo_12809)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateArrayingInfo_12809 other) {
            if (other == PetMsg.S2C_UpdateArrayingInfo_12809.getDefaultInstance()) {
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
                     this.infosBuilder_ = PetMsg.S2C_UpdateArrayingInfo_12809.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            S2C_UpdateArrayingInfo_12809 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateArrayingInfo_12809)PetMsg.S2C_UpdateArrayingInfo_12809.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateArrayingInfo_12809)e.getUnfinishedMessage();
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

         public List<PetDaoArrayingInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public PetDaoArrayingInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (PetDaoArrayingInfo)this.infos_.get(index) : (PetDaoArrayingInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, PetDaoArrayingInfo value) {
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

         public Builder setInfos(int index, PetDaoArrayingInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(PetDaoArrayingInfo value) {
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

         public Builder addInfos(int index, PetDaoArrayingInfo value) {
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

         public Builder addInfos(PetDaoArrayingInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, PetDaoArrayingInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends PetDaoArrayingInfo> values) {
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

         public PetDaoArrayingInfo.Builder getInfosBuilder(int index) {
            return (PetDaoArrayingInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public PetDaoArrayingInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (PetDaoArrayingInfoOrBuilder)this.infos_.get(index) : (PetDaoArrayingInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PetDaoArrayingInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public PetDaoArrayingInfo.Builder addInfosBuilder() {
            return (PetDaoArrayingInfo.Builder)this.getInfosFieldBuilder().addBuilder(PetMsg.PetDaoArrayingInfo.getDefaultInstance());
         }

         public PetDaoArrayingInfo.Builder addInfosBuilder(int index) {
            return (PetDaoArrayingInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, PetMsg.PetDaoArrayingInfo.getDefaultInstance());
         }

         public List<PetDaoArrayingInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PetDaoArrayingInfo, PetDaoArrayingInfo.Builder, PetDaoArrayingInfoOrBuilder> getInfosFieldBuilder() {
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

   public static final class C2S_PetUpLv_12811 extends GeneratedMessageV3 implements C2S_PetUpLv_12811OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_PetUpLv_12811 DEFAULT_INSTANCE = new C2S_PetUpLv_12811();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PetUpLv_12811> PARSER = new AbstractParser<C2S_PetUpLv_12811>() {
         public C2S_PetUpLv_12811 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PetUpLv_12811(input, extensionRegistry);
         }
      };

      private C2S_PetUpLv_12811(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PetUpLv_12811() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PetUpLv_12811();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PetUpLv_12811(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetUpLv_12811_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetUpLv_12811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetUpLv_12811.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PetUpLv_12811)) {
            return super.equals(obj);
         } else {
            C2S_PetUpLv_12811 other = (C2S_PetUpLv_12811)obj;
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

      public static C2S_PetUpLv_12811 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PetUpLv_12811)PARSER.parseFrom(data);
      }

      public static C2S_PetUpLv_12811 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetUpLv_12811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetUpLv_12811 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PetUpLv_12811)PARSER.parseFrom(data);
      }

      public static C2S_PetUpLv_12811 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetUpLv_12811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetUpLv_12811 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PetUpLv_12811)PARSER.parseFrom(data);
      }

      public static C2S_PetUpLv_12811 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetUpLv_12811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetUpLv_12811 parseFrom(InputStream input) throws IOException {
         return (C2S_PetUpLv_12811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetUpLv_12811 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetUpLv_12811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetUpLv_12811 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PetUpLv_12811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PetUpLv_12811 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetUpLv_12811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetUpLv_12811 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PetUpLv_12811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetUpLv_12811 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetUpLv_12811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PetUpLv_12811 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PetUpLv_12811 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PetUpLv_12811> parser() {
         return PARSER;
      }

      public Parser<C2S_PetUpLv_12811> getParserForType() {
         return PARSER;
      }

      public C2S_PetUpLv_12811 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PetUpLv_12811OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetUpLv_12811_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetUpLv_12811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetUpLv_12811.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_PetUpLv_12811.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetUpLv_12811_descriptor;
         }

         public C2S_PetUpLv_12811 getDefaultInstanceForType() {
            return PetMsg.C2S_PetUpLv_12811.getDefaultInstance();
         }

         public C2S_PetUpLv_12811 build() {
            C2S_PetUpLv_12811 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PetUpLv_12811 buildPartial() {
            C2S_PetUpLv_12811 result = new C2S_PetUpLv_12811(this);
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
            if (other instanceof C2S_PetUpLv_12811) {
               return this.mergeFrom((C2S_PetUpLv_12811)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PetUpLv_12811 other) {
            if (other == PetMsg.C2S_PetUpLv_12811.getDefaultInstance()) {
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
            C2S_PetUpLv_12811 parsedMessage = null;

            try {
               parsedMessage = (C2S_PetUpLv_12811)PetMsg.C2S_PetUpLv_12811.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PetUpLv_12811)e.getUnfinishedMessage();
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

   public static final class S2C_PetUpLv_12812 extends GeneratedMessageV3 implements S2C_PetUpLv_12812OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int LV_FIELD_NUMBER = 3;
      private int lv_;
      private byte memoizedIsInitialized;
      private static final S2C_PetUpLv_12812 DEFAULT_INSTANCE = new S2C_PetUpLv_12812();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PetUpLv_12812> PARSER = new AbstractParser<S2C_PetUpLv_12812>() {
         public S2C_PetUpLv_12812 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PetUpLv_12812(input, extensionRegistry);
         }
      };

      private S2C_PetUpLv_12812(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PetUpLv_12812() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PetUpLv_12812();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PetUpLv_12812(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.lv_ = input.readInt32();
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetUpLv_12812_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetUpLv_12812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetUpLv_12812.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLv() {
         return this.lv_;
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
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
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
            output.writeInt32(2, this.code_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.lv_);
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
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.lv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PetUpLv_12812)) {
            return super.equals(obj);
         } else {
            S2C_PetUpLv_12812 other = (S2C_PetUpLv_12812)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
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

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PetUpLv_12812 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PetUpLv_12812)PARSER.parseFrom(data);
      }

      public static S2C_PetUpLv_12812 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetUpLv_12812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetUpLv_12812 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PetUpLv_12812)PARSER.parseFrom(data);
      }

      public static S2C_PetUpLv_12812 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetUpLv_12812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetUpLv_12812 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PetUpLv_12812)PARSER.parseFrom(data);
      }

      public static S2C_PetUpLv_12812 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetUpLv_12812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetUpLv_12812 parseFrom(InputStream input) throws IOException {
         return (S2C_PetUpLv_12812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetUpLv_12812 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetUpLv_12812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetUpLv_12812 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PetUpLv_12812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PetUpLv_12812 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetUpLv_12812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetUpLv_12812 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PetUpLv_12812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetUpLv_12812 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetUpLv_12812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PetUpLv_12812 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PetUpLv_12812 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PetUpLv_12812> parser() {
         return PARSER;
      }

      public Parser<S2C_PetUpLv_12812> getParserForType() {
         return PARSER;
      }

      public S2C_PetUpLv_12812 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PetUpLv_12812OrBuilder {
         private int bitField0_;
         private int result_;
         private int code_;
         private int lv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetUpLv_12812_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetUpLv_12812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetUpLv_12812.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_PetUpLv_12812.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            this.lv_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetUpLv_12812_descriptor;
         }

         public S2C_PetUpLv_12812 getDefaultInstanceForType() {
            return PetMsg.S2C_PetUpLv_12812.getDefaultInstance();
         }

         public S2C_PetUpLv_12812 build() {
            S2C_PetUpLv_12812 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PetUpLv_12812 buildPartial() {
            S2C_PetUpLv_12812 result = new S2C_PetUpLv_12812(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.lv_ = this.lv_;
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
            if (other instanceof S2C_PetUpLv_12812) {
               return this.mergeFrom((S2C_PetUpLv_12812)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PetUpLv_12812 other) {
            if (other == PetMsg.S2C_PetUpLv_12812.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else {
               return this.hasLv();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PetUpLv_12812 parsedMessage = null;

            try {
               parsedMessage = (S2C_PetUpLv_12812)PetMsg.S2C_PetUpLv_12812.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PetUpLv_12812)e.getUnfinishedMessage();
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

         public boolean hasLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 4;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -5;
            this.lv_ = 0;
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

   public static final class C2S_PetUpStar_12813 extends GeneratedMessageV3 implements C2S_PetUpStar_12813OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_PetUpStar_12813 DEFAULT_INSTANCE = new C2S_PetUpStar_12813();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PetUpStar_12813> PARSER = new AbstractParser<C2S_PetUpStar_12813>() {
         public C2S_PetUpStar_12813 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PetUpStar_12813(input, extensionRegistry);
         }
      };

      private C2S_PetUpStar_12813(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PetUpStar_12813() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PetUpStar_12813();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PetUpStar_12813(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetUpStar_12813_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetUpStar_12813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetUpStar_12813.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PetUpStar_12813)) {
            return super.equals(obj);
         } else {
            C2S_PetUpStar_12813 other = (C2S_PetUpStar_12813)obj;
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

      public static C2S_PetUpStar_12813 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PetUpStar_12813)PARSER.parseFrom(data);
      }

      public static C2S_PetUpStar_12813 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetUpStar_12813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetUpStar_12813 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PetUpStar_12813)PARSER.parseFrom(data);
      }

      public static C2S_PetUpStar_12813 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetUpStar_12813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetUpStar_12813 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PetUpStar_12813)PARSER.parseFrom(data);
      }

      public static C2S_PetUpStar_12813 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetUpStar_12813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetUpStar_12813 parseFrom(InputStream input) throws IOException {
         return (C2S_PetUpStar_12813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetUpStar_12813 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetUpStar_12813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetUpStar_12813 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PetUpStar_12813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PetUpStar_12813 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetUpStar_12813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetUpStar_12813 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PetUpStar_12813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetUpStar_12813 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetUpStar_12813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PetUpStar_12813 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PetUpStar_12813 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PetUpStar_12813> parser() {
         return PARSER;
      }

      public Parser<C2S_PetUpStar_12813> getParserForType() {
         return PARSER;
      }

      public C2S_PetUpStar_12813 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PetUpStar_12813OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetUpStar_12813_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetUpStar_12813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetUpStar_12813.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_PetUpStar_12813.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetUpStar_12813_descriptor;
         }

         public C2S_PetUpStar_12813 getDefaultInstanceForType() {
            return PetMsg.C2S_PetUpStar_12813.getDefaultInstance();
         }

         public C2S_PetUpStar_12813 build() {
            C2S_PetUpStar_12813 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PetUpStar_12813 buildPartial() {
            C2S_PetUpStar_12813 result = new C2S_PetUpStar_12813(this);
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
            if (other instanceof C2S_PetUpStar_12813) {
               return this.mergeFrom((C2S_PetUpStar_12813)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PetUpStar_12813 other) {
            if (other == PetMsg.C2S_PetUpStar_12813.getDefaultInstance()) {
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
            C2S_PetUpStar_12813 parsedMessage = null;

            try {
               parsedMessage = (C2S_PetUpStar_12813)PetMsg.C2S_PetUpStar_12813.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PetUpStar_12813)e.getUnfinishedMessage();
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

   public static final class S2C_PetUpStar_12814 extends GeneratedMessageV3 implements S2C_PetUpStar_12814OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int STAR_FIELD_NUMBER = 3;
      private int star_;
      private byte memoizedIsInitialized;
      private static final S2C_PetUpStar_12814 DEFAULT_INSTANCE = new S2C_PetUpStar_12814();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PetUpStar_12814> PARSER = new AbstractParser<S2C_PetUpStar_12814>() {
         public S2C_PetUpStar_12814 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PetUpStar_12814(input, extensionRegistry);
         }
      };

      private S2C_PetUpStar_12814(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PetUpStar_12814() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PetUpStar_12814();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PetUpStar_12814(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.star_ = input.readInt32();
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetUpStar_12814_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetUpStar_12814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetUpStar_12814.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasStar() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStar() {
         return this.star_;
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
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStar()) {
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
            output.writeInt32(2, this.code_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.star_);
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
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.star_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PetUpStar_12814)) {
            return super.equals(obj);
         } else {
            S2C_PetUpStar_12814 other = (S2C_PetUpStar_12814)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasStar() != other.hasStar()) {
               return false;
            } else if (this.hasStar() && this.getStar() != other.getStar()) {
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

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasStar()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStar();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PetUpStar_12814 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PetUpStar_12814)PARSER.parseFrom(data);
      }

      public static S2C_PetUpStar_12814 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetUpStar_12814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetUpStar_12814 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PetUpStar_12814)PARSER.parseFrom(data);
      }

      public static S2C_PetUpStar_12814 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetUpStar_12814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetUpStar_12814 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PetUpStar_12814)PARSER.parseFrom(data);
      }

      public static S2C_PetUpStar_12814 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetUpStar_12814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetUpStar_12814 parseFrom(InputStream input) throws IOException {
         return (S2C_PetUpStar_12814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetUpStar_12814 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetUpStar_12814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetUpStar_12814 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PetUpStar_12814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PetUpStar_12814 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetUpStar_12814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetUpStar_12814 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PetUpStar_12814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetUpStar_12814 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetUpStar_12814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PetUpStar_12814 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PetUpStar_12814 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PetUpStar_12814> parser() {
         return PARSER;
      }

      public Parser<S2C_PetUpStar_12814> getParserForType() {
         return PARSER;
      }

      public S2C_PetUpStar_12814 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PetUpStar_12814OrBuilder {
         private int bitField0_;
         private int result_;
         private int code_;
         private int star_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetUpStar_12814_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetUpStar_12814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetUpStar_12814.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_PetUpStar_12814.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            this.star_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetUpStar_12814_descriptor;
         }

         public S2C_PetUpStar_12814 getDefaultInstanceForType() {
            return PetMsg.S2C_PetUpStar_12814.getDefaultInstance();
         }

         public S2C_PetUpStar_12814 build() {
            S2C_PetUpStar_12814 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PetUpStar_12814 buildPartial() {
            S2C_PetUpStar_12814 result = new S2C_PetUpStar_12814(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.star_ = this.star_;
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
            if (other instanceof S2C_PetUpStar_12814) {
               return this.mergeFrom((S2C_PetUpStar_12814)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PetUpStar_12814 other) {
            if (other == PetMsg.S2C_PetUpStar_12814.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasStar()) {
                  this.setStar(other.getStar());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else {
               return this.hasStar();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PetUpStar_12814 parsedMessage = null;

            try {
               parsedMessage = (S2C_PetUpStar_12814)PetMsg.S2C_PetUpStar_12814.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PetUpStar_12814)e.getUnfinishedMessage();
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

         public boolean hasStar() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStar() {
            return this.star_;
         }

         public Builder setStar(int value) {
            this.bitField0_ |= 4;
            this.star_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStar() {
            this.bitField0_ &= -5;
            this.star_ = 0;
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

   public static final class C2S_PetFly_12815 extends GeneratedMessageV3 implements C2S_PetFly_12815OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int INFOS_FIELD_NUMBER = 2;
      private LazyStringList infos_;
      private byte memoizedIsInitialized;
      private static final C2S_PetFly_12815 DEFAULT_INSTANCE = new C2S_PetFly_12815();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PetFly_12815> PARSER = new AbstractParser<C2S_PetFly_12815>() {
         public C2S_PetFly_12815 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PetFly_12815(input, extensionRegistry);
         }
      };

      private C2S_PetFly_12815(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PetFly_12815() {
         this.memoizedIsInitialized = -1;
         this.infos_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PetFly_12815();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PetFly_12815(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.infos_ = new LazyStringArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.infos_.add(bs);
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
                  this.infos_ = this.infos_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetFly_12815_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetFly_12815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetFly_12815.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public ProtocolStringList getInfosList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public String getInfos(int index) {
         return (String)this.infos_.get(index);
      }

      public ByteString getInfosBytes(int index) {
         return this.infos_.getByteString(index);
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

         for(int i = 0; i < this.infos_.size(); ++i) {
            GeneratedMessageV3.writeString(output, 2, this.infos_.getRaw(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.infos_.size(); ++i) {
               dataSize += computeStringSizeNoTag(this.infos_.getRaw(i));
            }

            size += dataSize;
            size += 1 * this.getInfosList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PetFly_12815)) {
            return super.equals(obj);
         } else {
            C2S_PetFly_12815 other = (C2S_PetFly_12815)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
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

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PetFly_12815 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PetFly_12815)PARSER.parseFrom(data);
      }

      public static C2S_PetFly_12815 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetFly_12815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetFly_12815 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PetFly_12815)PARSER.parseFrom(data);
      }

      public static C2S_PetFly_12815 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetFly_12815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetFly_12815 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PetFly_12815)PARSER.parseFrom(data);
      }

      public static C2S_PetFly_12815 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetFly_12815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetFly_12815 parseFrom(InputStream input) throws IOException {
         return (C2S_PetFly_12815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetFly_12815 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetFly_12815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetFly_12815 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PetFly_12815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PetFly_12815 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetFly_12815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetFly_12815 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PetFly_12815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetFly_12815 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetFly_12815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PetFly_12815 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PetFly_12815 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PetFly_12815> parser() {
         return PARSER;
      }

      public Parser<C2S_PetFly_12815> getParserForType() {
         return PARSER;
      }

      public C2S_PetFly_12815 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PetFly_12815OrBuilder {
         private int bitField0_;
         private int code_;
         private LazyStringList infos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetFly_12815_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetFly_12815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetFly_12815.class, Builder.class);
         }

         private Builder() {
            this.infos_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_PetFly_12815.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.infos_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetFly_12815_descriptor;
         }

         public C2S_PetFly_12815 getDefaultInstanceForType() {
            return PetMsg.C2S_PetFly_12815.getDefaultInstance();
         }

         public C2S_PetFly_12815 build() {
            C2S_PetFly_12815 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PetFly_12815 buildPartial() {
            C2S_PetFly_12815 result = new C2S_PetFly_12815(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.infos_ = this.infos_.getUnmodifiableView();
               this.bitField0_ &= -3;
            }

            result.infos_ = this.infos_;
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
            if (other instanceof C2S_PetFly_12815) {
               return this.mergeFrom((C2S_PetFly_12815)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PetFly_12815 other) {
            if (other == PetMsg.C2S_PetFly_12815.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (!other.infos_.isEmpty()) {
                  if (this.infos_.isEmpty()) {
                     this.infos_ = other.infos_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureInfosIsMutable();
                     this.infos_.addAll(other.infos_);
                  }

                  this.onChanged();
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
            C2S_PetFly_12815 parsedMessage = null;

            try {
               parsedMessage = (C2S_PetFly_12815)PetMsg.C2S_PetFly_12815.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PetFly_12815)e.getUnfinishedMessage();
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

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.infos_ = new LazyStringArrayList(this.infos_);
               this.bitField0_ |= 2;
            }

         }

         public ProtocolStringList getInfosList() {
            return this.infos_.getUnmodifiableView();
         }

         public int getInfosCount() {
            return this.infos_.size();
         }

         public String getInfos(int index) {
            return (String)this.infos_.get(index);
         }

         public ByteString getInfosBytes(int index) {
            return this.infos_.getByteString(index);
         }

         public Builder setInfos(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureInfosIsMutable();
               this.infos_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addInfos(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureInfosIsMutable();
               this.infos_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllInfos(Iterable<String> values) {
            this.ensureInfosIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infos_);
            this.onChanged();
            return this;
         }

         public Builder clearInfos() {
            this.infos_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public Builder addInfosBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureInfosIsMutable();
               this.infos_.add(value);
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

   public static final class S2C_PetFly_12816 extends GeneratedMessageV3 implements S2C_PetFly_12816OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int BREACH_FIELD_NUMBER = 3;
      private int breach_;
      private byte memoizedIsInitialized;
      private static final S2C_PetFly_12816 DEFAULT_INSTANCE = new S2C_PetFly_12816();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PetFly_12816> PARSER = new AbstractParser<S2C_PetFly_12816>() {
         public S2C_PetFly_12816 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PetFly_12816(input, extensionRegistry);
         }
      };

      private S2C_PetFly_12816(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PetFly_12816() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PetFly_12816();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PetFly_12816(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.breach_ = input.readInt32();
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetFly_12816_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetFly_12816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetFly_12816.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasBreach() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBreach() {
         return this.breach_;
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
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBreach()) {
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
            output.writeInt32(2, this.code_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.breach_);
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
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.breach_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PetFly_12816)) {
            return super.equals(obj);
         } else {
            S2C_PetFly_12816 other = (S2C_PetFly_12816)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasBreach() != other.hasBreach()) {
               return false;
            } else if (this.hasBreach() && this.getBreach() != other.getBreach()) {
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

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasBreach()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBreach();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PetFly_12816 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PetFly_12816)PARSER.parseFrom(data);
      }

      public static S2C_PetFly_12816 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetFly_12816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetFly_12816 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PetFly_12816)PARSER.parseFrom(data);
      }

      public static S2C_PetFly_12816 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetFly_12816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetFly_12816 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PetFly_12816)PARSER.parseFrom(data);
      }

      public static S2C_PetFly_12816 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetFly_12816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetFly_12816 parseFrom(InputStream input) throws IOException {
         return (S2C_PetFly_12816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetFly_12816 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetFly_12816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetFly_12816 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PetFly_12816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PetFly_12816 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetFly_12816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetFly_12816 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PetFly_12816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetFly_12816 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetFly_12816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PetFly_12816 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PetFly_12816 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PetFly_12816> parser() {
         return PARSER;
      }

      public Parser<S2C_PetFly_12816> getParserForType() {
         return PARSER;
      }

      public S2C_PetFly_12816 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PetFly_12816OrBuilder {
         private int bitField0_;
         private int result_;
         private int code_;
         private int breach_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetFly_12816_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetFly_12816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetFly_12816.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_PetFly_12816.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            this.breach_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetFly_12816_descriptor;
         }

         public S2C_PetFly_12816 getDefaultInstanceForType() {
            return PetMsg.S2C_PetFly_12816.getDefaultInstance();
         }

         public S2C_PetFly_12816 build() {
            S2C_PetFly_12816 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PetFly_12816 buildPartial() {
            S2C_PetFly_12816 result = new S2C_PetFly_12816(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.breach_ = this.breach_;
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
            if (other instanceof S2C_PetFly_12816) {
               return this.mergeFrom((S2C_PetFly_12816)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PetFly_12816 other) {
            if (other == PetMsg.S2C_PetFly_12816.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasBreach()) {
                  this.setBreach(other.getBreach());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else {
               return this.hasBreach();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PetFly_12816 parsedMessage = null;

            try {
               parsedMessage = (S2C_PetFly_12816)PetMsg.S2C_PetFly_12816.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PetFly_12816)e.getUnfinishedMessage();
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

         public boolean hasBreach() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBreach() {
            return this.breach_;
         }

         public Builder setBreach(int value) {
            this.bitField0_ |= 4;
            this.breach_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBreach() {
            this.bitField0_ &= -5;
            this.breach_ = 0;
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

   public static final class C2S_PetMerge_12817 extends GeneratedMessageV3 implements C2S_PetMerge_12817OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAINCODE_FIELD_NUMBER = 1;
      private int mainCode_;
      public static final int SLAVECODE_FIELD_NUMBER = 2;
      private int slaveCode_;
      private byte memoizedIsInitialized;
      private static final C2S_PetMerge_12817 DEFAULT_INSTANCE = new C2S_PetMerge_12817();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PetMerge_12817> PARSER = new AbstractParser<C2S_PetMerge_12817>() {
         public C2S_PetMerge_12817 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PetMerge_12817(input, extensionRegistry);
         }
      };

      private C2S_PetMerge_12817(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PetMerge_12817() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PetMerge_12817();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PetMerge_12817(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.mainCode_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.slaveCode_ = input.readInt32();
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetMerge_12817_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetMerge_12817_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetMerge_12817.class, Builder.class);
      }

      public boolean hasMainCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMainCode() {
         return this.mainCode_;
      }

      public boolean hasSlaveCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSlaveCode() {
         return this.slaveCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMainCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSlaveCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.mainCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.slaveCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.mainCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.slaveCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PetMerge_12817)) {
            return super.equals(obj);
         } else {
            C2S_PetMerge_12817 other = (C2S_PetMerge_12817)obj;
            if (this.hasMainCode() != other.hasMainCode()) {
               return false;
            } else if (this.hasMainCode() && this.getMainCode() != other.getMainCode()) {
               return false;
            } else if (this.hasSlaveCode() != other.hasSlaveCode()) {
               return false;
            } else if (this.hasSlaveCode() && this.getSlaveCode() != other.getSlaveCode()) {
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
            if (this.hasMainCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMainCode();
            }

            if (this.hasSlaveCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSlaveCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PetMerge_12817 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PetMerge_12817)PARSER.parseFrom(data);
      }

      public static C2S_PetMerge_12817 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetMerge_12817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetMerge_12817 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PetMerge_12817)PARSER.parseFrom(data);
      }

      public static C2S_PetMerge_12817 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetMerge_12817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetMerge_12817 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PetMerge_12817)PARSER.parseFrom(data);
      }

      public static C2S_PetMerge_12817 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetMerge_12817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetMerge_12817 parseFrom(InputStream input) throws IOException {
         return (C2S_PetMerge_12817)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetMerge_12817 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetMerge_12817)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetMerge_12817 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PetMerge_12817)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PetMerge_12817 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetMerge_12817)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetMerge_12817 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PetMerge_12817)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetMerge_12817 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetMerge_12817)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PetMerge_12817 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PetMerge_12817 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PetMerge_12817> parser() {
         return PARSER;
      }

      public Parser<C2S_PetMerge_12817> getParserForType() {
         return PARSER;
      }

      public C2S_PetMerge_12817 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PetMerge_12817OrBuilder {
         private int bitField0_;
         private int mainCode_;
         private int slaveCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetMerge_12817_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetMerge_12817_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetMerge_12817.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_PetMerge_12817.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.mainCode_ = 0;
            this.bitField0_ &= -2;
            this.slaveCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetMerge_12817_descriptor;
         }

         public C2S_PetMerge_12817 getDefaultInstanceForType() {
            return PetMsg.C2S_PetMerge_12817.getDefaultInstance();
         }

         public C2S_PetMerge_12817 build() {
            C2S_PetMerge_12817 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PetMerge_12817 buildPartial() {
            C2S_PetMerge_12817 result = new C2S_PetMerge_12817(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.mainCode_ = this.mainCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.slaveCode_ = this.slaveCode_;
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
            if (other instanceof C2S_PetMerge_12817) {
               return this.mergeFrom((C2S_PetMerge_12817)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PetMerge_12817 other) {
            if (other == PetMsg.C2S_PetMerge_12817.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMainCode()) {
                  this.setMainCode(other.getMainCode());
               }

               if (other.hasSlaveCode()) {
                  this.setSlaveCode(other.getSlaveCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMainCode()) {
               return false;
            } else {
               return this.hasSlaveCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PetMerge_12817 parsedMessage = null;

            try {
               parsedMessage = (C2S_PetMerge_12817)PetMsg.C2S_PetMerge_12817.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PetMerge_12817)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMainCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMainCode() {
            return this.mainCode_;
         }

         public Builder setMainCode(int value) {
            this.bitField0_ |= 1;
            this.mainCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainCode() {
            this.bitField0_ &= -2;
            this.mainCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSlaveCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSlaveCode() {
            return this.slaveCode_;
         }

         public Builder setSlaveCode(int value) {
            this.bitField0_ |= 2;
            this.slaveCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlaveCode() {
            this.bitField0_ &= -3;
            this.slaveCode_ = 0;
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

   public static final class S2C_PetMerge_12818 extends GeneratedMessageV3 implements S2C_PetMerge_12818OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int MAINCODE_FIELD_NUMBER = 2;
      private int mainCode_;
      public static final int SLAVECODE_FIELD_NUMBER = 3;
      private int slaveCode_;
      public static final int MAINSKILLINDEX_FIELD_NUMBER = 4;
      private Internal.IntList mainSkillIndex_;
      public static final int SLAVESKILLINDEX_FIELD_NUMBER = 5;
      private Internal.IntList slaveSkillIndex_;
      private byte memoizedIsInitialized;
      private static final S2C_PetMerge_12818 DEFAULT_INSTANCE = new S2C_PetMerge_12818();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PetMerge_12818> PARSER = new AbstractParser<S2C_PetMerge_12818>() {
         public S2C_PetMerge_12818 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PetMerge_12818(input, extensionRegistry);
         }
      };

      private S2C_PetMerge_12818(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PetMerge_12818() {
         this.memoizedIsInitialized = -1;
         this.mainSkillIndex_ = emptyIntList();
         this.slaveSkillIndex_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PetMerge_12818();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PetMerge_12818(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.result_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.mainCode_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.slaveCode_ = input.readInt32();
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.mainSkillIndex_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.mainSkillIndex_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.mainSkillIndex_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.slaveSkillIndex_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.slaveSkillIndex_.addInt(input.readInt32());
                        continue;
                     case 42:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.slaveSkillIndex_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.slaveSkillIndex_.addInt(input.readInt32());
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
                     this.mainSkillIndex_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) != 0) {
                  this.mainSkillIndex_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.slaveSkillIndex_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetMerge_12818_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetMerge_12818_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetMerge_12818.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasMainCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMainCode() {
         return this.mainCode_;
      }

      public boolean hasSlaveCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSlaveCode() {
         return this.slaveCode_;
      }

      public List<Integer> getMainSkillIndexList() {
         return this.mainSkillIndex_;
      }

      public int getMainSkillIndexCount() {
         return this.mainSkillIndex_.size();
      }

      public int getMainSkillIndex(int index) {
         return this.mainSkillIndex_.getInt(index);
      }

      public List<Integer> getSlaveSkillIndexList() {
         return this.slaveSkillIndex_;
      }

      public int getSlaveSkillIndexCount() {
         return this.slaveSkillIndex_.size();
      }

      public int getSlaveSkillIndex(int index) {
         return this.slaveSkillIndex_.getInt(index);
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
         } else if (!this.hasMainCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSlaveCode()) {
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
            output.writeInt32(2, this.mainCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.slaveCode_);
         }

         for(int i = 0; i < this.mainSkillIndex_.size(); ++i) {
            output.writeInt32(4, this.mainSkillIndex_.getInt(i));
         }

         for(int i = 0; i < this.slaveSkillIndex_.size(); ++i) {
            output.writeInt32(5, this.slaveSkillIndex_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.mainCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.slaveCode_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.mainSkillIndex_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.mainSkillIndex_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getMainSkillIndexList().size();
            dataSize = 0;

            for(int i = 0; i < this.slaveSkillIndex_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.slaveSkillIndex_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSlaveSkillIndexList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PetMerge_12818)) {
            return super.equals(obj);
         } else {
            S2C_PetMerge_12818 other = (S2C_PetMerge_12818)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasMainCode() != other.hasMainCode()) {
               return false;
            } else if (this.hasMainCode() && this.getMainCode() != other.getMainCode()) {
               return false;
            } else if (this.hasSlaveCode() != other.hasSlaveCode()) {
               return false;
            } else if (this.hasSlaveCode() && this.getSlaveCode() != other.getSlaveCode()) {
               return false;
            } else if (!this.getMainSkillIndexList().equals(other.getMainSkillIndexList())) {
               return false;
            } else if (!this.getSlaveSkillIndexList().equals(other.getSlaveSkillIndexList())) {
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

            if (this.hasMainCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMainCode();
            }

            if (this.hasSlaveCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSlaveCode();
            }

            if (this.getMainSkillIndexCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMainSkillIndexList().hashCode();
            }

            if (this.getSlaveSkillIndexCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getSlaveSkillIndexList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PetMerge_12818 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PetMerge_12818)PARSER.parseFrom(data);
      }

      public static S2C_PetMerge_12818 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetMerge_12818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetMerge_12818 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PetMerge_12818)PARSER.parseFrom(data);
      }

      public static S2C_PetMerge_12818 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetMerge_12818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetMerge_12818 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PetMerge_12818)PARSER.parseFrom(data);
      }

      public static S2C_PetMerge_12818 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetMerge_12818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetMerge_12818 parseFrom(InputStream input) throws IOException {
         return (S2C_PetMerge_12818)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetMerge_12818 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetMerge_12818)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetMerge_12818 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PetMerge_12818)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PetMerge_12818 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetMerge_12818)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetMerge_12818 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PetMerge_12818)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetMerge_12818 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetMerge_12818)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PetMerge_12818 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PetMerge_12818 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PetMerge_12818> parser() {
         return PARSER;
      }

      public Parser<S2C_PetMerge_12818> getParserForType() {
         return PARSER;
      }

      public S2C_PetMerge_12818 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PetMerge_12818OrBuilder {
         private int bitField0_;
         private int result_;
         private int mainCode_;
         private int slaveCode_;
         private Internal.IntList mainSkillIndex_;
         private Internal.IntList slaveSkillIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetMerge_12818_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetMerge_12818_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetMerge_12818.class, Builder.class);
         }

         private Builder() {
            this.mainSkillIndex_ = PetMsg.S2C_PetMerge_12818.emptyIntList();
            this.slaveSkillIndex_ = PetMsg.S2C_PetMerge_12818.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.mainSkillIndex_ = PetMsg.S2C_PetMerge_12818.emptyIntList();
            this.slaveSkillIndex_ = PetMsg.S2C_PetMerge_12818.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_PetMerge_12818.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.mainCode_ = 0;
            this.bitField0_ &= -3;
            this.slaveCode_ = 0;
            this.bitField0_ &= -5;
            this.mainSkillIndex_ = PetMsg.S2C_PetMerge_12818.emptyIntList();
            this.bitField0_ &= -9;
            this.slaveSkillIndex_ = PetMsg.S2C_PetMerge_12818.emptyIntList();
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetMerge_12818_descriptor;
         }

         public S2C_PetMerge_12818 getDefaultInstanceForType() {
            return PetMsg.S2C_PetMerge_12818.getDefaultInstance();
         }

         public S2C_PetMerge_12818 build() {
            S2C_PetMerge_12818 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PetMerge_12818 buildPartial() {
            S2C_PetMerge_12818 result = new S2C_PetMerge_12818(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.mainCode_ = this.mainCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.slaveCode_ = this.slaveCode_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.mainSkillIndex_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.mainSkillIndex_ = this.mainSkillIndex_;
            if ((this.bitField0_ & 16) != 0) {
               this.slaveSkillIndex_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.slaveSkillIndex_ = this.slaveSkillIndex_;
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
            if (other instanceof S2C_PetMerge_12818) {
               return this.mergeFrom((S2C_PetMerge_12818)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PetMerge_12818 other) {
            if (other == PetMsg.S2C_PetMerge_12818.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasMainCode()) {
                  this.setMainCode(other.getMainCode());
               }

               if (other.hasSlaveCode()) {
                  this.setSlaveCode(other.getSlaveCode());
               }

               if (!other.mainSkillIndex_.isEmpty()) {
                  if (this.mainSkillIndex_.isEmpty()) {
                     this.mainSkillIndex_ = other.mainSkillIndex_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureMainSkillIndexIsMutable();
                     this.mainSkillIndex_.addAll(other.mainSkillIndex_);
                  }

                  this.onChanged();
               }

               if (!other.slaveSkillIndex_.isEmpty()) {
                  if (this.slaveSkillIndex_.isEmpty()) {
                     this.slaveSkillIndex_ = other.slaveSkillIndex_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureSlaveSkillIndexIsMutable();
                     this.slaveSkillIndex_.addAll(other.slaveSkillIndex_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasMainCode()) {
               return false;
            } else {
               return this.hasSlaveCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PetMerge_12818 parsedMessage = null;

            try {
               parsedMessage = (S2C_PetMerge_12818)PetMsg.S2C_PetMerge_12818.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PetMerge_12818)e.getUnfinishedMessage();
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

         public boolean hasMainCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMainCode() {
            return this.mainCode_;
         }

         public Builder setMainCode(int value) {
            this.bitField0_ |= 2;
            this.mainCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainCode() {
            this.bitField0_ &= -3;
            this.mainCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSlaveCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSlaveCode() {
            return this.slaveCode_;
         }

         public Builder setSlaveCode(int value) {
            this.bitField0_ |= 4;
            this.slaveCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlaveCode() {
            this.bitField0_ &= -5;
            this.slaveCode_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureMainSkillIndexIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.mainSkillIndex_ = PetMsg.S2C_PetMerge_12818.mutableCopy(this.mainSkillIndex_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getMainSkillIndexList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.mainSkillIndex_) : this.mainSkillIndex_);
         }

         public int getMainSkillIndexCount() {
            return this.mainSkillIndex_.size();
         }

         public int getMainSkillIndex(int index) {
            return this.mainSkillIndex_.getInt(index);
         }

         public Builder setMainSkillIndex(int index, int value) {
            this.ensureMainSkillIndexIsMutable();
            this.mainSkillIndex_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addMainSkillIndex(int value) {
            this.ensureMainSkillIndexIsMutable();
            this.mainSkillIndex_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllMainSkillIndex(Iterable<? extends Integer> values) {
            this.ensureMainSkillIndexIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.mainSkillIndex_);
            this.onChanged();
            return this;
         }

         public Builder clearMainSkillIndex() {
            this.mainSkillIndex_ = PetMsg.S2C_PetMerge_12818.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         private void ensureSlaveSkillIndexIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.slaveSkillIndex_ = PetMsg.S2C_PetMerge_12818.mutableCopy(this.slaveSkillIndex_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getSlaveSkillIndexList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.slaveSkillIndex_) : this.slaveSkillIndex_);
         }

         public int getSlaveSkillIndexCount() {
            return this.slaveSkillIndex_.size();
         }

         public int getSlaveSkillIndex(int index) {
            return this.slaveSkillIndex_.getInt(index);
         }

         public Builder setSlaveSkillIndex(int index, int value) {
            this.ensureSlaveSkillIndexIsMutable();
            this.slaveSkillIndex_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSlaveSkillIndex(int value) {
            this.ensureSlaveSkillIndexIsMutable();
            this.slaveSkillIndex_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSlaveSkillIndex(Iterable<? extends Integer> values) {
            this.ensureSlaveSkillIndexIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.slaveSkillIndex_);
            this.onChanged();
            return this;
         }

         public Builder clearSlaveSkillIndex() {
            this.slaveSkillIndex_ = PetMsg.S2C_PetMerge_12818.emptyIntList();
            this.bitField0_ &= -17;
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

   public static final class C2S_LeanSkill_12819 extends GeneratedMessageV3 implements C2S_LeanSkill_12819OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      private byte memoizedIsInitialized;
      private static final C2S_LeanSkill_12819 DEFAULT_INSTANCE = new C2S_LeanSkill_12819();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LeanSkill_12819> PARSER = new AbstractParser<C2S_LeanSkill_12819>() {
         public C2S_LeanSkill_12819 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LeanSkill_12819(input, extensionRegistry);
         }
      };

      private C2S_LeanSkill_12819(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LeanSkill_12819() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LeanSkill_12819();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LeanSkill_12819(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.itemCode_ = input.readInt32();
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_LeanSkill_12819_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_LeanSkill_12819_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LeanSkill_12819.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
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
         } else if (!this.hasItemCode()) {
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
            output.writeInt32(2, this.itemCode_);
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
               size += CodedOutputStream.computeInt32Size(2, this.itemCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LeanSkill_12819)) {
            return super.equals(obj);
         } else {
            C2S_LeanSkill_12819 other = (C2S_LeanSkill_12819)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
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

            if (this.hasItemCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LeanSkill_12819 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LeanSkill_12819)PARSER.parseFrom(data);
      }

      public static C2S_LeanSkill_12819 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LeanSkill_12819)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LeanSkill_12819 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LeanSkill_12819)PARSER.parseFrom(data);
      }

      public static C2S_LeanSkill_12819 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LeanSkill_12819)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LeanSkill_12819 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LeanSkill_12819)PARSER.parseFrom(data);
      }

      public static C2S_LeanSkill_12819 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LeanSkill_12819)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LeanSkill_12819 parseFrom(InputStream input) throws IOException {
         return (C2S_LeanSkill_12819)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LeanSkill_12819 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LeanSkill_12819)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LeanSkill_12819 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LeanSkill_12819)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LeanSkill_12819 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LeanSkill_12819)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LeanSkill_12819 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LeanSkill_12819)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LeanSkill_12819 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LeanSkill_12819)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LeanSkill_12819 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LeanSkill_12819 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LeanSkill_12819> parser() {
         return PARSER;
      }

      public Parser<C2S_LeanSkill_12819> getParserForType() {
         return PARSER;
      }

      public C2S_LeanSkill_12819 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LeanSkill_12819OrBuilder {
         private int bitField0_;
         private int code_;
         private int itemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_LeanSkill_12819_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_LeanSkill_12819_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LeanSkill_12819.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_LeanSkill_12819.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_LeanSkill_12819_descriptor;
         }

         public C2S_LeanSkill_12819 getDefaultInstanceForType() {
            return PetMsg.C2S_LeanSkill_12819.getDefaultInstance();
         }

         public C2S_LeanSkill_12819 build() {
            C2S_LeanSkill_12819 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LeanSkill_12819 buildPartial() {
            C2S_LeanSkill_12819 result = new C2S_LeanSkill_12819(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemCode_ = this.itemCode_;
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
            if (other instanceof C2S_LeanSkill_12819) {
               return this.mergeFrom((C2S_LeanSkill_12819)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LeanSkill_12819 other) {
            if (other == PetMsg.C2S_LeanSkill_12819.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
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
               return this.hasItemCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LeanSkill_12819 parsedMessage = null;

            try {
               parsedMessage = (C2S_LeanSkill_12819)PetMsg.C2S_LeanSkill_12819.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LeanSkill_12819)e.getUnfinishedMessage();
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

         public boolean hasItemCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 2;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -3;
            this.itemCode_ = 0;
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

   public static final class S2C_LeanSkill_12820 extends GeneratedMessageV3 implements S2C_LeanSkill_12820OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      private byte memoizedIsInitialized;
      private static final S2C_LeanSkill_12820 DEFAULT_INSTANCE = new S2C_LeanSkill_12820();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LeanSkill_12820> PARSER = new AbstractParser<S2C_LeanSkill_12820>() {
         public S2C_LeanSkill_12820 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LeanSkill_12820(input, extensionRegistry);
         }
      };

      private S2C_LeanSkill_12820(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LeanSkill_12820() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LeanSkill_12820();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LeanSkill_12820(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_LeanSkill_12820_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_LeanSkill_12820_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LeanSkill_12820.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
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
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.result_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
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
         } else if (!(obj instanceof S2C_LeanSkill_12820)) {
            return super.equals(obj);
         } else {
            S2C_LeanSkill_12820 other = (S2C_LeanSkill_12820)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
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

      public static S2C_LeanSkill_12820 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LeanSkill_12820)PARSER.parseFrom(data);
      }

      public static S2C_LeanSkill_12820 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LeanSkill_12820)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LeanSkill_12820 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LeanSkill_12820)PARSER.parseFrom(data);
      }

      public static S2C_LeanSkill_12820 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LeanSkill_12820)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LeanSkill_12820 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LeanSkill_12820)PARSER.parseFrom(data);
      }

      public static S2C_LeanSkill_12820 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LeanSkill_12820)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LeanSkill_12820 parseFrom(InputStream input) throws IOException {
         return (S2C_LeanSkill_12820)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LeanSkill_12820 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LeanSkill_12820)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LeanSkill_12820 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LeanSkill_12820)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LeanSkill_12820 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LeanSkill_12820)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LeanSkill_12820 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LeanSkill_12820)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LeanSkill_12820 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LeanSkill_12820)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LeanSkill_12820 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LeanSkill_12820 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LeanSkill_12820> parser() {
         return PARSER;
      }

      public Parser<S2C_LeanSkill_12820> getParserForType() {
         return PARSER;
      }

      public S2C_LeanSkill_12820 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LeanSkill_12820OrBuilder {
         private int bitField0_;
         private int result_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_LeanSkill_12820_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_LeanSkill_12820_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LeanSkill_12820.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_LeanSkill_12820.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_LeanSkill_12820_descriptor;
         }

         public S2C_LeanSkill_12820 getDefaultInstanceForType() {
            return PetMsg.S2C_LeanSkill_12820.getDefaultInstance();
         }

         public S2C_LeanSkill_12820 build() {
            S2C_LeanSkill_12820 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LeanSkill_12820 buildPartial() {
            S2C_LeanSkill_12820 result = new S2C_LeanSkill_12820(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_LeanSkill_12820) {
               return this.mergeFrom((S2C_LeanSkill_12820)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LeanSkill_12820 other) {
            if (other == PetMsg.S2C_LeanSkill_12820.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
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
            if (!this.hasResult()) {
               return false;
            } else {
               return this.hasCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LeanSkill_12820 parsedMessage = null;

            try {
               parsedMessage = (S2C_LeanSkill_12820)PetMsg.S2C_LeanSkill_12820.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LeanSkill_12820)e.getUnfinishedMessage();
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

   public static final class C2S_TransferGroup_12821 extends GeneratedMessageV3 implements C2S_TransferGroup_12821OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAINCODE_FIELD_NUMBER = 1;
      private int mainCode_;
      public static final int SLAVECODE_FIELD_NUMBER = 2;
      private int slaveCode_;
      private byte memoizedIsInitialized;
      private static final C2S_TransferGroup_12821 DEFAULT_INSTANCE = new C2S_TransferGroup_12821();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TransferGroup_12821> PARSER = new AbstractParser<C2S_TransferGroup_12821>() {
         public C2S_TransferGroup_12821 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TransferGroup_12821(input, extensionRegistry);
         }
      };

      private C2S_TransferGroup_12821(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TransferGroup_12821() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TransferGroup_12821();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TransferGroup_12821(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.mainCode_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.slaveCode_ = input.readInt32();
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_TransferGroup_12821_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_TransferGroup_12821_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TransferGroup_12821.class, Builder.class);
      }

      public boolean hasMainCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMainCode() {
         return this.mainCode_;
      }

      public boolean hasSlaveCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSlaveCode() {
         return this.slaveCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMainCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSlaveCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.mainCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.slaveCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.mainCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.slaveCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TransferGroup_12821)) {
            return super.equals(obj);
         } else {
            C2S_TransferGroup_12821 other = (C2S_TransferGroup_12821)obj;
            if (this.hasMainCode() != other.hasMainCode()) {
               return false;
            } else if (this.hasMainCode() && this.getMainCode() != other.getMainCode()) {
               return false;
            } else if (this.hasSlaveCode() != other.hasSlaveCode()) {
               return false;
            } else if (this.hasSlaveCode() && this.getSlaveCode() != other.getSlaveCode()) {
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
            if (this.hasMainCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMainCode();
            }

            if (this.hasSlaveCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSlaveCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TransferGroup_12821 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TransferGroup_12821)PARSER.parseFrom(data);
      }

      public static C2S_TransferGroup_12821 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TransferGroup_12821)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TransferGroup_12821 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TransferGroup_12821)PARSER.parseFrom(data);
      }

      public static C2S_TransferGroup_12821 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TransferGroup_12821)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TransferGroup_12821 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TransferGroup_12821)PARSER.parseFrom(data);
      }

      public static C2S_TransferGroup_12821 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TransferGroup_12821)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TransferGroup_12821 parseFrom(InputStream input) throws IOException {
         return (C2S_TransferGroup_12821)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TransferGroup_12821 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TransferGroup_12821)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TransferGroup_12821 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TransferGroup_12821)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TransferGroup_12821 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TransferGroup_12821)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TransferGroup_12821 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TransferGroup_12821)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TransferGroup_12821 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TransferGroup_12821)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TransferGroup_12821 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TransferGroup_12821 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TransferGroup_12821> parser() {
         return PARSER;
      }

      public Parser<C2S_TransferGroup_12821> getParserForType() {
         return PARSER;
      }

      public C2S_TransferGroup_12821 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TransferGroup_12821OrBuilder {
         private int bitField0_;
         private int mainCode_;
         private int slaveCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_TransferGroup_12821_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_TransferGroup_12821_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TransferGroup_12821.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_TransferGroup_12821.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.mainCode_ = 0;
            this.bitField0_ &= -2;
            this.slaveCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_TransferGroup_12821_descriptor;
         }

         public C2S_TransferGroup_12821 getDefaultInstanceForType() {
            return PetMsg.C2S_TransferGroup_12821.getDefaultInstance();
         }

         public C2S_TransferGroup_12821 build() {
            C2S_TransferGroup_12821 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TransferGroup_12821 buildPartial() {
            C2S_TransferGroup_12821 result = new C2S_TransferGroup_12821(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.mainCode_ = this.mainCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.slaveCode_ = this.slaveCode_;
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
            if (other instanceof C2S_TransferGroup_12821) {
               return this.mergeFrom((C2S_TransferGroup_12821)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TransferGroup_12821 other) {
            if (other == PetMsg.C2S_TransferGroup_12821.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMainCode()) {
                  this.setMainCode(other.getMainCode());
               }

               if (other.hasSlaveCode()) {
                  this.setSlaveCode(other.getSlaveCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMainCode()) {
               return false;
            } else {
               return this.hasSlaveCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TransferGroup_12821 parsedMessage = null;

            try {
               parsedMessage = (C2S_TransferGroup_12821)PetMsg.C2S_TransferGroup_12821.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TransferGroup_12821)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMainCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMainCode() {
            return this.mainCode_;
         }

         public Builder setMainCode(int value) {
            this.bitField0_ |= 1;
            this.mainCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainCode() {
            this.bitField0_ &= -2;
            this.mainCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSlaveCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSlaveCode() {
            return this.slaveCode_;
         }

         public Builder setSlaveCode(int value) {
            this.bitField0_ |= 2;
            this.slaveCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlaveCode() {
            this.bitField0_ &= -3;
            this.slaveCode_ = 0;
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

   public static final class S2C_TransferGroup_12822 extends GeneratedMessageV3 implements S2C_TransferGroup_12822OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int MAINCODE_FIELD_NUMBER = 2;
      private int mainCode_;
      public static final int SLAVECODE_FIELD_NUMBER = 3;
      private int slaveCode_;
      private byte memoizedIsInitialized;
      private static final S2C_TransferGroup_12822 DEFAULT_INSTANCE = new S2C_TransferGroup_12822();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TransferGroup_12822> PARSER = new AbstractParser<S2C_TransferGroup_12822>() {
         public S2C_TransferGroup_12822 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TransferGroup_12822(input, extensionRegistry);
         }
      };

      private S2C_TransferGroup_12822(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TransferGroup_12822() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TransferGroup_12822();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TransferGroup_12822(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.mainCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.slaveCode_ = input.readInt32();
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_TransferGroup_12822_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_TransferGroup_12822_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TransferGroup_12822.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasMainCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMainCode() {
         return this.mainCode_;
      }

      public boolean hasSlaveCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSlaveCode() {
         return this.slaveCode_;
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
         } else if (!this.hasMainCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSlaveCode()) {
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
            output.writeInt32(2, this.mainCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.slaveCode_);
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
               size += CodedOutputStream.computeInt32Size(2, this.mainCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.slaveCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TransferGroup_12822)) {
            return super.equals(obj);
         } else {
            S2C_TransferGroup_12822 other = (S2C_TransferGroup_12822)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasMainCode() != other.hasMainCode()) {
               return false;
            } else if (this.hasMainCode() && this.getMainCode() != other.getMainCode()) {
               return false;
            } else if (this.hasSlaveCode() != other.hasSlaveCode()) {
               return false;
            } else if (this.hasSlaveCode() && this.getSlaveCode() != other.getSlaveCode()) {
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

            if (this.hasMainCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMainCode();
            }

            if (this.hasSlaveCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSlaveCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TransferGroup_12822 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TransferGroup_12822)PARSER.parseFrom(data);
      }

      public static S2C_TransferGroup_12822 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TransferGroup_12822)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TransferGroup_12822 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TransferGroup_12822)PARSER.parseFrom(data);
      }

      public static S2C_TransferGroup_12822 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TransferGroup_12822)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TransferGroup_12822 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TransferGroup_12822)PARSER.parseFrom(data);
      }

      public static S2C_TransferGroup_12822 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TransferGroup_12822)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TransferGroup_12822 parseFrom(InputStream input) throws IOException {
         return (S2C_TransferGroup_12822)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TransferGroup_12822 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TransferGroup_12822)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TransferGroup_12822 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TransferGroup_12822)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TransferGroup_12822 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TransferGroup_12822)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TransferGroup_12822 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TransferGroup_12822)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TransferGroup_12822 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TransferGroup_12822)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TransferGroup_12822 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TransferGroup_12822 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TransferGroup_12822> parser() {
         return PARSER;
      }

      public Parser<S2C_TransferGroup_12822> getParserForType() {
         return PARSER;
      }

      public S2C_TransferGroup_12822 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TransferGroup_12822OrBuilder {
         private int bitField0_;
         private int result_;
         private int mainCode_;
         private int slaveCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_TransferGroup_12822_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_TransferGroup_12822_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TransferGroup_12822.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_TransferGroup_12822.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.mainCode_ = 0;
            this.bitField0_ &= -3;
            this.slaveCode_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_TransferGroup_12822_descriptor;
         }

         public S2C_TransferGroup_12822 getDefaultInstanceForType() {
            return PetMsg.S2C_TransferGroup_12822.getDefaultInstance();
         }

         public S2C_TransferGroup_12822 build() {
            S2C_TransferGroup_12822 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TransferGroup_12822 buildPartial() {
            S2C_TransferGroup_12822 result = new S2C_TransferGroup_12822(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.mainCode_ = this.mainCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.slaveCode_ = this.slaveCode_;
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
            if (other instanceof S2C_TransferGroup_12822) {
               return this.mergeFrom((S2C_TransferGroup_12822)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TransferGroup_12822 other) {
            if (other == PetMsg.S2C_TransferGroup_12822.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasMainCode()) {
                  this.setMainCode(other.getMainCode());
               }

               if (other.hasSlaveCode()) {
                  this.setSlaveCode(other.getSlaveCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasMainCode()) {
               return false;
            } else {
               return this.hasSlaveCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TransferGroup_12822 parsedMessage = null;

            try {
               parsedMessage = (S2C_TransferGroup_12822)PetMsg.S2C_TransferGroup_12822.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TransferGroup_12822)e.getUnfinishedMessage();
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

         public boolean hasMainCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMainCode() {
            return this.mainCode_;
         }

         public Builder setMainCode(int value) {
            this.bitField0_ |= 2;
            this.mainCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainCode() {
            this.bitField0_ &= -3;
            this.mainCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSlaveCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSlaveCode() {
            return this.slaveCode_;
         }

         public Builder setSlaveCode(int value) {
            this.bitField0_ |= 4;
            this.slaveCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlaveCode() {
            this.bitField0_ &= -5;
            this.slaveCode_ = 0;
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

   public static final class HatchSoltInfo extends GeneratedMessageV3 implements HatchSoltInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int EGGID_FIELD_NUMBER = 3;
      private int eggId_;
      public static final int NEEDTIME_FIELD_NUMBER = 4;
      private int needTime_;
      public static final int STARTTIME_FIELD_NUMBER = 5;
      private int startTime_;
      private byte memoizedIsInitialized;
      private static final HatchSoltInfo DEFAULT_INSTANCE = new HatchSoltInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<HatchSoltInfo> PARSER = new AbstractParser<HatchSoltInfo>() {
         public HatchSoltInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HatchSoltInfo(input, extensionRegistry);
         }
      };

      private HatchSoltInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HatchSoltInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HatchSoltInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HatchSoltInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 24:
                        this.bitField0_ |= 2;
                        this.eggId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.needTime_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.startTime_ = input.readInt32();
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_HatchSoltInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_HatchSoltInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HatchSoltInfo.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public boolean hasEggId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEggId() {
         return this.eggId_;
      }

      public boolean hasNeedTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getNeedTime() {
         return this.needTime_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.eggId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.needTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.startTime_);
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
               size += CodedOutputStream.computeInt32Size(3, this.eggId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.needTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.startTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HatchSoltInfo)) {
            return super.equals(obj);
         } else {
            HatchSoltInfo other = (HatchSoltInfo)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
               return false;
            } else if (this.hasEggId() != other.hasEggId()) {
               return false;
            } else if (this.hasEggId() && this.getEggId() != other.getEggId()) {
               return false;
            } else if (this.hasNeedTime() != other.hasNeedTime()) {
               return false;
            } else if (this.hasNeedTime() && this.getNeedTime() != other.getNeedTime()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
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

            if (this.hasEggId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEggId();
            }

            if (this.hasNeedTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getNeedTime();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getStartTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HatchSoltInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HatchSoltInfo)PARSER.parseFrom(data);
      }

      public static HatchSoltInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HatchSoltInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HatchSoltInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HatchSoltInfo)PARSER.parseFrom(data);
      }

      public static HatchSoltInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HatchSoltInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HatchSoltInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HatchSoltInfo)PARSER.parseFrom(data);
      }

      public static HatchSoltInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HatchSoltInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HatchSoltInfo parseFrom(InputStream input) throws IOException {
         return (HatchSoltInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HatchSoltInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HatchSoltInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HatchSoltInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (HatchSoltInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HatchSoltInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HatchSoltInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HatchSoltInfo parseFrom(CodedInputStream input) throws IOException {
         return (HatchSoltInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HatchSoltInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HatchSoltInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HatchSoltInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HatchSoltInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HatchSoltInfo> parser() {
         return PARSER;
      }

      public Parser<HatchSoltInfo> getParserForType() {
         return PARSER;
      }

      public HatchSoltInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HatchSoltInfoOrBuilder {
         private int bitField0_;
         private int position_;
         private int eggId_;
         private int needTime_;
         private int startTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_HatchSoltInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_HatchSoltInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HatchSoltInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.HatchSoltInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 0;
            this.bitField0_ &= -2;
            this.eggId_ = 0;
            this.bitField0_ &= -3;
            this.needTime_ = 0;
            this.bitField0_ &= -5;
            this.startTime_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_HatchSoltInfo_descriptor;
         }

         public HatchSoltInfo getDefaultInstanceForType() {
            return PetMsg.HatchSoltInfo.getDefaultInstance();
         }

         public HatchSoltInfo build() {
            HatchSoltInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HatchSoltInfo buildPartial() {
            HatchSoltInfo result = new HatchSoltInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.position_ = this.position_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.eggId_ = this.eggId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.needTime_ = this.needTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.startTime_ = this.startTime_;
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
            if (other instanceof HatchSoltInfo) {
               return this.mergeFrom((HatchSoltInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HatchSoltInfo other) {
            if (other == PetMsg.HatchSoltInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasEggId()) {
                  this.setEggId(other.getEggId());
               }

               if (other.hasNeedTime()) {
                  this.setNeedTime(other.getNeedTime());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
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
            HatchSoltInfo parsedMessage = null;

            try {
               parsedMessage = (HatchSoltInfo)PetMsg.HatchSoltInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HatchSoltInfo)e.getUnfinishedMessage();
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

         public boolean hasEggId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEggId() {
            return this.eggId_;
         }

         public Builder setEggId(int value) {
            this.bitField0_ |= 2;
            this.eggId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEggId() {
            this.bitField0_ &= -3;
            this.eggId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNeedTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getNeedTime() {
            return this.needTime_;
         }

         public Builder setNeedTime(int value) {
            this.bitField0_ |= 4;
            this.needTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNeedTime() {
            this.bitField0_ &= -5;
            this.needTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 8;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -9;
            this.startTime_ = 0;
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

   public static final class C2S_HatchUi_12841 extends GeneratedMessageV3 implements C2S_HatchUi_12841OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_HatchUi_12841 DEFAULT_INSTANCE = new C2S_HatchUi_12841();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HatchUi_12841> PARSER = new AbstractParser<C2S_HatchUi_12841>() {
         public C2S_HatchUi_12841 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HatchUi_12841(input, extensionRegistry);
         }
      };

      private C2S_HatchUi_12841(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HatchUi_12841() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HatchUi_12841();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HatchUi_12841(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_HatchUi_12841_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_HatchUi_12841_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HatchUi_12841.class, Builder.class);
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
         } else if (!(obj instanceof C2S_HatchUi_12841)) {
            return super.equals(obj);
         } else {
            C2S_HatchUi_12841 other = (C2S_HatchUi_12841)obj;
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

      public static C2S_HatchUi_12841 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HatchUi_12841)PARSER.parseFrom(data);
      }

      public static C2S_HatchUi_12841 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HatchUi_12841)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HatchUi_12841 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HatchUi_12841)PARSER.parseFrom(data);
      }

      public static C2S_HatchUi_12841 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HatchUi_12841)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HatchUi_12841 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HatchUi_12841)PARSER.parseFrom(data);
      }

      public static C2S_HatchUi_12841 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HatchUi_12841)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HatchUi_12841 parseFrom(InputStream input) throws IOException {
         return (C2S_HatchUi_12841)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HatchUi_12841 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HatchUi_12841)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HatchUi_12841 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HatchUi_12841)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HatchUi_12841 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HatchUi_12841)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HatchUi_12841 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HatchUi_12841)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HatchUi_12841 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HatchUi_12841)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HatchUi_12841 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HatchUi_12841 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HatchUi_12841> parser() {
         return PARSER;
      }

      public Parser<C2S_HatchUi_12841> getParserForType() {
         return PARSER;
      }

      public C2S_HatchUi_12841 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HatchUi_12841OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_HatchUi_12841_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_HatchUi_12841_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HatchUi_12841.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_HatchUi_12841.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_HatchUi_12841_descriptor;
         }

         public C2S_HatchUi_12841 getDefaultInstanceForType() {
            return PetMsg.C2S_HatchUi_12841.getDefaultInstance();
         }

         public C2S_HatchUi_12841 build() {
            C2S_HatchUi_12841 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HatchUi_12841 buildPartial() {
            C2S_HatchUi_12841 result = new C2S_HatchUi_12841(this);
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
            if (other instanceof C2S_HatchUi_12841) {
               return this.mergeFrom((C2S_HatchUi_12841)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HatchUi_12841 other) {
            if (other == PetMsg.C2S_HatchUi_12841.getDefaultInstance()) {
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
            C2S_HatchUi_12841 parsedMessage = null;

            try {
               parsedMessage = (C2S_HatchUi_12841)PetMsg.C2S_HatchUi_12841.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HatchUi_12841)e.getUnfinishedMessage();
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

   public static final class S2C_HatchUi_12842 extends GeneratedMessageV3 implements S2C_HatchUi_12842OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HATCHLV_FIELD_NUMBER = 1;
      private int hatchLv_;
      public static final int HATCHEXP_FIELD_NUMBER = 2;
      private int hatchExp_;
      public static final int HATCHINFOS_FIELD_NUMBER = 3;
      private List<HatchSoltInfo> hatchInfos_;
      private byte memoizedIsInitialized;
      private static final S2C_HatchUi_12842 DEFAULT_INSTANCE = new S2C_HatchUi_12842();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HatchUi_12842> PARSER = new AbstractParser<S2C_HatchUi_12842>() {
         public S2C_HatchUi_12842 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HatchUi_12842(input, extensionRegistry);
         }
      };

      private S2C_HatchUi_12842(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HatchUi_12842() {
         this.memoizedIsInitialized = -1;
         this.hatchInfos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HatchUi_12842();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HatchUi_12842(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hatchLv_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.hatchExp_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.hatchInfos_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.hatchInfos_.add(input.readMessage(PetMsg.HatchSoltInfo.PARSER, extensionRegistry));
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
               if ((mutable_bitField0_ & 4) != 0) {
                  this.hatchInfos_ = Collections.unmodifiableList(this.hatchInfos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_HatchUi_12842_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_HatchUi_12842_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HatchUi_12842.class, Builder.class);
      }

      public boolean hasHatchLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHatchLv() {
         return this.hatchLv_;
      }

      public boolean hasHatchExp() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHatchExp() {
         return this.hatchExp_;
      }

      public List<HatchSoltInfo> getHatchInfosList() {
         return this.hatchInfos_;
      }

      public List<? extends HatchSoltInfoOrBuilder> getHatchInfosOrBuilderList() {
         return this.hatchInfos_;
      }

      public int getHatchInfosCount() {
         return this.hatchInfos_.size();
      }

      public HatchSoltInfo getHatchInfos(int index) {
         return (HatchSoltInfo)this.hatchInfos_.get(index);
      }

      public HatchSoltInfoOrBuilder getHatchInfosOrBuilder(int index) {
         return (HatchSoltInfoOrBuilder)this.hatchInfos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHatchLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHatchExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getHatchInfosCount(); ++i) {
               if (!this.getHatchInfos(i).isInitialized()) {
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
            output.writeInt32(1, this.hatchLv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.hatchExp_);
         }

         for(int i = 0; i < this.hatchInfos_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.hatchInfos_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.hatchLv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.hatchExp_);
            }

            for(int i = 0; i < this.hatchInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.hatchInfos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HatchUi_12842)) {
            return super.equals(obj);
         } else {
            S2C_HatchUi_12842 other = (S2C_HatchUi_12842)obj;
            if (this.hasHatchLv() != other.hasHatchLv()) {
               return false;
            } else if (this.hasHatchLv() && this.getHatchLv() != other.getHatchLv()) {
               return false;
            } else if (this.hasHatchExp() != other.hasHatchExp()) {
               return false;
            } else if (this.hasHatchExp() && this.getHatchExp() != other.getHatchExp()) {
               return false;
            } else if (!this.getHatchInfosList().equals(other.getHatchInfosList())) {
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
            if (this.hasHatchLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHatchLv();
            }

            if (this.hasHatchExp()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHatchExp();
            }

            if (this.getHatchInfosCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHatchInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HatchUi_12842 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HatchUi_12842)PARSER.parseFrom(data);
      }

      public static S2C_HatchUi_12842 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HatchUi_12842)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HatchUi_12842 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HatchUi_12842)PARSER.parseFrom(data);
      }

      public static S2C_HatchUi_12842 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HatchUi_12842)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HatchUi_12842 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HatchUi_12842)PARSER.parseFrom(data);
      }

      public static S2C_HatchUi_12842 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HatchUi_12842)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HatchUi_12842 parseFrom(InputStream input) throws IOException {
         return (S2C_HatchUi_12842)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HatchUi_12842 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HatchUi_12842)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HatchUi_12842 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HatchUi_12842)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HatchUi_12842 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HatchUi_12842)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HatchUi_12842 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HatchUi_12842)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HatchUi_12842 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HatchUi_12842)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HatchUi_12842 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HatchUi_12842 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HatchUi_12842> parser() {
         return PARSER;
      }

      public Parser<S2C_HatchUi_12842> getParserForType() {
         return PARSER;
      }

      public S2C_HatchUi_12842 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HatchUi_12842OrBuilder {
         private int bitField0_;
         private int hatchLv_;
         private int hatchExp_;
         private List<HatchSoltInfo> hatchInfos_;
         private RepeatedFieldBuilderV3<HatchSoltInfo, HatchSoltInfo.Builder, HatchSoltInfoOrBuilder> hatchInfosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_HatchUi_12842_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_HatchUi_12842_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HatchUi_12842.class, Builder.class);
         }

         private Builder() {
            this.hatchInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hatchInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_HatchUi_12842.alwaysUseFieldBuilders) {
               this.getHatchInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.hatchLv_ = 0;
            this.bitField0_ &= -2;
            this.hatchExp_ = 0;
            this.bitField0_ &= -3;
            if (this.hatchInfosBuilder_ == null) {
               this.hatchInfos_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.hatchInfosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_HatchUi_12842_descriptor;
         }

         public S2C_HatchUi_12842 getDefaultInstanceForType() {
            return PetMsg.S2C_HatchUi_12842.getDefaultInstance();
         }

         public S2C_HatchUi_12842 build() {
            S2C_HatchUi_12842 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HatchUi_12842 buildPartial() {
            S2C_HatchUi_12842 result = new S2C_HatchUi_12842(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hatchLv_ = this.hatchLv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hatchExp_ = this.hatchExp_;
               to_bitField0_ |= 2;
            }

            if (this.hatchInfosBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.hatchInfos_ = Collections.unmodifiableList(this.hatchInfos_);
                  this.bitField0_ &= -5;
               }

               result.hatchInfos_ = this.hatchInfos_;
            } else {
               result.hatchInfos_ = this.hatchInfosBuilder_.build();
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
            if (other instanceof S2C_HatchUi_12842) {
               return this.mergeFrom((S2C_HatchUi_12842)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HatchUi_12842 other) {
            if (other == PetMsg.S2C_HatchUi_12842.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHatchLv()) {
                  this.setHatchLv(other.getHatchLv());
               }

               if (other.hasHatchExp()) {
                  this.setHatchExp(other.getHatchExp());
               }

               if (this.hatchInfosBuilder_ == null) {
                  if (!other.hatchInfos_.isEmpty()) {
                     if (this.hatchInfos_.isEmpty()) {
                        this.hatchInfos_ = other.hatchInfos_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureHatchInfosIsMutable();
                        this.hatchInfos_.addAll(other.hatchInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.hatchInfos_.isEmpty()) {
                  if (this.hatchInfosBuilder_.isEmpty()) {
                     this.hatchInfosBuilder_.dispose();
                     this.hatchInfosBuilder_ = null;
                     this.hatchInfos_ = other.hatchInfos_;
                     this.bitField0_ &= -5;
                     this.hatchInfosBuilder_ = PetMsg.S2C_HatchUi_12842.alwaysUseFieldBuilders ? this.getHatchInfosFieldBuilder() : null;
                  } else {
                     this.hatchInfosBuilder_.addAllMessages(other.hatchInfos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHatchLv()) {
               return false;
            } else if (!this.hasHatchExp()) {
               return false;
            } else {
               for(int i = 0; i < this.getHatchInfosCount(); ++i) {
                  if (!this.getHatchInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HatchUi_12842 parsedMessage = null;

            try {
               parsedMessage = (S2C_HatchUi_12842)PetMsg.S2C_HatchUi_12842.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HatchUi_12842)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHatchLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHatchLv() {
            return this.hatchLv_;
         }

         public Builder setHatchLv(int value) {
            this.bitField0_ |= 1;
            this.hatchLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHatchLv() {
            this.bitField0_ &= -2;
            this.hatchLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHatchExp() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHatchExp() {
            return this.hatchExp_;
         }

         public Builder setHatchExp(int value) {
            this.bitField0_ |= 2;
            this.hatchExp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHatchExp() {
            this.bitField0_ &= -3;
            this.hatchExp_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHatchInfosIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.hatchInfos_ = new ArrayList(this.hatchInfos_);
               this.bitField0_ |= 4;
            }

         }

         public List<HatchSoltInfo> getHatchInfosList() {
            return this.hatchInfosBuilder_ == null ? Collections.unmodifiableList(this.hatchInfos_) : this.hatchInfosBuilder_.getMessageList();
         }

         public int getHatchInfosCount() {
            return this.hatchInfosBuilder_ == null ? this.hatchInfos_.size() : this.hatchInfosBuilder_.getCount();
         }

         public HatchSoltInfo getHatchInfos(int index) {
            return this.hatchInfosBuilder_ == null ? (HatchSoltInfo)this.hatchInfos_.get(index) : (HatchSoltInfo)this.hatchInfosBuilder_.getMessage(index);
         }

         public Builder setHatchInfos(int index, HatchSoltInfo value) {
            if (this.hatchInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHatchInfosIsMutable();
               this.hatchInfos_.set(index, value);
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHatchInfos(int index, HatchSoltInfo.Builder builderForValue) {
            if (this.hatchInfosBuilder_ == null) {
               this.ensureHatchInfosIsMutable();
               this.hatchInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHatchInfos(HatchSoltInfo value) {
            if (this.hatchInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHatchInfosIsMutable();
               this.hatchInfos_.add(value);
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHatchInfos(int index, HatchSoltInfo value) {
            if (this.hatchInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHatchInfosIsMutable();
               this.hatchInfos_.add(index, value);
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHatchInfos(HatchSoltInfo.Builder builderForValue) {
            if (this.hatchInfosBuilder_ == null) {
               this.ensureHatchInfosIsMutable();
               this.hatchInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHatchInfos(int index, HatchSoltInfo.Builder builderForValue) {
            if (this.hatchInfosBuilder_ == null) {
               this.ensureHatchInfosIsMutable();
               this.hatchInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHatchInfos(Iterable<? extends HatchSoltInfo> values) {
            if (this.hatchInfosBuilder_ == null) {
               this.ensureHatchInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hatchInfos_);
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHatchInfos() {
            if (this.hatchInfosBuilder_ == null) {
               this.hatchInfos_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removeHatchInfos(int index) {
            if (this.hatchInfosBuilder_ == null) {
               this.ensureHatchInfosIsMutable();
               this.hatchInfos_.remove(index);
               this.onChanged();
            } else {
               this.hatchInfosBuilder_.remove(index);
            }

            return this;
         }

         public HatchSoltInfo.Builder getHatchInfosBuilder(int index) {
            return (HatchSoltInfo.Builder)this.getHatchInfosFieldBuilder().getBuilder(index);
         }

         public HatchSoltInfoOrBuilder getHatchInfosOrBuilder(int index) {
            return this.hatchInfosBuilder_ == null ? (HatchSoltInfoOrBuilder)this.hatchInfos_.get(index) : (HatchSoltInfoOrBuilder)this.hatchInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HatchSoltInfoOrBuilder> getHatchInfosOrBuilderList() {
            return this.hatchInfosBuilder_ != null ? this.hatchInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.hatchInfos_);
         }

         public HatchSoltInfo.Builder addHatchInfosBuilder() {
            return (HatchSoltInfo.Builder)this.getHatchInfosFieldBuilder().addBuilder(PetMsg.HatchSoltInfo.getDefaultInstance());
         }

         public HatchSoltInfo.Builder addHatchInfosBuilder(int index) {
            return (HatchSoltInfo.Builder)this.getHatchInfosFieldBuilder().addBuilder(index, PetMsg.HatchSoltInfo.getDefaultInstance());
         }

         public List<HatchSoltInfo.Builder> getHatchInfosBuilderList() {
            return this.getHatchInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HatchSoltInfo, HatchSoltInfo.Builder, HatchSoltInfoOrBuilder> getHatchInfosFieldBuilder() {
            if (this.hatchInfosBuilder_ == null) {
               this.hatchInfosBuilder_ = new RepeatedFieldBuilderV3(this.hatchInfos_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.hatchInfos_ = null;
            }

            return this.hatchInfosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Hatch_12843 extends GeneratedMessageV3 implements C2S_Hatch_12843OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int EGGID_FIELD_NUMBER = 2;
      private int eggId_;
      private byte memoizedIsInitialized;
      private static final C2S_Hatch_12843 DEFAULT_INSTANCE = new C2S_Hatch_12843();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Hatch_12843> PARSER = new AbstractParser<C2S_Hatch_12843>() {
         public C2S_Hatch_12843 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Hatch_12843(input, extensionRegistry);
         }
      };

      private C2S_Hatch_12843(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Hatch_12843() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Hatch_12843();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Hatch_12843(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.eggId_ = input.readInt32();
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_Hatch_12843_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_Hatch_12843_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Hatch_12843.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public boolean hasEggId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEggId() {
         return this.eggId_;
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
         } else if (!this.hasEggId()) {
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
            output.writeInt32(2, this.eggId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.eggId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Hatch_12843)) {
            return super.equals(obj);
         } else {
            C2S_Hatch_12843 other = (C2S_Hatch_12843)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
               return false;
            } else if (this.hasEggId() != other.hasEggId()) {
               return false;
            } else if (this.hasEggId() && this.getEggId() != other.getEggId()) {
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

            if (this.hasEggId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEggId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Hatch_12843 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Hatch_12843)PARSER.parseFrom(data);
      }

      public static C2S_Hatch_12843 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Hatch_12843)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Hatch_12843 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Hatch_12843)PARSER.parseFrom(data);
      }

      public static C2S_Hatch_12843 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Hatch_12843)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Hatch_12843 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Hatch_12843)PARSER.parseFrom(data);
      }

      public static C2S_Hatch_12843 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Hatch_12843)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Hatch_12843 parseFrom(InputStream input) throws IOException {
         return (C2S_Hatch_12843)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Hatch_12843 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Hatch_12843)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Hatch_12843 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Hatch_12843)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Hatch_12843 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Hatch_12843)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Hatch_12843 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Hatch_12843)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Hatch_12843 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Hatch_12843)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Hatch_12843 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Hatch_12843 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Hatch_12843> parser() {
         return PARSER;
      }

      public Parser<C2S_Hatch_12843> getParserForType() {
         return PARSER;
      }

      public C2S_Hatch_12843 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Hatch_12843OrBuilder {
         private int bitField0_;
         private int position_;
         private int eggId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_Hatch_12843_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_Hatch_12843_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Hatch_12843.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_Hatch_12843.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 0;
            this.bitField0_ &= -2;
            this.eggId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_Hatch_12843_descriptor;
         }

         public C2S_Hatch_12843 getDefaultInstanceForType() {
            return PetMsg.C2S_Hatch_12843.getDefaultInstance();
         }

         public C2S_Hatch_12843 build() {
            C2S_Hatch_12843 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Hatch_12843 buildPartial() {
            C2S_Hatch_12843 result = new C2S_Hatch_12843(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.position_ = this.position_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.eggId_ = this.eggId_;
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
            if (other instanceof C2S_Hatch_12843) {
               return this.mergeFrom((C2S_Hatch_12843)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Hatch_12843 other) {
            if (other == PetMsg.C2S_Hatch_12843.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasEggId()) {
                  this.setEggId(other.getEggId());
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
               return this.hasEggId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Hatch_12843 parsedMessage = null;

            try {
               parsedMessage = (C2S_Hatch_12843)PetMsg.C2S_Hatch_12843.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Hatch_12843)e.getUnfinishedMessage();
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

         public boolean hasEggId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEggId() {
            return this.eggId_;
         }

         public Builder setEggId(int value) {
            this.bitField0_ |= 2;
            this.eggId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEggId() {
            this.bitField0_ &= -3;
            this.eggId_ = 0;
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

   public static final class S2C_Hatch_12844 extends GeneratedMessageV3 implements S2C_Hatch_12844OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int INFO_FIELD_NUMBER = 3;
      private HatchSoltInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_Hatch_12844 DEFAULT_INSTANCE = new S2C_Hatch_12844();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Hatch_12844> PARSER = new AbstractParser<S2C_Hatch_12844>() {
         public S2C_Hatch_12844 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Hatch_12844(input, extensionRegistry);
         }
      };

      private S2C_Hatch_12844(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Hatch_12844() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Hatch_12844();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Hatch_12844(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 26:
                        HatchSoltInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (HatchSoltInfo)input.readMessage(PetMsg.HatchSoltInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_Hatch_12844_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_Hatch_12844_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Hatch_12844.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public HatchSoltInfo getInfo() {
         return this.info_ == null ? PetMsg.HatchSoltInfo.getDefaultInstance() : this.info_;
      }

      public HatchSoltInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? PetMsg.HatchSoltInfo.getDefaultInstance() : this.info_;
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
         } else if (this.hasInfo() && !this.getInfo().isInitialized()) {
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
            output.writeMessage(3, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(3, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Hatch_12844)) {
            return super.equals(obj);
         } else {
            S2C_Hatch_12844 other = (S2C_Hatch_12844)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasInfo() != other.hasInfo()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasInfo()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Hatch_12844 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Hatch_12844)PARSER.parseFrom(data);
      }

      public static S2C_Hatch_12844 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Hatch_12844)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Hatch_12844 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Hatch_12844)PARSER.parseFrom(data);
      }

      public static S2C_Hatch_12844 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Hatch_12844)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Hatch_12844 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Hatch_12844)PARSER.parseFrom(data);
      }

      public static S2C_Hatch_12844 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Hatch_12844)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Hatch_12844 parseFrom(InputStream input) throws IOException {
         return (S2C_Hatch_12844)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Hatch_12844 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Hatch_12844)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Hatch_12844 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Hatch_12844)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Hatch_12844 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Hatch_12844)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Hatch_12844 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Hatch_12844)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Hatch_12844 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Hatch_12844)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Hatch_12844 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Hatch_12844 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Hatch_12844> parser() {
         return PARSER;
      }

      public Parser<S2C_Hatch_12844> getParserForType() {
         return PARSER;
      }

      public S2C_Hatch_12844 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Hatch_12844OrBuilder {
         private int bitField0_;
         private int result_;
         private HatchSoltInfo info_;
         private SingleFieldBuilderV3<HatchSoltInfo, HatchSoltInfo.Builder, HatchSoltInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_Hatch_12844_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_Hatch_12844_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Hatch_12844.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_Hatch_12844.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_Hatch_12844_descriptor;
         }

         public S2C_Hatch_12844 getDefaultInstanceForType() {
            return PetMsg.S2C_Hatch_12844.getDefaultInstance();
         }

         public S2C_Hatch_12844 build() {
            S2C_Hatch_12844 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Hatch_12844 buildPartial() {
            S2C_Hatch_12844 result = new S2C_Hatch_12844(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (HatchSoltInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_Hatch_12844) {
               return this.mergeFrom((S2C_Hatch_12844)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Hatch_12844 other) {
            if (other == PetMsg.S2C_Hatch_12844.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
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
               return !this.hasInfo() || this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Hatch_12844 parsedMessage = null;

            try {
               parsedMessage = (S2C_Hatch_12844)PetMsg.S2C_Hatch_12844.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Hatch_12844)e.getUnfinishedMessage();
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

         public boolean hasInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public HatchSoltInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? PetMsg.HatchSoltInfo.getDefaultInstance() : this.info_;
            } else {
               return (HatchSoltInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(HatchSoltInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setInfo(HatchSoltInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeInfo(HatchSoltInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.info_ != null && this.info_ != PetMsg.HatchSoltInfo.getDefaultInstance()) {
                  this.info_ = PetMsg.HatchSoltInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public HatchSoltInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (HatchSoltInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public HatchSoltInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (HatchSoltInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? PetMsg.HatchSoltInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<HatchSoltInfo, HatchSoltInfo.Builder, HatchSoltInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class S2C_HatchLvUp_12846 extends GeneratedMessageV3 implements S2C_HatchLvUp_12846OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LV_FIELD_NUMBER = 1;
      private int lv_;
      public static final int EXP_FIELD_NUMBER = 2;
      private int exp_;
      private byte memoizedIsInitialized;
      private static final S2C_HatchLvUp_12846 DEFAULT_INSTANCE = new S2C_HatchLvUp_12846();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HatchLvUp_12846> PARSER = new AbstractParser<S2C_HatchLvUp_12846>() {
         public S2C_HatchLvUp_12846 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HatchLvUp_12846(input, extensionRegistry);
         }
      };

      private S2C_HatchLvUp_12846(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HatchLvUp_12846() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HatchLvUp_12846();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HatchLvUp_12846(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.lv_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.exp_ = input.readInt32();
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_HatchLvUp_12846_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_HatchLvUp_12846_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HatchLvUp_12846.class, Builder.class);
      }

      public boolean hasLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasExp() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getExp() {
         return this.exp_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.lv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.exp_);
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
               size += CodedOutputStream.computeInt32Size(1, this.lv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.exp_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HatchLvUp_12846)) {
            return super.equals(obj);
         } else {
            S2C_HatchLvUp_12846 other = (S2C_HatchLvUp_12846)obj;
            if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasExp() != other.hasExp()) {
               return false;
            } else if (this.hasExp() && this.getExp() != other.getExp()) {
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
            if (this.hasLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasExp()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getExp();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HatchLvUp_12846 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HatchLvUp_12846)PARSER.parseFrom(data);
      }

      public static S2C_HatchLvUp_12846 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HatchLvUp_12846)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HatchLvUp_12846 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HatchLvUp_12846)PARSER.parseFrom(data);
      }

      public static S2C_HatchLvUp_12846 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HatchLvUp_12846)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HatchLvUp_12846 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HatchLvUp_12846)PARSER.parseFrom(data);
      }

      public static S2C_HatchLvUp_12846 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HatchLvUp_12846)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HatchLvUp_12846 parseFrom(InputStream input) throws IOException {
         return (S2C_HatchLvUp_12846)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HatchLvUp_12846 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HatchLvUp_12846)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HatchLvUp_12846 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HatchLvUp_12846)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HatchLvUp_12846 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HatchLvUp_12846)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HatchLvUp_12846 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HatchLvUp_12846)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HatchLvUp_12846 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HatchLvUp_12846)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HatchLvUp_12846 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HatchLvUp_12846 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HatchLvUp_12846> parser() {
         return PARSER;
      }

      public Parser<S2C_HatchLvUp_12846> getParserForType() {
         return PARSER;
      }

      public S2C_HatchLvUp_12846 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HatchLvUp_12846OrBuilder {
         private int bitField0_;
         private int lv_;
         private int exp_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_HatchLvUp_12846_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_HatchLvUp_12846_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HatchLvUp_12846.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_HatchLvUp_12846.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.lv_ = 0;
            this.bitField0_ &= -2;
            this.exp_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_HatchLvUp_12846_descriptor;
         }

         public S2C_HatchLvUp_12846 getDefaultInstanceForType() {
            return PetMsg.S2C_HatchLvUp_12846.getDefaultInstance();
         }

         public S2C_HatchLvUp_12846 build() {
            S2C_HatchLvUp_12846 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HatchLvUp_12846 buildPartial() {
            S2C_HatchLvUp_12846 result = new S2C_HatchLvUp_12846(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.exp_ = this.exp_;
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
            if (other instanceof S2C_HatchLvUp_12846) {
               return this.mergeFrom((S2C_HatchLvUp_12846)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HatchLvUp_12846 other) {
            if (other == PetMsg.S2C_HatchLvUp_12846.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasExp()) {
                  this.setExp(other.getExp());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLv()) {
               return false;
            } else {
               return this.hasExp();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HatchLvUp_12846 parsedMessage = null;

            try {
               parsedMessage = (S2C_HatchLvUp_12846)PetMsg.S2C_HatchLvUp_12846.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HatchLvUp_12846)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 1;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -2;
            this.lv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasExp() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getExp() {
            return this.exp_;
         }

         public Builder setExp(int value) {
            this.bitField0_ |= 2;
            this.exp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExp() {
            this.bitField0_ &= -3;
            this.exp_ = 0;
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

   public static final class C2S_HatchOpen_12847 extends GeneratedMessageV3 implements C2S_HatchOpen_12847OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_HatchOpen_12847 DEFAULT_INSTANCE = new C2S_HatchOpen_12847();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HatchOpen_12847> PARSER = new AbstractParser<C2S_HatchOpen_12847>() {
         public C2S_HatchOpen_12847 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HatchOpen_12847(input, extensionRegistry);
         }
      };

      private C2S_HatchOpen_12847(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HatchOpen_12847() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HatchOpen_12847();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HatchOpen_12847(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_HatchOpen_12847_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_HatchOpen_12847_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HatchOpen_12847.class, Builder.class);
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
         } else if (!(obj instanceof C2S_HatchOpen_12847)) {
            return super.equals(obj);
         } else {
            C2S_HatchOpen_12847 other = (C2S_HatchOpen_12847)obj;
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

      public static C2S_HatchOpen_12847 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HatchOpen_12847)PARSER.parseFrom(data);
      }

      public static C2S_HatchOpen_12847 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HatchOpen_12847)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HatchOpen_12847 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HatchOpen_12847)PARSER.parseFrom(data);
      }

      public static C2S_HatchOpen_12847 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HatchOpen_12847)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HatchOpen_12847 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HatchOpen_12847)PARSER.parseFrom(data);
      }

      public static C2S_HatchOpen_12847 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HatchOpen_12847)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HatchOpen_12847 parseFrom(InputStream input) throws IOException {
         return (C2S_HatchOpen_12847)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HatchOpen_12847 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HatchOpen_12847)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HatchOpen_12847 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HatchOpen_12847)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HatchOpen_12847 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HatchOpen_12847)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HatchOpen_12847 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HatchOpen_12847)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HatchOpen_12847 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HatchOpen_12847)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HatchOpen_12847 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HatchOpen_12847 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HatchOpen_12847> parser() {
         return PARSER;
      }

      public Parser<C2S_HatchOpen_12847> getParserForType() {
         return PARSER;
      }

      public C2S_HatchOpen_12847 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HatchOpen_12847OrBuilder {
         private int bitField0_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_HatchOpen_12847_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_HatchOpen_12847_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HatchOpen_12847.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_HatchOpen_12847.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_HatchOpen_12847_descriptor;
         }

         public C2S_HatchOpen_12847 getDefaultInstanceForType() {
            return PetMsg.C2S_HatchOpen_12847.getDefaultInstance();
         }

         public C2S_HatchOpen_12847 build() {
            C2S_HatchOpen_12847 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HatchOpen_12847 buildPartial() {
            C2S_HatchOpen_12847 result = new C2S_HatchOpen_12847(this);
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
            if (other instanceof C2S_HatchOpen_12847) {
               return this.mergeFrom((C2S_HatchOpen_12847)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HatchOpen_12847 other) {
            if (other == PetMsg.C2S_HatchOpen_12847.getDefaultInstance()) {
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
            C2S_HatchOpen_12847 parsedMessage = null;

            try {
               parsedMessage = (C2S_HatchOpen_12847)PetMsg.C2S_HatchOpen_12847.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HatchOpen_12847)e.getUnfinishedMessage();
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

   public static final class S2C_HatchOpen_12848 extends GeneratedMessageV3 implements S2C_HatchOpen_12848OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int INFO_FIELD_NUMBER = 2;
      private HatchSoltInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_HatchOpen_12848 DEFAULT_INSTANCE = new S2C_HatchOpen_12848();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HatchOpen_12848> PARSER = new AbstractParser<S2C_HatchOpen_12848>() {
         public S2C_HatchOpen_12848 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HatchOpen_12848(input, extensionRegistry);
         }
      };

      private S2C_HatchOpen_12848(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HatchOpen_12848() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HatchOpen_12848();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HatchOpen_12848(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        HatchSoltInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (HatchSoltInfo)input.readMessage(PetMsg.HatchSoltInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_HatchOpen_12848_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_HatchOpen_12848_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HatchOpen_12848.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public HatchSoltInfo getInfo() {
         return this.info_ == null ? PetMsg.HatchSoltInfo.getDefaultInstance() : this.info_;
      }

      public HatchSoltInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? PetMsg.HatchSoltInfo.getDefaultInstance() : this.info_;
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(2, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HatchOpen_12848)) {
            return super.equals(obj);
         } else {
            S2C_HatchOpen_12848 other = (S2C_HatchOpen_12848)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasInfo() != other.hasInfo()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HatchOpen_12848 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HatchOpen_12848)PARSER.parseFrom(data);
      }

      public static S2C_HatchOpen_12848 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HatchOpen_12848)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HatchOpen_12848 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HatchOpen_12848)PARSER.parseFrom(data);
      }

      public static S2C_HatchOpen_12848 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HatchOpen_12848)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HatchOpen_12848 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HatchOpen_12848)PARSER.parseFrom(data);
      }

      public static S2C_HatchOpen_12848 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HatchOpen_12848)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HatchOpen_12848 parseFrom(InputStream input) throws IOException {
         return (S2C_HatchOpen_12848)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HatchOpen_12848 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HatchOpen_12848)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HatchOpen_12848 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HatchOpen_12848)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HatchOpen_12848 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HatchOpen_12848)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HatchOpen_12848 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HatchOpen_12848)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HatchOpen_12848 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HatchOpen_12848)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HatchOpen_12848 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HatchOpen_12848 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HatchOpen_12848> parser() {
         return PARSER;
      }

      public Parser<S2C_HatchOpen_12848> getParserForType() {
         return PARSER;
      }

      public S2C_HatchOpen_12848 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HatchOpen_12848OrBuilder {
         private int bitField0_;
         private int result_;
         private HatchSoltInfo info_;
         private SingleFieldBuilderV3<HatchSoltInfo, HatchSoltInfo.Builder, HatchSoltInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_HatchOpen_12848_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_HatchOpen_12848_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HatchOpen_12848.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_HatchOpen_12848.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_HatchOpen_12848_descriptor;
         }

         public S2C_HatchOpen_12848 getDefaultInstanceForType() {
            return PetMsg.S2C_HatchOpen_12848.getDefaultInstance();
         }

         public S2C_HatchOpen_12848 build() {
            S2C_HatchOpen_12848 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HatchOpen_12848 buildPartial() {
            S2C_HatchOpen_12848 result = new S2C_HatchOpen_12848(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (HatchSoltInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_HatchOpen_12848) {
               return this.mergeFrom((S2C_HatchOpen_12848)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HatchOpen_12848 other) {
            if (other == PetMsg.S2C_HatchOpen_12848.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HatchOpen_12848 parsedMessage = null;

            try {
               parsedMessage = (S2C_HatchOpen_12848)PetMsg.S2C_HatchOpen_12848.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HatchOpen_12848)e.getUnfinishedMessage();
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

         public boolean hasInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public HatchSoltInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? PetMsg.HatchSoltInfo.getDefaultInstance() : this.info_;
            } else {
               return (HatchSoltInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(HatchSoltInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setInfo(HatchSoltInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeInfo(HatchSoltInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.info_ != null && this.info_ != PetMsg.HatchSoltInfo.getDefaultInstance()) {
                  this.info_ = PetMsg.HatchSoltInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public HatchSoltInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (HatchSoltInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public HatchSoltInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (HatchSoltInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? PetMsg.HatchSoltInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<HatchSoltInfo, HatchSoltInfo.Builder, HatchSoltInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class C2S_TakeHatchReward_12849 extends GeneratedMessageV3 implements C2S_TakeHatchReward_12849OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeHatchReward_12849 DEFAULT_INSTANCE = new C2S_TakeHatchReward_12849();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeHatchReward_12849> PARSER = new AbstractParser<C2S_TakeHatchReward_12849>() {
         public C2S_TakeHatchReward_12849 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeHatchReward_12849(input, extensionRegistry);
         }
      };

      private C2S_TakeHatchReward_12849(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeHatchReward_12849() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeHatchReward_12849();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeHatchReward_12849(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rewardId_ = input.readInt32();
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_TakeHatchReward_12849_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_TakeHatchReward_12849_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeHatchReward_12849.class, Builder.class);
      }

      public boolean hasRewardId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRewardId() {
         return this.rewardId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRewardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rewardId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rewardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TakeHatchReward_12849)) {
            return super.equals(obj);
         } else {
            C2S_TakeHatchReward_12849 other = (C2S_TakeHatchReward_12849)obj;
            if (this.hasRewardId() != other.hasRewardId()) {
               return false;
            } else if (this.hasRewardId() && this.getRewardId() != other.getRewardId()) {
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
            if (this.hasRewardId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TakeHatchReward_12849 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeHatchReward_12849)PARSER.parseFrom(data);
      }

      public static C2S_TakeHatchReward_12849 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeHatchReward_12849)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeHatchReward_12849 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeHatchReward_12849)PARSER.parseFrom(data);
      }

      public static C2S_TakeHatchReward_12849 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeHatchReward_12849)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeHatchReward_12849 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeHatchReward_12849)PARSER.parseFrom(data);
      }

      public static C2S_TakeHatchReward_12849 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeHatchReward_12849)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeHatchReward_12849 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeHatchReward_12849)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeHatchReward_12849 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeHatchReward_12849)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeHatchReward_12849 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeHatchReward_12849)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeHatchReward_12849 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeHatchReward_12849)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeHatchReward_12849 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeHatchReward_12849)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeHatchReward_12849 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeHatchReward_12849)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeHatchReward_12849 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeHatchReward_12849 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeHatchReward_12849> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeHatchReward_12849> getParserForType() {
         return PARSER;
      }

      public C2S_TakeHatchReward_12849 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeHatchReward_12849OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_TakeHatchReward_12849_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_TakeHatchReward_12849_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeHatchReward_12849.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_TakeHatchReward_12849.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_TakeHatchReward_12849_descriptor;
         }

         public C2S_TakeHatchReward_12849 getDefaultInstanceForType() {
            return PetMsg.C2S_TakeHatchReward_12849.getDefaultInstance();
         }

         public C2S_TakeHatchReward_12849 build() {
            C2S_TakeHatchReward_12849 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeHatchReward_12849 buildPartial() {
            C2S_TakeHatchReward_12849 result = new C2S_TakeHatchReward_12849(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rewardId_ = this.rewardId_;
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
            if (other instanceof C2S_TakeHatchReward_12849) {
               return this.mergeFrom((C2S_TakeHatchReward_12849)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeHatchReward_12849 other) {
            if (other == PetMsg.C2S_TakeHatchReward_12849.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRewardId()) {
                  this.setRewardId(other.getRewardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRewardId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TakeHatchReward_12849 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeHatchReward_12849)PetMsg.C2S_TakeHatchReward_12849.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeHatchReward_12849)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRewardId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRewardId() {
            return this.rewardId_;
         }

         public Builder setRewardId(int value) {
            this.bitField0_ |= 1;
            this.rewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.bitField0_ &= -2;
            this.rewardId_ = 0;
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

   public static final class S2C_TakeHatchReward_12850 extends GeneratedMessageV3 implements S2C_TakeHatchReward_12850OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TAKEDREWARDID_FIELD_NUMBER = 2;
      private Internal.IntList takedRewardId_;
      private byte memoizedIsInitialized;
      private static final S2C_TakeHatchReward_12850 DEFAULT_INSTANCE = new S2C_TakeHatchReward_12850();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakeHatchReward_12850> PARSER = new AbstractParser<S2C_TakeHatchReward_12850>() {
         public S2C_TakeHatchReward_12850 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakeHatchReward_12850(input, extensionRegistry);
         }
      };

      private S2C_TakeHatchReward_12850(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakeHatchReward_12850() {
         this.memoizedIsInitialized = -1;
         this.takedRewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakeHatchReward_12850();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakeHatchReward_12850(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.takedRewardId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.takedRewardId_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.takedRewardId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.takedRewardId_.addInt(input.readInt32());
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
                  this.takedRewardId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_TakeHatchReward_12850_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_TakeHatchReward_12850_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeHatchReward_12850.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public List<Integer> getTakedRewardIdList() {
         return this.takedRewardId_;
      }

      public int getTakedRewardIdCount() {
         return this.takedRewardId_.size();
      }

      public int getTakedRewardId(int index) {
         return this.takedRewardId_.getInt(index);
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

         for(int i = 0; i < this.takedRewardId_.size(); ++i) {
            output.writeInt32(2, this.takedRewardId_.getInt(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.takedRewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.takedRewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTakedRewardIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TakeHatchReward_12850)) {
            return super.equals(obj);
         } else {
            S2C_TakeHatchReward_12850 other = (S2C_TakeHatchReward_12850)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (!this.getTakedRewardIdList().equals(other.getTakedRewardIdList())) {
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

            if (this.getTakedRewardIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTakedRewardIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TakeHatchReward_12850 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakeHatchReward_12850)PARSER.parseFrom(data);
      }

      public static S2C_TakeHatchReward_12850 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeHatchReward_12850)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeHatchReward_12850 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakeHatchReward_12850)PARSER.parseFrom(data);
      }

      public static S2C_TakeHatchReward_12850 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeHatchReward_12850)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeHatchReward_12850 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakeHatchReward_12850)PARSER.parseFrom(data);
      }

      public static S2C_TakeHatchReward_12850 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeHatchReward_12850)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeHatchReward_12850 parseFrom(InputStream input) throws IOException {
         return (S2C_TakeHatchReward_12850)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeHatchReward_12850 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeHatchReward_12850)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeHatchReward_12850 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakeHatchReward_12850)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakeHatchReward_12850 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeHatchReward_12850)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeHatchReward_12850 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakeHatchReward_12850)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeHatchReward_12850 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeHatchReward_12850)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakeHatchReward_12850 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakeHatchReward_12850 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakeHatchReward_12850> parser() {
         return PARSER;
      }

      public Parser<S2C_TakeHatchReward_12850> getParserForType() {
         return PARSER;
      }

      public S2C_TakeHatchReward_12850 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakeHatchReward_12850OrBuilder {
         private int bitField0_;
         private int result_;
         private Internal.IntList takedRewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_TakeHatchReward_12850_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_TakeHatchReward_12850_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeHatchReward_12850.class, Builder.class);
         }

         private Builder() {
            this.takedRewardId_ = PetMsg.S2C_TakeHatchReward_12850.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.takedRewardId_ = PetMsg.S2C_TakeHatchReward_12850.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_TakeHatchReward_12850.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.takedRewardId_ = PetMsg.S2C_TakeHatchReward_12850.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_TakeHatchReward_12850_descriptor;
         }

         public S2C_TakeHatchReward_12850 getDefaultInstanceForType() {
            return PetMsg.S2C_TakeHatchReward_12850.getDefaultInstance();
         }

         public S2C_TakeHatchReward_12850 build() {
            S2C_TakeHatchReward_12850 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakeHatchReward_12850 buildPartial() {
            S2C_TakeHatchReward_12850 result = new S2C_TakeHatchReward_12850(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.takedRewardId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.takedRewardId_ = this.takedRewardId_;
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
            if (other instanceof S2C_TakeHatchReward_12850) {
               return this.mergeFrom((S2C_TakeHatchReward_12850)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakeHatchReward_12850 other) {
            if (other == PetMsg.S2C_TakeHatchReward_12850.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (!other.takedRewardId_.isEmpty()) {
                  if (this.takedRewardId_.isEmpty()) {
                     this.takedRewardId_ = other.takedRewardId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureTakedRewardIdIsMutable();
                     this.takedRewardId_.addAll(other.takedRewardId_);
                  }

                  this.onChanged();
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
            S2C_TakeHatchReward_12850 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakeHatchReward_12850)PetMsg.S2C_TakeHatchReward_12850.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakeHatchReward_12850)e.getUnfinishedMessage();
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

         private void ensureTakedRewardIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.takedRewardId_ = PetMsg.S2C_TakeHatchReward_12850.mutableCopy(this.takedRewardId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getTakedRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.takedRewardId_) : this.takedRewardId_);
         }

         public int getTakedRewardIdCount() {
            return this.takedRewardId_.size();
         }

         public int getTakedRewardId(int index) {
            return this.takedRewardId_.getInt(index);
         }

         public Builder setTakedRewardId(int index, int value) {
            this.ensureTakedRewardIdIsMutable();
            this.takedRewardId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTakedRewardId(int value) {
            this.ensureTakedRewardIdIsMutable();
            this.takedRewardId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTakedRewardId(Iterable<? extends Integer> values) {
            this.ensureTakedRewardIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.takedRewardId_);
            this.onChanged();
            return this;
         }

         public Builder clearTakedRewardId() {
            this.takedRewardId_ = PetMsg.S2C_TakeHatchReward_12850.emptyIntList();
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

   public static final class C2S_HatchAccelerate_12851 extends GeneratedMessageV3 implements C2S_HatchAccelerate_12851OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_HatchAccelerate_12851 DEFAULT_INSTANCE = new C2S_HatchAccelerate_12851();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HatchAccelerate_12851> PARSER = new AbstractParser<C2S_HatchAccelerate_12851>() {
         public C2S_HatchAccelerate_12851 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HatchAccelerate_12851(input, extensionRegistry);
         }
      };

      private C2S_HatchAccelerate_12851(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HatchAccelerate_12851() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HatchAccelerate_12851();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HatchAccelerate_12851(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_HatchAccelerate_12851_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_HatchAccelerate_12851_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HatchAccelerate_12851.class, Builder.class);
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
         } else if (!(obj instanceof C2S_HatchAccelerate_12851)) {
            return super.equals(obj);
         } else {
            C2S_HatchAccelerate_12851 other = (C2S_HatchAccelerate_12851)obj;
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

      public static C2S_HatchAccelerate_12851 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HatchAccelerate_12851)PARSER.parseFrom(data);
      }

      public static C2S_HatchAccelerate_12851 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HatchAccelerate_12851)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HatchAccelerate_12851 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HatchAccelerate_12851)PARSER.parseFrom(data);
      }

      public static C2S_HatchAccelerate_12851 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HatchAccelerate_12851)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HatchAccelerate_12851 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HatchAccelerate_12851)PARSER.parseFrom(data);
      }

      public static C2S_HatchAccelerate_12851 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HatchAccelerate_12851)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HatchAccelerate_12851 parseFrom(InputStream input) throws IOException {
         return (C2S_HatchAccelerate_12851)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HatchAccelerate_12851 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HatchAccelerate_12851)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HatchAccelerate_12851 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HatchAccelerate_12851)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HatchAccelerate_12851 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HatchAccelerate_12851)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HatchAccelerate_12851 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HatchAccelerate_12851)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HatchAccelerate_12851 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HatchAccelerate_12851)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HatchAccelerate_12851 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HatchAccelerate_12851 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HatchAccelerate_12851> parser() {
         return PARSER;
      }

      public Parser<C2S_HatchAccelerate_12851> getParserForType() {
         return PARSER;
      }

      public C2S_HatchAccelerate_12851 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HatchAccelerate_12851OrBuilder {
         private int bitField0_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_HatchAccelerate_12851_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_HatchAccelerate_12851_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HatchAccelerate_12851.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_HatchAccelerate_12851.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_HatchAccelerate_12851_descriptor;
         }

         public C2S_HatchAccelerate_12851 getDefaultInstanceForType() {
            return PetMsg.C2S_HatchAccelerate_12851.getDefaultInstance();
         }

         public C2S_HatchAccelerate_12851 build() {
            C2S_HatchAccelerate_12851 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HatchAccelerate_12851 buildPartial() {
            C2S_HatchAccelerate_12851 result = new C2S_HatchAccelerate_12851(this);
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
            if (other instanceof C2S_HatchAccelerate_12851) {
               return this.mergeFrom((C2S_HatchAccelerate_12851)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HatchAccelerate_12851 other) {
            if (other == PetMsg.C2S_HatchAccelerate_12851.getDefaultInstance()) {
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
            C2S_HatchAccelerate_12851 parsedMessage = null;

            try {
               parsedMessage = (C2S_HatchAccelerate_12851)PetMsg.C2S_HatchAccelerate_12851.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HatchAccelerate_12851)e.getUnfinishedMessage();
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

   public static final class C2S_OneKeyHatchAccelerate_12853 extends GeneratedMessageV3 implements C2S_OneKeyHatchAccelerate_12853OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OneKeyHatchAccelerate_12853 DEFAULT_INSTANCE = new C2S_OneKeyHatchAccelerate_12853();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OneKeyHatchAccelerate_12853> PARSER = new AbstractParser<C2S_OneKeyHatchAccelerate_12853>() {
         public C2S_OneKeyHatchAccelerate_12853 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OneKeyHatchAccelerate_12853(input, extensionRegistry);
         }
      };

      private C2S_OneKeyHatchAccelerate_12853(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OneKeyHatchAccelerate_12853() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OneKeyHatchAccelerate_12853();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OneKeyHatchAccelerate_12853(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_OneKeyHatchAccelerate_12853_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_OneKeyHatchAccelerate_12853_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyHatchAccelerate_12853.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OneKeyHatchAccelerate_12853)) {
            return super.equals(obj);
         } else {
            C2S_OneKeyHatchAccelerate_12853 other = (C2S_OneKeyHatchAccelerate_12853)obj;
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

      public static C2S_OneKeyHatchAccelerate_12853 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyHatchAccelerate_12853)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyHatchAccelerate_12853 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyHatchAccelerate_12853)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyHatchAccelerate_12853 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyHatchAccelerate_12853)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyHatchAccelerate_12853 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyHatchAccelerate_12853)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyHatchAccelerate_12853 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyHatchAccelerate_12853)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyHatchAccelerate_12853 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyHatchAccelerate_12853)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyHatchAccelerate_12853 parseFrom(InputStream input) throws IOException {
         return (C2S_OneKeyHatchAccelerate_12853)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyHatchAccelerate_12853 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyHatchAccelerate_12853)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyHatchAccelerate_12853 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OneKeyHatchAccelerate_12853)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OneKeyHatchAccelerate_12853 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyHatchAccelerate_12853)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyHatchAccelerate_12853 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OneKeyHatchAccelerate_12853)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyHatchAccelerate_12853 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyHatchAccelerate_12853)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OneKeyHatchAccelerate_12853 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OneKeyHatchAccelerate_12853 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OneKeyHatchAccelerate_12853> parser() {
         return PARSER;
      }

      public Parser<C2S_OneKeyHatchAccelerate_12853> getParserForType() {
         return PARSER;
      }

      public C2S_OneKeyHatchAccelerate_12853 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OneKeyHatchAccelerate_12853OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_OneKeyHatchAccelerate_12853_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_OneKeyHatchAccelerate_12853_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyHatchAccelerate_12853.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_OneKeyHatchAccelerate_12853.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_OneKeyHatchAccelerate_12853_descriptor;
         }

         public C2S_OneKeyHatchAccelerate_12853 getDefaultInstanceForType() {
            return PetMsg.C2S_OneKeyHatchAccelerate_12853.getDefaultInstance();
         }

         public C2S_OneKeyHatchAccelerate_12853 build() {
            C2S_OneKeyHatchAccelerate_12853 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OneKeyHatchAccelerate_12853 buildPartial() {
            C2S_OneKeyHatchAccelerate_12853 result = new C2S_OneKeyHatchAccelerate_12853(this);
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
            if (other instanceof C2S_OneKeyHatchAccelerate_12853) {
               return this.mergeFrom((C2S_OneKeyHatchAccelerate_12853)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OneKeyHatchAccelerate_12853 other) {
            if (other == PetMsg.C2S_OneKeyHatchAccelerate_12853.getDefaultInstance()) {
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
            C2S_OneKeyHatchAccelerate_12853 parsedMessage = null;

            try {
               parsedMessage = (C2S_OneKeyHatchAccelerate_12853)PetMsg.C2S_OneKeyHatchAccelerate_12853.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OneKeyHatchAccelerate_12853)e.getUnfinishedMessage();
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

   public static final class S2C_OneKeyHatchAccelerate_12854 extends GeneratedMessageV3 implements S2C_OneKeyHatchAccelerate_12854OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int INFOS_FIELD_NUMBER = 2;
      private List<HatchSoltInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_OneKeyHatchAccelerate_12854 DEFAULT_INSTANCE = new S2C_OneKeyHatchAccelerate_12854();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OneKeyHatchAccelerate_12854> PARSER = new AbstractParser<S2C_OneKeyHatchAccelerate_12854>() {
         public S2C_OneKeyHatchAccelerate_12854 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OneKeyHatchAccelerate_12854(input, extensionRegistry);
         }
      };

      private S2C_OneKeyHatchAccelerate_12854(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OneKeyHatchAccelerate_12854() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OneKeyHatchAccelerate_12854();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OneKeyHatchAccelerate_12854(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.infos_.add(input.readMessage(PetMsg.HatchSoltInfo.PARSER, extensionRegistry));
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_OneKeyHatchAccelerate_12854_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_OneKeyHatchAccelerate_12854_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyHatchAccelerate_12854.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public List<HatchSoltInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends HatchSoltInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public HatchSoltInfo getInfos(int index) {
         return (HatchSoltInfo)this.infos_.get(index);
      }

      public HatchSoltInfoOrBuilder getInfosOrBuilder(int index) {
         return (HatchSoltInfoOrBuilder)this.infos_.get(index);
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.result_);
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.infos_.get(i));
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

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OneKeyHatchAccelerate_12854)) {
            return super.equals(obj);
         } else {
            S2C_OneKeyHatchAccelerate_12854 other = (S2C_OneKeyHatchAccelerate_12854)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
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

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OneKeyHatchAccelerate_12854 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyHatchAccelerate_12854)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyHatchAccelerate_12854 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyHatchAccelerate_12854)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyHatchAccelerate_12854 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyHatchAccelerate_12854)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyHatchAccelerate_12854 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyHatchAccelerate_12854)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyHatchAccelerate_12854 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyHatchAccelerate_12854)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyHatchAccelerate_12854 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyHatchAccelerate_12854)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyHatchAccelerate_12854 parseFrom(InputStream input) throws IOException {
         return (S2C_OneKeyHatchAccelerate_12854)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyHatchAccelerate_12854 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyHatchAccelerate_12854)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyHatchAccelerate_12854 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OneKeyHatchAccelerate_12854)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OneKeyHatchAccelerate_12854 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyHatchAccelerate_12854)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyHatchAccelerate_12854 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OneKeyHatchAccelerate_12854)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyHatchAccelerate_12854 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyHatchAccelerate_12854)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OneKeyHatchAccelerate_12854 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OneKeyHatchAccelerate_12854 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OneKeyHatchAccelerate_12854> parser() {
         return PARSER;
      }

      public Parser<S2C_OneKeyHatchAccelerate_12854> getParserForType() {
         return PARSER;
      }

      public S2C_OneKeyHatchAccelerate_12854 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OneKeyHatchAccelerate_12854OrBuilder {
         private int bitField0_;
         private int result_;
         private List<HatchSoltInfo> infos_;
         private RepeatedFieldBuilderV3<HatchSoltInfo, HatchSoltInfo.Builder, HatchSoltInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_OneKeyHatchAccelerate_12854_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_OneKeyHatchAccelerate_12854_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyHatchAccelerate_12854.class, Builder.class);
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
            if (PetMsg.S2C_OneKeyHatchAccelerate_12854.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_OneKeyHatchAccelerate_12854_descriptor;
         }

         public S2C_OneKeyHatchAccelerate_12854 getDefaultInstanceForType() {
            return PetMsg.S2C_OneKeyHatchAccelerate_12854.getDefaultInstance();
         }

         public S2C_OneKeyHatchAccelerate_12854 build() {
            S2C_OneKeyHatchAccelerate_12854 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OneKeyHatchAccelerate_12854 buildPartial() {
            S2C_OneKeyHatchAccelerate_12854 result = new S2C_OneKeyHatchAccelerate_12854(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -3;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
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
            if (other instanceof S2C_OneKeyHatchAccelerate_12854) {
               return this.mergeFrom((S2C_OneKeyHatchAccelerate_12854)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OneKeyHatchAccelerate_12854 other) {
            if (other == PetMsg.S2C_OneKeyHatchAccelerate_12854.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.infosBuilder_ = PetMsg.S2C_OneKeyHatchAccelerate_12854.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            if (!this.hasResult()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfosCount(); ++i) {
                  if (!this.getInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OneKeyHatchAccelerate_12854 parsedMessage = null;

            try {
               parsedMessage = (S2C_OneKeyHatchAccelerate_12854)PetMsg.S2C_OneKeyHatchAccelerate_12854.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OneKeyHatchAccelerate_12854)e.getUnfinishedMessage();
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

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 2;
            }

         }

         public List<HatchSoltInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public HatchSoltInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (HatchSoltInfo)this.infos_.get(index) : (HatchSoltInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, HatchSoltInfo value) {
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

         public Builder setInfos(int index, HatchSoltInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(HatchSoltInfo value) {
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

         public Builder addInfos(int index, HatchSoltInfo value) {
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

         public Builder addInfos(HatchSoltInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, HatchSoltInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends HatchSoltInfo> values) {
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
               this.bitField0_ &= -3;
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

         public HatchSoltInfo.Builder getInfosBuilder(int index) {
            return (HatchSoltInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public HatchSoltInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (HatchSoltInfoOrBuilder)this.infos_.get(index) : (HatchSoltInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HatchSoltInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public HatchSoltInfo.Builder addInfosBuilder() {
            return (HatchSoltInfo.Builder)this.getInfosFieldBuilder().addBuilder(PetMsg.HatchSoltInfo.getDefaultInstance());
         }

         public HatchSoltInfo.Builder addInfosBuilder(int index) {
            return (HatchSoltInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, PetMsg.HatchSoltInfo.getDefaultInstance());
         }

         public List<HatchSoltInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HatchSoltInfo, HatchSoltInfo.Builder, HatchSoltInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_PetDecompose_12861 extends GeneratedMessageV3 implements C2S_PetDecompose_12861OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CODES_FIELD_NUMBER = 1;
      private Internal.IntList codes_;
      private byte memoizedIsInitialized;
      private static final C2S_PetDecompose_12861 DEFAULT_INSTANCE = new C2S_PetDecompose_12861();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PetDecompose_12861> PARSER = new AbstractParser<C2S_PetDecompose_12861>() {
         public C2S_PetDecompose_12861 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PetDecompose_12861(input, extensionRegistry);
         }
      };

      private C2S_PetDecompose_12861(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PetDecompose_12861() {
         this.memoizedIsInitialized = -1;
         this.codes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PetDecompose_12861();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PetDecompose_12861(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.codes_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.codes_.addInt(input.readInt32());
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
                  this.codes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetDecompose_12861_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetDecompose_12861_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetDecompose_12861.class, Builder.class);
      }

      public List<Integer> getCodesList() {
         return this.codes_;
      }

      public int getCodesCount() {
         return this.codes_.size();
      }

      public int getCodes(int index) {
         return this.codes_.getInt(index);
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
         for(int i = 0; i < this.codes_.size(); ++i) {
            output.writeInt32(1, this.codes_.getInt(i));
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

            for(int i = 0; i < this.codes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.codes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCodesList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PetDecompose_12861)) {
            return super.equals(obj);
         } else {
            C2S_PetDecompose_12861 other = (C2S_PetDecompose_12861)obj;
            if (!this.getCodesList().equals(other.getCodesList())) {
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
            if (this.getCodesCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCodesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PetDecompose_12861 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PetDecompose_12861)PARSER.parseFrom(data);
      }

      public static C2S_PetDecompose_12861 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetDecompose_12861)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetDecompose_12861 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PetDecompose_12861)PARSER.parseFrom(data);
      }

      public static C2S_PetDecompose_12861 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetDecompose_12861)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetDecompose_12861 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PetDecompose_12861)PARSER.parseFrom(data);
      }

      public static C2S_PetDecompose_12861 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetDecompose_12861)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetDecompose_12861 parseFrom(InputStream input) throws IOException {
         return (C2S_PetDecompose_12861)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetDecompose_12861 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetDecompose_12861)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetDecompose_12861 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PetDecompose_12861)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PetDecompose_12861 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetDecompose_12861)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetDecompose_12861 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PetDecompose_12861)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetDecompose_12861 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetDecompose_12861)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PetDecompose_12861 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PetDecompose_12861 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PetDecompose_12861> parser() {
         return PARSER;
      }

      public Parser<C2S_PetDecompose_12861> getParserForType() {
         return PARSER;
      }

      public C2S_PetDecompose_12861 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PetDecompose_12861OrBuilder {
         private int bitField0_;
         private Internal.IntList codes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetDecompose_12861_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetDecompose_12861_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetDecompose_12861.class, Builder.class);
         }

         private Builder() {
            this.codes_ = PetMsg.C2S_PetDecompose_12861.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codes_ = PetMsg.C2S_PetDecompose_12861.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_PetDecompose_12861.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codes_ = PetMsg.C2S_PetDecompose_12861.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetDecompose_12861_descriptor;
         }

         public C2S_PetDecompose_12861 getDefaultInstanceForType() {
            return PetMsg.C2S_PetDecompose_12861.getDefaultInstance();
         }

         public C2S_PetDecompose_12861 build() {
            C2S_PetDecompose_12861 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PetDecompose_12861 buildPartial() {
            C2S_PetDecompose_12861 result = new C2S_PetDecompose_12861(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.codes_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.codes_ = this.codes_;
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
            if (other instanceof C2S_PetDecompose_12861) {
               return this.mergeFrom((C2S_PetDecompose_12861)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PetDecompose_12861 other) {
            if (other == PetMsg.C2S_PetDecompose_12861.getDefaultInstance()) {
               return this;
            } else {
               if (!other.codes_.isEmpty()) {
                  if (this.codes_.isEmpty()) {
                     this.codes_ = other.codes_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureCodesIsMutable();
                     this.codes_.addAll(other.codes_);
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
            C2S_PetDecompose_12861 parsedMessage = null;

            try {
               parsedMessage = (C2S_PetDecompose_12861)PetMsg.C2S_PetDecompose_12861.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PetDecompose_12861)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureCodesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.codes_ = PetMsg.C2S_PetDecompose_12861.mutableCopy(this.codes_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getCodesList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.codes_) : this.codes_);
         }

         public int getCodesCount() {
            return this.codes_.size();
         }

         public int getCodes(int index) {
            return this.codes_.getInt(index);
         }

         public Builder setCodes(int index, int value) {
            this.ensureCodesIsMutable();
            this.codes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCodes(int value) {
            this.ensureCodesIsMutable();
            this.codes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCodes(Iterable<? extends Integer> values) {
            this.ensureCodesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.codes_);
            this.onChanged();
            return this;
         }

         public Builder clearCodes() {
            this.codes_ = PetMsg.C2S_PetDecompose_12861.emptyIntList();
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

   public static final class S2C_PetDecompose_12862 extends GeneratedMessageV3 implements S2C_PetDecompose_12862OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int CODES_FIELD_NUMBER = 2;
      private Internal.IntList codes_;
      private byte memoizedIsInitialized;
      private static final S2C_PetDecompose_12862 DEFAULT_INSTANCE = new S2C_PetDecompose_12862();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PetDecompose_12862> PARSER = new AbstractParser<S2C_PetDecompose_12862>() {
         public S2C_PetDecompose_12862 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PetDecompose_12862(input, extensionRegistry);
         }
      };

      private S2C_PetDecompose_12862(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PetDecompose_12862() {
         this.memoizedIsInitialized = -1;
         this.codes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PetDecompose_12862();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PetDecompose_12862(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.codes_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.codes_.addInt(input.readInt32());
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
                  this.codes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetDecompose_12862_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetDecompose_12862_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetDecompose_12862.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public List<Integer> getCodesList() {
         return this.codes_;
      }

      public int getCodesCount() {
         return this.codes_.size();
      }

      public int getCodes(int index) {
         return this.codes_.getInt(index);
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

         for(int i = 0; i < this.codes_.size(); ++i) {
            output.writeInt32(2, this.codes_.getInt(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.codes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.codes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCodesList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PetDecompose_12862)) {
            return super.equals(obj);
         } else {
            S2C_PetDecompose_12862 other = (S2C_PetDecompose_12862)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (!this.getCodesList().equals(other.getCodesList())) {
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

            if (this.getCodesCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCodesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PetDecompose_12862 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PetDecompose_12862)PARSER.parseFrom(data);
      }

      public static S2C_PetDecompose_12862 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetDecompose_12862)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetDecompose_12862 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PetDecompose_12862)PARSER.parseFrom(data);
      }

      public static S2C_PetDecompose_12862 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetDecompose_12862)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetDecompose_12862 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PetDecompose_12862)PARSER.parseFrom(data);
      }

      public static S2C_PetDecompose_12862 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetDecompose_12862)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetDecompose_12862 parseFrom(InputStream input) throws IOException {
         return (S2C_PetDecompose_12862)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetDecompose_12862 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetDecompose_12862)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetDecompose_12862 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PetDecompose_12862)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PetDecompose_12862 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetDecompose_12862)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetDecompose_12862 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PetDecompose_12862)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetDecompose_12862 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetDecompose_12862)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PetDecompose_12862 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PetDecompose_12862 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PetDecompose_12862> parser() {
         return PARSER;
      }

      public Parser<S2C_PetDecompose_12862> getParserForType() {
         return PARSER;
      }

      public S2C_PetDecompose_12862 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PetDecompose_12862OrBuilder {
         private int bitField0_;
         private int result_;
         private Internal.IntList codes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetDecompose_12862_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetDecompose_12862_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetDecompose_12862.class, Builder.class);
         }

         private Builder() {
            this.codes_ = PetMsg.S2C_PetDecompose_12862.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codes_ = PetMsg.S2C_PetDecompose_12862.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_PetDecompose_12862.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.codes_ = PetMsg.S2C_PetDecompose_12862.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetDecompose_12862_descriptor;
         }

         public S2C_PetDecompose_12862 getDefaultInstanceForType() {
            return PetMsg.S2C_PetDecompose_12862.getDefaultInstance();
         }

         public S2C_PetDecompose_12862 build() {
            S2C_PetDecompose_12862 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PetDecompose_12862 buildPartial() {
            S2C_PetDecompose_12862 result = new S2C_PetDecompose_12862(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.codes_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.codes_ = this.codes_;
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
            if (other instanceof S2C_PetDecompose_12862) {
               return this.mergeFrom((S2C_PetDecompose_12862)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PetDecompose_12862 other) {
            if (other == PetMsg.S2C_PetDecompose_12862.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (!other.codes_.isEmpty()) {
                  if (this.codes_.isEmpty()) {
                     this.codes_ = other.codes_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureCodesIsMutable();
                     this.codes_.addAll(other.codes_);
                  }

                  this.onChanged();
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
            S2C_PetDecompose_12862 parsedMessage = null;

            try {
               parsedMessage = (S2C_PetDecompose_12862)PetMsg.S2C_PetDecompose_12862.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PetDecompose_12862)e.getUnfinishedMessage();
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

         private void ensureCodesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.codes_ = PetMsg.S2C_PetDecompose_12862.mutableCopy(this.codes_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getCodesList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.codes_) : this.codes_);
         }

         public int getCodesCount() {
            return this.codes_.size();
         }

         public int getCodes(int index) {
            return this.codes_.getInt(index);
         }

         public Builder setCodes(int index, int value) {
            this.ensureCodesIsMutable();
            this.codes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCodes(int value) {
            this.ensureCodesIsMutable();
            this.codes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCodes(Iterable<? extends Integer> values) {
            this.ensureCodesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.codes_);
            this.onChanged();
            return this;
         }

         public Builder clearCodes() {
            this.codes_ = PetMsg.S2C_PetDecompose_12862.emptyIntList();
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

   public static final class C2S_TakeDictionaryReward_12871 extends GeneratedMessageV3 implements C2S_TakeDictionaryReward_12871OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PETID_FIELD_NUMBER = 1;
      private Internal.IntList petId_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeDictionaryReward_12871 DEFAULT_INSTANCE = new C2S_TakeDictionaryReward_12871();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeDictionaryReward_12871> PARSER = new AbstractParser<C2S_TakeDictionaryReward_12871>() {
         public C2S_TakeDictionaryReward_12871 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeDictionaryReward_12871(input, extensionRegistry);
         }
      };

      private C2S_TakeDictionaryReward_12871(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeDictionaryReward_12871() {
         this.memoizedIsInitialized = -1;
         this.petId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeDictionaryReward_12871();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeDictionaryReward_12871(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.petId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.petId_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.petId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.petId_.addInt(input.readInt32());
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
                  this.petId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_TakeDictionaryReward_12871_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_TakeDictionaryReward_12871_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeDictionaryReward_12871.class, Builder.class);
      }

      public List<Integer> getPetIdList() {
         return this.petId_;
      }

      public int getPetIdCount() {
         return this.petId_.size();
      }

      public int getPetId(int index) {
         return this.petId_.getInt(index);
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
         for(int i = 0; i < this.petId_.size(); ++i) {
            output.writeInt32(1, this.petId_.getInt(i));
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

            for(int i = 0; i < this.petId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.petId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPetIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TakeDictionaryReward_12871)) {
            return super.equals(obj);
         } else {
            C2S_TakeDictionaryReward_12871 other = (C2S_TakeDictionaryReward_12871)obj;
            if (!this.getPetIdList().equals(other.getPetIdList())) {
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
            if (this.getPetIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPetIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TakeDictionaryReward_12871 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeDictionaryReward_12871)PARSER.parseFrom(data);
      }

      public static C2S_TakeDictionaryReward_12871 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeDictionaryReward_12871)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeDictionaryReward_12871 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeDictionaryReward_12871)PARSER.parseFrom(data);
      }

      public static C2S_TakeDictionaryReward_12871 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeDictionaryReward_12871)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeDictionaryReward_12871 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeDictionaryReward_12871)PARSER.parseFrom(data);
      }

      public static C2S_TakeDictionaryReward_12871 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeDictionaryReward_12871)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeDictionaryReward_12871 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeDictionaryReward_12871)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeDictionaryReward_12871 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeDictionaryReward_12871)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeDictionaryReward_12871 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeDictionaryReward_12871)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeDictionaryReward_12871 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeDictionaryReward_12871)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeDictionaryReward_12871 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeDictionaryReward_12871)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeDictionaryReward_12871 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeDictionaryReward_12871)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeDictionaryReward_12871 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeDictionaryReward_12871 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeDictionaryReward_12871> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeDictionaryReward_12871> getParserForType() {
         return PARSER;
      }

      public C2S_TakeDictionaryReward_12871 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeDictionaryReward_12871OrBuilder {
         private int bitField0_;
         private Internal.IntList petId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_TakeDictionaryReward_12871_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_TakeDictionaryReward_12871_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeDictionaryReward_12871.class, Builder.class);
         }

         private Builder() {
            this.petId_ = PetMsg.C2S_TakeDictionaryReward_12871.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.petId_ = PetMsg.C2S_TakeDictionaryReward_12871.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_TakeDictionaryReward_12871.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.petId_ = PetMsg.C2S_TakeDictionaryReward_12871.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_TakeDictionaryReward_12871_descriptor;
         }

         public C2S_TakeDictionaryReward_12871 getDefaultInstanceForType() {
            return PetMsg.C2S_TakeDictionaryReward_12871.getDefaultInstance();
         }

         public C2S_TakeDictionaryReward_12871 build() {
            C2S_TakeDictionaryReward_12871 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeDictionaryReward_12871 buildPartial() {
            C2S_TakeDictionaryReward_12871 result = new C2S_TakeDictionaryReward_12871(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.petId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.petId_ = this.petId_;
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
            if (other instanceof C2S_TakeDictionaryReward_12871) {
               return this.mergeFrom((C2S_TakeDictionaryReward_12871)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeDictionaryReward_12871 other) {
            if (other == PetMsg.C2S_TakeDictionaryReward_12871.getDefaultInstance()) {
               return this;
            } else {
               if (!other.petId_.isEmpty()) {
                  if (this.petId_.isEmpty()) {
                     this.petId_ = other.petId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensurePetIdIsMutable();
                     this.petId_.addAll(other.petId_);
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
            C2S_TakeDictionaryReward_12871 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeDictionaryReward_12871)PetMsg.C2S_TakeDictionaryReward_12871.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeDictionaryReward_12871)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePetIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.petId_ = PetMsg.C2S_TakeDictionaryReward_12871.mutableCopy(this.petId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getPetIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.petId_) : this.petId_);
         }

         public int getPetIdCount() {
            return this.petId_.size();
         }

         public int getPetId(int index) {
            return this.petId_.getInt(index);
         }

         public Builder setPetId(int index, int value) {
            this.ensurePetIdIsMutable();
            this.petId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPetId(int value) {
            this.ensurePetIdIsMutable();
            this.petId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPetId(Iterable<? extends Integer> values) {
            this.ensurePetIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.petId_);
            this.onChanged();
            return this;
         }

         public Builder clearPetId() {
            this.petId_ = PetMsg.C2S_TakeDictionaryReward_12871.emptyIntList();
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

   public static final class S2C_TakeDictionaryReward_12872 extends GeneratedMessageV3 implements S2C_TakeDictionaryReward_12872OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int INFO_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> info_;
      private byte memoizedIsInitialized;
      private static final S2C_TakeDictionaryReward_12872 DEFAULT_INSTANCE = new S2C_TakeDictionaryReward_12872();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakeDictionaryReward_12872> PARSER = new AbstractParser<S2C_TakeDictionaryReward_12872>() {
         public S2C_TakeDictionaryReward_12872 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakeDictionaryReward_12872(input, extensionRegistry);
         }
      };

      private S2C_TakeDictionaryReward_12872(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakeDictionaryReward_12872() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakeDictionaryReward_12872();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakeDictionaryReward_12872(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.info_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.info_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
                  this.info_ = Collections.unmodifiableList(this.info_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_TakeDictionaryReward_12872_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_TakeDictionaryReward_12872_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeDictionaryReward_12872.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public List<CommonMsg.MapDataII> getInfoList() {
         return this.info_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public CommonMsg.MapDataII getInfo(int index) {
         return (CommonMsg.MapDataII)this.info_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getInfoOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.info_.get(index);
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.result_);
         }

         for(int i = 0; i < this.info_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.info_.get(i));
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

            for(int i = 0; i < this.info_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.info_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TakeDictionaryReward_12872)) {
            return super.equals(obj);
         } else {
            S2C_TakeDictionaryReward_12872 other = (S2C_TakeDictionaryReward_12872)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (!this.getInfoList().equals(other.getInfoList())) {
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

            if (this.getInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TakeDictionaryReward_12872 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakeDictionaryReward_12872)PARSER.parseFrom(data);
      }

      public static S2C_TakeDictionaryReward_12872 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeDictionaryReward_12872)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeDictionaryReward_12872 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakeDictionaryReward_12872)PARSER.parseFrom(data);
      }

      public static S2C_TakeDictionaryReward_12872 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeDictionaryReward_12872)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeDictionaryReward_12872 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakeDictionaryReward_12872)PARSER.parseFrom(data);
      }

      public static S2C_TakeDictionaryReward_12872 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeDictionaryReward_12872)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeDictionaryReward_12872 parseFrom(InputStream input) throws IOException {
         return (S2C_TakeDictionaryReward_12872)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeDictionaryReward_12872 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeDictionaryReward_12872)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeDictionaryReward_12872 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakeDictionaryReward_12872)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakeDictionaryReward_12872 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeDictionaryReward_12872)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeDictionaryReward_12872 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakeDictionaryReward_12872)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeDictionaryReward_12872 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeDictionaryReward_12872)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakeDictionaryReward_12872 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakeDictionaryReward_12872 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakeDictionaryReward_12872> parser() {
         return PARSER;
      }

      public Parser<S2C_TakeDictionaryReward_12872> getParserForType() {
         return PARSER;
      }

      public S2C_TakeDictionaryReward_12872 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakeDictionaryReward_12872OrBuilder {
         private int bitField0_;
         private int result_;
         private List<CommonMsg.MapDataII> info_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_TakeDictionaryReward_12872_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_TakeDictionaryReward_12872_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeDictionaryReward_12872.class, Builder.class);
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
            if (PetMsg.S2C_TakeDictionaryReward_12872.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_TakeDictionaryReward_12872_descriptor;
         }

         public S2C_TakeDictionaryReward_12872 getDefaultInstanceForType() {
            return PetMsg.S2C_TakeDictionaryReward_12872.getDefaultInstance();
         }

         public S2C_TakeDictionaryReward_12872 build() {
            S2C_TakeDictionaryReward_12872 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakeDictionaryReward_12872 buildPartial() {
            S2C_TakeDictionaryReward_12872 result = new S2C_TakeDictionaryReward_12872(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -3;
               }

               result.info_ = this.info_;
            } else {
               result.info_ = this.infoBuilder_.build();
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
            if (other instanceof S2C_TakeDictionaryReward_12872) {
               return this.mergeFrom((S2C_TakeDictionaryReward_12872)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakeDictionaryReward_12872 other) {
            if (other == PetMsg.S2C_TakeDictionaryReward_12872.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (this.infoBuilder_ == null) {
                  if (!other.info_.isEmpty()) {
                     if (this.info_.isEmpty()) {
                        this.info_ = other.info_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.infoBuilder_ = PetMsg.S2C_TakeDictionaryReward_12872.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
                  } else {
                     this.infoBuilder_.addAllMessages(other.info_);
                  }
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
               for(int i = 0; i < this.getInfoCount(); ++i) {
                  if (!this.getInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TakeDictionaryReward_12872 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakeDictionaryReward_12872)PetMsg.S2C_TakeDictionaryReward_12872.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakeDictionaryReward_12872)e.getUnfinishedMessage();
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

         private void ensureInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.info_ = new ArrayList(this.info_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.MapDataII> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public CommonMsg.MapDataII getInfo(int index) {
            return this.infoBuilder_ == null ? (CommonMsg.MapDataII)this.info_.get(index) : (CommonMsg.MapDataII)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, CommonMsg.MapDataII value) {
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

         public Builder setInfo(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(CommonMsg.MapDataII value) {
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

         public Builder addInfo(int index, CommonMsg.MapDataII value) {
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

         public Builder addInfo(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends CommonMsg.MapDataII> values) {
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
               this.bitField0_ &= -3;
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

         public CommonMsg.MapDataII.Builder getInfoBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.info_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public CommonMsg.MapDataII.Builder addInfoBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getInfoFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addInfoBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getInfoFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_UpdateDictionary_12873 extends GeneratedMessageV3 implements C2S_UpdateDictionary_12873OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_UpdateDictionary_12873 DEFAULT_INSTANCE = new C2S_UpdateDictionary_12873();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UpdateDictionary_12873> PARSER = new AbstractParser<C2S_UpdateDictionary_12873>() {
         public C2S_UpdateDictionary_12873 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UpdateDictionary_12873(input, extensionRegistry);
         }
      };

      private C2S_UpdateDictionary_12873(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UpdateDictionary_12873() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UpdateDictionary_12873();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UpdateDictionary_12873(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_UpdateDictionary_12873_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_UpdateDictionary_12873_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpdateDictionary_12873.class, Builder.class);
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
         } else if (!(obj instanceof C2S_UpdateDictionary_12873)) {
            return super.equals(obj);
         } else {
            C2S_UpdateDictionary_12873 other = (C2S_UpdateDictionary_12873)obj;
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

      public static C2S_UpdateDictionary_12873 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UpdateDictionary_12873)PARSER.parseFrom(data);
      }

      public static C2S_UpdateDictionary_12873 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpdateDictionary_12873)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpdateDictionary_12873 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UpdateDictionary_12873)PARSER.parseFrom(data);
      }

      public static C2S_UpdateDictionary_12873 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpdateDictionary_12873)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpdateDictionary_12873 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UpdateDictionary_12873)PARSER.parseFrom(data);
      }

      public static C2S_UpdateDictionary_12873 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpdateDictionary_12873)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpdateDictionary_12873 parseFrom(InputStream input) throws IOException {
         return (C2S_UpdateDictionary_12873)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpdateDictionary_12873 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpdateDictionary_12873)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpdateDictionary_12873 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UpdateDictionary_12873)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UpdateDictionary_12873 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpdateDictionary_12873)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpdateDictionary_12873 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UpdateDictionary_12873)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpdateDictionary_12873 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpdateDictionary_12873)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UpdateDictionary_12873 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UpdateDictionary_12873 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UpdateDictionary_12873> parser() {
         return PARSER;
      }

      public Parser<C2S_UpdateDictionary_12873> getParserForType() {
         return PARSER;
      }

      public C2S_UpdateDictionary_12873 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UpdateDictionary_12873OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_UpdateDictionary_12873_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_UpdateDictionary_12873_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpdateDictionary_12873.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_UpdateDictionary_12873.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_UpdateDictionary_12873_descriptor;
         }

         public C2S_UpdateDictionary_12873 getDefaultInstanceForType() {
            return PetMsg.C2S_UpdateDictionary_12873.getDefaultInstance();
         }

         public C2S_UpdateDictionary_12873 build() {
            C2S_UpdateDictionary_12873 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UpdateDictionary_12873 buildPartial() {
            C2S_UpdateDictionary_12873 result = new C2S_UpdateDictionary_12873(this);
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
            if (other instanceof C2S_UpdateDictionary_12873) {
               return this.mergeFrom((C2S_UpdateDictionary_12873)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UpdateDictionary_12873 other) {
            if (other == PetMsg.C2S_UpdateDictionary_12873.getDefaultInstance()) {
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
            C2S_UpdateDictionary_12873 parsedMessage = null;

            try {
               parsedMessage = (C2S_UpdateDictionary_12873)PetMsg.C2S_UpdateDictionary_12873.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UpdateDictionary_12873)e.getUnfinishedMessage();
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

   public static final class S2C_UpdateDictionary_12874 extends GeneratedMessageV3 implements S2C_UpdateDictionary_12874OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> info_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateDictionary_12874 DEFAULT_INSTANCE = new S2C_UpdateDictionary_12874();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateDictionary_12874> PARSER = new AbstractParser<S2C_UpdateDictionary_12874>() {
         public S2C_UpdateDictionary_12874 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateDictionary_12874(input, extensionRegistry);
         }
      };

      private S2C_UpdateDictionary_12874(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateDictionary_12874() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateDictionary_12874();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateDictionary_12874(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.info_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_UpdateDictionary_12874_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_UpdateDictionary_12874_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateDictionary_12874.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getInfoList() {
         return this.info_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public CommonMsg.MapDataII getInfo(int index) {
         return (CommonMsg.MapDataII)this.info_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getInfoOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.info_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateDictionary_12874)) {
            return super.equals(obj);
         } else {
            S2C_UpdateDictionary_12874 other = (S2C_UpdateDictionary_12874)obj;
            if (!this.getInfoList().equals(other.getInfoList())) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateDictionary_12874 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateDictionary_12874)PARSER.parseFrom(data);
      }

      public static S2C_UpdateDictionary_12874 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateDictionary_12874)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateDictionary_12874 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateDictionary_12874)PARSER.parseFrom(data);
      }

      public static S2C_UpdateDictionary_12874 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateDictionary_12874)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateDictionary_12874 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateDictionary_12874)PARSER.parseFrom(data);
      }

      public static S2C_UpdateDictionary_12874 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateDictionary_12874)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateDictionary_12874 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateDictionary_12874)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateDictionary_12874 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateDictionary_12874)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateDictionary_12874 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateDictionary_12874)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateDictionary_12874 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateDictionary_12874)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateDictionary_12874 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateDictionary_12874)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateDictionary_12874 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateDictionary_12874)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateDictionary_12874 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateDictionary_12874 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateDictionary_12874> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateDictionary_12874> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateDictionary_12874 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateDictionary_12874OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> info_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_UpdateDictionary_12874_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_UpdateDictionary_12874_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateDictionary_12874.class, Builder.class);
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
            if (PetMsg.S2C_UpdateDictionary_12874.alwaysUseFieldBuilders) {
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

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_UpdateDictionary_12874_descriptor;
         }

         public S2C_UpdateDictionary_12874 getDefaultInstanceForType() {
            return PetMsg.S2C_UpdateDictionary_12874.getDefaultInstance();
         }

         public S2C_UpdateDictionary_12874 build() {
            S2C_UpdateDictionary_12874 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateDictionary_12874 buildPartial() {
            S2C_UpdateDictionary_12874 result = new S2C_UpdateDictionary_12874(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -2;
               }

               result.info_ = this.info_;
            } else {
               result.info_ = this.infoBuilder_.build();
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
            if (other instanceof S2C_UpdateDictionary_12874) {
               return this.mergeFrom((S2C_UpdateDictionary_12874)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateDictionary_12874 other) {
            if (other == PetMsg.S2C_UpdateDictionary_12874.getDefaultInstance()) {
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
                     this.infoBuilder_ = PetMsg.S2C_UpdateDictionary_12874.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
                  } else {
                     this.infoBuilder_.addAllMessages(other.info_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getInfoCount(); ++i) {
               if (!this.getInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateDictionary_12874 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateDictionary_12874)PetMsg.S2C_UpdateDictionary_12874.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateDictionary_12874)e.getUnfinishedMessage();
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

         public List<CommonMsg.MapDataII> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public CommonMsg.MapDataII getInfo(int index) {
            return this.infoBuilder_ == null ? (CommonMsg.MapDataII)this.info_.get(index) : (CommonMsg.MapDataII)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, CommonMsg.MapDataII value) {
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

         public Builder setInfo(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(CommonMsg.MapDataII value) {
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

         public Builder addInfo(int index, CommonMsg.MapDataII value) {
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

         public Builder addInfo(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends CommonMsg.MapDataII> values) {
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

         public CommonMsg.MapDataII.Builder getInfoBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.info_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public CommonMsg.MapDataII.Builder addInfoBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getInfoFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addInfoBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getInfoFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_PetLock_12875 extends GeneratedMessageV3 implements C2S_PetLock_12875OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_PetLock_12875 DEFAULT_INSTANCE = new C2S_PetLock_12875();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PetLock_12875> PARSER = new AbstractParser<C2S_PetLock_12875>() {
         public C2S_PetLock_12875 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PetLock_12875(input, extensionRegistry);
         }
      };

      private C2S_PetLock_12875(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PetLock_12875() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PetLock_12875();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PetLock_12875(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetLock_12875_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetLock_12875_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetLock_12875.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
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
         } else if (!this.hasCode()) {
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
            output.writeInt32(1, this.code_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
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
         } else if (!(obj instanceof C2S_PetLock_12875)) {
            return super.equals(obj);
         } else {
            C2S_PetLock_12875 other = (C2S_PetLock_12875)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
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

      public static C2S_PetLock_12875 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PetLock_12875)PARSER.parseFrom(data);
      }

      public static C2S_PetLock_12875 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetLock_12875)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetLock_12875 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PetLock_12875)PARSER.parseFrom(data);
      }

      public static C2S_PetLock_12875 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetLock_12875)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetLock_12875 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PetLock_12875)PARSER.parseFrom(data);
      }

      public static C2S_PetLock_12875 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PetLock_12875)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PetLock_12875 parseFrom(InputStream input) throws IOException {
         return (C2S_PetLock_12875)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetLock_12875 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetLock_12875)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetLock_12875 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PetLock_12875)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PetLock_12875 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetLock_12875)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PetLock_12875 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PetLock_12875)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PetLock_12875 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PetLock_12875)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PetLock_12875 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PetLock_12875 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PetLock_12875> parser() {
         return PARSER;
      }

      public Parser<C2S_PetLock_12875> getParserForType() {
         return PARSER;
      }

      public C2S_PetLock_12875 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PetLock_12875OrBuilder {
         private int bitField0_;
         private int code_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetLock_12875_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetLock_12875_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PetLock_12875.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.C2S_PetLock_12875.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_C2S_PetLock_12875_descriptor;
         }

         public C2S_PetLock_12875 getDefaultInstanceForType() {
            return PetMsg.C2S_PetLock_12875.getDefaultInstance();
         }

         public C2S_PetLock_12875 build() {
            C2S_PetLock_12875 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PetLock_12875 buildPartial() {
            C2S_PetLock_12875 result = new C2S_PetLock_12875(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof C2S_PetLock_12875) {
               return this.mergeFrom((C2S_PetLock_12875)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PetLock_12875 other) {
            if (other == PetMsg.C2S_PetLock_12875.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PetLock_12875 parsedMessage = null;

            try {
               parsedMessage = (C2S_PetLock_12875)PetMsg.C2S_PetLock_12875.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PetLock_12875)e.getUnfinishedMessage();
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

   public static final class S2C_PetLock_12876 extends GeneratedMessageV3 implements S2C_PetLock_12876OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int TYPE_FIELD_NUMBER = 3;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2C_PetLock_12876 DEFAULT_INSTANCE = new S2C_PetLock_12876();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PetLock_12876> PARSER = new AbstractParser<S2C_PetLock_12876>() {
         public S2C_PetLock_12876 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PetLock_12876(input, extensionRegistry);
         }
      };

      private S2C_PetLock_12876(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PetLock_12876() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PetLock_12876();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PetLock_12876(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
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
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetLock_12876_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetLock_12876_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetLock_12876.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCode()) {
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.code_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.type_);
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
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PetLock_12876)) {
            return super.equals(obj);
         } else {
            S2C_PetLock_12876 other = (S2C_PetLock_12876)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasType()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PetLock_12876 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PetLock_12876)PARSER.parseFrom(data);
      }

      public static S2C_PetLock_12876 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetLock_12876)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetLock_12876 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PetLock_12876)PARSER.parseFrom(data);
      }

      public static S2C_PetLock_12876 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetLock_12876)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetLock_12876 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PetLock_12876)PARSER.parseFrom(data);
      }

      public static S2C_PetLock_12876 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PetLock_12876)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PetLock_12876 parseFrom(InputStream input) throws IOException {
         return (S2C_PetLock_12876)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetLock_12876 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetLock_12876)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetLock_12876 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PetLock_12876)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PetLock_12876 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetLock_12876)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PetLock_12876 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PetLock_12876)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PetLock_12876 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PetLock_12876)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PetLock_12876 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PetLock_12876 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PetLock_12876> parser() {
         return PARSER;
      }

      public Parser<S2C_PetLock_12876> getParserForType() {
         return PARSER;
      }

      public S2C_PetLock_12876 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PetLock_12876OrBuilder {
         private int bitField0_;
         private int result_;
         private int code_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetLock_12876_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetLock_12876_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PetLock_12876.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PetMsg.S2C_PetLock_12876.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            this.type_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PetMsg.internal_static_pet_com_gzbz_protobuf_S2C_PetLock_12876_descriptor;
         }

         public S2C_PetLock_12876 getDefaultInstanceForType() {
            return PetMsg.S2C_PetLock_12876.getDefaultInstance();
         }

         public S2C_PetLock_12876 build() {
            S2C_PetLock_12876 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PetLock_12876 buildPartial() {
            S2C_PetLock_12876 result = new S2C_PetLock_12876(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof S2C_PetLock_12876) {
               return this.mergeFrom((S2C_PetLock_12876)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PetLock_12876 other) {
            if (other == PetMsg.S2C_PetLock_12876.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else {
               return this.hasType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PetLock_12876 parsedMessage = null;

            try {
               parsedMessage = (S2C_PetLock_12876)PetMsg.S2C_PetLock_12876.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PetLock_12876)e.getUnfinishedMessage();
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

         public boolean hasType() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 4;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -5;
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

   public interface C2S_BuyBagLattice_12803OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_HatchAccelerate_12851OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      int getPosition();
   }

   public interface C2S_HatchOpen_12847OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      int getPosition();
   }

   public interface C2S_HatchUi_12841OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Hatch_12843OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      int getPosition();

      boolean hasEggId();

      int getEggId();
   }

   public interface C2S_LeanSkill_12819OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasItemCode();

      int getItemCode();
   }

   public interface C2S_OneKeyHatchAccelerate_12853OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PetArrayingSkill_12807OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getSkillIndexList();

      CommonMsg.MapDataII getSkillIndex(int index);

      int getSkillIndexCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getSkillIndexOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getSkillIndexOrBuilder(int index);
   }

   public interface C2S_PetArraying_12805OrBuilder extends MessageOrBuilder {
      List<PetDaoArrayingInfo> getInfoList();

      PetDaoArrayingInfo getInfo(int index);

      int getInfoCount();

      List<? extends PetDaoArrayingInfoOrBuilder> getInfoOrBuilderList();

      PetDaoArrayingInfoOrBuilder getInfoOrBuilder(int index);
   }

   public interface C2S_PetDecompose_12861OrBuilder extends MessageOrBuilder {
      List<Integer> getCodesList();

      int getCodesCount();

      int getCodes(int index);
   }

   public interface C2S_PetFly_12815OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      List<String> getInfosList();

      int getInfosCount();

      String getInfos(int index);

      ByteString getInfosBytes(int index);
   }

   public interface C2S_PetLock_12875OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasType();

      int getType();
   }

   public interface C2S_PetMerge_12817OrBuilder extends MessageOrBuilder {
      boolean hasMainCode();

      int getMainCode();

      boolean hasSlaveCode();

      int getSlaveCode();
   }

   public interface C2S_PetOpenUi_12801OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PetUpLv_12811OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface C2S_PetUpStar_12813OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface C2S_TakeDictionaryReward_12871OrBuilder extends MessageOrBuilder {
      List<Integer> getPetIdList();

      int getPetIdCount();

      int getPetId(int index);
   }

   public interface C2S_TakeHatchReward_12849OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_TransferGroup_12821OrBuilder extends MessageOrBuilder {
      boolean hasMainCode();

      int getMainCode();

      boolean hasSlaveCode();

      int getSlaveCode();
   }

   public interface C2S_UpdateDictionary_12873OrBuilder extends MessageOrBuilder {
   }

   public interface HatchSoltInfoOrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      int getPosition();

      boolean hasEggId();

      int getEggId();

      boolean hasNeedTime();

      int getNeedTime();

      boolean hasStartTime();

      int getStartTime();
   }

   public interface PetDaoArrayingInfoOrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasIndex();

      int getIndex();

      boolean hasSkillIndex();

      int getSkillIndex();
   }

   public interface S2C_BuyBagLattice_12804OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasBuyNum();

      int getBuyNum();

      boolean hasBagNum();

      int getBagNum();
   }

   public interface S2C_HatchLvUp_12846OrBuilder extends MessageOrBuilder {
      boolean hasLv();

      int getLv();

      boolean hasExp();

      int getExp();
   }

   public interface S2C_HatchOpen_12848OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasInfo();

      HatchSoltInfo getInfo();

      HatchSoltInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_HatchUi_12842OrBuilder extends MessageOrBuilder {
      boolean hasHatchLv();

      int getHatchLv();

      boolean hasHatchExp();

      int getHatchExp();

      List<HatchSoltInfo> getHatchInfosList();

      HatchSoltInfo getHatchInfos(int index);

      int getHatchInfosCount();

      List<? extends HatchSoltInfoOrBuilder> getHatchInfosOrBuilderList();

      HatchSoltInfoOrBuilder getHatchInfosOrBuilder(int index);
   }

   public interface S2C_Hatch_12844OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasInfo();

      HatchSoltInfo getInfo();

      HatchSoltInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_LeanSkill_12820OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasCode();

      int getCode();
   }

   public interface S2C_OneKeyHatchAccelerate_12854OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      List<HatchSoltInfo> getInfosList();

      HatchSoltInfo getInfos(int index);

      int getInfosCount();

      List<? extends HatchSoltInfoOrBuilder> getInfosOrBuilderList();

      HatchSoltInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_PetArrayingSkill_12808OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_PetArraying_12806OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_PetDecompose_12862OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      List<Integer> getCodesList();

      int getCodesCount();

      int getCodes(int index);
   }

   public interface S2C_PetFly_12816OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasCode();

      int getCode();

      boolean hasBreach();

      int getBreach();
   }

   public interface S2C_PetLock_12876OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasCode();

      int getCode();

      boolean hasType();

      int getType();
   }

   public interface S2C_PetMerge_12818OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasMainCode();

      int getMainCode();

      boolean hasSlaveCode();

      int getSlaveCode();

      List<Integer> getMainSkillIndexList();

      int getMainSkillIndexCount();

      int getMainSkillIndex(int index);

      List<Integer> getSlaveSkillIndexList();

      int getSlaveSkillIndexCount();

      int getSlaveSkillIndex(int index);
   }

   public interface S2C_PetOpenUi_12802OrBuilder extends MessageOrBuilder {
      boolean hasHatchLv();

      int getHatchLv();

      boolean hasHatchExp();

      int getHatchExp();

      List<PetDaoArrayingInfo> getInfosList();

      PetDaoArrayingInfo getInfos(int index);

      int getInfosCount();

      List<? extends PetDaoArrayingInfoOrBuilder> getInfosOrBuilderList();

      PetDaoArrayingInfoOrBuilder getInfosOrBuilder(int index);

      List<HatchSoltInfo> getHatchInfosList();

      HatchSoltInfo getHatchInfos(int index);

      int getHatchInfosCount();

      List<? extends HatchSoltInfoOrBuilder> getHatchInfosOrBuilderList();

      HatchSoltInfoOrBuilder getHatchInfosOrBuilder(int index);

      List<CommonMsg.MapDataII> getDictionaryMapList();

      CommonMsg.MapDataII getDictionaryMap(int index);

      int getDictionaryMapCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getDictionaryMapOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getDictionaryMapOrBuilder(int index);

      List<Integer> getTakedRewardIdList();

      int getTakedRewardIdCount();

      int getTakedRewardId(int index);
   }

   public interface S2C_PetUpLv_12812OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasCode();

      int getCode();

      boolean hasLv();

      int getLv();
   }

   public interface S2C_PetUpStar_12814OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasCode();

      int getCode();

      boolean hasStar();

      int getStar();
   }

   public interface S2C_TakeDictionaryReward_12872OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      List<CommonMsg.MapDataII> getInfoList();

      CommonMsg.MapDataII getInfo(int index);

      int getInfoCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getInfoOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getInfoOrBuilder(int index);
   }

   public interface S2C_TakeHatchReward_12850OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      List<Integer> getTakedRewardIdList();

      int getTakedRewardIdCount();

      int getTakedRewardId(int index);
   }

   public interface S2C_TransferGroup_12822OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasMainCode();

      int getMainCode();

      boolean hasSlaveCode();

      int getSlaveCode();
   }

   public interface S2C_UpdateArrayingInfo_12809OrBuilder extends MessageOrBuilder {
      List<PetDaoArrayingInfo> getInfosList();

      PetDaoArrayingInfo getInfos(int index);

      int getInfosCount();

      List<? extends PetDaoArrayingInfoOrBuilder> getInfosOrBuilderList();

      PetDaoArrayingInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_UpdateDictionary_12874OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getInfoList();

      CommonMsg.MapDataII getInfo(int index);

      int getInfoCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getInfoOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getInfoOrBuilder(int index);
   }
}
